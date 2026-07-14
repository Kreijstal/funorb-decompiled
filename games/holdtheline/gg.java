/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends rm {
    static int field_G;
    static sa field_M;
    static tk field_H;
    private ia field_I;
    private int field_K;
    static af field_N;
    static boolean field_L;
    static int field_J;

    public static void a(byte param0) {
        field_N = null;
        field_H = null;
        field_M = null;
        if (param0 <= 33) {
            gg.a((byte) -35);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        fd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hj var13 = null;
        hj var14 = null;
        hj var15 = null;
        hj var16 = null;
        var11 = HoldTheLine.field_D;
        super.a(param0, param1, param2, param3);
        if (param3 == 0) {
          var5 = (((gg) this).field_x >> 2066006433) + (param2 + ((gg) this).field_k);
          var6 = param1 - -((gg) this).field_o - -(((gg) this).field_u >> 1728563009);
          var8 = ((gg) this).field_I.b(-7447);
          if (hh.field_d == var8) {
            var16 = ef.field_i[0];
            var9 = var16.field_o << 133255937;
            var10 = var16.field_v << -1272395263;
            if (le.field_m != null) {
              if (var9 <= le.field_m.field_s) {
                if (le.field_m.field_y >= var10) {
                  hf.a(le.field_m, -1);
                  tc.c();
                  var16.b(112, 144, var16.field_o << 2085105508, var16.field_v << -223846748, -((gg) this).field_K << -1457693974, 4096);
                  dm.b((byte) -10);
                  le.field_m.b(-var16.field_o + var5, -var16.field_v + var6, 256);
                  return;
                } else {
                  le.field_m = new hj(var9, var10);
                  hf.a(le.field_m, -1);
                  var16.b(112, 144, var16.field_o << 2085105508, var16.field_v << -223846748, -((gg) this).field_K << -1457693974, 4096);
                  dm.b((byte) -10);
                  le.field_m.b(-var16.field_o + var5, -var16.field_v + var6, 256);
                  return;
                }
              } else {
                le.field_m = new hj(var9, var10);
                hf.a(le.field_m, -1);
                var16.b(112, 144, var16.field_o << 2085105508, var16.field_v << -223846748, -((gg) this).field_K << -1457693974, 4096);
                dm.b((byte) -10);
                le.field_m.b(-var16.field_o + var5, -var16.field_v + var6, 256);
                return;
              }
            } else {
              le.field_m = new hj(var9, var10);
              hf.a(le.field_m, -1);
              var16.b(112, 144, var16.field_o << 2085105508, var16.field_v << -223846748, -((gg) this).field_K << -1457693974, 4096);
              dm.b((byte) -10);
              le.field_m.b(-var16.field_o + var5, -var16.field_v + var6, 256);
              return;
            }
          } else {
            if (var8 != um.field_a) {
              if (g.field_k == var8) {
                var13 = ef.field_i[2];
                var13.b(-(var13.field_s >> 1875187681) + var5, -(var13.field_y >> 335583873) + var6, 256);
                return;
              } else {
                L0: {
                  if (tg.field_d != var8) {
                    break L0;
                  } else {
                    var14 = ef.field_i[1];
                    var14.b(-(var14.field_s >> 1490066049) + var5, var6 - (var14.field_y >> 2092713505), 256);
                    break L0;
                  }
                }
                return;
              }
            } else {
              var15 = ef.field_i[0];
              var9 = var15.field_o << 133255937;
              var10 = var15.field_v << -1272395263;
              if (le.field_m != null) {
                if (var9 <= le.field_m.field_s) {
                  if (le.field_m.field_y >= var10) {
                    hf.a(le.field_m, -1);
                    tc.c();
                    var15.b(112, 144, var15.field_o << 2085105508, var15.field_v << -223846748, -((gg) this).field_K << -1457693974, 4096);
                    dm.b((byte) -10);
                    le.field_m.b(-var15.field_o + var5, -var15.field_v + var6, 256);
                    return;
                  } else {
                    le.field_m = new hj(var9, var10);
                    hf.a(le.field_m, -1);
                    var15.b(112, 144, var15.field_o << 2085105508, var15.field_v << -223846748, -((gg) this).field_K << -1457693974, 4096);
                    dm.b((byte) -10);
                    le.field_m.b(-var15.field_o + var5, -var15.field_v + var6, 256);
                    return;
                  }
                } else {
                  le.field_m = new hj(var9, var10);
                  hf.a(le.field_m, -1);
                  var15.b(112, 144, var15.field_o << 2085105508, var15.field_v << -223846748, -((gg) this).field_K << -1457693974, 4096);
                  dm.b((byte) -10);
                  le.field_m.b(-var15.field_o + var5, -var15.field_v + var6, 256);
                  return;
                }
              } else {
                le.field_m = new hj(var9, var10);
                hf.a(le.field_m, -1);
                var15.b(112, 144, var15.field_o << 2085105508, var15.field_v << -223846748, -((gg) this).field_K << -1457693974, 4096);
                dm.b((byte) -10);
                le.field_m.b(-var15.field_o + var5, -var15.field_v + var6, 256);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final String f(int param0) {
        Object var3 = null;
        if (param0 == 0) {
          if (!((gg) this).field_p) {
            return null;
          } else {
            return ((gg) this).field_I.b((byte) -59);
          }
        } else {
          var3 = null;
          ((gg) this).a(103, (n) null, 21, (byte) -77);
          if (!((gg) this).field_p) {
            return null;
          } else {
            return ((gg) this).field_I.b((byte) -59);
          }
        }
    }

    final boolean a(n param0, int param1) {
        if (param1 != -25823) {
            String discarded$0 = ((gg) this).f(84);
            return false;
        }
        return false;
    }

    final void a(int param0, n param1, int param2, byte param3) {
        ((gg) this).field_K = ((gg) this).field_K + 1;
        super.a(param0, param1, param2, param3);
    }

    gg(ia param0) {
        ((gg) this).field_I = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = 200;
        field_M = new sa();
        field_J = 0;
    }
}
