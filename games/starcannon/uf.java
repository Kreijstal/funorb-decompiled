/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uf {
    private int field_c;
    static boolean field_d;
    private td field_b;
    private td field_e;
    private int field_a;

    private final boolean a(byte param0, int param1, int param2, byte[] param3, boolean param4) {
        try {
            RuntimeException var6 = null;
            Object var6_ref = null;
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
            int stackIn_61_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_66_0 = 0;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            String stackIn_72_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_65_0 = 0;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            String stackOut_71_2 = null;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            String stackOut_70_2 = null;
            var16 = StarCannon.field_A;
            try {
              var6_ref = this.field_b;
              synchronized (var6_ref) {
                try {
                  L0: {
                    L1: {
                      if (!param4) {
                        var7_int = (int)((this.field_b.b(false) - -519L) / 520L);
                        if (0 != var7_int) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if ((long)(6 + param2 * 6) <= this.field_e.b(false)) {
                          L2: {
                            this.field_e.a((long)(param2 * 6), 0);
                            this.field_e.a(param0 ^ 38, cb.field_b, 0, 6);
                            var7_int = (255 & cb.field_b[5]) + (cb.field_b[3] << -194621456 & 16711680) - -(cb.field_b[4] << -1999248472 & 65280);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (((long)var7_int ^ -1L) >= (this.field_b.b(false) / 520L ^ -1L)) {
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
                    cb.field_b[1] = (byte)(param1 >> 1368248360);
                    cb.field_b[5] = (byte)var7_int;
                    cb.field_b[4] = (byte)(var7_int >> -24142360);
                    cb.field_b[2] = (byte)param1;
                    cb.field_b[0] = (byte)(param1 >> -2142331952);
                    cb.field_b[3] = (byte)(var7_int >> 2137757488);
                    this.field_e.a((long)(6 * param2), 0);
                    this.field_e.a(0, 6, false, cb.field_b);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (var8 >= param1) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (!param4) {
                              break L5;
                            } else {
                              L6: {
                                this.field_b.a((long)(520 * var7_int), 0);
                                if (param2 > 65535) {
                                  try {
                                    L7: {
                                      this.field_b.a(param0 + -38, cb.field_b, 0, 10);
                                      decompiledRegionSelector1 = 0;
                                      break L7;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L8: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L8;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var11 = (255 & cb.field_b[3]) + ((cb.field_b[2] & 255) << 947838120) + (((255 & cb.field_b[0]) << 855849016) + (cb.field_b[1] << -632873648 & 16711680));
                                    var13 = cb.field_b[9] & 255;
                                    var12 = (255 & cb.field_b[5]) + (65280 & cb.field_b[4] << -1872599992);
                                    var10 = (cb.field_b[8] & 255) + (cb.field_b[6] << -794264912 & 16711680) + (cb.field_b[7] << -1895936664 & 65280);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      this.field_b.a(0, cb.field_b, 0, 8);
                                      decompiledRegionSelector0 = 0;
                                      break L9;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L10: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L10;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var12 = (cb.field_b[3] & 255) + (cb.field_b[2] << 1780360072 & 65280);
                                    var10 = ((255 & cb.field_b[5]) << -1863565816) + (((255 & cb.field_b[4]) << 1495336176) - -(cb.field_b[6] & 255));
                                    var13 = 255 & cb.field_b[7];
                                    var11 = (255 & cb.field_b[1]) + ((cb.field_b[0] & 255) << -1089887384);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (var11 != param2) {
                                  break L11;
                                } else {
                                  if (var12 != var9) {
                                    break L11;
                                  } else {
                                    if (var13 != this.field_c) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (0 > var10) {
                                          break L12;
                                        } else {
                                          if ((this.field_b.b(false) / 520L ^ -1L) > ((long)var10 ^ -1L)) {
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
                                      decompiledRegionSelector2 = 3;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              stackOut_32_0 = 0;
                              stackIn_33_0 = stackOut_32_0;
                              stackOut_33_0 = stackIn_33_0;
                              stackIn_34_0 = stackOut_33_0;
                              decompiledRegionSelector2 = 2;
                              break L0;
                            }
                          }
                          L13: {
                            if (-1 == (var10 ^ -1)) {
                              L14: {
                                param4 = false;
                                var10 = (int)((this.field_b.b(false) - -519L) / 520L);
                                if (var10 == 0) {
                                  var10++;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              if (var7_int != var10) {
                                break L13;
                              } else {
                                var10++;
                                break L13;
                              }
                            } else {
                              break L13;
                            }
                          }
                          L15: {
                            if (param1 - var8 <= 512) {
                              var10 = 0;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (-65536 > (param2 ^ -1)) {
                              L17: {
                                cb.field_b[3] = (byte)param2;
                                cb.field_b[2] = (byte)(param2 >> -140418520);
                                cb.field_b[0] = (byte)(param2 >> -1509700264);
                                cb.field_b[7] = (byte)(var10 >> -271378456);
                                cb.field_b[6] = (byte)(var10 >> -1135023728);
                                cb.field_b[4] = (byte)(var9 >> 797976392);
                                cb.field_b[1] = (byte)(param2 >> 1050040528);
                                cb.field_b[5] = (byte)var9;
                                cb.field_b[8] = (byte)var10;
                                cb.field_b[9] = (byte)this.field_c;
                                this.field_b.a((long)(var7_int * 520), 0);
                                this.field_b.a(0, 10, false, cb.field_b);
                                var11 = -var8 + param1;
                                if (-511 <= (var11 ^ -1)) {
                                  break L17;
                                } else {
                                  var11 = 510;
                                  break L17;
                                }
                              }
                              this.field_b.a(var8, var11, false, param3);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                cb.field_b[3] = (byte)var9;
                                cb.field_b[6] = (byte)var10;
                                cb.field_b[5] = (byte)(var10 >> -60818744);
                                cb.field_b[1] = (byte)param2;
                                cb.field_b[4] = (byte)(var10 >> -164114416);
                                cb.field_b[7] = (byte)this.field_c;
                                cb.field_b[2] = (byte)(var9 >> 749275400);
                                cb.field_b[0] = (byte)(param2 >> -1916717752);
                                this.field_b.a((long)(var7_int * 520), 0);
                                this.field_b.a(0, 8, false, cb.field_b);
                                var11 = param1 + -var8;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_b.a(var8, var11, false, param3);
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
                      decompiledRegionSelector2 = 4;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L19: {
                    var7 = (IOException) (Object) decompiledCaughtException;
                    if (param0 == 38) {
                      break L19;
                    } else {
                      this.field_b = (td) null;
                      break L19;
                    }
                  }
                  stackOut_65_0 = 0;
                  stackIn_66_0 = stackOut_65_0;
                  return stackIn_66_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_6_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_12_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_34_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_40_0 != 0;
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
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_69_0 = (RuntimeException) (var6);
                stackOut_69_1 = new StringBuilder().append("uf.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_71_0 = stackOut_69_0;
                stackIn_71_1 = stackOut_69_1;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                if (param3 == null) {
                  stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
                  stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
                  stackOut_71_2 = "null";
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  stackIn_72_2 = stackOut_71_2;
                  break L20;
                } else {
                  stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
                  stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
                  stackOut_70_2 = "{...}";
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  stackIn_72_2 = stackOut_70_2;
                  break L20;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_c;
    }

    final static qb a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        qb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        qb stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 11 / ((-49 - param1) / 55);
            stackOut_0_0 = new qb(param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("uf.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final byte[] a(int param0, byte param1) {
        try {
            byte[] discarded$2 = null;
            int incrementValue$3 = 0;
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
            Object stackIn_11_0 = null;
            Object stackIn_12_0 = null;
            Object stackIn_39_0 = null;
            Object stackIn_40_0 = null;
            Object stackIn_45_0 = null;
            Object stackIn_46_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_44_0 = null;
            Object stackOut_45_0 = null;
            Object stackOut_38_0 = null;
            Object stackOut_39_0 = null;
            Object stackOut_10_0 = null;
            Object stackOut_11_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_54_0 = null;
            var18 = StarCannon.field_A;
            var3 = this.field_b;
            synchronized (var3) {
              try {
                L0: {
                  if (this.field_e.b(false) >= (long)(6 + 6 * param0)) {
                    L1: {
                      this.field_e.a((long)(6 * param0), 0);
                      this.field_e.a(0, cb.field_b, 0, 6);
                      if (param1 == 114) {
                        break L1;
                      } else {
                        discarded$2 = this.a(24, (byte) 53);
                        break L1;
                      }
                    }
                    var4_int = (255 & cb.field_b[2]) + ((cb.field_b[1] << 1487825064 & 65280) + (16711680 & cb.field_b[0] << -1881024080));
                    var5 = (65280 & cb.field_b[4] << -1570427000) + ((16711680 & cb.field_b[3] << -308215440) + (cb.field_b[5] & 255));
                    if (var4_int >= 0) {
                      if (this.field_a >= var4_int) {
                        if (0 < var5) {
                          if (this.field_b.b(false) / 520L >= (long)var5) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var4_int <= var7) {
                                stackOut_51_0 = (byte[]) (var6);
                                stackIn_52_0 = stackOut_51_0;
                                stackOut_52_0 = (byte[]) ((Object) stackIn_52_0);
                                stackIn_53_0 = stackOut_52_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                if (-1 != (var5 ^ -1)) {
                                  L3: {
                                    this.field_b.a((long)(var5 * 520), 0);
                                    var9 = -var7 + var4_int;
                                    if ((param0 ^ -1) >= -65536) {
                                      L4: {
                                        var14 = 8;
                                        if (var9 <= 512) {
                                          break L4;
                                        } else {
                                          var9 = 512;
                                          break L4;
                                        }
                                      }
                                      this.field_b.a(0, cb.field_b, 0, var14 + var9);
                                      var12 = (cb.field_b[6] & 255) + (65280 & cb.field_b[5] << 1039872904) + (cb.field_b[4] << 1692627504 & 16711680);
                                      var10 = (cb.field_b[0] << -871191288 & 65280) - -(255 & cb.field_b[1]);
                                      var11 = (cb.field_b[2] << 189985672 & 65280) + (cb.field_b[3] & 255);
                                      var13 = 255 & cb.field_b[7];
                                      break L3;
                                    } else {
                                      L5: {
                                        var14 = 10;
                                        if (var9 > 510) {
                                          var9 = 510;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      this.field_b.a(0, cb.field_b, 0, var14 + var9);
                                      var11 = (65280 & cb.field_b[4] << 160375528) + (cb.field_b[5] & 255);
                                      var12 = (255 & cb.field_b[8]) + (((cb.field_b[6] & 255) << 1428089008) - -(65280 & cb.field_b[7] << -747327192));
                                      var10 = (255 & cb.field_b[3]) + (16711680 & cb.field_b[1] << 1617076784) + (-16777216 & cb.field_b[0] << -2094568200) - -(cb.field_b[2] << 1076949800 & 65280);
                                      var13 = cb.field_b[9] & 255;
                                      break L3;
                                    }
                                  }
                                  if (var10 == param0) {
                                    if (var8 == var11) {
                                      if (var13 == this.field_c) {
                                        if (var12 >= 0) {
                                          if (this.field_b.b(false) / 520L >= (long)var12) {
                                            var15 = var14 + var9;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var15 <= var16) {
                                                var8++;
                                                var5 = var12;
                                                continue L2;
                                              } else {
                                                incrementValue$3 = var7;
                                                var7++;
                                                var6[incrementValue$3] = cb.field_b[var16];
                                                var16++;
                                                continue L6;
                                              }
                                            }
                                          } else {
                                            stackOut_44_0 = null;
                                            stackIn_45_0 = stackOut_44_0;
                                            stackOut_45_0 = stackIn_45_0;
                                            stackIn_46_0 = stackOut_45_0;
                                            decompiledRegionSelector0 = 3;
                                            break L0;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        stackOut_38_0 = null;
                                        stackIn_39_0 = stackOut_38_0;
                                        stackOut_39_0 = stackIn_39_0;
                                        stackIn_40_0 = stackOut_39_0;
                                        decompiledRegionSelector0 = 2;
                                        break L0;
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
                            return null;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        stackOut_10_0 = null;
                        stackIn_11_0 = stackOut_10_0;
                        stackOut_11_0 = stackIn_11_0;
                        stackIn_12_0 = stackOut_11_0;
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
                  return (byte[]) ((Object) stackIn_12_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_40_0);
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return (byte[]) ((Object) stackIn_46_0);
                    } else {
                      return stackIn_53_0;
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

    final boolean a(int param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
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
            var5 = this.field_b;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param0 < (param1 ^ -1)) {
                    break L2;
                  } else {
                    if (this.field_a >= param1) {
                      L3: {
                        var6 = this.a((byte) 38, param1, param3, param2, true) ? 1 : 0;
                        if (var6 != 0) {
                          break L3;
                        } else {
                          var6 = this.a((byte) 38, param1, param3, param2, false) ? 1 : 0;
                          break L3;
                        }
                      }
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
            stackOut_10_1 = new StringBuilder().append("uf.C(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static String a(Throwable param0, int param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        ii var13 = null;
        StringWriter var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        L0: {
          if (param0 instanceof ii) {
            var13 = (ii) ((Object) param0);
            param0 = var13.field_a;
            var2 = var13.field_b + " | ";
            var11 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        L1: {
          var14 = new StringWriter();
          var4 = new PrintWriter((Writer) ((Object) var14));
          if (param1 == -17490) {
            break L1;
          } else {
            field_d = false;
            break L1;
          }
        }
        param0.printStackTrace(var4);
        var4.close();
        var5 = var14.toString();
        var2 = var5;
        var11 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var2 = var7;
        var11 = var7;
        L2: while (true) {
          var8 = var6.readLine();
          var2 = var8;
          var11 = var8;
          var2 = var11;
          if (var8 != null) {
            L3: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (-1 == var9) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L3;
              } else {
                var11 = var8.substring(0, var9);
                break L3;
              }
            }
            L4: {
              var15 = var11.trim();
              var2 = var15;
              var2 = var15;
              var16 = var15.substring(var15.lastIndexOf(' ') - -1);
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf('\t') + 1);
              var2 = var17;
              var2 = var17;
              var18 = var2 + var17;
              var2 = var18;
              var2 = var18;
              var2 = var18;
              if (var9 == -1) {
                break L4;
              } else {
                if (-1 == var10) {
                  break L4;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (-1 >= (var12 ^ -1)) {
                    var2 = var18 + var8.substring(var12 - -5, var10);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            var2 = var2 + ' ';
            continue L2;
          } else {
            var2 = var11;
            var11 = var2;
            var2 = var11;
            var2 = var2 + "| " + var7;
            return var2;
          }
        }
    }

    uf(int param0, td param1, td param2, int param3) {
        this.field_b = null;
        this.field_e = null;
        this.field_a = 65000;
        try {
            this.field_b = param1;
            this.field_c = param0;
            this.field_a = param3;
            this.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "uf.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_d = false;
    }
}
