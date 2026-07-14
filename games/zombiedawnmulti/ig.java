/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static th field_a;
    private io field_c;
    private ul field_h;
    private ul field_f;
    static ja field_b;
    static ja[] field_d;
    static String field_g;
    static ja field_e;

    final ob a(int param0, int param1) {
        byte[] var4 = null;
        ob var3 = (ob) ((ig) this).field_c.a((byte) 127, (long)param0);
        if (var3 != null) {
            return var3;
        }
        if (32768 <= param0) {
            var4 = ((ig) this).field_h.a(0, true, 32767 & param0);
        } else {
            var4 = ((ig) this).field_f.a(0, true, param0);
        }
        ob var3_ref = new ob();
        if (var4 != null) {
            var3_ref.a(64, new k(var4));
        }
        if (-32769 >= (param0 ^ -1)) {
            var3_ref.e((byte) -72);
        }
        ((ig) this).field_c.a((Object) (Object) var3_ref, (long)param0, 1);
        if (param1 != 32767) {
            ((ig) this).field_c = null;
        }
        return var3_ref;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0) {
            ig.a((byte) -89, 58, false, -109);
        }
        field_b = null;
        field_g = null;
    }

    ig(int param0, ul param1, ul param2) {
        ((ig) this).field_c = new io(64);
        ((ig) this).field_f = param1;
        ((ig) this).field_h = param2;
        if (((ig) this).field_f != null) {
            int discarded$0 = ((ig) this).field_f.d(0, -2);
        }
        if (((ig) this).field_h != null) {
            int discarded$1 = ((ig) this).field_h.d(0, -2);
        }
    }

    final static void a(byte param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        cj var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        ka var9 = null;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (t.field_e < b.field_d) {
            t.field_e = t.field_e + 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (km.field_cb != dl.field_h.field_f) {
            vj.field_t = vj.field_t + (dl.field_h.field_f + -km.field_cb);
            km.field_cb = dl.field_h.field_f;
            break L1;
          } else {
            break L1;
          }
        }
        if (0 >= t.field_e) {
          return;
        } else {
          L2: {
            lk.g((byte) 93);
            dq.field_k.a(-11838, param2);
            if (ra.field_f != null) {
              if (nh.field_m) {
                boolean discarded$1 = ra.field_f.a(dq.field_k.field_w, (byte) -27, dq.field_k.field_qb, param2);
                break L2;
              } else {
                ra.field_f = null;
                break L2;
              }
            } else {
              break L2;
            }
          }
          var4 = 0;
          L3: while (true) {
            if (var4 >= 5) {
              L4: {
                if (nn.field_b.field_T != 0) {
                  bk.field_i = new fa(nn.field_b.field_w, nn.field_b.field_qb, nn.field_b.field_zb, nn.field_b.field_z, param3, wa.field_a, kc.field_c, jf.field_a, vo.field_m, jk.field_h, cm.field_b, (String) null, 0L);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var9 = km.b(-7, param1, jk.field_f, nj.field_h);
                if (var9 != null) {
                  kj.a(-31806, var9);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var8 = jp.a((byte) -104);
                if (var8 != null) {
                  ui.field_j = var8;
                  break L6;
                } else {
                  break L6;
                }
              }
              var6 = -44 % ((-68 - param0) / 36);
              return;
            } else {
              var5 = la.field_h[var4];
              if (var5 != null) {
                L7: {
                  if (var5.field_T != 0) {
                    cm.a(-105, var4, var5);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var6 = ga.a(var4, true);
                pf.field_d[var4].field_rb = wp.field_j[var6];
                hh.field_l[var4].field_wb = vg.field_h[var6];
                var4++;
                continue L3;
              } else {
                var4++;
                continue L3;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new th();
        field_g = "Research Points: <%0>";
    }
}
