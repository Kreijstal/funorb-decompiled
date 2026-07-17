/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gf {
    private int field_a;
    private ch field_d;
    private ch field_f;
    static ad field_b;
    static hb field_c;
    private int field_e;

    public final String toString() {
        return "" + ((gf) this).field_a;
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
            int var17 = 0;
            Throwable var18 = null;
            int var19 = 0;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_36_0 = null;
            Object stackIn_37_0 = null;
            byte[] stackIn_49_0 = null;
            byte[] stackIn_50_0 = null;
            Object stackIn_52_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_48_0 = null;
            byte[] stackOut_49_0 = null;
            Object stackOut_35_0 = null;
            Object stackOut_36_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_51_0 = null;
            var19 = MonkeyPuzzle2.field_F ? 1 : 0;
            var3 = (Object) (Object) ((gf) this).field_f;
            synchronized (var3) {
              try {
                L0: {
                  if (~(long)(param0 * 6 + 6) >= ~((gf) this).field_d.c((byte) -72)) {
                    ((gf) this).field_d.a((byte) 116, (long)(6 * param0));
                    ((gf) this).field_d.a(od.field_m, 6, 0, (byte) 41);
                    var4_int = (255 & od.field_m[2]) + ((255 & od.field_m[1]) << 8) + (16711680 & od.field_m[0] << 16);
                    var5 = (16711680 & od.field_m[3] << 16) - -((od.field_m[4] & 255) << 8) + (od.field_m[5] & 255);
                    if (var4_int >= 0) {
                      if (((gf) this).field_e >= var4_int) {
                        if (var5 > 0) {
                          if ((long)var5 <= ((gf) this).field_f.c((byte) -107) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var9 = 61 % ((param1 - 41) / 50);
                            var8 = 0;
                            L1: while (true) {
                              if (var4_int <= var7) {
                                stackOut_48_0 = (byte[]) var6;
                                stackIn_49_0 = stackOut_48_0;
                                stackOut_49_0 = (byte[]) (Object) stackIn_49_0;
                                stackIn_50_0 = stackOut_49_0;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L2: {
                                    ((gf) this).field_f.a((byte) 121, (long)(var5 * 520));
                                    var10 = var4_int + -var7;
                                    if (65535 >= param0) {
                                      L3: {
                                        if (var10 <= 512) {
                                          break L3;
                                        } else {
                                          var10 = 512;
                                          break L3;
                                        }
                                      }
                                      var15 = 8;
                                      ((gf) this).field_f.a(od.field_m, var10 - -var15, 0, (byte) 93);
                                      var14 = 255 & od.field_m[7];
                                      var12 = (255 & od.field_m[3]) + (65280 & od.field_m[2] << 8);
                                      var11 = (od.field_m[0] << 8 & 65280) - -(od.field_m[1] & 255);
                                      var13 = (od.field_m[6] & 255) + ((od.field_m[4] & 255) << 16) - -(65280 & od.field_m[5] << 8);
                                      break L2;
                                    } else {
                                      L4: {
                                        if (var10 <= 510) {
                                          break L4;
                                        } else {
                                          var10 = 510;
                                          break L4;
                                        }
                                      }
                                      var15 = 10;
                                      ((gf) this).field_f.a(od.field_m, var15 + var10, 0, (byte) 123);
                                      var14 = od.field_m[9] & 255;
                                      var12 = ((255 & od.field_m[4]) << 8) + (od.field_m[5] & 255);
                                      var13 = (255 & od.field_m[8]) + (((255 & od.field_m[6]) << 16) - -(65280 & od.field_m[7] << 8));
                                      var11 = (od.field_m[3] & 255) + (od.field_m[2] << 8 & 65280) + ((od.field_m[1] & 255) << 16) + (-16777216 & od.field_m[0] << 24);
                                      break L2;
                                    }
                                  }
                                  if (var11 == param0) {
                                    if (var12 == var8) {
                                      if (((gf) this).field_a == var14) {
                                        if (var13 >= 0) {
                                          if ((long)var13 <= ((gf) this).field_f.c((byte) -120) / 520L) {
                                            var16 = var15 + var10;
                                            var17 = var15;
                                            L5: while (true) {
                                              if (var17 >= var16) {
                                                var8++;
                                                var5 = var13;
                                                continue L1;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = od.field_m[var17];
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
                                        stackOut_35_0 = null;
                                        stackIn_36_0 = stackOut_35_0;
                                        stackOut_36_0 = stackIn_36_0;
                                        stackIn_37_0 = stackOut_36_0;
                                        return (byte[]) (Object) stackIn_37_0;
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

    public static void a(int param0) {
        field_c = null;
        field_b = null;
    }

    final boolean a(int param0, int param1, int param2, byte[] param3) {
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
          var5 = (Object) (Object) ((gf) this).field_f;
          synchronized (var5) {
            L0: {
              L1: {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (param2 <= ((gf) this).field_e) {
                    L2: {
                      var6 = this.a(param3, param1, false, param2, true) ? 1 : 0;
                      if (param0 == 5) {
                        break L2;
                      } else {
                        ((gf) this).field_a = -112;
                        break L2;
                      }
                    }
                    L3: {
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var6 = this.a(param3, param1, false, param2, false) ? 1 : 0;
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
            stackOut_12_1 = new StringBuilder().append("gf.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw la.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    private final boolean a(byte[] param0, int param1, boolean param2, int param3, boolean param4) {
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
            int stackIn_36_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_67_0 = 0;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            String stackIn_73_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_66_0 = 0;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            String stackOut_71_2 = null;
            var16 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              var6_ref2 = (Object) (Object) ((gf) this).field_f;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param4) {
                        var7_int = (int)((((gf) this).field_f.c((byte) -128) - -519L) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if ((long)(6 + param1 * 6) > ((gf) this).field_d.c((byte) -104)) {
                          stackOut_5_0 = 0;
                          stackIn_6_0 = stackOut_5_0;
                          stackOut_6_0 = stackIn_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        } else {
                          L2: {
                            ((gf) this).field_d.a((byte) 118, (long)(param1 * 6));
                            ((gf) this).field_d.a(od.field_m, 6, 0, (byte) 65);
                            var7_int = (od.field_m[4] << 8 & 65280) + (((255 & od.field_m[3]) << 16) - -(255 & od.field_m[5]));
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if (((gf) this).field_f.c((byte) -111) / 520L < (long)var7_int) {
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
                    L3: {
                      od.field_m[3] = (byte)(var7_int >> 16);
                      od.field_m[4] = (byte)(var7_int >> 8);
                      od.field_m[0] = (byte)(param3 >> 16);
                      if (!param2) {
                        break L3;
                      } else {
                        ((gf) this).field_e = -65;
                        break L3;
                      }
                    }
                    od.field_m[2] = (byte)param3;
                    od.field_m[1] = (byte)(param3 >> 8);
                    od.field_m[5] = (byte)var7_int;
                    ((gf) this).field_d.a((byte) 91, (long)(param1 * 6));
                    ((gf) this).field_d.a(od.field_m, 0, (byte) 44, 6);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (param3 <= var8) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (!param4) {
                              break L6;
                            } else {
                              L7: {
                                ((gf) this).field_f.a((byte) 123, (long)(520 * var7_int));
                                if (param1 <= 65535) {
                                  try {
                                    L8: {
                                      ((gf) this).field_f.a(od.field_m, 8, 0, (byte) 27);
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
                                    var12 = (255 & od.field_m[3]) + (65280 & od.field_m[2] << 8);
                                    var11 = (65280 & od.field_m[0] << 8) - -(255 & od.field_m[1]);
                                    var13 = 255 & od.field_m[7];
                                    var10 = (od.field_m[6] & 255) + ((od.field_m[4] & 255) << 16) - -(od.field_m[5] << 8 & 65280);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      ((gf) this).field_f.a(od.field_m, 10, 0, (byte) 121);
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
                                    var12 = (od.field_m[5] & 255) + ((od.field_m[4] & 255) << 8);
                                    var13 = 255 & od.field_m[9];
                                    var11 = (65280 & od.field_m[2] << 8) + (od.field_m[0] << 24 & -16777216) - (-(16711680 & od.field_m[1] << 16) + -(od.field_m[3] & 255));
                                    var10 = (od.field_m[8] & 255) + ((od.field_m[7] << 8 & 65280) + (od.field_m[6] << 16 & 16711680));
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
                                  if (var9 != var12) {
                                    break L12;
                                  } else {
                                    if (var13 == ((gf) this).field_a) {
                                      L13: {
                                        if (0 > var10) {
                                          break L13;
                                        } else {
                                          if (((gf) this).field_f.c((byte) -98) / 520L >= (long)var10) {
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
                                    } else {
                                      break L12;
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
                                param4 = false;
                                var10 = (int)((((gf) this).field_f.c((byte) -69) + 519L) / 520L);
                                if (0 == var10) {
                                  var10++;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              if (var10 != var7_int) {
                                break L14;
                              } else {
                                var10++;
                                break L14;
                              }
                            }
                          }
                          L16: {
                            if (512 >= -var8 + param3) {
                              var10 = 0;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (65535 < param1) {
                              L18: {
                                od.field_m[9] = (byte)((gf) this).field_a;
                                od.field_m[7] = (byte)(var10 >> 8);
                                od.field_m[2] = (byte)(param1 >> 8);
                                od.field_m[1] = (byte)(param1 >> 16);
                                od.field_m[0] = (byte)(param1 >> 24);
                                od.field_m[3] = (byte)param1;
                                od.field_m[6] = (byte)(var10 >> 16);
                                od.field_m[4] = (byte)(var9 >> 8);
                                od.field_m[8] = (byte)var10;
                                od.field_m[5] = (byte)var9;
                                ((gf) this).field_f.a((byte) 86, (long)(var7_int * 520));
                                ((gf) this).field_f.a(od.field_m, 0, (byte) 112, 10);
                                var11 = param3 - var8;
                                if (var11 > 510) {
                                  var11 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((gf) this).field_f.a(param0, var8, (byte) 100, var11);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                od.field_m[4] = (byte)(var10 >> 16);
                                od.field_m[2] = (byte)(var9 >> 8);
                                od.field_m[1] = (byte)param1;
                                od.field_m[7] = (byte)((gf) this).field_a;
                                od.field_m[5] = (byte)(var10 >> 8);
                                od.field_m[6] = (byte)var10;
                                od.field_m[0] = (byte)(param1 >> 8);
                                od.field_m[3] = (byte)var9;
                                ((gf) this).field_f.a((byte) 118, (long)(var7_int * 520));
                                ((gf) this).field_f.a(od.field_m, 0, (byte) 122, 8);
                                var11 = param3 + -var8;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              ((gf) this).field_f.a(param0, var8, (byte) 100, var11);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L4;
                        }
                      }
                      stackOut_63_0 = 1;
                      stackIn_64_0 = stackOut_63_0;
                      stackOut_64_0 = stackIn_64_0;
                      stackIn_65_0 = stackOut_64_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_66_0 = 0;
                  stackIn_67_0 = stackOut_66_0;
                  return stackIn_67_0 != 0;
                }
                return stackIn_65_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_70_0 = (RuntimeException) var6_ref;
                stackOut_70_1 = new StringBuilder().append("gf.D(");
                stackIn_72_0 = stackOut_70_0;
                stackIn_72_1 = stackOut_70_1;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                if (param0 == null) {
                  stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
                  stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
                  stackOut_72_2 = "null";
                  stackIn_73_0 = stackOut_72_0;
                  stackIn_73_1 = stackOut_72_1;
                  stackIn_73_2 = stackOut_72_2;
                  break L20;
                } else {
                  stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
                  stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
                  stackOut_71_2 = "{...}";
                  stackIn_73_0 = stackOut_71_0;
                  stackIn_73_1 = stackOut_71_1;
                  stackIn_73_2 = stackOut_71_2;
                  break L20;
                }
              }
              throw la.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    gf(int param0, ch param1, ch param2, int param3) {
        ((gf) this).field_d = null;
        ((gf) this).field_f = null;
        ((gf) this).field_e = 65000;
        try {
            ((gf) this).field_f = param1;
            ((gf) this).field_a = param0;
            ((gf) this).field_e = param3;
            ((gf) this).field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "gf.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    static {
    }
}
