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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.b((byte) 0, this.field_f);
              param0.a((byte) -53, this.field_d);
              if (param1 == -26216) {
                break L1;
              } else {
                this.field_d = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("cfa.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
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
