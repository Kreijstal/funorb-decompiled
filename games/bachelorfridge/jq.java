/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq extends k {
    static du field_l;
    static int[] field_k;

    final void a(byte param0, lu param1, int param2) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (-1 == (param2 ^ -1)) {
                L2: {
                  stackIn_4_0 = this;

                  if ((param1.b(16711935) ^ -1) != -2) {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 1;
                    break L2;
                  }
                }
                ((jq) (this)).field_f = stackIn_5_1 != 0;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 == -71) {
                break L3;
              } else {
                this.a(-28, -75);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("jq.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        try {
            if (-12 == (jv.field_j ^ -1)) {
                dja.b(false);
            }
            nl.a(qd.field_q, mp.field_p, wk.field_b, -36);
            if (param1 > -122) {
                field_k = (int[]) null;
            }
            av.a(0, -77, param0, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "jq.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int[] a(int param0, int param1) {
        int[] var3;
        int var7;
        int var8;
        int var9;
        int[] var13;
        int[] var14;
        int[] var15;
        L0: {
          var9 = BachelorFridge.field_y;
          var3 = this.field_j.a(param0, -1);
          if (this.field_j.field_m) {
            var15 = this.a(0, param0, (byte) 116);
            var14 = this.a(1, param0, (byte) 115);
            var13 = this.a(2, param0, (byte) 118);
            var7 = 0;
            L1: while (true) {
              if (var7 >= hh.field_d) {
                break L0;
              } else {
                var8 = var13[var7];
                if ((var8 ^ -1) == -4097) {
                  var3[var7] = var15[var7];
                  var7++;
                  continue L1;
                } else {
                  if (0 != var8) {
                    var3[var7] = var8 * var15[var7] + var14[var7] * (-var8 + 4096) >> -2069743956;
                    var7++;
                    continue L1;
                  } else {
                    var3[var7] = var14[var7];
                    var7++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param1 == 0) {
            break L2;
          } else {
            field_l = (du) null;
            break L2;
          }
        }
        return var3;
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3;
        int[] var7;
        int[] var8;
        int[] var9;
        int var16;
        int var17;
        int var19;
        int[][] var20;
        int[][] var21;
        int[][] var31;
        int[][] var50;
        int[][] var51;
        int[] var52;
        int[] var53;
        int[] var54;
        int[] var55;
        int[] var56;
        int[] var57;
        int[] var58;
        int var18;
        L0: {
          var19 = BachelorFridge.field_y;
          var31 = this.field_h.a(param1, -858);
          var21 = var31;
          var20 = var21;
          var3 = var20;
          if (!this.field_h.field_b) {
            break L0;
          } else {
            var52 = this.a(2, param1, (byte) 114);
            var50 = this.a((byte) -112, 0, param1);
            var51 = this.a((byte) -98, 1, param1);
            var7 = var31[0];
            var8 = var31[1];
            var9 = var31[2];
            var53 = var50[0];
            var54 = var50[1];
            var55 = var50[2];
            var56 = var51[0];
            var57 = var51[1];
            var58 = var51[2];
            var16 = 0;
            L1: while (true) {
              if (hh.field_d <= var16) {
                break L0;
              } else {
                var17 = var52[var16];
                if (4096 != var17) {
                  var56 = var51[0];
                  if (var17 == 0) {
                    var56 = var51[0];
                    var7[var16] = var56[var16];
                    var8[var16] = var57[var16];
                    var9[var16] = var58[var16];
                    var16++;
                    continue L1;
                  } else {
                    var18 = -var17 + 4096;
                    var7[var16] = var53[var16] * var17 - -(var18 * var56[var16]) >> -867195412;
                    var8[var16] = var57[var16] * var18 + var17 * var54[var16] >> -1538485556;
                    var9[var16] = var58[var16] * var18 + var55[var16] * var17 >> -208183220;
                    var16++;
                    continue L1;
                  }
                } else {
                  var7[var16] = var53[var16];
                  var8[var16] = var54[var16];
                  var9[var16] = var55[var16];
                  var16++;
                  continue L1;
                }
              }
            }
          }
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            field_k = (int[]) null;
            break L2;
          }
        }
        return var3;
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_k = (int[]) null;
        }
        field_k = null;
        field_l = null;
    }

    final static rga a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        rga var7 = null;
        int var8 = 0;
        rga stackIn_4_0 = null;
        rga stackIn_7_0 = null;
        rga stackIn_10_0 = null;
        rga stackIn_18_0 = null;
        rga stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackIn_4_0 = uc.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-256 <= (var2_int ^ -1)) {
                var3 = fda.a(-1, '.', param1);
                if (-3 >= (var3.length ^ -1)) {
                  L1: {
                    var4 = var3;
                    if (param0 >= 19) {
                      break L1;
                    } else {
                      field_k = (int[]) null;
                      break L1;
                    }
                  }
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4.length) {
                      stackIn_21_0 = lia.a(-58, var3[var3.length - 1]);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = ol.a(var6, 5431);
                      if (var7 != null) {
                        stackIn_18_0 = (rga) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  stackIn_10_0 = uc.field_j;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = rm.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("jq.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return stackIn_21_0;
              }
            }
          }
        }
    }

    public jq() {
        super(3, false);
    }

    static {
        field_l = new du(14, 0, 4, 1);
    }
}
