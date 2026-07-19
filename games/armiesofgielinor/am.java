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
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_z = (hi) null;
                break L1;
              }
            }
            stackOut_2_0 = this.a(118, param0, "move");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("am.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
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
            field_D = (int[]) null;
        }
        field_v = null;
        field_A = null;
    }

    private final bd a(jd param0, byte param1, ha param2) {
        String discarded$4 = null;
        String discarded$5 = null;
        String discarded$6 = null;
        String discarded$7 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_26_0 = null;
        bd stackIn_29_0 = null;
        Object stackIn_35_0 = null;
        pe stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        pe stackOut_36_0 = null;
        Object stackOut_34_0 = null;
        bd stackOut_28_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!param0.field_s) {
              if ((this.field_H.length ^ -1) == -2) {
                L1: {
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          var4_int = this.field_J;
                          var5 = this.field_G;
                          var6 = this.field_H[0];
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
                          if ((var6 ^ -1) == -3) {
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
                    if (-1 < (var5 ^ -1)) {
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
                                  if ((var6 ^ -1) == -7) {
                                    break L7;
                                  } else {
                                    stackOut_36_0 = new pe(var4_int, var5, this.field_J, this.field_G, param0.field_Y, this.field_p);
                                    stackIn_37_0 = stackOut_36_0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                }
                              }
                            }
                            discarded$4 = this.a(120, new String[]{"vine at ", ci.c(param0.field_J, param1 + -32, param0.field_w), " attempted to grow onto ground type: ", Integer.toString(var6)}, "vine growth");
                            stackOut_34_0 = null;
                            stackIn_35_0 = stackOut_34_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            stackOut_28_0 = (bd) null;
                            stackIn_29_0 = stackOut_28_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
                discarded$5 = this.a(127, new String[]{"vine at ", ci.c(param0.field_J, 0, param0.field_w), " attempted to escape the map"}, "vine growth");
                stackOut_25_0 = null;
                stackIn_26_0 = stackOut_25_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                discarded$6 = this.a(-98, new String[]{"vine at ", ci.c(param0.field_J, param1 + -32, param0.field_w), " attempted to grow more than one step"}, "vine growth");
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              discarded$7 = this.a(-84, new String[]{"vine at ", ci.c(param0.field_J, param1 ^ 32, param0.field_w), " has already grown"}, "vine growth");
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var4);
            stackOut_38_1 = new StringBuilder().append("am.H(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L8;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L8;
            }
          }
          L9: {
            stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',').append(param1).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L9;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bd) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bd) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (bd) ((Object) stackIn_26_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (bd) ((Object) stackIn_35_0);
                } else {
                  return (bd) ((Object) stackIn_37_0);
                }
              }
            }
          }
        }
    }

    final bd a(int param0, ha param1) {
        String discarded$4 = null;
        String discarded$5 = null;
        String discarded$6 = null;
        String discarded$7 = null;
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
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        Object stackIn_58_0 = null;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_106_0 = 0;
        ld stackIn_124_0 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        Object stackOut_57_0 = null;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        ld stackOut_123_0 = null;
        bd stackOut_15_0 = null;
        bd stackOut_12_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.d(-107);
            var16 = param1.c(this.field_G, true, this.field_J);
            var17 = var16;
            if (var17 != null) {
              L1: {
                if (this.field_p == var17.field_O) {
                  break L1;
                } else {
                  if (this.field_u) {
                    break L1;
                  } else {
                    discarded$4 = this.a(new String[]{"unit at ", ci.c(this.field_J, 0, this.field_G), " not owned by this player"}, 0);
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if ((var17.field_N ^ -1) == -52) {
                  break L2;
                } else {
                  L3: {
                    if ((this.field_o ^ -1) >= 0) {
                      break L3;
                    } else {
                      if ((uc.field_d[this.field_o][5] ^ -1) == -25) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (-40 != (var17.field_N ^ -1)) {
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
                        if (null == this.field_H) {
                          break L5;
                        } else {
                          if (this.field_H.length > 0) {
                            var4 = 0;
                            discarded$5 = this.a(new String[]{"unit at ", ci.c(this.field_J, 0, this.field_G), "Moved when in range of cyclops"}, 0);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if ((this.field_o ^ -1) >= 0) {
                        break L6;
                      } else {
                        if (uc.field_d[this.field_o][5] == 18) {
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
                      if (-9 != (var17.field_P ^ -1)) {
                        break L8;
                      } else {
                        var4 = 0;
                        break L8;
                      }
                    }
                    var5 = this.field_J;
                    var6 = this.field_G;
                    var7 = 0;
                    L9: while (true) {
                      L10: {
                        L11: {
                          if (this.field_H.length <= var7) {
                            break L11;
                          } else {
                            stackOut_35_0 = -1;
                            stackOut_35_1 = var4 ^ -1;
                            stackIn_64_0 = stackOut_35_0;
                            stackIn_64_1 = stackOut_35_1;
                            stackIn_36_0 = stackOut_35_0;
                            stackIn_36_1 = stackOut_35_1;
                            if (var15 != 0) {
                              break L10;
                            } else {
                              if (stackIn_36_0 <= stackIn_36_1) {
                                break L11;
                              } else {
                                L12: {
                                  L13: {
                                    L14: {
                                      L15: {
                                        L16: {
                                          var8_int = param1.field_v * var6 + var5;
                                          var9 = this.field_H[var7];
                                          if ((var9 ^ -1) == -2) {
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
                                      if ((param1.field_v ^ -1) >= (var5 ^ -1)) {
                                        break L18;
                                      } else {
                                        if (param1.field_db <= var6) {
                                          break L18;
                                        } else {
                                          L19: {
                                            var9 = param1.a(var8_int, -16, var5 + param1.field_v * var6, var17.field_O, var17, true);
                                            if (var9 <= var4) {
                                              break L19;
                                            } else {
                                              this.field_w = 0;
                                              this.field_E = 0;
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
                                discarded$6 = this.a(new String[]{"unit at ", ci.c(this.field_J, 0, this.field_G), " attempted to escape the map"}, 0);
                                stackOut_57_0 = null;
                                stackIn_58_0 = stackOut_57_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                        stackOut_63_0 = -1;
                        stackOut_63_1 = var17.field_B ^ -1;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        break L10;
                      }
                      L20: {
                        if (stackIn_64_0 == stackIn_64_1) {
                          this.field_E = 0;
                          this.field_w = 0;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      L21: {
                        var8 = param1.c(this.field_E + var6, true, var5 + this.field_w);
                        if (var8 == null) {
                          this.field_E = 0;
                          this.field_w = 0;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if (-1 >= (this.field_w ^ -1)) {
                          stackOut_72_0 = 1;
                          stackIn_73_0 = stackOut_72_0;
                          break L22;
                        } else {
                          stackOut_71_0 = -1;
                          stackIn_73_0 = stackOut_71_0;
                          break L22;
                        }
                      }
                      L23: {
                        var9 = stackIn_73_0;
                        if (0 <= this.field_E) {
                          stackOut_75_0 = 1;
                          stackIn_76_0 = stackOut_75_0;
                          break L23;
                        } else {
                          stackOut_74_0 = -1;
                          stackIn_76_0 = stackOut_74_0;
                          break L23;
                        }
                      }
                      L24: {
                        var10 = stackIn_76_0;
                        var11 = var9 * this.field_w - -(this.field_E * var10);
                        var12 = bw.field_m[var16.field_N][6];
                        var13 = bw.field_m[var16.field_N][7];
                        if (!var17.field_W) {
                          break L24;
                        } else {
                          if (var17.field_N != 34) {
                            break L24;
                          } else {
                            var12 = 2;
                            var13 = 7;
                            if (var17.j(20640) == 3) {
                              var13 = var13 + var17.d(1, 57);
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                      L25: {
                        L26: {
                          if (81 == var17.field_N) {
                            break L26;
                          } else {
                            if (4 == var17.field_N) {
                              break L26;
                            } else {
                              L27: {
                                if ((var17.field_N ^ -1) != -75) {
                                  break L27;
                                } else {
                                  if (3 == var17.j(20640)) {
                                    break L26;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              L28: {
                                if (-4 != (var17.g(0) ^ -1)) {
                                  break L28;
                                } else {
                                  if (var17.j(20640) != 2) {
                                    break L28;
                                  } else {
                                    var13 = var13 + var17.d(1, -108);
                                    if (var15 == 0) {
                                      break L25;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                              }
                              if (2 != var17.g(0)) {
                                break L25;
                              } else {
                                if (-2 == (var17.j(20640) ^ -1)) {
                                  var13 = var13 + var17.d(1, -87);
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
                        var13 = var13 + var17.d(1, 118);
                        break L25;
                      }
                      L29: {
                        if (param0 >= 31) {
                          break L29;
                        } else {
                          field_I = (long[]) null;
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
                                if ((var11 ^ -1) >= (var13 ^ -1)) {
                                  break L31;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            this.field_E = 0;
                            this.field_w = 0;
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
                              if (-5 != (bw.field_m[var16.field_N][0] ^ -1)) {
                                stackOut_105_0 = 0;
                                stackIn_106_0 = stackOut_105_0;
                                break L34;
                              } else {
                                stackOut_104_0 = 1;
                                stackIn_106_0 = stackOut_104_0;
                                break L34;
                              }
                            }
                            L35: {
                              var14 = stackIn_106_0;
                              if (param1.field_j.a(var6, this.field_w + var5, var5, var14 == 0, var13, this.field_E + var6, (byte) 81)) {
                                this.field_w = 0;
                                this.field_E = 0;
                                break L35;
                              } else {
                                break L35;
                              }
                            }
                            L36: {
                              L37: {
                                if (-1 != (param1.b(31, var6 + this.field_E, var5 + this.field_w, var17.field_O) & 2 ^ -1)) {
                                  break L37;
                                } else {
                                  if (0 != (param1.b(31, var6, var5, var17.field_O) & 2)) {
                                    break L37;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              this.field_w = 0;
                              this.field_E = 0;
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
                            if (var17.j((byte) 78)) {
                              break L30;
                            } else {
                              this.field_w = 0;
                              this.field_E = 0;
                              break L30;
                            }
                          }
                        }
                      }
                      L38: {
                        if ((var7 ^ -1) != -1) {
                          break L38;
                        } else {
                          if ((this.field_w ^ -1) != -1) {
                            break L38;
                          } else {
                            if (0 != this.field_E) {
                              break L38;
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                      stackOut_123_0 = new ld(this.field_J, this.field_G, this.field_H, var7, this.field_w, this.field_E, this.field_p, var17, param1.c(var6 + this.field_E, true, this.field_w + var5));
                      stackIn_124_0 = stackOut_123_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    stackOut_15_0 = this.a(var17, (byte) 32, param1);
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
              stackOut_12_0 = this.a(param1, 0, var17);
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              discarded$7 = this.a(new String[]{"no unit at ", ci.c(this.field_J, 0, this.field_G)}, 0);
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var3 = decompiledCaughtException;
            stackOut_125_0 = (RuntimeException) (var3);
            stackOut_125_1 = new StringBuilder().append("am.C(").append(param0).append(',');
            stackIn_127_0 = stackOut_125_0;
            stackIn_127_1 = stackOut_125_1;
            stackIn_126_0 = stackOut_125_0;
            stackIn_126_1 = stackOut_125_1;
            if (param1 == null) {
              stackOut_127_0 = (RuntimeException) ((Object) stackIn_127_0);
              stackOut_127_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackOut_127_2 = "null";
              stackIn_128_0 = stackOut_127_0;
              stackIn_128_1 = stackOut_127_1;
              stackIn_128_2 = stackOut_127_2;
              break L39;
            } else {
              stackOut_126_0 = (RuntimeException) ((Object) stackIn_126_0);
              stackOut_126_1 = (StringBuilder) ((Object) stackIn_126_1);
              stackOut_126_2 = "{...}";
              stackIn_128_0 = stackOut_126_0;
              stackIn_128_1 = stackOut_126_1;
              stackIn_128_2 = stackOut_126_2;
              break L39;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_128_0), stackIn_128_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bd) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bd) ((Object) stackIn_7_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (bd) ((Object) stackIn_58_0);
                } else {
                  return (bd) ((Object) stackIn_124_0);
                }
              }
            }
          }
        }
    }

    private final bd a(ha param0, int param1, jd param2) {
        String discarded$2 = null;
        String discarded$3 = null;
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
        int decompiledRegionSelector0 = 0;
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
              var4_int = this.field_J - -this.field_w;
              var5 = this.field_G - -this.field_E;
              if ((var4_int ^ -1) > -1) {
                break L1;
              } else {
                if (var5 < 0) {
                  break L1;
                } else {
                  if (param0.field_v <= var4_int) {
                    break L1;
                  } else {
                    if ((param0.field_db ^ -1) < (var5 ^ -1)) {
                      L2: {
                        var6 = param0.field_Eb[var4_int + var5 * param0.field_v].field_h;
                        if ((var6 ^ -1) == -3) {
                          break L2;
                        } else {
                          if (var6 == 4) {
                            break L2;
                          } else {
                            if (var6 == 6) {
                              break L2;
                            } else {
                              L3: {
                                if (param1 <= (this.field_o ^ -1)) {
                                  break L3;
                                } else {
                                  if (uc.field_d[this.field_o][5] != 24) {
                                    break L3;
                                  } else {
                                    stackOut_15_0 = new ur(this.field_J, this.field_G, this.field_w, this.field_E, this.field_p, param2, false);
                                    stackIn_16_0 = stackOut_15_0;
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  }
                                }
                              }
                              stackOut_17_0 = new ur(this.field_J, this.field_G, this.field_w, this.field_E, this.field_p, param2, true);
                              stackIn_18_0 = stackOut_17_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      discarded$2 = this.a(126, new String[]{"unit at ", ci.c(param2.field_J, 0, param2.field_w), " attempted to teleport onto ground type: ", Integer.toString(var6)}, "teleport");
                      stackOut_11_0 = null;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            discarded$3 = this.a(param1 + 124, new String[]{"unit at ", ci.c(param2.field_J, 0, param2.field_w), " attempted to teleport off the map"}, "teleport");
            stackOut_5_0 = null;
            stackIn_6_0 = stackOut_5_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("am.F(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          L5: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bd) ((Object) stackIn_6_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bd) ((Object) stackIn_12_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (bd) ((Object) stackIn_16_0);
            } else {
              return (bd) ((Object) stackIn_18_0);
            }
          }
        }
    }

    am(vh param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_p = param1;
            var3_int = param0.e((byte) -104) & 8191;
            this.field_H = new int[var3_int];
            this.field_J = param0.k(0);
            this.field_G = param0.k(0);
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var3_int ^ -1) >= (var5 ^ -1)) {
                    break L3;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_8_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != var5 % 4) {
                          break L4;
                        } else {
                          var4 = param0.k(0);
                          break L4;
                        }
                      }
                      this.field_H[var5] = rn.a(3, var4);
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
                stackOut_7_0 = var4;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              }
              L5: {
                L6: {
                  if (stackIn_8_0 != 0) {
                    break L6;
                  } else {
                    this.field_w = 0;
                    this.field_E = 0;
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                this.field_E = 255 & var4;
                this.field_w = var4 >> 1915640040;
                this.field_E = (this.field_E ^ 128) + -128;
                this.field_w = -128 + (this.field_w ^ 128);
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("am.<init>(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L7;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    am(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_H = param2;
            this.field_J = param3;
            this.field_E = param6;
            this.field_G = param4;
            this.field_w = param5;
            this.field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "am.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_y = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_I = new long[1000];
        field_B = new byte[]{(byte)2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        field_F = "You cannot add yourself!";
        field_K = new int[1024];
    }
}
