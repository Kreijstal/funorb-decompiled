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
    }

    private final void d(boolean param0) {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (param0) {
            this.c(false, -1);
        } else {
            this.b((byte) 5, -1);
        }
        this.e((byte) 19, -1);
        for (var3 = 0; 16 > var3; var3++) {
            ((db) this).field_O[var3] = ((db) this).field_R[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (16 > var5) {
            ((db) this).field_C[var5] = b.a(-128, ((db) this).field_R[var5]);
            var5++;
        }
    }

    private final void a(int param0, int param1, int param2) {
    }

    private final synchronized void a(boolean param0, si param1, boolean param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Vertigo2.field_L ? 1 : 0;
        try {
            int discarded$0 = 8192;
            this.b(param0);
            ((db) this).field_I.a(param1.field_n);
            ((db) this).field_V = param2 ? true : false;
            ((db) this).field_r = 0L;
            var5_int = ((db) this).field_I.c();
            if (param3 > -54) {
                ((db) this).field_A = -73;
            }
            for (var6 = 0; var5_int > var6; var6++) {
                ((db) this).field_I.a(var6);
                ((db) this).field_I.e(var6);
                ((db) this).field_I.d(var6);
            }
            ((db) this).field_s = ((db) this).field_I.a();
            ((db) this).field_J = ((db) this).field_I.field_b[((db) this).field_s];
            ((db) this).field_D = ((db) this).field_I.b(((db) this).field_J);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "db.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        if (!(((db) this).field_O[param2] == param1)) {
            ((db) this).field_O[param2] = param1;
            for (var4 = 0; var4 < 128; var4++) {
                ((db) this).field_L[param2][var4] = null;
            }
        }
        var4 = 38 / ((param0 - 39) / 58);
    }

    private final int a(pe param0) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gl var9 = null;
        gl var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (((db) this).field_T[param0.field_q] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                var9 = param0.field_p;
                var10 = var9;
                var4 = ((db) this).field_v[param0.field_q] * ((db) this).field_F[param0.field_q] + 4096 >> 13;
                var4 = var4 * var4 - -16384 >> 15;
                var4 = 16384 + var4 * param0.field_F >> 15;
                var4 = ((db) this).field_z * var4 + 128 >> 8;
                var4 = ((db) this).field_T[param0.field_q] * var4 + 128 >> 8;
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
                      var7 = (255 & var9.field_e[param0.field_x]) << 8;
                      var8 = var10.field_e[param0.field_x + 2] << 8 & 65280;
                      var6 = var6 + (var10.field_e[3 + param0.field_x] + -var6) * (-var7 + var5) / (-var7 + var8);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = var4 * var6 + 32 >> 6;
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
                        var7 = (var9.field_g[param0.field_D] & 255) << 8;
                        var8 = (255 & var10.field_g[param0.field_D - -2]) << 8;
                        var6 = var6 + (var5 + -var7) * (var10.field_g[3 + param0.field_D] + -var6) / (-var7 + var8);
                        break L5;
                      }
                    }
                    var4 = var4 * var6 + 32 >> 6;
                    break L4;
                  }
                }
              }
              stackOut_17_0 = var4;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("db.S(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + 93 + ')');
        }
        return stackIn_18_0;
    }

    private final void c(boolean param0, int param1) {
        pe var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        var3 = (pe) (Object) ((db) this).field_P.field_w.a((byte) 100);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param1 < 0) {
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
                      ((db) this).field_P.field_z.a((sn) (Object) var3.field_J);
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
                if (var3.field_E >= 0) {
                  break L5;
                } else {
                  ((db) this).field_u[var3.field_q][var3.field_B] = null;
                  break L5;
                }
              }
              var3.c(2);
              break L1;
            }
            var3 = (pe) (Object) ((db) this).field_P.field_w.b(29);
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        er var5 = new er(param2, param1);
        int[] var6 = bi.field_l;
        int var7 = bi.field_e;
        int var8 = bi.field_j;
        var5.d();
        bi.f(0, 0, param2, param1, 12, 5921370);
        bi.f(4, 4, param2 - 8, -8 + param1, 8, 0);
        bi.a(var6, var7, var8);
        var5.e(0, 0);
    }

    final static void a(boolean param0, int param1, byte param2, si param3, boolean param4) {
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
            var6 = (Object) (Object) ri.field_r;
            synchronized (var6) {
              L1: {
                var7 = 50 / ((param2 - -61) / 62);
                if (fo.field_e == param3) {
                  return;
                } else {
                  L2: {
                    fo.field_e = param3;
                    if (fo.field_e != null) {
                      qc.field_v.a(12, 12, true, param4, false, fo.field_e);
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
            stackOut_13_0 = (RuntimeException) var6_ref;
            stackOut_13_1 = new StringBuilder().append("db.DA(").append(false).append(',').append(12).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ',' + 12 + ')');
        }
    }

    private final void e(byte param0, int param1) {
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= 0) {
          L0: {
            ((db) this).field_F[param1] = 12800;
            ((db) this).field_Q[param1] = 8192;
            ((db) this).field_v[param1] = 16383;
            ((db) this).field_W[param1] = 8192;
            ((db) this).field_X[param1] = 0;
            ((db) this).field_U[param1] = 8192;
            this.b(param1, 2);
            this.d((byte) 70, param1);
            ((db) this).field_N[param1] = 0;
            if (param0 >= 4) {
              break L0;
            } else {
              ((db) this).field_C = null;
              break L0;
            }
          }
          ((db) this).field_y[param1] = 32767;
          ((db) this).field_w[param1] = 256;
          ((db) this).field_H[param1] = 0;
          this.b(param1, 8192, 2097152);
          return;
        } else {
          param1 = 0;
          L1: while (true) {
            if (param1 >= 16) {
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
                ((db) this).field_P = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("db.HA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
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
                  if (param1.field_I <= 0) {
                    break L3;
                  } else {
                    if (param1 == ((db) this).field_L[param1.field_q][param1.field_I]) {
                      ((db) this).field_L[param1.field_q][param1.field_I] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
            L4: {
              var6_int = param1.field_w;
              if (var6_int <= 0) {
                break L4;
              } else {
                L5: {
                  var6_int = var6_int - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)((db) this).field_U[param1.field_q]) * 16.0 + 0.5);
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
              var9 = 0.000005086263020833333 * (double)((-60 + param1.field_B << 8) - -(param1.field_y * param1.field_w >> 12));
              if (var7.field_n > 0) {
                L7: {
                  if (var7.field_f <= 0) {
                    param1.field_v = param1.field_v + 128;
                    break L7;
                  } else {
                    param1.field_v = param1.field_v + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_f));
                    break L7;
                  }
                }
                if (-819201 < param1.field_v * var7.field_n) {
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
                  if (-1 >= var7.field_h) {
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
                      if ((65280 & var7.field_e[2 + param1.field_x] << 8) >= param1.field_G) {
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
              if (-1 < param1.field_E) {
                break L12;
              } else {
                if (var7.field_g == null) {
                  break L12;
                } else {
                  if (-1 != (1 & ((db) this).field_N[param1.field_q])) {
                    break L12;
                  } else {
                    L13: {
                      if (0 > param1.field_I) {
                        break L13;
                      } else {
                        if (param1 == ((db) this).field_L[param1.field_q][param1.field_I]) {
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
                          if (param1.field_E <= (255 & var7.field_g[2 + param1.field_D]) << 8) {
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
                int discarded$1 = 93;
                param1.field_J.a(param1.field_H, this.a(param1), this.a(param1, 32));
                if (param4 >= 104) {
                  break L17;
                } else {
                  ((db) this).c((byte) 78, -39);
                  break L17;
                }
              }
              stackOut_65_0 = 0;
              stackIn_66_0 = stackOut_65_0;
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
                  ((db) this).field_P.field_z.a((sn) (Object) param1.field_J);
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
                    if (param1 != ((db) this).field_L[param1.field_q][param1.field_I]) {
                      break L20;
                    } else {
                      ((db) this).field_L[param1.field_q][param1.field_I] = null;
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
              stackOut_61_0 = 1;
              stackIn_62_0 = stackOut_61_0;
              return stackIn_62_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var6;
            stackOut_67_1 = new StringBuilder().append("db.P(").append(param0).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L21;
            }
          }
          L22: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param2).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param3 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L22;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L22;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param4 + ')');
        }
        return stackIn_66_0 != 0;
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
        Object var6 = null;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (param2 == -61) {
            break L0;
          } else {
            var6 = null;
            ((db) this).a((pe) null, (byte) -35, true);
            break L0;
          }
        }
        L1: {
          if (param1 >= 0) {
            ((db) this).field_T[param1] = param0;
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (16 <= var4) {
                break L1;
              } else {
                ((db) this).field_T[var4] = param0;
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    final static String h() {
        if (!(qc.field_A >= 2)) {
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
        if (!la.field_e.c("commonui", 0)) {
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
        if (!((2 & ((db) this).field_N[param0]) == 0)) {
            var3 = (pe) (Object) ((db) this).field_P.field_w.a((byte) 100);
            while (var3 != null) {
                if (param0 == var3.field_q) {
                    if (((db) this).field_u[param0][var3.field_B] == null) {
                        if (var3.field_E < 0) {
                            var3.field_E = 0;
                        }
                    }
                }
                var3 = (pe) (Object) ((db) this).field_P.field_w.b(77);
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
          if (!((db) this).field_I.f()) {
            break L0;
          } else {
            var2 = ((db) this).field_I.field_c * ((db) this).field_A / dd.field_u;
            L1: while (true) {
              var3 = (long)var2 * (long)param0 + ((db) this).field_r;
              if (0L > -var3 + ((db) this).field_D) {
                var5 = (int)(((long)var2 + (((db) this).field_D + (-((db) this).field_r - 1L))) / (long)var2);
                ((db) this).field_r = ((db) this).field_r + (long)var5 * (long)var2;
                param0 = param0 - var5;
                ((db) this).field_P.a(var5);
                this.e(-29482);
                if (!((db) this).field_I.f()) {
                  break L0;
                } else {
                  continue L1;
                }
              } else {
                ((db) this).field_r = var3;
                break L0;
              }
            }
          }
        }
        ((db) this).field_P.a(param0);
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
                ((db) this).field_R = null;
                break L1;
              }
            }
            if (null == param1.field_J) {
              if (param1.field_E >= 0) {
                L2: {
                  param1.c(2);
                  if (param1.field_I <= 0) {
                    break L2;
                  } else {
                    if (((db) this).field_L[param1.field_q][param1.field_I] != param1) {
                      break L2;
                    } else {
                      ((db) this).field_L[param1.field_q][param1.field_I] = null;
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
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("db.B(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
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
        var8 = Vertigo2.field_L ? 1 : 0;
        var3 = param1 & 240;
        if (var3 != 128) {
          L0: {
            if (144 == var3) {
              var4 = param1 & 15;
              var5 = param1 >> 8 & 127;
              var6 = (param1 & 8379569) >> 16;
              if (0 >= var6) {
                this.a(var5, false, 64, var4);
                return;
              } else {
                this.b(var4, 31423, var6, var5);
                break L0;
              }
            } else {
              if (160 != var3) {
                if (176 != var3) {
                  if (192 == var3) {
                    var4 = 15 & param1;
                    var5 = param1 >> 8 & 127;
                    this.a((byte) -29, ((db) this).field_C[var4] + var5, var4);
                    return;
                  } else {
                    if (var3 != 208) {
                      if (224 == var3) {
                        var4 = 15 & param1;
                        var5 = (127 & param1 >> 8) + ((param1 & 8323400) >> 9);
                        this.d(var5, -127, var4);
                        return;
                      } else {
                        var3 = param1 & 255;
                        if (var3 != 255) {
                          return;
                        } else {
                          int discarded$1 = -128;
                          this.d(true);
                          return;
                        }
                      }
                    } else {
                      var4 = param1 & 15;
                      var5 = param1 >> 8 & 127;
                      this.a(-12, var5, var4);
                      return;
                    }
                  }
                } else {
                  L1: {
                    var4 = 15 & param1;
                    var5 = 127 & param1 >> 8;
                    var6 = 127 & param1 >> 16;
                    if (var5 == 0) {
                      ((db) this).field_C[var4] = (var6 << 14) + b.a(-2080769, ((db) this).field_C[var4]);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (32 == var5) {
                      ((db) this).field_C[var4] = (var6 << 7) + b.a(((db) this).field_C[var4], -16257);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var5 != 1) {
                      break L3;
                    } else {
                      ((db) this).field_X[var4] = (var6 << 7) + b.a(((db) this).field_X[var4], -16257);
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 != 33) {
                      break L4;
                    } else {
                      ((db) this).field_X[var4] = b.a(((db) this).field_X[var4], -128) + var6;
                      break L4;
                    }
                  }
                  L5: {
                    if (var5 != 5) {
                      break L5;
                    } else {
                      ((db) this).field_U[var4] = b.a(((db) this).field_U[var4], -16257) - -(var6 << 7);
                      break L5;
                    }
                  }
                  L6: {
                    if (37 == var5) {
                      ((db) this).field_U[var4] = var6 + b.a(-128, ((db) this).field_U[var4]);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 != 7) {
                      break L7;
                    } else {
                      ((db) this).field_F[var4] = b.a(((db) this).field_F[var4], -16257) - -(var6 << 7);
                      break L7;
                    }
                  }
                  L8: {
                    if (39 == var5) {
                      ((db) this).field_F[var4] = var6 + b.a(((db) this).field_F[var4], -128);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (var5 == 10) {
                      ((db) this).field_Q[var4] = (var6 << 7) + b.a(((db) this).field_Q[var4], -16257);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var5 == 42) {
                      ((db) this).field_Q[var4] = b.a(((db) this).field_Q[var4], -128) - -var6;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 != 11) {
                      break L11;
                    } else {
                      ((db) this).field_v[var4] = b.a(((db) this).field_v[var4], -16257) + (var6 << 7);
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 43) {
                      ((db) this).field_v[var4] = b.a(((db) this).field_v[var4], -128) - -var6;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var5 != 64) {
                      break L13;
                    } else {
                      if (var6 < 64) {
                        ((db) this).field_N[var4] = b.a(((db) this).field_N[var4], -2);
                        break L13;
                      } else {
                        ((db) this).field_N[var4] = om.a(((db) this).field_N[var4], 1);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (var5 == 65) {
                      if (var6 >= 64) {
                        ((db) this).field_N[var4] = om.a(((db) this).field_N[var4], 2);
                        break L14;
                      } else {
                        this.b(var4, 2);
                        ((db) this).field_N[var4] = b.a(((db) this).field_N[var4], -3);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var5 == 99) {
                      ((db) this).field_y[var4] = b.a(127, ((db) this).field_y[var4]) - -(var6 << 7);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (var5 != 98) {
                      break L16;
                    } else {
                      ((db) this).field_y[var4] = b.a(16256, ((db) this).field_y[var4]) - -var6;
                      break L16;
                    }
                  }
                  L17: {
                    if (101 != var5) {
                      break L17;
                    } else {
                      ((db) this).field_y[var4] = (var6 << 7) + 16384 - -b.a(127, ((db) this).field_y[var4]);
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 == 100) {
                      ((db) this).field_y[var4] = var6 + b.a(((db) this).field_y[var4], 16256) + 16384;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 != 120) {
                      break L19;
                    } else {
                      this.c(false, var4);
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 == 121) {
                      this.e((byte) 58, var4);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (var5 != 123) {
                      break L21;
                    } else {
                      this.b((byte) -117, var4);
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 == 6) {
                      var7 = ((db) this).field_y[var4];
                      if (var7 != 16384) {
                        break L22;
                      } else {
                        ((db) this).field_w[var4] = b.a(-16257, ((db) this).field_w[var4]) + (var6 << 7);
                        break L22;
                      }
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (var5 == 38) {
                      var7 = ((db) this).field_y[var4];
                      if (var7 != 16384) {
                        break L23;
                      } else {
                        ((db) this).field_w[var4] = b.a(-128, ((db) this).field_w[var4]) + var6;
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (16 != var5) {
                      break L24;
                    } else {
                      ((db) this).field_H[var4] = (var6 << 7) + b.a(-16257, ((db) this).field_H[var4]);
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 != 48) {
                      break L25;
                    } else {
                      ((db) this).field_H[var4] = b.a(((db) this).field_H[var4], -128) - -var6;
                      break L25;
                    }
                  }
                  L26: {
                    if (var5 == 81) {
                      if (var6 < 64) {
                        this.d((byte) 70, var4);
                        ((db) this).field_N[var4] = b.a(((db) this).field_N[var4], -5);
                        break L26;
                      } else {
                        ((db) this).field_N[var4] = om.a(((db) this).field_N[var4], 4);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (var5 == 17) {
                      this.b(var4, (var6 << 7) + (-16257 & ((db) this).field_E[var4]), 2097152);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (49 != var5) {
                    break L0;
                  } else {
                    this.b(var4, (-128 & ((db) this).field_E[var4]) - -var6, 2097152);
                    return;
                  }
                }
              } else {
                var4 = 15 & param1;
                var5 = param1 >> 8 & 127;
                var6 = (8382070 & param1) >> 16;
                this.a(var5, 4294, var6, var4);
                return;
              }
            }
          }
          return;
        } else {
          var4 = 15 & param1;
          var5 = (32626 & param1) >> 8;
          var6 = param1 >> 16 & 127;
          this.a(var5, false, var6, var4);
          return;
        }
    }

    private final synchronized void b(boolean param0) {
        ((db) this).field_I.b();
        ((db) this).field_x = null;
        int discarded$0 = -128;
        this.d(param0);
    }

    private final void b(int param0, int param1, int param2, int param3) {
        pe var5 = null;
        ae var6 = null;
        int var6_int = 0;
        pe var7 = null;
        pe var8 = null;
        int var9 = 0;
        al var10 = null;
        al var11 = null;
        Object stackIn_16_0 = null;
        pe stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        Object stackIn_17_0 = null;
        pe stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        Object stackIn_18_0 = null;
        pe stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        Object stackOut_15_0 = null;
        pe stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        Object stackOut_17_0 = null;
        pe stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        Object stackOut_16_0 = null;
        pe stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        L0: {
          var9 = Vertigo2.field_L ? 1 : 0;
          this.a(param3, false, 64, param0);
          if ((((db) this).field_N[param0] & 2) != 0) {
            var5 = (pe) (Object) ((db) this).field_P.field_w.c((byte) -65);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var5.field_q) {
                    break L2;
                  } else {
                    if (var5.field_E >= 0) {
                      break L2;
                    } else {
                      ((db) this).field_u[param0][var5.field_B] = null;
                      ((db) this).field_u[param0][param3] = var5;
                      var6_int = (var5.field_w * var5.field_y >> 12) + var5.field_A;
                      var5.field_A = var5.field_A + (param3 + -var5.field_B << 8);
                      var5.field_y = var6_int - var5.field_A;
                      var5.field_w = 4096;
                      var5.field_B = param3;
                      return;
                    }
                  }
                }
                var5 = (pe) (Object) ((db) this).field_P.field_w.b(false);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (al) (Object) ((db) this).field_G.a((long)((db) this).field_O[param0], (byte) 64);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_r[param3];
          if (var6 != null) {
            L3: {
              var7 = new pe();
              var7.field_z = var6;
              var7.field_K = var11;
              var7.field_q = param0;
              var7.field_p = var10.field_v[param3];
              var7.field_I = var10.field_q[param3];
              var7.field_B = param3;
              var7.field_F = 1024 + var11.field_w * (param2 * param2 * var10.field_p[param3]) >> 11;
              var7.field_C = 255 & var10.field_B[param3];
              var7.field_A = -(32767 & var10.field_n[param3]) + (param3 << 8);
              var7.field_G = 0;
              var7.field_E = -1;
              var7.field_x = 0;
              var7.field_v = 0;
              var7.field_D = 0;
              if (0 != ((db) this).field_H[param0]) {
                L4: {
                  var7.field_J = ra.a(var6, this.a((byte) -81, var7), 0, this.a(var7, 32));
                  stackOut_15_0 = this;
                  stackOut_15_1 = (pe) var7;
                  stackOut_15_2 = 124;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (var11.field_n[param3] >= 0) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = (pe) (Object) stackIn_17_1;
                    stackOut_17_2 = stackIn_17_2;
                    stackOut_17_3 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L4;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = (pe) (Object) stackIn_16_1;
                    stackOut_16_2 = stackIn_16_2;
                    stackOut_16_3 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L4;
                  }
                }
                ((db) this).a(stackIn_18_1, (byte) stackIn_18_2, stackIn_18_3 != 0);
                break L3;
              } else {
                int discarded$1 = 93;
                var7.field_J = ra.a(var6, this.a((byte) -127, var7), this.a(var7), this.a(var7, 32));
                break L3;
              }
            }
            L5: {
              if (0 <= var11.field_n[param3]) {
                break L5;
              } else {
                var7.field_J.i(-1);
                break L5;
              }
            }
            L6: {
              if (var7.field_I >= 0) {
                L7: {
                  var8 = ((db) this).field_L[param0][var7.field_I];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_E < 0) {
                      ((db) this).field_u[param0][var8.field_B] = null;
                      var8.field_E = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((db) this).field_L[param0][var7.field_I] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            ((db) this).field_P.field_w.a((li) (Object) var7, false);
            ((db) this).field_u[param0][param3] = var7;
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        pe var6 = null;
        int var7 = Vertigo2.field_L ? 1 : 0;
        pe var8 = ((db) this).field_u[param3][param0];
        if (var8 == null) {
            return;
        }
        ((db) this).field_u[param3][param0] = null;
        if ((2 & ((db) this).field_N[param3]) == 0) {
            var8.field_E = 0;
        } else {
            var6 = (pe) (Object) ((db) this).field_P.field_w.a((byte) 100);
            while (var6 != null) {
                if (var8.field_q == var6.field_q) {
                    if (var6.field_E < 0) {
                        if (var8 != var6) {
                            var8.field_E = 0;
                            break;
                        }
                    }
                }
                var6 = (pe) (Object) ((db) this).field_P.field_w.b(76);
            }
        }
    }

    private final void b(int param0, int param1, int param2) {
        ((db) this).field_E[param0] = param1;
        ((db) this).field_B[param0] = (int)(0.5 + (double)2097152 * Math.pow(2.0, (double)param1 * 0.00054931640625));
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
              var3_int = param1.field_A - -(param1.field_w * param1.field_y >> 12);
              var3_int = var3_int + ((((db) this).field_W[param1.field_q] + -8192) * ((db) this).field_w[param1.field_q] >> 12);
              var4 = param1.field_p;
              if (param0 <= -44) {
                break L1;
              } else {
                field_t = null;
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
                    if (((db) this).field_X[param1.field_q] <= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_c << 2;
                  var6 = var4.field_d << 1;
                  if (param1.field_s < var6) {
                    var5 = param1.field_s * var5 / var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = var5 + (((db) this).field_X[param1.field_q] >> 7);
                var7 = Math.sin(0.01227184630308513 * (double)(param1.field_n & 511));
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)(0.5 + (double)(param1.field_z.field_r * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)dd.field_u);
              if (var5 < 1) {
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
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("db.FA(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    final synchronized int d() {
        return 0;
    }

    private final int a(pe param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = ((db) this).field_Q[param0.field_q];
            if (var3_int >= 8192) {
              stackOut_3_0 = 16384 - ((128 - param0.field_C) * (16384 + -var3_int) + 32 >> 6);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 32 + var3_int * param0.field_C >> 6;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("db.OA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 32 + ')');
        }
        return stackIn_4_0;
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
              if (((db) this).field_I.f()) {
                var4_int = ((db) this).field_I.field_c * ((db) this).field_A / dd.field_u;
                L2: while (true) {
                  L3: {
                    var5 = ((db) this).field_r - -((long)var4_int * (long)param2);
                    if (((db) this).field_D + -var5 >= 0L) {
                      ((db) this).field_r = var5;
                      break L3;
                    } else {
                      var7 = (int)((-1L + ((db) this).field_D - ((db) this).field_r - -(long)var4_int) / (long)var4_int);
                      ((db) this).field_r = ((db) this).field_r + (long)var4_int * (long)var7;
                      ((db) this).field_P.b(param0, param1, var7);
                      this.e(-29482);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      if (!((db) this).field_I.f()) {
                        break L3;
                      } else {
                        continue L2;
                      }
                    }
                  }
                  ((db) this).field_P.b(param0, param1, param2);
                  break L1;
                }
              } else {
                ((db) this).field_P.b(param0, param1, param2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("db.G(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized sn c() {
        return (sn) (Object) ((db) this).field_P;
    }

    private final synchronized void a(int param0, int param1, boolean param2, boolean param3, boolean param4, si param5) {
        int var7_int = 0;
        int var8 = 0;
        if (!(((db) this).field_I.f())) {
            ((db) this).a(-124, param5, param3);
            return;
        }
        try {
            ((db) this).field_K = false;
            ((db) this).field_V = param3 ? true : false;
            ((db) this).field_x = param5;
            var7_int = ((db) this).field_I.a(((db) this).field_r) * 12;
            var8 = 12 * ((db) this).field_I.field_c;
            var7_int = var8 * ((-1 + var7_int + var8) / var8);
            ((db) this).field_M = (var7_int - -6) / 12;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "db.U(" + 12 + ',' + 12 + ',' + true + ',' + param3 + ',' + false + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0, int param1, int param2) {
        ((db) this).field_W[param2] = param0;
    }

    final synchronized sn a() {
        return null;
    }

    private final void b(byte param0, int param1) {
        pe var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        var3 = (pe) (Object) ((db) this).field_P.field_w.a((byte) 100);
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
              if (var3.field_E < 0) {
                ((db) this).field_u[var3.field_q][var3.field_B] = null;
                var3.field_E = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (pe) (Object) ((db) this).field_P.field_w.b(92);
            continue L0;
          }
        }
    }

    private final void d(byte param0, int param1) {
        pe var3 = null;
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (!((4 & ((db) this).field_N[param1]) == 0)) {
            var3 = (pe) (Object) ((db) this).field_P.field_w.a((byte) 100);
            while (var3 != null) {
                if (!(param1 != var3.field_q)) {
                    var3.field_o = 0;
                }
                var3 = (pe) (Object) ((db) this).field_P.field_w.b(86);
            }
        }
    }

    final synchronized void c(int param0, int param1) {
        if (param0 != -82) {
            Object var4 = null;
            ((db) this).a(-7, (si) null, false);
        }
        ((db) this).field_z = param1;
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
                ((db) this).field_V = false;
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
                    var5 = (int)((long)((db) this).field_H[param0.field_q] * (long)var6 >> 6);
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
              var5 = (int)((long)var4_int * (long)((db) this).field_H[param0.field_q] >> 6);
              break L2;
            }
            param0.field_J.f(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("db.MA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void c(byte param0, int param1) {
        if (param0 < 43) {
            this.b((byte) 77, -41);
        }
        ((db) this).field_A = param1;
    }

    final synchronized boolean g(int param0) {
        if (param0 != -26083) {
            ((db) this).field_w = null;
        }
        return ((db) this).field_I.f();
    }

    private final void c(int param0, int param1, int param2) {
        ((db) this).field_R[param2] = param1;
        ((db) this).field_C[param2] = b.a(param1, -128);
        this.a((byte) -47, param1, param2);
    }

    final synchronized void a(boolean param0) {
        int discarded$0 = 8192;
        this.b(param0);
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
                var7 = (Object) (Object) new int[]{param0};
                break L1;
              } else {
                break L1;
              }
            }
            var9 = (ph) (Object) param2.field_o.b(0);
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
                    var13 = (al) (Object) ((db) this).field_G.a((long)var10, (byte) 64);
                    if (var13 == null) {
                      int discarded$1 = -125;
                      var14 = ap.a(var10, param3);
                      if (var14 != null) {
                        ((db) this).field_G.a((li) (Object) var14, (long)var10, false);
                        if (!var14.a(0, var9.field_n, param1, (int[]) var7)) {
                          break L5;
                        } else {
                          break L4;
                        }
                      } else {
                        var6_int = 0;
                        break L4;
                      }
                    } else {
                      if (!var13.a(0, var9.field_n, param1, (int[]) var7)) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var6_int = 0;
                  break L4;
                }
                var9 = (ph) (Object) param2.field_o.c(-28);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("db.M(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param4 + ')');
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
            var2 = ((db) this).field_s;
            var3 = ((db) this).field_J;
            var4 = ((db) this).field_D;
            if (((db) this).field_x == null) {
              break L0;
            } else {
              if (((db) this).field_M == var3) {
                this.a(((db) this).field_K, ((db) this).field_x, ((db) this).field_V, -126);
                this.e(-29482);
                return;
              } else {
                break L0;
              }
            }
          }
          L1: while (true) {
            if (var3 != ((db) this).field_J) {
              L2: {
                ((db) this).field_J = var3;
                ((db) this).field_D = var4;
                ((db) this).field_s = var2;
                if (((db) this).field_x == null) {
                  break L2;
                } else {
                  if (((db) this).field_M >= var3) {
                    break L2;
                  } else {
                    ((db) this).field_J = ((db) this).field_M;
                    ((db) this).field_s = -1;
                    ((db) this).field_D = ((db) this).field_I.b(((db) this).field_J);
                    break L2;
                  }
                }
              }
              return;
            } else {
              L3: while (true) {
                L4: {
                  if (((db) this).field_I.field_b[var2] != var3) {
                    break L4;
                  } else {
                    ((db) this).field_I.a(var2);
                    var6 = ((db) this).field_I.c(var2);
                    if (var6 == 1) {
                      ((db) this).field_I.d();
                      ((db) this).field_I.d(var2);
                      if (!((db) this).field_I.e()) {
                        break L4;
                      } else {
                        if (null == ((db) this).field_x) {
                          L5: {
                            if (!((db) this).field_V) {
                              break L5;
                            } else {
                              if (0 != var3) {
                                ((db) this).field_I.b(var4);
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          int discarded$1 = -128;
                          this.d(true);
                          ((db) this).field_I.b();
                          return;
                        } else {
                          ((db) this).a(-69, ((db) this).field_x, ((db) this).field_V);
                          this.e(param0);
                          return;
                        }
                      }
                    } else {
                      L6: {
                        if ((var6 & 128) == 0) {
                          break L6;
                        } else {
                          this.a((byte) -101, var6);
                          break L6;
                        }
                      }
                      ((db) this).field_I.e(var2);
                      ((db) this).field_I.d(var2);
                      continue L3;
                    }
                  }
                }
                var2 = ((db) this).field_I.a();
                var3 = ((db) this).field_I.field_b[var2];
                var4 = ((db) this).field_I.b(var3);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    public db() {
        ((db) this).field_z = 256;
        ((db) this).field_u = new pe[16][128];
        ((db) this).field_O = new int[16];
        ((db) this).field_E = new int[16];
        ((db) this).field_v = new int[16];
        ((db) this).field_W = new int[16];
        ((db) this).field_F = new int[16];
        ((db) this).field_R = new int[16];
        ((db) this).field_y = new int[16];
        ((db) this).field_B = new int[16];
        ((db) this).field_C = new int[16];
        ((db) this).field_A = 1000000;
        ((db) this).field_w = new int[16];
        ((db) this).field_T = new int[16];
        ((db) this).field_U = new int[16];
        ((db) this).field_X = new int[16];
        ((db) this).field_N = new int[16];
        ((db) this).field_Q = new int[16];
        ((db) this).field_L = new pe[16][128];
        ((db) this).field_H = new int[16];
        ((db) this).field_I = new qd();
        ((db) this).field_P = new rq((db) this);
        ((db) this).field_G = new jl(128);
        ((db) this).a(256, -1, (byte) -61);
        int discarded$0 = -128;
        this.d(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = true;
    }
}
