/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    int field_m;
    int field_e;
    static String[] field_h;
    int[][] field_g;
    int field_a;
    static int[] field_c;
    dl[][] field_f;
    private int[][] field_d;
    mk field_l;
    int field_b;
    e field_i;
    static int[] field_j;
    private int field_k;

    private final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int stackIn_17_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_159_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        dl var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        var21 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param5 > 92) {
                break L1;
              } else {
                this.field_m = 80;
                break L1;
              }
            }
            L2: {
              if (-2 < (param3 ^ -1)) {
                break L2;
              } else {
                if (param3 >= -1 + this.field_b) {
                  break L2;
                } else {
                  if (-2 < (param6 ^ -1)) {
                    break L2;
                  } else {
                    if ((param6 ^ -1) <= (this.field_e - 1 ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        var8_int = -param1 + param3;
                        var9 = -param0 + param6;
                        var10 = -param2 + param4;
                        var11 = Math.abs(var8_int);
                        if ((var11 ^ -1) > (Math.abs(var9) ^ -1)) {
                          var11 = Math.abs(var9);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (Math.abs(var10) > var11) {
                          var11 = Math.abs(var10);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (var11 == 0) {
                        stackIn_30_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        if (var11 > 32) {
                          stackIn_35_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var15 = param1;
                          var16 = param0;
                          var17 = param2;
                          var19 = 1;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if ((var19 ^ -1) < (var11 ^ -1)) {
                                  break L7;
                                } else {
                                  var12 = param1 + var8_int * var19 / var11;
                                  var13 = var19 * var9 / var11 + param0;
                                  var14 = (var19 * 10 * var10 + var11 * (param2 * 10 - -9)) / (var11 * 10);
                                  var18 = this.a(122, var13, var14, var12);
                                  stackIn_159_0 = var19 ^ -1;

                                  if (var21 != 0) {
                                    break L6;
                                  } else {
                                    L8: {
                                      if (stackIn_159_0 == (var11 ^ -1)) {
                                        break L8;
                                      } else {
                                        if (null != var18) {
                                          if (3 != var18.field_v) {
                                            break L8;
                                          } else {
                                            stackIn_49_0 = 0;
                                            decompiledRegionSelector0 = 4;
                                            break L0;
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if ((var12 ^ -1) > -1) {
                                        break L9;
                                      } else {
                                        if (-1 < (var13 ^ -1)) {
                                          break L9;
                                        } else {
                                          if ((var12 ^ -1) <= (this.field_b ^ -1)) {
                                            break L9;
                                          } else {
                                            if (var13 >= this.field_e) {
                                              break L9;
                                            } else {
                                              L10: {
                                                var12 = var15;
                                                var13 = var16;
                                                var20 = 0;
                                                var14 = (var10 * (10 * var19) + (param2 * 10 - -9) * var11) / (10 * var11);
                                                var18 = this.a(-48, var13, var14, var12);
                                                if (var18 == null) {
                                                  break L10;
                                                } else {
                                                  L11: {
                                                    if ((var17 ^ -1) <= (var14 ^ -1)) {
                                                      break L11;
                                                    } else {
                                                      if (-1 == var18.field_v) {
                                                        break L11;
                                                      } else {
                                                        if (-1 == var18.field_b) {
                                                          break L11;
                                                        } else {
                                                          var20 = 1;
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (var14 >= var17) {
                                                    break L10;
                                                  } else {
                                                    if (null == var18.field_C) {
                                                      break L10;
                                                    } else {
                                                      if (0 == (var18.field_C.field_v ^ -1)) {
                                                        break L10;
                                                      } else {
                                                        if (0 != (var18.field_C.field_b ^ -1)) {
                                                          var20 = 1;
                                                          break L10;
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              L12: {
                                                if (var20 != 0) {
                                                  stackIn_92_0 = 0;
                                                  break L12;
                                                } else {
                                                  stackIn_92_0 = 1;
                                                  break L12;
                                                }
                                              }
                                              L13: {
                                                if (stackIn_92_0 != 1) {
                                                  break L13;
                                                } else {
                                                  var17 = var14;
                                                  break L13;
                                                }
                                              }
                                              L14: {
                                                var13 = var16;
                                                var14 = var17;
                                                var12 = param1 + var8_int * var19 / var11;
                                                var18 = this.a(-66, var13, var14, var12);
                                                if (var18 == null) {
                                                  break L14;
                                                } else {
                                                  L15: {
                                                    if ((var15 ^ -1) <= (var12 ^ -1)) {
                                                      break L15;
                                                    } else {
                                                      if ((var18.field_e & 1 ^ -1) != -2) {
                                                        break L15;
                                                      } else {
                                                        stackIn_102_0 = 0;
                                                        decompiledRegionSelector0 = 6;
                                                        break L0;
                                                      }
                                                    }
                                                  }
                                                  if ((var15 ^ -1) >= (var12 ^ -1)) {
                                                    break L14;
                                                  } else {
                                                    if ((var18.field_e & 4 ^ -1) == -5) {
                                                      stackIn_110_0 = 0;
                                                      decompiledRegionSelector0 = 7;
                                                      break L0;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                              }
                                              L16: {
                                                var15 = var12;
                                                var13 = param0 - -(var19 * var9 / var11);
                                                var18 = this.a(97, var13, var14, var12);
                                                if (null != var18) {
                                                  L17: {
                                                    if ((var13 ^ -1) >= (var16 ^ -1)) {
                                                      break L17;
                                                    } else {
                                                      if (-3 != (2 & var18.field_e ^ -1)) {
                                                        break L17;
                                                      } else {
                                                        stackIn_119_0 = 0;
                                                        decompiledRegionSelector0 = 8;
                                                        break L0;
                                                      }
                                                    }
                                                  }
                                                  if ((var16 ^ -1) >= (var13 ^ -1)) {
                                                    break L16;
                                                  } else {
                                                    if ((var18.field_e & 8 ^ -1) != -9) {
                                                      break L16;
                                                    } else {
                                                      stackIn_125_0 = 0;
                                                      decompiledRegionSelector0 = 9;
                                                      break L0;
                                                    }
                                                  }
                                                } else {
                                                  break L16;
                                                }
                                              }
                                              L18: {
                                                var16 = var13;
                                                if (var20 != 0) {
                                                  var14 = ((param2 * 10 + 9) * var11 - -(var10 * (10 * var19))) / (var11 * 10);
                                                  var18 = this.a(-33, var13, var14, var12);
                                                  if (null == var18) {
                                                    break L18;
                                                  } else {
                                                    L19: {
                                                      if (var17 >= var14) {
                                                        break L19;
                                                      } else {
                                                        if (0 == (var18.field_v ^ -1)) {
                                                          break L19;
                                                        } else {
                                                          if ((var18.field_b ^ -1) != 0) {
                                                            stackIn_142_0 = 0;
                                                            decompiledRegionSelector0 = 10;
                                                            break L0;
                                                          } else {
                                                            break L19;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (var14 >= var17) {
                                                      break L18;
                                                    } else {
                                                      if (var18.field_C == null) {
                                                        break L18;
                                                      } else {
                                                        if ((var18.field_C.field_v ^ -1) == 0) {
                                                          break L18;
                                                        } else {
                                                          if (0 != (var18.field_C.field_b ^ -1)) {
                                                            stackIn_156_0 = 0;
                                                            decompiledRegionSelector0 = 11;
                                                            break L0;
                                                          } else {
                                                            break L18;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  break L18;
                                                }
                                              }
                                              var16 = var13;
                                              var15 = var12;
                                              var17 = var14;
                                              var19++;
                                              if (var21 == 0) {
                                                continue L5;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackIn_63_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                }
                              }
                              stackIn_159_0 = 1;
                              break L6;
                            }
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            stackIn_17_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var8), "dk.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_30_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_35_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_159_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_49_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_63_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_102_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_110_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_119_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_125_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_142_0 != 0;
                            } else {
                              return stackIn_156_0 != 0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var7_int = -param4 + param1;
              var8 = -param3 + param5;
              var9 = Math.abs(var7_int);
              if (var9 < Math.abs(var8)) {
                var9 = Math.abs(var8);
                break L1;
              } else {
                break L1;
              }
            }
            if (var9 == 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var12 = param4;
                if (!param0) {
                  break L2;
                } else {
                  this.field_g = (int[][]) null;
                  break L2;
                }
              }
              var13 = param3;
              var14 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if ((var14 ^ -1) < (var9 ^ -1)) {
                      break L5;
                    } else {
                      var11 = param3 - -(var8 * var14 / var9);
                      var10 = var7_int * var14 / var9 + param4;
                      if (var15 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (var10 < 0) {
                            break L6;
                          } else {
                            if (-1 < (var11 ^ -1)) {
                              break L6;
                            } else {
                              if ((var10 ^ -1) <= (this.field_b ^ -1)) {
                                break L6;
                              } else {
                                if ((this.field_e ^ -1) >= (var11 ^ -1)) {
                                  break L6;
                                } else {
                                  L7: {
                                    var11 = var13;
                                    if ((var12 ^ -1) <= (var10 ^ -1)) {
                                      break L7;
                                    } else {
                                      if ((this.field_f[var10][var11].field_e & 1 ^ -1) == -2) {
                                        decompiledRegionSelector0 = 3;
                                        break L0;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  L8: {
                                    if (var12 <= var10) {
                                      break L8;
                                    } else {
                                      if (4 != (this.field_f[var10][var11].field_e & 4)) {
                                        break L8;
                                      } else {
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                  L9: {
                                    var11 = var8 * var14 / var9 + param3;
                                    if ((var13 ^ -1) <= (var11 ^ -1)) {
                                      break L9;
                                    } else {
                                      if (2 == (this.field_f[var10][var11].field_e & 2)) {
                                        decompiledRegionSelector0 = 5;
                                        break L0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (var11 >= var13) {
                                      break L10;
                                    } else {
                                      if (-9 != (this.field_f[var10][var11].field_e & 8 ^ -1)) {
                                        break L10;
                                      } else {
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var14 - jh.field_n >= this.field_g[var10][var11]) {
                                      break L11;
                                    } else {
                                      if (jh.field_n < var14) {
                                        this.field_g[var10][var11] = var14 - jh.field_n;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var14 != var9) {
                                      if (2 == this.field_f[var10][var11].field_v) {
                                        decompiledRegionSelector0 = 7;
                                        break L0;
                                      } else {
                                        if (this.field_f[var10][var11].field_v == 3) {
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                  var13 = var11;
                                  var12 = var10;
                                  var14++;
                                  if (var15 == 0) {
                                    continue L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  break L4;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var7), "dk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void c(int param0) {
        boolean discarded$0 = false;
        try {
            this.a(50, (byte) -122, 50);
            if (param0 != 5) {
                discarded$0 = this.a(-21, -19, -77, -123, -123, (byte) 64, 48);
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "dk.S(" + param0 + ')');
        }
    }

    final ue a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, boolean param7) {
        RuntimeException var9 = null;
        ue stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param7) {
                break L1;
              } else {
                dk.b(51);
                break L1;
              }
            }
            stackIn_4_0 = this.a(param4, param0, param1, -93, false, param3, param6, param5, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var9), "dk.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        return stackIn_4_0;
    }

    final ue a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        Object stackIn_24_0 = null;
        ue stackIn_27_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_144_0 = 0;
        Object stackIn_146_0 = null;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_185_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_187_1 = 0;
        Object stackIn_189_0 = null;
        Object stackIn_191_0 = null;
        Object stackIn_193_0 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dl var14 = null;
        int var15_int = 0;
        Object var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var8_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var8_int >= this.field_b) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_13_0 = 0;
                        stackIn_4_0 = stackIn_13_0;
                        if (var21 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_e <= var9) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_d[var8_int][var9] = 1000;
                        var9++;
                        if (var21 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var21 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8_int++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var21 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8_int = param1;
                        stackIn_13_0 = param1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = stackIn_13_0;
                        var10 = param4;
                        var11 = param4;
                        if (param1 < 1) {
                            statePc = 23;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (1 > param4) {
                            statePc = 23;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((-2 + this.field_b ^ -1) >= (param1 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((-2 + this.field_e ^ -1) < (param4 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = null;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return (ue) ((Object) stackIn_24_0);
                }
                case 25: {
                    try {
                        if (param6 >= 28) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = (ue) null;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0;
                }
                case 28: {
                    try {
                        this.field_d[param1][param4] = 0;
                        if (null == this.a(82, param4, param2, param1)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = null;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 32: {
                    return (ue) ((Object) stackIn_32_0);
                }
                case 33: {
                    try {
                        var15_int = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = var15_int ^ -1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 <= -1001) {
                            statePc = 143;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_144_0 = var8_int;
                        stackIn_37_0 = stackIn_144_0;
                        if (var21 != 0) {
                            statePc = 144;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var16 = stackIn_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = var9 ^ -1;
                        stackIn_39_1 = var16 ^ -1;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 > stackIn_39_1) {
                            statePc = 142;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_35_0 = var10;
                        stackIn_41_0 = stackIn_35_0;
                        if (var21 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var17 = stackIn_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var17 ^ -1) < (var11 ^ -1)) {
                            statePc = 141;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_39_0 = var15_int;
                        stackIn_44_0 = stackIn_39_0;
                        stackIn_39_1 = this.field_d[var16][var17];
                        stackIn_44_1 = stackIn_39_1;
                        if (var21 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 != stackIn_44_1) {
                            statePc = 140;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var8_int != var16) {
                            statePc = 53;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (1 >= var16) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var8_int--;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var17 != var11) {
                            statePc = 59;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var17 ^ -1) <= (-2 + this.field_b ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var11++;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var10 != var17) {
                            statePc = 66;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var17 > 1) {
                            statePc = 65;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var10--;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (param3 != var16) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var17 != param5) {
                            statePc = 71;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var15_int = 1000;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((var16 ^ -1) != (var9 ^ -1)) {
                            statePc = 78;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if ((var16 ^ -1) > (this.field_b - 2 ^ -1)) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var9++;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var14 = this.a(-41, var17, param2, var16);
                        if (var14 == null) {
                            statePc = 140;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (!param0) {
                            statePc = 90;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var14.field_a) {
                            statePc = 90;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (!var14.field_d) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        this.field_d[var16][var17] = 1000;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (-2 <= (var16 ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var12 = -1;
                        var13 = 0;
                        if (this.field_d[var12 + var16][var13 + var17] <= var14.a(var13, var12, -114) + var15_int) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        this.field_d[var12 + var16][var13 + var17] = var14.a(var13, var12, -124) + var15_int;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (var16 <= 1) {
                            statePc = 101;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if ((var17 ^ -1) >= -2) {
                            statePc = 101;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var12 = -1;
                        var13 = -1;
                        if ((this.field_d[var16 + var12][var13 + var17] ^ -1) >= (var15_int + var14.a(var13, var12, -116) ^ -1)) {
                            statePc = 101;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        this.field_d[var16 + var12][var13 + var17] = var15_int - -var14.a(var13, var12, -128);
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (1 >= var16) {
                            statePc = 110;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (var17 < this.field_e + -2) {
                            statePc = 107;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var12 = -1;
                        var13 = 1;
                        if (this.field_d[var12 + var16][var17 - -var13] <= var14.a(var13, var12, -116) + var15_int) {
                            statePc = 110;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        this.field_d[var16 - -var12][var17 + var13] = var14.a(var13, var12, -109) + var15_int;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if ((var16 ^ -1) <= (this.field_b - 2 ^ -1)) {
                            statePc = 115;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var12 = 1;
                        var13 = 0;
                        if ((this.field_d[var12 + var16][var17 + var13] ^ -1) < (var14.a(var13, var12, -123) + var15_int ^ -1)) {
                            statePc = 114;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        this.field_d[var12 + var16][var13 + var17] = var15_int + var14.a(var13, var12, -120);
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if ((this.field_b + -2 ^ -1) >= (var16 ^ -1)) {
                            statePc = 122;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (var17 <= 1) {
                            statePc = 122;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var12 = 1;
                        var13 = -1;
                        if (this.field_d[var12 + var16][var13 + var17] <= var14.a(var13, var12, -115) + var15_int) {
                            statePc = 122;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        this.field_d[var16 + var12][var13 + var17] = var15_int - -var14.a(var13, var12, -114);
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (-2 + this.field_b <= var16) {
                            statePc = 132;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if ((var17 ^ -1) > (this.field_e + -2 ^ -1)) {
                            statePc = 128;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        var13 = 1;
                        var12 = 1;
                        if (this.field_d[var12 + var16][var17 + var13] > var15_int + var14.a(var13, var12, -120)) {
                            statePc = 131;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        this.field_d[var12 + var16][var13 + var17] = var14.a(var13, var12, -118) + var15_int;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (1 >= var17) {
                            statePc = 136;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var13 = -1;
                        var12 = 0;
                        if ((this.field_d[var16 + var12][var13 + var17] ^ -1) >= (var14.a(var13, var12, -108) + var15_int ^ -1)) {
                            statePc = 136;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        this.field_d[var12 + var16][var13 + var17] = var15_int + var14.a(var13, var12, -123);
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if ((-2 + this.field_e ^ -1) >= (var17 ^ -1)) {
                            statePc = 140;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        var13 = 1;
                        var12 = 0;
                        if ((this.field_d[var12 + var16][var13 + var17] ^ -1) >= (var14.a(var13, var12, -124) + var15_int ^ -1)) {
                            statePc = 140;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        this.field_d[var12 + var16][var13 + var17] = var15_int + var14.a(var13, var12, -118);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var17++;
                        if (var21 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var16++;
                        if (var21 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var15_int++;
                        if (var21 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        stackIn_144_0 = this.a(false, param1, param4, (byte) 88, param2) ? 1 : 0;
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (stackIn_144_0 == 0) {
                            statePc = 147;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        this.field_d[param1][param4] = 1000;
                        stackIn_146_0 = null;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 146: {
                    return (ue) ((Object) stackIn_146_0);
                }
                case 147: {
                    try {
                        if (-1001 >= (this.field_d[param3][param5] ^ -1)) {
                            statePc = 192;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var15 = null;
                        var19 = param3;
                        var20 = param5;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if ((param1 ^ -1) != (var19 ^ -1)) {
                            statePc = 151;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (var20 == param4) {
                            statePc = 190;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        var17 = 0;
                        var18 = this.field_d[var19][var20];
                        var16 = 0;
                        var12 = -1;
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        stackIn_153_0 = var12 ^ -1;
                        stackIn_153_1 = -2;
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (stackIn_153_0 < stackIn_153_1) {
                            statePc = 179;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        stackIn_185_0 = -1;
                        stackIn_155_0 = stackIn_185_0;
                        if (var21 != 0) {
                            statePc = 185;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        var13 = stackIn_155_0;
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        if (var13 > 1) {
                            statePc = 178;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        stackIn_153_0 = var19 - -var12 ^ -1;
                        stackIn_158_0 = stackIn_153_0;
                        stackIn_153_1 = -1;
                        stackIn_158_1 = stackIn_153_1;
                        if (var21 != 0) {
                            statePc = 153;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (stackIn_158_0 >= stackIn_158_1) {
                            statePc = 177;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        if (-1 <= (var13 + var20 ^ -1)) {
                            statePc = 177;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (var19 + var12 >= -1 + this.field_b) {
                            statePc = 177;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        if (-1 + this.field_e > var20 - -var13) {
                            statePc = 170;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        var14 = this.a(81, var13 + var20, param2, var19 - -var12);
                        if ((this.field_d[var19 - -var12][var20 - -var13] ^ -1) <= (var18 ^ -1)) {
                            statePc = 177;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (1000 > var14.a(-var13, -var12, -127)) {
                            statePc = 176;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        var16 = var12;
                        var18 = this.field_d[var19 - -var12][var20 - -var13];
                        var17 = var13;
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        var13++;
                        if (var21 == 0) {
                            statePc = 156;
                        } else {
                            statePc = 178;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        var12++;
                        if (var21 == 0) {
                            statePc = 152;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (null == var15) {
                            statePc = 183;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        ((ue) (var15)).a(this.field_d[var19][var20] + -var18, var17, var16, (byte) -48);
                        if (var21 == 0) {
                            statePc = 184;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        var15 = new ue(var16, var17, -var18 + this.field_d[var19][var20]);
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        var20 = var20 + var17;
                        var19 = var19 + var16;
                        stackIn_185_0 = var16 ^ -1;
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if (stackIn_185_0 != -1) {
                            statePc = 149;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        stackIn_153_0 = var17 ^ -1;
                        stackIn_187_0 = stackIn_153_0;
                        stackIn_153_1 = -1;
                        stackIn_187_1 = stackIn_153_1;
                        if (var21 != 0) {
                            statePc = 153;
                        } else {
                            statePc = 187;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        if (stackIn_187_0 != stackIn_187_1) {
                            statePc = 149;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        stackIn_189_0 = null;
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 189: {
                    return (ue) ((Object) stackIn_189_0);
                }
                case 190: {
                    try {
                        stackIn_191_0 = var15;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 191: {
                    return (ue) ((Object) stackIn_191_0);
                }
                case 192: {
                    try {
                        stackIn_193_0 = null;
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 193: {
                    return (ue) ((Object) stackIn_193_0);
                }
                case 194: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    throw qk.a((Throwable) ((Object) var8), "dk.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(byte param0) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = aa.field_m;
                        var3 = -(eg.field_p * 2) + pd.field_h;
                        if (param0 == -96) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(29, 74, -97, 18, 98, 87, true);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 >= -1 + this.field_b) {
                            statePc = 36;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-1 + this.field_e <= var5) {
                            statePc = 32;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_33_0 = var2_int;
                        stackIn_10_0 = stackIn_33_0;
                        stackIn_33_1 = this.field_i.field_y;
                        stackIn_10_1 = stackIn_33_1;
                        if (var6 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 > stackIn_10_1) {
                            statePc = 31;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var3 > this.field_i.field_j) {
                            statePc = 31;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (this.field_i.field_y > 1 + var2_int) {
                            statePc = 31;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((this.field_i.field_j ^ -1) >= (1 + var3 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((this.field_i.field_N ^ -1) != -2) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (le.field_q != null) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        sj.field_b = -(var5 * 32) + 32 * var4;
                        vf.field_a = -1;
                        uf.field_c = -1;
                        lg.field_c = var4 * 16 + var5 * 16;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        hl.field_a = true;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var2_int -= 2;
                        var3++;
                        var5++;
                        if (var6 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var3 = var3 - (this.field_e + -2);
                        stackIn_33_0 = var2_int;
                        stackIn_33_1 = -4 + 2 * this.field_e;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var2_int = stackIn_33_0 + stackIn_33_1;
                        var3++;
                        var2_int += 2;
                        var4++;
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw qk.a((Throwable) ((Object) var2), "dk.BA(" + param0 + ')');
                }
                case 36: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, r param1, r param2, boolean param3) {
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_233_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_273_0 = 0;
        int stackIn_285_0 = 0;
        int stackIn_289_0 = 0;
        int stackIn_297_0 = 0;
        int stackIn_303_0 = 0;
        int stackIn_309_0 = 0;
        int stackIn_315_0 = 0;
        int stackIn_324_0 = 0;
        int stackIn_331_0 = 0;
        int stackIn_340_0 = 0;
        int stackIn_349_0 = 0;
        int stackIn_359_0 = 0;
        int stackIn_361_0 = 0;
        int stackIn_366_0 = 0;
        int stackIn_374_0 = 0;
        int stackIn_380_0 = 0;
        int stackIn_392_0 = 0;
        int stackIn_400_0 = 0;
        int stackIn_407_0 = 0;
        int stackIn_416_0 = 0;
        int stackIn_441_0 = 0;
        int stackIn_444_0 = 0;
        int stackIn_446_0 = 0;
        int stackIn_459_0 = 0;
        int stackIn_462_0 = 0;
        RuntimeException stackIn_464_0 = null;
        StringBuilder stackIn_464_1 = null;
        RuntimeException stackIn_466_0 = null;
        StringBuilder stackIn_466_1 = null;
        RuntimeException stackIn_467_0 = null;
        StringBuilder stackIn_467_1 = null;
        String stackIn_467_2 = null;
        RuntimeException stackIn_468_0 = null;
        StringBuilder stackIn_468_1 = null;
        RuntimeException stackIn_470_0 = null;
        StringBuilder stackIn_470_1 = null;
        RuntimeException stackIn_471_0 = null;
        StringBuilder stackIn_471_1 = null;
        String stackIn_471_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        dl var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        int var37 = 0;
        dl var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var41 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param2 != param1) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = 1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    if (param2 == null) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param1 != null) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return stackIn_9_0 != 0;
                }
                case 10: {
                    var5 = param1.field_c;
                    if (param3) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var5 = this.a(114, param1.field_gb, param1.field_R, param1.field_i);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (null == param2.field_c) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (null != var5) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    if (null == param2.field_Z) {
                        statePc = 31;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (var5.field_a) {
                        statePc = 31;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (!param3) {
                        statePc = 29;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 31: {
                    var6 = param2.field_U;
                    var7 = (double)(100 * (-param2.field_F + param1.field_F));
                    var9 = (double)(100 * (param1.field_H - param2.field_H));
                    var11 = param1.field_E;
                    if (!param3) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var7 = (double)(100 * (param1.field_i + -param2.field_F));
                    var9 = (double)((param1.field_gb - param2.field_H) * 100);
                    var11 = param1.field_R;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (!param1.field_k) {
                        statePc = 36;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (0 != param2.field_U) {
                        statePc = 42;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var7 >= 0.0) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_41_0 = 0;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    return stackIn_41_0 != 0;
                }
                case 42: {
                    if ((param2.field_U ^ -1) != -2) {
                        statePc = 48;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (0.0 <= var7 + var9) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    return stackIn_47_0 != 0;
                }
                case 48: {
                    if (-3 != (param2.field_U ^ -1)) {
                        statePc = 56;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var9 < 0.0) {
                        statePc = 54;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 54: {
                    stackIn_55_0 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    return stackIn_55_0 != 0;
                }
                case 56: {
                    if (3 != param2.field_U) {
                        statePc = 62;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var7 - var9 <= 0.0) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_61_0 = 0;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    return stackIn_61_0 != 0;
                }
                case 62: {
                    if (4 != param2.field_U) {
                        statePc = 70;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (0.0 < var7) {
                        statePc = 68;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_69_0 = 0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    return stackIn_69_0 != 0;
                }
                case 70: {
                    if (param2.field_U != 5) {
                        statePc = 78;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (0.0 < var9 + var7) {
                        statePc = 76;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    return stackIn_77_0 != 0;
                }
                case 78: {
                    if (param2.field_U != 6) {
                        statePc = 84;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (0.0 >= var9) {
                        statePc = 84;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    stackIn_83_0 = 0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    return stackIn_83_0 != 0;
                }
                case 84: {
                    if (param2.field_U != 7) {
                        statePc = 92;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (-var9 + var7 < 0.0) {
                        statePc = 90;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 90: {
                    stackIn_91_0 = 0;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    return stackIn_91_0 != 0;
                }
                case 92: {
                    param2.a(true, (int)(var7 / 100.0 + (double)param2.field_F), (int)((double)param2.field_H + var9 / 100.0));
                    var12 = 87 + 100 * param2.field_E;
                    var13 = param2.field_nb.field_g;
                    if (-2 != (param2.field_B ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (!param2.f((byte) 91)) {
                        statePc = 100;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (param2.field_N != param2.field_E) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var12 = 100 * var11 + 66;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if ((var13 ^ -1) == -1) {
                        statePc = 110;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if ((var13 ^ -1) == -9) {
                        statePc = 110;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (var13 == 12) {
                        statePc = 110;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if ((var13 ^ -1) != -4) {
                        statePc = 118;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var12 = 75 - -(var11 * 100);
                    if (param2.field_B != 1) {
                        statePc = 118;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (!param2.f((byte) 120)) {
                        statePc = 118;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if ((param2.field_N ^ -1) != (param2.field_E ^ -1)) {
                        statePc = 118;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var12 = 100 * var11 + 52;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (var13 == 6) {
                        statePc = 125;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (var13 == 14) {
                        statePc = 125;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (-16 != (var13 ^ -1)) {
                        statePc = 126;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var12 = 54 - -(100 * var11);
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    if (param2.field_c.field_C == null) {
                        statePc = 133;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (param2.field_c.field_C.field_v == 5) {
                        statePc = 132;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var12 += 25;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (var11 < param2.field_E) {
                        statePc = 136;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var12 = 87 + param2.field_E * 100;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    var14 = 0;
                    var15 = 1;
                    var16 = 20;
                    if (0 == var13) {
                        statePc = 140;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var16 = 20;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (var13 != 1) {
                        statePc = 143;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var16 = 32;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (-3 == (var13 ^ -1)) {
                        statePc = 146;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var16 = 40;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (var13 == 3) {
                        statePc = 150;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var16 = 28;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (var13 == 4) {
                        statePc = 154;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var16 = 36;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (6 != var13) {
                        statePc = 157;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var16 = 34;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    if ((var13 ^ -1) == -8) {
                        statePc = 160;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var16 = 40;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if ((var13 ^ -1) == -9) {
                        statePc = 164;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var16 = 20;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    if (-10 != (var13 ^ -1)) {
                        statePc = 167;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var16 = 33;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (-11 == (var13 ^ -1)) {
                        statePc = 170;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var16 = 35;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (12 == var13) {
                        statePc = 174;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var16 = 24;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if ((var13 ^ -1) != -14) {
                        statePc = 177;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    var16 = 40;
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    if (14 != var13) {
                        statePc = 179;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var16 = 51;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if ((var13 ^ -1) != -16) {
                        statePc = 181;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var16 = 46;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (var13 == 16) {
                        statePc = 184;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var16 = 39;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (18 == var13) {
                        statePc = 188;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var16 = 45;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    var16 += 12;
                    var16 = (int)((double)(var16 * 100) / Math.sqrt(2048.0));
                    if (-1 == (param2.field_U ^ -1)) {
                        statePc = 192;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var14 = 1;
                    var15 = 0;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (1 == param2.field_U) {
                        statePc = 196;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var15 = 1;
                    var14 = 1;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    if (param2.field_U == 2) {
                        statePc = 200;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var14 = 0;
                    var15 = 1;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    if ((param2.field_U ^ -1) != -4) {
                        statePc = 203;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var14 = -1;
                    var15 = 1;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    if (param2.field_U == 4) {
                        statePc = 206;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var15 = 0;
                    var14 = -1;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if (5 != param2.field_U) {
                        statePc = 209;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var14 = -1;
                    var15 = -1;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    if (6 != param2.field_U) {
                        statePc = 211;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var14 = 0;
                    var15 = -1;
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    if (-8 == (param2.field_U ^ -1)) {
                        statePc = 214;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 214: {
                    var15 = -1;
                    var14 = 1;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    var17 = (double)var16 * ((double)var14 / Math.sqrt((double)(var14 * var14 + var15 * var15)));
                    if (var17 < -50.0) {
                        statePc = 218;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 218: {
                    var17 = -50.0;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    var19 = (double)var15 / Math.sqrt((double)(var14 * var14 + var15 * var15)) * (double)var16;
                    if (var19 < -50.0) {
                        statePc = 222;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 222: {
                    var19 = -50.0;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if (var17 > 50.0) {
                        statePc = 226;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 226: {
                    var17 = 50.0;
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    var7 = var7 - var17;
                    if (var19 > 50.0) {
                        statePc = 230;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var19 = 50.0;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if (param0 == 10056) {
                        statePc = 234;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    stackIn_233_0 = 0;
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    return stackIn_233_0 != 0;
                }
                case 234: {
                    var9 = var9 - var19;
                    var21 = 100 * param1.field_E + 70;
                    if ((param2.field_E ^ -1) >= (param1.field_E ^ -1)) {
                        statePc = 236;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    var21 = param1.field_E * 100 + 55;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    if (param1.field_E > param2.field_E) {
                        statePc = 239;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var21 = 85 + 100 * param1.field_E;
                    statePc = 240;
                    continue stateLoop;
                }
                case 240: {
                    var22 = (double)(var21 + -var12);
                    if (-2 != (param1.field_B ^ -1)) {
                        statePc = 250;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (param1.field_db) {
                        statePc = 250;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (160000.0 < var7 * var7 + var9 * var9) {
                        statePc = 249;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var21 -= 12;
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    var24 = Math.sqrt(var9 * var9 + var7 * var7 + var22 * var22) / 25.0;
                    if (var24 < 1.0) {
                        statePc = 253;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 253: {
                    param2.field_U = var6;
                    stackIn_254_0 = 1;
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    return stackIn_254_0 != 0;
                }
                case 255: {
                    var22 = var22 / var24;
                    var7 = var7 / var24;
                    var9 = var9 / var24;
                    var26 = param2.field_F;
                    var27 = param2.field_H;
                    var28 = param2.field_E;
                    var29 = var7;
                    var31 = var9;
                    var33 = var22;
                    param2.field_U = var6;
                    var35 = (double)(var12 + -(100 * var28));
                    var37 = 0;
                    statePc = 256;
                    continue stateLoop;
                }
                case 256: {
                    var37++;
                    if ((var37 ^ -1) <= -10001) {
                        statePc = 461;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    var38 = this.a(param0 + -9965, var27, var28, var26);
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    if (null != var38) {
                        statePc = 263;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    var28--;
                    var35 = var35 + 100.0;
                    var38 = this.a(-75, var27, var28, var26);
                    if (var41 != 0) {
                        statePc = 264;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (var41 == 0) {
                        statePc = 258;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var35 = var35 + var33;
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    if (var35 < (double)(-(100 * var38.field_r) + var38.field_l)) {
                        statePc = 267;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if (0 == (var38.field_v ^ -1)) {
                        statePc = 271;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if (var38.field_b != -1) {
                        statePc = 272;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    var28--;
                    var35 = var35 + 100.0;
                    var38 = this.a(122, var27, var28, var26);
                    if (var41 == 0) {
                        statePc = 274;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    stackIn_273_0 = 0;
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    return stackIn_273_0 != 0;
                }
                case 274: {
                    if (var35 <= 100.0) {
                        statePc = 290;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    if (var38.field_C == null) {
                        statePc = 287;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    if (-1 == var38.field_C.field_v) {
                        statePc = 286;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    if (var38.field_C.field_b == -1) {
                        statePc = 286;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    stackIn_285_0 = 0;
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    return stackIn_285_0 != 0;
                }
                case 286: {
                    var28++;
                    var38 = var38.field_C;
                    var35 = var35 - 100.0;
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    if (var35 <= 1000.0) {
                        statePc = 290;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    stackIn_289_0 = 0;
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    return stackIn_289_0 != 0;
                }
                case 290: {
                    if (1 != var38.field_v) {
                        statePc = 298;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    if ((double)(50 + var38.field_l) > var35) {
                        statePc = 296;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 296: {
                    stackIn_297_0 = 0;
                    statePc = 297;
                    continue stateLoop;
                }
                case 297: {
                    return stackIn_297_0 != 0;
                }
                case 298: {
                    if (-3 != (var38.field_v ^ -1)) {
                        statePc = 304;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    if ((double)(50 - -var38.field_l) <= var35) {
                        statePc = 304;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    stackIn_303_0 = 0;
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    return stackIn_303_0 != 0;
                }
                case 304: {
                    if (3 != var38.field_v) {
                        statePc = 310;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    if (var35 > (double)(100 - -var38.field_l)) {
                        statePc = 310;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    stackIn_309_0 = 0;
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    return stackIn_309_0 != 0;
                }
                case 310: {
                    var17 = var17 + var29;
                    if (var17 < -50.0) {
                        statePc = 313;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if ((var38.field_e & 1) != 1) {
                        statePc = 316;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    stackIn_315_0 = 0;
                    statePc = 315;
                    continue stateLoop;
                }
                case 315: {
                    return stackIn_315_0 != 0;
                }
                case 316: {
                    if (16 != (var38.field_e & 16)) {
                        statePc = 325;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    if (50.0 <= var35) {
                        statePc = 325;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    if (param2.field_E > param1.field_E) {
                        statePc = 325;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 323: {
                    stackIn_324_0 = 0;
                    statePc = 324;
                    continue stateLoop;
                }
                case 324: {
                    return stackIn_324_0 != 0;
                }
                case 325: {
                    var17 = var17 + 100.0;
                    var26--;
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    if (50.0 >= var17) {
                        statePc = 342;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    if ((4 & var38.field_e ^ -1) != -5) {
                        statePc = 332;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    stackIn_331_0 = 0;
                    statePc = 331;
                    continue stateLoop;
                }
                case 331: {
                    return stackIn_331_0 != 0;
                }
                case 332: {
                    if ((64 & var38.field_e ^ -1) != -65) {
                        statePc = 341;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    if (var35 >= 50.0) {
                        statePc = 341;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    if ((param2.field_E ^ -1) < (param1.field_E ^ -1)) {
                        statePc = 341;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    stackIn_340_0 = 0;
                    statePc = 340;
                    continue stateLoop;
                }
                case 340: {
                    return stackIn_340_0 != 0;
                }
                case 341: {
                    var17 = var17 - 100.0;
                    var26++;
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    if (var26 <= 0) {
                        statePc = 348;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    if ((var26 ^ -1) <= (this.field_b - 1 ^ -1)) {
                        statePc = 348;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 348: {
                    stackIn_349_0 = 0;
                    statePc = 349;
                    continue stateLoop;
                }
                case 349: {
                    return stackIn_349_0 != 0;
                }
                case 350: {
                    var38 = this.a(102, var27, var28, var26);
                    statePc = 351;
                    continue stateLoop;
                }
                case 351: {
                    if (null != var38) {
                        statePc = 356;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    var28--;
                    var35 = var35 + 100.0;
                    var38 = this.a(param0 ^ 10011, var27, var28, var26);
                    if (var41 != 0) {
                        statePc = 357;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    if (var41 == 0) {
                        statePc = 351;
                    } else {
                        statePc = 356;
                    }
                    continue stateLoop;
                }
                case 356: {
                    var19 = var19 + var31;
                    statePc = 357;
                    continue stateLoop;
                }
                case 357: {
                    if (null == var38.field_C) {
                        statePc = 365;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    stackIn_366_0 = (100.0 < var35 ? -1 : (100.0 == var35 ? 0 : 1));
                    stackIn_359_0 = stackIn_366_0;
                    if (var41 != 0) {
                        statePc = 366;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    stackIn_361_0 = stackIn_359_0;
                    statePc = 361;
                    continue stateLoop;
                }
                case 361: {
                    if (stackIn_361_0 >= 0) {
                        statePc = 365;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 364: {
                    var35 = var35 - 100.0;
                    var38 = var38.field_C;
                    var28++;
                    if (var41 == 0) {
                        statePc = 357;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    stackIn_366_0 = (var19 < 50.0 ? -1 : (var19 == 50.0 ? 0 : 1));
                    statePc = 366;
                    continue stateLoop;
                }
                case 366: {
                    if (stackIn_366_0 <= 0) {
                        statePc = 382;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 367: {
                    if (100.0 >= var35) {
                        statePc = 372;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 372: {
                    if ((var38.field_e & 8) != 8) {
                        statePc = 375;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    stackIn_374_0 = 0;
                    statePc = 374;
                    continue stateLoop;
                }
                case 374: {
                    return stackIn_374_0 != 0;
                }
                case 375: {
                    if ((128 & var38.field_e) != 128) {
                        statePc = 381;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    if (50.0 <= var35) {
                        statePc = 381;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    stackIn_380_0 = 0;
                    statePc = 380;
                    continue stateLoop;
                }
                case 380: {
                    return stackIn_380_0 != 0;
                }
                case 381: {
                    var19 = var19 - 100.0;
                    var27++;
                    statePc = 382;
                    continue stateLoop;
                }
                case 382: {
                    if (-50.0 <= var19) {
                        statePc = 402;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    if (var35 > 100.0) {
                        statePc = 401;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 386: {
                    if (2 == (2 & var38.field_e)) {
                        statePc = 391;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 391: {
                    stackIn_392_0 = 0;
                    statePc = 392;
                    continue stateLoop;
                }
                case 392: {
                    return stackIn_392_0 != 0;
                }
                case 393: {
                    if ((var38.field_e & 32) != 32) {
                        statePc = 401;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    if (var35 < 50.0) {
                        statePc = 399;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 399: {
                    stackIn_400_0 = 0;
                    statePc = 400;
                    continue stateLoop;
                }
                case 400: {
                    return stackIn_400_0 != 0;
                }
                case 401: {
                    var19 = var19 + 100.0;
                    var27--;
                    statePc = 402;
                    continue stateLoop;
                }
                case 402: {
                    if ((var27 ^ -1) >= -1) {
                        statePc = 406;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    if (var27 < -1 + this.field_e) {
                        statePc = 408;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    stackIn_407_0 = 0;
                    statePc = 407;
                    continue stateLoop;
                }
                case 407: {
                    return stackIn_407_0 != 0;
                }
                case 408: {
                    var38 = this.a(-56, var27, var28, var26);
                    statePc = 409;
                    continue stateLoop;
                }
                case 409: {
                    if (var38 != null) {
                        statePc = 414;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 410: {
                    var35 = var35 + 100.0;
                    var28--;
                    var38 = this.a(-123, var27, var28, var26);
                    if (var41 != 0) {
                        statePc = 420;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 411: {
                    if (var41 == 0) {
                        statePc = 409;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 414: {
                    if (null == var38.field_C) {
                        statePc = 420;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    stackIn_446_0 = (var35 < 100.0 ? -1 : (var35 == 100.0 ? 0 : 1));
                    stackIn_416_0 = stackIn_446_0;
                    if (var41 != 0) {
                        statePc = 446;
                    } else {
                        statePc = 416;
                    }
                    continue stateLoop;
                }
                case 416: {
                    if (stackIn_416_0 <= 0) {
                        statePc = 420;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 419: {
                    var28++;
                    var35 = var35 - 100.0;
                    var38 = this.a(111, var27, var28, var26);
                    if (var41 == 0) {
                        statePc = 414;
                    } else {
                        statePc = 420;
                    }
                    continue stateLoop;
                }
                case 420: {
                    if (var38.field_h == null) {
                        statePc = 445;
                    } else {
                        statePc = 421;
                    }
                    continue stateLoop;
                }
                case 421: {
                    var39 = var38.field_h.c(-127);
                    var40 = var38.field_h.h(13);
                    if ((double)var40 <= var19) {
                        statePc = 445;
                    } else {
                        statePc = 422;
                    }
                    continue stateLoop;
                }
                case 422: {
                    if ((double)(-var39) >= var17) {
                        statePc = 445;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 425: {
                    if (var17 >= (double)var39) {
                        statePc = 445;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 428: {
                    if ((double)(-var39) >= var19) {
                        statePc = 445;
                    } else {
                        statePc = 431;
                    }
                    continue stateLoop;
                }
                case 431: {
                    if (var19 >= (double)var39) {
                        statePc = 445;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 434: {
                    if (var38.field_h != param1) {
                        statePc = 442;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 437: {
                    if (param3) {
                        statePc = 442;
                    } else {
                        statePc = 440;
                    }
                    continue stateLoop;
                }
                case 440: {
                    stackIn_441_0 = 1;
                    statePc = 441;
                    continue stateLoop;
                }
                case 441: {
                    return stackIn_441_0 != 0;
                }
                case 442: {
                    if (var38.field_h == param2) {
                        statePc = 445;
                    } else {
                        statePc = 443;
                    }
                    continue stateLoop;
                }
                case 443: {
                    stackIn_444_0 = 0;
                    statePc = 444;
                    continue stateLoop;
                }
                case 444: {
                    return stackIn_444_0 != 0;
                }
                case 445: {
                    stackIn_446_0 = param3 ? 1 : 0;
                    statePc = 446;
                    continue stateLoop;
                }
                case 446: {
                    if (stackIn_446_0 == 0) {
                        statePc = 460;
                    } else {
                        statePc = 447;
                    }
                    continue stateLoop;
                }
                case 447: {
                    if ((param1.field_i ^ -1) != (var38.field_A ^ -1)) {
                        statePc = 460;
                    } else {
                        statePc = 450;
                    }
                    continue stateLoop;
                }
                case 450: {
                    if ((var38.field_n ^ -1) != (param1.field_gb ^ -1)) {
                        statePc = 460;
                    } else {
                        statePc = 453;
                    }
                    continue stateLoop;
                }
                case 453: {
                    if (param1.field_R == var38.field_r) {
                        statePc = 458;
                    } else {
                        statePc = 460;
                    }
                    continue stateLoop;
                }
                case 458: {
                    stackIn_459_0 = 1;
                    statePc = 459;
                    continue stateLoop;
                }
                case 459: {
                    return stackIn_459_0 != 0;
                }
                case 460: {
                    if (var41 == 0) {
                        statePc = 256;
                    } else {
                        statePc = 461;
                    }
                    continue stateLoop;
                }
                case 461: {
                    stackIn_462_0 = 0;
                    statePc = 462;
                    continue stateLoop;
                }
                case 462: {
                    return stackIn_462_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == -17402) {
                break L1;
              } else {
                this.field_b = -75;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.a(param1, param5, param0, param3, param2, (byte) 94, param6)) {
                  break L3;
                } else {
                  if (!this.a(param6, param3, param2, param5, param0, (byte) 118, param1)) {
                    stackIn_10_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_10_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var8), "dk.V(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void a(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_346_0 = 0;
        int stackIn_358_0 = 0;
        int stackIn_358_1 = 0;
        int stackIn_360_0 = 0;
        int stackIn_363_0 = 0;
        int stackIn_363_1 = 0;
        int stackIn_416_0 = 0;
        int stackIn_418_0 = 0;
        int stackIn_418_1 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var2_int = 1;
                    var3 = 0;
                    var4 = 0;
                    var5 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = this.field_b;
                    stackIn_3_1 = var5;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 <= stackIn_3_1) {
                        statePc = 42;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_43_0 = 0;
                    stackIn_5_0 = stackIn_43_0;
                    if (var16 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var6 = stackIn_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (this.field_b <= var6) {
                        statePc = 41;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackIn_3_0 = -2;
                    stackIn_8_0 = stackIn_3_0;
                    stackIn_3_1 = var5 ^ -1;
                    stackIn_8_1 = stackIn_3_1;
                    if (var16 != 0) {
                        statePc = 3;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 <= stackIn_8_1) {
                        statePc = 31;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (1 >= var6) {
                        statePc = 31;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if ((-1 + this.field_b ^ -1) >= (var5 ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-1 + this.field_b <= var6) {
                        statePc = 31;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var7 = 64;
                    if ((var7 ^ -1) < (this.field_f[var5 + -1][var6].field_x ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var7 = this.field_f[-1 + var5][var6].field_x;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (this.field_f[var5][-1 + var6].field_x < var7) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var7 = this.field_f[var5][-1 + var6].field_x;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (this.field_f[-1 + var5][-1 + var6].field_x < var7) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var7 = this.field_f[var5 + -1][var6 - 1].field_x;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    this.field_f[var5][var6].field_x = 1 + var7;
                    if (var16 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    this.field_f[var5][var6].field_x = 1;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (!this.field_f[var5][var6].field_B) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.field_f[var5][var6].field_x = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (-5 > (this.field_f[var5][var6].field_x ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var3 = var5;
                    var2_int = 0;
                    var4 = var6;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var6++;
                    if (var16 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var5++;
                    if (var16 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = var2_int;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (stackIn_43_0 != 0) {
                        statePc = 415;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var5 = this.field_f[var3][var4].field_x;
                    if (-25 <= (var5 ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var5 = (int)(-24.0 + Math.random() * (double)var5 + 24.0);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (75.0 <= 100.0 * Math.random()) {
                        statePc = 51;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (16 >= var5) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var5 = 16;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (100.0 * Math.random() >= 75.0) {
                        statePc = 56;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (8 >= var5) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var5 = 8;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (50.0 <= 100.0 * Math.random()) {
                        statePc = 63;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (-5 > (var5 ^ -1)) {
                        statePc = 62;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var5 = 4;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    var4 = var4 - (-1 + var5);
                    var3 = var3 - (-1 + var5);
                    var6 = 1 + (int)(2.0 * Math.random());
                    if (var5 > 8) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var6 = (int)(2.0 * Math.random());
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (1 == var5) {
                        statePc = 68;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 68: {
                    this.field_f[var3][var4].field_b = 0;
                    this.field_f[var3][var4].field_B = true;
                    var6 = 0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (0 == var6) {
                        statePc = 72;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var7 = var3;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = var5 + var3 ^ -1;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (stackIn_74_0 >= (var7 ^ -1)) {
                        statePc = 166;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_167_0 = var4;
                    stackIn_76_0 = stackIn_167_0;
                    if (var16 != 0) {
                        statePc = 167;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var8 = stackIn_76_0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (var5 + var4 <= var8) {
                        statePc = 165;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    this.field_f[var7][var8].field_b = 0;
                    this.field_f[var7][var8].field_B = true;
                    stackIn_74_0 = (Math.random() * 100.0 < 20.0 ? -1 : (Math.random() * 100.0 == 20.0 ? 0 : 1));
                    stackIn_79_0 = stackIn_74_0;
                    if (var16 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (stackIn_79_0 >= 0) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    this.field_f[var7][var8].field_j = 0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (var3 >= var7) {
                        statePc = 164;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (var4 >= var8) {
                        statePc = 164;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if ((this.field_f[-1 + var7][var8].field_j ^ -1) == -2) {
                        statePc = 104;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (this.field_f[var7][var8 - 1].field_j == 1) {
                        statePc = 104;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if ((this.field_f[1 + var7][var8].field_j ^ -1) == -2) {
                        statePc = 104;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if ((this.field_f[-1 + var7][var8].field_j ^ -1) == -8) {
                        statePc = 104;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (7 == this.field_f[var7][var8 - 1].field_j) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (this.field_f[var7 - -1][var8].field_j != 7) {
                        statePc = 158;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (this.field_f[var7 + -1][var8].field_j == 1) {
                        statePc = 122;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (1 == this.field_f[var7][1 + var8].field_j) {
                        statePc = 122;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if ((this.field_f[var7 - -1][var8].field_j ^ -1) == -2) {
                        statePc = 122;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (7 == this.field_f[var7 + -1][var8].field_j) {
                        statePc = 122;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (7 == this.field_f[var7][var8 - -1].field_j) {
                        statePc = 122;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (7 != this.field_f[var7 - -1][var8].field_j) {
                        statePc = 158;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if ((this.field_f[var7 + -1][var8].field_j ^ -1) == -2) {
                        statePc = 140;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (-2 == (this.field_f[var7][var8 + -1].field_j ^ -1)) {
                        statePc = 140;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (1 == this.field_f[1 + var8][var8].field_j) {
                        statePc = 140;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (7 == this.field_f[-1 + var7][var8].field_j) {
                        statePc = 140;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (-8 == (this.field_f[var7][var8 - 1].field_j ^ -1)) {
                        statePc = 140;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (this.field_f[var7][-1 + var8].field_j != 7) {
                        statePc = 158;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (-2 == (this.field_f[1 + var7][var8].field_j ^ -1)) {
                        statePc = 164;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (this.field_f[var7][var8 - 1].field_j == 1) {
                        statePc = 164;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (-2 == (this.field_f[var8 + 1][var8].field_j ^ -1)) {
                        statePc = 164;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if ((this.field_f[var7 + 1][var8].field_j ^ -1) == -8) {
                        statePc = 164;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if ((this.field_f[var7][var8 + -1].field_j ^ -1) == -8) {
                        statePc = 164;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (-8 == (this.field_f[var7][var8 - -1].field_j ^ -1)) {
                        statePc = 164;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (100.0 * Math.random() < 10.0) {
                        statePc = 163;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 163: {
                    this.field_f[var7][var8].field_j = 1;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    var8++;
                    if (var16 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var7++;
                    if (var16 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    stackIn_167_0 = 0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    var6 = stackIn_167_0;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    if ((var6 ^ -1) == -2) {
                        statePc = 171;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var7 = var3;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    stackIn_173_0 = var5 + var3 ^ -1;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (stackIn_173_0 >= (var7 ^ -1)) {
                        statePc = 345;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    stackIn_346_0 = var4;
                    stackIn_175_0 = stackIn_346_0;
                    if (var16 != 0) {
                        statePc = 346;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var8 = stackIn_175_0;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (var8 >= var5 + var4) {
                        statePc = 344;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    this.field_f[var7][var8].field_b = 0;
                    this.field_f[var7][var8].field_B = true;
                    stackIn_173_0 = (30.0 < Math.random() * 100.0 ? -1 : (30.0 == Math.random() * 100.0 ? 0 : 1));
                    stackIn_178_0 = stackIn_173_0;
                    if (var16 != 0) {
                        statePc = 173;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (stackIn_178_0 > 0) {
                        statePc = 180;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 180: {
                    this.field_f[var7][var8].field_j = 0;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (var7 <= var3) {
                        statePc = 262;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (var4 >= var8) {
                        statePc = 262;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    if (1 == this.field_f[-1 + var7][var8].field_j) {
                        statePc = 203;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if ((this.field_f[var7][-1 + var8].field_j ^ -1) == -2) {
                        statePc = 203;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (-2 == (this.field_f[var7 - -1][var8].field_j ^ -1)) {
                        statePc = 203;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if ((this.field_f[var7 + -1][var8].field_j ^ -1) == -8) {
                        statePc = 203;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (7 == this.field_f[var7][-1 + var8].field_j) {
                        statePc = 203;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (this.field_f[1 + var7][var8].field_j != 7) {
                        statePc = 257;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    if ((this.field_f[var7 - 1][var8].field_j ^ -1) == -2) {
                        statePc = 221;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (1 == this.field_f[var7][1 + var8].field_j) {
                        statePc = 221;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if ((this.field_f[var7 + 1][var8].field_j ^ -1) == -2) {
                        statePc = 221;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if ((this.field_f[var7 - 1][var8].field_j ^ -1) == -8) {
                        statePc = 221;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if (7 == this.field_f[var7][var8 + 1].field_j) {
                        statePc = 221;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (7 != this.field_f[1 + var7][var8].field_j) {
                        statePc = 257;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (this.field_f[var7 - 1][var8].field_j == 1) {
                        statePc = 239;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (1 == this.field_f[var7][var8 + -1].field_j) {
                        statePc = 239;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if ((this.field_f[1 + var8][var8].field_j ^ -1) == -2) {
                        statePc = 239;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    if (this.field_f[var7 + -1][var8].field_j == 7) {
                        statePc = 239;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (7 == this.field_f[var7][var8 + -1].field_j) {
                        statePc = 239;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    if ((this.field_f[var7][-1 + var8].field_j ^ -1) != -8) {
                        statePc = 257;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (1 == this.field_f[var7 - -1][var8].field_j) {
                        statePc = 262;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (-2 == (this.field_f[var7][var8 + -1].field_j ^ -1)) {
                        statePc = 262;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    if (this.field_f[1 + var8][var8].field_j == 1) {
                        statePc = 262;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (-8 == (this.field_f[1 + var7][var8].field_j ^ -1)) {
                        statePc = 262;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if (7 == this.field_f[var7][var8 - 1].field_j) {
                        statePc = 262;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (7 == this.field_f[var7][1 + var8].field_j) {
                        statePc = 262;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if (100.0 * Math.random() >= 40.0) {
                        statePc = 262;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    this.field_f[var7][var8].field_j = 1;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    if ((var7 ^ -1) >= (var3 ^ -1)) {
                        statePc = 343;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if (var4 >= var8) {
                        statePc = 343;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    if (-2 == (this.field_f[var7 + -1][var8].field_j ^ -1)) {
                        statePc = 284;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if (-2 == (this.field_f[var7][var8 - 1].field_j ^ -1)) {
                        statePc = 284;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    if (-2 == (this.field_f[1 + var7][var8].field_j ^ -1)) {
                        statePc = 284;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    if (this.field_f[-1 + var7][var8].field_j == 7) {
                        statePc = 284;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    if (this.field_f[var7][var8 + -1].field_j == 7) {
                        statePc = 284;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    if (-8 != (this.field_f[1 + var7][var8].field_j ^ -1)) {
                        statePc = 338;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    if (this.field_f[var7 - 1][var8].field_j == 1) {
                        statePc = 302;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    if (-2 == (this.field_f[var7][var8 - -1].field_j ^ -1)) {
                        statePc = 302;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    if ((this.field_f[var7 + 1][var8].field_j ^ -1) == -2) {
                        statePc = 302;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    if (this.field_f[var7 + -1][var8].field_j == 7) {
                        statePc = 302;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    if (this.field_f[var7][1 + var8].field_j == 7) {
                        statePc = 302;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    if ((this.field_f[1 + var7][var8].field_j ^ -1) != -8) {
                        statePc = 338;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    if (1 == this.field_f[var7 + -1][var8].field_j) {
                        statePc = 320;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    if ((this.field_f[var7][-1 + var8].field_j ^ -1) == -2) {
                        statePc = 320;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if (1 == this.field_f[var8 - -1][var8].field_j) {
                        statePc = 320;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    if (7 == this.field_f[-1 + var7][var8].field_j) {
                        statePc = 320;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    if (this.field_f[var7][-1 + var8].field_j == 7) {
                        statePc = 320;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    if (this.field_f[var7][var8 + -1].field_j != 7) {
                        statePc = 338;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    if (this.field_f[var7 - -1][var8].field_j == 1) {
                        statePc = 343;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 323: {
                    if (-2 == (this.field_f[var7][-1 + var8].field_j ^ -1)) {
                        statePc = 343;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    if (-2 == (this.field_f[1 + var8][var8].field_j ^ -1)) {
                        statePc = 343;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    if (-8 == (this.field_f[1 + var7][var8].field_j ^ -1)) {
                        statePc = 343;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    if (7 == this.field_f[var7][-1 + var8].field_j) {
                        statePc = 343;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    if (-8 == (this.field_f[var7][var8 + 1].field_j ^ -1)) {
                        statePc = 343;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 338: {
                    if (20.0 <= 100.0 * Math.random()) {
                        statePc = 343;
                    } else {
                        statePc = 341;
                    }
                    continue stateLoop;
                }
                case 341: {
                    this.field_f[var7][var8].field_j = 7;
                    statePc = 343;
                    continue stateLoop;
                }
                case 343: {
                    var8++;
                    if (var16 == 0) {
                        statePc = 176;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 344: {
                    var7++;
                    if (var16 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    stackIn_346_0 = 0;
                    statePc = 346;
                    continue stateLoop;
                }
                case 346: {
                    var6 = stackIn_346_0;
                    statePc = 347;
                    continue stateLoop;
                }
                case 347: {
                    if (2 != var6) {
                        statePc = 415;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    var7 = 2 + ((int)((double)(-3 + var5) * Math.random()) + var3);
                    var8 = 2 + (int)((double)(-3 + var5) * Math.random()) + var4;
                    var9 = 1;
                    var10 = 2;
                    var11 = -1;
                    var12 = 60;
                    var13 = (int)(3.0 * Math.random());
                    if (1 != var13) {
                        statePc = 350;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    var9 = 0;
                    var10 = 0;
                    var11 = 6;
                    statePc = 350;
                    continue stateLoop;
                }
                case 350: {
                    if (Math.random() * 100.0 >= 50.0) {
                        statePc = 352;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 351: {
                    var12 = 64;
                    statePc = 352;
                    continue stateLoop;
                }
                case 352: {
                    if ((var13 ^ -1) == -3) {
                        statePc = 355;
                    } else {
                        statePc = 356;
                    }
                    continue stateLoop;
                }
                case 355: {
                    var10 = 1;
                    var9 = 1;
                    var11 = 4;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    var14 = var3;
                    statePc = 357;
                    continue stateLoop;
                }
                case 357: {
                    stackIn_358_0 = var5 + var3 ^ -1;
                    stackIn_358_1 = var14 ^ -1;
                    statePc = 358;
                    continue stateLoop;
                }
                case 358: {
                    if (stackIn_358_0 >= stackIn_358_1) {
                        statePc = 415;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    stackIn_416_0 = var4;
                    stackIn_360_0 = stackIn_416_0;
                    if (var16 != 0) {
                        statePc = 416;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    var15 = stackIn_360_0;
                    statePc = 361;
                    continue stateLoop;
                }
                case 361: {
                    if (var15 >= var4 - -var5) {
                        statePc = 414;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 362: {
                    this.field_f[var14][var15].field_b = 0;
                    stackIn_358_0 = var3;
                    stackIn_363_0 = stackIn_358_0;
                    stackIn_358_1 = var14;
                    stackIn_363_1 = stackIn_358_1;
                    if (var16 != 0) {
                        statePc = 358;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    if (stackIn_363_0 >= stackIn_363_1) {
                        statePc = 372;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 364: {
                    if ((var15 ^ -1) < (var4 ^ -1)) {
                        statePc = 369;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 369: {
                    this.field_f[var14][var15].field_b = var9;
                    if (-1 != ((var15 - -var14 - -(int)(Math.random() * 3.0)) % 2 ^ -1)) {
                        statePc = 372;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    this.field_f[var14][var15].field_b = var10;
                    statePc = 372;
                    continue stateLoop;
                }
                case 372: {
                    this.field_f[var14][var15].field_B = true;
                    if (var7 == var14) {
                        statePc = 413;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    if (var14 == 1 + var7) {
                        statePc = 413;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    if ((var8 ^ -1) == (var15 ^ -1)) {
                        statePc = 413;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    if (var15 == 1 + var8) {
                        statePc = 413;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    if (1 + var3 >= var14) {
                        statePc = 388;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 385: {
                    if (1 + var4 < var15) {
                        statePc = 394;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 388: {
                    if (100.0 * Math.random() < 30.0) {
                        statePc = 393;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 393: {
                    this.field_f[var14][var15].field_j = 0;
                    if (var16 == 0) {
                        statePc = 400;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    if (Math.random() * 100.0 < 65.0) {
                        statePc = 399;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 399: {
                    this.field_f[var14][var15].field_j = var11;
                    statePc = 400;
                    continue stateLoop;
                }
                case 400: {
                    if ((1 + var3 ^ -1) != (var14 ^ -1)) {
                        statePc = 407;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    if (var15 != var4) {
                        statePc = 406;
                    } else {
                        statePc = 407;
                    }
                    continue stateLoop;
                }
                case 406: {
                    this.field_f[var14][var15].field_g = var12;
                    statePc = 407;
                    continue stateLoop;
                }
                case 407: {
                    if (var15 != var4 + 1) {
                        statePc = 413;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 408: {
                    if ((var14 ^ -1) == (var3 ^ -1)) {
                        statePc = 413;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 411: {
                    this.field_f[var14][var15].field_k = var12;
                    statePc = 413;
                    continue stateLoop;
                }
                case 413: {
                    var15++;
                    if (var16 == 0) {
                        statePc = 361;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 414: {
                    var14++;
                    if (var16 == 0) {
                        statePc = 357;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    stackIn_416_0 = var2_int;
                    statePc = 416;
                    continue stateLoop;
                }
                case 416: {
                    if (stackIn_416_0 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 417: {
                    stackIn_3_0 = param0;
                    stackIn_418_0 = stackIn_3_0;
                    stackIn_3_1 = 1;
                    stackIn_418_1 = stackIn_3_1;
                    if (var16 != 0) {
                        statePc = 3;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    if (stackIn_418_0 == stackIn_418_1) {
                        statePc = 423;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 419: {
                    this.field_i = (e) null;
                    statePc = 423;
                    continue stateLoop;
                }
                case 423: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(boolean param0, int param1, int param2, byte param3, int param4) {
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dl var6 = null;
        RuntimeException var6_ref = null;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) >= -1) {
                break L1;
              } else {
                if (param2 <= 0) {
                  break L1;
                } else {
                  if (-1 + this.field_b <= param1) {
                    break L1;
                  } else {
                    if ((-1 + this.field_e ^ -1) < (param2 ^ -1)) {
                      var6 = this.a(-30, param2, param4, param1);
                      if (var6 == null) {
                        stackIn_16_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        if (2 != var6.field_v) {
                          if (-4 == (var6.field_v ^ -1)) {
                            stackIn_24_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            L2: {
                              if (var6.field_h == null) {
                                break L2;
                              } else {
                                L3: {
                                  if (param0) {
                                    break L3;
                                  } else {
                                    if (var6.field_h.field_k) {
                                      break L3;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                                stackIn_35_0 = 1;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                            L4: {
                              if ((var6.field_v ^ -1) != -5) {
                                break L4;
                              } else {
                                if (null == var6.field_C.field_h) {
                                  break L4;
                                } else {
                                  stackIn_41_0 = 1;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                }
                              }
                            }
                            L5: {
                              if (5 != var6.field_v) {
                                break L5;
                              } else {
                                if (null != var6.field_c.field_h) {
                                  stackIn_49_0 = 1;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (param3 > 75) {
                                break L6;
                              } else {
                                this.field_b = 66;
                                break L6;
                              }
                            }
                            stackIn_54_0 = 0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackIn_19_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_11_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var6_ref), "dk.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_35_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_41_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_49_0 != 0;
                    } else {
                      return stackIn_54_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                this.field_g = (int[][]) null;
                break L1;
              }
            }
            stackIn_4_0 = this.a(true, param0, param3, (byte) 87, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var5), "dk.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final byte[] a(boolean param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        Object stackIn_6_0 = null;
        int stackIn_8_0 = 0;
        Object stackIn_11_0 = null;
        int stackIn_31_0 = 0;
        byte[] stackIn_34_0 = null;
        byte[] stackIn_38_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4_int = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dl var8 = null;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new byte[2 + 24 * this.field_e * this.field_b];
                        var3 = 0;
                        if (param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_b = -81;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        incrementValue$0 = var3;
                        var3++;
                        var2[incrementValue$0] = (byte)this.field_b;
                        incrementValue$1 = var3;
                        var3++;
                        var2[incrementValue$1] = (byte)this.field_e;
                        var4_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = this;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((((dk) (this)).field_b ^ -1) >= (var4_int ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_31_0 = 0;
                        stackIn_8_0 = stackIn_31_0;
                        if (var9 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = stackIn_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.field_e <= var5) {
                            statePc = 29;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_6_0 = this;
                        stackIn_11_0 = stackIn_6_0;
                        if (var9 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((dk) (this)).field_f[var4_int][var5] != null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = -50;
                        if (var9 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = this.field_f[var4_int][var5].field_r;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        incrementValue$2 = var3;
                        var3++;
                        var2[incrementValue$2] = (byte)(50 + var6);
                        var7 = 0;
                        if ((var6 ^ -1) == 49) {
                            statePc = 26;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8 = this.field_f[var4_int][var5];
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        incrementValue$3 = var3;
                        var3++;
                        var2[incrementValue$3] = (byte)(1 + var8.field_b);
                        incrementValue$4 = var3;
                        var3++;
                        var2[incrementValue$4] = (byte)(1 + var8.field_j);
                        incrementValue$5 = var3;
                        var3++;
                        var2[incrementValue$5] = (byte)(var8.field_g - -1);
                        incrementValue$6 = var3;
                        var3++;
                        var2[incrementValue$6] = (byte)(1 + var8.field_k);
                        incrementValue$7 = var3;
                        var3++;
                        var2[incrementValue$7] = (byte)(var8.field_l + -(100 * var8.field_r));
                        var7 = 1;
                        if (var9 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (null != var8.field_C) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        incrementValue$8 = var3;
                        var3++;
                        var2[incrementValue$8] = (byte) 0;
                        if (var9 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        incrementValue$9 = var3;
                        var3++;
                        var2[incrementValue$9] = (byte) 1;
                        var7 = 0;
                        var8 = var8.field_C;
                        if (var9 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var9 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7 = 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var5++;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var9 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var4_int++;
                        if (var9 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = var3;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var4 = new byte[stackIn_31_0];
                        var5 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var3 <= var5) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_38_0 = (byte[]) (var4);
                        stackIn_34_0 = stackIn_38_0;
                        if (var9 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_34_0[var5] = var2[var5];
                        var5++;
                        if (var9 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = (byte[]) (var4);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return stackIn_38_0;
                }
                case 39: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw qk.a((Throwable) ((Object) var2_ref), "dk.G(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_43_0 = 0;
        byte stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_60_0 = 0;
        dl stackIn_63_0 = null;
        int stackIn_78_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        dl stackIn_86_0 = null;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        byte stackOut_54_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 1;
                        var3 = 0;
                        var4 = 0;
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = this.field_b;
                        stackIn_3_1 = var5;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 <= stackIn_3_1) {
                            statePc = 42;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_43_0 = 0;
                        stackIn_5_0 = stackIn_43_0;
                        if (var9 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (this.field_b <= var6) {
                            statePc = 41;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_3_0 = -1;
                        stackIn_8_0 = stackIn_3_0;
                        stackIn_3_1 = var5 ^ -1;
                        stackIn_8_1 = stackIn_3_1;
                        if (var9 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 <= stackIn_8_1) {
                            statePc = 27;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-1 <= (var6 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var5 ^ -1) <= (this.field_b ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (this.field_b <= var6) {
                            statePc = 27;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7 = 64;
                        if (this.field_f[-1 + var5][var6].field_x >= var7) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7 = this.field_f[-1 + var5][var6].field_x;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (this.field_f[var5][-1 + var6].field_x < var7) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7 = this.field_f[var5][var6 - 1].field_x;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var7 <= this.field_f[-1 + var5][var6 + -1].field_x) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7 = this.field_f[var5 + -1][-1 + var6].field_x;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.field_f[var5][var6].field_x = var7 - -1;
                        if (var9 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        this.field_f[var5][var6].field_x = 1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (!this.field_f[var5][var6].field_B) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        this.field_f[var5][var6].field_x = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (16 > this.field_f[var5][var6].field_x) {
                            statePc = 40;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var5 % 16 != 15) {
                            statePc = 40;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (-16 != (var6 % 16 ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var2_int = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var6++;
                        if (var9 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var5++;
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = var2_int;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (stackIn_43_0 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var3 = (int)(Math.random() * (double)(this.field_b / 16)) * 16;
                        var4 = (int)(Math.random() * (double)(this.field_b / 16)) * 16;
                        var5 = this.field_f[var3 - -15][15 + var4].field_x;
                        if (-17 < (var5 ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var6 = 5;
                        var7 = 8;
                        var8 = of.field_k[wf.a("City" + ((int)((double)var6 * Math.random()) + 1), true)];
                        if ((var5 ^ -1) > -33) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var8 = of.field_k[wf.a("City" + (1 - -(int)((double)var7 * Math.random())), true)];
                        if (100.0 * Math.random() < 90.0) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var8 = of.field_k[wf.a("City" + (6 - -(int)(3.0 * Math.random())), true)];
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (null == var8) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        this.a(var3, (byte) 104, var4, var8);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var2_int == 0) {
                            statePc = 1;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = param0;
                        stackIn_3_0 = stackOut_54_0;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_3_1 = -106;
                        stackIn_55_1 = stackIn_3_1;
                        if (var9 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 == stackIn_55_1) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 56: {
                    return;
                }
                case 57: {
                    try {
                        var3 = 0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var3 >= this.field_b) {
                            statePc = 77;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_78_0 = 0;
                        stackIn_60_0 = stackIn_78_0;
                        if (var9 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var4 = stackIn_60_0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((var4 ^ -1) <= (this.field_e ^ -1)) {
                            statePc = 76;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_86_0 = this.field_f[var3][var4];
                        stackIn_63_0 = stackIn_86_0;
                        if (var9 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 == null) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        this.field_f[var3][var4] = new dl(var3, var4, 0, (dk) (this));
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (this.field_f[var3][var4].field_b == -1) {
                            statePc = 74;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (-1 == this.field_f[var3][var4].field_v) {
                            statePc = 74;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        this.field_f[var3][var4].field_b = 1;
                        this.field_f[var3][var4].field_v = 0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var4++;
                        if (var9 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var3++;
                        if (var9 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackIn_78_0 = mb.b(0, param0 + 187) ? 1 : 0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (stackIn_78_0 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var3 = 0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackIn_81_0 = this.field_b ^ -1;
                        stackIn_81_1 = var3 ^ -1;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (stackIn_81_0 >= stackIn_81_1) {
                            statePc = 97;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var9 != 0) {
                            statePc = 97;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var4 = 0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if ((var4 ^ -1) <= (this.field_e ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackIn_86_0 = this.field_f[var3][var4];
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackIn_81_0 = stackIn_86_0.field_j ^ -1;
                        stackIn_87_0 = stackIn_81_0;
                        stackIn_81_1 = -44;
                        stackIn_87_1 = stackIn_81_1;
                        if (var9 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (stackIn_87_0 == stackIn_87_1) {
                            statePc = 91;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if ((this.field_f[var3][var4].field_j ^ -1) != -45) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        this.field_f[var3][var4].field_j = -1;
                        this.field_f[var3][var4].field_v = 0;
                        this.field_f[var3][var4].field_C.field_v = 0;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var4++;
                        if (var9 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var3++;
                        if (var9 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 96: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw qk.a((Throwable) ((Object) var2), "dk.K(" + param0 + ')');
                }
                case 97: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ue a(boolean param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, int param8) {
        ue stackIn_3_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        boolean stackIn_96_0 = false;
        boolean stackIn_98_0 = false;
        boolean stackIn_100_0 = false;
        boolean stackIn_101_0 = false;
        int stackIn_101_1 = 0;
        int stackIn_179_0 = 0;
        ue stackIn_182_0 = null;
        ue stackIn_187_0 = null;
        Object stackIn_190_0 = null;
        ue stackIn_199_0 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        dl var12 = null;
        int var13 = 0;
        int var14_int = 0;
        ue var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var23 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10_int = param7;
                        var11 = param1;
                        var12 = this.a(113, param1, param5, param7);
                        if (param3 <= -78) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (ue) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var13 = 0;
                        if (var12 == null) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!param4) {
                            statePc = 16;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var12.field_a) {
                            statePc = 16;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!var12.field_d) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = null;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return (ue) ((Object) stackIn_15_0);
                }
                case 16: {
                    try {
                        if (var12 != null) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var12.field_v ^ -1) == -5) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param5++;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var13 = var12.field_d ? 1 : 0;
                        if ((var12.field_v ^ -1) != -6) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        param5--;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((param6 ^ -1) != (param5 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var14_int = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (this.field_b <= var14_int) {
                            statePc = 40;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_41_0 = 0;
                        stackIn_32_0 = stackIn_41_0;
                        if (var23 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var15 = stackIn_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var15 >= this.field_e) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.field_d[var14_int][var15] = 1000;
                        var15++;
                        if (var23 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var23 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var14_int++;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var23 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var14_int = param8;
                        stackIn_41_0 = param8;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var15 = stackIn_41_0;
                        var16 = param2;
                        var17 = param2;
                        this.field_d[param8][param2] = 0;
                        var20 = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = -1001;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (stackIn_43_0 >= (var20 ^ -1)) {
                            statePc = 178;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_179_0 = var14_int;
                        stackIn_45_0 = stackIn_179_0;
                        if (var23 != 0) {
                            statePc = 179;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var21 = stackIn_45_0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = var15 ^ -1;
                        stackIn_47_1 = var21 ^ -1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 > stackIn_47_1) {
                            statePc = 177;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_43_0 = var16;
                        stackIn_49_0 = stackIn_43_0;
                        if (var23 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var22 = stackIn_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((var17 ^ -1) > (var22 ^ -1)) {
                            statePc = 176;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_47_0 = var20;
                        stackIn_52_0 = stackIn_47_0;
                        stackIn_47_1 = this.field_d[var21][var22];
                        stackIn_52_1 = stackIn_47_1;
                        if (var23 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 == stackIn_52_1) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var22 ^ -1) != (var16 ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (1 >= var22) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var16--;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((var22 ^ -1) != (var17 ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((var22 ^ -1) > (this.field_e + -2 ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var17++;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var21 != var15) {
                            statePc = 73;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if ((var21 ^ -1) <= (this.field_b - 2 ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var15++;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var14_int != var21) {
                            statePc = 79;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (-2 <= (var21 ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var14_int--;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var12 = this.a(-120, var22, param6, var21);
                        if (var12 == null) {
                            statePc = 171;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (!param4) {
                            statePc = 89;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var12.field_a) {
                            statePc = 89;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (var12.field_d) {
                            statePc = 169;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (-5 != (var12.field_v ^ -1)) {
                            statePc = 104;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if ((param5 ^ -1) >= (param6 ^ -1)) {
                            statePc = 104;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        stackIn_100_0 = var12.field_d;
                        stackIn_96_0 = stackIn_100_0;
                        if (var13 != 0) {
                            statePc = 100;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackIn_98_0 = stackIn_96_0;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        stackIn_101_0 = stackIn_98_0;
                        stackIn_101_1 = 1;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackIn_101_0 = stackIn_100_0;
                        stackIn_101_1 = 0;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if ((stackIn_101_0 ? 1 : 0) != stackIn_101_1) {
                            statePc = 103;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var11 = var22;
                        var20 = 1000;
                        var10_int = var21;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if ((var12.field_v ^ -1) != -6) {
                            statePc = 109;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (param5 >= param6) {
                            statePc = 109;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var11 = var22;
                        var20 = 1000;
                        var10_int = var21;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (1 < var21) {
                            statePc = 112;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var18 = -1;
                        var19 = 0;
                        if ((this.field_d[var18 + var21][var19 + var22] ^ -1) >= (var20 - -var12.a(var19, var18, -108) ^ -1)) {
                            statePc = 115;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        this.field_d[var21 - -var18][var22 - -var19] = var20 - -var12.a(var19, var18, -110);
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if ((var21 ^ -1) >= -2) {
                            statePc = 123;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (-2 <= (var22 ^ -1)) {
                            statePc = 123;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var18 = -1;
                        var19 = -1;
                        if ((this.field_d[var21 - -var18][var22 + var19] ^ -1) < (var12.a(var19, var18, -122) + var20 ^ -1)) {
                            statePc = 122;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        this.field_d[var18 + var21][var22 - -var19] = var12.a(var19, var18, -128) + var20;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (var21 <= 1) {
                            statePc = 132;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if ((-2 + this.field_e ^ -1) < (var22 ^ -1)) {
                            statePc = 129;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var18 = -1;
                        var19 = 1;
                        if (this.field_d[var21 + var18][var19 + var22] <= var20 - -var12.a(var19, var18, -122)) {
                            statePc = 132;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        this.field_d[var18 + var21][var19 + var22] = var12.a(var19, var18, -128) + var20;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (-2 + this.field_b > var21) {
                            statePc = 135;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var19 = 0;
                        var18 = 1;
                        if ((this.field_d[var21 - -var18][var22 - -var19] ^ -1) >= (var20 - -var12.a(var19, var18, -113) ^ -1)) {
                            statePc = 138;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        this.field_d[var21 + var18][var22 + var19] = var20 - -var12.a(var19, var18, -118);
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (var21 >= this.field_b - 2) {
                            statePc = 148;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if ((var22 ^ -1) < -2) {
                            statePc = 144;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        var19 = -1;
                        var18 = 1;
                        if ((this.field_d[var21 - -var18][var22 - -var19] ^ -1) < (var20 - -var12.a(var19, var18, -110) ^ -1)) {
                            statePc = 147;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        this.field_d[var21 - -var18][var22 + var19] = var20 + var12.a(var19, var18, -124);
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (this.field_b - 2 <= var21) {
                            statePc = 157;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if ((-2 + this.field_e ^ -1) < (var22 ^ -1)) {
                            statePc = 154;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        var18 = 1;
                        var19 = 1;
                        if ((this.field_d[var21 + var18][var22 + var19] ^ -1) >= (var20 + var12.a(var19, var18, -125) ^ -1)) {
                            statePc = 157;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        this.field_d[var21 - -var18][var22 + var19] = var12.a(var19, var18, -118) + var20;
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (-2 <= (var22 ^ -1)) {
                            statePc = 162;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        var18 = 0;
                        var19 = -1;
                        if (this.field_d[var18 + var21][var22 + var19] > var12.a(var19, var18, -119) + var20) {
                            statePc = 161;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        this.field_d[var18 + var21][var22 - -var19] = var20 - -var12.a(var19, var18, -113);
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (var22 < -2 + this.field_e) {
                            statePc = 165;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        var19 = 1;
                        var18 = 0;
                        if (this.field_d[var21 - -var18][var19 + var22] <= var12.a(var19, var18, -113) + var20) {
                            statePc = 171;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        this.field_d[var18 + var21][var22 + var19] = var12.a(var19, var18, -106) + var20;
                        if (var23 == 0) {
                            statePc = 171;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        this.field_d[var21][var22] = 1000;
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (-1001 == (var20 ^ -1)) {
                            statePc = 174;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        var22 = var17;
                        var21 = var15;
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        var22++;
                        if (var23 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        var21++;
                        if (var23 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        var20++;
                        if (var23 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 178;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        stackIn_179_0 = param0 ? 1 : 0;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (stackIn_179_0 != 0) {
                            statePc = 181;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        stackIn_182_0 = this.a(var11, param6, var10_int, param6, param2, param8, true);
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 182: {
                    return stackIn_182_0;
                }
                case 183: {
                    try {
                        if (param6 == param5) {
                            statePc = 186;
                        } else {
                            statePc = 184;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        stackIn_187_0 = this.a(param4, var10_int, param6, param8, var11, param2, 36);
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 187: {
                    return stackIn_187_0;
                }
                case 188: {
                    try {
                        var14 = this.a(param4, var10_int, param6, param8, var11, param2, 72);
                        if (null != var14) {
                            statePc = 191;
                        } else {
                            statePc = 189;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        stackIn_190_0 = null;
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 190: {
                    return (ue) ((Object) stackIn_190_0);
                }
                case 191: {
                    try {
                        var15 = param6;
                        if ((var15 ^ -1) > (param5 ^ -1)) {
                            statePc = 194;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        var15++;
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        if (var15 <= param5) {
                            statePc = 198;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        var15--;
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        var14.a(-19020, this.a(param0, param1, var11, -128, param4, param5, var15, param7, var10_int));
                        stackIn_199_0 = (ue) (var14);
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 199: {
                    return stackIn_199_0;
                }
                case 200: {
                    var10 = (RuntimeException) ((Object) caughtException);
                    throw qk.a((Throwable) ((Object) var10), "dk.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        r var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_b <= var2_int) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_13_0 = 0;
                        stackIn_4_0 = stackIn_13_0;
                        if (var4 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_e <= var3) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_g[var2_int][var3] = 1000;
                        var3++;
                        if (var4 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = -7 / ((param0 - 28) / 46);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = stackIn_13_0;
                        var3 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-13 >= (var3 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var2 = this.field_i.field_C[var3];
                        if (var4 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null == var2) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (-1 > (var2.field_P ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var2.b((byte) -27);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var3++;
                        if (var4 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw qk.a((Throwable) ((Object) runtimeException), "dk.O(" + param0 + ')');
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3, String param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              og.field_f.c(param4, param2 + -1, param0, 0, -1);
              og.field_f.c(param4, 1 + param2, param0, 0, -1);
              og.field_f.c(param4, param2, param0 + -1, 0, -1);
              og.field_f.c(param4, param2, param0 - -1, 0, -1);
              if (param3 == -2) {
                break L1;
              } else {
                this.field_m = 65;
                break L1;
              }
            }
            og.field_f.c(param4, param2, param0, param1, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("dk.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void d(int param0) {
        try {
            this.a(false, true);
            if (param0 > -52) {
                this.field_k = -63;
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "dk.M(" + param0 + ')');
        }
    }

    final dl a(int param0, int param1, int param2, int param3) {
        dl var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_26_0 = null;
        dl stackIn_29_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (-1 < (param3 ^ -1)) {
                break L1;
              } else {
                if ((param1 ^ -1) > -1) {
                  break L1;
                } else {
                  if ((this.field_b ^ -1) >= (param3 ^ -1)) {
                    break L1;
                  } else {
                    if ((this.field_e ^ -1) >= (param1 ^ -1)) {
                      break L1;
                    } else {
                      var5 = this.field_f[param3][param1];
                      if (null == var5) {
                        stackIn_19_0 = null;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var6 = -24 / ((27 - param0) / 52);
                        L2: while (true) {
                          L3: {
                            if (param2 <= var5.field_r) {
                              break L3;
                            } else {
                              if (null == var5.field_C) {
                                stackIn_26_0 = null;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                var5 = var5.field_C;
                                if (var7 == 0) {
                                  continue L2;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          stackIn_29_0 = (dl) (var5);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackIn_14_0 = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var5_ref), "dk.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dl) ((Object) stackIn_14_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (dl) ((Object) stackIn_19_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (dl) ((Object) stackIn_26_0);
            } else {
              return stackIn_29_0;
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        byte stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        byte stackOut_34_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dl var12 = null;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 104) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var5_int = 0;
                        incrementValue$0 = var5_int;
                        var5_int++;
                        var6 = param3[incrementValue$0];
                        incrementValue$1 = var5_int;
                        var5_int++;
                        var7 = param3[incrementValue$1];
                        var8 = param0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = var8 ^ -1;
                        stackIn_5_1 = param0 - -var6 ^ -1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 <= stackIn_5_1) {
                            statePc = 61;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var13 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = param2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = var9 ^ -1;
                        stackIn_9_1 = var7 + param2 ^ -1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 <= stackIn_9_1) {
                            statePc = 54;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        incrementValue$2 = var5_int;
                        var5_int++;
                        var10 = param3[incrementValue$2] + -50;
                        var11 = 0;
                        stackIn_5_0 = var10 ^ -1;
                        stackIn_11_0 = stackIn_5_0;
                        stackIn_5_1 = 49;
                        stackIn_11_1 = stackIn_5_1;
                        if (var13 != 0) {
                            statePc = 5;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 != stackIn_11_1) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var11 = 1;
                        if (var13 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-1 < (var8 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var9 < 0) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (this.field_b <= var8) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var9 < this.field_e) {
                            statePc = 32;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (1 == var11) {
                            statePc = 53;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var5_int += 5;
                        var11 = 1;
                        incrementValue$3 = var5_int;
                        var5_int++;
                        stackIn_9_0 = -2;
                        stackIn_29_0 = stackIn_9_0;
                        stackIn_9_1 = param3[incrementValue$3] ^ -1;
                        stackIn_29_1 = stackIn_9_1;
                        if (var13 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 == stackIn_29_1) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11 = 0;
                        if (var13 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        this.field_f[var8][var9] = new dl(var8, var9, var10, (dk) (this));
                        this.field_f[var8][var9].field_B = true;
                        var12 = this.field_f[var8][var9];
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var11 == 1) {
                            statePc = 53;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        incrementValue$4 = var5_int;
                        var5_int++;
                        var12.field_b = -1 + param3[incrementValue$4];
                        incrementValue$5 = var5_int;
                        var5_int++;
                        var12.field_j = param3[incrementValue$5] + -1;
                        incrementValue$6 = var5_int;
                        var5_int++;
                        var12.field_g = param3[incrementValue$6] + -1;
                        incrementValue$7 = var5_int;
                        var5_int++;
                        var12.field_k = param3[incrementValue$7] + -1;
                        var11 = 1;
                        incrementValue$8 = var5_int;
                        var5_int++;
                        var12.field_l = var12.field_l + param3[incrementValue$8];
                        incrementValue$9 = var5_int;
                        var5_int++;
                        stackOut_34_0 = param3[incrementValue$9];
                        stackIn_9_0 = stackOut_34_0;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_9_1 = 1;
                        stackIn_35_1 = stackIn_9_1;
                        if (var13 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 == stackIn_35_1) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var12.field_z = true;
                        if (var13 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var12.field_b != 4) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var12.field_a = false;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (null == var12.field_c) {
                            statePc = 52;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var12.field_c.field_a) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_49_0 = 1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var12.field_a = false;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var12.field_C = new dl(var8, var9, var12.field_r - -1, (dk) (this));
                        var12.field_C.field_c = var12;
                        var12 = var12.field_C;
                        var11 = 0;
                        if (var13 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var9++;
                        if (var13 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var8++;
                        if (var13 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_59_0 = (RuntimeException) (var5);
                    stackIn_57_0 = stackIn_59_0;
                    stackIn_59_1 = new StringBuilder().append("dk.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_57_1 = stackIn_59_1;
                    if (param3 == null) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_57_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_57_1);
                    stackIn_60_2 = "{...}";
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackIn_60_2 = "null";
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    throw qk.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ')');
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        try {
            field_h = null;
            field_j = null;
            field_c = null;
            if (param0 != 22120) {
                field_c = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "dk.W(" + param0 + ')');
        }
    }

    final boolean a(byte param0, r param1, r param2) {
        boolean discarded$1 = false;
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -93) {
                break L1;
              } else {
                discarded$1 = this.a(-66, 2, 104, 35, -6, (byte) -56, 26);
                break L1;
              }
            }
            stackIn_4_0 = this.a(10056, param2, param1, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("dk.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ')');
        }
        return stackIn_4_0;
    }

    final ue a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        ue stackIn_3_0 = null;
        Object stackIn_21_0 = null;
        boolean stackIn_24_0 = false;
        boolean stackIn_26_0 = false;
        boolean stackIn_28_0 = false;
        boolean stackIn_29_0 = false;
        int stackIn_29_1 = 0;
        ue stackIn_34_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        Object stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        Object stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        Object stackIn_166_0 = null;
        int stackIn_166_1 = 0;
        int stackIn_166_2 = 0;
        int stackIn_167_0 = 0;
        Object stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        Object stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        Object stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        int stackIn_177_2 = 0;
        Object stackIn_181_0 = null;
        int stackIn_189_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_193_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_222_0 = 0;
        int stackIn_224_0 = 0;
        Object stackIn_226_0 = null;
        Object stackIn_228_0 = null;
        Object stackIn_230_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var8_int = 0;
        dl var8 = null;
        RuntimeException var8_ref = null;
        int var9_int = 0;
        dl var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16_int = 0;
        Object var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((param3 ^ -1) == (param1 ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = this.a(param0, param4, param5, param1, true, param2, param3, true);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    var8_int = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((this.field_b ^ -1) >= (var8_int ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var9_int = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (this.field_e <= var9_int) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_d[var8_int][var9_int] = 1000;
                    var9_int++;
                    if (var22 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var22 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var8_int++;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (var22 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var8 = this.a(89, param4, param3, param5);
                    var9 = this.a(-88, param0, param1, param2);
                    if (null == var8) {
                        statePc = 20;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var9 == null) {
                        statePc = 20;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = null;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    return (ue) ((Object) stackIn_21_0);
                }
                case 22: {
                    if (param3 <= 0) {
                        statePc = 35;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_28_0 = var9.field_d;
                    stackIn_24_0 = stackIn_28_0;
                    if (var8.field_d) {
                        statePc = 28;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = stackIn_24_0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_29_0 = stackIn_26_0;
                    stackIn_29_1 = 1;
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = stackIn_28_0;
                    stackIn_29_1 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if ((stackIn_29_0 ? 1 : 0) != stackIn_29_1) {
                        statePc = 35;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if ((param3 ^ -1) == (param1 ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = this.a(param4, param4, param5, 0, true, param5, param3, true);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    return stackIn_34_0;
                }
                case 35: {
                    var10 = param2;
                    var11 = param2;
                    var12 = param0;
                    var13 = param0;
                    if (param2 < 1) {
                        statePc = 47;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if ((param0 ^ -1) > -2) {
                        statePc = 47;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if ((-2 + this.field_b ^ -1) >= (param2 ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (param0 >= this.field_e + -2) {
                        statePc = 47;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_48_0 = null;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    return (ue) ((Object) stackIn_48_0);
                }
                case 49: {
                    this.field_d[param2][param0] = 0;
                    var16_int = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    stackIn_51_0 = 1000;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (stackIn_51_0 <= var16_int) {
                        statePc = 162;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    stackIn_167_0 = var10;
                    stackIn_53_0 = stackIn_167_0;
                    if (var22 != 0) {
                        statePc = 167;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var17 = stackIn_53_0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    stackIn_55_0 = var17;
                    stackIn_55_1 = var11;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (stackIn_55_0 > stackIn_55_1) {
                        statePc = 161;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_51_0 = var12;
                    stackIn_57_0 = stackIn_51_0;
                    if (var22 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var18 = stackIn_57_0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if ((var13 ^ -1) > (var18 ^ -1)) {
                        statePc = 160;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_55_0 = this.field_d[var17][var18] ^ -1;
                    stackIn_60_0 = stackIn_55_0;
                    stackIn_55_1 = var16_int ^ -1;
                    stackIn_60_1 = stackIn_55_1;
                    if (var22 != 0) {
                        statePc = 55;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (stackIn_60_0 == stackIn_60_1) {
                        statePc = 62;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (var17 != param5) {
                        statePc = 69;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if ((var18 ^ -1) == (param4 ^ -1)) {
                        statePc = 68;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var16_int = 1000;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (var10 != var17) {
                        statePc = 76;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (-2 > (var17 ^ -1)) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var10--;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    if ((var13 ^ -1) != (var18 ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if ((var18 ^ -1) <= (-2 + this.field_e ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var13++;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if ((var12 ^ -1) != (var18 ^ -1)) {
                        statePc = 88;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (-2 <= (var18 ^ -1)) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var12--;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if ((var11 ^ -1) != (var17 ^ -1)) {
                        statePc = 95;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (this.field_b + -2 > var17) {
                        statePc = 94;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var11++;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    var19 = 0;
                    if (100 > this.field_g[var17][var18]) {
                        statePc = 98;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var19 = 200 - this.field_g[var17][var18];
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if (-1 < (var19 ^ -1)) {
                        statePc = 102;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var19 = 0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (-2 <= (var17 ^ -1)) {
                        statePc = 108;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var15 = 0;
                    var14 = -1;
                    if (this.field_d[var17 - -var14][var15 + var18] > var16_int - (-this.field_f[var17][var18].a(var15, 1000, param3, var14) + -var19)) {
                        statePc = 107;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 107: {
                    this.field_d[var14 + var17][var15 + var18] = var19 + this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if ((var17 ^ -1) >= -2) {
                        statePc = 118;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (var18 > 1) {
                        statePc = 114;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var15 = -1;
                    var14 = -1;
                    if ((this.field_d[var14 + var17][var15 + var18] ^ -1) < (var16_int - -this.field_f[var17][var18].a(var15, 1000, param3, var14) + var19 ^ -1)) {
                        statePc = 117;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 117: {
                    this.field_d[var17 - -var14][var18 + var15] = var19 + (this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int);
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (var17 <= 1) {
                        statePc = 125;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if ((var18 ^ -1) <= (-2 + this.field_e ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var14 = -1;
                    var15 = 1;
                    if ((this.field_d[var17 + var14][var18 - -var15] ^ -1) >= (this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int + var19 ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    this.field_d[var17 - -var14][var15 + var18] = var19 + (var16_int + this.field_f[var17][var18].a(var15, 1000, param3, var14));
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if (-2 + this.field_b > var17) {
                        statePc = 128;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var14 = 1;
                    var15 = 0;
                    if (this.field_d[var17 - -var14][var18 - -var15] > this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int + var19) {
                        statePc = 131;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 131: {
                    this.field_d[var17 - -var14][var15 + var18] = var16_int + (this.field_f[var17][var18].a(var15, 1000, param3, var14) - -var19);
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if ((-2 + this.field_b ^ -1) >= (var17 ^ -1)) {
                        statePc = 139;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if (1 >= var18) {
                        statePc = 139;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var14 = 1;
                    var15 = -1;
                    if ((this.field_d[var14 + var17][var18 - -var15] ^ -1) >= (this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int + var19 ^ -1)) {
                        statePc = 139;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    this.field_d[var14 + var17][var15 + var18] = var19 + var16_int - -this.field_f[var17][var18].a(var15, 1000, param3, var14);
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    if ((var17 ^ -1) <= (-2 + this.field_b ^ -1)) {
                        statePc = 147;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (this.field_e - 2 <= var18) {
                        statePc = 147;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var14 = 1;
                    var15 = 1;
                    if ((this.field_d[var17 + var14][var18 + var15] ^ -1) < (var19 + (this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int) ^ -1)) {
                        statePc = 146;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 146: {
                    this.field_d[var17 + var14][var18 - -var15] = this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int - -var19;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (-2 > (var18 ^ -1)) {
                        statePc = 150;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var14 = 0;
                    var15 = -1;
                    if (this.field_d[var17 - -var14][var18 + var15] <= var19 + (this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int)) {
                        statePc = 153;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    this.field_d[var14 + var17][var15 + var18] = var16_int + this.field_f[var17][var18].a(var15, 1000, param3, var14) - -var19;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (this.field_e - 2 > var18) {
                        statePc = 156;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var15 = 1;
                    var14 = 0;
                    if (this.field_d[var17 + var14][var15 + var18] <= var19 + (var16_int + this.field_f[var17][var18].a(var15, 1000, param3, var14))) {
                        statePc = 159;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    this.field_d[var14 + var17][var18 + var15] = this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int + var19;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    var18++;
                    if (var22 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var17++;
                    if (var22 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var16_int++;
                    if (var22 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    stackIn_165_0 = this;
                    stackIn_163_0 = stackIn_165_0;
                    stackIn_165_1 = param2;
                    stackIn_163_1 = stackIn_165_1;
                    if (param6) {
                        statePc = 165;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    stackIn_166_0 = this;
                    stackIn_166_1 = stackIn_163_1;
                    stackIn_166_2 = 1;
                    statePc = 166;
                    continue stateLoop;
                }
                case 165: {
                    stackIn_166_0 = this;
                    stackIn_166_1 = stackIn_165_1;
                    stackIn_166_2 = 0;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    stackIn_167_0 = this.a(stackIn_166_1, stackIn_166_2 != 0, param1, param0) ? 1 : 0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (stackIn_167_0 != 0) {
                        statePc = 169;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 169: {
                    this.field_d[param2][param0] = 1000;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if (param6) {
                        statePc = 173;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    this.a(58, (byte) 54, -86);
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    stackIn_176_0 = this;
                    stackIn_174_0 = stackIn_176_0;
                    stackIn_176_1 = param2;
                    stackIn_174_1 = stackIn_176_1;
                    if (param6) {
                        statePc = 176;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    stackIn_177_0 = this;
                    stackIn_177_1 = stackIn_174_1;
                    stackIn_177_2 = 1;
                    statePc = 177;
                    continue stateLoop;
                }
                case 176: {
                    stackIn_177_0 = this;
                    stackIn_177_1 = stackIn_176_1;
                    stackIn_177_2 = 0;
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    if (this.a(stackIn_177_1, stackIn_177_2 != 0, param1, param0)) {
                        statePc = 180;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 180: {
                    stackIn_181_0 = null;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    return (ue) ((Object) stackIn_181_0);
                }
                case 182: {
                    if (-1001 < (this.field_d[param5][param4] ^ -1)) {
                        statePc = 185;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var16 = null;
                    var20 = param5;
                    var21 = param4;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if (var20 != param2) {
                        statePc = 188;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (var21 == param0) {
                        statePc = 227;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var19 = this.field_d[var20][var21];
                    var18 = 0;
                    var17 = 0;
                    stackIn_189_0 = -1;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    var14 = stackIn_189_0;
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    stackIn_191_0 = -2;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (stackIn_191_0 > (var14 ^ -1)) {
                        statePc = 217;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    stackIn_222_0 = -1;
                    stackIn_193_0 = stackIn_222_0;
                    if (var22 != 0) {
                        statePc = 222;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var15 = stackIn_193_0;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    if (-2 > (var15 ^ -1)) {
                        statePc = 216;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    stackIn_191_0 = var14 + var20;
                    stackIn_196_0 = stackIn_191_0;
                    if (var22 != 0) {
                        statePc = 191;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (stackIn_196_0 <= 0) {
                        statePc = 215;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if ((var21 + var15 ^ -1) >= -1) {
                        statePc = 215;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if ((var20 + var14 ^ -1) <= (this.field_b - 1 ^ -1)) {
                        statePc = 215;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    if ((-1 + this.field_e ^ -1) >= (var21 - -var15 ^ -1)) {
                        statePc = 215;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (var19 <= this.field_d[var20 - -var14][var21 - -var15]) {
                        statePc = 215;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (1000 > this.field_f[var20 + var14][var15 + var21].a(-var15, 1000, param3, -var14)) {
                        statePc = 214;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 214: {
                    var19 = this.field_d[var20 - -var14][var15 + var21];
                    var17 = var14;
                    var18 = var15;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    var15++;
                    if (var22 == 0) {
                        statePc = 194;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var14++;
                    if (var22 == 0) {
                        statePc = 190;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (var16 != null) {
                        statePc = 219;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    var16 = new ue(var17, var18, this.field_f[var20][var21].a(var18, 1000, param3, var17));
                    if (var22 == 0) {
                        statePc = 221;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    ((ue) (var16)).a(-var19 + this.field_d[var20][var21], var18, var17, (byte) -91);
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    var20 = var20 + var17;
                    var21 = var21 + var18;
                    stackIn_222_0 = var17 ^ -1;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    if (stackIn_222_0 != -1) {
                        statePc = 186;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    stackIn_189_0 = var18;
                    stackIn_224_0 = stackIn_189_0;
                    if (var22 != 0) {
                        statePc = 189;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (stackIn_224_0 != 0) {
                        statePc = 186;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    stackIn_226_0 = null;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    return (ue) ((Object) stackIn_226_0);
                }
                case 227: {
                    stackIn_228_0 = var16;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    return (ue) ((Object) stackIn_228_0);
                }
                case 229: {
                    stackIn_230_0 = null;
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    return (ue) ((Object) stackIn_230_0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        boolean discarded$1 = false;
        dl var5 = null;
        RuntimeException var5_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 <= -95) {
                break L1;
              } else {
                discarded$1 = this.a(true, 68, -74, (byte) 21, -78);
                break L1;
              }
            }
            var5 = this.a(-97, param1, param3, param0);
            if (null == var5) {
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var5.field_b ^ -1) < 0) {
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_14_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var5_ref), "dk.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    dk(int param0, int param1) {
        this.field_k = 0;
        try {
            this.field_e = param1;
            this.field_b = param0;
            this.field_f = new dl[this.field_b][this.field_e];
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        dl stackIn_89_0 = null;
        dl stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        Object stackIn_94_3 = null;
        int stackIn_94_4 = 0;
        int stackIn_94_5 = 0;
        dl stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        Object stackIn_96_3 = null;
        int stackIn_96_4 = 0;
        int stackIn_96_5 = 0;
        dl stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        Object stackIn_97_3 = null;
        int stackIn_97_4 = 0;
        int stackIn_97_5 = 0;
        dl stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        Object stackIn_99_3 = null;
        int stackIn_99_4 = 0;
        int stackIn_99_5 = 0;
        dl stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        Object stackIn_100_3 = null;
        int stackIn_100_4 = 0;
        int stackIn_100_5 = 0;
        dl stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        Object stackIn_102_3 = null;
        int stackIn_102_4 = 0;
        int stackIn_102_5 = 0;
        dl stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        Object stackIn_104_3 = null;
        int stackIn_104_4 = 0;
        int stackIn_104_5 = 0;
        dl stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        Object stackIn_105_3 = null;
        int stackIn_105_4 = 0;
        int stackIn_105_5 = 0;
        int stackIn_105_6 = 0;
        dl stackIn_125_0 = null;
        int stackIn_184_0 = 0;
        int stackIn_184_1 = 0;
        int stackIn_189_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dl var14 = null;
        Object var15 = null;
        Object var16 = null;
        int var17 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        var4 = null;
                        if (null != this.field_i) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4 = this.field_i.field_F;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = 320 + -sj.field_b;
                        var6 = -lg.field_c + 240;
                        var7 = 0;
                        var8 = 1 + this.field_b + -2;
                        var9 = 0;
                        var10 = 1 + (-2 + this.field_e);
                        if (this.field_l == null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10 = -1 + this.field_e;
                        var7 = 0;
                        var8 = this.field_b + -1;
                        var9 = 0;
                        if (var17 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 -= 32;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (null != u.field_a) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        u.field_a.a();
                        l.f(0, 0, 128, 160, 0);
                        k.field_f.a(0);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        uf.field_c = -1;
                        vf.field_a = -1;
                        var11 = var7;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 < var11) {
                            statePc = 185;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 += 32;
                        var6 += 16;
                        stackIn_189_0 = var9;
                        stackIn_16_0 = stackIn_189_0;
                        if (var17 != 0) {
                            statePc = 189;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var12 = stackIn_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var10 < var12) {
                            statePc = 183;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 -= 32;
                        var6 += 16;
                        stackIn_184_0 = var5;
                        stackIn_19_0 = stackIn_184_0;
                        stackIn_184_1 = -32;
                        stackIn_19_1 = stackIn_184_1;
                        if (var17 != 0) {
                            statePc = 184;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 <= stackIn_19_1) {
                            statePc = 115;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (682 <= var5) {
                            statePc = 115;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-32 >= var6) {
                            statePc = 115;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-625 >= (var6 ^ -1)) {
                            statePc = 115;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (null == this.field_i) {
                            statePc = 46;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (0 == var11) {
                            statePc = 106;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var12 ^ -1) == -1) {
                            statePc = 106;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var11 ^ -1) == (-1 + this.field_b ^ -1)) {
                            statePc = 106;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var12 == this.field_e + -1) {
                            statePc = 106;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (this.field_i != null) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var13 = 48 * -eg.field_p;
                        if (Math.abs(this.field_i.field_y + -var5) + Math.abs(-var13 + (-var6 + this.field_i.field_j)) * 2 >= 32) {
                            statePc = 61;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (!param1) {
                            statePc = 61;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (!this.field_i.field_w) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        vf.field_a = var12;
                        uf.field_c = var11;
                        cm.field_d = eg.field_p;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (null == this.field_l) {
                            statePc = 88;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var13 = 0;
                        if (0 < tg.field_l) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var13 = var13 - tg.field_l * 48;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (this.field_l.field_k < var5 - 16) {
                            statePc = 88;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (16 + var5 < this.field_l.field_k) {
                            statePc = 88;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var13 + (var6 - 8) > this.field_l.field_d) {
                            statePc = 88;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var13 + (var6 - -8) >= this.field_l.field_d) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        cm.field_d = 0;
                        vf.field_a = var12;
                        uf.field_c = var11;
                        if ((var11 ^ -1) != (uf.field_c ^ -1)) {
                            statePc = 88;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if ((vf.field_a ^ -1) != (var12 ^ -1)) {
                            statePc = 88;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (param1) {
                            statePc = 87;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        l.a(var5 << -2137680124, var6 << -2026626236, 384, 255, bj.field_d);
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackIn_89_0 = this.field_f[var11][var12];
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (stackIn_89_0 != null) {
                            statePc = 93;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        bm.a(var6, var5, (byte) 127);
                        if (var17 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackIn_104_0 = this.field_f[var11][var12];
                        stackIn_94_0 = stackIn_104_0;
                        stackIn_104_1 = var5;
                        stackIn_94_1 = stackIn_104_1;
                        stackIn_104_2 = var3_int;
                        stackIn_94_2 = stackIn_104_2;
                        stackIn_104_3 = var4;
                        stackIn_94_3 = stackIn_104_3;
                        stackIn_104_4 = var6;
                        stackIn_94_4 = stackIn_104_4;
                        stackIn_104_5 = 125;
                        stackIn_94_5 = stackIn_104_5;
                        if (var11 != uf.field_c) {
                            statePc = 104;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        stackIn_96_0 = (dl) ((Object) stackIn_94_0);
                        stackIn_96_1 = stackIn_94_1;
                        stackIn_96_2 = stackIn_94_2;
                        stackIn_96_3 = stackIn_94_3;
                        stackIn_96_4 = stackIn_94_4;
                        stackIn_96_5 = stackIn_94_5;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackIn_104_0 = (dl) ((Object) stackIn_96_0);
                        stackIn_97_0 = stackIn_104_0;
                        stackIn_104_1 = stackIn_96_1;
                        stackIn_97_1 = stackIn_104_1;
                        stackIn_104_2 = stackIn_96_2;
                        stackIn_97_2 = stackIn_104_2;
                        stackIn_104_3 = stackIn_96_3;
                        stackIn_97_3 = stackIn_104_3;
                        stackIn_104_4 = stackIn_96_4;
                        stackIn_97_4 = stackIn_104_4;
                        stackIn_104_5 = stackIn_96_5;
                        stackIn_97_5 = stackIn_104_5;
                        if ((vf.field_a ^ -1) != (var12 ^ -1)) {
                            statePc = 104;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackIn_99_0 = (dl) ((Object) stackIn_97_0);
                        stackIn_99_1 = stackIn_97_1;
                        stackIn_99_2 = stackIn_97_2;
                        stackIn_99_3 = stackIn_97_3;
                        stackIn_99_4 = stackIn_97_4;
                        stackIn_99_5 = stackIn_97_5;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackIn_104_0 = (dl) ((Object) stackIn_99_0);
                        stackIn_100_0 = stackIn_104_0;
                        stackIn_104_1 = stackIn_99_1;
                        stackIn_100_1 = stackIn_104_1;
                        stackIn_104_2 = stackIn_99_2;
                        stackIn_100_2 = stackIn_104_2;
                        stackIn_104_3 = stackIn_99_3;
                        stackIn_100_3 = stackIn_104_3;
                        stackIn_104_4 = stackIn_99_4;
                        stackIn_100_4 = stackIn_104_4;
                        stackIn_104_5 = stackIn_99_5;
                        stackIn_100_5 = stackIn_104_5;
                        if (!param1) {
                            statePc = 104;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackIn_102_0 = (dl) ((Object) stackIn_100_0);
                        stackIn_102_1 = stackIn_100_1;
                        stackIn_102_2 = stackIn_100_2;
                        stackIn_102_3 = stackIn_100_3;
                        stackIn_102_4 = stackIn_100_4;
                        stackIn_102_5 = stackIn_100_5;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackIn_105_0 = (dl) ((Object) stackIn_102_0);
                        stackIn_105_1 = stackIn_102_1;
                        stackIn_105_2 = stackIn_102_2;
                        stackIn_105_3 = stackIn_102_3;
                        stackIn_105_4 = stackIn_102_4;
                        stackIn_105_5 = stackIn_102_5;
                        stackIn_105_6 = 1;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        stackIn_105_0 = (dl) ((Object) stackIn_104_0);
                        stackIn_105_1 = stackIn_104_1;
                        stackIn_105_2 = stackIn_104_2;
                        stackIn_105_3 = stackIn_104_3;
                        stackIn_105_4 = stackIn_104_4;
                        stackIn_105_5 = stackIn_104_5;
                        stackIn_105_6 = 0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var3_int = ((dl) (Object) stackIn_105_0).a(stackIn_105_1, stackIn_105_2, (gi[]) ((Object) stackIn_105_3), stackIn_105_4, (byte) stackIn_105_5, stackIn_105_6 != 0);
                        if (var17 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (-1 == (var11 ^ -1)) {
                            statePc = 113;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (var12 == 0) {
                            statePc = 113;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        pf.a(this.field_i, (byte) 71, var5, var6);
                        if (var17 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        wi.a((byte) -80, this.field_i, var5, var6);
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (uf.field_c != var11) {
                            statePc = 182;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if ((vf.field_a ^ -1) != (var12 ^ -1)) {
                            statePc = 182;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (param1) {
                            statePc = 122;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var13 = 0;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (eg.field_p < var13) {
                            statePc = 182;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var14 = this.a(-124, vf.field_a, var13, uf.field_c);
                        stackIn_89_0 = (dl) (var14);
                        stackIn_125_0 = stackIn_89_0;
                        if (var17 != 0) {
                            statePc = 89;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (stackIn_125_0 == null) {
                            statePc = 152;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var15 = hb.field_p[0];
                        if (null == var14.field_h) {
                            statePc = 140;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if ((var13 ^ -1) != (eg.field_p ^ -1)) {
                            statePc = 140;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (null == var14.field_h.field_Z) {
                            statePc = 134;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var15 = hb.field_p[2];
                        if (var17 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (var14.field_h.field_C == 1) {
                            statePc = 138;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        var15 = null;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (!var14.field_h.field_k) {
                            statePc = 140;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var15 = hb.field_p[1];
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (this.field_i == null) {
                            statePc = 148;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (this.field_i.field_L == 0) {
                            statePc = 148;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (eg.field_p != var13) {
                            statePc = 148;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var15 = hb.field_p[1];
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (hb.field_p[1] != var15) {
                            statePc = 151;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        ve.a((ci) (var15), -5353, var6 + 144 * var13, var6 - var13 * 48, -24 + var5);
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if (var17 == 0) {
                            statePc = 181;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        var15 = hb.field_p[0];
                        if (null == this.field_i) {
                            statePc = 160;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if ((this.field_i.field_L ^ -1) == -1) {
                            statePc = 160;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        if (var13 != eg.field_p) {
                            statePc = 160;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        var15 = hb.field_p[1];
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if (hb.field_p[1] != var15) {
                            statePc = 163;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        ve.a((ci) (var15), -5353, var6 + 144 * var13, var6 + -(48 * var13), var5 + -24);
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        var16 = null;
                        if (param1) {
                            statePc = 167;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        u.field_a.a();
                        l.f(0, 0, 128, 160, 0);
                        k.field_f.a(0);
                        if (var17 == 0) {
                            statePc = 168;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        var16 = oi.field_J;
                        ((ci) (var16)).a();
                        l.f(0, 0, 128, 160, 0);
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        if (null == var16) {
                            statePc = 181;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        ((ci) (var16)).a();
                        l.a(32, 124, 16777215);
                        l.a(64, 108, 16777215);
                        l.a(64, 139, 16777215);
                        l.a(95, 124, 16777215);
                        k.field_f.a(0);
                        u.field_a.a();
                        ((ci) (var16)).d(0, 0);
                        if (this.field_i == null) {
                            statePc = 178;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        if (0 >= this.field_i.field_L) {
                            statePc = 178;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        c.a((byte) -86, u.field_a, 16777215);
                        c.a((byte) -86, u.field_a, 16744576);
                        c.a((byte) -86, u.field_a, 16728128);
                        c.a((byte) -86, u.field_a, 8388608);
                        c.a((byte) -86, u.field_a, 4194304);
                        if (var17 == 0) {
                            statePc = 180;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        c.a((byte) -86, u.field_a, 16777215);
                        c.a((byte) -86, u.field_a, 8454016);
                        c.a((byte) -86, u.field_a, 4259648);
                        c.a((byte) -86, u.field_a, 32768);
                        c.a((byte) -86, u.field_a, 16384);
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        ((ci) (var16)).b(0, 0, 0);
                        k.field_f.a(0);
                        ug.field_b = -64 + var5;
                        hb.field_n = -(48 * eg.field_p) + (-124 + var6);
                        ((ci) (var16)).b(-64 + var5, -124 + var6);
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        var13++;
                        if (var17 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        var12++;
                        if (var17 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 183;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        var5 = var5 + (1 + -var9 + var10 << 71490277);
                        stackIn_184_0 = var6;
                        stackIn_184_1 = 1 + (-var9 + var10) << 8496356;
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        var6 = stackIn_184_0 - stackIn_184_1;
                        var11++;
                        if (var17 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if (null == u.field_a) {
                            statePc = 188;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        u.field_a.b(ug.field_b, hb.field_n);
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        stackIn_189_0 = param0 ? 1 : 0;
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        if (stackIn_189_0 == 0) {
                            statePc = 194;
                        } else {
                            statePc = 190;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        this.a(true, 75, 67, -64, 52, 26, 57);
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 193: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw qk.a((Throwable) ((Object) var3), "dk.E(" + param0 + ',' + param1 + ')');
                }
                case 194: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte param1, int param2) {
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_265_0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16_int = 0;
        r var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        dl var20 = null;
        int var21 = 0;
        int var22 = 0;
        dl var22_ref_dl = null;
        int var23 = 0;
        int var24 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var24 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var4_int = param0 - 5 * (this.field_b - 64) / 2;
                    var5 = param2 - 5 * (this.field_e + -64) / 2;
                    l.e(-3 + var4_int, -3 + var5, 6 + this.field_b * 5, 5 * this.field_e - -6, 10066329);
                    l.e(-2 + var4_int, -2 + var5, 4 + 5 * this.field_b, 5 * this.field_e + 4, 0);
                    l.e(-1 + var4_int, var5 + -1, 2 + this.field_b * 5, 2 + 5 * this.field_e, 6645093);
                    l.f(var4_int, var5, this.field_b * 5, this.field_e * 5, 0);
                    vf.field_a = -1;
                    uf.field_c = -1;
                    var8 = 5597743;
                    var9 = 6473014;
                    var10 = 11067278;
                    var11 = 6698029;
                    var12 = 8742972;
                    var13 = 12030304;
                    var14 = 10066329;
                    var15 = 6645093;
                    if ((param2 ^ -1) == -51) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var7 = 70;
                    var6 = 400;
                    l.e(var6 + -13, 47, 176, 326, 10066329);
                    l.e(var6 + -12, 48, 174, 324, 0);
                    l.e(-11 + var6, 49, 172, 322, 6645093);
                    l.f(-10 + var6, 50, 170, 320, 0);
                    var16_int = 20;
                    og.field_f.b(vb.field_e, var6, var7, 16777215, -1);
                    og.field_f.b(vb.field_e, 1 + var6, var7, 16777215, -1);
                    var7 = var7 + (6 + var16_int);
                    og.field_f.b(kj.field_a, var6, var7, 16777215, -1);
                    var7 = var7 + (var16_int - -6);
                    l.f(var6, var7 - 11, 12, 12, var8);
                    og.field_f.b(cm.field_e, var6, var7, 16777215, -1);
                    var7 = var7 + var16_int;
                    l.f(var6, var7 - 11, 12, 12, var9);
                    og.field_f.b(gh.field_L, var6, var7, 16777215, -1);
                    var7 = var7 + var16_int;
                    l.f(var6, var7 + -11, 12, 12, var10);
                    og.field_f.b(ab.field_c, var6, var7, 16777215, -1);
                    var7 = var7 + var16_int;
                    var7 += 6;
                    og.field_f.b(mm.field_g, var6, var7, 16777215, -1);
                    var7 = var7 + (var16_int - -6);
                    l.f(var6, var7 + -11, 12, 12, var11);
                    og.field_f.b(bm.field_c, var6, var7, 16777215, -1);
                    var7 = var7 + var16_int;
                    l.f(var6, var7 + -11, 12, 12, var12);
                    og.field_f.b(am.field_H, var6, var7, 16777215, -1);
                    var7 = var7 + var16_int;
                    l.f(var6, -11 + var7, 12, 12, var13);
                    og.field_f.b(cg.field_I, var6, var7, 16777215, -1);
                    var7 = var7 + var16_int;
                    l.f(var6, var7 - 11, 12, 12, var15);
                    og.field_f.b(vh.field_h, var6, var7, 16777215, -1);
                    var7 = var7 + var16_int;
                    l.f(var6, -11 + var7, 12, 12, var14);
                    og.field_f.b(gh.field_O, var6, var7, 16777215, -1);
                    var7 = var7 + var16_int;
                    l.f(var6, -11 + var7, 12, 12, 16777215);
                    og.field_f.b(rj.field_b, var6, var7, 16777215, -1);
                    var7 = var7 + var16_int;
                    rh.field_b[0].f(-2 + var6, -13 + var7);
                    og.field_f.b(hm.field_H, var6, var7, 16777215, -1);
                    var7 = var7 + var16_int;
                    rh.field_b[6].f(-2 + var6, -13 + var7);
                    og.field_f.b(f.field_h, var6, var7, 16777215, -1);
                    var7 = var7 + var16_int;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((param2 ^ -1) == -51) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    eg.field_p = 5;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (param1 == -122) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.a(1, -41, -108, 47, (String) null);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var16_int = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = eg.field_p ^ -1;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (stackIn_13_0 > (var16_int ^ -1)) {
                        statePc = 264;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var6 = 5 + var4_int;
                    var7 = var5;
                    stackIn_265_0 = 1;
                    stackIn_15_0 = stackIn_265_0;
                    if (var24 != 0) {
                        statePc = 265;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var17 = stackIn_15_0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (-1 + this.field_b <= var17) {
                        statePc = 263;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_13_0 = 1;
                    stackIn_18_0 = stackIn_13_0;
                    if (var24 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var18 = stackIn_18_0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if ((var18 ^ -1) <= (this.field_e - 1 ^ -1)) {
                        statePc = 261;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var7 += 5;
                    var20 = this.a(120, var18, var16_int, var17);
                    if (var24 != 0) {
                        statePc = 262;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (var20 == null) {
                        statePc = 260;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var19 = 0;
                    var21 = 0;
                    if (var20.field_b > -1) {
                        statePc = 27;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var19 = var8;
                    if (1 != var16_int) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var19 = ((16711422 & var8) - -(var9 & 16711422)) / 2;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if ((var16_int ^ -1) != -3) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var19 = var9;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var16_int == 3) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var19 = ((var9 & 16711422) + (16711422 & var10)) / 2;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var16_int < 4) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var19 = var10;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if ((param2 ^ -1) != -51) {
                        statePc = 40;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if ((var20.field_b ^ -1) != 0) {
                        statePc = 43;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (this.field_a != 2) {
                        statePc = 65;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var22 = this.field_b / 4;
                    if (-12 != (this.field_i.field_G.field_Bb ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var22 = 1 + this.field_b / 8;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var17 < -var22 + this.field_b / 2) {
                        statePc = 56;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (this.field_b / 2 + var22 < var17) {
                        statePc = 56;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (-var22 + this.field_e / 2 > var18) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if ((var18 ^ -1) >= (var22 + this.field_e / 2 ^ -1)) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var21 = 1;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (var18 >= 3 + this.field_e / 2 + -var22) {
                        statePc = 65;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (this.field_b / 2 - 1 > var17) {
                        statePc = 65;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var17 > 1 + this.field_b / 2) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var21 = 1;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if ((this.field_a ^ -1) == -4) {
                        statePc = 68;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (this.field_b / 8 >= var17) {
                        statePc = 81;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var17 >= this.field_b * 7 / 8) {
                        statePc = 81;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var18 <= this.field_e / 8) {
                        statePc = 81;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if ((7 * this.field_e / 8 ^ -1) < (var18 ^ -1)) {
                        statePc = 80;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var21 = 1;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (this.field_a == 4) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if ((this.field_a ^ -1) != -2) {
                        statePc = 92;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (-5 == (var20.field_b ^ -1)) {
                        statePc = 91;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (5 != var20.field_b) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var21 = 1;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (-4 < (this.field_i.field_h.field_f[var17][var18].field_v ^ -1)) {
                        statePc = 94;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var21 = 1;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var22_ref_dl = var20;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (null == var22_ref_dl.field_c) {
                        statePc = 100;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var22_ref_dl = var22_ref_dl.field_c;
                    if (var24 != 0) {
                        statePc = 103;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (var24 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (var22_ref_dl.field_d) {
                        statePc = 103;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var21 = 1;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (-2 != (var20.field_v ^ -1)) {
                        statePc = 106;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var19 = var13;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (var20.field_v != 2) {
                        statePc = 108;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var19 = var12;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if ((var20.field_v ^ -1) != -4) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var19 = var11;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    if (var20.field_d) {
                        statePc = 120;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (-19 < (var20.field_j ^ -1)) {
                        statePc = 117;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (34 >= var20.field_j) {
                        statePc = 120;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    if (5 != var20.field_b) {
                        statePc = 121;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var19 = var19 & 16711935;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    if (eg.field_p != var16_int) {
                        statePc = 140;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (var20.field_v != 4) {
                        statePc = 126;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var19 = 16777215;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    if (var20.field_v != 5) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var19 = 16777214;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (null == var20.field_C) {
                        statePc = 133;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (-6 != (var20.field_C.field_v ^ -1)) {
                        statePc = 133;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var19 = 16777215;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (null == var20.field_c) {
                        statePc = 140;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if ((var20.field_c.field_v ^ -1) == -5) {
                        statePc = 139;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var19 = 16777214;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (var20.field_a) {
                        statePc = 147;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (var20.field_d) {
                        statePc = 146;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var19 = 65793;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (var20.field_p <= 0) {
                        statePc = 149;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var19 = 4 * var20.field_p;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    var22 = var20.field_w ? 1 : 0;
                    if (1 != this.field_m) {
                        statePc = 165;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if ((var16_int ^ -1) != -1) {
                        statePc = 165;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (var20.field_d) {
                        statePc = 165;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (Math.abs(-(this.field_b / 2) + var17) >= -5 + this.field_b / 2) {
                        statePc = 164;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if ((Math.abs(-(this.field_e / 2) + var18) ^ -1) <= (-5 + this.field_e / 2 ^ -1)) {
                        statePc = 164;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var22 = 1;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    if ((this.field_m ^ -1) != -3) {
                        statePc = 176;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (-1 != (var16_int ^ -1)) {
                        statePc = 176;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (Math.abs(-(this.field_b / 2) + var17) >= -5 + this.field_b / 2) {
                        statePc = 175;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (Math.abs(-(this.field_e / 2) + var18) < this.field_e / 2 - 5) {
                        statePc = 176;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var22 = 1;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (-4 != (this.field_m ^ -1)) {
                        statePc = 187;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (1 != var16_int) {
                        statePc = 187;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (12 <= var17) {
                        statePc = 187;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (-13 >= (var18 ^ -1)) {
                        statePc = 187;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var22 = 1;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if (this.field_m == 4) {
                        statePc = 190;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (var16_int != 2) {
                        statePc = 197;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (var20.field_b != 5) {
                        statePc = 196;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var22 = 1;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    if (var22 != 0) {
                        statePc = 200;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var19 = (int)(128.0 + 64.0 * Math.sin((double)(-var18) + (mm.field_f * 2.0 + (double)var17))) * 65793;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    if (-1 == (var19 ^ -1)) {
                        statePc = 213;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    l.f(var6, var7, 5, 5, var19);
                    if (-16777216 == (var19 ^ -1)) {
                        statePc = 207;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 207: {
                    l.c(var6, var7 + 2, var6 + 2, var7, 0);
                    l.c(var6, 3 + var7, var6 + 2, var7 + 1, 0);
                    l.c(4 + var6, 2 + var7, var6 + 2, var7, 0);
                    l.c(4 + var6, var7 - -3, var6 + 2, var7 + 1, 0);
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    if (-16777215 == (var19 ^ -1)) {
                        statePc = 211;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 211: {
                    l.c(var6, var7 + 1, var6 + 2, var7 + 3, 0);
                    l.c(var6, var7, var6 - -2, 2 + var7, 0);
                    l.c(var6 - -4, 1 + var7, var6 + 2, var7 - -3, 0);
                    l.c(var6 + 4, var7, var6 + 2, var7 - -2, 0);
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    l.f(var6 + 4, var7, 5, 2236962);
                    l.b(var6, 4 + var7, 4, 2236962);
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    if (var21 == 0) {
                        statePc = 216;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    l.c(var6, var7, -1 + (5 + var6), -1 + (var7 - -5), 16711680);
                    l.c(var6, 1 + var7, 5 + var6 + -2, 5 + var7 + -1, 16711680);
                    l.c(5 + (var6 - 1), var7, -1 + (var6 - -5), var7, 16711680);
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    if (var6 > this.field_i.field_y) {
                        statePc = 229;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if ((this.field_i.field_y ^ -1) <= (5 + var6 ^ -1)) {
                        statePc = 229;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    if (var7 > this.field_i.field_j) {
                        statePc = 229;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    if (5 + var7 > this.field_i.field_j) {
                        statePc = 228;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 228: {
                    uf.field_c = var17;
                    vf.field_a = var18;
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    if (var20.field_a) {
                        statePc = 233;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    if (var20.field_d) {
                        statePc = 260;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (4 != (var20.field_i & 4)) {
                        statePc = 238;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    l.g(var6 + 4, var7, 5, 16776960);
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    if ((var20.field_i & 8 ^ -1) == -9) {
                        statePc = 241;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 241: {
                    l.d(var6, 4 + var7, 5, 16776960);
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    if (-1 != var20.field_g) {
                        statePc = 245;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 245: {
                    var23 = var15;
                    if ((var20.field_e & 1 ^ -1) != -2) {
                        statePc = 247;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    var23 = var14;
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    if ((var20.field_i & 1) == 1) {
                        statePc = 250;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 250: {
                    var23 = 16776960;
                    statePc = 251;
                    continue stateLoop;
                }
                case 251: {
                    l.g(var6, var7, 5, var23);
                    l.g(-1 + var6, var7, 5, var23);
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    if (-1 == var20.field_k) {
                        statePc = 260;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var23 = var15;
                    if ((var20.field_e & 2) == 2) {
                        statePc = 256;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 256: {
                    var23 = var14;
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    if ((2 & var20.field_i ^ -1) != -3) {
                        statePc = 259;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    var23 = 16776960;
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    l.d(var6, var7 - 1, 5, var23);
                    l.d(var6, var7, 5, var23);
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    var18++;
                    if (var24 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var6 += 5;
                    var7 = var7 - 5 * (this.field_e + -2);
                    var17++;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    if (var24 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var16_int++;
                    if (var24 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    stackIn_265_0 = 50;
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    if (stackIn_265_0 == param2) {
                        statePc = 268;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    eg.field_p = 0;
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    if ((param2 ^ -1) == -51) {
                        statePc = 271;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 271: {
                    var7 = -(sj.field_b * 5 / 64) + var5 - -(5 * lg.field_c / 32);
                    var6 = sj.field_b * 5 / 64 + (var4_int - -(5 * lg.field_c / 32));
                    var16_int = 48;
                    l.c(var4_int, var5, var4_int - -(5 * this.field_b), this.field_e * 5 + var5);
                    l.c(-var16_int + (2 + var6), 2 + var7, 2 + var6, -var16_int + var7 - -2, 16777215);
                    l.c(var6 + 2, 2 + (var7 + -var16_int), var16_int + (var6 + 2), 2 + var7, 16777215);
                    l.c(var6 + (2 + var16_int), var7 + 2, var6 + 2, 2 + var7 - -var16_int, 16777215);
                    l.c(2 + var6, var16_int + var7 + 2, var6 + 2 - var16_int, var7 + 2, 16777215);
                    l.c();
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    var16_int = 0;
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    if (this.field_i.field_F.length <= var16_int) {
                        statePc = 282;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (var24 != 0) {
                        statePc = 358;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    if (null == this.field_i.field_F[var16_int]) {
                        statePc = 281;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    var7 = (int)(2.0 + (this.field_i.field_F[var16_int].field_p / 10.0 + (double)(var5 - -(5 * this.field_i.field_F[var16_int].field_m))));
                    var6 = (int)(2.0 + (this.field_i.field_F[var16_int].field_y / 10.0 + (double)(5 * this.field_i.field_F[var16_int].field_c + var4_int)));
                    var17 = 16776960;
                    if ((eg.field_p ^ -1) == (this.field_i.field_F[var16_int].field_x ^ -1)) {
                        statePc = 280;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var17 = 14540032;
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    l.f(-1 + var6, -1 + var7, 2, 2, var17);
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    var16_int++;
                    if (var24 == 0) {
                        statePc = 273;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if (50 == param2) {
                        statePc = 358;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    var17 = 0;
                    statePc = 284;
                    continue stateLoop;
                }
                case 284: {
                    if (100 <= var17) {
                        statePc = 428;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    var16 = this.field_i.field_C[var17];
                    if (var24 != 0) {
                        statePc = 428;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if (null == var16) {
                        statePc = 356;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (-1 <= (var16.field_P ^ -1)) {
                        statePc = 356;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    if ((eg.field_p ^ -1) <= (var16.field_E ^ -1)) {
                        statePc = 297;
                    } else {
                        statePc = 356;
                    }
                    continue stateLoop;
                }
                case 297: {
                    var6 = var4_int - -(var16.field_F * 5);
                    var7 = var5 - -(var16.field_H * 5);
                    if (var16.field_Z != null) {
                        statePc = 304;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    if (var16.field_k) {
                        statePc = 304;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    if (!var16.field_s) {
                        statePc = 347;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    if (var16.field_C != 0) {
                        statePc = 312;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    if (null != var16.field_Z) {
                        statePc = 312;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    rh.field_b[6].c(-2 + var6, -2 + var7);
                    statePc = 312;
                    continue stateLoop;
                }
                case 312: {
                    if (var16.field_Z == null) {
                        statePc = 325;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if (var16.field_c == null) {
                        statePc = 325;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    if (var16 != var16.field_c.field_h) {
                        statePc = 325;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    rh.field_b[0].c(-2 + var6, -2 + var7);
                    if (var16 == this.field_i.field_q) {
                        statePc = 324;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 324: {
                    rh.field_b[0].f(var6 + -6, var7 - 6);
                    statePc = 325;
                    continue stateLoop;
                }
                case 325: {
                    if (-2 != (var16.field_C ^ -1)) {
                        statePc = 356;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    if (var16.field_t == 0) {
                        statePc = 338;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    if (var16.field_t == 9) {
                        statePc = 335;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    rh.field_b[2].c(var6 - 2, -2 + var7);
                    if (var24 == 0) {
                        statePc = 340;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    rh.field_b[12].c(var6 - 2, -2 + var7);
                    if (var24 == 0) {
                        statePc = 340;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 338: {
                    rh.field_b[1].c(var6 + -2, -2 + var7);
                    statePc = 340;
                    continue stateLoop;
                }
                case 340: {
                    if (null == this.field_i.field_q) {
                        statePc = 356;
                    } else {
                        statePc = 341;
                    }
                    continue stateLoop;
                }
                case 341: {
                    if (!this.field_i.field_h.a((byte) -93, this.field_i.field_q, var16)) {
                        statePc = 356;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 344: {
                    l.a(2 + var6, var7 + 2, 4, 16711680);
                    l.a(var6 + 2, 2 + var7, 5, 8388608);
                    if (var24 == 0) {
                        statePc = 356;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 347: {
                    if (!var16.field_h) {
                        statePc = 356;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    var7 = var5 + 5 * var16.field_gb;
                    var6 = 5 * var16.field_i + var4_int;
                    if ((var16.field_C ^ -1) != -1) {
                        statePc = 353;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 351: {
                    rh.field_b[6].c(-2 + var6, var7 + -2);
                    statePc = 353;
                    continue stateLoop;
                }
                case 353: {
                    if (1 != var16.field_C) {
                        statePc = 356;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 354: {
                    rh.field_b[3].c(var6 + -2, var7 - 2);
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    var17++;
                    if (var24 == 0) {
                        statePc = 284;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 358: {
                    var17 = 0;
                    statePc = 359;
                    continue stateLoop;
                }
                case 359: {
                    if ((var17 ^ -1) <= -101) {
                        statePc = 428;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    var16 = this.field_i.field_C[var17];
                    if (var24 != 0) {
                        statePc = 428;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    if (null == var16) {
                        statePc = 425;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 364: {
                    if (var16.field_P <= 0) {
                        statePc = 425;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 367: {
                    if (eg.field_p < var16.field_E) {
                        statePc = 425;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    var7 = var16.field_H * 5 + var5;
                    var6 = var4_int + var16.field_F * 5;
                    if (null != var16.field_Z) {
                        statePc = 377;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 371: {
                    if (var16.field_k) {
                        statePc = 377;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 374: {
                    if (!var16.field_s) {
                        statePc = 413;
                    } else {
                        statePc = 377;
                    }
                    continue stateLoop;
                }
                case 377: {
                    if (var16.field_C != 0) {
                        statePc = 385;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 380: {
                    if (var16.field_Z != null) {
                        statePc = 385;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    rh.field_b[6].c(-2 + var6, var7 + -2);
                    statePc = 385;
                    continue stateLoop;
                }
                case 385: {
                    if (null == var16.field_Z) {
                        statePc = 391;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 386: {
                    rh.field_b[0].c(-2 + var6, var7 - 2);
                    if (this.field_i.field_q != var16) {
                        statePc = 391;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 389: {
                    rh.field_b[0].f(var6 + -6, -6 + var7);
                    statePc = 391;
                    continue stateLoop;
                }
                case 391: {
                    if ((var16.field_C ^ -1) == -2) {
                        statePc = 394;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 394: {
                    if ((var16.field_t ^ -1) == -1) {
                        statePc = 404;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 395: {
                    if ((var16.field_t ^ -1) != -10) {
                        statePc = 401;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    rh.field_b[12].c(-2 + var6, var7 - 2);
                    if (var24 == 0) {
                        statePc = 406;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    rh.field_b[2].c(var6 - 2, var7 + -2);
                    if (var24 == 0) {
                        statePc = 406;
                    } else {
                        statePc = 404;
                    }
                    continue stateLoop;
                }
                case 404: {
                    rh.field_b[1].c(-2 + var6, -2 + var7);
                    statePc = 406;
                    continue stateLoop;
                }
                case 406: {
                    if (null == this.field_i.field_q) {
                        statePc = 425;
                    } else {
                        statePc = 407;
                    }
                    continue stateLoop;
                }
                case 407: {
                    if (!this.field_i.field_h.a((byte) -93, this.field_i.field_q, var16)) {
                        statePc = 425;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 410: {
                    l.a(2 + var6, 2 + var7, 4, 16711680);
                    l.a(2 + var6, var7 + 2, 5, 8388608);
                    if (var24 == 0) {
                        statePc = 425;
                    } else {
                        statePc = 413;
                    }
                    continue stateLoop;
                }
                case 413: {
                    if (var16.field_h) {
                        statePc = 418;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 418: {
                    var6 = var4_int - -(5 * var16.field_i);
                    var7 = var16.field_gb * 5 + var5;
                    if (-1 != (var16.field_C ^ -1)) {
                        statePc = 421;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 419: {
                    rh.field_b[6].c(-2 + var6, var7 - 2);
                    statePc = 421;
                    continue stateLoop;
                }
                case 421: {
                    if (1 == var16.field_C) {
                        statePc = 424;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 424: {
                    rh.field_b[3].c(var6 + -2, -2 + var7);
                    statePc = 425;
                    continue stateLoop;
                }
                case 425: {
                    var17++;
                    if (var24 == 0) {
                        statePc = 359;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 428: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    dk(byte[] param0) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_k = 0;
        try {
          L0: {
            var2_int = 0;
            incrementValue$4 = var2_int;
            var2_int++;
            this.field_b = param0[incrementValue$4];
            incrementValue$5 = var2_int;
            var2_int++;
            this.field_e = param0[incrementValue$5];
            this.field_f = new dl[this.field_b][this.field_e];
            this.a(0, (byte) 104, 0, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("dk.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    dk(e param0) {
        Object stackIn_69_0 = null;
        Object stackIn_71_0 = null;
        Object stackIn_73_0 = null;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        Object stackIn_77_0 = null;
        Object stackIn_79_0 = null;
        Object stackIn_81_0 = null;
        Object stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        Object stackIn_93_0 = null;
        Object stackIn_95_0 = null;
        Object stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_161_1 = 0;
        int stackIn_163_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_166_1 = 0;
        int stackIn_257_0 = 0;
        int stackIn_260_0 = 0;
        int stackIn_260_1 = 0;
        int stackIn_268_0 = 0;
        int stackIn_268_1 = 0;
        int stackIn_270_0 = 0;
        int stackIn_270_1 = 0;
        int stackIn_272_0 = 0;
        int stackIn_272_1 = 0;
        int stackIn_279_0 = 0;
        int stackIn_279_1 = 0;
        int stackIn_282_0 = 0;
        int stackIn_282_1 = 0;
        int stackIn_284_0 = 0;
        int stackIn_287_0 = 0;
        int stackIn_287_1 = 0;
        int stackIn_328_0 = 0;
        int stackIn_340_0 = 0;
        int stackIn_340_1 = 0;
        int stackIn_342_0 = 0;
        int stackIn_345_0 = 0;
        int stackIn_345_1 = 0;
        int stackIn_351_0 = 0;
        int stackIn_357_0 = 0;
        int stackIn_357_1 = 0;
        int stackIn_359_0 = 0;
        int stackIn_362_0 = 0;
        int stackIn_362_1 = 0;
        int stackIn_368_0 = 0;
        int stackIn_376_0 = 0;
        int stackIn_376_1 = 0;
        int stackIn_378_0 = 0;
        int stackIn_381_0 = 0;
        int stackIn_381_1 = 0;
        int stackIn_387_0 = 0;
        int stackIn_405_0 = 0;
        int stackIn_407_0 = 0;
        int stackIn_410_0 = 0;
        int stackIn_434_0 = 0;
        int stackIn_478_0 = 0;
        int stackIn_478_1 = 0;
        Object stackIn_507_0 = null;
        Object stackIn_522_0 = null;
        int stackIn_525_0 = 0;
        int stackIn_525_1 = 0;
        int stackIn_539_0 = 0;
        int stackIn_541_0 = 0;
        int stackIn_541_1 = 0;
        int stackIn_548_0 = 0;
        int stackIn_548_1 = 0;
        int stackIn_550_0 = 0;
        int stackIn_553_0 = 0;
        int stackIn_553_1 = 0;
        int stackIn_563_0 = 0;
        int stackIn_563_1 = 0;
        int stackIn_571_0 = 0;
        int stackIn_571_1 = 0;
        int stackIn_576_0 = 0;
        int stackIn_576_1 = 0;
        RuntimeException stackIn_583_0 = null;
        StringBuilder stackIn_583_1 = null;
        RuntimeException stackIn_585_0 = null;
        StringBuilder stackIn_585_1 = null;
        RuntimeException stackIn_586_0 = null;
        StringBuilder stackIn_586_1 = null;
        String stackIn_586_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var6_ref_byte__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        byte[] var10_ref_byte__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var13_ref = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = Terraphoenix.field_V;
                    this.field_k = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    this.field_m = 0;
                    this.field_i = param0;
                    sj.field_b = 0;
                    lg.field_c = 0;
                    eh.field_m = false;
                    jh.field_n = 0;
                    var2_int = 0;
                    var3 = 0;
                    var4 = 0;
                    var5 = 0;
                    if (!param0.field_G.field_db) {
                        statePc = 6;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_b = 64;
                    this.field_e = 64;
                    this.field_a = 3;
                    var2_int = 4;
                    var5 = 1;
                    if (mb.b(0, 77)) {
                        statePc = 5;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_a = 2;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var6 = param0.field_G.field_Bb;
                    if ((var6 ^ -1) != -1) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var22 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (1 == var6) {
                        statePc = 64;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((var6 ^ -1) != -3) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var22 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (3 == var6) {
                        statePc = 68;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (4 != var6) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var22 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if ((var6 ^ -1) == -6) {
                        statePc = 76;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if ((var6 ^ -1) != -7) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var22 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (7 == var6) {
                        statePc = 84;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (8 != var6) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var22 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var6 == 9) {
                        statePc = 92;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if ((var6 ^ -1) == -11) {
                        statePc = 97;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (var6 == 11) {
                        statePc = 104;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var6 == 12) {
                        statePc = 107;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (-14 == (var6 ^ -1)) {
                        statePc = 110;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 63: {
                    this.field_k = 1;
                    this.field_a = 0;
                    this.field_b = 40;
                    this.field_e = 40;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    this.field_k = 2;
                    this.field_e = 64;
                    this.field_b = 64;
                    this.field_a = 2;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var2_int = 4;
                    this.field_k = 3;
                    this.field_a = 3;
                    this.field_e = 64;
                    this.field_b = 64;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    this.field_b = 64;
                    this.field_a = 3;
                    this.field_e = 64;
                    stackIn_73_0 = this;
                    stackIn_69_0 = stackIn_73_0;
                    if ((param0.field_G.field_ub ^ -1) == -2) {
                        statePc = 73;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_71_0 = this;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_74_0 = this;
                    stackIn_74_1 = 5;
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = this;
                    stackIn_74_1 = 4;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    ((dk) (this)).field_k = stackIn_74_1;
                    var2_int = 4;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var3 = 10;
                    this.field_a = 3;
                    var4 = 1;
                    this.field_e = 64;
                    this.field_b = 64;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_81_0 = this;
                    stackIn_77_0 = stackIn_81_0;
                    if (-2 != (param0.field_G.field_ub ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_79_0 = this;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_82_0 = this;
                    stackIn_82_1 = 5;
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = this;
                    stackIn_82_1 = 4;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    ((dk) (this)).field_k = stackIn_82_1;
                    this.field_a = 2;
                    var4 = 1;
                    this.field_b = 64;
                    this.field_e = 64;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var4 = 2;
                    this.field_a = 1;
                    var3 = 15;
                    this.field_b = 64;
                    this.field_e = 64;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    this.field_a = 2;
                    this.field_k = 3;
                    this.field_e = 64;
                    this.field_b = 64;
                    var4 = 2;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    this.field_b = 64;
                    this.field_e = 64;
                    if (-2 == (param0.field_G.field_vb ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    this.field_a = 1;
                    var4 = 3;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    this.field_k = 6;
                    this.field_b = 62;
                    this.field_e = 62;
                    this.field_a = 4;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var4 = 4;
                    this.field_b = 64;
                    this.field_a = 2;
                    stackIn_95_0 = this;
                    stackIn_93_0 = stackIn_95_0;
                    if (1 == param0.field_G.field_ub) {
                        statePc = 95;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    stackIn_96_0 = this;
                    stackIn_96_1 = 5;
                    statePc = 96;
                    continue stateLoop;
                }
                case 95: {
                    stackIn_96_0 = this;
                    stackIn_96_1 = 4;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    ((dk) (this)).field_k = stackIn_96_1;
                    this.field_e = 64;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    this.field_b = 64;
                    this.field_e = 64;
                    if ((param0.field_G.field_vb ^ -1) == -2) {
                        statePc = 103;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    this.field_k = 6;
                    this.field_e = 62;
                    this.field_a = 1;
                    this.field_b = 62;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    this.field_a = 4;
                    var4 = 3;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    this.field_e = 64;
                    this.field_k = 7;
                    this.field_b = 64;
                    this.field_a = 2;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    this.field_b = 38;
                    this.field_e = 38;
                    this.field_k = 8;
                    this.field_a = 4;
                    if (var22 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    this.field_k = 9;
                    this.field_e = 62;
                    this.field_a = 0;
                    this.field_b = 62;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    this.field_d = new int[this.field_b][this.field_e];
                    this.field_g = new int[this.field_b][this.field_e];
                    this.field_f = new dl[this.field_b][this.field_e];
                    var6 = 0;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if (var6 >= this.field_b) {
                        statePc = 123;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    stackIn_124_0 = 0;
                    stackIn_115_0 = stackIn_124_0;
                    if (var22 != 0) {
                        statePc = 124;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var7 = stackIn_115_0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (var7 >= this.field_e) {
                        statePc = 121;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    this.field_f[var6][var7] = new dl(var6, var7, 0, (dk) (this));
                    var7++;
                    if (var22 != 0) {
                        statePc = 122;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (var22 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var6++;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (var22 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    stackIn_124_0 = 0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (stackIn_124_0 != this.field_k) {
                        statePc = 128;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if ((var4 ^ -1) == -1) {
                        statePc = 391;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if ((this.field_k ^ -1) == -7) {
                        statePc = 136;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (9 == this.field_k) {
                        statePc = 136;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var6 = (int)(Math.random() * 3.0) - 1;
                    var7 = -1 + (int)(3.0 * Math.random());
                    var8 = (int)(Math.random() * 5.0) - 2;
                    var9 = -2 + (int)(Math.random() * 5.0);
                    if (var6 != var8) {
                        statePc = 143;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (var7 == var9) {
                        statePc = 142;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var9--;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if ((Math.abs(var8) ^ -1) != -3) {
                        statePc = 152;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (Math.abs(var9) == 2) {
                        statePc = 149;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (100.0 * Math.random() >= 50.0) {
                        statePc = 151;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var8 = 0;
                    if (var22 == 0) {
                        statePc = 152;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var9 = 0;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (-10 != (this.field_k ^ -1)) {
                        statePc = 154;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var6 = -1;
                    var9 = 1;
                    var8 = 1;
                    var7 = -1;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if ((Math.abs(var6) ^ -1) != -3) {
                        statePc = 159;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if ((Math.abs(var7) ^ -1) != -3) {
                        statePc = 159;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    var6 = 0;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    var13 = -2;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    stackIn_161_0 = var13;
                    stackIn_161_1 = 2;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (stackIn_161_0 > stackIn_161_1) {
                        statePc = 256;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    stackIn_257_0 = -2;
                    stackIn_163_0 = stackIn_257_0;
                    if (var22 != 0) {
                        statePc = 257;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var14 = stackIn_163_0;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if (var14 > 2) {
                        statePc = 255;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Corridors", true)];
                    var15 = (int)(6.0 * Math.random());
                    stackIn_161_0 = -2;
                    stackIn_166_0 = stackIn_161_0;
                    stackIn_161_1 = var15 ^ -1;
                    stackIn_166_1 = stackIn_161_1;
                    if (var22 != 0) {
                        statePc = 161;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (stackIn_166_0 == stackIn_166_1) {
                        statePc = 168;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room0", true)];
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (-3 != (var15 ^ -1)) {
                        statePc = 171;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room1", true)];
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (-4 == (var15 ^ -1)) {
                        statePc = 174;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room2", true)];
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (-5 != (var15 ^ -1)) {
                        statePc = 177;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room3", true)];
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    if (-6 != (var15 ^ -1)) {
                        statePc = 179;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room4", true)];
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if ((var6 ^ -1) != (var13 ^ -1)) {
                        statePc = 187;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if ((var14 ^ -1) != (var7 ^ -1)) {
                        statePc = 187;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (6 != this.field_k) {
                        statePc = 187;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-CommandCenter", true)];
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if ((var13 ^ -1) != (var8 ^ -1)) {
                        statePc = 194;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if ((var14 ^ -1) == (var9 ^ -1)) {
                        statePc = 193;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Entrance", true)];
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    if ((var13 ^ -1) != (var6 ^ -1)) {
                        statePc = 204;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if ((var14 ^ -1) != (var7 ^ -1)) {
                        statePc = 204;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if ((this.field_k ^ -1) == -10) {
                        statePc = 203;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Reactor", true)];
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (-3 != (var13 ^ -1)) {
                        statePc = 214;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (-3 != (var14 ^ -1)) {
                        statePc = 214;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (-10 == (this.field_k ^ -1)) {
                        statePc = 213;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Hangerdoor", true)];
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    if (-3 != (var13 ^ -1)) {
                        statePc = 224;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if ((var14 ^ -1) != -3) {
                        statePc = 224;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if ((this.field_k ^ -1) == -7) {
                        statePc = 223;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 223: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Maindoor", true)];
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    var11 = this.field_b / 2 + 12 * var13;
                    var12 = this.field_b / 2 - -(var14 * 12);
                    if (9 != this.field_k) {
                        statePc = 243;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if ((var13 ^ -1) != -1) {
                        statePc = 231;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if (-1 == (var14 ^ -1)) {
                        statePc = 254;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    if (var13 != 0) {
                        statePc = 237;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (-1 == var14) {
                        statePc = 254;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if (0 != (var13 ^ -1)) {
                        statePc = 243;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    if ((var14 ^ -1) == -1) {
                        statePc = 254;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    if (9 != this.field_k) {
                        statePc = 253;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    if (var6 != var13) {
                        statePc = 253;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (var7 != var14) {
                        statePc = 253;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var11 = var11 + var10_ref_byte__[0] / 4;
                    var12 = var12 + var10_ref_byte__[1] / 4;
                    statePc = 253;
                    continue stateLoop;
                }
                case 253: {
                    this.a(-(var10_ref_byte__[0] / 2) + var11, (byte) 104, -(var10_ref_byte__[1] / 2) + var12, var10_ref_byte__);
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    var14++;
                    if (var22 == 0) {
                        statePc = 164;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var13++;
                    if (var22 == 0) {
                        statePc = 160;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    stackIn_257_0 = 0;
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    var13 = stackIn_257_0;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    if ((var13 ^ -1) <= (this.field_b ^ -1)) {
                        statePc = 266;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    stackIn_268_0 = 34;
                    stackIn_260_0 = stackIn_268_0;
                    stackIn_268_1 = this.field_f[var13][1].field_j;
                    stackIn_260_1 = stackIn_268_1;
                    if (var22 != 0) {
                        statePc = 268;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (stackIn_260_0 != stackIn_260_1) {
                        statePc = 264;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 264: {
                    this.field_f[var13][2].field_k = -1;
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    var13++;
                    if (var22 == 0) {
                        statePc = 258;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    var13 = 0;
                    statePc = 267;
                    continue stateLoop;
                }
                case 267: {
                    stackIn_268_0 = var13;
                    stackIn_268_1 = this.field_e;
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    if (stackIn_268_0 >= stackIn_268_1) {
                        statePc = 278;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    stackIn_279_0 = -35;
                    stackIn_270_0 = stackIn_279_0;
                    stackIn_279_1 = this.field_f[1][var13].field_j ^ -1;
                    stackIn_270_1 = stackIn_279_1;
                    if (var22 != 0) {
                        statePc = 279;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    stackIn_272_0 = stackIn_270_0;
                    stackIn_272_1 = stackIn_270_1;
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    if (stackIn_272_0 == stackIn_272_1) {
                        statePc = 277;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    this.field_f[2][var13].field_g = -1;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    var13++;
                    if (var22 == 0) {
                        statePc = 267;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    stackIn_279_0 = 8;
                    stackIn_279_1 = this.field_k;
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    if (stackIn_279_0 != stackIn_279_1) {
                        statePc = 327;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    var6 = (int)(Math.random() * 3.0) + -1;
                    var7 = -var6;
                    var8 = -1;
                    var9 = -1;
                    var13 = -1;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    stackIn_282_0 = var13;
                    stackIn_282_1 = 1;
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    if (stackIn_282_0 > stackIn_282_1) {
                        statePc = 327;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    stackIn_328_0 = -1;
                    stackIn_284_0 = stackIn_328_0;
                    if (var22 != 0) {
                        statePc = 328;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    var14 = stackIn_284_0;
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    if (-2 > (var14 ^ -1)) {
                        statePc = 326;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Corridors", true)];
                    var15 = (int)(6.0 * Math.random());
                    stackIn_282_0 = var15 ^ -1;
                    stackIn_287_0 = stackIn_282_0;
                    stackIn_282_1 = -2;
                    stackIn_287_1 = stackIn_282_1;
                    if (var22 != 0) {
                        statePc = 282;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    if (stackIn_287_0 != stackIn_287_1) {
                        statePc = 289;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room0", true)];
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    if (-3 == (var15 ^ -1)) {
                        statePc = 292;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 292: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room1", true)];
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    if (3 != var15) {
                        statePc = 295;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room2", true)];
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    if (4 != var15) {
                        statePc = 297;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room3", true)];
                    statePc = 297;
                    continue stateLoop;
                }
                case 297: {
                    if (var15 == 5) {
                        statePc = 300;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 300: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room4", true)];
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    if (var13 != var8) {
                        statePc = 308;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    if ((var9 ^ -1) == (var14 ^ -1)) {
                        statePc = 307;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Hanger", true)];
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    if (var13 != var6) {
                        statePc = 313;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    if (var7 != var14) {
                        statePc = 313;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Entrance", true)];
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    if (-2 != (var13 ^ -1)) {
                        statePc = 318;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    if (var14 != 1) {
                        statePc = 318;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Maindoor", true)];
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    if (8 != this.field_k) {
                        statePc = 325;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    if ((var13 ^ -1) != (var8 ^ -1)) {
                        statePc = 325;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (var9 == var14) {
                        statePc = 325;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    var12 = var14 * 12 + this.field_b / 2;
                    var11 = var13 * 12 + this.field_b / 2;
                    this.a(var11 + -(var10_ref_byte__[0] / 2), (byte) 104, -(var10_ref_byte__[1] / 2) + var12, var10_ref_byte__);
                    var14++;
                    if (var22 == 0) {
                        statePc = 285;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    var13++;
                    if (var22 == 0) {
                        statePc = 281;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    stackIn_328_0 = this.field_k;
                    statePc = 328;
                    continue stateLoop;
                }
                case 328: {
                    if (stackIn_328_0 == 7) {
                        statePc = 331;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 331: {
                    var6_ref_byte__ = of.field_k[wf.a("MissileBase", true)];
                    var7 = this.field_b / 2;
                    var8 = this.field_e / 2;
                    this.a(var7 - var6_ref_byte__[0] / 2, (byte) 104, -(var6_ref_byte__[1] / 2) + var8, var6_ref_byte__);
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    if (-2 != (var4 ^ -1)) {
                        statePc = 350;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    if (this.field_k == 0) {
                        statePc = 338;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 338: {
                    var6 = 0;
                    statePc = 339;
                    continue stateLoop;
                }
                case 339: {
                    stackIn_340_0 = this.field_b ^ -1;
                    stackIn_340_1 = var6 ^ -1;
                    statePc = 340;
                    continue stateLoop;
                }
                case 340: {
                    if (stackIn_340_0 >= stackIn_340_1) {
                        statePc = 350;
                    } else {
                        statePc = 341;
                    }
                    continue stateLoop;
                }
                case 341: {
                    stackIn_351_0 = 0;
                    stackIn_342_0 = stackIn_351_0;
                    if (var22 != 0) {
                        statePc = 351;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    var7 = stackIn_342_0;
                    statePc = 343;
                    continue stateLoop;
                }
                case 343: {
                    if (this.field_e <= var7) {
                        statePc = 349;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 344: {
                    var8 = var6 - this.field_b / 2;
                    var9 = var7 + -(this.field_b / 2);
                    var10 = (int)Math.sqrt((double)(var9 * var9 + var8 * var8));
                    stackIn_340_0 = -5;
                    stackIn_345_0 = stackIn_340_0;
                    stackIn_340_1 = var10 ^ -1;
                    stackIn_345_1 = stackIn_340_1;
                    if (var22 != 0) {
                        statePc = 340;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (stackIn_345_0 < stackIn_345_1) {
                        statePc = 347;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 347: {
                    this.field_f[var6][var7].field_B = true;
                    this.field_f[var6][var7].field_b = 1;
                    statePc = 348;
                    continue stateLoop;
                }
                case 348: {
                    var7++;
                    if (var22 == 0) {
                        statePc = 343;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    var6++;
                    if (var22 == 0) {
                        statePc = 339;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    stackIn_351_0 = var4 ^ -1;
                    statePc = 351;
                    continue stateLoop;
                }
                case 351: {
                    if (stackIn_351_0 != -3) {
                        statePc = 367;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    if (this.field_k != 0) {
                        statePc = 367;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    var6 = 0;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    stackIn_357_0 = var6 ^ -1;
                    stackIn_357_1 = this.field_b ^ -1;
                    statePc = 357;
                    continue stateLoop;
                }
                case 357: {
                    if (stackIn_357_0 <= stackIn_357_1) {
                        statePc = 367;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    stackIn_368_0 = 0;
                    stackIn_359_0 = stackIn_368_0;
                    if (var22 != 0) {
                        statePc = 368;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    var7 = stackIn_359_0;
                    statePc = 360;
                    continue stateLoop;
                }
                case 360: {
                    if ((var7 ^ -1) <= (this.field_e ^ -1)) {
                        statePc = 366;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    var8 = var6 - this.field_b / 2;
                    var9 = -(this.field_b / 2) + var7;
                    var10 = (int)Math.sqrt((double)(var8 * var8 - -(var9 * var9)));
                    stackIn_357_0 = var10 ^ -1;
                    stackIn_362_0 = stackIn_357_0;
                    stackIn_357_1 = -8;
                    stackIn_362_1 = stackIn_357_1;
                    if (var22 != 0) {
                        statePc = 357;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 362: {
                    if (stackIn_362_0 <= stackIn_362_1) {
                        statePc = 365;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    this.field_f[var6][var7].field_B = true;
                    this.field_f[var6][var7].field_b = 1;
                    statePc = 365;
                    continue stateLoop;
                }
                case 365: {
                    var7++;
                    if (var22 == 0) {
                        statePc = 360;
                    } else {
                        statePc = 366;
                    }
                    continue stateLoop;
                }
                case 366: {
                    var6++;
                    if (var22 == 0) {
                        statePc = 356;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 367: {
                    stackIn_368_0 = var4;
                    statePc = 368;
                    continue stateLoop;
                }
                case 368: {
                    if (stackIn_368_0 != 3) {
                        statePc = 386;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    if ((this.field_k ^ -1) == -1) {
                        statePc = 374;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 374: {
                    var6 = 0;
                    statePc = 375;
                    continue stateLoop;
                }
                case 375: {
                    stackIn_376_0 = var6 ^ -1;
                    stackIn_376_1 = this.field_b ^ -1;
                    statePc = 376;
                    continue stateLoop;
                }
                case 376: {
                    if (stackIn_376_0 <= stackIn_376_1) {
                        statePc = 386;
                    } else {
                        statePc = 377;
                    }
                    continue stateLoop;
                }
                case 377: {
                    stackIn_387_0 = 0;
                    stackIn_378_0 = stackIn_387_0;
                    if (var22 != 0) {
                        statePc = 387;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 378: {
                    var7 = stackIn_378_0;
                    statePc = 379;
                    continue stateLoop;
                }
                case 379: {
                    if ((this.field_e ^ -1) >= (var7 ^ -1)) {
                        statePc = 385;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 380: {
                    var8 = var6 + -(this.field_b / 2);
                    var9 = var7 - this.field_b / 2;
                    var10 = (int)Math.sqrt((double)(var9 * var9 + var8 * var8));
                    stackIn_376_0 = var10 ^ -1;
                    stackIn_381_0 = stackIn_376_0;
                    stackIn_376_1 = -9;
                    stackIn_381_1 = stackIn_376_1;
                    if (var22 != 0) {
                        statePc = 376;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    if (stackIn_381_0 <= stackIn_381_1) {
                        statePc = 384;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    this.field_f[var6][var7].field_B = true;
                    this.field_f[var6][var7].field_b = 1;
                    statePc = 384;
                    continue stateLoop;
                }
                case 384: {
                    var7++;
                    if (var22 == 0) {
                        statePc = 379;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 385: {
                    var6++;
                    if (var22 == 0) {
                        statePc = 375;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 386: {
                    stackIn_387_0 = -2;
                    statePc = 387;
                    continue stateLoop;
                }
                case 387: {
                    if (stackIn_387_0 == (this.field_k ^ -1)) {
                        statePc = 390;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 390: {
                    var6_ref_byte__ = of.field_k[wf.a("Tutorial", true)];
                    this.a(0, (byte) 104, 0, var6_ref_byte__);
                    statePc = 391;
                    continue stateLoop;
                }
                case 391: {
                    var6 = 0;
                    var7 = 0;
                    var8 = 0;
                    var9 = 0;
                    var10 = 0;
                    var11 = 0;
                    if (this.field_k == 2) {
                        statePc = 394;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 394: {
                    var10 = 1;
                    statePc = 395;
                    continue stateLoop;
                }
                case 395: {
                    if (this.field_k != 3) {
                        statePc = 397;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 396: {
                    var7 = 1;
                    var11 = 2;
                    var8 = 1;
                    statePc = 397;
                    continue stateLoop;
                }
                case 397: {
                    if (4 == this.field_k) {
                        statePc = 400;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 400: {
                    var6 = 1;
                    var7 = 1;
                    var11 = 5;
                    statePc = 401;
                    continue stateLoop;
                }
                case 401: {
                    if (this.field_k != 5) {
                        statePc = 403;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    var7 = 1;
                    var9 = 1;
                    var11 = 3;
                    statePc = 403;
                    continue stateLoop;
                }
                case 403: {
                    var13 = 0;
                    statePc = 404;
                    continue stateLoop;
                }
                case 404: {
                    stackIn_405_0 = this.field_b;
                    statePc = 405;
                    continue stateLoop;
                }
                case 405: {
                    if (stackIn_405_0 <= var13) {
                        statePc = 433;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    stackIn_434_0 = 0;
                    stackIn_407_0 = stackIn_434_0;
                    if (var22 != 0) {
                        statePc = 434;
                    } else {
                        statePc = 407;
                    }
                    continue stateLoop;
                }
                case 407: {
                    var14 = stackIn_407_0;
                    statePc = 408;
                    continue stateLoop;
                }
                case 408: {
                    if ((this.field_e ^ -1) >= (var14 ^ -1)) {
                        statePc = 432;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 409: {
                    stackIn_405_0 = var13;
                    stackIn_410_0 = stackIn_405_0;
                    if (var22 != 0) {
                        statePc = 405;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 410: {
                    if (stackIn_410_0 == 0) {
                        statePc = 425;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 411: {
                    if (var14 == 0) {
                        statePc = 425;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 414: {
                    var15 = 32;
                    if ((var15 ^ -1) < (this.field_f[var13 + -1][var14].field_x ^ -1)) {
                        statePc = 417;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 417: {
                    var15 = this.field_f[var13 - 1][var14].field_x;
                    statePc = 418;
                    continue stateLoop;
                }
                case 418: {
                    if (var15 > this.field_f[var13][-1 + var14].field_x) {
                        statePc = 421;
                    } else {
                        statePc = 422;
                    }
                    continue stateLoop;
                }
                case 421: {
                    var15 = this.field_f[var13][-1 + var14].field_x;
                    statePc = 422;
                    continue stateLoop;
                }
                case 422: {
                    if ((this.field_f[var13 - 1][-1 + var14].field_x ^ -1) <= (var15 ^ -1)) {
                        statePc = 424;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 423: {
                    var15 = this.field_f[-1 + var13][var14 - 1].field_x;
                    statePc = 424;
                    continue stateLoop;
                }
                case 424: {
                    this.field_f[var13][var14].field_x = 1 + var15;
                    if (var22 == 0) {
                        statePc = 427;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 425: {
                    this.field_f[var13][var14].field_x = 1;
                    statePc = 427;
                    continue stateLoop;
                }
                case 427: {
                    if (this.field_f[var13][var14].field_B) {
                        statePc = 430;
                    } else {
                        statePc = 431;
                    }
                    continue stateLoop;
                }
                case 430: {
                    this.field_f[var13][var14].field_x = 0;
                    statePc = 431;
                    continue stateLoop;
                }
                case 431: {
                    var14++;
                    if (var22 == 0) {
                        statePc = 408;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    var13++;
                    if (var22 == 0) {
                        statePc = 404;
                    } else {
                        statePc = 433;
                    }
                    continue stateLoop;
                }
                case 433: {
                    stackIn_434_0 = 1;
                    statePc = 434;
                    continue stateLoop;
                }
                case 434: {
                    var12 = stackIn_434_0;
                    var13_ref = null;
                    if (var12 == 0) {
                        statePc = 440;
                    } else {
                        statePc = 435;
                    }
                    continue stateLoop;
                }
                case 435: {
                    if (var6 == 0) {
                        statePc = 440;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 438: {
                    var12 = 0;
                    var13_ref = of.field_k[wf.a("Hanger", true)];
                    var6 = 0;
                    if ((param0.field_G.field_Bb ^ -1) != -4) {
                        statePc = 440;
                    } else {
                        statePc = 439;
                    }
                    continue stateLoop;
                }
                case 439: {
                    var13_ref = of.field_k[wf.a("AlienHanger", true)];
                    statePc = 440;
                    continue stateLoop;
                }
                case 440: {
                    if (var12 == 0) {
                        statePc = 447;
                    } else {
                        statePc = 441;
                    }
                    continue stateLoop;
                }
                case 441: {
                    if (var8 != 0) {
                        statePc = 446;
                    } else {
                        statePc = 447;
                    }
                    continue stateLoop;
                }
                case 446: {
                    var8 = 0;
                    var13_ref = of.field_k[wf.a("ResearchBase", true)];
                    var12 = 0;
                    statePc = 447;
                    continue stateLoop;
                }
                case 447: {
                    if (var12 == 0) {
                        statePc = 455;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    if (var9 == 0) {
                        statePc = 455;
                    } else {
                        statePc = 451;
                    }
                    continue stateLoop;
                }
                case 451: {
                    var13_ref = of.field_k[wf.a("FactoryBase", true)];
                    var9 = 0;
                    var12 = 0;
                    if (param0.field_G.field_Bb == 3) {
                        statePc = 454;
                    } else {
                        statePc = 455;
                    }
                    continue stateLoop;
                }
                case 454: {
                    var13_ref = of.field_k[wf.a("AlienFactoryBase", true)];
                    statePc = 455;
                    continue stateLoop;
                }
                case 455: {
                    if (var12 == 0) {
                        statePc = 462;
                    } else {
                        statePc = 456;
                    }
                    continue stateLoop;
                }
                case 456: {
                    if (var7 != 0) {
                        statePc = 461;
                    } else {
                        statePc = 462;
                    }
                    continue stateLoop;
                }
                case 461: {
                    var12 = 0;
                    var13_ref = of.field_k[wf.a("Helepad", true)];
                    var7 = 0;
                    statePc = 462;
                    continue stateLoop;
                }
                case 462: {
                    if (var12 == 0) {
                        statePc = 467;
                    } else {
                        statePc = 463;
                    }
                    continue stateLoop;
                }
                case 463: {
                    if (var10 <= 0) {
                        statePc = 467;
                    } else {
                        statePc = 466;
                    }
                    continue stateLoop;
                }
                case 466: {
                    var12 = 0;
                    var10--;
                    var13_ref = of.field_k[wf.a("Barracks", true)];
                    statePc = 467;
                    continue stateLoop;
                }
                case 467: {
                    if (var12 == 0) {
                        statePc = 472;
                    } else {
                        statePc = 468;
                    }
                    continue stateLoop;
                }
                case 468: {
                    if (-1 <= (var11 ^ -1)) {
                        statePc = 472;
                    } else {
                        statePc = 471;
                    }
                    continue stateLoop;
                }
                case 471: {
                    var11--;
                    var12 = 0;
                    var13_ref = of.field_k[wf.a("FuelDump", true)];
                    statePc = 472;
                    continue stateLoop;
                }
                case 472: {
                    var14 = 0;
                    if (var12 == 0) {
                        statePc = 497;
                    } else {
                        statePc = 473;
                    }
                    continue stateLoop;
                }
                case 473: {
                    if (var4 == 0) {
                        statePc = 497;
                    } else {
                        statePc = 476;
                    }
                    continue stateLoop;
                }
                case 476: {
                    stackIn_478_0 = 0;
                    stackIn_478_1 = this.field_k;
                    statePc = 478;
                    continue stateLoop;
                }
                case 478: {
                    if (stackIn_478_0 == stackIn_478_1) {
                        statePc = 497;
                    } else {
                        statePc = 479;
                    }
                    continue stateLoop;
                }
                case 479: {
                    var14 = 1;
                    var12 = 0;
                    if ((var4 ^ -1) != -2) {
                        statePc = 481;
                    } else {
                        statePc = 480;
                    }
                    continue stateLoop;
                }
                case 480: {
                    var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                    statePc = 481;
                    continue stateLoop;
                }
                case 481: {
                    if (var4 == 2) {
                        statePc = 484;
                    } else {
                        statePc = 485;
                    }
                    continue stateLoop;
                }
                case 484: {
                    var13_ref = of.field_k[wf.a("UFO-Invader", true)];
                    statePc = 485;
                    continue stateLoop;
                }
                case 485: {
                    if ((var4 ^ -1) != -4) {
                        statePc = 487;
                    } else {
                        statePc = 486;
                    }
                    continue stateLoop;
                }
                case 486: {
                    var13_ref = of.field_k[wf.a("UFO-Dominator", true)];
                    statePc = 487;
                    continue stateLoop;
                }
                case 487: {
                    if (3 >= var4) {
                        statePc = 490;
                    } else {
                        statePc = 491;
                    }
                    continue stateLoop;
                }
                case 490: {
                    var4 = 0;
                    statePc = 491;
                    continue stateLoop;
                }
                case 491: {
                    if (5 == var4) {
                        statePc = 494;
                    } else {
                        statePc = 495;
                    }
                    continue stateLoop;
                }
                case 494: {
                    var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                    var4 = 1;
                    statePc = 495;
                    continue stateLoop;
                }
                case 495: {
                    if (4 != var4) {
                        statePc = 497;
                    } else {
                        statePc = 496;
                    }
                    continue stateLoop;
                }
                case 496: {
                    var4 = 5;
                    var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                    statePc = 497;
                    continue stateLoop;
                }
                case 497: {
                    if (var13_ref != null) {
                        statePc = 499;
                    } else {
                        statePc = 523;
                    }
                    continue stateLoop;
                }
                case 499: {
                    var17 = 0;
                    var18 = 0;
                    statePc = 500;
                    continue stateLoop;
                }
                case 500: {
                    var18++;
                    if (-11 > (var18 ^ -1)) {
                        statePc = 502;
                    } else {
                        statePc = 503;
                    }
                    continue stateLoop;
                }
                case 502: {
                    var17++;
                    var18 = 0;
                    statePc = 503;
                    continue stateLoop;
                }
                case 503: {
                    if (var17 > this.field_b / 2) {
                        statePc = 506;
                    } else {
                        statePc = 508;
                    }
                    continue stateLoop;
                }
                case 506: {
                    stackIn_507_0 = this;
                    statePc = 507;
                    continue stateLoop;
                }
                case 507: {
                    var17 = ((dk) (this)).field_b / 2;
                    statePc = 508;
                    continue stateLoop;
                }
                case 508: {
                    var15 = (int)(2.0 * (Math.random() * (double)var17)) + -var17 - -(this.field_b / 2);
                    var16 = (int)(2.0 * ((double)var17 * Math.random())) - (var17 + -(this.field_e / 2));
                    if (var4 == 0) {
                        statePc = 520;
                    } else {
                        statePc = 509;
                    }
                    continue stateLoop;
                }
                case 509: {
                    if (var14 == 0) {
                        statePc = 514;
                    } else {
                        statePc = 520;
                    }
                    continue stateLoop;
                }
                case 514: {
                    var15 = var15 - (-(((byte[]) (var13_ref))[0] / 2) + (this.field_b / 4 - var17 / 2));
                    var16 = var16 - (-(((byte[]) (var13_ref))[1] / 2) + -(var17 / 2) + this.field_b / 4);
                    if (var15 < 1 + ((byte[]) (var13_ref))[0] / 2) {
                        statePc = 517;
                    } else {
                        statePc = 518;
                    }
                    continue stateLoop;
                }
                case 517: {
                    var15 = 1 + ((byte[]) (var13_ref))[0] / 2;
                    statePc = 518;
                    continue stateLoop;
                }
                case 518: {
                    if (1 + ((byte[]) (var13_ref))[1] / 2 <= var16) {
                        statePc = 520;
                    } else {
                        statePc = 519;
                    }
                    continue stateLoop;
                }
                case 519: {
                    var16 = ((byte[]) (var13_ref))[1] / 2 + 1;
                    statePc = 520;
                    continue stateLoop;
                }
                case 520: {
                    if ((((byte[]) (var13_ref))[0] - -1 ^ -1) < (this.field_f[((byte[]) (var13_ref))[0] / 2 + var15][var16 + ((byte[]) (var13_ref))[1] / 2].field_x ^ -1)) {
                        statePc = 500;
                    } else {
                        statePc = 521;
                    }
                    continue stateLoop;
                }
                case 521: {
                    stackIn_507_0 = this;
                    stackIn_522_0 = stackIn_507_0;
                    if (var22 != 0) {
                        statePc = 507;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 522: {
                    this.a(-(((byte[]) (var13_ref))[0] / 2) + var15, (byte) 104, -(((byte[]) (var13_ref))[1] / 2) + var16, (byte[]) (var13_ref));
                    statePc = 523;
                    continue stateLoop;
                }
                case 523: {
                    if (var12 == 0) {
                        statePc = 403;
                    } else {
                        statePc = 524;
                    }
                    continue stateLoop;
                }
                case 524: {
                    stackIn_478_0 = 1;
                    stackIn_525_0 = stackIn_478_0;
                    stackIn_478_1 = this.field_k;
                    stackIn_525_1 = stackIn_478_1;
                    if (var22 != 0) {
                        statePc = 478;
                    } else {
                        statePc = 525;
                    }
                    continue stateLoop;
                }
                case 525: {
                    if (stackIn_525_0 == stackIn_525_1) {
                        statePc = 535;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 526: {
                    if (var5 == 0) {
                        statePc = 532;
                    } else {
                        statePc = 529;
                    }
                    continue stateLoop;
                }
                case 529: {
                    this.a((byte) -106);
                    if (var22 == 0) {
                        statePc = 537;
                    } else {
                        statePc = 532;
                    }
                    continue stateLoop;
                }
                case 532: {
                    this.a(1);
                    if (var22 == 0) {
                        statePc = 537;
                    } else {
                        statePc = 535;
                    }
                    continue stateLoop;
                }
                case 535: {
                    this.a(1);
                    statePc = 537;
                    continue stateLoop;
                }
                case 537: {
                    var13 = 0;
                    statePc = 538;
                    continue stateLoop;
                }
                case 538: {
                    stackIn_539_0 = var3 + var2_int;
                    statePc = 539;
                    continue stateLoop;
                }
                case 539: {
                    if (stackIn_539_0 <= var13) {
                        statePc = 562;
                    } else {
                        statePc = 540;
                    }
                    continue stateLoop;
                }
                case 540: {
                    var14 = 4 + (int)(6.0 * Math.random());
                    var14 = var14 * var14;
                    var15 = (int)(Math.random() * (double)this.field_b);
                    var16 = (int)(Math.random() * (double)this.field_e);
                    stackIn_563_0 = var2_int ^ -1;
                    stackIn_541_0 = stackIn_563_0;
                    stackIn_563_1 = var13 ^ -1;
                    stackIn_541_1 = stackIn_563_1;
                    if (var22 != 0) {
                        statePc = 563;
                    } else {
                        statePc = 541;
                    }
                    continue stateLoop;
                }
                case 541: {
                    if (stackIn_541_0 >= stackIn_541_1) {
                        statePc = 545;
                    } else {
                        statePc = 546;
                    }
                    continue stateLoop;
                }
                case 545: {
                    var15 = (int)(Math.random() * (double)this.field_b / 2.0) + this.field_b / 4;
                    var16 = (int)(Math.random() * (double)this.field_e / 2.0) + this.field_e / 4;
                    statePc = 546;
                    continue stateLoop;
                }
                case 546: {
                    var20 = 0;
                    statePc = 547;
                    continue stateLoop;
                }
                case 547: {
                    stackIn_548_0 = var20 ^ -1;
                    stackIn_548_1 = this.field_b ^ -1;
                    statePc = 548;
                    continue stateLoop;
                }
                case 548: {
                    if (stackIn_548_0 <= stackIn_548_1) {
                        statePc = 561;
                    } else {
                        statePc = 549;
                    }
                    continue stateLoop;
                }
                case 549: {
                    stackIn_539_0 = 0;
                    stackIn_550_0 = stackIn_539_0;
                    if (var22 != 0) {
                        statePc = 539;
                    } else {
                        statePc = 550;
                    }
                    continue stateLoop;
                }
                case 550: {
                    var21 = stackIn_550_0;
                    statePc = 551;
                    continue stateLoop;
                }
                case 551: {
                    if ((var21 ^ -1) <= (this.field_e ^ -1)) {
                        statePc = 560;
                    } else {
                        statePc = 552;
                    }
                    continue stateLoop;
                }
                case 552: {
                    var18 = -var21 + var16;
                    var17 = -var20 + var15;
                    var19 = var17 * var17 - -(var18 * var18);
                    stackIn_548_0 = var19 ^ -1;
                    stackIn_553_0 = stackIn_548_0;
                    stackIn_548_1 = var14 ^ -1;
                    stackIn_553_1 = stackIn_548_1;
                    if (var22 != 0) {
                        statePc = 548;
                    } else {
                        statePc = 553;
                    }
                    continue stateLoop;
                }
                case 553: {
                    if (stackIn_553_0 >= stackIn_553_1) {
                        statePc = 555;
                    } else {
                        statePc = 559;
                    }
                    continue stateLoop;
                }
                case 555: {
                    if ((double)var14 * Math.random() > (double)var19) {
                        statePc = 558;
                    } else {
                        statePc = 559;
                    }
                    continue stateLoop;
                }
                case 558: {
                    this.field_f[var20][var21].a(false);
                    statePc = 559;
                    continue stateLoop;
                }
                case 559: {
                    var21++;
                    if (var22 == 0) {
                        statePc = 551;
                    } else {
                        statePc = 560;
                    }
                    continue stateLoop;
                }
                case 560: {
                    var20++;
                    if (var22 == 0) {
                        statePc = 547;
                    } else {
                        statePc = 561;
                    }
                    continue stateLoop;
                }
                case 561: {
                    var13++;
                    if (var22 == 0) {
                        statePc = 538;
                    } else {
                        statePc = 562;
                    }
                    continue stateLoop;
                }
                case 562: {
                    stackIn_563_0 = var4;
                    stackIn_563_1 = 1;
                    statePc = 563;
                    continue stateLoop;
                }
                case 563: {
                    if (stackIn_563_0 != stackIn_563_1) {
                        statePc = 565;
                    } else {
                        statePc = 564;
                    }
                    continue stateLoop;
                }
                case 564: {
                    var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                    this.a(this.field_b / 2 - ((byte[]) (var13_ref))[0] / 2, (byte) 104, this.field_e / 2 + -(((byte[]) (var13_ref))[1] / 2), (byte[]) (var13_ref));
                    statePc = 565;
                    continue stateLoop;
                }
                case 565: {
                    if (-3 != (var4 ^ -1)) {
                        statePc = 567;
                    } else {
                        statePc = 566;
                    }
                    continue stateLoop;
                }
                case 566: {
                    var13_ref = of.field_k[wf.a("UFO-Invader", true)];
                    this.a(this.field_b / 2 + -(((byte[]) (var13_ref))[0] / 2), (byte) 104, this.field_e / 2 - ((byte[]) (var13_ref))[1] / 2, (byte[]) (var13_ref));
                    statePc = 567;
                    continue stateLoop;
                }
                case 567: {
                    if (3 != var4) {
                        statePc = 569;
                    } else {
                        statePc = 568;
                    }
                    continue stateLoop;
                }
                case 568: {
                    var13_ref = of.field_k[wf.a("UFO-Dominator", true)];
                    this.a(this.field_b / 2 - ((byte[]) (var13_ref))[0] / 2, (byte) 104, this.field_e / 2 - ((byte[]) (var13_ref))[1] / 2, (byte[]) (var13_ref));
                    statePc = 569;
                    continue stateLoop;
                }
                case 569: {
                    var13 = 0;
                    statePc = 570;
                    continue stateLoop;
                }
                case 570: {
                    stackIn_571_0 = var13;
                    stackIn_571_1 = this.field_b;
                    statePc = 571;
                    continue stateLoop;
                }
                case 571: {
                    if (stackIn_571_0 >= stackIn_571_1) {
                        statePc = 587;
                    } else {
                        statePc = 572;
                    }
                    continue stateLoop;
                }
                case 572: {
                    if (var22 != 0) {
                        statePc = 587;
                    } else {
                        statePc = 573;
                    }
                    continue stateLoop;
                }
                case 573: {
                    var14 = 0;
                    statePc = 574;
                    continue stateLoop;
                }
                case 574: {
                    if (var14 >= this.field_e) {
                        statePc = 580;
                    } else {
                        statePc = 575;
                    }
                    continue stateLoop;
                }
                case 575: {
                    this.field_f[var13][var14].a(0);
                    stackIn_571_0 = param0.field_G.field_Bb;
                    stackIn_576_0 = stackIn_571_0;
                    stackIn_571_1 = 1;
                    stackIn_576_1 = stackIn_571_1;
                    if (var22 != 0) {
                        statePc = 571;
                    } else {
                        statePc = 576;
                    }
                    continue stateLoop;
                }
                case 576: {
                    if (stackIn_576_0 == stackIn_576_1) {
                        statePc = 578;
                    } else {
                        statePc = 579;
                    }
                    continue stateLoop;
                }
                case 578: {
                    this.field_f[var13][var14].field_z = true;
                    statePc = 579;
                    continue stateLoop;
                }
                case 579: {
                    var14++;
                    if (var22 == 0) {
                        statePc = 574;
                    } else {
                        statePc = 580;
                    }
                    continue stateLoop;
                }
                case 580: {
                    var13++;
                    if (var22 == 0) {
                        statePc = 570;
                    } else {
                        statePc = 587;
                    }
                    continue stateLoop;
                }
                case 587: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_h = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_j = new int[256];
        field_c = new int[128];
    }
}
