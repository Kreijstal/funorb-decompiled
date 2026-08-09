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
            field_s = (String) null;
        }
    }

    final static void d(int param0) {
        int var1_int = 0;
        int var2 = BachelorFridge.field_y;
        try {
            for (var1_int = 0; var1_int < qs.field_n; var1_int++) {
                kw.field_k[var1_int] = null;
            }
            if (param0 != 13042) {
                vr var3 = (vr) null;
                fu.a((vr) null, false);
            }
            qs.field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fu.B(" + param0 + ')');
        }
    }

    private final void e(byte param0) {
        if (param0 != -77) {
            fu.d(83);
        }
    }

    final boolean c(byte param0) {
        dha var2 = this.field_t.a((double)this.field_o / 25.0, 82);
        int var4 = 75 / ((71 - param0) / 47);
        int var3 = var2.field_c;
        int var5 = var2.field_a;
        this.field_m.field_s.a(var3, var5, true, (byte) -71);
        int fieldTemp$0 = this.field_o + 1;
        this.field_o = this.field_o + 1;
        if (25.0 < (double)fieldTemp$0) {
            this.e((byte) -77);
            return true;
        }
        return false;
    }

    final static void a(vr param0, boolean param1) {
        kv[] dupTemp$0 = null;
        kv[] dupTemp$1 = null;
        kv[] dupTemp$2 = null;
        kv[] dupTemp$3 = null;
        kv[] dupTemp$4 = null;
        kv[] dupTemp$5 = null;
        kv[] dupTemp$6 = null;
        kv[] dupTemp$7 = null;
        kv[] dupTemp$8 = null;
        kv[] dupTemp$9 = null;
        kv[] dupTemp$10 = null;
        kv[] dupTemp$11 = null;
        kv[] dupTemp$12 = null;
        kv[] dupTemp$13 = null;
        kv[] var6 = null;
        int var3 = 0;
        kv var4 = null;
        int var5 = BachelorFridge.field_y;
        try {
            qs.field_l = new kv[14][50];
            wo.field_k = new kv[14][50];
            dupTemp$0 = jfa.a(param0, 4, "left_eye");
            pha.field_f = dupTemp$0;
            qs.field_l[1] = dupTemp$0;
            wo.field_k[1] = cl.a(pha.field_f, false);
            dupTemp$1 = jfa.a(param0, 4, "hat");
            ns.field_m = dupTemp$1;
            qs.field_l[0] = dupTemp$1;
            uba.a(0, qs.field_l[0]);
            wo.field_k[0] = cl.a(ns.field_m, false);
            dupTemp$2 = jfa.a(param0, 4, "right_eye");
            pja.field_d = dupTemp$2;
            qs.field_l[2] = dupTemp$2;
            wo.field_k[2] = cl.a(pja.field_d, false);
            dupTemp$3 = jfa.a(param0, 4, "head");
            eo.field_k = dupTemp$3;
            qs.field_l[8] = dupTemp$3;
            wo.field_k[8] = cl.a(eo.field_k, param1);
            dupTemp$4 = jfa.a(param0, 4, "mouth");
            mea.field_v = dupTemp$4;
            qs.field_l[3] = dupTemp$4;
            wo.field_k[3] = cl.a(mea.field_v, param1);
            dupTemp$5 = jfa.a(param0, 4, "left_hand");
            fja.field_d = dupTemp$5;
            qs.field_l[5] = dupTemp$5;
            uba.a(0, qs.field_l[5]);
            wo.field_k[5] = cl.a(fja.field_d, false);
            dupTemp$6 = jfa.a(param0, 4, "torso");
            jm.field_f = dupTemp$6;
            qs.field_l[9] = dupTemp$6;
            wo.field_k[9] = cl.a(jm.field_f, param1);
            dupTemp$7 = jfa.a(param0, 4, "right_hand");
            nf.field_P = dupTemp$7;
            qs.field_l[4] = dupTemp$7;
            uba.a(0, qs.field_l[4]);
            wo.field_k[4] = cl.a(nf.field_P, false);
            dupTemp$8 = jfa.a(param0, 4, "left_foot");
            bha.field_m = dupTemp$8;
            qs.field_l[7] = dupTemp$8;
            uba.a(0, qs.field_l[7]);
            wo.field_k[7] = cl.a(bha.field_m, param1);
            dupTemp$9 = jfa.a(param0, 4, "body");
            tw.field_c = dupTemp$9;
            qs.field_l[10] = dupTemp$9;
            wo.field_k[10] = cl.a(tw.field_c, false);
            dupTemp$10 = jfa.a(param0, 4, "right_foot");
            bia.field_h = dupTemp$10;
            qs.field_l[6] = dupTemp$10;
            uba.a(0, qs.field_l[6]);
            wo.field_k[6] = cl.a(bia.field_h, param1);
            dupTemp$11 = fw.a(8, (byte) -74);
            qla.field_g = dupTemp$11;
            qs.field_l[11] = dupTemp$11;
            wo.field_k[11] = cl.a(qla.field_g, false);
            dupTemp$12 = fw.a(9, (byte) -74);
            aw.field_w = dupTemp$12;
            qs.field_l[12] = dupTemp$12;
            wo.field_k[12] = cl.a(aw.field_w, false);
            dupTemp$13 = fw.a(10, (byte) -74);
            ama.field_o = dupTemp$13;
            qs.field_l[13] = dupTemp$13;
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
            var6 = vv.field_c;
            kv[] var2 = var6;
            for (var3 = 0; var6.length > var3; var3++) {
                var4 = var6[var3];
                lp.a((byte) -62, var4);
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
            pi.a(param0, -8845, "basic", "frank");
            sia.field_j = wfa.a("tutorial_arrow_black", param0, "basic", (byte) -96);
            et.field_p = wfa.a("tutorial_arrow_green", param0, "basic", (byte) 59);
            qt.field_m = hca.a("basic", param0, -80, "close_cross");
            mr.field_f = hca.a("basic", param0, 109, "instructions_back_tile");
            t.a(0, param0);
            param0 = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fu.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    fu(gj param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        dha var7 = null;
        dha var8 = null;
        dha var9 = null;
        dha var10 = null;
        try {
            this.field_r = param3;
            this.field_j = param4;
            this.field_p = param1;
            this.field_m = param0;
            this.field_k = param2;
            this.field_q = -this.field_k + this.field_j;
            this.field_n = -this.field_p + this.field_r;
            var6_int = (kla.a(2, this.field_m.field_h.field_w, -2147483648) ^ -1) == -2 ? -1 : 1;
            var7 = new dha(this.field_p, this.field_k);
            var8 = new dha(this.field_r, this.field_j);
            var9 = new dha((int)((double)this.field_p + (double)var6_int * ((double)this.field_q * 0.2)), (int)((double)this.field_k - 0.2 * (double)this.field_n * (double)var6_int));
            var10 = new dha((int)((double)var6_int * (0.2 * (double)this.field_q) + (double)this.field_r), (int)(-(0.2 * (double)this.field_n * (double)var6_int) + (double)this.field_j));
            this.field_t = new gw(var7, var9, var10, var8, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_s = "Elapsed time";
        field_l = new String[]{"Move Phase", "Action Phase"};
    }
}
