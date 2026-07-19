/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cd extends ea implements Cloneable {
    private int field_y;
    static int[] field_v;
    private int field_C;
    static String field_A;
    private int field_t;
    static int[][] field_z;
    private boolean field_B;
    private int field_w;
    private int field_x;
    static int[] field_u;

    private final dl h(int param0) {
        if (!(0 >= this.field_t)) {
            return rf.field_C;
        }
        if (this.field_t < param0) {
            return qi.field_a;
        }
        if (!(this.field_C <= 0)) {
            return ba.field_j;
        }
        return ln.field_d;
    }

    public static void b(boolean param0) {
        field_u = null;
        field_v = null;
        field_A = null;
        if (param0) {
            return;
        }
        field_z = (int[][]) null;
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        f discarded$1 = null;
        RuntimeException var5 = null;
        f var5_ref = null;
        de var6 = null;
        int var7 = 0;
        f stackIn_16_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        f stackOut_15_0 = null;
        Object stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            var5_ref = this.field_l;
            L1: while (true) {
              L2: {
                if (var5_ref instanceof de) {
                  var6 = (de) ((Object) var5_ref);
                  if (var6.field_j == null) {
                    L3: {
                      if (!vh.field_a) {
                        break L3;
                      } else {
                        if ((uo.field_o ^ -1) != -5) {
                          break L3;
                        } else {
                          L4: {
                            if (w.field_f + 2 != param1) {
                              break L4;
                            } else {
                              if (12 + ia.field_i == param0) {
                                va.field_c = 1;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (w.field_f + 2 != param1) {
                            break L3;
                          } else {
                            if (ia.field_i + 27 != param0) {
                              break L3;
                            } else {
                              va.field_c = 2;
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    wd.field_j = wd.field_j + 1;
                    mb.field_g = mb.field_g + ob.field_l;
                    fp.field_a = fp.field_a + 256;
                    je.field_j = je.field_j + 128;
                    we.field_h = we.field_h + 256;
                    b.field_a = b.field_a + 128;
                    ua.field_a.a(256, param1 * 12, 12 * param0, 0, (byte) -111);
                    this.field_B = false;
                    var6.field_j = (ea) (this);
                    stackOut_15_0 = this.a(param2, param0, (f) (this), 11460, param1);
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L2;
                  }
                } else {
                  if (var5_ref instanceof pn) {
                    var5_ref = ((pn) ((Object) var5_ref)).field_l;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                if (param3 >= 120) {
                  break L5;
                } else {
                  discarded$1 = this.e(-51, 45, (f[][]) null, -88);
                  break L5;
                }
              }
              stackOut_22_0 = this;
              stackIn_23_0 = stackOut_22_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("cd.OA(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          return (f) (this);
        }
    }

    final void a(int param0, DataInputStream param1, int param2, byte param3, int param4) throws IOException {
        int var6_int = 0;
        int var7 = 0;
        try {
            var6_int = param1.readUnsignedByte();
            if (param3 >= -69) {
                this.field_w = 52;
            }
            this.field_t = mo.field_h[3 & var6_int];
            this.field_C = kl.field_S[3 & var6_int];
            var7 = (var6_int >> -113979391 & 2) - 1;
            this.field_y = var7 * -this.field_t;
            this.field_x = this.field_C * var7;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "cd.JC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        L0: {
          if (!this.field_B) {
            break L0;
          } else {
            this.a(0.0, param3, 1, param2, param4, -72, param1);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((param2 ^ -1) != -25) {
              break L2;
            } else {
              if ((param3 ^ -1) == -25) {
                qj.field_b.a(param1, -param3 + param4);
                if (param0) {
                  this.i(param5 + -4261).a(param1, param4 - param3);
                  this.h(0).a(param1, param4 + -param3);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L2;
              }
            }
          }
          qj.field_b.b(param1, param4 - param3, param2 * 2, 3 * param3);
          if (!param0) {
            break L1;
          } else {
            this.i(0).b(param1, -param3 + param4, 2 * param2, 3 * param3);
            this.h(param5 ^ 4261).b(param1, param4 - param3, 2 * param2, 3 * param3);
            break L1;
          }
        }
        if (param5 != 4261) {
          return;
        } else {
          L3: {
            if (!this.field_B) {
              break L3;
            } else {
              this.a(1.5707963267948966, param3, -1, param2, param4, -114, param1);
              break L3;
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int[] param15, int param16) {
        RuntimeException var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var42 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (0 > param4) {
                break L1;
              } else {
                if (param2 >= nb.field_b) {
                  break L1;
                } else {
                  L2: {
                    if (-1 >= (param0 ^ -1)) {
                      break L2;
                    } else {
                      if (-1 >= (param13 ^ -1)) {
                        break L2;
                      } else {
                        if (0 > param6) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param0 < nb.field_d) {
                      break L3;
                    } else {
                      if (nb.field_d > param13) {
                        break L3;
                      } else {
                        if (nb.field_d <= param6) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param14 == 2) {
                      break L4;
                    } else {
                      cd.e((byte) -92);
                      break L4;
                    }
                  }
                  L5: {
                    var34 = param4 - param2;
                    if (param2 == param8) {
                      L6: {
                        if (param2 == param4) {
                          var24 = 0;
                          var28 = 0;
                          var17_int = param0 << -234334256;
                          var31 = 0;
                          var22 = param5;
                          var29 = param7;
                          var25 = param16;
                          var30 = param3;
                          var23 = 0;
                          var19 = 0;
                          var27 = 0;
                          var20 = 0;
                          var26 = param9;
                          var21 = param10;
                          var32 = 0;
                          var18 = param13 << 2068156528;
                          break L6;
                        } else {
                          var35 = param4 + -param8;
                          if (param13 > param0) {
                            var29 = param7 << 440519088;
                            var20 = (param6 - param13 << 649987376) / var35;
                            var26 = param9 << 1160139760;
                            var23 = (-param10 + param12 << -1507449392) / var34;
                            var31 = (-param7 + param1 << 1644814000) / var34;
                            var21 = param10 << -2136066000;
                            var25 = param16 << -478261072;
                            var27 = (param11 - param16 << 1099394512) / var34;
                            var22 = param5 << -2097269168;
                            var19 = (-param0 + param6 << 958941168) / var34;
                            var30 = param3 << 1812038288;
                            var18 = param13 << -1988564368;
                            var17_int = param0 << -156493840;
                            var32 = (-param3 + param1 << 1419188816) / var35;
                            var24 = (param12 + -param5 << -996273936) / var35;
                            var28 = (param11 - param9 << -1983302448) / var35;
                            break L6;
                          } else {
                            var24 = (-param10 + param12 << 1986306224) / var34;
                            var29 = param3 << -958257136;
                            var26 = param16 << 598671696;
                            var32 = (-param7 + param1 << -698323152) / var34;
                            var17_int = param13 << 1257368752;
                            var23 = (-param5 + param12 << 1905544688) / var35;
                            var18 = param0 << 1691202544;
                            var21 = param5 << 1349582000;
                            var31 = (-param3 + param1 << 609065712) / var35;
                            var27 = (-param9 + param11 << -1189486128) / var35;
                            var20 = (param6 - param0 << 811079664) / var34;
                            var19 = (param6 + -param13 << 568916656) / var35;
                            var30 = param7 << 825563696;
                            var25 = param9 << -2106505776;
                            var28 = (param11 - param16 << -1993504112) / var34;
                            var22 = param10 << 1412816624;
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (param2 < 0) {
                          param2 = Math.min(-param2, param8 - param2);
                          var25 = var25 + var27 * param2;
                          var22 = var22 + param2 * var24;
                          var18 = var18 + param2 * var20;
                          var29 = var29 + param2 * var31;
                          var21 = var21 + var23 * param2;
                          var30 = var30 + param2 * var32;
                          var17_int = var17_int + var19 * param2;
                          var26 = var26 + param2 * var28;
                          param2 = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var33 = 0;
                      break L5;
                    } else {
                      L8: {
                        var26 = param16 << 942910160;
                        var25 = param16 << 942910160;
                        var18 = param0 << -536648880;
                        var17_int = param0 << -536648880;
                        var30 = param7 << 1189275536;
                        var29 = param7 << 1189275536;
                        var22 = param10 << 1910417200;
                        var21 = param10 << 1910417200;
                        var35 = param8 - param2;
                        var20 = (param6 - param0 << -440338384) / var34;
                        var19 = (-param0 + param13 << -364161072) / var35;
                        if (var20 <= var19) {
                          var33 = 1;
                          var32 = (-param7 + param3 << -1013333552) / var35;
                          var31 = (-param7 + param1 << 927505872) / var34;
                          var28 = (-param16 + param9 << -617375376) / var35;
                          var23 = (param12 - param10 << 1840271184) / var34;
                          var27 = (param11 - param16 << 143982096) / var34;
                          var24 = (-param10 + param5 << 322539152) / var35;
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          break L8;
                        } else {
                          var33 = 0;
                          var27 = (param9 + -param16 << 1151134064) / var35;
                          var31 = (-param7 + param3 << -1076413584) / var35;
                          var32 = (param1 - param7 << -234992176) / var34;
                          var23 = (-param10 + param5 << -1140930608) / var35;
                          var24 = (param12 + -param10 << 1580910352) / var34;
                          var28 = (param11 - param16 << -941988208) / var34;
                          break L8;
                        }
                      }
                      L9: {
                        L10: {
                          if (param2 >= 0) {
                            break L10;
                          } else {
                            if (param8 < 0) {
                              param2 = param8 + -param2;
                              var21 = var21 + var23 * param2;
                              var25 = var25 + param2 * var27;
                              var17_int = var17_int + var19 * param2;
                              var30 = var30 + var32 * param2;
                              var29 = var29 + param2 * var31;
                              var26 = var26 + var28 * param2;
                              var18 = var18 + var20 * param2;
                              var22 = var22 + param2 * var24;
                              param2 = param8;
                              break L9;
                            } else {
                              param2 = -param2;
                              var25 = var25 + param2 * var27;
                              var22 = var22 + param2 * var24;
                              var30 = var30 + var32 * param2;
                              var18 = var18 + param2 * var20;
                              var21 = var21 + var23 * param2;
                              var17_int = var17_int + var19 * param2;
                              var29 = var29 + var31 * param2;
                              var26 = var26 + param2 * var28;
                              param2 = 0;
                              break L10;
                            }
                          }
                        }
                        var36 = nb.field_a[param2];
                        L11: while (true) {
                          if (param2 >= param8) {
                            break L9;
                          } else {
                            L12: {
                              var37 = var17_int >> 2021516944;
                              if (var37 >= nb.field_d) {
                                break L12;
                              } else {
                                var38 = (var18 >> 1016759280) - (var17_int >> -976943344);
                                if (-1 != (var38 ^ -1)) {
                                  L13: {
                                    var39 = (var22 - var21) / var38;
                                    var40 = (-var25 + var26) / var38;
                                    var41 = (-var29 + var30) / var38;
                                    if (var37 - -var38 < nb.field_d) {
                                      break L13;
                                    } else {
                                      var38 = -1 + nb.field_d - var37;
                                      break L13;
                                    }
                                  }
                                  if ((var37 ^ -1) > -1) {
                                    w.a(-(var39 * var37) + var21, (byte) -52, param15, var40, -(var37 * var40) + var25, var41, var39, var29 - var41 * var37, var37 + var38, var36);
                                    break L12;
                                  } else {
                                    w.a(var21, (byte) -52, param15, var40, var25, var41, var39, var29, var38, var37 + var36);
                                    break L12;
                                  }
                                } else {
                                  if (var37 < 0) {
                                    break L12;
                                  } else {
                                    if (var37 < nb.field_d) {
                                      w.a(var21, (byte) -52, param15, 0, var25, 0, 0, var29, var38, var37 + var36);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            param2++;
                            if (nb.field_b <= param2) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var30 = var30 + var32;
                              var29 = var29 + var31;
                              var17_int = var17_int + var19;
                              var25 = var25 + var27;
                              var22 = var22 + var24;
                              var18 = var18 + var20;
                              var36 = var36 + kh.field_l;
                              var26 = var26 + var28;
                              var21 = var21 + var23;
                              continue L11;
                            }
                          }
                        }
                      }
                      var36 = param4 - param8;
                      if (var36 == 0) {
                        var28 = 0;
                        var20 = 0;
                        var31 = 0;
                        var19 = 0;
                        var24 = 0;
                        var32 = 0;
                        var27 = 0;
                        var23 = 0;
                        break L5;
                      } else {
                        L14: {
                          var37 = param6 << -1190553872;
                          var38 = param12 << 2109592176;
                          var39 = param11 << -1892900976;
                          if (var33 == 0) {
                            var29 = param3 << -2043655664;
                            var21 = param5 << 907583152;
                            var17_int = param13 << 1921685328;
                            var25 = param9 << 1663306128;
                            break L14;
                          } else {
                            var30 = param3 << 1793408176;
                            var18 = param13 << 281083920;
                            var26 = param9 << 345094960;
                            var22 = param5 << -1799047504;
                            break L14;
                          }
                        }
                        var40 = param1 << 83775760;
                        var19 = (var37 + -var17_int) / var36;
                        var24 = (var38 - var22) / var36;
                        var28 = (-var26 + var39) / var36;
                        var32 = (var40 - var30) / var36;
                        var31 = (-var29 + var40) / var36;
                        var20 = (var37 - var18) / var36;
                        var27 = (-var25 + var39) / var36;
                        var23 = (-var21 + var38) / var36;
                        break L5;
                      }
                    }
                  }
                  L15: {
                    if (param2 >= 0) {
                      break L15;
                    } else {
                      param2 = -param2;
                      var30 = var30 + var32 * param2;
                      var17_int = var17_int + var19 * param2;
                      var25 = var25 + var27 * param2;
                      var18 = var18 + var20 * param2;
                      var29 = var29 + param2 * var31;
                      var21 = var21 + var23 * param2;
                      var22 = var22 + var24 * param2;
                      var26 = var26 + var28 * param2;
                      param2 = 0;
                      break L15;
                    }
                  }
                  var35 = nb.field_a[param2];
                  L16: while (true) {
                    if (param4 <= param2) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L17: {
                        var36 = var17_int >> -657143760;
                        if (var36 >= nb.field_d) {
                          break L17;
                        } else {
                          var37 = (var18 >> 562565104) + -(var17_int >> -343370928);
                          if (var37 == 0) {
                            if (var36 < 0) {
                              break L17;
                            } else {
                              if (var36 < nb.field_d) {
                                w.a(var21, (byte) -52, param15, 0, var25, 0, 0, var29, var37, var35 + var36);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          } else {
                            L18: {
                              var38 = (-var21 + var22) / var37;
                              var39 = (-var25 + var26) / var37;
                              var40 = (var30 + -var29) / var37;
                              if (var36 - -var37 < nb.field_d) {
                                break L18;
                              } else {
                                var37 = nb.field_d + (-var36 + -1);
                                break L18;
                              }
                            }
                            if ((var36 ^ -1) > -1) {
                              w.a(var21 + -(var36 * var38), (byte) -52, param15, var39, -(var39 * var36) + var25, var40, var38, -(var36 * var40) + var29, var37 + var36, var35);
                              break L17;
                            } else {
                              w.a(var21, (byte) -52, param15, var39, var25, var40, var38, var29, var37, var35 + var36);
                              break L17;
                            }
                          }
                        }
                      }
                      param2++;
                      if (nb.field_b > param2) {
                        var30 = var30 + var32;
                        var29 = var29 + var31;
                        var21 = var21 + var23;
                        var25 = var25 + var27;
                        var35 = var35 + kh.field_l;
                        var22 = var22 + var24;
                        var26 = var26 + var28;
                        var17_int = var17_int + var19;
                        var18 = var18 + var20;
                        continue L16;
                      } else {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var17 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) (var17);
            stackOut_76_1 = new StringBuilder().append("cd.HC(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param15 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L19;
            } else {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L19;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ',' + param16 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        RuntimeException runtimeException = null;
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
              if (param0 == -35) {
                break L1;
              } else {
                this.field_w = 37;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("cd.KC(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(CharSequence param0, byte param1) {
        boolean discarded$2 = false;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -92) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                discarded$2 = cd.a((CharSequence) null, (byte) 47);
                break L1;
              }
            }
            stackOut_2_0 = wi.a(48, 10, param0, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("cd.IC(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final boolean g(int param0) {
        boolean discarded$0 = false;
        if (param0 != 0) {
            CharSequence var3 = (CharSequence) null;
            discarded$0 = cd.a((CharSequence) null, (byte) 26);
            return false;
        }
        return false;
    }

    private final void a(double param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = -110 % ((param5 - 47) / 56);
        int var9 = param3 + param6 << 636417188;
        int var11 = (param4 << 295502244) - -(param1 << 965487939);
        double var12 = param0 + (double)(this.field_w + this.field_m) * 0.16534698176788384;
        int var14 = (int)(13.856406460551018 * (Math.sin(var12) * (double)param3));
        int var15 = (int)(13.856406460551018 * (Math.cos(var12) * (double)param1));
        int var16 = (this.field_x - this.field_y) * (this.field_C + this.field_t);
        kh.a(var9 + -(var14 * var16), var11 - var15 + (int)((double)param1 * 4.0) * param2, param3 << -1716186879, 15, f.field_c);
        kh.a(var16 * var14 + var9, (int)(4.0 * (double)param1) * param2 + (var11 - -var15), param3 << 1175657953, 15, f.field_c);
    }

    final f a(f[][] param0, int param1, f param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        f stackIn_14_0 = null;
        f stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        f stackOut_15_0 = null;
        f stackOut_13_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (ab.field_D != null) {
                break L1;
              } else {
                gl.field_e = gl.field_e - 1;
                if (param2 != null) {
                  var6_int = param2.a(false);
                  var7 = 0;
                  L2: while (true) {
                    if (3 <= var7) {
                      break L1;
                    } else {
                      L3: {
                        if (0 != (1 << var7 & var6_int)) {
                          q.field_a[var7].a(true, (byte) -125);
                          mb.field_g = mb.field_g + 250;
                          fn.field_j = fn.field_j + 300;
                          fn.field_j = fn.field_j - 50;
                          mb.field_g = mb.field_g - 50;
                          mb.field_g = mb.field_g - ob.field_l;
                          wd.field_j = wd.field_j - 1;
                          b.field_a = b.field_a - 1;
                          je.field_j = je.field_j - 1;
                          we.field_h = we.field_h - 1;
                          fp.field_a = fp.field_a - 2;
                          we.field_h = we.field_h + 40;
                          je.field_j = je.field_j + 20;
                          fp.field_a = fp.field_a + 40;
                          b.field_a = b.field_a + 20;
                          if (gl.field_e == 0) {
                            va.field_d = va.field_d | 1 << var7;
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            if (param3 == 11460) {
              stackOut_15_0 = this.field_l;
              stackIn_16_0 = stackOut_15_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_13_0 = (f) null;
              stackIn_14_0 = stackOut_13_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var6);
            stackOut_17_1 = new StringBuilder().append("cd.VA(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          return stackIn_16_0;
        }
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_2_0 = null;
        nj stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nj stackOut_3_0 = null;
        nj stackOut_1_0 = null;
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
            if (param0 == 23525) {
              stackOut_3_0 = ng.a(wd.field_h, param1, new cd(new kp(-1), 0, 0, 0, 0), (byte) -83, wg.field_N);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (nj) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("cd.V(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final dl i(int param0) {
        if (this.field_x >= 0) {
          if (-1 > (this.field_x ^ -1)) {
            return na.field_eb;
          } else {
            if (param0 > this.field_y) {
              return mk.field_a;
            } else {
              return tl.field_b;
            }
          }
        } else {
          return vp.field_d;
        }
    }

    final void c(boolean param0, boolean param1) {
        dl discarded$0 = null;
        if (!param0) {
            discarded$0 = this.i(-72);
        }
        if (param1) {
            return;
        }
        gl.field_e = gl.field_e + 1;
    }

    final f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        f stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              this.field_w = (this.field_w + 12) % 38;
              if (param4 == 17512) {
                break L1;
              } else {
                this.field_B = true;
                break L1;
              }
            }
            stackOut_2_0 = super.a(param0, param1, param2, param3, 17512, param5, param6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("cd.I(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    cd(f param0, int param1, int param2, int param3, int param4) {
        super(param0);
        try {
            this.field_t = param1;
            this.field_y = param4;
            this.field_x = param3;
            this.field_C = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "cd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void e(byte param0) {
        boolean discarded$0 = false;
        oi.field_d.field_j = 0;
        oi.field_d.field_p = 0;
        if (param0 > -29) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = cd.a((CharSequence) null, (byte) 43);
        }
    }

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        f discarded$2 = null;
        RuntimeException var7 = null;
        sl stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        sl stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              ck.field_db.a(64, param4 * 12, param1 * 12, 60, (byte) -111);
              if (!param2) {
                break L1;
              } else {
                discarded$2 = this.e(22, 29, (f[][]) null, 20);
                break L1;
              }
            }
            stackOut_2_0 = super.a(param0, param1, false, param3, param4, param5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("cd.R(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        sl discarded$1 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              this.field_B = false;
              var5_int = this.field_x;
              var6 = this.field_y;
              this.field_x = -this.field_t;
              this.field_y = -this.field_C;
              this.field_t = var5_int;
              this.field_C = var6;
              if (param0 == 1) {
                break L1;
              } else {
                this.field_x = -119;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (5 <= var7) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (param2[this.field_C + param1][param3 + this.field_t].a(16736352, param2, false, this.field_C, param1, param3, (ea) (this), this.field_t)) {
                  this.field_B = true;
                  discarded$1 = this.a(param2, param1, false, this.field_C, param3, this.field_t);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fn.field_j = fn.field_j - ob.field_l;
                  wd.field_j = wd.field_j + 1;
                  this.a((byte) 104, param2[this.field_C + param1][param3 - -this.field_t]);
                  var5_int = -this.field_x;
                  var6 = -this.field_y;
                  this.field_x = this.field_t;
                  this.field_y = this.field_C;
                  this.field_t = var5_int;
                  this.field_C = var6;
                  var7++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("cd.LA(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        f stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_3_0 = null;
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
              var5_int = 117 % ((-43 - param2) / 51);
              if ((this.field_o | this.field_s) != 0) {
                ck.field_db.a(64, 12 * param3 + this.field_m * this.field_o, 12 * param1 + this.field_s * this.field_m, 60, (byte) -111);
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_3_0 = super.b(param0, param1, (byte) -109, param3);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("cd.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final int a(boolean param0, int param1) {
        if (param1 != 0) {
            field_v = (int[]) null;
        }
        return 12;
    }

    static {
        field_A = "Mouse over an icon for details";
    }
}
