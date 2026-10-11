/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    private oj field_e;
    static String[] field_c;
    static String field_b;
    static pb field_f;
    private gg field_a;
    static String field_d;

    final gg b(int param0, gg param1) {
        gg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        gg stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_e.field_d.field_g;
          } else {
            var3 = param1;
          }
          if (param0 != 4993) {
            this.b((byte) -10);
          }
          if (this.field_e.field_d == var3) {
            this.field_a = null;
            stackIn_8_0 = null;
            return (gg) (stackIn_8_0);
          }
          this.field_a = var3.field_g;
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

    final gg a(int param0) {
        int var2 = 26 % ((4 - param0) / 50);
        gg var3 = this.field_a;
        if (var3 != this.field_e.field_d) {
          this.field_a = var3.field_c;
          return var3;
        }
        this.field_a = null;
        return null;
    }

    final gg a(boolean param0) {
        gg var2 = null;
        gg var2Lifetime1;
        if (!param0) {
          this.field_a = (gg) null;
          var2 = this.field_a;
          if (var2 == this.field_e.field_d) {
            this.field_a = null;
            return null;
          }
          this.field_a = var2.field_g;
          return var2;
        }
        var2Lifetime1 = this.field_a;
        if (var2Lifetime1 == this.field_e.field_d) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2Lifetime1.field_g;
        return var2Lifetime1;
    }

    final gg a(int param0, gg param1) {
        gg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        gg stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_e.field_d.field_c;
          } else {
            var3 = param1;
          }
          if (param0 != -25888) {
            field_d = (String) null;
          }
          if (var3 != this.field_e.field_d) {
            this.field_a = var3.field_c;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_a = null;
          stackIn_7_0 = null;
          return (gg) (stackIn_7_0);
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
          field_f = (pb) null;
          return 1;
        }
        return 1;
    }

    final gg a(byte param0) {
        gg var2 = this.field_e.field_d.field_c;
        if (var2 == this.field_e.field_d) {
          this.field_a = null;
          return null;
        }
        if (param0 < -25) {
          this.field_a = var2.field_c;
          return var2;
        }
        field_c = (String[]) null;
        this.field_a = var2.field_c;
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

    ug(oj param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final gg b(byte param0) {
        gg var2 = null;
        gg var2Lifetime1;
        if (param0 <= 114) {
          field_f = (pb) null;
          var2 = this.field_e.field_d.field_g;
          if (this.field_e.field_d != var2) {
            this.field_a = var2.field_g;
            return var2;
          }
          this.field_a = null;
          return null;
        }
        var2Lifetime1 = this.field_e.field_d.field_g;
        if (this.field_e.field_d != var2Lifetime1) {
          this.field_a = var2Lifetime1.field_g;
          return var2Lifetime1;
        }
        this.field_a = null;
        return null;
    }

    static {
        field_c = new String[]{"By rating", "By win percentage"};
    }
}
