/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ppa {
    private int field_d;
    private ph field_c;
    private int field_e;
    private ph field_b;
    static String field_a;

    final boolean a(int param0, byte[] param1, int param2, byte param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          var5 = (Object) (Object) ((ppa) this).field_c;
          synchronized (var5) {
            L0: {
              L1: {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (param2 > ((ppa) this).field_e) {
                    break L1;
                  } else {
                    L2: {
                      var6 = this.a(true, param2, param1, true, param0) ? 1 : 0;
                      if (var6 == 0) {
                        var6 = this.a(false, param2, param1, true, param0) ? 1 : 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (param3 >= 112) {
                        break L3;
                      } else {
                        ((ppa) this).field_d = -66;
                        break L3;
                      }
                    }
                    stackOut_10_0 = var6;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_11_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5_ref;
            stackOut_14_1 = new StringBuilder().append("ppa.C(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
    }

    final byte[] a(int param0, int param1) {
        try {
            Object var3 = null;
            IOException var4 = null;
            int var4_int = 0;
            int var5 = 0;
            int var6 = 0;
            byte[] var7 = null;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            Throwable var18 = null;
            int var19 = 0;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_37_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_43_0 = null;
            Object stackIn_44_0 = null;
            byte[] stackIn_49_0 = null;
            byte[] stackIn_50_0 = null;
            Object stackIn_52_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_48_0 = null;
            byte[] stackOut_49_0 = null;
            Object stackOut_42_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_36_0 = null;
            Object stackOut_37_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_51_0 = null;
            var19 = TombRacer.field_G ? 1 : 0;
            var3 = (Object) (Object) ((ppa) this).field_c;
            synchronized (var3) {
              try {
                L0: {
                  if (((ppa) this).field_b.b(true) >= (long)(6 + 6 * param0)) {
                    ((ppa) this).field_b.a((byte) 20, (long)(6 * param0));
                    ((ppa) this).field_b.a(wfa.field_F, 6, 0, (byte) -64);
                    var6 = -2 / ((param1 - -40) / 57);
                    var4_int = (255 & wfa.field_F[2]) + (((255 & wfa.field_F[1]) << 8) + (wfa.field_F[0] << 16 & 16711680));
                    var5 = (16711680 & wfa.field_F[3] << 16) - (-((wfa.field_F[4] & 255) << 8) + -(wfa.field_F[5] & 255));
                    if (var4_int >= 0) {
                      if (var4_int <= ((ppa) this).field_e) {
                        if (var5 > 0) {
                          if ((long)var5 <= ((ppa) this).field_c.b(true) / 520L) {
                            var7 = new byte[var4_int];
                            var8 = 0;
                            var9 = 0;
                            L1: while (true) {
                              if (var8 >= var4_int) {
                                stackOut_48_0 = (byte[]) var7;
                                stackIn_49_0 = stackOut_48_0;
                                stackOut_49_0 = (byte[]) (Object) stackIn_49_0;
                                stackIn_50_0 = stackOut_49_0;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L2: {
                                    ((ppa) this).field_c.a((byte) 67, (long)(520 * var5));
                                    var10 = var4_int - var8;
                                    if (65535 < param0) {
                                      L3: {
                                        var15 = 10;
                                        if (510 >= var10) {
                                          break L3;
                                        } else {
                                          var10 = 510;
                                          break L3;
                                        }
                                      }
                                      ((ppa) this).field_c.a(wfa.field_F, var10 - -var15, 0, (byte) -28);
                                      var12 = (255 & wfa.field_F[5]) + (wfa.field_F[4] << 8 & 65280);
                                      var13 = ((255 & wfa.field_F[6]) << 16) + ((65280 & wfa.field_F[7] << 8) - -(wfa.field_F[8] & 255));
                                      var11 = (16711680 & wfa.field_F[1] << 16) + (-16777216 & wfa.field_F[0] << 24) - (-(wfa.field_F[2] << 8 & 65280) + -(255 & wfa.field_F[3]));
                                      var14 = wfa.field_F[9] & 255;
                                      break L2;
                                    } else {
                                      L4: {
                                        if (var10 > 512) {
                                          var10 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var15 = 8;
                                      ((ppa) this).field_c.a(wfa.field_F, var15 + var10, 0, (byte) -30);
                                      var12 = ((wfa.field_F[2] & 255) << 8) - -(wfa.field_F[3] & 255);
                                      var14 = 255 & wfa.field_F[7];
                                      var13 = (255 & wfa.field_F[6]) + ((255 & wfa.field_F[4]) << 16) - -(65280 & wfa.field_F[5] << 8);
                                      var11 = (255 & wfa.field_F[1]) + ((wfa.field_F[0] & 255) << 8);
                                      break L2;
                                    }
                                  }
                                  if (param0 == var11) {
                                    if (var12 == var9) {
                                      if (var14 == ((ppa) this).field_d) {
                                        if (var13 >= 0) {
                                          if (~(((ppa) this).field_c.b(true) / 520L) <= ~(long)var13) {
                                            var16 = var15 - -var10;
                                            var9++;
                                            var5 = var13;
                                            var17 = var15;
                                            L5: while (true) {
                                              if (var16 <= var17) {
                                                continue L1;
                                              } else {
                                                int incrementValue$1 = var8;
                                                var8++;
                                                var7[incrementValue$1] = wfa.field_F[var17];
                                                var17++;
                                                continue L5;
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
                    stackOut_2_0 = null;
                    stackIn_3_0 = stackOut_2_0;
                    stackOut_3_0 = stackIn_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    return (byte[]) (Object) stackIn_4_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_51_0 = null;
                stackIn_52_0 = stackOut_51_0;
                return (byte[]) (Object) stackIn_52_0;
              }
              return stackIn_50_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(boolean param0, int param1, byte[] param2, boolean param3, int param4) {
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
            int stackIn_5_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_63_0 = 0;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            String stackIn_69_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_62_0 = 0;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            String stackOut_67_2 = null;
            var16 = TombRacer.field_G ? 1 : 0;
            try {
              var6_ref2 = (Object) (Object) ((ppa) this).field_c;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param0) {
                        var7_int = (int)((519L + ((ppa) this).field_c.b(true)) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if (((ppa) this).field_b.b(true) >= (long)(6 * param4 + 6)) {
                          L2: {
                            ((ppa) this).field_b.a((byte) -124, (long)(6 * param4));
                            ((ppa) this).field_b.a(wfa.field_F, 6, 0, (byte) -34);
                            var7_int = (wfa.field_F[3] << 16 & 16711680) + ((255 & wfa.field_F[4]) << 8) + (255 & wfa.field_F[5]);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if ((long)var7_int <= ((ppa) this).field_c.b(true) / 520L) {
                                break L1;
                              } else {
                                break L2;
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
                    wfa.field_F[5] = (byte)var7_int;
                    wfa.field_F[1] = (byte)(param1 >> 8);
                    wfa.field_F[0] = (byte)(param1 >> 16);
                    wfa.field_F[2] = (byte)param1;
                    wfa.field_F[3] = (byte)(var7_int >> 16);
                    wfa.field_F[4] = (byte)(var7_int >> 8);
                    ((ppa) this).field_b.a((byte) -118, (long)(param4 * 6));
                    ((ppa) this).field_b.a(wfa.field_F, 0, (byte) -17, 6);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (var8 >= param1) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (!param0) {
                              break L5;
                            } else {
                              L6: {
                                ((ppa) this).field_c.a((byte) 91, (long)(var7_int * 520));
                                if (param4 <= 65535) {
                                  try {
                                    L7: {
                                      ((ppa) this).field_c.a(wfa.field_F, 8, 0, (byte) -115);
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
                                    var12 = (255 & wfa.field_F[3]) + ((255 & wfa.field_F[2]) << 8);
                                    var11 = (65280 & wfa.field_F[0] << 8) - -(wfa.field_F[1] & 255);
                                    var10 = (255 & wfa.field_F[6]) + (wfa.field_F[4] << 16 & 16711680) + (wfa.field_F[5] << 8 & 65280);
                                    var13 = wfa.field_F[7] & 255;
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((ppa) this).field_c.a(wfa.field_F, 10, 0, (byte) -33);
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
                                    var12 = ((255 & wfa.field_F[4]) << 8) - -(255 & wfa.field_F[5]);
                                    var11 = (wfa.field_F[0] << 24 & -16777216) - -((255 & wfa.field_F[1]) << 16) - (-((255 & wfa.field_F[2]) << 8) + -(255 & wfa.field_F[3]));
                                    var13 = 255 & wfa.field_F[9];
                                    var10 = (255 & wfa.field_F[8]) + (((255 & wfa.field_F[7]) << 8) + ((255 & wfa.field_F[6]) << 16));
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (var11 != param4) {
                                  break L11;
                                } else {
                                  if (var9 != var12) {
                                    break L11;
                                  } else {
                                    if (((ppa) this).field_d != var13) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (0 > var10) {
                                          break L12;
                                        } else {
                                          if ((long)var10 > ((ppa) this).field_c.b(true) / 520L) {
                                            break L12;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      stackOut_38_0 = 0;
                                      stackIn_39_0 = stackOut_38_0;
                                      stackOut_39_0 = stackIn_39_0;
                                      stackIn_40_0 = stackOut_39_0;
                                      return stackIn_40_0 != 0;
                                    }
                                  }
                                }
                              }
                              stackOut_32_0 = 0;
                              stackIn_33_0 = stackOut_32_0;
                              stackOut_33_0 = stackIn_33_0;
                              stackIn_34_0 = stackOut_33_0;
                              return stackIn_34_0 != 0;
                            }
                          }
                          L13: {
                            if (var10 == 0) {
                              L14: {
                                var10 = (int)((((ppa) this).field_c.b(true) - -519L) / 520L);
                                param0 = false;
                                if (0 != var10) {
                                  break L14;
                                } else {
                                  var10++;
                                  break L14;
                                }
                              }
                              if (var7_int == var10) {
                                var10++;
                                break L13;
                              } else {
                                break L13;
                              }
                            } else {
                              break L13;
                            }
                          }
                          L15: {
                            if (-513 > -var8 + param1) {
                              break L15;
                            } else {
                              var10 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (-65536 < param4) {
                              L17: {
                                wfa.field_F[7] = (byte)(var10 >> 8);
                                wfa.field_F[5] = (byte)var9;
                                wfa.field_F[1] = (byte)(param4 >> 16);
                                wfa.field_F[3] = (byte)param4;
                                wfa.field_F[0] = (byte)(param4 >> 24);
                                wfa.field_F[6] = (byte)(var10 >> 16);
                                wfa.field_F[4] = (byte)(var9 >> 8);
                                wfa.field_F[9] = (byte)((ppa) this).field_d;
                                wfa.field_F[8] = (byte)var10;
                                wfa.field_F[2] = (byte)(param4 >> 8);
                                ((ppa) this).field_c.a((byte) 36, (long)(520 * var7_int));
                                ((ppa) this).field_c.a(wfa.field_F, 0, (byte) -17, 10);
                                var11 = param1 + -var8;
                                if (var11 <= 510) {
                                  break L17;
                                } else {
                                  var11 = 510;
                                  break L17;
                                }
                              }
                              ((ppa) this).field_c.a(param2, var8, (byte) -17, var11);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                wfa.field_F[4] = (byte)(var10 >> 16);
                                wfa.field_F[2] = (byte)(var9 >> 8);
                                wfa.field_F[6] = (byte)var10;
                                wfa.field_F[3] = (byte)var9;
                                wfa.field_F[0] = (byte)(param4 >> 8);
                                wfa.field_F[5] = (byte)(var10 >> 8);
                                wfa.field_F[1] = (byte)param4;
                                wfa.field_F[7] = (byte)((ppa) this).field_d;
                                ((ppa) this).field_c.a((byte) -109, (long)(var7_int * 520));
                                ((ppa) this).field_c.a(wfa.field_F, 0, (byte) -17, 8);
                                var11 = param1 - var8;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((ppa) this).field_c.a(param2, var8, (byte) -17, var11);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L3;
                        }
                      }
                      stackOut_59_0 = 1;
                      stackIn_60_0 = stackOut_59_0;
                      stackOut_60_0 = stackIn_60_0;
                      stackIn_61_0 = stackOut_60_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_62_0 = 0;
                  stackIn_63_0 = stackOut_62_0;
                  return stackIn_63_0 != 0;
                }
                return stackIn_61_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_66_0 = (RuntimeException) var6_ref;
                stackOut_66_1 = new StringBuilder().append("ppa.A(").append(param0).append(',').append(param1).append(',');
                stackIn_68_0 = stackOut_66_0;
                stackIn_68_1 = stackOut_66_1;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                if (param2 == null) {
                  stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
                  stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
                  stackOut_68_2 = "null";
                  stackIn_69_0 = stackOut_68_0;
                  stackIn_69_1 = stackOut_68_1;
                  stackIn_69_2 = stackOut_68_2;
                  break L19;
                } else {
                  stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                  stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
                  stackOut_67_2 = "{...}";
                  stackIn_69_0 = stackOut_67_0;
                  stackIn_69_1 = stackOut_67_1;
                  stackIn_69_2 = stackOut_67_2;
                  break L19;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + ',' + true + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(la param0, int param1, ff param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            L1: {
              if (vpa.a(112)) {
                break L1;
              } else {
                if (!param2.k(-25319)) {
                  if (param0.q((byte) -82) < 0) {
                    return;
                  } else {
                    ql.field_k.k(99, -2988);
                    ql.field_k.f(-1477662136, param0.q((byte) -82));
                    ql.field_k.f(-1477662136, param0.a((byte) 107));
                    var3_int = 79;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("ppa.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(64).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    public final String toString() {
        return "" + ((ppa) this).field_d;
    }

    ppa(int param0, ph param1, ph param2, int param3) {
        ((ppa) this).field_c = null;
        ((ppa) this).field_b = null;
        ((ppa) this).field_e = 65000;
        try {
            ((ppa) this).field_d = param0;
            ((ppa) this).field_c = param1;
            ((ppa) this).field_b = param2;
            ((ppa) this).field_e = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ppa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Username: ";
    }
}
