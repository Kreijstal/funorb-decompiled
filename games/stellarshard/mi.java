/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    private int[] field_d;
    private static int[] field_i;
    private static int[] field_b;
    private int[][] field_l;
    private static float[] field_c;
    private int[] field_j;
    private int[] field_e;
    private static boolean[] field_h;
    private int field_f;
    private int[] field_a;
    private static int[] field_g;
    private int[] field_k;

    final boolean b() {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int incrementValue$0 = 0;
        int var1 = ad.a() != 0 ? 1 : 0;
        if (var1 == 0) {
            return false;
        }
        int var2 = this.field_k.length;
        System.arraycopy(this.field_k, 0, field_i, 0, var2);
        int var3 = field_b[this.field_f - 1];
        int var4 = ug.a(var3 - 1, 4);
        field_g[0] = ad.d(var4);
        field_g[1] = ad.d(var4);
        int var5 = 2;
        for (var6 = 0; var6 < this.field_a.length; var6++) {
            var7 = this.field_a[var6];
            var8 = this.field_d[var7];
            var9 = this.field_j[var7];
            var10 = (1 << var9) - 1;
            var11 = 0;
            if (var9 > 0) {
                var11 = ad.field_A[this.field_e[var7]].b();
            }
            for (var12 = 0; var12 < var8; var12++) {
                var13 = this.field_l[var7][var11 & var10];
                var11 = var11 >>> var9;
                incrementValue$0 = var5;
                var5++;
                field_g[incrementValue$0] = var13 >= 0 ? ad.field_A[var13].b() : 0;
            }
        }
        return true;
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param0 < param1) {
          var3 = param0;
          var4 = field_i[var3];
          var5 = field_g[var3];
          var6 = field_h[var3] ? 1 : 0;
          var7 = param0 + 1;
          L0: while (true) {
            if (var7 > param1) {
              field_i[var3] = var4;
              field_g[var3] = var5;
              field_h[var3] = var6 != 0;
              this.a(param0, var3 - 1);
              this.a(var3 + 1, param1);
              return;
            } else {
              var8 = field_i[var7];
              if (var8 < var4) {
                field_i[var3] = var8;
                field_g[var3] = field_g[var7];
                field_h[var3] = field_h[var7];
                var3++;
                field_i[var7] = field_i[var3];
                field_g[var7] = field_g[var3];
                field_h[var7] = field_h[var3];
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(float[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        boolean[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        boolean[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int stackIn_5_0 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        var3 = this.field_k.length;
        var4 = field_b[this.field_f - 1];
        var5 = field_h;
        field_h[1] = true;
        var5[0] = true;
        var6 = 2;
        L0: while (true) {
          if (var6 >= var3) {
            this.a(0, var3 - 1);
            var6 = 0;
            var7 = field_g[0] * this.field_f;
            var16 = 1;
            var8_int = var16;
            L1: while (true) {
              if (var16 >= var3) {
                var8 = field_c[var7];
                var9 = var6;
                L2: while (true) {
                  if (var9 >= param1) {
                    return;
                  } else {
                    param0[var9] = param0[var9] * var8;
                    var9++;
                    continue L2;
                  }
                }
              } else {
                if (field_h[var16]) {
                  var9 = field_i[var16];
                  var10 = field_g[var16] * this.field_f;
                  this.a(var6, var7, var9, var10, param0, param1);
                  if (var9 < param1) {
                    var6 = var9;
                    var7 = var10;
                    var16++;
                    continue L1;
                  } else {
                    return;
                  }
                } else {
                  var16++;
                  continue L1;
                }
              }
            }
          } else {
            L3: {
              var7 = mi.b(field_i, var6);
              var8_int = mi.a(field_i, var6);
              var9 = this.a(field_i[var7], field_g[var7], field_i[var8_int], field_g[var8_int], field_i[var6]);
              var10 = field_g[var6];
              var11 = var4 - var9;
              var12 = var9;
              if (var11 >= var12) {
                stackOut_4_0 = var12;
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = var11;
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            var13 = stackIn_5_0 << 1;
            if (var10 == 0) {
              field_h[var6] = false;
              field_g[var6] = var9;
              var6++;
              continue L0;
            } else {
              var14 = field_h;
              var15 = var7;
              field_h[var8_int] = true;
              var14[var15] = true;
              field_h[var6] = true;
              if (var10 < var13) {
                L4: {
                  stackOut_11_0 = (int[]) (field_g);
                  stackOut_11_1 = var6;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if ((var10 & 1) == 0) {
                    stackOut_13_0 = (int[]) ((Object) stackIn_13_0);
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = var9 + var10 / 2;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    break L4;
                  } else {
                    stackOut_12_0 = (int[]) ((Object) stackIn_12_0);
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = var9 - (var10 + 1) / 2;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    break L4;
                  }
                }
                stackIn_14_0[stackIn_14_1] = stackIn_14_2;
                var6++;
                continue L0;
              } else {
                L5: {
                  stackOut_7_0 = (int[]) (field_g);
                  stackOut_7_1 = var6;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (var11 <= var12) {
                    stackOut_9_0 = (int[]) ((Object) stackIn_9_0);
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = var9 - var10 + var11 - 1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    break L5;
                  } else {
                    stackOut_8_0 = (int[]) ((Object) stackIn_8_0);
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = var10 - var12 + var9;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    break L5;
                  }
                }
                stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                var6++;
                continue L0;
              }
            }
          }
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_i = null;
        field_g = null;
        field_h = null;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = param3 - param1;
        int var7 = param2 - param0;
        int var8 = var6 < 0 ? -var6 : var6;
        int var9 = var8 * (param4 - param0);
        int var10 = var9 / var7;
        return var6 < 0 ? param1 - var10 : param1 + var10;
    }

    private final static int b(int[] param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var2 = param0[param1];
        var3 = -1;
        var4 = -2147483648;
        var5 = 0;
        L0: while (true) {
          if (var5 >= param1) {
            return var3;
          } else {
            var6 = param0[var5];
            if (var6 < var2) {
              if (var6 > var4) {
                var3 = var5;
                var4 = var6;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, float[] param4, int param5) {
        int var14 = 0;
        int var7 = param3 - param1;
        int var8 = param2 - param0;
        int var9 = var7 < 0 ? -var7 : var7;
        int var10 = var7 / var8;
        int var11 = param1;
        int var12 = 0;
        int var13 = var7 < 0 ? var10 - 1 : var10 + 1;
        var9 = var9 - (var10 < 0 ? -var10 : var10) * var8;
        param4[param0] = param4[param0] * field_c[var11];
        if (param2 > param5) {
            param2 = param5;
        }
        for (var14 = param0 + 1; var14 < param2; var14++) {
            var12 = var12 + var9;
            if (var12 >= var8) {
                var12 = var12 - var8;
                var11 = var11 + var13;
            } else {
                var11 = var11 + var10;
            }
            param4[var14] = param4[var14] * field_c[var11];
        }
    }

    mi() {
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        var1 = ad.d(16);
        if (var1 == 1) {
          var2 = ad.d(5);
          var3 = 0;
          this.field_a = new int[var2];
          var4 = 0;
          L0: while (true) {
            if (var4 >= var2) {
              this.field_d = new int[var3];
              this.field_j = new int[var3];
              this.field_e = new int[var3];
              this.field_l = new int[var3][];
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3) {
                  this.field_f = ad.d(2) + 1;
                  var4 = ad.d(4);
                  var5 = 2;
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= var2) {
                      this.field_k = new int[var5];
                      this.field_k[0] = 0;
                      this.field_k[1] = 1 << var4;
                      var5 = 2;
                      var6 = 0;
                      L3: while (true) {
                        if (var6 >= var2) {
                          L4: {
                            L5: {
                              if (field_i == null) {
                                break L5;
                              } else {
                                if (field_i.length >= var5) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            field_i = new int[var5];
                            field_g = new int[var5];
                            field_h = new boolean[var5];
                            break L4;
                          }
                          return;
                        } else {
                          var7 = this.field_a[var6];
                          var8 = 0;
                          L6: while (true) {
                            if (var8 >= this.field_d[var7]) {
                              var6++;
                              continue L3;
                            } else {
                              incrementValue$2 = var5;
                              var5++;
                              this.field_k[incrementValue$2] = ad.d(var4);
                              var8++;
                              continue L6;
                            }
                          }
                        }
                      }
                    } else {
                      var5 = var5 + this.field_d[this.field_a[var6]];
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  L7: {
                    this.field_d[var4] = ad.d(3) + 1;
                    dupTemp$3 = ad.d(2);
                    this.field_j[var4] = dupTemp$3;
                    var5 = dupTemp$3;
                    if (var5 == 0) {
                      break L7;
                    } else {
                      this.field_e[var4] = ad.d(8);
                      break L7;
                    }
                  }
                  var5 = 1 << var5;
                  var10 = new int[var5];
                  var9 = var10;
                  var6_ref_int__ = var9;
                  this.field_l[var4] = var10;
                  var7 = 0;
                  L8: while (true) {
                    if (var7 >= var5) {
                      var4++;
                      continue L1;
                    } else {
                      var6_ref_int__[var7] = ad.d(8) - 1;
                      var7++;
                      continue L8;
                    }
                  }
                }
              }
            } else {
              var5 = ad.d(4);
              this.field_a[var4] = var5;
              if (var5 >= var3) {
                var3 = var5 + 1;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          throw new RuntimeException();
        }
    }

    private final static int a(int[] param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var2 = param0[param1];
        var3 = -1;
        var4 = 2147483647;
        var5 = 0;
        L0: while (true) {
          if (var5 >= param1) {
            return var3;
          } else {
            var6 = param0[var5];
            if (var6 > var2) {
              if (var6 < var4) {
                var3 = var5;
                var4 = var6;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    static {
        field_c = new float[]{1.0649863213529898e-7f, 1.1341951022814101e-7f, 1.2079014766186447e-7f, 1.2863978327004588e-7f, 1.3699950329737476e-7f, 1.459025043004658e-7f, 1.553840860424316e-7f, 1.654818078122844e-7f, 1.7623574422032107e-7f, 1.8768855625239667e-7f, 1.998856049567621e-7f, 2.128753067154321e-7f, 2.2670913324418507e-7f, 2.4144196686393116e-7f, 2.5713222839840455e-7f, 2.738421187586937e-7f, 2.9163791737119027e-7f, 3.105902237621194e-7f, 3.3077409966608684e-7f, 3.5226966588197683e-7f, 3.7516213069466176e-7f, 3.9954230146577174e-7f, 4.2550681200737017e-7f, 4.531586341727234e-7f, 4.826074473385233e-7f, 5.139700078871101e-7f, 5.473706323755323e-7f, 5.829418796565733e-7f, 6.208247214090079e-7f, 6.611693947888853e-7f, 7.041359140202985e-7f, 7.498946388295735e-7f, 7.98627013409714e-7f, 8.505263053848466e-7f, 9.057982879312476e-7f, 9.646621492720442e-7f, 0.0000010273513453284977f, 0.0000010941143955278676f, 0.0000011652160765152075f, 0.0000012409384453349048f, 0.0000013215816352385445f, 0.0000014074654473006376f, 0.000001498930487286998f, 0.0000015963394162099576f, 0.0000017000785419440945f, 0.0000018105591834682855f, 0.0000019282194898551097f, 0.0000020535260318865767f, 0.0000021869757347303675f, 0.0000023290976969292387f, 0.0000024804558051982895f, 0.0000026416496439196635f, 0.000002813319042616058f, 0.0000029961443033243995f, 0.000003190850520695676f, 0.0000033982100831053685f, 0.000003619044946390204f, 0.000003854230726574315f, 0.0000041047005652217194f, 0.000004371447175799403f, 0.000004655528300645528f, 0.000004958070803695591f, 0.000005280273853713879f, 0.000005623416200251086f, 0.00000598885708313901f, 0.0000063780466916796286f, 0.000006792528438381851f, 0.000007233945325424429f, 0.000007704047675360925f, 0.000008204699952329975f, 0.000008737887583265547f, 0.000009305725143349264f, 0.000009910463631968014f, 0.000010554501386650372f, 0.000011240392268518917f, 0.00001197085566673195f, 0.000012748789231409319f, 0.000013577277968579438f, 0.000014459606063610408f, 0.00001539927143312525f, 0.000016400004824390635f, 0.000017465768905822188f, 0.000018600792827783152f, 0.000019809576770057902f, 0.00002109691376972478f, 0.00002246791154902894f, 0.000023928001610329375f, 0.000025482977434876375f, 0.00002713900539674796f, 0.000028902650228701532f, 0.000030780909582972527f, 0.000032781226764200255f, 0.00003491153256618418f, 0.000037180281651671976f, 0.00003959646710427478f, 0.00004216966772219166f, 0.00004491009167395532f, 0.000047828601964283735f, 0.00005093677464174107f, 0.00005424693154054694f, 0.00005777220212621614f, 0.00006152656715130433f, 0.00006552490958711132f, 0.00006978308374527842f, 0.00007431798439938575f, 0.00007914758316474035f, 0.00008429103763774037f, 0.00008976874960353598f, 0.00009560242324369028f, 0.00010181521065533161f, 0.00010843174095498398f, 0.0001154782366938889f, 0.00012298267392907292f, 0.00013097477494738996f, 0.00013948624837212265f, 0.00014855085464660078f, 0.00015820453700143844f, 0.000168485552421771f, 0.00017943468992598355f, 0.00019109535787720233f, 0.00020351381681393832f, 0.00021673929586540908f, 0.0002308242255821824f, 0.00024582448531873524f, 0.0002617995487526059f, 0.0002788127458188683f, 0.0002969315683003515f, 0.00031622787355445325f, 0.00033677814644761384f, 0.0003586638777051121f, 0.0003819718840532005f, 0.0004067945701535791f, 0.00043323036516085267f, 0.0004613841010723263f, 0.000491367478389293f, 0.0005232992698438466f, 0.0005573062226176262f, 0.0005935230874456465f, 0.0006320935790427029f, 0.000673170608934015f, 0.0007169169839471579f, 0.0007635062793269753f, 0.0008131232461892068f, 0.0008659645682200789f, 0.0009222398512065411f, 0.0009821722051128745f, 0.001045999233610928f, 0.0011139742564409971f, 0.0011863665422424674f, 0.001263463287614286f, 0.0013455701991915703f, 0.0014330128906294703f, 0.0015261381631717086f, 0.00162531528621912f, 0.0017309373943135142f, 0.0018434234661981463f, 0.001963219605386257f, 0.002090800553560257f, 0.002226672600954771f, 0.002371374284848571f, 0.002525479532778263f, 0.0026895992923527956f, 0.0028643847908824682f, 0.0030505286995321512f, 0.0032487690914422274f, 0.0034598924685269594f, 0.003684735856950283f, 0.003924190532416105f, 0.0041792066767811775f, 0.004450794775038958f, 0.004740032833069563f, 0.005048066843301058f, 0.005376118700951338f, 0.005725488997995853f, 0.0060975635424256325f, 0.006493817549198866f, 0.006915822625160217f, 0.007365251425653696f, 0.00784388743340969f, 0.008353627286851406f, 0.008896492421627045f, 0.009474636986851692f, 0.010090352036058903f, 0.010746080428361893f, 0.01144442055374384f, 0.012188144028186798f, 0.012980197556316853f, 0.013823725283145905f, 0.0147220678627491f, 0.01567879132926464f, 0.016697686165571213f, 0.017782796174287796f, 0.018938422203063965f, 0.020169148221611977f, 0.021479854360222816f, 0.02287573553621769f, 0.02436232939362526f, 0.025945531204342842f, 0.027631618082523346f, 0.02942727692425251f, 0.031339626759290695f, 0.03337625041604042f, 0.0355452261865139f, 0.037855155766010284f, 0.04031519964337349f, 0.04293510690331459f, 0.045725274831056595f, 0.04869675636291504f, 0.05186134949326515f, 0.05523158982396126f, 0.058820851147174835f, 0.06264336407184601f, 0.06671427935361862f, 0.0710497498512268f, 0.07566696405410767f, 0.08058422803878784f, 0.08582104742527008f, 0.09139817953109741f, 0.0973377451300621f, 0.10366330295801163f, 0.11039993166923523f, 0.11757434159517288f, 0.12521497905254364f, 0.1333521455526352f, 0.142018124461174f, 0.15124726295471191f, 0.16107617318630219f, 0.17154380679130554f, 0.18269167840480804f, 0.19456401467323303f, 0.20720787346363068f, 0.22067342698574066f, 0.23501402139663696f, 0.2502865493297577f, 0.26655158400535583f, 0.28387361764907837f, 0.30232131481170654f, 0.32196786999702454f, 0.342891126871109f, 0.36517414450645447f, 0.38890519738197327f, 0.4141784608364105f, 0.44109413027763367f, 0.46975889801979065f, 0.5002864599227905f, 0.5327979326248169f, 0.567422091960907f, 0.6042963862419128f, 0.6435669660568237f, 0.6853895783424377f, 0.72993004322052f, 0.7773650288581848f, 0.8278825879096985f, 0.8816830515861511f, 0.9389798045158386f, 1.0f};
        field_b = new int[]{256, 128, 86, 64};
    }
}
