/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends le {
    int field_l;
    static vo field_j;
    static String field_k;
    static sg field_i;
    int field_h;
    static jp field_m;

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -251) {
          L0: {
            field_m = (jp) null;
            if ((ej.field_x ^ -1) >= -251) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((ej.field_x ^ -1) >= -251) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void c(byte param0) {
        if (param0 >= -102) {
          field_k = (String) null;
          field_j = null;
          field_i = null;
          field_m = null;
          field_k = null;
          return;
        } else {
          field_j = null;
          field_i = null;
          field_m = null;
          field_k = null;
          return;
        }
    }

    final kk c(int param0) {
        if (param0 < 36) {
          field_m = (jp) null;
          return new kk(this.field_l, this.field_h);
        } else {
          return new kk(this.field_l, this.field_h);
        }
    }

    kk(int param0, int param1) {
        this.field_h = param1;
        this.field_l = param0;
    }

    final static oi a(int param0, byte[] param1) {
        oi var2 = null;
        RuntimeException var2_ref = null;
        oi stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var2 = new oi(param1, sl.field_d, bo.field_o, bn.field_c, uf.field_n, vj.field_m);
                no.f((byte) -87);
                if (param0 == -16491) {
                  break L1;
                } else {
                  kk.c((byte) -90);
                  break L1;
                }
              }
              stackIn_6_0 = (oi) (var2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("kk.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    static {
        field_j = new vo();
        field_m = new jp(1);
    }
}
