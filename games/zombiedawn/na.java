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
            int stackIn_3_0 = 0;
            int stackIn_4_0 = 0;
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
            int stackOut_2_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_64_0 = 0;
            var16 = ZombieDawn.field_J;
            var6 = (Object) (Object) ((na) this).field_a;
            synchronized (var6) {
              try {
                L0: {
                  if (param3 == 109242696) {
                    L1: {
                      if (!param1) {
                        var7_int = (int)((((na) this).field_a.a(param3 + -109242697) - -519L) / 520L);
                        if ((var7_int ^ -1) == -1) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if ((((na) this).field_b.a(param3 + -109242697) ^ -1L) <= ((long)(6 + 6 * param0) ^ -1L)) {
                          L2: {
                            ((na) this).field_b.a(param3 ^ 109242696, (long)(param0 * 6));
                            ((na) this).field_b.a(6, false, 0, cg.field_c);
                            var7_int = (255 & cg.field_c[5]) + ((cg.field_c[3] & 255) << -1186478480) - -((cg.field_c[4] & 255) << -1524056920);
                            if ((var7_int ^ -1) >= -1) {
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
                    cg.field_c[0] = (byte)(param4 >> 473834032);
                    cg.field_c[4] = (byte)(var7_int >> -1180206680);
                    cg.field_c[2] = (byte)param4;
                    cg.field_c[5] = (byte)var7_int;
                    cg.field_c[1] = (byte)(param4 >> -693934296);
                    cg.field_c[3] = (byte)(var7_int >> -1004374128);
                    ((na) this).field_b.a(0, (long)(param0 * 6));
                    ((na) this).field_b.a(param3 ^ 109242722, cg.field_c, 0, 6);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if ((var8 ^ -1) <= (param4 ^ -1)) {
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
                                    var12 = (65280 & cg.field_c[2] << -1916681816) - -(255 & cg.field_c[3]);
                                    var13 = 255 & cg.field_c[7];
                                    var11 = ((cg.field_c[0] & 255) << -586719704) + (255 & cg.field_c[1]);
                                    var10 = (65280 & cg.field_c[5] << -1963133688) + (16711680 & cg.field_c[4] << 962494832) - -(255 & cg.field_c[6]);
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
                                    var12 = (cg.field_c[5] & 255) + (cg.field_c[4] << 1686103528 & 65280);
                                    var11 = (65280 & cg.field_c[2] << -1716418520) + ((cg.field_c[1] & 255) << 1115085072) + (((cg.field_c[0] & 255) << -2064135400) + (cg.field_c[3] & 255));
                                    var10 = (16711680 & cg.field_c[6] << 885490192) + (((cg.field_c[7] & 255) << 109242696) + (cg.field_c[8] & 255));
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if ((param0 ^ -1) != (var11 ^ -1)) {
                                  break L11;
                                } else {
                                  if (var9 != var12) {
                                    break L11;
                                  } else {
                                    if ((var13 ^ -1) != (((na) this).field_d ^ -1)) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if ((var10 ^ -1) > -1) {
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
                                if ((var10 ^ -1) != -1) {
                                  break L14;
                                } else {
                                  var10++;
                                  break L14;
                                }
                              }
                              if ((var10 ^ -1) != (var7_int ^ -1)) {
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
                            if (-513 > (-var8 + param4 ^ -1)) {
                              break L15;
                            } else {
                              var10 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (param0 > 65535) {
                              L17: {
                                cg.field_c[1] = (byte)(param0 >> 569467504);
                                cg.field_c[4] = (byte)(var9 >> 1180951144);
                                cg.field_c[3] = (byte)param0;
                                cg.field_c[5] = (byte)var9;
                                cg.field_c[9] = (byte)((na) this).field_d;
                                cg.field_c[7] = (byte)(var10 >> -236673016);
                                cg.field_c[8] = (byte)var10;
                                cg.field_c[0] = (byte)(param0 >> -459837512);
                                cg.field_c[6] = (byte)(var10 >> 2092060144);
                                cg.field_c[2] = (byte)(param0 >> -1208190904);
                                ((na) this).field_a.a(0, (long)(var7_int * 520));
                                ((na) this).field_a.a(param3 + -109242651, cg.field_c, 0, 10);
                                var11 = -var8 + param4;
                                if (-511 <= (var11 ^ -1)) {
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
                                cg.field_c[2] = (byte)(var9 >> -1340065336);
                                cg.field_c[0] = (byte)(param0 >> -1372580344);
                                cg.field_c[4] = (byte)(var10 >> -1165920880);
                                cg.field_c[3] = (byte)var9;
                                cg.field_c[6] = (byte)var10;
                                cg.field_c[1] = (byte)param0;
                                cg.field_c[5] = (byte)(var10 >> -1151931544);
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
                  } else {
                    stackOut_2_0 = 1;
                    stackIn_3_0 = stackOut_2_0;
                    stackOut_3_0 = stackIn_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    return stackIn_4_0 != 0;
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
                    var4_int = ((255 & cg.field_c[0]) << -538363920) + (cg.field_c[1] << 738715816 & 65280) - -(cg.field_c[2] & 255);
                    var5 = (cg.field_c[3] << 19771440 & 16711680) - (-(cg.field_c[4] << 993545320 & 65280) + -(cg.field_c[5] & 255));
                    if ((var4_int ^ -1) <= -1) {
                      if ((var4_int ^ -1) >= (((na) this).field_e ^ -1)) {
                        if (-1 > (var5 ^ -1)) {
                          if ((((na) this).field_a.a(-1) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
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
                                    if ((param1 ^ -1) < -65536) {
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
                                      var10 = ((255 & cg.field_c[1]) << -1156344400) + ((cg.field_c[0] & 255) << -1553806952) + ((65280 & cg.field_c[2] << -1945819320) - -(cg.field_c[3] & 255));
                                      var11 = ((cg.field_c[4] & 255) << 1943650632) - -(cg.field_c[5] & 255);
                                      var13 = 255 & cg.field_c[9];
                                      var12 = (255 & cg.field_c[8]) + ((cg.field_c[6] & 255) << 383433872) + ((cg.field_c[7] & 255) << 830283080);
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
                                      var12 = (cg.field_c[6] & 255) + (((cg.field_c[4] & 255) << -591774416) + (cg.field_c[5] << -1391511352 & 65280));
                                      var11 = ((cg.field_c[2] & 255) << 1045724072) + (cg.field_c[3] & 255);
                                      var13 = 255 & cg.field_c[7];
                                      var10 = (cg.field_c[0] << 1188531880 & 65280) + (255 & cg.field_c[1]);
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
                                              if ((var16 ^ -1) <= (var15 ^ -1)) {
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

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 79) {
            boolean discarded$0 = na.a(113, '}');
        }
    }

    final boolean a(int param0, byte[] param1, int param2, byte param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        var5 = (Object) (Object) ((na) this).field_a;
        synchronized (var5) {
          L0: {
            L1: {
              if ((param2 ^ -1) > -1) {
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
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          L1: {
            var5 = ZombieDawn.field_J;
            if (param1 <= param0) {
              break L1;
            } else {
              if (param1 < 128) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (param1 < 160) {
              if (param1 == 0) {
                break L2;
              } else {
                var6 = fj.field_h;
                var2 = var6;
                var3 = 0;
                L3: while (true) {
                  if (var6.length <= var3) {
                    break L2;
                  } else {
                    var4 = var6[var3];
                    if (param1 == var4) {
                      return true;
                    } else {
                      var3++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              if (param1 <= 255) {
                break L0;
              } else {
                if (param1 == 0) {
                  break L2;
                } else {
                  var6 = fj.field_h;
                  var2 = var6;
                  var3 = 0;
                  L4: while (true) {
                    if (var6.length <= var3) {
                      break L2;
                    } else {
                      var4 = var6[var3];
                      if (param1 == var4) {
                        return true;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
          return false;
        }
        return true;
    }

    na(int param0, sf param1, sf param2, int param3) {
        ((na) this).field_e = 65000;
        ((na) this).field_b = null;
        ((na) this).field_a = null;
        ((na) this).field_b = param2;
        ((na) this).field_a = param1;
        ((na) this).field_d = param0;
        ((na) this).field_e = param3;
    }

    static {
    }
}
