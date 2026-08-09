/*
 * Decompiled by CFR-JS 0.4.0.
 */
class w extends tj {
    private int[] field_L;
    static int field_r;
    private int[] field_F;
    static fa field_S;
    private gh field_G;
    private int[] field_u;
    int[] field_H;
    private tm[][] field_P;
    int[] field_l;
    private int[] field_w;
    private int[] field_T;
    private int[] field_n;
    private jm field_I;
    int[] field_C;
    private int[] field_o;
    private int[] field_E;
    static String field_A;
    private int[] field_t;
    private int[] field_O;
    private int[] field_M;
    private int[] field_v;
    private int field_p;
    private int[] field_y;
    private tm[][] field_q;
    private int field_m;
    private dl field_B;
    private long field_N;
    private long field_x;
    private int field_D;
    private boolean field_R;
    private int field_K;
    private int field_s;
    private ji field_z;
    private boolean field_J;

    private final void c(int param0, byte param1) {
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (-1 >= (param0 ^ -1)) {
          L0: {
            this.field_O[param0] = 12800;
            this.field_v[param0] = 8192;
            this.field_T[param0] = 16383;
            this.field_E[param0] = 8192;
            this.field_y[param0] = 0;
            this.field_L[param0] = 8192;
            this.a(param0, false);
            this.a(param0, 4);
            this.field_C[param0] = 0;
            this.field_u[param0] = 32767;
            this.field_t[param0] = 256;
            this.field_H[param0] = 0;
            if (param1 >= 6) {
              break L0;
            } else {
              this.d(16);
              break L0;
            }
          }
          this.b(-112, 8192, param0);
          return;
        } else {
          param0 = 0;
          L1: while (true) {
            if (param0 >= 16) {
              return;
            } else {
              this.c(param0, (byte) 90);
              param0++;
              continue L1;
            }
          }
        }
    }

