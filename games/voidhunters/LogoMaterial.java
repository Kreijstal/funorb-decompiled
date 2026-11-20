/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LogoMaterial {
    static int field_b;
    static int field_a;
    int color;

    final static void openDisplayModeDialog(byte param0) {
        SetVariableLabelAction.openDisplayModeDialog(32);
        int var1 = -97 % ((62 - param0) / 54);
    }

    final static boolean isReflectionCheckReady(int param0) {
        int var2 = 0;
        ReflectionCheck var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        ReflectionCheck var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          var5 = (ReflectionCheck) (GetArmageddonLength.pendingReflectionChecks.first(0));
          var1 = var5;
          if (var1 == null) {
            return false;
          }
          var3 = 58 % ((param0 + 10) / 48);
          for (var2 = 0; var2 < var1.operationCount; var2++) {
            if (null != var5.fieldRequests[var2] &&
              var5.fieldRequests[var2].status == 0) {
              return false;
            }
            if (null != var5.methodRequests[var2] &&
              0 == var5.methodRequests[var2].status) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1_ref), "apb.B(" + param0 + ')');
        }
    }

    static {
        field_a = 1;
        field_b = 4;
    }
}
