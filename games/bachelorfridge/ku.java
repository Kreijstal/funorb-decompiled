/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ku extends bca {
    static boolean field_q;

    ku(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_k = param0.e((byte) 72);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              return;
            }
            this.field_o.a(dca.a((byte) 102, param0), true);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ku.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        cu stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            stackIn_4_0 = new cu(param1, this);
            return (at) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (at) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ku.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void d(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = BachelorFridge.field_y;
        try {
          var1_int = wa.field_m[0];
          if (param0 != -372) {
            field_q = false;
          }
          for (var2 = 1; var2 < wa.field_m.length; var2++) {
            var3 = wa.field_m[var2];
            bl.a(ci.field_q, var2 << 4, ci.field_q, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "ku.B(" + param0 + ')');
        }
    }

    ku(int param0, nq param1) {
        super(param0, param1);
    }

    final void a(op param0, int param1) {
        int var4 = 0;
        int var3_int = 0;
        int var5 = BachelorFridge.field_y;
        int var3_intLifetime1;
        try {
          this.a(param0, (byte) -2);
          for (var3_int = 0; param0.field_z > var3_int; var3_int++) {
            for (var4 = 0; param0.field_B > var4; var4++) {
              if (param0.field_a[var3_int][var4].field_i) {
              }
              param0.field_a[var3_int][var4].field_i = false;
            }
          }
          var3_intLifetime1 = -50 / ((12 - param1) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ku.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        try {
          pj.field_b[param6] = param2;
          pj.field_c[param6] = param4;
          int var7_int = 77 % ((-13 - param0) / 38);
          pj.field_l[param6] = param1;
          pj.field_h[param6] = param3;
          pj.field_o[param6] = param5;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ku.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(byte param0, lu param1) {
        if (param0 >= -12) {
          return;
        }
        try {
          super.a((byte) -98, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ku.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = true;
    }
}
