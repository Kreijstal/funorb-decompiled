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
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= param1.length()) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L2: {
                  var3 = param1.charAt(var2_int);
                  if (bm.a((char) var3, false)) {
                    break L2;
                  } else {
                    if (!kf.a(0, (char) var3)) {
                      stackOut_6_0 = 1;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("jd.C(").append(-685).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final static void a(he param0, int param1, boolean param2, String param3) {
        RuntimeException var4 = null;
        dj var4_ref = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
              if (md.field_e.field_b == wl.field_b) {
                var4_ref = md.field_e;
                var5_ref_String = oi.a(new String[1], kg.field_g, 2);
                var4_ref.field_a.a(1, var5_ref_String, 16);
                break L3;
              } else {
                var4_ref = md.field_e;
                var5_ref_String = oi.a(new String[1], qm.field_Gb, 2);
                var4_ref.field_a.a(1, var5_ref_String, 15);
                break L3;
              }
            }
            var4_ref = md.field_e;
            var5 = ii.field_b;
            var6 = a.field_y;
            var4_ref.field_a.a(0, 0, 0, var5, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("jd.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(17300).append(44).append(1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    public static void a() {
        field_e = null;
        field_a = null;
        field_d = null;
        field_b = null;
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
        int[] var19 = null;
        L0: {
          L1: {
            var18 = Virogrid.field_F ? 1 : 0;
            var5 = ke.a("crowns", "lobby", param3, 32370);
            we.field_a = var5.length;
            if (param4 != null) {
              var6 = new rm[param4.length + we.field_a];
              var7_int = 0;
              L2: while (true) {
                if (we.field_a <= var7_int) {
                  var5 = var6;
                  var7_int = 0;
                  L3: while (true) {
                    if (param4.length <= var7_int) {
                      var19 = new int[var5.length];
                      var6_array = var19;
                      var7_int = 0;
                      break L1;
                    } else {
                      var6[var7_int + we.field_a] = param4[var7_int];
                      var7_int++;
                      continue L3;
                    }
                  }
                } else {
                  var6[var7_int] = var5[var7_int];
                  var7_int++;
                  continue L2;
                }
              }
            } else {
              var19 = new int[var5.length];
              var6_array = var19;
              var7_int = 0;
              if (we.field_a <= var7_int) {
                break L0;
              } else {
                var19[var7_int] = 10;
                var7_int++;
                break L1;
              }
            }
          }
          L4: while (true) {
            if (we.field_a <= var7_int) {
              break L0;
            } else {
              param2[var7_int] = 10;
              var7_int++;
              continue L4;
            }
          }
        }
        L5: {
          if (param4 != null) {
            if (param2 != null) {
              var7_int = 0;
              L6: while (true) {
                if (var7_int >= param4.length) {
                  break L5;
                } else {
                  var6_array[var7_int + we.field_a] = param2[var7_int];
                  var7_int++;
                  continue L6;
                }
              }
            } else {
              var7_int = 0;
              L7: while (true) {
                if (var7_int >= param4.length) {
                  break L5;
                } else {
                  var6_array[var7_int + we.field_a] = param4[var7_int].field_i;
                  var7_int++;
                  continue L7;
                }
              }
            }
          } else {
            break L5;
          }
        }
        td.field_j = 2;
        dl.field_b = 2;
        rf.field_e = 11;
        qi.field_d = 4;
        pg.field_e = 15;
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
        int discarded$59 = 0;
        kh.field_b.field_vb = he.a(ke.a(32, param3, "lobby", "heading"));
        wn.field_m = new km(0L, (km) null);
        wn.field_m.field_vb = lm.a(4210752, 124, 120, 8421504, false, false);
        p.field_a = new km(0L, (km) null);
        p.field_a.field_vb = ne.a(114, 3, 1, (byte) 106, 6316128, 6316128);
        s.field_f = new km(0L, (km) null);
        int discarded$60 = 0;
        s.field_f.field_vb = he.a(ke.a(32, param3, "lobby", "popup"));
        int discarded$61 = 0;
        var12 = he.a(ke.a(32, param3, "lobby", "popup_mouseover"));
        var13 = ke.a(32, param3, "lobby", "button");
        int discarded$62 = 0;
        var14 = he.a(ke.a(32, param3, "lobby", "tab_active"));
        wh.field_a = new km(0L, var8);
        wh.field_a.field_vb = var14;
        eb.field_b = new km(0L, (km) null);
        int discarded$63 = 0;
        eb.field_b.field_qb = sn.a(param3, "closebutton", "lobby");
        int discarded$64 = 0;
        eb.field_b.field_sb = sn.a(param3, "closebutton_mouseover", "lobby");
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
        int discarded$65 = 0;
        ve.field_w.field_vb = he.a(ke.a(32, param3, "lobby", "tab_inactive"));
        int discarded$66 = 0;
        ve.field_w.field_x = he.a(ke.a(32, param3, "lobby", "tab_mouseover"));
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
        int discarded$67 = 0;
        eb.field_c.field_vb = he.a(ke.a(32, param3, "lobby", "smallbutton"));
        int discarded$68 = 0;
        eb.field_c.field_x = he.a(ke.a(32, param3, "lobby", "smallbutton_mouseover"));
        int discarded$69 = 0;
        mg[] dupTemp$70 = he.a(ke.a(32, param3, "lobby", "smallbutton_active"));
        eb.field_c.field_cb = dupTemp$70;
        eb.field_c.field_T = dupTemp$70;
        int discarded$71 = 0;
        eb.field_c.field_L = he.a(ke.a(32, param3, "lobby", "smallbutton_disabled"));
        int discarded$72 = 0;
        fa.field_n.field_vb = he.a(ke.a(32, param3, "lobby", "mediumbutton"));
        int discarded$73 = 0;
        fa.field_n.field_x = he.a(ke.a(32, param3, "lobby", "mediumbutton_mouseover"));
        int discarded$74 = 0;
        fa.field_n.field_T = he.a(ke.a(32, param3, "lobby", "mediumbutton_mouseheld"));
        int discarded$75 = 0;
        bd.field_b.field_vb = he.a(ke.a(32, param3, "lobby", "bigbutton"));
        int discarded$76 = 0;
        bd.field_b.field_x = he.a(ke.a(32, param3, "lobby", "bigbutton_mouseover"));
        int discarded$77 = 0;
        bd.field_b.field_T = he.a(ke.a(32, param3, "lobby", "bigbutton_mouseheld"));
        int discarded$78 = 0;
        bd.field_b.field_L = he.a(ke.a(32, param3, "lobby", "bigbutton_disabled"));
        int discarded$79 = 0;
        id.field_a.field_vb = he.a(ke.a(32, param3, "lobby", "greenbutton"));
        int discarded$80 = 0;
        id.field_a.field_x = he.a(ke.a(32, param3, "lobby", "greenbutton_mouseover"));
        int discarded$81 = 0;
        id.field_a.field_T = he.a(ke.a(32, param3, "lobby", "greenbutton_mouseheld"));
        int discarded$82 = 0;
        kf.field_g.field_vb = he.a(ke.a(32, param3, "lobby", "redbutton"));
        int discarded$83 = 0;
        kf.field_g.field_x = he.a(ke.a(32, param3, "lobby", "redbutton_mouseover"));
        int discarded$84 = 0;
        kf.field_g.field_T = he.a(ke.a(32, param3, "lobby", "redbutton_mouseheld"));
        int discarded$85 = 0;
        mf.field_j.field_vb = he.a(ke.a(32, param3, "lobby", "backbutton"));
        int discarded$86 = 0;
        mf.field_j.field_x = he.a(ke.a(32, param3, "lobby", "backbutton_mouseover"));
        int discarded$87 = 0;
        mf.field_j.field_T = he.a(ke.a(32, param3, "lobby", "backbutton_mouseheld"));
        int discarded$88 = 0;
        mf.field_j.field_L = he.a(ke.a(32, param3, "lobby", "backbutton_disabled"));
        int discarded$89 = 0;
        vf.field_e.field_vb = he.a(ke.a(32, param3, "lobby", "gameoptionbutton"));
        int discarded$90 = 0;
        vf.field_e.field_x = he.a(ke.a(32, param3, "lobby", "gameoptionbutton_mouseover"));
        int discarded$91 = 0;
        mg[] dupTemp$92 = he.a(ke.a(32, param3, "lobby", "gameoptionbutton_active"));
        vf.field_e.field_cb = dupTemp$92;
        vf.field_e.field_T = dupTemp$92;
        int discarded$93 = 0;
        vf.field_e.field_L = he.a(ke.a(32, param3, "lobby", "gameoptionbutton_disabled"));
        int discarded$94 = 0;
        pl.field_a.field_vb = he.a(ke.a(32, param3, "lobby", "chatbutton"));
        int discarded$95 = 0;
        pl.field_a.field_x = he.a(ke.a(32, param3, "lobby", "chatbutton_mouseover"));
        int discarded$96 = 0;
        mg[] dupTemp$97 = he.a(ke.a(32, param3, "lobby", "chatbutton_active"));
        pl.field_a.field_cb = dupTemp$97;
        pl.field_a.field_T = dupTemp$97;
        int discarded$98 = 0;
        nb.field_r.field_vb = he.a(ke.a(32, param3, "lobby", "chatfilterbutton"));
        int discarded$99 = 0;
        nb.field_r.field_x = he.a(ke.a(32, param3, "lobby", "chatfilterbutton_mouseover"));
        int discarded$100 = 0;
        mg[] dupTemp$101 = he.a(ke.a(32, param3, "lobby", "chatfilterbutton_active"));
        nb.field_r.field_cb = dupTemp$101;
        nb.field_r.field_T = dupTemp$101;
        var17 = ke.a(32, param3, "lobby", "checkbox");
        vd.field_Z = new en(0L, var17[1], var17[0], 1, ma.field_e, (String) null);
        ld.field_b = new km(0L, (km) null);
        int discarded$102 = 0;
        ld.field_b.field_vb = qc.a(109, sn.a(param3, "slideregion", "lobby"));
        int discarded$103 = 0;
        ld.field_b.field_x = qc.a(125, sn.a(param3, "slideregion_mouseover", "lobby"));
        int discarded$104 = 0;
        ld.field_b.field_T = qc.a(91, sn.a(param3, "slideregion_mouseheld", "lobby"));
        int discarded$105 = 0;
        ld.field_b.field_L = qc.a(63, sn.a(param3, "slideregion_disabled", "lobby"));
        pb.field_p = new km(0L, (km) null);
        int discarded$106 = 0;
        pb.field_p.field_vb = he.a(ke.a(32, param3, "lobby", "dragbar"));
        int discarded$107 = 0;
        pb.field_p.field_x = he.a(ke.a(32, param3, "lobby", "dragbar_mouseover"));
        int discarded$108 = 0;
        pb.field_p.field_T = he.a(ke.a(32, param3, "lobby", "dragbar_mouseheld"));
        int discarded$109 = 0;
        pb.field_p.field_L = he.a(ke.a(32, param3, "lobby", "dragbar_disabled"));
        ab.field_K = new km(0L, (km) null);
        int discarded$110 = 0;
        ab.field_K.field_qb = sn.a(param3, "upbutton", "lobby");
        int discarded$111 = 0;
        ab.field_K.field_sb = sn.a(param3, "upbutton_mouseover", "lobby");
        int discarded$112 = 0;
        ab.field_K.field_y = sn.a(param3, "upbutton_mouseheld", "lobby");
        int discarded$113 = 0;
        ab.field_K.field_rb = sn.a(param3, "upbutton_disabled", "lobby");
        tf.field_d = new km(0L, (km) null);
        int discarded$114 = 0;
        tf.field_d.field_qb = sn.a(param3, "downbutton", "lobby");
        int discarded$115 = 0;
        tf.field_d.field_sb = sn.a(param3, "downbutton_mouseover", "lobby");
        int discarded$116 = 0;
        tf.field_d.field_y = sn.a(param3, "downbutton_mouseheld", "lobby");
        int discarded$117 = 0;
        tf.field_d.field_rb = sn.a(param3, "downbutton_disabled", "lobby");
        ub.field_z = new qm(0L, ab.field_K, tf.field_d, ld.field_b, pb.field_p);
        gg.field_K = new ao(0L, (km) null, gg.field_M, ub.field_z, eb.field_c, (String) null, (String) null);
    }

    final void a(byte param0, byte[] param1, jc param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
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
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) runtimeException;
                stackOut_13_1 = new StringBuilder().append("jd.G(").append(param0).append(44);
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param1 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param2 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw kg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String var5 = null;
            String var4 = null;
            try {
                rh.field_a = param1;
                try {
                    var3 = param2.getParameter("cookieprefix");
                    var5 = var3;
                    var5 = var3;
                    if (param0 > -13) {
                        field_d = null;
                    }
                    var4 = param2.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var5 = var3 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                    if (0 == param1.length()) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var5 = var5 + "; Expires=" + gh.a(94608000000L + hc.a(-9986), (byte) 122) + "; Max-Age=" + 94608000L;
                    }
                    q.a("document.cookie=\"" + var5 + "\"", -17107, param2);
                } catch (Throwable throwable) {
                }
                int discarded$0 = 49;
                wf.a(param2);
            } catch (RuntimeException runtimeException) {
                throw kg.a((Throwable) (Object) runtimeException, "jd.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
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
        return param0 ^ param1;
    }

    final static void a(int param0, int param1, int param2) {
        mh.field_g = param2;
        kn.field_I = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Dominate the grid<br>to achieve victory!";
        field_e = "Enter name of friend to add to list";
    }
}
