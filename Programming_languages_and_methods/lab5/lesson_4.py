# -*- coding: utf-8 -*-
"""lesson_4.ipynb

Automatically generated by Colab.

Original file is located at
    https://colab.research.google.com/drive/1I2jfz7fABSYvQPf0_SI-hxvBQp4nB8_U
"""

class Summator(object):

  def __init__(self):
    self.acc = 0

  def get_acc(self):
    return self.acc

  def set_acc(self, n):
    self.acc = n
    return self.acc

  def add(self, n):
    self.acc += n
    return self.acc

  def show(self):
    print(" ", self.acc)


class Multiplier(object):

  def __init__(self):
    self.acc = 1

  def get_acc(self):
    return self.acc

  def set_acc(self, n):
    self.acc = n
    return self.acc

  def multi(self, n):
    self.acc *= n
    return self.acc

  def show(self):
    print(" ", self.acc)


# test
test_m = Multiplier()
result_array = [test_m.multi(3) for _ in range(3)]
print(result_array)


# Вычисление суммы
s = Summator() # Локальные вычисления
m = Multiplier()

s_k = Summator() # Результат
n = int(input("n = "))

def numerator(k: int):
  s.set_acc(k) # k = 1, ..., n
  m.set_acc(k) # k = 1, ..., n
  return m.multi(s.add(1)) # k * (k + 1)

def denominator(k: int):
  return 2 ** k

for k in range(1, n+1):
  s_k.add(numerator(k)/denominator(k))

s_k.show()