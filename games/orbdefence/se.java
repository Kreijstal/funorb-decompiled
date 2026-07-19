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
        var6 = OrbDefence.field_D ? 1 : 0;
        var3 = this.field_p >> -369527613;
        var4 = -(this.field_p & 7) + param1;
        var5 = 0;
        this.field_p = this.field_p + param0;
        L0: while (true) {
          if (param0 > var4) {
            incrementValue$1 = var3;
            var3++;
            var5 = var5 + ((sk.field_I[var4] & this.field_j[incrementValue$1]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
            if (var6 == 0) {
              continue L0;
            } else {
              var5 = var5 + (sk.field_I[var4] & this.field_j[var3]);
              return var5;
            }
          } else {
            L1: {
              L2: {
                if (param0 == var4) {
                  break L2;
                } else {
                  var5 = var5 + (this.field_j[var3] >> -param0 + var4 & sk.field_I[param0]);
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = var5 + (sk.field_I[var4] & this.field_j[var3]);
              break L1;
            }
            return var5;
          }
        }
    }

    final int o(int param0) {
        int discarded$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        if (param0 >= -22) {
          discarded$6 = this.h(69, 70);
          fieldTemp$7 = this.field_i;
          this.field_i = this.field_i + 1;
          return this.field_j[fieldTemp$7] + -this.field_o.a(128) & 255;
        } else {
          fieldTemp$8 = this.field_i;
          this.field_i = this.field_i + 1;
          return this.field_j[fieldTemp$8] + -this.field_o.a(128) & 255;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$5 = 0;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var5_int = 6 % ((33 - param0) / 61);
            var6 = 0;
            L1: while (true) {
              if (var6 >= param3) {
                break L0;
              } else {
                fieldTemp$5 = this.field_i;
                this.field_i = this.field_i + 1;
                param2[var6 + param1] = (byte)(this.field_j[fieldTemp$5] + -this.field_o.a(128));
                var6++;
                if (var7 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("se.AB(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
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
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("se.RA(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("se.BB(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
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
