/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class wh extends rc {
    int field_s;
    int field_r;
    int field_m;
    int field_p;
    int field_o;
    static long field_n;
    static ck field_t;
    int field_u;
    static String field_q;

    final static void a(boolean param0, rh param1) {
        RuntimeException stackIn_310_0 = null;
        StringBuilder stackIn_310_1 = null;
        String stackIn_311_2 = null;
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
        var3 = Geoblox.field_C;
        try {
          pf.field_O = param1;
          var2 = ih.a(122, "achievement_names,0");
          if (null != var2) {
            pg.field_a[0] = ag.a(1, var2);
          }
          var2Lifetime1 = ih.a(122, "achievement_names,1");
          if (var2Lifetime1 != null) {
            pg.field_a[1] = ag.a(1, var2Lifetime1);
          }
          var2Lifetime2 = ih.a(126, "achievement_names,2");
          if (var2Lifetime2 != null) {
            pg.field_a[2] = ag.a(1, var2Lifetime2);
          }
          var2Lifetime3 = ih.a(125, "achievement_names,3");
          if (null != var2Lifetime3) {
            pg.field_a[3] = ag.a(1, var2Lifetime3);
          }
          var2Lifetime4 = ih.a(121, "achievement_names,4");
          if (null != var2Lifetime4) {
            pg.field_a[4] = ag.a(1, var2Lifetime4);
          }
          var2Lifetime5 = ih.a(126, "achievement_names,5");
          if (var2Lifetime5 != null) {
            pg.field_a[5] = ag.a(1, var2Lifetime5);
          }
          var2Lifetime6 = ih.a(125, "achievement_names,6");
          if (var2Lifetime6 != null) {
            pg.field_a[6] = ag.a(1, var2Lifetime6);
          }
          var2Lifetime7 = ih.a(125, "achievement_names,7");
          if (null != var2Lifetime7) {
            pg.field_a[7] = ag.a(1, var2Lifetime7);
          }
          var2Lifetime8 = ih.a(127, "achievement_names,8");
          if (null != var2Lifetime8) {
            pg.field_a[8] = ag.a(1, var2Lifetime8);
          }
          var2Lifetime9 = ih.a(122, "achievement_names,9");
          if (var2Lifetime9 != null) {
            pg.field_a[9] = ag.a(1, var2Lifetime9);
          }
          var2Lifetime10 = ih.a(122, "achievement_names,10");
          if (null != var2Lifetime10) {
            pg.field_a[10] = ag.a(1, var2Lifetime10);
          }
          var2Lifetime11 = ih.a(126, "achievement_names,11");
          if (null != var2Lifetime11) {
            pg.field_a[11] = ag.a(1, var2Lifetime11);
          }
          var2Lifetime12 = ih.a(122, "achievement_names,12");
          if (var2Lifetime12 != null) {
            pg.field_a[12] = ag.a(1, var2Lifetime12);
          }
          var2Lifetime13 = ih.a(125, "achievement_names,13");
          if (null != var2Lifetime13) {
            pg.field_a[13] = ag.a(1, var2Lifetime13);
          }
          var2Lifetime14 = ih.a(120, "achievement_names,14");
          if (var2Lifetime14 != null) {
            pg.field_a[14] = ag.a(1, var2Lifetime14);
          }
          var2Lifetime15 = ih.a(123, "achievement_names,15");
          if (null != var2Lifetime15) {
            pg.field_a[15] = ag.a(1, var2Lifetime15);
          }
          var2Lifetime16 = ih.a(121, "achievement_names,16");
          if (var2Lifetime16 != null) {
            pg.field_a[16] = ag.a(1, var2Lifetime16);
          }
          var2Lifetime17 = ih.a(122, "achievement_criteria,0");
          if (null != var2Lifetime17) {
            ri.field_b[0] = ag.a(1, var2Lifetime17);
          }
          var2Lifetime18 = ih.a(121, "achievement_criteria,1");
          if (null != var2Lifetime18) {
            ri.field_b[1] = ag.a(1, var2Lifetime18);
          }
          var2Lifetime19 = ih.a(125, "achievement_criteria,2");
          if (null != var2Lifetime19) {
            ri.field_b[2] = ag.a(1, var2Lifetime19);
          }
          var2Lifetime20 = ih.a(126, "achievement_criteria,3");
          if (var2Lifetime20 != null) {
            ri.field_b[3] = ag.a(1, var2Lifetime20);
          }
          var2Lifetime21 = ih.a(121, "achievement_criteria,4");
          if (null != var2Lifetime21) {
            ri.field_b[4] = ag.a(1, var2Lifetime21);
          }
          var2Lifetime22 = ih.a(120, "achievement_criteria,5");
          if (null != var2Lifetime22) {
            ri.field_b[5] = ag.a(1, var2Lifetime22);
          }
          var2Lifetime23 = ih.a(126, "achievement_criteria,6");
          if (var2Lifetime23 != null) {
            ri.field_b[6] = ag.a(1, var2Lifetime23);
          }
          var2Lifetime24 = ih.a(121, "achievement_criteria,7");
          if (var2Lifetime24 != null) {
            ri.field_b[7] = ag.a(1, var2Lifetime24);
          }
          var2Lifetime25 = ih.a(125, "achievement_criteria,8");
          if (null != var2Lifetime25) {
            ri.field_b[8] = ag.a(1, var2Lifetime25);
          }
          var2Lifetime26 = ih.a(125, "achievement_criteria,9");
          if (null != var2Lifetime26) {
            ri.field_b[9] = ag.a(1, var2Lifetime26);
          }
          var2Lifetime27 = ih.a(122, "achievement_criteria,10");
          if (null != var2Lifetime27) {
            ri.field_b[10] = ag.a(1, var2Lifetime27);
          }
          var2Lifetime28 = ih.a(126, "achievement_criteria,11");
          if (var2Lifetime28 != null) {
            ri.field_b[11] = ag.a(1, var2Lifetime28);
          }
          var2Lifetime29 = ih.a(126, "achievement_criteria,12");
          if (var2Lifetime29 != null) {
            ri.field_b[12] = ag.a(1, var2Lifetime29);
          }
          var2Lifetime30 = ih.a(127, "achievement_criteria,13");
          if (null != var2Lifetime30) {
            ri.field_b[13] = ag.a(1, var2Lifetime30);
          }
          var2Lifetime31 = ih.a(120, "achievement_criteria,14");
          if (null != var2Lifetime31) {
            ri.field_b[14] = ag.a(1, var2Lifetime31);
          }
          var2Lifetime32 = ih.a(127, "achievement_criteria,15");
          if (null != var2Lifetime32) {
            ri.field_b[15] = ag.a(1, var2Lifetime32);
          }
          var2Lifetime33 = ih.a(120, "achievement_criteria,16");
          if (null != var2Lifetime33) {
            ri.field_b[16] = ag.a(1, var2Lifetime33);
          }
          var2Lifetime34 = ih.a(127, "starting");
          if (null != var2Lifetime34) {
            uj.field_a = ag.a(1, var2Lifetime34);
          }
          var2Lifetime35 = ih.a(120, "gameName");
          if (var2Lifetime35 != null) {
            od.field_b = ag.a(1, var2Lifetime35);
          }
          var2Lifetime36 = ih.a(125, "caption1");
          if (var2Lifetime36 != null) {
            ag.a(1, var2Lifetime36);
          }
          var2Lifetime37 = ih.a(124, "caption2");
          if (null != var2Lifetime37) {
            ag.a(1, var2Lifetime37);
          }
          var2Lifetime38 = ih.a(123, "caption3");
          if (var2Lifetime38 != null) {
            ag.a(1, var2Lifetime38);
          }
          var2Lifetime39 = ih.a(125, "caption4");
          if (null != var2Lifetime39) {
            ag.a(1, var2Lifetime39);
          }
          var2Lifetime40 = ih.a(124, "caption5");
          if (null != var2Lifetime40) {
            ag.a(1, var2Lifetime40);
          }
          var2Lifetime41 = ih.a(126, "youreGreat");
          if (null != var2Lifetime41) {
            ld.field_a = ag.a(1, var2Lifetime41);
          }
          var2Lifetime42 = ih.a(120, "bubbleBonus");
          if (var2Lifetime42 != null) {
            sg.field_f = ag.a(1, var2Lifetime42);
          }
          var2Lifetime43 = ih.a(126, "endOfFreeGame");
          if (var2Lifetime43 != null) {
            ag.a(1, var2Lifetime43);
          }
          var2Lifetime44 = ih.a(126, "itsTheBubbleBonus");
          if (var2Lifetime44 != null) {
            kd.field_d = ag.a(1, var2Lifetime44);
          }
          var2Lifetime45 = ih.a(120, "countdown");
          if (null != var2Lifetime45) {
            w.field_e = ag.a(1, var2Lifetime45);
          }
          var2Lifetime46 = ih.a(124, "levelsLastGeoblox");
          if (null != var2Lifetime46) {
            tj.field_a = ag.a(1, var2Lifetime46);
          }
          var2Lifetime47 = ih.a(120, "clearBonus");
          if (null != var2Lifetime47) {
            wl.field_b = ag.a(1, var2Lifetime47);
          }
          var2Lifetime48 = ih.a(121, "cheat");
          if (!param0) {
            field_t = (ck) null;
          }
          if (var2Lifetime48 != null) {
            ag.a(1, var2Lifetime48);
          }
          var2Lifetime49 = ih.a(125, "bonus");
          if (var2Lifetime49 != null) {
            ic.field_a = ag.a(1, var2Lifetime49);
          }
          var2Lifetime50 = ih.a(123, "fps");
          if (null != var2Lifetime50) {
            sh.field_z = ag.a(1, var2Lifetime50);
          }
          var2Lifetime51 = ih.a(127, "level");
          if (var2Lifetime51 != null) {
            qg.field_e = ag.a(1, var2Lifetime51);
          }
          var2Lifetime52 = ih.a(124, "score");
          if (var2Lifetime52 != null) {
            pa.field_a = ag.a(1, var2Lifetime52);
          }
          var2Lifetime53 = ih.a(121, "waitingForPumpkin");
          if (var2Lifetime53 != null) {
            s.field_F = ag.a(1, var2Lifetime53);
          }
          var2Lifetime54 = ih.a(121, "loadingPumpkin");
          if (var2Lifetime54 != null) {
            uj.field_c = ag.a(1, var2Lifetime54);
          }
          var2Lifetime55 = ih.a(125, "skipText");
          if (var2Lifetime55 != null) {
            v.field_n = ag.a(1, var2Lifetime55);
          }
          var2Lifetime56 = ih.a(126, "tutorial1");
          if (null != var2Lifetime56) {
            vh.field_E = ag.a(1, var2Lifetime56);
          }
          var2Lifetime57 = ih.a(127, "tutorial2");
          if (var2Lifetime57 != null) {
            oi.field_d = ag.a(1, var2Lifetime57);
          }
          var2Lifetime58 = ih.a(121, "tutorial3");
          if (null != var2Lifetime58) {
            vd.field_e = ag.a(1, var2Lifetime58);
          }
          var2Lifetime59 = ih.a(122, "tutorial4");
          if (var2Lifetime59 != null) {
            li.field_b = ag.a(1, var2Lifetime59);
          }
          var2Lifetime60 = ih.a(120, "tutorial5");
          if (null != var2Lifetime60) {
            qh.field_S = ag.a(1, var2Lifetime60);
          }
          var2Lifetime61 = ih.a(123, "cont");
          if (null != var2Lifetime61) {
            mi.field_y = ag.a(1, var2Lifetime61);
          }
          var2Lifetime62 = ih.a(124, "restartTutorial");
          if (var2Lifetime62 != null) {
            cf.field_j = ag.a(1, var2Lifetime62);
          }
          var2Lifetime63 = ih.a(125, "discardResults");
          if (var2Lifetime63 != null) {
            ne.field_c = ag.a(1, var2Lifetime63);
          }
          var2Lifetime64 = ih.a(124, "replayTutorial");
          if (null != var2Lifetime64) {
            em.field_a = ag.a(1, var2Lifetime64);
          }
          var2Lifetime65 = ih.a(122, "subscribe");
          if (null != var2Lifetime65) {
            ag.a(1, var2Lifetime65);
          }
          var2Lifetime66 = ih.a(124, "createAnAccount");
          if (null != var2Lifetime66) {
            ag.a(1, var2Lifetime66);
          }
          var2Lifetime67 = ih.a(122, "fetchingHS");
          if (null != var2Lifetime67) {
            eb.field_f = ag.a(1, var2Lifetime67);
          }
          var2Lifetime68 = ih.a(126, "instructionTitles,0");
          if (var2Lifetime68 != null) {
            a.field_a[0] = ag.a(1, var2Lifetime68);
          }
          var2Lifetime69 = ih.a(127, "instructionTitles,1");
          if (var2Lifetime69 != null) {
            a.field_a[1] = ag.a(1, var2Lifetime69);
          }
          var2Lifetime70 = ih.a(121, "instructionTitles,2");
          if (null != var2Lifetime70) {
            a.field_a[2] = ag.a(1, var2Lifetime70);
          }
          var2Lifetime71 = ih.a(125, "instructionTitles,3");
          if (null != var2Lifetime71) {
            a.field_a[3] = ag.a(1, var2Lifetime71);
          }
          var2Lifetime72 = ih.a(123, "instructionTitles,4");
          if (var2Lifetime72 != null) {
            a.field_a[4] = ag.a(1, var2Lifetime72);
          }
          var2Lifetime73 = ih.a(120, "instructionTitles,5");
          if (null != var2Lifetime73) {
            a.field_a[5] = ag.a(1, var2Lifetime73);
          }
          var2Lifetime74 = ih.a(124, "instructionText,0");
          if (null != var2Lifetime74) {
            ec.field_e[0] = ag.a(1, var2Lifetime74);
          }
          var2Lifetime75 = ih.a(126, "instructionText,1");
          if (var2Lifetime75 != null) {
            ec.field_e[1] = ag.a(1, var2Lifetime75);
          }
          var2Lifetime76 = ih.a(120, "instructionText,2");
          if (var2Lifetime76 != null) {
            ec.field_e[2] = ag.a(1, var2Lifetime76);
          }
          var2Lifetime77 = ih.a(121, "instructionText,3");
          if (var2Lifetime77 != null) {
            ec.field_e[3] = ag.a(1, var2Lifetime77);
          }
          var2Lifetime78 = ih.a(123, "instructionText,4");
          if (null != var2Lifetime78) {
            ec.field_e[4] = ag.a(1, var2Lifetime78);
          }
          var2Lifetime79 = ih.a(126, "pleaseLogin");
          if (var2Lifetime79 != null) {
            Geoblox.field_A = ag.a(1, var2Lifetime79);
          }
          var2Lifetime80 = ih.a(125, "youAreNotLoggedIn");
          if (null != var2Lifetime80) {
            r.field_sb = ag.a(1, var2Lifetime80);
          }
          var2Lifetime81 = ih.a(120, "alternatively");
          if (var2Lifetime81 != null) {
            bd.field_b = ag.a(1, var2Lifetime81);
          }
          var2Lifetime82 = ih.a(125, "login");
          if (var2Lifetime82 != null) {
            gj.field_t = ag.a(1, var2Lifetime82);
          }
          var2Lifetime83 = ih.a(122, "notAcheived");
          if (null != var2Lifetime83) {
            ib.field_d = ag.a(1, var2Lifetime83);
          }
          var2Lifetime84 = ih.a(122, "keycode_reverseControls");
          if (null != var2Lifetime84) {
            jg.field_g = var2Lifetime84[0] & 255;
          }
          pf.field_O = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_310_0 = var2_ref;
          stackIn_310_1 = new StringBuilder().append("wh.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_311_2 = "null";
          } else {
            stackIn_311_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_310_0), ((StringBuilder) (Object) stackIn_310_1).append(stackIn_311_2).append(')').toString());
        }
        if (ch.field_h) {
          var3++;
          Geoblox.field_C = var3;
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        ge var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.field_C;
        try {
          {
            boolean decompiledFrameCompleted0 = true;
            if (param1 > 0) {
              var4 = new byte[param0];
              var5_int = 0;
              while (param0 > var5_int) {
                var4[var5_int] = param2[param1 + var5_int];
                var5_int++;
                if (var7 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                if (var7 != 0) {
                  var4 = param2;
                }
              }
            } else {
              var4 = param2;
            }
          }
          var5 = new ge();
          var5.a(52);
          var5.a(var4, (long)(param3 * param0), 0);
          var6 = new byte[64];
          var5.a(var6, 0, true);
          stackIn_11_0 = var6;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("wh.MA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int param12, int param13, int param14, int param15, int param16) {
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_114_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        var42 = Geoblox.field_C;
        try {
          if (param4 >= 0 &&
              mh.field_h > param8) {
            if (param2 < 0 &&
                param9 < 0 &&
                param13 < 0) {
              return;
            }
            if (mh.field_c <= param2 &&
                mh.field_c <= param9 &&
                param13 >= mh.field_c) {
              return;
            }
            if (param16 != -1275583984) {
              return;
            }
            L3: {
              var34 = -param8 + param4;
              if (param8 == param15) {
                if (~param4 == ~param8) {
                  var29 = param14;
                  var17_int = param2 << 16;
                  var31 = 0;
                  var30 = param7;
                  var19 = 0;
                  var21 = param1;
                  var24 = 0;
                  var32 = 0;
                  var20 = 0;
                  var26 = param3;
                  var23 = 0;
                  var22 = param10;
                  var27 = 0;
                  var28 = 0;
                  var18 = param9 << 16;
                  var25 = param12;
                }
                if (~param4 != ~param8 || var42 != 0) {
                  var35 = -param15 + param4;
                  if (param9 <= param2) {
                    var27 = (param0 - param3 << 16) / var35;
                    var29 = param7 << 16;
                    var20 = (param13 - param2 << 16) / var34;
                    var24 = (param6 - param1 << 16) / var34;
                    var17_int = param9 << 16;
                    var23 = (-param10 + param6 << 16) / var35;
                    var18 = param2 << 16;
                    var31 = (-param7 + param5 << 16) / var35;
                    var32 = (-param14 + param5 << 16) / var34;
                    var25 = param3 << 16;
                    var30 = param14 << 16;
                    var28 = (-param12 + param0 << 16) / var34;
                    var19 = (-param9 + param13 << 16) / var35;
                    var21 = param10 << 16;
                    var22 = param1 << 16;
                    var26 = param12 << 16;
                  }
                  if (!(param9 <= param2) || var42 != 0) {
                    var28 = (param0 - param3 << 16) / var35;
                    var23 = (param6 - param1 << 16) / var34;
                    var19 = (param13 - param2 << 16) / var34;
                    var25 = param12 << 16;
                    var22 = param10 << 16;
                    var32 = (param5 - param7 << 16) / var35;
                    var26 = param3 << 16;
                    var17_int = param2 << 16;
                    var24 = (-param10 + param6 << 16) / var35;
                    var21 = param1 << 16;
                    var30 = param7 << 16;
                    var18 = param9 << 16;
                    var20 = (param13 - param9 << 16) / var35;
                    var31 = (param5 - param14 << 16) / var34;
                    var27 = (param0 - param12 << 16) / var34;
                    var29 = param14 << 16;
                  }}
                var33 = 0;
                if (0 <= param8) {
                  break L3;
                }
                param8 = Math.min(-param8, param15 - param8);
                var22 = var22 + var24 * param8;
                var30 = var30 + param8 * var32;
                var18 = var18 + var20 * param8;
                var17_int = var17_int + var19 * param8;
                var25 = var25 + var27 * param8;
                var21 = var21 + var23 * param8;
                var29 = var29 + var31 * param8;
                var26 = var26 + param8 * var28;
                param8 = 0;
                if (var42 == 0) {
                  break L3;
                }
              }
              var18 = param2 << 16;
              var17_int = param2 << 16;
              var30 = param14 << 16;
              var29 = param14 << 16;
              var26 = param12 << 16;
              var25 = param12 << 16;
              var22 = param1 << 16;
              var21 = param1 << 16;
              var35 = param15 - param8;
              var20 = (-param2 + param13 << 16) / var34;
              var19 = (param9 - param2 << 16) / var35;
              if (var20 <= var19) {
                var23 = (-param1 + param6 << 16) / var34;
                var27 = (-param12 + param0 << 16) / var34;
                var31 = (-param14 + param5 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var28 = (-param12 + param3 << 16) / var35;
                var33 = 1;
                var32 = (-param14 + param7 << 16) / var35;
                var24 = (-param1 + param10 << 16) / var35;
                if (var42 != 0) {
                  var32 = (-param14 + param5 << 16) / var34;
                  var28 = (param0 - param12 << 16) / var34;
                  var23 = (param10 - param1 << 16) / var35;
                  var24 = (-param1 + param6 << 16) / var34;
                  var31 = (param7 - param14 << 16) / var35;
                  var27 = (-param12 + param3 << 16) / var35;
                  var33 = 0;
                }
              } else {
                var32 = (-param14 + param5 << 16) / var34;
                var28 = (param0 - param12 << 16) / var34;
                var23 = (param10 - param1 << 16) / var35;
                var24 = (-param1 + param6 << 16) / var34;
                var31 = (param7 - param14 << 16) / var35;
                var27 = (-param12 + param3 << 16) / var35;
                var33 = 0;
              }
              {
                boolean decompiledFrameCompleted0 = true;
                L11: {
                  if (param8 < 0) {
                    if (param15 >= 0) {
                      param8 = -param8;
                      var30 = var30 + var32 * param8;
                      var26 = var26 + param8 * var28;
                      var29 = var29 + var31 * param8;
                      var25 = var25 + param8 * var27;
                      var17_int = var17_int + param8 * var19;
                      var18 = var18 + param8 * var20;
                      var22 = var22 + var24 * param8;
                      var21 = var21 + param8 * var23;
                      param8 = 0;
                    }
                    if (!(param15 >= 0) || var42 != 0) {
                      param8 = param15 - param8;
                      var21 = var21 + param8 * var23;
                      var26 = var26 + param8 * var28;
                      var17_int = var17_int + param8 * var19;
                      var18 = var18 + param8 * var20;
                      var25 = var25 + var27 * param8;
                      var30 = var30 + var32 * param8;
                      var22 = var22 + param8 * var24;
                      var29 = var29 + var31 * param8;
                      param8 = param15;
                      if (var42 == 0) {
                        break L11;
                      }
                    }}
                  var36 = mh.field_b[param8];
                  while (param15 > param8) {
                    var37 = var17_int >> 16;
                    stackIn_73_0 = ~mh.field_c;
                    stackIn_73_1 = ~var37;
                    if (var42 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_73_0 < stackIn_73_1) {
                      var38 = (var18 >> 16) - (var17_int >> 16);
                      if (var38 != 0) {
                        var39 = (var22 - var21) / var38;
                        var40 = (-var25 + var26) / var38;
                        var41 = (var30 - var29) / var38;
                        if (mh.field_c <= var38 + var37) {
                          var38 = -1 + (mh.field_c - var37);
                        }
                        if (0 <= var37) {
                          jf.a(var37 + var36, var39, 33423689, var21, var41, var25, var40, var38, var29, param11);
                        } else {
                          jf.a(var36, var39, 33423689, -(var39 * var37) + var21, var41, var25 - var37 * var40, var40, var38 + var37, -(var41 * var37) + var29, param11);
                        }
                      } else {
                        if (var37 >= 0 &&
                            var37 < mh.field_c) {
                          jf.a(var37 + var36, 0, 33423689, var21, 0, var25, 0, var38, var29, param11);
                        }
                      }
                    }
                    param8++;
                    if (param8 >= mh.field_h) {
                      return;
                    }
                    var18 = var18 + var20;
                    var26 = var26 + var28;
                    var22 = var22 + var24;
                    var25 = var25 + var27;
                    var29 = var29 + var31;
                    var30 = var30 + var32;
                    var17_int = var17_int + var19;
                    var21 = var21 + var23;
                    var36 = var36 + vb.field_f;
                  }
                }
                if (decompiledFrameCompleted0) {
                  var36 = param4 - param15;
                  stackIn_73_0 = ~var36;
                  stackIn_73_1 = -1;
                }
              }
              if (stackIn_73_0 == stackIn_73_1) {
                var23 = 0;
                var27 = 0;
                var20 = 0;
                var19 = 0;
                var24 = 0;
                var31 = 0;
                var28 = 0;
                var32 = 0;
              }
              if (stackIn_73_0 != stackIn_73_1 || var42 != 0) {
                var37 = param13 << 16;
                var38 = param6 << 16;
                var39 = param0 << 16;
                var40 = param5 << 16;
                if (var33 == 0) {
                  var17_int = param9 << 16;
                  var29 = param7 << 16;
                  var21 = param10 << 16;
                  var25 = param3 << 16;
                }
                if (var33 != 0 || var42 != 0) {
                  var22 = param10 << 16;
                  var18 = param9 << 16;
                  var26 = param3 << 16;
                  var30 = param7 << 16;
                }
                var28 = (var39 - var26) / var36;
                var31 = (-var29 + var40) / var36;
                var19 = (var37 - var17_int) / var36;
                var23 = (-var21 + var38) / var36;
                var27 = (var39 - var25) / var36;
                var24 = (var38 - var22) / var36;
                var20 = (var37 - var18) / var36;
                var32 = (-var30 + var40) / var36;
              }
            }
            if (param8 < 0) {
              param8 = -param8;
              var18 = var18 + param8 * var20;
              var17_int = var17_int + param8 * var19;
              var22 = var22 + var24 * param8;
              var30 = var30 + param8 * var32;
              var21 = var21 + var23 * param8;
              var29 = var29 + param8 * var31;
              var26 = var26 + var28 * param8;
              var25 = var25 + var27 * param8;
              param8 = 0;
            }
            var35 = mh.field_b[param8];
            while (param4 > param8) {
              var36 = var17_int >> 16;
              if (var42 != 0) {
                return;
              }
              if (var36 < mh.field_c) {
                var37 = -(var17_int >> 16) + (var18 >> 16);
                if (var37 != 0) {
                  var38 = (var22 - var21) / var37;
                  var39 = (var26 - var25) / var37;
                  var40 = (-var29 + var30) / var37;
                  if (var37 + var36 >= mh.field_c) {
                    var37 = mh.field_c - var36 - 1;
                  }
                  if (var36 < 0) {
                    jf.a(var35, var38, 33423689, var21 - var38 * var36, var40, var25 - var36 * var39, var39, var37 + var36, -(var36 * var40) + var29, param11);
                  } else {
                    jf.a(var36 + var35, var38, 33423689, var21, var40, var25, var39, var37, var29, param11);
                  }
                } else {
                  if (var36 >= 0 &&
                      mh.field_c > var36) {
                    jf.a(var35 + var36, 0, 33423689, var21, 0, var25, 0, var37, var29, param11);
                  }
                }
              }
              param8++;
              if (mh.field_h <= param8) {
                return;
              }
              var18 = var18 + var20;
              var22 = var22 + var24;
              var35 = var35 + vb.field_f;
              var25 = var25 + var27;
              var26 = var26 + var28;
              var29 = var29 + var31;
              var21 = var21 + var23;
              var17_int = var17_int + var19;
              var30 = var30 + var32;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_113_0 = var17;
          stackIn_113_1 = new StringBuilder().append("wh.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_114_2 = "null";
          } else {
            stackIn_114_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_113_0), ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final static void a(qc param0, boolean param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var5 = 0;
            int stackIn_17_0 = 0;
            int stackIn_17_1 = 0;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            String stackIn_36_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            var5 = Geoblox.field_C;
            try {
              var2 = new byte[24];
              if (null != af.field_b) {
                try {
                  af.field_b.a(51, 0L);
                  af.field_b.a((byte) -76, var2);
                  var3_int = 0;
                  L4: while (true) {
                    if (var3_int < 24) {
                      stackIn_17_0 = ~var2[var3_int];
                      stackIn_17_1 = -1;
                      if (var5 != 0) {
                        break L4;
                      }
                      if (stackIn_17_0 == stackIn_17_1 ||
                          var5 != 0) {
                        var3_int++;
                        continue;
                      }
                    }
                    stackIn_17_0 = 24;
                    stackIn_17_1 = var3_int;
                    break;
                  }
                  if (stackIn_17_0 <= stackIn_17_1) {
                    throw new IOException();
                  }
                  decompiledRegionSelector0 = 0;
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  {
                    boolean decompiledFrameCompleted0 = true;
                    var3 = (Exception) (Object) decompiledCaughtException;
                    var4 = 0;
                    while (var4 < 24) {
                      var2[var4] = (byte) -1;
                      var4++;
                      if (var5 != 0) {
                        decompiledRegionSelector0 = 1;
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                    }
                    if (decompiledFrameCompleted0) {
                      decompiledRegionSelector0 = 0;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  param0.a(24, -97, var2, 0);
                }
              } else {
                param0.a(24, -97, var2, 0);
              }
              if (!param1) {
                field_t = (ck) null;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              runtimeException = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_35_0 = runtimeException;
              stackIn_35_1 = new StringBuilder().append("wh.IA(");
              if (param0 == null) {
                stackIn_36_2 = "null";
              } else {
                stackIn_36_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 5514) {
            wh.f(32);
          }
          field_q = null;
          field_t = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "wh.LA(" + param0 + ')');
        }
    }

    final static boolean e(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = cf.field_i;
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "wh.NA(" + param0 + ')');
        }
    }

    wh() {
    }

    static {
        field_q = null;
        field_t = new ck(9, 0, 4, 1);
    }
}
