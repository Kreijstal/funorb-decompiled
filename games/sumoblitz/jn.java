/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static int field_b;
    static hr field_d;
    static hr[] field_c;
    ms field_e;
    private ms field_a;

    final ms a(int param0) {
        ms var2 = this.field_e.field_g;
        if (this.field_e == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_g;
        if (param0 == 9) {
          return var2;
        }
        this.a((byte) 19);
        return var2;
    }

    final ms d(byte param0) {
        ms var2 = null;
        ms var2Lifetime1;
        if (param0 != 18) {
          this.b((byte) -83);
          var2 = this.field_a;
          if (var2 != this.field_e) {
            this.field_a = var2.field_b;
            return var2;
          }
          this.field_a = null;
          return null;
        }
        var2Lifetime1 = this.field_a;
        if (var2Lifetime1 != this.field_e) {
          this.field_a = var2Lifetime1.field_b;
          return var2Lifetime1;
        }
        this.field_a = null;
        return null;
    }

    final void a(ms param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_g != null) {
            param0.b(false);
          }
          param0.field_g = this.field_e;
          param0.field_b = this.field_e.field_b;
          param0.field_g.field_b = param0;
          param0.field_b.field_g = param0;
          if (param1 == -10295) {
            return;
          }
          this.field_a = (ms) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jn.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final ms d(int param0) {
        ms var2 = this.field_a;
        if (var2 == this.field_e) {
          this.field_a = null;
          return null;
        }
        if (param0 == 9) {
          this.field_a = var2.field_g;
          return var2;
        }
        this.d((byte) 68);
        this.field_a = var2.field_g;
        return var2;
    }

    final boolean a(byte param0) {
        if (param0 <= -65) {
          return this.field_e.field_b == this.field_e ? true : false;
        }
        this.e(-106);
        return this.field_e.field_b == this.field_e ? true : false;
    }

    final void a(ms param0, byte param1) {
        if (param0.field_g != null) {
          param0.b(false);
        }
        param0.field_b = this.field_e;
        param0.field_g = this.field_e.field_g;
        param0.field_g.field_b = param0;
        if (param1 != 39) {
          return;
        }
        try {
          param0.field_b.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "jn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ms b(byte param0) {
        if (param0 >= -98) {
          return (ms) null;
        }
        ms var2 = this.field_e.field_g;
        if (this.field_e != var2) {
          var2.b(false);
          return var2;
        }
        return null;
    }

    final ms c(int param0) {
        ms var2 = this.field_e.field_b;
        if (var2 == this.field_e) {
          return null;
        }
        if (param0 == 9) {
          var2.b(false);
          return var2;
        }
        ms var3 = (ms) null;
        this.a((ms) null, (byte) 81);
        var2.b(false);
        return var2;
    }

    public static void c(byte param0) {
        field_d = null;
        if (param0 != 117) {
          field_b = 93;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final ms b(int param0) {
        int var3 = 64 % ((5 - param0) / 61);
        ms var2 = this.field_e.field_b;
        if (this.field_e != var2) {
          this.field_a = var2.field_b;
          return var2;
        }
        this.field_a = null;
        return null;
    }

    final void e(int param0) {
        ms var2 = null;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        while (true) {
          var2 = this.field_e.field_b;
          if (this.field_e == var2) {
            break;
          }
          var2.b(false);
        }
        if (param0 >= 114) {
          this.field_a = null;
          return;
        }
        field_d = (hr) null;
        this.field_a = null;
    }

    public jn() {
        this.field_e = new ms();
        this.field_e.field_g = this.field_e;
        this.field_e.field_b = this.field_e;
    }

    static {
        field_b = 9;
    }
}
