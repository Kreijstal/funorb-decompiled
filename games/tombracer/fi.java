/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class fi {
    private short[] field_e;
    private int field_d;
    private int field_f;
    private short[] field_g;
    private int field_b;
    static int field_c;
    int field_a;
    private int field_h;

    abstract void a(int param0, byte param1, int param2);

    private final void a(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        this.field_g = new short[this.field_a];
        if (param0 != -15063) {
          this.a(-68);
        }
        for (var2 = 0; var2 < this.field_a; var2++) {
          this.field_g[var2] = (short)(int)Math.pow(2.0, (double)var2);
        }
    }

    abstract void c(int param0);

    abstract void a(byte param0);

    private final void b(int param0) {
        Random var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3Lifetime1;
        var7 = TombRacer.field_G ? 1 : 0;
        var2 = new Random((long)this.field_h);
        var3 = 0;
        if (param0 != -256) {
          field_c = 100;
        }
        while (var3 < 255) {
          this.field_e[var3] = (short)var3;
          var3++;
        }
        for (var3Lifetime1 = 0; var3Lifetime1 < 255; var3Lifetime1++) {
          var4 = -var3Lifetime1 + 255;
          var5 = jqa.a(var4, var2, -120);
          var6 = this.field_e[var5];
          this.field_e[var5] = this.field_e[var4];
          this.field_e[256 + var4] = (short) var6;
          this.field_e[var4] = (short) var6;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var37 = 0;
        int var36 = 0;
        int var35 = 0;
        int var38 = 0;
        int var9 = 0;
        int var6 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var19 = 0;
        int var24 = 0;
        int var17 = 0;
        int var20 = 0;
        int var22 = 0;
        int var21 = 0;
        int var18 = 0;
        int var23 = 0;
        int var25 = 0;
        int var28 = 0;
        int var26 = 0;
        int var27 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var42 = 0;
        int var43 = TombRacer.field_G ? 1 : 0;
        int[] var48 = new int[param2];
        int[] var45 = var48;
        int[] var39 = var45;
        int[] var47 = new int[param0];
        int[] var44 = var47;
        int[] var40 = var44;
        int[] var49 = new int[param1];
        int[] var46 = var49;
        int[] var41 = var46;
        int var29Lifetime1;
        int var29Lifetime2;
        int var29Lifetime3;
        int var30Lifetime1;
        int var30Lifetime2;
        int var30Lifetime3;
        int var31Lifetime1;
        int var32Lifetime1;
        int var42Lifetime1;
        int var42Lifetime2;
        int var42Lifetime3;
        if (param3 > -87) {
          this.field_f = 92;
        }
        for (var42 = 0; var42 < param2; var42++) {
          var39[var42] = (var42 << 12) / param2;
        }
        for (var42Lifetime1 = 0; var42Lifetime1 < param0; var42Lifetime1++) {
          var40[var42Lifetime1] = (var42Lifetime1 << 12) / param0;
        }
        for (var42Lifetime2 = 0; param1 > var42Lifetime2; var42Lifetime2++) {
          var41[var42Lifetime2] = (var42Lifetime2 << 12) / param1;
        }
        this.a((byte) 50);
        for (var37 = 0; var37 < param1; var37++) {
          for (var36 = 0; var36 < param0; var36++) {
            for (var35 = 0; param2 > var35; var35++) {
              for (var38 = 0; var38 < this.field_a; var38++) {
                var42Lifetime3 = this.field_g[var38] << 12;
                var9 = var42Lifetime3 * this.field_d >> 12;
                var6 = var42Lifetime3 * var47[var36] >> 12;
                var5 = var48[var35] * var42Lifetime3 >> 12;
                var7 = var49[var37] * var42Lifetime3 >> 12;
                var8 = this.field_f * var42Lifetime3 >> 12;
                var10 = var42Lifetime3 * this.field_b >> 12;
                var6 = var6 * this.field_d;
                var5 = var5 * this.field_f;
                var7 = var7 * this.field_b;
                var11 = var5 >> 12;
                var12 = var11 + 1;
                var13 = var6 >> 12;
                var11 = var11 & 255;
                var14 = var13 + 1;
                var15 = var7 >> 12;
                var13 = var13 & 255;
                var16 = 1 + var15;
                var6 = var6 & 4095;
                if (var14 < var9) {
                  var14 = var14 & 255;
                } else {
                  var14 = 0;
                }
                var15 = var15 & 255;
                if (var12 < var8) {
                  var12 = var12 & 255;
                } else {
                  var12 = 0;
                }
                var5 = var5 & 4095;
                var7 = var7 & 4095;
                if (var10 > var16) {
                  var16 = var16 & 255;
                } else {
                  var16 = 0;
                }
                var19 = pba.field_b[var7];
                var24 = this.field_e[var16];
                var17 = pba.field_b[var5];
                var20 = -4096 + var5;
                var22 = -4096 + var7;
                var21 = var6 - 4096;
                var18 = pba.field_b[var6];
                var23 = this.field_e[var15];
                var25 = this.field_e[var13 + var23];
                var28 = this.field_e[var14 + var24];
                var26 = this.field_e[var23 + var14];
                var27 = this.field_e[var24 + var13];
                var29 = wsa.a(var6, var5, 0, (int) this.field_e[var25 + var11], var7);
                var30 = wsa.a(var6, var20, 0, (int) this.field_e[var25 + var12], var7);
                var31 = var29 + (var17 * (-var29 + var30) >> 12);
                var29Lifetime1 = wsa.a(var21, var5, 0, (int) this.field_e[var11 + var26], var7);
                var30Lifetime1 = wsa.a(var21, var20, 0, (int) this.field_e[var26 + var12], var7);
                var32 = (var17 * (-var29Lifetime1 + var30Lifetime1) >> 12) + var29Lifetime1;
                var29Lifetime2 = wsa.a(var6, var5, 0, (int) this.field_e[var27 + var11], var22);
                var33 = ((-var31 + var32) * var18 >> 12) + var31;
                var30Lifetime2 = wsa.a(var6, var20, 0, (int) this.field_e[var12 + var27], var22);
                var31Lifetime1 = ((-var29Lifetime2 + var30Lifetime2) * var17 >> 12) + var29Lifetime2;
                var29Lifetime3 = wsa.a(var21, var5, 0, (int) this.field_e[var28 + var11], var22);
                var30Lifetime3 = wsa.a(var21, var20, 0, (int) this.field_e[var28 + var12], var22);
                var32Lifetime1 = var29Lifetime3 + ((-var29Lifetime3 + var30Lifetime3) * var17 >> 12);
                var34 = ((-var31Lifetime1 + var32Lifetime1) * var18 >> 12) + var31Lifetime1;
                this.a(((var34 - var33) * var19 >> 12) + var33, (byte) -96, var38);
              }
              this.c(32164);
            }
          }
        }
    }

    fi(int param0, int param1, int param2, int param3, int param4) {
        this.field_d = 4;
        this.field_f = 4;
        this.field_a = 4;
        this.field_e = new short[512];
        this.field_h = 0;
        this.field_b = 4;
        this.field_b = param4;
        this.field_h = param0;
        this.field_a = param1;
        this.field_f = param2;
        this.field_d = param3;
        this.a(-15063);
        this.b(-256);
    }

    static {
    }
}
