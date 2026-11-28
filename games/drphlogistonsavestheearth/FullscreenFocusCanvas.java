/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenFocusCanvas extends java.awt.Canvas implements java.awt.event.FocusListener {
    static int[][] field_b;
    static String field_g;
    static String field_d;
    static he field_f;
    java.awt.Frame fullscreenFrame;
    static RgbSprite field_e;
    static int field_c;
    volatile boolean focusLost;

    final static void a(byte param0, boolean param1, boolean param2) {
        try {
          eb.a((String) null, param1, param2, 10);
          int var3_int = 57 / ((param0 - 23) / 43);
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "q.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.focusLost = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("q.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(ResourceArchive param0, int param1) {
        RuntimeException stackIn_489_0 = null;
        StringBuilder stackIn_489_1 = null;
        String stackIn_490_2 = null;
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
        try {
          o.field_l = param0;
          var2 = NodeHashTableIterator.a("members_benefits_captions,0", 125);
          if (null != var2) {
            ej.field_e[0] = mj.a((byte) 26, var2);
          }
          var2Lifetime1 = NodeHashTableIterator.a("members_benefits_captions,1", 126);
          if (null != var2Lifetime1) {
            ej.field_e[1] = mj.a((byte) 86, var2Lifetime1);
          }
          var2Lifetime2 = NodeHashTableIterator.a("members_benefits_captions,2", 122);
          if (null != var2Lifetime2) {
            ej.field_e[2] = mj.a((byte) 38, var2Lifetime2);
          }
          var2Lifetime3 = NodeHashTableIterator.a("members_benefits_captions,3", 125);
          if (null != var2Lifetime3) {
            ej.field_e[3] = mj.a((byte) -102, var2Lifetime3);
          }
          var2Lifetime4 = NodeHashTableIterator.a("members_benefits_captions,4", 126);
          if (null != var2Lifetime4) {
            ej.field_e[4] = mj.a((byte) -19, var2Lifetime4);
          }
          var2Lifetime5 = NodeHashTableIterator.a("members_benefits_captions,5", 124);
          if (null != var2Lifetime5) {
            ej.field_e[5] = mj.a((byte) 5, var2Lifetime5);
          }
          var2Lifetime6 = NodeHashTableIterator.a("members_benefits_captions,6", 122);
          if (null != var2Lifetime6) {
            ej.field_e[6] = mj.a((byte) -108, var2Lifetime6);
          }
          var2Lifetime7 = NodeHashTableIterator.a("members_benefits_captions,7", 122);
          if (var2Lifetime7 != null) {
            ej.field_e[7] = mj.a((byte) 101, var2Lifetime7);
          }
          var2Lifetime8 = NodeHashTableIterator.a("WORLD_TEXT,0", 125);
          if (var2Lifetime8 != null) {
            fj.field_i[0] = mj.a((byte) -128, var2Lifetime8);
          }
          var2Lifetime9 = NodeHashTableIterator.a("WORLD_TEXT,1", 126);
          if (null != var2Lifetime9) {
            fj.field_i[1] = mj.a((byte) -117, var2Lifetime9);
          }
          var2Lifetime10 = NodeHashTableIterator.a("WORLD_TEXT,2", 124);
          if (null != var2Lifetime10) {
            fj.field_i[2] = mj.a((byte) 112, var2Lifetime10);
          }
          var2Lifetime11 = NodeHashTableIterator.a("WORLD_TEXT,3", param1 ^ 129);
          if (null != var2Lifetime11) {
            fj.field_i[3] = mj.a((byte) -2, var2Lifetime11);
          }
          var2Lifetime12 = NodeHashTableIterator.a("WORLD_TEXT,4", 122);
          if (null != var2Lifetime12) {
            fj.field_i[4] = mj.a((byte) -6, var2Lifetime12);
          }
          var2Lifetime13 = NodeHashTableIterator.a("WORLD_TEXT,5", 124);
          if (null != var2Lifetime13) {
            fj.field_i[5] = mj.a((byte) -102, var2Lifetime13);
          }
          var2Lifetime14 = NodeHashTableIterator.a("WORLD_TEXT,6", param1 ^ 132);
          if (null != var2Lifetime14) {
            fj.field_i[6] = mj.a((byte) -103, var2Lifetime14);
          }
          var2Lifetime15 = NodeHashTableIterator.a("WORLD_TEXT,7", 125);
          if (var2Lifetime15 != null) {
            fj.field_i[7] = mj.a((byte) 85, var2Lifetime15);
          }
          var2Lifetime16 = NodeHashTableIterator.a("WORLD_TEXT,8", 122);
          if (var2Lifetime16 != null) {
            fj.field_i[8] = mj.a((byte) -107, var2Lifetime16);
          }
          var2Lifetime17 = NodeHashTableIterator.a("LEVEL_SELECT_NAMES,0", param1 - 128);
          if (null != var2Lifetime17) {
            IterableNodeHashTable.field_b[0] = mj.a((byte) 106, var2Lifetime17);
          }
          var2Lifetime18 = NodeHashTableIterator.a("LEVEL_SELECT_NAMES,1", param1 ^ 132);
          if (null != var2Lifetime18) {
            IterableNodeHashTable.field_b[1] = mj.a((byte) 109, var2Lifetime18);
          }
          var2Lifetime19 = NodeHashTableIterator.a("LEVEL_SELECT_NAMES,2", 126);
          if (null != var2Lifetime19) {
            IterableNodeHashTable.field_b[2] = mj.a((byte) 38, var2Lifetime19);
          }
          var2Lifetime20 = NodeHashTableIterator.a("LEVEL_SELECT_NAMES,3", 127);
          if (null != var2Lifetime20) {
            IterableNodeHashTable.field_b[3] = mj.a((byte) 127, var2Lifetime20);
          }
          var2Lifetime21 = NodeHashTableIterator.a("LEVEL_SELECT_NAMES,4", 124);
          if (null != var2Lifetime21) {
            IterableNodeHashTable.field_b[4] = mj.a((byte) -109, var2Lifetime21);
          }
          var2Lifetime22 = NodeHashTableIterator.a("LEVEL_SELECT_NAMES,5", 122);
          if (var2Lifetime22 != null) {
            IterableNodeHashTable.field_b[5] = mj.a((byte) -108, var2Lifetime22);
          }
          var2Lifetime23 = NodeHashTableIterator.a("LEVEL_SELECT_NAMES,6", 125);
          if (null != var2Lifetime23) {
            IterableNodeHashTable.field_b[6] = mj.a((byte) -96, var2Lifetime23);
          }
          var2Lifetime24 = NodeHashTableIterator.a("LEVEL_SELECT_NAMES,7", 126);
          if (var2Lifetime24 != null) {
            IterableNodeHashTable.field_b[7] = mj.a((byte) 115, var2Lifetime24);
          }
          var2Lifetime25 = NodeHashTableIterator.a("LEVEL_SELECT_NAMES,8", 124);
          if (null != var2Lifetime25) {
            IterableNodeHashTable.field_b[8] = mj.a((byte) 16, var2Lifetime25);
          }
          var2Lifetime26 = NodeHashTableIterator.a("LEVEL_SELECT_DESC,0", param1 ^ 128);
          if (var2Lifetime26 != null) {
            le.field_a[0] = mj.a((byte) -116, var2Lifetime26);
          }
          var2Lifetime27 = NodeHashTableIterator.a("LEVEL_SELECT_DESC,1", 124);
          if (null != var2Lifetime27) {
            le.field_a[1] = mj.a((byte) -123, var2Lifetime27);
          }
          var2Lifetime28 = NodeHashTableIterator.a("LEVEL_SELECT_DESC,2", param1 - 130);
          if (null != var2Lifetime28) {
            le.field_a[2] = mj.a((byte) 110, var2Lifetime28);
          }
          var2Lifetime29 = NodeHashTableIterator.a("LEVEL_SELECT_DESC,3", 122);
          if (null != var2Lifetime29) {
            le.field_a[3] = mj.a((byte) -109, var2Lifetime29);
          }
          var2Lifetime30 = NodeHashTableIterator.a("LEVEL_SELECT_DESC,4", 125);
          if (var2Lifetime30 != null) {
            le.field_a[4] = mj.a((byte) -108, var2Lifetime30);
          }
          var2Lifetime31 = NodeHashTableIterator.a("LEVEL_SELECT_DESC,5", param1 - 133);
          if (null != var2Lifetime31) {
            le.field_a[5] = mj.a((byte) 108, var2Lifetime31);
          }
          var2Lifetime32 = NodeHashTableIterator.a("LEVEL_SELECT_DESC,6", param1 ^ 128);
          if (null != var2Lifetime32) {
            le.field_a[6] = mj.a((byte) -3, var2Lifetime32);
          }
          var2Lifetime33 = NodeHashTableIterator.a("LEVEL_SELECT_DESC,7", 127);
          if (null != var2Lifetime33) {
            le.field_a[7] = mj.a((byte) -106, var2Lifetime33);
          }
          var2Lifetime34 = NodeHashTableIterator.a("LEVEL_SELECT_DESC,8", param1 - 129);
          if (var2Lifetime34 != null) {
            le.field_a[8] = mj.a((byte) -96, var2Lifetime34);
          }
          var2Lifetime35 = NodeHashTableIterator.a("HELP_TEXT,0", 122);
          if (null != var2Lifetime35) {
            di.field_e[0] = mj.a((byte) -112, var2Lifetime35);
          }
          var2Lifetime36 = NodeHashTableIterator.a("HELP_TEXT,1", 124);
          if (var2Lifetime36 != null) {
            di.field_e[1] = mj.a((byte) -125, var2Lifetime36);
          }
          var2Lifetime37 = NodeHashTableIterator.a("SHORT_TUTORIAL_TEXT,0", 126);
          if (var2Lifetime37 != null) {
            ol.field_i[0] = mj.a((byte) -126, var2Lifetime37);
          }
          var2Lifetime38 = NodeHashTableIterator.a("SHORT_TUTORIAL_TEXT,1", param1 ^ 128);
          if (null != var2Lifetime38) {
            ol.field_i[1] = mj.a((byte) -98, var2Lifetime38);
          }
          var2Lifetime39 = NodeHashTableIterator.a("SHORT_TUTORIAL_TEXT,2", 127);
          if (null != var2Lifetime39) {
            ol.field_i[2] = mj.a((byte) -114, var2Lifetime39);
          }
          var2Lifetime40 = NodeHashTableIterator.a("SHORT_TUTORIAL_TEXT,3", 125);
          if (var2Lifetime40 != null) {
            ol.field_i[3] = mj.a((byte) -127, var2Lifetime40);
          }
          var2Lifetime41 = NodeHashTableIterator.a("SHORT_TUTORIAL_TEXT,4", 123);
          if (var2Lifetime41 != null) {
            ol.field_i[4] = mj.a((byte) 75, var2Lifetime41);
          }
          var2Lifetime42 = NodeHashTableIterator.a("SHORT_TUTORIAL_TEXT,5", param1 - 132);
          if (null != var2Lifetime42) {
            ol.field_i[5] = mj.a((byte) -112, var2Lifetime42);
          }
          var2Lifetime43 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,0,0", 123);
          if (var2Lifetime43 != null) {
            GzipDecompressor.field_a[0][0] = mj.a((byte) 15, var2Lifetime43);
          }
          var2Lifetime44 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,0,1", 122);
          if (var2Lifetime44 != null) {
            GzipDecompressor.field_a[0][1] = mj.a((byte) -119, var2Lifetime44);
          }
          var2Lifetime45 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,0,2", 124);
          if (null != var2Lifetime45) {
            GzipDecompressor.field_a[0][2] = mj.a((byte) -109, var2Lifetime45);
          }
          var2Lifetime46 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,0,3", 123);
          if (null != var2Lifetime46) {
            GzipDecompressor.field_a[0][3] = mj.a((byte) -4, var2Lifetime46);
          }
          var2Lifetime47 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,0,4", param1 - 129);
          if (var2Lifetime47 != null) {
            GzipDecompressor.field_a[0][4] = mj.a((byte) 74, var2Lifetime47);
          }
          var2Lifetime48 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,0,5", param1 ^ 130);
          if (null != var2Lifetime48) {
            GzipDecompressor.field_a[0][5] = mj.a((byte) 2, var2Lifetime48);
          }
          var2Lifetime49 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,0,6", 126);
          if (var2Lifetime49 != null) {
            GzipDecompressor.field_a[0][6] = mj.a((byte) -105, var2Lifetime49);
          }
          var2Lifetime50 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,0,7", 126);
          if (null != var2Lifetime50) {
            GzipDecompressor.field_a[0][7] = mj.a((byte) -122, var2Lifetime50);
          }
          var2Lifetime51 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,1,0", 127);
          if (null != var2Lifetime51) {
            GzipDecompressor.field_a[1][0] = mj.a((byte) -100, var2Lifetime51);
          }
          var2Lifetime52 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,2,0", 122);
          if (var2Lifetime52 != null) {
            GzipDecompressor.field_a[2][0] = mj.a((byte) -105, var2Lifetime52);
          }
          var2Lifetime53 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,3,0", 123);
          if (var2Lifetime53 != null) {
            GzipDecompressor.field_a[3][0] = mj.a((byte) -105, var2Lifetime53);
          }
          var2Lifetime54 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,3,1", 123);
          if (null != var2Lifetime54) {
            GzipDecompressor.field_a[3][1] = mj.a((byte) 26, var2Lifetime54);
          }
          var2Lifetime55 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,3,2", 122);
          if (var2Lifetime55 != null) {
            GzipDecompressor.field_a[3][2] = mj.a((byte) 76, var2Lifetime55);
          }
          var2Lifetime56 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,4,0", 124);
          if (var2Lifetime56 != null) {
            GzipDecompressor.field_a[4][0] = mj.a((byte) -119, var2Lifetime56);
          }
          var2Lifetime57 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,5,0", 125);
          if (var2Lifetime57 != null) {
            GzipDecompressor.field_a[5][0] = mj.a((byte) -126, var2Lifetime57);
          }
          var2Lifetime58 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,6,0", 125);
          if (null != var2Lifetime58) {
            GzipDecompressor.field_a[6][0] = mj.a((byte) 94, var2Lifetime58);
          }
          var2Lifetime59 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,6,1", param1 - 132);
          if (null != var2Lifetime59) {
            GzipDecompressor.field_a[6][1] = mj.a((byte) 121, var2Lifetime59);
          }
          var2Lifetime60 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,6,2", 127);
          if (var2Lifetime60 != null) {
            GzipDecompressor.field_a[6][2] = mj.a((byte) 20, var2Lifetime60);
          }
          var2Lifetime61 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,7,0", 126);
          if (null != var2Lifetime61) {
            GzipDecompressor.field_a[7][0] = mj.a((byte) -95, var2Lifetime61);
          }
          var2Lifetime62 = NodeHashTableIterator.a("INTRO_SEQUENCE_TEXT,8,0", param1 - 132);
          if (null != var2Lifetime62) {
            GzipDecompressor.field_a[8][0] = mj.a((byte) -20, var2Lifetime62);
          }
          var2Lifetime63 = NodeHashTableIterator.a("LEVEL_COMPLETE_TEXT", param1 - 131);
          if (null != var2Lifetime63) {
            vh.field_d = mj.a((byte) -106, var2Lifetime63);
          }
          var2Lifetime64 = NodeHashTableIterator.a("LEVEL_COMPLETE_SCORE_TOTAL", 124);
          if (var2Lifetime64 != null) {
            sa.field_g = mj.a((byte) -100, var2Lifetime64);
          }
          var2Lifetime65 = NodeHashTableIterator.a("HUMAN_SURVIVAL_BONUS_SCORE", 127);
          if (null != var2Lifetime65) {
            kh.field_o = mj.a((byte) 85, var2Lifetime65);
          }
          var2Lifetime66 = NodeHashTableIterator.a("HUMAN_SURVIVAL_BONUS_X_OF_Y", 124);
          if (null != var2Lifetime66) {
            af.field_c = mj.a((byte) -97, var2Lifetime66);
          }
          var2Lifetime67 = NodeHashTableIterator.a("HUMAN_SURVIVAL_BONUS_BUILDINGS", param1 - 129);
          if (var2Lifetime67 != null) {
            l.field_h = mj.a((byte) -22, var2Lifetime67);
          }
          var2Lifetime68 = NodeHashTableIterator.a("LEVEL_COMPLETE_PRESS_ANY_KEY_TO_CONTINUE", param1 - 131);
          if (null != var2Lifetime68) {
            bj.field_b = mj.a((byte) 12, var2Lifetime68);
          }
          var2Lifetime69 = NodeHashTableIterator.a("NEWGAME", 123);
          if (param1 != 255) {
            FullscreenFocusCanvas.a((byte) -3, false, false);
          }
          if (null != var2Lifetime69) {
            gf.field_s = mj.a((byte) 123, var2Lifetime69);
          }
          var2Lifetime70 = NodeHashTableIterator.a("FULLSCREEN", 122);
          if (var2Lifetime70 != null) {
            ij.field_c = mj.a((byte) -107, var2Lifetime70);
          }
          var2Lifetime71 = NodeHashTableIterator.a("SOUND", param1 ^ 132);
          if (var2Lifetime71 != null) {
            sh.field_d = mj.a((byte) -105, var2Lifetime71);
          }
          var2Lifetime72 = NodeHashTableIterator.a("MUSIC", param1 ^ 131);
          if (var2Lifetime72 != null) {
            hj.field_a = mj.a((byte) -6, var2Lifetime72);
          }
          var2Lifetime73 = NodeHashTableIterator.a("CONTINUE", 123);
          if (var2Lifetime73 != null) {
            ja.field_f = mj.a((byte) 43, var2Lifetime73);
          }
          var2Lifetime74 = NodeHashTableIterator.a("DIFFICULTY", param1 ^ 133);
          if (null != var2Lifetime74) {
            vi.field_d = mj.a((byte) 66, var2Lifetime74);
          }
          var2Lifetime75 = NodeHashTableIterator.a("BLANK", 124);
          if (null != var2Lifetime75) {
            rk.field_f = mj.a((byte) -21, var2Lifetime75);
          }
          var2Lifetime76 = NodeHashTableIterator.a("FASTEST", 123);
          if (null != var2Lifetime76) {
            we.field_h = mj.a((byte) -107, var2Lifetime76);
          }
          var2Lifetime77 = NodeHashTableIterator.a("MEDIUM", 126);
          if (var2Lifetime77 != null) {
            SectorCacheStore.field_h = mj.a((byte) -94, var2Lifetime77);
          }
          var2Lifetime78 = NodeHashTableIterator.a("BEST", 125);
          if (null != var2Lifetime78) {
            v.field_U = mj.a((byte) 26, var2Lifetime78);
          }
          var2Lifetime79 = NodeHashTableIterator.a("DIFF_EASY", 127);
          if (null != var2Lifetime79) {
            mj.field_t = mj.a((byte) 20, var2Lifetime79);
          }
          var2Lifetime80 = NodeHashTableIterator.a("DIFF_MEDIUM", 125);
          if (null != var2Lifetime80) {
            DiskCacheWorker.field_f = mj.a((byte) 26, var2Lifetime80);
          }
          var2Lifetime81 = NodeHashTableIterator.a("DIFF_HARD", param1 ^ 131);
          if (null != var2Lifetime81) {
            hb.field_m = mj.a((byte) -112, var2Lifetime81);
          }
          var2Lifetime82 = NodeHashTableIterator.a("achievement_names,0", 123);
          if (null != var2Lifetime82) {
            sc.field_b[0] = mj.a((byte) 109, var2Lifetime82);
          }
          var2Lifetime83 = NodeHashTableIterator.a("achievement_names,1", 122);
          if (var2Lifetime83 != null) {
            sc.field_b[1] = mj.a((byte) -111, var2Lifetime83);
          }
          var2Lifetime84 = NodeHashTableIterator.a("achievement_names,2", 123);
          if (var2Lifetime84 != null) {
            sc.field_b[2] = mj.a((byte) -123, var2Lifetime84);
          }
          var2Lifetime85 = NodeHashTableIterator.a("achievement_names,3", 122);
          if (var2Lifetime85 != null) {
            sc.field_b[3] = mj.a((byte) 32, var2Lifetime85);
          }
          var2Lifetime86 = NodeHashTableIterator.a("achievement_names,4", 127);
          if (var2Lifetime86 != null) {
            sc.field_b[4] = mj.a((byte) -98, var2Lifetime86);
          }
          var2Lifetime87 = NodeHashTableIterator.a("achievement_names,5", param1 - 129);
          if (null != var2Lifetime87) {
            sc.field_b[5] = mj.a((byte) -123, var2Lifetime87);
          }
          var2Lifetime88 = NodeHashTableIterator.a("achievement_names,6", 124);
          if (null != var2Lifetime88) {
            sc.field_b[6] = mj.a((byte) -109, var2Lifetime88);
          }
          var2Lifetime89 = NodeHashTableIterator.a("achievement_names,7", 124);
          if (null != var2Lifetime89) {
            sc.field_b[7] = mj.a((byte) -108, var2Lifetime89);
          }
          var2Lifetime90 = NodeHashTableIterator.a("achievement_names,8", 125);
          if (null != var2Lifetime90) {
            sc.field_b[8] = mj.a((byte) -120, var2Lifetime90);
          }
          var2Lifetime91 = NodeHashTableIterator.a("achievement_names,9", param1 - 128);
          if (null != var2Lifetime91) {
            sc.field_b[9] = mj.a((byte) -1, var2Lifetime91);
          }
          var2Lifetime92 = NodeHashTableIterator.a("achievement_names,10", 124);
          if (var2Lifetime92 != null) {
            sc.field_b[10] = mj.a((byte) -97, var2Lifetime92);
          }
          var2Lifetime93 = NodeHashTableIterator.a("achievement_names,11", 126);
          if (var2Lifetime93 != null) {
            sc.field_b[11] = mj.a((byte) -119, var2Lifetime93);
          }
          var2Lifetime94 = NodeHashTableIterator.a("achievement_names,12", param1 ^ 128);
          if (var2Lifetime94 != null) {
            sc.field_b[12] = mj.a((byte) -123, var2Lifetime94);
          }
          var2Lifetime95 = NodeHashTableIterator.a("achievement_names,13", 126);
          if (null != var2Lifetime95) {
            sc.field_b[13] = mj.a((byte) 113, var2Lifetime95);
          }
          var2Lifetime96 = NodeHashTableIterator.a("achievement_names,14", 126);
          if (var2Lifetime96 != null) {
            sc.field_b[14] = mj.a((byte) -114, var2Lifetime96);
          }
          var2Lifetime97 = NodeHashTableIterator.a("achievement_criteria,0", param1 - 131);
          if (var2Lifetime97 != null) {
            jk.field_K[0] = mj.a((byte) -124, var2Lifetime97);
          }
          var2Lifetime98 = NodeHashTableIterator.a("achievement_criteria,1", 123);
          if (null != var2Lifetime98) {
            jk.field_K[1] = mj.a((byte) -110, var2Lifetime98);
          }
          var2Lifetime99 = NodeHashTableIterator.a("achievement_criteria,2", 123);
          if (null != var2Lifetime99) {
            jk.field_K[2] = mj.a((byte) -116, var2Lifetime99);
          }
          var2Lifetime100 = NodeHashTableIterator.a("achievement_criteria,3", 126);
          if (var2Lifetime100 != null) {
            jk.field_K[3] = mj.a((byte) -95, var2Lifetime100);
          }
          var2Lifetime101 = NodeHashTableIterator.a("achievement_criteria,4", 124);
          if (null != var2Lifetime101) {
            jk.field_K[4] = mj.a((byte) -113, var2Lifetime101);
          }
          var2Lifetime102 = NodeHashTableIterator.a("achievement_criteria,5", 127);
          if (null != var2Lifetime102) {
            jk.field_K[5] = mj.a((byte) -116, var2Lifetime102);
          }
          var2Lifetime103 = NodeHashTableIterator.a("achievement_criteria,6", 123);
          if (null != var2Lifetime103) {
            jk.field_K[6] = mj.a((byte) 115, var2Lifetime103);
          }
          var2Lifetime104 = NodeHashTableIterator.a("achievement_criteria,7", 126);
          if (null != var2Lifetime104) {
            jk.field_K[7] = mj.a((byte) -9, var2Lifetime104);
          }
          var2Lifetime105 = NodeHashTableIterator.a("achievement_criteria,8", param1 ^ 131);
          if (var2Lifetime105 != null) {
            jk.field_K[8] = mj.a((byte) -109, var2Lifetime105);
          }
          var2Lifetime106 = NodeHashTableIterator.a("achievement_criteria,9", param1 ^ 130);
          if (var2Lifetime106 != null) {
            jk.field_K[9] = mj.a((byte) -3, var2Lifetime106);
          }
          var2Lifetime107 = NodeHashTableIterator.a("achievement_criteria,10", 124);
          if (null != var2Lifetime107) {
            jk.field_K[10] = mj.a((byte) -118, var2Lifetime107);
          }
          var2Lifetime108 = NodeHashTableIterator.a("achievement_criteria,11", 125);
          if (var2Lifetime108 != null) {
            jk.field_K[11] = mj.a((byte) 32, var2Lifetime108);
          }
          var2Lifetime109 = NodeHashTableIterator.a("achievement_criteria,12", param1 - 129);
          if (null != var2Lifetime109) {
            jk.field_K[12] = mj.a((byte) -8, var2Lifetime109);
          }
          var2Lifetime110 = NodeHashTableIterator.a("achievement_criteria,13", 124);
          if (var2Lifetime110 != null) {
            jk.field_K[13] = mj.a((byte) 69, var2Lifetime110);
          }
          var2Lifetime111 = NodeHashTableIterator.a("achievement_criteria,14", 124);
          if (var2Lifetime111 != null) {
            jk.field_K[14] = mj.a((byte) -107, var2Lifetime111);
          }
          var2Lifetime112 = NodeHashTableIterator.a("GAME_NAME_JSTRING", 125);
          if (null != var2Lifetime112) {
            ml.field_j = mj.a((byte) -105, var2Lifetime112);
          }
          var2Lifetime113 = NodeHashTableIterator.a("WEAPON_UNAVAILABLE_INDICATOR_TEXT", 123);
          if (var2Lifetime113 != null) {
            AwtRasterBuffer.field_b = mj.a((byte) 13, var2Lifetime113);
          }
          var2Lifetime114 = NodeHashTableIterator.a("GET_READY", 123);
          if (null != var2Lifetime114) {
            a.field_f = mj.a((byte) -109, var2Lifetime114);
          }
          var2Lifetime115 = NodeHashTableIterator.a("LEVEL", 127);
          if (var2Lifetime115 != null) {
            uf.field_d = mj.a((byte) 9, var2Lifetime115);
          }
          var2Lifetime116 = NodeHashTableIterator.a("WORLD_STAGE", 127);
          if (null != var2Lifetime116) {
            ek.field_q = mj.a((byte) -111, var2Lifetime116);
          }
          var2Lifetime117 = NodeHashTableIterator.a("INSTRUCTIONS_FIRE", param1 - 130);
          if (null != var2Lifetime117) {
            hd.field_O = mj.a((byte) 80, var2Lifetime117);
          }
          var2Lifetime118 = NodeHashTableIterator.a("INSTRUCTIONS_SELECT_WEAPON", 126);
          if (null != var2Lifetime118) {
            ch.field_w = mj.a((byte) -106, var2Lifetime118);
          }
          var2Lifetime119 = NodeHashTableIterator.a("INSTRUCTIONS_CYCLE_WEAPON", 127);
          if (var2Lifetime119 != null) {
            mk.field_a = mj.a((byte) 115, var2Lifetime119);
          }
          var2Lifetime120 = NodeHashTableIterator.a("INSTRUCTIONS_CHARGE_CANNON", param1 ^ 131);
          if (null != var2Lifetime120) {
            hj.field_c = mj.a((byte) 63, var2Lifetime120);
          }
          var2Lifetime121 = NodeHashTableIterator.a("INSTRUCTIONS_MOVE_SHIP", 125);
          if (var2Lifetime121 != null) {
            fm.field_c = mj.a((byte) 87, var2Lifetime121);
          }
          var2Lifetime122 = NodeHashTableIterator.a("LEVEL_NAME_UNKNOWN", 124);
          if (null != var2Lifetime122) {
            s.field_f = mj.a((byte) -112, var2Lifetime122);
          }
          var2Lifetime123 = NodeHashTableIterator.a("LEVEL_NAME_MEMBERS_ONLY", 123);
          if (null != var2Lifetime123) {
            s.field_h = mj.a((byte) 77, var2Lifetime123);
          }
          var2Lifetime124 = NodeHashTableIterator.a("LEVEL_NAME_NOT_REACHED", param1 - 133);
          if (null != var2Lifetime124) {
            pe.field_i = mj.a((byte) -121, var2Lifetime124);
          }
          var2Lifetime125 = NodeHashTableIterator.a("LEVEL_CLICK_TO_START", 125);
          if (var2Lifetime125 != null) {
            af.field_a = mj.a((byte) -14, var2Lifetime125);
          }
          var2Lifetime126 = NodeHashTableIterator.a("LEVEL_SELECT_WORLD", 122);
          if (var2Lifetime126 != null) {
            mj.a((byte) -19, var2Lifetime126);
          }
          var2Lifetime127 = NodeHashTableIterator.a("LEVEL_SELECT_STAGE", 126);
          if (null != var2Lifetime127) {
            mj.a((byte) -121, var2Lifetime127);
          }
          var2Lifetime128 = NodeHashTableIterator.a("LEVEL_MOUSEOVER_TO_SELECT", 122);
          if (var2Lifetime128 != null) {
            MouseInput.field_f = mj.a((byte) -13, var2Lifetime128);
          }
          var2Lifetime129 = NodeHashTableIterator.a("LOGIN_OR_CREATE_FREE_ACCOUNT", 122);
          if (var2Lifetime129 != null) {
            ph.field_i = mj.a((byte) -96, var2Lifetime129);
          }
          var2Lifetime130 = NodeHashTableIterator.a("INVITE_LOGIN_ALT_CLICK", 126);
          if (var2Lifetime130 != null) {
            gd.field_e = mj.a((byte) -115, var2Lifetime130);
          }
          var2Lifetime131 = NodeHashTableIterator.a("keycode_gun", param1 ^ 130);
          if (null != var2Lifetime131) {
            em.field_e = 255 & var2Lifetime131[0];
          }
          var2Lifetime132 = NodeHashTableIterator.a("keycode_bomb", 125);
          if (var2Lifetime132 != null) {
            ArchiveRequest.field_A = 255 & var2Lifetime132[0];
          }
          var2Lifetime133 = NodeHashTableIterator.a("keycode_coil", 122);
          if (var2Lifetime133 != null) {
            IntrusiveDeque.field_f = 255 & var2Lifetime133[0];
          }
          var2Lifetime134 = NodeHashTableIterator.a("keycode_missile", 122);
          if (var2Lifetime134 != null) {
            lf.field_c = var2Lifetime134[0] & 255;
          }
          var2Lifetime135 = NodeHashTableIterator.a("keycode_alternate_megacannon", 122);
          if (null != var2Lifetime135) {
            nj.field_a = 255 & var2Lifetime135[0];
          }
          o.field_l = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_489_0 = var2_ref;
          stackIn_489_1 = new StringBuilder().append("q.C(");
          if (param0 == null) {
            stackIn_490_2 = "null";
          } else {
            stackIn_490_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_489_0), ((StringBuilder) (Object) stackIn_489_1).append(stackIn_490_2).append(',').append(param1).append(')').toString());
        }
    }

    final void exitFullscreen(PlatformTaskDispatcher param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return;
          }
          ce.exitFullscreenFrame(param0, this.fullscreenFrame, (byte) -104);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("q.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(int param0, int param1, int param2, int param3, PacketBuffer param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          param4.writeByte(12, (byte) -89);
          param4.writeShort(17, -17402);
          param4.writeShort(param0, -17402);
          param4.writeShort(param1, param2 - 44202);
          if (param2 != 26800) {
            field_e = (RgbSprite) null;
          }
          param4.writeByte(param3, (byte) -126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("q.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_f = null;
          field_b = (int[][]) null;
          field_e = null;
          if (param0 != 25270) {
            field_f = (he) null;
          }
          field_g = null;
          field_d = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.wrapClientException((Throwable) ((Object) var1), "q.B(" + param0 + ')');
        }
    }

    FullscreenFocusCanvas() {
    }

    static {
        field_d = "Instructions";
        field_g = "That name is not available";
    }
}
