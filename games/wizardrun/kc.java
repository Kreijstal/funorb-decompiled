/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends pl {
    static int field_I;
    static int[] field_G;
    static od field_H;
    static String field_J;
    private int field_K;
    private dk field_F;

    final void a(int param0, int param1, int param2, ub param3) {
        ((kc) this).field_K = ((kc) this).field_K + 1;
        super.a(param0, param1, param2, param3);
    }

    final String c(boolean param0) {
        if (!(!((kc) this).field_v)) {
            return ((kc) this).field_F.a(-2864);
        }
        if (!param0) {
            return null;
        }
        ((kc) this).field_K = -116;
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        ok var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        o var12 = null;
        o var15 = null;
        o var18 = null;
        o var21 = null;
        var11 = wizardrun.field_H;
        super.a(param0, param1, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          var5 = ((kc) this).field_o + param0 + (((kc) this).field_r >> 2142554721);
          var6 = (((kc) this).field_n >> 2086654273) + (param3 - -((kc) this).field_l);
          var8 = ((kc) this).field_F.a(true);
          if (nf.field_c != var8) {
            if (l.field_S != var8) {
              if (hg.field_c != var8) {
                if (gf.field_V != var8) {
                  return;
                } else {
                  var21 = te.field_k[1];
                  var21.a(-(var21.field_z >> 1860228641) + var5, var6 - (var21.field_p >> 712628705), 256);
                  return;
                }
              } else {
                var12 = te.field_k[2];
                var12.a(-(var12.field_z >> 2100765505) + var5, -(var12.field_p >> 2072487713) + var6, 256);
                return;
              }
            } else {
              var18 = te.field_k[0];
              var9 = var18.field_x << -125988159;
              var10 = var18.field_s << -1428188991;
              if (null != ue.field_d) {
                if (ue.field_d.field_z >= var9) {
                  if (ue.field_d.field_p < var10) {
                    ue.field_d = new o(var9, var10);
                    ud.a(ue.field_d, false);
                    var18.b(112, 144, var18.field_x << -2026646044, var18.field_s << 1483631588, -((kc) this).field_K << 1816807530, 4096);
                    bb.b(4);
                    ue.field_d.a(var5 - var18.field_x, var6 - var18.field_s, 256);
                    return;
                  } else {
                    ud.a(ue.field_d, false);
                    ed.d();
                    var18.b(112, 144, var18.field_x << -2026646044, var18.field_s << 1483631588, -((kc) this).field_K << 1816807530, 4096);
                    bb.b(4);
                    ue.field_d.a(var5 - var18.field_x, var6 - var18.field_s, 256);
                    return;
                  }
                } else {
                  ue.field_d = new o(var9, var10);
                  ud.a(ue.field_d, false);
                  var18.b(112, 144, var18.field_x << -2026646044, var18.field_s << 1483631588, -((kc) this).field_K << 1816807530, 4096);
                  bb.b(4);
                  ue.field_d.a(var5 - var18.field_x, var6 - var18.field_s, 256);
                  return;
                }
              } else {
                ue.field_d = new o(var9, var10);
                ud.a(ue.field_d, false);
                var18.b(112, 144, var18.field_x << -2026646044, var18.field_s << 1483631588, -((kc) this).field_K << 1816807530, 4096);
                bb.b(4);
                ue.field_d.a(var5 - var18.field_x, var6 - var18.field_s, 256);
                return;
              }
            }
          } else {
            var15 = te.field_k[0];
            var9 = var15.field_x << -125988159;
            var10 = var15.field_s << -1428188991;
            if (null != ue.field_d) {
              if (ue.field_d.field_z >= var9) {
                if (ue.field_d.field_p < var10) {
                  ue.field_d = new o(var9, var10);
                  ud.a(ue.field_d, false);
                  var15.b(112, 144, var15.field_x << -2026646044, var15.field_s << 1483631588, -((kc) this).field_K << 1816807530, 4096);
                  bb.b(4);
                  ue.field_d.a(var5 - var15.field_x, var6 - var15.field_s, 256);
                  return;
                } else {
                  ud.a(ue.field_d, false);
                  ed.d();
                  var15.b(112, 144, var15.field_x << -2026646044, var15.field_s << 1483631588, -((kc) this).field_K << 1816807530, 4096);
                  bb.b(4);
                  ue.field_d.a(var5 - var15.field_x, var6 - var15.field_s, 256);
                  return;
                }
              } else {
                ue.field_d = new o(var9, var10);
                ud.a(ue.field_d, false);
                var15.b(112, 144, var15.field_x << -2026646044, var15.field_s << 1483631588, -((kc) this).field_K << 1816807530, 4096);
                bb.b(4);
                ue.field_d.a(var5 - var15.field_x, var6 - var15.field_s, 256);
                return;
              }
            } else {
              ue.field_d = new o(var9, var10);
              ud.a(ue.field_d, false);
              var15.b(112, 144, var15.field_x << -2026646044, var15.field_s << 1483631588, -((kc) this).field_K << 1816807530, 4096);
              bb.b(4);
              ue.field_d.a(var5 - var15.field_x, var6 - var15.field_s, 256);
              return;
            }
          }
        }
    }

    final boolean a(ub param0, int param1) {
        if (param1 != 8) {
            return false;
        }
        return false;
    }

    public static void d(int param0) {
        if (param0 != 112) {
          field_G = null;
          field_G = null;
          field_J = null;
          field_H = null;
          return;
        } else {
          field_G = null;
          field_J = null;
          field_H = null;
          return;
        }
    }

    kc(dk param0) {
        ((kc) this).field_F = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Names should contain a maximum of 12 characters";
        field_G = new int[256];
    }
}
