/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyduration;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.bodyduration.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.joda.time.Period;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in DurationOperations.
 */
public final class DurationOperationsImpl implements DurationOperations {
    /** The Retrofit service to perform REST calls. */
    private DurationService service;
    /** The service client containing this operation class. */
    private AutoRestDurationTestService client;

    /**
     * Initializes an instance of DurationOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DurationOperationsImpl(Retrofit retrofit, AutoRestDurationTestService client) {
        this.service = retrofit.create(DurationService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DurationOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DurationService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("duration/null")
        Call<ResponseBody> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("duration/positiveduration")
        Call<ResponseBody> putPositiveDuration(@Body Period durationBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("duration/positiveduration")
        Call<ResponseBody> getPositiveDuration();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("duration/invalid")
        Call<ResponseBody> getInvalid();

    }

    /**
     * Get null duration value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Period object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Period> getNull() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNull();
        return getNullDelegate(call.execute());
    }

    /**
     * Get null duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getNullAsync(final ServiceCallback<Period> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Period>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Period> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Period, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Period>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putPositiveDuration(Period durationBody) throws ErrorException, IOException, IllegalArgumentException {
        if (durationBody == null) {
            throw new IllegalArgumentException("Parameter durationBody is required and cannot be null.");
        }
        Call<ResponseBody> call = service.putPositiveDuration(durationBody);
        return putPositiveDurationDelegate(call.execute());
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall putPositiveDurationAsync(Period durationBody, final ServiceCallback<Void> serviceCallback) {
        if (durationBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter durationBody is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.putPositiveDuration(durationBody);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putPositiveDurationDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putPositiveDurationDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get a positive duration value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Period object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Period> getPositiveDuration() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getPositiveDuration();
        return getPositiveDurationDelegate(call.execute());
    }

    /**
     * Get a positive duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getPositiveDurationAsync(final ServiceCallback<Period> serviceCallback) {
        Call<ResponseBody> call = service.getPositiveDuration();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Period>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getPositiveDurationDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Period> getPositiveDurationDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Period, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Period>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get an invalid duration value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Period object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Period> getInvalid() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getInvalid();
        return getInvalidDelegate(call.execute());
    }

    /**
     * Get an invalid duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getInvalidAsync(final ServiceCallback<Period> serviceCallback) {
        Call<ResponseBody> call = service.getInvalid();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Period>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getInvalidDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Period> getInvalidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Period, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Period>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
