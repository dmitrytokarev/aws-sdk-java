/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpointsmsvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An object that defines a single event destination.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/EventDestinationDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventDestinationDefinition implements Serializable, Cloneable, StructuredPojo {

    private CloudWatchLogsDestination cloudWatchLogsDestination;
    /**
     * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon
     * Pinpoint sends response data to the specified event destination.
     */
    private Boolean enabled;

    private KinesisFirehoseDestination kinesisFirehoseDestination;

    private java.util.List<String> matchingEventTypes;

    /**
     * @param cloudWatchLogsDestination
     */

    public void setCloudWatchLogsDestination(CloudWatchLogsDestination cloudWatchLogsDestination) {
        this.cloudWatchLogsDestination = cloudWatchLogsDestination;
    }

    /**
     * @return
     */

    public CloudWatchLogsDestination getCloudWatchLogsDestination() {
        return this.cloudWatchLogsDestination;
    }

    /**
     * @param cloudWatchLogsDestination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDestinationDefinition withCloudWatchLogsDestination(CloudWatchLogsDestination cloudWatchLogsDestination) {
        setCloudWatchLogsDestination(cloudWatchLogsDestination);
        return this;
    }

    /**
     * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon
     * Pinpoint sends response data to the specified event destination.
     * 
     * @param enabled
     *        Indicates whether or not the event destination is enabled. If the event destination is enabled, then
     *        Amazon Pinpoint sends response data to the specified event destination.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon
     * Pinpoint sends response data to the specified event destination.
     * 
     * @return Indicates whether or not the event destination is enabled. If the event destination is enabled, then
     *         Amazon Pinpoint sends response data to the specified event destination.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon
     * Pinpoint sends response data to the specified event destination.
     * 
     * @param enabled
     *        Indicates whether or not the event destination is enabled. If the event destination is enabled, then
     *        Amazon Pinpoint sends response data to the specified event destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDestinationDefinition withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon
     * Pinpoint sends response data to the specified event destination.
     * 
     * @return Indicates whether or not the event destination is enabled. If the event destination is enabled, then
     *         Amazon Pinpoint sends response data to the specified event destination.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * @param kinesisFirehoseDestination
     */

    public void setKinesisFirehoseDestination(KinesisFirehoseDestination kinesisFirehoseDestination) {
        this.kinesisFirehoseDestination = kinesisFirehoseDestination;
    }

    /**
     * @return
     */

    public KinesisFirehoseDestination getKinesisFirehoseDestination() {
        return this.kinesisFirehoseDestination;
    }

    /**
     * @param kinesisFirehoseDestination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDestinationDefinition withKinesisFirehoseDestination(KinesisFirehoseDestination kinesisFirehoseDestination) {
        setKinesisFirehoseDestination(kinesisFirehoseDestination);
        return this;
    }

    /**
     * @return
     * @see EventType
     */

    public java.util.List<String> getMatchingEventTypes() {
        return matchingEventTypes;
    }

    /**
     * @param matchingEventTypes
     * @see EventType
     */

    public void setMatchingEventTypes(java.util.Collection<String> matchingEventTypes) {
        if (matchingEventTypes == null) {
            this.matchingEventTypes = null;
            return;
        }

        this.matchingEventTypes = new java.util.ArrayList<String>(matchingEventTypes);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchingEventTypes(java.util.Collection)} or {@link #withMatchingEventTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param matchingEventTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public EventDestinationDefinition withMatchingEventTypes(String... matchingEventTypes) {
        if (this.matchingEventTypes == null) {
            setMatchingEventTypes(new java.util.ArrayList<String>(matchingEventTypes.length));
        }
        for (String ele : matchingEventTypes) {
            this.matchingEventTypes.add(ele);
        }
        return this;
    }

    /**
     * @param matchingEventTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public EventDestinationDefinition withMatchingEventTypes(java.util.Collection<String> matchingEventTypes) {
        setMatchingEventTypes(matchingEventTypes);
        return this;
    }

    /**
     * @param matchingEventTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public EventDestinationDefinition withMatchingEventTypes(EventType... matchingEventTypes) {
        java.util.ArrayList<String> matchingEventTypesCopy = new java.util.ArrayList<String>(matchingEventTypes.length);
        for (EventType value : matchingEventTypes) {
            matchingEventTypesCopy.add(value.toString());
        }
        if (getMatchingEventTypes() == null) {
            setMatchingEventTypes(matchingEventTypesCopy);
        } else {
            getMatchingEventTypes().addAll(matchingEventTypesCopy);
        }
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCloudWatchLogsDestination() != null)
            sb.append("CloudWatchLogsDestination: ").append(getCloudWatchLogsDestination()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getKinesisFirehoseDestination() != null)
            sb.append("KinesisFirehoseDestination: ").append(getKinesisFirehoseDestination()).append(",");
        if (getMatchingEventTypes() != null)
            sb.append("MatchingEventTypes: ").append(getMatchingEventTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventDestinationDefinition == false)
            return false;
        EventDestinationDefinition other = (EventDestinationDefinition) obj;
        if (other.getCloudWatchLogsDestination() == null ^ this.getCloudWatchLogsDestination() == null)
            return false;
        if (other.getCloudWatchLogsDestination() != null && other.getCloudWatchLogsDestination().equals(this.getCloudWatchLogsDestination()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getKinesisFirehoseDestination() == null ^ this.getKinesisFirehoseDestination() == null)
            return false;
        if (other.getKinesisFirehoseDestination() != null && other.getKinesisFirehoseDestination().equals(this.getKinesisFirehoseDestination()) == false)
            return false;
        if (other.getMatchingEventTypes() == null ^ this.getMatchingEventTypes() == null)
            return false;
        if (other.getMatchingEventTypes() != null && other.getMatchingEventTypes().equals(this.getMatchingEventTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogsDestination() == null) ? 0 : getCloudWatchLogsDestination().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getKinesisFirehoseDestination() == null) ? 0 : getKinesisFirehoseDestination().hashCode());
        hashCode = prime * hashCode + ((getMatchingEventTypes() == null) ? 0 : getMatchingEventTypes().hashCode());
        return hashCode;
    }

    @Override
    public EventDestinationDefinition clone() {
        try {
            return (EventDestinationDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoice.model.transform.EventDestinationDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
