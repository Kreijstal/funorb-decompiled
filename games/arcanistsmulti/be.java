/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class be {
    static String field_h;
    private int field_n;
    static int[] field_m;
    private int field_k;
    private sd field_e;
    static int[] field_d;
    static ll field_j;
    static boolean field_g;
    static String field_i;
    static String field_a;
    static kc field_b;
    static int field_f;
    private sd field_c;
    static kc field_l;

    final boolean a(byte[] param0, boolean param1, int param2, int param3) {
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
                  if (param2 < 0) {
                    break L2;
                  } else {
                    if (param2 <= this.field_n) {
                      L3: {
                        var6 = this.a(param3, param1, param2, (byte) -114, param0) ? 1 : 0;
                        if (var6 == 0) {
                          var6 = this.a(param3, false, param2, (byte) -114, param0) ? 1 : 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      stackOut_7_0 = var6;
                      stackIn_8_0 = stackOut_7_0;
                      break L1;
                    } else {
                      break L2;
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
            stackOut_11_1 = new StringBuilder().append("be.E(");
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
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final byte[] a(int param0, int param1) {
        try {
            boolean discarded$2 = false;
            int incrementValue$3 = 0;
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
            byte[] var19 = null;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_17_0 = null;
            Object stackIn_18_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_39_0 = null;
            byte[] stackIn_50_0 = null;
            byte[] stackIn_51_0 = null;
            Object stackIn_53_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_49_0 = null;
            byte[] stackOut_50_0 = null;
            Object stackOut_37_0 = null;
            Object stackOut_38_0 = null;
            Object stackOut_16_0 = null;
            Object stackOut_17_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_52_0 = null;
            var18 = ArcanistsMulti.field_G ? 1 : 0;
            var3 = this.field_c;
            synchronized (var3) {
              try {
                L0: {
                  if (this.field_e.b((byte) -30) >= (long)(6 + param0 * 6)) {
                    L1: {
                      this.field_e.a((long)(6 * param0), -116);
                      if (param1 < -56) {
                        break L1;
                      } else {
                        var19 = (byte[]) null;
                        discarded$2 = this.a((byte[]) null, true, -34, -67);
                        break L1;
                      }
                    }
                    this.field_e.a(6, ae.field_c, (byte) -39, 0);
                    var4_int = (255 & ae.field_c[2]) + (16711680 & ae.field_c[0] << 137526960) - -((ae.field_c[1] & 255) << -254183288);
                    var5 = (255 & ae.field_c[5]) + (((255 & ae.field_c[3]) << 1010769936) + ((ae.field_c[4] & 255) << -1833197880));
                    if (var4_int >= 0) {
                      if (var4_int <= this.field_n) {
                        if (var5 > 0) {
                          if ((this.field_c.b((byte) -30) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var4_int <= var7) {
                                stackOut_49_0 = (byte[]) (var6);
                                stackIn_50_0 = stackOut_49_0;
                                stackOut_50_0 = (byte[]) ((Object) stackIn_50_0);
                                stackIn_51_0 = stackOut_50_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L3: {
                                    this.field_c.a((long)(520 * var5), -86);
                                    var9 = var4_int + -var7;
                                    if (-65536 > (param0 ^ -1)) {
                                      L4: {
                                        var14 = 10;
                                        if (-511 <= (var9 ^ -1)) {
                                          break L4;
                                        } else {
                                          var9 = 510;
                                          break L4;
                                        }
                                      }
                                      this.field_c.a(var9 + var14, ae.field_c, (byte) -39, 0);
                                      var10 = (ae.field_c[3] & 255) + (((ae.field_c[0] & 255) << -2142843688) - (-(ae.field_c[1] << -797971600 & 16711680) + -(ae.field_c[2] << -991582872 & 65280)));
                                      var13 = ae.field_c[9] & 255;
                                      var11 = ((ae.field_c[4] & 255) << 1824119208) - -(ae.field_c[5] & 255);
                                      var12 = (ae.field_c[7] << -1652196984 & 65280) + ((ae.field_c[6] << -10479792 & 16711680) - -(255 & ae.field_c[8]));
                                      break L3;
                                    } else {
                                      L5: {
                                        var14 = 8;
                                        if ((var9 ^ -1) >= -513) {
                                          break L5;
                                        } else {
                                          var9 = 512;
                                          break L5;
                                        }
                                      }
                                      this.field_c.a(var14 + var9, ae.field_c, (byte) -39, 0);
                                      var12 = (ae.field_c[5] << -286942904 & 65280) + (((255 & ae.field_c[4]) << -447967952) + (ae.field_c[6] & 255));
                                      var10 = (ae.field_c[1] & 255) + (65280 & ae.field_c[0] << -696687768);
                                      var11 = (255 & ae.field_c[3]) + ((ae.field_c[2] & 255) << -2069850488);
                                      var13 = ae.field_c[7] & 255;
                                      break L3;
                                    }
                                  }
                                  if (param0 == var10) {
                                    if (var8 == var11) {
                                      if (this.field_k == var13) {
                                        if (-1 >= (var12 ^ -1)) {
                                          if (this.field_c.b((byte) -30) / 520L >= (long)var12) {
                                            var15 = var14 - -var9;
                                            var5 = var12;
                                            var8++;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var15 <= var16) {
                                                continue L2;
                                              } else {
                                                incrementValue$3 = var7;
                                                var7++;
                                                var6[incrementValue$3] = ae.field_c[var16];
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
                                        stackOut_37_0 = null;
                                        stackIn_38_0 = stackOut_37_0;
                                        stackOut_38_0 = stackIn_38_0;
                                        stackIn_39_0 = stackOut_38_0;
                                        decompiledRegionSelector0 = 2;
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
                              }
                            }
                          } else {
                            stackOut_16_0 = null;
                            stackIn_17_0 = stackOut_16_0;
                            stackOut_17_0 = stackIn_17_0;
                            stackIn_18_0 = stackOut_17_0;
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
                    stackOut_2_0 = null;
                    stackIn_3_0 = stackOut_2_0;
                    stackOut_3_0 = stackIn_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_52_0 = null;
                stackIn_53_0 = stackOut_52_0;
                return (byte[]) ((Object) stackIn_53_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_4_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_18_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_39_0);
                  } else {
                    return stackIn_51_0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_k;
    }

    public static void a(byte param0) {
        field_i = null;
        field_j = null;
        field_h = null;
        field_b = null;
        field_l = null;
        field_d = null;
        int var1 = 6 % ((param0 - 5) / 37);
        field_m = null;
        field_a = null;
    }

    final static int a(int param0) {
        if (param0 != 1497225488) {
            return -32;
        }
        return hg.field_b;
    }

    private final boolean a(int param0, boolean param1, int param2, byte param3, byte[] param4) {
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
            int stackIn_10_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_16_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_66_0 = 0;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            String stackIn_72_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_65_0 = 0;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            String stackOut_71_2 = null;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            String stackOut_70_2 = null;
            var16 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              var6_ref2 = this.field_c;
              synchronized (var6_ref2) {
                L0: {
                  if (param3 < -73) {
                    break L0;
                  } else {
                    this.field_e = (sd) null;
                    break L0;
                  }
                }
                try {
                  L1: {
                    L2: {
                      if (param1) {
                        if ((this.field_e.b((byte) -30) ^ -1L) > ((long)(6 * param0 + 6) ^ -1L)) {
                          stackOut_9_0 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          stackOut_10_0 = stackIn_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          decompiledRegionSelector2 = 0;
                          break L1;
                        } else {
                          L3: {
                            this.field_e.a((long)(6 * param0), -111);
                            this.field_e.a(6, ae.field_c, (byte) -39, 0);
                            var7_int = (ae.field_c[5] & 255) + (((ae.field_c[3] & 255) << 303575952) + (65280 & ae.field_c[4] << -152524856));
                            if (var7_int <= 0) {
                              break L3;
                            } else {
                              if (this.field_c.b((byte) -30) / 520L < (long)var7_int) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackOut_16_0 = stackIn_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          decompiledRegionSelector2 = 1;
                          break L1;
                        }
                      } else {
                        var7_int = (int)((this.field_c.b((byte) -30) - -519L) / 520L);
                        if (0 != var7_int) {
                          break L2;
                        } else {
                          var7_int = 1;
                          break L2;
                        }
                      }
                    }
                    ae.field_c[0] = (byte)(param2 >> 1328454960);
                    ae.field_c[3] = (byte)(var7_int >> 485041232);
                    ae.field_c[1] = (byte)(param2 >> -874613336);
                    ae.field_c[4] = (byte)(var7_int >> -1763536088);
                    ae.field_c[5] = (byte)var7_int;
                    ae.field_c[2] = (byte)param2;
                    this.field_e.a((long)(param0 * 6), -104);
                    this.field_e.a((byte) -53, 0, ae.field_c, 6);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (param2 <= var8) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (!param1) {
                              break L6;
                            } else {
                              L7: {
                                this.field_c.a((long)(520 * var7_int), -88);
                                if (-65536 > (param0 ^ -1)) {
                                  try {
                                    L8: {
                                      this.field_c.a(10, ae.field_c, (byte) -39, 0);
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
                                    var12 = (255 & ae.field_c[5]) + (ae.field_c[4] << -249619672 & 65280);
                                    var10 = (65280 & ae.field_c[7] << -255316344) + ((255 & ae.field_c[6]) << 1497225488) + (ae.field_c[8] & 255);
                                    var11 = (ae.field_c[3] & 255) + ((-16777216 & ae.field_c[0] << 1340860504) - (-((255 & ae.field_c[1]) << 76963376) - ((ae.field_c[2] & 255) << 1519912744)));
                                    var13 = 255 & ae.field_c[9];
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      this.field_c.a(8, ae.field_c, (byte) -39, 0);
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
                                    var10 = (65280 & ae.field_c[5] << -588502936) + (((255 & ae.field_c[4]) << -2038258160) + (255 & ae.field_c[6]));
                                    var11 = (ae.field_c[1] & 255) + ((255 & ae.field_c[0]) << -348820760);
                                    var13 = 255 & ae.field_c[7];
                                    var12 = (255 & ae.field_c[3]) + ((255 & ae.field_c[2]) << 1782413960);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L12: {
                                if (var11 != param0) {
                                  break L12;
                                } else {
                                  if (var12 != var9) {
                                    break L12;
                                  } else {
                                    if (var13 != this.field_k) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (0 > var10) {
                                          break L13;
                                        } else {
                                          if (this.field_c.b((byte) -30) / 520L >= (long)var10) {
                                            break L6;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      stackOut_41_0 = 0;
                                      stackIn_42_0 = stackOut_41_0;
                                      stackOut_42_0 = stackIn_42_0;
                                      stackIn_43_0 = stackOut_42_0;
                                      decompiledRegionSelector2 = 3;
                                      break L1;
                                    }
                                  }
                                }
                              }
                              stackOut_35_0 = 0;
                              stackIn_36_0 = stackOut_35_0;
                              stackOut_36_0 = stackIn_36_0;
                              stackIn_37_0 = stackOut_36_0;
                              decompiledRegionSelector2 = 2;
                              break L1;
                            }
                          }
                          L14: {
                            if (0 != var10) {
                              break L14;
                            } else {
                              L15: {
                                var10 = (int)((519L + this.field_c.b((byte) -30)) / 520L);
                                param1 = false;
                                if (0 != var10) {
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
                            }
                          }
                          L16: {
                            if (512 >= param2 + -var8) {
                              var10 = 0;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if ((param0 ^ -1) >= -65536) {
                              L18: {
                                ae.field_c[6] = (byte)var10;
                                ae.field_c[5] = (byte)(var10 >> 1032974728);
                                ae.field_c[3] = (byte)var9;
                                ae.field_c[0] = (byte)(param0 >> 2143179304);
                                ae.field_c[4] = (byte)(var10 >> 227484720);
                                ae.field_c[2] = (byte)(var9 >> 1439090216);
                                ae.field_c[7] = (byte)this.field_k;
                                ae.field_c[1] = (byte)param0;
                                this.field_c.a((long)(520 * var7_int), -112);
                                this.field_c.a((byte) -53, 0, ae.field_c, 8);
                                var11 = -var8 + param2;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_c.a((byte) -53, var8, param4, var11);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                ae.field_c[7] = (byte)(var10 >> 2108083592);
                                ae.field_c[6] = (byte)(var10 >> 1349537648);
                                ae.field_c[0] = (byte)(param0 >> -1678185352);
                                ae.field_c[4] = (byte)(var9 >> -1931575032);
                                ae.field_c[3] = (byte)param0;
                                ae.field_c[2] = (byte)(param0 >> 1616447656);
                                ae.field_c[9] = (byte)this.field_k;
                                ae.field_c[5] = (byte)var9;
                                ae.field_c[1] = (byte)(param0 >> -1638365648);
                                ae.field_c[8] = (byte)var10;
                                this.field_c.a((long)(var7_int * 520), -88);
                                this.field_c.a((byte) -53, 0, ae.field_c, 10);
                                var11 = -var8 + param2;
                                if ((var11 ^ -1) >= -511) {
                                  break L19;
                                } else {
                                  var11 = 510;
                                  break L19;
                                }
                              }
                              this.field_c.a((byte) -53, var8, param4, var11);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L4;
                        }
                      }
                      stackOut_62_0 = 1;
                      stackIn_63_0 = stackOut_62_0;
                      stackOut_63_0 = stackIn_63_0;
                      stackIn_64_0 = stackOut_63_0;
                      decompiledRegionSelector2 = 4;
                      break L1;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_65_0 = 0;
                  stackIn_66_0 = stackOut_65_0;
                  return stackIn_66_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_11_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_17_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_37_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_43_0 != 0;
                      } else {
                        return stackIn_64_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_69_0 = (RuntimeException) (var6_ref);
                stackOut_69_1 = new StringBuilder().append("be.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_71_0 = stackOut_69_0;
                stackIn_71_1 = stackOut_69_1;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                if (param4 == null) {
                  stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
                  stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
                  stackOut_71_2 = "null";
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  stackIn_72_2 = stackOut_71_2;
                  break L20;
                } else {
                  stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
                  stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
                  stackOut_70_2 = "{...}";
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  stackIn_72_2 = stackOut_70_2;
                  break L20;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, vd param1, String param2, dj param3, byte param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param4 == 35) {
              var5_int = 0;
              var6 = -1;
              var7 = 1;
              L1: while (true) {
                if (param2.length() <= var7) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var8 = param2.charAt(var7);
                    if (60 != var8) {
                      break L2;
                    } else {
                      var6 = param1.field_f[0] + (var5_int >> -1991223736) + param3.b(param2.substring(0, var7));
                      break L2;
                    }
                  }
                  L3: {
                    if (0 != (var6 ^ -1)) {
                      param1.field_f[var7] = var6;
                      break L3;
                    } else {
                      L4: {
                        if (32 != var8) {
                          break L4;
                        } else {
                          var5_int = var5_int + param0;
                          break L4;
                        }
                      }
                      param1.field_f[var7] = (var5_int >> 1124157928) + param1.field_f[0] - (-param3.b(param2.substring(0, var7 - -1)) - -param3.a((char) var8));
                      break L3;
                    }
                  }
                  if (var8 == 62) {
                    var6 = -1;
                    var7++;
                    continue L1;
                  } else {
                    var7++;
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("be.G(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static long a(CharSequence param0, boolean param1) {
        int discarded$2 = 0;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_22_0 = 0L;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                discarded$2 = be.a(-40);
                break L1;
              }
            }
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            L2: while (true) {
              L3: {
                if (var5 >= var4) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      if (var6 < 65) {
                        break L5;
                      } else {
                        if (90 < var6) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(-65 + (var6 + 1));
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (122 >= var6) {
                          var2_long = var2_long + (long)(var6 + 1 - 97);
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L4;
                    } else {
                      if (57 >= var6) {
                        var2_long = var2_long + (long)(var6 + -21);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (177917621779460413L <= var2_long) {
                    break L3;
                  } else {
                    var5++;
                    continue L2;
                  }
                }
              }
              L7: while (true) {
                L8: {
                  if (0L != var2_long % 37L) {
                    break L8;
                  } else {
                    if (var2_long == 0L) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackOut_22_0 = var2_long;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("be.B(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    be(int param0, sd param1, sd param2, int param3) {
        this.field_e = null;
        this.field_n = 65000;
        this.field_c = null;
        try {
            this.field_n = param3;
            this.field_c = param1;
            this.field_k = param0;
            this.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "be.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_a = "MOST SKILLFUL - ";
        field_m = new int[8192];
        field_h = "Only two targets left! You have no control over the direction that the attack comes in at, so be careful if you are too close.";
        field_i = "Elements Expansion";
        field_f = 0;
    }
}
