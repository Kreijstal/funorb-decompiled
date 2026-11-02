/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetUseExtraBackground extends ConsoleCommand {
    static kba field_q;
    static String field_o;
    static String field_r;
    static String field_s;
    static String field_u;
    static String field_t;
    static boolean field_p;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetSalvoDamageMultiplier.field_o = arguments[0].a(7);
          if (obfuscationGuard > -119) {
            field_t = (String) null;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gcb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_r = null;
          field_o = null;
          field_u = null;
          field_s = null;
          field_t = null;
          field_q = null;
          return;
        }
        SetUseExtraBackground.a(50);
        field_r = null;
        field_o = null;
        field_u = null;
        field_s = null;
        field_t = null;
        field_q = null;
    }

    SetUseExtraBackground(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = new kba();
        field_r = "Long arm";
        field_s = "Add action (Set custom variable)";
        field_o = "Macroing or use of bots";
        field_t = "Your rating is <%0>";
        field_p = true;
        field_u = "Names can only contain letters, numbers, spaces and underscores";
    }
}
