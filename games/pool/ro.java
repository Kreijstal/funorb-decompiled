/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro {
    private int field_t;
    int[] field_q;
    int[] field_j;
    private int field_b;
    private int field_n;
    int field_k;
    private int field_a;
    static String field_p;
    static boolean field_e;
    static String field_s;
    int field_m;
    private int field_u;
    static int[] field_d;
    private int field_l;
    int field_f;
    private int field_o;
    int[] field_h;
    byte field_r;
    int field_i;
    static String field_g;
    static int[][][] field_v;
    private int[] field_c;

    final static nj[] a(int param0, oq param1) {
        int var2 = 0;
        int var3 = 0;
        nj[] var4 = null;
        int var5 = 0;
        nj var6_ref = null;
        int var6 = 0;
        L0: {
          var2 = param1.e(8, 92);
          if (param0 == 24) {
            break L0;
          } else {
            field_s = null;
            break L0;
          }
        }
        if ((var2 ^ -1) >= -1) {
          var3 = param1.e(12, 82);
          var4 = new nj[var3];
          var5 = 0;
          L1: while (true) {
            if (var3 <= var5) {
              return var4;
            } else {
              if (!gk.a((byte) 118, param1)) {
                var6 = param1.e(fr.a(16, -1 + var5), 105);
                var4[var5] = var4[var6];
                var5++;
                continue L1;
              } else {
                var6_ref = new nj();
                int discarded$126 = param1.e(24, 22);
                int discarded$127 = param1.e(24, param0 + 38);
                var6_ref.field_a = param1.e(24, 28);
                int discarded$128 = param1.e(9, 44);
                int discarded$129 = param1.e(12, 104);
                int discarded$130 = param1.e(12, 125);
                int discarded$131 = param1.e(12, 99);
                var4[var5] = var6_ref;
                var5++;
                continue L1;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void b(int param0) {
        int[] var18 = null;
        int[] var14 = null;
        int[] var12 = null;
        int[] var10 = null;
        int[] var5 = null;
        int[] var1 = null;
        int[] var19 = null;
        int var3 = 0;
        int[] var20 = null;
        int[] var16 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var7 = null;
        int[] var21 = null;
        int var9 = 0;
        int var4 = Pool.field_O;
        if (!(!em.field_K)) {
            return;
        }
        if (!(null != ta.field_g)) {
            ta.field_g = bo.a(4, 47);
        }
        if (ta.field_g.field_s) {
            var18 = oa.field_g;
            var14 = var18;
            var12 = var14;
            var10 = var12;
            var5 = var10;
            var1 = var5;
            var19 = ta.field_g.field_l;
            for (var3 = 0; var3 < 8; var3++) {
                var5[var3] = md.a(var18[var3], var19[var3]);
            }
            var20 = hp.field_c;
            var16 = var20;
            var13 = var16;
            var11 = var13;
            var7 = var11;
            var1 = var7;
            var21 = ta.field_g.field_l;
            var9 = 0;
            var3 = var9;
            while (-9 < (var9 ^ -1)) {
                var7[var9] = rb.b(var20[var9], var21[var9] ^ -1);
                var9++;
            }
            em.field_K = true;
            ta.field_g = null;
        }
        if (param0 > -18) {
            return;
        }
        if (!em.field_K) {
        } else {
            kk.g(47);
            if (-19 != (ne.field_w ^ -1)) {
            } else {
                if (!oe.a(false, hp.field_c)) {
                    ne.field_w = 16;
                    fq.a(-3405, 16, sq.field_b, false);
                } else {
                    s.field_c[18].a(0, 0, false);
                }
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int[] param5) {
        L0: {
          param0 = param0 - param5[0];
          param1 = param1 - param5[2];
          param3 = param3 - param5[1];
          ((ro) this).field_u = param5[6] * param0 + (param3 * param5[7] - -(param1 * param5[8])) >> -1468954704;
          ((ro) this).field_n = param1 * param5[5] + param0 * param5[3] + param3 * param5[4] >> 1290904112;
          ((ro) this).field_a = param0 * param5[9] + (param3 * param5[10] - -(param5[11] * param1)) >> 1168039984;
          if (param4 == 120) {
            break L0;
          } else {
            ((ro) this).field_t = 28;
            break L0;
          }
        }
        L1: {
          ((ro) this).field_l = param2;
          if (((ro) this).field_a == 0) {
            break L1;
          } else {
            if (((ro) this).field_a == 1) {
              break L1;
            } else {
              ((ro) this).field_b = bb.a(((ro) this).field_a, ((ro) this).field_n, (byte) 99);
              ((ro) this).field_o = vd.a(((ro) this).field_a, (byte) 103, ((ro) this).field_u);
              ((ro) this).field_t = lo.a(((ro) this).field_l, ((ro) this).field_a, (byte) 123);
              break L1;
            }
          }
        }
        ((ro) this).field_k = 0;
        ((ro) this).field_i = 0;
    }

    final void a(ro param0, int param1) {
        int var3 = 0;
        ((ro) this).field_i = param0.field_f + ((ro) this).field_f;
        if (param1 != -16875) {
            ((ro) this).field_b = 105;
        }
        ((ro) this).field_k = param0.field_m + ((ro) this).field_m;
        if (0 == ((ro) this).field_i) {
            // if_icmpne L69
        } else {
            var3 = ke.a(false, ((ro) this).field_k * ((ro) this).field_k + ((ro) this).field_i * ((ro) this).field_i);
            if (var3 != 0) {
                ((ro) this).field_i = (((ro) this).field_i << 417255944) / var3;
                ((ro) this).field_k = (((ro) this).field_k << -1025675032) / var3;
            }
        }
    }

    final boolean b(ro param0, int param1) {
        if (param1 != 24) {
            Object var4 = null;
            boolean discarded$0 = ((ro) this).b((ro) null, -17);
        }
        return hk.a(99, param0.field_n, ((ro) this).field_n, param0.field_u, param0.field_a, ((ro) this).field_a, ((ro) this).field_u);
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 240) {
            ro.b(-41);
        }
        field_g = null;
        field_v = null;
        field_s = null;
        field_p = null;
    }

    final void a(byte param0, ro param1) {
        int var3 = 0;
        L0: {
          ((ro) this).field_q[0] = ((ro) this).field_n;
          ((ro) this).field_j[0] = ((ro) this).field_u;
          ((ro) this).field_c[0] = ((ro) this).field_a;
          ((ro) this).field_h[0] = ((ro) this).field_l;
          ((ro) this).field_q[1] = param1.field_n;
          ((ro) this).field_j[1] = param1.field_u;
          ((ro) this).field_c[1] = param1.field_a;
          ((ro) this).field_h[1] = param1.field_l;
          ((ro) this).field_r = ic.a(((ro) this).field_j, 0, ((ro) this).field_q, ((ro) this).field_h, ((ro) this).field_c, param0 + -56);
          if ((((ro) this).field_r & 15) == 0) {
            ((ro) this).field_q[0] = ((ro) this).field_b;
            ((ro) this).field_j[0] = ((ro) this).field_o;
            ((ro) this).field_h[0] = ((ro) this).field_t;
            break L0;
          } else {
            ((ro) this).field_q[0] = bb.a(((ro) this).field_c[0], ((ro) this).field_q[0], (byte) 99);
            ((ro) this).field_j[0] = vd.a(((ro) this).field_c[0], (byte) 69, ((ro) this).field_j[0]);
            ((ro) this).field_h[0] = lo.a(((ro) this).field_h[0], ((ro) this).field_c[0], (byte) 84);
            break L0;
          }
        }
        L1: {
          if ((((ro) this).field_r & 240) == 0) {
            ((ro) this).field_q[1] = param1.field_b;
            ((ro) this).field_j[1] = param1.field_o;
            ((ro) this).field_h[1] = param1.field_t;
            break L1;
          } else {
            ((ro) this).field_q[1] = bb.a(((ro) this).field_c[1], ((ro) this).field_q[1], (byte) 99);
            ((ro) this).field_j[1] = vd.a(((ro) this).field_c[1], (byte) 68, ((ro) this).field_j[1]);
            ((ro) this).field_h[1] = lo.a(((ro) this).field_h[1], ((ro) this).field_c[1], (byte) 83);
            break L1;
          }
        }
        L2: {
          ((ro) this).field_m = ((ro) this).field_j[1] - ((ro) this).field_j[0];
          if (param0 == 60) {
            break L2;
          } else {
            ((ro) this).field_c = null;
            break L2;
          }
        }
        L3: {
          L4: {
            ((ro) this).field_f = ((ro) this).field_q[1] - ((ro) this).field_q[0];
            if (0 != ((ro) this).field_f) {
              break L4;
            } else {
              if (-1 == (((ro) this).field_m ^ -1)) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          var3 = ke.a(false, ((ro) this).field_m * ((ro) this).field_m + ((ro) this).field_f * ((ro) this).field_f);
          if (var3 == 0) {
            break L3;
          } else {
            ((ro) this).field_m = (((ro) this).field_m << -1164665176) / var3;
            ((ro) this).field_f = (((ro) this).field_f << 1458958504) / var3;
            break L3;
          }
        }
    }

    ro() {
        ((ro) this).field_h = new int[2];
        ((ro) this).field_q = new int[2];
        ((ro) this).field_j = new int[2];
        ((ro) this).field_c = new int[2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Game full";
        field_g = "Reject <%0> from this game";
    }
}
