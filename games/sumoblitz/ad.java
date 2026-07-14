/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends za {
    static int field_o;
    jaclib.memory.heap.NativeHeap field_m;
    static gf field_n;
    static int[] field_q;
    static mm field_p;

    final static void c(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var5 = cv.field_G;
        var1 = var5;
        var2 = 0;
        var3 = var5.length;
        L0: while (true) {
          if (var3 <= var2) {
            if (param0 != 71) {
              field_q = null;
              return;
            } else {
              return;
            }
          } else {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            continue L0;
          }
        }
    }

    final static void c(int param0) {
        kd.field_a[4] = new int[1];
        iv.field_g[4] = new ak(4);
        si.a(400, 38, 10, 2, new int[6], 2, 468);
        iv.field_g[2] = new ak(2);
        if (0 < ct.field_x) {
          if (!uc.a((byte) -29, lt.field_m)) {
            L0: {
              if (2 <= ku.field_j) {
                si.a(115, 38, 148, 2, new int[8], 0, 492);
                iv.field_g[0] = new ak(0);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (mq.a(8230, 25)) {
                si.a(115, 38, 148, 2, new int[8], 0, 492);
                iv.field_g[0] = new ak(0);
                break L1;
              } else {
                break L1;
              }
            }
            ut.field_j = param0;
            return;
          } else {
            L2: {
              si.a(150, 38, 170, 2, new int[7], 1, 470);
              iv.field_g[1] = new ak(1);
              si.a(150, 38, 170, 2, new int[5], 8, 470);
              iv.field_g[8] = new ak(8);
              if (2 <= ku.field_j) {
                si.a(115, 38, 148, 2, new int[8], 0, 492);
                iv.field_g[0] = new ak(0);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (mq.a(8230, 25)) {
                si.a(115, 38, 148, 2, new int[8], 0, 492);
                iv.field_g[0] = new ak(0);
                break L3;
              } else {
                break L3;
              }
            }
            ut.field_j = param0;
            return;
          }
        } else {
          L4: {
            if (2 <= ku.field_j) {
              si.a(115, 38, 148, 2, new int[8], 0, 492);
              iv.field_g[0] = new ak(0);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (mq.a(8230, 25)) {
              si.a(115, 38, 148, 2, new int[8], 0, 492);
              iv.field_g[0] = new ak(0);
              break L5;
            } else {
              break L5;
            }
          }
          ut.field_j = param0;
          return;
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, byte param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        var5 = new byte[param1];
        var4 = var5;
        if (param3 <= 48) {
          field_n = null;
          la.a(param0, param2, var5, 0, param1);
          return var5;
        } else {
          la.a(param0, param2, var5, 0, param1);
          return var5;
        }
    }

    public static void d(int param0) {
        if (param0 != -20388) {
          field_q = null;
          field_q = null;
          field_p = null;
          field_n = null;
          return;
        } else {
          field_q = null;
          field_p = null;
          field_n = null;
          return;
        }
    }

    final static ne e(int param0) {
        ne var1 = null;
        if (param0 != 12768) {
          return null;
        } else {
          var1 = new ne(vf.field_d, li.field_u, er.field_h[0], av.field_C[0], vg.field_k[0], we.field_B[0], ag.field_d[0], iv.field_l);
          tl.a((byte) -20);
          return var1;
        }
    }

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var3 = 55 / ((25 - param0) / 42);
        if ((mp.field_a ^ -1) <= -11) {
          if (lf.b(-251)) {
            if (0 != jv.field_a) {
              od.a(-97, param1);
              return;
            } else {
              jv.a(false, (byte) -71, param2);
              um.a(0, 0, param1, (byte) 125);
              return;
            }
          } else {
            lk.b();
            kd.a(240, 320, 256);
            um.a(0, 0, param1, (byte) 125);
            return;
          }
        } else {
          L0: {
            var4 = 0;
            if (pt.field_a) {
              pt.field_a = false;
              var4 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          hh.a(true, bp.g(14296), bf.field_a, var4 != 0, dn.b(102));
          return;
        }
    }

    ad(int param0) {
        ((ad) this).field_m = new jaclib.memory.heap.NativeHeap(param0);
    }

    final void a(int param0) {
        if (param0 != -4009) {
            return;
        }
        ((ad) this).field_m.a();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 50;
        field_q = new int[8192];
        field_n = new gf();
        field_p = new mm();
    }
}
