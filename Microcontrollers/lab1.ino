// обычное меню. С кнопкой закрыть (для примера)

#define WIFI_SSID "onlime"
#define WIFI_PASS "veh39her"
#define BOT_TOKEN "7045083179:AAEJrp9AyaEu7BycZ5_LphGwCmru3zrUrSA"
#define CHAT_ID "592700035"

#define BLU D2 
#define GRN D4
#define RED D7 

#include <FastBot.h>
FastBot bot(BOT_TOKEN);

void setup() {
  // RGD светодиод 
  pinMode(RED, OUTPUT);  
  pinMode(GRN, OUTPUT); 
  pinMode(BLU, OUTPUT);

  connectWiFi();
  bot.setChatID(CHAT_ID);

  // подключаем функцию-обработчик
  bot.attach(newMsg);

  bot.showMenu("GREEN \t RED \t BLUE \n Close");
}

// обработчик сообщений
void newMsg(FB_msg& msg) {

  if (msg.text == "Close") bot.closeMenu();

  if (msg.text == "RED") {
    Serial.println(msg.text);

    digitalWrite(RED, HIGH); 
    digitalWrite(GRN, LOW);
    digitalWrite(BLU, LOW);

    bot.sendMessage("RED ON!", msg.chatID);  
  } 

  if (msg.text == "GREEN") {
    Serial.println(msg.text);

    digitalWrite(RED, LOW); 
    digitalWrite(GRN, HIGH);
    digitalWrite(BLU, LOW);

    bot.sendMessage("GREEN ON!", msg.chatID);  
  } 

  if (msg.text == "BLUE") {
    Serial.println(msg.text);

    digitalWrite(RED, LOW); 
    digitalWrite(GRN, LOW);
    digitalWrite(BLU, HIGH);

    bot.sendMessage("BLUE ON!", msg.chatID);  
  }

}

void loop() {
  bot.tick();   // тикаем в луп
}

void connectWiFi() {
  delay(2000);
  Serial.begin(115200);
  Serial.println();

  WiFi.begin(WIFI_SSID, WIFI_PASS);
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
    if (millis() > 15000) ESP.restart();
  }
  Serial.println("Connected");
}
