/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends kf {
    private int field_F;
    private ma field_E;
    static String field_G;

    public static void j(int param0) {
        field_G = null;
        if (param0 != 6977) {
            field_G = null;
        }
    }

    final boolean a(byte param0, w param1) {
        if (param0 != 44) {
            return false;
        }
        return false;
    }

    final String b(int param0) {
        if (param0 <= 121) {
            ld.i(55);
            if (!(!((ld) this).field_m)) {
                return ((ld) this).field_E.a((byte) 102);
            }
            return null;
        }
        if (!(!((ld) this).field_m)) {
            return ((ld) this).field_E.a((byte) 102);
        }
        return null;
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2 = 0;
        byte[] var3 = null;
        Object var4 = null;
        var2 = param1.length;
        var3 = new byte[var2];
        if (param0 < 70) {
          var4 = null;
          de discarded$2 = ld.a((Throwable) null, (String) null);
          o.a(param1, 0, var3, 0, var2);
          return var3;
        } else {
          o.a(param1, 0, var3, 0, var2);
          return var3;
        }
    }

    final static void i(int param0) {
        if (param0 != -29115) {
            return;
        }
        ni.a(-125, 4);
    }

    final void a(byte param0, w param1, int param2, int param3) {
        ((ld) this).field_F = ((ld) this).field_F + 1;
        super.a(param0, param1, param2, param3);
    }

    ld(ma param0) {
        ((ld) this).field_E = param0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        sc var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        db var13 = null;
        db var14 = null;
        db var15 = null;
        db var16 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param3 == 0) {
          var5 = (((ld) this).field_j >> 1403155361) + ((ld) this).field_t + param2;
          var6 = ((ld) this).field_o + (param1 + (((ld) this).field_v >> 1762056929));
          var8 = ((ld) this).field_E.b((byte) 116);
          if (jj.field_e != var8) {
            if (be.field_q != var8) {
              if (ni.field_b != var8) {
                if (rh.field_p != var8) {
                  return;
                } else {
                  var13 = be.field_b[1];
                  var13.d(-(var13.field_p >> 2079400193) + var5, var6 + -(var13.field_u >> 1839068961), 256);
                  return;
                }
              } else {
                var14 = be.field_b[2];
                var14.d(var5 - (var14.field_p >> 1089906849), var6 + -(var14.field_u >> -374179007), 256);
                return;
              }
            } else {
              var16 = be.field_b[0];
              var9 = var16.field_r << -1398745791;
              var10 = var16.field_x << -73343423;
              if (dd.field_f != null) {
                if (var9 <= dd.field_f.field_p) {
                  if (dd.field_f.field_u < var10) {
                    dd.field_f = new db(var9, var10);
                    de.a(dd.field_f, param0 ^ -117);
                    var16.a(112, 144, var16.field_r << 1644659268, var16.field_x << -981984796, -((ld) this).field_F << -342434070, 4096);
                    pd.a(-22949);
                    dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
                    return;
                  } else {
                    de.a(dd.field_f, 6);
                    lf.a();
                    var16.a(112, 144, var16.field_r << 1644659268, var16.field_x << -981984796, -((ld) this).field_F << -342434070, 4096);
                    pd.a(-22949);
                    dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
                    return;
                  }
                } else {
                  dd.field_f = new db(var9, var10);
                  de.a(dd.field_f, param0 ^ -117);
                  var16.a(112, 144, var16.field_r << 1644659268, var16.field_x << -981984796, -((ld) this).field_F << -342434070, 4096);
                  pd.a(-22949);
                  dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
                  return;
                }
              } else {
                dd.field_f = new db(var9, var10);
                de.a(dd.field_f, param0 ^ -117);
                var16.a(112, 144, var16.field_r << 1644659268, var16.field_x << -981984796, -((ld) this).field_F << -342434070, 4096);
                pd.a(-22949);
                dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
                return;
              }
            }
          } else {
            var15 = be.field_b[0];
            var9 = var15.field_r << -1398745791;
            var10 = var15.field_x << -73343423;
            if (dd.field_f != null) {
              if (var9 <= dd.field_f.field_p) {
                if (dd.field_f.field_u < var10) {
                  dd.field_f = new db(var9, var10);
                  de.a(dd.field_f, param0 ^ -117);
                  var15.a(112, 144, var15.field_r << 1644659268, var15.field_x << -981984796, -((ld) this).field_F << -342434070, 4096);
                  pd.a(-22949);
                  dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
                  return;
                } else {
                  de.a(dd.field_f, 6);
                  lf.a();
                  var15.a(112, 144, var15.field_r << 1644659268, var15.field_x << -981984796, -((ld) this).field_F << -342434070, 4096);
                  pd.a(-22949);
                  dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
                  return;
                }
              } else {
                dd.field_f = new db(var9, var10);
                de.a(dd.field_f, param0 ^ -117);
                var15.a(112, 144, var15.field_r << 1644659268, var15.field_x << -981984796, -((ld) this).field_F << -342434070, 4096);
                pd.a(-22949);
                dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
                return;
              }
            } else {
              dd.field_f = new db(var9, var10);
              de.a(dd.field_f, param0 ^ -117);
              var15.a(112, 144, var15.field_r << 1644659268, var15.field_x << -981984796, -((ld) this).field_F << -342434070, 4096);
              pd.a(-22949);
              dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static de a(Throwable param0, String param1) {
        de var2_ref = null;
        de var2 = null;
        if (!(param0 instanceof de)) {
            var2 = new de(param0, param1);
        } else {
            var2_ref = (de) (Object) param0;
            var2_ref.field_a = var2_ref.field_a + 32 + param1;
        }
        return var2_ref;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Player";
    }
}
