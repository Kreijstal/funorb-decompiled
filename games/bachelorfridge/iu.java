/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iu extends at {
    private int field_k;
    static String field_l;
    private int field_j;

    final static gs a(int param0, byte param1, int param2, int param3) {
        boolean stackIn_46_0 = false;
        boolean stackIn_68_0 = false;
        boolean stackIn_75_0 = false;
        boolean stackIn_83_0 = false;
        boolean stackIn_87_0 = false;
        boolean stackIn_96_0 = false;
        boolean stackIn_100_0 = false;
        boolean stackIn_107_0 = false;
        boolean stackIn_111_0 = false;
        boolean stackIn_119_0 = false;
        boolean stackIn_123_0 = false;
        boolean stackIn_130_0 = false;
        boolean stackIn_134_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        gs var8_ref_gs;
        int var9;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        vr var14;
        gs var15;
        gs var16;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        int var8Lifetime3;
        int var9Lifetime3Lifetime1;
        var13 = BachelorFridge.field_y;
        var4 = null;
        af.field_b.field_vb.field_z.d(102);
        var5 = 0;
        var6 = 0;
        for (var7 = -1 + qs.field_n; 0 <= var7; var7--) {
          var8_ref_gs = kw.field_k[var7];
          var9 = 0;
          if (!hl.field_I &&
            on.field_t > var5) {
            var10_int = af.a(var8_ref_gs.field_p, 26291);
            if (var10_int <= var8_ref_gs.a((byte) 122) && (var8_ref_gs.field_i ||
              !bna.a((byte) 5, var8_ref_gs.field_g))) {
              var9 = 1;
            }
          }
          if (var9 == 0) {
            var8_ref_gs.field_h = null;
          } else {
            var5++;
            if (null == var8_ref_gs.field_h ||
              wia.field_e) {
              if (null == var8_ref_gs.field_h) {
                wma.field_b = wma.field_b + 1;
              }
              var10 = ah.a(var8_ref_gs, (byte) -118);
              var11 = var10 + po.c(var8_ref_gs.field_n);
              var12 = tc.a(false, var8_ref_gs);
              var8_ref_gs.field_h = new sna(0L, uc.field_l, var11);
              var8_ref_gs.field_h.field_jb = dc.field_r;
              var6 = var6 + param3;
              var8_ref_gs.field_h.field_ab = ((uc.field_l.field_ab & 16711422) >> 1) + var12 - (var12 >> 1 & 8355711);
              var8_ref_gs.field_h.field_gb = var12;
              var8_ref_gs.field_h.field_G = var12 + (-((16711423 & var12) >> 1) + (8355711 & uc.field_l.field_G >> 1));
            }
          }
        }
        if (param1 != 114) {
          var14 = (vr) null;
          iu.a(-40, (vr) null);
          var7Lifetime1 = 0;
          for (var8 = 0; qs.field_n > var8; var8++) {
            var15 = kw.field_k[var8];
            if (null != var15.field_h) {
              af.field_b.field_vb.a(-1, var15.field_h);
              var15.field_h.a(param3, 31407, var15.field_h.e(-1), param2, var7Lifetime1);
              if (0 != var15.field_h.field_R) {
                var4 = var15;
              }
              var7Lifetime1 = var7Lifetime1 + param3;
            }
          }
          var8Lifetime3 = var6 - (var7Lifetime1 - af.field_b.field_vb.field_p - af.field_b.field_vb.field_hb);
          af.field_b.field_vb.field_rb = af.field_b.field_vb.field_rb + var8Lifetime3;
          af.field_b.field_vb.field_p = af.field_b.field_vb.field_p - var8Lifetime3;
          if (wia.field_e) {
            af.field_b.field_vb.field_p = var7Lifetime1;
          }
          if (wia.field_e) {
            af.field_b.field_vb.field_I = 0;
            wia.field_e = false;
            qh.field_l = true;
            af.field_b.field_vb.field_rb = -af.field_b.field_vb.field_p + af.field_b.field_wb.field_p;
          }
          af.field_b.field_vb.field_hb = -af.field_b.field_vb.field_p + var7Lifetime1;
          if (lna.field_q &&
            bi.field_h != null) {
            qh.field_l = true;
          }
          var9Lifetime1 = -af.field_b.field_vb.field_hb - (af.field_b.field_vb.field_p - af.field_b.field_wb.field_p);
          if (qh.field_l) {
            af.field_b.field_vb.field_I = var9Lifetime1 - af.field_b.field_vb.field_rb;
          }
          af.field_b.a(true, 0, param3, param0 * param3 * 2);
          stackIn_46_0 = (var9Lifetime1 == af.field_b.field_vb.field_I + af.field_b.field_vb.field_rb);
          qh.field_l = stackIn_46_0;
          return (gs) (var4);
        }
        var7Lifetime2 = 0;
        for (var8Lifetime1 = 0; qs.field_n > var8Lifetime1; var8Lifetime1++) {
          var16 = kw.field_k[var8Lifetime1];
          if (null != var16.field_h) {
            af.field_b.field_vb.a(-1, var16.field_h);
            var16.field_h.a(param3, 31407, var16.field_h.e(-1), param2, var7Lifetime2);
            if (0 != var16.field_h.field_R) {
              var4 = var16;
            }
            var7Lifetime2 = var7Lifetime2 + param3;
          }
        }
        var8Lifetime2 = var6 - (var7Lifetime2 - af.field_b.field_vb.field_p - af.field_b.field_vb.field_hb);
        af.field_b.field_vb.field_rb = af.field_b.field_vb.field_rb + var8Lifetime2;
        af.field_b.field_vb.field_p = af.field_b.field_vb.field_p - var8Lifetime2;
        if (wia.field_e) {
          af.field_b.field_vb.field_p = var7Lifetime2;
          if (!wia.field_e) {
            af.field_b.field_vb.field_hb = -af.field_b.field_vb.field_p + var7Lifetime2;
            if (lna.field_q &&
              bi.field_h != null) {
              qh.field_l = true;
            }
            var9Lifetime2 = -af.field_b.field_vb.field_hb - (af.field_b.field_vb.field_p - af.field_b.field_wb.field_p);
            if (qh.field_l) {
              af.field_b.field_vb.field_I = var9Lifetime2 - af.field_b.field_vb.field_rb;
            }
            af.field_b.a(true, 0, param3, param0 * param3 * 2);
            stackIn_68_0 = (var9Lifetime2 == af.field_b.field_vb.field_I + af.field_b.field_vb.field_rb);
            qh.field_l = stackIn_68_0;
          } else {
            af.field_b.field_vb.field_I = 0;
            wia.field_e = false;
            qh.field_l = true;
            af.field_b.field_vb.field_rb = -af.field_b.field_vb.field_p + af.field_b.field_wb.field_p;
            af.field_b.field_vb.field_hb = -af.field_b.field_vb.field_p + var7Lifetime2;
            if (!lna.field_q) {
              var9Lifetime2 = -af.field_b.field_vb.field_hb - (af.field_b.field_vb.field_p - af.field_b.field_wb.field_p);
              if (qh.field_l) {
                af.field_b.field_vb.field_I = var9Lifetime2 - af.field_b.field_vb.field_rb;
              }
              af.field_b.a(true, 0, param3, param0 * param3 * 2);
              stackIn_75_0 = (var9Lifetime2 == af.field_b.field_vb.field_I + af.field_b.field_vb.field_rb);
              qh.field_l = stackIn_75_0;
            } else {
              if (bi.field_h != null) {
                qh.field_l = true;
              }
              var9Lifetime2 = -af.field_b.field_vb.field_hb - (af.field_b.field_vb.field_p - af.field_b.field_wb.field_p);
              if (!qh.field_l) {
                af.field_b.a(true, 0, param3, param0 * param3 * 2);
                stackIn_83_0 = (var9Lifetime2 == af.field_b.field_vb.field_I + af.field_b.field_vb.field_rb);
                qh.field_l = stackIn_83_0;
              } else {
                af.field_b.field_vb.field_I = var9Lifetime2 - af.field_b.field_vb.field_rb;
                af.field_b.a(true, 0, param3, param0 * param3 * 2);
                stackIn_87_0 = (var9Lifetime2 == af.field_b.field_vb.field_I + af.field_b.field_vb.field_rb);
                qh.field_l = stackIn_87_0;
              }
            }
          }
          return (gs) (var4);
        }
        if (!wia.field_e) {
          af.field_b.field_vb.field_hb = -af.field_b.field_vb.field_p + var7Lifetime2;
          if (lna.field_q) {
            if (bi.field_h == null) {
              var9Lifetime3 = -af.field_b.field_vb.field_hb - (af.field_b.field_vb.field_p - af.field_b.field_wb.field_p);
              if (!qh.field_l) {
                af.field_b.a(true, 0, param3, param0 * param3 * 2);
                stackIn_119_0 = (var9Lifetime3 == af.field_b.field_vb.field_I + af.field_b.field_vb.field_rb);
                qh.field_l = stackIn_119_0;
              } else {
                af.field_b.field_vb.field_I = var9Lifetime3 - af.field_b.field_vb.field_rb;
                af.field_b.a(true, 0, param3, param0 * param3 * 2);
                stackIn_123_0 = (var9Lifetime3 == af.field_b.field_vb.field_I + af.field_b.field_vb.field_rb);
                qh.field_l = stackIn_123_0;
              }
              return (gs) (var4);
            }
            qh.field_l = true;
          }
          var9Lifetime3Lifetime1 = -af.field_b.field_vb.field_hb - (af.field_b.field_vb.field_p - af.field_b.field_wb.field_p);
          if (!qh.field_l) {
            af.field_b.a(true, 0, param3, param0 * param3 * 2);
            stackIn_130_0 = (var9Lifetime3Lifetime1 == af.field_b.field_vb.field_I + af.field_b.field_vb.field_rb);
            qh.field_l = stackIn_130_0;
          } else {
            af.field_b.field_vb.field_I = var9Lifetime3Lifetime1 - af.field_b.field_vb.field_rb;
            af.field_b.a(true, 0, param3, param0 * param3 * 2);
            stackIn_134_0 = (var9Lifetime3Lifetime1 == af.field_b.field_vb.field_I + af.field_b.field_vb.field_rb);
            qh.field_l = stackIn_134_0;
          }
          return (gs) (var4);
        }
        af.field_b.field_vb.field_I = 0;
        wia.field_e = false;
        qh.field_l = true;
        af.field_b.field_vb.field_rb = -af.field_b.field_vb.field_p + af.field_b.field_wb.field_p;
        af.field_b.field_vb.field_hb = -af.field_b.field_vb.field_p + var7Lifetime2;
        if (lna.field_q) {
          if (bi.field_h == null) {
            var9Lifetime4 = -af.field_b.field_vb.field_hb - (af.field_b.field_vb.field_p - af.field_b.field_wb.field_p);
            if (!qh.field_l) {
              af.field_b.a(true, 0, param3, param0 * param3 * 2);
              stackIn_96_0 = (var9Lifetime4 == af.field_b.field_vb.field_I + af.field_b.field_vb.field_rb);
              qh.field_l = stackIn_96_0;
            } else {
              af.field_b.field_vb.field_I = var9Lifetime4 - af.field_b.field_vb.field_rb;
              af.field_b.a(true, 0, param3, param0 * param3 * 2);
              stackIn_100_0 = (var9Lifetime4 == af.field_b.field_vb.field_I + af.field_b.field_vb.field_rb);
              qh.field_l = stackIn_100_0;
            }
            return (gs) (var4);
          }
          qh.field_l = true;
        }
        var9Lifetime5 = -af.field_b.field_vb.field_hb - (af.field_b.field_vb.field_p - af.field_b.field_wb.field_p);
        if (!qh.field_l) {
          af.field_b.a(true, 0, param3, param0 * param3 * 2);
          stackIn_107_0 = (var9Lifetime5 == af.field_b.field_vb.field_I + af.field_b.field_vb.field_rb);
          qh.field_l = stackIn_107_0;
        } else {
          af.field_b.field_vb.field_I = var9Lifetime5 - af.field_b.field_vb.field_rb;
          af.field_b.a(true, 0, param3, param0 * param3 * 2);
          stackIn_111_0 = (var9Lifetime5 == af.field_b.field_vb.field_I + af.field_b.field_vb.field_rb);
          qh.field_l = stackIn_111_0;
        }
        return (gs) (var4);
    }

    final boolean c(byte param0) {
        jja.a(this.field_j, -1, this.field_k);
        int var2 = 27 % ((71 - param0) / 47);
        return true;
    }

    public static void e(int param0) {
        field_l = null;
        if (param0 != -15434) {
          vr var2 = (vr) null;
          iu.a(-126, (vr) null);
        }
    }

    final static void d(int param0) {
        mda.field_b.a(100 * jfa.field_q[baa.field_Q].field_d, 31407, 400, 105, 350);
        if (param0 > 6) {
          qm.field_d = new wl("foodlist", mda.field_b, bu.field_j, nha.field_e);
          qm.field_d.a(0, 155, false, 19, 298, 20, 406);
          return;
        }
        field_l = (String) null;
        qm.field_d = new wl("foodlist", mda.field_b, bu.field_j, nha.field_e);
        qm.field_d.a(0, 155, false, 19, 298, 20, 406);
    }

    final static void a(int param0, vr param1) {
        try {
          fi.field_p = param1.a((byte) 123, "minimal/fridge-view-bg.jpg", "");
          gla.field_j = new kv(fi.field_p, (java.awt.Component) ((Object) dca.field_y));
          if (param0 != -1638641311) {
            iu.d(-98);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "iu.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    iu(int param0) {
        this.field_j = 96;
        this.field_k = param0;
    }

    iu(int param0, int param1) {
        this.field_j = param1;
        this.field_k = param0;
    }

    static {
        field_l = "Public chat is unavailable while setting up a rated game.";
    }
}
