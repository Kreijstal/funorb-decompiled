/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl implements ug {
    private long field_l;
    static int[] field_g;
    private String field_d;
    private boolean field_c;
    float field_b;
    private boolean field_i;
    boolean field_n;
    private int field_o;
    static String field_k;
    private int field_a;
    private int field_p;
    private int field_f;
    private boolean field_j;
    private boolean field_m;
    private lo[] field_q;
    static String field_e;
    private dj field_h;
    private int[] field_r;

    final void b(int param0, int param1) {
        int var3 = 26 / ((-33 - param0) / 58);
        if (!(-2 != (param1 ^ -1))) {
            boolean discarded$0 = a.field_h.a(-1, "menusuk");
            boolean discarded$1 = ((tl) this).a(false, 12);
        }
    }

    final boolean a(int param0, int param1) {
        if (!(!bb.field_a[param1])) {
            return true;
        }
        ((tl) this).field_n = true;
        if (ul.field_b == (long)param0) {
            ul.field_b = pd.a(-22826);
        }
        if (!this.a(false, param1, param0 ^ 95)) {
            return false;
        }
        ul.field_b = 0L;
        ((tl) this).field_n = !((tl) this).c((byte) 126) ? true : false;
        bb.field_a[param1] = true;
        ep.c((byte) -50);
        return true;
    }

    public static void d(int param0) {
        int var1 = 56 / ((param0 - 0) / 50);
        field_e = null;
        field_k = null;
        field_g = null;
    }

    public final void b(int param0) {
        dj var3 = null;
        dj var4 = null;
        L0: {
          if (param0 >= 72) {
            break L0;
          } else {
            this.a(-0.6271905303001404f, 80, -50, -1.1520227193832397f);
            break L0;
          }
        }
        L1: {
          if (aa.field_f == null) {
            break L1;
          } else {
            gl.a(aa.field_f, 734);
            aa.field_f = null;
            ep.c((byte) -50);
            break L1;
          }
        }
        L2: {
          if (ng.field_e) {
            nl.field_p = mm.a(0, (byte) -113);
            gj.field_i = mm.a(1, (byte) -115);
            break L2;
          } else {
            break L2;
          }
        }
        a.field_h = pb.a(true, false, 2, true, 1);
        ZombieDawn.field_H = mm.a(3, (byte) -115);
        nm.field_e = pb.a(true, true, 8, true, 1);
        gm.field_h = pb.a(true, false, 4, true, 1);
        qn.field_i = pb.a(true, false, 5, true, 1);
        an.field_B = pb.a(true, false, 6, true, 1);
        ((tl) this).field_h = pb.a(true, false, 7, true, 1);
        bp.field_h = new jk(50);
        var4 = nl.field_p;
        var3 = gj.field_i;
        bp.field_h.a("basic", nb.field_o, el.field_m, var4, (byte) -84);
        bp.field_h.a("arialish12", nb.field_o, el.field_m, var4, (byte) -84);
        bp.field_h.a("arialish12", nb.field_o, el.field_m, var3, (byte) -84);
        bp.field_h.a((byte) -113, nm.field_e, ap.field_w, ea.field_d);
        bp.field_h.a(ao.field_I, qn.field_i, 1);
        bp.field_h.a(ao.field_I, gm.field_h, 1);
        bp.field_h.a(u.field_f, an.field_B, 1);
        bp.field_h.a(u.field_f, ((tl) this).field_h, 1);
        bp.field_h.a((byte) -98, ZombieDawn.field_H, ba.field_e, nd.field_d);
    }

    private final void c(int param0) {
        dj var3 = null;
        int var4_int = 0;
        float var4 = 0.0f;
        int var5_int = 0;
        IllegalArgumentException var5_ref_IllegalArgumentException = null;
        float var5 = 0.0f;
        IllegalArgumentException var6_ref_IllegalArgumentException = null;
        int var6 = 0;
        vn[] var7 = null;
        v[] var7_array = null;
        int var8 = 0;
        vn[] var8_ref_vn__ = null;
        int var9 = 0;
        vn var10 = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        ml var14 = null;
        dj var15 = null;
        v[] var16 = null;
        vn[] var17 = null;
        Object stackIn_86_0 = null;
        Object stackIn_87_0 = null;
        Object stackIn_88_0 = null;
        Object stackIn_89_0 = null;
        Object stackIn_90_0 = null;
        Object stackIn_91_0 = null;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_85_0 = null;
        Object stackOut_86_0 = null;
        Object stackOut_87_0 = null;
        Object stackOut_88_0 = null;
        Object stackOut_89_0 = null;
        Object stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        Object stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ZombieDawn.field_J;
                    oh.d((byte) -95);
                    var15 = nl.field_p;
                    var3 = gj.field_i;
                    if (param0 == 75) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    boolean discarded$6 = ((tl) this).a(60, -55);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (rm.field_f) {
                        statePc = 19;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (null != gm.field_h) {
                        statePc = 5;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 5: {
                    oh.d((byte) -111);
                    this.a(53.0f, 127, am.field_m);
                    ph.field_a = new ka(gm.field_h, qn.field_i);
                    var4_int = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (tc.field_t <= var4_int) {
                        statePc = 18;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (0 == tc.field_y[var4_int]) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var4_int++;
                    statePc = 6;
                    continue stateLoop;
                }
                case 9: {
                    var5_int = tc.field_s[var4_int];
                    if (-70 == var5_int) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (-69 == var5_int) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (47 == var5_int) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var4_int++;
                    statePc = 6;
                    continue stateLoop;
                }
                case 13: {
                    if (null == vb.field_D[var5_int]) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var4_int++;
                    statePc = 6;
                    continue stateLoop;
                }
                case 15: {
                    var13 = "sfx";
                    var14 = ml.a(gm.field_h, var13, tc.field_x[var4_int]);
                    if (var14 != null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                case 17: {
                    vb.field_D[tc.field_s[var4_int]] = var14.b();
                    var4_int++;
                    statePc = 6;
                    continue stateLoop;
                }
                case 18: {
                    rm.field_f = true;
                    ep.c((byte) -50);
                    return;
                }
                case 19: {
                    if (ti.field_a) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (null == qn.field_i) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ti.field_a = true;
                    ep.c((byte) -50);
                    return;
                }
                case 22: {
                    if (sa.field_T) {
                        statePc = 29;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (null == ((tl) this).field_h) {
                        statePc = 29;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.a(eo.field_h[15], e.field_I, 55.0f, false, 20.0f);
                    if (this.a("zombie dawn titlescreen", 0, 0)) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return;
                }
                case 26: {
                    if (this.a("zombie dawn instructions loop", 0, 9)) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    return;
                }
                case 28: {
                    sa.field_T = true;
                    this.a(0, 75.0f);
                    ep.c((byte) -50);
                    return;
                }
                case 29: {
                    if (!sa.field_T) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (eh.field_x) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (an.field_B == null) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    eh.field_x = true;
                    return;
                }
                case 33: {
                    if (null == nm.field_e) {
                        statePc = 47;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.a(800, ji.field_a, 75.0f, false, 3.0f);
                    if (ng.field_e) {
                        statePc = 46;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var4_int = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var4_int <= -9) {
                        statePc = 45;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var5_int = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (-7 <= var5_int) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    try {
                        cl.field_c[var4_int][var5_int] = nm.field_e.a(var5_int + ".zdl", param0 + -163, "" + var4_int + "/");
                        this.a(800, ji.field_a, 75.0f, false, 3.0f);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 41: {
                    var6_ref_IllegalArgumentException = (IllegalArgumentException) (Object) caughtException;
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 42: {
                    try {
                        cl.field_c[var4_int][6] = nm.field_e.a("BONUS.zdl", -110, "" + var4_int + "/");
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    var4_int++;
                    statePc = 36;
                    continue stateLoop;
                }
                case 44: {
                    var5_ref_IllegalArgumentException = (IllegalArgumentException) (Object) caughtException;
                    var4_int++;
                    statePc = 36;
                    continue stateLoop;
                }
                case 45: {
                    this.a(800, ji.field_a, 75.0f, false, 3.0f);
                    np.field_E = new vn(nm.field_e.a("map.jpg", param0 ^ -26, "jpg/"), (java.awt.Component) (Object) cj.field_d);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    nm.field_e = null;
                    this.a(param0 ^ 75, 78.0f);
                    ep.c((byte) -50);
                    return;
                }
                case 47: {
                    if (var15 != null) {
                        statePc = 49;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.a(78.0f, 127, dh.field_g);
                    pc.field_k = gb.a("", -1, var3, "arialish12", var15);
                    hf.field_E = vm.a((byte) -94, "locked", "basic", var15)[0];
                    wd.field_y = hf.field_E;
                    e.field_G = vm.a((byte) 126, "unachieved", "basic", var15)[0];
                    hm.field_E = gf.a(var15, "orbcoin", 8, "basic");
                    bd.a(hm.field_E, false);
                    if (be.field_j <= 0) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    lc.a(var15, var3, (byte) 80);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    gj.field_i = null;
                    nl.field_p = null;
                    ((tl) this).field_d = dh.field_g;
                    ep.c((byte) -50);
                    return;
                }
                case 53: {
                    if (r.field_F) {
                        statePc = 85;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (null != a.field_h) {
                        statePc = 56;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var4 = 80.0f;
                    var5 = 19.0f;
                    var6 = 29000;
                    this.a(var5, 0, var6, var4);
                    sg.field_jb = hf.a(ZombieDawn.field_H, "basic", "font", a.field_h, (byte) -70);
                    if (sg.field_jb != null) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    return;
                }
                case 58: {
                    b.field_j = ra.a(ZombieDawn.field_H, "basic", "font_title", 0, a.field_h);
                    bj.field_q = gb.a("font_medium", -1, ZombieDawn.field_H, "basic", a.field_h);
                    rg.a(bj.field_q, false);
                    tf.a((byte) 119);
                    if ((be.field_j ^ -1) < -1) {
                        statePc = 63;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var16 = dd.a("membersexpansion", "screenshots", -1864, a.field_h);
                    var7_array = var16;
                    if (var7_array == null) {
                        statePc = 61;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 61: {
                    return;
                }
                case 62: {
                    jp.field_c = new o((java.applet.Applet) (Object) sa.field_Y, qc.field_b, var16, false, kl.field_o);
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    this.a(var5, 0, var6, var4);
                    qk.field_Hb[0] = gf.a(a.field_h, "background1", 8, "basic");
                    qk.field_Hb[1] = gf.a(a.field_h, "background2", 8, "basic");
                    qk.field_Hb[2] = gf.a(a.field_h, "background3", 8, "basic");
                    qk.field_Hb[3] = gf.a(a.field_h, "background4", 8, "basic");
                    qk.field_Hb[4] = gf.a(a.field_h, "background5", 8, "basic");
                    this.a(var5, 0, var6, var4);
                    lo.field_i = gf.a(a.field_h, "menu_pipe1", 8, "basic");
                    mo.field_a = gf.a(a.field_h, "menu_pipe2", 8, "basic");
                    hk.field_H = gf.a(a.field_h, "menu_pipebox", 8, "basic");
                    pf.field_f = gf.a(a.field_h, "menu_pipebox2", 8, "basic");
                    ql.field_g = gf.a(a.field_h, "menu_title", 8, "basic");
                    fb.field_w = vm.a((byte) 113, "menu_risinghands", "basic", a.field_h);
                    cn.field_a = vm.a((byte) 110, "menu_hand", "basic", a.field_h);
                    lb.field_eb = vm.a((byte) 120, "engine_icons", "basic", a.field_h);
                    ch.field_a = gf.a(a.field_h, "frameh", 8, "basic");
                    hi.field_x = gf.a(a.field_h, "framev", 8, "basic");
                    vo.field_a = vm.a((byte) -8, "framecorners", "basic", a.field_h);
                    this.a(var5, 0, var6, var4);
                    ad.field_g[0] = vm.a((byte) -53, "character_zombie0", "basic", a.field_h);
                    ad.field_g[1] = vm.a((byte) -15, "character_zombie1", "basic", a.field_h);
                    bd.field_i[0] = vm.a((byte) -50, "levelselect_icons", "basic", a.field_h);
                    jo.field_Tb[0] = vm.a((byte) 125, "levelselect_icons_alt", "basic", a.field_h);
                    af.field_d = gf.a(a.field_h, "levelselect_arrow", 8, "basic");
                    dc.field_a[0] = gf.a(a.field_h, "levelselect", 8, "basic");
                    nc.field_k = gf.a(a.field_h, "pipeframe_levelselect", param0 + -67, "basic");
                    ah.field_tb = af.field_d;
                    kb.field_i = vm.a((byte) -18, "powerups", "basic", a.field_h);
                    nb.field_k = vm.a((byte) 127, "character_common", "basic", a.field_h);
                    tp.a(vm.a((byte) -120, "hud", "basic", a.field_h), -10);
                    w.a(vm.a((byte) 125, "popup", "basic", a.field_h), (byte) -97);
                    this.a(var5, 0, var6, var4);
                    le.field_a = vm.a((byte) -124, "instructions_controls", "basic", a.field_h);
                    qn.field_k = vm.a((byte) -42, "instructions_survivors", "basic", a.field_h);
                    l.field_b = vm.a((byte) 2, "instructions_zombies", "basic", a.field_h);
                    this.a(var5, 0, var6, var4);
                    vn[] discarded$7 = bj.a("basic", -118, a.field_h, "frame");
                    ca.field_b = bj.a("basic", -122, a.field_h, "button_frame");
                    ti.field_c = bj.a("basic", param0 + -201, a.field_h, "button_raised");
                    vn[] discarded$8 = bj.a("basic", -120, a.field_h, "button_depressed");
                    jb.field_a = vm.a((byte) -104, "pin_flags", "basic", a.field_h);
                    this.a(var5, param0 + -75, var6, var4);
                    ed.field_a = new vn[32];
                    var17 = vm.a((byte) 126, "all_achievements", "basic", a.field_h);
                    var7 = var17;
                    var8 = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if ((var8 ^ -1) <= -33) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    ed.field_a[var8] = var17[var8];
                    var8++;
                    statePc = 64;
                    continue stateLoop;
                }
                case 66: {
                    this.a(var5, 0, var6, var4);
                    ((tl) this).field_n = true;
                    if (!((tl) this).a(0, 11)) {
                        statePc = 68;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 68: {
                    return;
                }
                case 69: {
                    if (be.field_j > 0) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (-3 >= (lo.field_j ^ -1)) {
                        statePc = 72;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 72: {
                    ((tl) this).field_n = true;
                    if (!((tl) this).a(0, 12)) {
                        statePc = 74;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 74: {
                    return;
                }
                case 75: {
                    this.a(var5, 0, var6, var4);
                    var8_ref_vn__ = var17;
                    var9 = 0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    if (var9 >= var8_ref_vn__.length) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var10 = var8_ref_vn__[var9];
                    bd.a(var10, false);
                    var9++;
                    statePc = 76;
                    continue stateLoop;
                }
                case 78: {
                    bd.a(e.field_G, false);
                    ed.field_b = new vn[f.field_j.length];
                    var12 = 0;
                    var8 = var12;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (var12 >= ed.field_b.length) {
                        statePc = 84;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (null != f.field_j[var12]) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var12++;
                    statePc = 79;
                    continue stateLoop;
                }
                case 82: {
                    ed.field_b[var12] = sn.a(var12, 1.0, (byte) -110);
                    var12++;
                    statePc = 79;
                    continue stateLoop;
                }
                case 84: {
                    ZombieDawn.field_H = null;
                    r.field_F = true;
                    this.a(0, var5 + var4);
                    ep.c((byte) -50);
                    return;
                }
                case 85: {
                    stackOut_85_0 = this;
                    stackIn_91_0 = stackOut_85_0;
                    stackIn_86_0 = stackOut_85_0;
                    if (!r.field_F) {
                        statePc = 91;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    stackOut_86_0 = this;
                    stackIn_91_0 = stackOut_86_0;
                    stackIn_87_0 = stackOut_86_0;
                    if (!rm.field_f) {
                        statePc = 91;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    stackOut_87_0 = this;
                    stackIn_91_0 = stackOut_87_0;
                    stackIn_88_0 = stackOut_87_0;
                    if (!sa.field_T) {
                        statePc = 91;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    stackOut_88_0 = this;
                    stackIn_91_0 = stackOut_88_0;
                    stackIn_89_0 = stackOut_88_0;
                    if (!eh.field_x) {
                        statePc = 91;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    stackOut_89_0 = this;
                    stackIn_91_0 = stackOut_89_0;
                    stackIn_90_0 = stackOut_89_0;
                    if (!ti.field_a) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    stackOut_90_0 = this;
                    stackOut_90_1 = 1;
                    stackIn_92_0 = stackOut_90_0;
                    stackIn_92_1 = stackOut_90_1;
                    statePc = 92;
                    continue stateLoop;
                }
                case 91: {
                    stackOut_91_0 = this;
                    stackOut_91_1 = 0;
                    stackIn_92_0 = stackOut_91_0;
                    stackIn_92_1 = stackOut_91_1;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    ((tl) this).field_j = stackIn_92_1 != 0;
                    if (((tl) this).field_j) {
                        statePc = 94;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 94: {
                    this.a(99.0f, 126, jh.field_l);
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0, int param1) {
        int var3 = 6 % ((param0 - 55) / 45);
        boolean discarded$0 = this.a(true, param1, 70);
        bb.field_a[param1] = false;
    }

    public final boolean a(byte param0) {
        int stackIn_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        L0: {
          if (!((tl) this).field_i) {
            if (!((tl) this).field_c) {
              if (this.b((byte) -110)) {
                ((tl) this).field_c = true;
                break L0;
              } else {
                if (((tl) this).field_c) {
                  break L0;
                } else {
                  if (!this.b((byte) -110)) {
                    break L0;
                  } else {
                    ((tl) this).field_c = true;
                    break L0;
                  }
                }
              }
            } else {
              if (((tl) this).field_c) {
                break L0;
              } else {
                if (!this.b((byte) -110)) {
                  break L0;
                } else {
                  ((tl) this).field_c = true;
                  break L0;
                }
              }
            }
          } else {
            if (((tl) this).field_c) {
              break L0;
            } else {
              if (!this.b((byte) -110)) {
                break L0;
              } else {
                ((tl) this).field_c = true;
                break L0;
              }
            }
          }
        }
        L1: {
          if (((tl) this).field_m) {
            break L1;
          } else {
            if (!((tl) this).field_i) {
              break L1;
            } else {
              if (!mm.a(true)) {
                break L1;
              } else {
                ((tl) this).field_m = true;
                break L1;
              }
            }
          }
        }
        L2: {
          if (param0 == 19) {
            break L2;
          } else {
            this.c(59);
            break L2;
          }
        }
        L3: {
          L4: {
            if (!((tl) this).field_i) {
              break L4;
            } else {
              if (!((tl) this).field_c) {
                break L4;
              } else {
                if (!((tl) this).field_m) {
                  break L4;
                } else {
                  stackOut_23_0 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  break L3;
                }
              }
            }
          }
          stackOut_24_0 = 0;
          stackIn_25_0 = stackOut_24_0;
          break L3;
        }
        return stackIn_25_0 != 0;
    }

    final boolean c(byte param0) {
        if (param0 < 84) {
            ((tl) this).b(102);
        }
        return (((tl) this).field_f ^ -1) == -1 ? true : false;
    }

    private final boolean a(String param0, int param1, int param2) {
        IllegalArgumentException var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null == w.field_a[param2]) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 2: {
                    ((tl) this).field_d = e.field_I;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        w.field_a[param2] = wj.a(((tl) this).field_h, param0, "");
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return false;
                }
                case 5: {
                    var4 = (IllegalArgumentException) (Object) caughtException;
                    throw var4;
                }
                case 6: {
                    if (cc.field_c[param2]) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((tl) this).field_d = d.field_c;
                    cc.field_c[param2] = uh.field_o.a(w.field_a[param2], (byte) 20, an.field_B, 88200, ph.field_a);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (param1 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((tl) this).field_p = 29;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    return cc.field_c[param2];
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(float param0, int param1, int param2, float param3) {
        if (param1 != 0) {
            return;
        }
        this.a(param2, (String) null, param3, false, param0);
    }

    private final void a(float param0, int param1, String param2) {
        ((tl) this).field_b = Math.min(100.0f, Math.max(0.0f, param0));
        if (param2 == null) {
            // if_acmpne L45
            ((tl) this).field_d = jh.field_l;
        } else {
            ((tl) this).field_d = param2;
        }
        eh.a(((tl) this).field_d, ((tl) this).field_b, -1);
        if (param1 <= 122) {
            boolean discarded$0 = this.b((byte) 10);
        }
        sa.field_Y.c((byte) 81);
    }

    private final boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          if (null == ((tl) this).field_q) {
            ((tl) this).field_q = new lo[2];
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                break L0;
              } else {
                ((tl) this).field_q[var2] = m.a((byte) -119, 1, 5, var2);
                var2++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 == -110) {
            break L2;
          } else {
            ((tl) this).field_b = -1.1267826557159424f;
            break L2;
          }
        }
        var2 = 1;
        var3 = 0;
        L3: while (true) {
          if (-3 >= (var3 ^ -1)) {
            return var2 != 0;
          } else {
            if (null != ((tl) this).field_q[var3]) {
              if (((tl) this).field_q[var3].field_h) {
                L4: {
                  if (((tl) this).field_q[var3].field_o[0] <= to.field_b[var3]) {
                    break L4;
                  } else {
                    to.field_b[var3] = ((tl) this).field_q[var3].field_o[0];
                    break L4;
                  }
                }
                if (be.field_j <= 0) {
                  if (0 < var3) {
                    to.field_b[var3] = 0;
                    ((tl) this).field_q[var3] = null;
                    var3++;
                    continue L3;
                  } else {
                    ((tl) this).field_q[var3] = null;
                    var3++;
                    continue L3;
                  }
                } else {
                  var3++;
                  continue L3;
                }
              } else {
                var2 = 0;
                var3++;
                continue L3;
              }
            } else {
              var3++;
              continue L3;
            }
          }
        }
    }

    final boolean a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        if (!(!bb.field_a[param1])) {
            return false;
        }
        if (param0) {
            ((tl) this).field_h = null;
        }
        for (var3 = 0; ((tl) this).field_f > var3; var3++) {
            if (param1 == ((tl) this).field_r[var3]) {
                return false;
            }
        }
        ((tl) this).field_f = ((tl) this).field_f + 1;
        ((tl) this).field_r[((tl) this).field_f] = param1;
        ((tl) this).field_p = ((tl) this).field_p + eo.field_h[param1];
        return true;
    }

    private final void a(int param0, String param1, float param2, boolean param3, float param4) {
        if (param3) {
            return;
        }
        if (!(0L != vj.field_n)) {
            vj.field_n = pd.a(-22826);
            ap.field_m = pd.a(-22826);
        }
        long var6 = pd.a(-22826);
        long var8 = var6 - ap.field_m;
        vj.field_n = var6;
        float var10 = (float)var8 / (float)param0;
        var10 = Math.min(Math.max(var10, 0.0f), 1.0f);
        float var11 = param2 + var10 * param4;
        this.a(var11, 124, param1);
    }

    public final boolean a(boolean param0) {
        ac.c(-32435);
        if (!((tl) this).field_j) {
            this.c(75);
            return false;
        }
        if (param0) {
            Object var3 = null;
            boolean discarded$0 = this.a((String) null, 113, -12);
        }
        ep.c((byte) -50);
        return true;
    }

    public final void a(int param0) {
        sa.field_Y.g(false);
        if (param0 != 22833) {
            ((tl) this).b(-52);
        }
        pm.a(gj.field_f, bd.field_f, ro.field_b, ui.field_d, sm.field_c, lc.field_h, a.field_m, 0, ca.field_b, hn.field_l, ti.field_c, (rb) (Object) sg.field_jb, ca.field_b, (byte) -63, 0);
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var4_long = 0L;
        int var6 = 0;
        L0: {
          var6 = ZombieDawn.field_J;
          if (0 < ((tl) this).field_f) {
            L1: {
              ((tl) this).field_n = true;
              var2 = ((tl) this).field_r[0];
              if (((tl) this).field_a != 0) {
                break L1;
              } else {
                ((tl) this).field_a = ((tl) this).field_p;
                ((tl) this).field_l = pd.a(-22826);
                this.a(0.0f, 127, (String) null);
                break L1;
              }
            }
            L2: {
              if (((tl) this).field_o == 0) {
                ((tl) this).field_o = eo.field_h[var2];
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var3 = ((tl) this).field_p;
              if (((tl) this).field_o >= eo.field_h[var2]) {
                break L3;
              } else {
                var3 = var3 + (((tl) this).field_o - eo.field_h[var2]);
                break L3;
              }
            }
            this.a((-((float)var3 / (float)((tl) this).field_a) + 1.0f) * 100.0f, 127, (String) null);
            if (((tl) this).a(0, var2)) {
              ((tl) this).field_p = ((tl) this).field_p - eo.field_h[var2];
              var4 = 0;
              L4: while (true) {
                if (var4 >= -1 + ((tl) this).field_f) {
                  ((tl) this).field_f = ((tl) this).field_f - 1;
                  ((tl) this).field_o = 0;
                  if ((((tl) this).field_f ^ -1) >= -1) {
                    ((tl) this).field_n = false;
                    ((tl) this).field_a = 0;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  ((tl) this).field_r[var4] = ((tl) this).field_r[var4 - -1];
                  var4++;
                  continue L4;
                }
              }
            } else {
              L5: {
                var4_long = pd.a(-22826);
                ((tl) this).field_o = (int)((long)((tl) this).field_o - (var4_long - ((tl) this).field_l));
                if (-2 < (((tl) this).field_o ^ -1)) {
                  ((tl) this).field_o = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              ((tl) this).field_l = var4_long;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L6: {
          if (param0 > 37) {
            break L6;
          } else {
            tl.d(2);
            break L6;
          }
        }
    }

    private final void a(int param0, float param1) {
        ap.field_m = 0L;
        vj.field_n = (long)param0;
        this.a(param1, param0 ^ 125, ((tl) this).field_d);
    }

    private final boolean a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        String var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        String var7_ref = null;
        IllegalArgumentException var8 = null;
        ml var8_ref = null;
        int var9 = 0;
        mb var10 = null;
        ml var11 = null;
        String var12 = null;
        String stackIn_10_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_56_0 = 0;
        String stackIn_107_0 = null;
        int stackIn_116_0 = 0;
        String stackOut_8_0 = null;
        String stackOut_9_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_55_0 = 0;
        String stackOut_105_0 = null;
        String stackOut_106_0 = null;
        int stackOut_114_0 = 0;
        int stackOut_115_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawn.field_J;
                    var4 = 12 % ((param2 - -2) / 56);
                    if (param0) {
                        statePc = 24;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var5 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (tc.field_t <= var5) {
                        statePc = 24;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var6 = tc.field_s[var5];
                    if (vb.field_D[var6] == null) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var5++;
                    statePc = 2;
                    continue stateLoop;
                }
                case 5: {
                    if (param1 == tc.field_w[var5]) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5++;
                    statePc = 2;
                    continue stateLoop;
                }
                case 7: {
                    if (1 == tk.a(param1, 101)) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = "sfx";
                    stackIn_10_0 = stackOut_8_0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = "uk";
                    stackIn_10_0 = stackOut_9_0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var7_ref = stackIn_10_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        if (-1 == (tc.field_y[var5] ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10 = mb.a(qn.field_i, var7_ref, tc.field_x[var5]);
                        var8_ref = (ml) (Object) var10;
                        if (var8_ref == null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        boolean discarded$5 = qn.field_i.a(-1, var7_ref);
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    try {
                        vb.field_D[tc.field_s[var5]] = var10.b();
                        var5++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var11 = ml.a(gm.field_h, var7_ref, tc.field_x[var5]);
                        var8_ref = var11;
                        if (var8_ref != null) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        boolean discarded$6 = gm.field_h.a(-1, var7_ref);
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    try {
                        vb.field_D[tc.field_s[var5]] = var11.b();
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    var5++;
                    statePc = 2;
                    continue stateLoop;
                }
                case 22: {
                    var8 = (IllegalArgumentException) (Object) caughtException;
                    throw var8;
                }
                case 24: {
                    var7 = param1;
                    if (13 == var7) {
                        statePc = 42;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if ((var7 ^ -1) == -15) {
                        statePc = 74;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var7 != -11) {
                        statePc = 28;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (-5 != var7) {
                        statePc = 30;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var7 == -2) {
                        statePc = 102;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var7 == 2) {
                        statePc = 102;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (15 == var7) {
                        statePc = 102;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (7 != var7) {
                        statePc = 35;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (-6 == var7) {
                        statePc = 102;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (8 == var7) {
                        statePc = 94;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var7 != 6) {
                        statePc = 39;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var7 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (12 != var7) {
                        statePc = 102;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ((tl) this).field_d = dh.field_g;
                    if (!param0) {
                        statePc = 53;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var7 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (ld.field_l.length <= var7) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    ld.field_l[var7] = null;
                    var7++;
                    statePc = 44;
                    continue stateLoop;
                }
                case 46: {
                    var7 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (ad.field_g.length <= var7) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    ad.field_g[var7] = null;
                    var7++;
                    statePc = 47;
                    continue stateLoop;
                }
                case 49: {
                    var7 = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (w.field_a.length <= var7) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    w.field_a[var7] = null;
                    var7++;
                    statePc = 50;
                    continue stateLoop;
                }
                case 52: {
                    return true;
                }
                case 53: {
                    if (!fj.a(0, 117)) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    stackOut_54_0 = 1;
                    stackIn_56_0 = stackOut_54_0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 55: {
                    stackOut_55_0 = 0;
                    stackIn_56_0 = stackOut_55_0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var6 = stackIn_56_0;
                    var5_ref = "game";
                    ld.field_l[0] = vm.a((byte) 108, "character_human0", "game", a.field_h);
                    if (var6 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var5_ref = "halloween";
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    ld.field_l[1] = vm.a((byte) -4, "character_human1", var5_ref, a.field_h);
                    if (null == ld.field_l[0]) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (null != ld.field_l[1]) {
                        statePc = 67;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (null == ld.field_l[0]) {
                        statePc = 63;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 63: {
                    boolean discarded$7 = a.field_h.a(-1, "game");
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (var6 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    boolean discarded$8 = a.field_h.a(-1, var5_ref);
                    return false;
                }
                case 66: {
                    return false;
                }
                case 67: {
                    if (this.a("zombie dawn countup part 1", 0, 5)) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    return false;
                }
                case 69: {
                    if (this.a("zombie dawn countup part 2", 0, 6)) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    return false;
                }
                case 71: {
                    if (this.a("zombie dawn bonus level", 0, 7)) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    return false;
                }
                case 73: {
                    ld.field_l[2] = vm.a((byte) -123, "character_human2", "game", a.field_h);
                    ld.field_l[3] = vm.a((byte) -25, "character_human3", "game", a.field_h);
                    ld.field_l[4] = vm.a((byte) 13, "character_human4", var5_ref, a.field_h);
                    ld.field_l[5] = vm.a((byte) 117, "character_human5", "game", a.field_h);
                    ld.field_l[6] = vm.a((byte) -5, "character_human6", "game", a.field_h);
                    ld.field_l[7] = vm.a((byte) 112, "character_human7", "game", a.field_h);
                    ld.field_l[8] = vm.a((byte) 118, "character_human8", "game", a.field_h);
                    ld.field_l[9] = vm.a((byte) 118, "character_human9", "game", a.field_h);
                    ld.field_l[10] = vm.a((byte) 111, "character_human10", "game", a.field_h);
                    ld.field_l[11] = vm.a((byte) 126, "character_human11", "game", a.field_h);
                    ld.field_l[12] = vm.a((byte) 113, "character_human12", "game", a.field_h);
                    ld.field_l[13] = vm.a((byte) 109, "character_human13", "game", a.field_h);
                    ld.field_l[14] = vm.a((byte) 119, "character_human14", "game", a.field_h);
                    ld.field_l[15] = vm.a((byte) 127, "character_human15", "game", a.field_h);
                    ld.field_l[16] = vm.a((byte) 123, "character_human16", "game", a.field_h);
                    ld.field_l[17] = vm.a((byte) -110, "character_human17", "game", a.field_h);
                    ld.field_l[18] = vm.a((byte) 108, "character_human18", "game", a.field_h);
                    ld.field_l[19] = vm.a((byte) 3, "character_human19", "game", a.field_h);
                    ld.field_l[20] = vm.a((byte) -52, "character_human20", "game", a.field_h);
                    o.field_d = vm.a((byte) 112, "blood", "game", a.field_h);
                    jc.field_t = vm.a((byte) -76, "headlight", "game", a.field_h);
                    s.field_j = gf.a(a.field_h, "tutorial", 8, "game");
                    ag.field_h = gf.a(a.field_h, "minigun", 8, "game");
                    sl.field_c = vm.a((byte) -20, "hatch", "game", a.field_h);
                    oj.field_f = gf.a(a.field_h, "grenade", 8, "game");
                    tc.field_z = vm.a((byte) 121, "explosion", "game", a.field_h);
                    statePc = 102;
                    continue stateLoop;
                }
                case 74: {
                    ((tl) this).field_d = dh.field_g;
                    ld.field_l[21] = vm.a((byte) 108, "character_human21", "gameuk", a.field_h);
                    if (ld.field_l[21] != null) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    boolean discarded$9 = a.field_h.a(-1, "gameuk");
                    return false;
                }
                case 76: {
                    ld.field_l[22] = vm.a((byte) 17, "character_human22", "gameuk", a.field_h);
                    ld.field_l[23] = vm.a((byte) -17, "character_human23", "gameuk", a.field_h);
                    ld.field_l[24] = vm.a((byte) 124, "character_human24", "gameuk", a.field_h);
                    ld.field_l[25] = vm.a((byte) 18, "character_human25", "gameuk", a.field_h);
                    ld.field_l[26] = vm.a((byte) -3, "character_human26", "gameuk", a.field_h);
                    ld.field_l[27] = vm.a((byte) -18, "character_human27", "gameuk", a.field_h);
                    ld.field_l[28] = vm.a((byte) 124, "character_human28", "gameuk", a.field_h);
                    ld.field_l[29] = vm.a((byte) 112, "character_human29", "gameuk", a.field_h);
                    ld.field_l[30] = vm.a((byte) -10, "character_human30", "gameuk", a.field_h);
                    bg.field_o = vm.a((byte) 9, "miasma", "gameuk", a.field_h);
                    wh.field_a[0] = vm.a((byte) -128, "tentacle_unravel", "gameuk", a.field_h);
                    wh.field_a[1] = vm.a((byte) -75, "tentacle_grab", "gameuk", a.field_h);
                    wh.field_a[2] = vm.a((byte) -114, "tentacle_drag", "gameuk", a.field_h);
                    wh.field_a[3] = vm.a((byte) 126, "tentacle_small", "gameuk", a.field_h);
                    nh.field_R = vm.a((byte) -103, "treeshadow", "gameuk", a.field_h);
                    ip.field_p = vm.a((byte) -43, "keycard", "gameuk", a.field_h);
                    statePc = 102;
                    continue stateLoop;
                }
                case 77: {
                    if (!param0) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    nn.field_j = null;
                    we.field_Ub = null;
                    pg.field_t = null;
                    statePc = 102;
                    continue stateLoop;
                }
                case 79: {
                    if (a.field_h.a(-1, "intro")) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    return false;
                }
                case 81: {
                    if (null == nn.field_j) {
                        statePc = 83;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 83: {
                    nn.field_j = gf.a(a.field_h, "intro_background", 8, "intro");
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (we.field_Ub == null) {
                        statePc = 86;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 86: {
                    we.field_Ub = gf.a(a.field_h, "intro_1", 8, "intro");
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (null != pg.field_t) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    pg.field_t = gf.a(a.field_h, "intro_2", 8, "intro");
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (nn.field_j == null) {
                        statePc = 93;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (we.field_Ub == null) {
                        statePc = 93;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (pg.field_t != null) {
                        statePc = 102;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    return false;
                }
                case 94: {
                    if (lc.field_k != null) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    lc.field_k = vm.a((byte) -90, "spotlight", "gameuk", a.field_h);
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (null != ob.field_c) {
                        statePc = 98;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    ob.field_c = vm.a((byte) -77, "glass", "gameuk", a.field_h);
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    tf.field_b = vm.a((byte) 20, "bulletcasing", "gameuk", a.field_h);
                    statePc = 102;
                    continue stateLoop;
                }
                case 99: {
                    ((tl) this).field_d = dh.field_g;
                    f.field_d = gf.a(a.field_h, "pin_lit", 8, "menusuk");
                    if (f.field_d != null) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    ((tl) this).field_d = c.a(a.field_h, el.field_m, nb.field_o, "menusuk", (byte) -32);
                    this.a(((tl) this).field_b, 125, ((tl) this).field_d);
                    return false;
                }
                case 101: {
                    j.field_e = vm.a((byte) 115, "instructions_uk_enemies", "menusuk", a.field_h);
                    cn.field_c = vm.a((byte) -119, "instructions_keycard", "menusuk", a.field_h);
                    dc.field_a[1] = gf.a(a.field_h, "uk_level_select_map", 8, "menusuk");
                    bd.field_i[1] = vm.a((byte) -12, "uk_level_select_icons", "menusuk", a.field_h);
                    jo.field_Tb[1] = vm.a((byte) -106, "uk_level_select_icons_alt", "menusuk", a.field_h);
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    if (9 <= param1) {
                        statePc = 109;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (param0) {
                        statePc = 108;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (-2 == (tk.a(param1, 126) ^ -1)) {
                        statePc = 106;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    stackOut_105_0 = "game";
                    stackIn_107_0 = stackOut_105_0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 106: {
                    stackOut_106_0 = "gameuk";
                    stackIn_107_0 = stackOut_106_0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    var12 = stackIn_107_0;
                    var5_ref = var12;
                    ab.a(vm.a((byte) -104, we.field_Sb[param1] + "_floor", var12, a.field_h), (byte) 112, param1);
                    gk.a(param1, vm.a((byte) -18, we.field_Sb[param1] + "_tiles", var12, a.field_h), true);
                    qj.field_j[param1] = vm.a((byte) 107, "dimming" + param1, "basic", a.field_h);
                    statePc = 109;
                    continue stateLoop;
                }
                case 108: {
                    ll.a(param1, 4767999);
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if (-16 < (param1 ^ -1)) {
                        statePc = 117;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if ((param1 ^ -1) > -30) {
                        statePc = 112;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var5 = param1 + -15;
                    if (param0) {
                        statePc = 117;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (!this.a(tc.field_v[var5], 0, var5)) {
                        statePc = 115;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    stackOut_114_0 = 1;
                    stackIn_116_0 = stackOut_114_0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 115: {
                    stackOut_115_0 = 0;
                    stackIn_116_0 = stackOut_115_0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    return stackIn_116_0 != 0;
                }
                case 117: {
                    return true;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    tl() {
        ((tl) this).field_n = false;
        ((tl) this).field_o = 0;
        ((tl) this).field_p = 0;
        ((tl) this).field_a = 0;
        ((tl) this).field_r = new int[29];
        ((tl) this).field_f = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "SHACKLES";
        field_g = new int[]{};
        field_e = "Invalid password.";
    }
}
