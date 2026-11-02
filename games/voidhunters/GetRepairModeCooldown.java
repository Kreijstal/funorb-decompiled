/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetRepairModeCooldown extends ConsoleCommand {
    static String field_o;
    static String field_p;

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
          return true;
        }
        if (param0 < 48) {
          return false;
        }
        if (param0 > 57) {
          return false;
        }
        return true;
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
            GetRepairModeCooldown.a('ﾛ', true);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(214, 111));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("haa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_o = null;
        field_p = null;
        if (param0 != 91) {
          GetRepairModeCooldown.a('3', true);
        }
    }

    GetRepairModeCooldown(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = "Please try changing the following settings:  ";
        field_o = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
