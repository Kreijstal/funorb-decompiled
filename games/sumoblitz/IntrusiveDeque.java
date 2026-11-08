/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static int field_b;
    static ToolkitSprite field_d;
    static ToolkitSprite[] field_c;
    IntrusiveNode sentinel;
    private IntrusiveNode cursor;

    final IntrusiveNode last(int param0) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (this.sentinel == var2) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.previous;
        if (param0 == 9) {
          return var2;
        }
        this.isEmpty((byte) 19);
        return var2;
    }

    final IntrusiveNode next(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 18) {
          this.removeLast((byte) -83);
          var2 = this.cursor;
          if (var2 != this.sentinel) {
            this.cursor = var2.next;
            return var2;
          }
          this.cursor = null;
          return null;
        }
        var2Lifetime1 = this.cursor;
        if (var2Lifetime1 != this.sentinel) {
          this.cursor = var2Lifetime1.next;
          return var2Lifetime1;
        }
        this.cursor = null;
        return null;
    }

    final void addFirst(IntrusiveNode param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.previous != null) {
            param0.unlink(false);
          }
          param0.previous = this.sentinel;
          param0.next = this.sentinel.next;
          param0.previous.next = param0;
          param0.next.previous = param0;
          if (param1 == -10295) {
            return;
          }
          this.cursor = (IntrusiveNode) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jn.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode previous(int param0) {
        IntrusiveNode var2 = this.cursor;
        if (var2 == this.sentinel) {
          this.cursor = null;
          return null;
        }
        if (param0 == 9) {
          this.cursor = var2.previous;
          return var2;
        }
        this.next((byte) 68);
        this.cursor = var2.previous;
        return var2;
    }

    final boolean isEmpty(byte param0) {
        if (param0 <= -65) {
          return this.sentinel.next == this.sentinel ? true : false;
        }
        this.clear(-106);
        return this.sentinel.next == this.sentinel ? true : false;
    }

    final void addLast(IntrusiveNode param0, byte param1) {
        if (param0.previous != null) {
          param0.unlink(false);
        }
        param0.next = this.sentinel;
        param0.previous = this.sentinel.previous;
        param0.previous.next = param0;
        if (param1 != 39) {
          return;
        }
        try {
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode removeLast(byte param0) {
        if (param0 >= -98) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.sentinel.previous;
        if (this.sentinel != var2) {
          var2.unlink(false);
          return var2;
        }
        return null;
    }

    final IntrusiveNode removeFirst(int param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 == this.sentinel) {
          return null;
        }
        if (param0 == 9) {
          var2.unlink(false);
          return var2;
        }
        IntrusiveNode var3 = (IntrusiveNode) null;
        this.addLast((IntrusiveNode) null, (byte) 81);
        var2.unlink(false);
        return var2;
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        if (param0 != 117) {
          field_b = 93;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final IntrusiveNode first(int param0) {
        int var3 = 64 % ((5 - param0) / 61);
        IntrusiveNode var2 = this.sentinel.next;
        if (this.sentinel != var2) {
          this.cursor = var2.next;
          return var2;
        }
        this.cursor = null;
        return null;
    }

    final void clear(int param0) {
        IntrusiveNode var2 = null;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        while (true) {
          var2 = this.sentinel.next;
          if (this.sentinel == var2) {
            break;
          }
          var2.unlink(false);
        }
        if (param0 >= 114) {
          this.cursor = null;
          return;
        }
        field_d = (ToolkitSprite) null;
        this.cursor = null;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }

    static {
        field_b = 9;
    }
}
