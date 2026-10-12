/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends IntrusiveNode {
    private int field_p;
    private boolean field_k;
    private int field_m;
    private int field_n;
    static String field_o;
    private int field_l;

    final void b(int param0, int param1, byte param2) {
        this.field_l = this.field_l + 1;
        this.field_p = this.field_p + param1;
        if (param2 > 85) {
          this.field_m = this.field_m + param0;
          return;
        }
    }

    final void f(int param0) {
        int var2 = -56 % ((param0 + 48) / 43);
        this.field_k = true;
    }

    final boolean a(int param0) {
        int fieldTemp$0 = 0;
        if (param0 == -5) {
          fieldTemp$0 = this.field_n;
          this.field_n = this.field_n + 1;
          return 40 > fieldTemp$0 ? true : false;
        }
        Unit var3 = (Unit) null;
        this.a((Unit) null, 101);
        int fieldTemp$1 = this.field_n;
        this.field_n = this.field_n + 1;
        return 40 > fieldTemp$1 ? true : false;
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (param0 != -66) {
          return false;
        }
        return AiPlanner.b(param3, param2, param0 ^ 76, param1);
    }

    final boolean a(byte param0) {
        if (param0 <= 123) {
          this.b(82, 19, (byte) 40);
          return this.field_k;
        }
        return this.field_k;
    }

    final boolean a(int param0, ja param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param1.field_m / param1.field_l;
          var4 = param1.field_p / param1.field_l;
          var5 = this.field_m / this.field_l;
          var6 = this.field_p / this.field_l;
          var7 = -var5 + var3_int;
          var7 = var7 * var7;
          var8 = -var6 + var4;
          var8 = var8 * var8;
          if (param0 != -5) {
            this.field_n = -4;
          }
          stackIn_10_0 = ((!(var7 >= 4) &&
            !(var8 >= 25)) ||
            (!(var7 >= 25) &&
            !(var8 >= 4)));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ja.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean a(Unit param0, int param1) {
        RuntimeException var3 = null;
        ja var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -4977) {
            var4 = (ja) null;
            this.a(114, (ja) null);
          }
          stackIn_3_0 = this.a(param0.tileX, param0.tileY, (byte) -95);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ja.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, Unit param1) {
        if (param0 > -59) {
          return;
        }
        try {
          this.b(param1.tileX, param1.tileY, (byte) 108);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ja.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var4 = this.field_m / this.field_l;
        int var5Lifetime1;
        if (param2 >= -27) {
          this.a((byte) 97);
          var5 = this.field_p / this.field_l;
          if (param0 < -2 + var4) {
            return false;
          }
          if (var5 - 2 > param1) {
            return false;
          }
          if (2 + var4 < param0) {
            return false;
          }
          if (param1 <= var5 + 2) {
            return true;
          }
          return false;
        }
        var5Lifetime1 = this.field_p / this.field_l;
        if (param0 < -2 + var4) {
          return false;
        }
        if (var5Lifetime1 - 2 > param1) {
          return false;
        }
        if (2 + var4 < param0) {
          return false;
        }
        if (param1 <= var5Lifetime1 + 2) {
          return true;
        }
        return false;
    }

    final int b(int param0, ja param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param1.field_m / param1.field_l;
          var4 = param1.field_p / param1.field_l;
          var5 = this.field_m / this.field_l;
          if (param0 != 2) {
            stackIn_2_0 = -59;
            return stackIn_2_0;
          }
          var6 = this.field_p / this.field_l;
          var7 = var3_int - var5;
          var8 = -var6 + var4;
          stackIn_4_0 = var8 * var8 + var7 * var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ja.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final int a(int param0, byte param1) {
        int var3 = this.field_m / this.field_l;
        int var4 = this.field_p / this.field_l;
        if (param1 < -23) {
          return var3 + var4 * param0;
        }
        return -50;
    }

    public static void e(int param0) {
        field_o = null;
        int var1 = 107 % ((param0 + 36) / 54);
    }

    ja(Unit param0) {
        try {
          this.field_l = 1;
          this.field_p = param0.tileY;
          this.field_m = param0.tileX;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    ja(int param0, int param1) {
        this.field_m = param0;
        this.field_l = 1;
        this.field_p = param1;
    }

    static {
        field_o = "Spells to harm a single unit.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static boolean $cfr$intArgs$a$78278125798b(int param0, int param1, int param2, int param3) {
        if (param0 != -66) {
          return false;
        }
        return AiPlanner.b(param3, param2, param0 ^ 76, param1);
    }
}
