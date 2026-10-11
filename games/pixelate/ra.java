/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ra {
    static volatile int field_d;
    static java.util.zip.CRC32 field_h;
    static int field_a;
    static ak field_e;
    static int field_g;
    static String field_f;
    static int field_c;
    static ei field_b;

    public static void a(boolean param0) {
        field_b = null;
        field_e = null;
        if (param0) {
          field_b = (ei) null;
        }
        field_f = null;
        field_h = null;
    }

    final static tf[] a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        tf[] var10;
        tf[] var11_ref_tf__;
        int var11;
        int var12;
        tf var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = Pixelate.field_H ? 1 : 0;
        var9 = param1 + param0 + param8;
        var10 = new tf[]{new tf(var9, var9), new tf(param4, var9), new tf(var9, var9), new tf(var9, param4), new tf(64, 64), new tf(var9, param4), new tf(var9, var9), new tf(param4, var9), new tf(var9, var9)};
        var11_ref_tf__ = var10;
        for (var12 = 0; var12 < var11_ref_tf__.length; var12++) {
          var13 = var11_ref_tf__[var12];
          for (var14 = 0; var13.field_G.length > var14; var14++) {
            var13.field_G[var14] = param3;
          }
        }
        if (param5 <= 104) {
          field_h = (java.util.zip.CRC32) null;
        }
        for (var11 = 0; param8 > var11; var11++) {
          for (var12Lifetime1 = 0; var12Lifetime1 < var9; var12Lifetime1++) {
            var10[6].field_G[var12Lifetime1 + var9 * (-1 - var11 + var9)] = param6;
            var10[8].field_G[(var9 - var11 - 1) * var9 + var12Lifetime1] = param6;
            var10[2].field_G[var12Lifetime1 * var9 - (-var9 + 1) - var11] = param6;
            var10[8].field_G[-var11 + var9 - 1 + var12Lifetime1 * var9] = param6;
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param8; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10[0].field_G[var9 * var11Lifetime1 + var12Lifetime2] = param2;
            var10[0].field_G[var11Lifetime1 + var9 * var12Lifetime2] = param2;
            if ((var9 - var11Lifetime1) > var12Lifetime2) {
              var10[2].field_G[var11Lifetime1 * var9 + var12Lifetime2] = param2;
              var10[6].field_G[var11Lifetime1 + var12Lifetime2 * var9] = param2;
            }
          }
        }
        for (var11Lifetime2 = 0; param4 > var11Lifetime2; var11Lifetime2++) {
          for (var12Lifetime3 = 0; var12Lifetime3 < param8; var12Lifetime3++) {
            var10[7].field_G[param4 * (-var12Lifetime3 + (var9 - 1)) + var11Lifetime2] = param6;
            var10[5].field_G[-var12Lifetime3 - (-var9 - (-1 + var9 * var11Lifetime2))] = param6;
            var10[1].field_G[var11Lifetime2 + param4 * var12Lifetime3] = param2;
            var10[3].field_G[var11Lifetime2 * var9 + var12Lifetime3] = param2;
          }
        }
        for (var11Lifetime3 = 0; param4 >> 1 > var11Lifetime3; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param1; var12Lifetime4++) {
            var10[1].field_G[var11Lifetime3 + param4 * (-1 + (-var12Lifetime4 + var9))] = param7;
            var10[3].field_G[var9 * var11Lifetime3 - (1 - var9 + var12Lifetime4)] = param7;
            var10[7].field_G[var11Lifetime3 + param4 * var12Lifetime4] = param7;
            var10[5].field_G[var11Lifetime3 * var9 + var12Lifetime4] = param7;
          }
        }
        return var10;
    }

    final static boolean a(byte param0) {
        if (param0 >= -79) {
          return false;
        }
        return qp.a(true, fp.field_e, fp.field_d);
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        if (!un.field_l) {
          return;
        }
        bn.field_I.a(param3 ^ 4400, param2);
        int var4 = bo.field_h.m(14685) ? 1 : 0;
        if (param3 != -32268) {
          field_f = (String) null;
        }
        if (nm.field_c != 0 &&
          var4 == 0) {
          po.a(true);
          param2 = false;
        }
        if (param2) {
          bo.field_h.b(param1, param3 ^ 32267, param0);
        }
        if (var4 != 0) {
          bn.field_I.a(-28476, param2);
        }
        int var5 = bo.field_h.k(-16200) + bo.field_h.field_tb;
        if (var5 > 640) {
          di.field_a = di.field_a + 5;
        } else {
          if (635 > var5 &&
            0 < di.field_a) {
            di.field_a = di.field_a - 5;
          }
        }
    }

    static {
        field_d = -1;
        field_f = "Return to lobby";
        field_h = new java.util.zip.CRC32();
    }
}
