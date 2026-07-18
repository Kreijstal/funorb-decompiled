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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5_ref;
            stackOut_12_1 = new StringBuilder().append("gd.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
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
                  if (~((gd) this).field_h.c((byte) 109) <= ~(long)(6 + 6 * param0)) {
                    ((gd) this).field_h.a((long)(param0 * 6), 0);
                    ((gd) this).field_h.a(jg.field_O, -19616, 0, 6);
                    var4_int = ((jg.field_O[0] & 255) << 16) - (-(65280 & jg.field_O[1] << 8) - (255 & jg.field_O[2]));
                    var5 = (jg.field_O[5] & 255) + ((jg.field_O[3] & 255) << 16) - -(65280 & jg.field_O[4] << 8);
                    if (var4_int >= 0) {
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
                                    if (param0 > 65535) {
                                      L4: {
                                        if (var9 <= 510) {
                                          break L4;
                                        } else {
                                          var9 = 510;
                                          break L4;
                                        }
                                      }
                                      var14 = 10;
                                      ((gd) this).field_a.a(jg.field_O, -19616, 0, var14 + var9);
                                      var13 = jg.field_O[9] & 255;
                                      var12 = (65280 & jg.field_O[7] << 8) + (((jg.field_O[6] & 255) << 16) - -(255 & jg.field_O[8]));
                                      var10 = ((255 & jg.field_O[2]) << 8) + (jg.field_O[0] << 24 & -16777216) - -((jg.field_O[1] & 255) << 16) - -(jg.field_O[3] & 255);
                                      var11 = (jg.field_O[4] << 8 & 65280) - -(255 & jg.field_O[5]);
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
                                      var12 = (jg.field_O[6] & 255) + ((jg.field_O[4] << 16 & 16711680) + (65280 & jg.field_O[5] << 8));
                                      var13 = 255 & jg.field_O[7];
                                      var10 = (255 & jg.field_O[1]) + (65280 & jg.field_O[0] << 8);
                                      var11 = (65280 & jg.field_O[2] << 8) - -(255 & jg.field_O[3]);
                                      break L3;
                                    }
                                  }
                                  if (param0 == var10) {
                                    if (var8 == var11) {
                                      if (var13 == ((gd) this).field_g) {
                                        if (var12 >= 0) {
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
            if (tl.field_Gb.field_f != 1) {
                tb.field_f = gh.field_c;
            } else {
                {
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
            int var14 = 0;
            EOFException var15 = null;
            Throwable var16 = null;
            int var17 = 0;
            int stackIn_5_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
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
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
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
            var17 = Chess.field_G;
            try {
              var6_ref2 = (Object) (Object) ((gd) this).field_a;
              synchronized (var6_ref2) {
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
                            var7_int = (255 & jg.field_O[5]) + ((16711680 & jg.field_O[3] << 16) + ((jg.field_O[4] & 255) << 8));
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if (~(long)var7_int < ~(((gd) this).field_a.c((byte) 109) / 520L)) {
                                break L2;
                              } else {
                                break L1;
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
                    jg.field_O[5] = (byte)var7_int;
                    jg.field_O[3] = (byte)(var7_int >> 16);
                    jg.field_O[4] = (byte)(var7_int >> 8);
                    var8 = -43 / ((param4 - -55) / 57);
                    jg.field_O[0] = (byte)(param3 >> 16);
                    jg.field_O[2] = (byte)param3;
                    jg.field_O[1] = (byte)(param3 >> 8);
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
                                if (param1 <= 65535) {
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
                                    var11 = (jg.field_O[6] & 255) + (((255 & jg.field_O[4]) << 16) - -(jg.field_O[5] << 8 & 65280));
                                    var12 = (255 & jg.field_O[1]) + (65280 & jg.field_O[0] << 8);
                                    var13 = (255 & jg.field_O[3]) + ((jg.field_O[2] & 255) << 8);
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
                                    var11 = (255 & jg.field_O[8]) + ((16711680 & jg.field_O[6] << 16) + (jg.field_O[7] << 8 & 65280));
                                    var14 = jg.field_O[9] & 255;
                                    var13 = (jg.field_O[4] << 8 & 65280) + (255 & jg.field_O[5]);
                                    var12 = (jg.field_O[3] & 255) + ((jg.field_O[2] & 255) << 8) + ((16711680 & jg.field_O[1] << 16) + ((jg.field_O[0] & 255) << 24));
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
                            }
                          }
                          L13: {
                            if (var11 != 0) {
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
                            if (-var9 + param3 <= 512) {
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
                                jg.field_O[0] = (byte)(param1 >> 8);
                                jg.field_O[6] = (byte)var11;
                                jg.field_O[2] = (byte)(var10 >> 8);
                                jg.field_O[1] = (byte)param1;
                                jg.field_O[5] = (byte)(var11 >> 8);
                                jg.field_O[3] = (byte)var10;
                                jg.field_O[4] = (byte)(var11 >> 16);
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
                                jg.field_O[6] = (byte)(var11 >> 16);
                                jg.field_O[7] = (byte)(var11 >> 8);
                                jg.field_O[0] = (byte)(param1 >> 24);
                                jg.field_O[4] = (byte)(var10 >> 8);
                                jg.field_O[2] = (byte)(param1 >> 8);
                                jg.field_O[8] = (byte)var11;
                                jg.field_O[5] = (byte)var10;
                                jg.field_O[1] = (byte)(param1 >> 16);
                                jg.field_O[9] = (byte)((gd) this).field_g;
                                jg.field_O[3] = (byte)param1;
                                ((gd) this).field_a.a((long)(var7_int * 520), 0);
                                ((gd) this).field_a.a(0, 10, -1, jg.field_O);
                                var12 = -var9 + param3;
                                if (var12 > 510) {
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
                stackOut_68_1 = new StringBuilder().append("gd.C(");
                stackIn_70_0 = stackOut_68_0;
                stackIn_70_1 = stackOut_68_1;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1;
                if (param0 == null) {
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
              throw fk.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_f = null;
        field_b = null;
        field_d = null;
        int var1 = 2;
    }

    gd(int param0, lc param1, lc param2, int param3) {
        ((gd) this).field_h = null;
        ((gd) this).field_c = 65000;
        ((gd) this).field_a = null;
        try {
            ((gd) this).field_h = param2;
            ((gd) this).field_c = param3;
            ((gd) this).field_g = param0;
            ((gd) this).field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "gd.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Show chat (<%0> unread messages)";
        field_f = "Play free version";
    }
}
