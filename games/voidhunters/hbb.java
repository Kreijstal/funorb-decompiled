/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hbb extends f {
    private int[] field_A;
    private int field_q;
    private gnb field_E;
    private int[] field_G;
    private fkb[][] field_O;
    private int[] field_r;
    private q field_u;
    int[] field_j;
    private int field_p;
    private int[] field_K;
    private int[] field_M;
    static byte[] field_N;
    private int[] field_n;
    int[] field_v;
    private int[] field_y;
    private int[] field_t;
    private fkb[][] field_H;
    int[] field_l;
    static int field_z;
    private int[] field_o;
    private int[] field_D;
    private int[] field_I;
    private int[] field_B;
    private int[] field_x;
    private long field_h;
    private int field_m;
    private long field_i;
    private int field_F;
    private ht field_k;
    private boolean field_L;
    private boolean field_s;
    private int field_w;
    private kka field_C;

    private final void a(int param0, int param1) {
        int var4 = VoidHunters.field_G;
        if (param0 != 144) {
            this.b(80, 70, -74);
        }
        fkb var3 = (fkb) ((Object) this.field_k.field_k.d(0));
        while (var3 != null) {
            if (0 > param1 || var3.field_o == param1) {
                if (!(null == var3.field_j)) {
                    var3.field_j.f(vka.field_s / 100);
                    if (var3.field_j.g()) {
                        this.field_k.field_j.b(var3.field_j);
                    }
                    var3.c(25804);
                }
                if ((var3.field_v ^ -1) > -1) {
                    this.field_O[var3.field_o][var3.field_x] = null;
                }
                var3.b(param0 ^ -3990);
            }
            var3 = (fkb) ((Object) this.field_k.field_k.a((byte) 7));
        }
    }

    final synchronized void a(int param0, byte param1, int param2) {
        this.c(param2, param0, param1 ^ 95);
        if (param1 != 96) {
            this.field_v = (int[]) null;
        }
    }

    private final void a(int param0, boolean param1) {
        int var4;
        var4 = VoidHunters.field_G;
        if (-1 < (param0 ^ -1)) {
          param0 = 0;
          L0: while (true) {
            if ((param0 ^ -1) <= -17) {
              return;
            } else {
              this.a(param0, true);
              param0++;
              continue L0;
            }
          }
        } else {
          this.field_x[param0] = 12800;
          this.field_o[param0] = 8192;
          this.field_I[param0] = 16383;
          this.field_t[param0] = 8192;
          this.field_r[param0] = 0;
          this.field_D[param0] = 8192;
          if (param1) {
            this.a(param0, (byte) -123);
            this.b(param0, false);
            this.field_v[param0] = 0;
            this.field_n[param0] = 32767;
            this.field_B[param0] = 256;
            this.field_j[param0] = 0;
            this.d(param0, 8192, 2);
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
            this.a(-128, false);
        }
    }

    private final int a(int param0, fkb param1) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        cja var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        try {
          L0: {
            L1: {
              var3_int = param1.field_d + (param1.field_h * param1.field_l >> 1123501612);
              var3_int = var3_int + (this.field_B[param1.field_o] * (-8192 + this.field_t[param1.field_o]) >> -2100212116);
              if (param0 >= 7) {
                break L1;
              } else {
                this.field_r = (int[]) null;
                break L1;
              }
            }
            L2: {
              var4 = param1.field_g;
              if (-1 <= (var4.field_f ^ -1)) {
                break L2;
              } else {
                L3: {
                  if ((var4.field_i ^ -1) < -1) {
                    break L3;
                  } else {
                    if (0 >= this.field_r[param1.field_o]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_i << 672451458;
                  var6 = var4.field_e << -1880259167;
                  if (param1.field_q >= var6) {
                    break L4;
                  } else {
                    var5 = param1.field_q * var5 / var6;
                    break L4;
                  }
                }
                var5 = var5 + (this.field_r[param1.field_o] >> -495946713);
                var7 = Math.sin(0.01227184630308513 * (double)(param1.field_e & 511));
                var3_int = var3_int + (int)((double)var5 * var7);
                break L2;
              }
            }
            L5: {
              var5 = (int)(0.5 + (double)(param1.field_y.field_f * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)vka.field_s);
              if ((var5 ^ -1) <= -2) {
                stackIn_12_0 = var5;
                break L5;
              } else {
                stackIn_12_0 = 1;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("hbb.BB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized void a(boolean param0, kka param1, int param2) {
        if (param2 != -1) {
            return;
        }
        try {
            this.a(param1, true, -11886, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "hbb.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int b(int param0, fkb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 9259) {
                break L1;
              } else {
                this.c();
                break L1;
              }
            }
            var3_int = this.field_o[param1.field_o];
            if ((var3_int ^ -1) <= -8193) {
              stackIn_6_0 = -((16384 + -var3_int) * (-param1.field_u + 128) - -32 >> -893872346) + 16384;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 32 + param1.field_u * var3_int >> 903130214;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("hbb.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int discarded$0 = 0;
        int var5 = VoidHunters.field_G;
        if (this.field_A[param0] != param2) {
            this.field_A[param0] = param2;
            for (var4 = 0; -129 < (var4 ^ -1); var4++) {
                this.field_H[param0][var4] = null;
            }
        }
        if (param1 >= -16) {
            fkb var6 = (fkb) null;
            discarded$0 = this.a(-85, (fkb) null);
        }
    }

    private final void b(int param0, int param1, int param2) {
        if (param2 != 6889) {
            this.a(-21, 97);
        }
        this.field_t[param0] = param1;
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 != 72) {
            this.a(false);
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != 30) {
            fkb var4 = (fkb) null;
            this.a((fkb) null, true, false);
        }
        this.field_p = param1;
    }

    final synchronized int d() {
        return 0;
    }

    final synchronized f a() {
        return null;
    }

    final synchronized void b(boolean param0) {
        int var3 = VoidHunters.field_G;
        sd var2 = (sd) ((Object) this.field_E.c((byte) -123));
        if (param0) {
            kka var4 = (kka) null;
            this.a((kka) null, true, -105, false);
        }
        while (var2 != null) {
            var2.a(0);
            var2 = (sd) ((Object) this.field_E.b(-85));
        }
    }

    synchronized void a(kka param0, boolean param1, int param2, boolean param3) {
        int discarded$0 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        try {
            this.b(param1, true);
            this.field_u.a(param0.field_e);
            this.field_h = 0L;
            if (param2 != -11886) {
                fkb var8 = (fkb) null;
                discarded$0 = this.a(113, (fkb) null);
            }
            this.field_L = param3 ? true : false;
            var5_int = this.field_u.e();
            for (var6 = 0; var6 < var5_int; var6++) {
                this.field_u.c(var6);
                this.field_u.e(var6);
                this.field_u.f(var6);
            }
            this.field_m = this.field_u.d();
            this.field_F = this.field_u.field_b[this.field_m];
            this.field_i = this.field_u.a(this.field_F);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "hbb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized boolean a(bmb param0, int param1, asb param2, int param3, kka param4) {
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        ghb var8 = null;
        int var9 = 0;
        sd var10 = null;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            param4.a();
            var6_int = 1;
            var7 = null;
            if (param1 == -29476) {
              L1: {
                if (-1 <= (param3 ^ -1)) {
                  break L1;
                } else {
                  var7 = new int[]{param3};
                  break L1;
                }
              }
              var8 = (ghb) ((Object) param4.field_d.c((byte) 126));
              L2: while (true) {
                if (var8 == null) {
                  L3: {
                    if (var6_int != 0) {
                      param4.b();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackIn_20_0 = var6_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      var9 = (int)var8.field_b;
                      var10 = (sd) ((Object) this.field_E.a((long)var9, param1 ^ -29517));
                      if (var10 != null) {
                        break L5;
                      } else {
                        var10 = waa.a(param2, (byte) 115, var9);
                        if (var10 == null) {
                          var6_int = 0;
                          break L4;
                        } else {
                          this.field_E.a((long)var9, var10, (byte) -122);
                          break L5;
                        }
                      }
                    }
                    if (var10.a(1069, param0, (int[]) (var7), var8.field_d)) {
                      break L4;
                    } else {
                      var6_int = 0;
                      break L4;
                    }
                  }
                  var8 = (ghb) ((Object) param4.field_d.b(param1 ^ 29545));
                  continue L2;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("hbb.Q(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_20_0 != 0;
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (param1) {
            this.a(144, -1);
        } else {
            this.c(0, -1);
        }
        this.a(-1, param0);
        for (var3 = 0; -17 < (var3 ^ -1); var3++) {
            this.field_A[var3] = this.field_G[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (-17 < (var5 ^ -1)) {
            this.field_M[var5] = dla.a(this.field_G[var5], -128);
            var5++;
        }
    }

    final synchronized boolean c(int param0) {
        if (param0 >= -67) {
            field_N = (byte[]) null;
        }
        return this.field_u.g();
    }

    final boolean a(int param0, int[] param1, int param2, fkb param3, byte param4) {
        int stackIn_10_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        cja var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              param3.field_k = vka.field_s / 100;
              if (param3.field_v < 0) {
                break L1;
              } else {
                L2: {
                  if (param3.field_j == null) {
                    break L2;
                  } else {
                    if (!param3.field_j.i()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  param3.c(25804);
                  param3.b(-3846);
                  if (0 >= param3.field_s) {
                    break L3;
                  } else {
                    if (param3 == this.field_H[param3.field_o][param3.field_s]) {
                      this.field_H[param3.field_o][param3.field_s] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param3.field_l;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_D[param3.field_o]) + 0.5);
                  if (0 <= var6_int) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param3.field_l = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_j.g(this.a(93, param3));
              var7 = param3.field_g;
              param3.field_q = param3.field_q + 1;
              param3.field_e = param3.field_e + var7.field_f;
              var8 = 0;
              var9 = (double)((param3.field_x - 60 << -252902104) - -(param3.field_l * param3.field_h >> -400577364)) * 0.000005086263020833333;
              if (0 >= var7.field_b) {
                break L6;
              } else {
                L7: {
                  if (0 >= var7.field_c) {
                    param3.field_i = param3.field_i + 128;
                    break L7;
                  } else {
                    param3.field_i = param3.field_i + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_c) * 128.0);
                    break L7;
                  }
                }
                if (var7.field_b * param3.field_i >= 819200) {
                  var8 = 1;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (var7.field_h != null) {
                L9: {
                  if (var7.field_d <= 0) {
                    param3.field_r = param3.field_r + 128;
                    break L9;
                  } else {
                    param3.field_r = param3.field_r + (int)(128.0 * Math.pow(2.0, (double)var7.field_d * var9) + 0.5);
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (param3.field_f >= var7.field_h.length + -2) {
                      break L11;
                    } else {
                      if ((var7.field_h[param3.field_f + 2] << 860273384 & 65280 ^ -1) <= (param3.field_r ^ -1)) {
                        break L11;
                      } else {
                        param3.field_f = param3.field_f + 2;
                        continue L10;
                      }
                    }
                  }
                  if (param3.field_f != -2 + var7.field_h.length) {
                    break L8;
                  } else {
                    if (var7.field_h[1 + param3.field_f] == 0) {
                      var8 = 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              } else {
                break L8;
              }
            }
            L12: {
              if (0 > param3.field_v) {
                break L12;
              } else {
                if (null == var7.field_a) {
                  break L12;
                } else {
                  if (0 != (1 & this.field_v[param3.field_o])) {
                    break L12;
                  } else {
                    L13: {
                      if ((param3.field_s ^ -1) > -1) {
                        break L13;
                      } else {
                        if (param3 != this.field_H[param3.field_o][param3.field_s]) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (-1 > (var7.field_g ^ -1)) {
                        param3.field_v = param3.field_v + (int)(Math.pow(2.0, (double)var7.field_g * var9) * 128.0 + 0.5);
                        break L14;
                      } else {
                        param3.field_v = param3.field_v + 128;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (param3.field_w >= var7.field_a.length + -2) {
                          break L16;
                        } else {
                          if ((param3.field_v ^ -1) >= ((255 & var7.field_a[2 + param3.field_w]) << -1605990104 ^ -1)) {
                            break L16;
                          } else {
                            param3.field_w = param3.field_w + 2;
                            continue L15;
                          }
                        }
                      }
                      if (param3.field_w != var7.field_a.length + -2) {
                        break L12;
                      } else {
                        var8 = 1;
                        break L12;
                      }
                    }
                  }
                }
              }
            }
            if (var8 != 0) {
              L17: {
                param3.field_j.f(param3.field_k);
                if (param1 == null) {
                  param3.field_j.a(param2);
                  break L17;
                } else {
                  param3.field_j.a(param1, param0, param2);
                  break L17;
                }
              }
              L18: {
                if (!param3.field_j.g()) {
                  break L18;
                } else {
                  this.field_k.field_j.b(param3.field_j);
                  break L18;
                }
              }
              L19: {
                param3.c(25804);
                if ((param3.field_v ^ -1) > -1) {
                  break L19;
                } else {
                  param3.b(-3846);
                  if (-1 <= (param3.field_s ^ -1)) {
                    break L19;
                  } else {
                    if (this.field_H[param3.field_o][param3.field_s] == param3) {
                      this.field_H[param3.field_o][param3.field_s] = null;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
              }
              stackIn_62_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L20: {
                if (param4 < -3) {
                  break L20;
                } else {
                  this.field_u = (q) null;
                  break L20;
                }
              }
              param3.field_j.a(param3.field_k, this.b(param3, 0), this.b(9259, param3));
              stackIn_66_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var6);

            stackIn_69_1 = new StringBuilder().append("hbb.LA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L21;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L21;
            }
          }
          L22: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L22;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L22;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_70_0), stackIn_73_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_62_0 != 0;
          } else {
            return stackIn_66_0 != 0;
          }
        }
    }

    private final synchronized void b(boolean param0, boolean param1) {
        this.field_u.a();
        this.field_C = null;
        this.a(param1, param0);
        if (!param1) {
            this.field_I = (int[]) null;
        }
    }

    public static void c(boolean param0) {
        field_N = null;
        if (!param0) {
            hbb.c(false);
        }
    }

    synchronized void b(int param0, byte param1, int param2) {
        int var4;
        int var5;
        L0: {
          var5 = VoidHunters.field_G;
          if (-1 >= (param2 ^ -1)) {
            this.field_y[param2] = param0;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -17) {
                break L0;
              } else {
                this.field_y[var4] = param0;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param1 == 18) {
            break L2;
          } else {
            field_z = 71;
            break L2;
          }
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        L0: {
          var6 = VoidHunters.field_G;
          if (this.field_u.g()) {
            var2 = this.field_u.field_c * this.field_p / vka.field_s;
            L1: while (true) {
              L2: {
                var3 = (long)param0 * (long)var2 + this.field_h;
                if (0L <= this.field_i + -var3) {
                  this.field_h = var3;
                  break L2;
                } else {
                  var5 = (int)((-1L + (long)var2 + (this.field_i - this.field_h)) / (long)var2);
                  this.field_h = this.field_h + (long)var2 * (long)var5;
                  param0 = param0 - var5;
                  this.field_k.a(var5);
                  this.d(-1);
                  if (!this.field_u.g()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              this.field_k.a(param0);
              break L0;
            }
          } else {
            this.field_k.a(param0);
            break L0;
          }
        }
    }

    final synchronized f c() {
        return (f) ((Object) this.field_k);
    }

    private final int b(fkb param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        cja var9 = null;
        cja var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_y[param0.field_o] == 0) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var9 = param0.field_g;
                var10 = var9;
                var4 = this.field_x[param0.field_o] * this.field_I[param0.field_o] + 4096 >> 514570125;
                var4 = 16384 + var4 * var4 >> 2140023247;
                var4 = 16384 + var4 * param0.field_t >> -782810993;
                var4 = this.field_q * var4 - -128 >> -546381592;
                var4 = var4 * this.field_y[param0.field_o] + 128 >> -1027121304;
                if (param1 >= var10.field_b) {
                  break L1;
                } else {
                  var4 = (int)((double)var4 * Math.pow(0.5, (double)param0.field_i * 0.00001953125 * (double)var10.field_b) + 0.5);
                  break L1;
                }
              }
              L2: {
                if (null == var10.field_h) {
                  break L2;
                } else {
                  L3: {
                    var5 = param0.field_r;
                    var6 = var10.field_h[1 + param0.field_f];
                    if (var10.field_h.length + -2 <= param0.field_f) {
                      break L3;
                    } else {
                      var7 = (var9.field_h[param0.field_f] & 255) << 1872643368;
                      var8 = (255 & var10.field_h[2 + param0.field_f]) << 1581359592;
                      var6 = var6 + (-var6 + var10.field_h[param0.field_f + 3]) * (var5 - var7) / (var8 + -var7);
                      break L3;
                    }
                  }
                  var4 = var4 * var6 + 32 >> -677105690;
                  break L2;
                }
              }
              L4: {
                if (0 >= param0.field_v) {
                  break L4;
                } else {
                  if (var10.field_a == null) {
                    break L4;
                  } else {
                    L5: {
                      var5 = param0.field_v;
                      var6 = var10.field_a[1 + param0.field_w];
                      if (param0.field_w < var10.field_a.length - 2) {
                        var7 = var9.field_a[param0.field_w] << 1533813320 & 65280;
                        var8 = (255 & var10.field_a[2 + param0.field_w]) << 2004837320;
                        var6 = var6 + (var5 + -var7) * (var10.field_a[3 + param0.field_w] + -var6) / (-var7 + var8);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4 = var6 * var4 + 32 >> -698052954;
                    break L4;
                  }
                }
              }
              stackIn_17_0 = var4;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("hbb.U(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_17_0;
        }
    }

    final int e(int param0) {
        if (param0 != 127) {
            this.a(31, (byte) -113);
        }
        return this.field_q;
    }

    final synchronized void a(boolean param0) {
        this.b(true, param0);
    }

    synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!this.field_u.g()) {
                break L1;
              } else {
                var4_int = this.field_p * this.field_u.field_c / vka.field_s;
                L2: while (true) {
                  var5 = this.field_h - -((long)param2 * (long)var4_int);
                  if (-var5 + this.field_i < 0L) {
                    var7 = (int)((-1L + this.field_i + -this.field_h + (long)var4_int) / (long)var4_int);
                    this.field_h = this.field_h + (long)var7 * (long)var4_int;
                    this.field_k.a(param0, param1, var7);
                    param2 = param2 - var7;
                    param1 = param1 + var7;
                    this.d(-1);
                    if (!this.field_u.g()) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  } else {
                    this.field_h = var5;
                    break L1;
                  }
                }
              }
            }
            this.field_k.a(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("hbb.E(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(fkb param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.field_j != null) {
              L1: {
                if (param1 == 0) {
                  break L1;
                } else {
                  this.field_v = (int[]) null;
                  break L1;
                }
              }
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (param0.field_v < 0) {
                  break L2;
                } else {
                  param0.b(-3846);
                  if (param0.field_s <= 0) {
                    break L2;
                  } else {
                    if (param0 != this.field_H[param0.field_o][param0.field_s]) {
                      break L2;
                    } else {
                      this.field_H[param0.field_o][param0.field_s] = null;
                      return true;
                    }
                  }
                }
              }
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("hbb.AB(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    private final void d(int param0, int param1, int param2) {
        this.field_K[param0] = param1;
        this.field_l[param0] = (int)(0.5 + Math.pow((double)param2, (double)param1 * 0.00054931640625) * 2097152.0);
    }

    private final void b(int param0, boolean param1) {
        fkb var3 = null;
        int var4 = VoidHunters.field_G;
        if (param1) {
            this.field_L = true;
        }
        if (-1 != (4 & this.field_v[param0] ^ -1)) {
            var3 = (fkb) ((Object) this.field_k.field_k.d(0));
            while (var3 != null) {
                if (!(param0 != var3.field_o)) {
                    var3.field_p = 0;
                }
                var3 = (fkb) ((Object) this.field_k.field_k.a((byte) 117));
            }
        }
    }

    private final void b(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = VoidHunters.field_G;
        var3 = param0 & 240;
        if (128 != var3) {
          L0: {
            if (144 != var3) {
              if ((var3 ^ -1) != -161) {
                if (-177 == (var3 ^ -1)) {
                  L1: {
                    var4 = param0 & 15;
                    var5 = (param0 & 32715) >> 1506955080;
                    var6 = (param0 & 8340936) >> -1550525904;
                    if (0 != var5) {
                      break L1;
                    } else {
                      this.field_M[var4] = (var6 << -606944786) + dla.a(this.field_M[var4], -2080769);
                      break L1;
                    }
                  }
                  L2: {
                    if ((var5 ^ -1) == -33) {
                      this.field_M[var4] = dla.a(-16257, this.field_M[var4]) + (var6 << -2086066713);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (1 != var5) {
                      break L3;
                    } else {
                      this.field_r[var4] = dla.a(-16257, this.field_r[var4]) + (var6 << 1042698503);
                      break L3;
                    }
                  }
                  L4: {
                    if ((var5 ^ -1) != -34) {
                      break L4;
                    } else {
                      this.field_r[var4] = dla.a(-128, this.field_r[var4]) + var6;
                      break L4;
                    }
                  }
                  L5: {
                    if (-6 == (var5 ^ -1)) {
                      this.field_D[var4] = dla.a(this.field_D[var4], -16257) - -(var6 << -1559177977);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (-38 == (var5 ^ -1)) {
                      this.field_D[var4] = dla.a(this.field_D[var4], -128) + var6;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (-8 == (var5 ^ -1)) {
                      this.field_x[var4] = (var6 << 1647104391) + dla.a(this.field_x[var4], -16257);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var5 != 39) {
                      break L8;
                    } else {
                      this.field_x[var4] = dla.a(-128, this.field_x[var4]) + var6;
                      break L8;
                    }
                  }
                  L9: {
                    if (var5 == 10) {
                      this.field_o[var4] = (var6 << 2094728711) + dla.a(this.field_o[var4], -16257);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var5 == 42) {
                      this.field_o[var4] = dla.a(this.field_o[var4], -128) + var6;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 != 11) {
                      break L11;
                    } else {
                      this.field_I[var4] = dla.a(-16257, this.field_I[var4]) + (var6 << -210502969);
                      break L11;
                    }
                  }
                  L12: {
                    if (-44 == (var5 ^ -1)) {
                      this.field_I[var4] = dla.a(this.field_I[var4], -128) - -var6;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var5 == 64) {
                      if ((var6 ^ -1) <= -65) {
                        this.field_v[var4] = knb.a(this.field_v[var4], 1);
                        break L13;
                      } else {
                        this.field_v[var4] = dla.a(this.field_v[var4], -2);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (65 == var5) {
                      if ((var6 ^ -1) > -65) {
                        this.a(var4, (byte) -89);
                        this.field_v[var4] = dla.a(this.field_v[var4], -3);
                        break L14;
                      } else {
                        this.field_v[var4] = knb.a(this.field_v[var4], 2);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (99 != var5) {
                      break L15;
                    } else {
                      this.field_n[var4] = (var6 << 74887431) + dla.a(127, this.field_n[var4]);
                      break L15;
                    }
                  }
                  L16: {
                    if ((var5 ^ -1) != -99) {
                      break L16;
                    } else {
                      this.field_n[var4] = var6 + dla.a(this.field_n[var4], 16256);
                      break L16;
                    }
                  }
                  L17: {
                    if (-102 == (var5 ^ -1)) {
                      this.field_n[var4] = (var6 << 2010876327) + 16384 - -dla.a(this.field_n[var4], 127);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (100 != var5) {
                      break L18;
                    } else {
                      this.field_n[var4] = var6 + dla.a(this.field_n[var4], 16256) + 16384;
                      break L18;
                    }
                  }
                  L19: {
                    if (-121 != (var5 ^ -1)) {
                      break L19;
                    } else {
                      this.a(144, var4);
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 == 121) {
                      this.a(var4, true);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (123 == var5) {
                      this.c(0, var4);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 == 6) {
                      var7 = this.field_n[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L22;
                      } else {
                        this.field_B[var4] = (var6 << 825900807) + dla.a(-16257, this.field_B[var4]);
                        break L22;
                      }
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (var5 == 38) {
                      var7 = this.field_n[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L23;
                      } else {
                        this.field_B[var4] = var6 + dla.a(-128, this.field_B[var4]);
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if ((var5 ^ -1) != -17) {
                      break L24;
                    } else {
                      this.field_j[var4] = (var6 << 1053506215) + dla.a(-16257, this.field_j[var4]);
                      break L24;
                    }
                  }
                  L25: {
                    if ((var5 ^ -1) != -49) {
                      break L25;
                    } else {
                      this.field_j[var4] = dla.a(this.field_j[var4], -128) - -var6;
                      break L25;
                    }
                  }
                  L26: {
                    if ((var5 ^ -1) != -82) {
                      break L26;
                    } else {
                      if (-65 >= (var6 ^ -1)) {
                        this.field_v[var4] = knb.a(this.field_v[var4], 4);
                        break L26;
                      } else {
                        this.b(var4, false);
                        this.field_v[var4] = dla.a(this.field_v[var4], -5);
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (-18 == (var5 ^ -1)) {
                      this.d(var4, (var6 << 824303047) + (this.field_K[var4] & -16257), param1 + 19174);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (49 != var5) {
                    break L0;
                  } else {
                    this.d(var4, (this.field_K[var4] & -128) - -var6, param1 ^ -19170);
                    return;
                  }
                } else {
                  if (param1 == -19172) {
                    if ((var3 ^ -1) == -193) {
                      var4 = param0 & 15;
                      var5 = param0 >> 1794235496 & 127;
                      this.a(var4, -105, this.field_M[var4] + var5);
                      return;
                    } else {
                      if (208 != var3) {
                        if ((var3 ^ -1) != -225) {
                          var3 = 255 & param0;
                          if ((var3 ^ -1) == -256) {
                            this.a(true, true);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          var4 = param0 & 15;
                          var5 = (16256 & param0 >> 400441641) - -(127 & param0 >> 848180296);
                          this.b(var4, var5, 6889);
                          return;
                        }
                      } else {
                        var4 = 15 & param0;
                        var5 = (32717 & param0) >> 1297573320;
                        this.a(var5, var4, (byte) 72);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                var4 = 15 & param0;
                var5 = param0 >> -66441912 & 127;
                var6 = (8343323 & param0) >> -766613296;
                this.a(var6, var5, true, var4);
                return;
              }
            } else {
              var4 = param0 & 15;
              var5 = (param0 & 32621) >> -884029400;
              var6 = 127 & param0 >> 1067729360;
              if ((var6 ^ -1) >= -1) {
                this.a(64, var5, var4, (byte) 84);
                return;
              } else {
                this.b(var6, -21459, var5, var4);
                break L0;
              }
            }
          }
          return;
        } else {
          var4 = 15 & param0;
          var5 = 127 & param0 >> 503368104;
          var6 = (param0 & 8342805) >> 2027330224;
          this.a(var6, var5, var4, (byte) 127);
          return;
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        fkb var6 = null;
        int var7 = VoidHunters.field_G;
        if (param3 <= 73) {
            this.field_p = -82;
        }
        fkb var8 = this.field_O[param2][param1];
        if (var8 == null) {
            return;
        }
        this.field_O[param2][param1] = null;
        if ((2 & this.field_v[param2]) == 0) {
            var8.field_v = 0;
        } else {
            var6 = (fkb) ((Object) this.field_k.field_k.d(0));
            while (var6 != null) {
                if (var8.field_o == var6.field_o && (var6.field_v ^ -1) > -1 && var8 != var6) {
                    var8.field_v = 0;
                    break;
                }
                var6 = (fkb) ((Object) this.field_k.field_k.a((byte) 96));
            }
        }
    }

    private final void d(int param0) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        L0: {
          var7 = VoidHunters.field_G;
          var2 = this.field_m;
          var3 = this.field_F;
          var4 = this.field_i;
          if (null == this.field_C) {
            break L0;
          } else {
            if (this.field_w != var3) {
              break L0;
            } else {
              this.a(this.field_C, this.field_s, -11886, this.field_L);
              this.d(param0 + 0);
              return;
            }
          }
        }
        L1: {
          if (param0 == -1) {
            break L1;
          } else {
            this.a();
            break L1;
          }
        }
        L2: while (true) {
          if (var3 != this.field_F) {
            L3: {
              this.field_m = var2;
              this.field_F = var3;
              this.field_i = var4;
              if (null == this.field_C) {
                break L3;
              } else {
                stackIn_23_0 = var3 ^ -1;
                stackIn_23_1 = this.field_w ^ -1;
                if (stackIn_23_0 < stackIn_23_1) {
                  this.field_F = this.field_w;
                  this.field_m = -1;
                  this.field_i = this.field_u.a(this.field_F);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if ((this.field_u.field_b[var2] ^ -1) != (var3 ^ -1)) {
                  break L5;
                } else {
                  this.field_u.c(var2);
                  var6 = this.field_u.d(var2);
                  if (1 != var6) {
                    L6: {
                      if (-1 == (var6 & 128 ^ -1)) {
                        break L6;
                      } else {
                        this.b(var6, param0 + -19171);
                        break L6;
                      }
                    }
                    this.field_u.e(var2);
                    this.field_u.f(var2);
                    continue L4;
                  } else {
                    this.field_u.c();
                    this.field_u.f(var2);
                    if (this.field_u.f()) {
                      if (null != this.field_C) {
                        this.a(this.field_L, this.field_C, param0 ^ 0);
                        this.d(-1);
                        return;
                      } else {
                        L7: {
                          if (!this.field_L) {
                            break L7;
                          } else {
                            if (var3 == 0) {
                              break L7;
                            } else {
                              this.field_u.a(var4);
                              break L5;
                            }
                          }
                        }
                        this.a(true, true);
                        this.field_u.a();
                        return;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var2 = this.field_u.d();
              var3 = this.field_u.field_b[var2];
              var4 = this.field_u.a(var3);
              continue L2;
            }
          }
        }
    }

    final void a(fkb param0, boolean param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                this.field_O = (fkb[][]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param0.field_y.field_i.length;
                if (!param1) {
                  break L3;
                } else {
                  if (param0.field_y.field_e) {
                    var6 = -param0.field_y.field_g + (var4_int + var4_int);
                    var4_int = var4_int << 8;
                    var5 = (int)((long)this.field_j[param0.field_o] * (long)var6 >> 463626950);
                    if (var4_int <= var5) {
                      var5 = -var5 + var4_int - -var4_int + -1;
                      param0.field_j.a(true);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var5 = (int)((long)this.field_j[param0.field_o] * (long)var4_int >> -903267322);
              break L2;
            }
            param0.field_j.c(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("hbb.RA(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        fkb var3 = null;
        int var4 = VoidHunters.field_G;
        if (!((this.field_v[param0] & 2) == 0)) {
            var3 = (fkb) ((Object) this.field_k.field_k.d(0));
            while (var3 != null) {
                if ((var3.field_o ^ -1) == (param0 ^ -1) && null == this.field_O[param0][var3.field_x] && (var3.field_v ^ -1) > -1) {
                    var3.field_v = 0;
                }
                var3 = (fkb) ((Object) this.field_k.field_k.a((byte) 78));
            }
        }
        if (param1 > -60) {
            this.b(121, (byte) 19, -123);
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        Object stackIn_17_0 = null;
        fkb stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        fkb stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        fkb var5;
        int var6_int;
        gd var6;
        fkb var7;
        fkb var8;
        int var9;
        sd var10;
        sd var11;
        L0: {
          var9 = VoidHunters.field_G;
          this.a(64, param2, param3, (byte) 110);
          if (0 == (this.field_v[param3] & 2)) {
            break L0;
          } else {
            var5 = (fkb) ((Object) this.field_k.field_k.b((byte) 122));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_o != param3) {
                    break L2;
                  } else {
                    if (var5.field_v < 0) {
                      this.field_O[param3][var5.field_x] = null;
                      this.field_O[param3][param2] = var5;
                      var6_int = (var5.field_h * var5.field_l >> -56432020) + var5.field_d;
                      var5.field_d = var5.field_d + (-var5.field_x + param2 << 1245881384);
                      var5.field_x = param2;
                      var5.field_l = 4096;
                      var5.field_h = var6_int + -var5.field_d;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (fkb) ((Object) this.field_k.field_k.a(param1 + -1155545385));
                continue L1;
              }
            }
          }
        }
        var10 = (sd) ((Object) this.field_E.a((long)this.field_A[param3], 103));
        var11 = var10;
        if (var11 != null) {
          var6 = var10.field_d[param2];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new fkb();
              var7.field_n = var11;
              var7.field_y = var6;
              var7.field_o = param3;
              var7.field_g = var10.field_h[param2];
              var7.field_s = var10.field_j[param2];
              var7.field_x = param2;
              var7.field_t = var10.field_f[param2] * (var11.field_i * (param0 * param0)) + 1024 >> 14226667;
              var7.field_u = var10.field_g[param2] & 255;
              var7.field_d = (param2 << 250323432) - (32767 & var10.field_e[param2]);
              var7.field_v = -1;
              var7.field_i = 0;
              var7.field_f = 0;
              var7.field_w = 0;
              var7.field_r = 0;
              if (this.field_j[param3] != 0) {
                L4: {
                  var7.field_j = fga.b(var6, this.a(92, var7), 0, this.b(9259, var7));
                  stackIn_17_0 = this;

                  stackIn_17_1 = (fkb) (var7);

                  if (var11.field_e[param2] >= 0) {
                    stackIn_18_0 = this;
                    stackIn_18_1 = (fkb) ((Object) stackIn_17_1);
                    stackIn_18_2 = 0;
                    break L4;
                  } else {
                    stackIn_18_0 = this;
                    stackIn_18_1 = (fkb) ((Object) stackIn_17_1);
                    stackIn_18_2 = 1;
                    break L4;
                  }
                }
                this.a(stackIn_18_1, stackIn_18_2 != 0, true);
                break L3;
              } else {
                var7.field_j = fga.b(var6, this.a(param1 ^ -21404, var7), this.b(var7, 0), this.b(9259, var7));
                break L3;
              }
            }
            L5: {
              if (-1 < (var11.field_e[param2] ^ -1)) {
                var7.field_j.d(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((var7.field_s ^ -1) > -1) {
                break L6;
              } else {
                L7: {
                  var8 = this.field_H[param3][var7.field_s];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (-1 < (var8.field_v ^ -1)) {
                      this.field_O[param3][var8.field_x] = null;
                      var8.field_v = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                this.field_H[param3][var7.field_s] = var7;
                break L6;
              }
            }
            L8: {
              if (param1 == -21459) {
                break L8;
              } else {
                this.b(84, -87, 32);
                break L8;
              }
            }
            this.field_k.field_k.b(-10258, var7);
            this.field_O[param3][param2] = var7;
            return;
          }
        } else {
          return;
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_G[param0] = param1;
        this.field_M[param0] = dla.a(-128, param1);
        this.a(param0, -81, param1);
        if (param2 <= 0) {
            this.e(26);
        }
    }

    final synchronized void b(int param0, byte param1) {
        this.field_q = param0;
        if (param1 != 14) {
            this.field_o = (int[]) null;
        }
    }

    private final void c(int param0, int param1) {
        int var4 = VoidHunters.field_G;
        fkb var3 = (fkb) ((Object) this.field_k.field_k.d(param0));
        while (var3 != null) {
            if (param1 < 0 || var3.field_o == param1) {
                if (0 > var3.field_v) {
                    this.field_O[var3.field_o][var3.field_x] = null;
                    var3.field_v = 0;
                }
            }
            var3 = (fkb) ((Object) this.field_k.field_k.a((byte) 10));
        }
    }

    public hbb() {
        this.field_r = new int[16];
        this.field_q = 256;
        this.field_O = new fkb[16][128];
        this.field_K = new int[16];
        this.field_j = new int[16];
        this.field_p = 1000000;
        this.field_M = new int[16];
        this.field_H = new fkb[16][128];
        this.field_t = new int[16];
        this.field_l = new int[16];
        this.field_y = new int[16];
        this.field_o = new int[16];
        this.field_v = new int[16];
        this.field_n = new int[16];
        this.field_A = new int[16];
        this.field_I = new int[16];
        this.field_D = new int[16];
        this.field_B = new int[16];
        this.field_G = new int[16];
        this.field_x = new int[16];
        this.field_u = new q();
        this.field_k = new ht((hbb) (this));
        this.field_E = new gnb(128);
        this.b(256, (byte) 18, -1);
        this.a(true, true);
    }

    hbb(hbb param0) {
        this.field_r = new int[16];
        this.field_q = 256;
        this.field_O = new fkb[16][128];
        this.field_K = new int[16];
        this.field_j = new int[16];
        this.field_p = 1000000;
        this.field_M = new int[16];
        this.field_H = new fkb[16][128];
        this.field_t = new int[16];
        this.field_l = new int[16];
        this.field_y = new int[16];
        this.field_o = new int[16];
        this.field_v = new int[16];
        this.field_n = new int[16];
        this.field_A = new int[16];
        this.field_I = new int[16];
        this.field_D = new int[16];
        this.field_B = new int[16];
        this.field_G = new int[16];
        this.field_x = new int[16];
        this.field_u = new q();
        this.field_k = new ht((hbb) (this));
        try {
            this.field_E = param0.field_E;
            this.b(256, (byte) 18, -1);
            this.a(true, true);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "hbb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = new byte[520];
        field_z = 0;
    }
}
