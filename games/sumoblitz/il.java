/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int field_a;
    static ToolkitSprite field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static EmailValidationError validateEmailAddress(String address, byte guard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        EmailValidationError var5 = null;
        EmailValidationError stackIn_4_0 = null;
        EmailValidationError stackIn_7_0 = null;
        EmailValidationError stackIn_12_0 = null;
        EmailValidationError stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (address != null &&
            address.length() != 0) {
            var2_int = address.indexOf('@');
            if (var2_int == -1) {
              stackIn_7_0 = ClientExceptionSupport.MISSING_EMAIL_COMPONENT;
              return stackIn_7_0;
            }
            var3 = address.substring(0, var2_int);
            var4 = address.substring(1 + var2_int);
            if (guard < 0) {
              field_b = (ToolkitSprite) null;
            }
            var5 = SocketConnector.validateEmailLocalPart((byte) -126, var3);
            if (var5 == null) {
              stackIn_14_0 = ServerDataReadRequest.validateEmailDomain(var4, -1);
              return stackIn_14_0;
            }
            stackIn_12_0 = var5;
            return stackIn_12_0;
          }
          stackIn_4_0 = FixedPointPerlinNoise3D.EMPTY_EMAIL;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("il.A(");
          if (address == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(guard).append(')').toString());
        }
    }

    final static boolean a(boolean param0, ResourceArchive param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_intLifetime1;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 9; var2_int++) {
            if (null != TimedSceneEffect.field_m[var2_int] &&
              !AccountConnectionPhase.field_b.firstSynthesizer.loadTrackPatches(LegacyOpenGlPostProcessManager.field_b, TimedSceneEffect.field_m[var2_int], -1, param1, 176400)) {
              return false;
            }
          }
          if (param0) {
            return false;
          }
          var4 = 0;
          var2_intLifetime1 = var4;
          while (var4 < 9) {
            if (TimedSceneEffect.field_m[var4] != null &&
              !AccountConnectionPhase.field_b.secondSynthesizer.loadTrackPatches(LegacyOpenGlPostProcessManager.field_b, TimedSceneEffect.field_m[var4], -1, param1, 176400)) {
              return false;
            }
            var4++;
          }
          AccountConnectionPhase.field_b.firstSynthesizer.clearPatchSampleIds((byte) 28);
          AccountConnectionPhase.field_b.secondSynthesizer.clearPatchSampleIds((byte) 28);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("il.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != 26238) {
          field_a = 82;
        }
    }

    final static void printClientError(byte guard, String message) {
        System.out.println("Error: " + HardwareGraphicsToolkit.a("%0a", message, "\n", true));
        if (guard < 4) {
          il.releaseStatics(81);
        }
    }

    static {
        field_a = 0;
    }
}
