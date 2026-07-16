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
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_11_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        if (param2 == 5) {
          var5 = (Object) (Object) ((gi) this).field_e;
          synchronized (var5) {
            L0: {
              L1: {
                if (-1 < (param1 ^ -1)) {
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
        } else {
          return true;
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
                    var4_int = (gg.field_e[0] << 1210422640 & 16711680) - -((gg.field_e[1] & 255) << 664084264) - -(255 & gg.field_e[2]);
                    var5 = (gg.field_e[5] & 255) + ((255 & gg.field_e[3]) << -1703361584) - -((gg.field_e[4] & 255) << -1648006776);
                    if (-1 >= (var4_int ^ -1)) {
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
                                  if (-1 != (var5 ^ -1)) {
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
                                        var10 = ((255 & gg.field_e[0]) << 1105986920) + (255 & gg.field_e[1]);
                                        var12 = (16711680 & gg.field_e[4] << 1430988752) + (65280 & gg.field_e[5] << -1722203096) - -(255 & gg.field_e[6]);
                                        var11 = (255 & gg.field_e[3]) + (gg.field_e[2] << -421637432 & 65280);
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
                                        var12 = (255 & gg.field_e[8]) + (((255 & gg.field_e[6]) << 1266042128) + (65280 & gg.field_e[7] << 982381032));
                                        var10 = (gg.field_e[3] & 255) + ((65280 & gg.field_e[2] << 1463103944) + (((gg.field_e[0] & 255) << 1279313816) + ((255 & gg.field_e[1]) << -617181968)));
                                        var11 = (255 & gg.field_e[5]) + ((255 & gg.field_e[4]) << -245681016);
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
            int stackIn_7_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_64_0 = 0;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_6_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_63_0 = 0;
            var16 = stellarshard.field_B;
            var6 = (Object) (Object) ((gi) this).field_e;
            synchronized (var6) {
              try {
                L0: {
                  L1: {
                    if (param2) {
                      if (((long)(6 + 6 * param0) ^ -1L) < (((gi) this).field_d.c(61) ^ -1L)) {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackOut_7_0 = stackIn_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0 != 0;
                      } else {
                        L2: {
                          ((gi) this).field_d.a((long)(6 * param0), param3 + 0);
                          ((gi) this).field_d.a(6, (byte) -93, 0, gg.field_e);
                          var7_int = (gg.field_e[5] & 255) + ((65280 & gg.field_e[4] << -1831552536) + (16711680 & gg.field_e[3] << -120345648));
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
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackOut_13_0 = stackIn_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
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
                  gg.field_e[4] = (byte)(var7_int >> 2125415784);
                  gg.field_e[3] = (byte)(var7_int >> -69284944);
                  gg.field_e[2] = (byte)param1;
                  gg.field_e[1] = (byte)(param1 >> -426599032);
                  gg.field_e[param3] = (byte)(param1 >> 1647562128);
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
                                  var10 = (255 & gg.field_e[6]) + (((gg.field_e[4] & 255) << 409243728) + ((255 & gg.field_e[5]) << 1757173128));
                                  var11 = ((gg.field_e[0] & 255) << 291160648) + (gg.field_e[1] & 255);
                                  var12 = (65280 & gg.field_e[2] << 436280456) - -(255 & gg.field_e[3]);
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
                                  var12 = (gg.field_e[5] & 255) + ((255 & gg.field_e[4]) << 1787385768);
                                  var13 = gg.field_e[9] & 255;
                                  var11 = ((255 & gg.field_e[2]) << 1171120840) + ((gg.field_e[0] & 255) << 647322616) + ((gg.field_e[1] << -521759920 & 16711680) + (255 & gg.field_e[3]));
                                  var10 = (255 & gg.field_e[8]) + (((gg.field_e[7] & 255) << 1067321128) + (gg.field_e[6] << -1900519760 & 16711680));
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
                                      if (-1 < (var10 ^ -1)) {
                                        break L12;
                                      } else {
                                        if (((gi) this).field_e.c(102) / 520L < (long)var10) {
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
                          if ((param0 ^ -1) >= -65536) {
                            L17: {
                              gg.field_e[0] = (byte)(param0 >> -777997784);
                              gg.field_e[5] = (byte)(var10 >> 2077785416);
                              gg.field_e[1] = (byte)param0;
                              gg.field_e[6] = (byte)var10;
                              gg.field_e[3] = (byte)var9;
                              gg.field_e[4] = (byte)(var10 >> -1726795888);
                              gg.field_e[7] = (byte)((gi) this).field_b;
                              gg.field_e[2] = (byte)(var9 >> -67533112);
                              ((gi) this).field_e.a((long)(520 * var7_int), param3 + 0);
                              ((gi) this).field_e.a(8, 0, param3, gg.field_e);
                              var11 = -var8 + param1;
                              if (-513 < var11) {
                                var11 = 512;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            ((gi) this).field_e.a(var11, var8, param3 ^ -1, param4);
                            var8 = var8 + var11;
                            break L16;
                          } else {
                            L18: {
                              gg.field_e[6] = (byte)(var10 >> 1758895024);
                              gg.field_e[3] = (byte)param0;
                              gg.field_e[5] = (byte)var9;
                              gg.field_e[2] = (byte)(param0 >> -2084443544);
                              gg.field_e[0] = (byte)(param0 >> 335518584);
                              gg.field_e[7] = (byte)(var10 >> -1521881528);
                              gg.field_e[4] = (byte)(var9 >> -378329848);
                              gg.field_e[1] = (byte)(param0 >> 784378000);
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
                    stackOut_60_0 = 1;
                    stackIn_61_0 = stackOut_60_0;
                    stackOut_61_0 = stackIn_61_0;
                    stackIn_62_0 = stackOut_61_0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                stackOut_63_0 = 0;
                stackIn_64_0 = stackOut_63_0;
                return stackIn_64_0 != 0;
              }
              return stackIn_62_0 != 0;
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
        ((gi) this).field_a = param3;
        ((gi) this).field_d = param2;
        ((gi) this).field_b = param0;
        ((gi) this).field_e = param1;
    }

    static {
    }
}
