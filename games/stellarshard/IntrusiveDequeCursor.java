/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDequeCursor {
    private IntrusiveDeque field_e;
    static String[] field_c;
    static String field_b;
    static Sprite field_f;
    private IntrusiveNode field_a;
    static String field_d;

    final IntrusiveNode b(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_e.sentinel.next;
          } else {
            var3 = param1;
          }
          if (param0 != 4993) {
            this.b((byte) -10);
          }
          if (this.field_e.sentinel == var3) {
            this.field_a = null;
            stackIn_8_0 = null;
            return (IntrusiveNode) (stackIn_8_0);
          }
          this.field_a = var3.next;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ug.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final IntrusiveNode a(int param0) {
        int var2 = 26 % ((4 - param0) / 50);
        IntrusiveNode var3 = this.field_a;
        if (var3 != this.field_e.sentinel) {
          this.field_a = var3.previous;
          return var3;
        }
        this.field_a = null;
        return null;
    }

    final IntrusiveNode a(boolean param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (!param0) {
          this.field_a = (IntrusiveNode) null;
          var2 = this.field_a;
          if (var2 == this.field_e.sentinel) {
            this.field_a = null;
            return null;
          }
          this.field_a = var2.next;
          return var2;
        }
        var2Lifetime1 = this.field_a;
        if (var2Lifetime1 == this.field_e.sentinel) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2Lifetime1.next;
        return var2Lifetime1;
    }

    final IntrusiveNode a(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_e.sentinel.previous;
          } else {
            var3 = param1;
          }
          if (param0 != -25888) {
            field_d = (String) null;
          }
          if (var3 != this.field_e.sentinel) {
            this.field_a = var3.previous;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_a = null;
          stackIn_7_0 = null;
          return (IntrusiveNode) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ug.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static int b(int param0) {
        if (param0 != 1) {
          field_f = (Sprite) null;
          return 1;
        }
        return 1;
    }

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = this.field_e.sentinel.previous;
        if (var2 == this.field_e.sentinel) {
          this.field_a = null;
          return null;
        }
        if (param0 < -25) {
          this.field_a = var2.previous;
          return var2;
        }
        field_c = (String[]) null;
        this.field_a = var2.previous;
        return var2;
    }

    final static int a(int param0, int param1) {
        int var2;
        var2 = 0;
        if (param0 < 0) {
          param0 = param0 >>> 16;
          var2 += 16;
        } else {
          if (param0 >= 65536) {
            param0 = param0 >>> 16;
            var2 += 16;
          }
        }
        if (256 <= param0) {
          param0 = param0 >>> 8;
          var2 += 8;
        }
        if (param0 >= 16) {
          var2 += 4;
          param0 = param0 >>> 4;
        }
        if (param1 <= param0) {
          var2 += 2;
          param0 = param0 >>> 2;
        }
        if (param0 >= 1) {
          param0 = param0 >>> 1;
          var2++;
        }
        return param0 + var2;
    }

    public static void c(int param0) {
        field_b = null;
        field_f = null;
        if (param0 > 23) {
          field_c = null;
          field_d = null;
          return;
        }
        field_c = (String[]) null;
        field_c = null;
        field_d = null;
    }

    IntrusiveDequeCursor(IntrusiveDeque param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode b(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 <= 114) {
          field_f = (Sprite) null;
          var2 = this.field_e.sentinel.next;
          if (this.field_e.sentinel != var2) {
            this.field_a = var2.next;
            return var2;
          }
          this.field_a = null;
          return null;
        }
        var2Lifetime1 = this.field_e.sentinel.next;
        if (this.field_e.sentinel != var2Lifetime1) {
          this.field_a = var2Lifetime1.next;
          return var2Lifetime1;
        }
        this.field_a = null;
        return null;
    }

    static {
        field_c = new String[]{"By rating", "By win percentage"};
    }
}
