/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ec {
    static String field_c;
    static qa field_e;
    static ad field_a;
    static Calendar field_b;
    static int field_d;

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          wg.field_j.a(v.field_a, rc.field_g, true, true);
          wg.field_j.l(126);
          while (ba.a(param0 - 2)) {
            wg.field_j.a(oa.field_H, 109, rd.field_p);
          }
          if (-1 != gb.field_f) {
            var1_int = gb.field_f;
            qh.a(-1, true);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (ah.field_h) {
            stackIn_10_0 = 3;
            return stackIn_10_0;
          }
          if (cf.field_b == ed.field_c) {
            stackIn_13_0 = 1;
            return stackIn_13_0;
          }
          if (param0 != 1) {
            stackIn_16_0 = -20;
            return stackIn_16_0;
          }
          if (!bb.field_a.a(0)) {
            stackIn_20_0 = 1;
            return stackIn_20_0;
          }
          if (ch.field_d != cf.field_b) {
            stackIn_25_0 = -1;
            return stackIn_25_0;
          }
          stackIn_23_0 = 2;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "ec.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != 123) {
          field_b = (Calendar) null;
        }
        field_e = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void b(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        sj var4_ref_sj = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        sj var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          ma.field_c = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = ua.field_x.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_sj = ua.field_x[var3];
            var4_ref_sj.c(74);
            bg.a(var3, 82);
            var5 = var4_ref_sj.field_q + var4_ref_sj.field_G >> 1;
            var6 = var4_ref_sj.field_b + var4_ref_sj.field_j >> 1;
            var7 = var4_ref_sj.field_t + var4_ref_sj.field_x >> 1;
            var8 = ma.field_c[9] >> 2;
            var9 = ma.field_c[10] >> 2;
            var10_int = ma.field_c[11] >> 2;
            var11 = var9 * ik.field_i[4] + (var8 * ik.field_i[3] + ik.field_i[5] * var10_int) >> 14;
            var12 = ik.field_i[6] * var8 + (ik.field_i[7] * var9 + var10_int * ik.field_i[8]) >> 14;
            var13 = var10_int * ik.field_i[11] + (ik.field_i[9] * var8 + ik.field_i[10] * var9) >> 14;
            var2[var3] = var7 * var13 + var11 * var5 + var12 * var6 >> 16;
          }
          var3Lifetime1 = ma.field_c[9] >> 8;
          var4 = ma.field_c[10] >> 8;
          var5Lifetime1 = ma.field_c[11] >> 8;
          var6Lifetime1 = uj.field_i << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = sb.a((byte) 79, var6Lifetime1) >> 8;
          var9Lifetime1 = r.a((byte) 71, var6Lifetime1) >> 8;
          if (ei.field_a != -1 &&
            p.field_a != -1) {
            var8Lifetime1 = 240 - p.field_a;
            var7Lifetime1 = -320 + ei.field_a;
            var9Lifetime1 = -128;
          }
          var10 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + (var7Lifetime1 * var7Lifetime1 + var9Lifetime1 * var9Lifetime1)));
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          if (param0 != -128) {
            field_b = (Calendar) null;
          }
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + var12Lifetime1 * var12Lifetime1 + var13Lifetime1 * var13Lifetime1));
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          for (var15 = 0; ua.field_x.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; ua.field_x.length > var17_int; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = ua.field_x[var16];
            bg.a(var16, param0 + 255);
            for (var18 = 0; var18 < 3; var18++) {
              ik.field_i[var18] = ik.field_i[var18] + nl.field_a[var15][var18];
            }
            b.a(ik.field_i, false, ma.field_c, false, var17, (byte) -91, true);
            ja.a(var14, var9Lifetime1, 46, var13Lifetime1, var8Lifetime1, var17, var12Lifetime1, var7Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "ec.B(" + param0 + ')');
        }
    }

    final static String a(ad param0, String param1, String param2, int param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.a(param3 ^ 65)) {
            stackIn_2_0 = (String) (param1);
            return stackIn_2_0;
          }
          if (param3 != 0) {
            field_b = (Calendar) null;
          }
          stackIn_6_0 = param2 + " - " + param0.b(true) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ec.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = "Password: ";
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
