package br.com.next.Adesao.tests;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import br.com.next.Adesao.core.BaseTest;
import br.com.next.Adesao.core.CpfGeneretad;

public class ValidarCriacaoAdesaoTests extends BaseTest{
	
	private static String cpf;
	private static String getDeviceId;
	private static String deviceSignature = "{\"deviceSignature\":{\"collector\":\"Android\",\"collectorVersion\":\"8.2.2\",\"system\":{\"platform\":\"Android23\",\"androidId\":\"dee820dffff3bd2f\",\"osVersion\":\"6.0.1\",\"deviceName\":\"C103\",\"model\":\"C103\",\"board\":\"c1\",\"brand\":\"Coolpad\",\"host\":\"pcnbj-cp063\",\"id\":\"ZIXOSOP5801803011S\",\"type\":\"user\",\"user\":\"letv\",\"cpuAbi\":\"arm64-v8a\",\"cpuAbi2\":null,\"hardware\":\"qcom\",\"manufacturer\":\"Coolpad\",\"serial\":\"db318f5\",\"tags\":\"release-keys\",\"locale\":\"portuguÃªs (Brasil)\",\"radio\":\"C10_201702281858-10.140.35.30 \",\"processName\":\"br.com.bradesco.next\",\"systemName\":\"Android OS\",\"jailBroken\":false,\"timeZone\":\"America/Belem\",\"debuggerAttached\":false,\"totalDiskSpace\":\"24056\",\"totalMemory\":3607,\"numberOfProcessors\":8},\"screen\":{\"displayId\":\"ZIXOSOP5801803011S release-keys\",\"width\":\"1080\",\"height\":\"1920\",\"orientation\":\"1\"},\"browser\":{\"userAgent\":\"Dalvik 2.1.0 (Linux; U; Android 6.0.1; C103 Build ZIXOSOP5801803011S)\"},\"wifi\":{\"connected\":true,\"macAddress\":\"02:00:00:00:00:00\",\"ipAddress\":\"192.168.1.69\",\"netmaskAddress\":\"255.255.255.0\",\"gatewayAddress\":\"192.168.1.254\",\"broadcastAddress\":\"192.168.1.255\",\"userEnabled\":true},\"telephony\":{\"imeiNumber\":null,\"carrierIsoCountryCode\":\"br\",\"carrierName\":\"TIM\",\"carrierMobileCountryCode\":null,\"simOperatorName\":\"TIM\",\"carrierMobileNetworkCode\":\"02\",\"networkType\":\"GPRS\",\"phoneType\":\"GSM\",\"simIsoCountryCode\":\"br\",\"isRoamingNetwork\":false,\"cellIpAddress\":null,\"simSerialNumber\":null,\"subscriberId\":null},\"camera\":{\"numberOfCameras\":null,\"rearCamera\":null,\"frontCamera\":null,\"autoFocus\":null,\"flash\":null,\"rearCameraSupportedSizes\":null,\"rearCameraSupportedFormats\":null,\"frontCameraSupportedSizes\":null,\"frontCameraSupportedFormats\":null},\"bluetooth\":{\"supported\":true,\"macAddress\":\"02:00:00:00:00:00\"},\"extra\":{\"account\":null,\"securityPolicy\":true},\"location\":{\"latitude\":-22.534503,\"longitude\":-43.2116745}},\"ipAddress\":\"192.168.1.69\"}";
	private static String userPasswordToken = "ER6TMcrSLnVNh7W0w50IC/I5vBoDCkCFWZDQqUOD3IzfMjaXsb5cma//VM8cUzR8AAAAAAAAAAHDLqJidJhFft3aflirvGciLXY1lksRnCFyLrLJeWc0Fw6tTP4mRVzk9UoW/Wapx3w9h2vcJn88+YTdl1MFBsZ7HzuLV/oX0cLgMtyOHVbyAYoyPxlRxJNWNminMPWm0tv8uraEBTI6A6J33D5iy+0N3hD1vBjDPNwex2lAB7bA2pUtiGuhW21uFLU4LeVv+I4CeSlKCSWKsAU+dTQxaGdQ";

	@Test
	public void POSTpreRegistration(String preRegistrationUrl) {
		cpf = CpfGeneretad.geraCPF();
		getDeviceId = given()
			.log().all()
			.headers("remote-ip-address", "192.168.1.1")
			.headers("deviceSignature", deviceSignature)
			.headers("coreIP","pbi-21105")
		.when()
			.body("{\"cpf\": \""+ cpf +"\", \"deviceType\": \"cellphone\", \"email\": \"teste@teste.com\", \"jailBroken\": true, \"latitude\": \"string\", \"longitude\": \"string\", \"manufacturer\": \"samsung\", \"mobileAreaCode\": \"11\", \"mobileCountryCode\": \"55\", \"mobilePhoneNumber\": 999999999, \"model\": \"v2\", \"name\": \"FULANO BELTRANO DA SILVA\", \"os\": \"android\", \"phoneOperator\": \"timvivoclaro\", \"platform\": \"android\", \"sendedAt\": \"2021-01-02T17:29:55.033Z\", \"smsPermission\": false, \"timeZone\": \"asdasdasdas\"}")
			.log().all()
			.post(APP_BASE_URL + preRegistrationUrl)
		.then()
			.log().all()
			.statusCode(201)
			.extract().body().path("deviceId")
			
		;
		
	}
	
	
	

	public void POSTuserPasswordURL(String userPasswordUrl) {
	given()
		.log().all()
		.headers("DNA", deviceSignature)
		.headers("Remote-IP-Address", "192.168.1.1")
		.headers("coreIP","pbi-21105")
	.when()
		.body("{\"cpf\": \""+ cpf +"\", \"deviceId\": \""+ getDeviceId +"\", \"password\": \""+ userPasswordToken +"\"}")
		.log().all()
		.post(APP_BASE_URL + userPasswordUrl)
	.then()
		.log().all()
		.statusCode(201)
		;
	
		
	}

	public void POSTloginURL(String loginUrl) {
		// TODO Auto-generated method stub
		
	}

	public void POSTpegarCustomerIdURL(String pegarCustomerIdUrl) {
		// TODO Auto-generated method stub
		
	}

	public void PUTapplicationURL(String applicationPutUrl) {
		// TODO Auto-generated method stub
		
	}

	public void GETenviarVideo(String docVideo, String reqGetVideoUrl) {
		// TODO Auto-generated method stub
		
	}

	public void GETenviarArquivos(String docArquivos, String reqGetArqUrl) {
		// TODO Auto-generated method stub
		
	}
	
	

}
