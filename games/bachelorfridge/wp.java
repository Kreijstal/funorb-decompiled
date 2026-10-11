/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp extends tga {
    static int[] field_q;
    static int field_r;

    wp(lu param0) {
        this(param0.b(16711935), param0.b(16711935));
    }

    wp(int param0, int param1) {
        super(param0, param1);
        this.field_j = 3;
    }

    private final void a(ub param0, int param1, int param2, byte param3) {
        gj var8 = param0.field_o;
        if (param3 != 83) {
          field_r = -32;
        }
        op var6 = var8.field_h;
        if (param2 < 0 ||
          var6.field_z <= param2) {
          return;
        }
        if (0 > param1 ||
          param1 >= var6.field_B) {
          return;
        }
        ad var7 = var8.a(param1, false, param2);
        if (var7 == null) {
          return;
        }
        try {
          var7.field_s.g(48, 45);
          param0.a(27799, new ek(var8, var7, 45));
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wp.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, op param3) {
        aga var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (0 <= param2 &&
            param3.field_z > param2) {
            if (param1 >= 0 &&
              param3.field_B > param1) {
              var5 = param3.field_a[param2][param1].field_l;
              if (var5 != null) {
                var5.g(-94, 45);
              }
              if (param0 != -116) {
                field_r = -38;
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("wp.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_q = null;
        if (param0 <= 58) {
          wp.b(44);
        }
    }

    final void a(boolean param0, op param1) {
        try {
          this.a((byte) -116, this.field_o, this.field_n, param1);
          this.a((byte) -116, this.field_o, -1 + this.field_n, param1);
          this.a((byte) -116, this.field_o, 1 + this.field_n, param1);
          this.a((byte) -116, this.field_o - 1, this.field_n, param1);
          this.a((byte) -116, this.field_o + 1, this.field_n, param1);
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, uha param1, int param2, boolean param3) {
        gna dupTemp$0 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        gna stackIn_34_0 = null;
        boolean stackIn_35_1 = false;
        gna stackIn_41_0 = null;
        boolean stackIn_42_1 = false;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_71_0 = 0;
        gna stackIn_87_0 = null;
        boolean stackIn_88_1 = false;
        gna stackIn_94_0 = null;
        boolean stackIn_94_1 = false;
        boolean stackIn_95_2 = false;
        gna stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        boolean stackIn_100_1 = false;
        gna stackIn_104_0 = null;
        boolean stackIn_105_1 = false;
        int stackIn_109_0 = 0;
        gna stackIn_123_0 = null;
        boolean stackIn_124_1 = false;
        gna stackIn_127_0 = null;
        boolean stackIn_128_1 = false;
        gna stackIn_132_0 = null;
        boolean stackIn_133_1 = false;
        gna stackIn_136_0 = null;
        boolean stackIn_137_1 = false;
        String stackIn_154_0 = null;
        gna stackIn_158_0 = null;
        boolean stackIn_159_1 = false;
        gna stackIn_161_0 = null;
        boolean stackIn_162_1 = false;
        int stackIn_168_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_225_0 = 0;
        gna stackIn_325_0 = null;
        boolean stackIn_326_1 = false;
        gna stackIn_331_0 = null;
        boolean stackIn_331_1 = false;
        boolean stackIn_332_2 = false;
        int stackIn_335_1 = 0;
        byte stackIn_335_2 = 0;
        int stackIn_335_3 = 0;
        gna stackIn_337_0 = null;
        boolean stackIn_338_1 = false;
        gna stackIn_342_0 = null;
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
        gna[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        gna var17 = null;
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
        gna var28 = null;
        gna var29 = null;
        gna[] var30 = null;
        Object var31 = null;
        String var31_ref = null;
        String var32 = null;
        String var33 = null;
        Object var25Lifetime1;
        Object var31Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = BachelorFridge.field_y;
        try {
          if (param3) {
            stackIn_12_0 = (ce.field_y) ? 0 : 1;
            var4_int = stackIn_12_0;
          } else {
            if (ps.d(-122)) {
              stackIn_8_0 = (!param1.field_Zb) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
            var4_int = stackIn_8_0;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var5 = param0 ? 1 : 0;
          if (param3) {
            decompiledFrameRemainder1 = !(2 > qha.field_c.length);
            if (decompiledFrameRemainder1) {
              if (param3) {
                stackIn_22_0 = (aca.field_k != -1) ? 1 : 0;
              } else {
                stackIn_22_0 = 0;
              }
              var6 = stackIn_22_0;
              decompiledFrameRemainder0 = (var6 != 0);
              if (decompiledFrameRemainder0) {
                var7 = aca.field_k;
                for (var8_int = 0; fia.field_r.length > var8_int; var8_int++) {
                  fia.field_r[var8_int] = (byte) 0;
                }
              }
            }
          } else {
            for (var6 = 0; var6 < 5; var6++) {
              if (var4_int != 0 &&
                gd.field_n[0][1 + var6].field_R != 0 &&
                param1.field_Kb != var6) {
                param1.field_Kb = var6;
                var5 = 1;
              }
              stackIn_34_0 = gd.field_n[0][1 + var6];
              stackIn_35_1 = (var4_int != 0);
              stackIn_34_0.field_u = stackIn_35_1;
              if (!eaa.field_c &&
                var6 == 3) {
                gd.field_n[0][1 + var6].field_u = false;
              }
              stackIn_41_0 = gd.field_n[0][var6 + 1];
              stackIn_42_1 = (var6 == param1.field_Kb);
              stackIn_41_0.field_t = stackIn_42_1;
            }
            if (gd.field_n[0][2].field_E) {
              if (!ps.d(-117)) {
                jja.field_m = lga.a(true, new String[]{pw.field_w.field_Jb}, wa.field_o);
              } else {
                jja.field_m = qd.field_p;
              }
            }
            decompiledFrameRemainder1 = !(2 > qha.field_c.length);
            if (decompiledFrameRemainder1) {
              if (param3) {
                stackIn_55_0 = (aca.field_k != -1) ? 1 : 0;
              } else {
                stackIn_55_0 = 0;
              }
              var6 = stackIn_55_0;
              decompiledFrameRemainder0 = (var6 != 0);
              if (decompiledFrameRemainder0) {
                var7 = aca.field_k;
                for (var8_int = 0; fia.field_r.length > var8_int; var8_int++) {
                  fia.field_r[var8_int] = (byte) 0;
                }
              }
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            fia.field_r[var7 / 8] = (byte)mp.a((int) fia.field_r[var7 / 8], 1 << var7 % 8);
          }
          if (decompiledFrameRemainder1) {
            stackIn_63_0 = (!param3) ? 0 : -1;
            for (var7 = stackIn_63_0; qha.field_c.length > var7; var7++) {
              if (var6 != 0) {
                stackIn_71_0 = (aca.field_k != var7) ? 1 : 0;
              } else {
                stackIn_71_0 = 0;
              }
              var8_intLifetime1 = stackIn_71_0;
              if (var4_int != 0 &&
                gd.field_n[1][1 + var7].field_R != 0) {
                if (!param3) {
                  var9 = qha.field_c[var7];
                  if (param1.field_Pb != var9) {
                    var5 = 1;
                    param1.field_Pb = var9;
                  }
                } else {
                  if (var6 == 0) {
                    if (var7 == -1) {
                      for (var9 = 0; var9 < fia.field_r.length; var9++) {
                        fia.field_r[var9] = (byte) 0;
                      }
                    } else {
                      fia.field_r[var7 / 8] = (byte)lt.a((int) fia.field_r[var7 / 8], 1 << dda.a(var7, 7));
                    }
                  }
                }
              }
              if (param3) {
                if (var7 == -1) {
                  gd.field_n[1][var7 + 1].field_t = true;
                  for (var9 = 0; qha.field_c.length > var9; var9++) {
                    dupTemp$0 = gd.field_n[1][var7 + 1];
                    stackIn_94_0 = dupTemp$0;
                    stackIn_94_1 = dupTemp$0.field_t;
                    stackIn_95_2 = ((fia.field_r[var9 / 8] & 1 << (var9 & 7)) == 0);
                    stackIn_94_0.field_t = stackIn_94_1 & stackIn_95_2;
                  }
                } else {
                  stackIn_97_0 = gd.field_n[1][var7 + 1];
                  stackIn_97_1 = ~(fia.field_r[var7 / 8] & 1 << (var7 & 7));
                  stackIn_97_2 = -1;
                  stackIn_100_1 = (stackIn_97_1 != stackIn_97_2);
                  stackIn_97_0.field_t = stackIn_100_1;
                }
              } else {
                var9 = qha.field_c[var7];
                stackIn_87_0 = gd.field_n[1][var7 + 1];
                stackIn_88_1 = (var9 == param1.field_Pb);
                stackIn_87_0.field_t = stackIn_88_1;
              }
              stackIn_104_0 = gd.field_n[1][var7 + 1];
              stackIn_105_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_104_0.field_u = stackIn_105_1;
            }
          }
          stackIn_109_0 = (!param3) ? 1 : 0;
          for (var6Lifetime1 = stackIn_109_0; var6Lifetime1 < 3; var6Lifetime1++) {
            var28 = gd.field_n[2][var6Lifetime1];
            if (var4_int != 0 &&
              var28.field_R != 0) {
              if (param3) {
                if (var6Lifetime1 != 0) {
                  ena.field_n = ena.field_n ^ var6Lifetime1;
                } else {
                  ena.field_n = 0;
                }
              } else {
                if (var6Lifetime1 != param1.field_Lb) {
                  param1.field_Lb = var6Lifetime1;
                  var5 = 1;
                }
              }
            }
            stackIn_123_0 = var28;
            stackIn_124_1 = (var4_int != 0);
            stackIn_123_0.field_u = stackIn_124_1;
            if (param3) {
              if (0 == var6Lifetime1) {
                stackIn_136_0 = var28;
                stackIn_137_1 = (0 == ena.field_n);
                stackIn_136_0.field_t = stackIn_137_1;
              } else {
                stackIn_132_0 = var28;
                stackIn_133_1 = ((ena.field_n & var6Lifetime1) != 0);
                stackIn_132_0.field_t = stackIn_133_1;
              }
            } else {
              stackIn_127_0 = var28;
              stackIn_128_1 = ((var6Lifetime1 & param1.field_Lb) != 0);
              stackIn_127_0.field_t = stackIn_128_1;
            }
          }
          if (param3 &&
            bma.field_u > 1) {
            for (var6Lifetime2 = 0; var6Lifetime2 < bma.field_u + 1; var6Lifetime2++) {
              var29 = gd.field_n[3][var6Lifetime2];
              if (var4_int != 0 &&
                0 != var29.field_R) {
                tq.field_h = var6Lifetime2;
              }
              if (var29.field_E &&
                var6Lifetime2 > 0) {
                if (null == md.field_p) {
                  stackIn_154_0 = null;
                } else {
                  stackIn_154_0 = md.field_p[var6Lifetime2 - 1];
                }
                var8 = stackIn_154_0;
                if (var8 != null) {
                  jja.field_m = var8;
                }
              }
              stackIn_158_0 = var29;
              stackIn_159_1 = (tq.field_h == var6Lifetime2);
              stackIn_158_0.field_t = stackIn_159_1;
              stackIn_161_0 = var29;
              stackIn_162_1 = (var4_int != 0);
              stackIn_161_0.field_u = stackIn_162_1;
            }
          }
          var6Lifetime3 = 0;
          for (var7 = 0; var7 < ld.field_q; var7++) {
            var30 = gd.field_n[var7 + 4];
            var8_array = var30;
            stackIn_168_0 = (param3) ? -1 : 0;
            for (var9 = stackIn_168_0; var9 < var30.length - 1; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                var9 >= 0) {
                if (null != wda.field_c &&
                  wda.field_c[var7] != null &&
                  (wda.field_c[var7][var9] & ~pn.field_d) > 0) {
                  var14 = 1;
                  var15 = ho.a(62, wda.field_c[var7][var9] & ~pn.field_d);
                }
                if (hr.field_b != null &&
                  hr.field_b[var7] != null &&
                  dm.field_f <= 0 &&
                  hr.field_b[var7][var9]) {
                  var10 = 1;
                }
                if (null != re.field_F &&
                  null != re.field_F[var7]) {
                  var16 = re.field_F[var7][var9];
                  if (var16 != 0 &&
                    !bha.field_l &&
                    dm.field_f <= 0) {
                    var10 = 1;
                  }
                  if (var16 > 0 &&
                    wk.field_a < var16) {
                    var12 = 1;
                  }
                }
                if (gma.field_c != null &&
                  gma.field_c[var7] != null) {
                  var16Lifetime2 = gma.field_c[var7][var9];
                  if (0 < var16Lifetime2 &&
                    ui.field_q < var16Lifetime2) {
                    var11 = 1;
                  }
                  if (var16Lifetime2 != 0 &&
                    !bha.field_l &&
                    dm.field_f <= 0) {
                    var10 = 1;
                  }
                }
                if (param3) {
                  if (null != im.field_c) {
                    if (null != im.field_c[var7]) {
                      stackIn_212_0 = (im.field_c[var7][var9]) ? 1 : 0;
                    } else {
                      stackIn_212_0 = 0;
                    }
                  } else {
                    stackIn_212_0 = 0;
                  }
                } else {
                  stackIn_212_0 = 0;
                }
                var13 = stackIn_212_0;
              }
              if (hea.field_r >= 2 &&
                wga.field_q[12]) {
                var12 = 0;
                var10 = 0;
                var14 = 0;
                var13 = 0;
                var11 = 0;
              }
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0 &&
                var14 == 0) {
                stackIn_225_0 = 0;
              } else {
                stackIn_225_0 = 1;
              }
              var16Lifetime1 = stackIn_225_0;
              fla.field_q = true;
              if (var16Lifetime1 == 0 &&
                var9 >= 0 &&
                pha.field_h != null && (!param3 ||
                !ce.field_y)) {
                if (null == bja.field_o) {
                  ala.field_b = new boolean[ld.field_q];
                  bja.field_o = new byte[ld.field_q];
                }
                fla.field_q = false;
                uu.field_yb = false;
                for (var17_int = 0; var17_int < var7; var17_int++) {
                  ala.field_b[var17_int] = false;
                }
                ub.a(0, param3, -96, var9, -1, param1, -1, var7);
                if (2 <= hea.field_r &&
                  wga.field_q[12]) {
                  fla.field_q = true;
                }
                if (!fla.field_q) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[1 + var9];
              if (var4_int != 0 &&
                0 != var17.field_R) {
                if (param3) {
                  if (-1 == var9) {
                    for (var18 = var6Lifetime3; -1 + (var30.length + var6Lifetime3) > var18; var18++) {
                      sca.field_c[var18 / 8] = (byte)dda.a((int) sca.field_c[var18 / 8], ~(1 << dda.a(7, var18)));
                    }
                  } else {
                    sca.field_c[(var9 + var6Lifetime3) / 8] = (byte)lt.a((int) sca.field_c[(var9 + var6Lifetime3) / 8], 1 << dda.a(7, var6Lifetime3 + var9));
                  }
                } else {
                  if (var16Lifetime1 == 0 &&
                    (byte)var9 != param1.field_Eb[var7]) {
                    param1.field_Eb[var7] = (byte)var9;
                    var5 = 1;
                  }
                }
              }
              if (param3 &&
                var16Lifetime1 != 0) {
                sca.field_c[(var6Lifetime3 + var9) / 8] = (byte)dda.a((int) sca.field_c[(var6Lifetime3 + var9) / 8], ~(1 << dda.a(var9 + var6Lifetime3, 7)));
              }
              if (var9 >= 0 &&
                var17.field_E) {
                if (null != co.field_a) {
                  if (null != co.field_a[var7]) {
                    var18_ref = co.field_a[var7][var9];
                  } else {
                    var18_ref = null;
                  }
                } else {
                  var18_ref = null;
                }
                if (null != gk.field_c) {
                  if (gk.field_c[var7] != null) {
                    var19 = gk.field_c[var7][var9];
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
                      var22_int = -ui.field_q + gma.field_c[var7][var9];
                      if (1 != var22_int) {
                        var21 = lga.a(true, new String[]{Integer.toString(var22_int)}, tv.field_p);
                        var31 = var21;
                        var21 = var31;
                        var31Lifetime1 = var21;
                        var21 = var31Lifetime1;
                      } else {
                        var21 = afa.field_k;
                      }
                    }
                    if (var12 != 0) {
                      var31_ref = lga.a(true, new String[]{Integer.toString(wk.field_a), Integer.toString(re.field_F[var7][var9])}, oca.field_o);
                      var21 = var31_ref;
                      var21 = var31_ref;
                      if (var21 != null) {
                        var21 = (String) (var21) + "<br>" + var31_ref;
                      } else {
                        var21 = var31_ref;
                      }
                    }
                    if (var14 != 0) {
                      var22 = df.field_q;
                      if (0 < var15 &&
                        ffa.field_j != null &&
                        var15 <= ffa.field_j.length &&
                        null != ffa.field_j[var15 - 1]) {
                        var22 = ffa.field_j[var15 - 1][0];
                      }
                      if (var21 == null) {
                        var21 = var22;
                      } else {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                      }
                    }
                  } else {
                    var21 = ph.field_N;
                  }
                } else {
                  var21 = hk.field_a;
                }
                if (var4_int != 0 &&
                  !fla.field_q) {
                  var22 = null;
                  var23 = 0;
                  if (uu.field_yb) {
                    var22 = "</col>" + gb.field_j + "<col=A00000>";
                    var25 = var22;
                    var22 = var25;
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var21 = var22;
                  }
                  for (var24 = 0; var7 > var24; var24++) {
                    if (ala.field_b[var24]) {
                      var25_ref = "</col>" + kka.field_k[var24] + "<col=A00000>";
                      var22 = var25_ref;
                      var21 = var22;
                      var22 = var25_ref;
                      if (var22 == null) {
                        var22 = var25_ref;
                        var21 = var22;
                        var21 = var22;
                      } else {
                        var22 = (String) (var22) + ", " + var25_ref;
                        var23 = 1;
                      }
                    }
                  }
                  if (var23 == 0) {
                    var21 = lga.a(true, new String[]{(String) (var22)}, l.field_s);
                  } else {
                    var21 = gf.field_i + (String) (var22);
                  }
                }
                if (var21 != null) {
                  var32 = "<col=A00000>" + (String) (var21);
                  var33 = qm.a("<br><col=A00000>", "<br>", var32, -1);
                  if (var20 == null) {
                    var20 = var33;
                  } else {
                    var20 = (String) (var20) + "<br>" + var33;
                  }
                }
                if (var20 != null) {
                  jja.field_m = (String) (var20);
                }
              }
              if (!param3) {
                boolean decompiledFrameRemainder2 = true;
                stackIn_337_0 = var17;
                if (fla.field_q) {
                  stackIn_335_1 = ~(byte)var9;
                  stackIn_335_2 = param1.field_Eb[var7];
                  stackIn_335_3 = -1;
                  if (stackIn_335_1 == (stackIn_335_2 ^ stackIn_335_3)) {
                    stackIn_338_1 = true;
                    decompiledFrameRemainder2 = false;
                  }
                }
                if (decompiledFrameRemainder2) {
                  stackIn_338_1 = false;
                }
                stackIn_337_0.field_t = stackIn_338_1;
              } else {
                if (var9 == -1) {
                  var17.field_t = true;
                  var27 = var6Lifetime3;
                  var18Lifetime1 = var27;
                  while (var27 < var6Lifetime3 + var30.length - 1) {
                    stackIn_331_0 = var17;
                    stackIn_331_1 = var17.field_t;
                    stackIn_332_2 = ((sca.field_c[var27 / 8] & 1 << (7 & var27)) == 0);
                    stackIn_331_0.field_t = stackIn_331_1 & stackIn_332_2;
                    var27++;
                  }
                } else {
                  stackIn_325_0 = var17;
                  stackIn_326_1 = ((sca.field_c[(var9 + var6Lifetime3) / 8] & 1 << (var9 + var6Lifetime3 & 7)) != 0);
                  stackIn_325_0.field_t = stackIn_326_1;
                }
              }
              stackIn_342_0 = var17;
              stackIn_343_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_342_0.field_u = stackIn_343_1;
            }
            var6Lifetime3 = var6Lifetime3 + (255 & mja.field_s[var7]);
          }
          if (var5 != 0) {
            if (param3) {
              return;
            }
            bka.b(-112, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_352_0 = var4;
          stackIn_352_1 = new StringBuilder().append("wp.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_353_2 = "null";
          } else {
            stackIn_353_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_352_0), ((StringBuilder) (Object) stackIn_352_1).append(stackIn_353_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(ub param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        gj var4 = null;
        gj var5 = null;
        try {
          if (param1 > -2) {
            return;
          }
          var4 = param0.field_o;
          var5 = var4;
          if (var4.field_h.field_a[this.field_n][this.field_o].field_n == 37) {
            param0.a(27799, new iu(8, 128));
          } else {
            param0.a(27799, new iu(60, 128));
          }
          param0.a(27799, new fha(new dw(var5, this.field_n, this.field_o)));
          this.a(param0, this.field_o, this.field_n, (byte) 83);
          this.a(param0, this.field_o, -1 + this.field_n, (byte) 83);
          this.a(param0, this.field_o, this.field_n + 1, (byte) 83);
          this.a(param0, this.field_o - 1, this.field_n, (byte) 83);
          this.a(param0, 1 + this.field_o, this.field_n, (byte) 83);
          super.a(false, var5.field_h);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wp.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = new int[5];
    }
}
