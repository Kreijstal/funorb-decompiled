/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static IntrusiveDeque field_b;
    static int field_a;
    static boolean[] field_c;
    static String field_d;

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          uf.a(rf.field_c, SingleChildWidgetContainer.field_z, 1512033985, true, param1, 0, i.field_f);
          for (var2_int = 0; var2_int < SingleChildWidgetContainer.field_z; var2_int++) {
            PasswordValidator.field_s[var2_int + param1] = var2_int;
          }
          var3 = -108 % ((param0 - 73) / 39);
          uf.a(kl.field_a, param1 + SingleChildWidgetContainer.field_z, 1512033985, false, param1 + param1, param1, bh.field_e);
          if (SingleChildWidgetContainer.field_z > param1) {
            SingleChildWidgetContainer.field_z = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var2), "ve.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        field_d = null;
        if (param0 != 0) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_b = new IntrusiveDeque();
        field_d = "to keep fullscreen or";
    }
}
