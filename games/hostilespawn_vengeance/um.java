/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class um {
    static boolean field_f;
    static boolean field_d;
    static int field_e;
    private bn field_c;
    static String field_h;
    private int field_b;
    private bn field_g;
    private int field_a;

    private final boolean a(byte[] param0, boolean param1, int param2, int param3, int param4) {
        try {
            int stackIn_8_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_18_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_70_0 = 0;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            RuntimeException stackIn_76_0 = null;
            StringBuilder stackIn_76_1 = null;
            String stackIn_76_2 = null;
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
            var16 = HostileSpawn.field_I ? 1 : 0;
            try {
              var6 = this.field_c;
              synchronized (var6) {
                try {
                  L0: {
                    L1: {
                      if (param1) {
                        if ((long)(6 + 6 * param4) > this.field_g.d(105)) {
                          stackIn_8_0 = 0;

                          decompiledRegionSelector2 = 0;
                          break L0;
                        } else {
                          L2: {
                            this.field_g.a((long)(param4 * 6), (byte) 115);
                            this.field_g.a(ec.field_d, (byte) -87, 0, 6);
                            var7_int = ((255 & ec.field_d[3]) << -529232848) + (ec.field_d[4] << 922809768 & 65280) - -(ec.field_d[5] & 255);
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if (((long)var7_int ^ -1L) < (this.field_c.d(120) / 520L ^ -1L)) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackIn_14_0 = 0;

                          decompiledRegionSelector2 = 1;
                          break L0;
                        }
                      } else {
                        var7_int = (int)((this.field_c.d(-42) - -519L) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    ec.field_d[0] = (byte)(param3 >> 934400112);
                    ec.field_d[2] = (byte)param3;
                    if (param2 <= -50) {
                      ec.field_d[1] = (byte)(param3 >> 574606312);
                      ec.field_d[4] = (byte)(var7_int >> 1816976584);
                      ec.field_d[3] = (byte)(var7_int >> 1732371888);
                      ec.field_d[5] = (byte)var7_int;
                      this.field_g.a((long)(6 * param4), (byte) 118);
                      this.field_g.a(6, 0, ec.field_d, (byte) 39);
                      var8 = 0;
                      var9 = 0;
                      L3: while (true) {
                        L4: {
                          if (var8 >= param3) {
                            break L4;
                          } else {
                            L5: {
                              var10 = 0;
                              if (!param1) {
                                break L5;
                              } else {
                                L6: {
                                  this.field_c.a((long)(520 * var7_int), (byte) 121);
                                  if (param4 > 65535) {
                                    try {
                                      L7: {
                                        this.field_c.a(ec.field_d, (byte) -116, 0, 10);
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
                                      var12 = (ec.field_d[5] & 255) + ((ec.field_d[4] & 255) << -252069496);
                                      var11 = ((255 & ec.field_d[2]) << 1065690088) + ((ec.field_d[0] & 255) << 1322272728) - (-(ec.field_d[1] << -1925432976 & 16711680) - (ec.field_d[3] & 255));
                                      var10 = ((ec.field_d[7] & 255) << -11931800) + (((255 & ec.field_d[6]) << -1945200016) + (255 & ec.field_d[8]));
                                      var13 = ec.field_d[9] & 255;
                                      break L6;
                                    } else {
                                      break L4;
                                    }
                                  } else {
                                    try {
                                      L9: {
                                        this.field_c.a(ec.field_d, (byte) -121, 0, 8);
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
                                      var12 = (255 & ec.field_d[3]) + (65280 & ec.field_d[2] << 1170636200);
                                      var11 = (ec.field_d[1] & 255) + (ec.field_d[0] << 95034216 & 65280);
                                      var10 = (ec.field_d[5] << -842232664 & 65280) + ((16711680 & ec.field_d[4] << -1395873008) - -(255 & ec.field_d[6]));
                                      var13 = 255 & ec.field_d[7];
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
                                      if (var13 == this.field_a) {
                                        L12: {
                                          if ((var10 ^ -1) > -1) {
                                            break L12;
                                          } else {
                                            if (((long)var10 ^ -1L) >= (this.field_c.d(121) / 520L ^ -1L)) {
                                              break L5;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        stackIn_44_0 = 0;

                                        decompiledRegionSelector2 = 4;
                                        break L0;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                stackIn_38_0 = 0;

                                decompiledRegionSelector2 = 3;
                                break L0;
                              }
                            }
                            L13: {
                              if (-1 == (var10 ^ -1)) {
                                L14: {
                                  param1 = false;
                                  var10 = (int)((519L + this.field_c.d(-86)) / 520L);
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
                              } else {
                                break L13;
                              }
                            }
                            L15: {
                              if (-513 > (-var8 + param3 ^ -1)) {
                                break L15;
                              } else {
                                var10 = 0;
                                break L15;
                              }
                            }
                            L16: {
                              if ((param4 ^ -1) < -65536) {
                                L17: {
                                  ec.field_d[3] = (byte)param4;
                                  ec.field_d[7] = (byte)(var10 >> 1031928104);
                                  ec.field_d[5] = (byte)var9;
                                  ec.field_d[8] = (byte)var10;
                                  ec.field_d[9] = (byte)this.field_a;
                                  ec.field_d[1] = (byte)(param4 >> 764694512);
                                  ec.field_d[6] = (byte)(var10 >> 1093341232);
                                  ec.field_d[2] = (byte)(param4 >> 1452919304);
                                  ec.field_d[4] = (byte)(var9 >> 604199016);
                                  ec.field_d[0] = (byte)(param4 >> 2103313752);
                                  this.field_c.a((long)(520 * var7_int), (byte) 104);
                                  this.field_c.a(10, 0, ec.field_d, (byte) 79);
                                  var11 = -var8 + param3;
                                  if (-511 > (var11 ^ -1)) {
                                    var11 = 510;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                this.field_c.a(var11, var8, param0, (byte) 122);
                                var8 = var8 + var11;
                                break L16;
                              } else {
                                L18: {
                                  ec.field_d[3] = (byte)var9;
                                  ec.field_d[7] = (byte)this.field_a;
                                  ec.field_d[2] = (byte)(var9 >> -429616344);
                                  ec.field_d[0] = (byte)(param4 >> 1892335656);
                                  ec.field_d[5] = (byte)(var10 >> -1957774968);
                                  ec.field_d[1] = (byte)param4;
                                  ec.field_d[6] = (byte)var10;
                                  ec.field_d[4] = (byte)(var10 >> 130687408);
                                  this.field_c.a((long)(var7_int * 520), (byte) 98);
                                  this.field_c.a(8, 0, ec.field_d, (byte) 42);
                                  var11 = param3 - var8;
                                  if (512 < var11) {
                                    var11 = 512;
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                this.field_c.a(var11, var8, param0, (byte) 77);
                                var8 = var8 + var11;
                                break L16;
                              }
                            }
                            var9++;
                            var7_int = var10;
                            continue L3;
                          }
                        }
                        stackIn_67_0 = 1;

                        decompiledRegionSelector2 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_18_0 = 1;

                      decompiledRegionSelector2 = 2;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackIn_70_0 = 0;
                  return stackIn_70_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_8_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_14_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_18_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_38_0 != 0;
                      } else {
                        if (decompiledRegionSelector2 == 4) {
                          return stackIn_44_0 != 0;
                        } else {
                          return stackIn_67_0 != 0;
                        }
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_75_0 = (RuntimeException) (var6_ref);

                stackIn_75_1 = new StringBuilder().append("um.E(");

                if (param0 == null) {
                  stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
                  stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
                  stackIn_76_2 = "null";
                  break L19;
                } else {
                  stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
                  stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
                  stackIn_76_2 = "{...}";
                  break L19;
                }
              }
              throw wg.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            L1: {
              if (param0 == -24) {
                break L1;
              } else {
                um.a(-93, -47, -15);
                break L1;
              }
            }
            var5 = this.field_c;
            synchronized (var5) {
              L2: {
                L3: {
                  if (-1 < (param2 ^ -1)) {
                    break L3;
                  } else {
                    if (param2 <= this.field_b) {
                      L4: {
                        var6 = this.a(param1, true, param0 ^ 125, param2, param3) ? 1 : 0;
                        if (var6 != 0) {
                          break L4;
                        } else {
                          var6 = this.a(param1, false, -62, param2, param3) ? 1 : 0;
                          break L4;
                        }
                      }
                      stackIn_9_0 = var6;
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
            stackIn_14_0 = (RuntimeException) (var5_ref);

            stackIn_14_1 = new StringBuilder().append("um.B(").append(param0).append(',');

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
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0 != 0;
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 255) {
            um.a(-80);
        }
    }

    public final String toString() {
        return "" + this.field_a;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 10179) {
            field_e = 24;
        }
        int var3 = param1 >>> -1816913121;
        return (var3 + param1) / param0 - var3;
    }

    final byte[] a(int param0, int param1) {
        try {
            int incrementValue$2 = 0;
            Object var3 = null;
            Object var3_ref = null;
            int var4_int = 0;
            IOException var4 = null;
            int var5 = 0;
            int var6 = 0;
            byte[] var7 = null;
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
            Object stackIn_9_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_37_0 = null;
            byte[] stackIn_50_0 = null;
            Object stackIn_53_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var19 = HostileSpawn.field_I ? 1 : 0;
            var3_ref = this.field_c;
            synchronized (var3_ref) {
              try {
                L0: {
                  if (((long)(6 + 6 * param0) ^ -1L) >= (this.field_g.d(-47) ^ -1L)) {
                    this.field_g.a((long)(6 * param0), (byte) 103);
                    this.field_g.a(ec.field_d, (byte) -39, 0, 6);
                    var4_int = (65280 & ec.field_d[1] << 1725635336) + (16711680 & ec.field_d[0] << -1699601744) + (ec.field_d[2] & 255);
                    var5 = (255 & ec.field_d[5]) + (65280 & ec.field_d[4] << 820555208) + ((255 & ec.field_d[3]) << -967586256);
                    var6 = -13 % ((param1 - -80) / 43);
                    if (-1 >= (var4_int ^ -1)) {
                      if (var4_int <= this.field_b) {
                        if (0 < var5) {
                          if (this.field_c.d(2) / 520L >= (long)var5) {
                            var7 = new byte[var4_int];
                            var8 = 0;
                            var9 = 0;
                            L1: while (true) {
                              if (var8 >= var4_int) {
                                stackIn_50_0 = (byte[]) (var7);

                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L2: {
                                    this.field_c.a((long)(520 * var5), (byte) 96);
                                    var10 = -var8 + var4_int;
                                    if (param0 <= 65535) {
                                      L3: {
                                        if (-513 > (var10 ^ -1)) {
                                          var10 = 512;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                      var15 = 8;
                                      this.field_c.a(ec.field_d, (byte) -61, 0, var15 + var10);
                                      var12 = ((255 & ec.field_d[2]) << 104746376) - -(ec.field_d[3] & 255);
                                      var13 = (ec.field_d[6] & 255) + (((ec.field_d[4] & 255) << 1088954352) - -((ec.field_d[5] & 255) << 65018056));
                                      var11 = ((255 & ec.field_d[0]) << 1971946280) - -(255 & ec.field_d[1]);
                                      var14 = 255 & ec.field_d[7];
                                      break L2;
                                    } else {
                                      L4: {
                                        var15 = 10;
                                        if (-511 <= (var10 ^ -1)) {
                                          break L4;
                                        } else {
                                          var10 = 510;
                                          break L4;
                                        }
                                      }
                                      this.field_c.a(ec.field_d, (byte) -39, 0, var10 - -var15);
                                      var11 = (255 & ec.field_d[3]) + (65280 & ec.field_d[2] << 1861849608) + (((255 & ec.field_d[1]) << -2104603344) + ((ec.field_d[0] & 255) << -1262419944));
                                      var12 = (ec.field_d[4] << 156887336 & 65280) + (255 & ec.field_d[5]);
                                      var13 = (ec.field_d[8] & 255) + (ec.field_d[7] << 1803122152 & 65280) + (ec.field_d[6] << -202079152 & 16711680);
                                      var14 = ec.field_d[9] & 255;
                                      break L2;
                                    }
                                  }
                                  if (var11 == param0) {
                                    if (var12 == var9) {
                                      if (var14 == this.field_a) {
                                        if ((var13 ^ -1) <= -1) {
                                          if (((long)var13 ^ -1L) >= (this.field_c.d(-94) / 520L ^ -1L)) {
                                            var16 = var15 - -var10;
                                            var9++;
                                            var17 = var15;
                                            L5: while (true) {
                                              if (var16 <= var17) {
                                                var5 = var13;
                                                continue L1;
                                              } else {
                                                incrementValue$2 = var8;
                                                var8++;
                                                var7[incrementValue$2] = ec.field_d[var17];
                                                var17++;
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
                                  stackIn_21_0 = null;

                                  decompiledRegionSelector0 = 2;
                                  break L0;
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
                    return (byte[]) ((Object) stackIn_21_0);
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return (byte[]) ((Object) stackIn_37_0);
                    } else {
                      return stackIn_50_0;
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

    um(int param0, bn param1, bn param2, int param3) {
        this.field_c = null;
        this.field_g = null;
        this.field_b = 65000;
        try {
            this.field_b = param3;
            this.field_c = param1;
            this.field_a = param0;
            this.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "um.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_d = false;
        field_h = "Confirm Password: ";
        field_f = false;
    }
}
