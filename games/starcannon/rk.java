/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static int field_d;
    static int field_a;
    rf field_c;
    private rf field_b;

    final rf c(int param0) {
        rf var2 = null;
        rf var2Lifetime1;
        if (param0 != -3905) {
          this.field_c = (rf) null;
          var2 = this.field_c.field_a;
          if (this.field_c == var2) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.field_a;
          return var2;
        }
        var2Lifetime1 = this.field_c.field_a;
        if (this.field_c == var2Lifetime1) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2Lifetime1.field_a;
        return var2Lifetime1;
    }

    final void b(int param0, rf param1) {
        try {
          if (param0 <= 55) {
            this.c(-56);
          }
          if (param1.field_d != null) {
            param1.b(4);
          }
          param1.field_d = this.field_c.field_d;
          param1.field_a = this.field_c;
          param1.field_d.field_a = param1;
          param1.field_a.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, rf param1) {
        try {
          if (param1.field_d != null) {
            param1.b(4);
          }
          param1.field_d = this.field_c;
          param1.field_a = this.field_c.field_a;
          param1.field_d.field_a = param1;
          if (param0 >= -44) {
            this.a(63);
          }
          param1.field_a.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rk.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final rf d(int param0) {
        int var3 = 63 % ((param0 + 5) / 45);
        rf var2 = this.field_c.field_d;
        if (this.field_c != var2) {
          var2.b(4);
          return var2;
        }
        return null;
    }

    final boolean a(boolean param0) {
        if (param0) {
          return this.field_c == this.field_c.field_a ? true : false;
        }
        this.a((byte) -75);
        return this.field_c == this.field_c.field_a ? true : false;
    }

    final void b(int param0) {
        rf var4;
        rf var3;
        if (param0 == 23505) {
          while (true) {
            var3 = this.field_c.field_a;
            if (this.field_c != var3) {
              var3.b(4);
              continue;
            }
            break;
          }
          this.field_b = null;
          return;
        }
        field_a = -8;
        while (true) {
          var4 = this.field_c.field_a;
          if (this.field_c != var4) {
            var4.b(4);
            continue;
          }
          break;
        }
        this.field_b = null;
        return;
    }

    final rf a(int param0) {
        rf var2 = null;
        rf var2Lifetime1;
        if (param0 != -16913) {
          rf var3 = (rf) null;
          this.a(40, (rf) null);
          var2 = this.field_b;
          if (var2 == this.field_c) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.field_a;
          return var2;
        }
        var2Lifetime1 = this.field_b;
        if (var2Lifetime1 == this.field_c) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2Lifetime1.field_a;
        return var2Lifetime1;
    }

    final rf a(byte param0) {
        rf var2 = null;
        rf var2Lifetime1;
        if (param0 != 39) {
          this.d(-75);
          var2 = this.field_c.field_a;
          if (var2 != this.field_c) {
            var2.b(param0 - 35);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_c.field_a;
        if (var2Lifetime1 != this.field_c) {
          var2Lifetime1.b(param0 - 35);
          return var2Lifetime1;
        }
        return null;
    }

    public rk() {
        this.field_c = new rf();
        this.field_c.field_d = this.field_c;
        this.field_c.field_a = this.field_c;
    }

    static {
    }
}
