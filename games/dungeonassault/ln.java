/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ln {
    static int field_e;
    private int field_b;
    static int field_d;
    static String field_c;
    private int field_a;
    private hd field_f;
    private hd field_g;

    final static void a(ni param0, int param1) {
        String discarded$0 = null;
        try {
            if (param1 != -28711) {
                String var3 = (String) null;
                discarded$0 = ln.a(-57, (String) null, -45);
            }
            wa.field_j.a(param0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ln.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(int param0, String param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_7_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var3 = bh.a(125, param0);
            if (var3 == null) {
              stackOut_2_0 = (String) (param1);
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 == 255) {
                stackOut_7_0 = jk.a(new String[]{param1}, var3, 30496);
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_5_0 = (String) null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("ln.H(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
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
            int var17 = 0;
            Throwable var18 = null;
            int var19 = 0;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            byte[] stackIn_48_0 = null;
            byte[] stackIn_49_0 = null;
            Object stackIn_51_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_47_0 = null;
            byte[] stackOut_48_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_50_0 = null;
            var19 = DungeonAssault.field_K;
            var3 = this.field_f;
            synchronized (var3) {
              try {
                L0: {
                  if (((long)(6 + param0 * 6) ^ -1L) >= (this.field_g.a((byte) -92) ^ -1L)) {
                    this.field_g.a((long)(6 * param0), -26296);
                    this.field_g.a(0, -1, un.field_c, 6);
                    var4_int = ((255 & un.field_c[0]) << -1462858384) + (((un.field_c[1] & 255) << -788749752) - -(un.field_c[2] & 255));
                    var5 = (un.field_c[5] & 255) + (((un.field_c[4] & 255) << 1148357992) + ((un.field_c[3] & 255) << -2120662384));
                    if ((var4_int ^ -1) <= -1) {
                      if (var4_int <= this.field_b) {
                        if ((var5 ^ -1) < -1) {
                          if (((long)var5 ^ -1L) >= (this.field_f.a((byte) -92) / 520L ^ -1L)) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = -83 / ((-59 - param1) / 54);
                            var9 = 0;
                            L1: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_47_0 = (byte[]) (var6);
                                stackIn_48_0 = stackOut_47_0;
                                stackOut_48_0 = (byte[]) ((Object) stackIn_48_0);
                                stackIn_49_0 = stackOut_48_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L2: {
                                    this.field_f.a((long)(var5 * 520), -26296);
                                    var10 = var4_int + -var7;
                                    if ((param0 ^ -1) >= -65536) {
                                      L3: {
                                        if (-513 <= (var10 ^ -1)) {
                                          break L3;
                                        } else {
                                          var10 = 512;
                                          break L3;
                                        }
                                      }
                                      var15 = 8;
                                      this.field_f.a(0, -1, un.field_c, var15 + var10);
                                      var11 = (65280 & un.field_c[0] << -1113447160) - -(255 & un.field_c[1]);
                                      var14 = 255 & un.field_c[7];
                                      var13 = ((un.field_c[5] & 255) << -916305912) + (((un.field_c[4] & 255) << -1785412368) + (255 & un.field_c[6]));
                                      var12 = (un.field_c[3] & 255) + (65280 & un.field_c[2] << -1546843992);
                                      break L2;
                                    } else {
                                      L4: {
                                        var15 = 10;
                                        if (510 >= var10) {
                                          break L4;
                                        } else {
                                          var10 = 510;
                                          break L4;
                                        }
                                      }
                                      this.field_f.a(0, -1, un.field_c, var15 + var10);
                                      var13 = ((255 & un.field_c[6]) << 2049609680) - (-((un.field_c[7] & 255) << -1692605240) + -(un.field_c[8] & 255));
                                      var14 = 255 & un.field_c[9];
                                      var11 = (un.field_c[3] & 255) + ((65280 & un.field_c[2] << 1801615208) + (-16777216 & un.field_c[0] << 1188319192) + ((un.field_c[1] & 255) << -724508368));
                                      var12 = ((un.field_c[4] & 255) << 762675880) + (255 & un.field_c[5]);
                                      break L2;
                                    }
                                  }
                                  if (var11 == param0) {
                                    if (var9 == var12) {
                                      if (var14 == this.field_a) {
                                        if (0 <= var13) {
                                          if ((long)var13 <= this.field_f.a((byte) -92) / 520L) {
                                            var16 = var15 + var10;
                                            var5 = var13;
                                            var9++;
                                            var17 = var15;
                                            L5: while (true) {
                                              if (var16 <= var17) {
                                                continue L1;
                                              } else {
                                                incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = un.field_c[var17];
                                                var17++;
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
                                  return null;
                                }
                              }
                            }
                          } else {
                            stackOut_14_0 = null;
                            stackIn_15_0 = stackOut_14_0;
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
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
                stackOut_50_0 = null;
                stackIn_51_0 = stackOut_50_0;
                return (byte[]) ((Object) stackIn_51_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_4_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_10_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_16_0);
                  } else {
                    return stackIn_49_0;
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

    final static void a(long param0, byte param1) {
        try {
            try {
                Thread.sleep(param0);
            } catch (InterruptedException interruptedException) {
            }
            if (param1 > -41) {
                field_d = -95;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static cd a(byte param0) {
        String var1 = vl.c(param0 + -29335);
        if (var1 != null) {
            if (!(0 > var1.indexOf('@'))) {
                var1 = "";
            }
        }
        if (param0 != -120) {
            field_e = -79;
        }
        return new cd(vl.c(param0 + -29335), pi.c(-555));
    }

    public static void b(int param0) {
        if (param0 != 1148357992) {
            field_c = (String) null;
        }
        field_c = null;
    }

    private final boolean a(boolean param0, int param1, int param2, boolean param3, byte[] param4) {
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
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
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
            var16 = DungeonAssault.field_K;
            try {
              var6_ref2 = this.field_f;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param3) {
                        if ((this.field_g.a((byte) -92) ^ -1L) <= ((long)(6 * param2 + 6) ^ -1L)) {
                          L2: {
                            this.field_g.a((long)(param2 * 6), -26296);
                            this.field_g.a(0, -1, un.field_c, 6);
                            var7_int = ((255 & un.field_c[4]) << 1348346536) + ((255 & un.field_c[3]) << 1204158256) - -(255 & un.field_c[5]);
                            if ((var7_int ^ -1) >= -1) {
                              break L2;
                            } else {
                              if (((long)var7_int ^ -1L) < (this.field_f.a((byte) -92) / 520L ^ -1L)) {
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
                          decompiledRegionSelector2 = 1;
                          break L0;
                        } else {
                          stackOut_6_0 = 0;
                          stackIn_7_0 = stackOut_6_0;
                          stackOut_7_0 = stackIn_7_0;
                          stackIn_8_0 = stackOut_7_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        }
                      } else {
                        var7_int = (int)((this.field_f.a((byte) -92) - -519L) / 520L);
                        if (-1 != (var7_int ^ -1)) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    L3: {
                      un.field_c[5] = (byte)var7_int;
                      un.field_c[3] = (byte)(var7_int >> -1698558448);
                      un.field_c[4] = (byte)(var7_int >> -826552312);
                      un.field_c[2] = (byte)param1;
                      un.field_c[0] = (byte)(param1 >> -61021776);
                      un.field_c[1] = (byte)(param1 >> -749040408);
                      this.field_g.a((long)(6 * param2), -26296);
                      this.field_g.a(0, -91, 6, un.field_c);
                      var8 = 0;
                      if (param0) {
                        break L3;
                      } else {
                        this.field_b = 88;
                        break L3;
                      }
                    }
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (var8 >= param1) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (param3) {
                              L7: {
                                this.field_f.a((long)(520 * var7_int), -26296);
                                if (65535 >= param2) {
                                  try {
                                    L8: {
                                      this.field_f.a(0, -1, un.field_c, 8);
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
                                    var12 = (65280 & un.field_c[2] << -2076167608) - -(un.field_c[3] & 255);
                                    var13 = un.field_c[7] & 255;
                                    var10 = (un.field_c[4] << 725757616 & 16711680) + (((un.field_c[5] & 255) << 1580256360) + (255 & un.field_c[6]));
                                    var11 = (un.field_c[1] & 255) + (un.field_c[0] << -924064856 & 65280);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      this.field_f.a(0, -1, un.field_c, 10);
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
                                    var11 = ((un.field_c[1] & 255) << -745070736) + ((-16777216 & un.field_c[0] << -913247752) + (un.field_c[2] << -35779800 & 65280) - -(un.field_c[3] & 255));
                                    var10 = (un.field_c[7] << -1302838360 & 65280) + ((un.field_c[6] & 255) << -202881328) + (255 & un.field_c[8]);
                                    var12 = ((255 & un.field_c[4]) << -595437304) + (255 & un.field_c[5]);
                                    var13 = 255 & un.field_c[9];
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L12: {
                                if (var11 != param2) {
                                  break L12;
                                } else {
                                  if (var9 != var12) {
                                    break L12;
                                  } else {
                                    if (this.field_a == var13) {
                                      L13: {
                                        if (-1 < (var10 ^ -1)) {
                                          break L13;
                                        } else {
                                          if (this.field_f.a((byte) -92) / 520L >= (long)var10) {
                                            break L6;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      stackOut_40_0 = 0;
                                      stackIn_41_0 = stackOut_40_0;
                                      stackOut_41_0 = stackIn_41_0;
                                      stackIn_42_0 = stackOut_41_0;
                                      decompiledRegionSelector2 = 3;
                                      break L0;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              stackOut_34_0 = 0;
                              stackIn_35_0 = stackOut_34_0;
                              stackOut_35_0 = stackIn_35_0;
                              stackIn_36_0 = stackOut_35_0;
                              decompiledRegionSelector2 = 2;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                          L14: {
                            if (0 == var10) {
                              L15: {
                                var10 = (int)((519L + this.field_f.a((byte) -92)) / 520L);
                                param3 = false;
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
                            } else {
                              break L14;
                            }
                          }
                          L16: {
                            if (-513 > (-var8 + param1 ^ -1)) {
                              break L16;
                            } else {
                              var10 = 0;
                              break L16;
                            }
                          }
                          L17: {
                            if (-65536 > (param2 ^ -1)) {
                              L18: {
                                un.field_c[1] = (byte)(param2 >> -1248707792);
                                un.field_c[7] = (byte)(var10 >> 199949032);
                                un.field_c[5] = (byte)var9;
                                un.field_c[6] = (byte)(var10 >> -678543280);
                                un.field_c[4] = (byte)(var9 >> -1875261528);
                                un.field_c[3] = (byte)param2;
                                un.field_c[0] = (byte)(param2 >> 1709216056);
                                un.field_c[9] = (byte)this.field_a;
                                un.field_c[2] = (byte)(param2 >> -536568184);
                                un.field_c[8] = (byte)var10;
                                this.field_f.a((long)(var7_int * 520), -26296);
                                this.field_f.a(0, -116, 10, un.field_c);
                                var11 = -var8 + param1;
                                if ((var11 ^ -1) < -511) {
                                  var11 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_f.a(var8, -106, var11, param4);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                un.field_c[2] = (byte)(var9 >> -383385144);
                                un.field_c[6] = (byte)var10;
                                un.field_c[5] = (byte)(var10 >> 1778938760);
                                un.field_c[1] = (byte)param2;
                                un.field_c[4] = (byte)(var10 >> 1275520304);
                                un.field_c[7] = (byte)this.field_a;
                                un.field_c[3] = (byte)var9;
                                un.field_c[0] = (byte)(param2 >> 706354440);
                                this.field_f.a((long)(520 * var7_int), -26296);
                                this.field_f.a(0, -97, 8, un.field_c);
                                var11 = -var8 + param1;
                                if (-513 <= (var11 ^ -1)) {
                                  break L19;
                                } else {
                                  var11 = 512;
                                  break L19;
                                }
                              }
                              this.field_f.a(var8, -125, var11, param4);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var9++;
                          var7_int = var10;
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
                  return stackIn_8_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_14_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_36_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_42_0 != 0;
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
                stackOut_68_1 = new StringBuilder().append("ln.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
              throw vk.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_a;
    }

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
        int decompiledRegionSelector0 = 0;
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
          L0: {
            if (param3 == -29447) {
              var5 = this.field_f;
              synchronized (var5) {
                L1: {
                  L2: {
                    if (param2 < 0) {
                      break L2;
                    } else {
                      if (this.field_b < param2) {
                        break L2;
                      } else {
                        L3: {
                          var6 = this.a(true, param2, param1, true, param0) ? 1 : 0;
                          if (var6 == 0) {
                            var6 = this.a(true, param2, param1, false, param0) ? 1 : 0;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        stackOut_11_0 = var6;
                        stackIn_12_0 = stackOut_11_0;
                        break L1;
                      }
                    }
                  }
                  throw new IllegalArgumentException();
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5_ref);
            stackOut_15_1 = new StringBuilder().append("ln.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 255) {
            return false;
        }
        return bl.field_r.b((byte) 113);
    }

    ln(int param0, hd param1, hd param2, int param3) {
        this.field_b = 65000;
        this.field_f = null;
        this.field_g = null;
        try {
            this.field_f = param1;
            this.field_g = param2;
            this.field_a = param0;
            this.field_b = param3;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ln.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = "Use this alternative as your account name";
    }
}
