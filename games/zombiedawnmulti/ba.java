/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends gq {
    private gd field_n;
    static String field_j;
    th field_k;
    static String field_p;
    static int field_q;
    static String field_l;
    static int field_m;
    vp field_o;

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        mb var6 = null;
        int var7 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            this.field_o.b(param0, param1, param2);
            var6 = (mb) ((Object) this.field_k.c(76));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (var7 == 0) {
                    stackIn_6_0 = this.field_n.a(-1, var6);
                    L3: while (true) {
                      L4: {
                        if (stackIn_6_0) {
                          break L4;
                        } else {
                          var4_int = param1;
                          var5 = param2;
                          L5: while (true) {
                            if (var5 <= var6.field_D) {
                              this.a(var4_int, 14531, var5, var6, param0, var4_int + var5);
                              var6.field_D = var6.field_D - var5;
                              break L4;
                            } else {
                              this.a(var4_int, 14531, var6.field_D, var6, param0, var5 + var4_int);
                              var5 = var5 - var6.field_D;
                              var4_int = var4_int + var6.field_D;
                              stackIn_6_0 = this.field_n.a(var6, var5, var4_int, param0, -115);

                              if (var7 != 0) {
                                continue L3;
                              } else {
                                if (stackIn_6_0) {
                                  break L4;
                                } else {
                                  continue L5;
                                }
                              }
                            }
                          }
                        }
                      }
                      var6 = (mb) ((Object) this.field_k.b(6));
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ba.F(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, mb param3, int[] param4, int param5) {
        gd stackIn_14_0 = null;
        gd stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uj var11 = null;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param1 == 14531) {
              L1: {
                L2: {
                  if (-1 == (4 & this.field_n.field_H[param3.field_o] ^ -1)) {
                    break L2;
                  } else {
                    if ((param3.field_l ^ -1) > -1) {
                      var7_int = this.field_n.field_n[param3.field_o] / gp.field_p;
                      L3: while (true) {
                        L4: {
                          var8 = (var7_int + 1048575 + -param3.field_w) / var7_int;
                          if (param2 < var8) {
                            break L4;
                          } else {
                            param3.field_C.b(param4, param0, var8);
                            param3.field_w = param3.field_w + (-1048576 + var7_int * var8);
                            param0 = param0 + var8;
                            param2 = param2 - var8;
                            var9 = gp.field_p / 100;
                            var10 = 262144 / var7_int;
                            if (var12 != 0) {
                              break L1;
                            } else {
                              L5: {
                                if (var10 >= var9) {
                                  break L5;
                                } else {
                                  var9 = var10;
                                  break L5;
                                }
                              }
                              L6: {
                                L7: {
                                  var11 = param3.field_C;
                                  if (this.field_n.field_y[param3.field_o] == 0) {
                                    break L7;
                                  } else {
                                    L8: {
                                      param3.field_C = uj.a(param3.field_f, var11.l(), 0, var11.g());
                                      stackIn_14_0 = this.field_n;

                                      if ((param3.field_x.field_g[param3.field_p] ^ -1) <= -1) {
                                        stackIn_15_0 = (gd) ((Object) stackIn_14_0);
                                        stackIn_15_1 = 0;
                                        break L8;
                                      } else {
                                        stackIn_15_0 = (gd) ((Object) stackIn_14_0);
                                        stackIn_15_1 = 1;
                                        break L8;
                                      }
                                    }
                                    ((gd) (Object) stackIn_15_0).a(stackIn_15_1 != 0, (byte) -76, param3);
                                    param3.field_C.a(var9, var11.h());
                                    if (var12 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                param3.field_C = uj.a(param3.field_f, var11.l(), var11.h(), var11.g());
                                break L6;
                              }
                              L9: {
                                if (param3.field_x.field_g[param3.field_p] < 0) {
                                  param3.field_C.g(-1);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              L10: {
                                var11.e(var9);
                                var11.b(param4, param0, param5 + -param0);
                                if (var11.j()) {
                                  this.field_o.b(var11);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              if (var12 == 0) {
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        param3.field_w = param3.field_w + var7_int * param2;
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                param3.field_C.b(param4, param0, param2);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var7);

            stackIn_29_1 = new StringBuilder().append("ba.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L12;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L12;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final gq b() {
        mb var1 = (mb) ((Object) this.field_k.c(76));
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_C)) {
            return (gq) ((Object) var1.field_C);
        }
        return this.d();
    }

    private final void a(mb param0, int param1, boolean param2) {
        gd stackIn_8_0 = null;
        gd stackIn_9_0 = null;
        int stackIn_9_1 = 0;
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
              if ((4 & this.field_n.field_H[param0.field_o]) == 0) {
                break L1;
              } else {
                if (-1 >= (param0.field_l ^ -1)) {
                  break L1;
                } else {
                  var4_int = this.field_n.field_n[param0.field_o] / gp.field_p;
                  var5 = (-param0.field_w + (1048575 - -var4_int)) / var4_int;
                  param0.field_w = param0.field_w + var4_int * param1 & 1048575;
                  if (param1 < var5) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        if (0 != this.field_n.field_y[param0.field_o]) {
                          break L3;
                        } else {
                          param0.field_C = uj.a(param0.field_f, param0.field_C.l(), param0.field_C.h(), param0.field_C.g());
                          if (!ZombieDawnMulti.field_E) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        param0.field_C = uj.a(param0.field_f, param0.field_C.l(), 0, param0.field_C.g());
                        stackIn_8_0 = this.field_n;

                        if (0 <= param0.field_x.field_g[param0.field_p]) {
                          stackIn_9_0 = (gd) ((Object) stackIn_8_0);
                          stackIn_9_1 = 0;
                          break L4;
                        } else {
                          stackIn_9_0 = (gd) ((Object) stackIn_8_0);
                          stackIn_9_1 = 1;
                          break L4;
                        }
                      }
                      ((gd) (Object) stackIn_9_0).a(stackIn_9_1 != 0, (byte) -80, param0);
                      break L2;
                    }
                    L5: {
                      if ((param0.field_x.field_g[param0.field_p] ^ -1) <= -1) {
                        break L5;
                      } else {
                        param0.field_C.g(-1);
                        break L5;
                      }
                    }
                    param1 = param0.field_w / var4_int;
                    break L1;
                  }
                }
              }
            }
            param0.field_C.a(param1);
            if (!param2) {
              break L0;
            } else {
              field_m = -56;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("ba.E(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void d(int param0) {
        field_j = null;
        field_p = null;
        if (param0 != 16652) {
            ba.c(-110);
            field_l = null;
            return;
        }
        field_l = null;
    }

    final void a(int param0) {
        int var2 = 0;
        mb var3 = null;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    this.field_o.a(param0);
                    var3 = (mb) ((Object) this.field_k.c(91));
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
                    if (this.field_n.a(-1, var3)) {
                        statePc = 17;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var2 = param0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var3.field_D >= var2) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.a(var3, var3.field_D, false);
                    var2 = var2 - var3.field_D;
                    if (!this.field_n.a(var3, var2, 0, (int[]) null, 22)) {
                        statePc = 7;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var4 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var4 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.a(var3, var2, false);
                    statePc = 15;
                    continue stateLoop;
                }
                case 13: {
                    this.a(var3, var2, false);
                    statePc = 16;
                    continue stateLoop;
                }
                case 14: {
                    var3.field_D = var3.field_D - var2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 15: {
                    var3.field_D = var3.field_D - var2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    var3.field_D = var3.field_D - var2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var3 = (mb) ((Object) this.field_k.b(6));
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a() {
        return 0;
    }

    final gq d() {
        mb var1;
        L0: while (true) {
          var1 = (mb) ((Object) this.field_k.b(6));
          if (var1 != null) {
            if (var1.field_C != null) {
              return (gq) ((Object) var1.field_C);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        var1_ref = um.field_c;
        synchronized (var1_ref) {
          L0: {
            if (lp.field_j != kj.field_j) {
              L1: {
                sj.field_p = td.field_a[lp.field_j];
                pn.field_d = ta.field_pb[lp.field_j];
                if (param0 == -1) {
                  break L1;
                } else {
                  field_m = -21;
                  break L1;
                }
              }
              lp.field_j = lp.field_j + 1 & 127;
              stackIn_7_0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    ba(gd param0) {
        this.field_k = new th();
        this.field_o = new vp();
        try {
            this.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ba.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = 2;
        field_l = "If you do nothing the game will revert to normal view in <%0> second.";
        field_j = "Name is available";
        field_p = "Unfortunately you are not eligible to create an account.";
    }
}
