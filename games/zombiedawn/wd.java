/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends pj {
    byte[] field_A;
    static vn field_y;
    static String field_w;
    na field_x;
    static int[] field_z;
    int field_v;

    final byte[] d(int param0) {
        if (!(!((wd) this).field_q)) {
            throw new RuntimeException();
        }
        if (param0 != 0) {
            return null;
        }
        return ((wd) this).field_A;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7, int[] param8) {
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
          var19 = ZombieDawn.field_J;
          if (param4 < 0) {
            break L0;
          } else {
            if (en.field_d <= param5) {
              break L0;
            } else {
              L1: {
                if (param1 >= 0) {
                  break L1;
                } else {
                  if (param2 >= 0) {
                    break L1;
                  } else {
                    if (param0 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (!param6) {
                  break L2;
                } else {
                  wd.g(-39);
                  break L2;
                }
              }
              L3: {
                if (param1 < en.field_g) {
                  break L3;
                } else {
                  if (param2 < en.field_g) {
                    break L3;
                  } else {
                    if (param0 < en.field_g) {
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
              }
              L4: {
                L5: {
                  var14 = param4 + -param5;
                  if (param5 == param3) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var10 = param1 << 311050032;
                        var9 = param1 << 311050032;
                        var15 = -param5 + param3;
                        var12 = (-param1 + param0 << 55812496) / var14;
                        var11 = (-param1 + param2 << -1775878736) / var15;
                        if (var12 <= var11) {
                          break L7;
                        } else {
                          var13 = 0;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var13 = 1;
                      var16 = var11;
                      var11 = var12;
                      var12 = var16;
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (param5 >= 0) {
                          var16 = en.field_b[param5];
                          L10: while (true) {
                            if (param5 >= param3) {
                              break L8;
                            } else {
                              L11: {
                                var17 = var9 >> 1134621680;
                                if (en.field_g <= var17) {
                                  break L11;
                                } else {
                                  L12: {
                                    var18 = -(var9 >> -1401568528) + (var10 >> 335750448);
                                    if (0 == var18) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (var18 + var17 >= en.field_g) {
                                          var18 = -var17 + en.field_g - 1;
                                          break L13;
                                        } else {
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        if (var17 < 0) {
                                          break L14;
                                        } else {
                                          eb.a(param8, 1393669633, var18, var16 + var17, param7);
                                          if (0 == 0) {
                                            break L11;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      eb.a(param8, 1393669633, var18 + var17, var16, param7);
                                      if (0 == 0) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  if (var17 < 0) {
                                    break L11;
                                  } else {
                                    if (var17 >= en.field_g) {
                                      break L11;
                                    } else {
                                      eb.a(param8, 1393669633, var18, var17 + var16, param7);
                                      break L11;
                                    }
                                  }
                                }
                              }
                              param5++;
                              if (en.field_d > param5) {
                                var9 = var9 + var11;
                                var10 = var10 + var12;
                                var16 = var16 + bi.field_f;
                                if (0 == 0) {
                                  continue L10;
                                } else {
                                  break L9;
                                }
                              } else {
                                return;
                              }
                            }
                          }
                        } else {
                          L15: {
                            if (param3 >= 0) {
                              break L15;
                            } else {
                              param5 = -param5 + param3;
                              var9 = var9 + var11 * param5;
                              var10 = var10 + param5 * var12;
                              param5 = param3;
                              if (0 == 0) {
                                break L8;
                              } else {
                                break L15;
                              }
                            }
                          }
                          param5 = -param5;
                          var10 = var10 + var12 * param5;
                          var9 = var9 + var11 * param5;
                          param5 = 0;
                          break L9;
                        }
                      }
                      var16 = en.field_b[param5];
                      L16: while (true) {
                        if (param5 >= param3) {
                          break L8;
                        } else {
                          L17: {
                            var17 = var9 >> 1134621680;
                            if (en.field_g <= var17) {
                              break L17;
                            } else {
                              L18: {
                                var18 = -(var9 >> -1401568528) + (var10 >> 335750448);
                                if (0 == var18) {
                                  break L18;
                                } else {
                                  L19: {
                                    if (var18 + var17 >= en.field_g) {
                                      var18 = -var17 + en.field_g - 1;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (var17 < 0) {
                                      break L20;
                                    } else {
                                      eb.a(param8, 1393669633, var18, var16 + var17, param7);
                                      if (0 == 0) {
                                        break L17;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  eb.a(param8, 1393669633, var18 + var17, var16, param7);
                                  if (0 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              if (var17 < 0) {
                                break L17;
                              } else {
                                if (var17 >= en.field_g) {
                                  break L17;
                                } else {
                                  eb.a(param8, 1393669633, var18, var17 + var16, param7);
                                  break L17;
                                }
                              }
                            }
                          }
                          param5++;
                          if (en.field_d > param5) {
                            var9 = var9 + var11;
                            var10 = var10 + var12;
                            var16 = var16 + bi.field_f;
                            if (0 == 0) {
                              continue L16;
                            } else {
                              break L8;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    L21: {
                      L22: {
                        var16 = -param3 + param4;
                        if (var16 != 0) {
                          break L22;
                        } else {
                          var12 = 0;
                          var11 = 0;
                          if (0 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      L23: {
                        L24: {
                          if (var13 == 0) {
                            break L24;
                          } else {
                            var10 = param2 << 669999952;
                            if (0 == 0) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        var9 = param2 << 1382350864;
                        break L23;
                      }
                      var17 = param0 << 529512272;
                      var11 = (-var9 + var17) / var16;
                      var12 = (var17 - var10) / var16;
                      break L21;
                    }
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L25: {
                  L26: {
                    if (param4 != param5) {
                      break L26;
                    } else {
                      var10 = param2 << -1190442736;
                      var9 = param1 << -1441450992;
                      var12 = 0;
                      var11 = 0;
                      if (0 == 0) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  L27: {
                    var15 = -param3 + param4;
                    if (param2 <= param1) {
                      break L27;
                    } else {
                      var9 = param1 << -1163599120;
                      var12 = (-param2 + param0 << 101565872) / var15;
                      var11 = (param0 + -param1 << 1445852592) / var14;
                      var10 = param2 << 1784753552;
                      if (0 == 0) {
                        break L25;
                      } else {
                        break L27;
                      }
                    }
                  }
                  var10 = param1 << 695668880;
                  var12 = (param0 - param1 << 212197776) / var14;
                  var9 = param2 << -1526688432;
                  var11 = (param0 + -param2 << 696246064) / var15;
                  break L25;
                }
                L28: {
                  if (0 <= param5) {
                    break L28;
                  } else {
                    param5 = Math.min(-param5, -param5 + param3);
                    var10 = var10 + param5 * var12;
                    var9 = var9 + param5 * var11;
                    param5 = 0;
                    break L28;
                  }
                }
                var13 = 0;
                break L4;
              }
              L29: {
                if (param5 < 0) {
                  param5 = -param5;
                  var9 = var9 + param5 * var11;
                  var10 = var10 + var12 * param5;
                  param5 = 0;
                  break L29;
                } else {
                  break L29;
                }
              }
              var15 = en.field_b[param5];
              if (param4 > param5) {
                L30: {
                  var16 = var9 >> -1408318512;
                  if (en.field_g > var16) {
                    L31: {
                      var17 = (var10 >> -611617712) + -(var9 >> 285428304);
                      if (var17 == 0) {
                        break L31;
                      } else {
                        L32: {
                          if (var16 + var17 < en.field_g) {
                            break L32;
                          } else {
                            var17 = -1 + -var16 + en.field_g;
                            break L32;
                          }
                        }
                        L33: {
                          if (var16 < 0) {
                            break L33;
                          } else {
                            eb.a(param8, 1393669633, var17, var15 + var16, param7);
                            if (0 == 0) {
                              break L30;
                            } else {
                              break L33;
                            }
                          }
                        }
                        eb.a(param8, 1393669633, var17 - -var16, var15, param7);
                        if (0 == 0) {
                          break L30;
                        } else {
                          break L31;
                        }
                      }
                    }
                    if (var16 < 0) {
                      break L30;
                    } else {
                      if (var16 < en.field_g) {
                        eb.a(param8, 1393669633, var17, var15 + var16, param7);
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                  } else {
                    break L30;
                  }
                }
                param5++;
                if (param5 >= en.field_d) {
                  return;
                } else {
                  var9 = var9 + var11;
                  var15 = var15 + bi.field_f;
                  var10 = var10 + var12;
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final static void b(int param0, int param1) {
        int discarded$0 = qo.b((byte) -122);
        int var2 = 100 / ((-19 - param0) / 35);
    }

    final int e(int param0) {
        if (!(!((wd) this).field_q)) {
            return 0;
        }
        if (param0 != -31478) {
            return -121;
        }
        return 100;
    }

    public static void g(int param0) {
        field_w = null;
        field_y = null;
        if (param0 != 1445852592) {
            Object var2 = null;
            wd.a(-38, 92, -57, -122, -91, 120, true, -19, (int[]) null);
        }
        field_z = null;
    }

    wd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var4 = 0;
        field_w = "Members";
        field_z = new int[50];
        double var0 = 0.0;
        double var2 = 0.12566370614359174;
        for (var4 = 0; -51 < (var4 ^ -1); var4++) {
            field_z[var4] = (int)(64.0 * Math.sin(var0)) + 192;
            var0 = var0 + var2;
        }
    }
}
