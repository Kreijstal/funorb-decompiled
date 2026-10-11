/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static nk field_a;
    static int[] field_b;
    static int field_f;
    static String field_e;
    static String field_d;
    static String field_c;

    final static void a(boolean param0, ff param1, int param2) {
        uf var5 = null;
        int var4 = 0;
        try {
          var5 = we.field_b;
          var5.f(param2, -4);
          var5.field_n = var5.field_n + 1;
          var4 = var5.field_n;
          var5.a(true, 1);
          var5.a(param0, param1.field_q);
          var5.b(17, param1.field_r);
          var5.a(param1.field_p, false);
          var5.a(param1.field_n, false);
          var5.a(param1.field_s, false);
          var5.a(param1.field_t, false);
          var5.a((byte) -15, var4);
          var5.b(var5.field_n - var4, true);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "mc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        if (param0 != 0) {
          return;
        }
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static void a(ve param0, boolean param1, int param2, byte param3) {
        qd dupTemp$0 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        qd stackIn_36_0 = null;
        boolean stackIn_37_1 = false;
        qd stackIn_43_0 = null;
        boolean stackIn_44_1 = false;
        int stackIn_58_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_75_0 = 0;
        qd stackIn_92_0 = null;
        boolean stackIn_92_1 = false;
        boolean stackIn_93_2 = false;
        qd stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        boolean stackIn_98_1 = false;
        qd stackIn_101_0 = null;
        boolean stackIn_102_1 = false;
        qd stackIn_106_0 = null;
        boolean stackIn_107_1 = false;
        int stackIn_113_0 = 0;
        qd stackIn_128_0 = null;
        boolean stackIn_129_1 = false;
        qd stackIn_132_0 = null;
        boolean stackIn_133_1 = false;
        qd stackIn_136_0 = null;
        boolean stackIn_137_1 = false;
        qd stackIn_140_0 = null;
        boolean stackIn_141_1 = false;
        String stackIn_155_0 = null;
        qd stackIn_160_0 = null;
        boolean stackIn_161_1 = false;
        qd stackIn_163_0 = null;
        boolean stackIn_164_1 = false;
        int stackIn_170_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_230_0 = 0;
        qd stackIn_329_0 = null;
        boolean stackIn_329_1 = false;
        boolean stackIn_330_2 = false;
        qd stackIn_332_0 = null;
        int stackIn_332_1 = 0;
        int stackIn_332_2 = 0;
        int stackIn_332_3 = 0;
        boolean stackIn_335_1 = false;
        qd stackIn_339_0 = null;
        boolean stackIn_340_1 = false;
        qd stackIn_344_0 = null;
        boolean stackIn_345_1 = false;
        RuntimeException stackIn_353_0 = null;
        StringBuilder stackIn_353_1 = null;
        String stackIn_354_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        qd[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        qd var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        int var23 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        ve var27 = null;
        int var28 = 0;
        qd var29 = null;
        qd var30 = null;
        qd[] var31 = null;
        String var32 = null;
        String var33 = null;
        Object var25Lifetime1;
        String var25_refLifetime1;
        Object var25Lifetime1Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = client.field_A ? 1 : 0;
        try {
          if (param1) {
            stackIn_12_0 = (fj.field_h) ? 0 : 1;
            var4_int = stackIn_12_0;
          } else {
            if (ig.b(true)) {
              stackIn_8_0 = (!param0.field_lc) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
            var4_int = stackIn_8_0;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var5 = 0;
          if (param1) {
            decompiledFrameRemainder1 = !(2 > b.field_P.length);
            if (decompiledFrameRemainder1) {
              if (param1) {
                stackIn_22_0 = (rk.field_V != -1) ? 1 : 0;
              } else {
                stackIn_22_0 = 0;
              }
              var6 = stackIn_22_0;
              decompiledFrameRemainder0 = (var6 != 0);
              if (decompiledFrameRemainder0) {
                var7 = rk.field_V;
                for (var8_int = 0; kk.field_l.length > var8_int; var8_int++) {
                  kk.field_l[var8_int] = (byte) 0;
                }
              }
            }
          } else {
            for (var6 = 0; var6 < 5; var6++) {
              if (var4_int != 0 &&
                qa.field_v[0][var6 + 1].field_ob != 0 &&
                var6 != param0.field_Wb) {
                param0.field_Wb = var6;
                var5 = 1;
              }
              stackIn_36_0 = qa.field_v[0][1 + var6];
              stackIn_37_1 = (var4_int != 0);
              stackIn_36_0.field_Hb = stackIn_37_1;
              if (!pd.field_a &&
                3 == var6) {
                qa.field_v[0][var6 + 1].field_Hb = false;
              }
              stackIn_43_0 = qa.field_v[0][1 + var6];
              stackIn_44_1 = (param0.field_Wb == var6);
              stackIn_43_0.field_ab = stackIn_44_1;
            }
            if (qa.field_v[0][2].field_Kb) {
              if (!ig.b(true)) {
                sl.field_g = cm.$cfr$intArgs$a$53ce4ab4c593(82, bh.field_h, new String[]{cd.field_m.field_Vb});
              } else {
                sl.field_g = kf.field_J;
              }
            }
            decompiledFrameRemainder1 = !(2 > b.field_P.length);
            if (decompiledFrameRemainder1) {
              if (param1) {
                stackIn_58_0 = (rk.field_V != -1) ? 1 : 0;
              } else {
                stackIn_58_0 = 0;
              }
              var6 = stackIn_58_0;
              decompiledFrameRemainder0 = (var6 != 0);
              if (decompiledFrameRemainder0) {
                var7 = rk.field_V;
                for (var8_int = 0; kk.field_l.length > var8_int; var8_int++) {
                  kk.field_l[var8_int] = (byte) 0;
                }
              }
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            kk.field_l[var7 / 8] = (byte)de.b((int) kk.field_l[var7 / 8], 1 << var7 % 8);
          }
          if (decompiledFrameRemainder1) {
            stackIn_67_0 = (!param1) ? 0 : -1;
            for (var7 = stackIn_67_0; var7 < b.field_P.length; var7++) {
              if (var6 != 0) {
                stackIn_75_0 = (rk.field_V != var7) ? 1 : 0;
              } else {
                stackIn_75_0 = 0;
              }
              var8_intLifetime1 = stackIn_75_0;
              if (var4_int != 0 &&
                qa.field_v[1][var7 + 1].field_ob != 0) {
                if (param1) {
                  if (var6 == 0) {
                    if (var7 == -1) {
                      for (var9 = 0; var9 < kk.field_l.length; var9++) {
                        kk.field_l[var9] = (byte) 0;
                      }
                    } else {
                      kk.field_l[var7 / 8] = (byte)qm.b((int) kk.field_l[var7 / 8], 1 << lb.a(var7, 7));
                    }
                  }
                } else {
                  var9 = b.field_P[var7];
                  if (param0.field_mc != var9) {
                    var5 = 1;
                    param0.field_mc = var9;
                  }
                }
              }
              if (!param1) {
                var9 = b.field_P[var7];
                stackIn_101_0 = qa.field_v[1][1 + var7];
                stackIn_102_1 = (param0.field_mc == var9);
                stackIn_101_0.field_ab = stackIn_102_1;
              } else {
                if (var7 == -1) {
                  qa.field_v[1][1 + var7].field_ab = true;
                  for (var9 = 0; b.field_P.length > var9; var9++) {
                    dupTemp$0 = qa.field_v[1][var7 + 1];
                    stackIn_92_0 = dupTemp$0;
                    stackIn_92_1 = dupTemp$0.field_ab;
                    stackIn_93_2 = (0 == (kk.field_l[var9 / 8] & 1 << (7 & var9)));
                    stackIn_92_0.field_ab = stackIn_92_1 & stackIn_93_2;
                  }
                } else {
                  stackIn_95_0 = qa.field_v[1][1 + var7];
                  stackIn_95_1 = -1;
                  stackIn_95_2 = kk.field_l[var7 / 8] & 1 << (var7 & 7);
                  stackIn_95_3 = -1;
                  stackIn_98_1 = (stackIn_95_1 != (stackIn_95_2 ^ stackIn_95_3));
                  stackIn_95_0.field_ab = stackIn_98_1;
                }
              }
              stackIn_106_0 = qa.field_v[1][1 + var7];
              stackIn_107_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_106_0.field_Hb = stackIn_107_1;
            }
          }
          if (param3 >= -121) {
            var27 = (ve) null;
            mc.a((ve) null, false, -56, (byte) 50);
          }
          stackIn_113_0 = (!param1) ? 1 : 0;
          for (var6Lifetime1 = stackIn_113_0; var6Lifetime1 < 3; var6Lifetime1++) {
            var29 = qa.field_v[2][var6Lifetime1];
            if (var4_int != 0 &&
              var29.field_ob != 0) {
              if (!param1) {
                if (var6Lifetime1 != param0.field_qc) {
                  var5 = 1;
                  param0.field_qc = var6Lifetime1;
                }
              } else {
                if (var6Lifetime1 != 0) {
                  jb.field_c = jb.field_c ^ var6Lifetime1;
                } else {
                  jb.field_c = 0;
                }
              }
            }
            if (!param1) {
              stackIn_136_0 = var29;
              stackIn_137_1 = ((var6Lifetime1 & param0.field_qc) != 0);
              stackIn_136_0.field_ab = stackIn_137_1;
            } else {
              if (var6Lifetime1 == 0) {
                stackIn_132_0 = var29;
                stackIn_133_1 = (jb.field_c == 0);
                stackIn_132_0.field_ab = stackIn_133_1;
              } else {
                stackIn_128_0 = var29;
                stackIn_129_1 = (0 != (var6Lifetime1 & jb.field_c));
                stackIn_128_0.field_ab = stackIn_129_1;
              }
            }
            stackIn_140_0 = var29;
            stackIn_141_1 = (var4_int != 0);
            stackIn_140_0.field_Hb = stackIn_141_1;
          }
          if (param1 &&
            1 < mg.field_Vb) {
            for (var6Lifetime2 = 0; var6Lifetime2 < mg.field_Vb + 1; var6Lifetime2++) {
              var30 = qa.field_v[3][var6Lifetime2];
              if (var4_int != 0 &&
                var30.field_ob != 0) {
                qa.field_x = var6Lifetime2;
              }
              if (var30.field_Kb &&
                0 < var6Lifetime2) {
                if (null == jj.field_a) {
                  stackIn_155_0 = null;
                } else {
                  stackIn_155_0 = jj.field_a[-1 + var6Lifetime2];
                }
                var8 = stackIn_155_0;
                if (var8 != null) {
                  sl.field_g = var8;
                }
              }
              stackIn_160_0 = var30;
              stackIn_161_1 = (qa.field_x == var6Lifetime2);
              stackIn_160_0.field_ab = stackIn_161_1;
              stackIn_163_0 = var30;
              stackIn_164_1 = (var4_int != 0);
              stackIn_163_0.field_Hb = stackIn_164_1;
            }
          }
          var6Lifetime3 = 0;
          for (var7 = 0; j.field_b > var7; var7++) {
            var31 = qa.field_v[4 + var7];
            var8_array = var31;
            stackIn_170_0 = (!param1) ? 0 : -1;
            for (var9 = stackIn_170_0; var9 < -1 + var31.length; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                0 <= var9) {
                if (af.field_b != null &&
                  null != af.field_b[var7] &&
                  0 < (af.field_b[var7][var9] & ~uc.field_d)) {
                  var15 = wb.b((byte) -93, ~uc.field_d & af.field_b[var7][var9]);
                  var14 = 1;
                }
                if (null != cb.field_e &&
                  null != cb.field_e[var7] &&
                  0 >= eh.field_a &&
                  cb.field_e[var7][var9]) {
                  var10 = 1;
                }
                if (mg.field_Ob != null &&
                  mg.field_Ob[var7] != null) {
                  var16 = mg.field_Ob[var7][var9];
                  if (var16 > 0 &&
                    var16 > de.field_R) {
                    var12 = 1;
                  }
                  if (var16 != 0 &&
                    !uc.field_a &&
                    eh.field_a <= 0) {
                    var10 = 1;
                  }
                }
                if (null != ik.field_h &&
                  ik.field_h[var7] != null) {
                  var16Lifetime2 = ik.field_h[var7][var9];
                  if (0 != var16Lifetime2 &&
                    !uc.field_a &&
                    0 >= eh.field_a) {
                    var10 = 1;
                  }
                  if (var16Lifetime2 > 0 &&
                    var16Lifetime2 > rf.field_o) {
                    var11 = 1;
                  }
                }
                if (param1) {
                  if (null != eh.field_h) {
                    if (eh.field_h[var7] != null) {
                      stackIn_217_0 = (eh.field_h[var7][var9]) ? 1 : 0;
                    } else {
                      stackIn_217_0 = 0;
                    }
                  } else {
                    stackIn_217_0 = 0;
                  }
                } else {
                  stackIn_217_0 = 0;
                }
                var13 = stackIn_217_0;
              }
              if (te.field_p >= 2 &&
                bj.field_d[12]) {
                var13 = 0;
                var11 = 0;
                var12 = 0;
                var14 = 0;
                var10 = 0;
              }
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0 &&
                var14 == 0) {
                stackIn_230_0 = 0;
              } else {
                stackIn_230_0 = 1;
              }
              var16Lifetime1 = stackIn_230_0;
              ve.field_ac = true;
              if (var16Lifetime1 == 0 &&
                var9 >= 0 &&
                bc.field_D != null && (!param1 ||
                !fj.field_h)) {
                if (null == km.field_D) {
                  rd.field_c = new boolean[j.field_b];
                  km.field_D = new byte[j.field_b];
                }
                gd.field_b = false;
                ve.field_ac = false;
                for (var17_int = 0; var7 > var17_int; var17_int++) {
                  rd.field_c[var17_int] = false;
                }
                uc.a(-1, param1, -1, 0, var9, var7, param0, false);
                if (2 <= te.field_p &&
                  bj.field_d[12]) {
                  ve.field_ac = true;
                }
                if (!ve.field_ac) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[1 + var9];
              if (var4_int != 0 &&
                var17.field_ob != 0) {
                if (!param1) {
                  if (var16Lifetime1 == 0 &&
                    (byte)var9 != param0.field_kc[var7]) {
                    param0.field_kc[var7] = (byte)var9;
                    var5 = 1;
                  }
                } else {
                  if (var9 == -1) {
                    for (var18 = var6Lifetime3; var18 < var31.length + var6Lifetime3 - 1; var18++) {
                      v.field_a[var18 / 8] = (byte)lb.a((int) v.field_a[var18 / 8], ~(1 << lb.a(var18, 7)));
                    }
                  } else {
                    v.field_a[(var6Lifetime3 + var9) / 8] = (byte)qm.b((int) v.field_a[(var6Lifetime3 + var9) / 8], 1 << lb.a(var9 + var6Lifetime3, 7));
                  }
                }
              }
              if (param1 &&
                var16Lifetime1 != 0) {
                v.field_a[(var6Lifetime3 + var9) / 8] = (byte)lb.a((int) v.field_a[(var6Lifetime3 + var9) / 8], ~(1 << lb.a(var9 + var6Lifetime3, 7)));
              }
              if (var9 >= 0 &&
                var17.field_Kb) {
                if (gn.field_c != null) {
                  if (gn.field_c[var7] != null) {
                    var18_ref = gn.field_c[var7][var9];
                  } else {
                    var18_ref = null;
                  }
                } else {
                  var18_ref = null;
                }
                if (hb.field_Qb == null) {
                  var19 = null;
                } else {
                  if (null == hb.field_Qb[var7]) {
                    var19 = null;
                  } else {
                    var19 = hb.field_Qb[var7][var9];
                  }
                }
                var20 = null;
                if (var19 != null &&
                  !((String) (var19)).equals(var18_ref)) {
                  var20 = var19;
                }
                var21 = null;
                if (var13 != 0) {
                  var21 = gd.field_d;
                  var22 = var21;
                  var25 = var22;
                  var22 = var25;
                  var21 = var22;
                  var25 = var21;
                  var22 = var25;
                  var25 = var22;
                  var22 = var25;
                  var21 = var22;
                  var22 = var25;
                } else {
                  if (var10 != 0) {
                    var21 = pj.field_F;
                  } else {
                    if (var11 != 0) {
                      var22_int = -rf.field_o + ik.field_h[var7][var9];
                      if (var22_int != 1) {
                        var21 = cm.$cfr$intArgs$a$53ce4ab4c593(81, eb.field_g, new String[]{Integer.toString(var22_int)});
                      } else {
                        var21 = pl.field_f;
                      }
                    }
                    if (var12 != 0) {
                      var32 = cm.$cfr$intArgs$a$53ce4ab4c593(110, wl.field_q, new String[]{Integer.toString(de.field_R), Integer.toString(mg.field_Ob[var7][var9])});
                      var22 = var32;
                      var25 = var22;
                      var22 = var25;
                      var21 = var22;
                      var25_ref = var32;
                      var22 = var25_ref;
                      if (var21 != null) {
                        var21 = (String) (var21) + "<br>" + var32;
                      } else {
                        var21 = var32;
                      }
                    }
                    if (var14 != 0) {
                      var22 = ig.field_Sb;
                      if (0 < var15 &&
                        lc.field_e != null &&
                        var15 <= lc.field_e.length &&
                        lc.field_e[var15 - 1] != null) {
                        var22 = lc.field_e[var15 - 1][0];
                      }
                      if (var21 != null) {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                      } else {
                        var21 = var22;
                      }
                    }
                  }
                }
                if (var4_int != 0 &&
                  !ve.field_ac) {
                  var22 = null;
                  var23 = 0;
                  if (gd.field_b) {
                    var22 = "</col>" + hb.field_Pb + "<col=A00000>";
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var25Lifetime1Lifetime1 = var22;
                    var22 = var25Lifetime1Lifetime1;
                    var21 = var22;
                  }
                  for (var24 = 0; var7 > var24; var24++) {
                    if (rd.field_c[var24]) {
                      var25_refLifetime1 = "</col>" + pa.field_db[var24] + "<col=A00000>";
                      var22 = var25_refLifetime1;
                      var21 = var22;
                      var22 = var25_refLifetime1;
                      if (var22 != null) {
                        var22 = (String) (var22) + ", " + var25_refLifetime1;
                        var21 = var22;
                        var21 = var22;
                        var23 = 1;
                      } else {
                        var22 = var25_refLifetime1;
                      }
                    }
                  }
                  if (var23 == 0) {
                    var21 = cm.$cfr$intArgs$a$53ce4ab4c593(115, ai.field_T, new String[]{(String) (var22)});
                  } else {
                    var21 = tl.field_x + (String) (var22);
                  }
                }
                if (var21 != null) {
                  var21 = "<col=A00000>" + (String) (var21);
                  var33 = j.a("<br>", (String) (var21), "<br><col=A00000>", 0);
                  if (var20 != null) {
                    var20 = (String) (var20) + "<br>" + var33;
                  } else {
                    var20 = var33;
                  }
                }
                if (var20 != null) {
                  sl.field_g = (String) (var20);
                }
              }
              if (!param1) {
                stackIn_339_0 = var17;
                stackIn_340_1 = (ve.field_ac) && ((byte)var9 == param0.field_kc[var7]);
                stackIn_339_0.field_ab = stackIn_340_1;
              } else {
                if (var9 == -1) {
                  var17.field_ab = true;
                  var28 = var6Lifetime3;
                  var18Lifetime1 = var28;
                  while (var28 < -1 + (var31.length + var6Lifetime3)) {
                    stackIn_329_0 = var17;
                    stackIn_329_1 = var17.field_ab;
                    stackIn_330_2 = (0 == (v.field_a[var28 / 8] & 1 << (var28 & 7)));
                    stackIn_329_0.field_ab = stackIn_329_1 & stackIn_330_2;
                    var28++;
                  }
                } else {
                  stackIn_332_0 = var17;
                  stackIn_332_1 = -1;
                  stackIn_332_2 = v.field_a[(var9 + var6Lifetime3) / 8] & 1 << (var6Lifetime3 + var9 & 7);
                  stackIn_332_3 = -1;
                  stackIn_335_1 = (stackIn_332_1 != (stackIn_332_2 ^ stackIn_332_3));
                  stackIn_332_0.field_ab = stackIn_335_1;
                }
              }
              stackIn_344_0 = var17;
              stackIn_345_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_344_0.field_Hb = stackIn_345_1;
            }
            var6Lifetime3 = var6Lifetime3 + (255 & rb.field_k[var7]);
          }
          if (var5 != 0 &&
            !param1) {
            qa.a(param2, 1850462342);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_353_0 = var4;
          stackIn_353_1 = new StringBuilder().append("mc.C(");
          if (param0 == null) {
            stackIn_354_2 = "null";
          } else {
            stackIn_354_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_353_0), ((StringBuilder) (Object) stackIn_353_1).append(stackIn_354_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ve var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        try {
          var2_int = param0.charAt(0);
          var3 = 1;
          if (param1 >= -99) {
            var5 = (ve) null;
            mc.a((ve) null, false, -98, (byte) -9);
          }
          while (true) {
            if (param0.length() <= var3) {
              return true;
            }
            if (param0.charAt(var3) == var2_int) {
              var3++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("mc.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = new int[]{2053254, 7976409, 15906096, 11781092, 41672};
        field_f = 5;
        field_d = "Off";
        field_c = "Start Game";
    }
}
