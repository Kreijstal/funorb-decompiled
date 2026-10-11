/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static int field_a;
    static fe field_b;

    final static void a(byte param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        e var4_ref_e = null;
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
        e var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        e var17Lifetime1;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Transmogrify.field_A ? 1 : 0;
        try {
          rk.field_n = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = rf.field_eb.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_e = rf.field_eb[var3];
            var17 = var4_ref_e;
            var4_ref_e.a(22856);
            l.a(var3, -87);
            var5 = var4_ref_e.field_t + var4_ref_e.field_P >> 1;
            var6 = var4_ref_e.field_O + var4_ref_e.field_u >> 1;
            var7 = var4_ref_e.field_i + var4_ref_e.field_k >> 1;
            var8 = rk.field_n[9] >> 2;
            var9 = rk.field_n[10] >> 2;
            var10_int = rk.field_n[11] >> 2;
            var11 = var10_int * qd.field_a[5] + var9 * qd.field_a[4] + var8 * qd.field_a[3] >> 14;
            var12 = var9 * qd.field_a[7] + qd.field_a[6] * var8 + qd.field_a[8] * var10_int >> 14;
            var13 = qd.field_a[9] * var8 - (-(var9 * qd.field_a[10]) - qd.field_a[11] * var10_int) >> 14;
            var2[var3] = var13 * var7 + var6 * var12 + var11 * var5 >> 16;
          }
          var3Lifetime1 = rk.field_n[9] >> 8;
          var4 = rk.field_n[10] >> 8;
          var5Lifetime1 = rk.field_n[11] >> 8;
          var6Lifetime1 = si.field_l << 4;
          if (param0 != 16) {
            f.a(true);
          }
          var7Lifetime1 = 0;
          var8Lifetime1 = pe.a(4096, var6Lifetime1) >> 8;
          var9Lifetime1 = ri.a(-124, var6Lifetime1) >> 8;
          if (oa.field_j != -1 &&
            -1 != bk.field_a) {
            var7Lifetime1 = -320 + oa.field_j;
            var9Lifetime1 = -128;
            var8Lifetime1 = 240 - bk.field_a;
          }
          var10 = 256.0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + (var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1)));
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + var12Lifetime1 * var12Lifetime1 + var13Lifetime1 * var13Lifetime1));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; rf.field_eb.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < rf.field_eb.length; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17Lifetime1 = rf.field_eb[var16];
            l.a(var16, -95);
            for (var18 = 0; 3 > var18; var18++) {
              qd.field_a[var18] = qd.field_a[var18] + ae.field_a[var15][var18];
            }
            gg.a((byte) 119, rk.field_n, true, false, var17Lifetime1, false, qd.field_a);
            vd.a(var12Lifetime1, var14, var7Lifetime1, var8Lifetime1, -110, var13Lifetime1, var17Lifetime1, var9Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "f.C(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_b = (fe) null;
        }
        field_b = null;
    }

    final static ii a(int param0) {
        ii var1 = new ii(pj.field_y, ll.field_U, gj.field_j[0], re.field_a[0], ql.field_b[0], wk.field_b[param0], re.field_K[0], rg.field_D);
        wd.d(param0 ^ 9);
        return var1;
    }

    static {
    }
}
