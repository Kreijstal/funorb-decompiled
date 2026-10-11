/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static int[] field_b;
    static int[] field_g;
    static int[][] field_f;
    static int[] field_h;
    static int[] field_j;
    static int field_k;
    static int field_a;
    static a field_d;
    static String field_i;
    static String field_e;
    static boolean field_c;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_j = null;
        field_h = null;
        field_i = null;
        field_g = null;
        field_f = (int[][]) null;
        field_e = null;
        int var1 = 103 / ((48 - param0) / 57);
    }

    final static void a(int param0, el param1, int param2, boolean param3) {
        nh dupTemp$0 = null;
        nh dupTemp$1 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        nh stackIn_25_0 = null;
        boolean stackIn_26_1 = false;
        nh stackIn_32_0 = null;
        boolean stackIn_33_1 = false;
        int stackIn_46_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        nh stackIn_72_0 = null;
        boolean stackIn_73_1 = false;
        nh stackIn_79_0 = null;
        boolean stackIn_79_1 = false;
        boolean stackIn_80_2 = false;
        nh stackIn_89_0 = null;
        boolean stackIn_90_1 = false;
        nh stackIn_96_0 = null;
        boolean stackIn_96_1 = false;
        boolean stackIn_97_2 = false;
        nh stackIn_100_0 = null;
        byte stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        int stackIn_100_3 = 0;
        boolean stackIn_103_1 = false;
        nh stackIn_107_0 = null;
        boolean stackIn_108_1 = false;
        int stackIn_112_0 = 0;
        nh stackIn_126_0 = null;
        boolean stackIn_127_1 = false;
        nh stackIn_131_0 = null;
        boolean stackIn_132_1 = false;
        nh stackIn_135_0 = null;
        boolean stackIn_136_1 = false;
        nh stackIn_139_0 = null;
        boolean stackIn_140_1 = false;
        String stackIn_155_0 = null;
        nh stackIn_160_0 = null;
        boolean stackIn_161_1 = false;
        nh stackIn_163_0 = null;
        boolean stackIn_164_1 = false;
        int stackIn_170_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_228_0 = 0;
        nh stackIn_327_0 = null;
        boolean stackIn_327_1 = false;
        boolean stackIn_328_2 = false;
        nh stackIn_330_0 = null;
        byte stackIn_330_1 = 0;
        int stackIn_330_2 = 0;
        int stackIn_330_3 = 0;
        boolean stackIn_333_1 = false;
        nh stackIn_337_0 = null;
        boolean stackIn_338_1 = false;
        nh stackIn_342_0 = null;
        boolean stackIn_343_1 = false;
        RuntimeException stackIn_352_0 = null;
        StringBuilder stackIn_352_1 = null;
        String stackIn_353_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        nh[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        nh var17 = null;
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
        nh var28 = null;
        nh var29 = null;
        nh[] var30 = null;
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
        int var6Lifetime4;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = TetraLink.field_J;
        try {
          if (param3) {
            stackIn_12_0 = (kl.field_a) ? 0 : 1;
            var4_int = stackIn_12_0;
          } else {
            if (s.b(63)) {
              stackIn_8_0 = (!param1.field_Kb) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
            var4_int = stackIn_8_0;
          }
          var5 = 0;
          if (param2 != 30544) {
            field_h = (int[]) null;
          }
          if (!param3) {
            for (var6 = 0; var6 < 5; var6++) {
              if (var4_int != 0 &&
                cn.field_e[0][var6 + 1].field_F != 0 &&
                param1.field_ic != var6) {
                param1.field_ic = var6;
                var5 = 1;
              }
              stackIn_25_0 = cn.field_e[0][var6 + 1];
              stackIn_26_1 = (var4_int != 0);
              stackIn_25_0.field_S = stackIn_26_1;
              if (!kj.field_b &&
                var6 == 3) {
                cn.field_e[0][var6 + 1].field_S = false;
              }
              stackIn_32_0 = cn.field_e[0][var6 + 1];
              stackIn_33_1 = (var6 == param1.field_ic);
              stackIn_32_0.field_zb = stackIn_33_1;
            }
            if (cn.field_e[0][2].field_rb) {
              if (s.b(63)) {
                re.field_P = bk.field_f;
              } else {
                re.field_P = sk.a(new String[]{qb.field_N.field_ec}, of.field_e, param2 ^ 30509);
              }
            }
          }
          if (cl.field_f.length >= 2) {
            if (param3) {
              stackIn_46_0 = (ug.field_eb != -1) ? 1 : 0;
            } else {
              stackIn_46_0 = 0;
            }
            var6Lifetime1 = stackIn_46_0;
            if (var6Lifetime1 != 0) {
              var7 = ug.field_eb;
              for (var8_int = 0; km.field_o.length > var8_int; var8_int++) {
                km.field_o[var8_int] = (byte) 0;
              }
              km.field_o[var7 / 8] = (byte)mc.a((int) km.field_o[var7 / 8], 1 << var7 % 8);
            }
            stackIn_55_0 = (!param3) ? 0 : -1;
            for (var7 = stackIn_55_0; var7 < cl.field_f.length; var7++) {
              if (var6Lifetime1 != 0) {
                stackIn_63_0 = (var7 != ug.field_eb) ? 1 : 0;
              } else {
                stackIn_63_0 = 0;
              }
              L17: {
                boolean decompiledFrameRemainder0 = true;
                var8_intLifetime1 = stackIn_63_0;
                if (var4_int != 0 &&
                  cn.field_e[1][var7 + 1].field_F != 0) {
                  if (param3) {
                    if (var6Lifetime1 != 0) {
                      if (!param3) {
                        var9 = cl.field_f[var7];
                        stackIn_72_0 = cn.field_e[1][var7 + 1];
                        stackIn_73_1 = (param1.field_rc == var9);
                        stackIn_72_0.field_zb = stackIn_73_1;
                        break L17;
                      }
                      decompiledFrameRemainder0 = (var7 == -1);
                      if (decompiledFrameRemainder0) {
                        cn.field_e[1][var7 + 1].field_zb = true;
                        for (var9 = 0; cl.field_f.length > var9; var9++) {
                          dupTemp$0 = cn.field_e[1][var7 + 1];
                          stackIn_79_0 = dupTemp$0;
                          stackIn_79_1 = dupTemp$0.field_zb;
                          stackIn_80_2 = ((km.field_o[var9 / 8] & 1 << (7 & var9)) == 0);
                          stackIn_79_0.field_zb = stackIn_79_1 & stackIn_80_2;
                        }
                        break L17;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      if (var7 == -1) {
                        for (var9 = 0; km.field_o.length > var9; var9++) {
                          km.field_o[var9] = (byte) 0;
                        }
                      } else {
                        km.field_o[var7 / 8] = (byte)oj.a((int) km.field_o[var7 / 8], 1 << pl.a(var7, 7));
                      }
                    }
                  } else {
                    var9 = cl.field_f[var7];
                    if (var9 != param1.field_rc) {
                      param1.field_rc = var9;
                      var5 = 1;
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (!param3) {
                    var9 = cl.field_f[var7];
                    stackIn_89_0 = cn.field_e[1][var7 + 1];
                    stackIn_90_1 = (param1.field_rc == var9);
                    stackIn_89_0.field_zb = stackIn_90_1;
                    break L17;
                  }
                  if (var7 == -1) {
                    cn.field_e[1][var7 + 1].field_zb = true;
                    for (var9 = 0; cl.field_f.length > var9; var9++) {
                      dupTemp$1 = cn.field_e[1][var7 + 1];
                      stackIn_96_0 = dupTemp$1;
                      stackIn_96_1 = dupTemp$1.field_zb;
                      stackIn_97_2 = ((km.field_o[var9 / 8] & 1 << (7 & var9)) == 0);
                      stackIn_96_0.field_zb = stackIn_96_1 & stackIn_97_2;
                    }
                    break L17;
                  }
                }
                stackIn_100_0 = cn.field_e[1][var7 + 1];
                stackIn_100_1 = km.field_o[var7 / 8];
                stackIn_100_2 = 1;
                stackIn_100_3 = 7 & var7;
                stackIn_103_1 = ((stackIn_100_1 & stackIn_100_2 << stackIn_100_3) != 0);
                stackIn_100_0.field_zb = stackIn_103_1;
              }
              stackIn_107_0 = cn.field_e[1][var7 + 1];
              stackIn_108_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_107_0.field_S = stackIn_108_1;
            }
          }
          stackIn_112_0 = (!param3) ? 1 : 0;
          for (var6Lifetime2 = stackIn_112_0; var6Lifetime2 < 3; var6Lifetime2++) {
            var28 = cn.field_e[2][var6Lifetime2];
            if (var4_int != 0 &&
              0 != var28.field_F) {
              if (!param3) {
                if (var6Lifetime2 != param1.field_Zb) {
                  param1.field_Zb = var6Lifetime2;
                  var5 = 1;
                }
              } else {
                if (0 == var6Lifetime2) {
                  qa.field_A = 0;
                } else {
                  qa.field_A = qa.field_A ^ var6Lifetime2;
                }
              }
            }
            if (param3) {
              if (var6Lifetime2 == 0) {
                stackIn_135_0 = var28;
                stackIn_136_1 = (qa.field_A == 0);
                stackIn_135_0.field_zb = stackIn_136_1;
              } else {
                stackIn_131_0 = var28;
                stackIn_132_1 = (0 != (var6Lifetime2 & qa.field_A));
                stackIn_131_0.field_zb = stackIn_132_1;
              }
            } else {
              stackIn_126_0 = var28;
              stackIn_127_1 = ((param1.field_Zb & var6Lifetime2) != 0);
              stackIn_126_0.field_zb = stackIn_127_1;
            }
            stackIn_139_0 = var28;
            stackIn_140_1 = (var4_int != 0);
            stackIn_139_0.field_S = stackIn_140_1;
          }
          if (param3 &&
            1 < mk.field_e) {
            for (var6Lifetime3 = 0; var6Lifetime3 < 1 + mk.field_e; var6Lifetime3++) {
              var29 = cn.field_e[3][var6Lifetime3];
              if (var4_int != 0 &&
                0 != var29.field_F) {
                ni.field_c = var6Lifetime3;
              }
              if (var29.field_rb &&
                0 < var6Lifetime3) {
                if (q.field_a != null) {
                  stackIn_155_0 = q.field_a[-1 + var6Lifetime3];
                } else {
                  stackIn_155_0 = null;
                }
                var8 = stackIn_155_0;
                if (var8 != null) {
                  re.field_P = var8;
                }
              }
              stackIn_160_0 = var29;
              stackIn_161_1 = (var6Lifetime3 == ni.field_c);
              stackIn_160_0.field_zb = stackIn_161_1;
              stackIn_163_0 = var29;
              stackIn_164_1 = (var4_int != 0);
              stackIn_163_0.field_S = stackIn_164_1;
            }
          }
          var6Lifetime4 = 0;
          for (var7 = 0; field_k > var7; var7++) {
            var30 = cn.field_e[var7 + 4];
            var8_array = var30;
            stackIn_170_0 = (param3) ? -1 : 0;
            for (var9 = stackIn_170_0; var30.length - 1 > var9; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                var9 >= 0) {
                if (null != ti.field_f &&
                  null != ti.field_f[var7] &&
                  (~fd.field_H & ti.field_f[var7][var9]) > 0) {
                  var15 = fa.a(ti.field_f[var7][var9] & ~fd.field_H, param2 - 54882);
                  var14 = 1;
                }
                if (ba.field_S != null &&
                  ba.field_S[var7] != null &&
                  0 >= mb.field_C &&
                  ba.field_S[var7][var9]) {
                  var10 = 1;
                }
                if (null != a.field_g &&
                  null != a.field_g[var7]) {
                  var16 = a.field_g[var7][var9];
                  if (0 < var16 &&
                    var16 > aa.field_Pb) {
                    var12 = 1;
                  }
                  if (0 != var16 &&
                    !oa.field_r &&
                    mb.field_C <= 0) {
                    var10 = 1;
                  }
                }
                if (param3) {
                  if (ce.field_i != null) {
                    if (null != ce.field_i[var7]) {
                      stackIn_206_0 = (!ce.field_i[var7][var9]) ? 0 : 1;
                    } else {
                      stackIn_206_0 = 0;
                    }
                  } else {
                    stackIn_206_0 = 0;
                  }
                } else {
                  stackIn_206_0 = 0;
                }
                var13 = stackIn_206_0;
                if (bi.field_e != null &&
                  bi.field_e[var7] != null) {
                  var16Lifetime2 = bi.field_e[var7][var9];
                  if (var16Lifetime2 > 0 &&
                    mc.field_l < var16Lifetime2) {
                    var11 = 1;
                  }
                  if (var16Lifetime2 != 0 &&
                    !oa.field_r &&
                    mb.field_C <= 0) {
                    var10 = 1;
                  }
                }
              }
              if (dd.field_c >= 2 &&
                sn.field_a[12]) {
                var12 = 0;
                var13 = 0;
                var14 = 0;
                var11 = 0;
                var10 = 0;
              }
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0) {
                if (var14 == 0) {
                  stackIn_228_0 = 0;
                } else {
                  stackIn_228_0 = 1;
                }
              } else {
                stackIn_228_0 = 1;
              }
              var16Lifetime1 = stackIn_228_0;
              nn.field_R = true;
              if (var16Lifetime1 == 0 &&
                var9 >= 0 &&
                null != uj.field_s && (!param3 ||
                !kl.field_a)) {
                nn.field_R = false;
                n.field_P = false;
                if (eg.field_K == null) {
                  eg.field_K = new byte[field_k];
                  rh.field_G = new boolean[field_k];
                }
                for (var17_int = 0; var17_int < var7; var17_int++) {
                  rh.field_G[var17_int] = false;
                }
                lk.a(param3, (byte) -121, -1, param1, 0, -1, var7, var9);
                if (dd.field_c >= 2 &&
                  sn.field_a[12]) {
                  nn.field_R = true;
                }
                if (!nn.field_R) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[1 + var9];
              if (var4_int != 0 &&
                var17.field_F != 0) {
                if (!param3) {
                  if (var16Lifetime1 == 0 &&
                    (byte)var9 != param1.field_sc[var7]) {
                    var5 = 1;
                    param1.field_sc[var7] = (byte)var9;
                  }
                } else {
                  if (var9 == -1) {
                    for (var18 = var6Lifetime4; var18 < var6Lifetime4 + (var30.length - 1); var18++) {
                      lo.field_a[var18 / 8] = (byte)pl.a((int) lo.field_a[var18 / 8], ~(1 << pl.a(7, var18)));
                    }
                  } else {
                    lo.field_a[(var9 + var6Lifetime4) / 8] = (byte)oj.a((int) lo.field_a[(var9 + var6Lifetime4) / 8], 1 << pl.a(var6Lifetime4 + var9, 7));
                  }
                }
              }
              if (param3 &&
                var16Lifetime1 != 0) {
                lo.field_a[(var9 + var6Lifetime4) / 8] = (byte)pl.a((int) lo.field_a[(var9 + var6Lifetime4) / 8], ~(1 << pl.a(var6Lifetime4 + var9, 7)));
              }
              if (var9 >= 0 &&
                var17.field_rb) {
                if (lc.field_g != null) {
                  if (lc.field_g[var7] != null) {
                    var18_ref = lc.field_g[var7][var9];
                  } else {
                    var18_ref = null;
                  }
                } else {
                  var18_ref = null;
                }
                if (wl.field_c != null) {
                  if (wl.field_c[var7] != null) {
                    var19 = wl.field_c[var7][var9];
                  } else {
                    var19 = null;
                  }
                } else {
                  var19 = null;
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
                      var22_int = -mc.field_l + bi.field_e[var7][var9];
                      if (var22_int == 1) {
                        var21 = hc.field_r;
                      } else {
                        var21 = sk.a(new String[]{Integer.toString(var22_int)}, jd.field_b, param2 - 30420);
                      }
                    }
                    if (var12 != 0) {
                      var31 = sk.a(new String[]{Integer.toString(aa.field_Pb), Integer.toString(a.field_g[var7][var9])}, jg.field_b, 126);
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
                      var22 = qe.field_f;
                      if (var15 > 0 &&
                        pd.field_t != null &&
                        pd.field_t.length >= var15 &&
                        pd.field_t[-1 + var15] != null) {
                        var22 = pd.field_t[-1 + var15][0];
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
                    var21 = km.field_q;
                  }
                } else {
                  var21 = ba.field_M;
                }
                if (var4_int != 0 &&
                  !nn.field_R) {
                  var22 = null;
                  if (n.field_P) {
                    var22 = "</col>" + fi.field_zb + "<col=A00000>";
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var25Lifetime1Lifetime1 = var22;
                    var22 = var25Lifetime1Lifetime1;
                    var21 = var22;
                  }
                  var23 = 0;
                  for (var24 = 0; var7 > var24; var24++) {
                    if (rh.field_G[var24]) {
                      var25_refLifetime1 = "</col>" + ll.field_y[var24] + "<col=A00000>";
                      var22 = var25_refLifetime1;
                      var21 = var22;
                      var22 = var25_refLifetime1;
                      if (var22 == null) {
                        var22 = var25_refLifetime1;
                        var21 = var22;
                        var21 = var22;
                      } else {
                        var23 = 1;
                        var22 = (String) (var22) + ", " + var25_refLifetime1;
                      }
                    }
                  }
                  if (var23 != 0) {
                    var21 = kj.field_e + (String) (var22);
                  } else {
                    var21 = sk.a(new String[]{(String) (var22)}, cn.field_c, 121);
                  }
                }
                if (var21 != null) {
                  var32 = "<col=A00000>" + (String) (var21);
                  var33 = k.a("<br><col=A00000>", false, "<br>", var32);
                  if (var20 == null) {
                    var20 = var33;
                  } else {
                    var20 = (String) (var20) + "<br>" + var33;
                  }
                }
                if (var20 != null) {
                  re.field_P = (String) (var20);
                }
              }
              if (!param3) {
                stackIn_337_0 = var17;
                stackIn_338_1 = (nn.field_R) && ((byte)var9 == param1.field_sc[var7]);
                stackIn_337_0.field_zb = stackIn_338_1;
              } else {
                if (var9 == -1) {
                  var17.field_zb = true;
                  var27 = var6Lifetime4;
                  var18Lifetime1 = var27;
                  while (var27 < var30.length + (var6Lifetime4 - 1)) {
                    stackIn_327_0 = var17;
                    stackIn_327_1 = var17.field_zb;
                    stackIn_328_2 = ((lo.field_a[var27 / 8] & 1 << (7 & var27)) == 0);
                    stackIn_327_0.field_zb = stackIn_327_1 & stackIn_328_2;
                    var27++;
                  }
                } else {
                  stackIn_330_0 = var17;
                  stackIn_330_1 = lo.field_a[(var6Lifetime4 + var9) / 8];
                  stackIn_330_2 = 1;
                  stackIn_330_3 = 7 & var9 + var6Lifetime4;
                  stackIn_333_1 = ((stackIn_330_1 & stackIn_330_2 << stackIn_330_3) != 0);
                  stackIn_330_0.field_zb = stackIn_333_1;
                }
              }
              stackIn_342_0 = var17;
              stackIn_343_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_342_0.field_S = stackIn_343_1;
            }
            var6Lifetime4 = var6Lifetime4 + (nn.field_Y[var7] & 255);
          }
          if (var5 != 0) {
            if (param3) {
              return;
            }
            i.a(true, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_352_0 = var4;
          stackIn_352_1 = new StringBuilder().append("hg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_353_2 = "null";
          } else {
            stackIn_353_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_352_0), ((StringBuilder) (Object) stackIn_352_1).append(stackIn_353_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(oh param0, byte param1) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        kb var3 = null;
        kh[] var4 = null;
        kh var5 = null;
        int var6 = 0;
        var6 = TetraLink.field_J;
        try {
          bd.a(param0, 6);
          if (cf.a(0, (byte) 105) &&
            ui.a(100, 1692) != 0) {
            ra.c(0, 0, 200, 400, 0);
            fh.a(true);
            return;
          }
          var2_int = -112 % ((param1 - 57) / 45);
          ra.c(0, 0, 200, 400, 8421504);
          var3 = (kb) (tb.field_d.c(false));
          while (var3 != null) {
            if (var3.field_o == 0) {
              var4 = of.field_f;
            } else {
              if (var3.field_o == 1) {
                var4 = th.field_p;
              } else {
                var4 = qd.field_cb;
              }
            }
            var5 = var4[var3.field_r / 3];
            var5.field_p[1] = var3.field_s * 65793;
            if (!var3.field_n) {
              var5.b(-31, 200);
            } else {
              var5.a(-31, 200);
            }
            var3 = (kb) (tb.field_d.a((byte) -70));
          }
          fh.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("hg.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_g = new int[11];
        field_b = new int[11];
        field_j = new int[11];
        field_f = new int[11][];
        field_h = new int[11];
        ad.a(136, 0, 0, 32, 150, 490, new int[]{0, 1, 5, 23, 6, 4, 3, 13});
        ad.a(136, 0, 1, 32, 150, 490, new int[]{14, 15, 16, 17, 8});
        ad.a(112, 0, 2, 32, 150, 490, new int[]{2, 18, 14, 15, 5, 16, 17, 9});
        ad.a(108, 0, 3, 29, 150, 490, new int[]{2, 14, 15, 5, 16, 17, 10, 11, 12});
        ad.a(112, 0, 4, 32, 150, 490, new int[]{2, 14, 15, 5, 16, 17, 18, 12});
        ad.a(112, 0, 5, 32, 150, 490, new int[]{2, 14, 15, 5, 16, 17, 12});
        ad.a(328, 0, 6, 32, 150, 490, new int[]{22, 8});
        ad.a(330, 0, 7, 32, 150, 490, new int[]{19, 8});
        ad.a(328, 0, 8, 32, 150, 490, new int[]{22, 8});
        ad.a(300, 0, 9, 32, 150, 490, new int[]{7});
        ad.a(300, 0, 10, 32, 150, 490, new int[]{});
        field_c = true;
        field_i = "Names cannot contain consecutive spaces";
        field_d = new a();
    }
}
