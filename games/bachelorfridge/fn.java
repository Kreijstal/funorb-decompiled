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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
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
            var13 = new int[4];
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
                  rl.field_p.field_g = 0;
                  if (param0 == -68) {
                    break L5;
                  } else {
                    field_k = (int[]) null;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    rl.field_p.a(param1, -108, param6, param5);
                    rl.field_p.a(var7_int, false);
                    rl.field_p.a(var13, 0);
                    if (null == gu.field_a) {
                      break L7;
                    } else {
                      if (-101 < (gu.field_a.field_h.length ^ -1)) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  gu.field_a = new lu(100);
                  break L6;
                }
                gu.field_a.field_g = 0;
                gu.field_a.d(10, param0 + 68);
                var11 = 0;
                var9 = var11;
                L8: while (true) {
                  if ((var11 ^ -1) <= -5) {
                    gu.field_a.b(param6, param0 ^ 53);
                    gu.field_a.a(param3, 0, param2);
                    param4.a(0, -82, gu.field_a.field_g, gu.field_a.field_h);
                    param4.a(0, param0 ^ 35, rl.field_p.field_g, rl.field_p.field_h);
                    break L0;
                  } else {
                    gu.field_a.e(var13[var11], -1615464796);
                    var11++;
                    continue L8;
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
          L9: {
            var7 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var7);
            stackOut_21_1 = new StringBuilder().append("fn.F(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
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
          L10: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          L12: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param5 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L12;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L12;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param6 + ')');
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
              if (-1 == (var4_int ^ -1)) {
                this.field_l = param1.e((byte) 87);
                break L1;
              } else {
                if (1 != var4_int) {
                  if (-3 != (var4_int ^ -1)) {
                    break L1;
                  } else {
                    this.field_o = param1.e((byte) 117);
                    break L1;
                  }
                } else {
                  this.field_q = param1.e((byte) 81);
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -71) {
                break L2;
              } else {
                field_k = (int[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("fn.E(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    public static void f(byte param0) {
        if (param0 < 75) {
            kv var2 = (kv) null;
            fn.a(-79, (byte) 41, 48, -26, -58, (kv) null);
        }
        field_k = null;
        field_n = null;
        field_m = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, kv param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            param4 -= 3;
            var6_int = 0;
            if (param1 == 11) {
              var7 = 0;
              L1: while (true) {
                if (var7 >= param5.field_p) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= param2) {
                      var6_int = var6_int + (param5.field_q + -param2);
                      var7++;
                      continue L1;
                    } else {
                      L3: {
                        if (param5.field_v[var6_int] > 0) {
                          tla.a(param3 + var8, param1 + -1898743715, param0, param4 - -var7, 255 & param5.field_v[var6_int]);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var6_int++;
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("fn.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
            this.field_o = 4;
            break L0;
          }
        }
        L1: {
          var18 = this.field_j.a(param0, param1 + -1);
          var3 = var18;
          if (!this.field_j.field_m) {
            break L1;
          } else {
            var7 = this.field_l * qna.field_k >> 1872123404;
            var26 = this.a(0, param0 + -1 & it.field_r, (byte) 125);
            var9 = this.a(0, param0, (byte) 120);
            var25 = this.a(0, it.field_r & param0 - -1, (byte) 109);
            var11 = 0;
            L2: while (true) {
              if (hh.field_d <= var11) {
                break L1;
              } else {
                L3: {
                  var12 = var7 * (var25[var11] - var26[var11]) >> -1387512916;
                  var13 = var7 * (-var9[1 + var11 & wp.field_r] + var9[wp.field_r & -1 + var11]) >> 730152556;
                  var14 = var13 >> 735982212;
                  if (-1 >= (var14 ^ -1)) {
                    break L3;
                  } else {
                    var14 = -var14;
                    break L3;
                  }
                }
                L4: {
                  var15 = var12 >> 2135606116;
                  if (-256 <= (var14 ^ -1)) {
                    break L4;
                  } else {
                    var14 = 255;
                    break L4;
                  }
                }
                L5: {
                  if ((var15 ^ -1) <= -1) {
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
                var16 = ti.field_a[(var15 * (var15 + 1) >> -1070155391) + var14] & 255;
                var5 = var12 * var16 >> -179356376;
                var4 = var16 * var13 >> 796510792;
                var6 = var16 * 4096 >> 1846738056;
                var4 = var4 * this.field_p[0] >> 1651688748;
                var6 = this.field_p[2] * var6 >> 1823238316;
                var5 = var5 * this.field_p[1] >> 838917548;
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
        this.field_l = 4096;
        this.field_p = new int[3];
        this.field_q = 3216;
        this.field_o = 3216;
    }

    private final void e(byte param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var2 = Math.cos((double)((float)this.field_o / 4096.0f));
          this.field_p[0] = (int)(var2 * Math.sin((double)((float)this.field_q / 4096.0f)) * 4096.0);
          this.field_p[1] = (int)(var2 * Math.cos((double)((float)this.field_q / 4096.0f)) * 4096.0);
          this.field_p[2] = (int)(Math.sin((double)((float)this.field_o / 4096.0f)) * 4096.0);
          var4 = this.field_p[0] * this.field_p[0] >> 1923460748;
          var5 = this.field_p[1] * this.field_p[1] >> 701249580;
          var6 = this.field_p[2] * this.field_p[2] >> -963988980;
          var8 = -28 % ((param0 - -21) / 62);
          var7 = (int)(Math.sqrt((double)(var4 - (-var5 - var6) >> -1945478004)) * 4096.0);
          if (-1 == (var7 ^ -1)) {
            break L0;
          } else {
            this.field_p[2] = (this.field_p[2] << -1214957588) / var7;
            this.field_p[0] = (this.field_p[0] << 225587212) / var7;
            this.field_p[1] = (this.field_p[1] << -789247220) / var7;
            break L0;
          }
        }
    }

    final void d(byte param0) {
        if (param0 != -68) {
            kv var3 = (kv) null;
            fn.a(90, (byte) 41, -54, -20, 63, (kv) null);
        }
        this.e((byte) -97);
    }

    static {
        field_m = new cf();
    }
}
