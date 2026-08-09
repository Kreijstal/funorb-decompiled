/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends ag {
    static boolean field_n;
    static boolean field_k;
    static vg[] field_l;
    static String field_p;
    qj field_q;
    private lc field_o;
    jc field_m;

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        kc var6 = null;
        int var7 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            this.field_m.b(param0, param1, param2);
            var6 = (kc) ((Object) this.field_q.a((byte) -95));
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var6) {
                    break L3;
                  } else {
                    if (var7 != 0) {
                      break L2;
                    } else {
                      stackIn_6_0 = this.field_o.a(7, var6);
                      L4: while (true) {
                        L5: {
                          if (stackIn_6_0) {
                            break L5;
                          } else {
                            var5 = param2;
                            var4_int = param1;
                            L6: while (true) {
                              if ((var6.field_r ^ -1) <= (var5 ^ -1)) {
                                this.a(var4_int + var5, param0, 0, var6, var4_int, var5);
                                var6.field_r = var6.field_r - var5;
                                break L5;
                              } else {
                                this.a(var4_int + var5, param0, 0, var6, var4_int, var6.field_r);
                                var4_int = var4_int + var6.field_r;
                                var5 = var5 - var6.field_r;
                                stackIn_6_0 = this.field_o.a((byte) 126, var4_int, var5, param0, var6);

                                if (var7 != 0) {
                                  continue L4;
                                } else {
                                  if (stackIn_6_0) {
                                    break L5;
                                  } else {
                                    continue L6;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var6 = (kc) ((Object) this.field_q.a(true));
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("ej.K(");

            if (param0 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b() {
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
          throw ch.a((Throwable) ((Object) var1), "ej.H()");
        }
        return stackIn_1_0;
    }

    final static ii[] a(byte param0, ci param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ii[] stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -43) {
                break L1;
              } else {
                field_k = false;
                break L1;
              }
            }
            var4_int = param1.b(param0 + 108, param3);
            var5 = param1.a(-1, param2, var4_int);
            stackIn_4_0 = hj.a(param1, (byte) -62, var5, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("ej.N(").append(param0).append(',');

            if (param1 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    final ag a() {
        kc var1 = null;
        Object stackIn_4_0 = null;
        bb stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        try {
          L0: {
            L1: while (true) {
              var1 = (kc) ((Object) this.field_q.a(true));
              if (var1 == null) {
                stackIn_4_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (null != var1.field_y) {
                  stackIn_9_0 = var1.field_y;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "ej.A()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (ag) ((Object) stackIn_4_0);
        } else {
          return (ag) ((Object) stackIn_9_0);
        }
    }

    final static int a(int param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_n = true;
                break L1;
              }
            }
            stackIn_4_0 = bg.a(param1, true, param2, (byte) 126);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ej.M(").append(param0).append(',').append(param1).append(',');

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
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(int param0, kc param1, int param2) {
        lc stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        lc stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (param0 == (this.field_o.field_v[param1.field_u] & 4)) {
                break L1;
              } else {
                if (param1.field_p < 0) {
                  var4_int = this.field_o.field_D[param1.field_u] / qh.field_p;
                  var5 = (-param1.field_n + (1048575 + var4_int)) / var4_int;
                  param1.field_n = 1048575 & param1.field_n - -(var4_int * param2);
                  if (var5 > param2) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        if (0 != this.field_o.field_P[param1.field_u]) {
                          break L3;
                        } else {
                          param1.field_y = bb.a(param1.field_t, param1.field_y.i(), param1.field_y.h(), param1.field_y.f());
                          if (!Transmogrify.field_A) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        param1.field_y = bb.a(param1.field_t, param1.field_y.i(), 0, param1.field_y.f());
                        stackIn_18_0 = this.field_o;

                        stackIn_18_1 = 0;

                        if (0 <= param1.field_h.field_k[param1.field_i]) {
                          stackIn_19_0 = (lc) ((Object) stackIn_18_0);
                          stackIn_19_1 = stackIn_18_1;
                          stackIn_19_2 = 0;
                          break L4;
                        } else {


                          stackIn_19_0 = (lc) ((Object) stackIn_18_0);
                          stackIn_19_1 = stackIn_18_1;
                          stackIn_19_2 = 1;
                          break L4;
                        }
                      }
                      ((lc) (Object) stackIn_19_0).a(stackIn_19_1 != 0, stackIn_19_2 != 0, param1);
                      break L2;
                    }
                    L5: {
                      if ((param1.field_h.field_k[param1.field_i] ^ -1) > -1) {
                        param1.field_y.h(-1);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param2 = param1.field_n / var4_int;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            param1.field_y.d(param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4);

            stackIn_30_1 = new StringBuilder().append("ej.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int[] param1, int param2, kc param3, int param4, int param5) {
        lc stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        lc stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bb var11 = null;
        int var12 = 0;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & this.field_o.field_v[param3.field_u]) == param2) {
                break L1;
              } else {
                if ((param3.field_p ^ -1) <= -1) {
                  break L1;
                } else {
                  var7_int = this.field_o.field_D[param3.field_u] / qh.field_p;
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          var8 = (1048575 - -var7_int + -param3.field_n) / var7_int;
                          if ((param5 ^ -1) <= (var8 ^ -1)) {
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
                        param3.field_y.b(param1, param4, var8);
                        param3.field_n = param3.field_n + (var7_int * var8 - 1048576);
                        param4 = param4 + var8;
                        param5 = param5 - var8;
                        break L4;
                      }
                      L6: {
                        var9 = qh.field_p / 100;
                        var10 = 262144 / var7_int;
                        if ((var9 ^ -1) >= (var10 ^ -1)) {
                          break L6;
                        } else {
                          var9 = var10;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          var11 = param3.field_y;
                          if (-1 != (this.field_o.field_P[param3.field_u] ^ -1)) {
                            break L8;
                          } else {
                            param3.field_y = bb.a(param3.field_t, var11.i(), var11.h(), var11.f());
                            if (var12 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          param3.field_y = bb.a(param3.field_t, var11.i(), 0, var11.f());
                          stackIn_23_0 = this.field_o;

                          stackIn_23_1 = 0;

                          if (-1 >= (param3.field_h.field_k[param3.field_i] ^ -1)) {
                            stackIn_24_0 = (lc) ((Object) stackIn_23_0);
                            stackIn_24_1 = stackIn_23_1;
                            stackIn_24_2 = 0;
                            break L9;
                          } else {


                            stackIn_24_0 = (lc) ((Object) stackIn_23_0);
                            stackIn_24_1 = stackIn_23_1;
                            stackIn_24_2 = 1;
                            break L9;
                          }
                        }
                        ((lc) (Object) stackIn_24_0).a(stackIn_24_1 != 0, stackIn_24_2 != 0, param3);
                        param3.field_y.a(var9, var11.h());
                        break L7;
                      }
                      L10: {
                        if (0 <= param3.field_h.field_k[param3.field_i]) {
                          break L10;
                        } else {
                          param3.field_y.h(-1);
                          break L10;
                        }
                      }
                      L11: {
                        var11.f(var9);
                        var11.b(param1, param4, -param4 + param0);
                        if (!var11.e()) {
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
                    param3.field_n = param3.field_n + var7_int * param5;
                    break L1;
                  }
                }
              }
            }
            param3.field_y.b(param1, param4, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var7);

            stackIn_38_1 = new StringBuilder().append("ej.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L12;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L13;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L13;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_39_0), stackIn_43_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static long a(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            stackIn_1_0 = param0 & param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var4), "ej.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final void d(int param0) {
        int var2_int = 0;
        kc var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_m.d(param0);
                        var3 = (kc) ((Object) this.field_q.a((byte) -95));
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
                        if (null == var3) {
                            statePc = 17;
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
                        if (var4 != 0) {
                            statePc = 17;
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
                        stackIn_6_0 = this.field_o.a(7, var3);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!stackIn_6_0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 14;
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
                        var2_int = param0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var2_int <= var3.field_r) {
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
                        this.a(0, var3, var3.field_r);
                        var2_int = var2_int - var3.field_r;
                        stackIn_6_0 = this.field_o.a((byte) 123, 0, var2_int, (int[]) null, var3);
                        stackIn_11_0 = stackIn_6_0;
                        if (var4 != 0) {
                            statePc = 6;
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
                        if (stackIn_11_0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.a(0, var3, var2_int);
                        var3.field_r = var3.field_r - var2_int;
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
                        var3 = (kc) ((Object) this.field_q.a(true));
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var2), "ej.G(" + param0 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_p = null;
              if (!param0) {
                break L1;
              } else {
                field_k = false;
                break L1;
              }
            }
            field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "ej.L(" + param0 + ')');
        }
    }

    final static boolean a(wl param0, String param1, String param2, boolean param3, boolean param4, String param5, int param6) {
        sf var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param4) {
                break L1;
              } else {
                ej.a((wl) null, (String) null, (String) null, false, true, (String) null, 27);
                break L1;
              }
            }
            if (jh.field_n != rh.field_v) {
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                L3: {
                  var7 = new sf(ci.field_f, param0);
                  ci.field_f.b((qg) (var7), (byte) -71);
                  if (oa.f((byte) 105)) {
                    break L3;
                  } else {
                    rh.field_v = of.field_d;
                    q.field_h = null;
                    c.field_d = param3;
                    ab.field_j = param6;
                    hf.field_g = param1;
                    kk.field_g = param5;
                    ta.field_h = param2;
                    if (!Transmogrify.field_A) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var7.u(-10);
                break L2;
              }
              stackIn_15_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var7_ref);

            stackIn_19_1 = new StringBuilder().append("ej.D(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), stackIn_32_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    final static void a(int param0, byte param1, e param2, boolean param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_57_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        boolean stackOut_12_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = qg.a((byte) 108, (param0 + -param4) * 3);
                        var6 = param4 * 3;
                        vf.b(true);
                        var7 = -10 + var5_int;
                        if (-1 <= (param2.field_w ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == param2.field_y) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        di.c(-11517);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ug.field_h = 0;
                        if (param1 <= -122) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_p = (String) null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var8 ^ -1) <= (param2.field_C ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = param2.field_o[var8];
                        var10 = param2.field_s[var8];
                        var11 = param2.field_G[var8];
                        stackOut_12_0 = param3;
                        stackIn_57_0 = stackOut_12_0 ? 1 : 0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var19 != 0) {
                            statePc = 57;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = sg.field_a[var9];
                        var13 = d.field_a[var9];
                        var14 = -var12 + sg.field_a[var10];
                        var15 = sg.field_a[var11] + -var12;
                        var16 = d.field_a[var10] - var13;
                        var17 = d.field_a[var11] + -var13;
                        if ((-(var15 * var16) + var17 * var14 ^ -1) > -1) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var19 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var12 = nd.field_l[var9];
                        if (2147483647 != (var12 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var19 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var13 = nd.field_l[var10];
                        if (-2147483648 != var13) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var19 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var14 = nd.field_l[var11];
                        if (-2147483648 != var14) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var19 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var15 = -var6 + (var13 + var12 - -var14);
                        stackIn_36_0 = -1 + mh.field_b.length;
                        stackIn_34_0 = stackIn_36_0;
                        if (var7 >= 0) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_37_0 = stackIn_34_0;
                        stackIn_37_1 = var15 << -var7;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = stackIn_36_0;
                        stackIn_37_1 = var15 >> var7;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var16 = stackIn_37_0 - stackIn_37_1;
                        var17 = mh.field_b[var16];
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (0 == var17 >> -2001050844) {
                            statePc = 47;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var16--;
                        stackIn_48_0 = 0;
                        stackIn_40_0 = stackIn_48_0;
                        stackIn_48_1 = var16;
                        stackIn_40_1 = stackIn_48_1;
                        if (var19 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 <= stackIn_40_1) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var17 = mh.field_b[var16];
                        if (var19 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = var17;
                        stackIn_48_1 = var16 << -2120784220;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var18 = stackIn_48_0 + stackIn_48_1;
                        i.field_b[var18] = var8;
                        mh.field_b[var16] = var17 + 1;
                        if ((param2.field_w ^ -1) >= -1) {
                            statePc = 54;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (param2.field_y == null) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        dupTemp$0 = param2.field_y[var8];
                        ca.field_c[dupTemp$0] = ca.field_c[dupTemp$0] + 1;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        ug.field_h = ug.field_h + 1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_57_0 = -1;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0 <= (param2.field_w ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (null == param2.field_y) {
                            statePc = 73;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var9 >= ca.field_c.length) {
                            statePc = 73;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var10 = ca.field_c[var9];
                        ca.field_c[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 73;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var19 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_71_0 = (RuntimeException) (var5);
                    stackIn_69_0 = stackIn_71_0;
                    stackIn_71_1 = new StringBuilder().append("ej.B(").append(param0).append(',').append(param1).append(',');
                    stackIn_69_1 = stackIn_71_1;
                    if (param2 == null) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_72_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackIn_72_2 = "{...}";
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackIn_72_2 = "null";
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    throw ch.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 73: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ag d() {
        kc var1 = null;
        RuntimeException var1_ref = null;
        Object stackIn_2_0 = null;
        bb stackIn_7_0 = null;
        ag stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var1 = (kc) ((Object) this.field_q.a((byte) -95));
            if (var1 != null) {
              if (var1.field_y != null) {
                stackIn_7_0 = var1.field_y;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_9_0 = this.a();
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "ej.E()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (ag) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ag) ((Object) stackIn_7_0);
          } else {
            return stackIn_9_0;
          }
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, pg param4, pg param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              cd.field_f = param5;
              ee.field_D = param3;
              if (param1 >= 105) {
                break L1;
              } else {
                ej.a((byte) 62, (ci) null, (String) null, (String) null);
                break L1;
              }
            }
            vh.field_m = param0;
            jl.field_o = param2;
            gl.field_B = param4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("ej.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param5 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ')');
        }
    }

    ej(lc param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_q = new qj();
        this.field_m = new jc();
        try {
          L0: {
            this.field_o = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ej.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_l = new vg[8];
        field_p = "Make your word here ... Make your word here ...";
        field_n = false;
    }
}
