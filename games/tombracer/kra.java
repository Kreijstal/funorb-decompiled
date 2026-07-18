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

    final static void a() {
        era.field_d = new ara(lma.field_r, oba.field_f, cga.field_g, kua.field_i, (jea) (Object) kt.field_F, dja.field_p);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -2350) {
            return;
        }
        field_a = null;
    }

    final int a(byte param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
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
        Object var16 = null;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 0;
              var8 = param3 << 3;
              if (param0 <= -66) {
                break L1;
              } else {
                var16 = null;
                int discarded$2 = ((kra) this).a(103, (byte) -26, -127, (byte[]) null, 31, (byte[]) null);
                break L1;
              }
            }
            param4 = param4 + param2;
            L2: while (true) {
              if (param2 >= param4) {
                stackOut_14_0 = -param3 + (var8 - -7 >> 3);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                var9 = 255 & param5[param2];
                var10 = ((kra) this).field_d[var9];
                var11 = ((kra) this).field_e[var9];
                if (0 == var11) {
                  throw new RuntimeException("" + var9);
                } else {
                  L3: {
                    var12 = var8 >> 3;
                    var13 = 7 & var8;
                    var7_int = var7_int & -var13 >> 31;
                    var14 = var12 + (-1 + var13 - -var11 >> 3);
                    var13 += 24;
                    int dupTemp$3 = fh.a(var7_int, var10 >>> var13);
                    var7_int = dupTemp$3;
                    param1[var12] = (byte)dupTemp$3;
                    if (var14 <= var12) {
                      break L3;
                    } else {
                      var12++;
                      var13 -= 8;
                      var7_int = var10 >>> var13;
                      param1[var12] = (byte)(var10 >>> var13);
                      if (var14 <= var12) {
                        break L3;
                      } else {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param1[var12] = (byte)(var10 >>> var13);
                        if (var14 <= var12) {
                          break L3;
                        } else {
                          var13 -= 8;
                          var12++;
                          var7_int = var10 >>> var13;
                          param1[var12] = (byte)(var10 >>> var13);
                          if (var12 >= var14) {
                            break L3;
                          } else {
                            var13 -= 8;
                            var12++;
                            var7_int = var10 << -var13;
                            param1[var12] = (byte)(var10 << -var13);
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  var8 = var8 + var11;
                  param2++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var7;
            stackOut_16_1 = new StringBuilder().append("kra.A(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_15_0;
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
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        try {
          L0: {
            var2_int = param0.length;
            ((kra) this).field_e = param0;
            ((kra) this).field_d = new int[var2_int];
            var19 = new int[33];
            var18 = var19;
            var17 = var18;
            var16 = var17;
            var3 = var16;
            ((kra) this).field_b = new int[8];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (0 == var6) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << 32 - var6;
                      var8 = var19[var6];
                      ((kra) this).field_d[var5] = var8;
                      if ((var8 & var7) == 0) {
                        var10 = var6 - 1;
                        L4: while (true) {
                          L5: {
                            if (var10 < 1) {
                              break L5;
                            } else {
                              var11 = var19[var10];
                              if (var8 != var11) {
                                break L5;
                              } else {
                                var12 = 1 << -var10 + 32;
                                if ((var11 & var12) == 0) {
                                  var3[var10] = fh.a(var12, var11);
                                  var10--;
                                  continue L4;
                                } else {
                                  var3[var10] = var3[var10 - 1];
                                  break L5;
                                }
                              }
                            }
                          }
                          var9 = var8 | var7;
                          break L3;
                        }
                      } else {
                        var9 = var3[-1 + var6];
                        break L3;
                      }
                    }
                    var19[var6] = var9;
                    var10 = 1 + var6;
                    L6: while (true) {
                      if (var10 > 32) {
                        var10 = 0;
                        var11 = 0;
                        L7: while (true) {
                          if (var6 <= var11) {
                            L8: {
                              if (var10 < var4) {
                                break L8;
                              } else {
                                var4 = 1 + var10;
                                break L8;
                              }
                            }
                            ((kra) this).field_b[var10] = ~var5;
                            break L2;
                          } else {
                            L9: {
                              var12 = -2147483648 >>> var11;
                              if (0 == (var8 & var12)) {
                                var10++;
                                break L9;
                              } else {
                                L10: {
                                  if (((kra) this).field_b[var10] != 0) {
                                    break L10;
                                  } else {
                                    ((kra) this).field_b[var10] = var4;
                                    break L10;
                                  }
                                }
                                var10 = ((kra) this).field_b[var10];
                                break L9;
                              }
                            }
                            L11: {
                              var12 = var12 >>> 1;
                              if (var10 < ((kra) this).field_b.length) {
                                break L11;
                              } else {
                                var13 = new int[((kra) this).field_b.length * 2];
                                var14 = 0;
                                L12: while (true) {
                                  if (var14 >= ((kra) this).field_b.length) {
                                    ((kra) this).field_b = var13;
                                    break L11;
                                  } else {
                                    var13[var14] = ((kra) this).field_b[var14];
                                    var14++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                            var11++;
                            continue L7;
                          }
                        }
                      } else {
                        L13: {
                          if (var8 != var19[var10]) {
                            break L13;
                          } else {
                            var19[var10] = var9;
                            break L13;
                          }
                        }
                        var10++;
                        continue L6;
                      }
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var2;
            stackOut_36_1 = new StringBuilder().append("kra.<init>(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L14;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L14;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
    }

    final int a(int param0, byte param1, int param2, byte[] param3, int param4, byte[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_65_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 71) {
                break L1;
              } else {
                ((kra) this).field_b = null;
                break L1;
              }
            }
            if (param2 != 0) {
              var7_int = 0;
              param2 = param2 + param4;
              var8 = param0;
              L2: while (true) {
                L3: {
                  var9 = param3[var8];
                  if (0 <= var9) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = ((kra) this).field_b[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = ((kra) this).field_b[var7_int];
                    if (((kra) this).field_b[var7_int] < 0) {
                      int incrementValue$8 = param4;
                      param4++;
                      param5[incrementValue$8] = (byte)(~var10);
                      if (param2 > param4) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((64 & var9) == 0) {
                      var7_int++;
                      break L6;
                    } else {
                      var7_int = ((kra) this).field_b[var7_int];
                      break L6;
                    }
                  }
                  L7: {
                    var10 = ((kra) this).field_b[var7_int];
                    if (0 <= ((kra) this).field_b[var7_int]) {
                      break L7;
                    } else {
                      int incrementValue$9 = param4;
                      param4++;
                      param5[incrementValue$9] = (byte)var10;
                      if (param4 < param2) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if (-1 != (var9 & 32)) {
                      var7_int = ((kra) this).field_b[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    var10 = ((kra) this).field_b[var7_int];
                    if (((kra) this).field_b[var7_int] >= 0) {
                      break L9;
                    } else {
                      int incrementValue$10 = param4;
                      param4++;
                      param5[incrementValue$10] = (byte)(~var10);
                      if (param4 < param2) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    if (0 == (var9 & 16)) {
                      var7_int++;
                      break L10;
                    } else {
                      var7_int = ((kra) this).field_b[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    var10 = ((kra) this).field_b[var7_int];
                    if (((kra) this).field_b[var7_int] < 0) {
                      int incrementValue$11 = param4;
                      param4++;
                      param5[incrementValue$11] = (byte)(~var10);
                      if (param4 < param2) {
                        var7_int = 0;
                        break L11;
                      } else {
                        break L4;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if ((var9 & 8) != 0) {
                      var7_int = ((kra) this).field_b[var7_int];
                      break L12;
                    } else {
                      var7_int++;
                      break L12;
                    }
                  }
                  L13: {
                    var10 = ((kra) this).field_b[var7_int];
                    if (((kra) this).field_b[var7_int] >= 0) {
                      break L13;
                    } else {
                      int incrementValue$12 = param4;
                      param4++;
                      param5[incrementValue$12] = (byte)(~var10);
                      if (param4 >= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if ((4 & var9) != 0) {
                      var7_int = ((kra) this).field_b[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    var10 = ((kra) this).field_b[var7_int];
                    if (0 <= ((kra) this).field_b[var7_int]) {
                      break L15;
                    } else {
                      int incrementValue$13 = param4;
                      param4++;
                      param5[incrementValue$13] = (byte)(~var10);
                      if (param4 < param2) {
                        var7_int = 0;
                        break L15;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L16: {
                    if ((var9 & 2) != -1) {
                      var7_int = ((kra) this).field_b[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    var10 = ((kra) this).field_b[var7_int];
                    if (-1 <= ((kra) this).field_b[var7_int]) {
                      break L17;
                    } else {
                      int incrementValue$14 = param4;
                      param4++;
                      param5[incrementValue$14] = (byte)(~var10);
                      if (param2 > param4) {
                        var7_int = 0;
                        break L17;
                      } else {
                        return -param0 + var8 + 1;
                      }
                    }
                  }
                  L18: {
                    if ((1 & var9) != 0) {
                      var7_int = ((kra) this).field_b[var7_int];
                      break L18;
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  L19: {
                    var10 = ((kra) this).field_b[var7_int];
                    if (((kra) this).field_b[var7_int] < 0) {
                      int incrementValue$15 = param4;
                      param4++;
                      param5[incrementValue$15] = (byte)(~var10);
                      if (param4 >= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackOut_65_0 = -param0 + var8 + 1;
                stackIn_66_0 = stackOut_65_0;
                break L0;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("kra.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param3 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L20;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L20;
            }
          }
          L21: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param4).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param5 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L21;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L21;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ')');
        }
        return stackIn_66_0;
    }

    static {
    }
}
