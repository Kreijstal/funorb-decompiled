/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a extends cc {
    static int field_y;
    static int[] field_F;
    static int[] field_C;
    static int[] field_J;
    static hh field_H;
    static int[] field_B;
    static int[] field_G;
    static boolean field_D;
    static String field_A;
    static int[] field_E;
    static String field_z;

    a(int param0) {
        this(dj.field_h, param0);
    }

    final static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (de.field_pb != null) {
            return;
          }
          lc.field_e = new String[12];
          lc.field_e[2] = sn.field_p;
          lc.field_e[3] = ql.field_j;
          lc.field_e[1] = ql.field_j;
          lc.field_e[7] = pi.field_d;
          lc.field_e[11] = cm.field_j;
          lc.field_e[5] = ql.field_j;
          lc.field_e[8] = uf.field_F;
          lc.field_e[6] = j.field_a;
          if (param0 != 69) {
            field_E = (int[]) null;
          }
          lc.field_e[9] = qm.field_Ob;
          de.field_pb = new String[29];
          lc.field_e[4] = ql.field_j;
          lc.field_e[0] = mj.field_G;
          de.field_pb[14] = sk.field_c;
          de.field_pb[13] = jm.field_d;
          de.field_pb[15] = sd.field_d;
          de.field_pb[4] = j.field_a;
          de.field_pb[0] = cm.field_j;
          de.field_pb[16] = we.field_b;
          de.field_pb[6] = rb.field_d;
          de.field_pb[9] = kg.field_h;
          de.field_pb[11] = th.field_s;
          de.field_pb[19] = hk.field_Gb;
          de.field_pb[2] = cj.field_f;
          de.field_pb[3] = uf.field_F;
          de.field_pb[10] = cf.field_a;
          de.field_pb[12] = mf.field_i;
          de.field_pb[8] = ai.field_b;
          de.field_pb[7] = lh.field_d;
          de.field_pb[18] = hg.field_n;
          de.field_pb[17] = ac.field_b;
          de.field_pb[1] = ha.field_g;
          de.field_pb[5] = pi.field_d;
          de.field_pb[23] = pj.field_e;
          de.field_pb[28] = dh.field_v + ": ";
          de.field_pb[27] = gh.field_Lb;
          de.field_pb[22] = wn.field_z;
          de.field_pb[21] = sm.field_d;
          de.field_pb[25] = pg.field_i;
          de.field_pb[20] = og.field_t[0];
          de.field_pb[24] = te.field_c;
          de.field_pb[26] = rk.field_b;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "a.S(" + param0 + ')');
        }
    }

    public static void c(boolean param0) {
        field_J = null;
        field_C = null;
        field_z = null;
        field_F = null;
        field_E = null;
        field_G = null;
        field_H = null;
        if (param0) {
          return;
        }
        try {
          field_A = null;
          field_B = null;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "a.M(" + param0 + ')');
        }
    }

    private a(e param0, int param1) {
        super(param0, param1);
    }

    final String c(fi param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 218479361) {
            a.b(117);
          }
          stackIn_4_0 = f.a('*', param0.field_n.length(), (byte) -99);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("a.P(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static v a(String param0, eh param1, int param2, String param3, eh param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        v stackIn_2_0 = null;
        v stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -52) {
            stackIn_2_0 = (v) null;
            return stackIn_2_0;
          }
          var5_int = param1.a(-1, param0);
          var6 = param1.a(-127, var5_int, param3);
          stackIn_4_0 = em.a(var5_int, var6, param1, false, param4);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("a.Q(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(String param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          fe.field_Fb = param2;
          co.field_d = false;
          if (hf.field_w != null &&
            hf.field_w.field_G) {
            if (8 == param1) {
              param1 = 2;
              if (kb.field_c) {
                param0 = dd.field_c;
                if (Virogrid.field_F) {
                  param0 = wb.field_g;
                }
              } else {
                param0 = wb.field_g;
              }
              aa.field_a.a(-113, pm.field_g);
            }
            var3_int = 1;
            if (10 == param1) {
              var3_int = 0;
              qh.f((byte) 98);
            }
            if (var3_int != 0) {
              if (co.field_d) {
                param0 = oi.a(new String[]{param0}, rk.field_h, 2);
              }
              if (p.field_f) {
                param0 = oh.field_a;
              }
              hf.field_w.a(param1, true, param0);
            }
            if (param1 != 256 &&
              param1 != 10 &&
              !kb.field_c) {
              aa.field_a.e((byte) -125);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("a.N(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != 12) {
            a.b(19);
          }
          var1 = da.field_g;
          var2 = 0;
          var3 = var1.length;
          while (var2 < var3) {
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1_ref), "a.O(" + param0 + ')');
        }
    }

    final static void a(int param0, eh param1) {
        RuntimeException stackIn_376_0 = null;
        StringBuilder stackIn_376_1 = null;
        String stackIn_377_2 = null;
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
        try {
          ql.field_m = param1;
          var2 = jl.a("waitingfor_patches", true);
          if (null != var2) {
            i.a(-2022, var2);
          }
          var2Lifetime1 = jl.a("loading_patches", true);
          if (var2Lifetime1 != null) {
            i.a(param0 ^ -2034, var2Lifetime1);
          }
          var2Lifetime2 = jl.a("TEXT_GAMENAME", true);
          if (null != var2Lifetime2) {
            mj.field_G = i.a(-2022, var2Lifetime2);
          }
          var2Lifetime3 = jl.a("TEXT_CREATE_ACCOUNT1", true);
          if (var2Lifetime3 != null) {
            pc.field_a = i.a(-2022, var2Lifetime3);
          }
          var2Lifetime4 = jl.a("TEXT_CREATE_ACCOUNT2", true);
          if (var2Lifetime4 != null) {
            dd.field_f = i.a(-2022, var2Lifetime4);
          }
          var2Lifetime5 = jl.a("TEXT_FULLSCREEN_TOGGLE", true);
          if (null != var2Lifetime5) {
            rb.field_d = i.a(param0 - 2042, var2Lifetime5);
          }
          var2Lifetime6 = jl.a("TEXT_MODE", true);
          if (var2Lifetime6 != null) {
            i.a(param0 - 2042, var2Lifetime6);
          }
          var2Lifetime7 = jl.a("TEXT_DETAIL", true);
          if (null != var2Lifetime7) {
            ac.field_b = i.a(-2022, var2Lifetime7);
          }
          var2Lifetime8 = jl.a("TEXT_OPTIONS", true);
          if (var2Lifetime8 != null) {
            pj.field_e = i.a(-2022, var2Lifetime8);
          }
          var2Lifetime9 = jl.a("TEXT_RANKINGS_BYWINPERCENTAGE", true);
          if (null != var2Lifetime9) {
            sm.field_d = i.a(-2022, var2Lifetime9);
          }
          var2Lifetime10 = jl.a("TEXT_YOURCOLOUR", true);
          if (null != var2Lifetime10) {
            rf.field_f = i.a(-2022, var2Lifetime10);
          }
          var2Lifetime11 = jl.a("TEXT_OPPONENT", true);
          if (var2Lifetime11 != null) {
            pc.field_e = i.a(-2022, var2Lifetime11);
          }
          var2Lifetime12 = jl.a("TEXT_PLAYERS", true);
          if (var2Lifetime12 != null) {
            lm.field_k = i.a(param0 ^ -2034, var2Lifetime12);
          }
          var2Lifetime13 = jl.a("TEXT_YOUR_TURN_PLAYING", true);
          if (var2Lifetime13 != null) {
            gf.field_B = i.a(-2022, var2Lifetime13);
          }
          var2Lifetime14 = jl.a("TEXT_X_TURN_PLAYING", true);
          if (null != var2Lifetime14) {
            ie.field_b = i.a(-2022, var2Lifetime14);
          }
          var2Lifetime15 = jl.a("TEXT_X_TURN", true);
          if (null != var2Lifetime15) {
            hc.field_b = i.a(-2022, var2Lifetime15);
          }
          var2Lifetime16 = jl.a("TEXT_COLOUR_WHITE", true);
          if (null != var2Lifetime16) {
            pb.field_k = i.a(-2022, var2Lifetime16);
          }
          var2Lifetime17 = jl.a("TEXT_COLOUR_BLUE", true);
          if (null != var2Lifetime17) {
            uk.field_g = i.a(-2022, var2Lifetime17);
          }
          var2Lifetime18 = jl.a("TEXT_DRAWN", true);
          if (var2Lifetime18 != null) {
            i.a(-2022, var2Lifetime18);
          }
          var2Lifetime19 = jl.a("TEXT_WINS", true);
          if (var2Lifetime19 != null) {
            i.a(-2022, var2Lifetime19);
          }
          var2Lifetime20 = jl.a("TEXT_2D", true);
          if (var2Lifetime20 != null) {
            sd.field_b = i.a(param0 ^ -2034, var2Lifetime20);
          }
          var2Lifetime21 = jl.a("TEXT_3D", true);
          if (null != var2Lifetime21) {
            ld.field_f = i.a(-2022, var2Lifetime21);
          }
          var2Lifetime22 = jl.a("TEXT_SWITCH_2D", true);
          if (var2Lifetime22 != null) {
            sl.field_a = i.a(-2022, var2Lifetime22);
          }
          var2Lifetime23 = jl.a("TEXT_SWITCH_3D", true);
          if (null != var2Lifetime23) {
            o.field_a = i.a(-2022, var2Lifetime23);
          }
          var2Lifetime24 = jl.a("TEXT_BACK", true);
          if (null != var2Lifetime24) {
            ai.field_b = i.a(-2022, var2Lifetime24);
          }
          var2Lifetime25 = jl.a("TEXT_NOT_AVAILABLE_IN_2D", true);
          if (null != var2Lifetime25) {
            fn.field_g = i.a(-2022, var2Lifetime25);
          }
          var2Lifetime26 = jl.a("TEXT_RESET_VIEW", true);
          if (var2Lifetime26 != null) {
            i.a(-2022, var2Lifetime26);
          }
          var2Lifetime27 = jl.a("TEXT_ERROR", true);
          if (null != var2Lifetime27) {
            qm.field_Ob = i.a(-2022, var2Lifetime27);
          }
          if (param0 != 20) {
            field_E = (int[]) null;
          }
          var2Lifetime28 = jl.a("TEXT_PLAY_AGAIN", true);
          if (var2Lifetime28 != null) {
            hg.field_n = i.a(-2022, var2Lifetime28);
          }
          var2Lifetime29 = jl.a("TEXT_RATED_ACHIEVEMENTS", true);
          if (var2Lifetime29 != null) {
            dg.field_G = i.a(param0 - 2042, var2Lifetime29);
          }
          var2Lifetime30 = jl.a("TEXT_ENDGAME_ENTRAPMENT", true);
          if (var2Lifetime30 != null) {
            ee.field_f = i.a(-2022, var2Lifetime30);
          }
          var2Lifetime31 = jl.a("TEXT_ENDGAME_ENTRAPMENT_YOU", true);
          if (var2Lifetime31 != null) {
            vc.field_db = i.a(-2022, var2Lifetime31);
          }
          var2Lifetime32 = jl.a("TEXT_ENDGAME_BOARDFILLED", true);
          if (null != var2Lifetime32) {
            rc.field_i = i.a(-2022, var2Lifetime32);
          }
          var2Lifetime33 = jl.a("TEXT_ENDGAME_BOARDFILLED_YOU", true);
          if (null != var2Lifetime33) {
            fh.field_a = i.a(-2022, var2Lifetime33);
          }
          var2Lifetime34 = jl.a("TEXT_ENDGAME_BOARDFILLED_DRAW", true);
          if (var2Lifetime34 != null) {
            vf.field_d = i.a(-2022, var2Lifetime34);
          }
          var2Lifetime35 = jl.a("TEXT_ENDGAME_NOPIECES", true);
          if (var2Lifetime35 != null) {
            cg.field_e = i.a(-2022, var2Lifetime35);
          }
          var2Lifetime36 = jl.a("TEXT_ENDGAME_NOPIECES_YOU", true);
          if (var2Lifetime36 != null) {
            id.field_f = i.a(-2022, var2Lifetime36);
          }
          var2Lifetime37 = jl.a("TEXT_ENDGAME_NOTIME", true);
          if (null != var2Lifetime37) {
            dd.field_d = i.a(param0 ^ -2034, var2Lifetime37);
          }
          var2Lifetime38 = jl.a("TEXT_ENDGAME_NOTIME_YOU", true);
          if (null != var2Lifetime38) {
            ao.field_Nb = i.a(-2022, var2Lifetime38);
          }
          var2Lifetime39 = jl.a("TEXT_ENDGAME_RESIGNED", true);
          if (var2Lifetime39 != null) {
            vm.field_a = i.a(param0 - 2042, var2Lifetime39);
          }
          var2Lifetime40 = jl.a("TEXT_ENDGAME_RESIGNED_YOU", true);
          if (null != var2Lifetime40) {
            pg.field_a = i.a(param0 ^ -2034, var2Lifetime40);
          }
          var2Lifetime41 = jl.a("TEXT_VIEWCONTROLS_LEFT", true);
          if (var2Lifetime41 != null) {
            mc.field_d = i.a(-2022, var2Lifetime41);
          }
          var2Lifetime42 = jl.a("TEXT_VIEWCONTROLS_RIGHT", true);
          if (var2Lifetime42 != null) {
            pn.field_C = i.a(-2022, var2Lifetime42);
          }
          var2Lifetime43 = jl.a("TEXT_VIEWCONTROLS_ZOOMOUT", true);
          if (null != var2Lifetime43) {
            vb.field_i = i.a(param0 ^ -2034, var2Lifetime43);
          }
          var2Lifetime44 = jl.a("TEXT_VIEWCONTROLS_ZOOMIN", true);
          if (null != var2Lifetime44) {
            cb.field_b = i.a(param0 ^ -2034, var2Lifetime44);
          }
          var2Lifetime45 = jl.a("TEXT_VIEWCONTROLS_CENTRE", true);
          if (var2Lifetime45 != null) {
            ia.field_a = i.a(-2022, var2Lifetime45);
          }
          var2Lifetime46 = jl.a("TEXT_VIEWCONTROLS_MODE", true);
          if (var2Lifetime46 != null) {
            um.field_Kb = i.a(-2022, var2Lifetime46);
          }
          var2Lifetime47 = jl.a("PLAYERNAME_HOTSEAT_2", true);
          if (var2Lifetime47 != null) {
            em.field_e = i.a(param0 - 2042, var2Lifetime47);
          }
          var2Lifetime48 = jl.a("PLAYERNAME_HOTSEAT_1", true);
          if (var2Lifetime48 != null) {
            mb.field_eb = i.a(param0 - 2042, var2Lifetime48);
          }
          var2Lifetime49 = jl.a("TEXT_BOOTSEQUENCE", true);
          if (var2Lifetime49 != null) {
            jk.field_e = i.a(-2022, var2Lifetime49);
          }
          var2Lifetime50 = jl.a("TEXT_BOOTSEQUENCE_HALLOWEEN", true);
          if (null != var2Lifetime50) {
            ge.field_a = i.a(-2022, var2Lifetime50);
          }
          var2Lifetime51 = jl.a("DETAIL_NAMES,0", true);
          if (var2Lifetime51 != null) {
            cc.field_v[0] = i.a(-2022, var2Lifetime51);
          }
          var2Lifetime52 = jl.a("DETAIL_NAMES,1", true);
          if (var2Lifetime52 != null) {
            cc.field_v[1] = i.a(-2022, var2Lifetime52);
          }
          var2Lifetime53 = jl.a("DETAIL_NAMES,2", true);
          if (var2Lifetime53 != null) {
            cc.field_v[2] = i.a(-2022, var2Lifetime53);
          }
          var2Lifetime54 = jl.a("DETAIL_NAMES,3", true);
          if (null != var2Lifetime54) {
            cc.field_v[3] = i.a(param0 - 2042, var2Lifetime54);
          }
          var2Lifetime55 = jl.a("achievement_names,0", true);
          if (null != var2Lifetime55) {
            qk.field_d[0] = i.a(-2022, var2Lifetime55);
          }
          var2Lifetime56 = jl.a("achievement_names,1", true);
          if (null != var2Lifetime56) {
            qk.field_d[1] = i.a(-2022, var2Lifetime56);
          }
          var2Lifetime57 = jl.a("achievement_names,2", true);
          if (null != var2Lifetime57) {
            qk.field_d[2] = i.a(jd.a(param0, -2034), var2Lifetime57);
          }
          var2Lifetime58 = jl.a("achievement_names,3", true);
          if (null != var2Lifetime58) {
            qk.field_d[3] = i.a(-2022, var2Lifetime58);
          }
          var2Lifetime59 = jl.a("achievement_names,4", true);
          if (null != var2Lifetime59) {
            qk.field_d[4] = i.a(-2022, var2Lifetime59);
          }
          var2Lifetime60 = jl.a("achievement_names,5", true);
          if (var2Lifetime60 != null) {
            qk.field_d[5] = i.a(-2022, var2Lifetime60);
          }
          var2Lifetime61 = jl.a("achievement_names,6", true);
          if (var2Lifetime61 != null) {
            qk.field_d[6] = i.a(jd.a(param0, -2034), var2Lifetime61);
          }
          var2Lifetime62 = jl.a("achievement_names,7", true);
          if (null != var2Lifetime62) {
            qk.field_d[7] = i.a(param0 - 2042, var2Lifetime62);
          }
          var2Lifetime63 = jl.a("achievement_names,8", true);
          if (null != var2Lifetime63) {
            qk.field_d[8] = i.a(-2022, var2Lifetime63);
          }
          var2Lifetime64 = jl.a("achievement_names,9", true);
          if (null != var2Lifetime64) {
            qk.field_d[9] = i.a(-2022, var2Lifetime64);
          }
          var2Lifetime65 = jl.a("achievement_criteria,0", true);
          if (null != var2Lifetime65) {
            ak.field_b[0] = i.a(jd.a(param0, -2034), var2Lifetime65);
          }
          var2Lifetime66 = jl.a("achievement_criteria,1", true);
          if (null != var2Lifetime66) {
            ak.field_b[1] = i.a(-2022, var2Lifetime66);
          }
          var2Lifetime67 = jl.a("achievement_criteria,2", true);
          if (null != var2Lifetime67) {
            ak.field_b[2] = i.a(-2022, var2Lifetime67);
          }
          var2Lifetime68 = jl.a("achievement_criteria,3", true);
          if (var2Lifetime68 != null) {
            ak.field_b[3] = i.a(-2022, var2Lifetime68);
          }
          var2Lifetime69 = jl.a("achievement_criteria,4", true);
          if (null != var2Lifetime69) {
            ak.field_b[4] = i.a(-2022, var2Lifetime69);
          }
          var2Lifetime70 = jl.a("achievement_criteria,5", true);
          if (var2Lifetime70 != null) {
            ak.field_b[5] = i.a(-2022, var2Lifetime70);
          }
          var2Lifetime71 = jl.a("achievement_criteria,6", true);
          if (var2Lifetime71 != null) {
            ak.field_b[6] = i.a(-2022, var2Lifetime71);
          }
          var2Lifetime72 = jl.a("achievement_criteria,7", true);
          if (null != var2Lifetime72) {
            ak.field_b[7] = i.a(-2022, var2Lifetime72);
          }
          var2Lifetime73 = jl.a("achievement_criteria,8", true);
          if (null != var2Lifetime73) {
            ak.field_b[8] = i.a(-2022, var2Lifetime73);
          }
          var2Lifetime74 = jl.a("achievement_criteria,9", true);
          if (var2Lifetime74 != null) {
            ak.field_b[9] = i.a(-2022, var2Lifetime74);
          }
          var2Lifetime75 = jl.a("text_login_or_discard", true);
          if (var2Lifetime75 != null) {
            i.a(-2022, var2Lifetime75);
          }
          var2Lifetime76 = jl.a("gameoptlabels,0", true);
          if (null != var2Lifetime76) {
            wf.field_e[0] = i.a(jd.a(param0, -2034), var2Lifetime76);
          }
          var2Lifetime77 = jl.a("gameoptlabels,1", true);
          if (null != var2Lifetime77) {
            wf.field_e[1] = i.a(-2022, var2Lifetime77);
          }
          var2Lifetime78 = jl.a("gameoptnames,0,0", true);
          if (null != var2Lifetime78) {
            wc.field_c[0][0] = i.a(-2022, var2Lifetime78);
          }
          var2Lifetime79 = jl.a("gameoptnames,0,1", true);
          if (var2Lifetime79 != null) {
            wc.field_c[0][1] = i.a(-2022, var2Lifetime79);
          }
          var2Lifetime80 = jl.a("gameoptnames,0,2", true);
          if (var2Lifetime80 != null) {
            wc.field_c[0][2] = i.a(-2022, var2Lifetime80);
          }
          var2Lifetime81 = jl.a("gameoptnames,0,3", true);
          if (var2Lifetime81 != null) {
            wc.field_c[0][3] = i.a(-2022, var2Lifetime81);
          }
          var2Lifetime82 = jl.a("gameoptnames,0,4", true);
          if (var2Lifetime82 != null) {
            wc.field_c[0][4] = i.a(-2022, var2Lifetime82);
          }
          var2Lifetime83 = jl.a("gameoptnames,0,5", true);
          if (var2Lifetime83 != null) {
            wc.field_c[0][5] = i.a(-2022, var2Lifetime83);
          }
          var2Lifetime84 = jl.a("gameoptnames,0,6", true);
          if (var2Lifetime84 != null) {
            wc.field_c[0][6] = i.a(-2022, var2Lifetime84);
          }
          var2Lifetime85 = jl.a("gameoptnames,1,0", true);
          if (null != var2Lifetime85) {
            wc.field_c[1][0] = i.a(-2022, var2Lifetime85);
          }
          var2Lifetime86 = jl.a("gameoptnames,1,1", true);
          if (null != var2Lifetime86) {
            wc.field_c[1][1] = i.a(-2022, var2Lifetime86);
          }
          var2Lifetime87 = jl.a("gameoptnames,1,2", true);
          if (null != var2Lifetime87) {
            wc.field_c[1][2] = i.a(-2022, var2Lifetime87);
          }
          var2Lifetime88 = jl.a("hotseatmenulabel", true);
          if (var2Lifetime88 != null) {
            cm.field_j = i.a(param0 - 2042, var2Lifetime88);
          }
          var2Lifetime89 = jl.a("hotseatoption_gridwidth_colon", true);
          if (var2Lifetime89 != null) {
            pg.field_i = i.a(param0 - 2042, var2Lifetime89);
          }
          var2Lifetime90 = jl.a("hotseatoption_turnduration_colon", true);
          if (null != var2Lifetime90) {
            rk.field_b = i.a(-2022, var2Lifetime90);
          }
          var2Lifetime91 = jl.a("hotseatoption_ailevel_colon", true);
          if (var2Lifetime91 != null) {
            gh.field_Lb = i.a(-2022, var2Lifetime91);
          }
          var2Lifetime92 = jl.a("ailevelnames,0", true);
          if (var2Lifetime92 != null) {
            mh.field_i[0] = i.a(-2022, var2Lifetime92);
          }
          var2Lifetime93 = jl.a("ailevelnames,1", true);
          if (null != var2Lifetime93) {
            mh.field_i[1] = i.a(-2022, var2Lifetime93);
          }
          var2Lifetime94 = jl.a("ailevelnames,2", true);
          if (var2Lifetime94 != null) {
            mh.field_i[2] = i.a(-2022, var2Lifetime94);
          }
          var2Lifetime95 = jl.a("ailevelnames,3", true);
          if (var2Lifetime95 != null) {
            mh.field_i[3] = i.a(-2022, var2Lifetime95);
          }
          var2Lifetime96 = jl.a("tutorial1", true);
          if (var2Lifetime96 != null) {
            ee.field_b = i.a(-2022, var2Lifetime96);
          }
          var2Lifetime97 = jl.a("tutorial2", true);
          if (null != var2Lifetime97) {
            gl.field_h = i.a(-2022, var2Lifetime97);
          }
          var2Lifetime98 = jl.a("tutorial3", true);
          if (var2Lifetime98 != null) {
            fa.field_h = i.a(-2022, var2Lifetime98);
          }
          var2Lifetime99 = jl.a("tutorial4", true);
          if (var2Lifetime99 != null) {
            jd.field_a = i.a(param0 ^ -2034, var2Lifetime99);
          }
          var2Lifetime100 = jl.a("text_removed_from_game", true);
          if (var2Lifetime100 != null) {
            mi.field_f = i.a(param0 - 2042, var2Lifetime100);
          }
          var2Lifetime101 = jl.a("text_lobby_pleaselogin", true);
          if (null != var2Lifetime101) {
            he.field_cc = i.a(-2022, var2Lifetime101);
          }
          var2Lifetime102 = jl.a("instructions_pages,0", true);
          if (null != var2Lifetime102) {
            em.field_b[0] = i.a(-2022, var2Lifetime102);
          }
          var2Lifetime103 = jl.a("instructions_pages,1", true);
          if (null != var2Lifetime103) {
            em.field_b[1] = i.a(-2022, var2Lifetime103);
          }
          ql.field_m = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_376_0 = var2_ref;
          stackIn_376_1 = new StringBuilder().append("a.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_377_2 = "null";
          } else {
            stackIn_377_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_376_0), ((StringBuilder) (Object) stackIn_376_1).append(stackIn_377_2).append(')').toString());
        }
    }

    static {
        field_y = 0;
        field_G = new int[10];
        field_F = new int[10];
        field_B = new int[10];
        field_J = new int[10];
        field_C = new int[10];
        field_H = new hh();
        field_z = "<%0> is not on your ignore list.";
        field_A = "Remove name";
    }
}
