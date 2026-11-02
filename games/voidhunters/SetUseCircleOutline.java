/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetUseCircleOutline extends ConsoleCommand {
    static String field_p;
    static dja field_o;

    SetUseCircleOutline(String param0, Class[] param1, String param2) {
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
            field_o = (dja) null;
          }
          GetReadyRoomMutatorTime.field_p = arguments[0].a(false);
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nha.A(");
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
        if (param0 <= 18) {
          SetUseCircleOutline.e((byte) 115);
          field_p = null;
          return;
        }
        field_p = null;
    }

    static {
        bab discarded$0 = new bab();
        field_p = "(<%0> players want to join)";
        field_o = (dja) ((Object) new av());
    }
}
