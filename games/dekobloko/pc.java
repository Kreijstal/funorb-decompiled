/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static String field_c;
    static String field_d;
    static ji field_b;
    static String field_a;
    static String field_e;
    static String field_f;

    final static String a(int param0) {
        if (sh.field_d == pa.field_V) {
          return ve.field_Gc;
        }
        if (param0 != 2) {
          return (String) null;
        }
        return tc.field_Qb;
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 >= -9) {
          return;
        }
        field_e = null;
        field_b = null;
        field_c = null;
        field_f = null;
    }

    final static boolean a(int param0, int param1, long param2, String param3, int[] param4) {
        RuntimeException var6 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            field_a = (String) null;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param4 != null && (param0 != 2 ||
            sg.a(param3, 120, param2))) {
            stackIn_8_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_8_0 = false;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("pc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_c = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_d = "Private";
        field_a = "FINISH<br><%0>";
        field_e = "Change display name";
        field_f = "Return to Main Menu";
    }
}
