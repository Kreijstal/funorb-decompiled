/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetOndamageParticleFadestart extends ConsoleCommand {
    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < -119) {
            stackIn_4_0 = new ConsoleValue(dw.field_b);
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vua.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int[] param1, byte param2, int param3, int param4, int param5, int param6) {
        SetReloadBarWidth.field_p[param6] = param1;
        SetReloadBarWidth.field_r[param6] = param0;
        if (param2 >= -11) {
          return;
        }
        try {
          SetReloadBarWidth.field_q[param6] = param4;
          SetReloadBarWidth.field_s[param6] = param3;
          SetReloadBarWidth.field_o[param6] = param5;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vua.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    GetOndamageParticleFadestart(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
