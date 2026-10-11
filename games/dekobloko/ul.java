/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static String field_b;
    static int field_d;
    static qm field_e;
    static long field_g;
    static ud field_i;
    static String field_a;
    static String field_h;
    static int field_f;
    static int[] field_c;

    final static void a(byte param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        cl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        uf var14 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = client.field_A ? 1 : 0;
        try {
          var14 = de.field_V;
          var2 = var14.d((byte) -110);
          var3 = (cl) (oe.field_I.c((byte) -54));
          while (var3 != null) {
            if (var2 != var3.field_q) {
              var3 = (cl) (oe.field_I.d(true));
              continue;
            }
            break;
          }
          if (var3 == null) {
            si.a(122);
            return;
          }
          var4 = var14.d((byte) -125);
          if (var4 != 0) {
            var5 = var3.field_z;
            t.field_cb[0] = oa.field_f;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              t.field_cb[var6_int] = var14.c((byte) -38);
            }
            ba.a(2147483647, var4, var5);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              pn.a(63, var14);
              if (var6_intLifetime1 == 0) {
                var3.field_p = oc.field_c;
                var3.field_o = dj.field_Y;
                var3.field_w = tj.field_Pb;
                var3.field_t = vm.field_s;
                ri.a(var6_intLifetime1, dj.field_Y, -1, vm.field_s, tj.field_Pb, oc.field_c);
              } else {
                ri.a(var6_intLifetime1, dj.field_Y, -1, vm.field_s, tj.field_Pb, oc.field_c);
              }
            }
            pd.a(var5, (byte) 6);
            dupTemp$0 = new String[2][var5];
            var3.field_x = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][var5 * 4];
            var3.field_u = dupTemp$1;
            var7 = dupTemp$1;
            var8 = og.field_eb;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = ch.field_a[var9];
              var6[0][var10] = t.field_cb[var11];
              var7[0][var10 * 4] = ad.field_i[var11];
              var7[0][1 + var10 * 4] = oa.field_e[var11];
              var7[0][2 + 4 * var10] = ln.field_a[var11];
              var7[0][3 + var10 * 4] = mk.field_b[var11];
              if (k.a(t.field_cb[var11], true) &&
                oa.field_e[var11] + (ln.field_a[var11] + mk.field_b[var11]) == 0) {
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
              var11Lifetime1 = ch.field_a[var9Lifetime1 + var5];
              var6[1][var13] = t.field_cb[var11Lifetime1];
              var7[1][var13 * 4] = ad.field_i[var11Lifetime1];
              var7[1][1 + 4 * var13] = oa.field_e[var11Lifetime1];
              var7[1][4 * var13 + 2] = ln.field_a[var11Lifetime1];
              var7[1][4 * var13 + 3] = mk.field_b[var11Lifetime1];
              if (k.a(t.field_cb[var11Lifetime1], true) &&
                ln.field_a[var11Lifetime1] + oa.field_e[var11Lifetime1] + mk.field_b[var11Lifetime1] == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var13++;
              var9Lifetime1++;
            }
          }
          if (param0 <= 107) {
            ul.a(-19, 9, -103);
          }
          var3.field_A = true;
          var3.b((byte) 104);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "ul.A(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        field_h = null;
        field_b = null;
        field_a = null;
        if (param0 != -75) {
          field_d = -77;
        }
        field_e = null;
        field_c = null;
        field_i = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != -28705) {
          ul.a(55, 34);
        }
        if (param1 < 2) {
          if (5 > param0) {
            return 0;
          }
          return 1;
        }
        return 2;
    }

    final static void a(int param0, int param1) {
        if (param1 != 4) {
          field_e = (qm) null;
        }
        uf var2 = we.field_b;
        var2.f(param0, -4);
        var2.a(true, 1);
        var2.a(true, 1);
    }

    static {
        field_b = "Challenge Highscores";
        field_e = new qm(6, 0, 4, 2);
        field_g = 20000000L;
        field_a = "Respect";
        field_h = "Clan";
        field_c = new int[5];
        field_f = 3;
    }
}
