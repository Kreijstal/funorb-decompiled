/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class elb {
    private int field_e;
    int field_a;
    private short[] field_c;
    private int field_b;
    private short[] field_d;
    private int field_g;
    private int field_h;
    static bob field_f;

    abstract void a(int param0, int param1, int param2);

    final void a(int param0, byte param1, int param2, int param3) {
        int var37 = 0;
        int var36 = 0;
        int var35 = 0;
        int var38 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var5 = 0;
        int var8 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var20 = 0;
        int var18 = 0;
        int var19 = 0;
        int var22 = 0;
        int var17 = 0;
        int var23 = 0;
        int var24 = 0;
        int var21 = 0;
        int var25 = 0;
        int var28 = 0;
        int var27 = 0;
        int var26 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var42 = 0;
        int var43 = VoidHunters.field_G;
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
        if (param1 != -10) {
          return;
        }
        int[] var49 = new int[param0];
        int[] var46 = var49;
        int[] var39 = var46;
        int[] var47 = new int[param2];
        int[] var44 = var47;
        int[] var40 = var44;
        int[] var48 = new int[param3];
        int[] var45 = var48;
        int[] var41 = var45;
        for (var42 = 0; param0 > var42; var42++) {
          var39[var42] = (var42 << 12) / param0;
        }
        for (var42Lifetime1 = 0; var42Lifetime1 < param2; var42Lifetime1++) {
          var40[var42Lifetime1] = (var42Lifetime1 << 12) / param2;
        }
        for (var42Lifetime2 = 0; param3 > var42Lifetime2; var42Lifetime2++) {
          var41[var42Lifetime2] = (var42Lifetime2 << 12) / param3;
        }
        this.a(true);
        for (var37 = 0; param3 > var37; var37++) {
          for (var36 = 0; param2 > var36; var36++) {
            for (var35 = 0; var35 < param0; var35++) {
              for (var38 = 0; this.field_a > var38; var38++) {
                var42Lifetime3 = this.field_c[var38] << 12;
                var6 = var47[var36] * var42Lifetime3 >> 12;
                var7 = var48[var37] * var42Lifetime3 >> 12;
                var9 = var42Lifetime3 * this.field_b >> 12;
                var10 = this.field_g * var42Lifetime3 >> 12;
                var5 = var42Lifetime3 * var49[var35] >> 12;
                var8 = this.field_h * var42Lifetime3 >> 12;
                var6 = var6 * this.field_b;
                var5 = var5 * this.field_h;
                var7 = var7 * this.field_g;
                var11 = var5 >> 12;
                var12 = 1 + var11;
                var11 = var11 & 255;
                var13 = var6 >> 12;
                var14 = 1 + var13;
                var13 = var13 & 255;
                var15 = var7 >> 12;
                var16 = 1 + var15;
                if (var16 >= var10) {
                  var16 = 0;
                } else {
                  var16 = var16 & 255;
                }
                var7 = var7 & 4095;
                if (var14 >= var9) {
                  var14 = 0;
                } else {
                  var14 = var14 & 255;
                }
                if (var12 >= var8) {
                  var12 = 0;
                } else {
                  var12 = var12 & 255;
                }
                var6 = var6 & 4095;
                var15 = var15 & 255;
                var5 = var5 & 4095;
                var20 = var5 - 4096;
                var18 = ocb.field_h[var6];
                var19 = ocb.field_h[var7];
                var22 = var7 - 4096;
                var17 = ocb.field_h[var5];
                var23 = this.field_d[var15];
                var24 = this.field_d[var16];
                var21 = -4096 + var6;
                var25 = this.field_d[var23 + var13];
                var28 = this.field_d[var24 + var14];
                var27 = this.field_d[var13 + var24];
                var26 = this.field_d[var14 + var23];
                var29 = hcb.a(var7, var6, var5, (byte) -113, (int) this.field_d[var25 + var11]);
                var30 = hcb.a(var7, var6, var20, (byte) 47, (int) this.field_d[var12 + var25]);
                var31 = var29 + ((-var29 + var30) * var17 >> 12);
                var29Lifetime1 = hcb.a(var7, var21, var5, (byte) -89, (int) this.field_d[var11 + var26]);
                var30Lifetime1 = hcb.a(var7, var21, var20, (byte) -121, (int) this.field_d[var26 + var12]);
                var32 = var29Lifetime1 + (var17 * (-var29Lifetime1 + var30Lifetime1) >> 12);
                var29Lifetime2 = hcb.a(var22, var6, var5, (byte) 63, (int) this.field_d[var27 + var11]);
                var33 = var31 + ((var32 - var31) * var18 >> 12);
                var30Lifetime2 = hcb.a(var22, var6, var20, (byte) -95, (int) this.field_d[var12 + var27]);
                var31Lifetime1 = var29Lifetime2 + (var17 * (-var29Lifetime2 + var30Lifetime2) >> 12);
                var29Lifetime3 = hcb.a(var22, var21, var5, (byte) -122, (int) this.field_d[var11 + var28]);
                var30Lifetime3 = hcb.a(var22, var21, var20, (byte) -122, (int) this.field_d[var28 + var12]);
                var32Lifetime1 = var29Lifetime3 + (var17 * (-var29Lifetime3 + var30Lifetime3) >> 12);
                var34 = var31Lifetime1 + (var18 * (var32Lifetime1 - var31Lifetime1) >> 12);
                this.a(-115, var38, (var19 * (var34 - var33) >> 12) + var33);
              }
              this.a(1424903724);
            }
          }
        }
    }

    abstract void a(int param0);

    private final void b(byte param0) {
        Random var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3Lifetime1;
        var7 = VoidHunters.field_G;
        var2 = new Random((long)this.field_e);
        for (var3 = 0; var3 < 255; var3++) {
          this.field_d[var3] = (short)var3;
        }
        for (var3Lifetime1 = 0; var3Lifetime1 < 255; var3Lifetime1++) {
          var4 = 255 - var3Lifetime1;
          var5 = hob.a(var2, var4, 116);
          var6 = this.field_d[var5];
          this.field_d[var5] = this.field_d[var4];
          this.field_d[var4 + 256] = (short) var6;
          this.field_d[var4] = (short) var6;
        }
        if (param0 != 23) {
          elb.c((byte) 43);
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        this.field_c = new short[this.field_a];
        if (param0 <= 82) {
          return;
        }
        for (var2 = 0; var2 < this.field_a; var2++) {
          this.field_c[var2] = (short)(int)Math.pow(2.0, (double)var2);
        }
    }

    abstract void a(boolean param0);

    elb(int param0, int param1, int param2, int param3, int param4) {
        this.field_a = 4;
        this.field_d = new short[512];
        this.field_g = 4;
        this.field_b = 4;
        this.field_e = 0;
        this.field_h = 4;
        this.field_b = param3;
        this.field_a = param1;
        this.field_g = param4;
        this.field_h = param2;
        this.field_e = param0;
        this.a((byte) 109);
        this.b((byte) 23);
    }

    public static void c(byte param0) {
        field_f = null;
        if (param0 < 35) {
          elb.c((byte) 62);
        }
    }

    static {
    }
}
