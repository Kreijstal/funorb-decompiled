/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uf {
    private int field_c;
    static boolean field_d;
    private td field_b;
    private td field_e;
    private int field_a;

    private final boolean a(byte param0, int param1, int param2, byte[] param3, boolean param4) {
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
            int stackIn_5_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_62_0 = 0;
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
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_65_0 = 0;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            String stackOut_71_2 = null;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            String stackOut_70_2 = null;
            var16 = StarCannon.field_A;
            try {
              var6_ref = (Object) (Object) ((uf) this).field_b;
              synchronized (var6_ref) {
                try {
                  L0: {
                    L1: {
                      if (!param4) {
                        var7_int = (int)((((uf) this).field_b.b(false) - -519L) / 520L);
                        if (0 != var7_int) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if ((long)(6 + param2 * 6) <= ((uf) this).field_e.b(false)) {
                          L2: {
                            ((uf) this).field_e.a((long)(param2 * 6), 0);
                            ((uf) this).field_e.a(param0 ^ 38, cb.field_b, 0, 6);
                            var7_int = (255 & cb.field_b[5]) + (cb.field_b[3] << 16 & 16711680) - -(cb.field_b[4] << 8 & 65280);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (~(long)var7_int >= ~(((uf) this).field_b.b(false) / 520L)) {
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
                    cb.field_b[1] = (byte)(param1 >> 8);
                    cb.field_b[5] = (byte)var7_int;
                    cb.field_b[4] = (byte)(var7_int >> 8);
                    cb.field_b[2] = (byte)param1;
                    cb.field_b[0] = (byte)(param1 >> 16);
                    cb.field_b[3] = (byte)(var7_int >> 16);
                    ((uf) this).field_e.a((long)(6 * param2), 0);
                    ((uf) this).field_e.a(0, 6, false, cb.field_b);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (var8 >= param1) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (!param4) {
                              break L5;
                            } else {
                              L6: {
                                ((uf) this).field_b.a((long)(520 * var7_int), 0);
                                if (param2 > 65535) {
                                  try {
                                    L7: {
                                      ((uf) this).field_b.a(param0 + -38, cb.field_b, 0, 10);
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
                                    var11 = (255 & cb.field_b[3]) + ((cb.field_b[2] & 255) << 8) + (((255 & cb.field_b[0]) << 24) + (cb.field_b[1] << 16 & 16711680));
                                    var13 = cb.field_b[9] & 255;
                                    var12 = (255 & cb.field_b[5]) + (65280 & cb.field_b[4] << 8);
                                    var10 = (cb.field_b[8] & 255) + (cb.field_b[6] << 16 & 16711680) + (cb.field_b[7] << 8 & 65280);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((uf) this).field_b.a(0, cb.field_b, 0, 8);
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
                                    var12 = (cb.field_b[3] & 255) + (cb.field_b[2] << 8 & 65280);
                                    var10 = ((255 & cb.field_b[5]) << 8) + (((255 & cb.field_b[4]) << 16) - -(cb.field_b[6] & 255));
                                    var13 = 255 & cb.field_b[7];
                                    var11 = (255 & cb.field_b[1]) + ((cb.field_b[0] & 255) << 8);
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
                                  if (var12 != var9) {
                                    break L11;
                                  } else {
                                    if (var13 != ((uf) this).field_c) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (0 > var10) {
                                          break L12;
                                        } else {
                                          if (~(((uf) this).field_b.b(false) / 520L) > ~(long)var10) {
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
                                    }
                                  }
                                }
                              }
                              stackOut_32_0 = 0;
                              stackIn_33_0 = stackOut_32_0;
                              stackOut_33_0 = stackIn_33_0;
                              stackIn_34_0 = stackOut_33_0;
                              return stackIn_34_0 != 0;
                            }
                          }
                          L13: {
                            if (var10 == 0) {
                              L14: {
                                param4 = false;
                                var10 = (int)((((uf) this).field_b.b(false) - -519L) / 520L);
                                if (var10 == 0) {
                                  var10++;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              if (var7_int != var10) {
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
                            if (param1 - var8 <= 512) {
                              var10 = 0;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (param2 > 65535) {
                              L17: {
                                cb.field_b[3] = (byte)param2;
                                cb.field_b[2] = (byte)(param2 >> 8);
                                cb.field_b[0] = (byte)(param2 >> 24);
                                cb.field_b[7] = (byte)(var10 >> 8);
                                cb.field_b[6] = (byte)(var10 >> 16);
                                cb.field_b[4] = (byte)(var9 >> 8);
                                cb.field_b[1] = (byte)(param2 >> 16);
                                cb.field_b[5] = (byte)var9;
                                cb.field_b[8] = (byte)var10;
                                cb.field_b[9] = (byte)((uf) this).field_c;
                                ((uf) this).field_b.a((long)(var7_int * 520), 0);
                                ((uf) this).field_b.a(0, 10, false, cb.field_b);
                                var11 = -var8 + param1;
                                if (var11 <= 510) {
                                  break L17;
                                } else {
                                  var11 = 510;
                                  break L17;
                                }
                              }
                              ((uf) this).field_b.a(var8, var11, false, param3);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                cb.field_b[3] = (byte)var9;
                                cb.field_b[6] = (byte)var10;
                                cb.field_b[5] = (byte)(var10 >> 8);
                                cb.field_b[1] = (byte)param2;
                                cb.field_b[4] = (byte)(var10 >> 16);
                                cb.field_b[7] = (byte)((uf) this).field_c;
                                cb.field_b[2] = (byte)(var9 >> 8);
                                cb.field_b[0] = (byte)(param2 >> 8);
                                ((uf) this).field_b.a((long)(var7_int * 520), 0);
                                ((uf) this).field_b.a(0, 8, false, cb.field_b);
                                var11 = param1 + -var8;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((uf) this).field_b.a(var8, var11, false, param3);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var9++;
                          var7_int = var10;
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
                  L19: {
                    var7 = (IOException) (Object) decompiledCaughtException;
                    if (param0 == 38) {
                      break L19;
                    } else {
                      ((uf) this).field_b = null;
                      break L19;
                    }
                  }
                  stackOut_65_0 = 0;
                  stackIn_66_0 = stackOut_65_0;
                  return stackIn_66_0 != 0;
                }
                return stackIn_62_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_69_0 = (RuntimeException) var6;
                stackOut_69_1 = new StringBuilder().append("uf.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                stackIn_71_0 = stackOut_69_0;
                stackIn_71_1 = stackOut_69_1;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                if (param3 == null) {
                  stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
                  stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
                  stackOut_71_2 = "null";
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  stackIn_72_2 = stackOut_71_2;
                  break L20;
                } else {
                  stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
                  stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
                  stackOut_70_2 = "{...}";
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  stackIn_72_2 = stackOut_70_2;
                  break L20;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + 44 + param4 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((uf) this).field_c;
    }

    final static qb a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        qb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        qb stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 11 / ((-49 - param1) / 55);
            stackOut_0_0 = new qb(param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("uf.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    final byte[] a(int param0, byte param1) {
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
            Object stackIn_11_0 = null;
            Object stackIn_12_0 = null;
            Object stackIn_39_0 = null;
            Object stackIn_40_0 = null;
            Object stackIn_45_0 = null;
            Object stackIn_46_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_44_0 = null;
            Object stackOut_45_0 = null;
            Object stackOut_38_0 = null;
            Object stackOut_39_0 = null;
            Object stackOut_10_0 = null;
            Object stackOut_11_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_54_0 = null;
            var18 = StarCannon.field_A;
            var3 = (Object) (Object) ((uf) this).field_b;
            synchronized (var3) {
              try {
                L0: {
                  if (((uf) this).field_e.b(false) >= (long)(6 + 6 * param0)) {
                    L1: {
                      ((uf) this).field_e.a((long)(6 * param0), 0);
                      ((uf) this).field_e.a(0, cb.field_b, 0, 6);
                      if (param1 == 114) {
                        break L1;
                      } else {
                        byte[] discarded$2 = ((uf) this).a(24, (byte) 53);
                        break L1;
                      }
                    }
                    var4_int = (255 & cb.field_b[2]) + ((cb.field_b[1] << 8 & 65280) + (16711680 & cb.field_b[0] << 16));
                    var5 = (65280 & cb.field_b[4] << 8) + ((16711680 & cb.field_b[3] << 16) + (cb.field_b[5] & 255));
                    if (var4_int >= 0) {
                      if (((uf) this).field_a >= var4_int) {
                        if (0 < var5) {
                          if (((uf) this).field_b.b(false) / 520L >= (long)var5) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var4_int <= var7) {
                                stackOut_51_0 = (byte[]) var6;
                                stackIn_52_0 = stackOut_51_0;
                                stackOut_52_0 = (byte[]) (Object) stackIn_52_0;
                                stackIn_53_0 = stackOut_52_0;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L3: {
                                    ((uf) this).field_b.a((long)(var5 * 520), 0);
                                    var9 = -var7 + var4_int;
                                    if (param0 <= 65535) {
                                      L4: {
                                        var14 = 8;
                                        if (var9 <= 512) {
                                          break L4;
                                        } else {
                                          var9 = 512;
                                          break L4;
                                        }
                                      }
                                      ((uf) this).field_b.a(0, cb.field_b, 0, var14 + var9);
                                      var12 = (cb.field_b[6] & 255) + (65280 & cb.field_b[5] << 8) + (cb.field_b[4] << 16 & 16711680);
                                      var10 = (cb.field_b[0] << 8 & 65280) - -(255 & cb.field_b[1]);
                                      var11 = (cb.field_b[2] << 8 & 65280) + (cb.field_b[3] & 255);
                                      var13 = 255 & cb.field_b[7];
                                      break L3;
                                    } else {
                                      L5: {
                                        var14 = 10;
                                        if (var9 > 510) {
                                          var9 = 510;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      ((uf) this).field_b.a(0, cb.field_b, 0, var14 + var9);
                                      var11 = (65280 & cb.field_b[4] << 8) + (cb.field_b[5] & 255);
                                      var12 = (255 & cb.field_b[8]) + (((cb.field_b[6] & 255) << 16) - -(65280 & cb.field_b[7] << 8));
                                      var10 = (255 & cb.field_b[3]) + (16711680 & cb.field_b[1] << 16) + (-16777216 & cb.field_b[0] << 24) - -(cb.field_b[2] << 8 & 65280);
                                      var13 = cb.field_b[9] & 255;
                                      break L3;
                                    }
                                  }
                                  if (var10 == param0) {
                                    if (var8 == var11) {
                                      if (var13 == ((uf) this).field_c) {
                                        if (var12 >= 0) {
                                          if (((uf) this).field_b.b(false) / 520L >= (long)var12) {
                                            var15 = var14 + var9;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var15 <= var16) {
                                                var8++;
                                                var5 = var12;
                                                continue L2;
                                              } else {
                                                int incrementValue$3 = var7;
                                                var7++;
                                                var6[incrementValue$3] = cb.field_b[var16];
                                                var16++;
                                                continue L6;
                                              }
                                            }
                                          } else {
                                            stackOut_44_0 = null;
                                            stackIn_45_0 = stackOut_44_0;
                                            stackOut_45_0 = stackIn_45_0;
                                            stackIn_46_0 = stackOut_45_0;
                                            return (byte[]) (Object) stackIn_46_0;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        stackOut_38_0 = null;
                                        stackIn_39_0 = stackOut_38_0;
                                        stackOut_39_0 = stackIn_39_0;
                                        stackIn_40_0 = stackOut_39_0;
                                        return (byte[]) (Object) stackIn_40_0;
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
                            return null;
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

    final boolean a(int param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
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
          var5 = (Object) (Object) ((uf) this).field_b;
          synchronized (var5) {
            L0: {
              L1: {
                if (param0 < ~param1) {
                  break L1;
                } else {
                  if (((uf) this).field_a >= param1) {
                    L2: {
                      var6 = this.a((byte) 38, param1, param3, param2, true) ? 1 : 0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        var6 = this.a((byte) 38, param1, param3, param2, false) ? 1 : 0;
                        break L2;
                      }
                    }
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
            stackOut_10_1 = new StringBuilder().append("uf.C(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
    }

    final static String a(Throwable param0, int param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        ii var13 = null;
        StringWriter var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        L0: {
          if (param0 instanceof ii) {
            var13 = (ii) (Object) param0;
            param0 = var13.field_a;
            var2 = var13.field_b + " | ";
            var11 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var14 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var14);
        param0.printStackTrace(var4);
        var4.close();
        var5 = var14.toString();
        var2 = var5;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var2 = var7;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var2 = var8;
          var11 = var8;
          var2 = var11;
          if (var8 != null) {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (-1 == var9) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8.substring(0, var9);
                break L2;
              }
            }
            L3: {
              var15 = var11.trim();
              var2 = var15;
              var2 = var15;
              var16 = var15.substring(var15.lastIndexOf(' ') - -1);
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf('\t') + 1);
              var2 = var17;
              var2 = var17;
              var18 = var2 + var17;
              var2 = var18;
              var2 = var18;
              if (var9 == -1) {
                break L3;
              } else {
                if (-1 == var10) {
                  break L3;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 >= 0) {
                    var2 = var18 + var8.substring(var12 - -5, var10);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          } else {
            var2 = var11;
            var11 = var2;
            var2 = var11;
            var2 = var2 + "| " + var7;
            return var2;
          }
        }
    }

    uf(int param0, td param1, td param2, int param3) {
        ((uf) this).field_b = null;
        ((uf) this).field_e = null;
        ((uf) this).field_a = 65000;
        try {
            ((uf) this).field_b = param1;
            ((uf) this).field_c = param0;
            ((uf) this).field_a = param3;
            ((uf) this).field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "uf.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
    }
}
