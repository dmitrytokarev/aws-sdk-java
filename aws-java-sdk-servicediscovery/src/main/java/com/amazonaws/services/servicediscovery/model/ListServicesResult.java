/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListServices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array that contains one <code>ServiceSummary</code> object for each service that matches the specified filter
     * criteria.
     * </p>
     */
    private java.util.List<ServiceSummary> services;
    /**
     * <p>
     * If more than <code>MaxResults</code> operations match the specified criteria, the value of <code>NextToken</code>
     * is the first service in the next group of services that were created by the current AWS account. To get the next
     * group, specify the value of <code>NextToken</code> from the previous response in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array that contains one <code>ServiceSummary</code> object for each service that matches the specified filter
     * criteria.
     * </p>
     * 
     * @return An array that contains one <code>ServiceSummary</code> object for each service that matches the specified
     *         filter criteria.
     */

    public java.util.List<ServiceSummary> getServices() {
        return services;
    }

    /**
     * <p>
     * An array that contains one <code>ServiceSummary</code> object for each service that matches the specified filter
     * criteria.
     * </p>
     * 
     * @param services
     *        An array that contains one <code>ServiceSummary</code> object for each service that matches the specified
     *        filter criteria.
     */

    public void setServices(java.util.Collection<ServiceSummary> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<ServiceSummary>(services);
    }

    /**
     * <p>
     * An array that contains one <code>ServiceSummary</code> object for each service that matches the specified filter
     * criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServices(java.util.Collection)} or {@link #withServices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param services
     *        An array that contains one <code>ServiceSummary</code> object for each service that matches the specified
     *        filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesResult withServices(ServiceSummary... services) {
        if (this.services == null) {
            setServices(new java.util.ArrayList<ServiceSummary>(services.length));
        }
        for (ServiceSummary ele : services) {
            this.services.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains one <code>ServiceSummary</code> object for each service that matches the specified filter
     * criteria.
     * </p>
     * 
     * @param services
     *        An array that contains one <code>ServiceSummary</code> object for each service that matches the specified
     *        filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesResult withServices(java.util.Collection<ServiceSummary> services) {
        setServices(services);
        return this;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> operations match the specified criteria, the value of <code>NextToken</code>
     * is the first service in the next group of services that were created by the current AWS account. To get the next
     * group, specify the value of <code>NextToken</code> from the previous response in the next request.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> operations match the specified criteria, the value of
     *        <code>NextToken</code> is the first service in the next group of services that were created by the current
     *        AWS account. To get the next group, specify the value of <code>NextToken</code> from the previous response
     *        in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> operations match the specified criteria, the value of <code>NextToken</code>
     * is the first service in the next group of services that were created by the current AWS account. To get the next
     * group, specify the value of <code>NextToken</code> from the previous response in the next request.
     * </p>
     * 
     * @return If more than <code>MaxResults</code> operations match the specified criteria, the value of
     *         <code>NextToken</code> is the first service in the next group of services that were created by the
     *         current AWS account. To get the next group, specify the value of <code>NextToken</code> from the previous
     *         response in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> operations match the specified criteria, the value of <code>NextToken</code>
     * is the first service in the next group of services that were created by the current AWS account. To get the next
     * group, specify the value of <code>NextToken</code> from the previous response in the next request.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> operations match the specified criteria, the value of
     *        <code>NextToken</code> is the first service in the next group of services that were created by the current
     *        AWS account. To get the next group, specify the value of <code>NextToken</code> from the previous response
     *        in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getServices() != null)
            sb.append("Services: ").append(getServices()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServicesResult == false)
            return false;
        ListServicesResult other = (ListServicesResult) obj;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServicesResult clone() {
        try {
            return (ListServicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}