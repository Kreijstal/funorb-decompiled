/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends mn {
    private int field_w;
    static int[] field_x;
    private int field_z;
    static je field_A;
    private mn field_y;
    static gk field_v;

    final static void a() {
        RuntimeException var2 = null;
        int var3 = 0;
        bj var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = (bj) (Object) jm.field_o.e((byte) 121);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                int discarded$4 = -17006;
                te.a(2, var4);
                var4 = (bj) (Object) jm.field_o.a((byte) 123);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "ee.I(" + 2 + ',' + 37 + ')');
        }
    }

    final static void a(ru[] param0, kl param1, int param2, int[] param3, kl param4) {
        ru[] var5 = null;
        ru[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        tu var7 = null;
        je var8 = null;
        je var9 = null;
        je var10 = null;
        je var11 = null;
        wk[] var12 = null;
        wk[] var13 = null;
        wk[] var14 = null;
        je var15 = null;
        wk[] var16 = null;
        wk[] var17 = null;
        int var18 = 0;
        int[] var19 = null;
        L0: {
          var18 = ArmiesOfGielinor.field_M ? 1 : 0;
          var5 = lo.a("crowns", -28106, "lobby", param1);
          vh.field_n = var5.length;
          if (param0 != null) {
            var6 = new ru[param0.length + vh.field_n];
            var7_int = 0;
            L1: while (true) {
              if (var7_int >= vh.field_n) {
                var7_int = 0;
                L2: while (true) {
                  if (var7_int >= param0.length) {
                    var5 = var6;
                    break L0;
                  } else {
                    var6[var7_int + vh.field_n] = param0[var7_int];
                    var7_int++;
                    continue L2;
                  }
                }
              } else {
                var6[var7_int] = var5[var7_int];
                var7_int++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var19 = new int[var5.length];
        var6_array = var19;
        var7_int = 0;
        L3: while (true) {
          if (vh.field_n <= var7_int) {
            L4: {
              if (param0 == null) {
                break L4;
              } else {
                if (param3 != null) {
                  var7_int = 0;
                  L5: while (true) {
                    if (param0.length <= var7_int) {
                      break L4;
                    } else {
                      var6_array[vh.field_n - -var7_int] = param3[var7_int];
                      var7_int++;
                      continue L5;
                    }
                  }
                } else {
                  var7_int = 0;
                  L6: while (true) {
                    if (var7_int >= param0.length) {
                      break L4;
                    } else {
                      var6_array[var7_int + vh.field_n] = param0[var7_int].field_f;
                      var7_int++;
                      continue L6;
                    }
                  }
                }
              }
            }
            L7: {
              gl.field_c = 2;
              is.field_b = 11;
              mi.field_l = 4;
              io.field_n = 2;
              jn.field_d = 15;
              var7 = gs.a("lobby", param1, param4, (byte) -53, "largefont");
              t.field_a = gs.a("lobby", param1, param4, (byte) -53, "generalfont");
              gm.field_f = gs.a("lobby", param1, param4, (byte) -53, "chatfont");
              var7.a((si[]) (Object) var5, var6_array);
              t.field_a.a((si[]) (Object) var5, var6_array);
              gm.field_f.a((si[]) (Object) var5, var6_array);
              var8 = new je(0L, (je) null);
              var8.field_Z = (ka) (Object) var7;
              var8.field_N = 16777215;
              var8.field_pb = jn.field_d;
              var8.field_Fb = 1;
              var9 = var8;
              var9.field_Eb = 1;
              var10 = new je(0L, (je) null);
              var10.field_N = 16777215;
              var10.field_Z = (ka) (Object) t.field_a;
              var10.field_pb = jn.field_d;
              var10.field_Fb = 1;
              var11 = var10;
              var11.field_Eb = 1;
              be.field_y = new je(0L, var8);
              be.field_y.field_G = wj.a(-12310, fk.a("heading", (byte) -126, param1, "lobby"));
              im.field_x = new je(0L, (je) null);
              im.field_x.field_G = jq.a(false, 4210752, -20600, 120, false, 8421504);
              qc.field_e = new je(0L, (je) null);
              qc.field_e.field_G = tq.a(6316128, false, 114, 1, 3, 6316128);
              kq.field_N = new je(0L, (je) null);
              kq.field_N.field_G = wj.a(-12310, fk.a("popup", (byte) -127, param1, "lobby"));
              var12 = wj.a(-12310, fk.a("popup_mouseover", (byte) -124, param1, "lobby"));
              var13 = fk.a("button", (byte) -125, param1, "lobby");
              var14 = wj.a(-12310, fk.a("tab_active", (byte) -124, param1, "lobby"));
              hr.field_m = new je(0L, var8);
              hr.field_m.field_G = var14;
              uc.field_b = new je(0L, (je) null);
              uc.field_b.field_cb = ic.a("closebutton", (byte) 51, "lobby", param1);
              uc.field_b.field_vb = ic.a("closebutton_mouseover", (byte) 51, "lobby", param1);
              rn.field_a = new je(0L, var8);
              rn.field_a.field_G = jq.a(true, 2039583, -20600, 40, true, 3815994);
              te.field_p = new je(0L, var10);
              te.field_p.field_O = 2;
              te.field_p.field_G = jq.a(true, 2039583, -20600, 30, false, 3815994);
              ho.field_a = new je(0L, var10);
              ho.field_a.field_O = 2;
              ho.field_a.field_G = jq.a(false, 2039583, -20600, 30, false, 3815994);
              br.field_e = new je(0L, var10);
              br.field_e.field_O = 2;
              br.field_e.field_G = jq.a(false, 2039583, -20600, 30, true, 3815994);
              eq.field_h = new je(0L, (je) null);
              eq.field_h.field_Z = (ka) (Object) t.field_a;
              eq.field_h.field_pb = jn.field_d;
              eq.field_h.field_Fb = 1;
              eq.field_h.field_N = 13421772;
              ms.field_k = new je(0L, eq.field_h);
              ms.field_k.field_wb = 16777215;
              ms.field_k.field_L = 8421504;
              ms.field_k.field_N = 16764006;
              ms.field_k.field_T = 16777215;
              if (param2 < -38) {
                break L7;
              } else {
                field_v = null;
                break L7;
              }
            }
            ms.field_k.field_W = 16777215;
            var15 = new je(0L, ms.field_k);
            var15.field_pb = jn.field_d;
            var15.field_N = 16777215;
            var15.field_Z = (ka) (Object) var7;
            ke.field_e = new je(0L, eq.field_h);
            ke.field_e.field_G = jq.a(false, 2236962, -20600, 16, false, 2236962);
            ke.field_e.field_O = 2;
            fp.field_Lb = new je(0L, eq.field_h);
            fp.field_Lb.field_G = jq.a(false, 1513239, -20600, 16, false, 1513239);
            fp.field_Lb.field_O = 2;
            ws.field_P = new je(0L, ke.field_e);
            ws.field_P.a(0, ms.field_k);
            ga.field_i = new je(0L, fp.field_Lb);
            ga.field_i.a(0, ms.field_k);
            var16 = fk.a("button_mouseover", (byte) -128, param1, "lobby");
            qb.field_h = new np(kq.field_N, var12, eq.field_h, ms.field_k, 3, 2, io.field_n, 3, jn.field_d);
            lu.field_u = new je(0L, ms.field_k);
            lu.field_u.field_G = var13;
            lu.field_u.field_Bb = 1;
            lu.field_u.field_tb = 1;
            lu.field_u.field_B = 1;
            lu.field_u.field_R = 1;
            lu.field_u.field_mb = var16;
            lu.field_u.field_U = fk.a("button_mouseheld", (byte) -127, param1, "lobby");
            lu.field_u.field_H = fk.a("button_active", (byte) -124, param1, "lobby");
            lu.field_u.field_A = fk.a("button_disabled", (byte) -126, param1, "lobby");
            lu.field_u.field_Eb = 1;
            h.field_d = new je(0L, ms.field_k);
            h.field_d.field_Eb = 1;
            h.field_d.field_G = wj.a(-12310, fk.a("tab_inactive", (byte) -127, param1, "lobby"));
            h.field_d.field_mb = wj.a(-12310, fk.a("tab_mouseover", (byte) -124, param1, "lobby"));
            h.field_d.field_H = var14;
            wm.field_c = new je(0L, (je) null);
            wm.field_c.field_G = tq.a(1856141, false, 206, -1, 3, 1127256);
            sh.field_m = new je(0L, (je) null);
            sh.field_m.field_G = tq.a(11579568, false, 290, -1, 3, 6052956);
            nd.field_a = new je(0L, var15);
            nd.field_a.field_Eb = 1;
            nd.field_a.field_Bb = 1;
            nd.field_a.field_B = 1;
            nd.field_a.field_R = 1;
            nd.field_a.field_tb = 1;
            bw.field_h = new je(0L, nd.field_a);
            je.field_Q = new je(0L, ms.field_k);
            je.field_Q.field_R = 1;
            je.field_Q.field_Bb = 1;
            je.field_Q.field_tb = 1;
            je.field_Q.field_B = 1;
            je.field_Q.field_Eb = 1;
            rf.field_d = new je(0L, je.field_Q);
            pt.field_X = new je(0L, je.field_Q);
            kd.field_M = new je(0L, nd.field_a);
            rd.field_e = new je(0L, je.field_Q);
            bd.field_o = new je(0L, je.field_Q);
            eb.field_a = new je(0L, je.field_Q);
            je.field_Q.field_G = wj.a(-12310, fk.a("smallbutton", (byte) -128, param1, "lobby"));
            je.field_Q.field_mb = wj.a(-12310, fk.a("smallbutton_mouseover", (byte) -125, param1, "lobby"));
            wk[] dupTemp$4 = wj.a(-12310, fk.a("smallbutton_active", (byte) -124, param1, "lobby"));
            je.field_Q.field_H = dupTemp$4;
            je.field_Q.field_U = dupTemp$4;
            je.field_Q.field_A = wj.a(-12310, fk.a("smallbutton_disabled", (byte) -127, param1, "lobby"));
            bw.field_h.field_G = wj.a(-12310, fk.a("mediumbutton", (byte) -125, param1, "lobby"));
            bw.field_h.field_mb = wj.a(-12310, fk.a("mediumbutton_mouseover", (byte) -125, param1, "lobby"));
            bw.field_h.field_U = wj.a(-12310, fk.a("mediumbutton_mouseheld", (byte) -124, param1, "lobby"));
            nd.field_a.field_G = wj.a(-12310, fk.a("bigbutton", (byte) -128, param1, "lobby"));
            nd.field_a.field_mb = wj.a(-12310, fk.a("bigbutton_mouseover", (byte) -124, param1, "lobby"));
            nd.field_a.field_U = wj.a(-12310, fk.a("bigbutton_mouseheld", (byte) -124, param1, "lobby"));
            nd.field_a.field_A = wj.a(-12310, fk.a("bigbutton_disabled", (byte) -126, param1, "lobby"));
            rf.field_d.field_G = wj.a(-12310, fk.a("greenbutton", (byte) -124, param1, "lobby"));
            rf.field_d.field_mb = wj.a(-12310, fk.a("greenbutton_mouseover", (byte) -126, param1, "lobby"));
            rf.field_d.field_U = wj.a(-12310, fk.a("greenbutton_mouseheld", (byte) -127, param1, "lobby"));
            pt.field_X.field_G = wj.a(-12310, fk.a("redbutton", (byte) -128, param1, "lobby"));
            pt.field_X.field_mb = wj.a(-12310, fk.a("redbutton_mouseover", (byte) -127, param1, "lobby"));
            pt.field_X.field_U = wj.a(-12310, fk.a("redbutton_mouseheld", (byte) -126, param1, "lobby"));
            kd.field_M.field_G = wj.a(-12310, fk.a("backbutton", (byte) -124, param1, "lobby"));
            kd.field_M.field_mb = wj.a(-12310, fk.a("backbutton_mouseover", (byte) -124, param1, "lobby"));
            kd.field_M.field_U = wj.a(-12310, fk.a("backbutton_mouseheld", (byte) -128, param1, "lobby"));
            kd.field_M.field_A = wj.a(-12310, fk.a("backbutton_disabled", (byte) -124, param1, "lobby"));
            eb.field_a.field_G = wj.a(-12310, fk.a("gameoptionbutton", (byte) -128, param1, "lobby"));
            eb.field_a.field_mb = wj.a(-12310, fk.a("gameoptionbutton_mouseover", (byte) -126, param1, "lobby"));
            wk[] dupTemp$5 = wj.a(-12310, fk.a("gameoptionbutton_active", (byte) -128, param1, "lobby"));
            eb.field_a.field_H = dupTemp$5;
            eb.field_a.field_U = dupTemp$5;
            eb.field_a.field_A = wj.a(-12310, fk.a("gameoptionbutton_disabled", (byte) -124, param1, "lobby"));
            rd.field_e.field_G = wj.a(-12310, fk.a("chatbutton", (byte) -125, param1, "lobby"));
            rd.field_e.field_mb = wj.a(-12310, fk.a("chatbutton_mouseover", (byte) -127, param1, "lobby"));
            wk[] dupTemp$6 = wj.a(-12310, fk.a("chatbutton_active", (byte) -124, param1, "lobby"));
            rd.field_e.field_H = dupTemp$6;
            rd.field_e.field_U = dupTemp$6;
            bd.field_o.field_G = wj.a(-12310, fk.a("chatfilterbutton", (byte) -127, param1, "lobby"));
            bd.field_o.field_mb = wj.a(-12310, fk.a("chatfilterbutton_mouseover", (byte) -127, param1, "lobby"));
            wk[] dupTemp$7 = wj.a(-12310, fk.a("chatfilterbutton_active", (byte) -124, param1, "lobby"));
            bd.field_o.field_H = dupTemp$7;
            bd.field_o.field_U = dupTemp$7;
            var17 = fk.a("checkbox", (byte) -124, param1, "lobby");
            hs.field_H = new fp(0L, var17[1], var17[0], 1, ms.field_k, (String) null);
            oe.field_Cb = new je(0L, (je) null);
            oe.field_Cb.field_G = it.a(17, ic.a("slideregion", (byte) 51, "lobby", param1));
            oe.field_Cb.field_mb = it.a(17, ic.a("slideregion_mouseover", (byte) 51, "lobby", param1));
            oe.field_Cb.field_U = it.a(17, ic.a("slideregion_mouseheld", (byte) 51, "lobby", param1));
            oe.field_Cb.field_A = it.a(17, ic.a("slideregion_disabled", (byte) 51, "lobby", param1));
            ke.field_c = new je(0L, (je) null);
            ke.field_c.field_G = wj.a(-12310, fk.a("dragbar", (byte) -126, param1, "lobby"));
            ke.field_c.field_mb = wj.a(-12310, fk.a("dragbar_mouseover", (byte) -127, param1, "lobby"));
            ke.field_c.field_U = wj.a(-12310, fk.a("dragbar_mouseheld", (byte) -127, param1, "lobby"));
            ke.field_c.field_A = wj.a(-12310, fk.a("dragbar_disabled", (byte) -125, param1, "lobby"));
            no.field_M = new je(0L, (je) null);
            no.field_M.field_cb = ic.a("upbutton", (byte) 51, "lobby", param1);
            no.field_M.field_vb = ic.a("upbutton_mouseover", (byte) 51, "lobby", param1);
            no.field_M.field_qb = ic.a("upbutton_mouseheld", (byte) 51, "lobby", param1);
            no.field_M.field_sb = ic.a("upbutton_disabled", (byte) 51, "lobby", param1);
            wh.field_g = new je(0L, (je) null);
            wh.field_g.field_cb = ic.a("downbutton", (byte) 51, "lobby", param1);
            wh.field_g.field_vb = ic.a("downbutton_mouseover", (byte) 51, "lobby", param1);
            wh.field_g.field_qb = ic.a("downbutton_mouseheld", (byte) 51, "lobby", param1);
            wh.field_g.field_sb = ic.a("downbutton_disabled", (byte) 51, "lobby", param1);
            ri.field_b = new ll(0L, no.field_M, wh.field_g, oe.field_Cb, ke.field_c);
            br.field_g = new mp(0L, (je) null, cb.field_c, ri.field_b, je.field_Q, (String) null, (String) null);
            return;
          } else {
            var19[var7_int] = 10;
            var7_int++;
            continue L3;
          }
        }
    }

    private final String a(String[] param0) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = ((ee) this).a(12, param0, "mind control");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ee.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 30536 + ')');
        }
        return stackIn_3_0;
    }

    public static void f() {
        field_v = null;
        field_A = null;
        field_x = null;
    }

    final static void e() {
        st.field_z.c((byte) -115);
    }

    final bd a(int param0, ha param1) {
        RuntimeException var3 = null;
        jd var3_ref = null;
        Object var4 = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        bd stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        bd stackOut_12_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_7_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              ((ee) this).d(44);
              if (param0 > 31) {
                break L1;
              } else {
                var4 = null;
                ee.a((ru[]) null, (kl) null, 4, (int[]) null, (kl) null);
                break L1;
              }
            }
            var3_ref = param1.c(((ee) this).field_w, true, ((ee) this).field_z);
            if (var3_ref == null) {
              int discarded$6 = 30536;
              String discarded$7 = this.a(new String[2]);
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (bd) (Object) stackIn_5_0;
            } else {
              if (var3_ref.field_B != 0) {
                if (72 == var3_ref.field_N) {
                  stackOut_12_0 = ((ee) this).field_y.a(100, param1);
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  int discarded$8 = 30536;
                  String discarded$9 = this.a(new String[3]);
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  return (bd) (Object) stackIn_11_0;
                }
              } else {
                int discarded$10 = 30536;
                String discarded$11 = this.a(new String[3]);
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (bd) (Object) stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ee.C(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    ee(int param0, int param1, int param2, mn param3) {
        try {
            ((ee) this).field_y = param3;
            ((ee) this).field_y.field_u = true;
            ((ee) this).field_p = param0;
            ((ee) this).field_z = param1;
            ((ee) this).field_w = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ee.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[128];
    }
}
