/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ik {
    private int field_e;
    static bb field_d;
    private ge field_g;
    private ge field_c;
    private int field_a;
    static he[] field_f;
    static nh field_b;
    static String field_h;

    public static void a(int param0) {
        boolean discarded$0 = false;
        field_f = null;
        if (param0 != 0) {
            String var2 = (String) null;
            discarded$0 = ik.a((String) null, (byte) -116);
        }
        field_h = null;
        field_b = null;
        field_d = null;
    }

    final boolean a(byte param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
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
                  if (0 > param1) {
                    break L2;
                  } else {
                    if (this.field_e < param1) {
                      break L2;
                    } else {
                      L3: {
                        var6 = -74 % ((23 - param0) / 56);
                        var7 = this.a(param3, (byte) -15, param2, true, param1) ? 1 : 0;
                        if (var7 != 0) {
                          break L3;
                        } else {
                          var7 = this.a(param3, (byte) -15, param2, false, param1) ? 1 : 0;
                          break L3;
                        }
                      }
                      stackOut_7_0 = var7;
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
            stackOut_11_1 = new StringBuilder().append("ik.C(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 == 11755) {
            break L0;
          } else {
            field_d = (bb) null;
            break L0;
          }
        }
        if (0 > vb.field_n) {
          return;
        } else {
          L1: {
            var3 = param1 - 135;
            var4 = -35 + param2;
            var5 = 256;
            if (vb.field_n < 75) {
              var5 = (vb.field_n << 931841896) / 75;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (200 >= vb.field_n) {
              break L2;
            } else {
              var5 = (250 - vb.field_n << 406487016) / 50;
              break L2;
            }
          }
          L3: {
            aj.a(bb.field_f, (byte) 91);
            uc.b();
            wj.c();
            ah.g((byte) -104);
            if (256 <= var5) {
              break L3;
            } else {
              wj.d(0, 0, wj.field_k, wj.field_c, 0, -var5 + 256);
              break L3;
            }
          }
          L4: {
            cl.d((byte) -106);
            if (150 <= vb.field_n) {
              ji.field_b.e(var3 - -15, var4 - -10, var5);
              break L4;
            } else {
              bb.field_f.b(var3, var4);
              break L4;
            }
          }
          L5: {
            var6 = -125 + vb.field_n;
            if (var6 <= 0) {
              break L5;
            } else {
              if ((var6 ^ -1) <= -51) {
                break L5;
              } else {
                if ((var6 ^ -1) > -21) {
                  var7 = var6 * 256 / 20;
                  vh.field_f.a(var3, var4, var7);
                  break L5;
                } else {
                  if (30 > var6) {
                    vh.field_f.a(var3, var4, 256);
                    break L5;
                  } else {
                    var7 = (-(256 * var6) + 12800) / 20;
                    vh.field_f.a(var3, var4, var7);
                    break L5;
                  }
                }
              }
            }
          }
          L6: {
            var6 = vb.field_n - 140;
            if (0 < var6) {
              L7: {
                var7 = 256;
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              vb.field_s.e(15 + var3, 10 + var4, var5 * var7 >> 1190765672);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    public final String toString() {
        return "" + this.field_a;
    }

    final byte[] a(int param0, int param1) {
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
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_42_0 = null;
            Object stackIn_43_0 = null;
            byte[] stackIn_49_0 = null;
            byte[] stackIn_50_0 = null;
            Object stackIn_52_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_48_0 = null;
            byte[] stackOut_49_0 = null;
            Object stackOut_41_0 = null;
            Object stackOut_42_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_51_0 = null;
            var18 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            var3 = this.field_c;
            synchronized (var3) {
              try {
                L0: {
                  if (this.field_g.b(true) >= (long)(6 + param0 * 6)) {
                    this.field_g.a((long)(param0 * 6), (byte) -63);
                    this.field_g.a(0, ma.field_yb, 6, param1 + -105);
                    var4_int = (ma.field_yb[1] << -1718113592 & 65280) + (((255 & ma.field_yb[0]) << 49331280) + (ma.field_yb[2] & 255));
                    var5 = (ma.field_yb[5] & 255) + ((ma.field_yb[4] & 255) << 650862664) + (ma.field_yb[param1] << -1161438256 & 16711680);
                    if (var4_int >= 0) {
                      if (this.field_e >= var4_int) {
                        if (0 < var5) {
                          if (((long)var5 ^ -1L) >= (this.field_c.b(true) / 520L ^ -1L)) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var4_int <= var7) {
                                stackOut_48_0 = (byte[]) (var6);
                                stackIn_49_0 = stackOut_48_0;
                                stackOut_49_0 = (byte[]) ((Object) stackIn_49_0);
                                stackIn_50_0 = stackOut_49_0;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L2: {
                                    this.field_c.a((long)(var5 * 520), (byte) -63);
                                    var9 = var4_int + -var7;
                                    if ((param0 ^ -1) < -65536) {
                                      L3: {
                                        var14 = 10;
                                        if (510 >= var9) {
                                          break L3;
                                        } else {
                                          var9 = 510;
                                          break L3;
                                        }
                                      }
                                      this.field_c.a(0, ma.field_yb, var14 + var9, -103);
                                      var13 = 255 & ma.field_yb[9];
                                      var10 = (ma.field_yb[3] & 255) + (ma.field_yb[0] << 1427491544 & -16777216) + (16711680 & ma.field_yb[1] << -1204071376) - -((255 & ma.field_yb[2]) << -337689112);
                                      var12 = ((255 & ma.field_yb[7]) << -850041496) + ((255 & ma.field_yb[6]) << -1281546832) + (255 & ma.field_yb[8]);
                                      var11 = (65280 & ma.field_yb[4] << 1756786536) - -(ma.field_yb[5] & 255);
                                      break L2;
                                    } else {
                                      L4: {
                                        var14 = 8;
                                        if (-513 <= (var9 ^ -1)) {
                                          break L4;
                                        } else {
                                          var9 = 512;
                                          break L4;
                                        }
                                      }
                                      this.field_c.a(0, ma.field_yb, var14 + var9, param1 + -114);
                                      var11 = (255 & ma.field_yb[3]) + ((255 & ma.field_yb[2]) << 252600488);
                                      var12 = (ma.field_yb[5] << -1489920120 & 65280) + ((ma.field_yb[4] & 255) << 344646416) - -(255 & ma.field_yb[6]);
                                      var13 = 255 & ma.field_yb[7];
                                      var10 = (ma.field_yb[1] & 255) + (65280 & ma.field_yb[0] << 1028758024);
                                      break L2;
                                    }
                                  }
                                  if (var10 == param0) {
                                    if (var11 == var8) {
                                      if (var13 == this.field_a) {
                                        if (0 <= var12) {
                                          if ((this.field_c.b(true) / 520L ^ -1L) <= ((long)var12 ^ -1L)) {
                                            var15 = var9 + var14;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var16 >= var15) {
                                                var5 = var12;
                                                var8++;
                                                continue L1;
                                              } else {
                                                incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = ma.field_yb[var16];
                                                var16++;
                                                continue L5;
                                              }
                                            }
                                          } else {
                                            stackOut_41_0 = null;
                                            stackIn_42_0 = stackOut_41_0;
                                            stackOut_42_0 = stackIn_42_0;
                                            stackIn_43_0 = stackOut_42_0;
                                            decompiledRegionSelector0 = 1;
                                            break L0;
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
                            decompiledRegionSelector0 = 0;
                            break L0;
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
                stackOut_51_0 = null;
                stackIn_52_0 = stackOut_51_0;
                return (byte[]) ((Object) stackIn_52_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_16_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_43_0);
                } else {
                  return stackIn_50_0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(int param0, byte param1, byte[] param2, boolean param3, int param4) {
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
            EOFException var14 = null;
            Throwable var15 = null;
            int var16 = 0;
            int stackIn_5_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_18_0 = 0;
            int stackIn_19_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_68_0 = 0;
            int stackIn_69_0 = 0;
            int stackIn_71_0 = 0;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            RuntimeException stackIn_76_0 = null;
            StringBuilder stackIn_76_1 = null;
            RuntimeException stackIn_77_0 = null;
            StringBuilder stackIn_77_1 = null;
            String stackIn_77_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_67_0 = 0;
            int stackOut_68_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_70_0 = 0;
            RuntimeException stackOut_74_0 = null;
            StringBuilder stackOut_74_1 = null;
            RuntimeException stackOut_76_0 = null;
            StringBuilder stackOut_76_1 = null;
            String stackOut_76_2 = null;
            RuntimeException stackOut_75_0 = null;
            StringBuilder stackOut_75_1 = null;
            String stackOut_75_2 = null;
            var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              var6_ref2 = this.field_c;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param3) {
                        var7_int = (int)((this.field_c.b(true) + 519L) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if ((this.field_g.b(true) ^ -1L) <= ((long)(param0 * 6 + 6) ^ -1L)) {
                          L2: {
                            this.field_g.a((long)(param0 * 6), (byte) -63);
                            this.field_g.a(0, ma.field_yb, 6, -111);
                            var7_int = ((255 & ma.field_yb[4]) << 451544872) + ((ma.field_yb[3] << -306560368 & 16711680) + (255 & ma.field_yb[5]));
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (((long)var7_int ^ -1L) >= (this.field_c.b(true) / 520L ^ -1L)) {
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackOut_11_0 = stackIn_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        } else {
                          stackOut_4_0 = 0;
                          stackIn_5_0 = stackOut_4_0;
                          stackOut_5_0 = stackIn_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        }
                      }
                    }
                    ma.field_yb[4] = (byte)(var7_int >> -1572422104);
                    ma.field_yb[5] = (byte)var7_int;
                    ma.field_yb[1] = (byte)(param4 >> -215439352);
                    ma.field_yb[0] = (byte)(param4 >> 2006607568);
                    ma.field_yb[3] = (byte)(var7_int >> 1728766448);
                    ma.field_yb[2] = (byte)param4;
                    this.field_g.a((long)(6 * param0), (byte) -63);
                    if (param1 == -15) {
                      this.field_g.a(6, 0, 18017, ma.field_yb);
                      var8 = 0;
                      var9 = 0;
                      L3: while (true) {
                        L4: {
                          if (param4 <= var8) {
                            break L4;
                          } else {
                            L5: {
                              var10 = 0;
                              if (!param3) {
                                break L5;
                              } else {
                                L6: {
                                  this.field_c.a((long)(520 * var7_int), (byte) -63);
                                  if (param0 > 65535) {
                                    try {
                                      L7: {
                                        this.field_c.a(0, ma.field_yb, 10, -122);
                                        decompiledRegionSelector0 = 0;
                                        break L7;
                                      }
                                    } catch (java.io.EOFException decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L8: {
                                        var14 = (EOFException) (Object) decompiledCaughtException;
                                        decompiledRegionSelector0 = 1;
                                        break L8;
                                      }
                                    }
                                    if (decompiledRegionSelector0 == 0) {
                                      var10 = (16711680 & ma.field_yb[6] << 922571824) + ((ma.field_yb[7] & 255) << -1367732952) - -(255 & ma.field_yb[8]);
                                      var12 = (ma.field_yb[5] & 255) + (65280 & ma.field_yb[4] << -218582104);
                                      var13 = 255 & ma.field_yb[9];
                                      var11 = (ma.field_yb[3] & 255) + (ma.field_yb[2] << -2067599064 & 65280) + (((255 & ma.field_yb[1]) << 18944624) + ((ma.field_yb[0] & 255) << -1100759752));
                                      break L6;
                                    } else {
                                      break L4;
                                    }
                                  } else {
                                    try {
                                      L9: {
                                        this.field_c.a(0, ma.field_yb, 8, param1 ^ 109);
                                        decompiledRegionSelector1 = 0;
                                        break L9;
                                      }
                                    } catch (java.io.EOFException decompiledCaughtParameter1) {
                                      decompiledCaughtException = decompiledCaughtParameter1;
                                      L10: {
                                        var14 = (EOFException) (Object) decompiledCaughtException;
                                        decompiledRegionSelector1 = 1;
                                        break L10;
                                      }
                                    }
                                    if (decompiledRegionSelector1 == 0) {
                                      var10 = (ma.field_yb[6] & 255) + (((255 & ma.field_yb[4]) << -152982448) - -((ma.field_yb[5] & 255) << 1395270696));
                                      var13 = 255 & ma.field_yb[7];
                                      var11 = (65280 & ma.field_yb[0] << -1814538936) + (ma.field_yb[1] & 255);
                                      var12 = (255 & ma.field_yb[3]) + ((255 & ma.field_yb[2]) << -91975768);
                                      break L6;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                L11: {
                                  if (param0 != var11) {
                                    break L11;
                                  } else {
                                    if (var12 != var9) {
                                      break L11;
                                    } else {
                                      if (this.field_a != var13) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if (var10 < 0) {
                                            break L12;
                                          } else {
                                            if (this.field_c.b(true) / 520L >= (long)var10) {
                                              break L5;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        stackOut_43_0 = 0;
                                        stackIn_44_0 = stackOut_43_0;
                                        stackOut_44_0 = stackIn_44_0;
                                        stackIn_45_0 = stackOut_44_0;
                                        decompiledRegionSelector2 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                                stackOut_37_0 = 0;
                                stackIn_38_0 = stackOut_37_0;
                                stackOut_38_0 = stackIn_38_0;
                                stackIn_39_0 = stackOut_38_0;
                                decompiledRegionSelector2 = 3;
                                break L0;
                              }
                            }
                            L13: {
                              if (var10 == 0) {
                                L14: {
                                  param3 = false;
                                  var10 = (int)((this.field_c.b(true) + 519L) / 520L);
                                  if (var10 == 0) {
                                    var10++;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                if (var7_int == var10) {
                                  var10++;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              } else {
                                break L13;
                              }
                            }
                            L15: {
                              if (512 >= param4 - var8) {
                                var10 = 0;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            L16: {
                              if ((param0 ^ -1) < -65536) {
                                L17: {
                                  ma.field_yb[4] = (byte)(var9 >> 336350376);
                                  ma.field_yb[0] = (byte)(param0 >> -759729320);
                                  ma.field_yb[9] = (byte)this.field_a;
                                  ma.field_yb[5] = (byte)var9;
                                  ma.field_yb[8] = (byte)var10;
                                  ma.field_yb[2] = (byte)(param0 >> 2086334856);
                                  ma.field_yb[3] = (byte)param0;
                                  ma.field_yb[6] = (byte)(var10 >> 529863248);
                                  ma.field_yb[1] = (byte)(param0 >> 590220752);
                                  ma.field_yb[7] = (byte)(var10 >> 2004654376);
                                  this.field_c.a((long)(var7_int * 520), (byte) -63);
                                  this.field_c.a(10, 0, 18017, ma.field_yb);
                                  var11 = -var8 + param4;
                                  if (-511 > (var11 ^ -1)) {
                                    var11 = 510;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                this.field_c.a(var11, var8, 18017, param2);
                                var8 = var8 + var11;
                                break L16;
                              } else {
                                L18: {
                                  ma.field_yb[1] = (byte)param0;
                                  ma.field_yb[0] = (byte)(param0 >> 736789576);
                                  ma.field_yb[2] = (byte)(var9 >> 52007432);
                                  ma.field_yb[6] = (byte)var10;
                                  ma.field_yb[4] = (byte)(var10 >> 940258960);
                                  ma.field_yb[5] = (byte)(var10 >> -2063749688);
                                  ma.field_yb[7] = (byte)this.field_a;
                                  ma.field_yb[3] = (byte)var9;
                                  this.field_c.a((long)(520 * var7_int), (byte) -63);
                                  this.field_c.a(8, 0, 18017, ma.field_yb);
                                  var11 = -var8 + param4;
                                  if (var11 > 512) {
                                    var11 = 512;
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                this.field_c.a(var11, var8, param1 + 18032, param2);
                                var8 = var8 + var11;
                                break L16;
                              }
                            }
                            var9++;
                            var7_int = var10;
                            continue L3;
                          }
                        }
                        stackOut_67_0 = 1;
                        stackIn_68_0 = stackOut_67_0;
                        stackOut_68_0 = stackIn_68_0;
                        stackIn_69_0 = stackOut_68_0;
                        decompiledRegionSelector2 = 5;
                        break L0;
                      }
                    } else {
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      stackOut_18_0 = stackIn_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      decompiledRegionSelector2 = 2;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_70_0 = 0;
                  stackIn_71_0 = stackOut_70_0;
                  return stackIn_71_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_6_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_12_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_19_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_39_0 != 0;
                      } else {
                        if (decompiledRegionSelector2 == 4) {
                          return stackIn_45_0 != 0;
                        } else {
                          return stackIn_69_0 != 0;
                        }
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_74_0 = (RuntimeException) (var6_ref);
                stackOut_74_1 = new StringBuilder().append("ik.E(").append(param0).append(',').append(param1).append(',');
                stackIn_76_0 = stackOut_74_0;
                stackIn_76_1 = stackOut_74_1;
                stackIn_75_0 = stackOut_74_0;
                stackIn_75_1 = stackOut_74_1;
                if (param2 == null) {
                  stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
                  stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
                  stackOut_76_2 = "null";
                  stackIn_77_0 = stackOut_76_0;
                  stackIn_77_1 = stackOut_76_1;
                  stackIn_77_2 = stackOut_76_2;
                  break L19;
                } else {
                  stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
                  stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
                  stackOut_75_2 = "{...}";
                  stackIn_77_0 = stackOut_75_0;
                  stackIn_77_1 = stackOut_75_1;
                  stackIn_77_2 = stackOut_75_2;
                  break L19;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ik(int param0, ge param1, ge param2, int param3) {
        this.field_e = 65000;
        this.field_c = null;
        this.field_g = null;
        try {
            this.field_e = param3;
            this.field_c = param1;
            this.field_g = param2;
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ik.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 <= -106) {
              L1: {
                if (null == pa.a(param0, (byte) 67)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("ik.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    static {
        field_d = new bb();
        field_h = "Medium";
    }
}
