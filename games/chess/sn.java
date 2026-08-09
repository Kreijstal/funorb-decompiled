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
        int stackIn_7_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Chess.field_G;
        try {
          L0: {
            if (-1 == (param2 ^ -1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param2 = param2 + param4;
              var7_int = 0;
              var8 = param3;
              if (param0 >= 57) {
                L1: while (true) {
                  L2: {
                    var9 = param1[var8];
                    if (0 > var9) {
                      var7_int = this.field_c[var7_int];
                      break L2;
                    } else {
                      var7_int++;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      dupTemp$0 = this.field_c[var7_int];
                      var10 = dupTemp$0;
                      if (0 <= dupTemp$0) {
                        break L4;
                      } else {
                        incrementValue$1 = param4;
                        param4++;
                        param5[incrementValue$1] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_c[var7_int];
                        break L5;
                      }
                    }
                    L6: {
                      dupTemp$2 = this.field_c[var7_int];
                      var10 = dupTemp$2;
                      if (dupTemp$2 >= 0) {
                        break L6;
                      } else {
                        incrementValue$3 = param4;
                        param4++;
                        param5[incrementValue$3] = (byte)(var10 ^ -1);
                        if (param4 < param2) {
                          var7_int = 0;
                          break L6;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L7: {
                      if (-1 != (var9 & 32 ^ -1)) {
                        var7_int = this.field_c[var7_int];
                        break L7;
                      } else {
                        var7_int++;
                        break L7;
                      }
                    }
                    L8: {
                      dupTemp$4 = this.field_c[var7_int];
                      var10 = dupTemp$4;
                      if (-1 < (dupTemp$4 ^ -1)) {
                        incrementValue$5 = param4;
                        param4++;
                        param5[incrementValue$5] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_c[var7_int];
                        break L9;
                      } else {
                        var7_int++;
                        break L9;
                      }
                    }
                    L10: {
                      dupTemp$6 = this.field_c[var7_int];
                      var10 = dupTemp$6;
                      if (0 <= dupTemp$6) {
                        break L10;
                      } else {
                        incrementValue$7 = param4;
                        param4++;
                        param5[incrementValue$7] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_c[var7_int];
                        break L11;
                      } else {
                        var7_int++;
                        break L11;
                      }
                    }
                    L12: {
                      dupTemp$8 = this.field_c[var7_int];
                      var10 = dupTemp$8;
                      if (0 <= dupTemp$8) {
                        break L12;
                      } else {
                        incrementValue$9 = param4;
                        param4++;
                        param5[incrementValue$9] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_c[var7_int];
                        break L13;
                      } else {
                        var7_int++;
                        break L13;
                      }
                    }
                    L14: {
                      dupTemp$10 = this.field_c[var7_int];
                      var10 = dupTemp$10;
                      if (dupTemp$10 < 0) {
                        incrementValue$11 = param4;
                        param4++;
                        param5[incrementValue$11] = (byte)(var10 ^ -1);
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
                      if (-1 != (2 & var9 ^ -1)) {
                        var7_int = this.field_c[var7_int];
                        break L15;
                      } else {
                        var7_int++;
                        break L15;
                      }
                    }
                    L16: {
                      dupTemp$12 = this.field_c[var7_int];
                      var10 = dupTemp$12;
                      if (dupTemp$12 < 0) {
                        incrementValue$13 = param4;
                        param4++;
                        param5[incrementValue$13] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_c[var7_int];
                        break L17;
                      } else {
                        var7_int++;
                        break L17;
                      }
                    }
                    dupTemp$14 = this.field_c[var7_int];
                    var10 = dupTemp$14;
                    if (-1 < (dupTemp$14 ^ -1)) {
                      incrementValue$15 = param4;
                      param4++;
                      param5[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param2 > param4) {
                        var7_int = 0;
                        var8++;
                        continue L1;
                      } else {
                        break L3;
                      }
                    } else {
                      var8++;
                      continue L1;
                    }
                  }
                  stackIn_68_0 = -param3 + 1 + var8;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = -103;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var7 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var7);

            stackIn_71_1 = new StringBuilder().append("sn.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L18;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L19;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L19;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_72_0), stackIn_75_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_68_0;
          }
        }
    }

    final int a(boolean param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
        int dupTemp$0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
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
        var15 = Chess.field_G;
        try {
          L0: {
            L1: {
              var7_int = 0;
              if (param0) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var8 = param5 << 183275587;
            param1 = param1 + param2;
            L2: while (true) {
              if (param2 >= param1) {
                stackIn_17_0 = -param5 + (7 + var8 >> 1800648931);
                break L0;
              } else {
                var9 = param3[param2] & 255;
                var10 = this.field_a[var9];
                var11 = this.field_h[var9];
                if (var11 != 0) {
                  L3: {
                    var12 = var8 >> 461555747;
                    var13 = var8 & 7;
                    var7_int = var7_int & -var13 >> 2124791775;
                    var14 = var12 + (var13 - (-var11 - -1) >> -2083736509);
                    var13 += 24;
                    dupTemp$0 = s.a(var7_int, var10 >>> var13);
                    var7_int = dupTemp$0;
                    param4[var12] = (byte)dupTemp$0;
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
            stackIn_20_0 = (RuntimeException) (var7);

            stackIn_20_1 = new StringBuilder().append("sn.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ',' + param5 + ')');
        }
        return stackIn_17_0;
    }

    public static void a(byte param0) {
        if (param0 != -65) {
            field_f = (String[]) null;
        }
        field_d = null;
        field_e = null;
        field_f = null;
        field_b = null;
        field_g = null;
    }

    sn(byte[] param0) {
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
            this.field_h = param0;
            this.field_a = new int[var2_int];
            var17 = new int[33];
            var16 = var17;
            var3 = var16;
            this.field_c = new int[8];
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
                      var8 = var17[var6];
                      this.field_a[var5] = var8;
                      if ((var7 & var8) == 0) {
                        var9 = var7 | var8;
                        var10 = var6 - 1;
                        L4: while (true) {
                          if ((var10 ^ -1) > -2) {
                            break L3;
                          } else {
                            var11 = var17[var10];
                            if ((var8 ^ -1) != (var11 ^ -1)) {
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
                    var17[var6] = var9;
                    var10 = var6 + 1;
                    L5: while (true) {
                      if ((var10 ^ -1) < -33) {
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
                            this.field_c[var10] = var5 ^ -1;
                            break L2;
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if ((var12 & var8) != 0) {
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
                              } else {
                                var10++;
                                break L8;
                              }
                            }
                            L10: {
                              var12 = var12 >>> 1;
                              if (var10 < this.field_c.length) {
                                break L10;
                              } else {
                                var13 = new int[2 * this.field_c.length];
                                var14 = 0;
                                L11: while (true) {
                                  if (var14 >= this.field_c.length) {
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

            stackIn_38_1 = new StringBuilder().append("sn.<init>(");

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
          throw fk.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
    }

    static {
        field_d = "Waiting for fonts";
        field_f = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_e = "Message lobby";
        field_b = "Quit to website";
    }
}
