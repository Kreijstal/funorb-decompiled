/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rc {
    static int[] field_b;
    static Vector field_a;

    final static boolean a(int param0) {
        if (param0 > -20) {
          return true;
        }
        return gl.field_c;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if ((fk.field_s & 1 << param5) != 0) {
          return;
        }
        ca var7 = new ca(param5, param3, param1, param2, param4, param6);
        if (!rc.a(-126)) {
          mb.a(var7, 4, 0);
        } else {
          so.field_h.b(0, var7);
        }
        fk.field_s = fk.field_s + (param0 << param5);
        pc.field_y = pc.field_y + (1 << param5);
        ge.field_c = ge.field_c + (1 << param5);
    }

    public static void a(boolean param0) {
        if (param0) {
          field_a = (Vector) null;
        }
        field_a = null;
        field_b = null;
    }

    final static dl[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        dl[] var10;
        dl[] var11_ref_dl__;
        int var11;
        int var12;
        dl var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        dl[] var10Lifetime1;
        var15 = CrazyCrystals.field_B;
        var9 = param8 + (param1 + param4);
        var10 = new dl[]{new dl(var9, var9), new dl(param0, var9), new dl(var9, var9), new dl(var9, param0), new dl(64, 64), new dl(var9, param0), new dl(var9, var9), new dl(param0, var9), new dl(var9, var9)};
        var11_ref_dl__ = var10;
        for (var12 = 0; var11_ref_dl__.length > var12; var12++) {
          var13 = var11_ref_dl__[var12];
          for (var14 = 0; var13.field_w.length > var14; var14++) {
            var13.field_w[var14] = param2;
          }
        }
        var10Lifetime1 = var11_ref_dl__;
        for (var11 = 0; param1 > var11; var11++) {
          for (var12Lifetime1 = 0; var12Lifetime1 < var9; var12Lifetime1++) {
            var10Lifetime1[6].field_w[var12Lifetime1 + var9 * (-var11 + var9 - 1)] = param5;
            var10Lifetime1[8].field_w[var12Lifetime1 + (-1 + (-var11 + var9)) * var9] = param5;
            var10Lifetime1[2].field_w[-1 + (var9 - var11 + var9 * var12Lifetime1)] = param5;
            var10Lifetime1[8].field_w[-1 - (-var9 + var11 - var9 * var12Lifetime1)] = param5;
          }
        }
        if (param7 != 2958) {
          rc.a(-44, -87, 63, -114, -113, -87, 75, -11, 77);
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param1; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var9 > var12Lifetime2; var12Lifetime2++) {
            var10Lifetime1[0].field_w[var11Lifetime1 * var9 + var12Lifetime2] = param6;
            var10Lifetime1[0].field_w[var11Lifetime1 + var12Lifetime2 * var9] = param6;
            if (var12Lifetime2 < -var11Lifetime1 + var9) {
              var10Lifetime1[2].field_w[var12Lifetime2 + var9 * var11Lifetime1] = param6;
              var10Lifetime1[6].field_w[var12Lifetime2 * var9 + var11Lifetime1] = param6;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param0; var11Lifetime2++) {
          for (var12Lifetime3 = 0; var12Lifetime3 < param1; var12Lifetime3++) {
            var10Lifetime1[7].field_w[var11Lifetime2 + (var9 - (var12Lifetime3 + 1)) * param0] = param5;
            var10Lifetime1[5].field_w[var11Lifetime2 * var9 + var9 - (1 + var12Lifetime3)] = param5;
            var10Lifetime1[1].field_w[var11Lifetime2 + var12Lifetime3 * param0] = param6;
            var10Lifetime1[3].field_w[var12Lifetime3 + var11Lifetime2 * var9] = param6;
          }
        }
        for (var11Lifetime3 = 0; var11Lifetime3 < param0 >> 1; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param4; var12Lifetime4++) {
            var10Lifetime1[1].field_w[var11Lifetime3 + (var9 - (var12Lifetime4 + 1)) * param0] = param3;
            var10Lifetime1[3].field_w[var11Lifetime3 * var9 - (1 - var9 + var12Lifetime4)] = param3;
            var10Lifetime1[7].field_w[var12Lifetime4 * param0 + var11Lifetime3] = param3;
            var10Lifetime1[5].field_w[var12Lifetime4 + var9 * var11Lifetime3] = param3;
          }
        }
        return var10Lifetime1;
    }

    final static void a(int param0, int param1) {
        pl.field_g = param1;
        if (param0 != -25537) {
          field_a = (Vector) null;
        }
    }

    static {
    }
}
