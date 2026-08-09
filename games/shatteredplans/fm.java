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
        int var2;
        int var3;
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
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
                    dupTemp$0 = this.field_g[var7_int];
                    var10 = dupTemp$0;
                    if (0 <= dupTemp$0) {
                      break L5;
                    } else {
                      incrementValue$1 = param5;
                      param5++;
                      param0[incrementValue$1] = (byte)(var10 ^ -1);
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
                    dupTemp$2 = this.field_g[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 >= 0) {
                      break L7;
                    } else {
                      incrementValue$3 = param5;
                      param5++;
                      param0[incrementValue$3] = (byte)(var10 ^ -1);
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
                    dupTemp$4 = this.field_g[var7_int];
                    var10 = dupTemp$4;
                    if (-1 < (dupTemp$4 ^ -1)) {
                      incrementValue$5 = param5;
                      param5++;
                      param0[incrementValue$5] = (byte)(var10 ^ -1);
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
                    dupTemp$6 = this.field_g[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 < 0) {
                      incrementValue$7 = param5;
                      param5++;
                      param0[incrementValue$7] = (byte)(var10 ^ -1);
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
                    dupTemp$8 = this.field_g[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 < 0) {
                      incrementValue$9 = param5;
                      param5++;
                      param0[incrementValue$9] = (byte)(var10 ^ -1);
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
                    dupTemp$10 = this.field_g[var7_int];
                    var10 = dupTemp$10;
                    if (-1 >= (dupTemp$10 ^ -1)) {
                      break L15;
                    } else {
                      incrementValue$11 = param5;
                      param5++;
                      param0[incrementValue$11] = (byte)(var10 ^ -1);
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
                    dupTemp$12 = this.field_g[var7_int];
                    var10 = dupTemp$12;
                    if (dupTemp$12 < 0) {
                      incrementValue$13 = param5;
                      param5++;
                      param0[incrementValue$13] = (byte)(var10 ^ -1);
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
                  dupTemp$14 = this.field_g[var7_int];
                  var10 = dupTemp$14;
                  if (0 > dupTemp$14) {
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
                stackIn_67_0 = 1 + var8 + -param4;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var7);

            stackIn_70_1 = new StringBuilder().append("fm.A(");

            if (param0 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L19;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_73_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param1 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L20;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L20;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_71_0), stackIn_74_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_67_0;
        }
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, int param5) {
        int dupTemp$0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
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
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var7_int = 0;
            var8 = param1 << 1678918051;
            param5 = param5 + param4;
            L1: while (true) {
              if (param4 >= param5) {
                if (param2 == -6309) {
                  stackIn_18_0 = (var8 - -7 >> 1529703459) + -param1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_16_0 = 112;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var9 = param0[param4] & 255;
                var10 = this.field_a[var9];
                var11 = this.field_h[var9];
                if ((var11 ^ -1) != -1) {
                  var12 = var8 >> -726862557;
                  var13 = 7 & var8;
                  var7_int = var7_int & -var13 >> 1006681023;
                  var14 = var12 + (-1 + (var11 + var13) >> 1107304547);
                  var8 = var8 + var11;
                  var13 += 24;
                  dupTemp$0 = ee.a(var7_int, var10 >>> var13);
                  var7_int = dupTemp$0;
                  param3[var12] = (byte)dupTemp$0;
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
            stackIn_21_0 = (RuntimeException) (var7);

            stackIn_21_1 = new StringBuilder().append("fm.D(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L2;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param4 + ',' + param5 + ')');
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
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
            stackIn_37_0 = (RuntimeException) (var2);

            stackIn_37_1 = new StringBuilder().append("fm.<init>(");

            if (param0 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L13;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
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
