/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends ne {
    static String field_m;
    byte[] field_l;
    static cn[] field_i;
    int field_k;
    static int[] field_j;

    final static boolean b(byte param0) {
        if (param0 >= -91) {
            ue.a((byte) -63);
        }
        return d.field_f;
    }

    final static void a(int param0) {
        int var1 = 95 % ((param0 - 38) / 34);
        sn.a(97, 4);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = 0;
            if (-1 < (param0 ^ -1)) {
              break L1;
            } else {
              if (65536 <= param0) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          param0 = param0 >>> 16;
          var2 += 16;
          break L0;
        }
        L2: {
          if (param0 >= 256) {
            param0 = param0 >>> 8;
            var2 += 8;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (16 > param0) {
            break L3;
          } else {
            param0 = param0 >>> 4;
            var2 += 4;
            break L3;
          }
        }
        L4: {
          if (param1 == -715) {
            break L4;
          } else {
            field_i = (cn[]) null;
            break L4;
          }
        }
        L5: {
          if (-5 >= (param0 ^ -1)) {
            var2 += 2;
            param0 = param0 >>> 2;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (param0 >= 1) {
            var2++;
            param0 = param0 >>> 1;
            break L6;
          } else {
            break L6;
          }
        }
        return var2 + param0;
    }

    public static void a(byte param0) {
        field_j = null;
        field_m = null;
        field_i = null;
        int var1 = -109 % ((-45 - param0) / 53);
    }

    private ue() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        var19 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if ((param3 ^ -1) > -1) {
                break L1;
              } else {
                if (re.field_i <= param0) {
                  break L1;
                } else {
                  L2: {
                    if ((param6 ^ -1) <= -1) {
                      break L2;
                    } else {
                      if (-1 >= (param4 ^ -1)) {
                        break L2;
                      } else {
                        if (param7 >= 0) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (re.field_b > param6) {
                      break L3;
                    } else {
                      if (re.field_b > param4) {
                        break L3;
                      } else {
                        if (re.field_b > param7) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = -param0 + param3;
                    if (param0 == param5) {
                      L5: {
                        if (param0 != param3) {
                          var15 = param3 + -param5;
                          if (param4 > param6) {
                            var11 = (param7 + -param6 << 582730736) / var14;
                            var12 = (-param4 + param7 << 843758096) / var15;
                            var10 = param4 << 1586209168;
                            var9_int = param6 << 1500479984;
                            break L5;
                          } else {
                            var9_int = param4 << 1376169680;
                            var12 = (param7 + -param6 << 1763399248) / var14;
                            var10 = param6 << 492874576;
                            var11 = (param7 - param4 << -782677008) / var15;
                            break L5;
                          }
                        } else {
                          var10 = param4 << 1559027120;
                          var11 = 0;
                          var12 = 0;
                          var9_int = param6 << 791966000;
                          break L5;
                        }
                      }
                      var13 = 0;
                      if ((param0 ^ -1) > -1) {
                        param0 = Math.min(-param0, -param0 + param5);
                        var9_int = var9_int + var11 * param0;
                        var10 = var10 + param0 * var12;
                        param0 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      L6: {
                        var10 = param6 << -1247334896;
                        var9_int = param6 << -1247334896;
                        var15 = param5 + -param0;
                        var12 = (param7 - param6 << -535145136) / var14;
                        var11 = (-param6 + param4 << -325219920) / var15;
                        if (var11 >= var12) {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L6;
                        } else {
                          var13 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        if (0 > param0) {
                          if (0 > param5) {
                            param0 = param5 - param0;
                            var10 = var10 + var12 * param0;
                            var9_int = var9_int + param0 * var11;
                            param0 = param5;
                            break L7;
                          } else {
                            param0 = -param0;
                            var10 = var10 + param0 * var12;
                            var9_int = var9_int + var11 * param0;
                            param0 = 0;
                            var16 = re.field_e[param0];
                            L8: while (true) {
                              if (param0 >= param5) {
                                break L7;
                              } else {
                                L9: {
                                  var17 = var9_int >> -106614000;
                                  if (var17 < re.field_b) {
                                    var18 = -(var9_int >> -7081648) + (var10 >> 599858320);
                                    if (var18 == 0) {
                                      if (0 > var17) {
                                        break L9;
                                      } else {
                                        if (var17 < re.field_b) {
                                          sa.a((byte) 45, var18, var16 + var17, param2, param1);
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    } else {
                                      L10: {
                                        if (re.field_b > var17 - -var18) {
                                          break L10;
                                        } else {
                                          var18 = re.field_b + -var17 + -1;
                                          break L10;
                                        }
                                      }
                                      if (var17 >= 0) {
                                        sa.a((byte) 45, var18, var17 - -var16, param2, param1);
                                        break L9;
                                      } else {
                                        sa.a((byte) 45, var18 - -var17, var16, param2, param1);
                                        break L9;
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                param0++;
                                if (re.field_i <= param0) {
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  var16 = var16 + gf.field_i;
                                  var9_int = var9_int + var11;
                                  var10 = var10 + var12;
                                  continue L8;
                                }
                              }
                            }
                          }
                        } else {
                          var16 = re.field_e[param0];
                          L11: while (true) {
                            if (param0 >= param5) {
                              break L7;
                            } else {
                              L12: {
                                var17 = var9_int >> -106614000;
                                if (var17 < re.field_b) {
                                  var18 = -(var9_int >> -7081648) + (var10 >> 599858320);
                                  if (var18 == 0) {
                                    if (0 > var17) {
                                      break L12;
                                    } else {
                                      if (var17 < re.field_b) {
                                        sa.a((byte) 45, var18, var16 + var17, param2, param1);
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  } else {
                                    L13: {
                                      if (re.field_b > var17 - -var18) {
                                        break L13;
                                      } else {
                                        var18 = re.field_b + -var17 + -1;
                                        break L13;
                                      }
                                    }
                                    if (var17 >= 0) {
                                      sa.a((byte) 45, var18, var17 - -var16, param2, param1);
                                      break L12;
                                    } else {
                                      sa.a((byte) 45, var18 - -var17, var16, param2, param1);
                                      break L12;
                                    }
                                  }
                                } else {
                                  break L12;
                                }
                              }
                              param0++;
                              if (re.field_i <= param0) {
                                return;
                              } else {
                                var16 = var16 + gf.field_i;
                                var9_int = var9_int + var11;
                                var10 = var10 + var12;
                                continue L11;
                              }
                            }
                          }
                        }
                      }
                      var16 = param3 + -param5;
                      if (var16 == 0) {
                        var11 = 0;
                        var12 = 0;
                        break L4;
                      } else {
                        L14: {
                          if (var13 != 0) {
                            var10 = param4 << 324359792;
                            break L14;
                          } else {
                            var9_int = param4 << 1118996848;
                            break L14;
                          }
                        }
                        var17 = param7 << 421638576;
                        var11 = (-var9_int + var17) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L4;
                      }
                    }
                  }
                  L15: {
                    if (-1 >= (param0 ^ -1)) {
                      break L15;
                    } else {
                      param0 = -param0;
                      var9_int = var9_int + var11 * param0;
                      var10 = var10 + var12 * param0;
                      param0 = 0;
                      break L15;
                    }
                  }
                  L16: {
                    var15 = re.field_e[param0];
                    if (param8 == 16) {
                      break L16;
                    } else {
                      field_j = (int[]) null;
                      break L16;
                    }
                  }
                  L17: while (true) {
                    if (param3 <= param0) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L18: {
                        var16 = var9_int >> 99437520;
                        if (re.field_b > var16) {
                          var17 = (var10 >> 1069840272) + -(var9_int >> 1088343856);
                          if (var17 == 0) {
                            if (-1 < (var16 ^ -1)) {
                              break L18;
                            } else {
                              if (var16 >= re.field_b) {
                                break L18;
                              } else {
                                sa.a((byte) 45, var17, var16 - -var15, param2, param1);
                                break L18;
                              }
                            }
                          } else {
                            L19: {
                              if (var17 + var16 >= re.field_b) {
                                var17 = re.field_b + -var16 + -1;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            if (-1 >= (var16 ^ -1)) {
                              sa.a((byte) 45, var17, var16 - -var15, param2, param1);
                              break L18;
                            } else {
                              sa.a((byte) 45, var16 + var17, var15, param2, param1);
                              break L18;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                      param0++;
                      if (re.field_i > param0) {
                        var9_int = var9_int + var11;
                        var15 = var15 + gf.field_i;
                        var10 = var10 + var12;
                        continue L17;
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
          L20: {
            var9 = decompiledCaughtException;
            stackOut_94_0 = (RuntimeException) (var9);
            stackOut_94_1 = new StringBuilder().append("ue.E(").append(param0).append(',');
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param1 == null) {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L20;
            } else {
              stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L20;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_97_0), stackIn_97_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
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

    static {
        field_m = "Instructions";
    }
}
