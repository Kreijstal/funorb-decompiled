/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static String field_c;
    IntrusiveNode sentinel;
    static String field_e;
    static String field_d;
    private IntrusiveNode cursor;
    static String field_a;

    final IntrusiveNode c(byte param0) {
        IntrusiveNode var2 = this.cursor;
        if (var2 == this.sentinel) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.next;
        if (param0 >= 95) {
          return var2;
        }
        field_c = (String) null;
        return var2;
    }

    final boolean f(int param0) {
        if (param0 == 28113) {
          return this.sentinel == this.sentinel.previous ? true : false;
        }
        this.c(-26);
        return this.sentinel == this.sentinel.previous ? true : false;
    }

    final IntrusiveNode a(boolean param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (!param0) {
          this.b(-47);
          var2 = this.sentinel.next;
          if (var2 != this.sentinel) {
            var2.unlink(param0);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.next;
        if (var2Lifetime1 != this.sentinel) {
          var2Lifetime1.unlink(param0);
          return var2Lifetime1;
        }
        return null;
    }

    final int a(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = param0;
        IntrusiveNode var3 = this.sentinel.previous;
        while (var3 != this.sentinel) {
          var3 = var3.previous;
          var2++;
        }
        return var2;
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 <= 38) {
          this.c(-100);
          var2 = this.sentinel.previous;
          if (this.sentinel == var2) {
            this.cursor = null;
            return null;
          }
          this.cursor = var2.previous;
          return var2;
        }
        var2Lifetime1 = this.sentinel.previous;
        if (this.sentinel == var2Lifetime1) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2Lifetime1.previous;
        return var2Lifetime1;
    }

    final IntrusiveNode a(byte param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -72 / ((param0 - 10) / 33);
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.sentinel.previous;
          }
          if (this.sentinel != var3) {
            this.cursor = var3.previous;
            stackIn_7_0 = var3;
            return stackIn_7_0;
          }
          this.cursor = null;
          stackIn_5_0 = null;
          return (IntrusiveNode) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("th.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(IntrusiveNode param0, boolean param1) {
        if (param0.next != null) {
          param0.unlink(!param1 ? true : false);
        }
        param0.previous = this.sentinel;
        param0.next = this.sentinel.next;
        param0.next.previous = param0;
        if (param1) {
          return;
        }
        try {
          param0.previous.next = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "th.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_d = null;
        field_e = null;
        if (param0 > 61) {
          field_c = null;
          field_a = null;
          return;
        }
        field_d = (String) null;
        field_c = null;
        field_a = null;
    }

    final IntrusiveNode g(int param0) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (var2 == this.sentinel) {
          return null;
        }
        var2.unlink(true);
        if (param0 > 33) {
          return var2;
        }
        this.f(-15);
        return var2;
    }

    final void e(int param0) {
        IntrusiveNode var2;
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -30986) {
          return;
        }
        while (true) {
          var2 = this.sentinel.previous;
          if (this.sentinel != var2) {
            var2.unlink(true);
            continue;
          }
          break;
        }
        this.cursor = null;
        return;
    }

    final static void b(byte param0) {
        byte[] var2 = null;
        byte[] var1 = null;
        byte[] var2Lifetime1;
        byte[] var1Lifetime1;
        if (param0 != -61) {
          IntrusiveDeque.a(30, 99, -87, 29, -54, -51, -90);
          if (wc.j(112)) {
            ClientException.field_b = true;
          } else {
            var2 = FullscreenFocusCanvas.field_k.f(-16613);
            var1 = var2;
            InflaterDecompressor.a(-55, 6, var2);
            return;
          }
          return;
        }
        if (wc.j(112)) {
          ClientException.field_b = true;
        } else {
          var2Lifetime1 = FullscreenFocusCanvas.field_k.f(-16613);
          var1Lifetime1 = var2Lifetime1;
          InflaterDecompressor.a(-55, 6, var2Lifetime1);
          return;
        }
    }

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 != this.sentinel) {
          this.cursor = var2.next;
          int var3 = 19 % ((param0 - 13) / 39);
          return var2;
        }
        this.cursor = null;
        return null;
    }

    final void a(int param0, IntrusiveNode param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.next) {
            param1.unlink(true);
          }
          param1.next = this.sentinel;
          param1.previous = this.sentinel.previous;
          param1.next.previous = param1;
          param1.previous.next = param1;
          if (param0 == -25612) {
            return;
          }
          this.b(78);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("th.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = -3 / ((param6 - 47) / 40);
        if (param2 < param1) {
          return false;
        }
        if (param2 >= param3 + param1) {
          return false;
        }
        if (param4 > param0) {
          return false;
        }
        if (param5 + param4 > param0) {
          return true;
        }
        return false;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.next = this.sentinel;
        this.sentinel.previous = this.sentinel;
    }

    final IntrusiveNode b(int param0) {
        IntrusiveNode var2 = this.cursor;
        if (this.sentinel == var2) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.previous;
        if (param0 == 6) {
          return var2;
        }
        return (IntrusiveNode) null;
    }

    static {
        field_e = "Add <%0> to friend list";
        field_d = "NEW";
        field_c = "Your ignore list is full. Max of 100 hit.";
        field_a = "Names cannot start or end with space or underscore";
    }
}
