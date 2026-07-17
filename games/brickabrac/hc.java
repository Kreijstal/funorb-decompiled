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
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        fr stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        fr stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
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
                var5.field_B = uj.a((byte) -67, var5.field_B, param1, 16);
                var5.field_Q = uj.a((byte) -117, var5.field_Q, param1, 16);
                var5.field_P = uj.a((byte) -110, var5.field_P, param1, param0);
                var5.field_C = (short)param1.c(16, (byte) 79);
                var5.field_G = uj.a((byte) -64, var5.field_G, param1, 16);
                var5.field_b = uj.a((byte) -74, var5.field_b, param1, 16);
                var5.field_c = uj.a((byte) -124, var5.field_c, param1, 16);
                if (var3 != 0) {
                  var5.field_o = (short)param1.c(16, (byte) 52);
                  var5.field_n = uj.a((byte) -107, var5.field_n, param1, 16);
                  var5.field_H = uj.a((byte) -77, var5.field_H, param1, 16);
                  var5.field_a = uj.a((byte) -117, var5.field_a, param1, 16);
                  var5.field_v = uj.a((byte) -68, var5.field_v, param1, 16);
                  var5.field_h = uj.a((byte) -80, var5.field_h, param1, 16);
                  var5.field_t = uj.a((byte) -61, var5.field_t, param1, 16);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 != 0) {
                  int discarded$1 = param1.c(16, (byte) 101);
                  var5.field_z = uj.a((byte) -122, var5.field_z, param1, 16);
                  var5.field_m = uj.a((byte) -92, var5.field_m, param1, 16);
                  var5.field_K = uj.a((byte) -123, var5.field_K, param1, 16);
                  var5.field_j = uj.a((byte) -104, var5.field_j, param1, 16);
                  var5.field_J = uj.a((byte) -124, var5.field_J, param1, 16);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (eo.a(false, param1)) {
                  var5.field_L = uj.a((byte) -65, var5.field_L, param1, 16);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (eo.a(false, param1)) {
                  var5.field_p = ri.a(var5.field_p, 16, param1, 20);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (~var5.field_p.length >= ~var7) {
                          break L7;
                        } else {
                          stackOut_17_0 = var5.field_p[var7] & 255;
                          stackOut_17_1 = var6;
                          stackIn_22_0 = stackOut_17_0;
                          stackIn_22_1 = stackOut_17_1;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          if (var8 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_18_0 <= stackIn_18_1) {
                                break L8;
                              } else {
                                var6 = 255 & var5.field_p[var7];
                                break L8;
                              }
                            }
                            var7++;
                            if (var8 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      stackOut_21_0 = -1;
                      stackOut_21_1 = ~var6;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      break L6;
                    }
                    L9: {
                      if (stackIn_22_0 != stackIn_22_1) {
                        break L9;
                      } else {
                        var5.field_p = null;
                        if (var8 == 0) {
                          break L4;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var5.field_A = (byte)(1 + var6);
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              stackOut_26_0 = (fr) var5;
              stackIn_27_0 = stackOut_26_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var2;
            stackOut_28_1 = new StringBuilder().append("hc.C(").append(param0).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
        return stackIn_27_0;
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 >= -59) {
            field_c = true;
        }
        field_g = null;
    }

    final static void b(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            re.field_b.a(1);
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var1_int >= 32) {
                    break L3;
                  } else {
                    ig.field_M[var1_int] = 0L;
                    var1_int++;
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var1_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (32 <= var1_int) {
                      break L6;
                    } else {
                      sm.field_c[var1_int] = 0L;
                      var1_int++;
                      if (var2 != 0) {
                        break L5;
                      } else {
                        if (var2 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  field_c = false;
                  c.field_a = 0;
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) (Object) runtimeException, "hc.D(" + 4 + 41);
        }
    }

    final static void a(byte param0, tp[] param1, int[] param2, mf param3, mf param4) {
        Object var5 = null;
        int[] var6 = null;
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
        fc[] var19 = null;
        L0: {
          var18 = BrickABrac.field_J ? 1 : 0;
          var5 = (Object) (Object) wq.a("lobby", param3, "crowns", -946715356);
          mq.field_g = ((Object[]) var5).length;
          if (param1 != null) {
            var19 = new fc[mq.field_g - -param1.length];
            var7_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~mq.field_g >= ~var7_int) {
                    break L3;
                  } else {
                    var19[var7_int] = (fc) ((Object[]) var5)[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L2;
                    } else {
                      if (var18 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var7_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  if (param1.length <= var7_int) {
                    break L5;
                  } else {
                    var19[mq.field_g + var7_int] = (fc) (Object) param1[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      if (var18 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var5 = (Object) (Object) var19;
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        var6 = new int[((Object[]) var5).length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              L9: {
                L10: {
                  if (~mq.field_g >= ~var7_int) {
                    break L10;
                  } else {
                    var6[var7_int] = 10;
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
                if (param1 != null) {
                  break L9;
                } else {
                  break L8;
                }
              }
              L11: {
                if (param2 != null) {
                  break L11;
                } else {
                  var7_int = 0;
                  L12: while (true) {
                    L13: {
                      if (var7_int >= param1.length) {
                        break L13;
                      } else {
                        var6[mq.field_g + var7_int] = param1[var7_int].field_h;
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
                if (~var7_int <= ~param1.length) {
                  break L8;
                } else {
                  var6[mq.field_g + var7_int] = param2[var7_int];
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
            np.field_a = 15;
            re.field_g = 2;
            om.field_oc = 4;
            break L7;
          }
          if (param0 >= 102) {
            kn.field_z = 2;
            ok.field_f = 11;
            var7 = nq.a((byte) -37, "lobby", param3, param4, "largefont");
            rd.field_e = nq.a((byte) -37, "lobby", param3, param4, "generalfont");
            ul.field_m = nq.a((byte) -37, "lobby", param3, param4, "chatfont");
            var7.a((fc[]) var5, var6);
            rd.field_e.a((fc[]) var5, var6);
            ul.field_m.a((fc[]) var5, var6);
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
            qh.field_j.field_Jb = qg.a(cr.a("lobby", param3, "heading", 2), (byte) -117);
            lp.field_Ab = new mh(0L, (mh) null);
            lp.field_Ab.field_Jb = vp.a(false, (byte) 83, 8421504, 120, 4210752, false);
            f.field_a = new mh(0L, (mh) null);
            f.field_a.field_Jb = na.a(false, 6316128, 3, 6316128, 114, 1);
            ij.field_c = new mh(0L, (mh) null);
            ij.field_c.field_Jb = qg.a(cr.a("lobby", param3, "popup", 2), (byte) -114);
            var12 = qg.a(cr.a("lobby", param3, "popup_mouseover", 2), (byte) -117);
            var13 = cr.a("lobby", param3, "button", 2);
            var14 = qg.a(cr.a("lobby", param3, "tab_active", 2), (byte) -110);
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
            var16 = cr.a("lobby", param3, "button_mouseover", 2);
            ce.field_b = new br(ij.field_c, var12, ad.field_l, tk.field_t, 3, 2, kn.field_z, 3, np.field_a);
            fi.field_s = new mh(0L, tk.field_t);
            fi.field_s.field_E = 1;
            fi.field_s.field_ub = 1;
            fi.field_s.field_N = 1;
            fi.field_s.field_Gb = var16;
            fi.field_s.field_Jb = var13;
            fi.field_s.field_rb = 1;
            fi.field_s.field_D = cr.a("lobby", param3, "button_mouseheld", 2);
            fi.field_s.field_pb = cr.a("lobby", param3, "button_active", 2);
            fi.field_s.field_Ab = cr.a("lobby", param3, "button_disabled", 2);
            fi.field_s.field_S = 1;
            eh.field_n = new mh(0L, tk.field_t);
            eh.field_n.field_S = 1;
            eh.field_n.field_Jb = qg.a(cr.a("lobby", param3, "tab_inactive", 2), (byte) -119);
            eh.field_n.field_Gb = qg.a(cr.a("lobby", param3, "tab_mouseover", 2), (byte) -124);
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
            uk.field_r.field_Jb = qg.a(cr.a("lobby", param3, "smallbutton", 2), (byte) -119);
            uk.field_r.field_Gb = qg.a(cr.a("lobby", param3, "smallbutton_mouseover", 2), (byte) -114);
            jp[] dupTemp$4 = qg.a(cr.a("lobby", param3, "smallbutton_active", 2), (byte) -102);
            uk.field_r.field_pb = dupTemp$4;
            uk.field_r.field_D = dupTemp$4;
            uk.field_r.field_Ab = qg.a(cr.a("lobby", param3, "smallbutton_disabled", 2), (byte) -120);
            ij.field_b.field_Jb = qg.a(cr.a("lobby", param3, "mediumbutton", 2), (byte) -102);
            ij.field_b.field_Gb = qg.a(cr.a("lobby", param3, "mediumbutton_mouseover", 2), (byte) -105);
            ij.field_b.field_D = qg.a(cr.a("lobby", param3, "mediumbutton_mouseheld", 2), (byte) -123);
            fm.field_b.field_Jb = qg.a(cr.a("lobby", param3, "bigbutton", 2), (byte) -114);
            fm.field_b.field_Gb = qg.a(cr.a("lobby", param3, "bigbutton_mouseover", 2), (byte) -120);
            fm.field_b.field_D = qg.a(cr.a("lobby", param3, "bigbutton_mouseheld", 2), (byte) -114);
            fm.field_b.field_Ab = qg.a(cr.a("lobby", param3, "bigbutton_disabled", 2), (byte) -106);
            ok.field_d.field_Jb = qg.a(cr.a("lobby", param3, "greenbutton", 2), (byte) -127);
            ok.field_d.field_Gb = qg.a(cr.a("lobby", param3, "greenbutton_mouseover", 2), (byte) -126);
            ok.field_d.field_D = qg.a(cr.a("lobby", param3, "greenbutton_mouseheld", 2), (byte) -119);
            ee.field_s.field_Jb = qg.a(cr.a("lobby", param3, "redbutton", 2), (byte) -105);
            ee.field_s.field_Gb = qg.a(cr.a("lobby", param3, "redbutton_mouseover", 2), (byte) -106);
            ee.field_s.field_D = qg.a(cr.a("lobby", param3, "redbutton_mouseheld", 2), (byte) -121);
            ab.field_x.field_Jb = qg.a(cr.a("lobby", param3, "backbutton", 2), (byte) -127);
            ab.field_x.field_Gb = qg.a(cr.a("lobby", param3, "backbutton_mouseover", 2), (byte) -103);
            ab.field_x.field_D = qg.a(cr.a("lobby", param3, "backbutton_mouseheld", 2), (byte) -122);
            ab.field_x.field_Ab = qg.a(cr.a("lobby", param3, "backbutton_disabled", 2), (byte) -107);
            al.field_n.field_Jb = qg.a(cr.a("lobby", param3, "gameoptionbutton", 2), (byte) -115);
            al.field_n.field_Gb = qg.a(cr.a("lobby", param3, "gameoptionbutton_mouseover", 2), (byte) -114);
            jp[] dupTemp$5 = qg.a(cr.a("lobby", param3, "gameoptionbutton_active", 2), (byte) -112);
            al.field_n.field_pb = dupTemp$5;
            al.field_n.field_D = dupTemp$5;
            al.field_n.field_Ab = qg.a(cr.a("lobby", param3, "gameoptionbutton_disabled", 2), (byte) -116);
            im.field_d.field_Jb = qg.a(cr.a("lobby", param3, "chatbutton", 2), (byte) -103);
            im.field_d.field_Gb = qg.a(cr.a("lobby", param3, "chatbutton_mouseover", 2), (byte) -113);
            jp[] dupTemp$6 = qg.a(cr.a("lobby", param3, "chatbutton_active", 2), (byte) -125);
            im.field_d.field_pb = dupTemp$6;
            im.field_d.field_D = dupTemp$6;
            fp.field_u.field_Jb = qg.a(cr.a("lobby", param3, "chatfilterbutton", 2), (byte) -119);
            fp.field_u.field_Gb = qg.a(cr.a("lobby", param3, "chatfilterbutton_mouseover", 2), (byte) -106);
            jp[] dupTemp$7 = qg.a(cr.a("lobby", param3, "chatfilterbutton_active", 2), (byte) -105);
            fp.field_u.field_pb = dupTemp$7;
            fp.field_u.field_D = dupTemp$7;
            var17 = cr.a("lobby", param3, "checkbox", 2);
            of.field_k = new ni(0L, var17[1], var17[0], 1, tk.field_t, (String) null);
            kb.field_Vb = new mh(0L, (mh) null);
            kb.field_Vb.field_Jb = jf.a(pl.a("lobby", "slideregion", (byte) -95, param3), -52);
            kb.field_Vb.field_Gb = jf.a(pl.a("lobby", "slideregion_mouseover", (byte) 104, param3), -71);
            kb.field_Vb.field_D = jf.a(pl.a("lobby", "slideregion_mouseheld", (byte) 118, param3), -86);
            kb.field_Vb.field_Ab = jf.a(pl.a("lobby", "slideregion_disabled", (byte) -47, param3), -39);
            lf.field_s = new mh(0L, (mh) null);
            lf.field_s.field_Jb = qg.a(cr.a("lobby", param3, "dragbar", 2), (byte) -102);
            lf.field_s.field_Gb = qg.a(cr.a("lobby", param3, "dragbar_mouseover", 2), (byte) -119);
            lf.field_s.field_D = qg.a(cr.a("lobby", param3, "dragbar_mouseheld", 2), (byte) -120);
            lf.field_s.field_Ab = qg.a(cr.a("lobby", param3, "dragbar_disabled", 2), (byte) -123);
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
            return;
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        ng.a((byte) -86, param0);
        ce.a(param0, param3, (byte) 94, param2);
        if (param1 != -7812) {
            hc.b(4);
        }
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
