/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends lk {
    private int[] field_E;
    private ek field_n;
    int[] field_O;
    private int field_H;
    int[] field_u;
    private int[] field_C;
    private int[] field_v;
    private int[] field_l;
    static String field_p;
    private int[] field_J;
    private int[] field_M;
    private int[] field_T;
    private int[] field_x;
    static boolean field_F;
    private na field_A;
    private cb[][] field_R;
    private int field_K;
    private int[] field_r;
    private cb[][] field_L;
    static int field_B;
    private int[] field_S;
    private int[] field_G;
    static int[] field_N;
    private int[] field_w;
    int[] field_q;
    static byte[][] field_o;
    private int[] field_t;
    private long field_P;
    private kj field_y;
    private int field_z;
    private boolean field_D;
    private int field_m;
    private long field_U;
    private boolean field_I;
    private int field_Q;
    private ih field_s;

    private final void a(int param0, byte param1, int param2) {
        this.field_G[param2] = param0;
        this.field_t[param2] = vg.a(param0, -128);
        if (param1 <= 30) {
            return;
        }
        this.a(param2, 2, param0);
    }

    private final void a(boolean param0, int param1, int param2) {
        this.field_M[param2] = param1;
        if (param0) {
            return;
        }
        this.field_O[param2] = (int)(Math.pow(2.0, 0.00054931640625 * (double)param1) * 2097152.0 + 0.5);
    }

    final boolean b(cb param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.field_J = (int[]) null;
                break L1;
              }
            }
            if (param0.field_C == null) {
              if ((param0.field_h ^ -1) <= -1) {
                L2: {
                  param0.b((byte) -128);
                  if (param0.field_u <= 0) {
                    break L2;
                  } else {
                    if (this.field_L[param0.field_z][param0.field_u] == param0) {
                      this.field_L[param0.field_z][param0.field_u] = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_11_0 = 1;
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
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("hl.KA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final synchronized void b(int param0, int param1) {
        this.field_K = param1;
        if (param0 != -180) {
            this.a(63, (ih) null, (byte) -51, (ja) null, (sh) null);
        }
    }

    public static void c(boolean param0) {
        field_p = null;
        field_o = (byte[][]) null;
        if (!param0) {
            hl.d(-92);
        }
        field_N = null;
    }

    final static boolean a(boolean param0, th param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                hl.f(53, 103);
                break L1;
              }
            }
            L2: {
              if ((param1.g(1, 26527) ^ -1) != -2) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("hl.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    private final void e(int param0, int param1) {
        cb var3;
        int var4;
        L0: {
          var4 = Lexicominos.field_L ? 1 : 0;
          if (param0 > 39) {
            break L0;
          } else {
            this.field_I = false;
            break L0;
          }
        }
        var3 = (cb) ((Object) this.field_y.field_n.a(true));
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var4 != 0) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (param1 < 0) {
                      break L4;
                    } else {
                      if (var3.field_z != param1) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (null != var3.field_C) {
                      L6: {
                        var3.field_C.h(b.field_r / 100);
                        if (var3.field_C.h()) {
                          this.field_y.field_m.a(var3.field_C);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var3.c(0);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (-1 < (var3.field_h ^ -1)) {
                      this.field_R[var3.field_z][var3.field_q] = null;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var3.b((byte) -116);
                  break L3;
                }
                var3 = (cb) ((Object) this.field_y.field_n.f(2));
                if (var4 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    final synchronized boolean a(int param0, ih param1, byte param2, ja param3, sh param4) {
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        cj var8 = null;
        int var9 = 0;
        wj var10 = null;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param1.b();
                        var6_int = 1;
                        if (param2 == 102) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var7 = null;
                        if (0 < param0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = new int[]{param0};
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = (cj) ((Object) param1.field_i.c((byte) -111));
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var8 == null) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = (int)var8.field_d;
                        var10 = (wj) ((Object) this.field_A.a((long)var9, (byte) 120));
                        if (var11 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var10 != null) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10 = ug.a(param4, var9, true);
                        if (var10 != null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6_int = 0;
                        if (var11 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_A.a(var10, (byte) -48, (long)var9);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var10.a(var8.field_h, param3, (byte) 116, (int[]) (var7))) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6_int = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = (cj) ((Object) param1.field_i.a((byte) -91));
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var6_int != 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        param1.a();
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = var6_int;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var6);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("hl.G(").append(param0).append(',');
                    stackIn_23_1 = stackIn_24_1;
                    if (param1 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param3 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_0 = stackIn_30_0;
                    stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
                    stackIn_29_1 = stackIn_30_1;
                    if (param4 == null) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw ld.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, cb param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param1.field_w.field_i.length;
              if (param0 == 92) {
                break L1;
              } else {
                this.field_v = (int[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param2) {
                  break L3;
                } else {
                  if (!param1.field_w.field_l) {
                    break L3;
                  } else {
                    L4: {
                      var6 = -param1.field_w.field_k + var4_int + var4_int;
                      var5 = (int)((long)var6 * (long)this.field_u[param1.field_z] >> 1425469254);
                      var4_int = var4_int << 8;
                      if ((var4_int ^ -1) >= (var5 ^ -1)) {
                        param1.field_C.c(true);
                        var5 = var4_int + (var4_int - (1 - -var5));
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (!Lexicominos.field_L) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)this.field_u[param1.field_z] >> -839552186);
              break L2;
            }
            param1.field_C.b(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("hl.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        this.field_n.g();
        this.field_s = null;
        this.a(param0, (byte) -87);
        if (param1 != 43) {
            this.a(-117);
        }
    }

    final synchronized void d(boolean param0) {
        if (param0) {
            field_B = -22;
        }
        this.a(true, 43);
    }

    private final void g(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = Lexicominos.field_L ? 1 : 0;
        var3 = 240 & param1;
        if (-129 == (var3 ^ -1)) {
          var4 = 15 & param1;
          var5 = param1 >> 1474627272 & 127;
          var6 = (8341718 & param1) >> -1751248496;
          this.a(var6, var5, var4, 0);
          return;
        } else {
          L0: {
            if ((var3 ^ -1) != -145) {
              if (var3 == 160) {
                var4 = 15 & param1;
                var5 = 127 & param1 >> 2038571976;
                var6 = 127 & param1 >> -1219503024;
                this.a((byte) -103, var6, var4, var5);
                return;
              } else {
                L1: {
                  if (param0 <= -21) {
                    break L1;
                  } else {
                    this.field_n = (ek) null;
                    break L1;
                  }
                }
                if ((var3 ^ -1) == -177) {
                  L2: {
                    var4 = 15 & param1;
                    var5 = param1 >> -1878661176 & 127;
                    var6 = (8388315 & param1) >> 1749186736;
                    if (0 == var5) {
                      this.field_t[var4] = (var6 << 91688110) + vg.a(this.field_t[var4], -2080769);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (32 != var5) {
                      break L3;
                    } else {
                      this.field_t[var4] = vg.a(-16257, this.field_t[var4]) - -(var6 << 737964263);
                      break L3;
                    }
                  }
                  L4: {
                    if ((var5 ^ -1) != -2) {
                      break L4;
                    } else {
                      this.field_x[var4] = vg.a(-16257, this.field_x[var4]) - -(var6 << 1375367);
                      break L4;
                    }
                  }
                  L5: {
                    if (-34 == (var5 ^ -1)) {
                      this.field_x[var4] = var6 + vg.a(-128, this.field_x[var4]);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (5 != var5) {
                      break L6;
                    } else {
                      this.field_S[var4] = vg.a(this.field_S[var4], -16257) + (var6 << 1325931399);
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 == 37) {
                      this.field_S[var4] = vg.a(this.field_S[var4], -128) - -var6;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (7 == var5) {
                      this.field_J[var4] = vg.a(-16257, this.field_J[var4]) - -(var6 << 1535161991);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (39 != var5) {
                      break L9;
                    } else {
                      this.field_J[var4] = vg.a(this.field_J[var4], -128) - -var6;
                      break L9;
                    }
                  }
                  L10: {
                    if ((var5 ^ -1) != -11) {
                      break L10;
                    } else {
                      this.field_C[var4] = vg.a(this.field_C[var4], -16257) + (var6 << -1606040409);
                      break L10;
                    }
                  }
                  L11: {
                    if (-43 == (var5 ^ -1)) {
                      this.field_C[var4] = var6 + vg.a(-128, this.field_C[var4]);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (11 != var5) {
                      break L12;
                    } else {
                      this.field_l[var4] = (var6 << 857588871) + vg.a(-16257, this.field_l[var4]);
                      break L12;
                    }
                  }
                  L13: {
                    if (43 == var5) {
                      this.field_l[var4] = vg.a(-128, this.field_l[var4]) + var6;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (64 != var5) {
                      break L14;
                    } else {
                      L15: {
                        if (-65 < (var6 ^ -1)) {
                          break L15;
                        } else {
                          this.field_q[var4] = tb.a(this.field_q[var4], 1);
                          if (var8 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_q[var4] = vg.a(this.field_q[var4], -2);
                      break L14;
                    }
                  }
                  L16: {
                    if (var5 == 65) {
                      L17: {
                        if (64 <= var6) {
                          break L17;
                        } else {
                          this.a(var4, 16384);
                          this.field_q[var4] = vg.a(this.field_q[var4], -3);
                          if (var8 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      this.field_q[var4] = tb.a(this.field_q[var4], 2);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L18: {
                    if ((var5 ^ -1) != -100) {
                      break L18;
                    } else {
                      this.field_v[var4] = (var6 << -1274034457) + vg.a(127, this.field_v[var4]);
                      break L18;
                    }
                  }
                  L19: {
                    if ((var5 ^ -1) != -99) {
                      break L19;
                    } else {
                      this.field_v[var4] = var6 + vg.a(16256, this.field_v[var4]);
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 == 101) {
                      this.field_v[var4] = (var6 << -1515964537) + vg.a(this.field_v[var4], 127) + 16384;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (var5 == 100) {
                      this.field_v[var4] = vg.a(16256, this.field_v[var4]) + 16384 - -var6;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (120 == var5) {
                      this.e(99, var4);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if ((var5 ^ -1) != -122) {
                      break L23;
                    } else {
                      this.h(var4, 16645);
                      break L23;
                    }
                  }
                  L24: {
                    if (123 == var5) {
                      this.d(112, var4);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (6 != var5) {
                      break L25;
                    } else {
                      var7 = this.field_v[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L25;
                      } else {
                        this.field_r[var4] = vg.a(this.field_r[var4], -16257) + (var6 << 1478163335);
                        break L25;
                      }
                    }
                  }
                  L26: {
                    if (-39 != (var5 ^ -1)) {
                      break L26;
                    } else {
                      var7 = this.field_v[var4];
                      if (16384 == var7) {
                        this.field_r[var4] = var6 + vg.a(this.field_r[var4], -128);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (16 != var5) {
                      break L27;
                    } else {
                      this.field_u[var4] = vg.a(-16257, this.field_u[var4]) + (var6 << 1328337447);
                      break L27;
                    }
                  }
                  L28: {
                    if (48 == var5) {
                      this.field_u[var4] = var6 + vg.a(this.field_u[var4], -128);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (var5 == 81) {
                      L30: {
                        if ((var6 ^ -1) > -65) {
                          break L30;
                        } else {
                          this.field_q[var4] = tb.a(this.field_q[var4], 4);
                          if (var8 == 0) {
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                      this.c(-785046068, var4);
                      this.field_q[var4] = vg.a(this.field_q[var4], -5);
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L31: {
                    if (var5 == 17) {
                      this.a(false, (var6 << -339395385) + (-16257 & this.field_M[var4]), var4);
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  if ((var5 ^ -1) != -50) {
                    break L0;
                  } else {
                    this.a(false, (this.field_M[var4] & -128) + var6, var4);
                    return;
                  }
                } else {
                  if (var3 == 192) {
                    var4 = 15 & param1;
                    var5 = 127 & param1 >> -1054065688;
                    this.a(var4, 2, var5 + this.field_t[var4]);
                    return;
                  } else {
                    if (var3 == 208) {
                      var4 = 15 & param1;
                      var5 = 127 & param1 >> 702448904;
                      this.c(120, var4, var5);
                      return;
                    } else {
                      if (-225 == (var3 ^ -1)) {
                        var4 = 15 & param1;
                        var5 = (param1 >> 866224809 & 16256) + ((32570 & param1) >> -1359342872);
                        this.b(var5, -16257, var4);
                        return;
                      } else {
                        var3 = param1 & 255;
                        if ((var3 ^ -1) != -256) {
                          return;
                        } else {
                          this.a(true, (byte) -87);
                          return;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              L32: {
                var4 = param1 & 15;
                var5 = (32699 & param1) >> 32032232;
                var6 = (param1 & 8384220) >> 1691962288;
                if (-1 > (var6 ^ -1)) {
                  break L32;
                } else {
                  this.a(64, var5, var4, 0);
                  if (var8 == 0) {
                    break L0;
                  } else {
                    break L32;
                  }
                }
              }
              this.a(var4, var6, (byte) -111, var5);
              return;
            }
          }
          return;
        }
    }

    final synchronized lk b() {
        return null;
    }

    final synchronized boolean a(byte param0) {
        if (param0 != -32) {
            return false;
        }
        return this.field_n.d();
    }

    private final void c(int param0, int param1, int param2) {
        if (param0 != 120) {
            this.field_y = (kj) null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        cb var6 = null;
        int var7 = 0;
        cb var8 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Lexicominos.field_L ? 1 : 0;
                    if (param3 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_q = (int[]) null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var8 = this.field_R[param2][param1];
                    if (var8 != null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    this.field_R[param2][param1] = null;
                    if ((2 & this.field_q[param2] ^ -1) != -1) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var8.field_h = 0;
                    if (var7 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var6 = (cb) ((Object) this.field_y.field_n.a(true));
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var6 == null) {
                        statePc = 17;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var7 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if ((var8.field_z ^ -1) != (var6.field_z ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (0 <= var6.field_h) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var6 != var8) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var8.field_h = 0;
                    if (var7 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var6 = (cb) ((Object) this.field_y.field_n.f(param3 ^ 2));
                    if (var7 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(cb param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = this.field_C[param0.field_z];
            var4 = -57 / ((param1 - 21) / 32);
            if ((var3_int ^ -1) <= -8193) {
              stackIn_4_0 = -(32 + (-param0.field_k + 128) * (-var3_int + 16384) >> -1453334842) + 16384;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 32 + param0.field_k * var3_int >> 1760926662;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("hl.V(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void f(int param0, int param1) {
        int var3 = 0;
        wa var4 = null;
        mc var5 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (wa) ((Object) ki.field_b.a(true));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        na.a((byte) -126, var4, param0);
                        var4 = (wa) ((Object) ki.field_b.f(2));
                        if (var3 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1 == -2212) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var5 = (mc) ((Object) vh.field_a.a(true));
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 == null) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        fj.a(param0, var5, false);
                        var5 = (mc) ((Object) vh.field_a.f(param1 ^ -2210));
                        if (var3 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var3 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) var2), "hl.K(" + param0 + ',' + param1 + ')');
                }
                case 15: {
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Lexicominos.field_L ? 1 : 0;
                    if (-1 >= (param0 ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((var4 ^ -1) <= -17) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_w[var4] = param1;
                    var4++;
                    if (var5 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var5 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_w[param0] = param1;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (!param2) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_u = (int[]) null;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final synchronized void a(ih param0, boolean param1, boolean param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.a(param2, 43);
                        this.field_n.a(param0.field_h);
                        if (param3 == -5953) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_t = (int[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_5_0 = this;
                        stackIn_4_0 = stackIn_5_0;
                        if (!param1) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_6_0 = this;
                        stackIn_6_1 = 1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = this;
                        stackIn_6_1 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((hl) (this)).field_D = stackIn_6_1 != 0;
                        this.field_P = 0L;
                        var5_int = this.field_n.e();
                        var6 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var5_int ^ -1) >= (var6 ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_n.c(var6);
                        this.field_n.a(var6);
                        this.field_n.b(var6);
                        var6++;
                        if (var7 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var7 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_z = this.field_n.a();
                        this.field_m = this.field_n.field_a[this.field_z];
                        this.field_U = this.field_n.d(this.field_m);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (runtimeException);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("hl.P(");
                    stackIn_14_1 = stackIn_15_1;
                    if (param0 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized int a() {
        return 0;
    }

    final static void d(int param0) {
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4_long = 0L;
        sj var4 = null;
        int var5 = 0;
        nc var6_ref_nc = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        th var27 = null;
        th var28 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var26 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var27 = ig.field_a;
                        var28 = var27;
                        var2 = var28.d(true);
                        if (-1 == (var2 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-2 == (var2 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        uj.a("HS1: " + qj.h(param0 + -117), (Throwable) null, 1);
                        ck.b((byte) -70);
                        if (var26 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = var28.b(-1698573656);
                        var4_long = var28.f((byte) -102);
                        var6_ref_nc = (nc) ((Object) ok.field_b.a(true));
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var6_ref_nc == null) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_14_0 = var3 ^ -1;
                        stackIn_10_0 = stackIn_14_0;
                        if (var26 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == (var6_ref_nc.field_j ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6_ref_nc = (nc) ((Object) ok.field_b.f(param0 + 2));
                        if (var26 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var6_ref_nc != null) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = -95;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ck.b((byte) stackIn_14_0);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        var6_ref_nc.field_h = var4_long;
                        var6_ref_nc.b((byte) -118);
                        if (var26 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3 = var28.b(param0 + -1698573656);
                        var4 = (sj) ((Object) il.field_b.a(true));
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var4 == null) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_27_0 = var3 ^ -1;
                        stackIn_20_0 = stackIn_27_0;
                        if (var26 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 != (var4.field_h ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var26 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var4 = (sj) ((Object) il.field_b.f(param0 + 2));
                        if (var26 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var4 == null) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = -32;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ck.b((byte) stackIn_27_0);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return;
                }
                case 29: {
                    try {
                        var5 = var28.d(true);
                        if ((var5 ^ -1) == -1) {
                            statePc = 64;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var6 = var4.field_o;
                        var7 = var4.field_m;
                        f.field_l[0].field_b = false;
                        f.field_l[0].field_f = null;
                        f.field_l[0].field_d = og.field_c;
                        var8_int = 1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var5 <= var8_int) {
                            statePc = 38;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        f.field_l[var8_int].field_d = var27.c(false);
                        f.field_l[var8_int].field_b = false;
                        if (var26 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (-2 != (var28.d(true) ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        f.field_l[var8_int].field_f = var28.c(false);
                        if (var26 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        f.field_l[var8_int].field_f = null;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var8_int++;
                        if (var26 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        dupTemp$0 = new String[3][var6];
                        var4.field_j = dupTemp$0;
                        var8 = dupTemp$0;
                        var9 = new String[3][var6];
                        dupTemp$1 = new long[3][var6];
                        var4.field_i = dupTemp$1;
                        var10 = dupTemp$1;
                        dupTemp$2 = new int[3][var7 * var6];
                        var4.field_n = dupTemp$2;
                        var11 = dupTemp$2;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var28.d(true);
                        if (-1 <= (var18 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var19 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var19 >= var18) {
                            statePc = 64;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var20 = var27.d(true);
                        var21 = f.field_l[var20].field_d;
                        var22 = var28.f((byte) -86);
                        var24 = var28.field_h;
                        if (var26 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var19 >= var6) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var8[0][var12] = var21;
                        var9[0][var12] = f.field_l[var20].field_f;
                        var10[0][var12] = var22;
                        var12++;
                        var25 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((var7 ^ -1) >= (var25 ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        incrementValue$3 = var15;
                        var15++;
                        var11[0][incrementValue$3] = var27.d((byte) 19);
                        var25++;
                        if (var26 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var26 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var21 == null) {
                            statePc = 55;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (!md.a(var21, -105)) {
                            statePc = 55;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var8[1][var13] = og.field_c;
                        var9[1][var13] = null;
                        var10[1][var13] = var22;
                        var13++;
                        var28.field_h = var24;
                        var25 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var25 >= var7) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        incrementValue$4 = var16;
                        var16++;
                        var11[1][incrementValue$4] = var27.d((byte) 19);
                        var25++;
                        if (var26 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var26 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var14 >= var6) {
                            statePc = 62;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (f.field_l[var20].field_b) {
                            statePc = 62;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        f.field_l[var20].field_b = true;
                        var8[2][var14] = var21;
                        var9[2][var14] = f.field_l[var20].field_f;
                        var10[2][var14] = var22;
                        var28.field_h = var24;
                        var14++;
                        var25 = 0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var25 >= var7) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        incrementValue$5 = var17;
                        var17++;
                        var11[2][incrementValue$5] = var27.d((byte) 19);
                        var25++;
                        if (var26 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var26 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var19++;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var26 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var4.field_k = true;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var4.b((byte) -117);
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) var1), "hl.O(" + param0 + ')');
                }
                case 68: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    if (param0) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.d(-33, -1);
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.e(71, -1);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    this.h(-1, 16645);
                    if (param1 == -87) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    var3 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var3 >= 16) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_E[var3] = this.field_G[var3];
                    var3++;
                    if (var4 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var4 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var3 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (16 <= var3) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_t[var3] = vg.a(this.field_G[var3], -128);
                    var3++;
                    if (var4 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var4 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void d(int param0, int param1) {
        cb var3;
        int var4;
        int var5;
        int stackIn_11_0 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        var3 = (cb) ((Object) this.field_y.field_n.a(true));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackIn_11_0 = param1;

                if (var5 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (stackIn_11_0 < 0) {
                        break L4;
                      } else {
                        if (var3.field_z == param1) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (0 > var3.field_h) {
                      this.field_R[var3.field_z][var3.field_q] = null;
                      var3.field_h = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3 = (cb) ((Object) this.field_y.field_n.f(2));
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_11_0 = -29 % ((param0 - 60) / 51);
            break L1;
          }
          var4 = stackIn_11_0;
          return;
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        if (param0 > -83) {
            this.field_S = (int[]) null;
        }
    }

    final boolean a(int[] param0, int param1, cb param2, int param3, int param4) {
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        rc var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param2.field_m = b.field_r / 100;
              if ((param2.field_h ^ -1) > -1) {
                break L1;
              } else {
                L2: {
                  if (param2.field_C == null) {
                    break L2;
                  } else {
                    if (!param2.field_C.f()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  param2.c(0);
                  param2.b((byte) -123);
                  if (-1 <= (param2.field_u ^ -1)) {
                    break L3;
                  } else {
                    if (this.field_L[param2.field_z][param2.field_u] != param2) {
                      break L3;
                    } else {
                      this.field_L[param2.field_z][param2.field_u] = null;
                      return true;
                    }
                  }
                }
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param2.field_v;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(0.5 + Math.pow(2.0, (double)this.field_S[param2.field_z] * 0.0004921259842519685) * 16.0);
                  if (0 <= var6_int) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param2.field_v = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            param2.field_C.g(this.a((byte) -120, param2));
            var7 = param2.field_r;
            param2.field_x = param2.field_x + 1;
            if (param4 >= 54) {
              L6: {
                param2.field_i = param2.field_i + var7.field_d;
                var8 = 0;
                var9 = (double)((param2.field_l * param2.field_v >> -1175855284) + (-60 + param2.field_q << -812459704)) * 0.000005086263020833333;
                if ((var7.field_e ^ -1) >= -1) {
                  break L6;
                } else {
                  L7: {
                    L8: {
                      if (0 >= var7.field_b) {
                        break L8;
                      } else {
                        param2.field_j = param2.field_j + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_b));
                        if (var11 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    param2.field_j = param2.field_j + 128;
                    break L7;
                  }
                  if (-819201 >= (var7.field_e * param2.field_j ^ -1)) {
                    var8 = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L9: {
                if (null == var7.field_c) {
                  break L9;
                } else {
                  L10: {
                    L11: {
                      if (0 >= var7.field_j) {
                        break L11;
                      } else {
                        param2.field_F = param2.field_F + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_j));
                        if (var11 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    param2.field_F = param2.field_F + 128;
                    break L10;
                  }
                  L12: while (true) {
                    L13: {
                      L14: {
                        if (var7.field_c.length - 2 <= param2.field_B) {
                          break L14;
                        } else {
                          stackIn_37_0 = param2.field_F;

                          stackIn_37_1 = var7.field_c[param2.field_B + 2] << -1082231256 & 65280;

                          if (var11 != 0) {
                            break L13;
                          } else {
                            if (stackIn_37_0 <= stackIn_37_1) {
                              break L14;
                            } else {
                              param2.field_B = param2.field_B + 2;
                              if (var11 == 0) {
                                continue L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                      }
                      stackIn_37_0 = param2.field_B ^ -1;
                      stackIn_37_1 = -2 + var7.field_c.length ^ -1;
                      break L13;
                    }
                    if (stackIn_37_0 != stackIn_37_1) {
                      break L9;
                    } else {
                      if (0 != var7.field_c[param2.field_B + 1]) {
                        break L9;
                      } else {
                        var8 = 1;
                        break L9;
                      }
                    }
                  }
                }
              }
              L15: {
                if (-1 < (param2.field_h ^ -1)) {
                  break L15;
                } else {
                  if (var7.field_g == null) {
                    break L15;
                  } else {
                    if (-1 != (1 & this.field_q[param2.field_z] ^ -1)) {
                      break L15;
                    } else {
                      L16: {
                        if (param2.field_u < 0) {
                          break L16;
                        } else {
                          if (param2 == this.field_L[param2.field_z][param2.field_u]) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        L18: {
                          if ((var7.field_l ^ -1) >= -1) {
                            break L18;
                          } else {
                            param2.field_h = param2.field_h + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
                            if (var11 == 0) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        param2.field_h = param2.field_h + 128;
                        break L17;
                      }
                      L19: while (true) {
                        L20: {
                          L21: {
                            if ((var7.field_g.length + -2 ^ -1) >= (param2.field_y ^ -1)) {
                              break L21;
                            } else {
                              stackIn_56_0 = (var7.field_g[param2.field_y + 2] & 255) << -1357795512;

                              stackIn_56_1 = param2.field_h;

                              if (var11 != 0) {
                                break L20;
                              } else {
                                if (stackIn_56_0 >= stackIn_56_1) {
                                  break L21;
                                } else {
                                  param2.field_y = param2.field_y + 2;
                                  if (var11 == 0) {
                                    continue L19;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                          }
                          stackIn_56_0 = var7.field_g.length - 2;
                          stackIn_56_1 = param2.field_y;
                          break L20;
                        }
                        if (stackIn_56_0 == stackIn_56_1) {
                          var8 = 1;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                }
              }
              if (var8 == 0) {
                param2.field_C.a(param2.field_m, this.c(param2, 1554), this.a(param2, 87));
                stackIn_74_0 = 0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                L22: {
                  L23: {
                    param2.field_C.h(param2.field_m);
                    if (param0 == null) {
                      break L23;
                    } else {
                      param2.field_C.b(param0, param1, param3);
                      if (var11 == 0) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  param2.field_C.a(param3);
                  break L22;
                }
                L24: {
                  if (param2.field_C.h()) {
                    this.field_y.field_m.a(param2.field_C);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  param2.c(0);
                  if (-1 < (param2.field_h ^ -1)) {
                    break L25;
                  } else {
                    param2.b((byte) -118);
                    if (param2.field_u <= 0) {
                      break L25;
                    } else {
                      if (this.field_L[param2.field_z][param2.field_u] != param2) {
                        break L25;
                      } else {
                        this.field_L[param2.field_z][param2.field_u] = null;
                        break L25;
                      }
                    }
                  }
                }
                stackIn_72_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_17_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackIn_77_0 = (RuntimeException) (var6);

            stackIn_77_1 = new StringBuilder().append("hl.C(");

            if (param0 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L26;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L26;
            }
          }
          L27: {


            stackIn_80_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L27;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L27;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_78_0), stackIn_81_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_72_0 != 0;
            } else {
              return stackIn_74_0 != 0;
            }
          }
        }
    }

    private final int c(cb param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        rc var9 = null;
        rc var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-1 != (this.field_w[param0.field_z] ^ -1)) {
              L1: {
                var9 = param0.field_r;
                var10 = var9;
                var4 = 4096 + this.field_J[param0.field_z] * this.field_l[param0.field_z] >> 1082569645;
                var4 = var4 * var4 + 16384 >> 1369862127;
                var4 = var4 * param0.field_s - -16384 >> 62750607;
                var4 = this.field_H * var4 + 128 >> 1015971880;
                var4 = var4 * this.field_w[param0.field_z] + 128 >> 330576328;
                if (var10.field_e > 0) {
                  var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_e * (0.00001953125 * (double)param0.field_j)) * (double)var4);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 == 1554) {
                  break L2;
                } else {
                  this.a(-54, (ih) null, (byte) -125, (ja) null, (sh) null);
                  break L2;
                }
              }
              L3: {
                if (var10.field_c == null) {
                  break L3;
                } else {
                  L4: {
                    var5 = param0.field_F;
                    var6 = var10.field_c[1 + param0.field_B];
                    if (-2 + var10.field_c.length > param0.field_B) {
                      var7 = var9.field_c[param0.field_B] << -630288184 & 65280;
                      var8 = (var10.field_c[2 + param0.field_B] & 255) << 1468459880;
                      var6 = var6 + (-var7 + var5) * (-var6 + var10.field_c[3 + param0.field_B]) / (-var7 + var8);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var4 = 32 + var6 * var4 >> -1164080218;
                  break L3;
                }
              }
              L5: {
                if (-1 <= (param0.field_h ^ -1)) {
                  break L5;
                } else {
                  if (var10.field_g == null) {
                    break L5;
                  } else {
                    L6: {
                      var5 = param0.field_h;
                      var6 = var10.field_g[1 + param0.field_y];
                      if ((param0.field_y ^ -1) > (-2 + var10.field_g.length ^ -1)) {
                        var7 = var9.field_g[param0.field_y] << -1489113752 & 65280;
                        var8 = (255 & var10.field_g[2 + param0.field_y]) << -239171224;
                        var6 = var6 + (-var6 + var10.field_g[param0.field_y - -3]) * (var5 - var7) / (-var7 + var8);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = 32 + var4 * var6 >> 100541830;
                    break L5;
                  }
                }
              }
              stackIn_20_0 = var4;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("hl.AA(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_20_0;
        }
    }

    private final void c(int param0, int param1) {
        cb var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 == -785046068) {
          L0: {
            if (0 != (4 & this.field_q[param1])) {
              var3 = (cb) ((Object) this.field_y.field_n.a(true));
              L1: while (true) {
                if (var3 == null) {
                  break L0;
                } else {
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L2: {
                      if ((var3.field_z ^ -1) == (param1 ^ -1)) {
                        var3.field_E = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var3 = (cb) ((Object) this.field_y.field_n.f(2));
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1) {
        cb var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param1 == 16384) {
          L0: {
            if ((this.field_q[param0] & 2) != 0) {
              var3 = (cb) ((Object) this.field_y.field_n.a(true));
              L1: while (true) {
                if (var3 == null) {
                  break L0;
                } else {
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L2: {
                      if (var3.field_z != param0) {
                        break L2;
                      } else {
                        if (this.field_R[param0][var3.field_q] != null) {
                          break L2;
                        } else {
                          if (-1 < (var3.field_h ^ -1)) {
                            var3.field_h = 0;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    var3 = (cb) ((Object) this.field_y.field_n.f(param1 + -16382));
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final synchronized lk d() {
        return (lk) ((Object) this.field_y);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!this.field_n.d()) {
                    break L3;
                  } else {
                    var4_int = this.field_n.field_e * this.field_K / b.field_r;
                    L4: while (true) {
                      L5: {
                        var5 = this.field_P - -((long)param2 * (long)var4_int);
                        if ((this.field_U - var5 ^ -1L) > -1L) {
                          break L5;
                        } else {
                          this.field_P = var5;
                          if (var8 != 0) {
                            break L2;
                          } else {
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var7 = (int)((this.field_U + -this.field_P - (-(long)var4_int - -1L)) / (long)var4_int);
                      this.field_P = this.field_P + (long)var4_int * (long)var7;
                      this.field_y.b(param0, param1, var7);
                      param1 = param1 + var7;
                      this.b(-11);
                      param2 = param2 - var7;
                      if (!this.field_n.d()) {
                        break L3;
                      } else {
                        if (var8 == 0) {
                          continue L4;
                        } else {
                          this.field_y.b(param0, param1, param2);
                          break L1;
                        }
                      }
                    }
                  }
                }
                this.field_y.b(param0, param1, param2);
                break L2;
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("hl.I(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(int param0, boolean param1, ih param2) {
        try {
            this.a(param2, param1, true, -5953);
            if (param0 < 26) {
                this.a(-128, false, -53);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "hl.JA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        L0: {
          L1: {
            var6 = Lexicominos.field_L ? 1 : 0;
            if (this.field_n.d()) {
              var2 = this.field_n.field_e * this.field_K / b.field_r;
              L2: while (true) {
                L3: {
                  var3 = this.field_P + (long)param0 * (long)var2;
                  if ((this.field_U + -var3 ^ -1L) <= -1L) {
                    this.field_P = var3;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var5 = (int)((-1L + this.field_U - (this.field_P - (long)var2)) / (long)var2);
                  this.field_P = this.field_P + (long)var2 * (long)var5;
                  this.field_y.a(var5);
                  param0 = param0 - var5;
                  this.b(-11);
                  if (this.field_n.d()) {
                    break L4;
                  } else {
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var6 == 0) {
                  continue L2;
                } else {
                  this.field_y.a(param0);
                  break L0;
                }
              }
            } else {
              break L1;
            }
          }
          this.field_y.a(param0);
          break L0;
        }
    }

    private final void h(int param0, int param1) {
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 >= 0) {
          L0: {
            this.field_J[param0] = 12800;
            this.field_C[param0] = 8192;
            this.field_l[param0] = 16383;
            this.field_T[param0] = 8192;
            this.field_x[param0] = 0;
            this.field_S[param0] = 8192;
            this.a(param0, 16384);
            if (param1 == 16645) {
              break L0;
            } else {
              this.field_L = (cb[][]) null;
              break L0;
            }
          }
          this.c(param1 + -785062713, param0);
          this.field_q[param0] = 0;
          this.field_v[param0] = 32767;
          this.field_r[param0] = 256;
          this.field_u[param0] = 0;
          this.a(false, 8192, param0);
          return;
        } else {
          param0 = 0;
          L1: while (true) {
            if (16 <= param0) {
              return;
            } else {
              this.h(param0, param1 ^ 0);
              param0++;
              if (var4 == 0) {
                continue L1;
              } else {
                return;
              }
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        if (param1 != -16257) {
            return;
        }
        this.field_T[param2] = param0;
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        cb stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        cb stackIn_20_2 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        cb stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        cb stackOut_3_0;
        cb var5;
        int var6_int;
        ke var6;
        cb var7;
        cb var8;
        int var9;
        wj var10;
        wj var11;
        L0: {
          L1: {
            var9 = Lexicominos.field_L ? 1 : 0;
            this.a(64, param3, param0, 0);
            if (-1 == (this.field_q[param0] & 2 ^ -1)) {
              break L1;
            } else {
              var5 = (cb) ((Object) this.field_y.field_n.c(2));
              L2: while (true) {
                if (var5 == null) {
                  break L1;
                } else {
                  stackOut_3_0 = (cb) (var5);
                  stackIn_9_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var9 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (stackIn_4_0.field_z != param0) {
                        break L3;
                      } else {
                        if ((var5.field_h ^ -1) <= -1) {
                          break L3;
                        } else {
                          this.field_R[param0][var5.field_q] = null;
                          this.field_R[param0][param3] = var5;
                          var6_int = var5.field_o + (var5.field_l * var5.field_v >> 702668556);
                          var5.field_o = var5.field_o + (param3 - var5.field_q << -742728824);
                          var5.field_q = param3;
                          var5.field_v = 4096;
                          var5.field_l = var6_int + -var5.field_o;
                          return;
                        }
                      }
                    }
                    var5 = (cb) ((Object) this.field_y.field_n.d(0));
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackIn_9_0 = this.field_A.a((long)this.field_E[param0], (byte) 118);
          break L0;
        }
        var10 = (wj) ((Object) stackIn_9_0);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_l[param3];
          if (var6 == null) {
            return;
          } else {
            var7 = new cb();
            var7.field_w = var6;
            var7.field_z = param0;
            var7.field_p = var10;
            var7.field_r = var10.field_h[param3];
            var7.field_u = var10.field_r[param3];
            var7.field_q = param3;
            var7.field_s = 1024 + var10.field_n[param3] * var11.field_m * (param1 * param1) >> -1489629717;
            var7.field_k = var10.field_q[param3] & 255;
            var7.field_o = (param3 << 375772168) + -(32767 & var10.field_k[param3]);
            var7.field_j = 0;
            if (param2 < -78) {
              L4: {
                L5: {
                  var7.field_h = -1;
                  var7.field_y = 0;
                  var7.field_F = 0;
                  var7.field_B = 0;
                  if (0 == this.field_u[param0]) {
                    break L5;
                  } else {
                    L6: {
                      var7.field_C = cc.a(var6, this.a((byte) -121, var7), 0, this.a(var7, 74));
                      stackIn_20_0 = this;

                      stackIn_20_1 = 92;

                      stackIn_20_2 = (cb) (var7);

                      if (0 <= var10.field_k[param3]) {
                        stackIn_21_0 = this;
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = (cb) ((Object) stackIn_20_2);
                        stackIn_21_3 = 0;
                        break L6;
                      } else {
                        stackIn_21_0 = this;
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = (cb) ((Object) stackIn_20_2);
                        stackIn_21_3 = 1;
                        break L6;
                      }
                    }
                    this.a((byte) stackIn_21_1, stackIn_21_2, stackIn_21_3 != 0);
                    if (var9 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var7.field_C = cc.a(var6, this.a((byte) -112, var7), this.c(var7, 1554), this.a(var7, -67));
                break L4;
              }
              L7: {
                if (0 <= var10.field_k[param3]) {
                  break L7;
                } else {
                  var7.field_C.e(-1);
                  break L7;
                }
              }
              L8: {
                if ((var7.field_u ^ -1) > -1) {
                  break L8;
                } else {
                  L9: {
                    var8 = this.field_L[param0][var7.field_u];
                    if (var8 == null) {
                      break L9;
                    } else {
                      if (0 <= var8.field_h) {
                        break L9;
                      } else {
                        this.field_R[param0][var8.field_q] = null;
                        var8.field_h = 0;
                        break L9;
                      }
                    }
                  }
                  this.field_L[param0][var7.field_u] = var7;
                  break L8;
                }
              }
              this.field_y.field_n.b(115, var7);
              this.field_R[param0][param3] = var7;
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Lexicominos.field_L ? 1 : 0;
                    if (param1 == 2) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (param2 == this.field_E[param0]) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_E[param0] = param2;
                    var4 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (-129 >= (var4 ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_L[param0][var4] = null;
                    var4++;
                    if (var5 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var5 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void c(int param0) {
        int var3 = 0;
        wj var4 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Lexicominos.field_L ? 1 : 0;
                    if (param0 <= -73) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var4 = (wj) ((Object) this.field_A.c((byte) -95));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var4 == null) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var4.a(-122);
                    var4 = (wj) ((Object) this.field_A.a((byte) -91));
                    if (var3 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var3 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        int discarded$0 = 0;
        this.a(param0, (byte) 90, param2);
        if (!param1) {
            discarded$0 = this.c((cb) null, -91);
        }
    }

    private final int a(byte param0, cb param1) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        rc var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        try {
          L0: {
            L1: {
              var3_int = (param1.field_v * param1.field_l >> -785046068) + param1.field_o;
              var3_int = var3_int + (this.field_r[param1.field_z] * (-8192 + this.field_T[param1.field_z]) >> 1736778060);
              if (param0 < -105) {
                break L1;
              } else {
                this.d();
                break L1;
              }
            }
            L2: {
              var4 = param1.field_r;
              if ((var4.field_d ^ -1) >= -1) {
                break L2;
              } else {
                L3: {
                  if (0 < var4.field_k) {
                    break L3;
                  } else {
                    if (-1 <= (this.field_x[param1.field_z] ^ -1)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_k << 175776194;
                  var6 = var4.field_h << 1090801345;
                  if ((var6 ^ -1) >= (param1.field_x ^ -1)) {
                    break L4;
                  } else {
                    var5 = param1.field_x * var5 / var6;
                    break L4;
                  }
                }
                var5 = var5 + (this.field_x[param1.field_z] >> 1497020263);
                var7 = Math.sin((double)(511 & param1.field_i) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)((double)(param1.field_w.field_m * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)b.field_r + 0.5);
              if (var5 >= 1) {
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

            stackIn_15_1 = new StringBuilder().append("hl.Q(").append(param0).append(',');

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
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    private final void b(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Lexicominos.field_L ? 1 : 0;
                    var2 = this.field_z;
                    var3 = this.field_m;
                    var4 = this.field_U;
                    if (null == this.field_s) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_Q == var3) {
                        statePc = 3;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.a(this.field_s, this.field_D, this.field_I, param0 ^ 5962);
                    this.b(param0 ^ 0);
                    return;
                }
                case 4: {
                    stackIn_5_0 = var3 ^ -1;
                    stackIn_5_1 = this.field_m ^ -1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 != stackIn_5_1) {
                        statePc = 24;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_25_0 = var3;
                    stackIn_7_0 = stackIn_25_0;
                    stackIn_25_1 = this.field_n.field_a[var2];
                    stackIn_7_1 = stackIn_25_1;
                    if (var7 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 != stackIn_7_1) {
                        statePc = 23;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_n.c(var2);
                    var6 = this.field_n.f(var2);
                    stackIn_5_0 = -2;
                    stackIn_9_0 = stackIn_5_0;
                    stackIn_5_1 = var6 ^ -1;
                    stackIn_9_1 = stackIn_5_1;
                    if (var7 != 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 == stackIn_9_1) {
                        statePc = 11;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.field_n.f();
                    this.field_n.b(var2);
                    if (!this.field_n.c()) {
                        statePc = 23;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (this.field_s == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.a(111, this.field_D, this.field_s);
                    this.b(param0 + 0);
                    return;
                }
                case 14: {
                    if (!this.field_D) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (0 == var3) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_n.a(var4);
                    if (var7 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.a(true, (byte) -87);
                    this.field_n.g();
                    return;
                }
                case 19: {
                    if (0 != (128 & var6)) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.g(param0 + -112, var6);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    this.field_n.a(var2);
                    this.field_n.b(var2);
                    if (var7 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var2 = this.field_n.a();
                    var3 = this.field_n.field_a[var2];
                    var4 = this.field_n.d(var3);
                    if (var7 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.field_z = var2;
                    this.field_U = var4;
                    this.field_m = var3;
                    stackIn_25_0 = param0;
                    stackIn_25_1 = -11;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 == stackIn_25_1) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_m = -105;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (this.field_s == null) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var3 <= this.field_Q) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    this.field_z = -1;
                    this.field_m = this.field_Q;
                    this.field_U = this.field_n.d(this.field_m);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public hl() {
        this.field_E = new int[16];
        this.field_O = new int[16];
        this.field_H = 256;
        this.field_u = new int[16];
        this.field_C = new int[16];
        this.field_l = new int[16];
        this.field_M = new int[16];
        this.field_T = new int[16];
        this.field_L = new cb[16][128];
        this.field_S = new int[16];
        this.field_w = new int[16];
        this.field_G = new int[16];
        this.field_v = new int[16];
        this.field_q = new int[16];
        this.field_J = new int[16];
        this.field_r = new int[16];
        this.field_x = new int[16];
        this.field_t = new int[16];
        this.field_R = new cb[16][128];
        this.field_K = 1000000;
        this.field_n = new ek();
        this.field_y = new kj((hl) (this));
        this.field_A = new na(128);
        this.a(-1, 256, false);
        this.a(true, (byte) -87);
    }

    hl(hl param0) {
        this.field_E = new int[16];
        this.field_O = new int[16];
        this.field_H = 256;
        this.field_u = new int[16];
        this.field_C = new int[16];
        this.field_l = new int[16];
        this.field_M = new int[16];
        this.field_T = new int[16];
        this.field_L = new cb[16][128];
        this.field_S = new int[16];
        this.field_w = new int[16];
        this.field_G = new int[16];
        this.field_v = new int[16];
        this.field_q = new int[16];
        this.field_J = new int[16];
        this.field_r = new int[16];
        this.field_x = new int[16];
        this.field_t = new int[16];
        this.field_R = new cb[16][128];
        this.field_K = 1000000;
        this.field_n = new ek();
        this.field_y = new kj((hl) (this));
        try {
            this.field_A = param0.field_A;
            this.a(-1, 256, false);
            this.a(true, (byte) -87);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Try again";
    }
}
