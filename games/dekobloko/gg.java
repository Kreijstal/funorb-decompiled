/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class gg extends be {
    int field_K;
    static Random field_A;
    int field_H;
    int field_z;
    static int field_B;
    static w field_y;
    int field_I;
    int field_F;
    int field_C;
    static String field_E;
    static w field_G;

    final static lm a(pi[] param0, int param1, byte[] param2) {
        int[] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        byte[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        byte[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        byte[][] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        byte[][] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        byte[][] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        byte[][] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        var9 = client.field_A ? 1 : 0;
        if ((param0.length ^ -1) != -257) {
          throw new IllegalArgumentException();
        } else {
          if (param1 <= 48) {
            gg.c(-68);
            var31 = new int[256];
            var21 = var31;
            var16 = var21;
            var11 = var16;
            var10 = var11;
            var3 = var10;
            var32 = new int[256];
            var22 = var32;
            var17 = var22;
            var12 = var17;
            var4 = var12;
            var33 = new int[256];
            var23 = var33;
            var18 = var23;
            var13 = var18;
            var5 = var13;
            var34 = new int[256];
            var24 = var34;
            var19 = var24;
            var14 = var19;
            var6 = var14;
            var35 = new byte[256][];
            var25 = var35;
            var20 = var25;
            var15 = var20;
            var7 = var15;
            var8 = 0;
            L0: while (true) {
              if (256 <= var8) {
                return new lm(param2, var31, var32, var33, var34, var35);
              } else {
                var10[var8] = param0[var8].field_d;
                var4[var8] = param0[var8].field_c;
                var5[var8] = param0[var8].field_b;
                var6[var8] = param0[var8].field_i;
                var7[var8] = param0[var8].field_k;
                var8++;
                continue L0;
              }
            }
          } else {
            var36 = new int[256];
            var26 = var36;
            var16 = var26;
            var11 = var16;
            var10 = var11;
            var3 = var10;
            var37 = new int[256];
            var27 = var37;
            var17 = var27;
            var12 = var17;
            var4 = var12;
            var38 = new int[256];
            var28 = var38;
            var18 = var28;
            var13 = var18;
            var5 = var13;
            var39 = new int[256];
            var29 = var39;
            var19 = var29;
            var14 = var19;
            var6 = var14;
            var40 = new byte[256][];
            var30 = var40;
            var20 = var30;
            var15 = var20;
            var7 = var15;
            var8 = 0;
            L1: while (true) {
              if (256 <= var8) {
                return new lm(param2, var36, var37, var38, var39, var40);
              } else {
                var10[var8] = param0[var8].field_d;
                var4[var8] = param0[var8].field_c;
                var5[var8] = param0[var8].field_b;
                var6[var8] = param0[var8].field_i;
                var7[var8] = param0[var8].field_k;
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    final static int b(int param0, int param1) {
        if (param1 != 27935) {
            return 72;
        }
        return 5 * ((param0 - -1) * param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        uh.a(-9074);
        if (param1 != 20763) {
          int discarded$2 = gg.b(119, 2);
          hk.f(param3, param0, param2, param4);
          return;
        } else {
          hk.f(param3, param0, param2, param4);
          return;
        }
    }

    public static void c(int param0) {
        field_E = null;
        field_A = null;
        field_G = null;
        field_y = null;
        if (param0 != 0) {
            gg.c(-109);
        }
    }

    gg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new Random();
        field_E = "Disruptive behaviour";
    }
}
