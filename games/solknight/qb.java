/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends vg implements wj {
    private oe field_Y;
    static int[] field_ab;
    static da field_cb;
    private int field_Z;
    static wb field_L;
    static String field_X;
    static String[] field_W;
    static String field_bb;

    final void a(oe param0, boolean param1) {
        if (param1) {
            ((qb) this).j(68);
        }
        ((qb) this).field_Y = param0;
    }

    final static ud a(boolean param0, qi param1) {
        if (!param0) {
            field_ab = null;
        }
        ud var2 = new ud(param1, (gg) (Object) param1);
        uc.field_j.a((gg) (Object) var2, -7044);
        ti.field_f.a((ej) (Object) param1);
        return var2;
    }

    final void j(int param0) {
        super.j(-115);
        if (!(null == ((qb) this).field_Y)) {
            ((qb) this).field_Y.a((byte) -127);
        }
        int var2 = 82 % ((param0 - -67) / 44);
    }

    final String c(byte param0) {
        if (((qb) this).field_v) {
          if (null == ((qb) this).field_z) {
            return null;
          } else {
            L0: {
              if (param0 > 14) {
                break L0;
              } else {
                oe discarded$2 = ((qb) this).a(-32);
                break L0;
              }
            }
            ja.a(ad.field_m, gb.field_j + ((qb) this).field_t - ((qb) this).field_Z, (byte) -41);
            return ((qb) this).field_z;
          }
        } else {
          return null;
        }
    }

    qb(String param0, dg param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, int param2, rc param3) {
        super.a(param0, param1, param2, param3);
        ((qb) this).field_Z = -((qb) this).field_m + gb.field_j - param0;
    }

    public final oe a(int param0) {
        if (param0 <= 22) {
            return null;
        }
        return ((qb) this).field_Y;
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
        L0: {
          var19 = SolKnight.field_L ? 1 : 0;
          if (0 > param1) {
            break L0;
          } else {
            if (hk.field_a > param0) {
              L1: {
                if (param5 >= 0) {
                  break L1;
                } else {
                  if (0 <= param2) {
                    break L1;
                  } else {
                    if (param4 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (hk.field_i > param5) {
                  break L2;
                } else {
                  if (param2 < hk.field_i) {
                    break L2;
                  } else {
                    if (hk.field_i <= param4) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                L4: {
                  var14 = param1 + -param0;
                  if (param0 != param8) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        if (param1 != param0) {
                          break L6;
                        } else {
                          var11 = 0;
                          var10 = param2 << 683691216;
                          var9 = param5 << 52491888;
                          var12 = 0;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        var15 = -param8 + param1;
                        if (param2 > param5) {
                          break L7;
                        } else {
                          var9 = param2 << 1572534864;
                          var11 = (-param2 + param4 << -1121663312) / var15;
                          var12 = (-param5 + param4 << 443778768) / var14;
                          var10 = param5 << 1321325072;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var9 = param5 << 2093622896;
                      var12 = (-param2 + param4 << 1329580880) / var15;
                      var10 = param2 << 1976027664;
                      var11 = (-param5 + param4 << 1404301008) / var14;
                      break L5;
                    }
                    L8: {
                      if (param0 < 0) {
                        param0 = Math.min(-param0, param8 - param0);
                        var9 = var9 + var11 * param0;
                        var10 = var10 + var12 * param0;
                        param0 = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var13 = 0;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L9: {
                  L10: {
                    var10 = param5 << -642121360;
                    var9 = param5 << -642121360;
                    var15 = -param0 + param8;
                    var12 = (param4 - param5 << 2052610192) / var14;
                    var11 = (-param5 + param2 << 1898951536) / var15;
                    if (var12 > var11) {
                      break L10;
                    } else {
                      var13 = 1;
                      var16 = var11;
                      var11 = var12;
                      var12 = var16;
                      if (0 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var13 = 0;
                  break L9;
                }
                L11: {
                  L12: {
                    if (0 > param0) {
                      L13: {
                        if (param8 < 0) {
                          break L13;
                        } else {
                          param0 = -param0;
                          var9 = var9 + param0 * var11;
                          var10 = var10 + var12 * param0;
                          param0 = 0;
                          if (0 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      param0 = -param0 + param8;
                      var10 = var10 + param0 * var12;
                      var9 = var9 + param0 * var11;
                      param0 = param8;
                      if (0 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  var16 = hk.field_d[param0];
                  L14: while (true) {
                    if (param8 <= param0) {
                      break L11;
                    } else {
                      L15: {
                        var17 = var9 >> -1002808816;
                        if (var17 >= hk.field_i) {
                          break L15;
                        } else {
                          L16: {
                            var18 = -(var9 >> -1703864080) + (var10 >> -429786000);
                            if (0 == var18) {
                              break L16;
                            } else {
                              L17: {
                                if (var18 + var17 < hk.field_i) {
                                  break L17;
                                } else {
                                  var18 = hk.field_i + (-var17 + -1);
                                  break L17;
                                }
                              }
                              L18: {
                                if (var17 >= 0) {
                                  break L18;
                                } else {
                                  wd.a(0, var16, var17 + var18, param3, param7);
                                  if (0 == 0) {
                                    break L15;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              wd.a(0, var17 + var16, var18, param3, param7);
                              if (0 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          if (var17 < 0) {
                            break L15;
                          } else {
                            if (var17 >= hk.field_i) {
                              break L15;
                            } else {
                              wd.a(0, var16 + var17, var18, param3, param7);
                              break L15;
                            }
                          }
                        }
                      }
                      param0++;
                      if (param0 >= hk.field_a) {
                        return;
                      } else {
                        var9 = var9 + var11;
                        var16 = var16 + mi.field_a;
                        var10 = var10 + var12;
                        if (0 == 0) {
                          continue L14;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                }
                L19: {
                  var16 = param1 + -param8;
                  if (var16 == 0) {
                    break L19;
                  } else {
                    L20: {
                      L21: {
                        if (var13 != 0) {
                          break L21;
                        } else {
                          var9 = param2 << 2045014000;
                          if (0 == 0) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var10 = param2 << 530486256;
                      break L20;
                    }
                    var17 = param4 << 576940944;
                    var11 = (-var9 + var17) / var16;
                    var12 = (-var10 + var17) / var16;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L19;
                    }
                  }
                }
                var11 = 0;
                var12 = 0;
                break L3;
              }
              if (param6 >= 31) {
                L22: {
                  if (param0 >= 0) {
                    break L22;
                  } else {
                    param0 = -param0;
                    var9 = var9 + var11 * param0;
                    var10 = var10 + var12 * param0;
                    param0 = 0;
                    break L22;
                  }
                }
                var15 = hk.field_d[param0];
                if (param1 > param0) {
                  L23: {
                    var16 = var9 >> -967566704;
                    if (var16 < hk.field_i) {
                      L24: {
                        var17 = (var10 >> 1105812848) - (var9 >> -2004820752);
                        if (var17 != 0) {
                          break L24;
                        } else {
                          if (0 > var16) {
                            break L23;
                          } else {
                            if (hk.field_i > var16) {
                              wd.a(0, var16 - -var15, var17, param3, param7);
                              if (0 == 0) {
                                break L23;
                              } else {
                                break L24;
                              }
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      L25: {
                        if (var17 + var16 >= hk.field_i) {
                          var17 = -1 + hk.field_i - var16;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      L26: {
                        if (0 <= var16) {
                          break L26;
                        } else {
                          wd.a(0, var15, var17 - -var16, param3, param7);
                          if (0 == 0) {
                            break L23;
                          } else {
                            break L26;
                          }
                        }
                      }
                      wd.a(0, var16 + var15, var17, param3, param7);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  param0++;
                  if (param0 >= hk.field_a) {
                    return;
                  } else {
                    var10 = var10 + var12;
                    var9 = var9 + var11;
                    var15 = var15 + mi.field_a;
                    return;
                  }
                } else {
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

    public static void f(byte param0) {
        field_cb = null;
        int var1 = 113 / ((-12 - param0) / 49);
        field_L = null;
        field_X = null;
        field_ab = null;
        field_bb = null;
        field_W = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = new int[8192];
        field_L = new wb(2);
        field_X = "COMBO<br>BONUS";
        field_bb = "Loading fonts";
        field_W = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
