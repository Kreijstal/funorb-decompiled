/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gd {
    static ci field_b;
    static String field_d;
    static boolean field_e;
    private lc field_h;
    private lc field_a;
    static String field_f;
    private int field_c;
    private int field_g;

    final boolean a(int param0, byte[] param1, byte param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_9_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        L0: {
          if (param2 == 59) {
            break L0;
          } else {
            int discarded$3 = gd.a(118);
            break L0;
          }
        }
        var5 = (Object) (Object) ((gd) this).field_a;
        synchronized (var5) {
          L1: {
            L2: {
              if (0 > param3) {
                break L2;
              } else {
                if (((gd) this).field_c >= param3) {
                  L3: {
                    var6 = this.a(param1, param0, true, param3, 68) ? 1 : 0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      var6 = this.a(param1, param0, false, param3, 82) ? 1 : 0;
                      break L3;
                    }
                  }
                  stackOut_8_0 = var6;
                  stackIn_9_0 = stackOut_8_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            throw new IllegalArgumentException();
          }
        }
        return stackIn_9_0 != 0;
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
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            byte[] stackIn_51_0 = null;
            byte[] stackIn_52_0 = null;
            Object stackIn_54_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_50_0 = null;
            byte[] stackOut_51_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_53_0 = null;
            var18 = Chess.field_G;
            var3 = (Object) (Object) ((gd) this).field_a;
            synchronized (var3) {
              try {
                L0: {
                  if ((((gd) this).field_h.c((byte) 109) ^ -1L) <= ((long)(6 + 6 * param0) ^ -1L)) {
                    ((gd) this).field_h.a((long)(param0 * 6), 0);
                    ((gd) this).field_h.a(jg.field_O, -19616, 0, 6);
                    var4_int = ((jg.field_O[0] & 255) << -890717616) - (-(65280 & jg.field_O[1] << -1518102360) - (255 & jg.field_O[2]));
                    var5 = (jg.field_O[5] & 255) + ((jg.field_O[3] & 255) << -1307216688) - -(65280 & jg.field_O[4] << 2051841704);
                    if (-1 >= (var4_int ^ -1)) {
                      if (var4_int <= ((gd) this).field_c) {
                        if (var5 > 0) {
                          if (((gd) this).field_a.c((byte) 109) / 520L >= (long)var5) {
                            L1: {
                              if (param1 >= 92) {
                                break L1;
                              } else {
                                var19 = null;
                                boolean discarded$2 = ((gd) this).a(-51, (byte[]) null, (byte) -18, -53);
                                break L1;
                              }
                            }
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
                                if (var5 != 0) {
                                  L3: {
                                    ((gd) this).field_a.a((long)(var5 * 520), 0);
                                    var9 = var4_int - var7;
                                    if (-65536 > (param0 ^ -1)) {
                                      L4: {
                                        if (-511 <= (var9 ^ -1)) {
                                          break L4;
                                        } else {
                                          var9 = 510;
                                          break L4;
                                        }
                                      }
                                      var14 = 10;
                                      ((gd) this).field_a.a(jg.field_O, -19616, 0, var14 + var9);
                                      var13 = jg.field_O[9] & 255;
                                      var12 = (65280 & jg.field_O[7] << 1611570504) + (((jg.field_O[6] & 255) << 944875696) - -(255 & jg.field_O[8]));
                                      var10 = ((255 & jg.field_O[2]) << -436676792) + (jg.field_O[0] << 1760239576 & -16777216) - -((jg.field_O[1] & 255) << 96506064) - -(jg.field_O[3] & 255);
                                      var11 = (jg.field_O[4] << -529222392 & 65280) - -(255 & jg.field_O[5]);
                                      break L3;
                                    } else {
                                      L5: {
                                        var14 = 8;
                                        if (var9 > 512) {
                                          var9 = 512;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      ((gd) this).field_a.a(jg.field_O, -19616, 0, var9 + var14);
                                      var12 = (jg.field_O[6] & 255) + ((jg.field_O[4] << 370837840 & 16711680) + (65280 & jg.field_O[5] << 978188200));
                                      var13 = 255 & jg.field_O[7];
                                      var10 = (255 & jg.field_O[1]) + (65280 & jg.field_O[0] << -1945205560);
                                      var11 = (65280 & jg.field_O[2] << 2117000072) - -(255 & jg.field_O[3]);
                                      break L3;
                                    }
                                  }
                                  if (param0 == var10) {
                                    if (var8 == var11) {
                                      if (var13 == ((gd) this).field_g) {
                                        if ((var12 ^ -1) <= -1) {
                                          if (((gd) this).field_a.c((byte) 109) / 520L >= (long)var12) {
                                            var15 = var9 + var14;
                                            var8++;
                                            var5 = var12;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var16 >= var15) {
                                                continue L2;
                                              } else {
                                                int incrementValue$3 = var7;
                                                var7++;
                                                var6[incrementValue$3] = jg.field_O[var16];
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
                                  stackOut_22_0 = null;
                                  stackIn_23_0 = stackOut_22_0;
                                  stackOut_23_0 = stackIn_23_0;
                                  stackIn_24_0 = stackOut_23_0;
                                  return (byte[]) (Object) stackIn_24_0;
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

    public final String toString() {
        return "" + ((gd) this).field_g;
    }

    final static boolean a(byte param0, boolean param1) {
        try {
            nk var4 = null;
            nk var5 = null;
            if (null == tl.field_Gb) {
                tl.field_Gb = re.field_n.a(am.field_d, false, qh.field_a);
            }
            if (0 == tl.field_Gb.field_f) {
                return false;
            }
            if (param0 != 68) {
                boolean discarded$0 = gd.a((byte) -72, false);
            }
            long dupTemp$1 = ud.a(param0 ^ 70);
            ta.field_t = dupTemp$1;
            ml.field_d = dupTemp$1;
            if (-2 != (tl.field_Gb.field_f ^ -1)) {
                tb.field_f = gh.field_c;
            } else {
                try {
                    lj.field_a = new hn((java.net.Socket) tl.field_Gb.field_b, re.field_n);
                    qn.field_U.field_l = 0;
                    var4 = tk.field_h;
                    var5 = var4;
                    lf.field_T = param1 ? -2 : -1;
                    wc.field_u = param1 ? -2 : -1;
                    hh.field_o = param1 ? -2 : -1;
                    var5.field_l = 0;
                    tb.field_f = ca.field_h;
                    dh.a(fn.field_b, 11, cm.field_u, ub.field_e, (p) (Object) qn.field_U);
                    vh.a(-1, (byte) -35);
                } catch (IOException iOException) {
                    tb.field_f = gh.field_c;
                }
            }
            tl.field_Gb = null;
            return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0) {
        if (param0 != 5) {
            return -100;
        }
        return -ai.field_j + ca.field_j;
    }

    private final boolean a(byte[] param0, int param1, boolean param2, int param3, int param4) {
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
            int var14 = 0;
            EOFException var15 = null;
            Throwable var16 = null;
            int var17 = 0;
            int stackIn_4_0 = 0;
            int stackIn_5_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_11_0 = 0;
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
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_63_0 = 0;
            var17 = Chess.field_G;
            var6 = (Object) (Object) ((gd) this).field_a;
            synchronized (var6) {
              try {
                L0: {
                  L1: {
                    if (!param2) {
                      var7_int = (int)((519L + ((gd) this).field_a.c((byte) 109)) / 520L);
                      if (var7_int == 0) {
                        var7_int = 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      if ((long)(6 + param1 * 6) <= ((gd) this).field_h.c((byte) 109)) {
                        L2: {
                          ((gd) this).field_h.a((long)(param1 * 6), 0);
                          ((gd) this).field_h.a(jg.field_O, -19616, 0, 6);
                          var7_int = (255 & jg.field_O[5]) + ((16711680 & jg.field_O[3] << -1175302704) + ((jg.field_O[4] & 255) << 1655604520));
                          if (0 >= var7_int) {
                            break L2;
                          } else {
                            if (((long)var7_int ^ -1L) < (((gd) this).field_a.c((byte) 109) / 520L ^ -1L)) {
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
                  jg.field_O[5] = (byte)var7_int;
                  jg.field_O[3] = (byte)(var7_int >> -1943665136);
                  jg.field_O[4] = (byte)(var7_int >> 775096520);
                  var8 = -43 / ((param4 - -55) / 57);
                  jg.field_O[0] = (byte)(param3 >> -1945334864);
                  jg.field_O[2] = (byte)param3;
                  jg.field_O[1] = (byte)(param3 >> -1156411160);
                  ((gd) this).field_h.a((long)(param1 * 6), 0);
                  ((gd) this).field_h.a(0, 6, -1, jg.field_O);
                  var9 = 0;
                  var10 = 0;
                  L3: while (true) {
                    L4: {
                      if (param3 <= var9) {
                        break L4;
                      } else {
                        L5: {
                          var11 = 0;
                          if (!param2) {
                            break L5;
                          } else {
                            L6: {
                              ((gd) this).field_a.a((long)(520 * var7_int), 0);
                              if ((param1 ^ -1) >= -65536) {
                                try {
                                  L7: {
                                    ((gd) this).field_a.a(jg.field_O, -19616, 0, 8);
                                    decompiledRegionSelector1 = 0;
                                    break L7;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L8: {
                                    var15 = (EOFException) (Object) decompiledCaughtException;
                                    decompiledRegionSelector1 = 1;
                                    break L8;
                                  }
                                }
                                if (decompiledRegionSelector1 == 0) {
                                  var14 = 255 & jg.field_O[7];
                                  var11 = (jg.field_O[6] & 255) + (((255 & jg.field_O[4]) << 785940112) - -(jg.field_O[5] << 1617576264 & 65280));
                                  var12 = (255 & jg.field_O[1]) + (65280 & jg.field_O[0] << 497841608);
                                  var13 = (255 & jg.field_O[3]) + ((jg.field_O[2] & 255) << 346547080);
                                  break L6;
                                } else {
                                  break L4;
                                }
                              } else {
                                try {
                                  L9: {
                                    ((gd) this).field_a.a(jg.field_O, -19616, 0, 10);
                                    decompiledRegionSelector0 = 0;
                                    break L9;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L10: {
                                    var15 = (EOFException) (Object) decompiledCaughtException;
                                    decompiledRegionSelector0 = 1;
                                    break L10;
                                  }
                                }
                                if (decompiledRegionSelector0 == 0) {
                                  var11 = (255 & jg.field_O[8]) + ((16711680 & jg.field_O[6] << 1184631760) + (jg.field_O[7] << -1882783192 & 65280));
                                  var14 = jg.field_O[9] & 255;
                                  var13 = (jg.field_O[4] << -404195640 & 65280) + (255 & jg.field_O[5]);
                                  var12 = (jg.field_O[3] & 255) + ((jg.field_O[2] & 255) << 1839328904) + ((16711680 & jg.field_O[1] << 672141104) + ((jg.field_O[0] & 255) << 53822776));
                                  break L6;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L11: {
                              if (param1 != var12) {
                                break L11;
                              } else {
                                if (var13 != var10) {
                                  break L11;
                                } else {
                                  if (var14 != ((gd) this).field_g) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if (var11 < 0) {
                                        break L12;
                                      } else {
                                        if (((gd) this).field_a.c((byte) 109) / 520L >= (long)var11) {
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
                          if (-1 != (var11 ^ -1)) {
                            break L13;
                          } else {
                            L14: {
                              var11 = (int)((((gd) this).field_a.c((byte) 109) - -519L) / 520L);
                              param2 = false;
                              if (var11 != 0) {
                                break L14;
                              } else {
                                var11++;
                                break L14;
                              }
                            }
                            if (var7_int == var11) {
                              var11++;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L15: {
                          if ((-var9 + param3 ^ -1) >= -513) {
                            var11 = 0;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L16: {
                          if (65535 >= param1) {
                            L17: {
                              jg.field_O[7] = (byte)((gd) this).field_g;
                              jg.field_O[0] = (byte)(param1 >> -1643559512);
                              jg.field_O[6] = (byte)var11;
                              jg.field_O[2] = (byte)(var10 >> 1451493608);
                              jg.field_O[1] = (byte)param1;
                              jg.field_O[5] = (byte)(var11 >> 450090824);
                              jg.field_O[3] = (byte)var10;
                              jg.field_O[4] = (byte)(var11 >> 1218784496);
                              ((gd) this).field_a.a((long)(520 * var7_int), 0);
                              ((gd) this).field_a.a(0, 8, -1, jg.field_O);
                              var12 = param3 + -var9;
                              if (var12 > 512) {
                                var12 = 512;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            ((gd) this).field_a.a(var9, var12, -1, param0);
                            var9 = var9 + var12;
                            break L16;
                          } else {
                            L18: {
                              jg.field_O[6] = (byte)(var11 >> -1893675824);
                              jg.field_O[7] = (byte)(var11 >> -633103064);
                              jg.field_O[0] = (byte)(param1 >> 1014870328);
                              jg.field_O[4] = (byte)(var10 >> -1464376248);
                              jg.field_O[2] = (byte)(param1 >> -131258360);
                              jg.field_O[8] = (byte)var11;
                              jg.field_O[5] = (byte)var10;
                              jg.field_O[1] = (byte)(param1 >> 795634864);
                              jg.field_O[9] = (byte)((gd) this).field_g;
                              jg.field_O[3] = (byte)param1;
                              ((gd) this).field_a.a((long)(var7_int * 520), 0);
                              ((gd) this).field_a.a(0, 10, -1, jg.field_O);
                              var12 = -var9 + param3;
                              if ((var12 ^ -1) < -511) {
                                var12 = 510;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            ((gd) this).field_a.a(var9, var12, -1, param0);
                            var9 = var9 + var12;
                            break L16;
                          }
                        }
                        var7_int = var11;
                        var10++;
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

    public static void a(byte param0) {
        field_f = null;
        field_b = null;
        field_d = null;
        int var1 = 62 % ((-52 - param0) / 40);
    }

    gd(int param0, lc param1, lc param2, int param3) {
        ((gd) this).field_h = null;
        ((gd) this).field_c = 65000;
        ((gd) this).field_a = null;
        ((gd) this).field_h = param2;
        ((gd) this).field_c = param3;
        ((gd) this).field_g = param0;
        ((gd) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Show chat (<%0> unread messages)";
        field_f = "Play free version";
    }
}
