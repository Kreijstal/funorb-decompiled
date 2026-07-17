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
        RuntimeException var3 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = ((am) this).a(118, param0, "move");
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("am.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 0 + 41);
        }
        return stackIn_1_0;
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
        field_v = null;
        field_A = null;
    }

    private final bd a(jd param0, byte param1, ha param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_32_0 = null;
        pe stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        pe stackOut_33_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_22_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!param0.field_s) {
              if (((am) this).field_H.length == 1) {
                L1: {
                  var4_int = ((am) this).field_J;
                  var5 = ((am) this).field_G;
                  var6 = ((am) this).field_H[0];
                  if (1 != var6) {
                    if (0 == var6) {
                      var4_int++;
                      break L1;
                    } else {
                      if (var6 == 2) {
                        var5++;
                        break L1;
                      } else {
                        if (var6 == 3) {
                          var4_int--;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    var5--;
                    break L1;
                  }
                }
                L2: {
                  if (var4_int < 0) {
                    break L2;
                  } else {
                    if (var5 < 0) {
                      break L2;
                    } else {
                      if (var4_int >= param2.field_v) {
                        break L2;
                      } else {
                        if (param2.field_db <= var5) {
                          break L2;
                        } else {
                          if (param1 == 32) {
                            L3: {
                              var6 = param2.field_Eb[var5 * param2.field_v + var4_int].field_h;
                              if (2 == var6) {
                                break L3;
                              } else {
                                if (4 == var6) {
                                  break L3;
                                } else {
                                  if (var6 == 6) {
                                    break L3;
                                  } else {
                                    stackOut_33_0 = new pe(var4_int, var5, ((am) this).field_J, ((am) this).field_G, param0.field_Y, ((am) this).field_p);
                                    stackIn_34_0 = stackOut_33_0;
                                    break L0;
                                  }
                                }
                              }
                            }
                            String discarded$4 = ((am) this).a(120, new String[4], "vine growth");
                            stackOut_31_0 = null;
                            stackIn_32_0 = stackOut_31_0;
                            return (bd) (Object) stackIn_32_0;
                          } else {
                            stackOut_25_0 = null;
                            stackIn_26_0 = stackOut_25_0;
                            return (bd) (Object) stackIn_26_0;
                          }
                        }
                      }
                    }
                  }
                }
                String discarded$5 = ((am) this).a(127, new String[3], "vine growth");
                stackOut_22_0 = null;
                stackIn_23_0 = stackOut_22_0;
                return (bd) (Object) stackIn_23_0;
              } else {
                String discarded$6 = ((am) this).a(-98, new String[3], "vine growth");
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (bd) (Object) stackIn_6_0;
              }
            } else {
              String discarded$7 = ((am) this).a(-84, new String[3], "vine growth");
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (bd) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var4;
            stackOut_35_1 = new StringBuilder().append("am.H(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L4;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L4;
            }
          }
          L5: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(44).append(param1).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L5;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
        }
        return (bd) (Object) stackIn_34_0;
    }

    final bd a(int param0, ha param1) {
        RuntimeException var3 = null;
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
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        bd stackIn_13_0 = null;
        bd stackIn_16_0 = null;
        int stackIn_20_0 = 0;
        Object stackIn_52_0 = null;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_97_0 = 0;
        ld stackIn_114_0 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        String stackIn_118_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        Object stackOut_51_0 = null;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_95_0 = 0;
        ld stackOut_113_0 = null;
        bd stackOut_15_0 = null;
        bd stackOut_12_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        String stackOut_117_2 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ((am) this).d(-107);
            var16 = param1.c(((am) this).field_G, true, ((am) this).field_J);
            var17 = var16;
            if (var17 != null) {
              L1: {
                if (((am) this).field_p == var17.field_O) {
                  break L1;
                } else {
                  if (((am) this).field_u) {
                    break L1;
                  } else {
                    String discarded$4 = this.a(new String[3], 0);
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (bd) (Object) stackIn_7_0;
                  }
                }
              }
              L2: {
                if (var17.field_N == 51) {
                  break L2;
                } else {
                  L3: {
                    if (((am) this).field_o <= -1) {
                      break L3;
                    } else {
                      if (uc.field_d[((am) this).field_o][5] == 24) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var17.field_N != 39) {
                    L4: {
                      if (!var17.field_s) {
                        stackOut_19_0 = 3 * bw.field_m[var16.field_N][3];
                        stackIn_20_0 = stackOut_19_0;
                        break L4;
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_20_0 = stackOut_18_0;
                        break L4;
                      }
                    }
                    L5: {
                      var4 = stackIn_20_0;
                      if (0 == (param1.b(31, var17.field_w, var17.field_J, var17.field_O) & 4)) {
                        break L5;
                      } else {
                        if (null == ((am) this).field_H) {
                          break L5;
                        } else {
                          if (((am) this).field_H.length > 0) {
                            var4 = 0;
                            String discarded$5 = this.a(new String[3], 0);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (((am) this).field_o <= -1) {
                        break L6;
                      } else {
                        if (uc.field_d[((am) this).field_o][5] == 18) {
                          var4 = var4 << 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (7 != var17.field_P) {
                        break L7;
                      } else {
                        var4 = var4 >> 1;
                        break L7;
                      }
                    }
                    L8: {
                      if (var17.field_P != 8) {
                        break L8;
                      } else {
                        var4 = 0;
                        break L8;
                      }
                    }
                    var5 = ((am) this).field_J;
                    var6 = ((am) this).field_G;
                    var7 = 0;
                    L9: while (true) {
                      L10: {
                        if (((am) this).field_H.length <= var7) {
                          break L10;
                        } else {
                          if (var4 <= 0) {
                            break L10;
                          } else {
                            L11: {
                              var8_int = param1.field_v * var6 + var5;
                              var9 = ((am) this).field_H[var7];
                              if (var9 == 1) {
                                var6--;
                                break L11;
                              } else {
                                if (0 != var9) {
                                  if (var9 == 2) {
                                    var6++;
                                    break L11;
                                  } else {
                                    if (3 != var9) {
                                      break L11;
                                    } else {
                                      var5--;
                                      break L11;
                                    }
                                  }
                                } else {
                                  var5++;
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (0 > var5) {
                                break L12;
                              } else {
                                if (0 > var6) {
                                  break L12;
                                } else {
                                  if (~param1.field_v >= ~var5) {
                                    break L12;
                                  } else {
                                    if (param1.field_db <= var6) {
                                      break L12;
                                    } else {
                                      var9 = param1.a(var8_int, -16, var5 + param1.field_v * var6, var17.field_O, var17, true);
                                      if (var9 <= var4) {
                                        var4 = var4 - var9;
                                        var7++;
                                        continue L9;
                                      } else {
                                        ((am) this).field_w = 0;
                                        ((am) this).field_E = 0;
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            String discarded$6 = this.a(new String[3], 0);
                            stackOut_51_0 = null;
                            stackIn_52_0 = stackOut_51_0;
                            return (bd) (Object) stackIn_52_0;
                          }
                        }
                      }
                      L13: {
                        if (var17.field_B == 0) {
                          ((am) this).field_E = 0;
                          ((am) this).field_w = 0;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        var8 = param1.c(((am) this).field_E + var6, true, var5 + ((am) this).field_w);
                        if (var8 == null) {
                          ((am) this).field_E = 0;
                          ((am) this).field_w = 0;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (((am) this).field_w >= 0) {
                          stackOut_64_0 = 1;
                          stackIn_65_0 = stackOut_64_0;
                          break L15;
                        } else {
                          stackOut_63_0 = -1;
                          stackIn_65_0 = stackOut_63_0;
                          break L15;
                        }
                      }
                      L16: {
                        var9 = stackIn_65_0;
                        if (0 <= ((am) this).field_E) {
                          stackOut_67_0 = 1;
                          stackIn_68_0 = stackOut_67_0;
                          break L16;
                        } else {
                          stackOut_66_0 = -1;
                          stackIn_68_0 = stackOut_66_0;
                          break L16;
                        }
                      }
                      L17: {
                        var10 = stackIn_68_0;
                        var11 = var9 * ((am) this).field_w - -(((am) this).field_E * var10);
                        var12 = bw.field_m[var17.field_N][6];
                        var13 = bw.field_m[var17.field_N][7];
                        if (!var17.field_W) {
                          break L17;
                        } else {
                          if (var17.field_N != 34) {
                            break L17;
                          } else {
                            var12 = 2;
                            var13 = 7;
                            if (var17.j(20640) == 3) {
                              var13 = var13 + var17.d(1, 57);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      L18: {
                        L19: {
                          if (81 == var17.field_N) {
                            break L19;
                          } else {
                            if (4 == var17.field_N) {
                              break L19;
                            } else {
                              L20: {
                                if (var17.field_N != 74) {
                                  break L20;
                                } else {
                                  if (3 == var17.j(20640)) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              L21: {
                                if (var17.g(0) != 3) {
                                  break L21;
                                } else {
                                  if (var17.j(20640) != 2) {
                                    break L21;
                                  } else {
                                    var13 = var13 + var17.d(1, -108);
                                    break L18;
                                  }
                                }
                              }
                              if (2 != var17.g(0)) {
                                break L18;
                              } else {
                                if (var17.j(20640) == 1) {
                                  var13 = var13 + var17.d(1, -87);
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                        }
                        var13 = var13 + var17.d(1, 118);
                        break L18;
                      }
                      L22: {
                        if (param0 >= 31) {
                          break L22;
                        } else {
                          field_I = null;
                          break L22;
                        }
                      }
                      L23: {
                        L24: {
                          if (1 >= var11) {
                            break L24;
                          } else {
                            L25: {
                              if (var12 > var11) {
                                break L25;
                              } else {
                                if (~var11 >= ~var13) {
                                  break L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            ((am) this).field_E = 0;
                            ((am) this).field_w = 0;
                            break L23;
                          }
                        }
                        if (1 >= var11) {
                          if (var11 != 1) {
                            break L23;
                          } else {
                            if (4 != var8.g(0)) {
                              break L23;
                            } else {
                              if (var17.j((byte) 78)) {
                                break L23;
                              } else {
                                ((am) this).field_w = 0;
                                ((am) this).field_E = 0;
                                break L23;
                              }
                            }
                          }
                        } else {
                          L26: {
                            if (bw.field_m[var17.field_N][0] != 4) {
                              stackOut_96_0 = 0;
                              stackIn_97_0 = stackOut_96_0;
                              break L26;
                            } else {
                              stackOut_95_0 = 1;
                              stackIn_97_0 = stackOut_95_0;
                              break L26;
                            }
                          }
                          L27: {
                            var14 = stackIn_97_0;
                            if (param1.field_j.a(var6, ((am) this).field_w + var5, var5, var14 == 0, var13, ((am) this).field_E + var6, (byte) 81)) {
                              ((am) this).field_w = 0;
                              ((am) this).field_E = 0;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          L28: {
                            if ((param1.b(31, var6 + ((am) this).field_E, var5 + ((am) this).field_w, var17.field_O) & 2) != 0) {
                              break L28;
                            } else {
                              if (0 != (param1.b(31, var6, var5, var17.field_O) & 2)) {
                                break L28;
                              } else {
                                break L23;
                              }
                            }
                          }
                          ((am) this).field_w = 0;
                          ((am) this).field_E = 0;
                          break L23;
                        }
                      }
                      L29: {
                        if (var7 != 0) {
                          break L29;
                        } else {
                          if (((am) this).field_w != 0) {
                            break L29;
                          } else {
                            if (0 != ((am) this).field_E) {
                              break L29;
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                      stackOut_113_0 = new ld(((am) this).field_J, ((am) this).field_G, ((am) this).field_H, var7, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, var17, param1.c(var6 + ((am) this).field_E, true, ((am) this).field_w + var5));
                      stackIn_114_0 = stackOut_113_0;
                      break L0;
                    }
                  } else {
                    stackOut_15_0 = this.a(var17, (byte) 32, param1);
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                }
              }
              stackOut_12_0 = this.a(param1, 0, var17);
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0;
            } else {
              String discarded$7 = this.a(new String[2], 0);
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (bd) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var3 = decompiledCaughtException;
            stackOut_115_0 = (RuntimeException) var3;
            stackOut_115_1 = new StringBuilder().append("am.C(").append(param0).append(44);
            stackIn_117_0 = stackOut_115_0;
            stackIn_117_1 = stackOut_115_1;
            stackIn_116_0 = stackOut_115_0;
            stackIn_116_1 = stackOut_115_1;
            if (param1 == null) {
              stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
              stackOut_117_1 = (StringBuilder) (Object) stackIn_117_1;
              stackOut_117_2 = "null";
              stackIn_118_0 = stackOut_117_0;
              stackIn_118_1 = stackOut_117_1;
              stackIn_118_2 = stackOut_117_2;
              break L30;
            } else {
              stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
              stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
              stackOut_116_2 = "{...}";
              stackIn_118_0 = stackOut_116_0;
              stackIn_118_1 = stackOut_116_1;
              stackIn_118_2 = stackOut_116_2;
              break L30;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_118_0, stackIn_118_2 + 41);
        }
        return (bd) (Object) stackIn_114_0;
    }

    private final bd a(ha param0, int param1, jd param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_12_0 = null;
        ur stackIn_16_0 = null;
        ur stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        ur stackOut_15_0 = null;
        ur stackOut_17_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var4_int = ((am) this).field_J - -((am) this).field_w;
              var5 = ((am) this).field_G - -((am) this).field_E;
              if (var4_int < 0) {
                break L1;
              } else {
                if (var5 < 0) {
                  break L1;
                } else {
                  if (param0.field_v <= var4_int) {
                    break L1;
                  } else {
                    if (param0.field_db > var5) {
                      L2: {
                        var6 = param0.field_Eb[var4_int + var5 * param0.field_v].field_h;
                        if (var6 == 2) {
                          break L2;
                        } else {
                          if (var6 == 4) {
                            break L2;
                          } else {
                            if (var6 == 6) {
                              break L2;
                            } else {
                              L3: {
                                if (param1 <= ~((am) this).field_o) {
                                  break L3;
                                } else {
                                  if (uc.field_d[((am) this).field_o][5] != 24) {
                                    break L3;
                                  } else {
                                    stackOut_15_0 = new ur(((am) this).field_J, ((am) this).field_G, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, param2, false);
                                    stackIn_16_0 = stackOut_15_0;
                                    return (bd) (Object) stackIn_16_0;
                                  }
                                }
                              }
                              stackOut_17_0 = new ur(((am) this).field_J, ((am) this).field_G, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, param2, true);
                              stackIn_18_0 = stackOut_17_0;
                              break L0;
                            }
                          }
                        }
                      }
                      String discarded$2 = ((am) this).a(126, new String[4], "teleport");
                      stackOut_11_0 = null;
                      stackIn_12_0 = stackOut_11_0;
                      return (bd) (Object) stackIn_12_0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            String discarded$3 = ((am) this).a(param1 + 124, new String[3], "teleport");
            stackOut_5_0 = null;
            stackIn_6_0 = stackOut_5_0;
            return (bd) (Object) stackIn_6_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("am.F(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          L5: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return (bd) (Object) stackIn_18_0;
    }

    am(vh param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            ((am) this).field_p = param1;
            var3_int = param0.e((byte) -104) & 8191;
            ((am) this).field_H = new int[var3_int];
            ((am) this).field_J = param0.k(0);
            ((am) this).field_G = param0.k(0);
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var3_int <= var5) {
                L2: {
                  var4 = param0.e((byte) -104);
                  if (var4 != 0) {
                    ((am) this).field_E = 255 & var4;
                    ((am) this).field_w = var4 >> 8;
                    ((am) this).field_E = (((am) this).field_E ^ 128) + -128;
                    ((am) this).field_w = -128 + (((am) this).field_w ^ 128);
                    break L2;
                  } else {
                    ((am) this).field_w = 0;
                    ((am) this).field_E = 0;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (0 != var5 % 4) {
                    break L3;
                  } else {
                    var4 = param0.k(0);
                    break L3;
                  }
                }
                ((am) this).field_H[var5] = rn.a(3, var4);
                var4 = var4 >> 2;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("am.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    am(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        try {
            ((am) this).field_H = param2;
            ((am) this).field_J = param3;
            ((am) this).field_E = param6;
            ((am) this).field_G = param4;
            ((am) this).field_w = param5;
            ((am) this).field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "am.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_I = new long[1000];
        field_B = new byte[]{(byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        field_F = "You cannot add yourself!";
        field_K = new int[1024];
    }
}
