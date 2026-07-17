/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends wf {
    private int[] field_M;
    private int[] field_k;
    private int[] field_q;
    private int[] field_t;
    private kl[][] field_C;
    private int[] field_r;
    private int[] field_H;
    private kl[][] field_O;
    private int field_n;
    private int[] field_N;
    private uk field_u;
    private oe field_w;
    static gk field_D;
    private int field_I;
    private int[] field_B;
    int[] field_K;
    private int[] field_z;
    private int[] field_J;
    private int[] field_E;
    private int[] field_m;
    int[] field_s;
    private int[] field_y;
    int[] field_l;
    private int field_A;
    private long field_P;
    private long field_L;
    private int field_p;
    private boolean field_F;
    private ka field_o;
    private be field_v;
    private int field_G;
    private boolean field_x;

    private final void c(byte param0, int param1, int param2) {
        int var4 = 0;
        ((pk) this).field_M[param2] = param1;
        ((pk) this).field_N[param2] = da.b(param1, -128);
        this.a((byte) -82, param2, param1);
    }

    final synchronized void a(be param0, boolean param1, int param2) {
        try {
            if (param2 < 49) {
                ((pk) this).field_N = null;
            }
            int discarded$0 = 1;
            this.a(param0, true, param1);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pk.IA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final synchronized int b() {
        return 0;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (!((pk) this).field_w.d()) {
                break L1;
              } else {
                var4_int = ((pk) this).field_w.field_b * ((pk) this).field_n / e.field_r;
                L2: while (true) {
                  var5 = (long)param2 * (long)var4_int + ((pk) this).field_P;
                  if (0L > -var5 + ((pk) this).field_L) {
                    var7 = (int)(((long)var4_int + (((pk) this).field_L - ((pk) this).field_P + -1L)) / (long)var4_int);
                    ((pk) this).field_P = ((pk) this).field_P + (long)var7 * (long)var4_int;
                    ((pk) this).field_o.a(param0, param1, var7);
                    param2 = param2 - var7;
                    param1 = param1 + var7;
                    this.b((byte) -126);
                    if (!((pk) this).field_w.d()) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  } else {
                    ((pk) this).field_P = var5;
                    break L1;
                  }
                }
              }
            }
            ((pk) this).field_o.a(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("pk.P(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(String param0, String param1, int param2) {
        try {
            if (null != nk.field_a) {
                nk.field_a.a(true);
            }
            if (param2 >= -1) {
                field_D = null;
            }
            vk.field_c = new ci(param1, param0, false, true, true);
            ed.field_c.a(10768, (lk) (Object) vk.field_c);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pk.FA(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Bounce.field_N;
        for (var4 = 0; 16 > var4; var4++) {
            ((pk) this).field_r[var4] = 256;
        }
    }

    private final int b(kl param0) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ch var9 = null;
        ch var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (0 == ((pk) this).field_r[param0.field_E]) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var9 = param0.field_o;
              var10 = var9;
              var4 = ((pk) this).field_J[param0.field_E] * ((pk) this).field_q[param0.field_E] - -4096 >> 13;
              var4 = var4 * var4 + 16384 >> 15;
              L1: {
                var4 = param0.field_n * var4 - -16384 >> 15;
                var4 = 128 + ((pk) this).field_I * var4 >> 8;
                var4 = ((pk) this).field_r[param0.field_E] * var4 + 128 >> 8;
                if (var10.field_k > 0) {
                  var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, 0.00001953125 * (double)param0.field_A * (double)var10.field_k));
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (null == var10.field_e) {
                  break L2;
                } else {
                  L3: {
                    var5 = param0.field_q;
                    var6 = var10.field_e[1 + param0.field_s];
                    if (~param0.field_s <= ~(-2 + var10.field_e.length)) {
                      break L3;
                    } else {
                      var7 = 65280 & var9.field_e[param0.field_s] << 8;
                      var8 = (255 & var10.field_e[2 + param0.field_s]) << 8;
                      var6 = var6 + (var5 - var7) * (var10.field_e[3 + param0.field_s] - var6) / (var8 + -var7);
                      break L3;
                    }
                  }
                  var4 = var4 * var6 + 32 >> 6;
                  break L2;
                }
              }
              L4: {
                if (param0.field_C <= 0) {
                  break L4;
                } else {
                  if (null != var10.field_i) {
                    L5: {
                      var5 = param0.field_C;
                      var6 = var10.field_i[param0.field_y - -1];
                      if (~param0.field_y > ~(-2 + var10.field_i.length)) {
                        var7 = (255 & var9.field_i[param0.field_y]) << 8;
                        var8 = (255 & var10.field_i[2 + param0.field_y]) << 8;
                        var6 = var6 + (-var6 + var10.field_i[param0.field_y - -3]) * (var5 + -var7) / (-var7 + var8);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4 = var6 * var4 - -32 >> 6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_20_0 = var4;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("pk.D(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 68 + 41);
        }
        return stackIn_21_0;
    }

    private final synchronized void a(be param0, boolean param1, boolean param2) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Bounce.field_N;
        try {
            this.a(param1, 104);
            ((pk) this).field_w.a(param0.field_h);
            ((pk) this).field_P = 0L;
            ((pk) this).field_F = param2 ? true : false;
            var5_int = ((pk) this).field_w.e();
            for (var6 = 0; ~var6 > ~var5_int; var6++) {
                ((pk) this).field_w.e(var6);
                ((pk) this).field_w.a(var6);
                ((pk) this).field_w.c(var6);
            }
            ((pk) this).field_p = ((pk) this).field_w.c();
            ((pk) this).field_A = ((pk) this).field_w.field_d[((pk) this).field_p];
            ((pk) this).field_L = ((pk) this).field_w.f(((pk) this).field_A);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pk.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + 1 + 41);
        }
    }

    private final void b(int param0, int param1) {
        kl var3 = null;
        int var4 = 0;
        var4 = Bounce.field_N;
        var3 = (kl) (Object) ((pk) this).field_o.field_m.a((byte) -102);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param1 < 0) {
                  break L2;
                } else {
                  if (~param1 == ~var3.field_E) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              if (0 > var3.field_C) {
                ((pk) this).field_C[var3.field_E][var3.field_r] = null;
                var3.field_C = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (kl) (Object) ((pk) this).field_o.field_m.d((byte) -46);
            continue L0;
          }
        }
    }

    final boolean a(kl param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
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
            if (param0.field_i != null) {
              L1: {
                if (param1 == 8335400) {
                  break L1;
                } else {
                  ((pk) this).field_E = null;
                  break L1;
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              L2: {
                if (param0.field_C < 0) {
                  break L2;
                } else {
                  param0.c(param1 ^ 8335402);
                  if (param0.field_z <= 0) {
                    break L2;
                  } else {
                    if (param0 == ((pk) this).field_O[param0.field_E][param0.field_z]) {
                      ((pk) this).field_O[param0.field_E][param0.field_z] = null;
                      break L2;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("pk.U(");
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
          throw ii.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0 != 0;
    }

    private final synchronized void a(boolean param0, int param1) {
        ((pk) this).field_w.b();
        if (param1 < 18) {
            ((pk) this).field_I = -90;
        }
        ((pk) this).field_v = null;
        int discarded$0 = -1;
        this.b(param0);
    }

    private final void c(int param0, int param1) {
        kl var3 = null;
        int var4 = 0;
        L0: {
          var4 = Bounce.field_N;
          if ((2 & ((pk) this).field_l[param0]) != 0) {
            var3 = (kl) (Object) ((pk) this).field_o.field_m.a((byte) -67);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (var3.field_E != param0) {
                    break L2;
                  } else {
                    if (((pk) this).field_C[param0][var3.field_r] == null) {
                      if (var3.field_C < 0) {
                        var3.field_C = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var3 = (kl) (Object) ((pk) this).field_o.field_m.d((byte) 123);
                      continue L1;
                    }
                  }
                }
                var3 = (kl) (Object) ((pk) this).field_o.field_m.d((byte) 123);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
    }

    final boolean a(int[] param0, int param1, int param2, kl param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        ch var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_10_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var12 = Bounce.field_N;
        try {
          L0: {
            L1: {
              param3.field_j = e.field_r / 100;
              var6_int = 83 % ((param4 - 37) / 52);
              if (0 > param3.field_C) {
                break L1;
              } else {
                L2: {
                  if (param3.field_i == null) {
                    break L2;
                  } else {
                    if (param3.field_i.e()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.d(0);
                  param3.c(2);
                  if (param3.field_z <= 0) {
                    break L3;
                  } else {
                    if (param3 == ((pk) this).field_O[param3.field_E][param3.field_z]) {
                      ((pk) this).field_O[param3.field_E][param3.field_z] = null;
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
              var7 = param3.field_x;
              if (var7 <= 0) {
                break L4;
              } else {
                L5: {
                  var7 = var7 - (int)(16.0 * Math.pow(2.0, (double)((pk) this).field_m[param3.field_E] * 0.0004921259842519685) + 0.5);
                  if (var7 < 0) {
                    var7 = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param3.field_x = var7;
                break L4;
              }
            }
            L6: {
              param3.field_i.e(this.a(param3, true));
              var8 = param3.field_o;
              param3.field_v = param3.field_v + var8.field_c;
              var9 = 0;
              param3.field_p = param3.field_p + 1;
              var10 = 0.000005086263020833333 * (double)((param3.field_r - 60 << 8) + (param3.field_h * param3.field_x >> 12));
              if (var8.field_k > 0) {
                L7: {
                  if (0 >= var8.field_g) {
                    param3.field_A = param3.field_A + 128;
                    break L7;
                  } else {
                    param3.field_A = param3.field_A + (int)(Math.pow(2.0, (double)var8.field_g * var10) * 128.0 + 0.5);
                    break L7;
                  }
                }
                if (var8.field_k * param3.field_A >= 819200) {
                  var9 = 1;
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L8: {
              if (var8.field_e == null) {
                break L8;
              } else {
                L9: {
                  if (0 < var8.field_l) {
                    param3.field_q = param3.field_q + (int)(128.0 * Math.pow(2.0, var10 * (double)var8.field_l) + 0.5);
                    break L9;
                  } else {
                    param3.field_q = param3.field_q + 128;
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (param3.field_s >= var8.field_e.length + -2) {
                      break L11;
                    } else {
                      if (~param3.field_q >= ~(65280 & var8.field_e[param3.field_s - -2] << 8)) {
                        break L11;
                      } else {
                        param3.field_s = param3.field_s + 2;
                        continue L10;
                      }
                    }
                  }
                  if (~param3.field_s != ~(-2 + var8.field_e.length)) {
                    break L8;
                  } else {
                    if (0 == var8.field_e[param3.field_s - -1]) {
                      var9 = 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              }
            }
            L12: {
              if (param3.field_C < 0) {
                break L12;
              } else {
                if (var8.field_i == null) {
                  break L12;
                } else {
                  if ((((pk) this).field_l[param3.field_E] & 1) != 0) {
                    break L12;
                  } else {
                    L13: {
                      if (param3.field_z < 0) {
                        break L13;
                      } else {
                        if (((pk) this).field_O[param3.field_E][param3.field_z] != param3) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (var8.field_b > 0) {
                        param3.field_C = param3.field_C + (int)(Math.pow(2.0, (double)var8.field_b * var10) * 128.0 + 0.5);
                        break L14;
                      } else {
                        param3.field_C = param3.field_C + 128;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (~(var8.field_i.length + -2) >= ~param3.field_y) {
                          break L16;
                        } else {
                          if ((var8.field_i[2 + param3.field_y] << 8 & 65280) >= param3.field_C) {
                            break L16;
                          } else {
                            param3.field_y = param3.field_y + 2;
                            continue L15;
                          }
                        }
                      }
                      if (var8.field_i.length - 2 != param3.field_y) {
                        break L12;
                      } else {
                        var9 = 1;
                        break L12;
                      }
                    }
                  }
                }
              }
            }
            if (var9 != 0) {
              L17: {
                param3.field_i.i(param3.field_j);
                if (param0 == null) {
                  param3.field_i.a(param1);
                  break L17;
                } else {
                  param3.field_i.a(param0, param2, param1);
                  break L17;
                }
              }
              L18: {
                if (!param3.field_i.k()) {
                  break L18;
                } else {
                  ((pk) this).field_o.field_l.a((wf) (Object) param3.field_i);
                  break L18;
                }
              }
              L19: {
                param3.d(0);
                if (param3.field_C < 0) {
                  break L19;
                } else {
                  param3.c(2);
                  if (0 >= param3.field_z) {
                    break L19;
                  } else {
                    if (((pk) this).field_O[param3.field_E][param3.field_z] == param3) {
                      ((pk) this).field_O[param3.field_E][param3.field_z] = null;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
              }
              stackOut_61_0 = 1;
              stackIn_62_0 = stackOut_61_0;
              return stackIn_62_0 != 0;
            } else {
              int discarded$1 = 68;
              param3.field_i.a(param3.field_j, this.b(param3), this.a(param3, (byte) 53));
              stackOut_63_0 = 0;
              stackIn_64_0 = stackOut_63_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var6;
            stackOut_65_1 = new StringBuilder().append("pk.LA(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L20;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L20;
            }
          }
          L21: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param3 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L21;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L21;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 44 + param4 + 41);
        }
        return stackIn_64_0 != 0;
    }

    final static void a(byte param0, String param1) {
        try {
            int var2_int = 57 / ((param0 - -73) / 52);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pk.JA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = Bounce.field_N;
            if (((pk) this).field_w.d()) {
              var2 = ((pk) this).field_n * ((pk) this).field_w.field_b / e.field_r;
              L2: while (true) {
                var3 = (long)var2 * (long)param0 + ((pk) this).field_P;
                if (-var3 + ((pk) this).field_L >= 0L) {
                  ((pk) this).field_P = var3;
                  break L1;
                } else {
                  var5 = (int)((-1L + ((long)var2 + (-((pk) this).field_P + ((pk) this).field_L))) / (long)var2);
                  ((pk) this).field_P = ((pk) this).field_P + (long)var5 * (long)var2;
                  ((pk) this).field_o.a(var5);
                  param0 = param0 - var5;
                  this.b((byte) -123);
                  if (((pk) this).field_w.d()) {
                    continue L2;
                  } else {
                    ((pk) this).field_o.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          ((pk) this).field_o.a(param0);
          break L0;
        }
    }

    final synchronized wf c() {
        return null;
    }

    private final void b(boolean param0) {
        int var3 = 0;
        int var4 = Bounce.field_N;
        if (!param0) {
            this.b(0, -1);
        } else {
            this.a(-1, 2099140935);
        }
        this.f(-1, -66);
        for (var3 = 0; var3 < 16; var3++) {
            ((pk) this).field_z[var3] = ((pk) this).field_M[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((pk) this).field_N[var5] = da.b(((pk) this).field_M[var5], -128);
            var5++;
        }
    }

    private final void a(int param0, int param1) {
        kl var3 = null;
        int var4 = 0;
        var4 = Bounce.field_N;
        var3 = (kl) (Object) ((pk) this).field_o.field_m.a((byte) -49);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (param0 != var3.field_E) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (null != var3.field_i) {
                  L4: {
                    var3.field_i.i(e.field_r / 100);
                    if (var3.field_i.k()) {
                      ((pk) this).field_o.field_l.a((wf) (Object) var3.field_i);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var3.d(0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (0 > var3.field_C) {
                  ((pk) this).field_C[var3.field_E][var3.field_r] = null;
                  break L5;
                } else {
                  break L5;
                }
              }
              var3.c(2);
              break L1;
            }
            var3 = (kl) (Object) ((pk) this).field_o.field_m.d((byte) 75);
            continue L0;
          }
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Bounce.field_N;
          var2 = ((pk) this).field_p;
          var3 = ((pk) this).field_A;
          if (param0 <= -41) {
            break L0;
          } else {
            ((pk) this).field_H = null;
            break L0;
          }
        }
        L1: {
          var4 = ((pk) this).field_L;
          if (null == ((pk) this).field_v) {
            break L1;
          } else {
            if (~((pk) this).field_G != ~var3) {
              break L1;
            } else {
              int discarded$2 = 1;
              this.a(((pk) this).field_v, ((pk) this).field_x, ((pk) this).field_F);
              this.b((byte) -108);
              return;
            }
          }
        }
        L2: while (true) {
          if (((pk) this).field_A != var3) {
            L3: {
              ((pk) this).field_L = var4;
              ((pk) this).field_A = var3;
              ((pk) this).field_p = var2;
              if (((pk) this).field_v == null) {
                break L3;
              } else {
                if (~var3 < ~((pk) this).field_G) {
                  ((pk) this).field_A = ((pk) this).field_G;
                  ((pk) this).field_p = -1;
                  ((pk) this).field_L = ((pk) this).field_w.f(((pk) this).field_A);
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
                if (((pk) this).field_w.field_d[var2] != var3) {
                  break L5;
                } else {
                  ((pk) this).field_w.e(var2);
                  var6 = ((pk) this).field_w.d(var2);
                  if (var6 != 1) {
                    L6: {
                      if ((var6 & 128) == 0) {
                        break L6;
                      } else {
                        this.e(32755, var6);
                        break L6;
                      }
                    }
                    ((pk) this).field_w.a(var2);
                    ((pk) this).field_w.c(var2);
                    continue L4;
                  } else {
                    ((pk) this).field_w.f();
                    ((pk) this).field_w.c(var2);
                    if (!((pk) this).field_w.a()) {
                      break L5;
                    } else {
                      if (((pk) this).field_v == null) {
                        L7: {
                          if (!((pk) this).field_F) {
                            break L7;
                          } else {
                            if (var3 != 0) {
                              ((pk) this).field_w.a(var4);
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        int discarded$3 = -1;
                        this.b(true);
                        ((pk) this).field_w.b();
                        return;
                      } else {
                        ((pk) this).a(((pk) this).field_v, ((pk) this).field_F, 71);
                        this.b((byte) -126);
                        return;
                      }
                    }
                  }
                }
              }
              var2 = ((pk) this).field_w.c();
              var3 = ((pk) this).field_w.field_d[var2];
              var4 = ((pk) this).field_w.f(var3);
              continue L2;
            }
          }
        }
    }

    final synchronized void e(int param0) {
        int var3 = Bounce.field_N;
        if (param0 != 16) {
            ((pk) this).field_E = null;
        }
        rj var4 = (rj) (Object) ((pk) this).field_u.b(0);
        while (var4 != null) {
            var4.e(125);
            var4 = (rj) (Object) ((pk) this).field_u.a(-1);
        }
    }

    final synchronized wf d() {
        return (wf) (Object) ((pk) this).field_o;
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        kl var5 = null;
        ue var6 = null;
        int var6_int = 0;
        kl var7 = null;
        kl var8 = null;
        int var9 = 0;
        rj var10 = null;
        rj var11 = null;
        Object stackIn_16_0 = null;
        kl stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        Object stackIn_17_0 = null;
        kl stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        Object stackIn_18_0 = null;
        kl stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        Object stackOut_15_0 = null;
        kl stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        Object stackOut_17_0 = null;
        kl stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        Object stackOut_16_0 = null;
        kl stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        L0: {
          var9 = Bounce.field_N;
          this.b(param3, param2, 64, 0);
          if ((((pk) this).field_l[param3] & 2) == 0) {
            break L0;
          } else {
            var5 = (kl) (Object) ((pk) this).field_o.field_m.b((byte) 60);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_E != param3) {
                    break L2;
                  } else {
                    if (var5.field_C >= 0) {
                      break L2;
                    } else {
                      ((pk) this).field_C[param3][var5.field_r] = null;
                      ((pk) this).field_C[param3][param2] = var5;
                      var6_int = var5.field_l + (var5.field_h * var5.field_x >> 12);
                      var5.field_l = var5.field_l + (-var5.field_r + param2 << 8);
                      var5.field_x = 4096;
                      var5.field_r = param2;
                      var5.field_h = var6_int + -var5.field_l;
                      return;
                    }
                  }
                }
                var5 = (kl) (Object) ((pk) this).field_o.field_m.a(-18158);
                continue L1;
              }
            }
          }
        }
        var10 = (rj) (Object) ((pk) this).field_u.a(48, (long)((pk) this).field_z[param3]);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_k[param2];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new kl();
              var7.field_E = param3;
              var7.field_D = var11;
              var7.field_w = var6;
              var7.field_o = var10.field_l[param2];
              var7.field_z = var10.field_i[param2];
              var7.field_r = param2;
              var7.field_n = var11.field_m * (param1 * param1 * var10.field_o[param2]) + 1024 >> 11;
              var7.field_k = 255 & var10.field_r[param2];
              var7.field_l = (param2 << 8) - (32767 & var10.field_n[param2]);
              var7.field_s = 0;
              var7.field_y = 0;
              var7.field_q = 0;
              var7.field_C = -1;
              var7.field_A = 0;
              if (((pk) this).field_s[param3] != 0) {
                L4: {
                  var7.field_i = pi.a(var6, this.a(var7, true), 0, this.a(var7, (byte) 53));
                  stackOut_15_0 = this;
                  stackOut_15_1 = (kl) var7;
                  stackOut_15_2 = -117;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (var11.field_n[param2] >= 0) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = (kl) (Object) stackIn_17_1;
                    stackOut_17_2 = stackIn_17_2;
                    stackOut_17_3 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L4;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = (kl) (Object) stackIn_16_1;
                    stackOut_16_2 = stackIn_16_2;
                    stackOut_16_3 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L4;
                  }
                }
                ((pk) this).a(stackIn_18_1, (byte) stackIn_18_2, stackIn_18_3 != 0);
                break L3;
              } else {
                int discarded$1 = 68;
                var7.field_i = pi.a(var6, this.a(var7, true), this.b(var7), this.a(var7, (byte) 53));
                break L3;
              }
            }
            L5: {
              if (var11.field_n[param2] >= 0) {
                break L5;
              } else {
                var7.field_i.f(-1);
                break L5;
              }
            }
            L6: {
              if (var7.field_z >= 0) {
                L7: {
                  var8 = ((pk) this).field_O[param3][var7.field_z];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_C < 0) {
                      ((pk) this).field_C[param3][var8.field_r] = null;
                      var8.field_C = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((pk) this).field_O[param3][var7.field_z] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            ((pk) this).field_o.field_m.a(1, (ai) (Object) var7);
            ((pk) this).field_C[param3][param2] = var7;
            return;
          }
        }
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        var3 = param1 & 240;
        if (128 == var3) {
          var4 = 15 & param1;
          var5 = (32542 & param1) >> 8;
          var6 = (param1 & 8374679) >> 16;
          this.b(var4, var5, var6, 0);
          return;
        } else {
          L0: {
            if (144 == var3) {
              var4 = 15 & param1;
              var5 = param1 >> 8 & 127;
              var6 = (8335400 & param1) >> 16;
              if (var6 <= 0) {
                this.b(var4, var5, 64, 0);
                return;
              } else {
                this.a(true, var6, var5, var4);
                break L0;
              }
            } else {
              if (var3 != 160) {
                if (var3 == 176) {
                  L1: {
                    var4 = 15 & param1;
                    var5 = 127 & param1 >> 8;
                    var6 = (param1 & 8377708) >> 16;
                    if (0 == var5) {
                      ((pk) this).field_N[var4] = (var6 << 14) + da.b(-2080769, ((pk) this).field_N[var4]);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (var5 == 32) {
                      ((pk) this).field_N[var4] = da.b(-16257, ((pk) this).field_N[var4]) + (var6 << 7);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (1 != var5) {
                      break L3;
                    } else {
                      ((pk) this).field_E[var4] = (var6 << 7) + da.b(((pk) this).field_E[var4], -16257);
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 == 33) {
                      ((pk) this).field_E[var4] = da.b(-128, ((pk) this).field_E[var4]) + var6;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var5 == 5) {
                      ((pk) this).field_m[var4] = (var6 << 7) + da.b(-16257, ((pk) this).field_m[var4]);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (var5 == 37) {
                      ((pk) this).field_m[var4] = var6 + da.b(((pk) this).field_m[var4], -128);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (7 == var5) {
                      ((pk) this).field_J[var4] = (var6 << 7) + da.b(-16257, ((pk) this).field_J[var4]);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var5 == 39) {
                      ((pk) this).field_J[var4] = var6 + da.b(((pk) this).field_J[var4], -128);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (var5 == 10) {
                      ((pk) this).field_k[var4] = (var6 << 7) + da.b(((pk) this).field_k[var4], -16257);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var5 == 42) {
                      ((pk) this).field_k[var4] = var6 + da.b(((pk) this).field_k[var4], -128);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 != 11) {
                      break L11;
                    } else {
                      ((pk) this).field_q[var4] = (var6 << 7) + da.b(-16257, ((pk) this).field_q[var4]);
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 43) {
                      ((pk) this).field_q[var4] = da.b(-128, ((pk) this).field_q[var4]) + var6;
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
                        ((pk) this).field_l[var4] = da.b(((pk) this).field_l[var4], -2);
                        break L13;
                      } else {
                        ((pk) this).field_l[var4] = ge.a(((pk) this).field_l[var4], 1);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (65 == var5) {
                      if (var6 < 64) {
                        this.c(var4, 20974);
                        ((pk) this).field_l[var4] = da.b(((pk) this).field_l[var4], -3);
                        break L14;
                      } else {
                        ((pk) this).field_l[var4] = ge.a(((pk) this).field_l[var4], 2);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var5 == 99) {
                      ((pk) this).field_t[var4] = (var6 << 7) + da.b(127, ((pk) this).field_t[var4]);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (var5 != 98) {
                      break L16;
                    } else {
                      ((pk) this).field_t[var4] = da.b(16256, ((pk) this).field_t[var4]) + var6;
                      break L16;
                    }
                  }
                  L17: {
                    if (101 == var5) {
                      ((pk) this).field_t[var4] = (var6 << 7) + (16384 - -da.b(127, ((pk) this).field_t[var4]));
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 != 100) {
                      break L18;
                    } else {
                      ((pk) this).field_t[var4] = da.b(16256, ((pk) this).field_t[var4]) + 16384 - -var6;
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 != 120) {
                      break L19;
                    } else {
                      this.a(var4, 2099140935);
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 == 121) {
                      this.f(var4, -35);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (var5 != 123) {
                      break L21;
                    } else {
                      this.b(0, var4);
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 == 6) {
                      var7 = ((pk) this).field_t[var4];
                      if (var7 != 16384) {
                        break L22;
                      } else {
                        ((pk) this).field_H[var4] = da.b(-16257, ((pk) this).field_H[var4]) - -(var6 << 7);
                        break L22;
                      }
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (38 == var5) {
                      var7 = ((pk) this).field_t[var4];
                      if (16384 == var7) {
                        ((pk) this).field_H[var4] = da.b(((pk) this).field_H[var4], -128) - -var6;
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (16 == var5) {
                      ((pk) this).field_s[var4] = (var6 << 7) + da.b(((pk) this).field_s[var4], -16257);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 != 48) {
                      break L25;
                    } else {
                      ((pk) this).field_s[var4] = da.b(((pk) this).field_s[var4], -128) - -var6;
                      break L25;
                    }
                  }
                  L26: {
                    if (var5 != 81) {
                      break L26;
                    } else {
                      if (var6 < 64) {
                        this.d(80, var4);
                        ((pk) this).field_l[var4] = da.b(((pk) this).field_l[var4], -5);
                        break L26;
                      } else {
                        ((pk) this).field_l[var4] = ge.a(((pk) this).field_l[var4], 4);
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (var5 != 17) {
                      break L27;
                    } else {
                      this.a(true, (((pk) this).field_B[var4] & -16257) - -(var6 << 7), var4);
                      break L27;
                    }
                  }
                  if (var5 != 49) {
                    break L0;
                  } else {
                    this.a(true, var6 + (-128 & ((pk) this).field_B[var4]), var4);
                    return;
                  }
                } else {
                  if (192 == var3) {
                    var4 = param1 & 15;
                    var5 = param1 >> 8 & 127;
                    this.a((byte) -88, var4, var5 + ((pk) this).field_N[var4]);
                    return;
                  } else {
                    if (var3 == 208) {
                      var4 = 15 & param1;
                      var5 = param1 >> 8 & 127;
                      this.b(23882, var5, var4);
                      return;
                    } else {
                      if (var3 == 224) {
                        var4 = param1 & 15;
                        var5 = ((8323429 & param1) >> 9) - -(param1 >> 8 & 127);
                        this.a(var4, (byte) 126, var5);
                        return;
                      } else {
                        var3 = param1 & 255;
                        if (var3 != 255) {
                          return;
                        } else {
                          int discarded$1 = -1;
                          this.b(true);
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                var4 = param1 & 15;
                var5 = (32755 & param1) >> 8;
                var6 = 127 & param1 >> 16;
                this.a(var4, 128, var6, var5);
                return;
              }
            }
          }
          return;
        }
    }

    public static void d(int param0) {
        field_D = null;
    }

    final synchronized void b(byte param0, int param1, int param2) {
        if (param0 <= 14) {
            return;
        }
        this.c((byte) -79, param1, param2);
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Bounce.field_N;
        if (param0 >= -53) {
            ((pk) this).field_y = null;
        }
        if (!(~((pk) this).field_z[param1] == ~param2)) {
            ((pk) this).field_z[param1] = param2;
            for (var4 = 0; var4 < 128; var4++) {
                ((pk) this).field_O[param1][var4] = null;
            }
        }
    }

    private final int a(kl param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ch var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var3_int = (param0.field_x * param0.field_h >> 12) + param0.field_l;
              var3_int = var3_int + (((pk) this).field_H[param0.field_E] * (((pk) this).field_y[param0.field_E] + -8192) >> 12);
              var4 = param0.field_o;
              if (var4.field_c <= 0) {
                break L1;
              } else {
                L2: {
                  if (var4.field_f > 0) {
                    break L2;
                  } else {
                    if (((pk) this).field_E[param0.field_E] > 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_f << 2;
                  var6 = var4.field_d << 1;
                  if (var6 > param0.field_p) {
                    var5 = var5 * param0.field_p / var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = var5 + (((pk) this).field_E[param0.field_E] >> 7);
                var7 = Math.sin((double)(param0.field_v & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L1;
              }
            }
            if (param1) {
              L4: {
                var5 = (int)(0.5 + (double)(param0.field_w.field_k * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)e.field_r);
                if (var5 >= 1) {
                  stackOut_13_0 = var5;
                  stackIn_14_0 = stackOut_13_0;
                  break L4;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_9_0 = -85;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("pk.O(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
        }
        return stackIn_14_0;
    }

    private final void b(int param0, int param1, int param2) {
    }

    final synchronized void f(int param0) {
        this.a(true, 60);
        if (param0 != -22719) {
            Object var3 = null;
            int discarded$0 = this.a((kl) null, false);
        }
    }

    private final void a(int param0, byte param1, int param2) {
        ((pk) this).field_y[param0] = param2;
    }

    private final void b(int param0, int param1, int param2, int param3) {
        kl var5 = null;
        kl var6 = null;
        int var7 = 0;
        var7 = Bounce.field_N;
        var5 = ((pk) this).field_C[param0][param1];
        if (var5 != null) {
          L0: {
            ((pk) this).field_C[param0][param1] = null;
            if (0 == (2 & ((pk) this).field_l[param0])) {
              var5.field_C = 0;
              break L0;
            } else {
              var6 = (kl) (Object) ((pk) this).field_o.field_m.a((byte) -73);
              L1: while (true) {
                if (var6 == null) {
                  break L0;
                } else {
                  L2: {
                    if (var6.field_E != var5.field_E) {
                      break L2;
                    } else {
                      if (0 <= var6.field_C) {
                        break L2;
                      } else {
                        if (var6 == var5) {
                          break L2;
                        } else {
                          var5.field_C = 0;
                          break L0;
                        }
                      }
                    }
                  }
                  var6 = (kl) (Object) ((pk) this).field_o.field_m.d((byte) 73);
                  continue L1;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(kl param0, byte param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
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
            if (param1 <= -114) {
              L1: {
                L2: {
                  var4_int = param0.field_w.field_h.length;
                  if (!param2) {
                    break L2;
                  } else {
                    if (!param0.field_w.field_j) {
                      break L2;
                    } else {
                      L3: {
                        var6 = -param0.field_w.field_i + var4_int + var4_int;
                        var5 = (int)((long)((pk) this).field_s[param0.field_E] * (long)var6 >> 6);
                        var4_int = var4_int << 8;
                        if (var4_int > var5) {
                          break L3;
                        } else {
                          param0.field_i.a(true);
                          var5 = -1 + var4_int + (var4_int - var5);
                          break L3;
                        }
                      }
                      break L1;
                    }
                  }
                }
                var5 = (int)((long)((pk) this).field_s[param0.field_E] * (long)var4_int >> 6);
                break L1;
              }
              param0.field_i.g(var5);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("pk.DA(");
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
          throw ii.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void d(int param0, int param1) {
        kl var3 = null;
        int var4 = Bounce.field_N;
        if (0 != (4 & ((pk) this).field_l[param1])) {
            var3 = (kl) (Object) ((pk) this).field_o.field_m.a((byte) -71);
            while (var3 != null) {
                if (!(var3.field_E != param1)) {
                    var3.field_u = 0;
                }
                var3 = (kl) (Object) ((pk) this).field_o.field_m.d((byte) -40);
            }
        }
        if (param0 <= 25) {
            ((pk) this).field_m = null;
        }
    }

    private final int a(kl param0, byte param1) {
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
              if (param1 == 53) {
                break L1;
              } else {
                ((pk) this).a(-12);
                break L1;
              }
            }
            var3_int = ((pk) this).field_k[param0.field_E];
            if (var3_int < 8192) {
              stackOut_5_0 = var3_int * param0.field_k - -32 >> 6;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = -(32 + (16384 - var3_int) * (128 + -param0.field_k) >> 6) + 16384;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("pk.I(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
    }

    private final void a(boolean param0, int param1, int param2) {
        ((pk) this).field_B[param2] = param1;
        ((pk) this).field_K[param2] = (int)(2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625) + 0.5);
    }

    final synchronized boolean a(byte param0, i param1, gk param2, be param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        kj var8 = null;
        int var9 = 0;
        int var11 = 0;
        rj var12 = null;
        rj var13 = null;
        int stackIn_5_0 = 0;
        int stackIn_20_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_4_0 = 0;
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
        var11 = Bounce.field_N;
        try {
          L0: {
            L1: {
              param3.b();
              var6_int = 1;
              var7 = null;
              if (param4 <= 0) {
                break L1;
              } else {
                var7 = (Object) (Object) new int[]{param4};
                break L1;
              }
            }
            var8 = (kj) (Object) param3.field_g.b(0);
            if (param0 <= -89) {
              L2: while (true) {
                if (var8 == null) {
                  L3: {
                    if (var6_int != 0) {
                      param3.a();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackOut_19_0 = var6_int;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      var9 = (int)var8.field_d;
                      var12 = (rj) (Object) ((pk) this).field_u.a(124, (long)var9);
                      if (var12 == null) {
                        var13 = fj.a(param2, 0, var9);
                        if (var13 != null) {
                          ((pk) this).field_u.a((long)var9, 46, (ai) (Object) var13);
                          if (!var13.a((byte) 112, var8.field_h, (int[]) var7, param1)) {
                            break L5;
                          } else {
                            break L4;
                          }
                        } else {
                          var6_int = 0;
                          break L4;
                        }
                      } else {
                        if (!var12.a((byte) 112, var8.field_h, (int[]) var7, param1)) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var6_int = 0;
                    break L4;
                  }
                  var8 = (kj) (Object) param3.field_g.a(-1);
                  continue L2;
                }
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("pk.G(").append(param0).append(44);
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
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param4 + 41);
        }
        return stackIn_20_0 != 0;
    }

    final synchronized void g(int param0, int param1) {
        if (param1 != 100) {
            Object var4 = null;
            int discarded$0 = this.a((kl) null, (byte) -18);
        }
        ((pk) this).field_I = param0;
    }

    private final void f(int param0, int param1) {
        int var4 = 0;
        var4 = Bounce.field_N;
        if (param0 >= 0) {
          L0: {
            ((pk) this).field_J[param0] = 12800;
            ((pk) this).field_k[param0] = 8192;
            ((pk) this).field_q[param0] = 16383;
            if (param1 <= 0) {
              break L0;
            } else {
              ((pk) this).field_A = -66;
              break L0;
            }
          }
          ((pk) this).field_y[param0] = 8192;
          ((pk) this).field_E[param0] = 0;
          ((pk) this).field_m[param0] = 8192;
          this.c(param0, 20974);
          this.d(110, param0);
          ((pk) this).field_l[param0] = 0;
          ((pk) this).field_t[param0] = 32767;
          ((pk) this).field_H[param0] = 256;
          ((pk) this).field_s[param0] = 0;
          this.a(true, 8192, param0);
          return;
        } else {
          param0 = 0;
          L1: while (true) {
            if (param0 >= 16) {
              return;
            } else {
              this.f(param0, -15);
              param0++;
              continue L1;
            }
          }
        }
    }

    public pk() {
        ((pk) this).field_M = new int[16];
        ((pk) this).field_t = new int[16];
        ((pk) this).field_H = new int[16];
        ((pk) this).field_O = new kl[16][128];
        ((pk) this).field_k = new int[16];
        ((pk) this).field_q = new int[16];
        ((pk) this).field_n = 1000000;
        ((pk) this).field_K = new int[16];
        ((pk) this).field_z = new int[16];
        ((pk) this).field_I = 256;
        ((pk) this).field_J = new int[16];
        ((pk) this).field_E = new int[16];
        ((pk) this).field_r = new int[16];
        ((pk) this).field_B = new int[16];
        ((pk) this).field_m = new int[16];
        ((pk) this).field_C = new kl[16][128];
        ((pk) this).field_s = new int[16];
        ((pk) this).field_y = new int[16];
        ((pk) this).field_N = new int[16];
        ((pk) this).field_l = new int[16];
        ((pk) this).field_w = new oe();
        ((pk) this).field_o = new ka((pk) this);
        ((pk) this).field_u = new uk(128);
        this.a(0, 256, -1);
        int discarded$0 = -1;
        this.b(true);
    }

    static {
    }
}
