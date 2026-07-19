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

    public static void a(byte param0) {
        field_e = null;
        if (param0 != 47) {
            field_e = (String) null;
        }
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
          L0: {
            var5_ref = this.field_d;
            synchronized (var5_ref) {
              L1: {
                L2: {
                  if (param2 < 0) {
                    break L2;
                  } else {
                    if (this.field_b < param2) {
                      break L2;
                    } else {
                      if (param0 <= -116) {
                        L3: {
                          var6 = this.a(param1, param3, true, true, param2) ? 1 : 0;
                          if (var6 == 0) {
                            var6 = this.a(param1, param3, false, true, param2) ? 1 : 0;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        stackOut_11_0 = var6;
                        stackIn_12_0 = stackOut_11_0;
                        break L1;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5_ref2);
            stackOut_15_1 = new StringBuilder().append("ve.C(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final static boolean b(int param0) {
        boolean discarded$0 = false;
        if (param0 != -21835160) {
            discarded$0 = ve.b(-54);
        }
        return ud.a(qn.field_n, kb.field_Qb, 21);
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (lj.field_j != null) {
            var1 = lj.field_j;
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
        L2: {
          if (param0 == 5) {
            break L2;
          } else {
            field_e = (String) null;
            break L2;
          }
        }
    }

    public final String toString() {
        return "" + this.field_c;
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
            int stackIn_36_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_43_0 = 0;
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
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
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
            var16 = BrickABrac.field_J ? 1 : 0;
            try {
              var6_ref2 = this.field_d;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param2) {
                        if (((long)(6 + param1 * 6) ^ -1L) < (this.field_a.a((byte) 115) ^ -1L)) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        } else {
                          L2: {
                            this.field_a.a(0, (long)(param1 * 6));
                            this.field_a.a(6, 0, 120, tf.field_b);
                            var7_int = (255 & tf.field_b[5]) + ((255 & tf.field_b[3]) << -194951696) + (65280 & tf.field_b[4] << 179144072);
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if ((long)var7_int > this.field_d.a((byte) 71) / 520L) {
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
                        }
                      } else {
                        var7_int = (int)((519L + this.field_d.a((byte) 62)) / 520L);
                        if (0 != var7_int) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    L3: {
                      tf.field_b[0] = (byte)(param4 >> 245010384);
                      tf.field_b[4] = (byte)(var7_int >> 584112296);
                      tf.field_b[5] = (byte)var7_int;
                      tf.field_b[2] = (byte)param4;
                      if (param3) {
                        break L3;
                      } else {
                        ve.a((byte) 8);
                        break L3;
                      }
                    }
                    tf.field_b[1] = (byte)(param4 >> 539457352);
                    tf.field_b[3] = (byte)(var7_int >> -1446601680);
                    this.field_a.a(0, (long)(param1 * 6));
                    this.field_a.a(tf.field_b, 0, 6, -1);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (param4 <= var8) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (param2) {
                              L7: {
                                this.field_d.a(0, (long)(520 * var7_int));
                                if (65535 >= param1) {
                                  try {
                                    L8: {
                                      this.field_d.a(8, 0, 121, tf.field_b);
                                      decompiledRegionSelector0 = 0;
                                      break L8;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L9: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L9;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var13 = 255 & tf.field_b[7];
                                    var12 = (tf.field_b[2] << 108276712 & 65280) + (255 & tf.field_b[3]);
                                    var10 = ((255 & tf.field_b[5]) << -87802776) + ((tf.field_b[4] & 255) << 1959779568) - -(tf.field_b[6] & 255);
                                    var11 = ((255 & tf.field_b[0]) << -1391593784) - -(255 & tf.field_b[1]);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      this.field_d.a(10, 0, 119, tf.field_b);
                                      decompiledRegionSelector1 = 0;
                                      break L10;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L11: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L11;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var11 = ((tf.field_b[2] & 255) << 860851560) + ((16711680 & tf.field_b[1] << 135448304) + (-16777216 & tf.field_b[0] << 1462683992)) - -(tf.field_b[3] & 255);
                                    var10 = (255 & tf.field_b[8]) + ((tf.field_b[6] << -1418699856 & 16711680) + (tf.field_b[7] << -21835160 & 65280));
                                    var12 = (255 & tf.field_b[5]) + ((255 & tf.field_b[4]) << -559612504);
                                    var13 = tf.field_b[9] & 255;
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
                                  if (var12 != var9) {
                                    break L12;
                                  } else {
                                    if (this.field_c == var13) {
                                      L13: {
                                        if ((var10 ^ -1) > -1) {
                                          break L13;
                                        } else {
                                          if (((long)var10 ^ -1L) < (this.field_d.a((byte) 29) / 520L ^ -1L)) {
                                            break L13;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      stackOut_41_0 = 0;
                                      stackIn_42_0 = stackOut_41_0;
                                      stackOut_42_0 = stackIn_42_0;
                                      stackIn_43_0 = stackOut_42_0;
                                      decompiledRegionSelector2 = 3;
                                      break L0;
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
                              decompiledRegionSelector2 = 2;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                          L14: {
                            if (0 == var10) {
                              L15: {
                                var10 = (int)((519L + this.field_d.a((byte) 85)) / 520L);
                                param2 = false;
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
                            } else {
                              break L14;
                            }
                          }
                          L16: {
                            if ((param4 - var8 ^ -1) >= -513) {
                              var10 = 0;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (param1 <= 65535) {
                              L18: {
                                tf.field_b[6] = (byte)var10;
                                tf.field_b[1] = (byte)param1;
                                tf.field_b[5] = (byte)(var10 >> -1511692600);
                                tf.field_b[0] = (byte)(param1 >> 1254182728);
                                tf.field_b[3] = (byte)var9;
                                tf.field_b[2] = (byte)(var9 >> -103482648);
                                tf.field_b[7] = (byte)this.field_c;
                                tf.field_b[4] = (byte)(var10 >> 1702799536);
                                this.field_d.a(0, (long)(520 * var7_int));
                                this.field_d.a(tf.field_b, 0, 8, -1);
                                var11 = param4 + -var8;
                                if ((var11 ^ -1) < -513) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_d.a(param0, var8, var11, -1);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                tf.field_b[5] = (byte)var9;
                                tf.field_b[8] = (byte)var10;
                                tf.field_b[1] = (byte)(param1 >> 125775984);
                                tf.field_b[6] = (byte)(var10 >> -2068173712);
                                tf.field_b[0] = (byte)(param1 >> 656754840);
                                tf.field_b[9] = (byte)this.field_c;
                                tf.field_b[7] = (byte)(var10 >> 1132440744);
                                tf.field_b[2] = (byte)(param1 >> 1383185224);
                                tf.field_b[3] = (byte)param1;
                                tf.field_b[4] = (byte)(var9 >> 2051039528);
                                this.field_d.a(0, (long)(520 * var7_int));
                                this.field_d.a(tf.field_b, 0, 10, -1);
                                var11 = param4 - var8;
                                if (510 >= var11) {
                                  break L19;
                                } else {
                                  var11 = 510;
                                  break L19;
                                }
                              }
                              this.field_d.a(param0, var8, var11, -1);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L4;
                        }
                      }
                      stackOut_62_0 = 1;
                      stackIn_63_0 = stackOut_62_0;
                      stackOut_63_0 = stackIn_63_0;
                      stackIn_64_0 = stackOut_63_0;
                      decompiledRegionSelector2 = 4;
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
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_9_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_15_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_37_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_43_0 != 0;
                      } else {
                        return stackIn_64_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_69_0 = (RuntimeException) (var6_ref);
                stackOut_69_1 = new StringBuilder().append("ve.D(");
                stackIn_71_0 = stackOut_69_0;
                stackIn_71_1 = stackOut_69_1;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                if (param0 == null) {
                  stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
                  stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
                  stackOut_71_2 = "null";
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  stackIn_72_2 = stackOut_71_2;
                  break L20;
                } else {
                  stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
                  stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
                  stackOut_70_2 = "{...}";
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  stackIn_72_2 = stackOut_70_2;
                  break L20;
                }
              }
              throw qb.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
            Object stackIn_37_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_43_0 = null;
            Object stackIn_44_0 = null;
            byte[] stackIn_50_0 = null;
            byte[] stackIn_51_0 = null;
            Object stackIn_53_0 = null;
            int decompiledRegionSelector0 = 0;
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
            var3 = this.field_d;
            synchronized (var3) {
              try {
                L0: {
                  if (((long)(6 * param1 + 6) ^ -1L) >= (this.field_a.a((byte) 53) ^ -1L)) {
                    this.field_a.a(0, (long)(param1 * 6));
                    this.field_a.a(6, 0, 127, tf.field_b);
                    var4_int = (tf.field_b[2] & 255) + ((tf.field_b[1] & 255) << -1824568504) + (16711680 & tf.field_b[0] << -1518791696);
                    var5 = (tf.field_b[5] & 255) + (tf.field_b[3] << -1818777296 & 16711680) + ((tf.field_b[4] & 255) << 827368840);
                    if ((var4_int ^ -1) <= -1) {
                      if (this.field_b >= var4_int) {
                        if (var5 > 0) {
                          if (((long)var5 ^ -1L) >= (this.field_d.a((byte) 66) / 520L ^ -1L)) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = param0;
                            L1: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_49_0 = (byte[]) (var6);
                                stackIn_50_0 = stackOut_49_0;
                                stackOut_50_0 = (byte[]) ((Object) stackIn_50_0);
                                stackIn_51_0 = stackOut_50_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L2: {
                                    this.field_d.a(0, (long)(520 * var5));
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
                                      this.field_d.a(var9 + var14, 0, 126, tf.field_b);
                                      var10 = ((tf.field_b[0] & 255) << -139012856) - -(tf.field_b[1] & 255);
                                      var13 = tf.field_b[7] & 255;
                                      var11 = (tf.field_b[3] & 255) + ((tf.field_b[2] & 255) << 1296150312);
                                      var12 = ((tf.field_b[4] & 255) << 891578160) - (-((255 & tf.field_b[5]) << -1426190168) - (tf.field_b[6] & 255));
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
                                      this.field_d.a(var14 + var9, 0, param0 ^ 117, tf.field_b);
                                      var11 = ((255 & tf.field_b[4]) << -1491108696) + (255 & tf.field_b[5]);
                                      var13 = tf.field_b[9] & 255;
                                      var12 = ((255 & tf.field_b[7]) << 1071106504) + ((tf.field_b[6] & 255) << 457819024) + (tf.field_b[8] & 255);
                                      var10 = (tf.field_b[3] & 255) + (((tf.field_b[1] & 255) << -343231760) + (tf.field_b[0] << 650564152 & -16777216) - -(tf.field_b[2] << -2128743960 & 65280));
                                      break L2;
                                    }
                                  }
                                  if (param1 == var10) {
                                    if (var8 == var11) {
                                      if (var13 == this.field_c) {
                                        if (-1 >= (var12 ^ -1)) {
                                          if ((long)var12 <= this.field_d.a((byte) 70) / 520L) {
                                            var15 = var14 + var9;
                                            var8++;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var16 >= var15) {
                                                var5 = var12;
                                                continue L1;
                                              } else {
                                                incrementValue$1 = var7;
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
                                            decompiledRegionSelector0 = 2;
                                            break L0;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        stackOut_36_0 = null;
                                        stackIn_37_0 = stackOut_36_0;
                                        stackOut_37_0 = stackIn_37_0;
                                        stackIn_38_0 = stackOut_37_0;
                                        decompiledRegionSelector0 = 1;
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
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_52_0 = null;
                stackIn_53_0 = stackOut_52_0;
                return (byte[]) ((Object) stackIn_53_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_4_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_38_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_44_0);
                  } else {
                    return stackIn_51_0;
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

    ve(int param0, jg param1, jg param2, int param3) {
        this.field_d = null;
        this.field_b = 65000;
        this.field_a = null;
        try {
            this.field_b = param3;
            this.field_c = param0;
            this.field_a = param2;
            this.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ve.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_e = "This option cannot be combined with the current settings for:  ";
    }
}