    private final void b(int param0, byte param1) {
        tm var3;
        int var4;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          if (param1 == 116) {
            break L0;
          } else {
            w.a(true);
            break L0;
          }
        }
        var3 = (tm) ((Object) this.field_B.field_t.g(-4));
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (param0 < 0) {
                  break L3;
                } else {
                  if (var3.field_E == param0) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              if ((var3.field_h ^ -1) > -1) {
                this.field_q[var3.field_E][var3.field_z] = null;
                var3.field_h = 0;
                break L2;
              } else {
                break L2;
              }
            }
            var3 = (tm) ((Object) this.field_B.field_t.a(12684));
            continue L1;
          }
        }
    }

    final synchronized boolean a(int param0, ji param1, gb param2, rd param3, boolean param4) {
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
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        bc var8 = null;
        int var9 = 0;
        int var11 = 0;
        nf var12 = null;
        nf var13 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.b();
              if (!param4) {
                break L1;
              } else {
                this.field_K = -87;
                break L1;
              }
            }
            L2: {
              var6_int = 1;
              var7 = null;
              if (-1 > (param0 ^ -1)) {
                var7 = new int[]{param0};
                break L2;
              } else {
                break L2;
              }
            }
            var8 = (bc) ((Object) param1.field_i.a(-104));
            L3: while (true) {
              if (var8 == null) {
                L4: {
                  if (var6_int == 0) {
                    break L4;
                  } else {
                    param1.a();
                    break L4;
                  }
                }
                stackIn_20_0 = var6_int;
                break L0;
              } else {
                L5: {
                  var9 = (int)var8.field_c;
                  var12 = (nf) ((Object) this.field_I.a(false, (long)var9));
                  if (var12 == null) {
                    var13 = ne.a(param2, -19, var9);
                    if (var13 == null) {
                      var6_int = 0;
                      break L5;
                    } else {
                      this.field_I.a(-116, (long)var9, var13);
                      if (var13.a((int[]) (var7), var8.field_h, param3, -20752)) {
                        break L5;
                      } else {
                        var6_int = 0;
                        break L5;
                      }
                    }
                  } else {
                    if (var12.a((int[]) (var7), var8.field_h, param3, -20752)) {
                      break L5;
                    } else {
                      var6_int = 0;
                      var8 = (bc) ((Object) param1.field_i.b(-1));
                      continue L3;
                    }
                  }
                }
                var8 = (bc) ((Object) param1.field_i.b(-1));
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("w.UA(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

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


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_24_0), stackIn_30_2 + ',' + param4 + ')');
        }
        return stackIn_20_0 != 0;
    }

    private final void b(int param0, int param1) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 <= 16) {
            int[] var5 = (int[]) null;
            this.b((int[]) null, -11, 107);
        }
        tm var3 = (tm) ((Object) this.field_B.field_t.g(-95));
        while (var3 != null) {
            if ((param1 ^ -1) > -1 || param1 == var3.field_E) {
                if (var3.field_A != null) {
                    var3.field_A.h(ug.field_g / 100);
                    if (!(!var3.field_A.m())) {
                        this.field_B.field_q.b(var3.field_A);
                    }
                    var3.b(true);
                }
                if (-1 < (var3.field_h ^ -1)) {
                    this.field_q[var3.field_E][var3.field_z] = null;
                }
                var3.b(123);
            }
            var3 = (tm) ((Object) this.field_B.field_t.a(12684));
        }
    }

    final boolean a(byte param0, tm param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == param1.field_A) {
              L1: {
                if (0 > param1.field_h) {
                  break L1;
                } else {
                  param1.b(-108);
                  if (param1.field_m <= 0) {
                    break L1;
                  } else {
                    if (param1 == this.field_P[param1.field_E][param1.field_m]) {
                      this.field_P[param1.field_E][param1.field_m] = null;
                      break L1;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackIn_8_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 > 10) {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("w.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final synchronized tj b() {
        return null;
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 != 93) {
            this.field_P = (tm[][]) null;
        }
    }

    final synchronized void c(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        L0: {
          var6 = HostileSpawn.field_I ? 1 : 0;
          if (this.field_G.c()) {
            var2 = this.field_p * this.field_G.field_f / ug.field_g;
            L1: while (true) {
              L2: {
                var3 = this.field_N - -((long)var2 * (long)param0);
                if (this.field_x + -var3 < 0L) {
                  var5 = (int)((-1L + ((long)var2 + -this.field_N) + this.field_x) / (long)var2);
                  this.field_N = this.field_N + (long)var2 * (long)var5;
                  param0 = param0 - var5;
                  this.field_B.c(var5);
                  this.d(0);
                  if (!this.field_G.c()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                } else {
                  this.field_N = var3;
                  break L2;
                }
              }
              this.field_B.c(param0);
              break L0;
            }
          } else {
            this.field_B.c(param0);
            break L0;
          }
        }
    }

    synchronized void a(boolean param0, byte param1, boolean param2, ji param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        try {
            this.a((byte) 61, param2);
            this.field_G.a(param3.field_h);
            this.field_N = 0L;
            if (param1 <= 123) {
                this.field_E = (int[]) null;
            }
            this.field_R = param0 ? true : false;
            var5_int = this.field_G.g();
            for (var6 = 0; var5_int > var6; var6++) {
                this.field_G.e(var6);
                this.field_G.d(var6);
                this.field_G.a(var6);
            }
            this.field_D = this.field_G.d();
            this.field_K = this.field_G.field_a[this.field_D];
            this.field_x = this.field_G.b(this.field_K);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "w.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(byte param0, int param1, int param2) {
        int discarded$0 = 0;
        this.field_F[param2] = param1;
        if (param0 != 22) {
            tm var5 = (tm) null;
            discarded$0 = this.a((tm) null, true);
        }
        this.field_o[param2] = ua.a(param1, -128);
        this.d(-14089, param1, param2);
    }

    private final int a(tm param0, boolean param1) {
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
              var3_int = this.field_v[param0.field_E];
              if (param1) {
                break L1;
              } else {
                this.field_R = true;
                break L1;
              }
            }
            if (8192 > var3_int) {
              stackIn_6_0 = 32 + param0.field_n * var3_int >> -659447450;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = -(32 + (128 + -param0.field_n) * (16384 - var3_int) >> -1060924474) + 16384;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("w.BB(");

            if (param0 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final void b(int param0, int param1, int param2) {
        if (param0 > -42) {
            this.field_u = (int[]) null;
        }
        this.field_w[param2] = param1;
        this.field_l[param2] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1) + 0.5);
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        tm var6 = null;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        if (param3 != 63) {
            this.field_R = true;
        }
        tm var8 = this.field_q[param1][param2];
        if (var8 == null) {
            return;
        }
        this.field_q[param1][param2] = null;
        if ((2 & this.field_C[param1]) == 0) {
            var8.field_h = 0;
        } else {
            var6 = (tm) ((Object) this.field_B.field_t.g(-23));
            while (var6 != null) {
                if (var6.field_E == var8.field_E && 0 > var6.field_h) {
                    if (!(var6 == var8)) {
                        var8.field_h = 0;
                        break;
                    }
                }
                var6 = (tm) ((Object) this.field_B.field_t.a(param3 ^ 12723));
            }
        }
    }

    private final int a(tm param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pl var9 = null;
        pl var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_M[param0.field_E] == 0) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var9 = param0.field_x;
                var10 = var9;
                var4 = 4096 + this.field_T[param0.field_E] * this.field_O[param0.field_E] >> -2010530835;
                var4 = var4 * var4 + 16384 >> 323697071;
                var4 = var4 * param0.field_D + 16384 >> -1840410385;
                var4 = 128 + var4 * this.field_m >> 47439016;
                var4 = this.field_M[param0.field_E] * var4 + 128 >> -1151496792;
                if (0 < var10.field_b) {
                  var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param0.field_k * (double)var10.field_b) * (double)var4);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (null == var10.field_n) {
                  break L2;
                } else {
                  L3: {
                    var5 = param0.field_C;
                    var6 = var10.field_n[1 + param0.field_w];
                    if (param0.field_w < var10.field_n.length - 2) {
                      var7 = (var9.field_n[param0.field_w] & 255) << 32121256;
                      var8 = 65280 & var10.field_n[param0.field_w + 2] << 226543464;
                      var6 = var6 + (-var7 + var5) * (var10.field_n[3 + param0.field_w] + -var6) / (var8 + -var7);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = var4 * var6 - -32 >> 2065687494;
                  break L2;
                }
              }
              L4: {
                if (-1 <= (param0.field_h ^ -1)) {
                  break L4;
                } else {
                  if (var10.field_m == null) {
                    break L4;
                  } else {
                    L5: {
                      var5 = param0.field_h;
                      var6 = var10.field_m[1 + param0.field_l];
                      if (var10.field_m.length + -2 > param0.field_l) {
                        var7 = var9.field_m[param0.field_l] << 335556392 & 65280;
                        var8 = (255 & var10.field_m[2 + param0.field_l]) << -405495544;
                        var6 = var6 + (-var6 + var10.field_m[param0.field_l + 3]) * (var5 - var7) / (-var7 + var8);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4 = var6 * var4 - -32 >> 1108444902;
                    break L4;
                  }
                }
              }
              var5 = -109 % ((-7 - param1) / 40);
              stackIn_19_0 = var4;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("w.R(");

            if (param0 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_19_0;
        }
    }

    final boolean a(tm param0, int param1, int param2, int param3, int[] param4) {
        int stackIn_12_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        pl var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.field_u = ug.field_g / 100;
              if (param3 == 31458) {
                break L1;
              } else {
                this.a(50, -29, 123, -115);
                break L1;
              }
            }
            L2: {
              if (0 > param0.field_h) {
                break L2;
              } else {
                L3: {
                  if (param0.field_A == null) {
                    break L3;
                  } else {
                    if (!param0.field_A.j()) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  param0.b(true);
                  param0.b(119);
                  if (-1 <= (param0.field_m ^ -1)) {
                    break L4;
                  } else {
                    if (this.field_P[param0.field_E][param0.field_m] == param0) {
                      this.field_P[param0.field_E][param0.field_m] = null;
                      break L4;
                    } else {
                      return true;
                    }
                  }
                }
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L5: {
              var6_int = param0.field_t;
              if (0 < var6_int) {
                L6: {
                  var6_int = var6_int - (int)(Math.pow(2.0, (double)this.field_L[param0.field_E] * 0.0004921259842519685) * 16.0 + 0.5);
                  if ((var6_int ^ -1) <= -1) {
                    break L6;
                  } else {
                    var6_int = 0;
                    break L6;
                  }
                }
                param0.field_t = var6_int;
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              param0.field_A.i(this.a(1, param0));
              var7 = param0.field_x;
              var8 = 0;
              param0.field_j = param0.field_j + var7.field_e;
              param0.field_B = param0.field_B + 1;
              var9 = (double)((param0.field_z + -60 << 901691560) + (param0.field_t * param0.field_F >> 1829161260)) * 0.000005086263020833333;
              if (-1 > (var7.field_b ^ -1)) {
                L8: {
                  if ((var7.field_h ^ -1) >= -1) {
                    param0.field_k = param0.field_k + 128;
                    break L8;
                  } else {
                    param0.field_k = param0.field_k + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_h));
                    break L8;
                  }
                }
                if (-819201 >= (var7.field_b * param0.field_k ^ -1)) {
                  var8 = 1;
                  break L7;
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L9: {
              if (null == var7.field_n) {
                break L9;
              } else {
                L10: {
                  if ((var7.field_o ^ -1) < -1) {
                    param0.field_C = param0.field_C + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_o) * 128.0);
                    break L10;
                  } else {
                    param0.field_C = param0.field_C + 128;
                    break L10;
                  }
                }
                L11: while (true) {
                  L12: {
                    if (-2 + var7.field_n.length <= param0.field_w) {
                      break L12;
                    } else {
                      if ((param0.field_C ^ -1) >= ((255 & var7.field_n[2 + param0.field_w]) << -49170488 ^ -1)) {
                        break L12;
                      } else {
                        param0.field_w = param0.field_w + 2;
                        continue L11;
                      }
                    }
                  }
                  if (var7.field_n.length - 2 != param0.field_w) {
                    break L9;
                  } else {
                    if (var7.field_n[param0.field_w + 1] == 0) {
                      var8 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            L13: {
              if (param0.field_h < 0) {
                break L13;
              } else {
                if (var7.field_m == null) {
                  break L13;
                } else {
                  if (0 == (1 & this.field_C[param0.field_E])) {
                    L14: {
                      if (0 > param0.field_m) {
                        break L14;
                      } else {
                        if (param0 != this.field_P[param0.field_E][param0.field_m]) {
                          break L14;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if ((var7.field_c ^ -1) < -1) {
                        param0.field_h = param0.field_h + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_c));
                        break L15;
                      } else {
                        param0.field_h = param0.field_h + 128;
                        break L15;
                      }
                    }
                    L16: while (true) {
                      L17: {
                        if (param0.field_l >= var7.field_m.length + -2) {
                          break L17;
                        } else {
                          if (param0.field_h <= (var7.field_m[2 + param0.field_l] & 255) << 1043979688) {
                            break L17;
                          } else {
                            param0.field_l = param0.field_l + 2;
                            continue L16;
                          }
                        }
                      }
                      if (param0.field_l != var7.field_m.length + -2) {
                        break L13;
                      } else {
                        var8 = 1;
                        break L13;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
            }
            if (var8 != 0) {
              L18: {
                param0.field_A.h(param0.field_u);
                if (param4 == null) {
                  param0.field_A.c(param1);
                  break L18;
                } else {
                  param0.field_A.b(param4, param2, param1);
                  break L18;
                }
              }
              L19: {
                if (!param0.field_A.m()) {
                  break L19;
                } else {
                  this.field_B.field_q.b(param0.field_A);
                  break L19;
                }
              }
              L20: {
                param0.b(true);
                if (param0.field_h < 0) {
                  break L20;
                } else {
                  param0.b(-29);
                  if ((param0.field_m ^ -1) >= -1) {
                    break L20;
                  } else {
                    if (param0 == this.field_P[param0.field_E][param0.field_m]) {
                      this.field_P[param0.field_E][param0.field_m] = null;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
              }
              stackIn_65_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param0.field_A.a(param0.field_u, this.a(param0, (byte) 68), this.a(param0, true));
              stackIn_67_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var6);

            stackIn_70_1 = new StringBuilder().append("w.N(");

            if (param0 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L21;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L21;
            }
          }
          L22: {


            stackIn_73_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L22;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L22;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_71_0), stackIn_74_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_65_0 != 0;
          } else {
            return stackIn_67_0 != 0;
          }
        }
    }

    private final void a(int param0, boolean param1) {
        tm var3;
        int var4;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          if (0 != (this.field_C[param0] & 2)) {
            var3 = (tm) ((Object) this.field_B.field_t.g(-64));
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (var3.field_E != param0) {
                    break L2;
                  } else {
                    if (this.field_q[param0][var3.field_z] == null) {
                      if (0 > var3.field_h) {
                        var3.field_h = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var3 = (tm) ((Object) this.field_B.field_t.a(12684));
                      continue L1;
                    }
                  }
                }
                var3 = (tm) ((Object) this.field_B.field_t.a(12684));
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (!param1) {
            break L3;
          } else {
            this.field_E = (int[]) null;
            break L3;
          }
        }
    }

    final int g(int param0) {
        int var2 = 118 / ((param0 - 0) / 42);
        return this.field_m;
    }

    private final void a(int param0, int param1) {
        tm var3 = null;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if ((param1 & this.field_C[param0]) != 0) {
            var3 = (tm) ((Object) this.field_B.field_t.g(-53));
            while (var3 != null) {
                if (!(var3.field_E != param0)) {
                    var3.field_i = 0;
                }
                var3 = (tm) ((Object) this.field_B.field_t.a(12684));
            }
        }
    }

    final synchronized void c(int param0, int param1, int param2) {
        if (param0 != 2) {
            this.field_M = (int[]) null;
        }
        this.b((byte) 22, param1, param2);
    }

    final synchronized void c(int param0, int param1) {
        this.field_p = param0;
        if (param1 < 93) {
            this.field_J = false;
        }
    }

    final synchronized void b(byte param0, int param1) {
        this.field_m = param1;
        int var3 = -10 / ((-1 - param0) / 40);
    }

    public static void a(boolean param0) {
        field_A = null;
        if (param0) {
            w.b(false, -68);
        }
        field_S = null;
    }

    final synchronized boolean f(int param0) {
        if (param0 != 323697071) {
            this.field_y = (int[]) null;
        }
        return this.field_G.c();
    }

    private final int a(int param0, tm param1) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        pl var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        try {
          L0: {
            L1: {
              var3_int = (param1.field_t * param1.field_F >> -1895075348) + param1.field_y;
              var3_int = var3_int + ((-8192 + this.field_E[param1.field_E]) * this.field_t[param1.field_E] >> 862831276);
              var4 = param1.field_x;
              if (param0 == 1) {
                break L1;
              } else {
                this.field_B = (dl) null;
                break L1;
              }
            }
            L2: {
              if (-1 <= (var4.field_e ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (-1 > (var4.field_g ^ -1)) {
                    break L3;
                  } else {
                    if (this.field_y[param1.field_E] > 0) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_g << -607058206;
                  var6 = var4.field_d << -1843915615;
                  if (var6 <= param1.field_B) {
                    break L4;
                  } else {
                    var5 = var5 * param1.field_B / var6;
                    break L4;
                  }
                }
                var5 = var5 + (this.field_y[param1.field_E] >> 1575163047);
                var7 = Math.sin((double)(param1.field_j & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)(0.5 + (double)(256 * param1.field_r.field_j) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)ug.field_g);
              if (1 <= var5) {
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

            stackIn_15_1 = new StringBuilder().append("w.TA(").append(param0).append(',');

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
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != -14089) {
            this.field_J = false;
        }
        if (!(param1 == this.field_n[param2])) {
            this.field_n[param2] = param1;
            for (var4 = 0; var4 < 128; var4++) {
                this.field_P[param2][var4] = null;
            }
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        tm var5;
        int var6_int;
        jb var6;
        tm var7;
        tm var8;
        int var9;
        nf var10;
        nf var11;
        L0: {
          var9 = HostileSpawn.field_I ? 1 : 0;
          this.a(64, param2, param3, (byte) 63);
          if (-1 == (2 & this.field_C[param2] ^ -1)) {
            break L0;
          } else {
            var5 = (tm) ((Object) this.field_B.field_t.b((byte) 117));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_E != param2) {
                    break L2;
                  } else {
                    if (-1 >= (var5.field_h ^ -1)) {
                      break L2;
                    } else {
                      this.field_q[param2][var5.field_z] = null;
                      this.field_q[param2][param3] = var5;
                      var6_int = var5.field_y - -(var5.field_t * var5.field_F >> 1170234188);
                      var5.field_y = var5.field_y + (-var5.field_z + param3 << -1880307256);
                      var5.field_z = param3;
                      var5.field_t = 4096;
                      var5.field_F = -var5.field_y + var6_int;
                      return;
                    }
                  }
                }
                var5 = (tm) ((Object) this.field_B.field_t.a((byte) 124));
                continue L1;
              }
            }
          }
        }
        var10 = (nf) ((Object) this.field_I.a(false, (long)this.field_n[param2]));
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_q[param3];
          if (var6 == null) {
            return;
          } else {
            var7 = new tm();
            var7.field_r = var6;
            var7.field_E = param2;
            var7.field_p = var10;
            var7.field_x = var10.field_o[param3];
            var7.field_m = var10.field_s[param3];
            var7.field_z = param3;
            var7.field_D = 1024 + var11.field_j * param1 * param1 * var10.field_i[param3] >> -1285533397;
            var7.field_n = 255 & var10.field_l[param3];
            var7.field_y = (param3 << -1221329592) + -(var10.field_r[param3] & 32767);
            var7.field_l = 0;
            var7.field_k = 0;
            if (param0 == 35) {
              L3: {
                var7.field_h = -1;
                var7.field_w = 0;
                var7.field_C = 0;
                if (this.field_H[param2] != 0) {
                  L4: {
                    var7.field_A = b.a(var6, this.a(1, var7), 0, this.a(var7, true));
                    stackIn_19_0 = this;

                    if (var11.field_r[param3] >= 0) {
                      stackIn_20_0 = this;
                      stackIn_20_1 = 0;
                      break L4;
                    } else {
                      stackIn_20_0 = this;
                      stackIn_20_1 = 1;
                      break L4;
                    }
                  }
                  this.a(stackIn_20_1 != 0, var7, -128);
                  break L3;
                } else {
                  var7.field_A = b.a(var6, this.a(param0 ^ 34, var7), this.a(var7, (byte) -75), this.a(var7, true));
                  break L3;
                }
              }
              L5: {
                if ((var11.field_r[param3] ^ -1) > -1) {
                  var7.field_A.d(-1);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (0 > var7.field_m) {
                  break L6;
                } else {
                  L7: {
                    var8 = this.field_P[param2][var7.field_m];
                    if (var8 == null) {
                      break L7;
                    } else {
                      if ((var8.field_h ^ -1) <= -1) {
                        break L7;
                      } else {
                        this.field_q[param2][var8.field_z] = null;
                        var8.field_h = 0;
                        break L7;
                      }
                    }
                  }
                  this.field_P[param2][var7.field_m] = var7;
                  break L6;
                }
              }
              this.field_B.field_t.a(var7, param0 ^ 74);
              this.field_q[param2][param3] = var7;
              return;
            } else {
              return;
            }
          }
        }
    }

    final synchronized void a(boolean param0, byte param1, ji param2) {
        try {
            if (param1 < 8) {
                tm var5 = (tm) null;
                this.a((byte) -14, (tm) null);
            }
            this.a(param0, (byte) 124, true, param2);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "w.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized int c() {
        return 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != -16257) {
            this.field_v = (int[]) null;
        }
    }

    final void a(boolean param0, tm param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
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
              L2: {
                var4_int = param1.field_r.field_k.length;
                if (!param0) {
                  break L2;
                } else {
                  if (!param1.field_r.field_m) {
                    break L2;
                  } else {
                    var6 = var4_int + var4_int - param1.field_r.field_l;
                    var5 = (int)((long)this.field_H[param1.field_E] * (long)var6 >> -1405804986);
                    var4_int = var4_int << 8;
                    if (var5 >= var4_int) {
                      var5 = -var5 + -1 + var4_int - -var4_int;
                      param1.field_A.a(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5 = (int)((long)this.field_H[param1.field_E] * (long)var4_int >> 1860333254);
              break L1;
            }
            L3: {
              param1.field_A.e(var5);
              if (param2 <= -104) {
                break L3;
              } else {
                this.field_O = (int[]) null;
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

            stackIn_11_1 = new StringBuilder().append("w.GA(").append(param0).append(',');

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
          throw wg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final static void b(boolean param0, int param1) {
        pc.a(param0, false, false);
        if (param1 != -23960) {
            field_r = -96;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 > -65) {
            return;
        }
        this.field_E[param0] = param2;
    }

    private final void a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = HostileSpawn.field_I ? 1 : 0;
        var4 = 73 / ((param0 - -9) / 51);
        var3 = param1 & 240;
        if (-129 == (var3 ^ -1)) {
          var5 = 15 & param1;
          var6 = (32556 & param1) >> -769556888;
          var7 = (8342895 & param1) >> 1754357936;
          this.a(var7, var5, var6, (byte) 63);
          return;
        } else {
          L0: {
            if (144 != var3) {
              if (-161 == (var3 ^ -1)) {
                var5 = 15 & param1;
                var6 = (32541 & param1) >> -434763320;
                var7 = (8342347 & param1) >> 44503824;
                this.a(var6, -16257, var7, var5);
                return;
              } else {
                if (var3 == 176) {
                  L1: {
                    var5 = 15 & param1;
                    var6 = param1 >> -839738008 & 127;
                    var7 = 127 & param1 >> -530985328;
                    if (0 != var6) {
                      break L1;
                    } else {
                      this.field_o[var5] = ua.a(this.field_o[var5], -2080769) + (var7 << 104211822);
                      break L1;
                    }
                  }
                  L2: {
                    if (-33 == (var6 ^ -1)) {
                      this.field_o[var5] = (var7 << -217942041) + ua.a(-16257, this.field_o[var5]);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (1 == var6) {
                      this.field_y[var5] = (var7 << -1841532505) + ua.a(-16257, this.field_y[var5]);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var6 != 33) {
                      break L4;
                    } else {
                      this.field_y[var5] = var7 + ua.a(this.field_y[var5], -128);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var6 ^ -1) != -6) {
                      break L5;
                    } else {
                      this.field_L[var5] = ua.a(this.field_L[var5], -16257) + (var7 << 1174784647);
                      break L5;
                    }
                  }
                  L6: {
                    if (37 != var6) {
                      break L6;
                    } else {
                      this.field_L[var5] = ua.a(-128, this.field_L[var5]) - -var7;
                      break L6;
                    }
                  }
                  L7: {
                    if ((var6 ^ -1) == -8) {
                      this.field_O[var5] = ua.a(this.field_O[var5], -16257) + (var7 << 895461319);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (-40 == (var6 ^ -1)) {
                      this.field_O[var5] = var7 + ua.a(this.field_O[var5], -128);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (10 == var6) {
                      this.field_v[var5] = (var7 << 659970087) + ua.a(this.field_v[var5], -16257);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (-43 != (var6 ^ -1)) {
                      break L10;
                    } else {
                      this.field_v[var5] = var7 + ua.a(-128, this.field_v[var5]);
                      break L10;
                    }
                  }
                  L11: {
                    if (-12 == (var6 ^ -1)) {
                      this.field_T[var5] = ua.a(-16257, this.field_T[var5]) + (var7 << 842115303);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var6 == 43) {
                      this.field_T[var5] = ua.a(this.field_T[var5], -128) - -var7;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var6 != 64) {
                      break L13;
                    } else {
                      if ((var7 ^ -1) <= -65) {
                        this.field_C[var5] = ll.a(this.field_C[var5], 1);
                        break L13;
                      } else {
                        this.field_C[var5] = ua.a(this.field_C[var5], -2);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (65 == var6) {
                      if ((var7 ^ -1) <= -65) {
                        this.field_C[var5] = ll.a(this.field_C[var5], 2);
                        break L14;
                      } else {
                        this.a(var5, false);
                        this.field_C[var5] = ua.a(this.field_C[var5], -3);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (-100 != (var6 ^ -1)) {
                      break L15;
                    } else {
                      this.field_u[var5] = ua.a(127, this.field_u[var5]) + (var7 << 1533463815);
                      break L15;
                    }
                  }
                  L16: {
                    if ((var6 ^ -1) != -99) {
                      break L16;
                    } else {
                      this.field_u[var5] = ua.a(this.field_u[var5], 16256) + var7;
                      break L16;
                    }
                  }
                  L17: {
                    if (101 != var6) {
                      break L17;
                    } else {
                      this.field_u[var5] = ua.a(127, this.field_u[var5]) + (16384 + (var7 << 1876729767));
                      break L17;
                    }
                  }
                  L18: {
                    if (-101 != (var6 ^ -1)) {
                      break L18;
                    } else {
                      this.field_u[var5] = var7 + 16384 + ua.a(this.field_u[var5], 16256);
                      break L18;
                    }
                  }
                  L19: {
                    if ((var6 ^ -1) == -121) {
                      this.b(106, var5);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (121 == var6) {
                      this.c(var5, (byte) 15);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (123 != var6) {
                      break L21;
                    } else {
                      this.b(var5, (byte) 116);
                      break L21;
                    }
                  }
                  L22: {
                    if ((var6 ^ -1) != -7) {
                      break L22;
                    } else {
                      var8 = this.field_u[var5];
                      if (var8 != 16384) {
                        break L22;
                      } else {
                        this.field_t[var5] = (var7 << 146396775) + ua.a(-16257, this.field_t[var5]);
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if ((var6 ^ -1) != -39) {
                      break L23;
                    } else {
                      var8 = this.field_u[var5];
                      if (var8 == 16384) {
                        this.field_t[var5] = ua.a(this.field_t[var5], -128) + var7;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (-17 == (var6 ^ -1)) {
                      this.field_H[var5] = (var7 << 1112435399) + ua.a(this.field_H[var5], -16257);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var6 == 48) {
                      this.field_H[var5] = var7 + ua.a(-128, this.field_H[var5]);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (-82 == (var6 ^ -1)) {
                      if (-65 < (var7 ^ -1)) {
                        this.a(var5, 4);
                        this.field_C[var5] = ua.a(this.field_C[var5], -5);
                        break L26;
                      } else {
                        this.field_C[var5] = ll.a(this.field_C[var5], 4);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (17 == var6) {
                      this.b(-91, (var7 << 1359907943) + (-16257 & this.field_w[var5]), var5);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (var6 != 49) {
                    break L0;
                  } else {
                    this.b(-75, (-128 & this.field_w[var5]) - -var7, var5);
                    return;
                  }
                } else {
                  if (-193 != (var3 ^ -1)) {
                    if (-209 != (var3 ^ -1)) {
                      if (var3 != 224) {
                        var3 = 255 & param1;
                        if (var3 != 255) {
                          return;
                        } else {
                          this.a(true, 2065687494);
                          return;
                        }
                      } else {
                        var5 = param1 & 15;
                        var6 = ((8323466 & param1) >> -1005998391) - -(param1 >> -2146254008 & 127);
                        this.a(var5, -120, var6);
                        return;
                      }
                    } else {
                      var5 = param1 & 15;
                      var6 = (param1 & 32765) >> -1859432056;
                      this.a((byte) 93, var6, var5);
                      return;
                    }
                  } else {
                    var5 = 15 & param1;
                    var6 = param1 >> -1912834360 & 127;
                    this.d(-14089, var6 + this.field_o[var5], var5);
                    return;
                  }
                }
              }
            } else {
              var5 = param1 & 15;
              var6 = 127 & param1 >> 37395240;
              var7 = (8326969 & param1) >> -1929667440;
              if (var7 > 0) {
                this.a((byte) 35, var7, var5, var6);
                return;
              } else {
                this.a(64, var5, var6, (byte) 63);
                break L0;
              }
            }
          }
          return;
        }
    }

    final synchronized tj d() {
        return (tj) ((Object) this.field_B);
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (!param0) {
            this.b(-1, (byte) 116);
        } else {
            this.b(61, -1);
        }
        this.c(-1, (byte) 106);
        for (var3 = 0; -17 < (var3 ^ -1); var3++) {
            this.field_n[var3] = this.field_F[var3];
        }
        int var5 = 0;
        var3 = var5;
        if (param1 != 2065687494) {
            return;
        }
        while (var5 < 16) {
            this.field_o[var5] = ua.a(-128, this.field_F[var5]);
            var5++;
        }
    }

    private final synchronized void a(byte param0, boolean param1) {
        if (param0 <= 56) {
            this.field_z = (ji) null;
        }
        this.field_G.b();
        this.field_z = null;
        this.a(param1, 2065687494);
    }

    synchronized void b(int[] param0, int param1, int param2) {
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
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_G.c()) {
                  break L2;
                } else {
                  var4_int = this.field_G.field_f * this.field_p / ug.field_g;
                  L3: while (true) {
                    var5 = (long)var4_int * (long)param2 + this.field_N;
                    if ((-var5 + this.field_x ^ -1L) > -1L) {
                      var7 = (int)((-1L + ((long)var4_int + -this.field_N + this.field_x)) / (long)var4_int);
                      this.field_N = this.field_N + (long)var7 * (long)var4_int;
                      this.field_B.b(param0, param1, var7);
                      this.d(0);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      if (this.field_G.c()) {
                        continue L3;
                      } else {
                        this.field_B.b(param0, param1, param2);
                        break L1;
                      }
                    } else {
                      this.field_N = var5;
                      break L2;
                    }
                  }
                }
              }
              this.field_B.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("w.A(");

            if (param0 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void e(int param0) {
        if (param0 != 4491) {
            this.a((byte) 108, -57, -120, 20);
        }
        this.a((byte) 109, true);
    }

    private final void d(int param0) {
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          var2 = this.field_D;
          var3 = this.field_K;
          var4 = this.field_x;
          if (this.field_z == null) {
            break L0;
          } else {
            if (var3 == this.field_s) {
              this.a(this.field_R, (byte) 127, this.field_J, this.field_z);
              this.d(0);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (this.field_K != var3) {
            L2: {
              this.field_K = var3;
              this.field_D = var2;
              if (param0 == 0) {
                break L2;
              } else {
                this.field_F = (int[]) null;
                break L2;
              }
            }
            L3: {
              this.field_x = var4;
              if (null == this.field_z) {
                break L3;
              } else {
                stackIn_26_0 = this.field_s;
                stackIn_26_1 = var3;
                if (stackIn_26_0 < stackIn_26_1) {
                  this.field_D = -1;
                  this.field_K = this.field_s;
                  this.field_x = this.field_G.b(this.field_K);
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
                if (var3 != this.field_G.field_a[var2]) {
                  break L5;
                } else {
                  this.field_G.e(var2);
                  var6 = this.field_G.c(var2);
                  if (1 == var6) {
                    this.field_G.a();
                    this.field_G.a(var2);
                    if (this.field_G.e()) {
                      if (this.field_z != null) {
                        this.a(this.field_R, (byte) 52, this.field_z);
                        this.d(0);
                        return;
                      } else {
                        L6: {
                          if (!this.field_R) {
                            break L6;
                          } else {
                            if (0 == var3) {
                              break L6;
                            } else {
                              this.field_G.a(var4);
                              break L5;
                            }
                          }
                        }
                        this.a(true, 2065687494);
                        this.field_G.b();
                        return;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    L7: {
                      if (-1 != (var6 & 128 ^ -1)) {
                        this.a((byte) -103, var6);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    this.field_G.d(var2);
                    this.field_G.a(var2);
                    continue L4;
                  }
                }
              }
              var2 = this.field_G.d();
              var3 = this.field_G.field_a[var2];
              var4 = this.field_G.b(var3);
              continue L1;
            }
          }
        }
    }

    synchronized void a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          if (param2 <= -47) {
            break L0;
          } else {
            this.g(95);
            break L0;
          }
        }
        L1: {
          if (param1 >= 0) {
            this.field_M[param1] = param0;
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (-17 >= (var4 ^ -1)) {
                break L1;
              } else {
                this.field_M[var4] = param0;
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    public w() {
        this.field_H = new int[16];
        this.field_u = new int[16];
        this.field_L = new int[16];
        this.field_w = new int[16];
        this.field_F = new int[16];
        this.field_n = new int[16];
        this.field_P = new tm[16][128];
        this.field_l = new int[16];
        this.field_E = new int[16];
        this.field_o = new int[16];
        this.field_v = new int[16];
        this.field_t = new int[16];
        this.field_p = 1000000;
        this.field_O = new int[16];
        this.field_M = new int[16];
        this.field_q = new tm[16][128];
        this.field_T = new int[16];
        this.field_y = new int[16];
        this.field_C = new int[16];
        this.field_m = 256;
        this.field_G = new gh();
        this.field_B = new dl((w) (this));
        this.field_I = new jm(128);
        this.a(256, -1, (byte) -76);
        this.a(true, 2065687494);
    }

    w(w param0) {
        this.field_H = new int[16];
        this.field_u = new int[16];
        this.field_L = new int[16];
        this.field_w = new int[16];
        this.field_F = new int[16];
        this.field_n = new int[16];
        this.field_P = new tm[16][128];
        this.field_l = new int[16];
        this.field_E = new int[16];
        this.field_o = new int[16];
        this.field_v = new int[16];
        this.field_t = new int[16];
        this.field_p = 1000000;
        this.field_O = new int[16];
        this.field_M = new int[16];
        this.field_q = new tm[16][128];
        this.field_T = new int[16];
        this.field_y = new int[16];
        this.field_C = new int[16];
        this.field_m = 256;
        this.field_G = new gh();
        this.field_B = new dl((w) (this));
        try {
            this.field_I = param0.field_I;
            this.a(256, -1, (byte) -77);
            this.a(true, 2065687494);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = 0;
        field_A = "<col=ffffff>Pistol</col><br>If one of your weapons runs out of ammo, you will revert to using your pistol. This weapon has unlimited ammo, but a slow rate of fire, so try not to rely on it. Keep ammo stocked for the better weapons.";
        field_S = new fa("");
    }
}
