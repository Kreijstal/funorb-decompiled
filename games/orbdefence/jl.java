/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jl {
    static int field_d;
    static long[] field_b;
    private static int[] field_c;
    static String field_a;
    static String field_f;
    static String field_e;

    final static ba[] a(byte param0) {
        if (param0 <= 25) {
            field_e = null;
        }
        return new ba[]{rc.field_m, fb.field_i, ia.field_a, cj.field_a, aj.field_a, tl.field_c, hd.field_q, gl.field_j, id.field_a, jd.field_d, ol.field_f, ue.field_G, nd.field_e, bd.field_q};
    }

    abstract int b(int param0, int param1);

    abstract hd a(int param0);

    abstract byte[] a(int param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9) {
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
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
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        int stackIn_72_0 = 0;
        int[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int[] stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        int stackOut_70_0 = 0;
        int stackOut_71_0 = 0;
        L0: {
          L1: {
            var25 = OrbDefence.field_D ? 1 : 0;
            if (null == field_c) {
              break L1;
            } else {
              if (field_c.length < param1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ef.field_j = new int[param1];
          field_c = new int[param1];
          tl.field_b = new int[param1];
          break L0;
        }
        L2: {
          var36 = field_c;
          var33 = var36;
          var30 = var33;
          var27 = var30;
          var26 = var27;
          var10 = var26;
          var37 = tl.field_b;
          var34 = var37;
          var31 = var34;
          var28 = var31;
          var11 = var28;
          var38 = ef.field_j;
          var35 = var38;
          var32 = var35;
          var29 = var32;
          var12 = var29;
          mk.a(var36, 0, param1);
          mk.a(var37, 0, param1);
          mk.a(var38, 0, param1);
          var13 = 16384 / (1 + 2 * param2);
          var14 = param0 - param2;
          if (var14 >= 0) {
            break L2;
          } else {
            var14 = 0;
            break L2;
          }
        }
        L3: {
          var15 = ul.field_f * var14 + param9;
          var16 = param0 - -param2;
          var17 = 0;
          if (ul.field_l <= var16) {
            var17 = 1 + (var16 - ul.field_l);
            var16 = ul.field_l + -1;
            break L3;
          } else {
            break L3;
          }
        }
        var18 = 1 + var16 + -var14;
        L4: while (true) {
          L5: {
            if (var16 < var14) {
              break L5;
            } else {
              var19 = 0;
              L6: while (true) {
                L7: {
                  if (param1 <= var19) {
                    break L7;
                  } else {
                    var15++;
                    param7 = param8[var15];
                    var26[var19] = var26[var19] + (vi.a(16771310, param7) >> -658853456);
                    var11[var19] = var11[var19] + (vi.a(65293, param7) >> -1522719576);
                    var12[var19] = var12[var19] + vi.a(255, param7);
                    var19++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var15 = var15 + param6;
                var14++;
                if (0 == 0) {
                  continue L4;
                } else {
                  break L5;
                }
              }
            }
          }
          var15 = var15 + ul.field_f * var17;
          var19 = 0;
          L8: while (true) {
            L9: {
              if (var19 >= param1) {
                break L9;
              } else {
                param3++;
                param8[param3] = var38[var19] / var18 + (var37[var19] / var18 << -447711000) + (var36[var19] / var18 << 322921296);
                var19++;
                if (0 == 0) {
                  continue L8;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              var14 = -param5 + 1;
              param3 = param3 + param6;
              var19 = -param5 + (param2 + 1) - param0;
              if (var19 > 0) {
                var19 = 0;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              var20 = param9 + ul.field_f * (-param2 + param0);
              if (var19 > var14) {
                var20 = var20 + (-var14 + var19) * ul.field_f;
                break L11;
              } else {
                break L11;
              }
            }
            L12: while (true) {
              L13: {
                if (var14 >= var19) {
                  break L13;
                } else {
                  L14: {
                    L15: {
                      if (param0 + (var14 + param5 + param2) >= ul.field_a) {
                        break L15;
                      } else {
                        var21 = 0;
                        L16: while (true) {
                          L17: {
                            if (var21 >= param1) {
                              break L17;
                            } else {
                              var15++;
                              param7 = param8[var15];
                              var26[var21] = var26[var21] + (vi.a(16738842, param7) >> -1225171888);
                              var11[var21] = var11[var21] + (vi.a(param7, 65525) >> -917385656);
                              var12[var21] = var12[var21] + vi.a(255, param7);
                              var21++;
                              if (0 == 0) {
                                continue L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          var15 = var15 + param6;
                          var18++;
                          if (0 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    var15 = var15 + ul.field_f;
                    break L14;
                  }
                  var21 = 0;
                  L18: while (true) {
                    L19: {
                      if (var21 >= param1) {
                        break L19;
                      } else {
                        var22 = var36[var21] / var18;
                        var23 = var37[var21] / var18;
                        var24 = var38[var21] / var18;
                        param3++;
                        param8[param3] = var24 + ((var22 << -368181680) - -(var23 << -1828570712));
                        var21++;
                        if (0 == 0) {
                          continue L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    param3 = param3 + param6;
                    var14++;
                    if (0 == 0) {
                      continue L12;
                    } else {
                      break L13;
                    }
                  }
                }
              }
              L20: {
                var19 = -param2 + -param0 + ul.field_l + -param5;
                if ((var19 ^ -1) < param4) {
                  var19 = 0;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: while (true) {
                L22: {
                  if (var19 <= var14) {
                    break L22;
                  } else {
                    var21 = 0;
                    L23: while (true) {
                      L24: {
                        if (param1 <= var21) {
                          break L24;
                        } else {
                          L25: {
                            var20++;
                            param7 = param8[var20];
                            var22 = var36[var21] - ((16769585 & param7) >> 961245872);
                            stackOut_45_0 = (int[]) var26;
                            stackOut_45_1 = var21;
                            stackIn_47_0 = stackOut_45_0;
                            stackIn_47_1 = stackOut_45_1;
                            stackIn_46_0 = stackOut_45_0;
                            stackIn_46_1 = stackOut_45_1;
                            if (-1 >= (var22 ^ -1)) {
                              stackOut_47_0 = (int[]) (Object) stackIn_47_0;
                              stackOut_47_1 = stackIn_47_1;
                              stackOut_47_2 = var22;
                              stackIn_48_0 = stackOut_47_0;
                              stackIn_48_1 = stackOut_47_1;
                              stackIn_48_2 = stackOut_47_2;
                              break L25;
                            } else {
                              stackOut_46_0 = (int[]) (Object) stackIn_46_0;
                              stackOut_46_1 = stackIn_46_1;
                              stackOut_46_2 = 0;
                              stackIn_48_0 = stackOut_46_0;
                              stackIn_48_1 = stackOut_46_1;
                              stackIn_48_2 = stackOut_46_2;
                              break L25;
                            }
                          }
                          L26: {
                            stackIn_48_0[stackIn_48_1] = stackIn_48_2;
                            var22 = var37[var21] - ((param7 & 65309) >> 497952712);
                            stackOut_48_0 = (int[]) var11;
                            stackOut_48_1 = var21;
                            stackIn_50_0 = stackOut_48_0;
                            stackIn_50_1 = stackOut_48_1;
                            stackIn_49_0 = stackOut_48_0;
                            stackIn_49_1 = stackOut_48_1;
                            if (var22 < 0) {
                              stackOut_50_0 = (int[]) (Object) stackIn_50_0;
                              stackOut_50_1 = stackIn_50_1;
                              stackOut_50_2 = 0;
                              stackIn_51_0 = stackOut_50_0;
                              stackIn_51_1 = stackOut_50_1;
                              stackIn_51_2 = stackOut_50_2;
                              break L26;
                            } else {
                              stackOut_49_0 = (int[]) (Object) stackIn_49_0;
                              stackOut_49_1 = stackIn_49_1;
                              stackOut_49_2 = var22;
                              stackIn_51_0 = stackOut_49_0;
                              stackIn_51_1 = stackOut_49_1;
                              stackIn_51_2 = stackOut_49_2;
                              break L26;
                            }
                          }
                          L27: {
                            stackIn_51_0[stackIn_51_1] = stackIn_51_2;
                            var22 = var38[var21] - (param7 & 255);
                            stackOut_51_0 = (int[]) var12;
                            stackOut_51_1 = var21;
                            stackIn_53_0 = stackOut_51_0;
                            stackIn_53_1 = stackOut_51_1;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            if (var22 < 0) {
                              stackOut_53_0 = (int[]) (Object) stackIn_53_0;
                              stackOut_53_1 = stackIn_53_1;
                              stackOut_53_2 = 0;
                              stackIn_54_0 = stackOut_53_0;
                              stackIn_54_1 = stackOut_53_1;
                              stackIn_54_2 = stackOut_53_2;
                              break L27;
                            } else {
                              stackOut_52_0 = (int[]) (Object) stackIn_52_0;
                              stackOut_52_1 = stackIn_52_1;
                              stackOut_52_2 = var22;
                              stackIn_54_0 = stackOut_52_0;
                              stackIn_54_1 = stackOut_52_1;
                              stackIn_54_2 = stackOut_52_2;
                              break L27;
                            }
                          }
                          stackIn_54_0[stackIn_54_1] = stackIn_54_2;
                          var21++;
                          if (0 == 0) {
                            continue L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      var21 = 0;
                      L28: while (true) {
                        L29: {
                          if (param1 <= var21) {
                            break L29;
                          } else {
                            var15++;
                            param7 = param8[var15];
                            var26[var21] = var26[var21] + (vi.a(16758132, param7) >> -169910576);
                            var11[var21] = var11[var21] + vi.a(255, param7 >> 637432648);
                            var12[var21] = var12[var21] + vi.a(param7, 255);
                            var21++;
                            if (0 == 0) {
                              continue L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                        var20 = var20 + param6;
                        var21 = 0;
                        L30: while (true) {
                          L31: {
                            if (var21 >= param1) {
                              break L31;
                            } else {
                              L32: {
                                var22 = var36[var21] * var13 >> -2057065810;
                                var23 = var37[var21] * var13 >> 993944110;
                                var24 = var38[var21] * var13 >> -199320210;
                                if (-256 > (var22 ^ -1)) {
                                  var22 = 255;
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                              L33: {
                                if (255 >= var23) {
                                  break L33;
                                } else {
                                  var23 = 255;
                                  break L33;
                                }
                              }
                              L34: {
                                if (var24 <= 255) {
                                  break L34;
                                } else {
                                  var24 = 255;
                                  break L34;
                                }
                              }
                              param3++;
                              param8[param3] = (var22 << 160816272) + ((var23 << 1491744296) + var24);
                              var21++;
                              if (0 == 0) {
                                continue L30;
                              } else {
                                break L31;
                              }
                            }
                          }
                          var15 = var15 + param6;
                          param3 = param3 + param6;
                          var14++;
                          if (0 == 0) {
                            continue L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_70_0 = 0;
                stackIn_72_0 = stackOut_70_0;
                L35: while (true) {
                  L36: {
                    if (stackIn_72_0 <= var14) {
                      break L36;
                    } else {
                      var21 = 0;
                      L37: while (true) {
                        L38: {
                          if (var21 >= param1) {
                            break L38;
                          } else {
                            var20++;
                            param7 = param8[var20];
                            var26[var21] = var26[var21] - (vi.a(param7, 16757155) >> -1198033488);
                            var11[var21] = var11[var21] - (vi.a(65471, param7) >> -1861153304);
                            var12[var21] = var12[var21] - vi.a(param7, 255);
                            var21++;
                            if (0 == 0) {
                              continue L37;
                            } else {
                              break L38;
                            }
                          }
                        }
                        var20 = var20 + param6;
                        var18--;
                        var21 = 0;
                        L39: while (true) {
                          L40: {
                            if (param1 <= var21) {
                              break L40;
                            } else {
                              L41: {
                                L42: {
                                  var22 = var36[var21] / var18;
                                  var23 = var37[var21] / var18;
                                  if (var22 >= 0) {
                                    break L42;
                                  } else {
                                    var22 = 0;
                                    if (0 == 0) {
                                      break L41;
                                    } else {
                                      break L42;
                                    }
                                  }
                                }
                                if (255 >= var22) {
                                  break L41;
                                } else {
                                  var22 = 255;
                                  break L41;
                                }
                              }
                              L43: {
                                L44: {
                                  if (var23 < 0) {
                                    break L44;
                                  } else {
                                    if (var23 > 255) {
                                      var23 = 255;
                                      if (0 == 0) {
                                        break L43;
                                      } else {
                                        break L44;
                                      }
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                                var23 = 0;
                                break L43;
                              }
                              L45: {
                                L46: {
                                  var24 = var38[var21] / var18;
                                  if (0 > var24) {
                                    break L46;
                                  } else {
                                    if (255 >= var24) {
                                      break L45;
                                    } else {
                                      var24 = 255;
                                      if (0 == 0) {
                                        break L45;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                }
                                var24 = 0;
                                break L45;
                              }
                              param3++;
                              param8[param3] = var24 + ((var23 << 1737482344) + (var22 << 338312624));
                              var21++;
                              if (0 == 0) {
                                continue L39;
                              } else {
                                break L40;
                              }
                            }
                          }
                          param3 = param3 + param6;
                          var14++;
                          if (0 == 0) {
                            stackOut_71_0 = 0;
                            stackIn_72_0 = stackOut_71_0;
                            continue L35;
                          } else {
                            break L36;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 != 9) {
            return;
        }
        field_e = null;
        field_c = null;
        field_b = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new long[32];
        field_a = "Menu";
        field_f = "GHOSTO";
    }
}
