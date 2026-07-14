/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qaa implements dja {
    static float field_a;
    static int field_b;

    public final tv a(byte param0) {
        int var2 = 46 % ((param0 - -64) / 50);
        return (tv) (Object) new ptb();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
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
        L0: {
          var20 = VoidHunters.field_G;
          if (param0 < 0) {
            break L0;
          } else {
            if (param3 < bfb.field_h) {
              L1: {
                if (param4 >= 0) {
                  break L1;
                } else {
                  if (param6 >= 0) {
                    break L1;
                  } else {
                    if (param5 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (param4 < bfb.field_a) {
                  break L2;
                } else {
                  if (param6 < bfb.field_a) {
                    break L2;
                  } else {
                    if (param5 >= bfb.field_a) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                L4: {
                  var13 = 94 / ((param1 - -45) / 51);
                  var15 = -param3 + param0;
                  if (param8 == param3) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        var10 = param4 << 535824336;
                        var9 = param4 << 535824336;
                        var16 = param8 + -param3;
                        var11 = (param6 + -param4 << 1281664976) / var16;
                        var12 = (-param4 + param5 << -1354655728) / var15;
                        if (var12 <= var11) {
                          break L6;
                        } else {
                          var14 = 0;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var17 = var11;
                      var11 = var12;
                      var12 = var17;
                      var14 = 1;
                      break L5;
                    }
                    L7: {
                      L8: {
                        if (param3 >= 0) {
                          var17 = bfb.field_g[param3];
                          L9: while (true) {
                            if (param3 >= param8) {
                              break L7;
                            } else {
                              L10: {
                                var18 = var9 >> 1934168112;
                                if (bfb.field_a > var18) {
                                  L11: {
                                    var19 = (var10 >> -796713584) - (var9 >> 1513870352);
                                    if (0 != var19) {
                                      break L11;
                                    } else {
                                      if (0 > var18) {
                                        break L10;
                                      } else {
                                        if (var18 >= bfb.field_a) {
                                          break L10;
                                        } else {
                                          wga.a(true, var17 + var18, param2, var19, param7);
                                          if (0 == 0) {
                                            break L10;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    if (bfb.field_a > var19 + var18) {
                                      break L12;
                                    } else {
                                      var19 = -1 + (bfb.field_a - var18);
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var18 >= 0) {
                                      break L13;
                                    } else {
                                      wga.a(true, var17, param2, var18 + var19, param7);
                                      if (0 == 0) {
                                        break L10;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  wga.a(true, var18 + var17, param2, var19, param7);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              param3++;
                              if (param3 >= bfb.field_h) {
                                return;
                              } else {
                                var10 = var10 + var12;
                                var17 = var17 + dma.field_g;
                                var9 = var9 + var11;
                                if (0 == 0) {
                                  continue L9;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        } else {
                          L14: {
                            if (param8 >= 0) {
                              break L14;
                            } else {
                              param3 = -param3 + param8;
                              var10 = var10 + param3 * var12;
                              var9 = var9 + var11 * param3;
                              param3 = param8;
                              if (0 == 0) {
                                break L7;
                              } else {
                                break L14;
                              }
                            }
                          }
                          param3 = -param3;
                          var9 = var9 + var11 * param3;
                          var10 = var10 + param3 * var12;
                          param3 = 0;
                          break L8;
                        }
                      }
                      var17 = bfb.field_g[param3];
                      L15: while (true) {
                        if (param3 >= param8) {
                          break L7;
                        } else {
                          L16: {
                            var18 = var9 >> 1934168112;
                            if (bfb.field_a > var18) {
                              L17: {
                                var19 = (var10 >> -796713584) - (var9 >> 1513870352);
                                if (0 != var19) {
                                  break L17;
                                } else {
                                  if (0 > var18) {
                                    break L16;
                                  } else {
                                    if (var18 >= bfb.field_a) {
                                      break L16;
                                    } else {
                                      wga.a(true, var17 + var18, param2, var19, param7);
                                      if (0 == 0) {
                                        break L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                              }
                              L18: {
                                if (bfb.field_a > var19 + var18) {
                                  break L18;
                                } else {
                                  var19 = -1 + (bfb.field_a - var18);
                                  break L18;
                                }
                              }
                              L19: {
                                if (var18 >= 0) {
                                  break L19;
                                } else {
                                  wga.a(true, var17, param2, var18 + var19, param7);
                                  if (0 == 0) {
                                    break L16;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              wga.a(true, var18 + var17, param2, var19, param7);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          param3++;
                          if (param3 >= bfb.field_h) {
                            return;
                          } else {
                            var10 = var10 + var12;
                            var17 = var17 + dma.field_g;
                            var9 = var9 + var11;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    L20: {
                      L21: {
                        var17 = param0 - param8;
                        if (var17 != 0) {
                          break L21;
                        } else {
                          var12 = 0;
                          var11 = 0;
                          if (0 == 0) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      L22: {
                        L23: {
                          var18 = param5 << -965800144;
                          if (var14 != 0) {
                            break L23;
                          } else {
                            var9 = param6 << 1361040176;
                            if (0 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        var10 = param6 << 258228432;
                        break L22;
                      }
                      var11 = (-var9 + var18) / var17;
                      var12 = (-var10 + var18) / var17;
                      break L20;
                    }
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L24: {
                  L25: {
                    if (param3 == param0) {
                      break L25;
                    } else {
                      L26: {
                        L27: {
                          var16 = -param8 + param0;
                          if (param4 < param6) {
                            break L27;
                          } else {
                            var9 = param6 << 663931984;
                            var11 = (param5 - param6 << 1905277008) / var16;
                            var10 = param4 << -1466289456;
                            var12 = (param5 + -param4 << 1786623536) / var15;
                            if (0 == 0) {
                              break L26;
                            } else {
                              break L27;
                            }
                          }
                        }
                        var12 = (param5 + -param6 << -816091696) / var16;
                        var10 = param6 << -1208461712;
                        var9 = param4 << -1051345104;
                        var11 = (param5 + -param4 << 956687952) / var15;
                        break L26;
                      }
                      if (0 == 0) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  var12 = 0;
                  var10 = param6 << -150507568;
                  var9 = param4 << -1246564432;
                  var11 = 0;
                  break L24;
                }
                var14 = 0;
                if (0 <= param3) {
                  break L3;
                } else {
                  param3 = Math.min(-param3, -param3 + param8);
                  var10 = var10 + param3 * var12;
                  var9 = var9 + param3 * var11;
                  param3 = 0;
                  break L3;
                }
              }
              L28: {
                if (0 <= param3) {
                  break L28;
                } else {
                  param3 = -param3;
                  var10 = var10 + var12 * param3;
                  var9 = var9 + param3 * var11;
                  param3 = 0;
                  break L28;
                }
              }
              var16 = bfb.field_g[param3];
              if (param3 < param0) {
                L29: {
                  var17 = var9 >> 1424046256;
                  if (var17 < bfb.field_a) {
                    L30: {
                      var18 = (var10 >> 1972778000) - (var9 >> -30287760);
                      if (var18 == 0) {
                        break L30;
                      } else {
                        L31: {
                          if (bfb.field_a > var18 + var17) {
                            break L31;
                          } else {
                            var18 = -1 + bfb.field_a - var17;
                            break L31;
                          }
                        }
                        L32: {
                          if (0 > var17) {
                            break L32;
                          } else {
                            wga.a(true, var17 + var16, param2, var18, param7);
                            if (0 == 0) {
                              break L29;
                            } else {
                              break L32;
                            }
                          }
                        }
                        wga.a(true, var16, param2, var17 + var18, param7);
                        if (0 == 0) {
                          break L29;
                        } else {
                          break L30;
                        }
                      }
                    }
                    if (0 > var17) {
                      break L29;
                    } else {
                      if (bfb.field_a <= var17) {
                        break L29;
                      } else {
                        wga.a(true, var17 + var16, param2, var18, param7);
                        break L29;
                      }
                    }
                  } else {
                    break L29;
                  }
                }
                param3++;
                if (bfb.field_h <= param3) {
                  return;
                } else {
                  var10 = var10 + var12;
                  var9 = var9 + var11;
                  var16 = var16 + dma.field_g;
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

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            Object var4 = null;
            qaa.a(35, 80, -54, 13, 73, 4, -14, (int[]) null, -74);
        }
        return (tv[]) (Object) new ptb[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 20.0f;
        field_b = 1500;
    }
}
