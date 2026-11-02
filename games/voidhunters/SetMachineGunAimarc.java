/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMachineGunAimarc extends ConsoleCommand {
    static String field_r;
    static IntrusiveDeque field_q;
    static String field_o;
    static String field_p;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(138, 62, arguments[0].a(26));
          if (obfuscationGuard >= -119) {
            field_o = (String) null;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cta.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        if (param4 != -65) {
          SetMachineGunAimarc.a(57);
          if (param5 > param3) {
            return false;
          }
          if (param5 + param1 <= param3) {
            return false;
          }
          if (param0 > param6) {
            return false;
          }
          if (param6 < param0 + param2) {
            return true;
          }
          return false;
        }
        if (param5 > param3) {
          return false;
        }
        if (param5 + param1 <= param3) {
          return false;
        }
        if (param0 > param6) {
          return false;
        }
        if (param6 < param0 + param2) {
          return true;
        }
        return false;
    }

    SetMachineGunAimarc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        field_p = null;
        field_r = null;
        if (param0 != 14675) {
          return;
        }
        field_q = null;
    }

    static {
        field_o = "All games";
        field_r = "Destroy the enemy base";
    }
}
