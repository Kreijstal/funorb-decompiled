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
        RuntimeException var4 = null;
        nl var4_ref = null;
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
        nl stackIn_22_0 = null;
        nl stackIn_24_0 = null;
        nl stackIn_26_0 = null;
        nl stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        nl stackOut_21_0 = null;
        nl stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        nl stackOut_22_0 = null;
        nl stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var15 = Kickabout.field_G;
        try {
          L0: {
            var4_ref = param2.field_P[param3][param1];
            if (var4_ref.field_u != 0) {
              return;
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
                L3: {
                  var6 = var4_ref.f(param0 + -7);
                  var7 = var4_ref.a(true);
                  var8 = param2.field_V.a(true);
                  var9 = param2.field_V.c(879306160);
                  if ((var5 & (1 << var4_ref.field_I) - 1) != 0) {
                    break L3;
                  } else {
                    L4: {
                      gt.a(param1, param3, (byte) 103, param2.field_r[param3]);
                      var10 = var6 + -ge.field_m[0];
                      var11 = -ge.field_m[1] + var7;
                      var12 = 24;
                      var13 = 24;
                      if ((10 & var4_ref.field_G) == 0) {
                        var12 = var12 << 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if ((5 & var4_ref.field_G) == 0) {
                        var13 = var13 << 1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (~Math.abs(var10) < ~var12) {
                          break L7;
                        } else {
                          if (~Math.abs(var11) < ~var13) {
                            break L7;
                          } else {
                            L8: {
                              stackOut_21_0 = (nl) var4_ref;
                              stackIn_26_0 = stackOut_21_0;
                              stackIn_22_0 = stackOut_21_0;
                              if (var4_ref.field_G == 0) {
                                stackOut_26_0 = (nl) (Object) stackIn_26_0;
                                stackOut_26_1 = 5;
                                stackIn_27_0 = stackOut_26_0;
                                stackIn_27_1 = stackOut_26_1;
                                break L8;
                              } else {
                                stackOut_22_0 = (nl) (Object) stackIn_22_0;
                                stackIn_24_0 = stackOut_22_0;
                                stackOut_24_0 = (nl) (Object) stackIn_24_0;
                                stackOut_24_1 = 7;
                                stackIn_27_0 = stackOut_24_0;
                                stackIn_27_1 = stackOut_24_1;
                                break L8;
                              }
                            }
                            stackIn_27_0.field_I = stackIn_27_1;
                            var4_ref.field_G = 0;
                            if (var15 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      L9: {
                        var14 = 0;
                        if (var12 >= var10) {
                          break L9;
                        } else {
                          var14 = var14 | 2;
                          break L9;
                        }
                      }
                      L10: {
                        if (~var10 > ~-var12) {
                          var14 = var14 | 8;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (~var13 > ~var11) {
                          var14 = var14 | 4;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (-var13 > var11) {
                          var14 = var14 | 1;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        L14: {
                          if (var4_ref.field_G != var14) {
                            break L14;
                          } else {
                            if (var4_ref.field_I >= 4) {
                              break L13;
                            } else {
                              if (~var4_ref.field_G == ~var14) {
                                var4_ref.field_I = var4_ref.field_I + 1;
                                if (var15 == 0) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                        var4_ref.field_I = 1;
                        break L13;
                      }
                      var4_ref.field_G = var14;
                      break L6;
                    }
                    if (var15 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L15: {
                  if ((1 & var4_ref.field_G) == 0) {
                    break L15;
                  } else {
                    if (88080384 <= var4_ref.field_w) {
                      var4_ref.field_G = var4_ref.field_G & -2;
                      var4_ref.field_G = var4_ref.field_G | 4;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
                L16: {
                  if ((4 & var4_ref.field_G) == 0) {
                    break L16;
                  } else {
                    if (var4_ref.field_w > 0) {
                      break L16;
                    } else {
                      var4_ref.field_G = var4_ref.field_G & -5;
                      var4_ref.field_G = var4_ref.field_G | 1;
                      break L16;
                    }
                  }
                }
                L17: {
                  if (0 == (8 & var4_ref.field_G)) {
                    break L17;
                  } else {
                    if (58720256 <= var4_ref.field_M) {
                      var4_ref.field_G = var4_ref.field_G & -9;
                      var4_ref.field_G = var4_ref.field_G | 2;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
                if ((var4_ref.field_G & 2) == 0) {
                  break L2;
                } else {
                  if (var4_ref.field_M <= 0) {
                    var4_ref.field_G = var4_ref.field_G & -3;
                    var4_ref.field_G = var4_ref.field_G | 8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L18: {
                if (var4_ref.field_G != 0) {
                  break L18;
                } else {
                  if (0 != var4_ref.field_u) {
                    break L18;
                  } else {
                    if (var5 % 10 != 0) {
                      break L18;
                    } else {
                      var4_ref.a(uv.a(true, -var7 + var9, -var6 + var8), 26214);
                      break L18;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) var4;
            stackOut_95_1 = new StringBuilder().append("ri.A(").append(param0).append(',').append(param1).append(',');
            stackIn_98_0 = stackOut_95_0;
            stackIn_98_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param2 == null) {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L19;
            } else {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "{...}";
              stackIn_99_0 = stackOut_96_0;
              stackIn_99_1 = stackOut_96_1;
              stackIn_99_2 = stackOut_96_2;
              break L19;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_99_0, stackIn_99_2 + ',' + param3 + ')');
        }
    }

    final static void a(sj param0, int[] param1, int param2, kg[] param3, sj param4) {
        kg[] var5 = null;
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
        kg[] stackIn_11_0 = null;
        kg[] stackIn_14_0 = null;
        kg[] stackOut_10_0 = null;
        kg[] stackOut_13_0 = null;
        L0: {
          L1: {
            var18 = Kickabout.field_G;
            var5 = jo.a(param4, 17369, "lobby", "crowns");
            bk.field_e = var5.length;
            if (param3 != null) {
              var6 = new kg[param3.length + bk.field_e];
              var7_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var7_int >= bk.field_e) {
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
                  if (~param3.length >= ~var7_int) {
                    break L1;
                  } else {
                    stackOut_10_0 = (kg[]) var6;
                    stackIn_14_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      stackIn_11_0[var7_int + bk.field_e] = param3[var7_int];
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
          stackOut_13_0 = (kg[]) var5;
          stackIn_14_0 = stackOut_13_0;
          break L0;
        }
        var6_array = new int[stackIn_14_0.length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              if (~bk.field_e >= ~var7_int) {
                break L8;
              } else {
                var6_array[var7_int] = 10;
                var7_int++;
                if (var18 != 0) {
                  break L7;
                } else {
                  if (var18 == 0) {
                    continue L6;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L9: {
              if (param3 == null) {
                break L9;
              } else {
                L10: {
                  if (null != param1) {
                    break L10;
                  } else {
                    var7_int = 0;
                    L11: while (true) {
                      L12: {
                        if (var7_int >= param3.length) {
                          break L12;
                        } else {
                          var6_array[var7_int + bk.field_e] = param3[var7_int].field_a;
                          var7_int++;
                          if (var18 != 0) {
                            break L7;
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
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                var7_int = 0;
                L13: while (true) {
                  if (param3.length <= var7_int) {
                    break L9;
                  } else {
                    var6_array[var7_int + bk.field_e] = param1[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L7;
                    } else {
                      if (var18 == 0) {
                        continue L13;
                      } else {
                        break L9;
                      }
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
            break L7;
          }
          L14: {
            var7 = qk.a("largefont", param0, 75, "lobby", param4);
            rq.field_E = qk.a("generalfont", param0, 87, "lobby", param4);
            jw.field_Ab = qk.a("chatfont", param0, 112, "lobby", param4);
            var7.a((qd[]) (Object) var5, var6_array);
            rq.field_E.a((qd[]) (Object) var5, var6_array);
            jw.field_Ab.a((qd[]) (Object) var5, var6_array);
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
              break L14;
            } else {
              ri.a((byte) -76, -14, (nu) null, 71);
              break L14;
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
          return;
        }
    }

    final static ot a(ot param0, boolean param1) {
        RuntimeException var2 = null;
        ut var2_ref = null;
        int var3_int = 0;
        ot var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ot stackIn_20_0 = null;
        ot stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        ot stackOut_19_0 = null;
        ot stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var2_ref = new ut(param0.field_o, param0.field_v);
            var3_int = 0;
            L1: while (true) {
              L2: {
                if (~var3_int <= ~var2_ref.field_y.length) {
                  break L2;
                } else {
                  L3: {
                    if (param0.field_y[var3_int] >>> 1222392632 <= 170) {
                      break L3;
                    } else {
                      var2_ref.field_y[var3_int] = 8947848;
                      break L3;
                    }
                  }
                  var3_int++;
                  if (var8 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = new ot(param0.field_o, param0.field_v);
              iw.a(-54, (ut) (Object) var3);
              on.a(0, 0, on.field_g, on.field_f, 6710886);
              var4 = 2;
              L4: while (true) {
                L5: {
                  L6: {
                    if (10 <= var4) {
                      break L6;
                    } else {
                      var5 = (-var4 + 12 << -1436849369) / 13;
                      var6 = param0.field_o + -var4;
                      var7 = var4 / 4 + var4;
                      var2_ref.c(var7, var4 / 5 + var7, var6, var6, 65793 * var5);
                      var4++;
                      if (var8 != 0) {
                        break L5;
                      } else {
                        if (var8 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  ta.e(125);
                  break L5;
                }
                L7: {
                  if (param1) {
                    break L7;
                  } else {
                    String discarded$1 = ri.a((CharSequence) null, (byte) 122);
                    break L7;
                  }
                }
                var4 = 0;
                L8: while (true) {
                  L9: {
                    L10: {
                      if (var3.field_y.length <= var4) {
                        break L10;
                      } else {
                        stackOut_19_0 = (ot) var3;
                        stackIn_24_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var8 != 0) {
                          break L9;
                        } else {
                          stackIn_20_0.field_y[var4] = hf.a(qj.b(var3.field_y[var4], 16777215), qj.b(param0.field_y[var4], -16777216));
                          var4++;
                          if (var8 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    stackOut_23_0 = (ot) var3;
                    stackIn_24_0 = stackOut_23_0;
                    break L9;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("ri.E(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L11;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                kj.a(12105912, param2 - -param3.field_g, param3.field_t + param4, param3.field_i, param3.field_n);
                break L1;
              }
            }
            super.a(-21, param1, param2, param3, param4);
            var6_int = 92 % ((59 - param0) / 53);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("ri.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param4 + ')');
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
        Object var10 = null;
        int var11 = 0;
        int var12_int = 0;
        String var12 = null;
        int var13 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        hd stackIn_35_0 = null;
        hd stackIn_37_0 = null;
        hd stackIn_39_0 = null;
        hd stackIn_40_0 = null;
        String stackIn_40_1 = null;
        hd stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        hd stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        hd stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        String stackIn_44_2 = null;
        boolean stackIn_73_0 = false;
        String stackIn_88_0 = null;
        hd stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        hd stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        hd stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        hd stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        hd stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        hd stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        hd stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        hd stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        hd stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        hd stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        hd stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        hd stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        hd stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        hd stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        hd stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        hd stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        hd stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        hd stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        hd stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        hd stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        hd stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        int stackIn_125_2 = 0;
        int stackIn_128_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        hd stackOut_34_0 = null;
        hd stackOut_39_0 = null;
        String stackOut_39_1 = null;
        hd stackOut_35_0 = null;
        hd stackOut_37_0 = null;
        String stackOut_37_1 = null;
        hd stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        hd stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        String stackOut_43_2 = null;
        hd stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        String stackOut_41_2 = null;
        boolean stackOut_72_0 = false;
        String stackOut_87_0 = null;
        String stackOut_85_0 = null;
        hd stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        hd stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        hd stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        hd stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        hd stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        hd stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        hd stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        hd stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        hd stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        hd stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        hd stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        hd stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        hd stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        hd stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        hd stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        hd stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        hd stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        hd stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        hd stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        hd stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        int stackOut_122_2 = 0;
        hd stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        int stackOut_124_2 = 0;
        int stackOut_126_0 = 0;
        var13 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var4_int = -109 / ((-55 - param0) / 60);
                  dw.a(127, fj.field_a);
                  if (null == ow.field_b) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
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
                        if (rn.field_d.length != 1) {
                          break L5;
                        } else {
                          if (rn.field_d[0] != 2) {
                            break L5;
                          } else {
                            var9 = 0;
                            if (var13 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var9 = 0;
                      var10_int = 0;
                      var11 = 0;
                      L6: while (true) {
                        L7: {
                          L8: {
                            if (var11 >= rn.field_d.length) {
                              break L8;
                            } else {
                              stackOut_9_0 = -1;
                              stackOut_9_1 = ~(er.field_h[var11 / 8] & 1 << (var11 & 7));
                              stackIn_30_0 = stackOut_9_0;
                              stackIn_30_1 = stackOut_9_1;
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              if (var13 != 0) {
                                break L7;
                              } else {
                                L9: {
                                  if (stackIn_10_0 == stackIn_10_1) {
                                    stackOut_15_0 = 0;
                                    stackIn_16_0 = stackOut_15_0;
                                    break L9;
                                  } else {
                                    stackOut_13_0 = 1;
                                    stackIn_16_0 = stackOut_13_0;
                                    break L9;
                                  }
                                }
                                L10: {
                                  var12_int = stackIn_16_0;
                                  if (var12_int == 0) {
                                    break L10;
                                  } else {
                                    var10_int++;
                                    break L10;
                                  }
                                }
                                L11: {
                                  if (var12_int == 0) {
                                    break L11;
                                  } else {
                                    if (rn.field_d[var11] != 2) {
                                      var9 = 1;
                                      if (var13 == 0) {
                                        break L8;
                                      } else {
                                        break L11;
                                      }
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                var11++;
                                if (var13 == 0) {
                                  continue L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          stackOut_29_0 = -1;
                          stackOut_29_1 = ~var10_int;
                          stackIn_30_0 = stackOut_29_0;
                          stackIn_30_1 = stackOut_29_1;
                          break L7;
                        }
                        if (stackIn_30_0 == stackIn_30_1) {
                          var9 = 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L12: {
                      ua.field_k.field_lb = true;
                      if (hw.field_k) {
                        break L12;
                      } else {
                        L13: {
                          stackOut_34_0 = ua.field_k;
                          stackIn_39_0 = stackOut_34_0;
                          stackIn_35_0 = stackOut_34_0;
                          if (var9 != 0) {
                            stackOut_39_0 = (hd) (Object) stackIn_39_0;
                            stackOut_39_1 = bm.field_F;
                            stackIn_40_0 = stackOut_39_0;
                            stackIn_40_1 = stackOut_39_1;
                            break L13;
                          } else {
                            stackOut_35_0 = (hd) (Object) stackIn_35_0;
                            stackIn_37_0 = stackOut_35_0;
                            stackOut_37_0 = (hd) (Object) stackIn_37_0;
                            stackOut_37_1 = wp.field_e;
                            stackIn_40_0 = stackOut_37_0;
                            stackIn_40_1 = stackOut_37_1;
                            break L13;
                          }
                        }
                        L14: {
                          stackIn_40_0.field_E = ((String) (Object) stackIn_40_1).toUpperCase();
                          stackOut_40_0 = w.field_e;
                          stackOut_40_1 = -18;
                          stackIn_43_0 = stackOut_40_0;
                          stackIn_43_1 = stackOut_40_1;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          if (var9 != 0) {
                            stackOut_43_0 = (hd) (Object) stackIn_43_0;
                            stackOut_43_1 = stackIn_43_1;
                            stackOut_43_2 = ko.field_j;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            stackIn_44_2 = stackOut_43_2;
                            break L14;
                          } else {
                            stackOut_41_0 = (hd) (Object) stackIn_41_0;
                            stackOut_41_1 = stackIn_41_1;
                            stackOut_41_2 = vr.field_b;
                            stackIn_44_0 = stackOut_41_0;
                            stackIn_44_1 = stackOut_41_1;
                            stackIn_44_2 = stackOut_41_2;
                            break L14;
                          }
                        }
                        L15: {
                          stackIn_44_0.field_E = vo.a((byte) stackIn_44_1, stackIn_44_2, new String[1]);
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
                            var10_int = 0;
                            L17: while (true) {
                              L18: {
                                L19: {
                                  if (var10_int >= ss.field_j) {
                                    break L19;
                                  } else {
                                    m.field_f[var10_int] = false;
                                    var10_int++;
                                    if (var13 != 0) {
                                      break L18;
                                    } else {
                                      if (var13 == 0) {
                                        continue L17;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                }
                                pl.a(0, ss.field_j, ow.field_b, -1, (byte) -121, -1, -1, true);
                                break L18;
                              }
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
                            }
                          } else {
                            break L15;
                          }
                        }
                        if (tt.field_c) {
                          break L3;
                        } else {
                          ua.field_k.field_lb = false;
                          if (!ua.field_k.field_Q) {
                            break L3;
                          } else {
                            L20: {
                              var10 = null;
                              if (!ee.field_e) {
                                break L20;
                              } else {
                                var10 = (Object) (Object) ("<col=A00000>" + qk.field_H + "</col>");
                                break L20;
                              }
                            }
                            var11 = 0;
                            L21: while (true) {
                              L22: {
                                if (var11 >= ss.field_j) {
                                  break L22;
                                } else {
                                  stackOut_72_0 = m.field_f[var11];
                                  stackIn_128_0 = stackOut_72_0 ? 1 : 0;
                                  stackIn_73_0 = stackOut_72_0;
                                  if (var13 != 0) {
                                    break L2;
                                  } else {
                                    L23: {
                                      if (stackIn_73_0) {
                                        L24: {
                                          var12 = "<col=A00000>" + ok.field_b[var11] + "</col>";
                                          if (null != var10) {
                                            break L24;
                                          } else {
                                            var10 = (Object) (Object) var12;
                                            if (var13 == 0) {
                                              break L23;
                                            } else {
                                              break L24;
                                            }
                                          }
                                        }
                                        var10 = (Object) (Object) ((String) var10 + ", " + var12);
                                        break L23;
                                      } else {
                                        break L23;
                                      }
                                    }
                                    var11++;
                                    if (var13 == 0) {
                                      continue L21;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                              }
                              sn.field_e = "<col=A00000>" + op.field_t + "<br>" + ll.field_h + (String) var10;
                              if (var13 == 0) {
                                break L3;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                      }
                    }
                    L25: {
                      ac.field_b.field_lb = false;
                      w.field_e.field_E = qr.field_c;
                      if (var9 == 0) {
                        stackOut_87_0 = ea.field_g;
                        stackIn_88_0 = stackOut_87_0;
                        break L25;
                      } else {
                        stackOut_85_0 = rl.field_s;
                        stackIn_88_0 = stackOut_85_0;
                        break L25;
                      }
                    }
                    L26: {
                      var10 = (Object) (Object) stackIn_88_0;
                      var11 = nv.field_F.field_X.a((String) var10) + nv.field_F.field_X.a('.') * 3;
                      if (16 != (de.field_c & 48)) {
                        break L26;
                      } else {
                        var10 = (Object) (Object) ((String) var10 + ".");
                        break L26;
                      }
                    }
                    L27: {
                      nv.field_F.field_A = 0;
                      nv.field_F.field_kb = (nv.field_F.field_q + -var11) / 2;
                      if ((de.field_c & 48) != 32) {
                        break L27;
                      } else {
                        var10 = (Object) (Object) ((String) var10 + "..");
                        break L27;
                      }
                    }
                    L28: {
                      if (48 != (48 & de.field_c)) {
                        break L28;
                      } else {
                        var10 = (Object) (Object) ((String) var10 + "...");
                        break L28;
                      }
                    }
                    nv.field_F.field_E = (String) var10;
                    ua.field_k.field_E = vt.field_a.toUpperCase();
                    break L3;
                  }
                }
                L29: {
                  L30: {
                    stackOut_95_0 = dn.field_Cb;
                    stackOut_95_1 = 0;
                    stackIn_104_0 = stackOut_95_0;
                    stackIn_104_1 = stackOut_95_1;
                    stackIn_96_0 = stackOut_95_0;
                    stackIn_96_1 = stackOut_95_1;
                    if (!param2) {
                      break L30;
                    } else {
                      stackOut_96_0 = (hd) (Object) stackIn_96_0;
                      stackOut_96_1 = stackIn_96_1;
                      stackIn_104_0 = stackOut_96_0;
                      stackIn_104_1 = stackOut_96_1;
                      stackIn_97_0 = stackOut_96_0;
                      stackIn_97_1 = stackOut_96_1;
                      if (param1) {
                        break L30;
                      } else {
                        stackOut_97_0 = (hd) (Object) stackIn_97_0;
                        stackOut_97_1 = stackIn_97_1;
                        stackIn_99_0 = stackOut_97_0;
                        stackIn_99_1 = stackOut_97_1;
                        stackOut_99_0 = (hd) (Object) stackIn_99_0;
                        stackOut_99_1 = stackIn_99_1;
                        stackIn_104_0 = stackOut_99_0;
                        stackIn_104_1 = stackOut_99_1;
                        stackIn_100_0 = stackOut_99_0;
                        stackIn_100_1 = stackOut_99_1;
                        if (td.field_b) {
                          break L30;
                        } else {
                          stackOut_100_0 = (hd) (Object) stackIn_100_0;
                          stackOut_100_1 = stackIn_100_1;
                          stackIn_102_0 = stackOut_100_0;
                          stackIn_102_1 = stackOut_100_1;
                          stackOut_102_0 = (hd) (Object) stackIn_102_0;
                          stackOut_102_1 = stackIn_102_1;
                          stackOut_102_2 = 1;
                          stackIn_105_0 = stackOut_102_0;
                          stackIn_105_1 = stackOut_102_1;
                          stackIn_105_2 = stackOut_102_2;
                          break L29;
                        }
                      }
                    }
                  }
                  stackOut_104_0 = (hd) (Object) stackIn_104_0;
                  stackOut_104_1 = stackIn_104_1;
                  stackOut_104_2 = 0;
                  stackIn_105_0 = stackOut_104_0;
                  stackIn_105_1 = stackOut_104_1;
                  stackIn_105_2 = stackOut_104_2;
                  break L29;
                }
                L31: {
                  L32: {
                    ((hd) (Object) stackIn_105_0).b(stackIn_105_1, stackIn_105_2 != 0);
                    stackOut_105_0 = fp.field_p;
                    stackOut_105_1 = 0;
                    stackIn_114_0 = stackOut_105_0;
                    stackIn_114_1 = stackOut_105_1;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    if (!param2) {
                      break L32;
                    } else {
                      stackOut_106_0 = (hd) (Object) stackIn_106_0;
                      stackOut_106_1 = stackIn_106_1;
                      stackIn_114_0 = stackOut_106_0;
                      stackIn_114_1 = stackOut_106_1;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      if (param1) {
                        break L32;
                      } else {
                        stackOut_107_0 = (hd) (Object) stackIn_107_0;
                        stackOut_107_1 = stackIn_107_1;
                        stackIn_109_0 = stackOut_107_0;
                        stackIn_109_1 = stackOut_107_1;
                        stackOut_109_0 = (hd) (Object) stackIn_109_0;
                        stackOut_109_1 = stackIn_109_1;
                        stackIn_114_0 = stackOut_109_0;
                        stackIn_114_1 = stackOut_109_1;
                        stackIn_110_0 = stackOut_109_0;
                        stackIn_110_1 = stackOut_109_1;
                        if (td.field_b) {
                          break L32;
                        } else {
                          stackOut_110_0 = (hd) (Object) stackIn_110_0;
                          stackOut_110_1 = stackIn_110_1;
                          stackIn_112_0 = stackOut_110_0;
                          stackIn_112_1 = stackOut_110_1;
                          stackOut_112_0 = (hd) (Object) stackIn_112_0;
                          stackOut_112_1 = stackIn_112_1;
                          stackOut_112_2 = 1;
                          stackIn_115_0 = stackOut_112_0;
                          stackIn_115_1 = stackOut_112_1;
                          stackIn_115_2 = stackOut_112_2;
                          break L31;
                        }
                      }
                    }
                  }
                  stackOut_114_0 = (hd) (Object) stackIn_114_0;
                  stackOut_114_1 = stackIn_114_1;
                  stackOut_114_2 = 0;
                  stackIn_115_0 = stackOut_114_0;
                  stackIn_115_1 = stackOut_114_1;
                  stackIn_115_2 = stackOut_114_2;
                  break L31;
                }
                L33: {
                  L34: {
                    ((hd) (Object) stackIn_115_0).b(stackIn_115_1, stackIn_115_2 != 0);
                    stackOut_115_0 = tn.field_f;
                    stackOut_115_1 = 0;
                    stackIn_124_0 = stackOut_115_0;
                    stackIn_124_1 = stackOut_115_1;
                    stackIn_116_0 = stackOut_115_0;
                    stackIn_116_1 = stackOut_115_1;
                    if (!param2) {
                      break L34;
                    } else {
                      stackOut_116_0 = (hd) (Object) stackIn_116_0;
                      stackOut_116_1 = stackIn_116_1;
                      stackIn_124_0 = stackOut_116_0;
                      stackIn_124_1 = stackOut_116_1;
                      stackIn_117_0 = stackOut_116_0;
                      stackIn_117_1 = stackOut_116_1;
                      if (param1) {
                        break L34;
                      } else {
                        stackOut_117_0 = (hd) (Object) stackIn_117_0;
                        stackOut_117_1 = stackIn_117_1;
                        stackIn_119_0 = stackOut_117_0;
                        stackIn_119_1 = stackOut_117_1;
                        stackOut_119_0 = (hd) (Object) stackIn_119_0;
                        stackOut_119_1 = stackIn_119_1;
                        stackIn_124_0 = stackOut_119_0;
                        stackIn_124_1 = stackOut_119_1;
                        stackIn_120_0 = stackOut_119_0;
                        stackIn_120_1 = stackOut_119_1;
                        if (!td.field_b) {
                          break L34;
                        } else {
                          stackOut_120_0 = (hd) (Object) stackIn_120_0;
                          stackOut_120_1 = stackIn_120_1;
                          stackIn_122_0 = stackOut_120_0;
                          stackIn_122_1 = stackOut_120_1;
                          stackOut_122_0 = (hd) (Object) stackIn_122_0;
                          stackOut_122_1 = stackIn_122_1;
                          stackOut_122_2 = 1;
                          stackIn_125_0 = stackOut_122_0;
                          stackIn_125_1 = stackOut_122_1;
                          stackIn_125_2 = stackOut_122_2;
                          break L33;
                        }
                      }
                    }
                  }
                  stackOut_124_0 = (hd) (Object) stackIn_124_0;
                  stackOut_124_1 = stackIn_124_1;
                  stackOut_124_2 = 0;
                  stackIn_125_0 = stackOut_124_0;
                  stackIn_125_1 = stackOut_124_1;
                  stackIn_125_2 = stackOut_124_2;
                  break L33;
                }
                ((hd) (Object) stackIn_125_0).b(stackIn_125_1, stackIn_125_2 != 0);
                ni.field_l.field_b.h((byte) 118);
                if (null == ow.field_b) {
                  break L1;
                } else {
                  stackOut_126_0 = 0;
                  stackIn_128_0 = stackOut_126_0;
                  break L2;
                }
              }
              L35: {
                if (stackIn_128_0 != ac.field_b.field_sb) {
                  nv.a(param3, 32361);
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                if (ua.field_k.field_sb != 0) {
                  L37: {
                    if (hw.field_k) {
                      break L37;
                    } else {
                      up.a(param3, 0);
                      if (var13 == 0) {
                        break L36;
                      } else {
                        break L37;
                      }
                    }
                  }
                  mp.a(param3, (byte) 79);
                  break L36;
                } else {
                  break L36;
                }
              }
              ma.a(param3, (byte) -127, ow.field_b, true);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var4, "ri.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        Object stackIn_5_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_33_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
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
            var3 = new char[var2_int];
            if (param1 == -100) {
              var4 = 0;
              L2: while (true) {
                L3: {
                  if (var2_int <= var4) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        var5 = param0.charAt(var4);
                        if (var5 < 65) {
                          break L5;
                        } else {
                          if (var5 > 90) {
                            break L5;
                          } else {
                            var3[var4] = (char)(var5 + 32);
                            if (var6 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L6: {
                        L7: {
                          if (var5 < 97) {
                            break L7;
                          } else {
                            if (var5 <= 122) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (var5 < 48) {
                            break L8;
                          } else {
                            if (57 >= var5) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var3[var4] = '_';
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                      var3[var4] = (char) var5;
                      break L4;
                    }
                    var4++;
                    if (var6 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_33_0 = new String(var3);
                stackIn_34_0 = stackOut_33_0;
                break L0;
              }
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (String) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var2;
            stackOut_35_1 = new StringBuilder().append("ri.G(");
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L9;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L9;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + param1 + ')');
        }
        return stackIn_34_0;
    }

    public static void b(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_u = null;
              if (param0) {
                break L1;
              } else {
                field_s = null;
                break L1;
              }
            }
            field_s = null;
            field_v = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "ri.D(" + param0 + ')');
        }
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
