/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tla extends bca {
    static eaa field_q;
    int field_r;
    int field_v;
    aj[] field_t;
    static String field_s;
    int field_u;

    final static void d(int param0) {
        int var1;
        int var1Lifetime1;
        int var1Lifetime2;
        if (null != cr.field_c) {
          rp.a(true, cr.field_c);
          if (sla.field_a != null) {
            rp.a(true, sla.field_a);
          }
          if (null != m.field_b) {
            rp.a(true, m.field_b);
          }
          var1 = -27 % ((param0 + 33) / 39);
          return;
        }
        if (sla.field_a == null) {
          if (null != m.field_b) {
            rp.a(true, m.field_b);
          }
          var1Lifetime1 = -27 % ((param0 + 33) / 39);
          return;
        }
        rp.a(true, sla.field_a);
        if (null != m.field_b) {
          rp.a(true, m.field_b);
        }
        var1Lifetime2 = -27 % ((param0 + 33) / 39);
        return;
    }

    tla(int param0, nq param1) {
        super(param0, param1);
        try {
          this.field_u = 0;
          this.field_t = new aj[6];
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "tla.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param0 < dg.field_f) {
          return;
        }
        if (!(param0 < dg.field_h)) {
          return;
        }
        if (param3 < dg.field_j) {
          return;
        }
        if (dg.field_k <= param3) {
          return;
        }
        int var5 = 65280 & param2;
        if (param1 == -1898743704) {
          var5 = var5 * param4;
          param2 = param2 & 16711935;
          param2 = param2 * param4;
          var5 = var5 & 16711680;
          param2 = param2 & -16711936;
          var6 = dg.field_i * param3 + param0;
          var7 = dg.field_e[var6];
          var5 = var5 + (16711680 & (var7 & 65280) * (256 - param4));
          param2 = param2 + ((16711935 & var7) * (256 - param4) & -16711936);
          dg.field_e[var6] = mp.a(param2, var5) >>> 8;
          return;
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        fd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            stackIn_4_0 = new fd(param1, this);
            return (at) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (at) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("tla.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    tla(lu param0) {
        super(param0);
        int var3 = 0;
        int var2_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_k = param0.e((byte) 46);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (0 <= var2_int) {
              this.field_o.a(dca.a((byte) 102, param0), true);
              continue;
            }
            break;
          }
          this.field_v = param0.b(16711935);
          this.field_r = param0.b(16711935);
          this.field_u = param0.b(16711935);
          this.field_t = new aj[this.field_u];
          for (var3 = 0; this.field_u > var3; var3++) {
            this.field_t[var3] = new aj(param0.b(16711935), param0.b(16711935));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("tla.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(byte param0, lu param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          super.a((byte) -82, param1);
          param1.d(this.field_v, 0);
          param1.d(this.field_r, 0);
          param1.d(this.field_u, 0);
          if (param0 >= -12) {
            return;
          }
          for (var3_int = 0; this.field_u > var3_int; var3_int++) {
            param1.d(this.field_t[var3_int].field_c, 0);
            param1.d(this.field_t[var3_int].field_a, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("tla.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int[][] d(boolean param0) {
        int[][] var5 = new int[17][17];
        int[][] var4 = var5;
        int[][] var3 = var4;
        int[][] var2 = var3;
        var5[5][8] = 1;
        if (param0) {
          tla.c(false);
        }
        var5[6][7] = 1;
        var5[7][7] = 1;
        var5[7][6] = 1;
        var5[6][9] = 1;
        var5[6][8] = 1;
        var5[7][10] = 1;
        var5[8][7] = 1;
        var5[8][6] = 1;
        var5[7][9] = 1;
        var5[7][8] = 1;
        var5[8][5] = 1;
        var5[8][8] = 1;
        var5[9][7] = 1;
        var5[9][6] = 1;
        var5[8][9] = 1;
        var5[8][10] = 1;
        var5[8][11] = 1;
        var5[9][10] = 1;
        var5[9][9] = 1;
        var5[9][8] = 1;
        var5[10][7] = 1;
        var5[10][9] = 1;
        var5[10][8] = 1;
        var5[11][8] = 1;
        return var2;
    }

    public static void c(boolean param0) {
        field_q = null;
        field_s = null;
        if (param0) {
          tla.c(true);
        }
    }

    final void a(op param0, int param1) {
        try {
          int var3_int = -53 / ((param1 - 12) / 35);
          this.a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "tla.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_s = "Click";
        field_q = new eaa();
    }
}
