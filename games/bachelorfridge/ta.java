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
            var3 = (Object) (Object) ((ta) this).field_f;
            synchronized (var3) {
              try {
                L0: {
                  if (~((ta) this).field_a.b(-1) <= ~(long)(6 * param0 + 6)) {
                    ((ta) this).field_a.a((long)(6 * param0), (byte) -91);
                    ((ta) this).field_a.a(6, 0, param1 ^ 4, rda.field_b);
                    var4_int = (rda.field_b[0] << 16 & 16711680) + ((rda.field_b[1] & 255) << 8) - -(255 & rda.field_b[2]);
                    var5 = ((255 & rda.field_b[3]) << 16) + (65280 & rda.field_b[4] << 8) + (255 & rda.field_b[5]);
                    if (var4_int >= 0) {
                      if (((ta) this).field_e >= var4_int) {
                        if (0 < var5) {
                          if (((ta) this).field_f.b(-1) / 520L >= (long)var5) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var4_int <= var7) {
                                L2: {
                                  if (param1 == -5) {
                                    break L2;
                                  } else {
                                    byte[] discarded$2 = ((ta) this).a(42, (byte) -46);
                                    break L2;
                                  }
                                }
                                stackOut_51_0 = (byte[]) var6;
                                stackIn_52_0 = stackOut_51_0;
                                stackOut_52_0 = (byte[]) (Object) stackIn_52_0;
                                stackIn_53_0 = stackOut_52_0;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L3: {
                                    ((ta) this).field_f.a((long)(var5 * 520), (byte) -108);
                                    var9 = var4_int + -var7;
                                    if (65535 >= param0) {
                                      L4: {
                                        if (var9 <= 512) {
                                          break L4;
                                        } else {
                                          var9 = 512;
                                          break L4;
                                        }
                                      }
                                      var14 = 8;
                                      ((ta) this).field_f.a(var14 + var9, 0, -1, rda.field_b);
                                      var12 = (rda.field_b[4] << 16 & 16711680) + ((255 & rda.field_b[5]) << 8) + (255 & rda.field_b[6]);
                                      var10 = ((255 & rda.field_b[0]) << 8) - -(rda.field_b[1] & 255);
                                      var11 = ((rda.field_b[2] & 255) << 8) - -(255 & rda.field_b[3]);
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
                                      ((ta) this).field_f.a(var9 + var14, 0, -1, rda.field_b);
                                      var12 = ((rda.field_b[6] & 255) << 16) + ((255 & rda.field_b[7]) << 8) - -(rda.field_b[8] & 255);
                                      var11 = ((255 & rda.field_b[4]) << 8) - -(rda.field_b[5] & 255);
                                      var13 = 255 & rda.field_b[9];
                                      var10 = (255 & rda.field_b[3]) + ((rda.field_b[0] & 255) << 24) + ((rda.field_b[1] << 16 & 16711680) + ((rda.field_b[2] & 255) << 8));
                                      break L3;
                                    }
                                  }
                                  if (param0 == var10) {
                                    if (var8 == var11) {
                                      if (var13 == ((ta) this).field_c) {
                                        if (0 <= var12) {
                                          if ((long)var12 <= ((ta) this).field_f.b(-1) / 520L) {
                                            var15 = var14 + var9;
                                            var8++;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var16 >= var15) {
                                                var5 = var12;
                                                continue L1;
                                              } else {
                                                int incrementValue$3 = var7;
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
                                            return (byte[]) (Object) stackIn_44_0;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        stackOut_36_0 = null;
                                        stackIn_37_0 = stackOut_36_0;
                                        stackOut_37_0 = stackIn_37_0;
                                        stackIn_38_0 = stackOut_37_0;
                                        return (byte[]) (Object) stackIn_38_0;
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
                                  return (byte[]) (Object) stackIn_22_0;
                                }
                              }
                            }
                          } else {
                            stackOut_14_0 = null;
                            stackIn_15_0 = stackOut_14_0;
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            return (byte[]) (Object) stackIn_16_0;
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
                return (byte[]) (Object) stackIn_55_0;
              }
              return stackIn_53_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
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
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ta.C(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return (pp) (Object) stackIn_1_0;
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
          var5 = (Object) (Object) ((ta) this).field_f;
          synchronized (var5) {
            L0: {
              L1: {
                if (param3 > param0) {
                  break L1;
                } else {
                  if (param0 > ((ta) this).field_e) {
                    break L1;
                  } else {
                    L2: {
                      var6 = this.a(param2, true, -15, param0, param1) ? 1 : 0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        var6 = this.a(param2, false, -31, param0, param1) ? 1 : 0;
                        break L2;
                      }
                    }
                    stackOut_7_0 = var6;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_8_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5_ref;
            stackOut_11_1 = new StringBuilder().append("ta.D(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final String toString() {
        return "" + ((ta) this).field_c;
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
              var7_ref = (Object) (Object) ((ta) this).field_f;
              synchronized (var7_ref) {
                try {
                  L0: {
                    L1: {
                      if (!param1) {
                        var8_int = (int)((519L + ((ta) this).field_f.b(-1)) / 520L);
                        if (0 == var8_int) {
                          var8_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (~((ta) this).field_a.b(-1) <= ~(long)(6 * param0 + 6)) {
                          L2: {
                            ((ta) this).field_a.a((long)(param0 * 6), (byte) -121);
                            ((ta) this).field_a.a(6, 0, -1, rda.field_b);
                            var8_int = (rda.field_b[3] << 16 & 16711680) + ((rda.field_b[4] & 255) << 8) - -(rda.field_b[5] & 255);
                            if (var8_int <= 0) {
                              break L2;
                            } else {
                              if (((ta) this).field_f.b(-1) / 520L < (long)var8_int) {
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
                          return stackIn_12_0 != 0;
                        } else {
                          stackOut_4_0 = 0;
                          stackIn_5_0 = stackOut_4_0;
                          stackOut_5_0 = stackIn_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          return stackIn_6_0 != 0;
                        }
                      }
                    }
                    rda.field_b[4] = (byte)(var8_int >> 8);
                    rda.field_b[2] = (byte)param3;
                    rda.field_b[3] = (byte)(var8_int >> 16);
                    rda.field_b[0] = (byte)(param3 >> 16);
                    rda.field_b[1] = (byte)(param3 >> 8);
                    rda.field_b[5] = (byte)var8_int;
                    ((ta) this).field_a.a((long)(6 * param0), (byte) -124);
                    ((ta) this).field_a.a(-117, 0, rda.field_b, 6);
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
                                ((ta) this).field_f.a((long)(var8_int * 520), (byte) -91);
                                if (param0 <= 65535) {
                                  try {
                                    L7: {
                                      ((ta) this).field_f.a(8, 0, -1, rda.field_b);
                                      decompiledRegionSelector1 = 0;
                                      break L7;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L8: {
                                      var15 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L8;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var14 = 255 & rda.field_b[7];
                                    var12 = ((rda.field_b[0] & 255) << 8) + (rda.field_b[1] & 255);
                                    var13 = (rda.field_b[2] << 8 & 65280) - -(255 & rda.field_b[3]);
                                    var11 = ((rda.field_b[5] & 255) << 8) + (rda.field_b[4] << 16 & 16711680) - -(255 & rda.field_b[6]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((ta) this).field_f.a(10, 0, -1, rda.field_b);
                                      decompiledRegionSelector0 = 0;
                                      break L9;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L10: {
                                      var15 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L10;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var11 = (16711680 & rda.field_b[6] << 16) - (-(65280 & rda.field_b[7] << 8) + -(rda.field_b[8] & 255));
                                    var12 = (rda.field_b[3] & 255) + (((rda.field_b[2] & 255) << 8) + (16711680 & rda.field_b[1] << 16) + ((rda.field_b[0] & 255) << 24));
                                    var13 = (65280 & rda.field_b[4] << 8) - -(255 & rda.field_b[5]);
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
                                    if (((ta) this).field_c != var14) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (var11 < 0) {
                                          break L12;
                                        } else {
                                          if (~(((ta) this).field_f.b(-1) / 520L) > ~(long)var11) {
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
                                      return stackIn_41_0 != 0;
                                    }
                                  }
                                }
                              }
                              stackOut_33_0 = 0;
                              stackIn_34_0 = stackOut_33_0;
                              stackOut_34_0 = stackIn_34_0;
                              stackIn_35_0 = stackOut_34_0;
                              return stackIn_35_0 != 0;
                            }
                          }
                          L13: {
                            if (0 == var11) {
                              L14: {
                                var11 = (int)((519L + ((ta) this).field_f.b(-1)) / 520L);
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
                            if (-var9 + param3 > 512) {
                              break L15;
                            } else {
                              var11 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (param0 <= 65535) {
                              L17: {
                                rda.field_b[5] = (byte)(var11 >> 8);
                                rda.field_b[4] = (byte)(var11 >> 16);
                                rda.field_b[7] = (byte)((ta) this).field_c;
                                rda.field_b[6] = (byte)var11;
                                rda.field_b[2] = (byte)(var10 >> 8);
                                rda.field_b[3] = (byte)var10;
                                rda.field_b[1] = (byte)param0;
                                rda.field_b[0] = (byte)(param0 >> 8);
                                ((ta) this).field_f.a((long)(var8_int * 520), (byte) -125);
                                ((ta) this).field_f.a(-64, 0, rda.field_b, 8);
                                var12 = -var9 + param3;
                                if (var12 > 512) {
                                  var12 = 512;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((ta) this).field_f.a(-79, var9, param4, var12);
                              var9 = var9 + var12;
                              break L16;
                            } else {
                              L18: {
                                rda.field_b[6] = (byte)(var11 >> 16);
                                rda.field_b[7] = (byte)(var11 >> 8);
                                rda.field_b[8] = (byte)var11;
                                rda.field_b[0] = (byte)(param0 >> 24);
                                rda.field_b[9] = (byte)((ta) this).field_c;
                                rda.field_b[3] = (byte)param0;
                                rda.field_b[2] = (byte)(param0 >> 8);
                                rda.field_b[4] = (byte)(var10 >> 8);
                                rda.field_b[1] = (byte)(param0 >> 16);
                                rda.field_b[5] = (byte)var10;
                                ((ta) this).field_f.a((long)(var8_int * 520), (byte) -110);
                                ((ta) this).field_f.a(-84, 0, rda.field_b, 10);
                                var12 = -var9 + param3;
                                if (var12 > 510) {
                                  var12 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((ta) this).field_f.a(-59, var9, param4, var12);
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
                return stackIn_63_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_68_0 = (RuntimeException) var6;
                stackOut_68_1 = new StringBuilder().append("ta.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
                stackIn_70_0 = stackOut_68_0;
                stackIn_70_1 = stackOut_68_1;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1;
                if (param4 == null) {
                  stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
                  stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
                  stackOut_70_2 = "null";
                  stackIn_71_0 = stackOut_70_0;
                  stackIn_71_1 = stackOut_70_1;
                  stackIn_71_2 = stackOut_70_2;
                  break L19;
                } else {
                  stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                  stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
                  stackOut_69_2 = "{...}";
                  stackIn_71_0 = stackOut_69_0;
                  stackIn_71_1 = stackOut_69_1;
                  stackIn_71_2 = stackOut_69_2;
                  break L19;
                }
              }
              throw pe.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ta(int param0, v param1, v param2, int param3) {
        ((ta) this).field_e = 65000;
        ((ta) this).field_f = null;
        ((ta) this).field_a = null;
        try {
            ((ta) this).field_a = param2;
            ((ta) this).field_f = param1;
            ((ta) this).field_e = param3;
            ((ta) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ta.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new long[32];
    }
}
