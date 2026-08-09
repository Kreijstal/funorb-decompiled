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
        km[] dupTemp$0 = null;
        km[] dupTemp$1 = null;
        km[] dupTemp$2 = null;
        km[] dupTemp$3 = null;
        rk[] var5 = null;
        int[] var6 = null;
        rk[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        rk[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
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
        var18 = Chess.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var20 = qm.a(1, "lobby", "crowns", param0);
                var5 = var20;
                af.field_g = var20.length;
                if (param1 != null) {
                  var6_array = new rk[af.field_g + param1.length];
                  var7_int = 0;
                  L3: while (true) {
                    if (var7_int >= af.field_g) {
                      var5 = var6_array;
                      var7_int = 0;
                      L4: while (true) {
                        if (var7_int >= param1.length) {
                          var23 = new int[var5.length];
                          var21 = var23;
                          var19 = var21;
                          var24 = var19;
                          var22 = var24;
                          var6 = var22;
                          var7_int = 0;
                          break L2;
                        } else {
                          var6_array[var7_int + af.field_g] = param1[var7_int];
                          var7_int++;
                          continue L4;
                        }
                      }
                    } else {
                      var6_array[var7_int] = var20[var7_int];
                      var7_int++;
                      continue L3;
                    }
                  }
                } else {
                  var23 = new int[var5.length];
                  var21 = var23;
                  var19 = var21;
                  var24 = var19;
                  var22 = var24;
                  var6 = var22;
                  var7_int = 0;
                  if (var7_int >= af.field_g) {
                    break L1;
                  } else {
                    var23[var7_int] = 10;
                    var7_int++;
                    break L2;
                  }
                }
              }
              L5: while (true) {
                if (var7_int >= af.field_g) {
                  break L1;
                } else {
                  param4[var7_int] = 10;
                  var7_int++;
                  continue L5;
                }
              }
            }
            L6: {
              if (param1 == null) {
                break L6;
              } else {
                if (param4 == null) {
                  var7_int = 0;
                  L7: while (true) {
                    if (param1.length <= var7_int) {
                      break L6;
                    } else {
                      var6[var7_int + af.field_g] = param1[var7_int].field_i;
                      var7_int++;
                      continue L7;
                    }
                  }
                } else {
                  var7_int = 0;
                  L8: while (true) {
                    if (param1.length <= var7_int) {
                      break L6;
                    } else {
                      var6[var7_int + af.field_g] = param4[var7_int];
                      var7_int++;
                      continue L8;
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
            pk.field_a = dm.a(param3 ^ -105, param0, "chatfont", param2, "lobby");
            var7.a(var5, var24);
            v.field_k.a(var5, var24);
            pk.field_a.a(var5, var24);
            var8 = new ci(0L, (ci) null);
            var8.field_xb = (lh) ((Object) var7);
            var8.field_K = fe.field_g;
            var8.field_ib = 16777215;
            if (param3 == -105) {
              var8.field_cb = 1;
              var9 = var8;
              var9.field_fb = 1;
              var10 = new ci(0L, (ci) null);
              var10.field_ib = 16777215;
              var10.field_xb = (lh) ((Object) v.field_k);
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
              qn.field_P.field_xb = (lh) ((Object) v.field_k);
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
              var15.field_xb = (lh) ((Object) var7);
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
              dupTemp$0 = rh.a(ao.a(param0, "smallbutton_active", 2993, "lobby"), -9568);
              pa.field_m.field_ab = dupTemp$0;
              pa.field_m.field_Z = dupTemp$0;
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
              dupTemp$1 = rh.a(ao.a(param0, "gameoptionbutton_active", 2993, "lobby"), -9568);
              lc.field_f.field_ab = dupTemp$1;
              lc.field_f.field_Z = dupTemp$1;
              lc.field_f.field_D = rh.a(ao.a(param0, "gameoptionbutton_disabled", param3 + 3098, "lobby"), -9568);
              tk.field_d.field_Ab = rh.a(ao.a(param0, "chatbutton", param3 + 3098, "lobby"), param3 + -9463);
              tk.field_d.field_Q = rh.a(ao.a(param0, "chatbutton_mouseover", param3 ^ -3034, "lobby"), -9568);
              dupTemp$2 = rh.a(ao.a(param0, "chatbutton_active", 2993, "lobby"), -9568);
              tk.field_d.field_ab = dupTemp$2;
              tk.field_d.field_Z = dupTemp$2;
              fi.field_b.field_Ab = rh.a(ao.a(param0, "chatfilterbutton", 2993, "lobby"), -9568);
              fi.field_b.field_Q = rh.a(ao.a(param0, "chatfilterbutton_mouseover", 2993, "lobby"), -9568);
              dupTemp$3 = rh.a(ao.a(param0, "chatfilterbutton_active", 2993, "lobby"), -9568);
              fi.field_b.field_ab = dupTemp$3;
              fi.field_b.field_Z = dupTemp$3;
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5_ref = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5_ref);

            stackIn_27_1 = new StringBuilder().append("bb.B(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_28_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        L0: {
          var9 = Chess.field_G;
          if (param6 == 1) {
            break L0;
          } else {
            field_d = (jc) null;
            break L0;
          }
        }
        L1: {
          if (param3 > param5) {
            if (param3 < param7) {
              mm.a((byte) -123, param7, wb.field_d, param1, param2, param5, param4, param0, param3);
              break L1;
            } else {
              if (param7 <= param5) {
                mm.a((byte) 108, param3, wb.field_d, param4, param2, param7, param0, param1, param5);
                break L1;
              } else {
                mm.a((byte) -69, param3, wb.field_d, param4, param2, param5, param1, param0, param7);
                break L1;
              }
            }
          } else {
            if (param7 > param5) {
              mm.a((byte) -69, param7, wb.field_d, param1, param2, param3, param0, param4, param5);
              break L1;
            } else {
              if (param3 >= param7) {
                mm.a((byte) -37, param5, wb.field_d, param0, param2, param7, param4, param1, param3);
                break L1;
              } else {
                mm.a((byte) 119, param5, wb.field_d, param0, param2, param3, param1, param4, param7);
                break L1;
              }
            }
          }
        }
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != -16987) {
            bb.a(-95);
        }
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static void a(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            if (param0 >= 65) {
              try {
                L0: {
                  L1: {
                    var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                    if (var1 == null) {
                      break L1;
                    } else {
                      try {
                        L2: {
                          var2 = Runtime.getRuntime();
                          var4 = (Object[]) null;
                          var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                          jg.field_K = (int)(var3.longValue() / 1048576L) + 1;
                          break L2;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          var2_ref = decompiledCaughtException;
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
                  var1_ref = (Exception) (Object) decompiledCaughtException;
                  break L4;
                }
              }
              return;
            } else {
              return;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 85) {
              stackIn_4_0 = hd.a(param2, (byte) 127, true, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 127;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("bb.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        if (!an.field_c) {
            return;
        }
        rh.field_c.a(param0, (byte) 88);
        int var4 = tl.field_Fb.m(-90) ? 1 : 0;
        if (th.field_d != 0 && var4 == 0) {
            kf.a(-88);
            param0 = false;
        }
        if (!(!param0)) {
            tl.field_Fb.a((byte) -44, param3, param2);
        }
        if (var4 != 0) {
            rh.field_c.a(param0, (byte) 88);
        }
        if (param1 <= 1) {
            int[] var6 = (int[]) null;
            bb.a((um) null, (rk[]) null, (um) null, (byte) -56, (int[]) null);
        }
        int var5 = tl.field_Fb.l(49) + tl.field_Fb.field_U;
        if (var5 > 640) {
            hf.field_g = hf.field_g + 5;
        } else {
            if (-636 < (var5 ^ -1) && -1 > (hf.field_g ^ -1)) {
                hf.field_g = hf.field_g - 5;
            }
        }
    }

    static {
        field_e = new java.awt.Color(10040319);
        field_c = "Add <%0> to ignore list";
        field_a = "to return to the normal view.";
    }
}
