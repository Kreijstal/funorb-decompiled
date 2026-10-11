/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ena extends rqa {
    static dja field_p;
    static int field_q;
    static String[] field_o;
    static String field_r;

    public static void a(int param0) {
        field_o = null;
        if (param0 >= -57) {
          field_r = (String) null;
          field_r = null;
          field_p = null;
          return;
        }
        field_r = null;
        field_p = null;
    }

    final static void a(int param0, float param1, int param2, int param3, int param4) {
        if (!li.field_i) {
          dma.f(param3, param0, (int)param1, param4);
          if (param2 >= -16) {
            field_p = (dja) null;
            return;
          }
          return;
        }
        if (!lfa.field_j) {
          if (param2 >= -16) {
            field_p = (dja) null;
            return;
          }
          return;
        }
        og.field_r.a(param4 | -16777216, Math.max(1, (int)param1), param3, param0, (byte) -123);
        if (param2 < -16) {
          return;
        }
        field_p = (dja) null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, 79);
          }
          stackIn_3_0 = new nc(frb.a(112, 119));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ena.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ena(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = (dja) ((Object) new ecb());
        field_q = 3;
        field_o = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_r = "Missile scrambler";
    }
}
