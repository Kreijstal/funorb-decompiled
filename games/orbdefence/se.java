/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends mg {
    private int field_p;
    private re field_o;
    static String field_n;

    final void m(int param0) {
        this.field_i = (param0 + this.field_p) / 8;
    }

    final int h(int param0, int param1) {
        int incrementValue$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = OrbDefence.field_D ? 1 : 0;
                    var3 = this.field_p >> -369527613;
                    var4 = -(this.field_p & 7) + param1;
                    var5 = 0;
                    this.field_p = this.field_p + param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param0 > var4) {
                        statePc = 6;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (param0 == var4) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var5 = var5 + (this.field_j[var3] >> -param0 + var4 & sk.field_I[param0]);
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var5 = var5 + (sk.field_I[var4] & this.field_j[var3]);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    return var5;
                }
                case 6: {
                    incrementValue$1 = var3;
                    var3++;
                    var5 = var5 + ((sk.field_I[var4] & this.field_j[incrementValue$1]) << -var4 + param0);
                    param0 = param0 - var4;
                    var4 = 8;
                    if (var6 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var5 = var5 + (sk.field_I[var4] & this.field_j[var3]);
                    return var5;
                }
                case 8: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (param0 == var4) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5 = var5 + (this.field_j[var3] >> -param0 + var4 & sk.field_I[param0]);
                    if (var6 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var5 = var5 + (sk.field_I[var4] & this.field_j[var3]);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int o(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param0 >= -22) {
          this.h(69, 70);
          fieldTemp$2 = this.field_i;
          this.field_i = this.field_i + 1;
          return this.field_j[fieldTemp$2] + -this.field_o.a(128) & 255;
        } else {
          fieldTemp$3 = this.field_i;
          this.field_i = this.field_i + 1;
          return this.field_j[fieldTemp$3] + -this.field_o.a(128) & 255;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$1 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
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
                        var5_int = 6 % ((33 - param0) / 61);
                        var6 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6 >= param3) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        fieldTemp$1 = this.field_i;
                        this.field_i = this.field_i + 1;
                        param2[var6 + param1] = (byte)(this.field_j[fieldTemp$1] + -this.field_o.a(128));
                        var6++;
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_10_0 = (RuntimeException) (var5);
                    stackIn_9_0 = stackIn_10_0;
                    stackIn_10_1 = new StringBuilder().append("se.AB(").append(param0).append(',').append(param1).append(',');
                    stackIn_9_1 = stackIn_10_1;
                    if (param2 == null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_11_2 = "{...}";
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void e(boolean param0) {
        field_n = null;
        if (param0) {
            String var2 = (String) null;
            se.a((String) null, (byte) -75, 110);
        }
    }

    final void i(int param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)(this.field_o.a(128) + param0);
        int var3 = -34 / ((21 - param1) / 58);
    }

    final static void a(gj param0, int param1, int param2) {
        se var3 = null;
        try {
            if (param2 >= -37) {
                field_n = (String) null;
            }
            var3 = uk.field_b;
            var3.i(param1, -116);
            var3.a(5, -9);
            var3.a(0, -30);
            var3.b((byte) -60, param0.field_o);
            var3.a(param0.field_m, -4);
            var3.a(param0.field_n, -79);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "se.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void n(int param0) {
        this.field_p = this.field_i * 8;
        if (param0 != 9471) {
            this.field_o = (re) null;
        }
    }

    final static void a(String param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              oe.field_p = false;
              ca.field_b = false;
              if (oj.field_q == null) {
                break L1;
              } else {
                if (oj.field_q.field_A) {
                  L2: {
                    if (param2 != 8) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (vh.field_j) {
                            break L4;
                          } else {
                            param0 = ii.field_e;
                            if (!OrbDefence.field_D) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        param0 = km.field_b;
                        break L3;
                      }
                      param2 = 2;
                      ig.field_ib.a(127, vh.field_k);
                      break L2;
                    }
                  }
                  L5: {
                    var3_int = 1;
                    if ((param2 ^ -1) != -11) {
                      break L5;
                    } else {
                      var3_int = 0;
                      dc.a((byte) -108);
                      break L5;
                    }
                  }
                  L6: {
                    if (var3_int == 0) {
                      break L6;
                    } else {
                      L7: {
                        if (ca.field_b) {
                          param0 = t.a(-415993727, new String[]{param0}, kg.field_g);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (jc.field_j) {
                          param0 = mh.field_f;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      oj.field_q.a(-92, param2, param0);
                      break L6;
                    }
                  }
                  if (256 == param2) {
                    break L1;
                  } else {
                    if (param2 != 10) {
                      if (vh.field_j) {
                        break L1;
                      } else {
                        ig.field_ib.m(-114);
                        break L1;
                      }
                    } else {
                      var3_int = -102 % ((param1 - -27) / 52);
                      return;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            var3_int = -102 % ((param1 - -27) / 52);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("se.RA(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    se(byte[] param0) {
        super(param0);
    }

    final void b(int[] param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_o = new re(param0);
              if (param1 == 3777) {
                break L1;
              } else {
                this.field_o = (re) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("se.BB(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    se(int param0) {
        super(param0);
    }

    static {
        field_n = "From only <%0>/month";
    }
}
