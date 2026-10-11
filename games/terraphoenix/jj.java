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
        uf var3 = this.field_a.field_a;
        if (this.field_a == var3) {
          this.field_b = null;
          return null;
        }
        this.field_b = var3.field_a;
        return var3;
    }

    final uf d(byte param0) {
        uf var2 = this.field_a.field_d;
        if (var2 != this.field_a) {
          var2.b((byte) 12);
          int var3 = -85 / ((param0 + 37) / 50);
          return var2;
        }
        return null;
    }

    final static void e(int param0) {
        ag.field_a = null;
        if (param0 >= -94) {
          field_e = (String) null;
          t.field_e = null;
          return;
        }
        t.field_e = null;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != -22208) {
          return;
        }
        field_e = null;
        field_c = null;
    }

    final boolean a(byte param0) {
        if (param0 > -34) {
          return false;
        }
        return this.field_a == this.field_a.field_d ? true : false;
    }

    final void c(int param0) {
        uf var5 = null;
        uf var4 = null;
        int var3 = Terraphoenix.field_V;
        if (param0 != 21480) {
          this.d(-102);
          while (true) {
            var5 = this.field_a.field_d;
            if (var5 == this.field_a) {
              break;
            }
            var5.b((byte) 12);
          }
          this.field_b = null;
          return;
        }
        while (true) {
          var4 = this.field_a.field_d;
          if (var4 == this.field_a) {
            break;
          }
          var4.b((byte) 12);
        }
        this.field_b = null;
    }

    final static bg a(fa param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        bg stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 18) {
            field_d = (String) null;
          }
          if (!vh.a(param3, param1, param0, true)) {
            return null;
          }
          stackIn_6_0 = km.a(param2 + 97);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("jj.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final uf e(byte param0) {
        uf var2 = null;
        uf var2Lifetime1;
        if (param0 != -119) {
          this.b((byte) -7);
          var2 = this.field_b;
          if (var2 != this.field_a) {
            this.field_b = var2.field_d;
            return var2;
          }
          this.field_b = null;
          return null;
        }
        var2Lifetime1 = this.field_b;
        if (var2Lifetime1 != this.field_a) {
          this.field_b = var2Lifetime1.field_d;
          return var2Lifetime1;
        }
        this.field_b = null;
        return null;
    }

    final uf b(int param0) {
        uf var2 = this.field_b;
        if (var2 == this.field_a) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_a;
        if (param0 <= -67) {
          return var2;
        }
        fa var3 = (fa) null;
        jj.a((fa) null, 85, (byte) 51, 81);
        return var2;
    }

    final uf d(int param0) {
        uf var2 = null;
        uf var2Lifetime1;
        if (param0 != 9272) {
          field_f = 56;
          var2 = this.field_a.field_d;
          if (var2 == this.field_a) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.field_d;
          return var2;
        }
        var2Lifetime1 = this.field_a.field_d;
        if (var2Lifetime1 == this.field_a) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2Lifetime1.field_d;
        return var2Lifetime1;
    }

    final void a(uf param0, byte param1) {
        try {
          if (param0.field_a != null) {
            param0.b((byte) 12);
          }
          param0.field_d = this.field_a.field_d;
          param0.field_a = this.field_a;
          if (param1 != 0) {
            this.c(-11);
          }
          param0.field_a.field_d = param0;
          param0.field_d.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "jj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final uf b(byte param0) {
        int var2 = -86 % ((53 - param0) / 47);
        uf var3 = this.field_a.field_a;
        if (this.field_a != var3) {
          var3.b((byte) 12);
          return var3;
        }
        return null;
    }

    final void a(uf param0, int param1) {
        if (null != param0.field_a) {
          param0.b((byte) 12);
        }
        param0.field_a = this.field_a.field_a;
        param0.field_d = this.field_a;
        param0.field_a.field_d = param0;
        if (param1 != -16611) {
          return;
        }
        try {
          param0.field_d.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "jj.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public jj() {
        this.field_a = new uf();
        this.field_a.field_d = this.field_a;
        this.field_a.field_a = this.field_a;
    }

    static {
        field_d = "Waiting for extra data";
    }
}
