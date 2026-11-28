/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    private IntrusiveDeque field_a;
    static String field_b;
    static int field_g;
    static String field_d;
    private IntrusiveNode field_c;
    static long field_f;
    static long field_e;

    final IntrusiveNode b(int param0) {
        IntrusiveNode var2 = this.field_a.sentinel.previous;
        if (this.field_a.sentinel == var2) {
          this.field_c = null;
          return null;
        }
        if (param0 == 0) {
          this.field_c = var2.previous;
          return var2;
        }
        this.b(91);
        this.field_c = var2.previous;
        return var2;
    }

    final IntrusiveNode a(IntrusiveNode param0, byte param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_a.sentinel.next;
          }
          if (var3 == this.field_a.sentinel) {
            this.field_c = null;
            stackIn_6_0 = null;
            return (IntrusiveNode) (stackIn_6_0);
          }
          if (param1 > -126) {
            this.e(-9);
          }
          this.field_c = var3.next;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ta.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode e(int param0) {
        IntrusiveNode var2 = this.field_c;
        if (param0 != 31842) {
          return (IntrusiveNode) null;
        }
        if (var2 != this.field_a.sentinel) {
          this.field_c = var2.previous;
          return var2;
        }
        this.field_c = null;
        return null;
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = this.field_c;
        if (param0 >= -49) {
          return (IntrusiveNode) null;
        }
        if (this.field_a.sentinel == var2) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.next;
        return var2;
    }

    final static AccountServiceResult pollAccountNameCheck(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        AccountServiceResult stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 250) {
            ta.f(34);
          }
          if (DualLinkNode.field_i == MouseWheelInput.field_c) {
            stackIn_4_0 = null;
            return (AccountServiceResult) (stackIn_4_0);
          }
          if (c.field_o == MouseWheelInput.field_c &&
            param1.equals(ef.field_b)) {
            MouseWheelInput.field_c = c.field_m;
            stackIn_8_0 = n.field_k;
            return stackIn_8_0;
          }
          ef.field_b = param1;
          n.field_k = null;
          MouseWheelInput.field_c = DualLinkNode.field_i;
          stackIn_10_0 = null;
          return (AccountServiceResult) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ta.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 250) {
          this.field_a = (IntrusiveDeque) null;
          var2 = this.field_a.sentinel.next;
          if (this.field_a.sentinel != var2) {
            this.field_c = var2.next;
            return var2;
          }
          this.field_c = null;
          return null;
        }
        var2Lifetime1 = this.field_a.sentinel.next;
        if (this.field_a.sentinel != var2Lifetime1) {
          this.field_c = var2Lifetime1.next;
          return var2Lifetime1;
        }
        this.field_c = null;
        return null;
    }

    final static void d(int param0) {
        if (mc.field_k == -tf.field_c + 0) {
          mc.field_k = mc.field_k + 1;
          if (param0 < -30) {
            return;
          }
          field_e = 88L;
          return;
        }
        if (250 - tf.field_c != mc.field_k) {
          mc.field_k = mc.field_k + 1;
          if (param0 < -30) {
            return;
          }
          field_e = 88L;
          return;
        }
        mc.field_k = mc.field_k + 1;
        if (param0 < -30) {
          return;
        }
        field_e = 88L;
    }

    final static void a(int param0, int param1, int param2) {
        fk.field_e = param0;
        int var3 = 21 % ((param1 - 14) / 53);
        ch.field_e = param2;
    }

    ta(IntrusiveDeque param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "ta.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(int param0) {
        if (param0 != 0) {
          ta.a(123, 24, 83);
          field_b = null;
          field_d = null;
          return;
        }
        field_b = null;
        field_d = null;
    }

    final IntrusiveNode a(IntrusiveNode param0, int param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            var3 = this.field_a.sentinel.previous;
          } else {
            var3 = param0;
          }
          if (var3 == this.field_a.sentinel) {
            this.field_c = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          this.field_c = var3.previous;
          if (param1 < 126) {
            this.field_c = (IntrusiveNode) null;
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ta.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "Please wait...";
    }
}
