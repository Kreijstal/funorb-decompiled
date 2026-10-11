/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends l {
    static il field_k;
    static String field_i;
    static km field_h;
    static String field_g;
    static String field_j;

    public static void c(int param0) {
        field_k = null;
        field_i = null;
        field_g = null;
        field_h = null;
        field_j = null;
        int var1 = 84 / ((56 - param0) / 52);
    }

    final static void a(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        wm var4_ref_wm = null;
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
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        wm var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Virogrid.field_F ? 1 : 0;
        try {
          lh.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = ph.field_n.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_wm = ph.field_n[var3];
            var4_ref_wm.b((byte) 127);
            hh.a((byte) 87, var3);
            var5 = var4_ref_wm.field_C + var4_ref_wm.field_U >> 1;
            var6 = var4_ref_wm.field_T + var4_ref_wm.field_g >> 1;
            var7 = var4_ref_wm.field_p + var4_ref_wm.field_L >> 1;
            var8 = lh.field_a[9] >> 2;
            var9 = lh.field_a[10] >> 2;
            var10_int = lh.field_a[11] >> 2;
            var11 = var9 * gl.field_c[4] + (gl.field_c[3] * var8 + gl.field_c[5] * var10_int) >> 14;
            var12 = gl.field_c[8] * var10_int + var9 * gl.field_c[7] + gl.field_c[6] * var8 >> 14;
            var13 = var9 * gl.field_c[10] + (gl.field_c[9] * var8 + var10_int * gl.field_c[11]) >> 14;
            var2[var3] = var7 * var13 + var11 * var5 + var6 * var12 >> 16;
          }
          var3Lifetime1 = lh.field_a[9] >> 8;
          var4 = lh.field_a[10] >> 8;
          var5Lifetime1 = lh.field_a[param0] >> 8;
          var6Lifetime1 = kf.field_e << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = id.a(var6Lifetime1, 32) >> 8;
          var9Lifetime1 = nf.a(21855, var6Lifetime1) >> 8;
          if (nl.field_u != -1 &&
            hk.field_Jb != -1) {
            var8Lifetime1 = 240 - hk.field_Jb;
            var9Lifetime1 = -128;
            var7Lifetime1 = -320 + nl.field_u;
          }
          var10 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + (var7Lifetime1 * var7Lifetime1 + var9Lifetime1 * var9Lifetime1)));
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + (var12Lifetime1 * var12Lifetime1 + var14 * var14)));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; var15 < ph.field_n.length; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < ph.field_n.length; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = ph.field_n[var16];
            hh.a((byte) 104, var16);
            for (var18 = 0; var18 < 3; var18++) {
              gl.field_c[var18] = gl.field_c[var18] + kh.field_f[var15][var18];
            }
            fe.a(gl.field_c, true, true, var17, false, lh.field_a, false);
            gf.a(var13Lifetime1, var7Lifetime1, var14, var12Lifetime1, var17, var9Lifetime1, var8Lifetime1, -22085);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "cm.D(" + param0 + ')');
        }
    }

    private cm() throws Throwable {
        throw new Error();
    }

    final static void a(java.awt.Canvas param0, byte param1, boolean param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (10 > dj.field_n) {
            var3_int = 0;
            if (ce.field_K) {
              var3_int = 1;
              ce.field_K = false;
            }
            ub.a(hf.field_v, var3_int != 0, wm.a((byte) 98), qe.g(11108), param1 ^ 83);
          } else {
            if (nm.c(param1 ^ -45)) {
              if (j.field_l == 0) {
                wb.a(false, (byte) 119, param2);
                td.a(-30179, param0, 0, 0);
              } else {
                uh.a((byte) 114, param0);
              }
            } else {
              df.c();
              fh.a(240, 0, 320);
              td.a(-30179, param0, 0, 0);
            }
          }
          if (param1 != -47) {
            field_h = (km) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("cm.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2) {
        hg var3 = gk.field_g;
        var3.g(param2, 8);
        var3.a(3, param0 ^ 82);
        var3.a(8, -76);
        if (param0 != 20) {
          return;
        }
        var3.a((byte) -107, param1);
    }

    static {
        field_g = "Unrated game";
        field_i = "Public";
        field_j = "Hotseat/Singleplayer";
    }
}
