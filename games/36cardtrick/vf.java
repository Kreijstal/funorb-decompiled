/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vf {
    static cc field_a;
    static int field_b;

    abstract void a(byte[] param0, byte param1);

    abstract byte[] a(byte param0);

    public static void b(int param0) {
        field_a = null;
        if (param0 >= -88) {
          field_a = (cc) null;
        }
    }

    final static String a(int param0, int param1, char param2) {
        int var5 = Main.field_T;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        int var4 = 0;
        if (param0 != 4) {
          return (String) null;
        }
        while (var4 < param1) {
          var6[var4] = param2;
          var4++;
        }
        return new String(var6);
    }

    final static int b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Main.field_T;
        try {
          sd.field_c.a((byte) -116, lg.field_E, te.field_a, true);
          sd.field_c.l(-2054);
          while (ge.b((byte) -114)) {
            sd.field_c.a(fd.field_n, 34, tb.field_d);
          }
          if (ml.field_a != -1) {
            var1_int = ml.field_a;
            gh.a(-1, 31888);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (param0 < 63) {
            stackIn_10_0 = 44;
            return stackIn_10_0;
          }
          if (r.field_p) {
            stackIn_14_0 = 3;
            return stackIn_14_0;
          }
          if (ei.field_d == hh.field_g) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (!wh.field_a.a(640)) {
            stackIn_21_0 = 1;
            return stackIn_21_0;
          }
          if (hh.field_g != jc.field_P) {
            stackIn_26_0 = -1;
            return stackIn_26_0;
          }
          stackIn_24_0 = 2;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "vf.F(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        mf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        w var14 = null;
        int[][] var18 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = Main.field_T;
        try {
          var14 = rd.field_j;
          if (param0 != -28037) {
            vf.a(-72);
          }
          var2 = var14.f(param0 ^ 28154);
          var3 = (mf) (wg.field_b.a((byte) 74));
          while (var3 != null) {
            if (var3.field_k != var2) {
              var3 = (mf) (wg.field_b.b((byte) -115));
              continue;
            }
            break;
          }
          if (var3 == null) {
            mc.a((byte) -125);
            return;
          }
          var4 = var14.f(64);
          if (0 != var4) {
            ad.field_i[0] = ri.field_c;
            var5 = var3.field_h;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              ad.field_i[var6_int] = var14.c(false);
            }
            wd.a((byte) 36, var5, var4);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              bc.a(false, var14);
              if (var6_intLifetime1 == 0) {
                a.a(sa.field_a, nl.field_b, cg.field_h, -23576, var6_intLifetime1, pc.field_c);
              } else {
                a.a(sa.field_a, nl.field_b, cg.field_h, param0 ^ 12691, var6_intLifetime1, pc.field_c);
              }
            }
            rf.a(-23243, var5);
            var6 = new String[2][var5];
            var18 = new int[2][var5 * 4];
            var8 = ei.field_f;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = re.field_c[var9];
              var6[0][var10] = ad.field_i[var11];
              var18[0][4 * var10] = p.field_n[var11];
              var18[0][1 + var10 * 4] = q.field_h[var11];
              var18[0][2 + 4 * var10] = mj.field_b[var11];
              var18[0][var10 * 4 + 3] = ij.field_c[var11];
              if (rc.a(true, ad.field_i[var11]) &&
                ij.field_c[var11] + q.field_h[var11] + mj.field_b[var11] == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = re.field_c[var5 + var9Lifetime1];
              var6[1][var13] = ad.field_i[var11Lifetime1];
              var18[1][var13 * 4] = p.field_n[var11Lifetime1];
              var18[1][1 + 4 * var13] = q.field_h[var11Lifetime1];
              var18[1][2 + 4 * var13] = mj.field_b[var11Lifetime1];
              var18[1][4 * var13 + 3] = ij.field_c[var11Lifetime1];
              if (rc.a(true, ad.field_i[var11Lifetime1]) &&
                q.field_h[var11Lifetime1] - (-mj.field_b[var11Lifetime1] - ij.field_c[var11Lifetime1]) == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var9Lifetime1++;
              var13++;
            }
            var3.c(95);
            return;
          }
          var3.c(95);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "vf.B(" + param0 + ')');
        }
    }

    static {
        field_a = new cc();
        field_b = -2014707693;
    }
}
