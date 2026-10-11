/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static String field_c;
    br field_b;
    static String field_e;
    static String field_d;
    private br field_f;
    static String field_a;

    final br c(byte param0) {
        br var2 = this.field_f;
        if (var2 == this.field_b) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.field_b;
        if (param0 >= 95) {
          return var2;
        }
        field_c = (String) null;
        return var2;
    }

    final boolean f(int param0) {
        if (param0 == 28113) {
          return this.field_b == this.field_b.field_d ? true : false;
        }
        this.c(-26);
        return this.field_b == this.field_b.field_d ? true : false;
    }

    final br a(boolean param0) {
        br var2 = null;
        br var2Lifetime1;
        if (!param0) {
          this.b(-47);
          var2 = this.field_b.field_b;
          if (var2 != this.field_b) {
            var2.a(param0);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_b.field_b;
        if (var2Lifetime1 != this.field_b) {
          var2Lifetime1.a(param0);
          return var2Lifetime1;
        }
        return null;
    }

    final int a(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = param0;
        br var3 = this.field_b.field_d;
        while (var3 != this.field_b) {
          var3 = var3.field_d;
          var2++;
        }
        return var2;
    }

    final br c(int param0) {
        br var2 = null;
        br var2Lifetime1;
        if (param0 <= 38) {
          this.c(-100);
          var2 = this.field_b.field_d;
          if (this.field_b == var2) {
            this.field_f = null;
            return null;
          }
          this.field_f = var2.field_d;
          return var2;
        }
        var2Lifetime1 = this.field_b.field_d;
        if (this.field_b == var2Lifetime1) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2Lifetime1.field_d;
        return var2Lifetime1;
    }

    final br a(byte param0, br param1) {
        br var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        br stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -72 / ((param0 - 10) / 33);
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_b.field_d;
          }
          if (this.field_b != var3) {
            this.field_f = var3.field_d;
            stackIn_7_0 = var3;
            return stackIn_7_0;
          }
          this.field_f = null;
          stackIn_5_0 = null;
          return (br) (stackIn_5_0);
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

    final void a(br param0, boolean param1) {
        if (param0.field_b != null) {
          param0.a(!param1 ? true : false);
        }
        param0.field_d = this.field_b;
        param0.field_b = this.field_b.field_b;
        param0.field_b.field_d = param0;
        if (param1) {
          return;
        }
        try {
          param0.field_d.field_b = param0;
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

    final br g(int param0) {
        br var2 = this.field_b.field_d;
        if (var2 == this.field_b) {
          return null;
        }
        var2.a(true);
        if (param0 > 33) {
          return var2;
        }
        this.f(-15);
        return var2;
    }

    final void e(int param0) {
        br var2;
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -30986) {
          return;
        }
        while (true) {
          var2 = this.field_b.field_d;
          if (this.field_b != var2) {
            var2.a(true);
            continue;
          }
          break;
        }
        this.field_f = null;
        return;
    }

    final static void b(byte param0) {
        byte[] var2 = null;
        byte[] var1 = null;
        byte[] var2Lifetime1;
        byte[] var1Lifetime1;
        if (param0 != -61) {
          th.a(30, 99, -87, 29, -54, -51, -90);
          if (wc.j(112)) {
            fn.field_b = true;
          } else {
            var2 = ll.field_k.f(-16613);
            var1 = var2;
            da.a(-55, 6, var2);
            return;
          }
          return;
        }
        if (wc.j(112)) {
          fn.field_b = true;
        } else {
          var2Lifetime1 = ll.field_k.f(-16613);
          var1Lifetime1 = var2Lifetime1;
          da.a(-55, 6, var2Lifetime1);
          return;
        }
    }

    final br a(byte param0) {
        br var2 = this.field_b.field_b;
        if (var2 != this.field_b) {
          this.field_f = var2.field_b;
          int var3 = 19 % ((param0 - 13) / 39);
          return var2;
        }
        this.field_f = null;
        return null;
    }

    final void a(int param0, br param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.field_b) {
            param1.a(true);
          }
          param1.field_b = this.field_b;
          param1.field_d = this.field_b.field_d;
          param1.field_b.field_d = param1;
          param1.field_d.field_b = param1;
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

    public th() {
        this.field_b = new br();
        this.field_b.field_b = this.field_b;
        this.field_b.field_d = this.field_b;
    }

    final br b(int param0) {
        br var2 = this.field_f;
        if (this.field_b == var2) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.field_d;
        if (param0 == 6) {
          return var2;
        }
        return (br) null;
    }

    static {
        field_e = "Add <%0> to friend list";
        field_d = "NEW";
        field_c = "Your ignore list is full. Max of 100 hit.";
        field_a = "Names cannot start or end with space or underscore";
    }
}
