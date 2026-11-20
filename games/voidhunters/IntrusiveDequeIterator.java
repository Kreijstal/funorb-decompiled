/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDequeIterator {
    private IntrusiveDeque deque;
    static String field_d;
    static GameStateFactory field_a;
    private IntrusiveNode cursor;

    final IntrusiveNode previous(byte param0) {
        IntrusiveNode var2 = this.cursor;
        if (param0 != 108) {
          return (IntrusiveNode) null;
        }
        if (var2 != this.deque.sentinel) {
          this.cursor = var2.previous;
          return var2;
        }
        this.cursor = null;
        return null;
    }

    final IntrusiveNode last(byte param0) {
        if (param0 <= 61) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.deque.sentinel.previous;
        if (this.deque.sentinel != var2) {
          this.cursor = var2.previous;
          return var2;
        }
        this.cursor = null;
        return null;
    }

    final IntrusiveNode first(int param0) {
        IntrusiveNode var2 = this.deque.sentinel.next;
        if (param0 != 570) {
          this.deque = (IntrusiveDeque) null;
          if (var2 == this.deque.sentinel) {
            this.cursor = null;
            return null;
          }
          this.cursor = var2.next;
          return var2;
        }
        if (var2 == this.deque.sentinel) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.next;
        return var2;
    }

    final IntrusiveNode next(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 19072) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.startForward((IntrusiveNode) null, 109);
          var2 = this.cursor;
          if (this.deque.sentinel != var2) {
            this.cursor = var2.next;
            return var2;
          }
          this.cursor = null;
          return null;
        }
        var2Lifetime1 = this.cursor;
        if (this.deque.sentinel != var2Lifetime1) {
          this.cursor = var2Lifetime1.next;
          return var2Lifetime1;
        }
        this.cursor = null;
        return null;
    }

    final IntrusiveNode startBackward(byte param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 87) {
            this.next(73);
          }
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.deque.sentinel.previous;
          }
          if (var3 == this.deque.sentinel) {
            this.cursor = null;
            stackIn_8_0 = null;
            return (IntrusiveNode) (stackIn_8_0);
          }
          this.cursor = var3.previous;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("wc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -20221) {
          IntrusiveDequeIterator.clearSharedReferences(-115);
          field_d = null;
          field_a = null;
          return;
        }
        field_d = null;
        field_a = null;
    }

    final IntrusiveNode startForward(IntrusiveNode param0, int param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            var3 = this.deque.sentinel.next;
          } else {
            var3 = param0;
          }
          if (var3 == this.deque.sentinel) {
            this.cursor = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          this.cursor = var3.next;
          if (param1 != -28791) {
            field_d = (String) null;
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("wc.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    IntrusiveDequeIterator(IntrusiveDeque param0) {
        try {
          this.deque = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "wc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "To play a multiplayer game, please log in or create a free account.";
    }
}
