/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ListTracksCommand extends ConsoleMethod {
    static mla field_p;
    static int field_o;

    public static void releaseStatics(byte param0) {
        field_p = null;
        if (param0 > -120) {
          ListTracksCommand.releaseStatics((byte) 123);
        }
    }

    ListTracksCommand(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue invoke(ConsoleValue[] param0, int param1) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_p = (mla) null;
          }
          stackIn_3_0 = new ConsoleValue(ata.b(-32));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = new mla();
    }
}
