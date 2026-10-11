/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jh {
    static vh field_a;
    static cg field_d;
    static String field_g;
    static String field_b;
    static dd field_e;
    static int field_c;
    static String field_f;

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_d = null;
        if (param0 != 21546) {
          return;
        }
        field_e = null;
        field_f = null;
        field_a = null;
    }

    final static void a(int param0, String param1, String param2, int param3, String param4, boolean param5) {
        pn var6 = null;
        RuntimeException var6_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new pn(param3, param4, param0, param2, param1);
          oa.a(-63, var6);
          if (param5) {
            return;
          }
          field_e = (dd) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_5_0 = var6_ref;
          stackIn_5_1 = new StringBuilder().append("jh.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(')').toString());
        }
    }

    final static int[] a(int param0, byte param1, int[] param2) {
        RuntimeException var3 = null;
        int[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 108) {
            jh.a(92);
          }
          stackIn_3_0 = qg.a(123, 0, param2, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jh.IA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_b = "Withdraw invitation to <%0> to join this game";
        field_g = "Name";
        field_f = "Add <%0> to ignore list";
    }
}
