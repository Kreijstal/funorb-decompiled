/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.applet.Applet;

final class np {
    private int field_h;
    private ir field_i;
    static String field_a;
    static int field_d;
    static String field_c;
    private ir field_f;
    static String field_g;
    private int field_b;
    static String field_e;

    public static void a(boolean param0) {
        field_c = null;
        field_e = null;
        field_g = null;
        field_a = null;
        if (!param0) {
            Object var2 = null;
            int discarded$0 = np.a(true, (String) null, true, true, -64, (String) null);
        }
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
            Object stackIn_7_0 = null;
            Object stackIn_8_0 = null;
            Object stackIn_19_0 = null;
            Object stackIn_20_0 = null;
            Object stackIn_47_0 = null;
            Object stackIn_48_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_46_0 = null;
            Object stackOut_47_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            Object stackOut_6_0 = null;
            Object stackOut_7_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_56_0 = null;
            var18 = Pool.field_O;
            var3 = (Object) (Object) ((np) this).field_i;
            synchronized (var3) {
              try {
                L0: {
                  if ((((np) this).field_f.d((byte) 17) ^ -1L) <= ((long)(6 + param1 * 6) ^ -1L)) {
                    ((np) this).field_f.a(0, (long)(param1 * 6));
                    if (param0 == -110) {
                      ((np) this).field_f.a((byte) -111, 6, 0, dg.field_S);
                      var4_int = (dg.field_S[2] & 255) + (16711680 & dg.field_S[0] << 474515088) + (dg.field_S[1] << -2063113848 & 65280);
                      var5 = (255 & dg.field_S[5]) + (dg.field_S[3] << -1736479280 & 16711680) - -(dg.field_S[4] << 1304009224 & 65280);
                      if (var4_int >= 0) {
                        if (var4_int <= ((np) this).field_b) {
                          if (-1 > (var5 ^ -1)) {
                            if (((np) this).field_i.d((byte) 17) / 520L >= (long)var5) {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              var8 = 0;
                              L1: while (true) {
                                if (var7 >= var4_int) {
                                  stackOut_53_0 = (byte[]) var6;
                                  stackIn_54_0 = stackOut_53_0;
                                  stackOut_54_0 = (byte[]) (Object) stackIn_54_0;
                                  stackIn_55_0 = stackOut_54_0;
                                  break L0;
                                } else {
                                  if (var5 != 0) {
                                    L2: {
                                      ((np) this).field_i.a(param0 ^ -110, (long)(520 * var5));
                                      var9 = var4_int - var7;
                                      if (65535 >= param1) {
                                        L3: {
                                          if ((var9 ^ -1) >= -513) {
                                            break L3;
                                          } else {
                                            var9 = 512;
                                            break L3;
                                          }
                                        }
                                        var14 = 8;
                                        ((np) this).field_i.a((byte) -115, var14 + var9, 0, dg.field_S);
                                        var12 = (dg.field_S[5] << -2061837656 & 65280) + (dg.field_S[4] << 1768258640 & 16711680) - -(dg.field_S[6] & 255);
                                        var11 = ((dg.field_S[2] & 255) << 1605382184) - -(dg.field_S[3] & 255);
                                        var13 = dg.field_S[7] & 255;
                                        var10 = (dg.field_S[1] & 255) + (65280 & dg.field_S[0] << -2094406968);
                                        break L2;
                                      } else {
                                        L4: {
                                          if ((var9 ^ -1) < -511) {
                                            var9 = 510;
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        }
                                        var14 = 10;
                                        ((np) this).field_i.a((byte) -126, var9 + var14, 0, dg.field_S);
                                        var12 = (dg.field_S[7] << -1372757816 & 65280) + (16711680 & dg.field_S[6] << -1444683920) + (255 & dg.field_S[8]);
                                        var13 = dg.field_S[9] & 255;
                                        var11 = (255 & dg.field_S[5]) + (dg.field_S[4] << 456538728 & 65280);
                                        var10 = (dg.field_S[3] & 255) + (-16777216 & dg.field_S[0] << 2001184440) - -((dg.field_S[1] & 255) << -183335760) + ((dg.field_S[2] & 255) << 723552488);
                                        break L2;
                                      }
                                    }
                                    if (var10 == param1) {
                                      if (var11 == var8) {
                                        if (var13 == ((np) this).field_h) {
                                          if ((var12 ^ -1) <= -1) {
                                            if ((long)var12 <= ((np) this).field_i.d((byte) 17) / 520L) {
                                              var15 = var14 + var9;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (var15 <= var16) {
                                                  var8++;
                                                  var5 = var12;
                                                  continue L1;
                                                } else {
                                                  int incrementValue$1 = var7;
                                                  var7++;
                                                  var6[incrementValue$1] = dg.field_S[var16];
                                                  var16++;
                                                  continue L5;
                                                }
                                              }
                                            } else {
                                              stackOut_46_0 = null;
                                              stackIn_47_0 = stackOut_46_0;
                                              stackOut_47_0 = stackIn_47_0;
                                              stackIn_48_0 = stackOut_47_0;
                                              return (byte[]) (Object) stackIn_48_0;
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
                              stackOut_18_0 = null;
                              stackIn_19_0 = stackOut_18_0;
                              stackOut_19_0 = stackIn_19_0;
                              stackIn_20_0 = stackOut_19_0;
                              return (byte[]) (Object) stackIn_20_0;
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
                      stackOut_6_0 = null;
                      stackIn_7_0 = stackOut_6_0;
                      stackOut_7_0 = stackIn_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      return (byte[]) (Object) stackIn_8_0;
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
                stackOut_56_0 = null;
                stackIn_57_0 = stackOut_56_0;
                return (byte[]) (Object) stackIn_57_0;
              }
              return stackIn_55_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(boolean param0, oq param1) {
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        if (param0) {
          return null;
        } else {
          var5 = new StringBuilder(2 * param1.field_v);
          var2 = var5;
          var3 = 0;
          L0: while (true) {
            if (param1.field_v <= var3) {
              return var2.toString();
            } else {
              var4 = 255 & param1.field_t[var3];
              StringBuilder discarded$2 = var5.append(ec.field_j[var4 >> -210964092 & 15]);
              StringBuilder discarded$3 = var5.append(ec.field_j[15 & var4]);
              var3++;
              continue L0;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, byte[] param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_11_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        var5 = (Object) (Object) ((np) this).field_i;
        synchronized (var5) {
          L0: {
            L1: {
              if (param1 == -12875) {
                break L1;
              } else {
                field_d = 96;
                break L1;
              }
            }
            L2: {
              if (-1 < (param2 ^ -1)) {
                break L2;
              } else {
                if (param2 <= ((np) this).field_b) {
                  L3: {
                    var6 = this.a(param0, param2, true, param3, (byte) 93) ? 1 : 0;
                    if (var6 == 0) {
                      var6 = this.a(param0, param2, false, param3, (byte) 93) ? 1 : 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackOut_10_0 = var6;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            throw new IllegalArgumentException();
          }
        }
        return stackIn_11_0 != 0;
    }

    private final boolean a(int param0, int param1, boolean param2, byte[] param3, byte param4) {
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
            int stackIn_7_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_64_0 = 0;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_6_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_63_0 = 0;
            var16 = Pool.field_O;
            var6 = (Object) (Object) ((np) this).field_i;
            synchronized (var6) {
              try {
                L0: {
                  L1: {
                    if (param2) {
                      if ((long)(6 + param0 * 6) > ((np) this).field_f.d((byte) 17)) {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackOut_7_0 = stackIn_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0 != 0;
                      } else {
                        L2: {
                          ((np) this).field_f.a(0, (long)(param0 * 6));
                          ((np) this).field_f.a((byte) -110, 6, 0, dg.field_S);
                          var7_int = (dg.field_S[5] & 255) + (16711680 & dg.field_S[3] << 613994640) + (dg.field_S[4] << -1707825688 & 65280);
                          if ((var7_int ^ -1) >= -1) {
                            break L2;
                          } else {
                            if ((long)var7_int <= ((np) this).field_i.d((byte) 17) / 520L) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackOut_13_0 = stackIn_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      }
                    } else {
                      var7_int = (int)((519L + ((np) this).field_i.d((byte) 17)) / 520L);
                      if (var7_int != 0) {
                        break L1;
                      } else {
                        var7_int = 1;
                        break L1;
                      }
                    }
                  }
                  dg.field_S[3] = (byte)(var7_int >> 1500914800);
                  dg.field_S[2] = (byte)param1;
                  dg.field_S[0] = (byte)(param1 >> 12353904);
                  dg.field_S[1] = (byte)(param1 >> -222958776);
                  dg.field_S[4] = (byte)(var7_int >> 1796002408);
                  dg.field_S[5] = (byte)var7_int;
                  ((np) this).field_f.a(0, (long)(param0 * 6));
                  ((np) this).field_f.a(6, dg.field_S, 0, -1);
                  var8 = 0;
                  var9 = 0;
                  L3: while (true) {
                    L4: {
                      if (var8 >= param1) {
                        break L4;
                      } else {
                        L5: {
                          var10 = 0;
                          if (param2) {
                            L6: {
                              ((np) this).field_i.a(param4 ^ 93, (long)(520 * var7_int));
                              if (65535 >= param0) {
                                try {
                                  L7: {
                                    ((np) this).field_i.a((byte) -110, 8, 0, dg.field_S);
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
                                  var12 = (dg.field_S[3] & 255) + (65280 & dg.field_S[2] << -169796888);
                                  var10 = ((255 & dg.field_S[5]) << -1767406104) + ((16711680 & dg.field_S[4] << 1036563312) + (255 & dg.field_S[6]));
                                  var11 = (dg.field_S[0] << -170939704 & 65280) + (255 & dg.field_S[1]);
                                  var13 = dg.field_S[7] & 255;
                                  break L6;
                                } else {
                                  break L4;
                                }
                              } else {
                                try {
                                  L9: {
                                    ((np) this).field_i.a((byte) -118, 10, 0, dg.field_S);
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
                                  var11 = (dg.field_S[3] & 255) + ((65280 & dg.field_S[2] << -2115165400) + ((dg.field_S[0] << -286328680 & -16777216) - -(16711680 & dg.field_S[1] << -406034640)));
                                  var12 = (65280 & dg.field_S[4] << 1621663048) + (dg.field_S[5] & 255);
                                  var10 = (16711680 & dg.field_S[6] << 1762986576) - (-(65280 & dg.field_S[7] << -2053667960) - (dg.field_S[8] & 255));
                                  var13 = 255 & dg.field_S[9];
                                  break L6;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L11: {
                              if (var11 != param0) {
                                break L11;
                              } else {
                                if (var12 != var9) {
                                  break L11;
                                } else {
                                  if (var13 == ((np) this).field_h) {
                                    L12: {
                                      if (0 > var10) {
                                        break L12;
                                      } else {
                                        if (((np) this).field_i.d((byte) 17) / 520L >= (long)var10) {
                                          break L5;
                                        } else {
                                          break L12;
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
                          if (-1 != (var10 ^ -1)) {
                            break L13;
                          } else {
                            L14: {
                              param2 = false;
                              var10 = (int)((((np) this).field_i.d((byte) 17) + 519L) / 520L);
                              if (var10 != 0) {
                                break L14;
                              } else {
                                var10++;
                                break L14;
                              }
                            }
                            if (var10 != var7_int) {
                              break L13;
                            } else {
                              var10++;
                              break L13;
                            }
                          }
                        }
                        L15: {
                          if (param1 + -var8 > 512) {
                            break L15;
                          } else {
                            var10 = 0;
                            break L15;
                          }
                        }
                        L16: {
                          if ((param0 ^ -1) >= -65536) {
                            L17: {
                              dg.field_S[0] = (byte)(param0 >> -1499984568);
                              dg.field_S[1] = (byte)param0;
                              dg.field_S[5] = (byte)(var10 >> -1603904472);
                              dg.field_S[6] = (byte)var10;
                              dg.field_S[2] = (byte)(var9 >> 1832633384);
                              dg.field_S[3] = (byte)var9;
                              dg.field_S[7] = (byte)((np) this).field_h;
                              dg.field_S[4] = (byte)(var10 >> 1781651216);
                              ((np) this).field_i.a(0, (long)(520 * var7_int));
                              ((np) this).field_i.a(8, dg.field_S, 0, -1);
                              var11 = -var8 + param1;
                              if (-513 > (var11 ^ -1)) {
                                var11 = 512;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            ((np) this).field_i.a(var11, param3, var8, -1);
                            var8 = var8 + var11;
                            break L16;
                          } else {
                            L18: {
                              dg.field_S[7] = (byte)(var10 >> 1702366760);
                              dg.field_S[9] = (byte)((np) this).field_h;
                              dg.field_S[3] = (byte)param0;
                              dg.field_S[8] = (byte)var10;
                              dg.field_S[2] = (byte)(param0 >> -701734744);
                              dg.field_S[4] = (byte)(var9 >> 1904038344);
                              dg.field_S[0] = (byte)(param0 >> 191655096);
                              dg.field_S[1] = (byte)(param0 >> 1402166704);
                              dg.field_S[6] = (byte)(var10 >> 644621680);
                              dg.field_S[5] = (byte)var9;
                              ((np) this).field_i.a(0, (long)(520 * var7_int));
                              ((np) this).field_i.a(10, dg.field_S, 0, param4 + -94);
                              var11 = -var8 + param1;
                              if ((var11 ^ -1) < -511) {
                                var11 = 510;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            ((np) this).field_i.a(var11, param3, var8, -1);
                            var8 = var8 + var11;
                            break L16;
                          }
                        }
                        var7_int = var10;
                        var9++;
                        continue L3;
                      }
                    }
                    L19: {
                      if (param4 == 93) {
                        break L19;
                      } else {
                        np.a(false);
                        break L19;
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
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0, String param1, boolean param2, boolean param3, int param4, String param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            Object var11 = null;
            String var12 = null;
            CharSequence var13 = null;
            int stackIn_41_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_51_0 = 0;
            ml stackIn_63_0 = null;
            java.applet.Applet stackIn_63_1 = null;
            ml stackIn_64_0 = null;
            java.applet.Applet stackIn_64_1 = null;
            ml stackIn_65_0 = null;
            java.applet.Applet stackIn_65_1 = null;
            int stackIn_65_2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_40_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_49_0 = 0;
            ml stackOut_62_0 = null;
            java.applet.Applet stackOut_62_1 = null;
            ml stackOut_64_0 = null;
            java.applet.Applet stackOut_64_1 = null;
            int stackOut_64_2 = 0;
            ml stackOut_63_0 = null;
            java.applet.Applet stackOut_63_1 = null;
            int stackOut_63_2 = 0;
            L0: {
              var9 = Pool.field_O;
              if (null == jd.field_c) {
                if (sa.a((byte) 65, param2)) {
                  break L0;
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
            L1: {
              if (tl.field_J == no.field_h) {
                L2: {
                  if (!param2) {
                    hn.field_c = kb.a(false, param1, -5790, param5);
                    break L2;
                  } else {
                    var11 = null;
                    hn.field_c = bi.a(hm.field_a, -16595, param5, false, (String) null);
                    break L2;
                  }
                }
                ej.field_j.field_v = 0;
                ej.field_j.a(14, false);
                ej.field_j.a(hn.field_c.b((byte) -101).field_c, false);
                de.a(-1, 0);
                tl.field_J = vn.field_d;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (vn.field_d == tl.field_J) {
                if (!lq.b((byte) 87, 1)) {
                  break L3;
                } else {
                  L4: {
                    var6 = kn.field_e.g(-82);
                    if ((var6 ^ -1) == -1) {
                      tl.field_J = fr.field_o;
                      break L4;
                    } else {
                      uq.field_c = var6;
                      of.field_Pb = -1;
                      tl.field_J = hm.field_k;
                      break L4;
                    }
                  }
                  kn.field_e.field_v = 0;
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L5: {
              if (fr.field_o == tl.field_J) {
                if (!lq.b((byte) 43, 8)) {
                  break L5;
                } else {
                  Pool.field_Q = kn.field_e.h(-412303328);
                  kn.field_e.field_v = 0;
                  pj.a(param2, hn.field_c, param3, -98300704, param4);
                  tl.field_J = wo.field_g;
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L6: {
              if (tl.field_J == wo.field_g) {
                if (lq.b((byte) 79, 1)) {
                  L7: {
                    var6 = kn.field_e.g(-110);
                    kn.field_e.field_v = 0;
                    ri.field_N = null;
                    uq.field_c = var6;
                    if (-1 == (var6 ^ -1)) {
                      break L7;
                    } else {
                      if (1 == var6) {
                        break L7;
                      } else {
                        if (var6 == 8) {
                          dn.c(-115);
                          we.field_e = false;
                          return var6;
                        } else {
                          tl.field_J = hm.field_k;
                          of.field_Pb = -1;
                          break L6;
                        }
                      }
                    }
                  }
                  of.field_Pb = -1;
                  tl.field_J = ff.field_b;
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L8: {
              if (ff.field_b == tl.field_J) {
                if (wf.a((byte) 39)) {
                  L9: {
                    hm.field_a = kn.field_e.h(-412303328);
                    ei.field_E = param5;
                    hq.field_i = kn.field_e.g(-68);
                    ta.field_f = kn.field_e.g(-105);
                    mp.field_V = kn.field_e.d(-1034);
                    var12 = kn.field_e.m(108);
                    var7 = kn.field_e.g(-76);
                    if (0 != (1 & var7)) {
                      ke.a(100);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (-1 == (16 & var7 ^ -1)) {
                      stackOut_40_0 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      break L10;
                    } else {
                      stackOut_39_0 = 1;
                      stackIn_41_0 = stackOut_39_0;
                      break L10;
                    }
                  }
                  L11: {
                    nm.field_b = stackIn_41_0 != 0;
                    if (param2) {
                      break L11;
                    } else {
                      L12: {
                        if (-1 == (8 & var7 ^ -1)) {
                          stackOut_44_0 = 0;
                          stackIn_45_0 = stackOut_44_0;
                          break L12;
                        } else {
                          stackOut_43_0 = 1;
                          stackIn_45_0 = stackOut_43_0;
                          break L12;
                        }
                      }
                      L13: {
                        ea.field_z = stackIn_45_0 != 0;
                        if ((4 & var7 ^ -1) == -1) {
                          stackOut_47_0 = 0;
                          stackIn_48_0 = stackOut_47_0;
                          break L13;
                        } else {
                          stackOut_46_0 = 1;
                          stackIn_48_0 = stackOut_46_0;
                          break L13;
                        }
                      }
                      L14: {
                        fq.field_Gb = stackIn_48_0 != 0;
                        if (-1 == (2 & var7 ^ -1)) {
                          stackOut_50_0 = 0;
                          stackIn_51_0 = stackOut_50_0;
                          break L14;
                        } else {
                          stackOut_49_0 = 1;
                          stackIn_51_0 = stackOut_49_0;
                          break L14;
                        }
                      }
                      hr.field_y = stackIn_51_0 != 0;
                      if (ea.field_z) {
                        hr.field_y = true;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L15: {
                    if (!hk.field_s) {
                      break L15;
                    } else {
                      int discarded$6 = kn.field_e.g(-114);
                      int discarded$7 = kn.field_e.g(-99);
                      int discarded$8 = kn.field_e.b(true);
                      va.field_X = kn.field_e.d(-1034);
                      sn.field_n = new byte[va.field_X];
                      var8 = 0;
                      L16: while (true) {
                        if (va.field_X <= var8) {
                          break L15;
                        } else {
                          sn.field_n[var8] = kn.field_e.e((byte) 105);
                          var8++;
                          continue L16;
                        }
                      }
                    }
                  }
                  L17: {
                    di.field_j = kn.field_e.j(-22);
                    var13 = (CharSequence) (Object) di.field_j;
                    oj.field_y = hq.a(101, var13);
                    no.field_l = kn.field_e.g(-126);
                    tl.field_J = ta.field_a;
                    if (hn.field_c.b((byte) -110) == dg.field_L) {
                      L18: {
                        stackOut_62_0 = eo.field_Xb;
                        stackOut_62_1 = hk.d(78);
                        stackIn_64_0 = stackOut_62_0;
                        stackIn_64_1 = stackOut_62_1;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        if (param0) {
                          stackOut_64_0 = (ml) (Object) stackIn_64_0;
                          stackOut_64_1 = (java.applet.Applet) (Object) stackIn_64_1;
                          stackOut_64_2 = 0;
                          stackIn_65_0 = stackOut_64_0;
                          stackIn_65_1 = stackOut_64_1;
                          stackIn_65_2 = stackOut_64_2;
                          break L18;
                        } else {
                          stackOut_63_0 = (ml) (Object) stackIn_63_0;
                          stackOut_63_1 = (java.applet.Applet) (Object) stackIn_63_1;
                          stackOut_63_2 = 1;
                          stackIn_65_0 = stackOut_63_0;
                          stackIn_65_1 = stackOut_63_1;
                          stackIn_65_2 = stackOut_63_2;
                          break L18;
                        }
                      }
                      ((ml) (Object) stackIn_65_0).a(stackIn_65_1, stackIn_65_2 != 0);
                      break L17;
                    } else {
                      if (hn.field_c.b((byte) 37) == rp.field_b) {
                        ug.field_v.a(hk.d(105), true);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L19: {
                    we.field_e = false;
                    if (var12 == null) {
                      break L19;
                    } else {
                      fg.a(hk.d(100), -124, var12);
                      break L19;
                    }
                  }
                  L20: {
                    L21: {
                      if (-1 > (mp.field_V ^ -1)) {
                        break L21;
                      } else {
                        if (fq.field_Gb) {
                          break L21;
                        } else {
                          try {
                            L22: {
                              Object discarded$9 = mo.a((byte) 126, "unzap", hk.d(125));
                              break L22;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L23: {
                              var8_ref_Throwable = decompiledCaughtException;
                              break L23;
                            }
                          }
                          break L20;
                        }
                      }
                    }
                    try {
                      L24: {
                        Object discarded$10 = mo.a("zap", new Object[1], 105, hk.d(107));
                        break L24;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L25: {
                        var8_ref_Throwable = decompiledCaughtException;
                        break L25;
                      }
                    }
                    break L20;
                  }
                  L26: {
                    if (mp.field_V <= 0) {
                      break L26;
                    } else {
                      bf.field_g = true;
                      break L26;
                    }
                  }
                  ej.field_j.b(32, Pool.field_L);
                  var8 = 0;
                  L27: while (true) {
                    if (-5 >= (var8 ^ -1)) {
                      kn.field_e.b(32, Pool.field_L);
                      return uq.field_c;
                    } else {
                      Pool.field_L[var8] = Pool.field_L[var8] + 50;
                      var8++;
                      continue L27;
                    }
                  }
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L28: {
              if (!param0) {
                break L28;
              } else {
                var10 = null;
                int discarded$11 = np.a(true, (String) null, false, false, 59, (String) null);
                break L28;
              }
            }
            L29: {
              if (tl.field_J != hm.field_k) {
                break L29;
              } else {
                if (wf.a((byte) 39)) {
                  L30: {
                    dn.c(-64);
                    if ((uq.field_c ^ -1) != -8) {
                      break L30;
                    } else {
                      if (!we.field_e) {
                        we.field_e = true;
                        return -1;
                      } else {
                        break L30;
                      }
                    }
                  }
                  L31: {
                    if (-8 != (uq.field_c ^ -1)) {
                      break L31;
                    } else {
                      uq.field_c = 3;
                      break L31;
                    }
                  }
                  ke.field_g = kn.field_e.j(-51);
                  we.field_e = false;
                  return uq.field_c;
                } else {
                  break L29;
                }
              }
            }
            L32: {
              if (null != jd.field_c) {
                break L32;
              } else {
                if (!we.field_e) {
                  var6 = vj.field_d;
                  vj.field_d = cq.field_a;
                  we.field_e = true;
                  cq.field_a = var6;
                  break L32;
                } else {
                  L33: {
                    if (30000L >= bf.d((byte) 118)) {
                      ke.field_g = er.field_Q;
                      break L33;
                    } else {
                      ke.field_g = wd.field_Rb;
                      break L33;
                    }
                  }
                  we.field_e = false;
                  return 3;
                }
              }
            }
            return -1;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((np) this).field_h;
    }

    np(int param0, ir param1, ir param2, int param3) {
        ((np) this).field_f = null;
        ((np) this).field_i = null;
        ((np) this).field_b = 65000;
        ((np) this).field_i = param1;
        ((np) this).field_f = param2;
        ((np) this).field_h = param0;
        ((np) this).field_b = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> has dropped out.";
        field_g = "No options available";
        field_e = "Achieved";
    }
}
