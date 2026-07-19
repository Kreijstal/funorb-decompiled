/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dqb {
    private int[] field_d;
    private byte[] field_a;
    static String field_c;
    private int[] field_b;

    final int b(int param0, byte[] param1, byte[] param2, int param3, int param4, int param5) {
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
        byte[] var16 = null;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var15 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var7_int = 0;
              if (param3 > 1) {
                break L1;
              } else {
                var16 = (byte[]) null;
                discarded$2 = this.a(15, (byte[]) null, (byte[]) null, 34, 99, 31);
                break L1;
              }
            }
            param0 = param0 + param5;
            var8 = param4 << 1075936547;
            L2: while (true) {
              if (param5 >= param0) {
                stackOut_18_0 = (7 + var8 >> -1426126653) + -param4;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                var9 = 255 & param1[param5];
                var10 = this.field_d[var9];
                var11 = this.field_a[var9];
                if (var11 == 0) {
                  throw new RuntimeException("" + var9);
                } else {
                  L3: {
                    var12 = var8 >> 239484419;
                    var13 = var8 & 7;
                    var7_int = var7_int & -var13 >> -1832139457;
                    var14 = var12 + (var11 + (var13 - 1) >> -1629720925);
                    var8 = var8 + var11;
                    var13 += 24;
                    dupTemp$3 = knb.a(var7_int, var10 >>> var13);
                    var7_int = dupTemp$3;
                    param2[var12] = (byte)dupTemp$3;
                    if (var14 > var12) {
                      var13 -= 8;
                      var12++;
                      var7_int = var10 >>> var13;
                      param2[var12] = (byte)(var10 >>> var13);
                      if (var14 > var12) {
                        var12++;
                        var13 -= 8;
                        var7_int = var10 >>> var13;
                        param2[var12] = (byte)(var10 >>> var13);
                        if (var14 > var12) {
                          var12++;
                          var13 -= 8;
                          var7_int = var10 >>> var13;
                          param2[var12] = (byte)(var10 >>> var13);
                          if (var12 < var14) {
                            var12++;
                            var13 -= 8;
                            var7_int = var10 << -var13;
                            param2[var12] = (byte)(var10 << -var13);
                            break L3;
                          } else {
                            param5++;
                            continue L2;
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        param5++;
                        continue L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  param5++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var7);
            stackOut_20_1 = new StringBuilder().append("dqb.A(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          L5: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_19_0;
    }

    final static byte[] a(byte param0, String param1) {
        byte[] discarded$2 = null;
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
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
              if (param0 < -1) {
                break L1;
              } else {
                var3 = (String) null;
                discarded$2 = dqb.a((byte) 2, (String) null);
                break L1;
              }
            }
            stackOut_2_0 = cja.field_j.a(param1, true, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("dqb.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    dqb(byte[] param0) {
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
            this.field_a = param0;
            this.field_d = new int[var2_int];
            this.field_b = new int[8];
            var17 = new int[33];
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
                  if (0 == var6) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << 32 - var6;
                      var8 = var17[var6];
                      this.field_d[var5] = var8;
                      if (0 != (var8 & var7)) {
                        var9 = var3[var6 - 1];
                        break L3;
                      } else {
                        var9 = var8 | var7;
                        var10 = -1 + var6;
                        L4: while (true) {
                          if (-2 < (var10 ^ -1)) {
                            break L3;
                          } else {
                            var11 = var17[var10];
                            if (var11 != var8) {
                              break L3;
                            } else {
                              var12 = 1 << -var10 + 32;
                              if (-1 != (var11 & var12 ^ -1)) {
                                var3[var10] = var3[var10 + -1];
                                break L3;
                              } else {
                                var3[var10] = knb.a(var11, var12);
                                var10--;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    var17[var6] = var9;
                    var10 = 1 + var6;
                    L5: while (true) {
                      if (32 < var10) {
                        var10 = 0;
                        var11 = 0;
                        L6: while (true) {
                          if (var6 <= var11) {
                            L7: {
                              if (var10 < var4) {
                                break L7;
                              } else {
                                var4 = var10 - -1;
                                break L7;
                              }
                            }
                            this.field_b[var10] = var5 ^ -1;
                            break L2;
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if (0 == (var12 & var8)) {
                                var10++;
                                break L8;
                              } else {
                                L9: {
                                  if (-1 != (this.field_b[var10] ^ -1)) {
                                    break L9;
                                  } else {
                                    this.field_b[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = this.field_b[var10];
                                break L8;
                              }
                            }
                            L10: {
                              var12 = var12 >>> 1;
                              if (this.field_b.length > var10) {
                                break L10;
                              } else {
                                var13 = new int[this.field_b.length * 2];
                                var14 = 0;
                                L11: while (true) {
                                  if (this.field_b.length <= var14) {
                                    this.field_b = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = this.field_b[var14];
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
                          if (var8 != var17[var10]) {
                            break L12;
                          } else {
                            var17[var10] = var9;
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
            stackOut_37_0 = (RuntimeException) (var2);
            stackOut_37_1 = new StringBuilder().append("dqb.<init>(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L13;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L13;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
    }

    public static void a(int param0) {
        byte[] discarded$0 = null;
        field_c = null;
        if (param0 != 15060) {
            String var2 = (String) null;
            discarded$0 = dqb.a((byte) 32, (String) null);
        }
    }

    final int a(int param0, byte[] param1, byte[] param2, int param3, int param4, int param5) {
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
        int stackIn_4_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_67_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            if (param3 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var7_int = param4;
              param3 = param3 + param0;
              var8 = param5;
              L1: while (true) {
                L2: {
                  var9 = param1[var8];
                  if (-1 >= (var9 ^ -1)) {
                    var7_int++;
                    break L2;
                  } else {
                    var7_int = this.field_b[var7_int];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] < 0) {
                      incrementValue$8 = param0;
                      param0++;
                      param2[incrementValue$8] = (byte)(var10 ^ -1);
                      if (param3 <= param0) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((64 & var9) == 0) {
                      var7_int++;
                      break L5;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L5;
                    }
                  }
                  L6: {
                    var10 = this.field_b[var7_int];
                    if (-1 < (this.field_b[var7_int] ^ -1)) {
                      incrementValue$9 = param0;
                      param0++;
                      param2[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param3 > param0) {
                        var7_int = 0;
                        break L6;
                      } else {
                        break L3;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((32 & var9) != 0) {
                      var7_int = this.field_b[var7_int];
                      break L7;
                    } else {
                      var7_int++;
                      break L7;
                    }
                  }
                  L8: {
                    var10 = this.field_b[var7_int];
                    if (-1 < (this.field_b[var7_int] ^ -1)) {
                      incrementValue$10 = param0;
                      param0++;
                      param2[incrementValue$10] = (byte)(var10 ^ -1);
                      if (param3 > param0) {
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
                    if (-1 != (var9 & 16 ^ -1)) {
                      var7_int = this.field_b[var7_int];
                      break L9;
                    } else {
                      var7_int++;
                      break L9;
                    }
                  }
                  L10: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      break L10;
                    } else {
                      incrementValue$11 = param0;
                      param0++;
                      param2[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param3 <= param0) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (0 == (8 & var9)) {
                      var7_int++;
                      break L11;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L11;
                    }
                  }
                  L12: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] < 0) {
                      incrementValue$12 = param0;
                      param0++;
                      param2[incrementValue$12] = (byte)(var10 ^ -1);
                      if (param0 < param3) {
                        var7_int = 0;
                        break L12;
                      } else {
                        break L3;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (-1 != (4 & var9 ^ -1)) {
                      var7_int = this.field_b[var7_int];
                      break L13;
                    } else {
                      var7_int++;
                      break L13;
                    }
                  }
                  L14: {
                    var10 = this.field_b[var7_int];
                    if (-1 < (this.field_b[var7_int] ^ -1)) {
                      incrementValue$13 = param0;
                      param0++;
                      param2[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param0 < param3) {
                        var7_int = 0;
                        break L14;
                      } else {
                        break L3;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if ((var9 & 2) == 0) {
                      var7_int++;
                      break L15;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L15;
                    }
                  }
                  L16: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      break L16;
                    } else {
                      incrementValue$14 = param0;
                      param0++;
                      param2[incrementValue$14] = (byte)(var10 ^ -1);
                      if (param3 > param0) {
                        var7_int = 0;
                        break L16;
                      } else {
                        return var8 + 1 - param5;
                      }
                    }
                  }
                  L17: {
                    if (-1 != (var9 & 1 ^ -1)) {
                      var7_int = this.field_b[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  L18: {
                    var10 = this.field_b[var7_int];
                    if (0 > this.field_b[var7_int]) {
                      incrementValue$15 = param0;
                      param0++;
                      param2[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param0 < param3) {
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
                stackOut_67_0 = var8 + 1 - param5;
                stackIn_68_0 = stackOut_67_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) (var7);
            stackOut_69_1 = new StringBuilder().append("dqb.B(").append(param0).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param1 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L19;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L19;
            }
          }
          L20: {
            stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param2 == null) {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L20;
            } else {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L20;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_68_0;
        }
    }

    static {
        field_c = "Grappling hook launcher";
    }
}
