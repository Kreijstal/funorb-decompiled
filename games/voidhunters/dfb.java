/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dfb extends rqa {
    static String field_o;
    static String field_p;
    static long field_q;

    final static void a(int param0) {
        if (null != klb.field_r) {
          klb.field_r.e(param0 - 4299);
          if (param0 == 4410) {
            if (null == vqa.field_i) {
              fha.e(95);
              return;
            }
            vqa.field_i.g(25880);
            fha.e(95);
            return;
          }
          field_o = (String) null;
          if (null != vqa.field_i) {
            vqa.field_i.g(25880);
            fha.e(95);
            return;
          }
          fha.e(95);
          return;
        }
        if (param0 != 4410) {
          field_o = (String) null;
          if (null == vqa.field_i) {
            fha.e(95);
            return;
          }
          vqa.field_i.g(25880);
          fha.e(95);
          return;
        }
        if (null == vqa.field_i) {
          fha.e(95);
          return;
        }
        vqa.field_i.g(25880);
        fha.e(95);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -119) {
            stackIn_4_0 = new nc(mbb.field_b);
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("dfb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
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
