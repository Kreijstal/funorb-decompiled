/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class plb extends rqa {
    static String field_o;

    final static boolean a(int param0, boolean param1, int param2) {
        if (param1) {
            return false;
        }
        return 0 != (param0 & 16) ? true : false;
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 16) {
            plb.a(-34, false, 111);
        }
    }

    final static void a(llb param0, llb param1, boolean param2) {
        if (!(param1.field_lb != null)) {
            param1.field_lb = new ij();
        }
        if (!(param0.field_lb != null)) {
            param0.field_lb = new ij();
        }
        if (ae.field_f == null) {
            ae.field_f = new pr(64);
        }
        if (!(null != om.field_c)) {
            om.field_c = new pr(64);
        }
        mr.field_M = param1.field_lb;
        if (!param2) {
            return;
        }
        try {
            st.field_o = param0.field_lb;
            ija.a(85);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "plb.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(137, 114));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("plb.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    plb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "Get the most kills in the time limit";
    }
}
