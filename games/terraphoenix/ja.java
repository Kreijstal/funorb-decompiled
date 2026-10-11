/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends uf {
    int field_o;
    static String field_h;
    static int field_j;
    static int field_n;
    int field_k;
    static boolean field_l;
    static int field_i;
    static pk field_m;

    final static boolean a(boolean param0) {
        if (!param0) {
          ja.a('ﾠ', (byte) 38);
        }
        return qi.field_b;
    }

    final static boolean a(char param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Terraphoenix.field_V;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (pd.a(72, param0)) {
            return true;
          }
          var2_int = -42 % ((param1 - 27) / 40);
          var7 = c.field_a;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 == param0) {
              return true;
            }
          }
          var3Lifetime1 = hk.field_a;
          for (var4Lifetime1 = 0; var3Lifetime1.length > var4Lifetime1; var4Lifetime1++) {
            var5Lifetime1 = var3Lifetime1[var4Lifetime1];
            if (param0 == var5Lifetime1) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ja.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void c(byte param0) {
        aa var1 = (aa) (pb.field_a.b((byte) 105));
        int var2 = 53 % ((5 - param0) / 43);
        if (var1 == null) {
          var1 = new aa();
        }
        var1.a(l.field_b, l.field_i, l.field_f, l.field_k, l.field_d, l.field_c, 83, l.field_j);
        vl.field_i.a(var1, -16611);
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_69_2 = null;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        String stackIn_76_2 = null;
        int stackIn_89_0 = 0;
        boolean stackIn_90_1 = false;
        int stackIn_112_0 = 0;
        int stackIn_113_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        String[] var5_ref_String__Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var9Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime2;
        int var9Lifetime3;
        int var6Lifetime2Lifetime1;
        int var8Lifetime1Lifetime1;
        var10 = Terraphoenix.field_V;
        try {
          dg.field_d = true;
          var3_int = -105 % ((72 - param0) / 48);
          pe.field_e = param2;
          if (0 == pe.field_e) {
            var4 = af.a(jm.field_d, da.field_h, -3, kh.field_F, ch.field_c);
            var5 = var4 + 3;
            rb.field_d = new String[var5];
            f.field_a = new int[var5];
            for (var6 = 0; var6 < var5; var6++) {
              f.field_a[var6] = -1;
            }
            pj.field_l = new int[2];
            for (var6 = 0; var4 > var6; var6++) {
              rb.field_d[var6] = kh.field_F[var6];
            }
            rb.field_d[var5 - 3] = "";
            rb.field_d[var5 - 2] = ak.field_g;
            f.field_a[-2 + var5] = 0;
            pj.field_l[0] = 4;
            rb.field_d[var5 - 1] = te.field_e;
            f.field_a[var5 - 1] = 1;
            pj.field_l[1] = 5;
          } else if (pe.field_e == 1) {
            var4 = af.a(jm.field_d, da.field_h, -3, kh.field_F, ch.field_c);
            var5 = 2 + var4;
            f.field_a = new int[var5];
            rb.field_d = new String[var5];
            for (var6 = 0; var5 > var6; var6++) {
              f.field_a[var6] = -1;
            }
            pj.field_l = new int[1];
            for (var6 = 0; var4 > var6; var6++) {
              rb.field_d[var6] = kh.field_F[var6];
            }
            rb.field_d[-2 + var5] = "";
            rb.field_d[var5 - 1] = te.field_e;
            f.field_a[-1 + var5] = 0;
            pj.field_l[0] = 5;
          } else if (2 != pe.field_e) {
            if (3 == pe.field_e) {
              if (nj.field_l.field_v) {
                var4 = af.a(tc.field_d, da.field_h, -3, kh.field_F, ch.field_c);
              } else {
                var4 = af.a(ra.field_h, da.field_h, -3, kh.field_F, ch.field_c);
              }
              var5 = 2 + var4;
              rb.field_d = new String[var5];
              f.field_a = new int[var5];
              for (var6 = 0; var6 < var5; var6++) {
                f.field_a[var6] = -1;
              }
              pj.field_l = new int[1];
              for (var6 = 0; var6 < var4; var6++) {
                rb.field_d[var6] = kh.field_F[var6];
              }
              rb.field_d[var5 - 2] = "";
              rb.field_d[-1 + var5] = te.field_e;
              f.field_a[var5 - 1] = 0;
              pj.field_l[0] = 5;
            } else if (pe.field_e == 4) {
              var4 = af.a(tb.field_i, da.field_h, -3, kh.field_F, ch.field_c);
              var5 = var4 + 2;
              f.field_a = new int[var5];
              rb.field_d = new String[var5];
              for (var6 = 0; var5 > var6; var6++) {
                f.field_a[var6] = -1;
              }
              pj.field_l = new int[1];
              for (var6 = 0; var6 < var4; var6++) {
                rb.field_d[var6] = kh.field_F[var6];
              }
              rb.field_d[var5 - 2] = "";
              rb.field_d[-1 + var5] = te.field_e;
              f.field_a[-1 + var5] = 0;
              pj.field_l[0] = 5;
            } else {
              if (5 != pe.field_e) {
                throw new IllegalArgumentException();
              }
              var4 = af.a(va.field_a, da.field_h, -3, kh.field_F, ch.field_c);
              var5 = 3 + var4;
              rb.field_d = new String[var5];
              f.field_a = new int[var5];
              for (var6 = 0; var6 < var5; var6++) {
                f.field_a[var6] = -1;
              }
              pj.field_l = new int[2];
              for (var6 = 0; var6 < var4; var6++) {
                rb.field_d[var6] = kh.field_F[var6];
              }
              rb.field_d[var5 - 3] = "";
              rb.field_d[-2 + var5] = mk.field_h;
              f.field_a[var5 - 2] = 0;
              pj.field_l[0] = 3;
              rb.field_d[-1 + var5] = te.field_e;
              f.field_a[var5 - 1] = 1;
              pj.field_l[1] = 5;
            }
          } else {
            var4 = af.a(ij.a(new String[]{"<br><%0><br>"}, -1, hj.field_H), da.field_h, -3, kh.field_F, ch.field_c);
            var5 = -1;
            for (var6 = 0; var4 > var6; var6++) {
              if (!"<%0>".equals(kh.field_F[var6])) {
                continue;
              }
              var5 = var6;
              break;
            }
            if (var5 == -1) {
              throw new IllegalStateException();
            }
            ia.field_r = new String[var5];
            ka.a(kh.field_F, 0, ia.field_r, 0, var5);
            kj.field_c = new String[-1 + (var4 - var5)];
            ka.a(kh.field_F, 1 + var5, kj.field_c, 0, -1 + var4 - var5);
            var4 = af.a(ij.a(new String[]{"<br><%0><br>"}, -1, wj.field_b), da.field_h, -3, kh.field_F, ch.field_c);
            var5 = -1;
            for (var6 = 0; var4 > var6; var6++) {
              if (!"<%0>".equals(kh.field_F[var6])) {
                continue;
              }
              var5 = var6;
              break;
            }
            if (var5 == -1) {
              throw new IllegalStateException();
            }
            km.field_c = new String[var5];
            ka.a(kh.field_F, 0, km.field_c, 0, var5);
            ec.field_d = new String[-1 + var4 - var5];
            ka.a(kh.field_F, var5 + 1, ec.field_d, 0, -var5 + (var4 - 1));
            if (ia.field_r.length >= km.field_c.length) {
              stackIn_58_0 = ia.field_r.length;
            } else {
              stackIn_58_0 = km.field_c.length;
            }
            var6 = stackIn_58_0;
            if (ec.field_d.length > kj.field_c.length) {
              stackIn_61_0 = ec.field_d.length;
            } else {
              stackIn_61_0 = kj.field_c.length;
            }
            var7 = stackIn_61_0;
            var8 = 7 + var6 + var7;
            rb.field_d = new String[var8];
            f.field_a = new int[var8];
            for (var9 = 0; var8 > var9; var9++) {
              f.field_a[var9] = -1;
            }
            rb.field_d[0] = p.field_c;
            pj.field_l = new int[2];
            rb.field_d[1] = r.field_o;
            f.field_a[1] = 0;
            f.field_a[3] = 1;
            rb.field_d[5] = "";
            pj.field_l[1] = 2;
            rb.field_d[4] = ql.field_h;
            rb.field_d[3] = q.field_Ob;
            rb.field_d[2] = ga.field_l;
            pj.field_l[0] = 5;
            for (var9Lifetime2 = 0; var9Lifetime2 < var6; var9Lifetime2++) {
              stackIn_68_0 = rb.field_d;
              stackIn_68_1 = 6 + var9Lifetime2;
              if (0 <= km.field_c.length + var9Lifetime2 - var6) {
                stackIn_69_2 = km.field_c[km.field_c.length + var9Lifetime2 - var6];
              } else {
                stackIn_69_2 = "";
              }
              stackIn_68_0[stackIn_68_1] = stackIn_69_2;
            }
            rb.field_d[6 + var6] = null;
            f.field_a[var6 + 6] = -2;
            for (var9Lifetime3 = 0; var7 > var9Lifetime3; var9Lifetime3++) {
              stackIn_73_0 = rb.field_d;
              stackIn_73_1 = var6 + 7 + var9Lifetime3;
              stackIn_73_2 = ~var9Lifetime3;
              stackIn_73_3 = ~ec.field_d.length;
              if (stackIn_73_2 <= stackIn_73_3) {
                stackIn_76_2 = "";
              } else {
                stackIn_76_2 = ec.field_d[var9Lifetime3];
              }
              stackIn_73_0[stackIn_73_1] = stackIn_76_2;
            }
            hj.field_I = ll.a(1000);
          }
          ai.field_i.field_g = pj.field_l.length;
          var4Lifetime1 = 0;
          for (var5Lifetime1 = 0; rb.field_d.length > var5Lifetime1; var5Lifetime1++) {
            stackIn_89_0 = 87;
            stackIn_90_1 = !(0 > f.field_a[var5Lifetime1]);
            var6Lifetime1 = bb.$cfr$intArgs$a$62abead39cee(stackIn_89_0, stackIn_90_1, rb.field_d[var5Lifetime1]);
            if (var4Lifetime1 < var6Lifetime1) {
              var4Lifetime1 = var6Lifetime1;
            }
          }
          if (2 == pe.field_e) {
            var11 = ia.field_r;
            var5_ref_String__ = var11;
            for (var6Lifetime2 = 0; var11.length > var6Lifetime2; var6Lifetime2++) {
              var12 = var11[var6Lifetime2];
              var8Lifetime1 = bb.$cfr$intArgs$a$62abead39cee(87, false, var12);
              if (var8Lifetime1 > var4Lifetime1) {
                var4Lifetime1 = var8Lifetime1;
              }
            }
            var5_ref_String__Lifetime1 = kj.field_c;
            for (var6Lifetime2Lifetime1 = 0; var6Lifetime2Lifetime1 < var5_ref_String__Lifetime1.length; var6Lifetime2Lifetime1++) {
              var13 = var5_ref_String__Lifetime1[var6Lifetime2Lifetime1];
              var8Lifetime1Lifetime1 = bb.$cfr$intArgs$a$62abead39cee(87, false, var13);
              if (var4Lifetime1 < var8Lifetime1Lifetime1) {
                var4Lifetime1 = var8Lifetime1Lifetime1;
              }
            }
          }
          vi.field_o = nd.field_r - (var4Lifetime1 >> 1);
          ql.field_g = -(var4Lifetime1 >> 1) + (var4Lifetime1 + nd.field_r);
          ak.field_e = (dc.field_b + hi.field_ab << 1) * ai.field_i.field_g;
          for (var5Lifetime2 = 0; var5Lifetime2 < rb.field_d.length; var5Lifetime2++) {
            stackIn_112_0 = ak.field_e;
            if (0 > f.field_a[var5Lifetime2]) {
              stackIn_113_1 = jm.field_b;
            } else {
              stackIn_113_1 = lm.field_d;
            }
            ak.field_e = stackIn_112_0 + stackIn_113_1;
          }
          jh.field_m = -(ak.field_e >> 1) + ma.field_E;
          ll.field_d = new int[rb.field_d.length][];
          var5Lifetime3 = 0;
          var6Lifetime3 = jh.field_m;
          while (rb.field_d.length > var5Lifetime3) {
            var7Lifetime1 = f.field_a[var5Lifetime3];
            if (var7Lifetime1 >= 0) {
              var8Lifetime2 = bb.$cfr$intArgs$a$62abead39cee(87, true, rb.field_d[var5Lifetime3]);
              var9Lifetime1 = -(var8Lifetime2 >> 1) + nd.field_r;
              var6Lifetime3 = var6Lifetime3 + hi.field_ab;
              ll.field_d[var5Lifetime3] = new int[4];
              ll.field_d[var5Lifetime3][0] = -se.field_j + var9Lifetime1;
              ll.field_d[var5Lifetime3][1] = var6Lifetime3;
              ll.field_d[var5Lifetime3][2] = var8Lifetime2 + (se.field_j << 1);
              var6Lifetime3 = var6Lifetime3 + (lm.field_d + ((dc.field_b << 1) + hi.field_ab));
              ll.field_d[var5Lifetime3][3] = (dc.field_b << 1) + lm.field_d;
            } else {
              var6Lifetime3 = var6Lifetime3 + jm.field_b;
            }
            var5Lifetime3++;
          }
          if (pe.field_e == 2) {
            ai.field_i.a(-1, param1, -1, -85);
          } else {
            ai.field_i.a(0, param1, bb.a(-93, jb.field_b, ef.field_j), -85);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3), "ja.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private ja() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        if (param0 != 3) {
          return;
        }
        field_m = null;
        field_h = null;
    }

    static {
        field_h = "Open options screen";
        field_l = false;
        field_i = 8;
    }
}
