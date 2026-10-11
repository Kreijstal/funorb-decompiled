/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vo {
    static vn[] field_a;
    le field_b;
    static dj field_d;
    private le field_c;

    final le b(byte param0) {
        le var2 = this.field_b.field_b;
        if (this.field_b == var2) {
          this.field_c = null;
          return null;
        }
        if (param0 == 26) {
          this.field_c = var2.field_b;
          return var2;
        }
        this.field_c = (le) null;
        this.field_c = var2.field_b;
        return var2;
    }

    final void a(le param0, int param1) {
        try {
          if (param0.field_d != null) {
            param0.b(-27598);
          }
          param0.field_b = this.field_b.field_b;
          param0.field_d = this.field_b;
          int var3_int = -120 / ((-52 - param1) / 59);
          param0.field_d.field_b = param0;
          param0.field_b.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "vo.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final le a(boolean param0) {
        le var2 = null;
        le var2Lifetime1;
        if (param0) {
          this.field_b = (le) null;
          var2 = this.field_c;
          if (var2 != this.field_b) {
            this.field_c = var2.field_b;
            return var2;
          }
          this.field_c = null;
          return null;
        }
        var2Lifetime1 = this.field_c;
        if (var2Lifetime1 != this.field_b) {
          this.field_c = var2Lifetime1.field_b;
          return var2Lifetime1;
        }
        this.field_c = null;
        return null;
    }

    final le c(int param0) {
        le var2 = this.field_c;
        if (this.field_b == var2) {
          this.field_c = null;
          return null;
        }
        if (param0 == 26853) {
          this.field_c = var2.field_d;
          return var2;
        }
        this.b((byte) -101);
        this.field_c = var2.field_d;
        return var2;
    }

    final le f(int param0) {
        le var2 = null;
        le var2Lifetime1;
        if (param0 <= 9) {
          this.a(-117);
          var2 = this.field_b.field_b;
          if (this.field_b != var2) {
            var2.b(-27598);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_b.field_b;
        if (this.field_b != var2Lifetime1) {
          var2Lifetime1.b(-27598);
          return var2Lifetime1;
        }
        return null;
    }

    final int d(int param0) {
        int var4 = ZombieDawn.field_J;
        int var2 = 0;
        le var3 = this.field_b.field_b;
        if (param0 > -43) {
          return -38;
        }
        while (this.field_b != var3) {
          var2++;
          var3 = var3.field_b;
        }
        return var2;
    }

    final void a(int param0, le param1) {
        try {
          if (param1.field_d != null) {
            param1.b(-27598);
          }
          param1.field_b = this.field_b;
          if (param0 != 0) {
            field_d = (dj) null;
          }
          param1.field_d = this.field_b.field_d;
          param1.field_d.field_b = param1;
          param1.field_b.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "vo.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0) {
        if (param0 >= -116) {
          return true;
        }
        return this.field_b.field_b == this.field_b ? true : false;
    }

    final void b(int param0) {
        le var3 = null;
        int var4 = ZombieDawn.field_J;
        int var2 = -96 % ((param0 - 13) / 40);
        while (true) {
          var3 = this.field_b.field_b;
          if (var3 == this.field_b) {
            break;
          }
          var3.b(-27598);
        }
        this.field_c = null;
    }

    final le a(int param0) {
        le var2 = null;
        le var2Lifetime1;
        if (param0 != 0) {
          this.a((byte) 96);
          var2 = this.field_b.field_d;
          if (var2 != this.field_b) {
            var2.b(-27598);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_b.field_d;
        if (var2Lifetime1 != this.field_b) {
          var2Lifetime1.b(-27598);
          return var2Lifetime1;
        }
        return null;
    }

    public static void c(byte param0) {
        field_a = null;
        if (param0 > -20) {
          return;
        }
        field_d = null;
    }

    public vo() {
        this.field_b = new le();
        this.field_b.field_b = this.field_b;
        this.field_b.field_d = this.field_b;
    }

    final le e(int param0) {
        le var2 = this.field_b.field_d;
        if (var2 == this.field_b) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_d;
        if (param0 == 0) {
          return var2;
        }
        this.a(false);
        return var2;
    }

    static {
    }
}
