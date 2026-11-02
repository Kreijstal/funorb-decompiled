/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vo {
    static vn[] field_a;
    IntrusiveNode field_b;
    static dj field_d;
    private IntrusiveNode field_c;

    final IntrusiveNode b(byte param0) {
        IntrusiveNode var2 = this.field_b.previous;
        if (this.field_b == var2) {
          this.field_c = null;
          return null;
        }
        if (param0 == 26) {
          this.field_c = var2.previous;
          return var2;
        }
        this.field_c = (IntrusiveNode) null;
        this.field_c = var2.previous;
        return var2;
    }

    final void a(IntrusiveNode param0, int param1) {
        try {
          if (param0.next != null) {
            param0.unlink(-27598);
          }
          param0.previous = this.field_b.previous;
          param0.next = this.field_b;
          int var3_int = -120 / ((-52 - param1) / 59);
          param0.next.previous = param0;
          param0.previous.next = param0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "vo.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode a(boolean param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0) {
          this.field_b = (IntrusiveNode) null;
          var2 = this.field_c;
          if (var2 != this.field_b) {
            this.field_c = var2.previous;
            return var2;
          }
          this.field_c = null;
          return null;
        }
        var2Lifetime1 = this.field_c;
        if (var2Lifetime1 != this.field_b) {
          this.field_c = var2Lifetime1.previous;
          return var2Lifetime1;
        }
        this.field_c = null;
        return null;
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = this.field_c;
        if (this.field_b == var2) {
          this.field_c = null;
          return null;
        }
        if (param0 == 26853) {
          this.field_c = var2.next;
          return var2;
        }
        this.b((byte) -101);
        this.field_c = var2.next;
        return var2;
    }

    final IntrusiveNode f(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 <= 9) {
          this.a(-117);
          var2 = this.field_b.previous;
          if (this.field_b != var2) {
            var2.unlink(-27598);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_b.previous;
        if (this.field_b != var2Lifetime1) {
          var2Lifetime1.unlink(-27598);
          return var2Lifetime1;
        }
        return null;
    }

    final int d(int param0) {
        int var4 = ZombieDawn.field_J;
        int var2 = 0;
        IntrusiveNode var3 = this.field_b.previous;
        if (param0 > -43) {
          return -38;
        }
        while (this.field_b != var3) {
          var2++;
          var3 = var3.previous;
        }
        return var2;
    }

    final void a(int param0, IntrusiveNode param1) {
        try {
          if (param1.next != null) {
            param1.unlink(-27598);
          }
          param1.previous = this.field_b;
          if (param0 != 0) {
            field_d = (dj) null;
          }
          param1.next = this.field_b.next;
          param1.next.previous = param1;
          param1.previous.next = param1;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "vo.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0) {
        if (param0 >= -116) {
          return true;
        }
        return this.field_b.previous == this.field_b ? true : false;
    }

    final void b(int param0) {
        IntrusiveNode var3 = null;
        int var4 = ZombieDawn.field_J;
        int var2 = -96 % ((param0 - 13) / 40);
        while (true) {
          var3 = this.field_b.previous;
          if (var3 == this.field_b) {
            break;
          }
          var3.unlink(-27598);
        }
        this.field_c = null;
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 0) {
          this.a((byte) 96);
          var2 = this.field_b.next;
          if (var2 != this.field_b) {
            var2.unlink(-27598);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_b.next;
        if (var2Lifetime1 != this.field_b) {
          var2Lifetime1.unlink(-27598);
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
        this.field_b = new IntrusiveNode();
        this.field_b.previous = this.field_b;
        this.field_b.next = this.field_b;
    }

    final IntrusiveNode e(int param0) {
        IntrusiveNode var2 = this.field_b.next;
        if (var2 == this.field_b) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.next;
        if (param0 == 0) {
          return var2;
        }
        this.a(false);
        return var2;
    }

    static {
    }
}
