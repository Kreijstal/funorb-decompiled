/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eh {
    private int field_f;
    private dj field_b;
    static int field_a;
    private dj field_d;
    private int field_e;
    static volatile int field_c;

    final boolean a(byte[] param0, int param1, int param2, int param3) {
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
            L1: {
              if (param1 == 255) {
                break L1;
              } else {
                this.field_d = (dj) null;
                break L1;
              }
            }
            var5 = this.field_d;
            synchronized (var5) {
              L2: {
                L3: {
                  if (-1 < (param2 ^ -1)) {
                    break L3;
                  } else {
                    if (param2 <= this.field_e) {
                      L4: {
                        var6 = this.a(param0, true, param3, true, param2) ? 1 : 0;
                        if (var6 != 0) {
                          break L4;
                        } else {
                          var6 = this.a(param0, true, param3, false, param2) ? 1 : 0;
                          break L4;
                        }
                      }
                      stackOut_8_0 = var6;
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      break L3;
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
            stackOut_12_1 = new StringBuilder().append("eh.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0 != 0;
    }

    private final boolean a(byte[] param0, boolean param1, int param2, boolean param3, int param4) {
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
            boolean stackIn_19_0 = false;
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            dj stackIn_54_0 = null;
            dj stackIn_55_0 = null;
            dj stackIn_56_0 = null;
            int stackIn_56_1 = 0;
            dj stackIn_61_0 = null;
            dj stackIn_62_0 = null;
            dj stackIn_63_0 = null;
            int stackIn_63_1 = 0;
            dj stackIn_67_0 = null;
            dj stackIn_68_0 = null;
            dj stackIn_69_0 = null;
            int stackIn_69_1 = 0;
            boolean stackIn_72_0 = false;
            boolean stackIn_73_0 = false;
            int stackIn_75_0 = 0;
            RuntimeException stackIn_79_0 = null;
            StringBuilder stackIn_79_1 = null;
            RuntimeException stackIn_80_0 = null;
            StringBuilder stackIn_80_1 = null;
            RuntimeException stackIn_81_0 = null;
            StringBuilder stackIn_81_1 = null;
            String stackIn_81_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            boolean stackOut_18_0 = false;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            dj stackOut_53_0 = null;
            dj stackOut_55_0 = null;
            int stackOut_55_1 = 0;
            dj stackOut_54_0 = null;
            int stackOut_54_1 = 0;
            dj stackOut_60_0 = null;
            dj stackOut_62_0 = null;
            int stackOut_62_1 = 0;
            dj stackOut_61_0 = null;
            int stackOut_61_1 = 0;
            dj stackOut_66_0 = null;
            dj stackOut_68_0 = null;
            int stackOut_68_1 = 0;
            dj stackOut_67_0 = null;
            int stackOut_67_1 = 0;
            boolean stackOut_71_0 = false;
            boolean stackOut_72_0 = false;
            int stackOut_74_0 = 0;
            RuntimeException stackOut_78_0 = null;
            StringBuilder stackOut_78_1 = null;
            RuntimeException stackOut_80_0 = null;
            StringBuilder stackOut_80_1 = null;
            String stackOut_80_2 = null;
            RuntimeException stackOut_79_0 = null;
            StringBuilder stackOut_79_1 = null;
            String stackOut_79_2 = null;
            var16 = OrbDefence.field_D ? 1 : 0;
            try {
              var6_ref2 = this.field_d;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param3) {
                        var7_int = (int)((519L + this.field_d.b(-107)) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if (((long)(6 + 6 * param2) ^ -1L) < (this.field_b.b(-34) ^ -1L)) {
                          stackOut_5_0 = 0;
                          stackIn_6_0 = stackOut_5_0;
                          stackOut_6_0 = stackIn_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        } else {
                          L2: {
                            this.field_b.a((long)(param2 * 6), -1);
                            this.field_b.a(0, (byte) -119, 6, bi.field_c);
                            var7_int = (bi.field_c[4] << 1504311912 & 65280) + ((bi.field_c[3] << -958841744 & 16711680) + (bi.field_c[5] & 255));
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if (((long)var7_int ^ -1L) >= (this.field_d.b(-103) / 520L ^ -1L)) {
                                break L1;
                              } else {
                                break L2;
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
                    bi.field_c[3] = (byte)(var7_int >> -867337680);
                    bi.field_c[1] = (byte)(param4 >> 2066150472);
                    bi.field_c[4] = (byte)(var7_int >> -1180948952);
                    bi.field_c[0] = (byte)(param4 >> 1871805904);
                    bi.field_c[5] = (byte)var7_int;
                    bi.field_c[2] = (byte)param4;
                    this.field_b.a((long)(6 * param2), -1);
                    this.field_b.a(false, bi.field_c, 6, 0);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (var8 >= param4) {
                            break L5;
                          } else {
                            var10 = 0;
                            stackOut_18_0 = param3;
                            stackIn_73_0 = stackOut_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            if (var16 != 0) {
                              break L4;
                            } else {
                              L6: {
                                if (stackIn_19_0) {
                                  L7: {
                                    L8: {
                                      this.field_d.a((long)(var7_int * 520), -1);
                                      if ((param2 ^ -1) >= -65536) {
                                        break L8;
                                      } else {
                                        try {
                                          L9: {
                                            this.field_d.a(0, (byte) -128, 10, bi.field_c);
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
                                          var10 = ((255 & bi.field_c[6]) << -817022192) - -(65280 & bi.field_c[7] << -1997624536) - -(255 & bi.field_c[8]);
                                          var12 = ((bi.field_c[4] & 255) << 132880584) + (bi.field_c[5] & 255);
                                          var13 = bi.field_c[9] & 255;
                                          var11 = (bi.field_c[3] & 255) + (((255 & bi.field_c[1]) << 1965377168) + (((255 & bi.field_c[0]) << -685276200) + ((255 & bi.field_c[2]) << 1793109224)));
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
                                        this.field_d.a(0, (byte) 81, 8, bi.field_c);
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
                                      var10 = (255 & bi.field_c[6]) + (((255 & bi.field_c[4]) << 1465092944) + (65280 & bi.field_c[5] << 79431016));
                                      var13 = 255 & bi.field_c[7];
                                      var12 = (bi.field_c[3] & 255) + ((255 & bi.field_c[2]) << 2034003304);
                                      var11 = ((255 & bi.field_c[0]) << -1989688888) + (255 & bi.field_c[1]);
                                      break L7;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  L13: {
                                    if (var11 != param2) {
                                      break L13;
                                    } else {
                                      if (var9 != var12) {
                                        break L13;
                                      } else {
                                        if (this.field_f != var13) {
                                          break L13;
                                        } else {
                                          L14: {
                                            if (-1 < (var10 ^ -1)) {
                                              break L14;
                                            } else {
                                              if ((long)var10 > this.field_d.b(114) / 520L) {
                                                break L14;
                                              } else {
                                                break L6;
                                              }
                                            }
                                          }
                                          stackOut_40_0 = 0;
                                          stackIn_41_0 = stackOut_40_0;
                                          stackOut_41_0 = stackIn_41_0;
                                          stackIn_42_0 = stackOut_41_0;
                                          decompiledRegionSelector2 = 4;
                                          break L0;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_34_0 = 0;
                                  stackIn_35_0 = stackOut_34_0;
                                  stackOut_35_0 = stackIn_35_0;
                                  stackIn_36_0 = stackOut_35_0;
                                  decompiledRegionSelector2 = 3;
                                  break L0;
                                } else {
                                  break L6;
                                }
                              }
                              L15: {
                                if (var10 == 0) {
                                  L16: {
                                    var10 = (int)((this.field_d.b(123) + 519L) / 520L);
                                    param3 = false;
                                    if (var10 != 0) {
                                      break L16;
                                    } else {
                                      var10++;
                                      break L16;
                                    }
                                  }
                                  if (var7_int == var10) {
                                    var10++;
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                } else {
                                  break L15;
                                }
                              }
                              L17: {
                                if (param4 - var8 > 512) {
                                  break L17;
                                } else {
                                  var10 = 0;
                                  break L17;
                                }
                              }
                              L18: {
                                L19: {
                                  if ((param2 ^ -1) < -65536) {
                                    break L19;
                                  } else {
                                    L20: {
                                      bi.field_c[2] = (byte)(var9 >> -1029826360);
                                      bi.field_c[5] = (byte)(var10 >> 415630792);
                                      bi.field_c[6] = (byte)var10;
                                      bi.field_c[7] = (byte)this.field_f;
                                      bi.field_c[0] = (byte)(param2 >> 397246344);
                                      bi.field_c[1] = (byte)param2;
                                      bi.field_c[4] = (byte)(var10 >> 295660592);
                                      bi.field_c[3] = (byte)var9;
                                      this.field_d.a((long)(var7_int * 520), -1);
                                      stackOut_53_0 = this.field_d;
                                      stackIn_55_0 = stackOut_53_0;
                                      stackIn_54_0 = stackOut_53_0;
                                      if (param1) {
                                        stackOut_55_0 = (dj) ((Object) stackIn_55_0);
                                        stackOut_55_1 = 0;
                                        stackIn_56_0 = stackOut_55_0;
                                        stackIn_56_1 = stackOut_55_1;
                                        break L20;
                                      } else {
                                        stackOut_54_0 = (dj) ((Object) stackIn_54_0);
                                        stackOut_54_1 = 1;
                                        stackIn_56_0 = stackOut_54_0;
                                        stackIn_56_1 = stackOut_54_1;
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      ((dj) (Object) stackIn_56_0).a(stackIn_56_1 != 0, bi.field_c, 8, 0);
                                      var11 = -var8 + param4;
                                      if (512 < var11) {
                                        var11 = 512;
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                    this.field_d.a(false, param0, var11, var8);
                                    var8 = var8 + var11;
                                    if (var16 == 0) {
                                      break L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                                L22: {
                                  bi.field_c[4] = (byte)(var9 >> 1830743496);
                                  bi.field_c[9] = (byte)this.field_f;
                                  bi.field_c[1] = (byte)(param2 >> -530000048);
                                  bi.field_c[0] = (byte)(param2 >> -1194524584);
                                  bi.field_c[5] = (byte)var9;
                                  bi.field_c[6] = (byte)(var10 >> -458731184);
                                  bi.field_c[2] = (byte)(param2 >> -960265624);
                                  bi.field_c[8] = (byte)var10;
                                  bi.field_c[7] = (byte)(var10 >> 1582423656);
                                  bi.field_c[3] = (byte)param2;
                                  this.field_d.a((long)(520 * var7_int), -1);
                                  stackOut_60_0 = this.field_d;
                                  stackIn_62_0 = stackOut_60_0;
                                  stackIn_61_0 = stackOut_60_0;
                                  if (param1) {
                                    stackOut_62_0 = (dj) ((Object) stackIn_62_0);
                                    stackOut_62_1 = 0;
                                    stackIn_63_0 = stackOut_62_0;
                                    stackIn_63_1 = stackOut_62_1;
                                    break L22;
                                  } else {
                                    stackOut_61_0 = (dj) ((Object) stackIn_61_0);
                                    stackOut_61_1 = 1;
                                    stackIn_63_0 = stackOut_61_0;
                                    stackIn_63_1 = stackOut_61_1;
                                    break L22;
                                  }
                                }
                                L23: {
                                  ((dj) (Object) stackIn_63_0).a(stackIn_63_1 != 0, bi.field_c, 10, 0);
                                  var11 = param4 + -var8;
                                  if (var11 > 510) {
                                    var11 = 510;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                L24: {
                                  stackOut_66_0 = this.field_d;
                                  stackIn_68_0 = stackOut_66_0;
                                  stackIn_67_0 = stackOut_66_0;
                                  if (param1) {
                                    stackOut_68_0 = (dj) ((Object) stackIn_68_0);
                                    stackOut_68_1 = 0;
                                    stackIn_69_0 = stackOut_68_0;
                                    stackIn_69_1 = stackOut_68_1;
                                    break L24;
                                  } else {
                                    stackOut_67_0 = (dj) ((Object) stackIn_67_0);
                                    stackOut_67_1 = 1;
                                    stackIn_69_0 = stackOut_67_0;
                                    stackIn_69_1 = stackOut_67_1;
                                    break L24;
                                  }
                                }
                                ((dj) (Object) stackIn_69_0).a(stackIn_69_1 != 0, param0, var11, var8);
                                var8 = var8 + var11;
                                break L18;
                              }
                              var9++;
                              var7_int = var10;
                              if (var16 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        stackOut_71_0 = param1;
                        stackIn_72_0 = stackOut_71_0;
                        stackOut_72_0 = stackIn_72_0;
                        stackIn_73_0 = stackOut_72_0;
                        break L4;
                      }
                      decompiledRegionSelector2 = 0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_74_0 = 0;
                  stackIn_75_0 = stackOut_74_0;
                  return stackIn_75_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_73_0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_7_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_13_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_36_0 != 0;
                      } else {
                        return stackIn_42_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L25: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_78_0 = (RuntimeException) (var6_ref);
                stackOut_78_1 = new StringBuilder().append("eh.B(");
                stackIn_80_0 = stackOut_78_0;
                stackIn_80_1 = stackOut_78_1;
                stackIn_79_0 = stackOut_78_0;
                stackIn_79_1 = stackOut_78_1;
                if (param0 == null) {
                  stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
                  stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
                  stackOut_80_2 = "null";
                  stackIn_81_0 = stackOut_80_0;
                  stackIn_81_1 = stackOut_80_1;
                  stackIn_81_2 = stackOut_80_2;
                  break L25;
                } else {
                  stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
                  stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
                  stackOut_79_2 = "{...}";
                  stackIn_81_0 = stackOut_79_0;
                  stackIn_81_1 = stackOut_79_1;
                  stackIn_81_2 = stackOut_79_2;
                  break L25;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_f;
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
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            byte[] stackIn_19_0 = null;
            byte[] stackIn_20_0 = null;
            byte[] stackIn_55_0 = null;
            byte[] stackIn_56_0 = null;
            Object stackIn_58_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_54_0 = null;
            byte[] stackOut_55_0 = null;
            byte[] stackOut_18_0 = null;
            byte[] stackOut_19_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_57_0 = null;
            var18 = OrbDefence.field_D ? 1 : 0;
            var3 = this.field_d;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 * param1 + 6) <= this.field_b.b(126)) {
                    this.field_b.a((long)(param1 * 6), -1);
                    this.field_b.a(0, (byte) -18, 6, bi.field_c);
                    var4_int = ((255 & bi.field_c[0]) << -1991704496) + (bi.field_c[1] << -691810104 & 65280) - -(bi.field_c[2] & 255);
                    var5 = (bi.field_c[3] << -689978512 & 16711680) - (-((bi.field_c[4] & 255) << -1630682424) + -(bi.field_c[5] & 255));
                    if (0 <= var4_int) {
                      if (this.field_e >= var4_int) {
                        if (-1 > (var5 ^ -1)) {
                          if ((this.field_d.b(107) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            if (param0 == 520) {
                              L1: while (true) {
                                if (var7 >= var4_int) {
                                  stackOut_54_0 = (byte[]) (var6);
                                  stackIn_55_0 = stackOut_54_0;
                                  stackOut_55_0 = (byte[]) ((Object) stackIn_55_0);
                                  stackIn_56_0 = stackOut_55_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                } else {
                                  if (var5 != 0) {
                                    L2: {
                                      L3: {
                                        this.field_d.a((long)(var5 * 520), -1);
                                        var9 = var4_int - var7;
                                        if (65535 < param1) {
                                          break L3;
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
                                          this.field_d.a(0, (byte) -125, var14 + var9, bi.field_c);
                                          var12 = (65280 & bi.field_c[5] << 2126659656) + ((bi.field_c[4] & 255) << 918270832) - -(bi.field_c[6] & 255);
                                          var13 = 255 & bi.field_c[7];
                                          var11 = (bi.field_c[3] & 255) + ((255 & bi.field_c[2]) << -649605752);
                                          var10 = (bi.field_c[1] & 255) + ((255 & bi.field_c[0]) << -248854168);
                                          if (var18 == 0) {
                                            break L2;
                                          } else {
                                            break L3;
                                          }
                                        }
                                      }
                                      L5: {
                                        if ((var9 ^ -1) < -511) {
                                          var9 = 510;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      var14 = 10;
                                      this.field_d.a(0, (byte) -111, var9 - -var14, bi.field_c);
                                      var11 = ((bi.field_c[4] & 255) << 1200956808) - -(bi.field_c[5] & 255);
                                      var10 = (bi.field_c[3] & 255) + (bi.field_c[0] << -1678604392 & -16777216) + (bi.field_c[1] << -251246064 & 16711680) + ((bi.field_c[2] & 255) << 2077602632);
                                      var13 = bi.field_c[9] & 255;
                                      var12 = (255 & bi.field_c[8]) + ((bi.field_c[6] << 65917456 & 16711680) + ((bi.field_c[7] & 255) << 1170133736));
                                      break L2;
                                    }
                                    if (param1 == var10) {
                                      if (var8 == var11) {
                                        if (this.field_f == var13) {
                                          if (0 <= var12) {
                                            if (this.field_d.b(param0 ^ -587) / 520L >= (long)var12) {
                                              var15 = var14 + var9;
                                              var8++;
                                              var5 = var12;
                                              var16 = var14;
                                              L6: while (true) {
                                                if (var15 <= var16) {
                                                  continue L1;
                                                } else {
                                                  incrementValue$1 = var7;
                                                  var7++;
                                                  var6[incrementValue$1] = bi.field_c[var16];
                                                  var16++;
                                                  if (var18 != 0) {
                                                    continue L1;
                                                  } else {
                                                    continue L6;
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
                                      return null;
                                    }
                                  } else {
                                    return null;
                                  }
                                }
                              }
                            } else {
                              stackOut_18_0 = (byte[]) null;
                              stackIn_19_0 = stackOut_18_0;
                              stackOut_19_0 = (byte[]) ((Object) stackIn_19_0);
                              stackIn_20_0 = stackOut_19_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          } else {
                            stackOut_14_0 = null;
                            stackIn_15_0 = stackOut_14_0;
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            decompiledRegionSelector0 = 2;
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
                stackOut_57_0 = null;
                stackIn_58_0 = stackOut_57_0;
                return (byte[]) ((Object) stackIn_58_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_4_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_10_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_16_0);
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_20_0;
                    } else {
                      return stackIn_56_0;
                    }
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

    eh(int param0, dj param1, dj param2, int param3) {
        this.field_e = 65000;
        this.field_d = null;
        this.field_b = null;
        try {
            this.field_d = param1;
            this.field_b = param2;
            this.field_f = param0;
            this.field_e = param3;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "eh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = 0;
    }
}
