/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static String field_a;
    static hh field_b;

    final static void a(int param0, int param1, byte param2) {
        bg.field_f = param1;
        oj.field_M = param0;
        if (param2 > -53) {
          ri.a(-74);
        }
    }

    final static StringBuilder a(int param0, char param1, StringBuilder param2, byte param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = EscapeVector.field_A;
        try {
          var4_int = param2.length();
          param2.setLength(param0);
          if (param3 != 56) {
            ri.a(-23);
          }
          for (var5 = var4_int; var5 < param0; var5++) {
            param2.setCharAt(var5, param1);
          }
          stackIn_7_0 = (StringBuilder) (param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ri.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        if (param0 >= -23) {
          field_b = (hh) null;
        }
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        rl var3 = null;
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
        c var14 = null;
        int[][] var18 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = EscapeVector.field_A;
        try {
          var14 = om.field_g;
          var2 = var14.e(0);
          if (param0 != 113) {
            field_b = (hh) null;
          }
          var3 = (rl) (cd.field_s.a(false));
          while (var3 != null) {
            if (var3.field_i != var2) {
              var3 = (rl) (cd.field_s.b((byte) 70));
              continue;
            }
            break;
          }
          if (var3 == null) {
            nm.a(16);
            return;
          }
          var4 = var14.e(0);
          if (0 != var4) {
            var5 = var3.field_g;
            bl.field_l[0] = ck.field_r;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              bl.field_l[var6_int] = var14.c(false);
            }
            wk.a(var4, param0 - 58, var5);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              km.a(var14, 1238559653);
              if (var6_intLifetime1 != 0) {
                af.a(1, hk.field_n, wk.field_d, oc.field_u, var6_intLifetime1, bk.field_s);
              } else {
                af.a(param0 - 112, hk.field_n, wk.field_d, oc.field_u, var6_intLifetime1, bk.field_s);
              }
            }
            na.b(var5, 0);
            var6 = new String[2][var5];
            var18 = new int[2][var5 * 4];
            var8 = jf.field_J;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = cd.field_q[var9];
              var6[0][var10] = bl.field_l[var11];
              var18[0][var10 * 4] = fl.field_k[var11];
              var18[0][1 + 4 * var10] = pc.field_c[var11];
              var18[0][var10 * 4 + 2] = mi.field_k[var11];
              var18[0][3 + var10 * 4] = tm.field_fb[var11];
              if (ic.a(bl.field_l[var11], (byte) 123) &&
                tm.field_fb[var11] + pc.field_c[var11] + mi.field_k[var11] == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = cd.field_q[var9Lifetime1 + var5];
              var6[1][var13] = bl.field_l[var11Lifetime1];
              var18[1][var13 * 4] = fl.field_k[var11Lifetime1];
              var18[1][var13 * 4 + 1] = pc.field_c[var11Lifetime1];
              var18[1][var13 * 4 + 2] = mi.field_k[var11Lifetime1];
              var18[1][3 + var13 * 4] = tm.field_fb[var11Lifetime1];
              if (ic.a(bl.field_l[var11Lifetime1], (byte) 117) &&
                0 == tm.field_fb[var11Lifetime1] + pc.field_c[var11Lifetime1] + mi.field_k[var11Lifetime1]) {
                var6[1][var13] = null;
                var13--;
              }
              var13++;
              var9Lifetime1++;
            }
            var3.c((byte) -100);
            return;
          }
          var3.c((byte) -100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ri.E(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        if (null == df.field_d) {
          return;
        }
        bo.a(df.field_d, (byte) -59);
        df.field_d.a(g.field_r, true);
        df.field_d = null;
        if (null != km.field_n) {
          km.field_n.a(param0 ^ -25123);
        }
        if (param0 != -25123) {
          field_a = (String) null;
        }
        of.field_d.requestFocus();
    }

    static {
        field_a = "Confirm Email:";
    }
}
