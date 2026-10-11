/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends bh {
    static a field_z;
    private int field_y;
    private oj field_w;
    static String field_x;
    static String field_v;

    final void e(boolean param0) {
        this.field_y = 8 * this.field_t;
        if (!param0) {
          this.e(false);
        }
    }

    final int e(int param0, byte param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var5 = 0;
        int var6 = TetraLink.field_J;
        int var3 = this.field_y >> 3;
        int var4 = 8 - (this.field_y & 7);
        int var5Lifetime1;
        if (param1 != -112) {
          this.field_y = -52;
        } else {
          this.field_y = this.field_y + param0;
          var5 = 0;
          while (param0 > var4) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((this.field_u[incrementValue$0] & rf.field_a[var4]) << param0 - var4);
            param0 = param0 - var4;
            var4 = 8;
          }
          if (var4 == param0) {
            var5 = var5 + (this.field_u[var3] & rf.field_a[var4]);
          } else {
            var5 = var5 + (this.field_u[var3] >> -param0 + var4 & rf.field_a[param0]);
          }
          return var5;
        }
        this.field_y = this.field_y + param0;
        var5Lifetime1 = 0;
        while (param0 > var4) {
          incrementValue$1 = var3;
          var3++;
          var5Lifetime1 = var5Lifetime1 + ((this.field_u[incrementValue$1] & rf.field_a[var4]) << param0 - var4);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (var4 == param0) {
          var5Lifetime1 = var5Lifetime1 + (this.field_u[var3] & rf.field_a[var4]);
        } else {
          var5Lifetime1 = var5Lifetime1 + (this.field_u[var3] >> -param0 + var4 & rf.field_a[param0]);
        }
        return var5Lifetime1;
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = TetraLink.field_J;
        try {
          if (param0 < 28) {
            return;
          }
          for (var5_int = 0; var5_int < param3; var5_int++) {
            fieldTemp$0 = this.field_t;
            this.field_t = this.field_t + 1;
            param1[param2 + var5_int] = (byte)(this.field_u[fieldTemp$0] - this.field_w.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("bc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int d(boolean param0) {
        int fieldTemp$0 = 0;
        if (param0) {
          this.f(-44, (byte) -67);
          fieldTemp$0 = this.field_t;
          this.field_t = this.field_t + 1;
          return this.field_u[fieldTemp$0] - this.field_w.c(0) & 255;
        }
        int fieldTemp$1 = this.field_t;
        this.field_t = this.field_t + 1;
        return this.field_u[fieldTemp$1] - this.field_w.c(0) & 255;
    }

    final void i(byte param0) {
        this.field_t = (this.field_y + 7) / 8;
        if (param0 <= 57) {
          bc var3 = (bc) null;
          bc.a(89, (bc) null);
        }
    }

    final static boolean a(int param0, bc param1) {
        RuntimeException var2 = null;
        bc var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 53) {
            var3 = (bc) null;
            bc.a(116, (bc) null);
          }
          stackIn_5_0 = (1 == param1.e(1, (byte) -112));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("bc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    bc(byte[] param0) {
        super(param0);
    }

    bc(int param0) {
        super(param0);
    }

    final void a(int[] param0, byte param1) {
        try {
          this.field_w = new oj(param0);
          if (param1 != 33) {
            this.e(true);
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "bc.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void f(int param0, byte param1) {
        int fieldTemp$0 = 0;
        if (param1 != -92) {
          field_v = (String) null;
          fieldTemp$0 = this.field_t;
          this.field_t = this.field_t + 1;
          this.field_u[fieldTemp$0] = (byte)(this.field_w.c(oj.a((int) param1, -92)) + param0);
          return;
        }
        int fieldTemp$1 = this.field_t;
        this.field_t = this.field_t + 1;
        this.field_u[fieldTemp$1] = (byte)(this.field_w.c(oj.a((int) param1, -92)) + param0);
    }

    public static void j(int param0) {
        if (param0 != 29313) {
          bc.j(84);
          field_z = null;
          field_v = null;
          field_x = null;
          return;
        }
        field_z = null;
        field_v = null;
        field_x = null;
    }

    static {
        field_z = new a();
        field_x = "Quick Chat lobby";
        field_v = "<%0> wants to draw.";
    }
}
