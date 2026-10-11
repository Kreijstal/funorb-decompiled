/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    static int[] field_f;
    static String field_g;
    static String field_a;
    static int[] field_e;
    static String field_c;
    static int[] field_b;
    static String field_h;
    static int[] field_i;
    static String field_d;

    final static void a(boolean param0, int param1, na param2, int param3) {
        nl dupTemp$0 = null;
        nl dupTemp$1 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        nl stackIn_26_0 = null;
        boolean stackIn_27_1 = false;
        nl stackIn_33_0 = null;
        boolean stackIn_34_1 = false;
        int stackIn_47_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        nl stackIn_76_0 = null;
        boolean stackIn_76_1 = false;
        boolean stackIn_77_2 = false;
        nl stackIn_89_0 = null;
        boolean stackIn_89_1 = false;
        boolean stackIn_90_2 = false;
        nl stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        byte stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        boolean stackIn_96_1 = false;
        nl stackIn_99_0 = null;
        boolean stackIn_100_1 = false;
        nl stackIn_104_0 = null;
        boolean stackIn_105_1 = false;
        int stackIn_109_0 = 0;
        nl stackIn_124_0 = null;
        boolean stackIn_125_1 = false;
        nl stackIn_128_0 = null;
        boolean stackIn_129_1 = false;
        nl stackIn_132_0 = null;
        boolean stackIn_133_1 = false;
        nl stackIn_136_0 = null;
        boolean stackIn_137_1 = false;
        String stackIn_151_0 = null;
        nl stackIn_155_0 = null;
        boolean stackIn_156_1 = false;
        nl stackIn_158_0 = null;
        boolean stackIn_159_1 = false;
        int stackIn_165_0 = 0;
        int stackIn_211_0 = 0;
        int stackIn_223_0 = 0;
        nl stackIn_325_0 = null;
        boolean stackIn_326_1 = false;
        nl stackIn_330_0 = null;
        int stackIn_330_1 = 0;
        int stackIn_330_2 = 0;
        boolean stackIn_333_1 = false;
        nl stackIn_338_0 = null;
        boolean stackIn_338_1 = false;
        boolean stackIn_339_2 = false;
        nl stackIn_343_0 = null;
        boolean stackIn_344_1 = false;
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
        nl[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        nl var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
        int var23 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        nl var28 = null;
        nl var29 = null;
        nl[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        Object var25Lifetime1;
        String var25_refLifetime1;
        Object var25Lifetime2;
        Object var25Lifetime1Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var6Lifetime4;
        int var16Lifetime2;
        var26 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0) {
            stackIn_12_0 = (dn.field_Db) ? 0 : 1;
            var4_int = stackIn_12_0;
          } else {
            if (qk.k((byte) 106)) {
              stackIn_8_0 = (!param2.field_Lb) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
            var4_int = stackIn_8_0;
          }
          boolean decompiledFrameRemainder1 = true;
          var5 = 0;
          if (!param0) {
            for (var6 = 0; var6 < 5; var6++) {
              if (var4_int != 0 &&
                s.field_e[0][1 + var6].field_U != 0 &&
                var6 != param2.field_Pb) {
                var5 = 1;
                param2.field_Pb = var6;
              }
              stackIn_26_0 = s.field_e[0][var6 + 1];
              stackIn_27_1 = (var4_int != 0);
              stackIn_26_0.field_ub = stackIn_27_1;
              if (!fc.field_a &&
                var6 == 3) {
                s.field_e[0][1 + var6].field_ub = false;
              }
              stackIn_33_0 = s.field_e[0][var6 + 1];
              stackIn_34_1 = (var6 == param2.field_Pb);
              stackIn_33_0.field_ab = stackIn_34_1;
            }
            if (s.field_e[0][2].field_A) {
              if (!qk.k((byte) 111)) {
                kh.field_c = tj.a(param3 ^ -111, new String[]{wi.field_f.field_ic}, ed.field_tb);
              } else {
                kh.field_c = vh.field_m;
              }
            }
          } else {
            decompiledFrameRemainder1 = !(ao.field_h.length < 2);
          }
          if ((decompiledFrameRemainder1) &&
            (ao.field_h.length >= 2)) {
            if (param0) {
              stackIn_47_0 = (rl.field_o != -1) ? 1 : 0;
            } else {
              stackIn_47_0 = 0;
            }
            var6Lifetime4 = stackIn_47_0;
            if (var6Lifetime4 != 0) {
              var7 = rl.field_o;
              for (var8_int = 0; gh.field_E.length > var8_int; var8_int++) {
                gh.field_E[var8_int] = (byte) 0;
              }
              gh.field_E[var7 / 8] = (byte)fj.b((int) gh.field_E[var7 / 8], 1 << var7 % 8);
            }
            stackIn_55_0 = (!param0) ? 0 : -1;
            for (var7 = stackIn_55_0; var7 < ao.field_h.length; var7++) {
              if (var6Lifetime4 != 0) {
                stackIn_63_0 = (var7 != rl.field_o) ? 1 : 0;
              } else {
                stackIn_63_0 = 0;
              }
              L16: {
                L17: {
                  boolean decompiledFrameRemainder0 = true;
                  var8_intLifetime1 = stackIn_63_0;
                  if (var4_int != 0 &&
                    s.field_e[1][1 + var7].field_U != 0) {
                    if (param0) {
                      if (var6Lifetime4 != 0) {
                        if (!param0) {
                          break L17;
                        }
                        decompiledFrameRemainder0 = (var7 == -1);
                        if (decompiledFrameRemainder0) {
                          s.field_e[1][1 + var7].field_ab = true;
                          for (var9 = 0; var9 < ao.field_h.length; var9++) {
                            dupTemp$0 = s.field_e[1][var7 + 1];
                            stackIn_76_0 = dupTemp$0;
                            stackIn_76_1 = dupTemp$0.field_ab;
                            stackIn_77_2 = ((gh.field_E[var9 / 8] & 1 << (7 & var9)) == 0);
                            stackIn_76_0.field_ab = stackIn_76_1 & stackIn_77_2;
                          }
                          break L16;
                        }
                      }
                      if (decompiledFrameRemainder0) {
                        if (-1 == var7) {
                          for (var9 = 0; gh.field_E.length > var9; var9++) {
                            gh.field_E[var9] = (byte) 0;
                          }
                        } else {
                          gh.field_E[var7 / 8] = (byte)hh.a((int) gh.field_E[var7 / 8], 1 << dg.a(7, var7));
                        }
                      }
                    } else {
                      var9 = ao.field_h[var7];
                      if (var9 != param2.field_dc) {
                        var5 = 1;
                        param2.field_dc = var9;
                      }
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    if (!param0) {
                      break L17;
                    }
                    if (var7 == -1) {
                      s.field_e[1][1 + var7].field_ab = true;
                      for (var9 = 0; var9 < ao.field_h.length; var9++) {
                        dupTemp$1 = s.field_e[1][var7 + 1];
                        stackIn_89_0 = dupTemp$1;
                        stackIn_89_1 = dupTemp$1.field_ab;
                        stackIn_90_2 = ((gh.field_E[var9 / 8] & 1 << (7 & var9)) == 0);
                        stackIn_89_0.field_ab = stackIn_89_1 & stackIn_90_2;
                      }
                      break L16;
                    }
                  }
                  stackIn_93_0 = s.field_e[1][var7 + 1];
                  stackIn_93_1 = 0;
                  stackIn_93_2 = gh.field_E[var7 / 8];
                  stackIn_93_3 = 1 << (var7 & 7);
                  stackIn_96_1 = (stackIn_93_1 != (stackIn_93_2 & stackIn_93_3));
                  stackIn_93_0.field_ab = stackIn_96_1;
                  break L16;
                }
                var9 = ao.field_h[var7];
                stackIn_99_0 = s.field_e[1][1 + var7];
                stackIn_100_1 = (param2.field_dc == var9);
                stackIn_99_0.field_ab = stackIn_100_1;
              }
              stackIn_104_0 = s.field_e[1][var7 + 1];
              stackIn_105_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_104_0.field_ub = stackIn_105_1;
            }
          }
          stackIn_109_0 = (!param0) ? 1 : 0;
          for (var6Lifetime1 = stackIn_109_0; var6Lifetime1 < 3; var6Lifetime1++) {
            var28 = s.field_e[2][var6Lifetime1];
            if (var4_int != 0 &&
              0 != var28.field_U) {
              if (!param0) {
                if (param2.field_Fb != var6Lifetime1) {
                  param2.field_Fb = var6Lifetime1;
                  var5 = 1;
                }
              } else {
                if (0 == var6Lifetime1) {
                  q.field_N = 0;
                } else {
                  q.field_N = q.field_N ^ var6Lifetime1;
                }
              }
            }
            if (!param0) {
              stackIn_132_0 = var28;
              stackIn_133_1 = (0 != (var6Lifetime1 & param2.field_Fb));
              stackIn_132_0.field_ab = stackIn_133_1;
            } else {
              if (0 != var6Lifetime1) {
                stackIn_128_0 = var28;
                stackIn_129_1 = ((var6Lifetime1 & q.field_N) != 0);
                stackIn_128_0.field_ab = stackIn_129_1;
              } else {
                stackIn_124_0 = var28;
                stackIn_125_1 = (q.field_N == 0);
                stackIn_124_0.field_ab = stackIn_125_1;
              }
            }
            stackIn_136_0 = var28;
            stackIn_137_1 = (var4_int != 0);
            stackIn_136_0.field_ub = stackIn_137_1;
          }
          if (param0 &&
            le.field_q > 1) {
            for (var6Lifetime2 = 0; var6Lifetime2 < 1 + le.field_q; var6Lifetime2++) {
              var29 = s.field_e[3][var6Lifetime2];
              if (var4_int != 0 &&
                0 != var29.field_U) {
                q.field_L = var6Lifetime2;
              }
              if (var29.field_A &&
                var6Lifetime2 > 0) {
                if (rk.field_I == null) {
                  stackIn_151_0 = null;
                } else {
                  stackIn_151_0 = rk.field_I[var6Lifetime2 - 1];
                }
                var8 = stackIn_151_0;
                if (var8 != null) {
                  kh.field_c = var8;
                }
              }
              stackIn_155_0 = var29;
              stackIn_156_1 = (var6Lifetime2 == q.field_L);
              stackIn_155_0.field_ab = stackIn_156_1;
              stackIn_158_0 = var29;
              stackIn_159_1 = (var4_int != 0);
              stackIn_158_0.field_ub = stackIn_159_1;
            }
          }
          var6Lifetime3 = 0;
          for (var7 = param3; vf.field_l > var7; var7++) {
            var30 = s.field_e[4 + var7];
            var8_array = var30;
            stackIn_165_0 = (param0) ? -1 : 0;
            for (var9 = stackIn_165_0; var9 < var30.length - 1; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                var9 >= 0) {
                if (null != ue.field_b &&
                  ue.field_b[var7] != null &&
                  (~n.field_a & ue.field_b[var7][var9]) > 0) {
                  var15 = bj.a(ue.field_b[var7][var9] & ~n.field_a, (byte) 104);
                  var14 = 1;
                }
                if (dh.field_Hb != null &&
                  null != dh.field_Hb[var7] &&
                  ah.field_c <= 0 &&
                  dh.field_Hb[var7][var9]) {
                  var10 = 1;
                }
                if (null != pe.field_Fb &&
                  null != pe.field_Fb[var7]) {
                  var16 = pe.field_Fb[var7][var9];
                  if (0 < var16 &&
                    var16 > sk.field_e) {
                    var12 = 1;
                  }
                  if (var16 != 0 &&
                    !gm.field_c &&
                    ah.field_c <= 0) {
                    var10 = 1;
                  }
                }
                if (dk.field_a != null &&
                  dk.field_a[var7] != null) {
                  var16Lifetime2 = dk.field_a[var7][var9];
                  if (var16Lifetime2 != 0 &&
                    !gm.field_c &&
                    0 >= ah.field_c) {
                    var10 = 1;
                  }
                  if (0 < var16Lifetime2 &&
                    jh.field_e < var16Lifetime2) {
                    var11 = 1;
                  }
                }
                if (param0) {
                  if (null != rl.field_p) {
                    if (null != rl.field_p[var7]) {
                      stackIn_211_0 = (!rl.field_p[var7][var9]) ? 0 : 1;
                    } else {
                      stackIn_211_0 = 0;
                    }
                  } else {
                    stackIn_211_0 = 0;
                  }
                } else {
                  stackIn_211_0 = 0;
                }
                var13 = stackIn_211_0;
              }
              if (qf.field_d >= 2 &&
                ri.field_b[12]) {
                var14 = 0;
                var13 = 0;
                var11 = 0;
                var10 = 0;
                var12 = 0;
              }
              bg.field_a = true;
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0) {
                if (var14 == 0) {
                  stackIn_223_0 = 0;
                } else {
                  stackIn_223_0 = 1;
                }
              } else {
                stackIn_223_0 = 1;
              }
              var16Lifetime1 = stackIn_223_0;
              if (var16Lifetime1 == 0 &&
                var9 >= 0 &&
                null != um.field_a && (!param0 ||
                !dn.field_Db)) {
                if (qa.field_l == null) {
                  tk.field_q = new boolean[vf.field_l];
                  qa.field_l = new byte[vf.field_l];
                }
                bg.field_a = false;
                nb.field_d = false;
                for (var17_int = 0; var17_int < var7; var17_int++) {
                  tk.field_q[var17_int] = false;
                }
                jm.a(-1, (byte) -25, param0, param2, var9, var7, -1, 0);
                if (qf.field_d >= 2 &&
                  ri.field_b[12]) {
                  bg.field_a = true;
                }
                if (!bg.field_a) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[1 + var9];
              if (var4_int != 0 &&
                0 != var17.field_U) {
                if (!param0) {
                  if (var16Lifetime1 == 0 &&
                    (byte)var9 != param2.field_Wb[var7]) {
                    param2.field_Wb[var7] = (byte)var9;
                    var5 = 1;
                  }
                } else {
                  if (var9 == -1) {
                    for (var18 = var6Lifetime3; var18 < var30.length + (var6Lifetime3 - 1); var18++) {
                      ng.field_D[var18 / 8] = (byte)dg.a((int) ng.field_D[var18 / 8], ~(1 << dg.a(7, var18)));
                    }
                  } else {
                    ng.field_D[(var9 + var6Lifetime3) / 8] = (byte)hh.a((int) ng.field_D[(var9 + var6Lifetime3) / 8], 1 << dg.a(7, var6Lifetime3 + var9));
                  }
                }
              }
              if (param0 &&
                var16Lifetime1 != 0) {
                ng.field_D[(var6Lifetime3 + var9) / 8] = (byte)dg.a((int) ng.field_D[(var6Lifetime3 + var9) / 8], ~(1 << dg.a(var6Lifetime3 + var9, 7)));
              }
              if (0 <= var9 &&
                var17.field_A) {
                if (null == lj.field_o) {
                  var18_ref = null;
                } else {
                  if (lj.field_o[var7] != null) {
                    var18_ref = lj.field_o[var7][var9];
                  } else {
                    var18_ref = null;
                  }
                }
                if (null == qa.field_o) {
                  var19 = null;
                } else {
                  if (null != qa.field_o[var7]) {
                    var19 = qa.field_o[var7][var9];
                  } else {
                    var19 = null;
                  }
                }
                var20 = null;
                if (var19 != null &&
                  !((String) (var19)).equals(var18_ref)) {
                  var20 = var19;
                }
                var21 = null;
                if (var13 == 0) {
                  if (var10 == 0) {
                    if (var11 != 0) {
                      var22_int = -jh.field_e + dk.field_a[var7][var9];
                      if (var22_int == 1) {
                        var21 = ta.field_a;
                      } else {
                        var21 = tj.a(param3 + 114, new String[]{Integer.toString(var22_int)}, wa.field_Db);
                      }
                    }
                    if (var12 != 0) {
                      var31 = tj.a(123, new String[]{Integer.toString(sk.field_e), Integer.toString(pe.field_Fb[var7][var9])}, hf.field_m);
                      var22 = var31;
                      var25 = var22;
                      var22 = var25;
                      var21 = var22;
                      var25_ref = var31;
                      var22 = var25_ref;
                      if (var21 == null) {
                        var21 = var31;
                      } else {
                        var21 = (String) (var21) + "<br>" + var31;
                      }
                    }
                    if (var14 != 0) {
                      var22 = ji.field_a;
                      if (var15 > 0 &&
                        ma.field_P != null &&
                        ma.field_P.length >= var15 &&
                        ma.field_P[var15 - 1] != null) {
                        var22 = ma.field_P[var15 - 1][0];
                      }
                      if (var21 != null) {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                        var22 = var21;
                        var25Lifetime2 = var22;
                        var22 = var25Lifetime2;
                        var21 = var22;
                        var25Lifetime2 = var21;
                        var22 = var25Lifetime2;
                        var25Lifetime2 = var22;
                        var22 = var25Lifetime2;
                        var21 = var22;
                        var22 = var25Lifetime2;
                      } else {
                        var21 = var22;
                      }
                    }
                  } else {
                    var21 = ff.field_g;
                  }
                } else {
                  var21 = kl.field_D;
                }
                if (var4_int != 0 &&
                  !bg.field_a) {
                  var22 = null;
                  if (nb.field_d) {
                    var22 = "</col>" + w.field_Bb + "<col=A00000>";
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var25Lifetime1Lifetime1 = var22;
                    var22 = var25Lifetime1Lifetime1;
                    var21 = var22;
                  }
                  var23 = 0;
                  for (var24 = 0; var24 < var7; var24++) {
                    if (tk.field_q[var24]) {
                      var25_refLifetime1 = "</col>" + ob.field_bb[var24] + "<col=A00000>";
                      var22 = var25_refLifetime1;
                      var21 = var22;
                      var22 = var25_refLifetime1;
                      if (var22 != null) {
                        var23 = 1;
                        var22 = (String) (var22) + ", " + var25_refLifetime1;
                        var21 = var22;
                        var21 = var22;
                      } else {
                        var22 = var25_refLifetime1;
                      }
                    }
                  }
                  if (var23 == 0) {
                    var21 = tj.a(param3 + 125, new String[]{(String) (var22)}, gf.field_jb);
                  } else {
                    var21 = qk.field_qb + (String) (var22);
                  }
                }
                if (var21 != null) {
                  var32 = "<col=A00000>" + (String) (var21);
                  var33 = ui.a("<br><col=A00000>", "<br>", (byte) -38, var32);
                  if (var20 != null) {
                    var20 = (String) (var20) + "<br>" + var33;
                  } else {
                    var20 = var33;
                  }
                }
                if (var20 != null) {
                  kh.field_c = (String) (var20);
                }
              }
              if (param0) {
                if (var9 == -1) {
                  var17.field_ab = true;
                  var27 = var6Lifetime3;
                  var18Lifetime1 = var27;
                  while (var27 < -1 + (var6Lifetime3 + var30.length)) {
                    stackIn_338_0 = var17;
                    stackIn_338_1 = var17.field_ab;
                    stackIn_339_2 = (0 == (ng.field_D[var27 / 8] & 1 << (7 & var27)));
                    stackIn_338_0.field_ab = stackIn_338_1 & stackIn_339_2;
                    var27++;
                  }
                } else {
                  stackIn_330_0 = var17;
                  stackIn_330_1 = 0;
                  stackIn_330_2 = ng.field_D[(var9 + var6Lifetime3) / 8] & 1 << (var9 + var6Lifetime3 & 7);
                  stackIn_333_1 = (stackIn_330_1 != stackIn_330_2);
                  stackIn_330_0.field_ab = stackIn_333_1;
                }
              } else {
                stackIn_325_0 = var17;
                stackIn_326_1 = (bg.field_a) && ((byte)var9 == param2.field_Wb[var7]);
                stackIn_325_0.field_ab = stackIn_326_1;
              }
              stackIn_343_0 = var17;
              stackIn_344_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_343_0.field_ub = stackIn_344_1;
            }
            var6Lifetime3 = var6Lifetime3 + (in.field_Nb[var7] & 255);
          }
          if (var5 != 0) {
            if (param0) {
              return;
            }
            tc.b(12657, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_353_0 = var4;
          stackIn_353_1 = new StringBuilder().append("lm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_354_2 = "null";
          } else {
            stackIn_354_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_353_0), ((StringBuilder) (Object) stackIn_353_1).append(stackIn_354_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_a = null;
        if (param0 != -888) {
          return;
        }
        field_c = null;
        field_g = null;
        field_f = null;
        field_e = null;
        field_d = null;
        field_h = null;
        field_b = null;
    }

    final static void a(byte param0, boolean param1) {
        p.field_b.a(0, true, 0);
        if (param0 > -7) {
          field_c = (String) null;
        }
    }

    static {
        field_a = "Back";
        field_g = "Ignore";
        field_e = new int[17];
        field_h = "Lesson 5 of 7<br><br>Use of a close-range spell and basic movement in a safe and secure environment.<br><br>Use the Arcane Flash spell to destroy all three targets.<br><br><br>* Basic jumping *<br>* How to move *<br>* Advanced jumping *<br>* Close combat *";
        field_b = new int[8192];
        field_c = "Names should contain a maximum of 12 characters";
        field_d = "The gentle slopes of the Graveyard are covered with the remains of past Arcanists who have failed in this arena. Evil spirits haunt this place, sending bolts of pure chaos down onto anyone who disturbs them.";
    }
}
