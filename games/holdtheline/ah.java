/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class ah {
    hl field_e;
    static rg field_a;
    static int field_b;
    static gn field_d;
    private hl field_c;

    final static int a(vj param0, byte param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        lb var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            var11 = (lb) (Object) param0;
            var5 = var11.field_r.field_f;
            var6 = var11.field_s.field_f;
            var7 = var11.field_r.field_h;
            var8 = var11.field_s.field_h;
            if (var5 == var6) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                var9 = 27;
                if (var5 > var6) {
                  var10 = var5;
                  var5 = var6;
                  var6 = var10;
                  var10 = var7;
                  var7 = var8;
                  var8 = var10;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param2 <= var5) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              } else {
                if (var6 >= param2) {
                  if ((-var5 + param2) * (-var7 + var8) <= (-var7 + param3) * (-var5 + var6)) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L0;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                } else {
                  return 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("ah.M(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + 78 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    final hl c(byte param0) {
        hl var2 = ((ah) this).field_c;
        if (!(var2 != ((ah) this).field_e)) {
            ((ah) this).field_c = null;
            return null;
        }
        int var3 = 110 % ((32 - param0) / 54);
        ((ah) this).field_c = var2.field_h;
        return var2;
    }

    final static void b() {
        oi.field_f = false;
        aa.field_j = null;
        dg.field_b = null;
        qg.field_b = null;
        pb.field_a = null;
    }

    private final void a(hl param0, byte param1, ah param2) {
        hl var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          var4 = ((ah) this).field_e.field_a;
          ((ah) this).field_e.field_a = param0.field_a;
          param0.field_a.field_h = ((ah) this).field_e;
          if (param0 != ((ah) this).field_e) {
            param0.field_a = param2.field_e.field_a;
            param0.field_a.field_h = param0;
            var4.field_h = param2.field_e;
            param2.field_e.field_a = var4;
            return;
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("ah.I(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          L1: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(-123).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    public static void a() {
        field_a = null;
        field_d = null;
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            field_d = null;
            if (((ah) this).field_e.field_h != ((ah) this).field_e) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ah) this).field_e.field_h != ((ah) this).field_e) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(hl param0, int param1, hl param2) {
        try {
            if (null != param2.field_a) {
                param2.d(0);
            }
            param2.field_h = param0;
            param2.field_a = param0.field_a;
            param2.field_a.field_h = param2;
            param2.field_h.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ah.J(" + (param0 != null ? "{...}" : "null") + ',' + 0 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, hl param1) {
        if (param0 >= -61) {
            return;
        }
        try {
            if (!(param1.field_a == null)) {
                param1.d(0);
            }
            param1.field_h = ((ah) this).field_e;
            param1.field_a = ((ah) this).field_e.field_a;
            param1.field_a.field_h = param1;
            param1.field_h.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ah.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.net.URL a(java.net.URL param0, java.applet.Applet param1, byte param2) {
        Object var3 = null;
        Object var4 = null;
        Object stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (il.field_a == null) {
                break L1;
              } else {
                if (il.field_a.equals((Object) (Object) param1.getParameter("settings"))) {
                  break L1;
                } else {
                  var3 = (Object) (Object) il.field_a;
                  break L1;
                }
              }
            }
            L2: {
              if (null == hg.field_M) {
                break L2;
              } else {
                if (hg.field_M.equals((Object) (Object) param1.getParameter("session"))) {
                  break L2;
                } else {
                  var4 = (Object) (Object) hg.field_M;
                  break L2;
                }
              }
            }
            if (param2 > 6) {
              int discarded$4 = -1;
              int discarded$5 = -118;
              stackOut_9_0 = ab.a((String) var3, (String) var4, param0);
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (java.net.URL) (Object) stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_11_0 = var3;
            stackOut_11_1 = new StringBuilder().append("ah.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final void a(int param0) {
        hl var2 = null;
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        L0: while (true) {
          var2 = ((ah) this).field_e.field_h;
          if (((ah) this).field_e != var2) {
            var2.d(0);
            continue L0;
          } else {
            if (param0 != 29020) {
              field_d = null;
              ((ah) this).field_c = null;
              return;
            } else {
              ((ah) this).field_c = null;
              return;
            }
          }
        }
    }

    final hl d(byte param0) {
        if (param0 != 124) {
            return null;
        }
        hl var2 = ((ah) this).field_e.field_a;
        if (!(((ah) this).field_e != var2)) {
            ((ah) this).field_c = null;
            return null;
        }
        ((ah) this).field_c = var2.field_a;
        return var2;
    }

    final hl c(int param0) {
        hl var2 = null;
        if (param0 != -4140) {
            ((ah) this).field_e = null;
            var2 = ((ah) this).field_c;
            if (!(((ah) this).field_e != var2)) {
                ((ah) this).field_c = null;
                return null;
            }
            ((ah) this).field_c = var2.field_a;
            return var2;
        }
        var2 = ((ah) this).field_c;
        if (!(((ah) this).field_e != var2)) {
            ((ah) this).field_c = null;
            return null;
        }
        ((ah) this).field_c = var2.field_a;
        return var2;
    }

    final hl a(byte param0) {
        hl var2 = null;
        if (param0 == 74) {
          var2 = ((ah) this).field_e.field_a;
          if (((ah) this).field_e == var2) {
            return null;
          } else {
            var2.d(0);
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, ah param1) {
        try {
            if (param0 != -30510) {
                field_b = -18;
            }
            this.a(((ah) this).field_e.field_h, (byte) -123, param1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ah.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(hl param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0.field_a != null) {
                param0.d(0);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_h = ((ah) this).field_e.field_h;
            param0.field_a = ((ah) this).field_e;
            param0.field_a.field_h = param0;
            param0.field_h.field_a = param0;
            if (!param1) {
              break L0;
            } else {
              ((ah) this).field_e = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ah.P(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final hl b(byte param0) {
        hl var2 = null;
        var2 = ((ah) this).field_e.field_h;
        if (param0 > 84) {
          if (((ah) this).field_e == var2) {
            ((ah) this).field_c = null;
            return null;
          } else {
            ((ah) this).field_c = var2.field_h;
            return var2;
          }
        } else {
          int discarded$5 = 1;
          ah.a();
          if (((ah) this).field_e == var2) {
            ((ah) this).field_c = null;
            return null;
          } else {
            ((ah) this).field_c = var2.field_h;
            return var2;
          }
        }
    }

    public ah() {
        ((ah) this).field_e = new hl();
        ((ah) this).field_e.field_a = ((ah) this).field_e;
        ((ah) this).field_e.field_h = ((ah) this).field_e;
    }

    static {
    }
}
