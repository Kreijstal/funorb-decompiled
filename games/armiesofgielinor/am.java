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
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_z = null;
                break L1;
              }
            }
            stackOut_3_0 = ((am) this).a(118, param0, "move");
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("am.G(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void e(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_C = null;
              field_D = null;
              field_z = null;
              field_F = null;
              field_K = null;
              field_y = null;
              field_B = null;
              field_I = null;
              if (param0 == -1) {
                break L1;
              } else {
                field_D = null;
                break L1;
              }
            }
            field_v = null;
            field_A = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "am.E(" + param0 + ')');
        }
    }

    private final bd a(jd param0, byte param1, ha param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_58_0 = null;
        pe stackIn_60_0 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        pe stackOut_59_0 = null;
        Object stackOut_57_0 = null;
        Object stackOut_46_0 = null;
        Object stackOut_43_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!param0.field_s) {
              if (((am) this).field_H.length == 1) {
                L1: {
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          var4_int = ((am) this).field_J;
                          var5 = ((am) this).field_G;
                          var6 = ((am) this).field_H[0];
                          if (1 != var6) {
                            break L5;
                          } else {
                            if (var7 == 0) {
                              var5--;
                              if (var7 == 0) {
                                break L1;
                              } else {
                                break L4;
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (0 == var6) {
                          break L4;
                        } else {
                          if (var6 == 2) {
                            break L3;
                          } else {
                            if (var6 == 3) {
                              break L2;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                      var4_int++;
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                    var5++;
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                  var4_int--;
                  break L1;
                }
                L6: {
                  if (var4_int < 0) {
                    break L6;
                  } else {
                    if (var5 < 0) {
                      break L6;
                    } else {
                      if (var4_int >= param2.field_v) {
                        break L6;
                      } else {
                        if (param2.field_db <= var5) {
                          break L6;
                        } else {
                          if (param1 == 32) {
                            L7: {
                              var6 = param2.field_Eb[var5 * param2.field_v + var4_int].field_h;
                              if (2 == var6) {
                                break L7;
                              } else {
                                if (4 == var6) {
                                  break L7;
                                } else {
                                  if (var6 == 6) {
                                    break L7;
                                  } else {
                                    stackOut_59_0 = new pe(var4_int, var5, ((am) this).field_J, ((am) this).field_G, param0.field_Y, ((am) this).field_p);
                                    stackIn_60_0 = stackOut_59_0;
                                    break L0;
                                  }
                                }
                              }
                            }
                            String discarded$4 = ((am) this).a(120, new String[4], "vine growth");
                            stackOut_57_0 = null;
                            stackIn_58_0 = stackOut_57_0;
                            return (bd) (Object) stackIn_58_0;
                          } else {
                            stackOut_46_0 = null;
                            stackIn_47_0 = stackOut_46_0;
                            return (bd) (Object) stackIn_47_0;
                          }
                        }
                      }
                    }
                  }
                }
                String discarded$5 = ((am) this).a(127, new String[3], "vine growth");
                stackOut_43_0 = null;
                stackIn_44_0 = stackOut_43_0;
                return (bd) (Object) stackIn_44_0;
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
          L8: {
            var4 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var4;
            stackOut_61_1 = new StringBuilder().append("am.H(");
            stackIn_64_0 = stackOut_61_0;
            stackIn_64_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L8;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_65_0 = stackOut_62_0;
              stackIn_65_1 = stackOut_62_1;
              stackIn_65_2 = stackOut_62_2;
              break L8;
            }
          }
          L9: {
            stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
            stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',').append(param1).append(',');
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param2 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L9;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + ')');
        }
        return (bd) (Object) stackIn_60_0;
    }

    final bd a(int param0, ha param1) {
        RuntimeException var3 = null;
        jd var3_ref = null;
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
        Object stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        bd stackIn_20_0 = null;
        bd stackIn_23_0 = null;
        int stackIn_28_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        Object stackIn_95_0 = null;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_113_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_174_0 = 0;
        Object stackIn_207_0 = null;
        ld stackIn_209_0 = null;
        RuntimeException stackIn_211_0 = null;
        StringBuilder stackIn_211_1 = null;
        RuntimeException stackIn_213_0 = null;
        StringBuilder stackIn_213_1 = null;
        RuntimeException stackIn_214_0 = null;
        StringBuilder stackIn_214_1 = null;
        String stackIn_214_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        Object stackOut_94_0 = null;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_112_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_171_0 = 0;
        Object stackOut_206_0 = null;
        ld stackOut_208_0 = null;
        bd stackOut_22_0 = null;
        bd stackOut_19_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_210_0 = null;
        StringBuilder stackOut_210_1 = null;
        RuntimeException stackOut_213_0 = null;
        StringBuilder stackOut_213_1 = null;
        String stackOut_213_2 = null;
        RuntimeException stackOut_211_0 = null;
        StringBuilder stackOut_211_1 = null;
        String stackOut_211_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ((am) this).d(-107);
            var3_ref = param1.c(((am) this).field_G, true, ((am) this).field_J);
            if (null != var3_ref) {
              L1: {
                if (((am) this).field_p == var3_ref.field_O) {
                  break L1;
                } else {
                  if (((am) this).field_u) {
                    break L1;
                  } else {
                    String discarded$4 = this.a(new String[3], 0);
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (bd) (Object) stackIn_9_0;
                  }
                }
              }
              L2: {
                if (var3_ref.field_N == 51) {
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
                  if (var3_ref.field_N != 39) {
                    L4: {
                      if (!var3_ref.field_s) {
                        stackOut_27_0 = 3 * bw.field_m[var3_ref.field_N][3];
                        stackIn_28_0 = stackOut_27_0;
                        break L4;
                      } else {
                        stackOut_25_0 = 0;
                        stackIn_28_0 = stackOut_25_0;
                        break L4;
                      }
                    }
                    L5: {
                      var4 = stackIn_28_0;
                      if (0 == (param1.b(31, var3_ref.field_w, var3_ref.field_J, var3_ref.field_O) & 4)) {
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
                      if (7 != var3_ref.field_P) {
                        break L7;
                      } else {
                        var4 = var4 >> 1;
                        break L7;
                      }
                    }
                    L8: {
                      if (var3_ref.field_P != 8) {
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
                        L11: {
                          if (((am) this).field_H.length <= var7) {
                            break L11;
                          } else {
                            stackOut_51_0 = -1;
                            stackOut_51_1 = ~var4;
                            stackIn_102_0 = stackOut_51_0;
                            stackIn_102_1 = stackOut_51_1;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            if (var15 != 0) {
                              break L10;
                            } else {
                              if (stackIn_52_0 <= stackIn_52_1) {
                                break L11;
                              } else {
                                L12: {
                                  L13: {
                                    L14: {
                                      L15: {
                                        L16: {
                                          var8_int = param1.field_v * var6 + var5;
                                          var9 = ((am) this).field_H[var7];
                                          if (var9 == 1) {
                                            break L16;
                                          } else {
                                            L17: {
                                              if (0 != var9) {
                                                break L17;
                                              } else {
                                                if (var15 == 0) {
                                                  break L15;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            if (var9 == 2) {
                                              break L14;
                                            } else {
                                              if (3 != var9) {
                                                break L12;
                                              } else {
                                                if (var15 == 0) {
                                                  break L13;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var6--;
                                        if (var15 == 0) {
                                          break L12;
                                        } else {
                                          break L15;
                                        }
                                      }
                                      var5++;
                                      if (var15 == 0) {
                                        break L12;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    var6++;
                                    if (var15 == 0) {
                                      break L12;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  var5--;
                                  break L12;
                                }
                                L18: {
                                  if (0 > var5) {
                                    break L18;
                                  } else {
                                    if (0 > var6) {
                                      break L18;
                                    } else {
                                      if (~param1.field_v >= ~var5) {
                                        break L18;
                                      } else {
                                        if (param1.field_db <= var6) {
                                          break L18;
                                        } else {
                                          L19: {
                                            var9 = param1.a(var8_int, -16, var5 + param1.field_v * var6, var3_ref.field_O, var3_ref, true);
                                            if (var9 <= var4) {
                                              break L19;
                                            } else {
                                              ((am) this).field_w = 0;
                                              ((am) this).field_E = 0;
                                              if (var15 == 0) {
                                                break L11;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          var4 = var4 - var9;
                                          var7++;
                                          if (var15 == 0) {
                                            continue L9;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                String discarded$6 = this.a(new String[3], 0);
                                stackOut_94_0 = null;
                                stackIn_95_0 = stackOut_94_0;
                                return (bd) (Object) stackIn_95_0;
                              }
                            }
                          }
                        }
                        stackOut_101_0 = -1;
                        stackOut_101_1 = ~var3_ref.field_B;
                        stackIn_102_0 = stackOut_101_0;
                        stackIn_102_1 = stackOut_101_1;
                        break L10;
                      }
                      L20: {
                        if (stackIn_102_0 == stackIn_102_1) {
                          ((am) this).field_E = 0;
                          ((am) this).field_w = 0;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      L21: {
                        var8 = param1.c(((am) this).field_E + var6, true, var5 + ((am) this).field_w);
                        if (null == var8) {
                          ((am) this).field_E = 0;
                          ((am) this).field_w = 0;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if (((am) this).field_w >= 0) {
                          stackOut_112_0 = 1;
                          stackIn_113_0 = stackOut_112_0;
                          break L22;
                        } else {
                          stackOut_110_0 = -1;
                          stackIn_113_0 = stackOut_110_0;
                          break L22;
                        }
                      }
                      L23: {
                        var9 = stackIn_113_0;
                        if (0 <= ((am) this).field_E) {
                          stackOut_116_0 = 1;
                          stackIn_117_0 = stackOut_116_0;
                          break L23;
                        } else {
                          stackOut_114_0 = -1;
                          stackIn_117_0 = stackOut_114_0;
                          break L23;
                        }
                      }
                      L24: {
                        var10 = stackIn_117_0;
                        var11 = var9 * ((am) this).field_w - -(((am) this).field_E * var10);
                        var12 = bw.field_m[var3_ref.field_N][6];
                        var13 = bw.field_m[var3_ref.field_N][7];
                        if (!var3_ref.field_W) {
                          break L24;
                        } else {
                          if (var3_ref.field_N != 34) {
                            break L24;
                          } else {
                            var12 = 2;
                            var13 = 7;
                            if (var3_ref.j(20640) == 3) {
                              var13 = var13 + var3_ref.d(1, 57);
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                      L25: {
                        L26: {
                          if (81 == var3_ref.field_N) {
                            break L26;
                          } else {
                            if (4 == var3_ref.field_N) {
                              break L26;
                            } else {
                              L27: {
                                if (var3_ref.field_N != 74) {
                                  break L27;
                                } else {
                                  if (3 == var3_ref.j(20640)) {
                                    break L26;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              L28: {
                                if (var3_ref.g(0) != 3) {
                                  break L28;
                                } else {
                                  if (var3_ref.j(20640) != 2) {
                                    break L28;
                                  } else {
                                    var13 = var13 + var3_ref.d(1, -108);
                                    if (var15 == 0) {
                                      break L25;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                              }
                              if (2 != var3_ref.g(0)) {
                                break L25;
                              } else {
                                if (var3_ref.j(20640) == 1) {
                                  var13 = var13 + var3_ref.d(1, -87);
                                  if (var15 == 0) {
                                    break L25;
                                  } else {
                                    break L26;
                                  }
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                        }
                        var13 = var13 + var3_ref.d(1, 118);
                        break L25;
                      }
                      L29: {
                        if (param0 >= 31) {
                          break L29;
                        } else {
                          field_I = null;
                          break L29;
                        }
                      }
                      L30: {
                        L31: {
                          if (1 >= var11) {
                            break L31;
                          } else {
                            L32: {
                              if (var12 > var11) {
                                break L32;
                              } else {
                                if (~var11 >= ~var13) {
                                  break L31;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            ((am) this).field_E = 0;
                            ((am) this).field_w = 0;
                            if (var15 == 0) {
                              break L30;
                            } else {
                              break L31;
                            }
                          }
                        }
                        L33: {
                          if (1 >= var11) {
                            break L33;
                          } else {
                            L34: {
                              if (bw.field_m[var3_ref.field_N][0] != 4) {
                                stackOut_173_0 = 0;
                                stackIn_174_0 = stackOut_173_0;
                                break L34;
                              } else {
                                stackOut_171_0 = 1;
                                stackIn_174_0 = stackOut_171_0;
                                break L34;
                              }
                            }
                            L35: {
                              var14 = stackIn_174_0;
                              if (param1.field_j.a(var6, ((am) this).field_w + var5, var5, var14 == 0, var13, ((am) this).field_E + var6, (byte) 81)) {
                                ((am) this).field_w = 0;
                                ((am) this).field_E = 0;
                                break L35;
                              } else {
                                break L35;
                              }
                            }
                            L36: {
                              L37: {
                                if ((param1.b(31, var6 + ((am) this).field_E, var5 + ((am) this).field_w, var3_ref.field_O) & 2) != 0) {
                                  break L37;
                                } else {
                                  if (0 != (param1.b(31, var6, var5, var3_ref.field_O) & 2)) {
                                    break L37;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              ((am) this).field_w = 0;
                              ((am) this).field_E = 0;
                              break L36;
                            }
                            if (var15 == 0) {
                              break L30;
                            } else {
                              break L33;
                            }
                          }
                        }
                        if (var11 != 1) {
                          break L30;
                        } else {
                          if (4 != var8.g(0)) {
                            break L30;
                          } else {
                            if (var3_ref.j((byte) 78)) {
                              break L30;
                            } else {
                              ((am) this).field_w = 0;
                              ((am) this).field_E = 0;
                              break L30;
                            }
                          }
                        }
                      }
                      L38: {
                        if (var7 != 0) {
                          break L38;
                        } else {
                          if (((am) this).field_w != 0) {
                            break L38;
                          } else {
                            if (0 == ((am) this).field_E) {
                              stackOut_206_0 = null;
                              stackIn_207_0 = stackOut_206_0;
                              return (bd) (Object) stackIn_207_0;
                            } else {
                              break L38;
                            }
                          }
                        }
                      }
                      stackOut_208_0 = new ld(((am) this).field_J, ((am) this).field_G, ((am) this).field_H, var7, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, var3_ref, param1.c(var6 + ((am) this).field_E, true, ((am) this).field_w + var5));
                      stackIn_209_0 = stackOut_208_0;
                      break L0;
                    }
                  } else {
                    stackOut_22_0 = this.a(var3_ref, (byte) 32, param1);
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0;
                  }
                }
              }
              stackOut_19_0 = this.a(param1, 0, var3_ref);
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0;
            } else {
              String discarded$7 = this.a(new String[2], 0);
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (bd) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var3 = decompiledCaughtException;
            stackOut_210_0 = (RuntimeException) var3;
            stackOut_210_1 = new StringBuilder().append("am.C(").append(param0).append(',');
            stackIn_213_0 = stackOut_210_0;
            stackIn_213_1 = stackOut_210_1;
            stackIn_211_0 = stackOut_210_0;
            stackIn_211_1 = stackOut_210_1;
            if (param1 == null) {
              stackOut_213_0 = (RuntimeException) (Object) stackIn_213_0;
              stackOut_213_1 = (StringBuilder) (Object) stackIn_213_1;
              stackOut_213_2 = "null";
              stackIn_214_0 = stackOut_213_0;
              stackIn_214_1 = stackOut_213_1;
              stackIn_214_2 = stackOut_213_2;
              break L39;
            } else {
              stackOut_211_0 = (RuntimeException) (Object) stackIn_211_0;
              stackOut_211_1 = (StringBuilder) (Object) stackIn_211_1;
              stackOut_211_2 = "{...}";
              stackIn_214_0 = stackOut_211_0;
              stackIn_214_1 = stackOut_211_1;
              stackIn_214_2 = stackOut_211_2;
              break L39;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_214_0, stackIn_214_2 + ')');
        }
        return (bd) (Object) stackIn_209_0;
    }

    private final bd a(ha param0, int param1, jd param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_22_0 = null;
        ur stackIn_28_0 = null;
        ur stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        ur stackOut_27_0 = null;
        ur stackOut_29_0 = null;
        Object stackOut_21_0 = null;
        Object stackOut_10_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
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
                    if (~param0.field_db < ~var5) {
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
                                    stackOut_27_0 = new ur(((am) this).field_J, ((am) this).field_G, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, param2, false);
                                    stackIn_28_0 = stackOut_27_0;
                                    return (bd) (Object) stackIn_28_0;
                                  }
                                }
                              }
                              stackOut_29_0 = new ur(((am) this).field_J, ((am) this).field_G, ((am) this).field_w, ((am) this).field_E, ((am) this).field_p, param2, true);
                              stackIn_30_0 = stackOut_29_0;
                              break L0;
                            }
                          }
                        }
                      }
                      String discarded$2 = ((am) this).a(126, new String[4], "teleport");
                      stackOut_21_0 = null;
                      stackIn_22_0 = stackOut_21_0;
                      return (bd) (Object) stackIn_22_0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            String discarded$3 = ((am) this).a(param1 + 124, new String[3], "teleport");
            stackOut_10_0 = null;
            stackIn_11_0 = stackOut_10_0;
            return (bd) (Object) stackIn_11_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("am.F(");
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L4;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L4;
            }
          }
          L5: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param1).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L5;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
        return (bd) (Object) stackIn_30_0;
    }

    am(vh param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
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
              L2: {
                L3: {
                  if (~var3_int >= ~var5) {
                    break L3;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 == var5 % 4) {
                          var4 = param0.k(0);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((am) this).field_H[var5] = rn.a(3, var4);
                      var4 = var4 >> 2;
                      var5++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4 = param0.e((byte) -104);
                stackOut_11_0 = var4;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              }
              L5: {
                L6: {
                  if (stackIn_12_0 != 0) {
                    break L6;
                  } else {
                    ((am) this).field_w = 0;
                    ((am) this).field_E = 0;
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                ((am) this).field_E = 255 & var4;
                ((am) this).field_w = var4 >> 1915640040;
                ((am) this).field_E = (((am) this).field_E ^ 128) + -128;
                ((am) this).field_w = -128 + (((am) this).field_w ^ 128);
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("am.<init>(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
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
            stackOut_3_1 = new StringBuilder().append("am.<init>(").append(param0).append(',').append(param1).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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
