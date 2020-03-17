package io.PLDMorales.client.api;

import io.PLDMorales.client.ApiClient;
import io.PLDMorales.client.ApiException;
import io.PLDMorales.client.model.Peticion;
import io.PLDMorales.client.model.Respuesta;
import io.PLDMorales.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class ApiTest {

	private final PldPersonasMoralesApi api = new PldPersonasMoralesApi();
	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());
	private ApiClient apiClient = null;

	@Before()
	public void setUp() {
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath("the_url");
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
			    .readTimeout(30, TimeUnit.SECONDS)
			    .addInterceptor(new SignerInterceptor())
			    .build();
		apiClient.setHttpClient(okHttpClient);
	}

	@Test
	public void getPLDPmTest() throws ApiException {

		String xApiKey = "your_api_key";
		String username = "your_username";
		String password = "your_password";

		Peticion peticion = null;

		try {
			peticion = new Peticion();
			peticion.setRazonSocial("EMPRESA SA DE CV");

			Respuesta response = api.getPLDPm(xApiKey, username, password, peticion);
			Assert.assertTrue(response != null);
			if (response != null) {
				logger.info(response.toString());
			}
		} catch (ApiException e) {
			logger.info(e.getResponseBody());
		}
	}

}
