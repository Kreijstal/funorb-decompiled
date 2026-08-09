/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends di {
    static String field_l;
    im field_k;
    static String[] field_n;
    private lj field_j;
    v field_m;

    final di a() {
        he var1 = (he) ((Object) this.field_k.b((byte) -75));
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_l == null)) {
            return (di) ((Object) var1.field_l);
        }
        return this.d();
    }

    private final void a(int param0, he param1, int param2) {
        lj stackIn_10_0 = null;
        he stackIn_10_1 = null;
        lj stackIn_11_0 = null;
        he stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (-1 == (this.field_j.field_o[param1.field_F] & 4 ^ -1)) {
                break L1;
              } else {
                if (0 > param1.field_n) {
                  var4_int = this.field_j.field_L[param1.field_F] / la.field_c;
                  var5 = (var4_int + (1048575 + -param1.field_i)) / var4_int;
                  param1.field_i = 1048575 & param0 * var4_int + param1.field_i;
                  if (var5 <= param0) {
                    L2: {
                      L3: {
                        if (-1 != (this.field_j.field_D[param1.field_F] ^ -1)) {
                          break L3;
                        } else {
                          param1.field_l = bb.a(param1.field_D, param1.field_l.g(), param1.field_l.j(), param1.field_l.l());
                          if (!OrbDefence.field_D) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        param1.field_l = bb.a(param1.field_D, param1.field_l.g(), 0, param1.field_l.l());
                        stackIn_10_0 = this.field_j;

                        stackIn_10_1 = (he) (param1);

                        if ((param1.field_g.field_m[param1.field_h] ^ -1) <= -1) {
                          stackIn_11_0 = (lj) ((Object) stackIn_10_0);
                          stackIn_11_1 = (he) ((Object) stackIn_10_1);
                          stackIn_11_2 = 0;
                          break L4;
                        } else {
                          stackIn_11_0 = (lj) ((Object) stackIn_10_0);
                          stackIn_11_1 = (he) ((Object) stackIn_10_1);
                          stackIn_11_2 = 1;
                          break L4;
                        }
                      }
                      ((lj) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2 != 0, param2 + 33816);
                      break L2;
                    }
                    L5: {
                      if (param1.field_g.field_m[param1.field_h] < 0) {
                        param1.field_l.d(-1);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param0 = param1.field_i / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (param2 == -23887) {
                break L6;
              } else {
                this.d();
                break L6;
              }
            }
            param1.field_l.c(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("jg.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
    }

    final di d() {
        he var1;
        L0: while (true) {
          var1 = (he) ((Object) this.field_k.d(853));
          if (var1 != null) {
            if (var1.field_l != null) {
              return (di) ((Object) var1.field_l);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(int[] param0, int param1, int param2, boolean param3, he param4, int param5) {
        lj stackIn_14_0 = null;
        he stackIn_14_1 = null;
        lj stackIn_15_0 = null;
        he stackIn_15_1 = null;
        int stackIn_15_2 = 0;
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
        bb var11 = null;
        int var12 = 0;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                this.field_j = (lj) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((4 & this.field_j.field_o[param4.field_F]) == 0) {
                  break L3;
                } else {
                  if (param4.field_n >= 0) {
                    break L3;
                  } else {
                    var7_int = this.field_j.field_L[param4.field_F] / la.field_c;
                    L4: while (true) {
                      L5: {
                        var8 = (-param4.field_i + (1048575 + var7_int)) / var7_int;
                        if (var8 > param5) {
                          break L5;
                        } else {
                          param4.field_l.b(param0, param2, var8);
                          param4.field_i = param4.field_i + (-1048576 + var8 * var7_int);
                          param2 = param2 + var8;
                          param5 = param5 - var8;
                          var9 = la.field_c / 100;
                          var10 = 262144 / var7_int;
                          if (var12 != 0) {
                            break L2;
                          } else {
                            L6: {
                              if (var9 > var10) {
                                var9 = var10;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            L7: {
                              L8: {
                                var11 = param4.field_l;
                                if (0 == this.field_j.field_D[param4.field_F]) {
                                  break L8;
                                } else {
                                  L9: {
                                    param4.field_l = bb.a(param4.field_D, var11.g(), 0, var11.l());
                                    stackIn_14_0 = this.field_j;

                                    stackIn_14_1 = (he) (param4);

                                    if (param4.field_g.field_m[param4.field_h] >= 0) {
                                      stackIn_15_0 = (lj) ((Object) stackIn_14_0);
                                      stackIn_15_1 = (he) ((Object) stackIn_14_1);
                                      stackIn_15_2 = 0;
                                      break L9;
                                    } else {
                                      stackIn_15_0 = (lj) ((Object) stackIn_14_0);
                                      stackIn_15_1 = (he) ((Object) stackIn_14_1);
                                      stackIn_15_2 = 1;
                                      break L9;
                                    }
                                  }
                                  ((lj) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2 != 0, 9929);
                                  param4.field_l.d(var9, var11.j());
                                  if (var12 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              param4.field_l = bb.a(param4.field_D, var11.g(), var11.j(), var11.l());
                              break L7;
                            }
                            L10: {
                              if (param4.field_g.field_m[param4.field_h] < 0) {
                                param4.field_l.d(-1);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L11: {
                              var11.f(var9);
                              var11.b(param0, param2, param1 + -param2);
                              if (var11.e()) {
                                this.field_m.a(var11);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            if (var12 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      param4.field_i = param4.field_i + var7_int * param5;
                      break L3;
                    }
                  }
                }
              }
              param4.field_l.b(param0, param2, param5);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var7);

            stackIn_29_1 = new StringBuilder().append("jg.I(");

            if (param0 == null) {
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


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ',' + param5 + ')');
        }
    }

    final int c() {
        return 0;
    }

    final void c(int param0) {
        int var2;
        he var3;
        int var4;
        boolean stackIn_6_0 = false;
        var4 = OrbDefence.field_D ? 1 : 0;
        this.field_m.c(param0);
        var3 = (he) ((Object) this.field_k.b((byte) 117));
        L0: while (true) {
          if (var3 != null) {
            if (var4 == 0) {
              stackIn_6_0 = this.field_j.a(var3, (byte) 90);
              L1: while (true) {
                L2: {
                  if (stackIn_6_0) {
                    break L2;
                  } else {
                    var2 = param0;
                    L3: while (true) {
                      if (var3.field_w >= var2) {
                        this.a(var2, var3, -23887);
                        var3.field_w = var3.field_w - var2;
                        break L2;
                      } else {
                        this.a(var3.field_w, var3, -23887);
                        var2 = var2 - var3.field_w;
                        stackIn_6_0 = this.field_j.a(4160, var3, 0, var2, (int[]) null);

                        if (var4 != 0) {
                          continue L1;
                        } else {
                          if (stackIn_6_0) {
                            break L2;
                          } else {
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
                var3 = (he) ((Object) this.field_k.d(853));
                if (var4 == 0) {
                  continue L0;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        he var6 = null;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_m.b(param0, param1, param2);
                        var6 = (he) ((Object) this.field_k.b((byte) -96));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6 == null) {
                            statePc = 20;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
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
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_j.a(var6, (byte) 98)) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4_int = param1;
                        var5 = param2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6.field_w >= var5) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.a(param0, var4_int + var5, var4_int, true, var6, var6.field_w);
                        var5 = var5 - var6.field_w;
                        var4_int = var4_int + var6.field_w;
                        if (!this.field_j.a(4160, var6, var4_int, var5, param0)) {
                            statePc = 7;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var7 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var7 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.a(param0, var4_int + var5, var4_int, true, var6, var5);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6.field_w = var6.field_w - var5;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = (he) ((Object) this.field_k.d(853));
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (runtimeException);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("jg.B(");
                    stackIn_17_1 = stackIn_18_1;
                    if (param0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw dd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 < 34) {
            jg.d(-51);
            field_n = null;
            return;
        }
        field_n = null;
    }

    jg(lj param0) {
        this.field_k = new im();
        this.field_m = new v();
        try {
            this.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "FAST BLAST";
    }
}
