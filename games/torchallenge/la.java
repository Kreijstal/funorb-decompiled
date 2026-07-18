/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class la {
    private rk field_c;
    private int field_b;
    static oe field_f;
    private rk field_e;
    static kb field_a;
    static fj field_d;
    private int field_g;

    private final boolean a(int param0, int param1, int param2, byte[] param3, boolean param4) {
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
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
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
            var16 = TorChallenge.field_F ? 1 : 0;
            try {
              var6_ref2 = (Object) (Object) ((la) this).field_c;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param4) {
                        if (~((la) this).field_e.a(3) > ~(long)(6 * param2 - -6)) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        } else {
                          L2: {
                            ((la) this).field_e.a((long)(6 * param2), 0);
                            ((la) this).field_e.a(0, 6, (byte) 72, wi.field_c);
                            var7_int = (65280 & wi.field_c[4] << 8) + (((wi.field_c[3] & 255) << 16) + (255 & wi.field_c[5]));
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (~(long)var7_int < ~(((la) this).field_c.a(22) / 520L)) {
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
                        var7_int = (int)((((la) this).field_c.a(-124) - -519L) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    wi.field_c[2] = (byte)param0;
                    wi.field_c[4] = (byte)(var7_int >> 8);
                    wi.field_c[1] = (byte)(param0 >> 8);
                    wi.field_c[0] = (byte)(param0 >> 16);
                    wi.field_c[3] = (byte)(var7_int >> 16);
                    wi.field_c[5] = (byte)var7_int;
                    ((la) this).field_e.a((long)(param2 * 6), 0);
                    ((la) this).field_e.a(-4573, 0, wi.field_c, 6);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (var8 >= param0) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (!param4) {
                              break L5;
                            } else {
                              L6: {
                                ((la) this).field_c.a((long)(520 * var7_int), 0);
                                if (param2 <= 65535) {
                                  try {
                                    L7: {
                                      ((la) this).field_c.a(0, 8, (byte) 29, wi.field_c);
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
                                    var12 = (wi.field_c[2] << 8 & 65280) + (255 & wi.field_c[3]);
                                    var13 = 255 & wi.field_c[7];
                                    var11 = (wi.field_c[1] & 255) + ((255 & wi.field_c[0]) << 8);
                                    var10 = (16711680 & wi.field_c[4] << 16) - -(wi.field_c[5] << 8 & 65280) + (255 & wi.field_c[6]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((la) this).field_c.a(0, 10, (byte) 68, wi.field_c);
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
                                    var10 = (65280 & wi.field_c[7] << 8) + ((255 & wi.field_c[6]) << 16) - -(255 & wi.field_c[8]);
                                    var11 = (255 & wi.field_c[3]) + ((wi.field_c[2] & 255) << 8) + (wi.field_c[0] << 24 & -16777216) - -(16711680 & wi.field_c[1] << 16);
                                    var12 = (wi.field_c[5] & 255) + (65280 & wi.field_c[4] << 8);
                                    var13 = wi.field_c[9] & 255;
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (param2 != var11) {
                                  break L11;
                                } else {
                                  if (var9 != var12) {
                                    break L11;
                                  } else {
                                    if (((la) this).field_b == var13) {
                                      L12: {
                                        if (0 > var10) {
                                          break L12;
                                        } else {
                                          if ((long)var10 <= ((la) this).field_c.a(-112) / 520L) {
                                            break L5;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      stackOut_42_0 = 0;
                                      stackIn_43_0 = stackOut_42_0;
                                      stackOut_43_0 = stackIn_43_0;
                                      stackIn_44_0 = stackOut_43_0;
                                      return stackIn_44_0 != 0;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              stackOut_36_0 = 0;
                              stackIn_37_0 = stackOut_36_0;
                              stackOut_37_0 = stackIn_37_0;
                              stackIn_38_0 = stackOut_37_0;
                              return stackIn_38_0 != 0;
                            }
                          }
                          L13: {
                            if (0 == var10) {
                              L14: {
                                param4 = false;
                                var10 = (int)((((la) this).field_c.a(-14) - -519L) / 520L);
                                if (0 == var10) {
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
                            if (-513 <= param0 + -var8) {
                              var10 = 0;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (-65536 < param2) {
                              L17: {
                                wi.field_c[5] = (byte)var9;
                                wi.field_c[6] = (byte)(var10 >> 16);
                                wi.field_c[7] = (byte)(var10 >> 8);
                                wi.field_c[4] = (byte)(var9 >> 8);
                                wi.field_c[8] = (byte)var10;
                                wi.field_c[9] = (byte)((la) this).field_b;
                                wi.field_c[2] = (byte)(param2 >> 8);
                                wi.field_c[3] = (byte)param2;
                                wi.field_c[0] = (byte)(param2 >> 24);
                                wi.field_c[1] = (byte)(param2 >> 16);
                                ((la) this).field_c.a((long)(var7_int * 520), 0);
                                ((la) this).field_c.a(-4573, 0, wi.field_c, 10);
                                var11 = -var8 + param0;
                                if (var11 <= 510) {
                                  break L17;
                                } else {
                                  var11 = 510;
                                  break L17;
                                }
                              }
                              ((la) this).field_c.a(-4573, var8, param3, var11);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                wi.field_c[3] = (byte)var9;
                                wi.field_c[1] = (byte)param2;
                                wi.field_c[5] = (byte)(var10 >> 8);
                                wi.field_c[2] = (byte)(var9 >> 8);
                                wi.field_c[7] = (byte)((la) this).field_b;
                                wi.field_c[6] = (byte)var10;
                                wi.field_c[4] = (byte)(var10 >> 16);
                                wi.field_c[0] = (byte)(param2 >> 8);
                                ((la) this).field_c.a((long)(var7_int * 520), 0);
                                ((la) this).field_c.a(-4573, 0, wi.field_c, 8);
                                var11 = -var8 + param0;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((la) this).field_c.a(-4573, var8, param3, var11);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L3;
                        }
                      }
                      stackOut_64_0 = 1;
                      stackIn_65_0 = stackOut_64_0;
                      stackOut_65_0 = stackIn_65_0;
                      stackIn_66_0 = stackOut_65_0;
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
                return stackIn_66_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_71_0 = (RuntimeException) var6_ref;
                stackOut_71_1 = new StringBuilder().append("la.D(").append(param0).append(',').append(-6).append(',').append(param2).append(',');
                stackIn_73_0 = stackOut_71_0;
                stackIn_73_1 = stackOut_71_1;
                stackIn_72_0 = stackOut_71_0;
                stackIn_72_1 = stackOut_71_1;
                if (param3 == null) {
                  stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
                  stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
                  stackOut_73_2 = "null";
                  stackIn_74_0 = stackOut_73_0;
                  stackIn_74_1 = stackOut_73_1;
                  stackIn_74_2 = stackOut_73_2;
                  break L19;
                } else {
                  stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
                  stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
                  stackOut_72_2 = "{...}";
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_74_1 = stackOut_72_1;
                  stackIn_74_2 = stackOut_72_2;
                  break L19;
                }
              }
              throw oj.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
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
            Object stackIn_37_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_43_0 = null;
            Object stackIn_44_0 = null;
            byte[] stackIn_49_0 = null;
            byte[] stackIn_50_0 = null;
            Object stackIn_52_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_48_0 = null;
            byte[] stackOut_49_0 = null;
            Object stackOut_42_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_36_0 = null;
            Object stackOut_37_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_51_0 = null;
            var19 = TorChallenge.field_F ? 1 : 0;
            var3 = (Object) (Object) ((la) this).field_c;
            synchronized (var3) {
              try {
                L0: {
                  if (~(long)(6 + 6 * param0) >= ~((la) this).field_e.a(-114)) {
                    ((la) this).field_e.a((long)(6 * param0), 0);
                    ((la) this).field_e.a(0, 6, (byte) 46, wi.field_c);
                    var4_int = (wi.field_c[2] & 255) + ((wi.field_c[0] & 255) << 16) - -((wi.field_c[1] & 255) << 8);
                    var5 = (wi.field_c[5] & 255) + ((255 & wi.field_c[4]) << 8) + ((255 & wi.field_c[3]) << 16);
                    var6 = -54 % ((-63 - param1) / 40);
                    if (var4_int >= 0) {
                      if (var4_int <= ((la) this).field_g) {
                        if (var5 > 0) {
                          if (~(((la) this).field_c.a(-117) / 520L) <= ~(long)var5) {
                            var7 = new byte[var4_int];
                            var8 = 0;
                            var9 = 0;
                            L1: while (true) {
                              if (var4_int <= var8) {
                                stackOut_48_0 = (byte[]) var7;
                                stackIn_49_0 = stackOut_48_0;
                                stackOut_49_0 = (byte[]) (Object) stackIn_49_0;
                                stackIn_50_0 = stackOut_49_0;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L2: {
                                    ((la) this).field_c.a((long)(var5 * 520), 0);
                                    var10 = var4_int + -var8;
                                    if (param0 > 65535) {
                                      L3: {
                                        var15 = 10;
                                        if (var10 > 510) {
                                          var10 = 510;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                      ((la) this).field_c.a(0, var10 + var15, (byte) 69, wi.field_c);
                                      var12 = ((255 & wi.field_c[4]) << 8) - -(255 & wi.field_c[5]);
                                      var14 = 255 & wi.field_c[9];
                                      var11 = ((wi.field_c[2] & 255) << 8) + (((255 & wi.field_c[1]) << 16) + ((wi.field_c[0] & 255) << 24)) + (255 & wi.field_c[3]);
                                      var13 = (wi.field_c[8] & 255) + (65280 & wi.field_c[7] << 8) + (16711680 & wi.field_c[6] << 16);
                                      break L2;
                                    } else {
                                      L4: {
                                        if (512 >= var10) {
                                          break L4;
                                        } else {
                                          var10 = 512;
                                          break L4;
                                        }
                                      }
                                      var15 = 8;
                                      ((la) this).field_c.a(0, var15 + var10, (byte) 98, wi.field_c);
                                      var12 = (255 & wi.field_c[3]) + (65280 & wi.field_c[2] << 8);
                                      var13 = (255 & wi.field_c[6]) + (((wi.field_c[4] & 255) << 16) + (wi.field_c[5] << 8 & 65280));
                                      var14 = wi.field_c[7] & 255;
                                      var11 = (wi.field_c[1] & 255) + ((255 & wi.field_c[0]) << 8);
                                      break L2;
                                    }
                                  }
                                  if (var11 == param0) {
                                    if (var9 == var12) {
                                      if (var14 == ((la) this).field_b) {
                                        if (var13 >= 0) {
                                          if (((la) this).field_c.a(23) / 520L >= (long)var13) {
                                            var16 = var10 + var15;
                                            var9++;
                                            var5 = var13;
                                            var17 = var15;
                                            L5: while (true) {
                                              if (~var16 >= ~var17) {
                                                continue L1;
                                              } else {
                                                int incrementValue$1 = var8;
                                                var8++;
                                                var7[incrementValue$1] = wi.field_c[var17];
                                                var17++;
                                                continue L5;
                                              }
                                            }
                                          } else {
                                            stackOut_42_0 = null;
                                            stackIn_43_0 = stackOut_42_0;
                                            stackOut_43_0 = stackIn_43_0;
                                            stackIn_44_0 = stackOut_43_0;
                                            return (byte[]) (Object) stackIn_44_0;
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
                stackOut_51_0 = null;
                stackIn_52_0 = stackOut_51_0;
                return (byte[]) (Object) stackIn_52_0;
              }
              return stackIn_50_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(qe param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qe var9 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_37_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var14 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (0 < param0.field_G) {
              L1: {
                var2_int = 0;
                if (param0.field_Q <= 0) {
                  break L1;
                } else {
                  var2_int = 1;
                  break L1;
                }
              }
              L2: {
                if (param0.field_Q >= 0) {
                  break L2;
                } else {
                  var2_int = -1;
                  break L2;
                }
              }
              var3 = param0.field_B + param0.field_Q;
              var4 = param0.field_o;
              var5 = -89;
              L3: while (true) {
                if (256 >= var3 * var2_int) {
                  L4: {
                    var6 = (-param0.field_o + var4) * var2_int;
                    if (var4 >= 64) {
                      var4 -= 64;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (0 > var4) {
                      var4 += 64;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var11 = 0;
                  var12 = 0;
                  L6: while (true) {
                    if (var6 <= var12) {
                      stackOut_37_0 = 1;
                      stackIn_38_0 = stackOut_37_0;
                      break L0;
                    } else {
                      L7: {
                        var7 = var2_int * var12 + param0.field_o;
                        var15 = var7 % 64;
                        var7 = var15;
                        if (var15 < 0) {
                          var15 += 64;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (null == n.field_kb[var15][param0.field_H]) {
                          break L8;
                        } else {
                          var13 = 0;
                          L9: while (true) {
                            if (n.field_kb[var15][param0.field_H].length <= var13) {
                              break L8;
                            } else {
                              L10: {
                                if (var13 < 0) {
                                  break L10;
                                } else {
                                  var8 = var13;
                                  if (eh.a(var2_int, -30917, n.field_kb[var15][param0.field_H], var8, param0)) {
                                    L11: {
                                      if (var11 == 0) {
                                        param0.field_Q = 8 * param0.field_Q / 10;
                                        var11 = 1;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    if (n.field_kb[var15][param0.field_H][var8] < ea.field_g.length) {
                                      var9 = ea.field_g[n.field_kb[var15][param0.field_H][var8]];
                                      if (var9 == null) {
                                        break L10;
                                      } else {
                                        var9.field_Q = param0.field_Q;
                                        break L10;
                                      }
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var13++;
                              continue L9;
                            }
                          }
                        }
                      }
                      var12++;
                      continue L6;
                    }
                  }
                } else {
                  var4 = var4 + var2_int;
                  var3 = var3 + var2_int * -256;
                  continue L3;
                }
              }
            } else {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("la.B(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L12;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L12;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + 75 + ')');
        }
        return stackIn_38_0;
    }

    final boolean a(int param0, byte[] param1, int param2, byte param3) {
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
            if (param3 >= 116) {
              break L0;
            } else {
              String discarded$3 = ((la) this).toString();
              break L0;
            }
          }
          var5 = (Object) (Object) ((la) this).field_c;
          synchronized (var5) {
            L1: {
              L2: {
                if (param2 < 0) {
                  break L2;
                } else {
                  if (param2 <= ((la) this).field_g) {
                    L3: {
                      var6 = this.a(param2, -6, param0, param1, true) ? 1 : 0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var6 = this.a(param2, -6, param0, param1, false) ? 1 : 0;
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
            stackOut_12_1 = new StringBuilder().append("la.G(").append(param0).append(',');
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
          throw oj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_d = null;
        field_f = null;
        if (param0 != -64) {
            la.b((byte) -70);
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        pa var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        rd var12 = null;
        pa var13 = null;
        int[] var14 = null;
        ql var15 = null;
        Object var16 = null;
        ql var16_ref = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var16 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = id.field_b;
              if (param0 < -29) {
                break L1;
              } else {
                la.a((byte) 70);
                break L1;
              }
            }
            L2: {
              var2 = var13.j(-126);
              if (var2 != 0) {
                if (1 != var2) {
                  if (var2 != 2) {
                    td.a("A1: " + ck.a(-13299), (Throwable) null, (byte) -74);
                    ob.b(-87);
                    break L2;
                  } else {
                    var16_ref = (ql) (Object) ji.field_q.c((byte) 125);
                    if (var16_ref == null) {
                      ob.b(-107);
                      return;
                    } else {
                      var16_ref.field_o = jj.b((byte) -24);
                      var16_ref.field_i = true;
                      var16_ref.field_m = var16_ref.field_o[0];
                      var16_ref.a(true);
                      break L2;
                    }
                  }
                } else {
                  var12 = (rd) (Object) bb.field_d.c((byte) 113);
                  if (var12 != null) {
                    var12.a(true);
                    break L2;
                  } else {
                    ob.b(-93);
                    return;
                  }
                }
              } else {
                var11 = jj.b((byte) -24);
                var19 = var11;
                var18 = var19;
                var17 = var18;
                var14 = var17;
                var3 = var14;
                var10 = var11;
                var4 = var10;
                var5 = var13;
                var6 = ((uf) (Object) var5).j(-95);
                var7 = 0;
                L3: while (true) {
                  if (var6 <= var7) {
                    var15 = (ql) (Object) ji.field_q.c((byte) 119);
                    if (var15 == null) {
                      ob.b(-100);
                      return;
                    } else {
                      var15.field_m = var19[0];
                      var15.field_o = var3;
                      var15.field_i = true;
                      var15.a(true);
                      break L2;
                    }
                  } else {
                    var10[var7] = ((uf) (Object) var5).i(38);
                    var7++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "la.F(" + param0 + ')');
        }
    }

    public final String toString() {
        return "" + ((la) this).field_b;
    }

    final static String a(byte param0, int param1, char param2) {
        int var4 = 0;
        int var5 = TorChallenge.field_F ? 1 : 0;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = 0; param1 > var4; var4++) {
            var6[var4] = '*';
        }
        return new String(var6);
    }

    la(int param0, rk param1, rk param2, int param3) {
        ((la) this).field_c = null;
        ((la) this).field_e = null;
        ((la) this).field_g = 65000;
        try {
            ((la) this).field_g = param3;
            ((la) this).field_b = param0;
            ((la) this).field_e = param2;
            ((la) this).field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "la.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
