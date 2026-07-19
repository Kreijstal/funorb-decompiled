/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class na {
    private int field_e;
    private sf field_a;
    private int field_d;
    static int field_f;
    private sf field_b;
    static byte[] field_c;

    private final boolean a(int param0, boolean param1, byte[] param2, int param3, int param4) {
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
            int stackIn_4_0 = 0;
            int stackIn_5_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_16_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_45_0 = 0;
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
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_65_0 = 0;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            String stackOut_71_2 = null;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            String stackOut_70_2 = null;
            var16 = ZombieDawn.field_J;
            try {
              var6_ref2 = this.field_a;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    if (param3 == 109242696) {
                      L1: {
                        if (!param1) {
                          var7_int = (int)((this.field_a.a(param3 + -109242697) - -519L) / 520L);
                          if (var7_int == 0) {
                            var7_int = 1;
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          if ((this.field_b.a(param3 + -109242697) ^ -1L) <= ((long)(6 + 6 * param0) ^ -1L)) {
                            L2: {
                              this.field_b.a(param3 ^ 109242696, (long)(param0 * 6));
                              this.field_b.a(6, false, 0, cg.field_c);
                              var7_int = (255 & cg.field_c[5]) + ((cg.field_c[3] & 255) << -1186478480) - -((cg.field_c[4] & 255) << -1524056920);
                              if ((var7_int ^ -1) >= -1) {
                                break L2;
                              } else {
                                if ((long)var7_int <= this.field_a.a(-1) / 520L) {
                                  break L1;
                                } else {
                                  break L2;
                                }
                              }
                            }
                            stackOut_14_0 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            decompiledRegionSelector2 = 2;
                            break L0;
                          } else {
                            stackOut_8_0 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            stackOut_9_0 = stackIn_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            decompiledRegionSelector2 = 1;
                            break L0;
                          }
                        }
                      }
                      cg.field_c[0] = (byte)(param4 >> 473834032);
                      cg.field_c[4] = (byte)(var7_int >> -1180206680);
                      cg.field_c[2] = (byte)param4;
                      cg.field_c[5] = (byte)var7_int;
                      cg.field_c[1] = (byte)(param4 >> -693934296);
                      cg.field_c[3] = (byte)(var7_int >> -1004374128);
                      this.field_b.a(0, (long)(param0 * 6));
                      this.field_b.a(param3 ^ 109242722, cg.field_c, 0, 6);
                      var8 = 0;
                      var9 = 0;
                      L3: while (true) {
                        L4: {
                          if (var8 >= param4) {
                            break L4;
                          } else {
                            L5: {
                              var10 = 0;
                              if (param1) {
                                L6: {
                                  this.field_a.a(0, (long)(var7_int * 520));
                                  if (65535 >= param0) {
                                    try {
                                      L7: {
                                        this.field_a.a(8, false, 0, cg.field_c);
                                        decompiledRegionSelector0 = 0;
                                        break L7;
                                      }
                                    } catch (java.io.EOFException decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L8: {
                                        var14 = (EOFException) (Object) decompiledCaughtException;
                                        decompiledRegionSelector0 = 1;
                                        break L8;
                                      }
                                    }
                                    if (decompiledRegionSelector0 == 0) {
                                      var12 = (65280 & cg.field_c[2] << -1916681816) - -(255 & cg.field_c[3]);
                                      var13 = 255 & cg.field_c[7];
                                      var11 = ((cg.field_c[0] & 255) << -586719704) + (255 & cg.field_c[1]);
                                      var10 = (65280 & cg.field_c[5] << -1963133688) + (16711680 & cg.field_c[4] << 962494832) - -(255 & cg.field_c[6]);
                                      break L6;
                                    } else {
                                      break L4;
                                    }
                                  } else {
                                    try {
                                      L9: {
                                        this.field_a.a(10, false, 0, cg.field_c);
                                        decompiledRegionSelector1 = 0;
                                        break L9;
                                      }
                                    } catch (java.io.EOFException decompiledCaughtParameter1) {
                                      decompiledCaughtException = decompiledCaughtParameter1;
                                      L10: {
                                        var14 = (EOFException) (Object) decompiledCaughtException;
                                        decompiledRegionSelector1 = 1;
                                        break L10;
                                      }
                                    }
                                    if (decompiledRegionSelector1 == 0) {
                                      var13 = 255 & cg.field_c[9];
                                      var12 = (cg.field_c[5] & 255) + (cg.field_c[4] << 1686103528 & 65280);
                                      var11 = (65280 & cg.field_c[2] << -1716418520) + ((cg.field_c[1] & 255) << 1115085072) + (((cg.field_c[0] & 255) << -2064135400) + (cg.field_c[3] & 255));
                                      var10 = (16711680 & cg.field_c[6] << 885490192) + (((cg.field_c[7] & 255) << 109242696) + (cg.field_c[8] & 255));
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
                                    if (var9 != var12) {
                                      break L11;
                                    } else {
                                      if (var13 != this.field_d) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if ((var10 ^ -1) > -1) {
                                            break L12;
                                          } else {
                                            if ((long)var10 > this.field_a.a(-1) / 520L) {
                                              break L12;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        stackOut_43_0 = 0;
                                        stackIn_44_0 = stackOut_43_0;
                                        stackOut_44_0 = stackIn_44_0;
                                        stackIn_45_0 = stackOut_44_0;
                                        decompiledRegionSelector2 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                                stackOut_37_0 = 0;
                                stackIn_38_0 = stackOut_37_0;
                                stackOut_38_0 = stackIn_38_0;
                                stackIn_39_0 = stackOut_38_0;
                                decompiledRegionSelector2 = 3;
                                break L0;
                              } else {
                                break L5;
                              }
                            }
                            L13: {
                              if (var10 == 0) {
                                L14: {
                                  param1 = false;
                                  var10 = (int)((519L + this.field_a.a(-1)) / 520L);
                                  if (var10 != 0) {
                                    break L14;
                                  } else {
                                    var10++;
                                    break L14;
                                  }
                                }
                                if (var10 != var7_int) {
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
                              if (-513 > (-var8 + param4 ^ -1)) {
                                break L15;
                              } else {
                                var10 = 0;
                                break L15;
                              }
                            }
                            L16: {
                              if (param0 > 65535) {
                                L17: {
                                  cg.field_c[1] = (byte)(param0 >> 569467504);
                                  cg.field_c[4] = (byte)(var9 >> 1180951144);
                                  cg.field_c[3] = (byte)param0;
                                  cg.field_c[5] = (byte)var9;
                                  cg.field_c[9] = (byte)this.field_d;
                                  cg.field_c[7] = (byte)(var10 >> -236673016);
                                  cg.field_c[8] = (byte)var10;
                                  cg.field_c[0] = (byte)(param0 >> -459837512);
                                  cg.field_c[6] = (byte)(var10 >> 2092060144);
                                  cg.field_c[2] = (byte)(param0 >> -1208190904);
                                  this.field_a.a(0, (long)(var7_int * 520));
                                  this.field_a.a(param3 + -109242651, cg.field_c, 0, 10);
                                  var11 = -var8 + param4;
                                  if (-511 <= (var11 ^ -1)) {
                                    break L17;
                                  } else {
                                    var11 = 510;
                                    break L17;
                                  }
                                }
                                this.field_a.a(106, param2, var8, var11);
                                var8 = var8 + var11;
                                break L16;
                              } else {
                                L18: {
                                  cg.field_c[7] = (byte)this.field_d;
                                  cg.field_c[2] = (byte)(var9 >> -1340065336);
                                  cg.field_c[0] = (byte)(param0 >> -1372580344);
                                  cg.field_c[4] = (byte)(var10 >> -1165920880);
                                  cg.field_c[3] = (byte)var9;
                                  cg.field_c[6] = (byte)var10;
                                  cg.field_c[1] = (byte)param0;
                                  cg.field_c[5] = (byte)(var10 >> -1151931544);
                                  this.field_a.a(0, (long)(520 * var7_int));
                                  this.field_a.a(120, cg.field_c, 0, 8);
                                  var11 = -var8 + param4;
                                  if (var11 <= 512) {
                                    break L18;
                                  } else {
                                    var11 = 512;
                                    break L18;
                                  }
                                }
                                this.field_a.a(110, param2, var8, var11);
                                var8 = var8 + var11;
                                break L16;
                              }
                            }
                            var9++;
                            var7_int = var10;
                            continue L3;
                          }
                        }
                        stackOut_62_0 = 1;
                        stackIn_63_0 = stackOut_62_0;
                        stackOut_63_0 = stackIn_63_0;
                        stackIn_64_0 = stackOut_63_0;
                        decompiledRegionSelector2 = 5;
                        break L0;
                      }
                    } else {
                      stackOut_3_0 = 1;
                      stackIn_4_0 = stackOut_3_0;
                      stackOut_4_0 = stackIn_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      decompiledRegionSelector2 = 0;
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
                  return stackIn_5_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_10_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_16_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_39_0 != 0;
                      } else {
                        if (decompiledRegionSelector2 == 4) {
                          return stackIn_45_0 != 0;
                        } else {
                          return stackIn_64_0 != 0;
                        }
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_69_0 = (RuntimeException) (var6_ref);
                stackOut_69_1 = new StringBuilder().append("na.C(").append(param0).append(',').append(param1).append(',');
                stackIn_71_0 = stackOut_69_0;
                stackIn_71_1 = stackOut_69_1;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                if (param2 == null) {
                  stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
                  stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
                  stackOut_71_2 = "null";
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  stackIn_72_2 = stackOut_71_2;
                  break L19;
                } else {
                  stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
                  stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
                  stackOut_70_2 = "{...}";
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  stackIn_72_2 = stackOut_70_2;
                  break L19;
                }
              }
              throw sh.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final byte[] a(int param0, int param1) {
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
            Object stackIn_11_0 = null;
            Object stackIn_12_0 = null;
            Object stackIn_17_0 = null;
            Object stackIn_18_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_39_0 = null;
            Object stackIn_44_0 = null;
            Object stackIn_45_0 = null;
            byte[] stackIn_51_0 = null;
            byte[] stackIn_52_0 = null;
            Object stackIn_54_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_50_0 = null;
            byte[] stackOut_51_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_44_0 = null;
            Object stackOut_37_0 = null;
            Object stackOut_38_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_16_0 = null;
            Object stackOut_17_0 = null;
            Object stackOut_10_0 = null;
            Object stackOut_11_0 = null;
            Object stackOut_53_0 = null;
            var18 = ZombieDawn.field_J;
            var3 = this.field_a;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 * param1 + 6) <= this.field_b.a(param0 ^ 65535)) {
                    L1: {
                      this.field_b.a(0, (long)(param1 * 6));
                      if (param0 == -65536) {
                        break L1;
                      } else {
                        discarded$2 = this.a(36, 125);
                        break L1;
                      }
                    }
                    this.field_b.a(6, false, 0, cg.field_c);
                    var4_int = ((255 & cg.field_c[0]) << -538363920) + (cg.field_c[1] << 738715816 & 65280) - -(cg.field_c[2] & 255);
                    var5 = (cg.field_c[3] << 19771440 & 16711680) - (-(cg.field_c[4] << 993545320 & 65280) + -(cg.field_c[5] & 255));
                    if ((var4_int ^ -1) <= -1) {
                      if (var4_int <= this.field_e) {
                        if (-1 > (var5 ^ -1)) {
                          if ((this.field_a.a(-1) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var4_int <= var7) {
                                stackOut_50_0 = (byte[]) (var6);
                                stackIn_51_0 = stackOut_50_0;
                                stackOut_51_0 = (byte[]) ((Object) stackIn_51_0);
                                stackIn_52_0 = stackOut_51_0;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L3: {
                                    this.field_a.a(0, (long)(var5 * 520));
                                    var9 = var4_int - var7;
                                    if ((param1 ^ -1) < -65536) {
                                      L4: {
                                        var14 = 10;
                                        if (var9 <= 510) {
                                          break L4;
                                        } else {
                                          var9 = 510;
                                          break L4;
                                        }
                                      }
                                      this.field_a.a(var9 + var14, false, 0, cg.field_c);
                                      var10 = ((255 & cg.field_c[1]) << -1156344400) + ((cg.field_c[0] & 255) << -1553806952) + ((65280 & cg.field_c[2] << -1945819320) - -(cg.field_c[3] & 255));
                                      var11 = ((cg.field_c[4] & 255) << 1943650632) - -(cg.field_c[5] & 255);
                                      var13 = 255 & cg.field_c[9];
                                      var12 = (255 & cg.field_c[8]) + ((cg.field_c[6] & 255) << 383433872) + ((cg.field_c[7] & 255) << 830283080);
                                      break L3;
                                    } else {
                                      L5: {
                                        var14 = 8;
                                        if (var9 <= 512) {
                                          break L5;
                                        } else {
                                          var9 = 512;
                                          break L5;
                                        }
                                      }
                                      this.field_a.a(var14 + var9, false, 0, cg.field_c);
                                      var12 = (cg.field_c[6] & 255) + (((cg.field_c[4] & 255) << -591774416) + (cg.field_c[5] << -1391511352 & 65280));
                                      var11 = ((cg.field_c[2] & 255) << 1045724072) + (cg.field_c[3] & 255);
                                      var13 = 255 & cg.field_c[7];
                                      var10 = (cg.field_c[0] << 1188531880 & 65280) + (255 & cg.field_c[1]);
                                      break L3;
                                    }
                                  }
                                  if (param1 == var10) {
                                    if (var8 == var11) {
                                      if (this.field_d == var13) {
                                        if (0 <= var12) {
                                          if ((long)var12 <= this.field_a.a(-1) / 520L) {
                                            var15 = var9 + var14;
                                            var8++;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var16 >= var15) {
                                                var5 = var12;
                                                continue L2;
                                              } else {
                                                incrementValue$3 = var7;
                                                var7++;
                                                var6[incrementValue$3] = cg.field_c[var16];
                                                var16++;
                                                continue L6;
                                              }
                                            }
                                          } else {
                                            stackOut_43_0 = null;
                                            stackIn_44_0 = stackOut_43_0;
                                            stackOut_44_0 = stackIn_44_0;
                                            stackIn_45_0 = stackOut_44_0;
                                            decompiledRegionSelector0 = 4;
                                            break L0;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        stackOut_37_0 = null;
                                        stackIn_38_0 = stackOut_37_0;
                                        stackOut_38_0 = stackIn_38_0;
                                        stackIn_39_0 = stackOut_38_0;
                                        decompiledRegionSelector0 = 3;
                                        break L0;
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
                            stackOut_16_0 = null;
                            stackIn_17_0 = stackOut_16_0;
                            stackOut_17_0 = stackIn_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        stackOut_10_0 = null;
                        stackIn_11_0 = stackOut_10_0;
                        stackOut_11_0 = stackIn_11_0;
                        stackIn_12_0 = stackOut_11_0;
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
                stackOut_53_0 = null;
                stackIn_54_0 = stackOut_53_0;
                return (byte[]) ((Object) stackIn_54_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_12_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_18_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_24_0);
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return (byte[]) ((Object) stackIn_39_0);
                    } else {
                      if (decompiledRegionSelector0 == 4) {
                        return (byte[]) ((Object) stackIn_45_0);
                      } else {
                        return stackIn_52_0;
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

    public final String toString() {
        return "" + this.field_d;
    }

    public static void a(byte param0) {
        boolean discarded$0 = false;
        field_c = null;
        if (param0 != 79) {
            discarded$0 = na.a(113, '}');
        }
    }

    final boolean a(int param0, byte[] param1, int param2, byte param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var5 = this.field_a;
            synchronized (var5) {
              L1: {
                L2: {
                  if ((param2 ^ -1) > -1) {
                    break L2;
                  } else {
                    if (param2 <= this.field_e) {
                      L3: {
                        var6 = this.a(param0, true, param1, 109242696, param2) ? 1 : 0;
                        if (var6 == 0) {
                          var6 = this.a(param0, false, param1, 109242696, param2) ? 1 : 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (param3 == -96) {
                          break L4;
                        } else {
                          this.field_d = -60;
                          break L4;
                        }
                      }
                      stackOut_9_0 = var6;
                      stackIn_10_0 = stackOut_9_0;
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
            stackOut_13_0 = (RuntimeException) (var5_ref);
            stackOut_13_1 = new StringBuilder().append("na.A(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_7_0 = 0;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 <= param0) {
                  break L2;
                } else {
                  if (param1 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (param1 <= 255) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param1 == 0) {
                  break L4;
                } else {
                  var6 = fj.field_h;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var6.length <= var3) {
                      break L4;
                    } else {
                      var4 = var6[var3];
                      if (param1 == var4) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var3++;
                        continue L5;
                      }
                    }
                  }
                }
              }
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "na.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    na(int param0, sf param1, sf param2, int param3) {
        this.field_e = 65000;
        this.field_b = null;
        this.field_a = null;
        try {
            this.field_b = param2;
            this.field_a = param1;
            this.field_d = param0;
            this.field_e = param3;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "na.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
