/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fo {
    private int field_d;
    private int field_a;
    private gdb field_c;
    private gdb field_b;

    private final boolean a(byte[] param0, byte param1, boolean param2, int param3, int param4) {
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
            int stackIn_6_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_65_0 = 0;
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
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_68_0 = 0;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            RuntimeException stackOut_74_0 = null;
            StringBuilder stackOut_74_1 = null;
            String stackOut_74_2 = null;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            String stackOut_73_2 = null;
            var16 = VoidHunters.field_G;
            try {
              var6_ref = (Object) (Object) ((fo) this).field_c;
              synchronized (var6_ref) {
                try {
                  L0: {
                    L1: {
                      if (!param2) {
                        var7_int = (int)((((fo) this).field_c.b(0) + 519L) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (~(long)(param4 * 6 - -6) < ~((fo) this).field_b.b(0)) {
                          stackOut_5_0 = 0;
                          stackIn_6_0 = stackOut_5_0;
                          stackOut_6_0 = stackIn_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        } else {
                          L2: {
                            ((fo) this).field_b.a(0, (long)(6 * param4));
                            ((fo) this).field_b.a(hbb.field_N, 6, 0, -30541);
                            var7_int = (hbb.field_N[5] & 255) + (65280 & hbb.field_N[4] << 8) + ((255 & hbb.field_N[3]) << 16);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (~(((fo) this).field_c.b(0) / 520L) <= ~(long)var7_int) {
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
                        }
                      }
                    }
                    hbb.field_N[0] = (byte)(param3 >> 16);
                    hbb.field_N[5] = (byte)var7_int;
                    hbb.field_N[2] = (byte)param3;
                    hbb.field_N[1] = (byte)(param3 >> 8);
                    hbb.field_N[3] = (byte)(var7_int >> 16);
                    hbb.field_N[4] = (byte)(var7_int >> 8);
                    ((fo) this).field_b.a(0, (long)(param4 * 6));
                    ((fo) this).field_b.a(6, 0, (byte) -117, hbb.field_N);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (var8 >= param3) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (!param2) {
                              break L5;
                            } else {
                              L6: {
                                ((fo) this).field_c.a(0, (long)(520 * var7_int));
                                if (param4 <= 65535) {
                                  try {
                                    L7: {
                                      ((fo) this).field_c.a(hbb.field_N, 8, 0, -30541);
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
                                    var11 = ((hbb.field_N[0] & 255) << 8) + (255 & hbb.field_N[1]);
                                    var10 = (255 & hbb.field_N[6]) + ((hbb.field_N[4] << 16 & 16711680) - -(hbb.field_N[5] << 8 & 65280));
                                    var13 = 255 & hbb.field_N[7];
                                    var12 = ((hbb.field_N[2] & 255) << 8) - -(255 & hbb.field_N[3]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((fo) this).field_c.a(hbb.field_N, 10, 0, -30541);
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
                                    var13 = hbb.field_N[9] & 255;
                                    var12 = (255 & hbb.field_N[5]) + (hbb.field_N[4] << 8 & 65280);
                                    var10 = (hbb.field_N[6] << 16 & 16711680) - (-(65280 & hbb.field_N[7] << 8) - (hbb.field_N[8] & 255));
                                    var11 = (hbb.field_N[3] & 255) + ((255 & hbb.field_N[1]) << 16) + (hbb.field_N[0] << 24 & -16777216) + ((hbb.field_N[2] & 255) << 8);
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
                                  if (var12 != var9) {
                                    break L11;
                                  } else {
                                    if (var13 != ((fo) this).field_d) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (var10 < 0) {
                                          break L12;
                                        } else {
                                          if (((fo) this).field_c.b(0) / 520L >= (long)var10) {
                                            break L5;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      stackOut_40_0 = 0;
                                      stackIn_41_0 = stackOut_40_0;
                                      stackOut_41_0 = stackIn_41_0;
                                      stackIn_42_0 = stackOut_41_0;
                                      return stackIn_42_0 != 0;
                                    }
                                  }
                                }
                              }
                              stackOut_34_0 = 0;
                              stackIn_35_0 = stackOut_34_0;
                              stackOut_35_0 = stackIn_35_0;
                              stackIn_36_0 = stackOut_35_0;
                              return stackIn_36_0 != 0;
                            }
                          }
                          L13: {
                            if (0 == var10) {
                              L14: {
                                var10 = (int)((519L + ((fo) this).field_c.b(0)) / 520L);
                                param2 = false;
                                if (0 == var10) {
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
                            } else {
                              break L13;
                            }
                          }
                          L15: {
                            if (512 < -var8 + param3) {
                              break L15;
                            } else {
                              var10 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (param4 > 65535) {
                              L17: {
                                hbb.field_N[8] = (byte)var10;
                                hbb.field_N[7] = (byte)(var10 >> 8);
                                hbb.field_N[5] = (byte)var9;
                                hbb.field_N[0] = (byte)(param4 >> 24);
                                hbb.field_N[6] = (byte)(var10 >> 16);
                                hbb.field_N[9] = (byte)((fo) this).field_d;
                                hbb.field_N[4] = (byte)(var9 >> 8);
                                hbb.field_N[1] = (byte)(param4 >> 16);
                                hbb.field_N[2] = (byte)(param4 >> 8);
                                hbb.field_N[3] = (byte)param4;
                                ((fo) this).field_c.a(0, (long)(var7_int * 520));
                                ((fo) this).field_c.a(10, 0, (byte) -120, hbb.field_N);
                                var11 = -var8 + param3;
                                if (var11 > 510) {
                                  var11 = 510;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((fo) this).field_c.a(var11, var8, (byte) -106, param0);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                hbb.field_N[3] = (byte)var9;
                                hbb.field_N[6] = (byte)var10;
                                hbb.field_N[0] = (byte)(param4 >> 8);
                                hbb.field_N[4] = (byte)(var10 >> 16);
                                hbb.field_N[5] = (byte)(var10 >> 8);
                                hbb.field_N[7] = (byte)((fo) this).field_d;
                                hbb.field_N[1] = (byte)param4;
                                hbb.field_N[2] = (byte)(var9 >> 8);
                                ((fo) this).field_c.a(0, (long)(520 * var7_int));
                                ((fo) this).field_c.a(8, 0, (byte) -114, hbb.field_N);
                                var11 = param3 - var8;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((fo) this).field_c.a(var11, var8, (byte) -102, param0);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var7_int = var10;
                          var9++;
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
                  L19: {
                    var7 = (IOException) (Object) decompiledCaughtException;
                    if (param1 <= -62) {
                      break L19;
                    } else {
                      ((fo) this).field_a = 31;
                      break L19;
                    }
                  }
                  stackOut_68_0 = 0;
                  stackIn_69_0 = stackOut_68_0;
                  return stackIn_69_0 != 0;
                }
                return stackIn_65_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_72_0 = (RuntimeException) var6;
                stackOut_72_1 = new StringBuilder().append("fo.B(");
                stackIn_74_0 = stackOut_72_0;
                stackIn_74_1 = stackOut_72_1;
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                if (param0 == null) {
                  stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
                  stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
                  stackOut_74_2 = "null";
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  stackIn_75_2 = stackOut_74_2;
                  break L20;
                } else {
                  stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
                  stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
                  stackOut_73_2 = "{...}";
                  stackIn_75_0 = stackOut_73_0;
                  stackIn_75_1 = stackOut_73_1;
                  stackIn_75_2 = stackOut_73_2;
                  break L20;
                }
              }
              throw rta.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
          var5 = (Object) (Object) ((fo) this).field_c;
          synchronized (var5) {
            L0: {
              L1: {
                if (0 > param3) {
                  break L1;
                } else {
                  if (param3 <= ((fo) this).field_a) {
                    L2: {
                      if (param1 == 520) {
                        break L2;
                      } else {
                        byte[] discarded$3 = ((fo) this).a((byte) -30, -43);
                        break L2;
                      }
                    }
                    L3: {
                      var6 = this.a(param2, (byte) -93, true, param3, param0) ? 1 : 0;
                      if (var6 == 0) {
                        var6 = this.a(param2, (byte) -112, false, param3, param0) ? 1 : 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    stackOut_9_0 = var6;
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_10_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5_ref;
            stackOut_13_1 = new StringBuilder().append("fo.C(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
    }

    public final String toString() {
        return "" + ((fo) this).field_d;
    }

    final byte[] a(byte param0, int param1) {
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
            Object stackIn_19_0 = null;
            Object stackIn_20_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_56_0 = null;
            var18 = VoidHunters.field_G;
            var3 = (Object) (Object) ((fo) this).field_c;
            synchronized (var3) {
              try {
                L0: {
                  if (~(long)(6 + param1 * 6) >= ~((fo) this).field_b.b(0)) {
                    ((fo) this).field_b.a(0, (long)(6 * param1));
                    ((fo) this).field_b.a(hbb.field_N, 6, 0, -30541);
                    var4_int = (255 & hbb.field_N[2]) + (((255 & hbb.field_N[0]) << 16) + ((255 & hbb.field_N[1]) << 8));
                    var5 = (hbb.field_N[3] << 16 & 16711680) - -(hbb.field_N[4] << 8 & 65280) + (hbb.field_N[5] & 255);
                    if (var4_int >= 0) {
                      if (((fo) this).field_a >= var4_int) {
                        if (0 < var5) {
                          if (~(((fo) this).field_c.b(0) / 520L) <= ~(long)var5) {
                            var6 = new byte[var4_int];
                            if (param0 > 13) {
                              var7 = 0;
                              var8 = 0;
                              L1: while (true) {
                                if (var7 >= var4_int) {
                                  stackOut_53_0 = (byte[]) var6;
                                  stackIn_54_0 = stackOut_53_0;
                                  stackOut_54_0 = (byte[]) (Object) stackIn_54_0;
                                  stackIn_55_0 = stackOut_54_0;
                                  break L0;
                                } else {
                                  if (var5 != 0) {
                                    L2: {
                                      ((fo) this).field_c.a(0, (long)(var5 * 520));
                                      var9 = var4_int - var7;
                                      if (65535 < param1) {
                                        L3: {
                                          var14 = 10;
                                          if (var9 > 510) {
                                            var9 = 510;
                                            break L3;
                                          } else {
                                            break L3;
                                          }
                                        }
                                        ((fo) this).field_c.a(hbb.field_N, var9 - -var14, 0, -30541);
                                        var10 = (255 & hbb.field_N[3]) + (((hbb.field_N[2] & 255) << 8) + ((hbb.field_N[0] & 255) << 24) - -((255 & hbb.field_N[1]) << 16));
                                        var12 = ((hbb.field_N[7] & 255) << 8) + (16711680 & hbb.field_N[6] << 16) - -(hbb.field_N[8] & 255);
                                        var13 = hbb.field_N[9] & 255;
                                        var11 = (255 & hbb.field_N[5]) + (65280 & hbb.field_N[4] << 8);
                                        break L2;
                                      } else {
                                        L4: {
                                          var14 = 8;
                                          if (512 >= var9) {
                                            break L4;
                                          } else {
                                            var9 = 512;
                                            break L4;
                                          }
                                        }
                                        ((fo) this).field_c.a(hbb.field_N, var14 + var9, 0, -30541);
                                        var13 = hbb.field_N[7] & 255;
                                        var11 = (255 & hbb.field_N[3]) + ((hbb.field_N[2] & 255) << 8);
                                        var12 = (255 & hbb.field_N[6]) + ((255 & hbb.field_N[4]) << 16) - -(65280 & hbb.field_N[5] << 8);
                                        var10 = (hbb.field_N[1] & 255) + (65280 & hbb.field_N[0] << 8);
                                        break L2;
                                      }
                                    }
                                    if (param1 == var10) {
                                      if (var8 == var11) {
                                        if (((fo) this).field_d == var13) {
                                          if (var12 >= 0) {
                                            if (((fo) this).field_c.b(0) / 520L >= (long)var12) {
                                              var15 = var14 + var9;
                                              var5 = var12;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (var15 <= var16) {
                                                  var8++;
                                                  continue L1;
                                                } else {
                                                  int incrementValue$1 = var7;
                                                  var7++;
                                                  var6[incrementValue$1] = hbb.field_N[var16];
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
                                    return null;
                                  }
                                }
                              }
                            } else {
                              stackOut_18_0 = null;
                              stackIn_19_0 = stackOut_18_0;
                              stackOut_19_0 = stackIn_19_0;
                              stackIn_20_0 = stackOut_19_0;
                              return (byte[]) (Object) stackIn_20_0;
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

    fo(int param0, gdb param1, gdb param2, int param3) {
        ((fo) this).field_a = 65000;
        ((fo) this).field_c = null;
        ((fo) this).field_b = null;
        try {
            ((fo) this).field_d = param0;
            ((fo) this).field_a = param3;
            ((fo) this).field_b = param2;
            ((fo) this).field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "fo.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
