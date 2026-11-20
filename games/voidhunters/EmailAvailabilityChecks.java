/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailAvailabilityChecks {
    static int field_a;
    static FullscreenCanvas fullscreenCanvas;

    final static EmailAvailabilityCheck getEmailAvailabilityCheck(String param0, int param1) {
        RuntimeException var2 = null;
        EmailAvailabilityCheck stackIn_2_0 = null;
        EmailAvailabilityCheck stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            stackIn_2_0 = (EmailAvailabilityCheck) null;
            return stackIn_2_0;
          }
          if (GetBombletSprayPushMultiplier.emailAvailabilityCheck.isComplete(4) &&
            !param0.equals(GetBombletSprayPushMultiplier.emailAvailabilityCheck.getEmail(4))) {
            GetBombletSprayPushMultiplier.emailAvailabilityCheck = EmailAvailabilityCheckFactory.create(param0, (byte) 110);
          }
          stackIn_8_0 = GetBombletSprayPushMultiplier.emailAvailabilityCheck;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("psb.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int crc32(byte[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            var4 = (String) null;
            EmailAvailabilityChecks.getEmailAvailabilityCheck((String) null, 28);
          }
          stackIn_3_0 = GetMessageMaxage.crc32((byte) -69, param1, param0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("psb.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        fullscreenCanvas = null;
        if (param0) {
          String var2 = (String) null;
          EmailAvailabilityChecks.getEmailAvailabilityCheck((String) null, -33);
        }
    }

    static {
    }
}
