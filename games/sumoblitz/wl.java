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
            int stackIn_8_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_15_0 = 0;
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
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
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
            var16 = Sumoblitz.field_L ? 1 : 0;
            try {
              var6_ref2 = (Object) (Object) ((wl) this).field_c;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param1) {
                        var7_int = (int)((((wl) this).field_c.a((byte) -60) - -519L) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if (~((wl) this).field_e.a((byte) -60) > ~(long)(param3 * 6 + 6)) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        } else {
                          L2: {
                            ((wl) this).field_e.a(-7564, (long)(6 * param3));
                            ((wl) this).field_e.a(6, 0, to.field_t, -111);
                            var7_int = (to.field_t[3] << 16 & 16711680) + (to.field_t[4] << 8 & 65280) - -(255 & to.field_t[5]);
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if (~(((wl) this).field_c.a((byte) -60) / 520L) > ~(long)var7_int) {
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
                          return stackIn_15_0 != 0;
                        }
                      }
                    }
                    to.field_t[1] = (byte)(param2 >> 8);
                    to.field_t[4] = (byte)(var7_int >> 8);
                    to.field_t[5] = (byte)var7_int;
                    to.field_t[3] = (byte)(var7_int >> 16);
                    to.field_t[2] = (byte)param2;
                    to.field_t[0] = (byte)(param2 >> 16);
                    ((wl) this).field_e.a(-7564, (long)(6 * param3));
                    ((wl) this).field_e.a(to.field_t, 6, (byte) -50, 0);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (param2 <= var8) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (!param1) {
                              break L5;
                            } else {
                              L6: {
                                ((wl) this).field_c.a(-7564, (long)(var7_int * 520));
                                if (param3 <= 65535) {
                                  try {
                                    L7: {
                                      ((wl) this).field_c.a(8, 0, to.field_t, -64);
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
                                    var10 = (255 & to.field_t[6]) + (16711680 & to.field_t[4] << 16) + ((to.field_t[5] & 255) << 8);
                                    var13 = to.field_t[7] & 255;
                                    var11 = (to.field_t[1] & 255) + (65280 & to.field_t[0] << 8);
                                    var12 = ((255 & to.field_t[2]) << 8) - -(to.field_t[3] & 255);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((wl) this).field_c.a(10, 0, to.field_t, -108);
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
                                    var13 = to.field_t[9] & 255;
                                    var10 = ((255 & to.field_t[7]) << 8) + (((to.field_t[6] & 255) << 16) + (255 & to.field_t[8]));
                                    var11 = (255 & to.field_t[3]) + (to.field_t[1] << 16 & 16711680) + ((to.field_t[0] & 255) << 24) - -(65280 & to.field_t[2] << 8);
                                    var12 = (255 & to.field_t[5]) + ((255 & to.field_t[4]) << 8);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (param3 != var11) {
                                  break L11;
                                } else {
                                  if (var9 != var12) {
                                    break L11;
                                  } else {
                                    if (var13 == ((wl) this).field_d) {
                                      L12: {
                                        if (0 > var10) {
                                          break L12;
                                        } else {
                                          if ((long)var10 > ((wl) this).field_c.a((byte) -60) / 520L) {
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
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              stackOut_35_0 = 0;
                              stackIn_36_0 = stackOut_35_0;
                              stackOut_36_0 = stackIn_36_0;
                              stackIn_37_0 = stackOut_36_0;
                              return stackIn_37_0 != 0;
                            }
                          }
                          L13: {
                            if (0 == var10) {
                              L14: {
                                param1 = false;
                                var10 = (int)((519L + ((wl) this).field_c.a((byte) -60)) / 520L);
                                if (var10 == 0) {
                                  var10++;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              if (var10 != var7_int) {
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
                            if (-var8 + param2 <= 512) {
                              var10 = 0;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (param3 <= 65535) {
                              L17: {
                                to.field_t[4] = (byte)(var10 >> 16);
                                to.field_t[5] = (byte)(var10 >> 8);
                                to.field_t[2] = (byte)(var9 >> 8);
                                to.field_t[0] = (byte)(param3 >> 8);
                                to.field_t[7] = (byte)((wl) this).field_d;
                                to.field_t[6] = (byte)var10;
                                to.field_t[3] = (byte)var9;
                                to.field_t[1] = (byte)param3;
                                ((wl) this).field_c.a(-7564, (long)(var7_int * 520));
                                ((wl) this).field_c.a(to.field_t, 8, (byte) 65, 0);
                                var11 = -var8 + param2;
                                if (var11 <= 512) {
                                  break L17;
                                } else {
                                  var11 = 512;
                                  break L17;
                                }
                              }
                              ((wl) this).field_c.a(param0, var11, (byte) -121, var8);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                to.field_t[8] = (byte)var10;
                                to.field_t[7] = (byte)(var10 >> 8);
                                to.field_t[6] = (byte)(var10 >> 16);
                                to.field_t[3] = (byte)param3;
                                to.field_t[9] = (byte)((wl) this).field_d;
                                to.field_t[5] = (byte)var9;
                                to.field_t[0] = (byte)(param3 >> 24);
                                to.field_t[4] = (byte)(var9 >> 8);
                                to.field_t[1] = (byte)(param3 >> 16);
                                to.field_t[2] = (byte)(param3 >> 8);
                                ((wl) this).field_c.a(-7564, (long)(var7_int * 520));
                                ((wl) this).field_c.a(to.field_t, 10, (byte) 126, 0);
                                var11 = param2 - var8;
                                if (510 >= var11) {
                                  break L18;
                                } else {
                                  var11 = 510;
                                  break L18;
                                }
                              }
                              ((wl) this).field_c.a(param0, var11, (byte) 126, var8);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L3;
                        }
                      }
                      stackOut_62_0 = 1;
                      stackIn_63_0 = stackOut_62_0;
                      stackOut_63_0 = stackIn_63_0;
                      stackIn_64_0 = stackOut_63_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_65_0 = 0;
                  stackIn_66_0 = stackOut_65_0;
                  return stackIn_66_0 != 0;
                }
                return stackIn_64_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_69_0 = (RuntimeException) var6_ref;
                stackOut_69_1 = new StringBuilder().append("wl.A(");
                stackIn_71_0 = stackOut_69_0;
                stackIn_71_1 = stackOut_69_1;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                if (param0 == null) {
                  stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
                  stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
                  stackOut_71_2 = "null";
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  stackIn_72_2 = stackOut_71_2;
                  break L19;
                } else {
                  stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
                  stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
                  stackOut_70_2 = "{...}";
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  stackIn_72_2 = stackOut_70_2;
                  break L19;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + 255 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((wl) this).field_d;
    }

    public static void a(byte param0) {
        field_b = null;
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
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_37_0 = null;
            Object stackIn_38_0 = null;
            byte[] stackIn_50_0 = null;
            byte[] stackIn_51_0 = null;
            Object stackIn_53_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_49_0 = null;
            byte[] stackOut_50_0 = null;
            Object stackOut_36_0 = null;
            Object stackOut_37_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_52_0 = null;
            var18 = Sumoblitz.field_L ? 1 : 0;
            var3 = (Object) (Object) ((wl) this).field_c;
            synchronized (var3) {
              try {
                L0: {
                  if (((wl) this).field_e.a((byte) -60) >= (long)(6 + param1 * 6)) {
                    ((wl) this).field_e.a(-7564, (long)(6 * param1));
                    ((wl) this).field_e.a(6, 0, to.field_t, -104);
                    var4_int = (65280 & to.field_t[1] << 8) + (((255 & to.field_t[0]) << 16) + (255 & to.field_t[2]));
                    var5 = ((255 & to.field_t[3]) << 16) + (65280 & to.field_t[4] << 8) - -(255 & to.field_t[5]);
                    if (var4_int >= 0) {
                      if (((wl) this).field_a >= var4_int) {
                        if (var5 > 0) {
                          if (((wl) this).field_c.a((byte) -60) / 520L >= (long)var5) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var7 >= var4_int) {
                                var9 = 9 % ((-33 - param0) / 59);
                                stackOut_49_0 = (byte[]) var6;
                                stackIn_50_0 = stackOut_49_0;
                                stackOut_50_0 = (byte[]) (Object) stackIn_50_0;
                                stackIn_51_0 = stackOut_50_0;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L2: {
                                    ((wl) this).field_c.a(-7564, (long)(var5 * 520));
                                    var9 = var4_int + -var7;
                                    if (param1 <= 65535) {
                                      L3: {
                                        var14 = 8;
                                        if (var9 > 512) {
                                          var9 = 512;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                      ((wl) this).field_c.a(var9 - -var14, 0, to.field_t, -55);
                                      var11 = (255 & to.field_t[3]) + ((255 & to.field_t[2]) << 8);
                                      var13 = to.field_t[7] & 255;
                                      var12 = (255 & to.field_t[6]) + (((255 & to.field_t[5]) << 8) + (16711680 & to.field_t[4] << 16));
                                      var10 = ((to.field_t[0] & 255) << 8) - -(to.field_t[1] & 255);
                                      break L2;
                                    } else {
                                      L4: {
                                        if (var9 <= 510) {
                                          break L4;
                                        } else {
                                          var9 = 510;
                                          break L4;
                                        }
                                      }
                                      var14 = 10;
                                      ((wl) this).field_c.a(var9 + var14, 0, to.field_t, -93);
                                      var10 = (to.field_t[3] & 255) + (to.field_t[2] << 8 & 65280) + ((to.field_t[1] & 255) << 16) + ((to.field_t[0] & 255) << 24);
                                      var13 = to.field_t[9] & 255;
                                      var12 = (to.field_t[8] & 255) + (to.field_t[7] << 8 & 65280) + ((to.field_t[6] & 255) << 16);
                                      var11 = ((255 & to.field_t[4]) << 8) - -(to.field_t[5] & 255);
                                      break L2;
                                    }
                                  }
                                  if (var10 == param1) {
                                    if (var11 == var8) {
                                      if (var13 == ((wl) this).field_d) {
                                        if (var12 >= 0) {
                                          if ((long)var12 <= ((wl) this).field_c.a((byte) -60) / 520L) {
                                            var15 = var14 - -var9;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var16 >= var15) {
                                                var5 = var12;
                                                var8++;
                                                continue L1;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = to.field_t[var16];
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
                                        stackOut_36_0 = null;
                                        stackIn_37_0 = stackOut_36_0;
                                        stackOut_37_0 = stackIn_37_0;
                                        stackIn_38_0 = stackOut_37_0;
                                        return (byte[]) (Object) stackIn_38_0;
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
                    return (byte[]) (Object) stackIn_4_0;
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
          var5 = (Object) (Object) ((wl) this).field_c;
          synchronized (var5) {
            L0: {
              L1: {
                if (param3 > param2) {
                  break L1;
                } else {
                  if (((wl) this).field_a >= param2) {
                    L2: {
                      var6 = this.a(param0, true, param2, param1, 255) ? 1 : 0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        var6 = this.a(param0, false, param2, param1, 255) ? 1 : 0;
                        break L2;
                      }
                    }
                    stackOut_6_0 = var6;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_7_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5_ref;
            stackOut_10_1 = new StringBuilder().append("wl.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    wl(int param0, gj param1, gj param2, int param3) {
        ((wl) this).field_a = 65000;
        ((wl) this).field_c = null;
        ((wl) this).field_e = null;
        try {
            ((wl) this).field_e = param2;
            ((wl) this).field_c = param1;
            ((wl) this).field_d = param0;
            ((wl) this).field_a = param3;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "wl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Service unavailable";
    }
}
