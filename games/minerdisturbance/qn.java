/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends hc {
    private jm field_I;
    private int field_L;
    static int field_K;
    static ea field_J;

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        byte[] var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = MinerDisturbance.field_ab;
        try {
          var4_int = -1;
          if (param0 != -1648911295) {
            var7 = (byte[]) null;
            qn.a(74, 37, -101, (byte[]) null);
          }
          for (var5 = param1; param2 > var5; var5++) {
            var4_int = ei.field_J[(var4_int ^ param3[var5]) & 255] ^ var4_int >>> 8;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("qn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_J = null;
        int var1 = -113 / ((param0 - 5) / 34);
    }

    final String h(int param0) {
        if (param0 != -27867) {
          qn.a((byte) -1);
          if (this.field_x) {
            return this.field_I.a(7320);
          }
          return null;
        }
        if (this.field_x) {
          return this.field_I.a(7320);
        }
        return null;
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        try {
          this.field_L = this.field_L + 1;
          if (param2 <= 49) {
            field_K = 44;
          }
          super.a(param0, param1, (byte) 104, param3);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "qn.V(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ea var15 = null;
        ea var16 = null;
        ea var13 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = MinerDisturbance.field_ab;
        int var9Lifetime1;
        int var10Lifetime1;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        int var5 = (this.field_v >> 1) + this.field_u + param1;
        int var6 = (this.field_q >> 1) + (this.field_t + param2);
        ag var8 = this.field_I.b(24595);
        if (nn.field_f == var8) {
          var15 = ed.field_g[0];
          var9 = var15.field_x << 1;
          var10 = var15.field_A << 1;
          if (ha.field_d == null) {
            ha.field_d = new ea(var9, var10);
            vb.a(ha.field_d, 127);
            var15.b(112, 144, var15.field_x << 4, var15.field_A << 4, -this.field_L << 10, 4096);
            tk.b(true);
            ha.field_d.g(var5 - var15.field_x, var6 - var15.field_A, 256);
            return;
          }
          if (ha.field_d.field_y < var9) {
            ha.field_d = new ea(var9, var10);
            vb.a(ha.field_d, 127);
            var15.b(112, 144, var15.field_x << 4, var15.field_A << 4, -this.field_L << 10, 4096);
            tk.b(true);
            ha.field_d.g(var5 - var15.field_x, var6 - var15.field_A, 256);
            return;
          }
          if (ha.field_d.field_C >= var10) {
            vb.a(ha.field_d, 125);
            eh.d();
            var15.b(112, 144, var15.field_x << 4, var15.field_A << 4, -this.field_L << 10, 4096);
            tk.b(true);
            ha.field_d.g(var5 - var15.field_x, var6 - var15.field_A, 256);
            return;
          }
          ha.field_d = new ea(var9, var10);
          vb.a(ha.field_d, 127);
          var15.b(112, 144, var15.field_x << 4, var15.field_A << 4, -this.field_L << 10, 4096);
          tk.b(true);
          ha.field_d.g(var5 - var15.field_x, var6 - var15.field_A, 256);
          return;
        }
        if (bm.field_o == var8) {
          var16 = ed.field_g[0];
          var9Lifetime1 = var16.field_x << 1;
          var10Lifetime1 = var16.field_A << 1;
          if (ha.field_d == null) {
            ha.field_d = new ea(var9Lifetime1, var10Lifetime1);
            vb.a(ha.field_d, 127);
            var16.b(112, 144, var16.field_x << 4, var16.field_A << 4, -this.field_L << 10, 4096);
            tk.b(true);
            ha.field_d.g(var5 - var16.field_x, var6 - var16.field_A, 256);
            return;
          }
          if (ha.field_d.field_y < var9Lifetime1) {
            ha.field_d = new ea(var9Lifetime1, var10Lifetime1);
            vb.a(ha.field_d, 127);
            var16.b(112, 144, var16.field_x << 4, var16.field_A << 4, -this.field_L << 10, 4096);
            tk.b(true);
            ha.field_d.g(var5 - var16.field_x, var6 - var16.field_A, 256);
            return;
          }
          if (ha.field_d.field_C >= var10Lifetime1) {
            vb.a(ha.field_d, 125);
            eh.d();
            var16.b(112, 144, var16.field_x << 4, var16.field_A << 4, -this.field_L << 10, 4096);
            tk.b(true);
            ha.field_d.g(var5 - var16.field_x, var6 - var16.field_A, 256);
            return;
          }
          ha.field_d = new ea(var9Lifetime1, var10Lifetime1);
          vb.a(ha.field_d, 127);
          var16.b(112, 144, var16.field_x << 4, var16.field_A << 4, -this.field_L << 10, 4096);
          tk.b(true);
          ha.field_d.g(var5 - var16.field_x, var6 - var16.field_A, 256);
          return;
        }
        if (var8 == fg.field_d) {
          var13 = ed.field_g[2];
          var13.g(-(var13.field_y >> 1) + var5, -(var13.field_C >> 1) + var6, 256);
          return;
        }
        if (var8 != sc.field_a) {
          return;
        }
        ea var12 = ed.field_g[1];
        var12.g(-(var12.field_y >> 1) + var5, var6 - (var12.field_C >> 1), 256);
    }

    qn(jm param0) {
        try {
          this.field_I = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "qn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(fe param0, int param1) {
        RuntimeException var3 = null;
        fe var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 119) {
            return false;
          }
          var4 = (fe) null;
          this.a((fe) null, -111);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qn.UA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(String param0, String param1, boolean param2, bj param3) {
        RuntimeException var4 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            field_K = 78;
          }
          if (param3.a((byte) 126)) {
            stackIn_6_0 = param1 + " - " + param3.c(-14858) + "%";
            return stackIn_6_0;
          }
          stackIn_4_0 = (String) (param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("qn.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_K = 250;
    }
}
