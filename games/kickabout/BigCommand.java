/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BigCommand extends ConsoleCommand {
    final static String g(int param0) {
        if (param0 != -26370) {
          return (String) null;
        }
        if (nr.field_f == wk.field_f) {
          return qr.field_f;
        }
        if (nr.field_f == mj.field_a) {
          return pr.field_c;
        }
        if (!DualLinkDequeIterator.field_e.a((byte) -80)) {
          return pr.field_c;
        }
        return ep.field_b;
    }

    final ConsoleValue a(byte param0, ConsoleValue[] param1) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 84) {
            stackIn_4_0 = new ConsoleValue(qi.b(3));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ls.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    BigCommand(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
