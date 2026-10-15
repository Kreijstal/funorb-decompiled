/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NodeDequeCursor {
    private IntrusiveNode cursor;
    static int[][] boardLayoutYByPlayerCount;
    private NodeDeque deque;
    static int screenTransitionTick;
    static RgbSprite[][] constructionSegsSprites;
    static int[][] boardLayoutXByPlayerCount;
    static ResourceArchive field_i;
    static int[][] boardScaleDivisorsByPlayerCount;
    static RgbSprite field_b;

    public static void c(int param0) {
        field_b = null;
        field_i = null;
        constructionSegsSprites = (RgbSprite[][]) null;
        boardScaleDivisorsByPlayerCount = (int[][]) null;
        boardLayoutYByPlayerCount = (int[][]) null;
        if (param0 > 23) {
          boardLayoutXByPlayerCount = (int[][]) null;
          return;
        }
        field_i = (ResourceArchive) null;
        boardLayoutXByPlayerCount = (int[][]) null;
    }

    final IntrusiveNode last(boolean obfuscationGuard) {
        IntrusiveNode var2 = this.deque.sentinel.previous;
        if (!obfuscationGuard) {
          this.first(-11);
          if (var2 != this.deque.sentinel) {
            this.cursor = var2.previous;
            return var2;
          }
          this.cursor = null;
          return null;
        }
        if (var2 != this.deque.sentinel) {
          this.cursor = var2.previous;
          return var2;
        }
        this.cursor = null;
        return null;
    }

    final IntrusiveNode previous(int obfuscationGuard) {
        if (obfuscationGuard != -24706) {
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

    NodeDequeCursor(NodeDeque deque) {
        try {
          this.deque = deque;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "kh.<init>(" + (deque != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode next(int obfuscationGuard) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (obfuscationGuard != 7) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.lastFrom(16, (IntrusiveNode) null);
          var2 = this.cursor;
          if (var2 == this.deque.sentinel) {
            this.cursor = null;
            return null;
          }
          this.cursor = var2.next;
          return var2;
        }
        var2Lifetime1 = this.cursor;
        if (var2Lifetime1 == this.deque.sentinel) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2Lifetime1.next;
        return var2Lifetime1;
    }

    final IntrusiveNode first(int obfuscationGuard) {
        IntrusiveNode var2 = this.deque.sentinel.next;
        if (var2 == this.deque.sentinel) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.next;
        if (obfuscationGuard == 240) {
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode lastFrom(int obfuscationGuard, IntrusiveNode node) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (node != null) {
            var3 = node;
          } else {
            var3 = this.deque.sentinel.previous;
          }
          if (obfuscationGuard != 16802) {
            this.previous(-118);
          }
          if (var3 != this.deque.sentinel) {
            this.cursor = var3.previous;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.cursor = null;
          stackIn_7_0 = null;
          return (IntrusiveNode) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("kh.F(").append(obfuscationGuard).append(',');
          if (node == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final IntrusiveNode firstFrom(int obfuscationGuard, IntrusiveNode node) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        IntrusiveNode stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (node == null) {
            var3 = this.deque.sentinel.next;
          } else {
            var3 = node;
          }
          if (this.deque.sentinel == var3) {
            this.cursor = null;
            stackIn_6_0 = null;
            return (IntrusiveNode) (stackIn_6_0);
          }
          this.cursor = var3.next;
          if (obfuscationGuard >= 100) {
            stackIn_11_0 = var3;
            return stackIn_11_0;
          }
          stackIn_9_0 = (IntrusiveNode) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("kh.A(").append(obfuscationGuard).append(',');
          if (node == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        boardLayoutYByPlayerCount = new int[5][];
        boardLayoutXByPlayerCount = new int[5][];
        boardScaleDivisorsByPlayerCount = new int[5][];
        boardLayoutXByPlayerCount[0] = new int[]{7};
        boardLayoutXByPlayerCount[3] = new int[]{167, 7, 480, 480, 7};
        boardLayoutXByPlayerCount[4] = new int[]{167, 7, 7, 480, 480};
        boardLayoutXByPlayerCount[2] = new int[]{167, 7, 480, 480, 7};
        boardLayoutXByPlayerCount[1] = new int[]{7, 327};
        boardLayoutYByPlayerCount[4] = new int[]{7, 7, 240, 240, 7};
        boardLayoutYByPlayerCount[3] = new int[]{7, 7, 240, 7, 240};
        boardLayoutYByPlayerCount[2] = new int[]{7, 7, 7, 240, 240};
        boardLayoutYByPlayerCount[1] = new int[]{7, 7};
        boardLayoutYByPlayerCount[0] = new int[]{7};
        boardScaleDivisorsByPlayerCount[0] = new int[]{1};
        boardScaleDivisorsByPlayerCount[2] = new int[]{1, 2, 2, 2, 2};
        boardScaleDivisorsByPlayerCount[4] = new int[]{1, 2, 2, 2, 2};
        boardScaleDivisorsByPlayerCount[3] = new int[]{1, 2, 2, 2, 2};
        boardScaleDivisorsByPlayerCount[1] = new int[]{1, 1};
    }
}
