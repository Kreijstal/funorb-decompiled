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
        if (-1 >= (param0 ^ -1)) {
            // if_icmple L18
        } else {
            param0 = param0 >>> 16;
            var2 += 16;
        }
        if (!(param0 < 256)) {
            param0 = param0 >>> 8;
            var2 += 8;
        }
        if (16 <= param0) {
            param0 = param0 >>> 4;
            var2 += 4;
        }
        if (param1 != -715) {
            field_i = null;
        }
        if (!(-5 < (param0 ^ -1))) {
            var2 += 2;
            param0 = param0 >>> 2;
        }
        if (!(param0 < 1)) {
            var2++;
            param0 = param0 >>> 1;
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
        var19 = DungeonAssault.field_K;
        if (param3 >= 0) {
          if (re.field_i <= param0) {
            return;
          } else {
            L0: {
              if (param6 >= 0) {
                break L0;
              } else {
                if (param4 >= 0) {
                  break L0;
                } else {
                  if (param7 >= 0) {
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
            L1: {
              if (re.field_b > param6) {
                break L1;
              } else {
                if (re.field_b > param4) {
                  break L1;
                } else {
                  if (re.field_b > param7) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
            }
            L2: {
              L3: {
                var14 = -param0 + param3;
                if (param0 == param5) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var10 = param6 << -1247334896;
                      var9 = param6 << -1247334896;
                      var15 = param5 + -param0;
                      var12 = (param7 - param6 << -535145136) / var14;
                      var11 = (-param6 + param4 << -325219920) / var15;
                      if (var11 >= var12) {
                        break L5;
                      } else {
                        var13 = 0;
                        if (0 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var16 = var11;
                    var11 = var12;
                    var12 = var16;
                    var13 = 1;
                    break L4;
                  }
                  L6: {
                    L7: {
                      if (0 > param0) {
                        L8: {
                          if (0 > param5) {
                            break L8;
                          } else {
                            param0 = -param0;
                            var10 = var10 + param0 * var12;
                            var9 = var9 + var11 * param0;
                            param0 = 0;
                            if (0 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        param0 = param5 - param0;
                        var10 = var10 + var12 * param0;
                        var9 = var9 + param0 * var11;
                        param0 = param5;
                        if (0 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var16 = re.field_e[param0];
                    L9: while (true) {
                      if (param0 >= param5) {
                        break L6;
                      } else {
                        L10: {
                          var17 = var9 >> -106614000;
                          if ((var17 ^ -1) > (re.field_b ^ -1)) {
                            L11: {
                              var18 = -(var9 >> -7081648) + (var10 >> 599858320);
                              if (var18 == 0) {
                                break L11;
                              } else {
                                L12: {
                                  if (re.field_b > var17 - -var18) {
                                    break L12;
                                  } else {
                                    var18 = re.field_b + -var17 + -1;
                                    break L12;
                                  }
                                }
                                L13: {
                                  if (var17 >= 0) {
                                    break L13;
                                  } else {
                                    sa.a((byte) 45, var18 - -var17, var16, param2, param1);
                                    if (0 == 0) {
                                      break L10;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                sa.a((byte) 45, var18, var17 - -var16, param2, param1);
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
                              if (var17 < re.field_b) {
                                sa.a((byte) 45, var18, var16 + var17, param2, param1);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                        param0++;
                        if (re.field_i <= param0) {
                          return;
                        } else {
                          var16 = var16 + gf.field_i;
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
                      var16 = param3 + -param5;
                      if (var16 == 0) {
                        break L15;
                      } else {
                        L16: {
                          L17: {
                            if (var13 != 0) {
                              break L17;
                            } else {
                              var9 = param4 << 1118996848;
                              if (0 == 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          var10 = param4 << 324359792;
                          break L16;
                        }
                        var17 = param7 << 421638576;
                        var11 = (-var9 + var17) / var16;
                        var12 = (-var10 + var17) / var16;
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
                  if (param0 != param3) {
                    break L19;
                  } else {
                    var10 = param4 << 1559027120;
                    var11 = 0;
                    var12 = 0;
                    var9 = param6 << 791966000;
                    if (0 == 0) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                L20: {
                  var15 = param3 + -param5;
                  if (param4 > param6) {
                    break L20;
                  } else {
                    var9 = param4 << 1376169680;
                    var12 = (param7 + -param6 << 1763399248) / var14;
                    var10 = param6 << 492874576;
                    var11 = (param7 - param4 << -782677008) / var15;
                    if (0 == 0) {
                      break L18;
                    } else {
                      break L20;
                    }
                  }
                }
                var11 = (param7 + -param6 << 582730736) / var14;
                var12 = (-param4 + param7 << 843758096) / var15;
                var10 = param4 << 1586209168;
                var9 = param6 << 1500479984;
                break L18;
              }
              var13 = 0;
              if (param0 < 0) {
                param0 = Math.min(-param0, -param0 + param5);
                var9 = var9 + var11 * param0;
                var10 = var10 + param0 * var12;
                param0 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L21: {
              if (param0 >= 0) {
                break L21;
              } else {
                param0 = -param0;
                var9 = var9 + var11 * param0;
                var10 = var10 + var12 * param0;
                param0 = 0;
                break L21;
              }
            }
            L22: {
              var15 = re.field_e[param0];
              if (param8 == 16) {
                break L22;
              } else {
                field_j = null;
                break L22;
              }
            }
            L23: while (true) {
              if (param3 > param0) {
                L24: {
                  var16 = var9 >> 99437520;
                  if (re.field_b > var16) {
                    L25: {
                      var17 = (var10 >> 1069840272) + -(var9 >> 1088343856);
                      if (var17 == 0) {
                        break L25;
                      } else {
                        L26: {
                          if (var17 + var16 >= re.field_b) {
                            var17 = re.field_b + -var16 + -1;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        L27: {
                          if (var16 >= 0) {
                            break L27;
                          } else {
                            sa.a((byte) 45, var16 + var17, var15, param2, param1);
                            if (0 == 0) {
                              break L24;
                            } else {
                              break L27;
                            }
                          }
                        }
                        sa.a((byte) 45, var17, var16 - -var15, param2, param1);
                        if (0 == 0) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                    if (var16 < 0) {
                      break L24;
                    } else {
                      if (var16 >= re.field_b) {
                        break L24;
                      } else {
                        sa.a((byte) 45, var17, var16 - -var15, param2, param1);
                        break L24;
                      }
                    }
                  } else {
                    break L24;
                  }
                }
                param0++;
                if (re.field_i > param0) {
                  var9 = var9 + var11;
                  var15 = var15 + gf.field_i;
                  var10 = var10 + var12;
                  if (0 == 0) {
                    continue L23;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Instructions";
    }
}
