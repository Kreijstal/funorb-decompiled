/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends gn {
    static ka[] field_M;
    private int field_Q;
    static String field_R;
    static int field_S;
    private j field_P;
    static boolean field_O;
    static boolean field_N;

    final static void a(byte param0, vl param1, int param2) {
        ga var3 = null;
        if (param0 != 127) {
          field_M = null;
          var3 = ma.field_a;
          var3.b((byte) -35, param2);
          var3.a(param0 ^ -41, param1.field_g);
          var3.a(param1.field_i, (byte) -92);
          return;
        } else {
          var3 = ma.field_a;
          var3.b((byte) -35, param2);
          var3.a(param0 ^ -41, param1.field_g);
          var3.a(param1.field_i, (byte) -92);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        re var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ja var12 = null;
        ja var15 = null;
        ja var18 = null;
        ja var21 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (-1 == (param2 ^ -1)) {
          var5 = (((uk) this).field_n >> 1183933857) + param3 + ((uk) this).field_y;
          var6 = param1 - (-((uk) this).field_i + -(((uk) this).field_w >> 161119777));
          var8 = ((uk) this).field_P.d(80);
          if (var8 != h.field_H) {
            if (ua.field_I != var8) {
              if (var8 != jq.field_b) {
                if (db.field_b != var8) {
                  return;
                } else {
                  var21 = rj.field_I[1];
                  var21.e(var5 + -(var21.field_x >> -1562977759), -(var21.field_w >> -1754107935) + var6, 256);
                  return;
                }
              } else {
                var12 = rj.field_I[2];
                var12.e(var5 + -(var12.field_x >> 830916129), -(var12.field_w >> 868244353) + var6, 256);
                return;
              }
            } else {
              var18 = rj.field_I[0];
              var9 = var18.field_z << -1234884639;
              var10 = var18.field_u << 1669989665;
              if (null != bp.field_s) {
                if (var9 <= bp.field_s.field_x) {
                  if (bp.field_s.field_w >= var10) {
                    r.a(0, bp.field_s);
                    oo.b();
                    var18.a(112, 144, var18.field_z << 1534460036, var18.field_u << 2014194468, -((uk) this).field_Q << -1973923798, 4096);
                    ql.a(true);
                    bp.field_s.e(var5 + -var18.field_z, var6 - var18.field_u, 256);
                    return;
                  } else {
                    bp.field_s = new ja(var9, var10);
                    r.a(0, bp.field_s);
                    var18.a(112, 144, var18.field_z << 1534460036, var18.field_u << 2014194468, -((uk) this).field_Q << -1973923798, 4096);
                    ql.a(true);
                    bp.field_s.e(var5 + -var18.field_z, var6 - var18.field_u, 256);
                    return;
                  }
                } else {
                  bp.field_s = new ja(var9, var10);
                  r.a(0, bp.field_s);
                  var18.a(112, 144, var18.field_z << 1534460036, var18.field_u << 2014194468, -((uk) this).field_Q << -1973923798, 4096);
                  ql.a(true);
                  bp.field_s.e(var5 + -var18.field_z, var6 - var18.field_u, 256);
                  return;
                }
              } else {
                bp.field_s = new ja(var9, var10);
                r.a(0, bp.field_s);
                var18.a(112, 144, var18.field_z << 1534460036, var18.field_u << 2014194468, -((uk) this).field_Q << -1973923798, 4096);
                ql.a(true);
                bp.field_s.e(var5 + -var18.field_z, var6 - var18.field_u, 256);
                return;
              }
            }
          } else {
            var15 = rj.field_I[0];
            var9 = var15.field_z << -1234884639;
            var10 = var15.field_u << 1669989665;
            if (null != bp.field_s) {
              if (var9 <= bp.field_s.field_x) {
                if (bp.field_s.field_w >= var10) {
                  r.a(0, bp.field_s);
                  oo.b();
                  var15.a(112, 144, var15.field_z << 1534460036, var15.field_u << 2014194468, -((uk) this).field_Q << -1973923798, 4096);
                  ql.a(true);
                  bp.field_s.e(var5 + -var15.field_z, var6 - var15.field_u, 256);
                  return;
                } else {
                  bp.field_s = new ja(var9, var10);
                  r.a(0, bp.field_s);
                  var15.a(112, 144, var15.field_z << 1534460036, var15.field_u << 2014194468, -((uk) this).field_Q << -1973923798, 4096);
                  ql.a(true);
                  bp.field_s.e(var5 + -var15.field_z, var6 - var15.field_u, 256);
                  return;
                }
              } else {
                bp.field_s = new ja(var9, var10);
                r.a(0, bp.field_s);
                var15.a(112, 144, var15.field_z << 1534460036, var15.field_u << 2014194468, -((uk) this).field_Q << -1973923798, 4096);
                ql.a(true);
                bp.field_s.e(var5 + -var15.field_z, var6 - var15.field_u, 256);
                return;
              }
            } else {
              bp.field_s = new ja(var9, var10);
              r.a(0, bp.field_s);
              var15.a(112, 144, var15.field_z << 1534460036, var15.field_u << 2014194468, -((uk) this).field_Q << -1973923798, 4096);
              ql.a(true);
              bp.field_s.e(var5 + -var15.field_z, var6 - var15.field_u, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    final String d(byte param0) {
        if (!(!((uk) this).field_l)) {
            return ((uk) this).field_P.c(-117);
        }
        int var2 = -107 % ((param0 - 53) / 57);
        return null;
    }

    final void a(int param0, cf param1, int param2, int param3) {
        ((uk) this).field_Q = ((uk) this).field_Q + 1;
        super.a(param0, param1, param2, param3);
    }

    uk(j param0) {
        ((uk) this).field_P = param0;
    }

    final boolean a(cf param0, int param1) {
        if (param1 != 0) {
            ((uk) this).a(-69, -75, 99, -52);
            return false;
        }
        return false;
    }

    public static void f(int param0) {
        if (param0 != -1562977759) {
            return;
        }
        field_R = null;
        field_M = null;
    }

    final static boolean a(byte param0) {
        if (param0 >= -36) {
            boolean discarded$6 = uk.a((byte) 99);
            return !sh.field_L ? true : false;
        }
        return !sh.field_L ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = 256;
        field_R = "(<%0> players want to join)";
    }
}
