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
        int incrementValue$0 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        int var3 = this.field_p >> -369527613;
        int var4 = -(this.field_p & 7) + param1;
        int var5 = 0;
        this.field_p = this.field_p + param0;
        while (param0 > var4) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((sk.field_I[var4] & this.field_j[incrementValue$0]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 != var4) {
            var5 = var5 + (this.field_j[var3] >> -param0 + var4 & sk.field_I[param0]);
        } else {
            var5 = var5 + (sk.field_I[var4] & this.field_j[var3]);
        }
        return var5;
    }

    final int o(int param0) {
        int fieldTemp$0 = 0;
        if (param0 >= -22) {
            this.h(69, 70);
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            return this.field_j[fieldTemp$0] + -this.field_o.a(128) & 255;
        }
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        return this.field_j[fieldTemp$1] + -this.field_o.a(128) & 255;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var5_int = 6 % ((33 - param0) / 61);
            var6 = 0;
            L1: while (true) {
              if (var6 >= param3) {
                break L0;
              } else {
                fieldTemp$2 = this.field_i;
                this.field_i = this.field_i + 1;
                param2[var6 + param1] = (byte)(this.field_j[fieldTemp$2] + -this.field_o.a(128));
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("se.AB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
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
                        if (vh.field_j) {
                          param0 = km.field_b;
                          break L3;
                        } else {
                          param0 = ii.field_e;
                          break L3;
                        }
                      }
                      param2 = 2;
                      ig.field_ib.a(127, vh.field_k);
                      break L2;
                    }
                  }
                  L4: {
                    var3_int = 1;
                    if ((param2 ^ -1) != -11) {
                      break L4;
                    } else {
                      var3_int = 0;
                      dc.a((byte) -108);
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (ca.field_b) {
                          param0 = t.a(-415993727, new String[]{param0}, kg.field_g);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (jc.field_j) {
                          param0 = mh.field_f;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      oj.field_q.a(-92, param2, param0);
                      break L5;
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
          L8: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("se.RA(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    se(byte[] param0) {
        super(param0);
    }

    final void b(int[] param0, int param1) {
        try {
            this.field_o = new re(param0);
            if (param1 != 3777) {
                this.field_o = (re) null;
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "se.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    se(int param0) {
        super(param0);
    }

    static {
        field_n = "From only <%0>/month";
    }
}
