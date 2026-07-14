/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class k extends pj implements hf {
    static String field_i;
    static pi field_h;
    static String field_j;
    private vb field_g;

    final qh c(int param0) {
        if (param0 != 4) {
            field_i = null;
        }
        return ((k) this).a(((k) this).field_g.field_A, (byte) 106);
    }

    abstract qh a(String param0, byte param1);

    final static void d(byte param0) {
        if (param0 < 114) {
            return;
        }
        ga.d(-105);
    }

    abstract String a(int param0, String param1);

    public final void a(vb param0, byte param1) {
        if (param1 > -39) {
            field_h = null;
        }
        ((k) this).a(false);
    }

    final static jp a(jp param0, int param1, int param2) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        jp var3 = new jp(param0.field_x, param2 * param0.field_z);
        var3.g();
        if (param1 <= 74) {
            field_i = null;
        }
        for (var4 = 0; var4 < param2; var4++) {
            param0.c(0, param0.field_z * var4);
        }
        kc.field_q.a((byte) 89);
        return var3;
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8) {
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
          var19 = BrickABrac.field_J ? 1 : 0;
          if (param4 < 0) {
            break L0;
          } else {
            if (mg.field_b <= param2) {
              break L0;
            } else {
              L1: {
                if (param7 >= param8) {
                  break L1;
                } else {
                  if (param0 >= 0) {
                    break L1;
                  } else {
                    if (param1 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (mg.field_e > param7) {
                  break L2;
                } else {
                  if (param0 < mg.field_e) {
                    break L2;
                  } else {
                    if (param1 >= mg.field_e) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                L4: {
                  var14 = -param2 + param4;
                  if (param5 == param2) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        var10 = param7 << 994879696;
                        var9 = param7 << 994879696;
                        var15 = -param2 + param5;
                        var11 = (param0 + -param7 << -805305904) / var15;
                        var12 = (-param7 + param1 << -38851376) / var14;
                        if (var11 >= var12) {
                          break L6;
                        } else {
                          var13 = 0;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var16 = var11;
                      var11 = var12;
                      var12 = var16;
                      var13 = 1;
                      break L5;
                    }
                    L7: {
                      L8: {
                        if (0 > param2) {
                          L9: {
                            if (param5 < 0) {
                              break L9;
                            } else {
                              param2 = -param2;
                              var10 = var10 + var12 * param2;
                              var9 = var9 + param2 * var11;
                              param2 = 0;
                              if (0 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          param2 = param5 + -param2;
                          var9 = var9 + param2 * var11;
                          var10 = var10 + var12 * param2;
                          param2 = param5;
                          if (0 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                      var16 = mg.field_g[param2];
                      L10: while (true) {
                        if (param5 <= param2) {
                          break L7;
                        } else {
                          L11: {
                            var17 = var9 >> -544451152;
                            if (mg.field_e > var17) {
                              L12: {
                                var18 = -(var9 >> -1022341744) + (var10 >> -720422576);
                                if (var18 == 0) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (mg.field_e > var17 - -var18) {
                                      break L13;
                                    } else {
                                      var18 = -1 + -var17 + mg.field_e;
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    if (var17 < 0) {
                                      break L14;
                                    } else {
                                      wc.a(param3, var18, param6, var17 + var16, param8 ^ -1);
                                      if (0 == 0) {
                                        break L11;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  wc.a(param3, var17 + var18, param6, var16, -1);
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
                                if (mg.field_e > var17) {
                                  wc.a(param3, var18, param6, var16 + var17, -1);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            } else {
                              break L11;
                            }
                          }
                          param2++;
                          if (param2 < mg.field_b) {
                            var9 = var9 + var11;
                            var16 = var16 + lb.field_c;
                            var10 = var10 + var12;
                            if (0 == 0) {
                              continue L10;
                            } else {
                              break L7;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    L15: {
                      L16: {
                        var16 = param4 - param5;
                        if (var16 != 0) {
                          break L16;
                        } else {
                          var12 = 0;
                          var11 = 0;
                          if (0 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        L18: {
                          var17 = param1 << -1523235760;
                          if (var13 == 0) {
                            break L18;
                          } else {
                            var10 = param0 << 572116688;
                            if (0 == 0) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        var9 = param0 << -873378960;
                        break L17;
                      }
                      var12 = (-var10 + var17) / var16;
                      var11 = (var17 - var9) / var16;
                      break L15;
                    }
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L19: {
                  L20: {
                    if (param4 == param2) {
                      break L20;
                    } else {
                      L21: {
                        L22: {
                          var15 = -param5 + param4;
                          if (param0 > param7) {
                            break L22;
                          } else {
                            var9 = param0 << -5134896;
                            var10 = param7 << -137846928;
                            var12 = (param1 + -param7 << -1722177744) / var14;
                            var11 = (-param0 + param1 << -787898512) / var15;
                            if (0 == 0) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        var10 = param0 << -175637872;
                        var11 = (-param7 + param1 << 1105152400) / var14;
                        var12 = (param1 - param0 << 125600272) / var15;
                        var9 = param7 << -630793264;
                        break L21;
                      }
                      if (0 == 0) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  var9 = param7 << 1594785392;
                  var11 = 0;
                  var10 = param0 << -435587344;
                  var12 = 0;
                  break L19;
                }
                L23: {
                  if (param2 < 0) {
                    param2 = Math.min(-param2, -param2 + param5);
                    var10 = var10 + param2 * var12;
                    var9 = var9 + var11 * param2;
                    param2 = 0;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                var13 = 0;
                break L3;
              }
              L24: {
                if (param2 >= 0) {
                  break L24;
                } else {
                  param2 = -param2;
                  var9 = var9 + var11 * param2;
                  var10 = var10 + param2 * var12;
                  param2 = 0;
                  break L24;
                }
              }
              L25: {
                var15 = mg.field_g[param2];
                if (param2 >= param4) {
                  break L25;
                } else {
                  L26: {
                    var16 = var9 >> -1605646512;
                    if (mg.field_e > var16) {
                      L27: {
                        var17 = (var10 >> -137266864) + -(var9 >> -1139778160);
                        if (var17 == 0) {
                          break L27;
                        } else {
                          L28: {
                            if (mg.field_e > var16 - -var17) {
                              break L28;
                            } else {
                              var17 = -1 + mg.field_e + -var16;
                              break L28;
                            }
                          }
                          L29: {
                            if (var16 >= 0) {
                              break L29;
                            } else {
                              wc.a(param3, var17 + var16, param6, var15, -1);
                              if (0 == 0) {
                                break L26;
                              } else {
                                break L29;
                              }
                            }
                          }
                          wc.a(param3, var17, param6, var16 - -var15, -1);
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
                        if (var16 >= mg.field_e) {
                          break L26;
                        } else {
                          wc.a(param3, var17, param6, var16 + var15, -1);
                          break L26;
                        }
                      }
                    } else {
                      break L26;
                    }
                  }
                  param2++;
                  if (param2 >= mg.field_b) {
                    return;
                  } else {
                    var15 = var15 + lb.field_c;
                    var9 = var9 + var11;
                    var10 = var10 + var12;
                    break L25;
                  }
                }
              }
              return;
            }
          }
        }
    }

    public static void c(byte param0) {
        field_i = null;
        field_j = null;
        field_h = null;
        if (param0 > -73) {
            field_i = null;
        }
    }

    final String b(int param0) {
        if (param0 != 28600) {
            field_j = null;
        }
        return ((k) this).a(56, ((k) this).field_g.field_A);
    }

    public final boolean a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0;
        int stackOut_5_0;
        L0: {
          if (param0 <= -27) {
            break L0;
          } else {
            k.d((byte) 112);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((k) this).field_g.field_A == null) {
              break L2;
            } else {
              if (0 != ((k) this).field_g.field_A.length()) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    k(vb param0) {
        ((k) this).field_g = param0;
    }

    public final void a(vb param0, int param1) {
        if (param1 != -40) {
            Object var4 = null;
            qh discarded$0 = ((k) this).a((String) null, (byte) -114);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "OK";
        field_i = "Staff impersonation";
    }
}
