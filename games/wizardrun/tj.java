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
        return !((tj) this).field_H ? 0 : (Object) (Object) ((tj) this).field_E.f(0) != this ? 0 : 256;
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
        ((tj) this).a(110, ik.field_K + -param1 >> 1, param1, param2, dh.field_a + -param2 >> 1);
        if (param0 != 6154) {
            Object var5 = null;
            boolean discarded$0 = tj.a(-85, (String) null);
        }
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = wizardrun.field_H;
        try {
          try {
            if (vh.field_k.startsWith("win")) {
              L0: {
                if (param0 > 81) {
                  break L0;
                } else {
                  field_F = true;
                  break L0;
                }
              }
              L1: {
                if (param1.startsWith("http://")) {
                  break L1;
                } else {
                  if (!param1.startsWith("https://")) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L2: while (true) {
                if (param1.length() <= var3) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0 != 0;
                } else {
                  if (-1 == var2.indexOf((int) param1.charAt(var3))) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0 != 0;
                  } else {
                    var3++;
                    continue L2;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            return stackIn_21_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref2;
            stackOut_22_1 = new StringBuilder().append("tj.CB(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
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
        if (!(var3 >= 0)) {
            ((tj) this).field_K = ((tj) this).field_K + (1 + (-16 + var3)) / 16;
        }
        if (((tj) this).field_K != 0) {
            return false;
        }
        if (var2 != 0) {
            return false;
        }
        return !((tj) this).field_H ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (((tj) this).field_K != 0) {
          if (((tj) this).field_K >= 256) {
            if (param2 != 0) {
              return;
            } else {
              ((tj) this).b(((tj) this).field_o + param0, -1, ((tj) this).field_l + param3);
              super.a(param0, param1, param2, param3);
              return;
            }
          } else {
            if (ei.field_n != null) {
              if (((tj) this).field_r <= ei.field_n.field_z) {
                if (((tj) this).field_n <= ei.field_n.field_p) {
                  int discarded$8 = 0;
                  ud.a(ei.field_n);
                  ed.d();
                  ((tj) this).b(param1, -1, 0);
                  super.a(-((tj) this).field_o + -param0, 0, param2, -((tj) this).field_l + -param3);
                  int discarded$9 = 4;
                  bb.b();
                  ei.field_n.c(((tj) this).field_o + param0, param3 + ((tj) this).field_l, ((tj) this).field_K);
                  return;
                } else {
                  ei.field_n = new o(((tj) this).field_r, ((tj) this).field_n);
                  int discarded$10 = 0;
                  ud.a(ei.field_n);
                  ed.d();
                  ((tj) this).b(param1, -1, 0);
                  super.a(-((tj) this).field_o + -param0, 0, param2, -((tj) this).field_l + -param3);
                  int discarded$11 = 4;
                  bb.b();
                  ei.field_n.c(((tj) this).field_o + param0, param3 + ((tj) this).field_l, ((tj) this).field_K);
                  return;
                }
              } else {
                ei.field_n = new o(((tj) this).field_r, ((tj) this).field_n);
                int discarded$12 = 0;
                ud.a(ei.field_n);
                ed.d();
                ((tj) this).b(param1, -1, 0);
                super.a(-((tj) this).field_o + -param0, 0, param2, -((tj) this).field_l + -param3);
                int discarded$13 = 4;
                bb.b();
                ei.field_n.c(((tj) this).field_o + param0, param3 + ((tj) this).field_l, ((tj) this).field_K);
                return;
              }
            } else {
              ei.field_n = new o(((tj) this).field_r, ((tj) this).field_n);
              int discarded$14 = 0;
              ud.a(ei.field_n);
              ed.d();
              ((tj) this).b(param1, -1, 0);
              super.a(-((tj) this).field_o + -param0, 0, param2, -((tj) this).field_l + -param3);
              int discarded$15 = 4;
              bb.b();
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
        try {
            kk.field_yb = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            fa.a(var4, var2, false, var3, param1);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "tj.WA(" + 3088 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void d() {
        field_G = null;
    }

    final static String[] a(String param0, int param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var9 = wizardrun.field_H;
        try {
          L0: {
            var10 = (CharSequence) (Object) param0;
            int discarded$4 = 75;
            var3_int = ok.a(param2, var10);
            var4 = new String[var3_int + 1];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var3_int <= var7) {
                var4[var3_int] = param0.substring(var6);
                stackOut_7_0 = (String[]) var4;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var8 = var6;
                L2: while (true) {
                  if (param2 == param0.charAt(var8)) {
                    int incrementValue$5 = var5;
                    var5++;
                    var4[incrementValue$5] = param0.substring(var6, var8);
                    var6 = var8 - -1;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("tj.DB(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + -22710 + 44 + param2 + 41);
        }
        return stackIn_8_0;
    }

    final ub d(int param0) {
        ub var2 = super.d(param0);
        if (var2 != null) {
            return var2;
        }
        return (ub) this;
    }

    tj(wi param0, int param1, int param2) {
        super(dh.field_a - param1 >> 1, -param2 + ik.field_K >> 1, param1, param2, (bf) null);
        try {
            ((tj) this).field_H = false;
            ((tj) this).field_E = param0;
            ((tj) this).field_K = 0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "tj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
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
