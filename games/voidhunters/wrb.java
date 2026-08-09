/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wrb extends rqa {
    static int[] field_p;
    static String[] field_r;
    static llb field_q;
    static String field_o;

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
                field_q = (llb) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(122, 118));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("wrb.A(");

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

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        field_r = null;
        field_q = null;
        if (param0 != 100) {
            wrb.a(34);
        }
    }

    final static int a(int param0, int param1) {
        if (param0 == 100) {
          if (!li.field_i) {
            return 100;
          } else {
            return mmb.field_d[param1].d();
          }
        } else {
          wrb.a(-120, -74);
          if (!li.field_i) {
            return 100;
          } else {
            return mmb.field_d[param1].d();
          }
        }
    }

    wrb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_r = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_o = "Double Assassination";
    }
}
