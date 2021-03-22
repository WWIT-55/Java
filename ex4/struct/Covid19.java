package ex4.struct;

public class Covid19 {
	//2차원 배열을 1차원배열로 만들기 위해서 covid19를 만듦.
	String date; //기준일자
	int cases; //제주 확진자
	int deaths; //제주 사망자
	int test;//제주 검사진행자수
	int selfQuarantine;//자가격리중/중간에 대문자를써줘서 문자를 구분해주는것 = Camel 표기
	int release;//자가격리 해제
	int recover;//완치 (격리해제)
	int selfQuarantineDoestic;//자가격리(확진자 접촉)
	int selfQuarantineImported;//자가격리 (해외입국)
	String pubDate; //데이터기준일자
	
	
}
