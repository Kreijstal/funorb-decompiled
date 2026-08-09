/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends gg {
    int field_l;
    qi field_h;
    static int[] field_i;
    gg field_m;
    static String field_j;
    static int field_k;

    public static void a(int param0) {
        if (param0 != 5010) {
            field_k = -79;
            field_j = null;
            field_i = null;
            return;
        }
        field_j = null;
        field_i = null;
    }

    final static void a(byte param0, lc param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        jd var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = id.field_c;
            var5.e(param2, -2147483648);
            var5.field_m = var5.field_m + 1;
            var4 = var5.field_m;
            var5.c(-102, 1);
            var5.c(106, param1.field_n);
            var5.a(param1.field_o, (byte) 98);
            var5.b(param1.field_q, false);
            var5.b(param1.field_r, false);
            var5.b(param1.field_j, false);
            var5.b(param1.field_i, false);
            var5.b(true, var4);
            var5.b(1, -var4 + var5.field_m);
            if (param0 < -105) {
              break L0;
            } else {
              field_k = -109;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3);

            stackIn_5_1 = new StringBuilder().append("ud.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        lc var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              vc.field_c = param1;
              h.a(12, true);
              if (param0 == 11692) {
                break L1;
              } else {
                var3 = (lc) null;
                ud.a((byte) 27, (lc) null, -57);
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

            stackIn_5_1 = new StringBuilder().append("ud.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    ud(qi param0, gg param1) {
        try {
            this.field_h = param0;
            this.field_l = param0.e();
            this.field_m = param1;
            this.field_h.h(128 + this.field_l * wc.field_a >> 1828752584);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "FINAL<br>SCORE";
    }
}
