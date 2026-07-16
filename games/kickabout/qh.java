/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh {
    static String field_g;
    private int field_h;
    static String field_e;
    static long field_c;
    private int field_d;
    private ew field_f;
    static int field_b;
    static String field_a;
    private ew field_i;

    public static void b(int param0) {
        if (param0 != -1) {
            field_g = null;
        }
        field_a = null;
        field_g = null;
        field_e = null;
    }

    final boolean a(byte param0, int param1, int param2, byte[] param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        var5 = (Object) (Object) ((qh) this).field_i;
        synchronized (var5) {
          L0: {
            L1: {
              if (-1 < (param2 ^ -1)) {
                break L1;
              } else {
                if (param2 <= ((qh) this).field_d) {
                  L2: {
                    var6 = this.a(true, 16, param1, param3, param2) ? 1 : 0;
                    if (var6 == 0) {
                      var6 = this.a(false, 16, param1, param3, param2) ? 1 : 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (param0 == 66) {
                      break L3;
                    } else {
                      ((qh) this).field_h = -36;
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
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_44_0 = null;
            Object stackIn_45_0 = null;
            byte[] stackIn_50_0 = null;
            byte[] stackIn_51_0 = null;
            Object stackIn_53_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_49_0 = null;
            byte[] stackOut_50_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_44_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_52_0 = null;
            var18 = Kickabout.field_G;
            var3 = (Object) (Object) ((qh) this).field_i;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 + 6 * param0) <= ((qh) this).field_f.a(param1 + -65162)) {
                    ((qh) this).field_f.a((byte) 4, (long)(param0 * 6));
                    ((qh) this).field_f.a(6, 0, (byte) 93, id.field_u);
                    var4_int = (param1 & id.field_u[1] << 1517957576) + ((255 & id.field_u[0]) << -712151664) + (id.field_u[2] & 255);
                    var5 = (255 & id.field_u[5]) + (((255 & id.field_u[3]) << 328902928) + (id.field_u[4] << 1810700616 & 65280));
                    if (0 <= var4_int) {
                      if (((qh) this).field_d >= var4_int) {
                        if ((var5 ^ -1) < -1) {
                          if ((long)var5 <= ((qh) this).field_i.a(-76) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_49_0 = (byte[]) var6;
                                stackIn_50_0 = stackOut_49_0;
                                stackOut_50_0 = (byte[]) (Object) stackIn_50_0;
                                stackIn_51_0 = stackOut_50_0;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L2: {
                                    ((qh) this).field_i.a((byte) 4, (long)(520 * var5));
                                    var9 = var4_int + -var7;
                                    if (param0 > 65535) {
                                      L3: {
                                        var14 = 10;
                                        if (var9 > 510) {
                                          var9 = 510;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                      ((qh) this).field_i.a(var14 + var9, 0, (byte) 113, id.field_u);
                                      var13 = 255 & id.field_u[9];
                                      var12 = (id.field_u[8] & 255) + ((id.field_u[7] & 255) << 2087458600) + ((255 & id.field_u[6]) << -328254032);
                                      var10 = (16711680 & id.field_u[1] << -413209424) + (((id.field_u[0] & 255) << 1125560248) - (-(id.field_u[2] << -1682361976 & 65280) - (id.field_u[3] & 255)));
                                      var11 = (id.field_u[4] << 1867160552 & 65280) - -(255 & id.field_u[5]);
                                      break L2;
                                    } else {
                                      L4: {
                                        var14 = 8;
                                        if ((var9 ^ -1) < -513) {
                                          var9 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      ((qh) this).field_i.a(var14 + var9, 0, (byte) 116, id.field_u);
                                      var11 = (id.field_u[2] << -749531864 & 65280) + (255 & id.field_u[3]);
                                      var10 = (id.field_u[0] << 1897722952 & 65280) + (255 & id.field_u[1]);
                                      var13 = 255 & id.field_u[7];
                                      var12 = (id.field_u[4] << -234944880 & 16711680) - (-(65280 & id.field_u[5] << 1961718952) - (255 & id.field_u[6]));
                                      break L2;
                                    }
                                  }
                                  if (var10 == param0) {
                                    if (var8 == var11) {
                                      if (((qh) this).field_h == var13) {
                                        if (-1 >= (var12 ^ -1)) {
                                          if ((((qh) this).field_i.a(58) / 520L ^ -1L) <= ((long)var12 ^ -1L)) {
                                            var15 = var9 + var14;
                                            var8++;
                                            var5 = var12;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var15 <= var16) {
                                                continue L1;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = id.field_u[var16];
                                                var16++;
                                                continue L5;
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
                                        return null;
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
                stackOut_52_0 = null;
                stackIn_53_0 = stackOut_52_0;
                return (byte[]) (Object) stackIn_53_0;
              }
              return stackIn_51_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, tv param1) {
        int var2 = 0;
        tv var3 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        if (null == param1.field_g) {
          return;
        } else {
          L0: {
            L1: {
              if (0 != param1.field_j) {
                break L1;
              } else {
                if (-1 == (param1.field_p ^ -1)) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (vb.field_j <= var2) {
                break L0;
              } else {
                var3 = fu.field_b[var2];
                if ((var3.field_c ^ -1) == -3) {
                  if (var3.field_j == param1.field_j) {
                    if (var3.field_p == param1.field_p) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (param1.field_r != null) {
              ol.field_z = param1.field_c;
              mv.field_a = param1.field_q;
              nr.field_r = param1.field_d;
              qs.field_S = param1.field_r;
              break L3;
            } else {
              break L3;
            }
          }
          var2 = 50 % ((-10 - param0) / 54);
          ec.a(true, param1);
          return;
        }
    }

    private final boolean a(boolean param0, int param1, int param2, byte[] param3, int param4) {
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
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
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
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_62_0 = 0;
            var16 = Kickabout.field_G;
            var6 = (Object) (Object) ((qh) this).field_i;
            synchronized (var6) {
              try {
                L0: {
                  L1: {
                    if (!param0) {
                      var7_int = (int)((519L + ((qh) this).field_i.a(121)) / 520L);
                      if (0 == var7_int) {
                        var7_int = 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      if ((long)(6 + param2 * 6) <= ((qh) this).field_f.a(param1 ^ -115)) {
                        L2: {
                          ((qh) this).field_f.a((byte) 4, (long)(6 * param2));
                          ((qh) this).field_f.a(6, 0, (byte) 103, id.field_u);
                          var7_int = (255 & id.field_u[5]) + ((id.field_u[3] & 255) << 133634096) - -((id.field_u[4] & 255) << -232133400);
                          if ((var7_int ^ -1) >= -1) {
                            break L2;
                          } else {
                            if (((long)var7_int ^ -1L) < (((qh) this).field_i.a(107) / 520L ^ -1L)) {
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
                    id.field_u[0] = (byte)(param4 >> -721577328);
                    id.field_u[3] = (byte)(var7_int >> 1172355440);
                    id.field_u[4] = (byte)(var7_int >> 436222504);
                    id.field_u[5] = (byte)var7_int;
                    id.field_u[1] = (byte)(param4 >> 2047810440);
                    if (param1 == 16) {
                      break L3;
                    } else {
                      qh.a(-25);
                      break L3;
                    }
                  }
                  id.field_u[2] = (byte)param4;
                  ((qh) this).field_f.a((byte) 4, (long)(6 * param2));
                  ((qh) this).field_f.a(0, 56, 6, id.field_u);
                  var8 = 0;
                  var9 = 0;
                  L4: while (true) {
                    L5: {
                      if (var8 >= param4) {
                        break L5;
                      } else {
                        L6: {
                          var10 = 0;
                          if (!param0) {
                            break L6;
                          } else {
                            L7: {
                              ((qh) this).field_i.a((byte) 4, (long)(520 * var7_int));
                              if (param2 <= 65535) {
                                try {
                                  L8: {
                                    ((qh) this).field_i.a(8, 0, (byte) 118, id.field_u);
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
                                  var11 = (id.field_u[1] & 255) + (65280 & id.field_u[0] << -2084796664);
                                  var10 = (id.field_u[6] & 255) + (((id.field_u[5] & 255) << 1986438152) + (16711680 & id.field_u[4] << 1112670544));
                                  var13 = id.field_u[7] & 255;
                                  var12 = ((id.field_u[2] & 255) << -93967800) - -(id.field_u[3] & 255);
                                  break L7;
                                } else {
                                  break L5;
                                }
                              } else {
                                try {
                                  L10: {
                                    ((qh) this).field_i.a(10, 0, (byte) 104, id.field_u);
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
                                  var12 = ((id.field_u[4] & 255) << 1957197736) - -(255 & id.field_u[5]);
                                  var13 = id.field_u[9] & 255;
                                  var11 = (65280 & id.field_u[2] << -936734040) + ((255 & id.field_u[1]) << -2127776720) + (-16777216 & id.field_u[0] << 1165292792) + (id.field_u[3] & 255);
                                  var10 = ((255 & id.field_u[6]) << -418167056) + ((id.field_u[7] & 255) << -1211325400) - -(id.field_u[8] & 255);
                                  break L7;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L12: {
                              if (var11 != param2) {
                                break L12;
                              } else {
                                if (var12 != var9) {
                                  break L12;
                                } else {
                                  if (var13 != ((qh) this).field_h) {
                                    break L12;
                                  } else {
                                    L13: {
                                      if ((var10 ^ -1) > -1) {
                                        break L13;
                                      } else {
                                        if ((long)var10 <= ((qh) this).field_i.a(param1 + -117) / 520L) {
                                          break L6;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    stackOut_40_0 = 0;
                                    stackIn_41_0 = stackOut_40_0;
                                    stackOut_41_0 = stackIn_41_0;
                                    stackIn_42_0 = stackOut_41_0;
                                    return stackIn_42_0 != 0;
                                  }
                                }
                              }
                            }
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            stackOut_35_0 = stackIn_35_0;
                            stackIn_36_0 = stackOut_35_0;
                            return stackIn_36_0 != 0;
                          }
                        }
                        L14: {
                          if (var10 == 0) {
                            L15: {
                              param0 = false;
                              var10 = (int)((519L + ((qh) this).field_i.a(97)) / 520L);
                              if (var10 != 0) {
                                break L15;
                              } else {
                                var10++;
                                break L15;
                              }
                            }
                            if (var10 != var7_int) {
                              break L14;
                            } else {
                              var10++;
                              break L14;
                            }
                          } else {
                            break L14;
                          }
                        }
                        L16: {
                          if (-var8 + param4 < -513) {
                            break L16;
                          } else {
                            var10 = 0;
                            break L16;
                          }
                        }
                        L17: {
                          if (-65536 < param2) {
                            L18: {
                              id.field_u[3] = (byte)param2;
                              id.field_u[2] = (byte)(param2 >> -972193080);
                              id.field_u[1] = (byte)(param2 >> 1455599248);
                              id.field_u[5] = (byte)var9;
                              id.field_u[6] = (byte)(var10 >> 110837104);
                              id.field_u[4] = (byte)(var9 >> 465226248);
                              id.field_u[8] = (byte)var10;
                              id.field_u[0] = (byte)(param2 >> -1734809000);
                              id.field_u[7] = (byte)(var10 >> -255869240);
                              id.field_u[9] = (byte)((qh) this).field_h;
                              ((qh) this).field_i.a((byte) 4, (long)(520 * var7_int));
                              ((qh) this).field_i.a(0, 125, 10, id.field_u);
                              var11 = param4 - var8;
                              if (510 >= var11) {
                                break L18;
                              } else {
                                var11 = 510;
                                break L18;
                              }
                            }
                            ((qh) this).field_i.a(var8, param1 + 84, var11, param3);
                            var8 = var8 + var11;
                            break L17;
                          } else {
                            L19: {
                              id.field_u[4] = (byte)(var10 >> -1072376400);
                              id.field_u[3] = (byte)var9;
                              id.field_u[2] = (byte)(var9 >> -1390729208);
                              id.field_u[1] = (byte)param2;
                              id.field_u[0] = (byte)(param2 >> -1516296632);
                              id.field_u[7] = (byte)((qh) this).field_h;
                              id.field_u[6] = (byte)var10;
                              id.field_u[5] = (byte)(var10 >> -362958584);
                              ((qh) this).field_i.a((byte) 4, (long)(520 * var7_int));
                              ((qh) this).field_i.a(0, 76, 8, id.field_u);
                              var11 = -var8 + param4;
                              if ((var11 ^ -1) >= -513) {
                                break L19;
                              } else {
                                var11 = 512;
                                break L19;
                              }
                            }
                            ((qh) this).field_i.a(var8, 102, var11, param3);
                            var8 = var8 + var11;
                            break L17;
                          }
                        }
                        var7_int = var10;
                        var9++;
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

    public final String toString() {
        return "" + ((qh) this).field_h;
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        cf var5 = null;
        bc var6 = null;
        int var7 = 0;
        tf var8 = null;
        cf var9 = null;
        L0: {
          var7 = Kickabout.field_G;
          var8 = new tf();
          if (jh.field_Hb.field_Db.field_jb == null) {
            break L0;
          } else {
            jh.field_Hb.field_Db.field_jb.a(-17481, var8);
            break L0;
          }
        }
        L1: {
          var2 = mf.field_Gb;
          if ((var2 ^ -1) <= -1) {
            break L1;
          } else {
            var2 = 0;
            break L1;
          }
        }
        var3 = je.field_k;
        var4 = 5 - -(var2 * 18);
        L2: while (true) {
          L3: {
            if (jh.field_Hb.field_Gb.field_mb - (-15 + jh.field_Hb.field_Db.field_J) <= var4) {
              break L3;
            } else {
              if (pu.field_Db[var3] <= var2) {
                break L3;
              } else {
                var5 = (cf) (Object) var8.g(24009);
                L4: while (true) {
                  L5: {
                    if (var5 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (var5.field_yb != var2) {
                          break L6;
                        } else {
                          if (var5.field_Ab == var3) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var5 = (cf) (Object) var8.c(33);
                      continue L4;
                    }
                  }
                  L7: {
                    if (var5 != null) {
                      break L7;
                    } else {
                      var9 = cu.a(false, 0, var3, var2, false, false);
                      var5 = var9;
                      var9.a(true, 327, 5, var4, 16);
                      break L7;
                    }
                  }
                  jh.field_Hb.field_Db.a((byte) -109, (hd) (Object) var5);
                  var6 = bf.field_y.a(var2, (byte) 116, var3);
                  var4 += 18;
                  var2++;
                  if (var6 == null) {
                    var5.h((byte) 104);
                    continue L2;
                  } else {
                    var5.a((byte) 59, var6);
                    continue L2;
                  }
                }
              }
            }
          }
          var5 = (cf) (Object) var8.b((byte) 127);
          if (param0 >= 82) {
            L8: while (true) {
              if (var5 == null) {
                return;
              } else {
                var5.c(true);
                var5 = (cf) (Object) var8.b((byte) 127);
                continue L8;
              }
            }
          } else {
            return;
          }
        }
    }

    qh(int param0, ew param1, ew param2, int param3) {
        ((qh) this).field_d = 65000;
        ((qh) this).field_f = null;
        ((qh) this).field_i = null;
        ((qh) this).field_i = param1;
        ((qh) this).field_h = param0;
        ((qh) this).field_f = param2;
        ((qh) this).field_d = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Your search returned no results";
        field_a = "Checking";
        field_g = "Log in to browse the leagues.";
    }
}
