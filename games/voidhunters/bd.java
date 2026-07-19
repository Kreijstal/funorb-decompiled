/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static String field_a;

    final static void a(int param0, int[] param1, asb param2, asb param3, caa[] param4) {
        phb[] dupTemp$4 = null;
        phb[] dupTemp$5 = null;
        phb[] dupTemp$6 = null;
        phb[] dupTemp$7 = null;
        RuntimeException var5 = null;
        caa[] var5_array = null;
        int[] var6 = null;
        caa[] var6_array = null;
        int var7_int = 0;
        arb var7 = null;
        llb var8 = null;
        llb var9 = null;
        llb var10 = null;
        llb var11 = null;
        phb[] var12 = null;
        phb[] var13 = null;
        phb[] var14 = null;
        llb var15 = null;
        phb[] var16 = null;
        int var17 = 0;
        phb[] var18 = null;
        int var19 = 0;
        int[] var20 = null;
        caa[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
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
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
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
        var19 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var21 = qu.a(-112, "lobby", "crowns", param3);
              var5_array = var21;
              mha.field_a = var21.length;
              if (param4 == null) {
                break L1;
              } else {
                var6_array = new caa[mha.field_a + param4.length];
                var7_int = 0;
                L2: while (true) {
                  if (mha.field_a <= var7_int) {
                    var7_int = 0;
                    L3: while (true) {
                      if (var7_int >= param4.length) {
                        var5_array = var6_array;
                        break L1;
                      } else {
                        var6_array[mha.field_a - -var7_int] = param4[var7_int];
                        var7_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var6_array[var7_int] = var21[var7_int];
                    var7_int++;
                    continue L2;
                  }
                }
              }
            }
            var24 = new int[var5_array.length];
            var22 = var24;
            var20 = var22;
            var25 = var20;
            var23 = var25;
            var6 = var23;
            var7_int = 0;
            L4: while (true) {
              if (mha.field_a <= var7_int) {
                L5: {
                  if (param4 == null) {
                    break L5;
                  } else {
                    if (param1 != null) {
                      var7_int = 0;
                      L6: while (true) {
                        if (param4.length <= var7_int) {
                          break L5;
                        } else {
                          var6[var7_int + mha.field_a] = param1[var7_int];
                          var7_int++;
                          continue L6;
                        }
                      }
                    } else {
                      var7_int = 0;
                      L7: while (true) {
                        if (param4.length <= var7_int) {
                          break L5;
                        } else {
                          var6[mha.field_a + var7_int] = param4[var7_int].field_g;
                          var7_int++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                hi.field_a = 2;
                qs.field_c = 4;
                nna.field_w = 15;
                atb.field_d = 11;
                jk.field_Cb = 2;
                var7 = fab.a(param2, "largefont", 0, param3, "lobby");
                rh.field_o = fab.a(param2, "generalfont", 0, param3, "lobby");
                ef.field_y = fab.a(param2, "chatfont", 0, param3, "lobby");
                var7.a(var5_array, var25);
                rh.field_o.a(var5_array, var25);
                ef.field_y.a(var5_array, var25);
                var8 = new llb(0L, (llb) null);
                var8.field_Y = 16777215;
                var8.field_D = nna.field_w;
                var8.field_eb = (no) ((Object) var7);
                var8.field_B = 1;
                var9 = var8;
                var9.field_F = 1;
                var10 = new llb(0L, (llb) null);
                var10.field_D = nna.field_w;
                var10.field_Y = 16777215;
                var10.field_eb = (no) ((Object) rh.field_o);
                var11 = var10;
                var10.field_B = 1;
                var11.field_F = 1;
                pa.field_a = new llb(0L, var8);
                pa.field_a.field_gb = bbb.a(wjb.a(param3, true, "lobby", "heading"), (byte) 55);
                cwa.field_c = new llb(0L, (llb) null);
                cwa.field_c.field_gb = eib.a(false, false, 4210752, 24436, 8421504, 120);
                asb.field_a = new llb(0L, (llb) null);
                asb.field_a.field_gb = uwa.a(6316128, 114, 1, 6316128, 113, 3);
                msa.field_o = new llb(0L, (llb) null);
                msa.field_o.field_gb = bbb.a(wjb.a(param3, true, "lobby", "popup"), (byte) 111);
                var12 = bbb.a(wjb.a(param3, true, "lobby", "popup_mouseover"), (byte) 106);
                var13 = wjb.a(param3, true, "lobby", "button");
                var14 = bbb.a(wjb.a(param3, true, "lobby", "tab_active"), (byte) -113);
                lo.field_b = new llb(0L, var8);
                lo.field_b.field_gb = var14;
                kn.field_p = new llb(0L, (llb) null);
                kn.field_p.field_tb = gra.a(param3, "closebutton", "lobby", true);
                kn.field_p.field_cb = gra.a(param3, "closebutton_mouseover", "lobby", true);
                bv.field_b = new llb(0L, var8);
                bv.field_b.field_gb = eib.a(true, true, 2039583, 24436, 3815994, 40);
                sdb.field_p = new llb(0L, var10);
                sdb.field_p.field_w = 2;
                sdb.field_p.field_gb = eib.a(true, false, 2039583, 24436, 3815994, 30);
                ki.field_p = new llb(0L, var10);
                ki.field_p.field_w = 2;
                ki.field_p.field_gb = eib.a(false, false, 2039583, 24436, 3815994, 30);
                qsa.field_d = new llb(0L, var10);
                qsa.field_d.field_w = 2;
                qsa.field_d.field_gb = eib.a(false, true, 2039583, 24436, 3815994, 30);
                qc.field_q = new llb(0L, (llb) null);
                qc.field_q.field_B = 1;
                qc.field_q.field_eb = (no) ((Object) rh.field_o);
                qc.field_q.field_Y = 13421772;
                qc.field_q.field_D = nna.field_w;
                iga.field_o = new llb(0L, qc.field_q);
                iga.field_o.field_jb = 8421504;
                iga.field_o.field_U = 16777215;
                iga.field_o.field_ib = 16777215;
                iga.field_o.field_Y = 16764006;
                iga.field_o.field_qb = 16777215;
                var15 = new llb(0L, iga.field_o);
                var15.field_D = nna.field_w;
                var15.field_Y = 16777215;
                var15.field_eb = (no) ((Object) var7);
                mla.field_q = new llb(0L, qc.field_q);
                mla.field_q.field_gb = eib.a(false, false, 2236962, 24436, 2236962, 16);
                mla.field_q.field_w = 2;
                gjb.field_p = new llb(0L, qc.field_q);
                gjb.field_p.field_gb = eib.a(false, false, 1513239, 24436, 1513239, 16);
                gjb.field_p.field_w = 2;
                geb.field_o = new llb(0L, mla.field_q);
                geb.field_o.a(18445, iga.field_o);
                bsa.field_q = new llb(0L, gjb.field_p);
                bsa.field_q.a(18445, iga.field_o);
                var16 = wjb.a(param3, true, "lobby", "button_mouseover");
                aba.field_a = new aw(msa.field_o, var12, qc.field_q, iga.field_o, 3, 2, hi.field_a, 3, nna.field_w);
                dla.field_e = new llb(0L, iga.field_o);
                dla.field_e.field_mb = var16;
                dla.field_e.field_gb = var13;
                dla.field_e.field_fb = 1;
                dla.field_e.field_rb = 1;
                dla.field_e.field_P = 1;
                dla.field_e.field_X = 1;
                dla.field_e.field_A = wjb.a(param3, true, "lobby", "button_mouseheld");
                dla.field_e.field_nb = wjb.a(param3, true, "lobby", "button_active");
                dla.field_e.field_ub = wjb.a(param3, true, "lobby", "button_disabled");
                dla.field_e.field_F = 1;
                vhb.field_c = new llb(0L, iga.field_o);
                vhb.field_c.field_F = 1;
                vhb.field_c.field_gb = bbb.a(wjb.a(param3, true, "lobby", "tab_inactive"), (byte) -124);
                vhb.field_c.field_mb = bbb.a(wjb.a(param3, true, "lobby", "tab_mouseover"), (byte) 72);
                vhb.field_c.field_nb = var14;
                gfb.field_a = new llb(0L, (llb) null);
                gfb.field_a.field_gb = uwa.a(1856141, 206, -1, 1127256, 105, 3);
                as.field_c = new llb(0L, (llb) null);
                var17 = -115 % ((param0 - -71) / 37);
                as.field_c.field_gb = uwa.a(11579568, 290, -1, 6052956, 120, 3);
                qcb.field_p = new llb(0L, var15);
                qcb.field_p.field_rb = 1;
                qcb.field_p.field_P = 1;
                qcb.field_p.field_F = 1;
                qcb.field_p.field_fb = 1;
                qcb.field_p.field_X = 1;
                hnb.field_X = new llb(0L, qcb.field_p);
                jta.field_o = new llb(0L, iga.field_o);
                jta.field_o.field_F = 1;
                jta.field_o.field_P = 1;
                jta.field_o.field_fb = 1;
                jta.field_o.field_X = 1;
                jta.field_o.field_rb = 1;
                jba.field_h = new llb(0L, jta.field_o);
                nfb.field_a = new llb(0L, jta.field_o);
                vj.field_q = new llb(0L, qcb.field_p);
                pva.field_d = new llb(0L, jta.field_o);
                vlb.field_a = new llb(0L, jta.field_o);
                tia.field_M = new llb(0L, jta.field_o);
                jta.field_o.field_gb = bbb.a(wjb.a(param3, true, "lobby", "smallbutton"), (byte) 36);
                jta.field_o.field_mb = bbb.a(wjb.a(param3, true, "lobby", "smallbutton_mouseover"), (byte) -119);
                dupTemp$4 = bbb.a(wjb.a(param3, true, "lobby", "smallbutton_active"), (byte) -96);
                jta.field_o.field_nb = dupTemp$4;
                jta.field_o.field_A = dupTemp$4;
                jta.field_o.field_ub = bbb.a(wjb.a(param3, true, "lobby", "smallbutton_disabled"), (byte) -82);
                hnb.field_X.field_gb = bbb.a(wjb.a(param3, true, "lobby", "mediumbutton"), (byte) 124);
                hnb.field_X.field_mb = bbb.a(wjb.a(param3, true, "lobby", "mediumbutton_mouseover"), (byte) -105);
                hnb.field_X.field_A = bbb.a(wjb.a(param3, true, "lobby", "mediumbutton_mouseheld"), (byte) -106);
                qcb.field_p.field_gb = bbb.a(wjb.a(param3, true, "lobby", "bigbutton"), (byte) 99);
                qcb.field_p.field_mb = bbb.a(wjb.a(param3, true, "lobby", "bigbutton_mouseover"), (byte) -63);
                qcb.field_p.field_A = bbb.a(wjb.a(param3, true, "lobby", "bigbutton_mouseheld"), (byte) -54);
                qcb.field_p.field_ub = bbb.a(wjb.a(param3, true, "lobby", "bigbutton_disabled"), (byte) 49);
                jba.field_h.field_gb = bbb.a(wjb.a(param3, true, "lobby", "greenbutton"), (byte) -84);
                jba.field_h.field_mb = bbb.a(wjb.a(param3, true, "lobby", "greenbutton_mouseover"), (byte) 69);
                jba.field_h.field_A = bbb.a(wjb.a(param3, true, "lobby", "greenbutton_mouseheld"), (byte) -63);
                nfb.field_a.field_gb = bbb.a(wjb.a(param3, true, "lobby", "redbutton"), (byte) -89);
                nfb.field_a.field_mb = bbb.a(wjb.a(param3, true, "lobby", "redbutton_mouseover"), (byte) 52);
                nfb.field_a.field_A = bbb.a(wjb.a(param3, true, "lobby", "redbutton_mouseheld"), (byte) 79);
                vj.field_q.field_gb = bbb.a(wjb.a(param3, true, "lobby", "backbutton"), (byte) -100);
                vj.field_q.field_mb = bbb.a(wjb.a(param3, true, "lobby", "backbutton_mouseover"), (byte) -115);
                vj.field_q.field_A = bbb.a(wjb.a(param3, true, "lobby", "backbutton_mouseheld"), (byte) 76);
                vj.field_q.field_ub = bbb.a(wjb.a(param3, true, "lobby", "backbutton_disabled"), (byte) 39);
                tia.field_M.field_gb = bbb.a(wjb.a(param3, true, "lobby", "gameoptionbutton"), (byte) 29);
                tia.field_M.field_mb = bbb.a(wjb.a(param3, true, "lobby", "gameoptionbutton_mouseover"), (byte) -85);
                dupTemp$5 = bbb.a(wjb.a(param3, true, "lobby", "gameoptionbutton_active"), (byte) 22);
                tia.field_M.field_nb = dupTemp$5;
                tia.field_M.field_A = dupTemp$5;
                tia.field_M.field_ub = bbb.a(wjb.a(param3, true, "lobby", "gameoptionbutton_disabled"), (byte) -85);
                pva.field_d.field_gb = bbb.a(wjb.a(param3, true, "lobby", "chatbutton"), (byte) 54);
                pva.field_d.field_mb = bbb.a(wjb.a(param3, true, "lobby", "chatbutton_mouseover"), (byte) -54);
                dupTemp$6 = bbb.a(wjb.a(param3, true, "lobby", "chatbutton_active"), (byte) -66);
                pva.field_d.field_nb = dupTemp$6;
                pva.field_d.field_A = dupTemp$6;
                vlb.field_a.field_gb = bbb.a(wjb.a(param3, true, "lobby", "chatfilterbutton"), (byte) 123);
                vlb.field_a.field_mb = bbb.a(wjb.a(param3, true, "lobby", "chatfilterbutton_mouseover"), (byte) 21);
                dupTemp$7 = bbb.a(wjb.a(param3, true, "lobby", "chatfilterbutton_active"), (byte) 45);
                vlb.field_a.field_nb = dupTemp$7;
                vlb.field_a.field_A = dupTemp$7;
                var18 = wjb.a(param3, true, "lobby", "checkbox");
                urb.field_o = new qca(0L, var18[1], var18[0], 1, iga.field_o, (String) null);
                ga.field_s = new llb(0L, (llb) null);
                ga.field_s.field_gb = lna.a(false, gra.a(param3, "slideregion", "lobby", true));
                ga.field_s.field_mb = lna.a(false, gra.a(param3, "slideregion_mouseover", "lobby", true));
                ga.field_s.field_A = lna.a(false, gra.a(param3, "slideregion_mouseheld", "lobby", true));
                ga.field_s.field_ub = lna.a(false, gra.a(param3, "slideregion_disabled", "lobby", true));
                lcb.field_r = new llb(0L, (llb) null);
                lcb.field_r.field_gb = bbb.a(wjb.a(param3, true, "lobby", "dragbar"), (byte) 98);
                lcb.field_r.field_mb = bbb.a(wjb.a(param3, true, "lobby", "dragbar_mouseover"), (byte) -59);
                lcb.field_r.field_A = bbb.a(wjb.a(param3, true, "lobby", "dragbar_mouseheld"), (byte) -123);
                lcb.field_r.field_ub = bbb.a(wjb.a(param3, true, "lobby", "dragbar_disabled"), (byte) 43);
                efb.field_a = new llb(0L, (llb) null);
                efb.field_a.field_tb = gra.a(param3, "upbutton", "lobby", true);
                efb.field_a.field_cb = gra.a(param3, "upbutton_mouseover", "lobby", true);
                efb.field_a.field_ob = gra.a(param3, "upbutton_mouseheld", "lobby", true);
                efb.field_a.field_z = gra.a(param3, "upbutton_disabled", "lobby", true);
                go.field_q = new llb(0L, (llb) null);
                go.field_q.field_tb = gra.a(param3, "downbutton", "lobby", true);
                go.field_q.field_cb = gra.a(param3, "downbutton_mouseover", "lobby", true);
                go.field_q.field_ob = gra.a(param3, "downbutton_mouseheld", "lobby", true);
                go.field_q.field_z = gra.a(param3, "downbutton_disabled", "lobby", true);
                cab.field_o = new pjb(0L, efb.field_a, go.field_q, ga.field_s, lcb.field_r);
                rbb.field_k = new wdb(0L, (llb) null, htb.field_w, cab.field_o, jta.field_o, (String) null, (String) null);
                break L0;
              } else {
                var24[var7_int] = 10;
                var7_int++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("bd.A(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
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
          L9: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          L10: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param4 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
    }

    final static boolean a(int param0, byte param1) {
        if (param1 != -95) {
            return false;
        }
        return (-param0 & param0) == param0 ? true : false;
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 45 % ((-20 - param0) / 48);
    }

    static {
        field_a = "Game";
    }
}
