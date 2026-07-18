/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jd {
    static String field_a;
    private java.util.zip.Inflater field_c;
    static String field_e;
    static String field_b;
    static km field_d;

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -685) {
                break L1;
              } else {
                jd.a((eh) null, (byte) -118, (int[]) null, (eh) null, (rm[]) null);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var2_int <= ~param1.length()) {
                    break L4;
                  } else {
                    var3 = param1.charAt(var2_int);
                    stackOut_6_0 = bm.a((char) var3, false);
                    stackIn_19_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_7_0) {
                          break L5;
                        } else {
                          if (!kf.a(0, (char) var3)) {
                            stackOut_15_0 = 1;
                            stackIn_16_0 = stackOut_15_0;
                            return stackIn_16_0 != 0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("jd.C(").append(param0).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L6;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final static void a(he param0, int param1, boolean param2, String param3) {
        RuntimeException var4 = null;
        dj var4_ref = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              ai.a(-1, ch.field_a, (int[]) null, (String) null, 0L, (String) null, param0.e((byte) -124), (km) (Object) param0, 60);
              if (!param0.field_kc) {
                break L1;
              } else {
                L2: {
                  if (2 == param0.field_lc) {
                    break L2;
                  } else {
                    if (2 <= hd.field_d) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var4_ref = md.field_e;
                var5_ref_String = oi.a(new String[1], se.field_b, 2);
                var4_ref.field_a.a(1, var5_ref_String, 10);
                break L1;
              }
            }
            L3: {
              md.field_e.b((byte) 102);
              if (param2) {
                L4: {
                  if (md.field_e.field_b == wl.field_b) {
                    break L4;
                  } else {
                    var4_ref = md.field_e;
                    var5_ref_String = oi.a(new String[1], qm.field_Gb, param1 + -17298);
                    var4_ref.field_a.a(1, var5_ref_String, 15);
                    if (!Virogrid.field_F) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var4_ref = md.field_e;
                var5_ref_String = oi.a(new String[1], kg.field_g, param1 ^ 17302);
                var4_ref.field_a.a(param1 + -17299, var5_ref_String, 16);
                break L3;
              } else {
                break L3;
              }
            }
            L5: {
              var4_ref = md.field_e;
              var5 = ii.field_b;
              var6 = a.field_y;
              if (param1 == 17300) {
                break L5;
              } else {
                field_e = null;
                break L5;
              }
            }
            var4_ref.field_a.a(0, 0, 0, var5, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("jd.D(");
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L7;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
            return;
        }
        try {
            field_a = null;
            field_d = null;
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "jd.B(" + param0 + ')');
        }
    }

    public jd() {
        this(-1, 1000000, 1000000);
    }

    final static void a(eh param0, byte param1, int[] param2, eh param3, rm[] param4) {
        rm[] var5 = null;
        rm[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        v var7 = null;
        km var8 = null;
        km var9 = null;
        km var10 = null;
        km var11 = null;
        mg[] var12 = null;
        mg[] var13 = null;
        mg[] var14 = null;
        km var15 = null;
        mg[] var16 = null;
        mg[] var17 = null;
        int var18 = 0;
        rm[] stackIn_11_0 = null;
        rm[] stackIn_14_0 = null;
        rm[] stackOut_10_0 = null;
        rm[] stackOut_13_0 = null;
        L0: {
          L1: {
            var18 = Virogrid.field_F ? 1 : 0;
            var5 = ke.a("crowns", "lobby", param3, 32370);
            we.field_a = var5.length;
            if (param4 != null) {
              var6 = new rm[param4.length + we.field_a];
              var7_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (we.field_a <= var7_int) {
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
                  if (~param4.length >= ~var7_int) {
                    break L1;
                  } else {
                    stackOut_10_0 = (rm[]) var6;
                    stackIn_14_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      stackIn_11_0[var7_int + we.field_a] = param4[var7_int];
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
          stackOut_13_0 = (rm[]) var5;
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
                  if (~we.field_a >= ~var7_int) {
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
                if (param4 != null) {
                  break L9;
                } else {
                  break L8;
                }
              }
              L11: {
                if (null != param2) {
                  break L11;
                } else {
                  var7_int = 0;
                  L12: while (true) {
                    L13: {
                      if (var7_int >= param4.length) {
                        break L13;
                      } else {
                        var6_array[var7_int + we.field_a] = param4[var7_int].field_i;
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
                if (~var7_int <= ~param4.length) {
                  break L8;
                } else {
                  var6_array[var7_int + we.field_a] = param2[var7_int];
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
            td.field_j = 2;
            dl.field_b = 2;
            rf.field_e = 11;
            qi.field_d = 4;
            pg.field_e = 15;
            break L7;
          }
          var7 = a.a("lobby", param3, -95, "largefont", param0);
          db.field_h = a.a("lobby", param3, -63, "generalfont", param0);
          em.field_d = a.a("lobby", param3, -56, "chatfont", param0);
          var7.a((ah[]) (Object) var5, var6_array);
          db.field_h.a((ah[]) (Object) var5, var6_array);
          em.field_d.a((ah[]) (Object) var5, var6_array);
          var8 = new km(0L, (km) null);
          var8.field_C = (e) (Object) var7;
          var8.field_fb = pg.field_e;
          var8.field_E = 16777215;
          var8.field_D = 1;
          var9 = var8;
          var9.field_lb = 1;
          var10 = new km(0L, (km) null);
          var10.field_E = 16777215;
          var10.field_fb = pg.field_e;
          var10.field_C = (e) (Object) db.field_h;
          var11 = var10;
          var10.field_D = 1;
          var11.field_lb = 1;
          kh.field_b = new km(0L, var8);
          kh.field_b.field_vb = he.a(ke.a(32, param3, "lobby", "heading"), 0);
          wn.field_m = new km(0L, (km) null);
          wn.field_m.field_vb = lm.a(4210752, 124, 120, 8421504, false, false);
          p.field_a = new km(0L, (km) null);
          p.field_a.field_vb = ne.a(114, 3, 1, (byte) 106, 6316128, 6316128);
          s.field_f = new km(0L, (km) null);
          s.field_f.field_vb = he.a(ke.a(32, param3, "lobby", "popup"), 0);
          var12 = he.a(ke.a(32, param3, "lobby", "popup_mouseover"), 0);
          var13 = ke.a(32, param3, "lobby", "button");
          var14 = he.a(ke.a(32, param3, "lobby", "tab_active"), 0);
          wh.field_a = new km(0L, var8);
          wh.field_a.field_vb = var14;
          eb.field_b = new km(0L, (km) null);
          eb.field_b.field_qb = sn.a(param3, "closebutton", "lobby", false);
          eb.field_b.field_sb = sn.a(param3, "closebutton_mouseover", "lobby", false);
          me.field_c = new km(0L, var8);
          me.field_c.field_vb = lm.a(2039583, -78, 40, 3815994, true, true);
          ag.field_d = new km(0L, var10);
          ag.field_d.field_z = 2;
          ag.field_d.field_vb = lm.a(2039583, 71, 30, 3815994, false, true);
          jm.field_b = new km(0L, var10);
          jm.field_b.field_z = 2;
          jm.field_b.field_vb = lm.a(2039583, -93, 30, 3815994, false, false);
          he.field_Jb = new km(0L, var10);
          he.field_Jb.field_z = 2;
          he.field_Jb.field_vb = lm.a(2039583, -17, 30, 3815994, true, false);
          ti.field_h = new km(0L, (km) null);
          ti.field_h.field_E = 13421772;
          ti.field_h.field_C = (e) (Object) db.field_h;
          if (param1 > 17) {
            ti.field_h.field_D = 1;
            ti.field_h.field_fb = pg.field_e;
            ma.field_e = new km(0L, ti.field_h);
            ma.field_e.field_E = 16764006;
            ma.field_e.field_db = 8421504;
            ma.field_e.field_ab = 16777215;
            ma.field_e.field_bb = 16777215;
            ma.field_e.field_A = 16777215;
            var15 = new km(0L, ma.field_e);
            var15.field_E = 16777215;
            var15.field_C = (e) (Object) var7;
            var15.field_fb = pg.field_e;
            da.field_n = new km(0L, ti.field_h);
            da.field_n.field_vb = lm.a(2236962, -38, 16, 2236962, false, false);
            da.field_n.field_z = 2;
            ke.field_u = new km(0L, ti.field_h);
            ke.field_u.field_vb = lm.a(1513239, 99, 16, 1513239, false, false);
            ke.field_u.field_z = 2;
            field_d = new km(0L, da.field_n);
            field_d.b(18003, ma.field_e);
            gg.field_F = new km(0L, ke.field_u);
            gg.field_F.b(18003, ma.field_e);
            var16 = ke.a(32, param3, "lobby", "button_mouseover");
            sd.field_f = new ga(s.field_f, var12, ti.field_h, ma.field_e, 3, 2, dl.field_b, 3, pg.field_e);
            od.field_y = new km(0L, ma.field_e);
            od.field_y.field_x = var16;
            od.field_y.field_vb = var13;
            od.field_y.field_O = 1;
            od.field_y.field_hb = 1;
            od.field_y.field_R = 1;
            od.field_y.field_zb = 1;
            od.field_y.field_T = ke.a(32, param3, "lobby", "button_mouseheld");
            od.field_y.field_cb = ke.a(32, param3, "lobby", "button_active");
            od.field_y.field_L = ke.a(32, param3, "lobby", "button_disabled");
            od.field_y.field_lb = 1;
            ve.field_w = new km(0L, ma.field_e);
            ve.field_w.field_lb = 1;
            ve.field_w.field_vb = he.a(ke.a(32, param3, "lobby", "tab_inactive"), 0);
            ve.field_w.field_x = he.a(ke.a(32, param3, "lobby", "tab_mouseover"), 0);
            ve.field_w.field_cb = var14;
            sl.field_h = new km(0L, (km) null);
            sl.field_h.field_vb = ne.a(206, 3, -1, (byte) 106, 1127256, 1856141);
            cc.field_w = new km(0L, (km) null);
            cc.field_w.field_vb = ne.a(290, 3, -1, (byte) 106, 6052956, 11579568);
            bd.field_b = new km(0L, var15);
            bd.field_b.field_zb = 1;
            bd.field_b.field_lb = 1;
            bd.field_b.field_O = 1;
            bd.field_b.field_hb = 1;
            bd.field_b.field_R = 1;
            fa.field_n = new km(0L, bd.field_b);
            eb.field_c = new km(0L, ma.field_e);
            eb.field_c.field_lb = 1;
            eb.field_c.field_O = 1;
            eb.field_c.field_hb = 1;
            eb.field_c.field_R = 1;
            eb.field_c.field_zb = 1;
            id.field_a = new km(0L, eb.field_c);
            kf.field_g = new km(0L, eb.field_c);
            mf.field_j = new km(0L, bd.field_b);
            pl.field_a = new km(0L, eb.field_c);
            nb.field_r = new km(0L, eb.field_c);
            vf.field_e = new km(0L, eb.field_c);
            eb.field_c.field_vb = he.a(ke.a(32, param3, "lobby", "smallbutton"), 0);
            eb.field_c.field_x = he.a(ke.a(32, param3, "lobby", "smallbutton_mouseover"), 0);
            mg[] dupTemp$4 = he.a(ke.a(32, param3, "lobby", "smallbutton_active"), 0);
            eb.field_c.field_cb = dupTemp$4;
            eb.field_c.field_T = dupTemp$4;
            eb.field_c.field_L = he.a(ke.a(32, param3, "lobby", "smallbutton_disabled"), 0);
            fa.field_n.field_vb = he.a(ke.a(32, param3, "lobby", "mediumbutton"), 0);
            fa.field_n.field_x = he.a(ke.a(32, param3, "lobby", "mediumbutton_mouseover"), 0);
            fa.field_n.field_T = he.a(ke.a(32, param3, "lobby", "mediumbutton_mouseheld"), 0);
            bd.field_b.field_vb = he.a(ke.a(32, param3, "lobby", "bigbutton"), 0);
            bd.field_b.field_x = he.a(ke.a(32, param3, "lobby", "bigbutton_mouseover"), 0);
            bd.field_b.field_T = he.a(ke.a(32, param3, "lobby", "bigbutton_mouseheld"), 0);
            bd.field_b.field_L = he.a(ke.a(32, param3, "lobby", "bigbutton_disabled"), 0);
            id.field_a.field_vb = he.a(ke.a(32, param3, "lobby", "greenbutton"), 0);
            id.field_a.field_x = he.a(ke.a(32, param3, "lobby", "greenbutton_mouseover"), 0);
            id.field_a.field_T = he.a(ke.a(32, param3, "lobby", "greenbutton_mouseheld"), 0);
            kf.field_g.field_vb = he.a(ke.a(32, param3, "lobby", "redbutton"), 0);
            kf.field_g.field_x = he.a(ke.a(32, param3, "lobby", "redbutton_mouseover"), 0);
            kf.field_g.field_T = he.a(ke.a(32, param3, "lobby", "redbutton_mouseheld"), 0);
            mf.field_j.field_vb = he.a(ke.a(32, param3, "lobby", "backbutton"), 0);
            mf.field_j.field_x = he.a(ke.a(32, param3, "lobby", "backbutton_mouseover"), 0);
            mf.field_j.field_T = he.a(ke.a(32, param3, "lobby", "backbutton_mouseheld"), 0);
            mf.field_j.field_L = he.a(ke.a(32, param3, "lobby", "backbutton_disabled"), 0);
            vf.field_e.field_vb = he.a(ke.a(32, param3, "lobby", "gameoptionbutton"), 0);
            vf.field_e.field_x = he.a(ke.a(32, param3, "lobby", "gameoptionbutton_mouseover"), 0);
            mg[] dupTemp$5 = he.a(ke.a(32, param3, "lobby", "gameoptionbutton_active"), 0);
            vf.field_e.field_cb = dupTemp$5;
            vf.field_e.field_T = dupTemp$5;
            vf.field_e.field_L = he.a(ke.a(32, param3, "lobby", "gameoptionbutton_disabled"), 0);
            pl.field_a.field_vb = he.a(ke.a(32, param3, "lobby", "chatbutton"), 0);
            pl.field_a.field_x = he.a(ke.a(32, param3, "lobby", "chatbutton_mouseover"), 0);
            mg[] dupTemp$6 = he.a(ke.a(32, param3, "lobby", "chatbutton_active"), 0);
            pl.field_a.field_cb = dupTemp$6;
            pl.field_a.field_T = dupTemp$6;
            nb.field_r.field_vb = he.a(ke.a(32, param3, "lobby", "chatfilterbutton"), 0);
            nb.field_r.field_x = he.a(ke.a(32, param3, "lobby", "chatfilterbutton_mouseover"), 0);
            mg[] dupTemp$7 = he.a(ke.a(32, param3, "lobby", "chatfilterbutton_active"), 0);
            nb.field_r.field_cb = dupTemp$7;
            nb.field_r.field_T = dupTemp$7;
            var17 = ke.a(32, param3, "lobby", "checkbox");
            vd.field_Z = new en(0L, var17[1], var17[0], 1, ma.field_e, (String) null);
            ld.field_b = new km(0L, (km) null);
            ld.field_b.field_vb = qc.a(109, sn.a(param3, "slideregion", "lobby", false));
            ld.field_b.field_x = qc.a(125, sn.a(param3, "slideregion_mouseover", "lobby", false));
            ld.field_b.field_T = qc.a(91, sn.a(param3, "slideregion_mouseheld", "lobby", false));
            ld.field_b.field_L = qc.a(63, sn.a(param3, "slideregion_disabled", "lobby", false));
            pb.field_p = new km(0L, (km) null);
            pb.field_p.field_vb = he.a(ke.a(32, param3, "lobby", "dragbar"), 0);
            pb.field_p.field_x = he.a(ke.a(32, param3, "lobby", "dragbar_mouseover"), 0);
            pb.field_p.field_T = he.a(ke.a(32, param3, "lobby", "dragbar_mouseheld"), 0);
            pb.field_p.field_L = he.a(ke.a(32, param3, "lobby", "dragbar_disabled"), 0);
            ab.field_K = new km(0L, (km) null);
            ab.field_K.field_qb = sn.a(param3, "upbutton", "lobby", false);
            ab.field_K.field_sb = sn.a(param3, "upbutton_mouseover", "lobby", false);
            ab.field_K.field_y = sn.a(param3, "upbutton_mouseheld", "lobby", false);
            ab.field_K.field_rb = sn.a(param3, "upbutton_disabled", "lobby", false);
            tf.field_d = new km(0L, (km) null);
            tf.field_d.field_qb = sn.a(param3, "downbutton", "lobby", false);
            tf.field_d.field_sb = sn.a(param3, "downbutton_mouseover", "lobby", false);
            tf.field_d.field_y = sn.a(param3, "downbutton_mouseheld", "lobby", false);
            tf.field_d.field_rb = sn.a(param3, "downbutton_disabled", "lobby", false);
            ub.field_z = new qm(0L, ab.field_K, tf.field_d, ld.field_b, pb.field_p);
            gg.field_K = new ao(0L, (km) null, gg.field_M, ub.field_z, eb.field_c, (String) null, (String) null);
            return;
          } else {
            return;
          }
        }
    }

    final void a(byte param0, byte[] param1, jc param2) {
        try {
            Exception exception = null;
            RuntimeException var4 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            try {
              L0: {
                L1: {
                  if (param0 == 50) {
                    break L1;
                  } else {
                    field_a = null;
                    break L1;
                  }
                }
                L2: {
                  if (param2.field_g[param2.field_l] != 31) {
                    break L2;
                  } else {
                    if (param2.field_g[1 + param2.field_l] != -117) {
                      break L2;
                    } else {
                      L3: {
                        if (((jd) this).field_c != null) {
                          break L3;
                        } else {
                          ((jd) this).field_c = new java.util.zip.Inflater(true);
                          break L3;
                        }
                      }
                      try {
                        L4: {
                          ((jd) this).field_c.setInput(param2.field_g, 10 + param2.field_l, param2.field_g.length + -10 + (-param2.field_l + -8));
                          int discarded$2 = ((jd) this).field_c.inflate(param1);
                          break L4;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        ((jd) this).field_c.reset();
                        throw new RuntimeException("");
                      }
                      ((jd) this).field_c.reset();
                      break L0;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_18_0 = (RuntimeException) var4;
                stackOut_18_1 = new StringBuilder().append("jd.G(").append(param0).append(',');
                stackIn_21_0 = stackOut_18_0;
                stackIn_21_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param1 == null) {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "null";
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L5;
                } else {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "{...}";
                  stackIn_22_0 = stackOut_19_0;
                  stackIn_22_1 = stackOut_19_1;
                  stackIn_22_2 = stackOut_19_2;
                  break L5;
                }
              }
              L6: {
                stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
                stackIn_25_0 = stackOut_22_0;
                stackIn_25_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param2 == null) {
                  stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                  stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                  stackOut_25_2 = "null";
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  break L6;
                } else {
                  stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                  stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                  stackOut_23_2 = "{...}";
                  stackIn_26_0 = stackOut_23_0;
                  stackIn_26_1 = stackOut_23_1;
                  stackIn_26_2 = stackOut_23_2;
                  break L6;
                }
              }
              throw kg.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            Throwable throwable = null;
            RuntimeException runtimeException = null;
            String var3 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                rh.field_a = param1;
                try {
                  L1: {
                    L2: {
                      var3 = param2.getParameter("cookieprefix");
                      if (param0 <= -13) {
                        break L2;
                      } else {
                        field_d = null;
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        var4 = param2.getParameter("cookiehost");
                        var5 = var3 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                        if (0 != param1.length()) {
                          break L4;
                        } else {
                          var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          if (!Virogrid.field_F) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5 = var5 + "; Expires=" + gh.a(94608000000L + hc.a(-9986), (byte) 122) + "; Max-Age=" + 94608000L;
                      break L3;
                    }
                    q.a("document.cookie=\"" + var5 + "\"", -17107, param2);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    throwable = decompiledCaughtException;
                    break L5;
                  }
                }
                wf.a(param2, 49);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_12_0 = (RuntimeException) runtimeException;
                stackOut_12_1 = new StringBuilder().append("jd.A(").append(param0).append(',');
                stackIn_15_0 = stackOut_12_0;
                stackIn_15_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param1 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L6;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_16_1 = stackOut_13_1;
                  stackIn_16_2 = stackOut_13_2;
                  break L6;
                }
              }
              L7: {
                stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
                stackIn_19_0 = stackOut_16_0;
                stackIn_19_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param2 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L7;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_20_0 = stackOut_17_0;
                  stackIn_20_1 = stackOut_17_1;
                  stackIn_20_2 = stackOut_17_2;
                  break L7;
                }
              }
              throw kg.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private jd(int param0, int param1, int param2) {
    }

    static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = param0 ^ param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2, "jd.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, int param2) {
        try {
            mh.field_g = param2;
            kn.field_I = param0;
            if (param1 != 11) {
                field_e = null;
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "jd.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Dominate the grid<br>to achieve victory!";
        field_e = "Enter name of friend to add to list";
    }
}
