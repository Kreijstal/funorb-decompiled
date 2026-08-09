/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static String field_a;
    static String field_c;
    static bd[] field_b;

    final static void a(int param0, int param1, pf param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_16_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        u stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        u var21 = null;
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
        int[] var41 = null;
        pf var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        var40 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var44 = param2;
                if (null == var44.field_x) {
                  break L2;
                } else {
                  if ((var44.field_f ^ -1) >= -2) {
                    break L2;
                  } else {
                    var60 = var44.field_x;
                    jc.a(ke.field_z, 0, 0, var60, 8965);
                    break L1;
                  }
                }
              }
              jc.a(-122);
              break L1;
            }
            L3: {
              if (param4 == -536936193) {
                break L3;
              } else {
                field_b = (bd[]) null;
                break L3;
              }
            }
            var54 = new int[param2.field_L];
            var49 = var54;
            var41 = var49;
            var8 = var41;
            var64 = new int[param2.field_L];
            var62 = oa.field_c;
            var61 = in.field_c;
            var63 = dl.field_o;
            var13 = 0;
            L4: while (true) {
              if (param2.field_L <= var13) {
                var13 = 0;
                L5: while (true) {
                  if (var13 >= th.field_Lb) {
                    break L0;
                  } else {
                    L6: {
                      var14 = lh.field_d[var13];
                      var15 = param2.field_i[var14];
                      var16 = param2.field_P[var14];
                      var17 = param2.field_z[var14];
                      if (param2.field_m[var14] >= oa.field_c.length) {
                        stackIn_25_0 = -1;
                        break L6;
                      } else {
                        stackIn_25_0 = param2.field_m[var14];
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_25_0;
                      if (param2.field_y[var14] >= oa.field_c.length) {
                        stackIn_28_0 = -1;
                        break L7;
                      } else {
                        stackIn_28_0 = param2.field_y[var14];
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_28_0;
                      if (oa.field_c.length > param2.field_q[var14]) {
                        stackIn_31_0 = param2.field_q[var14];
                        break L8;
                      } else {
                        stackIn_31_0 = -1;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_31_0;
                        if (ce.field_f == null) {
                          break L10;
                        } else {
                          if (null == param2.field_g) {
                            break L10;
                          } else {
                            if (var14 >= param2.field_g.length) {
                              break L10;
                            } else {
                              if (0 == (param2.field_g[var14] ^ -1)) {
                                break L10;
                              } else {
                                if (ce.field_f.length > param2.field_g[var14]) {
                                  stackIn_39_0 = ce.field_f[param2.field_g[var14]];
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_39_0 = null;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21 = stackIn_39_0;
                        var22 = tb.field_K[var15];
                        var23 = lc.field_c[var15];
                        var24 = tb.field_K[var16];
                        var25 = lc.field_c[var16];
                        var26 = tb.field_K[var17];
                        var27 = lc.field_c[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var20 == var19) {
                            L13: {
                              var28 = var54[var18];
                              var29 = var64[var18];
                              if (var21 != null) {
                                stackIn_49_0 = var21.field_i;
                                break L13;
                              } else {
                                stackIn_49_0 = 8355711;
                                break L13;
                              }
                            }
                            var30 = stackIn_49_0;
                            var31 = 16711935 & var30;
                            var32 = var30 & 65280;
                            var33 = (var32 * var28 & 16711842) >>> -340125496 | (var31 * var28 & -16711843) >>> 2037412424;
                            var33 = var33 + 65793 * var29;
                            oe.a(var22, (byte) -121, var23, var26, 8355711 & var33 >> 946791137, var25, var27, var24);
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 != null) {
                          stackIn_45_0 = var21.field_i;
                          break L14;
                        } else {
                          stackIn_45_0 = 8355711;
                          break L14;
                        }
                      }
                      var34 = stackIn_45_0;
                      var35 = var34 & 16711935;
                      var36 = var34 & 65280;
                      var37 = var28 * var35 >>> 818058440 & 738132223 | -1207894272 & var36 * var28 >>> -1896549880;
                      var38 = (var35 * var29 & -16711797) >>> -1425123416 | (16711793 & var29 * var36) >>> -1059380152;
                      var37 = var37 + var31 * 65793;
                      var38 = var38 + 65793 * var32;
                      var39 = var30 * var35 >>> -238162584 & -536936193 | 1040252672 & var30 * var36 >>> -2020918872;
                      var39 = var39 + var33 * 65793;
                      ml.a(var25, var39 >> -136356720, var22, var37 & 255, 255 & var38 >> -537693208, var39 & 255, var27, var37 >> -767347920, var23, 255 & var38, var24, (var37 & 65322) >> 71356424, 255 & var39 >> 303590312, var38 >> -1483402896, false, var26);
                      break L11;
                    }
                    var13++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = param1 * var61[var13] + var62[var13] * param5 + var63[var13] * param0 >> -157769848;
                  if ((var14 ^ -1) <= -1) {
                    break L15;
                  } else {
                    var14 = -var14;
                    break L15;
                  }
                }
                L16: {
                  if (-1 < (var14 ^ -1)) {
                    stackIn_16_0 = 128;
                    break L16;
                  } else {
                    if (-129 < (var14 ^ -1)) {
                      stackIn_16_0 = var14 + 128;
                      break L16;
                    } else {
                      stackIn_16_0 = 256;
                      break L16;
                    }
                  }
                }
                L17: {
                  var14 = stackIn_16_0;
                  var15 = param7 * var63[var13] + param3 * var62[var13] - -(param6 * var61[var13]) >> -384152248;
                  stackIn_18_0 = pk.field_i;

                  if ((var15 ^ -1) > -1) {
                    stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                    stackIn_19_1 = -var15;
                    break L17;
                  } else {
                    stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                    stackIn_19_1 = var15;
                    break L17;
                  }
                }
                var15 = stackIn_19_0[stackIn_19_1];
                var14 = (-var15 + 256) * var14 >>> 1521298344;
                var54[var13] = var14;
                var64[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8_ref = decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var8_ref);

            stackIn_54_1 = new StringBuilder().append("di.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L18;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L18;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 <= 51) {
            pf var2 = (pf) null;
            di.a(34, -107, (pf) null, 22, 29, -106, 117, -16);
        }
    }

    final static int a(double param0, int param1, double param2, double param3) {
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 90 / ((param1 - 85) / 37);
              param3 = param3 * 0.02454369260617026;
              var8 = -Math.sin(param3);
              var10 = -Math.cos(param3);
              var12 = (int)param2;
              if ((double)var12 > param2) {
                var12--;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var13 = (int)param0;
              if ((double)var13 <= param0) {
                break L2;
              } else {
                var13--;
                break L2;
              }
            }
            param2 = param2 - (double)var12;
            param0 = param0 - (double)var13;
            var14 = var12;
            var15 = var13;
            var16 = var12 + var13 * ln.field_a.field_d;
            L3: while (true) {
              if ((ln.field_a.field_c[var16] ^ -1) == -3) {
                if (var12 != var14) {
                  if (var15 != var13) {
                    L4: {
                      if (var12 <= var14) {
                        L5: {
                          if (0.0 >= var10) {
                            break L5;
                          } else {
                            if (2 == ln.field_a.field_c[-ln.field_a.field_d + var16]) {
                              stackIn_48_0 = 64;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (var10 >= 0.0) {
                          break L4;
                        } else {
                          if (ln.field_a.field_c[ln.field_a.field_d + var16] == 2) {
                            stackIn_53_0 = 64;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        L6: {
                          if (var10 <= 0.0) {
                            break L6;
                          } else {
                            if ((ln.field_a.field_c[-ln.field_a.field_d + var16] ^ -1) == -3) {
                              stackIn_39_0 = 192;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (0.0 <= var10) {
                          break L4;
                        } else {
                          if ((ln.field_a.field_c[var16 + ln.field_a.field_d] ^ -1) != -3) {
                            break L4;
                          } else {
                            stackIn_43_0 = 192;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        }
                      }
                    }
                    L7: {
                      if (var15 >= var13) {
                        L8: {
                          if (0.0 <= var8) {
                            break L8;
                          } else {
                            if (-3 == (ln.field_a.field_c[var16 + 1] ^ -1)) {
                              stackIn_69_0 = 0;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (var8 <= 0.0) {
                          break L7;
                        } else {
                          if (ln.field_a.field_c[var16 - 1] == 2) {
                            stackIn_74_0 = 0;
                            decompiledRegionSelector0 = 10;
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        L9: {
                          if (0.0 <= var8) {
                            break L9;
                          } else {
                            if (-3 == (ln.field_a.field_c[var16 - -1] ^ -1)) {
                              stackIn_59_0 = 128;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (0.0 >= var8) {
                          break L7;
                        } else {
                          if ((ln.field_a.field_c[-1 + var16] ^ -1) == -3) {
                            stackIn_64_0 = 128;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (var12 <= var14) {
                      L10: {
                        if (var15 < var13) {
                          stackIn_83_0 = 96;
                          break L10;
                        } else {
                          stackIn_83_0 = 32;
                          break L10;
                        }
                      }
                      decompiledRegionSelector0 = 12;
                      break L0;
                    } else {
                      L11: {
                        if (var13 <= var15) {
                          stackIn_79_0 = 224;
                          break L11;
                        } else {
                          stackIn_79_0 = 160;
                          break L11;
                        }
                      }
                      decompiledRegionSelector0 = 11;
                      break L0;
                    }
                  } else {
                    L12: {
                      if (var12 > var14) {
                        stackIn_33_0 = 192;
                        break L12;
                      } else {
                        stackIn_33_0 = 64;
                        break L12;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L13: {
                    if (var15 < var13) {
                      stackIn_28_0 = 128;
                      break L13;
                    } else {
                      stackIn_28_0 = 0;
                      break L13;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L14: {
                  var12 = var14;
                  var13 = var15;
                  param2 = param2 + var8;
                  param0 = param0 + var10;
                  if (1.0 > param2) {
                    if (0.0 > param2) {
                      param2 = param2 + 1.0;
                      var14--;
                      var16--;
                      break L14;
                    } else {
                      break L14;
                    }
                  } else {
                    var14++;
                    param2 = param2 - 1.0;
                    var16++;
                    break L14;
                  }
                }
                L15: {
                  if (1.0 > param0) {
                    if (0.0 <= param0) {
                      break L15;
                    } else {
                      param0 = param0 + 1.0;
                      var16 = var16 - ln.field_a.field_d;
                      var15--;
                      break L15;
                    }
                  } else {
                    var15++;
                    var16 = var16 + ln.field_a.field_d;
                    param0 = param0 - 1.0;
                    break L15;
                  }
                }
                L16: {
                  if (ln.field_a.field_d <= var14) {
                    break L16;
                  } else {
                    if ((var14 ^ -1) > -1) {
                      break L16;
                    } else {
                      if (var15 >= ln.field_a.field_a) {
                        break L16;
                      } else {
                        if ((var15 ^ -1) <= -1) {
                          continue L3;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                }
                stackIn_23_0 = 128;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var7), "di.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_23_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_28_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_33_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_39_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_43_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_48_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_53_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_59_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_64_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_69_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_74_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_79_0;
                              } else {
                                return stackIn_83_0;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_a = "Visit the Account Management section on the main site to view.";
        field_c = "<col=ffffff>Rocket<nbsp>launcher</col><br>The rocket launcher fires electromagnetic pulse (EMP) rockets that instantly disable electrical equipment. The blast is also effective against groups of organic targets.";
    }
}
