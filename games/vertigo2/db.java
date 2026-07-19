/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends sn {
    private int[] field_v;
    int[] field_B;
    private int field_z;
    private int[] field_W;
    private pe[][] field_u;
    private int[] field_E;
    private int[] field_O;
    private int[] field_C;
    private int[] field_w;
    static boolean field_S;
    private jl field_G;
    private int[] field_F;
    private int[] field_y;
    private int[] field_Q;
    static cr field_t;
    private int[] field_R;
    private int[] field_T;
    private qd field_I;
    private pe[][] field_L;
    private int[] field_U;
    int[] field_N;
    private int field_A;
    int[] field_H;
    private int[] field_X;
    private long field_r;
    private rq field_P;
    private int field_J;
    private int field_s;
    private long field_D;
    private boolean field_V;
    private si field_x;
    private boolean field_K;
    private int field_M;

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 4294) {
            this.b(69, -54);
        }
    }

    private final void d(boolean param0, int param1) {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (param1 != -128) {
            this.a(81, -81, (byte) 98);
        }
        if (param0) {
            this.c(false, -1);
        } else {
            this.b((byte) 5, -1);
        }
        this.e((byte) 19, -1);
        for (var3 = 0; 16 > var3; var3++) {
            this.field_O[var3] = this.field_R[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (16 > var5) {
            this.field_C[var5] = b.a(-128, this.field_R[var5]);
            var5++;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 != -12) {
            this.field_y = (int[]) null;
        }
    }

    private final synchronized void a(boolean param0, si param1, boolean param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Vertigo2.field_L ? 1 : 0;
        try {
            this.b(param0, 8192);
            this.field_I.a(param1.field_n);
            this.field_V = param2 ? true : false;
            this.field_r = 0L;
            var5_int = this.field_I.c();
            if (param3 > -54) {
                this.field_A = -73;
            }
            for (var6 = 0; var5_int > var6; var6++) {
                this.field_I.a(var6);
                this.field_I.e(var6);
                this.field_I.d(var6);
            }
            this.field_s = this.field_I.a();
            this.field_J = this.field_I.field_b[this.field_s];
            this.field_D = this.field_I.b(this.field_J);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "db.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        if (!(this.field_O[param2] == param1)) {
            this.field_O[param2] = param1;
            for (var4 = 0; var4 < 128; var4++) {
                this.field_L[param2][var4] = null;
            }
        }
        var4 = 38 / ((param0 - 39) / 58);
    }

    private final int a(pe param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gl var9 = null;
        gl var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (this.field_T[param0.field_q] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var9 = param0.field_p;
                var10 = var9;
                var4 = this.field_v[param0.field_q] * this.field_F[param0.field_q] + 4096 >> 903374221;
                var4 = var4 * var4 - -16384 >> 1905415311;
                var4 = 16384 + var4 * param0.field_F >> 1119340047;
                var4 = this.field_z * var4 + 128 >> 2137175752;
                var4 = this.field_T[param0.field_q] * var4 + 128 >> -1104759800;
                if (0 < var10.field_n) {
                  var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)var10.field_n * ((double)param0.field_v * 0.00001953125)));
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var10.field_e == null) {
                  break L2;
                } else {
                  L3: {
                    var5 = param0.field_G;
                    var6 = var10.field_e[param0.field_x + 1];
                    if (-2 + var10.field_e.length > param0.field_x) {
                      var7 = (255 & var9.field_e[param0.field_x]) << 1109045608;
                      var8 = var10.field_e[param0.field_x + 2] << -366173304 & 65280;
                      var6 = var6 + (var10.field_e[3 + param0.field_x] + -var6) * (-var7 + var5) / (-var7 + var8);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = var4 * var6 + 32 >> -75362170;
                  break L2;
                }
              }
              L4: {
                if (param0.field_E <= 0) {
                  break L4;
                } else {
                  if (var10.field_g == null) {
                    break L4;
                  } else {
                    L5: {
                      var5 = param0.field_E;
                      var6 = var10.field_g[1 + param0.field_D];
                      if (param0.field_D >= var10.field_g.length - 2) {
                        break L5;
                      } else {
                        var7 = (var9.field_g[param0.field_D] & 255) << 169761352;
                        var8 = (255 & var10.field_g[param0.field_D - -2]) << -1437194072;
                        var6 = var6 + (var5 + -var7) * (var10.field_g[3 + param0.field_D] + -var6) / (-var7 + var8);
                        break L5;
                      }
                    }
                    var4 = var4 * var6 + 32 >> 1734733862;
                    break L4;
                  }
                }
              }
              L6: {
                if (param1 == 93) {
                  break L6;
                } else {
                  this.b(-26, 26, 17, 93);
                  break L6;
                }
              }
              stackOut_19_0 = var4;
              stackIn_20_0 = stackOut_19_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var3);
            stackOut_21_1 = new StringBuilder().append("db.S(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_20_0;
        }
    }

    private final void c(boolean param0, int param1) {
        pe var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (!param0) {
          var3 = (pe) ((Object) this.field_P.field_w.a((byte) 100));
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                L2: {
                  if ((param1 ^ -1) > -1) {
                    break L2;
                  } else {
                    if (var3.field_q != param1) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var3.field_J != null) {
                    L4: {
                      var3.field_J.h(dd.field_u / 100);
                      if (var3.field_J.l()) {
                        this.field_P.field_z.a(var3.field_J);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var3.a(-117);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if ((var3.field_E ^ -1) <= -1) {
                    break L5;
                  } else {
                    this.field_u[var3.field_q][var3.field_B] = null;
                    break L5;
                  }
                }
                var3.c(2);
                break L1;
              }
              var3 = (pe) ((Object) this.field_P.field_w.b(29));
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        er var5 = new er(param2, param1);
        int[] var6 = bi.field_l;
        int var7 = bi.field_e;
        int var8 = bi.field_j;
        var5.d();
        bi.f(param3, 0, param2, param1, 12, 5921370);
        bi.f(4, 4, param2 - 8, -8 + param1, 8, 0);
        bi.a(var6, var7, var8);
        var5.e(param0, param4);
    }

    final static void a(boolean param0, int param1, byte param2, si param3, boolean param4, int param5) {
        Object var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        Throwable var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var6 = ri.field_r;
            synchronized (var6) {
              L1: {
                var7 = 50 / ((param2 - -61) / 62);
                if (fo.field_e == param3) {
                  return;
                } else {
                  L2: {
                    fo.field_e = param3;
                    if (fo.field_e != null) {
                      qc.field_v.a(param5, param1, true, param4, param0, fo.field_e);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6_ref);
            stackOut_13_1 = new StringBuilder().append("db.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void e(byte param0, int param1) {
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if ((param1 ^ -1) <= -1) {
          L0: {
            this.field_F[param1] = 12800;
            this.field_Q[param1] = 8192;
            this.field_v[param1] = 16383;
            this.field_W[param1] = 8192;
            this.field_X[param1] = 0;
            this.field_U[param1] = 8192;
            this.b(param1, 2);
            this.d((byte) 70, param1);
            this.field_N[param1] = 0;
            if (param0 >= 4) {
              break L0;
            } else {
              this.field_C = (int[]) null;
              break L0;
            }
          }
          this.field_y[param1] = 32767;
          this.field_w[param1] = 256;
          this.field_H[param1] = 0;
          this.b(param1, 8192, 2097152);
          return;
        } else {
          param1 = 0;
          L1: while (true) {
            if ((param1 ^ -1) <= -17) {
              return;
            } else {
              this.e((byte) 40, param1);
              param1++;
              continue L1;
            }
          }
        }
    }

    final synchronized void a(int param0, si param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(true, param1, param2, -90);
              if (param0 <= -13) {
                break L1;
              } else {
                this.field_P = (rq) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("db.HA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    public static void f(int param0) {
        field_t = null;
        int var1 = 79 / ((-81 - param0) / 38);
    }

    final boolean a(int param0, pe param1, int param2, int[] param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        gl var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.field_H = dd.field_u / 100;
              if (0 > param1.field_E) {
                break L1;
              } else {
                L2: {
                  if (null == param1.field_J) {
                    break L2;
                  } else {
                    if (param1.field_J.j()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param1.a(-110);
                  param1.c(2);
                  if ((param1.field_I ^ -1) >= -1) {
                    break L3;
                  } else {
                    if (param1 == this.field_L[param1.field_q][param1.field_I]) {
                      this.field_L[param1.field_q][param1.field_I] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param1.field_w;
              if (-1 <= (var6_int ^ -1)) {
                break L4;
              } else {
                L5: {
                  var6_int = var6_int - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)this.field_U[param1.field_q]) * 16.0 + 0.5);
                  if (var6_int < 0) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param1.field_w = var6_int;
                break L4;
              }
            }
            L6: {
              param1.field_J.e(this.a((byte) -84, param1));
              var7 = param1.field_p;
              param1.field_s = param1.field_s + 1;
              param1.field_n = param1.field_n + var7.field_b;
              var8 = 0;
              var9 = 0.000005086263020833333 * (double)((-60 + param1.field_B << -817174328) - -(param1.field_y * param1.field_w >> 67088524));
              if (-1 > (var7.field_n ^ -1)) {
                L7: {
                  if (var7.field_f <= 0) {
                    param1.field_v = param1.field_v + 128;
                    break L7;
                  } else {
                    param1.field_v = param1.field_v + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_f));
                    break L7;
                  }
                }
                if (-819201 < (param1.field_v * var7.field_n ^ -1)) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L8: {
              if (var7.field_e == null) {
                break L8;
              } else {
                L9: {
                  if (-1 <= (var7.field_h ^ -1)) {
                    param1.field_G = param1.field_G + 128;
                    break L9;
                  } else {
                    param1.field_G = param1.field_G + (int)(Math.pow(2.0, (double)var7.field_h * var9) * 128.0 + 0.5);
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (var7.field_e.length - 2 <= param1.field_x) {
                      break L11;
                    } else {
                      if ((65280 & var7.field_e[2 + param1.field_x] << -1987970392) >= param1.field_G) {
                        break L11;
                      } else {
                        param1.field_x = param1.field_x + 2;
                        continue L10;
                      }
                    }
                  }
                  if (var7.field_e.length + -2 != param1.field_x) {
                    break L8;
                  } else {
                    if (0 == var7.field_e[1 + param1.field_x]) {
                      var8 = 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              }
            }
            L12: {
              if (-1 < (param1.field_E ^ -1)) {
                break L12;
              } else {
                if (var7.field_g == null) {
                  break L12;
                } else {
                  if (-1 != (1 & this.field_N[param1.field_q] ^ -1)) {
                    break L12;
                  } else {
                    L13: {
                      if (0 > param1.field_I) {
                        break L13;
                      } else {
                        if (param1 == this.field_L[param1.field_q][param1.field_I]) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (0 >= var7.field_j) {
                        param1.field_E = param1.field_E + 128;
                        break L14;
                      } else {
                        param1.field_E = param1.field_E + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_j) * 128.0);
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (param1.field_D >= var7.field_g.length - 2) {
                          break L16;
                        } else {
                          if (param1.field_E <= (255 & var7.field_g[2 + param1.field_D]) << 1811139464) {
                            break L16;
                          } else {
                            param1.field_D = param1.field_D + 2;
                            continue L15;
                          }
                        }
                      }
                      if (var7.field_g.length - 2 == param1.field_D) {
                        var8 = 1;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
              }
            }
            if (var8 == 0) {
              L17: {
                param1.field_J.a(param1.field_H, this.a(param1, (byte) 93), this.a(param1, 32));
                if (param4 >= 104) {
                  break L17;
                } else {
                  this.c((byte) 78, -39);
                  break L17;
                }
              }
              stackOut_65_0 = 0;
              stackIn_66_0 = stackOut_65_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L18: {
                param1.field_J.h(param1.field_H);
                if (param3 == null) {
                  param1.field_J.a(param2);
                  break L18;
                } else {
                  param1.field_J.b(param3, param0, param2);
                  break L18;
                }
              }
              L19: {
                if (param1.field_J.l()) {
                  this.field_P.field_z.a(param1.field_J);
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                param1.a(-117);
                if (0 <= param1.field_E) {
                  param1.c(2);
                  if (param1.field_I <= 0) {
                    break L20;
                  } else {
                    if (param1 != this.field_L[param1.field_q][param1.field_I]) {
                      break L20;
                    } else {
                      this.field_L[param1.field_q][param1.field_I] = null;
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
              stackOut_61_0 = 1;
              stackIn_62_0 = stackOut_61_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) (var6);
            stackOut_67_1 = new StringBuilder().append("db.P(").append(param0).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L21;
            }
          }
          L22: {
            stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param2).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param3 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L22;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L22;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param4 + ')');
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

    final synchronized void a(int param0, boolean param1, int param2) {
        this.c(-128, param2, param0);
        if (!param1) {
            db.f(-103);
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        pe var6 = null;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (param2 == -61) {
            break L0;
          } else {
            var6 = (pe) null;
            this.a((pe) null, (byte) -35, true);
            break L0;
          }
        }
        L1: {
          if (param1 >= 0) {
            this.field_T[param1] = param0;
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (16 <= var4) {
                break L1;
              } else {
                this.field_T[var4] = param0;
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    final static String h(int param0) {
        if (!(qc.field_A >= param0)) {
            return ap.field_g;
        }
        if (null != qc.field_B) {
            if (!(qc.field_B.b(0))) {
                return eb.field_a;
            }
            return bq.field_A;
        }
        if (!(ke.field_b.b(0))) {
            return ib.field_b;
        }
        if (!(ke.field_b.c("commonui", 0))) {
            return me.field_b + " - " + ke.field_b.a("commonui", 0) + "%";
        }
        if (!(la.field_e.b(0))) {
            return vc.field_a;
        }
        if (!la.field_e.c("commonui", param0 + -2)) {
            return vd.field_c + " - " + la.field_e.a("commonui", 0) + "%";
        }
        if (!kb.field_b.b(0)) {
            return vj.field_a;
        }
        if (!kb.field_b.a((byte) -112)) {
            return dk.field_n + " - " + kb.field_b.d(-1) + "%";
        }
        return b.field_f;
    }

    private final void b(int param0, int param1) {
        pe var3 = null;
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (!((param1 & this.field_N[param0]) == 0)) {
            var3 = (pe) ((Object) this.field_P.field_w.a((byte) 100));
            while (var3 != null) {
                if (param0 == var3.field_q) {
                    if (this.field_u[param0][var3.field_B] == null) {
                        if (var3.field_E < 0) {
                            var3.field_E = 0;
                        }
                    }
                }
                var3 = (pe) ((Object) this.field_P.field_w.b(77));
            }
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Vertigo2.field_L ? 1 : 0;
          if (!this.field_I.f()) {
            break L0;
          } else {
            var2 = this.field_I.field_c * this.field_A / dd.field_u;
            L1: while (true) {
              var3 = (long)var2 * (long)param0 + this.field_r;
              if (0L > -var3 + this.field_D) {
                var5 = (int)(((long)var2 + (this.field_D + (-this.field_r - 1L))) / (long)var2);
                this.field_r = this.field_r + (long)var5 * (long)var2;
                param0 = param0 - var5;
                this.field_P.a(var5);
                this.e(-29482);
                if (!this.field_I.f()) {
                  break L0;
                } else {
                  continue L1;
                }
              } else {
                this.field_r = var3;
                break L0;
              }
            }
          }
        }
        this.field_P.a(param0);
    }

    final boolean a(int param0, pe param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.field_R = (int[]) null;
                break L1;
              }
            }
            if (null == param1.field_J) {
              if (param1.field_E >= 0) {
                L2: {
                  param1.c(2);
                  if ((param1.field_I ^ -1) >= -1) {
                    break L2;
                  } else {
                    if (this.field_L[param1.field_q][param1.field_I] != param1) {
                      break L2;
                    } else {
                      this.field_L[param1.field_q][param1.field_I] = null;
                      break L2;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("db.B(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pe var9 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        var3 = param1 & 240;
        if (-129 != (var3 ^ -1)) {
          L0: {
            if (144 == var3) {
              var4 = param1 & 15;
              var5 = param1 >> -1410985784 & 127;
              var6 = (param1 & 8379569) >> 728607696;
              if (0 >= var6) {
                this.a(var5, false, 64, var4);
                return;
              } else {
                this.b(var4, 31423, var6, var5);
                break L0;
              }
            } else {
              L1: {
                if (param0 <= -98) {
                  break L1;
                } else {
                  var9 = (pe) null;
                  this.a((pe) null, (byte) 100, true);
                  break L1;
                }
              }
              if (160 != var3) {
                if (176 != var3) {
                  if (192 == var3) {
                    var4 = 15 & param1;
                    var5 = param1 >> -418192536 & 127;
                    this.a((byte) -29, this.field_C[var4] + var5, var4);
                    return;
                  } else {
                    if ((var3 ^ -1) != -209) {
                      if (224 == var3) {
                        var4 = 15 & param1;
                        var5 = (127 & param1 >> -826850232) + ((param1 & 8323400) >> 1146828201);
                        this.d(var5, -127, var4);
                        return;
                      } else {
                        var3 = param1 & 255;
                        if ((var3 ^ -1) != -256) {
                          return;
                        } else {
                          this.d(true, -128);
                          return;
                        }
                      }
                    } else {
                      var4 = param1 & 15;
                      var5 = param1 >> 782887144 & 127;
                      this.a(-12, var5, var4);
                      return;
                    }
                  }
                } else {
                  L2: {
                    var4 = 15 & param1;
                    var5 = 127 & param1 >> 1505051624;
                    var6 = 127 & param1 >> 357230320;
                    if (-1 == (var5 ^ -1)) {
                      this.field_C[var4] = (var6 << -1867702578) + b.a(-2080769, this.field_C[var4]);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (32 == var5) {
                      this.field_C[var4] = (var6 << -368451833) + b.a(this.field_C[var4], -16257);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((var5 ^ -1) != -2) {
                      break L4;
                    } else {
                      this.field_X[var4] = (var6 << 173956615) + b.a(this.field_X[var4], -16257);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 ^ -1) != -34) {
                      break L5;
                    } else {
                      this.field_X[var4] = b.a(this.field_X[var4], -128) + var6;
                      break L5;
                    }
                  }
                  L6: {
                    if ((var5 ^ -1) != -6) {
                      break L6;
                    } else {
                      this.field_U[var4] = b.a(this.field_U[var4], -16257) - -(var6 << 92728103);
                      break L6;
                    }
                  }
                  L7: {
                    if (37 == var5) {
                      this.field_U[var4] = var6 + b.a(-128, this.field_U[var4]);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var5 != 7) {
                      break L8;
                    } else {
                      this.field_F[var4] = b.a(this.field_F[var4], -16257) - -(var6 << -1764335321);
                      break L8;
                    }
                  }
                  L9: {
                    if (39 == var5) {
                      this.field_F[var4] = var6 + b.a(this.field_F[var4], -128);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var5 ^ -1) == -11) {
                      this.field_Q[var4] = (var6 << -1267203257) + b.a(this.field_Q[var4], -16257);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (-43 == (var5 ^ -1)) {
                      this.field_Q[var4] = b.a(this.field_Q[var4], -128) - -var6;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if ((var5 ^ -1) != -12) {
                      break L12;
                    } else {
                      this.field_v[var4] = b.a(this.field_v[var4], -16257) + (var6 << -728638169);
                      break L12;
                    }
                  }
                  L13: {
                    if (var5 == 43) {
                      this.field_v[var4] = b.a(this.field_v[var4], -128) - -var6;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (-65 != (var5 ^ -1)) {
                      break L14;
                    } else {
                      if ((var6 ^ -1) > -65) {
                        this.field_N[var4] = b.a(this.field_N[var4], -2);
                        break L14;
                      } else {
                        this.field_N[var4] = om.a(this.field_N[var4], 1);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (var5 == 65) {
                      if (-65 >= (var6 ^ -1)) {
                        this.field_N[var4] = om.a(this.field_N[var4], 2);
                        break L15;
                      } else {
                        this.b(var4, 2);
                        this.field_N[var4] = b.a(this.field_N[var4], -3);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (var5 == 99) {
                      this.field_y[var4] = b.a(127, this.field_y[var4]) - -(var6 << 1436060423);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if ((var5 ^ -1) != -99) {
                      break L17;
                    } else {
                      this.field_y[var4] = b.a(16256, this.field_y[var4]) - -var6;
                      break L17;
                    }
                  }
                  L18: {
                    if (101 != var5) {
                      break L18;
                    } else {
                      this.field_y[var4] = (var6 << 2039220775) + 16384 - -b.a(127, this.field_y[var4]);
                      break L18;
                    }
                  }
                  L19: {
                    if (-101 == (var5 ^ -1)) {
                      this.field_y[var4] = var6 + b.a(this.field_y[var4], 16256) + 16384;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 != 120) {
                      break L20;
                    } else {
                      this.c(false, var4);
                      break L20;
                    }
                  }
                  L21: {
                    if (var5 == 121) {
                      this.e((byte) 58, var4);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 != 123) {
                      break L22;
                    } else {
                      this.b((byte) -117, var4);
                      break L22;
                    }
                  }
                  L23: {
                    if (-7 == (var5 ^ -1)) {
                      var7 = this.field_y[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L23;
                      } else {
                        this.field_w[var4] = b.a(-16257, this.field_w[var4]) + (var6 << 1184442439);
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if ((var5 ^ -1) == -39) {
                      var7 = this.field_y[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L24;
                      } else {
                        this.field_w[var4] = b.a(-128, this.field_w[var4]) + var6;
                        break L24;
                      }
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (16 != var5) {
                      break L25;
                    } else {
                      this.field_H[var4] = (var6 << -1408391705) + b.a(-16257, this.field_H[var4]);
                      break L25;
                    }
                  }
                  L26: {
                    if (-49 != (var5 ^ -1)) {
                      break L26;
                    } else {
                      this.field_H[var4] = b.a(this.field_H[var4], -128) - -var6;
                      break L26;
                    }
                  }
                  L27: {
                    if (-82 == (var5 ^ -1)) {
                      if (var6 < 64) {
                        this.d((byte) 70, var4);
                        this.field_N[var4] = b.a(this.field_N[var4], -5);
                        break L27;
                      } else {
                        this.field_N[var4] = om.a(this.field_N[var4], 4);
                        break L27;
                      }
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (var5 == 17) {
                      this.b(var4, (var6 << 1359580359) + (-16257 & this.field_E[var4]), 2097152);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  if (49 != var5) {
                    break L0;
                  } else {
                    this.b(var4, (-128 & this.field_E[var4]) - -var6, 2097152);
                    return;
                  }
                }
              } else {
                var4 = 15 & param1;
                var5 = param1 >> 2042846632 & 127;
                var6 = (8382070 & param1) >> 79087344;
                this.a(var5, 4294, var6, var4);
                return;
              }
            }
          }
          return;
        } else {
          var4 = 15 & param1;
          var5 = (32626 & param1) >> 1827788008;
          var6 = param1 >> -1791129744 & 127;
          this.a(var5, false, var6, var4);
          return;
        }
    }

    private final synchronized void b(boolean param0, int param1) {
        this.field_I.b();
        this.field_x = null;
        this.d(param0, -128);
        if (param1 != 8192) {
            this.field_W = (int[]) null;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        pe var5 = null;
        int var6_int = 0;
        ae var6 = null;
        pe var7 = null;
        pe var8 = null;
        int var9 = 0;
        al var10 = null;
        al var11 = null;
        Object stackIn_18_0 = null;
        pe stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        Object stackIn_19_0 = null;
        pe stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        Object stackIn_20_0 = null;
        pe stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        Object stackOut_17_0 = null;
        pe stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        Object stackOut_19_0 = null;
        pe stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        Object stackOut_18_0 = null;
        pe stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        L0: {
          var9 = Vertigo2.field_L ? 1 : 0;
          this.a(param3, false, 64, param0);
          if ((this.field_N[param0] & 2) != 0) {
            var5 = (pe) ((Object) this.field_P.field_w.c((byte) -65));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var5.field_q) {
                    break L2;
                  } else {
                    if ((var5.field_E ^ -1) <= -1) {
                      break L2;
                    } else {
                      this.field_u[param0][var5.field_B] = null;
                      this.field_u[param0][param3] = var5;
                      var6_int = (var5.field_w * var5.field_y >> 1826122316) + var5.field_A;
                      var5.field_A = var5.field_A + (param3 + -var5.field_B << 1848715176);
                      var5.field_y = var6_int - var5.field_A;
                      var5.field_w = 4096;
                      var5.field_B = param3;
                      return;
                    }
                  }
                }
                var5 = (pe) ((Object) this.field_P.field_w.b(false));
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (al) ((Object) this.field_G.a((long)this.field_O[param0], (byte) 64));
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          L3: {
            if (param1 == 31423) {
              break L3;
            } else {
              this.field_y = (int[]) null;
              break L3;
            }
          }
          var6 = var10.field_r[param3];
          if (var6 != null) {
            L4: {
              var7 = new pe();
              var7.field_z = var6;
              var7.field_K = var11;
              var7.field_q = param0;
              var7.field_p = var10.field_v[param3];
              var7.field_I = var10.field_q[param3];
              var7.field_B = param3;
              var7.field_F = 1024 + var11.field_w * (param2 * param2 * var10.field_p[param3]) >> -1246310677;
              var7.field_C = 255 & var10.field_B[param3];
              var7.field_A = -(32767 & var10.field_n[param3]) + (param3 << 1385588104);
              var7.field_G = 0;
              var7.field_E = -1;
              var7.field_x = 0;
              var7.field_v = 0;
              var7.field_D = 0;
              if (0 != this.field_H[param0]) {
                L5: {
                  var7.field_J = ra.a(var6, this.a((byte) -81, var7), 0, this.a(var7, 32));
                  stackOut_17_0 = this;
                  stackOut_17_1 = (pe) (var7);
                  stackOut_17_2 = 124;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  if ((var11.field_n[param3] ^ -1) <= -1) {
                    stackOut_19_0 = this;
                    stackOut_19_1 = (pe) ((Object) stackIn_19_1);
                    stackOut_19_2 = stackIn_19_2;
                    stackOut_19_3 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    stackIn_20_3 = stackOut_19_3;
                    break L5;
                  } else {
                    stackOut_18_0 = this;
                    stackOut_18_1 = (pe) ((Object) stackIn_18_1);
                    stackOut_18_2 = stackIn_18_2;
                    stackOut_18_3 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    stackIn_20_3 = stackOut_18_3;
                    break L5;
                  }
                }
                this.a(stackIn_20_1, (byte) stackIn_20_2, stackIn_20_3 != 0);
                break L4;
              } else {
                var7.field_J = ra.a(var6, this.a((byte) -127, var7), this.a(var7, (byte) 93), this.a(var7, param1 ^ 31391));
                break L4;
              }
            }
            L6: {
              if (0 <= var11.field_n[param3]) {
                break L6;
              } else {
                var7.field_J.i(-1);
                break L6;
              }
            }
            L7: {
              if ((var7.field_I ^ -1) <= -1) {
                L8: {
                  var8 = this.field_L[param0][var7.field_I];
                  if (var8 == null) {
                    break L8;
                  } else {
                    if (var8.field_E < 0) {
                      this.field_u[param0][var8.field_B] = null;
                      var8.field_E = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                this.field_L[param0][var7.field_I] = var7;
                break L7;
              } else {
                break L7;
              }
            }
            this.field_P.field_w.a(var7, false);
            this.field_u[param0][param3] = var7;
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        pe var6 = null;
        int var7 = Vertigo2.field_L ? 1 : 0;
        pe var8 = this.field_u[param3][param0];
        if (var8 == null) {
            return;
        }
        this.field_u[param3][param0] = null;
        if ((2 & this.field_N[param3]) == 0) {
            var8.field_E = 0;
        } else {
            var6 = (pe) ((Object) this.field_P.field_w.a((byte) 100));
            while (var6 != null) {
                if (var8.field_q == var6.field_q) {
                    if ((var6.field_E ^ -1) > -1) {
                        if (var8 != var6) {
                            var8.field_E = 0;
                            break;
                        }
                    }
                }
                var6 = (pe) ((Object) this.field_P.field_w.b(76));
            }
        }
        if (param1) {
            this.field_v = (int[]) null;
        }
    }

    private final void b(int param0, int param1, int param2) {
        this.field_E[param0] = param1;
        this.field_B[param0] = (int)(0.5 + (double)param2 * Math.pow(2.0, (double)param1 * 0.00054931640625));
    }

    private final int a(byte param0, pe param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        gl var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param1.field_A - -(param1.field_w * param1.field_y >> 1218723436);
              var3_int = var3_int + ((this.field_W[param1.field_q] + -8192) * this.field_w[param1.field_q] >> -920461684);
              var4 = param1.field_p;
              if (param0 <= -44) {
                break L1;
              } else {
                field_t = (cr) null;
                break L1;
              }
            }
            L2: {
              if (var4.field_b <= 0) {
                break L2;
              } else {
                L3: {
                  if (var4.field_c > 0) {
                    break L3;
                  } else {
                    if (this.field_X[param1.field_q] <= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_c << 1325910018;
                  var6 = var4.field_d << -427942175;
                  if (param1.field_s < var6) {
                    var5 = param1.field_s * var5 / var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = var5 + (this.field_X[param1.field_q] >> 2083043047);
                var7 = Math.sin(0.01227184630308513 * (double)(param1.field_n & 511));
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)(0.5 + (double)(param1.field_z.field_r * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)dd.field_u);
              if (-2 < (var5 ^ -1)) {
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                break L5;
              } else {
                stackOut_11_0 = var5;
                stackIn_13_0 = stackOut_11_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("db.FA(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    final synchronized int d() {
        return 0;
    }

    private final int a(pe param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 32) {
                break L1;
              } else {
                this.b((byte) 25, -27);
                break L1;
              }
            }
            var3_int = this.field_Q[param0.field_q];
            if (-8193 >= (var3_int ^ -1)) {
              stackOut_5_0 = 16384 - ((128 - param0.field_C) * (16384 + -var3_int) + 32 >> 1229925606);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = 32 + var3_int * param0.field_C >> -276241786;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("db.OA(");
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
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_I.f()) {
                var4_int = this.field_I.field_c * this.field_A / dd.field_u;
                L2: while (true) {
                  L3: {
                    var5 = this.field_r - -((long)var4_int * (long)param2);
                    if (-1L >= (this.field_D + -var5 ^ -1L)) {
                      this.field_r = var5;
                      break L3;
                    } else {
                      var7 = (int)((-1L + this.field_D - this.field_r - -(long)var4_int) / (long)var4_int);
                      this.field_r = this.field_r + (long)var4_int * (long)var7;
                      this.field_P.b(param0, param1, var7);
                      this.e(-29482);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      if (!this.field_I.f()) {
                        break L3;
                      } else {
                        continue L2;
                      }
                    }
                  }
                  this.field_P.b(param0, param1, param2);
                  break L1;
                }
              } else {
                this.field_P.b(param0, param1, param2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("db.G(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized sn c() {
        return (sn) ((Object) this.field_P);
    }

    private final synchronized void a(int param0, int param1, boolean param2, boolean param3, boolean param4, si param5) {
        boolean discarded$0 = false;
        int var7_int = 0;
        int var8 = 0;
        if (!param2) {
            pe var9 = (pe) null;
            discarded$0 = this.a(42, (pe) null);
        }
        if (!(this.field_I.f())) {
            this.a(-124, param5, param3);
            return;
        }
        try {
            this.field_K = param4 ? true : false;
            this.field_V = param3 ? true : false;
            this.field_x = param5;
            var7_int = this.field_I.a(this.field_r) * param0;
            var8 = param1 * this.field_I.field_c;
            var7_int = var8 * ((-1 + var7_int + var8) / var8);
            this.field_M = (var7_int - -(param0 >> 592637057)) / param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "db.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0, int param1, int param2) {
        this.field_W[param2] = param0;
        if (param1 > -125) {
            this.field_L = (pe[][]) null;
        }
    }

    final synchronized sn a() {
        return null;
    }

    private final void b(byte param0, int param1) {
        pe var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        var3 = (pe) ((Object) this.field_P.field_w.a((byte) 100));
        var4 = -81 % ((-66 - param0) / 48);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (0 > param1) {
                  break L2;
                } else {
                  if (var3.field_q == param1) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              if ((var3.field_E ^ -1) > -1) {
                this.field_u[var3.field_q][var3.field_B] = null;
                var3.field_E = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (pe) ((Object) this.field_P.field_w.b(92));
            continue L0;
          }
        }
    }

    private final void d(byte param0, int param1) {
        pe var3 = null;
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (!((4 & this.field_N[param1]) == 0)) {
            var3 = (pe) ((Object) this.field_P.field_w.a((byte) 100));
            while (var3 != null) {
                if (!(param1 != var3.field_q)) {
                    var3.field_o = 0;
                }
                var3 = (pe) ((Object) this.field_P.field_w.b(86));
            }
        }
        if (param0 != 70) {
            int[] var5 = (int[]) null;
            this.b((int[]) null, -84, -49);
        }
    }

    final synchronized void c(int param0, int param1) {
        if (param0 != -82) {
            si var4 = (si) null;
            this.a(-7, (si) null, false);
        }
        this.field_z = param1;
    }

    final void a(pe param0, byte param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 55) {
                break L1;
              } else {
                this.field_V = false;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param0.field_z.field_s.length;
                if (!param2) {
                  break L3;
                } else {
                  if (!param0.field_z.field_p) {
                    break L3;
                  } else {
                    var6 = var4_int + (var4_int + -param0.field_z.field_o);
                    var4_int = var4_int << 8;
                    var5 = (int)((long)this.field_H[param0.field_q] * (long)var6 >> -383867514);
                    if (var4_int <= var5) {
                      param0.field_J.a(true);
                      var5 = -var5 + (var4_int - -var4_int - 1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)this.field_H[param0.field_q] >> -2145891514);
              break L2;
            }
            param0.field_J.f(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("db.MA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void c(byte param0, int param1) {
        if (param0 < 43) {
            this.b((byte) 77, -41);
        }
        this.field_A = param1;
    }

    final synchronized boolean g(int param0) {
        if (param0 != -26083) {
            this.field_w = (int[]) null;
        }
        return this.field_I.f();
    }

    private final void c(int param0, int param1, int param2) {
        this.field_R[param2] = param1;
        this.field_C[param2] = b.a(param1, param0);
        this.a((byte) -47, param1, param2);
    }

    final synchronized void a(boolean param0) {
        this.b(param0, 8192);
    }

    final synchronized boolean a(int param0, id param1, si param2, r param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        int var8 = 0;
        ph var9 = null;
        int var10 = 0;
        int var12 = 0;
        al var13 = null;
        al var14 = null;
        int stackIn_18_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
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
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param2.b();
              var6_int = 1;
              var7 = null;
              var8 = -4 % ((-2 - param4) / 50);
              if (param0 > 0) {
                var7 = new int[]{param0};
                break L1;
              } else {
                break L1;
              }
            }
            var9 = (ph) ((Object) param2.field_o.b(0));
            L2: while (true) {
              if (var9 == null) {
                L3: {
                  if (var6_int == 0) {
                    break L3;
                  } else {
                    param2.a();
                    break L3;
                  }
                }
                stackOut_17_0 = var6_int;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var10 = (int)var9.field_k;
                    var13 = (al) ((Object) this.field_G.a((long)var10, (byte) 64));
                    if (var13 == null) {
                      var14 = ap.a(var10, param3, -125);
                      if (var14 != null) {
                        this.field_G.a(var14, (long)var10, false);
                        if (!var14.a(0, var9.field_n, param1, (int[]) (var7))) {
                          break L5;
                        } else {
                          break L4;
                        }
                      } else {
                        var6_int = 0;
                        break L4;
                      }
                    } else {
                      if (!var13.a(0, var9.field_n, param1, (int[]) (var7))) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var6_int = 0;
                  break L4;
                }
                var9 = (ph) ((Object) param2.field_o.c(-28));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var6);
            stackOut_19_1 = new StringBuilder().append("db.M(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param4 + ')');
        }
        return stackIn_18_0 != 0;
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -29482) {
          L0: {
            var2 = this.field_s;
            var3 = this.field_J;
            var4 = this.field_D;
            if (this.field_x == null) {
              break L0;
            } else {
              if (this.field_M == var3) {
                this.a(this.field_K, this.field_x, this.field_V, -126);
                this.e(-29482);
                return;
              } else {
                break L0;
              }
            }
          }
          L1: while (true) {
            if (var3 != this.field_J) {
              L2: {
                this.field_J = var3;
                this.field_D = var4;
                this.field_s = var2;
                if (this.field_x == null) {
                  break L2;
                } else {
                  if (this.field_M >= var3) {
                    break L2;
                  } else {
                    this.field_J = this.field_M;
                    this.field_s = -1;
                    this.field_D = this.field_I.b(this.field_J);
                    break L2;
                  }
                }
              }
              return;
            } else {
              L3: while (true) {
                L4: {
                  if (this.field_I.field_b[var2] != var3) {
                    break L4;
                  } else {
                    this.field_I.a(var2);
                    var6 = this.field_I.c(var2);
                    if (-2 == (var6 ^ -1)) {
                      this.field_I.d();
                      this.field_I.d(var2);
                      if (!this.field_I.e()) {
                        break L4;
                      } else {
                        if (null == this.field_x) {
                          L5: {
                            if (!this.field_V) {
                              break L5;
                            } else {
                              if (0 != var3) {
                                this.field_I.b(var4);
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          this.d(true, -128);
                          this.field_I.b();
                          return;
                        } else {
                          this.a(-69, this.field_x, this.field_V);
                          this.e(param0 + 0);
                          return;
                        }
                      }
                    } else {
                      L6: {
                        if (-1 == (var6 & 128 ^ -1)) {
                          break L6;
                        } else {
                          this.a((byte) -101, var6);
                          break L6;
                        }
                      }
                      this.field_I.e(var2);
                      this.field_I.d(var2);
                      continue L3;
                    }
                  }
                }
                var2 = this.field_I.a();
                var3 = this.field_I.field_b[var2];
                var4 = this.field_I.b(var3);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    public db() {
        this.field_z = 256;
        this.field_u = new pe[16][128];
        this.field_O = new int[16];
        this.field_E = new int[16];
        this.field_v = new int[16];
        this.field_W = new int[16];
        this.field_F = new int[16];
        this.field_R = new int[16];
        this.field_y = new int[16];
        this.field_B = new int[16];
        this.field_C = new int[16];
        this.field_A = 1000000;
        this.field_w = new int[16];
        this.field_T = new int[16];
        this.field_U = new int[16];
        this.field_X = new int[16];
        this.field_N = new int[16];
        this.field_Q = new int[16];
        this.field_L = new pe[16][128];
        this.field_H = new int[16];
        this.field_I = new qd();
        this.field_P = new rq((db) (this));
        this.field_G = new jl(128);
        this.a(256, -1, (byte) -61);
        this.d(true, -128);
    }

    static {
        field_S = true;
    }
}
