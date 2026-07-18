/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ua {
    private int field_e;
    static qr field_f;
    private ej field_a;
    private ej field_b;
    static pf field_d;
    private int field_i;
    static String field_g;
    static String[] field_c;
    static boolean[] field_h;

    private final boolean a(int param0, boolean param1, byte param2, int param3, byte[] param4) {
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
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
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
            var16 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              var6_ref2 = (Object) (Object) ((ua) this).field_b;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param1) {
                        if (~((ua) this).field_a.a((byte) -72) <= ~(long)(6 + param3 * 6)) {
                          L2: {
                            ((ua) this).field_a.a((byte) 77, (long)(6 * param3));
                            ((ua) this).field_a.a(6, ho.field_i, (byte) -73, 0);
                            var7_int = (255 & ho.field_i[5]) + (((ho.field_i[4] & 255) << 8) + ((ho.field_i[3] & 255) << 16));
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (~(long)var7_int < ~(((ua) this).field_b.a((byte) -89) / 520L)) {
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
                        } else {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        }
                      } else {
                        var7_int = (int)((((ua) this).field_b.a((byte) -116) + 519L) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    ho.field_i[4] = (byte)(var7_int >> 8);
                    ho.field_i[1] = (byte)(param0 >> 8);
                    ho.field_i[5] = (byte)var7_int;
                    ho.field_i[3] = (byte)(var7_int >> 16);
                    ho.field_i[2] = (byte)param0;
                    ho.field_i[0] = (byte)(param0 >> 16);
                    ((ua) this).field_a.a((byte) 79, (long)(6 * param3));
                    ((ua) this).field_a.a(-105, 6, 0, ho.field_i);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (param0 <= var8) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (param1) {
                              L6: {
                                ((ua) this).field_b.a((byte) -115, (long)(var7_int * 520));
                                if (param3 > 65535) {
                                  try {
                                    L7: {
                                      ((ua) this).field_b.a(10, ho.field_i, (byte) 96, 0);
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
                                    var11 = (ho.field_i[3] & 255) + (16711680 & ho.field_i[1] << 16) + ((-16777216 & ho.field_i[0] << 24) + ((255 & ho.field_i[2]) << 8));
                                    var12 = (ho.field_i[4] << 8 & 65280) - -(255 & ho.field_i[5]);
                                    var10 = (ho.field_i[8] & 255) + ((ho.field_i[7] & 255) << 8) + (16711680 & ho.field_i[6] << 16);
                                    var13 = ho.field_i[9] & 255;
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((ua) this).field_b.a(8, ho.field_i, (byte) -114, 0);
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
                                    var13 = 255 & ho.field_i[7];
                                    var12 = ((ho.field_i[2] & 255) << 8) + (255 & ho.field_i[3]);
                                    var11 = (ho.field_i[1] & 255) + ((ho.field_i[0] & 255) << 8);
                                    var10 = (ho.field_i[6] & 255) + (16711680 & ho.field_i[4] << 16) - -(ho.field_i[5] << 8 & 65280);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (var11 != param3) {
                                  break L11;
                                } else {
                                  if (var12 != var9) {
                                    break L11;
                                  } else {
                                    if (var13 == ((ua) this).field_i) {
                                      L12: {
                                        if (var10 < 0) {
                                          break L12;
                                        } else {
                                          if (~(long)var10 >= ~(((ua) this).field_b.a((byte) -104) / 520L)) {
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
                            if (var10 == 0) {
                              L14: {
                                param1 = false;
                                var10 = (int)((519L + ((ua) this).field_b.a((byte) -68)) / 520L);
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
                            if (-var8 + param0 <= 512) {
                              var10 = 0;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (param3 <= 65535) {
                              L17: {
                                ho.field_i[0] = (byte)(param3 >> 8);
                                ho.field_i[3] = (byte)var9;
                                ho.field_i[6] = (byte)var10;
                                ho.field_i[2] = (byte)(var9 >> 8);
                                ho.field_i[1] = (byte)param3;
                                ho.field_i[4] = (byte)(var10 >> 16);
                                ho.field_i[5] = (byte)(var10 >> 8);
                                ho.field_i[7] = (byte)((ua) this).field_i;
                                ((ua) this).field_b.a((byte) 107, (long)(var7_int * 520));
                                ((ua) this).field_b.a(-66, 8, 0, ho.field_i);
                                var11 = -var8 + param0;
                                if (var11 <= 512) {
                                  break L17;
                                } else {
                                  var11 = 512;
                                  break L17;
                                }
                              }
                              ((ua) this).field_b.a(101, var11, var8, param4);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                ho.field_i[4] = (byte)(var9 >> 8);
                                ho.field_i[9] = (byte)((ua) this).field_i;
                                ho.field_i[1] = (byte)(param3 >> 16);
                                ho.field_i[5] = (byte)var9;
                                ho.field_i[7] = (byte)(var10 >> 8);
                                ho.field_i[3] = (byte)param3;
                                ho.field_i[8] = (byte)var10;
                                ho.field_i[6] = (byte)(var10 >> 16);
                                ho.field_i[0] = (byte)(param3 >> 24);
                                ho.field_i[2] = (byte)(param3 >> 8);
                                ((ua) this).field_b.a((byte) 64, (long)(var7_int * 520));
                                ((ua) this).field_b.a(-68, 10, 0, ho.field_i);
                                var11 = -var8 + param0;
                                if (var11 <= 510) {
                                  break L18;
                                } else {
                                  var11 = 510;
                                  break L18;
                                }
                              }
                              ((ua) this).field_b.a(82, var11, var8, param4);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L3;
                        }
                      }
                      var10 = -3 / ((70 - param2) / 49);
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
                stackOut_67_1 = new StringBuilder().append("ua.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_69_0 = stackOut_67_0;
                stackIn_69_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (param4 == null) {
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
              throw r.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ')');
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
            Object stackIn_46_0 = null;
            Object stackIn_47_0 = null;
            byte[] stackIn_53_0 = null;
            byte[] stackIn_54_0 = null;
            Object stackIn_56_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_52_0 = null;
            byte[] stackOut_53_0 = null;
            Object stackOut_45_0 = null;
            Object stackOut_46_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            Object stackOut_6_0 = null;
            Object stackOut_7_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_55_0 = null;
            var18 = ShatteredPlansClient.field_F ? 1 : 0;
            var3 = (Object) (Object) ((ua) this).field_b;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 + param0 * 6) <= ((ua) this).field_a.a((byte) -110)) {
                    ((ua) this).field_a.a((byte) -88, (long)(param0 * 6));
                    if (param1 > 57) {
                      ((ua) this).field_a.a(6, ho.field_i, (byte) 67, 0);
                      var4_int = (ho.field_i[2] & 255) + ((ho.field_i[0] & 255) << 16) + ((ho.field_i[1] & 255) << 8);
                      var5 = (255 & ho.field_i[5]) + (ho.field_i[3] << 16 & 16711680) + ((255 & ho.field_i[4]) << 8);
                      if (var4_int >= 0) {
                        if (var4_int <= ((ua) this).field_e) {
                          if (var5 > 0) {
                            if (~(long)var5 >= ~(((ua) this).field_b.a((byte) -124) / 520L)) {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              var8 = 0;
                              L1: while (true) {
                                if (var7 >= var4_int) {
                                  stackOut_52_0 = (byte[]) var6;
                                  stackIn_53_0 = stackOut_52_0;
                                  stackOut_53_0 = (byte[]) (Object) stackIn_53_0;
                                  stackIn_54_0 = stackOut_53_0;
                                  break L0;
                                } else {
                                  if (0 != var5) {
                                    L2: {
                                      ((ua) this).field_b.a((byte) 84, (long)(var5 * 520));
                                      var9 = -var7 + var4_int;
                                      if (param0 > 65535) {
                                        L3: {
                                          var14 = 10;
                                          if (var9 <= 510) {
                                            break L3;
                                          } else {
                                            var9 = 510;
                                            break L3;
                                          }
                                        }
                                        ((ua) this).field_b.a(var14 + var9, ho.field_i, (byte) 46, 0);
                                        var10 = (ho.field_i[3] & 255) + ((255 & ho.field_i[2]) << 8) + (((ho.field_i[1] & 255) << 16) + (ho.field_i[0] << 24 & -16777216));
                                        var12 = ((255 & ho.field_i[7]) << 8) + ((255 & ho.field_i[6]) << 16) - -(255 & ho.field_i[8]);
                                        var13 = ho.field_i[9] & 255;
                                        var11 = ((255 & ho.field_i[4]) << 8) - -(ho.field_i[5] & 255);
                                        break L2;
                                      } else {
                                        L4: {
                                          if (var9 <= 512) {
                                            break L4;
                                          } else {
                                            var9 = 512;
                                            break L4;
                                          }
                                        }
                                        var14 = 8;
                                        ((ua) this).field_b.a(var14 + var9, ho.field_i, (byte) 100, 0);
                                        var10 = (255 & ho.field_i[1]) + (65280 & ho.field_i[0] << 8);
                                        var11 = (ho.field_i[2] << 8 & 65280) + (ho.field_i[3] & 255);
                                        var13 = ho.field_i[7] & 255;
                                        var12 = ((ho.field_i[5] & 255) << 8) + (16711680 & ho.field_i[4] << 16) - -(ho.field_i[6] & 255);
                                        break L2;
                                      }
                                    }
                                    if (var10 == param0) {
                                      if (var11 == var8) {
                                        if (((ua) this).field_i == var13) {
                                          if (var12 >= 0) {
                                            if (((ua) this).field_b.a((byte) -107) / 520L >= (long)var12) {
                                              var15 = var14 + var9;
                                              var8++;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (var15 <= var16) {
                                                  var5 = var12;
                                                  continue L1;
                                                } else {
                                                  int incrementValue$1 = var7;
                                                  var7++;
                                                  var6[incrementValue$1] = ho.field_i[var16];
                                                  var16++;
                                                  continue L5;
                                                }
                                              }
                                            } else {
                                              stackOut_45_0 = null;
                                              stackIn_46_0 = stackOut_45_0;
                                              stackOut_46_0 = stackIn_46_0;
                                              stackIn_47_0 = stackOut_46_0;
                                              return (byte[]) (Object) stackIn_47_0;
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

    public final String toString() {
        return "" + ((ua) this).field_i;
    }

    public static void a() {
        field_h = null;
        field_g = null;
        field_c = null;
        field_f = null;
        field_d = null;
    }

    final boolean a(int param0, int param1, byte[] param2, int param3) {
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
          var5 = (Object) (Object) ((ua) this).field_b;
          synchronized (var5) {
            L0: {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (param0 <= ((ua) this).field_e) {
                    L2: {
                      var6 = this.a(param0, true, (byte) -22, param1, param2) ? 1 : 0;
                      if (param3 == 2) {
                        break L2;
                      } else {
                        ((ua) this).field_a = null;
                        break L2;
                      }
                    }
                    L3: {
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var6 = this.a(param0, false, (byte) -1, param1, param2) ? 1 : 0;
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
            stackOut_12_1 = new StringBuilder().append("ua.B(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
        }
    }

    final static int a(String param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param0.indexOf(param1, ' ');
            var4 = var3_int;
            L1: while (true) {
              if (var3_int == -1) {
                stackOut_4_0 = var4;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var4 = var3_int;
                var3_int = param0.indexOf(param1, 1 + var4);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ua.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 0 + ')');
        }
        return stackIn_5_0;
    }

    ua(int param0, ej param1, ej param2, int param3) {
        ((ua) this).field_e = 65000;
        ((ua) this).field_a = null;
        ((ua) this).field_b = null;
        try {
            ((ua) this).field_a = param2;
            ((ua) this).field_e = param3;
            ((ua) this).field_i = param0;
            ((ua) this).field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ua.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "End Tutorial";
        field_d = new pf();
        field_c = new String[]{"No garrisoning, production unified across territories.", "Garrisoning required, separate production per territory."};
    }
}
