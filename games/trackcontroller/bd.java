/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static String[] field_a;
    static vi field_b;

    final static li a(int param0, bh param1) {
        li var2 = null;
        RuntimeException var2_ref = null;
        li stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new li(param1, param1);
          if (param0 != -31085) {
            stackIn_2_0 = (li) null;
            return stackIn_2_0;
          }
          kd.field_a.a((byte) -122, var2);
          qc.field_e.a(param1);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("bd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 <= 30) {
          bd.a(19);
        }
    }

    static {
        field_a = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_b = new vi();
    }
}
