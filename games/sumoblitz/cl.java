/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends nt {
    private int field_y;
    static int field_s;
    private int field_u;
    private ah field_x;
    static boolean field_w;
    private int field_t;
    static ri[] field_v;
    static int[] field_z;

    final void a(ha param0, int param1) {
        Object var4 = null;
        if (0 != ((cl) this).field_u) {
          im.field_a.a(((cl) this).field_x.field_C + ((cl) this).field_k >> -773596568, ((cl) this).field_x.field_z + ((cl) this).field_o >> -397087544, 0, ((cl) this).field_q - -(4 * ((cl) this).field_p << -1534313352), 1);
          if (param1 <= -121) {
            return;
          } else {
            var4 = null;
            ((cl) this).a((ha) null, 121);
            return;
          }
        } else {
          uc.field_a.a((float)(((cl) this).field_x.field_C + ((cl) this).field_k >> 870527304), (float)(((cl) this).field_o + ((cl) this).field_x.field_z >> -596657176), 1024, 0, 3, 16777215 - -(((cl) this).field_p * 4 << 328220824), 1);
          if (param1 <= -121) {
            return;
          } else {
            var4 = null;
            ((cl) this).a((ha) null, 121);
            return;
          }
        }
    }

    public static void f(int param0) {
        if (param0 != 4) {
            return;
        }
        field_z = null;
        field_v = null;
    }

    final static void e(int param0) {
        int var1 = 0;
        if (null != fn.field_u) {
          return;
        } else {
          fn.field_u = new String[34];
          fn.field_u[16] = vp.field_b;
          fn.field_u[1] = ll.field_c;
          fn.field_u[5] = rf.field_c;
          fn.field_u[11] = ov.field_d;
          fn.field_u[14] = kf.field_t;
          fn.field_u[6] = rf.field_c;
          fn.field_u[12] = ff.field_n;
          fn.field_u[7] = nj.field_e;
          fn.field_u[0] = k.field_a;
          fn.field_u[3] = cp.field_k;
          var1 = 56 % ((param0 - -26) / 42);
          fn.field_u[15] = go.field_o;
          fn.field_u[4] = ki.field_j;
          fn.field_u[2] = os.field_a;
          fn.field_u[13] = gu.field_h;
          fn.field_u[21] = hd.field_I;
          fn.field_u[25] = ea.field_b;
          fn.field_u[18] = gk.field_H;
          fn.field_u[10] = dj.field_r[2];
          fn.field_u[27] = ni.field_g;
          fn.field_u[23] = pt.field_b;
          fn.field_u[24] = nq.field_f;
          fn.field_u[17] = in.field_B;
          fn.field_u[28] = ss.field_a;
          fn.field_u[19] = dn.field_b;
          fn.field_u[22] = td.field_l;
          dt.field_i = new String[]{mn.field_k, bc.field_b};
          fn.field_u[33] = mm.field_d;
          fn.field_u[26] = lh.field_p;
          fn.field_u[9] = dj.field_r[1];
          fn.field_u[20] = nt.field_l;
          fn.field_u[32] = mm.field_d;
          fn.field_u[8] = dj.field_r[0];
          fn.field_u[29] = hv.field_a;
          fn.field_u[30] = ou.field_g;
          fn.field_u[31] = ls.field_l;
          return;
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == -2567) {
          if (-65 < (((cl) this).field_p ^ -1)) {
            ((cl) this).field_o = ((cl) this).field_o + ((cl) this).field_y;
            ((cl) this).field_k = ((cl) this).field_k + ((cl) this).field_t;
            ((cl) this).field_t = ((cl) this).field_t * 251 / 285;
            ((cl) this).field_y = ((cl) this).field_y * 251 / 285;
            if (0 <= ((cl) this).field_y) {
              ((cl) this).field_y = ((cl) this).field_y + 1;
              if (((cl) this).field_t < 0) {
                ((cl) this).field_t = ((cl) this).field_t - 1;
                return super.a(-2567);
              } else {
                ((cl) this).field_t = ((cl) this).field_t + 1;
                return super.a(-2567);
              }
            } else {
              ((cl) this).field_y = ((cl) this).field_y - 1;
              if (((cl) this).field_t < 0) {
                ((cl) this).field_t = ((cl) this).field_t - 1;
                return super.a(-2567);
              } else {
                ((cl) this).field_t = ((cl) this).field_t + 1;
                return super.a(-2567);
              }
            }
          } else {
            return super.a(-2567);
          }
        } else {
          field_z = null;
          if (-65 < (((cl) this).field_p ^ -1)) {
            ((cl) this).field_o = ((cl) this).field_o + ((cl) this).field_y;
            ((cl) this).field_k = ((cl) this).field_k + ((cl) this).field_t;
            ((cl) this).field_t = ((cl) this).field_t * 251 / 285;
            ((cl) this).field_y = ((cl) this).field_y * 251 / 285;
            if (0 <= ((cl) this).field_y) {
              ((cl) this).field_y = ((cl) this).field_y + 1;
              if (((cl) this).field_t < 0) {
                ((cl) this).field_t = ((cl) this).field_t - 1;
                return super.a(-2567);
              } else {
                ((cl) this).field_t = ((cl) this).field_t + 1;
                return super.a(-2567);
              }
            } else {
              ((cl) this).field_y = ((cl) this).field_y - 1;
              if (((cl) this).field_t < 0) {
                ((cl) this).field_t = ((cl) this).field_t - 1;
                return super.a(-2567);
              } else {
                ((cl) this).field_t = ((cl) this).field_t + 1;
                return super.a(-2567);
              }
            }
          } else {
            return super.a(-2567);
          }
        }
    }

    cl(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ah param7) {
        super(param0, param1, param2, param3);
        ((cl) this).field_u = param6;
        ((cl) this).field_t = param4;
        ((cl) this).field_x = param7;
        ((cl) this).field_y = param5;
    }

    final static void a(byte param0, lt param1, int param2) {
        int var4 = 0;
        pl var5 = null;
        var5 = as.field_v;
        var5.g(param2, param0 ^ -105);
        var5.field_p = var5.field_p + 1;
        var4 = var5.field_p;
        var5.b((byte) 84, 1);
        var5.b((byte) 103, param1.field_k);
        if (param0 != -97) {
          return;
        } else {
          var5.a(param1.field_o, (byte) -17);
          var5.e(48, param1.field_n);
          var5.e(48, param1.field_p);
          var5.e(48, param1.field_q);
          var5.e(48, param1.field_l);
          int discarded$1 = var5.a(var4, false);
          var5.c(var5.field_p + -var4, param0 + -13648);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new int[2];
    }
}
