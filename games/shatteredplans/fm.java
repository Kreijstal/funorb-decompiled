/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static int field_f;
    private int[] field_a;
    static bi[] field_d;
    static bi field_e;
    static bi field_b;
    static int[] field_c;
    private byte[] field_h;
    private int[] field_g;

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 > (es.field_m ^ -1)) {
            L1: {
              if (null == bh.field_p) {
                bj.field_K = si.a(640, fa.field_W, 0, (byte) 98, 0, 480);
                break L1;
              } else {
                bj.field_K = bh.field_p.a(0);
                vr.a(param1 + -15468, 2);
                break L1;
              }
            }
            if (null == bj.field_K) {
              var2 = 3;
              break L0;
            } else {
              re.a(bj.field_K, false);
              var2 = 2;
              break L0;
            }
          } else {
            if (w.d(true)) {
              var2 = 0;
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          }
        }
        L2: {
          if (null != bh.field_p) {
            break L2;
          } else {
            if (!cp.field_u) {
              break L2;
            } else {
              gm.a(param0, 125, var2);
              break L2;
            }
          }
        }
    }

    final int a(byte[] param0, byte[] param1, int param2, int param3, int param4, int param5) {
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
        int stackIn_3_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_66_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (0 != param2) {
              L1: {
                if (param3 == 7) {
                  break L1;
                } else {
                  field_b = (bi) null;
                  break L1;
                }
              }
              var7_int = 0;
              param2 = param2 + param5;
              var8 = param4;
              L2: while (true) {
                L3: {
                  var9 = param1[var8];
                  if ((var9 ^ -1) > -1) {
                    var7_int = this.field_g[var7_int];
                    break L3;
                  } else {
                    var7_int++;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = this.field_g[var7_int];
                    if (0 <= this.field_g[var7_int]) {
                      break L5;
                    } else {
                      incrementValue$8 = param5;
                      param5++;
                      param0[incrementValue$8] = (byte)(var10 ^ -1);
                      if (param5 >= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (-1 != (64 & var9 ^ -1)) {
                      var7_int = this.field_g[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    var10 = this.field_g[var7_int];
                    if (this.field_g[var7_int] >= 0) {
                      break L7;
                    } else {
                      incrementValue$9 = param5;
                      param5++;
                      param0[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param2 > param5) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if (-1 == (32 & var9 ^ -1)) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = this.field_g[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    var10 = this.field_g[var7_int];
                    if (-1 < (this.field_g[var7_int] ^ -1)) {
                      incrementValue$10 = param5;
                      param5++;
                      param0[incrementValue$10] = (byte)(var10 ^ -1);
                      if (param2 > param5) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (0 != (var9 & 16)) {
                      var7_int = this.field_g[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    var10 = this.field_g[var7_int];
                    if (this.field_g[var7_int] < 0) {
                      incrementValue$11 = param5;
                      param5++;
                      param0[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param5 < param2) {
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
                      var7_int = this.field_g[var7_int];
                      break L12;
                    } else {
                      var7_int++;
                      break L12;
                    }
                  }
                  L13: {
                    var10 = this.field_g[var7_int];
                    if (this.field_g[var7_int] < 0) {
                      incrementValue$12 = param5;
                      param5++;
                      param0[incrementValue$12] = (byte)(var10 ^ -1);
                      if (param5 < param2) {
                        var7_int = 0;
                        break L13;
                      } else {
                        break L4;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (-1 != (4 & var9 ^ -1)) {
                      var7_int = this.field_g[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    var10 = this.field_g[var7_int];
                    if (-1 >= (this.field_g[var7_int] ^ -1)) {
                      break L15;
                    } else {
                      incrementValue$13 = param5;
                      param5++;
                      param0[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param2 > param5) {
                        var7_int = 0;
                        break L15;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L16: {
                    if (-1 != (2 & var9 ^ -1)) {
                      var7_int = this.field_g[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    var10 = this.field_g[var7_int];
                    if (this.field_g[var7_int] < 0) {
                      incrementValue$14 = param5;
                      param5++;
                      param0[incrementValue$14] = (byte)(var10 ^ -1);
                      if (param2 > param5) {
                        var7_int = 0;
                        break L17;
                      } else {
                        return 1 + var8 + -param4;
                      }
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (0 == (var9 & 1)) {
                      var7_int++;
                      break L18;
                    } else {
                      var7_int = this.field_g[var7_int];
                      break L18;
                    }
                  }
                  var10 = this.field_g[var7_int];
                  if (0 > this.field_g[var7_int]) {
                    incrementValue$15 = param5;
                    param5++;
                    param0[incrementValue$15] = (byte)(var10 ^ -1);
                    if (param5 >= param2) {
                      break L4;
                    } else {
                      var7_int = 0;
                      var8++;
                      continue L2;
                    }
                  } else {
                    var8++;
                    continue L2;
                  }
                }
                stackOut_66_0 = 1 + var8 + -param4;
                stackIn_67_0 = stackOut_66_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) (var7);
            stackOut_68_1 = new StringBuilder().append("fm.A(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L19;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L19;
            }
          }
          L20: {
            stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L20;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L20;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_67_0;
        }
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, int param5) {
        int dupTemp$1 = 0;
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
        int stackIn_18_0 = 0;
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
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
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
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var7_int = 0;
            var8 = param1 << 1678918051;
            param5 = param5 + param4;
            L1: while (true) {
              if (param4 >= param5) {
                if (param2 == -6309) {
                  stackOut_17_0 = (var8 - -7 >> 1529703459) + -param1;
                  stackIn_18_0 = stackOut_17_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_15_0 = 112;
                  stackIn_16_0 = stackOut_15_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var9 = param0[param4] & 255;
                var10 = this.field_a[var9];
                var11 = this.field_h[var9];
                if (var11 != 0) {
                  var12 = var8 >> -726862557;
                  var13 = 7 & var8;
                  var7_int = var7_int & -var13 >> 1006681023;
                  var14 = var12 + (-1 + (var11 + var13) >> 1107304547);
                  var8 = var8 + var11;
                  var13 += 24;
                  dupTemp$1 = ee.a(var7_int, var10 >>> var13);
                  var7_int = dupTemp$1;
                  param3[var12] = (byte)dupTemp$1;
                  if (var12 < var14) {
                    var12++;
                    var13 -= 8;
                    var7_int = var10 >>> var13;
                    param3[var12] = (byte)(var10 >>> var13);
                    if (var12 < var14) {
                      var13 -= 8;
                      var12++;
                      var7_int = var10 >>> var13;
                      param3[var12] = (byte)(var10 >>> var13);
                      if (var14 > var12) {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param3[var12] = (byte)(var10 >>> var13);
                        if (var12 < var14) {
                          var13 -= 8;
                          var12++;
                          var7_int = var10 << -var13;
                          param3[var12] = (byte)(var10 << -var13);
                          param4++;
                          continue L1;
                        } else {
                          param4++;
                          continue L1;
                        }
                      } else {
                        param4++;
                        continue L1;
                      }
                    } else {
                      param4++;
                      continue L1;
                    }
                  } else {
                    param4++;
                    continue L1;
                  }
                } else {
                  throw new RuntimeException("" + var9);
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var7);
            stackOut_19_1 = new StringBuilder().append("fm.D(");
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
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L2;
            }
          }
          L3: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          return stackIn_18_0;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_d = null;
        if (param0 < 58) {
            field_c = (int[]) null;
        }
        field_b = null;
    }

    fm(byte[] param0) {
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
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            var2_int = param0.length;
            this.field_a = new int[var2_int];
            this.field_h = param0;
            this.field_g = new int[8];
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
                  if (-1 == (var6 ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << 32 - var6;
                      var8 = var17[var6];
                      this.field_a[var5] = var8;
                      if ((var8 & var7) == 0) {
                        var9 = var8 | var7;
                        var10 = -1 + var6;
                        L4: while (true) {
                          if (-2 < (var10 ^ -1)) {
                            break L3;
                          } else {
                            var11 = var17[var10];
                            if (var8 != var11) {
                              break L3;
                            } else {
                              var12 = 1 << -var10 + 32;
                              if (0 == (var11 & var12)) {
                                var3[var10] = ee.a(var12, var11);
                                var10--;
                                continue L4;
                              } else {
                                var3[var10] = var3[var10 + -1];
                                break L3;
                              }
                            }
                          }
                        }
                      } else {
                        var9 = var3[var6 + -1];
                        break L3;
                      }
                    }
                    var17[var6] = var9;
                    var10 = var6 + 1;
                    L5: while (true) {
                      if ((var10 ^ -1) < -33) {
                        var10 = 0;
                        var11 = 0;
                        L6: while (true) {
                          if (var6 <= var11) {
                            L7: {
                              if (var10 < var4) {
                                break L7;
                              } else {
                                var4 = 1 + var10;
                                break L7;
                              }
                            }
                            this.field_g[var10] = var5 ^ -1;
                            break L2;
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if (0 != (var12 & var8)) {
                                L9: {
                                  if (this.field_g[var10] != 0) {
                                    break L9;
                                  } else {
                                    this.field_g[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = this.field_g[var10];
                                break L8;
                              } else {
                                var10++;
                                break L8;
                              }
                            }
                            L10: {
                              if (var10 < this.field_g.length) {
                                break L10;
                              } else {
                                var13 = new int[this.field_g.length * 2];
                                var14 = 0;
                                L11: while (true) {
                                  if (this.field_g.length <= var14) {
                                    this.field_g = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = this.field_g[var14];
                                    var14++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                            var12 = var12 >>> 1;
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
            stackOut_35_0 = (RuntimeException) (var2);
            stackOut_35_1 = new StringBuilder().append("fm.<init>(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L13;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L13;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
    }

    static {
        field_c = new int[8192];
    }
}
