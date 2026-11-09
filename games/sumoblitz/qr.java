/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qr {
    static IntrusiveDeque reflectionChecks;
    static FontMetrics field_a;
    static ValidationStatus INVALID;
    static int[] field_d;
    static MusicCrossfadeStream field_b;

    final static AccountServiceResult accountNameSuggestions(String[] suggestions, int guard) {
        AccountServiceResult var2 = null;
        RuntimeException var2_ref = null;
        AccountServiceResult stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new AccountServiceResult(false);
          var2.nameSuggestions = suggestions;
          if (guard != 8192) {
            qr.a(1, -118);
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("qr.A(");
          if (suggestions == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          LegacyOpenGlAssemblyProgram.a(GameplaySession.field_k, GameApplet.field_l, (byte) -107, LoginCredentials.field_d, param1, 0, true);
          if (param0 != 13136) {
            field_d = (int[]) null;
          }
          for (var2_int = 0; var2_int < LoginCredentials.field_d; var2_int++) {
            pd.field_q[param1 + var2_int] = var2_int;
          }
          LegacyOpenGlAssemblyProgram.a(NoiseSliceGenerator.field_c, HardwareUnlitEffect.field_f, (byte) -107, param1 + LoginCredentials.field_d, param1 + param1, param1, false);
          if (LoginCredentials.field_d > param1) {
            LoginCredentials.field_d = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "qr.C(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 17704) {
          return false;
        }
        stackIn_8_0 = (jj.field_f == this) || (MusicVoice.field_l == this) || (this == LegacyOpenGlUnderwaterEffect.field_j);
        return stackIn_8_0;
    }

    public static void releaseStatics(byte param0) {
        INVALID = null;
        reflectionChecks = null;
        field_a = null;
        field_b = null;
        if (param0 != 119) {
          INVALID = (ValidationStatus) null;
        }
        field_d = null;
    }

    static {
        reflectionChecks = new IntrusiveDeque();
        INVALID = new ValidationStatus();
        field_d = new int[8192];
    }
}
