/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs {
    private boolean field_b;
    private int[] field_a;
    private int field_f;
    private int field_d;
    static tf field_c;
    static int field_g;
    static int field_h;
    static ri field_e;

    final static int a(boolean param0, String param1, int param2, String param3, int param4, int param5, String param6) {
        lj var7 = null;
        RuntimeException var7_ref = null;
        lj var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new lj(param1);
          if (param5 < 115) {
            stackIn_2_0 = -95;
            return stackIn_2_0;
          }
          var8 = new lj(param3);
          stackIn_4_0 = jd.a(var7, param2, var8, param4, param0, 21, param6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("rs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int d(int param0, int param1) {
        if (param0 > this.field_f) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 == -29816) {
          return this.field_a[param0];
        }
        field_e = (ri) null;
        return this.field_a[param0];
    }

    private final void a(int param0, int param1) {
        int var4 = -38 % ((-60 - param0) / 46);
        int[] var5 = new int[this.b(1, param1)];
        int[] var3 = var5;
        la.a(this.field_a, 0, var5, 0, this.field_a.length);
        this.field_a = var5;
    }

    final static boolean a(String param0, int param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          try {
            if (!wi.field_o.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            if (param1 != -2528) {
              return false;
            }
            for (var3 = 0; param0.length() > var3; var3++) {
              if (-1 == var2.indexOf((int) param0.charAt(var3))) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var2_ref2;
          stackIn_25_1 = new StringBuilder().append("rs.G(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -26791) {
          return;
        }
        field_e = null;
        field_c = null;
    }

    final void a(byte param0, int param1) {
        if (param0 != 61) {
          field_g = 27;
          if (param1 < 0) {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
          if (this.field_f >= param1) {
            if (param1 != this.field_f) {
              la.a(this.field_a, 1 + param1, this.field_a, param1, this.field_f - param1);
            }
            this.field_f = this.field_f - 1;
            return;
          }
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 < 0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_f >= param1) {
          if (param1 != this.field_f) {
            la.a(this.field_a, 1 + param1, this.field_a, param1, this.field_f - param1);
          }
          this.field_f = this.field_f - 1;
          return;
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    private rs() throws Throwable {
        throw new Error();
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        String var5;
        int var3Lifetime1;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == 1) {
          var3 = this.field_a.length;
          while (var3 <= param1) {
            if (!this.field_b) {
              var3 = var3 + this.field_d;
              continue;
            }
            if (0 == var3) {
              var3 = 1;
              continue;
            }
            var3 = var3 * this.field_d;
          }
          return var3;
        }
        var5 = (String) null;
        rs.a(false, (String) null, 93, (String) null, -122, -38, (String) null);
        var3Lifetime1 = this.field_a.length;
        while (var3Lifetime1 <= param1) {
          if (!this.field_b) {
            var3Lifetime1 = var3Lifetime1 + this.field_d;
            continue;
          }
          if (0 == var3Lifetime1) {
            var3Lifetime1 = 1;
            continue;
          }
          var3Lifetime1 = var3Lifetime1 * this.field_d;
        }
        return var3Lifetime1;
    }

    final void c(int param0, int param1) {
        this.a(param1, 1 + this.field_f, false);
        int var3 = 29 % ((-83 - param0) / 33);
    }

    private final void a(int param0, int param1, boolean param2) {
        if (param2) {
          field_e = (ri) null;
        }
        if (param1 > this.field_f) {
          this.field_f = param1;
        }
        if (param1 >= this.field_a.length) {
          this.a(99, param1);
        }
        this.field_a[param1] = param0;
    }

    final int a(byte param0) {
        if (param0 <= 28) {
          return 121;
        }
        return 1 + this.field_f;
    }

    static {
        field_c = new tf();
        field_g = 2;
        field_h = 4;
    }
}
