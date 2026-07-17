/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hg {
    static Random field_e;
    static int[] field_d;
    static int field_a;
    static uf[] field_b;
    static boolean field_c;
    static gq field_f;

    final static void a(byte param0, la param1) {
        byte[] var2 = null;
        int var3 = 0;
        L0: {
          dn.field_i = param1;
          var2 = da.a((byte) 115, "gamename");
          if (var2 == null) {
            break L0;
          } else {
            int discarded$101 = 0;
            cp.field_i = lj.a(var2);
            break L0;
          }
        }
        L1: {
          var2 = da.a((byte) 117, "benefits_6worlds");
          if (var2 != null) {
            int discarded$102 = 0;
            ld.field_b = lj.a(var2);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var2 = da.a((byte) -25, "benefits_30levels");
          if (null != var2) {
            int discarded$103 = 0;
            hm.field_t = lj.a(var2);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var2 = da.a((byte) 110, "benefits_newtwists");
          if (var2 != null) {
            int discarded$104 = 0;
            qa.field_j = lj.a(var2);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var2 = da.a((byte) 106, "spikes");
          if (null == var2) {
            break L4;
          } else {
            int discarded$105 = 0;
            gi.field_b = lj.a(var2);
            break L4;
          }
        }
        L5: {
          var2 = da.a((byte) -59, "gyro");
          if (var2 == null) {
            break L5;
          } else {
            int discarded$106 = 0;
            ea.field_u = lj.a(var2);
            break L5;
          }
        }
        L6: {
          var2 = da.a((byte) 112, "shield");
          if (null != var2) {
            int discarded$107 = 0;
            je.field_i = lj.a(var2);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var2 = da.a((byte) -79, "skin");
          if (null != var2) {
            int discarded$108 = 0;
            nc.field_c = lj.a(var2);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var2 = da.a((byte) -43, "unknown_quantity");
          if (null == var2) {
            break L8;
          } else {
            int discarded$109 = 0;
            af.field_b = lj.a(var2);
            break L8;
          }
        }
        L9: {
          var2 = da.a((byte) -51, "space_x_unknown");
          if (null == var2) {
            break L9;
          } else {
            int discarded$110 = 0;
            nl.field_u = lj.a(var2);
            break L9;
          }
        }
        L10: {
          var2 = da.a((byte) -98, "yourscore");
          if (null != var2) {
            int discarded$111 = 0;
            om.field_e = lj.a(var2);
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          var2 = da.a((byte) 124, "freegame_completed");
          if (null != var2) {
            int discarded$112 = 0;
            vf.field_m = lj.a(var2);
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          var2 = da.a((byte) -56, "worldcolon");
          if (var2 != null) {
            int discarded$113 = 0;
            wa.field_c = lj.a(var2);
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          var2 = da.a((byte) 104, "levelcolon");
          if (null == var2) {
            break L13;
          } else {
            int discarded$114 = 0;
            lj.field_b = lj.a(var2);
            break L13;
          }
        }
        L14: {
          var2 = da.a((byte) -84, "achievement_names,0");
          if (var2 == null) {
            break L14;
          } else {
            int discarded$115 = 0;
            k.field_b[0] = lj.a(var2);
            break L14;
          }
        }
        L15: {
          var2 = da.a((byte) 113, "achievement_names,1");
          if (var2 == null) {
            break L15;
          } else {
            int discarded$116 = 0;
            k.field_b[1] = lj.a(var2);
            break L15;
          }
        }
        L16: {
          var2 = da.a((byte) -61, "achievement_names,2");
          if (null == var2) {
            break L16;
          } else {
            int discarded$117 = 0;
            k.field_b[2] = lj.a(var2);
            break L16;
          }
        }
        L17: {
          var2 = da.a((byte) 108, "achievement_names,3");
          if (var2 == null) {
            break L17;
          } else {
            int discarded$118 = 0;
            k.field_b[3] = lj.a(var2);
            break L17;
          }
        }
        L18: {
          var2 = da.a((byte) -61, "achievement_names,4");
          if (null != var2) {
            int discarded$119 = 0;
            k.field_b[4] = lj.a(var2);
            break L18;
          } else {
            break L18;
          }
        }
        L19: {
          var2 = da.a((byte) 112, "achievement_names,5");
          if (null == var2) {
            break L19;
          } else {
            int discarded$120 = 0;
            k.field_b[5] = lj.a(var2);
            break L19;
          }
        }
        L20: {
          var2 = da.a((byte) -69, "achievement_names,6");
          if (var2 == null) {
            break L20;
          } else {
            int discarded$121 = 0;
            k.field_b[6] = lj.a(var2);
            break L20;
          }
        }
        L21: {
          var2 = da.a((byte) -50, "achievement_names,7");
          if (null != var2) {
            int discarded$122 = 0;
            k.field_b[7] = lj.a(var2);
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          var2 = da.a((byte) -49, "achievement_names,8");
          if (var2 == null) {
            break L22;
          } else {
            int discarded$123 = 0;
            k.field_b[8] = lj.a(var2);
            break L22;
          }
        }
        L23: {
          var2 = da.a((byte) 104, "achievement_names,9");
          if (var2 != null) {
            int discarded$124 = 0;
            k.field_b[9] = lj.a(var2);
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          var2 = da.a((byte) -97, "achievement_names,10");
          if (null == var2) {
            break L24;
          } else {
            int discarded$125 = 0;
            k.field_b[10] = lj.a(var2);
            break L24;
          }
        }
        L25: {
          var2 = da.a((byte) -120, "achievement_names,11");
          if (null != var2) {
            int discarded$126 = 0;
            k.field_b[11] = lj.a(var2);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          var2 = da.a((byte) 106, "achievement_names,12");
          if (null == var2) {
            break L26;
          } else {
            int discarded$127 = 0;
            k.field_b[12] = lj.a(var2);
            break L26;
          }
        }
        L27: {
          var2 = da.a((byte) -60, "achievement_names,13");
          if (var2 != null) {
            int discarded$128 = 0;
            k.field_b[13] = lj.a(var2);
            break L27;
          } else {
            break L27;
          }
        }
        L28: {
          var2 = da.a((byte) -104, "achievement_names,14");
          if (var2 == null) {
            break L28;
          } else {
            int discarded$129 = 0;
            k.field_b[14] = lj.a(var2);
            break L28;
          }
        }
        L29: {
          var2 = da.a((byte) -22, "achievement_names,15");
          if (null == var2) {
            break L29;
          } else {
            int discarded$130 = 0;
            k.field_b[15] = lj.a(var2);
            break L29;
          }
        }
        L30: {
          var2 = da.a((byte) -73, "achievement_names,16");
          if (var2 != null) {
            int discarded$131 = 0;
            k.field_b[16] = lj.a(var2);
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          var2 = da.a((byte) -62, "achievement_criteria,0");
          if (var2 != null) {
            int discarded$132 = 0;
            cn.field_a[0] = lj.a(var2);
            break L31;
          } else {
            break L31;
          }
        }
        L32: {
          var2 = da.a((byte) -49, "achievement_criteria,1");
          if (null == var2) {
            break L32;
          } else {
            int discarded$133 = 0;
            cn.field_a[1] = lj.a(var2);
            break L32;
          }
        }
        L33: {
          var2 = da.a((byte) 109, "achievement_criteria,2");
          if (var2 != null) {
            int discarded$134 = 0;
            cn.field_a[2] = lj.a(var2);
            break L33;
          } else {
            break L33;
          }
        }
        L34: {
          var2 = da.a((byte) 125, "achievement_criteria,3");
          if (var2 != null) {
            int discarded$135 = 0;
            cn.field_a[3] = lj.a(var2);
            break L34;
          } else {
            break L34;
          }
        }
        L35: {
          var2 = da.a((byte) 113, "achievement_criteria,4");
          if (var2 == null) {
            break L35;
          } else {
            int discarded$136 = 0;
            cn.field_a[4] = lj.a(var2);
            break L35;
          }
        }
        L36: {
          var2 = da.a((byte) 116, "achievement_criteria,5");
          if (null == var2) {
            break L36;
          } else {
            int discarded$137 = 0;
            cn.field_a[5] = lj.a(var2);
            break L36;
          }
        }
        L37: {
          var2 = da.a((byte) 108, "achievement_criteria,6");
          var3 = -49;
          if (null != var2) {
            int discarded$138 = 0;
            cn.field_a[6] = lj.a(var2);
            break L37;
          } else {
            break L37;
          }
        }
        L38: {
          var2 = da.a((byte) -112, "achievement_criteria,7");
          if (var2 == null) {
            break L38;
          } else {
            int discarded$139 = 0;
            cn.field_a[7] = lj.a(var2);
            break L38;
          }
        }
        L39: {
          var2 = da.a((byte) 119, "achievement_criteria,8");
          if (null != var2) {
            int discarded$140 = 0;
            cn.field_a[8] = lj.a(var2);
            break L39;
          } else {
            break L39;
          }
        }
        L40: {
          var2 = da.a((byte) 111, "achievement_criteria,9");
          if (var2 != null) {
            int discarded$141 = 0;
            cn.field_a[9] = lj.a(var2);
            break L40;
          } else {
            break L40;
          }
        }
        L41: {
          var2 = da.a((byte) 127, "achievement_criteria,10");
          if (null != var2) {
            int discarded$142 = 0;
            cn.field_a[10] = lj.a(var2);
            break L41;
          } else {
            break L41;
          }
        }
        L42: {
          var2 = da.a((byte) 106, "achievement_criteria,11");
          if (var2 == null) {
            break L42;
          } else {
            int discarded$143 = 0;
            cn.field_a[11] = lj.a(var2);
            break L42;
          }
        }
        L43: {
          var2 = da.a((byte) 104, "achievement_criteria,12");
          if (null == var2) {
            break L43;
          } else {
            int discarded$144 = 0;
            cn.field_a[12] = lj.a(var2);
            break L43;
          }
        }
        L44: {
          var2 = da.a((byte) 117, "achievement_criteria,13");
          if (var2 != null) {
            int discarded$145 = 0;
            cn.field_a[13] = lj.a(var2);
            break L44;
          } else {
            break L44;
          }
        }
        L45: {
          var2 = da.a((byte) 121, "achievement_criteria,14");
          if (null != var2) {
            int discarded$146 = 0;
            cn.field_a[14] = lj.a(var2);
            break L45;
          } else {
            break L45;
          }
        }
        L46: {
          var2 = da.a((byte) 115, "achievement_criteria,15");
          if (null != var2) {
            int discarded$147 = 0;
            cn.field_a[15] = lj.a(var2);
            break L46;
          } else {
            break L46;
          }
        }
        L47: {
          var2 = da.a((byte) -48, "achievement_criteria,16");
          if (null != var2) {
            int discarded$148 = 0;
            cn.field_a[16] = lj.a(var2);
            break L47;
          } else {
            break L47;
          }
        }
        L48: {
          var2 = da.a((byte) -54, "powerup_descriptions,0");
          if (null == var2) {
            break L48;
          } else {
            int discarded$149 = 0;
            m.field_n[0] = lj.a(var2);
            break L48;
          }
        }
        L49: {
          var2 = da.a((byte) -71, "powerup_descriptions,1");
          if (null != var2) {
            int discarded$150 = 0;
            m.field_n[1] = lj.a(var2);
            break L49;
          } else {
            break L49;
          }
        }
        L50: {
          var2 = da.a((byte) 118, "powerup_descriptions,2");
          if (var2 == null) {
            break L50;
          } else {
            int discarded$151 = 0;
            m.field_n[2] = lj.a(var2);
            break L50;
          }
        }
        L51: {
          var2 = da.a((byte) 105, "powerup_descriptions,4");
          if (null != var2) {
            int discarded$152 = 0;
            m.field_n[4] = lj.a(var2);
            break L51;
          } else {
            break L51;
          }
        }
        L52: {
          var2 = da.a((byte) -114, "powerup_descriptions,5");
          if (null != var2) {
            int discarded$153 = 0;
            m.field_n[5] = lj.a(var2);
            break L52;
          } else {
            break L52;
          }
        }
        L53: {
          var2 = da.a((byte) 112, "powerup_descriptions,6");
          if (null != var2) {
            int discarded$154 = 0;
            m.field_n[6] = lj.a(var2);
            break L53;
          } else {
            break L53;
          }
        }
        L54: {
          var2 = da.a((byte) -100, "powerup_descriptions,7");
          if (var2 != null) {
            int discarded$155 = 0;
            m.field_n[7] = lj.a(var2);
            break L54;
          } else {
            break L54;
          }
        }
        L55: {
          var2 = da.a((byte) 119, "powerup_descriptions,8");
          if (var2 != null) {
            int discarded$156 = 0;
            m.field_n[8] = lj.a(var2);
            break L55;
          } else {
            break L55;
          }
        }
        L56: {
          var2 = da.a((byte) 112, "powerup_descriptions,9");
          if (var2 == null) {
            break L56;
          } else {
            int discarded$157 = 0;
            m.field_n[9] = lj.a(var2);
            break L56;
          }
        }
        L57: {
          var2 = da.a((byte) -29, "powerup_descriptions,18");
          if (var2 == null) {
            break L57;
          } else {
            int discarded$158 = 0;
            m.field_n[18] = lj.a(var2);
            break L57;
          }
        }
        L58: {
          var2 = da.a((byte) -74, "surface_descriptions,0");
          if (null != var2) {
            int discarded$159 = 0;
            ga.field_d[0] = lj.a(var2);
            break L58;
          } else {
            break L58;
          }
        }
        L59: {
          var2 = da.a((byte) 114, "surface_descriptions,1");
          if (var2 == null) {
            break L59;
          } else {
            int discarded$160 = 0;
            ga.field_d[1] = lj.a(var2);
            break L59;
          }
        }
        L60: {
          var2 = da.a((byte) 127, "surface_descriptions,2");
          if (null == var2) {
            break L60;
          } else {
            int discarded$161 = 0;
            ga.field_d[2] = lj.a(var2);
            break L60;
          }
        }
        L61: {
          var2 = da.a((byte) -119, "surface_descriptions,3");
          if (var2 != null) {
            int discarded$162 = 0;
            ga.field_d[3] = lj.a(var2);
            break L61;
          } else {
            break L61;
          }
        }
        L62: {
          var2 = da.a((byte) 117, "surface_descriptions,4");
          if (null == var2) {
            break L62;
          } else {
            int discarded$163 = 0;
            ga.field_d[4] = lj.a(var2);
            break L62;
          }
        }
        L63: {
          var2 = da.a((byte) 119, "surface_descriptions,5");
          if (null == var2) {
            break L63;
          } else {
            int discarded$164 = 0;
            ga.field_d[5] = lj.a(var2);
            break L63;
          }
        }
        L64: {
          var2 = da.a((byte) 109, "nameofthegame");
          if (null == var2) {
            break L64;
          } else {
            int discarded$165 = 0;
            vd.field_a = lj.a(var2);
            break L64;
          }
        }
        L65: {
          var2 = da.a((byte) 117, "gyro_warning");
          if (var2 != null) {
            int discarded$166 = 0;
            hl.field_c = lj.a(var2);
            break L65;
          } else {
            break L65;
          }
        }
        L66: {
          var2 = da.a((byte) -108, "lookoutfor");
          if (var2 == null) {
            break L66;
          } else {
            int discarded$167 = 0;
            eq.field_c = lj.a(var2);
            break L66;
          }
        }
        L67: {
          var2 = da.a((byte) -70, "surfaces_colon");
          if (var2 == null) {
            break L67;
          } else {
            int discarded$168 = 0;
            vp.field_G = lj.a(var2);
            break L67;
          }
        }
        L68: {
          var2 = da.a((byte) 123, "noanimalsharmed");
          if (null == var2) {
            break L68;
          } else {
            int discarded$169 = 0;
            q.field_i = lj.a(var2);
            break L68;
          }
        }
        L69: {
          var2 = da.a((byte) -119, "timemeanspoints");
          if (var2 == null) {
            break L69;
          } else {
            int discarded$170 = 0;
            String discarded$171 = lj.a(var2);
            break L69;
          }
        }
        L70: {
          var2 = da.a((byte) -93, "torquing_bonus");
          if (var2 != null) {
            int discarded$172 = 0;
            fh.field_s = lj.a(var2);
            break L70;
          } else {
            break L70;
          }
        }
        L71: {
          var2 = da.a((byte) 111, "world_level");
          if (var2 == null) {
            break L71;
          } else {
            int discarded$173 = 0;
            qj.field_b = lj.a(var2);
            break L71;
          }
        }
        L72: {
          var2 = da.a((byte) -87, "click_to_skip");
          if (null == var2) {
            break L72;
          } else {
            int discarded$174 = 0;
            kk.field_q = lj.a(var2);
            break L72;
          }
        }
        L73: {
          var2 = da.a((byte) -121, "world_complete");
          if (null == var2) {
            break L73;
          } else {
            int discarded$175 = 0;
            pc.field_n = lj.a(var2);
            break L73;
          }
        }
        L74: {
          var2 = da.a((byte) -26, "powerups_collected");
          if (null == var2) {
            break L74;
          } else {
            int discarded$176 = 0;
            ka.field_l = lj.a(var2);
            break L74;
          }
        }
        L75: {
          var2 = da.a((byte) 119, "highscores_all");
          if (null != var2) {
            int discarded$177 = 0;
            ae.field_lb = lj.a(var2);
            break L75;
          } else {
            break L75;
          }
        }
        L76: {
          var2 = da.a((byte) -55, "highscores_mine");
          if (var2 != null) {
            int discarded$178 = 0;
            qe.field_a = lj.a(var2);
            break L76;
          } else {
            break L76;
          }
        }
        L77: {
          var2 = da.a((byte) -64, "highscores_besteach");
          if (var2 != null) {
            int discarded$179 = 0;
            ai.field_m = lj.a(var2);
            break L77;
          } else {
            break L77;
          }
        }
        L78: {
          var2 = da.a((byte) 107, "graphics_low");
          if (null == var2) {
            break L78;
          } else {
            int discarded$180 = 0;
            ro.field_t = lj.a(var2);
            break L78;
          }
        }
        L79: {
          var2 = da.a((byte) -87, "graphics_medium");
          if (var2 == null) {
            break L79;
          } else {
            int discarded$181 = 0;
            hh.field_c = lj.a(var2);
            break L79;
          }
        }
        L80: {
          var2 = da.a((byte) -84, "graphics_high");
          if (null != var2) {
            int discarded$182 = 0;
            wf.field_q = lj.a(var2);
            break L80;
          } else {
            break L80;
          }
        }
        L81: {
          var2 = da.a((byte) 123, "soundcolon");
          if (null != var2) {
            int discarded$183 = 0;
            vb.field_e = lj.a(var2);
            break L81;
          } else {
            break L81;
          }
        }
        L82: {
          var2 = da.a((byte) -71, "musiccolon");
          if (var2 == null) {
            break L82;
          } else {
            int discarded$184 = 0;
            am.field_o = lj.a(var2);
            break L82;
          }
        }
        L83: {
          var2 = da.a((byte) -124, "graphicscolonspace");
          if (var2 != null) {
            int discarded$185 = 0;
            l.field_a = lj.a(var2);
            break L83;
          } else {
            break L83;
          }
        }
        L84: {
          var2 = da.a((byte) -67, "nursery_slopes");
          if (var2 != null) {
            int discarded$186 = 0;
            vk.field_x = lj.a(var2);
            break L84;
          } else {
            break L84;
          }
        }
        L85: {
          var2 = da.a((byte) 122, "squared_away");
          if (null != var2) {
            int discarded$187 = 0;
            to.field_r = lj.a(var2);
            break L85;
          } else {
            break L85;
          }
        }
        L86: {
          var2 = da.a((byte) 117, "next_steps");
          if (null == var2) {
            break L86;
          } else {
            int discarded$188 = 0;
            mi.field_u = lj.a(var2);
            break L86;
          }
        }
        L87: {
          var2 = da.a((byte) 121, "straight_and_narrow");
          if (null != var2) {
            int discarded$189 = 0;
            bq.field_b = lj.a(var2);
            break L87;
          } else {
            break L87;
          }
        }
        L88: {
          var2 = da.a((byte) -122, "bombing_along");
          if (var2 == null) {
            break L88;
          } else {
            int discarded$190 = 0;
            un.field_f = lj.a(var2);
            break L88;
          }
        }
        L89: {
          var2 = da.a((byte) 116, "amazing");
          if (var2 == null) {
            break L89;
          } else {
            int discarded$191 = 0;
            w.field_gb = lj.a(var2);
            break L89;
          }
        }
        L90: {
          var2 = da.a((byte) 106, "circuitous_route");
          if (null == var2) {
            break L90;
          } else {
            int discarded$192 = 0;
            nc.field_b = lj.a(var2);
            break L90;
          }
        }
        L91: {
          var2 = da.a((byte) -29, "leap_of_faith");
          if (var2 != null) {
            int discarded$193 = 0;
            bl.field_e = lj.a(var2);
            break L91;
          } else {
            break L91;
          }
        }
        L92: {
          var2 = da.a((byte) -30, "mustlogin,0");
          if (var2 == null) {
            break L92;
          } else {
            int discarded$194 = 0;
            qa.field_k[0] = lj.a(var2);
            break L92;
          }
        }
        L93: {
          var2 = da.a((byte) -101, "mustlogin,1");
          if (null != var2) {
            int discarded$195 = 0;
            qa.field_k[1] = lj.a(var2);
            break L93;
          } else {
            break L93;
          }
        }
        L94: {
          var2 = da.a((byte) 117, "mustlogin,2");
          if (null == var2) {
            break L94;
          } else {
            int discarded$196 = 0;
            qa.field_k[2] = lj.a(var2);
            break L94;
          }
        }
        L95: {
          var2 = da.a((byte) -26, "mustlogin,3");
          if (var2 != null) {
            int discarded$197 = 0;
            qa.field_k[3] = lj.a(var2);
            break L95;
          } else {
            break L95;
          }
        }
        L96: {
          var2 = da.a((byte) 126, "mustlogin,4");
          if (var2 != null) {
            int discarded$198 = 0;
            qa.field_k[4] = lj.a(var2);
            break L96;
          } else {
            break L96;
          }
        }
        L97: {
          var2 = da.a((byte) 123, "mustlogin,5");
          if (var2 == null) {
            break L97;
          } else {
            int discarded$199 = 0;
            qa.field_k[5] = lj.a(var2);
            break L97;
          }
        }
        L98: {
          var2 = da.a((byte) 126, "mustlogin,6");
          if (var2 == null) {
            break L98;
          } else {
            int discarded$200 = 0;
            qa.field_k[6] = lj.a(var2);
            break L98;
          }
        }
        L99: {
          var2 = da.a((byte) -66, "mustlogin,7");
          if (var2 != null) {
            int discarded$201 = 0;
            qa.field_k[7] = lj.a(var2);
            break L99;
          } else {
            break L99;
          }
        }
        dn.field_i = null;
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_b = null;
            field_f = null;
            field_e = null;
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "hg.B(" + 0 + 41);
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, t[] param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var10 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                if (param2 <= 0) {
                  break L1;
                } else {
                  var5_int = param4[0].field_w;
                  var6 = param4[2].field_w;
                  var7 = param4[1].field_w;
                  param4[0].d(param1, param3);
                  param4[2].d(param1 - (-param2 - -var6), param3);
                  ph.b(lj.field_c);
                  ph.f(param1 + var5_int, param3, -var6 + param2 + param1, param3 + param4[1].field_u);
                  var8 = var5_int + param1;
                  var9 = -var6 + param1 - -param2;
                  param1 = var8;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (~param1 <= ~var9) {
                          break L4;
                        } else {
                          param4[1].d(param1, param3);
                          param1 = param1 + var7;
                          if (var10 != 0) {
                            break L3;
                          } else {
                            if (var10 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      ph.a(lj.field_c);
                      break L3;
                    }
                    break L0;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("hg.C(").append(0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new Random();
        field_a = 0;
        field_f = new gq(2);
    }
}
