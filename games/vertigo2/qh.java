/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh {
    static boolean field_f;
    static int[][] field_e;
    private int field_a;
    static boolean field_g;
    private int field_b;
    static byte[] field_d;
    static String field_c;
    private im field_h;
    private im field_i;

    public static void c(int param0) {
        field_e = (int[][]) null;
        field_c = null;
        field_d = null;
        if (param0 <= 46) {
            qh.c(126);
        }
    }

    final boolean a(int param0, int param1, byte[] param2, byte param3) {
        byte[] discarded$4 = null;
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
          L0: {
            var5 = this.field_h;
            synchronized (var5) {
              L1: {
                L2: {
                  if (0 > param0) {
                    break L2;
                  } else {
                    if (this.field_a >= param0) {
                      L3: {
                        var6 = this.a(true, param2, 255, param1, param0) ? 1 : 0;
                        if (param3 == -84) {
                          break L3;
                        } else {
                          discarded$4 = this.a(-6, -73);
                          break L3;
                        }
                      }
                      L4: {
                        if (var6 != 0) {
                          break L4;
                        } else {
                          var6 = this.a(false, param2, 255, param1, param0) ? 1 : 0;
                          break L4;
                        }
                      }
                      stackOut_8_0 = var6;
                      stackIn_9_0 = stackOut_8_0;
                      break L1;
                    } else {
                      break L2;
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
          L5: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5_ref);
            stackOut_12_1 = new StringBuilder().append("qh.D(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final byte[] a(int param0, int param1) {
        try {
            int incrementValue$1 = 0;
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
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            byte[] stackIn_51_0 = null;
            byte[] stackIn_52_0 = null;
            Object stackIn_54_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_50_0 = null;
            byte[] stackOut_51_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_53_0 = null;
            var18 = Vertigo2.field_L ? 1 : 0;
            var3 = this.field_h;
            synchronized (var3) {
              try {
                L0: {
                  if (((long)(6 * param0 + 6) ^ -1L) >= (this.field_i.c(-1) ^ -1L)) {
                    this.field_i.a(-23669, (long)(param0 * 6));
                    this.field_i.a(-128, 0, lf.field_D, 6);
                    var4_int = (255 & lf.field_D[2]) + ((lf.field_D[0] << -953229264 & 16711680) + (lf.field_D[1] << 282636328 & 65280));
                    var5 = (255 & lf.field_D[5]) + ((16711680 & lf.field_D[3] << 1938847472) + (lf.field_D[4] << 2022756392 & 65280));
                    if ((var4_int ^ -1) <= -1) {
                      if (this.field_a >= var4_int) {
                        L1: {
                          if (param1 == 27176) {
                            break L1;
                          } else {
                            field_g = true;
                            break L1;
                          }
                        }
                        if (0 < var5) {
                          if (((long)var5 ^ -1L) >= (this.field_h.c(-1) / 520L ^ -1L)) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var4_int <= var7) {
                                stackOut_50_0 = (byte[]) (var6);
                                stackIn_51_0 = stackOut_50_0;
                                stackOut_51_0 = (byte[]) ((Object) stackIn_51_0);
                                stackIn_52_0 = stackOut_51_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L3: {
                                    this.field_h.a(-23669, (long)(var5 * 520));
                                    var9 = -var7 + var4_int;
                                    if ((param0 ^ -1) >= -65536) {
                                      L4: {
                                        if ((var9 ^ -1) < -513) {
                                          var9 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var14 = 8;
                                      this.field_h.a(-127, 0, lf.field_D, var9 + var14);
                                      var12 = (255 & lf.field_D[6]) + (lf.field_D[5] << -1261980824 & 65280) + ((255 & lf.field_D[4]) << -868194640);
                                      var13 = 255 & lf.field_D[7];
                                      var10 = (255 & lf.field_D[1]) + ((lf.field_D[0] & 255) << 334869032);
                                      var11 = ((255 & lf.field_D[2]) << 1328000296) + (255 & lf.field_D[3]);
                                      break L3;
                                    } else {
                                      L5: {
                                        var14 = 10;
                                        if (510 >= var9) {
                                          break L5;
                                        } else {
                                          var9 = 510;
                                          break L5;
                                        }
                                      }
                                      this.field_h.a(-121, 0, lf.field_D, var9 - -var14);
                                      var12 = (255 & lf.field_D[8]) + ((255 & lf.field_D[7]) << 914174344) + (16711680 & lf.field_D[6] << -1216119280);
                                      var10 = (255 & lf.field_D[3]) + (lf.field_D[2] << -1586496472 & 65280) + ((lf.field_D[1] << 1898135696 & 16711680) + (-16777216 & lf.field_D[0] << -1282574984));
                                      var11 = (255 & lf.field_D[5]) + ((255 & lf.field_D[4]) << -1706133368);
                                      var13 = lf.field_D[9] & 255;
                                      break L3;
                                    }
                                  }
                                  if (param0 == var10) {
                                    if (var8 == var11) {
                                      if (this.field_b == var13) {
                                        if (-1 >= (var12 ^ -1)) {
                                          if ((long)var12 <= this.field_h.c(-1) / 520L) {
                                            var15 = var14 - -var9;
                                            var5 = var12;
                                            var8++;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var15 <= var16) {
                                                continue L2;
                                              } else {
                                                incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = lf.field_D[var16];
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
                                        return null;
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
                                  decompiledRegionSelector0 = 2;
                                  break L0;
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
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    stackOut_2_0 = null;
                    stackIn_3_0 = stackOut_2_0;
                    stackOut_3_0 = stackIn_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_53_0 = null;
                stackIn_54_0 = stackOut_53_0;
                return (byte[]) ((Object) stackIn_54_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_4_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_10_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_24_0);
                  } else {
                    return stackIn_52_0;
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

    final static void a(int param0) {
        if (param0 != -32739) {
          return;
        } else {
          L0: {
            if (ce.field_b == ro.field_g.field_d) {
              break L0;
            } else {
              tc.field_b = tc.field_b + (ro.field_g.field_d - ce.field_b);
              ce.field_b = ro.field_g.field_d;
              break L0;
            }
          }
          L1: {
            if ((da.field_i ^ -1) < -1) {
              da.field_i = da.field_i - 1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if ((da.field_i ^ -1) >= -1) {
              break L2;
            } else {
              kg.c((byte) 82);
              break L2;
            }
          }
          return;
        }
    }

    final static int b(int param0) {
        int var1 = 0;
        var1 = 15 / ((-32 - param0) / 63);
        pd.field_c.d(115);
        if (!kb.field_e.d(-3599)) {
          return f.g(0);
        } else {
          return 0;
        }
    }

    final static String d(int param0) {
        if (param0 != 0) {
            field_c = (String) null;
        }
        return lr.field_S;
    }

    public final String toString() {
        return "" + this.field_b;
    }

    private final boolean a(boolean param0, byte[] param1, int param2, int param3, int param4) {
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
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
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
            var16 = Vertigo2.field_L ? 1 : 0;
            try {
              var6_ref2 = this.field_h;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param2 == 255) {
                        break L1;
                      } else {
                        field_f = false;
                        break L1;
                      }
                    }
                    L2: {
                      if (param0) {
                        if ((long)(6 + param3 * 6) > this.field_i.c(param2 + -256)) {
                          stackOut_9_0 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          stackOut_10_0 = stackIn_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        } else {
                          L3: {
                            this.field_i.a(-23669, (long)(6 * param3));
                            this.field_i.a(-113, 0, lf.field_D, 6);
                            var7_int = (255 & lf.field_D[5]) + (((255 & lf.field_D[4]) << 1393811496) + (16711680 & lf.field_D[3] << -1467104336));
                            if (-1 <= (var7_int ^ -1)) {
                              break L3;
                            } else {
                              if ((long)var7_int <= this.field_h.c(-1) / 520L) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackOut_16_0 = stackIn_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        }
                      } else {
                        var7_int = (int)((this.field_h.c(param2 ^ -256) + 519L) / 520L);
                        if (var7_int != 0) {
                          break L2;
                        } else {
                          var7_int = 1;
                          break L2;
                        }
                      }
                    }
                    lf.field_D[1] = (byte)(param4 >> -1505835672);
                    lf.field_D[0] = (byte)(param4 >> 463165328);
                    lf.field_D[5] = (byte)var7_int;
                    lf.field_D[4] = (byte)(var7_int >> -326343640);
                    lf.field_D[3] = (byte)(var7_int >> 565628080);
                    lf.field_D[2] = (byte)param4;
                    this.field_i.a(-23669, (long)(param3 * 6));
                    this.field_i.a(param2 + -255, 6, 0, lf.field_D);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (var8 >= param4) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (param0) {
                              L7: {
                                this.field_h.a(-23669, (long)(var7_int * 520));
                                if ((param3 ^ -1) >= -65536) {
                                  try {
                                    L8: {
                                      this.field_h.a(-122, 0, lf.field_D, 8);
                                      decompiledRegionSelector0 = 0;
                                      break L8;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L9: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L9;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var13 = lf.field_D[7] & 255;
                                    var11 = (255 & lf.field_D[1]) + (65280 & lf.field_D[0] << 1015711592);
                                    var12 = (255 & lf.field_D[3]) + ((255 & lf.field_D[2]) << -904456472);
                                    var10 = ((lf.field_D[5] & 255) << -2022305144) + (((255 & lf.field_D[4]) << 477729040) + (255 & lf.field_D[6]));
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      this.field_h.a(param2 ^ -162, 0, lf.field_D, 10);
                                      decompiledRegionSelector1 = 0;
                                      break L10;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L11: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L11;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var12 = (lf.field_D[5] & 255) + ((lf.field_D[4] & 255) << 1457726344);
                                    var13 = lf.field_D[9] & 255;
                                    var11 = (255 & lf.field_D[3]) + ((lf.field_D[2] & 255) << 1014555016) + (((lf.field_D[1] & 255) << 944142832) + ((lf.field_D[0] & 255) << -1913244040));
                                    var10 = ((255 & lf.field_D[7]) << -1052741144) + ((16711680 & lf.field_D[6] << 418551440) + (255 & lf.field_D[8]));
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
                                    if (this.field_b == var13) {
                                      L13: {
                                        if (-1 < (var10 ^ -1)) {
                                          break L13;
                                        } else {
                                          if (this.field_h.c(-1) / 520L < (long)var10) {
                                            break L13;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      stackOut_41_0 = 0;
                                      stackIn_42_0 = stackOut_41_0;
                                      stackOut_42_0 = stackIn_42_0;
                                      stackIn_43_0 = stackOut_42_0;
                                      decompiledRegionSelector2 = 3;
                                      break L0;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              stackOut_35_0 = 0;
                              stackIn_36_0 = stackOut_35_0;
                              stackOut_36_0 = stackIn_36_0;
                              stackIn_37_0 = stackOut_36_0;
                              decompiledRegionSelector2 = 2;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                          L14: {
                            if (var10 == 0) {
                              L15: {
                                param0 = false;
                                var10 = (int)((this.field_h.c(-1) + 519L) / 520L);
                                if (-1 == (var10 ^ -1)) {
                                  var10++;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              if (var7_int != var10) {
                                break L14;
                              } else {
                                var10++;
                                break L14;
                              }
                            } else {
                              break L14;
                            }
                          }
                          L16: {
                            if (-513 > (-var8 + param4 ^ -1)) {
                              break L16;
                            } else {
                              var10 = 0;
                              break L16;
                            }
                          }
                          L17: {
                            if ((param3 ^ -1) >= -65536) {
                              L18: {
                                lf.field_D[7] = (byte)this.field_b;
                                lf.field_D[5] = (byte)(var10 >> -1630870456);
                                lf.field_D[2] = (byte)(var9 >> -1171449496);
                                lf.field_D[3] = (byte)var9;
                                lf.field_D[4] = (byte)(var10 >> 2124801712);
                                lf.field_D[1] = (byte)param3;
                                lf.field_D[6] = (byte)var10;
                                lf.field_D[0] = (byte)(param3 >> 1793840008);
                                this.field_h.a(-23669, (long)(var7_int * 520));
                                this.field_h.a(param2 + -255, 8, 0, lf.field_D);
                                var11 = param4 - var8;
                                if (-513 <= (var11 ^ -1)) {
                                  break L18;
                                } else {
                                  var11 = 512;
                                  break L18;
                                }
                              }
                              this.field_h.a(0, var11, var8, param1);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                lf.field_D[2] = (byte)(param3 >> 1528977672);
                                lf.field_D[5] = (byte)var9;
                                lf.field_D[3] = (byte)param3;
                                lf.field_D[4] = (byte)(var9 >> 1895254248);
                                lf.field_D[0] = (byte)(param3 >> 360804120);
                                lf.field_D[9] = (byte)this.field_b;
                                lf.field_D[1] = (byte)(param3 >> 346081008);
                                lf.field_D[6] = (byte)(var10 >> 34843184);
                                lf.field_D[8] = (byte)var10;
                                lf.field_D[7] = (byte)(var10 >> 1746676296);
                                this.field_h.a(-23669, (long)(520 * var7_int));
                                this.field_h.a(param2 ^ 255, 10, 0, lf.field_D);
                                var11 = param4 - var8;
                                if (510 >= var11) {
                                  break L19;
                                } else {
                                  var11 = 510;
                                  break L19;
                                }
                              }
                              this.field_h.a(param2 ^ 255, var11, var8, param1);
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
                      decompiledRegionSelector2 = 4;
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
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_11_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_17_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_37_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_43_0 != 0;
                      } else {
                        return stackIn_63_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_68_0 = (RuntimeException) (var6_ref);
                stackOut_68_1 = new StringBuilder().append("qh.C(").append(param0).append(',');
                stackIn_70_0 = stackOut_68_0;
                stackIn_70_1 = stackOut_68_1;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1;
                if (param1 == null) {
                  stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
                  stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
                  stackOut_70_2 = "null";
                  stackIn_71_0 = stackOut_70_0;
                  stackIn_71_1 = stackOut_70_1;
                  stackIn_71_2 = stackOut_70_2;
                  break L20;
                } else {
                  stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
                  stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
                  stackOut_69_2 = "{...}";
                  stackIn_71_0 = stackOut_69_0;
                  stackIn_71_1 = stackOut_69_1;
                  stackIn_71_2 = stackOut_69_2;
                  break L20;
                }
              }
              throw wn.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qh(int param0, im param1, im param2, int param3) {
        this.field_h = null;
        this.field_i = null;
        this.field_a = 65000;
        try {
            this.field_i = param2;
            this.field_h = param1;
            this.field_b = param0;
            this.field_a = param3;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "qh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = "Level <%0> of <%1>";
    }
}
