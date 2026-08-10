/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends w {
    static String field_Nb;
    static w field_Rb;
    private w field_Pb;
    static String field_Qb;
    static String field_Ob;

    public static void e(int param0) {
        if (param0 != 15338) {
            field_Nb = (String) null;
        }
        field_Nb = null;
        field_Ob = null;
        field_Qb = null;
        field_Rb = null;
    }

    bk(w param0, w param1, w param2, w param3, w param4, w param5) {
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
        w var8 = null;
        w var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        w var13 = null;
        w var14 = null;
        int var15 = 0;
        w var17 = null;
        try {
          L0: {
            var17 = new w(0L, param1, gk.field_Gb.toUpperCase());
            var17.field_X = 1;
            this.field_Pb = new w(0L, param2);
            var8 = new w(0L, param3);
            var9 = new w(0L, param3, dc.field_c);
            var9.field_X = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (var12 >= dk.field_j.length) {
                var17.a(20 + var11 - -90, 0, 0, 24, 0);
                var10 += 15;
                this.a(var17.field_mb, 0, 100, var10 - -var17.field_N, 100);
                this.field_Pb.a(15, 0, 5, 15, var17.field_mb + -20);
                var8.a(this.field_mb, 0, var17.field_N, this.field_N - var17.field_N, 0);
                var9.a(this.field_mb, 0, 20, 15, 0);
                var8.field_lb = ea.a(2105376, -20982, 3, var8.field_N, 8421504, 11579568);
                var17.a(this.field_Pb, -16834);
                var8.a(var9, -16834);
                this.a(var17, -16834);
                this.a(var8, -16834);
                this.field_vb = -(this.field_mb >> 1562314049) + 320;
                var10 = -(this.field_N >> 757186753) + 240;
                break L0;
              } else {
                L2: {
                  var13 = new w(0L, param3, uf.field_B[var12]);
                  var14 = new w(0L, param3, dk.field_j[var12]);
                  var15 = param3.field_J.a(dk.field_j[var12]);
                  if (var15 <= var11) {
                    break L2;
                  } else {
                    var11 = var15;
                    break L2;
                  }
                }
                var13.a(65, 0, var10, 15, 20);
                var14.a(640, 0, var10, 15, 90);
                var8.a(var13, -16834);
                var8.a(var14, -16834);
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

            stackIn_10_1 = new StringBuilder().append("bk.<init>(");

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
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_26_2 + ')');
        }
    }

    final boolean b(int param0, boolean param1) {
        vj var4;
        int stackIn_9_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            var4 = (vj) null;
            bk.a((byte) 4, 96, (vj) null);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              this.a(false, true);
              if (-1 == (ig.field_Yb ^ -1)) {
                break L3;
              } else {
                if (-1 == (this.field_ob ^ -1)) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (-1 == (this.field_Pb.field_ob ^ -1)) {
              stackIn_9_0 = 0;
              break L1;
            } else {
              break L2;
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static void a(byte param0, int param1, vj param2) {
        int var4 = 0;
        uk var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -93) {
                break L1;
              } else {
                bk.e(40);
                break L1;
              }
            }
            var5 = (uk) ((Object) param2.c((byte) -119));
            L2: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                var5.b(11976, param1);
                var5 = (uk) ((Object) param2.d(true));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("bk.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_Nb = "Game options";
        field_Qb = "Elapsed time";
        field_Ob = "Waiting for extra data";
    }
}
