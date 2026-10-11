/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    static boolean field_d;
    private String field_c;
    static int field_j;
    static int field_h;
    static p field_a;
    static long[] field_b;
    static long[][] field_e;
    static p field_f;
    static int field_i;
    static tn field_k;
    static int field_l;
    static String field_g;

    final static void a(int param0, boolean param1, int param2, he param3) {
        hk dupTemp$0 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        hk stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        hk stackIn_28_0 = null;
        boolean stackIn_29_1 = false;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_57_0 = 0;
        hk stackIn_71_0 = null;
        boolean stackIn_72_1 = false;
        hk stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        boolean stackIn_79_1 = false;
        hk stackIn_84_0 = null;
        boolean stackIn_84_1 = false;
        boolean stackIn_85_2 = false;
        hk stackIn_89_0 = null;
        boolean stackIn_90_1 = false;
        int stackIn_94_0 = 0;
        hk stackIn_107_0 = null;
        boolean stackIn_108_1 = false;
        hk stackIn_112_0 = null;
        boolean stackIn_113_1 = false;
        hk stackIn_116_0 = null;
        boolean stackIn_117_1 = false;
        hk stackIn_120_0 = null;
        boolean stackIn_121_1 = false;
        String stackIn_137_0 = null;
        hk stackIn_142_0 = null;
        boolean stackIn_143_1 = false;
        hk stackIn_145_0 = null;
        boolean stackIn_146_1 = false;
        int stackIn_152_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_208_0 = 0;
        hk stackIn_310_0 = null;
        boolean stackIn_310_1 = false;
        boolean stackIn_311_2 = false;
        hk stackIn_313_0 = null;
        int stackIn_313_1 = 0;
        byte stackIn_313_2 = 0;
        int stackIn_313_3 = 0;
        boolean stackIn_316_1 = false;
        hk stackIn_320_0 = null;
        boolean stackIn_321_1 = false;
        hk stackIn_325_0 = null;
        boolean stackIn_326_1 = false;
        RuntimeException stackIn_336_0 = null;
        StringBuilder stackIn_336_1 = null;
        String stackIn_337_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        hk[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        hk var17 = null;
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
        int var27 = 0;
        hk var28 = null;
        hk var29 = null;
        hk[] var30 = null;
        Object var31 = null;
        String var31_ref = null;
        String var32 = null;
        Object var25Lifetime1;
        Object var31Lifetime1;
        Object var25Lifetime2;
        Object var25Lifetime3;
        Object var25Lifetime1Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = Virogrid.field_F ? 1 : 0;
        try {
          if (!param1) {
            if (k.b(1000)) {
              stackIn_12_0 = (!param3.field_kc) ? 1 : 0;
            } else {
              stackIn_12_0 = 0;
            }
            var4_int = stackIn_12_0;
          } else {
            stackIn_5_0 = (ld.field_c) ? 0 : 1;
            var4_int = stackIn_5_0;
          }
          var5 = 0;
          if (!param1) {
            for (var6 = 0; var6 < 5; var6++) {
              if (var4_int != 0 &&
                0 != oe.field_b[0][var6 + 1].field_nb &&
                param3.field_fc != var6) {
                param3.field_fc = var6;
                var5 = 1;
              }
              stackIn_22_0 = oe.field_b[0][var6 + 1];
              stackIn_23_1 = (var4_int != 0);
              stackIn_22_0.field_Y = stackIn_23_1;
              if (!ql.field_d &&
                var6 == 3) {
                oe.field_b[0][1 + var6].field_Y = false;
              }
              stackIn_28_0 = oe.field_b[0][var6 + 1];
              stackIn_29_1 = (param3.field_fc == var6);
              stackIn_28_0.field_xb = stackIn_29_1;
            }
            if (oe.field_b[0][2].field_G) {
              if (!k.b(param2 + 2137401888)) {
                wc.field_g = oi.a(new String[]{wl.field_d.field_Qb}, rf.field_d, 2);
              } else {
                wc.field_g = pn.field_y;
              }
            }
          }
          if (vj.field_b.length >= 2) {
            if (param1) {
              stackIn_41_0 = (gl.field_f != -1) ? 1 : 0;
            } else {
              stackIn_41_0 = 0;
            }
            var6Lifetime1 = stackIn_41_0;
            if (var6Lifetime1 != 0) {
              var7 = gl.field_f;
              for (var8_int = 0; kn.field_E.length > var8_int; var8_int++) {
                kn.field_E[var8_int] = (byte) 0;
              }
              kn.field_E[var7 / 8] = (byte)oh.a((int) kn.field_E[var7 / 8], 1 << var7 % 8);
            }
            stackIn_49_0 = (param1) ? -1 : 0;
            for (var7 = stackIn_49_0; var7 < vj.field_b.length; var7++) {
              if (var6Lifetime1 != 0) {
                stackIn_57_0 = (gl.field_f != var7) ? 1 : 0;
              } else {
                stackIn_57_0 = 0;
              }
              var8_intLifetime1 = stackIn_57_0;
              if (var4_int != 0 &&
                oe.field_b[1][var7 + 1].field_nb != 0) {
                if (param1) {
                  if (var6Lifetime1 == 0) {
                    if (var7 == -1) {
                      for (var9 = 0; var9 < kn.field_E.length; var9++) {
                        kn.field_E[var9] = (byte) 0;
                      }
                    } else {
                      kn.field_E[var7 / 8] = (byte)jd.a((int) kn.field_E[var7 / 8], 1 << rb.a(7, var7));
                    }
                  }
                } else {
                  var9 = vj.field_b[var7];
                  if (param3.field_vc != var9) {
                    param3.field_vc = var9;
                    var5 = 1;
                  }
                }
              }
              if (param1) {
                if (var7 == -1) {
                  oe.field_b[1][1 + var7].field_xb = true;
                  for (var9 = 0; var9 < vj.field_b.length; var9++) {
                    dupTemp$0 = oe.field_b[1][var7 + 1];
                    stackIn_84_0 = dupTemp$0;
                    stackIn_84_1 = dupTemp$0.field_xb;
                    stackIn_85_2 = (0 == (kn.field_E[var9 / 8] & 1 << (7 & var9)));
                    stackIn_84_0.field_xb = stackIn_84_1 & stackIn_85_2;
                  }
                } else {
                  stackIn_76_0 = oe.field_b[1][var7 + 1];
                  stackIn_76_1 = -1;
                  stackIn_76_2 = ~(kn.field_E[var7 / 8] & 1 << (var7 & 7));
                  stackIn_79_1 = (stackIn_76_1 != stackIn_76_2);
                  stackIn_76_0.field_xb = stackIn_79_1;
                }
              } else {
                var9 = vj.field_b[var7];
                stackIn_71_0 = oe.field_b[1][1 + var7];
                stackIn_72_1 = (var9 == param3.field_vc);
                stackIn_71_0.field_xb = stackIn_72_1;
              }
              stackIn_89_0 = oe.field_b[1][var7 + 1];
              stackIn_90_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_89_0.field_Y = stackIn_90_1;
            }
          }
          stackIn_94_0 = (param1) ? 0 : 1;
          for (var6Lifetime2 = stackIn_94_0; var6Lifetime2 < 3; var6Lifetime2++) {
            var28 = oe.field_b[2][var6Lifetime2];
            if (var4_int != 0 &&
              var28.field_nb != 0) {
              if (!param1) {
                if (param3.field_lc != var6Lifetime2) {
                  param3.field_lc = var6Lifetime2;
                  var5 = 1;
                }
              } else {
                if (0 != var6Lifetime2) {
                  qc.field_c = qc.field_c ^ var6Lifetime2;
                } else {
                  qc.field_c = 0;
                }
              }
            }
            stackIn_107_0 = var28;
            stackIn_108_1 = (var4_int != 0);
            stackIn_107_0.field_Y = stackIn_108_1;
            if (!param1) {
              stackIn_120_0 = var28;
              stackIn_121_1 = ((var6Lifetime2 & param3.field_lc) != 0);
              stackIn_120_0.field_xb = stackIn_121_1;
            } else {
              if (var6Lifetime2 != 0) {
                stackIn_116_0 = var28;
                stackIn_117_1 = ((qc.field_c & var6Lifetime2) != 0);
                stackIn_116_0.field_xb = stackIn_117_1;
              } else {
                stackIn_112_0 = var28;
                stackIn_113_1 = (qc.field_c == 0);
                stackIn_112_0.field_xb = stackIn_113_1;
              }
            }
          }
          if (param1 &&
            qi.field_f > 1) {
            for (var6Lifetime3 = 0; 1 + qi.field_f > var6Lifetime3; var6Lifetime3++) {
              var29 = oe.field_b[3][var6Lifetime3];
              if (var4_int != 0 &&
                var29.field_nb != 0) {
                aa.field_e = var6Lifetime3;
              }
              if (var29.field_G &&
                var6Lifetime3 > 0) {
                if (null == ch.field_j) {
                  stackIn_137_0 = null;
                } else {
                  stackIn_137_0 = ch.field_j[var6Lifetime3 - 1];
                }
                var8 = stackIn_137_0;
                if (var8 != null) {
                  wc.field_g = var8;
                }
              }
              stackIn_142_0 = var29;
              stackIn_143_1 = (aa.field_e == var6Lifetime3);
              stackIn_142_0.field_xb = stackIn_143_1;
              stackIn_145_0 = var29;
              stackIn_146_1 = (var4_int != 0);
              stackIn_145_0.field_Y = stackIn_146_1;
            }
          }
          var6Lifetime4 = 0;
          for (var7 = 0; var7 < vb.field_h; var7++) {
            var30 = oe.field_b[var7 + 4];
            var8_array = var30;
            stackIn_152_0 = (param1) ? -1 : 0;
            for (var9 = stackIn_152_0; var9 < -1 + var30.length; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                var9 >= 0) {
                if (null != mb.field_db &&
                  mb.field_db[var7] != null &&
                  (mb.field_db[var7][var9] & ~nl.field_x) > 0) {
                  var14 = 1;
                  var15 = qe.b(-728240159, mb.field_db[var7][var9] & ~nl.field_x);
                }
                if (rf.field_i != null &&
                  rf.field_i[var7] != null &&
                  0 >= bn.field_d &&
                  rf.field_i[var7][var9]) {
                  var10 = 1;
                }
                if (null != gg.field_E &&
                  null != gg.field_E[var7]) {
                  var16 = gg.field_E[var7][var9];
                  if (var16 > 0 &&
                    var16 > sb.field_i) {
                    var12 = 1;
                  }
                  if (var16 != 0 &&
                    !gi.field_a &&
                    bn.field_d <= 0) {
                    var10 = 1;
                  }
                }
                if (wm.field_B != null &&
                  null != wm.field_B[var7]) {
                  var16Lifetime2 = wm.field_B[var7][var9];
                  if (var16Lifetime2 != 0 &&
                    !gi.field_a &&
                    bn.field_d <= 0) {
                    var10 = 1;
                  }
                  if (0 < var16Lifetime2 &&
                    var16Lifetime2 > nh.field_c) {
                    var11 = 1;
                  }
                }
                if (param1) {
                  if (ke.field_t != null) {
                    if (ke.field_t[var7] != null) {
                      stackIn_195_0 = (!ke.field_t[var7][var9]) ? 0 : 1;
                    } else {
                      stackIn_195_0 = 0;
                    }
                  } else {
                    stackIn_195_0 = 0;
                  }
                } else {
                  stackIn_195_0 = 0;
                }
                var13 = stackIn_195_0;
              }
              if (2 <= hd.field_d &&
                dc.field_Y[12]) {
                var11 = 0;
                var10 = 0;
                var13 = 0;
                var12 = 0;
                var14 = 0;
              }
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0) {
                if (var14 == 0) {
                  stackIn_208_0 = 0;
                } else {
                  stackIn_208_0 = 1;
                }
              } else {
                stackIn_208_0 = 1;
              }
              var16Lifetime1 = stackIn_208_0;
              ud.field_b = true;
              if (var16Lifetime1 == 0 &&
                0 <= var9 &&
                null != nb.field_q && (!param1 ||
                !ld.field_c)) {
                vi.field_l = false;
                ud.field_b = false;
                if (ub.field_D == null) {
                  ub.field_D = new byte[vb.field_h];
                  hk.field_Lb = new boolean[vb.field_h];
                }
                for (var17_int = 0; var7 > var17_int; var17_int++) {
                  hk.field_Lb[var17_int] = false;
                }
                kn.a(param1, var9, -1, var7, 0, 8, -1, param3);
                if (hd.field_d >= 2 &&
                  dc.field_Y[12]) {
                  ud.field_b = true;
                }
                if (!ud.field_b) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[1 + var9];
              if (var4_int != 0 &&
                var17.field_nb != 0) {
                if (param1) {
                  if (var9 == -1) {
                    for (var18 = var6Lifetime4; -1 + (var30.length + var6Lifetime4) > var18; var18++) {
                      pm.field_p[var18 / 8] = (byte)rb.a((int) pm.field_p[var18 / 8], ~(1 << rb.a(var18, 7)));
                    }
                  } else {
                    pm.field_p[(var9 + var6Lifetime4) / 8] = (byte)jd.a((int) pm.field_p[(var9 + var6Lifetime4) / 8], 1 << rb.a(var9 + var6Lifetime4, 7));
                  }
                } else {
                  if (var16Lifetime1 == 0 &&
                    (byte)var9 != param3.field_Pb[var7]) {
                    var5 = 1;
                    param3.field_Pb[var7] = (byte)var9;
                  }
                }
              }
              if (param1 &&
                var16Lifetime1 != 0) {
                pm.field_p[(var6Lifetime4 + var9) / 8] = (byte)rb.a((int) pm.field_p[(var6Lifetime4 + var9) / 8], ~(1 << rb.a(7, var6Lifetime4 + var9)));
              }
              if (0 <= var9 &&
                var17.field_G) {
                if (null == uf.field_d) {
                  var18_ref = null;
                } else {
                  if (uf.field_d[var7] != null) {
                    var18_ref = uf.field_d[var7][var9];
                  } else {
                    var18_ref = null;
                  }
                }
                if (th.field_p == null) {
                  var19 = null;
                } else {
                  if (th.field_p[var7] != null) {
                    var19 = th.field_p[var7][var9];
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
                  if (var10 != 0) {
                    var21 = ca.field_L;
                    var22 = var21;
                    var25 = var22;
                    var22 = var25;
                    var21 = var22;
                    var25Lifetime2 = var21;
                    var22 = var25Lifetime2;
                    var25Lifetime3 = var22;
                    var22 = var25Lifetime3;
                    var21 = var22;
                    var22 = var25Lifetime3;
                  } else {
                    if (var11 != 0) {
                      var22_int = -nh.field_c + wm.field_B[var7][var9];
                      if (var22_int != 1) {
                        var21 = oi.a(new String[]{Integer.toString(var22_int)}, rn.field_a, param2 ^ -2137400886);
                        var31 = var21;
                        var21 = var31;
                        var31Lifetime1 = var21;
                        var21 = var31Lifetime1;
                      } else {
                        var21 = ed.field_f;
                      }
                    }
                    if (var12 != 0) {
                      var31_ref = oi.a(new String[]{Integer.toString(sb.field_i), Integer.toString(gg.field_E[var7][var9])}, tn.field_j, param2 + 2137400890);
                      var21 = var31_ref;
                      var21 = var31_ref;
                      if (var21 != null) {
                        var21 = (String) (var21) + "<br>" + var31_ref;
                      } else {
                        var21 = var31_ref;
                      }
                    }
                    if (var14 != 0) {
                      var22 = el.field_a;
                      if (var15 > 0 &&
                        null != me.field_a &&
                        var15 <= me.field_a.length &&
                        null != me.field_a[var15 - 1]) {
                        var22 = me.field_a[var15 - 1][0];
                      }
                      if (var21 == null) {
                        var21 = var22;
                      } else {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                      }
                    }
                  }
                } else {
                  var21 = g.field_d;
                }
                if (var4_int != 0 &&
                  !ud.field_b) {
                  var22 = null;
                  var23 = 0;
                  if (vi.field_l) {
                    var22 = "</col>" + wg.field_d + "<col=A00000>";
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var25Lifetime1Lifetime1 = var22;
                    var22 = var25Lifetime1Lifetime1;
                    var21 = var22;
                  }
                  for (var24 = 0; var7 > var24; var24++) {
                    if (hk.field_Lb[var24]) {
                      var25_ref = "</col>" + bd.field_a[var24] + "<col=A00000>";
                      var22 = var25_ref;
                      var21 = var22;
                      var22 = var25_ref;
                      if (var22 != null) {
                        var23 = 1;
                        var22 = (String) (var22) + ", " + var25_ref;
                        var21 = var22;
                        var21 = var22;
                      } else {
                        var22 = var25_ref;
                      }
                    }
                  }
                  if (var23 == 0) {
                    var21 = oi.a(new String[]{(String) (var22)}, oh.field_b, 2);
                  } else {
                    var21 = ab.field_I + (String) (var22);
                  }
                }
                if (var21 != null) {
                  var21 = "<col=A00000>" + (String) (var21);
                  var32 = qd.a((String) (var21), (byte) -71, "<br><col=A00000>", "<br>");
                  if (var20 == null) {
                    var20 = var32;
                  } else {
                    var20 = (String) (var20) + "<br>" + var32;
                  }
                }
                if (var20 != null) {
                  wc.field_g = (String) (var20);
                }
              }
              if (!param1) {
                stackIn_320_0 = var17;
                stackIn_321_1 = (ud.field_b) && ((byte)var9 == param3.field_Pb[var7]);
                stackIn_320_0.field_xb = stackIn_321_1;
              } else {
                if (var9 == -1) {
                  var17.field_xb = true;
                  var27 = var6Lifetime4;
                  var18Lifetime1 = var27;
                  while (var6Lifetime4 + var30.length - 1 > var27) {
                    stackIn_310_0 = var17;
                    stackIn_310_1 = var17.field_xb;
                    stackIn_311_2 = ((pm.field_p[var27 / 8] & 1 << (var27 & 7)) == 0);
                    stackIn_310_0.field_xb = stackIn_310_1 & stackIn_311_2;
                    var27++;
                  }
                } else {
                  stackIn_313_0 = var17;
                  stackIn_313_1 = 0;
                  stackIn_313_2 = pm.field_p[(var6Lifetime4 + var9) / 8];
                  stackIn_313_3 = 1 << (var6Lifetime4 + var9 & 7);
                  stackIn_316_1 = (stackIn_313_1 != (stackIn_313_2 & stackIn_313_3));
                  stackIn_313_0.field_xb = stackIn_316_1;
                }
              }
              stackIn_325_0 = var17;
              stackIn_326_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_325_0.field_Y = stackIn_326_1;
            }
            var6Lifetime4 = var6Lifetime4 + (255 & lk.field_Pb[var7]);
          }
          if (param2 != -2137400888) {
            field_k = (tn) null;
          }
          if (var5 != 0 &&
            !param1) {
            sd.a(param2 + 2137400888, param0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_336_0 = var4;
          stackIn_336_1 = new StringBuilder().append("co.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_337_2 = "null";
          } else {
            stackIn_337_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_336_0), ((StringBuilder) (Object) stackIn_336_1).append(stackIn_337_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        field_b = null;
        field_k = null;
        field_g = null;
        field_e = (long[][]) null;
        int var1 = -27 / ((38 - param0) / 38);
    }

    final boolean a(byte param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 115) {
            field_l = 46;
          }
          stackIn_3_0 = this.field_c.equals(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("co.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(java.applet.Applet param0, byte param1) {
        try {
          sb.a("jagex-last-login-method", this.field_c, param0, 31536000L, (byte) -2);
          if (param1 <= 72) {
            field_i = -115;
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "co.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    co(String param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "co.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          var3 = ii.a((byte) 105, param0, param1);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (param2 > -69) {
            co.a(-91);
          }
          var4 = 0;
          while (true) {
            if (var4 >= param1.length()) {
              return null;
            }
            if (ad.a(param1.charAt(var4), 15232)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_12_0 = sf.field_K;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("co.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var2;
        var2 = Virogrid.field_F ? 1 : 0;
        if (kh.field_d <= 0) {
          if (hn.field_h > 0) {
            hn.field_h = hn.field_h - 1;
          } else {
            if (0 < th.field_z) {
              th.field_z = th.field_z - 1;
            }
          }
        } else {
          kh.field_d = kh.field_d - 1;
        }
        if (0 < kh.field_d) {
          je.f(param0 - 17491);
        }
        if (param0 < hn.field_h) {
          rf.a(hn.field_h, -4);
        }
        if (th.field_z > 0) {
          rf.a(th.field_z, -4);
        }
    }

    static {
        int var14 = 0;
        long stackIn_5_0 = 0L;
        int var0;
        int var1;
        long var2;
        long var4;
        long var6;
        long var8;
        long var10;
        long var12;
        int var15;
        field_h = 256;
        field_a = new p();
        field_e = new long[8][256];
        field_b = new long[11];
        var0 = 0;
        L0: while (var0 < 256) {
          var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
          if ((var0 & 1) == 0) {
            stackIn_5_0 = (long)(var1 >>> 8);
          } else {
            stackIn_5_0 = (long)(var1 & 255);
          }
          var2 = stackIn_5_0;
          var4 = var2 << 1;
          if (256L <= var4) {
            var4 = var4 ^ 285L;
          }
          var6 = var4 << 1;
          if (var6 >= 256L) {
            var6 = var6 ^ 285L;
          }
          var8 = var2 ^ var6;
          var10 = var6 << 1;
          if (256L <= var10) {
            var10 = var10 ^ 285L;
          }
          var12 = var10 ^ var2;
          field_e[0][var0] = mf.a(var12, mf.a(mf.a(var8 << 16, mf.a(var10 << 24, mf.a(var2 << 32, mf.a(mf.a(var2 << 48, var2 << 56), var6 << 40)))), var4 << 8));
          for (var14 = 1; var14 < 8; var14++) {
            field_e[var14][var0] = mf.a(field_e[var14 - 1][var0] >>> 8, field_e[-1 + var14][var0] << 56);
          }
          var0++;
        }
        field_b[0] = 0L;
        var15 = 1;
        var0 = var15;
        L1: while (var15 <= 10) {
          var1 = -8 + var15 * 8;
          field_b[var15] = uh.a(uh.a(uh.a(uh.a(uh.a(uh.a(lm.a(field_e[2][2 + var1], 280375465082880L), uh.a(lm.a(-72057594037927936L, field_e[0][var1]), lm.a(field_e[1][var1 + 1], 71776119061217280L))), lm.a(1095216660480L, field_e[3][var1 + 3])), lm.a(4278190080L, field_e[4][4 + var1])), lm.a(16711680L, field_e[5][var1 + 5])), lm.a(field_e[6][6 + var1], 65280L)), lm.a(field_e[7][7 + var1], 255L));
          var15++;
        }
        field_k = new tn(1);
    }
}
