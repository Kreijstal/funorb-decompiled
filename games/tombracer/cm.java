/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm implements bo {
    private int field_b;
    static qg[] field_a;

    public final void a(kh param0, byte param1) {
        try {
          this.field_b = param0.h(255);
          if (param1 != -19) {
            this.field_b = -24;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        this.field_b = param0;
        if (param1 != 0) {
          field_a = (qg[]) null;
        }
    }

    public final void a(int param0, kh param1) {
        if (param0 != 200) {
          return;
        }
        try {
          param1.i(this.field_b, 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cm.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = TombRacer.field_G ? 1 : 0;
        if (param7 <= 49) {
          field_a = (qg[]) null;
        }
        if (param0 <= param12) {
          if (param14 <= param12) {
            if (param0 >= param14) {
              ica.a(param0, param10, param3, param5, 0, param8, bea.field_l, param1, param4, param11, param2, param15, param13, param9, param6, param12, param14);
            } else {
              ica.a(param14, param3, param10, param1, 0, param8, bea.field_l, param5, param6, param11, param2, param15, param9, param13, param4, param12, param0);
            }
          } else {
            ica.a(param12, param3, param2, param11, 0, param6, bea.field_l, param5, param8, param1, param10, param9, param15, param13, param4, param14, param0);
          }
        } else {
          if (param14 > param0) {
            ica.a(param0, param2, param3, param5, 0, param6, bea.field_l, param11, param4, param1, param10, param9, param13, param15, param8, param14, param12);
          } else {
            if (param12 < param14) {
              ica.a(param14, param2, param10, param1, 0, param4, bea.field_l, param11, param6, param5, param3, param13, param9, param15, param8, param0, param12);
            } else {
              ica.a(param12, param10, param2, param11, 0, param4, bea.field_l, param1, param8, param5, param3, param13, param15, param9, param6, param0, param14);
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
          field_a = (qg[]) null;
        }
    }

    final static void a(int param0, ht param1, int param2, boolean param3) {
        tv dupTemp$0 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        tv stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        tv stackIn_29_0 = null;
        boolean stackIn_30_1 = false;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_58_0 = 0;
        tv stackIn_74_0 = null;
        boolean stackIn_75_1 = false;
        tv stackIn_81_0 = null;
        boolean stackIn_81_1 = false;
        boolean stackIn_82_2 = false;
        tv stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        byte stackIn_84_2 = 0;
        int stackIn_84_3 = 0;
        boolean stackIn_87_1 = false;
        tv stackIn_91_0 = null;
        boolean stackIn_92_1 = false;
        int stackIn_96_0 = 0;
        tv stackIn_110_0 = null;
        boolean stackIn_111_1 = false;
        tv stackIn_115_0 = null;
        boolean stackIn_116_1 = false;
        tv stackIn_119_0 = null;
        boolean stackIn_120_1 = false;
        tv stackIn_123_0 = null;
        boolean stackIn_124_1 = false;
        String stackIn_139_0 = null;
        tv stackIn_143_0 = null;
        boolean stackIn_144_1 = false;
        tv stackIn_146_0 = null;
        boolean stackIn_147_1 = false;
        int stackIn_155_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_218_0 = 0;
        tv stackIn_318_0 = null;
        int stackIn_318_1 = 0;
        int stackIn_318_2 = 0;
        boolean stackIn_321_1 = false;
        tv stackIn_326_0 = null;
        boolean stackIn_326_1 = false;
        boolean stackIn_327_2 = false;
        tv stackIn_331_0 = null;
        boolean stackIn_332_1 = false;
        tv stackIn_336_0 = null;
        boolean stackIn_337_1 = false;
        RuntimeException stackIn_346_0 = null;
        StringBuilder stackIn_346_1 = null;
        String stackIn_347_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        tv[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        tv var17 = null;
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
        tv var28 = null;
        tv var29 = null;
        tv[] var30 = null;
        String var31 = null;
        String var32 = null;
        Object var25Lifetime1;
        String var25_refLifetime1;
        Object var25Lifetime1Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          if (param3) {
            stackIn_12_0 = (qa.field_o) ? 0 : 1;
            var4_int = stackIn_12_0;
          } else {
            if (mka.b(8192)) {
              stackIn_8_0 = (!param1.field_ec) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
            var4_int = stackIn_8_0;
          }
          var5 = 0;
          if (!param3) {
            for (var6 = 0; var6 < 5; var6++) {
              if (var4_int != 0 &&
                bf.field_b[0][1 + var6].field_y != 0 &&
                var6 != param1.field_cc) {
                param1.field_cc = var6;
                var5 = 1;
              }
              stackIn_23_0 = bf.field_b[0][var6 + 1];
              stackIn_24_1 = (var4_int != 0);
              stackIn_23_0.field_X = stackIn_24_1;
              if (!rca.field_p &&
                var6 == 3) {
                bf.field_b[0][1 + var6].field_X = false;
              }
              stackIn_29_0 = bf.field_b[0][1 + var6];
              stackIn_30_1 = (param1.field_cc == var6);
              stackIn_29_0.field_cb = stackIn_30_1;
            }
            if (bf.field_b[0][2].field_pb) {
              if (mka.b(8192)) {
                qda.field_b = jsa.field_y;
              } else {
                qda.field_b = gl.$cfr$intArgs$a$53ce4ab4c593(101, gfa.field_i, new String[]{uu.field_a.field_tb});
              }
            }
          }
          if (sg.field_u.length >= 2) {
            if (param3) {
              stackIn_42_0 = (kca.field_g != -1) ? 1 : 0;
            } else {
              stackIn_42_0 = 0;
            }
            var6Lifetime1 = stackIn_42_0;
            if (var6Lifetime1 != 0) {
              var7 = kca.field_g;
              for (var8_int = 0; vk.field_b.length > var8_int; var8_int++) {
                vk.field_b[var8_int] = (byte) 0;
              }
              vk.field_b[var7 / 8] = (byte)fh.a((int) vk.field_b[var7 / 8], 1 << var7 % 8);
            }
            stackIn_50_0 = (!param3) ? 0 : -1;
            for (var7 = stackIn_50_0; sg.field_u.length > var7; var7++) {
              if (var6Lifetime1 != 0) {
                stackIn_58_0 = (var7 != kca.field_g) ? 1 : 0;
              } else {
                stackIn_58_0 = 0;
              }
              var8_intLifetime1 = stackIn_58_0;
              if (var4_int != 0 &&
                0 != bf.field_b[1][1 + var7].field_y) {
                if (!param3) {
                  var9 = sg.field_u[var7];
                  if (param1.field_Jb != var9) {
                    var5 = 1;
                    param1.field_Jb = var9;
                  }
                } else {
                  if (var6Lifetime1 == 0) {
                    if (var7 == -1) {
                      for (var9 = 0; var9 < vk.field_b.length; var9++) {
                        vk.field_b[var9] = (byte) 0;
                      }
                    } else {
                      vk.field_b[var7 / 8] = (byte)kha.b((int) vk.field_b[var7 / 8], 1 << sea.c(var7, 7));
                    }
                  }
                }
              }
              if (param3) {
                if (var7 == -1) {
                  bf.field_b[1][var7 + 1].field_cb = true;
                  for (var9 = 0; var9 < sg.field_u.length; var9++) {
                    dupTemp$0 = bf.field_b[1][1 + var7];
                    stackIn_81_0 = dupTemp$0;
                    stackIn_81_1 = dupTemp$0.field_cb;
                    stackIn_82_2 = (0 == (vk.field_b[var9 / 8] & 1 << (7 & var9)));
                    stackIn_81_0.field_cb = stackIn_81_1 & stackIn_82_2;
                  }
                } else {
                  stackIn_84_0 = bf.field_b[1][1 + var7];
                  stackIn_84_1 = 0;
                  stackIn_84_2 = vk.field_b[var7 / 8];
                  stackIn_84_3 = 1 << (var7 & 7);
                  stackIn_87_1 = (stackIn_84_1 != (stackIn_84_2 & stackIn_84_3));
                  stackIn_84_0.field_cb = stackIn_87_1;
                }
              } else {
                var9 = sg.field_u[var7];
                stackIn_74_0 = bf.field_b[1][var7 + 1];
                stackIn_75_1 = (param1.field_Jb == var9);
                stackIn_74_0.field_cb = stackIn_75_1;
              }
              stackIn_91_0 = bf.field_b[1][1 + var7];
              stackIn_92_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_91_0.field_X = stackIn_92_1;
            }
          }
          stackIn_96_0 = (param3) ? 0 : 1;
          for (var6Lifetime2 = stackIn_96_0; var6Lifetime2 < 3; var6Lifetime2++) {
            var28 = bf.field_b[2][var6Lifetime2];
            if (var4_int != 0 &&
              var28.field_y != 0) {
              if (!param3) {
                if (param1.field_yb != var6Lifetime2) {
                  var5 = 1;
                  param1.field_yb = var6Lifetime2;
                }
              } else {
                if (var6Lifetime2 != 0) {
                  mua.field_b = mua.field_b ^ var6Lifetime2;
                } else {
                  mua.field_b = 0;
                }
              }
            }
            stackIn_110_0 = var28;
            stackIn_111_1 = (var4_int != 0);
            stackIn_110_0.field_X = stackIn_111_1;
            if (!param3) {
              stackIn_123_0 = var28;
              stackIn_124_1 = ((var6Lifetime2 & param1.field_yb) != 0);
              stackIn_123_0.field_cb = stackIn_124_1;
            } else {
              if (var6Lifetime2 == 0) {
                stackIn_119_0 = var28;
                stackIn_120_1 = (mua.field_b == 0);
                stackIn_119_0.field_cb = stackIn_120_1;
              } else {
                stackIn_115_0 = var28;
                stackIn_116_1 = ((mua.field_b & var6Lifetime2) != 0);
                stackIn_115_0.field_cb = stackIn_116_1;
              }
            }
          }
          if (param3 &&
            ws.field_r > 1) {
            for (var6Lifetime3 = 0; var6Lifetime3 < 1 + ws.field_r; var6Lifetime3++) {
              var29 = bf.field_b[3][var6Lifetime3];
              if (var4_int != 0 &&
                var29.field_y != 0) {
                aja.field_H = var6Lifetime3;
              }
              if (var29.field_pb &&
                var6Lifetime3 > 0) {
                if (null == mh.field_L) {
                  stackIn_139_0 = null;
                } else {
                  stackIn_139_0 = mh.field_L[-1 + var6Lifetime3];
                }
                var8 = stackIn_139_0;
                if (var8 != null) {
                  qda.field_b = var8;
                }
              }
              stackIn_143_0 = var29;
              stackIn_144_1 = (var4_int != 0);
              stackIn_143_0.field_X = stackIn_144_1;
              stackIn_146_0 = var29;
              stackIn_147_1 = (aja.field_H == var6Lifetime3);
              stackIn_146_0.field_cb = stackIn_147_1;
            }
          }
          var6Lifetime4 = 0;
          if (param2 != -21290) {
            field_a = (qg[]) null;
          }
          for (var7 = 0; var7 < fk.field_b; var7++) {
            var30 = bf.field_b[var7 + 4];
            var8_array = var30;
            stackIn_155_0 = (!param3) ? 0 : -1;
            for (var9 = stackIn_155_0; var9 < var30.length - 1; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                0 <= var9) {
                if (lga.field_z != null &&
                  lga.field_z[var7] != null &&
                  0 < (~mi.field_g & lga.field_z[var7][var9])) {
                  var15 = b.a(~mi.field_g & lga.field_z[var7][var9], (byte) -115);
                  var14 = 1;
                }
                if (rl.field_u != null &&
                  rl.field_u[var7] != null &&
                  wla.field_ub <= 0 &&
                  rl.field_u[var7][var9]) {
                  var10 = 1;
                }
                if (null != hp.field_a &&
                  hp.field_a[var7] != null) {
                  var16 = hp.field_a[var7][var9];
                  if (0 != var16 &&
                    !dea.field_c &&
                    wla.field_ub <= 0) {
                    var10 = 1;
                  }
                  if (var16 > 0 &&
                    qb.field_f < var16) {
                    var12 = 1;
                  }
                }
                if (null != nra.field_g &&
                  nra.field_g[var7] != null) {
                  var16Lifetime2 = nra.field_g[var7][var9];
                  if (var16Lifetime2 != 0 &&
                    !dea.field_c &&
                    0 >= wla.field_ub) {
                    var10 = 1;
                  }
                  if (var16Lifetime2 > 0 &&
                    bha.field_z < var16Lifetime2) {
                    var11 = 1;
                  }
                }
                if (param3) {
                  if (pfa.field_b != null) {
                    if (pfa.field_b[var7] != null) {
                      stackIn_205_0 = (!pfa.field_b[var7][var9]) ? 0 : 1;
                    } else {
                      stackIn_205_0 = 0;
                    }
                  } else {
                    stackIn_205_0 = 0;
                  }
                } else {
                  stackIn_205_0 = 0;
                }
                var13 = stackIn_205_0;
              }
              if (ld.field_e >= 2 &&
                oj.field_tb[12]) {
                var14 = 0;
                var13 = 0;
                var11 = 0;
                var12 = 0;
                var10 = 0;
              }
              rh.field_s = true;
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0) {
                if (var14 == 0) {
                  stackIn_218_0 = 0;
                } else {
                  stackIn_218_0 = 1;
                }
              } else {
                stackIn_218_0 = 1;
              }
              var16Lifetime1 = stackIn_218_0;
              if (var16Lifetime1 == 0 &&
                var9 >= 0 &&
                ce.field_A != null && (!param3 ||
                !qa.field_o)) {
                mm.field_g = false;
                if (null == tba.field_m) {
                  tba.field_m = new byte[fk.field_b];
                  sda.field_f = new boolean[fk.field_b];
                }
                rh.field_s = false;
                for (var17_int = 0; var17_int < var7; var17_int++) {
                  sda.field_f[var17_int] = false;
                }
                cja.a(125, var7, param1, 0, var9, -1, -1, param3);
                if (ld.field_e >= 2 &&
                  oj.field_tb[12]) {
                  rh.field_s = true;
                }
                if (!rh.field_s) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[var9 + 1];
              if (var4_int != 0 &&
                0 != var17.field_y) {
                if (!param3) {
                  if (var16Lifetime1 == 0 &&
                    (byte)var9 != param1.field_ac[var7]) {
                    param1.field_ac[var7] = (byte)var9;
                    var5 = 1;
                  }
                } else {
                  if (var9 == -1) {
                    for (var18 = var6Lifetime4; var18 < -1 + var6Lifetime4 + var30.length; var18++) {
                      tqa.field_e[var18 / 8] = (byte)sea.c((int) tqa.field_e[var18 / 8], ~(1 << sea.c(var18, 7)));
                    }
                  } else {
                    tqa.field_e[(var6Lifetime4 + var9) / 8] = (byte)kha.b((int) tqa.field_e[(var6Lifetime4 + var9) / 8], 1 << sea.c(7, var9 + var6Lifetime4));
                  }
                }
              }
              if (param3 &&
                var16Lifetime1 != 0) {
                tqa.field_e[(var9 + var6Lifetime4) / 8] = (byte)sea.c((int) tqa.field_e[(var9 + var6Lifetime4) / 8], ~(1 << sea.c(7, var6Lifetime4 + var9)));
              }
              if (var9 >= 0 &&
                var17.field_pb) {
                if (null == no.field_o) {
                  var18_ref = null;
                } else {
                  if (null == no.field_o[var7]) {
                    var18_ref = null;
                  } else {
                    var18_ref = no.field_o[var7][var9];
                  }
                }
                if (null == eca.field_b) {
                  var19 = null;
                } else {
                  if (null == eca.field_b[var7]) {
                    var19 = null;
                  } else {
                    var19 = eca.field_b[var7][var9];
                  }
                }
                var20 = null;
                if (var19 != null &&
                  !((String) (var19)).equals(var18_ref)) {
                  var20 = var19;
                }
                var21 = null;
                if (var13 != 0) {
                  var21 = tp.field_L;
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
                    var21 = ai.field_b;
                  } else {
                    if (var11 != 0) {
                      var22_int = nra.field_g[var7][var9] - bha.field_z;
                      if (var22_int == 1) {
                        var21 = rm.field_b;
                      } else {
                        var21 = gl.$cfr$intArgs$a$53ce4ab4c593(112, vn.field_c, new String[]{Integer.toString(var22_int)});
                      }
                    }
                    if (var12 != 0) {
                      var31 = gl.$cfr$intArgs$a$53ce4ab4c593(106, kp.field_f, new String[]{Integer.toString(qb.field_f), Integer.toString(hp.field_a[var7][var9])});
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
                      var22 = ova.field_j;
                      if (var15 > 0 &&
                        null != kh.field_l &&
                        var15 <= kh.field_l.length &&
                        null != kh.field_l[var15 - 1]) {
                        var22 = kh.field_l[var15 - 1][0];
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
                  !rh.field_s) {
                  var22 = null;
                  var23 = 0;
                  if (mm.field_g) {
                    var22 = "</col>" + mi.field_j + "<col=A00000>";
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var25Lifetime1Lifetime1 = var22;
                    var22 = var25Lifetime1Lifetime1;
                    var21 = var22;
                  }
                  for (var24 = 0; var7 > var24; var24++) {
                    if (sda.field_f[var24]) {
                      var25_refLifetime1 = "</col>" + kma.field_e[var24] + "<col=A00000>";
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
                  if (var23 != 0) {
                    var21 = sta.field_G + (String) (var22);
                  } else {
                    var21 = gl.$cfr$intArgs$a$53ce4ab4c593(106, cna.field_d, new String[]{(String) (var22)});
                  }
                }
                if (var21 != null) {
                  var21 = "<col=A00000>" + (String) (var21);
                  var32 = fta.a((String) (var21), "<br>", 0, "<br><col=A00000>");
                  if (var20 == null) {
                    var20 = var32;
                  } else {
                    var20 = (String) (var20) + "<br>" + var32;
                  }
                }
                if (var20 != null) {
                  qda.field_b = (String) (var20);
                }
              }
              if (!param3) {
                stackIn_331_0 = var17;
                stackIn_332_1 = (rh.field_s) && ((byte)var9 == param1.field_ac[var7]);
                stackIn_331_0.field_cb = stackIn_332_1;
              } else {
                if (var9 == -1) {
                  var17.field_cb = true;
                  var27 = var6Lifetime4;
                  var18Lifetime1 = var27;
                  while (var27 < var30.length + (var6Lifetime4 - 1)) {
                    stackIn_326_0 = var17;
                    stackIn_326_1 = var17.field_cb;
                    stackIn_327_2 = (0 == (tqa.field_e[var27 / 8] & 1 << (var27 & 7)));
                    stackIn_326_0.field_cb = stackIn_326_1 & stackIn_327_2;
                    var27++;
                  }
                } else {
                  stackIn_318_0 = var17;
                  stackIn_318_1 = 0;
                  stackIn_318_2 = tqa.field_e[(var6Lifetime4 + var9) / 8] & 1 << (7 & var9 + var6Lifetime4);
                  stackIn_321_1 = (stackIn_318_1 != stackIn_318_2);
                  stackIn_318_0.field_cb = stackIn_321_1;
                }
              }
              stackIn_336_0 = var17;
              stackIn_337_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_336_0.field_X = stackIn_337_1;
            }
            var6Lifetime4 = var6Lifetime4 + (255 & um.field_m[var7]);
          }
          if (var5 != 0) {
            if (param3) {
              return;
            }
            mla.a(param0, -94);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_346_0 = var4;
          stackIn_346_1 = new StringBuilder().append("cm.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_347_2 = "null";
          } else {
            stackIn_347_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_346_0), ((StringBuilder) (Object) stackIn_346_1).append(stackIn_347_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
