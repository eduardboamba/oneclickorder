
package com.sap.cloud.yaas.api;

import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import com.sap.cloud.yaas.api.builder.TopicsBuilder;
import com.sap.cloud.yaas.rammler.commons.RequestParams;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractResourceBuilder;


/**
 * This the entrance point to the hybris PubSub Service API client.
 * <p>
 * It is a wrapper for a JAX-RS REST client that will call the hybris PubSub Service API.
 * <p>
 * Specifying the path which we want to call, as well as other request parameters, is done by using immutable builders:
 * modifying any property of the current request is creating a new instance of a builder. This assures that building the
 * client is thread safe.
 * <p>
 * Available builders for this API's resources:
 * <ul>
 * <li>{@link #topics()}</li>
 * </ul>
 * 
 */
public class HybrisPubSubServiceApiClient
    extends AbstractResourceBuilder<HybrisPubSubServiceApiClient>
{

    /**
     * The default URL or the repository service, as defined in the RAML.
     * 
     */
    public final static String DEFAULT_BASE_URI = "https://api.yaas.io/hybris/pubsub/b2";
    private final String baseUri;
    private final Client client;

    /**
     * Creates an instance of the {@link HybrisPubSubServiceApiClient} for the given URI.
     * 
     * @param baseUri the base URI of the service
     * 
     */
    public HybrisPubSubServiceApiClient(final String baseUri) {
        this(baseUri, ClientBuilder.newClient(), new RequestParams());
    }

    /**
     * Creates an instance of the {@link HybrisPubSubServiceApiClient} for the given URI.
     * 
     * @param baseUri the base URI of the service
     * 
     */
    public HybrisPubSubServiceApiClient(final URI baseUri) {
        this(baseUri.toString(), ClientBuilder.newClient(), new RequestParams());
    }

    /**
     * Creates an instance of the {@link HybrisPubSubServiceApiClient} for the given URI, based on the supplied JAX-RS client
     * instance.
     * <p>
     * Use this constructor to customize the JAX-RS client to use.
     * 
     * @param baseUri the base URI of the service
     * @param client an instance of JAX-RS client
     * 
     */
    public HybrisPubSubServiceApiClient(final String baseUri, final Client client) {
        this(baseUri, client, new RequestParams());
    }

    private HybrisPubSubServiceApiClient(final String baseUri, final Client client, final RequestParams params) {
        super(baseUri, client, params);
        this.baseUri = baseUri;
        this.client = client;
    }

    @Override
    protected HybrisPubSubServiceApiClient makeACopy(final RequestParams params) {
        return new HybrisPubSubServiceApiClient(baseUri, client, params);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/topics</code>.
     * 
     * @return an instance of {@link TopicsBuilder}
     * 
     */
    public TopicsBuilder topics() {
        return new TopicsBuilder(getTarget(), getRequestParams(), true);
    }

}
