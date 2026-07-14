/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends jb {
    int field_h;
    static ko field_i;
    static boolean field_f;
    static String[] field_g;

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        hd.a(false);
        kh.a(param0, param4, param2, param1);
        if (param3 != 73) {
            qp.a(90, 81, -14, (byte) -52, 17);
        }
    }

    private qp() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 1095153680) {
            return;
        }
        field_g = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
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
        L0: {
          var19 = CrazyCrystals.field_B;
          if (0 > param3) {
            break L0;
          } else {
            if (param5 < nb.field_b) {
              L1: {
                if (param7 >= 0) {
                  break L1;
                } else {
                  if (param1 >= 0) {
                    break L1;
                  } else {
                    if (0 <= param2) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (param7 < nb.field_d) {
                  break L2;
                } else {
                  if (nb.field_d > param1) {
                    break L2;
                  } else {
                    if (nb.field_d <= param2) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param0 == 99) {
                  break L3;
                } else {
                  field_g = null;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var14 = param3 + -param5;
                  if (param8 == param5) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var10 = param7 << 1392410448;
                        var9 = param7 << 1392410448;
                        var15 = param8 + -param5;
                        var12 = (-param7 + param2 << -430771216) / var14;
                        var11 = (-param7 + param1 << -2067615056) / var15;
                        if (var12 > var11) {
                          break L7;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var13 = 0;
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (0 > param5) {
                          L10: {
                            if (param8 >= 0) {
                              break L10;
                            } else {
                              param5 = param8 - param5;
                              var10 = var10 + param5 * var12;
                              var9 = var9 + var11 * param5;
                              param5 = param8;
                              if (0 == 0) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param5 = -param5;
                          var10 = var10 + param5 * var12;
                          var9 = var9 + param5 * var11;
                          param5 = 0;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var16 = nb.field_a[param5];
                      L11: while (true) {
                        if (param5 >= param8) {
                          break L8;
                        } else {
                          L12: {
                            var17 = var9 >> -1899250544;
                            if (nb.field_d <= var17) {
                              break L12;
                            } else {
                              L13: {
                                var18 = -(var9 >> 1581410928) + (var10 >> -1471455824);
                                if (var18 == 0) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (var18 + var17 >= nb.field_d) {
                                      var18 = -1 + nb.field_d - var17;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    if (0 <= var17) {
                                      break L15;
                                    } else {
                                      ui.a(param4, var17 + var18, param6, -39, var16);
                                      if (0 == 0) {
                                        break L12;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  ui.a(param4, var18, param6, param0 ^ -59, var17 - -var16);
                                  if (0 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (0 > var17) {
                                break L12;
                              } else {
                                if (nb.field_d > var17) {
                                  ui.a(param4, var18, param6, -109, var16 + var17);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          param5++;
                          if (param5 < nb.field_b) {
                            var16 = var16 + kh.field_l;
                            var9 = var9 + var11;
                            var10 = var10 + var12;
                            if (0 == 0) {
                              continue L11;
                            } else {
                              break L8;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    L16: {
                      L17: {
                        var16 = -param8 + param3;
                        if (var16 != 0) {
                          break L17;
                        } else {
                          var11 = 0;
                          var12 = 0;
                          if (0 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L18: {
                        L19: {
                          var17 = param2 << -458225424;
                          if (var13 == 0) {
                            break L19;
                          } else {
                            var10 = param1 << 451060528;
                            if (0 == 0) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        var9 = param1 << -359914192;
                        break L18;
                      }
                      var11 = (var17 - var9) / var16;
                      var12 = (-var10 + var17) / var16;
                      break L16;
                    }
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L20: {
                  L21: {
                    if (param3 == param5) {
                      break L21;
                    } else {
                      L22: {
                        L23: {
                          var15 = -param8 + param3;
                          if (param1 <= param7) {
                            break L23;
                          } else {
                            var9 = param7 << -1845727184;
                            var12 = (-param1 + param2 << 1480352592) / var15;
                            var11 = (param2 + -param7 << 948771344) / var14;
                            var10 = param1 << -1343528144;
                            if (0 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        var12 = (-param7 + param2 << 1095153680) / var14;
                        var11 = (-param1 + param2 << 1062047120) / var15;
                        var9 = param1 << -140958928;
                        var10 = param7 << 424447536;
                        break L22;
                      }
                      if (0 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  var11 = 0;
                  var9 = param7 << -1238746096;
                  var10 = param1 << -2095304080;
                  var12 = 0;
                  break L20;
                }
                L24: {
                  if (param5 >= 0) {
                    break L24;
                  } else {
                    param5 = Math.min(-param5, -param5 + param8);
                    var10 = var10 + param5 * var12;
                    var9 = var9 + var11 * param5;
                    param5 = 0;
                    break L24;
                  }
                }
                var13 = 0;
                break L4;
              }
              L25: {
                if (0 > param5) {
                  param5 = -param5;
                  var10 = var10 + param5 * var12;
                  var9 = var9 + var11 * param5;
                  param5 = 0;
                  break L25;
                } else {
                  break L25;
                }
              }
              var15 = nb.field_a[param5];
              if (param3 > param5) {
                L26: {
                  var16 = var9 >> -363362512;
                  if (var16 < nb.field_d) {
                    L27: {
                      var17 = -(var9 >> 591765104) + (var10 >> -50438960);
                      if (var17 == 0) {
                        break L27;
                      } else {
                        L28: {
                          if (nb.field_d <= var17 + var16) {
                            var17 = nb.field_d - (var16 - -1);
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        L29: {
                          if (var16 >= 0) {
                            break L29;
                          } else {
                            ui.a(param4, var16 + var17, param6, -47, var15);
                            if (0 == 0) {
                              break L26;
                            } else {
                              break L29;
                            }
                          }
                        }
                        ui.a(param4, var17, param6, -107, var16 - -var15);
                        if (0 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    if (var16 < 0) {
                      break L26;
                    } else {
                      if (nb.field_d > var16) {
                        ui.a(param4, var17, param6, -122, var16 - -var15);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                  } else {
                    break L26;
                  }
                }
                param5++;
                if (nb.field_b <= param5) {
                  return;
                } else {
                  var15 = var15 + kh.field_l;
                  var10 = var10 + var12;
                  var9 = var9 + var11;
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(byte param0) {
        pl.e(-119);
        qd.field_q = true;
        int var1 = 91 % ((-59 - param0) / 58);
        ne.field_d = true;
        qe.field_g.g((byte) -122);
        ke.a(gg.field_b, false, -13);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"Basics", "Rolling", "Shuffles", "Spiders", "Sticky Balls"};
    }
}
