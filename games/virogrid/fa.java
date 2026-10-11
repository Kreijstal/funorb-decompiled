/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends l {
    static km field_n;
    static String field_h;
    static long field_l;
    static double field_k;
    int field_i;
    static String field_j;
    byte[] field_g;
    static String field_m;

    final static km c(int param0) {
        if (param0 != 16777215) {
          fa.d(64);
        }
        return rl.d(true);
    }

    public static void d(int param0) {
        field_h = null;
        if (param0 != 0) {
          return;
        }
        field_n = null;
        field_m = null;
        field_j = null;
    }

    final static void a(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        Object var9 = null;
        int var10 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          if (vg.field_I != null) {
            stackIn_6_0 = vg.field_I.field_g ? 1 : 0;
          } else {
            stackIn_6_0 = (ei.field_b == null) ? 0 : 1;
          }
          var1_int = stackIn_6_0;
          if (param0 != -30265) {
            field_l = -90L;
          }
          if (var1_int != 0) {
            stackIn_11_0 = we.field_c.field_J;
          } else {
            stackIn_11_0 = 480;
          }
          var2 = stackIn_11_0;
          if (i.field_y == 10) {
            return;
          }
          if (he.field_ec != 0 ||
            wn.field_C != 0) {
            var3_int = 1141646;
            if (he.field_ec == 0) {
            }
            if (wn.field_C != 0) {
            }
            if (qa.field_e == 0) {
              var3_int = 16777215;
            }
            var4 = (int)kd.field_t;
            var5 = 21;
            if (2 == he.field_ec ||
              wn.field_C == 2) {
              var5 += 19;
            }
            if (var5 > pe.field_k) {
              pe.field_k = pe.field_k + 8;
              if (pe.field_k > var5) {
                pe.field_k = var5;
              }
            } else {
              if (var5 < pe.field_k) {
                pe.field_k = pe.field_k - 1;
              }
            }
            df.a(651 + (-var4 - 8), -pe.field_k + var2, 8 + var4, 52, 4, 0, 200);
            var6 = (int)kd.field_t - 8;
            var7 = 16;
            if (var6 > 8 &&
              var7 > 8) {
              df.e(646 - (int)kd.field_t, 2 + (var2 - 20), var6, var7, 4, 1141646);
            }
            var8 = null;
            if (he.field_ec == 1) {
              var8 = o.field_a.toUpperCase();
            }
            if (he.field_ec == 2) {
              var8 = sl.field_a.toUpperCase();
            }
            if (0 == ai.field_f) {
              vg.field_H.b((String) (var8), -((int)kd.field_t >> 1) + (642 - (vg.field_H.a((String) (var8)) >> 1)), -vg.field_H.field_G + (var2 - 2 - 2), var3_int, -1);
            } else {
              var9 = null;
              if (wn.field_C == 1) {
                var9 = o.field_a.toUpperCase();
              }
              if (2 == wn.field_C) {
                var9 = sl.field_a.toUpperCase();
              }
              vg.field_H.c((String) (var8), 642 - ((int)kd.field_t >> 1) - (vg.field_H.a((String) (var8)) >> 1), -2 - vg.field_H.field_G + (var2 - 2), var3_int, -1, 256 - ai.field_f);
              vg.field_H.c((String) (var9), -((int)kd.field_t >> 1) + 642 - (vg.field_H.a((String) (var8)) >> 1), -2 - vg.field_H.field_G + (-2 + var2), var3_int, -1, ai.field_f);
            }
          }
          if (he.field_ec == 2 ||
            wn.field_C == 2) {
            var2 -= 20;
            var3_intLifetime1 = 256;
            if (he.field_ec != 2) {
              var3_intLifetime1 = ai.field_f;
            }
            if (wn.field_C != 2) {
              var3_intLifetime1 = 256 - ai.field_f;
            }
            for (var4Lifetime1 = 0; var4Lifetime1 < 5; var4Lifetime1++) {
              var5Lifetime1 = 1141646;
              if (~qa.field_e == ~(1 + var4Lifetime1)) {
                var5Lifetime1 = 16777215;
              }
              var6Lifetime1 = 26 * var4Lifetime1 + 764 - (int)kd.field_t * 2 + 10;
              df.e(6 + var6Lifetime1, var2 - 16, 22, 16, 4, 1141646);
              if (var3_intLifetime1 != 256) {
                kd.field_p[var4Lifetime1].b(var6Lifetime1 + 12, var2 - 13, var5Lifetime1);
              } else {
                kd.field_p[var4Lifetime1].b(12 + var6Lifetime1, -13 + var2, var5Lifetime1);
              }
            }
          }
          if (0 != qa.field_e) {
            if (0 > qa.field_e) {
              return;
            }
            if (2 != wn.field_C) {
              return;
            }
          }
          var3 = "";
          var4Lifetime2 = qa.field_e;
          if (var4Lifetime2 == 0) {
            var3 = um.field_Kb;
          } else {
            if (var4Lifetime2 == 1) {
              var3 = mc.field_d;
            } else {
              if (2 == var4Lifetime2) {
                var3 = pn.field_C;
              } else {
                if (3 == var4Lifetime2) {
                  var3 = vb.field_i;
                } else {
                  if (4 == var4Lifetime2) {
                    var3 = cb.field_b;
                  } else {
                    if (var4Lifetime2 == 5) {
                      var3 = ia.field_a;
                    }
                  }
                }
              }
            }
          }
          var4Lifetime3 = 16 + vg.field_H.a(var3);
          var5Lifetime2 = 20;
          var6Lifetime2 = nl.field_u - var4Lifetime3;
          var7Lifetime1 = hk.field_Jb;
          df.c(var6Lifetime2, -var5Lifetime2 + (var7Lifetime1 + 2), var4Lifetime3, var5Lifetime2, 4, 0);
          df.e(var6Lifetime2 + 3, -16 + var7Lifetime1, var4Lifetime3 - 6, 16, 4, 1141646);
          vg.field_H.b(var3, 8 + var6Lifetime2, -2 + var7Lifetime1 - vg.field_H.field_G, 16777215, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "fa.A(" + param0 + ')');
        }
    }

    private fa() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "Capture opposing pieces<br>by moving adjacent to them";
        field_m = "Waiting for models";
        field_j = "Public chat is unavailable while setting up a rated game.";
    }
}
