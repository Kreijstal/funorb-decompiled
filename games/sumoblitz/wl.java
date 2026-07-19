/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wl {
    static String field_b;
    private gj field_c;
    private int field_a;
    private int field_d;
    private gj field_e;

    private final boolean a(byte[] param0, boolean param1, int param2, int param3, int param4) {
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
            int stackIn_4_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_16_0 = 0;
            boolean stackIn_22_0 = false;
            int stackIn_38_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_45_0 = 0;
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
            int stackOut_8_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            boolean stackOut_21_0 = false;
            int stackOut_43_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_67_0 = 0;
            int stackOut_3_0 = 0;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            String stackOut_73_2 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            var16 = Sumoblitz.field_L ? 1 : 0;
            try {
              var6_ref2 = this.field_c;
              synchronized (var6_ref2) {
                if (param4 == 255) {
                  try {
                    L0: {
                      L1: {
                        if (!param1) {
                          var7_int = (int)((this.field_c.a((byte) -60) - -519L) / 520L);
                          if (var7_int != 0) {
                            break L1;
                          } else {
                            var7_int = 1;
                            break L1;
                          }
                        } else {
                          if ((this.field_e.a((byte) -60) ^ -1L) > ((long)(param3 * 6 + 6) ^ -1L)) {
                            stackOut_8_0 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            stackOut_9_0 = stackIn_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            decompiledRegionSelector2 = 1;
                            break L0;
                          } else {
                            L2: {
                              this.field_e.a(-7564, (long)(6 * param3));
                              this.field_e.a(6, 0, to.field_t, -111);
                              var7_int = (to.field_t[3] << -1986960720 & 16711680) + (to.field_t[4] << 939853608 & 65280) - -(255 & to.field_t[5]);
                              if (0 >= var7_int) {
                                break L2;
                              } else {
                                if ((this.field_c.a((byte) -60) / 520L ^ -1L) > ((long)var7_int ^ -1L)) {
                                  break L2;
                                } else {
                                  break L1;
                                }
                              }
                            }
                            stackOut_14_0 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            decompiledRegionSelector2 = 2;
                            break L0;
                          }
                        }
                      }
                      to.field_t[1] = (byte)(param2 >> -1219525112);
                      to.field_t[4] = (byte)(var7_int >> 1194522600);
                      to.field_t[5] = (byte)var7_int;
                      to.field_t[3] = (byte)(var7_int >> 1031016240);
                      to.field_t[2] = (byte)param2;
                      to.field_t[0] = (byte)(param2 >> -816110096);
                      this.field_e.a(-7564, (long)(6 * param3));
                      this.field_e.a(to.field_t, 6, (byte) -50, 0);
                      var8 = 0;
                      var9 = 0;
                      L3: while (true) {
                        L4: {
                          L5: {
                            if (param2 <= var8) {
                              break L5;
                            } else {
                              var10 = 0;
                              stackOut_21_0 = param1;
                              stackIn_66_0 = stackOut_21_0 ? 1 : 0;
                              stackIn_22_0 = stackOut_21_0;
                              if (var16 != 0) {
                                break L4;
                              } else {
                                L6: {
                                  if (!stackIn_22_0) {
                                    break L6;
                                  } else {
                                    L7: {
                                      L8: {
                                        this.field_c.a(-7564, (long)(var7_int * 520));
                                        if (param3 <= 65535) {
                                          break L8;
                                        } else {
                                          try {
                                            L9: {
                                              this.field_c.a(10, 0, to.field_t, -108);
                                              decompiledRegionSelector1 = 0;
                                              break L9;
                                            }
                                          } catch (java.io.EOFException decompiledCaughtParameter0) {
                                            decompiledCaughtException = decompiledCaughtParameter0;
                                            L10: {
                                              var14 = (EOFException) (Object) decompiledCaughtException;
                                              if (var16 == 0) {
                                                decompiledRegionSelector1 = 1;
                                                break L10;
                                              } else {
                                                decompiledRegionSelector1 = 0;
                                                break L10;
                                              }
                                            }
                                          }
                                          if (decompiledRegionSelector1 == 0) {
                                            var13 = to.field_t[9] & 255;
                                            var10 = ((255 & to.field_t[7]) << 1428007304) + (((to.field_t[6] & 255) << -1291481040) + (255 & to.field_t[8]));
                                            var11 = (255 & to.field_t[3]) + (to.field_t[1] << -328166064 & 16711680) + ((to.field_t[0] & 255) << -979088008) - -(65280 & to.field_t[2] << 628736936);
                                            var12 = (255 & to.field_t[5]) + ((255 & to.field_t[4]) << -1510095864);
                                            if (var16 == 0) {
                                              break L7;
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      try {
                                        L11: {
                                          this.field_c.a(8, 0, to.field_t, -64);
                                          decompiledRegionSelector0 = 0;
                                          break L11;
                                        }
                                      } catch (java.io.EOFException decompiledCaughtParameter1) {
                                        decompiledCaughtException = decompiledCaughtParameter1;
                                        L12: {
                                          var14 = (EOFException) (Object) decompiledCaughtException;
                                          if (var16 == 0) {
                                            decompiledRegionSelector0 = 1;
                                            break L12;
                                          } else {
                                            decompiledRegionSelector0 = 0;
                                            break L12;
                                          }
                                        }
                                      }
                                      if (decompiledRegionSelector0 == 0) {
                                        var10 = (255 & to.field_t[6]) + (16711680 & to.field_t[4] << -1177425904) + ((to.field_t[5] & 255) << -913508696);
                                        var13 = to.field_t[7] & 255;
                                        var11 = (to.field_t[1] & 255) + (65280 & to.field_t[0] << 1627523656);
                                        var12 = ((255 & to.field_t[2]) << 926588392) - -(to.field_t[3] & 255);
                                        break L7;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    L13: {
                                      if (param3 != var11) {
                                        break L13;
                                      } else {
                                        if (var9 != var12) {
                                          break L13;
                                        } else {
                                          if (var13 == this.field_d) {
                                            L14: {
                                              if (0 > var10) {
                                                break L14;
                                              } else {
                                                if ((long)var10 > this.field_c.a((byte) -60) / 520L) {
                                                  break L14;
                                                } else {
                                                  break L6;
                                                }
                                              }
                                            }
                                            stackOut_43_0 = 0;
                                            stackIn_44_0 = stackOut_43_0;
                                            stackOut_44_0 = stackIn_44_0;
                                            stackIn_45_0 = stackOut_44_0;
                                            decompiledRegionSelector2 = 4;
                                            break L0;
                                          } else {
                                            break L13;
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
                                L15: {
                                  if (0 == var10) {
                                    L16: {
                                      param1 = false;
                                      var10 = (int)((519L + this.field_c.a((byte) -60)) / 520L);
                                      if (var10 == 0) {
                                        var10++;
                                        break L16;
                                      } else {
                                        break L16;
                                      }
                                    }
                                    if (var10 != var7_int) {
                                      break L15;
                                    } else {
                                      var10++;
                                      break L15;
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                                L17: {
                                  if ((-var8 + param2 ^ -1) >= -513) {
                                    var10 = 0;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                L18: {
                                  L19: {
                                    if ((param3 ^ -1) >= -65536) {
                                      break L19;
                                    } else {
                                      L20: {
                                        to.field_t[8] = (byte)var10;
                                        to.field_t[7] = (byte)(var10 >> 898422824);
                                        to.field_t[6] = (byte)(var10 >> 283051600);
                                        to.field_t[3] = (byte)param3;
                                        to.field_t[9] = (byte)this.field_d;
                                        to.field_t[5] = (byte)var9;
                                        to.field_t[0] = (byte)(param3 >> -871653448);
                                        to.field_t[4] = (byte)(var9 >> 41034760);
                                        to.field_t[1] = (byte)(param3 >> -2014710224);
                                        to.field_t[2] = (byte)(param3 >> -1170731512);
                                        this.field_c.a(-7564, (long)(var7_int * 520));
                                        this.field_c.a(to.field_t, 10, (byte) 126, 0);
                                        var11 = param2 - var8;
                                        if (510 >= var11) {
                                          break L20;
                                        } else {
                                          var11 = 510;
                                          break L20;
                                        }
                                      }
                                      this.field_c.a(param0, var11, (byte) 126, var8);
                                      var8 = var8 + var11;
                                      if (var16 == 0) {
                                        break L18;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  L21: {
                                    to.field_t[4] = (byte)(var10 >> 1834015184);
                                    to.field_t[5] = (byte)(var10 >> -1067013112);
                                    to.field_t[2] = (byte)(var9 >> -714520024);
                                    to.field_t[0] = (byte)(param3 >> -340848216);
                                    to.field_t[7] = (byte)this.field_d;
                                    to.field_t[6] = (byte)var10;
                                    to.field_t[3] = (byte)var9;
                                    to.field_t[1] = (byte)param3;
                                    this.field_c.a(param4 + -7819, (long)(var7_int * 520));
                                    this.field_c.a(to.field_t, 8, (byte) 65, 0);
                                    var11 = -var8 + param2;
                                    if (var11 <= 512) {
                                      break L21;
                                    } else {
                                      var11 = 512;
                                      break L21;
                                    }
                                  }
                                  this.field_c.a(param0, var11, (byte) -121, var8);
                                  var8 = var8 + var11;
                                  break L18;
                                }
                                var9++;
                                var7_int = var10;
                                continue L3;
                              }
                            }
                          }
                          stackOut_64_0 = 1;
                          stackIn_65_0 = stackOut_64_0;
                          stackOut_65_0 = stackIn_65_0;
                          stackIn_66_0 = stackOut_65_0;
                          break L4;
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
                      return stackIn_10_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 2) {
                        return stackIn_16_0 != 0;
                      } else {
                        if (decompiledRegionSelector2 == 3) {
                          return stackIn_39_0 != 0;
                        } else {
                          return stackIn_45_0 != 0;
                        }
                      }
                    }
                  }
                } else {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0 != 0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L22: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_71_0 = (RuntimeException) (var6_ref);
                stackOut_71_1 = new StringBuilder().append("wl.A(");
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
                  break L22;
                } else {
                  stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
                  stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
                  stackOut_72_2 = "{...}";
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_74_1 = stackOut_72_1;
                  stackIn_74_2 = stackOut_72_2;
                  break L22;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_d;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -90) {
            field_b = (String) null;
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
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            int stackIn_20_0 = 0;
            int stackIn_20_1 = 0;
            Object stackIn_22_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_39_0 = null;
            int stackIn_54_0 = 0;
            int stackIn_54_1 = 0;
            byte[] stackIn_55_0 = null;
            byte[] stackIn_56_0 = null;
            Object stackIn_58_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_53_0 = 0;
            int stackOut_53_1 = 0;
            int stackOut_19_0 = 0;
            int stackOut_19_1 = 0;
            Object stackOut_37_0 = null;
            Object stackOut_38_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_22_0 = null;
            byte[] stackOut_54_0 = null;
            byte[] stackOut_55_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_57_0 = null;
            var18 = Sumoblitz.field_L ? 1 : 0;
            var3 = this.field_c;
            synchronized (var3) {
              try {
                L0: {
                  if (this.field_e.a((byte) -60) >= (long)(6 + param1 * 6)) {
                    this.field_e.a(-7564, (long)(6 * param1));
                    this.field_e.a(6, 0, to.field_t, -104);
                    var4_int = (65280 & to.field_t[1] << -1287640792) + (((255 & to.field_t[0]) << -1376047440) + (255 & to.field_t[2]));
                    var5 = ((255 & to.field_t[3]) << 701270832) + (65280 & to.field_t[4] << -1691931768) - -(255 & to.field_t[5]);
                    if (var4_int >= 0) {
                      if (this.field_a >= var4_int) {
                        if (var5 > 0) {
                          if (this.field_c.a((byte) -60) / 520L >= (long)var5) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              L2: {
                                if (var7 >= var4_int) {
                                  stackOut_53_0 = 9;
                                  stackOut_53_1 = (-33 - param0) / 59;
                                  stackIn_54_0 = stackOut_53_0;
                                  stackIn_54_1 = stackOut_53_1;
                                  break L2;
                                } else {
                                  stackOut_19_0 = var5 ^ -1;
                                  stackOut_19_1 = -1;
                                  stackIn_54_0 = stackOut_19_0;
                                  stackIn_54_1 = stackOut_19_1;
                                  stackIn_20_0 = stackOut_19_0;
                                  stackIn_20_1 = stackOut_19_1;
                                  if (var18 != 0) {
                                    break L2;
                                  } else {
                                    if (stackIn_20_0 != stackIn_20_1) {
                                      L3: {
                                        L4: {
                                          this.field_c.a(-7564, (long)(var5 * 520));
                                          var9 = var4_int + -var7;
                                          if (param1 <= 65535) {
                                            break L4;
                                          } else {
                                            L5: {
                                              if (var9 <= 510) {
                                                break L5;
                                              } else {
                                                var9 = 510;
                                                break L5;
                                              }
                                            }
                                            var14 = 10;
                                            this.field_c.a(var9 + var14, 0, to.field_t, -93);
                                            var10 = (to.field_t[3] & 255) + (to.field_t[2] << -25652792 & 65280) + ((to.field_t[1] & 255) << 97457648) + ((to.field_t[0] & 255) << 889211128);
                                            var13 = to.field_t[9] & 255;
                                            var12 = (to.field_t[8] & 255) + (to.field_t[7] << -1603142936 & 65280) + ((to.field_t[6] & 255) << -375772624);
                                            var11 = ((255 & to.field_t[4]) << -1469508952) - -(to.field_t[5] & 255);
                                            if (var18 == 0) {
                                              break L3;
                                            } else {
                                              break L4;
                                            }
                                          }
                                        }
                                        L6: {
                                          var14 = 8;
                                          if (-513 > (var9 ^ -1)) {
                                            var9 = 512;
                                            break L6;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        this.field_c.a(var9 - -var14, 0, to.field_t, -55);
                                        var11 = (255 & to.field_t[3]) + ((255 & to.field_t[2]) << -2032926552);
                                        var13 = to.field_t[7] & 255;
                                        var12 = (255 & to.field_t[6]) + (((255 & to.field_t[5]) << -351227736) + (16711680 & to.field_t[4] << -908122928));
                                        var10 = ((to.field_t[0] & 255) << -90301720) - -(to.field_t[1] & 255);
                                        break L3;
                                      }
                                      if (var10 == param1) {
                                        if (var11 == var8) {
                                          if (var13 == this.field_d) {
                                            if ((var12 ^ -1) <= -1) {
                                              if ((long)var12 <= this.field_c.a((byte) -60) / 520L) {
                                                var15 = var14 - -var9;
                                                var16 = var14;
                                                L7: while (true) {
                                                  L8: {
                                                    if (var16 >= var15) {
                                                      var5 = var12;
                                                      var8++;
                                                      break L8;
                                                    } else {
                                                      incrementValue$1 = var7;
                                                      var7++;
                                                      var6[incrementValue$1] = to.field_t[var16];
                                                      var16++;
                                                      if (var18 != 0) {
                                                        break L8;
                                                      } else {
                                                        continue L7;
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
                                      stackOut_21_0 = null;
                                      stackIn_22_0 = stackOut_21_0;
                                      stackOut_22_0 = stackIn_22_0;
                                      stackIn_23_0 = stackOut_22_0;
                                      decompiledRegionSelector0 = 1;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              var9 = stackIn_54_0 % stackIn_54_1;
                              stackOut_54_0 = (byte[]) (var6);
                              stackIn_55_0 = stackOut_54_0;
                              stackOut_55_0 = (byte[]) ((Object) stackIn_55_0);
                              stackIn_56_0 = stackOut_55_0;
                              decompiledRegionSelector0 = 3;
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
                stackOut_57_0 = null;
                stackIn_58_0 = stackOut_57_0;
                return (byte[]) ((Object) stackIn_58_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_4_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_23_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_39_0);
                  } else {
                    return stackIn_56_0;
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

    final boolean a(byte[] param0, int param1, int param2, int param3) {
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
            var5 = this.field_c;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param3 > param2) {
                    break L2;
                  } else {
                    if (this.field_a >= param2) {
                      L3: {
                        var6 = this.a(param0, true, param2, param1, 255) ? 1 : 0;
                        if (var6 != 0) {
                          break L3;
                        } else {
                          var6 = this.a(param0, false, param2, param1, 255) ? 1 : 0;
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
            stackOut_10_1 = new StringBuilder().append("wl.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0 != 0;
    }

    wl(int param0, gj param1, gj param2, int param3) {
        this.field_a = 65000;
        this.field_c = null;
        this.field_e = null;
        try {
            this.field_e = param2;
            this.field_c = param1;
            this.field_d = param0;
            this.field_a = param3;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "wl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_b = "Service unavailable";
    }
}
