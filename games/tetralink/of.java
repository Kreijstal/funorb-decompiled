/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    private int field_k;
    private int field_a;
    static String field_h;
    int field_g;
    private int field_d;
    int field_b;
    static String field_e;
    static kh[] field_f;
    private int field_j;
    private boolean field_i;
    private int field_c;

    final boolean b(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 83) {
            this.a(65, -111, (byte) 34);
          }
          stackIn_13_0 = (this.field_d != 0) || (this.field_c == 84) || (this.field_c == 83);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "of.E(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_k = 0;
          this.field_c = 0;
          this.field_d = 0;
          if (this.field_j == 0) {
            this.field_c = dg.field_e;
          }
          var2_int = 51 / ((param0 + 19) / 63);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "of.L(" + param0 + ')');
        }
    }

    final boolean h(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 16) {
            this.a(-84);
          }
          stackIn_13_0 = (this.field_k != 0) || (this.field_c == 84) || (this.field_c == 83);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "of.G(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 >= -14) {
            return;
          }
          if (this.field_j == 0) {
            this.field_b = param0;
            this.field_i = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var3), "of.I(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean e(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 29) {
            stackIn_7_0 = (this.field_c == 103);
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "of.Q(" + param0 + ')');
        }
    }

    final boolean b(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 51) {
            this.field_a = -40;
          }
          stackIn_16_0 = (this.field_k == 1) || (this.field_c == 97) || (this.field_c == 84) || (this.field_c == 83);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "of.P(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, byte param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 >= this.field_g) {
            throw new IllegalArgumentException();
          }
          if (param1 >= this.field_g) {
            throw new IllegalArgumentException();
          }
          this.field_d = 0;
          this.field_c = 0;
          this.field_k = 0;
          if (tm.field_t != 0) {
            this.field_j = tm.field_t;
            this.field_k = tm.field_t;
            this.field_d = tm.field_t;
            this.field_a = mk.field_h;
            this.field_i = true;
            this.field_b = param1;
          }
          if (0 != this.field_j &&
            ho.field_X != 0) {
            if (0 >= this.field_a) {
              this.field_a = pg.field_h;
              this.field_k = this.field_j;
            }
            this.field_a = this.field_a - 1;
          }
          if (param2 < 83) {
            return;
          }
          if (0 == tm.field_t &&
            0 == ho.field_X) {
            this.field_j = 0;
          }
          if (0 == this.field_j) {
            if (!this.field_i &&
              !qd.field_T) {
              return;
            }
            if (param0 < 0) {
              if (!this.field_i) {
                return;
              }
              this.field_b = -1;
              if (TetraLink.field_J == 0) {
                return;
              }
            }
            if (this.field_b == param0) {
            }
            this.field_i = true;
            this.field_b = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var4), "of.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, ah param1) {
        RuntimeException stackIn_237_0 = null;
        StringBuilder stackIn_237_1 = null;
        String stackIn_238_2 = null;
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
        try {
          bl.field_Nb = param1;
          var2 = sj.a("waitingfor_patches", -1);
          if (null != var2) {
            ud.a(var2, -81);
          }
          var2Lifetime1 = sj.a("loading_patches", -1);
          if (null != var2Lifetime1) {
            ud.a(var2Lifetime1, -82);
          }
          var2Lifetime2 = sj.a("TEXT_CREATE_ACCOUNT1", -1);
          if (null != var2Lifetime2) {
            ei.field_e = ud.a(var2Lifetime2, -42);
          }
          var2Lifetime3 = sj.a("TEXT_CREATE_ACCOUNT2", -1);
          if (null != var2Lifetime3) {
            rm.field_h = ud.a(var2Lifetime3, -108);
          }
          var2Lifetime4 = sj.a("TEXT_FULLSCREEN_TOGGLE", -1);
          if (var2Lifetime4 != null) {
            vd.field_g = ud.a(var2Lifetime4, -97);
          }
          var2Lifetime5 = sj.a("TEXT_MODE", -1);
          if (var2Lifetime5 != null) {
            ud.a(var2Lifetime5, -52);
          }
          var2Lifetime6 = sj.a("TEXT_DETAIL", -1);
          if (null != var2Lifetime6) {
            md.field_z = ud.a(var2Lifetime6, -73);
          }
          var2Lifetime7 = sj.a("TEXT_OPTIONS", -1);
          if (var2Lifetime7 != null) {
            fa.field_a = ud.a(var2Lifetime7, -79);
          }
          var2Lifetime8 = sj.a("TEXT_YOURCOLOUR", -1);
          if (null != var2Lifetime8) {
            fl.field_e = ud.a(var2Lifetime8, -45);
          }
          var2Lifetime9 = sj.a("TEXT_OPPONENT", -1);
          if (var2Lifetime9 != null) {
            id.field_w = ud.a(var2Lifetime9, -64);
          }
          var2Lifetime10 = sj.a("TEXT_PLAYERS", -1);
          if (var2Lifetime10 != null) {
            b.field_b = ud.a(var2Lifetime10, -88);
          }
          var2Lifetime11 = sj.a("TEXT_YOUR_TURN_PLAYING", -1);
          if (var2Lifetime11 != null) {
            qj.field_e = ud.a(var2Lifetime11, -84);
          }
          var2Lifetime12 = sj.a("TEXT_X_TURN_PLAYING", -1);
          if (null != var2Lifetime12) {
            ld.field_M = ud.a(var2Lifetime12, -57);
          }
          var2Lifetime13 = sj.a("TEXT_X_TURN", -1);
          if (var2Lifetime13 != null) {
            ef.field_o = ud.a(var2Lifetime13, -89);
          }
          var2Lifetime14 = sj.a("TEXT_COLOUR_WHITE", -1);
          if (var2Lifetime14 != null) {
            ek.field_t = ud.a(var2Lifetime14, -89);
          }
          var2Lifetime15 = sj.a("TEXT_COLOUR_RED", -1);
          if (var2Lifetime15 != null) {
            bh.field_s = ud.a(var2Lifetime15, -117);
          }
          var2Lifetime16 = sj.a("TEXT_DRAWN", -1);
          if (var2Lifetime16 != null) {
            dc.field_i = ud.a(var2Lifetime16, -77);
          }
          var2Lifetime17 = sj.a("TEXT_WINS", -1);
          if (null != var2Lifetime17) {
            ph.field_A = ud.a(var2Lifetime17, -106);
          }
          var2Lifetime18 = sj.a("TEXT_2D", -1);
          if (var2Lifetime18 != null) {
            wh.field_a = ud.a(var2Lifetime18, -70);
          }
          var2Lifetime19 = sj.a("TEXT_3D", -1);
          if (var2Lifetime19 != null) {
            en.field_I = ud.a(var2Lifetime19, -100);
          }
          var2Lifetime20 = sj.a("TEXT_SWITCH_2D", -1);
          var3 = 65 % ((param0 + 32) / 54);
          if (null != var2Lifetime20) {
            ai.field_c = ud.a(var2Lifetime20, -119);
          }
          var2Lifetime21 = sj.a("TEXT_SWITCH_3D", -1);
          if (null != var2Lifetime21) {
            qf.field_d = ud.a(var2Lifetime21, -97);
          }
          var2Lifetime22 = sj.a("TEXT_BACK", -1);
          if (var2Lifetime22 != null) {
            ci.field_A = ud.a(var2Lifetime22, -45);
          }
          var2Lifetime23 = sj.a("TEXT_NOT_AVAILABLE_IN_2D", -1);
          if (null != var2Lifetime23) {
            we.field_n = ud.a(var2Lifetime23, -122);
          }
          var2Lifetime24 = sj.a("TEXT_RESET_VIEW", -1);
          if (null != var2Lifetime24) {
            ud.a(var2Lifetime24, -127);
          }
          var2Lifetime25 = sj.a("TEXT_ERROR", -1);
          if (var2Lifetime25 != null) {
            jm.field_e = ud.a(var2Lifetime25, -43);
          }
          var2Lifetime26 = sj.a("TEXT_PLAY_AGAIN", -1);
          if (var2Lifetime26 != null) {
            qk.field_a = ud.a(var2Lifetime26, -78);
          }
          var2Lifetime27 = sj.a("GAMEOPT_NAMES,0", -1);
          if (null != var2Lifetime27) {
            la.field_l[0] = ud.a(var2Lifetime27, -98);
          }
          var2Lifetime28 = sj.a("GAMEOPT_NAMES,1", -1);
          if (null != var2Lifetime28) {
            la.field_l[1] = ud.a(var2Lifetime28, -125);
          }
          var2Lifetime29 = sj.a("GAMEOPT_NAMES,2", -1);
          if (var2Lifetime29 != null) {
            la.field_l[2] = ud.a(var2Lifetime29, -48);
          }
          var2Lifetime30 = sj.a("PLAYERNAME_HOTSEAT_2", -1);
          if (null != var2Lifetime30) {
            vh.field_a = ud.a(var2Lifetime30, -124);
          }
          var2Lifetime31 = sj.a("PLAYERNAME_HOTSEAT_1", -1);
          if (null != var2Lifetime31) {
            me.field_c = ud.a(var2Lifetime31, -58);
          }
          var2Lifetime32 = sj.a("TEXT_HINT", -1);
          if (var2Lifetime32 != null) {
            ud.a(var2Lifetime32, -98);
          }
          var2Lifetime33 = sj.a("DETAIL_NAMES,0", -1);
          if (var2Lifetime33 != null) {
            qf.field_f[0] = ud.a(var2Lifetime33, -50);
          }
          var2Lifetime34 = sj.a("DETAIL_NAMES,1", -1);
          if (null != var2Lifetime34) {
            qf.field_f[1] = ud.a(var2Lifetime34, -96);
          }
          var2Lifetime35 = sj.a("DETAIL_NAMES,2", -1);
          if (var2Lifetime35 != null) {
            qf.field_f[2] = ud.a(var2Lifetime35, -72);
          }
          var2Lifetime36 = sj.a("DETAIL_NAMES,3", -1);
          if (null != var2Lifetime36) {
            qf.field_f[3] = ud.a(var2Lifetime36, -65);
          }
          var2Lifetime37 = sj.a("DETAIL_NAMES,4", -1);
          if (null != var2Lifetime37) {
            qf.field_f[4] = ud.a(var2Lifetime37, -87);
          }
          var2Lifetime38 = sj.a("achievement_names,0", -1);
          if (var2Lifetime38 != null) {
            ui.field_a[0] = ud.a(var2Lifetime38, -51);
          }
          var2Lifetime39 = sj.a("achievement_names,1", -1);
          if (null != var2Lifetime39) {
            ui.field_a[1] = ud.a(var2Lifetime39, -77);
          }
          var2Lifetime40 = sj.a("achievement_names,2", -1);
          if (null != var2Lifetime40) {
            ui.field_a[2] = ud.a(var2Lifetime40, -58);
          }
          var2Lifetime41 = sj.a("achievement_names,3", -1);
          if (null != var2Lifetime41) {
            ui.field_a[3] = ud.a(var2Lifetime41, -104);
          }
          var2Lifetime42 = sj.a("achievement_names,4", -1);
          if (var2Lifetime42 != null) {
            ui.field_a[4] = ud.a(var2Lifetime42, -82);
          }
          var2Lifetime43 = sj.a("achievement_names,5", -1);
          if (null != var2Lifetime43) {
            ui.field_a[5] = ud.a(var2Lifetime43, -41);
          }
          var2Lifetime44 = sj.a("achievement_names,6", -1);
          if (var2Lifetime44 != null) {
            ui.field_a[6] = ud.a(var2Lifetime44, -122);
          }
          var2Lifetime45 = sj.a("achievement_names,7", -1);
          if (null != var2Lifetime45) {
            ui.field_a[7] = ud.a(var2Lifetime45, -120);
          }
          var2Lifetime46 = sj.a("achievement_criteria,0", -1);
          if (null != var2Lifetime46) {
            nh.field_Ob[0] = ud.a(var2Lifetime46, -52);
          }
          var2Lifetime47 = sj.a("achievement_criteria,1", -1);
          if (var2Lifetime47 != null) {
            nh.field_Ob[1] = ud.a(var2Lifetime47, -94);
          }
          var2Lifetime48 = sj.a("achievement_criteria,2", -1);
          if (var2Lifetime48 != null) {
            nh.field_Ob[2] = ud.a(var2Lifetime48, -49);
          }
          var2Lifetime49 = sj.a("achievement_criteria,3", -1);
          if (var2Lifetime49 != null) {
            nh.field_Ob[3] = ud.a(var2Lifetime49, -125);
          }
          var2Lifetime50 = sj.a("achievement_criteria,4", -1);
          if (null != var2Lifetime50) {
            nh.field_Ob[4] = ud.a(var2Lifetime50, -91);
          }
          var2Lifetime51 = sj.a("achievement_criteria,5", -1);
          if (var2Lifetime51 != null) {
            nh.field_Ob[5] = ud.a(var2Lifetime51, -90);
          }
          var2Lifetime52 = sj.a("achievement_criteria,6", -1);
          if (var2Lifetime52 != null) {
            nh.field_Ob[6] = ud.a(var2Lifetime52, -93);
          }
          var2Lifetime53 = sj.a("achievement_criteria,7", -1);
          if (var2Lifetime53 != null) {
            nh.field_Ob[7] = ud.a(var2Lifetime53, -124);
          }
          var2Lifetime54 = sj.a("text_login_or_discard", -1);
          if (var2Lifetime54 != null) {
            ud.a(var2Lifetime54, -86);
          }
          var2Lifetime55 = sj.a("gameoptlabels,0", -1);
          if (null != var2Lifetime55) {
            a.field_i[0] = ud.a(var2Lifetime55, -114);
          }
          var2Lifetime56 = sj.a("gameoptnames,0,0", -1);
          if (null != var2Lifetime56) {
            d.field_c[0][0] = ud.a(var2Lifetime56, -117);
          }
          var2Lifetime57 = sj.a("gameoptnames,0,1", -1);
          if (var2Lifetime57 != null) {
            d.field_c[0][1] = ud.a(var2Lifetime57, -110);
          }
          var2Lifetime58 = sj.a("gameoptnames,0,2", -1);
          if (null != var2Lifetime58) {
            d.field_c[0][2] = ud.a(var2Lifetime58, -37);
          }
          var2Lifetime59 = sj.a("gameoptnames,0,3", -1);
          if (null != var2Lifetime59) {
            d.field_c[0][3] = ud.a(var2Lifetime59, -114);
          }
          var2Lifetime60 = sj.a("gameoptnames,0,4", -1);
          if (var2Lifetime60 != null) {
            d.field_c[0][4] = ud.a(var2Lifetime60, -126);
          }
          var2Lifetime61 = sj.a("gameoptnames,0,5", -1);
          if (null != var2Lifetime61) {
            d.field_c[0][5] = ud.a(var2Lifetime61, -54);
          }
          var2Lifetime62 = sj.a("gameoptnames,0,6", -1);
          if (null != var2Lifetime62) {
            d.field_c[0][6] = ud.a(var2Lifetime62, -98);
          }
          var2Lifetime63 = sj.a("text_removed_from_game", -1);
          if (var2Lifetime63 != null) {
            rc.field_T = ud.a(var2Lifetime63, -74);
          }
          var2Lifetime64 = sj.a("text_lobby_pleaselogin", -1);
          if (null != var2Lifetime64) {
            eo.field_a = ud.a(var2Lifetime64, -95);
          }
          var2Lifetime65 = sj.a("instructions_pages,0", -1);
          if (var2Lifetime65 != null) {
            on.field_c[0] = ud.a(var2Lifetime65, -46);
          }
          var2Lifetime66 = sj.a("instructions_pages,1", -1);
          if (var2Lifetime66 != null) {
            on.field_c[1] = ud.a(var2Lifetime66, -96);
          }
          bl.field_Nb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_237_0 = var2_ref;
          stackIn_237_1 = new StringBuilder().append("of.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_238_2 = "null";
          } else {
            stackIn_238_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_237_0), ((StringBuilder) (Object) stackIn_237_1).append(stackIn_238_2).append(')').toString());
        }
    }

    final static java.net.URL a(String param0, java.net.URL param1, int param2, int param3, String param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          int stackIn_14_0 = 0;
          java.net.URL stackIn_57_0 = null;
          java.net.URL stackIn_59_0 = null;
          RuntimeException stackIn_63_0 = null;
          StringBuilder stackIn_63_1 = null;
          String stackIn_64_2 = null;
          StringBuilder stackIn_67_1 = null;
          String stackIn_68_2 = null;
          StringBuilder stackIn_71_1 = null;
          String stackIn_72_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          int var7_intLifetime1;
          int var7_intLifetime2;
          int var7_intLifetime3;
          var9 = TetraLink.field_J;
          try {
            var5 = param1.getFile();
            var6 = 0;
            if (param3 != -103) {
              field_f = (kh[]) null;
            }
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                stackIn_14_0 = var7_int;
                decompiledFrameRemainder0 = (var9 == 0);
                if ((decompiledFrameRemainder0) &&
                  (stackIn_14_0 >= 0)) {
                  if (param2 < 0) {
                    var6 = var7_int;
                    continue;
                  }
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_14_0 = var5.regionMatches(var6, "/a=", 0, 3) ? 1 : 0;
              }
              if (stackIn_14_0 != 0) {
                var7_intLifetime1 = var5.indexOf('/', var6 + 1);
                if (var7_intLifetime1 >= 0) {
                  var6 = var7_intLifetime1;
                  if (var9 == 0) {
                    continue;
                  }
                }
              }
              if (var5.regionMatches(var6, "/p=", 0, 3)) {
                var7_intLifetime2 = var5.indexOf('/', var6 + 1);
                if (var7_intLifetime2 >= 0) {
                  if (null == param0) {
                    var6 = var7_intLifetime2;
                    if (var9 == 0) {
                      continue;
                    }
                  }
                  var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime2);
                  if (var9 == 0) {
                    continue;
                  }
                }
              }
              if (var5.regionMatches(var6, "/s=", 0, 3) ||
                var5.regionMatches(var6, "/c=", 0, 3)) {
                var7_intLifetime3 = var5.indexOf('/', var6 + 1);
                if (var7_intLifetime3 >= 0) {
                  if (null == param4) {
                    var6 = var7_intLifetime3;
                    if (var9 == 0) {
                      continue;
                    }
                  }
                  var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime3);
                  if (var9 == 0) {
                    continue;
                  }
                }
              }
              break;
            }
            var7 = new StringBuilder(var6);
            discarded$0 = var7.append(var5.substring(0, var6));
            if (param2 > 0) {
              discarded$1 = var7.append("/l=");
              discarded$2 = var7.append(Integer.toString(param2));
            }
            if (null != param0 &&
              param0.length() > 0) {
              discarded$3 = var7.append("/p=");
              discarded$4 = var7.append(param0);
            }
            if (param4 != null &&
              0 < param4.length()) {
              discarded$5 = var7.append("/s=");
              discarded$6 = var7.append(param4);
            }
            if (var5.length() <= var6) {
              discarded$7 = var7.append('/');
              if (var9 != 0) {
                discarded$8 = var7.append(var5.substring(var6, var5.length()));
              }
            } else {
              discarded$8 = var7.append(var5.substring(var6, var5.length()));
            }
            try {
              stackIn_57_0 = new java.net.URL(param1, var7.toString());
              return stackIn_57_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = (Exception) (Object) decompiledCaughtException;
              var8.printStackTrace();
              stackIn_59_0 = (java.net.URL) (param1);
              return stackIn_59_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_63_0 = var5_ref;
            stackIn_63_1 = new StringBuilder().append("of.A(");
            if (param0 == null) {
              stackIn_64_2 = "null";
            } else {
              stackIn_64_2 = "{...}";
            }
            stackIn_67_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
            if (param1 == null) {
              stackIn_68_2 = "null";
            } else {
              stackIn_68_2 = "{...}";
            }
            stackIn_71_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_72_2 = "null";
            } else {
              stackIn_72_2 = "{...}";
            }
            throw oi.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean c(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -94) {
            of.a(-43, (ah) null);
          }
          stackIn_7_0 = (this.field_c == 102);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "of.B(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_k = 0;
          this.field_c = 0;
          this.field_d = 0;
          if (0 == this.field_j) {
            this.field_c = dg.field_e;
          }
          if (0 == this.field_j &&
            dg.field_e == 98) {
            if (this.field_b <= 0) {
              this.field_b = this.field_g;
            }
            this.field_i = false;
            this.field_b = this.field_b - 1;
          }
          if (this.field_j == 0 &&
            dg.field_e == 99) {
            this.field_b = this.field_b + 1;
            if (this.field_b >= this.field_g) {
              this.field_b = 0;
            }
            this.field_i = false;
          }
          if (param0 < 65) {
            this.b((byte) 118);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "of.J(" + param0 + ')');
        }
    }

    public static void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 > -107) {
            field_e = (String) null;
          }
          field_f = null;
          field_e = null;
          field_h = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "of.C(" + param0 + ')');
        }
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -3) {
            this.a(12, -46, (byte) -109);
          }
          stackIn_10_0 = (this.field_k == 2) || (this.field_c == 96);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "of.M(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 73 / ((-6 - param3) / 58);
          this.field_j = 0;
          this.field_i = param2;
          if (!this.field_i) {
            this.field_b = param1;
            if (TetraLink.field_J == 0) {
              return;
            }
          }
          this.field_b = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) runtimeException), "of.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          mf.field_s.i(0);
          if (null == nl.field_a) {
            nl.field_a = new ug(mf.field_s, wg.field_b);
          }
          if (!param0) {
            field_f = (kh[]) null;
          }
          mf.field_s.a(nl.field_a, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "of.O(" + param0 + ')');
        }
    }

    final boolean d(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_f = (kh[]) null;
          }
          stackIn_7_0 = (this.field_j != 0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "of.D(" + param0 + ')');
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_j = -119;
          }
          stackIn_7_0 = (this.field_c == 96);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "of.F(" + param0 + ')');
        }
    }

    final boolean c(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 97) {
            this.c(-58);
          }
          stackIn_7_0 = (this.field_c == 97);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "of.R(" + param0 + ')');
        }
    }

    of(int param0) {
        this.field_b = 0;
        this.field_i = false;
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "of.<init>(" + param0 + ')');
        }
    }

    static {
        field_h = "Unrated game";
        field_e = "This is <%0>'s RuneScape clan if they have one.";
    }
}
