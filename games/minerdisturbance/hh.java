/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    private ta field_e;
    private pi field_b;
    static String field_c;
    static String[] field_a;
    static String field_d;

    final pi a(boolean param0, pi param1) {
        pi var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        pi stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.a(true);
          }
          if (param1 == null) {
            var3 = this.field_e.field_c.field_c;
          } else {
            var3 = param1;
          }
          if (var3 != this.field_e.field_c) {
            this.field_b = var3.field_c;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_b = null;
          stackIn_7_0 = null;
          return (pi) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("hh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final pi c(int param0) {
        pi var2 = this.field_b;
        if (param0 > -116) {
          field_a = (String[]) null;
          if (var2 == this.field_e.field_c) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.field_c;
          return var2;
        }
        if (var2 == this.field_e.field_c) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_c;
        return var2;
    }

    final pi d(int param0) {
        pi var2 = this.field_e.field_c.field_f;
        if (this.field_e.field_c == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_f;
        if (param0 == -19864) {
          return var2;
        }
        field_d = (String) null;
        return var2;
    }

    hh(ta param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "hh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        int var1 = -110 / ((param0 - 8) / 50);
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final pi a(int param0) {
        pi var2 = null;
        pi var2Lifetime1;
        if (param0 != 12537) {
          pi var3 = (pi) null;
          this.a(true, (pi) null);
          var2 = this.field_b;
          if (this.field_e.field_c != var2) {
            this.field_b = var2.field_f;
            return var2;
          }
          this.field_b = null;
          return null;
        }
        var2Lifetime1 = this.field_b;
        if (this.field_e.field_c != var2Lifetime1) {
          this.field_b = var2Lifetime1.field_f;
          return var2Lifetime1;
        }
        this.field_b = null;
        return null;
    }

    final pi a(pi param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        pi var4 = null;
        Object stackIn_6_0 = null;
        pi stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -127 / ((param1 + 18) / 40);
          if (param0 == null) {
            var4 = this.field_e.field_c.field_f;
          } else {
            var4 = param0;
          }
          if (var4 == this.field_e.field_c) {
            this.field_b = null;
            stackIn_6_0 = null;
            return (pi) (stackIn_6_0);
          }
          this.field_b = var4.field_f;
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("hh.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final pi a(boolean param0) {
        pi var2 = this.field_e.field_c.field_c;
        if (!param0) {
          pi var3 = (pi) null;
          this.a(true, (pi) null);
          if (var2 == this.field_e.field_c) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.field_c;
          return var2;
        }
        if (var2 == this.field_e.field_c) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_c;
        return var2;
    }

    static {
        field_a = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_d = "Sought the Quiet Life";
        field_c = "The 2x multiplier gives you double points! Skilled miners use this to get the best rankings. If you buy 2x AND 3x, they combine to a massive 6x multiplier!";
    }
}
