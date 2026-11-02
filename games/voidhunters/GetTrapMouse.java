/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetTrapMouse extends ConsoleCommand {
    final static void e(byte param0) {
        int var2 = 0;
        double var3 = 0.0;
        int var5 = VoidHunters.field_G;
        try {
          int var1_int = 3 / ((param0 - 64) / 44);
          if (null == GetDebrisPartitioned.field_o ||
            null == GetBombletSprayProjectiles.field_q) {
            GetBombletSprayProjectiles.field_q = new int[256];
            GetDebrisPartitioned.field_o = new int[256];
            for (var2 = 0; 256 > var2; var2++) {
              var3 = (double)var2 / 255.0 * 6.283185307179586;
              GetDebrisPartitioned.field_o[var2] = (int)(4096.0 * Math.sin(var3));
              GetBombletSprayProjectiles.field_q[var2] = (int)(Math.cos(var3) * 4096.0);
            }
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "taa.B(" + param0 + ')');
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            GetTrapMouse.e((byte) 116);
          }
          stackIn_3_0 = new ConsoleValue(SetNebulaProximityFadeDownshift.field_o);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("taa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetTrapMouse(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
