/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends je {
    static String field_Ib;
    static int[] field_Jb;
    private je field_Kb;

    final boolean a(byte param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        if (param0 == 102) {
          this.a(true, true);
          if (tr.field_A == 0) {
            if (this.field_Kb.field_yb != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            if (-1 != (this.field_yb ^ -1)) {
              L0: {
                if (this.field_Kb.field_yb == 0) {
                  stackIn_21_0 = 0;
                  break L0;
                } else {
                  stackIn_21_0 = 1;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackIn_17_0 = 1;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          hk.k(-40);
          this.a(true, true);
          if (tr.field_A != 0) {
            if (-1 == (this.field_yb ^ -1)) {
              return true;
            } else {
              L1: {
                if (this.field_Kb.field_yb == 0) {
                  stackIn_10_0 = 0;
                  break L1;
                } else {
                  stackIn_10_0 = 1;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (this.field_Kb.field_yb == 0) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void k(int param0) {
        te var1 = null;
        int var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            l.field_a.d();
            mt.field_e.d();
            qu.field_p = qu.field_p - 1;
            if (param0 != 128) {
                hk.k(94);
            }
            if (-1 == (qu.field_p ^ -1)) {
                qu.field_p = 200;
                var1 = (te) ((Object) bl.field_h.e((byte) 118));
                while (var1 != null) {
                    if (!(var1.field_k.c(param0 ^ 65408))) {
                        var1.d(param0 ^ 247);
                    }
                    var1 = (te) ((Object) bl.field_h.a((byte) 123));
                }
                if (null != ts.field_e) {
                    var1 = (te) ((Object) ts.field_e.e((byte) 120));
                    while (var1 != null) {
                        if (!(var1.field_k.c(65280))) {
                            var1.d(-126);
                        }
                        var1 = (te) ((Object) ts.field_e.a((byte) 123));
                    }
                }
            }
            if (au.field_Kb != null) {
                if (!au.field_Kb.g(param0 + 11771)) {
                    lo.field_u = null;
                    return;
                }
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "hk.A(" + param0 + ')');
        }
    }

    public static void l(int param0) {
        if (param0 >= -103) {
            return;
        }
        field_Jb = null;
        field_Ib = null;
    }

    hk(je param0, je param1, je param2, je param3, je param4, je param5) {
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
        je var8 = null;
        je var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        je var13 = null;
        je var14 = null;
        int var15 = 0;
        je var17 = null;
        try {
          L0: {
            var17 = new je(0L, param1, oj.field_x.toUpperCase());
            var17.field_Eb = 1;
            this.field_Kb = new je(0L, param2);
            var8 = new je(0L, param3);
            var9 = new je(0L, param3, co.field_j);
            var9.field_Eb = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (cl.field_z.length <= var12) {
                var10 += 15;
                var17.a(24, -20500, var11 + 110, 0, 0);
                this.a(var10 + var17.field_ob, -20500, var17.field_gb, 100, 100);
                this.field_Kb.a(15, -20500, 15, 5, -20 + var17.field_gb);
                var8.a(-var17.field_ob + this.field_ob, -20500, this.field_gb, var17.field_ob, 0);
                var9.a(15, -20500, this.field_gb, 20, 0);
                var8.field_G = tq.a(11579568, false, var8.field_ob, 2105376, 3, 8421504);
                var17.a(this.field_Kb, 64);
                var8.a(var9, 111);
                this.a(var17, 98);
                this.a(var8, 42);
                this.field_S = -(this.field_gb >> -643698719) + 320;
                var10 = 240 + -(this.field_ob >> 420524033);
                break L0;
              } else {
                L2: {
                  var13 = new je(0L, param3, bt.field_c[var12]);
                  var14 = new je(0L, param3, cl.field_z[var12]);
                  var15 = param3.field_Z.a(cl.field_z[var12]);
                  if ((var11 ^ -1) <= (var15 ^ -1)) {
                    break L2;
                  } else {
                    var11 = var15;
                    break L2;
                  }
                }
                var13.a(15, -20500, 65, var10, 20);
                var14.a(15, -20500, 640, var10, 90);
                var8.a(var13, 124);
                var8.a(var14, 122);
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

            stackIn_10_1 = new StringBuilder().append("hk.<init>(");

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
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_Ib = "Email address is unavailable";
        field_Jb = new int[]{128, 128, 128, 128, 64, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 64, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 96, 128, 96, 128, 96, 96, 128, 96, 128, 128, 256, 128, 128, 128, 128, 128, 128, 128, 128, 96, 96, 96, 128, 96, 96, 128, 96, 64, 64, 160, 128, 96, 128, 128, 128, 128, 128, 128, 96, 64, 64, 64, 128, 0, 0, 0, 64, 128, 128, 128, 128, 128, 128, 96, 128};
    }
}
