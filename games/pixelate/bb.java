/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static String field_e;
    static String field_a;
    fa field_f;
    static String field_d;
    private fa field_c;
    static int field_b;

    final fa g(int param0) {
        fa var2 = null;
        if (param0 != 1504642273) {
            Object var3 = null;
            ((bb) this).a(46, (fa) null);
            var2 = ((bb) this).field_f.field_h;
            if (!(((bb) this).field_f != var2)) {
                ((bb) this).field_c = null;
                return null;
            }
            ((bb) this).field_c = var2.field_h;
            return var2;
        }
        var2 = ((bb) this).field_f.field_h;
        if (!(((bb) this).field_f != var2)) {
            ((bb) this).field_c = null;
            return null;
        }
        ((bb) this).field_c = var2.field_h;
        return var2;
    }

    final fa d(int param0) {
        fa var2 = null;
        if (param0 == -28918) {
          var2 = ((bb) this).field_f.field_a;
          if (var2 == ((bb) this).field_f) {
            return null;
          } else {
            var2.c(param0 + 31697);
            return var2;
          }
        } else {
          ((bb) this).field_c = null;
          var2 = ((bb) this).field_f.field_a;
          if (var2 == ((bb) this).field_f) {
            return null;
          } else {
            var2.c(param0 + 31697);
            return var2;
          }
        }
    }

    final fa a(fa param0, int param1) {
        fa var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        fa stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        fa stackOut_8_0 = null;
        Object stackOut_4_0 = null;
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
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = ((bb) this).field_f.field_a;
                break L1;
              }
            }
            if (var3 != ((bb) this).field_f) {
              L2: {
                if (param1 == 1504642273) {
                  break L2;
                } else {
                  ((bb) this).field_f = null;
                  break L2;
                }
              }
              ((bb) this).field_c = var3.field_a;
              stackOut_8_0 = (fa) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((bb) this).field_c = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (fa) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("bb.C(");
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
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0;
    }

    final void e(int param0) {
        fa var3 = null;
        int var4 = Pixelate.field_H ? 1 : 0;
        int var2 = -12 / ((param0 - -36) / 63);
        while (true) {
            var3 = ((bb) this).field_f.field_a;
            if (var3 == ((bb) this).field_f) {
                break;
            }
            var3.c(2779);
        }
        ((bb) this).field_c = null;
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            field_d = null;
            if (((bb) this).field_f != ((bb) this).field_f.field_a) {
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
            if (((bb) this).field_f != ((bb) this).field_f.field_a) {
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

    final fa c(int param0) {
        fa var2 = ((bb) this).field_f.field_a;
        if (param0 != 1504642273) {
            ((bb) this).e(44);
            if (!(((bb) this).field_f != var2)) {
                ((bb) this).field_c = null;
                return null;
            }
            ((bb) this).field_c = var2.field_a;
            return var2;
        }
        if (!(((bb) this).field_f != var2)) {
            ((bb) this).field_c = null;
            return null;
        }
        ((bb) this).field_c = var2.field_a;
        return var2;
    }

    final fa f(int param0) {
        fa var2 = null;
        var2 = ((bb) this).field_c;
        if (var2 == ((bb) this).field_f) {
          ((bb) this).field_c = null;
          return null;
        } else {
          ((bb) this).field_c = var2.field_a;
          if (param0 != 1504642273) {
            return null;
          } else {
            return var2;
          }
        }
    }

    final static void h() {
        int discarded$0 = -59;
        int var1 = la.a();
        int var2 = bl.a(true);
        he.field_a.a(-we.field_n + de.field_h, (we.field_n << 1) + var2, -1, var1 - -(gh.field_t << 1), ko.field_cb + -gh.field_t);
        int discarded$1 = -14;
        pm.a();
    }

    final fa b(int param0) {
        int var2 = 0;
        fa var3 = null;
        var2 = -96 % ((-6 - param0) / 48);
        var3 = ((bb) this).field_f.field_h;
        if (var3 == ((bb) this).field_f) {
          return null;
        } else {
          var3.c(2779);
          return var3;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != 76) {
            bb.a((byte) -113);
            field_a = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_d = null;
    }

    final fa j(int param0) {
        fa var2 = null;
        var2 = ((bb) this).field_c;
        if (var2 != ((bb) this).field_f) {
          ((bb) this).field_c = var2.field_h;
          if (param0 != 0) {
            ((bb) this).field_c = null;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((bb) this).field_c = null;
          return null;
        }
    }

    final void b(int param0, fa param1) {
        try {
            if (!(param1.field_h == null)) {
                param1.c(2779);
            }
            param1.field_a = ((bb) this).field_f.field_a;
            param1.field_h = ((bb) this).field_f;
            if (param0 != 1392503105) {
                field_e = null;
            }
            param1.field_h.field_a = param1;
            param1.field_a.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "bb.K(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int i(int param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        int var2 = param0;
        fa var3 = ((bb) this).field_f.field_a;
        while (((bb) this).field_f != var3) {
            var2++;
            var3 = var3.field_a;
        }
        return var2;
    }

    final void a(int param0, fa param1) {
        try {
            if (param1.field_h != null) {
                param1.c(2779);
            }
            if (param0 != 22125) {
                field_e = null;
            }
            param1.field_a = ((bb) this).field_f;
            param1.field_h = ((bb) this).field_f.field_h;
            param1.field_h.field_a = param1;
            param1.field_a.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "bb.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public bb() {
        ((bb) this).field_f = new fa();
        ((bb) this).field_f.field_a = ((bb) this).field_f;
        ((bb) this).field_f.field_h = ((bb) this).field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_e = "Best: ";
        field_d = "Type your age in years";
    }
}
