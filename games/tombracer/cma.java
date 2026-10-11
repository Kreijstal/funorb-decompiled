/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cma extends ci {
    private int field_p;
    private int field_r;
    private int field_q;
    private int[] field_o;
    static int field_m;
    private int field_n;

    final static su[] c(int param0) {
        int var1 = 23 % ((-4 - param0) / 36);
        return new su[]{uk.field_M, ula.field_v, csa.field_y, ll.field_d, sga.field_n, bi.field_d, dp.field_g, wc.field_e, vna.field_a, wsa.field_v, al.field_f, kea.field_c, lfa.field_o, oc.field_H};
    }

    public cma() {
        super(1, false);
        this.field_p = 4096;
        this.field_q = 4096;
        this.field_o = new int[3];
        this.field_r = 4096;
        this.field_n = 409;
    }

    final void a(byte param0, uia param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        uia var7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 107) {
            var7 = (uia) null;
            this.a((byte) -33, (uia) null, 70);
          }
          var5 = param2;
          if (var5 == 0) {
            this.field_n = param1.d(param0 ^ 17);
            return;
          }
          if (var5 == 1) {
            this.field_p = param1.d(124);
            return;
          }
          if (2 == var5) {
            this.field_r = param1.d(param0 + 20);
            return;
          }
          if (var5 == 3) {
            this.field_q = param1.d(123);
            return;
          }
          if (4 == var5) {
            var4_int = param1.a(-32768);
            this.field_o[2] = sea.c(var4_int, 255) >> 12;
            this.field_o[0] = sea.c(267386880, var4_int << 4);
            this.field_o[1] = sea.c(4080, var4_int >> 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("cma.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final int[][] b(int param0, int param1) {
        int var11 = 0;
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[][] var17;
        int[][] var19;
        int[] var21;
        int[] var24;
        int[] var25;
        int[][] var27;
        int[] var29;
        int[] var32;
        int[] var33;
        int[][] var38;
        int[] var39;
        int[] var40;
        int[] var41;
        int[] var29Lifetime1;
        int[] var32Lifetime1;
        int[] var40Lifetime1;
        var16 = TombRacer.field_G ? 1 : 0;
        var27 = this.field_h.a(param0, (byte) 122);
        var19 = var27;
        var17 = var19;
        var3 = var17;
        if (param1 != -1) {
          return (int[][]) null;
        }
        if (!this.field_h.field_f) {
          return var3;
        }
        var38 = this.a(param0, 0, -1);
        var39 = var38[0];
        var40 = var38[1];
        var41 = var38[2];
        var29 = var27[0];
        var21 = var29;
        var8 = var21;
        var32 = var27[1];
        var24 = var32;
        var9 = var24;
        var33 = var27[2];
        var25 = var33;
        var10 = var25;
        for (var11 = 0; ns.field_g > var11; var11++) {
          var13 = var39[var11];
          var12 = var13 - this.field_o[0];
          if (0 > var12) {
            var12 = -var12;
          }
          if (this.field_n < var12) {
            var29Lifetime1 = var27[0];
            var32Lifetime1 = var27[1];
            var40Lifetime1 = var38[1];
            var29Lifetime1[var11] = var13;
            var9[var11] = var40Lifetime1[var11];
            var10[var11] = var41[var11];
          } else {
            var29Lifetime1 = var27[0];
            var32Lifetime1 = var27[1];
            var40Lifetime1 = var38[1];
            var14 = var40Lifetime1[var11];
            var12 = -this.field_o[1] + var14;
            if (var12 < 0) {
              var12 = -var12;
            }
            if (this.field_n >= var12) {
              var15 = var41[var11];
              var12 = -this.field_o[2] + var15;
              if (var12 < 0) {
                var12 = -var12;
              }
              if (var12 > this.field_n) {
                var29Lifetime1[var11] = var13;
                var32Lifetime1[var11] = var14;
                var33[var11] = var15;
              } else {
                var8[var11] = var13 * this.field_q >> 12;
                var9[var11] = var14 * this.field_r >> 12;
                var10[var11] = this.field_p * var15 >> 12;
              }
            } else {
              var29Lifetime1[var11] = var13;
              var32Lifetime1[var11] = var14;
              var10[var11] = var41[var11];
            }
          }
        }
        return var3;
    }

    static {
    }
}
