/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    IntrusiveNode sentinel;
    static Vector2 field_a;
    private IntrusiveNode traversalCursor;
    static Vector2 field_d;
    static String field_b;
    static int[] field_f;

    final IntrusiveNode removeLast(int obfuscationGuard) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (obfuscationGuard != 4095) {
          this.traversalCursor = (IntrusiveNode) null;
          var2 = this.sentinel.previous;
          if (this.sentinel != var2) {
            var2.unlink(-124);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.previous;
        if (this.sentinel != var2Lifetime1) {
          var2Lifetime1.unlink(-124);
          return var2Lifetime1;
        }
        return null;
    }

    final boolean isEmpty(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return this.sentinel.next == this.sentinel ? true : false;
        }
        this.sentinel = (IntrusiveNode) null;
        return this.sentinel.next == this.sentinel ? true : false;
    }

    final IntrusiveNode previous(int obfuscationGuard) {
        if (obfuscationGuard <= 50) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.traversalCursor;
        if (this.sentinel != var2) {
          this.traversalCursor = var2.previous;
          return var2;
        }
        this.traversalCursor = null;
        return null;
    }

    final static int a(int param0, as param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 80 / ((-18 - param0) / 45);
          if (param1 == bd.field_C) {
            stackIn_15_0 = 7681;
            return stackIn_15_0;
          }
          if (ru.field_a == param1) {
            stackIn_13_0 = 8448;
            return stackIn_13_0;
          }
          if (param1 == du.field_l) {
            stackIn_4_0 = 34165;
            return stackIn_4_0;
          }
          if (param1 == lo.field_j) {
            stackIn_7_0 = 260;
            return stackIn_7_0;
          }
          if (fs.field_d != param1) {
            throw new IllegalArgumentException();
          }
          stackIn_11_0 = 34023;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("kp.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static int a(boolean param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_2_0 = -40;
            return stackIn_2_0;
          }
          if (param2) {
            stackIn_7_0 = FlightSession.field_e.a(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = nh.field_c.a(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kp.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final IntrusiveNode removeFirst(int obfuscationGuard) {
        IntrusiveNode var2 = this.sentinel.next;
        if (obfuscationGuard <= 119) {
          return (IntrusiveNode) null;
        }
        if (var2 != this.sentinel) {
          var2.unlink(-124);
          return var2;
        }
        return null;
    }

    final IntrusiveNode last(byte obfuscationGuard) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (var2 == this.sentinel) {
          this.traversalCursor = null;
          return null;
        }
        this.traversalCursor = var2.previous;
        if (obfuscationGuard <= -26) {
          return var2;
        }
        return (IntrusiveNode) null;
    }

    public static void f(int param0) {
        field_b = null;
        field_f = null;
        if (param0 == -19854) {
          field_d = null;
          field_a = null;
          return;
        }
        as var2 = (as) null;
        IntrusiveDeque.a(-73, (as) null);
        field_d = null;
        field_a = null;
    }

    final void addLast(int obfuscationGuard, IntrusiveNode node) {
        try {
          if (null != node.previous) {
            node.unlink(-128);
          }
          node.previous = this.sentinel.previous;
          node.next = this.sentinel;
          if (obfuscationGuard < 65) {
            String var4 = (String) null;
            IntrusiveDeque.a(false, (String) null, true);
          }
          node.previous.next = node;
          node.next.previous = node;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kp.I(" + obfuscationGuard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    final void addFirst(IntrusiveNode node, int obfuscationGuard) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (node.previous != null) {
            node.unlink(obfuscationGuard - 25736);
          }
          node.next = this.sentinel.next;
          node.previous = this.sentinel;
          node.previous.next = node;
          node.next.previous = node;
          if (obfuscationGuard == 25611) {
            return;
          }
          this.sentinel = (IntrusiveNode) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("kp.G(");
          if (node == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final IntrusiveNode next(byte obfuscationGuard) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (obfuscationGuard != 103) {
          String var3 = (String) null;
          IntrusiveDeque.a(false, (String) null, true);
          var2 = this.traversalCursor;
          if (var2 != this.sentinel) {
            this.traversalCursor = var2.next;
            return var2;
          }
          this.traversalCursor = null;
          return null;
        }
        var2Lifetime1 = this.traversalCursor;
        if (var2Lifetime1 != this.sentinel) {
          this.traversalCursor = var2Lifetime1.next;
          return var2Lifetime1;
        }
        this.traversalCursor = null;
        return null;
    }

    final IntrusiveNode first(int obfuscationGuard) {
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 == this.sentinel) {
          this.traversalCursor = null;
          return null;
        }
        if (obfuscationGuard == 268435455) {
          this.traversalCursor = var2.next;
          return var2;
        }
        IntrusiveDeque.f(-106);
        this.traversalCursor = var2.next;
        return var2;
    }

    final void clear(int obfuscationGuard) {
        IntrusiveNode var2 = null;
        int var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        while (true) {
          var2 = this.sentinel.next;
          if (var2 == this.sentinel) {
            break;
          }
          var2.unlink(obfuscationGuard - 268435583);
        }
        if (obfuscationGuard == 268435455) {
          this.traversalCursor = null;
          return;
        }
        IntrusiveNode var4 = (IntrusiveNode) null;
        this.addFirst((IntrusiveNode) null, 37);
        this.traversalCursor = null;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }

    static {
        field_a = new Vector2();
        field_d = new Vector2();
        field_b = ",";
        field_f = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
