/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends vd implements ok {
    private boolean field_y;
    static String field_v;
    private int field_x;
    private bi field_E;
    private int field_u;
    private String field_G;
    private int field_z;
    static boolean field_D;
    private String field_C;
    static ga field_B;
    private bi field_F;
    private int field_w;

    final void g(int param0) {
        ((jh) this).field_y = true;
        if (param0 < 80) {
            ((jh) this).e((byte) 91);
        }
    }

    public static void d(byte param0) {
        field_v = null;
        if (param0 < 74) {
            field_D = false;
            field_B = null;
            return;
        }
        field_B = null;
    }

    final boolean f(int param0) {
        if (param0 != 244874369) {
            ((jh) this).field_G = null;
            return ((jh) this).field_y;
        }
        return ((jh) this).field_y;
    }

    final void a(int param0) {
        int var2 = 0;
        var2 = 122 / ((param0 - 67) / 47);
        if (!((jh) this).field_s) {
          return;
        } else {
          if (!((jh) this).field_y) {
            if ((((jh) this).field_w ^ -1) == 0) {
              if (((jh) this).field_E == null) {
                if (null == ((jh) this).field_C) {
                  return;
                } else {
                  rs.field_Cb.c(((jh) this).field_C, ((jh) this).field_m / 2 + (1 + ((jh) this).field_k), rs.field_Cb.field_J / 2 + (((jh) this).field_i / 2 + ((jh) this).field_t), ((jh) this).field_x, -1);
                  return;
                }
              } else {
                L0: {
                  ((jh) this).field_E.f((-((jh) this).field_E.field_z + ((jh) this).field_m) / 2 + ((jh) this).field_k, (((jh) this).field_i - ((jh) this).field_E.field_w) / 2 + ((jh) this).field_t);
                  if (null != ((jh) this).field_C) {
                    rs.field_Cb.c(((jh) this).field_C, ((jh) this).field_m / 2 + (1 + ((jh) this).field_k), rs.field_Cb.field_J / 2 + (((jh) this).field_i / 2 + ((jh) this).field_t), ((jh) this).field_x, -1);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              }
            } else {
              gf.d(((jh) this).field_k, ((jh) this).field_t, ((jh) this).field_m, ((jh) this).field_i, ((jh) this).field_w);
              if (((jh) this).field_E != null) {
                L1: {
                  ((jh) this).field_E.f((-((jh) this).field_E.field_z + ((jh) this).field_m) / 2 + ((jh) this).field_k, (((jh) this).field_i - ((jh) this).field_E.field_w) / 2 + ((jh) this).field_t);
                  if (null != ((jh) this).field_C) {
                    rs.field_Cb.c(((jh) this).field_C, ((jh) this).field_m / 2 + (1 + ((jh) this).field_k), rs.field_Cb.field_J / 2 + (((jh) this).field_i / 2 + ((jh) this).field_t), ((jh) this).field_x, -1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  if (null != ((jh) this).field_C) {
                    rs.field_Cb.c(((jh) this).field_C, ((jh) this).field_m / 2 + (1 + ((jh) this).field_k), rs.field_Cb.field_J / 2 + (((jh) this).field_i / 2 + ((jh) this).field_t), ((jh) this).field_x, -1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            }
          } else {
            if (-1 == ((jh) this).field_z) {
              L3: {
                if (((jh) this).field_F != null) {
                  ((jh) this).field_F.f(((jh) this).field_k + (((jh) this).field_m - ((jh) this).field_F.field_z) / 2, (((jh) this).field_i - ((jh) this).field_F.field_w) / 2 + ((jh) this).field_t);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (((jh) this).field_G != null) {
                rs.field_Cb.c(((jh) this).field_G, ((jh) this).field_m / 2 + 1 + ((jh) this).field_k, rs.field_Cb.field_J / 2 + (((jh) this).field_i / 2 + ((jh) this).field_t), ((jh) this).field_u, -1);
                return;
              } else {
                return;
              }
            } else {
              L4: {
                gf.d(((jh) this).field_k, ((jh) this).field_t, ((jh) this).field_m, ((jh) this).field_i, ((jh) this).field_z);
                if (((jh) this).field_F != null) {
                  ((jh) this).field_F.f(((jh) this).field_k + (((jh) this).field_m - ((jh) this).field_F.field_z) / 2, (((jh) this).field_i - ((jh) this).field_F.field_w) / 2 + ((jh) this).field_t);
                  break L4;
                } else {
                  break L4;
                }
              }
              if (((jh) this).field_G == null) {
                return;
              } else {
                rs.field_Cb.c(((jh) this).field_G, ((jh) this).field_m / 2 + 1 + ((jh) this).field_k, rs.field_Cb.field_J / 2 + (((jh) this).field_i / 2 + ((jh) this).field_t), ((jh) this).field_u, -1);
                return;
              }
            }
          }
        }
    }

    final static void a(qr param0, qr param1, qr param2, qr param3, int param4) {
        String var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (ck.field_a != null) {
          return;
        } else {
          sr.field_h = false;
          if (!bg.field_g) {
            if (!ae.field_b) {
              var5 = sl.field_q;
              var7 = null;
              cq.a(-114, ho.field_c, (String) null, var5, 0);
              ck.field_a = uq.field_j;
              uq.field_j.field_ab = -(8355711 & ho.field_c >> -1797168255) + (ho.field_c + ((16711422 & bh.field_k.field_ab) >> 1097682401));
              uq.field_j.field_jb = -(8355711 & ho.field_c >> 244874369) + ho.field_c + ((bh.field_k.field_jb & 16711422) >> 1551899841);
              er.field_j = cg.field_C;
              uq.field_j.field_qb = -(ho.field_c >> 823471681 & 8355711) + ho.field_c - -(bh.field_k.field_qb >> 951529377 & 8355711);
              fa.field_X = new qr(0L, param1);
              mb.field_n = new qr(0L, param2);
              fe.field_w = new qr(0L, (qr) null);
              sg.field_Ab = new qr(0L, param3);
              uq.field_j = new qr((long)param4, param0);
              uq.field_j.field_nb = ho.field_f;
              sg.field_Ab.a(4, uq.field_j);
              cg.field_C = new qr(0L, er.field_j);
              sg.field_Ab.a(4, cg.field_C);
              hd.field_m = new qr(0L, bh.field_k, ld.field_n);
              cb.field_l = new qr(0L, bh.field_k);
              fa.field_X.a(4, mb.field_n);
              fa.field_X.a(4, fe.field_w);
              fe.field_w.a(4, sg.field_Ab);
              fe.field_w.a(param4 + 4, hd.field_m);
              fe.field_w.a(4, cb.field_l);
              return;
            } else {
              var5 = pg.field_E;
              var7 = null;
              cq.a(-114, ho.field_c, (String) null, var5, 0);
              ck.field_a = uq.field_j;
              uq.field_j.field_ab = -(8355711 & ho.field_c >> -1797168255) + (ho.field_c + ((16711422 & bh.field_k.field_ab) >> 1097682401));
              uq.field_j.field_jb = -(8355711 & ho.field_c >> 244874369) + ho.field_c + ((bh.field_k.field_jb & 16711422) >> 1551899841);
              er.field_j = cg.field_C;
              uq.field_j.field_qb = -(ho.field_c >> 823471681 & 8355711) + ho.field_c - -(bh.field_k.field_qb >> 951529377 & 8355711);
              fa.field_X = new qr(0L, param1);
              mb.field_n = new qr(0L, param2);
              fe.field_w = new qr(0L, (qr) null);
              sg.field_Ab = new qr(0L, param3);
              uq.field_j = new qr((long)param4, param0);
              uq.field_j.field_nb = ho.field_f;
              sg.field_Ab.a(4, uq.field_j);
              cg.field_C = new qr(0L, er.field_j);
              sg.field_Ab.a(4, cg.field_C);
              hd.field_m = new qr(0L, bh.field_k, ld.field_n);
              cb.field_l = new qr(0L, bh.field_k);
              fa.field_X.a(4, mb.field_n);
              fa.field_X.a(4, fe.field_w);
              fe.field_w.a(4, sg.field_Ab);
              fe.field_w.a(param4 + 4, hd.field_m);
              fe.field_w.a(4, cb.field_l);
              return;
            }
          } else {
            var5 = uh.field_d;
            var7 = null;
            cq.a(-114, ho.field_c, (String) null, var5, 0);
            ck.field_a = uq.field_j;
            uq.field_j.field_ab = -(8355711 & ho.field_c >> -1797168255) + (ho.field_c + ((16711422 & bh.field_k.field_ab) >> 1097682401));
            uq.field_j.field_jb = -(8355711 & ho.field_c >> 244874369) + ho.field_c + ((bh.field_k.field_jb & 16711422) >> 1551899841);
            er.field_j = cg.field_C;
            uq.field_j.field_qb = -(ho.field_c >> 823471681 & 8355711) + ho.field_c - -(bh.field_k.field_qb >> 951529377 & 8355711);
            fa.field_X = new qr(0L, param1);
            mb.field_n = new qr(0L, param2);
            fe.field_w = new qr(0L, (qr) null);
            sg.field_Ab = new qr(0L, param3);
            uq.field_j = new qr((long)param4, param0);
            uq.field_j.field_nb = ho.field_f;
            sg.field_Ab.a(4, uq.field_j);
            cg.field_C = new qr(0L, er.field_j);
            sg.field_Ab.a(4, cg.field_C);
            hd.field_m = new qr(0L, bh.field_k, ld.field_n);
            cb.field_l = new qr(0L, bh.field_k);
            fa.field_X.a(4, mb.field_n);
            fa.field_X.a(4, fe.field_w);
            fe.field_w.a(4, sg.field_Ab);
            fe.field_w.a(param4 + 4, hd.field_m);
            fe.field_w.a(4, cb.field_l);
            return;
          }
        }
    }

    jh(int param0, int param1, int param2, int param3, int param4, bi param5, String param6, int param7, int param8, bi param9, String param10, int param11) {
        super(param0, param1, param2, param3);
        ((jh) this).field_y = false;
        ((jh) this).field_u = param11;
        ((jh) this).field_z = param8;
        ((jh) this).field_E = param5;
        ((jh) this).field_G = param10;
        ((jh) this).field_F = param9;
        ((jh) this).field_x = param7;
        ((jh) this).field_w = param4;
        ((jh) this).field_C = param6;
    }

    final void e(byte param0) {
        ((jh) this).field_y = !((jh) this).field_y ? true : false;
        if (param0 <= 1) {
            field_B = null;
            return;
        }
    }

    final void d(boolean param0) {
        ((jh) this).field_y = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Loading extra data";
        field_D = false;
    }
}
