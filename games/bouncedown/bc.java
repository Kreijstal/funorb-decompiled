/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    ai field_b;
    private ai field_c;
    static int field_a;

    final ai a(byte param0) {
        ai var2 = this.field_b.field_c;
        if (!(var2 != this.field_b)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_c;
        if (param0 > -44) {
            this.f((byte) 90);
        }
        return var2;
    }

    final ai c(byte param0) {
        if (param0 != -52) {
            this.b(108);
        }
        ai var2 = this.field_b.field_c;
        if (this.field_b == var2) {
            return null;
        }
        var2.c(param0 ^ -50);
        return var2;
    }

    final ai b(byte param0) {
        ai var2 = this.field_b.field_f;
        if (param0 <= 9) {
            return (ai) null;
        }
        if (!(var2 != this.field_b)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_f;
        return var2;
    }

    final ai d(byte param0) {
        ai var2 = this.field_c;
        if (!(var2 != this.field_b)) {
            this.field_c = null;
            return null;
        }
        int var3 = 102 % ((15 - param0) / 33);
        this.field_c = var2.field_c;
        return var2;
    }

    final boolean f(byte param0) {
        if (param0 != -93) {
            this.c((byte) 40);
        }
        return this.field_b == this.field_b.field_c ? true : false;
    }

    final ai e(byte param0) {
        ai var2 = this.field_b.field_f;
        if (param0 <= 55) {
            return (ai) null;
        }
        if (var2 == this.field_b) {
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
                this.field_c = (ai) null;
            }
            param1.field_c = this.field_b;
            param1.field_f = this.field_b.field_f;
            param1.field_f.field_c = param1;
            param1.field_c.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "bc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ai a(int param0) {
        ai var2 = this.field_c;
        if (var2 == this.field_b) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_f;
        if (param0 != -18158) {
            this.field_c = (ai) null;
        }
        return var2;
    }

    final void a(byte param0, ai param1) {
        if (!(null == param1.field_f)) {
            param1.c(param0 ^ 81);
        }
        param1.field_c = this.field_b.field_c;
        if (param0 != 83) {
            return;
        }
        try {
            param1.field_f = this.field_b;
            param1.field_f.field_c = param1;
            param1.field_c.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "bc.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        ai var3 = null;
        int var4 = Bounce.field_N;
        int var2 = 81 % ((-6 - param0) / 51);
        while (true) {
            var3 = this.field_b.field_c;
            if (var3 == this.field_b) {
                break;
            }
            var3.c(2);
        }
        this.field_c = null;
    }

    public bc() {
        this.field_b = new ai();
        this.field_b.field_f = this.field_b;
        this.field_b.field_c = this.field_b;
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Bounce.field_N;
        try {
          L0: {
            var3 = 4 / ((-61 - param1) / 32);
            var2_int = param0.length();
            var4 = new char[var2_int];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                stackIn_5_0 = new String(var4);
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
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("bc.F(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    static {
    }
}
