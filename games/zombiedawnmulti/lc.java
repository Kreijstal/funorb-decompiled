/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends br {
    private int field_h;
    static boolean[] field_m;
    private int field_j;
    private int field_f;
    private int field_p;
    static ip field_l;
    private id field_o;
    private int field_k;
    boolean field_q;
    static String field_n;
    static String field_i;
    static String field_g;

    final static ri c(byte param0) {
        if (param0 != 89) {
            ul var2 = (ul) null;
            lc.a(-40, (ul) null, (int[]) null, (ri[]) null, (ul) null);
        }
        ri var1 = new ri(ie.field_nb, hj.field_a, k.field_i[0], qj.field_o[0], oq.field_w[0], vj.field_p[0], qp.field_t[0], tp.field_t);
        fd.h((byte) 126);
        return var1;
    }

    final boolean d(byte param0) {
        this.field_p = this.field_p + 1;
        if (this.field_o != null) {
            this.field_k = this.field_o.g(109);
            this.field_j = this.field_o.h(-104) + -24;
        }
        this.field_q = 100 - 2 * this.field_p <= 0 ? true : false;
        if (param0 != 76) {
            return false;
        }
        return this.field_q;
    }

    public static void a(byte param0) {
        field_i = null;
        field_l = null;
        field_n = null;
        if (param0 != 87) {
            lc.a((byte) -116);
        }
        field_m = null;
        field_g = null;
    }

    final boolean a(int param0, nm param1) {
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if ((this.field_h ^ -1) == -256) {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 16711680) {
                  break L1;
                } else {
                  lc.c((byte) 95);
                  break L1;
                }
              }
              if (!this.field_q) {
                var3_int = 100 + -(this.field_p * 2);
                if (-1 > (var3_int ^ -1)) {
                  var4 = param1.c(this.field_k, param0 + -16731806);
                  var5 = param1.d(this.field_j, 106);
                  if (this.field_f != -1) {
                    oo.d(var4, var5, var3_int, 16711680, 70);
                    var10 = new int[64];
                    var9 = var10;
                    var6 = var9;
                    var7 = 0;
                    L2: while (true) {
                      if ((var7 ^ -1) <= -65) {
                        var7 = 3 * var3_int / 4;
                        oo.a(var4 << 1146170372, var5 << 594165412, var3_int << -1543205052, 33, var10);
                        wa.field_b[this.field_h].a(-var7 + var4, var5 + -var7, var7 * 2, var7 * 2, 40 + var3_int);
                        stackIn_18_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6[var7] = var7 * 196864;
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    oo.d(var4, var5, 50 - var3_int / 2, 12071039, var3_int);
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return true;
                }
              } else {
                throw new IllegalStateException("Why call me? I'm done!");
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("lc.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    final static void a(int param0) {
        if (param0 < 22) {
            lc.a(-37);
        }
    }

    final void a(int param0, int param1, id param2, byte param3) {
        try {
            this.a(-24 + param2.h(-76), param0, param2.g(-86), param1, (byte) 127);
            if (param3 <= 44) {
                lc.a(10);
            }
            this.field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "lc.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        this.field_p = 0;
        this.field_q = false;
        this.field_o = null;
        if (param4 < 103) {
            ul var7 = (ul) null;
            lc.a(83, (ul) null, (int[]) null, (ri[]) null, (ul) null);
        }
        this.field_k = param2;
        this.field_j = param0;
        this.field_h = param3;
        this.field_f = param1;
    }

    final static void a(int param0, ul param1, int[] param2, ri[] param3, ul param4) {
        ja[] dupTemp$0 = null;
        ja[] dupTemp$1 = null;
        ja[] dupTemp$2 = null;
        ja[] dupTemp$3 = null;
        ri[] var5 = null;
        ri[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        ri[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        ef var7 = null;
        cj var8 = null;
        cj var9 = null;
        cj var10 = null;
        cj var11 = null;
        ja[] var12 = null;
        ja[] var13 = null;
        ja[] var14 = null;
        cj var15 = null;
        ja[] var16 = null;
        ja[] var17 = null;
        var18 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var20 = da.a("crowns", param1, (byte) 19, "lobby");
              var5 = var20;
              hg.field_ub = var20.length;
              if (param3 == null) {
                break L1;
              } else {
                var6 = new ri[param3.length + hg.field_ub];
                var7_int = 0;
                L2: while (true) {
                  if (hg.field_ub <= var7_int) {
                    var5 = var6;
                    var7_int = 0;
                    L3: while (true) {
                      if (var7_int >= param3.length) {
                        break L1;
                      } else {
                        var6[var7_int + hg.field_ub] = param3[var7_int];
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
              if (hg.field_ub <= var7_int) {
                L5: {
                  if (param3 == null) {
                    break L5;
                  } else {
                    if (param2 != null) {
                      var7_int = 0;
                      L6: while (true) {
                        if (var7_int >= param3.length) {
                          break L5;
                        } else {
                          var6_array[var7_int + hg.field_ub] = param2[var7_int];
                          var7_int++;
                          continue L6;
                        }
                      }
                    } else {
                      var7_int = 0;
                      L7: while (true) {
                        if (param3.length <= var7_int) {
                          break L5;
                        } else {
                          var6_array[hg.field_ub - -var7_int] = param3[var7_int].field_a;
                          var7_int++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                jo.field_f = 2;
                jp.field_f = 11;
                nj.field_h = 4;
                jk.field_f = 15;
                ed.field_c = 2;
                var7 = pj.a(param1, 4, param4, "largefont", "lobby");
                fd.field_G = pj.a(param1, param0 + 12039, param4, "generalfont", "lobby");
                jj.field_L = pj.a(param1, 4, param4, "chatfont", "lobby");
                var7.a(var5, var24);
                fd.field_G.a(var5, var24);
                jj.field_L.a(var5, var24);
                var8 = new cj(0L, (cj) null);
                var8.field_M = 16777215;
                var8.field_J = jk.field_f;
                var8.field_yb = (fm) ((Object) var7);
                var9 = var8;
                var8.field_lb = 1;
                var9.field_R = 1;
                var10 = new cj(0L, (cj) null);
                var10.field_J = jk.field_f;
                var10.field_yb = (fm) ((Object) fd.field_G);
                var10.field_M = 16777215;
                var11 = var10;
                var10.field_lb = 1;
                var11.field_R = 1;
                ed.field_d = new cj(0L, var8);
                ed.field_d.field_ab = hc.a(pb.a("lobby", param1, -256, "heading"), param0 + 12035);
                rb.field_d = new cj(0L, (cj) null);
                rb.field_d.field_ab = el.a(120, 8421504, 0, 4210752, false, false);
                up.field_g = new cj(0L, (cj) null);
                up.field_g.field_ab = tg.a(1, 114, 6316128, 3, 6316128, 108);
                kd.field_a = new cj(0L, (cj) null);
                kd.field_a.field_ab = hc.a(pb.a("lobby", param1, param0 ^ 12285, "popup"), 0);
                var12 = hc.a(pb.a("lobby", param1, -256, "popup_mouseover"), 0);
                var13 = pb.a("lobby", param1, -256, "button");
                var14 = hc.a(pb.a("lobby", param1, -256, "tab_active"), 0);
                kc.field_c = new cj(0L, var8);
                kc.field_c.field_ab = var14;
                jf.field_a = new cj(0L, (cj) null);
                jf.field_a.field_rb = fl.a("lobby", "closebutton", param1, param0 ^ -1106);
                jf.field_a.field_K = fl.a("lobby", "closebutton_mouseover", param1, param0 + 23126);
                hd.field_x = new cj(0L, var8);
                hd.field_x.field_ab = el.a(40, 3815994, 0, 2039583, true, true);
                vd.field_a = new cj(0L, var10);
                vd.field_a.field_V = 2;
                vd.field_a.field_ab = el.a(30, 3815994, param0 + 12035, 2039583, false, true);
                al.field_fb = new cj(0L, var10);
                al.field_fb.field_V = 2;
                al.field_fb.field_ab = el.a(30, 3815994, 0, 2039583, false, false);
                pn.field_g = new cj(0L, var10);
                pn.field_g.field_V = 2;
                pn.field_g.field_ab = el.a(30, 3815994, 0, 2039583, true, false);
                vo.field_m = new cj(0L, (cj) null);
                vo.field_m.field_J = jk.field_f;
                vo.field_m.field_M = 13421772;
                vo.field_m.field_yb = (fm) ((Object) fd.field_G);
                vo.field_m.field_lb = 1;
                cm.field_b = new cj(0L, vo.field_m);
                cm.field_b.field_M = 16764006;
                cm.field_b.field_ob = 16777215;
                cm.field_b.field_Db = 16777215;
                cm.field_b.field_xb = 16777215;
                cm.field_b.field_H = 8421504;
                var15 = new cj(0L, cm.field_b);
                var15.field_J = jk.field_f;
                var15.field_M = 16777215;
                var15.field_yb = (fm) ((Object) var7);
                qc.field_u = new cj(0L, vo.field_m);
                qc.field_u.field_ab = el.a(16, 2236962, 0, 2236962, false, false);
                qc.field_u.field_V = 2;
                m.field_B = new cj(0L, vo.field_m);
                m.field_B.field_ab = el.a(16, 1513239, 0, 1513239, false, false);
                m.field_B.field_V = 2;
                wc.field_H = new cj(0L, qc.field_u);
                wc.field_H.b((byte) -32, cm.field_b);
                m.field_x = new cj(0L, m.field_B);
                m.field_x.b((byte) -32, cm.field_b);
                var16 = pb.a("lobby", param1, -256, "button_mouseover");
                ql.field_d = new sn(kd.field_a, var12, vo.field_m, cm.field_b, 3, 2, ed.field_c, 3, jk.field_f);
                ta.field_gb = new cj(0L, cm.field_b);
                ta.field_gb.field_X = var16;
                ta.field_gb.field_sb = 1;
                ta.field_gb.field_N = 1;
                ta.field_gb.field_ab = var13;
                ta.field_gb.field_P = 1;
                ta.field_gb.field_eb = 1;
                ta.field_gb.field_S = pb.a("lobby", param1, param0 ^ 12285, "button_mouseheld");
                ta.field_gb.field_gb = pb.a("lobby", param1, param0 + 11779, "button_active");
                ta.field_gb.field_Bb = pb.a("lobby", param1, -256, "button_disabled");
                ta.field_gb.field_R = 1;
                kf.field_i = new cj(0L, cm.field_b);
                kf.field_i.field_R = 1;
                kf.field_i.field_ab = hc.a(pb.a("lobby", param1, -256, "tab_inactive"), 0);
                kf.field_i.field_X = hc.a(pb.a("lobby", param1, -256, "tab_mouseover"), 0);
                kf.field_i.field_gb = var14;
                aa.field_l = new cj(0L, (cj) null);
                aa.field_l.field_ab = tg.a(-1, 206, 1127256, 3, 1856141, 32);
                cg.field_f = new cj(0L, (cj) null);
                cg.field_f.field_ab = tg.a(-1, 290, 6052956, 3, 11579568, param0 ^ -12112);
                he.field_i = new cj(0L, var15);
                he.field_i.field_sb = 1;
                he.field_i.field_P = 1;
                he.field_i.field_N = 1;
                he.field_i.field_R = 1;
                he.field_i.field_eb = 1;
                kb.field_n = new cj(0L, he.field_i);
                tj.field_b = new cj(0L, cm.field_b);
                tj.field_b.field_R = 1;
                tj.field_b.field_N = 1;
                tj.field_b.field_P = 1;
                tj.field_b.field_eb = 1;
                tj.field_b.field_sb = 1;
                fd.field_O = new cj(0L, tj.field_b);
                de.field_f = new cj(0L, tj.field_b);
                ai.field_c = new cj(0L, he.field_i);
                ra.field_j = new cj(0L, tj.field_b);
                nq.field_v = new cj(0L, tj.field_b);
                uq.field_d = new cj(0L, tj.field_b);
                tj.field_b.field_ab = hc.a(pb.a("lobby", param1, param0 + 11779, "smallbutton"), 0);
                tj.field_b.field_X = hc.a(pb.a("lobby", param1, -256, "smallbutton_mouseover"), 0);
                dupTemp$0 = hc.a(pb.a("lobby", param1, -256, "smallbutton_active"), 0);
                tj.field_b.field_gb = dupTemp$0;
                tj.field_b.field_S = dupTemp$0;
                tj.field_b.field_Bb = hc.a(pb.a("lobby", param1, -256, "smallbutton_disabled"), 0);
                kb.field_n.field_ab = hc.a(pb.a("lobby", param1, -256, "mediumbutton"), 0);
                kb.field_n.field_X = hc.a(pb.a("lobby", param1, -256, "mediumbutton_mouseover"), param0 ^ param0);
                kb.field_n.field_S = hc.a(pb.a("lobby", param1, -256, "mediumbutton_mouseheld"), 0);
                he.field_i.field_ab = hc.a(pb.a("lobby", param1, -256, "bigbutton"), 0);
                he.field_i.field_X = hc.a(pb.a("lobby", param1, -256, "bigbutton_mouseover"), 0);
                he.field_i.field_S = hc.a(pb.a("lobby", param1, -256, "bigbutton_mouseheld"), param0 ^ -12035);
                he.field_i.field_Bb = hc.a(pb.a("lobby", param1, param0 ^ 12285, "bigbutton_disabled"), param0 + 12035);
                fd.field_O.field_ab = hc.a(pb.a("lobby", param1, param0 ^ 12285, "greenbutton"), 0);
                fd.field_O.field_X = hc.a(pb.a("lobby", param1, param0 + 11779, "greenbutton_mouseover"), 0);
                fd.field_O.field_S = hc.a(pb.a("lobby", param1, param0 ^ 12285, "greenbutton_mouseheld"), 0);
                de.field_f.field_ab = hc.a(pb.a("lobby", param1, param0 + 11779, "redbutton"), 0);
                de.field_f.field_X = hc.a(pb.a("lobby", param1, -256, "redbutton_mouseover"), 0);
                de.field_f.field_S = hc.a(pb.a("lobby", param1, -256, "redbutton_mouseheld"), 0);
                ai.field_c.field_ab = hc.a(pb.a("lobby", param1, -256, "backbutton"), param0 + 12035);
                ai.field_c.field_X = hc.a(pb.a("lobby", param1, -256, "backbutton_mouseover"), 0);
                ai.field_c.field_S = hc.a(pb.a("lobby", param1, param0 + 11779, "backbutton_mouseheld"), 0);
                ai.field_c.field_Bb = hc.a(pb.a("lobby", param1, -256, "backbutton_disabled"), 0);
                uq.field_d.field_ab = hc.a(pb.a("lobby", param1, param0 + 11779, "gameoptionbutton"), param0 ^ -12035);
                uq.field_d.field_X = hc.a(pb.a("lobby", param1, param0 + 11779, "gameoptionbutton_mouseover"), 0);
                dupTemp$1 = hc.a(pb.a("lobby", param1, -256, "gameoptionbutton_active"), 0);
                uq.field_d.field_gb = dupTemp$1;
                uq.field_d.field_S = dupTemp$1;
                uq.field_d.field_Bb = hc.a(pb.a("lobby", param1, -256, "gameoptionbutton_disabled"), 0);
                ra.field_j.field_ab = hc.a(pb.a("lobby", param1, param0 + 11779, "chatbutton"), 0);
                ra.field_j.field_X = hc.a(pb.a("lobby", param1, -256, "chatbutton_mouseover"), 0);
                dupTemp$2 = hc.a(pb.a("lobby", param1, param0 + 11779, "chatbutton_active"), param0 ^ -12035);
                ra.field_j.field_gb = dupTemp$2;
                ra.field_j.field_S = dupTemp$2;
                nq.field_v.field_ab = hc.a(pb.a("lobby", param1, -256, "chatfilterbutton"), 0);
                nq.field_v.field_X = hc.a(pb.a("lobby", param1, param0 + 11779, "chatfilterbutton_mouseover"), 0);
                dupTemp$3 = hc.a(pb.a("lobby", param1, -256, "chatfilterbutton_active"), 0);
                nq.field_v.field_gb = dupTemp$3;
                nq.field_v.field_S = dupTemp$3;
                var17 = pb.a("lobby", param1, -256, "checkbox");
                jk.field_h = new mi(0L, var17[1], var17[0], 1, cm.field_b, (String) null);
                po.field_k = new cj(0L, (cj) null);
                po.field_k.field_ab = ae.a(fl.a("lobby", "slideregion", param1, param0 + 23126), 27117);
                po.field_k.field_X = ae.a(fl.a("lobby", "slideregion_mouseover", param1, 11091), 27117);
                po.field_k.field_S = ae.a(fl.a("lobby", "slideregion_mouseheld", param1, 11091), 27117);
                po.field_k.field_Bb = ae.a(fl.a("lobby", "slideregion_disabled", param1, 11091), 27117);
                qq.field_c = new cj(0L, (cj) null);
                qq.field_c.field_ab = hc.a(pb.a("lobby", param1, -256, "dragbar"), 0);
                qq.field_c.field_X = hc.a(pb.a("lobby", param1, -256, "dragbar_mouseover"), 0);
                qq.field_c.field_S = hc.a(pb.a("lobby", param1, -256, "dragbar_mouseheld"), param0 + 12035);
                qq.field_c.field_Bb = hc.a(pb.a("lobby", param1, -256, "dragbar_disabled"), param0 ^ -12035);
                mj.field_Mb = new cj(0L, (cj) null);
                mj.field_Mb.field_rb = fl.a("lobby", "upbutton", param1, 11091);
                mj.field_Mb.field_K = fl.a("lobby", "upbutton_mouseover", param1, 11091);
                mj.field_Mb.field_nb = fl.a("lobby", "upbutton_mouseheld", param1, 11091);
                mj.field_Mb.field_cb = fl.a("lobby", "upbutton_disabled", param1, 11091);
                qq.field_b = new cj(0L, (cj) null);
                qq.field_b.field_rb = fl.a("lobby", "downbutton", param1, 11091);
                qq.field_b.field_K = fl.a("lobby", "downbutton_mouseover", param1, 11091);
                qq.field_b.field_nb = fl.a("lobby", "downbutton_mouseheld", param1, 11091);
                qq.field_b.field_cb = fl.a("lobby", "downbutton_disabled", param1, 11091);
                td.field_f = new hi(0L, mj.field_Mb, qq.field_b, po.field_k, qq.field_c);
                oj.field_Q = new cd(0L, (cj) null, nc.field_e, td.field_f, tj.field_b, (String) null, (String) null);
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
            stackIn_23_0 = (RuntimeException) (var5_ref);

            stackIn_23_1 = new StringBuilder().append("lc.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param4 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_33_2 + ')');
        }
    }

    public lc() {
    }

    static {
        field_m = new boolean[112];
        field_l = new ip();
        field_n = "From <%0>: ";
        field_g = "Reload game";
        field_i = "Prepared";
    }
}
