/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cfa extends oib {
    private String field_d;
    private String field_f;
    static String field_e;

    public static void c(byte param0) {
        int var1 = 121 % ((-54 - param0) / 33);
        field_e = null;
    }

    final dka a(byte param0) {
        int var2 = -125 % ((param0 - -7) / 56);
        return bta.field_r;
    }

    final void a(ds param0, int param1) {
        try {
            param0.b((byte) 0, this.field_f);
            param0.a((byte) -53, this.field_d);
            if (param1 != -26216) {
                this.field_d = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "cfa.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static bob b(byte param0) {
        if (param0 > -66) {
          L0: {
            cfa.c((byte) 108);
            if (null == elb.field_f) {
              elb.field_f = new bob(web.field_o, 20, 0, 0, 0, 11579568, -1, 0, 0, web.field_o.field_k, -1, 2147483647, true);
              break L0;
            } else {
              break L0;
            }
          }
          return elb.field_f;
        } else {
          L1: {
            if (null == elb.field_f) {
              elb.field_f = new bob(web.field_o, 20, 0, 0, 0, 11579568, -1, 0, 0, web.field_o.field_k, -1, 2147483647, true);
              break L1;
            } else {
              break L1;
            }
          }
          return elb.field_f;
        }
    }

    cfa(String param0, String param1) {
        try {
            this.field_f = param0;
            this.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "cfa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Offensive account name";
    }
}
