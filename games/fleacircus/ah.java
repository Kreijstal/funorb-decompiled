/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ah {
    private int field_b;
    static sf field_a;
    static boolean field_c;
    private int field_d;
    static int[] field_g;
    private k field_f;
    private k field_e;

    public final String toString() {
        return "" + this.field_d;
    }

    final boolean a(byte[] param0, int param1, int param2, byte param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var5 = this.field_f;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param1 < 0) {
                    break L2;
                  } else {
                    if (this.field_b >= param1) {
                      L3: {
                        var6 = this.a((byte) 37, param0, param1, param2, true) ? 1 : 0;
                        if (var6 != 0) {
                          break L3;
                        } else {
                          var6 = this.a((byte) 37, param0, param1, param2, false) ? 1 : 0;
                          break L3;
                        }
                      }
                      var7 = -45 % ((param3 - 42) / 43);
                      stackOut_6_0 = var6;
                      stackIn_7_0 = stackOut_6_0;
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
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5_ref);
            stackOut_10_1 = new StringBuilder().append("ah.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final boolean a(byte param0, byte[] param1, int param2, int param3, boolean param4) {
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
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_64_0 = 0;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            String stackIn_70_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_63_0 = 0;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            String stackOut_69_2 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            var16 = fleas.field_A ? 1 : 0;
            try {
              var6_ref2 = this.field_f;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param4) {
                        var7_int = (int)((this.field_f.c((byte) -91) - -519L) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if ((this.field_e.c((byte) -123) ^ -1L) <= ((long)(6 + param3 * 6) ^ -1L)) {
                          L2: {
                            this.field_e.a(-116, (long)(param3 * 6));
                            this.field_e.a(nf.field_G, 0, 6, 6520);
                            var7_int = (nf.field_G[5] & 255) + ((16711680 & nf.field_G[3] << -1991428912) + ((255 & nf.field_G[4]) << -672335256));
                            if ((var7_int ^ -1) >= -1) {
                              break L2;
                            } else {
                              if (this.field_f.c((byte) -83) / 520L < (long)var7_int) {
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
                          decompiledRegionSelector2 = 1;
                          break L0;
                        } else {
                          stackOut_4_0 = 0;
                          stackIn_5_0 = stackOut_4_0;
                          stackOut_5_0 = stackIn_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        }
                      }
                    }
                    L3: {
                      nf.field_G[0] = (byte)(param2 >> 1634713456);
                      nf.field_G[2] = (byte)param2;
                      nf.field_G[3] = (byte)(var7_int >> -1536108208);
                      nf.field_G[5] = (byte)var7_int;
                      nf.field_G[1] = (byte)(param2 >> -1298468600);
                      nf.field_G[4] = (byte)(var7_int >> 440007432);
                      this.field_e.a(param0 ^ -81, (long)(6 * param3));
                      if (param0 == 37) {
                        break L3;
                      } else {
                        ah.a(103);
                        break L3;
                      }
                    }
                    this.field_e.a(0, nf.field_G, 6, (byte) 114);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (param2 <= var8) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (param4) {
                              L7: {
                                this.field_f.a(-124, (long)(var7_int * 520));
                                if (-65536 <= (param3 ^ -1)) {
                                  try {
                                    L8: {
                                      this.field_f.a(nf.field_G, 0, 8, 6520);
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
                                    var11 = (nf.field_G[0] << -307250616 & 65280) - -(255 & nf.field_G[1]);
                                    var13 = nf.field_G[7] & 255;
                                    var12 = (65280 & nf.field_G[2] << -667106104) - -(nf.field_G[3] & 255);
                                    var10 = (65280 & nf.field_G[5] << 390184104) + (((255 & nf.field_G[4]) << 310161104) + (nf.field_G[6] & 255));
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      this.field_f.a(nf.field_G, 0, 10, 6520);
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
                                    var10 = (65280 & nf.field_G[7] << -1402330968) + ((nf.field_G[6] & 255) << -1763458992) + (nf.field_G[8] & 255);
                                    var11 = (255 & nf.field_G[3]) + (nf.field_G[2] << 1900449864 & 65280) + (((255 & nf.field_G[1]) << -1481339888) + ((255 & nf.field_G[0]) << -305278632));
                                    var12 = ((255 & nf.field_G[4]) << -1288486424) - -(255 & nf.field_G[5]);
                                    var13 = nf.field_G[9] & 255;
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
                                  if (var12 != var9) {
                                    break L12;
                                  } else {
                                    if (this.field_d == var13) {
                                      L13: {
                                        if ((var10 ^ -1) > -1) {
                                          break L13;
                                        } else {
                                          if (this.field_f.c((byte) -76) / 520L < (long)var10) {
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
                            if (0 != var10) {
                              break L14;
                            } else {
                              L15: {
                                param4 = false;
                                var10 = (int)((519L + this.field_f.c((byte) -48)) / 520L);
                                if (0 == var10) {
                                  var10++;
                                  break L15;
                                } else {
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
                            if (-513 > (param2 + -var8 ^ -1)) {
                              break L16;
                            } else {
                              var10 = 0;
                              break L16;
                            }
                          }
                          L17: {
                            if (-65536 <= (param3 ^ -1)) {
                              L18: {
                                nf.field_G[4] = (byte)(var10 >> 1366220400);
                                nf.field_G[7] = (byte)this.field_d;
                                nf.field_G[0] = (byte)(param3 >> 382906856);
                                nf.field_G[5] = (byte)(var10 >> 385167112);
                                nf.field_G[3] = (byte)var9;
                                nf.field_G[2] = (byte)(var9 >> -904389912);
                                nf.field_G[6] = (byte)var10;
                                nf.field_G[1] = (byte)param3;
                                this.field_f.a(-111, (long)(var7_int * 520));
                                this.field_f.a(0, nf.field_G, 8, (byte) 92);
                                var11 = -var8 + param2;
                                if (var11 <= 512) {
                                  break L18;
                                } else {
                                  var11 = 512;
                                  break L18;
                                }
                              }
                              this.field_f.a(var8, param1, var11, (byte) -30);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                nf.field_G[3] = (byte)param3;
                                nf.field_G[8] = (byte)var10;
                                nf.field_G[6] = (byte)(var10 >> 1717980144);
                                nf.field_G[0] = (byte)(param3 >> -1758518504);
                                nf.field_G[4] = (byte)(var9 >> -409607000);
                                nf.field_G[7] = (byte)(var10 >> 623552520);
                                nf.field_G[2] = (byte)(param3 >> 1878880328);
                                nf.field_G[9] = (byte)this.field_d;
                                nf.field_G[1] = (byte)(param3 >> -632159568);
                                nf.field_G[5] = (byte)var9;
                                this.field_f.a(-104, (long)(520 * var7_int));
                                this.field_f.a(0, nf.field_G, 10, (byte) 76);
                                var11 = param2 - var8;
                                if (var11 <= 510) {
                                  break L19;
                                } else {
                                  var11 = 510;
                                  break L19;
                                }
                              }
                              this.field_f.a(var8, param1, var11, (byte) -59);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L4;
                        }
                      }
                      stackOut_60_0 = 1;
                      stackIn_61_0 = stackOut_60_0;
                      stackOut_61_0 = stackIn_61_0;
                      stackIn_62_0 = stackOut_61_0;
                      decompiledRegionSelector2 = 4;
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
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_6_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_12_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_36_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_42_0 != 0;
                      } else {
                        return stackIn_62_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_67_0 = (RuntimeException) (var6_ref);
                stackOut_67_1 = new StringBuilder().append("ah.A(").append(param0).append(',');
                stackIn_69_0 = stackOut_67_0;
                stackIn_69_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (param1 == null) {
                  stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
                  stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
                  stackOut_69_2 = "null";
                  stackIn_70_0 = stackOut_69_0;
                  stackIn_70_1 = stackOut_69_1;
                  stackIn_70_2 = stackOut_69_2;
                  break L20;
                } else {
                  stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
                  stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
                  stackOut_68_2 = "{...}";
                  stackIn_70_0 = stackOut_68_0;
                  stackIn_70_1 = stackOut_68_1;
                  stackIn_70_2 = stackOut_68_2;
                  break L20;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
            ah.a(18);
        }
        field_a = null;
    }

    final byte[] a(byte param0, int param1) {
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
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_36_0 = null;
            Object stackIn_37_0 = null;
            byte[] stackIn_49_0 = null;
            byte[] stackIn_50_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            byte[] stackOut_48_0 = null;
            byte[] stackOut_49_0 = null;
            Object stackOut_35_0 = null;
            Object stackOut_36_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_54_0 = null;
            var18 = fleas.field_A ? 1 : 0;
            var3 = this.field_f;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 + param1 * 6) <= this.field_e.c((byte) -110)) {
                    this.field_e.a(-119, (long)(6 * param1));
                    this.field_e.a(nf.field_G, 0, 6, 6520);
                    var4_int = ((nf.field_G[0] & 255) << 535287472) + ((nf.field_G[1] << -876367736 & 65280) + (255 & nf.field_G[2]));
                    var5 = (65280 & nf.field_G[4] << -2096846200) + ((16711680 & nf.field_G[3] << 1331838288) - -(nf.field_G[5] & 255));
                    if ((var4_int ^ -1) <= -1) {
                      if (var4_int <= this.field_b) {
                        if (0 < var5) {
                          if ((long)var5 <= this.field_f.c((byte) -103) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var4_int <= var7) {
                                if (param0 == -90) {
                                  stackOut_51_0 = (byte[]) (var6);
                                  stackIn_52_0 = stackOut_51_0;
                                  stackOut_52_0 = (byte[]) ((Object) stackIn_52_0);
                                  stackIn_53_0 = stackOut_52_0;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                } else {
                                  stackOut_48_0 = (byte[]) null;
                                  stackIn_49_0 = stackOut_48_0;
                                  stackOut_49_0 = (byte[]) ((Object) stackIn_49_0);
                                  stackIn_50_0 = stackOut_49_0;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                }
                              } else {
                                if (0 != var5) {
                                  L2: {
                                    this.field_f.a(param0 + -23, (long)(var5 * 520));
                                    var9 = -var7 + var4_int;
                                    if (65535 >= param1) {
                                      L3: {
                                        var14 = 8;
                                        if (-513 <= (var9 ^ -1)) {
                                          break L3;
                                        } else {
                                          var9 = 512;
                                          break L3;
                                        }
                                      }
                                      this.field_f.a(nf.field_G, 0, var14 + var9, 6520);
                                      var12 = (nf.field_G[6] & 255) + (((255 & nf.field_G[5]) << -1340155288) + ((255 & nf.field_G[4]) << 193044976));
                                      var10 = ((255 & nf.field_G[0]) << 1142077704) - -(255 & nf.field_G[1]);
                                      var11 = (65280 & nf.field_G[2] << -1178278136) + (255 & nf.field_G[3]);
                                      var13 = 255 & nf.field_G[7];
                                      break L2;
                                    } else {
                                      L4: {
                                        var14 = 10;
                                        if (var9 <= 510) {
                                          break L4;
                                        } else {
                                          var9 = 510;
                                          break L4;
                                        }
                                      }
                                      this.field_f.a(nf.field_G, 0, var9 - -var14, 6520);
                                      var10 = ((255 & nf.field_G[0]) << 1234177400) - -(16711680 & nf.field_G[1] << 288839536) - -(65280 & nf.field_G[2] << -1544675288) - -(nf.field_G[3] & 255);
                                      var11 = (nf.field_G[4] << -815187416 & 65280) + (255 & nf.field_G[5]);
                                      var13 = nf.field_G[9] & 255;
                                      var12 = (65280 & nf.field_G[7] << 339341960) + (16711680 & nf.field_G[6] << 1326112048) - -(nf.field_G[8] & 255);
                                      break L2;
                                    }
                                  }
                                  if (var10 == param1) {
                                    if (var8 == var11) {
                                      if (this.field_d == var13) {
                                        if ((var12 ^ -1) <= -1) {
                                          if ((long)var12 <= this.field_f.c((byte) -125) / 520L) {
                                            var15 = var9 + var14;
                                            var5 = var12;
                                            var8++;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var15 <= var16) {
                                                continue L1;
                                              } else {
                                                incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = nf.field_G[var16];
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
                                        stackOut_35_0 = null;
                                        stackIn_36_0 = stackOut_35_0;
                                        stackOut_36_0 = stackIn_36_0;
                                        stackIn_37_0 = stackOut_36_0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
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
                                  decompiledRegionSelector0 = 3;
                                  break L0;
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
                stackOut_54_0 = null;
                stackIn_55_0 = stackOut_54_0;
                return (byte[]) ((Object) stackIn_55_0);
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
                    if (decompiledRegionSelector0 == 3) {
                      return (byte[]) ((Object) stackIn_22_0);
                    } else {
                      if (decompiledRegionSelector0 == 4) {
                        return (byte[]) ((Object) stackIn_37_0);
                      } else {
                        if (decompiledRegionSelector0 == 5) {
                          return stackIn_50_0;
                        } else {
                          return stackIn_53_0;
                        }
                      }
                    }
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
        boolean discarded$17 = false;
        boolean discarded$18 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_c = true;
                break L1;
              }
            }
            if (vf.c((byte) -5)) {
              discarded$17 = mg.field_a.a(hm.field_d, param0 + 41, true, bk.field_b);
              mg.field_a.d(true);
              L2: while (true) {
                if (!wf.b(-113)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$18 = mg.field_a.a(id.field_b, (byte) -105, ji.field_a);
                  continue L2;
                }
              }
            } else {
              L3: {
                if (null == rh.field_p) {
                  break L3;
                } else {
                  if (!rh.field_p.field_c) {
                    break L3;
                  } else {
                    lh.a(false);
                    mg.field_a.b(new ic(mg.field_a, fb.field_g), (byte) -35);
                    break L3;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "ah.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ah(int param0, k param1, k param2, int param3) {
        this.field_b = 65000;
        this.field_f = null;
        this.field_e = null;
        try {
            this.field_b = param3;
            this.field_e = param2;
            this.field_f = param1;
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ah.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = false;
        field_g = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
