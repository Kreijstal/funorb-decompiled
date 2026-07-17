/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ve extends tf {
    volatile boolean field_p;
    static vn field_o;
    boolean field_n;
    boolean field_q;
    static qb[] field_t;
    static String field_r;
    static String field_s;
    static int field_m;

    final static void a(int param0, eg param1, int[] param2, ll[] param3, eg param4) {
        ll[] var5 = null;
        ll[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        lg var7 = null;
        kc var8 = null;
        kc var9 = null;
        kc var10 = null;
        kc var11 = null;
        qb[] var12 = null;
        qb[] var13 = null;
        qb[] var14 = null;
        kc var15 = null;
        qb[] var16 = null;
        qb[] var17 = null;
        int var18 = 0;
        int[] var19 = null;
        L0: {
          L1: {
            var18 = ArcanistsMulti.field_G ? 1 : 0;
            var5 = pk.a("lobby", 0, "crowns", param1);
            dg.field_u = var5.length;
            if (param3 != null) {
              var6 = new ll[param3.length + dg.field_u];
              var7_int = 0;
              L2: while (true) {
                if (var7_int >= dg.field_u) {
                  var5 = var6;
                  var7_int = 0;
                  L3: while (true) {
                    if (var7_int >= param3.length) {
                      var19 = new int[var5.length];
                      var6_array = var19;
                      var7_int = 0;
                      break L1;
                    } else {
                      var6[var7_int + dg.field_u] = param3[var7_int];
                      var7_int++;
                      continue L3;
                    }
                  }
                } else {
                  var6[var7_int] = var5[var7_int];
                  var7_int++;
                  continue L2;
                }
              }
            } else {
              var19 = new int[var5.length];
              var6_array = var19;
              var7_int = 0;
              if (dg.field_u <= var7_int) {
                break L0;
              } else {
                var19[var7_int] = 10;
                var7_int++;
                break L1;
              }
            }
          }
          L4: while (true) {
            if (dg.field_u <= var7_int) {
              break L0;
            } else {
              param2[var7_int] = 10;
              var7_int++;
              continue L4;
            }
          }
        }
        L5: {
          if (param3 != null) {
            if (param2 == null) {
              var7_int = 0;
              L6: while (true) {
                if (var7_int >= param3.length) {
                  break L5;
                } else {
                  var6_array[var7_int + dg.field_u] = param3[var7_int].field_k;
                  var7_int++;
                  continue L6;
                }
              }
            } else {
              var7_int = 0;
              L7: while (true) {
                if (var7_int >= param3.length) {
                  break L5;
                } else {
                  var6_array[var7_int + dg.field_u] = param2[var7_int];
                  var7_int++;
                  continue L7;
                }
              }
            }
          } else {
            break L5;
          }
        }
        ga.field_r = 15;
        dh.field_Gb = 4;
        mm.field_p = 2;
        oc.field_i = 11;
        ra.field_h = 2;
        var7 = rc.a(param4, -24755, "lobby", "largefont", param1);
        ea.field_w = rc.a(param4, -24755, "lobby", "generalfont", param1);
        th.field_k = rc.a(param4, -24755, "lobby", "chatfont", param1);
        var7.a((s[]) (Object) var5, var6_array);
        ea.field_w.a((s[]) (Object) var5, var6_array);
        th.field_k.a((s[]) (Object) var5, var6_array);
        var8 = new kc(0L, (kc) null);
        var8.field_z = ga.field_r;
        var8.field_ob = 16777215;
        var8.field_Z = (dj) (Object) var7;
        var8.field_gb = 1;
        var9 = var8;
        var9.field_X = 1;
        var10 = new kc(0L, (kc) null);
        var10.field_Z = (dj) (Object) ea.field_w;
        var10.field_ob = 16777215;
        var10.field_z = ga.field_r;
        var11 = var10;
        var10.field_gb = 1;
        var11.field_X = 1;
        wa.field_Pb = new kc(0L, var8);
        wa.field_Pb.field_v = ic.a(qe.a(param1, "heading", "lobby", 66), (byte) -86);
        md.field_b = new kc(0L, (kc) null);
        md.field_b.field_v = rb.a(false, false, 652, 4210752, 8421504, 120);
        hh.field_c = new kc(0L, (kc) null);
        hh.field_c.field_v = of.a(3, 114, 1, 1, 6316128, 6316128);
        ck.field_a = new kc(0L, (kc) null);
        ck.field_a.field_v = ic.a(qe.a(param1, "popup", "lobby", 69), (byte) -105);
        var12 = ic.a(qe.a(param1, "popup_mouseover", "lobby", 93), (byte) -105);
        var13 = qe.a(param1, "button", "lobby", 63);
        var14 = ic.a(qe.a(param1, "tab_active", "lobby", 110), (byte) -85);
        be.field_l = new kc(0L, var8);
        be.field_l.field_v = var14;
        wj.field_b = new kc(0L, (kc) null);
        wj.field_b.field_W = fj.a("lobby", -22612, param1, "closebutton");
        wj.field_b.field_lb = fj.a("lobby", -22612, param1, "closebutton_mouseover");
        dd.field_b = new kc(0L, var8);
        dd.field_b.field_v = rb.a(true, true, 652, 2039583, 3815994, 40);
        vf.field_u = new kc(0L, var10);
        vf.field_u.field_t = 2;
        vf.field_u.field_v = rb.a(true, false, 652, 2039583, 3815994, 30);
        rn.field_S = new kc(0L, var10);
        rn.field_S.field_t = 2;
        rn.field_S.field_v = rb.a(false, false, 652, 2039583, 3815994, 30);
        vf.field_i = new kc(0L, var10);
        vf.field_i.field_t = 2;
        vf.field_i.field_v = rb.a(false, true, 652, 2039583, 3815994, 30);
        pg.field_c = new kc(0L, (kc) null);
        pg.field_c.field_ob = 13421772;
        pg.field_c.field_Z = (dj) (Object) ea.field_w;
        pg.field_c.field_z = ga.field_r;
        pg.field_c.field_gb = 1;
        nj.field_d = new kc(0L, pg.field_c);
        nj.field_d.field_zb = 16777215;
        nj.field_d.field_eb = 16777215;
        nj.field_d.field_J = 16777215;
        nj.field_d.field_ob = 16764006;
        nj.field_d.field_sb = 8421504;
        var15 = new kc(0L, nj.field_d);
        var15.field_z = ga.field_r;
        var15.field_Z = (dj) (Object) var7;
        var15.field_ob = 16777215;
        j.field_f = new kc(0L, pg.field_c);
        j.field_f.field_v = rb.a(false, false, 652, 2236962, 2236962, 16);
        j.field_f.field_t = 2;
        mi.field_A = new kc(0L, pg.field_c);
        mi.field_A.field_v = rb.a(false, false, 652, 1513239, 1513239, 16);
        mi.field_A.field_t = 2;
        le.field_E = new kc(0L, j.field_f);
        le.field_E.a(nj.field_d, (byte) 118);
        qa.field_j = new kc(0L, mi.field_A);
        qa.field_j.a(nj.field_d, (byte) 119);
        var16 = qe.a(param1, "button_mouseover", "lobby", 91);
        ml.field_H = new pe(ck.field_a, var12, pg.field_c, nj.field_d, 3, 2, mm.field_p, 3, ga.field_r);
        rn.field_L = new kc(0L, nj.field_d);
        rn.field_L.field_Y = 1;
        rn.field_L.field_wb = 1;
        rn.field_L.field_v = var13;
        rn.field_L.field_S = 1;
        rn.field_L.field_ib = 1;
        rn.field_L.field_Ab = var16;
        rn.field_L.field_xb = qe.a(param1, "button_mouseheld", "lobby", 89);
        rn.field_L.field_hb = qe.a(param1, "button_active", "lobby", 62);
        rn.field_L.field_K = qe.a(param1, "button_disabled", "lobby", 117);
        rn.field_L.field_X = 1;
        ub.field_c = new kc(0L, nj.field_d);
        ub.field_c.field_X = 1;
        ub.field_c.field_v = ic.a(qe.a(param1, "tab_inactive", "lobby", 52), (byte) -124);
        ub.field_c.field_Ab = ic.a(qe.a(param1, "tab_mouseover", "lobby", 50), (byte) -99);
        ub.field_c.field_hb = var14;
        mn.field_t = new kc(0L, (kc) null);
        mn.field_t.field_v = of.a(3, 206, 1, -1, 1856141, 1127256);
        ia.field_a = new kc(0L, (kc) null);
        ia.field_a.field_v = of.a(3, 290, 1, -1, 11579568, 6052956);
        ko.field_h = new kc(0L, var15);
        ko.field_h.field_S = 1;
        ko.field_h.field_Y = 1;
        ko.field_h.field_wb = 1;
        ko.field_h.field_ib = 1;
        ko.field_h.field_X = 1;
        gn.field_c = new kc(0L, ko.field_h);
        hg.field_d = new kc(0L, nj.field_d);
        hg.field_d.field_ib = 1;
        hg.field_d.field_S = 1;
        hg.field_d.field_Y = 1;
        hg.field_d.field_X = 1;
        hg.field_d.field_wb = 1;
        ml.field_V = new kc(0L, hg.field_d);
        sl.field_S = new kc(0L, hg.field_d);
        th.field_c = new kc(0L, ko.field_h);
        ml.field_S = new kc(0L, hg.field_d);
        hh.field_d = new kc(0L, hg.field_d);
        nf.field_j = new kc(0L, hg.field_d);
        hg.field_d.field_v = ic.a(qe.a(param1, "smallbutton", "lobby", 45), (byte) -86);
        hg.field_d.field_Ab = ic.a(qe.a(param1, "smallbutton_mouseover", "lobby", 107), (byte) -94);
        qb[] dupTemp$4 = ic.a(qe.a(param1, "smallbutton_active", "lobby", 90), (byte) -104);
        hg.field_d.field_hb = dupTemp$4;
        hg.field_d.field_xb = dupTemp$4;
        hg.field_d.field_K = ic.a(qe.a(param1, "smallbutton_disabled", "lobby", 127), (byte) -117);
        gn.field_c.field_v = ic.a(qe.a(param1, "mediumbutton", "lobby", 57), (byte) -83);
        gn.field_c.field_Ab = ic.a(qe.a(param1, "mediumbutton_mouseover", "lobby", 89), (byte) -76);
        gn.field_c.field_xb = ic.a(qe.a(param1, "mediumbutton_mouseheld", "lobby", 44), (byte) -73);
        ko.field_h.field_v = ic.a(qe.a(param1, "bigbutton", "lobby", 106), (byte) -121);
        ko.field_h.field_Ab = ic.a(qe.a(param1, "bigbutton_mouseover", "lobby", 124), (byte) -95);
        ko.field_h.field_xb = ic.a(qe.a(param1, "bigbutton_mouseheld", "lobby", 61), (byte) -107);
        ko.field_h.field_K = ic.a(qe.a(param1, "bigbutton_disabled", "lobby", 112), (byte) -87);
        ml.field_V.field_v = ic.a(qe.a(param1, "greenbutton", "lobby", 94), (byte) -78);
        ml.field_V.field_Ab = ic.a(qe.a(param1, "greenbutton_mouseover", "lobby", 43), (byte) -79);
        ml.field_V.field_xb = ic.a(qe.a(param1, "greenbutton_mouseheld", "lobby", 50), (byte) -118);
        sl.field_S.field_v = ic.a(qe.a(param1, "redbutton", "lobby", 55), (byte) -93);
        sl.field_S.field_Ab = ic.a(qe.a(param1, "redbutton_mouseover", "lobby", 86), (byte) -109);
        sl.field_S.field_xb = ic.a(qe.a(param1, "redbutton_mouseheld", "lobby", 44), (byte) -115);
        th.field_c.field_v = ic.a(qe.a(param1, "backbutton", "lobby", 107), (byte) -82);
        th.field_c.field_Ab = ic.a(qe.a(param1, "backbutton_mouseover", "lobby", 107), (byte) -128);
        th.field_c.field_xb = ic.a(qe.a(param1, "backbutton_mouseheld", "lobby", 76), (byte) -102);
        th.field_c.field_K = ic.a(qe.a(param1, "backbutton_disabled", "lobby", 70), (byte) -113);
        nf.field_j.field_v = ic.a(qe.a(param1, "gameoptionbutton", "lobby", 84), (byte) -128);
        nf.field_j.field_Ab = ic.a(qe.a(param1, "gameoptionbutton_mouseover", "lobby", 67), (byte) -83);
        qb[] dupTemp$5 = ic.a(qe.a(param1, "gameoptionbutton_active", "lobby", 100), (byte) -93);
        nf.field_j.field_hb = dupTemp$5;
        nf.field_j.field_xb = dupTemp$5;
        nf.field_j.field_K = ic.a(qe.a(param1, "gameoptionbutton_disabled", "lobby", 93), (byte) -114);
        ml.field_S.field_v = ic.a(qe.a(param1, "chatbutton", "lobby", 120), (byte) -112);
        ml.field_S.field_Ab = ic.a(qe.a(param1, "chatbutton_mouseover", "lobby", 94), (byte) -115);
        qb[] dupTemp$6 = ic.a(qe.a(param1, "chatbutton_active", "lobby", 104), (byte) -128);
        ml.field_S.field_hb = dupTemp$6;
        ml.field_S.field_xb = dupTemp$6;
        hh.field_d.field_v = ic.a(qe.a(param1, "chatfilterbutton", "lobby", 127), (byte) -79);
        hh.field_d.field_Ab = ic.a(qe.a(param1, "chatfilterbutton_mouseover", "lobby", 47), (byte) -105);
        qb[] dupTemp$7 = ic.a(qe.a(param1, "chatfilterbutton_active", "lobby", 49), (byte) -100);
        hh.field_d.field_hb = dupTemp$7;
        hh.field_d.field_xb = dupTemp$7;
        var17 = qe.a(param1, "checkbox", "lobby", 63);
        ec.field_g = new af(0L, var17[1], var17[0], 1, nj.field_d, (String) null);
        qe.field_m = new kc(0L, (kc) null);
        qe.field_m.field_v = pm.a(115, fj.a("lobby", -22612, param1, "slideregion"));
        qe.field_m.field_Ab = pm.a(82, fj.a("lobby", -22612, param1, "slideregion_mouseover"));
        qe.field_m.field_xb = pm.a(77, fj.a("lobby", -22612, param1, "slideregion_mouseheld"));
        qe.field_m.field_K = pm.a(53, fj.a("lobby", -22612, param1, "slideregion_disabled"));
        be.field_b = new kc(0L, (kc) null);
        be.field_b.field_v = ic.a(qe.a(param1, "dragbar", "lobby", 113), (byte) -109);
        be.field_b.field_Ab = ic.a(qe.a(param1, "dragbar_mouseover", "lobby", 85), (byte) -120);
        be.field_b.field_xb = ic.a(qe.a(param1, "dragbar_mouseheld", "lobby", 73), (byte) -84);
        be.field_b.field_K = ic.a(qe.a(param1, "dragbar_disabled", "lobby", 64), (byte) -102);
        pi.field_d = new kc(0L, (kc) null);
        pi.field_d.field_W = fj.a("lobby", -22612, param1, "upbutton");
        pi.field_d.field_lb = fj.a("lobby", -22612, param1, "upbutton_mouseover");
        pi.field_d.field_vb = fj.a("lobby", -22612, param1, "upbutton_mouseheld");
        pi.field_d.field_R = fj.a("lobby", -22612, param1, "upbutton_disabled");
        db.field_b = new kc(0L, (kc) null);
        db.field_b.field_W = fj.a("lobby", -22612, param1, "downbutton");
        db.field_b.field_lb = fj.a("lobby", -22612, param1, "downbutton_mouseover");
        db.field_b.field_vb = fj.a("lobby", -22612, param1, "downbutton_mouseheld");
        db.field_b.field_R = fj.a("lobby", -22612, param1, "downbutton_disabled");
        vn.field_i = new in(0L, pi.field_d, db.field_b, qe.field_m, be.field_b);
        oh.field_r = new hb(0L, (kc) null, am.field_c, vn.field_i, hg.field_d, (String) null, (String) null);
    }

    final static void a(byte param0, int param1, int param2, int param3, dl param4, int param5, int param6, int param7, String param8) {
        try {
            ed.field_Hb = param2;
            ri.field_g = param4;
            hd.field_a = param6;
            ne.field_b = param5;
            ib.field_u = param1;
            ce.field_o = param7;
            qe.field_h = param3;
            jd.field_g = param8;
            jl.field_c = (lk) (Object) new ef();
            ed.field_yb = new pa(param4);
            mk.field_O = new gk(jl.field_c, ed.field_yb);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ve.B(" + -81 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 44 + param7 + 44 + (param8 != null ? "{...}" : "null") + 41);
        }
    }

    abstract int e(byte param0);

    abstract byte[] c(int param0);

    public static void d() {
        field_s = null;
        field_t = null;
        field_r = null;
        field_o = null;
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        if (null != db.field_a) {
            var3 = db.field_a.c(param1, (byte) 33);
            if (var3 != -2) {
                if (!(var3 == -1)) {
                    var4 = db.field_a.h((byte) 122) ? 1 : 0;
                    fn.a(118, var4 != 0, db.field_a.f((byte) 51), db.field_a.field_Fb, var3, param0);
                }
                db.field_a = null;
                oc.a(false);
            }
        }
        var3 = 66;
    }

    ve() {
        ((ve) this).field_p = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new vn();
        field_s = "<shad><col=<%0>>FLAME</col></shad>";
        field_r = "Offensive account name";
        field_m = -1;
    }
}
