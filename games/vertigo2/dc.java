/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dc extends ji {
    private int field_I;
    private int field_z;
    static int field_O;
    static boolean field_B;
    static lg[] field_J;
    static String field_M;
    static mc field_P;
    static long field_F;
    static qi field_L;
    static String field_K;
    private int field_C;
    private int field_N;
    private byte[] field_E;
    private short[] field_D;
    private int field_H;
    private int field_y;

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 110) {
                break L1;
              } else {
                field_F = -51L;
                break L1;
              }
            }
            L2: {
              var4_int = param1;
              if (var4_int != 0) {
                if (var4_int != 1) {
                  if (var4_int != 2) {
                    if (var4_int == 3) {
                      ((dc) this).field_C = param2.h(-11);
                      break L2;
                    } else {
                      if (4 != var4_int) {
                        if (5 == var4_int) {
                          ((dc) this).field_y = param2.h(param0 ^ -101);
                          break L2;
                        } else {
                          if (var4_int != 6) {
                            break L2;
                          } else {
                            ((dc) this).field_I = param2.h(-11);
                            break L2;
                          }
                        }
                      } else {
                        ((dc) this).field_z = param2.h(-11);
                        break L2;
                      }
                    }
                  } else {
                    ((dc) this).field_H = param2.a((byte) -11);
                    break L2;
                  }
                } else {
                  ((dc) this).field_N = param2.h(-11);
                  break L2;
                }
              } else {
                int dupTemp$1 = param2.h(-11);
                ((dc) this).field_I = dupTemp$1;
                ((dc) this).field_y = dupTemp$1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("dc.C(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        int var18 = 0;
        int var19 = 0;
        int stackIn_9_0 = 0;
        byte[] stackIn_9_1 = null;
        int stackIn_10_0 = 0;
        byte[] stackIn_10_1 = null;
        int stackIn_11_0 = 0;
        byte[] stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        byte[] stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        byte[] stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        byte[] stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        double stackIn_37_0 = 0.0;
        double stackIn_38_0 = 0.0;
        double stackIn_39_0 = 0.0;
        int stackIn_39_1 = 0;
        double stackIn_40_0 = 0.0;
        double stackIn_41_0 = 0.0;
        double stackIn_42_0 = 0.0;
        int stackIn_42_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackOut_8_0 = 0;
        byte[] stackOut_8_1 = null;
        int stackOut_10_0 = 0;
        byte[] stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_9_0 = 0;
        byte[] stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        byte[] stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        byte[] stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        byte[] stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        double stackOut_36_0 = 0.0;
        double stackOut_38_0 = 0.0;
        int stackOut_38_1 = 0;
        double stackOut_37_0 = 0.0;
        int stackOut_37_1 = 0;
        double stackOut_39_0 = 0.0;
        double stackOut_41_0 = 0.0;
        int stackOut_41_1 = 0;
        double stackOut_40_0 = 0.0;
        int stackOut_40_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        L0: {
          var19 = Vertigo2.field_L ? 1 : 0;
          var3 = ((dc) this).field_x.a(param0, (byte) -84);
          if (param1 >= 91) {
            break L0;
          } else {
            field_J = null;
            break L0;
          }
        }
        L1: {
          if (((dc) this).field_x.field_i) {
            var4 = 2048 + ((dc) this).field_I * lf.field_y[param0];
            var5 = var4 >> 12;
            var6 = 1 + var5;
            var14 = 0;
            L2: while (true) {
              if (var14 >= we.field_M) {
                break L1;
              } else {
                pl.field_q = 2147483647;
                hb.field_p = 2147483647;
                hj.field_d = 2147483647;
                fq.field_g = 2147483647;
                var15 = ((dc) this).field_y * rh.field_O[var14] + 2048;
                var16 = var15 >> 12;
                var17 = 1 + var16;
                var8 = -1 + var5;
                L3: while (true) {
                  if (~var8 < ~var6) {
                    L4: {
                      var18 = ((dc) this).field_C;
                      if (var18 == 0) {
                        var3[var14] = pl.field_q;
                        break L4;
                      } else {
                        if (1 != var18) {
                          if (var18 != 3) {
                            if (var18 != 4) {
                              if (var18 == 2) {
                                var3[var14] = -pl.field_q + hj.field_d;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              var3[var14] = fq.field_g;
                              break L4;
                            }
                          } else {
                            var3[var14] = hb.field_p;
                            break L4;
                          }
                        } else {
                          var3[var14] = hj.field_d;
                          break L4;
                        }
                      }
                    }
                    var14++;
                    continue L2;
                  } else {
                    L5: {
                      stackOut_8_0 = 255;
                      stackOut_8_1 = ((dc) this).field_E;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (~var8 > ~((dc) this).field_I) {
                        stackOut_10_0 = stackIn_10_0;
                        stackOut_10_1 = (byte[]) (Object) stackIn_10_1;
                        stackOut_10_2 = var8;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L5;
                      } else {
                        stackOut_9_0 = stackIn_9_0;
                        stackOut_9_1 = (byte[]) (Object) stackIn_9_1;
                        stackOut_9_2 = -((dc) this).field_I + var8;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L5;
                      }
                    }
                    var12 = stackIn_11_0 & stackIn_11_1[stackIn_11_2 & 255];
                    var7 = -1 + var16;
                    L6: while (true) {
                      if (~var17 > ~var7) {
                        var8++;
                        continue L3;
                      } else {
                        L7: {
                          stackOut_13_0 = 2;
                          stackOut_13_1 = 255;
                          stackOut_13_2 = ((dc) this).field_E;
                          stackOut_13_3 = var12;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          stackIn_15_2 = stackOut_13_2;
                          stackIn_15_3 = stackOut_13_3;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          stackIn_14_2 = stackOut_13_2;
                          stackIn_14_3 = stackOut_13_3;
                          if (((dc) this).field_y > var7) {
                            stackOut_15_0 = stackIn_15_0;
                            stackOut_15_1 = stackIn_15_1;
                            stackOut_15_2 = (byte[]) (Object) stackIn_15_2;
                            stackOut_15_3 = stackIn_15_3;
                            stackOut_15_4 = var7;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            stackIn_16_2 = stackOut_15_2;
                            stackIn_16_3 = stackOut_15_3;
                            stackIn_16_4 = stackOut_15_4;
                            break L7;
                          } else {
                            stackOut_14_0 = stackIn_14_0;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = (byte[]) (Object) stackIn_14_2;
                            stackOut_14_3 = stackIn_14_3;
                            stackOut_14_4 = var7 - ((dc) this).field_y;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_16_1 = stackOut_14_1;
                            stackIn_16_2 = stackOut_14_2;
                            stackIn_16_3 = stackOut_14_3;
                            stackIn_16_4 = stackOut_14_4;
                            break L7;
                          }
                        }
                        L8: {
                          var13 = stackIn_16_0 * (stackIn_16_1 & stackIn_16_2[stackIn_16_3 - -stackIn_16_4 & 255]);
                          int incrementValue$1 = var13;
                          var13++;
                          var9 = -((dc) this).field_D[incrementValue$1] - ((var7 << 12) - var15);
                          var10 = var4 - ((dc) this).field_D[var13] + -(var8 << 12);
                          var18 = ((dc) this).field_z;
                          if (var18 != 1) {
                            if (var18 != 3) {
                              if (var18 == 4) {
                                L9: {
                                  stackOut_36_0 = 4096.0;
                                  stackIn_38_0 = stackOut_36_0;
                                  stackIn_37_0 = stackOut_36_0;
                                  if (var9 >= 0) {
                                    stackOut_38_0 = stackIn_38_0;
                                    stackOut_38_1 = var9;
                                    stackIn_39_0 = stackOut_38_0;
                                    stackIn_39_1 = stackOut_38_1;
                                    break L9;
                                  } else {
                                    stackOut_37_0 = stackIn_37_0;
                                    stackOut_37_1 = -var9;
                                    stackIn_39_0 = stackOut_37_0;
                                    stackIn_39_1 = stackOut_37_1;
                                    break L9;
                                  }
                                }
                                L10: {
                                  var9 = (int)(stackIn_39_0 * Math.sqrt((double)((float)stackIn_39_1 / 4096.0f)));
                                  stackOut_39_0 = 4096.0;
                                  stackIn_41_0 = stackOut_39_0;
                                  stackIn_40_0 = stackOut_39_0;
                                  if (var10 < 0) {
                                    stackOut_41_0 = stackIn_41_0;
                                    stackOut_41_1 = -var10;
                                    stackIn_42_0 = stackOut_41_0;
                                    stackIn_42_1 = stackOut_41_1;
                                    break L10;
                                  } else {
                                    stackOut_40_0 = stackIn_40_0;
                                    stackOut_40_1 = var10;
                                    stackIn_42_0 = stackOut_40_0;
                                    stackIn_42_1 = stackOut_40_1;
                                    break L10;
                                  }
                                }
                                var10 = (int)(stackIn_42_0 * Math.sqrt((double)((float)stackIn_42_1 / 4096.0f)));
                                var11 = var10 + var9;
                                var11 = var11 * var11 >> 12;
                                break L8;
                              } else {
                                if (var18 != 5) {
                                  if (2 != var18) {
                                    var11 = (int)(Math.sqrt((double)((float)(var10 * var10 + var9 * var9) / 16777216.0f)) * 4096.0);
                                    break L8;
                                  } else {
                                    L11: {
                                      if (var10 < 0) {
                                        stackOut_46_0 = -var10;
                                        stackIn_47_0 = stackOut_46_0;
                                        break L11;
                                      } else {
                                        stackOut_45_0 = var10;
                                        stackIn_47_0 = stackOut_45_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      stackOut_47_0 = stackIn_47_0;
                                      stackIn_49_0 = stackOut_47_0;
                                      stackIn_48_0 = stackOut_47_0;
                                      if (var9 < 0) {
                                        stackOut_49_0 = stackIn_49_0;
                                        stackOut_49_1 = -var9;
                                        stackIn_50_0 = stackOut_49_0;
                                        stackIn_50_1 = stackOut_49_1;
                                        break L12;
                                      } else {
                                        stackOut_48_0 = stackIn_48_0;
                                        stackOut_48_1 = var9;
                                        stackIn_50_0 = stackOut_48_0;
                                        stackIn_50_1 = stackOut_48_1;
                                        break L12;
                                      }
                                    }
                                    var11 = stackIn_50_0 + stackIn_50_1;
                                    break L8;
                                  }
                                } else {
                                  var9 = var9 * var9;
                                  var10 = var10 * var10;
                                  var11 = (int)(Math.sqrt(Math.sqrt((double)((float)(var9 - -var10) / 16777216.0f))) * 4096.0);
                                  break L8;
                                }
                              }
                            } else {
                              L13: {
                                if (var9 >= 0) {
                                  stackOut_28_0 = var9;
                                  stackIn_29_0 = stackOut_28_0;
                                  break L13;
                                } else {
                                  stackOut_27_0 = -var9;
                                  stackIn_29_0 = stackOut_27_0;
                                  break L13;
                                }
                              }
                              L14: {
                                var9 = stackIn_29_0;
                                if (var10 < 0) {
                                  stackOut_31_0 = -var10;
                                  stackIn_32_0 = stackOut_31_0;
                                  break L14;
                                } else {
                                  stackOut_30_0 = var10;
                                  stackIn_32_0 = stackOut_30_0;
                                  break L14;
                                }
                              }
                              L15: {
                                var10 = stackIn_32_0;
                                if (var9 <= var10) {
                                  stackOut_34_0 = var10;
                                  stackIn_35_0 = stackOut_34_0;
                                  break L15;
                                } else {
                                  stackOut_33_0 = var9;
                                  stackIn_35_0 = stackOut_33_0;
                                  break L15;
                                }
                              }
                              var11 = stackIn_35_0;
                              break L8;
                            }
                          } else {
                            var11 = var9 * var9 + var10 * var10 >> 12;
                            break L8;
                          }
                        }
                        L16: {
                          if (var11 >= pl.field_q) {
                            if (~hj.field_d >= ~var11) {
                              if (~hb.field_p < ~var11) {
                                fq.field_g = hb.field_p;
                                hb.field_p = var11;
                                break L16;
                              } else {
                                if (var11 < fq.field_g) {
                                  fq.field_g = var11;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                            } else {
                              fq.field_g = hb.field_p;
                              hb.field_p = hj.field_d;
                              hj.field_d = var11;
                              break L16;
                            }
                          } else {
                            fq.field_g = hb.field_p;
                            hb.field_p = hj.field_d;
                            hj.field_d = pl.field_q;
                            pl.field_q = var11;
                            break L16;
                          }
                        }
                        var7++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    final static void a(boolean param0, byte param1) {
        if (nj.field_b != null) {
            bi.d(bi.field_d, bi.field_f, bi.field_i - bi.field_d, bi.field_c + -bi.field_f);
            nj.field_b.b(param0, 0);
        }
    }

    public static void g() {
        field_L = null;
        field_K = null;
        field_P = null;
        field_J = null;
        field_M = null;
    }

    private final void b() {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        Random var5 = new Random((long)((dc) this).field_N);
        Random var2 = var5;
        ((dc) this).field_D = new short[512];
        if (((dc) this).field_H > 0) {
            for (var3 = 0; 512 > var3; var3++) {
                ((dc) this).field_D[var3] = (short)mj.a(-118, var5, ((dc) this).field_H);
            }
        }
        var3 = -25;
    }

    public dc() {
        super(0, true);
        ((dc) this).field_z = 1;
        ((dc) this).field_I = 5;
        ((dc) this).field_C = 2;
        ((dc) this).field_N = 0;
        ((dc) this).field_E = new byte[512];
        ((dc) this).field_D = new short[512];
        ((dc) this).field_H = 2048;
        ((dc) this).field_y = 5;
    }

    final static int a(int param0, String param1, byte param2, String[] param3, cc param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param4.c(param1);
              if (var5_int > param0) {
                break L1;
              } else {
                if (param1.indexOf("<br>") == -1) {
                  param3[0] = (String) (Object) param3;
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var6 = (-1 + (param0 + var5_int)) / param0;
              if (param2 > 5) {
                break L2;
              } else {
                field_L = null;
                break L2;
              }
            }
            param0 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            var9 = 0;
            L3: while (true) {
              if (var9 >= var8) {
                L4: {
                  if (var8 > var7) {
                    int incrementValue$2 = var6;
                    var6++;
                    param3[incrementValue$2] = param1.substring(var7, var8).trim();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_22_0 = var6;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param1.charAt(var9);
                    if (32 == var10) {
                      break L6;
                    } else {
                      if (var10 != 45) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var11 = param1.substring(var7, var9 + 1).trim();
                  var12 = param4.c(var11);
                  if (param0 <= var12) {
                    int incrementValue$3 = var6;
                    var6++;
                    param3[incrementValue$3] = var11;
                    var7 = 1 + var9;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (var10 != 62) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("dc.B(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
        return stackIn_23_0;
    }

    final void a(int param0) {
        ((dc) this).field_E = kk.a(((dc) this).field_N, (byte) 38);
        int discarded$0 = -111;
        this.b();
        if (param0 >= -98) {
            Object var3 = null;
            int discarded$1 = dc.a(-24, (String) null, (byte) -105, (String[]) null, (cc) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Members";
        field_J = null;
        field_B = true;
        field_K = "to return to the normal view.";
        field_O = 0;
    }
}
