/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends pu {
    static String field_l;

    final static void c(int param0) {
        int var1 = 0;
        var1 = -52 % ((-35 - param0) / 52);
        if (null != ms.field_u) {
          if (null == ms.field_u.field_g) {
            bga.field_m = null;
            ms.field_u = null;
            return;
          } else {
            ms.field_u.field_g.field_t = false;
            bga.field_m = null;
            ms.field_u = null;
            return;
          }
        } else {
          bga.field_m = null;
          ms.field_u = null;
          return;
        }
    }

    final static nea a(String param0, int param1) {
        String var2 = null;
        nea var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = BachelorFridge.field_y;
        if (fq.field_s != null) {
          L0: {
            var6 = (CharSequence) (Object) param0;
            var2 = fq.a(0, var6);
            if (var2 != null) {
              break L0;
            } else {
              var2 = (String) (Object) var6;
              break L0;
            }
          }
          var3 = (nea) (Object) fq.field_s.a((long)var2.hashCode(), (byte) -87);
          L1: while (true) {
            if (var3 == null) {
              if (param1 < -110) {
                return null;
              } else {
                boolean discarded$2 = di.b(-9);
                return null;
              }
            } else {
              L2: {
                var7 = (CharSequence) (Object) var3.field_xb;
                var4 = fq.a(0, var7);
                if (var4 == null) {
                  var4 = var3.field_xb;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (!var4.equals((Object) (Object) var2)) {
                var3 = (nea) (Object) fq.field_s.a((byte) -31);
                continue L1;
              } else {
                return var3;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static boolean b(int param0) {
        if (qq.field_l != null) {
          return true;
        } else {
          if (!vb.field_j.a("benefits", 20637)) {
            return false;
          } else {
            qq.field_l = hca.a("benefits", vb.field_j, param0 ^ -90, "members_benefits_borders");
            st.field_c = hca.a("benefits", vb.field_j, 101, "members_benefits_price");
            f.field_c = hca.a("benefits", vb.field_j, param0 + -167, "members_benefits_logo");
            ik.field_l = gw.a("benefits", "members_benefits_screenshots", vb.field_j, param0 + -143);
            pp.a(qk.field_k, -84, qq.field_l);
            gd.a(param0, -2400, 40, (byte) -85, st.field_c, 16744576, 80, 2, (po) (Object) aha.field_D, 80, 15);
            oi.a(3, ik.field_l);
            kl.a((byte) 94, f.field_c);
            return true;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        cq var2 = null;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        b.field_u = param1;
        if (param0) {
          var2 = (cq) (Object) rma.field_d.b((byte) 90);
          L0: while (true) {
            if (var2 == null) {
              if (jha.field_i != null) {
                var2 = (cq) (Object) jha.field_i.b((byte) 90);
                L1: while (true) {
                  if (var2 != null) {
                    L2: {
                      if (var2.field_h.a((byte) -106)) {
                        var2.field_i.f(var2.field_f * b.field_u - -128 >> -580263736);
                        break L2;
                      } else {
                        var2.a(false);
                        break L2;
                      }
                    }
                    var2 = (cq) (Object) jha.field_i.c(0);
                    continue L1;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L3: {
                if (!var2.field_h.a((byte) -106)) {
                  var2.a(false);
                  break L3;
                } else {
                  var2.field_i.f(var2.field_f * b.field_u - -128 >> -2064546744);
                  break L3;
                }
              }
              var2 = (cq) (Object) rma.field_d.c(0);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void d(byte param0) {
        if (param0 != -53) {
            di.a(false, 44);
            field_l = null;
            return;
        }
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "CONTINUE";
    }
}
