/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends we {
    private int[] field_z;
    private int[] field_A;
    private int[] field_ab;
    private int[] field_Z;
    int[] field_u;
    private int field_W;
    private hj[][] field_x;
    static wk field_db;
    static me field_T;
    private uh field_bb;
    private int[] field_I;
    private hj[][] field_U;
    private int[] field_w;
    private int[] field_t;
    static String field_cb;
    private int field_Q;
    private ab field_M;
    static ul field_B;
    private int[] field_J;
    int[] field_F;
    private int[] field_N;
    private int[] field_O;
    private int[] field_K;
    private int[] field_Y;
    private int[] field_R;
    int[] field_L;
    static String field_E;
    static ul field_D;
    static int[] field_eb;
    private boolean field_S;
    private int field_V;
    private ej field_v;
    static int field_P;
    private long field_y;
    private int field_s;
    private long field_X;
    private tg field_H;
    private int field_G;
    private boolean field_C;

    private final void d(int param0, int param1) {
        hj var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_cb = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((4 & this.field_F[param0] ^ -1) == -1) {
                  break L3;
                } else {
                  var3 = (hj) ((Object) this.field_v.field_F.e(param1 + 13058));
                  L4: while (true) {
                    if (null == var3) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L5: {
                          if (param0 == var3.field_t) {
                            var3.field_v = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var3 = (hj) ((Object) this.field_v.field_F.a((byte) -116));
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3_ref), "ic.LA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized we d() {
        ej stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            stackIn_1_0 = this.field_v;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "ic.FA()");
        }
        return (we) ((Object) stackIn_1_0);
    }

    private final void c(int param0, int param1) {
        RuntimeException runtimeException = null;
        hj var3 = null;
        int var4 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var3 = (hj) ((Object) this.field_v.field_F.e(13058));
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackIn_18_0 = param1;

                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_18_0 < 0) {
                            break L5;
                          } else {
                            if ((var3.field_t ^ -1) == (param1 ^ -1)) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (var3.field_J < 0) {
                          this.field_U[var3.field_t][var3.field_z] = null;
                          var3.field_J = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var3 = (hj) ((Object) this.field_v.field_F.a((byte) -107));
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_18_0 = param0;
                break L2;
              }
              L6: {
                if (stackIn_18_0 == 0) {
                  break L6;
                } else {
                  this.c((byte) -81);
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "ic.PA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, long param1, String param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 == -23543) {
                break L1;
              } else {
                field_eb = (int[]) null;
                break L1;
              }
            }
            en.field_e = param2;
            ib.field_b = 2;
            bk.field_U = ui.a(1, (CharSequence) ((Object) param2));
            ti.field_p = param1;
            ba.b(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("ic.JA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final void g(int param0, int param1) {
        hj var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 1418611526) {
                break L1;
              } else {
                this.field_J = (int[]) null;
                break L1;
              }
            }
            var3 = (hj) ((Object) this.field_v.field_F.e(param1 + -1418598468));
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var3) {
                    break L4;
                  } else {
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (0 > param0) {
                            break L6;
                          } else {
                            if (param0 != var3.field_t) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (var3.field_A != null) {
                            L8: {
                              var3.field_A.g(tb.field_g / 100);
                              if (var3.field_A.l()) {
                                this.field_v.field_G.b(var3.field_A);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var3.d(4096);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L9: {
                          if (var3.field_J >= 0) {
                            break L9;
                          } else {
                            this.field_U[var3.field_t][var3.field_z] = null;
                            break L9;
                          }
                        }
                        var3.b(4);
                        break L5;
                      }
                      var3 = (hj) ((Object) this.field_v.field_F.a((byte) -94));
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3_ref), "ic.VA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        hj var5 = null;
        hj var6 = null;
        int var7 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = this.field_U[param0][param2];
                        if (null != var5) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        this.field_U[param0][param2] = null;
                        if (param1 <= -79) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        field_eb = (int[]) null;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((2 & this.field_F[param0]) == 0) {
                            statePc = 24;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = (hj) ((Object) this.field_v.field_F.e(13058));
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null == var6) {
                            statePc = 23;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var7 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5.field_t != var6.field_t) {
                            statePc = 22;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-1 >= (var6.field_J ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var6 != var5) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5.field_J = 0;
                        if (var7 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var6 = (hj) ((Object) this.field_v.field_F.a((byte) -61));
                        if (var7 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var7 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5.field_J = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    throw ci.a((Throwable) ((Object) var5_ref), "ic.UA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void b(int param0, byte param1, int param2) {
        try {
            int var4_int = 15 % ((-72 - param1) / 46);
            this.c(-2043373017, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ic.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -13) {
                break L1;
              } else {
                this.a(46, 71, (byte) 34);
                break L1;
              }
            }
            this.a(true, 27830696);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ic.IA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        try {
            this.field_Z[param0] = param1;
            this.field_u[param0] = (int)(Math.pow(2.0, (double)param1 * 0.00054931640625) * 2097152.0 + 0.5);
            if (param2 != -17) {
                this.a(-64, -124, -121);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ic.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(boolean param0, boolean param1, tg param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.a(param3, 27830696);
                        this.field_M.a(param2.field_p);
                        if (!param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(-78, false);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_y = 0L;
                        this.field_S = param1;
                        var5_int = this.field_M.b();
                        var6 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5_int <= var6) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_M.d(var6);
                        this.field_M.c(var6);
                        this.field_M.e(var6);
                        var6++;
                        if (var7 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_V = this.field_M.f();
                        this.field_s = this.field_M.field_a[this.field_V];
                        this.field_X = this.field_M.b(this.field_s);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (var5);
                    stackIn_13_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("ic.O(").append(param0).append(',').append(param1).append(',');
                    stackIn_13_1 = stackIn_15_1;
                    if (param2 == null) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_13_1);
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
                    throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, int param2, hj param3, int[] param4) {
        int stackIn_17_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_123_0 = 0;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
        StringBuilder stackIn_131_1 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_132_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        bj var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              param3.field_K = tb.field_g / 100;
              if ((param3.field_J ^ -1) > -1) {
                break L1;
              } else {
                L2: {
                  if (null == param3.field_A) {
                    break L2;
                  } else {
                    if (param3.field_A.g()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.d(param2 ^ 3043);
                  param3.b(param2 + -7135);
                  if (-1 <= (param3.field_p ^ -1)) {
                    break L3;
                  } else {
                    if (param3 != this.field_x[param3.field_t][param3.field_p]) {
                      break L3;
                    } else {
                      this.field_x[param3.field_t][param3.field_p] = null;
                      break L3;
                    }
                  }
                }
                stackIn_17_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param3.field_y;
              if (-1 > (var6_int ^ -1)) {
                L5: {
                  var6_int = var6_int - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)this.field_t[param3.field_t]) * 16.0 + 0.5);
                  if (var6_int < 0) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param3.field_y = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_A.f(this.a((byte) 68, param3));
              var7 = param3.field_E;
              var8 = 0;
              param3.field_C = param3.field_C + var7.field_q;
              param3.field_I = param3.field_I + 1;
              var9 = (double)((param3.field_z + -60 << 1756378632) + (param3.field_x * param3.field_y >> 1441519724)) * 0.000005086263020833333;
              if (-1 > (var7.field_i ^ -1)) {
                L7: {
                  L8: {
                    if ((var7.field_e ^ -1) < -1) {
                      break L8;
                    } else {
                      param3.field_M = param3.field_M + 128;
                      if (var11 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param3.field_M = param3.field_M + (int)(128.0 * Math.pow(2.0, (double)var7.field_e * var9) + 0.5);
                  break L7;
                }
                if (var7.field_i * param3.field_M < 819200) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L9: {
              if (null != var7.field_m) {
                L10: {
                  L11: {
                    if ((var7.field_k ^ -1) >= -1) {
                      break L11;
                    } else {
                      param3.field_D = param3.field_D + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_k) + 0.5);
                      if (var11 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param3.field_D = param3.field_D + 128;
                  break L10;
                }
                L12: while (true) {
                  L13: {
                    L14: {
                      if (param3.field_r >= var7.field_m.length - 2) {
                        break L14;
                      } else {
                        stackIn_55_0 = param3.field_D;

                        stackIn_55_1 = var7.field_m[2 + param3.field_r] << -18049976 & 65280;

                        if (var11 != 0) {
                          break L13;
                        } else {
                          if (stackIn_55_0 <= stackIn_55_1) {
                            break L14;
                          } else {
                            param3.field_r = param3.field_r + 2;
                            if (var11 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackIn_55_0 = param3.field_r;
                    stackIn_55_1 = -2 + var7.field_m.length;
                    break L13;
                  }
                  if (stackIn_55_0 != stackIn_55_1) {
                    break L9;
                  } else {
                    if ((var7.field_m[param3.field_r + 1] ^ -1) == -1) {
                      var8 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            L15: {
              if (-1 < (param3.field_J ^ -1)) {
                break L15;
              } else {
                if (null == var7.field_p) {
                  break L15;
                } else {
                  if ((this.field_F[param3.field_t] & 1) == 0) {
                    L16: {
                      if (0 > param3.field_p) {
                        break L16;
                      } else {
                        if (param3 == this.field_x[param3.field_t][param3.field_p]) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (0 < var7.field_g) {
                          break L18;
                        } else {
                          param3.field_J = param3.field_J + 128;
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      param3.field_J = param3.field_J + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_g));
                      break L17;
                    }
                    L19: while (true) {
                      L20: {
                        L21: {
                          if (-2 + var7.field_p.length <= param3.field_B) {
                            break L21;
                          } else {
                            stackIn_92_0 = param3.field_J ^ -1;

                            stackIn_92_1 = (var7.field_p[2 + param3.field_B] & 255) << 27830696 ^ -1;

                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (stackIn_92_0 >= stackIn_92_1) {
                                break L21;
                              } else {
                                param3.field_B = param3.field_B + 2;
                                if (var11 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        stackIn_92_0 = param3.field_B ^ -1;
                        stackIn_92_1 = var7.field_p.length - 2 ^ -1;
                        break L20;
                      }
                      if (stackIn_92_0 == stackIn_92_1) {
                        var8 = 1;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  } else {
                    break L15;
                  }
                }
              }
            }
            if (var8 != 0) {
              L22: {
                L23: {
                  param3.field_A.g(param3.field_K);
                  if (null == param4) {
                    break L23;
                  } else {
                    param3.field_A.a(param4, param1, param0);
                    if (var11 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                param3.field_A.d(param0);
                break L22;
              }
              L24: {
                if (!param3.field_A.l()) {
                  break L24;
                } else {
                  this.field_v.field_G.b(param3.field_A);
                  break L24;
                }
              }
              L25: {
                param3.d(4096);
                if ((param3.field_J ^ -1) > -1) {
                  break L25;
                } else {
                  param3.b(param2 ^ 7143);
                  if (-1 <= (param3.field_p ^ -1)) {
                    break L25;
                  } else {
                    if (this.field_x[param3.field_t][param3.field_p] == param3) {
                      this.field_x[param3.field_t][param3.field_p] = null;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              stackIn_118_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L26: {
                if (param2 == 7139) {
                  break L26;
                } else {
                  this.c(118, 56);
                  break L26;
                }
              }
              param3.field_A.a(param3.field_K, this.a(true, param3), this.a(param3, (byte) -3));
              stackIn_123_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var6 = decompiledCaughtException;
            stackIn_127_0 = (RuntimeException) (var6);

            stackIn_127_1 = new StringBuilder().append("ic.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_128_0 = (RuntimeException) ((Object) stackIn_127_0);
              stackIn_128_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackIn_128_2 = "null";
              break L27;
            } else {
              stackIn_128_0 = (RuntimeException) ((Object) stackIn_127_0);
              stackIn_128_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackIn_128_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_131_1 = ((StringBuilder) (Object) stackIn_128_1).append(stackIn_128_2).append(',');

            if (param4 == null) {
              stackIn_128_0 = (RuntimeException) ((Object) stackIn_128_0);
              stackIn_132_1 = (StringBuilder) ((Object) stackIn_131_1);
              stackIn_132_2 = "null";
              break L28;
            } else {
              stackIn_128_0 = (RuntimeException) ((Object) stackIn_128_0);
              stackIn_132_1 = (StringBuilder) ((Object) stackIn_131_1);
              stackIn_132_2 = "{...}";
              break L28;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_128_0), stackIn_132_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_118_0 != 0;
          } else {
            return stackIn_123_0 != 0;
          }
        }
    }

    private final void a(int param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1) {
                            statePc = 5;
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
                        this.c(0, -1);
                        if (var4 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.g(-1, param0 + 1418611527);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.e(param0, -7789);
                        var3_int = 0;
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
                        if (16 <= var3_int) {
                            statePc = 13;
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
                        this.field_J[var3_int] = this.field_z[var3_int];
                        var3_int++;
                        if (var4 != 0) {
                            statePc = 14;
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
                        if (var4 == 0) {
                            statePc = 8;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3_int = 0;
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
                        if (-17 >= (var3_int ^ -1)) {
                            statePc = 23;
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
                        this.field_A[var3_int] = ec.a(this.field_z[var3_int], -128);
                        var3_int++;
                        if (var4 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var4 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw ci.a((Throwable) ((Object) var3), "ic.RA(" + param0 + ',' + param1 + ')');
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized boolean d(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 90) {
                break L1;
              } else {
                this.a(30, -72, -114, -17);
                break L1;
              }
            }
            stackIn_4_0 = this.field_M.d();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ic.KA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final int a(hj param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = this.field_I[param0.field_t];
              if (param1 == -3) {
                break L1;
              } else {
                this.a(99, (byte) 1, -65, -50);
                break L1;
              }
            }
            if ((var3_int ^ -1) > -8193) {
              stackIn_7_0 = var3_int * param0.field_O + 32 >> 962955750;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = 16384 + -(32 + (128 - param0.field_O) * (-var3_int + 16384) >> 380813126);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ic.C(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var6 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = 80 % ((17 - param0) / 50);
                        if ((this.field_J[param2] ^ -1) != (param1 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_J[param2] = param1;
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (128 <= var5) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_x[param2][var5] = null;
                        var5++;
                        if (var6 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ci.a((Throwable) ((Object) runtimeException), "ic.NA(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void d(int param0) {
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        int var5 = 0;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_M.d()) {
                  var2_int = this.field_M.field_e * this.field_Q / tb.field_g;
                  L3: while (true) {
                    L4: {
                      var3 = this.field_y + (long)var2_int * (long)param0;
                      if (-1L < (this.field_X + -var3 ^ -1L)) {
                        break L4;
                      } else {
                        this.field_y = var3;
                        if (var6 != 0) {
                          break L1;
                        } else {
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var5 = (int)(((long)var2_int + (-this.field_y + (this.field_X - 1L))) / (long)var2_int);
                    this.field_y = this.field_y + (long)var5 * (long)var2_int;
                    this.field_v.d(var5);
                    param0 = param0 - var5;
                    this.e(1463);
                    if (!this.field_M.d()) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              this.field_v.d(param0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ic.Q(" + param0 + ')');
        }
    }

    final synchronized void a(byte param0) {
        RuntimeException runtimeException = null;
        ca var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = (ca) ((Object) this.field_bb.b(0));
                        if (param0 == 25) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (var2 == null) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2.a((byte) 127);
                        var2 = (ca) ((Object) this.field_bb.a((byte) 118));
                        if (var3 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ci.a((Throwable) ((Object) runtimeException), "ic.GA(" + param0 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, int param1, byte param2) {
        try {
            if (param2 <= 12) {
                field_D = (ul) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ic.TA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        try {
            this.field_O[param1] = param2;
            if (param0 != -27215) {
                this.b();
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ic.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0, hj param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        bj var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        try {
          L0: {
            L1: {
              var3_int = param1.field_o - -(param1.field_x * param1.field_y >> -1084588884);
              var3_int = var3_int + (this.field_w[param1.field_t] * (-8192 + this.field_O[param1.field_t]) >> 300348780);
              var4 = param1.field_E;
              if ((var4.field_q ^ -1) >= -1) {
                break L1;
              } else {
                L2: {
                  if (0 < var4.field_o) {
                    break L2;
                  } else {
                    if (0 < this.field_N[param1.field_t]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_o << 641855522;
                  var6 = var4.field_n << -537547359;
                  if ((param1.field_I ^ -1) <= (var6 ^ -1)) {
                    break L3;
                  } else {
                    var5 = param1.field_I * var5 / var6;
                    break L3;
                  }
                }
                var5 = var5 + (this.field_N[param1.field_t] >> -64780665);
                var7 = Math.sin(0.01227184630308513 * (double)(param1.field_C & 511));
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L1;
              }
            }
            L4: {
              var6 = 99 / ((-24 - param0) / 47);
              var5 = (int)(0.5 + (double)(256 * param1.field_q.field_p) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)tb.field_g);
              if ((var5 ^ -1) <= -2) {
                stackIn_16_0 = var5;
                break L4;
              } else {
                stackIn_16_0 = 1;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("ic.MA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        return stackIn_16_0;
    }

    final synchronized void a(int param0, int param1) {
        try {
            this.field_W = param0;
            if (param1 != 1000000) {
                this.b(123, 3, -93, -39);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ic.EA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void e(int param0, int param1) {
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            if (-1 >= (param0 ^ -1)) {
              L1: {
                this.field_K[param0] = 12800;
                this.field_I[param0] = 8192;
                this.field_ab[param0] = 16383;
                this.field_O[param0] = 8192;
                this.field_N[param0] = 0;
                if (param1 == -7789) {
                  break L1;
                } else {
                  this.field_J = (int[]) null;
                  break L1;
                }
              }
              this.field_t[param0] = 8192;
              this.f(-10931, param0);
              this.d(param0, 0);
              this.field_F[param0] = 0;
              this.field_R[param0] = 32767;
              this.field_w[param0] = 256;
              this.field_L[param0] = 0;
              this.a(param0, 8192, (byte) -17);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param0 = 0;
              L2: while (true) {
                L3: {
                  if ((param0 ^ -1) <= -17) {
                    break L3;
                  } else {
                    this.e(param0, -7789);
                    param0++;
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ic.DA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized we b() {
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            stackIn_1_0 = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "ic.SA()");
        }
        return (we) ((Object) stackIn_1_0);
    }

    final synchronized boolean a(int param0, tg param1, int param2, ub param3, cm param4) {
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        ce var8 = null;
        int var9 = 0;
        ca var10 = null;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param1.b();
                        var6_int = 1;
                        var7 = null;
                        if (0 < param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = new int[]{param0};
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param2 == 21687) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.e(-35);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = (ce) ((Object) param1.field_o.b(0));
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (null == var8) {
                            statePc = 23;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9 = (int)var8.field_j;
                        var10 = (ca) ((Object) this.field_bb.a((long)var9, param2 ^ 21706));
                        if (var11 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (null == var10) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var10 = vl.a(param4, var9, 40);
                        if (null != var10) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var6_int = 0;
                        if (var11 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_bb.a((long)var9, var10, -1816);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var10.a(var8.field_s, param2 + -34109, param3, (int[]) (var7))) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6_int = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8 = (ce) ((Object) param1.field_o.a((byte) 94));
                        if (var11 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var6_int == 0) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        param1.a();
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = var6_int;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0 != 0;
                }
                case 28: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_31_0 = (RuntimeException) (var6);
                    stackIn_29_0 = stackIn_31_0;
                    stackIn_31_1 = new StringBuilder().append("ic.WA(").append(param0).append(',');
                    stackIn_29_1 = stackIn_31_1;
                    if (param1 == null) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_0 = stackIn_35_0;
                    stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param2).append(',');
                    stackIn_33_1 = stackIn_35_1;
                    if (param3 == null) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_36_2 = "{...}";
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_36_2 = "null";
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_37_0 = stackIn_39_0;
                    stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
                    stackIn_37_1 = stackIn_39_1;
                    if (param4 == null) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_40_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_40_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_40_2 = "{...}";
                    statePc = 40;
                    continue stateLoop;
                }
                case 39: {
                    stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                    stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                    stackIn_40_2 = "null";
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    throw ci.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void a(boolean param0, boolean param1, tg param2) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (param0) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            this.a(stackIn_4_1 != 0, param1, param2, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ic.S(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            Throwable throwable = null;
            RuntimeException runtimeException = null;
            String var3 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                ja.field_h = param1;
                try {
                  L1: {
                    L2: {
                      var3 = param2.getParameter("cookieprefix");
                      if (param0 <= -123) {
                        break L2;
                      } else {
                        field_db = (wk) null;
                        break L2;
                      }
                    }
                    L3: {
                      var4 = param2.getParameter("cookiehost");
                      var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
                      if (param1.length() != 0) {
                        break L3;
                      } else {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L3;
                      }
                    }
                    hn.a(param2, 27781, "document.cookie=\"" + var5 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    throwable = decompiledCaughtException;
                    break L4;
                  }
                }
                oh.a(param2, (byte) 119);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_14_0 = (RuntimeException) (runtimeException);

                stackIn_14_1 = new StringBuilder().append("ic.QA(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L5;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param2 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L6;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L6;
                }
              }
              throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0, int param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = param1 & 240;
            if (var3_int != 128) {
              if ((var3_int ^ -1) != -145) {
                if (param0 == 21766) {
                  if (-161 == (var3_int ^ -1)) {
                    var4 = param1 & 15;
                    var5 = param1 >> 345062536 & 127;
                    var6 = param1 >> 344234512 & 127;
                    this.a(115, var5, var6, var4);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (var3_int != 176) {
                      if (var3_int != 192) {
                        if (208 != var3_int) {
                          if (224 != var3_int) {
                            var3_int = 255 & param1;
                            if (-256 == (var3_int ^ -1)) {
                              this.a(-1, true);
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              decompiledRegionSelector0 = 9;
                              break L0;
                            }
                          } else {
                            var4 = param1 & 15;
                            var5 = (16256 & param1 >> 1396920137) - -(127 & param1 >> -1602236824);
                            this.b(-27215, var4, var5);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          var4 = param1 & 15;
                          var5 = (32759 & param1) >> 1086859880;
                          this.b(var5, var4, (byte) 108);
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        var4 = 15 & param1;
                        var5 = param1 >> -45923352 & 127;
                        this.a(-36, var5 + this.field_A[var4], var4);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      L1: {
                        var4 = 15 & param1;
                        var5 = param1 >> -585075000 & 127;
                        var6 = param1 >> -704304048 & 127;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          this.field_A[var4] = ec.a(-2080769, this.field_A[var4]) + (var6 << -1338582354);
                          break L1;
                        }
                      }
                      L2: {
                        if ((var5 ^ -1) == -33) {
                          this.field_A[var4] = ec.a(this.field_A[var4], -16257) - -(var6 << -178065337);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        if (var5 != 1) {
                          break L3;
                        } else {
                          this.field_N[var4] = ec.a(-16257, this.field_N[var4]) + (var6 << -786496025);
                          break L3;
                        }
                      }
                      L4: {
                        if (33 != var5) {
                          break L4;
                        } else {
                          this.field_N[var4] = ec.a(-128, this.field_N[var4]) - -var6;
                          break L4;
                        }
                      }
                      L5: {
                        if (var5 == 5) {
                          this.field_t[var4] = ec.a(this.field_t[var4], -16257) + (var6 << -408601913);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (37 != var5) {
                          break L6;
                        } else {
                          this.field_t[var4] = var6 + ec.a(-128, this.field_t[var4]);
                          break L6;
                        }
                      }
                      L7: {
                        if (-8 != (var5 ^ -1)) {
                          break L7;
                        } else {
                          this.field_K[var4] = ec.a(-16257, this.field_K[var4]) + (var6 << 1123029319);
                          break L7;
                        }
                      }
                      L8: {
                        if (-40 == (var5 ^ -1)) {
                          this.field_K[var4] = ec.a(-128, this.field_K[var4]) + var6;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if ((var5 ^ -1) == -11) {
                          this.field_I[var4] = ec.a(this.field_I[var4], -16257) + (var6 << 216810247);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (-43 != (var5 ^ -1)) {
                          break L10;
                        } else {
                          this.field_I[var4] = var6 + ec.a(this.field_I[var4], -128);
                          break L10;
                        }
                      }
                      L11: {
                        if (var5 == 11) {
                          this.field_ab[var4] = (var6 << 747929511) + ec.a(this.field_ab[var4], -16257);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (-44 != (var5 ^ -1)) {
                          break L12;
                        } else {
                          this.field_ab[var4] = var6 + ec.a(this.field_ab[var4], -128);
                          break L12;
                        }
                      }
                      L13: {
                        if (var5 != 64) {
                          break L13;
                        } else {
                          L14: {
                            if (64 > var6) {
                              break L14;
                            } else {
                              this.field_F[var4] = vn.a(this.field_F[var4], 1);
                              if (var8 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          this.field_F[var4] = ec.a(this.field_F[var4], -2);
                          break L13;
                        }
                      }
                      L15: {
                        if (-66 != (var5 ^ -1)) {
                          break L15;
                        } else {
                          L16: {
                            if (64 > var6) {
                              break L16;
                            } else {
                              this.field_F[var4] = vn.a(this.field_F[var4], 2);
                              if (var8 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          this.f(param0 ^ -32693, var4);
                          this.field_F[var4] = ec.a(this.field_F[var4], -3);
                          break L15;
                        }
                      }
                      L17: {
                        if (-100 != (var5 ^ -1)) {
                          break L17;
                        } else {
                          this.field_R[var4] = ec.a(127, this.field_R[var4]) - -(var6 << -2043373017);
                          break L17;
                        }
                      }
                      L18: {
                        if (var5 == 98) {
                          this.field_R[var4] = var6 + ec.a(this.field_R[var4], 16256);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        if ((var5 ^ -1) != -102) {
                          break L19;
                        } else {
                          this.field_R[var4] = (var6 << 1072609863) + (ec.a(127, this.field_R[var4]) + 16384);
                          break L19;
                        }
                      }
                      L20: {
                        if (var5 == 100) {
                          this.field_R[var4] = var6 + (ec.a(16256, this.field_R[var4]) + 16384);
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      L21: {
                        if (120 == var5) {
                          this.g(var4, param0 ^ 1418600000);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if (121 == var5) {
                          this.e(var4, -7789);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      L23: {
                        if (123 == var5) {
                          this.c(0, var4);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        if (6 == var5) {
                          var7 = this.field_R[var4];
                          if (var7 == 16384) {
                            this.field_w[var4] = (var6 << 1299313959) + ec.a(this.field_w[var4], -16257);
                            break L24;
                          } else {
                            break L24;
                          }
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        if ((var5 ^ -1) == -39) {
                          var7 = this.field_R[var4];
                          if (var7 == 16384) {
                            this.field_w[var4] = ec.a(this.field_w[var4], -128) + var6;
                            break L25;
                          } else {
                            break L25;
                          }
                        } else {
                          break L25;
                        }
                      }
                      L26: {
                        if (var5 == 16) {
                          this.field_L[var4] = ec.a(-16257, this.field_L[var4]) + (var6 << -377534009);
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      L27: {
                        if (-49 == (var5 ^ -1)) {
                          this.field_L[var4] = ec.a(-128, this.field_L[var4]) + var6;
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      L28: {
                        if (var5 != 81) {
                          break L28;
                        } else {
                          L29: {
                            if (64 <= var6) {
                              break L29;
                            } else {
                              this.d(var4, param0 ^ 21766);
                              this.field_F[var4] = ec.a(this.field_F[var4], -5);
                              if (var8 == 0) {
                                break L28;
                              } else {
                                break L29;
                              }
                            }
                          }
                          this.field_F[var4] = vn.a(this.field_F[var4], 4);
                          break L28;
                        }
                      }
                      L30: {
                        if (-18 == (var5 ^ -1)) {
                          this.a(var4, (this.field_Z[var4] & -16257) + (var6 << 694963495), (byte) -17);
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      L31: {
                        if ((var5 ^ -1) != -50) {
                          break L31;
                        } else {
                          this.a(var4, (-128 & this.field_Z[var4]) - -var6, (byte) -17);
                          break L31;
                        }
                      }
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L32: {
                  L33: {
                    var4 = param1 & 15;
                    var5 = (param1 & 32570) >> -683917976;
                    var6 = (8381338 & param1) >> -920331664;
                    if (var6 > 0) {
                      break L33;
                    } else {
                      this.a(var4, (byte) -122, var5, 64);
                      if (var8 == 0) {
                        break L32;
                      } else {
                        break L33;
                      }
                    }
                  }
                  this.b(var5, param0 ^ 21865, var4, var6);
                  break L32;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              var4 = 15 & param1;
              var5 = 127 & param1 >> 770961256;
              var6 = (param1 & 8382781) >> -1273026896;
              this.a(var4, (byte) -125, var5, var6);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ic.AB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1, hj param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var5 = 58 % ((55 - param1) / 51);
                  var4_int = param2.field_q.field_r.length;
                  if (!param0) {
                    break L3;
                  } else {
                    if (param2.field_q.field_s) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var6 = (int)((long)var4_int * (long)this.field_L[param2.field_t] >> 1583905094);
                if (SteelSentinels.field_G == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var7 = var4_int - (-var4_int - -param2.field_q.field_q);
              var4_int = var4_int << 8;
              var6 = (int)((long)this.field_L[param2.field_t] * (long)var7 >> 737067334);
              if (var6 < var4_int) {
                break L1;
              } else {
                var6 = -var6 + -1 + (var4_int + var4_int);
                param2.field_A.a(true);
                break L1;
              }
            }
            param2.field_A.i(var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("ic.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static gh f(int param0) {
        RuntimeException var1 = null;
        gh stackIn_2_0 = null;
        gh stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 3443) {
              stackIn_4_0 = ac.k(param0 ^ -8138);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (gh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "ic.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void f(int param0, int param1) {
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        hj var3 = null;
        RuntimeException var3_ref = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -10931) {
                break L1;
              } else {
                this.field_H = (tg) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (0 != (this.field_F[param1] & 2)) {
                  var3 = (hj) ((Object) this.field_v.field_F.e(param0 + 23989));
                  L4: while (true) {
                    if (null == var3) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L5: {
                          if ((var3.field_t ^ -1) != (param1 ^ -1)) {
                            break L5;
                          } else {
                            if (this.field_U[param1][var3.field_z] == null) {
                              if ((var3.field_J ^ -1) > -1) {
                                var3.field_J = 0;
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                        var3 = (hj) ((Object) this.field_v.field_F.a((byte) -65));
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3_ref), "ic.HA(" + param0 + ',' + param1 + ')');
        }
    }

    final static ah a(int param0, int param1, boolean param2) {
        kg stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        kg stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        kg stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        gh stackIn_35_0 = null;
        gh stackIn_37_0 = null;
        gh stackIn_38_0 = null;
        String stackIn_38_1 = null;
        gh stackIn_39_0 = null;
        gh stackIn_41_0 = null;
        gh stackIn_42_0 = null;
        String stackIn_42_1 = null;
        int stackIn_46_0 = 0;
        Object stackIn_104_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ul var4 = null;
        Object var5 = null;
        Object var6 = null;
        ah var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        dd var17 = null;
        String var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackIn_4_0 = km.field_j.field_Xb;
                        stackIn_2_0 = stackIn_4_0;
                        stackIn_4_1 = 2;
                        stackIn_2_1 = stackIn_4_1;
                        stackIn_4_2 = db.field_b + 2;
                        stackIn_2_2 = stackIn_4_2;
                        stackIn_4_3 = (6 + 3 * db.field_b) * param0;
                        stackIn_2_3 = stackIn_4_3;
                        if (km.field_j.field_Xb != la.field_c) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = (kg) ((Object) stackIn_2_0);
                        stackIn_5_1 = stackIn_2_1;
                        stackIn_5_2 = stackIn_2_2;
                        stackIn_5_3 = stackIn_2_3;
                        stackIn_5_4 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (kg) ((Object) stackIn_4_0);
                        stackIn_5_1 = stackIn_4_1;
                        stackIn_5_2 = stackIn_4_2;
                        stackIn_5_3 = stackIn_4_3;
                        stackIn_5_4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = ((kg) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4 != 0, param2, (byte) -41) ? 1 : 0;
                        var4 = km.field_j.field_Wb.field_M;
                        if (param1 > 10) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_T = (me) null;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = null;
                        if (qc.field_P != 2) {
                            statePc = 96;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ig.field_m.field_T = true;
                        vc.field_h.field_S = db.a(eb.field_r, -66, new String[]{nn.field_f});
                        km.field_j.field_Xb.field_Tb.field_S = null;
                        var6 = null;
                        var7 = (ah) ((Object) var4.e(13058));
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (null == var7) {
                            statePc = 88;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8 = 0;
                        if (var19 != 0) {
                            statePc = 91;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (null == var7.field_M) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7.field_Ub = new gh(0L, bb.field_W);
                        var7.a(var7.field_Ub, 119);
                        var7.field_ec = new gh(0L, SteelSentinels.field_J);
                        var7.a(var7.field_ec, 125);
                        var7.field_cc = new gh(0L, bb.field_W);
                        var7.a(var7.field_cc, 125);
                        var7.field_ec.field_Kb = 2;
                        var7.h(109);
                        var8 = 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7.field_zb = km.field_j.field_Wb.field_zb;
                        var9 = 0;
                        if (null == var7.field_ac) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7.field_ac == nn.field_f) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11 = 16777062;
                        var10 = 13421568;
                        if (var19 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var11 = 6750054;
                        var10 = 52224;
                        if (var19 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var10 = 13369344;
                        var11 = 16737894;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var12 = 0;
                        if (var7.field_Vb == null) {
                            statePc = 32;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (!var7.field_Vb.equals("")) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var7.field_cc.field_Pb = ce.field_p;
                        var7.field_cc.field_rb = var11;
                        var12 = 1;
                        var7.field_cc.a(0, var9, db.field_b, 0, 3 + ce.field_p.field_z);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var7.field_ec.field_rb = var11;
                        var7.field_Ub.field_rb = var11;
                        var7.field_ec.field_Mb = var11;
                        var7.field_Ub.field_Mb = var11;
                        var7.field_ec.field_nb = var10;
                        var7.field_Ub.field_nb = var10;
                        var7.field_ec.field_xb = var11;
                        var7.field_Ub.field_xb = var11;
                        var13 = 0;
                        var14 = -82 + var7.field_zb;
                        if (var12 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var13 = ce.field_p.field_z + 3;
                        var14 = var14 - var13;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_37_0 = var7.field_Ub;
                        stackIn_35_0 = stackIn_37_0;
                        if ((var14 ^ -1) < -1) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_38_0 = (gh) ((Object) stackIn_35_0);
                        stackIn_38_1 = var7.field_dc;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = (gh) ((Object) stackIn_37_0);
                        stackIn_38_1 = mi.a(var7.field_Ub.field_L, var7.field_dc, var14);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_38_0.field_S = stackIn_38_1;
                        var7.field_Ub.a(0, var9, db.field_b, var13, var14);
                        stackIn_41_0 = var7.field_ec;
                        stackIn_39_0 = stackIn_41_0;
                        if (null == var7.field_ac) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_42_0 = (gh) ((Object) stackIn_39_0);
                        stackIn_42_1 = var7.field_ac;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = (gh) ((Object) stackIn_41_0);
                        stackIn_42_1 = oc.field_c;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_42_0.field_S = stackIn_42_1;
                        var7.field_ec.a(0, var9, db.field_b, -80 + var7.field_zb, 80);
                        if (var7.field_Ub.field_S.equals(var7.field_dc)) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_46_0 = 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var15 = stackIn_46_0;
                        var9 = var9 + db.field_b;
                        if (var3_int != 0) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var7.field_lb = -var7.field_Lb + var9;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var8 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        km.field_j.field_Wb.a(2, (byte) 96, (gh) (var6), var7);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var6 = var7;
                        if (var7.field_cc == null) {
                            statePc = 60;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (!var7.field_cc.field_kb) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        ll.field_i = var7.field_Vb;
                        if (var19 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (-1 == (var7.field_Eb ^ -1)) {
                            statePc = 78;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var16 = var7.field_dc;
                        kk.a(var7, -1, -1, (int[]) null, var16, (String) null, 1073741824, 0L, km.field_j.field_Xb);
                        var5 = var7;
                        if (null == var7.field_ac) {
                            statePc = 77;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (ob.a((byte) -38, an.field_i.field_k)) {
                            statePc = 77;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (!fj.field_e) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (!uc.field_g) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var17 = an.field_i;
                        var18 = db.a(rj.field_c, -67, new String[]{var16});
                        var17.field_j.a(2, 8, var18);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var17 = an.field_i;
                        var18 = db.a(dg.field_b, -96, new String[]{var16});
                        var17.field_j.a(2, 18, var18);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var19 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (!var7.field_Ub.field_kb) {
                            statePc = 87;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (var15 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        ll.field_i = var7.field_dc;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var7 = (ah) ((Object) var4.a((byte) -123));
                        if (var19 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (-1 == (km.field_j.field_bc.field_Eb ^ -1)) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        kc.field_y = new el(km.field_j.field_bc.field_Rb, km.field_j.field_bc.field_cb, km.field_j.field_bc.field_zb, km.field_j.field_bc.field_Lb, ij.field_S, kf.field_y, bd.field_f, bd.field_f);
                        ol.field_bc = 0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if ((km.field_j.field_Sb.field_Eb ^ -1) != -1) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        kc.field_y = new el(km.field_j.field_Sb.field_Rb, km.field_j.field_Sb.field_cb, km.field_j.field_Sb.field_zb, km.field_j.field_Sb.field_Lb, vk.field_b, kf.field_y, bd.field_f, bd.field_f);
                        ol.field_bc = 1;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        vc.field_h.field_S = lg.field_a;
                        ig.field_m.field_T = false;
                        if ((qc.field_P ^ -1) != -2) {
                            statePc = 100;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        km.field_j.field_Xb.field_Tb.field_S = kd.field_q;
                        if (var19 == 0) {
                            statePc = 102;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        km.field_j.field_Xb.field_Tb.field_S = eb.field_q;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        ue.a(0, km.field_j.field_Wb);
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        stackIn_104_0 = var5;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 104: {
                    return (ah) ((Object) stackIn_104_0);
                }
                case 105: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw ci.a((Throwable) ((Object) var3), "ic.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(hj param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.field_A != null) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  this.field_K = (int[]) null;
                  break L1;
                }
              }
              stackIn_19_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (param0.field_J < 0) {
                  break L2;
                } else {
                  param0.b(4);
                  if ((param0.field_p ^ -1) >= -1) {
                    break L2;
                  } else {
                    if (param0 == this.field_x[param0.field_t][param0.field_p]) {
                      this.field_x[param0.field_t][param0.field_p] = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_14_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("ic.M(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    private final int a(boolean param0, hj param1) {
        bj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_Y[param1.field_t] != 0) {
              var3 = param1.field_E;
              var4 = this.field_K[param1.field_t] * this.field_ab[param1.field_t] + 4096 >> -379391571;
              var4 = 16384 + var4 * var4 >> 169615311;
              var4 = 16384 + var4 * param1.field_L >> -1045948817;
              var4 = 128 + var4 * this.field_W >> 288849832;
              if (param0) {
                L1: {
                  var4 = 128 + this.field_Y[param1.field_t] * var4 >> -992289752;
                  if (-1 > (var3.field_i ^ -1)) {
                    var4 = (int)(Math.pow(0.5, (double)var3.field_i * (0.00001953125 * (double)param1.field_M)) * (double)var4 + 0.5);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var3.field_m == null) {
                    break L2;
                  } else {
                    L3: {
                      var5 = param1.field_D;
                      var6 = var3.field_m[param1.field_r - -1];
                      if (var3.field_m.length - 2 <= param1.field_r) {
                        break L3;
                      } else {
                        var7 = (var3.field_m[param1.field_r] & 255) << 88847240;
                        var8 = (var3.field_m[2 + param1.field_r] & 255) << 272358344;
                        var6 = var6 + (var5 - var7) * (var3.field_m[3 + param1.field_r] - var6) / (-var7 + var8);
                        break L3;
                      }
                    }
                    var4 = 32 + var6 * var4 >> 1418611526;
                    break L2;
                  }
                }
                L4: {
                  if (0 >= param1.field_J) {
                    break L4;
                  } else {
                    if (null == var3.field_p) {
                      break L4;
                    } else {
                      L5: {
                        var5 = param1.field_J;
                        var6 = var3.field_p[param1.field_B + 1];
                        if (param1.field_B < -2 + var3.field_p.length) {
                          var7 = (255 & var3.field_p[param1.field_B]) << -2120352728;
                          var8 = (255 & var3.field_p[2 + param1.field_B]) << -1045487448;
                          var6 = var6 + (-var6 + var3.field_p[3 + param1.field_B]) * (var5 - var7) / (var8 - var7);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var4 = 32 + var4 * var6 >> -1424183386;
                      break L4;
                    }
                  }
                }
                stackIn_24_0 = var4;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3_ref);

            stackIn_28_1 = new StringBuilder().append("ic.OA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_24_0;
          }
        }
    }

    final synchronized void a(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 == 61) {
                break L1;
              } else {
                this.a(-114, 85, 51, (hj) null, (int[]) null);
                break L1;
              }
            }
            this.field_Q = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ic.E(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized int a() {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            stackIn_1_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "ic.DB()");
        }
        return stackIn_1_0;
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hj var5 = null;
        ca var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var6_int = 0;
        sk var6 = null;
        hj var7 = null;
        hj var8 = null;
        int var9 = 0;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                this.a(param2, (byte) -87, param0, 64);
                if (0 == (2 & this.field_F[param2])) {
                  break L2;
                } else {
                  var5 = (hj) ((Object) this.field_v.field_F.b(1063677678));
                  L3: while (true) {
                    if (null == var5) {
                      break L2;
                    } else {
                      stackIn_17_0 = var5.field_t ^ -1;

                      stackIn_17_1 = param2 ^ -1;

                      if (var9 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_17_0 != stackIn_17_1) {
                            break L4;
                          } else {
                            if (-1 < (var5.field_J ^ -1)) {
                              this.field_U[param2][var5.field_z] = null;
                              this.field_U[param2][param0] = var5;
                              var6_int = (var5.field_y * var5.field_x >> 1073179052) + var5.field_o;
                              var5.field_o = var5.field_o + (-var5.field_z + param0 << -1574247416);
                              var5.field_y = 4096;
                              var5.field_x = -var5.field_o + var6_int;
                              var5.field_z = param0;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5 = (hj) ((Object) this.field_v.field_F.a(-2137));
                        if (var9 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackIn_17_0 = param1;
              stackIn_17_1 = 60;
              break L1;
            }
            L5: {
              if (stackIn_17_0 > stackIn_17_1) {
                break L5;
              } else {
                this.field_Q = -42;
                break L5;
              }
            }
            var5_ref = (ca) ((Object) this.field_bb.a((long)this.field_J[param2], 124));
            if (null != var5_ref) {
              var6 = var5_ref.field_x[param0];
              if (null == var6) {
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L6: {
                  L7: {
                    var7 = new hj();
                    var7.field_t = param2;
                    var7.field_q = var6;
                    var7.field_N = var5_ref;
                    var7.field_E = var5_ref.field_u[param0];
                    var7.field_p = var5_ref.field_v[param0];
                    var7.field_z = param0;
                    var7.field_L = param3 * (param3 * var5_ref.field_t * var5_ref.field_q[param0]) + 1024 >> -240975637;
                    var7.field_O = var5_ref.field_o[param0] & 255;
                    var7.field_o = -(var5_ref.field_p[param0] & 32767) + (param0 << 545354632);
                    var7.field_J = -1;
                    var7.field_M = 0;
                    var7.field_B = 0;
                    var7.field_r = 0;
                    var7.field_D = 0;
                    if (0 != this.field_L[param2]) {
                      break L7;
                    } else {
                      var7.field_A = em.a(var6, this.a((byte) -78, var7), this.a(true, var7), this.a(var7, (byte) -3));
                      if (var9 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var7.field_A = em.a(var6, this.a((byte) 100, var7), 0, this.a(var7, (byte) -3));
                    stackIn_35_0 = this;

                    if (-1 >= (var5_ref.field_p[param0] ^ -1)) {
                      stackIn_36_0 = this;
                      stackIn_36_1 = 0;
                      break L8;
                    } else {
                      stackIn_33_0 = this;
                      stackIn_36_0 = this;
                      stackIn_36_1 = 1;
                      break L8;
                    }
                  }
                  this.a(stackIn_36_1 != 0, -34, var7);
                  break L6;
                }
                L9: {
                  if (-1 >= (var5_ref.field_p[param0] ^ -1)) {
                    break L9;
                  } else {
                    var7.field_A.h(-1);
                    break L9;
                  }
                }
                L10: {
                  if (0 > var7.field_p) {
                    break L10;
                  } else {
                    L11: {
                      var8 = this.field_x[param2][var7.field_p];
                      if (var8 == null) {
                        break L11;
                      } else {
                        if (var8.field_J >= 0) {
                          break L11;
                        } else {
                          this.field_U[param2][var8.field_z] = null;
                          var8.field_J = 0;
                          break L11;
                        }
                      }
                    }
                    this.field_x[param2][var7.field_p] = var7;
                    break L10;
                  }
                }
                this.field_v.field_F.a(3, var7);
                this.field_U[param2][param0] = var7;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5_ref2), "ic.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_M.g();
              this.field_H = null;
              if (param1 == 27830696) {
                break L1;
              } else {
                this.field_S = true;
                break L1;
              }
            }
            this.a(param1 ^ -27830697, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ic.L(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        try {
            int var5_int = -77 / ((-55 - param0) / 46);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ic.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(int param0, byte param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 < 0) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_Y[param0] = param2;
                        if (var5 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4_int = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var4_int ^ -1) <= -17) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_Y[var4_int] = param2;
                        var4_int++;
                        if (var5 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var5 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param1 >= 2) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        field_T = (me) null;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw ci.a((Throwable) ((Object) var4), "ic.B(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (!this.field_M.d()) {
                break L1;
              } else {
                var4_int = this.field_Q * this.field_M.field_e / tb.field_g;
                L2: while (true) {
                  L3: {
                    var5 = (long)param2 * (long)var4_int + this.field_y;
                    if (-var5 + this.field_X >= 0L) {
                      this.field_y = var5;
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var7 = (int)((-1L + (-this.field_y + this.field_X + (long)var4_int)) / (long)var4_int);
                  this.field_y = this.field_y + (long)var7 * (long)var4_int;
                  this.field_v.a(param0, param1, var7);
                  this.e(1463);
                  param1 = param1 + var7;
                  param2 = param2 - var7;
                  if (!this.field_M.d()) {
                    break L1;
                  } else {
                    if (var8 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            this.field_v.a(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("ic.K(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_T = null;
        field_D = null;
        if (param0) {
            return;
        }
        try {
            field_eb = null;
            field_B = null;
            field_E = null;
            field_db = null;
            field_cb = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ic.J(" + param0 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_z[param2] = param1;
        if (param0 != -2043373017) {
            return;
        }
        try {
            this.field_A[param2] = ec.a(param1, -128);
            this.a(94, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ic.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = this.field_V;
                        var3 = this.field_s;
                        var4 = this.field_X;
                        if (null == this.field_H) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((this.field_G ^ -1) != (var3 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.a(false, this.field_S, this.field_H, this.field_C);
                        this.e(1463);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        stackIn_8_0 = var3;
                        stackIn_8_1 = this.field_s;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 != stackIn_8_1) {
                            statePc = 38;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_39_0 = var3 ^ -1;
                        stackIn_10_0 = stackIn_39_0;
                        stackIn_39_1 = this.field_M.field_a[var2_int] ^ -1;
                        stackIn_10_1 = stackIn_39_1;
                        if (var7 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 != stackIn_10_1) {
                            statePc = 37;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_M.d(var2_int);
                        var6 = this.field_M.f(var2_int);
                        stackIn_8_0 = var6 ^ -1;
                        stackIn_12_0 = stackIn_8_0;
                        stackIn_8_1 = -2;
                        stackIn_12_1 = stackIn_8_1;
                        if (var7 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 != stackIn_12_1) {
                            statePc = 33;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_M.e();
                        this.field_M.e(var2_int);
                        if (this.field_M.c()) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null == this.field_H) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.a(true, this.field_S, this.field_H);
                        this.e(1463);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return;
                }
                case 24: {
                    try {
                        if (!this.field_S) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var3 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        this.field_M.a(var4);
                        if (var7 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        this.a(-1, true);
                        this.field_M.g();
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 32: {
                    return;
                }
                case 33: {
                    try {
                        if (-1 == (var6 & 128 ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.b(21766, var6);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        this.field_M.c(var2_int);
                        this.field_M.e(var2_int);
                        if (var7 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var2_int = this.field_M.f();
                        var3 = this.field_M.field_a[var2_int];
                        var4 = this.field_M.b(var3);
                        if (var7 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        this.field_V = var2_int;
                        stackIn_39_0 = param0;
                        stackIn_39_1 = 1463;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 == stackIn_39_1) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.field_bb = (uh) null;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        this.field_X = var4;
                        this.field_s = var3;
                        if (this.field_H == null) {
                            statePc = 51;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (this.field_G < var3) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.field_V = -1;
                        this.field_s = this.field_G;
                        this.field_X = this.field_M.b(this.field_s);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw ci.a((Throwable) ((Object) var2), "ic.F(" + param0 + ')');
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public ic() {
        this.field_Z = new int[16];
        this.field_w = new int[16];
        this.field_x = new hj[16][128];
        this.field_z = new int[16];
        this.field_u = new int[16];
        this.field_A = new int[16];
        this.field_t = new int[16];
        this.field_K = new int[16];
        this.field_O = new int[16];
        this.field_Y = new int[16];
        this.field_U = new hj[16][128];
        this.field_Q = 1000000;
        this.field_W = 256;
        this.field_I = new int[16];
        this.field_L = new int[16];
        this.field_N = new int[16];
        this.field_R = new int[16];
        this.field_J = new int[16];
        this.field_F = new int[16];
        this.field_ab = new int[16];
        this.field_M = new ab();
        this.field_v = new ej((ic) (this));
        try {
            this.field_bb = new uh(128);
            this.a(-1, (byte) 109, 256);
            this.a(-1, true);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ic.<init>()");
        }
    }

    static {
        field_cb = "Please send me news and updates (I can unsubscribe at any time)";
        field_T = null;
        field_B = new ul();
        field_E = "CAMPAIGN TIME: ";
        field_D = new ul();
    }
}
