/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ks {
    static String field_b;
    static String field_f;
    private byte[] field_a;
    private int[] field_c;
    static int field_e;
    static String field_g;
    private int[] field_d;

    public static void a(int param0) {
        field_g = null;
        field_b = null;
        field_f = null;
        if (param0 != 0) {
            field_g = (String) null;
        }
    }

    ks(byte[] param0) {
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
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
            this.field_a = param0;
            this.field_d = new int[var2_int];
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
                  if (0 == var6) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << 32 - var6;
                      var8 = var17[var6];
                      this.field_d[var5] = var8;
                      if ((var8 & var7) != 0) {
                        var9 = var3[-1 + var6];
                        break L3;
                      } else {
                        var9 = var7 | var8;
                        var10 = -1 + var6;
                        L4: while (true) {
                          if (var10 < 1) {
                            break L3;
                          } else {
                            var11 = var17[var10];
                            if (var8 != var11) {
                              break L3;
                            } else {
                              var12 = 1 << 32 + -var10;
                              if (-1 == (var11 & var12 ^ -1)) {
                                var3[var10] = hf.a(var11, var12);
                                var10--;
                                continue L4;
                              } else {
                                var3[var10] = var3[-1 + var10];
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                    var17[var6] = var9;
                    var10 = var6 - -1;
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
                                var4 = var10 + 1;
                                break L7;
                              }
                            }
                            this.field_c[var10] = var5 ^ -1;
                            break L2;
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if ((var8 & var12) == 0) {
                                var10++;
                                break L8;
                              } else {
                                L9: {
                                  if (0 != this.field_c[var10]) {
                                    break L9;
                                  } else {
                                    this.field_c[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = this.field_c[var10];
                                break L8;
                              }
                            }
                            L10: {
                              if (this.field_c.length > var10) {
                                break L10;
                              } else {
                                var13 = new int[2 * this.field_c.length];
                                var14 = 0;
                                L11: while (true) {
                                  if (this.field_c.length <= var14) {
                                    this.field_c = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = this.field_c[var14];
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
                          if ((var17[var10] ^ -1) != (var8 ^ -1)) {
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
            stackIn_38_0 = (RuntimeException) (var2);

            stackIn_38_1 = new StringBuilder().append("ks.<init>(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L13;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L13;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, boolean param5) {
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
        var11 = Kickabout.field_G;
        try {
          L0: {
            if (param2 != 0) {
              L1: {
                var7_int = 0;
                param2 = param2 + param4;
                if (!param5) {
                  break L1;
                } else {
                  this.field_a = (byte[]) null;
                  break L1;
                }
              }
              var8 = param0;
              L2: while (true) {
                L3: {
                  var9 = param3[var8];
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
                    if (dupTemp$0 < 0) {
                      incrementValue$1 = param4;
                      param4++;
                      param1[incrementValue$1] = (byte)(var10 ^ -1);
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
                    if ((var9 & 64) != 0) {
                      var7_int = this.field_c[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_c[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 < 0) {
                      incrementValue$3 = param4;
                      param4++;
                      param1[incrementValue$3] = (byte)(var10 ^ -1);
                      if (param2 > param4) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (-1 == (32 & var9 ^ -1)) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    dupTemp$4 = this.field_c[var7_int];
                    var10 = dupTemp$4;
                    if (-1 < (dupTemp$4 ^ -1)) {
                      incrementValue$5 = param4;
                      param4++;
                      param1[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param2 <= param4) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var9 & 16) != 0) {
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
                    if (dupTemp$6 < 0) {
                      incrementValue$7 = param4;
                      param4++;
                      param1[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param4 >= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (-1 == (8 & var9 ^ -1)) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    dupTemp$8 = this.field_c[var7_int];
                    var10 = dupTemp$8;
                    if (0 <= dupTemp$8) {
                      break L13;
                    } else {
                      incrementValue$9 = param4;
                      param4++;
                      param1[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param2 > param4) {
                        var7_int = 0;
                        break L13;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if (0 == (var9 & 4)) {
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
                      incrementValue$11 = param4;
                      param4++;
                      param1[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param2 > param4) {
                        var7_int = 0;
                        break L15;
                      } else {
                        return var8 + 1 - param0;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (0 != (var9 & 2)) {
                      var7_int = this.field_c[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$12 = this.field_c[var7_int];
                    var10 = dupTemp$12;
                    if (dupTemp$12 >= 0) {
                      break L17;
                    } else {
                      incrementValue$13 = param4;
                      param4++;
                      param1[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param4 >= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if ((1 & var9) != 0) {
                      var7_int = this.field_c[var7_int];
                      break L18;
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  dupTemp$14 = this.field_c[var7_int];
                  var10 = dupTemp$14;
                  if (dupTemp$14 < 0) {
                    incrementValue$15 = param4;
                    param4++;
                    param1[incrementValue$15] = (byte)(var10 ^ -1);
                    if (param2 <= param4) {
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
                stackIn_66_0 = var8 + 1 - param0;
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
            stackIn_69_0 = (RuntimeException) (var7);

            stackIn_69_1 = new StringBuilder().append("ks.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L19;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L20;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L20;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_70_0), stackIn_73_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_66_0;
        }
    }

    final static short a(int param0, int param1, int param2, int param3) {
        int var4 = -3 / ((param2 - 23) / 41);
        return (short)(param0 | (param1 << 1725180170 | param3 << 39015463));
    }

    final int a(int param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
        int dupTemp$0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
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
        var15 = Kickabout.field_G;
        try {
          L0: {
            var7_int = 0;
            var8 = param2 << -689335837;
            param1 = param1 + param5;
            L1: while (true) {
              if (param1 <= param5) {
                if (param0 == -1) {
                  stackIn_19_0 = -param2 + (var8 + 7 >> -1030715069);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_17_0 = -15;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var9 = param4[param5] & 255;
                var10 = this.field_d[var9];
                var11 = this.field_a[var9];
                if (-1 != (var11 ^ -1)) {
                  var12 = var8 >> 2042312931;
                  var13 = var8 & 7;
                  var7_int = var7_int & -var13 >> -1779341505;
                  var14 = (var13 - (-var11 + 1) >> 978944515) + var12;
                  var8 = var8 + var11;
                  var13 += 24;
                  dupTemp$0 = hf.a(var7_int, var10 >>> var13);
                  var7_int = dupTemp$0;
                  param3[var12] = (byte)dupTemp$0;
                  if (var14 > var12) {
                    L2: {
                      var13 -= 8;
                      var12++;
                      var7_int = var10 >>> var13;
                      param3[var12] = (byte)(var10 >>> var13);
                      if (var12 < var14) {
                        var13 -= 8;
                        var12++;
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
                            var7_int = var10 << -var13;
                            param3[var12] = (byte)(var10 << -var13);
                            break L2;
                          } else {
                            param5++;
                            continue L1;
                          }
                        } else {
                          param5++;
                          continue L1;
                        }
                      } else {
                        break L2;
                      }
                    }
                    param5++;
                    continue L1;
                  } else {
                    param5++;
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
          L3: {
            var7 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var7);

            stackIn_22_1 = new StringBuilder().append("ks.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          return stackIn_19_0;
        }
    }

    static {
        field_b = "+";
        field_f = "(next round starts in <%0> seconds)";
    }
}
