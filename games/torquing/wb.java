/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends am {
    private int field_s;
    static vc field_u;
    static String field_t;

    final static void a(int param0, String[] param1, byte param2, String param3) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Object var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              kh.field_o = ag.field_c;
              if (param0 != 255) {
                L2: {
                  if (param0 < 100) {
                    break L2;
                  } else {
                    if (param0 > 105) {
                      break L2;
                    } else {
                      var4 = param1;
                      ci.a(123, var4);
                      qi.field_d = di.a(0, param1);
                      break L1;
                    }
                  }
                }
                qi.field_d = pg.a(param0, param3, -1);
                break L1;
              } else {
                L3: {
                  stackOut_2_0 = 74;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (oh.field_d >= 13) {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L3;
                  } else {
                    stackOut_3_0 = stackIn_3_0;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L3;
                  }
                }
                qi.field_d = pa.b(stackIn_5_0, stackIn_5_1 != 0);
                var6 = null;
                ci.a(102, (String[]) null);
                break L1;
              }
            }
            var4_int = 85 / ((param2 - -8) / 47);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("wb.A(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final void a(fj param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param1 == 35) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            L2: {
              if (param2 != 0) {
                break L2;
              } else {
                ((wb) this).field_s = param0.i(7088);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("wb.H(");
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
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void g(byte param0) {
        field_t = null;
        field_u = null;
    }

    final static void b(int param0) {
        t var1 = null;
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
        t var9 = null;
        int var10 = 0;
        t var11 = null;
        t var12 = null;
        String var14 = null;
        t var16 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        L0: {
          var10 = Torquing.field_u;
          if (qm.field_a == null) {
            break L0;
          } else {
            if (!qm.field_a.a(-12749)) {
              break L0;
            } else {
              if (!qm.field_a.a(true, "benefits")) {
                break L0;
              } else {
                if (ae.field_mb == null) {
                  break L0;
                } else {
                  if (!ae.field_mb.a(-12749)) {
                    break L0;
                  } else {
                    if (ae.field_mb.a(true, "benefits")) {
                      kn.field_f = mn.a(qm.field_a, "benefits", "headline", 86);
                      mk.field_a = mn.a(qm.field_a, "benefits", "blurbpane", param0 ^ -88);
                      vk.field_s = mn.a(qm.field_a, "benefits", "button", 89);
                      je.field_e = mn.a(qm.field_a, "benefits", "signup_text", 113);
                      ki.field_H = mn.a(qm.field_a, "benefits", "menu_text", 111);
                      jg.field_t = mn.a(qm.field_a, "benefits", "button_frame", 112);
                      qc.field_db = mn.a(qm.field_a, "benefits", "arrow", 110);
                      lh.field_O = (uc) (Object) qg.a(ae.field_mb, qm.field_a, "benefits", "large_font", 255);
                      kl.field_o = (uc) (Object) qg.a(ae.field_mb, qm.field_a, "benefits", "small_font", param0 + 256);
                      var27 = ph.field_e;
                      var2 = ph.field_j;
                      var3 = ph.field_d;
                      ph.b(mo.field_w);
                      var11 = new t(qc.field_db.field_s + 4, 4 + qc.field_db.field_t);
                      var11.e();
                      qc.field_db.d(2, 2, fa.field_c);
                      hb.a(0, false, var11, var11.field_t, var11.field_s, 1, 0, 2);
                      qc.field_db = var11;
                      p.field_w = qc.field_db.b();
                      var12 = new t(195, 221);
                      var6 = var12.field_s / 2;
                      var12.e();
                      lh.field_O.c(ff.a(new String[1], 0, eo.field_c), var6, 40, 16777215, -1);
                      kl.field_o.c(ff.a(new String[1], 0, wd.field_r), var6, 60, 16777215, -1);
                      lh.field_O.c(ff.a(new String[1], 0, di.field_c), var6, 110, 16777215, -1);
                      kl.field_o.c(ff.a(new String[1], 0, lc.field_B), var6, 130, 16777215, -1);
                      lh.field_O.c(rn.field_a, var6, 180, 16777215, -1);
                      kl.field_o.c(ii.field_o, var6, 200, 16777215, -1);
                      hb.a(0, false, var12, var12.field_t, var12.field_s, 1, 0, 3);
                      mk.field_a.e();
                      var12.d(18 - mk.field_a.field_v, -mk.field_a.field_r + 241);
                      var7 = 0;
                      L1: while (true) {
                        if (ik.field_k.length <= var7) {
                          ik.field_k = null;
                          ue.field_f = je.field_e.c();
                          ue.field_f.e();
                          kp.a(ph.field_j, 2 * ph.field_d / 3, 0, (byte) 16, 64, 0);
                          ph.a(var27, var2, var3);
                          ph.a(mo.field_w);
                          qm.field_a = null;
                          na.field_E = 231 + (vk.field_s.field_s - jg.field_t.field_s) / 2;
                          db.field_j = (-jg.field_t.field_s + vk.field_s.field_s) / 2 + 434;
                          we.field_h = 390 + (-jg.field_t.field_t + vk.field_s.field_t) / 2;
                          nc.field_a = 390 - -((vk.field_s.field_t + -jg.field_t.field_t) / 2);
                          break L0;
                        } else {
                          ln.field_H[var7].e();
                          int discarded$3 = kl.field_o.a(ik.field_k[var7], 3, 3, ln.field_H[var7].field_s - 6, ln.field_H[var7].field_t - 6, fa.field_c, -1, 1, 1, kl.field_o.field_t + kl.field_o.field_x);
                          hb.a(0, false, ln.field_H[var7], ln.field_H[var7].field_t, ln.field_H[var7].field_s, 1, 0, 3);
                          var7++;
                          continue L1;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
          }
        }
        L2: {
          if (param0 == -1) {
            break L2;
          } else {
            field_u = null;
            break L2;
          }
        }
        if (null == jd.field_D) {
          return;
        } else {
          L3: {
            if (j.field_F == null) {
              break L3;
            } else {
              if (null != lh.field_O) {
                L4: {
                  var28 = ph.field_e;
                  var2 = ph.field_j;
                  var3 = ph.field_d;
                  ph.b(mo.field_w);
                  var14 = ff.a(new String[1], 0, wc.field_t);
                  var5 = lh.field_O.b(var14, hn.field_x);
                  var6 = lh.field_O.a(var14, hn.field_x, lh.field_O.field_x + lh.field_O.field_t);
                  var7 = (-var5 + hn.field_x) / 2 + up.field_d;
                  var5 += 6;
                  var8 = lb.field_y - -((-var6 + wh.field_w) / 2);
                  var7 -= 3;
                  var6 += 6;
                  var8 -= 3;
                  if (var7 >= 0) {
                    break L4;
                  } else {
                    var9_int = -var7;
                    var7 = var7 + var9_int;
                    var5 = var5 + var9_int * 2;
                    j.field_F.field_w = j.field_F.field_w + var9_int * 2;
                    up.field_d = up.field_d + var9_int;
                    gi.field_d = gi.field_d - var9_int;
                    j.field_F.field_v = j.field_F.field_v + var9_int;
                    break L4;
                  }
                }
                L5: {
                  if (var5 + var7 > j.field_F.field_w) {
                    var9_int = var7 - (-var5 - -j.field_F.field_w);
                    j.field_F.field_w = j.field_F.field_w + 2 * var9_int;
                    var5 = var5 + 2 * var9_int;
                    up.field_d = up.field_d + var9_int;
                    var7 = var7 + var9_int;
                    gi.field_d = gi.field_d - var9_int;
                    j.field_F.field_v = j.field_F.field_v + var9_int;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var8 < 0) {
                    var9_int = -var8;
                    Torquing.field_x = Torquing.field_x - var9_int;
                    var6 = var6 + 2 * var9_int;
                    lb.field_y = lb.field_y + var9_int;
                    j.field_F.field_u = j.field_F.field_u + var9_int * 2;
                    j.field_F.field_r = j.field_F.field_r + var9_int;
                    var8 = var8 + var9_int;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (j.field_F.field_u >= var8 + var6) {
                    break L7;
                  } else {
                    var9_int = -j.field_F.field_u + (var6 + var8);
                    lb.field_y = lb.field_y + var9_int;
                    var6 = var6 + 2 * var9_int;
                    j.field_F.field_r = j.field_F.field_r + var9_int;
                    j.field_F.field_u = j.field_F.field_u + var9_int * 2;
                    var8 = var8 + var9_int;
                    Torquing.field_x = Torquing.field_x - var9_int;
                    break L7;
                  }
                }
                j.field_F.a();
                var9 = new t(j.field_F.field_w, j.field_F.field_u);
                var9.e();
                int discarded$4 = lh.field_O.a(var14, up.field_d, lb.field_y, hn.field_x, wh.field_w, 16777215, -1, 1, 1, lh.field_O.field_x - -lh.field_O.field_t);
                hb.a(0, false, var9, var9.field_u, var9.field_w, 1, 0, 3);
                j.field_F.e();
                var9.d(0, 0);
                vc.field_b = new t(640, 480);
                vc.field_b.e();
                j.field_F.a((j.field_F.field_w >> 1) + gi.field_d, Torquing.field_x + (j.field_F.field_u >> 1), tl.field_n, 4096);
                j.field_F = null;
                vc.field_b.d();
                ph.a(var28, var2, var3);
                ph.a(mo.field_w);
                break L3;
              } else {
                break L3;
              }
            }
          }
          L8: {
            if (null == hf.field_a) {
              break L8;
            } else {
              if (kl.field_o == null) {
                break L8;
              } else {
                var29 = ph.field_e;
                var2 = ph.field_j;
                var3 = ph.field_d;
                ph.b(mo.field_w);
                var16 = new t(412, 43);
                var5_ref_String = ff.a(new String[1], 0, co.field_d);
                hf.field_a = null;
                var16.e();
                int discarded$5 = kl.field_o.a(var5_ref_String, 3, 3, var16.field_s - 6, -6 + var16.field_t, 16777215, -1, 0, 1, kl.field_o.field_t + kl.field_o.field_x);
                hb.a(0, false, var16, var16.field_t, var16.field_s, 1, 0, 3);
                jd.field_D.e();
                var16.d(199 + -jd.field_D.field_v, -jd.field_D.field_r + 83);
                ph.a(var29, var2, var3);
                ph.a(mo.field_w);
                break L8;
              }
            }
          }
          L9: {
            if (kj.field_b == null) {
              break L9;
            } else {
              if (kl.field_o != null) {
                var30 = ph.field_e;
                var2 = ph.field_j;
                var3 = ph.field_d;
                ph.b(mo.field_w);
                var4 = 6 + kl.field_o.b(eh.field_e, 640);
                var5 = var4 - (-kj.field_b.field_w + -20);
                var6 = -(var5 / 2) + 427;
                var7 = 20 + var6 + kj.field_b.field_w;
                jd.field_D.e();
                kl.field_o.b(eh.field_e, -jd.field_D.field_v + var7, kl.field_o.field_x + (155 - (jd.field_D.field_r + -kl.field_o.field_t)), 16777215, -1);
                hb.a(var7 + (-jd.field_D.field_v - 4), false, jd.field_D, 50, var4, 1, 155 + -jd.field_D.field_r, 3);
                var8 = -((-kl.field_o.field_t + (-kl.field_o.field_x + kj.field_b.field_u) - 3) / 2) + (-jd.field_D.field_r + 155);
                kj.field_b.d(var6 - jd.field_D.field_v, var8);
                ph.a(var30, var2, var3);
                ph.a(mo.field_w);
                kj.field_b = null;
                break L9;
              } else {
                break L9;
              }
            }
          }
          L10: {
            ph.b(mo.field_w);
            ph.a(16, 16, 608, 112, 15, ln.field_G, of.field_o);
            ph.a(231, 144, 393, 232, 15, ln.field_G, of.field_o);
            if (kn.field_f != null) {
              kn.field_f.d(0, 0);
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (null == mk.field_a) {
              break L11;
            } else {
              mk.field_a.d(0, 0);
              break L11;
            }
          }
          L12: {
            jd.field_D.d(0, 0);
            if (vc.field_b != null) {
              vc.field_b.d(0, 0);
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            if (vk.field_s == null) {
              break L13;
            } else {
              if (jg.field_t == null) {
                break L13;
              } else {
                L14: {
                  vk.field_s.d(231, 390);
                  var1 = je.field_e;
                  if (sd.field_s.field_g != 0) {
                    break L14;
                  } else {
                    var1 = ue.field_f;
                    break L14;
                  }
                }
                L15: {
                  var1.d(0, 0);
                  stackOut_49_0 = -109;
                  stackOut_49_1 = ke.field_c;
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  if (sd.field_s.field_g != 0) {
                    stackOut_51_0 = stackIn_51_0;
                    stackOut_51_1 = stackIn_51_1;
                    stackOut_51_2 = 3;
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    stackIn_52_2 = stackOut_51_2;
                    break L15;
                  } else {
                    stackOut_50_0 = stackIn_50_0;
                    stackOut_50_1 = stackIn_50_1;
                    stackOut_50_2 = 4;
                    stackIn_52_0 = stackOut_50_0;
                    stackIn_52_1 = stackOut_50_1;
                    stackIn_52_2 = stackOut_50_2;
                    break L15;
                  }
                }
                L16: {
                  var2 = (cd.a(stackIn_52_0, stackIn_52_1 << stackIn_52_2) * 40 >> 16) + 40;
                  if (var2 > 0) {
                    vk.field_s.a(230, 389, var2);
                    vk.field_s.a(232, 389, var2);
                    vk.field_s.a(232, 391, var2);
                    vk.field_s.a(230, 391, var2);
                    var1.a(1, 1, var2);
                    var1.a(-1, 1, var2);
                    var1.a(1, -1, var2);
                    var1.a(-1, -1, var2);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  stackOut_55_0 = we.field_h;
                  stackOut_55_1 = na.field_E;
                  stackOut_55_2 = 0;
                  stackIn_57_0 = stackOut_55_0;
                  stackIn_57_1 = stackOut_55_1;
                  stackIn_57_2 = stackOut_55_2;
                  stackIn_56_0 = stackOut_55_0;
                  stackIn_56_1 = stackOut_55_1;
                  stackIn_56_2 = stackOut_55_2;
                  if (sd.field_s.field_g != 0) {
                    stackOut_57_0 = stackIn_57_0;
                    stackOut_57_1 = stackIn_57_1;
                    stackOut_57_2 = stackIn_57_2;
                    stackOut_57_3 = 0;
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    stackIn_58_2 = stackOut_57_2;
                    stackIn_58_3 = stackOut_57_3;
                    break L17;
                  } else {
                    stackOut_56_0 = stackIn_56_0;
                    stackOut_56_1 = stackIn_56_1;
                    stackOut_56_2 = stackIn_56_2;
                    stackOut_56_3 = 1;
                    stackIn_58_0 = stackOut_56_0;
                    stackIn_58_1 = stackOut_56_1;
                    stackIn_58_2 = stackOut_56_2;
                    stackIn_58_3 = stackOut_56_3;
                    break L17;
                  }
                }
                eh.a(stackIn_58_0, stackIn_58_1, stackIn_58_2, stackIn_58_3 != 0);
                break L13;
              }
            }
          }
          L18: {
            if (vk.field_s == null) {
              break L18;
            } else {
              if (null == jg.field_t) {
                break L18;
              } else {
                L19: {
                  vk.field_s.d(434, 390);
                  ki.field_H.d(0, 0);
                  if (sd.field_s.field_g != 1) {
                    break L19;
                  } else {
                    kp.a(-4 + vk.field_s.field_s, vk.field_s.field_t * 7 / 12, 436, (byte) 16, 64, 392);
                    break L19;
                  }
                }
                L20: {
                  stackOut_63_0 = nc.field_a;
                  stackOut_63_1 = db.field_j;
                  stackOut_63_2 = 0;
                  stackIn_65_0 = stackOut_63_0;
                  stackIn_65_1 = stackOut_63_1;
                  stackIn_65_2 = stackOut_63_2;
                  stackIn_64_0 = stackOut_63_0;
                  stackIn_64_1 = stackOut_63_1;
                  stackIn_64_2 = stackOut_63_2;
                  if (1 != sd.field_s.field_g) {
                    stackOut_65_0 = stackIn_65_0;
                    stackOut_65_1 = stackIn_65_1;
                    stackOut_65_2 = stackIn_65_2;
                    stackOut_65_3 = 0;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    stackIn_66_2 = stackOut_65_2;
                    stackIn_66_3 = stackOut_65_3;
                    break L20;
                  } else {
                    stackOut_64_0 = stackIn_64_0;
                    stackOut_64_1 = stackIn_64_1;
                    stackOut_64_2 = stackIn_64_2;
                    stackOut_64_3 = 1;
                    stackIn_66_0 = stackOut_64_0;
                    stackIn_66_1 = stackOut_64_1;
                    stackIn_66_2 = stackOut_64_2;
                    stackIn_66_3 = stackOut_64_3;
                    break L20;
                  }
                }
                eh.a(stackIn_66_0, stackIn_66_1, stackIn_66_2, stackIn_66_3 != 0);
                break L18;
              }
            }
          }
          L21: {
            if (qc.field_db != null) {
              L22: {
                var1_int = 357 - qc.field_db.field_u / 2;
                qc.field_db.d(269 + -qc.field_db.field_w, var1_int);
                p.field_w.d(586, var1_int);
                if (k.field_e <= var1_int) {
                  break L22;
                } else {
                  if (k.field_e >= qc.field_db.field_t + var1_int) {
                    break L22;
                  } else {
                    var2 = (cd.a(-118, ke.field_c << 4) * 40 >> 16) + 40;
                    if (0 >= var2) {
                      break L22;
                    } else {
                      L23: {
                        if (n.field_t <= -qc.field_db.field_s + 269) {
                          break L23;
                        } else {
                          if (n.field_t >= 269) {
                            break L23;
                          } else {
                            qc.field_db.a(-1 + -qc.field_db.field_w + 269, var1_int + -1, var2);
                            qc.field_db.a(-qc.field_db.field_w + 270, -1 + var1_int, var2);
                            qc.field_db.a(-1 + (269 + -qc.field_db.field_w), var1_int - -1, var2);
                            qc.field_db.a(-qc.field_db.field_w + 270, 1 + var1_int, var2);
                            break L22;
                          }
                        }
                      }
                      if (n.field_t <= 586) {
                        break L22;
                      } else {
                        if (n.field_t < qc.field_db.field_s + 586) {
                          p.field_w.a(585, var1_int - 1, var2);
                          p.field_w.a(587, var1_int + -1, var2);
                          p.field_w.a(585, 1 + var1_int, var2);
                          p.field_w.a(587, 1 + var1_int, var2);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                }
              }
              lc.g(param0 + 102);
              ln.field_H[da.field_a].d(269, 340);
              break L21;
            } else {
              lc.g(param0 + 102);
              ln.field_H[da.field_a].d(269, 340);
              break L21;
            }
          }
          return;
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var24 = null;
        int[] var25 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var16 = Torquing.field_u;
          var17 = ((wb) this).field_l.a(param1, 25657);
          var3 = var17;
          if (((wb) this).field_l.field_b) {
            var25 = ((wb) this).b(0, 0, vp.field_I & -1 + param1);
            var5 = ((wb) this).b(0, 0, param1);
            var24 = ((wb) this).b(0, 0, 1 + param1 & vp.field_I);
            var7 = 0;
            L1: while (true) {
              if (ci.field_c <= var7) {
                break L0;
              } else {
                L2: {
                  var8 = ((wb) this).field_s * (var24[var7] + -var25[var7]);
                  var9 = ((wb) this).field_s * (var5[jh.field_A & 1 + var7] - var5[var7 + -1 & jh.field_A]);
                  var10 = var9 >> 12;
                  var11 = var8 >> 12;
                  var12 = var10 * var10 >> 12;
                  var13 = var11 * var11 >> 12;
                  var14 = (int)(4096.0 * Math.sqrt((double)((float)(var13 + var12 - -4096) / 4096.0f)));
                  if (var14 != 0) {
                    stackOut_6_0 = 16777216 / var14;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                var15 = stackIn_7_0;
                var17[var7] = -var15 + 4096;
                var7++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        if (param0 < 86) {
          return null;
        } else {
          return var17;
        }
    }

    final static void a(String param0, int param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              wh.field_u = param0;
              if (param1 == 390) {
                break L1;
              } else {
                var3 = null;
                wb.a((String) null, 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wb.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    public wb() {
        super(1, true);
        ((wb) this).field_s = 4096;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = null;
    }
}
