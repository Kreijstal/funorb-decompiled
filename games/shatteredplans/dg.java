/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends qr {
    static int[] field_yb;
    private qr field_xb;

    final static va g(int param0) {
        va var1 = new va();
        var1.field_k = false;
        var1.field_a = param0;
        var1.field_h = 1;
        var1.field_f = true;
        var1.field_c = 1;
        return var1;
    }

    public static void f(byte param0) {
        field_yb = null;
        int var1 = -29 / ((12 - param0) / 44);
    }

    final boolean c(boolean param0, int param1) {
        int stackIn_9_0 = 0;
        this.a(true, -20429);
        if (param1 == -1) {
          L0: {
            L1: {
              L2: {
                if (je.field_d == 0) {
                  break L2;
                } else {
                  if (this.field_rb == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-1 == (this.field_xb.field_rb ^ -1)) {
                stackIn_9_0 = 0;
                break L0;
              } else {
                break L1;
              }
            }
            stackIn_9_0 = 1;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    dg(qr param0, qr param1, qr param2, qr param3, qr param4, qr param5) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        qr var8 = null;
        qr var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        qr var13 = null;
        qr var14 = null;
        int var15 = 0;
        qr var17 = null;
        try {
          L0: {
            var17 = new qr(0L, param1, qh.field_u.toUpperCase());
            var17.field_y = 1;
            this.field_xb = new qr(0L, param2);
            var8 = new qr(0L, param3);
            var9 = new qr(0L, param3, rn.field_g);
            var9.field_y = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (var12 >= tf.field_c.length) {
                var10 += 15;
                var17.a(20 + var11 + 90, 24, (byte) 113, 0, 0);
                this.a(var17.field_K, var10 + var17.field_mb, (byte) 83, 100, 100);
                this.field_xb.a(15, 15, (byte) 126, 5, -20 + var17.field_K);
                var8.a(this.field_K, -var17.field_mb + this.field_mb, (byte) 79, var17.field_mb, 0);
                var9.a(this.field_K, 15, (byte) 75, 20, 0);
                var8.field_F = cs.a(16, 3, var8.field_mb, 11579568, 8421504, 2105376);
                var17.a(4, this.field_xb);
                var8.a(4, var9);
                this.a(4, var17);
                this.a(4, var8);
                this.field_hb = 320 + -(this.field_K >> -1584323295);
                var10 = -(this.field_mb >> -1174470335) + 240;
                break L0;
              } else {
                L2: {
                  var13 = new qr(0L, param3, bg.field_d[var12]);
                  var14 = new qr(0L, param3, tf.field_c[var12]);
                  var15 = param3.field_nb.c(tf.field_c[var12]);
                  var13.a(65, 15, (byte) 69, var10, 20);
                  if (var15 <= var11) {
                    break L2;
                  } else {
                    var11 = var15;
                    break L2;
                  }
                }
                var14.a(640, 15, (byte) 122, var10, 90);
                var8.a(4, var13);
                var8.a(4, var14);
                var10 += 30;
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7);

            stackIn_10_1 = new StringBuilder().append("dg.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_yb = new int[8192];
    }
}
