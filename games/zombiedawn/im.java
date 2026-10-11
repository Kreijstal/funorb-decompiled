/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class im {
    private int field_f;
    static int field_d;
    private int field_a;
    int field_g;
    private int field_b;
    private short[] field_c;
    private short[] field_e;

    private final void a(int param0) {
        Random var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3Lifetime1;
        var7 = ZombieDawn.field_J;
        if (param0 != 255) {
          return;
        }
        var2 = new Random((long)this.field_b);
        for (var3 = 0; var3 < 255; var3++) {
          this.field_e[var3] = (short)var3;
        }
        for (var3Lifetime1 = 0; var3Lifetime1 < 255; var3Lifetime1++) {
          var4 = -var3Lifetime1 + 255;
          var5 = pb.a(var2, var4, 1);
          var6 = this.field_e[var5];
          this.field_e[var5] = this.field_e[var4];
          this.field_e[var4 + 256] = (short) var6;
          this.field_e[var4] = (short) var6;
        }
        return;
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(boolean param0);

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        this.field_c = new short[this.field_g];
        if (!param0) {
          field_d = 29;
        }
        for (var2 = 0; this.field_g > var2; var2++) {
          this.field_c[var2] = (short)(int)Math.pow(2.0, (double)var2);
        }
    }

    final static void a(le param0, int param1, le param2) {
        if (param1 != -30395) {
          return;
        }
        try {
          if (param0.field_d != null) {
            param0.b(-27598);
          }
          param0.field_b = param2.field_b;
          param0.field_d = param2;
          param0.field_d.field_b = param0;
          param0.field_b.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "im.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        int var23 = 0;
        int var22 = 0;
        int var24 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var16 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var13 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var27 = 0;
        int var28 = ZombieDawn.field_J;
        int[] var32 = new int[param0];
        int[] var30 = var32;
        int[] var25 = var30;
        int var18Lifetime1;
        int var19Lifetime1;
        int var27Lifetime1;
        int var27Lifetime2;
        for (var27 = 0; var27 < param0; var27++) {
          var25[var27] = (var27 << 12) / param0;
        }
        int[] var31 = new int[param1];
        int[] var29 = var31;
        int[] var26 = var29;
        for (var27Lifetime1 = 0; param1 > var27Lifetime1; var27Lifetime1++) {
          var26[var27Lifetime1] = (var27Lifetime1 << 12) / param1;
        }
        this.a(false);
        if (param2 != -9394) {
          return;
        }
        for (var23 = 0; param1 > var23; var23++) {
          for (var22 = 0; param0 > var22; var22++) {
            for (var24 = 0; this.field_g > var24; var24++) {
              var27Lifetime2 = this.field_c[var24] << 12;
              var5 = var31[var23] * var27Lifetime2 >> 12;
              var6 = var27Lifetime2 * this.field_a >> 12;
              var7 = this.field_f * var27Lifetime2 >> 12;
              var4 = var27Lifetime2 * var32[var22] >> 12;
              var5 = var5 * this.field_f;
              var4 = var4 * this.field_a;
              var8 = var4 >> 12;
              var9 = var8 + 1;
              var10 = var5 >> 12;
              var8 = var8 & 255;
              var11 = var10 + 1;
              var5 = var5 & 4095;
              if (var9 >= var6) {
                var9 = 0;
              } else {
                var9 = var9 & 255;
              }
              var10 = var10 & 255;
              if (var11 < var7) {
                var11 = var11 & 255;
              } else {
                var11 = 0;
              }
              var4 = var4 & 4095;
              var16 = this.field_e[var10];
              var12 = a.field_f[var4];
              var14 = var4 - 4096;
              var15 = var5 - 4096;
              var13 = a.field_f[var5];
              var17 = this.field_e[var11];
              var18 = je.a((int) this.field_e[var16 + var8], var4, false, var5);
              var19 = je.a((int) this.field_e[var16 + var9], var14, false, var5);
              var20 = (var12 * (var19 - var18) >> 12) + var18;
              var18Lifetime1 = je.a((int) this.field_e[var17 + var8], var4, false, var15);
              var19Lifetime1 = je.a((int) this.field_e[var9 + var17], var14, false, var15);
              var21 = ((-var18Lifetime1 + var19Lifetime1) * var12 >> 12) + var18Lifetime1;
              this.a(var24, var20 + ((var21 - var20) * var13 >> 12), -25466);
            }
            this.a((byte) 44);
          }
        }
    }

    abstract void a(byte param0);

    im(int param0, int param1, int param2, int param3, int param4) {
        this.field_a = 4;
        this.field_g = 4;
        this.field_b = 0;
        this.field_f = 4;
        this.field_e = new short[512];
        this.field_a = param2;
        this.field_b = param0;
        this.field_f = param3;
        this.field_g = param1;
        this.b(true);
        this.a(255);
    }

    static {
    }
}
