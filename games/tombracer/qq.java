/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq extends vg {
    boolean field_g;
    int field_j;
    private int field_i;
    private static int[] field_h;
    private int[] field_k;
    int field_f;

    final int[] b() {
        return this.field_k;
    }

    final void a(int param0, int param1) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param0 == 0 &&
          param1 == 0) {
          return;
        }
        if (field_h == null ||
          field_h.length != this.field_k.length) {
          field_h = new int[this.field_k.length];
        }
        int var3 = this.field_k.length;
        int var4 = param0;
        int var5 = this.field_i - 1;
        int var6 = this.field_i * param1;
        int var7 = var3 - 1;
        for (var8_int = 0; var8_int < var3; var8_int = var8_int + this.field_i) {
          var9 = var8_int + var6 & var7;
          for (var10 = 0; var10 < this.field_i; var10++) {
            var11 = var8_int + var10;
            var12 = var9 + (var10 + var4 & var5);
            field_h[var11] = this.field_k[var12];
          }
        }
        int[] var8 = this.field_k;
        this.field_k = field_h;
        field_h = var8;
    }

    public static void a() {
        field_h = null;
    }

    qq(int param0, int param1, int[] param2, boolean param3) {
        int var31_int = 0;
        int[] var5;
        int[] var6;
        int[] var7;
        int[] var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int[] var31;
        int[] var32;
        int[] var33;
        int[] var34;
        int[] var35;
        int[] var36;
        int[] var37;
        int[] var38;
        int[] var39;
        int var9Lifetime1;
        int var18Lifetime1;
        int var9Lifetime1Lifetime1;
        int var9Lifetime1Lifetime2;
        this.field_f = param0;
        this.field_i = param1;
        this.field_k = param2;
        if (param3) {
          var36 = new int[this.field_i];
          var32 = var36;
          var5 = var32;
          var37 = new int[this.field_i];
          var33 = var37;
          var6 = var33;
          var38 = new int[this.field_i];
          var34 = var38;
          var7 = var34;
          var39 = new int[this.field_i];
          var35 = var39;
          var8 = var35;
          if (field_h == null ||
            field_h.length != this.field_k.length) {
            field_h = new int[this.field_k.length];
          }
          var13 = this.field_i;
          var14 = this.field_i;
          var15 = var13 - 1;
          var16 = var14 - 1;
          var17 = var13 * var14;
          var12 = 1 * var13;
          var11 = 1 * var13;
          for (var18 = 2; var18 >= 0; var18--) {
            for (var9 = var15; var9 >= 0; var9--) {
              var12--;
              var10 = this.field_k[var12];
              var5[var9] = var5[var9] + (var10 >> 24 & 255);
              var6[var9] = var6[var9] + (var10 >> 16 & 255);
              var7[var9] = var7[var9] + (var10 >> 8 & 255);
              var8[var9] = var8[var9] + (var10 & 255);
            }
            if (var12 == 0) {
              var12 = var17;
            }
          }
          var24 = var17;
          for (var31_int = var16; var31_int >= 0; var31_int--) {
            var25 = 1;
            var26 = 1;
            var30 = 0;
            var29 = 0;
            var28 = 0;
            var27 = 0;
            for (var9Lifetime1 = 2; var9Lifetime1 >= 0; var9Lifetime1--) {
              var26--;
              var27 = var27 + var36[var26];
              var28 = var28 + var37[var26];
              var30 = var30 + var38[var26];
              var29 = var29 + var39[var26];
              if (var26 == 0) {
                var26 = var13;
              }
            }
            for (var9Lifetime1Lifetime1 = var15; var9Lifetime1Lifetime1 >= 0; var9Lifetime1Lifetime1--) {
              var26--;
              var25--;
              var18Lifetime1 = var27 / 9;
              var19 = var28 / 9;
              var20 = var30 / 9;
              var21 = var29 / 9;
              var24--;
              field_h[var24] = var18Lifetime1 << 24 | var19 << 16 | var20 << 8 | var21;
              var27 = var27 + (var36[var26] - var36[var25]);
              var28 = var28 + (var37[var26] - var37[var25]);
              var29 = var29 + (var39[var26] - var39[var25]);
              var30 = var30 + (var38[var26] - var38[var25]);
              if (var26 == 0) {
                var26 = var13;
              }
              if (var25 == 0) {
                var25 = var13;
              }
            }
            for (var9Lifetime1Lifetime2 = var15; var9Lifetime1Lifetime2 >= 0; var9Lifetime1Lifetime2--) {
              var12--;
              var23 = this.field_k[var12];
              var11--;
              var22 = this.field_k[var11];
              var5[var9Lifetime1Lifetime2] = var5[var9Lifetime1Lifetime2] + ((var23 >> 24 & 255) - (var22 >> 24 & 255));
              var6[var9Lifetime1Lifetime2] = var6[var9Lifetime1Lifetime2] + ((var23 >> 16 & 255) - (var22 >> 16 & 255));
              var7[var9Lifetime1Lifetime2] = var7[var9Lifetime1Lifetime2] + ((var23 >> 8 & 255) - (var22 >> 8 & 255));
              var8[var9Lifetime1Lifetime2] = var8[var9Lifetime1Lifetime2] + ((var23 & 255) - (var22 & 255));
            }
            if (var12 == 0) {
              var12 = var17;
            }
            if (var11 == 0) {
              var11 = var17;
            }
          }
          var31 = this.field_k;
          this.field_k = field_h;
          field_h = var31;
        }
    }
}
