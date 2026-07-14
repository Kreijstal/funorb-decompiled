/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends an {
    static vn field_E;
    static ij field_H;
    private int field_F;
    private vc field_G;

    final String d(int param0) {
        if (!(!((np) this).field_l)) {
            return ((np) this).field_G.b((byte) -109);
        }
        int var2 = -31 / ((10 - param0) / 58);
        return null;
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        ((np) this).field_F = ((np) this).field_F + 1;
        super.a(param0, (byte) -110, param2, param3);
        int var5 = -62 / ((param1 - 46) / 42);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        rh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        vn var13 = null;
        vn var14 = null;
        vn var15 = null;
        vn var16 = null;
        var11 = ZombieDawn.field_J;
        super.a(param0, param1, param2, param3 + param3);
        if (-1 == (param1 ^ -1)) {
          var5 = param2 + ((np) this).field_k - -(((np) this).field_i >> -1689432255);
          var6 = ((np) this).field_j + (param0 + (((np) this).field_n >> -1050180895));
          var8 = ((np) this).field_G.a((byte) -76);
          if (var8 != se.field_l) {
            if (gj.field_v != var8) {
              if (var8 != uc.field_b) {
                if (mc.field_g != var8) {
                  return;
                } else {
                  var13 = dj.field_k[1];
                  var13.b(var5 - (var13.field_w >> -746104799), -(var13.field_t >> 752073761) + var6, 256);
                  return;
                }
              } else {
                var14 = dj.field_k[2];
                var14.b(-(var14.field_w >> 1944584193) + var5, -(var14.field_t >> 759024833) + var6, 256);
                return;
              }
            } else {
              var16 = dj.field_k[0];
              var9 = var16.field_r << -1853164095;
              var10 = var16.field_q << -282811007;
              if (tm.field_m != null) {
                if (tm.field_m.field_w >= var9) {
                  if (var10 > tm.field_m.field_t) {
                    tm.field_m = new vn(var9, var10);
                    ki.a((byte) -94, tm.field_m);
                    var16.a(112, 144, var16.field_r << -211027196, var16.field_q << 1033934116, -((np) this).field_F << 1569045130, 4096);
                    pa.a(-21189);
                    tm.field_m.b(-var16.field_r + var5, -var16.field_q + var6, 256);
                    return;
                  } else {
                    ki.a((byte) -86, tm.field_m);
                    bi.d();
                    var16.a(112, 144, var16.field_r << -211027196, var16.field_q << 1033934116, -((np) this).field_F << 1569045130, 4096);
                    pa.a(-21189);
                    tm.field_m.b(-var16.field_r + var5, -var16.field_q + var6, 256);
                    return;
                  }
                } else {
                  tm.field_m = new vn(var9, var10);
                  ki.a((byte) -94, tm.field_m);
                  var16.a(112, 144, var16.field_r << -211027196, var16.field_q << 1033934116, -((np) this).field_F << 1569045130, 4096);
                  pa.a(-21189);
                  tm.field_m.b(-var16.field_r + var5, -var16.field_q + var6, 256);
                  return;
                }
              } else {
                tm.field_m = new vn(var9, var10);
                ki.a((byte) -94, tm.field_m);
                var16.a(112, 144, var16.field_r << -211027196, var16.field_q << 1033934116, -((np) this).field_F << 1569045130, 4096);
                pa.a(-21189);
                tm.field_m.b(-var16.field_r + var5, -var16.field_q + var6, 256);
                return;
              }
            }
          } else {
            var15 = dj.field_k[0];
            var9 = var15.field_r << -1853164095;
            var10 = var15.field_q << -282811007;
            if (tm.field_m != null) {
              if (tm.field_m.field_w >= var9) {
                if (var10 > tm.field_m.field_t) {
                  tm.field_m = new vn(var9, var10);
                  ki.a((byte) -94, tm.field_m);
                  var15.a(112, 144, var15.field_r << -211027196, var15.field_q << 1033934116, -((np) this).field_F << 1569045130, 4096);
                  pa.a(-21189);
                  tm.field_m.b(-var15.field_r + var5, -var15.field_q + var6, 256);
                  return;
                } else {
                  ki.a((byte) -86, tm.field_m);
                  bi.d();
                  var15.a(112, 144, var15.field_r << -211027196, var15.field_q << 1033934116, -((np) this).field_F << 1569045130, 4096);
                  pa.a(-21189);
                  tm.field_m.b(-var15.field_r + var5, -var15.field_q + var6, 256);
                  return;
                }
              } else {
                tm.field_m = new vn(var9, var10);
                ki.a((byte) -94, tm.field_m);
                var15.a(112, 144, var15.field_r << -211027196, var15.field_q << 1033934116, -((np) this).field_F << 1569045130, 4096);
                pa.a(-21189);
                tm.field_m.b(-var15.field_r + var5, -var15.field_q + var6, 256);
                return;
              }
            } else {
              tm.field_m = new vn(var9, var10);
              ki.a((byte) -94, tm.field_m);
              var15.a(112, 144, var15.field_r << -211027196, var15.field_q << 1033934116, -((np) this).field_F << 1569045130, 4096);
              pa.a(-21189);
              tm.field_m.b(-var15.field_r + var5, -var15.field_q + var6, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 1569045130) {
            field_H = null;
            field_E = null;
            field_H = null;
            return;
        }
        field_E = null;
        field_H = null;
    }

    final static void a(byte param0, int param1) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        var4 = ZombieDawn.field_J;
        var5 = new int[1 + ln.field_c.length];
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (ln.field_c.length <= var3) {
            var2[var2.length + -1] = param1;
            if (param0 != 9) {
              field_H = null;
              ln.field_c = var2;
              return;
            } else {
              ln.field_c = var2;
              return;
            }
          } else {
            var5[var3] = ln.field_c[var3];
            var3++;
            continue L0;
          }
        }
    }

    np(vc param0) {
        ((np) this).field_G = param0;
    }

    final boolean a(byte param0, ga param1) {
        if (param0 <= 67) {
            return false;
        }
        return false;
    }

    static {
    }
}
