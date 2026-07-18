/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ve {
    private jg field_d;
    static String field_e;
    private int field_c;
    private int field_b;
    private jg field_a;

    public static void a() {
        field_e = null;
    }

    final boolean a(byte param0, byte[] param1, int param2, int param3) {
        Object var5 = null;
        Object var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          var5_ref = (Object) (Object) ((ve) this).field_d;
          synchronized (var5_ref) {
            L0: {
              L1: {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (((ve) this).field_b < param2) {
                    break L1;
                  } else {
                    if (param0 <= -116) {
                      L2: {
                        var6 = this.a(param1, param3, true, true, param2) ? 1 : 0;
                        if (var6 == 0) {
                          var6 = this.a(param1, param3, false, true, param2) ? 1 : 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      stackOut_11_0 = var6;
                      stackIn_12_0 = stackOut_11_0;
                      break L0;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    }
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_12_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5_ref2;
            stackOut_15_1 = new StringBuilder().append("ve.C(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 != -21835160) {
            boolean discarded$0 = ve.b(-54);
        }
        return ud.a(qn.field_n, kb.field_Qb, 21);
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (lj.field_j != null) {
            var1 = (Object) (Object) lj.field_j;
            synchronized (var1) {
              L1: {
                lj.field_j = null;
                break L1;
              }
            }
            break L0;
          } else {
            break L0;
          }
        }
    }

    public final String toString() {
        return "" + ((ve) this).field_c;
    }

    private final boolean a(byte[] param0, int param1, boolean param2, boolean param3, int param4) {
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
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
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
            var16 = BrickABrac.field_J ? 1 : 0;
            try {
              var6_ref2 = (Object) (Object) ((ve) this).field_d;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param2) {
                        if (~(long)(6 + param1 * 6) < ~((ve) this).field_a.a((byte) 115)) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        } else {
                          L2: {
                            ((ve) this).field_a.a(0, (long)(param1 * 6));
                            ((ve) this).field_a.a(6, 0, 120, tf.field_b);
                            var7_int = (255 & tf.field_b[5]) + ((255 & tf.field_b[3]) << 16) + (65280 & tf.field_b[4] << 8);
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if ((long)var7_int > ((ve) this).field_d.a((byte) 71) / 520L) {
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
                        var7_int = (int)((519L + ((ve) this).field_d.a((byte) 62)) / 520L);
                        if (0 != var7_int) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    tf.field_b[0] = (byte)(param4 >> 16);
                    tf.field_b[4] = (byte)(var7_int >> 8);
                    tf.field_b[5] = (byte)var7_int;
                    tf.field_b[2] = (byte)param4;
                    tf.field_b[1] = (byte)(param4 >> 8);
                    tf.field_b[3] = (byte)(var7_int >> 16);
                    ((ve) this).field_a.a(0, (long)(param1 * 6));
                    ((ve) this).field_a.a(tf.field_b, 0, 6, -1);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (param4 <= var8) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (param2) {
                              L6: {
                                ((ve) this).field_d.a(0, (long)(520 * var7_int));
                                if (65535 >= param1) {
                                  try {
                                    L7: {
                                      ((ve) this).field_d.a(8, 0, 121, tf.field_b);
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
                                    var13 = 255 & tf.field_b[7];
                                    var12 = (tf.field_b[2] << 8 & 65280) + (255 & tf.field_b[3]);
                                    var10 = ((255 & tf.field_b[5]) << 8) + ((tf.field_b[4] & 255) << 16) - -(tf.field_b[6] & 255);
                                    var11 = ((255 & tf.field_b[0]) << 8) - -(255 & tf.field_b[1]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((ve) this).field_d.a(10, 0, 119, tf.field_b);
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
                                    var11 = ((tf.field_b[2] & 255) << 8) + ((16711680 & tf.field_b[1] << 16) + (-16777216 & tf.field_b[0] << 24)) - -(tf.field_b[3] & 255);
                                    var10 = (255 & tf.field_b[8]) + ((tf.field_b[6] << 16 & 16711680) + (tf.field_b[7] << 8 & 65280));
                                    var12 = (255 & tf.field_b[5]) + ((255 & tf.field_b[4]) << 8);
                                    var13 = tf.field_b[9] & 255;
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (param1 != var11) {
                                  break L11;
                                } else {
                                  if (var12 != var9) {
                                    break L11;
                                  } else {
                                    if (((ve) this).field_c == var13) {
                                      L12: {
                                        if (var10 < 0) {
                                          break L12;
                                        } else {
                                          if (~(long)var10 < ~(((ve) this).field_d.a((byte) 29) / 520L)) {
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
                            } else {
                              break L5;
                            }
                          }
                          L13: {
                            if (0 == var10) {
                              L14: {
                                var10 = (int)((519L + ((ve) this).field_d.a((byte) 85)) / 520L);
                                param2 = false;
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
                            } else {
                              break L13;
                            }
                          }
                          L15: {
                            if (param4 - var8 <= 512) {
                              var10 = 0;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (param1 <= 65535) {
                              L17: {
                                tf.field_b[6] = (byte)var10;
                                tf.field_b[1] = (byte)param1;
                                tf.field_b[5] = (byte)(var10 >> 8);
                                tf.field_b[0] = (byte)(param1 >> 8);
                                tf.field_b[3] = (byte)var9;
                                tf.field_b[2] = (byte)(var9 >> 8);
                                tf.field_b[7] = (byte)((ve) this).field_c;
                                tf.field_b[4] = (byte)(var10 >> 16);
                                ((ve) this).field_d.a(0, (long)(520 * var7_int));
                                ((ve) this).field_d.a(tf.field_b, 0, 8, -1);
                                var11 = param4 + -var8;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((ve) this).field_d.a(param0, var8, var11, -1);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                tf.field_b[5] = (byte)var9;
                                tf.field_b[8] = (byte)var10;
                                tf.field_b[1] = (byte)(param1 >> 16);
                                tf.field_b[6] = (byte)(var10 >> 16);
                                tf.field_b[0] = (byte)(param1 >> 24);
                                tf.field_b[9] = (byte)((ve) this).field_c;
                                tf.field_b[7] = (byte)(var10 >> 8);
                                tf.field_b[2] = (byte)(param1 >> 8);
                                tf.field_b[3] = (byte)param1;
                                tf.field_b[4] = (byte)(var9 >> 8);
                                ((ve) this).field_d.a(0, (long)(520 * var7_int));
                                ((ve) this).field_d.a(tf.field_b, 0, 10, -1);
                                var11 = param4 - var8;
                                if (510 >= var11) {
                                  break L18;
                                } else {
                                  var11 = 510;
                                  break L18;
                                }
                              }
                              ((ve) this).field_d.a(param0, var8, var11, -1);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var9++;
                          var7_int = var10;
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
                stackOut_67_1 = new StringBuilder().append("ve.D(");
                stackIn_69_0 = stackOut_67_0;
                stackIn_69_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (param0 == null) {
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
              throw qb.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ',' + param1 + ',' + param2 + ',' + true + ',' + param4 + ')');
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
            Object stackIn_37_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_43_0 = null;
            Object stackIn_44_0 = null;
            byte[] stackIn_50_0 = null;
            byte[] stackIn_51_0 = null;
            Object stackIn_53_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_49_0 = null;
            byte[] stackOut_50_0 = null;
            Object stackOut_42_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_36_0 = null;
            Object stackOut_37_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_52_0 = null;
            var18 = BrickABrac.field_J ? 1 : 0;
            var3 = (Object) (Object) ((ve) this).field_d;
            synchronized (var3) {
              try {
                L0: {
                  if (~(long)(6 * param1 + 6) >= ~((ve) this).field_a.a((byte) 53)) {
                    ((ve) this).field_a.a(0, (long)(param1 * 6));
                    ((ve) this).field_a.a(6, 0, 127, tf.field_b);
                    var4_int = (tf.field_b[2] & 255) + ((tf.field_b[1] & 255) << 8) + (16711680 & tf.field_b[0] << 16);
                    var5 = (tf.field_b[5] & 255) + (tf.field_b[3] << 16 & 16711680) + ((tf.field_b[4] & 255) << 8);
                    if (var4_int >= 0) {
                      if (((ve) this).field_b >= var4_int) {
                        if (var5 > 0) {
                          if (~(long)var5 >= ~(((ve) this).field_d.a((byte) 66) / 520L)) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = param0;
                            L1: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_49_0 = (byte[]) var6;
                                stackIn_50_0 = stackOut_49_0;
                                stackOut_50_0 = (byte[]) (Object) stackIn_50_0;
                                stackIn_51_0 = stackOut_50_0;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L2: {
                                    ((ve) this).field_d.a(0, (long)(520 * var5));
                                    var9 = var4_int - var7;
                                    if (param1 <= 65535) {
                                      L3: {
                                        if (512 < var9) {
                                          var9 = 512;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                      var14 = 8;
                                      ((ve) this).field_d.a(var9 + var14, 0, 126, tf.field_b);
                                      var10 = ((tf.field_b[0] & 255) << 8) - -(tf.field_b[1] & 255);
                                      var13 = tf.field_b[7] & 255;
                                      var11 = (tf.field_b[3] & 255) + ((tf.field_b[2] & 255) << 8);
                                      var12 = ((tf.field_b[4] & 255) << 16) - (-((255 & tf.field_b[5]) << 8) - (tf.field_b[6] & 255));
                                      break L2;
                                    } else {
                                      L4: {
                                        var14 = 10;
                                        if (510 >= var9) {
                                          break L4;
                                        } else {
                                          var9 = 510;
                                          break L4;
                                        }
                                      }
                                      ((ve) this).field_d.a(var14 + var9, 0, param0 ^ 117, tf.field_b);
                                      var11 = ((255 & tf.field_b[4]) << 8) + (255 & tf.field_b[5]);
                                      var13 = tf.field_b[9] & 255;
                                      var12 = ((255 & tf.field_b[7]) << 8) + ((tf.field_b[6] & 255) << 16) + (tf.field_b[8] & 255);
                                      var10 = (tf.field_b[3] & 255) + (((tf.field_b[1] & 255) << 16) + (tf.field_b[0] << 24 & -16777216) - -(tf.field_b[2] << 8 & 65280));
                                      break L2;
                                    }
                                  }
                                  if (param1 == var10) {
                                    if (var8 == var11) {
                                      if (var13 == ((ve) this).field_c) {
                                        if (var12 >= 0) {
                                          if ((long)var12 <= ((ve) this).field_d.a((byte) 70) / 520L) {
                                            var15 = var14 + var9;
                                            var8++;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var16 >= var15) {
                                                var5 = var12;
                                                continue L1;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = tf.field_b[var16];
                                                var16++;
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
                        return null;
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

    ve(int param0, jg param1, jg param2, int param3) {
        ((ve) this).field_d = null;
        ((ve) this).field_b = 65000;
        ((ve) this).field_a = null;
        try {
            ((ve) this).field_b = param3;
            ((ve) this).field_c = param0;
            ((ve) this).field_a = param2;
            ((ve) this).field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ve.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "This option cannot be combined with the current settings for:  ";
    }
}
