/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bq {
    static int[] field_g;
    private int field_h;
    static String field_f;
    private of field_b;
    static boolean field_c;
    static ao field_i;
    private of field_d;
    static ja field_a;
    private int field_e;

    final byte[] a(int param0, int param1) {
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
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_39_0 = null;
            byte[] stackIn_50_0 = null;
            byte[] stackIn_51_0 = null;
            Object stackIn_53_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_49_0 = null;
            byte[] stackOut_50_0 = null;
            Object stackOut_37_0 = null;
            Object stackOut_38_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_52_0 = null;
            var18 = ZombieDawnMulti.field_E ? 1 : 0;
            var3 = (Object) (Object) ((bq) this).field_b;
            synchronized (var3) {
              try {
                L0: {
                  if (((bq) this).field_d.c(param0 ^ -2) >= (long)(6 * param1 + 6)) {
                    ((bq) this).field_d.a((long)(param1 * 6), (byte) -70);
                    ((bq) this).field_d.a(6, 0, la.field_g, 47);
                    var4_int = (la.field_g[2] & 255) + (((la.field_g[param0] & 255) << 8) + ((255 & la.field_g[0]) << 16));
                    var5 = ((255 & la.field_g[3]) << 16) + (la.field_g[4] << 8 & 65280) - -(la.field_g[5] & 255);
                    if (var4_int >= 0) {
                      if (((bq) this).field_e >= var4_int) {
                        if (var5 > 0) {
                          if (((bq) this).field_b.c(-1) / 520L >= (long)var5) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_49_0 = (byte[]) var6;
                                stackIn_50_0 = stackOut_49_0;
                                stackOut_50_0 = (byte[]) (Object) stackIn_50_0;
                                stackIn_51_0 = stackOut_50_0;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L2: {
                                    ((bq) this).field_b.a((long)(520 * var5), (byte) -70);
                                    var9 = var4_int - var7;
                                    if (param1 > 65535) {
                                      L3: {
                                        if (var9 > 510) {
                                          var9 = 510;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                      var14 = 10;
                                      ((bq) this).field_b.a(var9 + var14, 0, la.field_g, param0 + -96);
                                      var12 = (la.field_g[8] & 255) + ((16711680 & la.field_g[6] << 16) - -(65280 & la.field_g[7] << 8));
                                      var11 = (la.field_g[5] & 255) + (la.field_g[4] << 8 & 65280);
                                      var13 = 255 & la.field_g[9];
                                      var10 = (65280 & la.field_g[2] << 8) + ((255 & la.field_g[1]) << 16) + (((255 & la.field_g[0]) << 24) + (la.field_g[3] & 255));
                                      break L2;
                                    } else {
                                      L4: {
                                        if (512 < var9) {
                                          var9 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var14 = 8;
                                      ((bq) this).field_b.a(var14 + var9, 0, la.field_g, 68);
                                      var12 = (la.field_g[6] & 255) + ((255 & la.field_g[5]) << 8) + (la.field_g[4] << 16 & 16711680);
                                      var13 = la.field_g[7] & 255;
                                      var10 = (65280 & la.field_g[0] << 8) - -(la.field_g[1] & 255);
                                      var11 = (255 & la.field_g[3]) + (65280 & la.field_g[2] << 8);
                                      break L2;
                                    }
                                  }
                                  if (param1 == var10) {
                                    if (var8 == var11) {
                                      if (var13 == ((bq) this).field_h) {
                                        if (var12 >= 0) {
                                          if (~(((bq) this).field_b.c(-1) / 520L) <= ~(long)var12) {
                                            var15 = var9 + var14;
                                            var5 = var12;
                                            var8++;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var15 <= var16) {
                                                continue L1;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = la.field_g[var16];
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
                                        stackOut_37_0 = null;
                                        stackIn_38_0 = stackOut_37_0;
                                        stackOut_38_0 = stackIn_38_0;
                                        stackIn_39_0 = stackOut_38_0;
                                        return (byte[]) (Object) stackIn_39_0;
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
                stackOut_52_0 = null;
                stackIn_53_0 = stackOut_52_0;
                return (byte[]) (Object) stackIn_53_0;
              }
              return stackIn_51_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_g = null;
        field_a = null;
        field_f = null;
        field_i = null;
    }

    final boolean a(byte param0, byte[] param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          var5 = (Object) (Object) ((bq) this).field_b;
          synchronized (var5) {
            L0: {
              L1: {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (param2 <= ((bq) this).field_e) {
                    L2: {
                      var6 = this.a(true, param1, (byte) 49, param2, param3) ? 1 : 0;
                      if (param0 == 118) {
                        break L2;
                      } else {
                        ((bq) this).field_b = null;
                        break L2;
                      }
                    }
                    L3: {
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var6 = this.a(false, param1, (byte) 49, param2, param3) ? 1 : 0;
                        break L3;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5_ref;
            stackOut_12_1 = new StringBuilder().append("bq.A(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final String toString() {
        return "" + ((bq) this).field_h;
    }

    private final boolean a(boolean param0, byte[] param1, byte param2, int param3, int param4) {
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
            int stackIn_10_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_16_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_67_0 = 0;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            String stackIn_73_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_66_0 = 0;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            String stackOut_71_2 = null;
            var16 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              var6_ref2 = (Object) (Object) ((bq) this).field_b;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param0) {
                        if ((long)(6 * param4 - -6) <= ((bq) this).field_d.c(-1)) {
                          L2: {
                            ((bq) this).field_d.a((long)(param4 * 6), (byte) -70);
                            ((bq) this).field_d.a(6, 0, la.field_g, -128);
                            var7_int = (la.field_g[5] & 255) + ((255 & la.field_g[4]) << 8) + (16711680 & la.field_g[3] << 16);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (~(long)var7_int < ~(((bq) this).field_b.c(-1) / 520L)) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackOut_16_0 = stackIn_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0 != 0;
                        } else {
                          stackOut_9_0 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          stackOut_10_0 = stackIn_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0 != 0;
                        }
                      } else {
                        var7_int = (int)((((bq) this).field_b.c(-1) + 519L) / 520L);
                        if (0 == var7_int) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    la.field_g[1] = (byte)(param3 >> 8);
                    la.field_g[2] = (byte)param3;
                    la.field_g[0] = (byte)(param3 >> 16);
                    la.field_g[3] = (byte)(var7_int >> 16);
                    la.field_g[5] = (byte)var7_int;
                    la.field_g[4] = (byte)(var7_int >> 8);
                    ((bq) this).field_d.a((long)(param4 * 6), (byte) -70);
                    ((bq) this).field_d.a(-1, 6, 0, la.field_g);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (param3 <= var8) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (param0) {
                              L6: {
                                ((bq) this).field_b.a((long)(520 * var7_int), (byte) -70);
                                if (65535 >= param4) {
                                  try {
                                    L7: {
                                      ((bq) this).field_b.a(8, 0, la.field_g, -126);
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
                                    var10 = ((255 & la.field_g[4]) << 16) - (-(65280 & la.field_g[5] << 8) + -(la.field_g[6] & 255));
                                    var12 = (65280 & la.field_g[2] << 8) - -(255 & la.field_g[3]);
                                    var11 = (la.field_g[1] & 255) + ((la.field_g[0] & 255) << 8);
                                    var13 = la.field_g[7] & 255;
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((bq) this).field_b.a(10, 0, la.field_g, -103);
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
                                    var13 = 255 & la.field_g[9];
                                    var11 = (la.field_g[3] & 255) + (((la.field_g[2] & 255) << 8) + ((la.field_g[0] & 255) << 24)) + (16711680 & la.field_g[1] << 16);
                                    var12 = ((255 & la.field_g[4]) << 8) + (255 & la.field_g[5]);
                                    var10 = (65280 & la.field_g[7] << 8) + ((255 & la.field_g[6]) << 16) - -(la.field_g[8] & 255);
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
                                    if (((bq) this).field_h == var13) {
                                      L12: {
                                        if (0 > var10) {
                                          break L12;
                                        } else {
                                          if ((long)var10 > ((bq) this).field_b.c(-1) / 520L) {
                                            break L12;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      stackOut_41_0 = 0;
                                      stackIn_42_0 = stackOut_41_0;
                                      stackOut_42_0 = stackIn_42_0;
                                      stackIn_43_0 = stackOut_42_0;
                                      return stackIn_43_0 != 0;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              stackOut_35_0 = 0;
                              stackIn_36_0 = stackOut_35_0;
                              stackOut_36_0 = stackIn_36_0;
                              stackIn_37_0 = stackOut_36_0;
                              return stackIn_37_0 != 0;
                            } else {
                              break L5;
                            }
                          }
                          L13: {
                            if (var10 != 0) {
                              break L13;
                            } else {
                              L14: {
                                var10 = (int)((519L + ((bq) this).field_b.c(-1)) / 520L);
                                param0 = false;
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
                            if (-var8 + param3 <= 512) {
                              var10 = 0;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (param4 <= 65535) {
                              L17: {
                                la.field_g[6] = (byte)var10;
                                la.field_g[0] = (byte)(param4 >> 8);
                                la.field_g[4] = (byte)(var10 >> 16);
                                la.field_g[2] = (byte)(var9 >> 8);
                                la.field_g[3] = (byte)var9;
                                la.field_g[5] = (byte)(var10 >> 8);
                                la.field_g[7] = (byte)((bq) this).field_h;
                                la.field_g[1] = (byte)param4;
                                ((bq) this).field_b.a((long)(var7_int * 520), (byte) -70);
                                ((bq) this).field_b.a(-1, 8, 0, la.field_g);
                                var11 = param3 + -var8;
                                if (512 < var11) {
                                  var11 = 512;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((bq) this).field_b.a(-1, var11, var8, param1);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                la.field_g[3] = (byte)param4;
                                la.field_g[5] = (byte)var9;
                                la.field_g[1] = (byte)(param4 >> 16);
                                la.field_g[2] = (byte)(param4 >> 8);
                                la.field_g[8] = (byte)var10;
                                la.field_g[9] = (byte)((bq) this).field_h;
                                la.field_g[0] = (byte)(param4 >> 24);
                                la.field_g[7] = (byte)(var10 >> 8);
                                la.field_g[6] = (byte)(var10 >> 16);
                                la.field_g[4] = (byte)(var9 >> 8);
                                ((bq) this).field_b.a((long)(520 * var7_int), (byte) -70);
                                ((bq) this).field_b.a(-1, 10, 0, la.field_g);
                                var11 = param3 - var8;
                                if (510 >= var11) {
                                  break L18;
                                } else {
                                  var11 = 510;
                                  break L18;
                                }
                              }
                              ((bq) this).field_b.a(-1, var11, var8, param1);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L3;
                        }
                      }
                      stackOut_63_0 = 1;
                      stackIn_64_0 = stackOut_63_0;
                      stackOut_64_0 = stackIn_64_0;
                      stackIn_65_0 = stackOut_64_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_66_0 = 0;
                  stackIn_67_0 = stackOut_66_0;
                  return stackIn_67_0 != 0;
                }
                return stackIn_65_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_70_0 = (RuntimeException) var6_ref;
                stackOut_70_1 = new StringBuilder().append("bq.C(").append(param0).append(44);
                stackIn_72_0 = stackOut_70_0;
                stackIn_72_1 = stackOut_70_1;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                if (param1 == null) {
                  stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
                  stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
                  stackOut_72_2 = "null";
                  stackIn_73_0 = stackOut_72_0;
                  stackIn_73_1 = stackOut_72_1;
                  stackIn_73_2 = stackOut_72_2;
                  break L19;
                } else {
                  stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
                  stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
                  stackOut_71_2 = "{...}";
                  stackIn_73_0 = stackOut_71_0;
                  stackIn_73_1 = stackOut_71_1;
                  stackIn_73_2 = stackOut_71_2;
                  break L19;
                }
              }
              throw fa.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 44 + 49 + 44 + param3 + 44 + param4 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    bq(int param0, of param1, of param2, int param3) {
        ((bq) this).field_d = null;
        ((bq) this).field_b = null;
        ((bq) this).field_e = 65000;
        try {
            ((bq) this).field_e = param3;
            ((bq) this).field_h = param0;
            ((bq) this).field_b = param1;
            ((bq) this).field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "bq.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_g = new int[8192];
        field_i = new ao(8, 0, 4, 1);
    }
}
