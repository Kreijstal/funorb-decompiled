/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp extends ji {
    static int[] field_E;
    private int field_D;
    static wp field_A;
    static ve field_y;
    static cr field_C;
    static int field_z;

    final static void a(int param0, boolean param1, java.awt.Canvas param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        java.awt.Canvas var5 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          if (10 > qc.field_A) {
            var3_int = 0;
            if (uh.field_sc) {
              uh.field_sc = false;
              var3_int = 1;
            }
            tq.a(bh.field_M, var3_int != 0, db.h(2), (byte) -128, od.a((byte) -18));
          } else {
            if (!nl.a((byte) 107)) {
              bi.c();
              lm.a((byte) 115, 240, 320);
              dh.a(0, (byte) -97, param2, 0);
            } else {
              if (hn.field_w != 0) {
                an.a(-1243, param2);
              } else {
                td.a(param1, false, (byte) -77);
                dh.a(0, (byte) -11, param2, 0);
              }
            }
          }
          if (param0 == 240) {
            return;
          }
          var5 = (java.awt.Canvas) null;
          bp.a(-25, true, (java.awt.Canvas) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("bp.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int[][] b(int param0, int param1) {
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
        int var17 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -3780) {
          return (int[][]) null;
        }
        int[][] var23 = this.field_v.a(param1, -2);
        int[][] var19 = var23;
        int[][] var18 = var19;
        int[][] var3 = var18;
        if (this.field_v.field_c) {
          var30 = this.a(1, -1, param1);
          var31 = this.a(2, param0 ^ 3779, param1);
          var6 = var23[0];
          var7 = var23[1];
          var8 = var23[2];
          for (var9 = 0; we.field_M > var9; var9++) {
            var10 = var30[var9] * 255 >> 12 & 255;
            var11 = this.field_D * var31[var9] >> 12;
            var12 = qb.field_b[var10] * var11 >> 12;
            var13 = eh.field_b[var10] * var11 >> 12;
            var14 = (var12 >> 12) + var9 & rm.field_z;
            var15 = param1 + (var13 >> 12) & fk.field_x;
            var32 = this.c(0, 3, var15);
            var6[var9] = var32[0][var14];
            var7[var9] = var32[1][var14];
            var8[var9] = var32[2][var14];
          }
          return var18;
        }
        return var18;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 110) {
            field_E = (int[]) null;
          }
          var4_int = param1;
          if (var4_int == 0) {
            this.field_D = param2.a((byte) -11) << 4;
            return;
          }
          if (var4_int == 1) {
            stackIn_11_1 = (1 == param2.h(param0 - 121));
            this.field_o = stackIn_11_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("bp.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public bp() {
        super(3, false);
        this.field_D = 32768;
    }

    public static void g(int param0) {
        field_y = null;
        field_A = null;
        field_E = null;
        field_C = null;
        if (param0 != 7750) {
          field_C = (cr) null;
        }
    }

    final int[] c(int param0, int param1) {
        int var6 = 0;
        int[] var3;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        int[] var15;
        int[] var25;
        int[] var26;
        int[] var27;
        var14 = Vertigo2.field_L ? 1 : 0;
        if (param1 <= 91) {
          return (int[]) null;
        }
        var15 = this.field_x.a(param0, (byte) -84);
        var3 = var15;
        if (!this.field_x.field_i) {
          return var3;
        }
        var25 = this.a(1, -1, param0);
        var26 = this.a(2, -1, param0);
        for (var6 = 0; we.field_M > var6; var6++) {
          var7 = (4082 & var25[var6]) >> 4;
          var8 = this.field_D * var26[var6] >> 12;
          var9 = var8 * qb.field_b[var7] >> 12;
          var10 = var8 * eh.field_b[var7] >> 12;
          var11 = var6 + (var9 >> 12) & rm.field_z;
          var12 = (var10 >> 12) + param0 & fk.field_x;
          var27 = this.a(0, -1, var12);
          var15[var6] = var27[var11];
        }
        return var3;
    }

    final void a(int param0) {
        uk.d((byte) 67);
        if (param0 >= -98) {
          this.field_D = 10;
        }
    }

    static {
        field_E = new int[]{600, 600, 1200, 600, 900, 1100, 2500, 1750, 2500, 2500, 1300, 2100, 2250, 3200, 6500, 9000, 5000, 8250, 6000, 5250, 6000, 5500, 5250, 7500, 6400, 7750, 6000, 7750, 12000, 6000, 6000, 8000, 7500, 6750, 7500, 10000, 9000, 6500, 9000, 7500, 7000, 7500, 6000, 6000, 4500, 6000, 6750, 10500, 6000, 8250};
        field_A = new wp();
        field_y = new ve(12, 0, 1, 0);
    }
}
