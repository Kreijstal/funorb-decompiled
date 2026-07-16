/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rn {
    private uo field_a;
    private int field_d;
    static wm field_f;
    private uo field_e;
    private int field_c;
    static int field_b;
    static String field_g;

    final boolean a(int param0, byte[] param1, boolean param2, int param3) {
        Object var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        var5_ref = (Object) (Object) ((rn) this).field_a;
        synchronized (var5_ref) {
          L0: {
            L1: {
              if ((param0 ^ -1) > -1) {
                break L1;
              } else {
                if (((rn) this).field_c < param0) {
                  break L1;
                } else {
                  var6 = this.a(true, 7, param1, param3, param0) ? 1 : 0;
                  if (!param2) {
                    L2: {
                      if (var6 != 0) {
                        break L2;
                      } else {
                        var6 = this.a(false, 7, param1, param3, param0) ? 1 : 0;
                        break L2;
                      }
                    }
                    stackOut_10_0 = var6;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  }
                }
              }
            }
            throw new IllegalArgumentException();
          }
        }
        return stackIn_11_0 != 0;
    }

    private final boolean a(boolean param0, int param1, byte[] param2, int param3, int param4) {
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
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_65_0 = 0;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_6_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_64_0 = 0;
            var16 = Pixelate.field_H ? 1 : 0;
            var6 = (Object) (Object) ((rn) this).field_a;
            synchronized (var6) {
              try {
                L0: {
                  L1: {
                    if (param0) {
                      if ((((rn) this).field_e.a(param1 + 59) ^ -1L) > ((long)(6 + param3 * 6) ^ -1L)) {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackOut_7_0 = stackIn_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0 != 0;
                      } else {
                        L2: {
                          ((rn) this).field_e.a((long)(6 * param3), 113);
                          ((rn) this).field_e.a(vi.field_K, (byte) 24, 6, 0);
                          var7_int = (vi.field_K[4] << 1709132264 & 65280) + ((vi.field_K[3] << 1453187088 & 16711680) + (vi.field_K[5] & 255));
                          if (-1 <= (var7_int ^ -1)) {
                            break L2;
                          } else {
                            if (((rn) this).field_a.a(116) / 520L < (long)var7_int) {
                              break L2;
                            } else {
                              break L1;
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
                      var7_int = (int)((519L + ((rn) this).field_a.a(41)) / 520L);
                      if (var7_int != 0) {
                        break L1;
                      } else {
                        var7_int = 1;
                        break L1;
                      }
                    }
                  }
                  L3: {
                    if (param1 == 7) {
                      break L3;
                    } else {
                      ((rn) this).field_c = 14;
                      break L3;
                    }
                  }
                  vi.field_K[4] = (byte)(var7_int >> -913538680);
                  vi.field_K[0] = (byte)(param4 >> 1101361424);
                  vi.field_K[5] = (byte)var7_int;
                  vi.field_K[3] = (byte)(var7_int >> -1202333264);
                  vi.field_K[1] = (byte)(param4 >> 164193576);
                  vi.field_K[2] = (byte)param4;
                  ((rn) this).field_e.a((long)(param3 * 6), 118);
                  ((rn) this).field_e.a(6, 0, (byte) -106, vi.field_K);
                  var8 = 0;
                  var9 = 0;
                  L4: while (true) {
                    L5: {
                      if ((var8 ^ -1) <= (param4 ^ -1)) {
                        break L5;
                      } else {
                        L6: {
                          var10 = 0;
                          if (param0) {
                            L7: {
                              ((rn) this).field_a.a((long)(520 * var7_int), -101);
                              if ((param3 ^ -1) >= -65536) {
                                try {
                                  L8: {
                                    ((rn) this).field_a.a(vi.field_K, (byte) 24, 8, 0);
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
                                  var11 = (255 & vi.field_K[1]) + (vi.field_K[0] << 440736488 & 65280);
                                  var12 = ((255 & vi.field_K[2]) << -914754808) - -(vi.field_K[3] & 255);
                                  var13 = 255 & vi.field_K[7];
                                  var10 = (vi.field_K[6] & 255) + ((255 & vi.field_K[5]) << -252034648) + (vi.field_K[4] << -286330640 & 16711680);
                                  break L7;
                                } else {
                                  break L5;
                                }
                              } else {
                                try {
                                  L10: {
                                    ((rn) this).field_a.a(vi.field_K, (byte) 24, 10, 0);
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
                                  var11 = (vi.field_K[0] << 1875347256 & -16777216) - (-((255 & vi.field_K[1]) << 1231293488) + -((vi.field_K[2] & 255) << -951934392)) - -(vi.field_K[3] & 255);
                                  var10 = (vi.field_K[7] << 1893183048 & 65280) + ((255 & vi.field_K[6]) << 664826960) + (vi.field_K[8] & 255);
                                  var13 = 255 & vi.field_K[9];
                                  var12 = ((255 & vi.field_K[4]) << -752250104) - -(255 & vi.field_K[5]);
                                  break L7;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L12: {
                              if (var11 != param3) {
                                break L12;
                              } else {
                                if (var9 != var12) {
                                  break L12;
                                } else {
                                  if (var13 != ((rn) this).field_d) {
                                    break L12;
                                  } else {
                                    L13: {
                                      if (0 > var10) {
                                        break L13;
                                      } else {
                                        if ((long)var10 > ((rn) this).field_a.a(102) / 520L) {
                                          break L13;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    stackOut_40_0 = 0;
                                    stackIn_41_0 = stackOut_40_0;
                                    stackOut_41_0 = stackIn_41_0;
                                    stackIn_42_0 = stackOut_41_0;
                                    return stackIn_42_0 != 0;
                                  }
                                }
                              }
                            }
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            stackOut_35_0 = stackIn_35_0;
                            stackIn_36_0 = stackOut_35_0;
                            return stackIn_36_0 != 0;
                          } else {
                            break L6;
                          }
                        }
                        L14: {
                          if (-1 != (var10 ^ -1)) {
                            break L14;
                          } else {
                            L15: {
                              param0 = false;
                              var10 = (int)((((rn) this).field_a.a(75) + 519L) / 520L);
                              if (0 != var10) {
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
                          if (-513 <= (param4 - var8 ^ -1)) {
                            var10 = 0;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        L17: {
                          if (-65536 <= (param3 ^ -1)) {
                            L18: {
                              vi.field_K[4] = (byte)(var10 >> 956319856);
                              vi.field_K[7] = (byte)((rn) this).field_d;
                              vi.field_K[1] = (byte)param3;
                              vi.field_K[5] = (byte)(var10 >> 1257980520);
                              vi.field_K[0] = (byte)(param3 >> -1957155320);
                              vi.field_K[3] = (byte)var9;
                              vi.field_K[2] = (byte)(var9 >> 2115901704);
                              vi.field_K[6] = (byte)var10;
                              ((rn) this).field_a.a((long)(var7_int * 520), 126);
                              ((rn) this).field_a.a(8, 0, (byte) -116, vi.field_K);
                              var11 = param4 - var8;
                              if (512 < var11) {
                                var11 = 512;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            ((rn) this).field_a.a(var11, var8, (byte) -89, param2);
                            var8 = var8 + var11;
                            break L17;
                          } else {
                            L19: {
                              vi.field_K[6] = (byte)(var10 >> 734656816);
                              vi.field_K[7] = (byte)(var10 >> 1382533288);
                              vi.field_K[4] = (byte)(var9 >> -200253112);
                              vi.field_K[2] = (byte)(param3 >> -309361304);
                              vi.field_K[8] = (byte)var10;
                              vi.field_K[5] = (byte)var9;
                              vi.field_K[9] = (byte)((rn) this).field_d;
                              vi.field_K[1] = (byte)(param3 >> 770421552);
                              vi.field_K[3] = (byte)param3;
                              vi.field_K[0] = (byte)(param3 >> -269496008);
                              ((rn) this).field_a.a((long)(520 * var7_int), -112);
                              ((rn) this).field_a.a(10, 0, (byte) -88, vi.field_K);
                              var11 = param4 - var8;
                              if ((var11 ^ -1) >= -511) {
                                break L19;
                              } else {
                                var11 = 510;
                                break L19;
                              }
                            }
                            ((rn) this).field_a.a(var11, var8, (byte) -107, param2);
                            var8 = var8 + var11;
                            break L17;
                          }
                        }
                        var7_int = var10;
                        var9++;
                        continue L4;
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
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != 512) {
            Object var2 = null;
            boolean discarded$0 = rn.a((byte) -3, (we) null);
        }
    }

    final static fl a(String param0, byte param1) {
        L0: {
          if (!an.field_e.d(param1 ^ -49)) {
            break L0;
          } else {
            if (!param0.equals((Object) (Object) an.field_e.b((byte) 81))) {
              an.field_e = ii.a((byte) 119, param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        if (param1 != -99) {
          return null;
        } else {
          return an.field_e;
        }
    }

    final static void a(byte param0) {
        if (param0 < 110) {
            field_g = null;
        }
    }

    public final String toString() {
        return "" + ((rn) this).field_d;
    }

    final static boolean a(byte param0, we param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = param1.f(255);
        if (param0 <= 32) {
          return false;
        } else {
          L0: {
            if ((var2 ^ -1) != -2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          var3 = stackIn_4_0;
          return var3 != 0;
        }
    }

    final byte[] a(int param0, int param1) {
        try {
            int var3 = 0;
            Object var4 = null;
            IOException var5 = null;
            int var5_int = 0;
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
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_44_0 = null;
            Object stackIn_45_0 = null;
            byte[] stackIn_51_0 = null;
            byte[] stackIn_52_0 = null;
            Object stackIn_54_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_50_0 = null;
            byte[] stackOut_51_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_44_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_53_0 = null;
            var19 = Pixelate.field_H ? 1 : 0;
            var3 = -91 % ((param0 - 68) / 41);
            var4 = (Object) (Object) ((rn) this).field_a;
            synchronized (var4) {
              try {
                L0: {
                  if (((rn) this).field_e.a(39) >= (long)(6 * param1 + 6)) {
                    ((rn) this).field_e.a((long)(param1 * 6), -108);
                    ((rn) this).field_e.a(vi.field_K, (byte) 24, 6, 0);
                    var5_int = ((255 & vi.field_K[0]) << -1834250928) + ((65280 & vi.field_K[1] << 1357116616) - -(255 & vi.field_K[2]));
                    var6 = ((255 & vi.field_K[3]) << 1625994992) - (-(vi.field_K[4] << -1919277976 & 65280) + -(255 & vi.field_K[5]));
                    if (-1 >= (var5_int ^ -1)) {
                      if (((rn) this).field_c >= var5_int) {
                        if (0 < var6) {
                          if ((((rn) this).field_a.a(52) / 520L ^ -1L) <= ((long)var6 ^ -1L)) {
                            var7 = new byte[var5_int];
                            var8 = 0;
                            var9 = 0;
                            L1: while (true) {
                              if (var8 >= var5_int) {
                                stackOut_50_0 = (byte[]) var7;
                                stackIn_51_0 = stackOut_50_0;
                                stackOut_51_0 = (byte[]) (Object) stackIn_51_0;
                                stackIn_52_0 = stackOut_51_0;
                                break L0;
                              } else {
                                if (-1 != (var6 ^ -1)) {
                                  L2: {
                                    ((rn) this).field_a.a((long)(var6 * 520), 106);
                                    var10 = var5_int + -var8;
                                    if (param1 <= 65535) {
                                      L3: {
                                        var15 = 8;
                                        if (512 < var10) {
                                          var10 = 512;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                      ((rn) this).field_a.a(vi.field_K, (byte) 24, var10 + var15, 0);
                                      var11 = (255 & vi.field_K[1]) + (vi.field_K[0] << -1320926040 & 65280);
                                      var13 = (255 & vi.field_K[6]) + (vi.field_K[5] << -1914559512 & 65280) + (vi.field_K[4] << -248486320 & 16711680);
                                      var12 = (vi.field_K[3] & 255) + (vi.field_K[2] << 1462266856 & 65280);
                                      var14 = 255 & vi.field_K[7];
                                      break L2;
                                    } else {
                                      L4: {
                                        if (var10 > 510) {
                                          var10 = 510;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var15 = 10;
                                      ((rn) this).field_a.a(vi.field_K, (byte) 24, var15 + var10, 0);
                                      var14 = 255 & vi.field_K[9];
                                      var13 = (vi.field_K[6] << 1116434512 & 16711680) + ((65280 & vi.field_K[7] << -304438744) - -(vi.field_K[8] & 255));
                                      var11 = (255 & vi.field_K[3]) + (vi.field_K[2] << -1025002552 & 65280) + ((-16777216 & vi.field_K[0] << -1837166888) - -(vi.field_K[1] << -1746605552 & 16711680));
                                      var12 = (255 & vi.field_K[5]) + (65280 & vi.field_K[4] << 260126696);
                                      break L2;
                                    }
                                  }
                                  if (var11 == param1) {
                                    if (var9 == var12) {
                                      if (((rn) this).field_d == var14) {
                                        if (-1 >= (var13 ^ -1)) {
                                          if (((long)var13 ^ -1L) >= (((rn) this).field_a.a(81) / 520L ^ -1L)) {
                                            var16 = var10 + var15;
                                            var6 = var13;
                                            var17 = var15;
                                            L5: while (true) {
                                              if (var16 <= var17) {
                                                var9++;
                                                continue L1;
                                              } else {
                                                int incrementValue$1 = var8;
                                                var8++;
                                                var7[incrementValue$1] = vi.field_K[var17];
                                                var17++;
                                                continue L5;
                                              }
                                            }
                                          } else {
                                            stackOut_43_0 = null;
                                            stackIn_44_0 = stackOut_43_0;
                                            stackOut_44_0 = stackIn_44_0;
                                            stackIn_45_0 = stackOut_44_0;
                                            return (byte[]) (Object) stackIn_45_0;
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
                  } else {
                    return null;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5 = (IOException) (Object) decompiledCaughtException;
                stackOut_53_0 = null;
                stackIn_54_0 = stackOut_53_0;
                return (byte[]) (Object) stackIn_54_0;
              }
              return stackIn_52_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rn(int param0, uo param1, uo param2, int param3) {
        ((rn) this).field_a = null;
        ((rn) this).field_e = null;
        ((rn) this).field_c = 65000;
        ((rn) this).field_a = param1;
        ((rn) this).field_d = param0;
        ((rn) this).field_e = param2;
        ((rn) this).field_c = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new wm(0, 2, 2, 1);
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
