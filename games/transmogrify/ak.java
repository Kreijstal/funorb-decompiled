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

    public static void a() {
        field_c = null;
    }

    final byte[] b(int param0, int param1) {
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
            Object stackOut_53_0 = null;
            var18 = Transmogrify.field_A ? 1 : 0;
            var3 = (Object) (Object) ((ak) this).field_e;
            synchronized (var3) {
              try {
                L0: {
                  if (((ak) this).field_d.b((byte) 36) >= (long)(6 + param1 * 6)) {
                    L1: {
                      ((ak) this).field_d.a((long)(param1 * 6), (byte) -127);
                      ((ak) this).field_d.a(0, 6, sf.field_kb, (byte) 0);
                      if (param0 < -35) {
                        break L1;
                      } else {
                        ((ak) this).field_b = 73;
                        break L1;
                      }
                    }
                    var4_int = (sf.field_kb[2] & 255) + (16711680 & sf.field_kb[0] << 16) + (sf.field_kb[1] << 8 & 65280);
                    var5 = (255 & sf.field_kb[5]) + (sf.field_kb[4] << 8 & 65280) + (sf.field_kb[3] << 16 & 16711680);
                    if (var4_int >= 0) {
                      if (var4_int <= ((ak) this).field_f) {
                        if (var5 > 0) {
                          if (~(((ak) this).field_e.b((byte) 36) / 520L) <= ~(long)var5) {
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
                                if (0 != var5) {
                                  L3: {
                                    ((ak) this).field_e.a((long)(var5 * 520), (byte) -126);
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
                                      ((ak) this).field_e.a(0, var9 - -var14, sf.field_kb, (byte) 0);
                                      var13 = 255 & sf.field_kb[9];
                                      var12 = (255 & sf.field_kb[8]) + (((sf.field_kb[6] & 255) << 16) + (sf.field_kb[7] << 8 & 65280));
                                      var10 = ((sf.field_kb[1] & 255) << 16) + ((sf.field_kb[0] & 255) << 24) + ((sf.field_kb[2] << 8 & 65280) + (255 & sf.field_kb[3]));
                                      var11 = (65280 & sf.field_kb[4] << 8) - -(sf.field_kb[5] & 255);
                                      break L3;
                                    } else {
                                      L5: {
                                        if (var9 <= 512) {
                                          break L5;
                                        } else {
                                          var9 = 512;
                                          break L5;
                                        }
                                      }
                                      var14 = 8;
                                      ((ak) this).field_e.a(0, var9 + var14, sf.field_kb, (byte) 0);
                                      var13 = 255 & sf.field_kb[7];
                                      var11 = (255 & sf.field_kb[3]) + (sf.field_kb[2] << 8 & 65280);
                                      var12 = ((sf.field_kb[4] & 255) << 16) - (-(65280 & sf.field_kb[5] << 8) + -(sf.field_kb[6] & 255));
                                      var10 = (255 & sf.field_kb[1]) + ((255 & sf.field_kb[0]) << 8);
                                      break L3;
                                    }
                                  }
                                  if (var10 == param1) {
                                    if (var11 == var8) {
                                      if (((ak) this).field_b == var13) {
                                        if (var12 >= 0) {
                                          if ((long)var12 <= ((ak) this).field_e.b((byte) 36) / 520L) {
                                            var15 = var14 - -var9;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var15 <= var16) {
                                                var5 = var12;
                                                var8++;
                                                continue L2;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = sf.field_kb[var16];
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
          var5 = (Object) (Object) ((ak) this).field_e;
          synchronized (var5) {
            L0: {
              L1: {
                if (param3 < 0) {
                  break L1;
                } else {
                  if (((ak) this).field_f < param3) {
                    break L1;
                  } else {
                    L2: {
                      var6 = this.a(param2, param3, true, param0, param1) ? 1 : 0;
                      if (var6 == 0) {
                        var6 = this.a(param2, param3, false, true, param1) ? 1 : 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    stackOut_8_0 = var6;
                    stackIn_9_0 = stackOut_8_0;
                    break L0;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_9_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5_ref;
            stackOut_12_1 = new StringBuilder().append("ak.F(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 41);
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    private final boolean a(byte[] param0, int param1, boolean param2, boolean param3, int param4) {
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
            Object var17 = null;
            int stackIn_6_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_13_0 = 0;
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
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
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
            var16 = Transmogrify.field_A ? 1 : 0;
            try {
              var6_ref2 = (Object) (Object) ((ak) this).field_e;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param2) {
                        var7_int = (int)((519L + ((ak) this).field_e.b((byte) 36)) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if (((ak) this).field_d.b((byte) 36) < (long)(6 + 6 * param4)) {
                          stackOut_5_0 = 0;
                          stackIn_6_0 = stackOut_5_0;
                          stackOut_6_0 = stackIn_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        } else {
                          L2: {
                            ((ak) this).field_d.a((long)(6 * param4), (byte) -122);
                            ((ak) this).field_d.a(0, 6, sf.field_kb, (byte) 0);
                            var7_int = (sf.field_kb[5] & 255) + ((sf.field_kb[4] & 255) << 8) + (sf.field_kb[3] << 16 & 16711680);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (~(((ak) this).field_e.b((byte) 36) / 520L) > ~(long)var7_int) {
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
                          return stackIn_13_0 != 0;
                        }
                      }
                    }
                    L3: {
                      sf.field_kb[4] = (byte)(var7_int >> 8);
                      sf.field_kb[0] = (byte)(param1 >> 16);
                      sf.field_kb[5] = (byte)var7_int;
                      sf.field_kb[1] = (byte)(param1 >> 8);
                      sf.field_kb[3] = (byte)(var7_int >> 16);
                      sf.field_kb[2] = (byte)param1;
                      ((ak) this).field_d.a((long)(param4 * 6), (byte) -122);
                      if (param3) {
                        break L3;
                      } else {
                        var17 = null;
                        boolean discarded$1 = this.a((byte[]) null, -23, true, false, 106);
                        break L3;
                      }
                    }
                    ((ak) this).field_d.a(sf.field_kb, 6, (byte) 110, 0);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (var8 >= param1) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (param2) {
                              L7: {
                                ((ak) this).field_e.a((long)(var7_int * 520), (byte) -122);
                                if (param4 > 65535) {
                                  try {
                                    L8: {
                                      ((ak) this).field_e.a(0, 10, sf.field_kb, (byte) 0);
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
                                    var12 = ((sf.field_kb[4] & 255) << 8) - -(sf.field_kb[5] & 255);
                                    var11 = ((sf.field_kb[2] & 255) << 8) + (((255 & sf.field_kb[1]) << 16) + (((sf.field_kb[0] & 255) << 24) - -(255 & sf.field_kb[3])));
                                    var13 = sf.field_kb[9] & 255;
                                    var10 = ((255 & sf.field_kb[6]) << 16) + ((sf.field_kb[7] & 255) << 8) + (255 & sf.field_kb[8]);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      ((ak) this).field_e.a(0, 8, sf.field_kb, (byte) 0);
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
                                    var11 = (255 & sf.field_kb[1]) + (65280 & sf.field_kb[0] << 8);
                                    var13 = 255 & sf.field_kb[7];
                                    var12 = (sf.field_kb[3] & 255) + (65280 & sf.field_kb[2] << 8);
                                    var10 = (sf.field_kb[6] & 255) + ((sf.field_kb[4] & 255) << 16) + ((sf.field_kb[5] & 255) << 8);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L12: {
                                if (var11 != param4) {
                                  break L12;
                                } else {
                                  if (var12 != var9) {
                                    break L12;
                                  } else {
                                    if (var13 != ((ak) this).field_b) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (var10 < 0) {
                                          break L13;
                                        } else {
                                          if (~(((ak) this).field_e.b((byte) 36) / 520L) > ~(long)var10) {
                                            break L13;
                                          } else {
                                            break L6;
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
                            } else {
                              break L6;
                            }
                          }
                          L14: {
                            if (var10 == 0) {
                              L15: {
                                var10 = (int)((((ak) this).field_e.b((byte) 36) - -519L) / 520L);
                                param2 = false;
                                if (var10 == 0) {
                                  var10++;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              if (var10 == var7_int) {
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
                            if (512 >= param1 + -var8) {
                              var10 = 0;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (param4 <= 65535) {
                              L18: {
                                sf.field_kb[5] = (byte)(var10 >> 8);
                                sf.field_kb[4] = (byte)(var10 >> 16);
                                sf.field_kb[7] = (byte)((ak) this).field_b;
                                sf.field_kb[1] = (byte)param4;
                                sf.field_kb[2] = (byte)(var9 >> 8);
                                sf.field_kb[3] = (byte)var9;
                                sf.field_kb[6] = (byte)var10;
                                sf.field_kb[0] = (byte)(param4 >> 8);
                                ((ak) this).field_e.a((long)(520 * var7_int), (byte) -120);
                                ((ak) this).field_e.a(sf.field_kb, 8, (byte) 76, 0);
                                var11 = -var8 + param1;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((ak) this).field_e.a(param0, var11, (byte) 116, var8);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                sf.field_kb[0] = (byte)(param4 >> 24);
                                sf.field_kb[7] = (byte)(var10 >> 8);
                                sf.field_kb[5] = (byte)var9;
                                sf.field_kb[6] = (byte)(var10 >> 16);
                                sf.field_kb[8] = (byte)var10;
                                sf.field_kb[1] = (byte)(param4 >> 16);
                                sf.field_kb[3] = (byte)param4;
                                sf.field_kb[9] = (byte)((ak) this).field_b;
                                sf.field_kb[2] = (byte)(param4 >> 8);
                                sf.field_kb[4] = (byte)(var9 >> 8);
                                ((ak) this).field_e.a((long)(520 * var7_int), (byte) -128);
                                ((ak) this).field_e.a(sf.field_kb, 10, (byte) 90, 0);
                                var11 = -var8 + param1;
                                if (510 >= var11) {
                                  break L19;
                                } else {
                                  var11 = 510;
                                  break L19;
                                }
                              }
                              ((ak) this).field_e.a(param0, var11, (byte) 118, var8);
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
                stackOut_71_1 = new StringBuilder().append("ak.B(");
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
              throw ch.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static hh a(byte[] param0, int param1) {
        hh var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        Object stackIn_2_0 = null;
        hh stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
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
                  var3 = null;
                  hh discarded$2 = ak.a((byte[]) null, 124);
                  break L1;
                }
              }
              var2 = new hh(param0, gj.field_j, re.field_a, ql.field_b, wk.field_b, rg.field_D, re.field_K);
              wd.d(120);
              stackOut_5_0 = (hh) var2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (hh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("ak.E(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0;
    }

    ak(int param0, we param1, we param2, int param3) {
        ((ak) this).field_e = null;
        ((ak) this).field_f = 65000;
        ((ak) this).field_d = null;
        try {
            ((ak) this).field_e = param1;
            ((ak) this).field_f = param3;
            ((ak) this).field_d = param2;
            ((ak) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ak.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    public final String toString() {
        return "" + ((ak) this).field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Resume Tutorial";
        field_a = 500;
    }
}
