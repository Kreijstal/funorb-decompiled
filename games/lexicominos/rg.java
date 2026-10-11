/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static int[] field_c;
    static int field_b;
    static String field_d;
    static String field_a;

    final static void a(db[] param0, int param1, byte param2, int param3) {
        ki.field_a = new wh(param0);
        wh.field_f = param3;
        if (param2 != -105) {
          return;
        }
        try {
          id.field_v = param1;
          ge.f(72);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "rg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 >= -91) {
          field_c = (int[]) null;
        }
        if (null != ol.field_l) {
          var1 = ol.field_l;
          synchronized (var1) {
            ol.field_l = null;
          }
        }
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != 0) {
          rg.b(8);
        }
        field_c = null;
        field_d = null;
    }

    final static void b(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        pk var4_ref_pk = null;
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
        pk var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Lexicominos.field_L ? 1 : 0;
        try {
          ae.field_M = new int[]{param0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = ae.field_J.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_pk = ae.field_J[var3];
            var4_ref_pk.a((byte) -50);
            u.b(var3, -119);
            var5 = var4_ref_pk.field_v + var4_ref_pk.field_m >> 1;
            var6 = var4_ref_pk.field_G + var4_ref_pk.field_M >> 1;
            var7 = var4_ref_pk.field_O + var4_ref_pk.field_F >> 1;
            var8 = ae.field_M[9] >> 2;
            var9 = ae.field_M[10] >> 2;
            var10_int = ae.field_M[11] >> 2;
            var11 = var10_int * oj.field_l[5] + var8 * oj.field_l[3] + var9 * oj.field_l[4] >> 14;
            var12 = var8 * oj.field_l[6] + oj.field_l[7] * var9 + oj.field_l[8] * var10_int >> 14;
            var13 = var8 * oj.field_l[9] + (oj.field_l[10] * var9 + var10_int * oj.field_l[11]) >> 14;
            var2[var3] = var7 * var13 + var12 * var6 + var5 * var11 >> 16;
          }
          var3Lifetime1 = ae.field_M[9] >> 8;
          var4 = ae.field_M[10] >> 8;
          var5Lifetime1 = ae.field_M[11] >> 8;
          var6Lifetime1 = mc.field_k << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = m.a(var6Lifetime1, (byte) 30) >> 8;
          var9Lifetime1 = nb.a(-95, var6Lifetime1) >> 8;
          if (-1 != bk.field_b &&
            sh.field_e != -1) {
            var8Lifetime1 = -sh.field_e + 240;
            var7Lifetime1 = bk.field_b - 320;
            var9Lifetime1 = -128;
          }
          var10 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + (var7Lifetime1 * var7Lifetime1 + var9Lifetime1 * var9Lifetime1)));
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var12Lifetime1 * var12Lifetime1 - (-(var13Lifetime1 * var13Lifetime1) - var14 * var14)));
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          for (var15 = 0; ae.field_J.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < ae.field_J.length; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = ae.field_J[var16];
            u.b(var16, -114);
            for (var18 = 0; var18 < 3; var18++) {
              oj.field_l[var18] = oj.field_l[var18] + uj.field_f[var15][var18];
            }
            da.a(oj.field_l, true, ae.field_M, false, false, var17, (byte) -58);
            ff.a(var13Lifetime1, var7Lifetime1, var8Lifetime1, var12Lifetime1, var14, var9Lifetime1, (byte) -116, var17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "rg.A(" + param0 + ')');
        }
    }

    static {
        field_d = "Passwords can only contain letters and numbers";
        field_a = "Names cannot contain consecutive spaces";
    }
}
