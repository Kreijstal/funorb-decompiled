/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vu extends ab {
    private int[] field_f;
    static jn field_g;
    static hv field_h;
    static String[] field_i;

    vu(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ((vu) this).field_f = new int[512];
        Random var7 = new Random((long)param0);
        Random var2 = var7;
        for (var3 = 0; var3 < 256; var3++) {
            ((vu) this).field_f[var3 - -256] = var3;
            ((vu) this).field_f[var3] = var3;
        }
        int var8 = 0;
        var3 = var8;
        while (var8 < 256) {
            var4 = 255 & var7.nextInt();
            var5 = ((vu) this).field_f[var4];
            ((vu) this).field_f[256 + var4] = ((vu) this).field_f[var8];
            ((vu) this).field_f[var4] = ((vu) this).field_f[var8];
            ((vu) this).field_f[var8 + 256] = var5;
            ((vu) this).field_f[var8] = var5;
            var8++;
        }
    }

    final void a(float param0, int param1, float param2, float param3, int param4, int param5, int param6, float[] param7, int param8, float param9, int param10) {
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
        var41 = Sumoblitz.field_L ? 1 : 0;
        var12 = (int)(-1.0f + param0 * (float)param8);
        var12 = var12 & 255;
        var13 = (int)(param2 * (float)param10 - 1.0f);
        var13 = var13 & 255;
        var14 = (int)(-1.0f + param3 * (float)param5);
        var14 = var14 & 255;
        var15 = (float)param4 * param3;
        var16 = (int)var15;
        var17 = param6 + var16;
        var18 = (float)(-var16) + var15;
        var19 = 1.0f - var18;
        var17 = var17 & var14;
        var20 = fs.a((byte) 124, var18);
        var16 = var16 & var14;
        var21 = ((vu) this).field_f[var16];
        var22 = ((vu) this).field_f[var17];
        var23 = 0;
        L0: while (true) {
          if (var23 >= param10) {
            return;
          } else {
            var24 = param2 * (float)var23;
            var25 = (int)var24;
            var26 = var25 + 1;
            var27 = var24 - (float)var25;
            var28 = 1.0f - var27;
            var26 = var26 & var13;
            var29 = fs.a((byte) 124, var27);
            var25 = var25 & var13;
            var30 = ((vu) this).field_f[var21 + var25];
            var31 = ((vu) this).field_f[var21 + var26];
            var32 = ((vu) this).field_f[var22 + var25];
            var33 = ((vu) this).field_f[var26 - -var22];
            var34 = 0;
            L1: while (true) {
              if (var34 >= param8) {
                var23++;
                continue L0;
              } else {
                var35 = (float)var34 * param0;
                var36 = (int)var35;
                var37 = var36 - -1;
                var38 = (float)(-var36) + var35;
                var39 = -var38 + 1.0f;
                var40 = fs.a((byte) 124, var38);
                var37 = var37 & var12;
                var36 = var36 & var12;
                param1++;
                param7[param1] = param9 * nw.a(1050, nw.a(1050, nw.a(jg.a(param6, 1051), an.a(var28, var19, eb.a(7, ((vu) this).field_f[var30 + var36]), var39, 2), an.a(var28, var19, eb.a(7, ((vu) this).field_f[var37 - -var30]), var38, jg.a(param6, 3)), var40), nw.a(1050, an.a(var27, var19, eb.a(7, ((vu) this).field_f[var31 + var36]), var39, param6 + 1), an.a(var27, var19, eb.a(7, ((vu) this).field_f[var37 - -var31]), var38, 2), var40), var29), nw.a(1050, nw.a(1050, an.a(var28, var18, eb.a(7, ((vu) this).field_f[var32 + var36]), var39, 2), an.a(var28, var18, eb.a(((vu) this).field_f[var32 + var37], 7), var38, param6 + 1), var40), nw.a(1050, an.a(var27, var18, eb.a(((vu) this).field_f[var36 + var33], 7), var39, 2), an.a(var27, var18, eb.a(7, ((vu) this).field_f[var33 + var37]), var38, 2), var40), var29), var20);
                var34++;
                continue L1;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != -69) {
            vu.a((byte) 1);
        }
        field_h = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new jn();
        field_h = new hv();
        field_i = new String[]{"None", "Permanent speed up", "Permanent bounce up", "Permanent traction up", "Temporary speed up", "Temporary bounce up", "Temporary traction up"};
    }
}
