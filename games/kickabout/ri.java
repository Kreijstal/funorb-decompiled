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
        nl stackIn_16_0 = null;
        nl stackIn_17_0 = null;
        nl stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nl stackOut_15_0 = null;
        nl stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        nl stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var15 = Kickabout.field_G;
        try {
          L0: {
            var16 = param2.field_P[param3][param1];
            if (-1 != (var16.field_u ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var5 = 255 & 19 * ((1 + param3) * (1 + param1)) + param2.field_J;
                if (param0 == -93) {
                  break L1;
                } else {
                  ri.a(113, false, true, 5);
                  break L1;
                }
              }
              L2: {
                var6 = var16.f(param0 + -7);
                var7 = var16.a(true);
                var8 = param2.field_V.a(true);
                var9 = param2.field_V.c(879306160);
                if (-1 != (var5 & (1 << var16.field_I) - 1 ^ -1)) {
                  L3: {
                    if ((1 & var16.field_G) == 0) {
                      break L3;
                    } else {
                      if (88080384 <= var16.field_w) {
                        var16.field_G = var16.field_G & -2;
                        var16.field_G = var16.field_G | 4;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if ((4 & var16.field_G) == 0) {
                      break L4;
                    } else {
                      if (var16.field_w > 0) {
                        break L4;
                      } else {
                        var16.field_G = var16.field_G & -5;
                        var16.field_G = var16.field_G | 1;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (0 == (8 & var16.field_G)) {
                      break L5;
                    } else {
                      if (58720256 <= var16.field_M) {
                        var16.field_G = var16.field_G & -9;
                        var16.field_G = var16.field_G | 2;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if ((var16.field_G & 2) == 0) {
                    break L2;
                  } else {
                    if (var16.field_M <= 0) {
                      var16.field_G = var16.field_G & -3;
                      var16.field_G = var16.field_G | 8;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  L6: {
                    gt.a(param1, param3, (byte) 103, param2.field_r[param3]);
                    var10 = var6 + -ge.field_m[0];
                    var11 = -ge.field_m[1] + var7;
                    var12 = 24;
                    var13 = 24;
                    if ((10 & var16.field_G) == 0) {
                      var12 = var12 << 1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((5 & var16.field_G) == 0) {
                      var13 = var13 << 1;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (Math.abs(var10) > var12) {
                      break L8;
                    } else {
                      if (Math.abs(var11) > var13) {
                        break L8;
                      } else {
                        L9: {
                          stackOut_15_0 = (nl) (var16);
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_16_0 = stackOut_15_0;
                          if (-1 == (var16.field_G ^ -1)) {
                            stackOut_17_0 = (nl) ((Object) stackIn_17_0);
                            stackOut_17_1 = 5;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            break L9;
                          } else {
                            stackOut_16_0 = (nl) ((Object) stackIn_16_0);
                            stackOut_16_1 = 7;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            break L9;
                          }
                        }
                        stackIn_18_0.field_I = stackIn_18_1;
                        var16.field_G = 0;
                        break L2;
                      }
                    }
                  }
                  L10: {
                    var14 = 0;
                    if (var12 >= var10) {
                      break L10;
                    } else {
                      var14 = var14 | 2;
                      break L10;
                    }
                  }
                  L11: {
                    if (var10 < -var12) {
                      var14 = var14 | 8;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var13 < var11) {
                      var14 = var14 | 4;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (-var13 > var11) {
                      var14 = var14 | 1;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (var16.field_G != var14) {
                      var16.field_I = 1;
                      break L14;
                    } else {
                      if ((var16.field_I ^ -1) <= -5) {
                        break L14;
                      } else {
                        if (var16.field_G == var14) {
                          var16.field_I = var16.field_I + 1;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  var16.field_G = var14;
                  break L2;
                }
              }
              L15: {
                if (-1 != (var16.field_G ^ -1)) {
                  break L15;
                } else {
                  if (0 != var16.field_u) {
                    break L15;
                  } else {
                    if (var5 % 10 != 0) {
                      break L15;
                    } else {
                      var16.a(uv.a(true, -var7 + var9, -var6 + var8), 26214);
                      break L15;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var4 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var4);
            stackOut_57_1 = new StringBuilder().append("ri.A(").append(param0).append(',').append(param1).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param2 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L16;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L16;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(sj param0, int[] param1, int param2, kg[] param3, sj param4) {
        ut[] dupTemp$4 = null;
        ut[] dupTemp$5 = null;
        ut[] dupTemp$6 = null;
        ut[] dupTemp$7 = null;
        RuntimeException var5 = null;
        kg[] var5_array = null;
        kg[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
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
        int var18 = 0;
        nu var19 = null;
        int[] var20 = null;
        kg[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var18 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var21 = jo.a(param4, 17369, "lobby", "crowns");
                var5_array = var21;
                bk.field_e = var21.length;
                if (param3 != null) {
                  var6 = new kg[param3.length + bk.field_e];
                  var7_int = 0;
                  L3: while (true) {
                    if (var7_int >= bk.field_e) {
                      var5_array = var6;
                      var7_int = 0;
                      L4: while (true) {
                        if (param3.length <= var7_int) {
                          var24 = new int[var5_array.length];
                          var22 = var24;
                          var20 = var22;
                          var25 = var20;
                          var23 = var25;
                          var6_array = var23;
                          var7_int = 0;
                          break L2;
                        } else {
                          var6[var7_int + bk.field_e] = param3[var7_int];
                          var7_int++;
                          continue L4;
                        }
                      }
                    } else {
                      var6[var7_int] = var21[var7_int];
                      var7_int++;
                      continue L3;
                    }
                  }
                } else {
                  var24 = new int[var5_array.length];
                  var22 = var24;
                  var20 = var22;
                  var25 = var20;
                  var23 = var25;
                  var6_array = var23;
                  var7_int = 0;
                  if (bk.field_e <= var7_int) {
                    break L1;
                  } else {
                    var24[var7_int] = 10;
                    var7_int++;
                    break L2;
                  }
                }
              }
              L5: while (true) {
                if (bk.field_e <= var7_int) {
                  break L1;
                } else {
                  param1[var7_int] = 10;
                  var7_int++;
                  continue L5;
                }
              }
            }
            L6: {
              if (param3 == null) {
                break L6;
              } else {
                if (param1 != null) {
                  var7_int = 0;
                  L7: while (true) {
                    if (param3.length <= var7_int) {
                      break L6;
                    } else {
                      var6_array[var7_int + bk.field_e] = param1[var7_int];
                      var7_int++;
                      continue L7;
                    }
                  }
                } else {
                  var7_int = 0;
                  L8: while (true) {
                    if (var7_int >= param3.length) {
                      break L6;
                    } else {
                      var6_array[var7_int + bk.field_e] = param3[var7_int].field_a;
                      var7_int++;
                      continue L8;
                    }
                  }
                }
              }
            }
            L9: {
              sh.field_c = 15;
              eb.field_b = 4;
              ig.field_c = 11;
              el.field_I = 2;
              mj.field_b = 2;
              var7 = qk.a("largefont", param0, 75, "lobby", param4);
              rq.field_E = qk.a("generalfont", param0, 87, "lobby", param4);
              jw.field_Ab = qk.a("chatfont", param0, 112, "lobby", param4);
              var7.a(var5_array, var25);
              rq.field_E.a(var5_array, var25);
              jw.field_Ab.a(var5_array, var25);
              var8 = new hd(0L, (hd) null);
              var8.field_y = 16777215;
              var8.field_X = (hu) ((Object) var7);
              var8.field_xb = sh.field_c;
              var8.field_p = 1;
              var9 = var8;
              var9.field_A = 1;
              var10 = new hd(0L, (hd) null);
              var10.field_y = 16777215;
              if (param2 <= -51) {
                break L9;
              } else {
                var19 = (nu) null;
                ri.a((byte) -76, -14, (nu) null, 71);
                break L9;
              }
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
            dupTemp$4 = bs.a(se.a(param4, -128, "lobby", "smallbutton_active"), (byte) -124);
            um.field_d.field_u = dupTemp$4;
            um.field_d.field_rb = dupTemp$4;
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
            dupTemp$5 = bs.a(se.a(param4, -124, "lobby", "gameoptionbutton_active"), (byte) -121);
            k.field_f.field_u = dupTemp$5;
            k.field_f.field_rb = dupTemp$5;
            k.field_f.field_tb = bs.a(se.a(param4, 63, "lobby", "gameoptionbutton_disabled"), (byte) -109);
            kn.field_F.field_R = bs.a(se.a(param4, 31, "lobby", "chatbutton"), (byte) -113);
            kn.field_F.field_S = bs.a(se.a(param4, -127, "lobby", "chatbutton_mouseover"), (byte) 74);
            dupTemp$6 = bs.a(se.a(param4, 11, "lobby", "chatbutton_active"), (byte) -124);
            kn.field_F.field_u = dupTemp$6;
            kn.field_F.field_rb = dupTemp$6;
            nj.field_d.field_R = bs.a(se.a(param4, -123, "lobby", "chatfilterbutton"), (byte) 9);
            nj.field_d.field_S = bs.a(se.a(param4, -127, "lobby", "chatfilterbutton_mouseover"), (byte) 33);
            dupTemp$7 = bs.a(se.a(param4, -123, "lobby", "chatfilterbutton_active"), (byte) -121);
            nj.field_d.field_u = dupTemp$7;
            nj.field_d.field_rb = dupTemp$7;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var5);
            stackOut_25_1 = new StringBuilder().append("ri.C(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          L12: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          L13: {
            stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param4 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L13;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L13;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
    }

    final static ot a(ot param0, boolean param1) {
        String discarded$1 = null;
        RuntimeException var2 = null;
        int var3_int = 0;
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
        ot stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ot stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var10 = new ut(param0.field_o, param0.field_v);
            var12 = var10;
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= var12.field_y.length) {
                var3 = new ot(param0.field_o, param0.field_v);
                iw.a(-54, var3);
                on.a(0, 0, on.field_g, on.field_f, 6710886);
                var4 = 2;
                L2: while (true) {
                  if (10 <= var4) {
                    L3: {
                      ta.e(125);
                      if (param1) {
                        break L3;
                      } else {
                        var9 = (CharSequence) null;
                        discarded$1 = ri.a((CharSequence) null, (byte) 122);
                        break L3;
                      }
                    }
                    var11 = 0;
                    var4 = var11;
                    L4: while (true) {
                      if (var3.field_y.length <= var11) {
                        stackOut_14_0 = (ot) (var3);
                        stackIn_15_0 = stackOut_14_0;
                        break L0;
                      } else {
                        var3.field_y[var11] = hf.a(qj.b(var3.field_y[var11], 16777215), qj.b(param0.field_y[var11], -16777216));
                        var11++;
                        continue L4;
                      }
                    }
                  } else {
                    var5 = (-var4 + 12 << -1436849369) / 13;
                    var6 = param0.field_o + -var4;
                    var7 = var4 / 4 + var4;
                    var12.c(var7, var4 / 5 + var7, var6, var6, 65793 * var5);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                L5: {
                  if (-171 <= (param0.field_y[var3_int] >>> 1222392632 ^ -1)) {
                    break L5;
                  } else {
                    var10.field_y[var3_int] = 8947848;
                    break L5;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("ri.E(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        try {
            if (param1) {
                kj.a(12105912, param2 - -param3.field_g, param3.field_t + param4, param3.field_i, param3.field_n);
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
        RuntimeException var4 = null;
        int var4_int = 0;
        hd var5 = null;
        hd var6 = null;
        hd var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        String var10 = null;
        int var11 = 0;
        int var12_int = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        int stackIn_10_0 = 0;
        hd stackIn_22_0 = null;
        hd stackIn_23_0 = null;
        hd stackIn_24_0 = null;
        String stackIn_24_1 = null;
        hd stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        hd stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        hd stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        String stackIn_27_2 = null;
        String stackIn_54_0 = null;
        hd stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        hd stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        hd stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        hd stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        hd stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        hd stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        hd stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        hd stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        hd stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        hd stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        hd stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        hd stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        hd stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        hd stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        hd stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        String stackOut_53_0 = null;
        String stackOut_52_0 = null;
        hd stackOut_21_0 = null;
        hd stackOut_23_0 = null;
        String stackOut_23_1 = null;
        hd stackOut_22_0 = null;
        String stackOut_22_1 = null;
        hd stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        hd stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        String stackOut_26_2 = null;
        hd stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        String stackOut_25_2 = null;
        hd stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        hd stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        hd stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        hd stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        hd stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        hd stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        hd stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        hd stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        hd stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        hd stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        hd stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        hd stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        hd stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        hd stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        hd stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        var13 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var4_int = -109 / ((-55 - param0) / 60);
              dw.a(127, fj.field_a);
              if (null == ow.field_b) {
                break L1;
              } else {
                L2: {
                  L3: {
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
                    if ((rn.field_d.length ^ -1) != -2) {
                      break L3;
                    } else {
                      if ((rn.field_d[0] ^ -1) != -3) {
                        break L3;
                      } else {
                        var9 = 0;
                        break L2;
                      }
                    }
                  }
                  var9 = 0;
                  var10_int = 0;
                  var11 = 0;
                  L4: while (true) {
                    L5: {
                      if (var11 >= rn.field_d.length) {
                        break L5;
                      } else {
                        L6: {
                          if (-1 == (er.field_h[var11 / 8] & 1 << (var11 & 7) ^ -1)) {
                            stackOut_9_0 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            break L6;
                          } else {
                            stackOut_8_0 = 1;
                            stackIn_10_0 = stackOut_8_0;
                            break L6;
                          }
                        }
                        L7: {
                          var12_int = stackIn_10_0;
                          if (var12_int == 0) {
                            break L7;
                          } else {
                            var10_int++;
                            break L7;
                          }
                        }
                        L8: {
                          if (var12_int == 0) {
                            break L8;
                          } else {
                            if (-3 != (rn.field_d[var11] ^ -1)) {
                              var9 = 1;
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var11++;
                        continue L4;
                      }
                    }
                    if (-1 == (var10_int ^ -1)) {
                      var9 = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                ua.field_k.field_lb = true;
                if (hw.field_k) {
                  L9: {
                    ac.field_b.field_lb = false;
                    w.field_e.field_E = qr.field_c;
                    if (var9 == 0) {
                      stackOut_53_0 = ea.field_g;
                      stackIn_54_0 = stackOut_53_0;
                      break L9;
                    } else {
                      stackOut_52_0 = rl.field_s;
                      stackIn_54_0 = stackOut_52_0;
                      break L9;
                    }
                  }
                  L10: {
                    var15 = stackIn_54_0;
                    var10 = var15;
                    var10 = var15;
                    var10 = var15;
                    var11 = nv.field_F.field_X.a(var15) + nv.field_F.field_X.a('.') * 3;
                    if (16 != (de.field_c & 48)) {
                      break L10;
                    } else {
                      var10 = var15 + ".";
                      break L10;
                    }
                  }
                  L11: {
                    nv.field_F.field_A = 0;
                    nv.field_F.field_kb = (nv.field_F.field_q + -var11) / 2;
                    if ((de.field_c & 48) != 32) {
                      break L11;
                    } else {
                      var10 = var10 + "..";
                      break L11;
                    }
                  }
                  L12: {
                    if (48 != (48 & de.field_c)) {
                      break L12;
                    } else {
                      var10 = var10 + "...";
                      break L12;
                    }
                  }
                  nv.field_F.field_E = var10;
                  ua.field_k.field_E = vt.field_a.toUpperCase();
                  break L1;
                } else {
                  L13: {
                    stackOut_21_0 = ua.field_k;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (var9 != 0) {
                      stackOut_23_0 = (hd) ((Object) stackIn_23_0);
                      stackOut_23_1 = bm.field_F;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      break L13;
                    } else {
                      stackOut_22_0 = (hd) ((Object) stackIn_22_0);
                      stackOut_22_1 = wp.field_e;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      break L13;
                    }
                  }
                  L14: {
                    stackIn_24_0.field_E = ((String) (Object) stackIn_24_1).toUpperCase();
                    stackOut_24_0 = w.field_e;
                    stackOut_24_1 = -18;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    if (var9 != 0) {
                      stackOut_26_0 = (hd) ((Object) stackIn_26_0);
                      stackOut_26_1 = stackIn_26_1;
                      stackOut_26_2 = ko.field_j;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      stackIn_27_2 = stackOut_26_2;
                      break L14;
                    } else {
                      stackOut_25_0 = (hd) ((Object) stackIn_25_0);
                      stackOut_25_1 = stackIn_25_1;
                      stackOut_25_2 = vr.field_b;
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_27_1 = stackOut_25_1;
                      stackIn_27_2 = stackOut_25_2;
                      break L14;
                    }
                  }
                  L15: {
                    stackIn_27_0.field_E = vo.a((byte) stackIn_27_1, stackIn_27_2, new String[]{ua.field_k.field_E});
                    nv.field_F.field_E = jw.field_Db;
                    ac.field_b.field_lb = true;
                    tt.field_c = true;
                    if (null != la.field_k) {
                      L16: {
                        ee.field_e = false;
                        tt.field_c = false;
                        if (hm.field_G == null) {
                          m.field_f = new boolean[ss.field_j];
                          hm.field_G = new byte[ss.field_j];
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      var14 = 0;
                      var10_int = var14;
                      L17: while (true) {
                        if (var14 >= ss.field_j) {
                          pl.a(0, ss.field_j, ow.field_b, -1, (byte) -121, -1, -1, true);
                          if (2 > tk.field_Ib) {
                            break L15;
                          } else {
                            if (!ne.field_G[12]) {
                              break L15;
                            } else {
                              tt.field_c = true;
                              break L15;
                            }
                          }
                        } else {
                          m.field_f[var14] = false;
                          var14++;
                          continue L17;
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                  if (tt.field_c) {
                    break L1;
                  } else {
                    ua.field_k.field_lb = false;
                    if (!ua.field_k.field_Q) {
                      break L1;
                    } else {
                      L18: {
                        var10 = null;
                        if (!ee.field_e) {
                          break L18;
                        } else {
                          var10 = "<col=A00000>" + qk.field_H + "</col>";
                          var12 = var10;
                          var10 = var12;
                          var12 = var10;
                          var10 = var12;
                          break L18;
                        }
                      }
                      var11 = 0;
                      L19: while (true) {
                        if (var11 >= ss.field_j) {
                          sn.field_e = "<col=A00000>" + op.field_t + "<br>" + ll.field_h + var10;
                          break L1;
                        } else {
                          L20: {
                            if (m.field_f[var11]) {
                              var12 = "<col=A00000>" + ok.field_b[var11] + "</col>";
                              var10 = var12;
                              var10 = var12;
                              if (var10 != null) {
                                var10 = var10 + ", " + var12;
                                break L20;
                              } else {
                                var10 = var12;
                                break L20;
                              }
                            } else {
                              break L20;
                            }
                          }
                          var11++;
                          continue L19;
                        }
                      }
                    }
                  }
                }
              }
            }
            L21: {
              L22: {
                stackOut_61_0 = dn.field_Cb;
                stackOut_61_1 = 0;
                stackIn_65_0 = stackOut_61_0;
                stackIn_65_1 = stackOut_61_1;
                stackIn_62_0 = stackOut_61_0;
                stackIn_62_1 = stackOut_61_1;
                if (!param2) {
                  break L22;
                } else {
                  stackOut_62_0 = (hd) ((Object) stackIn_62_0);
                  stackOut_62_1 = stackIn_62_1;
                  stackIn_65_0 = stackOut_62_0;
                  stackIn_65_1 = stackOut_62_1;
                  stackIn_63_0 = stackOut_62_0;
                  stackIn_63_1 = stackOut_62_1;
                  if (param1) {
                    break L22;
                  } else {
                    stackOut_63_0 = (hd) ((Object) stackIn_63_0);
                    stackOut_63_1 = stackIn_63_1;
                    stackIn_65_0 = stackOut_63_0;
                    stackIn_65_1 = stackOut_63_1;
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    if (td.field_b) {
                      break L22;
                    } else {
                      stackOut_64_0 = (hd) ((Object) stackIn_64_0);
                      stackOut_64_1 = stackIn_64_1;
                      stackOut_64_2 = 1;
                      stackIn_66_0 = stackOut_64_0;
                      stackIn_66_1 = stackOut_64_1;
                      stackIn_66_2 = stackOut_64_2;
                      break L21;
                    }
                  }
                }
              }
              stackOut_65_0 = (hd) ((Object) stackIn_65_0);
              stackOut_65_1 = stackIn_65_1;
              stackOut_65_2 = 0;
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L21;
            }
            L23: {
              L24: {
                ((hd) (Object) stackIn_66_0).b(stackIn_66_1, stackIn_66_2 != 0);
                stackOut_66_0 = fp.field_p;
                stackOut_66_1 = 0;
                stackIn_70_0 = stackOut_66_0;
                stackIn_70_1 = stackOut_66_1;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                if (!param2) {
                  break L24;
                } else {
                  stackOut_67_0 = (hd) ((Object) stackIn_67_0);
                  stackOut_67_1 = stackIn_67_1;
                  stackIn_70_0 = stackOut_67_0;
                  stackIn_70_1 = stackOut_67_1;
                  stackIn_68_0 = stackOut_67_0;
                  stackIn_68_1 = stackOut_67_1;
                  if (param1) {
                    break L24;
                  } else {
                    stackOut_68_0 = (hd) ((Object) stackIn_68_0);
                    stackOut_68_1 = stackIn_68_1;
                    stackIn_70_0 = stackOut_68_0;
                    stackIn_70_1 = stackOut_68_1;
                    stackIn_69_0 = stackOut_68_0;
                    stackIn_69_1 = stackOut_68_1;
                    if (td.field_b) {
                      break L24;
                    } else {
                      stackOut_69_0 = (hd) ((Object) stackIn_69_0);
                      stackOut_69_1 = stackIn_69_1;
                      stackOut_69_2 = 1;
                      stackIn_71_0 = stackOut_69_0;
                      stackIn_71_1 = stackOut_69_1;
                      stackIn_71_2 = stackOut_69_2;
                      break L23;
                    }
                  }
                }
              }
              stackOut_70_0 = (hd) ((Object) stackIn_70_0);
              stackOut_70_1 = stackIn_70_1;
              stackOut_70_2 = 0;
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L23;
            }
            L25: {
              L26: {
                ((hd) (Object) stackIn_71_0).b(stackIn_71_1, stackIn_71_2 != 0);
                stackOut_71_0 = tn.field_f;
                stackOut_71_1 = 0;
                stackIn_75_0 = stackOut_71_0;
                stackIn_75_1 = stackOut_71_1;
                stackIn_72_0 = stackOut_71_0;
                stackIn_72_1 = stackOut_71_1;
                if (!param2) {
                  break L26;
                } else {
                  stackOut_72_0 = (hd) ((Object) stackIn_72_0);
                  stackOut_72_1 = stackIn_72_1;
                  stackIn_75_0 = stackOut_72_0;
                  stackIn_75_1 = stackOut_72_1;
                  stackIn_73_0 = stackOut_72_0;
                  stackIn_73_1 = stackOut_72_1;
                  if (param1) {
                    break L26;
                  } else {
                    stackOut_73_0 = (hd) ((Object) stackIn_73_0);
                    stackOut_73_1 = stackIn_73_1;
                    stackIn_75_0 = stackOut_73_0;
                    stackIn_75_1 = stackOut_73_1;
                    stackIn_74_0 = stackOut_73_0;
                    stackIn_74_1 = stackOut_73_1;
                    if (!td.field_b) {
                      break L26;
                    } else {
                      stackOut_74_0 = (hd) ((Object) stackIn_74_0);
                      stackOut_74_1 = stackIn_74_1;
                      stackOut_74_2 = 1;
                      stackIn_76_0 = stackOut_74_0;
                      stackIn_76_1 = stackOut_74_1;
                      stackIn_76_2 = stackOut_74_2;
                      break L25;
                    }
                  }
                }
              }
              stackOut_75_0 = (hd) ((Object) stackIn_75_0);
              stackOut_75_1 = stackIn_75_1;
              stackOut_75_2 = 0;
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L25;
            }
            L27: {
              ((hd) (Object) stackIn_76_0).b(stackIn_76_1, stackIn_76_2 != 0);
              ni.field_l.field_b.h((byte) 118);
              if (null == ow.field_b) {
                break L27;
              } else {
                L28: {
                  if (0 != ac.field_b.field_sb) {
                    nv.a(param3, 32361);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (-1 != (ua.field_k.field_sb ^ -1)) {
                    if (hw.field_k) {
                      mp.a(param3, (byte) 79);
                      break L29;
                    } else {
                      up.a(param3, 0);
                      break L29;
                    }
                  } else {
                    break L29;
                  }
                }
                ma.a(param3, (byte) -127, ow.field_b, true);
                break L27;
              }
            }
            break L0;
          }
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
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_5_0 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_20_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (var2_int <= 20) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            if (param1 == -100) {
              var4 = 0;
              L2: while (true) {
                if (var2_int <= var4) {
                  stackOut_20_0 = new String(var8);
                  stackIn_21_0 = stackOut_20_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    L4: {
                      var5 = param0.charAt(var4);
                      if (var5 < 65) {
                        break L4;
                      } else {
                        if (var5 > 90) {
                          break L4;
                        } else {
                          var3[var4] = (char)(var5 + 32);
                          break L3;
                        }
                      }
                    }
                    L5: {
                      L6: {
                        if (var5 < 97) {
                          break L6;
                        } else {
                          if (var5 <= 122) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (var5 < 48) {
                          break L7;
                        } else {
                          if (57 >= var5) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var3[var4] = (char)95;
                      break L3;
                    }
                    var3[var4] = (char)var5;
                    break L3;
                  }
                  var4++;
                  continue L2;
                }
              }
            } else {
              stackOut_4_0 = (String) null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("ri.G(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_21_0;
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
