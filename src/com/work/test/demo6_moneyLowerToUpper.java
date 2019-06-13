package com.work.test;

import org.junit.Test;

public class demo6_moneyLowerToUpper {
	
	private static final char [] ChineseNum ={'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};  
	private static final char [] ChineseUnit={'里','分','角','元','拾','佰','仟','万','拾','佰','仟','亿','拾','佰','仟'};  
	
	
	private static String arabNumToChineseRMB(String moneyNum) throws Exception{  
	    String res="";  
	    int i=3;  
	    int len=moneyNum.length();  
	    if(len>12){  
	        throw new Exception("Number too large!");  
	    }  
	    if("0".equals(moneyNum))  
	        return "零元";  
	    //System.out.println(moneyNum);  
	    for(len--;len>=0;len--){  
	        res=ChineseUnit[i++]+res;  
	        int num=Integer.parseInt(moneyNum.charAt(len)+"");  
	        res=ChineseNum[num]+res;  
	    }  
	    return res.replaceAll("零[拾佰仟]", "零")  
	            .replaceAll("零+亿", "亿").replaceAll("零+万", "万")  
	            .replaceAll("零+元", "元").replaceAll("零+", "零");  
	              
	}  
	
	
	public static String arabNumToChineseRMB(double moneyNum) throws Exception{  
	    String res="";  
	    String money=String.format("%.3f",moneyNum);  
	    //System.out.println(money);  
	    int i=0;  
	    if(moneyNum==0.0)  
	        return "零元";  
	    String inte = money.split("\\.")[0];  
	    int deci=Integer.parseInt(money.split("\\.")[1].substring(0, 3));  
	    while(deci>0){  
	        res=ChineseUnit[i++]+res;  
	        res=ChineseNum[deci%10]+res;  
	        deci/=10;  
	    }  
	    res=res.replaceAll("零[里分角]", "零");  
	    if(i<3)  
	        res="零"+res;  
	    res=res.replaceAll("零+", "零");  
	    if(res.endsWith("零"))  
	        res=res.substring(0, res.length()-1);  
	    return arabNumToChineseRMB(inte)+res;  
	}  
	
	@Test
	public void test1() throws Exception{
		double moneyNum = 20001123.45;
		String rmb = arabNumToChineseRMB(moneyNum);
		System.out.println(rmb);
		
	}
	
	
	@Test
	public void test2() throws Exception{
		double moneyNum = 12.00;
		String rmb = arabNumToChineseRMB(moneyNum)+"整";
		System.out.println(rmb);
		
	}
	
	

}
