/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ej {
    static boolean field_l;
    static int field_p;
    private mf field_n;
    static int field_q;
    nc field_m;
    static da field_o;
    e field_r;
    static int field_s;

    final ej a() {
        hg var1 = (hg) ((Object) this.field_m.a((byte) 51));
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_w)) {
            return (ej) ((Object) var1.field_w);
        }
        return this.b();
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 42 % ((param1 - 47) / 54);
            var3 = param0.charAt(0);
            var4 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.length() <= var4) {
                    break L3;
                  } else {
                    stackIn_9_0 = var3 ^ -1;

                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_9_0 == (param0.charAt(var4) ^ -1)) {
                        var4++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        stackIn_6_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_9_0 = 1;
                break L2;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("lh.D(");

            if (param0 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final void a(int[] param0, int param1, int param2) {
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
        hg var6 = null;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_r.a(param0, param1, param2);
                        var6 = (hg) ((Object) this.field_m.a((byte) 51));
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
                        if (!this.field_n.b(var6, -1642423728)) {
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
                        if (var5 <= var6.field_t) {
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
                        this.a(param0, var5 + var4_int, var6, var4_int, var6.field_t, (byte) -117);
                        var5 = var5 - var6.field_t;
                        var4_int = var4_int + var6.field_t;
                        if (!this.field_n.a(var4_int, param0, var5, 100, var6)) {
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
                        this.a(param0, var5 + var4_int, var6, var4_int, var5, (byte) -117);
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
                        var6.field_t = var6.field_t - var5;
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
                        var6 = (hg) ((Object) this.field_m.b(-51));
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
                    stackIn_20_1 = new StringBuilder().append("lh.AA(");
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
                    throw fc.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int d() {
        return 0;
    }

    public static void d(int param0) {
        if (param0 > -67) {
            return;
        }
        field_o = null;
    }

    private final void a(byte param0, hg param1, int param2) {
        mf stackIn_8_0 = null;
        hg stackIn_8_1 = null;
        mf stackIn_9_0 = null;
        hg stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (0 == (this.field_n.field_U[param1.field_z] & 4)) {
                break L1;
              } else {
                if (param1.field_k < 0) {
                  var4_int = this.field_n.field_J[param1.field_z] / gj.field_s;
                  var5 = (-param1.field_C + var4_int + 1048575) / var4_int;
                  param1.field_C = var4_int * param2 + param1.field_C & 1048575;
                  if (param2 >= var5) {
                    L2: {
                      L3: {
                        if (this.field_n.field_z[param1.field_z] == 0) {
                          break L3;
                        } else {
                          L4: {
                            param1.field_w = qi.a(param1.field_u, param1.field_w.j(), 0, param1.field_w.f());
                            stackIn_8_0 = this.field_n;

                            stackIn_8_1 = (hg) (param1);

                            if ((param1.field_p.field_s[param1.field_o] ^ -1) <= -1) {
                              stackIn_9_0 = (mf) ((Object) stackIn_8_0);
                              stackIn_9_1 = (hg) ((Object) stackIn_8_1);
                              stackIn_9_2 = 0;
                              break L4;
                            } else {
                              stackIn_9_0 = (mf) ((Object) stackIn_8_0);
                              stackIn_9_1 = (hg) ((Object) stackIn_8_1);
                              stackIn_9_2 = 1;
                              break L4;
                            }
                          }
                          ((mf) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2 != 0, false);
                          if (!SolKnight.field_L) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      param1.field_w = qi.a(param1.field_u, param1.field_w.j(), param1.field_w.e(), param1.field_w.f());
                      break L2;
                    }
                    L5: {
                      if ((param1.field_p.field_s[param1.field_o] ^ -1) <= -1) {
                        break L5;
                      } else {
                        param1.field_w.d(-1);
                        break L5;
                      }
                    }
                    param2 = param1.field_C / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            param1.field_w.a(param2);
            if (param0 < -43) {
              break L0;
            } else {
              field_q = 96;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("lh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
    }

    private final void a(int[] param0, int param1, hg param2, int param3, int param4, byte param5) {
        mf stackIn_16_0 = null;
        hg stackIn_16_1 = null;
        mf stackIn_17_0 = null;
        hg stackIn_17_1 = null;
        int stackIn_17_2 = 0;
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
        qi var11 = null;
        int var12 = 0;
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & this.field_n.field_U[param2.field_z]) == 0) {
                break L1;
              } else {
                if (0 <= param2.field_k) {
                  break L1;
                } else {
                  var7_int = this.field_n.field_J[param2.field_z] / gj.field_s;
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          var8 = (1048575 + (var7_int + -param2.field_C)) / var7_int;
                          if (param4 >= var8) {
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
                        param2.field_w.a(param0, param3, var8);
                        param3 = param3 + var8;
                        param4 = param4 - var8;
                        param2.field_C = param2.field_C + (var8 * var7_int + -1048576);
                        break L4;
                      }
                      L6: {
                        var9 = gj.field_s / 100;
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
                          var11 = param2.field_w;
                          if (0 != this.field_n.field_z[param2.field_z]) {
                            break L8;
                          } else {
                            param2.field_w = qi.a(param2.field_u, var11.j(), var11.e(), var11.f());
                            if (var12 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          param2.field_w = qi.a(param2.field_u, var11.j(), 0, var11.f());
                          stackIn_16_0 = this.field_n;

                          stackIn_16_1 = (hg) (param2);

                          if ((param2.field_p.field_s[param2.field_o] ^ -1) <= -1) {
                            stackIn_17_0 = (mf) ((Object) stackIn_16_0);
                            stackIn_17_1 = (hg) ((Object) stackIn_16_1);
                            stackIn_17_2 = 0;
                            break L9;
                          } else {
                            stackIn_17_0 = (mf) ((Object) stackIn_16_0);
                            stackIn_17_1 = (hg) ((Object) stackIn_16_1);
                            stackIn_17_2 = 1;
                            break L9;
                          }
                        }
                        ((mf) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2 != 0, false);
                        param2.field_w.e(var9, var11.e());
                        break L7;
                      }
                      L10: {
                        if (-1 >= (param2.field_p.field_s[param2.field_o] ^ -1)) {
                          break L10;
                        } else {
                          param2.field_w.d(-1);
                          break L10;
                        }
                      }
                      L11: {
                        var11.e(var9);
                        var11.a(param0, param3, -param3 + param1);
                        if (!var11.h()) {
                          break L11;
                        } else {
                          this.field_r.a(var11);
                          break L11;
                        }
                      }
                      if (var12 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                    param2.field_C = param2.field_C + var7_int * param4;
                    break L1;
                  }
                }
              }
            }
            param2.field_w.a(param0, param3, param4);
            if (param5 == -117) {
              break L0;
            } else {
              this.field_m = (nc) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var7);

            stackIn_29_1 = new StringBuilder().append("lh.B(");

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


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final ej b() {
        hg var1_ref = null;
        int var2 = SolKnight.field_L ? 1 : 0;
        do {
            var1_ref = (hg) ((Object) this.field_m.b(-60));
            if (var1_ref == null) {
                if (var2 == 0) {
                    return null;
                }
                return (ej) ((Object) var1_ref.field_w);
            }
        } while (var1_ref.field_w == null);
        return (ej) ((Object) var1_ref.field_w);
    }

    final void a(int param0) {
        int var2;
        hg var3;
        int var4;
        boolean stackIn_6_0 = false;
        var4 = SolKnight.field_L ? 1 : 0;
        this.field_r.a(param0);
        var3 = (hg) ((Object) this.field_m.a((byte) 51));
        L0: while (true) {
          if (var3 != null) {
            if (var4 == 0) {
              stackIn_6_0 = this.field_n.b(var3, -1642423728);
              L1: while (true) {
                L2: {
                  if (stackIn_6_0) {
                    break L2;
                  } else {
                    var2 = param0;
                    L3: while (true) {
                      if (var2 <= var3.field_t) {
                        this.a((byte) -107, var3, var2);
                        var3.field_t = var3.field_t - var2;
                        break L2;
                      } else {
                        this.a((byte) -126, var3, var3.field_t);
                        var2 = var2 - var3.field_t;
                        stackIn_6_0 = this.field_n.a(0, (int[]) null, var2, 100, var3);

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
                var3 = (hg) ((Object) this.field_m.b(-126));
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

    lh(mf param0) {
        this.field_m = new nc();
        this.field_r = new e();
        try {
            this.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = true;
    }
}
