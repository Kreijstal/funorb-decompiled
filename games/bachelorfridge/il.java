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
        int stackIn_4_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            if (0 == param0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param4 == -69) {
                  break L1;
                } else {
                  field_a = (ee) null;
                  break L1;
                }
              }
              var7_int = 0;
              param0 = param0 + param2;
              var8 = param5;
              L2: while (true) {
                L3: {
                  var9 = param1[var8];
                  if (-1 < (var9 ^ -1)) {
                    var7_int = this.field_c[var7_int];
                    break L3;
                  } else {
                    var7_int++;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    dupTemp$0 = this.field_c[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 >= 0) {
                      break L5;
                    } else {
                      incrementValue$1 = param2;
                      param2++;
                      param3[incrementValue$1] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_c[var7_int];
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_c[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 >= 0) {
                      break L7;
                    } else {
                      incrementValue$3 = param2;
                      param2++;
                      param3[incrementValue$3] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_c[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    dupTemp$4 = this.field_c[var7_int];
                    var10 = dupTemp$4;
                    if (0 <= dupTemp$4) {
                      break L9;
                    } else {
                      incrementValue$5 = param2;
                      param2++;
                      param3[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param2 < param0) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    if (-1 != (var9 & 16 ^ -1)) {
                      var7_int = this.field_c[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    dupTemp$6 = this.field_c[var7_int];
                    var10 = dupTemp$6;
                    if (0 <= dupTemp$6) {
                      break L11;
                    } else {
                      incrementValue$7 = param2;
                      param2++;
                      param3[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param0 <= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (-1 != (var9 & 8 ^ -1)) {
                      var7_int = this.field_c[var7_int];
                      break L12;
                    } else {
                      var7_int++;
                      break L12;
                    }
                  }
                  L13: {
                    dupTemp$8 = this.field_c[var7_int];
                    var10 = dupTemp$8;
                    if (0 <= dupTemp$8) {
                      break L13;
                    } else {
                      incrementValue$9 = param2;
                      param2++;
                      param3[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param2 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if ((4 & var9) == 0) {
                      var7_int++;
                      break L14;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L14;
                    }
                  }
                  L15: {
                    dupTemp$10 = this.field_c[var7_int];
                    var10 = dupTemp$10;
                    if (-1 < (dupTemp$10 ^ -1)) {
                      incrementValue$11 = param2;
                      param2++;
                      param3[incrementValue$11] = (byte)(var10 ^ -1);
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
                    if (-1 == (var9 & 2 ^ -1)) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$12 = this.field_c[var7_int];
                    var10 = dupTemp$12;
                    if (-1 < (dupTemp$12 ^ -1)) {
                      incrementValue$13 = param2;
                      param2++;
                      param3[incrementValue$13] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_c[var7_int];
                      break L18;
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  L19: {
                    dupTemp$14 = this.field_c[var7_int];
                    var10 = dupTemp$14;
                    if (0 > dupTemp$14) {
                      incrementValue$15 = param2;
                      param2++;
                      param3[incrementValue$15] = (byte)(var10 ^ -1);
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
                stackIn_66_0 = -param5 + 1 + var8;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var7);

            stackIn_69_1 = new StringBuilder().append("il.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L20;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L21;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L21;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_70_0), stackIn_73_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_66_0;
        }
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, int param5) {
        int dupTemp$0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
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
        var15 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var7_int = 0;
              param1 = param1 + param4;
              var8 = param5 << 204726723;
              if (param2 == 20857) {
                break L1;
              } else {
                this.field_f = (int[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (param1 <= param4) {
                stackIn_16_0 = -param5 + (7 + var8 >> 260156451);
                break L0;
              } else {
                var9 = param0[param4] & 255;
                var10 = this.field_f[var9];
                var11 = this.field_d[var9];
                if (var11 == 0) {
                  throw new RuntimeException("" + var9);
                } else {
                  L3: {
                    var12 = var8 >> 106662851;
                    var13 = 7 & var8;
                    var7_int = var7_int & -var13 >> -2012031777;
                    var14 = (-1 + (var11 + var13) >> -617252093) + var12;
                    var13 += 24;
                    dupTemp$0 = mp.a(var7_int, var10 >>> var13);
                    var7_int = dupTemp$0;
                    param3[var12] = (byte)dupTemp$0;
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
            stackIn_19_0 = (RuntimeException) (var7);

            stackIn_19_1 = new StringBuilder().append("il.B(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_16_0;
    }

    il(byte[] param0) {
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
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
            this.field_d = param0;
            this.field_f = new int[var2_int];
            this.field_c = new int[8];
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
                      this.field_f[var5] = var8;
                      if ((var8 & var7) != 0) {
                        var9 = var3[var6 + -1];
                        break L3;
                      } else {
                        var10 = var6 - 1;
                        L4: while (true) {
                          L5: {
                            if ((var10 ^ -1) > -2) {
                              break L5;
                            } else {
                              var11 = var17[var10];
                              if ((var8 ^ -1) != (var11 ^ -1)) {
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
                    var17[var6] = var9;
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
                            this.field_c[var10] = var5 ^ -1;
                            break L2;
                          } else {
                            L9: {
                              var12 = -2147483648 >>> var11;
                              if ((var12 & var8 ^ -1) == -1) {
                                var10++;
                                break L9;
                              } else {
                                L10: {
                                  if (this.field_c[var10] != 0) {
                                    break L10;
                                  } else {
                                    this.field_c[var10] = var4;
                                    break L10;
                                  }
                                }
                                var10 = this.field_c[var10];
                                break L9;
                              }
                            }
                            L11: {
                              var12 = var12 >>> 1;
                              if (var10 < this.field_c.length) {
                                break L11;
                              } else {
                                var13 = new int[this.field_c.length * 2];
                                var14 = 0;
                                L12: while (true) {
                                  if (this.field_c.length <= var14) {
                                    this.field_c = var13;
                                    break L11;
                                  } else {
                                    var13[var14] = this.field_c[var14];
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
                          if ((var8 ^ -1) != (var17[var10] ^ -1)) {
                            break L13;
                          } else {
                            var17[var10] = var9;
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
            stackIn_39_0 = (RuntimeException) (var2);

            stackIn_39_1 = new StringBuilder().append("il.<init>(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L14;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L14;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
    }

    static {
        field_e = "<%0> has joined your game.";
    }
}
