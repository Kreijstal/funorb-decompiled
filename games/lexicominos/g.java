/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends tj {
    private rl field_l;
    static int field_n;
    static wg field_m;
    static int field_o;

    final sc a(int param0, String param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        sc stackIn_2_0 = null;
        sc stackIn_8_0 = null;
        sc stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                if (!(this.field_l instanceof nd)) {
                  break L1;
                } else {
                  var3 = ((nd) ((Object) this.field_l)).a((byte) -106);
                  if (var3 == null) {
                    break L1;
                  } else {
                    if (var3.b((byte) 124) != rh.field_p) {
                      stackIn_8_0 = ni.field_b;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (!param1.equals(this.field_l.field_u)) {
                  stackIn_12_0 = ni.field_b;
                  break L2;
                } else {
                  stackIn_12_0 = rh.field_p;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = (sc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("g.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public static void e(int param0) {
        field_m = null;
        if (param0 == -17779) {
            return;
        }
        g.f(98);
    }

    final static boolean f(int param0) {
        if (param0 != 256) {
          field_m = (wg) null;
          return gf.a(0, kk.c(param0 ^ -14303));
        } else {
          return gf.a(0, kk.c(param0 ^ -14303));
        }
    }

    final String a(byte param0, String param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(this.field_l instanceof nd)) {
                break L1;
              } else {
                var3 = ((nd) ((Object) this.field_l)).a((byte) 125);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.b((byte) 122) != rh.field_p) {
                      break L2;
                    } else {
                      if (!param1.equals(this.field_l.field_u)) {
                        stackIn_6_0 = re.field_cb;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_8_0 = var3.a((byte) 82);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L3: {
              if (param0 == -126) {
                break L3;
              } else {
                var4 = (String) null;
                this.a(-64, (String) null);
                break L3;
              }
            }
            if (!param1.equals(this.field_l.field_u)) {
              stackIn_14_0 = re.field_cb;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("g.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static void a(int param0, int param1) {
        cc[] var2 = null;
        cc var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        cc var4 = null;
        int var5 = 0;
        cc[] var6 = null;
        Object stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            oc.field_e = param0;
            var6 = th.field_o;
            var2 = var6;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var3 >= var6.length) {
                      break L4;
                    } else {
                      var4 = var6[var3];
                      var2_ref = var4;
                      var2_ref = var4;
                      stackIn_9_0 = null;

                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_9_0 == var4) {
                            break L5;
                          } else {
                            var4.f(param0 * 128 / 256);
                            break L5;
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param1 > 49) {
                    break L2;
                  } else {
                    stackIn_9_0 = null;
                    break L3;
                  }
                }
                field_m = (wg) ((Object) stackIn_9_0);
                break L2;
              }
              var2_ref = th.field_o[9];
              if (!var2_ref.a(false)) {
                var2_ref.c(0);
                wj.field_j.a(var2_ref);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref2), "g.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        nc var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        sj var4 = null;
        nc stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        nc stackOut_4_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = (nc) ((Object) ok.field_b.a(true));
                        if (param1 < -38) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_m = (wg) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var2 == null) {
                            statePc = 6;
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
                        ga.a(var2, param0, 74);
                        stackOut_4_0 = (nc) ((Object) ok.field_b.f(2));
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var3 != 0) {
                            statePc = 7;
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
                        var2 = stackIn_5_0;
                        if (var3 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = il.field_b.a(true);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = (sj) ((Object) stackIn_7_0);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var4 == null) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        uh.a(var4, (byte) -123, param0);
                        var4 = (sj) ((Object) il.field_b.f(2));
                        if (var3 == 0) {
                            statePc = 11;
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
                        return;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var3 == 0) {
                            statePc = 8;
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
                        return;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) var2_ref), "g.K(" + param0 + ',' + param1 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    g(rl param0, rl param1) {
        super(param0);
        try {
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "g.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = 5;
    }
}
