/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static int field_b;
    static java.awt.Color field_e;
    static String field_c;
    static jc field_d;
    static String field_a;

    final static void a(um param0, rk[] param1, um param2, byte param3, int[] param4) {
        rk[] var5 = null;
        rk[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        c var7 = null;
        ci var8 = null;
        ci var9 = null;
        ci var10 = null;
        ci var11 = null;
        km[] var12 = null;
        km[] var13 = null;
        km[] var14 = null;
        ci var15 = null;
        km[] var16 = null;
        km[] var17 = null;
        int var18 = 0;
        rk[] stackIn_11_0 = null;
        rk[] stackIn_14_0 = null;
        rk[] stackOut_10_0 = null;
        rk[] stackOut_13_0 = null;
        L0: {
          L1: {
            var18 = Chess.field_G;
            var5 = qm.a(1, "lobby", "crowns", param0);
            af.field_g = var5.length;
            if (null != param1) {
              var6 = new rk[af.field_g + param1.length];
              var7_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if ((var7_int ^ -1) <= (af.field_g ^ -1)) {
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
                  if (var7_int >= param1.length) {
                    break L1;
                  } else {
                    stackOut_10_0 = (rk[]) var6;
                    stackIn_14_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      stackIn_11_0[var7_int + af.field_g] = param1[var7_int];
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
          stackOut_13_0 = (rk[]) var5;
          stackIn_14_0 = stackOut_13_0;
          break L0;
        }
        var6_array = new int[stackIn_14_0.length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              if (var7_int >= af.field_g) {
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
              if (param1 == null) {
                break L9;
              } else {
                L10: {
                  if (null == param4) {
                    break L10;
                  } else {
                    var7_int = 0;
                    L11: while (true) {
                      L12: {
                        if ((param1.length ^ -1) >= (var7_int ^ -1)) {
                          break L12;
                        } else {
                          var6_array[var7_int + af.field_g] = param4[var7_int];
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
                  if ((param1.length ^ -1) >= (var7_int ^ -1)) {
                    break L9;
                  } else {
                    var6_array[var7_int + af.field_g] = param1[var7_int].field_i;
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
            on.field_e = 2;
            ri.field_g = 4;
            jg.field_I = 11;
            fe.field_g = 15;
            qc.field_e = 2;
            break L7;
          }
          var7 = dm.a(0, param0, "largefont", param2, "lobby");
          v.field_k = dm.a(0, param0, "generalfont", param2, "lobby");
          pk.field_a = dm.a(param3 ^ -105, param0, "chatfont", param2, "lobby");
          var7.a((hd[]) (Object) var5, var6_array);
          v.field_k.a((hd[]) (Object) var5, var6_array);
          pk.field_a.a((hd[]) (Object) var5, var6_array);
          var8 = new ci(0L, (ci) null);
          var8.field_xb = (lh) (Object) var7;
          var8.field_K = fe.field_g;
          var8.field_ib = 16777215;
          if (param3 == -105) {
            var8.field_cb = 1;
            var9 = var8;
            var9.field_fb = 1;
            var10 = new ci(0L, (ci) null);
            var10.field_ib = 16777215;
            var10.field_xb = (lh) (Object) v.field_k;
            var10.field_K = fe.field_g;
            var11 = var10;
            var10.field_cb = 1;
            var11.field_fb = 1;
            ma.field_G = new ci(0L, var8);
            ma.field_G.field_Ab = rh.a(ao.a(param0, "heading", 2993, "lobby"), param3 ^ 9527);
            bj.field_eb = new ci(0L, (ci) null);
            bj.field_eb.field_Ab = il.a(param3 + 105, 4210752, 120, false, false, 8421504);
            af.field_o = new ci(0L, (ci) null);
            af.field_o.field_Ab = wh.a(93, 114, 3, 6316128, 6316128, 1);
            od.field_V = new ci(0L, (ci) null);
            od.field_V.field_Ab = rh.a(ao.a(param0, "popup", 2993, "lobby"), -9568);
            var12 = rh.a(ao.a(param0, "popup_mouseover", 2993, "lobby"), -9568);
            var13 = ao.a(param0, "button", 2993, "lobby");
            var14 = rh.a(ao.a(param0, "tab_active", 2993, "lobby"), param3 + -9463);
            dc.field_s = new ci(0L, var8);
            dc.field_s.field_Ab = var14;
            gd.field_b = new ci(0L, (ci) null);
            gd.field_b.field_jb = wk.a(param0, param3 + 106, "closebutton", "lobby");
            gd.field_b.field_Bb = wk.a(param0, 1, "closebutton_mouseover", "lobby");
            wc.field_B = new ci(0L, var8);
            wc.field_B.field_Ab = il.a(param3 + 105, 2039583, 40, true, true, 3815994);
            bo.field_e = new ci(0L, var10);
            bo.field_e.field_z = 2;
            bo.field_e.field_Ab = il.a(0, 2039583, 30, true, false, 3815994);
            e.field_M = new ci(0L, var10);
            e.field_M.field_z = 2;
            e.field_M.field_Ab = il.a(0, 2039583, 30, false, false, 3815994);
            l.field_j = new ci(0L, var10);
            l.field_j.field_z = 2;
            l.field_j.field_Ab = il.a(0, 2039583, 30, false, true, 3815994);
            qn.field_P = new ci(0L, (ci) null);
            qn.field_P.field_cb = 1;
            qn.field_P.field_xb = (lh) (Object) v.field_k;
            qn.field_P.field_ib = 13421772;
            qn.field_P.field_K = fe.field_g;
            sj.field_k = new ci(0L, qn.field_P);
            sj.field_k.field_P = 16777215;
            sj.field_k.field_T = 16777215;
            sj.field_k.field_A = 8421504;
            sj.field_k.field_O = 16777215;
            sj.field_k.field_ib = 16764006;
            var15 = new ci(0L, sj.field_k);
            var15.field_K = fe.field_g;
            var15.field_ib = 16777215;
            var15.field_xb = (lh) (Object) var7;
            ic.field_c = new ci(0L, qn.field_P);
            ic.field_c.field_Ab = il.a(0, 2236962, 16, false, false, 2236962);
            ic.field_c.field_z = 2;
            r.field_Tb = new ci(0L, qn.field_P);
            r.field_Tb.field_Ab = il.a(0, 1513239, 16, false, false, 1513239);
            r.field_Tb.field_z = 2;
            sk.field_v = new ci(0L, ic.field_c);
            sk.field_v.a(sj.field_k, -2147483648);
            hg.field_f = new ci(0L, r.field_Tb);
            hg.field_f.a(sj.field_k, param3 ^ 2147483543);
            var16 = ao.a(param0, "button_mouseover", 2993, "lobby");
            bd.field_a = new cf(od.field_V, var12, qn.field_P, sj.field_k, 3, 2, qc.field_e, 3, fe.field_g);
            ml.field_f = new ci(0L, sj.field_k);
            ml.field_f.field_G = 1;
            ml.field_f.field_Q = var16;
            ml.field_f.field_bb = 1;
            ml.field_f.field_y = 1;
            ml.field_f.field_R = 1;
            ml.field_f.field_Ab = var13;
            ml.field_f.field_Z = ao.a(param0, "button_mouseheld", 2993, "lobby");
            ml.field_f.field_ab = ao.a(param0, "button_active", 2993, "lobby");
            ml.field_f.field_D = ao.a(param0, "button_disabled", 2993, "lobby");
            ml.field_f.field_fb = 1;
            ao.field_a = new ci(0L, sj.field_k);
            ao.field_a.field_fb = 1;
            ao.field_a.field_Ab = rh.a(ao.a(param0, "tab_inactive", 2993, "lobby"), -9568);
            ao.field_a.field_Q = rh.a(ao.a(param0, "tab_mouseover", param3 ^ -3034, "lobby"), param3 + -9463);
            ao.field_a.field_ab = var14;
            hd.field_b = new ci(0L, (ci) null);
            hd.field_b.field_Ab = wh.a(66, 206, 3, 1856141, 1127256, -1);
            hl.field_d = new ci(0L, (ci) null);
            hl.field_d.field_Ab = wh.a(105, 290, 3, 11579568, 6052956, -1);
            nj.field_x = new ci(0L, var15);
            nj.field_x.field_G = 1;
            nj.field_x.field_bb = 1;
            nj.field_x.field_R = 1;
            nj.field_x.field_y = 1;
            nj.field_x.field_fb = 1;
            p.field_k = new ci(0L, nj.field_x);
            pa.field_m = new ci(0L, sj.field_k);
            pa.field_m.field_y = 1;
            pa.field_m.field_G = 1;
            pa.field_m.field_bb = 1;
            pa.field_m.field_R = 1;
            pa.field_m.field_fb = 1;
            jd.field_b = new ci(0L, pa.field_m);
            bo.field_b = new ci(0L, pa.field_m);
            sc.field_h = new ci(0L, nj.field_x);
            tk.field_d = new ci(0L, pa.field_m);
            fi.field_b = new ci(0L, pa.field_m);
            lc.field_f = new ci(0L, pa.field_m);
            pa.field_m.field_Ab = rh.a(ao.a(param0, "smallbutton", 2993, "lobby"), -9568);
            pa.field_m.field_Q = rh.a(ao.a(param0, "smallbutton_mouseover", 2993, "lobby"), -9568);
            pa.field_m.field_ab = rh.a(ao.a(param0, "smallbutton_active", 2993, "lobby"), -9568);
            pa.field_m.field_Z = rh.a(ao.a(param0, "smallbutton_active", 2993, "lobby"), -9568);
            pa.field_m.field_D = rh.a(ao.a(param0, "smallbutton_disabled", 2993, "lobby"), -9568);
            p.field_k.field_Ab = rh.a(ao.a(param0, "mediumbutton", 2993, "lobby"), param3 + -9463);
            p.field_k.field_Q = rh.a(ao.a(param0, "mediumbutton_mouseover", 2993, "lobby"), -9568);
            p.field_k.field_Z = rh.a(ao.a(param0, "mediumbutton_mouseheld", param3 ^ -3034, "lobby"), -9568);
            nj.field_x.field_Ab = rh.a(ao.a(param0, "bigbutton", 2993, "lobby"), -9568);
            nj.field_x.field_Q = rh.a(ao.a(param0, "bigbutton_mouseover", 2993, "lobby"), param3 ^ 9527);
            nj.field_x.field_Z = rh.a(ao.a(param0, "bigbutton_mouseheld", param3 ^ -3034, "lobby"), -9568);
            nj.field_x.field_D = rh.a(ao.a(param0, "bigbutton_disabled", param3 ^ -3034, "lobby"), -9568);
            jd.field_b.field_Ab = rh.a(ao.a(param0, "greenbutton", 2993, "lobby"), param3 + -9463);
            jd.field_b.field_Q = rh.a(ao.a(param0, "greenbutton_mouseover", 2993, "lobby"), param3 ^ 9527);
            jd.field_b.field_Z = rh.a(ao.a(param0, "greenbutton_mouseheld", param3 ^ -3034, "lobby"), -9568);
            bo.field_b.field_Ab = rh.a(ao.a(param0, "redbutton", param3 ^ -3034, "lobby"), -9568);
            bo.field_b.field_Q = rh.a(ao.a(param0, "redbutton_mouseover", param3 ^ -3034, "lobby"), -9568);
            bo.field_b.field_Z = rh.a(ao.a(param0, "redbutton_mouseheld", 2993, "lobby"), param3 ^ 9527);
            sc.field_h.field_Ab = rh.a(ao.a(param0, "backbutton", 2993, "lobby"), param3 + -9463);
            sc.field_h.field_Q = rh.a(ao.a(param0, "backbutton_mouseover", param3 ^ -3034, "lobby"), -9568);
            sc.field_h.field_Z = rh.a(ao.a(param0, "backbutton_mouseheld", 2993, "lobby"), param3 ^ 9527);
            sc.field_h.field_D = rh.a(ao.a(param0, "backbutton_disabled", 2993, "lobby"), param3 + -9463);
            lc.field_f.field_Ab = rh.a(ao.a(param0, "gameoptionbutton", 2993, "lobby"), -9568);
            lc.field_f.field_Q = rh.a(ao.a(param0, "gameoptionbutton_mouseover", param3 + 3098, "lobby"), -9568);
            lc.field_f.field_ab = rh.a(ao.a(param0, "gameoptionbutton_active", 2993, "lobby"), -9568);
            lc.field_f.field_Z = rh.a(ao.a(param0, "gameoptionbutton_active", 2993, "lobby"), -9568);
            lc.field_f.field_D = rh.a(ao.a(param0, "gameoptionbutton_disabled", param3 + 3098, "lobby"), -9568);
            tk.field_d.field_Ab = rh.a(ao.a(param0, "chatbutton", param3 + 3098, "lobby"), param3 + -9463);
            tk.field_d.field_Q = rh.a(ao.a(param0, "chatbutton_mouseover", param3 ^ -3034, "lobby"), -9568);
            tk.field_d.field_ab = rh.a(ao.a(param0, "chatbutton_active", 2993, "lobby"), -9568);
            tk.field_d.field_Z = rh.a(ao.a(param0, "chatbutton_active", 2993, "lobby"), -9568);
            fi.field_b.field_Ab = rh.a(ao.a(param0, "chatfilterbutton", 2993, "lobby"), -9568);
            fi.field_b.field_Q = rh.a(ao.a(param0, "chatfilterbutton_mouseover", 2993, "lobby"), -9568);
            fi.field_b.field_ab = rh.a(ao.a(param0, "chatfilterbutton_active", 2993, "lobby"), -9568);
            fi.field_b.field_Z = rh.a(ao.a(param0, "chatfilterbutton_active", 2993, "lobby"), -9568);
            var17 = ao.a(param0, "checkbox", 2993, "lobby");
            kj.field_g = new he(0L, var17[1], var17[0], 1, sj.field_k, (String) null);
            bj.field_ob = new ci(0L, (ci) null);
            bj.field_ob.field_Ab = aa.a(wk.a(param0, 1, "slideregion", "lobby"), 4);
            bj.field_ob.field_Q = aa.a(wk.a(param0, 1, "slideregion_mouseover", "lobby"), 4);
            bj.field_ob.field_Z = aa.a(wk.a(param0, 1, "slideregion_mouseheld", "lobby"), 4);
            bj.field_ob.field_D = aa.a(wk.a(param0, 1, "slideregion_disabled", "lobby"), 4);
            bf.field_K = new ci(0L, (ci) null);
            bf.field_K.field_Ab = rh.a(ao.a(param0, "dragbar", 2993, "lobby"), -9568);
            bf.field_K.field_Q = rh.a(ao.a(param0, "dragbar_mouseover", 2993, "lobby"), param3 + -9463);
            bf.field_K.field_Z = rh.a(ao.a(param0, "dragbar_mouseheld", 2993, "lobby"), -9568);
            bf.field_K.field_D = rh.a(ao.a(param0, "dragbar_disabled", 2993, "lobby"), -9568);
            wk.field_f = new ci(0L, (ci) null);
            wk.field_f.field_jb = wk.a(param0, 1, "upbutton", "lobby");
            wk.field_f.field_Bb = wk.a(param0, 1, "upbutton_mouseover", "lobby");
            wk.field_f.field_hb = wk.a(param0, 1, "upbutton_mouseheld", "lobby");
            wk.field_f.field_nb = wk.a(param0, 1, "upbutton_disabled", "lobby");
            jf.field_f = new ci(0L, (ci) null);
            jf.field_f.field_jb = wk.a(param0, 1, "downbutton", "lobby");
            jf.field_f.field_Bb = wk.a(param0, 1, "downbutton_mouseover", "lobby");
            jf.field_f.field_hb = wk.a(param0, 1, "downbutton_mouseheld", "lobby");
            jf.field_f.field_nb = wk.a(param0, 1, "downbutton_disabled", "lobby");
            ia.field_o = new pd(0L, wk.field_f, jf.field_f, bj.field_ob, bf.field_K);
            cn.field_b = new ok(0L, (ci) null, gm.field_b, ia.field_o, pa.field_m, (String) null, (String) null);
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var9 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param6 == 1) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_d = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((param3 ^ -1) < (param5 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param7 > param5) {
                            statePc = 18;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param3 >= param7) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        mm.a((byte) 119, param5, wb.field_d, param0, param2, param3, param1, param4, param7);
                        if (var9 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        mm.a((byte) -37, param5, wb.field_d, param0, param2, param7, param4, param1, param3);
                        if (var9 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        mm.a((byte) -69, param7, wb.field_d, param1, param2, param3, param0, param4, param5);
                        if (var9 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (param3 < param7) {
                            statePc = 33;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((param7 ^ -1) >= (param5 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        mm.a((byte) -69, param3, wb.field_d, param4, param2, param5, param1, param0, param7);
                        if (var9 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        mm.a((byte) 108, param3, wb.field_d, param4, param2, param7, param0, param1, param5);
                        if (var9 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        mm.a((byte) -123, param7, wb.field_d, param1, param2, param5, param4, param0, param3);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var8 = (RuntimeException) (Object) caughtException;
                    throw fk.a((Throwable) (Object) var8, "bb.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_c = null;
              if (param0 == -16987) {
                break L0;
              } else {
                bb.a(-95);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_e = null;
          field_d = null;
          field_a = null;
        }
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            RuntimeException var1_ref = null;
            java.lang.reflect.Method var1_ref2 = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (param0 >= 65) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        try {
                            var1_ref2 = Runtime.class.getMethod("maxMemory", new Class[0]);
                            if (var1_ref2 == null) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof Exception ? 7 : 9);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var2_ref = Runtime.getRuntime();
                            var3 = (Long) var1_ref2.invoke((Object) (Object) var2_ref, (Object[]) null);
                            jg.field_K = (int)(var3.longValue() / 1048576L) + 1;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof Exception ? 7 : 9);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var2 = caughtException;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof Exception ? 7 : 9);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1 = (Exception) (Object) caughtException;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var1_ref = (RuntimeException) (Object) caughtException;
                        throw fk.a((Throwable) (Object) var1_ref, "bb.E(" + param0 + 41);
                    }
                    case 10: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(CharSequence param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 >= 85) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 127;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0;
                }
                case 3: {
                    try {
                        stackOut_3_0 = hd.a(param2, (byte) 127, true, param0);
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        stackOut_6_0 = (RuntimeException) var3;
                        stackOut_6_1 = new StringBuilder().append("bb.C(");
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (param0 == null) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                        stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                        stackOut_7_2 = "{...}";
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_10_2 = stackOut_7_2;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 9: {
                    stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                    stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                    stackOut_9_2 = "null";
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw fk.a((Throwable) (Object) stackIn_10_0, (String) (Object) (stackIn_10_2 + 44 + param1 + 44 + param2 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_29_0 = 0;
        int stackOut_28_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (an.field_c) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        rh.field_c.a(param0, (byte) 88);
                        var4_int = tl.field_Fb.m(-90) ? 1 : 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((th.field_d ^ -1) == -1) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4_int != 0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        kf.a(-88);
                        param0 = false;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        tl.field_Fb.a((byte) -44, param3, param2);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var4_int == 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        rh.field_c.a(param0, (byte) 88);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param1 > 1) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        bb.a((um) null, (rk[]) null, (um) null, (byte) -56, (int[]) null);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5 = tl.field_Fb.l(49) + tl.field_Fb.field_U;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var5 <= 640) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        hf.field_g = hf.field_g + 5;
                        if (Chess.field_G == 0) {
                            statePc = 37;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-636 >= (var5 ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = -1;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 <= (hf.field_g ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        hf.field_g = hf.field_g - 5;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw fk.a((Throwable) (Object) runtimeException, "bb.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 37: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new java.awt.Color(10040319);
        field_c = "Add <%0> to ignore list";
        field_a = "to return to the normal view.";
    }
}
