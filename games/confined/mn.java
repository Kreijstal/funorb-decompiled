/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static String field_g;
    static mi field_b;
    IntrusiveNode field_a;
    static e field_f;
    private IntrusiveNode field_d;
    static mi field_e;
    static String field_c;

    final IntrusiveNode b(byte param0) {
        if (param0 <= 83) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_a.field_a;
        if (this.field_a != var2) {
          var2.a(true);
          return var2;
        }
        return null;
    }

    final IntrusiveNode d(int param0) {
        IntrusiveNode var2 = this.field_d;
        if (this.field_a == var2) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.field_h;
        if (param0 == 2123) {
          return var2;
        }
        this.d(48);
        return var2;
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 1) {
          this.b((byte) 116);
          var2 = this.field_a.field_h;
          if (var2 != this.field_a) {
            var2.a(true);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_a.field_h;
        if (var2Lifetime1 != this.field_a) {
          var2Lifetime1.a(true);
          return var2Lifetime1;
        }
        return null;
    }

    final void a(IntrusiveNode param0, byte param1) {
        try {
          int var3_int = -8 / ((param1 - 0) / 61);
          if (param0.field_a != null) {
            param0.a(true);
          }
          param0.field_a = this.field_a.field_a;
          param0.field_h = this.field_a;
          param0.field_a.field_h = param0;
          param0.field_h.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mn.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean f(int param0) {
        if (param0 != -1) {
          return false;
        }
        return this.field_a.field_h == this.field_a ? true : false;
    }

    final static void a(String param0, int param1, byte param2, int param3, int param4, int param5) {
        try {
          nn.field_t[param4].d(param1, param3);
          pn.field_a.c(param0, 2 + param1, 14 + param3, 16777215, -1);
          if (param2 != -30) {
            mn.b(-116);
          }
          pn.field_a.a(Integer.toString(param5), 39 + param1, 38 + param3, 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mn.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(IntrusiveNode param0, int param1) {
        if (param1 != -1) {
          return;
        }
        try {
          if (param0.field_a != null) {
            param0.a(true);
          }
          param0.field_h = this.field_a.field_h;
          param0.field_a = this.field_a;
          param0.field_a.field_h = param0;
          param0.field_h.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mn.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = this.field_d;
        if (this.field_a == var2) {
          this.field_d = null;
          return null;
        }
        int var3 = -15 % ((param0 - 12) / 41);
        this.field_d = var2.field_a;
        return var2;
    }

    final void e(int param0) {
        IntrusiveNode var2;
        int var3;
        var3 = Confined.field_J ? 1 : 0;
        while (true) {
          var2 = this.field_a.field_h;
          if (var2 != this.field_a) {
            var2.a(true);
            continue;
          }
          break;
        }
        this.field_d = null;
        if (param0 >= 29) {
          return;
        }
        field_b = (mi) null;
        return;
    }

    final IntrusiveNode a(IntrusiveNode param0, boolean param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.a(true);
          }
          if (param0 == null) {
            var3 = this.field_a.field_a;
          } else {
            var3 = param0;
          }
          if (this.field_a == var3) {
            this.field_d = null;
            stackIn_8_0 = null;
            return (IntrusiveNode) (stackIn_8_0);
          }
          this.field_d = var3.field_a;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("mn.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = this.field_a.field_h;
        if (var2 != this.field_a) {
          int var3 = -59 / ((-54 - param0) / 59);
          this.field_d = var2.field_h;
          return var2;
        }
        this.field_d = null;
        return null;
    }

    final IntrusiveNode a(boolean param0) {
        IntrusiveNode var2 = this.field_a.field_a;
        if (this.field_a == var2) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.field_a;
        if (!param0) {
          return var2;
        }
        mn.b(-115);
        return var2;
    }

    public mn() {
        this.field_a = new IntrusiveNode();
        this.field_a.field_a = this.field_a;
        this.field_a.field_h = this.field_a;
    }

    public static void b(int param0) {
        field_f = null;
        field_g = null;
        field_c = null;
        field_e = null;
        field_b = null;
        int var1 = -97 / ((param0 - 17) / 52);
    }

    static {
        field_g = "Waiting for textures";
        field_f = new e(4, 1, 1, 1);
        field_c = "Click to skip";
    }
}
