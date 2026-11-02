/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetGrapplingHookRopeChangeRate extends ConsoleCommand {
    static int field_p;
    static int field_o;

    SetGrapplingHookRopeChangeRate(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 1) {
          return -53;
        }
        return param3 + param0 * (-param3 + param1) / param4;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          var3_int = param2;
          while (param1 > 1) {
            if ((param1 & 1) != 0) {
              var3_int = var3_int * param0;
            }
            param0 = param0 * param0;
            param1 = param1 >> 1;
          }
          if (param1 == 1) {
            stackIn_11_0 = var3_int * param0;
            return stackIn_11_0;
          }
          stackIn_13_0 = var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3), "wob.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          if (param1 != -18209) {
            SetGrapplingHookRopeChangeRate.a(91, -87, 12, -41, -105);
          }
          wva.a(param0, (byte) 56, "");
          kr.a(param0, param1 ^ -20973);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "wob.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(203, 62, arguments[0].a(37));
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wob.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_p = -1;
        field_o = 500;
    }
}
