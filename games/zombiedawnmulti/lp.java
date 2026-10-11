/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp extends br {
    int[] field_i;
    static db field_s;
    int field_n;
    static byte[][] field_f;
    int[] field_g;
    int[] field_q;
    byte[][][] field_o;
    di[] field_m;
    di[] field_l;
    int field_r;
    static uj field_k;
    static String field_h;
    static boolean field_p;
    static int field_j;

    final static void a(byte param0) {
        wi.a((byte) 4, tl.field_t);
        if (param0 < 35) {
          field_p = false;
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_f = (byte[][]) null;
        field_s = null;
        field_h = null;
        if (param0 > -76) {
          field_k = (uj) null;
        }
    }

    final static void a(byte param0, int param1, boolean param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (param0 == -45) {
          if (!ee.field_b) {
            return;
          }
          rp.field_l.a(-11838, param2);
          var4 = mj.field_Ib.k(-26899) ? 1 : 0;
          if (0 != kd.field_b &&
            var4 == 0) {
            param2 = false;
            ub.n(33423425);
          }
          if (param2) {
            mj.field_Ib.b(param3, 255, param1);
          }
          if (var4 != 0) {
            rp.field_l.a(-11838, param2);
          }
          var5 = mj.field_Ib.i(param0 ^ 29767) + mj.field_Ib.field_w;
          if (var5 > 640) {
            ti.field_Y = ti.field_Y + 5;
            return;
          }
          if (var5 < 635 &&
            ti.field_Y > 0) {
            ti.field_Y = ti.field_Y - 5;
            return;
          }
          return;
        }
        field_j = -28;
        if (!ee.field_b) {
          return;
        }
        rp.field_l.a(-11838, param2);
        var4Lifetime1 = mj.field_Ib.k(-26899) ? 1 : 0;
        if (0 != kd.field_b &&
          var4Lifetime1 == 0) {
          param2 = false;
          ub.n(33423425);
        }
        if (param2) {
          mj.field_Ib.b(param3, 255, param1);
          if (var4Lifetime1 != 0) {
            rp.field_l.a(-11838, param2);
          }
          var5Lifetime1 = mj.field_Ib.i(param0 ^ 29767) + mj.field_Ib.field_w;
          if (var5Lifetime1 > 640) {
            ti.field_Y = ti.field_Y + 5;
            return;
          }
          if (var5Lifetime1 >= 635) {
            return;
          }
          if (ti.field_Y <= 0) {
            return;
          }
          ti.field_Y = ti.field_Y - 5;
          return;
        }
        if (var4Lifetime1 == 0) {
          var5Lifetime2 = mj.field_Ib.i(param0 ^ 29767) + mj.field_Ib.field_w;
          if (var5Lifetime2 > 640) {
            ti.field_Y = ti.field_Y + 5;
            return;
          }
          if (var5Lifetime2 < 635 &&
            ti.field_Y > 0) {
            ti.field_Y = ti.field_Y - 5;
            return;
          }
          return;
        }
        rp.field_l.a(-11838, param2);
        var5Lifetime3 = mj.field_Ib.i(param0 ^ 29767) + mj.field_Ib.field_w;
        if (var5Lifetime3 > 640) {
          ti.field_Y = ti.field_Y + 5;
        } else {
          if (var5Lifetime3 < 635 &&
            ti.field_Y > 0) {
            ti.field_Y = ti.field_Y - 5;
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 < -27) {
          if (vl.field_h <= 0) {
            if (!wc.j(100)) {
              var2 = 1;
            } else {
              var2 = 0;
            }
            if (ng.field_g == null &&
              cb.field_o) {
              eb.a(false, param1, var2);
              return;
            }
            return;
          }
          if (ng.field_g != null) {
            rn.field_f = ng.field_g.f(0);
            al.b(true, 2);
            if (null == rn.field_f) {
              var2 = 3;
            } else {
              var2 = 2;
              qi.a(100, rn.field_f);
            }
            if (ng.field_g == null &&
              cb.field_o) {
              eb.a(false, param1, var2);
            }
            return;
          }
        } else {
          lp.a((byte) -56, false);
          if (vl.field_h <= 0) {
            if (!wc.j(100)) {
              var2 = 1;
              if (ng.field_g == null &&
                cb.field_o) {
                eb.a(false, param1, var2);
                return;
              }
              return;
            }
            var2 = 0;
            if (ng.field_g == null &&
              cb.field_o) {
              eb.a(false, param1, var2);
              return;
            }
            return;
          }
          if (ng.field_g != null) {
            rn.field_f = ng.field_g.f(0);
            al.b(true, 2);
            if (null == rn.field_f) {
              var2 = 3;
            } else {
              var2 = 2;
              qi.a(100, rn.field_f);
            }
            if (ng.field_g == null &&
              cb.field_o) {
              eb.a(false, param1, var2);
              return;
            }
            return;
          }
        }
        rn.field_f = u.a(10386, pl.field_J, 480, 0, 0, 640);
        if (null == rn.field_f) {
          var2Lifetime1 = 3;
        } else {
          var2Lifetime1 = 2;
          qi.a(100, rn.field_f);
        }
        if (ng.field_g != null) {
          return;
        }
        if (!cb.field_o) {
          return;
        }
        eb.a(false, param1, var2Lifetime1);
    }

    final static void a(int param0, int param1) {
        uf.field_g = 0;
        uk.field_M = new ka[param0 * 15];
        sj.field_m = param0;
        ub.field_ub = new int[3];
        if (param1 > -11) {
          field_f = (byte[][]) null;
        }
    }

    lp() {
    }

    static {
        field_f = new byte[1000][];
        field_s = new db();
        field_h = "You have been removed from <%0>'s game.";
        field_j = 0;
    }
}
