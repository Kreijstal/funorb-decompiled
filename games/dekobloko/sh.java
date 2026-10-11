/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static cb field_g;
    static String field_h;
    static boolean field_j;
    static String field_b;
    static String field_e;
    static String field_c;
    static mi field_a;
    static long field_f;
    static int field_i;
    static af field_d;

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 >= -17) {
            field_a = (mi) null;
          }
          field_d = null;
          field_h = null;
          field_c = null;
          field_e = null;
          field_a = null;
          field_b = null;
          field_g = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "sh.C(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        try {
          k.field_e = null;
          wd.field_d = false;
          pa.field_Z = -1;
          dh.field_e = -1;
          jc.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "sh.D(" + param0 + ')');
        }
    }

    final static void a(byte[] param0, int param1, int param2, int[] param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        try {
          var5_int = 0;
          L0: while (true) {
            if (var5_int < a.field_r.length) {
              param2 = a.field_r[var5_int];
              stackIn_13_0 = var5_int << 4;
              if (var7 != 0) {
                break L0;
              }
              var6 = stackIn_13_0;
              while (true) {
                incrementValue$0 = param2;
                param2--;
                if (0 != incrementValue$0) {
                  incrementValue$1 = var6;
                  var6++;
                  param4 = hb.field_Vb[incrementValue$1];
                  dupTemp$2 = param0[param4];
                  dupTemp$3 = param3[dupTemp$2];
                  param3[dupTemp$2] = dupTemp$3 + 1;
                  hb.field_Vb[dupTemp$3] = param4;
                  continue;
                }
                break;
              }
              var5_int++;
              continue L0;
            }
            stackIn_13_0 = param1;
            break;
          }
          if (stackIn_13_0 != -25724) {
            sh.a(-65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("sh.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ck param7, int param8) {
        RuntimeException runtimeException = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_intLifetime1;
        int var10Lifetime1;
        try {
          var9_int = param3 + (param7.field_F + param6 - param0);
          var10 = param4 + (param3 + param7.field_F) + param6;
          if (param2 != 25547) {
            sh.a((byte[]) null, 13, 74, (int[]) null, -77);
          }
          var11 = param8 + param7.field_z + (param7.field_H >> 1);
          hk.f(var9_int, 0, var10, var11 + param5);
          param7.f(-1 + param3, param8 - 1, param1);
          param7.f(param3 - 1, param8 + 1, param1);
          hk.a(he.field_V);
          hk.f(var9_int + 1, 0, var10 + 1, param5 + var11);
          param7.f(param3 + 1, -1 + param8, param1);
          param7.f(1 + param3, param8 + 1, param1);
          hk.a(he.field_V);
          var10Lifetime1 = -param0 - param6 + param3 + param7.field_F + param7.field_I;
          var9_intLifetime1 = -param4 + (-param6 + param7.field_I + param7.field_F) + param3;
          hk.f(var9_intLifetime1, -param5 + var11, var10Lifetime1, 480);
          param7.f(param3 - 1, -1 + param8, param1);
          param7.f(param3 - 1, 1 + param8, param1);
          hk.a(he.field_V);
          hk.f(1 + var9_intLifetime1, var11 - param5, var10Lifetime1 + 1, 480);
          param7.f(1 + param3, -1 + param8, param1);
          param7.f(param3 + 1, param8 + 1, param1);
          hk.a(he.field_V);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("sh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param8).append(')').toString());
        }
    }

    final static void a(boolean param0, ji param1) {
        RuntimeException stackIn_926_0 = null;
        StringBuilder stackIn_926_1 = null;
        String stackIn_927_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
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
        byte[] var2Lifetime100;
        byte[] var2Lifetime101;
        byte[] var2Lifetime102;
        byte[] var2Lifetime103;
        byte[] var2Lifetime104;
        byte[] var2Lifetime105;
        byte[] var2Lifetime106;
        byte[] var2Lifetime107;
        byte[] var2Lifetime108;
        byte[] var2Lifetime109;
        byte[] var2Lifetime110;
        byte[] var2Lifetime111;
        byte[] var2Lifetime112;
        byte[] var2Lifetime113;
        byte[] var2Lifetime114;
        byte[] var2Lifetime115;
        byte[] var2Lifetime116;
        byte[] var2Lifetime117;
        byte[] var2Lifetime118;
        byte[] var2Lifetime119;
        byte[] var2Lifetime120;
        byte[] var2Lifetime121;
        byte[] var2Lifetime122;
        byte[] var2Lifetime123;
        byte[] var2Lifetime124;
        byte[] var2Lifetime125;
        byte[] var2Lifetime126;
        byte[] var2Lifetime127;
        byte[] var2Lifetime128;
        byte[] var2Lifetime129;
        byte[] var2Lifetime130;
        byte[] var2Lifetime131;
        byte[] var2Lifetime132;
        byte[] var2Lifetime133;
        byte[] var2Lifetime134;
        byte[] var2Lifetime135;
        byte[] var2Lifetime136;
        byte[] var2Lifetime137;
        byte[] var2Lifetime138;
        byte[] var2Lifetime139;
        byte[] var2Lifetime140;
        byte[] var2Lifetime141;
        byte[] var2Lifetime142;
        byte[] var2Lifetime143;
        byte[] var2Lifetime144;
        byte[] var2Lifetime145;
        byte[] var2Lifetime146;
        byte[] var2Lifetime147;
        byte[] var2Lifetime148;
        byte[] var2Lifetime149;
        byte[] var2Lifetime150;
        byte[] var2Lifetime151;
        byte[] var2Lifetime152;
        byte[] var2Lifetime153;
        byte[] var2Lifetime154;
        byte[] var2Lifetime155;
        byte[] var2Lifetime156;
        byte[] var2Lifetime157;
        byte[] var2Lifetime158;
        byte[] var2Lifetime159;
        byte[] var2Lifetime160;
        byte[] var2Lifetime161;
        byte[] var2Lifetime162;
        byte[] var2Lifetime163;
        byte[] var2Lifetime164;
        byte[] var2Lifetime165;
        byte[] var2Lifetime166;
        byte[] var2Lifetime167;
        byte[] var2Lifetime168;
        byte[] var2Lifetime169;
        byte[] var2Lifetime170;
        byte[] var2Lifetime171;
        byte[] var2Lifetime172;
        byte[] var2Lifetime173;
        byte[] var2Lifetime174;
        byte[] var2Lifetime175;
        byte[] var2Lifetime176;
        byte[] var2Lifetime177;
        byte[] var2Lifetime178;
        byte[] var2Lifetime179;
        byte[] var2Lifetime180;
        byte[] var2Lifetime181;
        byte[] var2Lifetime182;
        byte[] var2Lifetime183;
        byte[] var2Lifetime184;
        byte[] var2Lifetime185;
        byte[] var2Lifetime186;
        byte[] var2Lifetime187;
        byte[] var2Lifetime188;
        byte[] var2Lifetime189;
        byte[] var2Lifetime190;
        byte[] var2Lifetime191;
        byte[] var2Lifetime192;
        byte[] var2Lifetime193;
        byte[] var2Lifetime194;
        byte[] var2Lifetime195;
        byte[] var2Lifetime196;
        byte[] var2Lifetime197;
        byte[] var2Lifetime198;
        byte[] var2Lifetime199;
        byte[] var2Lifetime200;
        byte[] var2Lifetime201;
        byte[] var2Lifetime202;
        byte[] var2Lifetime203;
        byte[] var2Lifetime204;
        byte[] var2Lifetime205;
        byte[] var2Lifetime206;
        byte[] var2Lifetime207;
        byte[] var2Lifetime208;
        byte[] var2Lifetime209;
        byte[] var2Lifetime210;
        byte[] var2Lifetime211;
        byte[] var2Lifetime212;
        byte[] var2Lifetime213;
        byte[] var2Lifetime214;
        byte[] var2Lifetime215;
        byte[] var2Lifetime216;
        byte[] var2Lifetime217;
        byte[] var2Lifetime218;
        byte[] var2Lifetime219;
        byte[] var2Lifetime220;
        byte[] var2Lifetime221;
        byte[] var2Lifetime222;
        byte[] var2Lifetime223;
        byte[] var2Lifetime224;
        byte[] var2Lifetime225;
        byte[] var2Lifetime226;
        byte[] var2Lifetime227;
        byte[] var2Lifetime228;
        byte[] var2Lifetime229;
        byte[] var2Lifetime230;
        byte[] var2Lifetime231;
        byte[] var2Lifetime232;
        byte[] var2Lifetime233;
        byte[] var2Lifetime234;
        byte[] var2Lifetime235;
        byte[] var2Lifetime236;
        byte[] var2Lifetime237;
        byte[] var2Lifetime238;
        byte[] var2Lifetime239;
        byte[] var2Lifetime240;
        byte[] var2Lifetime241;
        byte[] var2Lifetime242;
        byte[] var2Lifetime243;
        byte[] var2Lifetime244;
        byte[] var2Lifetime245;
        byte[] var2Lifetime246;
        byte[] var2Lifetime247;
        byte[] var2Lifetime248;
        byte[] var2Lifetime249;
        byte[] var2Lifetime250;
        byte[] var2Lifetime251;
        byte[] var2Lifetime252;
        byte[] var2Lifetime253;
        byte[] var2Lifetime254;
        byte[] var2Lifetime255;
        byte[] var2Lifetime256;
        byte[] var2Lifetime257;
        byte[] var2Lifetime258;
        byte[] var2Lifetime259;
        byte[] var2Lifetime260;
        try {
          pc.field_b = param1;
          var2 = kb.a(-24, "gamename");
          if (var2 != null) {
            ph.field_Gb = qj.a(var2, 2);
          }
          var2Lifetime1 = kb.a(-18, "benefits,0");
          if (null != var2Lifetime1) {
            ac.field_z[0] = qj.a(var2Lifetime1, 2);
          }
          var2Lifetime2 = kb.a(-116, "benefits,1");
          if (null != var2Lifetime2) {
            ac.field_z[1] = qj.a(var2Lifetime2, 2);
          }
          var2Lifetime3 = kb.a(-72, "benefits,2");
          if (null != var2Lifetime3) {
            ac.field_z[2] = qj.a(var2Lifetime3, 2);
          }
          var2Lifetime4 = kb.a(-52, "benefits,3");
          if (var2Lifetime4 != null) {
            ac.field_z[3] = qj.a(var2Lifetime4, 2);
          }
          var2Lifetime5 = kb.a(-30, "benefits,4");
          if (var2Lifetime5 != null) {
            ac.field_z[4] = qj.a(var2Lifetime5, 2);
          }
          var2Lifetime6 = kb.a(-29, "benefits,5");
          if (null != var2Lifetime6) {
            ac.field_z[5] = qj.a(var2Lifetime6, 2);
          }
          var2Lifetime7 = kb.a(-58, "waitingfor_backgrounds");
          if (null != var2Lifetime7) {
            qa.field_w = qj.a(var2Lifetime7, 2);
          }
          var2Lifetime8 = kb.a(-68, "loading_backgrounds");
          if (null != var2Lifetime8) {
            ga.field_b = qj.a(var2Lifetime8, 2);
          }
          var2Lifetime9 = kb.a(-75, "mp_x_players_wanttodraw");
          if (var2Lifetime9 != null) {
            we.field_e = qj.a(var2Lifetime9, 2);
          }
          var2Lifetime10 = kb.a(-77, "press_esc_to_accept");
          if (var2Lifetime10 != null) {
            cg.field_b = qj.a(var2Lifetime10, 2);
          }
          var2Lifetime11 = kb.a(-112, "keycode_rotateleft");
          if (null != var2Lifetime11) {
            oh.field_n = var2Lifetime11[0] & 255;
          }
          var2Lifetime12 = kb.a(-90, "keycode_rotateright");
          if (null != var2Lifetime12) {
            um.field_d = var2Lifetime12[0] & 255;
          }
          var2Lifetime13 = kb.a(-76, "rated_membersonly");
          if (var2Lifetime13 != null) {
            uj.field_g = qj.a(var2Lifetime13, 2);
          }
          var2Lifetime14 = kb.a(-97, "staminamode");
          if (null != var2Lifetime14) {
            gn.field_d = qj.a(var2Lifetime14, 2);
          }
          var2Lifetime15 = kb.a(-63, "masterchallenge");
          if (var2Lifetime15 != null) {
            b.field_Q = qj.a(var2Lifetime15, 2);
          }
          var2Lifetime16 = kb.a(-54, "challenge_highscores");
          if (null != var2Lifetime16) {
            ul.field_b = qj.a(var2Lifetime16, 2);
          }
          var2Lifetime17 = kb.a(-103, "stamina_highscores");
          if (null != var2Lifetime17) {
            ak.field_e = qj.a(var2Lifetime17, 2);
          }
          var2Lifetime18 = kb.a(-125, "multiplayer_rankings");
          if (null != var2Lifetime18) {
            u.field_g = qj.a(var2Lifetime18, 2);
          }
          var2Lifetime19 = kb.a(-113, "player");
          if (null != var2Lifetime19) {
            ub.field_e = qj.a(var2Lifetime19, 2);
          }
          var2Lifetime20 = kb.a(-106, "status");
          if (null != var2Lifetime20) {
            tf.field_ab = qj.a(var2Lifetime20, 2);
          }
          var2Lifetime21 = kb.a(-46, "position");
          if (var2Lifetime21 != null) {
            p.field_d = qj.a(var2Lifetime21, 2);
          }
          var2Lifetime22 = kb.a(-126, "winner");
          if (null != var2Lifetime22) {
            oi.field_e = qj.a(var2Lifetime22, 2);
          }
          var2Lifetime23 = kb.a(-111, "drawn");
          if (var2Lifetime23 != null) {
            oi.field_b = qj.a(var2Lifetime23, 2);
          }
          var2Lifetime24 = kb.a(-78, "playing");
          if (null != var2Lifetime24) {
            eg.field_a = qj.a(var2Lifetime24, 2);
          }
          var2Lifetime25 = kb.a(-116, "resigned");
          if (null != var2Lifetime25) {
            v.field_f = qj.a(var2Lifetime25, 2);
          }
          var2Lifetime26 = kb.a(-119, "left");
          if (null != var2Lifetime26) {
            rc.field_h = qj.a(var2Lifetime26, 2);
          }
          var2Lifetime27 = kb.a(-108, "defeated");
          if (var2Lifetime27 != null) {
            wl.field_s = qj.a(var2Lifetime27, 2);
          }
          var2Lifetime28 = kb.a(-58, "rematch_request");
          if (var2Lifetime28 != null) {
            we.field_g = qj.a(var2Lifetime28, 2);
          }
          var2Lifetime29 = kb.a(-95, "draw_request");
          if (var2Lifetime29 != null) {
            sk.field_b = qj.a(var2Lifetime29, 2);
          }
          var2Lifetime30 = kb.a(-21, "ready");
          if (null != var2Lifetime30) {
            ub.field_b = qj.a(var2Lifetime30, 2);
          }
          var2Lifetime31 = kb.a(-82, "steady");
          if (null != var2Lifetime31) {
            ui.field_o = qj.a(var2Lifetime31, 2);
          }
          var2Lifetime32 = kb.a(-80, "total");
          if (var2Lifetime32 != null) {
            n.field_a = qj.a(var2Lifetime32, 2);
          }
          var2Lifetime33 = kb.a(-31, "settling_score");
          if (var2Lifetime33 != null) {
            th.field_a = qj.a(var2Lifetime33, 2);
          }
          var2Lifetime34 = kb.a(-44, "matching_score");
          if (var2Lifetime34 != null) {
            t.field_bb = qj.a(var2Lifetime34, 2);
          }
          if (param0) {
            return;
          }
          var2Lifetime35 = kb.a(-42, "eliminate_score");
          if (null != var2Lifetime35) {
            ii.field_p = qj.a(var2Lifetime35, 2);
          }
          var2Lifetime36 = kb.a(-51, "simultaneous_bonus");
          if (null != var2Lifetime36) {
            jc.field_b = qj.a(var2Lifetime36, 2);
          }
          var2Lifetime37 = kb.a(-117, "chain_bonus");
          if (var2Lifetime37 != null) {
            wm.field_m = qj.a(var2Lifetime37, 2);
          }
          var2Lifetime38 = kb.a(-105, "special_item_bonus");
          if (var2Lifetime38 != null) {
            on.field_a = qj.a(var2Lifetime38, 2);
          }
          var2Lifetime39 = kb.a(-23, "fast_drop_bonus");
          if (null != var2Lifetime39) {
            qi.field_L = qj.a(var2Lifetime39, 2);
          }
          var2Lifetime40 = kb.a(-21, "press_space_or_enter");
          if (var2Lifetime40 != null) {
            ak.field_c = qj.a(var2Lifetime40, 2);
          }
          var2Lifetime41 = kb.a(-102, "shape_feedback");
          if (null != var2Lifetime41) {
            eh.field_e = qj.a(var2Lifetime41, 2);
          }
          var2Lifetime42 = kb.a(-126, "colours_in_play");
          if (null != var2Lifetime42) {
            field_e = qj.a(var2Lifetime42, 2);
          }
          var2Lifetime43 = kb.a(-17, "specials_enabled");
          if (var2Lifetime43 != null) {
            md.field_Y = qj.a(var2Lifetime43, 2);
          }
          var2Lifetime44 = kb.a(-86, "stage_colon");
          if (null != var2Lifetime44) {
            qa.field_u = qj.a(var2Lifetime44, 2);
          }
          var2Lifetime45 = kb.a(-127, "theme_colon");
          if (var2Lifetime45 != null) {
            re.field_s = qj.a(var2Lifetime45, 2);
          }
          var2Lifetime46 = kb.a(-29, "theme_x_strategy");
          if (null != var2Lifetime46) {
            client.field_E = qj.a(var2Lifetime46, 2);
          }
          var2Lifetime47 = kb.a(-65, "hs_theme");
          if (var2Lifetime47 != null) {
            a.field_x = qj.a(var2Lifetime47, 2);
          }
          var2Lifetime48 = kb.a(-33, "fruit");
          if (null != var2Lifetime48) {
            vf.field_c = qj.a(var2Lifetime48, 2);
          }
          var2Lifetime49 = kb.a(-90, "animals");
          if (null != var2Lifetime49) {
            t.field_ib = qj.a(var2Lifetime49, 2);
          }
          var2Lifetime50 = kb.a(-80, "breakfast");
          if (null != var2Lifetime50) {
            u.field_c = qj.a(var2Lifetime50, 2);
          }
          var2Lifetime51 = kb.a(-111, "bugs");
          if (var2Lifetime51 != null) {
            kl.field_w = qj.a(var2Lifetime51, 2);
          }
          var2Lifetime52 = kb.a(-24, "flowers");
          if (var2Lifetime52 != null) {
            dn.field_j = qj.a(var2Lifetime52, 2);
          }
          var2Lifetime53 = kb.a(-16, "undersea");
          if (var2Lifetime53 != null) {
            ea.field_y = qj.a(var2Lifetime53, 2);
          }
          var2Lifetime54 = kb.a(-21, "city");
          if (var2Lifetime54 != null) {
            l.field_e = qj.a(var2Lifetime54, 2);
          }
          var2Lifetime55 = kb.a(-47, "eightbit");
          if (var2Lifetime55 != null) {
            pa.field_W = qj.a(var2Lifetime55, 2);
          }
          var2Lifetime56 = kb.a(-29, "hs_stage");
          if (null != var2Lifetime56) {
            ng.field_g = qj.a(var2Lifetime56, 2);
          }
          var2Lifetime57 = kb.a(-38, "stage_x");
          if (var2Lifetime57 != null) {
            dl.field_L = qj.a(var2Lifetime57, 2);
          }
          var2Lifetime58 = kb.a(-125, "number_colon_name");
          if (null != var2Lifetime58) {
            id.field_O = qj.a(var2Lifetime58, 2);
          }
          var2Lifetime59 = kb.a(-61, "number_colon");
          if (var2Lifetime59 != null) {
            kk.field_q = qj.a(var2Lifetime59, 2);
          }
          var2Lifetime60 = kb.a(-115, "unlock_masterchallenge_free");
          if (var2Lifetime60 != null) {
            qj.a(var2Lifetime60, 2);
          }
          var2Lifetime61 = kb.a(-18, "unlock_masterchallenge_members");
          if (null != var2Lifetime61) {
            rg.field_f = qj.a(var2Lifetime61, 2);
          }
          var2Lifetime62 = kb.a(-21, "achievement_names,0");
          if (var2Lifetime62 != null) {
            qk.field_s[0] = qj.a(var2Lifetime62, 2);
          }
          var2Lifetime63 = kb.a(-30, "achievement_names,1");
          if (var2Lifetime63 != null) {
            qk.field_s[1] = qj.a(var2Lifetime63, 2);
          }
          var2Lifetime64 = kb.a(-34, "achievement_names,2");
          if (null != var2Lifetime64) {
            qk.field_s[2] = qj.a(var2Lifetime64, 2);
          }
          var2Lifetime65 = kb.a(-59, "achievement_names,3");
          if (null != var2Lifetime65) {
            qk.field_s[3] = qj.a(var2Lifetime65, 2);
          }
          var2Lifetime66 = kb.a(-39, "achievement_names,4");
          if (var2Lifetime66 != null) {
            qk.field_s[4] = qj.a(var2Lifetime66, 2);
          }
          var2Lifetime67 = kb.a(-123, "achievement_names,5");
          if (var2Lifetime67 != null) {
            qk.field_s[5] = qj.a(var2Lifetime67, 2);
          }
          var2Lifetime68 = kb.a(-105, "achievement_names,6");
          if (null != var2Lifetime68) {
            qk.field_s[6] = qj.a(var2Lifetime68, 2);
          }
          var2Lifetime69 = kb.a(-119, "achievement_names,7");
          if (null != var2Lifetime69) {
            qk.field_s[7] = qj.a(var2Lifetime69, 2);
          }
          var2Lifetime70 = kb.a(-68, "achievement_names,8");
          if (var2Lifetime70 != null) {
            qk.field_s[8] = qj.a(var2Lifetime70, 2);
          }
          var2Lifetime71 = kb.a(-51, "achievement_names,9");
          if (var2Lifetime71 != null) {
            qk.field_s[9] = qj.a(var2Lifetime71, 2);
          }
          var2Lifetime72 = kb.a(-18, "achievement_names,10");
          if (var2Lifetime72 != null) {
            qk.field_s[10] = qj.a(var2Lifetime72, 2);
          }
          var2Lifetime73 = kb.a(-25, "achievement_names,11");
          if (null != var2Lifetime73) {
            qk.field_s[11] = qj.a(var2Lifetime73, 2);
          }
          var2Lifetime74 = kb.a(-60, "achievement_names,12");
          if (null != var2Lifetime74) {
            qk.field_s[12] = qj.a(var2Lifetime74, 2);
          }
          var2Lifetime75 = kb.a(-105, "achievement_names,13");
          if (null != var2Lifetime75) {
            qk.field_s[13] = qj.a(var2Lifetime75, 2);
          }
          var2Lifetime76 = kb.a(-21, "achievement_names,14");
          if (var2Lifetime76 != null) {
            qk.field_s[14] = qj.a(var2Lifetime76, 2);
          }
          var2Lifetime77 = kb.a(-119, "achievement_names,15");
          if (null != var2Lifetime77) {
            qk.field_s[15] = qj.a(var2Lifetime77, 2);
          }
          var2Lifetime78 = kb.a(-26, "achievement_names,16");
          if (null != var2Lifetime78) {
            qk.field_s[16] = qj.a(var2Lifetime78, 2);
          }
          var2Lifetime79 = kb.a(-110, "achievement_names,17");
          if (var2Lifetime79 != null) {
            qk.field_s[17] = qj.a(var2Lifetime79, 2);
          }
          var2Lifetime80 = kb.a(-91, "achievement_names,18");
          if (var2Lifetime80 != null) {
            qk.field_s[18] = qj.a(var2Lifetime80, 2);
          }
          var2Lifetime81 = kb.a(-30, "achievement_names,19");
          if (null != var2Lifetime81) {
            qk.field_s[19] = qj.a(var2Lifetime81, 2);
          }
          var2Lifetime82 = kb.a(-49, "achievement_names,20");
          if (var2Lifetime82 != null) {
            qk.field_s[20] = qj.a(var2Lifetime82, 2);
          }
          var2Lifetime83 = kb.a(-79, "achievement_names,21");
          if (null != var2Lifetime83) {
            qk.field_s[21] = qj.a(var2Lifetime83, 2);
          }
          var2Lifetime84 = kb.a(-40, "achievement_names,22");
          if (null != var2Lifetime84) {
            qk.field_s[22] = qj.a(var2Lifetime84, 2);
          }
          var2Lifetime85 = kb.a(-108, "achievement_names,23");
          if (var2Lifetime85 != null) {
            qk.field_s[23] = qj.a(var2Lifetime85, 2);
          }
          var2Lifetime86 = kb.a(-78, "achievement_names,24");
          if (null != var2Lifetime86) {
            qk.field_s[24] = qj.a(var2Lifetime86, 2);
          }
          var2Lifetime87 = kb.a(-118, "achievement_names,25");
          if (var2Lifetime87 != null) {
            qk.field_s[25] = qj.a(var2Lifetime87, 2);
          }
          var2Lifetime88 = kb.a(-76, "achievement_names,26");
          if (null != var2Lifetime88) {
            qk.field_s[26] = qj.a(var2Lifetime88, 2);
          }
          var2Lifetime89 = kb.a(-57, "achievement_names,27");
          if (null != var2Lifetime89) {
            qk.field_s[27] = qj.a(var2Lifetime89, 2);
          }
          var2Lifetime90 = kb.a(-118, "achievement_names,28");
          if (var2Lifetime90 != null) {
            qk.field_s[28] = qj.a(var2Lifetime90, 2);
          }
          var2Lifetime91 = kb.a(-42, "achievement_names,29");
          if (var2Lifetime91 != null) {
            qk.field_s[29] = qj.a(var2Lifetime91, 2);
          }
          var2Lifetime92 = kb.a(-39, "achievement_names,30");
          if (null != var2Lifetime92) {
            qk.field_s[30] = qj.a(var2Lifetime92, 2);
          }
          var2Lifetime93 = kb.a(-96, "achievement_criteria,0");
          if (var2Lifetime93 != null) {
            jh.field_c[0] = qj.a(var2Lifetime93, 2);
          }
          var2Lifetime94 = kb.a(-40, "achievement_criteria,1");
          if (var2Lifetime94 != null) {
            jh.field_c[1] = qj.a(var2Lifetime94, 2);
          }
          var2Lifetime95 = kb.a(-18, "achievement_criteria,2");
          if (var2Lifetime95 != null) {
            jh.field_c[2] = qj.a(var2Lifetime95, 2);
          }
          var2Lifetime96 = kb.a(-54, "achievement_criteria,3");
          if (null != var2Lifetime96) {
            jh.field_c[3] = qj.a(var2Lifetime96, 2);
          }
          var2Lifetime97 = kb.a(-85, "achievement_criteria,4");
          if (null != var2Lifetime97) {
            jh.field_c[4] = qj.a(var2Lifetime97, 2);
          }
          var2Lifetime98 = kb.a(-72, "achievement_criteria,5");
          if (null != var2Lifetime98) {
            jh.field_c[5] = qj.a(var2Lifetime98, 2);
          }
          var2Lifetime99 = kb.a(-93, "achievement_criteria,6");
          if (var2Lifetime99 != null) {
            jh.field_c[6] = qj.a(var2Lifetime99, 2);
          }
          var2Lifetime100 = kb.a(-88, "achievement_criteria,7");
          if (null != var2Lifetime100) {
            jh.field_c[7] = qj.a(var2Lifetime100, 2);
          }
          var2Lifetime101 = kb.a(-128, "achievement_criteria,8");
          if (null != var2Lifetime101) {
            jh.field_c[8] = qj.a(var2Lifetime101, 2);
          }
          var2Lifetime102 = kb.a(-117, "achievement_criteria,9");
          if (null != var2Lifetime102) {
            jh.field_c[9] = qj.a(var2Lifetime102, 2);
          }
          var2Lifetime103 = kb.a(-75, "achievement_criteria,10");
          if (null != var2Lifetime103) {
            jh.field_c[10] = qj.a(var2Lifetime103, 2);
          }
          var2Lifetime104 = kb.a(-86, "achievement_criteria,11");
          if (null != var2Lifetime104) {
            jh.field_c[11] = qj.a(var2Lifetime104, 2);
          }
          var2Lifetime105 = kb.a(-94, "achievement_criteria,12");
          if (null != var2Lifetime105) {
            jh.field_c[12] = qj.a(var2Lifetime105, 2);
          }
          var2Lifetime106 = kb.a(-40, "achievement_criteria,13");
          if (var2Lifetime106 != null) {
            jh.field_c[13] = qj.a(var2Lifetime106, 2);
          }
          var2Lifetime107 = kb.a(-28, "achievement_criteria,14");
          if (var2Lifetime107 != null) {
            jh.field_c[14] = qj.a(var2Lifetime107, 2);
          }
          var2Lifetime108 = kb.a(-46, "achievement_criteria,15");
          if (null != var2Lifetime108) {
            jh.field_c[15] = qj.a(var2Lifetime108, 2);
          }
          var2Lifetime109 = kb.a(-82, "achievement_criteria,16");
          if (var2Lifetime109 != null) {
            jh.field_c[16] = qj.a(var2Lifetime109, 2);
          }
          var2Lifetime110 = kb.a(-61, "achievement_criteria,17");
          if (null != var2Lifetime110) {
            jh.field_c[17] = qj.a(var2Lifetime110, 2);
          }
          var2Lifetime111 = kb.a(-87, "achievement_criteria,18");
          if (var2Lifetime111 != null) {
            jh.field_c[18] = qj.a(var2Lifetime111, 2);
          }
          var2Lifetime112 = kb.a(-62, "achievement_criteria,19");
          if (var2Lifetime112 != null) {
            jh.field_c[19] = qj.a(var2Lifetime112, 2);
          }
          var2Lifetime113 = kb.a(-123, "achievement_criteria,20");
          if (var2Lifetime113 != null) {
            jh.field_c[20] = qj.a(var2Lifetime113, 2);
          }
          var2Lifetime114 = kb.a(-97, "achievement_criteria,21");
          if (var2Lifetime114 != null) {
            jh.field_c[21] = qj.a(var2Lifetime114, 2);
          }
          var2Lifetime115 = kb.a(-111, "achievement_criteria,22");
          if (null != var2Lifetime115) {
            jh.field_c[22] = qj.a(var2Lifetime115, 2);
          }
          var2Lifetime116 = kb.a(-38, "achievement_criteria,23");
          if (var2Lifetime116 != null) {
            jh.field_c[23] = qj.a(var2Lifetime116, 2);
          }
          var2Lifetime117 = kb.a(-86, "achievement_criteria,24");
          if (var2Lifetime117 != null) {
            jh.field_c[24] = qj.a(var2Lifetime117, 2);
          }
          var2Lifetime118 = kb.a(-51, "achievement_criteria,25");
          if (var2Lifetime118 != null) {
            jh.field_c[25] = qj.a(var2Lifetime118, 2);
          }
          var2Lifetime119 = kb.a(-117, "achievement_criteria,26");
          if (var2Lifetime119 != null) {
            jh.field_c[26] = qj.a(var2Lifetime119, 2);
          }
          var2Lifetime120 = kb.a(-109, "achievement_criteria,27");
          if (null != var2Lifetime120) {
            jh.field_c[27] = qj.a(var2Lifetime120, 2);
          }
          var2Lifetime121 = kb.a(-21, "achievement_criteria,28");
          if (null != var2Lifetime121) {
            jh.field_c[28] = qj.a(var2Lifetime121, 2);
          }
          var2Lifetime122 = kb.a(-16, "achievement_criteria,29");
          if (null != var2Lifetime122) {
            jh.field_c[29] = qj.a(var2Lifetime122, 2);
          }
          var2Lifetime123 = kb.a(-97, "achievement_criteria,30");
          if (var2Lifetime123 != null) {
            jh.field_c[30] = qj.a(var2Lifetime123, 2);
          }
          var2Lifetime124 = kb.a(-68, "gameoptlabels,0");
          if (var2Lifetime124 != null) {
            si.field_f[0] = qj.a(var2Lifetime124, 2);
          }
          var2Lifetime125 = kb.a(-72, "gameoptlabels,1");
          if (null != var2Lifetime125) {
            si.field_f[1] = qj.a(var2Lifetime125, 2);
          }
          var2Lifetime126 = kb.a(-25, "gameoptlabels,2");
          if (null != var2Lifetime126) {
            si.field_f[2] = qj.a(var2Lifetime126, 2);
          }
          var2Lifetime127 = kb.a(-126, "gameoptlabels,3");
          if (null != var2Lifetime127) {
            si.field_f[3] = qj.a(var2Lifetime127, 2);
          }
          var2Lifetime128 = kb.a(-90, "gameoptlabels,4");
          if (var2Lifetime128 != null) {
            si.field_f[4] = qj.a(var2Lifetime128, 2);
          }
          var2Lifetime129 = kb.a(-58, "gameopt_buttonnames,0,0");
          if (null != var2Lifetime129) {
            tg.field_d[0][0] = qj.a(var2Lifetime129, 2);
          }
          var2Lifetime130 = kb.a(-116, "gameopt_buttonnames,0,1");
          if (var2Lifetime130 != null) {
            tg.field_d[0][1] = qj.a(var2Lifetime130, 2);
          }
          var2Lifetime131 = kb.a(-64, "gameopt_buttonnames,1,0");
          if (null != var2Lifetime131) {
            tg.field_d[1][0] = qj.a(var2Lifetime131, 2);
          }
          var2Lifetime132 = kb.a(-104, "gameopt_buttonnames,1,1");
          if (null != var2Lifetime132) {
            tg.field_d[1][1] = qj.a(var2Lifetime132, 2);
          }
          var2Lifetime133 = kb.a(-77, "gameopt_buttonnames,1,2");
          if (null != var2Lifetime133) {
            tg.field_d[1][2] = qj.a(var2Lifetime133, 2);
          }
          var2Lifetime134 = kb.a(-25, "gameopt_buttonnames,1,3");
          if (null != var2Lifetime134) {
            tg.field_d[1][3] = qj.a(var2Lifetime134, 2);
          }
          var2Lifetime135 = kb.a(-37, "gameopt_buttonnames,1,4");
          if (var2Lifetime135 != null) {
            tg.field_d[1][4] = qj.a(var2Lifetime135, 2);
          }
          var2Lifetime136 = kb.a(-105, "gameopt_buttonnames,2,0");
          if (null != var2Lifetime136) {
            tg.field_d[2][0] = qj.a(var2Lifetime136, 2);
          }
          var2Lifetime137 = kb.a(-37, "gameopt_buttonnames,2,1");
          if (var2Lifetime137 != null) {
            tg.field_d[2][1] = qj.a(var2Lifetime137, 2);
          }
          var2Lifetime138 = kb.a(-37, "gameopt_buttonnames,2,2");
          if (var2Lifetime138 != null) {
            tg.field_d[2][2] = qj.a(var2Lifetime138, 2);
          }
          var2Lifetime139 = kb.a(-46, "gameopt_buttonnames,2,3");
          if (null != var2Lifetime139) {
            tg.field_d[2][3] = qj.a(var2Lifetime139, 2);
          }
          var2Lifetime140 = kb.a(-101, "gameopt_buttonnames,2,4");
          if (null != var2Lifetime140) {
            tg.field_d[2][4] = qj.a(var2Lifetime140, 2);
          }
          var2Lifetime141 = kb.a(-50, "gameopt_buttonnames,3,0");
          if (var2Lifetime141 != null) {
            tg.field_d[3][0] = qj.a(var2Lifetime141, 2);
          }
          var2Lifetime142 = kb.a(-106, "gameopt_buttonnames,3,1");
          if (null != var2Lifetime142) {
            tg.field_d[3][1] = qj.a(var2Lifetime142, 2);
          }
          var2Lifetime143 = kb.a(-63, "gameopt_buttonnames,3,2");
          if (null != var2Lifetime143) {
            tg.field_d[3][2] = qj.a(var2Lifetime143, 2);
          }
          var2Lifetime144 = kb.a(-49, "gameopt_buttonnames,3,3");
          if (null != var2Lifetime144) {
            tg.field_d[3][3] = qj.a(var2Lifetime144, 2);
          }
          var2Lifetime145 = kb.a(-79, "gameopt_buttonnames,3,4");
          if (null != var2Lifetime145) {
            tg.field_d[3][4] = qj.a(var2Lifetime145, 2);
          }
          var2Lifetime146 = kb.a(-89, "gameopt_buttonnames,4,0");
          if (var2Lifetime146 != null) {
            tg.field_d[4][0] = qj.a(var2Lifetime146, 2);
          }
          var2Lifetime147 = kb.a(-36, "gameopt_buttonnames,4,1");
          if (var2Lifetime147 != null) {
            tg.field_d[4][1] = qj.a(var2Lifetime147, 2);
          }
          var2Lifetime148 = kb.a(-82, "gameopt_buttonnames,4,2");
          if (null != var2Lifetime148) {
            tg.field_d[4][2] = qj.a(var2Lifetime148, 2);
          }
          var2Lifetime149 = kb.a(-18, "gameopt_buttonnames,4,3");
          if (null != var2Lifetime149) {
            tg.field_d[4][3] = qj.a(var2Lifetime149, 2);
          }
          var2Lifetime150 = kb.a(-121, "gameopt_tooltipnames,0,0");
          if (var2Lifetime150 != null) {
            qd.field_Pb[0][0] = qj.a(var2Lifetime150, 2);
          }
          var2Lifetime151 = kb.a(-62, "gameopt_tooltipnames,0,1");
          if (null != var2Lifetime151) {
            qd.field_Pb[0][1] = qj.a(var2Lifetime151, 2);
          }
          var2Lifetime152 = kb.a(-71, "gameopt_tooltipnames,1,0");
          if (var2Lifetime152 != null) {
            qd.field_Pb[1][0] = qj.a(var2Lifetime152, 2);
          }
          var2Lifetime153 = kb.a(-103, "gameopt_tooltipnames,1,1");
          if (var2Lifetime153 != null) {
            qd.field_Pb[1][1] = qj.a(var2Lifetime153, 2);
          }
          var2Lifetime154 = kb.a(-38, "gameopt_tooltipnames,1,2");
          if (null != var2Lifetime154) {
            qd.field_Pb[1][2] = qj.a(var2Lifetime154, 2);
          }
          var2Lifetime155 = kb.a(-123, "gameopt_tooltipnames,1,3");
          if (var2Lifetime155 != null) {
            qd.field_Pb[1][3] = qj.a(var2Lifetime155, 2);
          }
          var2Lifetime156 = kb.a(-128, "gameopt_tooltipnames,1,4");
          if (null != var2Lifetime156) {
            qd.field_Pb[1][4] = qj.a(var2Lifetime156, 2);
          }
          var2Lifetime157 = kb.a(-86, "gameopt_tooltipnames,2,0");
          if (var2Lifetime157 != null) {
            qd.field_Pb[2][0] = qj.a(var2Lifetime157, 2);
          }
          var2Lifetime158 = kb.a(-43, "gameopt_tooltipnames,2,1");
          if (var2Lifetime158 != null) {
            qd.field_Pb[2][1] = qj.a(var2Lifetime158, 2);
          }
          var2Lifetime159 = kb.a(-107, "gameopt_tooltipnames,2,2");
          if (var2Lifetime159 != null) {
            qd.field_Pb[2][2] = qj.a(var2Lifetime159, 2);
          }
          var2Lifetime160 = kb.a(-80, "gameopt_tooltipnames,2,3");
          if (var2Lifetime160 != null) {
            qd.field_Pb[2][3] = qj.a(var2Lifetime160, 2);
          }
          var2Lifetime161 = kb.a(-46, "gameopt_tooltipnames,2,4");
          if (null != var2Lifetime161) {
            qd.field_Pb[2][4] = qj.a(var2Lifetime161, 2);
          }
          var2Lifetime162 = kb.a(-45, "gameopt_tooltipnames,3,0");
          if (null != var2Lifetime162) {
            qd.field_Pb[3][0] = qj.a(var2Lifetime162, 2);
          }
          var2Lifetime163 = kb.a(-17, "gameopt_tooltipnames,3,1");
          if (null != var2Lifetime163) {
            qd.field_Pb[3][1] = qj.a(var2Lifetime163, 2);
          }
          var2Lifetime164 = kb.a(-51, "gameopt_tooltipnames,3,2");
          if (var2Lifetime164 != null) {
            qd.field_Pb[3][2] = qj.a(var2Lifetime164, 2);
          }
          var2Lifetime165 = kb.a(-83, "gameopt_tooltipnames,3,3");
          if (null != var2Lifetime165) {
            qd.field_Pb[3][3] = qj.a(var2Lifetime165, 2);
          }
          var2Lifetime166 = kb.a(-118, "gameopt_tooltipnames,3,4");
          if (null != var2Lifetime166) {
            qd.field_Pb[3][4] = qj.a(var2Lifetime166, 2);
          }
          var2Lifetime167 = kb.a(-79, "gameopt_tooltipnames,4,0");
          if (var2Lifetime167 != null) {
            qd.field_Pb[4][0] = qj.a(var2Lifetime167, 2);
          }
          var2Lifetime168 = kb.a(-116, "gameopt_tooltipnames,4,1");
          if (var2Lifetime168 != null) {
            qd.field_Pb[4][1] = qj.a(var2Lifetime168, 2);
          }
          var2Lifetime169 = kb.a(-63, "gameopt_tooltipnames,4,2");
          if (null != var2Lifetime169) {
            qd.field_Pb[4][2] = qj.a(var2Lifetime169, 2);
          }
          var2Lifetime170 = kb.a(-28, "instructions_titles_thebasics");
          if (var2Lifetime170 != null) {
            kc.field_s = qj.a(var2Lifetime170, 2);
          }
          var2Lifetime171 = kb.a(-46, "instructions_titles_thecontrols");
          if (null != var2Lifetime171) {
            ug.field_n = qj.a(var2Lifetime171, 2);
          }
          var2Lifetime172 = kb.a(-116, "instructions_titles_thetwist");
          if (var2Lifetime172 != null) {
            bj.field_c = qj.a(var2Lifetime172, 2);
          }
          var2Lifetime173 = kb.a(-58, "instructions_titles_inmultiplayer");
          if (null != var2Lifetime173) {
            kc.field_q = qj.a(var2Lifetime173, 2);
          }
          var2Lifetime174 = kb.a(-94, "instructions_titles_insingleplayer");
          if (null != var2Lifetime174) {
            fm.field_c = qj.a(var2Lifetime174, 2);
          }
          var2Lifetime175 = kb.a(-36, "instructions_titles_specialitems");
          if (null != var2Lifetime175) {
            mb.field_e = qj.a(var2Lifetime175, 2);
          }
          var2Lifetime176 = kb.a(-28, "instructions_titles_activatingspecialitems");
          if (var2Lifetime176 != null) {
            hg.field_d = qj.a(var2Lifetime176, 2);
          }
          var2Lifetime177 = kb.a(-89, "instructions_piecesarefalling");
          if (null != var2Lifetime177) {
            cc.field_d = qj.a(var2Lifetime177, 2);
          }
          var2Lifetime178 = kb.a(-42, "instructions_matchthepieces");
          if (null != var2Lifetime178) {
            dn.field_q = qj.a(var2Lifetime178, 2);
          }
          var2Lifetime179 = kb.a(-121, "instructions_machinetransforms");
          if (var2Lifetime179 != null) {
            rf.field_i = qj.a(var2Lifetime179, 2);
          }
          var2Lifetime180 = kb.a(-62, "instructions_clearingsolids");
          if (null != var2Lifetime180) {
            rk.field_N = qj.a(var2Lifetime180, 2);
          }
          var2Lifetime181 = kb.a(-52, "instructions_multiplayer_solids");
          if (var2Lifetime181 != null) {
            di.field_D = qj.a(var2Lifetime181, 2);
          }
          var2Lifetime182 = kb.a(-69, "instructions_singleplayer_solids");
          if (null != var2Lifetime182) {
            ah.field_g = qj.a(var2Lifetime182, 2);
          }
          var2Lifetime183 = kb.a(-122, "instructions_wildcard");
          if (null != var2Lifetime183) {
            nk.field_c = qj.a(var2Lifetime183, 2);
          }
          var2Lifetime184 = kb.a(-122, "instructions_gettingspecials");
          if (var2Lifetime184 != null) {
            kb.field_e = qj.a(var2Lifetime184, 2);
          }
          var2Lifetime185 = kb.a(-33, "instructions_activatingspecials");
          if (var2Lifetime185 != null) {
            dk.field_f = qj.a(var2Lifetime185, 2);
          }
          var2Lifetime186 = kb.a(-65, "instructions_multiplayer_specials");
          if (null != var2Lifetime186) {
            ki.field_u = qj.a(var2Lifetime186, 2);
          }
          var2Lifetime187 = kb.a(-47, "instructions_itemdescriptions,0,0");
          if (var2Lifetime187 != null) {
            nk.field_d[0][0] = qj.a(var2Lifetime187, 2);
          }
          var2Lifetime188 = kb.a(-17, "instructions_itemdescriptions,0,1");
          if (var2Lifetime188 != null) {
            nk.field_d[0][1] = qj.a(var2Lifetime188, 2);
          }
          var2Lifetime189 = kb.a(-98, "instructions_itemdescriptions,1,0");
          if (var2Lifetime189 != null) {
            nk.field_d[1][0] = qj.a(var2Lifetime189, 2);
          }
          var2Lifetime190 = kb.a(-103, "instructions_itemdescriptions,1,1");
          if (var2Lifetime190 != null) {
            nk.field_d[1][1] = qj.a(var2Lifetime190, 2);
          }
          var2Lifetime191 = kb.a(-27, "instructions_itemdescriptions,2,0");
          if (null != var2Lifetime191) {
            nk.field_d[2][0] = qj.a(var2Lifetime191, 2);
          }
          var2Lifetime192 = kb.a(-82, "instructions_itemdescriptions,2,1");
          if (var2Lifetime192 != null) {
            nk.field_d[2][1] = qj.a(var2Lifetime192, 2);
          }
          var2Lifetime193 = kb.a(-53, "instructions_itemdescriptions,3,0");
          if (var2Lifetime193 != null) {
            nk.field_d[3][0] = qj.a(var2Lifetime193, 2);
          }
          var2Lifetime194 = kb.a(-128, "instructions_itemdescriptions,3,1");
          if (null != var2Lifetime194) {
            nk.field_d[3][1] = qj.a(var2Lifetime194, 2);
          }
          var2Lifetime195 = kb.a(-79, "instructions_itemdescriptions,4,0");
          if (var2Lifetime195 != null) {
            nk.field_d[4][0] = qj.a(var2Lifetime195, 2);
          }
          var2Lifetime196 = kb.a(-123, "instructions_itemdescriptions,4,1");
          if (null != var2Lifetime196) {
            nk.field_d[4][1] = qj.a(var2Lifetime196, 2);
          }
          var2Lifetime197 = kb.a(-62, "instructions_itemdescriptions,5,0");
          if (var2Lifetime197 != null) {
            nk.field_d[5][0] = qj.a(var2Lifetime197, 2);
          }
          var2Lifetime198 = kb.a(-60, "instructions_itemdescriptions,5,1");
          if (var2Lifetime198 != null) {
            nk.field_d[5][1] = qj.a(var2Lifetime198, 2);
          }
          var2Lifetime199 = kb.a(-102, "instructions_itemdescriptions,6,0");
          if (null != var2Lifetime199) {
            nk.field_d[6][0] = qj.a(var2Lifetime199, 2);
          }
          var2Lifetime200 = kb.a(-55, "instructions_itemdescriptions,6,1");
          if (var2Lifetime200 != null) {
            nk.field_d[6][1] = qj.a(var2Lifetime200, 2);
          }
          var2Lifetime201 = kb.a(-124, "instructions_controls,0");
          if (null != var2Lifetime201) {
            vk.field_b[0] = qj.a(var2Lifetime201, 2);
          }
          var2Lifetime202 = kb.a(-92, "instructions_controls,1");
          if (var2Lifetime202 != null) {
            vk.field_b[1] = qj.a(var2Lifetime202, 2);
          }
          var2Lifetime203 = kb.a(-117, "instructions_controls,2");
          if (var2Lifetime203 != null) {
            vk.field_b[2] = qj.a(var2Lifetime203, 2);
          }
          var2Lifetime204 = kb.a(-108, "instructions_controls,3");
          if (var2Lifetime204 != null) {
            vk.field_b[3] = qj.a(var2Lifetime204, 2);
          }
          var2Lifetime205 = kb.a(-61, "instructions_controls,4");
          if (var2Lifetime205 != null) {
            vk.field_b[4] = qj.a(var2Lifetime205, 2);
          }
          var2Lifetime206 = kb.a(-61, "instructions_controls,5");
          if (null != var2Lifetime206) {
            vk.field_b[5] = qj.a(var2Lifetime206, 2);
          }
          var2Lifetime207 = kb.a(-31, "instructions_controls,6");
          if (var2Lifetime207 != null) {
            vk.field_b[6] = qj.a(var2Lifetime207, 2);
          }
          var2Lifetime208 = kb.a(-53, "didyouknow_title");
          if (null != var2Lifetime208) {
            o.field_c = qj.a(var2Lifetime208, 2);
          }
          var2Lifetime209 = kb.a(-87, "didyouknow,0");
          if (null != var2Lifetime209) {
            jg.field_k[0] = qj.a(var2Lifetime209, 2);
          }
          var2Lifetime210 = kb.a(-89, "didyouknow,1");
          if (var2Lifetime210 != null) {
            jg.field_k[1] = qj.a(var2Lifetime210, 2);
          }
          var2Lifetime211 = kb.a(-112, "didyouknow,2");
          if (null != var2Lifetime211) {
            jg.field_k[2] = qj.a(var2Lifetime211, 2);
          }
          var2Lifetime212 = kb.a(-72, "didyouknow,3");
          if (null != var2Lifetime212) {
            jg.field_k[3] = qj.a(var2Lifetime212, 2);
          }
          var2Lifetime213 = kb.a(-127, "didyouknow,4");
          if (null != var2Lifetime213) {
            jg.field_k[4] = qj.a(var2Lifetime213, 2);
          }
          var2Lifetime214 = kb.a(-32, "didyouknow,5");
          if (var2Lifetime214 != null) {
            jg.field_k[5] = qj.a(var2Lifetime214, 2);
          }
          var2Lifetime215 = kb.a(-116, "didyouknow,6");
          if (null != var2Lifetime215) {
            jg.field_k[6] = qj.a(var2Lifetime215, 2);
          }
          var2Lifetime216 = kb.a(-97, "didyouknow,7");
          if (null != var2Lifetime216) {
            jg.field_k[7] = qj.a(var2Lifetime216, 2);
          }
          var2Lifetime217 = kb.a(-117, "didyouknow,8");
          if (var2Lifetime217 != null) {
            jg.field_k[8] = qj.a(var2Lifetime217, 2);
          }
          var2Lifetime218 = kb.a(-112, "didyouknow,9");
          if (null != var2Lifetime218) {
            jg.field_k[9] = qj.a(var2Lifetime218, 2);
          }
          var2Lifetime219 = kb.a(-99, "didyouknow,10");
          if (null != var2Lifetime219) {
            jg.field_k[10] = qj.a(var2Lifetime219, 2);
          }
          var2Lifetime220 = kb.a(-57, "didyouknow,11");
          if (var2Lifetime220 != null) {
            jg.field_k[11] = qj.a(var2Lifetime220, 2);
          }
          var2Lifetime221 = kb.a(-104, "tutorial,0");
          if (var2Lifetime221 != null) {
            rk.field_O[0] = qj.a(var2Lifetime221, 2);
          }
          var2Lifetime222 = kb.a(-90, "tutorial,1");
          if (null != var2Lifetime222) {
            rk.field_O[1] = qj.a(var2Lifetime222, 2);
          }
          var2Lifetime223 = kb.a(-77, "tutorial,2");
          if (null != var2Lifetime223) {
            rk.field_O[2] = qj.a(var2Lifetime223, 2);
          }
          var2Lifetime224 = kb.a(-76, "tutorial,3");
          if (var2Lifetime224 != null) {
            rk.field_O[3] = qj.a(var2Lifetime224, 2);
          }
          var2Lifetime225 = kb.a(-97, "to_activate_specials");
          if (null != var2Lifetime225) {
            qe.field_j = qj.a(var2Lifetime225, 2);
          }
          var2Lifetime226 = kb.a(-49, "premultiplayer_tutorial,0");
          if (null != var2Lifetime226) {
            sg.field_h[0] = qj.a(var2Lifetime226, 2);
          }
          var2Lifetime227 = kb.a(-42, "premultiplayer_tutorial,1");
          if (var2Lifetime227 != null) {
            sg.field_h[1] = qj.a(var2Lifetime227, 2);
          }
          var2Lifetime228 = kb.a(-36, "masterchallengeintro,0");
          if (null != var2Lifetime228) {
            uj.field_f[0] = qj.a(var2Lifetime228, 2);
          }
          var2Lifetime229 = kb.a(-52, "masterchallengeintro,1");
          if (var2Lifetime229 != null) {
            uj.field_f[1] = qj.a(var2Lifetime229, 2);
          }
          var2Lifetime230 = kb.a(-78, "showtutorialagain");
          if (var2Lifetime230 != null) {
            vb.field_T = qj.a(var2Lifetime230, 2);
          }
          var2Lifetime231 = kb.a(-83, "challengestrategy,0");
          if (null != var2Lifetime231) {
            jj.field_d[0] = qj.a(var2Lifetime231, 2);
          }
          var2Lifetime232 = kb.a(-39, "challengestrategy,1");
          if (null != var2Lifetime232) {
            jj.field_d[1] = qj.a(var2Lifetime232, 2);
          }
          var2Lifetime233 = kb.a(-73, "challengestrategy,2");
          if (null != var2Lifetime233) {
            jj.field_d[2] = qj.a(var2Lifetime233, 2);
          }
          var2Lifetime234 = kb.a(-75, "challengestrategy,3");
          if (var2Lifetime234 != null) {
            jj.field_d[3] = qj.a(var2Lifetime234, 2);
          }
          var2Lifetime235 = kb.a(-54, "challengestrategy,4");
          if (null != var2Lifetime235) {
            jj.field_d[4] = qj.a(var2Lifetime235, 2);
          }
          var2Lifetime236 = kb.a(-96, "challengestrategy,5");
          if (var2Lifetime236 != null) {
            jj.field_d[5] = qj.a(var2Lifetime236, 2);
          }
          var2Lifetime237 = kb.a(-67, "challengestrategy,6");
          if (null != var2Lifetime237) {
            jj.field_d[6] = qj.a(var2Lifetime237, 2);
          }
          var2Lifetime238 = kb.a(-60, "challengestrategy,7");
          if (null != var2Lifetime238) {
            jj.field_d[7] = qj.a(var2Lifetime238, 2);
          }
          var2Lifetime239 = kb.a(-16, "x_at_once");
          if (null != var2Lifetime239) {
            on.field_h = qj.a(var2Lifetime239, 2);
          }
          var2Lifetime240 = kb.a(-59, "x_chain");
          if (var2Lifetime240 != null) {
            e.field_d = qj.a(var2Lifetime240, 2);
          }
          var2Lifetime241 = kb.a(-35, "x_shapes");
          if (null != var2Lifetime241) {
            uj.field_b = qj.a(var2Lifetime241, 2);
          }
          var2Lifetime242 = kb.a(-95, "start");
          if (null != var2Lifetime242) {
            sk.field_i = qj.a(var2Lifetime242, 2);
          }
          var2Lifetime243 = kb.a(-72, "challenge");
          if (null != var2Lifetime243) {
            ka.field_M = qj.a(var2Lifetime243, 2);
          }
          var2Lifetime244 = kb.a(-89, "new_theme_unlocked");
          if (null != var2Lifetime244) {
            tb.field_a = qj.a(var2Lifetime244, 2);
          }
          var2Lifetime245 = kb.a(-110, "speedup");
          if (var2Lifetime245 != null) {
            eb.field_c = qj.a(var2Lifetime245, 2);
          }
          var2Lifetime246 = kb.a(-61, "panic");
          if (var2Lifetime246 != null) {
            bn.field_c = qj.a(var2Lifetime246, 2);
          }
          var2Lifetime247 = kb.a(-90, "fight");
          if (null != var2Lifetime247) {
            cf.field_e = qj.a(var2Lifetime247, 2);
          }
          var2Lifetime248 = kb.a(-93, "finish_name");
          if (var2Lifetime248 != null) {
            pc.field_a = qj.a(var2Lifetime248, 2);
          }
          var2Lifetime249 = kb.a(-60, "you_win");
          if (var2Lifetime249 != null) {
            cn.field_T = qj.a(var2Lifetime249, 2);
          }
          var2Lifetime250 = kb.a(-36, "name_wins");
          if (null != var2Lifetime250) {
            fh.field_b = qj.a(var2Lifetime250, 2);
          }
          var2Lifetime251 = kb.a(-107, "draw");
          if (null != var2Lifetime251) {
            ri.field_k = qj.a(var2Lifetime251, 2);
          }
          var2Lifetime252 = kb.a(-100, "well_done");
          if (null != var2Lifetime252) {
            ua.field_D = qj.a(var2Lifetime252, 2);
          }
          var2Lifetime253 = kb.a(-101, "oh_no");
          if (var2Lifetime253 != null) {
            cb.field_i = qj.a(var2Lifetime253, 2);
          }
          var2Lifetime254 = kb.a(-61, "thefinal");
          if (var2Lifetime254 != null) {
            ji.field_h = qj.a(var2Lifetime254, 2);
          }
          var2Lifetime255 = kb.a(-70, "name_is_out");
          if (null != var2Lifetime255) {
            a.field_e = qj.a(var2Lifetime255, 2);
          }
          var2Lifetime256 = kb.a(-40, "main_menu_ticker,0");
          if (null != var2Lifetime256) {
            pb.field_f[0] = qj.a(var2Lifetime256, 2);
          }
          var2Lifetime257 = kb.a(-59, "main_menu_ticker,1");
          if (null != var2Lifetime257) {
            pb.field_f[1] = qj.a(var2Lifetime257, 2);
          }
          var2Lifetime258 = kb.a(-34, "main_menu_ticker,2");
          if (null != var2Lifetime258) {
            pb.field_f[2] = qj.a(var2Lifetime258, 2);
          }
          var2Lifetime259 = kb.a(-87, "main_menu_ticker,3");
          if (null != var2Lifetime259) {
            pb.field_f[3] = qj.a(var2Lifetime259, 2);
          }
          var2Lifetime260 = kb.a(-101, "devquote");
          if (var2Lifetime260 != null) {
            ph.field_Cb = qj.a(var2Lifetime260, 2);
          }
          pc.field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_926_0 = var2_ref;
          stackIn_926_1 = new StringBuilder().append("sh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_927_2 = "null";
          } else {
            stackIn_927_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_926_0), ((StringBuilder) (Object) stackIn_926_1).append(stackIn_927_2).append(')').toString());
        }
    }

    static {
        field_h = "Drawn";
        field_e = "Colours in play:";
        field_b = "<%0> has dropped out.";
        field_c = "Retry";
    }
}
