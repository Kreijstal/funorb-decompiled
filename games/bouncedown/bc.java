/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    ai field_b;
    private ai field_c;
    static int field_a;

    final ai a(byte param0) {
        ai var2 = ((bc) this).field_b.field_c;
        if (!(var2 != ((bc) this).field_b)) {
            ((bc) this).field_c = null;
            return null;
        }
        ((bc) this).field_c = var2.field_c;
        if (param0 > -44) {
            boolean discarded$0 = ((bc) this).f((byte) 90);
        }
        return var2;
    }

    final ai c(byte param0) {
        if (param0 != -52) {
            ((bc) this).b(108);
        }
        ai var2 = ((bc) this).field_b.field_c;
        if (((bc) this).field_b == var2) {
            return null;
        }
        var2.c(param0 ^ -50);
        return var2;
    }

    final ai b(byte param0) {
        ai var2 = ((bc) this).field_b.field_f;
        if (param0 <= 9) {
            return null;
        }
        if (!(var2 != ((bc) this).field_b)) {
            ((bc) this).field_c = null;
            return null;
        }
        ((bc) this).field_c = var2.field_f;
        return var2;
    }

    final ai d(byte param0) {
        ai var2 = ((bc) this).field_c;
        if (!(var2 != ((bc) this).field_b)) {
            ((bc) this).field_c = null;
            return null;
        }
        int var3 = 102 % ((15 - param0) / 33);
        ((bc) this).field_c = var2.field_c;
        return var2;
    }

    final boolean f(byte param0) {
        if (param0 != -93) {
            ai discarded$0 = ((bc) this).c((byte) 40);
        }
        return ((bc) this).field_b == ((bc) this).field_b.field_c ? true : false;
    }

    final ai e(byte param0) {
        ai var2 = ((bc) this).field_b.field_f;
        if (param0 <= 55) {
            return null;
        }
        if (var2 == ((bc) this).field_b) {
            return null;
        }
        var2.c(2);
        return var2;
    }

    final void a(int param0, ai param1) {
        try {
            if (null != param1.field_f) {
                param1.c(2);
            }
            if (param0 != 1) {
                ((bc) this).field_c = null;
            }
            param1.field_c = ((bc) this).field_b;
            param1.field_f = ((bc) this).field_b.field_f;
            param1.field_f.field_c = param1;
            param1.field_c.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "bc.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final ai a(int param0) {
        ai var2 = ((bc) this).field_c;
        if (var2 == ((bc) this).field_b) {
            ((bc) this).field_c = null;
            return null;
        }
        ((bc) this).field_c = var2.field_f;
        if (param0 != -18158) {
            ((bc) this).field_c = null;
        }
        return var2;
    }

    final void a(byte param0, ai param1) {
        if (!(null == param1.field_f)) {
            param1.c(param0 ^ 81);
        }
        param1.field_c = ((bc) this).field_b.field_c;
        if (param0 != 83) {
            return;
        }
        try {
            param1.field_f = ((bc) this).field_b;
            param1.field_f.field_c = param1;
            param1.field_c.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "bc.H(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0) {
        ai var3 = null;
        int var4 = Bounce.field_N;
        int var2 = 81 % ((-6 - param0) / 51);
        while (true) {
            var3 = ((bc) this).field_b.field_c;
            if (var3 == ((bc) this).field_b) {
                break;
            }
            var3.c(2);
        }
        ((bc) this).field_c = null;
    }

    public bc() {
        ((bc) this).field_b = new ai();
        ((bc) this).field_b.field_f = ((bc) this).field_b;
        ((bc) this).field_b.field_c = ((bc) this).field_b;
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = Bounce.field_N;
        try {
          L0: {
            var3 = 4 / ((-61 - param1) / 32);
            var2_int = param0.length();
            var4 = new char[var2_int];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                stackOut_4_0 = new String(var4);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var4[var2_int - 1 + -var5] = param0.charAt(var5);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("bc.F(");
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
          throw ii.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
        return stackIn_5_0;
    }

    static {
    }
}
