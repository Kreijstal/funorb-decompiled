/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static String field_a;
    static ne field_b;
    static long field_c;

    final static void a(boolean param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        o var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        da var8 = null;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var6Lifetime1;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          ah.a(pg.field_e, 7);
          je.a(-76, ad.field_m, gb.field_j);
          if (!pg.field_e &&
            gb.field_j != -1) {
            ie.a(gb.field_j, ad.field_m, 57);
          }
          if (cb.field_a > 0 &&
            ob.field_j > 1) {
            if (dc.field_n == null) {
              dc.field_n = new o(256, 1 + (ad.field_b.field_F + ad.field_b.field_s));
            }
            dc.field_n.a();
            mi.a();
            ad.field_b.a(bb.a(ma.field_m, new String[]{Integer.toString(ob.field_j)}, -63), 128, ad.field_b.field_F, 16777215, 8421504);
            hj.field_e.a(true);
            dc.field_n.a(cb.field_a, 46, 107, 0, 125);
          }
          if (ci.field_ib > 0 &&
            lk.field_e > 0) {
            if (dc.field_n == null) {
              dc.field_n = new o(256, 1 + ad.field_b.field_s + ad.field_b.field_F);
            }
            dc.field_n.a();
            mi.a();
            ad.field_b.a(bb.a(ha.field_p, new String[]{Integer.toString(lk.field_e)}, -63), 128, ad.field_b.field_F, 16777215, 8421504);
            hj.field_e.a(true);
            dc.field_n.a(ci.field_ib, 46, 109, 0, 475);
          }
          if (fg.field_a > 0) {
            if (fg.field_a >= 500) {
              if (bi.field_h == 1) {
                ad.field_b.a(kc.field_M, 320, 32, 16711680, 8421504);
              }
              if (2 == bi.field_h) {
                ad.field_b.a(ii.field_a, 320, 32, 16776960, 8421504);
              }
            } else {
              if (1 == bi.field_h) {
                ad.field_b.a(bb.a(pk.field_T, new String[]{Integer.toString(fg.field_a / 50)}, -63), 320, 32, 16711680, 8421504);
              }
              if (bi.field_h == 2) {
                ad.field_b.a(bb.a(og.field_i, new String[]{Integer.toString(fg.field_a / 50)}, -63), 320, 32, 16776960, 8421504);
              }
            }
          }
          var2_int = 30 + ug.field_g.b(bb.a(wk.field_a, new String[]{Integer.toString(100)}, -63));
          var3 = 30 + ug.field_g.b(bb.a(nb.field_b, new String[]{Integer.toString(1300)}, -63));
          if (var2_int < var3) {
            var2_int = var3;
          }
          var3Lifetime1 = 30 + ug.field_g.b(wf.field_b);
          if (var3Lifetime1 > var2_int) {
            var2_int = var3Lifetime1;
          }
          uj.a(var2_int + 15, 47, 0, dh.field_f, 433, 2);
          ug.field_g.c(bb.a(wk.field_a, new String[]{Integer.toString(ud.field_k * 100 / qh.field_a[7])}, -63), 30, 467, 16777215, -1);
          if (-ud.field_k + (qh.field_a[kb.field_b] - lk.field_f) > 0) {
            ug.field_g.c(bb.a(nb.field_b, new String[]{Integer.toString(-ud.field_k + (qh.field_a[kb.field_b] - lk.field_f))}, -63), 30, 455, 16777215, -1);
          }
          if (-ud.field_k + qh.field_a[kb.field_b] - lk.field_f <= 0) {
            ug.field_g.c(wf.field_b, 30, 455, 16777215, -1);
          }
          var2_intLifetime1 = 74 + ug.field_g.b(field_a);
          var4 = h.field_b;
          var5 = 641 - var2_intLifetime1;
          ug.field_g.c(field_a, var5, 461, 16777215, -1);
          var5 = var5 + (ug.field_g.b(field_a) + 1);
          for (var6 = 0; uf.field_p > var6; var6++) {
            var4.a(var5, -(var4.field_r * 12 / var4.field_q) + 470, 12, var4.field_r * 12 / var4.field_q);
            var5 += 22;
          }
          if (param1 != -48) {
            var8 = (da) null;
            d.a((da) null, true, (byte) -71, (da) null, (da) null);
          }
          uj.a(var2_intLifetime1 + 15, 47, -15 + (640 - var2_intLifetime1), le.field_d, 433, 2);
          if (0 < uf.field_p) {
            if (lk.field_b < 50 &&
              lk.field_e == 0) {
              ad.field_b.a(ac.field_a, 320, 33, 16777215, 1);
            }
            if (wc.field_c < 200) {
              var6Lifetime1 = 0;
              if (24 > wc.field_c) {
                var6Lifetime1 = var6Lifetime1 + 655360 * wc.field_c;
              } else {
                if (wc.field_c <= 175) {
                  var6Lifetime1 = 16711680;
                } else {
                  var6Lifetime1 = var6Lifetime1 + (-wc.field_c + 200) * 655360;
                }
              }
              if (wc.field_c < 50) {
                var6Lifetime1 = var6Lifetime1 + 1285 * wc.field_c;
              } else {
                if (wc.field_c < 150) {
                  var6Lifetime1 = var6Lifetime1 + 65535;
                } else {
                  var6Lifetime1 = var6Lifetime1 + 1285 * (-wc.field_c + 200);
                }
              }
              ad.field_b.a(bb.a(fj.field_j, new String[]{ci.field_gb[kb.field_b], Integer.toString(kb.field_b + 1)}, -63), 0, 0, 640, 480, var6Lifetime1, -1, 1, 1, 24);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "d.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 > -96) {
          d.a(false, (byte) -112);
        }
    }

    final static void a(da param0, boolean param1, byte param2, da param3, da param4) {
        td.field_h = hh.a("", false);
        td.field_h.a(false, (byte) -75);
        ci.a(param0, false, param3, param4);
        if (param2 != -110) {
          return;
        }
        try {
          ff.b(-13408);
          ma.field_o = el.field_p;
          gb.field_i = el.field_p;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "d.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Lives: ";
    }
}
