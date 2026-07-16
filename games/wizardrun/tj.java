/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tj extends pe {
    private int field_K;
    static rc field_G;
    static volatile boolean field_F;
    static int field_J;
    boolean field_H;
    private wi field_E;
    static int field_I;

    private final int h(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -660264703) {
          return 75;
        } else {
          L0: {
            if (((tj) this).field_H) {
              if ((Object) (Object) ((tj) this).field_E.f(param0 ^ -660264703) == this) {
                stackOut_5_0 = 256;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_6_0;
        }
    }

    abstract void b(int param0, int param1, int param2);

    boolean a(int param0) {
        if (param0 == 16) {
          ((tj) this).field_K = this.h(-660264703);
          if (((tj) this).field_K == 0) {
            if (((tj) this).field_H) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((tj) this).a(110, ik.field_K + -param1 >> -1705838399, param1, param2, dh.field_a + -param2 >> -1220694655);
        if (param0 != 6154) {
            Object var5 = null;
            boolean discarded$0 = tj.a(-85, (String) null);
        }
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        var4 = wizardrun.field_H;
        try {
          L0: {
            if (vh.field_k.startsWith("win")) {
              L1: {
                if (param0 > 81) {
                  break L1;
                } else {
                  field_F = true;
                  break L1;
                }
              }
              L2: {
                if (param1.startsWith("http://")) {
                  break L2;
                } else {
                  if (!param1.startsWith("https://")) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L3: while (true) {
                if (param1.length() <= var3) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  if (-1 == var2.indexOf((int) param1.charAt(var3))) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0 != 0;
                  } else {
                    var3++;
                    continue L3;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (Exception) (Object) decompiledCaughtException;
          return false;
        }
        return stackIn_19_0 != 0;
    }

    boolean g(int param0) {
        if (param0 != 1) {
            return true;
        }
        int var2 = this.h(-660264703);
        int var3 = -((tj) this).field_K + var2;
        if (!(var3 <= 0)) {
            ((tj) this).field_K = ((tj) this).field_K + (-1 + (var3 - -8)) / 8;
        }
        if (!(-1 >= (var3 ^ -1))) {
            ((tj) this).field_K = ((tj) this).field_K + (1 + (-16 + var3)) / 16;
        }
        if ((((tj) this).field_K ^ -1) != -1) {
            return false;
        }
        if (-1 != (var2 ^ -1)) {
            return false;
        }
        return !((tj) this).field_H ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (-1 != (((tj) this).field_K ^ -1)) {
          if ((((tj) this).field_K ^ -1) <= -257) {
            if (param2 != 0) {
              return;
            } else {
              ((tj) this).b(((tj) this).field_o + param0, -1, ((tj) this).field_l + param3);
              super.a(param0, param1 ^ 0, param2, param3);
              return;
            }
          } else {
            if (ei.field_n != null) {
              if (((tj) this).field_r <= ei.field_n.field_z) {
                if (((tj) this).field_n <= ei.field_n.field_p) {
                  ud.a(ei.field_n, false);
                  ed.d();
                  ((tj) this).b(param1, -1, 0);
                  super.a(-((tj) this).field_o + -param0, 0, param2, -((tj) this).field_l + -param3);
                  bb.b(4);
                  ei.field_n.c(((tj) this).field_o + param0, param3 + ((tj) this).field_l, ((tj) this).field_K);
                  return;
                } else {
                  ei.field_n = new o(((tj) this).field_r, ((tj) this).field_n);
                  ud.a(ei.field_n, false);
                  ed.d();
                  ((tj) this).b(param1, -1, 0);
                  super.a(-((tj) this).field_o + -param0, 0, param2, -((tj) this).field_l + -param3);
                  bb.b(4);
                  ei.field_n.c(((tj) this).field_o + param0, param3 + ((tj) this).field_l, ((tj) this).field_K);
                  return;
                }
              } else {
                ei.field_n = new o(((tj) this).field_r, ((tj) this).field_n);
                ud.a(ei.field_n, false);
                ed.d();
                ((tj) this).b(param1, -1, 0);
                super.a(-((tj) this).field_o + -param0, 0, param2, -((tj) this).field_l + -param3);
                bb.b(4);
                ei.field_n.c(((tj) this).field_o + param0, param3 + ((tj) this).field_l, ((tj) this).field_K);
                return;
              }
            } else {
              ei.field_n = new o(((tj) this).field_r, ((tj) this).field_n);
              ud.a(ei.field_n, false);
              ed.d();
              ((tj) this).b(param1, -1, 0);
              super.a(-((tj) this).field_o + -param0, 0, param2, -((tj) this).field_l + -param3);
              bb.b(4);
              ei.field_n.c(((tj) this).field_o + param0, param3 + ((tj) this).field_l, ((tj) this).field_K);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        Object var6 = null;
        kk.field_yb = true;
        var2 = "tuhstatbut";
        var3 = "rvnadlm";
        var4 = -1L;
        if (param0 != 3088) {
          var6 = null;
          boolean discarded$2 = tj.a(-110, (String) null);
          fa.a(var4, var2, false, var3, param1);
          return;
        } else {
          fa.a(var4, var2, false, var3, param1);
          return;
        }
    }

    public static void d(boolean param0) {
        field_G = null;
        if (!param0) {
            Object var2 = null;
            tj.a(82, (java.applet.Applet) null);
        }
    }

    final static String[] a(String param0, int param1, char param2) {
        int var3 = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = wizardrun.field_H;
        var10 = (CharSequence) (Object) param0;
        var3 = ok.a(param2, var10, (byte) 75);
        var4 = new String[var3 + 1];
        if (param1 != -22710) {
          field_G = null;
          var5 = 0;
          var6 = 0;
          var7 = 0;
          L0: while (true) {
            if (var3 <= var7) {
              var4[var3] = param0.substring(var6);
              return var4;
            } else {
              var8 = var6;
              L1: while (true) {
                if (param2 == param0.charAt(var8)) {
                  int incrementValue$2 = var5;
                  var5++;
                  var4[incrementValue$2] = param0.substring(var6, var8);
                  var6 = var8 - -1;
                  var7++;
                  continue L0;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          }
        } else {
          var5 = 0;
          var6 = 0;
          var7 = 0;
          L2: while (true) {
            if (var3 <= var7) {
              var4[var3] = param0.substring(var6);
              return var4;
            } else {
              var8 = var6;
              L3: while (true) {
                if (param2 == param0.charAt(var8)) {
                  int incrementValue$3 = var5;
                  var5++;
                  var4[incrementValue$3] = param0.substring(var6, var8);
                  var6 = var8 - -1;
                  var7++;
                  continue L2;
                } else {
                  var8++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final ub d(int param0) {
        ub var2 = super.d(param0);
        if (var2 != null) {
            return var2;
        }
        return (ub) this;
    }

    tj(wi param0, int param1, int param2) {
        super(dh.field_a - param1 >> -682606527, -param2 + ik.field_K >> -660264703, param1, param2, (bf) null);
        ((tj) this).field_H = false;
        ((tj) this).field_E = param0;
        ((tj) this).field_K = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = false;
        field_I = 0;
        field_G = new rc();
    }
}
