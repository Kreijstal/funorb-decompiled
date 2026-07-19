/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends kd {
    static int[] field_E;
    int[] field_F;
    static int[] field_B;
    static int[] field_A;
    private int[][] field_z;
    static int field_C;
    static ul field_H;
    private String[] field_G;
    private int[] field_D;
    static wk field_y;

    final void c(byte param0) {
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        int var2 = -79 % ((param0 - -50) / 55);
        if (this.field_F != null) {
            for (var3 = 0; var3 < this.field_F.length; var3++) {
                this.field_F[var3] = vn.a(this.field_F[var3], 32768);
            }
        }
    }

    final static String[] a(mi param0, int[] param1, int param2, String param3) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        String[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (jh.field_b != null) {
                break L1;
              } else {
                jh.field_b = new String[16];
                break L1;
              }
            }
            L2: while (true) {
              try {
                L3: {
                  var4_int = param0.a(param3, param1, jh.field_b);
                  decompiledRegionSelector0 = 0;
                  break L3;
                }
              } catch (java.lang.ArrayIndexOutOfBoundsException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
                  if ((jh.field_b.length ^ -1) > -1025) {
                    jh.field_b = new String[jh.field_b.length << -241155903];
                    decompiledRegionSelector0 = 1;
                    break L4;
                  } else {
                    return null;
                  }
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L5: {
                  var5 = new String[var4_int];
                  var6 = 0;
                  if (param2 == 18985) {
                    break L5;
                  } else {
                    field_B = (int[]) null;
                    break L5;
                  }
                }
                L6: while (true) {
                  if (var4_int <= var6) {
                    stackOut_13_0 = (String[]) (var5);
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    var5[var6] = jh.field_b[var6];
                    var6++;
                    continue L6;
                  }
                }
              } else {
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("ao.F(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          L8: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          L9: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        return stackIn_14_0;
    }

    final String i(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = SteelSentinels.field_G;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (!(this.field_G != null)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_G[0]);
        for (var3 = param0; this.field_G.length > var3; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_G[var3]);
        }
        return var2.toString();
    }

    public static void g(int param0) {
        field_B = null;
        field_H = null;
        field_A = null;
        if (param0 != 0) {
            return;
        }
        field_E = null;
        field_y = null;
    }

    final void a(gi param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            if (param1 < -68) {
              L1: while (true) {
                var3_int = param0.f((byte) -85);
                if (var3_int != 0) {
                  this.a(var3_int, param0, 100);
                  continue L1;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("ao.E(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void h(int param0) {
        ub.c(param0);
        if (null != sl.field_n) {
            pa.a(sl.field_n, 9174);
        }
        ma.g(0);
        og.b(-115);
        ln.a(param0 ^ -8601);
        if (rn.a((byte) -14)) {
            mm.field_g.a(1, (byte) -117);
            gj.a(0, 0);
        }
        pm.m(param0 + -47);
    }

    ao() {
    }

    private final void a(int param0, gi param1, int param2) {
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        fm var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1) == -2) {
                this.field_G = ka.a('<', false, param1.h(1));
                break L1;
              } else {
                if (-3 == (param0 ^ -1)) {
                  var4_int = param1.f((byte) -114);
                  this.field_F = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      this.field_F[var5] = param1.c((byte) -60);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (3 == param0) {
                    var4_int = param1.f((byte) -99);
                    this.field_z = new int[var4_int][];
                    this.field_D = new int[var4_int];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L4: {
                          var6 = param1.c((byte) -60);
                          var7 = wa.b(var6, 99);
                          if (var7 != null) {
                            this.field_D[var5] = var6;
                            array$1 = new int[var7.field_k];
                            this.field_z[var5] = array$1;
                            var8 = 0;
                            L5: while (true) {
                              if (var7.field_k <= var8) {
                                break L4;
                              } else {
                                this.field_z[var5][var8] = param1.c((byte) -60);
                                var8++;
                                continue L5;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    if (4 == param0) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var4_int = 108 % ((-29 - param2) / 44);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("ao.B(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
    }

    static {
        int var0 = 0;
        int[] var1 = null;
        int var2 = 0;
        field_A = jg.a(true);
        field_A[0] = -410976256;
        int[] var3 = field_A;
        var3[1] = vn.a(var3[1], 32);
        field_E = jg.a(true);
        int[] var4 = field_E;
        var4[1] = vn.a(var4[1], 8);
        field_E[0] = -1711275968;
        int[] var5 = field_E;
        var5[1] = vn.a(var5[1], 16);
        field_B = jg.a(true);
        field_B[0] = 64712;
        for (var0 = 32; -37 <= (var0 ^ -1); var0++) {
            var1 = field_B;
            var2 = var0;
            var1[var2 >> 1103429125] = vn.a(var1[var2 >> 1103429125], 1 << ec.a(31, var2));
        }
        int[] var6 = field_A;
        var6[1] = vn.a(var6[1], 64);
    }
}
