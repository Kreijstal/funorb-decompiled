/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    private String field_a;

    final void a(boolean param0, java.applet.Applet param1) {
        try {
            if (param0) {
                this.field_a = (String) null;
            }
            wg.a("jagex-last-login-method", param1, this.field_a, -26372, 31536000L);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "cd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    cd(String param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "cd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                cd.a(51);
                break L1;
              }
            }
            stackIn_3_0 = this.field_a.equals(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cd.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!vh.c((byte) -93)) {
                            statePc = 3;
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (null == ba.field_f) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (ba.field_f.field_d) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        wl.e((byte) 120);
                        si.field_o.b((byte) -56, new s(si.field_o, cg.field_c));
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var1_int = 63 / ((59 - param0) / 47);
                        si.field_o.a(mb.field_a, mb.field_d, true, true);
                        si.field_o.l(-43);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!ba.a(-1)) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        si.field_o.a(oa.field_H, 121, rd.field_p);
                        if (var2 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var2 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var1), "cd.D(" + param0 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        fk.field_a = false;
        ah.field_h = false;
        qh.a(param0, true);
        ed.field_c = di.field_a;
        ch.field_d = di.field_a;
    }

    final static void a(hl param0, byte param1) {
        int var2_int = 0;
        hl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param0.field_c != null) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      if (-1 != (param0.field_g ^ -1)) {
                        break L4;
                      } else {
                        if (-1 != (param0.field_k ^ -1)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2_int = 0;
                    L5: while (true) {
                      if (var2_int >= ea.field_c) {
                        break L3;
                      } else {
                        var3 = pg.field_e[var2_int];
                        var6 = var3.field_i ^ -1;
                        var5 = -3;
                        if (var4 != 0) {
                          if (var5 == var6) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          L6: {
                            if (var5 != var6) {
                              break L6;
                            } else {
                              if (var3.field_g != param0.field_g) {
                                break L6;
                              } else {
                                if (var3.field_k == param0.field_k) {
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    if (param0.field_l == null) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (param1 == 20) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
              qh.a(param0, 6191);
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("cd.B(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
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

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
