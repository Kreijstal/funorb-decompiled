/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static String field_a;
    static int field_e;
    private int[] field_d;
    static String field_g;
    static int field_c;
    private int[] field_f;
    private byte[] field_b;

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (eh.field_a > 0) {
            L1: {
              if (li.field_b == null) {
                cl.field_v = sg.a(640, lf.field_e, 0, 0, 82, 480);
                break L1;
              } else {
                cl.field_v = li.field_b.c(27134);
                p.a(2, (byte) -30);
                break L1;
              }
            }
            if (null == cl.field_v) {
              var2 = 3;
              break L0;
            } else {
              hl.a(cl.field_v, (byte) -42);
              var2 = 2;
              break L0;
            }
          } else {
            if (ph.n(-30146)) {
              var2 = 0;
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          }
        }
        L2: {
          if (param0 == 2) {
            break L2;
          } else {
            field_e = -30;
            break L2;
          }
        }
        L3: {
          if (li.field_b != null) {
            break L3;
          } else {
            if (!ij.field_e) {
              break L3;
            } else {
              bl.a(param0 + -73, var2, param1);
              break L3;
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = 0;
        field_g = null;
        field_a = null;
    }

    final int a(int param0, byte param1, int param2, byte[] param3, byte[] param4, int param5) {
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_64_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param5 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param1 > 86) {
                  break L1;
                } else {
                  jk.a(-83, true);
                  break L1;
                }
              }
              param5 = param5 + param2;
              var7_int = 0;
              var8 = param0;
              L2: while (true) {
                L3: {
                  var9 = param4[var8];
                  if (0 <= var9) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = this.field_f[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] >= 0) {
                      break L5;
                    } else {
                      incrementValue$7 = param2;
                      param2++;
                      param3[incrementValue$7] = (byte)(~var10);
                      if (param5 > param2) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if ((var9 & 64) != 0) {
                      var7_int = this.field_f[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] < 0) {
                      incrementValue$8 = param2;
                      param2++;
                      param3[incrementValue$8] = (byte)var10;
                      if (param2 < param5) {
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
                    if (-1 != (32 & var9)) {
                      var7_int = this.field_f[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] >= 0) {
                      break L9;
                    } else {
                      incrementValue$9 = param2;
                      param2++;
                      param3[incrementValue$9] = (byte)(~var10);
                      if (param5 <= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if ((16 & var9) == -1) {
                      var7_int++;
                      break L10;
                    } else {
                      var7_int = this.field_f[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    var10 = this.field_f[var7_int];
                    if (-1 > this.field_f[var7_int]) {
                      incrementValue$10 = param2;
                      param2++;
                      param3[incrementValue$10] = (byte)(~var10);
                      if (param5 > param2) {
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
                    if (0 != (8 & var9)) {
                      var7_int = this.field_f[var7_int];
                      break L12;
                    } else {
                      var7_int++;
                      break L12;
                    }
                  }
                  L13: {
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] < 0) {
                      incrementValue$11 = param2;
                      param2++;
                      param3[incrementValue$11] = (byte)(~var10);
                      if (param5 > param2) {
                        var7_int = 0;
                        break L13;
                      } else {
                        return var8 - (-1 - -param0);
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if ((4 & var9) == 0) {
                      var7_int++;
                      break L14;
                    } else {
                      var7_int = this.field_f[var7_int];
                      break L14;
                    }
                  }
                  L15: {
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] < 0) {
                      incrementValue$12 = param2;
                      param2++;
                      param3[incrementValue$12] = (byte)var10;
                      if (param5 <= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (-1 == (2 & var9)) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = this.field_f[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    var10 = this.field_f[var7_int];
                    if (0 <= this.field_f[var7_int]) {
                      break L17;
                    } else {
                      incrementValue$13 = param2;
                      param2++;
                      param3[incrementValue$13] = (byte)var10;
                      if (param2 >= param5) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if (-1 != (1 & var9)) {
                      var7_int = this.field_f[var7_int];
                      break L18;
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  L19: {
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] >= 0) {
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackOut_64_0 = var8 - (-1 - -param0);
                stackIn_65_0 = stackOut_64_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) (var7);
            stackOut_66_1 = new StringBuilder().append("jk.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param3 == null) {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L20;
            } else {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L20;
            }
          }
          L21: {
            stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param4 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L21;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L21;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param5 + ')');
        }
        return stackIn_65_0;
    }

    final int a(byte[] param0, byte[] param1, int param2, int param3, int param4, int param5) {
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
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == 8) {
                break L1;
              } else {
                field_c = -58;
                break L1;
              }
            }
            var7_int = 0;
            var8 = param3 << 3;
            param2 = param2 + param4;
            L2: while (true) {
              if (param2 <= param4) {
                stackOut_16_0 = -param3 + (var8 + 7 >> 3);
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                var9 = 255 & param1[param4];
                var10 = this.field_d[var9];
                var11 = this.field_b[var9];
                if (var11 == 0) {
                  throw new RuntimeException("" + var9);
                } else {
                  L3: {
                    var12 = var8 >> 3;
                    var13 = var8 & 7;
                    var7_int = var7_int & -var13 >> 31;
                    var14 = var12 - -(var13 + (var11 + -1) >> 3);
                    var13 += 24;
                    dupTemp$1 = de.b(var7_int, var10 >>> var13);
                    var7_int = dupTemp$1;
                    param0[var12] = (byte)dupTemp$1;
                    if (var14 > var12) {
                      var12++;
                      var13 -= 8;
                      var7_int = var10 >>> var13;
                      param0[var12] = (byte)(var10 >>> var13);
                      if (var12 >= var14) {
                        break L3;
                      } else {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param0[var12] = (byte)(var10 >>> var13);
                        if (var12 < var14) {
                          var12++;
                          var13 -= 8;
                          var7_int = var10 >>> var13;
                          param0[var12] = (byte)(var10 >>> var13);
                          if (var14 <= var12) {
                            break L3;
                          } else {
                            var12++;
                            var13 -= 8;
                            var7_int = var10 << -var13;
                            param0[var12] = (byte)(var10 << -var13);
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
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var7);
            stackOut_18_1 = new StringBuilder().append("jk.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          L5: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_17_0;
    }

    jk(byte[] param0) {
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
            this.field_b = param0;
            this.field_d = new int[var2_int];
            this.field_f = new int[8];
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
                  if (0 == var6) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << -var6 + 32;
                      var8 = var19[var6];
                      this.field_d[var5] = var8;
                      if ((var8 & var7) == 0) {
                        var9 = var8 | var7;
                        var10 = -1 + var6;
                        L4: while (true) {
                          if (var10 < 1) {
                            break L3;
                          } else {
                            var11 = var19[var10];
                            if (var8 != var11) {
                              break L3;
                            } else {
                              var12 = 1 << 32 + -var10;
                              if ((var12 & var11) != 0) {
                                var3[var10] = var3[var10 - 1];
                                break L3;
                              } else {
                                var3[var10] = de.b(var11, var12);
                                var10--;
                                continue L4;
                              }
                            }
                          }
                        }
                      } else {
                        var9 = var3[var6 - 1];
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
                              if (var10 < var4) {
                                break L7;
                              } else {
                                var4 = 1 + var10;
                                break L7;
                              }
                            }
                            this.field_f[var10] = ~var5;
                            break L2;
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if ((var12 & var8) == 0) {
                                var10++;
                                break L8;
                              } else {
                                L9: {
                                  if (this.field_f[var10] != 0) {
                                    break L9;
                                  } else {
                                    this.field_f[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = this.field_f[var10];
                                break L8;
                              }
                            }
                            L10: {
                              var12 = var12 >>> 1;
                              if (this.field_f.length > var10) {
                                break L10;
                              } else {
                                var13 = new int[2 * this.field_f.length];
                                var14 = 0;
                                L11: while (true) {
                                  if (var14 >= this.field_f.length) {
                                    this.field_f = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = this.field_f[var14];
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
                          if (var8 != var19[var10]) {
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
            stackOut_36_0 = (RuntimeException) (var2);
            stackOut_36_1 = new StringBuilder().append("jk.<init>(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L13;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L13;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
    }

    static {
        field_g = "Names can only contain letters, numbers, spaces and underscores";
    }
}
