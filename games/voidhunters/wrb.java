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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_q = (llb) null;
          }
          stackIn_3_0 = new nc(frb.a(122, 118));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wrb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
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
        if (param0 != 100) {
          wrb.a(-120, -74);
          if (li.field_i) {
            return mmb.field_d[param1].d();
          }
          return 100;
        }
        if (li.field_i) {
          return mmb.field_d[param1].d();
        }
        return 100;
    }

    wrb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_r = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_o = "Double Assassination";
    }
}
