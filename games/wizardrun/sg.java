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
            int incrementValue$1 = 0;
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
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_54_0 = null;
            var18 = wizardrun.field_H;
            var3 = this.field_c;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(param1 * 6 + 6) <= this.field_d.b((byte) 79)) {
                    this.field_d.a((long)(6 * param1), (byte) 125);
                    this.field_d.a(0, wizardrun.field_O, 6, (byte) 47);
                    var4_int = (wizardrun.field_O[2] & 255) + (((255 & wizardrun.field_O[1]) << -1729355416) + (wizardrun.field_O[0] << 28238928 & 16711680));
                    var5 = (255 & wizardrun.field_O[5]) + (((255 & wizardrun.field_O[4]) << -1279817048) + (16711680 & wizardrun.field_O[3] << -11397584));
                    if (var4_int >= 0) {
                      if (this.field_e >= var4_int) {
                        if (0 < var5) {
                          if (((long)var5 ^ -1L) >= (this.field_c.b((byte) 79) / 520L ^ -1L)) {
                            L1: {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              if (param0) {
                                break L1;
                              } else {
                                this.field_e = 12;
                                break L1;
                              }
                            }
                            var8 = 0;
                            L2: while (true) {
                              if (var4_int <= var7) {
                                stackOut_51_0 = (byte[]) (var6);
                                stackIn_52_0 = stackOut_51_0;
                                stackOut_52_0 = (byte[]) ((Object) stackIn_52_0);
                                stackIn_53_0 = stackOut_52_0;
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L3: {
                                    this.field_c.a((long)(520 * var5), (byte) -99);
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
                                      this.field_c.a(0, wizardrun.field_O, var14 + var9, (byte) 47);
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
                                      this.field_c.a(0, wizardrun.field_O, var9 + var14, (byte) 47);
                                      var10 = ((255 & wizardrun.field_O[0]) << 1877585144) + (((255 & wizardrun.field_O[1]) << -1847174416) - (-(65280 & wizardrun.field_O[2] << -916029272) + -(255 & wizardrun.field_O[3])));
                                      var11 = (wizardrun.field_O[5] & 255) + ((255 & wizardrun.field_O[4]) << -1641334808);
                                      var12 = (wizardrun.field_O[8] & 255) + (((wizardrun.field_O[6] & 255) << -1501511184) - -((wizardrun.field_O[7] & 255) << -819758136));
                                      var13 = 255 & wizardrun.field_O[9];
                                      break L3;
                                    }
                                  }
                                  if (param1 == var10) {
                                    if (var11 == var8) {
                                      if (var13 == this.field_a) {
                                        if (0 <= var12) {
                                          if ((long)var12 <= this.field_c.b((byte) 79) / 520L) {
                                            var15 = var14 + var9;
                                            var8++;
                                            var5 = var12;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var15 <= var16) {
                                                continue L2;
                                              } else {
                                                incrementValue$1 = var7;
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
                        decompiledRegionSelector0 = 0;
                        break L0;
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
                return (byte[]) ((Object) stackIn_55_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_10_0);
              } else {
                return stackIn_53_0;
              }
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
            RuntimeException var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_7_0 = null;
            Object stackIn_12_0 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_6_0 = null;
            Object stackOut_11_0 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            var7 = wizardrun.field_H;
            try {
              L0: {
                try {
                  L1: {
                    var3 = (String) (cl.a(param1, -3264, "getcookies"));
                    var4 = tj.a(var3, -22710, ';');
                    var5 = param2;
                    L2: while (true) {
                      if (var5 >= var4.length) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var6 = var4[var5].indexOf('=');
                          if (var6 < 0) {
                            break L3;
                          } else {
                            if (var4[var5].substring(0, var6).trim().equals(param0)) {
                              stackOut_6_0 = var4[var5].substring(var6 + 1).trim();
                              stackIn_7_0 = stackOut_6_0;
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) (var3_ref2);
                stackOut_13_1 = new StringBuilder().append("sg.C(");
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param0 == null) {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param1 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_12_0);
            } else {
              return stackIn_7_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_a;
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
            field_b = (o[][]) null;
        }
        field_b = (o[][]) null;
    }

    private final boolean a(int param0, byte[] param1, int param2, boolean param3, boolean param4) {
        try {
            boolean discarded$1 = false;
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
            EOFException var14 = null;
            Throwable var15 = null;
            int var16 = 0;
            byte[] var17 = null;
            int stackIn_7_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_67_0 = 0;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            String stackIn_73_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_66_0 = 0;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            String stackOut_71_2 = null;
            var16 = wizardrun.field_H;
            try {
              var6_ref2 = this.field_c;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param4) {
                        break L1;
                      } else {
                        var17 = (byte[]) null;
                        discarded$1 = this.a((byte[]) null, 123, -51, -120);
                        break L1;
                      }
                    }
                    L2: {
                      if (!param3) {
                        var7_int = (int)((519L + this.field_c.b((byte) 79)) / 520L);
                        if (var7_int != 0) {
                          break L2;
                        } else {
                          var7_int = 1;
                          break L2;
                        }
                      } else {
                        if (((long)(6 + 6 * param0) ^ -1L) >= (this.field_d.b((byte) 79) ^ -1L)) {
                          L3: {
                            this.field_d.a((long)(6 * param0), (byte) 120);
                            this.field_d.a(0, wizardrun.field_O, 6, (byte) 47);
                            var7_int = (255 & wizardrun.field_O[5]) + (wizardrun.field_O[3] << 814664240 & 16711680) - -(65280 & wizardrun.field_O[4] << -1019985272);
                            if (-1 <= (var7_int ^ -1)) {
                              break L3;
                            } else {
                              if (((long)var7_int ^ -1L) < (this.field_c.b((byte) 79) / 520L ^ -1L)) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackOut_13_0 = stackIn_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        } else {
                          stackOut_6_0 = 0;
                          stackIn_7_0 = stackOut_6_0;
                          stackOut_7_0 = stackIn_7_0;
                          stackIn_8_0 = stackOut_7_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        }
                      }
                    }
                    wizardrun.field_O[3] = (byte)(var7_int >> 1870536624);
                    wizardrun.field_O[5] = (byte)var7_int;
                    wizardrun.field_O[2] = (byte)param2;
                    wizardrun.field_O[4] = (byte)(var7_int >> -1725480888);
                    wizardrun.field_O[0] = (byte)(param2 >> 314731984);
                    wizardrun.field_O[1] = (byte)(param2 >> 1385794728);
                    this.field_d.a((long)(param0 * 6), (byte) 67);
                    this.field_d.a(18729, wizardrun.field_O, 6, 0);
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
                                this.field_c.a((long)(520 * var7_int), (byte) -119);
                                if (65535 < param0) {
                                  try {
                                    L8: {
                                      this.field_c.a(0, wizardrun.field_O, 10, (byte) 47);
                                      decompiledRegionSelector0 = 0;
                                      break L8;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L9: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L9;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
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
                                      this.field_c.a(0, wizardrun.field_O, 8, (byte) 47);
                                      decompiledRegionSelector1 = 0;
                                      break L10;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L11: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L11;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
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
                                    if (var13 == this.field_a) {
                                      L13: {
                                        if (-1 < (var10 ^ -1)) {
                                          break L13;
                                        } else {
                                          if ((long)var10 > this.field_c.b((byte) 79) / 520L) {
                                            break L13;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      stackOut_40_0 = 0;
                                      stackIn_41_0 = stackOut_40_0;
                                      stackOut_41_0 = stackIn_41_0;
                                      stackIn_42_0 = stackOut_41_0;
                                      decompiledRegionSelector2 = 3;
                                      break L0;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              stackOut_34_0 = 0;
                              stackIn_35_0 = stackOut_34_0;
                              stackOut_35_0 = stackIn_35_0;
                              stackIn_36_0 = stackOut_35_0;
                              decompiledRegionSelector2 = 2;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                          L14: {
                            if (0 == var10) {
                              L15: {
                                param3 = false;
                                var10 = (int)((this.field_c.b((byte) 79) + 519L) / 520L);
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
                            if ((param2 - var8 ^ -1) >= -513) {
                              var10 = 0;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (-65536 > (param0 ^ -1)) {
                              L18: {
                                wizardrun.field_O[4] = (byte)(var9 >> -934648184);
                                wizardrun.field_O[0] = (byte)(param0 >> -471569160);
                                wizardrun.field_O[2] = (byte)(param0 >> -1825970200);
                                wizardrun.field_O[3] = (byte)param0;
                                wizardrun.field_O[7] = (byte)(var10 >> 969878024);
                                wizardrun.field_O[1] = (byte)(param0 >> 1350708976);
                                wizardrun.field_O[6] = (byte)(var10 >> -255664624);
                                wizardrun.field_O[8] = (byte)var10;
                                wizardrun.field_O[9] = (byte)this.field_a;
                                wizardrun.field_O[5] = (byte)var9;
                                this.field_c.a((long)(520 * var7_int), (byte) 47);
                                this.field_c.a(18729, wizardrun.field_O, 10, 0);
                                var11 = param2 - var8;
                                if ((var11 ^ -1) < -511) {
                                  var11 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_c.a(18729, param1, var11, var8);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                wizardrun.field_O[7] = (byte)this.field_a;
                                wizardrun.field_O[0] = (byte)(param0 >> -804502552);
                                wizardrun.field_O[5] = (byte)(var10 >> -749471256);
                                wizardrun.field_O[6] = (byte)var10;
                                wizardrun.field_O[3] = (byte)var9;
                                wizardrun.field_O[4] = (byte)(var10 >> 1158890864);
                                wizardrun.field_O[2] = (byte)(var9 >> -705985496);
                                wizardrun.field_O[1] = (byte)param0;
                                this.field_c.a((long)(var7_int * 520), (byte) -61);
                                this.field_c.a(18729, wizardrun.field_O, 8, 0);
                                var11 = param2 + -var8;
                                if ((var11 ^ -1) < -513) {
                                  var11 = 512;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              this.field_c.a(18729, param1, var11, var8);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L4;
                        }
                      }
                      stackOut_63_0 = 1;
                      stackIn_64_0 = stackOut_63_0;
                      stackOut_64_0 = stackIn_64_0;
                      stackIn_65_0 = stackOut_64_0;
                      decompiledRegionSelector2 = 4;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_66_0 = 0;
                  stackIn_67_0 = stackOut_66_0;
                  return stackIn_67_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_8_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_14_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_36_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_42_0 != 0;
                      } else {
                        return stackIn_65_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_70_0 = (RuntimeException) (var6_ref);
                stackOut_70_1 = new StringBuilder().append("sg.E(").append(param0).append(',');
                stackIn_72_0 = stackOut_70_0;
                stackIn_72_1 = stackOut_70_1;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                if (param1 == null) {
                  stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
                  stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
                  stackOut_72_2 = "null";
                  stackIn_73_0 = stackOut_72_0;
                  stackIn_73_1 = stackOut_72_1;
                  stackIn_73_2 = stackOut_72_2;
                  break L20;
                } else {
                  stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
                  stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
                  stackOut_71_2 = "{...}";
                  stackIn_73_0 = stackOut_71_0;
                  stackIn_73_1 = stackOut_71_1;
                  stackIn_73_2 = stackOut_71_2;
                  break L20;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var5 = this.field_c;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param2 > param3) {
                    break L2;
                  } else {
                    if (param3 > this.field_e) {
                      break L2;
                    } else {
                      L3: {
                        var6 = this.a(param1, param0, param3, true, true) ? 1 : 0;
                        if (var6 != 0) {
                          break L3;
                        } else {
                          var6 = this.a(param1, param0, param3, false, true) ? 1 : 0;
                          break L3;
                        }
                      }
                      stackOut_7_0 = var6;
                      stackIn_8_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                throw new IllegalArgumentException();
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5_ref);
            stackOut_11_1 = new StringBuilder().append("sg.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_8_0 != 0;
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    sg(int param0, si param1, si param2, int param3) {
        this.field_d = null;
        this.field_c = null;
        this.field_e = 65000;
        try {
            this.field_c = param1;
            this.field_e = param3;
            this.field_d = param2;
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "sg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
