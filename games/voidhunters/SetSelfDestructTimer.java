/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetSelfDestructTimer extends ConsoleCommand {
    static vka field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, -97);
          }
          SetMachineGunEnergyUsed.a(225, 62, arguments[0].a(77));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("flb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -26016) {
          SetSelfDestructTimer.a(-2);
        }
    }

    SetSelfDestructTimer(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, String param1, int param2, String param3, int param4) {
        try {
          bpa.field_c.field_hb = bpa.field_c.field_hb + fgb.field_l.field_hb;
          bpa.field_c.field_Y = param4;
          bpa.field_c.field_R = param1;
          bpa.field_c.field_s = param3;
          fgb.field_l.field_L = fgb.field_l.field_L + fgb.field_l.field_hb;
          fgb.field_l.field_hb = param2;
          if (param0 != 19204) {
            SetSelfDestructTimer.a(98);
          }
          bpa.field_c.field_hb = bpa.field_c.field_hb - fgb.field_l.field_hb;
          fgb.field_l.field_L = fgb.field_l.field_L - fgb.field_l.field_hb;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "flb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
    }
}
