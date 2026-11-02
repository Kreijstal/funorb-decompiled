/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetAutoaim extends ConsoleCommand {
    static int field_p;
    static int field_o;

    SetAutoaim(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            field_o = 76;
          }
          SetMachineGunEnergyUsed.a(25, 62, arguments[0].a(44));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nua.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, String param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12_int = 0;
        RuntimeException var12 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var12_int = -16 / ((param8 - 32) / 48);
          if (!li.field_i) {
            stackIn_4_0 = ita.a(param11, 7988).a(param5, param2, param9, param7, param1, param6, param0, param10, param4, param3);
            return stackIn_4_0;
          }
          stackIn_2_0 = nma.field_b[param11].a(param1, param3, param4, 0, param9, param2, (int[]) null, false, 0, param7, param5, param10, param0, (aja[]) null, -16777216 | param6, (aa) null);
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_7_0 = var12;
          stackIn_7_1 = new StringBuilder().append("nua.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(')').toString());
        }
    }

    final static boolean b(boolean param0) {
        if (!param0) {
          field_o = -106;
          return true;
        }
        return true;
    }

    static {
        field_o = 1;
        field_p = 3;
    }
}
