/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ri extends qv {
    static int field_t;
    static String field_s;
    static sr field_u;
    static String field_v;
    static int field_r;

    final static void a(byte param0, int param1, nu param2, int param3) {
        nl var4 = null;
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
        nl stackIn_15_0 = null;
        nl stackIn_16_0 = null;
        nl stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        nl stackOut_14_0 = null;
        nl stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        nl stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        var15 = Kickabout.field_G;
        var4 = param2.field_P[param3][param1];
        if (-1 != (var4.field_u ^ -1)) {
          return;
        } else {
          L0: {
            var5 = 255 & 19 * ((1 + param3) * (1 + param1)) + param2.field_J;
            if (param0 == -93) {
              break L0;
            } else {
              ri.a(113, false, true, 5);
              break L0;
            }
          }
          L1: {
            L2: {
              var6 = var4.f(param0 + -7);
              var7 = var4.a(true);
              var8 = param2.field_V.a(true);
              var9 = param2.field_V.c(879306160);
              if (-1 != (var5 & (1 << var4.field_I) - 1 ^ -1)) {
                break L2;
              } else {
                L3: {
                  gt.a(param1, param3, (byte) 103, param2.field_r[param3]);
                  var10 = var6 + -ge.field_m[0];
                  var11 = -ge.field_m[1] + var7;
                  var12 = 24;
                  var13 = 24;
                  if ((10 & var4.field_G ^ -1) == -1) {
                    var12 = var12 << 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((5 & var4.field_G ^ -1) == -1) {
                    var13 = var13 << 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    if ((Math.abs(var10) ^ -1) < (var12 ^ -1)) {
                      break L6;
                    } else {
                      if ((Math.abs(var11) ^ -1) < (var13 ^ -1)) {
                        break L6;
                      } else {
                        L7: {
                          stackOut_14_0 = (nl) var4;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          if (-1 == (var4.field_G ^ -1)) {
                            stackOut_16_0 = (nl) (Object) stackIn_16_0;
                            stackOut_16_1 = 5;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            break L7;
                          } else {
                            stackOut_15_0 = (nl) (Object) stackIn_15_0;
                            stackOut_15_1 = 7;
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_17_1 = stackOut_15_1;
                            break L7;
                          }
                        }
                        stackIn_17_0.field_I = stackIn_17_1;
                        var4.field_G = 0;
                        if (var15 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L8: {
                    var14 = 0;
                    if (var12 >= var10) {
                      break L8;
                    } else {
                      var14 = var14 | 2;
                      break L8;
                    }
                  }
                  L9: {
                    if ((var10 ^ -1) > (-var12 ^ -1)) {
                      var14 = var14 | 8;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var13 ^ -1) > (var11 ^ -1)) {
                      var14 = var14 | 4;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (-var13 > var11) {
                      var14 = var14 | 1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    L13: {
                      if (var4.field_G != var14) {
                        break L13;
                      } else {
                        if ((var4.field_I ^ -1) <= -5) {
                          break L12;
                        } else {
                          if ((var4.field_G ^ -1) == (var14 ^ -1)) {
                            var4.field_I = var4.field_I + 1;
                            if (var15 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    var4.field_I = 1;
                    break L12;
                  }
                  var4.field_G = var14;
                  break L5;
                }
                if (var15 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L14: {
              if ((1 & var4.field_G ^ -1) == -1) {
                break L14;
              } else {
                if (88080384 <= var4.field_w) {
                  var4.field_G = var4.field_G & -2;
                  var4.field_G = var4.field_G | 4;
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            L15: {
              if ((4 & var4.field_G) == 0) {
                break L15;
              } else {
                if (var4.field_w > 0) {
                  break L15;
                } else {
                  var4.field_G = var4.field_G & -5;
                  var4.field_G = var4.field_G | 1;
                  break L15;
                }
              }
            }
            L16: {
              if (0 == (8 & var4.field_G)) {
                break L16;
              } else {
                if (58720256 <= var4.field_M) {
                  var4.field_G = var4.field_G & -9;
                  var4.field_G = var4.field_G | 2;
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            if ((var4.field_G & 2) == 0) {
              break L1;
            } else {
              if (var4.field_M <= 0) {
                var4.field_G = var4.field_G & -3;
                var4.field_G = var4.field_G | 8;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L17: {
            if (-1 != (var4.field_G ^ -1)) {
              break L17;
            } else {
              if (0 != var4.field_u) {
                break L17;
              } else {
                if ((var5 % 10 ^ -1) != -1) {
                  break L17;
                } else {
                  var4.a(uv.a(true, -var7 + var9, -var6 + var8), 26214);
                  break L17;
                }
              }
            }
          }
          return;
        }
    }

    final static void a(sj param0, int[] param1, int param2, kg[] param3, sj param4) {
        kg[] var5 = null;
        int[] var6 = null;
        kg[] var6_array = null;
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
        Object var19 = null;
        kg[] stackIn_14_0 = null;
        kg[] stackIn_16_0 = null;
        kg[] stackOut_13_0 = null;
        kg[] stackOut_15_0 = null;
        L0: {
          L1: {
            L2: {
              L3: {
                var18 = Kickabout.field_G;
                var5 = jo.a(param4, 17369, "lobby", "crowns");
                bk.field_e = var5.length;
                if (param3 != null) {
                  var6_array = new kg[param3.length + bk.field_e];
                  var7_int = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var7_int >= bk.field_e) {
                          break L6;
                        } else {
                          var6_array[var7_int] = var5[var7_int];
                          var7_int++;
                          if (var18 != 0) {
                            break L5;
                          } else {
                            if (var18 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var5 = var6_array;
                      break L5;
                    }
                    var7_int = 0;
                    L7: while (true) {
                      L8: {
                        L9: {
                          if ((param3.length ^ -1) >= (var7_int ^ -1)) {
                            break L9;
                          } else {
                            stackOut_13_0 = (kg[]) var6_array;
                            stackIn_16_0 = stackOut_13_0;
                            stackIn_14_0 = stackOut_13_0;
                            if (var18 != 0) {
                              break L8;
                            } else {
                              stackIn_14_0[var7_int + bk.field_e] = param3[var7_int];
                              var7_int++;
                              if (var18 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        stackOut_15_0 = (kg[]) var5;
                        stackIn_16_0 = stackOut_15_0;
                        break L8;
                      }
                      var6 = new int[stackIn_16_0.length];
                      var7_int = 0;
                      L10: while (true) {
                        if ((bk.field_e ^ -1) >= (var7_int ^ -1)) {
                          break L3;
                        } else {
                          var6[var7_int] = 10;
                          var7_int++;
                          if (var18 != 0) {
                            break L0;
                          } else {
                            if (var18 == 0) {
                              continue L10;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var6 = new int[var5.length];
                  var7_int = 0;
                  if ((bk.field_e ^ -1) >= (var7_int ^ -1)) {
                    break L3;
                  } else {
                    var6[var7_int] = 10;
                    var7_int++;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      if (var18 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              if (param3 == null) {
                break L1;
              } else {
                if (param1 != null) {
                  break L2;
                } else {
                  var7_int = 0;
                  L11: while (true) {
                    L12: {
                      if (var7_int >= param3.length) {
                        break L12;
                      } else {
                        var6[var7_int + bk.field_e] = param3[var7_int].field_a;
                        var7_int++;
                        if (var18 != 0) {
                          break L0;
                        } else {
                          if (var18 == 0) {
                            continue L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    if (var18 == 0) {
                      break L1;
                    } else {
                      var7_int = 0;
                      L13: while (true) {
                        if (param3.length <= var7_int) {
                          break L1;
                        } else {
                          var6[var7_int + bk.field_e] = param1[var7_int];
                          var7_int++;
                          if (var18 != 0) {
                            break L0;
                          } else {
                            if (var18 == 0) {
                              continue L13;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            var7_int = 0;
            L14: while (true) {
              if (param3.length <= var7_int) {
                break L1;
              } else {
                var6[var7_int + bk.field_e] = param1[var7_int];
                var7_int++;
                if (var18 != 0) {
                  break L0;
                } else {
                  if (var18 == 0) {
                    continue L14;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          sh.field_c = 15;
          eb.field_b = 4;
          ig.field_c = 11;
          el.field_I = 2;
          mj.field_b = 2;
          break L0;
        }
        L15: {
          var7 = qk.a("largefont", param0, 75, "lobby", param4);
          rq.field_E = qk.a("generalfont", param0, 87, "lobby", param4);
          jw.field_Ab = qk.a("chatfont", param0, 112, "lobby", param4);
          var7.a((qd[]) (Object) var5, var6);
          rq.field_E.a((qd[]) (Object) var5, var6);
          jw.field_Ab.a((qd[]) (Object) var5, var6);
          var8 = new hd(0L, (hd) null);
          var8.field_y = 16777215;
          var8.field_X = (hu) (Object) var7;
          var8.field_xb = sh.field_c;
          var8.field_p = 1;
          var9 = var8;
          var9.field_A = 1;
          var10 = new hd(0L, (hd) null);
          var10.field_y = 16777215;
          if (param2 <= -51) {
            break L15;
          } else {
            var19 = null;
            ri.a((byte) -76, -14, (nu) null, 71);
            break L15;
          }
        }
        var10.field_X = (hu) (Object) rq.field_E;
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
        dw.field_e.field_X = (hu) (Object) rq.field_E;
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
        var15.field_X = (hu) (Object) var7;
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
        ut[] dupTemp$4 = bs.a(se.a(param4, -128, "lobby", "smallbutton_active"), (byte) -124);
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
        ut[] dupTemp$5 = bs.a(se.a(param4, -124, "lobby", "gameoptionbutton_active"), (byte) -121);
        k.field_f.field_u = dupTemp$5;
        k.field_f.field_rb = dupTemp$5;
        k.field_f.field_tb = bs.a(se.a(param4, 63, "lobby", "gameoptionbutton_disabled"), (byte) -109);
        kn.field_F.field_R = bs.a(se.a(param4, 31, "lobby", "chatbutton"), (byte) -113);
        kn.field_F.field_S = bs.a(se.a(param4, -127, "lobby", "chatbutton_mouseover"), (byte) 74);
        ut[] dupTemp$6 = bs.a(se.a(param4, 11, "lobby", "chatbutton_active"), (byte) -124);
        kn.field_F.field_u = dupTemp$6;
        kn.field_F.field_rb = dupTemp$6;
        nj.field_d.field_R = bs.a(se.a(param4, -123, "lobby", "chatfilterbutton"), (byte) 9);
        nj.field_d.field_S = bs.a(se.a(param4, -127, "lobby", "chatfilterbutton_mouseover"), (byte) 33);
        ut[] dupTemp$7 = bs.a(se.a(param4, -123, "lobby", "chatfilterbutton_active"), (byte) -121);
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
    }

    final static ot a(ot param0, boolean param1) {
        ut var2 = null;
        int var3_int = 0;
        ot var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        ut var10 = null;
        ot stackIn_16_0 = null;
        ot stackIn_19_0 = null;
        ot stackOut_15_0 = null;
        ot stackOut_18_0 = null;
        var8 = Kickabout.field_G;
        var10 = new ut(param0.field_o, param0.field_v);
        var2 = var10;
        var3_int = 0;
        L0: while (true) {
          L1: {
            if ((var3_int ^ -1) <= (var2.field_y.length ^ -1)) {
              break L1;
            } else {
              L2: {
                if (-171 <= (param0.field_y[var3_int] >>> 1222392632 ^ -1)) {
                  break L2;
                } else {
                  var10.field_y[var3_int] = 8947848;
                  break L2;
                }
              }
              var3_int++;
              if (var8 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var3 = new ot(param0.field_o, param0.field_v);
          iw.a(-54, (ut) (Object) var3);
          on.a(0, 0, on.field_g, on.field_f, 6710886);
          var4 = 2;
          L3: while (true) {
            L4: {
              L5: {
                if (10 <= var4) {
                  break L5;
                } else {
                  var5 = (-var4 + 12 << -1436849369) / 13;
                  var6 = param0.field_o + -var4;
                  var7 = var4 / 4 + var4;
                  var2.c(var7, var4 / 5 + var7, var6, var6, 65793 * var5);
                  var4++;
                  if (var8 != 0) {
                    break L4;
                  } else {
                    if (var8 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              ta.e(125);
              break L4;
            }
            L6: {
              if (param1) {
                break L6;
              } else {
                var9 = null;
                String discarded$1 = ri.a((CharSequence) null, (byte) 122);
                break L6;
              }
            }
            var4 = 0;
            L7: while (true) {
              L8: {
                L9: {
                  if (var3.field_y.length <= var4) {
                    break L9;
                  } else {
                    stackOut_15_0 = (ot) var3;
                    stackIn_19_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if (var8 != 0) {
                      break L8;
                    } else {
                      stackIn_16_0.field_y[var4] = hf.a(qj.b(var3.field_y[var4], 16777215), qj.b(param0.field_y[var4], -16777216));
                      var4++;
                      if (var8 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                stackOut_18_0 = (ot) var3;
                stackIn_19_0 = stackOut_18_0;
                break L8;
              }
              return stackIn_19_0;
            }
          }
        }
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        if (param1) {
            kj.a(12105912, param2 - -param3.field_g, param3.field_t + param4, param3.field_i, param3.field_n);
        }
        super.a(-21, param1, param2, param3, param4);
        int var6 = 92 % ((59 - param0) / 53);
    }

    ri(int param0) {
        this(gf.field_a, param0);
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
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
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        hd stackIn_24_0 = null;
        hd stackIn_25_0 = null;
        hd stackIn_26_0 = null;
        String stackIn_26_1 = null;
        hd stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        hd stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        hd stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        String stackIn_29_2 = null;
        boolean stackIn_50_0 = false;
        String stackIn_60_0 = null;
        hd stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        hd stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        hd stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        hd stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        hd stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        hd stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        hd stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        hd stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        hd stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        hd stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        hd stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        hd stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        hd stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        hd stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        hd stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        int stackIn_84_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        hd stackOut_23_0 = null;
        hd stackOut_25_0 = null;
        String stackOut_25_1 = null;
        hd stackOut_24_0 = null;
        String stackOut_24_1 = null;
        hd stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        hd stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        String stackOut_28_2 = null;
        hd stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        String stackOut_27_2 = null;
        boolean stackOut_49_0 = false;
        String stackOut_59_0 = null;
        String stackOut_58_0 = null;
        hd stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        hd stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        hd stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        hd stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        hd stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        hd stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        hd stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        hd stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        hd stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        hd stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        hd stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        hd stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        hd stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        hd stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        hd stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        int stackOut_83_0 = 0;
        L0: {
          L1: {
            L2: {
              var13 = Kickabout.field_G;
              var4 = -109 / ((-55 - param0) / 60);
              dw.a(127, fj.field_a);
              if (null == ow.field_b) {
                break L2;
              } else {
                L3: {
                  L4: {
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
                      break L4;
                    } else {
                      if ((rn.field_d[0] ^ -1) != -3) {
                        break L4;
                      } else {
                        var9 = 0;
                        if (var13 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var9 = 0;
                  var10_int = 0;
                  var11 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var11 >= rn.field_d.length) {
                          break L7;
                        } else {
                          stackOut_6_0 = -1;
                          stackOut_6_1 = er.field_h[var11 / 8] & 1 << (var11 & 7) ^ -1;
                          stackIn_19_0 = stackOut_6_0;
                          stackIn_19_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var13 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_7_0 == stackIn_7_1) {
                                stackOut_9_0 = 0;
                                stackIn_10_0 = stackOut_9_0;
                                break L8;
                              } else {
                                stackOut_8_0 = 1;
                                stackIn_10_0 = stackOut_8_0;
                                break L8;
                              }
                            }
                            L9: {
                              var12_int = stackIn_10_0;
                              if (var12_int == 0) {
                                break L9;
                              } else {
                                var10_int++;
                                break L9;
                              }
                            }
                            L10: {
                              if (var12_int == 0) {
                                break L10;
                              } else {
                                if (-3 != (rn.field_d[var11] ^ -1)) {
                                  var9 = 1;
                                  if (var13 == 0) {
                                    break L7;
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var11++;
                            if (var13 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      stackOut_18_0 = -1;
                      stackOut_18_1 = var10_int ^ -1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L6;
                    }
                    if (stackIn_19_0 == stackIn_19_1) {
                      var9 = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L11: {
                  ua.field_k.field_lb = true;
                  if (hw.field_k) {
                    break L11;
                  } else {
                    L12: {
                      stackOut_23_0 = ua.field_k;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      if (var9 != 0) {
                        stackOut_25_0 = (hd) (Object) stackIn_25_0;
                        stackOut_25_1 = bm.field_F;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        break L12;
                      } else {
                        stackOut_24_0 = (hd) (Object) stackIn_24_0;
                        stackOut_24_1 = wp.field_e;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        break L12;
                      }
                    }
                    L13: {
                      stackIn_26_0.field_E = ((String) (Object) stackIn_26_1).toUpperCase();
                      stackOut_26_0 = w.field_e;
                      stackOut_26_1 = -18;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      if (var9 != 0) {
                        stackOut_28_0 = (hd) (Object) stackIn_28_0;
                        stackOut_28_1 = stackIn_28_1;
                        stackOut_28_2 = ko.field_j;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        stackIn_29_2 = stackOut_28_2;
                        break L13;
                      } else {
                        stackOut_27_0 = (hd) (Object) stackIn_27_0;
                        stackOut_27_1 = stackIn_27_1;
                        stackOut_27_2 = vr.field_b;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        stackIn_29_2 = stackOut_27_2;
                        break L13;
                      }
                    }
                    L14: {
                      stackIn_29_0.field_E = vo.a((byte) stackIn_29_1, stackIn_29_2, new String[1]);
                      nv.field_F.field_E = jw.field_Db;
                      ac.field_b.field_lb = true;
                      tt.field_c = true;
                      if (null != la.field_k) {
                        L15: {
                          ee.field_e = false;
                          tt.field_c = false;
                          if (hm.field_G == null) {
                            m.field_f = new boolean[ss.field_j];
                            hm.field_G = new byte[ss.field_j];
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        var10_int = 0;
                        L16: while (true) {
                          L17: {
                            L18: {
                              if (var10_int >= ss.field_j) {
                                break L18;
                              } else {
                                m.field_f[var10_int] = false;
                                var10_int++;
                                if (var13 != 0) {
                                  break L17;
                                } else {
                                  if (var13 == 0) {
                                    continue L16;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            pl.a(0, ss.field_j, ow.field_b, -1, (byte) -121, -1, -1, true);
                            break L17;
                          }
                          if (2 > tk.field_Ib) {
                            break L14;
                          } else {
                            if (!ne.field_G[12]) {
                              break L14;
                            } else {
                              tt.field_c = true;
                              break L14;
                            }
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                    if (tt.field_c) {
                      break L2;
                    } else {
                      ua.field_k.field_lb = false;
                      if (!ua.field_k.field_Q) {
                        break L2;
                      } else {
                        L19: {
                          var10 = null;
                          if (!ee.field_e) {
                            break L19;
                          } else {
                            var10 = (Object) (Object) ("<col=A00000>" + qk.field_H + "</col>");
                            var12 = var10;
                            var10 = var12;
                            var12 = var10;
                            var10 = var12;
                            break L19;
                          }
                        }
                        var11 = 0;
                        L20: while (true) {
                          L21: {
                            if (var11 >= ss.field_j) {
                              break L21;
                            } else {
                              stackOut_49_0 = m.field_f[var11];
                              stackIn_84_0 = stackOut_49_0 ? 1 : 0;
                              stackIn_50_0 = stackOut_49_0;
                              if (var13 != 0) {
                                break L1;
                              } else {
                                L22: {
                                  if (stackIn_50_0) {
                                    L23: {
                                      var12_ref = "<col=A00000>" + ok.field_b[var11] + "</col>";
                                      var10 = (Object) (Object) var12_ref;
                                      var10 = (Object) (Object) var12_ref;
                                      if (var10 != null) {
                                        break L23;
                                      } else {
                                        var10 = (Object) (Object) var12_ref;
                                        if (var13 == 0) {
                                          break L22;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                    var10 = (Object) (Object) (var10 + ", " + var12_ref);
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                var11++;
                                if (var13 == 0) {
                                  continue L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          sn.field_e = "<col=A00000>" + op.field_t + "<br>" + ll.field_h + var10;
                          if (var13 == 0) {
                            break L2;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                  }
                }
                L24: {
                  ac.field_b.field_lb = false;
                  w.field_e.field_E = qr.field_c;
                  if (var9 == 0) {
                    stackOut_59_0 = ea.field_g;
                    stackIn_60_0 = stackOut_59_0;
                    break L24;
                  } else {
                    stackOut_58_0 = rl.field_s;
                    stackIn_60_0 = stackOut_58_0;
                    break L24;
                  }
                }
                L25: {
                  var10 = (Object) (Object) stackIn_60_0;
                  var11 = nv.field_F.field_X.a((String) var10) + nv.field_F.field_X.a('.') * 3;
                  if (16 != (de.field_c & 48)) {
                    break L25;
                  } else {
                    var10 = (Object) (Object) (var10 + ".");
                    break L25;
                  }
                }
                L26: {
                  nv.field_F.field_A = 0;
                  nv.field_F.field_kb = (nv.field_F.field_q + -var11) / 2;
                  if ((de.field_c & 48) != 32) {
                    break L26;
                  } else {
                    var10 = (Object) (Object) (var10 + "..");
                    break L26;
                  }
                }
                L27: {
                  if (48 != (48 & de.field_c)) {
                    break L27;
                  } else {
                    var10 = (Object) (Object) (var10 + "...");
                    break L27;
                  }
                }
                nv.field_F.field_E = (String) var10;
                ua.field_k.field_E = vt.field_a.toUpperCase();
                break L2;
              }
            }
            L28: {
              L29: {
                stackOut_67_0 = dn.field_Cb;
                stackOut_67_1 = 0;
                stackIn_71_0 = stackOut_67_0;
                stackIn_71_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (!param2) {
                  break L29;
                } else {
                  stackOut_68_0 = (hd) (Object) stackIn_68_0;
                  stackOut_68_1 = stackIn_68_1;
                  stackIn_71_0 = stackOut_68_0;
                  stackIn_71_1 = stackOut_68_1;
                  stackIn_69_0 = stackOut_68_0;
                  stackIn_69_1 = stackOut_68_1;
                  if (param1) {
                    break L29;
                  } else {
                    stackOut_69_0 = (hd) (Object) stackIn_69_0;
                    stackOut_69_1 = stackIn_69_1;
                    stackIn_71_0 = stackOut_69_0;
                    stackIn_71_1 = stackOut_69_1;
                    stackIn_70_0 = stackOut_69_0;
                    stackIn_70_1 = stackOut_69_1;
                    if (td.field_b) {
                      break L29;
                    } else {
                      stackOut_70_0 = (hd) (Object) stackIn_70_0;
                      stackOut_70_1 = stackIn_70_1;
                      stackOut_70_2 = 1;
                      stackIn_72_0 = stackOut_70_0;
                      stackIn_72_1 = stackOut_70_1;
                      stackIn_72_2 = stackOut_70_2;
                      break L28;
                    }
                  }
                }
              }
              stackOut_71_0 = (hd) (Object) stackIn_71_0;
              stackOut_71_1 = stackIn_71_1;
              stackOut_71_2 = 0;
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L28;
            }
            L30: {
              L31: {
                ((hd) (Object) stackIn_72_0).b(stackIn_72_1, stackIn_72_2 != 0);
                stackOut_72_0 = fp.field_p;
                stackOut_72_1 = 0;
                stackIn_76_0 = stackOut_72_0;
                stackIn_76_1 = stackOut_72_1;
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                if (!param2) {
                  break L31;
                } else {
                  stackOut_73_0 = (hd) (Object) stackIn_73_0;
                  stackOut_73_1 = stackIn_73_1;
                  stackIn_76_0 = stackOut_73_0;
                  stackIn_76_1 = stackOut_73_1;
                  stackIn_74_0 = stackOut_73_0;
                  stackIn_74_1 = stackOut_73_1;
                  if (param1) {
                    break L31;
                  } else {
                    stackOut_74_0 = (hd) (Object) stackIn_74_0;
                    stackOut_74_1 = stackIn_74_1;
                    stackIn_76_0 = stackOut_74_0;
                    stackIn_76_1 = stackOut_74_1;
                    stackIn_75_0 = stackOut_74_0;
                    stackIn_75_1 = stackOut_74_1;
                    if (td.field_b) {
                      break L31;
                    } else {
                      stackOut_75_0 = (hd) (Object) stackIn_75_0;
                      stackOut_75_1 = stackIn_75_1;
                      stackOut_75_2 = 1;
                      stackIn_77_0 = stackOut_75_0;
                      stackIn_77_1 = stackOut_75_1;
                      stackIn_77_2 = stackOut_75_2;
                      break L30;
                    }
                  }
                }
              }
              stackOut_76_0 = (hd) (Object) stackIn_76_0;
              stackOut_76_1 = stackIn_76_1;
              stackOut_76_2 = 0;
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L30;
            }
            L32: {
              L33: {
                ((hd) (Object) stackIn_77_0).b(stackIn_77_1, stackIn_77_2 != 0);
                stackOut_77_0 = tn.field_f;
                stackOut_77_1 = 0;
                stackIn_81_0 = stackOut_77_0;
                stackIn_81_1 = stackOut_77_1;
                stackIn_78_0 = stackOut_77_0;
                stackIn_78_1 = stackOut_77_1;
                if (!param2) {
                  break L33;
                } else {
                  stackOut_78_0 = (hd) (Object) stackIn_78_0;
                  stackOut_78_1 = stackIn_78_1;
                  stackIn_81_0 = stackOut_78_0;
                  stackIn_81_1 = stackOut_78_1;
                  stackIn_79_0 = stackOut_78_0;
                  stackIn_79_1 = stackOut_78_1;
                  if (param1) {
                    break L33;
                  } else {
                    stackOut_79_0 = (hd) (Object) stackIn_79_0;
                    stackOut_79_1 = stackIn_79_1;
                    stackIn_81_0 = stackOut_79_0;
                    stackIn_81_1 = stackOut_79_1;
                    stackIn_80_0 = stackOut_79_0;
                    stackIn_80_1 = stackOut_79_1;
                    if (!td.field_b) {
                      break L33;
                    } else {
                      stackOut_80_0 = (hd) (Object) stackIn_80_0;
                      stackOut_80_1 = stackIn_80_1;
                      stackOut_80_2 = 1;
                      stackIn_82_0 = stackOut_80_0;
                      stackIn_82_1 = stackOut_80_1;
                      stackIn_82_2 = stackOut_80_2;
                      break L32;
                    }
                  }
                }
              }
              stackOut_81_0 = (hd) (Object) stackIn_81_0;
              stackOut_81_1 = stackIn_81_1;
              stackOut_81_2 = 0;
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L32;
            }
            ((hd) (Object) stackIn_82_0).b(stackIn_82_1, stackIn_82_2 != 0);
            ni.field_l.field_b.h((byte) 118);
            if (null == ow.field_b) {
              break L0;
            } else {
              stackOut_83_0 = 0;
              stackIn_84_0 = stackOut_83_0;
              break L1;
            }
          }
          L34: {
            if (stackIn_84_0 != ac.field_b.field_sb) {
              nv.a(param3, 32361);
              break L34;
            } else {
              break L34;
            }
          }
          L35: {
            if (-1 != (ua.field_k.field_sb ^ -1)) {
              L36: {
                if (hw.field_k) {
                  break L36;
                } else {
                  up.a(param3, 0);
                  if (var13 == 0) {
                    break L35;
                  } else {
                    break L36;
                  }
                }
              }
              mp.a(param3, (byte) 79);
              break L35;
            } else {
              break L35;
            }
          }
          ma.a(param3, (byte) -127, ow.field_b, true);
          break L0;
        }
    }

    ri(hu param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_G, -1, 2147483647, false);
    }

    final static String a(CharSequence param0, byte param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Kickabout.field_G;
          var2 = param0.length();
          if (var2 <= 20) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        var3 = new char[var2];
        if (param1 == -100) {
          var4 = 0;
          L1: while (true) {
            L2: {
              if (var2 <= var4) {
                break L2;
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
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
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
                    if (var6 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                  var3[var4] = (char)var5;
                  break L3;
                }
                var4++;
                if (var6 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            return new String(var3);
          }
        } else {
          return null;
        }
    }

    public static void b(boolean param0) {
        field_u = null;
        if (!param0) {
            field_s = null;
        }
        field_s = null;
        field_v = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Pending";
        field_v = "to go straight into a multiplayer Exhibition Game with a preset team";
        field_r = 200;
        field_u = (sr) (Object) new ba();
    }
}
