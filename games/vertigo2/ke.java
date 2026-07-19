/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ke {
    static String field_g;
    private int[] field_h;
    static String field_d;
    static String field_c;
    static r field_b;
    private byte[] field_f;
    static String field_i;
    static int[] field_e;
    private int[] field_a;

    final int a(int param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
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
        int stackIn_7_0 = 0;
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
        int stackOut_6_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_2_0 = 0;
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
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 25330) {
              if (-1 == (param2 ^ -1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                param2 = param2 + param4;
                var7_int = 0;
                var8 = param3;
                L1: while (true) {
                  L2: {
                    var9 = param5[var8];
                    if (0 <= var9) {
                      var7_int++;
                      break L2;
                    } else {
                      var7_int = this.field_a[var7_int];
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var10 = this.field_a[var7_int];
                      if (0 > this.field_a[var7_int]) {
                        incrementValue$8 = param4;
                        param4++;
                        param1[incrementValue$8] = (byte)(var10 ^ -1);
                        if (param4 < param2) {
                          var7_int = 0;
                          break L4;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if ((64 & var9) != 0) {
                        var7_int = this.field_a[var7_int];
                        break L5;
                      } else {
                        var7_int++;
                        break L5;
                      }
                    }
                    L6: {
                      var10 = this.field_a[var7_int];
                      if (this.field_a[var7_int] < 0) {
                        incrementValue$9 = param4;
                        param4++;
                        param1[incrementValue$9] = (byte)(var10 ^ -1);
                        if (param2 <= param4) {
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
                      if ((var9 & 32) == 0) {
                        var7_int++;
                        break L7;
                      } else {
                        var7_int = this.field_a[var7_int];
                        break L7;
                      }
                    }
                    L8: {
                      var10 = this.field_a[var7_int];
                      if (this.field_a[var7_int] >= 0) {
                        break L8;
                      } else {
                        incrementValue$10 = param4;
                        param4++;
                        param1[incrementValue$10] = (byte)(var10 ^ -1);
                        if (param4 < param2) {
                          var7_int = 0;
                          break L8;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L9: {
                      if (-1 != (16 & var9 ^ -1)) {
                        var7_int = this.field_a[var7_int];
                        break L9;
                      } else {
                        var7_int++;
                        break L9;
                      }
                    }
                    L10: {
                      var10 = this.field_a[var7_int];
                      if (this.field_a[var7_int] >= 0) {
                        break L10;
                      } else {
                        incrementValue$11 = param4;
                        param4++;
                        param1[incrementValue$11] = (byte)(var10 ^ -1);
                        if (param2 <= param4) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if ((8 & var9) != 0) {
                        var7_int = this.field_a[var7_int];
                        break L11;
                      } else {
                        var7_int++;
                        break L11;
                      }
                    }
                    L12: {
                      var10 = this.field_a[var7_int];
                      if (this.field_a[var7_int] < 0) {
                        incrementValue$12 = param4;
                        param4++;
                        param1[incrementValue$12] = (byte)(var10 ^ -1);
                        if (param4 < param2) {
                          var7_int = 0;
                          break L12;
                        } else {
                          return -param3 + (1 + var8);
                        }
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (-1 == (var9 & 4 ^ -1)) {
                        var7_int++;
                        break L13;
                      } else {
                        var7_int = this.field_a[var7_int];
                        break L13;
                      }
                    }
                    L14: {
                      var10 = this.field_a[var7_int];
                      if (-1 < (this.field_a[var7_int] ^ -1)) {
                        incrementValue$13 = param4;
                        param4++;
                        param1[incrementValue$13] = (byte)(var10 ^ -1);
                        if (param2 <= param4) {
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
                      if ((2 & var9) == 0) {
                        var7_int++;
                        break L15;
                      } else {
                        var7_int = this.field_a[var7_int];
                        break L15;
                      }
                    }
                    L16: {
                      var10 = this.field_a[var7_int];
                      if (this.field_a[var7_int] < 0) {
                        incrementValue$14 = param4;
                        param4++;
                        param1[incrementValue$14] = (byte)(var10 ^ -1);
                        if (param4 >= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L16;
                        }
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (0 != (var9 & 1)) {
                        var7_int = this.field_a[var7_int];
                        break L17;
                      } else {
                        var7_int++;
                        break L17;
                      }
                    }
                    L18: {
                      var10 = this.field_a[var7_int];
                      if (this.field_a[var7_int] < 0) {
                        incrementValue$15 = param4;
                        param4++;
                        param1[incrementValue$15] = (byte)(var10 ^ -1);
                        if (param2 <= param4) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L18;
                        }
                      } else {
                        break L18;
                      }
                    }
                    var8++;
                    continue L1;
                  }
                  stackOut_67_0 = -param3 + (1 + var8);
                  stackIn_68_0 = stackOut_67_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 86;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) (var7);
            stackOut_69_1 = new StringBuilder().append("ke.A(").append(param0).append(',');
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
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param5 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_68_0;
          }
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
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
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 0;
              if (param1 <= -3) {
                break L1;
              } else {
                var16 = (byte[]) null;
                discarded$2 = this.a(48, (byte[]) null, -36, 30, 56, (byte[]) null);
                break L1;
              }
            }
            param4 = param4 + param0;
            var8 = param3 << -342831133;
            L2: while (true) {
              if (param4 <= param0) {
                stackOut_17_0 = -param3 + (var8 + 7 >> 1798449059);
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                var9 = param5[param0] & 255;
                var10 = this.field_h[var9];
                var11 = this.field_f[var9];
                if (var11 != 0) {
                  L3: {
                    var12 = var8 >> 1235660291;
                    var13 = 7 & var8;
                    var7_int = var7_int & -var13 >> -1376235073;
                    var14 = var12 - -(-1 + (var11 + var13) >> 1789323139);
                    var8 = var8 + var11;
                    var13 += 24;
                    dupTemp$3 = om.a(var7_int, var10 >>> var13);
                    var7_int = dupTemp$3;
                    param2[var12] = (byte)dupTemp$3;
                    if (var14 > var12) {
                      var12++;
                      var13 -= 8;
                      var7_int = var10 >>> var13;
                      param2[var12] = (byte)(var10 >>> var13);
                      if (var12 < var14) {
                        var12++;
                        var13 -= 8;
                        var7_int = var10 >>> var13;
                        param2[var12] = (byte)(var10 >>> var13);
                        if (var12 < var14) {
                          var13 -= 8;
                          var12++;
                          var7_int = var10 >>> var13;
                          param2[var12] = (byte)(var10 >>> var13);
                          if (var14 > var12) {
                            var13 -= 8;
                            var12++;
                            var7_int = var10 << -var13;
                            param2[var12] = (byte)(var10 << -var13);
                            break L3;
                          } else {
                            param0++;
                            continue L2;
                          }
                        } else {
                          param0++;
                          continue L2;
                        }
                      } else {
                        param0++;
                        continue L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  param0++;
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
            stackOut_19_0 = (RuntimeException) (var7);
            stackOut_19_1 = new StringBuilder().append("ke.E(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          L5: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param5 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_18_0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        field_g = null;
        field_d = null;
        if (param0 != -125) {
            return;
        }
        field_i = null;
    }

    final static byte a(char param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        L0: {
          var3 = Vertigo2.field_L ? 1 : 0;
          if (param1 < -113) {
            break L0;
          } else {
            var4 = (String) null;
            ke.a((Throwable) null, (String) null, -71);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param0 <= 0) {
                break L3;
              } else {
                if (param0 < 128) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 160) {
                break L4;
              } else {
                if (255 >= param0) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            if (param0 == 8364) {
              var2 = -128;
              break L1;
            } else {
              if (8218 != param0) {
                if (param0 != 402) {
                  if (param0 != 8222) {
                    if (param0 != 8230) {
                      if (param0 != 8224) {
                        if (8225 == param0) {
                          var2 = -121;
                          break L1;
                        } else {
                          if (param0 != 710) {
                            if (param0 == 8240) {
                              var2 = -119;
                              break L1;
                            } else {
                              if (param0 == 352) {
                                var2 = -118;
                                break L1;
                              } else {
                                if (param0 != 8249) {
                                  if (338 == param0) {
                                    var2 = -116;
                                    break L1;
                                  } else {
                                    if (381 == param0) {
                                      var2 = -114;
                                      break L1;
                                    } else {
                                      if (8216 != param0) {
                                        if (param0 == 8217) {
                                          var2 = -110;
                                          break L1;
                                        } else {
                                          if (param0 != 8220) {
                                            if (param0 != 8221) {
                                              if (param0 == 8226) {
                                                var2 = -107;
                                                break L1;
                                              } else {
                                                if (param0 != 8211) {
                                                  if (8212 == param0) {
                                                    var2 = -105;
                                                    break L1;
                                                  } else {
                                                    if (param0 != 732) {
                                                      if (param0 != 8482) {
                                                        if (param0 == 353) {
                                                          var2 = -102;
                                                          break L1;
                                                        } else {
                                                          if (param0 != 8250) {
                                                            if (param0 != 339) {
                                                              if (param0 == 382) {
                                                                var2 = -98;
                                                                break L1;
                                                              } else {
                                                                if (param0 != 376) {
                                                                  var2 = 63;
                                                                  break L1;
                                                                } else {
                                                                  var2 = -97;
                                                                  break L1;
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -100;
                                                              break L1;
                                                            }
                                                          } else {
                                                            var2 = -101;
                                                            break L1;
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -103;
                                                        break L1;
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                      break L1;
                                                    }
                                                  }
                                                } else {
                                                  var2 = -106;
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              var2 = -108;
                                              break L1;
                                            }
                                          } else {
                                            var2 = -109;
                                            break L1;
                                          }
                                        }
                                      } else {
                                        var2 = -111;
                                        break L1;
                                      }
                                    }
                                  }
                                } else {
                                  var2 = -117;
                                  break L1;
                                }
                              }
                            }
                          } else {
                            var2 = -120;
                            break L1;
                          }
                        }
                      } else {
                        var2 = -122;
                        break L1;
                      }
                    } else {
                      var2 = -123;
                      break L1;
                    }
                  } else {
                    var2 = -124;
                    break L1;
                  }
                } else {
                  var2 = -125;
                  break L1;
                }
              } else {
                var2 = -126;
                break L1;
              }
            }
          }
          var2 = (byte)param0;
          break L1;
        }
        return (byte) var2;
    }

    ke(byte[] param0) {
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
            this.field_h = new int[var2_int];
            this.field_f = param0;
            var17 = new int[33];
            var16 = var17;
            var3 = var16;
            this.field_a = new int[8];
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
                      this.field_h[var5] = var8;
                      if ((var8 & var7) != 0) {
                        var9 = var3[-1 + var6];
                        break L3;
                      } else {
                        var10 = var6 + -1;
                        L4: while (true) {
                          L5: {
                            if (-2 < (var10 ^ -1)) {
                              break L5;
                            } else {
                              var11 = var17[var10];
                              if (var11 != var8) {
                                break L5;
                              } else {
                                var12 = 1 << 32 + -var10;
                                if ((var11 & var12) == 0) {
                                  var3[var10] = om.a(var11, var12);
                                  var10--;
                                  continue L4;
                                } else {
                                  var3[var10] = var3[var10 + -1];
                                  break L5;
                                }
                              }
                            }
                          }
                          var9 = var8 | var7;
                          break L3;
                        }
                      }
                    }
                    var17[var6] = var9;
                    var10 = var6 - -1;
                    L6: while (true) {
                      if ((var10 ^ -1) < -33) {
                        var10 = 0;
                        var11 = 0;
                        L7: while (true) {
                          if (var11 >= var6) {
                            L8: {
                              if (var4 > var10) {
                                break L8;
                              } else {
                                var4 = var10 - -1;
                                break L8;
                              }
                            }
                            this.field_a[var10] = var5 ^ -1;
                            break L2;
                          } else {
                            L9: {
                              var12 = -2147483648 >>> var11;
                              if (0 != (var12 & var8)) {
                                L10: {
                                  if (this.field_a[var10] != 0) {
                                    break L10;
                                  } else {
                                    this.field_a[var10] = var4;
                                    break L10;
                                  }
                                }
                                var10 = this.field_a[var10];
                                break L9;
                              } else {
                                var10++;
                                break L9;
                              }
                            }
                            L11: {
                              var12 = var12 >>> 1;
                              if (this.field_a.length > var10) {
                                break L11;
                              } else {
                                var13 = new int[this.field_a.length * 2];
                                var14 = 0;
                                L12: while (true) {
                                  if (this.field_a.length <= var14) {
                                    this.field_a = var13;
                                    break L11;
                                  } else {
                                    var13[var14] = this.field_a[var14];
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
                          if (var17[var10] != var8) {
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
            stackOut_36_0 = (RuntimeException) (var2);
            stackOut_36_1 = new StringBuilder().append("ke.<init>(");
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
              break L14;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L14;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            wk var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            jj stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            jj stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            jj stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            jj stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            jj stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            jj stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            var6 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param0 == null) {
                    break L1;
                  } else {
                    var3_ref = gb.a(param0, false);
                    break L1;
                  }
                }
                L2: {
                  if (param1 != null) {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ir.a(-8957, var3_ref);
                var7 = mr.a(":", (byte) -48, "%3a", var3_ref);
                var8 = mr.a("@", (byte) -48, "%40", var7);
                if (param2 == 0) {
                  var9 = mr.a("&", (byte) -48, "%26", var8);
                  var10 = mr.a("#", (byte) -48, "%23", var9);
                  if (null != nh.field_h) {
                    L4: {
                      stackOut_12_0 = mr.field_b;
                      stackOut_12_1 = param2 + 111;
                      stackOut_12_2 = null;
                      stackOut_12_3 = null;
                      stackOut_12_4 = nh.field_h.getCodeBase();
                      stackOut_12_5 = new StringBuilder().append("clienterror.ws?c=").append(oq.field_I).append("&u=");
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackIn_14_4 = stackOut_12_4;
                      stackIn_14_5 = stackOut_12_5;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      stackIn_13_3 = stackOut_12_3;
                      stackIn_13_4 = stackOut_12_4;
                      stackIn_13_5 = stackOut_12_5;
                      if (c.field_f != null) {
                        stackOut_14_0 = (jj) ((Object) stackIn_14_0);
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = null;
                        stackOut_14_3 = null;
                        stackOut_14_4 = (java.net.URL) ((Object) stackIn_14_4);
                        stackOut_14_5 = (StringBuilder) ((Object) stackIn_14_5);
                        stackOut_14_6 = c.field_f;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        stackIn_15_3 = stackOut_14_3;
                        stackIn_15_4 = stackOut_14_4;
                        stackIn_15_5 = stackOut_14_5;
                        stackIn_15_6 = stackOut_14_6;
                        break L4;
                      } else {
                        stackOut_13_0 = (jj) ((Object) stackIn_13_0);
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = null;
                        stackOut_13_3 = null;
                        stackOut_13_4 = (java.net.URL) ((Object) stackIn_13_4);
                        stackOut_13_5 = (StringBuilder) ((Object) stackIn_13_5);
                        stackOut_13_6 = "" + f.field_F;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        stackIn_15_3 = stackOut_13_3;
                        stackIn_15_4 = stackOut_13_4;
                        stackIn_15_5 = stackOut_13_5;
                        stackIn_15_6 = stackOut_13_6;
                        break L4;
                      }
                    }
                    var4 = ((jj) (Object) stackIn_15_0).a(stackIn_15_1, new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + jj.field_m + "&v2=" + jj.field_d + "&e=" + var10));
                    L5: while (true) {
                      if (var4.field_b != 0) {
                        L6: {
                          if ((var4.field_b ^ -1) == -2) {
                            var5 = (DataInputStream) (var4.field_d);
                            discarded$1 = var5.read();
                            var5.close();
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        um.a(true, 1L);
                        continue L5;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 2;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = "Current Medal";
        field_d = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_g = "To play a multiplayer game, please log in or create a free account.";
    }
}
