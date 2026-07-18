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
        return "" + ((ah) this).field_d;
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
          var5 = (Object) (Object) ((ah) this).field_f;
          synchronized (var5) {
            L0: {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (((ah) this).field_b >= param1) {
                    L2: {
                      var6 = this.a((byte) 37, param0, param1, param2, true) ? 1 : 0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        var6 = this.a((byte) 37, param0, param1, param2, false) ? 1 : 0;
                        break L2;
                      }
                    }
                    var7 = -45 % ((param3 - 42) / 43);
                    stackOut_6_0 = var6;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_7_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5_ref;
            stackOut_10_1 = new StringBuilder().append("ah.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
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
            int stackIn_33_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_62_0 = 0;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            String stackIn_68_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_61_0 = 0;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            String stackOut_67_2 = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            String stackOut_66_2 = null;
            var16 = fleas.field_A ? 1 : 0;
            try {
              var6_ref2 = (Object) (Object) ((ah) this).field_f;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param4) {
                        var7_int = (int)((((ah) this).field_f.c((byte) -91) - -519L) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if (~((ah) this).field_e.c((byte) -123) <= ~(long)(6 + param3 * 6)) {
                          L2: {
                            ((ah) this).field_e.a(-116, (long)(param3 * 6));
                            ((ah) this).field_e.a(nf.field_G, 0, 6, 6520);
                            var7_int = (nf.field_G[5] & 255) + ((16711680 & nf.field_G[3] << 16) + ((255 & nf.field_G[4]) << 8));
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (((ah) this).field_f.c((byte) -83) / 520L < (long)var7_int) {
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
                    nf.field_G[0] = (byte)(param2 >> 16);
                    nf.field_G[2] = (byte)param2;
                    nf.field_G[3] = (byte)(var7_int >> 16);
                    nf.field_G[5] = (byte)var7_int;
                    nf.field_G[1] = (byte)(param2 >> 8);
                    nf.field_G[4] = (byte)(var7_int >> 8);
                    ((ah) this).field_e.a(-118, (long)(6 * param3));
                    ((ah) this).field_e.a(0, nf.field_G, 6, (byte) 114);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (param2 <= var8) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (param4) {
                              L6: {
                                ((ah) this).field_f.a(-124, (long)(var7_int * 520));
                                if (param3 <= 65535) {
                                  try {
                                    L7: {
                                      ((ah) this).field_f.a(nf.field_G, 0, 8, 6520);
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
                                    var11 = (nf.field_G[0] << 8 & 65280) - -(255 & nf.field_G[1]);
                                    var13 = nf.field_G[7] & 255;
                                    var12 = (65280 & nf.field_G[2] << 8) - -(nf.field_G[3] & 255);
                                    var10 = (65280 & nf.field_G[5] << 8) + (((255 & nf.field_G[4]) << 16) + (nf.field_G[6] & 255));
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((ah) this).field_f.a(nf.field_G, 0, 10, 6520);
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
                                    var10 = (65280 & nf.field_G[7] << 8) + ((nf.field_G[6] & 255) << 16) + (nf.field_G[8] & 255);
                                    var11 = (255 & nf.field_G[3]) + (nf.field_G[2] << 8 & 65280) + (((255 & nf.field_G[1]) << 16) + ((255 & nf.field_G[0]) << 24));
                                    var12 = ((255 & nf.field_G[4]) << 8) - -(255 & nf.field_G[5]);
                                    var13 = nf.field_G[9] & 255;
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
                                  if (var12 != var9) {
                                    break L11;
                                  } else {
                                    if (((ah) this).field_d == var13) {
                                      L12: {
                                        if (var10 < 0) {
                                          break L12;
                                        } else {
                                          if (((ah) this).field_f.c((byte) -76) / 520L < (long)var10) {
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
                                      return stackIn_40_0 != 0;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              stackOut_32_0 = 0;
                              stackIn_33_0 = stackOut_32_0;
                              stackOut_33_0 = stackIn_33_0;
                              stackIn_34_0 = stackOut_33_0;
                              return stackIn_34_0 != 0;
                            } else {
                              break L5;
                            }
                          }
                          L13: {
                            if (0 != var10) {
                              break L13;
                            } else {
                              L14: {
                                param4 = false;
                                var10 = (int)((519L + ((ah) this).field_f.c((byte) -48)) / 520L);
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
                            }
                          }
                          L15: {
                            if (-513 > param2 + -var8) {
                              break L15;
                            } else {
                              var10 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (-65536 >= param3) {
                              L17: {
                                nf.field_G[4] = (byte)(var10 >> 16);
                                nf.field_G[7] = (byte)((ah) this).field_d;
                                nf.field_G[0] = (byte)(param3 >> 8);
                                nf.field_G[5] = (byte)(var10 >> 8);
                                nf.field_G[3] = (byte)var9;
                                nf.field_G[2] = (byte)(var9 >> 8);
                                nf.field_G[6] = (byte)var10;
                                nf.field_G[1] = (byte)param3;
                                ((ah) this).field_f.a(-111, (long)(var7_int * 520));
                                ((ah) this).field_f.a(0, nf.field_G, 8, (byte) 92);
                                var11 = -var8 + param2;
                                if (var11 <= 512) {
                                  break L17;
                                } else {
                                  var11 = 512;
                                  break L17;
                                }
                              }
                              ((ah) this).field_f.a(var8, param1, var11, (byte) -30);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                nf.field_G[3] = (byte)param3;
                                nf.field_G[8] = (byte)var10;
                                nf.field_G[6] = (byte)(var10 >> 16);
                                nf.field_G[0] = (byte)(param3 >> 24);
                                nf.field_G[4] = (byte)(var9 >> 8);
                                nf.field_G[7] = (byte)(var10 >> 8);
                                nf.field_G[2] = (byte)(param3 >> 8);
                                nf.field_G[9] = (byte)((ah) this).field_d;
                                nf.field_G[1] = (byte)(param3 >> 16);
                                nf.field_G[5] = (byte)var9;
                                ((ah) this).field_f.a(-104, (long)(520 * var7_int));
                                ((ah) this).field_f.a(0, nf.field_G, 10, (byte) 76);
                                var11 = param2 - var8;
                                if (var11 <= 510) {
                                  break L18;
                                } else {
                                  var11 = 510;
                                  break L18;
                                }
                              }
                              ((ah) this).field_f.a(var8, param1, var11, (byte) -59);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L3;
                        }
                      }
                      stackOut_58_0 = 1;
                      stackIn_59_0 = stackOut_58_0;
                      stackOut_59_0 = stackIn_59_0;
                      stackIn_60_0 = stackOut_59_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_61_0 = 0;
                  stackIn_62_0 = stackOut_61_0;
                  return stackIn_62_0 != 0;
                }
                return stackIn_60_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_65_0 = (RuntimeException) var6_ref;
                stackOut_65_1 = new StringBuilder().append("ah.A(").append(37).append(',');
                stackIn_67_0 = stackOut_65_0;
                stackIn_67_1 = stackOut_65_1;
                stackIn_66_0 = stackOut_65_0;
                stackIn_66_1 = stackOut_65_1;
                if (param1 == null) {
                  stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                  stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
                  stackOut_67_2 = "null";
                  stackIn_68_0 = stackOut_67_0;
                  stackIn_68_1 = stackOut_67_1;
                  stackIn_68_2 = stackOut_67_2;
                  break L19;
                } else {
                  stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
                  stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
                  stackOut_66_2 = "{...}";
                  stackIn_68_0 = stackOut_66_0;
                  stackIn_68_1 = stackOut_66_1;
                  stackIn_68_2 = stackOut_66_2;
                  break L19;
                }
              }
              throw pf.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_a = null;
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
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_36_0 = null;
            Object stackIn_37_0 = null;
            Object stackIn_49_0 = null;
            Object stackIn_50_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_48_0 = null;
            Object stackOut_49_0 = null;
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
            var3 = (Object) (Object) ((ah) this).field_f;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 + param1 * 6) <= ((ah) this).field_e.c((byte) -110)) {
                    ((ah) this).field_e.a(-119, (long)(6 * param1));
                    ((ah) this).field_e.a(nf.field_G, 0, 6, 6520);
                    var4_int = ((nf.field_G[0] & 255) << 16) + ((nf.field_G[1] << 8 & 65280) + (255 & nf.field_G[2]));
                    var5 = (65280 & nf.field_G[4] << 8) + ((16711680 & nf.field_G[3] << 16) - -(nf.field_G[5] & 255));
                    if (var4_int >= 0) {
                      if (var4_int <= ((ah) this).field_b) {
                        if (0 < var5) {
                          if ((long)var5 <= ((ah) this).field_f.c((byte) -103) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var4_int <= var7) {
                                if (param0 == -90) {
                                  stackOut_51_0 = (byte[]) var6;
                                  stackIn_52_0 = stackOut_51_0;
                                  stackOut_52_0 = (byte[]) (Object) stackIn_52_0;
                                  stackIn_53_0 = stackOut_52_0;
                                  break L0;
                                } else {
                                  stackOut_48_0 = null;
                                  stackIn_49_0 = stackOut_48_0;
                                  stackOut_49_0 = stackIn_49_0;
                                  stackIn_50_0 = stackOut_49_0;
                                  return (byte[]) (Object) stackIn_50_0;
                                }
                              } else {
                                if (0 != var5) {
                                  L2: {
                                    ((ah) this).field_f.a(param0 + -23, (long)(var5 * 520));
                                    var9 = -var7 + var4_int;
                                    if (65535 >= param1) {
                                      L3: {
                                        var14 = 8;
                                        if (var9 <= 512) {
                                          break L3;
                                        } else {
                                          var9 = 512;
                                          break L3;
                                        }
                                      }
                                      ((ah) this).field_f.a(nf.field_G, 0, var14 + var9, 6520);
                                      var12 = (nf.field_G[6] & 255) + (((255 & nf.field_G[5]) << 8) + ((255 & nf.field_G[4]) << 16));
                                      var10 = ((255 & nf.field_G[0]) << 8) - -(255 & nf.field_G[1]);
                                      var11 = (65280 & nf.field_G[2] << 8) + (255 & nf.field_G[3]);
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
                                      ((ah) this).field_f.a(nf.field_G, 0, var9 - -var14, 6520);
                                      var10 = ((255 & nf.field_G[0]) << 24) - -(16711680 & nf.field_G[1] << 16) - -(65280 & nf.field_G[2] << 8) - -(nf.field_G[3] & 255);
                                      var11 = (nf.field_G[4] << 8 & 65280) + (255 & nf.field_G[5]);
                                      var13 = nf.field_G[9] & 255;
                                      var12 = (65280 & nf.field_G[7] << 8) + (16711680 & nf.field_G[6] << 16) - -(nf.field_G[8] & 255);
                                      break L2;
                                    }
                                  }
                                  if (var10 == param1) {
                                    if (var8 == var11) {
                                      if (((ah) this).field_d == var13) {
                                        if (var12 >= 0) {
                                          if ((long)var12 <= ((ah) this).field_f.c((byte) -125) / 520L) {
                                            var15 = var9 + var14;
                                            var5 = var12;
                                            var8++;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var15 <= var16) {
                                                continue L1;
                                              } else {
                                                int incrementValue$1 = var7;
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
                                        return (byte[]) (Object) stackIn_37_0;
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
                stackOut_54_0 = null;
                stackIn_55_0 = stackOut_54_0;
                return (byte[]) (Object) stackIn_55_0;
              }
              return stackIn_53_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (vf.c((byte) -5)) {
              boolean discarded$15 = mg.field_a.a(hm.field_d, 40, true, bk.field_b);
              mg.field_a.d(true);
              L1: while (true) {
                if (!wf.b(-113)) {
                  break L0;
                } else {
                  boolean discarded$16 = mg.field_a.a(id.field_b, (byte) -105, ji.field_a);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (null == rh.field_p) {
                  break L2;
                } else {
                  if (!rh.field_p.field_c) {
                    break L2;
                  } else {
                    lh.a(false);
                    mg.field_a.b((qa) (Object) new ic(mg.field_a, fb.field_g), (byte) -35);
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "ah.C(" + -1 + ')');
        }
    }

    ah(int param0, k param1, k param2, int param3) {
        ((ah) this).field_b = 65000;
        ((ah) this).field_f = null;
        ((ah) this).field_e = null;
        try {
            ((ah) this).field_b = param3;
            ((ah) this).field_e = param2;
            ((ah) this).field_f = param1;
            ((ah) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ah.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_g = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
