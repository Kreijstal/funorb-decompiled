/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static long field_a;
    static IntrusiveDeque field_d;
    IntrusiveNode sentinel;
    static boolean field_c;
    static String field_f;
    private IntrusiveNode iterationCursor;
    static int field_b;

    final IntrusiveNode nextForward(int param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.next;
        if (param0 == 0) {
          return var2;
        }
        this.sentinel = (IntrusiveNode) null;
        return var2;
    }

    final IntrusiveNode beginForwardFrom(IntrusiveNode param0, int param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_a = 81L;
          }
          if (param0 == null) {
            var3 = this.sentinel.next;
          } else {
            var3 = param0;
          }
          if (var3 == this.sentinel) {
            this.iterationCursor = null;
            stackIn_8_0 = null;
            return (IntrusiveNode) (stackIn_8_0);
          }
          this.iterationCursor = var3.next;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("eaa.Q(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final int countWithOffset(int param0) {
        int var4 = BachelorFridge.field_y;
        int var2 = param0;
        IntrusiveNode var3 = this.sentinel.next;
        while (this.sentinel != var3) {
          var2++;
          var3 = var3.next;
        }
        return var2;
    }

    final IntrusiveNode beginForward(byte param0) {
        if (param0 != 90) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.next;
        return var2;
    }

    final IntrusiveNode nextBackward(byte param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.previous;
        if (param0 == 116) {
          return var2;
        }
        this.beginForward((byte) -39);
        return var2;
    }

    final void clear(int param0) {
        IntrusiveNode var2 = null;
        int var3 = BachelorFridge.field_y;
        while (true) {
          var2 = this.sentinel.next;
          if (var2 == this.sentinel) {
            break;
          }
          var2.unlink(false);
        }
        if (param0 > 56) {
          this.iterationCursor = null;
          return;
        }
        this.nextBackward((byte) -57);
        this.iterationCursor = null;
    }

    final static void f(int param0) {
        ld.a(16777215, 0, 45, 0);
        ld.a(12648447, 3, 45, 3);
        ld.a(16777152, 5, 45, 5);
        ld.a(49407, 2, 45, 2);
        ld.a(12648384, 4, 45, 4);
        ld.a(16760832, 1, param0 ^ 31910, 1);
        ld.a(12632256, 7, 45, 7);
        if (param0 == 31883) {
          ld.a(16711872, 6, param0 - 31838, 6);
          return;
        }
        IntrusiveDeque.resetStaticState(60);
        ld.a(16711872, 6, param0 - 31838, 6);
    }

    final int copyToArray(byte param0, IntrusiveNode[] param1) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        IntrusiveNode var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          var3_int = 0;
          var4 = this.sentinel.next;
          if (param0 < 65) {
            this.isEmpty(98);
          }
          while (var4 != this.sentinel) {
            incrementValue$1 = var3_int;
            var3_int++;
            param1[incrementValue$1] = var4;
            var4 = var4.next;
          }
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("eaa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean isEmpty(int param0) {
        if (param0 == 12917) {
          return this.sentinel.next == this.sentinel ? true : false;
        }
        this.nextBackward((byte) -117);
        return this.sentinel.next == this.sentinel ? true : false;
    }

    public static void resetStaticState(int param0) {
        field_f = null;
        if (param0 != 7) {
          field_a = 30L;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final void addFirst(int param0, IntrusiveNode param1) {
        if (param1.previous != null) {
          param1.unlink(false);
        }
        param1.next = this.sentinel.next;
        param1.previous = this.sentinel;
        param1.previous.next = param1;
        if (param0 > -2) {
          return;
        }
        try {
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "eaa.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void moveSuffixTo(IntrusiveDeque param0, IntrusiveNode param1, boolean param2) {
        IntrusiveNode var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = this.sentinel.previous;
          this.sentinel.previous = param1.previous;
          param1.previous.next = this.sentinel;
          if (!param2) {
            this.removeFirst(true);
          }
          if (param1 == this.sentinel) {
            return;
          }
          param1.previous = param0.sentinel.previous;
          param1.previous.next = param1;
          var4.next = param0.sentinel;
          param0.sentinel.previous = var4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("eaa.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final void moveAllTo(IntrusiveDeque param0, int param1) {
        try {
          this.moveSuffixTo(param0, this.sentinel.next, true);
          if (param1 != 12632256) {
            IntrusiveNode var4 = (IntrusiveNode) null;
            this.moveSuffixTo((IntrusiveDeque) null, (IntrusiveNode) null, true);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "eaa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode beginBackward(int param0) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.previous;
        if (param0 == 6) {
          return var2;
        }
        IntrusiveNode var3 = (IntrusiveNode) null;
        this.addLast((IntrusiveNode) null, false);
        return var2;
    }

    final IntrusiveNode removeLast(byte param0) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (param0 != -124) {
          return (IntrusiveNode) null;
        }
        if (this.sentinel != var2) {
          var2.unlink(false);
          return var2;
        }
        return null;
    }

    final void addLast(IntrusiveNode param0, boolean param1) {
        try {
          if (null != param0.previous) {
            param0.unlink(!param1 ? true : false);
          }
          param0.next = this.sentinel;
          if (!param1) {
            IntrusiveNode var4 = (IntrusiveNode) null;
            this.beginForwardFrom((IntrusiveNode) null, 125);
          }
          param0.previous = this.sentinel.previous;
          param0.previous.next = param0;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "eaa.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode removeFirst(boolean param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 == this.sentinel) {
          return null;
        }
        var2.unlink(param0);
        return var2;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }

    static {
        field_c = true;
        field_f = "Show all game chat";
        field_b = -1;
        field_d = new IntrusiveDeque();
    }
}
