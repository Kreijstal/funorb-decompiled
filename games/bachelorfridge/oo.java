/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo extends bca {
    int field_r;
    static kv[] field_q;

    final int b(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_l.a(param1 ^ -94, param0);
          if (param1 != -1) {
            stackIn_2_0 = 58;
            return stackIn_2_0;
          }
          if (this.field_r == 2) {
            stackIn_6_0 = var3.field_x;
            return stackIn_6_0;
          }
          if (this.field_r == 4) {
            stackIn_16_0 = -1 + (param0.field_z - var3.field_x);
            return stackIn_16_0;
          }
          if (1 == this.field_r) {
            stackIn_14_0 = var3.field_J;
            return stackIn_14_0;
          }
          if (this.field_r != 3) {
            throw new IllegalStateException();
          }
          stackIn_12_0 = -1 + (param0.field_B - var3.field_J);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("oo.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static hs a(int param0, byte param1, byte[] param2, int param3) {
        int var7 = 0;
        int var9 = 0;
        hs stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        cda[] var6 = null;
        cda var8 = null;
        int var10 = 0;
        lu var11 = null;
        var10 = BachelorFridge.field_y;
        try {
          var11 = new lu(param2);
          var5 = var11.e((byte) 83);
          var6 = new cda[var11.e((byte) 66)];
          for (var7 = 0; var6.length > var7; var7++) {
            var8 = new cda();
            var8.field_a = var11.e((byte) 66);
            for (var9 = 0; var9 < 11; var9++) {
              var8.field_b[var9].field_h = var11.c((byte) -85);
              var8.field_b[var9].field_l = var11.c((byte) -85);
              var8.field_b[var9].field_d = var11.c((byte) -85);
              var8.field_b[var9].field_e = var11.c((byte) -85);
              var8.field_b[var9].field_j = var11.f(52);
            }
            var6[var7] = var8;
          }
          if (param1 != -77) {
            field_q = (kv[]) null;
          }
          stackIn_10_0 = new hs(param3, param0, var6, var5);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("oo.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        nm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            field_q = (kv[]) null;
          }
          stackIn_3_0 = new nm(param1, this);
          return (at) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oo.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    oo(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.field_k = param0.e((byte) 79);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (0 > var2_int) {
              break;
            }
            this.field_o.a(dca.a((byte) 102, param0), true);
          }
          this.field_r = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "oo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    oo(int param0, nq param1, int param2) {
        super(param0, param1);
        try {
          this.field_r = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "oo.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte param0, lu param1) {
        try {
          super.a((byte) -118, param1);
          param1.d(this.field_r, 0);
          if (param0 >= -12) {
            field_q = (kv[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "oo.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_q = null;
        int var1 = 102 / ((param0 + 22) / 53);
    }

    final void a(op param0, int param1) {
        try {
          this.a(param0, (byte) -2);
          this.field_l.a(79, param0).a(false, this.b(param0, -1), this.field_r);
          int var3_int = 118 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "oo.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
