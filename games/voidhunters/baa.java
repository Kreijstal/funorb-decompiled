/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class baa extends rqa {
    static dja field_o;
    static int field_p;
    static volatile int field_q;

    final static void a(boolean param0, asb param1, asb param2, asb param3, boolean param4) {
        try {
            wba.field_p = gi.a("", (byte) 110);
            wba.field_p.a(7861, param4);
            uo.a(param3, param2, param1, 0);
            ieb.e(121);
            dn.field_r = kla.field_d;
            lrb.field_b = kla.field_d;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "baa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    baa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
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
                var4 = (nc[]) null;
                this.a((nc[]) null, 42);
                break L1;
              }
            }
            stackIn_3_0 = new nc(rfa.field_p);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("baa.A(");

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

    public static void e(byte param0) {
        field_o = null;
        if (param0 != -47) {
            asb var2 = (asb) null;
            baa.a(true, (asb) null, (asb) null, (asb) null, false);
        }
    }

    static {
        field_o = (dja) ((Object) new isb());
        field_p = 27;
        field_q = 0;
    }
}
