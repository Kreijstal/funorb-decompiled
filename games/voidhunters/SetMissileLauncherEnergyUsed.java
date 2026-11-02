/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMissileLauncherEnergyUsed extends ConsoleCommand {
    static float field_p;
    static String field_q;
    static String field_r;
    static int field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          SetMachineGunEnergyUsed.a(166, 62, arguments[0].a(113));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jj.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetMissileLauncherEnergyUsed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, byte param1, int param2, float param3, int param4, int param5) {
        if (param1 != 7) {
          SetMissileLauncherEnergyUsed.a(-51, (byte) -126, 78, -1.8534518480300903f, -88, 102);
          if (!li.field_i) {
            dma.e(param5, param2, (int)param3, param0, param4);
            return;
          }
          if (lfa.field_j) {
            GetDebrisGroupColour.field_r.a(param0 | param4 << 24, Math.max(1, (int)param3), param5, param2, (byte) -113);
            return;
          }
          return;
        }
        if (!li.field_i) {
          dma.e(param5, param2, (int)param3, param0, param4);
          return;
        }
        if (!lfa.field_j) {
          return;
        }
        GetDebrisGroupColour.field_r.a(param0 | param4 << 24, Math.max(1, (int)param3), param5, param2, (byte) -113);
    }

    public static void a(int param0) {
        int var1 = -32 / ((param0 - 39) / 32);
        field_q = null;
        field_r = null;
    }

    static {
        field_p = 1.0f;
        field_q = "Add friend";
        field_r = null;
        field_o = 192;
    }
}
