/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eh {
    private int field_f;
    private dj field_b;
    static int field_a;
    private dj field_d;
    private int field_e;
    static volatile int field_c;

    final boolean a(byte[] param0, int param1, int param2, int param3) {
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
            if (param1 == 255) {
              break L0;
            } else {
              ((eh) this).field_d = null;
              break L0;
            }
          }
          var5 = (Object) (Object) ((eh) this).field_d;
          synchronized (var5) {
            L1: {
              L2: {
                if (param2 < 0) {
                  break L2;
                } else {
                  if (param2 <= ((eh) this).field_e) {
                    L3: {
                      var6 = this.a(param0, true, param3, true, param2) ? 1 : 0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var6 = this.a(param0, true, param3, false, param2) ? 1 : 0;
                        break L3;
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
          return stackIn_9_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5_ref;
            stackOut_12_1 = new StringBuilder().append("eh.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
          throw dd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean a(byte[] param0, boolean param1, int param2, boolean param3, int param4) {
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
            int stackIn_6_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
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
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
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
            var16 = OrbDefence.field_D ? 1 : 0;
            try {
              var6_ref2 = (Object) (Object) ((eh) this).field_d;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param3) {
                        var7_int = (int)((519L + ((eh) this).field_d.b(-107)) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if (~(long)(6 + 6 * param2) < ~((eh) this).field_b.b(-34)) {
                          stackOut_5_0 = 0;
                          stackIn_6_0 = stackOut_5_0;
                          stackOut_6_0 = stackIn_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        } else {
                          L2: {
                            ((eh) this).field_b.a((long)(param2 * 6), -1);
                            ((eh) this).field_b.a(0, (byte) -119, 6, bi.field_c);
                            var7_int = (bi.field_c[4] << 8 & 65280) + ((bi.field_c[3] << 16 & 16711680) + (bi.field_c[5] & 255));
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if (~(long)var7_int >= ~(((eh) this).field_d.b(-103) / 520L)) {
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
                    bi.field_c[3] = (byte)(var7_int >> 16);
                    bi.field_c[1] = (byte)(param4 >> 8);
                    bi.field_c[4] = (byte)(var7_int >> 8);
                    bi.field_c[0] = (byte)(param4 >> 16);
                    bi.field_c[5] = (byte)var7_int;
                    bi.field_c[2] = (byte)param4;
                    ((eh) this).field_b.a((long)(6 * param2), -1);
                    ((eh) this).field_b.a(false, bi.field_c, 6, 0);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (var8 >= param4) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (param3) {
                              L6: {
                                ((eh) this).field_d.a((long)(var7_int * 520), -1);
                                if (param2 <= 65535) {
                                  try {
                                    L7: {
                                      ((eh) this).field_d.a(0, (byte) 81, 8, bi.field_c);
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
                                    var10 = (255 & bi.field_c[6]) + (((255 & bi.field_c[4]) << 16) + (65280 & bi.field_c[5] << 8));
                                    var13 = 255 & bi.field_c[7];
                                    var12 = (bi.field_c[3] & 255) + ((255 & bi.field_c[2]) << 8);
                                    var11 = ((255 & bi.field_c[0]) << 8) + (255 & bi.field_c[1]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((eh) this).field_d.a(0, (byte) -128, 10, bi.field_c);
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
                                    var10 = ((255 & bi.field_c[6]) << 16) - -(65280 & bi.field_c[7] << 8) - -(255 & bi.field_c[8]);
                                    var12 = ((bi.field_c[4] & 255) << 8) + (bi.field_c[5] & 255);
                                    var13 = bi.field_c[9] & 255;
                                    var11 = (bi.field_c[3] & 255) + (((255 & bi.field_c[1]) << 16) + (((255 & bi.field_c[0]) << 24) + ((255 & bi.field_c[2]) << 8)));
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
                                  if (var9 != var12) {
                                    break L11;
                                  } else {
                                    if (((eh) this).field_f != var13) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (var10 < 0) {
                                          break L12;
                                        } else {
                                          if ((long)var10 > ((eh) this).field_d.b(114) / 520L) {
                                            break L12;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      stackOut_39_0 = 0;
                                      stackIn_40_0 = stackOut_39_0;
                                      stackOut_40_0 = stackIn_40_0;
                                      stackIn_41_0 = stackOut_40_0;
                                      return stackIn_41_0 != 0;
                                    }
                                  }
                                }
                              }
                              stackOut_33_0 = 0;
                              stackIn_34_0 = stackOut_33_0;
                              stackOut_34_0 = stackIn_34_0;
                              stackIn_35_0 = stackOut_34_0;
                              return stackIn_35_0 != 0;
                            } else {
                              break L5;
                            }
                          }
                          L13: {
                            if (var10 == 0) {
                              L14: {
                                var10 = (int)((((eh) this).field_d.b(123) + 519L) / 520L);
                                param3 = false;
                                if (var10 != 0) {
                                  break L14;
                                } else {
                                  var10++;
                                  break L14;
                                }
                              }
                              if (var7_int == var10) {
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
                            if (param4 - var8 > 512) {
                              break L15;
                            } else {
                              var10 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (param2 > 65535) {
                              L17: {
                                bi.field_c[4] = (byte)(var9 >> 8);
                                bi.field_c[9] = (byte)((eh) this).field_f;
                                bi.field_c[1] = (byte)(param2 >> 16);
                                bi.field_c[0] = (byte)(param2 >> 24);
                                bi.field_c[5] = (byte)var9;
                                bi.field_c[6] = (byte)(var10 >> 16);
                                bi.field_c[2] = (byte)(param2 >> 8);
                                bi.field_c[8] = (byte)var10;
                                bi.field_c[7] = (byte)(var10 >> 8);
                                bi.field_c[3] = (byte)param2;
                                ((eh) this).field_d.a((long)(520 * var7_int), -1);
                                ((eh) this).field_d.a(false, bi.field_c, 10, 0);
                                var11 = param4 + -var8;
                                if (var11 > 510) {
                                  var11 = 510;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((eh) this).field_d.a(false, param0, var11, var8);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                bi.field_c[2] = (byte)(var9 >> 8);
                                bi.field_c[5] = (byte)(var10 >> 8);
                                bi.field_c[6] = (byte)var10;
                                bi.field_c[7] = (byte)((eh) this).field_f;
                                bi.field_c[0] = (byte)(param2 >> 8);
                                bi.field_c[1] = (byte)param2;
                                bi.field_c[4] = (byte)(var10 >> 16);
                                bi.field_c[3] = (byte)var9;
                                ((eh) this).field_d.a((long)(var7_int * 520), -1);
                                ((eh) this).field_d.a(false, bi.field_c, 8, 0);
                                var11 = -var8 + param4;
                                if (512 < var11) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((eh) this).field_d.a(false, param0, var11, var8);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L3;
                        }
                      }
                      stackOut_61_0 = 1;
                      stackIn_62_0 = stackOut_61_0;
                      stackOut_62_0 = stackIn_62_0;
                      stackIn_63_0 = stackOut_62_0;
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
                return stackIn_63_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_68_0 = (RuntimeException) var6_ref;
                stackOut_68_1 = new StringBuilder().append("eh.B(");
                stackIn_70_0 = stackOut_68_0;
                stackIn_70_1 = stackOut_68_1;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1;
                if (param0 == null) {
                  stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
                  stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
                  stackOut_70_2 = "null";
                  stackIn_71_0 = stackOut_70_0;
                  stackIn_71_1 = stackOut_70_1;
                  stackIn_71_2 = stackOut_70_2;
                  break L19;
                } else {
                  stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                  stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
                  stackOut_69_2 = "{...}";
                  stackIn_71_0 = stackOut_69_0;
                  stackIn_71_1 = stackOut_69_1;
                  stackIn_71_2 = stackOut_69_2;
                  break L19;
                }
              }
              throw dd.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ',' + true + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((eh) this).field_f;
    }

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
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_19_0 = null;
            Object stackIn_20_0 = null;
            byte[] stackIn_53_0 = null;
            byte[] stackIn_54_0 = null;
            Object stackIn_56_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_52_0 = null;
            byte[] stackOut_53_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_55_0 = null;
            var18 = OrbDefence.field_D ? 1 : 0;
            var3 = (Object) (Object) ((eh) this).field_d;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 * param1 + 6) <= ((eh) this).field_b.b(126)) {
                    ((eh) this).field_b.a((long)(param1 * 6), -1);
                    ((eh) this).field_b.a(0, (byte) -18, 6, bi.field_c);
                    var4_int = ((255 & bi.field_c[0]) << 16) + (bi.field_c[1] << 8 & 65280) - -(bi.field_c[2] & 255);
                    var5 = (bi.field_c[3] << 16 & 16711680) - (-((bi.field_c[4] & 255) << 8) + -(bi.field_c[5] & 255));
                    if (0 <= var4_int) {
                      if (((eh) this).field_e >= var4_int) {
                        if (var5 > 0) {
                          if (~(((eh) this).field_d.b(107) / 520L) <= ~(long)var5) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            if (param0 == 520) {
                              L1: while (true) {
                                if (var7 >= var4_int) {
                                  stackOut_52_0 = (byte[]) var6;
                                  stackIn_53_0 = stackOut_52_0;
                                  stackOut_53_0 = (byte[]) (Object) stackIn_53_0;
                                  stackIn_54_0 = stackOut_53_0;
                                  break L0;
                                } else {
                                  if (var5 != 0) {
                                    L2: {
                                      ((eh) this).field_d.a((long)(var5 * 520), -1);
                                      var9 = var4_int - var7;
                                      if (65535 < param1) {
                                        L3: {
                                          if (var9 > 510) {
                                            var9 = 510;
                                            break L3;
                                          } else {
                                            break L3;
                                          }
                                        }
                                        var14 = 10;
                                        ((eh) this).field_d.a(0, (byte) -111, var9 - -var14, bi.field_c);
                                        var11 = ((bi.field_c[4] & 255) << 8) - -(bi.field_c[5] & 255);
                                        var10 = (bi.field_c[3] & 255) + (bi.field_c[0] << 24 & -16777216) + (bi.field_c[1] << 16 & 16711680) + ((bi.field_c[2] & 255) << 8);
                                        var13 = bi.field_c[9] & 255;
                                        var12 = (255 & bi.field_c[8]) + ((bi.field_c[6] << 16 & 16711680) + ((bi.field_c[7] & 255) << 8));
                                        break L2;
                                      } else {
                                        L4: {
                                          var14 = 8;
                                          if (512 < var9) {
                                            var9 = 512;
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        }
                                        ((eh) this).field_d.a(0, (byte) -125, var14 + var9, bi.field_c);
                                        var12 = (65280 & bi.field_c[5] << 8) + ((bi.field_c[4] & 255) << 16) - -(bi.field_c[6] & 255);
                                        var13 = 255 & bi.field_c[7];
                                        var11 = (bi.field_c[3] & 255) + ((255 & bi.field_c[2]) << 8);
                                        var10 = (bi.field_c[1] & 255) + ((255 & bi.field_c[0]) << 8);
                                        break L2;
                                      }
                                    }
                                    if (param1 == var10) {
                                      if (var8 == var11) {
                                        if (((eh) this).field_f == var13) {
                                          if (0 <= var12) {
                                            if (((eh) this).field_d.b(param0 ^ -587) / 520L >= (long)var12) {
                                              var15 = var14 + var9;
                                              var8++;
                                              var5 = var12;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (var15 <= var16) {
                                                  continue L1;
                                                } else {
                                                  int incrementValue$1 = var7;
                                                  var7++;
                                                  var6[incrementValue$1] = bi.field_c[var16];
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
                stackOut_55_0 = null;
                stackIn_56_0 = stackOut_55_0;
                return (byte[]) (Object) stackIn_56_0;
              }
              return stackIn_54_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    eh(int param0, dj param1, dj param2, int param3) {
        ((eh) this).field_e = 65000;
        ((eh) this).field_d = null;
        ((eh) this).field_b = null;
        try {
            ((eh) this).field_d = param1;
            ((eh) this).field_b = param2;
            ((eh) this).field_f = param0;
            ((eh) this).field_e = param3;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "eh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
