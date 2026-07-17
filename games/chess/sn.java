/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static String field_d;
    static String field_g;
    private int[] field_c;
    static String[] field_f;
    private byte[] field_h;
    static String field_e;
    private int[] field_a;
    static String field_b;

    final int a(byte param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
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
        int stackOut_6_0 = 0;
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
        var11 = Chess.field_G;
        try {
          L0: {
            if (param2 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              param2 = param2 + param4;
              var7_int = 0;
              var8 = param3;
              if (param0 >= 57) {
                L1: while (true) {
                  L2: {
                    var9 = param1[var8];
                    if (0 > var9) {
                      var7_int = ((sn) this).field_c[var7_int];
                      break L2;
                    } else {
                      var7_int++;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var10 = ((sn) this).field_c[var7_int];
                      if (0 <= ((sn) this).field_c[var7_int]) {
                        break L4;
                      } else {
                        int incrementValue$7 = param4;
                        param4++;
                        param5[incrementValue$7] = (byte)(~var10);
                        if (param2 > param4) {
                          var7_int = 0;
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if ((64 & var9) == 0) {
                        var7_int++;
                        break L5;
                      } else {
                        var7_int = ((sn) this).field_c[var7_int];
                        break L5;
                      }
                    }
                    L6: {
                      var10 = ((sn) this).field_c[var7_int];
                      if (((sn) this).field_c[var7_int] >= 0) {
                        break L6;
                      } else {
                        int incrementValue$8 = param4;
                        param4++;
                        param5[incrementValue$8] = (byte)var10;
                        if (param4 < param2) {
                          var7_int = 0;
                          break L6;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L7: {
                      if (-1 != (var9 & 32)) {
                        var7_int = ((sn) this).field_c[var7_int];
                        break L7;
                      } else {
                        var7_int++;
                        break L7;
                      }
                    }
                    L8: {
                      var10 = ((sn) this).field_c[var7_int];
                      if (((sn) this).field_c[var7_int] < 0) {
                        int incrementValue$9 = param4;
                        param4++;
                        param5[incrementValue$9] = (byte)(~var10);
                        if (param2 > param4) {
                          var7_int = 0;
                          break L8;
                        } else {
                          break L3;
                        }
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if ((16 & var9) != 0) {
                        var7_int = ((sn) this).field_c[var7_int];
                        break L9;
                      } else {
                        var7_int++;
                        break L9;
                      }
                    }
                    L10: {
                      var10 = ((sn) this).field_c[var7_int];
                      if (0 <= ((sn) this).field_c[var7_int]) {
                        break L10;
                      } else {
                        int incrementValue$10 = param4;
                        param4++;
                        param5[incrementValue$10] = (byte)(~var10);
                        if (param2 > param4) {
                          var7_int = 0;
                          break L10;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L11: {
                      if ((var9 & 8) != 0) {
                        var7_int = ((sn) this).field_c[var7_int];
                        break L11;
                      } else {
                        var7_int++;
                        break L11;
                      }
                    }
                    L12: {
                      var10 = ((sn) this).field_c[var7_int];
                      if (0 <= ((sn) this).field_c[var7_int]) {
                        break L12;
                      } else {
                        int incrementValue$11 = param4;
                        param4++;
                        param5[incrementValue$11] = (byte)(~var10);
                        if (param2 > param4) {
                          var7_int = 0;
                          break L12;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L13: {
                      if ((4 & var9) != 0) {
                        var7_int = ((sn) this).field_c[var7_int];
                        break L13;
                      } else {
                        var7_int++;
                        break L13;
                      }
                    }
                    L14: {
                      var10 = ((sn) this).field_c[var7_int];
                      if (((sn) this).field_c[var7_int] < 0) {
                        int incrementValue$12 = param4;
                        param4++;
                        param5[incrementValue$12] = (byte)var10;
                        if (param4 >= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (-1 != (2 & var9)) {
                        var7_int = ((sn) this).field_c[var7_int];
                        break L15;
                      } else {
                        var7_int++;
                        break L15;
                      }
                    }
                    L16: {
                      var10 = ((sn) this).field_c[var7_int];
                      if (((sn) this).field_c[var7_int] < 0) {
                        int incrementValue$13 = param4;
                        param4++;
                        param5[incrementValue$13] = (byte)(~var10);
                        if (param4 < param2) {
                          var7_int = 0;
                          break L16;
                        } else {
                          return -param3 + 1 + var8;
                        }
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (0 != (var9 & 1)) {
                        var7_int = ((sn) this).field_c[var7_int];
                        break L17;
                      } else {
                        var7_int++;
                        break L17;
                      }
                    }
                    L18: {
                      var10 = ((sn) this).field_c[var7_int];
                      if (((sn) this).field_c[var7_int] >= 0) {
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    var8++;
                    continue L1;
                  }
                  stackOut_65_0 = -param3 + 1 + var8;
                  stackIn_66_0 = stackOut_65_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = -103;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("sn.B(").append(param0).append(44);
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
              break L19;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L19;
            }
          }
          L20: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
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
              break L20;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L20;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 41);
        }
        return stackIn_66_0;
    }

    final int a(boolean param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
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
        var15 = Chess.field_G;
        try {
          L0: {
            L1: {
              var7_int = 0;
              if (param0) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            var8 = param5 << 3;
            param1 = param1 + param2;
            L2: while (true) {
              if (param2 >= param1) {
                stackOut_16_0 = -param5 + (7 + var8 >> 3);
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                var9 = param3[param2] & 255;
                var10 = ((sn) this).field_a[var9];
                var11 = ((sn) this).field_h[var9];
                if (var11 != 0) {
                  L3: {
                    var12 = var8 >> 3;
                    var13 = var8 & 7;
                    var7_int = var7_int & -var13 >> 31;
                    var14 = var12 + (var13 - (-var11 - -1) >> 3);
                    var13 += 24;
                    int dupTemp$1 = s.a(var7_int, var10 >>> var13);
                    var7_int = dupTemp$1;
                    param4[var12] = (byte)dupTemp$1;
                    if (var12 >= var14) {
                      break L3;
                    } else {
                      var12++;
                      var13 -= 8;
                      var7_int = var10 >>> var13;
                      param4[var12] = (byte)(var10 >>> var13);
                      if (var12 < var14) {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param4[var12] = (byte)(var10 >>> var13);
                        if (var14 > var12) {
                          var12++;
                          var13 -= 8;
                          var7_int = var10 >>> var13;
                          param4[var12] = (byte)(var10 >>> var13);
                          if (var14 > var12) {
                            var13 -= 8;
                            var12++;
                            var7_int = var10 << -var13;
                            param4[var12] = (byte)(var10 << -var13);
                            break L3;
                          } else {
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
                  param2++;
                  continue L2;
                } else {
                  throw new RuntimeException("" + var9);
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var7;
            stackOut_18_1 = new StringBuilder().append("sn.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          L5: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param5 + 41);
        }
        return stackIn_17_0;
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_f = null;
        field_b = null;
        field_g = null;
    }

    sn(byte[] param0) {
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
            ((sn) this).field_h = param0;
            ((sn) this).field_a = new int[var2_int];
            var19 = new int[33];
            var18 = var19;
            var17 = var18;
            var16 = var17;
            var3 = var16;
            ((sn) this).field_c = new int[8];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var2_int <= var5) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (var6 == 0) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << -var6 + 32;
                      var8 = var19[var6];
                      ((sn) this).field_a[var5] = var8;
                      if ((var7 & var8) == 0) {
                        var9 = var7 | var8;
                        var10 = var6 - 1;
                        L4: while (true) {
                          if (var10 < 1) {
                            break L3;
                          } else {
                            var11 = var19[var10];
                            if (var8 != var11) {
                              break L3;
                            } else {
                              var12 = 1 << 32 + -var10;
                              if (0 != (var11 & var12)) {
                                var3[var10] = var3[var10 - 1];
                                break L3;
                              } else {
                                var3[var10] = s.a(var12, var11);
                                var10--;
                                continue L4;
                              }
                            }
                          }
                        }
                      } else {
                        var9 = var3[-1 + var6];
                        break L3;
                      }
                    }
                    var19[var6] = var9;
                    var10 = var6 + 1;
                    L5: while (true) {
                      if (var10 > 32) {
                        var10 = 0;
                        var11 = 0;
                        L6: while (true) {
                          if (var6 <= var11) {
                            L7: {
                              if (var4 > var10) {
                                break L7;
                              } else {
                                var4 = 1 + var10;
                                break L7;
                              }
                            }
                            ((sn) this).field_c[var10] = ~var5;
                            break L2;
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if ((var12 & var8) != 0) {
                                L9: {
                                  if (0 != ((sn) this).field_c[var10]) {
                                    break L9;
                                  } else {
                                    ((sn) this).field_c[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = ((sn) this).field_c[var10];
                                break L8;
                              } else {
                                var10++;
                                break L8;
                              }
                            }
                            L10: {
                              var12 = var12 >>> 1;
                              if (var10 < ((sn) this).field_c.length) {
                                break L10;
                              } else {
                                var13 = new int[2 * ((sn) this).field_c.length];
                                var14 = 0;
                                L11: while (true) {
                                  if (var14 >= ((sn) this).field_c.length) {
                                    ((sn) this).field_c = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = ((sn) this).field_c[var14];
                                    var14++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                            var11++;
                            continue L6;
                          }
                        }
                      } else {
                        L12: {
                          if (var19[var10] != var8) {
                            break L12;
                          } else {
                            var19[var10] = var9;
                            break L12;
                          }
                        }
                        var10++;
                        continue L5;
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
          L13: {
            var2 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var2;
            stackOut_36_1 = new StringBuilder().append("sn.<init>(");
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
              break L13;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L13;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for fonts";
        field_f = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_e = "Message lobby";
        field_b = "Quit to website";
    }
}
