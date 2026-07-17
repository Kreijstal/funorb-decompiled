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

    private final String a(String[] param0) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = ((am) this).a(118, param0, "move");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("am.G(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 0 + 41);
        }
        return stackIn_3_0;
    }

    public static void e() {
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
        Object stackIn_30_0 = null;
        Object stackIn_40_0 = null;
        pe stackIn_42_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        pe stackOut_41_0 = null;
        Object stackOut_39_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
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
                      L2: {
                        if (var6 == 2) {
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var5++;
                      break L1;
                    }
                  } else {
                    var5--;
                    break L1;
                  }
                }
                L3: {
                  if (var4_int < 0) {
                    break L3;
                  } else {
                    if (var5 < 0) {
                      break L3;
                    } else {
                      if (var4_int >= param2.field_v) {
                        break L3;
                      } else {
                        if (param2.field_db <= var5) {
                          break L3;
                        } else {
                          L4: {
                            var6 = param2.field_Eb[var5 * param2.field_v + var4_int].field_h;
                            if (2 == var6) {
                              break L4;
                            } else {
                              if (4 == var6) {
                                break L4;
                              } else {
                                if (var6 == 6) {
                                  break L4;
                                } else {
                                  stackOut_41_0 = new pe(var4_int, var5, ((am) this).field_J, ((am) this).field_G, param0.field_Y, ((am) this).field_p);
                                  stackIn_42_0 = stackOut_41_0;
                                  break L0;
                                }
                              }
                            }
                          }
                          String discarded$4 = ((am) this).a(120, new String[4], "vine growth");
                          stackOut_39_0 = null;
                          stackIn_40_0 = stackOut_39_0;
                          return (bd) (Object) stackIn_40_0;
                        }
                      }
                    }
                  }
                }
                String discarded$5 = ((am) this).a(127, new String[3], "vine growth");
                stackOut_29_0 = null;
                stackIn_30_0 = stackOut_29_0;
                return (bd) (Object) stackIn_30_0;
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
          L5: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("am.H(");
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L5;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L5;
            }
          }
          L6: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(44).append(32).append(44);
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param2 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L6;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 41);
        }
        return (bd) (Object) stackIn_42_0;
    }

    final bd a(int param0, ha param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        jd var8 = null;
        int var8_int = 0;
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
        Object stackIn_9_0 = null;
        bd stackIn_18_0 = null;
        bd stackIn_21_0 = null;
        int stackIn_26_0 = 0;
        Object stackIn_80_0 = null;
        int stackIn_97_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_156_0 = 0;
        ld stackIn_186_0 = null;
        RuntimeException stackIn_188_0 = null;
        StringBuilder stackIn_188_1 = null;
        RuntimeException stackIn_190_0 = null;
        StringBuilder stackIn_190_1 = null;
        RuntimeException stackIn_191_0 = null;
        StringBuilder stackIn_191_1 = null;
        String stackIn_191_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        Object stackOut_79_0 = null;
        int stackOut_96_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_153_0 = 0;
        ld stackOut_185_0 = null;
        bd stackOut_20_0 = null;
        bd stackOut_17_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_187_0 = null;
        StringBuilder stackOut_187_1 = null;
        RuntimeException stackOut_190_0 = null;
        StringBuilder stackOut_190_1 = null;
        String stackOut_190_2 = null;
        RuntimeException stackOut_188_0 = null;
        StringBuilder stackOut_188_1 = null;
        String stackOut_188_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ((am) this).d(-107);
            var16 = param1.c(((am) this).field_G, true, ((am) this).field_J);
            var17 = var16;
            if (null != var17) {
              L1: {
                if (((am) this).field_p == var17.field_O) {
                  break L1;
                } else {
                  if (((am) this).field_u) {
                    break L1;
                  } else {
                    int discarded$8 = 0;
                    String discarded$9 = this.a(new String[3]);
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (bd) (Object) stackIn_9_0;
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
                        stackOut_25_0 = 3 * bw.field_m[var16.field_N][3];
                        stackIn_26_0 = stackOut_25_0;
                        break L4;
                      } else {
                        stackOut_23_0 = 0;
                        stackIn_26_0 = stackOut_23_0;
                        break L4;
                      }
                    }
                    L5: {
                      var4 = stackIn_26_0;
                      if (0 == (param1.b(31, var17.field_w, var17.field_J, var17.field_O) & 4)) {
                        break L5;
                      } else {
                        if (null == ((am) this).field_H) {
                          break L5;
                        } else {
                          if (((am) this).field_H.length > 0) {
                            var4 = 0;
                            int discarded$10 = 0;
                            String discarded$11 = this.a(new String[3]);
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
                            int discarded$12 = 0;
                            String discarded$13 = this.a(new String[3]);
                            stackOut_79_0 = null;
                            stackIn_80_0 = stackOut_79_0;
                            return (bd) (Object) stackIn_80_0;
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
                        if (null == var8) {
                          ((am) this).field_E = 0;
                          ((am) this).field_w = 0;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (((am) this).field_w >= 0) {
                          stackOut_96_0 = 1;
                          stackIn_97_0 = stackOut_96_0;
                          break L15;
                        } else {
                          stackOut_94_0 = -1;
                          stackIn_97_0 = stackOut_94_0;
                          break L15;
                        }
                      }
                      L16: {
                        var9 = stackIn_97_0;
                        if (0 <= ((am) this).field_E) {
                          stackOut_100_0 = 1;
                          stackIn_101_0 = stackOut_100_0;
                          break L16;
                        } else {
                          stackOut_98_0 = -1;
                          stackIn_101_0 = stackOut_98_0;
                          break L16;
                        }
                      }
                      L17: {
                        var10 = stackIn_101_0;
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
                              stackOut_155_0 = 0;
                              stackIn_156_0 = stackOut_155_0;
                              break L26;
                            } else {
                              stackOut_153_0 = 1;
                              stackIn_156_0 = stackOut_153_0;
                              break L26;
                            }
                          }
                          L27: {
                            var14 = stackIn_156_0;
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
                      stackOut_185_0 = new ld(((am) this).field_J, ((am) this).field_G, ((am) this).field_H, var7, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, var17, param1.c(var6 + ((am) this).field_E, true, ((am) this).field_w + var5));
                      stackIn_186_0 = stackOut_185_0;
                      break L0;
                    }
                  } else {
                    stackOut_20_0 = this.a(var17, (byte) 32, param1);
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0;
                  }
                }
              }
              stackOut_17_0 = this.a(param1, 0, var17);
              stackIn_18_0 = stackOut_17_0;
              return stackIn_18_0;
            } else {
              int discarded$14 = 0;
              String discarded$15 = this.a(new String[2]);
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (bd) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var3 = decompiledCaughtException;
            stackOut_187_0 = (RuntimeException) var3;
            stackOut_187_1 = new StringBuilder().append("am.C(").append(param0).append(44);
            stackIn_190_0 = stackOut_187_0;
            stackIn_190_1 = stackOut_187_1;
            stackIn_188_0 = stackOut_187_0;
            stackIn_188_1 = stackOut_187_1;
            if (param1 == null) {
              stackOut_190_0 = (RuntimeException) (Object) stackIn_190_0;
              stackOut_190_1 = (StringBuilder) (Object) stackIn_190_1;
              stackOut_190_2 = "null";
              stackIn_191_0 = stackOut_190_0;
              stackIn_191_1 = stackOut_190_1;
              stackIn_191_2 = stackOut_190_2;
              break L30;
            } else {
              stackOut_188_0 = (RuntimeException) (Object) stackIn_188_0;
              stackOut_188_1 = (StringBuilder) (Object) stackIn_188_1;
              stackOut_188_2 = "{...}";
              stackIn_191_0 = stackOut_188_0;
              stackIn_191_1 = stackOut_188_1;
              stackIn_191_2 = stackOut_188_2;
              break L30;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_191_0, stackIn_191_2 + 41);
        }
        return (bd) (Object) stackIn_186_0;
    }

    private final bd a(ha param0, int param1, jd param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_13_0 = null;
        ur stackIn_17_0 = null;
        ur stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ur stackOut_16_0 = null;
        ur stackOut_18_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
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
                                if (((am) this).field_o <= -1) {
                                  break L3;
                                } else {
                                  if (uc.field_d[((am) this).field_o][5] != 24) {
                                    break L3;
                                  } else {
                                    stackOut_16_0 = new ur(((am) this).field_J, ((am) this).field_G, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, param2, false);
                                    stackIn_17_0 = stackOut_16_0;
                                    return (bd) (Object) stackIn_17_0;
                                  }
                                }
                              }
                              stackOut_18_0 = new ur(((am) this).field_J, ((am) this).field_G, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, param2, true);
                              stackIn_19_0 = stackOut_18_0;
                              break L0;
                            }
                          }
                        }
                      }
                      String discarded$2 = ((am) this).a(126, new String[4], "teleport");
                      stackOut_12_0 = null;
                      stackIn_13_0 = stackOut_12_0;
                      return (bd) (Object) stackIn_13_0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            String discarded$3 = ((am) this).a(124, new String[3], "teleport");
            stackOut_5_0 = null;
            stackIn_6_0 = stackOut_5_0;
            return (bd) (Object) stackIn_6_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("am.F(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L4;
            }
          }
          L5: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(0).append(44);
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
        return (bd) (Object) stackIn_19_0;
    }

    am(vh param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
                  if (0 == var5 % 4) {
                    var4 = param0.k(0);
                    break L3;
                  } else {
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
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("am.<init>(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
        }
    }

    am(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((am) this).field_H = param2;
            ((am) this).field_J = param3;
            ((am) this).field_E = param6;
            ((am) this).field_G = param4;
            ((am) this).field_w = param5;
            ((am) this).field_p = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("am.<init>(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
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
