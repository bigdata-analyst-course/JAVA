자동 타입 변환
    범위가 더 작은 변수는 상위 변수에 자동으로 형변환 된다

강제 타입 변환
    작은 타입 = (작은 타입) 큰 타입;
    큰 타입은 작은 타입의 범위에 맞추는 것이 필요함

    ----신은빈----
    
변수란: 하나의 값을 저장할 수 있는 메모리 공간으로 이는 선언된 블록 내에서만 사용 가능하다. 

데이터 타입: 

값의 종류	기본 타입	메모리 사용 크기
정수	byte	1 byte
	char	2 byte
	short	2 byte
	int	4 byte
	long 	8 byte
실수	float	4 byte
	double	8 byte
논리		boolean	1 byte

타입 변환
	강제 타입 변환: 큰 크기의 타입은 작은 크기의 타입으로 자동 타입 변환할 수 없다. 
		작은 크기 타입 = (작은 크기 타입) 큰 크기 타입 
		byte byteValue = (byte) intValue; 
	
연산식 자동 타입 변환: 서로 다른 타입의 피연산자가 있을 경우 두 피연산자 중 크기가 큰 타입으로 자동 변환된 후 연산 수행 
		Double result = intValue (double 값으로 변환) + doubleValue 
        
    ----원지영----        
