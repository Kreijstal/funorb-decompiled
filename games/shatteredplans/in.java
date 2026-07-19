/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    private df[] field_b;
    private df field_h;
    private int field_k;
    private int field_c;
    private df field_j;
    private long field_d;
    static bi field_i;
    static String field_l;
    static String field_e;
    static String field_a;
    static km field_g;
    static bi field_f;

    final df b(byte param0) {
        int fieldTemp$2 = 0;
        df var2 = null;
        int var3 = 0;
        Object var4 = null;
        df var4_ref = null;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if (this.field_c <= 0) {
            break L0;
          } else {
            if (this.field_b[this.field_c - 1] != this.field_h) {
              var2 = this.field_h;
              this.field_h = var2.field_h;
              return var2;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (this.field_k <= this.field_c) {
            if (param0 == -107) {
              return null;
            } else {
              return (df) null;
            }
          } else {
            fieldTemp$2 = this.field_c;
            this.field_c = this.field_c + 1;
            var4_ref = this.field_b[fieldTemp$2].field_h;
            var2 = var4_ref;
            if (var4_ref == this.field_b[this.field_c - 1]) {
              continue L1;
            } else {
              this.field_h = var2.field_h;
              return var2;
            }
          }
        }
    }

    final static th a(int param0, byte[] param1) {
        th var2 = null;
        RuntimeException var2_ref = null;
        th stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        th stackOut_5_0 = null;
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
            if (param1 != null) {
              L1: {
                if (param0 == 15) {
                  break L1;
                } else {
                  field_f = (bi) null;
                  break L1;
                }
              }
              var2 = new th(param1, cf.field_H, sj.field_a, mc.field_s, cm.field_g, eo.field_fb, hd.field_q);
              pd.a(param0 + -15);
              stackOut_5_0 = (th) (var2);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("in.D(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        var24 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > param3) {
                var6_int = param3;
                param3 = param1;
                param1 = var6_int;
                var6_int = param5;
                param5 = param4;
                param4 = var6_int;
                break L1;
              } else {
                break L1;
              }
            }
            var6_int = -param4 + param5;
            var7 = -param1 + param3;
            if (0 == var7) {
              L2: {
                if (16 <= var6_int) {
                  L3: {
                    var8 = param4 >> 360551524;
                    var9 = param1 >> 589288420;
                    var10 = param0;
                    var11 = (16 - (15 & param4)) * (16 - (param1 & 15));
                    if (var8 < gf.field_i) {
                      break L3;
                    } else {
                      if (var8 >= gf.field_l) {
                        break L3;
                      } else {
                        if (var9 >= gf.field_a) {
                          if (var9 >= gf.field_f) {
                            break L3;
                          } else {
                            var11 = (int)(256.0 * Math.pow((double)var11 / 256.0, 0.55));
                            var12 = var10 & 65280;
                            var12 = var12 * var11;
                            var10 = var10 & 16711935;
                            var12 = var12 & 16711680;
                            var10 = var10 * var11;
                            var10 = var10 & -16711936;
                            var13 = 640 * var9 + var8;
                            var14 = gf.field_h[var13];
                            var10 = var10 + (-16711936 & (16711935 & var14) * (-var11 + 256));
                            var12 = var12 + (16711680 & (var14 & 65280) * (256 - var11));
                            gf.field_h[var13] = ee.a(var12, var10) >>> -1492722168;
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var8 = param5 >> -855772476;
                    var9 = param1 >> 758552420;
                    var10 = param0;
                    var11 = (param5 & 15) * (16 - (15 & param1));
                    if (gf.field_i <= var8) {
                      if (var8 < gf.field_l) {
                        if (var9 >= gf.field_a) {
                          if (gf.field_f > var9) {
                            var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                            var12 = 65280 & var10;
                            var12 = var12 * var11;
                            var10 = var10 & 16711935;
                            var10 = var10 * var11;
                            var12 = var12 & 16711680;
                            var10 = var10 & -16711936;
                            var13 = var8 + 640 * var9;
                            var14 = gf.field_h[var13];
                            var10 = var10 + (-16711936 & (16711935 & var14) * (256 + -var11));
                            var12 = var12 + (16711680 & (var14 & 65280) * (-var11 + 256));
                            gf.field_h[var13] = ee.a(var10, var12) >>> 1501776392;
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    gf.f((param4 >> 1853734596) + 1, param1 >> 660240292, (var6_int >> -675824156) + -2, param0, (16 + -(15 & param1)) * 16);
                    var8 = param4 >> 1456664228;
                    var9 = (param1 >> -2057509660) + 1;
                    var10 = param0;
                    var11 = (param4 & 15) * (16 + -(15 & param1));
                    if (gf.field_i > var8) {
                      break L5;
                    } else {
                      if (gf.field_l <= var8) {
                        break L5;
                      } else {
                        if (gf.field_a <= var9) {
                          if (gf.field_f > var9) {
                            var11 = (int)(256.0 * Math.pow((double)var11 / 256.0, 0.55));
                            var12 = 65280 & var10;
                            var10 = var10 & 16711935;
                            var12 = var12 * var11;
                            var12 = var12 & 16711680;
                            var10 = var10 * var11;
                            var10 = var10 & -16711936;
                            var13 = var9 * 640 - -var8;
                            var14 = gf.field_h[var13];
                            var10 = var10 + ((var14 & 16711935) * (-var11 + 256) & -16711936);
                            var12 = var12 + (16711680 & (-var11 + 256) * (65280 & var14));
                            gf.field_h[var13] = ee.a(var10, var12) >>> 1753470984;
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L6: {
                    var8 = param5 >> -1885786620;
                    var9 = 1 + (param1 >> 1146853508);
                    var10 = param0;
                    var11 = (15 & param4) * (15 & param3);
                    if (var8 >= gf.field_i) {
                      if (gf.field_l <= var8) {
                        break L6;
                      } else {
                        if (gf.field_a <= var9) {
                          if (gf.field_f <= var9) {
                            break L6;
                          } else {
                            var11 = (int)(256.0 * Math.pow((double)var11 / 256.0, 0.55));
                            var12 = 65280 & var10;
                            var10 = var10 & 16711935;
                            var12 = var12 * var11;
                            var10 = var10 * var11;
                            var12 = var12 & 16711680;
                            var10 = var10 & -16711936;
                            var13 = var9 * 640 - -var8;
                            var14 = gf.field_h[var13];
                            var10 = var10 + ((256 - var11) * (var14 & 16711935) & -16711936);
                            var12 = var12 + ((-var11 + 256) * (var14 & 65280) & 16711680);
                            gf.field_h[var13] = ee.a(var12, var10) >>> -1616213592;
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                  gf.f((param4 >> -472767452) + 1, (param1 >> 1331313156) + 1, -2 + (var6_int >> -1029090044), param0, 16 * (15 & param1));
                  break L2;
                } else {
                  L7: {
                    var8 = param4 >> 1386008708;
                    var9 = param1 >> 471968004;
                    var10 = param0;
                    var11 = (16 - (param1 & 15)) * var6_int;
                    if (var8 < gf.field_i) {
                      break L7;
                    } else {
                      if (var8 < gf.field_l) {
                        if (gf.field_a <= var9) {
                          if (gf.field_f > var9) {
                            var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                            var12 = 65280 & var10;
                            var10 = var10 & 16711935;
                            var12 = var12 * var11;
                            var10 = var10 * var11;
                            var12 = var12 & 16711680;
                            var10 = var10 & -16711936;
                            var13 = 640 * var9 - -var8;
                            var14 = gf.field_h[var13];
                            var12 = var12 + (16711680 & (65280 & var14) * (256 - var11));
                            var10 = var10 + ((16711935 & var14) * (-var11 + 256) & -16711936);
                            gf.field_h[var13] = ee.a(var12, var10) >>> 1342250728;
                            break L7;
                          } else {
                            break L7;
                          }
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  var8 = param4 >> 1963383812;
                  var9 = (param1 >> 1018799748) - -1;
                  var10 = param0;
                  var11 = var6_int * (param1 & 15);
                  if (var8 < gf.field_i) {
                    break L2;
                  } else {
                    if (var8 >= gf.field_l) {
                      break L2;
                    } else {
                      if (var9 < gf.field_a) {
                        break L2;
                      } else {
                        if (var9 < gf.field_f) {
                          var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                          var12 = 65280 & var10;
                          var10 = var10 & 16711935;
                          var12 = var12 * var11;
                          var12 = var12 & 16711680;
                          var10 = var10 * var11;
                          var10 = var10 & -16711936;
                          var13 = var8 + 640 * var9;
                          var14 = gf.field_h[var13];
                          var12 = var12 + ((var14 & 65280) * (-var11 + 256) & 16711680);
                          var10 = var10 + ((16711935 & var14) * (-var11 + 256) & -16711936);
                          gf.field_h[var13] = ee.a(var10, var12) >>> 832307528;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L8: {
                var8 = (var6_int << -1474628724) / var7;
                var9 = param1 + 7 >> -214271420;
                var10 = ((var9 << 1183007268) + -param1) * var8 + (param4 << 663563724);
                var11 = -(7 + param1 & 15) + 16;
                var12 = var9;
                var13 = var10 >> -903576720;
                var14 = var13;
                var15 = var12;
                var16 = param0;
                var17 = (-((var10 & 65015) >> 1271598988) + 16) * var11;
                if (var14 < gf.field_i) {
                  break L8;
                } else {
                  if (gf.field_l <= var14) {
                    break L8;
                  } else {
                    if (gf.field_a <= var15) {
                      if (var15 >= gf.field_f) {
                        break L8;
                      } else {
                        var17 = (int)(256.0 * Math.pow((double)var17 / 256.0, 0.55));
                        var18 = var16 & 65280;
                        var16 = var16 & 16711935;
                        var18 = var18 * var17;
                        var16 = var16 * var17;
                        var18 = var18 & 16711680;
                        var16 = var16 & -16711936;
                        var19 = var15 * 640 + var14;
                        var20 = gf.field_h[var19];
                        var16 = var16 + ((16711935 & var20) * (-var17 + 256) & -16711936);
                        var18 = var18 + ((-var17 + 256) * (65280 & var20) & 16711680);
                        gf.field_h[var19] = ee.a(var16, var18) >>> 1508401288;
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                }
              }
              L9: {
                var14 = 1 + var13;
                var16 = 57 / ((param2 - 20) / 42);
                var15 = var12;
                var17 = param0;
                var18 = var11 * (15 & var10 >> -568214100);
                if (var14 < gf.field_i) {
                  break L9;
                } else {
                  if (var14 >= gf.field_l) {
                    break L9;
                  } else {
                    if (gf.field_a <= var15) {
                      if (gf.field_f > var15) {
                        var18 = (int)(Math.pow((double)var18 / 256.0, 0.55) * 256.0);
                        var19 = var17 & 65280;
                        var19 = var19 * var18;
                        var17 = var17 & 16711935;
                        var17 = var17 * var18;
                        var19 = var19 & 16711680;
                        var17 = var17 & -16711936;
                        var20 = var15 * 640 - -var14;
                        var21 = gf.field_h[var20];
                        var17 = var17 + (-16711936 & (var21 & 16711935) * (256 + -var18));
                        var19 = var19 + ((-var18 + 256) * (65280 & var21) & 16711680);
                        gf.field_h[var20] = ee.a(var19, var17) >>> -939875448;
                        break L9;
                      } else {
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                }
              }
              L10: {
                var9 = param3 - -7 >> 1563551044;
                var14 = var10 + var8;
                var10 = (param5 << 1608868332) - -((-param3 + (var9 << 1774916068)) * var8);
                var11 = -(param3 - -7 & 15) + 16;
                var15 = var10 >> 1667274416;
                var16 = var9;
                var17 = var15;
                var18 = var16;
                var19 = param0;
                var20 = (16 + -((63052 & var10) >> 118690732)) * var11;
                if (var17 >= gf.field_i) {
                  if (gf.field_l <= var17) {
                    break L10;
                  } else {
                    if (var18 < gf.field_a) {
                      break L10;
                    } else {
                      if (gf.field_f > var18) {
                        var20 = (int)(256.0 * Math.pow((double)var20 / 256.0, 0.55));
                        var21 = var19 & 65280;
                        var21 = var21 * var20;
                        var19 = var19 & 16711935;
                        var21 = var21 & 16711680;
                        var19 = var19 * var20;
                        var19 = var19 & -16711936;
                        var22 = 640 * var18 + var17;
                        var23 = gf.field_h[var22];
                        var19 = var19 + ((var23 & 16711935) * (256 + -var20) & -16711936);
                        var21 = var21 + ((-var20 + 256) * (var23 & 65280) & 16711680);
                        gf.field_h[var22] = ee.a(var19, var21) >>> 85492616;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                var17 = 1 + var15;
                var18 = var16;
                var19 = param0;
                var20 = var11 * (15 & var10 >> 845627052);
                if (var17 >= gf.field_i) {
                  if (gf.field_l > var17) {
                    if (gf.field_a <= var18) {
                      if (gf.field_f > var18) {
                        var20 = (int)(Math.pow((double)var20 / 256.0, 0.55) * 256.0);
                        var21 = var19 & 65280;
                        var21 = var21 * var20;
                        var19 = var19 & 16711935;
                        var19 = var19 * var20;
                        var21 = var21 & 16711680;
                        var19 = var19 & -16711936;
                        var22 = var17 + 640 * var18;
                        var23 = gf.field_h[var22];
                        var19 = var19 + ((-var20 + 256) * (var23 & 16711935) & -16711936);
                        var21 = var21 + ((var23 & 65280) * (256 + -var20) & 16711680);
                        gf.field_h[var22] = ee.a(var21, var19) >>> 1639003880;
                        break L11;
                      } else {
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
              var8 = var8 << 4;
              var12++;
              L12: while (true) {
                if (var16 <= var12) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L13: {
                    var17 = var14 >> 527584208;
                    var18 = var12;
                    var19 = param0;
                    var20 = 256 - (var14 >> -1937339224 & 255);
                    if (var17 >= gf.field_i) {
                      if (gf.field_l > var17) {
                        if (var18 >= gf.field_a) {
                          if (gf.field_f > var18) {
                            var20 = (int)(256.0 * Math.pow((double)var20 / 256.0, 0.55));
                            var21 = 65280 & var19;
                            var19 = var19 & 16711935;
                            var21 = var21 * var20;
                            var19 = var19 * var20;
                            var21 = var21 & 16711680;
                            var19 = var19 & -16711936;
                            var22 = var17 + 640 * var18;
                            var23 = gf.field_h[var22];
                            var19 = var19 + (-16711936 & (16711935 & var23) * (256 + -var20));
                            var21 = var21 + ((65280 & var23) * (256 + -var20) & 16711680);
                            gf.field_h[var22] = ee.a(var19, var21) >>> 1742600584;
                            break L13;
                          } else {
                            break L13;
                          }
                        } else {
                          break L13;
                        }
                      } else {
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    var17 = (var14 >> 984198704) + 1;
                    var18 = var12;
                    var19 = param0;
                    var20 = 255 & var14 >> -1799633304;
                    if (gf.field_i > var17) {
                      break L14;
                    } else {
                      if (var17 >= gf.field_l) {
                        break L14;
                      } else {
                        if (gf.field_a <= var18) {
                          if (var18 >= gf.field_f) {
                            break L14;
                          } else {
                            var20 = (int)(256.0 * Math.pow((double)var20 / 256.0, 0.55));
                            var21 = 65280 & var19;
                            var21 = var21 * var20;
                            var19 = var19 & 16711935;
                            var19 = var19 * var20;
                            var21 = var21 & 16711680;
                            var19 = var19 & -16711936;
                            var22 = var18 * 640 + var17;
                            var23 = gf.field_h[var22];
                            var21 = var21 + (16711680 & (-var20 + 256) * (var23 & 65280));
                            var19 = var19 + ((var23 & 16711935) * (-var20 + 256) & -16711936);
                            gf.field_h[var22] = ee.a(var21, var19) >>> -2061934456;
                            break L14;
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  var14 = var14 + var8;
                  var12++;
                  continue L12;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var6), "in.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static qh a(int param0, boolean param1) {
        fe var2 = null;
        lp var3 = null;
        tq.field_j = new qh(320, -param0 + 479 - 28, 200, param0 - -28, ih.field_a.toUpperCase());
        if (!param1) {
          return (qh) null;
        } else {
          var2 = new fe(tq.field_j.field_k - -200 + -16, 2 + tq.field_j.field_t, 11, 11, -1, (bi) null, "X", 16711680);
          var2.field_h = tq.field_j;
          tq.field_j.a(var2, 8);
          var3 = new lp(tq.field_j.field_k - -9, tq.field_j.field_t + 20, 182, param0);
          tq.field_j.a(var3, 8);
          tq.field_j.field_z = var3;
          return tq.field_j;
        }
    }

    final void a(long param0, df param1, boolean param2) {
        df var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null != param1.field_j) {
                param1.a(16);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5 = this.field_b[(int)((long)(this.field_k - 1) & param0)];
              param1.field_j = var5.field_j;
              param1.field_h = var5;
              param1.field_j.field_h = param1;
              param1.field_h.field_j = param1;
              param1.field_l = param0;
              if (param2) {
                break L2;
              } else {
                this.field_j = (df) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5_ref);
            stackOut_6_1 = new StringBuilder().append("in.I(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final static qd a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            qd var5 = null;
            ge var5_ref = null;
            qd stackIn_2_0 = null;
            qd stackIn_4_0 = null;
            ge stackIn_6_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            qd stackOut_3_0 = null;
            qd stackOut_1_0 = null;
            ge stackOut_5_0 = null;
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
                try {
                  L1: {
                    var4 = Class.forName("bl");
                    if (param1 == 16) {
                      var5 = (qd) (var4.newInstance());
                      var5.a(param3, param0, (byte) -111, param2);
                      stackOut_3_0 = (qd) (var5);
                      stackIn_4_0 = stackOut_3_0;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackOut_1_0 = (qd) null;
                      stackIn_2_0 = stackOut_1_0;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new ge();
                  ((qd) ((Object) var5_ref)).a(param3, param0, (byte) -99, param2);
                  stackOut_5_0 = (ge) (var5_ref);
                  stackIn_6_0 = stackOut_5_0;
                  return (qd) ((Object) stackIn_6_0);
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) (var4_ref2);
                stackOut_7_1 = new StringBuilder().append("in.K(");
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L2;
                } else {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L2;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0;
            } else {
              return stackIn_4_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final df d(byte param0) {
        int var2 = 0;
        df var3 = null;
        df var4 = null;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 24 / ((-73 - param0) / 35);
        if (this.field_j != null) {
          var3 = this.field_b[(int)((long)(this.field_k + -1) & this.field_d)];
          L0: while (true) {
            if (this.field_j != var3) {
              if (this.field_j.field_l == this.field_d) {
                var4 = this.field_j;
                this.field_j = this.field_j.field_h;
                return var4;
              } else {
                this.field_j = this.field_j.field_h;
                continue L0;
              }
            } else {
              this.field_j = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0) {
        cp.field_a = new qr(0L, (qr) null);
        if (ns.field_pb) {
            cp.field_a.a(4, nm.field_c);
        }
        cp.field_a.a(4, lp.field_v);
        bc.field_g = new wh(ds.field_a, cp.field_a);
        if (param0 != -83) {
            field_i = (bi) null;
        }
        ia.field_j = new qr(0L, (qr) null);
        ia.field_j.a(param0 + 87, bc.field_g.field_d);
        ia.field_j.a(4, vm.field_Ab);
        tc.j(96);
    }

    final df c(byte param0) {
        if (param0 > -66) {
            this.field_c = -75;
        }
        this.field_c = 0;
        return this.b((byte) -107);
    }

    final df a(int param0, long param1) {
        df var4 = null;
        df var5 = null;
        int var6 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          this.field_d = param1;
          if (param0 == 65280) {
            break L0;
          } else {
            in.a(20, 67, -77, 2, 1, -87);
            break L0;
          }
        }
        var4 = this.field_b[(int)(param1 & (long)(-1 + this.field_k))];
        this.field_j = var4.field_h;
        L1: while (true) {
          if (var4 != this.field_j) {
            if (this.field_j.field_l == param1) {
              var5 = this.field_j;
              this.field_j = this.field_j.field_h;
              return var5;
            } else {
              this.field_j = this.field_j.field_h;
              continue L1;
            }
          } else {
            this.field_j = null;
            return null;
          }
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_e = null;
        if (!param0) {
            field_g = (km) null;
        }
        field_l = null;
        field_g = null;
        field_a = null;
        field_f = null;
    }

    in(int param0) {
        int var2 = 0;
        df dupTemp$0 = null;
        df var3 = null;
        this.field_c = 0;
        this.field_k = param0;
        this.field_b = new df[param0];
        for (var2 = 0; param0 > var2; var2++) {
            dupTemp$0 = new df();
            var3 = dupTemp$0;
            this.field_b[var2] = dupTemp$0;
            var3.field_h = var3;
            var3.field_j = var3;
        }
    }

    static {
        field_i = new bi(540, 140);
        field_l = "Connection lost. <%0>";
        field_e = "Capture all the systems on the map";
        field_a = "Failed attacks";
    }
}
