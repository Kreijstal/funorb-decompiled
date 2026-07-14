/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends mn {
    private int field_J;
    private int field_E;
    static hi field_z;
    private int[] field_H;
    static wk field_A;
    static String field_y;
    static wk[] field_C;
    private int field_G;
    static sn[] field_v;
    static long[] field_I;
    static String field_F;
    static int[] field_D;
    static int field_x;
    static byte[] field_B;
    static int[] field_K;
    private int field_w;

    private final String a(String[] param0, int param1) {
        if (param1 != 0) {
            field_z = null;
        }
        return ((am) this).a(118, param0, "move");
    }

    public static void e(int param0) {
        field_C = null;
        field_D = null;
        field_z = null;
        field_F = null;
        field_K = null;
        field_y = null;
        field_B = null;
        field_I = null;
        if (param0 != -1) {
            field_D = null;
        }
        field_v = null;
        field_A = null;
    }

    private final bd a(jd param0, byte param1, ha param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!param0.field_s) {
          if ((((am) this).field_H.length ^ -1) == -2) {
            L0: {
              var4 = ((am) this).field_J;
              var5 = ((am) this).field_G;
              var6 = ((am) this).field_H[0];
              if (1 != var6) {
                if (0 == var6) {
                  var4++;
                  break L0;
                } else {
                  if ((var6 ^ -1) == -3) {
                    var5++;
                    break L0;
                  } else {
                    if (var6 == 3) {
                      var4--;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
              } else {
                var5--;
                break L0;
              }
            }
            L1: {
              if (var4 < 0) {
                break L1;
              } else {
                if (-1 < (var5 ^ -1)) {
                  break L1;
                } else {
                  if (var4 >= param2.field_v) {
                    break L1;
                  } else {
                    if (param2.field_db <= var5) {
                      break L1;
                    } else {
                      if (param1 == 32) {
                        L2: {
                          var6 = param2.field_Eb[var5 * param2.field_v + var4].field_h;
                          if (2 == var6) {
                            break L2;
                          } else {
                            if (4 == var6) {
                              break L2;
                            } else {
                              if ((var6 ^ -1) == -7) {
                                break L2;
                              } else {
                                return (bd) (Object) new pe(var4, var5, ((am) this).field_J, ((am) this).field_G, param0.field_Y, ((am) this).field_p);
                              }
                            }
                          }
                        }
                        String discarded$4 = ((am) this).a(120, new String[4], "vine growth");
                        return null;
                      } else {
                        return null;
                      }
                    }
                  }
                }
              }
            }
            String discarded$5 = ((am) this).a(127, new String[3], "vine growth");
            return null;
          } else {
            String discarded$6 = ((am) this).a(-98, new String[3], "vine growth");
            return null;
          }
        } else {
          String discarded$7 = ((am) this).a(-84, new String[3], "vine growth");
          return null;
        }
    }

    final bd a(int param0, ha param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        jd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        jd var16 = null;
        jd var17 = null;
        int stackIn_15_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_91_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((am) this).d(-107);
        var16 = param1.c(((am) this).field_G, true, ((am) this).field_J);
        var17 = var16;
        if (var17 != null) {
          L0: {
            if (((am) this).field_p == var17.field_O) {
              break L0;
            } else {
              if (((am) this).field_u) {
                break L0;
              } else {
                String discarded$4 = this.a(new String[3], 0);
                return null;
              }
            }
          }
          L1: {
            if ((var17.field_N ^ -1) == -52) {
              break L1;
            } else {
              L2: {
                if ((((am) this).field_o ^ -1) >= 0) {
                  break L2;
                } else {
                  if (uc.field_d[((am) this).field_o][5] == -25) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-40 != var17.field_N) {
                L3: {
                  if (!var17.field_s) {
                    stackOut_14_0 = 3 * bw.field_m[var16.field_N][3];
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var4 = stackIn_15_0;
                  if (0 == (param1.b(31, var17.field_w, var17.field_J, var17.field_O) & 4)) {
                    break L4;
                  } else {
                    if (null == ((am) this).field_H) {
                      break L4;
                    } else {
                      if (((am) this).field_H.length > 0) {
                        var4 = 0;
                        String discarded$5 = this.a(new String[3], 0);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if ((((am) this).field_o ^ -1) >= 0) {
                    break L5;
                  } else {
                    if (uc.field_d[((am) this).field_o][5] == 18) {
                      var4 = var4 << 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (7 != var17.field_P) {
                    break L6;
                  } else {
                    var4 = var4 >> 1;
                    break L6;
                  }
                }
                L7: {
                  if (-9 != (var17.field_P ^ -1)) {
                    break L7;
                  } else {
                    var4 = 0;
                    break L7;
                  }
                }
                var5 = ((am) this).field_J;
                var6 = ((am) this).field_G;
                var7 = 0;
                L8: while (true) {
                  L9: {
                    if (((am) this).field_H.length <= var7) {
                      break L9;
                    } else {
                      if (-1 <= (var4 ^ -1)) {
                        break L9;
                      } else {
                        L10: {
                          var8_int = param1.field_v * var6 + var5;
                          var9 = ((am) this).field_H[var7];
                          if ((var9 ^ -1) == -2) {
                            var6--;
                            break L10;
                          } else {
                            if (0 != var9) {
                              if (var9 == 2) {
                                var6++;
                                break L10;
                              } else {
                                if (3 != var9) {
                                  break L10;
                                } else {
                                  var5--;
                                  break L10;
                                }
                              }
                            } else {
                              var5++;
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (0 > var5) {
                            break L11;
                          } else {
                            if (0 > var6) {
                              break L11;
                            } else {
                              if (param1.field_v <= var5) {
                                break L11;
                              } else {
                                if (param1.field_db <= var6) {
                                  break L11;
                                } else {
                                  var9 = param1.a(var8_int, -16, var5 + param1.field_v * var6, var17.field_O, var17, true);
                                  if (var9 <= var4) {
                                    var4 = var4 - var9;
                                    var7++;
                                    continue L8;
                                  } else {
                                    ((am) this).field_w = 0;
                                    ((am) this).field_E = 0;
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                        }
                        String discarded$6 = this.a(new String[3], 0);
                        return null;
                      }
                    }
                  }
                  L12: {
                    if (-1 == (var17.field_B ^ -1)) {
                      ((am) this).field_E = 0;
                      ((am) this).field_w = 0;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    var8 = param1.c(((am) this).field_E + var6, true, var5 + ((am) this).field_w);
                    if (var8 == null) {
                      ((am) this).field_E = 0;
                      ((am) this).field_w = 0;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (-1 >= (((am) this).field_w ^ -1)) {
                      stackOut_58_0 = 1;
                      stackIn_59_0 = stackOut_58_0;
                      break L14;
                    } else {
                      stackOut_57_0 = -1;
                      stackIn_59_0 = stackOut_57_0;
                      break L14;
                    }
                  }
                  L15: {
                    var9 = stackIn_59_0;
                    if (0 <= ((am) this).field_E) {
                      stackOut_61_0 = 1;
                      stackIn_62_0 = stackOut_61_0;
                      break L15;
                    } else {
                      stackOut_60_0 = -1;
                      stackIn_62_0 = stackOut_60_0;
                      break L15;
                    }
                  }
                  L16: {
                    var10 = stackIn_62_0;
                    var11 = var9 * ((am) this).field_w - -(((am) this).field_E * var10);
                    var12 = bw.field_m[var17.field_N][6];
                    var13 = bw.field_m[var17.field_N][7];
                    if (!var17.field_W) {
                      break L16;
                    } else {
                      if (var17.field_N != 34) {
                        break L16;
                      } else {
                        var12 = 2;
                        var13 = 7;
                        if (var17.j(20640) == 3) {
                          var13 = var13 + var17.d(1, 57);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  L17: {
                    L18: {
                      if (81 == var17.field_N) {
                        break L18;
                      } else {
                        if (4 == var17.field_N) {
                          break L18;
                        } else {
                          L19: {
                            if (var17.field_N != -75) {
                              break L19;
                            } else {
                              if (3 == var17.j(20640)) {
                                break L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          L20: {
                            if (-4 != var17.g(0)) {
                              break L20;
                            } else {
                              if (var17.j(20640) != 2) {
                                break L20;
                              } else {
                                var13 = var13 + var17.d(1, -108);
                                break L17;
                              }
                            }
                          }
                          if (2 != var17.g(0)) {
                            break L17;
                          } else {
                            if (-2 == (var17.j(20640) ^ -1)) {
                              var13 = var13 + var17.d(1, -87);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    var13 = var13 + var17.d(1, 118);
                    break L17;
                  }
                  L21: {
                    if (param0 >= 31) {
                      break L21;
                    } else {
                      field_I = null;
                      break L21;
                    }
                  }
                  L22: {
                    L23: {
                      if (1 >= var11) {
                        break L23;
                      } else {
                        L24: {
                          if (var12 > var11) {
                            break L24;
                          } else {
                            if (var11 <= var13) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        ((am) this).field_E = 0;
                        ((am) this).field_w = 0;
                        break L22;
                      }
                    }
                    if (1 >= var11) {
                      if (var11 != 1) {
                        break L22;
                      } else {
                        if (4 != var8.g(0)) {
                          break L22;
                        } else {
                          if (var17.j((byte) 78)) {
                            break L22;
                          } else {
                            ((am) this).field_w = 0;
                            ((am) this).field_E = 0;
                            break L22;
                          }
                        }
                      }
                    } else {
                      L25: {
                        if (-5 != (bw.field_m[var17.field_N][0] ^ -1)) {
                          stackOut_90_0 = 0;
                          stackIn_91_0 = stackOut_90_0;
                          break L25;
                        } else {
                          stackOut_89_0 = 1;
                          stackIn_91_0 = stackOut_89_0;
                          break L25;
                        }
                      }
                      L26: {
                        var14 = stackIn_91_0;
                        if (param1.field_j.a(var6, ((am) this).field_w + var5, var5, var14 == 0, var13, ((am) this).field_E + var6, (byte) 81)) {
                          ((am) this).field_w = 0;
                          ((am) this).field_E = 0;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      L27: {
                        if (-1 != (param1.b(31, var6 + ((am) this).field_E, var5 + ((am) this).field_w, var17.field_O) & 2 ^ -1)) {
                          break L27;
                        } else {
                          if (0 != (param1.b(31, var6, var5, var17.field_O) & 2)) {
                            break L27;
                          } else {
                            break L22;
                          }
                        }
                      }
                      ((am) this).field_w = 0;
                      ((am) this).field_E = 0;
                      break L22;
                    }
                  }
                  if (var7 == 0) {
                    if (((am) this).field_w == 0) {
                      if (0 == ((am) this).field_E) {
                        return null;
                      } else {
                        return (bd) (Object) new ld(((am) this).field_J, ((am) this).field_G, ((am) this).field_H, var7, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, var17, param1.c(var6 + ((am) this).field_E, true, ((am) this).field_w + var5));
                      }
                    } else {
                      return (bd) (Object) new ld(((am) this).field_J, ((am) this).field_G, ((am) this).field_H, var7, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, var17, param1.c(var6 + ((am) this).field_E, true, ((am) this).field_w + var5));
                    }
                  } else {
                    return (bd) (Object) new ld(((am) this).field_J, ((am) this).field_G, ((am) this).field_H, var7, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, var17, param1.c(var6 + ((am) this).field_E, true, ((am) this).field_w + var5));
                  }
                }
              } else {
                return this.a(var17, (byte) 32, param1);
              }
            }
          }
          return this.a(param1, 0, var17);
        } else {
          String discarded$7 = this.a(new String[2], 0);
          return null;
        }
    }

    private final bd a(ha param0, int param1, jd param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var4 = ((am) this).field_J - -((am) this).field_w;
          var5 = ((am) this).field_G - -((am) this).field_E;
          if ((var4 ^ -1) > -1) {
            break L0;
          } else {
            if (var5 < 0) {
              break L0;
            } else {
              if (param0.field_v <= var4) {
                break L0;
              } else {
                if (param0.field_db > var5) {
                  L1: {
                    var6 = param0.field_Eb[var4 + var5 * param0.field_v].field_h;
                    if ((var6 ^ -1) == -3) {
                      break L1;
                    } else {
                      if (var6 == 4) {
                        break L1;
                      } else {
                        if (var6 == 6) {
                          break L1;
                        } else {
                          if (param1 > (((am) this).field_o ^ -1)) {
                            if (uc.field_d[((am) this).field_o][5] == 24) {
                              return (bd) (Object) new ur(((am) this).field_J, ((am) this).field_G, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, param2, false);
                            } else {
                              return (bd) (Object) new ur(((am) this).field_J, ((am) this).field_G, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, param2, true);
                            }
                          } else {
                            return (bd) (Object) new ur(((am) this).field_J, ((am) this).field_G, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, param2, true);
                          }
                        }
                      }
                    }
                  }
                  String discarded$2 = ((am) this).a(126, new String[4], "teleport");
                  return null;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        String discarded$3 = ((am) this).a(param1 + 124, new String[3], "teleport");
        return null;
    }

    am(vh param0, int param1) {
        int var5 = 0;
        ((am) this).field_p = param1;
        int var3 = param0.e((byte) -104) & 8191;
        ((am) this).field_H = new int[var3];
        ((am) this).field_J = param0.k(0);
        ((am) this).field_G = param0.k(0);
        int var4 = 0;
        for (var5 = 0; var3 > var5; var5++) {
            if (0 == var5 % 4) {
                var4 = param0.k(0);
            }
            ((am) this).field_H[var5] = rn.a(3, var4);
            var4 = var4 >> 2;
        }
        var4 = param0.e((byte) -104);
        if (var4 == 0) {
            ((am) this).field_w = 0;
            ((am) this).field_E = 0;
        } else {
            ((am) this).field_E = 255 & var4;
            ((am) this).field_w = var4 >> 1915640040;
            ((am) this).field_E = (((am) this).field_E ^ 128) + -128;
            ((am) this).field_w = -128 + (((am) this).field_w ^ 128);
        }
    }

    am(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        ((am) this).field_H = param2;
        ((am) this).field_J = param3;
        ((am) this).field_E = param6;
        ((am) this).field_G = param4;
        ((am) this).field_w = param5;
        ((am) this).field_p = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_I = new long[1000];
        field_B = new byte[]{(byte)2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        field_F = "You cannot add yourself!";
        field_K = new int[1024];
    }
}
