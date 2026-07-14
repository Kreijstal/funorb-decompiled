/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ko extends vjb {
    static phb[] field_e;
    private int[] field_f;
    static int field_g;
    static String field_d;

    public static void a(int param0) {
        int var1 = 32 % ((52 - param0) / 49);
        field_e = null;
        field_d = null;
    }

    final void a(float param0, float param1, float[] param2, float param3, int param4, float param5, byte param6, int param7, int param8, int param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        int var16 = 0;
        int var17 = 0;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        float var24 = 0.0f;
        int var25 = 0;
        int var26 = 0;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        float var35 = 0.0f;
        int var36 = 0;
        int var37 = 0;
        float var38 = 0.0f;
        float var39 = 0.0f;
        float var40 = 0.0f;
        int var41 = 0;
        L0: {
          var41 = VoidHunters.field_G;
          var12 = (int)(-1.0f + param1 * (float)param10);
          if (param6 > 90) {
            break L0;
          } else {
            ko.a(-90);
            break L0;
          }
        }
        var12 = var12 & 255;
        var13 = (int)(param0 * (float)param8 - 1.0f);
        var13 = var13 & 255;
        var14 = (int)(param3 * (float)param4 - 1.0f);
        var14 = var14 & 255;
        var15 = (float)param9 * param3;
        var16 = (int)var15;
        var17 = 1 + var16;
        var18 = var15 - (float)var16;
        var19 = -var18 + 1.0f;
        var16 = var16 & var14;
        var20 = pob.a((byte) -125, var18);
        var17 = var17 & var14;
        var21 = ((ko) this).field_f[var16];
        var22 = ((ko) this).field_f[var17];
        var23 = 0;
        L1: while (true) {
          if (var23 >= param8) {
            return;
          } else {
            var24 = (float)var23 * param0;
            var25 = (int)var24;
            var26 = var25 + 1;
            var27 = var24 - (float)var25;
            var28 = -var27 + 1.0f;
            var29 = pob.a((byte) -123, var27);
            var26 = var26 & var13;
            var25 = var25 & var13;
            var30 = ((ko) this).field_f[var21 + var25];
            var31 = ((ko) this).field_f[var21 + var26];
            var32 = ((ko) this).field_f[var25 + var22];
            var33 = ((ko) this).field_f[var26 + var22];
            var34 = 0;
            L2: while (true) {
              if (param10 <= var34) {
                var23++;
                continue L1;
              } else {
                var35 = (float)var34 * param1;
                var36 = (int)var35;
                var37 = 1 + var36;
                var38 = (float)(-var36) + var35;
                var39 = 1.0f - var38;
                var40 = pob.a((byte) 127, var38);
                var37 = var37 & var12;
                var36 = var36 & var12;
                param7++;
                param2[param7] = param5 * kfb.a(kfb.a(kfb.a(rha.a(var18, var38, dla.a(7, ((ko) this).field_f[var33 + var37]), var27, (byte) 69), var40, -14, rha.a(var18, var39, dla.a(7, ((ko) this).field_f[var36 + var33]), var27, (byte) 78)), var29, -9, kfb.a(rha.a(var18, var38, dla.a(7, ((ko) this).field_f[var32 + var37]), var28, (byte) 66), var40, -75, rha.a(var18, var39, dla.a(((ko) this).field_f[var32 + var36], 7), var28, (byte) 99))), var20, -28, kfb.a(kfb.a(rha.a(var19, var38, dla.a(7, ((ko) this).field_f[var31 + var37]), var27, (byte) 69), var40, -86, rha.a(var19, var39, dla.a(7, ((ko) this).field_f[var31 + var36]), var27, (byte) 65)), var29, -97, kfb.a(rha.a(var19, var38, dla.a(7, ((ko) this).field_f[var30 + var37]), var28, (byte) 70), var40, -97, rha.a(var19, var39, dla.a(7, ((ko) this).field_f[var36 + var30]), var28, (byte) 54))));
                var34++;
                continue L2;
              }
            }
          }
        }
    }

    ko(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ((ko) this).field_f = new int[512];
        Random var2 = new Random((long)param0);
        for (var3 = 0; 256 > var3; var3++) {
            ((ko) this).field_f[256 + var3] = var3;
            ((ko) this).field_f[var3] = var3;
        }
        int var7 = 0;
        var3 = var7;
        while (var7 < 256) {
            var4 = var2.nextInt() & 255;
            var5 = ((ko) this).field_f[var4];
            ((ko) this).field_f[var4 - -256] = ((ko) this).field_f[var7];
            ((ko) this).field_f[var4] = ((ko) this).field_f[var7];
            ((ko) this).field_f[256 + var7] = var5;
            ((ko) this).field_f[var7] = var5;
            var7++;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Invite players";
        field_g = 1;
    }
}
