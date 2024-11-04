def checkValidIpAddress(ipAddress: str) -> str:
    IpAddressBytes = ipAddress.split(".")
    countRightIpAddressBytes = 0 
    countBytesIpAddress = len(IpAddressBytes)
    for ipAddressBytes in IpAddressBytes: 
        if ipAddressBytes == '': 
            return 'NO'
        if int(ipAddressBytes) >= 0 and int(ipAddressBytes) <= 255: 
            countRightIpAddressBytes += 1
    if countRightIpAddressBytes == 4 and countBytesIpAddress == 4: 
        return 'Yes'
    return 'NO'
    
if __name__ == '__main__':
    testCheckValidIpAddress = [
        '127.0.0.1', '255.0.0.1', 
        '256.0.9.1', '0.0.0.0', 
        '2222.0.0.', '1.1.1.1', 
        ] 
    for testIpAddress in testCheckValidIpAddress: 
        print("{ipAddress}.{checkResult}".format(
            ipAddress=testIpAddress, 
            checkResult=checkValidIpAddress(testIpAddress)))