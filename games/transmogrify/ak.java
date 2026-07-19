/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ak {
    private we field_e;
    private int field_b;
    static String field_c;
    private int field_f;
    private we field_d;
    static int field_a;

    public static void a(byte param0) {
        if (param0 < 114) {
            field_c = (String) null;
        }
        field_c = null;
    }

    final byte[] b(int param0, int param1) {
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
            Object stackIn_17_0 = null;
            Object stackIn_18_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            Object stackIn_44_0 = null;
            Object stackIn_45_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_44_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_16_0 = null;
            Object stackOut_17_0 = null;
            Object stackOut_56_0 = null;
            var18 = Transmogrify.field_A ? 1 : 0;
            var3 = this.field_e;
            synchronized (var3) {
              try {
                L0: {
                  if (this.field_d.b((byte) 36) >= (long)(6 + param1 * 6)) {
                    L1: {
                      this.field_d.a((long)(param1 * 6), (byte) -127);
                      this.field_d.a(0, 6, sf.field_kb, (byte) 0);
                      if (param0 < -35) {
                        break L1;
                      } else {
                        this.field_b = 73;
                        break L1;
                      }
                    }
                    var4_int = (sf.field_kb[2] & 255) + (16711680 & sf.field_kb[0] << -1068895248) + (sf.field_kb[1] << -225434456 & 65280);
                    var5 = (255 & sf.field_kb[5]) + (sf.field_kb[4] << 1418223976 & 65280) + (sf.field_kb[3] << 345083760 & 16711680);
                    if ((var4_int ^ -1) <= -1) {
                      if (var4_int <= this.field_f) {
                        if (-1 > (var5 ^ -1)) {
                          if ((this.field_e.b((byte) 36) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_53_0 = (byte[]) (var6);
                                stackIn_54_0 = stackOut_53_0;
                                stackOut_54_0 = (byte[]) ((Object) stackIn_54_0);
                                stackIn_55_0 = stackOut_54_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L3: {
                                    L4: {
                                      this.field_e.a((long)(var5 * 520), (byte) -126);
                                      var9 = var4_int - var7;
                                      if (param1 > 65535) {
                                        break L4;
                                      } else {
                                        L5: {
                                          if (-513 <= (var9 ^ -1)) {
                                            break L5;
                                          } else {
                                            var9 = 512;
                                            break L5;
                                          }
                                        }
                                        var14 = 8;
                                        this.field_e.a(0, var9 + var14, sf.field_kb, (byte) 0);
                                        var13 = 255 & sf.field_kb[7];
                                        var11 = (255 & sf.field_kb[3]) + (sf.field_kb[2] << 1257525064 & 65280);
                                        var12 = ((sf.field_kb[4] & 255) << 1837076240) - (-(65280 & sf.field_kb[5] << -275514296) + -(sf.field_kb[6] & 255));
                                        var10 = (255 & sf.field_kb[1]) + ((255 & sf.field_kb[0]) << 272948040);
                                        if (var18 == 0) {
                                          break L3;
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                    L6: {
                                      var14 = 10;
                                      if (-511 <= (var9 ^ -1)) {
                                        break L6;
                                      } else {
                                        var9 = 510;
                                        break L6;
                                      }
                                    }
                                    this.field_e.a(0, var9 - -var14, sf.field_kb, (byte) 0);
                                    var13 = 255 & sf.field_kb[9];
                                    var12 = (255 & sf.field_kb[8]) + (((sf.field_kb[6] & 255) << 1774064208) + (sf.field_kb[7] << 721928008 & 65280));
                                    var10 = ((sf.field_kb[1] & 255) << 1275276336) + ((sf.field_kb[0] & 255) << 1375517880) + ((sf.field_kb[2] << 1340318440 & 65280) + (255 & sf.field_kb[3]));
                                    var11 = (65280 & sf.field_kb[4] << 1760797032) - -(sf.field_kb[5] & 255);
                                    break L3;
                                  }
                                  if (var10 == param1) {
                                    if (var11 == var8) {
                                      if (this.field_b == var13) {
                                        if (var12 >= 0) {
                                          if ((long)var12 <= this.field_e.b((byte) 36) / 520L) {
                                            var15 = var14 - -var9;
                                            var16 = var14;
                                            L7: while (true) {
                                              L8: {
                                                if (var15 <= var16) {
                                                  var5 = var12;
                                                  var8++;
                                                  break L8;
                                                } else {
                                                  incrementValue$1 = var7;
                                                  var7++;
                                                  var6[incrementValue$1] = sf.field_kb[var16];
                                                  var16++;
                                                  if (var18 != 0) {
                                                    break L8;
                                                  } else {
                                                    continue L7;
                                                  }
                                                }
                                              }
                                              continue L2;
                                            }
                                          } else {
                                            stackOut_43_0 = null;
                                            stackIn_44_0 = stackOut_43_0;
                                            stackOut_44_0 = stackIn_44_0;
                                            stackIn_45_0 = stackOut_44_0;
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
                                  stackOut_22_0 = null;
                                  stackIn_23_0 = stackOut_22_0;
                                  stackOut_23_0 = stackIn_23_0;
                                  stackIn_24_0 = stackOut_23_0;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            stackOut_16_0 = null;
                            stackIn_17_0 = stackOut_16_0;
                            stackOut_17_0 = stackIn_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            decompiledRegionSelector0 = 0;
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
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_56_0 = null;
                stackIn_57_0 = stackOut_56_0;
                return (byte[]) ((Object) stackIn_57_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_18_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_24_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_45_0);
                  } else {
                    return stackIn_55_0;
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

    final boolean a(boolean param0, int param1, byte[] param2, int param3) {
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
            var5 = this.field_e;
            synchronized (var5) {
              L1: {
                L2: {
                  if (-1 < (param3 ^ -1)) {
                    break L2;
                  } else {
                    if (this.field_f < param3) {
                      break L2;
                    } else {
                      L3: {
                        var6 = this.a(param2, param3, true, param0, param1) ? 1 : 0;
                        if (var6 == 0) {
                          var6 = this.a(param2, param3, false, true, param1) ? 1 : 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      stackOut_8_0 = var6;
                      stackIn_9_0 = stackOut_8_0;
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
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5_ref);
            stackOut_12_1 = new StringBuilder().append("ak.F(").append(param0).append(',').append(param1).append(',');
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
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_9_0 != 0;
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    private final boolean a(byte[] param0, int param1, boolean param2, boolean param3, int param4) {
        try {
            boolean discarded$1 = false;
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
            byte[] var17 = null;
            int stackIn_6_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_13_0 = 0;
            boolean stackIn_21_0 = false;
            int stackIn_37_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_69_0 = 0;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            String stackIn_75_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            boolean stackOut_20_0 = false;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_66_0 = 0;
            int stackOut_68_0 = 0;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            RuntimeException stackOut_74_0 = null;
            StringBuilder stackOut_74_1 = null;
            String stackOut_74_2 = null;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            String stackOut_73_2 = null;
            var16 = Transmogrify.field_A ? 1 : 0;
            try {
              var6_ref2 = this.field_e;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param2) {
                        var7_int = (int)((519L + this.field_e.b((byte) 36)) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if (this.field_d.b((byte) 36) < (long)(6 + 6 * param4)) {
                          stackOut_5_0 = 0;
                          stackIn_6_0 = stackOut_5_0;
                          stackOut_6_0 = stackIn_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        } else {
                          L2: {
                            this.field_d.a((long)(6 * param4), (byte) -122);
                            this.field_d.a(0, 6, sf.field_kb, (byte) 0);
                            var7_int = (sf.field_kb[5] & 255) + ((sf.field_kb[4] & 255) << 324700936) + (sf.field_kb[3] << -389026672 & 16711680);
                            if ((var7_int ^ -1) >= -1) {
                              break L2;
                            } else {
                              if ((this.field_e.b((byte) 36) / 520L ^ -1L) > ((long)var7_int ^ -1L)) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          stackOut_12_0 = stackIn_12_0;
                          stackIn_13_0 = stackOut_12_0;
                          decompiledRegionSelector2 = 2;
                          break L0;
                        }
                      }
                    }
                    L3: {
                      sf.field_kb[4] = (byte)(var7_int >> -1238837592);
                      sf.field_kb[0] = (byte)(param1 >> -1888258480);
                      sf.field_kb[5] = (byte)var7_int;
                      sf.field_kb[1] = (byte)(param1 >> -897100792);
                      sf.field_kb[3] = (byte)(var7_int >> 14965840);
                      sf.field_kb[2] = (byte)param1;
                      this.field_d.a((long)(param4 * 6), (byte) -122);
                      if (param3) {
                        break L3;
                      } else {
                        var17 = (byte[]) null;
                        discarded$1 = this.a((byte[]) null, -23, true, false, 106);
                        break L3;
                      }
                    }
                    this.field_d.a(sf.field_kb, 6, (byte) 110, 0);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var8 >= param1) {
                            break L6;
                          } else {
                            var10 = 0;
                            stackOut_20_0 = param2;
                            stackIn_67_0 = stackOut_20_0 ? 1 : 0;
                            stackIn_21_0 = stackOut_20_0;
                            if (var16 != 0) {
                              break L5;
                            } else {
                              L7: {
                                if (stackIn_21_0) {
                                  L8: {
                                    L9: {
                                      this.field_e.a((long)(var7_int * 520), (byte) -122);
                                      if (-65536 > (param4 ^ -1)) {
                                        break L9;
                                      } else {
                                        try {
                                          L10: {
                                            this.field_e.a(0, 8, sf.field_kb, (byte) 0);
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
                                          var11 = (255 & sf.field_kb[1]) + (65280 & sf.field_kb[0] << 1931663432);
                                          var13 = 255 & sf.field_kb[7];
                                          var12 = (sf.field_kb[3] & 255) + (65280 & sf.field_kb[2] << 594668200);
                                          var10 = (sf.field_kb[6] & 255) + ((sf.field_kb[4] & 255) << 1503855760) + ((sf.field_kb[5] & 255) << -1546088728);
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
                                        this.field_e.a(0, 10, sf.field_kb, (byte) 0);
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
                                      var12 = ((sf.field_kb[4] & 255) << 1812029448) - -(sf.field_kb[5] & 255);
                                      var11 = ((sf.field_kb[2] & 255) << -527709592) + (((255 & sf.field_kb[1]) << -1627688016) + (((sf.field_kb[0] & 255) << -1963228200) - -(255 & sf.field_kb[3])));
                                      var13 = sf.field_kb[9] & 255;
                                      var10 = ((255 & sf.field_kb[6]) << 2097021136) + ((sf.field_kb[7] & 255) << 2049683784) + (255 & sf.field_kb[8]);
                                      break L8;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  L14: {
                                    if (var11 != param4) {
                                      break L14;
                                    } else {
                                      if (var12 != var9) {
                                        break L14;
                                      } else {
                                        if (var13 != this.field_b) {
                                          break L14;
                                        } else {
                                          L15: {
                                            if (-1 < (var10 ^ -1)) {
                                              break L15;
                                            } else {
                                              if ((this.field_e.b((byte) 36) / 520L ^ -1L) > ((long)var10 ^ -1L)) {
                                                break L15;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                          stackOut_42_0 = 0;
                                          stackIn_43_0 = stackOut_42_0;
                                          stackOut_43_0 = stackIn_43_0;
                                          stackIn_44_0 = stackOut_43_0;
                                          decompiledRegionSelector2 = 4;
                                          break L0;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_36_0 = 0;
                                  stackIn_37_0 = stackOut_36_0;
                                  stackOut_37_0 = stackIn_37_0;
                                  stackIn_38_0 = stackOut_37_0;
                                  decompiledRegionSelector2 = 3;
                                  break L0;
                                } else {
                                  break L7;
                                }
                              }
                              L16: {
                                if (var10 == 0) {
                                  L17: {
                                    var10 = (int)((this.field_e.b((byte) 36) - -519L) / 520L);
                                    param2 = false;
                                    if (var10 == 0) {
                                      var10++;
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  if (var10 == var7_int) {
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
                                if (512 >= param1 + -var8) {
                                  var10 = 0;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                L20: {
                                  if (param4 <= 65535) {
                                    break L20;
                                  } else {
                                    L21: {
                                      sf.field_kb[0] = (byte)(param4 >> -30746792);
                                      sf.field_kb[7] = (byte)(var10 >> 490251560);
                                      sf.field_kb[5] = (byte)var9;
                                      sf.field_kb[6] = (byte)(var10 >> 1689275120);
                                      sf.field_kb[8] = (byte)var10;
                                      sf.field_kb[1] = (byte)(param4 >> -2042769552);
                                      sf.field_kb[3] = (byte)param4;
                                      sf.field_kb[9] = (byte)this.field_b;
                                      sf.field_kb[2] = (byte)(param4 >> 1903809736);
                                      sf.field_kb[4] = (byte)(var9 >> -1827149080);
                                      this.field_e.a((long)(520 * var7_int), (byte) -128);
                                      this.field_e.a(sf.field_kb, 10, (byte) 90, 0);
                                      var11 = -var8 + param1;
                                      if (510 >= var11) {
                                        break L21;
                                      } else {
                                        var11 = 510;
                                        break L21;
                                      }
                                    }
                                    this.field_e.a(param0, var11, (byte) 118, var8);
                                    var8 = var8 + var11;
                                    if (var16 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                L22: {
                                  sf.field_kb[5] = (byte)(var10 >> 1491280936);
                                  sf.field_kb[4] = (byte)(var10 >> -890668656);
                                  sf.field_kb[7] = (byte)this.field_b;
                                  sf.field_kb[1] = (byte)param4;
                                  sf.field_kb[2] = (byte)(var9 >> -1970786616);
                                  sf.field_kb[3] = (byte)var9;
                                  sf.field_kb[6] = (byte)var10;
                                  sf.field_kb[0] = (byte)(param4 >> 1554521288);
                                  this.field_e.a((long)(520 * var7_int), (byte) -120);
                                  this.field_e.a(sf.field_kb, 8, (byte) 76, 0);
                                  var11 = -var8 + param1;
                                  if (var11 > 512) {
                                    var11 = 512;
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                this.field_e.a(param0, var11, (byte) 116, var8);
                                var8 = var8 + var11;
                                break L19;
                              }
                              var7_int = var10;
                              var9++;
                              continue L4;
                            }
                          }
                        }
                        stackOut_65_0 = 1;
                        stackIn_66_0 = stackOut_65_0;
                        stackOut_66_0 = stackIn_66_0;
                        stackIn_67_0 = stackOut_66_0;
                        break L5;
                      }
                      decompiledRegionSelector2 = 0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_68_0 = 0;
                  stackIn_69_0 = stackOut_68_0;
                  return stackIn_69_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_67_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_7_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_13_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_38_0 != 0;
                      } else {
                        return stackIn_44_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L23: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_72_0 = (RuntimeException) (var6_ref);
                stackOut_72_1 = new StringBuilder().append("ak.B(");
                stackIn_74_0 = stackOut_72_0;
                stackIn_74_1 = stackOut_72_1;
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                if (param0 == null) {
                  stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
                  stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
                  stackOut_74_2 = "null";
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  stackIn_75_2 = stackOut_74_2;
                  break L23;
                } else {
                  stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
                  stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
                  stackOut_73_2 = "{...}";
                  stackIn_75_0 = stackOut_73_0;
                  stackIn_75_1 = stackOut_73_1;
                  stackIn_75_2 = stackOut_73_2;
                  break L23;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static hh a(byte[] param0, int param1) {
        hh discarded$2 = null;
        hh var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        Object stackIn_2_0 = null;
        hh stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param1 == 21725) {
                  break L1;
                } else {
                  var3 = (byte[]) null;
                  discarded$2 = ak.a((byte[]) null, 124);
                  break L1;
                }
              }
              var2 = new hh(param0, gj.field_j, re.field_a, ql.field_b, wk.field_b, rg.field_D, re.field_K);
              wd.d(120);
              stackOut_5_0 = (hh) (var2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("ak.E(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hh) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    ak(int param0, we param1, we param2, int param3) {
        this.field_e = null;
        this.field_f = 65000;
        this.field_d = null;
        try {
            this.field_e = param1;
            this.field_f = param3;
            this.field_d = param2;
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ak.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final String toString() {
        return "" + this.field_b;
    }

    static {
        field_c = "Resume Tutorial";
        field_a = 500;
    }
}
