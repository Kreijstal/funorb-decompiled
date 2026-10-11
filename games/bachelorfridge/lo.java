/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lo {
    static pia field_b;
    static String field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 >= -90) {
          field_a = (String) null;
        }
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        var5 = BachelorFridge.field_y;
        try {
          if (qaa.field_e == null) {
            var1_int = jm.field_k.length;
            qaa.field_e = new int[1 + var1_int];
            for (var2 = 0; var2 < var1_int; var2++) {
              qaa.field_e[var2] = var2;
            }
            for (var2Lifetime1 = 0; var2Lifetime1 < -1 + var1_int; var2Lifetime1++) {
              var3 = kla.a(var1_int - var2Lifetime1, m.field_a, -2147483648) + var2Lifetime1;
              if (~var3 != ~var2Lifetime1) {
                var4 = qaa.field_e[var2Lifetime1];
                qaa.field_e[var2Lifetime1] = qaa.field_e[var3];
                qaa.field_e[var3] = var4;
              }
            }
            for (var2Lifetime2 = 0; var2Lifetime2 < var1_int; var2Lifetime2++) {
              if (qaa.field_e[var2Lifetime2] != 0) {
                continue;
              }
              qaa.field_e[var1_int] = qaa.field_e[1 + var2Lifetime2];
              qaa.field_e[1 + var2Lifetime2] = -1;
              break;
            }
            stackIn_21_0 = (qaa.field_e[0] == -1) ? 1 : 0;
            rba.field_b = stackIn_21_0;
            raa.e((byte) 31);
          }
          if (f.b((byte) 73) > (3500L + cr.field_a)) {
            fieldTemp$0 = rba.field_b + 1;
            rba.field_b = rba.field_b + 1;
            if (fieldTemp$0 == qaa.field_e.length) {
              rba.field_b = 0;
            }
            raa.e((byte) 31);
          }
          if (param0 <= 73) {
            field_b = (pia) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "lo.C(" + param0 + ')');
        }
    }

    final static boolean b(byte param0) {
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        ola var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int[] var2_ref_int__ = null;
        int var2 = 0;
        rk[] var3_ref_rk__ = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        boolean[] var7 = null;
        int var8 = 0;
        ola var9 = null;
        boolean[] var13 = null;
        int[] var2_ref_int__Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = BachelorFridge.field_y;
        try {
          if (78 == ri.field_a) {
            if (null != mg.field_m) {
              if (!mg.field_m.a((byte) 127)) {
                pma.b(0, 20208);
              }
              var9 = gca.a(0, ig.field_m);
              var1 = var9;
              var2_ref_int__ = rd.a(true, ig.field_m);
              var3_ref_rk__ = tj.a((byte) 124, ig.field_m);
              mg.field_m.field_e = var9;
              mg.field_m.field_f = var2_ref_int__;
              mg.field_m.field_i = var3_ref_rk__;
              er.e((byte) -66);
            }
            hb.field_j = false;
            return true;
          }
          if (ri.field_a == 79) {
            stackIn_16_0 = (ig.field_m.b(16711935) == 1) ? 1 : 0;
            var1_int = stackIn_16_0;
            var6 = new int[50];
            var2_ref_int__Lifetime1 = var6;
            var3 = ig.field_m.b(16711935);
            for (var4 = 0; var3 > var4; var4++) {
              var6[ig.field_m.b(16711935)] = ig.field_m.b(16711935);
            }
            mg.field_m.field_f = var2_ref_int__Lifetime1;
            pka.a((byte) -111, var1_int != 0);
            if (var1_int != 0) {
              gs.field_f.b(11);
            }
            return true;
          }
          if (ri.field_a == 80) {
            return true;
          }
          if (param0 >= -83) {
            field_a = (String) null;
          }
          if (ri.field_a != 82) {
            return false;
          }
          var7 = new boolean[50];
          var13 = var7;
          var2 = 0;
          var3Lifetime1 = ig.field_m.b(16711935);
          var8 = 0;
          var4Lifetime1 = var8;
          while (var8 < 50) {
            if ((var3Lifetime1 & 1 << var2) == 1 << var2) {
              var7[var8] = true;
            }
            var2++;
            if (var2 == 8) {
              var3Lifetime1 = ig.field_m.b(16711935);
              var2 = 0;
            }
            var8++;
          }
          gs.field_f.a(10, var13);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "lo.A(" + param0 + ')');
        }
    }

    static {
        field_a = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
