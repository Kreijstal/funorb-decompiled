/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends gb implements n {
    private eb[] field_L;
    private rg field_G;
    static String field_H;
    static jj field_F;
    static int field_J;
    static nb field_K;
    private String[] field_I;

    am(rg param0) {
        super(0, 0, 0, 0, (cj) null);
        try {
            this.field_G = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "am.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(byte param0) {
        field_F = null;
        int var1 = 77 / ((param0 - 7) / 33);
        field_H = null;
        field_K = null;
    }

    final static void a(fa param0, boolean param1, fa param2, fa param3, byte param4) {
        try {
            vc.field_a = gl.b("", 20);
            vc.field_a.a(false, param4 + 87);
            if (param4 != -22) {
                java.awt.Canvas var6 = (java.awt.Canvas) null;
                am.a((byte) 119, (java.awt.Canvas) null);
            }
            gi.a(param3, param2, param0, param4 + -2018);
            nd.c((byte) -11);
            qe.field_f = og.field_a;
            pe.field_a = og.field_a;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "am.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (var6_int >= this.field_I.length) {
                L2: {
                  if (this.field_L[this.field_I.length] != param0) {
                    break L2;
                  } else {
                    this.field_G.a(50);
                    break L2;
                  }
                }
                var6_int = 35 % ((-5 - param4) / 57);
                break L0;
              } else {
                L3: {
                  if (this.field_L[var6_int] == param0) {
                    this.field_G.a(this.field_I[var6_int], 72);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("am.I(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void g(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param0 == -3) {
                break L1;
              } else {
                field_K = (nb) null;
                break L1;
              }
            }
            var5 = fc.field_e;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1_ref), "am.A(" + param0 + ')');
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        int var2_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              hk.a((java.awt.Component) ((Object) param1), (byte) 93);
              ei.a((java.awt.Component) ((Object) param1), -24289);
              var2_int = -55 / ((param0 - -23) / 48);
              if (null != lk.field_d) {
                lk.field_d.a(0, (java.awt.Component) ((Object) param1));
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("am.J(").append(param0).append(',');

            if (param1 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final void a(int param0, String[] param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        qh var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              this.field_C.c(21480);
              if (param1 == null) {
                break L1;
              } else {
                if (0 != param1.length) {
                  var3_int = param1.length;
                  this.field_I = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= var3_int) {
                      L3: {
                        if (param0 == -11678) {
                          break L3;
                        } else {
                          field_F = (jj) null;
                          break L3;
                        }
                      }
                      var4 = new qh(qk.field_e, 0, 1);
                      this.field_L = new eb[var3_int + 1];
                      var5 = 0;
                      L4: while (true) {
                        if (var3_int <= var5) {
                          this.field_L[var3_int] = new eb(re.field_d, (sc) (this));
                          this.field_L[var3_int].field_l = (cj) ((Object) var4);
                          this.field_L[var3_int].a(var3_int * 16 - -16 + 20, (byte) 127, 100, 0, 15);
                          this.b((byte) 95, this.field_L[var3_int]);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_L[var5] = new eb(this.field_I[var5], (sc) (this));
                          this.field_L[var5].field_l = (cj) ((Object) var4);
                          this.field_L[var5].field_x = g.field_ab;
                          this.field_L[var5].a(16 * var5 + 20, (byte) 117, 80, 0, 15);
                          this.b((byte) 95, this.field_L[var5]);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_I[var4_int] = tj.a((CharSequence) ((Object) param1[var4_int]), sl.a(param0, -11664)).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            this.field_I = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("am.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2 ^ 0, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 == 98) {
                stackIn_7_0 = this.a(48, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 == (param3 ^ -1)) {
                  stackIn_11_0 = this.a(param1, (byte) 86);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param2 == 30) {
                    stackIn_15_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    field_K = (nb) null;
                    return false;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("am.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L1;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_15_0 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 > -106) {
            field_J = -26;
        }
        super.a(param0, -116, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        pk var5 = qk.field_e;
        if (null != this.field_I) {
            var5.a(tb.field_l, this.field_w + param0, this.field_u + param3, this.field_p, 20, 16777215, -1, 0, 0, var5.field_p + var5.field_s);
        }
    }

    final static boolean a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        fa var5 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var5 = (fa) null;
                am.a((fa) null, false, (fa) null, (fa) null, (byte) 59);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (param0.length() <= var2_int) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var3 = param0.charAt(var2_int);
                  if (nd.a((char) var3, 127)) {
                    break L3;
                  } else {
                    if (!gb.a((byte) 41, (char) var3)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("am.L(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    static {
        field_H = "    Blocking Terrain";
        field_K = null;
    }
}
