/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kh {
    private nh field_d;
    static String field_b;
    static String field_f;
    static int[] field_e;
    private nh field_a;
    private int field_h;
    private int field_g;
    static String field_c;

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        int var1 = a.field_r[0];
        if (param0 != 2) {
            field_e = null;
        }
        for (var2 = 1; a.field_r.length > var2; var2++) {
            var3 = a.field_r[var2];
            an.a(hb.field_Vb, var2 << -461235580, hb.field_Vb, var1, var3);
            var1 = var1 + var3;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        vi.field_A.field_n = 0;
        vi.field_A.a(true, 12);
        vi.field_A.a(gg.field_A.nextInt(), false);
        if (param0 >= -17) {
          return;
        } else {
          vi.field_A.a(gg.field_A.nextInt(), false);
          vi.field_A.a(true, param1);
          vi.field_A.a(true, param3);
          vi.field_A.d(-1, param2);
          vi.field_A.a(ea.field_k, uk.field_p, true);
          we.field_b.f(18, -4);
          int fieldTemp$1 = we.field_b.field_n + 1;
          we.field_b.field_n = we.field_b.field_n + 1;
          var4 = fieldTemp$1;
          we.field_b.a(false, vi.field_A.field_n, vi.field_A.field_r, 0);
          we.field_b.b(we.field_b.field_n - var4, true);
          return;
        }
    }

    public final String toString() {
        return "" + ((kh) this).field_h;
    }

    final boolean a(byte param0, byte[] param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        var5 = (Object) (Object) ((kh) this).field_a;
        synchronized (var5) {
          L0: {
            L1: {
              if (param3 < 0) {
                break L1;
              } else {
                if (param3 > ((kh) this).field_g) {
                  break L1;
                } else {
                  L2: {
                    if (param0 == 43) {
                      break L2;
                    } else {
                      boolean discarded$3 = kh.a(')', -33);
                      break L2;
                    }
                  }
                  L3: {
                    var6 = this.a(true, (byte) -108, param2, param3, param1) ? 1 : 0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      var6 = this.a(false, (byte) -43, param2, param3, param1) ? 1 : 0;
                      break L3;
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
    }

    private final boolean a(boolean param0, byte param1, int param2, int param3, byte[] param4) {
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
            int stackIn_11_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_18_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_67_0 = 0;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_2_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_66_0 = 0;
            var16 = client.field_A ? 1 : 0;
            var6 = (Object) (Object) ((kh) this).field_a;
            synchronized (var6) {
              try {
                L0: {
                  if (param1 <= -39) {
                    L1: {
                      if (param0) {
                        if ((((kh) this).field_d.b(37) ^ -1L) > ((long)(6 + param2 * 6) ^ -1L)) {
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackOut_11_0 = stackIn_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        } else {
                          L2: {
                            ((kh) this).field_d.a((long)(6 * param2), (byte) -109);
                            ((kh) this).field_d.a(0, jb.field_b, 741, 6);
                            var7_int = (255 & jb.field_b[5]) + (((255 & jb.field_b[3]) << -1816350064) - -(jb.field_b[4] << 1510451016 & 65280));
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if ((((kh) this).field_a.b(-94) / 520L ^ -1L) > ((long)var7_int ^ -1L)) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          stackOut_17_0 = stackIn_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        }
                      } else {
                        var7_int = (int)((((kh) this).field_a.b(74) + 519L) / 520L);
                        if (-1 != (var7_int ^ -1)) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    jb.field_b[0] = (byte)(param3 >> 1086853712);
                    jb.field_b[2] = (byte)param3;
                    jb.field_b[5] = (byte)var7_int;
                    jb.field_b[1] = (byte)(param3 >> 1683129256);
                    jb.field_b[3] = (byte)(var7_int >> -1965896624);
                    jb.field_b[4] = (byte)(var7_int >> 178310472);
                    ((kh) this).field_d.a((long)(6 * param2), (byte) -109);
                    ((kh) this).field_d.a(jb.field_b, (byte) 118, 0, 6);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if ((var8 ^ -1) <= (param3 ^ -1)) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (param0) {
                              L6: {
                                ((kh) this).field_a.a((long)(520 * var7_int), (byte) -109);
                                if ((param2 ^ -1) >= -65536) {
                                  try {
                                    L7: {
                                      ((kh) this).field_a.a(0, jb.field_b, 741, 8);
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
                                    var10 = (255 & jb.field_b[6]) + (16711680 & jb.field_b[4] << 392227152) + ((255 & jb.field_b[5]) << -1090035704);
                                    var13 = 255 & jb.field_b[7];
                                    var12 = (255 & jb.field_b[3]) + ((jb.field_b[2] & 255) << 1475077992);
                                    var11 = (255 & jb.field_b[1]) + ((255 & jb.field_b[0]) << -1042807800);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((kh) this).field_a.a(0, jb.field_b, 741, 10);
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
                                    var12 = ((jb.field_b[4] & 255) << -405989848) + (jb.field_b[5] & 255);
                                    var13 = 255 & jb.field_b[9];
                                    var11 = (255 & jb.field_b[3]) + (-16777216 & jb.field_b[0] << 127232344) - -((jb.field_b[1] & 255) << -482871280) + ((jb.field_b[2] & 255) << -822689368);
                                    var10 = ((255 & jb.field_b[6]) << 324120208) + (65280 & jb.field_b[7] << -1788207480) - -(jb.field_b[8] & 255);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (var11 != param2) {
                                  break L11;
                                } else {
                                  if ((var9 ^ -1) != (var12 ^ -1)) {
                                    break L11;
                                  } else {
                                    if ((var13 ^ -1) != (((kh) this).field_h ^ -1)) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if ((var10 ^ -1) > -1) {
                                          break L12;
                                        } else {
                                          if ((long)var10 <= ((kh) this).field_a.b(-103) / 520L) {
                                            break L5;
                                          } else {
                                            break L12;
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
                                param0 = false;
                                var10 = (int)((((kh) this).field_a.b(-121) + 519L) / 520L);
                                if ((var10 ^ -1) != -1) {
                                  break L14;
                                } else {
                                  var10++;
                                  break L14;
                                }
                              }
                              if (var7_int != var10) {
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
                            if (-513 > (-var8 + param3 ^ -1)) {
                              break L15;
                            } else {
                              var10 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if ((param2 ^ -1) < -65536) {
                              L17: {
                                jb.field_b[3] = (byte)param2;
                                jb.field_b[1] = (byte)(param2 >> 531261328);
                                jb.field_b[8] = (byte)var10;
                                jb.field_b[6] = (byte)(var10 >> -948474160);
                                jb.field_b[4] = (byte)(var9 >> 1676966632);
                                jb.field_b[9] = (byte)((kh) this).field_h;
                                jb.field_b[0] = (byte)(param2 >> -2082895624);
                                jb.field_b[5] = (byte)var9;
                                jb.field_b[7] = (byte)(var10 >> -2143680568);
                                jb.field_b[2] = (byte)(param2 >> -1189518136);
                                ((kh) this).field_a.a((long)(var7_int * 520), (byte) -109);
                                ((kh) this).field_a.a(jb.field_b, (byte) 96, 0, 10);
                                var11 = param3 + -var8;
                                if ((var11 ^ -1) < -511) {
                                  var11 = 510;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((kh) this).field_a.a(param4, (byte) 126, var8, var11);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                jb.field_b[0] = (byte)(param2 >> -1704945272);
                                jb.field_b[7] = (byte)((kh) this).field_h;
                                jb.field_b[3] = (byte)var9;
                                jb.field_b[5] = (byte)(var10 >> -1400891000);
                                jb.field_b[4] = (byte)(var10 >> 1717337616);
                                jb.field_b[1] = (byte)param2;
                                jb.field_b[2] = (byte)(var9 >> -906719320);
                                jb.field_b[6] = (byte)var10;
                                ((kh) this).field_a.a((long)(var7_int * 520), (byte) -109);
                                ((kh) this).field_a.a(jb.field_b, (byte) 124, 0, 8);
                                var11 = param3 - var8;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((kh) this).field_a.a(param4, (byte) 126, var8, var11);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L3;
                        }
                      }
                      stackOut_63_0 = 1;
                      stackIn_64_0 = stackOut_63_0;
                      stackOut_64_0 = stackIn_64_0;
                      stackIn_65_0 = stackOut_64_0;
                      break L0;
                    }
                  } else {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    stackOut_3_0 = stackIn_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    return stackIn_4_0 != 0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                stackOut_66_0 = 0;
                stackIn_67_0 = stackOut_66_0;
                return stackIn_67_0 != 0;
              }
              return stackIn_65_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        field_e = null;
        field_f = null;
        if (param0 != -1643605936) {
            kh.b(15);
        }
    }

    final static boolean a(char param0, int param1) {
        L0: {
          if (param0 < 32) {
            break L0;
          } else {
            if (param0 <= 126) {
              return true;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 < 160) {
            break L1;
          } else {
            if (255 < param0) {
              break L1;
            } else {
              return true;
            }
          }
        }
        if (8364 != param0) {
          if (param0 != 338) {
            if (param0 != 8212) {
              if (339 != param0) {
                if (param0 != 376) {
                  if (param1 != 8212) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(boolean param0) {
        int var2 = client.field_A ? 1 : 0;
        int var1 = 0;
        if (!param0) {
            field_f = null;
        }
        while (ic.field_c > var1) {
            pd.field_g[var1] = null;
            var1++;
        }
        ic.field_c = 0;
    }

    final byte[] a(int param0, byte param1) {
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
            Object stackIn_7_0 = null;
            Object stackIn_8_0 = null;
            Object stackIn_13_0 = null;
            Object stackIn_14_0 = null;
            Object stackIn_25_0 = null;
            Object stackIn_26_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_24_0 = null;
            Object stackOut_25_0 = null;
            Object stackOut_12_0 = null;
            Object stackOut_13_0 = null;
            Object stackOut_6_0 = null;
            Object stackOut_7_0 = null;
            Object stackOut_56_0 = null;
            var18 = client.field_A ? 1 : 0;
            var3 = (Object) (Object) ((kh) this).field_a;
            synchronized (var3) {
              try {
                L0: {
                  if (((long)(6 + param0 * 6) ^ -1L) >= (((kh) this).field_d.b(103) ^ -1L)) {
                    ((kh) this).field_d.a((long)(6 * param0), (byte) -109);
                    ((kh) this).field_d.a(0, jb.field_b, 741, 6);
                    var4_int = (jb.field_b[2] & 255) + (jb.field_b[1] << 253972520 & 65280) + (jb.field_b[0] << 1692978896 & 16711680);
                    if (param1 > 38) {
                      var5 = (16711680 & jb.field_b[3] << 1493935856) - (-((jb.field_b[4] & 255) << 1799068744) - (255 & jb.field_b[5]));
                      if (-1 >= (var4_int ^ -1)) {
                        if (((kh) this).field_g >= var4_int) {
                          if (0 < var5) {
                            if ((long)var5 <= ((kh) this).field_a.b(-128) / 520L) {
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
                                  if (0 != var5) {
                                    L2: {
                                      ((kh) this).field_a.a((long)(var5 * 520), (byte) -109);
                                      var9 = -var7 + var4_int;
                                      if (-65536 > (param0 ^ -1)) {
                                        L3: {
                                          if ((var9 ^ -1) >= -511) {
                                            break L3;
                                          } else {
                                            var9 = 510;
                                            break L3;
                                          }
                                        }
                                        var14 = 10;
                                        ((kh) this).field_a.a(0, jb.field_b, 741, var9 - -var14);
                                        var11 = ((255 & jb.field_b[4]) << 818328936) + (jb.field_b[5] & 255);
                                        var12 = ((jb.field_b[6] & 255) << 813250864) + (jb.field_b[7] << 422628680 & 65280) - -(jb.field_b[8] & 255);
                                        var13 = jb.field_b[9] & 255;
                                        var10 = (-16777216 & jb.field_b[0] << -1576939336) + ((jb.field_b[1] & 255) << -1643605936) + ((jb.field_b[2] & 255) << 1367300264) + (255 & jb.field_b[3]);
                                        break L2;
                                      } else {
                                        L4: {
                                          var14 = 8;
                                          if (512 < var9) {
                                            var9 = 512;
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        }
                                        ((kh) this).field_a.a(0, jb.field_b, 741, var14 + var9);
                                        var12 = (jb.field_b[4] << 1334482960 & 16711680) + (jb.field_b[5] << -1069089528 & 65280) - -(255 & jb.field_b[6]);
                                        var11 = (255 & jb.field_b[3]) + ((jb.field_b[2] & 255) << 1055080456);
                                        var13 = jb.field_b[7] & 255;
                                        var10 = (jb.field_b[1] & 255) + (65280 & jb.field_b[0] << -1366805240);
                                        break L2;
                                      }
                                    }
                                    if (var10 == param0) {
                                      if (var8 == var11) {
                                        if (((kh) this).field_h == var13) {
                                          if ((var12 ^ -1) <= -1) {
                                            if (((kh) this).field_a.b(55) / 520L >= (long)var12) {
                                              var15 = var14 - -var9;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (var15 <= var16) {
                                                  var8++;
                                                  var5 = var12;
                                                  continue L1;
                                                } else {
                                                  int incrementValue$1 = var7;
                                                  var7++;
                                                  var6[incrementValue$1] = jb.field_b[var16];
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
                                          return null;
                                        }
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    stackOut_24_0 = null;
                                    stackIn_25_0 = stackOut_24_0;
                                    stackOut_25_0 = stackIn_25_0;
                                    stackIn_26_0 = stackOut_25_0;
                                    return (byte[]) (Object) stackIn_26_0;
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
                          stackOut_12_0 = null;
                          stackIn_13_0 = stackOut_12_0;
                          stackOut_13_0 = stackIn_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          return (byte[]) (Object) stackIn_14_0;
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
                    return null;
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

    kh(int param0, nh param1, nh param2, int param3) {
        ((kh) this).field_d = null;
        ((kh) this).field_a = null;
        ((kh) this).field_g = 65000;
        ((kh) this).field_d = param2;
        ((kh) this).field_a = param1;
        ((kh) this).field_g = param3;
        ((kh) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Connection timed out. Please try using a different server.";
        field_b = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_e = new int[4];
        field_c = "Play the game without logging in just yet";
    }
}
