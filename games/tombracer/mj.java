/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mj extends fqa {
    static String[] field_L;
    static il field_J;
    static String field_K;
    static String field_M;

    public static void s(byte param0) {
        field_J = null;
        field_K = null;
        field_L = null;
        if (param0 != -12) {
            return;
        }
        field_M = null;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return true;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var9 = new fsa(param2, param0);
        var9.b((byte) -11, ((mj) this).field_k, ((mj) this).field_l);
        var9.h(3, param1 ^ param1);
        var9.a((byte) 83, (nv) (Object) new eq(param2, param0));
        sm var5 = new sm(param2, param0);
        var5.b(0, 1);
        ((mj) this).a((ut) (Object) var5, (byte) -101);
        jma var6 = var5.k((byte) -98);
        var6.b(1, 106);
        var9.a((byte) 83, (nv) (Object) var5);
        mfa var7 = rm.field_a;
        cv var8 = (cv) (Object) var7.a(9, param1 + 103);
        var8.b(3, (byte) -112);
        var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var8);
        return var9;
    }

    final int B(int param0) {
        if (param0 != 31609) {
            return 57;
        }
        return 3;
    }

    final static void a(String param0, File param1, int param2) {
        if (param2 != 1) {
            mj.s((byte) -30);
            Object discarded$0 = gj.field_d.put((Object) (Object) param0, (Object) (Object) param1);
            return;
        }
        Object discarded$1 = gj.field_d.put((Object) (Object) param0, (Object) (Object) param1);
    }

    final boolean r(byte param0) {
        if (param0 != 93) {
            field_M = null;
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            field_J = null;
            return 7;
        }
        return 7;
    }

    mj(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    mj(la param0, int param1) {
        super(param0, param1);
    }

    final void q(byte param0) {
        super.q(param0);
        ((mj) this).b(param0 + 223, 2097152, 2097152);
    }

    final static void a(byte param0, String param1, cn param2, cn param3, int param4) {
        Object var6 = null;
        sra var7 = null;
        var7 = (sra) (Object) dma.field_l;
        var7.a(param4, (byte) 47, param1);
        o.field_d = jta.a((byte) 120, "b12_old", param3, "", param2);
        param4++;
        var7.a(param4, (byte) 47, param1);
        if (param0 > -8) {
          var6 = null;
          mj.a((String) null, (File) null, -60);
          cq.field_d = jta.a((byte) 112, "newfont_old", param3, "", param2);
          param4++;
          var7.a(param4, (byte) 47, param1);
          kv.field_a = joa.a("b12", param2, "", (byte) 76);
          param4++;
          var7.a(param4, (byte) 47, param1);
          ds.field_n = joa.a("newfont", param2, "", (byte) -111);
          param4++;
          var7.a(param4, (byte) 47, param1);
          wb.field_a = joa.a("newfont_lrg", param2, "", (byte) -92);
          param4++;
          var7.a(param4, (byte) 47, param1);
          qp.field_r = joa.a("newfont_sml", param2, "", (byte) 126);
          param4++;
          var7.a(param4, (byte) 47, param1);
          rc.field_b = jpa.b(param3, "", "fillfont");
          param4++;
          var7.a(param4, (byte) 47, param1);
          gga.field_O = jpa.b(param3, "", "font_small");
          param4++;
          var7.a(param4, (byte) 47, param1);
          ff.field_j = jpa.b(param3, "", "font_med");
          param4++;
          var7.a(param4, (byte) 47, param1);
          ps.field_O = jpa.b(param3, "", "font_large");
          return;
        } else {
          cq.field_d = jta.a((byte) 112, "newfont_old", param3, "", param2);
          param4++;
          var7.a(param4, (byte) 47, param1);
          kv.field_a = joa.a("b12", param2, "", (byte) 76);
          param4++;
          var7.a(param4, (byte) 47, param1);
          ds.field_n = joa.a("newfont", param2, "", (byte) -111);
          param4++;
          var7.a(param4, (byte) 47, param1);
          wb.field_a = joa.a("newfont_lrg", param2, "", (byte) -92);
          param4++;
          var7.a(param4, (byte) 47, param1);
          qp.field_r = joa.a("newfont_sml", param2, "", (byte) 126);
          param4++;
          var7.a(param4, (byte) 47, param1);
          rc.field_b = jpa.b(param3, "", "fillfont");
          param4++;
          var7.a(param4, (byte) 47, param1);
          gga.field_O = jpa.b(param3, "", "font_small");
          param4++;
          var7.a(param4, (byte) 47, param1);
          ff.field_j = jpa.b(param3, "", "font_med");
          param4++;
          var7.a(param4, (byte) 47, param1);
          ps.field_O = jpa.b(param3, "", "font_large");
          return;
        }
    }

    final static boolean c(int param0, int param1, int param2) {
        if (param0 == 2097152) {
          if ((fna.field_h ^ -1) == -14) {
            la.l(param0 + 0);
            return true;
          } else {
            if ((fna.field_h ^ -1) == -103) {
              kga.field_n.a(true);
              return true;
            } else {
              if (null != kga.field_n) {
                if (!kga.field_n.a(param2, (byte) -105, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        } else {
          field_M = null;
          if ((fna.field_h ^ -1) == -14) {
            la.l(param0 + 0);
            return true;
          } else {
            if ((fna.field_h ^ -1) == -103) {
              kga.field_n.a(true);
              return true;
            } else {
              if (null != kga.field_n) {
                if (!kga.field_n.a(param2, (byte) -105, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_M = "Connection lost - attempting to reconnect";
        field_K = "Please try again in a few minutes.";
    }
}
