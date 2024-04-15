package com.cpc.converter;

import com.cpc.dto.AwbNo;

public class AwbNoParamConverter  implements jakarta.ws.rs.ext.ParamConverter<AwbNo>{

	@Override
	public AwbNo  fromString(String value) {
		AwbNo awbNo=new AwbNo();
		awbNo.setCityCode(value.substring(0, 3));
		awbNo.setBranchCode(value.substring(3, 6));
		awbNo.setDestinationBranchCode(value.substring(6, 9));
		awbNo.setBookedDate(Integer.parseInt(value.substring(9, 11)));
		awbNo.setSerialNo(Integer.parseInt(value.substring(11, 15)));
		return awbNo;
	}

	@Override
	public String toString(AwbNo value) {
		
		return value.toString();
	}

}
