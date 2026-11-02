/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveDeque {
    static vn[] field_a;
    IntrusiveNode sentinel;
    static dj field_d;
    private IntrusiveNode field_c;

    final IntrusiveNode b(byte param0) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (this.sentinel == var2) {
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

    final void addLast(IntrusiveNode param0, int param1) {
        try {
          if (param0.next != null) {
            param0.unlink(-27598);
          }
          param0.previous = this.sentinel.previous;
          param0.next = this.sentinel;
          int var3_int = -120 / ((-52 - param1) / 59);
          param0.next.previous = param0;
          param0.previous.next = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "vo.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode a(boolean param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0) {
          this.sentinel = (IntrusiveNode) null;
          var2 = this.field_c;
          if (var2 != this.sentinel) {
            this.field_c = var2.previous;
            return var2;
          }
          this.field_c = null;
          return null;
        }
        var2Lifetime1 = this.field_c;
        if (var2Lifetime1 != this.sentinel) {
          this.field_c = var2Lifetime1.previous;
          return var2Lifetime1;
        }
        this.field_c = null;
        return null;
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = this.field_c;
        if (this.sentinel == var2) {
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

    final IntrusiveNode removeLast(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 <= 9) {
          this.a(-117);
          var2 = this.sentinel.previous;
          if (this.sentinel != var2) {
            var2.unlink(-27598);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.previous;
        if (this.sentinel != var2Lifetime1) {
          var2Lifetime1.unlink(-27598);
          return var2Lifetime1;
        }
        return null;
    }

    final int size(int param0) {
        int var4 = ZombieDawn.field_J;
        int var2 = 0;
        IntrusiveNode var3 = this.sentinel.previous;
        if (param0 > -43) {
          return -38;
        }
        while (this.sentinel != var3) {
          var2++;
          var3 = var3.previous;
        }
        return var2;
    }

    final void addFirst(int param0, IntrusiveNode param1) {
        try {
          if (param1.next != null) {
            param1.unlink(-27598);
          }
          param1.previous = this.sentinel;
          if (param0 != 0) {
            field_d = (dj) null;
          }
          param1.next = this.sentinel.next;
          param1.next.previous = param1;
          param1.previous.next = param1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "vo.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isEmpty(byte param0) {
        if (param0 >= -116) {
          return true;
        }
        return this.sentinel.previous == this.sentinel ? true : false;
    }

    final void clear(int param0) {
        IntrusiveNode var3 = null;
        int var4 = ZombieDawn.field_J;
        int var2 = -96 % ((param0 - 13) / 40);
        while (true) {
          var3 = this.sentinel.previous;
          if (var3 == this.sentinel) {
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
          this.isEmpty((byte) 96);
          var2 = this.sentinel.next;
          if (var2 != this.sentinel) {
            var2.unlink(-27598);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.next;
        if (var2Lifetime1 != this.sentinel) {
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

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }

    final IntrusiveNode e(int param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 == this.sentinel) {
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
