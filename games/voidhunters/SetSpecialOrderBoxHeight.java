/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetSpecialOrderBoxHeight extends ConsoleCommand {
    static gj field_o;
    static String field_p;
    static String field_q;

    SetSpecialOrderBoxHeight(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_o = null;
          field_q = null;
          field_p = null;
          return;
        }
        field_p = (String) null;
        field_o = null;
        field_q = null;
        field_p = null;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          CarouselSlotStateDump.field_g = arguments[0].a(121);
          if (obfuscationGuard >= -119) {
            field_o = (gj) null;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kj.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_p = "Retry";
        field_o = new gj();
        field_q = "Absorbs all damage";
    }
}
