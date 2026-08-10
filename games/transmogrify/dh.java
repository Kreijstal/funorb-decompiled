/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends aj implements df {
    private tc field_z;
    private String[] field_y;
    private lj[] field_C;
    static ti field_B;
    static volatile int field_w;
    static int field_x;

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 17) {
                break L1;
              } else {
                field_B = (ti) null;
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (this.field_y.length <= var6_int) {
                L3: {
                  if (this.field_C[this.field_y.length] == param0) {
                    this.field_z.a((byte) -69);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (this.field_C[var6_int] != param0) {
                    break L4;
                  } else {
                    this.field_z.a(false, this.field_y[var6_int]);
                    break L4;
                  }
                }
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("dh.MA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String[] param0, int param1) {
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
        ek var4 = null;
        int var5 = 0;
        int var6 = 0;
        java.net.URL var7 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_u.g(-1);
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length == 0) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  this.field_y = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= var3_int) {
                      L3: {
                        var4 = new ek(vd.field_h, 0, 1);
                        this.field_C = new lj[var3_int + 1];
                        if (param1 == 17036) {
                          break L3;
                        } else {
                          var7 = (java.net.URL) null;
                          dh.a((java.applet.Applet) null, (byte) -123, (java.net.URL) null);
                          break L3;
                        }
                      }
                      var5 = 0;
                      L4: while (true) {
                        if (var5 >= var3_int) {
                          this.field_C[var3_int] = new lj(nj.field_p, (ma) (this));
                          this.field_C[var3_int].field_q = (ui) ((Object) var4);
                          this.field_C[var3_int].a(-127, 16 * var3_int - -16 + 20, 0, 100, 15);
                          this.a((qg) (this.field_C[var3_int]), (byte) -92);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_C[var5] = new lj(this.field_y[var5], (ma) (this));
                          this.field_C[var5].field_q = (ui) ((Object) var4);
                          this.field_C[var5].field_j = ae.field_c;
                          this.field_C[var5].a(param1 ^ 17099, var5 * 16 + 20, 0, 80, 15);
                          this.a((qg) (this.field_C[var5]), (byte) -125);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_y[var4_int] = ca.a((CharSequence) ((Object) param0[var4_int]), true).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            this.field_y = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("dh.G(");

            if (param0 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, (byte) 121, param3)) {
              if (98 != param0) {
                var5_int = 101 / ((65 - param2) / 55);
                if (99 != param0) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = this.b(param1, 49);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a(2, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("dh.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        java.net.URL var17 = null;
        int[] var18 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param9--;
              if (0 > param9) {
                L2: {
                  if (param2 == 99) {
                    break L2;
                  } else {
                    var17 = (java.net.URL) null;
                    dh.a((java.applet.Applet) null, (byte) -5, (java.net.URL) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                var18 = param3;
                var10 = var18;
                var11 = param5;
                var12 = param4;
                var13 = param6;
                var14 = param8;
                var15 = (16711422 & var18[var11]) >> 1499236065;
                var10[var11] = (vg.c(var14, 33529506) >> 882301777) + (vg.c(16711680, var12 >> -252506815) - -vg.c(65280, var13 >> -120026807) + var15);
                param4 = param4 + param1;
                param5++;
                param8 = param8 + param7;
                param6 = param6 + param0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var10_ref);

            stackIn_8_1 = new StringBuilder().append("dh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void l(int param0) {
        if (param0 != -1) {
            return;
        }
        field_B = null;
    }

    final static java.net.URL a(java.applet.Applet param0, byte param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        int var5 = 0;
        java.net.URL stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (md.field_j == null) {
                break L1;
              } else {
                if (!md.field_j.equals(param0.getParameter("settings"))) {
                  var3 = md.field_j;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (mg.field_e == null) {
                break L2;
              } else {
                if (mg.field_e.equals(param0.getParameter("session"))) {
                  break L2;
                } else {
                  var4 = mg.field_e;
                  break L2;
                }
              }
            }
            var5 = 46 % ((param1 - -42) / 44);
            stackIn_8_0 = fd.a(-1, (String) (var4), 130, param2, (String) (var3));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = var3;

            stackIn_11_1 = new StringBuilder().append("dh.C(");

            if (param0 == null) {
              stackIn_12_0 = stackIn_11_0;
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = stackIn_11_0;
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {

              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {

              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0;
    }

    dh(tc param0) {
        super(0, 0, 0, 0, (ui) null);
        try {
            this.field_z = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = param2 >>> -2040649985;
        if (param0 != 15) {
            dh.l(125);
        }
        return (param2 + var3) / param1 + -var3;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) 121);
        if (!(-1 == (param2 ^ -1))) {
            return;
        }
        int var5 = -1 % ((77 - param3) / 34);
        kg var6 = vd.field_h;
        if (!(null == this.field_y)) {
            var6.a(ae.field_d, param0 - -this.field_p, this.field_n + param1, this.field_l, 20, 16777215, -1, 0, 0, var6.field_t + var6.field_y);
        }
    }

    static {
        field_w = 0;
    }
}
