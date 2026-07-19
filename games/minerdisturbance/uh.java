/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uh {
    private me field_d;
    static boolean field_e;
    static String field_f;
    private me field_b;
    private int field_g;
    static String field_c;
    private int field_a;

    final boolean a(int param0, byte[] param1, byte param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param2 >= 60) {
              var5 = this.field_b;
              synchronized (var5) {
                L1: {
                  L2: {
                    if (0 > param0) {
                      break L2;
                    } else {
                      if (param0 > this.field_g) {
                        break L2;
                      } else {
                        L3: {
                          var6 = this.a(param0, true, param3, (byte) -55, param1) ? 1 : 0;
                          if (var6 != 0) {
                            break L3;
                          } else {
                            var6 = this.a(param0, false, param3, (byte) -50, param1) ? 1 : 0;
                            break L3;
                          }
                        }
                        stackOut_10_0 = var6;
                        stackIn_11_0 = stackOut_10_0;
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
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5_ref);
            stackOut_14_1 = new StringBuilder().append("uh.E(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    public final String toString() {
        return "" + this.field_a;
    }

    private final boolean a(int param0, boolean param1, int param2, byte param3, byte[] param4) {
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
            int stackIn_63_0 = 0;
            int stackIn_64_0 = 0;
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
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_65_0 = 0;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            String stackOut_71_2 = null;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            String stackOut_70_2 = null;
            var16 = MinerDisturbance.field_ab;
            try {
              var6_ref2 = this.field_b;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param1) {
                        if ((long)(6 * param2 + 6) <= this.field_d.a((byte) -109)) {
                          L2: {
                            this.field_d.a((byte) 120, (long)(6 * param2));
                            this.field_d.a(ri.field_c, 0, 6, -1);
                            var7_int = (255 & ri.field_c[5]) + (((255 & ri.field_c[4]) << 589281864) + (ri.field_c[3] << 2087732144 & 16711680));
                            if ((var7_int ^ -1) >= -1) {
                              break L2;
                            } else {
                              if (((long)var7_int ^ -1L) < (this.field_b.a((byte) -96) / 520L ^ -1L)) {
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
                        var7_int = (int)((this.field_b.a((byte) -47) - -519L) / 520L);
                        if (-1 != (var7_int ^ -1)) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    L3: {
                      ri.field_c[2] = (byte)param0;
                      ri.field_c[4] = (byte)(var7_int >> -470509400);
                      ri.field_c[3] = (byte)(var7_int >> 1019100304);
                      ri.field_c[5] = (byte)var7_int;
                      ri.field_c[1] = (byte)(param0 >> -56250136);
                      ri.field_c[0] = (byte)(param0 >> 88346800);
                      this.field_d.a((byte) 116, (long)(6 * param2));
                      this.field_d.a(ri.field_c, 6, 0, true);
                      var8 = 0;
                      if (param3 < -35) {
                        break L3;
                      } else {
                        uh.a((byte) -43);
                        break L3;
                      }
                    }
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (var8 >= param0) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (param1) {
                              L7: {
                                this.field_b.a((byte) 125, (long)(520 * var7_int));
                                if (65535 >= param2) {
                                  try {
                                    L8: {
                                      this.field_b.a(ri.field_c, 0, 8, -1);
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
                                    var13 = ri.field_c[7] & 255;
                                    var12 = (65280 & ri.field_c[2] << 804952008) - -(255 & ri.field_c[3]);
                                    var10 = (ri.field_c[4] << -484361840 & 16711680) - (-((255 & ri.field_c[5]) << 225831624) - (ri.field_c[6] & 255));
                                    var11 = (ri.field_c[1] & 255) + ((ri.field_c[0] & 255) << -1210319416);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      this.field_b.a(ri.field_c, 0, 10, -1);
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
                                    var11 = (ri.field_c[3] & 255) + ((ri.field_c[0] & 255) << -1532952328) + ((ri.field_c[1] << -575784368 & 16711680) - -((255 & ri.field_c[2]) << 1276963752));
                                    var12 = ((ri.field_c[4] & 255) << -757062168) - -(255 & ri.field_c[5]);
                                    var10 = (ri.field_c[8] & 255) + (ri.field_c[6] << -57173712 & 16711680) + ((255 & ri.field_c[7]) << -1207053464);
                                    var13 = 255 & ri.field_c[9];
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L12: {
                                if (param2 != var11) {
                                  break L12;
                                } else {
                                  if (var12 != var9) {
                                    break L12;
                                  } else {
                                    if (this.field_a == var13) {
                                      L13: {
                                        if (-1 < (var10 ^ -1)) {
                                          break L13;
                                        } else {
                                          if (this.field_b.a((byte) -70) / 520L < (long)var10) {
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
                            if (var10 == 0) {
                              L15: {
                                param1 = false;
                                var10 = (int)((this.field_b.a((byte) -74) + 519L) / 520L);
                                if (var10 != 0) {
                                  break L15;
                                } else {
                                  var10++;
                                  break L15;
                                }
                              }
                              if (var7_int == var10) {
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
                            if (param0 + -var8 > 512) {
                              break L16;
                            } else {
                              var10 = 0;
                              break L16;
                            }
                          }
                          L17: {
                            if (-65536 <= (param2 ^ -1)) {
                              L18: {
                                ri.field_c[0] = (byte)(param2 >> -1028135992);
                                ri.field_c[4] = (byte)(var10 >> -1991649456);
                                ri.field_c[1] = (byte)param2;
                                ri.field_c[5] = (byte)(var10 >> -773612888);
                                ri.field_c[6] = (byte)var10;
                                ri.field_c[7] = (byte)this.field_a;
                                ri.field_c[3] = (byte)var9;
                                ri.field_c[2] = (byte)(var9 >> -792853272);
                                this.field_b.a((byte) 111, (long)(var7_int * 520));
                                this.field_b.a(ri.field_c, 8, 0, true);
                                var11 = -var8 + param0;
                                if ((var11 ^ -1) < -513) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_b.a(param4, var11, var8, true);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                ri.field_c[8] = (byte)var10;
                                ri.field_c[4] = (byte)(var9 >> -1903756248);
                                ri.field_c[0] = (byte)(param2 >> 760167544);
                                ri.field_c[3] = (byte)param2;
                                ri.field_c[7] = (byte)(var10 >> -13288248);
                                ri.field_c[9] = (byte)this.field_a;
                                ri.field_c[5] = (byte)var9;
                                ri.field_c[6] = (byte)(var10 >> -468789840);
                                ri.field_c[1] = (byte)(param2 >> 1389065072);
                                ri.field_c[2] = (byte)(param2 >> 8838856);
                                this.field_b.a((byte) 123, (long)(520 * var7_int));
                                this.field_b.a(ri.field_c, 10, 0, true);
                                var11 = -var8 + param0;
                                if (-511 > (var11 ^ -1)) {
                                  var11 = 510;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              this.field_b.a(param4, var11, var8, true);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L4;
                        }
                      }
                      stackOut_62_0 = 1;
                      stackIn_63_0 = stackOut_62_0;
                      stackOut_63_0 = stackIn_63_0;
                      stackIn_64_0 = stackOut_63_0;
                      decompiledRegionSelector2 = 4;
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
                        return stackIn_64_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_69_0 = (RuntimeException) (var6_ref);
                stackOut_69_1 = new StringBuilder().append("uh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_71_0 = stackOut_69_0;
                stackIn_71_1 = stackOut_69_1;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                if (param4 == null) {
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
              throw lj.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            Throwable var17 = null;
            int var18 = 0;
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_42_0 = null;
            Object stackIn_43_0 = null;
            byte[] stackIn_48_0 = null;
            byte[] stackIn_49_0 = null;
            Object stackIn_51_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_47_0 = null;
            byte[] stackOut_48_0 = null;
            Object stackOut_41_0 = null;
            Object stackOut_42_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_50_0 = null;
            var18 = MinerDisturbance.field_ab;
            var3 = this.field_b;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 + 6 * param1) <= this.field_d.a((byte) -72)) {
                    this.field_d.a((byte) 126, (long)(6 * param1));
                    this.field_d.a(ri.field_c, 0, 6, -1);
                    var4_int = (param0 & ri.field_c[2]) + ((ri.field_c[1] & 255) << -652776344) + ((ri.field_c[0] & 255) << -2021027248);
                    var5 = (65280 & ri.field_c[4] << -1343135096) + (((255 & ri.field_c[3]) << 1356772016) + (ri.field_c[5] & 255));
                    if (-1 >= (var4_int ^ -1)) {
                      if (this.field_g >= var4_int) {
                        if (var5 > 0) {
                          if ((this.field_b.a((byte) -95) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var4_int <= var7) {
                                stackOut_47_0 = (byte[]) (var6);
                                stackIn_48_0 = stackOut_47_0;
                                stackOut_48_0 = (byte[]) ((Object) stackIn_48_0);
                                stackIn_49_0 = stackOut_48_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L2: {
                                    this.field_b.a((byte) 121, (long)(var5 * 520));
                                    var9 = var4_int - var7;
                                    if ((param1 ^ -1) >= -65536) {
                                      L3: {
                                        if (512 >= var9) {
                                          break L3;
                                        } else {
                                          var9 = 512;
                                          break L3;
                                        }
                                      }
                                      var14 = 8;
                                      this.field_b.a(ri.field_c, 0, var14 + var9, -1);
                                      var11 = ((255 & ri.field_c[2]) << 419879528) + (ri.field_c[3] & 255);
                                      var10 = (255 & ri.field_c[1]) + ((255 & ri.field_c[0]) << 382591976);
                                      var12 = (255 & ri.field_c[6]) + (16711680 & ri.field_c[4] << 21117296) - -(ri.field_c[5] << -1836873848 & 65280);
                                      var13 = ri.field_c[7] & 255;
                                      break L2;
                                    } else {
                                      L4: {
                                        if (510 >= var9) {
                                          break L4;
                                        } else {
                                          var9 = 510;
                                          break L4;
                                        }
                                      }
                                      var14 = 10;
                                      this.field_b.a(ri.field_c, 0, var14 + var9, param0 + -256);
                                      var12 = (ri.field_c[8] & 255) + ((ri.field_c[7] & 255) << -1580198072) + (16711680 & ri.field_c[6] << -1979188272);
                                      var13 = ri.field_c[9] & 255;
                                      var10 = (ri.field_c[2] << 2115197832 & 65280) + (ri.field_c[1] << -304457840 & 16711680) + (((ri.field_c[0] & 255) << -1955897384) + (255 & ri.field_c[3]));
                                      var11 = (255 & ri.field_c[5]) + (ri.field_c[4] << 1795475560 & 65280);
                                      break L2;
                                    }
                                  }
                                  if (param1 == var10) {
                                    if (var8 == var11) {
                                      if (this.field_a == var13) {
                                        if ((var12 ^ -1) <= -1) {
                                          if (((long)var12 ^ -1L) >= (this.field_b.a((byte) -95) / 520L ^ -1L)) {
                                            var15 = var9 + var14;
                                            var8++;
                                            var5 = var12;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var16 >= var15) {
                                                continue L1;
                                              } else {
                                                incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = ri.field_c[var16];
                                                var16++;
                                                continue L5;
                                              }
                                            }
                                          } else {
                                            stackOut_41_0 = null;
                                            stackIn_42_0 = stackOut_41_0;
                                            stackOut_42_0 = stackIn_42_0;
                                            stackIn_43_0 = stackOut_42_0;
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
                            decompiledRegionSelector0 = 1;
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
                        decompiledRegionSelector0 = 0;
                        break L0;
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
                stackOut_50_0 = null;
                stackIn_51_0 = stackOut_50_0;
                return (byte[]) ((Object) stackIn_51_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_10_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_16_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_43_0);
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

    final static boolean a(byte param0, String param1) {
        Process discarded$11 = null;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            try {
              L1: {
                if (vf.field_j.startsWith("win")) {
                  L2: {
                    if (param1.startsWith("http://")) {
                      break L2;
                    } else {
                      if (!param1.startsWith("https://")) {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L3: while (true) {
                    if (param1.length() <= var3) {
                      L4: {
                        discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                        if (param0 > 7) {
                          break L4;
                        } else {
                          uh.a((byte) -75);
                          break L4;
                        }
                      }
                      stackOut_18_0 = 1;
                      stackIn_19_0 = stackOut_18_0;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (0 == (var2.indexOf((int) param1.charAt(var3)) ^ -1)) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      } else {
                        var3++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  stackOut_2_0 = 0;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2_ref2);
            stackOut_22_1 = new StringBuilder().append("uh.C(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    public static void a(byte param0) {
        boolean discarded$0 = false;
        field_f = null;
        field_c = null;
        if (param0 >= -103) {
            String var2 = (String) null;
            discarded$0 = uh.a((byte) -78, (String) null);
        }
    }

    uh(int param0, me param1, me param2, int param3) {
        this.field_d = null;
        this.field_b = null;
        this.field_g = 65000;
        try {
            this.field_g = param3;
            this.field_a = param0;
            this.field_b = param1;
            this.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "uh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_e = true;
        field_f = "MULTIPLIER <times> <%0>";
        field_c = "<%0> <times> 100 = <%1>";
    }
}
