/**
 * 
 */
package hudson.security;

import org.acegisecurity.Authentication;

import hudson.ExtensionPoint;

/**
 * @author mike
 *
 */
public abstract class ACLPermissionOverride implements ExtensionPoint {

	public abstract boolean checkPermission (Authentication a, Permission p);

}
