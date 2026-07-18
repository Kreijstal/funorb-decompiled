/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jh {
    private sk field_d;
    private int field_a;
    private int field_b;
    private sk field_c;

    final boolean a(byte[] param0, byte param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        Object var8 = null;
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
          var5 = (Object) (Object) ((jh) this).field_d;
          synchronized (var5) {
            L0: {
              L1: {
                if (0 > param3) {
                  break L1;
                } else {
                  if (param3 <= ((jh) this).field_a) {
                    L2: {
                      if (param1 == -53) {
                        break L2;
                      } else {
                        var8 = null;
                        jh.a((java.awt.Component) null, (d) null, false, (kj) null, false, -103);
                        break L2;
                      }
                    }
                    L3: {
                      var6 = this.a(255, param3, param2, param0, true) ? 1 : 0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var6 = this.a(255, param3, param2, param0, false) ? 1 : 0;
                        break L3;
                      }
                    }
                    stackOut_8_0 = var6;
                    stackIn_9_0 = stackOut_8_0;
                    break L0;
                  } else {
                    break L1;
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
            stackOut_12_1 = new StringBuilder().append("jh.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final byte[] a(int param0, byte param1) {
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
            Object stackIn_11_0 = null;
            Object stackIn_12_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            byte[] stackIn_53_0 = null;
            byte[] stackIn_54_0 = null;
            Object stackIn_56_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_52_0 = null;
            byte[] stackOut_53_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_10_0 = null;
            Object stackOut_11_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_55_0 = null;
            var18 = Geoblox.field_C;
            var3 = (Object) (Object) ((jh) this).field_d;
            synchronized (var3) {
              try {
                L0: {
                  if (~((jh) this).field_c.a((byte) 46) <= ~(long)(param0 * 6 + 6)) {
                    L1: {
                      if (param1 <= -14) {
                        break L1;
                      } else {
                        ((jh) this).field_d = null;
                        break L1;
                      }
                    }
                    ((jh) this).field_c.a(-128, (long)(6 * param0));
                    ((jh) this).field_c.a(dj.field_F, 6, 0, 9868);
                    var4_int = (dj.field_F[2] & 255) + (((255 & dj.field_F[0]) << 16) + (dj.field_F[1] << 8 & 65280));
                    var5 = (dj.field_F[3] << 16 & 16711680) + (65280 & dj.field_F[4] << 8) + (255 & dj.field_F[5]);
                    if (var4_int >= 0) {
                      if (((jh) this).field_a >= var4_int) {
                        if (var5 > 0) {
                          if ((long)var5 <= ((jh) this).field_d.a((byte) 46) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_52_0 = (byte[]) var6;
                                stackIn_53_0 = stackOut_52_0;
                                stackOut_53_0 = (byte[]) (Object) stackIn_53_0;
                                stackIn_54_0 = stackOut_53_0;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L3: {
                                    ((jh) this).field_d.a(0, (long)(520 * var5));
                                    var9 = -var7 + var4_int;
                                    if (65535 < param0) {
                                      L4: {
                                        if (510 < var9) {
                                          var9 = 510;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var14 = 10;
                                      ((jh) this).field_d.a(dj.field_F, var9 + var14, 0, 9868);
                                      var10 = (255 & dj.field_F[3]) + ((65280 & dj.field_F[2] << 8) + (-16777216 & dj.field_F[0] << 24) - -(16711680 & dj.field_F[1] << 16));
                                      var11 = (255 & dj.field_F[5]) + (65280 & dj.field_F[4] << 8);
                                      var13 = dj.field_F[9] & 255;
                                      var12 = ((dj.field_F[7] & 255) << 8) + ((16711680 & dj.field_F[6] << 16) - -(dj.field_F[8] & 255));
                                      break L3;
                                    } else {
                                      L5: {
                                        var14 = 8;
                                        if (var9 > 512) {
                                          var9 = 512;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      ((jh) this).field_d.a(dj.field_F, var9 - -var14, 0, 9868);
                                      var12 = (255 & dj.field_F[6]) + (((dj.field_F[4] & 255) << 16) - -((255 & dj.field_F[5]) << 8));
                                      var11 = (255 & dj.field_F[3]) + (dj.field_F[2] << 8 & 65280);
                                      var13 = 255 & dj.field_F[7];
                                      var10 = (dj.field_F[1] & 255) + ((dj.field_F[0] & 255) << 8);
                                      break L3;
                                    }
                                  }
                                  if (var10 == param0) {
                                    if (var11 == var8) {
                                      if (((jh) this).field_b == var13) {
                                        if (var12 >= 0) {
                                          if (((jh) this).field_d.a((byte) 46) / 520L >= (long)var12) {
                                            var15 = var9 + var14;
                                            var8++;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var16 >= var15) {
                                                var5 = var12;
                                                continue L2;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = dj.field_F[var16];
                                                var16++;
                                                continue L6;
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
                                  stackOut_22_0 = null;
                                  stackIn_23_0 = stackOut_22_0;
                                  stackOut_23_0 = stackIn_23_0;
                                  stackIn_24_0 = stackOut_23_0;
                                  return (byte[]) (Object) stackIn_24_0;
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
                        stackOut_10_0 = null;
                        stackIn_11_0 = stackOut_10_0;
                        stackOut_11_0 = stackIn_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        return (byte[]) (Object) stackIn_12_0;
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
                stackOut_55_0 = null;
                stackIn_56_0 = stackOut_55_0;
                return (byte[]) (Object) stackIn_56_0;
              }
              return stackIn_54_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

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
            int stackIn_6_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_64_0 = 0;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            String stackIn_70_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_63_0 = 0;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            String stackOut_69_2 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            var16 = Geoblox.field_C;
            try {
              var6_ref2 = (Object) (Object) ((jh) this).field_d;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param4) {
                        var7_int = (int)((((jh) this).field_d.a((byte) 46) - -519L) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if (((jh) this).field_c.a((byte) 46) < (long)(6 + param2 * 6)) {
                          stackOut_5_0 = 0;
                          stackIn_6_0 = stackOut_5_0;
                          stackOut_6_0 = stackIn_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        } else {
                          L2: {
                            ((jh) this).field_c.a(27, (long)(param2 * 6));
                            ((jh) this).field_c.a(dj.field_F, 6, 0, 9868);
                            var7_int = (dj.field_F[5] & 255) + (((255 & dj.field_F[4]) << 8) + ((255 & dj.field_F[3]) << 16));
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (((jh) this).field_d.a((byte) 46) / 520L < (long)var7_int) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          stackOut_12_0 = stackIn_12_0;
                          stackIn_13_0 = stackOut_12_0;
                          return stackIn_13_0 != 0;
                        }
                      }
                    }
                    dj.field_F[3] = (byte)(var7_int >> 16);
                    dj.field_F[2] = (byte)param1;
                    dj.field_F[1] = (byte)(param1 >> 8);
                    dj.field_F[4] = (byte)(var7_int >> 8);
                    dj.field_F[5] = (byte)var7_int;
                    dj.field_F[0] = (byte)(param1 >> 16);
                    ((jh) this).field_c.a(-125, (long)(param2 * 6));
                    ((jh) this).field_c.a(6, 0, dj.field_F, false);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (param1 <= var8) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (!param4) {
                              break L5;
                            } else {
                              L6: {
                                ((jh) this).field_d.a(64, (long)(520 * var7_int));
                                if (65535 >= param2) {
                                  try {
                                    L7: {
                                      ((jh) this).field_d.a(dj.field_F, 8, 0, 9868);
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
                                    var11 = ((255 & dj.field_F[0]) << 8) - -(255 & dj.field_F[1]);
                                    var12 = (dj.field_F[3] & 255) + ((255 & dj.field_F[2]) << 8);
                                    var13 = 255 & dj.field_F[7];
                                    var10 = (dj.field_F[6] & 255) + ((65280 & dj.field_F[5] << 8) + (16711680 & dj.field_F[4] << 16));
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((jh) this).field_d.a(dj.field_F, 10, 0, 9868);
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
                                    var11 = (65280 & dj.field_F[2] << 8) + (((255 & dj.field_F[0]) << 24) + (((dj.field_F[1] & 255) << 16) + (255 & dj.field_F[3])));
                                    var13 = dj.field_F[9] & 255;
                                    var10 = (dj.field_F[8] & 255) + ((255 & dj.field_F[6]) << 16) - -(65280 & dj.field_F[7] << 8);
                                    var12 = (dj.field_F[4] << 8 & 65280) + (255 & dj.field_F[5]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (var11 != param2) {
                                  break L11;
                                } else {
                                  if (var9 != var12) {
                                    break L11;
                                  } else {
                                    if (var13 == ((jh) this).field_b) {
                                      L12: {
                                        if (var10 < 0) {
                                          break L12;
                                        } else {
                                          if (~(((jh) this).field_d.a((byte) 46) / 520L) > ~(long)var10) {
                                            break L12;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      stackOut_39_0 = 0;
                                      stackIn_40_0 = stackOut_39_0;
                                      stackOut_40_0 = stackIn_40_0;
                                      stackIn_41_0 = stackOut_40_0;
                                      return stackIn_41_0 != 0;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              stackOut_33_0 = 0;
                              stackIn_34_0 = stackOut_33_0;
                              stackOut_34_0 = stackIn_34_0;
                              stackIn_35_0 = stackOut_34_0;
                              return stackIn_35_0 != 0;
                            }
                          }
                          L13: {
                            if (var10 != 0) {
                              break L13;
                            } else {
                              L14: {
                                param4 = false;
                                var10 = (int)((519L + ((jh) this).field_d.a((byte) 46)) / 520L);
                                if (var10 != 0) {
                                  break L14;
                                } else {
                                  var10++;
                                  break L14;
                                }
                              }
                              if (var7_int != var10) {
                                break L13;
                              } else {
                                var10++;
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
                            if (param2 <= 65535) {
                              L17: {
                                dj.field_F[4] = (byte)(var10 >> 16);
                                dj.field_F[2] = (byte)(var9 >> 8);
                                dj.field_F[0] = (byte)(param2 >> 8);
                                dj.field_F[7] = (byte)((jh) this).field_b;
                                dj.field_F[1] = (byte)param2;
                                dj.field_F[5] = (byte)(var10 >> 8);
                                dj.field_F[3] = (byte)var9;
                                dj.field_F[6] = (byte)var10;
                                ((jh) this).field_d.a(-97, (long)(520 * var7_int));
                                ((jh) this).field_d.a(8, 0, dj.field_F, false);
                                var11 = param1 - var8;
                                if (512 < var11) {
                                  var11 = 512;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((jh) this).field_d.a(var11, var8, param3, false);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                dj.field_F[6] = (byte)(var10 >> 16);
                                dj.field_F[5] = (byte)var9;
                                dj.field_F[2] = (byte)(param2 >> 8);
                                dj.field_F[9] = (byte)((jh) this).field_b;
                                dj.field_F[4] = (byte)(var9 >> 8);
                                dj.field_F[1] = (byte)(param2 >> 16);
                                dj.field_F[7] = (byte)(var10 >> 8);
                                dj.field_F[8] = (byte)var10;
                                dj.field_F[3] = (byte)param2;
                                dj.field_F[0] = (byte)(param2 >> 24);
                                ((jh) this).field_d.a(73, (long)(var7_int * 520));
                                ((jh) this).field_d.a(10, 0, dj.field_F, false);
                                var11 = param1 - var8;
                                if (510 < var11) {
                                  var11 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((jh) this).field_d.a(var11, var8, param3, false);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L3;
                        }
                      }
                      stackOut_60_0 = 1;
                      stackIn_61_0 = stackOut_60_0;
                      stackOut_61_0 = stackIn_61_0;
                      stackIn_62_0 = stackOut_61_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  return stackIn_64_0 != 0;
                }
                return stackIn_62_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_67_0 = (RuntimeException) var6_ref;
                stackOut_67_1 = new StringBuilder().append("jh.C(").append(255).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_69_0 = stackOut_67_0;
                stackIn_69_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (param3 == null) {
                  stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                  stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
                  stackOut_69_2 = "null";
                  stackIn_70_0 = stackOut_69_0;
                  stackIn_70_1 = stackOut_69_1;
                  stackIn_70_2 = stackOut_69_2;
                  break L19;
                } else {
                  stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
                  stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
                  stackOut_68_2 = "{...}";
                  stackIn_70_0 = stackOut_68_0;
                  stackIn_70_1 = stackOut_68_1;
                  stackIn_70_2 = stackOut_68_2;
                  break L19;
                }
              }
              throw t.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((jh) this).field_b;
    }

    final static void a(java.awt.Component param0, d param1, boolean param2, kj param3, boolean param4, int param5) {
        qk.a(param5, param4, 10);
        fj.field_p = qk.a(param1, param0, 0, 22050);
        try {
            oh.field_a = qk.a(param1, param0, 1, 1000);
            ge.field_d = new ob();
            oh.field_a.b((ia) (Object) ge.field_d);
            uh.field_y = param3;
            wg.a(-15346, oc.field_c);
            ag.a(j.field_gb, (byte) -67);
            fj.field_p.b((ia) (Object) param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "jh.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + false + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    jh(int param0, sk param1, sk param2, int param3) {
        ((jh) this).field_d = null;
        ((jh) this).field_a = 65000;
        ((jh) this).field_c = null;
        try {
            ((jh) this).field_a = param3;
            ((jh) this).field_d = param1;
            ((jh) this).field_c = param2;
            ((jh) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "jh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
