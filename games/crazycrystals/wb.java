/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static String field_b;
    jb field_a;
    static int field_d;
    static wb field_e;
    private jb field_c;

    final void a(int param0, jb param1) {
        try {
          if (null != param1.field_d) {
            param1.a(false);
          }
          param1.field_b = this.field_a.field_b;
          param1.field_d = this.field_a;
          if (param0 <= 74) {
            field_d = 72;
          }
          param1.field_d.field_b = param1;
          param1.field_b.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "wb.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        jb var2 = null;
        int var3 = CrazyCrystals.field_B;
        while (true) {
          var2 = this.field_a.field_b;
          if (var2 == this.field_a) {
            break;
          }
          var2.a(false);
        }
        this.field_c = null;
        if (param0 == 22800) {
          return;
        }
        jb var4 = (jb) null;
        this.b(44, (jb) null);
    }

    final jb a(byte param0) {
        jb var2 = this.field_a.field_d;
        if (this.field_a == var2) {
          this.field_c = null;
          return null;
        }
        if (param0 < -23) {
          this.field_c = var2.field_d;
          return var2;
        }
        this.a((byte) -78);
        this.field_c = var2.field_d;
        return var2;
    }

    public static void f(int param0) {
        if (param0 < 1) {
          return;
        }
        field_e = null;
        field_b = null;
    }

    final jb a(boolean param0) {
        jb var2 = this.field_c;
        if (param0) {
          return (jb) null;
        }
        if (var2 != this.field_a) {
          this.field_c = var2.field_b;
          return var2;
        }
        this.field_c = null;
        return null;
    }

    final jb g(int param0) {
        jb var2 = this.field_a.field_b;
        if (var2 == this.field_a) {
          this.field_c = null;
          return null;
        }
        if (param0 == 32073) {
          this.field_c = var2.field_b;
          return var2;
        }
        this.field_a = (jb) null;
        this.field_c = var2.field_b;
        return var2;
    }

    final static void a(int param0, dl param1, String param2) {
        try {
          gh.field_A = param2;
          wl.field_o = param1;
          if (param0 != 0) {
            String var4 = (String) null;
            wb.a(21, (dl) null, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "wb.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final jb d(int param0) {
        int var3 = -76 % ((-55 - param0) / 57);
        jb var2 = this.field_a.field_d;
        if (var2 != this.field_a) {
          var2.a(false);
          return var2;
        }
        return null;
    }

    final void b(int param0, jb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_d != null) {
            param1.a(false);
          }
          param1.field_d = this.field_a.field_d;
          param1.field_b = this.field_a;
          param1.field_d.field_b = param1;
          param1.field_b.field_d = param1;
          if (param0 == 0) {
            return;
          }
          this.c(-27);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("wb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        if (param0 == -16497) {
          return this.field_a.field_b == this.field_a ? true : false;
        }
        field_e = (wb) null;
        return this.field_a.field_b == this.field_a ? true : false;
    }

    final jb e(int param0) {
        jb var2 = this.field_c;
        if (var2 == this.field_a) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_d;
        if (param0 == 0) {
          return var2;
        }
        return (jb) null;
    }

    final jb c(int param0) {
        jb var2 = null;
        jb var2Lifetime1;
        if (param0 != 0) {
          jb var3 = (jb) null;
          this.a(4, (jb) null);
          var2 = this.field_a.field_b;
          if (var2 != this.field_a) {
            var2.a(false);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_a.field_b;
        if (var2Lifetime1 != this.field_a) {
          var2Lifetime1.a(false);
          return var2Lifetime1;
        }
        return null;
    }

    public wb() {
        this.field_a = new jb();
        this.field_a.field_b = this.field_a;
        this.field_a.field_d = this.field_a;
    }

    static {
        field_b = "Suggested names: ";
        field_d = 0;
        field_e = new wb();
    }
}
