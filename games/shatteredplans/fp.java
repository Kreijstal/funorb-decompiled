/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fp {
    static int field_c;
    static pf field_b;
    static String field_a;

    abstract long a(int param0);

    final static hb a(pf param0, int param1) {
        if (param1 >= -39) {
            Object var3 = null;
            fp.a(-79, 121, 76, -123, 0, -125, (int[]) null, -35, -114);
        }
        return (hb) (Object) new un(param0);
    }

    final int a(long param0, int param1) {
        long var4 = 0L;
        L0: {
          var4 = ((fp) this).a(0);
          if (var4 > 0L) {
            jb.a((byte) -115, var4);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != -1) {
          return 113;
        } else {
          return ((fp) this).a(18907, param0);
        }
    }

    abstract int a(int param0, long param1);

    abstract void b(int param0);

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 47) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8) {
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
        L0: {
          var19 = ShatteredPlansClient.field_F ? 1 : 0;
          if (0 > param8) {
            break L0;
          } else {
            if (param7 < wn.field_e) {
              L1: {
                if (param3 >= 0) {
                  break L1;
                } else {
                  if (param1 >= 0) {
                    break L1;
                  } else {
                    if (param0 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (param3 < wn.field_c) {
                  break L2;
                } else {
                  if (param1 < wn.field_c) {
                    break L2;
                  } else {
                    if (wn.field_c <= param0) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param2 < -90) {
                  break L3;
                } else {
                  var20 = null;
                  hb discarded$1 = fp.a((pf) null, 68);
                  break L3;
                }
              }
              L4: {
                L5: {
                  var14 = -param7 + param8;
                  if (param5 == param7) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var10 = param3 << 1151539632;
                        var9 = param3 << 1151539632;
                        var15 = param5 - param7;
                        var11 = (param1 - param3 << -1391019088) / var15;
                        var12 = (-param3 + param0 << 1662837520) / var14;
                        if (var11 < var12) {
                          break L7;
                        } else {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
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
                        if (0 <= param7) {
                          var16 = wn.field_h[param7];
                          L10: while (true) {
                            if (param7 >= param5) {
                              break L8;
                            } else {
                              L11: {
                                var17 = var9 >> -2099851440;
                                if ((wn.field_c ^ -1) >= (var17 ^ -1)) {
                                  break L11;
                                } else {
                                  L12: {
                                    var18 = -(var9 >> 110414640) + (var10 >> 946831920);
                                    if (var18 != 0) {
                                      break L12;
                                    } else {
                                      if (var17 < 0) {
                                        break L11;
                                      } else {
                                        if (var17 >= wn.field_c) {
                                          break L11;
                                        } else {
                                          dp.a(var17 + var16, param6, -1, param4, var18);
                                          if (0 == 0) {
                                            break L11;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L13: {
                                    if (wn.field_c <= var17 + var18) {
                                      var18 = -1 + wn.field_c + -var17;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    if (var17 >= 0) {
                                      break L14;
                                    } else {
                                      dp.a(var16, param6, -1, param4, var17 + var18);
                                      if (0 == 0) {
                                        break L11;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  dp.a(var17 + var16, param6, -1, param4, var18);
                                  break L11;
                                }
                              }
                              param7++;
                              if (wn.field_e <= param7) {
                                return;
                              } else {
                                var10 = var10 + var12;
                                var16 = var16 + gf.field_b;
                                var9 = var9 + var11;
                                if (0 == 0) {
                                  continue L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        } else {
                          L15: {
                            if (param5 >= 0) {
                              break L15;
                            } else {
                              param7 = -param7 + param5;
                              var10 = var10 + var12 * param7;
                              var9 = var9 + param7 * var11;
                              param7 = param5;
                              if (0 == 0) {
                                break L8;
                              } else {
                                break L15;
                              }
                            }
                          }
                          param7 = -param7;
                          var9 = var9 + param7 * var11;
                          var10 = var10 + var12 * param7;
                          param7 = 0;
                          break L9;
                        }
                      }
                      var16 = wn.field_h[param7];
                      L16: while (true) {
                        if (param7 >= param5) {
                          break L8;
                        } else {
                          L17: {
                            var17 = var9 >> -2099851440;
                            if ((wn.field_c ^ -1) >= (var17 ^ -1)) {
                              break L17;
                            } else {
                              L18: {
                                var18 = -(var9 >> 110414640) + (var10 >> 946831920);
                                if (var18 != 0) {
                                  break L18;
                                } else {
                                  if (var17 < 0) {
                                    break L17;
                                  } else {
                                    if (var17 >= wn.field_c) {
                                      break L17;
                                    } else {
                                      dp.a(var17 + var16, param6, -1, param4, var18);
                                      if (0 == 0) {
                                        break L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                              }
                              L19: {
                                if (wn.field_c <= var17 + var18) {
                                  var18 = -1 + wn.field_c + -var17;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              L20: {
                                if (var17 >= 0) {
                                  break L20;
                                } else {
                                  dp.a(var16, param6, -1, param4, var17 + var18);
                                  if (0 == 0) {
                                    break L17;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              dp.a(var17 + var16, param6, -1, param4, var18);
                              break L17;
                            }
                          }
                          param7++;
                          if (wn.field_e <= param7) {
                            return;
                          } else {
                            var10 = var10 + var12;
                            var16 = var16 + gf.field_b;
                            var9 = var9 + var11;
                            if (0 == 0) {
                              continue L16;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    L21: {
                      L22: {
                        var16 = param8 - param5;
                        if (var16 == 0) {
                          break L22;
                        } else {
                          L23: {
                            L24: {
                              if (var13 == 0) {
                                break L24;
                              } else {
                                var10 = param1 << -1894651024;
                                if (0 == 0) {
                                  break L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            var9 = param1 << -1868537488;
                            break L23;
                          }
                          var17 = param0 << -274977232;
                          var11 = (var17 - var9) / var16;
                          var12 = (var17 - var10) / var16;
                          if (0 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var11 = 0;
                      var12 = 0;
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
                    if (param7 == param8) {
                      break L26;
                    } else {
                      L27: {
                        L28: {
                          var15 = param8 - param5;
                          if (param3 >= param1) {
                            break L28;
                          } else {
                            var10 = param1 << 1704507920;
                            var12 = (param0 + -param1 << -1997523152) / var15;
                            var9 = param3 << -1818782640;
                            var11 = (param0 - param3 << 926034672) / var14;
                            if (0 == 0) {
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                        var10 = param3 << -294493136;
                        var12 = (param0 + -param3 << -2068482832) / var14;
                        var11 = (-param1 + param0 << -523655024) / var15;
                        var9 = param1 << 675119056;
                        break L27;
                      }
                      if (0 == 0) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  var9 = param3 << -2044834736;
                  var11 = 0;
                  var12 = 0;
                  var10 = param1 << -1028325968;
                  break L25;
                }
                L29: {
                  if (0 <= param7) {
                    break L29;
                  } else {
                    param7 = Math.min(-param7, -param7 + param5);
                    var9 = var9 + param7 * var11;
                    var10 = var10 + var12 * param7;
                    param7 = 0;
                    break L29;
                  }
                }
                var13 = 0;
                break L4;
              }
              L30: {
                if (param7 < 0) {
                  param7 = -param7;
                  var9 = var9 + param7 * var11;
                  var10 = var10 + var12 * param7;
                  param7 = 0;
                  break L30;
                } else {
                  break L30;
                }
              }
              var15 = wn.field_h[param7];
              if (param8 > param7) {
                L31: {
                  var16 = var9 >> -559966736;
                  if (var16 < wn.field_c) {
                    L32: {
                      var17 = (var10 >> 139189104) - (var9 >> -1432175600);
                      if (var17 == 0) {
                        break L32;
                      } else {
                        L33: {
                          if (var16 - -var17 < wn.field_c) {
                            break L33;
                          } else {
                            var17 = -1 + wn.field_c + -var16;
                            break L33;
                          }
                        }
                        L34: {
                          if (var16 < 0) {
                            break L34;
                          } else {
                            dp.a(var16 + var15, param6, -1, param4, var17);
                            if (0 == 0) {
                              break L31;
                            } else {
                              break L34;
                            }
                          }
                        }
                        dp.a(var15, param6, -1, param4, var17 - -var16);
                        if (0 == 0) {
                          break L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                    if (var16 < 0) {
                      break L31;
                    } else {
                      if (wn.field_c <= var16) {
                        break L31;
                      } else {
                        dp.a(var15 + var16, param6, -1, param4, var17);
                        break L31;
                      }
                    }
                  } else {
                    break L31;
                  }
                }
                param7++;
                if (param7 >= wn.field_e) {
                  return;
                } else {
                  var15 = var15 + gf.field_b;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Names should contain a maximum of 12 characters";
    }
}
