/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends ma {
    static int[] field_s;
    static int field_n;
    private boolean field_o;
    static int[][] field_w;
    static int field_v;
    static int field_u;
    private gf field_r;
    static int[] field_m;
    static String field_t;
    static int[] field_p;
    private String field_q;

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_21_0 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = je.a(param0, 0);
          if (-1 == param2.indexOf(param0) &&
            param2.indexOf(var3) == -1) {
            var4 = 28 % ((param1 + 1) / 49);
            stackIn_21_0 = (param2.startsWith(param0)) || (param2.startsWith(var3)) || (param2.endsWith(param0)) || (param2.endsWith(var3));
            return stackIn_21_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_25_0 = var3_ref;
          stackIn_25_1 = new StringBuilder().append("kc.B(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static void a(lj param0, int param1) {
        RuntimeException stackIn_648_0 = null;
        StringBuilder stackIn_648_1 = null;
        String stackIn_649_2 = null;
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
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          dj.field_cb = param0;
          var2 = vf.a(95, "gamename");
          if (null != var2) {
            dl.field_E = re.a(18990, var2);
          }
          var2Lifetime1 = vf.a(95, "achievement_names,0");
          if (null != var2Lifetime1) {
            wb.field_n[0] = re.a(param1 + 18990, var2Lifetime1);
          }
          var2Lifetime2 = vf.a(95, "achievement_names,1");
          if (null != var2Lifetime2) {
            wb.field_n[1] = re.a(18990, var2Lifetime2);
          }
          var2Lifetime3 = vf.a(95, "achievement_names,2");
          if (null != var2Lifetime3) {
            wb.field_n[2] = re.a(18990, var2Lifetime3);
          }
          var2Lifetime4 = vf.a(95, "achievement_names,3");
          if (var2Lifetime4 != null) {
            wb.field_n[3] = re.a(18990, var2Lifetime4);
          }
          var2Lifetime5 = vf.a(95, "achievement_names,4");
          if (var2Lifetime5 != null) {
            wb.field_n[4] = re.a(18990, var2Lifetime5);
          }
          var2Lifetime6 = vf.a(95, "achievement_names,5");
          if (null != var2Lifetime6) {
            wb.field_n[5] = re.a(18990, var2Lifetime6);
          }
          var2Lifetime7 = vf.a(95, "achievement_names,6");
          if (var2Lifetime7 != null) {
            wb.field_n[6] = re.a(18990, var2Lifetime7);
          }
          var2Lifetime8 = vf.a(95, "achievement_names,7");
          if (var2Lifetime8 != null) {
            wb.field_n[7] = re.a(18990, var2Lifetime8);
          }
          var2Lifetime9 = vf.a(95, "achievement_names,8");
          if (var2Lifetime9 != null) {
            wb.field_n[8] = re.a(18990, var2Lifetime9);
          }
          var2Lifetime10 = vf.a(95, "achievement_names,9");
          if (null != var2Lifetime10) {
            wb.field_n[9] = re.a(18990, var2Lifetime10);
          }
          var2Lifetime11 = vf.a(95, "achievement_names,10");
          if (var2Lifetime11 != null) {
            wb.field_n[10] = re.a(18990, var2Lifetime11);
          }
          var2Lifetime12 = vf.a(95, "achievement_names,11");
          if (var2Lifetime12 != null) {
            wb.field_n[11] = re.a(18990, var2Lifetime12);
          }
          var2Lifetime13 = vf.a(95, "achievement_names,12");
          if (null != var2Lifetime13) {
            wb.field_n[12] = re.a(18990, var2Lifetime13);
          }
          var2Lifetime14 = vf.a(95, "achievement_names,13");
          if (var2Lifetime14 != null) {
            wb.field_n[13] = re.a(18990, var2Lifetime14);
          }
          var2Lifetime15 = vf.a(95, "achievement_names,14");
          if (var2Lifetime15 != null) {
            wb.field_n[14] = re.a(18990, var2Lifetime15);
          }
          var2Lifetime16 = vf.a(95, "achievement_names,15");
          if (null != var2Lifetime16) {
            wb.field_n[15] = re.a(18990, var2Lifetime16);
          }
          var2Lifetime17 = vf.a(95, "achievement_names,16");
          if (null != var2Lifetime17) {
            wb.field_n[16] = re.a(18990, var2Lifetime17);
          }
          var2Lifetime18 = vf.a(95, "achievement_criteria,0");
          if (var2Lifetime18 != null) {
            jc.field_j[0] = re.a(18990, var2Lifetime18);
          }
          var2Lifetime19 = vf.a(95, "achievement_criteria,1");
          if (null != var2Lifetime19) {
            jc.field_j[1] = re.a(18990, var2Lifetime19);
          }
          var2Lifetime20 = vf.a(95, "achievement_criteria,2");
          if (null != var2Lifetime20) {
            jc.field_j[2] = re.a(18990, var2Lifetime20);
          }
          var2Lifetime21 = vf.a(95, "achievement_criteria,3");
          if (null != var2Lifetime21) {
            jc.field_j[3] = re.a(18990, var2Lifetime21);
          }
          var2Lifetime22 = vf.a(95, "achievement_criteria,4");
          if (var2Lifetime22 != null) {
            jc.field_j[4] = re.a(18990, var2Lifetime22);
          }
          var2Lifetime23 = vf.a(95, "achievement_criteria,5");
          if (var2Lifetime23 != null) {
            jc.field_j[5] = re.a(TorChallenge.a(param1, 18990), var2Lifetime23);
          }
          var2Lifetime24 = vf.a(95, "achievement_criteria,6");
          if (var2Lifetime24 != null) {
            jc.field_j[6] = re.a(18990, var2Lifetime24);
          }
          var2Lifetime25 = vf.a(95, "achievement_criteria,7");
          if (null != var2Lifetime25) {
            jc.field_j[7] = re.a(18990, var2Lifetime25);
          }
          var2Lifetime26 = vf.a(95, "achievement_criteria,8");
          if (null != var2Lifetime26) {
            jc.field_j[8] = re.a(param1 + 18990, var2Lifetime26);
          }
          var2Lifetime27 = vf.a(95, "achievement_criteria,9");
          if (null != var2Lifetime27) {
            jc.field_j[9] = re.a(18990, var2Lifetime27);
          }
          var2Lifetime28 = vf.a(95, "achievement_criteria,10");
          if (null != var2Lifetime28) {
            jc.field_j[10] = re.a(18990, var2Lifetime28);
          }
          var2Lifetime29 = vf.a(95, "achievement_criteria,11");
          if (var2Lifetime29 != null) {
            jc.field_j[11] = re.a(18990, var2Lifetime29);
          }
          var2Lifetime30 = vf.a(95, "achievement_criteria,12");
          if (var2Lifetime30 != null) {
            jc.field_j[12] = re.a(18990, var2Lifetime30);
          }
          var2Lifetime31 = vf.a(95, "achievement_criteria,13");
          if (var2Lifetime31 != null) {
            jc.field_j[13] = re.a(18990, var2Lifetime31);
          }
          var2Lifetime32 = vf.a(95, "achievement_criteria,14");
          if (var2Lifetime32 != null) {
            jc.field_j[14] = re.a(18990, var2Lifetime32);
          }
          var2Lifetime33 = vf.a(95, "achievement_criteria,15");
          if (null != var2Lifetime33) {
            jc.field_j[15] = re.a(TorChallenge.a(param1, 18990), var2Lifetime33);
          }
          var2Lifetime34 = vf.a(95, "achievement_criteria,16");
          if (var2Lifetime34 != null) {
            jc.field_j[16] = re.a(18990, var2Lifetime34);
          }
          var2Lifetime35 = vf.a(95, "score_colon_space");
          if (var2Lifetime35 != null) {
            oi.field_h = re.a(18990, var2Lifetime35);
          }
          var2Lifetime36 = vf.a(95, "time_colon_space");
          if (var2Lifetime36 != null) {
            w.field_j = re.a(18990, var2Lifetime36);
          }
          var2Lifetime37 = vf.a(95, "cross");
          if (null != var2Lifetime37) {
            vj.field_b = re.a(18990, var2Lifetime37);
          }
          var2Lifetime38 = vf.a(95, "instructions_pages,0");
          if (var2Lifetime38 != null) {
            ol.field_b[0] = re.a(18990, var2Lifetime38);
          }
          var2Lifetime39 = vf.a(95, "instructions_pages,1");
          if (var2Lifetime39 != null) {
            ol.field_b[1] = re.a(18990, var2Lifetime39);
          }
          var2Lifetime40 = vf.a(95, "instructions_pages,4");
          if (var2Lifetime40 != null) {
            ol.field_b[4] = re.a(18990, var2Lifetime40);
          }
          var2Lifetime41 = vf.a(95, "instructions_pages,6");
          if (var2Lifetime41 != null) {
            ol.field_b[6] = re.a(param1 + 18990, var2Lifetime41);
          }
          var2Lifetime42 = vf.a(95, "instructions_pages,7");
          if (null != var2Lifetime42) {
            ol.field_b[7] = re.a(TorChallenge.a(param1, 18990), var2Lifetime42);
          }
          var2Lifetime43 = vf.a(95, "instructions_pages,8");
          if (null != var2Lifetime43) {
            ol.field_b[8] = re.a(18990, var2Lifetime43);
          }
          var2Lifetime44 = vf.a(95, "instructions_pages,9");
          if (null != var2Lifetime44) {
            ol.field_b[9] = re.a(18990, var2Lifetime44);
          }
          var2Lifetime45 = vf.a(95, "instructions_titles,0");
          if (var2Lifetime45 != null) {
            oe.field_j[0] = re.a(18990, var2Lifetime45);
          }
          var2Lifetime46 = vf.a(95, "instructions_titles,1");
          if (var2Lifetime46 != null) {
            oe.field_j[1] = re.a(18990, var2Lifetime46);
          }
          var2Lifetime47 = vf.a(95, "instructions_titles,2");
          if (null != var2Lifetime47) {
            oe.field_j[2] = re.a(TorChallenge.a(param1, 18990), var2Lifetime47);
          }
          var2Lifetime48 = vf.a(95, "instructions_titles,3");
          if (var2Lifetime48 != null) {
            oe.field_j[3] = re.a(18990, var2Lifetime48);
          }
          var2Lifetime49 = vf.a(95, "instructions_titles,4");
          if (var2Lifetime49 != null) {
            oe.field_j[4] = re.a(18990, var2Lifetime49);
          }
          var2Lifetime50 = vf.a(95, "instructions_titles,5");
          if (null != var2Lifetime50) {
            oe.field_j[5] = re.a(param1 + 18990, var2Lifetime50);
          }
          var2Lifetime51 = vf.a(95, "instructions_titles,6");
          if (var2Lifetime51 != null) {
            oe.field_j[6] = re.a(18990, var2Lifetime51);
          }
          var2Lifetime52 = vf.a(95, "instructions_titles,7");
          if (var2Lifetime52 != null) {
            oe.field_j[7] = re.a(18990, var2Lifetime52);
          }
          var2Lifetime53 = vf.a(95, "instructions_titles,8");
          if (null != var2Lifetime53) {
            oe.field_j[8] = re.a(18990, var2Lifetime53);
          }
          var2Lifetime54 = vf.a(95, "instructions_titles,9");
          if (var2Lifetime54 != null) {
            oe.field_j[9] = re.a(18990, var2Lifetime54);
          }
          var2Lifetime55 = vf.a(95, "example_help_text");
          if (null != var2Lifetime55) {
            kl.field_f = re.a(param1 + 18990, var2Lifetime55);
          }
          var2Lifetime56 = vf.a(95, "seal");
          if (null != var2Lifetime56) {
            gh.field_y = re.a(18990, var2Lifetime56);
          }
          var2Lifetime57 = vf.a(95, "basic_controls,0,0");
          if (var2Lifetime57 != null) {
            jf.field_ob[0][0] = re.a(18990, var2Lifetime57);
          }
          var2Lifetime58 = vf.a(95, "basic_controls,1,0");
          if (null != var2Lifetime58) {
            jf.field_ob[1][0] = re.a(18990, var2Lifetime58);
          }
          var2Lifetime59 = vf.a(95, "basic_controls,2,0");
          if (null != var2Lifetime59) {
            jf.field_ob[2][0] = re.a(18990, var2Lifetime59);
          }
          var2Lifetime60 = vf.a(95, "basic_controls,3,0");
          if (var2Lifetime60 != null) {
            jf.field_ob[3][0] = re.a(TorChallenge.a(param1, 18990), var2Lifetime60);
          }
          var2Lifetime61 = vf.a(95, "basic_controls,3,1");
          if (var2Lifetime61 != null) {
            jf.field_ob[3][1] = re.a(18990, var2Lifetime61);
          }
          var2Lifetime62 = vf.a(95, "BACK");
          if (null != var2Lifetime62) {
            rc.field_q = re.a(18990, var2Lifetime62);
          }
          var2Lifetime63 = vf.a(95, "HELP_POSTS_ON");
          if (null != var2Lifetime63) {
            gh.field_i = re.a(18990, var2Lifetime63);
          }
          var2Lifetime64 = vf.a(95, "HELP_POSTS_OFF");
          if (var2Lifetime64 != null) {
            o.field_n = re.a(18990, var2Lifetime64);
          }
          var2Lifetime65 = vf.a(95, "benefits,0");
          if (var2Lifetime65 != null) {
            il.field_p[0] = re.a(18990, var2Lifetime65);
          }
          var2Lifetime66 = vf.a(95, "benefits,1");
          if (var2Lifetime66 != null) {
            il.field_p[1] = re.a(param1 + 18990, var2Lifetime66);
          }
          var2Lifetime67 = vf.a(95, "benefits,2");
          if (null != var2Lifetime67) {
            il.field_p[2] = re.a(param1 + 18990, var2Lifetime67);
          }
          var2Lifetime68 = vf.a(95, "MONK_NAMES,0");
          if (null != var2Lifetime68) {
            me.field_a[0] = re.a(18990, var2Lifetime68);
          }
          var2Lifetime69 = vf.a(95, "MONK_NAMES,1");
          if (null != var2Lifetime69) {
            me.field_a[1] = re.a(18990, var2Lifetime69);
          }
          var2Lifetime70 = vf.a(95, "MONK_NAMES,2");
          if (null != var2Lifetime70) {
            me.field_a[2] = re.a(18990, var2Lifetime70);
          }
          var2Lifetime71 = vf.a(95, "MASTER_MONK_NAMES,0");
          if (var2Lifetime71 != null) {
            li.field_J[0] = re.a(18990, var2Lifetime71);
          }
          var2Lifetime72 = vf.a(95, "MASTER_MONK_NAMES,1");
          if (null != var2Lifetime72) {
            li.field_J[1] = re.a(18990, var2Lifetime72);
          }
          var2Lifetime73 = vf.a(95, "MASTER_MONK_NAMES,2");
          if (null != var2Lifetime73) {
            li.field_J[2] = re.a(18990, var2Lifetime73);
          }
          var2Lifetime74 = vf.a(95, "UNIT_NAMES,0");
          if (var2Lifetime74 != null) {
            i.field_p[0] = re.a(18990, var2Lifetime74);
          }
          var2Lifetime75 = vf.a(95, "UNIT_NAMES,1");
          if (var2Lifetime75 != null) {
            i.field_p[1] = re.a(18990, var2Lifetime75);
          }
          var2Lifetime76 = vf.a(95, "UNIT_NAMES,2");
          if (null != var2Lifetime76) {
            i.field_p[2] = re.a(18990, var2Lifetime76);
          }
          var2Lifetime77 = vf.a(95, "UNIT_NAMES,3");
          if (null != var2Lifetime77) {
            i.field_p[3] = re.a(param1 + 18990, var2Lifetime77);
          }
          var2Lifetime78 = vf.a(95, "UNIT_NAMES,4");
          if (null != var2Lifetime78) {
            i.field_p[4] = re.a(18990, var2Lifetime78);
          }
          var2Lifetime79 = vf.a(95, "UNIT_NAMES,5");
          if (var2Lifetime79 != null) {
            i.field_p[5] = re.a(param1 + 18990, var2Lifetime79);
          }
          var2Lifetime80 = vf.a(95, "COIN_NAMES,0");
          if (var2Lifetime80 != null) {
            k.field_a[0] = re.a(18990, var2Lifetime80);
          }
          var2Lifetime81 = vf.a(95, "COIN_NAMES,1");
          if (var2Lifetime81 != null) {
            k.field_a[1] = re.a(param1 + 18990, var2Lifetime81);
          }
          var2Lifetime82 = vf.a(95, "COIN_NAMES,2");
          if (null != var2Lifetime82) {
            k.field_a[2] = re.a(18990, var2Lifetime82);
          }
          var2Lifetime83 = vf.a(95, "COIN_NAMES,3");
          if (var2Lifetime83 != null) {
            k.field_a[3] = re.a(TorChallenge.a(param1, 18990), var2Lifetime83);
          }
          var2Lifetime84 = vf.a(95, "POWER_UP_NAMES,0");
          if (null != var2Lifetime84) {
            lb.field_u[0] = re.a(param1 + 18990, var2Lifetime84);
          }
          var2Lifetime85 = vf.a(95, "POWER_UP_NAMES,1");
          if (null != var2Lifetime85) {
            lb.field_u[1] = re.a(18990, var2Lifetime85);
          }
          var2Lifetime86 = vf.a(95, "POWER_UP_NAMES,2");
          if (var2Lifetime86 != null) {
            lb.field_u[2] = re.a(18990, var2Lifetime86);
          }
          var2Lifetime87 = vf.a(95, "POWER_UP_NAMES,3");
          if (var2Lifetime87 != null) {
            lb.field_u[3] = re.a(18990, var2Lifetime87);
          }
          var2Lifetime88 = vf.a(95, "ITEM_NAMES,0");
          if (null != var2Lifetime88) {
            kl.field_d[0] = re.a(18990, var2Lifetime88);
          }
          var2Lifetime89 = vf.a(95, "ITEM_NAMES,1");
          if (null != var2Lifetime89) {
            kl.field_d[1] = re.a(TorChallenge.a(param1, 18990), var2Lifetime89);
          }
          var2Lifetime90 = vf.a(95, "ITEM_NAMES,2");
          if (var2Lifetime90 != null) {
            kl.field_d[2] = re.a(TorChallenge.a(param1, 18990), var2Lifetime90);
          }
          var2Lifetime91 = vf.a(95, "ITEM_NAMES,3");
          if (var2Lifetime91 != null) {
            kl.field_d[3] = re.a(18990, var2Lifetime91);
          }
          var2Lifetime92 = vf.a(95, "HELP_TEXT,0,0");
          if (null != var2Lifetime92) {
            aa.field_h[0][0] = re.a(18990, var2Lifetime92);
          }
          var2Lifetime93 = vf.a(95, "HELP_TEXT,0,1");
          if (var2Lifetime93 != null) {
            aa.field_h[0][1] = re.a(TorChallenge.a(param1, 18990), var2Lifetime93);
          }
          var2Lifetime94 = vf.a(95, "HELP_TEXT,0,2");
          if (var2Lifetime94 != null) {
            aa.field_h[0][2] = re.a(18990, var2Lifetime94);
          }
          if (param1 != 0) {
            field_m = (int[]) null;
          }
          var2Lifetime95 = vf.a(95, "HELP_TEXT,0,3");
          if (var2Lifetime95 != null) {
            aa.field_h[0][3] = re.a(18990, var2Lifetime95);
          }
          var2Lifetime96 = vf.a(95, "HELP_TEXT,0,4");
          if (var2Lifetime96 != null) {
            aa.field_h[0][4] = re.a(18990, var2Lifetime96);
          }
          var2Lifetime97 = vf.a(95, "HELP_TEXT,0,5");
          if (null != var2Lifetime97) {
            aa.field_h[0][5] = re.a(18990, var2Lifetime97);
          }
          var2Lifetime98 = vf.a(95, "HELP_TEXT,0,6");
          if (var2Lifetime98 != null) {
            aa.field_h[0][6] = re.a(18990, var2Lifetime98);
          }
          var2Lifetime99 = vf.a(95, "HELP_TEXT,0,7");
          if (null != var2Lifetime99) {
            aa.field_h[0][7] = re.a(18990, var2Lifetime99);
          }
          var2Lifetime100 = vf.a(95, "HELP_TEXT,0,8");
          if (var2Lifetime100 != null) {
            aa.field_h[0][8] = re.a(18990, var2Lifetime100);
          }
          var2Lifetime101 = vf.a(95, "HELP_TEXT,0,9");
          if (var2Lifetime101 != null) {
            aa.field_h[0][9] = re.a(18990, var2Lifetime101);
          }
          var2Lifetime102 = vf.a(95, "HELP_TEXT,0,10");
          if (null != var2Lifetime102) {
            aa.field_h[0][10] = re.a(18990, var2Lifetime102);
          }
          var2Lifetime103 = vf.a(95, "HELP_TEXT,0,11");
          if (var2Lifetime103 != null) {
            aa.field_h[0][11] = re.a(18990, var2Lifetime103);
          }
          var2Lifetime104 = vf.a(95, "HELP_TEXT,0,12");
          if (null != var2Lifetime104) {
            aa.field_h[0][12] = re.a(TorChallenge.a(param1, 18990), var2Lifetime104);
          }
          var2Lifetime105 = vf.a(95, "HELP_TEXT,0,13");
          if (null != var2Lifetime105) {
            aa.field_h[0][13] = re.a(param1 + 18990, var2Lifetime105);
          }
          var2Lifetime106 = vf.a(95, "HELP_TEXT,0,14");
          if (var2Lifetime106 != null) {
            aa.field_h[0][14] = re.a(18990, var2Lifetime106);
          }
          var2Lifetime107 = vf.a(95, "HELP_TEXT,0,15");
          if (var2Lifetime107 != null) {
            aa.field_h[0][15] = re.a(18990, var2Lifetime107);
          }
          var2Lifetime108 = vf.a(95, "HELP_TEXT,0,16");
          if (null != var2Lifetime108) {
            aa.field_h[0][16] = re.a(18990, var2Lifetime108);
          }
          var2Lifetime109 = vf.a(95, "HELP_TEXT,0,17");
          if (var2Lifetime109 != null) {
            aa.field_h[0][17] = re.a(TorChallenge.a(param1, 18990), var2Lifetime109);
          }
          var2Lifetime110 = vf.a(95, "HELP_TEXT,1,0");
          if (null != var2Lifetime110) {
            aa.field_h[1][0] = re.a(TorChallenge.a(param1, 18990), var2Lifetime110);
          }
          var2Lifetime111 = vf.a(95, "HELP_TEXT,1,1");
          if (null != var2Lifetime111) {
            aa.field_h[1][1] = re.a(18990, var2Lifetime111);
          }
          var2Lifetime112 = vf.a(95, "HELP_TEXT,1,2");
          if (var2Lifetime112 != null) {
            aa.field_h[1][2] = re.a(18990, var2Lifetime112);
          }
          var2Lifetime113 = vf.a(95, "HELP_TEXT,1,3");
          if (null != var2Lifetime113) {
            aa.field_h[1][3] = re.a(18990, var2Lifetime113);
          }
          var2Lifetime114 = vf.a(95, "HELP_TEXT,1,4");
          if (var2Lifetime114 != null) {
            aa.field_h[1][4] = re.a(18990, var2Lifetime114);
          }
          var2Lifetime115 = vf.a(95, "HELP_TEXT,1,5");
          if (var2Lifetime115 != null) {
            aa.field_h[1][5] = re.a(18990, var2Lifetime115);
          }
          var2Lifetime116 = vf.a(95, "HELP_TEXT,1,6");
          if (null != var2Lifetime116) {
            aa.field_h[1][6] = re.a(18990, var2Lifetime116);
          }
          var2Lifetime117 = vf.a(95, "HELP_TEXT,1,7");
          if (null != var2Lifetime117) {
            aa.field_h[1][7] = re.a(18990, var2Lifetime117);
          }
          var2Lifetime118 = vf.a(95, "HELP_TEXT,1,8");
          if (var2Lifetime118 != null) {
            aa.field_h[1][8] = re.a(param1 + 18990, var2Lifetime118);
          }
          var2Lifetime119 = vf.a(95, "HELP_TEXT,1,9");
          if (null != var2Lifetime119) {
            aa.field_h[1][9] = re.a(TorChallenge.a(param1, 18990), var2Lifetime119);
          }
          var2Lifetime120 = vf.a(95, "HELP_TEXT,1,10");
          if (var2Lifetime120 != null) {
            aa.field_h[1][10] = re.a(18990, var2Lifetime120);
          }
          var2Lifetime121 = vf.a(95, "HELP_TEXT,1,11");
          if (var2Lifetime121 != null) {
            aa.field_h[1][11] = re.a(param1 + 18990, var2Lifetime121);
          }
          var2Lifetime122 = vf.a(95, "HELP_TEXT,2,0");
          if (var2Lifetime122 != null) {
            aa.field_h[2][0] = re.a(TorChallenge.a(param1, 18990), var2Lifetime122);
          }
          var2Lifetime123 = vf.a(95, "HELP_TEXT,2,1");
          if (null != var2Lifetime123) {
            aa.field_h[2][1] = re.a(18990, var2Lifetime123);
          }
          var2Lifetime124 = vf.a(95, "HELP_TEXT,2,2");
          if (var2Lifetime124 != null) {
            aa.field_h[2][2] = re.a(18990, var2Lifetime124);
          }
          var2Lifetime125 = vf.a(95, "HELP_TEXT,2,3");
          if (var2Lifetime125 != null) {
            aa.field_h[2][3] = re.a(18990, var2Lifetime125);
          }
          var2Lifetime126 = vf.a(95, "HELP_TEXT,2,4");
          if (null != var2Lifetime126) {
            aa.field_h[2][4] = re.a(18990, var2Lifetime126);
          }
          var2Lifetime127 = vf.a(95, "HELP_TEXT,2,5");
          if (null != var2Lifetime127) {
            aa.field_h[2][5] = re.a(param1 + 18990, var2Lifetime127);
          }
          var2Lifetime128 = vf.a(95, "HELP_TEXT,2,6");
          if (var2Lifetime128 != null) {
            aa.field_h[2][6] = re.a(TorChallenge.a(param1, 18990), var2Lifetime128);
          }
          var2Lifetime129 = vf.a(95, "HELP_TEXT,3,0");
          if (null != var2Lifetime129) {
            aa.field_h[3][0] = re.a(18990, var2Lifetime129);
          }
          var2Lifetime130 = vf.a(95, "HELP_TEXT,3,1");
          if (null != var2Lifetime130) {
            aa.field_h[3][1] = re.a(18990, var2Lifetime130);
          }
          var2Lifetime131 = vf.a(95, "HELP_TEXT,3,2");
          if (var2Lifetime131 != null) {
            aa.field_h[3][2] = re.a(18990, var2Lifetime131);
          }
          var2Lifetime132 = vf.a(95, "HELP_TEXT,3,3");
          if (var2Lifetime132 != null) {
            aa.field_h[3][3] = re.a(TorChallenge.a(param1, 18990), var2Lifetime132);
          }
          var2Lifetime133 = vf.a(95, "HELP_TEXT,3,4");
          if (var2Lifetime133 != null) {
            aa.field_h[3][4] = re.a(param1 + 18990, var2Lifetime133);
          }
          var2Lifetime134 = vf.a(95, "HELP_TEXT,3,5");
          if (null != var2Lifetime134) {
            aa.field_h[3][5] = re.a(18990, var2Lifetime134);
          }
          var2Lifetime135 = vf.a(95, "HELP_TEXT,3,6");
          if (null != var2Lifetime135) {
            aa.field_h[3][6] = re.a(18990, var2Lifetime135);
          }
          var2Lifetime136 = vf.a(95, "HELP_TEXT,3,7");
          if (var2Lifetime136 != null) {
            aa.field_h[3][7] = re.a(param1 + 18990, var2Lifetime136);
          }
          var2Lifetime137 = vf.a(95, "HELP_TEXT,3,8");
          if (var2Lifetime137 != null) {
            aa.field_h[3][8] = re.a(18990, var2Lifetime137);
          }
          var2Lifetime138 = vf.a(95, "HELP_TEXT,3,9");
          if (null != var2Lifetime138) {
            aa.field_h[3][9] = re.a(18990, var2Lifetime138);
          }
          var2Lifetime139 = vf.a(95, "HELP_TEXT,3,10");
          if (null != var2Lifetime139) {
            aa.field_h[3][10] = re.a(18990, var2Lifetime139);
          }
          var2Lifetime140 = vf.a(95, "HELP_TEXT,3,11");
          if (var2Lifetime140 != null) {
            aa.field_h[3][11] = re.a(18990, var2Lifetime140);
          }
          var2Lifetime141 = vf.a(95, "HELP_TEXT,3,12");
          if (null != var2Lifetime141) {
            aa.field_h[3][12] = re.a(18990, var2Lifetime141);
          }
          var2Lifetime142 = vf.a(95, "HELP_TEXT,3,13");
          if (var2Lifetime142 != null) {
            aa.field_h[3][13] = re.a(18990, var2Lifetime142);
          }
          var2Lifetime143 = vf.a(95, "HELP_TEXT,4,0");
          if (var2Lifetime143 != null) {
            aa.field_h[4][0] = re.a(18990, var2Lifetime143);
          }
          var2Lifetime144 = vf.a(95, "HELP_TEXT,4,1");
          if (null != var2Lifetime144) {
            aa.field_h[4][1] = re.a(18990, var2Lifetime144);
          }
          var2Lifetime145 = vf.a(95, "HELP_TEXT,4,2");
          if (null != var2Lifetime145) {
            aa.field_h[4][2] = re.a(18990, var2Lifetime145);
          }
          var2Lifetime146 = vf.a(95, "HELP_TEXT,4,3");
          if (null != var2Lifetime146) {
            aa.field_h[4][3] = re.a(18990, var2Lifetime146);
          }
          var2Lifetime147 = vf.a(95, "HELP_TEXT,4,4");
          if (var2Lifetime147 != null) {
            aa.field_h[4][4] = re.a(TorChallenge.a(param1, 18990), var2Lifetime147);
          }
          var2Lifetime148 = vf.a(95, "HELP_TEXT,4,5");
          if (null != var2Lifetime148) {
            aa.field_h[4][5] = re.a(18990, var2Lifetime148);
          }
          var2Lifetime149 = vf.a(95, "HELP_TEXT,4,6");
          if (var2Lifetime149 != null) {
            aa.field_h[4][6] = re.a(18990, var2Lifetime149);
          }
          var2Lifetime150 = vf.a(95, "HELP_TEXT,4,7");
          if (null != var2Lifetime150) {
            aa.field_h[4][7] = re.a(18990, var2Lifetime150);
          }
          var2Lifetime151 = vf.a(95, "HELP_TEXT,4,8");
          if (null != var2Lifetime151) {
            aa.field_h[4][8] = re.a(18990, var2Lifetime151);
          }
          var2Lifetime152 = vf.a(95, "HELP_TEXT,5,0");
          if (null != var2Lifetime152) {
            aa.field_h[5][0] = re.a(param1 + 18990, var2Lifetime152);
          }
          var2Lifetime153 = vf.a(95, "HELP_TEXT_MISSING");
          if (null != var2Lifetime153) {
            wj.field_d = re.a(18990, var2Lifetime153);
          }
          var2Lifetime154 = vf.a(95, "LEVEL_EXIT_UNLOCKED");
          if (var2Lifetime154 != null) {
            lj.field_k = re.a(18990, var2Lifetime154);
          }
          var2Lifetime155 = vf.a(95, "COLLECT_MORE_SEALS");
          if (null != var2Lifetime155) {
            uf.field_p = re.a(18990, var2Lifetime155);
          }
          var2Lifetime156 = vf.a(95, "INTRO_TEXT,0,0");
          if (var2Lifetime156 != null) {
            dg.field_bb[0][0] = re.a(18990, var2Lifetime156);
          }
          var2Lifetime157 = vf.a(95, "INTRO_TEXT,1,0");
          if (var2Lifetime157 != null) {
            dg.field_bb[1][0] = re.a(18990, var2Lifetime157);
          }
          var2Lifetime158 = vf.a(95, "INTRO_TEXT,1,1");
          if (var2Lifetime158 != null) {
            dg.field_bb[1][1] = re.a(18990, var2Lifetime158);
          }
          var2Lifetime159 = vf.a(95, "INTRO_TEXT,2,0");
          if (var2Lifetime159 != null) {
            dg.field_bb[2][0] = re.a(18990, var2Lifetime159);
          }
          var2Lifetime160 = vf.a(95, "INTRO_TEXT,2,1");
          if (null != var2Lifetime160) {
            dg.field_bb[2][1] = re.a(18990, var2Lifetime160);
          }
          var2Lifetime161 = vf.a(95, "INTRO_TEXT,3,0");
          if (var2Lifetime161 != null) {
            dg.field_bb[3][0] = re.a(18990, var2Lifetime161);
          }
          var2Lifetime162 = vf.a(95, "INTRO_TEXT,3,1");
          if (null != var2Lifetime162) {
            dg.field_bb[3][1] = re.a(18990, var2Lifetime162);
          }
          var2Lifetime163 = vf.a(95, "INTRO_TEXT,3,2");
          if (var2Lifetime163 != null) {
            dg.field_bb[3][2] = re.a(TorChallenge.a(param1, 18990), var2Lifetime163);
          }
          var2Lifetime164 = vf.a(95, "INTRO_TEXT,4,0");
          if (var2Lifetime164 != null) {
            dg.field_bb[4][0] = re.a(18990, var2Lifetime164);
          }
          var2Lifetime165 = vf.a(95, "GAME_COMPLETE_TEXT,0,0");
          if (var2Lifetime165 != null) {
            vg.field_b[0][0] = re.a(18990, var2Lifetime165);
          }
          var2Lifetime166 = vf.a(95, "GAME_COMPLETE_TEXT,0,1");
          if (null != var2Lifetime166) {
            vg.field_b[0][1] = re.a(param1 + 18990, var2Lifetime166);
          }
          var2Lifetime167 = vf.a(95, "GAME_COMPLETE_TEXT,1,0");
          if (null != var2Lifetime167) {
            vg.field_b[1][0] = re.a(18990, var2Lifetime167);
          }
          var2Lifetime168 = vf.a(95, "GAME_COMPLETE_TEXT,1,1");
          if (var2Lifetime168 != null) {
            vg.field_b[1][1] = re.a(18990, var2Lifetime168);
          }
          var2Lifetime169 = vf.a(95, "HELP_TEXT_ENTER_DOOR");
          if (var2Lifetime169 != null) {
            k.field_h = re.a(18990, var2Lifetime169);
          }
          var2Lifetime170 = vf.a(95, "OPTION_TEXT_MISSING_ERROR");
          if (null != var2Lifetime170) {
            oh.field_a = re.a(18990, var2Lifetime170);
          }
          var2Lifetime171 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,0,0");
          if (null != var2Lifetime171) {
            p.field_c[0][0] = re.a(18990, var2Lifetime171);
          }
          var2Lifetime172 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,0,1");
          if (null != var2Lifetime172) {
            p.field_c[0][1] = re.a(18990, var2Lifetime172);
          }
          var2Lifetime173 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,1,0");
          if (var2Lifetime173 != null) {
            p.field_c[1][0] = re.a(18990, var2Lifetime173);
          }
          var2Lifetime174 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,1,1");
          if (var2Lifetime174 != null) {
            p.field_c[1][1] = re.a(18990, var2Lifetime174);
          }
          var2Lifetime175 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,2,0");
          if (null != var2Lifetime175) {
            p.field_c[2][0] = re.a(18990, var2Lifetime175);
          }
          var2Lifetime176 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,2,1");
          if (var2Lifetime176 != null) {
            p.field_c[2][1] = re.a(18990, var2Lifetime176);
          }
          var2Lifetime177 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,3,0");
          if (var2Lifetime177 != null) {
            p.field_c[3][0] = re.a(18990, var2Lifetime177);
          }
          var2Lifetime178 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,3,1");
          if (null != var2Lifetime178) {
            p.field_c[3][1] = re.a(18990, var2Lifetime178);
          }
          var2Lifetime179 = vf.a(95, "NOT_AVAILABLE");
          if (var2Lifetime179 != null) {
            di.field_B = re.a(18990, var2Lifetime179);
          }
          var2Lifetime180 = vf.a(95, "INTERFACE_INSTRUCTIONS,0");
          if (var2Lifetime180 != null) {
            sl.field_d[0] = re.a(18990, var2Lifetime180);
          }
          var2Lifetime181 = vf.a(95, "INTERFACE_INSTRUCTIONS,1");
          if (null != var2Lifetime181) {
            sl.field_d[1] = re.a(param1 + 18990, var2Lifetime181);
          }
          var2Lifetime182 = vf.a(95, "INTERFACE_INSTRUCTIONS,2");
          if (null != var2Lifetime182) {
            sl.field_d[2] = re.a(18990, var2Lifetime182);
          }
          var2Lifetime183 = vf.a(95, "INTERFACE_INSTRUCTIONS,3");
          if (var2Lifetime183 != null) {
            sl.field_d[3] = re.a(TorChallenge.a(param1, 18990), var2Lifetime183);
          }
          var2Lifetime184 = vf.a(95, "HEALTH_POTION_MESSAGE");
          if (var2Lifetime184 != null) {
            df.field_P = re.a(18990, var2Lifetime184);
          }
          var2Lifetime185 = vf.a(95, "keycode_attack");
          if (null != var2Lifetime185) {
            of.field_d = 255 & var2Lifetime185[0];
          }
          var2Lifetime186 = vf.a(95, "keycode_jump");
          dj.field_cb = null;
          if (null != var2Lifetime186) {
            ll.field_a = 255 & var2Lifetime186[0];
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_648_0 = var2_ref;
          stackIn_648_1 = new StringBuilder().append("kc.F(");
          if (param0 == null) {
            stackIn_649_2 = "null";
          } else {
            stackIn_649_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_648_0), ((StringBuilder) (Object) stackIn_648_1).append(stackIn_649_2).append(',').append(param1).append(')').toString());
        }
        if (ug.field_k != 0) {
          TorChallenge.field_F = (var3 == 0);
        }
    }

    public static void d(byte param0) {
        field_p = null;
        field_m = null;
        if (param0 != 102) {
          return;
        }
        try {
          field_s = null;
          field_t = null;
          field_w = (int[][]) null;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "kc.E(" + param0 + ')');
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_r.a((byte) 24, param0) == lk.field_c) {
            stackIn_2_0 = this.field_r.a(param0, (byte) -24);
            return stackIn_2_0;
          }
          if (param1 != -24) {
            kc.a((String) null, (byte) -57, (String) null);
          }
          if (this.a((byte) 24, param0) == lk.field_c) {
            stackIn_10_0 = kg.field_cb;
            return stackIn_10_0;
          }
          stackIn_12_0 = rk.field_c;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("kc.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (gj.field_c == param0 ||
            !mf.a((byte) 91)) {
            vl.b((byte) 91);
            gj.field_c = 11;
          }
          hk.field_d = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "kc.L(" + param0 + ')');
        }
    }

    kc(dj param0, dj param1) {
        super(param0);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_o = false;
        this.field_q = "";
        try {
          this.field_r = new gf(param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("kc.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, int[] param1, byte param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          while (true) {
            param4--;
            if (param4 >= 0) {
              var5 = param1;
              var6 = param3;
              var7 = param0;
              var5[var6] = var7 + (jh.a(16711422, var5[var6]) >> 1);
              param3++;
              if (var8 != 0) {
                return;
              }
              continue;
            }
            break;
          }
          if (param2 != -39) {
            field_p = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("kc.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static qa g(int param0) {
        RuntimeException var1 = null;
        qa stackIn_2_0 = null;
        qa stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 2) {
            stackIn_4_0 = new qa(il.f(param0 ^ -24042), ah.a((byte) -63));
            return stackIn_4_0;
          }
          stackIn_2_0 = (qa) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "kc.A(" + param0 + ')');
        }
    }

    final rj a(byte param0, String param1) {
        vh var3 = null;
        RuntimeException var3_ref = null;
        rj stackIn_2_0 = null;
        rj stackIn_6_0 = null;
        rj stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_r.a(param0, param1) == lk.field_c) {
            stackIn_2_0 = lk.field_c;
            return stackIn_2_0;
          }
          if (!param1.equals(this.field_q)) {
            var3 = si.a(param1, param0 + 89);
            if (!var3.b(0)) {
              stackIn_6_0 = jh.field_c;
              return stackIn_6_0;
            }
            this.field_q = param1;
            this.field_o = var3.a(false);
          }
          if (!this.field_o) {
            stackIn_12_0 = lk.field_c;
          } else {
            stackIn_12_0 = tf.field_w;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("kc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_n = 0;
        field_u = 0;
        field_w = (int[][]) null;
        field_v = 0;
        field_m = new int[8192];
        field_t = "OVER <%0>";
        field_p = new int[]{20, 20, 20, 30, 20, 30};
    }
}
