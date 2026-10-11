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
        RuntimeException stackIn_354_0 = null;
        StringBuilder stackIn_354_1 = null;
        String stackIn_355_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        byte[] var2Lifetime4;
        byte[] var2Lifetime5;
        byte[] var2Lifetime6;
        byte[] var2Lifetime7;
        byte[] var2Lifetime8;
        byte[] var2Lifetime9;
        byte[] var2Lifetime10;
        byte[] var2Lifetime11;
        byte[] var2Lifetime12;
        byte[] var2Lifetime13;
        byte[] var2Lifetime14;
        byte[] var2Lifetime15;
        byte[] var2Lifetime16;
        byte[] var2Lifetime17;
        byte[] var2Lifetime18;
        byte[] var2Lifetime19;
        byte[] var2Lifetime20;
        byte[] var2Lifetime21;
        byte[] var2Lifetime22;
        byte[] var2Lifetime23;
        byte[] var2Lifetime24;
        byte[] var2Lifetime25;
        byte[] var2Lifetime26;
        byte[] var2Lifetime27;
        byte[] var2Lifetime28;
        byte[] var2Lifetime29;
        byte[] var2Lifetime30;
        byte[] var2Lifetime31;
        byte[] var2Lifetime32;
        byte[] var2Lifetime33;
        byte[] var2Lifetime34;
        byte[] var2Lifetime35;
        byte[] var2Lifetime36;
        byte[] var2Lifetime37;
        byte[] var2Lifetime38;
        byte[] var2Lifetime39;
        byte[] var2Lifetime40;
        byte[] var2Lifetime41;
        byte[] var2Lifetime42;
        byte[] var2Lifetime43;
        byte[] var2Lifetime44;
        byte[] var2Lifetime45;
        byte[] var2Lifetime46;
        byte[] var2Lifetime47;
        byte[] var2Lifetime48;
        byte[] var2Lifetime49;
        byte[] var2Lifetime50;
        byte[] var2Lifetime51;
        byte[] var2Lifetime52;
        byte[] var2Lifetime53;
        byte[] var2Lifetime54;
        byte[] var2Lifetime55;
        byte[] var2Lifetime56;
        byte[] var2Lifetime57;
        byte[] var2Lifetime58;
        byte[] var2Lifetime59;
        byte[] var2Lifetime60;
        byte[] var2Lifetime61;
        byte[] var2Lifetime62;
        byte[] var2Lifetime63;
        byte[] var2Lifetime64;
        byte[] var2Lifetime65;
        byte[] var2Lifetime66;
        byte[] var2Lifetime67;
        byte[] var2Lifetime68;
        byte[] var2Lifetime69;
        byte[] var2Lifetime70;
        byte[] var2Lifetime71;
        byte[] var2Lifetime72;
        byte[] var2Lifetime73;
        byte[] var2Lifetime74;
        byte[] var2Lifetime75;
        byte[] var2Lifetime76;
        byte[] var2Lifetime77;
        byte[] var2Lifetime78;
        byte[] var2Lifetime79;
        byte[] var2Lifetime80;
        byte[] var2Lifetime81;
        byte[] var2Lifetime82;
        byte[] var2Lifetime83;
        byte[] var2Lifetime84;
        byte[] var2Lifetime85;
        byte[] var2Lifetime86;
        byte[] var2Lifetime87;
        byte[] var2Lifetime88;
        byte[] var2Lifetime89;
        byte[] var2Lifetime90;
        byte[] var2Lifetime91;
        byte[] var2Lifetime92;
        byte[] var2Lifetime93;
        byte[] var2Lifetime94;
        byte[] var2Lifetime95;
        byte[] var2Lifetime96;
        byte[] var2Lifetime97;
        byte[] var2Lifetime98;
        byte[] var2Lifetime99;
        try {
          dn.field_i = param1;
          var2 = da.a((byte) 115, "gamename");
          if (var2 != null) {
            cp.field_i = lj.a(var2, false);
          }
          var2Lifetime1 = da.a((byte) 117, "benefits_6worlds");
          if (var2Lifetime1 != null) {
            ld.field_b = lj.a(var2Lifetime1, false);
          }
          var2Lifetime2 = da.a((byte) -25, "benefits_30levels");
          if (null != var2Lifetime2) {
            hm.field_t = lj.a(var2Lifetime2, false);
          }
          var2Lifetime3 = da.a((byte) 110, "benefits_newtwists");
          if (var2Lifetime3 != null) {
            qa.field_j = lj.a(var2Lifetime3, false);
          }
          var2Lifetime4 = da.a((byte) 106, "spikes");
          if (null != var2Lifetime4) {
            gi.field_b = lj.a(var2Lifetime4, false);
          }
          var2Lifetime5 = da.a((byte) -59, "gyro");
          if (var2Lifetime5 != null) {
            ea.field_u = lj.a(var2Lifetime5, false);
          }
          var2Lifetime6 = da.a((byte) 112, "shield");
          if (null != var2Lifetime6) {
            je.field_i = lj.a(var2Lifetime6, false);
          }
          var2Lifetime7 = da.a((byte) -79, "skin");
          if (null != var2Lifetime7) {
            nc.field_c = lj.a(var2Lifetime7, false);
          }
          var2Lifetime8 = da.a((byte) -43, "unknown_quantity");
          if (null != var2Lifetime8) {
            af.field_b = lj.a(var2Lifetime8, false);
          }
          var2Lifetime9 = da.a((byte) -51, "space_x_unknown");
          if (null != var2Lifetime9) {
            nl.field_u = lj.a(var2Lifetime9, false);
          }
          var2Lifetime10 = da.a((byte) -98, "yourscore");
          if (null != var2Lifetime10) {
            om.field_e = lj.a(var2Lifetime10, false);
          }
          var2Lifetime11 = da.a((byte) 124, "freegame_completed");
          if (null != var2Lifetime11) {
            vf.field_m = lj.a(var2Lifetime11, false);
          }
          var2Lifetime12 = da.a((byte) -56, "worldcolon");
          if (var2Lifetime12 != null) {
            wa.field_c = lj.a(var2Lifetime12, false);
          }
          var2Lifetime13 = da.a((byte) 104, "levelcolon");
          if (null != var2Lifetime13) {
            lj.field_b = lj.a(var2Lifetime13, false);
          }
          var2Lifetime14 = da.a((byte) -84, "achievement_names,0");
          if (var2Lifetime14 != null) {
            k.field_b[0] = lj.a(var2Lifetime14, false);
          }
          var2Lifetime15 = da.a((byte) 113, "achievement_names,1");
          if (var2Lifetime15 != null) {
            k.field_b[1] = lj.a(var2Lifetime15, false);
          }
          var2Lifetime16 = da.a((byte) -61, "achievement_names,2");
          if (null != var2Lifetime16) {
            k.field_b[2] = lj.a(var2Lifetime16, false);
          }
          var2Lifetime17 = da.a((byte) 108, "achievement_names,3");
          if (var2Lifetime17 != null) {
            k.field_b[3] = lj.a(var2Lifetime17, false);
          }
          var2Lifetime18 = da.a((byte) -61, "achievement_names,4");
          if (null != var2Lifetime18) {
            k.field_b[4] = lj.a(var2Lifetime18, false);
          }
          var2Lifetime19 = da.a((byte) 112, "achievement_names,5");
          if (null != var2Lifetime19) {
            k.field_b[5] = lj.a(var2Lifetime19, false);
          }
          var2Lifetime20 = da.a((byte) -69, "achievement_names,6");
          if (var2Lifetime20 != null) {
            k.field_b[6] = lj.a(var2Lifetime20, false);
          }
          var2Lifetime21 = da.a((byte) -50, "achievement_names,7");
          if (null != var2Lifetime21) {
            k.field_b[7] = lj.a(var2Lifetime21, false);
          }
          var2Lifetime22 = da.a((byte) -49, "achievement_names,8");
          if (var2Lifetime22 != null) {
            k.field_b[8] = lj.a(var2Lifetime22, false);
          }
          var2Lifetime23 = da.a((byte) 104, "achievement_names,9");
          if (var2Lifetime23 != null) {
            k.field_b[9] = lj.a(var2Lifetime23, false);
          }
          var2Lifetime24 = da.a((byte) -97, "achievement_names,10");
          if (null != var2Lifetime24) {
            k.field_b[10] = lj.a(var2Lifetime24, false);
          }
          var2Lifetime25 = da.a((byte) -120, "achievement_names,11");
          if (null != var2Lifetime25) {
            k.field_b[11] = lj.a(var2Lifetime25, false);
          }
          var2Lifetime26 = da.a((byte) 106, "achievement_names,12");
          if (null != var2Lifetime26) {
            k.field_b[12] = lj.a(var2Lifetime26, false);
          }
          var2Lifetime27 = da.a((byte) -60, "achievement_names,13");
          if (var2Lifetime27 != null) {
            k.field_b[13] = lj.a(var2Lifetime27, false);
          }
          var2Lifetime28 = da.a((byte) -104, "achievement_names,14");
          if (var2Lifetime28 != null) {
            k.field_b[14] = lj.a(var2Lifetime28, false);
          }
          var2Lifetime29 = da.a((byte) -22, "achievement_names,15");
          if (null != var2Lifetime29) {
            k.field_b[15] = lj.a(var2Lifetime29, false);
          }
          var2Lifetime30 = da.a((byte) -73, "achievement_names,16");
          if (var2Lifetime30 != null) {
            k.field_b[16] = lj.a(var2Lifetime30, false);
          }
          var2Lifetime31 = da.a((byte) -62, "achievement_criteria,0");
          if (var2Lifetime31 != null) {
            cn.field_a[0] = lj.a(var2Lifetime31, false);
          }
          var2Lifetime32 = da.a((byte) -49, "achievement_criteria,1");
          if (null != var2Lifetime32) {
            cn.field_a[1] = lj.a(var2Lifetime32, false);
          }
          var2Lifetime33 = da.a((byte) 109, "achievement_criteria,2");
          if (var2Lifetime33 != null) {
            cn.field_a[2] = lj.a(var2Lifetime33, false);
          }
          var2Lifetime34 = da.a((byte) 125, "achievement_criteria,3");
          if (var2Lifetime34 != null) {
            cn.field_a[3] = lj.a(var2Lifetime34, false);
          }
          var2Lifetime35 = da.a((byte) 113, "achievement_criteria,4");
          if (var2Lifetime35 != null) {
            cn.field_a[4] = lj.a(var2Lifetime35, false);
          }
          var2Lifetime36 = da.a((byte) 116, "achievement_criteria,5");
          if (null != var2Lifetime36) {
            cn.field_a[5] = lj.a(var2Lifetime36, false);
          }
          var2Lifetime37 = da.a((byte) 108, "achievement_criteria,6");
          var3 = -99 / ((20 - param0) / 43);
          if (null != var2Lifetime37) {
            cn.field_a[6] = lj.a(var2Lifetime37, false);
          }
          var2Lifetime38 = da.a((byte) -112, "achievement_criteria,7");
          if (var2Lifetime38 != null) {
            cn.field_a[7] = lj.a(var2Lifetime38, false);
          }
          var2Lifetime39 = da.a((byte) 119, "achievement_criteria,8");
          if (null != var2Lifetime39) {
            cn.field_a[8] = lj.a(var2Lifetime39, false);
          }
          var2Lifetime40 = da.a((byte) 111, "achievement_criteria,9");
          if (var2Lifetime40 != null) {
            cn.field_a[9] = lj.a(var2Lifetime40, false);
          }
          var2Lifetime41 = da.a((byte) 127, "achievement_criteria,10");
          if (null != var2Lifetime41) {
            cn.field_a[10] = lj.a(var2Lifetime41, false);
          }
          var2Lifetime42 = da.a((byte) 106, "achievement_criteria,11");
          if (var2Lifetime42 != null) {
            cn.field_a[11] = lj.a(var2Lifetime42, false);
          }
          var2Lifetime43 = da.a((byte) 104, "achievement_criteria,12");
          if (null != var2Lifetime43) {
            cn.field_a[12] = lj.a(var2Lifetime43, false);
          }
          var2Lifetime44 = da.a((byte) 117, "achievement_criteria,13");
          if (var2Lifetime44 != null) {
            cn.field_a[13] = lj.a(var2Lifetime44, false);
          }
          var2Lifetime45 = da.a((byte) 121, "achievement_criteria,14");
          if (null != var2Lifetime45) {
            cn.field_a[14] = lj.a(var2Lifetime45, false);
          }
          var2Lifetime46 = da.a((byte) 115, "achievement_criteria,15");
          if (null != var2Lifetime46) {
            cn.field_a[15] = lj.a(var2Lifetime46, false);
          }
          var2Lifetime47 = da.a((byte) -48, "achievement_criteria,16");
          if (null != var2Lifetime47) {
            cn.field_a[16] = lj.a(var2Lifetime47, false);
          }
          var2Lifetime48 = da.a((byte) -54, "powerup_descriptions,0");
          if (null != var2Lifetime48) {
            m.field_n[0] = lj.a(var2Lifetime48, false);
          }
          var2Lifetime49 = da.a((byte) -71, "powerup_descriptions,1");
          if (null != var2Lifetime49) {
            m.field_n[1] = lj.a(var2Lifetime49, false);
          }
          var2Lifetime50 = da.a((byte) 118, "powerup_descriptions,2");
          if (var2Lifetime50 != null) {
            m.field_n[2] = lj.a(var2Lifetime50, false);
          }
          var2Lifetime51 = da.a((byte) 105, "powerup_descriptions,4");
          if (null != var2Lifetime51) {
            m.field_n[4] = lj.a(var2Lifetime51, false);
          }
          var2Lifetime52 = da.a((byte) -114, "powerup_descriptions,5");
          if (null != var2Lifetime52) {
            m.field_n[5] = lj.a(var2Lifetime52, false);
          }
          var2Lifetime53 = da.a((byte) 112, "powerup_descriptions,6");
          if (null != var2Lifetime53) {
            m.field_n[6] = lj.a(var2Lifetime53, false);
          }
          var2Lifetime54 = da.a((byte) -100, "powerup_descriptions,7");
          if (var2Lifetime54 != null) {
            m.field_n[7] = lj.a(var2Lifetime54, false);
          }
          var2Lifetime55 = da.a((byte) 119, "powerup_descriptions,8");
          if (var2Lifetime55 != null) {
            m.field_n[8] = lj.a(var2Lifetime55, false);
          }
          var2Lifetime56 = da.a((byte) 112, "powerup_descriptions,9");
          if (var2Lifetime56 != null) {
            m.field_n[9] = lj.a(var2Lifetime56, false);
          }
          var2Lifetime57 = da.a((byte) -29, "powerup_descriptions,18");
          if (var2Lifetime57 != null) {
            m.field_n[18] = lj.a(var2Lifetime57, false);
          }
          var2Lifetime58 = da.a((byte) -74, "surface_descriptions,0");
          if (null != var2Lifetime58) {
            ga.field_d[0] = lj.a(var2Lifetime58, false);
          }
          var2Lifetime59 = da.a((byte) 114, "surface_descriptions,1");
          if (var2Lifetime59 != null) {
            ga.field_d[1] = lj.a(var2Lifetime59, false);
          }
          var2Lifetime60 = da.a((byte) 127, "surface_descriptions,2");
          if (null != var2Lifetime60) {
            ga.field_d[2] = lj.a(var2Lifetime60, false);
          }
          var2Lifetime61 = da.a((byte) -119, "surface_descriptions,3");
          if (var2Lifetime61 != null) {
            ga.field_d[3] = lj.a(var2Lifetime61, false);
          }
          var2Lifetime62 = da.a((byte) 117, "surface_descriptions,4");
          if (null != var2Lifetime62) {
            ga.field_d[4] = lj.a(var2Lifetime62, false);
          }
          var2Lifetime63 = da.a((byte) 119, "surface_descriptions,5");
          if (null != var2Lifetime63) {
            ga.field_d[5] = lj.a(var2Lifetime63, false);
          }
          var2Lifetime64 = da.a((byte) 109, "nameofthegame");
          if (null != var2Lifetime64) {
            vd.field_a = lj.a(var2Lifetime64, false);
          }
          var2Lifetime65 = da.a((byte) 117, "gyro_warning");
          if (var2Lifetime65 != null) {
            hl.field_c = lj.a(var2Lifetime65, false);
          }
          var2Lifetime66 = da.a((byte) -108, "lookoutfor");
          if (var2Lifetime66 != null) {
            eq.field_c = lj.a(var2Lifetime66, false);
          }
          var2Lifetime67 = da.a((byte) -70, "surfaces_colon");
          if (var2Lifetime67 != null) {
            vp.field_G = lj.a(var2Lifetime67, false);
          }
          var2Lifetime68 = da.a((byte) 123, "noanimalsharmed");
          if (null != var2Lifetime68) {
            q.field_i = lj.a(var2Lifetime68, false);
          }
          var2Lifetime69 = da.a((byte) -119, "timemeanspoints");
          if (var2Lifetime69 != null) {
            lj.a(var2Lifetime69, false);
          }
          var2Lifetime70 = da.a((byte) -93, "torquing_bonus");
          if (var2Lifetime70 != null) {
            fh.field_s = lj.a(var2Lifetime70, false);
          }
          var2Lifetime71 = da.a((byte) 111, "world_level");
          if (var2Lifetime71 != null) {
            qj.field_b = lj.a(var2Lifetime71, false);
          }
          var2Lifetime72 = da.a((byte) -87, "click_to_skip");
          if (null != var2Lifetime72) {
            kk.field_q = lj.a(var2Lifetime72, false);
          }
          var2Lifetime73 = da.a((byte) -121, "world_complete");
          if (null != var2Lifetime73) {
            pc.field_n = lj.a(var2Lifetime73, false);
          }
          var2Lifetime74 = da.a((byte) -26, "powerups_collected");
          if (null != var2Lifetime74) {
            ka.field_l = lj.a(var2Lifetime74, false);
          }
          var2Lifetime75 = da.a((byte) 119, "highscores_all");
          if (null != var2Lifetime75) {
            ae.field_lb = lj.a(var2Lifetime75, false);
          }
          var2Lifetime76 = da.a((byte) -55, "highscores_mine");
          if (var2Lifetime76 != null) {
            qe.field_a = lj.a(var2Lifetime76, false);
          }
          var2Lifetime77 = da.a((byte) -64, "highscores_besteach");
          if (var2Lifetime77 != null) {
            ai.field_m = lj.a(var2Lifetime77, false);
          }
          var2Lifetime78 = da.a((byte) 107, "graphics_low");
          if (null != var2Lifetime78) {
            ro.field_t = lj.a(var2Lifetime78, false);
          }
          var2Lifetime79 = da.a((byte) -87, "graphics_medium");
          if (var2Lifetime79 != null) {
            hh.field_c = lj.a(var2Lifetime79, false);
          }
          var2Lifetime80 = da.a((byte) -84, "graphics_high");
          if (null != var2Lifetime80) {
            wf.field_q = lj.a(var2Lifetime80, false);
          }
          var2Lifetime81 = da.a((byte) 123, "soundcolon");
          if (null != var2Lifetime81) {
            vb.field_e = lj.a(var2Lifetime81, false);
          }
          var2Lifetime82 = da.a((byte) -71, "musiccolon");
          if (var2Lifetime82 != null) {
            am.field_o = lj.a(var2Lifetime82, false);
          }
          var2Lifetime83 = da.a((byte) -124, "graphicscolonspace");
          if (var2Lifetime83 != null) {
            l.field_a = lj.a(var2Lifetime83, false);
          }
          var2Lifetime84 = da.a((byte) -67, "nursery_slopes");
          if (var2Lifetime84 != null) {
            vk.field_x = lj.a(var2Lifetime84, false);
          }
          var2Lifetime85 = da.a((byte) 122, "squared_away");
          if (null != var2Lifetime85) {
            to.field_r = lj.a(var2Lifetime85, false);
          }
          var2Lifetime86 = da.a((byte) 117, "next_steps");
          if (null != var2Lifetime86) {
            mi.field_u = lj.a(var2Lifetime86, false);
          }
          var2Lifetime87 = da.a((byte) 121, "straight_and_narrow");
          if (null != var2Lifetime87) {
            bq.field_b = lj.a(var2Lifetime87, false);
          }
          var2Lifetime88 = da.a((byte) -122, "bombing_along");
          if (var2Lifetime88 != null) {
            un.field_f = lj.a(var2Lifetime88, false);
          }
          var2Lifetime89 = da.a((byte) 116, "amazing");
          if (var2Lifetime89 != null) {
            w.field_gb = lj.a(var2Lifetime89, false);
          }
          var2Lifetime90 = da.a((byte) 106, "circuitous_route");
          if (null != var2Lifetime90) {
            nc.field_b = lj.a(var2Lifetime90, false);
          }
          var2Lifetime91 = da.a((byte) -29, "leap_of_faith");
          if (var2Lifetime91 != null) {
            bl.field_e = lj.a(var2Lifetime91, false);
          }
          var2Lifetime92 = da.a((byte) -30, "mustlogin,0");
          if (var2Lifetime92 != null) {
            qa.field_k[0] = lj.a(var2Lifetime92, false);
          }
          var2Lifetime93 = da.a((byte) -101, "mustlogin,1");
          if (null != var2Lifetime93) {
            qa.field_k[1] = lj.a(var2Lifetime93, false);
          }
          var2Lifetime94 = da.a((byte) 117, "mustlogin,2");
          if (null != var2Lifetime94) {
            qa.field_k[2] = lj.a(var2Lifetime94, false);
          }
          var2Lifetime95 = da.a((byte) -26, "mustlogin,3");
          if (var2Lifetime95 != null) {
            qa.field_k[3] = lj.a(var2Lifetime95, false);
          }
          var2Lifetime96 = da.a((byte) 126, "mustlogin,4");
          if (var2Lifetime96 != null) {
            qa.field_k[4] = lj.a(var2Lifetime96, false);
          }
          var2Lifetime97 = da.a((byte) 123, "mustlogin,5");
          if (var2Lifetime97 != null) {
            qa.field_k[5] = lj.a(var2Lifetime97, false);
          }
          var2Lifetime98 = da.a((byte) 126, "mustlogin,6");
          if (var2Lifetime98 != null) {
            qa.field_k[6] = lj.a(var2Lifetime98, false);
          }
          var2Lifetime99 = da.a((byte) -66, "mustlogin,7");
          if (var2Lifetime99 != null) {
            qa.field_k[7] = lj.a(var2Lifetime99, false);
          }
          dn.field_i = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_354_0 = var2_ref;
          stackIn_354_1 = new StringBuilder().append("hg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_355_2 = "null";
          } else {
            stackIn_355_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_354_0), ((StringBuilder) (Object) stackIn_354_1).append(stackIn_355_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_f = null;
        field_e = null;
        if (param0) {
          return;
        }
        try {
          field_d = null;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "hg.B(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, t[] param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Torquing.field_u;
        try {
          if (param4 != null &&
            param2 > 0) {
            if (param0) {
              field_e = (Random) null;
            }
            var5_int = param4[0].field_w;
            var6 = param4[2].field_w;
            var7 = param4[1].field_w;
            param4[0].d(param1, param3);
            param4[2].d(param1 - (-param2 + var6), param3);
            ph.b(lj.field_c);
            ph.f(param1 + var5_int, param3, -var6 + param2 + param1, param3 + param4[1].field_u);
            var8 = var5_int + param1;
            var9 = -var6 + param1 + param2;
            param1 = var8;
            while (param1 < var9) {
              param4[1].d(param1, param3);
              param1 = param1 + var7;
              if (var10 != 0) {
                return;
              }
            }
            ph.a(lj.field_c);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("hg.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
        field_e = new Random();
        field_a = 0;
        field_f = new gq(2);
    }
}
