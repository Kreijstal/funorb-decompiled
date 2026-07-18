/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    uf field_a;
    static String field_e;
    static fa field_c;
    static int field_f;
    static String field_d;
    private uf field_b;

    final uf c(byte param0) {
        int var2 = 31 % ((param0 - 36) / 56);
        uf var3 = ((jj) this).field_a.field_a;
        if (!(((jj) this).field_a != var3)) {
            ((jj) this).field_b = null;
            return null;
        }
        ((jj) this).field_b = var3.field_a;
        return var3;
    }

    final uf d(byte param0) {
        uf var2 = null;
        int var3 = 0;
        var2 = ((jj) this).field_a.field_d;
        if (var2 == ((jj) this).field_a) {
          return null;
        } else {
          var2.b((byte) 12);
          var3 = -85 / ((param0 - -37) / 50);
          return var2;
        }
    }

    final static void e(int param0) {
        ag.field_a = null;
        t.field_e = null;
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final boolean a(byte param0) {
        if (param0 > -34) {
            return false;
        }
        return ((jj) this).field_a == ((jj) this).field_a.field_d ? true : false;
    }

    final void c(int param0) {
        int var3 = 0;
        uf var4 = null;
        uf var5 = null;
        var3 = Terraphoenix.field_V;
        if (param0 == 21480) {
          L0: while (true) {
            var4 = ((jj) this).field_a.field_d;
            if (var4 == ((jj) this).field_a) {
              ((jj) this).field_b = null;
              return;
            } else {
              var4.b((byte) 12);
              continue L0;
            }
          }
        } else {
          uf discarded$1 = ((jj) this).d(-102);
          L1: while (true) {
            var5 = ((jj) this).field_a.field_d;
            if (var5 == ((jj) this).field_a) {
              ((jj) this).field_b = null;
              return;
            } else {
              var5.b((byte) 12);
              continue L1;
            }
          }
        }
    }

    final static bg a(fa param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        bg stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        bg stackOut_5_0 = null;
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
              if (param2 == 18) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            if (vh.a(param3, param1, param0, true)) {
              stackOut_5_0 = km.a(param2 + 97);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("jj.I(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final uf e(byte param0) {
        uf var2 = null;
        if (param0 == -119) {
          var2 = ((jj) this).field_b;
          if (var2 == ((jj) this).field_a) {
            ((jj) this).field_b = null;
            return null;
          } else {
            ((jj) this).field_b = var2.field_d;
            return var2;
          }
        } else {
          uf discarded$2 = ((jj) this).b((byte) -7);
          var2 = ((jj) this).field_b;
          if (var2 == ((jj) this).field_a) {
            ((jj) this).field_b = null;
            return null;
          } else {
            ((jj) this).field_b = var2.field_d;
            return var2;
          }
        }
    }

    final uf b(int param0) {
        uf var2 = null;
        Object var3 = null;
        var2 = ((jj) this).field_b;
        if (var2 == ((jj) this).field_a) {
          ((jj) this).field_b = null;
          return null;
        } else {
          ((jj) this).field_b = var2.field_a;
          if (param0 > -67) {
            var3 = null;
            bg discarded$2 = jj.a((fa) null, 85, (byte) 51, 81);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final uf d(int param0) {
        uf var2 = null;
        if (param0 != 9272) {
            field_f = 56;
            var2 = ((jj) this).field_a.field_d;
            if (!(var2 != ((jj) this).field_a)) {
                ((jj) this).field_b = null;
                return null;
            }
            ((jj) this).field_b = var2.field_d;
            return var2;
        }
        var2 = ((jj) this).field_a.field_d;
        if (!(var2 != ((jj) this).field_a)) {
            ((jj) this).field_b = null;
            return null;
        }
        ((jj) this).field_b = var2.field_d;
        return var2;
    }

    final void a(uf param0, byte param1) {
        try {
            if (param0.field_a != null) {
                param0.b((byte) 12);
            }
            param0.field_d = ((jj) this).field_a.field_d;
            param0.field_a = ((jj) this).field_a;
            if (param1 != 0) {
                ((jj) this).c(-11);
            }
            param0.field_a.field_d = param0;
            param0.field_d.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "jj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final uf b(byte param0) {
        int var2 = 0;
        uf var3 = null;
        var2 = -86 % ((53 - param0) / 47);
        var3 = ((jj) this).field_a.field_a;
        if (((jj) this).field_a == var3) {
          return null;
        } else {
          var3.b((byte) 12);
          return var3;
        }
    }

    final void a(uf param0, int param1) {
        if (null != param0.field_a) {
            param0.b((byte) 12);
        }
        param0.field_a = ((jj) this).field_a.field_a;
        param0.field_d = ((jj) this).field_a;
        param0.field_a.field_d = param0;
        if (param1 != -16611) {
            return;
        }
        try {
            param0.field_d.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "jj.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public jj() {
        ((jj) this).field_a = new uf();
        ((jj) this).field_a.field_d = ((jj) this).field_a;
        ((jj) this).field_a.field_a = ((jj) this).field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for extra data";
    }
}
