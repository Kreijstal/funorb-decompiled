/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetToggledScoreboard extends ConsoleCommand {
    static int field_q;
    static IntrusiveDeque field_p;
    static phb field_o;
    static int field_r;

    public static void b(boolean param0) {
        field_o = null;
        field_p = null;
        if (param0) {
          field_p = (IntrusiveDeque) null;
        }
    }

    final static String a(int param0) {
        if (param0 != 27158) {
          GetToggledScoreboard.b(false);
          return SetTabForScores.field_p;
        }
        return SetTabForScores.field_p;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 >= -63) {
          field_p = (IntrusiveDeque) null;
          if (!pla.a(param1, -4)) {
            return 13 == param1 ? true : false;
          }
          return true;
        }
        if (pla.a(param1, -4)) {
          return true;
        }
        if (13 != param1) {
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
            field_q = 1;
          }
          stackIn_3_0 = new ConsoleValue(SetRepairModeCooldown.field_o);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cg.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetToggledScoreboard(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = 0;
        field_p = new IntrusiveDeque();
        field_r = 5;
    }
}
