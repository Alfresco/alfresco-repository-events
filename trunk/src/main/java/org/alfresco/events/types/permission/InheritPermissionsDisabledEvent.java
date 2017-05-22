/*
 * Copyright 2017 Alfresco Software, Ltd.  All rights reserved.
 *
 * License rights for this program may be obtained from Alfresco Software, Ltd. 
 * pursuant to a written agreement and any use of this program without such an 
 * agreement is prohibited. 
 */
package org.alfresco.events.types.permission;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.alfresco.repo.Client;

/**
 * Permission inheritance was disabled for a certain node.
 * 
 * @author cpopa
 */
public class InheritPermissionsDisabledEvent extends PermissionsEvent
{
    private static final long serialVersionUID = 2320442646390223912L;
    public static final String EVENT_TYPE = "INHERITPERMISSIONSDISABLED";

    private boolean async;

    private InheritPermissionsDisabledEvent(boolean async, long seqNumber, String name, String txnId, long timestamp, String networkId,
            String siteId, String nodeId, String nodeType, List<String> paths, List<List<String>> parentNodeIds, String username,
            Long nodeModificationTime, Client client, Set<String> aspects, Map<String, Serializable> nodeProperties)
    {
        super(seqNumber, name, EVENT_TYPE, txnId, timestamp, networkId, siteId, nodeId, nodeType, paths, parentNodeIds, username,
                nodeModificationTime, client, aspects, nodeProperties);
        this.async = async;
    }

    public static class InheritPermissionsDisabledEventBuilder
    {
        private boolean async;
        private long seqNumber;
        private String name;
        private String txnId;
        private long timestamp;
        private String networkId;
        private String siteId;
        private String nodeId;
        private String nodeType;
        private List<String> paths;
        private List<List<String>> parentNodeIds;
        private String username;
        private Long nodeModificationTime;
        private Client client;
        private Set<String> aspects;
        private Map<String, Serializable> nodeProperties;

        InheritPermissionsDisabledEventBuilder()
        {
        }

        public InheritPermissionsDisabledEventBuilder async(final boolean async)
        {
            this.async = async;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder seqNumber(final long seqNumber)
        {
            this.seqNumber = seqNumber;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder name(final String name)
        {
            this.name = name;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder txnId(final String txnId)
        {
            this.txnId = txnId;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder timestamp(final long timestamp)
        {
            this.timestamp = timestamp;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder networkId(final String networkId)
        {
            this.networkId = networkId;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder siteId(final String siteId)
        {
            this.siteId = siteId;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder nodeId(final String nodeId)
        {
            this.nodeId = nodeId;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder nodeType(final String nodeType)
        {
            this.nodeType = nodeType;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder paths(final List<String> paths)
        {
            this.paths = paths;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder parentNodeIds(final List<List<String>> parentNodeIds)
        {
            this.parentNodeIds = parentNodeIds;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder username(final String username)
        {
            this.username = username;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder nodeModificationTime(final Long nodeModificationTime)
        {
            this.nodeModificationTime = nodeModificationTime;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder client(final Client client)
        {
            this.client = client;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder aspects(final Set<String> aspects)
        {
            this.aspects = aspects;
            return this;
        }

        public InheritPermissionsDisabledEventBuilder nodeProperties(final Map<String, Serializable> nodeProperties)
        {
            this.nodeProperties = nodeProperties;
            return this;
        }

        public InheritPermissionsDisabledEvent build()
        {
            return new InheritPermissionsDisabledEvent(async, seqNumber, name, txnId, timestamp, networkId, siteId, nodeId, nodeType, paths,
                    parentNodeIds, username, nodeModificationTime, client, aspects, nodeProperties);
        }
    }

    public static InheritPermissionsDisabledEventBuilder builder()
    {
        return new InheritPermissionsDisabledEventBuilder();
    }

    public InheritPermissionsDisabledEvent()
    {
    }

    public boolean isAsync()
    {
        return this.async;
    }

    public void setAsync(final boolean async)
    {
        this.async = async;
    }

    @Override
    public String toString()
    {
        return "InheritPermissionsDisabledEvent(super=" + super.toString() + ", async=" + this.isAsync() + ")";
    }
}
