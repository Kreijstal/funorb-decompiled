/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh {
    static int field_e;
    private jf field_b;
    private int field_c;
    private int field_a;
    static String field_g;
    static String field_d;
    private jf field_f;

    public final String toString() {
        return "" + ((vh) this).field_a;
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
            Object var19 = null;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_11_0 = null;
            Object stackIn_12_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            Object stackIn_40_0 = null;
            Object stackIn_41_0 = null;
            byte[] stackIn_53_0 = null;
            byte[] stackIn_54_0 = null;
            Object stackIn_56_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_52_0 = null;
            byte[] stackOut_53_0 = null;
            Object stackOut_39_0 = null;
            Object stackOut_40_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_10_0 = null;
            Object stackOut_11_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_55_0 = null;
            var18 = Bounce.field_N;
            var3 = (Object) (Object) ((vh) this).field_b;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(param1 * 6 + 6) <= ((vh) this).field_f.c(true)) {
                    L1: {
                      ((vh) this).field_f.a((byte) 57, (long)(param1 * 6));
                      ((vh) this).field_f.b(0, fk.field_c, 6, 11842);
                      if (param0 >= 98) {
                        break L1;
                      } else {
                        var19 = null;
                        boolean discarded$2 = ((vh) this).a(117, (byte) -44, 30, (byte[]) null);
                        break L1;
                      }
                    }
                    var4_int = ((255 & fk.field_c[0]) << 16) + ((fk.field_c[1] & 255) << 8) - -(255 & fk.field_c[2]);
                    var5 = ((fk.field_c[4] & 255) << 8) + ((fk.field_c[3] << 16 & 16711680) - -(255 & fk.field_c[5]));
                    if (0 <= var4_int) {
                      if (~((vh) this).field_c <= ~var4_int) {
                        if (var5 > 0) {
                          if ((long)var5 <= ((vh) this).field_b.c(true) / 520L) {
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
                                    ((vh) this).field_b.a((byte) 57, (long)(var5 * 520));
                                    var9 = var4_int - var7;
                                    if (param1 <= 65535) {
                                      L4: {
                                        if (var9 > 512) {
                                          var9 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var14 = 8;
                                      ((vh) this).field_b.b(0, fk.field_c, var9 + var14, 11842);
                                      var12 = (fk.field_c[5] << 8 & 65280) + (((fk.field_c[4] & 255) << 16) - -(255 & fk.field_c[6]));
                                      var10 = (fk.field_c[1] & 255) + (65280 & fk.field_c[0] << 8);
                                      var13 = 255 & fk.field_c[7];
                                      var11 = ((255 & fk.field_c[2]) << 8) - -(fk.field_c[3] & 255);
                                      break L3;
                                    } else {
                                      L5: {
                                        if (var9 > 510) {
                                          var9 = 510;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      var14 = 10;
                                      ((vh) this).field_b.b(0, fk.field_c, var14 + var9, 11842);
                                      var11 = (65280 & fk.field_c[4] << 8) + (fk.field_c[5] & 255);
                                      var12 = (fk.field_c[8] & 255) + ((255 & fk.field_c[6]) << 16) - -(fk.field_c[7] << 8 & 65280);
                                      var13 = 255 & fk.field_c[9];
                                      var10 = (65280 & fk.field_c[2] << 8) + ((255 & fk.field_c[1]) << 16) + ((fk.field_c[0] << 24 & -16777216) + (fk.field_c[3] & 255));
                                      break L3;
                                    }
                                  }
                                  if (~var10 == ~param1) {
                                    if (var8 == var11) {
                                      if (((vh) this).field_a == var13) {
                                        if (var12 >= 0) {
                                          if (~(((vh) this).field_b.c(true) / 520L) <= ~(long)var12) {
                                            var15 = var9 + var14;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (~var16 <= ~var15) {
                                                var8++;
                                                var5 = var12;
                                                continue L2;
                                              } else {
                                                int incrementValue$3 = var7;
                                                var7++;
                                                var6[incrementValue$3] = fk.field_c[var16];
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
                                        stackOut_39_0 = null;
                                        stackIn_40_0 = stackOut_39_0;
                                        stackOut_40_0 = stackIn_40_0;
                                        stackIn_41_0 = stackOut_40_0;
                                        return (byte[]) (Object) stackIn_41_0;
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

    final boolean a(int param0, byte param1, int param2, byte[] param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
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
          var5 = (Object) (Object) ((vh) this).field_b;
          synchronized (var5) {
            L0: {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (param0 > ((vh) this).field_c) {
                    break L1;
                  } else {
                    L2: {
                      var6 = this.a(0, param3, param0, true, param2) ? 1 : 0;
                      if (var6 == 0) {
                        var6 = this.a(0, param3, param0, false, param2) ? 1 : 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var7 = -102 % ((param1 - 59) / 45);
                    stackOut_8_0 = var6;
                    stackIn_9_0 = stackOut_8_0;
                    break L0;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_9_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5_ref;
            stackOut_12_1 = new StringBuilder().append("vh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static int a(boolean param0, String param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0) {
              stackOut_3_0 = jc.field_h.b(param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = ba.field_E.b(param1);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("vh.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + true + ')');
        }
        return stackIn_4_0;
    }

    private final boolean a(int param0, byte[] param1, int param2, boolean param3, int param4) {
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
            int stackIn_9_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_16_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_66_0 = 0;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            String stackIn_72_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_8_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_65_0 = 0;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            String stackOut_71_2 = null;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            String stackOut_70_2 = null;
            var16 = Bounce.field_N;
            try {
              var6_ref2 = (Object) (Object) ((vh) this).field_b;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param3) {
                        if (~(long)(param4 * 6 - -6) < ~((vh) this).field_f.c(true)) {
                          stackOut_8_0 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          stackOut_9_0 = stackIn_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0 != 0;
                        } else {
                          L2: {
                            ((vh) this).field_f.a((byte) 57, (long)(6 * param4));
                            ((vh) this).field_f.b(0, fk.field_c, 6, 11842);
                            var7_int = (16711680 & fk.field_c[3] << 16) + ((65280 & fk.field_c[4] << 8) - -(255 & fk.field_c[5]));
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (~(((vh) this).field_b.c(true) / 520L) > ~(long)var7_int) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          stackOut_15_0 = stackIn_15_0;
                          stackIn_16_0 = stackOut_15_0;
                          return stackIn_16_0 != 0;
                        }
                      } else {
                        var7_int = (int)((((vh) this).field_b.c(true) - -519L) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    fk.field_c[3] = (byte)(var7_int >> 16);
                    fk.field_c[2] = (byte)param2;
                    fk.field_c[4] = (byte)(var7_int >> 8);
                    fk.field_c[1] = (byte)(param2 >> 8);
                    fk.field_c[0] = (byte)(param2 >> 16);
                    fk.field_c[5] = (byte)var7_int;
                    ((vh) this).field_f.a((byte) 57, (long)(param4 * 6));
                    ((vh) this).field_f.a(0, fk.field_c, 6, 0);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (var8 >= param2) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (param3) {
                              L6: {
                                ((vh) this).field_b.a((byte) 57, (long)(var7_int * 520));
                                if (param4 > 65535) {
                                  try {
                                    L7: {
                                      ((vh) this).field_b.b(0, fk.field_c, 10, 11842);
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
                                    var13 = 255 & fk.field_c[9];
                                    var12 = (fk.field_c[5] & 255) + ((fk.field_c[4] & 255) << 8);
                                    var11 = ((fk.field_c[2] & 255) << 8) + (-16777216 & fk.field_c[0] << 24) + (((255 & fk.field_c[1]) << 16) + (255 & fk.field_c[3]));
                                    var10 = ((255 & fk.field_c[6]) << 16) + (65280 & fk.field_c[7] << 8) + (255 & fk.field_c[8]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((vh) this).field_b.b(0, fk.field_c, 8, 11842);
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
                                    var10 = (fk.field_c[5] << 8 & 65280) + (fk.field_c[4] << 16 & 16711680) - -(255 & fk.field_c[6]);
                                    var12 = ((fk.field_c[2] & 255) << 8) + (fk.field_c[3] & 255);
                                    var11 = (65280 & fk.field_c[0] << 8) - -(255 & fk.field_c[1]);
                                    var13 = 255 & fk.field_c[7];
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
                                    if (var13 != ((vh) this).field_a) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (var10 < 0) {
                                          break L12;
                                        } else {
                                          if (~(((vh) this).field_b.c(true) / 520L) > ~(long)var10) {
                                            break L12;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      stackOut_40_0 = 0;
                                      stackIn_41_0 = stackOut_40_0;
                                      stackOut_41_0 = stackIn_41_0;
                                      stackIn_42_0 = stackOut_41_0;
                                      return stackIn_42_0 != 0;
                                    }
                                  }
                                }
                              }
                              stackOut_34_0 = 0;
                              stackIn_35_0 = stackOut_34_0;
                              stackOut_35_0 = stackIn_35_0;
                              stackIn_36_0 = stackOut_35_0;
                              return stackIn_36_0 != 0;
                            } else {
                              break L5;
                            }
                          }
                          L13: {
                            if (var10 != 0) {
                              break L13;
                            } else {
                              L14: {
                                param3 = false;
                                var10 = (int)((((vh) this).field_b.c(true) + 519L) / 520L);
                                if (0 == var10) {
                                  var10++;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              if (var7_int == var10) {
                                var10++;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L15: {
                            if (-var8 + param2 > 512) {
                              break L15;
                            } else {
                              var10 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (param4 > 65535) {
                              L17: {
                                fk.field_c[4] = (byte)(var9 >> 8);
                                fk.field_c[7] = (byte)(var10 >> 8);
                                fk.field_c[3] = (byte)param4;
                                fk.field_c[9] = (byte)((vh) this).field_a;
                                fk.field_c[0] = (byte)(param4 >> 24);
                                fk.field_c[1] = (byte)(param4 >> 16);
                                fk.field_c[2] = (byte)(param4 >> 8);
                                fk.field_c[8] = (byte)var10;
                                fk.field_c[6] = (byte)(var10 >> 16);
                                fk.field_c[5] = (byte)var9;
                                ((vh) this).field_b.a((byte) 57, (long)(520 * var7_int));
                                ((vh) this).field_b.a(0, fk.field_c, 10, 0);
                                var11 = param2 + -var8;
                                if (var11 > 510) {
                                  var11 = 510;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((vh) this).field_b.a(0, param1, var11, var8);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                fk.field_c[7] = (byte)((vh) this).field_a;
                                fk.field_c[0] = (byte)(param4 >> 8);
                                fk.field_c[4] = (byte)(var10 >> 16);
                                fk.field_c[1] = (byte)param4;
                                fk.field_c[2] = (byte)(var9 >> 8);
                                fk.field_c[3] = (byte)var9;
                                fk.field_c[5] = (byte)(var10 >> 8);
                                fk.field_c[6] = (byte)var10;
                                ((vh) this).field_b.a((byte) 57, (long)(var7_int * 520));
                                ((vh) this).field_b.a(0, fk.field_c, 8, 0);
                                var11 = param2 + -var8;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((vh) this).field_b.a(0, param1, var11, var8);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L3;
                        }
                      }
                      stackOut_62_0 = 1;
                      stackIn_63_0 = stackOut_62_0;
                      stackOut_63_0 = stackIn_63_0;
                      stackIn_64_0 = stackOut_63_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_65_0 = 0;
                  stackIn_66_0 = stackOut_65_0;
                  return stackIn_66_0 != 0;
                }
                return stackIn_64_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_69_0 = (RuntimeException) var6_ref;
                stackOut_69_1 = new StringBuilder().append("vh.B(").append(0).append(',');
                stackIn_71_0 = stackOut_69_0;
                stackIn_71_1 = stackOut_69_1;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                if (param1 == null) {
                  stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
                  stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
                  stackOut_71_2 = "null";
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  stackIn_72_2 = stackOut_71_2;
                  break L19;
                } else {
                  stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
                  stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
                  stackOut_70_2 = "{...}";
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  stackIn_72_2 = stackOut_70_2;
                  break L19;
                }
              }
              throw ii.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b() {
        field_d = null;
        field_g = null;
    }

    final static tg[] a(gk param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        tg[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        tg[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var6 = 122 % ((param2 - 59) / 46);
            var4_int = param0.a(param1, false);
            var5 = param0.a(var4_int, param3, 95);
            int discarded$2 = 0;
            stackOut_0_0 = kf.a(var4_int, var5, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("vh.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a() {
    }

    final static boolean a(int param0, byte param1) {
        if (param1 != 88) {
            field_e = 93;
        }
        if (param0 == -1) {
            return true;
        }
        return (1 << param0 & ck.field_a) != 0 ? true : false;
    }

    vh(int param0, jf param1, jf param2, int param3) {
        ((vh) this).field_b = null;
        ((vh) this).field_c = 65000;
        ((vh) this).field_f = null;
        try {
            ((vh) this).field_a = param0;
            ((vh) this).field_f = param2;
            ((vh) this).field_c = param3;
            ((vh) this).field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "vh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_d = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
