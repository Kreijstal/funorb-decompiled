/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dl {
    private be field_a;
    private int field_f;
    private be field_c;
    static boolean field_g;
    static volatile boolean field_b;
    private int field_e;
    static sh field_d;

    final static cd a(int param0, sh param1, byte param2, sh param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        cd stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cd stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
            if (nb.a(param0, param4, (byte) -4, param1)) {
              L1: {
                if (param2 <= -28) {
                  break L1;
                } else {
                  dl.a(-62);
                  break L1;
                }
              }
              stackOut_5_0 = vi.a(param3.a(param0, -27493, param4), (byte) 107);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("dl.F(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (cd) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    private final boolean a(byte[] param0, int param1, boolean param2, int param3, int param4) {
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
            boolean stackIn_21_0 = false;
            int stackIn_37_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_69_0 = 0;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            String stackIn_75_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            boolean stackOut_20_0 = false;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_66_0 = 0;
            int stackOut_68_0 = 0;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            RuntimeException stackOut_74_0 = null;
            StringBuilder stackOut_74_1 = null;
            String stackOut_74_2 = null;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            String stackOut_73_2 = null;
            var16 = Lexicominos.field_L ? 1 : 0;
            try {
              var6_ref2 = this.field_a;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param2) {
                        var7_int = (int)((519L + this.field_a.a((byte) -122)) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (((long)(6 + param4 * 6) ^ -1L) >= (this.field_c.a((byte) -122) ^ -1L)) {
                          L2: {
                            this.field_c.a((byte) 40, (long)(param4 * 6));
                            this.field_c.a(0, ra.field_a, 6, -1);
                            var7_int = (65280 & ra.field_a[4] << -811107160) + (ra.field_a[3] << 2021029456 & 16711680) + (255 & ra.field_a[5]);
                            if (-1 <= (var7_int ^ -1)) {
                              break L2;
                            } else {
                              if ((this.field_a.a((byte) -122) / 520L ^ -1L) > ((long)var7_int ^ -1L)) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackOut_11_0 = stackIn_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector2 = 2;
                          break L0;
                        } else {
                          stackOut_4_0 = 0;
                          stackIn_5_0 = stackOut_4_0;
                          stackOut_5_0 = stackIn_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        }
                      }
                    }
                    L3: {
                      ra.field_a[1] = (byte)(param3 >> -1046124600);
                      ra.field_a[2] = (byte)param3;
                      ra.field_a[0] = (byte)(param3 >> 2135497328);
                      ra.field_a[4] = (byte)(var7_int >> 1475549800);
                      ra.field_a[3] = (byte)(var7_int >> 501526896);
                      ra.field_a[5] = (byte)var7_int;
                      if (param1 == 17699) {
                        break L3;
                      } else {
                        this.field_c = (be) null;
                        break L3;
                      }
                    }
                    this.field_c.a((byte) 40, (long)(param4 * 6));
                    this.field_c.b(0, ra.field_a, 6, -31593);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (param3 <= var8) {
                            break L6;
                          } else {
                            var10 = 0;
                            stackOut_20_0 = param2;
                            stackIn_67_0 = stackOut_20_0 ? 1 : 0;
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
                                      this.field_a.a((byte) 40, (long)(var7_int * 520));
                                      if ((param4 ^ -1) < -65536) {
                                        break L9;
                                      } else {
                                        try {
                                          L10: {
                                            this.field_a.a(0, ra.field_a, 8, -1);
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
                                          var10 = ((255 & ra.field_a[5]) << 355846728) + (((ra.field_a[4] & 255) << 1755783440) - -(ra.field_a[6] & 255));
                                          var11 = (255 & ra.field_a[1]) + (65280 & ra.field_a[0] << 2131313000);
                                          var13 = 255 & ra.field_a[7];
                                          var12 = ((ra.field_a[2] & 255) << -457110552) - -(255 & ra.field_a[3]);
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
                                        this.field_a.a(0, ra.field_a, 10, -1);
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
                                      var11 = (ra.field_a[2] << -2035523160 & 65280) + ((ra.field_a[1] << -1303479824 & 16711680) + (-16777216 & ra.field_a[0] << 1357793112) + (ra.field_a[3] & 255));
                                      var12 = (ra.field_a[5] & 255) + (65280 & ra.field_a[4] << 1400874856);
                                      var10 = ((ra.field_a[6] & 255) << -393949232) - (-((ra.field_a[7] & 255) << 1321210792) - (ra.field_a[8] & 255));
                                      var13 = 255 & ra.field_a[9];
                                      break L8;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  L14: {
                                    if (param4 != var11) {
                                      break L14;
                                    } else {
                                      if (var9 != var12) {
                                        break L14;
                                      } else {
                                        if (this.field_f != var13) {
                                          break L14;
                                        } else {
                                          L15: {
                                            if (var10 < 0) {
                                              break L15;
                                            } else {
                                              if (((long)var10 ^ -1L) >= (this.field_a.a((byte) -122) / 520L ^ -1L)) {
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
                                if (var10 == 0) {
                                  L17: {
                                    var10 = (int)((this.field_a.a((byte) -122) + 519L) / 520L);
                                    param2 = false;
                                    if (0 == var10) {
                                      var10++;
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  if (var7_int == var10) {
                                    var10++;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                              L18: {
                                if ((-var8 + param3 ^ -1) >= -513) {
                                  var10 = 0;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                L20: {
                                  if ((param4 ^ -1) < -65536) {
                                    break L20;
                                  } else {
                                    L21: {
                                      ra.field_a[5] = (byte)(var10 >> -1558236888);
                                      ra.field_a[6] = (byte)var10;
                                      ra.field_a[1] = (byte)param4;
                                      ra.field_a[3] = (byte)var9;
                                      ra.field_a[2] = (byte)(var9 >> -735011480);
                                      ra.field_a[7] = (byte)this.field_f;
                                      ra.field_a[0] = (byte)(param4 >> 757840648);
                                      ra.field_a[4] = (byte)(var10 >> -2128146768);
                                      this.field_a.a((byte) 40, (long)(520 * var7_int));
                                      this.field_a.b(0, ra.field_a, 8, -31593);
                                      var11 = param3 - var8;
                                      if ((var11 ^ -1) >= -513) {
                                        break L21;
                                      } else {
                                        var11 = 512;
                                        break L21;
                                      }
                                    }
                                    this.field_a.b(var8, param0, var11, -31593);
                                    var8 = var8 + var11;
                                    if (var16 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                L22: {
                                  ra.field_a[8] = (byte)var10;
                                  ra.field_a[3] = (byte)param4;
                                  ra.field_a[2] = (byte)(param4 >> -270661688);
                                  ra.field_a[9] = (byte)this.field_f;
                                  ra.field_a[5] = (byte)var9;
                                  ra.field_a[1] = (byte)(param4 >> -896054672);
                                  ra.field_a[4] = (byte)(var9 >> 456717960);
                                  ra.field_a[7] = (byte)(var10 >> 1723916520);
                                  ra.field_a[6] = (byte)(var10 >> -1868956784);
                                  ra.field_a[0] = (byte)(param4 >> 1115143576);
                                  this.field_a.a((byte) 40, (long)(520 * var7_int));
                                  this.field_a.b(0, ra.field_a, 10, -31593);
                                  var11 = param3 + -var8;
                                  if ((var11 ^ -1) < -511) {
                                    var11 = 510;
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                this.field_a.b(var8, param0, var11, -31593);
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
                        stackOut_65_0 = 1;
                        stackIn_66_0 = stackOut_65_0;
                        stackOut_66_0 = stackIn_66_0;
                        stackIn_67_0 = stackOut_66_0;
                        break L5;
                      }
                      decompiledRegionSelector2 = 0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_68_0 = 0;
                  stackIn_69_0 = stackOut_68_0;
                  return stackIn_69_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_67_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_6_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_12_0 != 0;
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
                stackOut_72_0 = (RuntimeException) (var6_ref);
                stackOut_72_1 = new StringBuilder().append("dl.E(");
                stackIn_74_0 = stackOut_72_0;
                stackIn_74_1 = stackOut_72_1;
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                if (param0 == null) {
                  stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
                  stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
                  stackOut_74_2 = "null";
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  stackIn_75_2 = stackOut_74_2;
                  break L23;
                } else {
                  stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
                  stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
                  stackOut_73_2 = "{...}";
                  stackIn_75_0 = stackOut_73_0;
                  stackIn_75_1 = stackOut_73_1;
                  stackIn_75_2 = stackOut_73_2;
                  break L23;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
            var5 = this.field_a;
            synchronized (var5) {
              L1: {
                L2: {
                  if ((param1 ^ -1) > param3) {
                    break L2;
                  } else {
                    if (this.field_e < param1) {
                      break L2;
                    } else {
                      L3: {
                        var6 = this.a(param0, 17699, true, param1, param2) ? 1 : 0;
                        if (var6 != 0) {
                          break L3;
                        } else {
                          var6 = this.a(param0, param3 + 17700, false, param1, param2) ? 1 : 0;
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
            stackOut_11_1 = new StringBuilder().append("dl.A(");
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
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final byte[] a(int param0, int param1) {
        try {
            String discarded$2 = null;
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
            Object stackIn_5_0 = null;
            Object stackIn_6_0 = null;
            Object stackIn_17_0 = null;
            Object stackIn_18_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            Object stackIn_44_0 = null;
            Object stackIn_45_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_44_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_16_0 = null;
            Object stackOut_17_0 = null;
            Object stackOut_4_0 = null;
            Object stackOut_5_0 = null;
            Object stackOut_56_0 = null;
            var18 = Lexicominos.field_L ? 1 : 0;
            var3 = this.field_a;
            synchronized (var3) {
              try {
                L0: {
                  L1: {
                    if (param1 == -65536) {
                      break L1;
                    } else {
                      discarded$2 = this.toString();
                      break L1;
                    }
                  }
                  if ((long)(param0 * 6 + 6) <= this.field_c.a((byte) -122)) {
                    this.field_c.a((byte) 40, (long)(6 * param0));
                    this.field_c.a(0, ra.field_a, 6, -1);
                    var4_int = (255 & ra.field_a[2]) + ((255 & ra.field_a[0]) << 884918704) - -((ra.field_a[1] & 255) << 793121032);
                    var5 = (ra.field_a[5] & 255) + ((ra.field_a[3] & 255) << 2036501328) - -(65280 & ra.field_a[4] << -1145885720);
                    if (var4_int >= 0) {
                      if (this.field_e >= var4_int) {
                        if (var5 > 0) {
                          if ((long)var5 <= this.field_a.a((byte) -122) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_53_0 = (byte[]) (var6);
                                stackIn_54_0 = stackOut_53_0;
                                stackOut_54_0 = (byte[]) ((Object) stackIn_54_0);
                                stackIn_55_0 = stackOut_54_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L3: {
                                    L4: {
                                      this.field_a.a((byte) 40, (long)(520 * var5));
                                      var9 = -var7 + var4_int;
                                      if (-65536 <= (param0 ^ -1)) {
                                        break L4;
                                      } else {
                                        L5: {
                                          var14 = 10;
                                          if (510 >= var9) {
                                            break L5;
                                          } else {
                                            var9 = 510;
                                            break L5;
                                          }
                                        }
                                        this.field_a.a(0, ra.field_a, var9 - -var14, -1);
                                        var12 = (255 & ra.field_a[8]) + ((255 & ra.field_a[6]) << -125591888) - -((ra.field_a[7] & 255) << 726963176);
                                        var10 = (255 & ra.field_a[3]) + ((ra.field_a[2] & 255) << -122309752) + (((255 & ra.field_a[1]) << 1345758416) + ((255 & ra.field_a[0]) << 1586473400));
                                        var11 = (ra.field_a[5] & 255) + (65280 & ra.field_a[4] << 489381352);
                                        var13 = 255 & ra.field_a[9];
                                        if (var18 == 0) {
                                          break L3;
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                    L6: {
                                      if (512 >= var9) {
                                        break L6;
                                      } else {
                                        var9 = 512;
                                        break L6;
                                      }
                                    }
                                    var14 = 8;
                                    this.field_a.a(0, ra.field_a, var14 + var9, -1);
                                    var12 = (255 & ra.field_a[6]) + ((ra.field_a[5] & 255) << 949959144) + ((ra.field_a[4] & 255) << 1066295632);
                                    var11 = ((255 & ra.field_a[2]) << -1935568408) - -(ra.field_a[3] & 255);
                                    var10 = (ra.field_a[0] << 2036265576 & 65280) - -(255 & ra.field_a[1]);
                                    var13 = 255 & ra.field_a[7];
                                    break L3;
                                  }
                                  if (var10 == param0) {
                                    if (var8 == var11) {
                                      if (var13 == this.field_f) {
                                        if (var12 >= 0) {
                                          if (this.field_a.a((byte) -122) / 520L >= (long)var12) {
                                            var15 = var14 + var9;
                                            var16 = var14;
                                            L7: while (true) {
                                              L8: {
                                                if (var16 >= var15) {
                                                  var5 = var12;
                                                  var8++;
                                                  break L8;
                                                } else {
                                                  incrementValue$3 = var7;
                                                  var7++;
                                                  var6[incrementValue$3] = ra.field_a[var16];
                                                  var16++;
                                                  if (var18 != 0) {
                                                    break L8;
                                                  } else {
                                                    continue L7;
                                                  }
                                                }
                                              }
                                              continue L2;
                                            }
                                          } else {
                                            stackOut_43_0 = null;
                                            stackIn_44_0 = stackOut_43_0;
                                            stackOut_44_0 = stackIn_44_0;
                                            stackIn_45_0 = stackOut_44_0;
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
                                  stackOut_22_0 = null;
                                  stackIn_23_0 = stackOut_22_0;
                                  stackOut_23_0 = stackIn_23_0;
                                  stackIn_24_0 = stackOut_23_0;
                                  decompiledRegionSelector0 = 2;
                                  break L0;
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
                    stackOut_4_0 = null;
                    stackIn_5_0 = stackOut_4_0;
                    stackOut_5_0 = stackIn_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_56_0 = null;
                stackIn_57_0 = stackOut_56_0;
                return (byte[]) ((Object) stackIn_57_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_6_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_18_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_24_0);
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return (byte[]) ((Object) stackIn_45_0);
                    } else {
                      return stackIn_55_0;
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

    public final String toString() {
        return "" + this.field_f;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 7) {
            field_b = false;
        }
    }

    final static void b(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              bg.field_a.a((byte) 50);
              if (param0 == 5) {
                break L1;
              } else {
                dl.b(114);
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (32 <= var1_int) {
                    break L4;
                  } else {
                    kj.field_q[var1_int] = 0L;
                    var1_int++;
                    if (var2 != 0) {
                      break L3;
                    } else {
                      if (var2 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var1_int = 0;
                break L3;
              }
              L5: while (true) {
                L6: {
                  L7: {
                    if (32 <= var1_int) {
                      break L7;
                    } else {
                      f.field_i[var1_int] = 0L;
                      var1_int++;
                      if (var2 != 0) {
                        break L6;
                      } else {
                        if (var2 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  jj.field_c = 0;
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) runtimeException), "dl.C(" + param0 + ')');
        }
    }

    dl(int param0, be param1, be param2, int param3) {
        this.field_a = null;
        this.field_c = null;
        this.field_e = 65000;
        try {
            this.field_a = param1;
            this.field_c = param2;
            this.field_f = param0;
            this.field_e = param3;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "dl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_b = true;
    }
}
