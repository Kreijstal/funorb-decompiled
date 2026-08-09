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
            int stackIn_4_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_67_0 = 0;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            String stackIn_73_2 = null;
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
            var16 = Sumoblitz.field_L ? 1 : 0;
            try {
              var6 = this.field_c;
              synchronized (var6) {
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
                            stackIn_9_0 = 0;

                            decompiledRegionSelector2 = 0;
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
                            stackIn_15_0 = 0;

                            decompiledRegionSelector2 = 1;
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
                          if (param2 <= var8) {
                            break L4;
                          } else {
                            L5: {
                              var10 = 0;
                              if (!param1) {
                                break L5;
                              } else {
                                L6: {
                                  this.field_c.a(-7564, (long)(var7_int * 520));
                                  if (param3 <= 65535) {
                                    try {
                                      L7: {
                                        this.field_c.a(8, 0, to.field_t, -64);
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
                                      var10 = (255 & to.field_t[6]) + (16711680 & to.field_t[4] << -1177425904) + ((to.field_t[5] & 255) << -913508696);
                                      var13 = to.field_t[7] & 255;
                                      var11 = (to.field_t[1] & 255) + (65280 & to.field_t[0] << 1627523656);
                                      var12 = ((255 & to.field_t[2]) << 926588392) - -(to.field_t[3] & 255);
                                      break L6;
                                    } else {
                                      break L4;
                                    }
                                  } else {
                                    try {
                                      L9: {
                                        this.field_c.a(10, 0, to.field_t, -108);
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
                                      var13 = to.field_t[9] & 255;
                                      var10 = ((255 & to.field_t[7]) << 1428007304) + (((to.field_t[6] & 255) << -1291481040) + (255 & to.field_t[8]));
                                      var11 = (255 & to.field_t[3]) + (to.field_t[1] << -328166064 & 16711680) + ((to.field_t[0] & 255) << -979088008) - -(65280 & to.field_t[2] << 628736936);
                                      var12 = (255 & to.field_t[5]) + ((255 & to.field_t[4]) << -1510095864);
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
                                      if (var13 == this.field_d) {
                                        L12: {
                                          if (0 > var10) {
                                            break L12;
                                          } else {
                                            if ((long)var10 > this.field_c.a((byte) -60) / 520L) {
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
                              }
                            }
                            L13: {
                              if (0 == var10) {
                                L14: {
                                  param1 = false;
                                  var10 = (int)((519L + this.field_c.a((byte) -60)) / 520L);
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
                              if ((-var8 + param2 ^ -1) >= -513) {
                                var10 = 0;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            L16: {
                              if ((param3 ^ -1) >= -65536) {
                                L17: {
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
                                    break L17;
                                  } else {
                                    var11 = 512;
                                    break L17;
                                  }
                                }
                                this.field_c.a(param0, var11, (byte) -121, var8);
                                var8 = var8 + var11;
                                break L16;
                              } else {
                                L18: {
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
                                    break L18;
                                  } else {
                                    var11 = 510;
                                    break L18;
                                  }
                                }
                                this.field_c.a(param0, var11, (byte) 126, var8);
                                var8 = var8 + var11;
                                break L16;
                              }
                            }
                            var9++;
                            var7_int = var10;
                            continue L3;
                          }
                        }
                        stackIn_64_0 = 1;

                        decompiledRegionSelector2 = 4;
                        break L0;
                      }
                    }
                  } catch (java.io.IOException decompiledCaughtParameter2) {
                    decompiledCaughtException = decompiledCaughtParameter2;
                    var7 = (IOException) (Object) decompiledCaughtException;
                    stackIn_67_0 = 0;
                    return stackIn_67_0 != 0;
                  }
                  if (decompiledRegionSelector2 == 0) {
                    return stackIn_9_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 1) {
                      return stackIn_15_0 != 0;
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
                } else {
                  stackIn_4_0 = 0;
                  return stackIn_4_0 != 0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_72_0 = (RuntimeException) (var6_ref);

                stackIn_72_1 = new StringBuilder().append("wl.A(");

                if (param0 == null) {
                  stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
                  stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
                  stackIn_73_2 = "null";
                  break L19;
                } else {
                  stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
                  stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
                  stackIn_73_2 = "{...}";
                  break L19;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
            int incrementValue$2 = 0;
            Object var3 = null;
            Object var3_ref = null;
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
            Throwable var17 = null;
            int var18 = 0;
            Object stackIn_3_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_37_0 = null;
            byte[] stackIn_50_0 = null;
            Object stackIn_53_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var18 = Sumoblitz.field_L ? 1 : 0;
            var3_ref = this.field_c;
            synchronized (var3_ref) {
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
                              if (var7 >= var4_int) {
                                var9 = 9 % ((-33 - param0) / 59);
                                stackIn_50_0 = (byte[]) (var6);

                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if ((var5 ^ -1) != -1) {
                                  L2: {
                                    this.field_c.a(-7564, (long)(var5 * 520));
                                    var9 = var4_int + -var7;
                                    if (param1 <= 65535) {
                                      L3: {
                                        var14 = 8;
                                        if (-513 > (var9 ^ -1)) {
                                          var9 = 512;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                      this.field_c.a(var9 - -var14, 0, to.field_t, -55);
                                      var11 = (255 & to.field_t[3]) + ((255 & to.field_t[2]) << -2032926552);
                                      var13 = to.field_t[7] & 255;
                                      var12 = (255 & to.field_t[6]) + (((255 & to.field_t[5]) << -351227736) + (16711680 & to.field_t[4] << -908122928));
                                      var10 = ((to.field_t[0] & 255) << -90301720) - -(to.field_t[1] & 255);
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
                                      this.field_c.a(var9 + var14, 0, to.field_t, -93);
                                      var10 = (to.field_t[3] & 255) + (to.field_t[2] << -25652792 & 65280) + ((to.field_t[1] & 255) << 97457648) + ((to.field_t[0] & 255) << 889211128);
                                      var13 = to.field_t[9] & 255;
                                      var12 = (to.field_t[8] & 255) + (to.field_t[7] << -1603142936 & 65280) + ((to.field_t[6] & 255) << -375772624);
                                      var11 = ((255 & to.field_t[4]) << -1469508952) - -(to.field_t[5] & 255);
                                      break L2;
                                    }
                                  }
                                  if (var10 == param1) {
                                    if (var11 == var8) {
                                      if (var13 == this.field_d) {
                                        if ((var12 ^ -1) <= -1) {
                                          if ((long)var12 <= this.field_c.a((byte) -60) / 520L) {
                                            var15 = var14 - -var9;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var16 >= var15) {
                                                var5 = var12;
                                                var8++;
                                                continue L1;
                                              } else {
                                                incrementValue$2 = var7;
                                                var7++;
                                                var6[incrementValue$2] = to.field_t[var16];
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
                                        stackIn_37_0 = null;

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
                                  stackIn_21_0 = null;

                                  decompiledRegionSelector0 = 1;
                                  break L0;
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
                    stackIn_3_0 = null;

                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackIn_53_0 = null;
                return (byte[]) ((Object) stackIn_53_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_3_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_21_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_37_0);
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

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
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
                      stackIn_7_0 = var6;
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
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("wl.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
