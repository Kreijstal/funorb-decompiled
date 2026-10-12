/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NodeDeque {
    static int[] unlockLevelCosts;
    static boolean field_a;
    static int[] field_b;
    IntrusiveNode sentinel;
    private IntrusiveNode traversalCursor;

    final void moveAllTo(boolean obfuscationGuard, NodeDeque destination) {
        try {
          this.moveSuffixTo(this.sentinel.next, destination, -41);
          if (!obfuscationGuard) {
            this.clear(-29);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "at.I(" + obfuscationGuard + ',' + (destination != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode popFirst(int obfuscationGuard) {
        IntrusiveNode guardedFirstNode = null;
        IntrusiveNode firstNode;
        if (obfuscationGuard != 0) {
          field_a = false;
          guardedFirstNode = this.sentinel.next;
          if (guardedFirstNode != this.sentinel) {
            guardedFirstNode.unlink(obfuscationGuard + 101);
            return guardedFirstNode;
          }
          return null;
        }
        firstNode = this.sentinel.next;
        if (firstNode != this.sentinel) {
          firstNode.unlink(obfuscationGuard + 101);
          return firstNode;
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

    final IntrusiveNode startForwardAt(boolean obfuscationGuard, IntrusiveNode node) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (node != null) {
            var3 = node;
          } else {
            var3 = this.sentinel.next;
          }
          if (this.sentinel == var3) {
            this.traversalCursor = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          if (!obfuscationGuard) {
            this.traversalCursor = (IntrusiveNode) null;
          }
          this.traversalCursor = var3.next;
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("at.J(").append(obfuscationGuard).append(',');
          if (node == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final IntrusiveNode last(byte obfuscationGuard) {
        IntrusiveNode guardedLastNode = null;
        IntrusiveNode lastNode;
        if (obfuscationGuard >= -69) {
          unlockLevelCosts = (int[]) null;
          guardedLastNode = this.sentinel.previous;
          if (guardedLastNode != this.sentinel) {
            this.traversalCursor = guardedLastNode.previous;
            return guardedLastNode;
          }
          this.traversalCursor = null;
          return null;
        }
        lastNode = this.sentinel.previous;
        if (lastNode != this.sentinel) {
          this.traversalCursor = lastNode.previous;
          return lastNode;
        }
        this.traversalCursor = null;
        return null;
    }

    final IntrusiveNode popLast(byte obfuscationGuard) {
        IntrusiveNode lastNode = this.sentinel.previous;
        if (obfuscationGuard > -120) {
          this.isEmpty(true);
          if (this.sentinel != lastNode) {
            lastNode.unlink(127);
            return lastNode;
          }
          return null;
        }
        if (this.sentinel != lastNode) {
          lastNode.unlink(127);
          return lastNode;
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
          this.moveSuffixTo((IntrusiveNode) null, (NodeDeque) null, -6);
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final IntrusiveNode previous(byte obfuscationGuard) {
        IntrusiveNode previousNode = this.traversalCursor;
        int guardRemainder = -44 % ((obfuscationGuard + 5) / 34);
        if (previousNode == this.sentinel) {
          this.traversalCursor = null;
          return null;
        }
        this.traversalCursor = previousNode.previous;
        return previousNode;
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

    final void clear(int obfuscationGuard) {
        IntrusiveNode firstNode = null;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        while (true) {
          firstNode = this.sentinel.next;
          if (this.sentinel == firstNode) {
            break;
          }
          firstNode.unlink(-116);
        }
        this.traversalCursor = null;
        if (obfuscationGuard > 74) {
          return;
        }
        IntrusiveNode nullNode = (IntrusiveNode) null;
        this.addLast((byte) -117, (IntrusiveNode) null);
    }

    final boolean isEmpty(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          return this.sentinel == this.sentinel.next ? true : false;
        }
        this.traversalCursor = (IntrusiveNode) null;
        return this.sentinel == this.sentinel.next ? true : false;
    }

    private final void moveSuffixTo(IntrusiveNode firstNode, NodeDeque destination, int obfuscationGuard) {
        IntrusiveNode oldTail = null;
        RuntimeException var4_ref = null;
        int guardRemainder = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          oldTail = this.sentinel.previous;
          this.sentinel.previous = firstNode.previous;
          guardRemainder = 91 % ((61 - obfuscationGuard) / 58);
          firstNode.previous.next = this.sentinel;
          if (firstNode == this.sentinel) {
            return;
          }
          firstNode.previous = destination.sentinel.previous;
          firstNode.previous.next = firstNode;
          destination.sentinel.previous = oldTail;
          oldTail.next = destination.sentinel;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_5_0 = var4_ref;
          stackIn_5_1 = new StringBuilder().append("at.O(");
          if (firstNode == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (destination == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int size(boolean obfuscationGuard) {
        int count = 0;
        IntrusiveNode node = null;
        IntrusiveNode guardedNode;
        int guardedCount;
        if (!obfuscationGuard) {
          count = 0;
          node = this.sentinel.next;
          while (node != this.sentinel) {
            count++;
            node = node.next;
          }
          return count;
        }
        this.popFirst(-77);
        guardedCount = 0;
        guardedNode = this.sentinel.next;
        while (guardedNode != this.sentinel) {
          guardedCount++;
          guardedNode = guardedNode.next;
        }
        return guardedCount;
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "at.B(" + obfuscationGuard + ',' + (node != null ? "{...}" : "null") + ')');
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
