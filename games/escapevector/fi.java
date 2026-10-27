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
        int var19 = EscapeVector.obfuscationControl;
        try {
          kh.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          int var1_int = fh.field_e.length;
          int[] var21 = new int[var1_int];
          int[] var20 = var21;
          int[] var2 = var20;
          for (int var3 = 0; var3 < var1_int; var3++) {
            ia var4_ref_ia = fh.field_e[var3];
            var4_ref_ia.a((byte) 49);
            ee.a(var3, 103);
            int var5 = var4_ref_ia.field_a + var4_ref_ia.field_b >> 1;
            int var6 = var4_ref_ia.field_i + var4_ref_ia.field_R >> 1;
            int var7 = var4_ref_ia.field_g + var4_ref_ia.field_O >> 1;
            int var8 = kh.field_a[9] >> 2;
            int var9 = kh.field_a[10] >> 2;
            int var10_int = kh.field_a[11] >> 2;
            int var11 = var8 * TerrainMaskSupport.field_c[3] + (var9 * TerrainMaskSupport.field_c[4] + var10_int * TerrainMaskSupport.field_c[5]) >> 14;
            int var12 = var10_int * TerrainMaskSupport.field_c[8] + TerrainMaskSupport.field_c[6] * var8 + TerrainMaskSupport.field_c[7] * var9 >> 14;
            int var13 = var8 * TerrainMaskSupport.field_c[9] + var9 * TerrainMaskSupport.field_c[10] + TerrainMaskSupport.field_c[11] * var10_int >> 14;
            var2[var3] = var7 * var13 + (var12 * var6 + var11 * var5) >> 16;
          }
          int var3Lifetime1 = kh.field_a[9] >> 8;
          int var4 = kh.field_a[10] >> 8;
          int var5Lifetime1 = kh.field_a[11] >> 8;
          int var6Lifetime1 = kb.field_d << 4;
          int var7Lifetime1 = 0;
          int var8Lifetime1 = fc.a(10758, var6Lifetime1) >> 8;
          int var9Lifetime1 = ul.a(-127, var6Lifetime1) >> 8;
          if (param0 >= -107) {
            fi.a(56);
          }
          if (dh.field_d != -1 &&
            -1 != bj.field_y) {
            var7Lifetime1 = -320 + dh.field_d;
            var8Lifetime1 = -bj.field_y + 240;
            var9Lifetime1 = -128;
          }
          double var10 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1 + var9Lifetime1 * var9Lifetime1));
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          int var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          int var13Lifetime1 = -var4 + var8Lifetime1;
          int var14 = -var5Lifetime1 + var9Lifetime1;
          double var10Lifetime1 = 256.0 / Math.sqrt((double)(var12Lifetime1 * var12Lifetime1 - (-(var13Lifetime1 * var13Lifetime1) - var14 * var14)));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (int var15 = 0; fh.field_e.length > var15; var15++) {
            int var16 = 0;
            for (int var17_int = 1; var17_int < fh.field_e.length; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            ia var17 = fh.field_e[var16];
            ee.a(var16, 61);
            for (int var18 = 0; 3 > var18; var18++) {
              TerrainMaskSupport.field_c[var18] = TerrainMaskSupport.field_c[var18] + jg.field_c[var15][var18];
            }
            cf.a(true, TerrainMaskSupport.field_c, false, kh.field_a, false, true, var17);
            uk.a(var13Lifetime1, -16711760, var7Lifetime1, var12Lifetime1, var14, var17, var9Lifetime1, var8Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "fi.F(" + param0 + ')');
        }
    }

    final static void a(dk[] param0, int param1) {
        String stackIn_13_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (param0 == null) {
            return;
          }
          int[] var9 = new int[]{3170352, 8421504, 8421504};
          int[] var3 = new int[]{6340704, 16777215, 16777215};
          int[] var4 = new int[]{6340704, 16777215, 16777215};
          dk[] var5 = param0;
          for (int var6 = param1; var6 < var5.length; var6++) {
            dk var7 = var5[var6];
            if (var7 != null) {
              var7.a(var3, var9, (byte) -122, var4);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var2;
          StringBuilder stackIn_12_1 = new StringBuilder().append("fi.E(");
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
