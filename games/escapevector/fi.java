/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fi {
    int field_d;
    static String field_c;
    static mf field_j;
    int field_g;
    int field_h;
    static String field_b;
    static String field_e;
    int field_i;
    int field_a;
    int field_f;

    public static void b(int param0) {
        field_c = null;
        field_j = null;
        field_e = null;
        if (param0 != -26317) {
          field_c = (String) null;
        }
        field_b = null;
    }

    final static void a(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        ia var4_ref_ia = null;
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
        ia var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = EscapeVector.field_A;
        try {
          kh.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = fh.field_e.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_ia = fh.field_e[var3];
            var4_ref_ia.a((byte) 49);
            ee.a(var3, 103);
            var5 = var4_ref_ia.field_a + var4_ref_ia.field_b >> 1;
            var6 = var4_ref_ia.field_i + var4_ref_ia.field_R >> 1;
            var7 = var4_ref_ia.field_g + var4_ref_ia.field_O >> 1;
            var8 = kh.field_a[9] >> 2;
            var9 = kh.field_a[10] >> 2;
            var10_int = kh.field_a[11] >> 2;
            var11 = var8 * ka.field_c[3] + (var9 * ka.field_c[4] + var10_int * ka.field_c[5]) >> 14;
            var12 = var10_int * ka.field_c[8] + ka.field_c[6] * var8 + ka.field_c[7] * var9 >> 14;
            var13 = var8 * ka.field_c[9] + var9 * ka.field_c[10] + ka.field_c[11] * var10_int >> 14;
            var2[var3] = var7 * var13 + (var12 * var6 + var11 * var5) >> 16;
          }
          var3Lifetime1 = kh.field_a[9] >> 8;
          var4 = kh.field_a[10] >> 8;
          var5Lifetime1 = kh.field_a[11] >> 8;
          var6Lifetime1 = kb.field_d << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = fc.a(10758, var6Lifetime1) >> 8;
          var9Lifetime1 = ul.a(-127, var6Lifetime1) >> 8;
          if (param0 >= -107) {
            fi.a(56);
          }
          if (dh.field_d != -1 &&
            -1 != bj.field_y) {
            var7Lifetime1 = -320 + dh.field_d;
            var8Lifetime1 = -bj.field_y + 240;
            var9Lifetime1 = -128;
          }
          var10 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1 + var9Lifetime1 * var9Lifetime1));
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var12Lifetime1 * var12Lifetime1 - (-(var13Lifetime1 * var13Lifetime1) - var14 * var14)));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; fh.field_e.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < fh.field_e.length; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = fh.field_e[var16];
            ee.a(var16, 61);
            for (var18 = 0; 3 > var18; var18++) {
              ka.field_c[var18] = ka.field_c[var18] + jg.field_c[var15][var18];
            }
            cf.a(true, ka.field_c, false, kh.field_a, false, true, var17);
            uk.a(var13Lifetime1, -16711760, var7Lifetime1, var12Lifetime1, var14, var17, var9Lifetime1, var8Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "fi.F(" + param0 + ')');
        }
    }

    final static void a(dk[] param0, int param1) {
        int var6 = 0;
        int[] var3 = null;
        int[] var4 = null;
        dk[] var5 = null;
        dk var7 = null;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var8 = EscapeVector.field_A;
        try {
          if (param0 == null) {
            return;
          }
          var9 = new int[]{3170352, 8421504, 8421504};
          var3 = new int[]{6340704, 16777215, 16777215};
          var4 = new int[]{6340704, 16777215, 16777215};
          var5 = param0;
          for (var6 = param1; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (var7 != null) {
              var7.a(var3, var9, (byte) -122, var4);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("fi.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    static {
        field_b = "Name";
        field_c = "Invalid password.";
        field_e = "Player";
    }
}
