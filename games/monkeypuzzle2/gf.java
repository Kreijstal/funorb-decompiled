/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gf {
    private int field_a;
    private ch field_d;
    private ch field_f;
    static ad field_b;
    static hb field_c;
    private int field_e;

    public final String toString() {
        return "" + this.field_a;
    }

    final byte[] a(int param0, byte param1) {
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
            int var17 = 0;
            Throwable var18 = null;
            int var19 = 0;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_36_0 = null;
            Object stackIn_37_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_35_0 = null;
            Object stackOut_36_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_54_0 = null;
            var19 = MonkeyPuzzle2.field_F ? 1 : 0;
            var3 = this.field_f;
            synchronized (var3) {
              try {
                L0: {
                  if (((long)(param0 * 6 + 6) ^ -1L) >= (this.field_d.c((byte) -72) ^ -1L)) {
                    this.field_d.a((byte) 116, (long)(6 * param0));
                    this.field_d.a(od.field_m, 6, 0, (byte) 41);
                    var4_int = (255 & od.field_m[2]) + ((255 & od.field_m[1]) << -1384670744) + (16711680 & od.field_m[0] << -1492895728);
                    var5 = (16711680 & od.field_m[3] << 695284720) - -((od.field_m[4] & 255) << -1117328472) + (od.field_m[5] & 255);
                    if (-1 >= (var4_int ^ -1)) {
                      if (this.field_e >= var4_int) {
                        if ((var5 ^ -1) < -1) {
                          if ((long)var5 <= this.field_f.c((byte) -107) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var9 = 61 % ((param1 - 41) / 50);
                            var8 = 0;
                            L1: while (true) {
                              if (var4_int <= var7) {
                                stackOut_51_0 = (byte[]) (var6);
                                stackIn_52_0 = stackOut_51_0;
                                stackOut_52_0 = (byte[]) ((Object) stackIn_52_0);
                                stackIn_53_0 = stackOut_52_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L2: {
                                    L3: {
                                      this.field_f.a((byte) 121, (long)(var5 * 520));
                                      var10 = var4_int + -var7;
                                      if (65535 >= param0) {
                                        break L3;
                                      } else {
                                        L4: {
                                          if (-511 <= (var10 ^ -1)) {
                                            break L4;
                                          } else {
                                            var10 = 510;
                                            break L4;
                                          }
                                        }
                                        var15 = 10;
                                        this.field_f.a(od.field_m, var15 + var10, 0, (byte) 123);
                                        var14 = od.field_m[9] & 255;
                                        var12 = ((255 & od.field_m[4]) << 788474536) + (od.field_m[5] & 255);
                                        var13 = (255 & od.field_m[8]) + (((255 & od.field_m[6]) << 1741999856) - -(65280 & od.field_m[7] << -674420184));
                                        var11 = (od.field_m[3] & 255) + (od.field_m[2] << -1789256280 & 65280) + ((od.field_m[1] & 255) << 763691152) + (-16777216 & od.field_m[0] << -1886461704);
                                        if (var19 == 0) {
                                          break L2;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    L5: {
                                      if (var10 <= 512) {
                                        break L5;
                                      } else {
                                        var10 = 512;
                                        break L5;
                                      }
                                    }
                                    var15 = 8;
                                    this.field_f.a(od.field_m, var10 - -var15, 0, (byte) 93);
                                    var14 = 255 & od.field_m[7];
                                    var12 = (255 & od.field_m[3]) + (65280 & od.field_m[2] << -363889464);
                                    var11 = (od.field_m[0] << 1679562824 & 65280) - -(od.field_m[1] & 255);
                                    var13 = (od.field_m[6] & 255) + ((od.field_m[4] & 255) << -1741155280) - -(65280 & od.field_m[5] << -1425614456);
                                    break L2;
                                  }
                                  if (var11 == param0) {
                                    if (var12 == var8) {
                                      if (this.field_a == var14) {
                                        if ((var13 ^ -1) <= -1) {
                                          if ((long)var13 <= this.field_f.c((byte) -120) / 520L) {
                                            var16 = var15 + var10;
                                            var17 = var15;
                                            L6: while (true) {
                                              L7: {
                                                if (var17 >= var16) {
                                                  var8++;
                                                  var5 = var13;
                                                  break L7;
                                                } else {
                                                  incrementValue$1 = var7;
                                                  var7++;
                                                  var6[incrementValue$1] = od.field_m[var17];
                                                  var17++;
                                                  if (var19 != 0) {
                                                    break L7;
                                                  } else {
                                                    continue L6;
                                                  }
                                                }
                                              }
                                              continue L1;
                                            }
                                          } else {
                                            return null;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        stackOut_35_0 = null;
                                        stackIn_36_0 = stackOut_35_0;
                                        stackOut_36_0 = stackIn_36_0;
                                        stackIn_37_0 = stackOut_36_0;
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
                        decompiledRegionSelector0 = 1;
                        break L0;
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
                stackOut_54_0 = null;
                stackIn_55_0 = stackOut_54_0;
                return (byte[]) ((Object) stackIn_55_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_4_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_10_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_37_0);
                  } else {
                    return stackIn_53_0;
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

    public static void a(int param0) {
        if (param0 != -4435) {
            return;
        }
        field_c = null;
        field_b = null;
    }

    final boolean a(int param0, int param1, int param2, byte[] param3) {
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
            var5 = this.field_f;
            synchronized (var5) {
              L1: {
                L2: {
                  if (-1 < (param2 ^ -1)) {
                    break L2;
                  } else {
                    if (param2 <= this.field_e) {
                      L3: {
                        var6 = this.a(param3, param1, false, param2, true) ? 1 : 0;
                        if (param0 == 5) {
                          break L3;
                        } else {
                          this.field_a = -112;
                          break L3;
                        }
                      }
                      L4: {
                        if (var6 != 0) {
                          break L4;
                        } else {
                          var6 = this.a(param3, param1, false, param2, false) ? 1 : 0;
                          break L4;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5_ref);
            stackOut_12_1 = new StringBuilder().append("gf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    private final boolean a(byte[] param0, int param1, boolean param2, int param3, boolean param4) {
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
            int stackIn_6_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_13_0 = 0;
            boolean stackIn_21_0 = false;
            int stackIn_37_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_68_0 = 0;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            String stackIn_74_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            boolean stackOut_20_0 = false;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_67_0 = 0;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            String stackOut_73_2 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            var16 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              var6_ref2 = this.field_f;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param4) {
                        var7_int = (int)((this.field_f.c((byte) -128) - -519L) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if ((long)(6 + param1 * 6) > this.field_d.c((byte) -104)) {
                          stackOut_5_0 = 0;
                          stackIn_6_0 = stackOut_5_0;
                          stackOut_6_0 = stackIn_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        } else {
                          L2: {
                            this.field_d.a((byte) 118, (long)(param1 * 6));
                            this.field_d.a(od.field_m, 6, 0, (byte) 65);
                            var7_int = (od.field_m[4] << -2037060792 & 65280) + (((255 & od.field_m[3]) << 832822096) - -(255 & od.field_m[5]));
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if (this.field_f.c((byte) -111) / 520L < (long)var7_int) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          stackOut_12_0 = stackIn_12_0;
                          stackIn_13_0 = stackOut_12_0;
                          decompiledRegionSelector2 = 2;
                          break L0;
                        }
                      }
                    }
                    L3: {
                      od.field_m[3] = (byte)(var7_int >> 1933268048);
                      od.field_m[4] = (byte)(var7_int >> -432976088);
                      od.field_m[0] = (byte)(param3 >> 439619952);
                      if (!param2) {
                        break L3;
                      } else {
                        this.field_e = -65;
                        break L3;
                      }
                    }
                    od.field_m[2] = (byte)param3;
                    od.field_m[1] = (byte)(param3 >> 1161712200);
                    od.field_m[5] = (byte)var7_int;
                    this.field_d.a((byte) 91, (long)(param1 * 6));
                    this.field_d.a(od.field_m, 0, (byte) 44, 6);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (param3 <= var8) {
                            break L6;
                          } else {
                            var10 = 0;
                            stackOut_20_0 = param4;
                            stackIn_66_0 = stackOut_20_0 ? 1 : 0;
                            stackIn_21_0 = stackOut_20_0;
                            if (var16 != 0) {
                              break L5;
                            } else {
                              L7: {
                                if (!stackIn_21_0) {
                                  break L7;
                                } else {
                                  L8: {
                                    L9: {
                                      this.field_f.a((byte) 123, (long)(520 * var7_int));
                                      if ((param1 ^ -1) >= -65536) {
                                        break L9;
                                      } else {
                                        try {
                                          L10: {
                                            this.field_f.a(od.field_m, 10, 0, (byte) 121);
                                            decompiledRegionSelector1 = 0;
                                            break L10;
                                          }
                                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                                          decompiledCaughtException = decompiledCaughtParameter0;
                                          L11: {
                                            var14 = (EOFException) (Object) decompiledCaughtException;
                                            if (var16 == 0) {
                                              decompiledRegionSelector1 = 1;
                                              break L11;
                                            } else {
                                              decompiledRegionSelector1 = 0;
                                              break L11;
                                            }
                                          }
                                        }
                                        if (decompiledRegionSelector1 == 0) {
                                          var12 = (od.field_m[5] & 255) + ((od.field_m[4] & 255) << 1496106824);
                                          var13 = 255 & od.field_m[9];
                                          var11 = (65280 & od.field_m[2] << 1709420968) + (od.field_m[0] << 1761872920 & -16777216) - (-(16711680 & od.field_m[1] << -1639989072) + -(od.field_m[3] & 255));
                                          var10 = (od.field_m[8] & 255) + ((od.field_m[7] << -1179976728 & 65280) + (od.field_m[6] << 316694736 & 16711680));
                                          if (var16 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    try {
                                      L12: {
                                        this.field_f.a(od.field_m, 8, 0, (byte) 27);
                                        decompiledRegionSelector0 = 0;
                                        break L12;
                                      }
                                    } catch (java.io.EOFException decompiledCaughtParameter1) {
                                      decompiledCaughtException = decompiledCaughtParameter1;
                                      L13: {
                                        var14 = (EOFException) (Object) decompiledCaughtException;
                                        if (var16 == 0) {
                                          decompiledRegionSelector0 = 1;
                                          break L13;
                                        } else {
                                          decompiledRegionSelector0 = 0;
                                          break L13;
                                        }
                                      }
                                    }
                                    if (decompiledRegionSelector0 == 0) {
                                      var12 = (255 & od.field_m[3]) + (65280 & od.field_m[2] << 1031423944);
                                      var11 = (65280 & od.field_m[0] << -605937976) - -(255 & od.field_m[1]);
                                      var13 = 255 & od.field_m[7];
                                      var10 = (od.field_m[6] & 255) + ((od.field_m[4] & 255) << 1199762736) - -(od.field_m[5] << -1646186744 & 65280);
                                      break L8;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  L14: {
                                    if (var11 != param1) {
                                      break L14;
                                    } else {
                                      if (var9 != var12) {
                                        break L14;
                                      } else {
                                        if (var13 == this.field_a) {
                                          L15: {
                                            if (0 > var10) {
                                              break L15;
                                            } else {
                                              if (this.field_f.c((byte) -98) / 520L >= (long)var10) {
                                                break L7;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          stackOut_42_0 = 0;
                                          stackIn_43_0 = stackOut_42_0;
                                          stackOut_43_0 = stackIn_43_0;
                                          stackIn_44_0 = stackOut_43_0;
                                          decompiledRegionSelector2 = 4;
                                          break L0;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_36_0 = 0;
                                  stackIn_37_0 = stackOut_36_0;
                                  stackOut_37_0 = stackIn_37_0;
                                  stackIn_38_0 = stackOut_37_0;
                                  decompiledRegionSelector2 = 3;
                                  break L0;
                                }
                              }
                              L16: {
                                if (0 != var10) {
                                  break L16;
                                } else {
                                  L17: {
                                    param4 = false;
                                    var10 = (int)((this.field_f.c((byte) -69) + 519L) / 520L);
                                    if (0 == var10) {
                                      var10++;
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  if (var10 != var7_int) {
                                    break L16;
                                  } else {
                                    var10++;
                                    break L16;
                                  }
                                }
                              }
                              L18: {
                                if (512 >= -var8 + param3) {
                                  var10 = 0;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                L20: {
                                  if (65535 < param1) {
                                    break L20;
                                  } else {
                                    L21: {
                                      od.field_m[4] = (byte)(var10 >> 1486857808);
                                      od.field_m[2] = (byte)(var9 >> 1991944);
                                      od.field_m[1] = (byte)param1;
                                      od.field_m[7] = (byte)this.field_a;
                                      od.field_m[5] = (byte)(var10 >> 1910636488);
                                      od.field_m[6] = (byte)var10;
                                      od.field_m[0] = (byte)(param1 >> -1936364664);
                                      od.field_m[3] = (byte)var9;
                                      this.field_f.a((byte) 118, (long)(var7_int * 520));
                                      this.field_f.a(od.field_m, 0, (byte) 122, 8);
                                      var11 = param3 + -var8;
                                      if (var11 > 512) {
                                        var11 = 512;
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                    this.field_f.a(param0, var8, (byte) 100, var11);
                                    var8 = var8 + var11;
                                    if (var16 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                L22: {
                                  od.field_m[9] = (byte)this.field_a;
                                  od.field_m[7] = (byte)(var10 >> -64779928);
                                  od.field_m[2] = (byte)(param1 >> 687109448);
                                  od.field_m[1] = (byte)(param1 >> 298839152);
                                  od.field_m[0] = (byte)(param1 >> 617579032);
                                  od.field_m[3] = (byte)param1;
                                  od.field_m[6] = (byte)(var10 >> -1241453136);
                                  od.field_m[4] = (byte)(var9 >> -1517906904);
                                  od.field_m[8] = (byte)var10;
                                  od.field_m[5] = (byte)var9;
                                  this.field_f.a((byte) 86, (long)(var7_int * 520));
                                  this.field_f.a(od.field_m, 0, (byte) 112, 10);
                                  var11 = param3 - var8;
                                  if ((var11 ^ -1) < -511) {
                                    var11 = 510;
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                this.field_f.a(param0, var8, (byte) 100, var11);
                                var8 = var8 + var11;
                                break L19;
                              }
                              var7_int = var10;
                              var9++;
                              if (var16 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        stackOut_64_0 = 1;
                        stackIn_65_0 = stackOut_64_0;
                        stackOut_65_0 = stackIn_65_0;
                        stackIn_66_0 = stackOut_65_0;
                        break L5;
                      }
                      decompiledRegionSelector2 = 0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_67_0 = 0;
                  stackIn_68_0 = stackOut_67_0;
                  return stackIn_68_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_66_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_7_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_13_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_38_0 != 0;
                      } else {
                        return stackIn_44_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L23: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_71_0 = (RuntimeException) (var6_ref);
                stackOut_71_1 = new StringBuilder().append("gf.D(");
                stackIn_73_0 = stackOut_71_0;
                stackIn_73_1 = stackOut_71_1;
                stackIn_72_0 = stackOut_71_0;
                stackIn_72_1 = stackOut_71_1;
                if (param0 == null) {
                  stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
                  stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
                  stackOut_73_2 = "null";
                  stackIn_74_0 = stackOut_73_0;
                  stackIn_74_1 = stackOut_73_1;
                  stackIn_74_2 = stackOut_73_2;
                  break L23;
                } else {
                  stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
                  stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
                  stackOut_72_2 = "{...}";
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_74_1 = stackOut_72_1;
                  stackIn_74_2 = stackOut_72_2;
                  break L23;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    gf(int param0, ch param1, ch param2, int param3) {
        this.field_d = null;
        this.field_f = null;
        this.field_e = 65000;
        try {
            this.field_f = param1;
            this.field_a = param0;
            this.field_e = param3;
            this.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "gf.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
