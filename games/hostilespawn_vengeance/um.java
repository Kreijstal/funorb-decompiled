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
            int stackIn_18_0 = 0;
            int stackIn_19_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_68_0 = 0;
            int stackIn_70_0 = 0;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            RuntimeException stackIn_76_0 = null;
            StringBuilder stackIn_76_1 = null;
            String stackIn_76_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_66_0 = 0;
            int stackOut_67_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_69_0 = 0;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            RuntimeException stackOut_75_0 = null;
            StringBuilder stackOut_75_1 = null;
            String stackOut_75_2 = null;
            RuntimeException stackOut_74_0 = null;
            StringBuilder stackOut_74_1 = null;
            String stackOut_74_2 = null;
            var16 = HostileSpawn.field_I ? 1 : 0;
            try {
              var6_ref2 = (Object) (Object) ((um) this).field_c;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param1) {
                        if ((long)(6 + 6 * param4) > ((um) this).field_g.d(105)) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        } else {
                          L2: {
                            ((um) this).field_g.a((long)(param4 * 6), (byte) 115);
                            ((um) this).field_g.a(ec.field_d, (byte) -87, 0, 6);
                            var7_int = ((255 & ec.field_d[3]) << 16) + (ec.field_d[4] << 8 & 65280) - -(ec.field_d[5] & 255);
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if (~(long)var7_int < ~(((um) this).field_c.d(120) / 520L)) {
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
                      } else {
                        var7_int = (int)((((um) this).field_c.d(-42) - -519L) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    ec.field_d[0] = (byte)(param3 >> 16);
                    ec.field_d[2] = (byte)param3;
                    if (param2 <= -50) {
                      ec.field_d[1] = (byte)(param3 >> 8);
                      ec.field_d[4] = (byte)(var7_int >> 8);
                      ec.field_d[3] = (byte)(var7_int >> 16);
                      ec.field_d[5] = (byte)var7_int;
                      ((um) this).field_g.a((long)(6 * param4), (byte) 118);
                      ((um) this).field_g.a(6, 0, ec.field_d, (byte) 39);
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
                                  ((um) this).field_c.a((long)(520 * var7_int), (byte) 121);
                                  if (param4 > 65535) {
                                    try {
                                      L7: {
                                        ((um) this).field_c.a(ec.field_d, (byte) -116, 0, 10);
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
                                      var12 = (ec.field_d[5] & 255) + ((ec.field_d[4] & 255) << 8);
                                      var11 = ((255 & ec.field_d[2]) << 8) + ((ec.field_d[0] & 255) << 24) - (-(ec.field_d[1] << 16 & 16711680) - (ec.field_d[3] & 255));
                                      var10 = ((ec.field_d[7] & 255) << 8) + (((255 & ec.field_d[6]) << 16) + (255 & ec.field_d[8]));
                                      var13 = ec.field_d[9] & 255;
                                      break L6;
                                    } else {
                                      break L4;
                                    }
                                  } else {
                                    try {
                                      L9: {
                                        ((um) this).field_c.a(ec.field_d, (byte) -121, 0, 8);
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
                                      var12 = (255 & ec.field_d[3]) + (65280 & ec.field_d[2] << 8);
                                      var11 = (ec.field_d[1] & 255) + (ec.field_d[0] << 8 & 65280);
                                      var10 = (ec.field_d[5] << 8 & 65280) + ((16711680 & ec.field_d[4] << 16) - -(255 & ec.field_d[6]));
                                      var13 = 255 & ec.field_d[7];
                                      break L6;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                L11: {
                                  if (~var11 != ~param4) {
                                    break L11;
                                  } else {
                                    if (~var9 != ~var12) {
                                      break L11;
                                    } else {
                                      if (~var13 == ~((um) this).field_a) {
                                        L12: {
                                          if (var10 < 0) {
                                            break L12;
                                          } else {
                                            if (~(long)var10 >= ~(((um) this).field_c.d(121) / 520L)) {
                                              break L5;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        stackOut_43_0 = 0;
                                        stackIn_44_0 = stackOut_43_0;
                                        stackOut_44_0 = stackIn_44_0;
                                        stackIn_45_0 = stackOut_44_0;
                                        return stackIn_45_0 != 0;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                stackOut_37_0 = 0;
                                stackIn_38_0 = stackOut_37_0;
                                stackOut_38_0 = stackIn_38_0;
                                stackIn_39_0 = stackOut_38_0;
                                return stackIn_39_0 != 0;
                              }
                            }
                            L13: {
                              if (var10 == 0) {
                                L14: {
                                  param1 = false;
                                  var10 = (int)((519L + ((um) this).field_c.d(-86)) / 520L);
                                  if (var10 == 0) {
                                    var10++;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                if (~var10 == ~var7_int) {
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
                              if (-var8 + param3 > 512) {
                                break L15;
                              } else {
                                var10 = 0;
                                break L15;
                              }
                            }
                            L16: {
                              if (param4 > 65535) {
                                L17: {
                                  ec.field_d[3] = (byte)param4;
                                  ec.field_d[7] = (byte)(var10 >> 8);
                                  ec.field_d[5] = (byte)var9;
                                  ec.field_d[8] = (byte)var10;
                                  ec.field_d[9] = (byte)((um) this).field_a;
                                  ec.field_d[1] = (byte)(param4 >> 16);
                                  ec.field_d[6] = (byte)(var10 >> 16);
                                  ec.field_d[2] = (byte)(param4 >> 8);
                                  ec.field_d[4] = (byte)(var9 >> 8);
                                  ec.field_d[0] = (byte)(param4 >> 24);
                                  ((um) this).field_c.a((long)(520 * var7_int), (byte) 104);
                                  ((um) this).field_c.a(10, 0, ec.field_d, (byte) 79);
                                  var11 = -var8 + param3;
                                  if (var11 > 510) {
                                    var11 = 510;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                ((um) this).field_c.a(var11, var8, param0, (byte) 122);
                                var8 = var8 + var11;
                                break L16;
                              } else {
                                L18: {
                                  ec.field_d[3] = (byte)var9;
                                  ec.field_d[7] = (byte)((um) this).field_a;
                                  ec.field_d[2] = (byte)(var9 >> 8);
                                  ec.field_d[0] = (byte)(param4 >> 8);
                                  ec.field_d[5] = (byte)(var10 >> 8);
                                  ec.field_d[1] = (byte)param4;
                                  ec.field_d[6] = (byte)var10;
                                  ec.field_d[4] = (byte)(var10 >> 16);
                                  ((um) this).field_c.a((long)(var7_int * 520), (byte) 98);
                                  ((um) this).field_c.a(8, 0, ec.field_d, (byte) 42);
                                  var11 = param3 - var8;
                                  if (512 < var11) {
                                    var11 = 512;
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                ((um) this).field_c.a(var11, var8, param0, (byte) 77);
                                var8 = var8 + var11;
                                break L16;
                              }
                            }
                            var9++;
                            var7_int = var10;
                            continue L3;
                          }
                        }
                        stackOut_66_0 = 1;
                        stackIn_67_0 = stackOut_66_0;
                        stackOut_67_0 = stackIn_67_0;
                        stackIn_68_0 = stackOut_67_0;
                        break L0;
                      }
                    } else {
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      stackOut_18_0 = stackIn_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0 != 0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_69_0 = 0;
                  stackIn_70_0 = stackOut_69_0;
                  return stackIn_70_0 != 0;
                }
                return stackIn_68_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_73_0 = (RuntimeException) var6_ref;
                stackOut_73_1 = new StringBuilder().append("um.E(");
                stackIn_75_0 = stackOut_73_0;
                stackIn_75_1 = stackOut_73_1;
                stackIn_74_0 = stackOut_73_0;
                stackIn_74_1 = stackOut_73_1;
                if (param0 == null) {
                  stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
                  stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
                  stackOut_75_2 = "null";
                  stackIn_76_0 = stackOut_75_0;
                  stackIn_76_1 = stackOut_75_1;
                  stackIn_76_2 = stackOut_75_2;
                  break L19;
                } else {
                  stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
                  stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
                  stackOut_74_2 = "{...}";
                  stackIn_76_0 = stackOut_74_0;
                  stackIn_76_1 = stackOut_74_1;
                  stackIn_76_2 = stackOut_74_2;
                  break L19;
                }
              }
              throw wg.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
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
            if (param0 == -24) {
              break L0;
            } else {
              int discarded$3 = um.a(-93, -47, -15);
              break L0;
            }
          }
          var5 = (Object) (Object) ((um) this).field_c;
          synchronized (var5) {
            L1: {
              L2: {
                if (param2 < 0) {
                  break L2;
                } else {
                  if (param2 <= ((um) this).field_b) {
                    L3: {
                      var6 = this.a(param1, true, param0 ^ 125, param2, param3) ? 1 : 0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var6 = this.a(param1, false, -62, param2, param3) ? 1 : 0;
                        break L3;
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
          return stackIn_9_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5_ref;
            stackOut_12_1 = new StringBuilder().append("um.B(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 255) {
            um.a(-80);
        }
    }

    public final String toString() {
        return "" + ((um) this).field_a;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 10179) {
            field_e = 24;
        }
        int var3 = param1 >>> 31;
        return (var3 + param1) / param0 - var3;
    }

    final byte[] a(int param0, int param1) {
        try {
            Object var3 = null;
            IOException var4 = null;
            int var4_int = 0;
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
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
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
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_52_0 = null;
            var19 = HostileSpawn.field_I ? 1 : 0;
            var3 = (Object) (Object) ((um) this).field_c;
            synchronized (var3) {
              try {
                L0: {
                  if (~(long)(6 + 6 * param0) >= ~((um) this).field_g.d(-47)) {
                    ((um) this).field_g.a((long)(6 * param0), (byte) 103);
                    ((um) this).field_g.a(ec.field_d, (byte) -39, 0, 6);
                    var4_int = (65280 & ec.field_d[1] << 8) + (16711680 & ec.field_d[0] << 16) + (ec.field_d[2] & 255);
                    var5 = (255 & ec.field_d[5]) + (65280 & ec.field_d[4] << 8) + ((255 & ec.field_d[3]) << 16);
                    var6 = -13 % ((param1 - -80) / 43);
                    if (var4_int >= 0) {
                      if (var4_int <= ((um) this).field_b) {
                        if (0 < var5) {
                          if (((um) this).field_c.d(2) / 520L >= (long)var5) {
                            var7 = new byte[var4_int];
                            var8 = 0;
                            var9 = 0;
                            L1: while (true) {
                              if (var8 >= var4_int) {
                                stackOut_49_0 = (byte[]) var7;
                                stackIn_50_0 = stackOut_49_0;
                                stackOut_50_0 = (byte[]) (Object) stackIn_50_0;
                                stackIn_51_0 = stackOut_50_0;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L2: {
                                    ((um) this).field_c.a((long)(520 * var5), (byte) 96);
                                    var10 = -var8 + var4_int;
                                    if (param0 <= 65535) {
                                      L3: {
                                        if (var10 > 512) {
                                          var10 = 512;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                      var15 = 8;
                                      ((um) this).field_c.a(ec.field_d, (byte) -61, 0, var15 + var10);
                                      var12 = ((255 & ec.field_d[2]) << 8) - -(ec.field_d[3] & 255);
                                      var13 = (ec.field_d[6] & 255) + (((ec.field_d[4] & 255) << 16) - -((ec.field_d[5] & 255) << 8));
                                      var11 = ((255 & ec.field_d[0]) << 8) - -(255 & ec.field_d[1]);
                                      var14 = 255 & ec.field_d[7];
                                      break L2;
                                    } else {
                                      L4: {
                                        var15 = 10;
                                        if (var10 <= 510) {
                                          break L4;
                                        } else {
                                          var10 = 510;
                                          break L4;
                                        }
                                      }
                                      ((um) this).field_c.a(ec.field_d, (byte) -39, 0, var10 - -var15);
                                      var11 = (255 & ec.field_d[3]) + (65280 & ec.field_d[2] << 8) + (((255 & ec.field_d[1]) << 16) + ((ec.field_d[0] & 255) << 24));
                                      var12 = (ec.field_d[4] << 8 & 65280) + (255 & ec.field_d[5]);
                                      var13 = (ec.field_d[8] & 255) + (ec.field_d[7] << 8 & 65280) + (ec.field_d[6] << 16 & 16711680);
                                      var14 = ec.field_d[9] & 255;
                                      break L2;
                                    }
                                  }
                                  if (var11 == param0) {
                                    if (var12 == var9) {
                                      if (var14 == ((um) this).field_a) {
                                        if (var13 >= 0) {
                                          if (~(long)var13 >= ~(((um) this).field_c.d(-94) / 520L)) {
                                            var16 = var15 - -var10;
                                            var9++;
                                            var17 = var15;
                                            L5: while (true) {
                                              if (var16 <= var17) {
                                                var5 = var13;
                                                continue L1;
                                              } else {
                                                int incrementValue$1 = var8;
                                                var8++;
                                                var7[incrementValue$1] = ec.field_d[var17];
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
                            stackOut_14_0 = null;
                            stackIn_15_0 = stackOut_14_0;
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            return (byte[]) (Object) stackIn_16_0;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        stackOut_8_0 = null;
                        stackIn_9_0 = stackOut_8_0;
                        stackOut_9_0 = stackIn_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        return (byte[]) (Object) stackIn_10_0;
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

    um(int param0, bn param1, bn param2, int param3) {
        ((um) this).field_c = null;
        ((um) this).field_g = null;
        ((um) this).field_b = 65000;
        try {
            ((um) this).field_b = param3;
            ((um) this).field_c = param1;
            ((um) this).field_a = param0;
            ((um) this).field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "um.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_h = "Confirm Password: ";
        field_f = false;
    }
}
