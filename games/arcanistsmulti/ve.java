/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ve extends tf {
    volatile boolean field_p;
    static vn field_o;
    boolean field_n;
    boolean field_q;
    static qb[] field_t;
    static String field_r;
    static String field_s;
    static int field_m;

    final static void a(int param0, eg param1, int[] param2, ll[] param3, eg param4) {
        ll[] var5 = null;
        ll[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        lg var7 = null;
        kc var8 = null;
        kc var9 = null;
        kc var10 = null;
        kc var11 = null;
        qb[] var12 = null;
        qb[] var13 = null;
        qb[] var14 = null;
        kc var15 = null;
        qb[] var16 = null;
        qb[] var17 = null;
        int var18 = 0;
        ll[] stackIn_11_0 = null;
        ll[] stackIn_14_0 = null;
        ll[] stackOut_10_0 = null;
        ll[] stackOut_13_0 = null;
        L0: {
          L1: {
            var18 = ArcanistsMulti.field_G ? 1 : 0;
            var5 = pk.a("lobby", 0, "crowns", param1);
            dg.field_u = var5.length;
            if (null != param3) {
              var6 = new ll[param3.length + dg.field_u];
              var7_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var7_int >= dg.field_u) {
                      break L4;
                    } else {
                      var6[var7_int] = var5[var7_int];
                      var7_int++;
                      if (var18 != 0) {
                        break L3;
                      } else {
                        if (var18 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var5 = var6;
                  break L3;
                }
                var7_int = 0;
                L5: while (true) {
                  if (~var7_int <= ~param3.length) {
                    break L1;
                  } else {
                    stackOut_10_0 = (ll[]) var6;
                    stackIn_14_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      stackIn_11_0[var7_int + dg.field_u] = param3[var7_int];
                      var7_int++;
                      if (var18 == 0) {
                        continue L5;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          stackOut_13_0 = (ll[]) var5;
          stackIn_14_0 = stackOut_13_0;
          break L0;
        }
        var6_array = new int[stackIn_14_0.length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              L9: {
                L10: {
                  if (dg.field_u <= var7_int) {
                    break L10;
                  } else {
                    var6_array[var7_int] = 10;
                    var7_int++;
                    if (var18 != 0) {
                      break L9;
                    } else {
                      if (var18 == 0) {
                        continue L6;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                if (null != param3) {
                  break L9;
                } else {
                  break L8;
                }
              }
              L11: {
                if (param2 == null) {
                  break L11;
                } else {
                  var7_int = 0;
                  L12: while (true) {
                    L13: {
                      if (~var7_int <= ~param3.length) {
                        break L13;
                      } else {
                        var6_array[var7_int + dg.field_u] = param2[var7_int];
                        var7_int++;
                        if (var18 != 0) {
                          break L7;
                        } else {
                          if (var18 == 0) {
                            continue L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    if (var18 == 0) {
                      break L8;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              var7_int = 0;
              L14: while (true) {
                if (var7_int >= param3.length) {
                  break L8;
                } else {
                  var6_array[var7_int + dg.field_u] = param3[var7_int].field_k;
                  var7_int++;
                  if (var18 != 0) {
                    break L7;
                  } else {
                    if (var18 == 0) {
                      continue L14;
                    } else {
                      break L8;
                    }
                  }
                }
              }
            }
            ga.field_r = 15;
            dh.field_Gb = 4;
            mm.field_p = 2;
            oc.field_i = 11;
            ra.field_h = 2;
            break L7;
          }
          var7 = rc.a(param4, -24755, "lobby", "largefont", param1);
          ea.field_w = rc.a(param4, param0 + -24755, "lobby", "generalfont", param1);
          th.field_k = rc.a(param4, -24755, "lobby", "chatfont", param1);
          var7.a((s[]) (Object) var5, var6_array);
          ea.field_w.a((s[]) (Object) var5, var6_array);
          th.field_k.a((s[]) (Object) var5, var6_array);
          var8 = new kc(0L, (kc) null);
          var8.field_z = ga.field_r;
          var8.field_ob = 16777215;
          var8.field_Z = (dj) (Object) var7;
          var8.field_gb = 1;
          var9 = var8;
          var9.field_X = 1;
          var10 = new kc(0L, (kc) null);
          var10.field_Z = (dj) (Object) ea.field_w;
          var10.field_ob = 16777215;
          var10.field_z = ga.field_r;
          var11 = var10;
          var10.field_gb = 1;
          var11.field_X = 1;
          wa.field_Pb = new kc(0L, var8);
          wa.field_Pb.field_v = ic.a(qe.a(param1, "heading", "lobby", 66), (byte) -86);
          md.field_b = new kc(0L, (kc) null);
          md.field_b.field_v = rb.a(false, false, param0 ^ 652, 4210752, 8421504, 120);
          hh.field_c = new kc(0L, (kc) null);
          hh.field_c.field_v = of.a(3, 114, 1, 1, 6316128, 6316128);
          ck.field_a = new kc(0L, (kc) null);
          ck.field_a.field_v = ic.a(qe.a(param1, "popup", "lobby", 69), (byte) -105);
          var12 = ic.a(qe.a(param1, "popup_mouseover", "lobby", param0 ^ 93), (byte) -105);
          var13 = qe.a(param1, "button", "lobby", 63);
          var14 = ic.a(qe.a(param1, "tab_active", "lobby", 110), (byte) -85);
          be.field_l = new kc(0L, var8);
          be.field_l.field_v = var14;
          wj.field_b = new kc(0L, (kc) null);
          wj.field_b.field_W = fj.a("lobby", -22612, param1, "closebutton");
          wj.field_b.field_lb = fj.a("lobby", -22612, param1, "closebutton_mouseover");
          dd.field_b = new kc(0L, var8);
          dd.field_b.field_v = rb.a(true, true, 652, 2039583, 3815994, 40);
          vf.field_u = new kc(0L, var10);
          vf.field_u.field_t = 2;
          vf.field_u.field_v = rb.a(true, false, 652, 2039583, 3815994, 30);
          rn.field_S = new kc(0L, var10);
          rn.field_S.field_t = 2;
          rn.field_S.field_v = rb.a(false, false, param0 ^ 652, 2039583, 3815994, 30);
          vf.field_i = new kc((long)param0, var10);
          vf.field_i.field_t = 2;
          vf.field_i.field_v = rb.a(false, true, 652, 2039583, 3815994, 30);
          pg.field_c = new kc(0L, (kc) null);
          pg.field_c.field_ob = 13421772;
          pg.field_c.field_Z = (dj) (Object) ea.field_w;
          pg.field_c.field_z = ga.field_r;
          pg.field_c.field_gb = 1;
          nj.field_d = new kc(0L, pg.field_c);
          nj.field_d.field_zb = 16777215;
          nj.field_d.field_eb = 16777215;
          nj.field_d.field_J = 16777215;
          nj.field_d.field_ob = 16764006;
          nj.field_d.field_sb = 8421504;
          var15 = new kc(0L, nj.field_d);
          var15.field_z = ga.field_r;
          var15.field_Z = (dj) (Object) var7;
          var15.field_ob = 16777215;
          j.field_f = new kc(0L, pg.field_c);
          j.field_f.field_v = rb.a(false, false, 652, 2236962, 2236962, 16);
          j.field_f.field_t = 2;
          mi.field_A = new kc(0L, pg.field_c);
          mi.field_A.field_v = rb.a(false, false, 652, 1513239, 1513239, 16);
          mi.field_A.field_t = 2;
          le.field_E = new kc(0L, j.field_f);
          le.field_E.a(nj.field_d, (byte) 118);
          qa.field_j = new kc(0L, mi.field_A);
          qa.field_j.a(nj.field_d, (byte) 119);
          var16 = qe.a(param1, "button_mouseover", "lobby", param0 + 91);
          ml.field_H = new pe(ck.field_a, var12, pg.field_c, nj.field_d, 3, 2, mm.field_p, 3, ga.field_r);
          rn.field_L = new kc(0L, nj.field_d);
          rn.field_L.field_Y = 1;
          rn.field_L.field_wb = 1;
          rn.field_L.field_v = var13;
          rn.field_L.field_S = 1;
          rn.field_L.field_ib = 1;
          rn.field_L.field_Ab = var16;
          rn.field_L.field_xb = qe.a(param1, "button_mouseheld", "lobby", 89);
          rn.field_L.field_hb = qe.a(param1, "button_active", "lobby", param0 + 62);
          rn.field_L.field_K = qe.a(param1, "button_disabled", "lobby", 117);
          rn.field_L.field_X = 1;
          ub.field_c = new kc(0L, nj.field_d);
          ub.field_c.field_X = 1;
          ub.field_c.field_v = ic.a(qe.a(param1, "tab_inactive", "lobby", 52), (byte) -124);
          ub.field_c.field_Ab = ic.a(qe.a(param1, "tab_mouseover", "lobby", 50), (byte) -99);
          ub.field_c.field_hb = var14;
          mn.field_t = new kc(0L, (kc) null);
          mn.field_t.field_v = of.a(3, 206, param0 + 1, -1, 1856141, 1127256);
          ia.field_a = new kc(0L, (kc) null);
          ia.field_a.field_v = of.a(3, 290, 1, -1, 11579568, 6052956);
          ko.field_h = new kc(0L, var15);
          ko.field_h.field_S = 1;
          ko.field_h.field_Y = 1;
          ko.field_h.field_wb = 1;
          ko.field_h.field_ib = 1;
          ko.field_h.field_X = 1;
          gn.field_c = new kc(0L, ko.field_h);
          hg.field_d = new kc(0L, nj.field_d);
          hg.field_d.field_ib = 1;
          hg.field_d.field_S = 1;
          hg.field_d.field_Y = 1;
          hg.field_d.field_X = 1;
          hg.field_d.field_wb = 1;
          ml.field_V = new kc(0L, hg.field_d);
          sl.field_S = new kc(0L, hg.field_d);
          th.field_c = new kc(0L, ko.field_h);
          ml.field_S = new kc(0L, hg.field_d);
          hh.field_d = new kc(0L, hg.field_d);
          nf.field_j = new kc(0L, hg.field_d);
          hg.field_d.field_v = ic.a(qe.a(param1, "smallbutton", "lobby", param0 + 45), (byte) -86);
          hg.field_d.field_Ab = ic.a(qe.a(param1, "smallbutton_mouseover", "lobby", param0 ^ 107), (byte) -94);
          qb[] dupTemp$4 = ic.a(qe.a(param1, "smallbutton_active", "lobby", 90), (byte) -104);
          hg.field_d.field_hb = dupTemp$4;
          hg.field_d.field_xb = dupTemp$4;
          hg.field_d.field_K = ic.a(qe.a(param1, "smallbutton_disabled", "lobby", 127), (byte) -117);
          gn.field_c.field_v = ic.a(qe.a(param1, "mediumbutton", "lobby", 57), (byte) -83);
          gn.field_c.field_Ab = ic.a(qe.a(param1, "mediumbutton_mouseover", "lobby", 89), (byte) -76);
          gn.field_c.field_xb = ic.a(qe.a(param1, "mediumbutton_mouseheld", "lobby", param0 + 44), (byte) -73);
          ko.field_h.field_v = ic.a(qe.a(param1, "bigbutton", "lobby", 106), (byte) -121);
          ko.field_h.field_Ab = ic.a(qe.a(param1, "bigbutton_mouseover", "lobby", 124), (byte) -95);
          ko.field_h.field_xb = ic.a(qe.a(param1, "bigbutton_mouseheld", "lobby", 61), (byte) -107);
          ko.field_h.field_K = ic.a(qe.a(param1, "bigbutton_disabled", "lobby", 112), (byte) -87);
          ml.field_V.field_v = ic.a(qe.a(param1, "greenbutton", "lobby", 94), (byte) -78);
          ml.field_V.field_Ab = ic.a(qe.a(param1, "greenbutton_mouseover", "lobby", 43), (byte) -79);
          ml.field_V.field_xb = ic.a(qe.a(param1, "greenbutton_mouseheld", "lobby", param0 ^ 50), (byte) -118);
          sl.field_S.field_v = ic.a(qe.a(param1, "redbutton", "lobby", 55), (byte) -93);
          sl.field_S.field_Ab = ic.a(qe.a(param1, "redbutton_mouseover", "lobby", 86), (byte) -109);
          sl.field_S.field_xb = ic.a(qe.a(param1, "redbutton_mouseheld", "lobby", 44), (byte) -115);
          th.field_c.field_v = ic.a(qe.a(param1, "backbutton", "lobby", param0 + 107), (byte) -82);
          th.field_c.field_Ab = ic.a(qe.a(param1, "backbutton_mouseover", "lobby", param0 ^ 107), (byte) -128);
          th.field_c.field_xb = ic.a(qe.a(param1, "backbutton_mouseheld", "lobby", 76), (byte) -102);
          th.field_c.field_K = ic.a(qe.a(param1, "backbutton_disabled", "lobby", 70), (byte) -113);
          nf.field_j.field_v = ic.a(qe.a(param1, "gameoptionbutton", "lobby", 84), (byte) -128);
          nf.field_j.field_Ab = ic.a(qe.a(param1, "gameoptionbutton_mouseover", "lobby", param0 + 67), (byte) -83);
          qb[] dupTemp$5 = ic.a(qe.a(param1, "gameoptionbutton_active", "lobby", 100), (byte) -93);
          nf.field_j.field_hb = dupTemp$5;
          nf.field_j.field_xb = dupTemp$5;
          nf.field_j.field_K = ic.a(qe.a(param1, "gameoptionbutton_disabled", "lobby", 93), (byte) -114);
          ml.field_S.field_v = ic.a(qe.a(param1, "chatbutton", "lobby", 120), (byte) -112);
          ml.field_S.field_Ab = ic.a(qe.a(param1, "chatbutton_mouseover", "lobby", param0 ^ 94), (byte) -115);
          qb[] dupTemp$6 = ic.a(qe.a(param1, "chatbutton_active", "lobby", 104), (byte) -128);
          ml.field_S.field_hb = dupTemp$6;
          ml.field_S.field_xb = dupTemp$6;
          hh.field_d.field_v = ic.a(qe.a(param1, "chatfilterbutton", "lobby", param0 ^ 127), (byte) -79);
          hh.field_d.field_Ab = ic.a(qe.a(param1, "chatfilterbutton_mouseover", "lobby", 47), (byte) -105);
          qb[] dupTemp$7 = ic.a(qe.a(param1, "chatfilterbutton_active", "lobby", 49), (byte) -100);
          hh.field_d.field_hb = dupTemp$7;
          hh.field_d.field_xb = dupTemp$7;
          var17 = qe.a(param1, "checkbox", "lobby", 63);
          ec.field_g = new af(0L, var17[1], var17[0], 1, nj.field_d, (String) null);
          qe.field_m = new kc(0L, (kc) null);
          qe.field_m.field_v = pm.a(115, fj.a("lobby", -22612, param1, "slideregion"));
          qe.field_m.field_Ab = pm.a(82, fj.a("lobby", param0 ^ -22612, param1, "slideregion_mouseover"));
          qe.field_m.field_xb = pm.a(param0 + 77, fj.a("lobby", -22612, param1, "slideregion_mouseheld"));
          qe.field_m.field_K = pm.a(53, fj.a("lobby", param0 + -22612, param1, "slideregion_disabled"));
          be.field_b = new kc(0L, (kc) null);
          be.field_b.field_v = ic.a(qe.a(param1, "dragbar", "lobby", 113), (byte) -109);
          be.field_b.field_Ab = ic.a(qe.a(param1, "dragbar_mouseover", "lobby", 85), (byte) -120);
          be.field_b.field_xb = ic.a(qe.a(param1, "dragbar_mouseheld", "lobby", 73), (byte) -84);
          be.field_b.field_K = ic.a(qe.a(param1, "dragbar_disabled", "lobby", 64), (byte) -102);
          pi.field_d = new kc(0L, (kc) null);
          pi.field_d.field_W = fj.a("lobby", -22612, param1, "upbutton");
          pi.field_d.field_lb = fj.a("lobby", param0 + -22612, param1, "upbutton_mouseover");
          pi.field_d.field_vb = fj.a("lobby", -22612, param1, "upbutton_mouseheld");
          pi.field_d.field_R = fj.a("lobby", -22612, param1, "upbutton_disabled");
          db.field_b = new kc(0L, (kc) null);
          db.field_b.field_W = fj.a("lobby", -22612, param1, "downbutton");
          db.field_b.field_lb = fj.a("lobby", -22612, param1, "downbutton_mouseover");
          db.field_b.field_vb = fj.a("lobby", -22612, param1, "downbutton_mouseheld");
          db.field_b.field_R = fj.a("lobby", -22612, param1, "downbutton_disabled");
          vn.field_i = new in(0L, pi.field_d, db.field_b, qe.field_m, be.field_b);
          oh.field_r = new hb(0L, (kc) null, am.field_c, vn.field_i, hg.field_d, (String) null, (String) null);
          return;
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, dl param4, int param5, int param6, int param7, String param8) {
        RuntimeException var9 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              ed.field_Hb = param2;
              ri.field_g = param4;
              hd.field_a = param6;
              ne.field_b = param5;
              ib.field_u = param1;
              ce.field_o = param7;
              qe.field_h = param3;
              if (param0 <= -55) {
                break L1;
              } else {
                ve.d(116);
                break L1;
              }
            }
            jd.field_g = param8;
            jl.field_c = (lk) (Object) new ef();
            ed.field_yb = new pa(param4);
            mk.field_O = new gk(jl.field_c, ed.field_yb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var9;
            stackOut_5_1 = new StringBuilder().append("ve.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param8 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    abstract int e(byte param0);

    abstract byte[] c(int param0);

    public static void d(int param0) {
        field_s = null;
        field_t = null;
        field_r = null;
        if (param0 != 2039583) {
            return;
        }
        try {
            field_o = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ve.D(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, byte param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == db.field_a) {
                break L1;
              } else {
                var3_int = db.field_a.c(param1, (byte) 33);
                if (var3_int == -2) {
                  break L1;
                } else {
                  L2: {
                    if (var3_int != -1) {
                      var4 = db.field_a.h((byte) 122) ? 1 : 0;
                      fn.a(118, var4 != 0, db.field_a.f((byte) 51), db.field_a.field_Fb, var3_int, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  db.field_a = null;
                  oc.a(false);
                  break L1;
                }
              }
            }
            var3_int = 66 / ((param2 - -32) / 62);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "ve.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    ve() {
        ((ve) this).field_p = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new vn();
        field_s = "<shad><col=<%0>>FLAME</col></shad>";
        field_r = "Offensive account name";
        field_m = -1;
    }
}
