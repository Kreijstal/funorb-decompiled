/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static int field_d;
    static ck[][] field_a;
    static int field_e;
    static ck field_c;
    static ck[] field_b;
    static int field_f;

    final static void a(boolean param0) {
        ck var1 = null;
        ck var2 = null;
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        try {
            var1 = new ck(540, 140);
            tb.a(param0, var1);
            qg.b();
            hk.b();
            gd.field_e = 0;
            vk.a(0);
            var2 = var1.c();
            for (var3 = 0; 15 > var3; var3++) {
                var2.d(-2, -2, 16777215);
                hk.b(4, 4, 0, 0, 540, 140);
            }
            qi.field_R.a();
            var1.d(0, 0);
            mk.a((byte) -5);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bb.E(" + param0 + ')');
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
            bb.a((byte) -17);
        }
        tf.i((byte) -121);
        db.a(param0);
        pd.field_f = null;
        pf.a(false);
    }

    public static void a(int param0) {
        field_c = null;
        field_a = (ck[][]) null;
        int var1 = -3 / ((param0 - 37) / 58);
        field_b = null;
    }

    final static void a(boolean param0, ji param1, pi[] param2, int[] param3, ji param4) {
        ck[] dupTemp$0 = null;
        ck[] dupTemp$1 = null;
        ck[] dupTemp$2 = null;
        ck[] dupTemp$3 = null;
        pi[] var5 = null;
        pi[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        pi[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        lm var7 = null;
        w var8 = null;
        w var9 = null;
        w var10 = null;
        w var11 = null;
        ck[] var12 = null;
        ck[] var13 = null;
        ck[] var14 = null;
        w var15 = null;
        ck[] var16 = null;
        ck[] var17 = null;
        var18 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var20 = t.a("crowns", param1, false, "lobby");
              var5 = var20;
              n.field_c = var20.length;
              if (param2 != null) {
                var6 = new pi[param2.length + n.field_c];
                var7_int = 0;
                L2: while (true) {
                  if (n.field_c <= var7_int) {
                    var7_int = 0;
                    L3: while (true) {
                      if (param2.length <= var7_int) {
                        var5 = var6;
                        break L1;
                      } else {
                        var6[var7_int + n.field_c] = param2[var7_int];
                        var7_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var6[var7_int] = var20[var7_int];
                    var7_int++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            var23 = new int[var5.length];
            var21 = var23;
            var19 = var21;
            var24 = var19;
            var22 = var24;
            var6_array = var22;
            var7_int = 0;
            L4: while (true) {
              if (var7_int >= n.field_c) {
                L5: {
                  if (param2 != null) {
                    if (param3 != null) {
                      var7_int = 0;
                      L6: while (true) {
                        if (param2.length <= var7_int) {
                          break L5;
                        } else {
                          var6_array[var7_int + n.field_c] = param3[var7_int];
                          var7_int++;
                          continue L6;
                        }
                      }
                    } else {
                      var7_int = 0;
                      L7: while (true) {
                        if (var7_int >= param2.length) {
                          break L5;
                        } else {
                          var6_array[var7_int + n.field_c] = param2[var7_int].field_g;
                          var7_int++;
                          continue L7;
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                hn.field_a = 2;
                kf.field_O = 15;
                wg.field_e = 11;
                nk.field_b = 4;
                j.field_c = 2;
                var7 = cd.a("largefont", param4, param1, (byte) 91, "lobby");
                tg.field_a = cd.a("generalfont", param4, param1, (byte) 121, "lobby");
                nf.field_d = cd.a("chatfont", param4, param1, (byte) 102, "lobby");
                var7.a(var5, var24);
                tg.field_a.a(var5, var24);
                nf.field_d.a(var5, var24);
                var8 = new w(0L, (w) null);
                var8.field_Db = kf.field_O;
                var8.field_G = 16777215;
                var8.field_J = (mm) ((Object) var7);
                var9 = var8;
                var8.field_W = 1;
                var9.field_X = 1;
                var10 = new w(0L, (w) null);
                var10.field_Db = kf.field_O;
                var10.field_G = 16777215;
                var10.field_J = (mm) ((Object) tg.field_a);
                var11 = var10;
                var10.field_W = 1;
                var11.field_X = 1;
                ml.field_a = new w(0L, var8);
                ml.field_a.field_lb = cg.a((byte) 116, bj.a(112, param1, "lobby", "heading"));
                wa.field_a = new w(0L, (w) null);
                wa.field_a.field_lb = qe.a(false, 120, false, 8421504, 4210752, -26198);
                db.field_c = new w(0L, (w) null);
                db.field_c.field_lb = ea.a(1, -20982, 3, 114, 6316128, 6316128);
                ah.field_h = new w(0L, (w) null);
                ah.field_h.field_lb = cg.a((byte) 126, bj.a(112, param1, "lobby", "popup"));
                var12 = cg.a((byte) 118, bj.a(112, param1, "lobby", "popup_mouseover"));
                var13 = bj.a(112, param1, "lobby", "button");
                var14 = cg.a((byte) 119, bj.a(112, param1, "lobby", "tab_active"));
                tg.field_h = new w(0L, var8);
                tg.field_h.field_lb = var14;
                ib.field_nb = new w(0L, (w) null);
                ib.field_nb.field_I = id.a(param1, "closebutton", "lobby", 8192);
                ib.field_nb.field_R = id.a(param1, "closebutton_mouseover", "lobby", 8192);
                i.field_e = new w(0L, var8);
                i.field_e.field_lb = qe.a(true, 40, true, 3815994, 2039583, -26198);
                fh.field_g = new w(0L, var10);
                fh.field_g.field_ub = 2;
                fh.field_g.field_lb = qe.a(false, 30, true, 3815994, 2039583, -26198);
                bl.field_Y = new w(0L, var10);
                bl.field_Y.field_ub = 2;
                bl.field_Y.field_lb = qe.a(false, 30, false, 3815994, 2039583, -26198);
                dd.field_k = new w(0L, var10);
                dd.field_k.field_ub = 2;
                dd.field_k.field_lb = qe.a(true, 30, false, 3815994, 2039583, -26198);
                ua.field_H = new w(0L, (w) null);
                ua.field_H.field_J = (mm) ((Object) tg.field_a);
                ua.field_H.field_Db = kf.field_O;
                ua.field_H.field_W = 1;
                ua.field_H.field_G = 13421772;
                df.field_ab = new w(0L, ua.field_H);
                df.field_ab.field_P = 8421504;
                df.field_ab.field_rb = 16777215;
                df.field_ab.field_Bb = 16777215;
                df.field_ab.field_G = 16764006;
                df.field_ab.field_fb = 16777215;
                var15 = new w(0L, df.field_ab);
                var15.field_Db = kf.field_O;
                var15.field_G = 16777215;
                var15.field_J = (mm) ((Object) var7);
                fc.field_c = new w(0L, ua.field_H);
                fc.field_c.field_lb = qe.a(param0, 16, false, 2236962, 2236962, -26198);
                fc.field_c.field_ub = 2;
                sg.field_e = new w(0L, ua.field_H);
                sg.field_e.field_lb = qe.a(false, 16, false, 1513239, 1513239, -26198);
                sg.field_e.field_ub = 2;
                fc.field_f = new w(0L, fc.field_c);
                fc.field_f.a(-118, df.field_ab);
                gg.field_G = new w(0L, sg.field_e);
                gg.field_G.a(-125, df.field_ab);
                var16 = bj.a(112, param1, "lobby", "button_mouseover");
                ik.field_e = new gb(ah.field_h, var12, ua.field_H, df.field_ab, 3, 2, j.field_c, 3, kf.field_O);
                vd.field_s = new w(0L, df.field_ab);
                vd.field_s.field_S = var16;
                vd.field_s.field_db = 1;
                vd.field_s.field_Z = 1;
                vd.field_s.field_lb = var13;
                vd.field_s.field_nb = 1;
                vd.field_s.field_ib = 1;
                vd.field_s.field_eb = bj.a(112, param1, "lobby", "button_mouseheld");
                vd.field_s.field_Q = bj.a(112, param1, "lobby", "button_active");
                vd.field_s.field_Ab = bj.a(112, param1, "lobby", "button_disabled");
                vd.field_s.field_X = 1;
                ec.field_i = new w(0L, df.field_ab);
                ec.field_i.field_X = 1;
                ec.field_i.field_lb = cg.a((byte) 125, bj.a(112, param1, "lobby", "tab_inactive"));
                ec.field_i.field_S = cg.a((byte) 126, bj.a(112, param1, "lobby", "tab_mouseover"));
                ec.field_i.field_Q = var14;
                fb.field_b = new w(0L, (w) null);
                fb.field_b.field_lb = ea.a(-1, -20982, 3, 206, 1127256, 1856141);
                bf.field_t = new w(0L, (w) null);
                bf.field_t.field_lb = ea.a(-1, -20982, 3, 290, 6052956, 11579568);
                d.field_g = new w(0L, var15);
                d.field_g.field_ib = 1;
                d.field_g.field_nb = 1;
                d.field_g.field_X = 1;
                d.field_g.field_Z = 1;
                d.field_g.field_db = 1;
                kn.field_p = new w(0L, d.field_g);
                ma.field_J = new w(0L, df.field_ab);
                ma.field_J.field_X = 1;
                ma.field_J.field_ib = 1;
                ma.field_J.field_Z = 1;
                ma.field_J.field_db = 1;
                ma.field_J.field_nb = 1;
                lj.field_c = new w(0L, ma.field_J);
                gk.field_Hb = new w(0L, ma.field_J);
                hd.field_q = new w(0L, d.field_g);
                oh.field_i = new w(0L, ma.field_J);
                rd.field_a = new w(0L, ma.field_J);
                l.field_a = new w(0L, ma.field_J);
                ma.field_J.field_lb = cg.a((byte) 116, bj.a(112, param1, "lobby", "smallbutton"));
                ma.field_J.field_S = cg.a((byte) 113, bj.a(112, param1, "lobby", "smallbutton_mouseover"));
                dupTemp$0 = cg.a((byte) 127, bj.a(112, param1, "lobby", "smallbutton_active"));
                ma.field_J.field_Q = dupTemp$0;
                ma.field_J.field_eb = dupTemp$0;
                ma.field_J.field_Ab = cg.a((byte) 115, bj.a(112, param1, "lobby", "smallbutton_disabled"));
                kn.field_p.field_lb = cg.a((byte) 123, bj.a(112, param1, "lobby", "mediumbutton"));
                kn.field_p.field_S = cg.a((byte) 117, bj.a(112, param1, "lobby", "mediumbutton_mouseover"));
                kn.field_p.field_eb = cg.a((byte) 114, bj.a(112, param1, "lobby", "mediumbutton_mouseheld"));
                d.field_g.field_lb = cg.a((byte) 120, bj.a(112, param1, "lobby", "bigbutton"));
                d.field_g.field_S = cg.a((byte) 114, bj.a(112, param1, "lobby", "bigbutton_mouseover"));
                d.field_g.field_eb = cg.a((byte) 123, bj.a(112, param1, "lobby", "bigbutton_mouseheld"));
                d.field_g.field_Ab = cg.a((byte) 121, bj.a(112, param1, "lobby", "bigbutton_disabled"));
                lj.field_c.field_lb = cg.a((byte) 125, bj.a(112, param1, "lobby", "greenbutton"));
                lj.field_c.field_S = cg.a((byte) 114, bj.a(112, param1, "lobby", "greenbutton_mouseover"));
                lj.field_c.field_eb = cg.a((byte) 123, bj.a(112, param1, "lobby", "greenbutton_mouseheld"));
                gk.field_Hb.field_lb = cg.a((byte) 113, bj.a(112, param1, "lobby", "redbutton"));
                gk.field_Hb.field_S = cg.a((byte) 113, bj.a(112, param1, "lobby", "redbutton_mouseover"));
                gk.field_Hb.field_eb = cg.a((byte) 123, bj.a(112, param1, "lobby", "redbutton_mouseheld"));
                hd.field_q.field_lb = cg.a((byte) 119, bj.a(112, param1, "lobby", "backbutton"));
                hd.field_q.field_S = cg.a((byte) 117, bj.a(112, param1, "lobby", "backbutton_mouseover"));
                hd.field_q.field_eb = cg.a((byte) 120, bj.a(112, param1, "lobby", "backbutton_mouseheld"));
                hd.field_q.field_Ab = cg.a((byte) 120, bj.a(112, param1, "lobby", "backbutton_disabled"));
                l.field_a.field_lb = cg.a((byte) 122, bj.a(112, param1, "lobby", "gameoptionbutton"));
                l.field_a.field_S = cg.a((byte) 123, bj.a(112, param1, "lobby", "gameoptionbutton_mouseover"));
                dupTemp$1 = cg.a((byte) 117, bj.a(112, param1, "lobby", "gameoptionbutton_active"));
                l.field_a.field_Q = dupTemp$1;
                l.field_a.field_eb = dupTemp$1;
                l.field_a.field_Ab = cg.a((byte) 114, bj.a(112, param1, "lobby", "gameoptionbutton_disabled"));
                oh.field_i.field_lb = cg.a((byte) 124, bj.a(112, param1, "lobby", "chatbutton"));
                oh.field_i.field_S = cg.a((byte) 114, bj.a(112, param1, "lobby", "chatbutton_mouseover"));
                dupTemp$2 = cg.a((byte) 125, bj.a(112, param1, "lobby", "chatbutton_active"));
                oh.field_i.field_Q = dupTemp$2;
                oh.field_i.field_eb = dupTemp$2;
                rd.field_a.field_lb = cg.a((byte) 124, bj.a(112, param1, "lobby", "chatfilterbutton"));
                rd.field_a.field_S = cg.a((byte) 125, bj.a(112, param1, "lobby", "chatfilterbutton_mouseover"));
                dupTemp$3 = cg.a((byte) 126, bj.a(112, param1, "lobby", "chatfilterbutton_active"));
                rd.field_a.field_Q = dupTemp$3;
                rd.field_a.field_eb = dupTemp$3;
                var17 = bj.a(112, param1, "lobby", "checkbox");
                al.field_h = new ha(0L, var17[1], var17[0], 1, df.field_ab, (String) null);
                cf.field_h = new w(0L, (w) null);
                cf.field_h.field_lb = vj.a(id.a(param1, "slideregion", "lobby", 8192), 32169);
                cf.field_h.field_S = vj.a(id.a(param1, "slideregion_mouseover", "lobby", 8192), 32169);
                cf.field_h.field_eb = vj.a(id.a(param1, "slideregion_mouseheld", "lobby", 8192), 32169);
                cf.field_h.field_Ab = vj.a(id.a(param1, "slideregion_disabled", "lobby", 8192), 32169);
                ng.field_i = new w(0L, (w) null);
                ng.field_i.field_lb = cg.a((byte) 122, bj.a(112, param1, "lobby", "dragbar"));
                ng.field_i.field_S = cg.a((byte) 118, bj.a(112, param1, "lobby", "dragbar_mouseover"));
                ng.field_i.field_eb = cg.a((byte) 118, bj.a(112, param1, "lobby", "dragbar_mouseheld"));
                ng.field_i.field_Ab = cg.a((byte) 124, bj.a(112, param1, "lobby", "dragbar_disabled"));
                pe.field_e = new w(0L, (w) null);
                pe.field_e.field_I = id.a(param1, "upbutton", "lobby", 8192);
                pe.field_e.field_R = id.a(param1, "upbutton_mouseover", "lobby", 8192);
                pe.field_e.field_bb = id.a(param1, "upbutton_mouseheld", "lobby", 8192);
                pe.field_e.field_tb = id.a(param1, "upbutton_disabled", "lobby", 8192);
                cn.field_X = new w(0L, (w) null);
                cn.field_X.field_I = id.a(param1, "downbutton", "lobby", 8192);
                cn.field_X.field_R = id.a(param1, "downbutton_mouseover", "lobby", 8192);
                cn.field_X.field_bb = id.a(param1, "downbutton_mouseheld", "lobby", 8192);
                cn.field_X.field_tb = id.a(param1, "downbutton_disabled", "lobby", 8192);
                tm.field_b = new jd(0L, pe.field_e, cn.field_X, cf.field_h, ng.field_i);
                id.field_N = new s(0L, (w) null, gf.field_g, tm.field_b, ma.field_J, (String) null, (String) null);
                break L0;
              } else {
                var23[var7_int] = 10;
                var7_int++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5_ref);

            stackIn_26_1 = new StringBuilder().append("bb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param4 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_36_2 + ')');
        }
    }

    final static ck[] a(int param0, String param1, ji param2, String param3) {
        ck[] var4 = null;
        RuntimeException var4_ref = null;
        ck[] var5 = null;
        ck[] stackIn_2_0 = null;
        ck[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = bj.a(param0 ^ 18144, param2, param1, param3);
            var4 = var5;
            var5[1].field_K = var5[1].field_I;
            var5[3].field_C = var5[3].field_H;
            var5[7].field_K = var5[7].field_I;
            if (param0 == 18064) {
              var5[5].field_C = var5[5].field_H;
              stackIn_4_0 = (ck[]) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ck[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("bb.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0) {
        if (param0 != -22) {
            bb.a(-30);
        }
    }

    static {
        field_d = -1;
        field_a = new ck[8][];
        field_f = 0;
    }
}
