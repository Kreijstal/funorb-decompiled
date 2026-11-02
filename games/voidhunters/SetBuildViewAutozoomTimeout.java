/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetBuildViewAutozoomTimeout extends ConsoleCommand {
    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          mbb.field_c = arguments[0].a(64);
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mh.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetBuildViewAutozoomTimeout(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
          if (li.field_i) {
            mmb.field_d[param4].a(param2, param3, 0, 16777215 | param1 << 24, 1);
          }
          return;
        }
    }

    static {
    }
}
