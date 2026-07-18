/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sp {
    static ng field_c;
    private qa field_d;
    private int field_e;
    private qa field_b;
    private int field_g;
    static na field_a;
    static sj field_f;

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
            int stackIn_9_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_16_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_44_0 = 0;
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
            int stackOut_8_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_37_0 = 0;
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
            var16 = CrazyCrystals.field_B;
            try {
              var6_ref2 = (Object) (Object) ((sp) this).field_d;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param4) {
                        if (~(long)(6 * param1 - -6) < ~((sp) this).field_b.b(0)) {
                          stackOut_8_0 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          stackOut_9_0 = stackIn_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0 != 0;
                        } else {
                          L2: {
                            ((sp) this).field_b.a((long)(param1 * 6), -1);
                            ((sp) this).field_b.a((byte) 106, mf.field_u, 0, 6);
                            var7_int = (16711680 & mf.field_u[3] << 16) + ((65280 & mf.field_u[4] << 8) + (mf.field_u[5] & 255));
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (~(long)var7_int >= ~(((sp) this).field_d.b(0) / 520L)) {
                                break L1;
                              } else {
                                break L2;
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
                        var7_int = (int)((((sp) this).field_d.b(0) - -519L) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    L3: {
                      mf.field_u[2] = (byte)param0;
                      mf.field_u[1] = (byte)(param0 >> 8);
                      mf.field_u[5] = (byte)var7_int;
                      mf.field_u[4] = (byte)(var7_int >> 8);
                      mf.field_u[3] = (byte)(var7_int >> 16);
                      mf.field_u[0] = (byte)(param0 >> 16);
                      ((sp) this).field_b.a((long)(6 * param1), -1);
                      ((sp) this).field_b.a(123, mf.field_u, 0, 6);
                      var8 = 0;
                      if (param3 > 111) {
                        break L3;
                      } else {
                        field_a = null;
                        break L3;
                      }
                    }
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (param0 <= var8) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (!param4) {
                              break L6;
                            } else {
                              L7: {
                                ((sp) this).field_d.a((long)(520 * var7_int), -1);
                                if (param1 <= 65535) {
                                  try {
                                    L8: {
                                      ((sp) this).field_d.a((byte) 106, mf.field_u, 0, 8);
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
                                    var10 = ((mf.field_u[4] & 255) << 16) + (mf.field_u[5] << 8 & 65280) + (255 & mf.field_u[6]);
                                    var12 = ((mf.field_u[2] & 255) << 8) - -(mf.field_u[3] & 255);
                                    var13 = mf.field_u[7] & 255;
                                    var11 = ((255 & mf.field_u[0]) << 8) - -(mf.field_u[1] & 255);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      ((sp) this).field_d.a((byte) 106, mf.field_u, 0, 10);
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
                                    var10 = ((255 & mf.field_u[7]) << 8) + (((255 & mf.field_u[6]) << 16) - -(255 & mf.field_u[8]));
                                    var12 = (mf.field_u[5] & 255) + ((255 & mf.field_u[4]) << 8);
                                    var13 = 255 & mf.field_u[9];
                                    var11 = (mf.field_u[2] << 8 & 65280) + ((-16777216 & mf.field_u[0] << 24) + ((mf.field_u[1] & 255) << 16)) + (mf.field_u[3] & 255);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L12: {
                                if (param1 != var11) {
                                  break L12;
                                } else {
                                  if (var9 != var12) {
                                    break L12;
                                  } else {
                                    if (((sp) this).field_e != var13) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (0 > var10) {
                                          break L13;
                                        } else {
                                          if (((sp) this).field_d.b(0) / 520L >= (long)var10) {
                                            break L6;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      stackOut_42_0 = 0;
                                      stackIn_43_0 = stackOut_42_0;
                                      stackOut_43_0 = stackIn_43_0;
                                      stackIn_44_0 = stackOut_43_0;
                                      return stackIn_44_0 != 0;
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
                          L14: {
                            if (var10 != 0) {
                              break L14;
                            } else {
                              L15: {
                                param4 = false;
                                var10 = (int)((519L + ((sp) this).field_d.b(0)) / 520L);
                                if (var10 != 0) {
                                  break L15;
                                } else {
                                  var10++;
                                  break L15;
                                }
                              }
                              if (var10 == var7_int) {
                                var10++;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                          }
                          L16: {
                            if (512 >= param0 + -var8) {
                              var10 = 0;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (param1 > 65535) {
                              L18: {
                                mf.field_u[3] = (byte)param1;
                                mf.field_u[4] = (byte)(var9 >> 8);
                                mf.field_u[0] = (byte)(param1 >> 24);
                                mf.field_u[9] = (byte)((sp) this).field_e;
                                mf.field_u[6] = (byte)(var10 >> 16);
                                mf.field_u[7] = (byte)(var10 >> 8);
                                mf.field_u[2] = (byte)(param1 >> 8);
                                mf.field_u[8] = (byte)var10;
                                mf.field_u[1] = (byte)(param1 >> 16);
                                mf.field_u[5] = (byte)var9;
                                ((sp) this).field_d.a((long)(520 * var7_int), -1);
                                ((sp) this).field_d.a(122, mf.field_u, 0, 10);
                                var11 = param0 - var8;
                                if (var11 > 510) {
                                  var11 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((sp) this).field_d.a(125, param2, var8, var11);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                mf.field_u[2] = (byte)(var9 >> 8);
                                mf.field_u[5] = (byte)(var10 >> 8);
                                mf.field_u[0] = (byte)(param1 >> 8);
                                mf.field_u[6] = (byte)var10;
                                mf.field_u[3] = (byte)var9;
                                mf.field_u[7] = (byte)((sp) this).field_e;
                                mf.field_u[1] = (byte)param1;
                                mf.field_u[4] = (byte)(var10 >> 16);
                                ((sp) this).field_d.a((long)(520 * var7_int), -1);
                                ((sp) this).field_d.a(122, mf.field_u, 0, 8);
                                var11 = param0 - var8;
                                if (var11 <= 512) {
                                  break L19;
                                } else {
                                  var11 = 512;
                                  break L19;
                                }
                              }
                              ((sp) this).field_d.a(123, param2, var8, var11);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var9++;
                          var7_int = var10;
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
                stackOut_70_1 = new StringBuilder().append("sp.D(").append(param0).append(',').append(param1).append(',');
                stackIn_72_0 = stackOut_70_0;
                stackIn_72_1 = stackOut_70_1;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                if (param2 == null) {
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
              throw dn.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((sp) this).field_e;
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        field_c = null;
    }

    final boolean a(int param0, byte[] param1, byte param2, int param3) {
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
          var5 = (Object) (Object) ((sp) this).field_d;
          synchronized (var5) {
            L0: {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (param0 <= ((sp) this).field_g) {
                    L2: {
                      if (param2 == 101) {
                        break L2;
                      } else {
                        field_f = null;
                        break L2;
                      }
                    }
                    L3: {
                      var6 = this.a(param0, param3, param1, 112, true) ? 1 : 0;
                      if (var6 == 0) {
                        var6 = this.a(param0, param3, param1, 126, false) ? 1 : 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    stackOut_9_0 = var6;
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  } else {
                    break L1;
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
            stackOut_13_1 = new StringBuilder().append("sp.A(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final byte[] a(boolean param0, int param1) {
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
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            Object stackIn_39_0 = null;
            Object stackIn_40_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_38_0 = null;
            Object stackOut_39_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_54_0 = null;
            var18 = CrazyCrystals.field_B;
            var3 = (Object) (Object) ((sp) this).field_d;
            synchronized (var3) {
              try {
                L0: {
                  if (((sp) this).field_b.b(0) >= (long)(6 * param1 + 6)) {
                    ((sp) this).field_b.a((long)(param1 * 6), -1);
                    ((sp) this).field_b.a((byte) 106, mf.field_u, 0, 6);
                    var4_int = (255 & mf.field_u[2]) + ((65280 & mf.field_u[1] << 8) + ((255 & mf.field_u[0]) << 16));
                    var5 = (255 & mf.field_u[5]) + ((mf.field_u[4] & 255) << 8) + ((mf.field_u[3] & 255) << 16);
                    if (var4_int >= 0) {
                      if (((sp) this).field_g >= var4_int) {
                        if (var5 > 0) {
                          if (~(long)var5 >= ~(((sp) this).field_d.b(0) / 520L)) {
                            L1: {
                              if (!param0) {
                                break L1;
                              } else {
                                field_f = null;
                                break L1;
                              }
                            }
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_51_0 = (byte[]) var6;
                                stackIn_52_0 = stackOut_51_0;
                                stackOut_52_0 = (byte[]) (Object) stackIn_52_0;
                                stackIn_53_0 = stackOut_52_0;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L3: {
                                    ((sp) this).field_d.a((long)(var5 * 520), -1);
                                    var9 = var4_int - var7;
                                    if (param1 <= 65535) {
                                      L4: {
                                        var14 = 8;
                                        if (var9 > 512) {
                                          var9 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      ((sp) this).field_d.a((byte) 106, mf.field_u, 0, var9 + var14);
                                      var12 = (mf.field_u[5] << 8 & 65280) + ((16711680 & mf.field_u[4] << 16) - -(255 & mf.field_u[6]));
                                      var10 = (mf.field_u[1] & 255) + (65280 & mf.field_u[0] << 8);
                                      var13 = mf.field_u[7] & 255;
                                      var11 = (255 & mf.field_u[3]) + ((255 & mf.field_u[2]) << 8);
                                      break L3;
                                    } else {
                                      L5: {
                                        if (510 >= var9) {
                                          break L5;
                                        } else {
                                          var9 = 510;
                                          break L5;
                                        }
                                      }
                                      var14 = 10;
                                      ((sp) this).field_d.a((byte) 106, mf.field_u, 0, var9 - -var14);
                                      var10 = ((255 & mf.field_u[2]) << 8) + (((mf.field_u[0] & 255) << 24) - -(16711680 & mf.field_u[1] << 16)) + (255 & mf.field_u[3]);
                                      var12 = (255 & mf.field_u[8]) + (((255 & mf.field_u[6]) << 16) + (65280 & mf.field_u[7] << 8));
                                      var11 = (65280 & mf.field_u[4] << 8) + (mf.field_u[5] & 255);
                                      var13 = 255 & mf.field_u[9];
                                      break L3;
                                    }
                                  }
                                  if (var10 == param1) {
                                    if (var11 == var8) {
                                      if (var13 == ((sp) this).field_e) {
                                        if (var12 >= 0) {
                                          if (~(((sp) this).field_d.b(0) / 520L) <= ~(long)var12) {
                                            var15 = var9 + var14;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var16 >= var15) {
                                                var5 = var12;
                                                var8++;
                                                continue L2;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = mf.field_u[var16];
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
                                        stackOut_38_0 = null;
                                        stackIn_39_0 = stackOut_38_0;
                                        stackOut_39_0 = stackIn_39_0;
                                        stackIn_40_0 = stackOut_39_0;
                                        return (byte[]) (Object) stackIn_40_0;
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
                stackOut_54_0 = null;
                stackIn_55_0 = stackOut_54_0;
                return (byte[]) (Object) stackIn_55_0;
              }
              return stackIn_53_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    sp(int param0, qa param1, qa param2, int param3) {
        ((sp) this).field_d = null;
        ((sp) this).field_b = null;
        ((sp) this).field_g = 65000;
        try {
            ((sp) this).field_d = param1;
            ((sp) this).field_g = param3;
            ((sp) this).field_b = param2;
            ((sp) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "sp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ng(256);
        field_f = new sj(15, 0, 1, 0);
    }
}
