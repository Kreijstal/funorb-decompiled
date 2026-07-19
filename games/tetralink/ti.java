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
        oh[] dupTemp$5 = null;
        oh[] dupTemp$6 = null;
        oh[] dupTemp$7 = null;
        oh[] dupTemp$8 = null;
        int discarded$9 = 0;
        RuntimeException var5 = null;
        kh[] var5_array = null;
        int[] var6 = null;
        kh[] var6_array = null;
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
        byte[] var19 = null;
        kh[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var18 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var20 = el.a(param4, "crowns", "lobby", -1409);
              var5_array = var20;
              fh.field_h = var20.length;
              if (param2 == null) {
                break L1;
              } else {
                var6_array = new kh[param2.length + fh.field_h];
                var7_int = 0;
                L2: while (true) {
                  if (fh.field_h <= var7_int) {
                    var5_array = var6_array;
                    var7_int = 0;
                    L3: while (true) {
                      if (var7_int >= param2.length) {
                        break L1;
                      } else {
                        var6_array[fh.field_h + var7_int] = param2[var7_int];
                        var7_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var6_array[var7_int] = var20[var7_int];
                    var7_int++;
                    continue L2;
                  }
                }
              }
            }
            var22 = new int[var5_array.length];
            var21 = var22;
            var6 = var21;
            var7_int = 0;
            L4: while (true) {
              if (fh.field_h <= var7_int) {
                L5: {
                  if (param2 == null) {
                    break L5;
                  } else {
                    if (param3 != null) {
                      var7_int = 0;
                      L6: while (true) {
                        if (var7_int >= param2.length) {
                          break L5;
                        } else {
                          var6[var7_int + fh.field_h] = param3[var7_int];
                          var7_int++;
                          continue L6;
                        }
                      }
                    } else {
                      var7_int = 0;
                      L7: while (true) {
                        if (param2.length <= var7_int) {
                          break L5;
                        } else {
                          var6[fh.field_h - -var7_int] = param2[var7_int].field_f;
                          var7_int++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                L8: {
                  wc.field_J = 2;
                  qe.field_d = 15;
                  ai.field_d = 11;
                  fn.field_Q = 4;
                  eh.field_w = 2;
                  var7 = pm.a("lobby", "largefont", param4, param0, -83);
                  rn.field_e = pm.a("lobby", "generalfont", param4, param0, -106);
                  uf.field_g = pm.a("lobby", "chatfont", param4, param0, -58);
                  var7.a(var5_array, var22);
                  rn.field_e.a(var5_array, var22);
                  uf.field_g.a(var5_array, var22);
                  var8 = new hl(0L, (hl) null);
                  var8.field_N = 16777215;
                  var8.field_Ib = (jb) ((Object) var7);
                  var8.field_Q = qe.field_d;
                  var8.field_J = 1;
                  var9 = var8;
                  var9.field_xb = 1;
                  var10 = new hl(0L, (hl) null);
                  var10.field_Q = qe.field_d;
                  var10.field_Ib = (jb) ((Object) rn.field_e);
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
                  bk.field_i.field_Ib = (jb) ((Object) rn.field_e);
                  ek.field_n = new hl(0L, bk.field_i);
                  ek.field_n.field_N = 16764006;
                  ek.field_n.field_ib = 16777215;
                  ek.field_n.field_L = 16777215;
                  ek.field_n.field_P = 8421504;
                  ek.field_n.field_nb = 16777215;
                  var15 = new hl(0L, ek.field_n);
                  var15.field_N = 16777215;
                  var15.field_Ib = (jb) ((Object) var7);
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
                  dupTemp$5 = kf.a(true, bf.a((byte) -72, param4, "lobby", "smallbutton_active"));
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
                  dupTemp$6 = kf.a(true, bf.a((byte) -84, param4, "lobby", "gameoptionbutton_active"));
                  ia.field_L.field_Gb = dupTemp$6;
                  ia.field_L.field_pb = dupTemp$6;
                  ia.field_L.field_H = kf.a(true, bf.a((byte) -86, param4, "lobby", "gameoptionbutton_disabled"));
                  t.field_o.field_Eb = kf.a(true, bf.a((byte) -117, param4, "lobby", "chatbutton"));
                  t.field_o.field_kb = kf.a(true, bf.a((byte) -101, param4, "lobby", "chatbutton_mouseover"));
                  dupTemp$7 = kf.a(true, bf.a((byte) -94, param4, "lobby", "chatbutton_active"));
                  t.field_o.field_Gb = dupTemp$7;
                  t.field_o.field_pb = dupTemp$7;
                  rh.field_N.field_Eb = kf.a(true, bf.a((byte) -85, param4, "lobby", "chatfilterbutton"));
                  rh.field_N.field_kb = kf.a(true, bf.a((byte) -92, param4, "lobby", "chatfilterbutton_mouseover"));
                  dupTemp$8 = kf.a(true, bf.a((byte) -119, param4, "lobby", "chatfilterbutton_active"));
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
                    break L8;
                  } else {
                    var19 = (byte[]) null;
                    discarded$9 = ti.a((byte[]) null, (byte) -120, -19);
                    break L8;
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
                break L0;
              } else {
                var22[var7_int] = 10;
                var7_int++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var5);
            stackOut_29_1 = new StringBuilder().append("ti.B(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          L11: {
            stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L11;
            }
          }
          L12: {
            stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param4 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L12;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L12;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
    }

    final static boolean a(int param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            if (!i.a(param2, false, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param1.length()) {
                  var4 = 27 % ((param0 - -17) / 57);
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (om.a(param1.charAt(var3_int), false)) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("ti.E(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
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
            stackOut_0_0 = q.a(param0, 2, param2, 0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("ti.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        if (param0 != 2) {
            field_b = (String) null;
        }
        field_b = null;
        field_d = null;
        field_g = null;
        field_f = (int[][]) null;
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, ve param3) {
        try {
            fa.field_d = param2;
            qm.field_b = param3;
            if (param1 != 1) {
                ve var5 = (ve) null;
                ti.a(-29, -41, 120, (ve) null);
            }
            nc.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ti.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = -1;
        field_b = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
