/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameStringTable extends IntrusiveNode {
    int field_l;
    static String field_i;
    int field_k;
    static int field_j;

    final static void a(int param0, Archive param1) {
        RuntimeException stackIn_294_0 = null;
        StringBuilder stackIn_294_1 = null;
        String stackIn_295_2 = null;
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
        var3 = TrackController.field_F ? 1 : 0;
        try {
          si.field_b = param1;
          var2 = DualLinkNode.a("game_name", -523);
          if (null != var2) {
            ta.a(32200, var2);
          }
          var2Lifetime1 = DualLinkNode.a("pauseanim", -523);
          if (var2Lifetime1 != null) {
            vl.field_E = ta.a(32200, var2Lifetime1);
          }
          var2Lifetime2 = DualLinkNode.a("first_page", -523);
          if (var2Lifetime2 != null) {
            l.field_n = ta.a(param0 + 32197, var2Lifetime2);
          }
          var2Lifetime3 = DualLinkNode.a("next_page", -523);
          if (var2Lifetime3 != null) {
            q.field_o = ta.a(param0 + 32197, var2Lifetime3);
          }
          var2Lifetime4 = DualLinkNode.a("button_pause_options", -523);
          if (var2Lifetime4 != null) {
            na.field_d = ta.a(param0 + 32197, var2Lifetime4);
          }
          var2Lifetime5 = DualLinkNode.a("button_esc_key", param0 ^ -522);
          if (null != var2Lifetime5) {
            bl.field_d = ta.a(param0 ^ 32203, var2Lifetime5);
          }
          var2Lifetime6 = DualLinkNode.a("button_restart_level", -523);
          if (var2Lifetime6 != null) {
            ca.field_d = ta.a(param0 + 32197, var2Lifetime6);
          }
          var2Lifetime7 = DualLinkNode.a("button_bkspc_key", -523);
          if (var2Lifetime7 != null) {
            th.field_i = ta.a(32200, var2Lifetime7);
          }
          var2Lifetime8 = DualLinkNode.a("level_bonus", param0 ^ -522);
          if (null != var2Lifetime8) {
            ob.field_o = ta.a(32200, var2Lifetime8);
          }
          var2Lifetime9 = DualLinkNode.a("level_bonus_doubled", param0 - 526);
          if (null != var2Lifetime9) {
            RandomAccessCacheFile.field_e = ta.a(32200, var2Lifetime9);
          }
          var2Lifetime10 = DualLinkNode.a("hint_level3", -523);
          if (var2Lifetime10 != null) {
            ki.field_a = ta.a(32200, var2Lifetime10);
          }
          var2Lifetime11 = DualLinkNode.a("hint_oops", -523);
          if (null != var2Lifetime11) {
            wa.field_n = ta.a(param0 ^ 32203, var2Lifetime11);
          }
          var2Lifetime12 = DualLinkNode.a("hint_controls", -523);
          if (null != var2Lifetime12) {
            ej.field_b = ta.a(32200, var2Lifetime12);
          }
          var2Lifetime13 = DualLinkNode.a("hint_move_push", param0 ^ -522);
          if (null != var2Lifetime13) {
            va.field_a = ta.a(32200, var2Lifetime13);
          }
          var2Lifetime14 = DualLinkNode.a("hint_ditto", -523);
          if (param0 != 3) {
            field_j = -91;
          }
          if (var2Lifetime14 != null) {
            jk.field_b = ta.a(32200, var2Lifetime14);
          }
          var2Lifetime15 = DualLinkNode.a("hint_finish", -523);
          if (null != var2Lifetime15) {
            sk.field_g = ta.a(param0 + 32197, var2Lifetime15);
          }
          var2Lifetime16 = DualLinkNode.a("hint_tooltips", param0 - 526);
          if (null != var2Lifetime16) {
            uk.field_d = ta.a(32200, var2Lifetime16);
          }
          var2Lifetime17 = DualLinkNode.a("continu", -523);
          if (var2Lifetime17 != null) {
            TrackController.field_C = ta.a(param0 ^ 32203, var2Lifetime17);
          }
          var2Lifetime18 = DualLinkNode.a("score_colon", -523);
          if (null != var2Lifetime18) {
            nj.field_d = ta.a(32200, var2Lifetime18);
          }
          var2Lifetime19 = DualLinkNode.a("level_value_colon", -523);
          if (null != var2Lifetime19) {
            ba.field_e = ta.a(32200, var2Lifetime19);
          }
          var2Lifetime20 = DualLinkNode.a("time_bonus_colon", param0 - 526);
          if (var2Lifetime20 != null) {
            hb.field_c = ta.a(32200, var2Lifetime20);
          }
          var2Lifetime21 = DualLinkNode.a("level", -523);
          if (null != var2Lifetime21) {
            LevelView.field_r = ta.a(32200, var2Lifetime21);
          }
          var2Lifetime22 = DualLinkNode.a("colon_space", -523);
          if (var2Lifetime22 != null) {
            u.field_k = ta.a(32200, var2Lifetime22);
          }
          var2Lifetime23 = DualLinkNode.a("congratulations", -523);
          if (var2Lifetime23 != null) {
            pi.field_f = ta.a(32200, var2Lifetime23);
          }
          var2Lifetime24 = DualLinkNode.a("instructionLabels,0", param0 - 526);
          if (var2Lifetime24 != null) {
            MovingBlock.field_p[0] = ta.a(param0 + 32197, var2Lifetime24);
          }
          var2Lifetime25 = DualLinkNode.a("instructionLabels,1", -523);
          if (null != var2Lifetime25) {
            MovingBlock.field_p[1] = ta.a(32200, var2Lifetime25);
          }
          var2Lifetime26 = DualLinkNode.a("instructionLabels,2", param0 ^ -522);
          if (var2Lifetime26 != null) {
            MovingBlock.field_p[2] = ta.a(32200, var2Lifetime26);
          }
          var2Lifetime27 = DualLinkNode.a("instructionLabels,3", -523);
          if (var2Lifetime27 != null) {
            MovingBlock.field_p[3] = ta.a(32200, var2Lifetime27);
          }
          var2Lifetime28 = DualLinkNode.a("tooltips,0", -523);
          if (null != var2Lifetime28) {
            ag.field_c[0] = ta.a(ma.a(param0, 32203), var2Lifetime28);
          }
          var2Lifetime29 = DualLinkNode.a("tooltips,1", -523);
          if (null != var2Lifetime29) {
            ag.field_c[1] = ta.a(32200, var2Lifetime29);
          }
          var2Lifetime30 = DualLinkNode.a("tooltips,2", -523);
          if (null != var2Lifetime30) {
            ag.field_c[2] = ta.a(32200, var2Lifetime30);
          }
          var2Lifetime31 = DualLinkNode.a("tooltips,3", -523);
          if (var2Lifetime31 != null) {
            ag.field_c[3] = ta.a(ma.a(param0, 32203), var2Lifetime31);
          }
          var2Lifetime32 = DualLinkNode.a("tooltips,4", -523);
          if (var2Lifetime32 != null) {
            ag.field_c[4] = ta.a(param0 + 32197, var2Lifetime32);
          }
          var2Lifetime33 = DualLinkNode.a("tooltips,5", param0 ^ -522);
          if (var2Lifetime33 != null) {
            ag.field_c[5] = ta.a(32200, var2Lifetime33);
          }
          var2Lifetime34 = DualLinkNode.a("tooltips,6", param0 - 526);
          if (var2Lifetime34 != null) {
            ag.field_c[6] = ta.a(param0 + 32197, var2Lifetime34);
          }
          var2Lifetime35 = DualLinkNode.a("tooltips,7", -523);
          if (null != var2Lifetime35) {
            ag.field_c[7] = ta.a(ma.a(param0, 32203), var2Lifetime35);
          }
          var2Lifetime36 = DualLinkNode.a("tooltips,8", -523);
          if (var2Lifetime36 != null) {
            ag.field_c[8] = ta.a(32200, var2Lifetime36);
          }
          var2Lifetime37 = DualLinkNode.a("tooltips,9", -523);
          if (var2Lifetime37 != null) {
            ag.field_c[9] = ta.a(param0 + 32197, var2Lifetime37);
          }
          var2Lifetime38 = DualLinkNode.a("tooltips,10", -523);
          if (var2Lifetime38 != null) {
            ag.field_c[10] = ta.a(32200, var2Lifetime38);
          }
          var2Lifetime39 = DualLinkNode.a("tooltips,11", -523);
          if (null != var2Lifetime39) {
            ag.field_c[11] = ta.a(32200, var2Lifetime39);
          }
          var2Lifetime40 = DualLinkNode.a("tooltips,12", -523);
          if (null != var2Lifetime40) {
            ag.field_c[12] = ta.a(32200, var2Lifetime40);
          }
          var2Lifetime41 = DualLinkNode.a("achievement_names,0", param0 - 526);
          if (null != var2Lifetime41) {
            wa.field_k[0] = ta.a(32200, var2Lifetime41);
          }
          var2Lifetime42 = DualLinkNode.a("achievement_names,1", -523);
          if (null != var2Lifetime42) {
            wa.field_k[1] = ta.a(32200, var2Lifetime42);
          }
          var2Lifetime43 = DualLinkNode.a("achievement_names,2", -523);
          if (var2Lifetime43 != null) {
            wa.field_k[2] = ta.a(param0 + 32197, var2Lifetime43);
          }
          var2Lifetime44 = DualLinkNode.a("achievement_names,3", -523);
          if (var2Lifetime44 != null) {
            wa.field_k[3] = ta.a(32200, var2Lifetime44);
          }
          var2Lifetime45 = DualLinkNode.a("achievement_names,4", -523);
          if (null != var2Lifetime45) {
            wa.field_k[4] = ta.a(32200, var2Lifetime45);
          }
          var2Lifetime46 = DualLinkNode.a("achievement_names,5", -523);
          if (null != var2Lifetime46) {
            wa.field_k[5] = ta.a(32200, var2Lifetime46);
          }
          var2Lifetime47 = DualLinkNode.a("achievement_names,6", -523);
          if (var2Lifetime47 != null) {
            wa.field_k[6] = ta.a(ma.a(param0, 32203), var2Lifetime47);
          }
          var2Lifetime48 = DualLinkNode.a("achievement_names,7", -523);
          if (null != var2Lifetime48) {
            wa.field_k[7] = ta.a(ma.a(param0, 32203), var2Lifetime48);
          }
          var2Lifetime49 = DualLinkNode.a("achievement_names,8", param0 ^ -522);
          if (null != var2Lifetime49) {
            wa.field_k[8] = ta.a(32200, var2Lifetime49);
          }
          var2Lifetime50 = DualLinkNode.a("achievement_names,9", -523);
          if (var2Lifetime50 != null) {
            wa.field_k[9] = ta.a(32200, var2Lifetime50);
          }
          var2Lifetime51 = DualLinkNode.a("achievement_names,10", -523);
          if (var2Lifetime51 != null) {
            wa.field_k[10] = ta.a(32200, var2Lifetime51);
          }
          var2Lifetime52 = DualLinkNode.a("achievement_names,11", -523);
          if (null != var2Lifetime52) {
            wa.field_k[11] = ta.a(32200, var2Lifetime52);
          }
          var2Lifetime53 = DualLinkNode.a("achievement_names,12", -523);
          if (var2Lifetime53 != null) {
            wa.field_k[12] = ta.a(param0 + 32197, var2Lifetime53);
          }
          var2Lifetime54 = DualLinkNode.a("achievement_criteria,0", -523);
          if (null != var2Lifetime54) {
            gj.field_b[0] = ta.a(32200, var2Lifetime54);
          }
          var2Lifetime55 = DualLinkNode.a("achievement_criteria,1", -523);
          if (var2Lifetime55 != null) {
            gj.field_b[1] = ta.a(param0 + 32197, var2Lifetime55);
          }
          var2Lifetime56 = DualLinkNode.a("achievement_criteria,2", -523);
          if (null != var2Lifetime56) {
            gj.field_b[2] = ta.a(32200, var2Lifetime56);
          }
          var2Lifetime57 = DualLinkNode.a("achievement_criteria,3", -523);
          if (null != var2Lifetime57) {
            gj.field_b[3] = ta.a(32200, var2Lifetime57);
          }
          var2Lifetime58 = DualLinkNode.a("achievement_criteria,4", param0 - 526);
          if (var2Lifetime58 != null) {
            gj.field_b[4] = ta.a(32200, var2Lifetime58);
          }
          var2Lifetime59 = DualLinkNode.a("achievement_criteria,5", -523);
          if (var2Lifetime59 != null) {
            gj.field_b[5] = ta.a(32200, var2Lifetime59);
          }
          var2Lifetime60 = DualLinkNode.a("achievement_criteria,6", param0 - 526);
          if (null != var2Lifetime60) {
            gj.field_b[6] = ta.a(32200, var2Lifetime60);
          }
          var2Lifetime61 = DualLinkNode.a("achievement_criteria,7", -523);
          if (var2Lifetime61 != null) {
            gj.field_b[7] = ta.a(param0 + 32197, var2Lifetime61);
          }
          var2Lifetime62 = DualLinkNode.a("achievement_criteria,8", -523);
          if (var2Lifetime62 != null) {
            gj.field_b[8] = ta.a(32200, var2Lifetime62);
          }
          var2Lifetime63 = DualLinkNode.a("achievement_criteria,9", -523);
          if (var2Lifetime63 != null) {
            gj.field_b[9] = ta.a(param0 + 32197, var2Lifetime63);
          }
          var2Lifetime64 = DualLinkNode.a("achievement_criteria,10", param0 - 526);
          if (var2Lifetime64 != null) {
            gj.field_b[10] = ta.a(32200, var2Lifetime64);
          }
          var2Lifetime65 = DualLinkNode.a("achievement_criteria,11", param0 ^ -522);
          if (null != var2Lifetime65) {
            gj.field_b[11] = ta.a(32200, var2Lifetime65);
          }
          var2Lifetime66 = DualLinkNode.a("achievement_criteria,12", -523);
          if (var2Lifetime66 != null) {
            gj.field_b[12] = ta.a(32200, var2Lifetime66);
          }
          var2Lifetime67 = DualLinkNode.a("login_register", param0 ^ -522);
          if (null != var2Lifetime67) {
            IntrusiveNode.field_a = ta.a(param0 + 32197, var2Lifetime67);
          }
          var2Lifetime68 = DualLinkNode.a("str_tooltips", param0 ^ -522);
          if (var2Lifetime68 != null) {
            ag.field_a = ta.a(32200, var2Lifetime68);
          }
          var2Lifetime69 = DualLinkNode.a("okay", -523);
          if (var2Lifetime69 != null) {
            dj.field_a = ta.a(32200, var2Lifetime69);
          }
          var2Lifetime70 = DualLinkNode.a("all", -523);
          if (null != var2Lifetime70) {
            mj.field_f = ta.a(param0 ^ 32203, var2Lifetime70);
          }
          var2Lifetime71 = DualLinkNode.a("mine", -523);
          if (null != var2Lifetime71) {
            og.field_qb = ta.a(32200, var2Lifetime71);
          }
          var2Lifetime72 = DualLinkNode.a("besteach", -523);
          if (var2Lifetime72 != null) {
            vl.field_J = ta.a(32200, var2Lifetime72);
          }
          var2Lifetime73 = DualLinkNode.a("showall", -523);
          if (null != var2Lifetime73) {
            nf.field_h = ta.a(32200, var2Lifetime73);
          }
          var2Lifetime74 = DualLinkNode.a("showmine", param0 ^ -522);
          if (var2Lifetime74 != null) {
            ka.field_e = ta.a(32200, var2Lifetime74);
          }
          var2Lifetime75 = DualLinkNode.a("showbesteach", -523);
          if (var2Lifetime75 != null) {
            ag.field_g = ta.a(32200, var2Lifetime75);
          }
          var2Lifetime76 = DualLinkNode.a("instructions1", -523);
          if (var2Lifetime76 != null) {
            tf.field_b = ta.a(param0 + 32197, var2Lifetime76);
          }
          var2Lifetime77 = DualLinkNode.a("instructions2", -523);
          if (null != var2Lifetime77) {
            gh.field_e = ta.a(32200, var2Lifetime77);
          }
          var2Lifetime78 = DualLinkNode.a("congrats_free", -523);
          if (var2Lifetime78 != null) {
            ta.a(param0 + 32197, var2Lifetime78);
          }
          var2Lifetime79 = DualLinkNode.a("congrats_full", -523);
          if (null != var2Lifetime79) {
            ui.field_n = ta.a(32200, var2Lifetime79);
          }
          var2Lifetime80 = DualLinkNode.a("benefits_25levels", -523);
          if (var2Lifetime80 != null) {
            ta.a(32200, var2Lifetime80);
          }
          var2Lifetime81 = DualLinkNode.a("unreachedlevel_custommessage", -523);
          if (var2Lifetime81 != null) {
            GameKeyHandler.field_f = ta.a(32200, var2Lifetime81);
          }
          si.field_b = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_294_0 = var2_ref;
          stackIn_294_1 = new StringBuilder().append("vk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_295_2 = "null";
          } else {
            stackIn_295_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_294_0), ((StringBuilder) (Object) stackIn_294_1).append(stackIn_295_2).append(')').toString());
        }
        if (GameApplet.field_j != 0) {
          TrackController.field_F = (var3 == 0);
        }
    }

    final static String b(boolean param0) {
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            field_j = -13;
          }
          stackIn_4_0 = ab.field_b;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw LevelGrid.toClientException((Throwable) ((Object) var1), "vk.C(" + param0 + ')');
        }
    }

    private GameStringTable() throws Throwable {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw LevelGrid.toClientException((Throwable) ((Object) var1), "vk.<init>()");
        }
    }

    public static void d(int param0) {
        if (param0 != 2) {
          return;
        }
        try {
          field_i = null;
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "vk.A(" + param0 + ')');
        }
    }

    static {
        field_i = "Try again";
    }
}
