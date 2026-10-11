/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class af implements rc {
    static o field_b;
    private long field_c;
    static String[] field_d;
    static int field_a;

    final static void d(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        ee var4_ref_ee = null;
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
        ee var17 = null;
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
        var19 = Terraphoenix.field_V;
        try {
          ik.field_c = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = cm.field_b.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_ee = cm.field_b[var3];
            var4_ref_ee.c((byte) 41);
            ad.a(var3, -6);
            var5 = var4_ref_ee.field_r + var4_ref_ee.field_K >> 1;
            var6 = var4_ref_ee.field_M + var4_ref_ee.field_a >> 1;
            var7 = var4_ref_ee.field_t + var4_ref_ee.field_v >> 1;
            var8 = ik.field_c[9] >> 2;
            var9 = ik.field_c[10] >> 2;
            var10_int = ik.field_c[11] >> 2;
            var11 = ld.field_a[5] * var10_int + (ld.field_a[3] * var8 + ld.field_a[4] * var9) >> 14;
            var12 = var8 * ld.field_a[6] - (-(ld.field_a[7] * var9) - ld.field_a[8] * var10_int) >> 14;
            var13 = ld.field_a[9] * var8 - (-(ld.field_a[10] * var9) - ld.field_a[11] * var10_int) >> 14;
            var2[var3] = var5 * var11 + (var6 * var12 + var7 * var13) >> 16;
          }
          var3Lifetime1 = ik.field_c[9] >> 8;
          var4 = ik.field_c[10] >> 8;
          var5Lifetime1 = ik.field_c[11] >> 8;
          var6Lifetime1 = kf.field_f << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = bk.a((byte) 92, var6Lifetime1) >> 8;
          var9Lifetime1 = im.a(var6Lifetime1, true) >> 8;
          if (-1 != ef.field_j &&
            jb.field_b != -1) {
            var9Lifetime1 = -128;
            var8Lifetime1 = 240 - jb.field_b;
            var7Lifetime1 = -320 + ef.field_j;
          }
          if (param0 != -2766) {
            field_b = (o) null;
          }
          var10 = 256.0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + (var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1)));
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + var12Lifetime1 * var12Lifetime1 + var13Lifetime1 * var13Lifetime1));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; var15 < cm.field_b.length; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < cm.field_b.length; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = cm.field_b[var16];
            ad.a(var16, -6);
            for (var18 = 0; 3 > var18; var18++) {
              ld.field_a[var18] = ld.field_a[var18] + vh.field_j[var15][var18];
            }
            nd.a(var17, true, ik.field_c, 37, false, ld.field_a, false);
            lm.a(var17, var13Lifetime1, var7Lifetime1, var12Lifetime1, var9Lifetime1, 0, var8Lifetime1, var14);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "af.S(" + param0 + ')');
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (!param0) {
          return;
        }
        vc.field_a.a(param1, -125);
    }

    abstract im e(int param0);

    public final String b(byte param0) {
        if (this.a((byte) 117)) {
          return null;
        }
        if ((this.field_c + 350L) > ll.a(1000)) {
          return null;
        }
        int var2 = 86 / ((param0 - 40) / 61);
        return this.c(0);
    }

    public final im a(int param0) {
        if (this.a((byte) 117)) {
          return ab.field_d;
        }
        if (ll.a(1000) < (350L + this.field_c)) {
          return kj.field_d;
        }
        if (param0 != -16323) {
          this.b((byte) 22);
        }
        return this.e(0);
    }

    final static int a(String param0, pk param1, int param2, String[] param3, int param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        int var6Lifetime1;
        var13 = Terraphoenix.field_V;
        try {
          var5_int = param1.b(param0);
          if (param4 >= var5_int &&
            param0.indexOf("<br>") == -1) {
            param3[0] = param0;
            stackIn_4_0 = 1;
            return stackIn_4_0;
          }
          if (param2 != -3) {
            var14 = (String[]) null;
            af.a((String) null, (pk) null, 80, (String[]) null, 47);
          }
          var6 = (-1 + var5_int + param4) / param4;
          param4 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param0.length();
          for (var9 = 0; var8 > var9; var9++) {
            var10 = param0.charAt(var9);
            if (var10 == 32 ||
              var10 == 45) {
              var11 = param0.substring(var7, 1 + var9).trim();
              var12 = param1.b(var11);
              if (var12 >= param4) {
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param3[incrementValue$1] = var11;
                var7 = 1 + var9;
              }
            }
            if (var10 == 62 &&
              param0.regionMatches(-3 + var9, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param3[incrementValue$2] = param0.substring(var7, -3 + var9).trim();
              var7 = var9 + 1;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param3[incrementValue$0] = param0.substring(var7, var8).trim();
          }
          stackIn_28_0 = var6Lifetime1;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("af.W(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 8191) {
          af.a(true, false);
        }
        field_b = null;
        field_d = null;
    }

    public final void c(byte param0) {
        if (param0 < 11) {
          this.b((byte) -21);
        }
        this.field_c = ll.a(1000);
    }

    abstract String c(int param0);

    static {
        field_d = new String[]{"Allen", "Anderson", "Badger", "Baxter", "Bragshawe", "Brandon", "Brown", "Cambell", "Carter", "Cartwright", "Corrall", "Churchill", "Clay", "Cougan", "Cullock", "Davis", "Davies", "de Rivaz", "de Coursey", "de Waal", "England", "Falcon", "Faulkner", "Fitzpatrick", "Foxton", "Fuller", "Gratham", "Hammonds", "Holland", "Hun", "Hyde", "Jackson", "Jones", "Kerensky", "Lancaster", "Langley", "Lamprell", "Lee", "Lewis", "Martin", "Martinez", "Mayor", "McDonald", "McIntyre", "Miller", "Morris", "Nabrinski", "O'Connor", "O'Reilly", "Parker", "Peterson", "Philips", "Piercy", "Pritchard", "Rapier", "Richards", "Richter", "Ritter", "Reader", "Roud", "Schaeffer", "Singh", "Small", "Smith", "Smoke", "Stark", "Steiner", "Stour", "Stukov", "Sung", "Sutton", "Symons", "Taylor", "Thompson", "Thomson", "Vielmont", "Ward", "Wayne", "York", "Xavier"};
        field_b = new o();
    }
}
