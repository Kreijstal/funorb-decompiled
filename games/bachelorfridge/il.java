/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static ee field_b;
    private byte[] field_d;
    private int[] field_c;
    static ee field_a;
    static String field_e;
    private int[] field_f;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 4) {
            il.a(56);
        }
        field_b = null;
        field_e = null;
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, byte param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_65_0 = 0;
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
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            if (0 == param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param4 == -69) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              var7_int = 0;
              param0 = param0 + param2;
              var8 = param5;
              L2: while (true) {
                L3: {
                  var9 = param1[var8];
                  if (var9 < 0) {
                    var7_int = ((il) this).field_c[var7_int];
                    break L3;
                  } else {
                    var7_int++;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = ((il) this).field_c[var7_int];
                    if (((il) this).field_c[var7_int] >= 0) {
                      break L5;
                    } else {
                      int incrementValue$8 = param2;
                      param2++;
                      param3[incrementValue$8] = (byte)(~var10);
                      if (param0 > param2) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if ((var9 & 64) == 0) {
                      var7_int++;
                      break L6;
                    } else {
                      var7_int = ((il) this).field_c[var7_int];
                      break L6;
                    }
                  }
                  L7: {
                    var10 = ((il) this).field_c[var7_int];
                    if (((il) this).field_c[var7_int] >= 0) {
                      break L7;
                    } else {
                      int incrementValue$9 = param2;
                      param2++;
                      param3[incrementValue$9] = (byte)(~var10);
                      if (param0 > param2) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if ((var9 & 32) != 0) {
                      var7_int = ((il) this).field_c[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    var10 = ((il) this).field_c[var7_int];
                    if (0 <= ((il) this).field_c[var7_int]) {
                      break L9;
                    } else {
                      int incrementValue$10 = param2;
                      param2++;
                      param3[incrementValue$10] = (byte)var10;
                      if (param2 < param0) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    if (-1 != (var9 & 16)) {
                      var7_int = ((il) this).field_c[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    var10 = ((il) this).field_c[var7_int];
                    if (0 <= ((il) this).field_c[var7_int]) {
                      break L11;
                    } else {
                      int incrementValue$11 = param2;
                      param2++;
                      param3[incrementValue$11] = (byte)var10;
                      if (param0 <= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (-1 != (var9 & 8)) {
                      var7_int = ((il) this).field_c[var7_int];
                      break L12;
                    } else {
                      var7_int++;
                      break L12;
                    }
                  }
                  L13: {
                    var10 = ((il) this).field_c[var7_int];
                    if (0 <= ((il) this).field_c[var7_int]) {
                      break L13;
                    } else {
                      int incrementValue$12 = param2;
                      param2++;
                      param3[incrementValue$12] = (byte)(~var10);
                      if (param2 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if ((4 & var9) == -1) {
                      var7_int++;
                      break L14;
                    } else {
                      var7_int = ((il) this).field_c[var7_int];
                      break L14;
                    }
                  }
                  L15: {
                    var10 = ((il) this).field_c[var7_int];
                    if (-1 > ((il) this).field_c[var7_int]) {
                      int incrementValue$13 = param2;
                      param2++;
                      param3[incrementValue$13] = (byte)var10;
                      if (param0 > param2) {
                        var7_int = 0;
                        break L15;
                      } else {
                        break L4;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (-1 == (var9 & 2)) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = ((il) this).field_c[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    var10 = ((il) this).field_c[var7_int];
                    if (((il) this).field_c[var7_int] < 0) {
                      int incrementValue$14 = param2;
                      param2++;
                      param3[incrementValue$14] = (byte)(~var10);
                      if (param0 > param2) {
                        var7_int = 0;
                        break L17;
                      } else {
                        return -param5 + 1 + var8;
                      }
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (0 != (1 & var9)) {
                      var7_int = ((il) this).field_c[var7_int];
                      break L18;
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  L19: {
                    var10 = ((il) this).field_c[var7_int];
                    if (0 > ((il) this).field_c[var7_int]) {
                      int incrementValue$15 = param2;
                      param2++;
                      param3[incrementValue$15] = (byte)(~var10);
                      if (param0 <= param2) {
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
                stackOut_65_0 = -param5 + 1 + var8;
                stackIn_66_0 = stackOut_65_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("il.A(").append(param0).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
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
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param2).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param3 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_66_0;
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, int param5) {
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
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var15 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var7_int = 0;
              param1 = param1 + param4;
              var8 = param5 << 3;
              if (param2 == 20857) {
                break L1;
              } else {
                ((il) this).field_f = null;
                break L1;
              }
            }
            L2: while (true) {
              if (param1 <= param4) {
                stackOut_15_0 = -param5 + (7 + var8 >> 3);
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                var9 = param0[param4] & 255;
                var10 = ((il) this).field_f[var9];
                var11 = ((il) this).field_d[var9];
                if (var11 == 0) {
                  throw new RuntimeException("" + var9);
                } else {
                  L3: {
                    var12 = var8 >> 3;
                    var13 = 7 & var8;
                    var7_int = var7_int & -var13 >> 31;
                    var14 = (-1 + (var11 + var13) >> 3) + var12;
                    var13 += 24;
                    int dupTemp$1 = mp.a(var7_int, var10 >>> var13);
                    var7_int = dupTemp$1;
                    param3[var12] = (byte)dupTemp$1;
                    if (var14 <= var12) {
                      break L3;
                    } else {
                      var12++;
                      var13 -= 8;
                      var7_int = var10 >>> var13;
                      param3[var12] = (byte)(var10 >>> var13);
                      if (var12 < var14) {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param3[var12] = (byte)(var10 >>> var13);
                        if (var12 < var14) {
                          var12++;
                          var13 -= 8;
                          var7_int = var10 >>> var13;
                          param3[var12] = (byte)(var10 >>> var13);
                          if (var14 <= var12) {
                            break L3;
                          } else {
                            var12++;
                            var13 -= 8;
                            var7_int = var10 << -var13;
                            param3[var12] = (byte)(var10 << -var13);
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  var8 = var8 + var11;
                  param4++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var7;
            stackOut_17_1 = new StringBuilder().append("il.B(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_16_0;
    }

    il(byte[] param0) {
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
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        try {
          L0: {
            var2_int = param0.length;
            ((il) this).field_d = param0;
            ((il) this).field_f = new int[var2_int];
            ((il) this).field_c = new int[8];
            var19 = new int[33];
            var18 = var19;
            var17 = var18;
            var16 = var17;
            var3 = var16;
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (var6 == 0) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << 32 - var6;
                      var8 = var19[var6];
                      ((il) this).field_f[var5] = var8;
                      if ((var8 & var7) != 0) {
                        var9 = var3[var6 + -1];
                        break L3;
                      } else {
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
                                var12 = 1 << 32 + -var10;
                                if ((var12 & var11) != 0) {
                                  var3[var10] = var3[-1 + var10];
                                  break L5;
                                } else {
                                  var3[var10] = mp.a(var12, var11);
                                  var10--;
                                  continue L4;
                                }
                              }
                            }
                          }
                          var9 = var7 | var8;
                          break L3;
                        }
                      }
                    }
                    var19[var6] = var9;
                    var10 = var6 + 1;
                    L6: while (true) {
                      if (var10 > 32) {
                        var10 = 0;
                        var11 = 0;
                        L7: while (true) {
                          if (var11 >= var6) {
                            L8: {
                              if (var4 > var10) {
                                break L8;
                              } else {
                                var4 = var10 + 1;
                                break L8;
                              }
                            }
                            ((il) this).field_c[var10] = ~var5;
                            break L2;
                          } else {
                            L9: {
                              var12 = -2147483648 >>> var11;
                              if ((var12 & var8) == 0) {
                                var10++;
                                break L9;
                              } else {
                                L10: {
                                  if (((il) this).field_c[var10] != 0) {
                                    break L10;
                                  } else {
                                    ((il) this).field_c[var10] = var4;
                                    break L10;
                                  }
                                }
                                var10 = ((il) this).field_c[var10];
                                break L9;
                              }
                            }
                            L11: {
                              var12 = var12 >>> 1;
                              if (var10 < ((il) this).field_c.length) {
                                break L11;
                              } else {
                                var13 = new int[((il) this).field_c.length * 2];
                                var14 = 0;
                                L12: while (true) {
                                  if (((il) this).field_c.length <= var14) {
                                    ((il) this).field_c = var13;
                                    break L11;
                                  } else {
                                    var13[var14] = ((il) this).field_c[var14];
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
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("il.<init>(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L14;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L14;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> has joined your game.";
    }
}
