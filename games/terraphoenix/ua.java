/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ua {
    static ci field_b;
    private int field_a;
    private ak field_i;
    private int field_h;
    static og field_d;
    private ak field_f;
    static int field_e;
    static String[] field_c;
    static char field_g;

    private final boolean a(boolean param0, int param1, int param2, byte[] param3, int param4) {
        try {
            String discarded$1 = null;
            RuntimeException var6 = null;
            Object var6_ref = null;
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
            int stackIn_8_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_63_0 = 0;
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
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_66_0 = 0;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            String stackOut_71_2 = null;
            var16 = Terraphoenix.field_V;
            try {
              var6_ref = this.field_f;
              synchronized (var6_ref) {
                try {
                  L0: {
                    L1: {
                      if (param0) {
                        if (((long)(6 * param1 - -6) ^ -1L) < (this.field_i.a((byte) -118) ^ -1L)) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        } else {
                          L2: {
                            this.field_i.a(false, (long)(param1 * 6));
                            this.field_i.a(ad.field_m, (byte) -127, 0, 6);
                            var7_int = ((ad.field_m[3] & 255) << -1491057680) + (((255 & ad.field_m[4]) << -552508920) - -(ad.field_m[5] & 255));
                            if ((var7_int ^ -1) >= -1) {
                              break L2;
                            } else {
                              if ((this.field_f.a((byte) 127) / 520L ^ -1L) > ((long)var7_int ^ -1L)) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackOut_14_0 = stackIn_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        }
                      } else {
                        var7_int = (int)((this.field_f.a((byte) -122) - -519L) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    ad.field_m[1] = (byte)(param4 >> -154327800);
                    ad.field_m[3] = (byte)(var7_int >> 424316496);
                    ad.field_m[4] = (byte)(var7_int >> -95068536);
                    ad.field_m[2] = (byte)param4;
                    ad.field_m[5] = (byte)var7_int;
                    ad.field_m[0] = (byte)(param4 >> -1676420016);
                    this.field_i.a(false, (long)(param1 * 6));
                    this.field_i.a(-1, 6, ad.field_m, 0);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (param4 <= var8) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (!param0) {
                              break L5;
                            } else {
                              L6: {
                                this.field_f.a(false, (long)(var7_int * 520));
                                if (param1 > 65535) {
                                  try {
                                    L7: {
                                      this.field_f.a(ad.field_m, (byte) -127, 0, 10);
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
                                    var11 = (ad.field_m[3] & 255) + ((-16777216 & ad.field_m[0] << -509855080) + ((255 & ad.field_m[1]) << 75590960)) - -(65280 & ad.field_m[2] << -1568164376);
                                    var13 = ad.field_m[9] & 255;
                                    var10 = (255 & ad.field_m[8]) + (ad.field_m[6] << -1766945616 & 16711680) - -(ad.field_m[7] << 705477672 & 65280);
                                    var12 = (255 & ad.field_m[5]) + ((ad.field_m[4] & 255) << 882391240);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      this.field_f.a(ad.field_m, (byte) -126, 0, 8);
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
                                    var12 = (255 & ad.field_m[3]) + (ad.field_m[2] << -1090276184 & 65280);
                                    var11 = ((255 & ad.field_m[0]) << 2110268744) + (255 & ad.field_m[1]);
                                    var13 = 255 & ad.field_m[7];
                                    var10 = (255 & ad.field_m[6]) + (((ad.field_m[5] & 255) << -208292472) + (16711680 & ad.field_m[4] << 1091494992));
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (var11 != param1) {
                                  break L11;
                                } else {
                                  if (var9 != var12) {
                                    break L11;
                                  } else {
                                    if (var13 != this.field_a) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if ((var10 ^ -1) > -1) {
                                          break L12;
                                        } else {
                                          if ((long)var10 > this.field_f.a((byte) -110) / 520L) {
                                            break L12;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      stackOut_39_0 = 0;
                                      stackIn_40_0 = stackOut_39_0;
                                      stackOut_40_0 = stackIn_40_0;
                                      stackIn_41_0 = stackOut_40_0;
                                      decompiledRegionSelector2 = 3;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              stackOut_33_0 = 0;
                              stackIn_34_0 = stackOut_33_0;
                              stackOut_34_0 = stackIn_34_0;
                              stackIn_35_0 = stackOut_34_0;
                              decompiledRegionSelector2 = 2;
                              break L0;
                            }
                          }
                          L13: {
                            if (0 == var10) {
                              L14: {
                                var10 = (int)((519L + this.field_f.a((byte) 89)) / 520L);
                                param0 = false;
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
                            if (param1 <= 65535) {
                              L17: {
                                ad.field_m[5] = (byte)(var10 >> 673225352);
                                ad.field_m[0] = (byte)(param1 >> 1838578440);
                                ad.field_m[1] = (byte)param1;
                                ad.field_m[2] = (byte)(var9 >> 1963648488);
                                ad.field_m[3] = (byte)var9;
                                ad.field_m[6] = (byte)var10;
                                ad.field_m[4] = (byte)(var10 >> 1779735056);
                                ad.field_m[7] = (byte)this.field_a;
                                this.field_f.a(false, (long)(520 * var7_int));
                                this.field_f.a(-1, 8, ad.field_m, 0);
                                var11 = -var8 + param4;
                                if (-513 <= (var11 ^ -1)) {
                                  break L17;
                                } else {
                                  var11 = 512;
                                  break L17;
                                }
                              }
                              this.field_f.a(-1, var11, param3, var8);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                ad.field_m[6] = (byte)(var10 >> -439648368);
                                ad.field_m[2] = (byte)(param1 >> 1500712);
                                ad.field_m[0] = (byte)(param1 >> 632019768);
                                ad.field_m[7] = (byte)(var10 >> -1152258744);
                                ad.field_m[1] = (byte)(param1 >> -223976304);
                                ad.field_m[4] = (byte)(var9 >> -734987096);
                                ad.field_m[8] = (byte)var10;
                                ad.field_m[3] = (byte)param1;
                                ad.field_m[9] = (byte)this.field_a;
                                ad.field_m[5] = (byte)var9;
                                this.field_f.a(false, (long)(520 * var7_int));
                                this.field_f.a(-1, 10, ad.field_m, 0);
                                var11 = param4 + -var8;
                                if (var11 > 510) {
                                  var11 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_f.a(param2 ^ -1589174833, var11, param3, var8);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L3;
                        }
                      }
                      stackOut_61_0 = 1;
                      stackIn_62_0 = stackOut_61_0;
                      stackOut_62_0 = stackIn_62_0;
                      stackIn_63_0 = stackOut_62_0;
                      decompiledRegionSelector2 = 4;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L19: {
                    var7 = (IOException) (Object) decompiledCaughtException;
                    if (param2 == 1589174832) {
                      break L19;
                    } else {
                      discarded$1 = this.toString();
                      break L19;
                    }
                  }
                  stackOut_66_0 = 0;
                  stackIn_67_0 = stackOut_66_0;
                  return stackIn_67_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_9_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_15_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_35_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_41_0 != 0;
                      } else {
                        return stackIn_63_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_70_0 = (RuntimeException) (var6);
                stackOut_70_1 = new StringBuilder().append("ua.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_72_0 = stackOut_70_0;
                stackIn_72_1 = stackOut_70_1;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                if (param3 == null) {
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
              throw qk.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param4 + ')');
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

    public static void a(int param0) {
        if (param0 != 8) {
            field_d = (og) null;
        }
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final boolean a(int param0, byte[] param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var5 = this.field_f;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param3 < param2) {
                    break L2;
                  } else {
                    if (this.field_h >= param3) {
                      L3: {
                        var6 = this.a(true, param0, 1589174832, param1, param3) ? 1 : 0;
                        if (var6 != 0) {
                          break L3;
                        } else {
                          var6 = this.a(false, param0, 1589174832, param1, param3) ? 1 : 0;
                          break L3;
                        }
                      }
                      stackOut_6_0 = var6;
                      stackIn_7_0 = stackOut_6_0;
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
            stackOut_10_0 = (RuntimeException) (var5_ref);
            stackOut_10_1 = new StringBuilder().append("ua.D(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0 != 0;
    }

    ua(int param0, ak param1, ak param2, int param3) {
        this.field_i = null;
        this.field_f = null;
        this.field_h = 65000;
        try {
            this.field_a = param0;
            this.field_f = param1;
            this.field_i = param2;
            this.field_h = param3;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ua.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
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
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
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
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_52_0 = null;
            var18 = Terraphoenix.field_V;
            var3 = this.field_f;
            synchronized (var3) {
              try {
                L0: {
                  if ((this.field_i.a((byte) 54) ^ -1L) <= ((long)(6 * param1 + 6) ^ -1L)) {
                    this.field_i.a(false, (long)(6 * param1));
                    this.field_i.a(ad.field_m, (byte) 71, 0, 6);
                    var4_int = (ad.field_m[1] << 342389960 & 65280) + (((ad.field_m[0] & 255) << -527723152) + (255 & ad.field_m[2]));
                    var5 = (ad.field_m[5] & 255) + ((ad.field_m[3] << 218110192 & 16711680) - -((255 & ad.field_m[4]) << 721685384));
                    if (var4_int >= 0) {
                      if (this.field_h >= var4_int) {
                        L1: {
                          if (param0 == -18342) {
                            break L1;
                          } else {
                            this.field_h = -111;
                            break L1;
                          }
                        }
                        if (0 < var5) {
                          if ((long)var5 <= this.field_f.a((byte) -113) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_49_0 = (byte[]) (var6);
                                stackIn_50_0 = stackOut_49_0;
                                stackOut_50_0 = (byte[]) ((Object) stackIn_50_0);
                                stackIn_51_0 = stackOut_50_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L3: {
                                    this.field_f.a(false, (long)(520 * var5));
                                    var9 = var4_int + -var7;
                                    if (65535 < param1) {
                                      L4: {
                                        var14 = 10;
                                        if ((var9 ^ -1) >= -511) {
                                          break L4;
                                        } else {
                                          var9 = 510;
                                          break L4;
                                        }
                                      }
                                      this.field_f.a(ad.field_m, (byte) -127, 0, var9 + var14);
                                      var10 = ((255 & ad.field_m[0]) << 245685880) - (-(16711680 & ad.field_m[1] << 1589174832) - ((ad.field_m[2] & 255) << 1249902632) + -(ad.field_m[3] & 255));
                                      var11 = (ad.field_m[5] & 255) + ((255 & ad.field_m[4]) << 1820412168);
                                      var12 = (ad.field_m[7] << 2023453640 & 65280) + ((255 & ad.field_m[6]) << 729699824) + (ad.field_m[8] & 255);
                                      var13 = 255 & ad.field_m[9];
                                      break L3;
                                    } else {
                                      L5: {
                                        var14 = 8;
                                        if (var9 <= 512) {
                                          break L5;
                                        } else {
                                          var9 = 512;
                                          break L5;
                                        }
                                      }
                                      this.field_f.a(ad.field_m, (byte) -125, 0, var9 - -var14);
                                      var12 = (255 & ad.field_m[6]) + (16711680 & ad.field_m[4] << 1167771504) + ((255 & ad.field_m[5]) << -2146982104);
                                      var11 = ((ad.field_m[2] & 255) << 1894454728) - -(ad.field_m[3] & 255);
                                      var10 = ((ad.field_m[0] & 255) << -874458584) + (255 & ad.field_m[1]);
                                      var13 = ad.field_m[7] & 255;
                                      break L3;
                                    }
                                  }
                                  if (param1 == var10) {
                                    if (var11 == var8) {
                                      if (this.field_a == var13) {
                                        if (-1 >= (var12 ^ -1)) {
                                          if (this.field_f.a((byte) -127) / 520L >= (long)var12) {
                                            var15 = var9 + var14;
                                            var5 = var12;
                                            var8++;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var15 <= var16) {
                                                continue L2;
                                              } else {
                                                incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = ad.field_m[var16];
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
                stackOut_52_0 = null;
                stackIn_53_0 = stackOut_52_0;
                return (byte[]) ((Object) stackIn_53_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_10_0);
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

    static {
        field_e = 128;
        field_c = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_d = new og();
    }
}
