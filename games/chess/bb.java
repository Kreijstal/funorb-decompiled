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
        int[] var19 = null;
        L0: {
          L1: {
            var18 = Chess.field_G;
            var5 = qm.a(1, "lobby", "crowns", param0);
            af.field_g = var5.length;
            if (param1 != null) {
              var6 = new rk[af.field_g + param1.length];
              var7_int = 0;
              L2: while (true) {
                if (var7_int >= af.field_g) {
                  var5 = var6;
                  var7_int = 0;
                  L3: while (true) {
                    if (var7_int >= param1.length) {
                      var19 = new int[var5.length];
                      var6_array = var19;
                      var7_int = 0;
                      break L1;
                    } else {
                      var6[var7_int + af.field_g] = param1[var7_int];
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
              if (var7_int >= af.field_g) {
                break L0;
              } else {
                var19[var7_int] = 10;
                var7_int++;
                break L1;
              }
            }
          }
          L4: while (true) {
            if (var7_int >= af.field_g) {
              break L0;
            } else {
              param4[var7_int] = 10;
              var7_int++;
              continue L4;
            }
          }
        }
        L5: {
          if (param1 == null) {
            break L5;
          } else {
            if (param4 == null) {
              var7_int = 0;
              L6: while (true) {
                if (param1.length <= var7_int) {
                  break L5;
                } else {
                  var6_array[var7_int + af.field_g] = param1[var7_int].field_i;
                  var7_int++;
                  continue L6;
                }
              }
            } else {
              var7_int = 0;
              L7: while (true) {
                if (param1.length <= var7_int) {
                  break L5;
                } else {
                  var6_array[var7_int + af.field_g] = param4[var7_int];
                  var7_int++;
                  continue L7;
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
        var7 = dm.a(0, param0, "largefont", param2, "lobby");
        v.field_k = dm.a(0, param0, "generalfont", param2, "lobby");
        pk.field_a = dm.a(0, param0, "chatfont", param2, "lobby");
        var7.a((hd[]) (Object) var5, var6_array);
        v.field_k.a((hd[]) (Object) var5, var6_array);
        pk.field_a.a((hd[]) (Object) var5, var6_array);
        var8 = new ci(0L, (ci) null);
        var8.field_xb = (lh) (Object) var7;
        var8.field_K = fe.field_g;
        var8.field_ib = 16777215;
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
        int discarded$49 = -9568;
        ma.field_G.field_Ab = rh.a(ao.a(param0, "heading", 2993, "lobby"));
        bj.field_eb = new ci(0L, (ci) null);
        bj.field_eb.field_Ab = il.a(0, 4210752, 120, false, false, 8421504);
        af.field_o = new ci(0L, (ci) null);
        af.field_o.field_Ab = wh.a(93, 114, 3, 6316128, 6316128, 1);
        od.field_V = new ci(0L, (ci) null);
        int discarded$50 = -9568;
        od.field_V.field_Ab = rh.a(ao.a(param0, "popup", 2993, "lobby"));
        int discarded$51 = -9568;
        var12 = rh.a(ao.a(param0, "popup_mouseover", 2993, "lobby"));
        var13 = ao.a(param0, "button", 2993, "lobby");
        int discarded$52 = -9568;
        var14 = rh.a(ao.a(param0, "tab_active", 2993, "lobby"));
        dc.field_s = new ci(0L, var8);
        dc.field_s.field_Ab = var14;
        gd.field_b = new ci(0L, (ci) null);
        gd.field_b.field_jb = wk.a(param0, 1, "closebutton", "lobby");
        gd.field_b.field_Bb = wk.a(param0, 1, "closebutton_mouseover", "lobby");
        wc.field_B = new ci(0L, var8);
        wc.field_B.field_Ab = il.a(0, 2039583, 40, true, true, 3815994);
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
        hg.field_f.a(sj.field_k, -2147483648);
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
        int discarded$53 = -9568;
        ao.field_a.field_Ab = rh.a(ao.a(param0, "tab_inactive", 2993, "lobby"));
        int discarded$54 = -9568;
        ao.field_a.field_Q = rh.a(ao.a(param0, "tab_mouseover", 2993, "lobby"));
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
        int discarded$55 = -9568;
        pa.field_m.field_Ab = rh.a(ao.a(param0, "smallbutton", 2993, "lobby"));
        int discarded$56 = -9568;
        pa.field_m.field_Q = rh.a(ao.a(param0, "smallbutton_mouseover", 2993, "lobby"));
        int discarded$57 = -9568;
        km[] dupTemp$58 = rh.a(ao.a(param0, "smallbutton_active", 2993, "lobby"));
        pa.field_m.field_ab = dupTemp$58;
        pa.field_m.field_Z = dupTemp$58;
        int discarded$59 = -9568;
        pa.field_m.field_D = rh.a(ao.a(param0, "smallbutton_disabled", 2993, "lobby"));
        int discarded$60 = -9568;
        p.field_k.field_Ab = rh.a(ao.a(param0, "mediumbutton", 2993, "lobby"));
        int discarded$61 = -9568;
        p.field_k.field_Q = rh.a(ao.a(param0, "mediumbutton_mouseover", 2993, "lobby"));
        int discarded$62 = -9568;
        p.field_k.field_Z = rh.a(ao.a(param0, "mediumbutton_mouseheld", 2993, "lobby"));
        int discarded$63 = -9568;
        nj.field_x.field_Ab = rh.a(ao.a(param0, "bigbutton", 2993, "lobby"));
        int discarded$64 = -9568;
        nj.field_x.field_Q = rh.a(ao.a(param0, "bigbutton_mouseover", 2993, "lobby"));
        int discarded$65 = -9568;
        nj.field_x.field_Z = rh.a(ao.a(param0, "bigbutton_mouseheld", 2993, "lobby"));
        int discarded$66 = -9568;
        nj.field_x.field_D = rh.a(ao.a(param0, "bigbutton_disabled", 2993, "lobby"));
        int discarded$67 = -9568;
        jd.field_b.field_Ab = rh.a(ao.a(param0, "greenbutton", 2993, "lobby"));
        int discarded$68 = -9568;
        jd.field_b.field_Q = rh.a(ao.a(param0, "greenbutton_mouseover", 2993, "lobby"));
        int discarded$69 = -9568;
        jd.field_b.field_Z = rh.a(ao.a(param0, "greenbutton_mouseheld", 2993, "lobby"));
        int discarded$70 = -9568;
        bo.field_b.field_Ab = rh.a(ao.a(param0, "redbutton", 2993, "lobby"));
        int discarded$71 = -9568;
        bo.field_b.field_Q = rh.a(ao.a(param0, "redbutton_mouseover", 2993, "lobby"));
        int discarded$72 = -9568;
        bo.field_b.field_Z = rh.a(ao.a(param0, "redbutton_mouseheld", 2993, "lobby"));
        int discarded$73 = -9568;
        sc.field_h.field_Ab = rh.a(ao.a(param0, "backbutton", 2993, "lobby"));
        int discarded$74 = -9568;
        sc.field_h.field_Q = rh.a(ao.a(param0, "backbutton_mouseover", 2993, "lobby"));
        int discarded$75 = -9568;
        sc.field_h.field_Z = rh.a(ao.a(param0, "backbutton_mouseheld", 2993, "lobby"));
        int discarded$76 = -9568;
        sc.field_h.field_D = rh.a(ao.a(param0, "backbutton_disabled", 2993, "lobby"));
        int discarded$77 = -9568;
        lc.field_f.field_Ab = rh.a(ao.a(param0, "gameoptionbutton", 2993, "lobby"));
        int discarded$78 = -9568;
        lc.field_f.field_Q = rh.a(ao.a(param0, "gameoptionbutton_mouseover", 2993, "lobby"));
        int discarded$79 = -9568;
        km[] dupTemp$80 = rh.a(ao.a(param0, "gameoptionbutton_active", 2993, "lobby"));
        lc.field_f.field_ab = dupTemp$80;
        lc.field_f.field_Z = dupTemp$80;
        int discarded$81 = -9568;
        lc.field_f.field_D = rh.a(ao.a(param0, "gameoptionbutton_disabled", 2993, "lobby"));
        int discarded$82 = -9568;
        tk.field_d.field_Ab = rh.a(ao.a(param0, "chatbutton", 2993, "lobby"));
        int discarded$83 = -9568;
        tk.field_d.field_Q = rh.a(ao.a(param0, "chatbutton_mouseover", 2993, "lobby"));
        int discarded$84 = -9568;
        km[] dupTemp$85 = rh.a(ao.a(param0, "chatbutton_active", 2993, "lobby"));
        tk.field_d.field_ab = dupTemp$85;
        tk.field_d.field_Z = dupTemp$85;
        int discarded$86 = -9568;
        fi.field_b.field_Ab = rh.a(ao.a(param0, "chatfilterbutton", 2993, "lobby"));
        int discarded$87 = -9568;
        fi.field_b.field_Q = rh.a(ao.a(param0, "chatfilterbutton_mouseover", 2993, "lobby"));
        int discarded$88 = -9568;
        km[] dupTemp$89 = rh.a(ao.a(param0, "chatfilterbutton_active", 2993, "lobby"));
        fi.field_b.field_ab = dupTemp$89;
        fi.field_b.field_Z = dupTemp$89;
        var17 = ao.a(param0, "checkbox", 2993, "lobby");
        kj.field_g = new he(0L, var17[1], var17[0], 1, sj.field_k, (String) null);
        bj.field_ob = new ci(0L, (ci) null);
        int discarded$90 = 4;
        bj.field_ob.field_Ab = aa.a(wk.a(param0, 1, "slideregion", "lobby"));
        int discarded$91 = 4;
        bj.field_ob.field_Q = aa.a(wk.a(param0, 1, "slideregion_mouseover", "lobby"));
        int discarded$92 = 4;
        bj.field_ob.field_Z = aa.a(wk.a(param0, 1, "slideregion_mouseheld", "lobby"));
        int discarded$93 = 4;
        bj.field_ob.field_D = aa.a(wk.a(param0, 1, "slideregion_disabled", "lobby"));
        bf.field_K = new ci(0L, (ci) null);
        int discarded$94 = -9568;
        bf.field_K.field_Ab = rh.a(ao.a(param0, "dragbar", 2993, "lobby"));
        int discarded$95 = -9568;
        bf.field_K.field_Q = rh.a(ao.a(param0, "dragbar_mouseover", 2993, "lobby"));
        int discarded$96 = -9568;
        bf.field_K.field_Z = rh.a(ao.a(param0, "dragbar_mouseheld", 2993, "lobby"));
        int discarded$97 = -9568;
        bf.field_K.field_D = rh.a(ao.a(param0, "dragbar_disabled", 2993, "lobby"));
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
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = Chess.field_G;
          if (param3 > param5) {
            if (param3 < param7) {
              mm.a((byte) -123, param7, wb.field_d, param1, param2, param5, param4, param0, param3);
              break L0;
            } else {
              if (param7 <= param5) {
                mm.a((byte) 108, param3, wb.field_d, param4, param2, param7, param0, param1, param5);
                break L0;
              } else {
                mm.a((byte) -69, param3, wb.field_d, param4, param2, param5, param1, param0, param7);
                break L0;
              }
            }
          } else {
            if (param7 > param5) {
              mm.a((byte) -69, param7, wb.field_d, param1, param2, param3, param0, param4, param5);
              break L0;
            } else {
              if (param3 >= param7) {
                mm.a((byte) -37, param5, wb.field_d, param0, param2, param7, param4, param1, param3);
                break L0;
              } else {
                mm.a((byte) 119, param5, wb.field_d, param0, param2, param3, param1, param4, param7);
                break L0;
              }
            }
          }
        }
    }

    public static void b() {
        field_c = null;
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static void a() {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1_ref == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                        jg.field_K = (int)(var3.longValue() / 1048576L) + 1;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
                        break L3;
                      }
                    }
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1 = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(CharSequence param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 >= 85) {
              stackOut_3_0 = hd.a(16, (byte) 127, true, param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 127;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("bb.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + 16 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(boolean param0) {
        if (!an.field_c) {
            return;
        }
        rh.field_c.a(param0, (byte) 88);
        int var4 = tl.field_Fb.m(-90) ? 1 : 0;
        if (th.field_d != 0) {
            if (var4 == 0) {
                kf.a(-88);
                param0 = false;
            }
        }
        if (!(!param0)) {
            tl.field_Fb.a((byte) -44, 15, 13);
        }
        if (var4 != 0) {
            rh.field_c.a(param0, (byte) 88);
        }
        int var5 = tl.field_Fb.l(49) + tl.field_Fb.field_U;
        if (var5 > 640) {
            hf.field_g = hf.field_g + 5;
        } else {
            if (var5 < 635) {
                if (hf.field_g > 0) {
                    hf.field_g = hf.field_g - 5;
                }
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
