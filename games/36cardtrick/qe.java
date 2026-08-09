/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends g implements cl, qh {
    private bg field_K;
    private hl field_F;
    private dg field_D;
    static de field_J;
    static int field_E;
    static de field_H;
    static int field_I;

    public static void e(byte param0) {
        if (param0 != 73) {
            return;
        }
        field_J = null;
        field_H = null;
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, (byte) -121, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 != 98) {
                if (param1 <= -99) {
                  if (99 == param2) {
                    stackIn_13_0 = this.a(param3, (byte) -28);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  stackIn_9_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.b(-116, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("qe.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    qe(bg param0) {
        super(0, 0, 288, 0, (ci) null);
        String var7 = null;
        int var3 = 0;
        ek var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_K = param0;
            this.field_F = new hl(bj.field_b, (pl) null);
            this.field_F.field_v = (ci) ((Object) new ki());
            var7 = re.a(dd.field_h, new String[]{this.l(1), this.d((byte) -110)}, (byte) -50);
            var3 = 20;
            var4 = new ek(j.field_C, 0, 0, 0, 0, 16777215, -1, 3, 0, j.field_C.field_s, -1, 2147483647, true);
            this.field_D = new dg(var7, var4);
            this.field_D.field_n = "";
            this.field_D.a(ni.field_b, (byte) 126, 0);
            this.field_D.a(ni.field_b, (byte) 98, 1);
            this.field_D.field_k = (pl) (this);
            this.field_D.field_h = -40 + this.field_h;
            this.field_D.b(96, -40 + this.field_h, 26, var3);
            var3 = var3 + (15 + this.field_D.field_q);
            this.b(this.field_D, (byte) 118);
            var5 = 4;
            var6 = 200;
            this.field_F.a(40, var3, var6, 300 - var6 >> 1622253025, true);
            this.field_F.field_k = (pl) (this);
            this.b(this.field_F, (byte) 118);
            this.a(var5 + (55 + var3), 0, 300, 0, true);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "qe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(java.applet.Applet param0, byte param1) {
        try {
            String var2 = null;
            String var3 = null;
            int var4 = 0;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int stackIn_3_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var8 = Main.field_T;
            try {
              L0: {
                if (!rc.field_m) {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      var4 = 75 / ((-12 - param1) / 46);
                      var3 = (String) (vh.a("getcookies", -12151, param0));
                      var5 = rh.a(';', var3, -44);
                      var6 = 0;
                      L2: while (true) {
                        if (var5.length <= var6) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L3: {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                              break L3;
                            } else {
                              if (var5[var6].substring(0, var7).trim().equals(var2)) {
                                stackIn_10_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L5: {
                      if (null == param0.getParameter("tuhstatbut")) {
                        stackIn_17_0 = 0;
                        break L5;
                      } else {
                        stackIn_17_0 = 1;
                        break L5;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_20_0 = (RuntimeException) (var2_ref2);

                stackIn_20_1 = new StringBuilder().append("qe.J(");

                if (param0 == null) {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L6;
                } else {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L6;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_10_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String l(int param0) {
        if (param0 != 1) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6_int = 125 / ((param1 - -62) / 32);
            if (param3 != this.field_F) {
              break L0;
            } else {
              rg.a((byte) 126);
              this.field_K.s(50);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var6);

            stackIn_5_1 = new StringBuilder().append("qe.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param4 + ')');
        }
    }

    private final String d(byte param0) {
        if (param0 != -110) {
            return (String) null;
        }
        return "</col></u>";
    }

    public final void a(int param0, int param1, byte param2, dg param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        dg var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param2 == 26) {
                break L1;
              } else {
                var7 = (dg) null;
                this.a(-56, -104, (byte) -34, (dg) null);
                break L1;
              }
            }
            if (param1 == 0) {
              he.a(param2 + -26, "terms.ws");
              return;
            } else {
              if ((param1 ^ -1) == -2) {
                he.a(param2 ^ 26, "privacy.ws");
                return;
              } else {
                if (param1 != 2) {
                  break L0;
                } else {
                  he.a(0, "conduct.ws");
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("qe.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    static {
        field_J = new de(7, 0, 1, 1);
        field_H = new de(6, 0, 4, 2);
    }
}
