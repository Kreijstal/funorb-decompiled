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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = this.a(118, param0, "move");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("am.G(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_23_0 = null;
        bd stackIn_26_0 = null;
        Object stackIn_32_0 = null;
        pe stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!param0.field_s) {
              if ((this.field_H.length ^ -1) == -2) {
                L1: {
                  var4_int = this.field_J;
                  var5 = this.field_G;
                  var6 = this.field_H[0];
                  if (1 != var6) {
                    if (0 == var6) {
                      var4_int++;
                      break L1;
                    } else {
                      if ((var6 ^ -1) == -3) {
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
                    if (-1 < (var5 ^ -1)) {
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
                                  if ((var6 ^ -1) == -7) {
                                    break L3;
                                  } else {
                                    stackIn_34_0 = new pe(var4_int, var5, this.field_J, this.field_G, param0.field_Y, this.field_p);
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                }
                              }
                            }
                            this.a(120, new String[]{"vine at ", ci.c(param0.field_J, param1 + -32, param0.field_w), " attempted to grow onto ground type: ", Integer.toString(var6)}, "vine growth");
                            stackIn_32_0 = null;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            stackIn_26_0 = (bd) null;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
                this.a(127, new String[]{"vine at ", ci.c(param0.field_J, 0, param0.field_w), " attempted to escape the map"}, "vine growth");
                stackIn_23_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.a(-98, new String[]{"vine at ", ci.c(param0.field_J, param1 + -32, param0.field_w), " attempted to grow more than one step"}, "vine growth");
                stackIn_6_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.a(-84, new String[]{"vine at ", ci.c(param0.field_J, param1 ^ 32, param0.field_w), " has already grown"}, "vine growth");
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var4);

            stackIn_37_1 = new StringBuilder().append("am.H(");

            if (param0 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L4;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L5;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_38_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bd) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bd) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (bd) ((Object) stackIn_23_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (bd) ((Object) stackIn_32_0);
                } else {
                  return (bd) ((Object) stackIn_34_0);
                }
              }
            }
          }
        }
    }

    final bd a(int param0, ha param1) {
        String discarded$0 = null;
        String discarded$1 = null;
        String discarded$2 = null;
        String discarded$3 = null;
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
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        String stackIn_118_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                    discarded$0 = this.a(new String[]{"unit at ", ci.c(this.field_J, 0, this.field_G), " not owned by this player"}, 0);
                    stackIn_7_0 = null;
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
                        stackIn_20_0 = 3 * bw.field_m[var16.field_N][3];
                        break L4;
                      } else {
                        stackIn_20_0 = 0;
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
                            discarded$1 = this.a(new String[]{"unit at ", ci.c(this.field_J, 0, this.field_G), "Moved when in range of cyclops"}, 0);
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
                        if (this.field_H.length <= var7) {
                          break L10;
                        } else {
                          if (-1 <= (var4 ^ -1)) {
                            break L10;
                          } else {
                            L11: {
                              var8_int = param1.field_v * var6 + var5;
                              var9 = this.field_H[var7];
                              if ((var9 ^ -1) == -2) {
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
                                  if (param1.field_v <= var5) {
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
                                        this.field_w = 0;
                                        this.field_E = 0;
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            discarded$2 = this.a(new String[]{"unit at ", ci.c(this.field_J, 0, this.field_G), " attempted to escape the map"}, 0);
                            stackIn_52_0 = null;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        }
                      }
                      L13: {
                        if (-1 == (var17.field_B ^ -1)) {
                          this.field_E = 0;
                          this.field_w = 0;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        var8 = param1.c(this.field_E + var6, true, var5 + this.field_w);
                        if (var8 == null) {
                          this.field_E = 0;
                          this.field_w = 0;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (-1 >= (this.field_w ^ -1)) {
                          stackIn_65_0 = 1;
                          break L15;
                        } else {
                          stackIn_65_0 = -1;
                          break L15;
                        }
                      }
                      L16: {
                        var9 = stackIn_65_0;
                        if (0 <= this.field_E) {
                          stackIn_68_0 = 1;
                          break L16;
                        } else {
                          stackIn_68_0 = -1;
                          break L16;
                        }
                      }
                      L17: {
                        var10 = stackIn_68_0;
                        var11 = var9 * this.field_w - -(this.field_E * var10);
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
                                if ((var17.field_N ^ -1) != -75) {
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
                                if (-4 != (var17.g(0) ^ -1)) {
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
                                if (-2 == (var17.j(20640) ^ -1)) {
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
                          field_I = (long[]) null;
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
                                if (var11 <= var13) {
                                  break L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            this.field_E = 0;
                            this.field_w = 0;
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
                                this.field_w = 0;
                                this.field_E = 0;
                                break L23;
                              }
                            }
                          }
                        } else {
                          L26: {
                            if (-5 != (bw.field_m[var17.field_N][0] ^ -1)) {
                              stackIn_97_0 = 0;
                              break L26;
                            } else {
                              stackIn_97_0 = 1;
                              break L26;
                            }
                          }
                          L27: {
                            var14 = stackIn_97_0;
                            if (!param1.field_j.a(var6, this.field_w + var5, var5, var14 != 0, var13, this.field_E + var6, (byte) 81)) {
                              this.field_w = 0;
                              this.field_E = 0;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          L28: {
                            if (-1 != (param1.b(31, var6 + this.field_E, var5 + this.field_w, var17.field_O) & 2 ^ -1)) {
                              break L28;
                            } else {
                              if (0 != (param1.b(31, var6, var5, var17.field_O) & 2)) {
                                break L28;
                              } else {
                                break L23;
                              }
                            }
                          }
                          this.field_w = 0;
                          this.field_E = 0;
                          break L23;
                        }
                      }
                      L29: {
                        if (var7 != 0) {
                          break L29;
                        } else {
                          if (this.field_w != 0) {
                            break L29;
                          } else {
                            if (0 != this.field_E) {
                              break L29;
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                      stackIn_114_0 = new ld(this.field_J, this.field_G, this.field_H, var7, this.field_w, this.field_E, this.field_p, var17, param1.c(var6 + this.field_E, true, this.field_w + var5));
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    stackIn_16_0 = this.a(var17, (byte) 32, param1);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
              stackIn_13_0 = this.a(param1, 0, var17);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              discarded$3 = this.a(new String[]{"no unit at ", ci.c(this.field_J, 0, this.field_G)}, 0);
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var3 = decompiledCaughtException;
            stackIn_117_0 = (RuntimeException) (var3);

            stackIn_117_1 = new StringBuilder().append("am.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_118_0 = (RuntimeException) ((Object) stackIn_117_0);
              stackIn_118_1 = (StringBuilder) ((Object) stackIn_117_1);
              stackIn_118_2 = "null";
              break L30;
            } else {
              stackIn_118_0 = (RuntimeException) ((Object) stackIn_117_0);
              stackIn_118_1 = (StringBuilder) ((Object) stackIn_117_1);
              stackIn_118_2 = "{...}";
              break L30;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_118_0), stackIn_118_2 + ')');
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
                  return (bd) ((Object) stackIn_52_0);
                } else {
                  return (bd) ((Object) stackIn_114_0);
                }
              }
            }
          }
        }
    }

    private final bd a(ha param0, int param1, jd param2) {
        Object stackIn_6_0 = null;
        Object stackIn_12_0 = null;
        ur stackIn_16_0 = null;
        ur stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
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
                    if (param0.field_db > var5) {
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
                                    stackIn_16_0 = new ur(this.field_J, this.field_G, this.field_w, this.field_E, this.field_p, param2, false);
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  }
                                }
                              }
                              stackIn_18_0 = new ur(this.field_J, this.field_G, this.field_w, this.field_E, this.field_p, param2, true);
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      this.a(126, new String[]{"unit at ", ci.c(param2.field_J, 0, param2.field_w), " attempted to teleport onto ground type: ", Integer.toString(var6)}, "teleport");
                      stackIn_12_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            this.a(param1 + 124, new String[]{"unit at ", ci.c(param2.field_J, 0, param2.field_w), " attempted to teleport off the map"}, "teleport");
            stackIn_6_0 = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("am.F(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
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
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
              if (var3_int <= var5) {
                L2: {
                  var4 = param0.e((byte) -104);
                  if (var4 != 0) {
                    this.field_E = 255 & var4;
                    this.field_w = var4 >> 1915640040;
                    this.field_E = (this.field_E ^ 128) + -128;
                    this.field_w = -128 + (this.field_w ^ 128);
                    break L2;
                  } else {
                    this.field_w = 0;
                    this.field_E = 0;
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
                this.field_H[var5] = rn.a(3, var4);
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
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("am.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
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
