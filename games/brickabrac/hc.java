/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static String field_d;
    static jp[][] field_a;
    static int field_h;
    static boolean field_c;
    static int field_f;
    static jp field_g;
    static String field_b;
    static int[] field_e;

    final static fr a(int param0, pi param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        fr var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fr stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        fr stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param1.c(8, (byte) 62);
            if (0 < var2_int) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var3 = eo.a(false, param1) ? 1 : 0;
                var4 = eo.a(false, param1) ? 1 : 0;
                var5 = new fr();
                var5.field_w = (short)param1.c(16, (byte) -114);
                int discarded$20 = 16;
                var5.field_B = uj.a((byte) -67, var5.field_B, param1);
                int discarded$21 = 16;
                var5.field_Q = uj.a((byte) -117, var5.field_Q, param1);
                int discarded$22 = 16;
                var5.field_P = uj.a((byte) -110, var5.field_P, param1);
                var5.field_C = (short)param1.c(16, (byte) 79);
                int discarded$23 = 16;
                var5.field_G = uj.a((byte) -64, var5.field_G, param1);
                int discarded$24 = 16;
                var5.field_b = uj.a((byte) -74, var5.field_b, param1);
                int discarded$25 = 16;
                var5.field_c = uj.a((byte) -124, var5.field_c, param1);
                if (var3 != 0) {
                  var5.field_o = (short)param1.c(16, (byte) 52);
                  int discarded$26 = 16;
                  var5.field_n = uj.a((byte) -107, var5.field_n, param1);
                  int discarded$27 = 16;
                  var5.field_H = uj.a((byte) -77, var5.field_H, param1);
                  int discarded$28 = 16;
                  var5.field_a = uj.a((byte) -117, var5.field_a, param1);
                  int discarded$29 = 16;
                  var5.field_v = uj.a((byte) -68, var5.field_v, param1);
                  int discarded$30 = 16;
                  var5.field_h = uj.a((byte) -80, var5.field_h, param1);
                  int discarded$31 = 16;
                  var5.field_t = uj.a((byte) -61, var5.field_t, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 != 0) {
                  int discarded$32 = param1.c(16, (byte) 101);
                  int discarded$33 = 16;
                  var5.field_z = uj.a((byte) -122, var5.field_z, param1);
                  int discarded$34 = 16;
                  var5.field_m = uj.a((byte) -92, var5.field_m, param1);
                  int discarded$35 = 16;
                  var5.field_K = uj.a((byte) -123, var5.field_K, param1);
                  int discarded$36 = 16;
                  var5.field_j = uj.a((byte) -104, var5.field_j, param1);
                  int discarded$37 = 16;
                  var5.field_J = uj.a((byte) -124, var5.field_J, param1);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (eo.a(false, param1)) {
                  int discarded$38 = 16;
                  var5.field_L = uj.a((byte) -65, var5.field_L, param1);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (eo.a(false, param1)) {
                  int discarded$39 = 20;
                  var5.field_p = ri.a(var5.field_p, 16, param1);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var5.field_p.length <= var7) {
                      if (var6 != 0) {
                        var5.field_A = (byte)(1 + var6);
                        break L4;
                      } else {
                        var5.field_p = null;
                        break L4;
                      }
                    } else {
                      L6: {
                        if ((var5.field_p[var7] & 255) <= var6) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackOut_23_0 = (fr) var5;
              stackIn_24_0 = stackOut_23_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("hc.C(").append(16).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    public static void a() {
        field_e = null;
        field_a = null;
        field_d = null;
        field_b = null;
        field_g = null;
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = BrickABrac.field_J ? 1 : 0;
        try {
            re.field_b.a(1);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                ig.field_M[var1_int] = 0L;
            }
            for (var1_int = 0; 32 > var1_int; var1_int++) {
                sm.field_c[var1_int] = 0L;
            }
            if (param0 != 2) {
                field_c = false;
            }
            c.field_a = 0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "hc.D(" + param0 + ')');
        }
    }

    final static void a(byte param0, tp[] param1, int[] param2, mf param3, mf param4) {
        tp[] var5 = null;
        tp[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        hl var7 = null;
        mh var8 = null;
        mh var9 = null;
        mh var10 = null;
        mh var11 = null;
        jp[] var12 = null;
        jp[] var13 = null;
        jp[] var14 = null;
        mh var15 = null;
        jp[] var16 = null;
        jp[] var17 = null;
        int var18 = 0;
        int[] var19 = null;
        L0: {
          var18 = BrickABrac.field_J ? 1 : 0;
          int discarded$52 = -946715356;
          var5 = wq.a("lobby", param3, "crowns");
          mq.field_g = var5.length;
          if (param1 != null) {
            var6 = new tp[mq.field_g - -param1.length];
            var7_int = 0;
            L1: while (true) {
              if (mq.field_g <= var7_int) {
                var7_int = 0;
                L2: while (true) {
                  if (param1.length <= var7_int) {
                    var5 = var6;
                    break L0;
                  } else {
                    var6[mq.field_g + var7_int] = param1[var7_int];
                    var7_int++;
                    continue L2;
                  }
                }
              } else {
                var6[var7_int] = var5[var7_int];
                var7_int++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var19 = new int[var5.length];
        var6_array = var19;
        var7_int = 0;
        L3: while (true) {
          if (mq.field_g <= var7_int) {
            L4: {
              if (param1 != null) {
                L5: {
                  if (param2 != null) {
                    var7_int = 0;
                    L6: while (true) {
                      if (var7_int >= param1.length) {
                        break L5;
                      } else {
                        var6_array[mq.field_g + var7_int] = param2[var7_int];
                        var7_int++;
                        continue L6;
                      }
                    }
                  } else {
                    var7_int = 0;
                    L7: while (true) {
                      if (var7_int >= param1.length) {
                        break L5;
                      } else {
                        var6_array[mq.field_g + var7_int] = param1[var7_int].field_h;
                        var7_int++;
                        continue L7;
                      }
                    }
                  }
                }
                np.field_a = 15;
                re.field_g = 2;
                om.field_oc = 4;
                break L4;
              } else {
                np.field_a = 15;
                re.field_g = 2;
                om.field_oc = 4;
                break L4;
              }
            }
            kn.field_z = 2;
            ok.field_f = 11;
            var7 = nq.a((byte) -37, "lobby", param3, param4, "largefont");
            rd.field_e = nq.a((byte) -37, "lobby", param3, param4, "generalfont");
            ul.field_m = nq.a((byte) -37, "lobby", param3, param4, "chatfont");
            var7.a((fc[]) (Object) var5, var6_array);
            rd.field_e.a((fc[]) (Object) var5, var6_array);
            ul.field_m.a((fc[]) (Object) var5, var6_array);
            var8 = new mh(0L, (mh) null);
            var8.field_O = (dh) (Object) var7;
            var8.field_X = 16777215;
            var8.field_R = np.field_a;
            var8.field_Q = 1;
            var9 = var8;
            var9.field_S = 1;
            var10 = new mh(0L, (mh) null);
            var10.field_R = np.field_a;
            var10.field_X = 16777215;
            var10.field_O = (dh) (Object) rd.field_e;
            var11 = var10;
            var10.field_Q = 1;
            var11.field_S = 1;
            qh.field_j = new mh(0L, var8);
            int discarded$53 = 2;
            qh.field_j.field_Jb = qg.a(cr.a("lobby", param3, "heading"), (byte) -117);
            lp.field_Ab = new mh(0L, (mh) null);
            lp.field_Ab.field_Jb = vp.a(false, (byte) 83, 8421504, 120, 4210752, false);
            f.field_a = new mh(0L, (mh) null);
            f.field_a.field_Jb = na.a(false, 6316128, 3, 6316128, 114, 1);
            ij.field_c = new mh(0L, (mh) null);
            int discarded$54 = 2;
            ij.field_c.field_Jb = qg.a(cr.a("lobby", param3, "popup"), (byte) -114);
            int discarded$55 = 2;
            var12 = qg.a(cr.a("lobby", param3, "popup_mouseover"), (byte) -117);
            int discarded$56 = 2;
            var13 = cr.a("lobby", param3, "button");
            int discarded$57 = 2;
            var14 = qg.a(cr.a("lobby", param3, "tab_active"), (byte) -110);
            rf.field_c = new mh(0L, var8);
            rf.field_c.field_Jb = var14;
            am.field_Zb = new mh(0L, (mh) null);
            am.field_Zb.field_wb = pl.a("lobby", "closebutton", (byte) -90, param3);
            am.field_Zb.field_T = pl.a("lobby", "closebutton_mouseover", (byte) 119, param3);
            lj.field_k = new mh(0L, var8);
            lj.field_k.field_Jb = vp.a(true, (byte) 57, 3815994, 40, 2039583, true);
            rp.field_t = new mh(0L, var10);
            rp.field_t.field_V = 2;
            rp.field_t.field_Jb = vp.a(true, (byte) 44, 3815994, 30, 2039583, false);
            cd.field_d = new mh(0L, var10);
            cd.field_d.field_V = 2;
            cd.field_d.field_Jb = vp.a(false, (byte) 77, 3815994, 30, 2039583, false);
            ik.field_a = new mh(0L, var10);
            ik.field_a.field_V = 2;
            ik.field_a.field_Jb = vp.a(false, (byte) 83, 3815994, 30, 2039583, true);
            ad.field_l = new mh(0L, (mh) null);
            ad.field_l.field_Q = 1;
            ad.field_l.field_O = (dh) (Object) rd.field_e;
            ad.field_l.field_R = np.field_a;
            ad.field_l.field_X = 13421772;
            tk.field_t = new mh(0L, ad.field_l);
            tk.field_t.field_Fb = 16777215;
            tk.field_t.field_I = 8421504;
            tk.field_t.field_X = 16764006;
            tk.field_t.field_Y = 16777215;
            tk.field_t.field_vb = 16777215;
            var15 = new mh(0L, tk.field_t);
            var15.field_O = (dh) (Object) var7;
            var15.field_X = 16777215;
            var15.field_R = np.field_a;
            vo.field_C = new mh(0L, ad.field_l);
            vo.field_C.field_Jb = vp.a(false, (byte) 94, 2236962, 16, 2236962, false);
            vo.field_C.field_V = 2;
            wi.field_n = new mh(0L, ad.field_l);
            wi.field_n.field_Jb = vp.a(false, (byte) 80, 1513239, 16, 1513239, false);
            wi.field_n.field_V = 2;
            fp.field_v = new mh(0L, vo.field_C);
            fp.field_v.a((byte) -82, tk.field_t);
            vb.field_K = new mh(0L, wi.field_n);
            vb.field_K.a((byte) -72, tk.field_t);
            int discarded$58 = 2;
            var16 = cr.a("lobby", param3, "button_mouseover");
            ce.field_b = new br(ij.field_c, var12, ad.field_l, tk.field_t, 3, 2, kn.field_z, 3, np.field_a);
            fi.field_s = new mh(0L, tk.field_t);
            fi.field_s.field_E = 1;
            fi.field_s.field_ub = 1;
            fi.field_s.field_N = 1;
            fi.field_s.field_Gb = var16;
            fi.field_s.field_Jb = var13;
            fi.field_s.field_rb = 1;
            int discarded$59 = 2;
            fi.field_s.field_D = cr.a("lobby", param3, "button_mouseheld");
            int discarded$60 = 2;
            fi.field_s.field_pb = cr.a("lobby", param3, "button_active");
            int discarded$61 = 2;
            fi.field_s.field_Ab = cr.a("lobby", param3, "button_disabled");
            fi.field_s.field_S = 1;
            eh.field_n = new mh(0L, tk.field_t);
            eh.field_n.field_S = 1;
            int discarded$62 = 2;
            eh.field_n.field_Jb = qg.a(cr.a("lobby", param3, "tab_inactive"), (byte) -119);
            int discarded$63 = 2;
            eh.field_n.field_Gb = qg.a(cr.a("lobby", param3, "tab_mouseover"), (byte) -124);
            eh.field_n.field_pb = var14;
            hd.field_c = new mh(0L, (mh) null);
            hd.field_c.field_Jb = na.a(false, 1127256, 3, 1856141, 206, -1);
            qb.field_x = new mh(0L, (mh) null);
            qb.field_x.field_Jb = na.a(false, 6052956, 3, 11579568, 290, -1);
            fm.field_b = new mh(0L, var15);
            fm.field_b.field_rb = 1;
            fm.field_b.field_N = 1;
            fm.field_b.field_E = 1;
            fm.field_b.field_S = 1;
            fm.field_b.field_ub = 1;
            ij.field_b = new mh(0L, fm.field_b);
            uk.field_r = new mh(0L, tk.field_t);
            uk.field_r.field_N = 1;
            uk.field_r.field_S = 1;
            uk.field_r.field_E = 1;
            uk.field_r.field_rb = 1;
            uk.field_r.field_ub = 1;
            ok.field_d = new mh(0L, uk.field_r);
            ee.field_s = new mh(0L, uk.field_r);
            ab.field_x = new mh(0L, fm.field_b);
            im.field_d = new mh(0L, uk.field_r);
            fp.field_u = new mh(0L, uk.field_r);
            al.field_n = new mh(0L, uk.field_r);
            int discarded$64 = 2;
            uk.field_r.field_Jb = qg.a(cr.a("lobby", param3, "smallbutton"), (byte) -119);
            int discarded$65 = 2;
            uk.field_r.field_Gb = qg.a(cr.a("lobby", param3, "smallbutton_mouseover"), (byte) -114);
            int discarded$66 = 2;
            jp[] dupTemp$67 = qg.a(cr.a("lobby", param3, "smallbutton_active"), (byte) -102);
            uk.field_r.field_pb = dupTemp$67;
            uk.field_r.field_D = dupTemp$67;
            int discarded$68 = 2;
            uk.field_r.field_Ab = qg.a(cr.a("lobby", param3, "smallbutton_disabled"), (byte) -120);
            int discarded$69 = 2;
            ij.field_b.field_Jb = qg.a(cr.a("lobby", param3, "mediumbutton"), (byte) -102);
            int discarded$70 = 2;
            ij.field_b.field_Gb = qg.a(cr.a("lobby", param3, "mediumbutton_mouseover"), (byte) -105);
            int discarded$71 = 2;
            ij.field_b.field_D = qg.a(cr.a("lobby", param3, "mediumbutton_mouseheld"), (byte) -123);
            int discarded$72 = 2;
            fm.field_b.field_Jb = qg.a(cr.a("lobby", param3, "bigbutton"), (byte) -114);
            int discarded$73 = 2;
            fm.field_b.field_Gb = qg.a(cr.a("lobby", param3, "bigbutton_mouseover"), (byte) -120);
            int discarded$74 = 2;
            fm.field_b.field_D = qg.a(cr.a("lobby", param3, "bigbutton_mouseheld"), (byte) -114);
            int discarded$75 = 2;
            fm.field_b.field_Ab = qg.a(cr.a("lobby", param3, "bigbutton_disabled"), (byte) -106);
            int discarded$76 = 2;
            ok.field_d.field_Jb = qg.a(cr.a("lobby", param3, "greenbutton"), (byte) -127);
            int discarded$77 = 2;
            ok.field_d.field_Gb = qg.a(cr.a("lobby", param3, "greenbutton_mouseover"), (byte) -126);
            int discarded$78 = 2;
            ok.field_d.field_D = qg.a(cr.a("lobby", param3, "greenbutton_mouseheld"), (byte) -119);
            int discarded$79 = 2;
            ee.field_s.field_Jb = qg.a(cr.a("lobby", param3, "redbutton"), (byte) -105);
            int discarded$80 = 2;
            ee.field_s.field_Gb = qg.a(cr.a("lobby", param3, "redbutton_mouseover"), (byte) -106);
            int discarded$81 = 2;
            ee.field_s.field_D = qg.a(cr.a("lobby", param3, "redbutton_mouseheld"), (byte) -121);
            int discarded$82 = 2;
            ab.field_x.field_Jb = qg.a(cr.a("lobby", param3, "backbutton"), (byte) -127);
            int discarded$83 = 2;
            ab.field_x.field_Gb = qg.a(cr.a("lobby", param3, "backbutton_mouseover"), (byte) -103);
            int discarded$84 = 2;
            ab.field_x.field_D = qg.a(cr.a("lobby", param3, "backbutton_mouseheld"), (byte) -122);
            int discarded$85 = 2;
            ab.field_x.field_Ab = qg.a(cr.a("lobby", param3, "backbutton_disabled"), (byte) -107);
            int discarded$86 = 2;
            al.field_n.field_Jb = qg.a(cr.a("lobby", param3, "gameoptionbutton"), (byte) -115);
            int discarded$87 = 2;
            al.field_n.field_Gb = qg.a(cr.a("lobby", param3, "gameoptionbutton_mouseover"), (byte) -114);
            int discarded$88 = 2;
            jp[] dupTemp$89 = qg.a(cr.a("lobby", param3, "gameoptionbutton_active"), (byte) -112);
            al.field_n.field_pb = dupTemp$89;
            al.field_n.field_D = dupTemp$89;
            int discarded$90 = 2;
            al.field_n.field_Ab = qg.a(cr.a("lobby", param3, "gameoptionbutton_disabled"), (byte) -116);
            int discarded$91 = 2;
            im.field_d.field_Jb = qg.a(cr.a("lobby", param3, "chatbutton"), (byte) -103);
            int discarded$92 = 2;
            im.field_d.field_Gb = qg.a(cr.a("lobby", param3, "chatbutton_mouseover"), (byte) -113);
            int discarded$93 = 2;
            jp[] dupTemp$94 = qg.a(cr.a("lobby", param3, "chatbutton_active"), (byte) -125);
            im.field_d.field_pb = dupTemp$94;
            im.field_d.field_D = dupTemp$94;
            int discarded$95 = 2;
            fp.field_u.field_Jb = qg.a(cr.a("lobby", param3, "chatfilterbutton"), (byte) -119);
            int discarded$96 = 2;
            fp.field_u.field_Gb = qg.a(cr.a("lobby", param3, "chatfilterbutton_mouseover"), (byte) -106);
            int discarded$97 = 2;
            jp[] dupTemp$98 = qg.a(cr.a("lobby", param3, "chatfilterbutton_active"), (byte) -105);
            fp.field_u.field_pb = dupTemp$98;
            fp.field_u.field_D = dupTemp$98;
            int discarded$99 = 2;
            var17 = cr.a("lobby", param3, "checkbox");
            of.field_k = new ni(0L, var17[1], var17[0], 1, tk.field_t, (String) null);
            kb.field_Vb = new mh(0L, (mh) null);
            kb.field_Vb.field_Jb = jf.a(pl.a("lobby", "slideregion", (byte) -95, param3), -52);
            kb.field_Vb.field_Gb = jf.a(pl.a("lobby", "slideregion_mouseover", (byte) 104, param3), -71);
            kb.field_Vb.field_D = jf.a(pl.a("lobby", "slideregion_mouseheld", (byte) 118, param3), -86);
            kb.field_Vb.field_Ab = jf.a(pl.a("lobby", "slideregion_disabled", (byte) -47, param3), -39);
            lf.field_s = new mh(0L, (mh) null);
            int discarded$100 = 2;
            lf.field_s.field_Jb = qg.a(cr.a("lobby", param3, "dragbar"), (byte) -102);
            int discarded$101 = 2;
            lf.field_s.field_Gb = qg.a(cr.a("lobby", param3, "dragbar_mouseover"), (byte) -119);
            int discarded$102 = 2;
            lf.field_s.field_D = qg.a(cr.a("lobby", param3, "dragbar_mouseheld"), (byte) -120);
            int discarded$103 = 2;
            lf.field_s.field_Ab = qg.a(cr.a("lobby", param3, "dragbar_disabled"), (byte) -123);
            oo.field_u = new mh(0L, (mh) null);
            oo.field_u.field_wb = pl.a("lobby", "upbutton", (byte) -90, param3);
            oo.field_u.field_T = pl.a("lobby", "upbutton_mouseover", (byte) -125, param3);
            oo.field_u.field_tb = pl.a("lobby", "upbutton_mouseheld", (byte) 125, param3);
            oo.field_u.field_Hb = pl.a("lobby", "upbutton_disabled", (byte) -114, param3);
            uk.field_s = new mh(0L, (mh) null);
            uk.field_s.field_wb = pl.a("lobby", "downbutton", (byte) 99, param3);
            uk.field_s.field_T = pl.a("lobby", "downbutton_mouseover", (byte) -109, param3);
            uk.field_s.field_tb = pl.a("lobby", "downbutton_mouseheld", (byte) 97, param3);
            uk.field_s.field_Hb = pl.a("lobby", "downbutton_disabled", (byte) 104, param3);
            ic.field_c = new fj(0L, oo.field_u, uk.field_s, kb.field_Vb, lf.field_s);
            rq.field_b = new hj(0L, (mh) null, am.field_Qb, ic.field_c, uk.field_r, (String) null, (String) null);
            return;
          } else {
            var19[var7_int] = 10;
            var7_int++;
            continue L3;
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        ng.a((byte) -86, param0);
        ce.a(param0, param3, (byte) 94, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Type your age in years";
        field_b = "Message game";
        field_h = 1;
        field_e = new int[]{0, 27, 1, 5, 32, 4, 3, 22, 19, 42};
    }
}
