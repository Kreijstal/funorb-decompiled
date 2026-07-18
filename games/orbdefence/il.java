/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static nk field_f;
    private o field_b;
    static String field_d;
    static boolean field_a;
    static hj[] field_e;
    private o field_c;

    final o b(int param0) {
        o var2 = null;
        var2 = ((il) this).field_c;
        if (var2 == ((il) this).field_b) {
          ((il) this).field_c = null;
          return null;
        } else {
          ((il) this).field_c = var2.field_f;
          if (param0 != 0) {
            return null;
          } else {
            return var2;
          }
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        o var3 = null;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != -4) {
          return -79;
        } else {
          var2 = 0;
          var3 = ((il) this).field_b.field_f;
          L0: while (true) {
            if (var3 == ((il) this).field_b) {
              return var2;
            } else {
              var3 = var3.field_f;
              var2++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, o param1) {
        RuntimeException var3 = null;
        Object var4 = null;
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
              if (null != param1.field_g) {
                param1.c(-1);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_g = ((il) this).field_b.field_g;
            param1.field_f = ((il) this).field_b;
            param1.field_g.field_f = param1;
            param1.field_f.field_g = param1;
            if (param0 < -39) {
              break L0;
            } else {
              var4 = null;
              ((il) this).a(-33, (o) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("il.B(").append(param0).append(',');
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
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
            return;
        }
        mc.field_g = param0;
    }

    public static void a() {
        field_e = null;
        field_f = null;
        field_d = null;
    }

    final o c(int param0) {
        o var2 = null;
        if (param0 == 30664) {
          var2 = ((il) this).field_b.field_f;
          if (((il) this).field_b == var2) {
            return null;
          } else {
            var2.c(param0 ^ -30665);
            return var2;
          }
        } else {
          o discarded$2 = ((il) this).b(40);
          var2 = ((il) this).field_b.field_f;
          if (((il) this).field_b == var2) {
            return null;
          } else {
            var2.c(param0 ^ -30665);
            return var2;
          }
        }
    }

    public il() {
        ((il) this).field_b = new o();
        ((il) this).field_b.field_g = ((il) this).field_b;
        ((il) this).field_b.field_f = ((il) this).field_b;
    }

    final o b(byte param0) {
        o var2 = null;
        Object var3 = null;
        if (param0 == 46) {
          var2 = ((il) this).field_b.field_f;
          if (var2 == ((il) this).field_b) {
            ((il) this).field_c = null;
            return null;
          } else {
            ((il) this).field_c = var2.field_f;
            return var2;
          }
        } else {
          var3 = null;
          ((il) this).a(49, (o) null);
          var2 = ((il) this).field_b.field_f;
          if (var2 == ((il) this).field_b) {
            ((il) this).field_c = null;
            return null;
          } else {
            ((il) this).field_c = var2.field_f;
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Return to game";
    }
}
