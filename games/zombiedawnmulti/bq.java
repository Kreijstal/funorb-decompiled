/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bq {
    static int[] field_g;
    private int field_h;
    static String field_f;
    private of field_b;
    static boolean field_c;
    static ao field_i;
    private of field_d;
    static ja field_a;
    private int field_e;

    final byte[] a(int param0, int param1) {
        try {
            int incrementValue$2 = 0;
            Object var3 = null;
            Object var3_ref = null;
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
            int var18 = 0;
            Object stackIn_9_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_38_0 = null;
            byte[] stackIn_50_0 = null;
            Object stackIn_53_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var4 = null;
            var18 = ZombieDawnMulti.field_E ? 1 : 0;
            var3_ref = this.field_b;
            synchronized (var3_ref) {
              try {
                L0: {
                  if (this.field_d.c(param0 ^ -2) >= (long)(6 * param1 + 6)) {
                    this.field_d.a((long)(param1 * 6), (byte) -70);
                    this.field_d.a(6, 0, la.field_g, 47);
                    var4_int = (la.field_g[2] & 255) + (((la.field_g[param0] & 255) << 1497411624) + ((255 & la.field_g[0]) << 841354640));
                    var5 = ((255 & la.field_g[3]) << -307556048) + (la.field_g[4] << -2105338744 & 65280) - -(la.field_g[5] & 255);
                    if (var4_int >= 0) {
                      if (this.field_e >= var4_int) {
                        if (-1 > (var5 ^ -1)) {
                          if (this.field_b.c(-1) / 520L >= (long)var5) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var7 >= var4_int) {
                                stackIn_50_0 = (byte[]) (var6);

                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L2: {
                                    this.field_b.a((long)(520 * var5), (byte) -70);
                                    var9 = var4_int - var7;
                                    if (-65536 > (param1 ^ -1)) {
                                      L3: {
                                        if (-511 > (var9 ^ -1)) {
                                          var9 = 510;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                      var14 = 10;
                                      this.field_b.a(var9 + var14, 0, la.field_g, param0 + -96);
                                      var12 = (la.field_g[8] & 255) + ((16711680 & la.field_g[6] << -1639627984) - -(65280 & la.field_g[7] << -2119104152));
                                      var11 = (la.field_g[5] & 255) + (la.field_g[4] << -393090808 & 65280);
                                      var13 = 255 & la.field_g[9];
                                      var10 = (65280 & la.field_g[2] << -1718972888) + ((255 & la.field_g[1]) << -1826194704) + (((255 & la.field_g[0]) << 89432856) + (la.field_g[3] & 255));
                                      break L2;
                                    } else {
                                      L4: {
                                        if (512 < var9) {
                                          var9 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var14 = 8;
                                      this.field_b.a(var14 + var9, 0, la.field_g, 68);
                                      var12 = (la.field_g[6] & 255) + ((255 & la.field_g[5]) << -37815800) + (la.field_g[4] << 1700908304 & 16711680);
                                      var13 = la.field_g[7] & 255;
                                      var10 = (65280 & la.field_g[0] << 1909878792) - -(la.field_g[1] & 255);
                                      var11 = (255 & la.field_g[3]) + (65280 & la.field_g[2] << -896071800);
                                      break L2;
                                    }
                                  }
                                  if (param1 == var10) {
                                    if (var8 == var11) {
                                      if (var13 == this.field_h) {
                                        if ((var12 ^ -1) <= -1) {
                                          if ((this.field_b.c(-1) / 520L ^ -1L) <= ((long)var12 ^ -1L)) {
                                            var15 = var9 + var14;
                                            var5 = var12;
                                            var8++;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var15 <= var16) {
                                                continue L1;
                                              } else {
                                                incrementValue$2 = var7;
                                                var7++;
                                                var6[incrementValue$2] = la.field_g[var16];
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
                                        stackIn_38_0 = null;

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
                            stackIn_15_0 = null;

                            decompiledRegionSelector0 = 1;
                            break L0;
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
                stackIn_53_0 = null;
                return (byte[]) ((Object) stackIn_53_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_9_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_15_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_38_0);
                  } else {
                    return stackIn_50_0;
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

    public static void a(byte param0) {
        field_g = null;
        field_a = null;
        field_f = null;
        field_i = null;
        if (param0 <= 29) {
            field_a = (ja) null;
        }
    }

    final boolean a(byte param0, byte[] param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var5 = this.field_b;
            synchronized (var5) {
              L1: {
                L2: {
                  if ((param2 ^ -1) > -1) {
                    break L2;
                  } else {
                    if (param2 <= this.field_e) {
                      L3: {
                        var6 = this.a(true, param1, (byte) 49, param2, param3) ? 1 : 0;
                        if (param0 == 118) {
                          break L3;
                        } else {
                          this.field_b = (of) null;
                          break L3;
                        }
                      }
                      L4: {
                        if (var6 != 0) {
                          break L4;
                        } else {
                          var6 = this.a(false, param1, (byte) 49, param2, param3) ? 1 : 0;
                          break L4;
                        }
                      }
                      stackIn_9_0 = var6;
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
            stackIn_14_0 = (RuntimeException) (var5_ref);

            stackIn_14_1 = new StringBuilder().append("bq.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0 != 0;
    }

    public final String toString() {
        return "" + this.field_h;
    }

    private final boolean a(boolean param0, byte[] param1, byte param2, int param3, int param4) {
        try {
            int stackIn_4_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_68_0 = 0;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            String stackIn_74_2 = null;
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
            var16 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              var6 = this.field_b;
              synchronized (var6) {
                if (param2 == 49) {
                  try {
                    L0: {
                      L1: {
                        if (param0) {
                          if ((long)(6 * param4 - -6) <= this.field_d.c(-1)) {
                            L2: {
                              this.field_d.a((long)(param4 * 6), (byte) -70);
                              this.field_d.a(6, 0, la.field_g, -128);
                              var7_int = (la.field_g[5] & 255) + ((255 & la.field_g[4]) << 1649337992) + (16711680 & la.field_g[3] << 1988693328);
                              if ((var7_int ^ -1) >= -1) {
                                break L2;
                              } else {
                                if (((long)var7_int ^ -1L) < (this.field_b.c(-1) / 520L ^ -1L)) {
                                  break L2;
                                } else {
                                  break L1;
                                }
                              }
                            }
                            stackIn_17_0 = 0;

                            decompiledRegionSelector2 = 1;
                            break L0;
                          } else {
                            stackIn_11_0 = 0;

                            decompiledRegionSelector2 = 0;
                            break L0;
                          }
                        } else {
                          var7_int = (int)((this.field_b.c(-1) + 519L) / 520L);
                          if (0 == var7_int) {
                            var7_int = 1;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      }
                      la.field_g[1] = (byte)(param3 >> -1145640216);
                      la.field_g[2] = (byte)param3;
                      la.field_g[0] = (byte)(param3 >> -1386020912);
                      la.field_g[3] = (byte)(var7_int >> -1702901424);
                      la.field_g[5] = (byte)var7_int;
                      la.field_g[4] = (byte)(var7_int >> 863144168);
                      this.field_d.a((long)(param4 * 6), (byte) -70);
                      this.field_d.a(param2 ^ -50, 6, 0, la.field_g);
                      var8 = 0;
                      var9 = 0;
                      L3: while (true) {
                        L4: {
                          if (param3 <= var8) {
                            break L4;
                          } else {
                            L5: {
                              var10 = 0;
                              if (param0) {
                                L6: {
                                  this.field_b.a((long)(520 * var7_int), (byte) -70);
                                  if (65535 >= param4) {
                                    try {
                                      L7: {
                                        this.field_b.a(8, 0, la.field_g, -126);
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
                                      var10 = ((255 & la.field_g[4]) << 1705858864) - (-(65280 & la.field_g[5] << -778771352) + -(la.field_g[6] & 255));
                                      var12 = (65280 & la.field_g[2] << 871856136) - -(255 & la.field_g[3]);
                                      var11 = (la.field_g[1] & 255) + ((la.field_g[0] & 255) << -431156024);
                                      var13 = la.field_g[7] & 255;
                                      break L6;
                                    } else {
                                      break L4;
                                    }
                                  } else {
                                    try {
                                      L9: {
                                        this.field_b.a(10, 0, la.field_g, -103);
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
                                      var13 = 255 & la.field_g[9];
                                      var11 = (la.field_g[3] & 255) + (((la.field_g[2] & 255) << 1071316840) + ((la.field_g[0] & 255) << -1594309384)) + (16711680 & la.field_g[1] << -150196560);
                                      var12 = ((255 & la.field_g[4]) << 311392904) + (255 & la.field_g[5]);
                                      var10 = (65280 & la.field_g[7] << -16308152) + ((255 & la.field_g[6]) << 280622096) - -(la.field_g[8] & 255);
                                      break L6;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                L11: {
                                  if (var11 != param4) {
                                    break L11;
                                  } else {
                                    if (var9 != var12) {
                                      break L11;
                                    } else {
                                      if (this.field_h == var13) {
                                        L12: {
                                          if (0 > var10) {
                                            break L12;
                                          } else {
                                            if ((long)var10 > this.field_b.c(-1) / 520L) {
                                              break L12;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        stackIn_43_0 = 0;

                                        decompiledRegionSelector2 = 3;
                                        break L0;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                stackIn_37_0 = 0;

                                decompiledRegionSelector2 = 2;
                                break L0;
                              } else {
                                break L5;
                              }
                            }
                            L13: {
                              if (var10 != 0) {
                                break L13;
                              } else {
                                L14: {
                                  var10 = (int)((519L + this.field_b.c(-1)) / 520L);
                                  param0 = false;
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
                              if ((-var8 + param3 ^ -1) >= -513) {
                                var10 = 0;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            L16: {
                              if (param4 <= 65535) {
                                L17: {
                                  la.field_g[6] = (byte)var10;
                                  la.field_g[0] = (byte)(param4 >> -278316920);
                                  la.field_g[4] = (byte)(var10 >> 2066515376);
                                  la.field_g[2] = (byte)(var9 >> 1507951976);
                                  la.field_g[3] = (byte)var9;
                                  la.field_g[5] = (byte)(var10 >> 818178248);
                                  la.field_g[7] = (byte)this.field_h;
                                  la.field_g[1] = (byte)param4;
                                  this.field_b.a((long)(var7_int * 520), (byte) -70);
                                  this.field_b.a(param2 ^ -50, 8, 0, la.field_g);
                                  var11 = param3 + -var8;
                                  if (512 < var11) {
                                    var11 = 512;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                this.field_b.a(-1, var11, var8, param1);
                                var8 = var8 + var11;
                                break L16;
                              } else {
                                L18: {
                                  la.field_g[3] = (byte)param4;
                                  la.field_g[5] = (byte)var9;
                                  la.field_g[1] = (byte)(param4 >> 2105833072);
                                  la.field_g[2] = (byte)(param4 >> 27612456);
                                  la.field_g[8] = (byte)var10;
                                  la.field_g[9] = (byte)this.field_h;
                                  la.field_g[0] = (byte)(param4 >> -860476392);
                                  la.field_g[7] = (byte)(var10 >> 811846856);
                                  la.field_g[6] = (byte)(var10 >> -1535071760);
                                  la.field_g[4] = (byte)(var9 >> -1012654392);
                                  this.field_b.a((long)(520 * var7_int), (byte) -70);
                                  this.field_b.a(-1, 10, 0, la.field_g);
                                  var11 = param3 - var8;
                                  if (510 >= var11) {
                                    break L18;
                                  } else {
                                    var11 = 510;
                                    break L18;
                                  }
                                }
                                this.field_b.a(-1, var11, var8, param1);
                                var8 = var8 + var11;
                                break L16;
                              }
                            }
                            var9++;
                            var7_int = var10;
                            continue L3;
                          }
                        }
                        stackIn_65_0 = 1;

                        decompiledRegionSelector2 = 4;
                        break L0;
                      }
                    }
                  } catch (java.io.IOException decompiledCaughtParameter2) {
                    decompiledCaughtException = decompiledCaughtParameter2;
                    var7 = (IOException) (Object) decompiledCaughtException;
                    stackIn_68_0 = 0;
                    return stackIn_68_0 != 0;
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
                          return stackIn_65_0 != 0;
                        }
                      }
                    }
                  }
                } else {
                  stackIn_4_0 = 0;
                  return stackIn_4_0 != 0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_73_0 = (RuntimeException) (var6_ref);

                stackIn_73_1 = new StringBuilder().append("bq.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
                  stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
                  stackIn_74_2 = "null";
                  break L19;
                } else {
                  stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
                  stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
                  stackIn_74_2 = "{...}";
                  break L19;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    bq(int param0, of param1, of param2, int param3) {
        this.field_d = null;
        this.field_b = null;
        this.field_e = 65000;
        try {
            this.field_e = param3;
            this.field_h = param0;
            this.field_b = param1;
            this.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "bq.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = false;
        field_g = new int[8192];
        field_i = new ao(8, 0, 4, 1);
    }
}
