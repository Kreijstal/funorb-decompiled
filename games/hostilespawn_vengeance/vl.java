/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    IntrusiveNode field_b;
    static vl field_c;
    private IntrusiveNode field_a;

    final void d(int param0) {
        IntrusiveNode var2;
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        while (true) {
          var2 = this.field_b.field_g;
          if (this.field_b != var2) {
            var2.b(param0 - 5692);
            continue;
          }
          break;
        }
        this.field_a = null;
        if (param0 == 5719) {
          return;
        }
        field_c = (vl) null;
        return;
    }

    final IntrusiveNode g(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 >= -2) {
          this.field_a = (IntrusiveNode) null;
          var2 = this.field_b.field_g;
          if (this.field_b != var2) {
            this.field_a = var2.field_g;
            return var2;
          }
          this.field_a = null;
          return null;
        }
        var2Lifetime1 = this.field_b.field_g;
        if (this.field_b != var2Lifetime1) {
          this.field_a = var2Lifetime1.field_g;
          return var2Lifetime1;
        }
        this.field_a = null;
        return null;
    }

    final IntrusiveNode b(int param0) {
        if (param0 != -27493) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_b.field_f;
        if (var2 != this.field_b) {
          var2.b(27);
          return var2;
        }
        return null;
    }

    final IntrusiveNode b(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 117) {
          this.c(-99);
          var2 = this.field_b.field_f;
          if (this.field_b == var2) {
            this.field_a = null;
            return null;
          }
          this.field_a = var2.field_f;
          return var2;
        }
        var2Lifetime1 = this.field_b.field_f;
        if (this.field_b == var2Lifetime1) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2Lifetime1.field_f;
        return var2Lifetime1;
    }

    public static void f(int param0) {
        if (param0 <= 46) {
          field_c = (vl) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = this.field_b.field_g;
        if (param0 != 18120) {
          return (IntrusiveNode) null;
        }
        if (this.field_b != var2) {
          var2.b(106);
          return var2;
        }
        return null;
    }

    final void a(IntrusiveNode param0, int param1) {
        try {
          if (param0.field_f != null) {
            param0.b(123);
          }
          param0.field_g = this.field_b;
          param0.field_f = this.field_b.field_f;
          if (param1 <= 79) {
            this.field_b = (IntrusiveNode) null;
          }
          param0.field_f.field_g = param0;
          param0.field_g.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "vl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 == -20049) {
          return this.field_b.field_g == this.field_b ? true : false;
        }
        this.field_b = (IntrusiveNode) null;
        return this.field_b.field_g == this.field_b ? true : false;
    }

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = this.field_a;
        if (this.field_b == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_f;
        if (param0 > 4) {
          return var2;
        }
        this.b(24);
        return var2;
    }

    public vl() {
        this.field_b = new IntrusiveNode();
        this.field_b.field_f = this.field_b;
        this.field_b.field_g = this.field_b;
    }

    final void a(byte param0, IntrusiveNode param1) {
        try {
          if (param1.field_f != null) {
            param1.b(116);
          }
          if (param0 > -45) {
            this.field_b = (IntrusiveNode) null;
          }
          param1.field_f = this.field_b;
          param1.field_g = this.field_b.field_g;
          param1.field_f.field_g = param1;
          param1.field_g.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "vl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode a(int param0) {
        if (param0 != 12684) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_a;
        if (this.field_b == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_g;
        return var2;
    }

    static {
        field_c = new vl();
    }
}
