/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends oj {
    static gk field_C;
    static int field_A;
    private int field_B;
    static je[] field_z;
    static String field_y;

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -84) {
                break L1;
              } else {
                field_y = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a((byte) -39, param2, param0, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("rl.A(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        int stackIn_3_0 = 0;
        wk stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        int[][] stackIn_15_3;
        wk stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int[][] stackIn_16_3 = null;
        int stackIn_16_4 = 0;
        int var6;
        int var7;
        jd var8;
        jd var9;
        L0: {
          var8 = vs.field_e[param1].field_c;
          var9 = var8;
          if (var9 == null) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        if (var6 != 0) {
          L1: {
            var7 = jf.field_C.field_q;
            if (var7 >= 0) {
              break L1;
            } else {
              var7 = bv.field_w.field_gb;
              break L1;
            }
          }
          if (!var9.field_u) {
            if (null == var9.field_x) {
              if (param0 != 1) {
                return;
              } else {
                return;
              }
            } else {
              L2: {
                stackIn_15_0 = go.field_g;

                stackIn_15_1 = param2 - -10;

                stackIn_15_2 = 5 + param4;

                stackIn_15_3 = op.field_c;

                if (bv.field_w.field_wb) {
                  stackIn_16_0 = (wk) ((Object) stackIn_15_0);
                  stackIn_16_1 = stackIn_15_1;
                  stackIn_16_2 = stackIn_15_2;
                  stackIn_16_3 = (int[][]) ((Object) stackIn_15_3);
                  stackIn_16_4 = 1;
                  break L2;
                } else {
                  stackIn_16_0 = (wk) ((Object) stackIn_15_0);
                  stackIn_16_1 = stackIn_15_1;
                  stackIn_16_2 = stackIn_15_2;
                  stackIn_16_3 = (int[][]) ((Object) stackIn_15_3);
                  stackIn_16_4 = 0;
                  break L2;
                }
              }
              ((wk) (Object) stackIn_16_0).b(stackIn_16_1, stackIn_16_2, stackIn_16_3[stackIn_16_4][var8.field_O]);
              if (jf.field_C.field_T == var9) {
                go.field_g.f(10 + param2, param4 - -5, (int)(Math.sin((double)ug.field_b / 3.141592653589793) * 64.0) + 128);
                var9.field_x.a((byte) -72, param3);
                if (param0 != 1) {
                  return;
                } else {
                  return;
                }
              } else {
                if (jf.field_C.field_oc == var9) {
                  go.field_g.f(10 + param2, param4 - -5, (int)(Math.sin((double)ug.field_b / 3.141592653589793) * 64.0) + 128);
                  var9.field_x.a((byte) -72, param3);
                  if (param0 != 1) {
                    return;
                  } else {
                    return;
                  }
                } else {
                  var9.field_x.a((byte) -72, param3);
                  if (param0 != 1) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          if (param0 != 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(ha param0, int param1) {
        try {
            if (param1 != -26661) {
                this.a((byte) -70, false);
            }
            param0.field_Bb = true;
            fl.a(param0, -117);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "rl.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String a(byte param0, boolean param1) {
        if (!(!param1)) {
            System.out.println("KBD summon event debug");
            System.out.println("Player " + this.field_B + " summonned KBD");
        }
        int var4 = 71 % ((53 - param0) / 51);
        String var3 = "EventKBD: player: " + this.field_B;
        return var3;
    }

    public static void g(int param0) {
        if (param0 > -33) {
          field_z = (je[]) null;
          field_C = null;
          field_y = null;
          field_z = null;
          return;
        } else {
          field_C = null;
          field_y = null;
          field_z = null;
          return;
        }
    }

    rl(int param0) {
        this.field_B = param0;
        this.field_m = -1;
    }

    static {
        field_A = 0;
        field_y = "You appear to be telling someone your password - please don't!";
    }
}
