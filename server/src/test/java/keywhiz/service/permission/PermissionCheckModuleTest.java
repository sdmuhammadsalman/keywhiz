package keywhiz.service.permission;

import javax.inject.Inject;
import keywhiz.service.permissions.AlwaysAllowDelegatingPermissionCheck;
import keywhiz.service.permissions.PermissionCheck;
import org.junit.Test;

import static keywhiz.test.KeywhizTests.createInjector;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PermissionCheckModuleTest {
  @Test
  public void createsInjector() {
    assertNotNull(createInjector());
  }

  @Test
  public void injectPermissionCheckProvider() {
    class Holder {
      @Inject PermissionCheck permissionCheck;
    }
    Holder holder = new Holder();
    createInjector().injectMembers(holder);
    assertTrue(holder.permissionCheck instanceof AlwaysAllowDelegatingPermissionCheck);
  }
}
