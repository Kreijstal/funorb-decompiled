/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dl extends ri {
    static long[][] field_n;
    int field_o;
    static long[] field_q;
    static byte[][] field_p;
    static fc field_l;
    static String field_m;

    public static void b(boolean param0) {
        field_l = null;
        field_n = (long[][]) null;
        if (param0) {
          return;
        }
        try {
          field_q = null;
          field_m = null;
          field_p = (byte[][]) null;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "dl.D(" + param0 + ')');
        }
    }

    abstract Object c(byte param0);

    dl(int param0) {
        try {
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "dl.<init>(" + param0 + ')');
        }
    }

    final static void a(ci param0, byte param1) {
        RuntimeException stackIn_249_0 = null;
        StringBuilder stackIn_249_1 = null;
        String stackIn_250_2 = null;
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
        try {
          uj.field_h = param0;
          var2 = qd.a(10, "defaultlang");
          if (var2 != null) {
            hi.field_d = eg.a(104, var2);
          }
          var2Lifetime1 = qd.a(10, "achievement_names,0");
          if (var2Lifetime1 != null) {
            qj.field_a[0] = eg.a(120, var2Lifetime1);
          }
          var2Lifetime2 = qd.a(10, "achievement_names,1");
          if (null != var2Lifetime2) {
            qj.field_a[1] = eg.a(84, var2Lifetime2);
          }
          var2Lifetime3 = qd.a(10, "achievement_names,2");
          if (null != var2Lifetime3) {
            qj.field_a[2] = eg.a(97, var2Lifetime3);
          }
          var2Lifetime4 = qd.a(10, "achievement_names,3");
          if (var2Lifetime4 != null) {
            qj.field_a[3] = eg.a(111, var2Lifetime4);
          }
          var2Lifetime5 = qd.a(10, "achievement_names,4");
          if (null != var2Lifetime5) {
            qj.field_a[4] = eg.a(112, var2Lifetime5);
          }
          var2Lifetime6 = qd.a(10, "achievement_names,5");
          if (null != var2Lifetime6) {
            qj.field_a[5] = eg.a(126, var2Lifetime6);
          }
          var2Lifetime7 = qd.a(10, "achievement_names,6");
          if (null != var2Lifetime7) {
            qj.field_a[6] = eg.a(108, var2Lifetime7);
          }
          var2Lifetime8 = qd.a(10, "achievement_names,7");
          if (var2Lifetime8 != null) {
            qj.field_a[7] = eg.a(114, var2Lifetime8);
          }
          var2Lifetime9 = qd.a(10, "achievement_names,8");
          if (null != var2Lifetime9) {
            qj.field_a[8] = eg.a(110, var2Lifetime9);
          }
          var2Lifetime10 = qd.a(10, "achievement_names,9");
          if (var2Lifetime10 != null) {
            qj.field_a[9] = eg.a(96, var2Lifetime10);
          }
          var2Lifetime11 = qd.a(10, "achievement_names,10");
          if (null != var2Lifetime11) {
            qj.field_a[10] = eg.a(95, var2Lifetime11);
          }
          var2Lifetime12 = qd.a(10, "achievement_names,11");
          if (null != var2Lifetime12) {
            qj.field_a[11] = eg.a(84, var2Lifetime12);
          }
          var2Lifetime13 = qd.a(10, "achievement_names,12");
          if (var2Lifetime13 != null) {
            qj.field_a[12] = eg.a(102, var2Lifetime13);
          }
          var2Lifetime14 = qd.a(10, "achievement_names,13");
          if (var2Lifetime14 != null) {
            qj.field_a[13] = eg.a(107, var2Lifetime14);
          }
          var2Lifetime15 = qd.a(10, "achievement_names,14");
          if (null != var2Lifetime15) {
            qj.field_a[14] = eg.a(92, var2Lifetime15);
          }
          var2Lifetime16 = qd.a(10, "achievement_names,15");
          if (var2Lifetime16 != null) {
            qj.field_a[15] = eg.a(117, var2Lifetime16);
          }
          var2Lifetime17 = qd.a(10, "achievement_criteria,0");
          if (var2Lifetime17 != null) {
            bl.field_b[0] = eg.a(109, var2Lifetime17);
          }
          var2Lifetime18 = qd.a(10, "achievement_criteria,1");
          if (var2Lifetime18 != null) {
            bl.field_b[1] = eg.a(85, var2Lifetime18);
          }
          var2Lifetime19 = qd.a(10, "achievement_criteria,2");
          if (null != var2Lifetime19) {
            bl.field_b[2] = eg.a(106, var2Lifetime19);
          }
          var2Lifetime20 = qd.a(10, "achievement_criteria,3");
          if (var2Lifetime20 != null) {
            bl.field_b[3] = eg.a(86, var2Lifetime20);
          }
          var2Lifetime21 = qd.a(10, "achievement_criteria,4");
          if (null != var2Lifetime21) {
            bl.field_b[4] = eg.a(125, var2Lifetime21);
          }
          var2Lifetime22 = qd.a(10, "achievement_criteria,5");
          if (null != var2Lifetime22) {
            bl.field_b[5] = eg.a(124, var2Lifetime22);
          }
          var2Lifetime23 = qd.a(10, "achievement_criteria,6");
          if (null != var2Lifetime23) {
            bl.field_b[6] = eg.a(95, var2Lifetime23);
          }
          var2Lifetime24 = qd.a(10, "achievement_criteria,7");
          if (var2Lifetime24 != null) {
            bl.field_b[7] = eg.a(102, var2Lifetime24);
          }
          var2Lifetime25 = qd.a(10, "achievement_criteria,8");
          if (null != var2Lifetime25) {
            bl.field_b[8] = eg.a(112, var2Lifetime25);
          }
          var2Lifetime26 = qd.a(10, "achievement_criteria,9");
          if (null != var2Lifetime26) {
            bl.field_b[9] = eg.a(124, var2Lifetime26);
          }
          var2Lifetime27 = qd.a(10, "achievement_criteria,10");
          if (var2Lifetime27 != null) {
            bl.field_b[10] = eg.a(118, var2Lifetime27);
          }
          var2Lifetime28 = qd.a(10, "achievement_criteria,11");
          if (null != var2Lifetime28) {
            bl.field_b[11] = eg.a(88, var2Lifetime28);
          }
          var2Lifetime29 = qd.a(10, "achievement_criteria,12");
          if (var2Lifetime29 != null) {
            bl.field_b[12] = eg.a(92, var2Lifetime29);
          }
          var2Lifetime30 = qd.a(10, "achievement_criteria,13");
          if (var2Lifetime30 != null) {
            bl.field_b[13] = eg.a(111, var2Lifetime30);
          }
          var2Lifetime31 = qd.a(10, "achievement_criteria,14");
          if (null != var2Lifetime31) {
            bl.field_b[14] = eg.a(118, var2Lifetime31);
          }
          var2Lifetime32 = qd.a(10, "achievement_criteria,15");
          if (null != var2Lifetime32) {
            bl.field_b[15] = eg.a(112, var2Lifetime32);
          }
          var2Lifetime33 = qd.a(10, "submit_for_space");
          var3 = 66 % ((param1 - 46) / 51);
          if (var2Lifetime33 != null) {
            tj.field_z = eg.a(106, var2Lifetime33);
          }
          var2Lifetime34 = qd.a(10, "submit");
          if (null != var2Lifetime34) {
            da.field_z = eg.a(94, var2Lifetime34);
          }
          var2Lifetime35 = qd.a(10, "shuffle");
          if (var2Lifetime35 != null) {
            th.field_b = eg.a(125, var2Lifetime35);
          }
          var2Lifetime36 = qd.a(10, "variety_bonus");
          if (var2Lifetime36 != null) {
            sg.field_k = eg.a(88, var2Lifetime36);
          }
          var2Lifetime37 = qd.a(10, "time_bonus");
          if (null != var2Lifetime37) {
            ub.field_e = eg.a(115, var2Lifetime37);
          }
          var2Lifetime38 = qd.a(10, "total");
          if (var2Lifetime38 != null) {
            ve.field_D = eg.a(99, var2Lifetime38);
          }
          var2Lifetime39 = qd.a(10, "confirm_zero_score");
          if (var2Lifetime39 != null) {
            he.field_g = eg.a(98, var2Lifetime39);
          }
          var2Lifetime40 = qd.a(10, "ok");
          if (var2Lifetime40 != null) {
            il.field_a = eg.a(124, var2Lifetime40);
          }
          var2Lifetime41 = qd.a(10, "cancel");
          if (var2Lifetime41 != null) {
            nh.field_h = eg.a(93, var2Lifetime41);
          }
          var2Lifetime42 = qd.a(10, "cont");
          if (var2Lifetime42 != null) {
            pd.field_c = eg.a(108, var2Lifetime42);
          }
          var2Lifetime43 = qd.a(10, "resume_tutorial");
          if (var2Lifetime43 != null) {
            re.field_m = eg.a(113, var2Lifetime43);
          }
          var2Lifetime44 = qd.a(10, "end_tutorial");
          if (null != var2Lifetime44) {
            ca.field_a = eg.a(104, var2Lifetime44);
          }
          var2Lifetime45 = qd.a(10, "loadingHalloween");
          if (var2Lifetime45 != null) {
            ih.field_c = eg.a(125, var2Lifetime45);
          }
          var2Lifetime46 = qd.a(10, "waitingHalloween");
          if (var2Lifetime46 != null) {
            q.field_e = eg.a(83, var2Lifetime46);
          }
          var2Lifetime47 = qd.a(10, "halloweenAchievemnts,0");
          if (null != var2Lifetime47) {
            ua.field_a[0] = eg.a(123, var2Lifetime47);
          }
          var2Lifetime48 = qd.a(10, "halloweenAchievemnts,1");
          if (null != var2Lifetime48) {
            ua.field_a[1] = eg.a(104, var2Lifetime48);
          }
          var2Lifetime49 = qd.a(10, "halloweenAchievemnts,2");
          if (null != var2Lifetime49) {
            ua.field_a[2] = eg.a(99, var2Lifetime49);
          }
          var2Lifetime50 = qd.a(10, "halloweenAchievemnts,3");
          if (var2Lifetime50 != null) {
            ua.field_a[3] = eg.a(124, var2Lifetime50);
          }
          var2Lifetime51 = qd.a(10, "all");
          if (var2Lifetime51 != null) {
            ol.field_c = eg.a(117, var2Lifetime51);
          }
          var2Lifetime52 = qd.a(10, "mine");
          if (var2Lifetime52 != null) {
            se.field_q = eg.a(98, var2Lifetime52);
          }
          var2Lifetime53 = qd.a(10, "besteach");
          if (var2Lifetime53 != null) {
            uc.field_b = eg.a(83, var2Lifetime53);
          }
          var2Lifetime54 = qd.a(10, "languagecolon");
          if (null != var2Lifetime54) {
            ck.field_H = eg.a(111, var2Lifetime54);
          }
          var2Lifetime55 = qd.a(10, "instructions_pages,0");
          if (var2Lifetime55 != null) {
            db.field_b[0] = eg.a(118, var2Lifetime55);
          }
          var2Lifetime56 = qd.a(10, "instructions_pages,1");
          if (null != var2Lifetime56) {
            db.field_b[1] = eg.a(93, var2Lifetime56);
          }
          var2Lifetime57 = qd.a(10, "instructions_pages,2");
          if (var2Lifetime57 != null) {
            db.field_b[2] = eg.a(93, var2Lifetime57);
          }
          var2Lifetime58 = qd.a(10, "instructions_pages,3");
          if (null != var2Lifetime58) {
            db.field_b[3] = eg.a(117, var2Lifetime58);
          }
          var2Lifetime59 = qd.a(10, "instructions_pages,4");
          if (var2Lifetime59 != null) {
            db.field_b[4] = eg.a(98, var2Lifetime59);
          }
          var2Lifetime60 = qd.a(10, "instructions_pages,5");
          if (var2Lifetime60 != null) {
            db.field_b[5] = eg.a(112, var2Lifetime60);
          }
          var2Lifetime61 = qd.a(10, "submission_rack_label");
          if (var2Lifetime61 != null) {
            ej.field_p = eg.a(125, var2Lifetime61);
          }
          var2Lifetime62 = qd.a(10, "tuttext1");
          if (null != var2Lifetime62) {
            sh.field_a = eg.a(126, var2Lifetime62);
          }
          var2Lifetime63 = qd.a(10, "tuttext2");
          if (var2Lifetime63 != null) {
            ll.field_W = eg.a(126, var2Lifetime63);
          }
          var2Lifetime64 = qd.a(10, "tuttext3");
          if (var2Lifetime64 != null) {
            nl.field_g = eg.a(94, var2Lifetime64);
          }
          var2Lifetime65 = qd.a(10, "readysetgo_str,0");
          if (var2Lifetime65 != null) {
            mc.field_a[0] = eg.a(124, var2Lifetime65);
          }
          var2Lifetime66 = qd.a(10, "readysetgo_str,1");
          if (var2Lifetime66 != null) {
            mc.field_a[1] = eg.a(109, var2Lifetime66);
          }
          var2Lifetime67 = qd.a(10, "readysetgo_str,2");
          if (var2Lifetime67 != null) {
            mc.field_a[2] = eg.a(83, var2Lifetime67);
          }
          uj.field_h = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_249_0 = var2_ref;
          stackIn_249_1 = new StringBuilder().append("dl.E(");
          if (param0 == null) {
            stackIn_250_2 = "null";
          } else {
            stackIn_250_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_249_0), ((StringBuilder) (Object) stackIn_249_1).append(stackIn_250_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract boolean d(int param0);

    static {
        int var14 = 0;
        int var0;
        int var1;
        long var2;
        long var4;
        long var6;
        long var8;
        long var10;
        long var12;
        long stackIn_6_0 = 0L;
        field_n = new long[8][256];
        field_q = new long[11];
        var0 = 0;
        L0: while (var0 < 256) {
          var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
          if ((1 & var0) != 0) {
            stackIn_6_0 = (long)(var1 & 255);
          } else {
            stackIn_6_0 = (long)(var1 >>> 8);
          }
          var2 = stackIn_6_0;
          var4 = var2 << 1;
          if (256L <= var4) {
            var4 = var4 ^ 285L;
          }
          var6 = var4 << 1;
          if (256L <= var6) {
            var6 = var6 ^ 285L;
          }
          var8 = var2 ^ var6;
          var10 = var6 << 1;
          if (var10 >= 256L) {
            var10 = var10 ^ 285L;
          }
          var12 = var2 ^ var10;
          field_n[0][var0] = hi.a(hi.a(var4 << 8, hi.a(hi.a(var10 << 24, hi.a(hi.a(var6 << 40, hi.a(var2 << 48, var2 << 56)), var2 << 32)), var8 << 16)), var12);
          for (var14 = 1; var14 < 8; var14++) {
            field_n[var14][var0] = hi.a(field_n[-1 + var14][var0] << 56, field_n[-1 + var14][var0] >>> 8);
          }
          var0++;
        }
        field_q[0] = 0L;
        for (var0 = 1; 10 >= var0; var0++) {
          var1 = (-1 + var0) * 8;
          field_q[var0] = aj.a(ej.a(255L, field_n[7][7 + var1]), aj.a(ej.a(field_n[6][var1 + 6], 65280L), aj.a(ej.a(16711680L, field_n[5][5 + var1]), aj.a(aj.a(ej.a(1095216660480L, field_n[3][var1 + 3]), aj.a(aj.a(ej.a(field_n[1][1 + var1], 71776119061217280L), ej.a(-72057594037927936L, field_n[0][var1])), ej.a(field_n[2][var1 + 2], 280375465082880L))), ej.a(field_n[4][var1 + 4], 4278190080L)))));
        }
        field_p = new byte[50][];
        field_m = "Highscores";
    }
}
