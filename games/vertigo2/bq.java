/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq extends ji {
    static cr field_B;
    private int field_y;
    static String field_A;
    static String[] field_G;
    static int field_E;
    private boolean field_z;
    static String field_C;
    static String field_H;
    static int[] field_D;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public bq() {
        super(1, false);
        this.field_y = 4096;
        this.field_z = true;
    }

    final static void a(aa param0, int param1) {
        try {
          ql.field_L.b(param0, param1 ^ -120);
          if (param1 != -1) {
            bq.g(-18);
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "bq.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void g(int param0) {
        field_C = null;
        field_G = null;
        if (param0 <= 7) {
          field_G = (String[]) null;
        }
        field_A = null;
        field_D = null;
        field_H = null;
        field_B = null;
    }

    final int[][] b(int param0, int param1) {
        int[] var40 = null;
        int[] var5 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int var10 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var21 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -3780) {
          field_A = (String) null;
        }
        int[][] var29 = this.field_v.a(param1, -2);
        int[][] var23 = var29;
        int[][] var22 = var23;
        int[][] var3 = var22;
        if (this.field_v.field_c) {
          var40 = this.a(0, -1, -1 + param1 & fk.field_x);
          var5 = this.a(0, -1, param1);
          var41 = this.a(0, -1, 1 + param1 & fk.field_x);
          var42 = var29[0];
          var43 = var29[1];
          var44 = var29[2];
          for (var10 = 0; var10 < we.field_M; var10++) {
            var14 = (-var40[var10] + var41[var10]) * this.field_y;
            var15 = (var5[1 + var10 & rm.field_z] - var5[var10 - 1 & rm.field_z]) * this.field_y;
            var16 = var15 >> 12;
            var17 = var14 >> 12;
            var18 = var16 * var16 >> 12;
            var19 = var17 * var17 >> 12;
            var20 = (int)(4096.0 * Math.sqrt((double)((float)(4096 + (var19 + var18)) / 4096.0f)));
            if (var20 == 0) {
              var11 = 0;
              var12 = 0;
              var13 = 0;
            } else {
              var11 = var15 / var20;
              var12 = var14 / var20;
              var13 = 16777216 / var20;
            }
            if (this.field_z) {
              var13 = (var13 >> 1) + 2048;
              var11 = (var11 >> 1) + 2048;
              var12 = 2048 + (var12 >> 1);
            }
            var42[var10] = var11;
            var43[var10] = var12;
            var44[var10] = var13;
          }
        }
        return var22;
    }

    final static void h(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        jp var4_ref_jp = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        jp var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Vertigo2.field_L ? 1 : 0;
        try {
          tf.field_o = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = cg.field_b.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_jp = cg.field_b[var3];
            var4_ref_jp.a((byte) 117);
            c.a(var3, -3797);
            var5 = var4_ref_jp.field_D + var4_ref_jp.field_S >> 1;
            var6 = var4_ref_jp.field_E + var4_ref_jp.field_t >> 1;
            var7 = var4_ref_jp.field_B + var4_ref_jp.field_k >> 1;
            var8 = tf.field_o[9] >> 2;
            var9 = tf.field_o[10] >> 2;
            var10_int = tf.field_o[11] >> 2;
            var11 = ba.field_g[4] * var9 + (var8 * ba.field_g[3] + ba.field_g[5] * var10_int) >> 14;
            var12 = ba.field_g[8] * var10_int + ba.field_g[7] * var9 + var8 * ba.field_g[6] >> 14;
            var13 = ba.field_g[9] * var8 - (-(ba.field_g[10] * var9) - ba.field_g[11] * var10_int) >> 14;
            var2[var3] = var13 * var7 + (var5 * var11 + var12 * var6) >> 16;
          }
          var3Lifetime1 = tf.field_o[9] >> 8;
          var4 = tf.field_o[10] >> 8;
          var5Lifetime1 = tf.field_o[11] >> 8;
          var6Lifetime1 = hm.field_F << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = nf.a((byte) -28, var6Lifetime1) >> 8;
          var9Lifetime1 = fk.a((byte) -118, var6Lifetime1) >> 8;
          if (ed.field_n != -1 &&
            -1 != gb.field_d) {
            var9Lifetime1 = -128;
            var7Lifetime1 = -320 + ed.field_n;
            var8Lifetime1 = 240 - gb.field_d;
          }
          var10 = 256.0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + (var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1)));
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = -var5Lifetime1 + var9Lifetime1;
          if (param0 >= -97) {
            bq.g(19);
          }
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + var13Lifetime1 * var13Lifetime1 + var12Lifetime1 * var12Lifetime1));
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          for (var15 = 0; cg.field_b.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < cg.field_b.length; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = cg.field_b[var16];
            c.a(var16, -3797);
            for (var18 = 0; var18 < 3; var18++) {
              ba.field_g[var18] = ba.field_g[var18] + jg.field_j[var15][var18];
            }
            ti.a(ba.field_g, (byte) -53, false, false, true, tf.field_o, var17);
            pb.a(var12Lifetime1, var8Lifetime1, var13Lifetime1, var17, var7Lifetime1, var14, var9Lifetime1, 73);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "bq.A(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = param1;
          if (var4_int == 0) {
            this.field_y = param2.a((byte) -11);
          } else {
            if (var4_int == 1) {
              stackIn_8_1 = (param2.h(-11) == 1);
              this.field_z = stackIn_8_1;
            }
          }
          if (param0 != 110) {
            field_C = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("bq.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_G = new String[]{"All scores", "My scores", "Best each"};
        field_E = 0;
        field_C = "This password contains repeated characters, and would be easy to guess";
        field_H = "Co-op";
        field_D = new int[128];
    }
}
