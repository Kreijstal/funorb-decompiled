/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ta {
    private int field_e;
    static long[] field_d;
    private v field_f;
    private v field_a;
    private int field_c;
    static String[] field_b;

    final byte[] a(int param0, byte param1) {
        try {
            byte[] discarded$2 = null;
            int incrementValue$3 = 0;
            Object var3 = null;
            IOException var4 = null;
            int var4_int = 0;
            int var5 = 0;
            byte[] var6 = null;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            int var16 = 0;
            Throwable var17 = null;
            int var18 = 0;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_37_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_43_0 = null;
            Object stackIn_44_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_42_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_36_0 = null;
            Object stackOut_37_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_54_0 = null;
            var18 = BachelorFridge.field_y;
            var3 = this.field_f;
            synchronized (var3) {
              try {
                L0: {
                  if ((this.field_a.b(-1) ^ -1L) <= ((long)(6 * param0 + 6) ^ -1L)) {
                    this.field_a.a((long)(6 * param0), (byte) -91);
                    this.field_a.a(6, 0, param1 ^ 4, rda.field_b);
                    var4_int = (rda.field_b[0] << 1905255472 & 16711680) + ((rda.field_b[1] & 255) << -645022008) - -(255 & rda.field_b[2]);
                    var5 = ((255 & rda.field_b[3]) << 967554032) + (65280 & rda.field_b[4] << -74878616) + (255 & rda.field_b[5]);
                    if (var4_int >= 0) {
                      if (this.field_e >= var4_int) {
                        if (0 < var5) {
                          if (this.field_f.b(-1) / 520L >= (long)var5) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var4_int <= var7) {
                                L2: {
                                  if (param1 == -5) {
                                    break L2;
                                  } else {
                                    discarded$2 = this.a(42, (byte) -46);
                                    break L2;
                                  }
                                }
                                stackOut_51_0 = (byte[]) (var6);
                                stackIn_52_0 = stackOut_51_0;
                                stackOut_52_0 = (byte[]) ((Object) stackIn_52_0);
                                stackIn_53_0 = stackOut_52_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L3: {
                                    this.field_f.a((long)(var5 * 520), (byte) -108);
                                    var9 = var4_int + -var7;
                                    if (65535 >= param0) {
                                      L4: {
                                        if (-513 <= (var9 ^ -1)) {
                                          break L4;
                                        } else {
                                          var9 = 512;
                                          break L4;
                                        }
                                      }
                                      var14 = 8;
                                      this.field_f.a(var14 + var9, 0, -1, rda.field_b);
                                      var12 = (rda.field_b[4] << -693237200 & 16711680) + ((255 & rda.field_b[5]) << 2079680360) + (255 & rda.field_b[6]);
                                      var10 = ((255 & rda.field_b[0]) << 464765192) - -(rda.field_b[1] & 255);
                                      var11 = ((rda.field_b[2] & 255) << -1480548536) - -(255 & rda.field_b[3]);
                                      var13 = rda.field_b[7] & 255;
                                      break L3;
                                    } else {
                                      L5: {
                                        if (510 < var9) {
                                          var9 = 510;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      var14 = 10;
                                      this.field_f.a(var9 + var14, 0, -1, rda.field_b);
                                      var12 = ((rda.field_b[6] & 255) << -559037968) + ((255 & rda.field_b[7]) << -1046518296) - -(rda.field_b[8] & 255);
                                      var11 = ((255 & rda.field_b[4]) << -1270413336) - -(rda.field_b[5] & 255);
                                      var13 = 255 & rda.field_b[9];
                                      var10 = (255 & rda.field_b[3]) + ((rda.field_b[0] & 255) << 961612760) + ((rda.field_b[1] << 78500528 & 16711680) + ((rda.field_b[2] & 255) << 1522273032));
                                      break L3;
                                    }
                                  }
                                  if (param0 == var10) {
                                    if (var8 == var11) {
                                      if (var13 == this.field_c) {
                                        if (0 <= var12) {
                                          if ((long)var12 <= this.field_f.b(-1) / 520L) {
                                            var15 = var14 + var9;
                                            var8++;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var16 >= var15) {
                                                var5 = var12;
                                                continue L1;
                                              } else {
                                                incrementValue$3 = var7;
                                                var7++;
                                                var6[incrementValue$3] = rda.field_b[var16];
                                                var16++;
                                                continue L6;
                                              }
                                            }
                                          } else {
                                            stackOut_42_0 = null;
                                            stackIn_43_0 = stackOut_42_0;
                                            stackOut_43_0 = stackIn_43_0;
                                            stackIn_44_0 = stackOut_43_0;
                                            decompiledRegionSelector0 = 3;
                                            break L0;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        stackOut_36_0 = null;
                                        stackIn_37_0 = stackOut_36_0;
                                        stackOut_37_0 = stackIn_37_0;
                                        stackIn_38_0 = stackOut_37_0;
                                        decompiledRegionSelector0 = 2;
                                        break L0;
                                      }
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    return null;
                                  }
                                } else {
                                  stackOut_20_0 = null;
                                  stackIn_21_0 = stackOut_20_0;
                                  stackOut_21_0 = stackIn_21_0;
                                  stackIn_22_0 = stackOut_21_0;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            stackOut_14_0 = null;
                            stackIn_15_0 = stackOut_14_0;
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_54_0 = null;
                stackIn_55_0 = stackOut_54_0;
                return (byte[]) ((Object) stackIn_55_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_16_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_22_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_38_0);
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return (byte[]) ((Object) stackIn_44_0);
                    } else {
                      return stackIn_53_0;
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        pp discarded$0 = null;
        field_b = null;
        if (param0 != 255) {
            lu var2 = (lu) null;
            discarded$0 = ta.a(-123, (lu) null);
        }
        field_d = null;
    }

    final static pp a(int param0, lu param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        pea stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        pea stackOut_0_0 = null;
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
            var2_int = 80 % ((-13 - param0) / 38);
            stackOut_0_0 = new pea(qi.a(param1, (byte) 24), param1.b(16711935), param1.b(16711935));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("ta.C(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return (pp) ((Object) stackIn_1_0);
    }

    final boolean a(int param0, byte[] param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var5 = this.field_f;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param3 > param0) {
                    break L2;
                  } else {
                    if (param0 > this.field_e) {
                      break L2;
                    } else {
                      L3: {
                        var6 = this.a(param2, true, -15, param0, param1) ? 1 : 0;
                        if (var6 != 0) {
                          break L3;
                        } else {
                          var6 = this.a(param2, false, -31, param0, param1) ? 1 : 0;
                          break L3;
                        }
                      }
                      stackOut_7_0 = var6;
                      stackIn_8_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                throw new IllegalArgumentException();
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5_ref);
            stackOut_11_1 = new StringBuilder().append("ta.D(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_8_0 != 0;
    }

    public final String toString() {
        return "" + this.field_c;
    }

    private final boolean a(int param0, boolean param1, int param2, int param3, byte[] param4) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            Object var7 = null;
            Object var7_ref = null;
            IOException var8 = null;
            int var8_int = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            EOFException var15 = null;
            Throwable var16 = null;
            int var17 = 0;
            int stackIn_5_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_65_0 = 0;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            String stackIn_71_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_64_0 = 0;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            String stackOut_70_2 = null;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            String stackOut_69_2 = null;
            var17 = BachelorFridge.field_y;
            try {
              var6_int = -119 % ((param2 - -91) / 35);
              var7_ref = this.field_f;
              synchronized (var7_ref) {
                try {
                  L0: {
                    L1: {
                      if (!param1) {
                        var8_int = (int)((519L + this.field_f.b(-1)) / 520L);
                        if (0 == var8_int) {
                          var8_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if ((this.field_a.b(-1) ^ -1L) <= ((long)(6 * param0 + 6) ^ -1L)) {
                          L2: {
                            this.field_a.a((long)(param0 * 6), (byte) -121);
                            this.field_a.a(6, 0, -1, rda.field_b);
                            var8_int = (rda.field_b[3] << 333984464 & 16711680) + ((rda.field_b[4] & 255) << -803058168) - -(rda.field_b[5] & 255);
                            if (var8_int <= 0) {
                              break L2;
                            } else {
                              if (this.field_f.b(-1) / 520L < (long)var8_int) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackOut_11_0 = stackIn_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        } else {
                          stackOut_4_0 = 0;
                          stackIn_5_0 = stackOut_4_0;
                          stackOut_5_0 = stackIn_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        }
                      }
                    }
                    rda.field_b[4] = (byte)(var8_int >> -222118136);
                    rda.field_b[2] = (byte)param3;
                    rda.field_b[3] = (byte)(var8_int >> -1580664688);
                    rda.field_b[0] = (byte)(param3 >> -1870104016);
                    rda.field_b[1] = (byte)(param3 >> -176817304);
                    rda.field_b[5] = (byte)var8_int;
                    this.field_a.a((long)(6 * param0), (byte) -124);
                    this.field_a.a(-117, 0, rda.field_b, 6);
                    var9 = 0;
                    var10 = 0;
                    L3: while (true) {
                      L4: {
                        if (var9 >= param3) {
                          break L4;
                        } else {
                          L5: {
                            var11 = 0;
                            if (!param1) {
                              break L5;
                            } else {
                              L6: {
                                this.field_f.a((long)(var8_int * 520), (byte) -91);
                                if ((param0 ^ -1) >= -65536) {
                                  try {
                                    L7: {
                                      this.field_f.a(8, 0, -1, rda.field_b);
                                      decompiledRegionSelector0 = 0;
                                      break L7;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L8: {
                                      var15 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L8;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var14 = 255 & rda.field_b[7];
                                    var12 = ((rda.field_b[0] & 255) << -352486232) + (rda.field_b[1] & 255);
                                    var13 = (rda.field_b[2] << -1382686584 & 65280) - -(255 & rda.field_b[3]);
                                    var11 = ((rda.field_b[5] & 255) << 1069658056) + (rda.field_b[4] << 70375920 & 16711680) - -(255 & rda.field_b[6]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      this.field_f.a(10, 0, -1, rda.field_b);
                                      decompiledRegionSelector1 = 0;
                                      break L9;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L10: {
                                      var15 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L10;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var11 = (16711680 & rda.field_b[6] << 994267888) - (-(65280 & rda.field_b[7] << -1590915160) + -(rda.field_b[8] & 255));
                                    var12 = (rda.field_b[3] & 255) + (((rda.field_b[2] & 255) << -381546200) + (16711680 & rda.field_b[1] << 683266864) + ((rda.field_b[0] & 255) << -1140410216));
                                    var13 = (65280 & rda.field_b[4] << 1328483432) - -(255 & rda.field_b[5]);
                                    var14 = rda.field_b[9] & 255;
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (var12 != param0) {
                                  break L11;
                                } else {
                                  if (var13 != var10) {
                                    break L11;
                                  } else {
                                    if (this.field_c != var14) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if ((var11 ^ -1) > -1) {
                                          break L12;
                                        } else {
                                          if ((this.field_f.b(-1) / 520L ^ -1L) > ((long)var11 ^ -1L)) {
                                            break L12;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      stackOut_39_0 = 0;
                                      stackIn_40_0 = stackOut_39_0;
                                      stackOut_40_0 = stackIn_40_0;
                                      stackIn_41_0 = stackOut_40_0;
                                      decompiledRegionSelector2 = 3;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              stackOut_33_0 = 0;
                              stackIn_34_0 = stackOut_33_0;
                              stackOut_34_0 = stackIn_34_0;
                              stackIn_35_0 = stackOut_34_0;
                              decompiledRegionSelector2 = 2;
                              break L0;
                            }
                          }
                          L13: {
                            if (0 == var11) {
                              L14: {
                                var11 = (int)((519L + this.field_f.b(-1)) / 520L);
                                param1 = false;
                                if (var11 == 0) {
                                  var11++;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              if (var11 != var8_int) {
                                break L13;
                              } else {
                                var11++;
                                break L13;
                              }
                            } else {
                              break L13;
                            }
                          }
                          L15: {
                            if ((-var9 + param3 ^ -1) < -513) {
                              break L15;
                            } else {
                              var11 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if ((param0 ^ -1) >= -65536) {
                              L17: {
                                rda.field_b[5] = (byte)(var11 >> -1170733336);
                                rda.field_b[4] = (byte)(var11 >> 300902064);
                                rda.field_b[7] = (byte)this.field_c;
                                rda.field_b[6] = (byte)var11;
                                rda.field_b[2] = (byte)(var10 >> -1474918680);
                                rda.field_b[3] = (byte)var10;
                                rda.field_b[1] = (byte)param0;
                                rda.field_b[0] = (byte)(param0 >> 1250200872);
                                this.field_f.a((long)(var8_int * 520), (byte) -125);
                                this.field_f.a(-64, 0, rda.field_b, 8);
                                var12 = -var9 + param3;
                                if ((var12 ^ -1) < -513) {
                                  var12 = 512;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              this.field_f.a(-79, var9, param4, var12);
                              var9 = var9 + var12;
                              break L16;
                            } else {
                              L18: {
                                rda.field_b[6] = (byte)(var11 >> -410640784);
                                rda.field_b[7] = (byte)(var11 >> 507970408);
                                rda.field_b[8] = (byte)var11;
                                rda.field_b[0] = (byte)(param0 >> -1529556008);
                                rda.field_b[9] = (byte)this.field_c;
                                rda.field_b[3] = (byte)param0;
                                rda.field_b[2] = (byte)(param0 >> 326390792);
                                rda.field_b[4] = (byte)(var10 >> -2132572760);
                                rda.field_b[1] = (byte)(param0 >> -1627174416);
                                rda.field_b[5] = (byte)var10;
                                this.field_f.a((long)(var8_int * 520), (byte) -110);
                                this.field_f.a(-84, 0, rda.field_b, 10);
                                var12 = -var9 + param3;
                                if ((var12 ^ -1) < -511) {
                                  var12 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_f.a(-59, var9, param4, var12);
                              var9 = var9 + var12;
                              break L16;
                            }
                          }
                          var10++;
                          var8_int = var11;
                          continue L3;
                        }
                      }
                      stackOut_61_0 = 1;
                      stackIn_62_0 = stackOut_61_0;
                      stackOut_62_0 = stackIn_62_0;
                      stackIn_63_0 = stackOut_62_0;
                      decompiledRegionSelector2 = 4;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var8 = (IOException) (Object) decompiledCaughtException;
                  stackOut_64_0 = 0;
                  stackIn_65_0 = stackOut_64_0;
                  return stackIn_65_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_6_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_12_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_35_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_41_0 != 0;
                      } else {
                        return stackIn_63_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_68_0 = (RuntimeException) (var6);
                stackOut_68_1 = new StringBuilder().append("ta.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_70_0 = stackOut_68_0;
                stackIn_70_1 = stackOut_68_1;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1;
                if (param4 == null) {
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
              throw pe.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ta(int param0, v param1, v param2, int param3) {
        this.field_e = 65000;
        this.field_f = null;
        this.field_a = null;
        try {
            this.field_a = param2;
            this.field_f = param1;
            this.field_e = param3;
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ta.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_d = new long[32];
    }
}
