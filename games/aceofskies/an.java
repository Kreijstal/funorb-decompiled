/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    private IntrusiveDeque field_c;
    static IntrusiveDeque field_b;
    private IntrusiveNode field_a;

    final static sn[] a(boolean param0) {
        if (BitmapFontMetrics.field_c == null) {
          BitmapFontMetrics.field_c = mq.a((byte) 122, new int[]{1, 0});
          if (!param0) {
            return BitmapFontMetrics.field_c;
          }
          return (sn[]) null;
        }
        if (!param0) {
          return BitmapFontMetrics.field_c;
        }
        return (sn[]) null;
    }

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = this.field_a;
        if (this.field_c.sentinel == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.previous;
        if (param0 == 120) {
          return var2;
        }
        this.a((byte) -65);
        return var2;
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = this.field_a;
        if (this.field_c.sentinel == var2) {
          this.field_a = null;
          return null;
        }
        int var3 = -30 % ((param0 + 74) / 43);
        this.field_a = var2.next;
        return var2;
    }

    final IntrusiveNode a(IntrusiveNode param0, int param1) {
        IntrusiveNode var3 = null;
        String stackIn_14_2 = null;
        try {
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_c.sentinel.previous;
          }
          if (this.field_c.sentinel == var3) {
            this.field_a = null;
            Object stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          if (param1 != 0) {
            IntrusiveNode stackIn_8_0 = (IntrusiveNode) null;
            return stackIn_8_0;
          }
          this.field_a = var3.previous;
          IntrusiveNode stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3_ref;
          StringBuilder stackIn_13_1 = new StringBuilder().append("an.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = this.field_c.sentinel.next;
        if (this.field_c.sentinel == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.next;
        if (param0 == -1372) {
          return var2;
        }
        this.field_c = (IntrusiveDeque) null;
        return var2;
    }

    public static void b(int param0) {
        if (param0 != 32041) {
          return;
        }
        field_b = null;
    }

    final IntrusiveNode a(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        String stackIn_14_2 = null;
        try {
          if (param0 < 40) {
            field_b = (IntrusiveDeque) null;
          }
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_c.sentinel.next;
          }
          if (var3 == this.field_c.sentinel) {
            this.field_a = null;
            Object stackIn_8_0 = null;
            return (IntrusiveNode) (stackIn_8_0);
          }
          this.field_a = var3.next;
          IntrusiveNode stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3_ref;
          StringBuilder stackIn_13_1 = new StringBuilder().append("an.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final IntrusiveNode b(boolean param0) {
        if (!param0) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_c.sentinel.previous;
        if (this.field_c.sentinel == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.previous;
        return var2;
    }

    an(IntrusiveDeque param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "an.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new IntrusiveDeque();
    }
}
