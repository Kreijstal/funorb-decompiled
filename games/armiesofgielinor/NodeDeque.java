/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NodeDeque {
    static int[] unlockLevelCosts;
    static boolean field_a;
    static int[] field_b;
    IntrusiveNode sentinel;
    private IntrusiveNode traversalCursor;

    final void a(boolean param0, NodeDeque param1) {
        try {
          this.a(this.sentinel.next, param1, -41);
          if (!param0) {
            this.b(-29);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "at.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 0) {
          field_a = false;
          var2 = this.sentinel.next;
          if (var2 != this.sentinel) {
            var2.unlink(param0 + 101);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.next;
        if (var2Lifetime1 != this.sentinel) {
          var2Lifetime1.unlink(param0 + 101);
          return var2Lifetime1;
        }
        return null;
    }

    public static void c(int param0) {
        unlockLevelCosts = null;
        field_b = null;
        if (param0 != 250) {
          field_b = (int[]) null;
        }
    }

    final IntrusiveNode first(byte obfuscationGuard) {
        IntrusiveNode var2 = this.sentinel.next;
        if (this.sentinel == var2) {
          this.traversalCursor = null;
          return null;
        }
        this.traversalCursor = var2.next;
        if (obfuscationGuard > 86) {
          return var2;
        }
        unlockLevelCosts = (int[]) null;
        return var2;
    }

    final IntrusiveNode a(boolean param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.sentinel.next;
          }
          if (this.sentinel == var3) {
            this.traversalCursor = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          if (!param0) {
            this.traversalCursor = (IntrusiveNode) null;
          }
          this.traversalCursor = var3.next;
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("at.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final IntrusiveNode d(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 >= -69) {
          unlockLevelCosts = (int[]) null;
          var2 = this.sentinel.previous;
          if (var2 != this.sentinel) {
            this.traversalCursor = var2.previous;
            return var2;
          }
          this.traversalCursor = null;
          return null;
        }
        var2Lifetime1 = this.sentinel.previous;
        if (var2Lifetime1 != this.sentinel) {
          this.traversalCursor = var2Lifetime1.previous;
          return var2Lifetime1;
        }
        this.traversalCursor = null;
        return null;
    }

    final IntrusiveNode c(byte param0) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (param0 > -120) {
          this.a(true);
          if (this.sentinel != var2) {
            var2.unlink(127);
            return var2;
          }
          return null;
        }
        if (this.sentinel != var2) {
          var2.unlink(127);
          return var2;
        }
        return null;
    }

    final void addFirst(int obfuscationGuard, IntrusiveNode node) {
        RuntimeException var3 = null;
        NodeDeque var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (node.previous != null) {
            node.unlink(66);
          }
          node.previous = this.sentinel;
          node.next = this.sentinel.next;
          node.previous.next = node;
          node.next.previous = node;
          if (obfuscationGuard == 750) {
            return;
          }
          var4 = (NodeDeque) null;
          this.a((IntrusiveNode) null, (NodeDeque) null, -6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("at.H(").append(obfuscationGuard).append(',');
          if (node == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final IntrusiveNode b(byte param0) {
        IntrusiveNode var2 = this.traversalCursor;
        int var3 = -44 % ((param0 + 5) / 34);
        if (var2 == this.sentinel) {
          this.traversalCursor = null;
          return null;
        }
        this.traversalCursor = var2.previous;
        return var2;
    }

    final IntrusiveNode next(byte obfuscationGuard) {
        IntrusiveNode var2 = this.traversalCursor;
        if (this.sentinel == var2) {
          this.traversalCursor = null;
          return null;
        }
        if (obfuscationGuard == 123) {
          this.traversalCursor = var2.next;
          return var2;
        }
        field_a = false;
        this.traversalCursor = var2.next;
        return var2;
    }

    final void b(int param0) {
        IntrusiveNode var2 = null;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        while (true) {
          var2 = this.sentinel.next;
          if (this.sentinel == var2) {
            break;
          }
          var2.unlink(-116);
        }
        this.traversalCursor = null;
        if (param0 > 74) {
          return;
        }
        IntrusiveNode var4 = (IntrusiveNode) null;
        this.addLast((byte) -117, (IntrusiveNode) null);
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return this.sentinel == this.sentinel.next ? true : false;
        }
        this.traversalCursor = (IntrusiveNode) null;
        return this.sentinel == this.sentinel.next ? true : false;
    }

    private final void a(IntrusiveNode param0, NodeDeque param1, int param2) {
        IntrusiveNode var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = this.sentinel.previous;
          this.sentinel.previous = param0.previous;
          var5 = 91 % ((61 - param2) / 58);
          param0.previous.next = this.sentinel;
          if (param0 == this.sentinel) {
            return;
          }
          param0.previous = param1.sentinel.previous;
          param0.previous.next = param0;
          param1.sentinel.previous = var4;
          var4.next = param1.sentinel;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_5_0 = var4_ref;
          stackIn_5_1 = new StringBuilder().append("at.O(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final int b(boolean param0) {
        int var2 = 0;
        IntrusiveNode var3 = null;
        IntrusiveNode var3Lifetime1;
        int var2Lifetime1;
        if (!param0) {
          var2 = 0;
          var3 = this.sentinel.next;
          while (var3 != this.sentinel) {
            var2++;
            var3 = var3.next;
          }
          return var2;
        }
        this.a(-77);
        var2Lifetime1 = 0;
        var3Lifetime1 = this.sentinel.next;
        while (var3Lifetime1 != this.sentinel) {
          var2Lifetime1++;
          var3Lifetime1 = var3Lifetime1.next;
        }
        return var2Lifetime1;
    }

    final void addLast(byte obfuscationGuard, IntrusiveNode node) {
        try {
          if (node.previous != null) {
            node.unlink(obfuscationGuard + 181);
          }
          node.previous = this.sentinel.previous;
          node.next = this.sentinel;
          if (obfuscationGuard != -119) {
            field_a = true;
          }
          node.previous.next = node;
          node.next.previous = node;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "at.B(" + obfuscationGuard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    public NodeDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.next = this.sentinel;
        this.sentinel.previous = this.sentinel;
    }

    static {
        unlockLevelCosts = new int[]{50, 100, 250, 500, 750, 1000, 2500, 5000, 7500, 10000};
    }
}
