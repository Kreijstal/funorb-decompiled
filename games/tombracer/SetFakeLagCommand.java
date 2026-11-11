/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetFakeLagCommand extends ConsoleMethod {
    static boolean field_o;

    final ConsoleValue invoke(ConsoleValue[] param0, int param1) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          jk.setFakeLag(param0[param1].asInt(-178), 0);
          stackIn_1_0 = new ConsoleValue("void");
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("vr.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    SetFakeLagCommand(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
