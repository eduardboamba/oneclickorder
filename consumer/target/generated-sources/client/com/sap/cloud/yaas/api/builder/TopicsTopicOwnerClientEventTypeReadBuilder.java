
package com.sap.cloud.yaas.api.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.sap.cloud.yaas.rammler.commons.RequestParams;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractActionBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractResourceBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.ActionWithPayloadBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.HttpActionSettable;


/**
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/read</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * </ul>
 * 
 */
public class TopicsTopicOwnerClientEventTypeReadBuilder
    extends AbstractResourceBuilder<TopicsTopicOwnerClientEventTypeReadBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    protected final static String RELATIVE_URI = "/read";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    protected final static String[] URI_PARAMS_ALL = new String[] { };

    /**
     * Creates a new instance of the {@link TopicsTopicOwnerClientEventTypeReadBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TopicsTopicOwnerClientEventTypeReadBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TopicsTopicOwnerClientEventTypeReadBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TopicsTopicOwnerClientEventTypeReadBuilder makeACopy(RequestParams newRequestParams) {
        return new TopicsTopicOwnerClientEventTypeReadBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>topicOwnerClient</code> URI parameter of this resource.
     * 
     * @param topicOwnerClient the new value for the <code>topicOwnerClient</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TopicsTopicOwnerClientEventTypeReadBuilder fillTopicOwnerClient(final String topicOwnerClient) {
        return this.withUriParam(TopicsTopicOwnerClientEventTypeBuilder.URI_PARAM_TOPIC_OWNER_CLIENT, topicOwnerClient);
    }

    /**
     * Fill the <code>eventType</code> URI parameter of this resource.
     * 
     * @param eventType the new value for the <code>eventType</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TopicsTopicOwnerClientEventTypeReadBuilder fillEventType(final String eventType) {
        return this.withUriParam(TopicsTopicOwnerClientEventTypeBuilder.URI_PARAM_EVENT_TYPE, eventType);
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action for this resource.
     * 
     * @return an instance of {@link PostActionBuilder}
     * 
     */
    public TopicsTopicOwnerClientEventTypeReadBuilder.PostActionBuilder preparePost() {
        return new TopicsTopicOwnerClientEventTypeReadBuilder.PostActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TopicsTopicOwnerClientEventTypeReadBuilder.AnyActionBuilder prepareAny() {
        return new TopicsTopicOwnerClientEventTypeReadBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TopicsTopicOwnerClientEventTypeReadBuilder.ArbitraryActionBuilder<TopicsTopicOwnerClientEventTypeReadBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TopicsTopicOwnerClientEventTypeReadBuilder.AnyActionBuilder, Object> , HttpActionSettable<TopicsTopicOwnerClientEventTypeReadBuilder.AnyActionBuilder>
    {


        /**
         * Creates a new instance of a {@link AnyActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public AnyActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
        }

        @Override
        protected TopicsTopicOwnerClientEventTypeReadBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TopicsTopicOwnerClientEventTypeReadBuilder.AnyActionBuilder actionBuilder = new TopicsTopicOwnerClientEventTypeReadBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TopicsTopicOwnerClientEventTypeReadBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TopicsTopicOwnerClientEventTypeReadBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TopicsTopicOwnerClientEventTypeReadBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TopicsTopicOwnerClientEventTypeReadBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TopicsTopicOwnerClientEventTypeReadBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
            actionBuilder.setHttpMethod(theMethod);
            return actionBuilder;
        }

    }


    /**
     * Base abstract class for all {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder}s for this resource.
     * 
     * @param <T> the type of the builder which will be produced by the builder methods
     * 
     */
    public static abstract class ArbitraryActionBuilder<T extends TopicsTopicOwnerClientEventTypeReadBuilder.ArbitraryActionBuilder<?> >
        extends AbstractActionBuilder<T>
    {


        /**
         * Creates a new instance of the {@link ArbitraryActionBuilder}, for given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget instance
         * @param requestParams the given RequestParams instance
         * 
         */
        public ArbitraryActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
        }

        /**
         * Fill the <code>topicOwnerClient</code> URI parameter of this resource.
         * 
         * @param topicOwnerClient the new value for the <code>topicOwnerClient</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillTopicOwnerClient(final String topicOwnerClient) {
            return this.withUriParam(TopicsTopicOwnerClientEventTypeBuilder.URI_PARAM_TOPIC_OWNER_CLIENT, topicOwnerClient);
        }

        /**
         * Fill the <code>eventType</code> URI parameter of this resource.
         * 
         * @param eventType the new value for the <code>eventType</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillEventType(final String eventType) {
            return this.withUriParam(TopicsTopicOwnerClientEventTypeBuilder.URI_PARAM_EVENT_TYPE, eventType);
        }

    }


    /**
     * An implementation of the {@link PostActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action.	 
     * 
     */
    public static class PostActionBuilder
        extends TopicsTopicOwnerClientEventTypeReadBuilder.ArbitraryActionBuilder<TopicsTopicOwnerClientEventTypeReadBuilder.PostActionBuilder>
        implements ActionWithPayloadBuilder<TopicsTopicOwnerClientEventTypeReadBuilder.PostActionBuilder, Object>
    {


        /**
         * Creates a new instance of a {@link PostActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public PostActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod.POST);
        }

        @Override
        protected TopicsTopicOwnerClientEventTypeReadBuilder.PostActionBuilder makeACopy(RequestParams newRequestParams) {
            final TopicsTopicOwnerClientEventTypeReadBuilder.PostActionBuilder actionBuilder = new TopicsTopicOwnerClientEventTypeReadBuilder.PostActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TopicsTopicOwnerClientEventTypeReadBuilder.PostActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TopicsTopicOwnerClientEventTypeReadBuilder.PostActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TopicsTopicOwnerClientEventTypeReadBuilder.PostActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>hybris-client-id</code> header value.
         * 
         * @param hybrisClientId the value of the <code>hybris-client-id</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>hybris-client-id</code> header set
         * 
         */
        public TopicsTopicOwnerClientEventTypeReadBuilder.PostActionBuilder withHybrisClientId(String hybrisClientId) {
            return this.withSingleHeader("hybris-client-id", hybrisClientId);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TopicsTopicOwnerClientEventTypeReadBuilder.PostActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }

}
