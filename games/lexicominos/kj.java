/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends lk {
    ng field_n;
    static long[] field_q;
    private hl field_l;
    static String field_p;
    static boolean field_o;
    hk field_m;

    final lk b() {
        cb var1;
        int var2;
        Object stackIn_5_0 = null;
        var2 = Lexicominos.field_L ? 1 : 0;
        L0: while (true) {
          L1: {
            var1 = (cb) ((Object) this.field_n.f(2));
            if (var1 != null) {
              stackIn_5_0 = null;
              break L1;
            } else {
              stackIn_5_0 = null;

              if (var2 != 0) {
                break L1;
              } else {
                return (lk) ((Object) stackIn_5_0);
              }
            }
          }
          if (stackIn_5_0 != var1.field_C) {
            return (lk) ((Object) var1.field_C);
          } else {
            continue L0;
          }
        }
    }

    private final void a(int param0, cb param1, int param2) {
        hl stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        cb stackIn_8_2 = null;
        hl stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        cb stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                this.field_m = (hk) null;
                break L1;
              }
            }
            L2: {
              if (-1 == (this.field_l.field_q[param1.field_z] & 4 ^ -1)) {
                break L2;
              } else {
                if (0 <= param1.field_h) {
                  break L2;
                } else {
                  var4_int = this.field_l.field_O[param1.field_z] / b.field_r;
                  var5 = (-param1.field_E + (1048575 + var4_int)) / var4_int;
                  param1.field_E = param0 * var4_int + param1.field_E & 1048575;
                  if (var5 > param0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (0 == this.field_l.field_u[param1.field_z]) {
                          break L4;
                        } else {
                          L5: {
                            param1.field_C = cc.a(param1.field_w, param1.field_C.l(), 0, param1.field_C.k());
                            stackIn_8_0 = this.field_l;

                            stackIn_8_1 = 92;

                            stackIn_8_2 = (cb) (param1);

                            if (param1.field_p.field_k[param1.field_q] >= 0) {
                              stackIn_9_0 = (hl) ((Object) stackIn_8_0);
                              stackIn_9_1 = stackIn_8_1;
                              stackIn_9_2 = (cb) ((Object) stackIn_8_2);
                              stackIn_9_3 = 0;
                              break L5;
                            } else {
                              stackIn_9_0 = (hl) ((Object) stackIn_8_0);
                              stackIn_9_1 = stackIn_8_1;
                              stackIn_9_2 = (cb) ((Object) stackIn_8_2);
                              stackIn_9_3 = 1;
                              break L5;
                            }
                          }
                          ((hl) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0);
                          if (!Lexicominos.field_L) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      param1.field_C = cc.a(param1.field_w, param1.field_C.l(), param1.field_C.j(), param1.field_C.k());
                      break L3;
                    }
                    L6: {
                      if (0 <= param1.field_p.field_k[param1.field_q]) {
                        break L6;
                      } else {
                        param1.field_C.e(-1);
                        break L6;
                      }
                    }
                    param0 = param1.field_E / var4_int;
                    break L2;
                  }
                }
              }
            }
            param1.field_C.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("kj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, cb param3, int[] param4, int param5) {
        hl stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        cb stackIn_14_2 = null;
        hl stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        cb stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        cc var11 = null;
        int var12 = 0;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & this.field_l.field_q[param3.field_z]) == 0) {
                break L1;
              } else {
                if (param3.field_h >= 0) {
                  break L1;
                } else {
                  var7_int = this.field_l.field_O[param3.field_z] / b.field_r;
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          var8 = (var7_int + 1048575 - param3.field_E) / var7_int;
                          if (var8 <= param5) {
                            break L5;
                          } else {
                            if (var12 != 0) {
                              break L4;
                            } else {
                              if (var12 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        param3.field_C.b(param4, param0, var8);
                        param3.field_E = param3.field_E + (var8 * var7_int + -1048576);
                        param0 = param0 + var8;
                        param5 = param5 - var8;
                        break L4;
                      }
                      L6: {
                        var9 = b.field_r / 100;
                        var10 = 262144 / var7_int;
                        if (var10 >= var9) {
                          break L6;
                        } else {
                          var9 = var10;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          var11 = param3.field_C;
                          if (this.field_l.field_u[param3.field_z] == 0) {
                            break L8;
                          } else {
                            L9: {
                              param3.field_C = cc.a(param3.field_w, var11.l(), 0, var11.k());
                              stackIn_14_0 = this.field_l;

                              stackIn_14_1 = 92;

                              stackIn_14_2 = (cb) (param3);

                              if (-1 >= (param3.field_p.field_k[param3.field_q] ^ -1)) {
                                stackIn_15_0 = (hl) ((Object) stackIn_14_0);
                                stackIn_15_1 = stackIn_14_1;
                                stackIn_15_2 = (cb) ((Object) stackIn_14_2);
                                stackIn_15_3 = 0;
                                break L9;
                              } else {
                                stackIn_15_0 = (hl) ((Object) stackIn_14_0);
                                stackIn_15_1 = stackIn_14_1;
                                stackIn_15_2 = (cb) ((Object) stackIn_14_2);
                                stackIn_15_3 = 1;
                                break L9;
                              }
                            }
                            ((hl) (Object) stackIn_15_0).a((byte) stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                            param3.field_C.b(var9, var11.j());
                            if (var12 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        param3.field_C = cc.a(param3.field_w, var11.l(), var11.j(), var11.k());
                        break L7;
                      }
                      L10: {
                        if (param3.field_p.field_k[param3.field_q] < 0) {
                          param3.field_C.e(-1);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        var11.h(var9);
                        var11.b(param4, param0, param1 - param0);
                        if (!var11.h()) {
                          break L11;
                        } else {
                          this.field_m.a(var11);
                          break L11;
                        }
                      }
                      if (var12 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                    param3.field_E = param3.field_E + var7_int * param5;
                    break L1;
                  }
                }
              }
            }
            param3.field_C.b(param4, param0, param5);
            if (param2 == 100) {
              break L0;
            } else {
              field_o = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var7);

            stackIn_29_1 = new StringBuilder().append("kj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L12;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L13;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L13;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ',' + param5 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        cb var3 = null;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    this.field_m.a(param0);
                    var3 = (cb) ((Object) this.field_n.a(true));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var3 != null) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    if (var4 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (!this.field_l.b(var3, 0)) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var4 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var2 = param0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var2 <= var3.field_m) {
                        statePc = 14;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.a(var3.field_m, var3, 0);
                    var2 = var2 - var3.field_m;
                    if (!this.field_l.a((int[]) null, 0, var3, var2, 120)) {
                        statePc = 9;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var4 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var4 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.a(var2, var3, 0);
                    statePc = 17;
                    continue stateLoop;
                }
                case 15: {
                    this.a(var2, var3, 0);
                    statePc = 18;
                    continue stateLoop;
                }
                case 16: {
                    var3.field_m = var3.field_m - var2;
                    statePc = 19;
                    continue stateLoop;
                }
                case 17: {
                    var3.field_m = var3.field_m - var2;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    var3.field_m = var3.field_m - var2;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var3 = (cb) ((Object) this.field_n.f(2));
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a() {
        return 0;
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        cb var6 = null;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_m.b(param0, param1, param2);
                        var6 = (cb) ((Object) this.field_n.a(true));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6 == null) {
                            statePc = 22;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!this.field_l.b(var6, 0)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var7 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = param2;
                        var4_int = param1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 <= var6.field_m) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.a(var4_int, var4_int - -var5, 100, var6, param0, var6.field_m);
                        var5 = var5 - var6.field_m;
                        var4_int = var4_int + var6.field_m;
                        if (!this.field_l.a(param0, var4_int, var6, var5, 82)) {
                            statePc = 9;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var7 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.a(var4_int, var4_int - -var5, 100, var6, param0, var5);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6.field_m = var6.field_m - var5;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6 = (cb) ((Object) this.field_n.f(2));
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (var4);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("kj.I(");
                    stackIn_19_1 = stackIn_20_1;
                    if (param0 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(byte param0) {
        if (param0 != 37) {
            return;
        }
        field_p = null;
        field_q = null;
    }

    final static void c(boolean param0) {
        if (!param0) {
            return;
        }
        qf.f(-28390);
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!cg.a(75)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (null == ff.field_b) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (ff.field_b.field_d) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        af.a(-98);
                        ti.field_L.a(-14579, new ii(ti.field_L, qg.field_a));
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        if (param0 == 22) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        ti.field_L.a(ha.field_d, true, wc.field_a, (byte) 124);
                        ti.field_L.f(true);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!ji.a((byte) -72)) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ti.field_L.a((byte) 86, pe.field_b, da.field_b);
                        if (var2 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var2 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        return;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) var1), "kj.H(" + param0 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final lk d() {
        cb var1;
        var1 = (cb) ((Object) this.field_n.a(true));
        if (var1 != null) {
          if (var1.field_C != null) {
            return (lk) ((Object) var1.field_C);
          } else {
            return this.b();
          }
        } else {
          return null;
        }
    }

    kj(hl param0) {
        this.field_n = new ng();
        this.field_m = new hk();
        try {
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "kj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Loading sound effects";
        field_q = new long[32];
    }
}
