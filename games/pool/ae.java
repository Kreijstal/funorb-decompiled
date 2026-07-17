/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ae {
    static long field_d;
    static String field_b;
    static int[] field_e;
    static an field_a;
    static nq field_c;
    static String field_f;

    final static String a(int param0, String param1, String param2, int param3) {
        RuntimeException var4 = null;
        oq var5 = null;
        int var6 = 0;
        Object var7 = null;
        eo var8 = null;
        CharSequence var9 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        String stackOut_10_0 = null;
        Object stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            var9 = (CharSequence) (Object) param2;
            if (!gj.a(-25908, var9)) {
              stackOut_2_0 = p.field_g;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (2 != th.field_a) {
                stackOut_6_0 = ig.field_k;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var8 = hl.a(param1, 1);
                if (var8 == null) {
                  stackOut_10_0 = nr.a(new String[1], -1, sg.field_Q);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  L1: {
                    var8.a((byte) -117);
                    var8.a(false);
                    gi.field_t = gi.field_t - 1;
                    if (param0 == -3266) {
                      break L1;
                    } else {
                      var7 = null;
                      String discarded$2 = ae.a(-62, (String) null, (String) null, 67);
                      break L1;
                    }
                  }
                  var5 = ej.field_j;
                  var5.b(false, param3);
                  var5.field_v = var5.field_v + 1;
                  var6 = var5.field_v;
                  var5.a(3, false);
                  var5.a(-9946, param2);
                  var5.b(-var6 + var5.field_v, true);
                  stackOut_14_0 = null;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("ae.C(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          L3: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param3 + 41);
        }
        return (String) (Object) stackIn_15_0;
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != -26) {
            ae.a((byte) -115);
        }
    }

    final static void a(int param0) {
        dd var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        dd var9 = null;
        int var10 = 0;
        dd var11 = null;
        dd var12 = null;
        String var14 = null;
        dd var16 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        L0: {
          var10 = Pool.field_O;
          if (bm.field_k == null) {
            break L0;
          } else {
            if (!bm.field_k.d(-86)) {
              break L0;
            } else {
              if (!bm.field_k.a("benefits", 0)) {
                break L0;
              } else {
                if (null == rl.field_c) {
                  break L0;
                } else {
                  if (!rl.field_c.d(-62)) {
                    break L0;
                  } else {
                    if (!rl.field_c.a("benefits", 0)) {
                      break L0;
                    } else {
                      rf.field_e = pf.a("benefits", (byte) 51, "headline", bm.field_k);
                      ec.field_d = pf.a("benefits", (byte) 79, "blurbpane", bm.field_k);
                      ph.field_f = pf.a("benefits", (byte) 89, "button", bm.field_k);
                      i.field_o = pf.a("benefits", (byte) 109, "signup_text", bm.field_k);
                      dl.field_h = pf.a("benefits", (byte) 86, "menu_text", bm.field_k);
                      o.field_C = pf.a("benefits", (byte) 78, "button_frame", bm.field_k);
                      vq.field_Yb = pf.a("benefits", (byte) 75, "arrow", bm.field_k);
                      de.field_d = (lr) (Object) he.a(bm.field_k, "large_font", 0, rl.field_c, "benefits");
                      so.field_h = (lr) (Object) he.a(bm.field_k, "small_font", 0, rl.field_c, "benefits");
                      var27 = qh.field_d;
                      var2 = qh.field_l;
                      var3 = qh.field_f;
                      qh.a(ka.field_o);
                      var11 = new dd(4 + vq.field_Yb.field_z, 4 + vq.field_Yb.field_A);
                      var11.e();
                      vq.field_Yb.b(2, 2, er.field_X);
                      hd.a(1, 2, var11.field_A, var11, 4, var11.field_z, 0, 0);
                      vq.field_Yb = var11;
                      w.field_f = vq.field_Yb.a();
                      var12 = new dd(195, 221);
                      var6 = var12.field_z / 2;
                      var12.e();
                      de.field_d.b(nr.a(new String[1], -1, ul.field_l), var6, 40, 16777215, -1);
                      so.field_h.b(nr.a(new String[1], -1, vb.field_c), var6, 60, 16777215, -1);
                      de.field_d.b(nr.a(new String[1], -1, up.field_w), var6, 110, 16777215, -1);
                      so.field_h.b(nr.a(new String[1], -1, cr.field_t), var6, 130, 16777215, -1);
                      de.field_d.b(mp.field_X, var6, 180, 16777215, -1);
                      so.field_h.b(cp.field_b, var6, 200, 16777215, -1);
                      hd.a(1, 3, var12.field_A, var12, 4, var12.field_z, 0, 0);
                      ec.field_d.e();
                      var12.c(-ec.field_d.field_G + 18, -ec.field_d.field_B + 241);
                      var7 = 0;
                      L1: while (true) {
                        if (~var7 <= ~mk.field_a.length) {
                          mk.field_a = null;
                          td.field_a = i.field_o.d();
                          td.field_a.e();
                          qe.a(qh.field_l, 2 * qh.field_f / 3, 64, 0, (byte) 103, 0);
                          qh.a(var27, var2, var3);
                          qh.b(ka.field_o);
                          ln.field_o = 390 + (ph.field_f.field_A - o.field_C.field_A) / 2;
                          tn.field_o = 434 - -((ph.field_f.field_z - o.field_C.field_z) / 2);
                          oj.field_s = 390 + (-o.field_C.field_A + ph.field_f.field_A) / 2;
                          bm.field_k = null;
                          ir.field_n = (-o.field_C.field_z + ph.field_f.field_z) / 2 + 231;
                          break L0;
                        } else {
                          jr.field_m[var7].e();
                          int discarded$3 = so.field_h.a(mk.field_a[var7], 3, 3, -6 + jr.field_m[var7].field_z, -6 + jr.field_m[var7].field_A, er.field_X, -1, 1, 1, so.field_h.field_w + so.field_h.field_C);
                          hd.a(1, 3, jr.field_m[var7].field_A, jr.field_m[var7], 4, jr.field_m[var7].field_z, 0, 0);
                          var7++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if (null == wa.field_gb) {
          return;
        } else {
          L2: {
            if (null == vn.field_j) {
              break L2;
            } else {
              if (null != de.field_d) {
                L3: {
                  var28 = qh.field_d;
                  var2 = qh.field_l;
                  var3 = qh.field_f;
                  qh.a(ka.field_o);
                  var14 = nr.a(new String[1], -1, sh.field_S);
                  var5 = de.field_d.a(var14, jc.field_h);
                  var6 = de.field_d.b(var14, jc.field_h, de.field_d.field_C + de.field_d.field_w);
                  var7 = se.field_h - -((-var5 + jc.field_h) / 2);
                  var8 = rf.field_c - -((-var6 + li.field_e) / 2);
                  var7 -= 3;
                  var5 += 6;
                  if (0 <= var7) {
                    break L3;
                  } else {
                    var9_int = -var7;
                    vn.field_j.field_G = vn.field_j.field_G + var9_int;
                    var5 = var5 + var9_int * 2;
                    var7 = var7 + var9_int;
                    pq.field_m = pq.field_m - var9_int;
                    vn.field_j.field_w = vn.field_j.field_w + var9_int * 2;
                    se.field_h = se.field_h + var9_int;
                    break L3;
                  }
                }
                L4: {
                  var6 += 6;
                  var8 -= 3;
                  if (~(var7 - -var5) < ~vn.field_j.field_w) {
                    var9_int = var7 + (var5 - vn.field_j.field_w);
                    var5 = var5 + 2 * var9_int;
                    var7 = var7 + var9_int;
                    se.field_h = se.field_h + var9_int;
                    vn.field_j.field_G = vn.field_j.field_G + var9_int;
                    pq.field_m = pq.field_m - var9_int;
                    vn.field_j.field_w = vn.field_j.field_w + 2 * var9_int;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var8 >= 0) {
                    break L5;
                  } else {
                    var9_int = -var8;
                    var8 = var8 + var9_int;
                    vn.field_j.field_B = vn.field_j.field_B + var9_int;
                    vn.field_j.field_y = vn.field_j.field_y + 2 * var9_int;
                    ad.field_r = ad.field_r - var9_int;
                    rf.field_c = rf.field_c + var9_int;
                    var6 = var6 + 2 * var9_int;
                    break L5;
                  }
                }
                L6: {
                  if (vn.field_j.field_y < var6 + var8) {
                    var9_int = -vn.field_j.field_y + (var8 + var6);
                    vn.field_j.field_y = vn.field_j.field_y + 2 * var9_int;
                    var8 = var8 + var9_int;
                    rf.field_c = rf.field_c + var9_int;
                    vn.field_j.field_B = vn.field_j.field_B + var9_int;
                    var6 = var6 + 2 * var9_int;
                    ad.field_r = ad.field_r - var9_int;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                vn.field_j.c();
                var9 = new dd(vn.field_j.field_w, vn.field_j.field_y);
                var9.e();
                int discarded$4 = de.field_d.a(var14, se.field_h, rf.field_c, jc.field_h, li.field_e, 16777215, -1, 1, 1, de.field_d.field_C - -de.field_d.field_w);
                hd.a(1, 3, var9.field_y, var9, 4, var9.field_w, 0, 0);
                vn.field_j.e();
                var9.c(0, 0);
                ua.field_u = new dd(640, 480);
                ua.field_u.e();
                vn.field_j.b((vn.field_j.field_w >> 1) - -pq.field_m, (vn.field_j.field_y >> 1) + ad.field_r, ej.field_g, 4096);
                vn.field_j = null;
                ua.field_u.b();
                qh.a(var28, var2, var3);
                qh.b(ka.field_o);
                break L2;
              } else {
                break L2;
              }
            }
          }
          L7: {
            if (nr.field_N == null) {
              break L7;
            } else {
              if (so.field_h == null) {
                break L7;
              } else {
                var29 = qh.field_d;
                var2 = qh.field_l;
                var3 = qh.field_f;
                qh.a(ka.field_o);
                var16 = new dd(412, 43);
                var5_ref_String = nr.a(new String[1], -1, wm.field_cc);
                nr.field_N = null;
                var16.e();
                int discarded$5 = so.field_h.a(var5_ref_String, 3, 3, -6 + var16.field_z, var16.field_A + -6, 16777215, -1, 0, 1, so.field_h.field_C + so.field_h.field_w);
                hd.a(1, 3, var16.field_A, var16, 4, var16.field_z, 0, 0);
                wa.field_gb.e();
                var16.c(199 - wa.field_gb.field_G, -wa.field_gb.field_B + 83);
                qh.a(var29, var2, var3);
                qh.b(ka.field_o);
                break L7;
              }
            }
          }
          L8: {
            if (mm.field_c == null) {
              break L8;
            } else {
              if (null != so.field_h) {
                var30 = qh.field_d;
                var2 = qh.field_l;
                var3 = qh.field_f;
                qh.a(ka.field_o);
                var4 = 6 + so.field_h.a(fk.field_eb, 640);
                var5 = var4 + mm.field_c.field_w - -20;
                var6 = -(var5 / 2) + 427;
                var7 = 20 + (var6 - -mm.field_c.field_w);
                wa.field_gb.e();
                so.field_h.d(fk.field_eb, -wa.field_gb.field_G + var7, so.field_h.field_w + (-wa.field_gb.field_B + 155 + so.field_h.field_C), 16777215, -1);
                hd.a(1, 3, 50, wa.field_gb, 4, var4, var7 + -wa.field_gb.field_G - 4, -wa.field_gb.field_B + 155);
                var8 = 155 + -wa.field_gb.field_B + -((-so.field_h.field_C + (-3 + mm.field_c.field_y + -so.field_h.field_w)) / 2);
                mm.field_c.c(var6 - wa.field_gb.field_G, var8);
                qh.a(var30, var2, var3);
                qh.b(ka.field_o);
                mm.field_c = null;
                break L8;
              } else {
                break L8;
              }
            }
          }
          L9: {
            qh.a(ka.field_o);
            qh.a(16, 16, 608, 112, 15, oo.field_k, vc.field_L);
            qh.a(231, 144, 393, 232, 15, oo.field_k, vc.field_L);
            if (rf.field_e != null) {
              rf.field_e.c(0, 0);
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (ec.field_d != null) {
              ec.field_d.c(0, 0);
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            wa.field_gb.c(0, 0);
            if (null != ua.field_u) {
              ua.field_u.c(0, 0);
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            if (ph.field_f == null) {
              break L12;
            } else {
              if (null == o.field_C) {
                break L12;
              } else {
                L13: {
                  ph.field_f.c(231, 390);
                  var1 = i.field_o;
                  if (jc.field_j.field_h != 0) {
                    break L13;
                  } else {
                    var1 = td.field_a;
                    break L13;
                  }
                }
                L14: {
                  var1.c(0, 0);
                  stackOut_47_0 = 40;
                  stackOut_47_1 = 40;
                  stackOut_47_2 = uf.field_X;
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  if (jc.field_j.field_h != 0) {
                    stackOut_49_0 = stackIn_49_0;
                    stackOut_49_1 = stackIn_49_1;
                    stackOut_49_2 = stackIn_49_2;
                    stackOut_49_3 = 3;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    stackIn_50_2 = stackOut_49_2;
                    stackIn_50_3 = stackOut_49_3;
                    break L14;
                  } else {
                    stackOut_48_0 = stackIn_48_0;
                    stackOut_48_1 = stackIn_48_1;
                    stackOut_48_2 = stackIn_48_2;
                    stackOut_48_3 = 4;
                    stackIn_50_0 = stackOut_48_0;
                    stackIn_50_1 = stackOut_48_1;
                    stackIn_50_2 = stackOut_48_2;
                    stackIn_50_3 = stackOut_48_3;
                    break L14;
                  }
                }
                L15: {
                  var2 = stackIn_50_0 + (stackIn_50_1 * ao.a(stackIn_50_2 << stackIn_50_3, true) >> 16);
                  if (var2 <= 0) {
                    break L15;
                  } else {
                    ph.field_f.c(230, 389, var2);
                    ph.field_f.c(232, 389, var2);
                    ph.field_f.c(232, 391, var2);
                    ph.field_f.c(230, 391, var2);
                    var1.c(1, 1, var2);
                    var1.c(-1, 1, var2);
                    var1.c(1, -1, var2);
                    var1.c(-1, -1, var2);
                    break L15;
                  }
                }
                L16: {
                  stackOut_52_0 = 0;
                  stackOut_52_1 = ir.field_n;
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  if (jc.field_j.field_h != 0) {
                    stackOut_54_0 = stackIn_54_0;
                    stackOut_54_1 = stackIn_54_1;
                    stackOut_54_2 = 0;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    stackIn_55_2 = stackOut_54_2;
                    break L16;
                  } else {
                    stackOut_53_0 = stackIn_53_0;
                    stackOut_53_1 = stackIn_53_1;
                    stackOut_53_2 = 1;
                    stackIn_55_0 = stackOut_53_0;
                    stackIn_55_1 = stackOut_53_1;
                    stackIn_55_2 = stackOut_53_2;
                    break L16;
                  }
                }
                hg.a(stackIn_55_0, stackIn_55_1, stackIn_55_2 != 0, oj.field_s);
                break L12;
              }
            }
          }
          L17: {
            if (null == ph.field_f) {
              break L17;
            } else {
              if (o.field_C != null) {
                L18: {
                  ph.field_f.c(434, 390);
                  dl.field_h.c(0, 0);
                  if (1 != jc.field_j.field_h) {
                    break L18;
                  } else {
                    qe.a(ph.field_f.field_z + -4, 7 * ph.field_f.field_A / 12, 64, 392, (byte) 120, 436);
                    break L18;
                  }
                }
                L19: {
                  stackOut_61_0 = 0;
                  stackOut_61_1 = tn.field_o;
                  stackIn_63_0 = stackOut_61_0;
                  stackIn_63_1 = stackOut_61_1;
                  stackIn_62_0 = stackOut_61_0;
                  stackIn_62_1 = stackOut_61_1;
                  if (jc.field_j.field_h != 1) {
                    stackOut_63_0 = stackIn_63_0;
                    stackOut_63_1 = stackIn_63_1;
                    stackOut_63_2 = 0;
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    stackIn_64_2 = stackOut_63_2;
                    break L19;
                  } else {
                    stackOut_62_0 = stackIn_62_0;
                    stackOut_62_1 = stackIn_62_1;
                    stackOut_62_2 = 1;
                    stackIn_64_0 = stackOut_62_0;
                    stackIn_64_1 = stackOut_62_1;
                    stackIn_64_2 = stackOut_62_2;
                    break L19;
                  }
                }
                hg.a(stackIn_64_0, stackIn_64_1, stackIn_64_2 != 0, ln.field_o);
                break L17;
              } else {
                break L17;
              }
            }
          }
          L20: {
            L21: {
              if (vq.field_Yb == null) {
                break L21;
              } else {
                var1_int = 357 - vq.field_Yb.field_y / 2;
                vq.field_Yb.c(-vq.field_Yb.field_w + 269, var1_int);
                w.field_f.c(586, var1_int);
                if (~gg.field_f >= ~var1_int) {
                  break L21;
                } else {
                  if (gg.field_f < vq.field_Yb.field_A + var1_int) {
                    var2 = (ao.a(uf.field_X << 4, true) * 40 >> 16) + 40;
                    if (var2 > 0) {
                      L22: {
                        if (~wn.field_i >= ~(-vq.field_Yb.field_z + 269)) {
                          break L22;
                        } else {
                          if (wn.field_i >= 269) {
                            break L22;
                          } else {
                            vq.field_Yb.c(-vq.field_Yb.field_w + 268, var1_int - 1, var2);
                            vq.field_Yb.c(269 - (vq.field_Yb.field_w + -1), -1 + var1_int, var2);
                            vq.field_Yb.c(-vq.field_Yb.field_w + 268, var1_int - -1, var2);
                            vq.field_Yb.c(1 + (-vq.field_Yb.field_w + 269), var1_int - -1, var2);
                            break L21;
                          }
                        }
                      }
                      if (wn.field_i <= 586) {
                        break L21;
                      } else {
                        if (wn.field_i < vq.field_Yb.field_z + 586) {
                          w.field_f.c(585, -1 + var1_int, var2);
                          w.field_f.c(587, var1_int - 1, var2);
                          w.field_f.c(585, var1_int - -1, var2);
                          w.field_f.c(587, 1 + var1_int, var2);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                    } else {
                      pj.f(-1);
                      jr.field_m[rj.field_f].c(269, 340);
                      break L20;
                    }
                  } else {
                    break L21;
                  }
                }
              }
            }
            pj.f(-1);
            jr.field_m[rj.field_f].c(269, 340);
            break L20;
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<col=ff9999>Reds</col>";
        field_f = "You are offering to draw.";
    }
}
