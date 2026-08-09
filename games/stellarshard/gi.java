/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gi {
    private int field_b;
    private pc field_d;
    static int field_c;
    static int field_f;
    static int field_g;
    private pc field_e;
    private int field_a;

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 5) {
              var5 = this.field_e;
              synchronized (var5) {
                L1: {
                  L2: {
                    if (-1 < (param1 ^ -1)) {
                      break L2;
                    } else {
                      if (param1 > this.field_a) {
                        break L2;
                      } else {
                        L3: {
                          var6 = this.a(param3, param1, true, param2 + -5, param0) ? 1 : 0;
                          if (var6 == 0) {
                            var6 = this.a(param3, param1, false, 0, param0) ? 1 : 0;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        stackIn_12_0 = var6;
                        break L1;
                      }
                    }
                  }
                  throw new IllegalArgumentException();
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5_ref);

            stackIn_17_1 = new StringBuilder().append("gi.C(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final byte[] a(boolean param0, int param1) {
        try {
            int incrementValue$0 = 0;
            Object stackIn_9_0 = null;
            byte[] stackIn_19_0 = null;
            Object stackIn_25_0 = null;
            Object stackIn_41_0 = null;
            Object stackIn_47_0 = null;
            byte[] stackIn_54_0 = null;
            Object stackIn_57_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var3 = null;
            int var4_int = 0;
            IOException var4 = null;
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
            int var18 = 0;
            var18 = stellarshard.field_B;
            var3 = this.field_e;
            synchronized (var3) {
              try {
                L0: {
                  if (this.field_d.c(117) >= (long)(6 * param1 + 6)) {
                    this.field_d.a((long)(6 * param1), 0);
                    this.field_d.a(6, (byte) -93, 0, gg.field_e);
                    var4_int = (gg.field_e[0] << 1210422640 & 16711680) - -((gg.field_e[1] & 255) << 664084264) - -(255 & gg.field_e[2]);
                    var5 = (gg.field_e[5] & 255) + ((255 & gg.field_e[3]) << -1703361584) - -((gg.field_e[4] & 255) << -1648006776);
                    if (-1 >= (var4_int ^ -1)) {
                      if (var4_int <= this.field_a) {
                        if (var5 > 0) {
                          if ((long)var5 <= this.field_e.c(70) / 520L) {
                            if (param0) {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              var8 = 0;
                              L1: while (true) {
                                if (var7 >= var4_int) {
                                  stackIn_54_0 = (byte[]) (var6);

                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                } else {
                                  if (-1 != (var5 ^ -1)) {
                                    L2: {
                                      this.field_e.a((long)(520 * var5), 0);
                                      var9 = var4_int - var7;
                                      if (param1 <= 65535) {
                                        L3: {
                                          if (512 >= var9) {
                                            break L3;
                                          } else {
                                            var9 = 512;
                                            break L3;
                                          }
                                        }
                                        var14 = 8;
                                        this.field_e.a(var14 + var9, (byte) -93, 0, gg.field_e);
                                        var10 = ((255 & gg.field_e[0]) << 1105986920) + (255 & gg.field_e[1]);
                                        var12 = (16711680 & gg.field_e[4] << 1430988752) + (65280 & gg.field_e[5] << -1722203096) - -(255 & gg.field_e[6]);
                                        var11 = (255 & gg.field_e[3]) + (gg.field_e[2] << -421637432 & 65280);
                                        var13 = gg.field_e[7] & 255;
                                        break L2;
                                      } else {
                                        L4: {
                                          if (510 < var9) {
                                            var9 = 510;
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        }
                                        var14 = 10;
                                        this.field_e.a(var9 + var14, (byte) -93, 0, gg.field_e);
                                        var13 = 255 & gg.field_e[9];
                                        var12 = (255 & gg.field_e[8]) + (((255 & gg.field_e[6]) << 1266042128) + (65280 & gg.field_e[7] << 982381032));
                                        var10 = (gg.field_e[3] & 255) + ((65280 & gg.field_e[2] << 1463103944) + (((gg.field_e[0] & 255) << 1279313816) + ((255 & gg.field_e[1]) << -617181968)));
                                        var11 = (255 & gg.field_e[5]) + ((255 & gg.field_e[4]) << -245681016);
                                        break L2;
                                      }
                                    }
                                    if (param1 == var10) {
                                      if (var11 == var8) {
                                        if (this.field_b == var13) {
                                          if (0 <= var12) {
                                            if (this.field_e.c(108) / 520L >= (long)var12) {
                                              var15 = var9 + var14;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (var15 <= var16) {
                                                  var5 = var12;
                                                  var8++;
                                                  continue L1;
                                                } else {
                                                  incrementValue$0 = var7;
                                                  var7++;
                                                  var6[incrementValue$0] = gg.field_e[var16];
                                                  var16++;
                                                  continue L5;
                                                }
                                              }
                                            } else {
                                              stackIn_47_0 = null;

                                              decompiledRegionSelector0 = 4;
                                              break L0;
                                            }
                                          } else {
                                            return null;
                                          }
                                        } else {
                                          stackIn_41_0 = null;

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
                                    stackIn_25_0 = null;

                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  }
                                }
                              }
                            } else {
                              stackIn_19_0 = (byte[]) null;

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
                        stackIn_9_0 = null;

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
                stackIn_57_0 = null;
                return (byte[]) ((Object) stackIn_57_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_9_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_25_0);
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return (byte[]) ((Object) stackIn_41_0);
                    } else {
                      if (decompiledRegionSelector0 == 4) {
                        return (byte[]) ((Object) stackIn_47_0);
                      } else {
                        return stackIn_54_0;
                      }
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

    private final boolean a(int param0, int param1, boolean param2, int param3, byte[] param4) {
        try {
            int stackIn_8_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_65_0 = 0;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            String stackIn_71_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            Object var6 = null;
            RuntimeException var6_ref = null;
            int var7_int = 0;
            IOException var7 = null;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            EOFException var14 = null;
            int var16 = 0;
            var16 = stellarshard.field_B;
            try {
              var6 = this.field_e;
              synchronized (var6) {
                try {
                  L0: {
                    L1: {
                      if (param2) {
                        if (((long)(6 + 6 * param0) ^ -1L) < (this.field_d.c(61) ^ -1L)) {
                          stackIn_8_0 = 0;

                          decompiledRegionSelector2 = 0;
                          break L0;
                        } else {
                          L2: {
                            this.field_d.a((long)(6 * param0), param3 + 0);
                            this.field_d.a(6, (byte) -93, 0, gg.field_e);
                            var7_int = (gg.field_e[5] & 255) + ((65280 & gg.field_e[4] << -1831552536) + (16711680 & gg.field_e[3] << -120345648));
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if ((long)var7_int <= this.field_e.c(110) / 520L) {
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackIn_14_0 = 0;

                          decompiledRegionSelector2 = 1;
                          break L0;
                        }
                      } else {
                        var7_int = (int)((this.field_e.c(param3 + 98) - -519L) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    gg.field_e[5] = (byte)var7_int;
                    gg.field_e[4] = (byte)(var7_int >> 2125415784);
                    gg.field_e[3] = (byte)(var7_int >> -69284944);
                    gg.field_e[2] = (byte)param1;
                    gg.field_e[1] = (byte)(param1 >> -426599032);
                    gg.field_e[param3] = (byte)(param1 >> 1647562128);
                    this.field_d.a((long)(param0 * 6), 0);
                    this.field_d.a(6, 0, -1, gg.field_e);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (param1 <= var8) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (!param2) {
                              break L5;
                            } else {
                              L6: {
                                this.field_e.a((long)(520 * var7_int), 0);
                                if (65535 >= param0) {
                                  try {
                                    L7: {
                                      this.field_e.a(8, (byte) -93, 0, gg.field_e);
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
                                    var13 = gg.field_e[7] & 255;
                                    var10 = (255 & gg.field_e[6]) + (((gg.field_e[4] & 255) << 409243728) + ((255 & gg.field_e[5]) << 1757173128));
                                    var11 = ((gg.field_e[0] & 255) << 291160648) + (gg.field_e[1] & 255);
                                    var12 = (65280 & gg.field_e[2] << 436280456) - -(255 & gg.field_e[3]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      this.field_e.a(10, (byte) -93, 0, gg.field_e);
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
                                    var12 = (gg.field_e[5] & 255) + ((255 & gg.field_e[4]) << 1787385768);
                                    var13 = gg.field_e[9] & 255;
                                    var11 = ((255 & gg.field_e[2]) << 1171120840) + ((gg.field_e[0] & 255) << 647322616) + ((gg.field_e[1] << -521759920 & 16711680) + (255 & gg.field_e[3]));
                                    var10 = (255 & gg.field_e[8]) + (((gg.field_e[7] & 255) << 1067321128) + (gg.field_e[6] << -1900519760 & 16711680));
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
                                    if (this.field_b != var13) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (-1 < (var10 ^ -1)) {
                                          break L12;
                                        } else {
                                          if (this.field_e.c(102) / 520L < (long)var10) {
                                            break L12;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      stackIn_40_0 = 0;

                                      decompiledRegionSelector2 = 3;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              stackIn_34_0 = 0;

                              decompiledRegionSelector2 = 2;
                              break L0;
                            }
                          }
                          L13: {
                            if (0 != var10) {
                              break L13;
                            } else {
                              L14: {
                                var10 = (int)((this.field_e.c(127) + 519L) / 520L);
                                param2 = false;
                                if (var10 == 0) {
                                  var10++;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              if (var10 == var7_int) {
                                var10++;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L15: {
                            if (512 >= -var8 + param1) {
                              var10 = 0;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if ((param0 ^ -1) >= -65536) {
                              L17: {
                                gg.field_e[0] = (byte)(param0 >> -777997784);
                                gg.field_e[5] = (byte)(var10 >> 2077785416);
                                gg.field_e[1] = (byte)param0;
                                gg.field_e[6] = (byte)var10;
                                gg.field_e[3] = (byte)var9;
                                gg.field_e[4] = (byte)(var10 >> -1726795888);
                                gg.field_e[7] = (byte)this.field_b;
                                gg.field_e[2] = (byte)(var9 >> -67533112);
                                this.field_e.a((long)(520 * var7_int), param3 + 0);
                                this.field_e.a(8, 0, param3 ^ -1, gg.field_e);
                                var11 = -var8 + param1;
                                if (-513 > (var11 ^ -1)) {
                                  var11 = 512;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              this.field_e.a(var11, var8, param3 ^ -1, param4);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                gg.field_e[6] = (byte)(var10 >> 1758895024);
                                gg.field_e[3] = (byte)param0;
                                gg.field_e[5] = (byte)var9;
                                gg.field_e[2] = (byte)(param0 >> -2084443544);
                                gg.field_e[0] = (byte)(param0 >> 335518584);
                                gg.field_e[7] = (byte)(var10 >> -1521881528);
                                gg.field_e[4] = (byte)(var9 >> -378329848);
                                gg.field_e[1] = (byte)(param0 >> 784378000);
                                gg.field_e[9] = (byte)this.field_b;
                                gg.field_e[8] = (byte)var10;
                                this.field_e.a((long)(520 * var7_int), 0);
                                this.field_e.a(10, 0, -1, gg.field_e);
                                var11 = param1 + -var8;
                                if (510 >= var11) {
                                  break L18;
                                } else {
                                  var11 = 510;
                                  break L18;
                                }
                              }
                              this.field_e.a(var11, var8, -1, param4);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L3;
                        }
                      }
                      stackIn_62_0 = 1;

                      decompiledRegionSelector2 = 4;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackIn_65_0 = 0;
                  return stackIn_65_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_8_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_14_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_34_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_40_0 != 0;
                      } else {
                        return stackIn_62_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_70_0 = (RuntimeException) (var6_ref);

                stackIn_70_1 = new StringBuilder().append("gi.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
                  stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                  stackIn_71_2 = "null";
                  break L19;
                } else {
                  stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
                  stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                  stackIn_71_2 = "{...}";
                  break L19;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_b;
    }

    gi(int param0, pc param1, pc param2, int param3) {
        this.field_d = null;
        this.field_e = null;
        this.field_a = 65000;
        try {
            this.field_a = param3;
            this.field_d = param2;
            this.field_b = param0;
            this.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "gi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
