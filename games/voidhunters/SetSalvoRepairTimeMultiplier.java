/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetSalvoRepairTimeMultiplier extends ConsoleCommand {
    static int field_p;
    static int field_q;
    static String field_o;
    static int field_r;

    public static void e(int param0) {
        if (param0 != -1) {
          return;
        }
        field_o = null;
    }

    SetSalvoRepairTimeMultiplier(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        GetUseModels.field_o = wt.a(false);
        GetDebrisThrowable.field_q = 0;
        if (param0 != 4907) {
          SetSalvoRepairTimeMultiplier.a(-71);
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
          SetMachineGunEnergyUsed.a(39, 62, arguments[0].a(104));
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
          stackIn_7_1 = new StringBuilder().append("fd.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_p = 1;
        field_r = -1;
        field_o = "Connection timed out. Please try using a different server.";
    }
}
