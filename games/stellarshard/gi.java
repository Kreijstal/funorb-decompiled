/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gi {
    private int field_b;
    private pc field_d;
    static int field_c;
    static int field_f;
    static int field_g;
    private pc field_e;
    private int field_a;

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          if (param2 == 5) {
            var5 = (Object) (Object) ((gi) this).field_e;
            synchronized (var5) {
              L0: {
                L1: {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (param1 > ((gi) this).field_a) {
                      break L1;
                    } else {
                      L2: {
                        var6 = this.a(param3, param1, true, param2 + -5, param0) ? 1 : 0;
                        if (var6 == 0) {
                          var6 = this.a(param3, param1, false, 0, param0) ? 1 : 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      stackOut_11_0 = var6;
                      stackIn_12_0 = stackOut_11_0;
                      break L0;
                    }
                  }
                }
                throw new IllegalArgumentException();
              }
            }
            return stackIn_12_0 != 0;
          } else {
            stackOut_1_0 = 1;
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5_ref;
            stackOut_15_1 = new StringBuilder().append("gi.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final byte[] a(boolean param0, int param1) {
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
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_19_0 = null;
            Object stackIn_20_0 = null;
            Object stackIn_25_0 = null;
            Object stackIn_26_0 = null;
            Object stackIn_41_0 = null;
            Object stackIn_42_0 = null;
            Object stackIn_47_0 = null;
            Object stackIn_48_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_46_0 = null;
            Object stackOut_47_0 = null;
            Object stackOut_40_0 = null;
            Object stackOut_41_0 = null;
            Object stackOut_24_0 = null;
            Object stackOut_25_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_56_0 = null;
            var18 = stellarshard.field_B;
            var3 = (Object) (Object) ((gi) this).field_e;
            synchronized (var3) {
              try {
                L0: {
                  if (((gi) this).field_d.c(117) >= (long)(6 * param1 + 6)) {
                    ((gi) this).field_d.a((long)(6 * param1), 0);
                    ((gi) this).field_d.a(6, (byte) -93, 0, gg.field_e);
                    var4_int = (gg.field_e[0] << 16 & 16711680) - -((gg.field_e[1] & 255) << 8) - -(255 & gg.field_e[2]);
                    var5 = (gg.field_e[5] & 255) + ((255 & gg.field_e[3]) << 16) - -((gg.field_e[4] & 255) << 8);
                    if (var4_int >= 0) {
                      if (var4_int <= ((gi) this).field_a) {
                        if (var5 > 0) {
                          if ((long)var5 <= ((gi) this).field_e.c(70) / 520L) {
                            if (param0) {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              var8 = 0;
                              L1: while (true) {
                                if (var7 >= var4_int) {
                                  stackOut_53_0 = (byte[]) var6;
                                  stackIn_54_0 = stackOut_53_0;
                                  stackOut_54_0 = (byte[]) (Object) stackIn_54_0;
                                  stackIn_55_0 = stackOut_54_0;
                                  break L0;
                                } else {
                                  if (var5 != 0) {
                                    L2: {
                                      ((gi) this).field_e.a((long)(520 * var5), 0);
                                      var9 = var4_int - var7;
                                      if (param1 <= 65535) {
                                        L3: {
                                          if (512 >= var9) {
                                            break L3;
                                          } else {
                                            var9 = 512;
                                            break L3;
                                          }
                                        }
                                        var14 = 8;
                                        ((gi) this).field_e.a(var14 + var9, (byte) -93, 0, gg.field_e);
                                        var10 = ((255 & gg.field_e[0]) << 8) + (255 & gg.field_e[1]);
                                        var12 = (16711680 & gg.field_e[4] << 16) + (65280 & gg.field_e[5] << 8) - -(255 & gg.field_e[6]);
                                        var11 = (255 & gg.field_e[3]) + (gg.field_e[2] << 8 & 65280);
                                        var13 = gg.field_e[7] & 255;
                                        break L2;
                                      } else {
                                        L4: {
                                          if (510 < var9) {
                                            var9 = 510;
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        }
                                        var14 = 10;
                                        ((gi) this).field_e.a(var9 + var14, (byte) -93, 0, gg.field_e);
                                        var13 = 255 & gg.field_e[9];
                                        var12 = (255 & gg.field_e[8]) + (((255 & gg.field_e[6]) << 16) + (65280 & gg.field_e[7] << 8));
                                        var10 = (gg.field_e[3] & 255) + ((65280 & gg.field_e[2] << 8) + (((gg.field_e[0] & 255) << 24) + ((255 & gg.field_e[1]) << 16)));
                                        var11 = (255 & gg.field_e[5]) + ((255 & gg.field_e[4]) << 8);
                                        break L2;
                                      }
                                    }
                                    if (param1 == var10) {
                                      if (var11 == var8) {
                                        if (((gi) this).field_b == var13) {
                                          if (0 <= var12) {
                                            if (((gi) this).field_e.c(108) / 520L >= (long)var12) {
                                              var15 = var9 + var14;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (var15 <= var16) {
                                                  var5 = var12;
                                                  var8++;
                                                  continue L1;
                                                } else {
                                                  int incrementValue$1 = var7;
                                                  var7++;
                                                  var6[incrementValue$1] = gg.field_e[var16];
                                                  var16++;
                                                  continue L5;
                                                }
                                              }
                                            } else {
                                              stackOut_46_0 = null;
                                              stackIn_47_0 = stackOut_46_0;
                                              stackOut_47_0 = stackIn_47_0;
                                              stackIn_48_0 = stackOut_47_0;
                                              return (byte[]) (Object) stackIn_48_0;
                                            }
                                          } else {
                                            return null;
                                          }
                                        } else {
                                          stackOut_40_0 = null;
                                          stackIn_41_0 = stackOut_40_0;
                                          stackOut_41_0 = stackIn_41_0;
                                          stackIn_42_0 = stackOut_41_0;
                                          return (byte[]) (Object) stackIn_42_0;
                                        }
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    stackOut_24_0 = null;
                                    stackIn_25_0 = stackOut_24_0;
                                    stackOut_25_0 = stackIn_25_0;
                                    stackIn_26_0 = stackOut_25_0;
                                    return (byte[]) (Object) stackIn_26_0;
                                  }
                                }
                              }
                            } else {
                              stackOut_18_0 = null;
                              stackIn_19_0 = stackOut_18_0;
                              stackOut_19_0 = stackIn_19_0;
                              stackIn_20_0 = stackOut_19_0;
                              return (byte[]) (Object) stackIn_20_0;
                            }
                          } else {
                            return null;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        stackOut_8_0 = null;
                        stackIn_9_0 = stackOut_8_0;
                        stackOut_9_0 = stackIn_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        return (byte[]) (Object) stackIn_10_0;
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
                stackOut_56_0 = null;
                stackIn_57_0 = stackOut_56_0;
                return (byte[]) (Object) stackIn_57_0;
              }
              return stackIn_55_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(int param0, int param1, boolean param2, int param3, byte[] param4) {
        try {
            Object var6 = null;
            RuntimeException var6_ref = null;
            Object var6_ref2 = null;
            IOException var7 = null;
            int var7_int = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            EOFException var14 = null;
            Throwable var15 = null;
            int var16 = 0;
            int stackIn_8_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_15_0 = 0;
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
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
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
            var16 = stellarshard.field_B;
            try {
              var6_ref2 = (Object) (Object) ((gi) this).field_e;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param2) {
                        if (~(long)(6 + 6 * param0) < ~((gi) this).field_d.c(61)) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        } else {
                          L2: {
                            ((gi) this).field_d.a((long)(6 * param0), param3);
                            ((gi) this).field_d.a(6, (byte) -93, 0, gg.field_e);
                            var7_int = (gg.field_e[5] & 255) + ((65280 & gg.field_e[4] << 8) + (16711680 & gg.field_e[3] << 16));
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if ((long)var7_int <= ((gi) this).field_e.c(110) / 520L) {
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackOut_14_0 = stackIn_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          return stackIn_15_0 != 0;
                        }
                      } else {
                        var7_int = (int)((((gi) this).field_e.c(param3 + 98) - -519L) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    gg.field_e[5] = (byte)var7_int;
                    gg.field_e[4] = (byte)(var7_int >> 8);
                    gg.field_e[3] = (byte)(var7_int >> 16);
                    gg.field_e[2] = (byte)param1;
                    gg.field_e[1] = (byte)(param1 >> 8);
                    gg.field_e[param3] = (byte)(param1 >> 16);
                    ((gi) this).field_d.a((long)(param0 * 6), 0);
                    ((gi) this).field_d.a(6, 0, -1, gg.field_e);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (param1 <= var8) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (!param2) {
                              break L5;
                            } else {
                              L6: {
                                ((gi) this).field_e.a((long)(520 * var7_int), 0);
                                if (65535 >= param0) {
                                  try {
                                    L7: {
                                      ((gi) this).field_e.a(8, (byte) -93, 0, gg.field_e);
                                      decompiledRegionSelector1 = 0;
                                      break L7;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L8: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L8;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var13 = gg.field_e[7] & 255;
                                    var10 = (255 & gg.field_e[6]) + (((gg.field_e[4] & 255) << 16) + ((255 & gg.field_e[5]) << 8));
                                    var11 = ((gg.field_e[0] & 255) << 8) + (gg.field_e[1] & 255);
                                    var12 = (65280 & gg.field_e[2] << 8) - -(255 & gg.field_e[3]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((gi) this).field_e.a(10, (byte) -93, 0, gg.field_e);
                                      decompiledRegionSelector0 = 0;
                                      break L9;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L10: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L10;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var12 = (gg.field_e[5] & 255) + ((255 & gg.field_e[4]) << 8);
                                    var13 = gg.field_e[9] & 255;
                                    var11 = ((255 & gg.field_e[2]) << 8) + ((gg.field_e[0] & 255) << 24) + ((gg.field_e[1] << 16 & 16711680) + (255 & gg.field_e[3]));
                                    var10 = (255 & gg.field_e[8]) + (((gg.field_e[7] & 255) << 8) + (gg.field_e[6] << 16 & 16711680));
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (param0 != var11) {
                                  break L11;
                                } else {
                                  if (var12 != var9) {
                                    break L11;
                                  } else {
                                    if (((gi) this).field_b != var13) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (var10 < 0) {
                                          break L12;
                                        } else {
                                          if (((gi) this).field_e.c(102) / 520L < (long)var10) {
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
                            if (0 != var10) {
                              break L13;
                            } else {
                              L14: {
                                var10 = (int)((((gi) this).field_e.c(127) + 519L) / 520L);
                                param2 = false;
                                if (var10 == 0) {
                                  var10++;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              if (var10 == var7_int) {
                                var10++;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L15: {
                            if (512 >= -var8 + param1) {
                              var10 = 0;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (param0 <= 65535) {
                              L17: {
                                gg.field_e[0] = (byte)(param0 >> 8);
                                gg.field_e[5] = (byte)(var10 >> 8);
                                gg.field_e[1] = (byte)param0;
                                gg.field_e[6] = (byte)var10;
                                gg.field_e[3] = (byte)var9;
                                gg.field_e[4] = (byte)(var10 >> 16);
                                gg.field_e[7] = (byte)((gi) this).field_b;
                                gg.field_e[2] = (byte)(var9 >> 8);
                                ((gi) this).field_e.a((long)(520 * var7_int), param3);
                                ((gi) this).field_e.a(8, 0, param3, gg.field_e);
                                var11 = -var8 + param1;
                                if (-513 < var11) {
                                  var11 = 512;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((gi) this).field_e.a(var11, var8, ~param3, param4);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                gg.field_e[6] = (byte)(var10 >> 16);
                                gg.field_e[3] = (byte)param0;
                                gg.field_e[5] = (byte)var9;
                                gg.field_e[2] = (byte)(param0 >> 8);
                                gg.field_e[0] = (byte)(param0 >> 24);
                                gg.field_e[7] = (byte)(var10 >> 8);
                                gg.field_e[4] = (byte)(var9 >> 8);
                                gg.field_e[1] = (byte)(param0 >> 16);
                                gg.field_e[9] = (byte)((gi) this).field_b;
                                gg.field_e[8] = (byte)var10;
                                ((gi) this).field_e.a((long)(520 * var7_int), 0);
                                ((gi) this).field_e.a(10, 0, -1, gg.field_e);
                                var11 = param1 + -var8;
                                if (510 >= var11) {
                                  break L18;
                                } else {
                                  var11 = 510;
                                  break L18;
                                }
                              }
                              ((gi) this).field_e.a(var11, var8, -1, param4);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var9++;
                          var7_int = var10;
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
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_64_0 = 0;
                  stackIn_65_0 = stackOut_64_0;
                  return stackIn_65_0 != 0;
                }
                return stackIn_63_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_68_0 = (RuntimeException) var6_ref;
                stackOut_68_1 = new StringBuilder().append("gi.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
              throw ma.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((gi) this).field_b;
    }

    gi(int param0, pc param1, pc param2, int param3) {
        ((gi) this).field_d = null;
        ((gi) this).field_e = null;
        ((gi) this).field_a = 65000;
        try {
            ((gi) this).field_a = param3;
            ((gi) this).field_d = param2;
            ((gi) this).field_b = param0;
            ((gi) this).field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "gi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
