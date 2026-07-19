/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ppa {
    private int field_d;
    private ph field_c;
    private int field_e;
    private ph field_b;
    static String field_a;

    final boolean a(int param0, byte[] param1, int param2, byte param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_10_0 = 0;
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
            var5 = this.field_c;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param2 < 0) {
                    break L2;
                  } else {
                    if (param2 > this.field_e) {
                      break L2;
                    } else {
                      L3: {
                        var6 = this.a(true, param2, param1, true, param0) ? 1 : 0;
                        if (var6 == 0) {
                          var6 = this.a(false, param2, param1, true, param0) ? 1 : 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (param3 >= 112) {
                          break L4;
                        } else {
                          this.field_d = -66;
                          break L4;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5_ref);
            stackOut_14_1 = new StringBuilder().append("ppa.C(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_11_0 != 0;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1551894744) {
            field_a = (String) null;
        }
    }

    final byte[] a(int param0, int param1) {
        try {
            int incrementValue$1 = 0;
            Object var3 = null;
            IOException var4 = null;
            int var4_int = 0;
            int var5 = 0;
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
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_37_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_43_0 = null;
            Object stackIn_44_0 = null;
            byte[] stackIn_51_0 = null;
            byte[] stackIn_52_0 = null;
            Object stackIn_54_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_50_0 = null;
            byte[] stackOut_51_0 = null;
            Object stackOut_42_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_36_0 = null;
            Object stackOut_37_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_53_0 = null;
            var19 = TombRacer.field_G ? 1 : 0;
            var3 = this.field_c;
            synchronized (var3) {
              try {
                L0: {
                  if (this.field_b.b(true) >= (long)(6 + 6 * param0)) {
                    this.field_b.a((byte) 20, (long)(6 * param0));
                    this.field_b.a(wfa.field_F, 6, 0, (byte) -64);
                    var6 = -2 / ((param1 - -40) / 57);
                    var4_int = (255 & wfa.field_F[2]) + (((255 & wfa.field_F[1]) << -699004088) + (wfa.field_F[0] << 1680578096 & 16711680));
                    var5 = (16711680 & wfa.field_F[3] << 382693360) - (-((wfa.field_F[4] & 255) << -2019450424) + -(wfa.field_F[5] & 255));
                    if (-1 >= (var4_int ^ -1)) {
                      if (var4_int <= this.field_e) {
                        if (-1 > (var5 ^ -1)) {
                          if ((long)var5 <= this.field_c.b(true) / 520L) {
                            var7 = new byte[var4_int];
                            var8 = 0;
                            var9 = 0;
                            L1: while (true) {
                              if (var8 >= var4_int) {
                                stackOut_50_0 = (byte[]) (var7);
                                stackIn_51_0 = stackOut_50_0;
                                stackOut_51_0 = (byte[]) ((Object) stackIn_51_0);
                                stackIn_52_0 = stackOut_51_0;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L2: {
                                    L3: {
                                      this.field_c.a((byte) 67, (long)(520 * var5));
                                      var10 = var4_int - var8;
                                      if (65535 < param0) {
                                        break L3;
                                      } else {
                                        L4: {
                                          if (var10 > 512) {
                                            var10 = 512;
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        }
                                        var15 = 8;
                                        this.field_c.a(wfa.field_F, var15 + var10, 0, (byte) -30);
                                        var12 = ((wfa.field_F[2] & 255) << 1298885992) - -(wfa.field_F[3] & 255);
                                        var14 = 255 & wfa.field_F[7];
                                        var13 = (255 & wfa.field_F[6]) + ((255 & wfa.field_F[4]) << 1559773488) - -(65280 & wfa.field_F[5] << -1551894744);
                                        var11 = (255 & wfa.field_F[1]) + ((wfa.field_F[0] & 255) << -1783325336);
                                        if (var19 == 0) {
                                          break L2;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    L5: {
                                      var15 = 10;
                                      if (510 >= var10) {
                                        break L5;
                                      } else {
                                        var10 = 510;
                                        break L5;
                                      }
                                    }
                                    this.field_c.a(wfa.field_F, var10 - -var15, 0, (byte) -28);
                                    var12 = (255 & wfa.field_F[5]) + (wfa.field_F[4] << -134014072 & 65280);
                                    var13 = ((255 & wfa.field_F[6]) << -135017520) + ((65280 & wfa.field_F[7] << 247711592) - -(wfa.field_F[8] & 255));
                                    var11 = (16711680 & wfa.field_F[1] << -801615824) + (-16777216 & wfa.field_F[0] << 55766968) - (-(wfa.field_F[2] << -2082219128 & 65280) + -(255 & wfa.field_F[3]));
                                    var14 = wfa.field_F[9] & 255;
                                    break L2;
                                  }
                                  if (param0 == var11) {
                                    if (var12 == var9) {
                                      if (var14 == this.field_d) {
                                        if ((var13 ^ -1) <= -1) {
                                          if ((this.field_c.b(true) / 520L ^ -1L) <= ((long)var13 ^ -1L)) {
                                            var16 = var15 - -var10;
                                            var9++;
                                            var5 = var13;
                                            var17 = var15;
                                            L6: while (true) {
                                              if (var16 <= var17) {
                                                continue L1;
                                              } else {
                                                incrementValue$1 = var8;
                                                var8++;
                                                var7[incrementValue$1] = wfa.field_F[var17];
                                                var17++;
                                                if (var19 != 0) {
                                                  continue L1;
                                                } else {
                                                  continue L6;
                                                }
                                              }
                                            }
                                          } else {
                                            stackOut_42_0 = null;
                                            stackIn_43_0 = stackOut_42_0;
                                            stackOut_43_0 = stackIn_43_0;
                                            stackIn_44_0 = stackOut_43_0;
                                            decompiledRegionSelector0 = 4;
                                            break L0;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        stackOut_36_0 = null;
                                        stackIn_37_0 = stackOut_36_0;
                                        stackOut_37_0 = stackIn_37_0;
                                        stackIn_38_0 = stackOut_37_0;
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
                                  stackOut_20_0 = null;
                                  stackIn_21_0 = stackOut_20_0;
                                  stackOut_21_0 = stackIn_21_0;
                                  stackIn_22_0 = stackOut_21_0;
                                  decompiledRegionSelector0 = 2;
                                  break L0;
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
                        return null;
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
                  return (byte[]) ((Object) stackIn_16_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_22_0);
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return (byte[]) ((Object) stackIn_38_0);
                    } else {
                      if (decompiledRegionSelector0 == 4) {
                        return (byte[]) ((Object) stackIn_44_0);
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

    private final boolean a(boolean param0, int param1, byte[] param2, boolean param3, int param4) {
        try {
            byte[] discarded$1 = null;
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
            boolean stackIn_20_0 = false;
            int stackIn_36_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_43_0 = 0;
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
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            boolean stackOut_19_0 = false;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
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
            var16 = TombRacer.field_G ? 1 : 0;
            try {
              var6_ref2 = this.field_c;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param0) {
                        var7_int = (int)((519L + this.field_c.b(true)) / 520L);
                        if (-1 != (var7_int ^ -1)) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if (this.field_b.b(true) >= (long)(6 * param4 + 6)) {
                          L2: {
                            this.field_b.a((byte) -124, (long)(6 * param4));
                            this.field_b.a(wfa.field_F, 6, 0, (byte) -34);
                            var7_int = (wfa.field_F[3] << -1620960176 & 16711680) + ((255 & wfa.field_F[4]) << -52731960) + (255 & wfa.field_F[5]);
                            if (-1 <= (var7_int ^ -1)) {
                              break L2;
                            } else {
                              if ((long)var7_int <= this.field_c.b(true) / 520L) {
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
                          decompiledRegionSelector2 = 2;
                          break L0;
                        } else {
                          stackOut_4_0 = 0;
                          stackIn_5_0 = stackOut_4_0;
                          stackOut_5_0 = stackIn_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        }
                      }
                    }
                    L3: {
                      wfa.field_F[5] = (byte)var7_int;
                      wfa.field_F[1] = (byte)(param1 >> -1586847864);
                      wfa.field_F[0] = (byte)(param1 >> 972428496);
                      wfa.field_F[2] = (byte)param1;
                      wfa.field_F[3] = (byte)(var7_int >> -1407435728);
                      wfa.field_F[4] = (byte)(var7_int >> 2117413768);
                      this.field_b.a((byte) -118, (long)(param4 * 6));
                      this.field_b.a(wfa.field_F, 0, (byte) -17, 6);
                      if (param3) {
                        break L3;
                      } else {
                        discarded$1 = this.a(58, 109);
                        break L3;
                      }
                    }
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var8 >= param1) {
                            break L6;
                          } else {
                            var10 = 0;
                            stackOut_19_0 = param0;
                            stackIn_64_0 = stackOut_19_0 ? 1 : 0;
                            stackIn_20_0 = stackOut_19_0;
                            if (var16 != 0) {
                              break L5;
                            } else {
                              L7: {
                                if (!stackIn_20_0) {
                                  break L7;
                                } else {
                                  L8: {
                                    L9: {
                                      this.field_c.a((byte) 91, (long)(var7_int * 520));
                                      if ((param4 ^ -1) >= -65536) {
                                        break L9;
                                      } else {
                                        try {
                                          L10: {
                                            this.field_c.a(wfa.field_F, 10, 0, (byte) -33);
                                            decompiledRegionSelector1 = 0;
                                            break L10;
                                          }
                                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                                          decompiledCaughtException = decompiledCaughtParameter0;
                                          L11: {
                                            var14 = (EOFException) (Object) decompiledCaughtException;
                                            if (var16 == 0) {
                                              decompiledRegionSelector1 = 1;
                                              break L11;
                                            } else {
                                              decompiledRegionSelector1 = 0;
                                              break L11;
                                            }
                                          }
                                        }
                                        if (decompiledRegionSelector1 == 0) {
                                          var12 = ((255 & wfa.field_F[4]) << 1670140616) - -(255 & wfa.field_F[5]);
                                          var11 = (wfa.field_F[0] << -400917576 & -16777216) - -((255 & wfa.field_F[1]) << 1969366576) - (-((255 & wfa.field_F[2]) << -495893112) + -(255 & wfa.field_F[3]));
                                          var13 = 255 & wfa.field_F[9];
                                          var10 = (255 & wfa.field_F[8]) + (((255 & wfa.field_F[7]) << 42812104) + ((255 & wfa.field_F[6]) << 1556945840));
                                          if (var16 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    try {
                                      L12: {
                                        this.field_c.a(wfa.field_F, 8, 0, (byte) -115);
                                        decompiledRegionSelector0 = 0;
                                        break L12;
                                      }
                                    } catch (java.io.EOFException decompiledCaughtParameter1) {
                                      decompiledCaughtException = decompiledCaughtParameter1;
                                      L13: {
                                        var14 = (EOFException) (Object) decompiledCaughtException;
                                        if (var16 == 0) {
                                          decompiledRegionSelector0 = 1;
                                          break L13;
                                        } else {
                                          decompiledRegionSelector0 = 0;
                                          break L13;
                                        }
                                      }
                                    }
                                    if (decompiledRegionSelector0 == 0) {
                                      var12 = (255 & wfa.field_F[3]) + ((255 & wfa.field_F[2]) << 86868968);
                                      var11 = (65280 & wfa.field_F[0] << 84403048) - -(wfa.field_F[1] & 255);
                                      var10 = (255 & wfa.field_F[6]) + (wfa.field_F[4] << -959727792 & 16711680) + (wfa.field_F[5] << 1057120648 & 65280);
                                      var13 = wfa.field_F[7] & 255;
                                      break L8;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  L14: {
                                    if (var11 != param4) {
                                      break L14;
                                    } else {
                                      if (var9 != var12) {
                                        break L14;
                                      } else {
                                        if (this.field_d != var13) {
                                          break L14;
                                        } else {
                                          L15: {
                                            if (0 > var10) {
                                              break L15;
                                            } else {
                                              if ((long)var10 > this.field_c.b(true) / 520L) {
                                                break L15;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                          stackOut_41_0 = 0;
                                          stackIn_42_0 = stackOut_41_0;
                                          stackOut_42_0 = stackIn_42_0;
                                          stackIn_43_0 = stackOut_42_0;
                                          decompiledRegionSelector2 = 4;
                                          break L0;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_35_0 = 0;
                                  stackIn_36_0 = stackOut_35_0;
                                  stackOut_36_0 = stackIn_36_0;
                                  stackIn_37_0 = stackOut_36_0;
                                  decompiledRegionSelector2 = 3;
                                  break L0;
                                }
                              }
                              L16: {
                                if (-1 == (var10 ^ -1)) {
                                  L17: {
                                    var10 = (int)((this.field_c.b(true) - -519L) / 520L);
                                    param0 = false;
                                    if (0 != var10) {
                                      break L17;
                                    } else {
                                      var10++;
                                      break L17;
                                    }
                                  }
                                  if (var7_int == var10) {
                                    var10++;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                              L18: {
                                if (-513 > (-var8 + param1 ^ -1)) {
                                  break L18;
                                } else {
                                  var10 = 0;
                                  break L18;
                                }
                              }
                              L19: {
                                L20: {
                                  if (-65536 > (param4 ^ -1)) {
                                    break L20;
                                  } else {
                                    L21: {
                                      wfa.field_F[4] = (byte)(var10 >> 587301264);
                                      wfa.field_F[2] = (byte)(var9 >> 583428520);
                                      wfa.field_F[6] = (byte)var10;
                                      wfa.field_F[3] = (byte)var9;
                                      wfa.field_F[0] = (byte)(param4 >> 1978773960);
                                      wfa.field_F[5] = (byte)(var10 >> -1327305976);
                                      wfa.field_F[1] = (byte)param4;
                                      wfa.field_F[7] = (byte)this.field_d;
                                      this.field_c.a((byte) -109, (long)(var7_int * 520));
                                      this.field_c.a(wfa.field_F, 0, (byte) -17, 8);
                                      var11 = param1 - var8;
                                      if (var11 > 512) {
                                        var11 = 512;
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                    this.field_c.a(param2, var8, (byte) -17, var11);
                                    var8 = var8 + var11;
                                    if (var16 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                L22: {
                                  wfa.field_F[7] = (byte)(var10 >> 1566837160);
                                  wfa.field_F[5] = (byte)var9;
                                  wfa.field_F[1] = (byte)(param4 >> -625830512);
                                  wfa.field_F[3] = (byte)param4;
                                  wfa.field_F[0] = (byte)(param4 >> -249788232);
                                  wfa.field_F[6] = (byte)(var10 >> 1174006160);
                                  wfa.field_F[4] = (byte)(var9 >> -286510776);
                                  wfa.field_F[9] = (byte)this.field_d;
                                  wfa.field_F[8] = (byte)var10;
                                  wfa.field_F[2] = (byte)(param4 >> 1996238920);
                                  this.field_c.a((byte) 36, (long)(520 * var7_int));
                                  this.field_c.a(wfa.field_F, 0, (byte) -17, 10);
                                  var11 = param1 + -var8;
                                  if (-511 <= (var11 ^ -1)) {
                                    break L22;
                                  } else {
                                    var11 = 510;
                                    break L22;
                                  }
                                }
                                this.field_c.a(param2, var8, (byte) -17, var11);
                                var8 = var8 + var11;
                                break L19;
                              }
                              var9++;
                              var7_int = var10;
                              if (var16 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        stackOut_62_0 = 1;
                        stackIn_63_0 = stackOut_62_0;
                        stackOut_63_0 = stackIn_63_0;
                        stackIn_64_0 = stackOut_63_0;
                        break L5;
                      }
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
                  return stackIn_64_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_6_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_12_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_37_0 != 0;
                      } else {
                        return stackIn_43_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L23: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_69_0 = (RuntimeException) (var6_ref);
                stackOut_69_1 = new StringBuilder().append("ppa.A(").append(param0).append(',').append(param1).append(',');
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
                  break L23;
                } else {
                  stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
                  stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
                  stackOut_70_2 = "{...}";
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  stackIn_72_2 = stackOut_70_2;
                  break L23;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(la param0, int param1, ff param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (vpa.a(112)) {
                break L1;
              } else {
                if (!param2.k(-25319)) {
                  if ((param0.q((byte) -82) ^ -1) > -1) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    ql.field_k.k(99, -2988);
                    ql.field_k.f(-1477662136, param0.q((byte) -82));
                    ql.field_k.f(-1477662136, param0.a((byte) 107));
                    var3_int = 79 / ((param1 - 9) / 53);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (runtimeException);
            stackOut_8_1 = new StringBuilder().append("ppa.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final String toString() {
        return "" + this.field_d;
    }

    ppa(int param0, ph param1, ph param2, int param3) {
        this.field_c = null;
        this.field_b = null;
        this.field_e = 65000;
        try {
            this.field_d = param0;
            this.field_c = param1;
            this.field_b = param2;
            this.field_e = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ppa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_a = "Username: ";
    }
}
