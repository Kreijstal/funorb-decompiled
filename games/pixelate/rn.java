/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rn {
    private uo field_a;
    private int field_d;
    static wm field_f;
    private uo field_e;
    private int field_c;
    static int field_b;
    static String field_g;

    final boolean a(int param0, byte[] param1, boolean param2, int param3) {
        Object var5 = null;
        Object var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
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
        int stackOut_6_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          var5_ref = (Object) (Object) ((rn) this).field_a;
          synchronized (var5_ref) {
            L0: {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (((rn) this).field_c < param0) {
                    break L1;
                  } else {
                    var6 = this.a(true, 7, param1, param3, param0) ? 1 : 0;
                    if (!param2) {
                      L2: {
                        if (var6 != 0) {
                          break L2;
                        } else {
                          var6 = this.a(false, 7, param1, param3, param0) ? 1 : 0;
                          break L2;
                        }
                      }
                      stackOut_10_0 = var6;
                      stackIn_11_0 = stackOut_10_0;
                      break L0;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    }
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_11_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5_ref2;
            stackOut_14_1 = new StringBuilder().append("rn.A(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean a(boolean param0, int param1, byte[] param2, int param3, int param4) {
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
            int stackIn_8_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
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
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
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
            var16 = Pixelate.field_H ? 1 : 0;
            try {
              var6_ref2 = (Object) (Object) ((rn) this).field_a;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param0) {
                        if (~((rn) this).field_e.a(66) > ~(long)(6 + param3 * 6)) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        } else {
                          L2: {
                            ((rn) this).field_e.a((long)(6 * param3), 113);
                            ((rn) this).field_e.a(vi.field_K, (byte) 24, 6, 0);
                            var7_int = (vi.field_K[4] << 8 & 65280) + ((vi.field_K[3] << 16 & 16711680) + (vi.field_K[5] & 255));
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (((rn) this).field_a.a(116) / 520L < (long)var7_int) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackOut_14_0 = stackIn_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          return stackIn_15_0 != 0;
                        }
                      } else {
                        var7_int = (int)((519L + ((rn) this).field_a.a(41)) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    vi.field_K[4] = (byte)(var7_int >> 8);
                    vi.field_K[0] = (byte)(param4 >> 16);
                    vi.field_K[5] = (byte)var7_int;
                    vi.field_K[3] = (byte)(var7_int >> 16);
                    vi.field_K[1] = (byte)(param4 >> 8);
                    vi.field_K[2] = (byte)param4;
                    ((rn) this).field_e.a((long)(param3 * 6), 118);
                    ((rn) this).field_e.a(6, 0, (byte) -106, vi.field_K);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (~var8 <= ~param4) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (param0) {
                              L6: {
                                ((rn) this).field_a.a((long)(520 * var7_int), -101);
                                if (param3 <= 65535) {
                                  try {
                                    L7: {
                                      ((rn) this).field_a.a(vi.field_K, (byte) 24, 8, 0);
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
                                    var11 = (255 & vi.field_K[1]) + (vi.field_K[0] << 8 & 65280);
                                    var12 = ((255 & vi.field_K[2]) << 8) - -(vi.field_K[3] & 255);
                                    var13 = 255 & vi.field_K[7];
                                    var10 = (vi.field_K[6] & 255) + ((255 & vi.field_K[5]) << 8) + (vi.field_K[4] << 16 & 16711680);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((rn) this).field_a.a(vi.field_K, (byte) 24, 10, 0);
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
                                    var11 = (vi.field_K[0] << 24 & -16777216) - (-((255 & vi.field_K[1]) << 16) + -((vi.field_K[2] & 255) << 8)) - -(vi.field_K[3] & 255);
                                    var10 = (vi.field_K[7] << 8 & 65280) + ((255 & vi.field_K[6]) << 16) + (vi.field_K[8] & 255);
                                    var13 = 255 & vi.field_K[9];
                                    var12 = ((255 & vi.field_K[4]) << 8) - -(255 & vi.field_K[5]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (var11 != param3) {
                                  break L11;
                                } else {
                                  if (var9 != var12) {
                                    break L11;
                                  } else {
                                    if (var13 != ((rn) this).field_d) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (0 > var10) {
                                          break L12;
                                        } else {
                                          if ((long)var10 > ((rn) this).field_a.a(102) / 520L) {
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
                            if (var10 != 0) {
                              break L13;
                            } else {
                              L14: {
                                param0 = false;
                                var10 = (int)((((rn) this).field_a.a(75) + 519L) / 520L);
                                if (0 != var10) {
                                  break L14;
                                } else {
                                  var10++;
                                  break L14;
                                }
                              }
                              if (var10 == var7_int) {
                                var10++;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L15: {
                            if (param4 - var8 <= 512) {
                              var10 = 0;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (param3 <= 65535) {
                              L17: {
                                vi.field_K[4] = (byte)(var10 >> 16);
                                vi.field_K[7] = (byte)((rn) this).field_d;
                                vi.field_K[1] = (byte)param3;
                                vi.field_K[5] = (byte)(var10 >> 8);
                                vi.field_K[0] = (byte)(param3 >> 8);
                                vi.field_K[3] = (byte)var9;
                                vi.field_K[2] = (byte)(var9 >> 8);
                                vi.field_K[6] = (byte)var10;
                                ((rn) this).field_a.a((long)(var7_int * 520), 126);
                                ((rn) this).field_a.a(8, 0, (byte) -116, vi.field_K);
                                var11 = param4 - var8;
                                if (512 < var11) {
                                  var11 = 512;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((rn) this).field_a.a(var11, var8, (byte) -89, param2);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                vi.field_K[6] = (byte)(var10 >> 16);
                                vi.field_K[7] = (byte)(var10 >> 8);
                                vi.field_K[4] = (byte)(var9 >> 8);
                                vi.field_K[2] = (byte)(param3 >> 8);
                                vi.field_K[8] = (byte)var10;
                                vi.field_K[5] = (byte)var9;
                                vi.field_K[9] = (byte)((rn) this).field_d;
                                vi.field_K[1] = (byte)(param3 >> 16);
                                vi.field_K[3] = (byte)param3;
                                vi.field_K[0] = (byte)(param3 >> 24);
                                ((rn) this).field_a.a((long)(520 * var7_int), -112);
                                ((rn) this).field_a.a(10, 0, (byte) -88, vi.field_K);
                                var11 = param4 - var8;
                                if (var11 <= 510) {
                                  break L18;
                                } else {
                                  var11 = 510;
                                  break L18;
                                }
                              }
                              ((rn) this).field_a.a(var11, var8, (byte) -107, param2);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L3;
                        }
                      }
                      stackOut_60_0 = 1;
                      stackIn_61_0 = stackOut_60_0;
                      stackOut_61_0 = stackIn_61_0;
                      stackIn_62_0 = stackOut_61_0;
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
                return stackIn_62_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_67_0 = (RuntimeException) var6_ref;
                stackOut_67_1 = new StringBuilder().append("rn.F(").append(param0).append(',').append(7).append(',');
                stackIn_69_0 = stackOut_67_0;
                stackIn_69_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (param2 == null) {
                  stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                  stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
                  stackOut_69_2 = "null";
                  stackIn_70_0 = stackOut_69_0;
                  stackIn_70_1 = stackOut_69_1;
                  stackIn_70_2 = stackOut_69_2;
                  break L19;
                } else {
                  stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
                  stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
                  stackOut_68_2 = "{...}";
                  stackIn_70_0 = stackOut_68_0;
                  stackIn_70_1 = stackOut_68_1;
                  stackIn_70_2 = stackOut_68_2;
                  break L19;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_f = null;
    }

    final static fl a(String param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (!an.field_e.d(82)) {
              break L0;
            } else {
              if (!param0.equals((Object) (Object) an.field_e.b((byte) 81))) {
                an.field_e = ii.a((byte) 119, param0);
                break L0;
              } else {
                break L0;
              }
            }
          }
          return an.field_e;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("rn.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + -99 + ')');
        }
    }

    final static void a(byte param0) {
    }

    public final String toString() {
        return "" + ((rn) this).field_d;
    }

    final static boolean a(byte param0, we param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
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
            var2_int = param1.f(255);
            L1: {
              if (var2_int != 1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var3 = stackIn_5_0;
            stackOut_5_0 = var3;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("rn.G(").append(107).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final byte[] a(int param0, int param1) {
        try {
            int var3 = 0;
            Object var4 = null;
            IOException var5 = null;
            int var5_int = 0;
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
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
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
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_53_0 = null;
            var19 = Pixelate.field_H ? 1 : 0;
            var3 = -91 % ((param0 - 68) / 41);
            var4 = (Object) (Object) ((rn) this).field_a;
            synchronized (var4) {
              try {
                L0: {
                  if (((rn) this).field_e.a(39) >= (long)(6 * param1 + 6)) {
                    ((rn) this).field_e.a((long)(param1 * 6), -108);
                    ((rn) this).field_e.a(vi.field_K, (byte) 24, 6, 0);
                    var5_int = ((255 & vi.field_K[0]) << 16) + ((65280 & vi.field_K[1] << 8) - -(255 & vi.field_K[2]));
                    var6 = ((255 & vi.field_K[3]) << 16) - (-(vi.field_K[4] << 8 & 65280) + -(255 & vi.field_K[5]));
                    if (var5_int >= 0) {
                      if (((rn) this).field_c >= var5_int) {
                        if (0 < var6) {
                          if (~(((rn) this).field_a.a(52) / 520L) <= ~(long)var6) {
                            var7 = new byte[var5_int];
                            var8 = 0;
                            var9 = 0;
                            L1: while (true) {
                              if (var8 >= var5_int) {
                                stackOut_50_0 = (byte[]) var7;
                                stackIn_51_0 = stackOut_50_0;
                                stackOut_51_0 = (byte[]) (Object) stackIn_51_0;
                                stackIn_52_0 = stackOut_51_0;
                                break L0;
                              } else {
                                if (var6 != 0) {
                                  L2: {
                                    ((rn) this).field_a.a((long)(var6 * 520), 106);
                                    var10 = var5_int + -var8;
                                    if (param1 <= 65535) {
                                      L3: {
                                        var15 = 8;
                                        if (512 < var10) {
                                          var10 = 512;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                      ((rn) this).field_a.a(vi.field_K, (byte) 24, var10 + var15, 0);
                                      var11 = (255 & vi.field_K[1]) + (vi.field_K[0] << 8 & 65280);
                                      var13 = (255 & vi.field_K[6]) + (vi.field_K[5] << 8 & 65280) + (vi.field_K[4] << 16 & 16711680);
                                      var12 = (vi.field_K[3] & 255) + (vi.field_K[2] << 8 & 65280);
                                      var14 = 255 & vi.field_K[7];
                                      break L2;
                                    } else {
                                      L4: {
                                        if (var10 > 510) {
                                          var10 = 510;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var15 = 10;
                                      ((rn) this).field_a.a(vi.field_K, (byte) 24, var15 + var10, 0);
                                      var14 = 255 & vi.field_K[9];
                                      var13 = (vi.field_K[6] << 16 & 16711680) + ((65280 & vi.field_K[7] << 8) - -(vi.field_K[8] & 255));
                                      var11 = (255 & vi.field_K[3]) + (vi.field_K[2] << 8 & 65280) + ((-16777216 & vi.field_K[0] << 24) - -(vi.field_K[1] << 16 & 16711680));
                                      var12 = (255 & vi.field_K[5]) + (65280 & vi.field_K[4] << 8);
                                      break L2;
                                    }
                                  }
                                  if (var11 == param1) {
                                    if (var9 == var12) {
                                      if (((rn) this).field_d == var14) {
                                        if (var13 >= 0) {
                                          if (~(long)var13 >= ~(((rn) this).field_a.a(81) / 520L)) {
                                            var16 = var10 + var15;
                                            var6 = var13;
                                            var17 = var15;
                                            L5: while (true) {
                                              if (var16 <= var17) {
                                                var9++;
                                                continue L1;
                                              } else {
                                                int incrementValue$1 = var8;
                                                var8++;
                                                var7[incrementValue$1] = vi.field_K[var17];
                                                var17++;
                                                continue L5;
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
                                  stackOut_20_0 = null;
                                  stackIn_21_0 = stackOut_20_0;
                                  stackOut_21_0 = stackIn_21_0;
                                  stackIn_22_0 = stackOut_21_0;
                                  return (byte[]) (Object) stackIn_22_0;
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
                var5 = (IOException) (Object) decompiledCaughtException;
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

    rn(int param0, uo param1, uo param2, int param3) {
        ((rn) this).field_a = null;
        ((rn) this).field_e = null;
        ((rn) this).field_c = 65000;
        try {
            ((rn) this).field_a = param1;
            ((rn) this).field_d = param0;
            ((rn) this).field_e = param2;
            ((rn) this).field_c = param3;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "rn.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new wm(0, 2, 2, 1);
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
