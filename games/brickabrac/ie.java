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
        if (param0 != 2) {
            field_u = null;
        }
        int var3 = ((ie) this).field_W[param1.field_u];
        if (-8193 >= (var3 ^ -1)) {
            return 16384 - ((-param1.field_t + 128) * (-var3 + 16384) - -32 >> 835415046);
        }
        return 32 + param1.field_t * var3 >> 1146171782;
    }

    final boolean a(int param0, int[] param1, int param2, ka param3, int param4) {
        int var6 = 0;
        jm var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = BrickABrac.field_J ? 1 : 0;
          param3.field_z = tj.field_q / 100;
          if (0 > param3.field_x) {
            break L0;
          } else {
            L1: {
              if (null == param3.field_y) {
                break L1;
              } else {
                if (param3.field_y.l()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              param3.a(param0 ^ -23346);
              param3.b((byte) 111);
              if (param3.field_q <= 0) {
                break L2;
              } else {
                if (((ie) this).field_r[param3.field_u][param3.field_q] == param3) {
                  ((ie) this).field_r[param3.field_u][param3.field_q] = null;
                  break L2;
                } else {
                  return true;
                }
              }
            }
            return true;
          }
        }
        var6 = param3.field_o;
        if (param0 == 23300) {
          L3: {
            if (-1 <= (var6 ^ -1)) {
              break L3;
            } else {
              L4: {
                var6 = var6 - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((ie) this).field_D[param3.field_u]));
                if (0 > var6) {
                  var6 = 0;
                  break L4;
                } else {
                  break L4;
                }
              }
              param3.field_o = var6;
              break L3;
            }
          }
          L5: {
            param3.field_y.c(this.a(-11, param3));
            var7 = param3.field_G;
            param3.field_v = param3.field_v + 1;
            var8 = 0;
            param3.field_i = param3.field_i + var7.field_d;
            var9 = 0.000005086263020833333 * (double)((param3.field_B + -60 << 1004337160) - -(param3.field_o * param3.field_r >> 2083271628));
            if ((var7.field_j ^ -1) >= -1) {
              break L5;
            } else {
              L6: {
                if (-1 <= (var7.field_k ^ -1)) {
                  param3.field_w = param3.field_w + 128;
                  break L6;
                } else {
                  param3.field_w = param3.field_w + (int)(Math.pow(2.0, (double)var7.field_k * var9) * 128.0 + 0.5);
                  break L6;
                }
              }
              if ((param3.field_w * var7.field_j ^ -1) <= -819201) {
                var8 = 1;
                break L5;
              } else {
                break L5;
              }
            }
          }
          L7: {
            if (null != var7.field_g) {
              L8: {
                if (var7.field_h > 0) {
                  param3.field_s = param3.field_s + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_h) * 128.0);
                  break L8;
                } else {
                  param3.field_s = param3.field_s + 128;
                  break L8;
                }
              }
              L9: while (true) {
                L10: {
                  if (param3.field_A >= -2 + var7.field_g.length) {
                    break L10;
                  } else {
                    if (param3.field_s <= (255 & var7.field_g[param3.field_A + 2]) << 379651400) {
                      break L10;
                    } else {
                      param3.field_A = param3.field_A + 2;
                      continue L9;
                    }
                  }
                }
                if (-2 + var7.field_g.length != param3.field_A) {
                  break L7;
                } else {
                  if (var7.field_g[param3.field_A - -1] != 0) {
                    break L7;
                  } else {
                    var8 = 1;
                    break L7;
                  }
                }
              }
            } else {
              break L7;
            }
          }
          L11: {
            if ((param3.field_x ^ -1) > -1) {
              break L11;
            } else {
              if (var7.field_c == null) {
                break L11;
              } else {
                if (0 != (1 & ((ie) this).field_n[param3.field_u])) {
                  break L11;
                } else {
                  L12: {
                    if (-1 < (param3.field_q ^ -1)) {
                      break L12;
                    } else {
                      if (param3 != ((ie) this).field_r[param3.field_u][param3.field_q]) {
                        break L12;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    if (-1 <= (var7.field_b ^ -1)) {
                      param3.field_x = param3.field_x + 128;
                      break L13;
                    } else {
                      param3.field_x = param3.field_x + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_b) + 0.5);
                      break L13;
                    }
                  }
                  L14: while (true) {
                    L15: {
                      if ((var7.field_c.length + -2 ^ -1) >= (param3.field_D ^ -1)) {
                        break L15;
                      } else {
                        if ((param3.field_x ^ -1) >= (var7.field_c[2 + param3.field_D] << -203445432 & 65280 ^ -1)) {
                          break L15;
                        } else {
                          param3.field_D = param3.field_D + 2;
                          continue L14;
                        }
                      }
                    }
                    if ((param3.field_D ^ -1) == (-2 + var7.field_c.length ^ -1)) {
                      var8 = 1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
              }
            }
          }
          if (var8 != 0) {
            L16: {
              param3.field_y.g(param3.field_z);
              if (param1 != null) {
                param3.field_y.b(param1, param4, param2);
                break L16;
              } else {
                param3.field_y.a(param2);
                break L16;
              }
            }
            L17: {
              if (!param3.field_y.k()) {
                break L17;
              } else {
                ((ie) this).field_C.field_m.b((qd) (Object) param3.field_y);
                break L17;
              }
            }
            L18: {
              param3.a(-94);
              if ((param3.field_x ^ -1) <= -1) {
                param3.b((byte) 111);
                if (-1 <= (param3.field_q ^ -1)) {
                  break L18;
                } else {
                  if (param3 != ((ie) this).field_r[param3.field_u][param3.field_q]) {
                    break L18;
                  } else {
                    ((ie) this).field_r[param3.field_u][param3.field_q] = null;
                    break L18;
                  }
                }
              } else {
                break L18;
              }
            }
            return true;
          } else {
            param3.field_y.a(param3.field_z, this.b(param3, param0 + -29023), this.b(2, param3));
            return false;
          }
        } else {
          return false;
        }
    }

    private final void c(int param0, int param1) {
        ka var3 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (-1 != (4 & ((ie) this).field_n[param0] ^ -1)) {
            var3 = (ka) (Object) ((ie) this).field_C.field_v.d(-117);
            while (var3 != null) {
                if (var3.field_u == param0) {
                    var3.field_j = 0;
                }
                var3 = (ka) (Object) ((ie) this).field_C.field_v.a((byte) 116);
            }
        }
        if (param1 != 0) {
            ((ie) this).field_L = false;
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
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (param1 != -46) {
            return;
        }
        fa var4 = (fa) (Object) wp.field_f.d(-33);
        while (var4 != null) {
            hq.a(var4, param0, 49);
            var4 = (fa) (Object) wp.field_f.a((byte) 116);
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
        if (!((((ie) this).field_n[param1] & 2 ^ -1) == -1)) {
            var3 = (ka) (Object) ((ie) this).field_C.field_v.d(-70);
            while (var3 != null) {
                if ((param1 ^ -1) == (var3.field_u ^ -1)) {
                    if (((ie) this).field_A[param1][var3.field_B] == null) {
                        if (var3.field_x < 0) {
                            var3.field_x = 0;
                        }
                    }
                }
                var3 = (ka) (Object) ((ie) this).field_C.field_v.a((byte) 116);
            }
        }
        if (param0 != 0) {
            field_v = null;
        }
    }

    private final void d(int param0, int param1, int param2) {
        ((ie) this).field_R[param1] = param0;
        ((ie) this).field_p[param1] = ik.a(param2, param0);
        this.a(param2 ^ 203445448, param0, param1);
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
        if (param2 != 23) {
            ((ie) this).field_z = null;
        }
    }

    private final void g(int param0, int param1, int param2) {
        ((ie) this).field_z[param2] = param0;
        ((ie) this).field_U[param2] = (int)(Math.pow(2.0, 0.00054931640625 * (double)param0) * 2097152.0 + 0.5);
        if (param1 != 1010) {
            field_o = null;
        }
    }

    final synchronized int b() {
        return 0;
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_3_0;
        int stackOut_7_0;
        int stackOut_12_0;
        int stackOut_17_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!tg.field_b.startsWith("win")) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (param0.startsWith("http://")) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0.startsWith("https://")) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var3 ^ -1) <= (param0.length() ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var2.indexOf((int) param0.charAt(var3)) ^ -1) != 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    try {
                        var3++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!param1) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5 = null;
                        boolean discarded$4 = ie.a((String) null, true);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        Process discarded$5 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
                  if (-2 != (var6 ^ -1)) {
                    L6: {
                      if ((var6 & 128 ^ -1) == -1) {
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
                        this.e(param0 ^ 0);
                        return;
                      } else {
                        L7: {
                          if (!((ie) this).field_N) {
                            break L7;
                          } else {
                            if (-1 != (var3 ^ -1)) {
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
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        ka stackIn_19_2 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ka stackIn_20_2 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        ka stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        Object stackOut_18_0;
        int stackOut_18_1;
        ka stackOut_18_2;
        Object stackOut_20_0;
        int stackOut_20_1;
        ka stackOut_20_2;
        int stackOut_20_3;
        Object stackOut_19_0;
        int stackOut_19_1;
        ka stackOut_19_2;
        int stackOut_19_3;
        L0: {
          var9 = BrickABrac.field_J ? 1 : 0;
          this.a(115, param2, param0, 64);
          if ((((ie) this).field_n[param0] & 2 ^ -1) != -1) {
            var5 = (ka) (Object) ((ie) this).field_C.field_v.f(0);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_u != param0) {
                    break L2;
                  } else {
                    if (-1 < (var5.field_x ^ -1)) {
                      ((ie) this).field_A[param0][var5.field_B] = null;
                      ((ie) this).field_A[param0][param2] = var5;
                      var6_int = (var5.field_o * var5.field_r >> 1207777804) + var5.field_p;
                      var5.field_p = var5.field_p + (-var5.field_B + param2 << 107419080);
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
              var7.field_m = param3 * param3 * (var10.field_u * var10.field_p[param2]) + 1024 >> -157660597;
              var7.field_t = 255 & var10.field_r[param2];
              var7.field_p = -(32767 & var10.field_j[param2]) + (param2 << -419122840);
              var7.field_D = 0;
              var7.field_w = 0;
              if (param1) {
                break L3;
              } else {
                ((ie) this).field_A = null;
                break L3;
              }
            }
            L4: {
              var7.field_s = 0;
              var7.field_A = 0;
              var7.field_x = -1;
              if (-1 != (((ie) this).field_y[param0] ^ -1)) {
                L5: {
                  var7.field_y = kl.a(var6, this.a(-11, var7), 0, this.b(2, var7));
                  stackOut_18_0 = this;
                  stackOut_18_1 = 0;
                  stackOut_18_2 = (ka) var7;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  if (var11.field_j[param2] >= 0) {
                    stackOut_20_0 = this;
                    stackOut_20_1 = stackIn_20_1;
                    stackOut_20_2 = (ka) (Object) stackIn_20_2;
                    stackOut_20_3 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    stackIn_21_3 = stackOut_20_3;
                    break L5;
                  } else {
                    stackOut_19_0 = this;
                    stackOut_19_1 = stackIn_19_1;
                    stackOut_19_2 = (ka) (Object) stackIn_19_2;
                    stackOut_19_3 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_21_2 = stackOut_19_2;
                    stackIn_21_3 = stackOut_19_3;
                    break L5;
                  }
                }
                ((ie) this).a(stackIn_21_1 != 0, (ka) (Object) stackIn_21_2, stackIn_21_3 != 0);
                break L4;
              } else {
                var7.field_y = kl.a(var6, this.a(-11, var7), this.b(var7, -5723), this.b(2, var7));
                break L4;
              }
            }
            L6: {
              if ((var11.field_j[param2] ^ -1) <= -1) {
                break L6;
              } else {
                var7.field_y.f(-1);
                break L6;
              }
            }
            L7: {
              if (var7.field_q >= 0) {
                L8: {
                  var8 = ((ie) this).field_r[param0][var7.field_q];
                  if (var8 == null) {
                    break L8;
                  } else {
                    if (-1 >= (var8.field_x ^ -1)) {
                      break L8;
                    } else {
                      ((ie) this).field_A[param0][var8.field_B] = null;
                      var8.field_x = 0;
                      break L8;
                    }
                  }
                }
                ((ie) this).field_r[param0][var7.field_q] = var7;
                break L7;
              } else {
                break L7;
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
        int var4 = -17 / ((param1 - 74) / 51);
        this.a(true, true, param2, param0);
    }

    private final void f(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (-1 < (param0 ^ -1)) {
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
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 != -86) {
            return;
        }
        ka var3 = (ka) (Object) ((ie) this).field_C.field_v.d(-28);
        while (var3 != null) {
            if ((param1 ^ -1) <= -1) {
                // if_icmpeq L57
            } else {
                if (!(null == var3.field_y)) {
                    var3.field_y.g(tj.field_q / 100);
                    if (var3.field_y.k()) {
                        ((ie) this).field_C.field_m.b((qd) (Object) var3.field_y);
                    }
                    var3.a(-95);
                }
                if (!((var3.field_x ^ -1) <= -1)) {
                    ((ie) this).field_A[var3.field_u][var3.field_B] = null;
                }
                var3.b((byte) 111);
            }
            var3 = (ka) (Object) ((ie) this).field_C.field_v.a((byte) 116);
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
        if (null == param0.field_y) {
            if ((param0.field_x ^ -1) <= -1) {
                param0.b((byte) 111);
                if (-1 > (param0.field_q ^ -1)) {
                    if (param0 == ((ie) this).field_r[param0.field_u][param0.field_q]) {
                        ((ie) this).field_r[param0.field_u][param0.field_q] = null;
                        return true;
                    }
                }
            }
            return true;
        }
        int var3 = -48 / ((-62 - param1) / 50);
        return false;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 != -203445432) {
            Object var6 = null;
            boolean discarded$0 = ((ie) this).a(-40, (int[]) null, 15, (ka) null, -126);
        }
        if ((param1 ^ -1) != (((ie) this).field_J[param2] ^ -1)) {
            ((ie) this).field_J[param2] = param1;
            for (var4 = 0; -129 < (var4 ^ -1); var4++) {
                ((ie) this).field_r[param2][var4] = null;
            }
        }
    }

    final void a(boolean param0, ka param1, boolean param2) {
        int var6 = 0;
        int var5 = 0;
        int var4 = param1.field_F.field_m.length;
        if (param2) {
            // ifeq L118
            var6 = var4 - (-var4 + param1.field_F.field_n);
            var5 = (int)((long)((ie) this).field_y[param1.field_u] * (long)var6 >> -671695162);
            var4 = var4 << 8;
            if ((var4 ^ -1) >= (var5 ^ -1)) {
                param1.field_y.b(true);
                var5 = var4 + var4 + (-1 + -var5);
            }
        } else {
            var5 = (int)((long)var4 * (long)((ie) this).field_y[param1.field_u] >> 1375554374);
        }
        param1.field_y.h(var5);
        if (param0) {
            ((ie) this).field_V = null;
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
        int[] var7_array = null;
        int var9 = 0;
        pq var12 = null;
        pq var13 = null;
        int var11 = BrickABrac.field_J ? 1 : 0;
        param1.b();
        int var6 = 1;
        Object var7 = null;
        if ((param2 ^ -1) < -1) {
            var7_array = new int[]{param2};
        }
        if (param0 > -110) {
            this.f(115, 34, -56);
        }
        se var8 = (se) (Object) param1.field_i.b(-15519);
        while (var8 != null) {
            var9 = (int)var8.field_g;
            var12 = (pq) (Object) ((ie) this).field_w.a(-70, (long)var9);
            if (var12 != null) {
                // ifeq L192
            } else {
                var13 = mi.a(param3, var9, 8);
                if (var13 == null) {
                    var6 = 0;
                } else {
                    ((ie) this).field_w.a(34, (nm) (Object) var13, (long)var9);
                    if (!(var13.a(var8.field_i, (byte) -73, param4, var7_array))) {
                        var6 = 0;
                    }
                }
            }
            var8 = (se) (Object) param1.field_i.a(true);
        }
        if (!(var6 == 0)) {
            param1.a();
        }
        return var6 != 0;
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
        for (var4 = 0; -17 < (var4 ^ -1); var4++) {
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
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param1 != 0) {
            ((ie) this).field_P = null;
        }
        ka var3 = (ka) (Object) ((ie) this).field_C.field_v.d(-36);
        while (var3 != null) {
            if (0 <= param0) {
                // if_icmpne L102
            }
            if (!(var3.field_x >= 0)) {
                ((ie) this).field_A[var3.field_u][var3.field_B] = null;
                var3.field_x = 0;
            }
            var3 = (ka) (Object) ((ie) this).field_C.field_v.a((byte) 116);
        }
    }

    private final int b(ka param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if ((((ie) this).field_S[param0.field_u] ^ -1) == -1) {
            return 0;
        }
        jm var9 = param0.field_G;
        jm var10 = var9;
        int var4 = 4096 + ((ie) this).field_Q[param0.field_u] * ((ie) this).field_s[param0.field_u] >> 368373933;
        var4 = 16384 + var4 * var4 >> -372227473;
        var4 = 16384 + param0.field_m * var4 >> -166256753;
        var4 = ((ie) this).field_E * var4 - -128 >> 654335784;
        var4 = 128 + ((ie) this).field_S[param0.field_u] * var4 >> -568955704;
        if (!(-1 <= (var10.field_j ^ -1))) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_j * ((double)param0.field_w * 0.00001953125)) * (double)var4);
        }
        if (param1 != -5723) {
            return -126;
        }
        if (!(null == var10.field_g)) {
            var5 = param0.field_s;
            var6 = var10.field_g[param0.field_A + 1];
            if (!((param0.field_A ^ -1) <= (-2 + var10.field_g.length ^ -1))) {
                var7 = var9.field_g[param0.field_A] << 431414312 & 65280;
                var8 = var10.field_g[param0.field_A - -2] << 700963272 & 65280;
                var6 = var6 + (-var7 + var5) * (-var6 + var10.field_g[param0.field_A + 3]) / (-var7 + var8);
            }
            var4 = 32 + var4 * var6 >> -2082437338;
        }
        if (param0.field_x > 0) {
            if (!(var10.field_c == null)) {
                var5 = param0.field_x;
                var6 = var10.field_c[1 + param0.field_D];
                if ((param0.field_D ^ -1) > (var10.field_c.length + -2 ^ -1)) {
                    var7 = (255 & var9.field_c[param0.field_D]) << -30492920;
                    var8 = (255 & var10.field_c[2 + param0.field_D]) << -680275640;
                    var6 = var6 + (var5 + -var7) * (-var6 + var10.field_c[param0.field_D + 3]) / (var8 - var7);
                }
                var4 = var4 * var6 - -32 >> 1865309222;
            }
        }
        return var4;
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
        if (-129 == (var3 ^ -1)) {
          var4 = param1 & 15;
          var5 = (32620 & param1) >> -2082784408;
          var6 = param1 >> 1820735472 & 127;
          this.a(-67, var5, var4, var6);
          return;
        } else {
          if (-145 == (var3 ^ -1)) {
            var4 = 15 & param1;
            var5 = (32595 & param1) >> 1722209384;
            var6 = 127 & param1 >> -1098662480;
            if ((var6 ^ -1) < -1) {
              this.a(var4, true, var5, var6);
              return;
            } else {
              this.a(-43, var5, var4, 64);
              return;
            }
          } else {
            L0: {
              if (param0 <= -119) {
                break L0;
              } else {
                ((ie) this).field_t = -25;
                break L0;
              }
            }
            if (160 != var3) {
              if (176 == var3) {
                L1: {
                  var4 = 15 & param1;
                  var5 = (32710 & param1) >> 818741896;
                  var6 = (param1 & 8377946) >> -405654032;
                  if ((var5 ^ -1) != -1) {
                    break L1;
                  } else {
                    ((ie) this).field_p[var4] = ik.a(-2080769, ((ie) this).field_p[var4]) - -(var6 << 40226382);
                    break L1;
                  }
                }
                L2: {
                  if (var5 == 32) {
                    ((ie) this).field_p[var4] = ik.a(((ie) this).field_p[var4], -16257) - -(var6 << 1939147399);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var5 != 1) {
                    break L3;
                  } else {
                    ((ie) this).field_m[var4] = (var6 << -1123108985) + ik.a(-16257, ((ie) this).field_m[var4]);
                    break L3;
                  }
                }
                L4: {
                  if (33 == var5) {
                    ((ie) this).field_m[var4] = ik.a(-128, ((ie) this).field_m[var4]) + var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-6 == (var5 ^ -1)) {
                    ((ie) this).field_D[var4] = ik.a(((ie) this).field_D[var4], -16257) + (var6 << -626609881);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var5 != 37) {
                    break L6;
                  } else {
                    ((ie) this).field_D[var4] = var6 + ik.a(((ie) this).field_D[var4], -128);
                    break L6;
                  }
                }
                L7: {
                  if (7 != var5) {
                    break L7;
                  } else {
                    ((ie) this).field_s[var4] = (var6 << -1226197497) + ik.a(-16257, ((ie) this).field_s[var4]);
                    break L7;
                  }
                }
                L8: {
                  if (39 != var5) {
                    break L8;
                  } else {
                    ((ie) this).field_s[var4] = var6 + ik.a(((ie) this).field_s[var4], -128);
                    break L8;
                  }
                }
                L9: {
                  if (-11 != (var5 ^ -1)) {
                    break L9;
                  } else {
                    ((ie) this).field_W[var4] = ik.a(((ie) this).field_W[var4], -16257) + (var6 << 2121803911);
                    break L9;
                  }
                }
                L10: {
                  if (var5 != 42) {
                    break L10;
                  } else {
                    ((ie) this).field_W[var4] = ik.a(((ie) this).field_W[var4], -128) + var6;
                    break L10;
                  }
                }
                L11: {
                  if (var5 == 11) {
                    ((ie) this).field_Q[var4] = (var6 << 1830653767) + ik.a(((ie) this).field_Q[var4], -16257);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if ((var5 ^ -1) == -44) {
                    ((ie) this).field_Q[var4] = var6 + ik.a(-128, ((ie) this).field_Q[var4]);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (64 != var5) {
                    break L13;
                  } else {
                    if (var6 >= 64) {
                      ((ie) this).field_n[var4] = ud.d(((ie) this).field_n[var4], 1);
                      break L13;
                    } else {
                      ((ie) this).field_n[var4] = ik.a(((ie) this).field_n[var4], -2);
                      break L13;
                    }
                  }
                }
                L14: {
                  if ((var5 ^ -1) != -66) {
                    break L14;
                  } else {
                    if ((var6 ^ -1) <= -65) {
                      ((ie) this).field_n[var4] = ud.d(((ie) this).field_n[var4], 2);
                      break L14;
                    } else {
                      this.a(0, var4);
                      ((ie) this).field_n[var4] = ik.a(((ie) this).field_n[var4], -3);
                      break L14;
                    }
                  }
                }
                L15: {
                  if (99 != var5) {
                    break L15;
                  } else {
                    ((ie) this).field_P[var4] = (var6 << -1302658041) + ik.a(127, ((ie) this).field_P[var4]);
                    break L15;
                  }
                }
                L16: {
                  if (-99 != (var5 ^ -1)) {
                    break L16;
                  } else {
                    ((ie) this).field_P[var4] = ik.a(16256, ((ie) this).field_P[var4]) - -var6;
                    break L16;
                  }
                }
                L17: {
                  if (101 == var5) {
                    ((ie) this).field_P[var4] = 16384 - -ik.a(127, ((ie) this).field_P[var4]) + (var6 << 1030241447);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if ((var5 ^ -1) != -101) {
                    break L18;
                  } else {
                    ((ie) this).field_P[var4] = ik.a(16256, ((ie) this).field_P[var4]) + (16384 + var6);
                    break L18;
                  }
                }
                L19: {
                  if (-121 != (var5 ^ -1)) {
                    break L19;
                  } else {
                    this.a((byte) -86, var4);
                    break L19;
                  }
                }
                L20: {
                  if (121 == var5) {
                    this.f(var4, 98);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if ((var5 ^ -1) == -124) {
                    this.d(var4, 0);
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if ((var5 ^ -1) != -7) {
                    break L22;
                  } else {
                    var7 = ((ie) this).field_P[var4];
                    if (-16385 == (var7 ^ -1)) {
                      ((ie) this).field_G[var4] = ik.a(-16257, ((ie) this).field_G[var4]) + (var6 << -606970073);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
                L23: {
                  if (-39 != (var5 ^ -1)) {
                    break L23;
                  } else {
                    var7 = ((ie) this).field_P[var4];
                    if (-16385 != (var7 ^ -1)) {
                      break L23;
                    } else {
                      ((ie) this).field_G[var4] = var6 + ik.a(((ie) this).field_G[var4], -128);
                      break L23;
                    }
                  }
                }
                L24: {
                  if (-17 != (var5 ^ -1)) {
                    break L24;
                  } else {
                    ((ie) this).field_y[var4] = ik.a(((ie) this).field_y[var4], -16257) - -(var6 << -1554778201);
                    break L24;
                  }
                }
                L25: {
                  if (-49 == (var5 ^ -1)) {
                    ((ie) this).field_y[var4] = var6 + ik.a(-128, ((ie) this).field_y[var4]);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (var5 == 81) {
                    if (-65 >= (var6 ^ -1)) {
                      ((ie) this).field_n[var4] = ud.d(((ie) this).field_n[var4], 4);
                      break L26;
                    } else {
                      this.c(var4, 0);
                      ((ie) this).field_n[var4] = ik.a(((ie) this).field_n[var4], -5);
                      break L26;
                    }
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if ((var5 ^ -1) == -18) {
                    this.g((-16257 & ((ie) this).field_z[var4]) - -(var6 << 1582105831), 1010, var4);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (-50 == (var5 ^ -1)) {
                    this.g(var6 + (((ie) this).field_z[var4] & -128), 1010, var4);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                return;
              } else {
                if (var3 != 192) {
                  if (-209 == (var3 ^ -1)) {
                    var4 = param1 & 15;
                    var5 = param1 >> -1973964024 & 127;
                    this.c(-1427, var5, var4);
                    return;
                  } else {
                    if ((var3 ^ -1) == -225) {
                      var4 = 15 & param1;
                      var5 = (param1 >> -1673418999 & 16256) - -(127 & param1 >> -867599672);
                      this.f(var4, var5, 2);
                      return;
                    } else {
                      var3 = 255 & param1;
                      if ((var3 ^ -1) != -256) {
                        return;
                      } else {
                        this.b(-39, true);
                        return;
                      }
                    }
                  }
                } else {
                  var4 = param1 & 15;
                  var5 = (param1 & 32532) >> 362221096;
                  this.a(-203445432, var5 + ((ie) this).field_p[var4], var4);
                  return;
                }
              }
            } else {
              var4 = param1 & 15;
              var5 = 127 & param1 >> -470573016;
              var6 = param1 >> -1815715376 & 127;
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
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = BrickABrac.field_J ? 1 : 0;
            if (((ie) this).field_K.c()) {
              var4 = ((ie) this).field_K.field_d * ((ie) this).field_t / tj.field_q;
              L2: while (true) {
                var5 = ((ie) this).field_F + (long)var4 * (long)param2;
                if ((-var5 + ((ie) this).field_B ^ -1L) > -1L) {
                  var7 = (int)(((long)var4 + (-((ie) this).field_F + ((ie) this).field_B) + -1L) / (long)var4);
                  ((ie) this).field_F = ((ie) this).field_F + (long)var4 * (long)var7;
                  ((ie) this).field_C.b(param0, param1, var7);
                  param2 = param2 - var7;
                  this.e(-2);
                  param1 = param1 + var7;
                  if (((ie) this).field_K.c()) {
                    continue L2;
                  } else {
                    ((ie) this).field_C.b(param0, param1, param2);
                    break L0;
                  }
                } else {
                  ((ie) this).field_F = var5;
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          ((ie) this).field_C.b(param0, param1, param2);
          break L0;
        }
    }

    final synchronized void a(int param0, vm param1, int param2, boolean param3, int param4, boolean param5) {
        if (!((ie) this).field_K.c()) {
            ((ie) this).a(param1, -61, param3);
            return;
        }
        ((ie) this).field_N = param3 ? true : false;
        ((ie) this).field_L = param5 ? true : false;
        ((ie) this).field_I = param1;
        int var7 = ((ie) this).field_K.b(((ie) this).field_F) * param0;
        int var8 = param2 * ((ie) this).field_K.field_d;
        var7 = var8 * ((param4 + var8 + var7) / var8);
        ((ie) this).field_M = (var7 - -(param0 >> 721268865)) / param0;
    }

    public static void c(int param0) {
        if (param0 != -1) {
            Object var2 = null;
            boolean discarded$0 = ie.a((String) null, false);
        }
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
        int var3 = 0;
        jm var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_12_0 = 0;
        int stackOut_11_0;
        int stackOut_10_0;
        L0: {
          var3 = param1.field_p - -(param1.field_r * param1.field_o >> -1057379988);
          var3 = var3 + (((ie) this).field_G[param1.field_u] * (-8192 + ((ie) this).field_V[param1.field_u]) >> 318391660);
          var4 = param1.field_G;
          if (0 >= var4.field_d) {
            break L0;
          } else {
            L1: {
              if (-1 > (var4.field_a ^ -1)) {
                break L1;
              } else {
                if (-1 > (((ie) this).field_m[param1.field_u] ^ -1)) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              var5 = var4.field_a << -1644617566;
              var6 = var4.field_e << 422361697;
              if (param1.field_v >= var6) {
                break L2;
              } else {
                var5 = var5 * param1.field_v / var6;
                break L2;
              }
            }
            var5 = var5 + (((ie) this).field_m[param1.field_u] >> 894786855);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_i & 511));
            var3 = var3 + (int)(var7 * (double)var5);
            break L0;
          }
        }
        L3: {
          if (param0 == -11) {
            break L3;
          } else {
            ((ie) this).field_N = true;
            break L3;
          }
        }
        L4: {
          var5 = (int)((double)(param1.field_F.field_l * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3) / (double)tj.field_q + 0.5);
          if (-2 >= (var5 ^ -1)) {
            stackOut_11_0 = var5;
            stackIn_12_0 = stackOut_11_0;
            break L4;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L4;
          }
        }
        return stackIn_12_0;
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
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        this.a(param0, 8192);
        ((ie) this).field_K.a(param3.field_j);
        ((ie) this).field_F = 0L;
        ((ie) this).field_N = param2 ? true : false;
        int var5 = ((ie) this).field_K.e();
        for (var6 = 0; (var6 ^ -1) > (var5 ^ -1); var6++) {
            ((ie) this).field_K.a(var6);
            ((ie) this).field_K.f(var6);
            ((ie) this).field_K.b(var6);
        }
        if (!param1) {
            field_u = null;
        }
        ((ie) this).field_x = ((ie) this).field_K.a();
        ((ie) this).field_O = ((ie) this).field_K.field_f[((ie) this).field_x];
        ((ie) this).field_B = ((ie) this).field_K.c(((ie) this).field_O);
    }

    final static void a(int param0, jp[] param1, jp[] param2, int param3, jp[] param4, int param5, int param6, dh param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        if (param10 < 87) {
            field_q = null;
        }
        int var15 = param7.field_P + param7.field_B;
        int var16 = param7.field_B;
        ja.a(param12, param9, var15, param3, param7, param13, var15, -111, param5, var16, param1, param7, param8, 480, param0, param6, var16, param11, param14, param2, param4);
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
