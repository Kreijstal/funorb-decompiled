/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static long field_a;
    static IntrusiveDeque field_d;
    IntrusiveNode field_g;
    static boolean field_c;
    static String field_f;
    private IntrusiveNode field_e;
    static int field_b;

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = this.field_e;
        if (this.field_g == var2) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.next;
        if (param0 == 0) {
          return var2;
        }
        this.field_g = (IntrusiveNode) null;
        return var2;
    }

    final IntrusiveNode a(IntrusiveNode param0, int param1) {
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
            var3 = this.field_g.next;
          } else {
            var3 = param0;
          }
          if (var3 == this.field_g) {
            this.field_e = null;
            stackIn_8_0 = null;
            return (IntrusiveNode) (stackIn_8_0);
          }
          this.field_e = var3.next;
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

    final int g(int param0) {
        int var4 = BachelorFridge.field_y;
        int var2 = param0;
        IntrusiveNode var3 = this.field_g.next;
        while (this.field_g != var3) {
          var2++;
          var3 = var3.next;
        }
        return var2;
    }

    final IntrusiveNode b(byte param0) {
        if (param0 != 90) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_g.next;
        if (var2 == this.field_g) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.next;
        return var2;
    }

    final IntrusiveNode c(byte param0) {
        IntrusiveNode var2 = this.field_e;
        if (var2 == this.field_g) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.previous;
        if (param0 == 116) {
          return var2;
        }
        this.b((byte) -39);
        return var2;
    }

    final void d(int param0) {
        IntrusiveNode var2 = null;
        int var3 = BachelorFridge.field_y;
        while (true) {
          var2 = this.field_g.next;
          if (var2 == this.field_g) {
            break;
          }
          var2.unlink(false);
        }
        if (param0 > 56) {
          this.field_e = null;
          return;
        }
        this.c((byte) -57);
        this.field_e = null;
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
        IntrusiveDeque.b(60);
        ld.a(16711872, 6, param0 - 31838, 6);
    }

    final int a(byte param0, IntrusiveNode[] param1) {
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
          var4 = this.field_g.next;
          if (param0 < 65) {
            this.e(98);
          }
          while (var4 != this.field_g) {
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

    final boolean e(int param0) {
        if (param0 == 12917) {
          return this.field_g.next == this.field_g ? true : false;
        }
        this.c((byte) -117);
        return this.field_g.next == this.field_g ? true : false;
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 != 7) {
          field_a = 30L;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final void a(int param0, IntrusiveNode param1) {
        if (param1.previous != null) {
          param1.unlink(false);
        }
        param1.next = this.field_g.next;
        param1.previous = this.field_g;
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

    private final void a(IntrusiveDeque param0, IntrusiveNode param1, boolean param2) {
        IntrusiveNode var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = this.field_g.previous;
          this.field_g.previous = param1.previous;
          param1.previous.next = this.field_g;
          if (!param2) {
            this.a(true);
          }
          if (param1 == this.field_g) {
            return;
          }
          param1.previous = param0.field_g.previous;
          param1.previous.next = param1;
          var4.next = param0.field_g;
          param0.field_g.previous = var4;
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

    final void a(IntrusiveDeque param0, int param1) {
        try {
          this.a(param0, this.field_g.next, true);
          if (param1 != 12632256) {
            IntrusiveNode var4 = (IntrusiveNode) null;
            this.a((IntrusiveDeque) null, (IntrusiveNode) null, true);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "eaa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = this.field_g.previous;
        if (this.field_g == var2) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.previous;
        if (param0 == 6) {
          return var2;
        }
        IntrusiveNode var3 = (IntrusiveNode) null;
        this.a((IntrusiveNode) null, false);
        return var2;
    }

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = this.field_g.previous;
        if (param0 != -124) {
          return (IntrusiveNode) null;
        }
        if (this.field_g != var2) {
          var2.unlink(false);
          return var2;
        }
        return null;
    }

    final void a(IntrusiveNode param0, boolean param1) {
        try {
          if (null != param0.previous) {
            param0.unlink(!param1 ? true : false);
          }
          param0.next = this.field_g;
          if (!param1) {
            IntrusiveNode var4 = (IntrusiveNode) null;
            this.a((IntrusiveNode) null, 125);
          }
          param0.previous = this.field_g.previous;
          param0.previous.next = param0;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "eaa.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode a(boolean param0) {
        IntrusiveNode var2 = this.field_g.next;
        if (var2 == this.field_g) {
          return null;
        }
        var2.unlink(param0);
        return var2;
    }

    public IntrusiveDeque() {
        this.field_g = new IntrusiveNode();
        this.field_g.previous = this.field_g;
        this.field_g.next = this.field_g;
    }

    static {
        field_c = true;
        field_f = "Show all game chat";
        field_b = -1;
        field_d = new IntrusiveDeque();
    }
}
