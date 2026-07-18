/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static qr field_g;
    oh field_h;
    static volatile boolean field_c;
    static String field_f;
    static long field_e;
    private oh field_b;
    static bi field_d;
    static bi[] field_a;

    final boolean g(int param0) {
        int var2 = -83 / ((param0 - -24) / 49);
        return ((pf) this).field_h == ((pf) this).field_h.field_f ? true : false;
    }

    final int a(byte param0, oh[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        oh var5 = null;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = -101 / ((param0 - -4) / 48);
            var3_int = 0;
            var5 = ((pf) this).field_h.field_f;
            L1: while (true) {
              if (((pf) this).field_h == var5) {
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                int incrementValue$2 = var3_int;
                var3_int++;
                param1[incrementValue$2] = (oh) (Object) param1;
                var5 = var5.field_f;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("pf.H(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    final static void a(int param0, boolean param1) {
        fc var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        ve var3 = rq.a(true, param0, param1);
        if (!(var3 == null)) {
            hp.field_m.a(false, -16661);
            var4 = hp.field_m;
            var5_ref_String = qc.field_u;
            var4.field_j.a(1, 5, var5_ref_String);
            var4 = hp.field_m;
            var5 = nh.field_p;
            var6 = td.field_P;
            var4.field_j.b(0, 0, 0, var5, var6);
        }
        di.a(-7904, param1, param0);
    }

    final oh f(int param0) {
        oh var2 = ((pf) this).field_h.field_e;
        if (var2 == ((pf) this).field_h) {
            ((pf) this).field_b = null;
            return null;
        }
        ((pf) this).field_b = var2.field_e;
        if (param0 != 3725) {
            return null;
        }
        return var2;
    }

    final oh b(int param0) {
        oh var2 = ((pf) this).field_b;
        if (!(((pf) this).field_h != var2)) {
            ((pf) this).field_b = null;
            return null;
        }
        ((pf) this).field_b = var2.field_e;
        if (param0 >= -120) {
            field_a = null;
        }
        return var2;
    }

    final int e(int param0) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = param0;
        oh var3 = ((pf) this).field_h.field_f;
        while (var3 != ((pf) this).field_h) {
            var2++;
            var3 = var3.field_f;
        }
        return var2;
    }

    final oh b(oh param0, int param1) {
        oh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        oh stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        oh stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -9189) {
                break L1;
              } else {
                ((pf) this).a(-87);
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                var3 = ((pf) this).field_h.field_f;
                break L2;
              } else {
                var3 = param0;
                break L2;
              }
            }
            if (((pf) this).field_h != var3) {
              ((pf) this).field_b = var3.field_f;
              stackOut_8_0 = (oh) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((pf) this).field_b = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (oh) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("pf.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final oh h(int param0) {
        oh var2 = ((pf) this).field_h.field_f;
        if (var2 == ((pf) this).field_h) {
            return null;
        }
        var2.b((byte) -104);
        if (param0 <= 25) {
            return null;
        }
        return var2;
    }

    public static void c() {
        field_g = null;
        field_f = null;
        field_d = null;
        field_a = null;
    }

    final oh d(int param0) {
        oh var2 = ((pf) this).field_h.field_f;
        if (param0 != 0) {
            field_f = null;
        }
        if (((pf) this).field_h == var2) {
            ((pf) this).field_b = null;
            return null;
        }
        ((pf) this).field_b = var2.field_f;
        return var2;
    }

    final void a(oh param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (null == param0.field_e) {
                break L1;
              } else {
                param0.b((byte) -90);
                break L1;
              }
            }
            L2: {
              param0.field_f = ((pf) this).field_h.field_f;
              param0.field_e = ((pf) this).field_h;
              param0.field_e.field_f = param0;
              param0.field_f.field_e = param0;
              if (param1 == 0) {
                break L2;
              } else {
                field_a = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("pf.O(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final oh a(boolean param0) {
        if (!param0) {
            ((pf) this).field_h = null;
        }
        oh var2 = ((pf) this).field_h.field_e;
        if (var2 == ((pf) this).field_h) {
            return null;
        }
        var2.b((byte) -125);
        return var2;
    }

    private final void a(boolean param0, oh param1, pf param2) {
        oh var4 = null;
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
          L0: {
            L1: {
              var4 = ((pf) this).field_h.field_e;
              ((pf) this).field_h.field_e = param1.field_e;
              param1.field_e.field_f = ((pf) this).field_h;
              if (param1 != ((pf) this).field_h) {
                param1.field_e = param2.field_h.field_e;
                param1.field_e.field_f = param1;
                var4.field_f = param2.field_h;
                param2.field_h.field_e = var4;
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
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("pf.B(").append(false).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final void a(byte param0, oh param1) {
        if (null != param1.field_e) {
            param1.b((byte) -104);
        }
        param1.field_e = ((pf) this).field_h.field_e;
        param1.field_f = ((pf) this).field_h;
        param1.field_e.field_f = param1;
        if (param0 != -113) {
            return;
        }
        try {
            param1.field_f.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "pf.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final oh a(byte param0) {
        oh var2 = ((pf) this).field_b;
        if (var2 == ((pf) this).field_h) {
            ((pf) this).field_b = null;
            return null;
        }
        if (param0 != -71) {
            return null;
        }
        ((pf) this).field_b = var2.field_f;
        return var2;
    }

    final static boolean a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (var3 >= param0.length()) {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                if (var2_int != param0.charAt(var3)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("pf.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + 24 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final void a(int param0) {
        oh var2 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        while (true) {
            var2 = ((pf) this).field_h.field_f;
            if (((pf) this).field_h == var2) {
                break;
            }
            var2.b((byte) -72);
        }
        ((pf) this).field_b = null;
        if (param0 != 0) {
            Object var4 = null;
            ((pf) this).a((byte) -24, (oh) null);
        }
    }

    public pf() {
        ((pf) this).field_h = new oh();
        ((pf) this).field_h.field_f = ((pf) this).field_h;
        ((pf) this).field_h.field_e = ((pf) this).field_h;
    }

    final void a(byte param0, pf param1) {
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
              this.a(false, ((pf) this).field_h.field_f, param1);
              if (param0 == -90) {
                break L1;
              } else {
                ((pf) this).field_b = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pf.J(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Play free version";
        field_c = false;
    }
}
