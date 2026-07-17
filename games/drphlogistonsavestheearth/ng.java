/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static he[] field_f;
    private int field_g;
    static he[] field_b;
    private int field_e;
    private int[][] field_a;
    static k field_c;
    static String[] field_d;

    final byte[] a(byte[] param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int var13 = 0;
        int[] var15 = null;
        int[] var17 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -128) {
                break L1;
              } else {
                var12 = null;
                og discarded$1 = ng.a((String) null, 126);
                break L1;
              }
            }
            L2: {
              if (((ng) this).field_a == null) {
                break L2;
              } else {
                var3_int = 14 + (int)((long)param0.length * (long)((ng) this).field_e / (long)((ng) this).field_g);
                var21 = new int[var3_int];
                var19 = var21;
                var17 = var19;
                var15 = var17;
                var4 = var15;
                var5 = 0;
                var6 = 0;
                var7 = 0;
                L3: while (true) {
                  if (param0.length <= var7) {
                    param0 = new byte[var3_int];
                    var13 = 0;
                    var7 = var13;
                    L4: while (true) {
                      if (var13 >= var3_int) {
                        break L2;
                      } else {
                        L5: {
                          var8 = var21[var13] - -32768 >> 16;
                          if (var8 < -128) {
                            param0[var13] = (byte) -128;
                            break L5;
                          } else {
                            if (127 >= var8) {
                              param0[var13] = (byte)var8;
                              break L5;
                            } else {
                              param0[var13] = (byte) 127;
                              break L5;
                            }
                          }
                        }
                        var13++;
                        continue L4;
                      }
                    }
                  } else {
                    var8 = param0[var7];
                    var20 = ((ng) this).field_a[var6];
                    var10 = 0;
                    L6: while (true) {
                      if (var10 >= 14) {
                        var6 = var6 + ((ng) this).field_e;
                        var10 = var6 / ((ng) this).field_g;
                        var6 = var6 - var10 * ((ng) this).field_g;
                        var5 = var5 + var10;
                        var7++;
                        continue L3;
                      } else {
                        var4[var5 - -var10] = var4[var5 - -var10] + var20[var10] * var8;
                        var10++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
            stackOut_18_0 = (byte[]) param0;
            stackIn_19_0 = stackOut_18_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("ng.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
        }
        return stackIn_19_0;
    }

    final int a(int param0, byte param1) {
        if (((ng) this).field_a != null) {
            param0 = (int)((long)param0 * (long)((ng) this).field_e / (long)((ng) this).field_g) + 6;
        }
        if (param1 != 101) {
            field_c = null;
        }
        return param0;
    }

    final static og a(String param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        og stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        og stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (hg.field_ub != lc.field_h) {
              if (param1 == 3582) {
                L1: {
                  if (wg.field_u != lc.field_h) {
                    break L1;
                  } else {
                    if (!param0.equals((Object) (Object) cm.field_I)) {
                      break L1;
                    } else {
                      lc.field_h = pj.field_D;
                      stackOut_8_0 = kf.field_a;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0;
                    }
                  }
                }
                kf.field_a = null;
                cm.field_I = param0;
                lc.field_h = hg.field_ub;
                stackOut_10_0 = null;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (og) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (og) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("ng.D(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return (og) (Object) stackIn_11_0;
    }

    final int a(byte param0, int param1) {
        if (!(((ng) this).field_a == null)) {
            param1 = (int)((long)param1 * (long)((ng) this).field_e / (long)((ng) this).field_g);
        }
        if (param0 != -128) {
            return 107;
        }
        return param1;
    }

    ng(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        if (param0 != param1) {
          var3 = qe.a((byte) 26, param0, param1);
          param1 = param1 / var3;
          param0 = param0 / var3;
          ((ng) this).field_a = new int[param0][14];
          ((ng) this).field_g = param0;
          ((ng) this).field_e = param1;
          var4 = 0;
          L0: while (true) {
            if (param0 <= var4) {
              return;
            } else {
              L1: {
                var5 = ((ng) this).field_a[var4];
                var6 = 6.0 + (double)var4 / (double)param0;
                var8 = (int)Math.floor(var6 - 7.0 + 1.0);
                if (var8 >= 0) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(7.0 + var6);
                if (14 >= var9) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var9 <= var8) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    L5: {
                      var12 = ((double)var8 - var6) * 3.141592653589793;
                      var14 = var10;
                      if (var12 < -0.0001) {
                        break L5;
                      } else {
                        if (0.0001 >= var12) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (0.46 * Math.cos(0.2243994752564138 * ((double)var8 - var6)) + 0.54);
                  var5[var8] = (int)Math.floor(var14 * 65536.0 + 0.5);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        field_f = null;
    }

    static {
    }
}
