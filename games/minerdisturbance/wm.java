/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    static String field_c;
    static jf field_f;
    static boolean field_e;
    static ea[] field_g;
    private int field_h;
    private int field_b;
    private int[][] field_a;
    static String field_d;

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_f = null;
        if (param0 != -7) {
            int discarded$0 = 0;
            wm.a();
        }
        field_d = null;
    }

    final byte[] a(boolean param0, byte[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        byte[] stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((wm) this).field_h = -34;
                break L1;
              }
            }
            L2: {
              if (((wm) this).field_a != null) {
                var3_int = 14 + (int)((long)((wm) this).field_h * (long)param1.length / (long)((wm) this).field_b);
                var20 = new int[var3_int];
                var18 = var20;
                var16 = var18;
                var14 = var16;
                var4 = var14;
                var5 = 0;
                var6 = 0;
                var7 = 0;
                L3: while (true) {
                  if (param1.length <= var7) {
                    param1 = new byte[var3_int];
                    var12 = 0;
                    var7 = var12;
                    L4: while (true) {
                      if (~var12 <= ~var3_int) {
                        break L2;
                      } else {
                        L5: {
                          var8 = 32768 + var20[var12] >> 16;
                          if (-128 > var8) {
                            param1[var12] = (byte) -128;
                            break L5;
                          } else {
                            if (var8 > 127) {
                              param1[var12] = (byte) 127;
                              break L5;
                            } else {
                              param1[var12] = (byte)var8;
                              break L5;
                            }
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    var8 = param1[var7];
                    var19 = ((wm) this).field_a[var6];
                    var10 = 0;
                    L6: while (true) {
                      if (var10 >= 14) {
                        var6 = var6 + ((wm) this).field_h;
                        var10 = var6 / ((wm) this).field_b;
                        var6 = var6 - ((wm) this).field_b * var10;
                        var5 = var5 + var10;
                        var7++;
                        continue L3;
                      } else {
                        var4[var5 + var10] = var4[var5 + var10] + var8 * var19[var10];
                        var10++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_19_0 = (byte[]) param1;
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("wm.E(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_20_0;
    }

    final int b(int param0, byte param1) {
        if (((wm) this).field_a != null) {
            param0 = (int)((long)param0 * (long)((wm) this).field_h / (long)((wm) this).field_b);
        }
        if (param1 < 4) {
            return -99;
        }
        return param0;
    }

    final static void a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MinerDisturbance.field_ab;
        try {
          L0: {
            var1_int = -1 + ke.field_X.length;
            L1: while (true) {
              if (var1_int < 0) {
                int discarded$2 = 0;
                wm.a();
                break L0;
              } else {
                ke.field_X[var1_int] = false;
                var1_int--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "wm.D(" + false + ')');
        }
    }

    final int a(int param0, byte param1) {
        if (null != ((wm) this).field_a) {
            param0 = 6 + (int)((long)param0 * (long)((wm) this).field_h / (long)((wm) this).field_b);
        }
        if (param1 > -98) {
            int discarded$0 = ((wm) this).b(96, (byte) -119);
        }
        return param0;
    }

    wm(int param0, int param1) {
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
          var3 = sa.a(param1, param0, 0);
          param0 = param0 / var3;
          param1 = param1 / var3;
          ((wm) this).field_b = param0;
          ((wm) this).field_h = param1;
          ((wm) this).field_a = new int[param0][14];
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
              return;
            } else {
              L1: {
                var5 = ((wm) this).field_a[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(-7.0 + var6 + 1.0);
                if (var8 >= 0) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(7.0 + var6);
                if (var9 <= 14) {
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
                      var12 = 3.141592653589793 * (-var6 + (double)var8);
                      var14 = var10;
                      if (-0.0001 > var12) {
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
                  var14 = var14 * (0.54 + Math.cos((-var6 + (double)var8) * 0.2243994752564138) * 0.46);
                  var5[var8] = (int)Math.floor(0.5 + var14 * 65536.0);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Player Name: ";
    }
}
