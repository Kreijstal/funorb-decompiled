/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ri extends qv {
    static int field_t;
    static String field_s;
    static sr field_u;
    static String field_v;
    static int field_r;

    final static void a(byte param0, int param1, nu param2, int param3) {
        nl stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        nl var16 = null;
        var15 = Kickabout.field_G;
        try {
          var16 = param2.field_P[param3][param1];
          if (var16.field_u != 0) {
            return;
          }
          var5 = 255 & 19 * ((1 + param3) * (1 + param1)) + param2.field_J;
          if (param0 != -93) {
            ri.a(113, false, true, 5);
          }
          var6 = var16.f(param0 - 7);
          var7 = var16.a(true);
          var8 = param2.field_V.a(true);
          var9 = param2.field_V.c(879306160);
          if ((var5 & (1 << var16.field_I) - 1) != 0) {
            if ((1 & var16.field_G) != 0 &&
              88080384 <= var16.field_w) {
              var16.field_G = var16.field_G & -2;
              var16.field_G = var16.field_G | 4;
            }
            if ((4 & var16.field_G) != 0 &&
              var16.field_w <= 0) {
              var16.field_G = var16.field_G & -5;
              var16.field_G = var16.field_G | 1;
            }
            if (0 != (8 & var16.field_G) &&
              58720256 <= var16.field_M) {
              var16.field_G = var16.field_G & -9;
              var16.field_G = var16.field_G | 2;
            }
            if ((var16.field_G & 2) != 0 &&
              var16.field_M <= 0) {
              var16.field_G = var16.field_G & -3;
              var16.field_G = var16.field_G | 8;
            }
          } else {
            gt.a(param1, param3, (byte) 103, param2.field_r[param3]);
            var10 = var6 - ge.field_m[0];
            var11 = -ge.field_m[1] + var7;
            var12 = 24;
            var13 = 24;
            if ((10 & var16.field_G) == 0) {
              var12 = var12 << 1;
            }
            if ((5 & var16.field_G) == 0) {
              var13 = var13 << 1;
            }
            if (Math.abs(var10) <= var12 &&
              Math.abs(var11) <= var13) {
              stackIn_17_0 = var16;
              if (var16.field_G == 0) {
                stackIn_18_1 = 5;
              } else {
                stackIn_18_1 = 7;
              }
              stackIn_17_0.field_I = stackIn_18_1;
              var16.field_G = 0;
            } else {
              var14 = 0;
              if (var12 < var10) {
                var14 = var14 | 2;
              }
              if (var10 < -var12) {
                var14 = var14 | 8;
              }
              if (var13 < var11) {
                var14 = var14 | 4;
              }
              if (-var13 > var11) {
                var14 = var14 | 1;
              }
              if (var16.field_G != var14) {
                var16.field_I = 1;
              } else {
                if (var16.field_I < 4 &&
                  var16.field_G == var14) {
                  var16.field_I = var16.field_I + 1;
                }
              }
              var16.field_G = var14;
            }
          }
          if (var16.field_G == 0 &&
            0 == var16.field_u &&
            var5 % 10 == 0) {
            var16.a(uv.a(true, -var7 + var9, -var6 + var8), 26214);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_59_0 = var4;
          stackIn_59_1 = new StringBuilder().append("ri.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(sj param0, int[] param1, int param2, kg[] param3, sj param4) {
        ut[] dupTemp$0 = null;
        ut[] dupTemp$1 = null;
        ut[] dupTemp$2 = null;
        ut[] dupTemp$3 = null;
        kg[] var5 = null;
        int[] var6 = null;
        kg[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var20 = null;
        kg[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        uo var7 = null;
        hd var8 = null;
        hd var9 = null;
        hd var10 = null;
        hd var11 = null;
        ut[] var12 = null;
        ut[] var13 = null;
        ut[] var14 = null;
        hd var15 = null;
        ut[] var16 = null;
        ut[] var17 = null;
        nu var19 = null;
        int var7_intLifetime1;
        var18 = Kickabout.field_G;
        try {
          boolean decompiledFrameRemainder0 = true;
          var21 = jo.a(param4, 17369, "lobby", "crowns");
          var5 = var21;
          bk.field_e = var21.length;
          if (param3 != null) {
            var6_array = new kg[param3.length + bk.field_e];
            for (var7_int = 0; var7_int < bk.field_e; var7_int++) {
              var6_array[var7_int] = var21[var7_int];
            }
            var5 = var6_array;
            for (var7_int = 0; param3.length > var7_int; var7_int++) {
              var6_array[var7_int + bk.field_e] = param3[var7_int];
            }
            var24 = new int[var5.length];
            var22 = var24;
            var20 = var22;
            var25 = var20;
            var23 = var25;
            var6 = var23;
            var7_int = 0;
          } else {
            var24 = new int[var5.length];
            var22 = var24;
            var20 = var22;
            var25 = var20;
            var23 = var25;
            var6 = var23;
            var7_int = 0;
            decompiledFrameRemainder0 = !(bk.field_e <= var7_int);
            if (decompiledFrameRemainder0) {
              var24[var7_int] = 10;
              var7_int++;
            }
          }
          if (decompiledFrameRemainder0) {
            while (bk.field_e > var7_int) {
              var24[var7_int] = 10;
              var7_int++;
            }
          }
          if (param3 != null) {
            if (param1 != null) {
              for (var7_intLifetime1 = 0; param3.length > var7_intLifetime1; var7_intLifetime1++) {
                var6[var7_intLifetime1 + bk.field_e] = param1[var7_intLifetime1];
              }
            } else {
              for (var7_intLifetime1 = 0; var7_intLifetime1 < param3.length; var7_intLifetime1++) {
                var6[var7_intLifetime1 + bk.field_e] = param3[var7_intLifetime1].field_a;
              }
            }
          }
          sh.field_c = 15;
          eb.field_b = 4;
          ig.field_c = 11;
          el.field_I = 2;
          mj.field_b = 2;
          var7 = qk.a("largefont", param0, 75, "lobby", param4);
          rq.field_E = qk.a("generalfont", param0, 87, "lobby", param4);
          jw.field_Ab = qk.a("chatfont", param0, 112, "lobby", param4);
          var7.a(var5, var25);
          rq.field_E.a(var5, var25);
          jw.field_Ab.a(var5, var25);
          var8 = new hd(0L, (hd) null);
          var8.field_y = 16777215;
          var8.field_X = (hu) ((Object) var7);
          var8.field_xb = sh.field_c;
          var8.field_p = 1;
          var9 = var8;
          var9.field_A = 1;
          var10 = new hd(0L, (hd) null);
          var10.field_y = 16777215;
          if (param2 > -51) {
            var19 = (nu) null;
            ri.a((byte) -76, -14, (nu) null, 71);
          }
          var10.field_X = (hu) ((Object) rq.field_E);
          var10.field_xb = sh.field_c;
          var10.field_p = 1;
          var11 = var10;
          var11.field_A = 1;
          qa.field_H = new hd(0L, var8);
          qa.field_H.field_R = bs.a(se.a(param4, -22, "lobby", "heading"), (byte) 86);
          jf.field_B = new hd(0L, (hd) null);
          jf.field_B.field_R = tq.a(120, false, 8421504, 4210752, false, (byte) -46);
          r.field_c = new hd(0L, (hd) null);
          r.field_c.field_R = fs.a(114, 3, 1, 6316128, 6316128, (byte) 92);
          pn.field_u = new hd(0L, (hd) null);
          pn.field_u.field_R = bs.a(se.a(param4, 81, "lobby", "popup"), (byte) 63);
          var12 = bs.a(se.a(param4, -125, "lobby", "popup_mouseover"), (byte) -4);
          var13 = se.a(param4, -122, "lobby", "button");
          var14 = bs.a(se.a(param4, -122, "lobby", "tab_active"), (byte) 61);
          ai.field_H = new hd(0L, var8);
          ai.field_H.field_R = var14;
          hl.field_f = new hd(0L, (hd) null);
          hl.field_f.field_N = wa.a((byte) 127, "lobby", param4, "closebutton");
          hl.field_f.field_vb = wa.a((byte) 114, "lobby", param4, "closebutton_mouseover");
          oi.field_i = new hd(0L, var8);
          oi.field_i.field_R = tq.a(40, true, 3815994, 2039583, true, (byte) -46);
          dn.field_zb = new hd(0L, var10);
          dn.field_zb.field_kb = 2;
          dn.field_zb.field_R = tq.a(30, false, 3815994, 2039583, true, (byte) -46);
          gw.field_a = new hd(0L, var10);
          gw.field_a.field_kb = 2;
          gw.field_a.field_R = tq.a(30, false, 3815994, 2039583, false, (byte) -46);
          pq.field_P = new hd(0L, var10);
          pq.field_P.field_kb = 2;
          pq.field_P.field_R = tq.a(30, true, 3815994, 2039583, false, (byte) -46);
          dw.field_e = new hd(0L, (hd) null);
          dw.field_e.field_X = (hu) ((Object) rq.field_E);
          dw.field_e.field_y = 13421772;
          dw.field_e.field_xb = sh.field_c;
          dw.field_e.field_p = 1;
          ul.field_c = new hd(0L, dw.field_e);
          ul.field_c.field_hb = 8421504;
          ul.field_c.field_H = 16777215;
          ul.field_c.field_ab = 16777215;
          ul.field_c.field_ub = 16777215;
          ul.field_c.field_y = 16764006;
          var15 = new hd(0L, ul.field_c);
          var15.field_y = 16777215;
          var15.field_X = (hu) ((Object) var7);
          var15.field_xb = sh.field_c;
          ip.field_c = new hd(0L, dw.field_e);
          ip.field_c.field_R = tq.a(16, false, 2236962, 2236962, false, (byte) -46);
          ip.field_c.field_kb = 2;
          kr.field_b = new hd(0L, dw.field_e);
          kr.field_b.field_R = tq.a(16, false, 1513239, 1513239, false, (byte) -46);
          kr.field_b.field_kb = 2;
          pw.field_J = new hd(0L, ip.field_c);
          pw.field_J.a(ul.field_c, (byte) -100);
          mp.field_f = new hd(0L, kr.field_b);
          mp.field_f.a(ul.field_c, (byte) -85);
          var16 = se.a(param4, 108, "lobby", "button_mouseover");
          su.field_b = new gu(pn.field_u, var12, dw.field_e, ul.field_c, 3, 2, mj.field_b, 3, sh.field_c);
          rg.field_e = new hd(0L, ul.field_c);
          rg.field_e.field_R = var13;
          rg.field_e.field_eb = 1;
          rg.field_e.field_S = var16;
          rg.field_e.field_O = 1;
          rg.field_e.field_cb = 1;
          rg.field_e.field_x = 1;
          rg.field_e.field_rb = se.a(param4, 7, "lobby", "button_mouseheld");
          rg.field_e.field_u = se.a(param4, -119, "lobby", "button_active");
          rg.field_e.field_tb = se.a(param4, -119, "lobby", "button_disabled");
          rg.field_e.field_A = 1;
          ge.field_n = new hd(0L, ul.field_c);
          ge.field_n.field_A = 1;
          ge.field_n.field_R = bs.a(se.a(param4, 6, "lobby", "tab_inactive"), (byte) 49);
          ge.field_n.field_S = bs.a(se.a(param4, -125, "lobby", "tab_mouseover"), (byte) 37);
          ge.field_n.field_u = var14;
          ku.field_b = new hd(0L, (hd) null);
          ku.field_b.field_R = fs.a(206, 3, -1, 1856141, 1127256, (byte) 91);
          cp.field_g = new hd(0L, (hd) null);
          cp.field_g.field_R = fs.a(290, 3, -1, 11579568, 6052956, (byte) 118);
          vg.field_Qb = new hd(0L, var15);
          vg.field_Qb.field_A = 1;
          vg.field_Qb.field_eb = 1;
          vg.field_Qb.field_cb = 1;
          vg.field_Qb.field_x = 1;
          vg.field_Qb.field_O = 1;
          dc.field_a = new hd(0L, vg.field_Qb);
          um.field_d = new hd(0L, ul.field_c);
          um.field_d.field_cb = 1;
          um.field_d.field_O = 1;
          um.field_d.field_A = 1;
          um.field_d.field_x = 1;
          um.field_d.field_eb = 1;
          jc.field_r = new hd(0L, um.field_d);
          mb.field_F = new hd(0L, um.field_d);
          ev.field_D = new hd(0L, vg.field_Qb);
          kn.field_F = new hd(0L, um.field_d);
          nj.field_d = new hd(0L, um.field_d);
          k.field_f = new hd(0L, um.field_d);
          um.field_d.field_R = bs.a(se.a(param4, 81, "lobby", "smallbutton"), (byte) 47);
          um.field_d.field_S = bs.a(se.a(param4, -4, "lobby", "smallbutton_mouseover"), (byte) 68);
          dupTemp$0 = bs.a(se.a(param4, -128, "lobby", "smallbutton_active"), (byte) -124);
          um.field_d.field_u = dupTemp$0;
          um.field_d.field_rb = dupTemp$0;
          um.field_d.field_tb = bs.a(se.a(param4, 89, "lobby", "smallbutton_disabled"), (byte) 12);
          dc.field_a.field_R = bs.a(se.a(param4, -31, "lobby", "mediumbutton"), (byte) -25);
          dc.field_a.field_S = bs.a(se.a(param4, -122, "lobby", "mediumbutton_mouseover"), (byte) 52);
          dc.field_a.field_rb = bs.a(se.a(param4, 62, "lobby", "mediumbutton_mouseheld"), (byte) 87);
          vg.field_Qb.field_R = bs.a(se.a(param4, 87, "lobby", "bigbutton"), (byte) 7);
          vg.field_Qb.field_S = bs.a(se.a(param4, 46, "lobby", "bigbutton_mouseover"), (byte) -127);
          vg.field_Qb.field_rb = bs.a(se.a(param4, 29, "lobby", "bigbutton_mouseheld"), (byte) -103);
          vg.field_Qb.field_tb = bs.a(se.a(param4, -123, "lobby", "bigbutton_disabled"), (byte) 126);
          jc.field_r.field_R = bs.a(se.a(param4, -10, "lobby", "greenbutton"), (byte) 25);
          jc.field_r.field_S = bs.a(se.a(param4, 92, "lobby", "greenbutton_mouseover"), (byte) -112);
          jc.field_r.field_rb = bs.a(se.a(param4, -39, "lobby", "greenbutton_mouseheld"), (byte) -26);
          mb.field_F.field_R = bs.a(se.a(param4, -123, "lobby", "redbutton"), (byte) 93);
          mb.field_F.field_S = bs.a(se.a(param4, -124, "lobby", "redbutton_mouseover"), (byte) -121);
          mb.field_F.field_rb = bs.a(se.a(param4, -37, "lobby", "redbutton_mouseheld"), (byte) -101);
          ev.field_D.field_R = bs.a(se.a(param4, -127, "lobby", "backbutton"), (byte) -116);
          ev.field_D.field_S = bs.a(se.a(param4, -119, "lobby", "backbutton_mouseover"), (byte) -110);
          ev.field_D.field_rb = bs.a(se.a(param4, 25, "lobby", "backbutton_mouseheld"), (byte) -3);
          ev.field_D.field_tb = bs.a(se.a(param4, 0, "lobby", "backbutton_disabled"), (byte) -99);
          k.field_f.field_R = bs.a(se.a(param4, 8, "lobby", "gameoptionbutton"), (byte) -20);
          k.field_f.field_S = bs.a(se.a(param4, 53, "lobby", "gameoptionbutton_mouseover"), (byte) -5);
          dupTemp$1 = bs.a(se.a(param4, -124, "lobby", "gameoptionbutton_active"), (byte) -121);
          k.field_f.field_u = dupTemp$1;
          k.field_f.field_rb = dupTemp$1;
          k.field_f.field_tb = bs.a(se.a(param4, 63, "lobby", "gameoptionbutton_disabled"), (byte) -109);
          kn.field_F.field_R = bs.a(se.a(param4, 31, "lobby", "chatbutton"), (byte) -113);
          kn.field_F.field_S = bs.a(se.a(param4, -127, "lobby", "chatbutton_mouseover"), (byte) 74);
          dupTemp$2 = bs.a(se.a(param4, 11, "lobby", "chatbutton_active"), (byte) -124);
          kn.field_F.field_u = dupTemp$2;
          kn.field_F.field_rb = dupTemp$2;
          nj.field_d.field_R = bs.a(se.a(param4, -123, "lobby", "chatfilterbutton"), (byte) 9);
          nj.field_d.field_S = bs.a(se.a(param4, -127, "lobby", "chatfilterbutton_mouseover"), (byte) 33);
          dupTemp$3 = bs.a(se.a(param4, -123, "lobby", "chatfilterbutton_active"), (byte) -121);
          nj.field_d.field_u = dupTemp$3;
          nj.field_d.field_rb = dupTemp$3;
          var17 = se.a(param4, -121, "lobby", "checkbox");
          hs.field_d = new om(0L, var17[1], var17[0], 1, ul.field_c, (String) null);
          np.field_Hb = new hd(0L, (hd) null);
          np.field_Hb.field_R = kh.a((byte) -83, wa.a((byte) 98, "lobby", param4, "slideregion"));
          np.field_Hb.field_S = kh.a((byte) -96, wa.a((byte) 113, "lobby", param4, "slideregion_mouseover"));
          np.field_Hb.field_rb = kh.a((byte) -86, wa.a((byte) 116, "lobby", param4, "slideregion_mouseheld"));
          np.field_Hb.field_tb = kh.a((byte) -108, wa.a((byte) 127, "lobby", param4, "slideregion_disabled"));
          ts.field_a = new hd(0L, (hd) null);
          ts.field_a.field_R = bs.a(se.a(param4, 108, "lobby", "dragbar"), (byte) 8);
          ts.field_a.field_S = bs.a(se.a(param4, 46, "lobby", "dragbar_mouseover"), (byte) -24);
          ts.field_a.field_rb = bs.a(se.a(param4, -119, "lobby", "dragbar_mouseheld"), (byte) -123);
          ts.field_a.field_tb = bs.a(se.a(param4, -27, "lobby", "dragbar_disabled"), (byte) -127);
          sd.field_a = new hd(0L, (hd) null);
          sd.field_a.field_N = wa.a((byte) 110, "lobby", param4, "upbutton");
          sd.field_a.field_vb = wa.a((byte) 116, "lobby", param4, "upbutton_mouseover");
          sd.field_a.field_r = wa.a((byte) 117, "lobby", param4, "upbutton_mouseheld");
          sd.field_a.field_t = wa.a((byte) 99, "lobby", param4, "upbutton_disabled");
          ci.field_b = new hd(0L, (hd) null);
          ci.field_b.field_N = wa.a((byte) 108, "lobby", param4, "downbutton");
          ci.field_b.field_vb = wa.a((byte) 108, "lobby", param4, "downbutton_mouseover");
          ci.field_b.field_r = wa.a((byte) 115, "lobby", param4, "downbutton_mouseheld");
          ci.field_b.field_t = wa.a((byte) 119, "lobby", param4, "downbutton_disabled");
          uk.field_b = new na(0L, sd.field_a, ci.field_b, np.field_Hb, ts.field_a);
          lh.field_D = new al(0L, (hd) null, rj.field_b, uk.field_b, um.field_d, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_27_0 = var5_ref;
          stackIn_27_1 = new StringBuilder().append("ri.C(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param4 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static ot a(ot param0, boolean param1) {
        int var3_int = 0;
        ot stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        ot var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        ut var10 = null;
        int var11 = 0;
        ut var12 = null;
        int var4Lifetime1;
        var8 = Kickabout.field_G;
        try {
          var10 = new ut(param0.field_o, param0.field_v);
          var12 = var10;
          for (var3_int = 0; var3_int < var12.field_y.length; var3_int++) {
            if (param0.field_y[var3_int] >>> 24 > 170) {
              var10.field_y[var3_int] = 8947848;
            }
          }
          var3 = new ot(param0.field_o, param0.field_v);
          iw.a(-54, var3);
          on.a(0, 0, on.field_g, on.field_f, 6710886);
          for (var4 = 2; 10 > var4; var4++) {
            var5 = (-var4 + 12 << 7) / 13;
            var6 = param0.field_o - var4;
            var7 = var4 / 4 + var4;
            var12.c(var7, var4 / 5 + var7, var6, var6, 65793 * var5);
          }
          ta.e(125);
          if (!param1) {
            var9 = (CharSequence) null;
            ri.a((CharSequence) null, (byte) 122);
          }
          var11 = 0;
          var4Lifetime1 = var11;
          while (var3.field_y.length > var11) {
            var3.field_y[var11] = hf.a(qj.b(var3.field_y[var11], 16777215), qj.b(param0.field_y[var11], -16777216));
            var11++;
          }
          stackIn_15_0 = var3;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("ri.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        try {
          if (param1) {
            kj.a(12105912, param2 + param3.field_g, param3.field_t + param4, param3.field_i, param3.field_n);
          }
          super.a(-21, param1, param2, param3, param4);
          int var6_int = 92 % ((59 - param0) / 53);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ri.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    ri(int param0) {
        this(gf.field_a, param0);
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int stackIn_10_0 = 0;
        hd stackIn_23_0 = null;
        String stackIn_24_1 = null;
        hd stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        String stackIn_27_2 = null;
        String stackIn_54_0 = null;
        hd stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        boolean stackIn_66_2 = false;
        hd stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        boolean stackIn_71_2 = false;
        hd stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        boolean stackIn_76_2 = false;
        int stackIn_78_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        hd var5 = null;
        hd var6 = null;
        hd var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        Object var10 = null;
        int var11 = 0;
        int var12_int = 0;
        Object var12 = null;
        String var12_ref = null;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        Object var12Lifetime1;
        int var10_intLifetime1;
        int var11Lifetime1;
        var13 = Kickabout.field_G;
        try {
          var4_int = -109 / ((-55 - param0) / 60);
          dw.a(127, fj.field_a);
          if (null != ow.field_b) {
            var5 = em.field_d;
            em.field_d.field_mb = 0;
            var5.field_q = 0;
            ua.field_k.field_mb = 0;
            var6 = ua.field_k;
            var6.field_q = 0;
            nv.field_F.field_mb = 0;
            var7 = nv.field_F;
            var7.field_q = 0;
            ci.field_h.field_E = qn.field_d.toUpperCase();
            var8 = (2 + fp.field_p.field_q) / 2;
            nv.field_F.a(true, -2 + var8, 0, -40 + fp.field_p.field_mb, 40);
            ua.field_k.a(true, -var8 + fp.field_p.field_q, var8, -40 + fp.field_p.field_mb, 40);
            if (rn.field_d.length == 1 &&
              rn.field_d[0] == 2) {
              var9 = 0;
            } else {
              var9 = 0;
              var10_int = 0;
              var11 = 0;
              while (true) {
                if (var11 < rn.field_d.length) {
                  stackIn_10_0 = ((er.field_h[var11 / 8] & 1 << (var11 & 7)) == 0) ? 0 : 1;
                  var12_int = stackIn_10_0;
                  if (var12_int != 0) {
                    var10_int++;
                  }
                  if (var12_int != 0 &&
                    rn.field_d[var11] != 2) {
                    var9 = 1;
                  } else {
                    var11++;
                    continue;
                  }
                }
                if (var10_int != 0) {
                  break;
                }
                var9 = 1;
                break;
              }
            }
            ua.field_k.field_lb = true;
            if (hw.field_k) {
              ac.field_b.field_lb = false;
              w.field_e.field_E = qr.field_c;
              if (var9 == 0) {
                stackIn_54_0 = ea.field_g;
              } else {
                stackIn_54_0 = rl.field_s;
              }
              var15 = stackIn_54_0;
              var10 = var15;
              var10 = var15;
              var10 = var15;
              var11Lifetime1 = nv.field_F.field_X.a(var15) + nv.field_F.field_X.a('.') * 3;
              if (16 == (de.field_c & 48)) {
                var10 = var15 + ".";
              }
              nv.field_F.field_A = 0;
              nv.field_F.field_kb = (nv.field_F.field_q - var11Lifetime1) / 2;
              if ((de.field_c & 48) == 32) {
                var10 = (String) (var10) + "..";
              }
              if (48 == (48 & de.field_c)) {
                var10 = (String) (var10) + "...";
              }
              nv.field_F.field_E = (String) (var10);
              ua.field_k.field_E = vt.field_a.toUpperCase();
            } else {
              stackIn_23_0 = ua.field_k;
              if (var9 != 0) {
                stackIn_24_1 = bm.field_F;
              } else {
                stackIn_24_1 = wp.field_e;
              }
              stackIn_23_0.field_E = ((String) (Object) stackIn_24_1).toUpperCase();
              stackIn_26_0 = w.field_e;
              stackIn_26_1 = -18;
              if (var9 != 0) {
                stackIn_27_2 = ko.field_j;
              } else {
                stackIn_27_2 = vr.field_b;
              }
              stackIn_26_0.field_E = vo.$cfr$intArgs$a$53ce4ab4c593(stackIn_26_1, stackIn_27_2, new String[]{ua.field_k.field_E});
              nv.field_F.field_E = jw.field_Db;
              ac.field_b.field_lb = true;
              tt.field_c = true;
              if (null != la.field_k) {
                ee.field_e = false;
                tt.field_c = false;
                if (hm.field_G == null) {
                  m.field_f = new boolean[ss.field_j];
                  hm.field_G = new byte[ss.field_j];
                }
                var14 = 0;
                var10_intLifetime1 = var14;
                while (var14 < ss.field_j) {
                  m.field_f[var14] = false;
                  var14++;
                }
                pl.a(0, ss.field_j, ow.field_b, -1, (byte) -121, -1, -1, true);
                if (!(2 > tk.field_Ib) &&
                  ne.field_G[12]) {
                  tt.field_c = true;
                }
              }
              if (!tt.field_c) {
                ua.field_k.field_lb = false;
                if (ua.field_k.field_Q) {
                  var10 = null;
                  if (ee.field_e) {
                    var10 = "<col=A00000>" + qk.field_H + "</col>";
                    var12 = var10;
                    var10 = var12;
                    var12Lifetime1 = var10;
                    var10 = var12Lifetime1;
                  }
                  for (var11Lifetime1 = 0; var11Lifetime1 < ss.field_j; var11Lifetime1++) {
                    if (m.field_f[var11Lifetime1]) {
                      var12_ref = "<col=A00000>" + ok.field_b[var11Lifetime1] + "</col>";
                      var10 = var12_ref;
                      var10 = var12_ref;
                      if (var10 != null) {
                        var10 = (String) (var10) + ", " + var12_ref;
                      } else {
                        var10 = var12_ref;
                      }
                    }
                  }
                  sn.field_e = "<col=A00000>" + op.field_t + "<br>" + ll.field_h + (String) (var10);
                }
              }
            }
          }
          stackIn_65_0 = dn.field_Cb;
          stackIn_65_1 = 0;
          stackIn_66_2 = (param2) && (!param1) && (!td.field_b);
          ((hd) (Object) stackIn_65_0).b(stackIn_65_1, stackIn_66_2);
          stackIn_70_0 = fp.field_p;
          stackIn_70_1 = 0;
          stackIn_71_2 = (param2) && (!param1) && (!td.field_b);
          ((hd) (Object) stackIn_70_0).b(stackIn_70_1, stackIn_71_2);
          stackIn_75_0 = tn.field_f;
          stackIn_75_1 = 0;
          stackIn_76_2 = (param2) && (!param1) && (td.field_b);
          ((hd) (Object) stackIn_75_0).b(stackIn_75_1, stackIn_76_2);
          ni.field_l.field_b.h((byte) 118);
          if (null != ow.field_b) {
            stackIn_78_0 = 0;
            if (stackIn_78_0 != ac.field_b.field_sb) {
              nv.a(param3, 32361);
            }
            if (ua.field_k.field_sb != 0) {
              if (hw.field_k) {
                mp.a(param3, (byte) 79);
              } else {
                up.a(param3, 0);
              }
            }
            ma.a(param3, (byte) -127, ow.field_b, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var4), "ri.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ri(hu param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_G, -1, 2147483647, false);
    }

    final static String a(CharSequence param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_5_0 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Kickabout.field_G;
        try {
          var2_int = param0.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param1 != -100) {
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param0.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(var5 + 32);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              57 < var5)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_21_0 = new String(var8);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("ri.G(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_u = null;
        if (!param0) {
          field_s = (String) null;
        }
        field_s = null;
        field_v = null;
    }

    static {
        field_s = "Pending";
        field_v = "to go straight into a multiplayer Exhibition Game with a preset team";
        field_r = 200;
        field_u = (sr) ((Object) new ba());
    }
}
