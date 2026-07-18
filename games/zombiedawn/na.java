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
            int stackIn_8_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_44_0 = 0;
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
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_37_0 = 0;
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
            var16 = ZombieDawn.field_J;
            try {
              var6_ref2 = (Object) (Object) ((na) this).field_a;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param1) {
                        var7_int = (int)((((na) this).field_a.a(-1) - -519L) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (~((na) this).field_b.a(-1) <= ~(long)(6 + 6 * param0)) {
                          L2: {
                            ((na) this).field_b.a(0, (long)(param0 * 6));
                            ((na) this).field_b.a(6, false, 0, cg.field_c);
                            var7_int = (255 & cg.field_c[5]) + ((cg.field_c[3] & 255) << 16) - -((cg.field_c[4] & 255) << 8);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if ((long)var7_int <= ((na) this).field_a.a(-1) / 520L) {
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackOut_14_0 = stackIn_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          return stackIn_15_0 != 0;
                        } else {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        }
                      }
                    }
                    cg.field_c[0] = (byte)(param4 >> 16);
                    cg.field_c[4] = (byte)(var7_int >> 8);
                    cg.field_c[2] = (byte)param4;
                    cg.field_c[5] = (byte)var7_int;
                    cg.field_c[1] = (byte)(param4 >> 8);
                    cg.field_c[3] = (byte)(var7_int >> 16);
                    ((na) this).field_b.a(0, (long)(param0 * 6));
                    ((na) this).field_b.a(42, cg.field_c, 0, 6);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (~var8 <= ~param4) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (param1) {
                              L6: {
                                ((na) this).field_a.a(0, (long)(var7_int * 520));
                                if (65535 >= param0) {
                                  try {
                                    L7: {
                                      ((na) this).field_a.a(8, false, 0, cg.field_c);
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
                                    var12 = (65280 & cg.field_c[2] << 8) - -(255 & cg.field_c[3]);
                                    var13 = 255 & cg.field_c[7];
                                    var11 = ((cg.field_c[0] & 255) << 8) + (255 & cg.field_c[1]);
                                    var10 = (65280 & cg.field_c[5] << 8) + (16711680 & cg.field_c[4] << 16) - -(255 & cg.field_c[6]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((na) this).field_a.a(10, false, 0, cg.field_c);
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
                                    var13 = 255 & cg.field_c[9];
                                    var12 = (cg.field_c[5] & 255) + (cg.field_c[4] << 8 & 65280);
                                    var11 = (65280 & cg.field_c[2] << 8) + ((cg.field_c[1] & 255) << 16) + (((cg.field_c[0] & 255) << 24) + (cg.field_c[3] & 255));
                                    var10 = (16711680 & cg.field_c[6] << 16) + (((cg.field_c[7] & 255) << 8) + (cg.field_c[8] & 255));
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (~param0 != ~var11) {
                                  break L11;
                                } else {
                                  if (var9 != var12) {
                                    break L11;
                                  } else {
                                    if (~var13 != ~((na) this).field_d) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (var10 < 0) {
                                          break L12;
                                        } else {
                                          if ((long)var10 > ((na) this).field_a.a(-1) / 520L) {
                                            break L12;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      stackOut_42_0 = 0;
                                      stackIn_43_0 = stackOut_42_0;
                                      stackOut_43_0 = stackIn_43_0;
                                      stackIn_44_0 = stackOut_43_0;
                                      return stackIn_44_0 != 0;
                                    }
                                  }
                                }
                              }
                              stackOut_36_0 = 0;
                              stackIn_37_0 = stackOut_36_0;
                              stackOut_37_0 = stackIn_37_0;
                              stackIn_38_0 = stackOut_37_0;
                              return stackIn_38_0 != 0;
                            } else {
                              break L5;
                            }
                          }
                          L13: {
                            if (var10 == 0) {
                              L14: {
                                param1 = false;
                                var10 = (int)((519L + ((na) this).field_a.a(-1)) / 520L);
                                if (var10 != 0) {
                                  break L14;
                                } else {
                                  var10++;
                                  break L14;
                                }
                              }
                              if (~var10 != ~var7_int) {
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
                            if (-var8 + param4 > 512) {
                              break L15;
                            } else {
                              var10 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (param0 > 65535) {
                              L17: {
                                cg.field_c[1] = (byte)(param0 >> 16);
                                cg.field_c[4] = (byte)(var9 >> 8);
                                cg.field_c[3] = (byte)param0;
                                cg.field_c[5] = (byte)var9;
                                cg.field_c[9] = (byte)((na) this).field_d;
                                cg.field_c[7] = (byte)(var10 >> 8);
                                cg.field_c[8] = (byte)var10;
                                cg.field_c[0] = (byte)(param0 >> 24);
                                cg.field_c[6] = (byte)(var10 >> 16);
                                cg.field_c[2] = (byte)(param0 >> 8);
                                ((na) this).field_a.a(0, (long)(var7_int * 520));
                                ((na) this).field_a.a(45, cg.field_c, 0, 10);
                                var11 = -var8 + param4;
                                if (var11 <= 510) {
                                  break L17;
                                } else {
                                  var11 = 510;
                                  break L17;
                                }
                              }
                              ((na) this).field_a.a(106, param2, var8, var11);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                cg.field_c[7] = (byte)((na) this).field_d;
                                cg.field_c[2] = (byte)(var9 >> 8);
                                cg.field_c[0] = (byte)(param0 >> 8);
                                cg.field_c[4] = (byte)(var10 >> 16);
                                cg.field_c[3] = (byte)var9;
                                cg.field_c[6] = (byte)var10;
                                cg.field_c[1] = (byte)param0;
                                cg.field_c[5] = (byte)(var10 >> 8);
                                ((na) this).field_a.a(0, (long)(520 * var7_int));
                                ((na) this).field_a.a(120, cg.field_c, 0, 8);
                                var11 = -var8 + param4;
                                if (var11 <= 512) {
                                  break L18;
                                } else {
                                  var11 = 512;
                                  break L18;
                                }
                              }
                              ((na) this).field_a.a(110, param2, var8, var11);
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
                stackOut_68_1 = new StringBuilder().append("na.C(").append(param0).append(',').append(param1).append(',');
                stackIn_70_0 = stackOut_68_0;
                stackIn_70_1 = stackOut_68_1;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1;
                if (param2 == null) {
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
              throw sh.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ',' + 109242696 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            var3 = (Object) (Object) ((na) this).field_a;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 * param1 + 6) <= ((na) this).field_b.a(param0 ^ 65535)) {
                    L1: {
                      ((na) this).field_b.a(0, (long)(param1 * 6));
                      if (param0 == -65536) {
                        break L1;
                      } else {
                        byte[] discarded$2 = ((na) this).a(36, 125);
                        break L1;
                      }
                    }
                    ((na) this).field_b.a(6, false, 0, cg.field_c);
                    var4_int = ((255 & cg.field_c[0]) << 16) + (cg.field_c[1] << 8 & 65280) - -(cg.field_c[2] & 255);
                    var5 = (cg.field_c[3] << 16 & 16711680) - (-(cg.field_c[4] << 8 & 65280) + -(cg.field_c[5] & 255));
                    if (var4_int >= 0) {
                      if (~var4_int >= ~((na) this).field_e) {
                        if (var5 > 0) {
                          if (~(((na) this).field_a.a(-1) / 520L) <= ~(long)var5) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var4_int <= var7) {
                                stackOut_50_0 = (byte[]) var6;
                                stackIn_51_0 = stackOut_50_0;
                                stackOut_51_0 = (byte[]) (Object) stackIn_51_0;
                                stackIn_52_0 = stackOut_51_0;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L3: {
                                    ((na) this).field_a.a(0, (long)(var5 * 520));
                                    var9 = var4_int - var7;
                                    if (param1 > 65535) {
                                      L4: {
                                        var14 = 10;
                                        if (var9 <= 510) {
                                          break L4;
                                        } else {
                                          var9 = 510;
                                          break L4;
                                        }
                                      }
                                      ((na) this).field_a.a(var9 + var14, false, 0, cg.field_c);
                                      var10 = ((255 & cg.field_c[1]) << 16) + ((cg.field_c[0] & 255) << 24) + ((65280 & cg.field_c[2] << 8) - -(cg.field_c[3] & 255));
                                      var11 = ((cg.field_c[4] & 255) << 8) - -(cg.field_c[5] & 255);
                                      var13 = 255 & cg.field_c[9];
                                      var12 = (255 & cg.field_c[8]) + ((cg.field_c[6] & 255) << 16) + ((cg.field_c[7] & 255) << 8);
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
                                      ((na) this).field_a.a(var14 + var9, false, 0, cg.field_c);
                                      var12 = (cg.field_c[6] & 255) + (((cg.field_c[4] & 255) << 16) + (cg.field_c[5] << 8 & 65280));
                                      var11 = ((cg.field_c[2] & 255) << 8) + (cg.field_c[3] & 255);
                                      var13 = 255 & cg.field_c[7];
                                      var10 = (cg.field_c[0] << 8 & 65280) + (255 & cg.field_c[1]);
                                      break L3;
                                    }
                                  }
                                  if (param1 == var10) {
                                    if (var8 == var11) {
                                      if (((na) this).field_d == var13) {
                                        if (0 <= var12) {
                                          if ((long)var12 <= ((na) this).field_a.a(-1) / 520L) {
                                            var15 = var9 + var14;
                                            var8++;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (~var16 <= ~var15) {
                                                var5 = var12;
                                                continue L2;
                                              } else {
                                                int incrementValue$3 = var7;
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
                                            return (byte[]) (Object) stackIn_45_0;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        stackOut_37_0 = null;
                                        stackIn_38_0 = stackOut_37_0;
                                        stackOut_38_0 = stackIn_38_0;
                                        stackIn_39_0 = stackOut_38_0;
                                        return (byte[]) (Object) stackIn_39_0;
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
                        stackOut_10_0 = null;
                        stackIn_11_0 = stackOut_10_0;
                        stackOut_11_0 = stackIn_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        return (byte[]) (Object) stackIn_12_0;
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
        return "" + ((na) this).field_d;
    }

    public static void a() {
        field_c = null;
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
          var5 = (Object) (Object) ((na) this).field_a;
          synchronized (var5) {
            L0: {
              L1: {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (param2 <= ((na) this).field_e) {
                    L2: {
                      var6 = this.a(param0, true, param1, 109242696, param2) ? 1 : 0;
                      if (var6 == 0) {
                        var6 = this.a(param0, false, param1, 109242696, param2) ? 1 : 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (param3 == -96) {
                        break L3;
                      } else {
                        ((na) this).field_d = -60;
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
            stackOut_13_1 = new StringBuilder().append("na.A(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_7_0 = 0;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 <= 0) {
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
                        return stackIn_15_0 != 0;
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
              break L0;
            }
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2_ref, "na.B(" + 0 + ',' + param1 + ')');
        }
        return stackIn_18_0 != 0;
    }

    na(int param0, sf param1, sf param2, int param3) {
        ((na) this).field_e = 65000;
        ((na) this).field_b = null;
        ((na) this).field_a = null;
        try {
            ((na) this).field_b = param2;
            ((na) this).field_a = param1;
            ((na) this).field_d = param0;
            ((na) this).field_e = param3;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "na.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
