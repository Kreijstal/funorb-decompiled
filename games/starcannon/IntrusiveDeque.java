/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static int field_d;
    static int field_a;
    IntrusiveNode sentinel;
    private IntrusiveNode iterationCursor;

    final IntrusiveNode beginForward(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != -3905) {
          this.sentinel = (IntrusiveNode) null;
          var2 = this.sentinel.next;
          if (this.sentinel == var2) {
            this.iterationCursor = null;
            return null;
          }
          this.iterationCursor = var2.next;
          return var2;
        }
        var2Lifetime1 = this.sentinel.next;
        if (this.sentinel == var2Lifetime1) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2Lifetime1.next;
        return var2Lifetime1;
    }

    final void addLast(int param0, IntrusiveNode param1) {
        try {
          if (param0 <= 55) {
            this.beginForward(-56);
          }
          if (param1.previous != null) {
            param1.unlink(4);
          }
          param1.previous = this.sentinel.previous;
          param1.next = this.sentinel;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "rk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void addFirst(int param0, IntrusiveNode param1) {
        try {
          if (param1.previous != null) {
            param1.unlink(4);
          }
          param1.previous = this.sentinel;
          param1.next = this.sentinel.next;
          param1.previous.next = param1;
          if (param0 >= -44) {
            this.nextForward(63);
          }
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "rk.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode removeLast(int param0) {
        int var3 = 63 % ((param0 + 5) / 45);
        IntrusiveNode var2 = this.sentinel.previous;
        if (this.sentinel != var2) {
          var2.unlink(4);
          return var2;
        }
        return null;
    }

    final boolean isEmpty(boolean param0) {
        if (param0) {
          return this.sentinel == this.sentinel.next ? true : false;
        }
        this.removeFirst((byte) -75);
        return this.sentinel == this.sentinel.next ? true : false;
    }

    final void clear(int param0) {
        IntrusiveNode var4;
        IntrusiveNode var3;
        if (param0 == 23505) {
          while (true) {
            var3 = this.sentinel.next;
            if (this.sentinel != var3) {
              var3.unlink(4);
              continue;
            }
            break;
          }
          this.iterationCursor = null;
          return;
        }
        field_a = -8;
        while (true) {
          var4 = this.sentinel.next;
          if (this.sentinel != var4) {
            var4.unlink(4);
            continue;
          }
          break;
        }
        this.iterationCursor = null;
        return;
    }

    final IntrusiveNode nextForward(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != -16913) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.addFirst(40, (IntrusiveNode) null);
          var2 = this.iterationCursor;
          if (var2 == this.sentinel) {
            this.iterationCursor = null;
            return null;
          }
          this.iterationCursor = var2.next;
          return var2;
        }
        var2Lifetime1 = this.iterationCursor;
        if (var2Lifetime1 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2Lifetime1.next;
        return var2Lifetime1;
    }

    final IntrusiveNode removeFirst(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 39) {
          this.removeLast(-75);
          var2 = this.sentinel.next;
          if (var2 != this.sentinel) {
            var2.unlink(param0 - 35);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.next;
        if (var2Lifetime1 != this.sentinel) {
          var2Lifetime1.unlink(param0 - 35);
          return var2Lifetime1;
        }
        return null;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }

    static {
    }
}
