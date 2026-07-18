/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class m {
    static String field_g;
    static gh field_d;
    private int[] field_f;
    private byte[] field_e;
    private int[] field_c;
    static int[][] field_b;
    static String[] field_j;
    static gh field_i;
    static boolean[] field_h;
    static int field_a;

    m(byte[] param0) {
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
            ((m) this).field_e = param0;
            ((m) this).field_f = new int[var2_int];
            ((m) this).field_c = new int[8];
            var19 = new int[33];
            var18 = var19;
            var17 = var18;
            var16 = var17;
            var3 = var16;
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var2_int <= var5) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (0 == var6) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << -var6 + 32;
                      var8 = var19[var6];
                      ((m) this).field_f[var5] = var8;
                      if ((var7 & var8) == 0) {
                        var10 = -1 + var6;
                        L4: while (true) {
                          L5: {
                            if (var10 < 1) {
                              break L5;
                            } else {
                              var11 = var19[var10];
                              if (var11 != var8) {
                                break L5;
                              } else {
                                var12 = 1 << 32 + -var10;
                                if ((var11 & var12) != 0) {
                                  var3[var10] = var3[var10 - 1];
                                  break L5;
                                } else {
                                  var3[var10] = vn.a(var11, var12);
                                  var10--;
                                  continue L4;
                                }
                              }
                            }
                          }
                          var9 = var7 | var8;
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
                          if (var11 >= var6) {
                            ((m) this).field_c[var10] = ~var5;
                            if (var10 < var4) {
                              break L2;
                            } else {
                              var4 = var10 - -1;
                              break L2;
                            }
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if ((var12 & var8) == 0) {
                                var10++;
                                break L8;
                              } else {
                                L9: {
                                  if (((m) this).field_c[var10] != 0) {
                                    break L9;
                                  } else {
                                    ((m) this).field_c[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = ((m) this).field_c[var10];
                                break L8;
                              }
                            }
                            L10: {
                              if (var10 < ((m) this).field_c.length) {
                                break L10;
                              } else {
                                var13 = new int[((m) this).field_c.length * 2];
                                var14 = 0;
                                L11: while (true) {
                                  if (var14 >= ((m) this).field_c.length) {
                                    ((m) this).field_c = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = ((m) this).field_c[var14];
                                    var14++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                            var12 = var12 >>> 1;
                            var11++;
                            continue L7;
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
          L13: {
            var2 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var2;
            stackOut_36_1 = new StringBuilder().append("m.<init>(");
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
          throw ci.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        String var15 = null;
        String var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        String stackIn_21_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        String stackOut_20_0 = null;
        String stackOut_19_0 = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var21 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param2 == 7786) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              var6_int = 1021128;
              var7 = param1 - 6;
              var8 = param3 + 3;
              var9 = param0 + -6;
              var10 = 3 + param5;
              var11 = var7 * param4 / 12200;
              fk.field_d.c("<img=1>", param3, param5 - -param0, 1021128, -1);
              if (param4 <= 12200) {
                break L2;
              } else {
                var6_int = 1044724;
                var11 = var7;
                break L2;
              }
            }
            L3: {
              pb.a(var8, var10, var11, var9, var6_int);
              pb.h(param3, param5, param1, param0, 4408131);
              pb.d(6100 * param1 / 12200 + param3, param5, param0, 4408131);
              var12 = ej.field_C;
              var13 = param3 - -(param1 / 4);
              if (6100 >= param4) {
                stackOut_7_0 = 1400960;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              } else {
                stackOut_6_0 = 4210752;
                stackIn_8_0 = stackOut_6_0;
                break L3;
              }
            }
            var14 = stackIn_8_0;
            var15_int = 0;
            L4: while (true) {
              if (var15_int >= 2) {
                L5: {
                  if (oh.field_f < param3) {
                    break L5;
                  } else {
                    if (oh.field_f >= param1 + param3) {
                      break L5;
                    } else {
                      if (param5 > pi.field_c) {
                        break L5;
                      } else {
                        if (pi.field_c >= param0 + param5) {
                          break L5;
                        } else {
                          L6: {
                            if (6100 >= param4) {
                              stackOut_20_0 = ej.field_C;
                              stackIn_21_0 = stackOut_20_0;
                              break L6;
                            } else {
                              stackOut_19_0 = fi.field_z;
                              stackIn_21_0 = stackOut_19_0;
                              break L6;
                            }
                          }
                          var15 = stackIn_21_0;
                          var16 = db.a(bf.field_zb, param2 + -7846, new String[2]);
                          var17 = param3 - -(param1 / 2);
                          var18 = param5 + -18;
                          var19 = 8 + fk.field_d.c(var16);
                          var20 = 13;
                          var17 = var17 - var19 / 2;
                          pb.c(var17 - 4, var18, var19, var20, 0, 192);
                          pb.h(-4 + var17, var18, var19, var20, 1400960, 192);
                          fk.field_d.b(var16, var17, var18 + 10, 41727, -1);
                          break L5;
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                L7: {
                  pb.d(var13 + -(var7 / 4), -4 + param5, 3, var14);
                  pb.d(var7 / 4 + var13, -4 + param5, 3, var14);
                  pb.g(var13 - var7 / 4, -4 + param5, var7 / 2, var14);
                  pb.d(var13 - var7 / 4, param5 + (param0 + 1), 2, var14);
                  pb.d(var13 + var7 / 4, param5 + param0 - -1, 2, var14);
                  pb.g(var13 - var7 / 4, 3 + (param5 - -param0), var7 / 2, var14);
                  fk.field_d.a(var12, var13, -5 + param5, var14, -1);
                  if (param4 <= 6100) {
                    stackOut_12_0 = 4210752;
                    stackIn_13_0 = stackOut_12_0;
                    break L7;
                  } else {
                    stackOut_11_0 = 1400960;
                    stackIn_13_0 = stackOut_11_0;
                    break L7;
                  }
                }
                var14 = stackIn_13_0;
                var12 = fi.field_z;
                var13 = var13 + param1 / 2;
                var15_int++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var6, "m.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3, byte[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
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
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
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
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            if (param1 != 0) {
              if (param2 == 4408131) {
                param1 = param1 + param3;
                var7_int = 0;
                var8 = param5;
                L1: while (true) {
                  L2: {
                    var9 = param4[var8];
                    if (var9 >= 0) {
                      var7_int++;
                      break L2;
                    } else {
                      var7_int = ((m) this).field_c[var7_int];
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var10 = ((m) this).field_c[var7_int];
                      if (((m) this).field_c[var7_int] >= 0) {
                        break L4;
                      } else {
                        int incrementValue$8 = param3;
                        param3++;
                        param0[incrementValue$8] = (byte)(~var10);
                        if (~param1 < ~param3) {
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
                        var7_int = ((m) this).field_c[var7_int];
                        break L5;
                      }
                    }
                    L6: {
                      var10 = ((m) this).field_c[var7_int];
                      if (((m) this).field_c[var7_int] < 0) {
                        int incrementValue$9 = param3;
                        param3++;
                        param0[incrementValue$9] = (byte)(~var10);
                        if (~param1 >= ~param3) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (0 != (32 & var9)) {
                        var7_int = ((m) this).field_c[var7_int];
                        break L7;
                      } else {
                        var7_int++;
                        break L7;
                      }
                    }
                    L8: {
                      var10 = ((m) this).field_c[var7_int];
                      if (((m) this).field_c[var7_int] < 0) {
                        int incrementValue$10 = param3;
                        param3++;
                        param0[incrementValue$10] = (byte)(~var10);
                        if (param3 >= param1) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if ((var9 & 16) != 0) {
                        var7_int = ((m) this).field_c[var7_int];
                        break L9;
                      } else {
                        var7_int++;
                        break L9;
                      }
                    }
                    L10: {
                      var10 = ((m) this).field_c[var7_int];
                      if (((m) this).field_c[var7_int] < 0) {
                        int incrementValue$11 = param3;
                        param3++;
                        param0[incrementValue$11] = (byte)(~var10);
                        if (param1 <= param3) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if ((8 & var9) == 0) {
                        var7_int++;
                        break L11;
                      } else {
                        var7_int = ((m) this).field_c[var7_int];
                        break L11;
                      }
                    }
                    L12: {
                      var10 = ((m) this).field_c[var7_int];
                      if (((m) this).field_c[var7_int] >= 0) {
                        break L12;
                      } else {
                        int incrementValue$12 = param3;
                        param3++;
                        param0[incrementValue$12] = (byte)(~var10);
                        if (~param1 < ~param3) {
                          var7_int = 0;
                          break L12;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L13: {
                      if (0 != (var9 & 4)) {
                        var7_int = ((m) this).field_c[var7_int];
                        break L13;
                      } else {
                        var7_int++;
                        break L13;
                      }
                    }
                    L14: {
                      var10 = ((m) this).field_c[var7_int];
                      if (0 <= ((m) this).field_c[var7_int]) {
                        break L14;
                      } else {
                        int incrementValue$13 = param3;
                        param3++;
                        param0[incrementValue$13] = (byte)(~var10);
                        if (param1 > param3) {
                          var7_int = 0;
                          break L14;
                        } else {
                          return -param5 + (var8 + 1);
                        }
                      }
                    }
                    L15: {
                      if (0 != (2 & var9)) {
                        var7_int = ((m) this).field_c[var7_int];
                        break L15;
                      } else {
                        var7_int++;
                        break L15;
                      }
                    }
                    L16: {
                      var10 = ((m) this).field_c[var7_int];
                      if (((m) this).field_c[var7_int] >= 0) {
                        break L16;
                      } else {
                        int incrementValue$14 = param3;
                        param3++;
                        param0[incrementValue$14] = (byte)(~var10);
                        if (~param3 <= ~param1) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      if ((var9 & 1) != 0) {
                        var7_int = ((m) this).field_c[var7_int];
                        break L17;
                      } else {
                        var7_int++;
                        break L17;
                      }
                    }
                    L18: {
                      var10 = ((m) this).field_c[var7_int];
                      if (0 > ((m) this).field_c[var7_int]) {
                        int incrementValue$15 = param3;
                        param3++;
                        param0[incrementValue$15] = (byte)(~var10);
                        if (~param3 > ~param1) {
                          var7_int = 0;
                          break L18;
                        } else {
                          break L3;
                        }
                      } else {
                        break L18;
                      }
                    }
                    var8++;
                    continue L1;
                  }
                  stackOut_65_0 = -param5 + (var8 + 1);
                  stackIn_66_0 = stackOut_65_0;
                  break L0;
                }
              } else {
                stackOut_5_0 = 15;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("m.D(");
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
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
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param4 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param5 + ')');
        }
        return stackIn_66_0;
    }

    public static void a() {
        field_i = null;
        field_h = null;
        field_b = null;
        field_d = null;
        field_j = null;
        field_g = null;
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, int param5) {
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
        var15 = SteelSentinels.field_G;
        try {
          L0: {
            var7_int = 0;
            param5 = param5 + param4;
            var8 = param0 << 3;
            L1: while (true) {
              if (param5 <= param4) {
                L2: {
                  if (param2 > 114) {
                    break L2;
                  } else {
                    var16 = null;
                    int discarded$2 = ((m) this).a(-84, (byte[]) null, -104, (byte[]) null, 31, 47);
                    break L2;
                  }
                }
                stackOut_15_0 = (7 + var8 >> 3) - param0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                var9 = param3[param4] & 255;
                var10 = ((m) this).field_f[var9];
                var11 = ((m) this).field_e[var9];
                if (var11 != 0) {
                  L3: {
                    var12 = var8 >> 3;
                    var13 = 7 & var8;
                    var7_int = var7_int & -var13 >> 31;
                    var14 = (-1 + var11 + var13 >> 3) + var12;
                    var13 += 24;
                    int dupTemp$3 = vn.a(var7_int, var10 >>> var13);
                    var7_int = dupTemp$3;
                    param1[var12] = (byte)dupTemp$3;
                    if (var14 > var12) {
                      var13 -= 8;
                      var12++;
                      var7_int = var10 >>> var13;
                      param1[var12] = (byte)(var10 >>> var13);
                      if (var12 >= var14) {
                        break L3;
                      } else {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param1[var12] = (byte)(var10 >>> var13);
                        if (var12 < var14) {
                          var12++;
                          var13 -= 8;
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
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var8 = var8 + var11;
                  param4++;
                  continue L1;
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
            stackOut_17_0 = (RuntimeException) var7;
            stackOut_17_1 = new StringBuilder().append("m.B(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
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
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(',');
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
          throw ci.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_16_0;
    }

    final static boolean a(CharSequence param0) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
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
            int discarded$2 = 0;
            stackOut_0_0 = ne.a((byte) -118, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("m.C(");
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
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 127 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Yes";
    }
}
