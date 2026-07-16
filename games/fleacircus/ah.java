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
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
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
    }

    private final boolean a(byte param0, byte[] param1, int param2, int param3, boolean param4) {
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
            int stackIn_4_0 = 0;
            int stackIn_5_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_63_0 = 0;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_62_0 = 0;
            var16 = fleas.field_A ? 1 : 0;
            var6 = (Object) (Object) ((ah) this).field_f;
            synchronized (var6) {
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
                      if ((((ah) this).field_e.c((byte) -123) ^ -1L) <= ((long)(6 + param3 * 6) ^ -1L)) {
                        L2: {
                          ((ah) this).field_e.a(-116, (long)(param3 * 6));
                          ((ah) this).field_e.a(nf.field_G, 0, 6, 6520);
                          var7_int = (nf.field_G[5] & 255) + ((16711680 & nf.field_G[3] << -1991428912) + ((255 & nf.field_G[4]) << -672335256));
                          if ((var7_int ^ -1) >= -1) {
                            break L2;
                          } else {
                            if (((ah) this).field_f.c((byte) -83) / 520L < (long)var7_int) {
                              break L2;
                            } else {
                              break L1;
                            }
                          }
                        }
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        stackOut_10_0 = stackIn_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      } else {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        stackOut_4_0 = stackIn_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        return stackIn_5_0 != 0;
                      }
                    }
                  }
                  L3: {
                    nf.field_G[0] = (byte)(param2 >> 1634713456);
                    nf.field_G[2] = (byte)param2;
                    nf.field_G[3] = (byte)(var7_int >> -1536108208);
                    nf.field_G[5] = (byte)var7_int;
                    nf.field_G[1] = (byte)(param2 >> -1298468600);
                    nf.field_G[4] = (byte)(var7_int >> 440007432);
                    ((ah) this).field_e.a(param0 ^ -81, (long)(6 * param3));
                    if (param0 == 37) {
                      break L3;
                    } else {
                      ah.a(103);
                      break L3;
                    }
                  }
                  ((ah) this).field_e.a(0, nf.field_G, 6, (byte) 114);
                  var8 = 0;
                  var9 = 0;
                  L4: while (true) {
                    L5: {
                      if (param2 <= var8) {
                        break L5;
                      } else {
                        L6: {
                          var10 = 0;
                          if (param4) {
                            L7: {
                              ((ah) this).field_f.a(-124, (long)(var7_int * 520));
                              if (-65536 <= (param3 ^ -1)) {
                                try {
                                  L8: {
                                    ((ah) this).field_f.a(nf.field_G, 0, 8, 6520);
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
                                  var11 = (nf.field_G[0] << -307250616 & 65280) - -(255 & nf.field_G[1]);
                                  var13 = nf.field_G[7] & 255;
                                  var12 = (65280 & nf.field_G[2] << -667106104) - -(nf.field_G[3] & 255);
                                  var10 = (65280 & nf.field_G[5] << 390184104) + (((255 & nf.field_G[4]) << 310161104) + (nf.field_G[6] & 255));
                                  break L7;
                                } else {
                                  break L5;
                                }
                              } else {
                                try {
                                  L10: {
                                    ((ah) this).field_f.a(nf.field_G, 0, 10, 6520);
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
                                  var10 = (65280 & nf.field_G[7] << -1402330968) + ((nf.field_G[6] & 255) << -1763458992) + (nf.field_G[8] & 255);
                                  var11 = (255 & nf.field_G[3]) + (nf.field_G[2] << 1900449864 & 65280) + (((255 & nf.field_G[1]) << -1481339888) + ((255 & nf.field_G[0]) << -305278632));
                                  var12 = ((255 & nf.field_G[4]) << -1288486424) - -(255 & nf.field_G[5]);
                                  var13 = nf.field_G[9] & 255;
                                  break L7;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L12: {
                              if (var11 != param3) {
                                break L12;
                              } else {
                                if (var12 != var9) {
                                  break L12;
                                } else {
                                  if (((ah) this).field_d == var13) {
                                    L13: {
                                      if ((var10 ^ -1) > -1) {
                                        break L13;
                                      } else {
                                        if (((ah) this).field_f.c((byte) -76) / 520L < (long)var10) {
                                          break L13;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    stackOut_39_0 = 0;
                                    stackIn_40_0 = stackOut_39_0;
                                    stackOut_40_0 = stackIn_40_0;
                                    stackIn_41_0 = stackOut_40_0;
                                    return stackIn_41_0 != 0;
                                  } else {
                                    break L12;
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
                            break L6;
                          }
                        }
                        L14: {
                          if (0 != var10) {
                            break L14;
                          } else {
                            L15: {
                              param4 = false;
                              var10 = (int)((519L + ((ah) this).field_f.c((byte) -48)) / 520L);
                              if (0 == var10) {
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
                          }
                        }
                        L16: {
                          if (-513 > param2 + -var8) {
                            break L16;
                          } else {
                            var10 = 0;
                            break L16;
                          }
                        }
                        L17: {
                          if (-65536 >= param3) {
                            L18: {
                              nf.field_G[4] = (byte)(var10 >> 1366220400);
                              nf.field_G[7] = (byte)((ah) this).field_d;
                              nf.field_G[0] = (byte)(param3 >> 382906856);
                              nf.field_G[5] = (byte)(var10 >> 385167112);
                              nf.field_G[3] = (byte)var9;
                              nf.field_G[2] = (byte)(var9 >> -904389912);
                              nf.field_G[6] = (byte)var10;
                              nf.field_G[1] = (byte)param3;
                              ((ah) this).field_f.a(-111, (long)(var7_int * 520));
                              ((ah) this).field_f.a(0, nf.field_G, 8, (byte) 92);
                              var11 = -var8 + param2;
                              if (var11 <= 512) {
                                break L18;
                              } else {
                                var11 = 512;
                                break L18;
                              }
                            }
                            ((ah) this).field_f.a(var8, param1, var11, (byte) -30);
                            var8 = var8 + var11;
                            break L17;
                          } else {
                            L19: {
                              nf.field_G[3] = (byte)param3;
                              nf.field_G[8] = (byte)var10;
                              nf.field_G[6] = (byte)(var10 >> 1717980144);
                              nf.field_G[0] = (byte)(param3 >> -1758518504);
                              nf.field_G[4] = (byte)(var9 >> -409607000);
                              nf.field_G[7] = (byte)(var10 >> 623552520);
                              nf.field_G[2] = (byte)(param3 >> 1878880328);
                              nf.field_G[9] = (byte)((ah) this).field_d;
                              nf.field_G[1] = (byte)(param3 >> -632159568);
                              nf.field_G[5] = (byte)var9;
                              ((ah) this).field_f.a(-104, (long)(520 * var7_int));
                              ((ah) this).field_f.a(0, nf.field_G, 10, (byte) 76);
                              var11 = param2 - var8;
                              if (var11 <= 510) {
                                break L19;
                              } else {
                                var11 = 510;
                                break L19;
                              }
                            }
                            ((ah) this).field_f.a(var8, param1, var11, (byte) -59);
                            var8 = var8 + var11;
                            break L17;
                          }
                        }
                        var9++;
                        var7_int = var10;
                        continue L4;
                      }
                    }
                    stackOut_59_0 = 1;
                    stackIn_60_0 = stackOut_59_0;
                    stackOut_60_0 = stackIn_60_0;
                    stackIn_61_0 = stackOut_60_0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                stackOut_62_0 = 0;
                stackIn_63_0 = stackOut_62_0;
                return stackIn_63_0 != 0;
              }
              return stackIn_61_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
            ah.a(18);
        }
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
                    var4_int = ((nf.field_G[0] & 255) << 535287472) + ((nf.field_G[1] << -876367736 & 65280) + (255 & nf.field_G[2]));
                    var5 = (65280 & nf.field_G[4] << -2096846200) + ((16711680 & nf.field_G[3] << 1331838288) - -(nf.field_G[5] & 255));
                    if ((var4_int ^ -1) <= -1) {
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
                                        if (-513 <= (var9 ^ -1)) {
                                          break L3;
                                        } else {
                                          var9 = 512;
                                          break L3;
                                        }
                                      }
                                      ((ah) this).field_f.a(nf.field_G, 0, var14 + var9, 6520);
                                      var12 = (nf.field_G[6] & 255) + (((255 & nf.field_G[5]) << -1340155288) + ((255 & nf.field_G[4]) << 193044976));
                                      var10 = ((255 & nf.field_G[0]) << 1142077704) - -(255 & nf.field_G[1]);
                                      var11 = (65280 & nf.field_G[2] << -1178278136) + (255 & nf.field_G[3]);
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
                                      var10 = ((255 & nf.field_G[0]) << 1234177400) - -(16711680 & nf.field_G[1] << 288839536) - -(65280 & nf.field_G[2] << -1544675288) - -(nf.field_G[3] & 255);
                                      var11 = (nf.field_G[4] << -815187416 & 65280) + (255 & nf.field_G[5]);
                                      var13 = nf.field_G[9] & 255;
                                      var12 = (65280 & nf.field_G[7] << 339341960) + (16711680 & nf.field_G[6] << 1326112048) - -(nf.field_G[8] & 255);
                                      break L2;
                                    }
                                  }
                                  if (var10 == param1) {
                                    if (var8 == var11) {
                                      if (((ah) this).field_d == var13) {
                                        if ((var12 ^ -1) <= -1) {
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

    final static void a(int param0) {
        int var2 = 0;
        L0: {
          var2 = fleas.field_A ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            field_c = true;
            break L0;
          }
        }
        if (!vf.c((byte) -5)) {
          L1: {
            if (null == rh.field_p) {
              break L1;
            } else {
              if (!rh.field_p.field_c) {
                break L1;
              } else {
                lh.a(false);
                mg.field_a.b((qa) (Object) new ic(mg.field_a, fb.field_g), (byte) -35);
                break L1;
              }
            }
          }
          return;
        } else {
          boolean discarded$14 = mg.field_a.a(hm.field_d, param0 + 41, true, bk.field_b);
          mg.field_a.d(true);
          L2: while (true) {
            if (!wf.b(-113)) {
              return;
            } else {
              boolean discarded$15 = mg.field_a.a(id.field_b, (byte) -105, ji.field_a);
              continue L2;
            }
          }
        }
    }

    ah(int param0, k param1, k param2, int param3) {
        ((ah) this).field_b = 65000;
        ((ah) this).field_f = null;
        ((ah) this).field_e = null;
        ((ah) this).field_b = param3;
        ((ah) this).field_e = param2;
        ((ah) this).field_f = param1;
        ((ah) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_g = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
