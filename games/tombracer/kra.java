/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kra {
    static lqa field_a;
    static Vector field_c;
    private int[] field_b;
    private int[] field_d;
    private byte[] field_e;

    final static void a(boolean param0) {
        if (param0) {
            return;
        }
        era.field_d = new ara(lma.field_r, oba.field_f, cga.field_g, kua.field_i, kt.field_F, dja.field_p);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -2350) {
            return;
        }
        field_a = null;
    }

    final int a(byte param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
        int discarded$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 0;
              var8 = param3 << -1811553757;
              if (param0 <= -66) {
                break L1;
              } else {
                discarded$2 = this.a(103, (byte) -26, -127, (byte[]) null, 31, (byte[]) null);
                break L1;
              }
            }
            param4 = param4 + param2;
            L2: while (true) {
              L3: {
                L4: {
                  if ((param2 ^ -1) <= (param4 ^ -1)) {
                    break L4;
                  } else {
                    var9 = 255 & param5[param2];
                    var10 = this.field_d[var9];
                    var11 = this.field_e[var9];
                    stackOut_5_0 = 0;
                    stackOut_5_1 = var11;
                    stackIn_16_0 = stackOut_5_0;
                    stackIn_16_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (var15 != 0) {
                      break L3;
                    } else {
                      if (stackIn_6_0 == stackIn_6_1) {
                        throw new RuntimeException("" + var9);
                      } else {
                        L5: {
                          var12 = var8 >> -229093373;
                          var13 = 7 & var8;
                          var7_int = var7_int & -var13 >> -1863848481;
                          var14 = var12 + (-1 + var13 - -var11 >> 966679843);
                          var13 += 24;
                          dupTemp$3 = fh.a(var7_int, var10 >>> var13);
                          var7_int = dupTemp$3;
                          param1[var12] = (byte)dupTemp$3;
                          if ((var14 ^ -1) >= (var12 ^ -1)) {
                            break L5;
                          } else {
                            var12++;
                            var13 -= 8;
                            var7_int = var10 >>> var13;
                            param1[var12] = (byte)(var10 >>> var13);
                            if (var14 <= var12) {
                              break L5;
                            } else {
                              var13 -= 8;
                              var12++;
                              var7_int = var10 >>> var13;
                              param1[var12] = (byte)(var10 >>> var13);
                              if ((var14 ^ -1) >= (var12 ^ -1)) {
                                break L5;
                              } else {
                                var13 -= 8;
                                var12++;
                                var7_int = var10 >>> var13;
                                param1[var12] = (byte)(var10 >>> var13);
                                if ((var12 ^ -1) <= (var14 ^ -1)) {
                                  break L5;
                                } else {
                                  var13 -= 8;
                                  var12++;
                                  var7_int = var10 << -var13;
                                  param1[var12] = (byte)(var10 << -var13);
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var8 = var8 + var11;
                        param2++;
                        if (var15 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_15_0 = -param3;
                stackOut_15_1 = var8 - -7 >> -1812584861;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L3;
              }
              stackOut_16_0 = stackIn_16_0 + stackIn_16_1;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var7);
            stackOut_18_1 = new StringBuilder().append("kra.A(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param5 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        return stackIn_17_0;
    }

    kra(byte[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length;
            this.field_e = param0;
            this.field_d = new int[var2_int];
            var17 = new int[33];
            var16 = var17;
            var3 = var16;
            this.field_b = new int[8];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              stackOut_2_0 = var5;
              stackOut_2_1 = var2_int;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 >= stackIn_3_1) {
                      break L4;
                    } else {
                      var6 = param0[var5];
                      if (var15 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (0 == var6) {
                            break L5;
                          } else {
                            L6: {
                              L7: {
                                var7 = 1 << 32 - var6;
                                var8 = var17[var6];
                                this.field_d[var5] = var8;
                                if ((var8 & var7 ^ -1) == -1) {
                                  break L7;
                                } else {
                                  var9 = var3[-1 + var6];
                                  if (var15 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var10 = var6 - 1;
                              L8: while (true) {
                                L9: {
                                  L10: {
                                    if (var10 < 1) {
                                      break L10;
                                    } else {
                                      var11 = var17[var10];
                                      stackOut_10_0 = var8 ^ -1;
                                      stackOut_10_1 = var11 ^ -1;
                                      stackIn_16_0 = stackOut_10_0;
                                      stackIn_16_1 = stackOut_10_1;
                                      stackIn_11_0 = stackOut_10_0;
                                      stackIn_11_1 = stackOut_10_1;
                                      if (var15 != 0) {
                                        break L9;
                                      } else {
                                        if (stackIn_11_0 != stackIn_11_1) {
                                          break L10;
                                        } else {
                                          L11: {
                                            var12 = 1 << -var10 + 32;
                                            if ((var11 & var12 ^ -1) == -1) {
                                              break L11;
                                            } else {
                                              var3[var10] = var3[var10 - 1];
                                              if (var15 == 0) {
                                                break L10;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          var3[var10] = fh.a(var12, var11);
                                          var10--;
                                          if (var15 == 0) {
                                            continue L8;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_15_0 = var8;
                                  stackOut_15_1 = var7;
                                  stackIn_16_0 = stackOut_15_0;
                                  stackIn_16_1 = stackOut_15_1;
                                  break L9;
                                }
                                var9 = stackIn_16_0 | stackIn_16_1;
                                break L6;
                              }
                            }
                            var17[var6] = var9;
                            var10 = 1 + var6;
                            L12: while (true) {
                              L13: {
                                if (var10 > 32) {
                                  break L13;
                                } else {
                                  stackOut_19_0 = var8 ^ -1;
                                  stackOut_19_1 = var17[var10] ^ -1;
                                  stackIn_3_0 = stackOut_19_0;
                                  stackIn_3_1 = stackOut_19_1;
                                  stackIn_20_0 = stackOut_19_0;
                                  stackIn_20_1 = stackOut_19_1;
                                  if (var15 != 0) {
                                    continue L2;
                                  } else {
                                    L14: {
                                      if (stackIn_20_0 != stackIn_20_1) {
                                        break L14;
                                      } else {
                                        var17[var10] = var9;
                                        break L14;
                                      }
                                    }
                                    var10++;
                                    if (var15 == 0) {
                                      continue L12;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              var10 = 0;
                              var11 = 0;
                              L15: while (true) {
                                L16: {
                                  L17: {
                                    if ((var6 ^ -1) >= (var11 ^ -1)) {
                                      break L17;
                                    } else {
                                      var12 = -2147483648 >>> var11;
                                      stackOut_25_0 = 0;
                                      stackOut_25_1 = var8 & var12;
                                      stackIn_40_0 = stackOut_25_0;
                                      stackIn_40_1 = stackOut_25_1;
                                      stackIn_26_0 = stackOut_25_0;
                                      stackIn_26_1 = stackOut_25_1;
                                      if (var15 != 0) {
                                        break L16;
                                      } else {
                                        L18: {
                                          L19: {
                                            if (stackIn_26_0 == stackIn_26_1) {
                                              break L19;
                                            } else {
                                              L20: {
                                                if (this.field_b[var10] != 0) {
                                                  break L20;
                                                } else {
                                                  this.field_b[var10] = var4;
                                                  break L20;
                                                }
                                              }
                                              var10 = this.field_b[var10];
                                              if (var15 == 0) {
                                                break L18;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          var10++;
                                          break L18;
                                        }
                                        L21: {
                                          L22: {
                                            var12 = var12 >>> 1;
                                            if (var10 < this.field_b.length) {
                                              break L22;
                                            } else {
                                              var13 = new int[this.field_b.length * 2];
                                              var14 = 0;
                                              L23: while (true) {
                                                L24: {
                                                  if (var14 >= this.field_b.length) {
                                                    break L24;
                                                  } else {
                                                    var13[var14] = this.field_b[var14];
                                                    var14++;
                                                    if (var15 != 0) {
                                                      break L21;
                                                    } else {
                                                      if (var15 == 0) {
                                                        continue L23;
                                                      } else {
                                                        break L24;
                                                      }
                                                    }
                                                  }
                                                }
                                                this.field_b = var13;
                                                break L22;
                                              }
                                            }
                                          }
                                          var11++;
                                          break L21;
                                        }
                                        if (var15 == 0) {
                                          continue L15;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_39_0 = var10;
                                  stackOut_39_1 = var4;
                                  stackIn_40_0 = stackOut_39_0;
                                  stackIn_40_1 = stackOut_39_1;
                                  break L16;
                                }
                                L25: {
                                  if (stackIn_40_0 < stackIn_40_1) {
                                    break L25;
                                  } else {
                                    var4 = 1 + var10;
                                    break L25;
                                  }
                                }
                                this.field_b[var10] = var5 ^ -1;
                                break L5;
                              }
                            }
                          }
                        }
                        var5++;
                        if (var15 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var2 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var2);
            stackOut_45_1 = new StringBuilder().append("kra.<init>(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L26;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L26;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ')');
        }
    }

    final int a(int param0, byte param1, int param2, byte[] param3, int param4, byte[] param5) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_78_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 71) {
                break L1;
              } else {
                this.field_b = (int[]) null;
                break L1;
              }
            }
            if ((param2 ^ -1) != -1) {
              var7_int = 0;
              param2 = param2 + param4;
              var8 = param0;
              L2: while (true) {
                L3: {
                  L4: {
                    var9 = param3[var8];
                    if (0 <= var9) {
                      break L4;
                    } else {
                      var7_int = this.field_b[var7_int];
                      if (var11 != 0) {
                        break L3;
                      } else {
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var7_int++;
                  break L3;
                }
                L5: {
                  L6: {
                    var10 = this.field_b[var7_int];
                    if (-1 < (this.field_b[var7_int] ^ -1)) {
                      L7: {
                        incrementValue$8 = param4;
                        param4++;
                        param5[incrementValue$8] = (byte)(var10 ^ -1);
                        if ((param2 ^ -1) < (param4 ^ -1)) {
                          break L7;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7_int = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L8: {
                    L9: {
                      if ((64 & var9) == 0) {
                        break L9;
                      } else {
                        var7_int = this.field_b[var7_int];
                        if (var11 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var7_int++;
                    break L8;
                  }
                  L10: {
                    var10 = this.field_b[var7_int];
                    if (0 <= this.field_b[var7_int]) {
                      break L10;
                    } else {
                      L11: {
                        incrementValue$9 = param4;
                        param4++;
                        param5[incrementValue$9] = (byte)(var10 ^ -1);
                        if (param4 < param2) {
                          break L11;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var7_int = 0;
                      break L10;
                    }
                  }
                  L12: {
                    L13: {
                      if (-1 != (var9 & 32 ^ -1)) {
                        break L13;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    var7_int = this.field_b[var7_int];
                    break L12;
                  }
                  L14: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      break L14;
                    } else {
                      L15: {
                        incrementValue$10 = param4;
                        param4++;
                        param5[incrementValue$10] = (byte)(var10 ^ -1);
                        if (param4 < param2) {
                          break L15;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L15;
                          }
                        }
                      }
                      var7_int = 0;
                      break L14;
                    }
                  }
                  L16: {
                    L17: {
                      if (0 == (var9 & 16)) {
                        break L17;
                      } else {
                        var7_int = this.field_b[var7_int];
                        if (var11 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var7_int++;
                    break L16;
                  }
                  L18: {
                    var10 = this.field_b[var7_int];
                    if (-1 < (this.field_b[var7_int] ^ -1)) {
                      L19: {
                        incrementValue$11 = param4;
                        param4++;
                        param5[incrementValue$11] = (byte)(var10 ^ -1);
                        if ((param4 ^ -1) > (param2 ^ -1)) {
                          break L19;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L19;
                          }
                        }
                      }
                      var7_int = 0;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L20: {
                    L21: {
                      if ((var9 & 8) != 0) {
                        break L21;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    var7_int = this.field_b[var7_int];
                    break L20;
                  }
                  L22: {
                    var10 = this.field_b[var7_int];
                    if (-1 >= (this.field_b[var7_int] ^ -1)) {
                      break L22;
                    } else {
                      incrementValue$12 = param4;
                      param4++;
                      param5[incrementValue$12] = (byte)(var10 ^ -1);
                      if ((param4 ^ -1) <= (param2 ^ -1)) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L22;
                      }
                    }
                  }
                  L23: {
                    L24: {
                      if ((4 & var9 ^ -1) != -1) {
                        break L24;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    var7_int = this.field_b[var7_int];
                    break L23;
                  }
                  L25: {
                    var10 = this.field_b[var7_int];
                    if (0 <= this.field_b[var7_int]) {
                      break L25;
                    } else {
                      L26: {
                        incrementValue$13 = param4;
                        param4++;
                        param5[incrementValue$13] = (byte)(var10 ^ -1);
                        if (param4 < param2) {
                          break L26;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L26;
                          }
                        }
                      }
                      var7_int = 0;
                      break L25;
                    }
                  }
                  L27: {
                    L28: {
                      if ((var9 & 2 ^ -1) != -1) {
                        break L28;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L27;
                        } else {
                          break L28;
                        }
                      }
                    }
                    var7_int = this.field_b[var7_int];
                    break L27;
                  }
                  L29: {
                    var10 = this.field_b[var7_int];
                    if (-1 >= (this.field_b[var7_int] ^ -1)) {
                      break L29;
                    } else {
                      L30: {
                        incrementValue$14 = param4;
                        param4++;
                        param5[incrementValue$14] = (byte)(var10 ^ -1);
                        if ((param2 ^ -1) < (param4 ^ -1)) {
                          break L30;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L30;
                          }
                        }
                      }
                      var7_int = 0;
                      break L29;
                    }
                  }
                  L31: {
                    L32: {
                      if ((1 & var9 ^ -1) != -1) {
                        break L32;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                    var7_int = this.field_b[var7_int];
                    break L31;
                  }
                  L33: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] < 0) {
                      incrementValue$15 = param4;
                      param4++;
                      param5[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param4 >= param2) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L33;
                      }
                    } else {
                      break L33;
                    }
                  }
                  var8++;
                  if (var11 == 0) {
                    continue L2;
                  } else {
                    break L5;
                  }
                }
                stackOut_78_0 = -param0 + var8 + 1;
                stackIn_79_0 = stackOut_78_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var7 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) (var7);
            stackOut_80_1 = new StringBuilder().append("kra.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param3 == null) {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L34;
            } else {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L34;
            }
          }
          L35: {
            stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
            stackOut_83_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_83_2).append(',').append(param4).append(',');
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param5 == null) {
              stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackOut_85_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L35;
            } else {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              break L35;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_86_0), stackIn_86_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_79_0;
        }
    }

    static {
    }
}
