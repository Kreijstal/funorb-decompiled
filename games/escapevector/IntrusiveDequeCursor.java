/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDequeCursor {
    static String field_b;
    static String[] field_c;
    static Sprite field_e;
    private IntrusiveDeque deque;
    private IntrusiveNode cursor;

    public static void releaseStatics(boolean guard) {
        field_e = null;
        field_c = null;
        if (guard) {
          return;
        }
        field_b = null;
    }

    final IntrusiveNode lastFrom(byte guard, IntrusiveNode start) {
        IntrusiveNode var3 = null;
        String stackIn_14_2 = null;
        try {
          if (start != null) {
            var3 = start;
          } else {
            var3 = this.deque.sentinel.previous;
          }
          if (this.deque.sentinel == var3) {
            this.cursor = null;
            Object stackIn_6_0 = null;
            return (IntrusiveNode) (stackIn_6_0);
          }
          this.cursor = var3.previous;
          if (guard < 33) {
            IntrusiveNode var4 = (IntrusiveNode) null;
            this.lastFrom((byte) 25, (IntrusiveNode) null);
          }
          IntrusiveNode stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3_ref;
          StringBuilder stackIn_13_1 = new StringBuilder().append("wf.F(").append(guard).append(',');
          if (start == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final IntrusiveNode first(int guard) {
        IntrusiveNode var2 = this.deque.sentinel.next;
        if (this.deque.sentinel == var2) {
          this.cursor = null;
          return null;
        }
        if (guard == 15) {
          this.cursor = var2.next;
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final static int integerBitLength(int value, int guard) {
        if (value == 0) {
          return 0;
        }
        if (guard != 24787) {
          return 37;
        }
        if (0 < value) {
          int var2 = 1;
          if (value > 65535) {
            var2 += 16;
            value = value >> 16;
          }
          if (255 < value) {
            value = value >> 8;
            var2 += 8;
          }
          if (15 < value) {
            var2 += 4;
            value = value >> 4;
          }
          if (3 < value) {
            var2 += 2;
            value = value >> 2;
          }
          if (value > 1) {
            value = value >> 1;
            var2++;
          }
          return var2;
        }
        int var2Lifetime1 = 2;
        if (value < -65536) {
          var2Lifetime1 += 16;
          value = value >> 16;
        }
        if (-256 > value) {
          value = value >> 8;
          var2Lifetime1 += 8;
        }
        if (value < -16) {
          value = value >> 4;
          var2Lifetime1 += 4;
        }
        if (value < -4) {
          value = value >> 2;
          var2Lifetime1 += 2;
        }
        if (value < -2) {
          var2Lifetime1++;
          value = value >> 1;
        }
        return var2Lifetime1;
    }

    final IntrusiveNode firstFrom(int guard, IntrusiveNode start) {
        IntrusiveNode var3 = null;
        String stackIn_13_2 = null;
        try {
          if (start == null) {
            var3 = this.deque.sentinel.next;
          } else {
            var3 = start;
          }
          if (guard != -12818) {
            field_e = (Sprite) null;
          }
          if (var3 != this.deque.sentinel) {
            this.cursor = var3.next;
            IntrusiveNode stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.cursor = null;
          Object stackIn_7_0 = null;
          return (IntrusiveNode) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3_ref;
          StringBuilder stackIn_12_1 = new StringBuilder().append("wf.H(").append(guard).append(',');
          if (start == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final IntrusiveNode previous(byte guard) {
        if (guard <= 35) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.cursor;
        if (this.deque.sentinel == var2) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.previous;
        return var2;
    }

    final IntrusiveNode next(int guard) {
        IntrusiveNode var2 = this.cursor;
        if (var2 == this.deque.sentinel) {
          this.cursor = null;
          return null;
        }
        if (guard > 23) {
          this.cursor = var2.next;
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode last(int guard) {
        if (guard != -31616) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.firstFrom(-5, (IntrusiveNode) null);
          IntrusiveNode var2 = this.deque.sentinel.previous;
          if (this.deque.sentinel == var2) {
            this.cursor = null;
            return null;
          }
          this.cursor = var2.previous;
          return var2;
        }
        IntrusiveNode var2Lifetime1 = this.deque.sentinel.previous;
        if (this.deque.sentinel == var2Lifetime1) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2Lifetime1.previous;
        return var2Lifetime1;
    }

    IntrusiveDequeCursor(IntrusiveDeque deque) {
        try {
          this.deque = deque;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "wf.<init>(" + (deque != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Loading extra data";
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
