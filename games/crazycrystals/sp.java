/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sp {
    static ng field_c;
    private qa field_d;
    private int field_e;
    private qa field_b;
    private int field_g;
    static na field_a;
    static sj field_f;

    private final boolean a(int param0, int param1, byte[] param2, int param3, boolean param4) {
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
            int stackIn_8_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_66_0 = 0;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_65_0 = 0;
            var16 = CrazyCrystals.field_B;
            var6 = (Object) (Object) ((sp) this).field_d;
            synchronized (var6) {
              try {
                L0: {
                  L1: {
                    if (param4) {
                      if (((long)(6 * param1 - -6) ^ -1L) < (((sp) this).field_b.b(0) ^ -1L)) {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackOut_8_0 = stackIn_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0 != 0;
                      } else {
                        L2: {
                          ((sp) this).field_b.a((long)(param1 * 6), -1);
                          ((sp) this).field_b.a((byte) 106, mf.field_u, 0, 6);
                          var7_int = (16711680 & mf.field_u[3] << -742686992) + ((65280 & mf.field_u[4] << -413110104) + (mf.field_u[5] & 255));
                          if ((var7_int ^ -1) >= -1) {
                            break L2;
                          } else {
                            if (((long)var7_int ^ -1L) >= (((sp) this).field_d.b(0) / 520L ^ -1L)) {
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
                      var7_int = (int)((((sp) this).field_d.b(0) - -519L) / 520L);
                      if (var7_int == 0) {
                        var7_int = 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L3: {
                    mf.field_u[2] = (byte)param0;
                    mf.field_u[1] = (byte)(param0 >> -1775233080);
                    mf.field_u[5] = (byte)var7_int;
                    mf.field_u[4] = (byte)(var7_int >> 1565858088);
                    mf.field_u[3] = (byte)(var7_int >> -1227899632);
                    mf.field_u[0] = (byte)(param0 >> 1711114064);
                    ((sp) this).field_b.a((long)(6 * param1), -1);
                    ((sp) this).field_b.a(123, mf.field_u, 0, 6);
                    var8 = 0;
                    if (param3 > 111) {
                      break L3;
                    } else {
                      field_a = null;
                      break L3;
                    }
                  }
                  var9 = 0;
                  L4: while (true) {
                    L5: {
                      if (param0 <= var8) {
                        break L5;
                      } else {
                        L6: {
                          var10 = 0;
                          if (!param4) {
                            break L6;
                          } else {
                            L7: {
                              ((sp) this).field_d.a((long)(520 * var7_int), -1);
                              if (-65536 <= (param1 ^ -1)) {
                                try {
                                  L8: {
                                    ((sp) this).field_d.a((byte) 106, mf.field_u, 0, 8);
                                    decompiledRegionSelector1 = 0;
                                    break L8;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L9: {
                                    var14 = (EOFException) (Object) decompiledCaughtException;
                                    decompiledRegionSelector1 = 1;
                                    break L9;
                                  }
                                }
                                if (decompiledRegionSelector1 == 0) {
                                  var10 = ((mf.field_u[4] & 255) << 1292281264) + (mf.field_u[5] << -1611011032 & 65280) + (255 & mf.field_u[6]);
                                  var12 = ((mf.field_u[2] & 255) << 340930600) - -(mf.field_u[3] & 255);
                                  var13 = mf.field_u[7] & 255;
                                  var11 = ((255 & mf.field_u[0]) << 939091784) - -(mf.field_u[1] & 255);
                                  break L7;
                                } else {
                                  break L5;
                                }
                              } else {
                                try {
                                  L10: {
                                    ((sp) this).field_d.a((byte) 106, mf.field_u, 0, 10);
                                    decompiledRegionSelector0 = 0;
                                    break L10;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L11: {
                                    var14 = (EOFException) (Object) decompiledCaughtException;
                                    decompiledRegionSelector0 = 1;
                                    break L11;
                                  }
                                }
                                if (decompiledRegionSelector0 == 0) {
                                  var10 = ((255 & mf.field_u[7]) << 107332424) + (((255 & mf.field_u[6]) << -178619568) - -(255 & mf.field_u[8]));
                                  var12 = (mf.field_u[5] & 255) + ((255 & mf.field_u[4]) << -1149990680);
                                  var13 = 255 & mf.field_u[9];
                                  var11 = (mf.field_u[2] << -1951568472 & 65280) + ((-16777216 & mf.field_u[0] << 960159352) + ((mf.field_u[1] & 255) << 1327807312)) + (mf.field_u[3] & 255);
                                  break L7;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L12: {
                              if (param1 != var11) {
                                break L12;
                              } else {
                                if (var9 != var12) {
                                  break L12;
                                } else {
                                  if (((sp) this).field_e != var13) {
                                    break L12;
                                  } else {
                                    L13: {
                                      if (0 > var10) {
                                        break L13;
                                      } else {
                                        if (((sp) this).field_d.b(0) / 520L >= (long)var10) {
                                          break L6;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    stackOut_41_0 = 0;
                                    stackIn_42_0 = stackOut_41_0;
                                    stackOut_42_0 = stackIn_42_0;
                                    stackIn_43_0 = stackOut_42_0;
                                    return stackIn_43_0 != 0;
                                  }
                                }
                              }
                            }
                            stackOut_35_0 = 0;
                            stackIn_36_0 = stackOut_35_0;
                            stackOut_36_0 = stackIn_36_0;
                            stackIn_37_0 = stackOut_36_0;
                            return stackIn_37_0 != 0;
                          }
                        }
                        L14: {
                          if (var10 != 0) {
                            break L14;
                          } else {
                            L15: {
                              param4 = false;
                              var10 = (int)((519L + ((sp) this).field_d.b(0)) / 520L);
                              if (var10 != 0) {
                                break L15;
                              } else {
                                var10++;
                                break L15;
                              }
                            }
                            if (var10 == var7_int) {
                              var10++;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                        L16: {
                          if (512 >= param0 + -var8) {
                            var10 = 0;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        L17: {
                          if (param1 > 65535) {
                            L18: {
                              mf.field_u[3] = (byte)param1;
                              mf.field_u[4] = (byte)(var9 >> -535926008);
                              mf.field_u[0] = (byte)(param1 >> 575388664);
                              mf.field_u[9] = (byte)((sp) this).field_e;
                              mf.field_u[6] = (byte)(var10 >> 2027704848);
                              mf.field_u[7] = (byte)(var10 >> -1577040536);
                              mf.field_u[2] = (byte)(param1 >> 914050952);
                              mf.field_u[8] = (byte)var10;
                              mf.field_u[1] = (byte)(param1 >> -1490354480);
                              mf.field_u[5] = (byte)var9;
                              ((sp) this).field_d.a((long)(520 * var7_int), -1);
                              ((sp) this).field_d.a(122, mf.field_u, 0, 10);
                              var11 = param0 - var8;
                              if (var11 > 510) {
                                var11 = 510;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            ((sp) this).field_d.a(125, param2, var8, var11);
                            var8 = var8 + var11;
                            break L17;
                          } else {
                            L19: {
                              mf.field_u[2] = (byte)(var9 >> -984878680);
                              mf.field_u[5] = (byte)(var10 >> -1197842904);
                              mf.field_u[0] = (byte)(param1 >> 52614984);
                              mf.field_u[6] = (byte)var10;
                              mf.field_u[3] = (byte)var9;
                              mf.field_u[7] = (byte)((sp) this).field_e;
                              mf.field_u[1] = (byte)param1;
                              mf.field_u[4] = (byte)(var10 >> -965320496);
                              ((sp) this).field_d.a((long)(520 * var7_int), -1);
                              ((sp) this).field_d.a(122, mf.field_u, 0, 8);
                              var11 = param0 - var8;
                              if (var11 <= 512) {
                                break L19;
                              } else {
                                var11 = 512;
                                break L19;
                              }
                            }
                            ((sp) this).field_d.a(123, param2, var8, var11);
                            var8 = var8 + var11;
                            break L17;
                          }
                        }
                        var9++;
                        var7_int = var10;
                        continue L4;
                      }
                    }
                    stackOut_62_0 = 1;
                    stackIn_63_0 = stackOut_62_0;
                    stackOut_63_0 = stackIn_63_0;
                    stackIn_64_0 = stackOut_63_0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                stackOut_65_0 = 0;
                stackIn_66_0 = stackOut_65_0;
                return stackIn_66_0 != 0;
              }
              return stackIn_64_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((sp) this).field_e;
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        if (param0 != 113) {
            field_c = null;
        }
        field_c = null;
    }

    final boolean a(int param0, byte[] param1, byte param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        var5 = (Object) (Object) ((sp) this).field_d;
        synchronized (var5) {
          L0: {
            L1: {
              if ((param0 ^ -1) > -1) {
                break L1;
              } else {
                if (param0 <= ((sp) this).field_g) {
                  L2: {
                    if (param2 == 101) {
                      break L2;
                    } else {
                      field_f = null;
                      break L2;
                    }
                  }
                  L3: {
                    var6 = this.a(param0, param3, param1, 112, true) ? 1 : 0;
                    if (var6 == 0) {
                      var6 = this.a(param0, param3, param1, 126, false) ? 1 : 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackOut_9_0 = var6;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException();
          }
        }
        return stackIn_10_0 != 0;
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
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            Object stackIn_39_0 = null;
            Object stackIn_40_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_38_0 = null;
            Object stackOut_39_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_54_0 = null;
            var18 = CrazyCrystals.field_B;
            var3 = (Object) (Object) ((sp) this).field_d;
            synchronized (var3) {
              try {
                L0: {
                  if (((sp) this).field_b.b(0) >= (long)(6 * param1 + 6)) {
                    ((sp) this).field_b.a((long)(param1 * 6), -1);
                    ((sp) this).field_b.a((byte) 106, mf.field_u, 0, 6);
                    var4_int = (255 & mf.field_u[2]) + ((65280 & mf.field_u[1] << 46729832) + ((255 & mf.field_u[0]) << 790693200));
                    var5 = (255 & mf.field_u[5]) + ((mf.field_u[4] & 255) << -397509304) + ((mf.field_u[3] & 255) << -2118395600);
                    if (var4_int >= 0) {
                      if (((sp) this).field_g >= var4_int) {
                        if (var5 > 0) {
                          if (((long)var5 ^ -1L) >= (((sp) this).field_d.b(0) / 520L ^ -1L)) {
                            L1: {
                              if (!param0) {
                                break L1;
                              } else {
                                field_f = null;
                                break L1;
                              }
                            }
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_51_0 = (byte[]) var6;
                                stackIn_52_0 = stackOut_51_0;
                                stackOut_52_0 = (byte[]) (Object) stackIn_52_0;
                                stackIn_53_0 = stackOut_52_0;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L3: {
                                    ((sp) this).field_d.a((long)(var5 * 520), -1);
                                    var9 = var4_int - var7;
                                    if ((param1 ^ -1) >= -65536) {
                                      L4: {
                                        var14 = 8;
                                        if (var9 > 512) {
                                          var9 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      ((sp) this).field_d.a((byte) 106, mf.field_u, 0, var9 + var14);
                                      var12 = (mf.field_u[5] << 1075548712 & 65280) + ((16711680 & mf.field_u[4] << -406590864) - -(255 & mf.field_u[6]));
                                      var10 = (mf.field_u[1] & 255) + (65280 & mf.field_u[0] << -1575642872);
                                      var13 = mf.field_u[7] & 255;
                                      var11 = (255 & mf.field_u[3]) + ((255 & mf.field_u[2]) << 196757256);
                                      break L3;
                                    } else {
                                      L5: {
                                        if (510 >= var9) {
                                          break L5;
                                        } else {
                                          var9 = 510;
                                          break L5;
                                        }
                                      }
                                      var14 = 10;
                                      ((sp) this).field_d.a((byte) 106, mf.field_u, 0, var9 - -var14);
                                      var10 = ((255 & mf.field_u[2]) << 746298728) + (((mf.field_u[0] & 255) << 873205432) - -(16711680 & mf.field_u[1] << 1232728240)) + (255 & mf.field_u[3]);
                                      var12 = (255 & mf.field_u[8]) + (((255 & mf.field_u[6]) << 601678384) + (65280 & mf.field_u[7] << -490639608));
                                      var11 = (65280 & mf.field_u[4] << -98522328) + (mf.field_u[5] & 255);
                                      var13 = 255 & mf.field_u[9];
                                      break L3;
                                    }
                                  }
                                  if (var10 == param1) {
                                    if (var11 == var8) {
                                      if (var13 == ((sp) this).field_e) {
                                        if (-1 >= (var12 ^ -1)) {
                                          if ((((sp) this).field_d.b(0) / 520L ^ -1L) <= ((long)var12 ^ -1L)) {
                                            var15 = var9 + var14;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var16 >= var15) {
                                                var5 = var12;
                                                var8++;
                                                continue L2;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = mf.field_u[var16];
                                                var16++;
                                                continue L6;
                                              }
                                            }
                                          } else {
                                            return null;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        stackOut_38_0 = null;
                                        stackIn_39_0 = stackOut_38_0;
                                        stackOut_39_0 = stackIn_39_0;
                                        stackIn_40_0 = stackOut_39_0;
                                        return (byte[]) (Object) stackIn_40_0;
                                      }
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    return null;
                                  }
                                } else {
                                  stackOut_22_0 = null;
                                  stackIn_23_0 = stackOut_22_0;
                                  stackOut_23_0 = stackIn_23_0;
                                  stackIn_24_0 = stackOut_23_0;
                                  return (byte[]) (Object) stackIn_24_0;
                                }
                              }
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

    sp(int param0, qa param1, qa param2, int param3) {
        ((sp) this).field_d = null;
        ((sp) this).field_b = null;
        ((sp) this).field_g = 65000;
        ((sp) this).field_d = param1;
        ((sp) this).field_g = param3;
        ((sp) this).field_b = param2;
        ((sp) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ng(256);
        field_f = new sj(15, 0, 1, 0);
    }
}
