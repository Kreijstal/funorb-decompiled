/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg extends ii implements pf, vg, mg {
    static int[] field_P;
    private uh field_K;
    gi field_W;
    private uh field_U;
    private ck field_V;
    private uh field_S;
    static eh[] field_M;
    private rb field_T;
    private uh field_R;
    private uh field_L;
    private uh field_O;
    private ck field_N;
    private bh field_Q;

    final static boolean i(byte param0) {
        if (param0 > -107) {
            field_P = (int[]) null;
        }
        return om.a(m.c(true), 2);
    }

    private final String j(byte param0) {
        if (param0 != -115) {
            return (String) null;
        }
        return "</col></u>";
    }

    private final int a(String param0, lm param1, int param2, String param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7_int = -26 / ((param2 - -76) / 46);
            stackIn_1_0 = this.a(101, param5, param0, param3, param4, param1, 35);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("rg.R(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (this.field_V == param0) {
                li.c(param1 + 218);
                break L1;
              } else {
                if (this.field_N == param0) {
                  discarded$1 = this.f((byte) -124);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == 98) {
                break L2;
              } else {
                this.field_W = (gi) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("rg.FA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void h(byte param0) {
        field_M = null;
        field_P = null;
        if (param0 != -53) {
            field_M = (eh[]) null;
        }
    }

    private final int a(int param0, String param1, lm param2, int param3, int param4) {
        dg var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new dg(20, param3, 120 - -param4, 25, param2, false, 120, param0, lp.field_C, 16777215, param1);
            this.b((byte) -54, var6);
            stackIn_1_0 = var6.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6_ref);

            stackIn_4_1 = new StringBuilder().append("rg.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, ec param1, int param2, int param3, int param4) {
        String var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              param1.a(6, 12);
              param1.i(17, -119);
              param1.i(param2, -90);
              param1.i(param0, -95);
              if (param3 <= 4) {
                var6 = (String) null;
                rg.a(62, (String) null);
                param1.a(6, param4);
                break L1;
              } else {
                param1.a(6, param4);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("rg.S(").append(param0).append(',');

            if (param1 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(int param0, bh param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param0 != 0) {
                if (param0 == 1) {
                  lk.a("privacy.ws", (byte) 58);
                  break L1;
                } else {
                  if (param0 == 2) {
                    lk.a("conduct.ws", (byte) 58);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                lk.a("terms.ws", (byte) 58);
                break L1;
              }
            }
            L2: {
              if (param2 == 126) {
                break L2;
              } else {
                this.field_K = (uh) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("rg.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(String param0, int param1, int param2, lm param3, int param4) {
        RuntimeException var6 = null;
        ng var7 = null;
        dg var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = new dg(20, param2, param1 + 120, 25, param3, false, 120, 3, lp.field_C, 16777215, param0);
            this.b((byte) -117, var8);
            var7 = new ng(((qn) ((Object) param3)).a(-87));
            this.b((byte) -126, var7);
            var7.b(0, 15, var8.field_v - -(var8.field_s - 15 >> -95358687), param4 + var8.field_q - -var8.field_x, 15);
            stackIn_1_0 = var8.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6);

            stackIn_4_1 = new StringBuilder().append("rg.G(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(int param0, int param1, String param2, String param3, int param4, lm param5, int param6) {
        RuntimeException var8 = null;
        tn var9 = null;
        int var10 = 0;
        dg var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var11 = new dg(20, param1, param4 + 120, 25, param5, false, 120, 3, lp.field_C, 16777215, param2);
            this.b((byte) -119, var11);
            var10 = -18 % ((param0 - -13) / 54);
            var9 = new tn(((qn) ((Object) param5)).a(-83), param3, 126, param1 + var11.field_s, 50 + param4, param6);
            var9.field_n = (pg) (this);
            this.b((byte) -60, var9);
            stackIn_1_0 = var9.field_s + var11.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("rg.AA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    private final boolean b(boolean param0) {
        bh var3;
        L0: {
          if (param0) {
            break L0;
          } else {
            var3 = (bh) null;
            this.a(31, (bh) null, -50, -67);
            break L0;
          }
        }
        L1: {
          if (!this.a(23786, (qn) (this.field_R))) {
            break L1;
          } else {
            if (!this.a(23786, (qn) (this.field_O))) {
              break L1;
            } else {
              if (!this.a(23786, (qn) (this.field_U))) {
                break L1;
              } else {
                if (!this.a(23786, (qn) (this.field_K))) {
                  break L1;
                } else {
                  if (!this.a(23786, (qn) (this.field_L))) {
                    break L1;
                  } else {
                    if (this.a(23786, (qn) (this.field_S))) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    private final boolean f(byte param0) {
        if (!this.b(true)) {
            return false;
        }
        int var2 = -1;
        if (param0 != -124) {
            this.field_T = (rb) null;
        }
        try {
            var2 = Integer.parseInt(this.field_S.field_w);
        } catch (NumberFormatException numberFormatException) {
        }
        return td.a(this.field_K.field_w, this.field_T.field_E, true, this.field_R.field_w, (rg) (this), var2, this.field_O.field_w);
    }

    final static void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        ec var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 15) {
                break L1;
              } else {
                var3 = (ec) null;
                rg.a(65, (ec) null, -49, -86, -120);
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

            stackIn_5_1 = new StringBuilder().append("rg.T(").append(param0).append(',');

            if (param1 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final String g(byte param0) {
        if (param0 > -17) {
            ec var3 = (ec) null;
            rg.a(76, (ec) null, -91, 62, -13);
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(byte param0, String param1) {
        int discarded$0 = 0;
        uh var3 = null;
        String var4 = null;
        try {
            if (param0 > -26) {
                lm var5 = (lm) null;
                discarded$0 = this.a((String) null, 104, -13, (lm) null, -83);
            }
            var3 = this.field_R;
            var4 = param1;
            ((rm) ((Object) var3)).a(var4, false, (byte) 91);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "rg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void i(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var1_int = sn.field_c.length;
            r.field_b = new int[var1_int];
            ud.field_w = new int[var1_int];
            var2 = 0;
            L1: while (true) {
              if (var2 >= var1_int) {
                var3 = -33 / ((param0 - -41) / 61);
                break L0;
              } else {
                var8 = sn.field_c[var2].field_B;
                var7 = var8;
                var3_ref_int__ = var7;
                var4 = sn.field_c[var2].field_y;
                var5 = -1 + var8.length;
                L2: while (true) {
                  L3: {
                    if (0 > var5) {
                      break L3;
                    } else {
                      if (-16776961 != (var8[var5] ^ -1)) {
                        var5--;
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var8[var5] = 0;
                  var3_ref_int__[-1 + var5] = 0;
                  var3_ref_int__[-var4 + var5] = 0;
                  var3_ref_int__[-1 + -var4 + var5] = 0;
                  ud.field_w[var2] = sn.field_c[var2].field_w - -(var5 / var4) - 1;
                  r.field_b[var2] = -1 + var5 % var4 + sn.field_c[var2].field_A;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "rg.F(" + param0 + ')');
        }
    }

    public final void a(int param0) {
        String discarded$0 = null;
        ((kh) ((Object) this.field_R.a(-115))).e(true);
        if (param0 <= 121) {
            discarded$0 = this.g((byte) 69);
        }
    }

    public rg() {
        super(0, 0, 496, 0, (ca) null);
        this.field_R = new uh("", (pg) null, 12);
        this.field_O = new uh("", (pg) null, 100);
        this.field_U = new uh("", (pg) null, 100);
        this.field_K = new uh("", (pg) null, 20);
        this.field_L = new uh("", (pg) null, 20);
        this.field_S = new uh("", (pg) null, 3);
        int var1 = 1;
        this.field_T = new rb("", (pg) null, var1 != 0);
        this.field_N = new ck(ef.field_a, (pg) null);
        this.field_V = new ck(pp.field_I, (pg) null);
        this.field_R.field_i = un.field_d;
        this.field_O.field_i = lk.field_Q;
        this.field_U.field_i = bk.field_c;
        this.field_K.field_i = ce.field_t;
        this.field_L.field_i = lm.field_p;
        this.field_S.field_i = vk.field_h;
        this.field_T.field_i = sa.field_h;
        this.field_R.a(new kh(this.field_R), 10508);
        this.field_O.a(new qm(this.field_O), 10508);
        this.field_U.a(new ga(this.field_U, this.field_O), 10508);
        this.field_K.a(new vo(this.field_K, this.field_R, this.field_O), 10508);
        this.field_L.a(new be(this.field_L, this.field_K), 10508);
        this.field_S.a(new he(this.field_S), 10508);
        this.field_N.field_B = false;
        this.field_N.field_o = (ca) ((Object) new na());
        this.field_V.field_o = (ca) ((Object) new oa());
        this.field_R.field_o = (ca) ((Object) new mc(10000536));
        mc dupTemp$0 = new mc(10000536);
        this.field_U.field_o = (ca) ((Object) dupTemp$0);
        this.field_O.field_o = (ca) ((Object) dupTemp$0);
        this.field_S.field_o = (ca) ((Object) new mc(10000536));
        this.field_T.field_o = (ca) ((Object) new dk());
        ic dupTemp$1 = new ic(10000536);
        this.field_L.field_o = (ca) ((Object) dupTemp$1);
        this.field_K.field_o = (ca) ((Object) dupTemp$1);
        String var2 = jk.a(new String[]{this.g((byte) -47), this.j((byte) -115)}, ae.field_h, 30496);
        int var3 = 20;
        var3 = var3 + this.a(3, mp.field_b, this.field_O, var3, 170);
        var3 = var3 + (this.a(-96, var3, hp.field_a, "", 170, this.field_U, 20) + 5);
        var3 = var3 + this.a(3, fk.field_r, this.field_K, var3, 170);
        var3 = var3 + (5 + this.a(qj.field_a, this.field_L, -126, td.field_b, 170, var3));
        var3 = var3 + (5 + this.a(wf.field_B, this.field_R, -123, an.field_z, 170, var3));
        var3 = var3 + this.a(fl.field_o, 170, var3, this.field_S, 3);
        dg var4 = new dg(46, var3, -90 + this.field_x, 25, this.field_T, true, this.field_x + -120, 5, ta.field_e, 11579568, lf.field_q);
        this.b((byte) -117, var4);
        var3 = var3 + var4.field_s;
        hh var5 = new hh(lp.field_C, 0, 0, 0, 0, 16777215, -1, 0, 0, lp.field_C.field_H, -1, 2147483647, true);
        this.field_Q = new bh(var2, var5);
        this.field_Q.field_i = "";
        this.field_Q.a(8, 0, kn.field_d);
        this.field_Q.a(8, 1, kn.field_d);
        this.field_Q.field_n = (pg) (this);
        this.field_Q.a(46, (byte) -70, -90 + this.field_x, var3);
        var3 = var3 + (15 + this.field_Q.field_s);
        this.b((byte) -46, this.field_Q);
        int var6 = 4;
        int var7 = 200;
        this.field_N.b(0, var7, var3, -var7 + 496 >> 910236609, 40);
        this.field_V.b(0, 60, var3 - -15, var6 + 3, 40);
        this.field_V.field_n = (pg) (this);
        this.field_N.field_n = (pg) (this);
        this.b((byte) -84, this.field_N);
        this.b((byte) -73, this.field_V);
        this.field_W = new gi((mg) (this));
        this.field_W.b(0, -this.field_R.field_q + (this.field_x + (-this.field_R.field_x - 60)), 20 + this.field_R.field_v, this.field_R.field_q - -this.field_R.field_x - -60, 150);
        this.b((byte) -88, this.field_W);
        this.b(0, 496, 0, 0, 55 + var3 + var6);
    }

    final void a(int param0, int param1, lm param2, boolean param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_N.field_B = this.b(param3);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "rg.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        qn var6 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, (byte) 112)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param2 ^ -1)) {
                L1: {
                  if (param3 >= 55) {
                    break L1;
                  } else {
                    var6 = (qn) null;
                    discarded$1 = this.a(108, (qn) null);
                    break L1;
                  }
                }
                if (-100 == (param2 ^ -1)) {
                  stackIn_12_0 = this.a((byte) -5, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.a(param0, (byte) 71);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("rg.W(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    private final boolean a(int param0, qn param1) {
        dp var3 = null;
        RuntimeException var3_ref = null;
        od var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param1.a(param0 + -23901);
            if (var3 != null) {
              L1: {
                var4 = var3.a((byte) -93);
                if (param0 == 23786) {
                  break L1;
                } else {
                  this.field_S = (uh) null;
                  break L1;
                }
              }
              if (pd.field_J == var4) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (ub.field_s == var4) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var4 != hd.field_g) {
                    stackIn_17_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_15_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("rg.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L2;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0 != 0;
              } else {
                return stackIn_17_0 != 0;
              }
            }
          }
        }
    }

    static {
        field_P = new int[]{197379, 768, 771, 197376, 196611};
    }
}
