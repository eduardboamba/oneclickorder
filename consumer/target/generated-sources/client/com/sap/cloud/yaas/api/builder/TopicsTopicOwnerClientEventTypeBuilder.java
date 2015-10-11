
package com.sap.cloud.yaas.api.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.sap.cloud.yaas.rammler.commons.RequestParams;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractActionBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractResourceBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.ActionWithPayloadBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.HttpActionSettable;


/**
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/{topicOwnerClient}/{eventType}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #publish()}</li>
 * <li>{@link #read()}</li>
 * <li>{@link #commit()}</li>
 * </ul>
 * 
 */
public class TopicsTopicOwnerClientEventTypeBuilder
    extends AbstractResourceBuilder<TopicsTopicOwnerClientEventTypeBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    protected final static String RELATIVE_URI = "/{topicOwnerClient}/{eventType}";
    /**
     * The static field for the <code>topicOwnerClient</code> URI parameter name.
     * 
     */
    protected final static String URI_PARAM_TOPIC_OWNER_CLIENT = "topicOwnerClient";
    /**
     * The static field for the <code>eventType</code> URI parameter name.
     * 
     */
    protected final static String URI_PARAM_EVENT_TYPE = "eventType";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    protected final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_TOPIC_OWNER_CLIENT, URI_PARAM_EVENT_TYPE };

    /**
     * Creates a new instance of the {@link TopicsTopicOwnerClientEventTypeBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TopicsTopicOwnerClientEventTypeBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TopicsTopicOwnerClientEventTypeBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TopicsTopicOwnerClientEventTypeBuilder makeACopy(RequestParams newRequestParams) {
        return new TopicsTopicOwnerClientEventTypeBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>topicOwnerClient</code> URI parameter of this resource.
     * 
     * @param topicOwnerClient the new value for the <code>topicOwnerClient</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TopicsTopicOwnerClientEventTypeBuilder fillTopicOwnerClient(final String topicOwnerClient) {
        return this.withUriParam(TopicsTopicOwnerClientEventTypeBuilder.URI_PARAM_TOPIC_OWNER_CLIENT, topicOwnerClient);
    }

    /**
     * Fill the <code>eventType</code> URI parameter of this resource.
     * 
     * @param eventType the new value for the <code>eventType</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TopicsTopicOwnerClientEventTypeBuilder fillEventType(final String eventType) {
        return this.withUriParam(TopicsTopicOwnerClientEventTypeBuilder.URI_PARAM_EVENT_TYPE, eventType);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/publish</code>.
     * 
     * @return an instance of {@link TopicsTopicOwnerClientEventTypePublishBuilder}
     * 
     */
    public TopicsTopicOwnerClientEventTypePublishBuilder publish() {
        return new TopicsTopicOwnerClientEventTypePublishBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/read</code>.
     * 
     * @return an instance of {@link TopicsTopicOwnerClientEventTypeReadBuilder}
     * 
     */
    public TopicsTopicOwnerClientEventTypeReadBuilder read() {
        return new TopicsTopicOwnerClientEventTypeReadBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/commit</code>.
     * 
     * @return an instance of {@link TopicsTopicOwnerClientEventTypeCommitBuilder}
     * 
     */
    public TopicsTopicOwnerClientEventTypeCommitBuilder commit() {
        return new TopicsTopicOwnerClientEventTypeCommitBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TopicsTopicOwnerClientEventTypeBuilder.DeleteActionBuilder prepareDelete() {
        return new TopicsTopicOwnerClientEventTypeBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TopicsTopicOwnerClientEventTypeBuilder.AnyActionBuilder prepareAny() {
        return new TopicsTopicOwnerClientEventTypeBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TopicsTopicOwnerClientEventTypeBuilder.ArbitraryActionBuilder<TopicsTopicOwnerClientEventTypeBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TopicsTopicOwnerClientEventTypeBuilder.AnyActionBuilder, Object> , HttpActionSettable<TopicsTopicOwnerClientEventTypeBuilder.AnyActionBuilder>
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
        protected TopicsTopicOwnerClientEventTypeBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TopicsTopicOwnerClientEventTypeBuilder.AnyActionBuilder actionBuilder = new TopicsTopicOwnerClientEventTypeBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TopicsTopicOwnerClientEventTypeBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TopicsTopicOwnerClientEventTypeBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TopicsTopicOwnerClientEventTypeBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TopicsTopicOwnerClientEventTypeBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TopicsTopicOwnerClientEventTypeBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TopicsTopicOwnerClientEventTypeBuilder.ArbitraryActionBuilder<?> >
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
     * An implementation of the {@link DeleteActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action.	 
     * 
     */
    public static class DeleteActionBuilder
        extends TopicsTopicOwnerClientEventTypeBuilder.ArbitraryActionBuilder<TopicsTopicOwnerClientEventTypeBuilder.DeleteActionBuilder>
    {


        /**
         * Creates a new instance of a {@link DeleteActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public DeleteActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod.DELETE);
        }

        @Override
        protected TopicsTopicOwnerClientEventTypeBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TopicsTopicOwnerClientEventTypeBuilder.DeleteActionBuilder actionBuilder = new TopicsTopicOwnerClientEventTypeBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TopicsTopicOwnerClientEventTypeBuilder.DeleteActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

    }

}
