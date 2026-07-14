/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    int field_u;
    boolean[] field_I;
    int field_B;
    int[] field_l;
    int[] field_a;
    int[][] field_f;
    int[][] field_i;
    int field_F;
    int field_d;
    int[] field_p;
    byte[] field_G;
    int field_K;
    int field_j;
    static int field_y;
    byte[] field_z;
    int field_w;
    int field_n;
    int field_q;
    int field_g;
    byte field_o;
    int field_m;
    static int field_t;
    int field_C;
    byte[] field_H;
    static int[] field_h;
    byte[] field_J;
    int field_A;
    int field_c;
    byte[] field_s;
    byte[] field_D;
    byte[][] field_v;
    static String field_k;
    boolean[] field_b;
    int field_r;
    int[] field_x;
    int[][] field_e;

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
            mg.a(true);
        }
        field_k = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
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
          var19 = stellarshard.field_B;
          if (param0 < 0) {
            break L0;
          } else {
            if (param4 < cc.field_c) {
              L1: {
                if (param3 >= 0) {
                  break L1;
                } else {
                  if (param7 >= 0) {
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
                if (param3 < cc.field_m) {
                  break L2;
                } else {
                  if (param7 < cc.field_m) {
                    break L2;
                  } else {
                    if (param1 >= cc.field_m) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param6 == -445834032) {
                  break L3;
                } else {
                  mg.a(false);
                  break L3;
                }
              }
              L4: {
                L5: {
                  var14 = param0 + -param4;
                  if (param4 == param8) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var10 = param3 << 1781485936;
                        var9 = param3 << 1781485936;
                        var15 = -param4 + param8;
                        var11 = (-param3 + param7 << 1807727792) / var15;
                        var12 = (-param3 + param1 << 891780240) / var14;
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
                        if (param4 >= 0) {
                          break L9;
                        } else {
                          L10: {
                            if (param8 < 0) {
                              break L10;
                            } else {
                              param4 = -param4;
                              var10 = var10 + param4 * var12;
                              var9 = var9 + param4 * var11;
                              param4 = 0;
                              if (0 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param4 = param8 + -param4;
                          var9 = var9 + param4 * var11;
                          var10 = var10 + param4 * var12;
                          param4 = param8;
                          if (0 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var16 = cc.field_i[param4];
                      L11: while (true) {
                        if (param8 <= param4) {
                          break L8;
                        } else {
                          L12: {
                            var17 = var9 >> 2016565744;
                            if (var17 < cc.field_m) {
                              L13: {
                                var18 = -(var9 >> -450695600) + (var10 >> 650545424);
                                if (var18 == 0) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (var18 + var17 >= cc.field_m) {
                                      var18 = -var17 + cc.field_m + -1;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    if (var17 >= 0) {
                                      break L15;
                                    } else {
                                      aj.a(param5, true, var17 + var18, param2, var16);
                                      if (0 == 0) {
                                        break L12;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  aj.a(param5, true, var18, param2, var17 - -var16);
                                  if (0 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (var17 < 0) {
                                break L12;
                              } else {
                                if (var17 >= cc.field_m) {
                                  break L12;
                                } else {
                                  aj.a(param5, true, var18, param2, var17 - -var16);
                                  break L12;
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                          param4++;
                          if (param4 >= cc.field_c) {
                            return;
                          } else {
                            var16 = var16 + ti.field_i;
                            var9 = var9 + var11;
                            var10 = var10 + var12;
                            if (0 == 0) {
                              continue L11;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      L17: {
                        var16 = -param8 + param0;
                        if (0 != var16) {
                          break L17;
                        } else {
                          var12 = 0;
                          var11 = 0;
                          if (0 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L18: {
                        L19: {
                          var17 = param1 << -1782699248;
                          if (var13 != 0) {
                            break L19;
                          } else {
                            var9 = param7 << 1583416656;
                            if (0 == 0) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        var10 = param7 << -2100733392;
                        break L18;
                      }
                      var11 = (-var9 + var17) / var16;
                      var12 = (var17 + -var10) / var16;
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
                    if (param4 == param0) {
                      break L21;
                    } else {
                      L22: {
                        L23: {
                          var15 = -param8 + param0;
                          if (param3 < param7) {
                            break L23;
                          } else {
                            var10 = param3 << -352238320;
                            var11 = (param1 + -param7 << 1590199120) / var15;
                            var9 = param7 << -1533066512;
                            var12 = (-param3 + param1 << 728384272) / var14;
                            if (0 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        var12 = (param1 - param7 << -157546096) / var15;
                        var9 = param3 << 15965520;
                        var11 = (-param3 + param1 << -1323619184) / var14;
                        var10 = param7 << 701339280;
                        break L22;
                      }
                      if (0 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  var12 = 0;
                  var9 = param3 << -445834032;
                  var10 = param7 << 819412752;
                  var11 = 0;
                  break L20;
                }
                L24: {
                  if (0 > param4) {
                    param4 = Math.min(-param4, -param4 + param8);
                    var10 = var10 + param4 * var12;
                    var9 = var9 + param4 * var11;
                    param4 = 0;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                var13 = 0;
                break L4;
              }
              L25: {
                if (param4 >= 0) {
                  break L25;
                } else {
                  param4 = -param4;
                  var9 = var9 + param4 * var11;
                  var10 = var10 + var12 * param4;
                  param4 = 0;
                  break L25;
                }
              }
              var15 = cc.field_i[param4];
              if (param0 > param4) {
                L26: {
                  var16 = var9 >> -1103451824;
                  if (var16 < cc.field_m) {
                    L27: {
                      var17 = -(var9 >> 1058143952) + (var10 >> 413223728);
                      if (0 == var17) {
                        break L27;
                      } else {
                        L28: {
                          if (var17 + var16 >= cc.field_m) {
                            var17 = -var16 + (cc.field_m + -1);
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        L29: {
                          if (var16 < 0) {
                            break L29;
                          } else {
                            aj.a(param5, true, var17, param2, var15 + var16);
                            if (0 == 0) {
                              break L26;
                            } else {
                              break L29;
                            }
                          }
                        }
                        aj.a(param5, true, var16 + var17, param2, var15);
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
                      if (cc.field_m <= var16) {
                        break L26;
                      } else {
                        aj.a(param5, true, var17, param2, var16 - -var15);
                        break L26;
                      }
                    }
                  } else {
                    break L26;
                  }
                }
                param4++;
                if (cc.field_c <= param4) {
                  return;
                } else {
                  var9 = var9 + var11;
                  var15 = var15 + ti.field_i;
                  var10 = var10 + var12;
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

    mg() {
        ((mg) this).field_f = new int[6][258];
        ((mg) this).field_l = new int[257];
        ((mg) this).field_I = new boolean[16];
        ((mg) this).field_u = 0;
        ((mg) this).field_G = new byte[18002];
        ((mg) this).field_i = new int[6][258];
        ((mg) this).field_z = new byte[4096];
        ((mg) this).field_a = new int[16];
        ((mg) this).field_r = 0;
        ((mg) this).field_p = new int[6];
        ((mg) this).field_v = new byte[6][258];
        ((mg) this).field_s = new byte[256];
        ((mg) this).field_b = new boolean[256];
        ((mg) this).field_x = new int[256];
        ((mg) this).field_e = new int[6][258];
        ((mg) this).field_J = new byte[18002];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 0;
        field_k = "Player";
    }
}
