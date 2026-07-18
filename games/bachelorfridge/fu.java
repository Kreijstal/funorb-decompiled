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

    public static void d() {
        field_s = null;
        field_l = null;
    }

    final static void d(int param0) {
        int var1_int = 0;
        int var2 = BachelorFridge.field_y;
        try {
            for (var1_int = 0; var1_int < qs.field_n; var1_int++) {
                kw.field_k[var1_int] = null;
            }
            qs.field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fu.B(" + 13042 + ')');
        }
    }

    private final void e() {
    }

    final boolean c(byte param0) {
        dha var2 = ((fu) this).field_t.a((double)((fu) this).field_o / 25.0, 82);
        int var4 = 75 / ((71 - param0) / 47);
        int var3 = var2.field_c;
        int var5 = var2.field_a;
        ((fu) this).field_m.field_s.a(var3, var5, true, (byte) -71);
        int fieldTemp$0 = ((fu) this).field_o + 1;
        ((fu) this).field_o = ((fu) this).field_o + 1;
        if (25.0 < (double)fieldTemp$0) {
            int discarded$1 = -77;
            this.e();
            return true;
        }
        return false;
    }

    final static void a(vr param0) {
        RuntimeException var2 = null;
        kv[] var2_array = null;
        int var3 = 0;
        kv var4 = null;
        int var5 = 0;
        kv[] var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            qs.field_l = new kv[14][50];
            wo.field_k = new kv[14][50];
            kv[] dupTemp$31 = jfa.a(param0, 4, "left_eye");
            pha.field_f = dupTemp$31;
            qs.field_l[1] = dupTemp$31;
            int discarded$32 = 0;
            wo.field_k[1] = cl.a(pha.field_f);
            kv[] dupTemp$33 = jfa.a(param0, 4, "hat");
            ns.field_m = dupTemp$33;
            qs.field_l[0] = dupTemp$33;
            uba.a(0, qs.field_l[0]);
            int discarded$34 = 0;
            wo.field_k[0] = cl.a(ns.field_m);
            kv[] dupTemp$35 = jfa.a(param0, 4, "right_eye");
            pja.field_d = dupTemp$35;
            qs.field_l[2] = dupTemp$35;
            int discarded$36 = 0;
            wo.field_k[2] = cl.a(pja.field_d);
            kv[] dupTemp$37 = jfa.a(param0, 4, "head");
            eo.field_k = dupTemp$37;
            qs.field_l[8] = dupTemp$37;
            int discarded$38 = 0;
            wo.field_k[8] = cl.a(eo.field_k);
            kv[] dupTemp$39 = jfa.a(param0, 4, "mouth");
            mea.field_v = dupTemp$39;
            qs.field_l[3] = dupTemp$39;
            int discarded$40 = 0;
            wo.field_k[3] = cl.a(mea.field_v);
            kv[] dupTemp$41 = jfa.a(param0, 4, "left_hand");
            fja.field_d = dupTemp$41;
            qs.field_l[5] = dupTemp$41;
            uba.a(0, qs.field_l[5]);
            int discarded$42 = 0;
            wo.field_k[5] = cl.a(fja.field_d);
            kv[] dupTemp$43 = jfa.a(param0, 4, "torso");
            jm.field_f = dupTemp$43;
            qs.field_l[9] = dupTemp$43;
            int discarded$44 = 0;
            wo.field_k[9] = cl.a(jm.field_f);
            kv[] dupTemp$45 = jfa.a(param0, 4, "right_hand");
            nf.field_P = dupTemp$45;
            qs.field_l[4] = dupTemp$45;
            uba.a(0, qs.field_l[4]);
            int discarded$46 = 0;
            wo.field_k[4] = cl.a(nf.field_P);
            kv[] dupTemp$47 = jfa.a(param0, 4, "left_foot");
            bha.field_m = dupTemp$47;
            qs.field_l[7] = dupTemp$47;
            uba.a(0, qs.field_l[7]);
            int discarded$48 = 0;
            wo.field_k[7] = cl.a(bha.field_m);
            kv[] dupTemp$49 = jfa.a(param0, 4, "body");
            tw.field_c = dupTemp$49;
            qs.field_l[10] = dupTemp$49;
            int discarded$50 = 0;
            wo.field_k[10] = cl.a(tw.field_c);
            kv[] dupTemp$51 = jfa.a(param0, 4, "right_foot");
            bia.field_h = dupTemp$51;
            qs.field_l[6] = dupTemp$51;
            uba.a(0, qs.field_l[6]);
            int discarded$52 = 0;
            wo.field_k[6] = cl.a(bia.field_h);
            kv[] dupTemp$53 = fw.a(8, (byte) -74);
            qla.field_g = dupTemp$53;
            qs.field_l[11] = dupTemp$53;
            int discarded$54 = 0;
            wo.field_k[11] = cl.a(qla.field_g);
            kv[] dupTemp$55 = fw.a(9, (byte) -74);
            aw.field_w = dupTemp$55;
            qs.field_l[12] = dupTemp$55;
            int discarded$56 = 0;
            wo.field_k[12] = cl.a(aw.field_w);
            kv[] dupTemp$57 = fw.a(10, (byte) -74);
            ama.field_o = dupTemp$57;
            qs.field_l[13] = dupTemp$57;
            int discarded$58 = 0;
            wo.field_k[13] = cl.a(ama.field_o);
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
            var2_array = var6;
            var3 = 0;
            L1: while (true) {
              if (var6.length <= var3) {
                us.field_c = ch.a(param0, -1, "basic", "rank_star");
                nu.field_e = wfa.a("generic_slime_bg", param0, "basic", (byte) -26);
                ew.field_r = wfa.a("small_bg", param0, "basic", (byte) 70);
                jt.field_g = wfa.a("lrg_button", param0, "basic", (byte) 126);
                gj.field_F = wfa.a("med_button", param0, "basic", (byte) -68);
                ana.field_r = wfa.a("small_button", param0, "basic", (byte) -17);
                int discarded$59 = 7;
                de.field_A = fh.a("frame_tape", param0, "basic");
                bh.field_r = wfa.a("mag", param0, "basic", (byte) 62);
                cba.field_a = wfa.a("bag", param0, "basic", (byte) -105);
                gca.field_g = wfa.a("bag_full", param0, "basic", (byte) 106);
                ls.field_c = hca.a("basic", param0, 94, "sound_bar_empty");
                ni.field_j = hca.a("basic", param0, -42, "sound_bar_full");
                qw.field_c = wfa.a("sound_button", param0, "basic", (byte) 123);
                wt.field_q = wfa.a("options_slime_a", param0, "basic", (byte) 57);
                kv[] discarded$60 = pi.a(param0, -8845, "basic", "frank");
                sia.field_j = wfa.a("tutorial_arrow_black", param0, "basic", (byte) -96);
                et.field_p = wfa.a("tutorial_arrow_green", param0, "basic", (byte) 59);
                qt.field_m = hca.a("basic", param0, -80, "close_cross");
                mr.field_f = hca.a("basic", param0, 109, "instructions_back_tile");
                t.a(0, param0);
                param0 = null;
                break L0;
              } else {
                var4 = var6[var3];
                kv discarded$61 = lp.a((byte) -62, var4);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("fu.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + false + ')');
        }
    }

    fu(gj param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        dha var7 = null;
        dha var8 = null;
        dha var9 = null;
        dha var10 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              ((fu) this).field_r = param3;
              ((fu) this).field_j = param4;
              ((fu) this).field_p = param1;
              ((fu) this).field_m = param0;
              ((fu) this).field_k = param2;
              ((fu) this).field_q = -((fu) this).field_k + ((fu) this).field_j;
              ((fu) this).field_n = -((fu) this).field_p + ((fu) this).field_r;
              if (kla.a(2, ((fu) this).field_m.field_h.field_w, -2147483648) != 1) {
                stackOut_3_0 = 1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = -1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var6_int = stackIn_4_0;
            var7 = new dha(((fu) this).field_p, ((fu) this).field_k);
            var8 = new dha(((fu) this).field_r, ((fu) this).field_j);
            var9 = new dha((int)((double)((fu) this).field_p + (double)var6_int * ((double)((fu) this).field_q * 0.2)), (int)((double)((fu) this).field_k - 0.2 * (double)((fu) this).field_n * (double)var6_int));
            var10 = new dha((int)((double)var6_int * (0.2 * (double)((fu) this).field_q) + (double)((fu) this).field_r), (int)(-(0.2 * (double)((fu) this).field_n * (double)var6_int) + (double)((fu) this).field_j));
            ((fu) this).field_t = new gw(var7, var9, var10, var8, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("fu.<init>(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Elapsed time";
        field_l = new String[]{"Move Phase", "Action Phase"};
    }
}
