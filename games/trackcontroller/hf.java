/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf {
    private int field_c;
    static le field_f;
    private il field_g;
    private int field_e;
    private il field_h;
    static String field_a;
    static byte[][] field_b;
    static int field_d;

    final static void a(oh param0, int param1, int param2, int param3, boolean param4, int param5, int param6, oh param7, int param8, int param9, na param10, int param11, int param12, int param13, na param14, int param15, int param16, int param17, na param18, int param19, int param20) {
        ha.a(param7, 2, param2, param0);
        vb.a(param1, param16, -74, param11, param5);
        jk.a(param20, -114, param12);
        uh.a(param8, param10, param17, -97, param13, param14);
        we.a(param19, 104, param15, param18);
        he.a(param9, 0, param3, param6);
        if (param4) {
            Object var22 = null;
            hf.a((oh) null, 9, -29, 58, false, 115, 108, (oh) null, 122, -19, (na) null, -127, 114, -93, (na) null, -79, 80, -6, (na) null, 93, 114);
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_15_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_14_0 = 0;
            if (ne.field_a.field_k < param0) {
              if (null == r.field_i) {
                return false;
              } else {
                try {
                  L0: {
                    L1: {
                      if (!param1) {
                        break L1;
                      } else {
                        hf.a(99);
                        break L1;
                      }
                    }
                    var2_int = r.field_i.b(0);
                    if (var2_int <= 0) {
                      L2: {
                        if ((var2_int ^ -1) > -1) {
                          break L2;
                        } else {
                          if (30000L >= bj.b(-21676)) {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      lj.a((byte) 113);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        if (var2_int <= param0 + -ne.field_a.field_k) {
                          break L3;
                        } else {
                          var2_int = -ne.field_a.field_k + param0;
                          break L3;
                        }
                      }
                      r.field_i.a(ne.field_a.field_j, 0, var2_int, ne.field_a.field_k);
                      he.field_a = qg.a(false);
                      ne.field_a.field_k = ne.field_a.field_k + var2_int;
                      if (ne.field_a.field_k < param0) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      } else {
                        ne.field_a.field_k = 0;
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    lj.a((byte) 117);
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return false;
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            Object stackIn_11_0 = null;
            Object stackIn_12_0 = null;
            Object stackIn_17_0 = null;
            Object stackIn_18_0 = null;
            Object stackIn_46_0 = null;
            Object stackIn_47_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_45_0 = null;
            Object stackOut_46_0 = null;
            Object stackOut_16_0 = null;
            Object stackOut_17_0 = null;
            Object stackOut_10_0 = null;
            Object stackOut_11_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_54_0 = null;
            var18 = TrackController.field_F ? 1 : 0;
            var3 = (Object) (Object) ((hf) this).field_h;
            synchronized (var3) {
              try {
                L0: {
                  if (((long)(6 + param1 * 6) ^ -1L) >= (((hf) this).field_g.a((byte) -88) ^ -1L)) {
                    L1: {
                      ((hf) this).field_g.a((long)(6 * param1), true);
                      ((hf) this).field_g.a(fh.field_a, 6, 0, 0);
                      if (param0 < -89) {
                        break L1;
                      } else {
                        field_f = null;
                        break L1;
                      }
                    }
                    var4_int = (65280 & fh.field_a[1] << 509728840) + ((fh.field_a[0] & 255) << -776253648) - -(255 & fh.field_a[2]);
                    var5 = (fh.field_a[3] << -1039623664 & 16711680) - (-(65280 & fh.field_a[4] << 268824872) - (fh.field_a[5] & 255));
                    if (0 <= var4_int) {
                      if (var4_int <= ((hf) this).field_e) {
                        if ((var5 ^ -1) < -1) {
                          if (((hf) this).field_h.a((byte) -128) / 520L >= (long)var5) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_51_0 = (byte[]) var6;
                                stackIn_52_0 = stackOut_51_0;
                                stackOut_52_0 = (byte[]) (Object) stackIn_52_0;
                                stackIn_53_0 = stackOut_52_0;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L3: {
                                    ((hf) this).field_h.a((long)(var5 * 520), true);
                                    var9 = -var7 + var4_int;
                                    if (param1 > 65535) {
                                      L4: {
                                        if ((var9 ^ -1) < -511) {
                                          var9 = 510;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var14 = 10;
                                      ((hf) this).field_h.a(fh.field_a, var14 + var9, 0, 0);
                                      var10 = (255 & fh.field_a[3]) + (((fh.field_a[2] & 255) << 1666776616) + (((255 & fh.field_a[0]) << 1109169400) + (fh.field_a[1] << 223088560 & 16711680)));
                                      var11 = (fh.field_a[5] & 255) + ((fh.field_a[4] & 255) << 204116040);
                                      var13 = fh.field_a[9] & 255;
                                      var12 = ((255 & fh.field_a[7]) << -710377912) + (fh.field_a[6] << -122237360 & 16711680) - -(fh.field_a[8] & 255);
                                      break L3;
                                    } else {
                                      L5: {
                                        if ((var9 ^ -1) < -513) {
                                          var9 = 512;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      var14 = 8;
                                      ((hf) this).field_h.a(fh.field_a, var14 + var9, 0, 0);
                                      var12 = (fh.field_a[6] & 255) + ((fh.field_a[4] & 255) << 204365072) + (65280 & fh.field_a[5] << 1903664392);
                                      var11 = (fh.field_a[3] & 255) + ((255 & fh.field_a[2]) << -596885400);
                                      var13 = 255 & fh.field_a[7];
                                      var10 = ((fh.field_a[0] & 255) << 1376126728) + (fh.field_a[1] & 255);
                                      break L3;
                                    }
                                  }
                                  if (var10 == param1) {
                                    if (var8 == var11) {
                                      if (((hf) this).field_c == var13) {
                                        if (var12 >= 0) {
                                          if ((long)var12 <= ((hf) this).field_h.a((byte) -88) / 520L) {
                                            var15 = var9 + var14;
                                            var8++;
                                            var5 = var12;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var16 >= var15) {
                                                continue L2;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = fh.field_a[var16];
                                                var16++;
                                                continue L6;
                                              }
                                            }
                                          } else {
                                            stackOut_45_0 = null;
                                            stackIn_46_0 = stackOut_45_0;
                                            stackOut_46_0 = stackIn_46_0;
                                            stackIn_47_0 = stackOut_46_0;
                                            return (byte[]) (Object) stackIn_47_0;
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

    public final String toString() {
        return "" + ((hf) this).field_c;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 6) {
            Object var2 = null;
            hf.a((oh) null, 27, 98, -128, true, -24, 31, (oh) null, 112, -78, (na) null, -60, 114, 126, (na) null, -28, 7, 29, (na) null, -35, -108);
        }
        field_a = null;
        field_f = null;
    }

    private final boolean a(byte[] param0, int param1, int param2, boolean param3, boolean param4) {
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
            int stackIn_10_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_16_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_43_0 = 0;
            il stackIn_58_0 = null;
            long stackIn_58_1 = 0L;
            il stackIn_59_0 = null;
            long stackIn_59_1 = 0L;
            il stackIn_60_0 = null;
            long stackIn_60_1 = 0L;
            int stackIn_60_2 = 0;
            int stackIn_66_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_69_0 = 0;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
            il stackOut_57_0 = null;
            long stackOut_57_1 = 0L;
            il stackOut_59_0 = null;
            long stackOut_59_1 = 0L;
            int stackOut_59_2 = 0;
            il stackOut_58_0 = null;
            long stackOut_58_1 = 0L;
            int stackOut_58_2 = 0;
            int stackOut_65_0 = 0;
            int stackOut_66_0 = 0;
            int stackOut_68_0 = 0;
            int stackOut_2_0 = 0;
            var16 = TrackController.field_F ? 1 : 0;
            var6 = (Object) (Object) ((hf) this).field_h;
            synchronized (var6) {
              if (!param4) {
                try {
                  L0: {
                    L1: {
                      if (param3) {
                        if (((long)(6 * param1 + 6) ^ -1L) >= (((hf) this).field_g.a((byte) -95) ^ -1L)) {
                          L2: {
                            ((hf) this).field_g.a((long)(6 * param1), true);
                            ((hf) this).field_g.a(fh.field_a, 6, 0, 0);
                            var7_int = ((fh.field_a[4] & 255) << 455696680) + ((16711680 & fh.field_a[3] << 1916514320) - -(255 & fh.field_a[5]));
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if ((long)var7_int > ((hf) this).field_h.a((byte) -77) / 520L) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackOut_16_0 = stackIn_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0 != 0;
                        } else {
                          stackOut_9_0 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          stackOut_10_0 = stackIn_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0 != 0;
                        }
                      } else {
                        var7_int = (int)((((hf) this).field_h.a((byte) -106) + 519L) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    fh.field_a[3] = (byte)(var7_int >> -1023648016);
                    fh.field_a[1] = (byte)(param2 >> -121050648);
                    fh.field_a[0] = (byte)(param2 >> -504638736);
                    fh.field_a[4] = (byte)(var7_int >> -769948184);
                    fh.field_a[2] = (byte)param2;
                    fh.field_a[5] = (byte)var7_int;
                    ((hf) this).field_g.a((long)(param1 * 6), true);
                    ((hf) this).field_g.a(6, -1, fh.field_a, 0);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (param2 <= var8) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (param3) {
                              L6: {
                                ((hf) this).field_h.a((long)(520 * var7_int), true);
                                if (65535 < param1) {
                                  try {
                                    L7: {
                                      ((hf) this).field_h.a(fh.field_a, 10, 0, 0);
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
                                    var11 = ((fh.field_a[1] & 255) << 1735380816) + (-16777216 & fh.field_a[0] << -695224840) - -((255 & fh.field_a[2]) << -353987992) - -(255 & fh.field_a[3]);
                                    var12 = (fh.field_a[4] << -794284024 & 65280) + (fh.field_a[5] & 255);
                                    var10 = ((255 & fh.field_a[6]) << -1148007152) + (((fh.field_a[7] & 255) << 139466824) + (fh.field_a[8] & 255));
                                    var13 = 255 & fh.field_a[9];
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((hf) this).field_h.a(fh.field_a, 8, 0, 0);
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
                                    var12 = (255 & fh.field_a[3]) + ((255 & fh.field_a[2]) << -246513720);
                                    var13 = 255 & fh.field_a[7];
                                    var11 = (fh.field_a[0] << 1141212360 & 65280) - -(255 & fh.field_a[1]);
                                    var10 = (255 & fh.field_a[6]) + (16711680 & fh.field_a[4] << 719778640) + (fh.field_a[5] << -1857596568 & 65280);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (param1 != var11) {
                                  break L11;
                                } else {
                                  if (var9 != var12) {
                                    break L11;
                                  } else {
                                    if (var13 != ((hf) this).field_c) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (-1 < (var10 ^ -1)) {
                                          break L12;
                                        } else {
                                          if (((long)var10 ^ -1L) < (((hf) this).field_h.a((byte) -102) / 520L ^ -1L)) {
                                            break L12;
                                          } else {
                                            break L5;
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
                              break L5;
                            }
                          }
                          L13: {
                            if (var10 != 0) {
                              break L13;
                            } else {
                              L14: {
                                param3 = false;
                                var10 = (int)((519L + ((hf) this).field_h.a((byte) -104)) / 520L);
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
                            }
                          }
                          L15: {
                            if (512 < param2 - var8) {
                              break L15;
                            } else {
                              var10 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (param1 > 65535) {
                              L17: {
                                fh.field_a[2] = (byte)(param1 >> 1521718472);
                                fh.field_a[7] = (byte)(var10 >> 2100315976);
                                fh.field_a[4] = (byte)(var9 >> -764280856);
                                fh.field_a[8] = (byte)var10;
                                fh.field_a[5] = (byte)var9;
                                fh.field_a[9] = (byte)((hf) this).field_c;
                                fh.field_a[0] = (byte)(param1 >> 1520875544);
                                fh.field_a[6] = (byte)(var10 >> -1160282096);
                                fh.field_a[1] = (byte)(param1 >> -1827942928);
                                fh.field_a[3] = (byte)param1;
                                stackOut_57_0 = ((hf) this).field_h;
                                stackOut_57_1 = (long)(520 * var7_int);
                                stackIn_59_0 = stackOut_57_0;
                                stackIn_59_1 = stackOut_57_1;
                                stackIn_58_0 = stackOut_57_0;
                                stackIn_58_1 = stackOut_57_1;
                                if (param4) {
                                  stackOut_59_0 = (il) (Object) stackIn_59_0;
                                  stackOut_59_1 = stackIn_59_1;
                                  stackOut_59_2 = 0;
                                  stackIn_60_0 = stackOut_59_0;
                                  stackIn_60_1 = stackOut_59_1;
                                  stackIn_60_2 = stackOut_59_2;
                                  break L17;
                                } else {
                                  stackOut_58_0 = (il) (Object) stackIn_58_0;
                                  stackOut_58_1 = stackIn_58_1;
                                  stackOut_58_2 = 1;
                                  stackIn_60_0 = stackOut_58_0;
                                  stackIn_60_1 = stackOut_58_1;
                                  stackIn_60_2 = stackOut_58_2;
                                  break L17;
                                }
                              }
                              L18: {
                                ((il) (Object) stackIn_60_0).a(stackIn_60_1, stackIn_60_2 != 0);
                                ((hf) this).field_h.a(10, -1, fh.field_a, 0);
                                var11 = -var8 + param2;
                                if (510 < var11) {
                                  var11 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((hf) this).field_h.a(var11, -1, param0, var8);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L19: {
                                fh.field_a[1] = (byte)param1;
                                fh.field_a[6] = (byte)var10;
                                fh.field_a[3] = (byte)var9;
                                fh.field_a[2] = (byte)(var9 >> -711057368);
                                fh.field_a[5] = (byte)(var10 >> 165541832);
                                fh.field_a[4] = (byte)(var10 >> -925642736);
                                fh.field_a[7] = (byte)((hf) this).field_c;
                                fh.field_a[0] = (byte)(param1 >> -2058642648);
                                ((hf) this).field_h.a((long)(var7_int * 520), true);
                                ((hf) this).field_h.a(8, -1, fh.field_a, 0);
                                var11 = -var8 + param2;
                                if (-513 > (var11 ^ -1)) {
                                  var11 = 512;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              ((hf) this).field_h.a(var11, -1, param0, var8);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L3;
                        }
                      }
                      stackOut_65_0 = 1;
                      stackIn_66_0 = stackOut_65_0;
                      stackOut_66_0 = stackIn_66_0;
                      stackIn_67_0 = stackOut_66_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_68_0 = 0;
                  stackIn_69_0 = stackOut_68_0;
                  return stackIn_69_0 != 0;
                }
                return stackIn_67_0 != 0;
              } else {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                return stackIn_3_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    hf(int param0, il param1, il param2, int param3) {
        ((hf) this).field_g = null;
        ((hf) this).field_e = 65000;
        ((hf) this).field_h = null;
        ((hf) this).field_e = param3;
        ((hf) this).field_g = param2;
        ((hf) this).field_h = param1;
        ((hf) this).field_c = param0;
    }

    final boolean a(int param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        var5_ref = (Object) (Object) ((hf) this).field_h;
        synchronized (var5_ref) {
          L0: {
            L1: {
              if (param3 < 0) {
                break L1;
              } else {
                if (param3 > ((hf) this).field_e) {
                  break L1;
                } else {
                  if (param0 == -1023648016) {
                    L2: {
                      var6 = this.a(param2, param1, param3, true, false) ? 1 : 0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        var6 = this.a(param2, param1, param3, false, false) ? 1 : 0;
                        break L2;
                      }
                    }
                    stackOut_10_0 = var6;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  }
                }
              }
            }
            throw new IllegalArgumentException();
          }
        }
        return stackIn_11_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Email is valid";
        field_f = new le();
        field_b = new byte[50][];
    }
}
