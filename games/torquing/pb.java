/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pb {
    private int field_a;
    private o field_d;
    static int field_e;
    static String field_c;
    private int field_b;
    private o field_f;
    static String field_g;

    public final String toString() {
        return "" + ((pb) this).field_a;
    }

    private final boolean a(boolean param0, int param1, byte[] param2, byte param3, int param4) {
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
            int var14 = 0;
            EOFException var15 = null;
            Throwable var16 = null;
            int var17 = 0;
            int stackIn_6_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_62_0 = 0;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_61_0 = 0;
            var17 = Torquing.field_u;
            var6 = (Object) (Object) ((pb) this).field_d;
            synchronized (var6) {
              try {
                L0: {
                  L1: {
                    if (param0) {
                      if (((pb) this).field_f.b(true) >= (long)(6 + 6 * param1)) {
                        L2: {
                          ((pb) this).field_f.a(false, (long)(6 * param1));
                          ((pb) this).field_f.a(0, aa.field_X, 6, -80);
                          var7_int = (aa.field_X[3] << 312276432 & 16711680) + (aa.field_X[4] << 231526056 & 65280) - -(255 & aa.field_X[5]);
                          if (-1 <= (var7_int ^ -1)) {
                            break L2;
                          } else {
                            if ((((pb) this).field_d.b(true) / 520L ^ -1L) <= ((long)var7_int ^ -1L)) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        stackOut_12_0 = stackIn_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      } else {
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        stackOut_6_0 = stackIn_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0 != 0;
                      }
                    } else {
                      var7_int = (int)((519L + ((pb) this).field_d.b(true)) / 520L);
                      if (0 != var7_int) {
                        break L1;
                      } else {
                        var7_int = 1;
                        break L1;
                      }
                    }
                  }
                  aa.field_X[0] = (byte)(param4 >> -1446502544);
                  aa.field_X[1] = (byte)(param4 >> -1978744280);
                  aa.field_X[2] = (byte)param4;
                  aa.field_X[3] = (byte)(var7_int >> 187571792);
                  aa.field_X[4] = (byte)(var7_int >> -1022605624);
                  aa.field_X[5] = (byte)var7_int;
                  ((pb) this).field_f.a(false, (long)(6 * param1));
                  ((pb) this).field_f.a(-1, 6, 0, aa.field_X);
                  var9 = 120 % ((-33 - param3) / 62);
                  var8 = 0;
                  var10 = 0;
                  L3: while (true) {
                    L4: {
                      if (param4 <= var8) {
                        break L4;
                      } else {
                        L5: {
                          var11 = 0;
                          if (param0) {
                            L6: {
                              ((pb) this).field_d.a(false, (long)(var7_int * 520));
                              if (65535 >= param1) {
                                try {
                                  L7: {
                                    ((pb) this).field_d.a(0, aa.field_X, 8, -108);
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
                                  var11 = (255 & aa.field_X[6]) + (65280 & aa.field_X[5] << -1255839736) + ((255 & aa.field_X[4]) << -53827344);
                                  var14 = aa.field_X[7] & 255;
                                  var12 = (aa.field_X[1] & 255) + (65280 & aa.field_X[0] << -1145538424);
                                  var13 = (255 & aa.field_X[3]) + ((aa.field_X[2] & 255) << 1293577096);
                                  break L6;
                                } else {
                                  break L4;
                                }
                              } else {
                                try {
                                  L9: {
                                    ((pb) this).field_d.a(0, aa.field_X, 10, -89);
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
                                  var11 = (aa.field_X[7] << 886533768 & 65280) + ((aa.field_X[6] & 255) << 637079696) + (255 & aa.field_X[8]);
                                  var12 = (255 & aa.field_X[3]) + ((65280 & aa.field_X[2] << -1699596984) + ((aa.field_X[0] & 255) << -1048076936)) + ((aa.field_X[1] & 255) << -1176723248);
                                  var14 = aa.field_X[9] & 255;
                                  var13 = (aa.field_X[4] << 1940400968 & 65280) - -(255 & aa.field_X[5]);
                                  break L6;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L11: {
                              if (var12 != param1) {
                                break L11;
                              } else {
                                if (var13 != var10) {
                                  break L11;
                                } else {
                                  if (var14 == ((pb) this).field_a) {
                                    L12: {
                                      if (-1 < (var11 ^ -1)) {
                                        break L12;
                                      } else {
                                        if (((long)var11 ^ -1L) >= (((pb) this).field_d.b(true) / 520L ^ -1L)) {
                                          break L5;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    stackOut_37_0 = 0;
                                    stackIn_38_0 = stackOut_37_0;
                                    stackOut_38_0 = stackIn_38_0;
                                    stackIn_39_0 = stackOut_38_0;
                                    return stackIn_39_0 != 0;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            stackOut_31_0 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            stackOut_32_0 = stackIn_32_0;
                            stackIn_33_0 = stackOut_32_0;
                            return stackIn_33_0 != 0;
                          } else {
                            break L5;
                          }
                        }
                        L13: {
                          if (var11 != 0) {
                            break L13;
                          } else {
                            L14: {
                              param0 = false;
                              var11 = (int)((((pb) this).field_d.b(true) - -519L) / 520L);
                              if (0 == var11) {
                                var11++;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            if (var7_int != var11) {
                              break L13;
                            } else {
                              var11++;
                              break L13;
                            }
                          }
                        }
                        L15: {
                          if (512 < param4 + -var8) {
                            break L15;
                          } else {
                            var11 = 0;
                            break L15;
                          }
                        }
                        L16: {
                          if (-65536 <= (param1 ^ -1)) {
                            L17: {
                              aa.field_X[6] = (byte)var11;
                              aa.field_X[0] = (byte)(param1 >> 546197000);
                              aa.field_X[2] = (byte)(var10 >> 777522120);
                              aa.field_X[3] = (byte)var10;
                              aa.field_X[1] = (byte)param1;
                              aa.field_X[5] = (byte)(var11 >> -1223753400);
                              aa.field_X[4] = (byte)(var11 >> 1921631856);
                              aa.field_X[7] = (byte)((pb) this).field_a;
                              ((pb) this).field_d.a(false, (long)(var7_int * 520));
                              ((pb) this).field_d.a(-1, 8, 0, aa.field_X);
                              var12 = -var8 + param4;
                              if (512 < var12) {
                                var12 = 512;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            ((pb) this).field_d.a(-1, var12, var8, param2);
                            var8 = var8 + var12;
                            break L16;
                          } else {
                            L18: {
                              aa.field_X[5] = (byte)var10;
                              aa.field_X[8] = (byte)var11;
                              aa.field_X[4] = (byte)(var10 >> 1239034312);
                              aa.field_X[1] = (byte)(param1 >> 1714449712);
                              aa.field_X[9] = (byte)((pb) this).field_a;
                              aa.field_X[0] = (byte)(param1 >> -667863592);
                              aa.field_X[7] = (byte)(var11 >> -460186136);
                              aa.field_X[6] = (byte)(var11 >> -989521872);
                              aa.field_X[3] = (byte)param1;
                              aa.field_X[2] = (byte)(param1 >> 1134286248);
                              ((pb) this).field_d.a(false, (long)(520 * var7_int));
                              ((pb) this).field_d.a(-1, 10, 0, aa.field_X);
                              var12 = param4 + -var8;
                              if ((var12 ^ -1) < -511) {
                                var12 = 510;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            ((pb) this).field_d.a(-1, var12, var8, param2);
                            var8 = var8 + var12;
                            break L16;
                          }
                        }
                        var10++;
                        var7_int = var11;
                        continue L3;
                      }
                    }
                    stackOut_58_0 = 1;
                    stackIn_59_0 = stackOut_58_0;
                    stackOut_59_0 = stackIn_59_0;
                    stackIn_60_0 = stackOut_59_0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                stackOut_61_0 = 0;
                stackIn_62_0 = stackOut_61_0;
                return stackIn_62_0 != 0;
              }
              return stackIn_60_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
            return;
        }
        field_c = null;
    }

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
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_7_0 = null;
            Object stackIn_8_0 = null;
            Object stackIn_25_0 = null;
            Object stackIn_26_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_24_0 = null;
            Object stackOut_25_0 = null;
            Object stackOut_6_0 = null;
            Object stackOut_7_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_56_0 = null;
            var18 = Torquing.field_u;
            var3 = (Object) (Object) ((pb) this).field_d;
            synchronized (var3) {
              try {
                L0: {
                  if (((pb) this).field_f.b(true) >= (long)(6 + 6 * param0)) {
                    ((pb) this).field_f.a(false, (long)(param0 * 6));
                    ((pb) this).field_f.a(0, aa.field_X, 6, param1 + 25);
                    var4_int = ((aa.field_X[0] & 255) << 1044040496) - -((255 & aa.field_X[1]) << 2106940872) - -(255 & aa.field_X[2]);
                    if (param1 == 85) {
                      var5 = ((aa.field_X[3] & 255) << 1038810128) + ((255 & aa.field_X[4]) << 2114852392) - -(255 & aa.field_X[5]);
                      if (var4_int >= 0) {
                        if (((pb) this).field_b >= var4_int) {
                          if (0 < var5) {
                            if (((long)var5 ^ -1L) >= (((pb) this).field_d.b(true) / 520L ^ -1L)) {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              var8 = 0;
                              L1: while (true) {
                                if (var4_int <= var7) {
                                  stackOut_53_0 = (byte[]) var6;
                                  stackIn_54_0 = stackOut_53_0;
                                  stackOut_54_0 = (byte[]) (Object) stackIn_54_0;
                                  stackIn_55_0 = stackOut_54_0;
                                  break L0;
                                } else {
                                  if (-1 != (var5 ^ -1)) {
                                    L2: {
                                      ((pb) this).field_d.a(false, (long)(520 * var5));
                                      var9 = var4_int - var7;
                                      if (param0 > 65535) {
                                        L3: {
                                          var14 = 10;
                                          if ((var9 ^ -1) < -511) {
                                            var9 = 510;
                                            break L3;
                                          } else {
                                            break L3;
                                          }
                                        }
                                        ((pb) this).field_d.a(0, aa.field_X, var9 + var14, -76);
                                        var11 = (aa.field_X[5] & 255) + (aa.field_X[4] << 1537373224 & 65280);
                                        var13 = aa.field_X[9] & 255;
                                        var10 = (aa.field_X[3] & 255) + ((aa.field_X[0] << -409561576 & -16777216) + ((16711680 & aa.field_X[1] << 945438480) - -(aa.field_X[2] << -1292531608 & 65280)));
                                        var12 = (255 & aa.field_X[8]) + (((255 & aa.field_X[6]) << 1096311312) + ((255 & aa.field_X[7]) << 568542824));
                                        break L2;
                                      } else {
                                        L4: {
                                          var14 = 8;
                                          if (512 < var9) {
                                            var9 = 512;
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        }
                                        ((pb) this).field_d.a(0, aa.field_X, var9 - -var14, -113);
                                        var10 = (aa.field_X[1] & 255) + (65280 & aa.field_X[0] << -193984792);
                                        var13 = 255 & aa.field_X[7];
                                        var11 = ((aa.field_X[2] & 255) << -1312346424) + (aa.field_X[3] & 255);
                                        var12 = (255 & aa.field_X[6]) + (aa.field_X[4] << 686440656 & 16711680) - -(aa.field_X[5] << 412463240 & 65280);
                                        break L2;
                                      }
                                    }
                                    if (var10 == param0) {
                                      if (var8 == var11) {
                                        if (var13 == ((pb) this).field_a) {
                                          if (var12 >= 0) {
                                            if (((long)var12 ^ -1L) >= (((pb) this).field_d.b(true) / 520L ^ -1L)) {
                                              var15 = var9 + var14;
                                              var8++;
                                              var5 = var12;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (var15 <= var16) {
                                                  continue L1;
                                                } else {
                                                  int incrementValue$1 = var7;
                                                  var7++;
                                                  var6[incrementValue$1] = aa.field_X[var16];
                                                  var16++;
                                                  continue L5;
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
                      stackOut_6_0 = null;
                      stackIn_7_0 = stackOut_6_0;
                      stackOut_7_0 = stackIn_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      return (byte[]) (Object) stackIn_8_0;
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

    final boolean a(int param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_9_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        if (param1 == 10282) {
          var5 = (Object) (Object) ((pb) this).field_d;
          synchronized (var5) {
            L0: {
              L1: {
                if (-1 < (param3 ^ -1)) {
                  break L1;
                } else {
                  if (((pb) this).field_b >= param3) {
                    L2: {
                      var6 = this.a(true, param0, param2, (byte) -122, param3) ? 1 : 0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        var6 = this.a(false, param0, param2, (byte) -123, param3) ? 1 : 0;
                        break L2;
                      }
                    }
                    stackOut_8_0 = var6;
                    stackIn_9_0 = stackOut_8_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_9_0 != 0;
        } else {
          return false;
        }
    }

    final static t[] a(String param0, int param1, String param2, la param3) {
        int var4 = param3.a(param1, param2);
        int var5 = param3.a(param0, param1 + -103, var4);
        return mi.a(var4, param3, var5, 482809644);
    }

    pb(int param0, o param1, o param2, int param3) {
        ((pb) this).field_d = null;
        ((pb) this).field_b = 65000;
        ((pb) this).field_f = null;
        ((pb) this).field_a = param0;
        ((pb) this).field_f = param2;
        ((pb) this).field_b = param3;
        ((pb) this).field_d = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_c = "Unpacking music";
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
