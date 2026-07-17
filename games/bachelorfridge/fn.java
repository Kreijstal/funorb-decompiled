/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends k {
    private int field_l;
    private int[] field_p;
    private int field_o;
    private int field_q;
    static cf field_m;
    static int[] field_k;
    static pia field_n;

    final static void a(byte param0, int param1, java.math.BigInteger param2, java.math.BigInteger param3, lu param4, byte[] param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var7_int = vn.a(-9938, param6);
              if (null != fj.field_i) {
                break L1;
              } else {
                fj.field_i = new java.security.SecureRandom();
                break L1;
              }
            }
            var15 = new int[4];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (var9 >= 4) {
                L3: {
                  L4: {
                    if (null == rl.field_p) {
                      break L4;
                    } else {
                      if (var7_int > rl.field_p.field_h.length) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  rl.field_p = new lu(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    rl.field_p.field_g = 0;
                    rl.field_p.a(0, -108, param6, param5);
                    rl.field_p.a(var7_int, false);
                    rl.field_p.a(var15, 0);
                    if (null == gu.field_a) {
                      break L6;
                    } else {
                      if (gu.field_a.field_h.length < 100) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  gu.field_a = new lu(100);
                  break L5;
                }
                gu.field_a.field_g = 0;
                gu.field_a.d(10, 0);
                var11 = 0;
                var9 = var11;
                L7: while (true) {
                  if (var11 >= 4) {
                    gu.field_a.b(param6, -119);
                    gu.field_a.a(param3, 0, param2);
                    param4.a(0, -82, gu.field_a.field_g, gu.field_a.field_h);
                    param4.a(0, -97, rl.field_p.field_g, rl.field_p.field_h);
                    break L0;
                  } else {
                    gu.field_a.e(var15[var11], -1615464796);
                    var11++;
                    continue L7;
                  }
                }
              } else {
                var8[var9] = fj.field_i.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var7;
            stackOut_19_1 = new StringBuilder().append("fn.F(").append(-68).append(44).append(0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param5 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param6 + 41);
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int == 0) {
                ((fn) this).field_l = param1.e((byte) 87);
                break L1;
              } else {
                if (1 != var4_int) {
                  if (var4_int != 2) {
                    break L1;
                  } else {
                    ((fn) this).field_o = param1.e((byte) 117);
                    break L1;
                  }
                } else {
                  ((fn) this).field_q = param1.e((byte) 81);
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -71) {
                break L2;
              } else {
                field_k = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("fn.E(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
        }
    }

    public static void f() {
        field_k = null;
        field_n = null;
        field_m = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, kv param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var9 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            param4 -= 3;
            var6_int = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("fn.G(").append(90).append(44).append(41).append(44).append(-54).append(44).append(-20).append(44).append(param4).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var25 = null;
        int[] var26 = null;
        L0: {
          var17 = BachelorFridge.field_y;
          if (param1 == 0) {
            break L0;
          } else {
            ((fn) this).field_o = 4;
            break L0;
          }
        }
        L1: {
          var18 = ((fn) this).field_j.a(param0, param1 + -1);
          var3 = var18;
          if (!((fn) this).field_j.field_m) {
            break L1;
          } else {
            var7 = ((fn) this).field_l * qna.field_k >> 12;
            var26 = ((fn) this).a(0, param0 + -1 & it.field_r, (byte) 125);
            var9 = ((fn) this).a(0, param0, (byte) 120);
            var25 = ((fn) this).a(0, it.field_r & param0 - -1, (byte) 109);
            var11 = 0;
            L2: while (true) {
              if (~hh.field_d >= ~var11) {
                break L1;
              } else {
                L3: {
                  var12 = var7 * (var25[var11] - var26[var11]) >> 12;
                  var13 = var7 * (-var9[1 + var11 & wp.field_r] + var9[wp.field_r & -1 + var11]) >> 12;
                  var14 = var13 >> 4;
                  if (var14 >= 0) {
                    break L3;
                  } else {
                    var14 = -var14;
                    break L3;
                  }
                }
                L4: {
                  var15 = var12 >> 4;
                  if (var14 <= 255) {
                    break L4;
                  } else {
                    var14 = 255;
                    break L4;
                  }
                }
                L5: {
                  if (var15 >= 0) {
                    break L5;
                  } else {
                    var15 = -var15;
                    break L5;
                  }
                }
                L6: {
                  if (255 >= var15) {
                    break L6;
                  } else {
                    var15 = 255;
                    break L6;
                  }
                }
                var16 = ti.field_a[(var15 * (var15 + 1) >> 1) + var14] & 255;
                var5 = var12 * var16 >> 8;
                var4 = var16 * var13 >> 8;
                var6 = var16 * 4096 >> 8;
                var4 = var4 * ((fn) this).field_p[0] >> 12;
                var6 = ((fn) this).field_p[2] * var6 >> 12;
                var5 = var5 * ((fn) this).field_p[1] >> 12;
                var18[var11] = var5 + var4 + var6;
                var11++;
                continue L2;
              }
            }
          }
        }
        return var18;
    }

    public fn() {
        super(1, true);
        ((fn) this).field_l = 4096;
        ((fn) this).field_p = new int[3];
        ((fn) this).field_q = 3216;
        ((fn) this).field_o = 3216;
    }

    private final void e() {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var2 = Math.cos((double)((float)((fn) this).field_o / 4096.0f));
          ((fn) this).field_p[0] = (int)(var2 * Math.sin((double)((float)((fn) this).field_q / 4096.0f)) * 4096.0);
          ((fn) this).field_p[1] = (int)(var2 * Math.cos((double)((float)((fn) this).field_q / 4096.0f)) * 4096.0);
          ((fn) this).field_p[2] = (int)(Math.sin((double)((float)((fn) this).field_o / 4096.0f)) * 4096.0);
          var4 = ((fn) this).field_p[0] * ((fn) this).field_p[0] >> 12;
          var5 = ((fn) this).field_p[1] * ((fn) this).field_p[1] >> 12;
          var6 = ((fn) this).field_p[2] * ((fn) this).field_p[2] >> 12;
          var8 = 0;
          var7 = (int)(Math.sqrt((double)(var4 - (-var5 - var6) >> 12)) * 4096.0);
          if (var7 == 0) {
            break L0;
          } else {
            ((fn) this).field_p[2] = (((fn) this).field_p[2] << 12) / var7;
            ((fn) this).field_p[0] = (((fn) this).field_p[0] << 12) / var7;
            ((fn) this).field_p[1] = (((fn) this).field_p[1] << 12) / var7;
            break L0;
          }
        }
    }

    final void d(byte param0) {
        if (param0 != -68) {
            Object var3 = null;
            fn.a(90, (byte) 41, -54, -20, 63, (kv) null);
        }
        int discarded$0 = -97;
        this.e();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new cf();
    }
}
