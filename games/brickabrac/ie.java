/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends qd {
    private int[] field_z;
    int[] field_y;
    private int[] field_P;
    int[] field_n;
    private int[] field_V;
    static String field_o;
    int[] field_U;
    private int field_E;
    private ka[][] field_r;
    private int[] field_W;
    static vl field_v;
    private int[] field_S;
    private int[] field_Q;
    private hr field_K;
    private int[] field_m;
    private si field_w;
    private int[] field_p;
    private int[] field_G;
    private ka[][] field_A;
    static String field_u;
    private int[] field_D;
    private int field_t;
    private int[] field_R;
    private int[] field_J;
    static String field_q;
    private int[] field_s;
    private long field_B;
    private int field_x;
    private long field_F;
    private int field_O;
    private boolean field_N;
    private lk field_C;
    private boolean field_L;
    private vm field_I;
    private int field_M;

    private final int b(int param0, ka param1) {
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
            var3_int = ((ie) this).field_W[param1.field_u];
            if (var3_int < 8192) {
              stackOut_3_0 = 32 + param1.field_t * var3_int >> 6;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 16384 - ((-param1.field_t + 128) * (-var3_int + 16384) - -32 >> 6);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ie.IA(").append(2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(int param0, int[] param1, int param2, ka param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        jm var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.field_z = tj.field_q / 100;
              if (0 > param3.field_x) {
                break L1;
              } else {
                L2: {
                  if (null == param3.field_y) {
                    break L2;
                  } else {
                    if (param3.field_y.l()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.a(param0 ^ -23346);
                  param3.b((byte) 111);
                  if (param3.field_q <= 0) {
                    break L3;
                  } else {
                    if (((ie) this).field_r[param3.field_u][param3.field_q] == param3) {
                      ((ie) this).field_r[param3.field_u][param3.field_q] = null;
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
            var6_int = param3.field_o;
            if (param0 == 23300) {
              L4: {
                if (var6_int <= 0) {
                  break L4;
                } else {
                  L5: {
                    var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((ie) this).field_D[param3.field_u]));
                    if (0 > var6_int) {
                      var6_int = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  param3.field_o = var6_int;
                  break L4;
                }
              }
              L6: {
                param3.field_y.c(this.a(-11, param3));
                var7 = param3.field_G;
                param3.field_v = param3.field_v + 1;
                var8 = 0;
                param3.field_i = param3.field_i + var7.field_d;
                var9 = 0.000005086263020833333 * (double)((param3.field_B + -60 << 8) - -(param3.field_o * param3.field_r >> 12));
                if (var7.field_j <= 0) {
                  break L6;
                } else {
                  L7: {
                    if (var7.field_k <= 0) {
                      param3.field_w = param3.field_w + 128;
                      break L7;
                    } else {
                      param3.field_w = param3.field_w + (int)(Math.pow(2.0, (double)var7.field_k * var9) * 128.0 + 0.5);
                      break L7;
                    }
                  }
                  if (param3.field_w * var7.field_j >= 819200) {
                    var8 = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L8: {
                if (null != var7.field_g) {
                  L9: {
                    if (var7.field_h > 0) {
                      param3.field_s = param3.field_s + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_h) * 128.0);
                      break L9;
                    } else {
                      param3.field_s = param3.field_s + 128;
                      break L9;
                    }
                  }
                  L10: while (true) {
                    L11: {
                      if (param3.field_A >= -2 + var7.field_g.length) {
                        break L11;
                      } else {
                        if (param3.field_s <= (255 & var7.field_g[param3.field_A + 2]) << 8) {
                          break L11;
                        } else {
                          param3.field_A = param3.field_A + 2;
                          continue L10;
                        }
                      }
                    }
                    if (-2 + var7.field_g.length != param3.field_A) {
                      break L8;
                    } else {
                      if (var7.field_g[param3.field_A - -1] != 0) {
                        break L8;
                      } else {
                        var8 = 1;
                        break L8;
                      }
                    }
                  }
                } else {
                  break L8;
                }
              }
              L12: {
                if (param3.field_x < 0) {
                  break L12;
                } else {
                  if (var7.field_c == null) {
                    break L12;
                  } else {
                    if (0 != (1 & ((ie) this).field_n[param3.field_u])) {
                      break L12;
                    } else {
                      L13: {
                        if (param3.field_q < 0) {
                          break L13;
                        } else {
                          if (param3 != ((ie) this).field_r[param3.field_u][param3.field_q]) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        if (var7.field_b <= 0) {
                          param3.field_x = param3.field_x + 128;
                          break L14;
                        } else {
                          param3.field_x = param3.field_x + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_b) + 0.5);
                          break L14;
                        }
                      }
                      L15: while (true) {
                        L16: {
                          if (~(var7.field_c.length + -2) >= ~param3.field_D) {
                            break L16;
                          } else {
                            if (~param3.field_x >= ~(var7.field_c[2 + param3.field_D] << 8 & 65280)) {
                              break L16;
                            } else {
                              param3.field_D = param3.field_D + 2;
                              continue L15;
                            }
                          }
                        }
                        if (~param3.field_D == ~(-2 + var7.field_c.length)) {
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
              if (var8 != 0) {
                L17: {
                  param3.field_y.g(param3.field_z);
                  if (param1 != null) {
                    param3.field_y.b(param1, param4, param2);
                    break L17;
                  } else {
                    param3.field_y.a(param2);
                    break L17;
                  }
                }
                L18: {
                  if (!param3.field_y.k()) {
                    break L18;
                  } else {
                    ((ie) this).field_C.field_m.b((qd) (Object) param3.field_y);
                    break L18;
                  }
                }
                L19: {
                  param3.a(-94);
                  if (param3.field_x >= 0) {
                    param3.b((byte) 111);
                    if (param3.field_q <= 0) {
                      break L19;
                    } else {
                      if (param3 != ((ie) this).field_r[param3.field_u][param3.field_q]) {
                        break L19;
                      } else {
                        ((ie) this).field_r[param3.field_u][param3.field_q] = null;
                        break L19;
                      }
                    }
                  } else {
                    break L19;
                  }
                }
                stackOut_64_0 = 1;
                stackIn_65_0 = stackOut_64_0;
                return stackIn_65_0 != 0;
              } else {
                param3.field_y.a(param3.field_z, this.b(param3, param0 + -29023), this.b(2, param3));
                stackOut_66_0 = 0;
                stackIn_67_0 = stackOut_66_0;
                break L0;
              }
            } else {
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var6;
            stackOut_68_1 = new StringBuilder().append("ie.SA(").append(param0).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L20;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L20;
            }
          }
          L21: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param3 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L21;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L21;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + param4 + ')');
        }
        return stackIn_67_0 != 0;
    }

    private final void c(int param0, int param1) {
        ka var3 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if ((4 & ((ie) this).field_n[param0]) != 0) {
            var3 = (ka) (Object) ((ie) this).field_C.field_v.d(-117);
            while (var3 != null) {
                if (var3.field_u == param0) {
                    var3.field_j = 0;
                }
                var3 = (ka) (Object) ((ie) this).field_C.field_v.a((byte) 116);
            }
        }
    }

    private final void f(int param0, int param1, int param2) {
        if (param2 != 2) {
            Object var5 = null;
            boolean discarded$0 = ((ie) this).a((ka) null, 102);
        }
        ((ie) this).field_V[param0] = param1;
    }

    final synchronized qd d() {
        return null;
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        fa var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4 = (fa) (Object) wp.field_f.d(-33);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                hq.a(var4, 2, 49);
                var4 = (fa) (Object) wp.field_f.a((byte) 116);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "ie.EA(" + 2 + ',' + -46 + ')');
        }
    }

    final synchronized void a(int param0, boolean param1) {
        if (param1) {
            return;
        }
        ((ie) this).field_E = param0;
    }

    private final void a(int param0, int param1) {
        ka var3 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (!((((ie) this).field_n[param1] & 2) == 0)) {
            var3 = (ka) (Object) ((ie) this).field_C.field_v.d(-70);
            while (var3 != null) {
                if (param1 == var3.field_u) {
                    if (((ie) this).field_A[param1][var3.field_B] == null) {
                        if (var3.field_x < 0) {
                            var3.field_x = 0;
                        }
                    }
                }
                var3 = (ka) (Object) ((ie) this).field_C.field_v.a((byte) 116);
            }
        }
    }

    private final void d(int param0, int param1, int param2) {
        ((ie) this).field_R[param1] = param0;
        ((ie) this).field_p[param1] = ik.a(-128, param0);
        this.a(-203445432, param0, param1);
    }

    final synchronized void a(byte param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        int var2 = -47 / ((param0 - -49) / 33);
        pq var3 = (pq) (Object) ((ie) this).field_w.b(-15519);
        while (var3 != null) {
            var3.c((byte) 81);
            var3 = (pq) (Object) ((ie) this).field_w.a(true);
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
    }

    private final void g(int param0, int param1, int param2) {
        ((ie) this).field_z[param2] = param0;
        ((ie) this).field_U[param2] = (int)(Math.pow(2.0, 0.00054931640625 * (double)param0) * 2097152.0 + 0.5);
    }

    final synchronized int b() {
        return 0;
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          try {
            if (!tg.field_b.startsWith("win")) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L0: {
                if (param0.startsWith("http://")) {
                  break L0;
                } else {
                  if (param0.startsWith("https://")) {
                    break L0;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                if (var3 >= param0.length()) {
                  L2: {
                    if (!param1) {
                      break L2;
                    } else {
                      var5 = null;
                      boolean discarded$4 = ie.a((String) null, true);
                      break L2;
                    }
                  }
                  Process discarded$5 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0 != 0;
                } else {
                  if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_19_0 = 0;
            stackIn_20_0 = stackOut_19_0;
            return stackIn_20_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2_ref2;
            stackOut_21_1 = new StringBuilder().append("ie.G(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          var2 = ((ie) this).field_x;
          var3 = ((ie) this).field_O;
          var4 = ((ie) this).field_B;
          if (null == ((ie) this).field_I) {
            break L0;
          } else {
            if (((ie) this).field_M != var3) {
              break L0;
            } else {
              this.a(((ie) this).field_L, true, ((ie) this).field_N, ((ie) this).field_I);
              this.e(-2);
              return;
            }
          }
        }
        L1: while (true) {
          if (var3 != ((ie) this).field_O) {
            L2: {
              ((ie) this).field_x = var2;
              ((ie) this).field_O = var3;
              if (param0 == -2) {
                break L2;
              } else {
                field_o = null;
                break L2;
              }
            }
            L3: {
              ((ie) this).field_B = var4;
              if (null == ((ie) this).field_I) {
                break L3;
              } else {
                if (((ie) this).field_M < var3) {
                  ((ie) this).field_x = -1;
                  ((ie) this).field_O = ((ie) this).field_M;
                  ((ie) this).field_B = ((ie) this).field_K.c(((ie) this).field_O);
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
                if (var3 != ((ie) this).field_K.field_f[var2]) {
                  break L5;
                } else {
                  ((ie) this).field_K.a(var2);
                  var6 = ((ie) this).field_K.e(var2);
                  if (var6 != 1) {
                    L6: {
                      if ((var6 & 128) == 0) {
                        break L6;
                      } else {
                        this.e(-123, var6);
                        break L6;
                      }
                    }
                    ((ie) this).field_K.f(var2);
                    ((ie) this).field_K.b(var2);
                    continue L4;
                  } else {
                    ((ie) this).field_K.b();
                    ((ie) this).field_K.b(var2);
                    if (((ie) this).field_K.f()) {
                      if (((ie) this).field_I != null) {
                        ((ie) this).a(((ie) this).field_I, 126, ((ie) this).field_N);
                        this.e(param0);
                        return;
                      } else {
                        L7: {
                          if (!((ie) this).field_N) {
                            break L7;
                          } else {
                            if (var3 != 0) {
                              ((ie) this).field_K.a(var4);
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        this.b(-108, true);
                        ((ie) this).field_K.d();
                        return;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var2 = ((ie) this).field_K.a();
              var3 = ((ie) this).field_K.field_f[var2];
              var4 = ((ie) this).field_K.c(var3);
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        ka var5 = null;
        oe var6 = null;
        int var6_int = 0;
        ka var7 = null;
        ka var8 = null;
        int var9 = 0;
        pq var10 = null;
        pq var11 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ka stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        ka stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        ka stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ka stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        ka stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ka stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        L0: {
          var9 = BrickABrac.field_J ? 1 : 0;
          this.a(115, param2, param0, 64);
          if ((((ie) this).field_n[param0] & 2) != 0) {
            var5 = (ka) (Object) ((ie) this).field_C.field_v.f(0);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_u != param0) {
                    break L2;
                  } else {
                    if (var5.field_x < 0) {
                      ((ie) this).field_A[param0][var5.field_B] = null;
                      ((ie) this).field_A[param0][param2] = var5;
                      var6_int = (var5.field_o * var5.field_r >> 12) + var5.field_p;
                      var5.field_p = var5.field_p + (-var5.field_B + param2 << 8);
                      var5.field_r = -var5.field_p + var6_int;
                      var5.field_o = 4096;
                      var5.field_B = param2;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (ka) (Object) ((ie) this).field_C.field_v.b(-111);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (pq) (Object) ((ie) this).field_w.a(-81, (long)((ie) this).field_J[param0]);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_t[param2];
          if (var6 != null) {
            L3: {
              var7 = new ka();
              var7.field_u = param0;
              var7.field_F = var6;
              var7.field_k = var10;
              var7.field_G = var10.field_l[param2];
              var7.field_q = var10.field_i[param2];
              var7.field_B = param2;
              var7.field_m = param3 * param3 * (var10.field_u * var10.field_p[param2]) + 1024 >> 11;
              var7.field_t = 255 & var10.field_r[param2];
              var7.field_p = -(32767 & var10.field_j[param2]) + (param2 << 8);
              var7.field_D = 0;
              var7.field_w = 0;
              var7.field_s = 0;
              var7.field_A = 0;
              var7.field_x = -1;
              if (((ie) this).field_y[param0] != 0) {
                L4: {
                  var7.field_y = kl.a(var6, this.a(-11, var7), 0, this.b(2, var7));
                  stackOut_16_0 = this;
                  stackOut_16_1 = 0;
                  stackOut_16_2 = (ka) var7;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (var11.field_j[param2] >= 0) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = (ka) (Object) stackIn_18_2;
                    stackOut_18_3 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L4;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (ka) (Object) stackIn_17_2;
                    stackOut_17_3 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L4;
                  }
                }
                ((ie) this).a(stackIn_19_1 != 0, stackIn_19_2, stackIn_19_3 != 0);
                break L3;
              } else {
                var7.field_y = kl.a(var6, this.a(-11, var7), this.b(var7, -5723), this.b(2, var7));
                break L3;
              }
            }
            L5: {
              if (var11.field_j[param2] >= 0) {
                break L5;
              } else {
                var7.field_y.f(-1);
                break L5;
              }
            }
            L6: {
              if (var7.field_q >= 0) {
                L7: {
                  var8 = ((ie) this).field_r[param0][var7.field_q];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_x >= 0) {
                      break L7;
                    } else {
                      ((ie) this).field_A[param0][var8.field_B] = null;
                      var8.field_x = 0;
                      break L7;
                    }
                  }
                }
                ((ie) this).field_r[param0][var7.field_q] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            ((ie) this).field_C.field_v.a((nm) (Object) var7, (byte) 3);
            ((ie) this).field_A[param0][param2] = var7;
            return;
          } else {
            return;
          }
        }
    }

    final synchronized void a(vm param0, int param1, boolean param2) {
        try {
            int var4_int = -17 / ((param1 - 74) / 51);
            this.a(true, true, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ie.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void f(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 < 0) {
          param0 = 0;
          L0: while (true) {
            if (param0 >= 16) {
              return;
            } else {
              this.f(param0, -100);
              param0++;
              continue L0;
            }
          }
        } else {
          ((ie) this).field_s[param0] = 12800;
          ((ie) this).field_W[param0] = 8192;
          ((ie) this).field_Q[param0] = 16383;
          ((ie) this).field_V[param0] = 8192;
          ((ie) this).field_m[param0] = 0;
          ((ie) this).field_D[param0] = 8192;
          this.a(0, param0);
          this.c(param0, 0);
          ((ie) this).field_n[param0] = 0;
          var3 = 30 % ((param1 - 7) / 59);
          ((ie) this).field_P[param0] = 32767;
          ((ie) this).field_G[param0] = 256;
          ((ie) this).field_y[param0] = 0;
          this.g(8192, 1010, param0);
          return;
        }
    }

    final synchronized void b(int param0, int param1) {
        ((ie) this).field_t = param0;
        if (param1 != -606970073) {
            ((ie) this).b(-19, -107);
        }
    }

    private final void a(byte param0, int param1) {
        ka var3 = null;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        var3 = (ka) (Object) ((ie) this).field_C.field_v.d(-28);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param1 < 0) {
                  break L2;
                } else {
                  if (var3.field_u == param1) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (null != var3.field_y) {
                  L4: {
                    var3.field_y.g(tj.field_q / 100);
                    if (!var3.field_y.k()) {
                      break L4;
                    } else {
                      ((ie) this).field_C.field_m.b((qd) (Object) var3.field_y);
                      break L4;
                    }
                  }
                  var3.a(-95);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (var3.field_x < 0) {
                  ((ie) this).field_A[var3.field_u][var3.field_B] = null;
                  break L5;
                } else {
                  break L5;
                }
              }
              var3.b((byte) 111);
              break L1;
            }
            var3 = (ka) (Object) ((ie) this).field_C.field_v.a((byte) 116);
            continue L0;
          }
        }
    }

    final synchronized qd a() {
        return (qd) (Object) ((ie) this).field_C;
    }

    private final void c(int param0, int param1, int param2) {
        if (param0 != -1427) {
            Object var5 = null;
            boolean discarded$0 = ((ie) this).a(-16, (int[]) null, -83, (ka) null, 92);
        }
    }

    final boolean a(ka param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (null != param0.field_y) {
              var3_int = -48 / ((-62 - param1) / 50);
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              L1: {
                if (param0.field_x < 0) {
                  break L1;
                } else {
                  param0.b((byte) 111);
                  if (param0.field_q <= 0) {
                    break L1;
                  } else {
                    if (param0 != ((ie) this).field_r[param0.field_u][param0.field_q]) {
                      break L1;
                    } else {
                      ((ie) this).field_r[param0.field_u][param0.field_q] = null;
                      return true;
                    }
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ie.QA(");
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0 != 0;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (param1 != ((ie) this).field_J[param2]) {
            ((ie) this).field_J[param2] = param1;
            for (var4 = 0; var4 < 128; var4++) {
                ((ie) this).field_r[param2][var4] = null;
            }
        }
    }

    final void a(boolean param0, ka param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = param1.field_F.field_m.length;
                if (!param2) {
                  break L2;
                } else {
                  if (!param1.field_F.field_j) {
                    break L2;
                  } else {
                    var6 = var4_int - (-var4_int + param1.field_F.field_n);
                    var5 = (int)((long)((ie) this).field_y[param1.field_u] * (long)var6 >> 6);
                    var4_int = var4_int << 8;
                    if (var4_int > var5) {
                      break L1;
                    } else {
                      param1.field_y.b(true);
                      var5 = var4_int + var4_int + (-1 + -var5);
                      break L1;
                    }
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)((ie) this).field_y[param1.field_u] >> 6);
              break L1;
            }
            L3: {
              param1.field_y.h(var5);
              if (!param0) {
                break L3;
              } else {
                ((ie) this).field_V = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("ie.S(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        if (param1 != 8192) {
            return;
        }
        ((ie) this).field_K.d();
        ((ie) this).field_I = null;
        this.b(param1 ^ -8246, param0);
    }

    final synchronized boolean a(int param0, vm param1, int param2, mf param3, wp param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        se var8 = null;
        int var9 = 0;
        int var11 = 0;
        pq var12 = null;
        pq var13 = null;
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
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.b();
              var6_int = 1;
              var7 = null;
              if (param2 <= 0) {
                break L1;
              } else {
                var7 = (Object) (Object) new int[]{param2};
                break L1;
              }
            }
            L2: {
              if (param0 <= -110) {
                break L2;
              } else {
                this.f(115, 34, -56);
                break L2;
              }
            }
            var8 = (se) (Object) param1.field_i.b(-15519);
            L3: while (true) {
              if (var8 == null) {
                L4: {
                  if (var6_int != 0) {
                    param1.a();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_19_0 = var6_int;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L5: {
                  L6: {
                    var9 = (int)var8.field_g;
                    var12 = (pq) (Object) ((ie) this).field_w.a(-70, (long)var9);
                    if (var12 == null) {
                      var13 = mi.a(param3, var9, 8);
                      if (var13 != null) {
                        ((ie) this).field_w.a(34, (nm) (Object) var13, (long)var9);
                        if (!var13.a(var8.field_i, (byte) -73, param4, (int[]) var7)) {
                          break L6;
                        } else {
                          break L5;
                        }
                      } else {
                        var6_int = 0;
                        break L5;
                      }
                    } else {
                      if (!var12.a(var8.field_i, (byte) -73, param4, (int[]) var7)) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var6_int = 0;
                  break L5;
                }
                var8 = (se) (Object) param1.field_i.a(true);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("ie.L(").append(param0).append(',');
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
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final synchronized boolean d(int param0) {
        if (param0 != -1) {
            this.a(-73, true, 50, 118);
        }
        return ((ie) this).field_K.c();
    }

    private final void b(int param0, boolean param1) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (!param1) {
            this.d(-1, 0);
        } else {
            this.a((byte) -86, -1);
        }
        this.f(-1, 66);
        int var3 = 106 / ((-2 - param0) / 36);
        for (var4 = 0; var4 < 16; var4++) {
            ((ie) this).field_J[var4] = ((ie) this).field_R[var4];
        }
        int var6 = 0;
        var3 = var6;
        while (16 > var6) {
            ((ie) this).field_p[var6] = ik.a(-128, ((ie) this).field_R[var6]);
            var6++;
        }
    }

    private final void d(int param0, int param1) {
        ka var3 = null;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        var3 = (ka) (Object) ((ie) this).field_C.field_v.d(-36);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (0 > param0) {
                  break L2;
                } else {
                  if (param0 != var3.field_u) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3.field_x < 0) {
                ((ie) this).field_A[var3.field_u][var3.field_B] = null;
                var3.field_x = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (ka) (Object) ((ie) this).field_C.field_v.a((byte) 116);
            continue L0;
          }
        }
    }

    private final int b(ka param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        jm var9 = null;
        jm var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (((ie) this).field_S[param0.field_u] != 0) {
              L1: {
                var9 = param0.field_G;
                var10 = var9;
                var4 = 4096 + ((ie) this).field_Q[param0.field_u] * ((ie) this).field_s[param0.field_u] >> 13;
                var4 = 16384 + var4 * var4 >> 15;
                var4 = 16384 + param0.field_m * var4 >> 15;
                var4 = ((ie) this).field_E * var4 - -128 >> 8;
                var4 = 128 + ((ie) this).field_S[param0.field_u] * var4 >> 8;
                if (var10.field_j > 0) {
                  var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_j * ((double)param0.field_w * 0.00001953125)) * (double)var4);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param1 == -5723) {
                L2: {
                  if (null != var10.field_g) {
                    L3: {
                      var5 = param0.field_s;
                      var6 = var10.field_g[param0.field_A + 1];
                      if (param0.field_A < -2 + var10.field_g.length) {
                        var7 = var9.field_g[param0.field_A] << 8 & 65280;
                        var8 = var10.field_g[param0.field_A - -2] << 8 & 65280;
                        var6 = var6 + (-var7 + var5) * (-var6 + var10.field_g[param0.field_A + 3]) / (-var7 + var8);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4 = 32 + var4 * var6 >> 6;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (param0.field_x <= 0) {
                    break L4;
                  } else {
                    if (var10.field_c != null) {
                      L5: {
                        var5 = param0.field_x;
                        var6 = var10.field_c[1 + param0.field_D];
                        if (param0.field_D >= var10.field_c.length + -2) {
                          break L5;
                        } else {
                          var7 = (255 & var9.field_c[param0.field_D]) << 8;
                          var8 = (255 & var10.field_c[2 + param0.field_D]) << 8;
                          var6 = var6 + (var5 + -var7) * (-var6 + var10.field_c[param0.field_D + 3]) / (var8 - var7);
                          break L5;
                        }
                      }
                      var4 = var4 * var6 - -32 >> 6;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_21_0 = var4;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                stackOut_7_0 = -126;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("ie.CA(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ')');
        }
        return stackIn_22_0;
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        var3 = param1 & 240;
        if (var3 == 128) {
          var4 = param1 & 15;
          var5 = (32620 & param1) >> 8;
          var6 = param1 >> 16 & 127;
          this.a(-67, var5, var4, var6);
          return;
        } else {
          if (var3 == 144) {
            var4 = 15 & param1;
            var5 = (32595 & param1) >> 8;
            var6 = 127 & param1 >> 16;
            if (var6 > 0) {
              this.a(var4, true, var5, var6);
              return;
            } else {
              this.a(-43, var5, var4, 64);
              return;
            }
          } else {
            if (160 != var3) {
              if (176 == var3) {
                L0: {
                  var4 = 15 & param1;
                  var5 = (32710 & param1) >> 8;
                  var6 = (param1 & 8377946) >> 16;
                  if (var5 != 0) {
                    break L0;
                  } else {
                    ((ie) this).field_p[var4] = ik.a(-2080769, ((ie) this).field_p[var4]) - -(var6 << 14);
                    break L0;
                  }
                }
                L1: {
                  if (var5 == 32) {
                    ((ie) this).field_p[var4] = ik.a(((ie) this).field_p[var4], -16257) - -(var6 << 7);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var5 != 1) {
                    break L2;
                  } else {
                    ((ie) this).field_m[var4] = (var6 << 7) + ik.a(-16257, ((ie) this).field_m[var4]);
                    break L2;
                  }
                }
                L3: {
                  if (33 == var5) {
                    ((ie) this).field_m[var4] = ik.a(-128, ((ie) this).field_m[var4]) + var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 == 5) {
                    ((ie) this).field_D[var4] = ik.a(((ie) this).field_D[var4], -16257) + (var6 << 7);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var5 != 37) {
                    break L5;
                  } else {
                    ((ie) this).field_D[var4] = var6 + ik.a(((ie) this).field_D[var4], -128);
                    break L5;
                  }
                }
                L6: {
                  if (7 != var5) {
                    break L6;
                  } else {
                    ((ie) this).field_s[var4] = (var6 << 7) + ik.a(-16257, ((ie) this).field_s[var4]);
                    break L6;
                  }
                }
                L7: {
                  if (39 != var5) {
                    break L7;
                  } else {
                    ((ie) this).field_s[var4] = var6 + ik.a(((ie) this).field_s[var4], -128);
                    break L7;
                  }
                }
                L8: {
                  if (var5 != 10) {
                    break L8;
                  } else {
                    ((ie) this).field_W[var4] = ik.a(((ie) this).field_W[var4], -16257) + (var6 << 7);
                    break L8;
                  }
                }
                L9: {
                  if (var5 != 42) {
                    break L9;
                  } else {
                    ((ie) this).field_W[var4] = ik.a(((ie) this).field_W[var4], -128) + var6;
                    break L9;
                  }
                }
                L10: {
                  if (var5 == 11) {
                    ((ie) this).field_Q[var4] = (var6 << 7) + ik.a(((ie) this).field_Q[var4], -16257);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var5 == 43) {
                    ((ie) this).field_Q[var4] = var6 + ik.a(-128, ((ie) this).field_Q[var4]);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (64 != var5) {
                    break L12;
                  } else {
                    if (var6 >= 64) {
                      ((ie) this).field_n[var4] = ud.d(((ie) this).field_n[var4], 1);
                      break L12;
                    } else {
                      ((ie) this).field_n[var4] = ik.a(((ie) this).field_n[var4], -2);
                      break L12;
                    }
                  }
                }
                L13: {
                  if (var5 != 65) {
                    break L13;
                  } else {
                    if (var6 >= 64) {
                      ((ie) this).field_n[var4] = ud.d(((ie) this).field_n[var4], 2);
                      break L13;
                    } else {
                      this.a(0, var4);
                      ((ie) this).field_n[var4] = ik.a(((ie) this).field_n[var4], -3);
                      break L13;
                    }
                  }
                }
                L14: {
                  if (99 != var5) {
                    break L14;
                  } else {
                    ((ie) this).field_P[var4] = (var6 << 7) + ik.a(127, ((ie) this).field_P[var4]);
                    break L14;
                  }
                }
                L15: {
                  if (var5 != 98) {
                    break L15;
                  } else {
                    ((ie) this).field_P[var4] = ik.a(16256, ((ie) this).field_P[var4]) - -var6;
                    break L15;
                  }
                }
                L16: {
                  if (101 == var5) {
                    ((ie) this).field_P[var4] = 16384 - -ik.a(127, ((ie) this).field_P[var4]) + (var6 << 7);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (var5 != 100) {
                    break L17;
                  } else {
                    ((ie) this).field_P[var4] = ik.a(16256, ((ie) this).field_P[var4]) + (16384 + var6);
                    break L17;
                  }
                }
                L18: {
                  if (var5 != 120) {
                    break L18;
                  } else {
                    this.a((byte) -86, var4);
                    break L18;
                  }
                }
                L19: {
                  if (121 == var5) {
                    this.f(var4, 98);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (var5 == 123) {
                    this.d(var4, 0);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (var5 != 6) {
                    break L21;
                  } else {
                    var7 = ((ie) this).field_P[var4];
                    if (var7 == 16384) {
                      ((ie) this).field_G[var4] = ik.a(-16257, ((ie) this).field_G[var4]) + (var6 << 7);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  if (var5 != 38) {
                    break L22;
                  } else {
                    var7 = ((ie) this).field_P[var4];
                    if (var7 != 16384) {
                      break L22;
                    } else {
                      ((ie) this).field_G[var4] = var6 + ik.a(((ie) this).field_G[var4], -128);
                      break L22;
                    }
                  }
                }
                L23: {
                  if (var5 != 16) {
                    break L23;
                  } else {
                    ((ie) this).field_y[var4] = ik.a(((ie) this).field_y[var4], -16257) - -(var6 << 7);
                    break L23;
                  }
                }
                L24: {
                  if (var5 == 48) {
                    ((ie) this).field_y[var4] = var6 + ik.a(-128, ((ie) this).field_y[var4]);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (var5 == 81) {
                    if (var6 >= 64) {
                      ((ie) this).field_n[var4] = ud.d(((ie) this).field_n[var4], 4);
                      break L25;
                    } else {
                      this.c(var4, 0);
                      ((ie) this).field_n[var4] = ik.a(((ie) this).field_n[var4], -5);
                      break L25;
                    }
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (var5 == 17) {
                    this.g((-16257 & ((ie) this).field_z[var4]) - -(var6 << 7), 1010, var4);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (var5 == 49) {
                    this.g(var6 + (((ie) this).field_z[var4] & -128), 1010, var4);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              } else {
                if (var3 != 192) {
                  if (var3 == 208) {
                    var4 = param1 & 15;
                    var5 = param1 >> 8 & 127;
                    this.c(-1427, var5, var4);
                    return;
                  } else {
                    if (var3 == 224) {
                      var4 = 15 & param1;
                      var5 = (param1 >> 9 & 16256) - -(127 & param1 >> 8);
                      this.f(var4, var5, 2);
                      return;
                    } else {
                      var3 = 255 & param1;
                      if (var3 != 255) {
                        return;
                      } else {
                        this.b(-39, true);
                        return;
                      }
                    }
                  }
                } else {
                  var4 = param1 & 15;
                  var5 = (param1 & 32532) >> 8;
                  this.a(-203445432, var5 + ((ie) this).field_p[var4], var4);
                  return;
                }
              }
            } else {
              var4 = param1 & 15;
              var5 = 127 & param1 >> 8;
              var6 = param1 >> 16 & 127;
              this.a(var5, var4, (byte) 23, var6);
              return;
            }
          }
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.d(param2, param1, -128);
        if (param0 != 0) {
            ((ie) this).field_s = null;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
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
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((ie) this).field_K.c()) {
                  var4_int = ((ie) this).field_K.field_d * ((ie) this).field_t / tj.field_q;
                  L3: while (true) {
                    var5 = ((ie) this).field_F + (long)var4_int * (long)param2;
                    if (-var5 + ((ie) this).field_B < 0L) {
                      var7 = (int)(((long)var4_int + (-((ie) this).field_F + ((ie) this).field_B) + -1L) / (long)var4_int);
                      ((ie) this).field_F = ((ie) this).field_F + (long)var4_int * (long)var7;
                      ((ie) this).field_C.b(param0, param1, var7);
                      param2 = param2 - var7;
                      this.e(-2);
                      param1 = param1 + var7;
                      if (((ie) this).field_K.c()) {
                        continue L3;
                      } else {
                        ((ie) this).field_C.b(param0, param1, param2);
                        break L1;
                      }
                    } else {
                      ((ie) this).field_F = var5;
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              ((ie) this).field_C.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ie.D(");
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
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(int param0, vm param1, int param2, boolean param3, int param4, boolean param5) {
        int var7_int = 0;
        int var8 = 0;
        if (!((ie) this).field_K.c()) {
            ((ie) this).a(param1, -61, param3);
            return;
        }
        try {
            ((ie) this).field_N = param3 ? true : false;
            ((ie) this).field_L = param5 ? true : false;
            ((ie) this).field_I = param1;
            var7_int = ((ie) this).field_K.b(((ie) this).field_F) * param0;
            var8 = param2 * ((ie) this).field_K.field_d;
            var7_int = var8 * ((param4 + var8 + var7_int) / var8);
            ((ie) this).field_M = (var7_int - -(param0 >> 1)) / param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ie.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void c(int param0) {
        field_u = null;
        field_q = null;
        field_v = null;
        field_o = null;
    }

    final synchronized void f(int param0) {
        this.a(true, param0 ^ -16582);
        if (param0 != -24774) {
            ((ie) this).field_y = null;
        }
    }

    private final int a(int param0, ka param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        jm var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
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
        int stackOut_8_0 = 0;
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
              var3_int = param1.field_p - -(param1.field_r * param1.field_o >> 12);
              var3_int = var3_int + (((ie) this).field_G[param1.field_u] * (-8192 + ((ie) this).field_V[param1.field_u]) >> 12);
              var4 = param1.field_G;
              if (0 >= var4.field_d) {
                break L1;
              } else {
                L2: {
                  if (-1 > var4.field_a) {
                    break L2;
                  } else {
                    if (-1 < ((ie) this).field_m[param1.field_u]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_a << 2;
                  var6 = var4.field_e << 1;
                  if (param1.field_v >= var6) {
                    break L3;
                  } else {
                    var5 = var5 * param1.field_v / var6;
                    break L3;
                  }
                }
                var5 = var5 + (((ie) this).field_m[param1.field_u] >> 7);
                var7 = Math.sin(0.01227184630308513 * (double)(param1.field_i & 511));
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L1;
              }
            }
            L4: {
              var5 = (int)((double)(param1.field_F.field_l * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)tj.field_q + 0.5);
              if (var5 >= 1) {
                stackOut_9_0 = var5;
                stackIn_10_0 = stackOut_9_0;
                break L4;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ie.V(").append(-11).append(',');
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
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final synchronized void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = BrickABrac.field_J ? 1 : 0;
          if (0 <= param1) {
            ((ie) this).field_S[param1] = param0;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (var4 >= 16) {
                break L0;
              } else {
                ((ie) this).field_S[var4] = param0;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param2 == 16) {
            break L2;
          } else {
            this.c(-83, 39, -63);
            break L2;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        ka var7 = null;
        int var8 = BrickABrac.field_J ? 1 : 0;
        ka var9 = ((ie) this).field_A[param2][param1];
        int var6 = -89 / ((param0 - 16) / 58);
        if (!(var9 != null)) {
            return;
        }
        ((ie) this).field_A[param2][param1] = null;
        if ((((ie) this).field_n[param2] & 2) == 0) {
            var9.field_x = 0;
        } else {
            var7 = (ka) (Object) ((ie) this).field_C.field_v.d(-26);
            while (var7 != null) {
                if (var9.field_u == var7.field_u) {
                    if (var7.field_x < 0) {
                        if (!(var7 == var9)) {
                            var9.field_x = 0;
                            break;
                        }
                    }
                }
                var7 = (ka) (Object) ((ie) this).field_C.field_v.a((byte) 116);
            }
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          if (!((ie) this).field_K.c()) {
            break L0;
          } else {
            var2 = ((ie) this).field_K.field_d * ((ie) this).field_t / tj.field_q;
            L1: while (true) {
              var3 = (long)var2 * (long)param0 + ((ie) this).field_F;
              if (-var3 + ((ie) this).field_B < 0L) {
                var5 = (int)((-1L + (-((ie) this).field_F + ((ie) this).field_B) + (long)var2) / (long)var2);
                ((ie) this).field_F = ((ie) this).field_F + (long)var5 * (long)var2;
                ((ie) this).field_C.a(var5);
                param0 = param0 - var5;
                this.e(-2);
                if (!((ie) this).field_K.c()) {
                  break L0;
                } else {
                  continue L1;
                }
              } else {
                ((ie) this).field_F = var3;
                break L0;
              }
            }
          }
        }
        ((ie) this).field_C.a(param0);
    }

    private final synchronized void a(boolean param0, boolean param1, boolean param2, vm param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        try {
            this.a(param0, 8192);
            ((ie) this).field_K.a(param3.field_j);
            ((ie) this).field_F = 0L;
            ((ie) this).field_N = param2 ? true : false;
            var5_int = ((ie) this).field_K.e();
            for (var6 = 0; var6 < var5_int; var6++) {
                ((ie) this).field_K.a(var6);
                ((ie) this).field_K.f(var6);
                ((ie) this).field_K.b(var6);
            }
            ((ie) this).field_x = ((ie) this).field_K.a();
            ((ie) this).field_O = ((ie) this).field_K.field_f[((ie) this).field_x];
            ((ie) this).field_B = ((ie) this).field_K.c(((ie) this).field_O);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ie.W(" + param0 + ',' + true + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, jp[] param1, jp[] param2, int param3, jp[] param4, int param5, int param6, dh param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        int var15_int = 0;
        int var16 = 0;
        try {
            var15_int = param7.field_P + param7.field_B;
            var16 = param7.field_B;
            ja.a(0, 2, var15_int, 240, param7, 320, var15_int, -111, 8, var16, param1, param7, 0, 480, 1, 2, var16, 8, 0, param2, param4);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ie.Q(" + 1 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + 240 + ',' + (param4 != null ? "{...}" : "null") + ',' + 8 + ',' + 2 + ',' + (param7 != null ? "{...}" : "null") + ',' + 0 + ',' + 2 + ',' + 100 + ',' + 8 + ',' + 0 + ',' + 320 + ',' + 0 + ')');
        }
    }

    public ie() {
        ((ie) this).field_n = new int[16];
        ((ie) this).field_S = new int[16];
        ((ie) this).field_m = new int[16];
        ((ie) this).field_V = new int[16];
        ((ie) this).field_G = new int[16];
        ((ie) this).field_W = new int[16];
        ((ie) this).field_p = new int[16];
        ((ie) this).field_y = new int[16];
        ((ie) this).field_A = new ka[16][128];
        ((ie) this).field_z = new int[16];
        ((ie) this).field_P = new int[16];
        ((ie) this).field_D = new int[16];
        ((ie) this).field_U = new int[16];
        ((ie) this).field_E = 256;
        ((ie) this).field_t = 1000000;
        ((ie) this).field_Q = new int[16];
        ((ie) this).field_r = new ka[16][128];
        ((ie) this).field_R = new int[16];
        ((ie) this).field_J = new int[16];
        ((ie) this).field_s = new int[16];
        ((ie) this).field_K = new hr();
        ((ie) this).field_C = new lk((ie) this);
        ((ie) this).field_w = new si(128);
        ((ie) this).e(256, -1, 16);
        this.b(-38, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Creating your account";
        field_v = new vl();
        field_u = "Tips";
        field_q = "Create your own free Jagex account";
    }
}
