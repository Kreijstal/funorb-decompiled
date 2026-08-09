/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dfb extends rqa {
    static String field_o;
    static String field_p;
    static long field_q;

    final static void a(int param0) {
        if (null == klb.field_r) {
          if (param0 == 4410) {
            if (null != vqa.field_i) {
              vqa.field_i.g(25880);
              fha.e(95);
              return;
            } else {
              fha.e(95);
              return;
            }
          } else {
            field_o = (String) null;
            if (null != vqa.field_i) {
              vqa.field_i.g(25880);
              fha.e(95);
              return;
            } else {
              fha.e(95);
              return;
            }
          }
        } else {
          klb.field_r.e(param0 + -4299);
          if (param0 != 4410) {
            field_o = (String) null;
            if (null == vqa.field_i) {
              fha.e(95);
              return;
            } else {
              vqa.field_i.g(25880);
              fha.e(95);
              return;
            }
          } else {
            if (null != vqa.field_i) {
              vqa.field_i.g(25880);
              fha.e(95);
              return;
            } else {
              fha.e(95);
              return;
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -119) {
              stackIn_4_0 = new nc(mbb.field_b);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("dfb.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    dfb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(int param0) {
        field_o = null;
        field_p = null;
        if (param0 <= 78) {
            field_o = (String) null;
        }
    }

    static {
        field_p = "<%0> must play 1 more rated game before playing with the current options.";
        field_o = "Remove <%0> from friend list";
    }
}
