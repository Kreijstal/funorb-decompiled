/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends am {
    private int field_t;
    static String field_v;
    static int field_s;
    static String field_u;

    final static t[] a(int param0, la param1, int param2, int param3) {
        RuntimeException var4 = null;
        t[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!nd.a(param0, param1, -1, param2)) {
            return null;
          }
          if (param3 != 482809644) {
            mi.g((byte) 127);
          }
          stackIn_6_0 = p.a(3499);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("mi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var25 = null;
        int[] var26 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var27 = null;
        int var14 = Torquing.field_u;
        if (param0 <= 86) {
          return (int[]) null;
        }
        int[] var15 = this.field_l.a(param1, 25657);
        int[] var3 = var15;
        if (this.field_l.field_b) {
          var25 = this.b(0, 1, param1);
          var26 = this.b(0, 2, param1);
          for (var6 = 0; var6 < ci.field_c; var6++) {
            var7 = 255 & var25[var6] >> 4;
            var8 = var26[var6] * this.field_t >> 12;
            var9 = de.field_d[var7] * var8 >> 12;
            var10 = var8 * jh.field_x[var7] >> 12;
            var11 = var6 + (var9 >> 12) & jh.field_A;
            var12 = vp.field_I & (var10 >> 12) + param1;
            var27 = this.b(0, 0, var12);
            var15[var6] = var27[var11];
          }
        }
        return var3;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          var4_int = param2;
          if (0 != var4_int) {
            if (var4_int == 1) {
              stackIn_9_1 = (1 == param0.i((byte) -101));
              this.field_p = stackIn_9_1;
            }
          } else {
            this.field_t = param0.i(param1 ^ 7059) << 4;
          }
          if (param1 != 35) {
            this.field_t = -72;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("mi.H(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public mi() {
        super(3, false);
        this.field_t = 32768;
    }

    final void a(byte param0) {
        if (param0 < 123) {
          this.a((byte) -2, 21);
        }
        ie.a(14837);
    }

    final int[][] a(int param0, int param1) {
        int[] var30 = null;
        int[] var31 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var32 = null;
        int var17 = Torquing.field_u;
        if (param0 != -29116) {
          field_u = (String) null;
        }
        int[][] var23 = this.field_r.a(15142, param1);
        int[][] var19 = var23;
        int[][] var18 = var19;
        int[][] var3 = var18;
        if (this.field_r.field_b) {
          var30 = this.b(0, 1, param1);
          var31 = this.b(0, 2, param1);
          var6 = var23[0];
          var7 = var23[1];
          var8 = var23[2];
          for (var9 = 0; var9 < ci.field_c; var9++) {
            var10 = (1048214 & var30[var9] * 255) >> 12;
            var11 = var31[var9] * this.field_t >> 12;
            var12 = de.field_d[var10] * var11 >> 12;
            var13 = jh.field_x[var10] * var11 >> 12;
            var14 = jh.field_A & (var12 >> 12) + var9;
            var15 = vp.field_I & param1 + (var13 >> 12);
            var32 = this.c(24066, var15, 0);
            var6[var9] = var32[0][var14];
            var7[var9] = var32[1][var14];
            var8[var9] = var32[2][var14];
          }
        }
        return var18;
    }

    public static void g(byte param0) {
        if (param0 != -39) {
          field_v = (String) null;
        }
        field_u = null;
        field_v = null;
    }

    static {
        field_v = "End Game";
        field_u = "Next Steps";
    }
}
