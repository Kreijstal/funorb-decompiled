/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh {
    static int field_e;
    private jf field_b;
    private int field_c;
    private int field_a;
    static String field_g;
    static String field_d;
    private jf field_f;

    public final String toString() {
        return "" + ((vh) this).field_a;
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
            Object var19 = null;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_11_0 = null;
            Object stackIn_12_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            Object stackIn_40_0 = null;
            Object stackIn_41_0 = null;
            byte[] stackIn_53_0 = null;
            byte[] stackIn_54_0 = null;
            Object stackIn_56_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_52_0 = null;
            byte[] stackOut_53_0 = null;
            Object stackOut_39_0 = null;
            Object stackOut_40_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_10_0 = null;
            Object stackOut_11_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_55_0 = null;
            var18 = Bounce.field_N;
            var3 = (Object) (Object) ((vh) this).field_b;
            synchronized (var3) {
              try {
                if ((long)(param1 * 6 + 6) <= ((vh) this).field_f.c(true)) {
                  L0: {
                    ((vh) this).field_f.a((byte) 57, (long)(param1 * 6));
                    ((vh) this).field_f.b(0, fk.field_c, 6, 11842);
                    if (param0 >= 98) {
                      break L0;
                    } else {
                      var19 = null;
                      boolean discarded$1 = ((vh) this).a(117, (byte) -44, 30, (byte[]) null);
                      break L0;
                    }
                  }
                  var4_int = ((255 & fk.field_c[0]) << -1558598256) + ((fk.field_c[1] & 255) << -1772526136) - -(255 & fk.field_c[2]);
                  var5 = ((fk.field_c[4] & 255) << -291780664) + ((fk.field_c[3] << -1125071248 & 16711680) - -(255 & fk.field_c[5]));
                  if (0 <= var4_int) {
                    if (((vh) this).field_c >= var4_int) {
                      if (-1 > (var5 ^ -1)) {
                        if ((long)var5 <= ((vh) this).field_b.c(true) / 520L) {
                          var6 = new byte[var4_int];
                          var7 = 0;
                          var8 = 0;
                          L1: while (true) {
                            if (var7 >= var4_int) {
                              stackOut_52_0 = (byte[]) var6;
                              stackIn_53_0 = stackOut_52_0;
                              stackOut_53_0 = (byte[]) (Object) stackIn_53_0;
                              stackIn_54_0 = stackOut_53_0;
                            } else {
                              if (-1 != (var5 ^ -1)) {
                                L2: {
                                  ((vh) this).field_b.a((byte) 57, (long)(var5 * 520));
                                  var9 = var4_int - var7;
                                  if (-65536 <= param1) {
                                    L3: {
                                      if ((var9 ^ -1) < -513) {
                                        var9 = 512;
                                        break L3;
                                      } else {
                                        break L3;
                                      }
                                    }
                                    var14 = 8;
                                    ((vh) this).field_b.b(0, fk.field_c, var9 + var14, 11842);
                                    var12 = (fk.field_c[5] << -1466837176 & 65280) + (((fk.field_c[4] & 255) << -1392481328) - -(255 & fk.field_c[6]));
                                    var10 = (fk.field_c[1] & 255) + (65280 & fk.field_c[0] << -787322712);
                                    var13 = 255 & fk.field_c[7];
                                    var11 = ((255 & fk.field_c[2]) << -401415640) - -(fk.field_c[3] & 255);
                                    break L2;
                                  } else {
                                    L4: {
                                      if (-511 < var9) {
                                        var9 = 510;
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    var14 = 10;
                                    ((vh) this).field_b.b(0, fk.field_c, var14 + var9, 11842);
                                    var11 = (65280 & fk.field_c[4] << 1306833640) + (fk.field_c[5] & 255);
                                    var12 = (fk.field_c[8] & 255) + ((255 & fk.field_c[6]) << -554008080) - -(fk.field_c[7] << -1324357240 & 65280);
                                    var13 = 255 & fk.field_c[9];
                                    var10 = (65280 & fk.field_c[2] << -1544070200) + ((255 & fk.field_c[1]) << -1559776144) + ((fk.field_c[0] << -1240280328 & -16777216) + (fk.field_c[3] & 255));
                                    break L2;
                                  }
                                }
                                if (var10 == param1) {
                                  if (var8 == var11) {
                                    if (((vh) this).field_a == var13) {
                                      if ((var12 ^ -1) <= -1) {
                                        if ((((vh) this).field_b.c(true) / 520L ^ -1L) <= ((long)var12 ^ -1L)) {
                                          var15 = var9 + var14;
                                          var16 = var14;
                                          L5: while (true) {
                                            if (var16 >= var15) {
                                              var8++;
                                              var5 = var12;
                                              continue L1;
                                            } else {
                                              var7++;
                                              var6[var7] = fk.field_c[var16];
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
                                      stackOut_39_0 = null;
                                      stackIn_40_0 = stackOut_39_0;
                                      stackOut_40_0 = stackIn_40_0;
                                      stackIn_41_0 = stackOut_40_0;
                                      return (byte[]) (Object) stackIn_41_0;
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

    final boolean a(int param0, byte param1, int param2, byte[] param3) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
        int stackIn_9_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        var5 = (Object) (Object) ((vh) this).field_b;
        synchronized (var5) {
          L0: {
            if (-1 < (param0 ^ -1)) {
              break L0;
            } else {
              if (param0 > ((vh) this).field_c) {
                break L0;
              } else {
                L1: {
                  var6 = this.a(0, param3, param0, true, param2) ? 1 : 0;
                  if (var6 == 0) {
                    var6 = this.a(0, param3, param0, false, param2) ? 1 : 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = -102 % ((param1 - 59) / 45);
                stackOut_8_0 = var6;
                stackIn_9_0 = stackOut_8_0;
              }
            }
          }
          throw new IllegalArgumentException();
        }
        return stackIn_9_0 != 0;
    }

    final static int a(boolean param0, String param1, boolean param2) {
        if (!param2) {
            field_e = -88;
        }
        if (!param0) {
            return ba.field_E.b(param1);
        }
        return jc.field_h.b(param1);
    }

    private final boolean a(int param0, byte[] param1, int param2, boolean param3, int param4) {
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
            int stackIn_8_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_65_0 = 0;
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
            int stackOut_61_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_64_0 = 0;
            var16 = Bounce.field_N;
            var6 = (Object) (Object) ((vh) this).field_b;
            synchronized (var6) {
              try {
                L0: {
                  if (param3) {
                    if (((long)(param4 * 6 - -6) ^ -1L) < (((vh) this).field_f.c(true) ^ -1L)) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackOut_8_0 = stackIn_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0 != 0;
                    } else {
                      L1: {
                        ((vh) this).field_f.a((byte) 57, (long)(6 * param4));
                        ((vh) this).field_f.b(0, fk.field_c, 6, param0 + 11842);
                        var7_int = (16711680 & fk.field_c[3] << -721507824) + ((65280 & fk.field_c[4] << -1728401304) - -(255 & fk.field_c[5]));
                        if ((var7_int ^ -1) >= -1) {
                          break L1;
                        } else {
                          if ((((vh) this).field_b.c(true) / 520L ^ -1L) > ((long)var7_int ^ -1L)) {
                            break L1;
                          } else {
                            break L0;
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
                    var7_int = (int)((((vh) this).field_b.c(true) - -519L) / 520L);
                    if (-1 == (var7_int ^ -1)) {
                      var7_int = 1;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
                fk.field_c[3] = (byte)(var7_int >> -1420075280);
                fk.field_c[2] = (byte)param2;
                fk.field_c[4] = (byte)(var7_int >> -1529530360);
                fk.field_c[1] = (byte)(param2 >> 1057146248);
                fk.field_c[0] = (byte)(param2 >> 544496336);
                fk.field_c[5] = (byte)var7_int;
                ((vh) this).field_f.a((byte) 57, (long)(param4 * 6));
                ((vh) this).field_f.a(0, fk.field_c, 6, 0);
                var8 = 0;
                var9 = param0;
                L2: while (true) {
                  L3: {
                    if (var8 >= param2) {
                      break L3;
                    } else {
                      L4: {
                        var10 = 0;
                        if (param3) {
                          L5: {
                            ((vh) this).field_b.a((byte) 57, (long)(var7_int * 520));
                            if (-65536 > (param4 ^ -1)) {
                              try {
                                ((vh) this).field_b.b(0, fk.field_c, 10, 11842);
                                decompiledRegionSelector1 = 0;
                              } catch (java.lang.Exception decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                var14 = (EOFException) (Object) decompiledCaughtException;
                                decompiledRegionSelector1 = 1;
                              }
                              if (decompiledRegionSelector1 == 0) {
                                var13 = 255 & fk.field_c[9];
                                var12 = (fk.field_c[5] & 255) + ((fk.field_c[4] & 255) << -1330136504);
                                var11 = ((fk.field_c[2] & 255) << -1318467960) + (-16777216 & fk.field_c[0] << -1576976840) + (((255 & fk.field_c[1]) << -2091828912) + (255 & fk.field_c[3]));
                                var10 = ((255 & fk.field_c[6]) << 2040134224) + (65280 & fk.field_c[7] << -1847627832) + (255 & fk.field_c[8]);
                                break L5;
                              } else {
                                break L3;
                              }
                            } else {
                              try {
                                ((vh) this).field_b.b(0, fk.field_c, 8, 11842);
                                decompiledRegionSelector0 = 0;
                              } catch (java.lang.Exception decompiledCaughtParameter1) {
                                decompiledCaughtException = decompiledCaughtParameter1;
                                var14 = (EOFException) (Object) decompiledCaughtException;
                                decompiledRegionSelector0 = 1;
                              }
                              if (decompiledRegionSelector0 == 0) {
                                var10 = (fk.field_c[5] << -159274072 & 65280) + (fk.field_c[4] << 1553151088 & 16711680) - -(255 & fk.field_c[6]);
                                var12 = ((fk.field_c[2] & 255) << 781872392) + (fk.field_c[3] & 255);
                                var11 = (65280 & fk.field_c[0] << 615847432) - -(255 & fk.field_c[1]);
                                var13 = 255 & fk.field_c[7];
                                break L5;
                              } else {
                                break L3;
                              }
                            }
                          }
                          L6: {
                            if (var11 != param4) {
                              break L6;
                            } else {
                              if (var9 != var12) {
                                break L6;
                              } else {
                                if (var13 != ((vh) this).field_a) {
                                  break L6;
                                } else {
                                  L7: {
                                    if ((var10 ^ -1) > -1) {
                                      break L7;
                                    } else {
                                      if ((((vh) this).field_b.c(true) / 520L ^ -1L) > ((long)var10 ^ -1L)) {
                                        break L7;
                                      } else {
                                        break L4;
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
                          break L4;
                        }
                      }
                      L8: {
                        if (var10 != 0) {
                          break L8;
                        } else {
                          L9: {
                            param3 = false;
                            var10 = (int)((((vh) this).field_b.c(true) + 519L) / 520L);
                            if (0 == var10) {
                              var10++;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          if (var7_int == var10) {
                            var10++;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L10: {
                        if (-513 > (-var8 + param2 ^ -1)) {
                          break L10;
                        } else {
                          var10 = 0;
                          break L10;
                        }
                      }
                      L11: {
                        if ((param4 ^ -1) < -65536) {
                          L12: {
                            fk.field_c[4] = (byte)(var9 >> 1147273320);
                            fk.field_c[7] = (byte)(var10 >> 239904488);
                            fk.field_c[3] = (byte)param4;
                            fk.field_c[9] = (byte)((vh) this).field_a;
                            fk.field_c[0] = (byte)(param4 >> 506143544);
                            fk.field_c[1] = (byte)(param4 >> -812851312);
                            fk.field_c[2] = (byte)(param4 >> 868919656);
                            fk.field_c[8] = (byte)var10;
                            fk.field_c[6] = (byte)(var10 >> 139779664);
                            fk.field_c[5] = (byte)var9;
                            ((vh) this).field_b.a((byte) 57, (long)(520 * var7_int));
                            ((vh) this).field_b.a(param0 ^ 0, fk.field_c, 10, 0);
                            var11 = param2 + -var8;
                            if (-511 > (var11 ^ -1)) {
                              var11 = 510;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          ((vh) this).field_b.a(0, param1, var11, var8);
                          var8 = var8 + var11;
                          break L11;
                        } else {
                          L13: {
                            fk.field_c[7] = (byte)((vh) this).field_a;
                            fk.field_c[0] = (byte)(param4 >> 1226278088);
                            fk.field_c[4] = (byte)(var10 >> 656155248);
                            fk.field_c[1] = (byte)param4;
                            fk.field_c[2] = (byte)(var9 >> -730719576);
                            fk.field_c[3] = (byte)var9;
                            fk.field_c[5] = (byte)(var10 >> -727652088);
                            fk.field_c[6] = (byte)var10;
                            ((vh) this).field_b.a((byte) 57, (long)(var7_int * 520));
                            ((vh) this).field_b.a(param0 ^ 0, fk.field_c, 8, 0);
                            var11 = param2 + -var8;
                            if ((var11 ^ -1) < -513) {
                              var11 = 512;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          ((vh) this).field_b.a(0, param1, var11, var8);
                          var8 = var8 + var11;
                          break L11;
                        }
                      }
                      var9++;
                      var7_int = var10;
                      continue L2;
                    }
                  }
                  stackOut_61_0 = 1;
                  stackIn_62_0 = stackOut_61_0;
                  stackOut_62_0 = stackIn_62_0;
                  stackIn_63_0 = stackOut_62_0;
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

    public static void b(int param0) {
        if (param0 != 11826) {
            field_e = -24;
        }
        field_d = null;
        field_g = null;
    }

    final static tg[] a(gk param0, String param1, byte param2, String param3) {
        int var6 = 122 % ((param2 - 59) / 46);
        int var4 = param0.a(param1, false);
        int var5 = param0.a(var4, param3, 95);
        return kf.a(var4, var5, param0, false);
    }

    final static void a(int param0) {
        if (param0 != 32459) {
            boolean discarded$0 = vh.a(-44, (byte) -81);
        }
    }

    final static boolean a(int param0, byte param1) {
        if (param1 != 88) {
            field_e = 93;
        }
        if (0 == (param0 ^ -1)) {
            return true;
        }
        return (1 << param0 & ck.field_a) != 0 ? true : false;
    }

    vh(int param0, jf param1, jf param2, int param3) {
        ((vh) this).field_b = null;
        ((vh) this).field_c = 65000;
        ((vh) this).field_f = null;
        ((vh) this).field_a = param0;
        ((vh) this).field_f = param2;
        ((vh) this).field_c = param3;
        ((vh) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_d = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
