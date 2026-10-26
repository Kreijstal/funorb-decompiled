/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wu {
    short field_r;
    int[] field_o;
    int[] field_Q;
    private boolean field_O;
    short[] field_B;
    byte field_f;
    short[] field_I;
    int[] field_a;
    short[] field_t;
    short[] field_L;
    short[] field_d;
    short[] field_v;
    int[] field_M;
    short[] field_u;
    int field_h;
    short[] field_C;
    short[] field_P;
    int field_b;
    short[] field_z;
    int[] field_p;
    int field_A;
    int[] field_e;
    short[] field_y;
    int field_N;
    static IntrusiveDeque field_w;
    int field_J;
    short[] field_H;
    int[] field_j;
    short[] field_F;
    short field_q;
    short field_K;
    short[] field_g;
    int[] field_i;
    short[] field_n;
    int[] field_k;
    short[] field_m;
    short[] field_D;
    short[] field_G;
    static int[] field_c;
    int field_s;
    static en field_l;
    byte[] field_x;

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param4) {
            this.a(-126, 92, 16, -17);
          }
          var6_int = 0;
          while (var6_int < this.field_r) {
            this.field_z[var6_int] = (short)(this.field_z[var6_int] * param0 / param1);
            this.field_P[var6_int] = (short)(this.field_P[var6_int] * param2 / param1);
            this.field_F[var6_int] = (short)(this.field_F[var6_int] * param3 / param1);
            var6_int++;
            if (var7 != 0) {
              return;
            }
          }
          this.a(92);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var6), "wu.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0) {
        try {
          this.field_O = false;
          if (param0 < 34) {
            this.a(15, 71, -46, 71);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "wu.C(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 < 93) {
            field_w = (IntrusiveDeque) null;
          }
          var5_int = 0;
          while (var5_int < this.field_r) {
            this.field_z[var5_int] = (short)(this.field_z[var5_int] + param0);
            this.field_P[var5_int] = (short)(this.field_P[var5_int] + param2);
            this.field_F[var5_int] = (short)(this.field_F[var5_int] + param3);
            var5_int++;
            if (var6 != 0) {
              return;
            }
          }
          this.a(76);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var5), "wu.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(boolean param0) {
        try {
          field_l = null;
          field_w = null;
          field_c = null;
          if (!param0) {
            field_w = (IntrusiveDeque) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "wu.D(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, java.awt.Component param2, rk param3, int param4, jt param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wj.a(41, param3, param2, param0, param1, param5, param0, 1024);
          if (param4 != 32767) {
            wu.a(47, false, (java.awt.Component) null, (rk) null, 11, (jt) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("wu.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void b(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (this.field_O) {
            return;
          }
          this.field_O = true;
          var2_int = 32767;
          var3 = 32767;
          var4 = param0;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          while (var8 < this.field_r) {
            var9 = this.field_z[var8];
            var10 = this.field_P[var8];
            var11 = this.field_F[var8];
            if (var12 != 0) {
              return;
            }
            if (var2_int > var9) {
              var2_int = var9;
            }
            if (var9 > var5) {
              var5 = var9;
            }
            if (var6 < var10) {
              var6 = var10;
            }
            if (var10 < var3) {
              var3 = var10;
            }
            if (var11 < var4) {
              var4 = var11;
            }
            if (var11 > var7) {
              var7 = var11;
            }
            var8++;
          }
          this.field_N = var2_int;
          this.field_s = var4;
          this.field_h = var6;
          this.field_b = var5;
          this.field_J = var3;
          this.field_A = var7;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "wu.B(" + param0 + ')');
        }
    }

    final static void a(int param0, ResourceArchive param1) {
        RuntimeException stackIn_312_0 = null;
        StringBuilder stackIn_312_1 = null;
        String stackIn_313_2 = null;
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
        try {
          q.field_q = param1;
          var2 = im.a(83, "gamename");
          if (null != var2) {
            ea.a(0, var2);
          }
          var2Lifetime1 = im.a(63, "youwon");
          if (null != var2Lifetime1) {
            ea.a(0, var2Lifetime1);
          }
          var2Lifetime2 = im.a(76, "institle");
          if (var2Lifetime2 != null) {
            bt.field_b = ea.a(0, var2Lifetime2);
          }
          var2Lifetime3 = im.a(121, "pausetitle");
          if (var2Lifetime3 != null) {
            kg.field_c = ea.a(0, var2Lifetime3);
          }
          var2Lifetime4 = im.a(110, "settingstitle");
          if (var2Lifetime4 != null) {
            sd.field_m = ea.a(0, var2Lifetime4);
          }
          var2Lifetime5 = im.a(46, "scoretitle");
          if (var2Lifetime5 != null) {
            fd.field_c = ea.a(0, var2Lifetime5);
          }
          var2Lifetime6 = im.a(97, "wavetitle");
          if (var2Lifetime6 != null) {
            ao.field_a = ea.a(0, var2Lifetime6);
          }
          var2Lifetime7 = im.a(47, "nametitle");
          if (var2Lifetime7 != null) {
            SoundCache.field_f = ea.a(0, var2Lifetime7);
          }
          var2Lifetime8 = im.a(49, "bsths");
          if (var2Lifetime8 != null) {
            jo.field_l = ea.a(0, var2Lifetime8);
          }
          var2Lifetime9 = im.a(63, "myhs");
          if (var2Lifetime9 != null) {
            wl.field_zc = ea.a(0, var2Lifetime9);
          }
          var2Lifetime10 = im.a(37, "allhs");
          if (var2Lifetime10 != null) {
            mf.field_a = ea.a(0, var2Lifetime10);
          }
          var2Lifetime11 = im.a(91, "thisishidden");
          if (var2Lifetime11 != null) {
            pe.field_c = ea.a(0, var2Lifetime11);
          }
          var2Lifetime12 = im.a(57, "orbcoin");
          if (null != var2Lifetime12) {
            sd.field_e = ea.a(0, var2Lifetime12);
          }
          var2Lifetime13 = im.a(63, "unknownstuff");
          if (null != var2Lifetime13) {
            fh.field_g = ea.a(0, var2Lifetime13);
          }
          var2Lifetime14 = im.a(73, "orbpoints");
          if (var2Lifetime14 != null) {
            jk.field_c = ea.a(0, var2Lifetime14);
          }
          var2Lifetime15 = im.a(96, "achievethisgame");
          if (var2Lifetime15 != null) {
            pm.field_d = ea.a(0, var2Lifetime15);
          }
          var2Lifetime16 = im.a(37, "achieve");
          if (var2Lifetime16 != null) {
            ro.field_p = ea.a(0, var2Lifetime16);
          }
          var2Lifetime17 = im.a(85, "thousandseperator");
          if (var2Lifetime17 != null) {
            IntrusiveDeque.thousandsSeparator = ea.a(0, var2Lifetime17);
          }
          var2Lifetime18 = im.a(38, "classicmodeonly");
          if (null != var2Lifetime18) {
            ef.field_g = ea.a(0, var2Lifetime18);
          }
          var2Lifetime19 = im.a(104, "startgame");
          if (var2Lifetime19 != null) {
            HighscoreNameEntry.field_c = ea.a(0, var2Lifetime19);
          }
          var2Lifetime20 = im.a(102, "startarcadegame");
          if (var2Lifetime20 != null) {
            iu.field_f = ea.a(0, var2Lifetime20);
          }
          var2Lifetime21 = im.a(83, "arcadescores");
          if (null != var2Lifetime21) {
            wq.field_i = ea.a(0, var2Lifetime21);
          }
          var2Lifetime22 = im.a(94, "regularscores");
          if (var2Lifetime22 != null) {
            ki.field_c = ea.a(0, var2Lifetime22);
          }
          var2Lifetime23 = im.a(103, "settings");
          if (null != var2Lifetime23) {
            ii.field_l = ea.a(0, var2Lifetime23);
          }
          var2Lifetime24 = im.a(89, "wave_announce,0");
          if (var2Lifetime24 != null) {
            oe.classicWaveMessages[0] = ea.a(0, var2Lifetime24);
          }
          var2Lifetime25 = im.a(110, "wave_announce,1");
          if (var2Lifetime25 != null) {
            oe.classicWaveMessages[1] = ea.a(0, var2Lifetime25);
          }
          var2Lifetime26 = im.a(94, "wave_announce,2");
          if (null != var2Lifetime26) {
            oe.classicWaveMessages[2] = ea.a(0, var2Lifetime26);
          }
          var2Lifetime27 = im.a(75, "wave_announce,3");
          if (null != var2Lifetime27) {
            oe.classicWaveMessages[3] = ea.a(0, var2Lifetime27);
          }
          var2Lifetime28 = im.a(100, "wave_announce,4");
          if (var2Lifetime28 != null) {
            oe.classicWaveMessages[4] = ea.a(0, var2Lifetime28);
          }
          var2Lifetime29 = im.a(75, "wave_announce,5");
          if (null != var2Lifetime29) {
            oe.classicWaveMessages[5] = ea.a(0, var2Lifetime29);
          }
          var2Lifetime30 = im.a(87, "wave_announce,6");
          if (null != var2Lifetime30) {
            oe.classicWaveMessages[6] = ea.a(0, var2Lifetime30);
          }
          var2Lifetime31 = im.a(89, "wave_announce,7");
          if (null != var2Lifetime31) {
            oe.classicWaveMessages[7] = ea.a(0, var2Lifetime31);
          }
          var2Lifetime32 = im.a(118, "wave_announce,8");
          if (null != var2Lifetime32) {
            oe.classicWaveMessages[8] = ea.a(0, var2Lifetime32);
          }
          var2Lifetime33 = im.a(108, "wave_announce,9");
          if (var2Lifetime33 != null) {
            oe.classicWaveMessages[9] = ea.a(0, var2Lifetime33);
          }
          var2Lifetime34 = im.a(127, "wave_announce,10");
          if (var2Lifetime34 != null) {
            oe.classicWaveMessages[10] = ea.a(0, var2Lifetime34);
          }
          var2Lifetime35 = im.a(77, "wave_announce,11");
          if (var2Lifetime35 != null) {
            oe.classicWaveMessages[11] = ea.a(0, var2Lifetime35);
          }
          var2Lifetime36 = im.a(44, "wave_announce,12");
          if (null != var2Lifetime36) {
            oe.classicWaveMessages[12] = ea.a(0, var2Lifetime36);
          }
          var2Lifetime37 = im.a(101, "wave_announce,13");
          if (null != var2Lifetime37) {
            oe.classicWaveMessages[13] = ea.a(0, var2Lifetime37);
          }
          var2Lifetime38 = im.a(70, "wave_announce,14");
          if (var2Lifetime38 != null) {
            oe.classicWaveMessages[14] = ea.a(0, var2Lifetime38);
          }
          var2Lifetime39 = im.a(80, "wave_announce,15");
          if (var2Lifetime39 != null) {
            oe.classicWaveMessages[15] = ea.a(0, var2Lifetime39);
          }
          var2Lifetime40 = im.a(63, "wave_announce,16");
          if (var2Lifetime40 != null) {
            oe.classicWaveMessages[16] = ea.a(0, var2Lifetime40);
          }
          var2Lifetime41 = im.a(105, "wave_announce,17");
          if (var2Lifetime41 != null) {
            oe.classicWaveMessages[17] = ea.a(0, var2Lifetime41);
          }
          var2Lifetime42 = im.a(117, "wave_announce,18");
          if (null != var2Lifetime42) {
            oe.classicWaveMessages[18] = ea.a(0, var2Lifetime42);
          }
          var2Lifetime43 = im.a(59, "wave_announce,19");
          if (var2Lifetime43 != null) {
            oe.classicWaveMessages[19] = ea.a(0, var2Lifetime43);
          }
          var2Lifetime44 = im.a(44, "wave_announce,20");
          if (null != var2Lifetime44) {
            oe.classicWaveMessages[20] = ea.a(0, var2Lifetime44);
          }
          var2Lifetime45 = im.a(112, "powerup_messages,0");
          if (var2Lifetime45 != null) {
            ke.field_c[0] = ea.a(0, var2Lifetime45);
          }
          var2Lifetime46 = im.a(66, "powerup_messages,1");
          if (null != var2Lifetime46) {
            ke.field_c[1] = ea.a(0, var2Lifetime46);
          }
          var2Lifetime47 = im.a(73, "powerup_messages,2");
          if (null != var2Lifetime47) {
            ke.field_c[2] = ea.a(0, var2Lifetime47);
          }
          var2Lifetime48 = im.a(127, "powerup_messages,3");
          if (null != var2Lifetime48) {
            ke.field_c[3] = ea.a(0, var2Lifetime48);
          }
          var2Lifetime49 = im.a(67, "achievement_names,0");
          if (null != var2Lifetime49) {
            lb.field_a[0] = ea.a(0, var2Lifetime49);
          }
          var2Lifetime50 = im.a(98, "achievement_names,1");
          if (null != var2Lifetime50) {
            lb.field_a[1] = ea.a(0, var2Lifetime50);
          }
          var2Lifetime51 = im.a(103, "achievement_names,2");
          if (null != var2Lifetime51) {
            lb.field_a[2] = ea.a(0, var2Lifetime51);
          }
          var2Lifetime52 = im.a(42, "achievement_names,3");
          if (var2Lifetime52 != null) {
            lb.field_a[3] = ea.a(0, var2Lifetime52);
          }
          var2Lifetime53 = im.a(121, "achievement_names,4");
          if (var2Lifetime53 != null) {
            lb.field_a[4] = ea.a(0, var2Lifetime53);
          }
          var2Lifetime54 = im.a(113, "achievement_names,5");
          if (var2Lifetime54 != null) {
            lb.field_a[5] = ea.a(0, var2Lifetime54);
          }
          var2Lifetime55 = im.a(84, "achievement_names,6");
          if (null != var2Lifetime55) {
            lb.field_a[6] = ea.a(0, var2Lifetime55);
          }
          var2Lifetime56 = im.a(75, "achievement_names,7");
          if (null != var2Lifetime56) {
            lb.field_a[7] = ea.a(0, var2Lifetime56);
          }
          var2Lifetime57 = im.a(99, "achievement_names,8");
          if (null != var2Lifetime57) {
            lb.field_a[8] = ea.a(0, var2Lifetime57);
          }
          var2Lifetime58 = im.a(106, "achievement_criteria,0");
          if (null != var2Lifetime58) {
            hn.field_b[0] = ea.a(0, var2Lifetime58);
          }
          var2Lifetime59 = im.a(117, "achievement_criteria,1");
          if (null != var2Lifetime59) {
            hn.field_b[1] = ea.a(0, var2Lifetime59);
          }
          var2Lifetime60 = im.a(78, "achievement_criteria,2");
          if (var2Lifetime60 != null) {
            hn.field_b[2] = ea.a(0, var2Lifetime60);
          }
          var2Lifetime61 = im.a(35, "achievement_criteria,3");
          if (null != var2Lifetime61) {
            hn.field_b[3] = ea.a(0, var2Lifetime61);
          }
          var2Lifetime62 = im.a(65, "achievement_criteria,4");
          if (null != var2Lifetime62) {
            hn.field_b[4] = ea.a(0, var2Lifetime62);
          }
          var2Lifetime63 = im.a(99, "achievement_criteria,5");
          if (null != var2Lifetime63) {
            hn.field_b[5] = ea.a(0, var2Lifetime63);
          }
          var2Lifetime64 = im.a(82, "achievement_criteria,6");
          if (var2Lifetime64 != null) {
            hn.field_b[6] = ea.a(0, var2Lifetime64);
          }
          var2Lifetime65 = im.a(123, "achievement_criteria,7");
          if (var2Lifetime65 != null) {
            hn.field_b[7] = ea.a(0, var2Lifetime65);
          }
          var2Lifetime66 = im.a(48, "achievement_criteria,8");
          if (var2Lifetime66 != null) {
            hn.field_b[8] = ea.a(0, var2Lifetime66);
          }
          var2Lifetime67 = im.a(68, "score_colon_space");
          if (null != var2Lifetime67) {
            ea.a(0, var2Lifetime67);
          }
          var2Lifetime68 = im.a(79, "instructions_pages,0");
          if (var2Lifetime68 != null) {
            io.field_a[0] = ea.a(0, var2Lifetime68);
          }
          var2Lifetime69 = im.a(102, "instructions_pages,1");
          if (var2Lifetime69 != null) {
            io.field_a[1] = ea.a(0, var2Lifetime69);
          }
          var2Lifetime70 = im.a(54, "instructions_pages,2");
          if (null != var2Lifetime70) {
            io.field_a[2] = ea.a(0, var2Lifetime70);
          }
          var2Lifetime71 = im.a(105, "instructions_pages,3");
          if (null != var2Lifetime71) {
            io.field_a[3] = ea.a(0, var2Lifetime71);
          }
          var2Lifetime72 = im.a(95, "purchasables,0");
          if (var2Lifetime72 != null) {
            ii.field_e[0] = ea.a(0, var2Lifetime72);
          }
          var2Lifetime73 = im.a(55, "purchasables,1");
          if (var2Lifetime73 != null) {
            ii.field_e[1] = ea.a(0, var2Lifetime73);
          }
          var2Lifetime74 = im.a(109, "purchasables,2");
          if (var2Lifetime74 != null) {
            ii.field_e[2] = ea.a(0, var2Lifetime74);
          }
          var2Lifetime75 = im.a(35, "purchasables,3");
          if (null != var2Lifetime75) {
            ii.field_e[3] = ea.a(0, var2Lifetime75);
          }
          var2Lifetime76 = im.a(125, "purchasables,4");
          if (null != var2Lifetime76) {
            ii.field_e[4] = ea.a(0, var2Lifetime76);
          }
          var2Lifetime77 = im.a(48, "purchasables,5");
          if (null != var2Lifetime77) {
            ii.field_e[5] = ea.a(0, var2Lifetime77);
          }
          var2Lifetime78 = im.a(107, "purchasables,6");
          if (var2Lifetime78 != null) {
            ii.field_e[6] = ea.a(0, var2Lifetime78);
          }
          var2Lifetime79 = im.a(118, "purchasemessages,0");
          if (null != var2Lifetime79) {
            ae.upgradeLabels[0] = ea.a(0, var2Lifetime79);
          }
          var2Lifetime80 = im.a(97, "purchasemessages,1");
          if (var2Lifetime80 != null) {
            ae.upgradeLabels[1] = ea.a(0, var2Lifetime80);
          }
          var2Lifetime81 = im.a(72, "purchasemessages,2");
          if (null != var2Lifetime81) {
            ae.upgradeLabels[2] = ea.a(0, var2Lifetime81);
          }
          if (param0 >= -35) {
            wu.a(true);
          }
          var2Lifetime82 = im.a(80, "purchasemessages,3");
          if (null != var2Lifetime82) {
            ae.upgradeLabels[3] = ea.a(0, var2Lifetime82);
          }
          var2Lifetime83 = im.a(48, "purchasemessages,4");
          if (var2Lifetime83 != null) {
            ae.upgradeLabels[4] = ea.a(0, var2Lifetime83);
          }
          var2Lifetime84 = im.a(122, "purchasemessages,5");
          if (null != var2Lifetime84) {
            ae.upgradeLabels[5] = ea.a(0, var2Lifetime84);
          }
          var2Lifetime85 = im.a(109, "purchasemessages,6");
          if (var2Lifetime85 != null) {
            ae.upgradeLabels[6] = ea.a(0, var2Lifetime85);
          }
          var2Lifetime86 = im.a(85, "arcadeunlocked");
          if (null != var2Lifetime86) {
            ab.field_r = ea.a(0, var2Lifetime86);
          }
          q.field_q = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_312_0 = var2_ref;
          stackIn_312_1 = new StringBuilder().append("wu.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_313_2 = "null";
          } else {
            stackIn_313_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_312_0), ((StringBuilder) (Object) stackIn_312_1).append(stackIn_313_2).append(')').toString());
        }
    }

    wu() {
        this.field_f = (byte) 0;
        this.field_O = false;
    }

    static {
        field_c = new int[8192];
        field_w = new IntrusiveDeque();
    }
}
