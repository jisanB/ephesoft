/********************************************************************************* 
* Ephesoft is a Intelligent Document Capture and Mailroom Automation program 
* developed by Ephesoft, Inc. Copyright (C) 2010-2012 Ephesoft Inc. 
* 
* This program is free software; you can redistribute it and/or modify it under 
* the terms of the GNU Affero General Public License version 3 as published by the 
* Free Software Foundation with the addition of the following permission added 
* to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED WORK 
* IN WHICH THE COPYRIGHT IS OWNED BY EPHESOFT, EPHESOFT DISCLAIMS THE WARRANTY 
* OF NON INFRINGEMENT OF THIRD PARTY RIGHTS. 
* 
* This program is distributed in the hope that it will be useful, but WITHOUT 
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
* FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License for more 
* details. 
* 
* You should have received a copy of the GNU Affero General Public License along with 
* this program; if not, see http://www.gnu.org/licenses or write to the Free 
* Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 
* 02110-1301 USA. 
* 
* You can contact Ephesoft, Inc. headquarters at 111 Academy Way, 
* Irvine, CA 92617, USA. or at email address info@ephesoft.com. 
* 
* The interactive user interfaces in modified source and object code versions 
* of this program must display Appropriate Legal Notices, as required under 
* Section 5 of the GNU Affero General Public License version 3. 
* 
* In accordance with Section 7(b) of the GNU Affero General Public License version 3, 
* these Appropriate Legal Notices must retain the display of the "Ephesoft" logo. 
* If the display of the logo is not reasonably feasible for 
* technical reasons, the Appropriate Legal Notices must display the words 
* "Powered by Ephesoft". 
********************************************************************************/ 

package com.ephesoft.dcma.da.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ephesoft.dcma.core.model.common.AbstractChangeableEntity;

/**
 * Entity class for remote_batch_instance.
 * 
 * @author Ephesoft
 * @version 1.0
 * @see com.ephesoft.dcma.core.model.common.AbstractChangeableEntity
 */
@Entity
@Table(name = "remote_batch_instance")
public class RemoteBatchInstance extends AbstractChangeableEntity {

	/**
	 * serialVersionUID long.
	 */
	private static final long serialVersionUID = 8261921740668252061L;

	/**
	 * remoteURL String.
	 */
	@Column(name = "remote_url")
	private String remoteURL;

	/**
	 * remoteBatchInstanceIdentifier String.
	 */
	@Column(name = "remote_batch_instance_identifier")
	private String remoteBatchInstanceIdentifier;

	/**
	 * previousRemoteURL String.
	 */
	@Column(name = "previous_remote_url")
	private String previousRemoteURL;

	/**
	 * previousRemoteBatchInstanceIdentifier String.
	 */
	@Column(name = "previous_remote_batch_instance_identifier")
	private String previousRemoteBatchInstanceIdentifier;
	
	/**
	 * sourceModule String.
	 */
	@Column(name = "source_module")
	private String sourceModule;

	/**
	 * To get Remote URL.
	 * @return the remoteURL
	 */
	public String getRemoteURL() {
		return remoteURL;
	}

	/**
	 * To set Remote URL.
	 * @param remoteURL String
	 */
	public void setRemoteURL(String remoteURL) {
		this.remoteURL = remoteURL;
	}

	/**
	 * To get Remote Batch Instance Identifier.
	 * @return the remoteBatchInstanceIdentifier
	 */
	public String getRemoteBatchInstanceIdentifier() {
		return remoteBatchInstanceIdentifier;
	}

	/**
	 * To set Remote Batch Instance Identifier.
	 * @param remoteBatchInstanceIdentifier String
	 */
	public void setRemoteBatchInstanceIdentifier(String remoteBatchInstanceIdentifier) {
		this.remoteBatchInstanceIdentifier = remoteBatchInstanceIdentifier;
	}

	/**
	 * To get Previous Remote URL.
	 * @return the previousRemoteURL
	 */
	public String getPreviousRemoteURL() {
		return previousRemoteURL;
	}

	/**
	 * To set Previous Remote URL.
	 * @param previousRemoteURL String
	 */
	public void setPreviousRemoteURL(String previousRemoteURL) {
		this.previousRemoteURL = previousRemoteURL;
	}
	
	/**
	 * To get Previous Remote Batch Instance Identifier.
	 * @return the previousRemoteBatchInstanceIdentifier
	 */
	public String getPreviousRemoteBatchInstanceIdentifier() {
		return previousRemoteBatchInstanceIdentifier;
	}
	
	/**
	 * To set Previous Remote Batch Instance Identifier.
	 * @param previousRemoteBatchInstanceIdentifier String
	 */
	public void setPreviousRemoteBatchInstanceIdentifier(String previousRemoteBatchInstanceIdentifier) {
		this.previousRemoteBatchInstanceIdentifier = previousRemoteBatchInstanceIdentifier;
	}
	
	/**
	 * To get Source Module.
	 * @return the sourceModule
	 */
	public String getSourceModule() {
		return sourceModule;
	}
	
	/**
	 * To set Source Module.
	 * @param sourceModule String
	 */
	public void setSourceModule(String sourceModule) {
		this.sourceModule = sourceModule;
	}
}
