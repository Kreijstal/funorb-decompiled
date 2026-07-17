/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dl {
    private be field_a;
    private int field_f;
    private be field_c;
    static boolean field_g;
    static volatile boolean field_b;
    private int field_e;
    static sh field_d;

    final static cd a(int param0, sh param1, byte param2, sh param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        cd stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        cd stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (nb.a(param0, param4, (byte) -4, param1)) {
              int discarded$2 = 107;
              stackOut_3_0 = vi.a(param3.a(param0, -27493, param4));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (cd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("dl.F(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(-44).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param4 + 41);
        }
        return stackIn_4_0;
    }

    private final boolean a(byte[] param0, int param1, boolean param2, int param3, int param4) {
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
            int stackIn_36_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_68_0 = 0;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            String stackIn_74_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_67_0 = 0;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            String stackOut_73_2 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            var16 = Lexicominos.field_L ? 1 : 0;
            try {
              var6_ref2 = (Object) (Object) ((dl) this).field_a;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param2) {
                        var7_int = (int)((519L + ((dl) this).field_a.a((byte) -122)) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (~(long)(6 + param4 * 6) >= ~((dl) this).field_c.a((byte) -122)) {
                          L2: {
                            ((dl) this).field_c.a((byte) 40, (long)(param4 * 6));
                            ((dl) this).field_c.a(0, ra.field_a, 6, -1);
                            var7_int = (65280 & ra.field_a[4] << 8) + (ra.field_a[3] << 16 & 16711680) + (255 & ra.field_a[5]);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (~(((dl) this).field_a.a((byte) -122) / 520L) > ~(long)var7_int) {
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
                          return stackIn_12_0 != 0;
                        } else {
                          stackOut_4_0 = 0;
                          stackIn_5_0 = stackOut_4_0;
                          stackOut_5_0 = stackIn_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          return stackIn_6_0 != 0;
                        }
                      }
                    }
                    L3: {
                      ra.field_a[1] = (byte)(param3 >> 8);
                      ra.field_a[2] = (byte)param3;
                      ra.field_a[0] = (byte)(param3 >> 16);
                      ra.field_a[4] = (byte)(var7_int >> 8);
                      ra.field_a[3] = (byte)(var7_int >> 16);
                      ra.field_a[5] = (byte)var7_int;
                      if (param1 == 17699) {
                        break L3;
                      } else {
                        ((dl) this).field_c = null;
                        break L3;
                      }
                    }
                    ((dl) this).field_c.a((byte) 40, (long)(param4 * 6));
                    ((dl) this).field_c.b(0, ra.field_a, 6, -31593);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (param3 <= var8) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (!param2) {
                              break L6;
                            } else {
                              L7: {
                                ((dl) this).field_a.a((byte) 40, (long)(var7_int * 520));
                                if (param4 > 65535) {
                                  try {
                                    L8: {
                                      ((dl) this).field_a.a(0, ra.field_a, 10, -1);
                                      decompiledRegionSelector1 = 0;
                                      break L8;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L9: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L9;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var11 = (ra.field_a[2] << 8 & 65280) + ((ra.field_a[1] << 16 & 16711680) + (-16777216 & ra.field_a[0] << 24) + (ra.field_a[3] & 255));
                                    var12 = (ra.field_a[5] & 255) + (65280 & ra.field_a[4] << 8);
                                    var10 = ((ra.field_a[6] & 255) << 16) - (-((ra.field_a[7] & 255) << 8) - (ra.field_a[8] & 255));
                                    var13 = 255 & ra.field_a[9];
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      ((dl) this).field_a.a(0, ra.field_a, 8, -1);
                                      decompiledRegionSelector0 = 0;
                                      break L10;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L11: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L11;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var10 = ((255 & ra.field_a[5]) << 8) + (((ra.field_a[4] & 255) << 16) - -(ra.field_a[6] & 255));
                                    var11 = (255 & ra.field_a[1]) + (65280 & ra.field_a[0] << 8);
                                    var13 = 255 & ra.field_a[7];
                                    var12 = ((ra.field_a[2] & 255) << 8) - -(255 & ra.field_a[3]);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L12: {
                                if (param4 != var11) {
                                  break L12;
                                } else {
                                  if (var9 != var12) {
                                    break L12;
                                  } else {
                                    if (((dl) this).field_f != var13) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (var10 < 0) {
                                          break L13;
                                        } else {
                                          if (~(long)var10 >= ~(((dl) this).field_a.a((byte) -122) / 520L)) {
                                            break L6;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      stackOut_41_0 = 0;
                                      stackIn_42_0 = stackOut_41_0;
                                      stackOut_42_0 = stackIn_42_0;
                                      stackIn_43_0 = stackOut_42_0;
                                      return stackIn_43_0 != 0;
                                    }
                                  }
                                }
                              }
                              stackOut_35_0 = 0;
                              stackIn_36_0 = stackOut_35_0;
                              stackOut_36_0 = stackIn_36_0;
                              stackIn_37_0 = stackOut_36_0;
                              return stackIn_37_0 != 0;
                            }
                          }
                          L14: {
                            if (var10 == 0) {
                              L15: {
                                var10 = (int)((((dl) this).field_a.a((byte) -122) + 519L) / 520L);
                                param2 = false;
                                if (0 == var10) {
                                  var10++;
                                  break L15;
                                } else {
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
                            if (-var8 + param3 <= 512) {
                              var10 = 0;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (param4 > 65535) {
                              L18: {
                                ra.field_a[8] = (byte)var10;
                                ra.field_a[3] = (byte)param4;
                                ra.field_a[2] = (byte)(param4 >> 8);
                                ra.field_a[9] = (byte)((dl) this).field_f;
                                ra.field_a[5] = (byte)var9;
                                ra.field_a[1] = (byte)(param4 >> 16);
                                ra.field_a[4] = (byte)(var9 >> 8);
                                ra.field_a[7] = (byte)(var10 >> 8);
                                ra.field_a[6] = (byte)(var10 >> 16);
                                ra.field_a[0] = (byte)(param4 >> 24);
                                ((dl) this).field_a.a((byte) 40, (long)(520 * var7_int));
                                ((dl) this).field_a.b(0, ra.field_a, 10, -31593);
                                var11 = param3 + -var8;
                                if (var11 > 510) {
                                  var11 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((dl) this).field_a.b(var8, param0, var11, -31593);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                ra.field_a[5] = (byte)(var10 >> 8);
                                ra.field_a[6] = (byte)var10;
                                ra.field_a[1] = (byte)param4;
                                ra.field_a[3] = (byte)var9;
                                ra.field_a[2] = (byte)(var9 >> 8);
                                ra.field_a[7] = (byte)((dl) this).field_f;
                                ra.field_a[0] = (byte)(param4 >> 8);
                                ra.field_a[4] = (byte)(var10 >> 16);
                                ((dl) this).field_a.a((byte) 40, (long)(520 * var7_int));
                                ((dl) this).field_a.b(0, ra.field_a, 8, -31593);
                                var11 = param3 - var8;
                                if (var11 <= 512) {
                                  break L19;
                                } else {
                                  var11 = 512;
                                  break L19;
                                }
                              }
                              ((dl) this).field_a.b(var8, param0, var11, -31593);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L4;
                        }
                      }
                      stackOut_64_0 = 1;
                      stackIn_65_0 = stackOut_64_0;
                      stackOut_65_0 = stackIn_65_0;
                      stackIn_66_0 = stackOut_65_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_67_0 = 0;
                  stackIn_68_0 = stackOut_67_0;
                  return stackIn_68_0 != 0;
                }
                return stackIn_66_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_71_0 = (RuntimeException) var6_ref;
                stackOut_71_1 = new StringBuilder().append("dl.E(");
                stackIn_73_0 = stackOut_71_0;
                stackIn_73_1 = stackOut_71_1;
                stackIn_72_0 = stackOut_71_0;
                stackIn_72_1 = stackOut_71_1;
                if (param0 == null) {
                  stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
                  stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
                  stackOut_73_2 = "null";
                  stackIn_74_0 = stackOut_73_0;
                  stackIn_74_1 = stackOut_73_1;
                  stackIn_74_2 = stackOut_73_2;
                  break L20;
                } else {
                  stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
                  stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
                  stackOut_72_2 = "{...}";
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_74_1 = stackOut_72_1;
                  stackIn_74_2 = stackOut_72_2;
                  break L20;
                }
              }
              throw ld.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          var5 = (Object) (Object) ((dl) this).field_a;
          synchronized (var5) {
            L0: {
              L1: {
                if (~param1 > param3) {
                  break L1;
                } else {
                  if (((dl) this).field_e < param1) {
                    break L1;
                  } else {
                    L2: {
                      var6 = this.a(param0, 17699, true, param1, param2) ? 1 : 0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        var6 = this.a(param0, param3 + 17700, false, param1, param2) ? 1 : 0;
                        break L2;
                      }
                    }
                    stackOut_7_0 = var6;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_8_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5_ref;
            stackOut_11_1 = new StringBuilder().append("dl.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
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
            Object stackIn_5_0 = null;
            Object stackIn_6_0 = null;
            Object stackIn_17_0 = null;
            Object stackIn_18_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            Object stackIn_44_0 = null;
            Object stackIn_45_0 = null;
            byte[] stackIn_51_0 = null;
            byte[] stackIn_52_0 = null;
            Object stackIn_54_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_50_0 = null;
            byte[] stackOut_51_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_44_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_16_0 = null;
            Object stackOut_17_0 = null;
            Object stackOut_4_0 = null;
            Object stackOut_5_0 = null;
            Object stackOut_53_0 = null;
            var18 = Lexicominos.field_L ? 1 : 0;
            var3 = (Object) (Object) ((dl) this).field_a;
            synchronized (var3) {
              try {
                L0: {
                  L1: {
                    if (param1 == -65536) {
                      break L1;
                    } else {
                      String discarded$2 = ((dl) this).toString();
                      break L1;
                    }
                  }
                  if ((long)(param0 * 6 + 6) <= ((dl) this).field_c.a((byte) -122)) {
                    ((dl) this).field_c.a((byte) 40, (long)(6 * param0));
                    ((dl) this).field_c.a(0, ra.field_a, 6, -1);
                    var4_int = (255 & ra.field_a[2]) + ((255 & ra.field_a[0]) << 16) - -((ra.field_a[1] & 255) << 8);
                    var5 = (ra.field_a[5] & 255) + ((ra.field_a[3] & 255) << 16) - -(65280 & ra.field_a[4] << 8);
                    if (var4_int >= 0) {
                      if (((dl) this).field_e >= var4_int) {
                        if (var5 > 0) {
                          if ((long)var5 <= ((dl) this).field_a.a((byte) -122) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_50_0 = (byte[]) var6;
                                stackIn_51_0 = stackOut_50_0;
                                stackOut_51_0 = (byte[]) (Object) stackIn_51_0;
                                stackIn_52_0 = stackOut_51_0;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L3: {
                                    ((dl) this).field_a.a((byte) 40, (long)(520 * var5));
                                    var9 = -var7 + var4_int;
                                    if (param0 <= 65535) {
                                      L4: {
                                        if (512 >= var9) {
                                          break L4;
                                        } else {
                                          var9 = 512;
                                          break L4;
                                        }
                                      }
                                      var14 = 8;
                                      ((dl) this).field_a.a(0, ra.field_a, var14 + var9, -1);
                                      var12 = (255 & ra.field_a[6]) + ((ra.field_a[5] & 255) << 8) + ((ra.field_a[4] & 255) << 16);
                                      var11 = ((255 & ra.field_a[2]) << 8) - -(ra.field_a[3] & 255);
                                      var10 = (ra.field_a[0] << 8 & 65280) - -(255 & ra.field_a[1]);
                                      var13 = 255 & ra.field_a[7];
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
                                      ((dl) this).field_a.a(0, ra.field_a, var9 - -var14, -1);
                                      var12 = (255 & ra.field_a[8]) + ((255 & ra.field_a[6]) << 16) - -((ra.field_a[7] & 255) << 8);
                                      var10 = (255 & ra.field_a[3]) + ((ra.field_a[2] & 255) << 8) + (((255 & ra.field_a[1]) << 16) + ((255 & ra.field_a[0]) << 24));
                                      var11 = (ra.field_a[5] & 255) + (65280 & ra.field_a[4] << 8);
                                      var13 = 255 & ra.field_a[9];
                                      break L3;
                                    }
                                  }
                                  if (var10 == param0) {
                                    if (var8 == var11) {
                                      if (var13 == ((dl) this).field_f) {
                                        if (var12 >= 0) {
                                          if (((dl) this).field_a.a((byte) -122) / 520L >= (long)var12) {
                                            var15 = var14 + var9;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var16 >= var15) {
                                                var5 = var12;
                                                var8++;
                                                continue L2;
                                              } else {
                                                int incrementValue$3 = var7;
                                                var7++;
                                                var6[incrementValue$3] = ra.field_a[var16];
                                                var16++;
                                                continue L6;
                                              }
                                            }
                                          } else {
                                            stackOut_43_0 = null;
                                            stackIn_44_0 = stackOut_43_0;
                                            stackOut_44_0 = stackIn_44_0;
                                            stackIn_45_0 = stackOut_44_0;
                                            return (byte[]) (Object) stackIn_45_0;
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
                                  return (byte[]) (Object) stackIn_24_0;
                                }
                              }
                            }
                          } else {
                            stackOut_16_0 = null;
                            stackIn_17_0 = stackOut_16_0;
                            stackOut_17_0 = stackIn_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            return (byte[]) (Object) stackIn_18_0;
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
                    stackOut_4_0 = null;
                    stackIn_5_0 = stackOut_4_0;
                    stackOut_5_0 = stackIn_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    return (byte[]) (Object) stackIn_6_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_53_0 = null;
                stackIn_54_0 = stackOut_53_0;
                return (byte[]) (Object) stackIn_54_0;
              }
              return stackIn_52_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((dl) this).field_f;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 7) {
            field_b = false;
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = Lexicominos.field_L ? 1 : 0;
        try {
            bg.field_a.a((byte) 50);
            if (param0 != 5) {
                dl.b(114);
            }
            for (var1_int = 0; 32 > var1_int; var1_int++) {
                kj.field_q[var1_int] = 0L;
            }
            for (var1_int = 0; 32 > var1_int; var1_int++) {
                f.field_i[var1_int] = 0L;
            }
            jj.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "dl.C(" + param0 + 41);
        }
    }

    dl(int param0, be param1, be param2, int param3) {
        ((dl) this).field_a = null;
        ((dl) this).field_c = null;
        ((dl) this).field_e = 65000;
        try {
            ((dl) this).field_a = param1;
            ((dl) this).field_c = param2;
            ((dl) this).field_f = param0;
            ((dl) this).field_e = param3;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "dl.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
    }
}
