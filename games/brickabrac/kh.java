/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    private IntrusiveNode field_f;
    static int[][] field_e;
    private NodeDeque field_g;
    static int field_a;
    static RgbSprite[][] field_d;
    static int[][] field_c;
    static mf field_i;
    static int[][] field_h;
    static RgbSprite field_b;

    public static void c(int param0) {
        field_b = null;
        field_i = null;
        field_d = (RgbSprite[][]) null;
        field_h = (int[][]) null;
        field_e = (int[][]) null;
        if (param0 > 23) {
          field_c = (int[][]) null;
          return;
        }
        field_i = (mf) null;
        field_c = (int[][]) null;
    }

    final IntrusiveNode a(boolean param0) {
        IntrusiveNode var2 = this.field_g.sentinel.previous;
        if (!param0) {
          this.a(-11);
          if (var2 != this.field_g.sentinel) {
            this.field_f = var2.previous;
            return var2;
          }
          this.field_f = null;
          return null;
        }
        if (var2 != this.field_g.sentinel) {
          this.field_f = var2.previous;
          return var2;
        }
        this.field_f = null;
        return null;
    }

    final IntrusiveNode d(int param0) {
        if (param0 != -24706) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_f;
        if (this.field_g.sentinel == var2) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.previous;
        return var2;
    }

    kh(NodeDeque param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "kh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode b(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 7) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.b(16, (IntrusiveNode) null);
          var2 = this.field_f;
          if (var2 == this.field_g.sentinel) {
            this.field_f = null;
            return null;
          }
          this.field_f = var2.next;
          return var2;
        }
        var2Lifetime1 = this.field_f;
        if (var2Lifetime1 == this.field_g.sentinel) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2Lifetime1.next;
        return var2Lifetime1;
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = this.field_g.sentinel.next;
        if (var2 == this.field_g.sentinel) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.next;
        if (param0 == 240) {
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode b(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_g.sentinel.previous;
          }
          if (param0 != 16802) {
            this.d(-118);
          }
          if (var3 != this.field_g.sentinel) {
            this.field_f = var3.previous;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_f = null;
          stackIn_7_0 = null;
          return (IntrusiveNode) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("kh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final IntrusiveNode a(int param0, IntrusiveNode param1) {
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
          if (param1 == null) {
            var3 = this.field_g.sentinel.next;
          } else {
            var3 = param1;
          }
          if (this.field_g.sentinel == var3) {
            this.field_f = null;
            stackIn_6_0 = null;
            return (IntrusiveNode) (stackIn_6_0);
          }
          this.field_f = var3.next;
          if (param0 >= 100) {
            stackIn_11_0 = var3;
            return stackIn_11_0;
          }
          stackIn_9_0 = (IntrusiveNode) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("kh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_e = new int[5][];
        field_c = new int[5][];
        field_h = new int[5][];
        field_c[0] = new int[]{7};
        field_c[3] = new int[]{167, 7, 480, 480, 7};
        field_c[4] = new int[]{167, 7, 7, 480, 480};
        field_c[2] = new int[]{167, 7, 480, 480, 7};
        field_c[1] = new int[]{7, 327};
        field_e[4] = new int[]{7, 7, 240, 240, 7};
        field_e[3] = new int[]{7, 7, 240, 7, 240};
        field_e[2] = new int[]{7, 7, 7, 240, 240};
        field_e[1] = new int[]{7, 7};
        field_e[0] = new int[]{7};
        field_h[0] = new int[]{1};
        field_h[2] = new int[]{1, 2, 2, 2, 2};
        field_h[4] = new int[]{1, 2, 2, 2, 2};
        field_h[3] = new int[]{1, 2, 2, 2, 2};
        field_h[1] = new int[]{1, 1};
    }
}
