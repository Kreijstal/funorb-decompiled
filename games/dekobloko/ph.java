/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends ca {
    static String field_Bb;
    static String[] field_Eb;
    static ji field_Db;
    static String field_Hb;
    static ji field_Fb;
    static ck[] field_yb;
    static String field_Cb;
    static um field_xb;
    static boolean field_Ab;
    static String field_Gb;
    static String field_zb;

    final void c(ce param0, byte param1) {
        try {
          super.c(param0, (byte) 31);
          if (param1 < 10) {
            ph.n(39);
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ph.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean n(int param0) {
        if (param0 != -30146) {
          ph.a(false, -84, 71, true, false, false, false, -53, -127, 124);
          return v.field_d;
        }
        return v.field_d;
    }

    ph(ka param0, ce param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void m(byte param0) {
        field_Bb = null;
        field_Db = null;
        field_zb = null;
        field_Gb = null;
        field_xb = null;
        field_Fb = null;
        field_Eb = null;
        int var1 = -79 / ((-72 - param0) / 41);
        field_yb = null;
        field_Hb = null;
        field_Cb = null;
    }

    final static void a(int param0, int param1, boolean param2, boolean param3) {
        uc.a(param0, true, param3, param1);
        if (param2) {
          field_Gb = (String) null;
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, int param7, int param8, int param9) {
        int var11;
        var11 = client.field_A ? 1 : 0;
        if (param5) {
          vh.field_g = ea.field_t;
          hg.a(param5, -1843);
          if (param7 > ~lg.field_W) {
            qm.a(param4, param9, param5, (byte) -8);
          }
          tg.field_i.field_X = 1;
          tg.field_i.field_ub = fc.field_c.field_ub;
          if (bf.field_r > 0) {
            vg.a(param9, param4, param5, 48);
          }
          if (0 < tg.field_e) {
            mn.a(0, param6, param4, param5, param9);
          }
          if (dn.field_k &&
            cd.field_m.field_mc <= cd.field_m.field_rc) {
            gg.field_y.field_Hb = false;
            ec.field_k.field_Rb.field_Y = cb.field_k;
            gk.a(ec.field_k.field_Ob, true);
          } else {
            gg.field_y.field_Hb = true;
            ec.field_k.field_Rb.field_Y = null;
            cl.a(param1, -17339, param9, ec.field_k, param0);
          }
        } else {
          if (wj.field_Lb == hk.field_j &&
            vk.field_f == hk.field_i) {
            if (!param5) {
              vh.field_g = (-640 + wj.field_Lb) / 2;
              hg.a(param5, -1843);
              if (param7 > ~lg.field_W) {
                qm.a(param4, param9, param5, (byte) -8);
              }
              tg.field_i.field_X = 1;
              tg.field_i.field_ub = fc.field_c.field_ub;
              if (bf.field_r > 0) {
                vg.a(param9, param4, param5, 48);
              }
              if (0 < tg.field_e) {
                mn.a(0, param6, param4, param5, param9);
              }
              if (dn.field_k &&
                cd.field_m.field_mc <= cd.field_m.field_rc) {
                gg.field_y.field_Hb = false;
                ec.field_k.field_Rb.field_Y = cb.field_k;
                gk.a(ec.field_k.field_Ob, true);
              } else {
                gg.field_y.field_Hb = true;
                ec.field_k.field_Rb.field_Y = null;
                cl.a(param1, -17339, param9, ec.field_k, param0);
              }
            } else {
              vh.field_g = ea.field_t;
              hg.a(param5, -1843);
              if (param7 > ~lg.field_W) {
                qm.a(param4, param9, param5, (byte) -8);
              }
              tg.field_i.field_X = 1;
              tg.field_i.field_ub = fc.field_c.field_ub;
              if (bf.field_r > 0) {
                vg.a(param9, param4, param5, 48);
              }
              if (0 < tg.field_e) {
                mn.a(0, param6, param4, param5, param9);
              }
              if (dn.field_k &&
                cd.field_m.field_mc <= cd.field_m.field_rc) {
                gg.field_y.field_Hb = false;
                ec.field_k.field_Rb.field_Y = cb.field_k;
                gk.a(ec.field_k.field_Ob, true);
              } else {
                gg.field_y.field_Hb = true;
                ec.field_k.field_Rb.field_Y = null;
                cl.a(param1, -17339, param9, ec.field_k, param0);
              }
            }
            client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
            cl.a(param1, -17339, param9, tb.field_b, param0);
            oe.field_G = oe.field_G + 1;
            return;
          }
          if (hk.field_i == le.field_m.field_i &&
            le.field_m.field_g == hk.field_j) {
            if (cd.field_m == null) {
              if (g.field_N != null) {
                vb.a(true, -2);
                if (param5) {
                  vh.field_g = ea.field_t;
                } else {
                  vh.field_g = (-640 + wj.field_Lb) / 2;
                }
                hg.a(param5, -1843);
                if (param7 > ~lg.field_W) {
                  qm.a(param4, param9, param5, (byte) -8);
                }
                tg.field_i.field_X = 1;
                tg.field_i.field_ub = fc.field_c.field_ub;
                if (bf.field_r > 0) {
                  vg.a(param9, param4, param5, 48);
                }
                if (0 < tg.field_e) {
                  mn.a(0, param6, param4, param5, param9);
                }
                if (dn.field_k &&
                  cd.field_m.field_mc <= cd.field_m.field_rc) {
                  gg.field_y.field_Hb = false;
                  ec.field_k.field_Rb.field_Y = cb.field_k;
                  gk.a(ec.field_k.field_Ob, true);
                } else {
                  gg.field_y.field_Hb = true;
                  ec.field_k.field_Rb.field_Y = null;
                  cl.a(param1, -17339, param9, ec.field_k, param0);
                }
                client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                cl.a(param1, -17339, param9, tb.field_b, param0);
                oe.field_G = oe.field_G + 1;
                return;
              }
              mf.h(5);
            } else {
              vb.a(false, -2);
            }
          }
          if (!param5) {
            vh.field_g = (-640 + wj.field_Lb) / 2;
            hg.a(param5, -1843);
            if (param7 > ~lg.field_W) {
              qm.a(param4, param9, param5, (byte) -8);
            }
            tg.field_i.field_X = 1;
            tg.field_i.field_ub = fc.field_c.field_ub;
            if (bf.field_r > 0) {
              vg.a(param9, param4, param5, 48);
            }
            if (0 < tg.field_e) {
              mn.a(0, param6, param4, param5, param9);
            }
            if (dn.field_k &&
              cd.field_m.field_mc <= cd.field_m.field_rc) {
              gg.field_y.field_Hb = false;
              ec.field_k.field_Rb.field_Y = cb.field_k;
              gk.a(ec.field_k.field_Ob, true);
            } else {
              gg.field_y.field_Hb = true;
              ec.field_k.field_Rb.field_Y = null;
              cl.a(param1, -17339, param9, ec.field_k, param0);
            }
          } else {
            vh.field_g = ea.field_t;
            hg.a(param5, -1843);
            if (param7 > ~lg.field_W) {
              qm.a(param4, param9, param5, (byte) -8);
              tg.field_i.field_X = 1;
              tg.field_i.field_ub = fc.field_c.field_ub;
              if (bf.field_r > 0) {
                vg.a(param9, param4, param5, 48);
              }
              if (0 < tg.field_e) {
                mn.a(0, param6, param4, param5, param9);
              }
              if (dn.field_k &&
                cd.field_m.field_mc <= cd.field_m.field_rc) {
                gg.field_y.field_Hb = false;
                ec.field_k.field_Rb.field_Y = cb.field_k;
                gk.a(ec.field_k.field_Ob, true);
              } else {
                gg.field_y.field_Hb = true;
                ec.field_k.field_Rb.field_Y = null;
                cl.a(param1, -17339, param9, ec.field_k, param0);
              }
            } else {
              tg.field_i.field_X = 1;
              tg.field_i.field_ub = fc.field_c.field_ub;
              if (bf.field_r > 0) {
                vg.a(param9, param4, param5, 48);
              }
              if (0 < tg.field_e) {
                mn.a(0, param6, param4, param5, param9);
              }
              if (!dn.field_k) {
                gg.field_y.field_Hb = true;
                ec.field_k.field_Rb.field_Y = null;
                cl.a(param1, -17339, param9, ec.field_k, param0);
              } else {
                if (cd.field_m.field_mc <= cd.field_m.field_rc) {
                  gg.field_y.field_Hb = false;
                  ec.field_k.field_Rb.field_Y = cb.field_k;
                  gk.a(ec.field_k.field_Ob, true);
                } else {
                  gg.field_y.field_Hb = true;
                  ec.field_k.field_Rb.field_Y = null;
                  cl.a(param1, -17339, param9, ec.field_k, param0);
                }
              }
            }
          }
        }
        client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
        cl.a(param1, -17339, param9, tb.field_b, param0);
        oe.field_G = oe.field_G + 1;
    }

    static {
        field_Hb = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_Bb = "<%0> is already on your ignore list.";
        field_Ab = false;
        field_Cb = "\"I think it's shaping up quite nicely!\" - Ian T";
        field_Gb = "Deko Bloko";
        field_zb = "No adverts";
    }
}
