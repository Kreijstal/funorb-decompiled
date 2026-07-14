/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha implements db {
    private wl field_f;
    static hf field_c;
    private int field_b;
    private int field_d;
    static int[] field_e;
    static boolean field_a;

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 94) {
            return;
        }
        field_e = null;
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var11 = EscapeVector.field_A;
            if (param3.field_u) {
              break L1;
            } else {
              if (param3.h(0)) {
                break L1;
              } else {
                stackOut_2_0 = 2188450;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 3249872;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        var6 = stackIn_4_0;
        if (param2 > -14) {
          return;
        } else {
          L2: {
            int discarded$1 = ((ha) this).field_f.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_l + "</u>", param3.field_k + param0, param3.field_j + param1, param3.field_g, param3.field_x, var6, -1, ((ha) this).field_b, ((ha) this).field_d, ((ha) this).field_f.field_r + ((ha) this).field_f.field_x);
            if (!param3.h(0)) {
              break L2;
            } else {
              L3: {
                var7 = ((ha) this).field_f.b(param3.field_l);
                var8 = ((ha) this).field_f.field_x + ((ha) this).field_f.field_r;
                var9 = param0 - -param3.field_k;
                var10 = param3.field_j + param1;
                if (-3 == (((ha) this).field_b ^ -1)) {
                  var9 = var9 + (-var7 + param3.field_g);
                  break L3;
                } else {
                  if (1 != ((ha) this).field_b) {
                    break L3;
                  } else {
                    var9 = var9 + (param3.field_g + -var7 >> 885728961);
                    break L3;
                  }
                }
              }
              L4: {
                if (((ha) this).field_d != 2) {
                  if (-2 != (((ha) this).field_d ^ -1)) {
                    break L4;
                  } else {
                    var10 = var10 + (-var8 + param3.field_x >> 1458485857);
                    break L4;
                  }
                } else {
                  var10 = var10 + (param3.field_x + -var8);
                  break L4;
                }
              }
              ic.a(false, 4 + var7, var9 + -2, var8, var10 + 2);
              break L2;
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8) {
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
        Object var20 = null;
        var19 = EscapeVector.field_A;
        if (0 <= param7) {
          if (bi.field_f <= param2) {
            return;
          } else {
            L0: {
              if (param3 >= 0) {
                break L0;
              } else {
                if (param0 >= 0) {
                  break L0;
                } else {
                  if (param4 >= 0) {
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
            L1: {
              if (param3 < bi.field_c) {
                break L1;
              } else {
                if (bi.field_c > param0) {
                  break L1;
                } else {
                  if (bi.field_c <= param4) {
                    return;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              L3: {
                var14 = -param2 + param7;
                if (param2 == param1) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var10 = param3 << -1337291696;
                      var9 = param3 << -1337291696;
                      var15 = param1 - param2;
                      var12 = (param4 + -param3 << 1843538800) / var14;
                      var11 = (param0 + -param3 << 465729232) / var15;
                      if (var12 > var11) {
                        break L5;
                      } else {
                        var16 = var11;
                        var11 = var12;
                        var12 = var16;
                        var13 = 1;
                        if (0 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var13 = 0;
                    break L4;
                  }
                  L6: {
                    L7: {
                      if (param2 < 0) {
                        L8: {
                          if (param1 < 0) {
                            break L8;
                          } else {
                            param2 = -param2;
                            var10 = var10 + param2 * var12;
                            var9 = var9 + param2 * var11;
                            param2 = 0;
                            if (0 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        param2 = -param2 + param1;
                        var9 = var9 + param2 * var11;
                        var10 = var10 + param2 * var12;
                        param2 = param1;
                        if (0 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var16 = bi.field_a[param2];
                    L9: while (true) {
                      if (param2 >= param1) {
                        break L6;
                      } else {
                        L10: {
                          var17 = var9 >> 820108304;
                          if (bi.field_c > var17) {
                            L11: {
                              var18 = (var10 >> -980615600) - (var9 >> 1902431312);
                              if (var18 == 0) {
                                break L11;
                              } else {
                                L12: {
                                  if (bi.field_c > var17 - -var18) {
                                    break L12;
                                  } else {
                                    var18 = -1 + -var17 + bi.field_c;
                                    break L12;
                                  }
                                }
                                L13: {
                                  if (var17 < 0) {
                                    break L13;
                                  } else {
                                    bb.a(-23466, var17 + var16, param6, var18, param8);
                                    if (0 == 0) {
                                      break L10;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                bb.a(-23466, var16, param6, var17 + var18, param8);
                                if (0 == 0) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (0 > var17) {
                              break L10;
                            } else {
                              if (bi.field_c <= var17) {
                                break L10;
                              } else {
                                bb.a(-23466, var17 - -var16, param6, var18, param8);
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                        param2++;
                        if (param2 >= bi.field_f) {
                          return;
                        } else {
                          var16 = var16 + em.field_l;
                          var9 = var9 + var11;
                          var10 = var10 + var12;
                          if (0 == 0) {
                            continue L9;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  L14: {
                    L15: {
                      var16 = -param1 + param7;
                      if (var16 == 0) {
                        break L15;
                      } else {
                        L16: {
                          L17: {
                            if (var13 != 0) {
                              break L17;
                            } else {
                              var9 = param0 << -286447440;
                              if (0 == 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          var10 = param0 << -2019933936;
                          break L16;
                        }
                        var17 = param4 << -1250300816;
                        var12 = (-var10 + var17) / var16;
                        var11 = (-var9 + var17) / var16;
                        if (0 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    var11 = 0;
                    var12 = 0;
                    break L14;
                  }
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L18: {
                L19: {
                  if (param7 != param2) {
                    break L19;
                  } else {
                    var12 = 0;
                    var10 = param0 << 1875203280;
                    var11 = 0;
                    var9 = param3 << -198630768;
                    if (0 == 0) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                L20: {
                  var15 = -param1 + param7;
                  if (param3 >= param0) {
                    break L20;
                  } else {
                    var12 = (param4 - param0 << 1218183120) / var15;
                    var11 = (-param3 + param4 << -330442096) / var14;
                    var10 = param0 << -1456663408;
                    var9 = param3 << 38715216;
                    if (0 == 0) {
                      break L18;
                    } else {
                      break L20;
                    }
                  }
                }
                var11 = (param4 + -param0 << -1095185296) / var15;
                var10 = param3 << -271754448;
                var12 = (-param3 + param4 << -1923873168) / var14;
                var9 = param0 << 208893360;
                break L18;
              }
              var13 = 0;
              if (param2 < 0) {
                param2 = Math.min(-param2, -param2 + param1);
                var9 = var9 + param2 * var11;
                var10 = var10 + var12 * param2;
                param2 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L21: {
              if (param2 < 0) {
                param2 = -param2;
                var10 = var10 + var12 * param2;
                var9 = var9 + param2 * var11;
                param2 = 0;
                break L21;
              } else {
                break L21;
              }
            }
            var15 = bi.field_a[param2];
            L22: while (true) {
              if (param7 > param2) {
                L23: {
                  var16 = var9 >> -107980944;
                  if (bi.field_c > var16) {
                    L24: {
                      var17 = -(var9 >> -513591056) + (var10 >> 1253497232);
                      if (var17 != 0) {
                        break L24;
                      } else {
                        if (0 > var16) {
                          break L23;
                        } else {
                          if (bi.field_c <= var16) {
                            break L23;
                          } else {
                            bb.a(-23466, var16 + var15, param6, var17, param8);
                            if (0 == 0) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                    }
                    L25: {
                      if (bi.field_c > var17 + var16) {
                        break L25;
                      } else {
                        var17 = -1 + (-var16 + bi.field_c);
                        break L25;
                      }
                    }
                    L26: {
                      if (var16 < 0) {
                        break L26;
                      } else {
                        bb.a(-23466, var15 + var16, param6, var17, param8);
                        if (0 == 0) {
                          break L23;
                        } else {
                          break L26;
                        }
                      }
                    }
                    bb.a(-23466, var15, param6, var16 + var17, param8);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                param2++;
                if (param2 >= bi.field_f) {
                  return;
                } else {
                  var9 = var9 + var11;
                  var10 = var10 + var12;
                  var15 = var15 + em.field_l;
                  if (0 == 0) {
                    continue L22;
                  } else {
                    L27: {
                      if (param5 > 33) {
                        break L27;
                      } else {
                        var20 = null;
                        ha.a(96, -39, -128, (byte) 0, -4, 16, -43, 90, (int[]) null, -115);
                        break L27;
                      }
                    }
                    return;
                  }
                }
              } else {
                L28: {
                  if (param5 > 33) {
                    break L28;
                  } else {
                    var20 = null;
                    ha.a(96, -39, -128, (byte) 0, -4, 16, -43, 90, (int[]) null, -115);
                    break L28;
                  }
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static ab a(int param0, int param1, mf param2, int param3, mf param4) {
        if (!uc.a(param4, param1 ^ 198630719, param0, param3)) {
          return null;
        } else {
          L0: {
            if (param1 == -198630768) {
              break L0;
            } else {
              field_c = null;
              break L0;
            }
          }
          return ea.a(param2.a(param0, (byte) -97, param3), -1);
        }
    }

    public ha() {
        ((ha) this).field_b = 1;
        ((ha) this).field_d = 1;
        ((ha) this).field_f = sb.field_a;
    }

    ha(wl param0, int param1, int param2) {
        ((ha) this).field_b = param1;
        ((ha) this).field_d = param2;
        ((ha) this).field_f = param0;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int[] param8, int param9) {
        int[] var18 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = EscapeVector.field_A;
        if (param3 > -75) {
            Object var17 = null;
            ab discarded$0 = ha.a(-4, -41, (mf) null, 73, (mf) null);
        }
        while (true) {
            param7--;
            if (-1 < (param7 ^ -1)) {
                break;
            }
            var18 = param8;
            var10 = var18;
            var11 = param1;
            var12 = param9;
            var13 = param0;
            var14 = param4;
            var15 = 8355711 & var18[var11] >> 372541249;
            var10[var11] = ae.a(var13 >> -1856944375, 65280) + (ae.a(33423360, var12) >> 90304577) - (-(ae.a(var14, 33532346) >> 332702705) - var15);
            param4 = param4 + param2;
            param9 = param9 + param5;
            param0 = param0 + param6;
            param1++;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new hf();
        field_e = new int[]{19, 27};
        field_a = false;
    }
}
