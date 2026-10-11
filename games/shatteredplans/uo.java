/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo {
    static String field_b;
    static int[] field_f;
    static int[] field_h;
    static String field_d;
    static String field_c;
    static pf field_a;
    static int field_g;
    static boolean field_e;

    final static int a(byte param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          le.field_e.a(kd.field_a, true, oo.field_e, (byte) 0);
          le.field_e.i(120);
          if (param0 != -75) {
            stackIn_3_0 = -107;
            return stackIn_3_0;
          }
          stackIn_6_0 = 55;
          while (cc.$cfr$intArgs$e$296a4c2b494e(stackIn_6_0)) {
            le.field_e.a(oq.field_j, ho.field_h, true);
            stackIn_6_0 = 55;
          }
          if (cr.field_b != -1) {
            var1_int = cr.field_b;
            qj.a((byte) -127, -1);
            stackIn_12_0 = var1_int;
            return stackIn_12_0;
          }
          if (mg.field_C) {
            stackIn_15_0 = 3;
            return stackIn_15_0;
          }
          if (fj.field_s == ue.field_a) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (!wh.field_a.b(14)) {
            stackIn_22_0 = 1;
            return stackIn_22_0;
          }
          if (ee.field_l != ue.field_a) {
            stackIn_27_0 = -1;
            return stackIn_27_0;
          }
          stackIn_25_0 = 2;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "uo.A(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_h = null;
        field_f = null;
        field_c = null;
        field_b = null;
        if (!param0) {
          uo.a((byte) 46, false, 50, true, true);
        }
    }

    final static void a(byte param0, bi param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = 16711935 & param2;
          if (param0 <= 70) {
            uo.a(true);
          }
          param2 = param2 & 65280;
          var4 = -1;
          for (var5 = -param1.field_w; var5 < 0; var5++) {
            for (var6 = -param1.field_z; var6 < 0; var6++) {
              var4++;
              var7 = param1.field_B[var4];
              if (var7 != 0) {
                var8 = ((var7 & 16711680) >> 16) + (var7 & 255) + ((65280 & var7) >> 7) >> 2;
                var7 = (param2 * var8 & 16711680 | var8 * var3_int & -16711936) >>> 8;
                if (0 == var7) {
                  var7 = 1;
                }
                param1.field_B[var4] = var7;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("uo.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1, int param2, boolean param3, boolean param4) {
        qr stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        int stackIn_40_0 = 0;
        qr stackIn_159_0 = null;
        boolean stackIn_160_1 = false;
        qr stackIn_164_0 = null;
        boolean stackIn_165_1 = false;
        qr stackIn_169_0 = null;
        boolean stackIn_170_1 = false;
        Object stackIn_172_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        qr var6 = null;
        qr var7 = null;
        qr var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        String var13_ref = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        pf var17 = null;
        Object var18 = null;
        mj var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        qr var21 = null;
        int[] var22 = null;
        String var23 = null;
        int[] var24 = null;
        qr var25 = null;
        int var11_intLifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13_intLifetime1;
        int var14_intLifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17_intLifetime1;
        int var18_intLifetime1;
        int var11_intLifetime2;
        int var16Lifetime1Lifetime1;
        var18 = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          qo.a(22353, ee.field_k);
          if (null != np.field_a) {
            boolean decompiledFrameRemainder0 = true;
            i.field_g.field_s = true;
            go.field_I.field_mb = 0;
            var21 = go.field_I;
            var25 = var21;
            var25.field_K = 0;
            var6 = aq.field_j;
            aq.field_j.field_mb = 0;
            var6.field_K = 0;
            dn.field_f.field_mb = 0;
            var7 = dn.field_f;
            var7.field_K = 0;
            if (!ip.a((byte) -94)) {
              var9_ref_String = np.field_a.field_Xb;
              tj.field_f.field_z = re.a(he.field_q, 4371, new String[]{var9_ref_String}).toUpperCase();
              dn.field_f.a(pf.field_g.field_K, 40, (byte) 56, pf.field_g.field_mb - 40, 0);
              dn.field_f.field_z = re.a(gq.field_a, 4371, new String[]{var9_ref_String});
              var8 = dn.field_f;
            } else {
              tj.field_f.field_z = n.field_m.toUpperCase();
              var9 = (pf.field_g.field_K + 2) / 2;
              go.field_I.a(-2 + var9, 40, (byte) 124, pf.field_g.field_mb - 40, 0);
              if (np.field_a.field_Lb >= np.field_a.field_Eb) {
                go.field_I.field_z = gm.field_j.toUpperCase();
                go.field_I.field_s = false;
              } else {
                go.field_I.field_z = ph.field_c.toUpperCase();
                go.field_I.field_s = true;
              }
              go.field_I.field_F = ea.field_a.field_F;
              if (0 < ah.field_X) {
                if (ah.field_X != 1) {
                  var10_ref_String = re.a(jg.field_e, 4371, new String[]{Integer.toString(ah.field_X)});
                } else {
                  var10_ref_String = ui.field_k;
                }
                if ((16 & ln.field_w) == 0 &&
                  !ti.field_e) {
                  go.field_I.field_F = ea.field_a.field_lb;
                }
                go.field_I.field_z = go.field_I.field_z + "<br>" + var10_ref_String;
              }
              aq.field_j.a(-var9 + pf.field_g.field_K, 40, (byte) 82, pf.field_g.field_mb - 40, var9);
              aq.field_j.field_z = lp.field_u.toUpperCase();
              stackIn_20_0 = aq.field_j;
              stackIn_21_1 = (param3) && (sf.field_e == 0L);
              stackIn_20_0.field_s = stackIn_21_1;
              var8 = aq.field_j;
              var10 = 2;
              if (pe.field_D != null) {
                if (lr.field_c == null) {
                  lr.field_c = new byte[em.field_k];
                  ek.field_F = new boolean[em.field_k];
                }
                for (var11_int = 0; var11_int < em.field_k; var11_int++) {
                  ek.field_F[var11_int] = false;
                }
                var10 = 0;
                L11: while (true) {
                  if (var10 < 2) {
                    var11_intLifetime2 = 0;
                    var12 = 0;
                    while (true) {
                      if (pe.field_D.length <= var12) {
                        if (var11_intLifetime2 != 0) {
                          break L11;
                        }
                        var10++;
                        continue L11;
                      }
                      var24 = pe.field_D[var12];
                      var22 = var24;
                      var13 = var22;
                      var14_int = 0;
                      L15: while (true) {
                        if (var14_int >= var24.length) {
                          var11_intLifetime2 = 1;
                          var14_int = -1;
                          for (var15 = 0; var24.length > var15; var15 += 2) {
                            var16 = var24[var15];
                            if (var16 > var14_int) {
                              var14_int = var16;
                            }
                          }
                          ek.field_F[var14_int] = true;
                        } else {
                          var15 = var24[var14_int];
                          var16 = var13[var14_int + 1];
                          if (var15 != -1) {
                            if ((255 & np.field_a.field_dc[var15]) != var16) {
                              break L15;
                            }
                          } else {
                            if (var10 == 0) {
                              stackIn_40_0 = np.field_a.field_Eb;
                            } else {
                              stackIn_40_0 = np.field_a.field_Lb;
                            }
                            var17_int = stackIn_40_0;
                            if (var16 != var17_int) {
                              break L15;
                            }
                          }
                          var14_int += 2;
                          continue;
                        }
                        break;
                      }
                      var12++;
                    }
                  }
                  break;
                }
                if (!(2 > bs.field_b) &&
                  di.field_p[12]) {
                  var10 = 2;
                }
              }
              if (var10 >= 2) {
                if ((null != td.field_E ||
                  null != ci.field_h ||
                  null != pg.field_A ||
                  null != ji.field_D)) {
                  var11_intLifetime1 = 0;
                  var12Lifetime1 = 0;
                  var13_int = 0;
                  var14_intLifetime1 = 0;
                  var15Lifetime1 = 0;
                  for (var16Lifetime1 = 0; em.field_k > var16Lifetime1; var16Lifetime1++) {
                    var17_intLifetime1 = 255 & np.field_a.field_dc[var16Lifetime1];
                    if (null != td.field_E &&
                      td.field_E[var16Lifetime1] != null &&
                      td.field_E[var16Lifetime1][var17_intLifetime1]) {
                      var11_intLifetime1 = 1;
                    }
                    if (null != ci.field_h &&
                      ci.field_h[var16Lifetime1] != null) {
                      var18_int = ci.field_h[var16Lifetime1][var17_intLifetime1];
                      if (var18_int != 0 &&
                        !hm.field_o) {
                        var11_intLifetime1 = 1;
                      }
                      if (var18_int > var13_int) {
                        var13_int = var18_int;
                      }
                    }
                    if (pg.field_A != null &&
                      null != pg.field_A[var16Lifetime1]) {
                      var18_intLifetime1 = pg.field_A[var16Lifetime1][var17_intLifetime1];
                      if (var14_intLifetime1 < var18_intLifetime1) {
                        var14_intLifetime1 = var18_intLifetime1;
                      }
                      if (var18_intLifetime1 != 0 &&
                        !hm.field_o) {
                        var11_intLifetime1 = 1;
                      }
                    }
                    if (null != ji.field_D &&
                      ji.field_D[var16Lifetime1] != null) {
                      var15Lifetime1 = var15Lifetime1 | ji.field_D[var16Lifetime1][var17_intLifetime1];
                    }
                  }
                  var16Lifetime1Lifetime1 = 0;
                  var17 = ro.field_a.field_xb.field_M;
                  var18_ref = (mj) (var17.d(0));
                  L26: while (true) {
                    if (var18_ref != null) {
                      if (!var18_ref.h(-80)) {
                        if (var11_intLifetime1 != 0 &&
                          !var18_ref.field_Ub) {
                          var16Lifetime1Lifetime1 = 1;
                          break L26;
                        }
                        if (var18_ref.field_Qb < var13_int) {
                          var16Lifetime1Lifetime1 = 1;
                          break L26;
                        }
                        if (var14_intLifetime1 > var18_ref.field_Fb) {
                          var16Lifetime1Lifetime1 = 1;
                          break L26;
                        }
                        if ((var15Lifetime1 & ~var18_ref.field_Wb) > 0) {
                          var16Lifetime1Lifetime1 = 1;
                          break L26;
                        }
                        if (var12Lifetime1 != 0) {
                          var16Lifetime1Lifetime1 = 1;
                          break L26;
                        }
                      }
                      var18_ref = (mj) (var17.a((byte) -71));
                      continue;
                    }
                    break;
                  }
                  if (2 <= bs.field_b &&
                    di.field_p[12]) {
                    var16Lifetime1Lifetime1 = 0;
                  }
                  if ((var16Lifetime1Lifetime1 != 0)) {
                    aq.field_j.field_s = false;
                    if (!(!aq.field_j.field_v)) {
                      if (n.field_h.field_d.field_zb == 0) {
                        dn.field_k = on.field_a;
                      } else {
                        dn.field_k = re.a(jr.field_l, param0 ^ 4356, new String[]{jo.field_c});
                      }
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                aq.field_j.field_s = false;
                if (aq.field_j.field_v) {
                  var11 = null;
                  var12Lifetime2 = 0;
                  for (var13_intLifetime1 = 0; em.field_k > var13_intLifetime1; var13_intLifetime1++) {
                    if (ek.field_F[var13_intLifetime1]) {
                      var23 = "<col=A00000>" + gm.field_l[var13_intLifetime1] + "</col>";
                      if (var11 == null) {
                        var11 = var23;
                      } else {
                        var11 = (String) (var11) + ", " + var23;
                        var12Lifetime2 = 1;
                      }
                    }
                  }
                  if (var10 != 0) {
                    var13_ref = md.field_I;
                    if (var12Lifetime2 == 0) {
                      var14 = re.a(r.field_f, 4371, new String[]{(String) (var11)});
                    } else {
                      var14 = mi.field_b + (String) (var11);
                    }
                  } else {
                    var13_ref = up.field_e;
                    if (var12Lifetime2 != 0) {
                      var14 = br.field_l + (String) (var11);
                    } else {
                      var14 = re.a(js.field_h, 4371, new String[]{(String) (var11)});
                    }
                  }
                  dn.field_k = "<col=A00000>" + var13_ref + "<br>" + var14;
                }
              }
            }
            if (sf.field_e != 0L) {
              var9 = (int)(sf.field_e - pr.a(14274));
              var9 = (var9 + 999) / 1000;
              if (var9 < 1) {
                var9 = 1;
              }
              var8.field_z = re.a(oe.field_b, 4371, new String[]{Integer.toString(var9)});
            }
            ac.field_x.field_z = re.a(eg.field_r, 4371, new String[]{Integer.toString(np.field_a.field_Lb), Integer.toString(np.field_a.field_Eb)});
          }
          stackIn_159_0 = am.field_xb;
          stackIn_160_1 = (param1) && (!param4) && (!ti.field_e);
          ((qr) (Object) stackIn_159_0).a(stackIn_160_1, -20429);
          stackIn_164_0 = pf.field_g;
          stackIn_165_1 = (param1) && (!param4) && (!ti.field_e);
          ((qr) (Object) stackIn_164_0).a(stackIn_165_1, -20429);
          stackIn_169_0 = ed.field_d;
          stackIn_170_1 = (param1) && (!param4) && (ti.field_e);
          ((qr) (Object) stackIn_169_0).a(stackIn_170_1, -20429);
          n.field_h.field_d.f(false);
          if (param0 != 23) {
            stackIn_172_0 = null;
            field_c = (String) (stackIn_172_0);
          }
          if (np.field_a != null) {
            if (0 != i.field_g.field_rb) {
              tk.a(param2, np.field_a.g(-92), (byte) -2);
            }
            if (0 != aq.field_j.field_rb) {
              ac.field_u = true;
            }
            if (0 != go.field_I.field_rb) {
              ti.field_e = true;
            }
            if (oo.field_c.field_rb != 0) {
              ti.field_e = false;
            }
            sc.a(63, false, np.field_a, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var5), "uo.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_b = "Offer unrated rematch";
        field_h = new int[128];
        field_d = "Press 'ESC' to exit the game";
        field_c = "You have entered another game.";
    }
}
