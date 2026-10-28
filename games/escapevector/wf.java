/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static String field_b;
    static String[] field_c;
    static Sprite field_e;
    private IntrusiveDeque field_a;
    private IntrusiveNode field_d;

    public static void releaseStatics(boolean guard) {
        field_e = null;
        field_c = null;
        if (guard) {
          return;
        }
        field_b = null;
    }

    final IntrusiveNode a(byte param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        String stackIn_14_2 = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_a.sentinel.previous;
          }
          if (this.field_a.sentinel == var3) {
            this.field_d = null;
            Object stackIn_6_0 = null;
            return (IntrusiveNode) (stackIn_6_0);
          }
          this.field_d = var3.previous;
          if (param0 < 33) {
            IntrusiveNode var4 = (IntrusiveNode) null;
            this.a((byte) 25, (IntrusiveNode) null);
          }
          IntrusiveNode stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3_ref;
          StringBuilder stackIn_13_1 = new StringBuilder().append("wf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = this.field_a.sentinel.next;
        if (this.field_a.sentinel == var2) {
          this.field_d = null;
          return null;
        }
        if (param0 == 15) {
          this.field_d = var2.next;
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final static int a(int param0, int param1) {
        if (param0 == 0) {
          return 0;
        }
        if (param1 != 24787) {
          return 37;
        }
        if (0 < param0) {
          int var2 = 1;
          if (param0 > 65535) {
            var2 += 16;
            param0 = param0 >> 16;
          }
          if (255 < param0) {
            param0 = param0 >> 8;
            var2 += 8;
          }
          if (15 < param0) {
            var2 += 4;
            param0 = param0 >> 4;
          }
          if (3 < param0) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 > 1) {
            param0 = param0 >> 1;
            var2++;
          }
          return var2;
        }
        int var2Lifetime1 = 2;
        if (param0 < -65536) {
          var2Lifetime1 += 16;
          param0 = param0 >> 16;
        }
        if (-256 > param0) {
          param0 = param0 >> 8;
          var2Lifetime1 += 8;
        }
        if (param0 < -16) {
          param0 = param0 >> 4;
          var2Lifetime1 += 4;
        }
        if (param0 < -4) {
          param0 = param0 >> 2;
          var2Lifetime1 += 2;
        }
        if (param0 < -2) {
          var2Lifetime1++;
          param0 = param0 >> 1;
        }
        return var2Lifetime1;
    }

    final IntrusiveNode a(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        String stackIn_13_2 = null;
        try {
          if (param1 == null) {
            var3 = this.field_a.sentinel.next;
          } else {
            var3 = param1;
          }
          if (param0 != -12818) {
            field_e = (Sprite) null;
          }
          if (var3 != this.field_a.sentinel) {
            this.field_d = var3.next;
            IntrusiveNode stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_d = null;
          Object stackIn_7_0 = null;
          return (IntrusiveNode) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3_ref;
          StringBuilder stackIn_12_1 = new StringBuilder().append("wf.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final IntrusiveNode a(byte param0) {
        if (param0 <= 35) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_d;
        if (this.field_a.sentinel == var2) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.previous;
        return var2;
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = this.field_d;
        if (var2 == this.field_a.sentinel) {
          this.field_d = null;
          return null;
        }
        if (param0 > 23) {
          this.field_d = var2.next;
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode b(int param0) {
        if (param0 != -31616) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.a(-5, (IntrusiveNode) null);
          IntrusiveNode var2 = this.field_a.sentinel.previous;
          if (this.field_a.sentinel == var2) {
            this.field_d = null;
            return null;
          }
          this.field_d = var2.previous;
          return var2;
        }
        IntrusiveNode var2Lifetime1 = this.field_a.sentinel.previous;
        if (this.field_a.sentinel == var2Lifetime1) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2Lifetime1.previous;
        return var2Lifetime1;
    }

    wf(IntrusiveDeque param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "wf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Loading extra data";
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
