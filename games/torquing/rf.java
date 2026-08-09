/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends pc {
    static int[][] field_q;
    private int field_y;
    static boolean[] field_x;
    private int field_v;
    private t[] field_s;
    private int field_w;
    static String field_u;
    static ei field_t;
    static int[] field_r;

    final static sm[] a(byte param0) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        if (param0 != 66) {
            return (sm[]) null;
        }
        sm[] var1 = new sm[ti.field_g];
        for (var2 = 0; ti.field_g > var2; var2++) {
            var1[var2] = new sm(fm.field_E, rh.field_d, fj.field_o[var2], na.field_G[var2], vo.field_b[var2], ij.field_o[var2], pn.field_b[var2], cq.field_y);
        }
        go.b(0);
        return var1;
    }

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        gm var9 = null;
        try {
          L0: {
            L1: {
              if (!param4.field_s) {
                if (param4.g(2)) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param0 > 89) {
                break L2;
              } else {
                var9 = (gm) null;
                this.a(-79, -81, -76, false, (gm) null);
                break L2;
              }
            }
            L3: {
              if (!(param4 instanceof lg)) {
                break L3;
              } else {
                param3 = param3 & ((lg) ((Object) param4)).field_x;
                break L3;
              }
            }
            L4: {
              if (param3) {
                if (var6_int != 0) {
                  stackIn_15_0 = this.field_v;
                  break L4;
                } else {
                  stackIn_15_0 = this.field_w;
                  break L4;
                }
              } else {
                stackIn_15_0 = this.field_y;
                break L4;
              }
            }
            L5: {
              var7 = stackIn_15_0;
              if (!param3) {
                stackIn_18_0 = 7105644;
                break L5;
              } else {
                stackIn_18_0 = 16777215;
                break L5;
              }
            }
            var8 = stackIn_18_0;
            wp.a(param1 + (param4.field_k + (-this.field_s[0].field_u + param4.field_o >> 1640841537)), var7, param4.field_p, false, param4.field_w + param2, this.field_s);
            this.field_m.a(param4.field_m, param2 + param4.field_w, -2 + (param1 + param4.field_k), param4.field_p, param4.field_o, var8, -1, 1, 1, this.field_m.field_x);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("rf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    public static void b(byte param0) {
        field_x = null;
        field_q = (int[][]) null;
        field_r = null;
        field_t = null;
        if (param0 < 59) {
            field_r = (int[]) null;
        }
        field_u = null;
    }

    final static int a(String[] args, uc param1, int param2, int param3, String param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var5_int = param1.a(param4);
              if (param2 < var5_int) {
                break L1;
              } else {
                if (-1 == param4.indexOf("<br>")) {
                  args[0] = param4;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var6 = (-1 + param2 + var5_int) / param2;
              param2 = var5_int / var6;
              var6 = 0;
              if (param3 >= 51) {
                break L2;
              } else {
                field_u = (String) null;
                break L2;
              }
            }
            var7 = 0;
            var8 = param4.length();
            var9 = 0;
            L3: while (true) {
              if (var9 >= var8) {
                L4: {
                  if (var8 > var7) {
                    incrementValue$0 = var6;
                    var6++;
                    args[incrementValue$0] = param4.substring(var7, var8).trim();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackIn_27_0 = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param4.charAt(var9);
                    if (var10 == 32) {
                      break L6;
                    } else {
                      if (var10 != 45) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var11 = param4.substring(var7, var9 + 1).trim();
                  var12 = param1.a(var11);
                  if (param2 <= var12) {
                    incrementValue$1 = var6;
                    var6++;
                    args[incrementValue$1] = var11;
                    var7 = var9 + 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (var10 == 62) {
                  if (param4.regionMatches(var9 - 3, "<br>", 0, 4)) {
                    incrementValue$2 = var6;
                    var6++;
                    args[incrementValue$2] = param4.substring(var7, -3 + var9).trim();
                    var7 = var9 + 1;
                    var9++;
                    continue L3;
                  } else {
                    var9++;
                    continue L3;
                  }
                } else {
                  var9++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("rf.D(");

            if (args == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L9;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_31_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_27_0;
        }
    }

    public rf() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, int param1) {
        if (param1 <= 35) {
            field_r = (int[]) null;
        }
        qp.field_j = (param0 & 63) >> -1649279804;
        if ((qp.field_j ^ -1) < -3) {
            qp.field_j = 2;
        }
        fj.field_k = param0 >> -2139565534 & 3;
        if (fj.field_k > 2) {
            fj.field_k = 2;
        }
        m.field_l = param0 & 3;
        if (m.field_l > 2) {
            m.field_l = 2;
        }
    }

    private rf(int param0, int param1, int param2) {
        this.field_s = dg.field_g;
        this.field_y = param2;
        this.field_v = param1;
        this.field_w = param0;
        this.field_m = pe.field_E;
    }

    static {
        field_q = new int[][]{new int[]{0, 11, 2, 13, 6, 10, 3, 16, 21}, new int[]{4, 2, 13, 10, 11, 5}, new int[]{14, 12}, new int[]{8, 9, 14}, new int[]{22, 12, 23}, new int[]{}, new int[]{14, 1}, new int[]{14, 15}, new int[]{3, 12}, new int[]{18, 19, 17, 14, 12}, new int[]{12}, new int[]{1, 24}};
        field_x = new boolean[field_q.length];
        field_x[4] = true;
        field_x[11] = true;
        field_x[3] = true;
        field_t = new ei();
    }
}
