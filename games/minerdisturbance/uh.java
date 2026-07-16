/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uh {
    private me field_d;
    static boolean field_e;
    static String field_f;
    private me field_b;
    private int field_g;
    static String field_c;
    private int field_a;

    final boolean a(int param0, byte[] param1, byte param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        if (param2 >= 60) {
          var5 = (Object) (Object) ((uh) this).field_b;
          synchronized (var5) {
            L0: {
              L1: {
                if (0 > param0) {
                  break L1;
                } else {
                  if (param0 > ((uh) this).field_g) {
                    break L1;
                  } else {
                    L2: {
                      var6 = this.a(param0, true, param3, (byte) -55, param1) ? 1 : 0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        var6 = this.a(param0, false, param3, (byte) -50, param1) ? 1 : 0;
                        break L2;
                      }
                    }
                    stackOut_9_0 = var6;
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_10_0 != 0;
        } else {
          return true;
        }
    }

    public final String toString() {
        return "" + ((uh) this).field_a;
    }

    private final boolean a(int param0, boolean param1, int param2, byte param3, byte[] param4) {
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
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_64_0 = 0;
            var16 = MinerDisturbance.field_ab;
            var6 = (Object) (Object) ((uh) this).field_b;
            synchronized (var6) {
              try {
                L0: {
                  L1: {
                    if (param1) {
                      if ((long)(6 * param2 + 6) <= ((uh) this).field_d.a((byte) -109)) {
                        L2: {
                          ((uh) this).field_d.a((byte) 120, (long)(6 * param2));
                          ((uh) this).field_d.a(ri.field_c, 0, 6, -1);
                          var7_int = (255 & ri.field_c[5]) + (((255 & ri.field_c[4]) << 589281864) + (ri.field_c[3] << 2087732144 & 16711680));
                          if ((var7_int ^ -1) >= -1) {
                            break L2;
                          } else {
                            if (((long)var7_int ^ -1L) < (((uh) this).field_b.a((byte) -96) / 520L ^ -1L)) {
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
                      } else {
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        stackOut_6_0 = stackIn_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0 != 0;
                      }
                    } else {
                      var7_int = (int)((((uh) this).field_b.a((byte) -47) - -519L) / 520L);
                      if (-1 != (var7_int ^ -1)) {
                        break L1;
                      } else {
                        var7_int = 1;
                        break L1;
                      }
                    }
                  }
                  L3: {
                    ri.field_c[2] = (byte)param0;
                    ri.field_c[4] = (byte)(var7_int >> -470509400);
                    ri.field_c[3] = (byte)(var7_int >> 1019100304);
                    ri.field_c[5] = (byte)var7_int;
                    ri.field_c[1] = (byte)(param0 >> -56250136);
                    ri.field_c[0] = (byte)(param0 >> 88346800);
                    ((uh) this).field_d.a((byte) 116, (long)(6 * param2));
                    ((uh) this).field_d.a(ri.field_c, 6, 0, true);
                    var8 = 0;
                    if (param3 < -35) {
                      break L3;
                    } else {
                      uh.a((byte) -43);
                      break L3;
                    }
                  }
                  var9 = 0;
                  L4: while (true) {
                    L5: {
                      if (var8 >= param0) {
                        break L5;
                      } else {
                        L6: {
                          var10 = 0;
                          if (param1) {
                            L7: {
                              ((uh) this).field_b.a((byte) 125, (long)(520 * var7_int));
                              if (65535 >= param2) {
                                try {
                                  L8: {
                                    ((uh) this).field_b.a(ri.field_c, 0, 8, -1);
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
                                  var13 = ri.field_c[7] & 255;
                                  var12 = (65280 & ri.field_c[2] << 804952008) - -(255 & ri.field_c[3]);
                                  var10 = (ri.field_c[4] << -484361840 & 16711680) - (-((255 & ri.field_c[5]) << 225831624) - (ri.field_c[6] & 255));
                                  var11 = (ri.field_c[1] & 255) + ((ri.field_c[0] & 255) << -1210319416);
                                  break L7;
                                } else {
                                  break L5;
                                }
                              } else {
                                try {
                                  L10: {
                                    ((uh) this).field_b.a(ri.field_c, 0, 10, -1);
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
                                  var11 = (ri.field_c[3] & 255) + ((ri.field_c[0] & 255) << -1532952328) + ((ri.field_c[1] << -575784368 & 16711680) - -((255 & ri.field_c[2]) << 1276963752));
                                  var12 = ((ri.field_c[4] & 255) << -757062168) - -(255 & ri.field_c[5]);
                                  var10 = (ri.field_c[8] & 255) + (ri.field_c[6] << -57173712 & 16711680) + ((255 & ri.field_c[7]) << -1207053464);
                                  var13 = 255 & ri.field_c[9];
                                  break L7;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L12: {
                              if (param2 != var11) {
                                break L12;
                              } else {
                                if (var12 != var9) {
                                  break L12;
                                } else {
                                  if (((uh) this).field_a == var13) {
                                    L13: {
                                      if (-1 < (var10 ^ -1)) {
                                        break L13;
                                      } else {
                                        if (((uh) this).field_b.a((byte) -70) / 520L < (long)var10) {
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
                          if (var10 == 0) {
                            L15: {
                              param1 = false;
                              var10 = (int)((((uh) this).field_b.a((byte) -74) + 519L) / 520L);
                              if (var10 != 0) {
                                break L15;
                              } else {
                                var10++;
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
                          if (param0 + -var8 > 512) {
                            break L16;
                          } else {
                            var10 = 0;
                            break L16;
                          }
                        }
                        L17: {
                          if (-65536 <= (param2 ^ -1)) {
                            L18: {
                              ri.field_c[0] = (byte)(param2 >> -1028135992);
                              ri.field_c[4] = (byte)(var10 >> -1991649456);
                              ri.field_c[1] = (byte)param2;
                              ri.field_c[5] = (byte)(var10 >> -773612888);
                              ri.field_c[6] = (byte)var10;
                              ri.field_c[7] = (byte)((uh) this).field_a;
                              ri.field_c[3] = (byte)var9;
                              ri.field_c[2] = (byte)(var9 >> -792853272);
                              ((uh) this).field_b.a((byte) 111, (long)(var7_int * 520));
                              ((uh) this).field_b.a(ri.field_c, 8, 0, true);
                              var11 = -var8 + param0;
                              if ((var11 ^ -1) < -513) {
                                var11 = 512;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            ((uh) this).field_b.a(param4, var11, var8, true);
                            var8 = var8 + var11;
                            break L17;
                          } else {
                            L19: {
                              ri.field_c[8] = (byte)var10;
                              ri.field_c[4] = (byte)(var9 >> -1903756248);
                              ri.field_c[0] = (byte)(param2 >> 760167544);
                              ri.field_c[3] = (byte)param2;
                              ri.field_c[7] = (byte)(var10 >> -13288248);
                              ri.field_c[9] = (byte)((uh) this).field_a;
                              ri.field_c[5] = (byte)var9;
                              ri.field_c[6] = (byte)(var10 >> -468789840);
                              ri.field_c[1] = (byte)(param2 >> 1389065072);
                              ri.field_c[2] = (byte)(param2 >> 8838856);
                              ((uh) this).field_b.a((byte) 123, (long)(520 * var7_int));
                              ((uh) this).field_b.a(ri.field_c, 10, 0, true);
                              var11 = -var8 + param0;
                              if (-511 > (var11 ^ -1)) {
                                var11 = 510;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            ((uh) this).field_b.a(param4, var11, var8, true);
                            var8 = var8 + var11;
                            break L17;
                          }
                        }
                        var7_int = var10;
                        var9++;
                        continue L4;
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
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_42_0 = null;
            Object stackIn_43_0 = null;
            byte[] stackIn_48_0 = null;
            byte[] stackIn_49_0 = null;
            Object stackIn_51_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_47_0 = null;
            byte[] stackOut_48_0 = null;
            Object stackOut_41_0 = null;
            Object stackOut_42_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_50_0 = null;
            var18 = MinerDisturbance.field_ab;
            var3 = (Object) (Object) ((uh) this).field_b;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 + 6 * param1) <= ((uh) this).field_d.a((byte) -72)) {
                    ((uh) this).field_d.a((byte) 126, (long)(6 * param1));
                    ((uh) this).field_d.a(ri.field_c, 0, 6, -1);
                    var4_int = (param0 & ri.field_c[2]) + ((ri.field_c[1] & 255) << -652776344) + ((ri.field_c[0] & 255) << -2021027248);
                    var5 = (65280 & ri.field_c[4] << -1343135096) + (((255 & ri.field_c[3]) << 1356772016) + (ri.field_c[5] & 255));
                    if (-1 >= (var4_int ^ -1)) {
                      if (((uh) this).field_g >= var4_int) {
                        if (var5 > 0) {
                          if ((((uh) this).field_b.a((byte) -95) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var4_int <= var7) {
                                stackOut_47_0 = (byte[]) var6;
                                stackIn_48_0 = stackOut_47_0;
                                stackOut_48_0 = (byte[]) (Object) stackIn_48_0;
                                stackIn_49_0 = stackOut_48_0;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L2: {
                                    ((uh) this).field_b.a((byte) 121, (long)(var5 * 520));
                                    var9 = var4_int - var7;
                                    if ((param1 ^ -1) >= -65536) {
                                      L3: {
                                        if (512 >= var9) {
                                          break L3;
                                        } else {
                                          var9 = 512;
                                          break L3;
                                        }
                                      }
                                      var14 = 8;
                                      ((uh) this).field_b.a(ri.field_c, 0, var14 + var9, -1);
                                      var11 = ((255 & ri.field_c[2]) << 419879528) + (ri.field_c[3] & 255);
                                      var10 = (255 & ri.field_c[1]) + ((255 & ri.field_c[0]) << 382591976);
                                      var12 = (255 & ri.field_c[6]) + (16711680 & ri.field_c[4] << 21117296) - -(ri.field_c[5] << -1836873848 & 65280);
                                      var13 = ri.field_c[7] & 255;
                                      break L2;
                                    } else {
                                      L4: {
                                        if (510 >= var9) {
                                          break L4;
                                        } else {
                                          var9 = 510;
                                          break L4;
                                        }
                                      }
                                      var14 = 10;
                                      ((uh) this).field_b.a(ri.field_c, 0, var14 + var9, param0 + -256);
                                      var12 = (ri.field_c[8] & 255) + ((ri.field_c[7] & 255) << -1580198072) + (16711680 & ri.field_c[6] << -1979188272);
                                      var13 = ri.field_c[9] & 255;
                                      var10 = (ri.field_c[2] << 2115197832 & 65280) + (ri.field_c[1] << -304457840 & 16711680) + (((ri.field_c[0] & 255) << -1955897384) + (255 & ri.field_c[3]));
                                      var11 = (255 & ri.field_c[5]) + (ri.field_c[4] << 1795475560 & 65280);
                                      break L2;
                                    }
                                  }
                                  if (param1 == var10) {
                                    if (var8 == var11) {
                                      if (((uh) this).field_a == var13) {
                                        if ((var12 ^ -1) <= -1) {
                                          if (((long)var12 ^ -1L) >= (((uh) this).field_b.a((byte) -95) / 520L ^ -1L)) {
                                            var15 = var9 + var14;
                                            var8++;
                                            var5 = var12;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var16 >= var15) {
                                                continue L1;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = ri.field_c[var16];
                                                var16++;
                                                continue L5;
                                              }
                                            }
                                          } else {
                                            stackOut_41_0 = null;
                                            stackIn_42_0 = stackOut_41_0;
                                            stackOut_42_0 = stackIn_42_0;
                                            stackIn_43_0 = stackOut_42_0;
                                            return (byte[]) (Object) stackIn_43_0;
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
                    return null;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_50_0 = null;
                stackIn_51_0 = stackOut_50_0;
                return (byte[]) (Object) stackIn_51_0;
              }
              return stackIn_49_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (vf.field_j.startsWith("win")) {
              L1: {
                if (param1.startsWith("http://")) {
                  break L1;
                } else {
                  if (!param1.startsWith("https://")) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L2: while (true) {
                if (param1.length() <= var3) {
                  L3: {
                    Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                    if (param0 > 7) {
                      break L3;
                    } else {
                      uh.a((byte) -75);
                      break L3;
                    }
                  }
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  if (0 == (var2.indexOf((int) param1.charAt(var3)) ^ -1)) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  } else {
                    var3++;
                    continue L2;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (Exception) (Object) decompiledCaughtException;
          return false;
        }
        return stackIn_19_0 != 0;
    }

    public static void a(byte param0) {
        field_f = null;
        field_c = null;
        if (param0 >= -103) {
            Object var2 = null;
            boolean discarded$0 = uh.a((byte) -78, (String) null);
        }
    }

    uh(int param0, me param1, me param2, int param3) {
        ((uh) this).field_d = null;
        ((uh) this).field_b = null;
        ((uh) this).field_g = 65000;
        ((uh) this).field_g = param3;
        ((uh) this).field_a = param0;
        ((uh) this).field_b = param1;
        ((uh) this).field_d = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = true;
        field_f = "MULTIPLIER <times> <%0>";
        field_c = "<%0> <times> 100 = <%1>";
    }
}
