/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fu extends at {
    private gj field_m;
    private int field_k;
    private int field_o;
    static String field_s;
    private int field_q;
    private int field_p;
    static String[] field_l;
    private int field_r;
    private gw field_t;
    private int field_n;
    private int field_j;

    public static void d(byte param0) {
        field_s = null;
        field_l = null;
        if (param0 < 60) {
            field_s = null;
        }
    }

    final static void d(int param0) {
        int var1 = 0;
        int var2 = BachelorFridge.field_y;
        for (var1 = 0; var1 < qs.field_n; var1++) {
            kw.field_k[var1] = null;
        }
        if (param0 != 13042) {
            Object var3 = null;
            fu.a((vr) null, false);
        }
        qs.field_n = 0;
    }

    private final void e(byte param0) {
        if (param0 != -77) {
            fu.d(83);
        }
    }

    final boolean c(byte param0) {
        dha var2 = ((fu) this).field_t.a((double)((fu) this).field_o / 25.0, 82);
        int var4 = 75 / ((71 - param0) / 47);
        int var3 = var2.field_c;
        int var5 = var2.field_a;
        ((fu) this).field_m.field_s.a(var3, var5, true, (byte) -71);
        ((fu) this).field_o = ((fu) this).field_o + 1;
        if (25.0 < (double)(((fu) this).field_o + 1)) {
            this.e((byte) -77);
            return true;
        }
        return false;
    }

    final static void a(vr param0, boolean param1) {
        int var3 = 0;
        kv var4 = null;
        int var5 = BachelorFridge.field_y;
        qs.field_l = new kv[14][50];
        wo.field_k = new kv[14][50];
        pha.field_f = jfa.a(param0, 4, "left_eye");
        qs.field_l[1] = jfa.a(param0, 4, "left_eye");
        wo.field_k[1] = cl.a(pha.field_f, false);
        ns.field_m = jfa.a(param0, 4, "hat");
        qs.field_l[0] = jfa.a(param0, 4, "hat");
        uba.a(0, qs.field_l[0]);
        wo.field_k[0] = cl.a(ns.field_m, false);
        pja.field_d = jfa.a(param0, 4, "right_eye");
        qs.field_l[2] = jfa.a(param0, 4, "right_eye");
        wo.field_k[2] = cl.a(pja.field_d, false);
        eo.field_k = jfa.a(param0, 4, "head");
        qs.field_l[8] = jfa.a(param0, 4, "head");
        wo.field_k[8] = cl.a(eo.field_k, param1);
        mea.field_v = jfa.a(param0, 4, "mouth");
        qs.field_l[3] = jfa.a(param0, 4, "mouth");
        wo.field_k[3] = cl.a(mea.field_v, param1);
        fja.field_d = jfa.a(param0, 4, "left_hand");
        qs.field_l[5] = jfa.a(param0, 4, "left_hand");
        uba.a(0, qs.field_l[5]);
        wo.field_k[5] = cl.a(fja.field_d, false);
        jm.field_f = jfa.a(param0, 4, "torso");
        qs.field_l[9] = jfa.a(param0, 4, "torso");
        wo.field_k[9] = cl.a(jm.field_f, param1);
        nf.field_P = jfa.a(param0, 4, "right_hand");
        qs.field_l[4] = jfa.a(param0, 4, "right_hand");
        uba.a(0, qs.field_l[4]);
        wo.field_k[4] = cl.a(nf.field_P, false);
        bha.field_m = jfa.a(param0, 4, "left_foot");
        qs.field_l[7] = jfa.a(param0, 4, "left_foot");
        uba.a(0, qs.field_l[7]);
        wo.field_k[7] = cl.a(bha.field_m, param1);
        tw.field_c = jfa.a(param0, 4, "body");
        qs.field_l[10] = jfa.a(param0, 4, "body");
        wo.field_k[10] = cl.a(tw.field_c, false);
        bia.field_h = jfa.a(param0, 4, "right_foot");
        qs.field_l[6] = jfa.a(param0, 4, "right_foot");
        uba.a(0, qs.field_l[6]);
        wo.field_k[6] = cl.a(bia.field_h, param1);
        qla.field_g = fw.a(8, (byte) -74);
        qs.field_l[11] = fw.a(8, (byte) -74);
        wo.field_k[11] = cl.a(qla.field_g, false);
        aw.field_w = fw.a(9, (byte) -74);
        qs.field_l[12] = fw.a(9, (byte) -74);
        wo.field_k[12] = cl.a(aw.field_w, false);
        ama.field_o = fw.a(10, (byte) -74);
        qs.field_l[13] = fw.a(10, (byte) -74);
        wo.field_k[13] = cl.a(ama.field_o, false);
        lma.field_y = ch.a(param0, -1, "basic", "uparrow");
        gha.field_b = lma.field_y.c();
        gha.field_b.d();
        ada.field_l = ch.a(param0, -1, "basic", "scrollarrow_hover");
        oaa.field_a = ada.field_l.c();
        oaa.field_a.d();
        fda.field_m = wfa.a("stain", param0, "basic", (byte) -64);
        pr.field_h = pi.a(param0, -8845, "basic", "stains");
        vv.field_c = pi.a(param0, -8845, "basic", "cursors");
        kv[] var6 = vv.field_c;
        kv[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            kv discarded$0 = lp.a((byte) -62, var4);
        }
        us.field_c = ch.a(param0, -1, "basic", "rank_star");
        nu.field_e = wfa.a("generic_slime_bg", param0, "basic", (byte) -26);
        ew.field_r = wfa.a("small_bg", param0, "basic", (byte) 70);
        jt.field_g = wfa.a("lrg_button", param0, "basic", (byte) 126);
        gj.field_F = wfa.a("med_button", param0, "basic", (byte) -68);
        ana.field_r = wfa.a("small_button", param0, "basic", (byte) -17);
        de.field_A = fh.a("frame_tape", param0, "basic", 7);
        bh.field_r = wfa.a("mag", param0, "basic", (byte) 62);
        cba.field_a = wfa.a("bag", param0, "basic", (byte) -105);
        gca.field_g = wfa.a("bag_full", param0, "basic", (byte) 106);
        ls.field_c = hca.a("basic", param0, 94, "sound_bar_empty");
        ni.field_j = hca.a("basic", param0, -42, "sound_bar_full");
        qw.field_c = wfa.a("sound_button", param0, "basic", (byte) 123);
        wt.field_q = wfa.a("options_slime_a", param0, "basic", (byte) 57);
        kv[] discarded$1 = pi.a(param0, -8845, "basic", "frank");
        sia.field_j = wfa.a("tutorial_arrow_black", param0, "basic", (byte) -96);
        et.field_p = wfa.a("tutorial_arrow_green", param0, "basic", (byte) 59);
        qt.field_m = hca.a("basic", param0, -80, "close_cross");
        mr.field_f = hca.a("basic", param0, 109, "instructions_back_tile");
        t.a(0, param0);
        param0 = null;
    }

    fu(gj param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        dha var7 = null;
        dha var8 = null;
        dha var9 = null;
        dha var10 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          ((fu) this).field_r = param3;
          ((fu) this).field_j = param4;
          ((fu) this).field_p = param1;
          ((fu) this).field_m = param0;
          ((fu) this).field_k = param2;
          ((fu) this).field_q = -((fu) this).field_k + ((fu) this).field_j;
          ((fu) this).field_n = -((fu) this).field_p + ((fu) this).field_r;
          if ((kla.a(2, ((fu) this).field_m.field_h.field_w, -2147483648) ^ -1) != -2) {
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = -1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        var7 = new dha(((fu) this).field_p, ((fu) this).field_k);
        var8 = new dha(((fu) this).field_r, ((fu) this).field_j);
        var9 = new dha((int)((double)((fu) this).field_p + (double)var6 * ((double)((fu) this).field_q * 0.2)), (int)((double)((fu) this).field_k - 0.2 * (double)((fu) this).field_n * (double)var6));
        var10 = new dha((int)((double)var6 * (0.2 * (double)((fu) this).field_q) + (double)((fu) this).field_r), (int)(-(0.2 * (double)((fu) this).field_n * (double)var6) + (double)((fu) this).field_j));
        ((fu) this).field_t = new gw(var7, var9, var10, var8, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Elapsed time";
        field_l = new String[]{"Move Phase", "Action Phase"};
    }
}
