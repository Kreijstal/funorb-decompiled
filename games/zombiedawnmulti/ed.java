/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static cj field_d;
    static int field_b;
    static int[] field_a;
    static int field_c;
    static String field_e;

    final static gh a(byte param0, String param1) {
        if (dj.field_k == ta.field_hb) {
            return null;
        }
        if (param0 != 127) {
            Object var3 = null;
            gh discarded$0 = ed.a((byte) -55, (String) null);
        }
        if (oi.field_j == ta.field_hb) {
            if (param1.equals((Object) (Object) ih.field_a)) {
                ta.field_hb = mp.field_b;
                return ai.field_g;
            }
        }
        ai.field_g = null;
        ih.field_a = param1;
        ta.field_hb = dj.field_k;
        return null;
    }

    final static void a(String param0, long param1, int param2, int param3, boolean param4, int param5) {
        ma.field_a.b((byte) -35, param2);
        ma.field_a.field_j = ma.field_a.field_j + 1;
        int var7 = ma.field_a.field_j;
        ma.field_a.a(param1, true);
        ma.field_a.a(param0, (byte) 105);
        ma.field_a.a(-31, param3);
        ma.field_a.a(107, param4 ? 1 : 0);
        ma.field_a.e(76, -var7 + ma.field_a.field_j);
        if (param5 != 21965) {
            Object var8 = null;
            ci discarded$0 = ed.a((ul) null, -63);
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 12814) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    final static ci a(ul param0, int param1) {
        ci var2 = null;
        if (param1 == -2852) {
          var2 = new ci();
          var2.a((byte) 97, param0.a("", "sandbox.zdl", false));
          var2.a((byte) 84, param0.a("", "tutorial.zdl", false));
          var2.a((byte) 111, param0.a("", "n2/ma_1.zdl", false));
          var2.a((byte) 115, param0.a("", "n2/wh_1.zdl", false));
          var2.a((byte) 126, param0.a("", "n2/pp_1.zdl", false));
          var2.a((byte) 94, param0.a("", "n2/pr_1.zdl", false));
          var2.a((byte) 85, param0.a("", "n4/ma_1.zdl", false));
          var2.a((byte) 115, param0.a("", "n4/wh_1.zdl", false));
          var2.a((byte) 125, param0.a("", "n4/pp_1.zdl", false));
          var2.a((byte) 83, param0.a("", "n4/pr_1.zdl", false));
          var2.a((byte) 107, param0.a("", "Badgirls_2.zdl", false));
          var2.a((byte) 110, param0.a("", "Carpark_4.zdl", false));
          var2.a((byte) 103, param0.a("", "Cineplex_2.zdl", false));
          var2.a((byte) 76, param0.a("", "Claustrophobia_2.zdl", false));
          var2.a((byte) 79, param0.a("", "Core_2.zdl", false));
          var2.a((byte) 120, param0.a("", "Hotel_4.zdl", false));
          var2.a((byte) 72, param0.a("", "Megamall_4.zdl", false));
          var2.a((byte) 126, param0.a("", "Prisonbreak_4.zdl", false));
          var2.a((byte) 95, param0.a("", "AnyonesConference.zdl", false));
          var2.a((byte) 80, param0.a("", "impound.zdl", false));
          var2.a((byte) 72, param0.a("", "mini_mart.zdl", false));
          var2.a((byte) 114, param0.a("", "Birdmaster1.zdl", false));
          var2.a((byte) 94, param0.a("", "Sken58_2.zdl", false));
          var2.a((byte) 126, param0.a("", "precinct42.zdl", false));
          var2.a((byte) 125, param0.a("", "sustained_alpha.zdl", false));
          var2.a((byte) 121, param0.a("", "Media_2.zdl", false));
          return var2;
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_a = new int[256];
        field_e = "Haze";
        var1 = 0;
        L0: while (true) {
          if (var1 <= -257) {
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (-9 <= var2) {
                field_a[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (1 != (1 & var0)) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = -306674912 ^ var0 >>> 1459521921;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
