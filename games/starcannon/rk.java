/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static int field_d;
    static int field_a;
    IntrusiveNode field_c;
    private IntrusiveNode field_b;

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != -3905) {
          this.field_c = (IntrusiveNode) null;
          var2 = this.field_c.next;
          if (this.field_c == var2) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.next;
          return var2;
        }
        var2Lifetime1 = this.field_c.next;
        if (this.field_c == var2Lifetime1) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2Lifetime1.next;
        return var2Lifetime1;
    }

    final void b(int param0, IntrusiveNode param1) {
        try {
          if (param0 <= 55) {
            this.c(-56);
          }
          if (param1.previous != null) {
            param1.unlink(4);
          }
          param1.previous = this.field_c.previous;
          param1.next = this.field_c;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, IntrusiveNode param1) {
        try {
          if (param1.previous != null) {
            param1.unlink(4);
          }
          param1.previous = this.field_c;
          param1.next = this.field_c.next;
          param1.previous.next = param1;
          if (param0 >= -44) {
            this.a(63);
          }
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rk.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode d(int param0) {
        int var3 = 63 % ((param0 + 5) / 45);
        IntrusiveNode var2 = this.field_c.previous;
        if (this.field_c != var2) {
          var2.unlink(4);
          return var2;
        }
        return null;
    }

    final boolean a(boolean param0) {
        if (param0) {
          return this.field_c == this.field_c.next ? true : false;
        }
        this.a((byte) -75);
        return this.field_c == this.field_c.next ? true : false;
    }

    final void b(int param0) {
        IntrusiveNode var4;
        IntrusiveNode var3;
        if (param0 == 23505) {
          while (true) {
            var3 = this.field_c.next;
            if (this.field_c != var3) {
              var3.unlink(4);
              continue;
            }
            break;
          }
          this.field_b = null;
          return;
        }
        field_a = -8;
        while (true) {
          var4 = this.field_c.next;
          if (this.field_c != var4) {
            var4.unlink(4);
            continue;
          }
          break;
        }
        this.field_b = null;
        return;
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != -16913) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.a(40, (IntrusiveNode) null);
          var2 = this.field_b;
          if (var2 == this.field_c) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.next;
          return var2;
        }
        var2Lifetime1 = this.field_b;
        if (var2Lifetime1 == this.field_c) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2Lifetime1.next;
        return var2Lifetime1;
    }

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 39) {
          this.d(-75);
          var2 = this.field_c.next;
          if (var2 != this.field_c) {
            var2.unlink(param0 - 35);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_c.next;
        if (var2Lifetime1 != this.field_c) {
          var2Lifetime1.unlink(param0 - 35);
          return var2Lifetime1;
        }
        return null;
    }

    public rk() {
        this.field_c = new IntrusiveNode();
        this.field_c.previous = this.field_c;
        this.field_c.next = this.field_c;
    }

    static {
    }
}
