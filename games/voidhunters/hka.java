/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hka extends uj {
    static String[] field_d;

    hka() {
    }

    final boolean c(byte param0) {
        if (param0 > -104) {
            field_d = null;
            return true;
        }
        return true;
    }

    final int a(int param0) {
        if (param0 != -1) {
            field_d = null;
            return gg.field_j;
        }
        return gg.field_j;
    }

    final boolean c(int param0) {
        if (param0 < 63) {
            return true;
        }
        return false;
    }

    final int b(byte param0) {
        if (param0 <= 79) {
            field_d = null;
            return 111;
        }
        return 111;
    }

    final static void a(asb param0, int param1) {
        llb var5 = null;
        llb var7 = null;
        llb var8 = null;
        iqb.field_o = gra.a(param0, "display_name_changed", "basic", true);
        re.field_n = new wdb(0L, rbb.field_k, jj.field_q, esa.field_o);
        vra.field_b = new wdb(0L, rbb.field_k, bnb.field_q, ci.field_a);
        ci.field_c = new llb(0L, (llb) null);
        rtb.field_h = new llb(0L, qc.field_q);
        rtb.field_h.field_F = 1;
        if (param1 >= -96) {
          return;
        } else {
          aha.field_o = new llb(0L, sdb.field_p, kpb.field_r);
          rrb.field_b = new llb(0L, qsa.field_d, mab.field_e);
          nf.field_c = new llb(0L, iga.field_o);
          ci.field_c.b(-561, rtb.field_h);
          ci.field_c.b(-561, aha.field_o);
          ci.field_c.b(-561, rrb.field_b);
          ci.field_c.b(-561, (llb) (Object) re.field_n);
          ci.field_c.b(-561, nf.field_c);
          re.field_n.field_xb.field_xb.a(18445, qc.field_q);
          re.field_n.field_xb.field_xb.field_B = 1;
          var5 = re.field_n.field_xb.field_xb;
          var7 = var5;
          var7.field_F = 1;
          vra.field_b.field_xb.field_xb.a(18445, qc.field_q);
          var8 = vra.field_b.field_xb.field_xb;
          vra.field_b.field_xb.field_xb.field_B = 1;
          var8.field_F = 1;
          return;
        }
    }

    public static void d(int param0) {
        field_d = null;
        if (param0 != 0) {
            field_d = null;
        }
    }

    final int b(int param0) {
        if (param0 != -25131) {
            boolean discarded$0 = ((hka) this).c(-85);
            return 256;
        }
        return 256;
    }

    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (-11 >= (ef.field_z ^ -1)) {
          if (!lm.a(true)) {
            dma.a();
            uba.a((byte) 82, 320, 240);
            dh.a(param1, 0, 0, 0);
            if (param0 != 111) {
              field_d = null;
              return;
            } else {
              return;
            }
          } else {
            if (qmb.field_q == 0) {
              pi.a((byte) -70, false, param2);
              dh.a(param1, 0, 0, 0);
              if (param0 != 111) {
                field_d = null;
                return;
              } else {
                return;
              }
            } else {
              pga.a(param1, true);
              if (param0 == 111) {
                return;
              } else {
                field_d = null;
                return;
              }
            }
          }
        } else {
          L0: {
            var3 = 0;
            if (aob.field_o) {
              aob.field_o = false;
              var3 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          skb.a(wpb.field_p, 13, bj.e((byte) 97), var3 != 0, dua.e((byte) -79));
          if (param0 == 111) {
            return;
          } else {
            field_d = null;
            return;
          }
        }
    }

    final int d(byte param0) {
        if (param0 != 64) {
            field_d = null;
            return oq.field_t;
        }
        return oq.field_t;
    }

    final boolean a(boolean param0) {
        if (param0) {
            field_d = null;
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"All scores", "My scores", "Best each"};
    }
}
