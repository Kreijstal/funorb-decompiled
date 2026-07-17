/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int field_e;
    static String field_b;
    static int[][] field_f;
    static int[] field_d;
    static int[] field_c;
    static wf[] field_a;
    static double[] field_g;

    final static void a(ah param0, byte param1, kh[] param2, int[] param3, ah param4) {
        kh[] var5 = null;
        kh[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        de var7 = null;
        hl var8 = null;
        hl var9 = null;
        hl var10 = null;
        hl var11 = null;
        oh[] var12 = null;
        oh[] var13 = null;
        oh[] var14 = null;
        hl var15 = null;
        oh[] var16 = null;
        oh[] var17 = null;
        int var18 = 0;
        kh[] stackIn_10_0 = null;
        kh[] stackIn_13_0 = null;
        kh[] stackOut_9_0 = null;
        kh[] stackOut_12_0 = null;
        L0: {
          L1: {
            var18 = TetraLink.field_J;
            var5 = el.a(param4, "crowns", "lobby", -1409);
            fh.field_h = var5.length;
            if (param2 == null) {
              break L1;
            } else {
              var6 = new kh[param2.length + fh.field_h];
              var7_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (fh.field_h <= var7_int) {
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
                  if (var7_int >= param2.length) {
                    break L1;
                  } else {
                    stackOut_9_0 = (kh[]) var6;
                    stackIn_13_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      stackIn_10_0[fh.field_h + var7_int] = param2[var7_int];
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
            }
          }
          stackOut_12_0 = (kh[]) var5;
          stackIn_13_0 = stackOut_12_0;
          break L0;
        }
        var6_array = new int[stackIn_13_0.length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              if (fh.field_h <= var7_int) {
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
              if (param2 == null) {
                break L9;
              } else {
                L10: {
                  if (param3 != null) {
                    break L10;
                  } else {
                    var7_int = 0;
                    L11: while (true) {
                      L12: {
                        if (param2.length <= var7_int) {
                          break L12;
                        } else {
                          var6_array[fh.field_h - -var7_int] = param2[var7_int].field_f;
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
                  if (var7_int >= param2.length) {
                    break L9;
                  } else {
                    var6_array[var7_int + fh.field_h] = param3[var7_int];
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
            wc.field_J = 2;
            qe.field_d = 15;
            ai.field_d = 11;
            fn.field_Q = 4;
            eh.field_w = 2;
            break L7;
          }
          L14: {
            var7 = pm.a("lobby", "largefont", param4, param0, -83);
            rn.field_e = pm.a("lobby", "generalfont", param4, param0, -106);
            uf.field_g = pm.a("lobby", "chatfont", param4, param0, -58);
            var7.a((oi[]) (Object) var5, var6_array);
            rn.field_e.a((oi[]) (Object) var5, var6_array);
            uf.field_g.a((oi[]) (Object) var5, var6_array);
            var8 = new hl(0L, (hl) null);
            var8.field_N = 16777215;
            var8.field_Ib = (jb) (Object) var7;
            var8.field_Q = qe.field_d;
            var8.field_J = 1;
            var9 = var8;
            var9.field_xb = 1;
            var10 = new hl(0L, (hl) null);
            var10.field_Q = qe.field_d;
            var10.field_Ib = (jb) (Object) rn.field_e;
            var10.field_N = 16777215;
            var10.field_J = 1;
            var11 = var10;
            var11.field_xb = 1;
            cc.field_j = new hl(0L, var8);
            cc.field_j.field_Eb = kf.a(true, bf.a((byte) -79, param4, "lobby", "heading"));
            u.field_b = new hl(0L, (hl) null);
            u.field_b.field_Eb = el.a(false, false, 8421504, false, 120, 4210752);
            ek.field_o = new hl(0L, (hl) null);
            ek.field_o.field_Eb = ah.a(1, 3, 6316128, 16, 6316128, 114);
            um.field_n = new hl(0L, (hl) null);
            um.field_n.field_Eb = kf.a(true, bf.a((byte) -121, param4, "lobby", "popup"));
            var12 = kf.a(true, bf.a((byte) -102, param4, "lobby", "popup_mouseover"));
            var13 = bf.a((byte) -106, param4, "lobby", "button");
            var14 = kf.a(true, bf.a((byte) -83, param4, "lobby", "tab_active"));
            hl.field_gb = new hl(0L, var8);
            hl.field_gb.field_Eb = var14;
            sn.field_c = new hl(0L, (hl) null);
            sn.field_c.field_vb = ug.a(param4, (byte) -45, "closebutton", "lobby");
            sn.field_c.field_Ab = ug.a(param4, (byte) -45, "closebutton_mouseover", "lobby");
            mn.field_d = new hl(0L, var8);
            mn.field_d.field_Eb = el.a(true, false, 3815994, true, 40, 2039583);
            mb.field_x = new hl(0L, var10);
            mb.field_x.field_V = 2;
            mb.field_x.field_Eb = el.a(true, false, 3815994, false, 30, 2039583);
            ui.field_e = new hl(0L, var10);
            ui.field_e.field_V = 2;
            ui.field_e.field_Eb = el.a(false, false, 3815994, false, 30, 2039583);
            um.field_l = new hl(0L, var10);
            um.field_l.field_V = 2;
            um.field_l.field_Eb = el.a(false, false, 3815994, true, 30, 2039583);
            bk.field_i = new hl(0L, (hl) null);
            bk.field_i.field_N = 13421772;
            bk.field_i.field_J = 1;
            bk.field_i.field_Q = qe.field_d;
            bk.field_i.field_Ib = (jb) (Object) rn.field_e;
            ek.field_n = new hl(0L, bk.field_i);
            ek.field_n.field_N = 16764006;
            ek.field_n.field_ib = 16777215;
            ek.field_n.field_L = 16777215;
            ek.field_n.field_P = 8421504;
            ek.field_n.field_nb = 16777215;
            var15 = new hl(0L, ek.field_n);
            var15.field_N = 16777215;
            var15.field_Ib = (jb) (Object) var7;
            var15.field_Q = qe.field_d;
            tn.field_b = new hl(0L, bk.field_i);
            tn.field_b.field_Eb = el.a(false, false, 2236962, false, 16, 2236962);
            tn.field_b.field_V = 2;
            sd.field_rb = new hl(0L, bk.field_i);
            sd.field_rb.field_Eb = el.a(false, false, 1513239, false, 16, 1513239);
            sd.field_rb.field_V = 2;
            ga.field_c = new hl(0L, tn.field_b);
            ga.field_c.a(ek.field_n, -2147483648);
            sk.field_h = new hl(0L, sd.field_rb);
            sk.field_h.a(ek.field_n, -2147483648);
            var16 = bf.a((byte) -115, param4, "lobby", "button_mouseover");
            TetraLink.field_P = new aa(um.field_n, var12, bk.field_i, ek.field_n, 3, 2, eh.field_w, 3, qe.field_d);
            o.field_r = new hl(0L, ek.field_n);
            o.field_r.field_kb = var16;
            o.field_r.field_Eb = var13;
            o.field_r.field_Jb = 1;
            o.field_r.field_Fb = 1;
            o.field_r.field_D = 1;
            o.field_r.field_E = 1;
            o.field_r.field_pb = bf.a((byte) -86, param4, "lobby", "button_mouseheld");
            o.field_r.field_Gb = bf.a((byte) -98, param4, "lobby", "button_active");
            o.field_r.field_H = bf.a((byte) -105, param4, "lobby", "button_disabled");
            o.field_r.field_xb = 1;
            te.field_O = new hl(0L, ek.field_n);
            te.field_O.field_xb = 1;
            te.field_O.field_Eb = kf.a(true, bf.a((byte) -122, param4, "lobby", "tab_inactive"));
            te.field_O.field_kb = kf.a(true, bf.a((byte) -112, param4, "lobby", "tab_mouseover"));
            te.field_O.field_Gb = var14;
            rc.field_S = new hl(0L, (hl) null);
            rc.field_S.field_Eb = ah.a(-1, 3, 1127256, 16, 1856141, 206);
            il.field_Q = new hl(0L, (hl) null);
            il.field_Q.field_Eb = ah.a(-1, 3, 6052956, 16, 11579568, 290);
            rj.field_l = new hl(0L, var15);
            rj.field_l.field_Jb = 1;
            rj.field_l.field_D = 1;
            rj.field_l.field_E = 1;
            rj.field_l.field_xb = 1;
            rj.field_l.field_Fb = 1;
            k.field_a = new hl(0L, rj.field_l);
            rb.field_Kb = new hl(0L, ek.field_n);
            rb.field_Kb.field_Jb = 1;
            rb.field_Kb.field_xb = 1;
            rb.field_Kb.field_D = 1;
            rb.field_Kb.field_Fb = 1;
            rb.field_Kb.field_E = 1;
            eo.field_c = new hl(0L, rb.field_Kb);
            wh.field_l = new hl(0L, rb.field_Kb);
            rk.field_d = new hl(0L, rj.field_l);
            t.field_o = new hl(0L, rb.field_Kb);
            rh.field_N = new hl(0L, rb.field_Kb);
            ia.field_L = new hl(0L, rb.field_Kb);
            rb.field_Kb.field_Eb = kf.a(true, bf.a((byte) -97, param4, "lobby", "smallbutton"));
            rb.field_Kb.field_kb = kf.a(true, bf.a((byte) -99, param4, "lobby", "smallbutton_mouseover"));
            oh[] dupTemp$5 = kf.a(true, bf.a((byte) -72, param4, "lobby", "smallbutton_active"));
            rb.field_Kb.field_Gb = dupTemp$5;
            rb.field_Kb.field_pb = dupTemp$5;
            rb.field_Kb.field_H = kf.a(true, bf.a((byte) -121, param4, "lobby", "smallbutton_disabled"));
            k.field_a.field_Eb = kf.a(true, bf.a((byte) -98, param4, "lobby", "mediumbutton"));
            k.field_a.field_kb = kf.a(true, bf.a((byte) -114, param4, "lobby", "mediumbutton_mouseover"));
            k.field_a.field_pb = kf.a(true, bf.a((byte) -90, param4, "lobby", "mediumbutton_mouseheld"));
            rj.field_l.field_Eb = kf.a(true, bf.a((byte) -100, param4, "lobby", "bigbutton"));
            rj.field_l.field_kb = kf.a(true, bf.a((byte) -125, param4, "lobby", "bigbutton_mouseover"));
            rj.field_l.field_pb = kf.a(true, bf.a((byte) -118, param4, "lobby", "bigbutton_mouseheld"));
            rj.field_l.field_H = kf.a(true, bf.a((byte) -69, param4, "lobby", "bigbutton_disabled"));
            eo.field_c.field_Eb = kf.a(true, bf.a((byte) -128, param4, "lobby", "greenbutton"));
            eo.field_c.field_kb = kf.a(true, bf.a((byte) -82, param4, "lobby", "greenbutton_mouseover"));
            eo.field_c.field_pb = kf.a(true, bf.a((byte) -93, param4, "lobby", "greenbutton_mouseheld"));
            wh.field_l.field_Eb = kf.a(true, bf.a((byte) -71, param4, "lobby", "redbutton"));
            wh.field_l.field_kb = kf.a(true, bf.a((byte) -73, param4, "lobby", "redbutton_mouseover"));
            wh.field_l.field_pb = kf.a(true, bf.a((byte) -91, param4, "lobby", "redbutton_mouseheld"));
            rk.field_d.field_Eb = kf.a(true, bf.a((byte) -110, param4, "lobby", "backbutton"));
            rk.field_d.field_kb = kf.a(true, bf.a((byte) -99, param4, "lobby", "backbutton_mouseover"));
            rk.field_d.field_pb = kf.a(true, bf.a((byte) -120, param4, "lobby", "backbutton_mouseheld"));
            rk.field_d.field_H = kf.a(true, bf.a((byte) -77, param4, "lobby", "backbutton_disabled"));
            ia.field_L.field_Eb = kf.a(true, bf.a((byte) -88, param4, "lobby", "gameoptionbutton"));
            ia.field_L.field_kb = kf.a(true, bf.a((byte) -119, param4, "lobby", "gameoptionbutton_mouseover"));
            oh[] dupTemp$6 = kf.a(true, bf.a((byte) -84, param4, "lobby", "gameoptionbutton_active"));
            ia.field_L.field_Gb = dupTemp$6;
            ia.field_L.field_pb = dupTemp$6;
            ia.field_L.field_H = kf.a(true, bf.a((byte) -86, param4, "lobby", "gameoptionbutton_disabled"));
            t.field_o.field_Eb = kf.a(true, bf.a((byte) -117, param4, "lobby", "chatbutton"));
            t.field_o.field_kb = kf.a(true, bf.a((byte) -101, param4, "lobby", "chatbutton_mouseover"));
            oh[] dupTemp$7 = kf.a(true, bf.a((byte) -94, param4, "lobby", "chatbutton_active"));
            t.field_o.field_Gb = dupTemp$7;
            t.field_o.field_pb = dupTemp$7;
            rh.field_N.field_Eb = kf.a(true, bf.a((byte) -85, param4, "lobby", "chatfilterbutton"));
            rh.field_N.field_kb = kf.a(true, bf.a((byte) -92, param4, "lobby", "chatfilterbutton_mouseover"));
            oh[] dupTemp$8 = kf.a(true, bf.a((byte) -119, param4, "lobby", "chatfilterbutton_active"));
            rh.field_N.field_Gb = dupTemp$8;
            rh.field_N.field_pb = dupTemp$8;
            var17 = bf.a((byte) -87, param4, "lobby", "checkbox");
            vd.field_c = new mi(0L, var17[1], var17[0], 1, ek.field_n, (String) null);
            ak.field_a = new hl(0L, (hl) null);
            ak.field_a.field_Eb = ok.a(ug.a(param4, (byte) -45, "slideregion", "lobby"), (byte) 21);
            ak.field_a.field_kb = ok.a(ug.a(param4, (byte) -45, "slideregion_mouseover", "lobby"), (byte) 21);
            ak.field_a.field_pb = ok.a(ug.a(param4, (byte) -45, "slideregion_mouseheld", "lobby"), (byte) 21);
            ak.field_a.field_H = ok.a(ug.a(param4, (byte) -45, "slideregion_disabled", "lobby"), (byte) 21);
            bd.field_g = new hl(0L, (hl) null);
            bd.field_g.field_Eb = kf.a(true, bf.a((byte) -124, param4, "lobby", "dragbar"));
            bd.field_g.field_kb = kf.a(true, bf.a((byte) -94, param4, "lobby", "dragbar_mouseover"));
            bd.field_g.field_pb = kf.a(true, bf.a((byte) -103, param4, "lobby", "dragbar_mouseheld"));
            bd.field_g.field_H = kf.a(true, bf.a((byte) -80, param4, "lobby", "dragbar_disabled"));
            oj.field_j = new hl(0L, (hl) null);
            oj.field_j.field_vb = ug.a(param4, (byte) -45, "upbutton", "lobby");
            if (param1 >= 38) {
              break L14;
            } else {
              int discarded$9 = ti.a((byte[]) null, (byte) -120, -19);
              break L14;
            }
          }
          oj.field_j.field_Ab = ug.a(param4, (byte) -45, "upbutton_mouseover", "lobby");
          oj.field_j.field_sb = ug.a(param4, (byte) -45, "upbutton_mouseheld", "lobby");
          oj.field_j.field_y = ug.a(param4, (byte) -45, "upbutton_disabled", "lobby");
          bj.field_c = new hl(0L, (hl) null);
          bj.field_c.field_vb = ug.a(param4, (byte) -45, "downbutton", "lobby");
          bj.field_c.field_Ab = ug.a(param4, (byte) -45, "downbutton_mouseover", "lobby");
          bj.field_c.field_sb = ug.a(param4, (byte) -45, "downbutton_mouseheld", "lobby");
          bj.field_c.field_y = ug.a(param4, (byte) -45, "downbutton_disabled", "lobby");
          qc.field_cb = new bl(0L, oj.field_j, bj.field_c, ak.field_a, bd.field_g);
          nj.field_b = new ji(0L, (hl) null, cb.field_t, qc.field_cb, rb.field_Kb, (String) null, (String) null);
          L15: {
            if (!bg.field_l) {
              break L15;
            } else {
              var18++;
              TetraLink.field_J = var18;
              break L15;
            }
          }
          return;
        }
    }

    final static boolean a(int param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            if (!i.a(param2, false, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3_int >= param1.length()) {
                      break L3;
                    } else {
                      stackOut_7_0 = om.a(param1.charAt(var3_int), false);
                      stackIn_13_0 = stackOut_7_0 ? 1 : 0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (stackIn_8_0) {
                          var3_int++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackOut_9_0 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0 != 0;
                        }
                      }
                    }
                  }
                  stackOut_12_0 = 27 % ((param0 - -17) / 57);
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                }
                var4 = stackIn_13_0;
                stackOut_13_0 = 1;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("ti.E(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final static int a(byte[] param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 47 / ((param1 - 36) / 46);
            stackOut_0_0 = q.a(param0, 2, -19, 0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ti.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + -19 + 41);
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        if (param0 != 2) {
            field_b = null;
        }
        field_b = null;
        field_d = null;
        field_g = null;
        field_f = null;
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, ve param3) {
        try {
            fa.field_d = param2;
            qm.field_b = param3;
            if (param1 != 1) {
                ti.a(-29, -41, 120, (ve) null);
            }
            nc.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ti.C(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_b = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
