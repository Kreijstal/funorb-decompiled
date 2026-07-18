/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.applet.Applet;

final class np {
    private int field_h;
    private ir field_i;
    static String field_a;
    static int field_d;
    static String field_c;
    private ir field_f;
    static String field_g;
    private int field_b;
    static String field_e;

    public static void a() {
        field_c = null;
        field_e = null;
        field_g = null;
        field_a = null;
    }

    final byte[] a(byte param0, int param1) {
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
            Object stackIn_7_0 = null;
            Object stackIn_8_0 = null;
            Object stackIn_19_0 = null;
            Object stackIn_20_0 = null;
            Object stackIn_47_0 = null;
            Object stackIn_48_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_46_0 = null;
            Object stackOut_47_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            Object stackOut_6_0 = null;
            Object stackOut_7_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_56_0 = null;
            var18 = Pool.field_O;
            var3 = (Object) (Object) ((np) this).field_i;
            synchronized (var3) {
              try {
                L0: {
                  if (~((np) this).field_f.d((byte) 17) <= ~(long)(6 + param1 * 6)) {
                    ((np) this).field_f.a(0, (long)(param1 * 6));
                    if (param0 == -110) {
                      ((np) this).field_f.a((byte) -111, 6, 0, dg.field_S);
                      var4_int = (dg.field_S[2] & 255) + (16711680 & dg.field_S[0] << 16) + (dg.field_S[1] << 8 & 65280);
                      var5 = (255 & dg.field_S[5]) + (dg.field_S[3] << 16 & 16711680) - -(dg.field_S[4] << 8 & 65280);
                      if (var4_int >= 0) {
                        if (var4_int <= ((np) this).field_b) {
                          if (var5 > 0) {
                            if (((np) this).field_i.d((byte) 17) / 520L >= (long)var5) {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              var8 = 0;
                              L1: while (true) {
                                if (var7 >= var4_int) {
                                  stackOut_53_0 = (byte[]) var6;
                                  stackIn_54_0 = stackOut_53_0;
                                  stackOut_54_0 = (byte[]) (Object) stackIn_54_0;
                                  stackIn_55_0 = stackOut_54_0;
                                  break L0;
                                } else {
                                  if (var5 != 0) {
                                    L2: {
                                      ((np) this).field_i.a(param0 ^ -110, (long)(520 * var5));
                                      var9 = var4_int - var7;
                                      if (65535 >= param1) {
                                        L3: {
                                          if (var9 <= 512) {
                                            break L3;
                                          } else {
                                            var9 = 512;
                                            break L3;
                                          }
                                        }
                                        var14 = 8;
                                        ((np) this).field_i.a((byte) -115, var14 + var9, 0, dg.field_S);
                                        var12 = (dg.field_S[5] << 8 & 65280) + (dg.field_S[4] << 16 & 16711680) - -(dg.field_S[6] & 255);
                                        var11 = ((dg.field_S[2] & 255) << 8) - -(dg.field_S[3] & 255);
                                        var13 = dg.field_S[7] & 255;
                                        var10 = (dg.field_S[1] & 255) + (65280 & dg.field_S[0] << 8);
                                        break L2;
                                      } else {
                                        L4: {
                                          if (var9 > 510) {
                                            var9 = 510;
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        }
                                        var14 = 10;
                                        ((np) this).field_i.a((byte) -126, var9 + var14, 0, dg.field_S);
                                        var12 = (dg.field_S[7] << 8 & 65280) + (16711680 & dg.field_S[6] << 16) + (255 & dg.field_S[8]);
                                        var13 = dg.field_S[9] & 255;
                                        var11 = (255 & dg.field_S[5]) + (dg.field_S[4] << 8 & 65280);
                                        var10 = (dg.field_S[3] & 255) + (-16777216 & dg.field_S[0] << 24) - -((dg.field_S[1] & 255) << 16) + ((dg.field_S[2] & 255) << 8);
                                        break L2;
                                      }
                                    }
                                    if (var10 == param1) {
                                      if (var11 == var8) {
                                        if (var13 == ((np) this).field_h) {
                                          if (var12 >= 0) {
                                            if ((long)var12 <= ((np) this).field_i.d((byte) 17) / 520L) {
                                              var15 = var14 + var9;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (var15 <= var16) {
                                                  var8++;
                                                  var5 = var12;
                                                  continue L1;
                                                } else {
                                                  int incrementValue$1 = var7;
                                                  var7++;
                                                  var6[incrementValue$1] = dg.field_S[var16];
                                                  var16++;
                                                  continue L5;
                                                }
                                              }
                                            } else {
                                              stackOut_46_0 = null;
                                              stackIn_47_0 = stackOut_46_0;
                                              stackOut_47_0 = stackIn_47_0;
                                              stackIn_48_0 = stackOut_47_0;
                                              return (byte[]) (Object) stackIn_48_0;
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
                                }
                              }
                            } else {
                              stackOut_18_0 = null;
                              stackIn_19_0 = stackOut_18_0;
                              stackOut_19_0 = stackIn_19_0;
                              stackIn_20_0 = stackOut_19_0;
                              return (byte[]) (Object) stackIn_20_0;
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
                      stackOut_6_0 = null;
                      stackIn_7_0 = stackOut_6_0;
                      stackOut_7_0 = stackIn_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      return (byte[]) (Object) stackIn_8_0;
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
                stackOut_56_0 = null;
                stackIn_57_0 = stackOut_56_0;
                return (byte[]) (Object) stackIn_57_0;
              }
              return stackIn_55_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(boolean param0, oq param1) {
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var5 = new StringBuilder(2 * param1.field_v);
            var2 = var5;
            var3 = 0;
            L1: while (true) {
              if (param1.field_v <= var3) {
                stackOut_5_0 = var2.toString();
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var4 = 255 & param1.field_t[var3];
                StringBuilder discarded$4 = var5.append(ec.field_j[var4 >> 4 & 15]);
                StringBuilder discarded$5 = var5.append(ec.field_j[15 & var4]);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("np.E(").append(false).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final boolean a(int param0, int param1, int param2, byte[] param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          var5 = (Object) (Object) ((np) this).field_i;
          synchronized (var5) {
            L0: {
              L1: {
                if (param1 == -12875) {
                  break L1;
                } else {
                  field_d = 96;
                  break L1;
                }
              }
              L2: {
                if (param2 < 0) {
                  break L2;
                } else {
                  if (param2 <= ((np) this).field_b) {
                    L3: {
                      int discarded$6 = 93;
                      var6 = this.a(param0, param2, true, param3) ? 1 : 0;
                      if (var6 == 0) {
                        int discarded$7 = 93;
                        var6 = this.a(param0, param2, false, param3) ? 1 : 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    stackOut_10_0 = var6;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_11_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5_ref;
            stackOut_14_1 = new StringBuilder().append("np.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    private final boolean a(int param0, int param1, boolean param2, byte[] param3) {
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
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_65_0 = 0;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            String stackIn_71_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_64_0 = 0;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            String stackOut_70_2 = null;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            String stackOut_69_2 = null;
            var16 = Pool.field_O;
            try {
              var6_ref2 = (Object) (Object) ((np) this).field_i;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param2) {
                        if ((long)(6 + param0 * 6) > ((np) this).field_f.d((byte) 17)) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        } else {
                          L2: {
                            ((np) this).field_f.a(0, (long)(param0 * 6));
                            ((np) this).field_f.a((byte) -110, 6, 0, dg.field_S);
                            var7_int = (dg.field_S[5] & 255) + (16711680 & dg.field_S[3] << 16) + (dg.field_S[4] << 8 & 65280);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if ((long)var7_int <= ((np) this).field_i.d((byte) 17) / 520L) {
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
                        var7_int = (int)((519L + ((np) this).field_i.d((byte) 17)) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    dg.field_S[3] = (byte)(var7_int >> 16);
                    dg.field_S[2] = (byte)param1;
                    dg.field_S[0] = (byte)(param1 >> 16);
                    dg.field_S[1] = (byte)(param1 >> 8);
                    dg.field_S[4] = (byte)(var7_int >> 8);
                    dg.field_S[5] = (byte)var7_int;
                    ((np) this).field_f.a(0, (long)(param0 * 6));
                    ((np) this).field_f.a(6, dg.field_S, 0, -1);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (var8 >= param1) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (param2) {
                              L6: {
                                ((np) this).field_i.a(0, (long)(520 * var7_int));
                                if (65535 >= param0) {
                                  try {
                                    L7: {
                                      ((np) this).field_i.a((byte) -110, 8, 0, dg.field_S);
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
                                    var12 = (dg.field_S[3] & 255) + (65280 & dg.field_S[2] << 8);
                                    var10 = ((255 & dg.field_S[5]) << 8) + ((16711680 & dg.field_S[4] << 16) + (255 & dg.field_S[6]));
                                    var11 = (dg.field_S[0] << 8 & 65280) + (255 & dg.field_S[1]);
                                    var13 = dg.field_S[7] & 255;
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((np) this).field_i.a((byte) -118, 10, 0, dg.field_S);
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
                                    var11 = (dg.field_S[3] & 255) + ((65280 & dg.field_S[2] << 8) + ((dg.field_S[0] << 24 & -16777216) - -(16711680 & dg.field_S[1] << 16)));
                                    var12 = (65280 & dg.field_S[4] << 8) + (dg.field_S[5] & 255);
                                    var10 = (16711680 & dg.field_S[6] << 16) - (-(65280 & dg.field_S[7] << 8) - (dg.field_S[8] & 255));
                                    var13 = 255 & dg.field_S[9];
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (var11 != param0) {
                                  break L11;
                                } else {
                                  if (var12 != var9) {
                                    break L11;
                                  } else {
                                    if (var13 == ((np) this).field_h) {
                                      L12: {
                                        if (0 > var10) {
                                          break L12;
                                        } else {
                                          if (((np) this).field_i.d((byte) 17) / 520L >= (long)var10) {
                                            break L5;
                                          } else {
                                            break L12;
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
                            } else {
                              break L5;
                            }
                          }
                          L13: {
                            if (var10 != 0) {
                              break L13;
                            } else {
                              L14: {
                                param2 = false;
                                var10 = (int)((((np) this).field_i.d((byte) 17) + 519L) / 520L);
                                if (var10 != 0) {
                                  break L14;
                                } else {
                                  var10++;
                                  break L14;
                                }
                              }
                              if (var10 != var7_int) {
                                break L13;
                              } else {
                                var10++;
                                break L13;
                              }
                            }
                          }
                          L15: {
                            if (param1 + -var8 > 512) {
                              break L15;
                            } else {
                              var10 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (param0 <= 65535) {
                              L17: {
                                dg.field_S[0] = (byte)(param0 >> 8);
                                dg.field_S[1] = (byte)param0;
                                dg.field_S[5] = (byte)(var10 >> 8);
                                dg.field_S[6] = (byte)var10;
                                dg.field_S[2] = (byte)(var9 >> 8);
                                dg.field_S[3] = (byte)var9;
                                dg.field_S[7] = (byte)((np) this).field_h;
                                dg.field_S[4] = (byte)(var10 >> 16);
                                ((np) this).field_i.a(0, (long)(520 * var7_int));
                                ((np) this).field_i.a(8, dg.field_S, 0, -1);
                                var11 = -var8 + param1;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((np) this).field_i.a(var11, param3, var8, -1);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                dg.field_S[7] = (byte)(var10 >> 8);
                                dg.field_S[9] = (byte)((np) this).field_h;
                                dg.field_S[3] = (byte)param0;
                                dg.field_S[8] = (byte)var10;
                                dg.field_S[2] = (byte)(param0 >> 8);
                                dg.field_S[4] = (byte)(var9 >> 8);
                                dg.field_S[0] = (byte)(param0 >> 24);
                                dg.field_S[1] = (byte)(param0 >> 16);
                                dg.field_S[6] = (byte)(var10 >> 16);
                                dg.field_S[5] = (byte)var9;
                                ((np) this).field_i.a(0, (long)(520 * var7_int));
                                ((np) this).field_i.a(10, dg.field_S, 0, -1);
                                var11 = -var8 + param1;
                                if (var11 > 510) {
                                  var11 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((np) this).field_i.a(var11, param3, var8, -1);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L3;
                        }
                      }
                      stackOut_61_0 = 1;
                      stackIn_62_0 = stackOut_61_0;
                      stackOut_62_0 = stackIn_62_0;
                      stackIn_63_0 = stackOut_62_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_64_0 = 0;
                  stackIn_65_0 = stackOut_64_0;
                  return stackIn_65_0 != 0;
                }
                return stackIn_63_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_68_0 = (RuntimeException) var6_ref;
                stackOut_68_1 = new StringBuilder().append("np.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_70_0 = stackOut_68_0;
                stackIn_70_1 = stackOut_68_1;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1;
                if (param3 == null) {
                  stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
                  stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
                  stackOut_70_2 = "null";
                  stackIn_71_0 = stackOut_70_0;
                  stackIn_71_1 = stackOut_70_1;
                  stackIn_71_2 = stackOut_70_2;
                  break L19;
                } else {
                  stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                  stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
                  stackOut_69_2 = "{...}";
                  stackIn_71_0 = stackOut_69_0;
                  stackIn_71_1 = stackOut_69_1;
                  stackIn_71_2 = stackOut_69_2;
                  break L19;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ',' + 93 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0, String param1, boolean param2, boolean param3, int param4, String param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            Object var11 = null;
            String var12 = null;
            CharSequence var13 = null;
            int stackIn_5_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_54_0 = 0;
            ml stackIn_66_0 = null;
            java.applet.Applet stackIn_66_1 = null;
            ml stackIn_67_0 = null;
            java.applet.Applet stackIn_67_1 = null;
            ml stackIn_68_0 = null;
            java.applet.Applet stackIn_68_1 = null;
            int stackIn_68_2 = 0;
            int stackIn_86_0 = 0;
            int stackIn_98_0 = 0;
            int stackIn_100_0 = 0;
            int stackIn_107_0 = 0;
            int stackIn_110_0 = 0;
            RuntimeException stackIn_112_0 = null;
            StringBuilder stackIn_112_1 = null;
            RuntimeException stackIn_113_0 = null;
            StringBuilder stackIn_113_1 = null;
            RuntimeException stackIn_114_0 = null;
            StringBuilder stackIn_114_1 = null;
            String stackIn_114_2 = null;
            RuntimeException stackIn_115_0 = null;
            StringBuilder stackIn_115_1 = null;
            RuntimeException stackIn_116_0 = null;
            StringBuilder stackIn_116_1 = null;
            RuntimeException stackIn_117_0 = null;
            StringBuilder stackIn_117_1 = null;
            String stackIn_117_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_53_0 = 0;
            int stackOut_52_0 = 0;
            ml stackOut_65_0 = null;
            java.applet.Applet stackOut_65_1 = null;
            ml stackOut_67_0 = null;
            java.applet.Applet stackOut_67_1 = null;
            int stackOut_67_2 = 0;
            ml stackOut_66_0 = null;
            java.applet.Applet stackOut_66_1 = null;
            int stackOut_66_2 = 0;
            int stackOut_85_0 = 0;
            int stackOut_99_0 = 0;
            int stackOut_97_0 = 0;
            int stackOut_106_0 = 0;
            int stackOut_109_0 = 0;
            RuntimeException stackOut_111_0 = null;
            StringBuilder stackOut_111_1 = null;
            RuntimeException stackOut_113_0 = null;
            StringBuilder stackOut_113_1 = null;
            String stackOut_113_2 = null;
            RuntimeException stackOut_112_0 = null;
            StringBuilder stackOut_112_1 = null;
            String stackOut_112_2 = null;
            RuntimeException stackOut_114_0 = null;
            StringBuilder stackOut_114_1 = null;
            RuntimeException stackOut_116_0 = null;
            StringBuilder stackOut_116_1 = null;
            String stackOut_116_2 = null;
            RuntimeException stackOut_115_0 = null;
            StringBuilder stackOut_115_1 = null;
            String stackOut_115_2 = null;
            var9 = Pool.field_O;
            try {
              L0: {
                L1: {
                  if (null == jd.field_c) {
                    if (sa.a((byte) 65, param2)) {
                      break L1;
                    } else {
                      stackOut_4_0 = -1;
                      stackIn_5_0 = stackOut_4_0;
                      return stackIn_5_0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (tl.field_J == no.field_h) {
                    L3: {
                      if (!param2) {
                        hn.field_c = kb.a(false, param1, -5790, param5);
                        break L3;
                      } else {
                        var11 = null;
                        hn.field_c = bi.a(hm.field_a, -16595, param5, false, (String) null);
                        break L3;
                      }
                    }
                    ej.field_j.field_v = 0;
                    ej.field_j.a(14, false);
                    ej.field_j.a(hn.field_c.b((byte) -101).field_c, false);
                    de.a(-1, 0);
                    tl.field_J = vn.field_d;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (vn.field_d == tl.field_J) {
                    if (!lq.b((byte) 87, 1)) {
                      break L4;
                    } else {
                      L5: {
                        var6_int = kn.field_e.g(-82);
                        if (var6_int == 0) {
                          tl.field_J = fr.field_o;
                          break L5;
                        } else {
                          uq.field_c = var6_int;
                          of.field_Pb = -1;
                          tl.field_J = hm.field_k;
                          break L5;
                        }
                      }
                      kn.field_e.field_v = 0;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (fr.field_o == tl.field_J) {
                    if (!lq.b((byte) 43, 8)) {
                      break L6;
                    } else {
                      Pool.field_Q = kn.field_e.h(-412303328);
                      kn.field_e.field_v = 0;
                      pj.a(param2, hn.field_c, param3, -98300704, param4);
                      tl.field_J = wo.field_g;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (tl.field_J == wo.field_g) {
                    if (lq.b((byte) 79, 1)) {
                      L8: {
                        var6_int = kn.field_e.g(-110);
                        kn.field_e.field_v = 0;
                        ri.field_N = null;
                        uq.field_c = var6_int;
                        if (var6_int == 0) {
                          break L8;
                        } else {
                          if (1 == var6_int) {
                            break L8;
                          } else {
                            if (var6_int == 8) {
                              dn.c(-115);
                              we.field_e = false;
                              stackOut_31_0 = var6_int;
                              stackIn_32_0 = stackOut_31_0;
                              return stackIn_32_0;
                            } else {
                              tl.field_J = hm.field_k;
                              of.field_Pb = -1;
                              break L7;
                            }
                          }
                        }
                      }
                      of.field_Pb = -1;
                      tl.field_J = ff.field_b;
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                L9: {
                  if (ff.field_b == tl.field_J) {
                    int discarded$9 = 39;
                    if (wf.a()) {
                      L10: {
                        hm.field_a = kn.field_e.h(-412303328);
                        ei.field_E = param5;
                        hq.field_i = kn.field_e.g(-68);
                        ta.field_f = kn.field_e.g(-105);
                        mp.field_V = kn.field_e.d(-1034);
                        var12 = kn.field_e.m(108);
                        var7 = kn.field_e.g(-76);
                        if (0 != (1 & var7)) {
                          int discarded$10 = 100;
                          ke.a();
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if ((16 & var7) == 0) {
                          stackOut_43_0 = 0;
                          stackIn_44_0 = stackOut_43_0;
                          break L11;
                        } else {
                          stackOut_42_0 = 1;
                          stackIn_44_0 = stackOut_42_0;
                          break L11;
                        }
                      }
                      L12: {
                        nm.field_b = stackIn_44_0 != 0;
                        if (param2) {
                          break L12;
                        } else {
                          L13: {
                            if ((8 & var7) == 0) {
                              stackOut_47_0 = 0;
                              stackIn_48_0 = stackOut_47_0;
                              break L13;
                            } else {
                              stackOut_46_0 = 1;
                              stackIn_48_0 = stackOut_46_0;
                              break L13;
                            }
                          }
                          L14: {
                            ea.field_z = stackIn_48_0 != 0;
                            if ((4 & var7) == 0) {
                              stackOut_50_0 = 0;
                              stackIn_51_0 = stackOut_50_0;
                              break L14;
                            } else {
                              stackOut_49_0 = 1;
                              stackIn_51_0 = stackOut_49_0;
                              break L14;
                            }
                          }
                          L15: {
                            fq.field_Gb = stackIn_51_0 != 0;
                            if ((2 & var7) == 0) {
                              stackOut_53_0 = 0;
                              stackIn_54_0 = stackOut_53_0;
                              break L15;
                            } else {
                              stackOut_52_0 = 1;
                              stackIn_54_0 = stackOut_52_0;
                              break L15;
                            }
                          }
                          hr.field_y = stackIn_54_0 != 0;
                          if (ea.field_z) {
                            hr.field_y = true;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L16: {
                        if (!hk.field_s) {
                          break L16;
                        } else {
                          int discarded$11 = kn.field_e.g(-114);
                          int discarded$12 = kn.field_e.g(-99);
                          int discarded$13 = kn.field_e.b(true);
                          va.field_X = kn.field_e.d(-1034);
                          sn.field_n = new byte[va.field_X];
                          var8 = 0;
                          L17: while (true) {
                            if (va.field_X <= var8) {
                              break L16;
                            } else {
                              sn.field_n[var8] = kn.field_e.e((byte) 105);
                              var8++;
                              continue L17;
                            }
                          }
                        }
                      }
                      L18: {
                        di.field_j = kn.field_e.j(-22);
                        var13 = (CharSequence) (Object) di.field_j;
                        oj.field_y = hq.a(101, var13);
                        no.field_l = kn.field_e.g(-126);
                        tl.field_J = ta.field_a;
                        if (hn.field_c.b((byte) -110) == dg.field_L) {
                          L19: {
                            stackOut_65_0 = eo.field_Xb;
                            stackOut_65_1 = hk.d(78);
                            stackIn_67_0 = stackOut_65_0;
                            stackIn_67_1 = stackOut_65_1;
                            stackIn_66_0 = stackOut_65_0;
                            stackIn_66_1 = stackOut_65_1;
                            if (param0) {
                              stackOut_67_0 = (ml) (Object) stackIn_67_0;
                              stackOut_67_1 = (java.applet.Applet) (Object) stackIn_67_1;
                              stackOut_67_2 = 0;
                              stackIn_68_0 = stackOut_67_0;
                              stackIn_68_1 = stackOut_67_1;
                              stackIn_68_2 = stackOut_67_2;
                              break L19;
                            } else {
                              stackOut_66_0 = (ml) (Object) stackIn_66_0;
                              stackOut_66_1 = (java.applet.Applet) (Object) stackIn_66_1;
                              stackOut_66_2 = 1;
                              stackIn_68_0 = stackOut_66_0;
                              stackIn_68_1 = stackOut_66_1;
                              stackIn_68_2 = stackOut_66_2;
                              break L19;
                            }
                          }
                          ((ml) (Object) stackIn_68_0).a(stackIn_68_1, stackIn_68_2 != 0);
                          break L18;
                        } else {
                          if (hn.field_c.b((byte) 37) == rp.field_b) {
                            ug.field_v.a(hk.d(105), true);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L20: {
                        we.field_e = false;
                        if (var12 == null) {
                          break L20;
                        } else {
                          fg.a(hk.d(100), -124, var12);
                          break L20;
                        }
                      }
                      L21: {
                        L22: {
                          if (mp.field_V > 0) {
                            break L22;
                          } else {
                            if (fq.field_Gb) {
                              break L22;
                            } else {
                              try {
                                L23: {
                                  Object discarded$14 = mo.a((byte) 126, "unzap", hk.d(125));
                                  break L23;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L24: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L24;
                                }
                              }
                              break L21;
                            }
                          }
                        }
                        try {
                          L25: {
                            Object discarded$15 = mo.a("zap", new Object[1], 105, hk.d(107));
                            break L25;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L26: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L26;
                          }
                        }
                        break L21;
                      }
                      L27: {
                        if (mp.field_V <= 0) {
                          break L27;
                        } else {
                          bf.field_g = true;
                          break L27;
                        }
                      }
                      ej.field_j.b(32, Pool.field_L);
                      var8 = 0;
                      L28: while (true) {
                        if (var8 >= 4) {
                          kn.field_e.b(32, Pool.field_L);
                          stackOut_85_0 = uq.field_c;
                          stackIn_86_0 = stackOut_85_0;
                          return stackIn_86_0;
                        } else {
                          Pool.field_L[var8] = Pool.field_L[var8] + 50;
                          var8++;
                          continue L28;
                        }
                      }
                    } else {
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                L29: {
                  if (!param0) {
                    break L29;
                  } else {
                    var10 = null;
                    int discarded$16 = np.a(true, (String) null, false, false, 59, (String) null);
                    break L29;
                  }
                }
                L30: {
                  if (tl.field_J != hm.field_k) {
                    break L30;
                  } else {
                    int discarded$17 = 39;
                    if (wf.a()) {
                      L31: {
                        dn.c(-64);
                        if (uq.field_c != 7) {
                          break L31;
                        } else {
                          if (!we.field_e) {
                            we.field_e = true;
                            stackOut_99_0 = -1;
                            stackIn_100_0 = stackOut_99_0;
                            return stackIn_100_0;
                          } else {
                            break L31;
                          }
                        }
                      }
                      L32: {
                        if (uq.field_c != 7) {
                          break L32;
                        } else {
                          uq.field_c = 3;
                          break L32;
                        }
                      }
                      ke.field_g = kn.field_e.j(-51);
                      we.field_e = false;
                      stackOut_97_0 = uq.field_c;
                      stackIn_98_0 = stackOut_97_0;
                      return stackIn_98_0;
                    } else {
                      break L30;
                    }
                  }
                }
                L33: {
                  if (null != jd.field_c) {
                    break L33;
                  } else {
                    if (!we.field_e) {
                      var6_int = vj.field_d;
                      vj.field_d = cq.field_a;
                      we.field_e = true;
                      cq.field_a = var6_int;
                      break L33;
                    } else {
                      L34: {
                        if (30000L >= bf.d((byte) 118)) {
                          ke.field_g = er.field_Q;
                          break L34;
                        } else {
                          ke.field_g = wd.field_Rb;
                          break L34;
                        }
                      }
                      we.field_e = false;
                      stackOut_106_0 = 3;
                      stackIn_107_0 = stackOut_106_0;
                      return stackIn_107_0;
                    }
                  }
                }
                stackOut_109_0 = -1;
                stackIn_110_0 = stackOut_109_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L35: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_111_0 = (RuntimeException) var6;
                stackOut_111_1 = new StringBuilder().append("np.F(").append(param0).append(',');
                stackIn_113_0 = stackOut_111_0;
                stackIn_113_1 = stackOut_111_1;
                stackIn_112_0 = stackOut_111_0;
                stackIn_112_1 = stackOut_111_1;
                if (param1 == null) {
                  stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
                  stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
                  stackOut_113_2 = "null";
                  stackIn_114_0 = stackOut_113_0;
                  stackIn_114_1 = stackOut_113_1;
                  stackIn_114_2 = stackOut_113_2;
                  break L35;
                } else {
                  stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
                  stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
                  stackOut_112_2 = "{...}";
                  stackIn_114_0 = stackOut_112_0;
                  stackIn_114_1 = stackOut_112_1;
                  stackIn_114_2 = stackOut_112_2;
                  break L35;
                }
              }
              L36: {
                stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
                stackOut_114_1 = ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                stackIn_116_0 = stackOut_114_0;
                stackIn_116_1 = stackOut_114_1;
                stackIn_115_0 = stackOut_114_0;
                stackIn_115_1 = stackOut_114_1;
                if (param5 == null) {
                  stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
                  stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
                  stackOut_116_2 = "null";
                  stackIn_117_0 = stackOut_116_0;
                  stackIn_117_1 = stackOut_116_1;
                  stackIn_117_2 = stackOut_116_2;
                  break L36;
                } else {
                  stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
                  stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
                  stackOut_115_2 = "{...}";
                  stackIn_117_0 = stackOut_115_0;
                  stackIn_117_1 = stackOut_115_1;
                  stackIn_117_2 = stackOut_115_2;
                  break L36;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_117_0, stackIn_117_2 + ')');
            }
            return stackIn_110_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((np) this).field_h;
    }

    np(int param0, ir param1, ir param2, int param3) {
        ((np) this).field_f = null;
        ((np) this).field_i = null;
        ((np) this).field_b = 65000;
        try {
            ((np) this).field_i = param1;
            ((np) this).field_f = param2;
            ((np) this).field_h = param0;
            ((np) this).field_b = param3;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "np.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> has dropped out.";
        field_g = "No options available";
        field_e = "Achieved";
    }
}
