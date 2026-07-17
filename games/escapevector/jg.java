/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jg {
    private int field_b;
    static int[][] field_c;
    private rg field_a;
    private int field_e;
    private rg field_d;

    final static void a(byte param0) {
        t var1 = null;
        L0: {
          var1 = pl.field_q;
          if (!var1.field_c) {
            break L0;
          } else {
            if (bj.e((byte) -39)) {
              return;
            } else {
              break L0;
            }
          }
        }
        if (!var1.field_c) {
          if (!bj.e((byte) 97)) {
            return;
          } else {
            pl.field_q = new t();
            mj.field_d = 0;
            oe.c((byte) -9);
            return;
          }
        } else {
          pl.field_q = new t();
          mj.field_d = 0;
          oe.c((byte) -9);
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        var3 = je.a(false, param0);
        if (param2 >= -1) {
          if (var3 <= param2) {
            return -1;
          } else {
            L0: {
              if (param1 == 13565) {
                break L0;
              } else {
                int discarded$2 = jg.a(-18, -9, 48);
                break L0;
              }
            }
            return param2;
          }
        } else {
          return -1;
        }
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
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            Object stackIn_44_0 = null;
            Object stackIn_45_0 = null;
            byte[] stackIn_50_0 = null;
            byte[] stackIn_51_0 = null;
            Object stackIn_53_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_49_0 = null;
            byte[] stackOut_50_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_44_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_52_0 = null;
            var18 = EscapeVector.field_A;
            var3 = (Object) (Object) ((jg) this).field_a;
            synchronized (var3) {
              try {
                L0: {
                  if (~(long)(6 + param0 * 6) >= ~((jg) this).field_d.a(param1 ^ 22554)) {
                    ((jg) this).field_d.a(param1 + -26296, (long)(6 * param0));
                    ((jg) this).field_d.a(0, 6, (byte) 101, bo.field_G);
                    var4_int = (bo.field_G[2] & 255) + ((65280 & bo.field_G[1] << 8) + (16711680 & bo.field_G[0] << 16));
                    var5 = ((255 & bo.field_G[3]) << 16) + (bo.field_G[4] << 8 & 65280) - -(bo.field_G[5] & 255);
                    if (var4_int >= 0) {
                      if (var4_int <= ((jg) this).field_e) {
                        if (var5 > 0) {
                          if (((jg) this).field_a.a(16034) / 520L >= (long)var5) {
                            L1: {
                              if (param1 == 26296) {
                                break L1;
                              } else {
                                String discarded$2 = ((jg) this).toString();
                                break L1;
                              }
                            }
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (~var7 <= ~var4_int) {
                                stackOut_49_0 = (byte[]) var6;
                                stackIn_50_0 = stackOut_49_0;
                                stackOut_50_0 = (byte[]) (Object) stackIn_50_0;
                                stackIn_51_0 = stackOut_50_0;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L3: {
                                    ((jg) this).field_a.a(param1 ^ 26296, (long)(520 * var5));
                                    var9 = var4_int - var7;
                                    if (param0 > 65535) {
                                      L4: {
                                        if (var9 <= 510) {
                                          break L4;
                                        } else {
                                          var9 = 510;
                                          break L4;
                                        }
                                      }
                                      var14 = 10;
                                      ((jg) this).field_a.a(0, var9 + var14, (byte) 101, bo.field_G);
                                      var13 = bo.field_G[9] & 255;
                                      var12 = (255 & bo.field_G[8]) + (bo.field_G[6] << 16 & 16711680) - -((255 & bo.field_G[7]) << 8);
                                      var11 = (255 & bo.field_G[5]) + ((255 & bo.field_G[4]) << 8);
                                      var10 = ((255 & bo.field_G[1]) << 16) + ((bo.field_G[0] & 255) << 24) + (((255 & bo.field_G[2]) << 8) - -(255 & bo.field_G[3]));
                                      break L3;
                                    } else {
                                      L5: {
                                        var14 = 8;
                                        if (var9 <= 512) {
                                          break L5;
                                        } else {
                                          var9 = 512;
                                          break L5;
                                        }
                                      }
                                      ((jg) this).field_a.a(0, var9 - -var14, (byte) 101, bo.field_G);
                                      var12 = (255 & bo.field_G[6]) + ((16711680 & bo.field_G[4] << 16) + ((255 & bo.field_G[5]) << 8));
                                      var11 = (bo.field_G[3] & 255) + (bo.field_G[2] << 8 & 65280);
                                      var10 = (65280 & bo.field_G[0] << 8) + (255 & bo.field_G[1]);
                                      var13 = bo.field_G[7] & 255;
                                      break L3;
                                    }
                                  }
                                  if (param0 == var10) {
                                    if (~var11 == ~var8) {
                                      if (((jg) this).field_b == var13) {
                                        if (var12 >= 0) {
                                          if (~(long)var12 >= ~(((jg) this).field_a.a(16034) / 520L)) {
                                            var15 = var9 + var14;
                                            var8++;
                                            var5 = var12;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (~var15 >= ~var16) {
                                                continue L2;
                                              } else {
                                                int incrementValue$3 = var7;
                                                var7++;
                                                var6[incrementValue$3] = bo.field_G[var16];
                                                var16++;
                                                continue L6;
                                              }
                                            }
                                          } else {
                                            stackOut_43_0 = null;
                                            stackIn_44_0 = stackOut_43_0;
                                            stackOut_44_0 = stackIn_44_0;
                                            stackIn_45_0 = stackOut_44_0;
                                            return (byte[]) (Object) stackIn_45_0;
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

    final boolean a(byte param0, int param1, int param2, byte[] param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          var5 = (Object) (Object) ((jg) this).field_a;
          synchronized (var5) {
            L0: {
              L1: {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (((jg) this).field_e < param2) {
                    break L1;
                  } else {
                    L2: {
                      if (param0 == 18) {
                        break L2;
                      } else {
                        ((jg) this).field_b = -93;
                        break L2;
                      }
                    }
                    L3: {
                      var6 = this.a(512, param1, param3, param2, true) ? 1 : 0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var6 = this.a(param0 ^ 530, param1, param3, param2, false) ? 1 : 0;
                        break L3;
                      }
                    }
                    stackOut_9_0 = var6;
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_10_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5_ref;
            stackOut_13_1 = new StringBuilder().append("jg.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    public static void a(boolean param0) {
        field_c = null;
    }

    public final String toString() {
        return "" + ((jg) this).field_b;
    }

    private final boolean a(int param0, int param1, byte[] param2, int param3, boolean param4) {
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
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
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
            var16 = EscapeVector.field_A;
            try {
              var6_ref2 = (Object) (Object) ((jg) this).field_a;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param4) {
                        if (~(long)(6 * param1 + 6) < ~((jg) this).field_d.a(16034)) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        } else {
                          L2: {
                            ((jg) this).field_d.a(param0 + -512, (long)(param1 * 6));
                            ((jg) this).field_d.a(0, 6, (byte) 101, bo.field_G);
                            var7_int = (bo.field_G[5] & 255) + (((255 & bo.field_G[3]) << 16) + ((bo.field_G[4] & 255) << 8));
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (~(long)var7_int >= ~(((jg) this).field_a.a(param0 + 15522) / 520L)) {
                                break L1;
                              } else {
                                break L2;
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
                        var7_int = (int)((519L + ((jg) this).field_a.a(16034)) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    L3: {
                      bo.field_G[4] = (byte)(var7_int >> 8);
                      bo.field_G[5] = (byte)var7_int;
                      bo.field_G[1] = (byte)(param3 >> 8);
                      bo.field_G[0] = (byte)(param3 >> 16);
                      bo.field_G[3] = (byte)(var7_int >> 16);
                      bo.field_G[2] = (byte)param3;
                      if (param0 == 512) {
                        break L3;
                      } else {
                        byte[] discarded$1 = ((jg) this).a(21, -91);
                        break L3;
                      }
                    }
                    ((jg) this).field_d.a(0, (long)(param1 * 6));
                    ((jg) this).field_d.a(true, 0, bo.field_G, 6);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (var8 >= param3) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (!param4) {
                              break L6;
                            } else {
                              L7: {
                                ((jg) this).field_a.a(0, (long)(var7_int * 520));
                                if (param1 > 65535) {
                                  try {
                                    L8: {
                                      ((jg) this).field_a.a(0, 10, (byte) 101, bo.field_G);
                                      decompiledRegionSelector1 = 0;
                                      break L8;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L9: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L9;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var11 = (bo.field_G[1] << 16 & 16711680) + ((bo.field_G[0] << 24 & -16777216) - -((bo.field_G[2] & 255) << 8) - -(bo.field_G[3] & 255));
                                    var12 = ((bo.field_G[4] & 255) << 8) - -(bo.field_G[5] & 255);
                                    var10 = ((255 & bo.field_G[7]) << 8) + ((bo.field_G[6] << 16 & 16711680) - -(255 & bo.field_G[8]));
                                    var13 = 255 & bo.field_G[9];
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      ((jg) this).field_a.a(0, 8, (byte) 101, bo.field_G);
                                      decompiledRegionSelector0 = 0;
                                      break L10;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L11: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L11;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var13 = 255 & bo.field_G[7];
                                    var12 = (255 & bo.field_G[3]) + (bo.field_G[2] << 8 & 65280);
                                    var11 = (255 & bo.field_G[1]) + (bo.field_G[0] << 8 & 65280);
                                    var10 = (bo.field_G[6] & 255) + (16711680 & bo.field_G[4] << 16) + (bo.field_G[5] << 8 & 65280);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L12: {
                                if (var11 != param1) {
                                  break L12;
                                } else {
                                  if (var12 != var9) {
                                    break L12;
                                  } else {
                                    if (((jg) this).field_b != var13) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (var10 < 0) {
                                          break L13;
                                        } else {
                                          if ((long)var10 <= ((jg) this).field_a.a(16034) / 520L) {
                                            break L6;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      stackOut_41_0 = 0;
                                      stackIn_42_0 = stackOut_41_0;
                                      stackOut_42_0 = stackIn_42_0;
                                      stackIn_43_0 = stackOut_42_0;
                                      return stackIn_43_0 != 0;
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
                          L14: {
                            if (0 != var10) {
                              break L14;
                            } else {
                              L15: {
                                var10 = (int)((519L + ((jg) this).field_a.a(param0 + 15522)) / 520L);
                                param4 = false;
                                if (var10 != 0) {
                                  break L15;
                                } else {
                                  var10++;
                                  break L15;
                                }
                              }
                              if (var7_int != var10) {
                                break L14;
                              } else {
                                var10++;
                                break L14;
                              }
                            }
                          }
                          L16: {
                            if (-var8 + param3 <= 512) {
                              var10 = 0;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (param1 <= 65535) {
                              L18: {
                                bo.field_G[6] = (byte)var10;
                                bo.field_G[5] = (byte)(var10 >> 8);
                                bo.field_G[7] = (byte)((jg) this).field_b;
                                bo.field_G[0] = (byte)(param1 >> 8);
                                bo.field_G[3] = (byte)var9;
                                bo.field_G[4] = (byte)(var10 >> 16);
                                bo.field_G[1] = (byte)param1;
                                bo.field_G[2] = (byte)(var9 >> 8);
                                ((jg) this).field_a.a(0, (long)(520 * var7_int));
                                ((jg) this).field_a.a(true, 0, bo.field_G, 8);
                                var11 = -var8 + param3;
                                if (var11 <= 512) {
                                  break L18;
                                } else {
                                  var11 = 512;
                                  break L18;
                                }
                              }
                              ((jg) this).field_a.a(true, var8, param2, var11);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                bo.field_G[9] = (byte)((jg) this).field_b;
                                bo.field_G[6] = (byte)(var10 >> 16);
                                bo.field_G[3] = (byte)param1;
                                bo.field_G[5] = (byte)var9;
                                bo.field_G[2] = (byte)(param1 >> 8);
                                bo.field_G[7] = (byte)(var10 >> 8);
                                bo.field_G[8] = (byte)var10;
                                bo.field_G[0] = (byte)(param1 >> 24);
                                bo.field_G[4] = (byte)(var9 >> 8);
                                bo.field_G[1] = (byte)(param1 >> 16);
                                ((jg) this).field_a.a(param0 + -512, (long)(520 * var7_int));
                                ((jg) this).field_a.a(true, 0, bo.field_G, 10);
                                var11 = param3 + -var8;
                                if (var11 <= 510) {
                                  break L19;
                                } else {
                                  var11 = 510;
                                  break L19;
                                }
                              }
                              ((jg) this).field_a.a(true, var8, param2, var11);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L4;
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
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_67_0 = (RuntimeException) var6_ref;
                stackOut_67_1 = new StringBuilder().append("jg.A(").append(param0).append(44).append(param1).append(44);
                stackIn_69_0 = stackOut_67_0;
                stackIn_69_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (param2 == null) {
                  stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                  stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
                  stackOut_69_2 = "null";
                  stackIn_70_0 = stackOut_69_0;
                  stackIn_70_1 = stackOut_69_1;
                  stackIn_70_2 = stackOut_69_2;
                  break L20;
                } else {
                  stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
                  stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
                  stackOut_68_2 = "{...}";
                  stackIn_70_0 = stackOut_68_0;
                  stackIn_70_1 = stackOut_68_1;
                  stackIn_70_2 = stackOut_68_2;
                  break L20;
                }
              }
              throw t.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + 44 + param3 + 44 + param4 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(Throwable param0, int param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        rn var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = EscapeVector.field_A;
          if (!(param0 instanceof rn)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var14 = (rn) (Object) param0;
            param0 = var14.field_a;
            var2 = var14.field_g + " | ";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var11 = var8;
          var2 = var11;
          var11 = var8;
          if (var8 == null) {
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (var9 == -1) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8.substring(0, var9);
                break L2;
              }
            }
            L3: {
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(1 + var16.lastIndexOf(' '));
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf('\t') + 1);
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (var9 == -1) {
                break L3;
              } else {
                if (-1 != var10) {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 < 0) {
                    break L3;
                  } else {
                    var2 = var19 + var8.substring(var12 + 5, var10);
                    break L3;
                  }
                } else {
                  var2 = var2 + 32;
                  continue L1;
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          }
        }
    }

    jg(int param0, rg param1, rg param2, int param3) {
        ((jg) this).field_e = 65000;
        ((jg) this).field_d = null;
        ((jg) this).field_a = null;
        try {
            ((jg) this).field_d = param2;
            ((jg) this).field_b = param0;
            ((jg) this).field_e = param3;
            ((jg) this).field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "jg.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    static {
    }
}
