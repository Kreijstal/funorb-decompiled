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
            int decompiledRegionSelector2 = 0;
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
              var6_ref2 = this.field_b;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param1) {
                        if ((this.field_a.a((byte) -72) ^ -1L) <= ((long)(6 + param3 * 6) ^ -1L)) {
                          L2: {
                            this.field_a.a((byte) 77, (long)(6 * param3));
                            this.field_a.a(6, ho.field_i, (byte) -73, 0);
                            var7_int = (255 & ho.field_i[5]) + (((ho.field_i[4] & 255) << 548843656) + ((ho.field_i[3] & 255) << -685411952));
                            if ((var7_int ^ -1) >= -1) {
                              break L2;
                            } else {
                              if (((long)var7_int ^ -1L) < (this.field_b.a((byte) -89) / 520L ^ -1L)) {
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
                          decompiledRegionSelector2 = 1;
                          break L0;
                        } else {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        }
                      } else {
                        var7_int = (int)((this.field_b.a((byte) -116) + 519L) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    ho.field_i[4] = (byte)(var7_int >> -700047544);
                    ho.field_i[1] = (byte)(param0 >> 962946472);
                    ho.field_i[5] = (byte)var7_int;
                    ho.field_i[3] = (byte)(var7_int >> -1931884624);
                    ho.field_i[2] = (byte)param0;
                    ho.field_i[0] = (byte)(param0 >> -50735504);
                    this.field_a.a((byte) 79, (long)(6 * param3));
                    this.field_a.a(-105, 6, 0, ho.field_i);
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
                                this.field_b.a((byte) -115, (long)(var7_int * 520));
                                if (-65536 > (param3 ^ -1)) {
                                  try {
                                    L7: {
                                      this.field_b.a(10, ho.field_i, (byte) 96, 0);
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
                                    var11 = (ho.field_i[3] & 255) + (16711680 & ho.field_i[1] << -259520208) + ((-16777216 & ho.field_i[0] << 243114712) + ((255 & ho.field_i[2]) << -709651192));
                                    var12 = (ho.field_i[4] << -1354341208 & 65280) - -(255 & ho.field_i[5]);
                                    var10 = (ho.field_i[8] & 255) + ((ho.field_i[7] & 255) << 2065042056) + (16711680 & ho.field_i[6] << 341948944);
                                    var13 = ho.field_i[9] & 255;
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      this.field_b.a(8, ho.field_i, (byte) -114, 0);
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
                                    var13 = 255 & ho.field_i[7];
                                    var12 = ((ho.field_i[2] & 255) << 1436791976) + (255 & ho.field_i[3]);
                                    var11 = (ho.field_i[1] & 255) + ((ho.field_i[0] & 255) << -465629848);
                                    var10 = (ho.field_i[6] & 255) + (16711680 & ho.field_i[4] << 1540612272) - -(ho.field_i[5] << 1841964392 & 65280);
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
                                    if (var13 == this.field_i) {
                                      L12: {
                                        if ((var10 ^ -1) > -1) {
                                          break L12;
                                        } else {
                                          if (((long)var10 ^ -1L) >= (this.field_b.a((byte) -104) / 520L ^ -1L)) {
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
                                      decompiledRegionSelector2 = 3;
                                      break L0;
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
                              decompiledRegionSelector2 = 2;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                          L13: {
                            if (-1 == (var10 ^ -1)) {
                              L14: {
                                param1 = false;
                                var10 = (int)((519L + this.field_b.a((byte) -68)) / 520L);
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
                            if (-513 <= (-var8 + param0 ^ -1)) {
                              var10 = 0;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (param3 <= 65535) {
                              L17: {
                                ho.field_i[0] = (byte)(param3 >> -800831224);
                                ho.field_i[3] = (byte)var9;
                                ho.field_i[6] = (byte)var10;
                                ho.field_i[2] = (byte)(var9 >> 1069073000);
                                ho.field_i[1] = (byte)param3;
                                ho.field_i[4] = (byte)(var10 >> 332099984);
                                ho.field_i[5] = (byte)(var10 >> 829905224);
                                ho.field_i[7] = (byte)this.field_i;
                                this.field_b.a((byte) 107, (long)(var7_int * 520));
                                this.field_b.a(-66, 8, 0, ho.field_i);
                                var11 = -var8 + param0;
                                if (-513 <= (var11 ^ -1)) {
                                  break L17;
                                } else {
                                  var11 = 512;
                                  break L17;
                                }
                              }
                              this.field_b.a(101, var11, var8, param4);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                ho.field_i[4] = (byte)(var9 >> 584072168);
                                ho.field_i[9] = (byte)this.field_i;
                                ho.field_i[1] = (byte)(param3 >> 1138839056);
                                ho.field_i[5] = (byte)var9;
                                ho.field_i[7] = (byte)(var10 >> 1179874376);
                                ho.field_i[3] = (byte)param3;
                                ho.field_i[8] = (byte)var10;
                                ho.field_i[6] = (byte)(var10 >> 2087727280);
                                ho.field_i[0] = (byte)(param3 >> -381935176);
                                ho.field_i[2] = (byte)(param3 >> -1085570264);
                                this.field_b.a((byte) 64, (long)(var7_int * 520));
                                this.field_b.a(-68, 10, 0, ho.field_i);
                                var11 = -var8 + param0;
                                if (-511 <= (var11 ^ -1)) {
                                  break L18;
                                } else {
                                  var11 = 510;
                                  break L18;
                                }
                              }
                              this.field_b.a(82, var11, var8, param4);
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
                      decompiledRegionSelector2 = 4;
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
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_9_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_15_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_35_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_41_0 != 0;
                      } else {
                        return stackIn_62_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_67_0 = (RuntimeException) (var6_ref);
                stackOut_67_1 = new StringBuilder().append("ua.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_69_0 = stackOut_67_0;
                stackIn_69_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (param4 == null) {
                  stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
                  stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
                  stackOut_69_2 = "null";
                  stackIn_70_0 = stackOut_69_0;
                  stackIn_70_1 = stackOut_69_1;
                  stackIn_70_2 = stackOut_69_2;
                  break L19;
                } else {
                  stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
                  stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
                  stackOut_68_2 = "{...}";
                  stackIn_70_0 = stackOut_68_0;
                  stackIn_70_1 = stackOut_68_1;
                  stackIn_70_2 = stackOut_68_2;
                  break L19;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final byte[] a(int param0, int param1) {
        try {
            int incrementValue$1 = 0;
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
            byte[] stackIn_7_0 = null;
            byte[] stackIn_8_0 = null;
            Object stackIn_19_0 = null;
            Object stackIn_20_0 = null;
            Object stackIn_46_0 = null;
            Object stackIn_47_0 = null;
            byte[] stackIn_53_0 = null;
            byte[] stackIn_54_0 = null;
            Object stackIn_56_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_52_0 = null;
            byte[] stackOut_53_0 = null;
            Object stackOut_45_0 = null;
            Object stackOut_46_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            byte[] stackOut_6_0 = null;
            byte[] stackOut_7_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_55_0 = null;
            var18 = ShatteredPlansClient.field_F ? 1 : 0;
            var3 = this.field_b;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 + param0 * 6) <= this.field_a.a((byte) -110)) {
                    this.field_a.a((byte) -88, (long)(param0 * 6));
                    if (param1 > 57) {
                      this.field_a.a(6, ho.field_i, (byte) 67, 0);
                      var4_int = (ho.field_i[2] & 255) + ((ho.field_i[0] & 255) << 128320720) + ((ho.field_i[1] & 255) << 787416360);
                      var5 = (255 & ho.field_i[5]) + (ho.field_i[3] << -401995472 & 16711680) + ((255 & ho.field_i[4]) << 892865096);
                      if (var4_int >= 0) {
                        if (var4_int <= this.field_e) {
                          if ((var5 ^ -1) < -1) {
                            if (((long)var5 ^ -1L) >= (this.field_b.a((byte) -124) / 520L ^ -1L)) {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              var8 = 0;
                              L1: while (true) {
                                if (var7 >= var4_int) {
                                  stackOut_52_0 = (byte[]) (var6);
                                  stackIn_53_0 = stackOut_52_0;
                                  stackOut_53_0 = (byte[]) ((Object) stackIn_53_0);
                                  stackIn_54_0 = stackOut_53_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                } else {
                                  if (0 != var5) {
                                    L2: {
                                      this.field_b.a((byte) 84, (long)(var5 * 520));
                                      var9 = -var7 + var4_int;
                                      if ((param0 ^ -1) < -65536) {
                                        L3: {
                                          var14 = 10;
                                          if (var9 <= 510) {
                                            break L3;
                                          } else {
                                            var9 = 510;
                                            break L3;
                                          }
                                        }
                                        this.field_b.a(var14 + var9, ho.field_i, (byte) 46, 0);
                                        var10 = (ho.field_i[3] & 255) + ((255 & ho.field_i[2]) << 1797718440) + (((ho.field_i[1] & 255) << 1171658992) + (ho.field_i[0] << 942808024 & -16777216));
                                        var12 = ((255 & ho.field_i[7]) << -1052526296) + ((255 & ho.field_i[6]) << 554662288) - -(255 & ho.field_i[8]);
                                        var13 = ho.field_i[9] & 255;
                                        var11 = ((255 & ho.field_i[4]) << 393996648) - -(ho.field_i[5] & 255);
                                        break L2;
                                      } else {
                                        L4: {
                                          if ((var9 ^ -1) >= -513) {
                                            break L4;
                                          } else {
                                            var9 = 512;
                                            break L4;
                                          }
                                        }
                                        var14 = 8;
                                        this.field_b.a(var14 + var9, ho.field_i, (byte) 100, 0);
                                        var10 = (255 & ho.field_i[1]) + (65280 & ho.field_i[0] << -440390296);
                                        var11 = (ho.field_i[2] << -102441816 & 65280) + (ho.field_i[3] & 255);
                                        var13 = ho.field_i[7] & 255;
                                        var12 = ((ho.field_i[5] & 255) << 1897761032) + (16711680 & ho.field_i[4] << -1539198192) - -(ho.field_i[6] & 255);
                                        break L2;
                                      }
                                    }
                                    if (var10 == param0) {
                                      if (var11 == var8) {
                                        if (this.field_i == var13) {
                                          if (-1 >= (var12 ^ -1)) {
                                            if (this.field_b.a((byte) -107) / 520L >= (long)var12) {
                                              var15 = var14 + var9;
                                              var8++;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (var15 <= var16) {
                                                  var5 = var12;
                                                  continue L1;
                                                } else {
                                                  incrementValue$1 = var7;
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
                    } else {
                      stackOut_6_0 = (byte[]) null;
                      stackIn_7_0 = stackOut_6_0;
                      stackOut_7_0 = (byte[]) ((Object) stackIn_7_0);
                      stackIn_8_0 = stackOut_7_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    stackOut_2_0 = null;
                    stackIn_3_0 = stackOut_2_0;
                    stackOut_3_0 = stackIn_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_55_0 = null;
                stackIn_56_0 = stackOut_55_0;
                return (byte[]) ((Object) stackIn_56_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_4_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_8_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_20_0);
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return (byte[]) ((Object) stackIn_47_0);
                    } else {
                      return stackIn_54_0;
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

    public final String toString() {
        return "" + this.field_i;
    }

    public static void a(int param0) {
        int discarded$0 = 0;
        field_h = null;
        field_g = null;
        field_c = null;
        field_f = null;
        field_d = null;
        if (param0 != 4) {
            String var2 = (String) null;
            discarded$0 = ua.a((String) null, (String) null, -43);
        }
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
          L0: {
            var5 = this.field_b;
            synchronized (var5) {
              L1: {
                L2: {
                  if (-1 < (param0 ^ -1)) {
                    break L2;
                  } else {
                    if (param0 <= this.field_e) {
                      L3: {
                        var6 = this.a(param0, true, (byte) -22, param1, param2) ? 1 : 0;
                        if (param3 == 2) {
                          break L3;
                        } else {
                          this.field_a = (ej) null;
                          break L3;
                        }
                      }
                      L4: {
                        if (var6 != 0) {
                          break L4;
                        } else {
                          var6 = this.a(param0, false, (byte) -1, param1, param2) ? 1 : 0;
                          break L4;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5_ref);
            stackOut_12_1 = new StringBuilder().append("ua.B(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final static int a(String param0, String param1, int param2) {
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
            var3_int = param0.indexOf(param1, param2);
            var4 = var3_int;
            L1: while (true) {
              if ((var3_int ^ -1) == 0) {
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
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("ua.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_5_0;
    }

    ua(int param0, ej param1, ej param2, int param3) {
        this.field_e = 65000;
        this.field_a = null;
        this.field_b = null;
        try {
            this.field_a = param2;
            this.field_e = param3;
            this.field_i = param0;
            this.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ua.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_g = "End Tutorial";
        field_d = new pf();
        field_c = new String[]{"No garrisoning, production unified across territories.", "Garrisoning required, separate production per territory."};
    }
}
