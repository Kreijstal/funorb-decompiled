/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sg {
    private si field_d;
    private int field_a;
    static int field_f;
    private si field_c;
    private int field_e;
    static o[][] field_b;

    final byte[] a(boolean param0, int param1) {
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
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_54_0 = null;
            var18 = wizardrun.field_H;
            var3 = (Object) (Object) ((sg) this).field_c;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(param1 * 6 + 6) <= ((sg) this).field_d.b((byte) 79)) {
                    ((sg) this).field_d.a((long)(6 * param1), (byte) 125);
                    ((sg) this).field_d.a(0, wizardrun.field_O, 6, (byte) 47);
                    var4_int = (wizardrun.field_O[2] & 255) + (((255 & wizardrun.field_O[1]) << -1729355416) + (wizardrun.field_O[0] << 28238928 & 16711680));
                    var5 = (255 & wizardrun.field_O[5]) + (((255 & wizardrun.field_O[4]) << -1279817048) + (16711680 & wizardrun.field_O[3] << -11397584));
                    if (var4_int >= 0) {
                      if (((sg) this).field_e >= var4_int) {
                        if (0 < var5) {
                          if (((long)var5 ^ -1L) >= (((sg) this).field_c.b((byte) 79) / 520L ^ -1L)) {
                            L1: {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              if (param0) {
                                break L1;
                              } else {
                                ((sg) this).field_e = 12;
                                break L1;
                              }
                            }
                            var8 = 0;
                            L2: while (true) {
                              if (var4_int <= var7) {
                                stackOut_51_0 = (byte[]) var6;
                                stackIn_52_0 = stackOut_51_0;
                                stackOut_52_0 = (byte[]) (Object) stackIn_52_0;
                                stackIn_53_0 = stackOut_52_0;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L3: {
                                    ((sg) this).field_c.a((long)(520 * var5), (byte) -99);
                                    var9 = -var7 + var4_int;
                                    if ((param1 ^ -1) >= -65536) {
                                      L4: {
                                        if ((var9 ^ -1) < -513) {
                                          var9 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var14 = 8;
                                      ((sg) this).field_c.a(0, wizardrun.field_O, var14 + var9, (byte) 47);
                                      var12 = (65280 & wizardrun.field_O[5] << -814325944) + (((255 & wizardrun.field_O[4]) << -1695281040) - -(wizardrun.field_O[6] & 255));
                                      var13 = wizardrun.field_O[7] & 255;
                                      var11 = (wizardrun.field_O[3] & 255) + (65280 & wizardrun.field_O[2] << -1620796152);
                                      var10 = (255 & wizardrun.field_O[1]) + (65280 & wizardrun.field_O[0] << -1831920280);
                                      break L3;
                                    } else {
                                      L5: {
                                        var14 = 10;
                                        if (-511 > (var9 ^ -1)) {
                                          var9 = 510;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      ((sg) this).field_c.a(0, wizardrun.field_O, var9 + var14, (byte) 47);
                                      var10 = ((255 & wizardrun.field_O[0]) << 1877585144) + (((255 & wizardrun.field_O[1]) << -1847174416) - (-(65280 & wizardrun.field_O[2] << -916029272) + -(255 & wizardrun.field_O[3])));
                                      var11 = (wizardrun.field_O[5] & 255) + ((255 & wizardrun.field_O[4]) << -1641334808);
                                      var12 = (wizardrun.field_O[8] & 255) + (((wizardrun.field_O[6] & 255) << -1501511184) - -((wizardrun.field_O[7] & 255) << -819758136));
                                      var13 = 255 & wizardrun.field_O[9];
                                      break L3;
                                    }
                                  }
                                  if (param1 == var10) {
                                    if (var11 == var8) {
                                      if ((var13 ^ -1) == (((sg) this).field_a ^ -1)) {
                                        if (0 <= var12) {
                                          if ((long)var12 <= ((sg) this).field_c.b((byte) 79) / 520L) {
                                            var15 = var14 + var9;
                                            var8++;
                                            var5 = var12;
                                            var16 = var14;
                                            L6: while (true) {
                                              if ((var15 ^ -1) >= (var16 ^ -1)) {
                                                continue L2;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = wizardrun.field_O[var16];
                                                var16++;
                                                continue L6;
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

    final static String a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_7_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_6_0 = null;
            var7 = wizardrun.field_H;
            try {
              L0: {
                var3 = (String) cl.a(param1, -3264, "getcookies");
                var4 = tj.a(var3, -22710, ';');
                var5 = param2;
                L1: while (true) {
                  if (var5 >= var4.length) {
                    break L0;
                  } else {
                    L2: {
                      var6 = var4[var5].indexOf('=');
                      if (var6 < 0) {
                        break L2;
                      } else {
                        if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param0)) {
                          stackOut_6_0 = var4[var5].substring(var6 + 1).trim();
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var3_ref = decompiledCaughtException;
                break L3;
              }
            }
            return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((sg) this).field_a;
    }

    final static void a(byte param0) {
        if (param0 != 64) {
            sg.a((byte) -126);
        }
        ec.field_a = null;
        f.field_b = null;
        ke.field_t = null;
        lb.field_f = null;
        eb.field_a = false;
    }

    public static void b(byte param0) {
        if (param0 != 111) {
            field_b = null;
        }
        field_b = null;
    }

    private final boolean a(int param0, byte[] param1, int param2, boolean param3, boolean param4) {
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
            Object var17 = null;
            int stackIn_6_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_66_0 = 0;
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
            int stackOut_62_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_65_0 = 0;
            var16 = wizardrun.field_H;
            var6 = (Object) (Object) ((sg) this).field_c;
            synchronized (var6) {
              try {
                L0: {
                  L1: {
                    if (param4) {
                      break L1;
                    } else {
                      var17 = null;
                      boolean discarded$1 = ((sg) this).a((byte[]) null, 123, -51, -120);
                      break L1;
                    }
                  }
                  L2: {
                    if (!param3) {
                      var7_int = (int)((519L + ((sg) this).field_c.b((byte) 79)) / 520L);
                      if (var7_int != 0) {
                        break L2;
                      } else {
                        var7_int = 1;
                        break L2;
                      }
                    } else {
                      if (((long)(6 + 6 * param0) ^ -1L) >= (((sg) this).field_d.b((byte) 79) ^ -1L)) {
                        L3: {
                          ((sg) this).field_d.a((long)(6 * param0), (byte) 120);
                          ((sg) this).field_d.a(0, wizardrun.field_O, 6, (byte) 47);
                          var7_int = (255 & wizardrun.field_O[5]) + (wizardrun.field_O[3] << 814664240 & 16711680) - -(65280 & wizardrun.field_O[4] << -1019985272);
                          if (-1 <= (var7_int ^ -1)) {
                            break L3;
                          } else {
                            if (((long)var7_int ^ -1L) < (((sg) this).field_c.b((byte) 79) / 520L ^ -1L)) {
                              break L3;
                            } else {
                              break L2;
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
                    }
                  }
                  wizardrun.field_O[3] = (byte)(var7_int >> 1870536624);
                  wizardrun.field_O[5] = (byte)var7_int;
                  wizardrun.field_O[2] = (byte)param2;
                  wizardrun.field_O[4] = (byte)(var7_int >> -1725480888);
                  wizardrun.field_O[0] = (byte)(param2 >> 314731984);
                  wizardrun.field_O[1] = (byte)(param2 >> 1385794728);
                  ((sg) this).field_d.a((long)(param0 * 6), (byte) 67);
                  ((sg) this).field_d.a(18729, wizardrun.field_O, 6, 0);
                  var8 = 0;
                  var9 = 0;
                  L4: while (true) {
                    L5: {
                      if (param2 <= var8) {
                        break L5;
                      } else {
                        L6: {
                          var10 = 0;
                          if (param3) {
                            L7: {
                              ((sg) this).field_c.a((long)(520 * var7_int), (byte) -119);
                              if (65535 < param0) {
                                try {
                                  L8: {
                                    ((sg) this).field_c.a(0, wizardrun.field_O, 10, (byte) 47);
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
                                  var13 = wizardrun.field_O[9] & 255;
                                  var10 = (wizardrun.field_O[6] << 608244240 & 16711680) + ((wizardrun.field_O[7] << 34848488 & 65280) + (wizardrun.field_O[8] & 255));
                                  var12 = ((255 & wizardrun.field_O[4]) << 215647784) - -(wizardrun.field_O[5] & 255);
                                  var11 = ((wizardrun.field_O[0] & 255) << 705173176) - (-(16711680 & wizardrun.field_O[1] << -1386792720) + -(wizardrun.field_O[2] << -761837784 & 65280)) + (wizardrun.field_O[3] & 255);
                                  break L7;
                                } else {
                                  break L5;
                                }
                              } else {
                                try {
                                  L10: {
                                    ((sg) this).field_c.a(0, wizardrun.field_O, 8, (byte) 47);
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
                                  var10 = (255 & wizardrun.field_O[6]) + (65280 & wizardrun.field_O[5] << 47969576) + (16711680 & wizardrun.field_O[4] << 338170928);
                                  var11 = (65280 & wizardrun.field_O[0] << 1606709800) + (wizardrun.field_O[1] & 255);
                                  var12 = (wizardrun.field_O[3] & 255) + ((wizardrun.field_O[2] & 255) << -1390525688);
                                  var13 = wizardrun.field_O[7] & 255;
                                  break L7;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L12: {
                              if (param0 != var11) {
                                break L12;
                              } else {
                                if (var9 != var12) {
                                  break L12;
                                } else {
                                  if (var13 == ((sg) this).field_a) {
                                    L13: {
                                      if (-1 < (var10 ^ -1)) {
                                        break L13;
                                      } else {
                                        if ((long)var10 > ((sg) this).field_c.b((byte) 79) / 520L) {
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
                          if (0 == var10) {
                            L15: {
                              param3 = false;
                              var10 = (int)((((sg) this).field_c.b((byte) 79) + 519L) / 520L);
                              if (var10 != 0) {
                                break L15;
                              } else {
                                var10++;
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
                          if (param2 - var8 >= -513) {
                            var10 = 0;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        L17: {
                          if (-65536 < param0) {
                            L18: {
                              wizardrun.field_O[4] = (byte)(var9 >> -934648184);
                              wizardrun.field_O[0] = (byte)(param0 >> -471569160);
                              wizardrun.field_O[2] = (byte)(param0 >> -1825970200);
                              wizardrun.field_O[3] = (byte)param0;
                              wizardrun.field_O[7] = (byte)(var10 >> 969878024);
                              wizardrun.field_O[1] = (byte)(param0 >> 1350708976);
                              wizardrun.field_O[6] = (byte)(var10 >> -255664624);
                              wizardrun.field_O[8] = (byte)var10;
                              wizardrun.field_O[9] = (byte)((sg) this).field_a;
                              wizardrun.field_O[5] = (byte)var9;
                              ((sg) this).field_c.a((long)(520 * var7_int), (byte) 47);
                              ((sg) this).field_c.a(18729, wizardrun.field_O, 10, 0);
                              var11 = param2 - var8;
                              if ((var11 ^ -1) < -511) {
                                var11 = 510;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            ((sg) this).field_c.a(18729, param1, var11, var8);
                            var8 = var8 + var11;
                            break L17;
                          } else {
                            L19: {
                              wizardrun.field_O[7] = (byte)((sg) this).field_a;
                              wizardrun.field_O[0] = (byte)(param0 >> -804502552);
                              wizardrun.field_O[5] = (byte)(var10 >> -749471256);
                              wizardrun.field_O[6] = (byte)var10;
                              wizardrun.field_O[3] = (byte)var9;
                              wizardrun.field_O[4] = (byte)(var10 >> 1158890864);
                              wizardrun.field_O[2] = (byte)(var9 >> -705985496);
                              wizardrun.field_O[1] = (byte)param0;
                              ((sg) this).field_c.a((long)(var7_int * 520), (byte) -61);
                              ((sg) this).field_c.a(18729, wizardrun.field_O, 8, 0);
                              var11 = param2 + -var8;
                              if ((var11 ^ -1) < -513) {
                                var11 = 512;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            ((sg) this).field_c.a(18729, param1, var11, var8);
                            var8 = var8 + var11;
                            break L17;
                          }
                        }
                        var7_int = var10;
                        var9++;
                        continue L4;
                      }
                    }
                    stackOut_62_0 = 1;
                    stackIn_63_0 = stackOut_62_0;
                    stackOut_63_0 = stackIn_63_0;
                    stackIn_64_0 = stackOut_63_0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                stackOut_65_0 = 0;
                stackIn_66_0 = stackOut_65_0;
                return stackIn_66_0 != 0;
              }
              return stackIn_64_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_8_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        var5 = (Object) (Object) ((sg) this).field_c;
        synchronized (var5) {
          L0: {
            L1: {
              if (param2 > param3) {
                break L1;
              } else {
                if (param3 > ((sg) this).field_e) {
                  break L1;
                } else {
                  L2: {
                    var6 = this.a(param1, param0, param3, true, true) ? 1 : 0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      var6 = this.a(param1, param0, param3, false, true) ? 1 : 0;
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
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    sg(int param0, si param1, si param2, int param3) {
        ((sg) this).field_d = null;
        ((sg) this).field_c = null;
        ((sg) this).field_e = 65000;
        ((sg) this).field_c = param1;
        ((sg) this).field_e = param3;
        ((sg) this).field_d = param2;
        ((sg) this).field_a = param0;
    }

    static {
    }
}
