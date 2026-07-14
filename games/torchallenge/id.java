/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class id {
    static int[][] field_d;
    static String field_c;
    static pa field_b;
    static Random field_a;

    final static String a(CharSequence param0, boolean param1) {
        if (param1) {
            field_d = null;
        }
        return df.a(-2184, false, param0);
    }

    final static nf a(byte[] param0, ge[] param1, int param2) {
        int var8 = 0;
        int var9 = TorChallenge.field_F ? 1 : 0;
        if ((param1.length ^ -1) != -257) {
            throw new IllegalArgumentException();
        }
        int[] var26 = new int[param2];
        int[] var21 = var26;
        int[] var16 = var21;
        int[] var11 = var16;
        int[] var10 = var11;
        int[] var3 = var10;
        int[] var27 = new int[256];
        int[] var22 = var27;
        int[] var17 = var22;
        int[] var12 = var17;
        int[] var4 = var12;
        int[] var28 = new int[256];
        int[] var23 = var28;
        int[] var18 = var23;
        int[] var13 = var18;
        int[] var5 = var13;
        int[] var29 = new int[256];
        int[] var24 = var29;
        int[] var19 = var24;
        int[] var14 = var19;
        int[] var6 = var14;
        byte[][] var30 = new byte[256][];
        byte[][] var25 = var30;
        byte[][] var20 = var25;
        byte[][] var15 = var20;
        byte[][] var7 = var15;
        for (var8 = 0; 256 > var8; var8++) {
            var10[var8] = param1[var8].field_f;
            var4[var8] = param1[var8].field_g;
            var5[var8] = param1[var8].field_b;
            var6[var8] = param1[var8].field_a;
            var7[var8] = param1[var8].field_k;
        }
        return new nf(param0, var26, var27, var28, var29, var30);
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (param0) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = TorChallenge.field_F ? 1 : 0;
        hl.field_b.a(65280);
        for (var1 = 0; -33 < (var1 ^ -1); var1++) {
            cj.field_l[var1] = 0L;
        }
        for (var1 = 0; (var1 ^ -1) > -33; var1++) {
            ij.field_A[var1] = 0L;
        }
        if (param0 < 45) {
            field_c = null;
        }
        k.field_g = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = null;
        field_c = "Create";
        field_a = new Random();
    }
}
