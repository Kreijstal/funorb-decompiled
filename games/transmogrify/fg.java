/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fg extends cj implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_k;
    static long field_j;
    private java.awt.image.ColorModel field_h;
    static int[] field_i;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static String a(String param0, ci param1, int param2, String param3, int param4) {
        RuntimeException var5 = null;
        int[] var6 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == 32389) {
                break L1;
              } else {
                var6 = (int[]) null;
                fg.a(61, 83, (byte) 125, 103, 62, -127, (int[]) null, -45);
                break L1;
              }
            }
            if (param1.a((byte) -127)) {
              stackOut_5_0 = param0 + " - " + param1.a(true, param2) + "%";
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = (String) (param3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("fg.H(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_k = param0;
            param0.setDimensions(this.field_d, this.field_g);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_h);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fg.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_k == param0) {
                this.field_k = null;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("fg.removeConsumer(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void d(byte param0) {
        if (!ge.field_x) {
          throw new IllegalStateException();
        } else {
          bg.field_n = true;
          n.a(false, false);
          if (param0 != 91) {
            return;
          } else {
            gl.field_y = 0;
            return;
          }
        }
    }

    private final synchronized void c(byte param0) {
        if (param0 != 28) {
            return;
        }
        if (!(this.field_k != null)) {
            return;
        }
        this.field_k.setPixels(0, 0, this.field_d, this.field_g, this.field_h, this.field_a, 0, this.field_d);
        this.field_k.imageComplete(2);
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        boolean discarded$0 = false;
        try {
            this.c((byte) 28);
            if (param0 != -32299) {
                java.awt.Component var6 = (java.awt.Component) null;
                this.a(8, -89, (java.awt.Component) null, (byte) 114);
            }
            discarded$0 = param2.drawImage(this.field_f, param1, param3, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fg.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int[] param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_112_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        String stackIn_136_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_111_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        String stackOut_135_2 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        String stackOut_134_2 = null;
        var33 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var8_int = param3 + param1 - 1;
              var9 = param0 + param5 + -1;
              var10 = param4 * param4;
              var11 = -param4 + param1;
              var12 = var8_int + param4;
              var13 = param0 - param4;
              var14 = param4 + var9;
              var15 = var13;
              if (var15 >= sb.field_e) {
                break L1;
              } else {
                var15 = sb.field_e;
                break L1;
              }
            }
            L2: {
              var16 = var15;
              var17 = var11;
              if (sb.field_d <= var17) {
                break L2;
              } else {
                var17 = sb.field_d;
                break L2;
              }
            }
            L3: {
              var18 = param1;
              if (var18 <= sb.field_b) {
                break L3;
              } else {
                var18 = sb.field_b;
                break L3;
              }
            }
            L4: {
              var19 = var8_int;
              if (sb.field_b < var19) {
                var19 = sb.field_b;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var20 = var12;
              if (var20 > sb.field_b) {
                var20 = sb.field_b;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var21 = (-var16 + param0 + 1) * (1 + -var16 + param0);
              var22 = (1 + param1 + -var17) * (-var17 + (param1 - -1));
              var23 = param0;
              if (sb.field_f >= var23) {
                break L6;
              } else {
                var23 = sb.field_f;
                break L6;
              }
            }
            L7: while (true) {
              stackOut_15_0 = var23;
              stackOut_15_1 = var16;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              L8: while (true) {
                L9: {
                  L10: {
                    if (stackIn_16_0 <= stackIn_16_1) {
                      break L10;
                    } else {
                      var21 = var21 + ((-param0 + var16 << 1677889697) - 1);
                      var24 = var17 + sb.field_c * var16;
                      var25 = var17;
                      stackOut_17_0 = var21 - -var22;
                      stackIn_37_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (var33 != 0) {
                        break L9;
                      } else {
                        var26 = stackIn_18_0;
                        L11: while (true) {
                          L12: {
                            if (var25 >= var18) {
                              break L12;
                            } else {
                              var26 = var26 + ((var25 + -param1 << -270157823) + -1);
                              stackOut_20_0 = var26;
                              stackOut_20_1 = var10;
                              stackIn_16_0 = stackOut_20_0;
                              stackIn_16_1 = stackOut_20_1;
                              stackIn_21_0 = stackOut_20_0;
                              stackIn_21_1 = stackOut_20_1;
                              if (var33 != 0) {
                                continue L8;
                              } else {
                                L13: {
                                  if (stackIn_21_0 <= stackIn_21_1) {
                                    var27 = var24;
                                    var28 = param6[(var10 + -var26) * param7 / var10];
                                    var29 = sb.field_h[var27];
                                    var30 = var29 + var28;
                                    var28 = (var29 & 16711935) + (var28 & 16711935);
                                    var29 = (16777472 & var28) + (var30 - var28 & 65536);
                                    sb.field_h[var27] = cl.b(-(var29 >>> -321382360) + var29, var30 - var29);
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                var24++;
                                var25++;
                                if (var33 == 0) {
                                  continue L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          var27 = param6[(var10 + -var21) * param7 / var10];
                          var26 = 1 + var21;
                          L14: while (true) {
                            L15: {
                              if (var25 >= var19) {
                                L16: while (true) {
                                  L17: {
                                    if (var25 >= var20) {
                                      break L17;
                                    } else {
                                      var26 = var26 + (-1 + (-var8_int + var25 << 1798921409));
                                      stackOut_31_0 = var10 ^ -1;
                                      stackOut_31_1 = var26 ^ -1;
                                      stackIn_16_0 = stackOut_31_0;
                                      stackIn_16_1 = stackOut_31_1;
                                      stackIn_32_0 = stackOut_31_0;
                                      stackIn_32_1 = stackOut_31_1;
                                      if (var33 != 0) {
                                        continue L8;
                                      } else {
                                        if (stackIn_32_0 > stackIn_32_1) {
                                          break L17;
                                        } else {
                                          var28 = var24;
                                          var29 = param6[param7 * (-var26 + var10) / var10];
                                          var30 = sb.field_h[var28];
                                          var31 = var30 + var29;
                                          var29 = (16711935 & var30) + (var29 & 16711935);
                                          var30 = (var29 & 16777472) + (var31 - var29 & 65536);
                                          sb.field_h[var28] = cl.b(-(var30 >>> 55419336) + var30, var31 - var30);
                                          var24++;
                                          var25++;
                                          continue L16;
                                        }
                                      }
                                    }
                                  }
                                  var16++;
                                  break L15;
                                }
                              } else {
                                var28 = var24;
                                var29 = var27;
                                var30 = sb.field_h[var28];
                                var31 = var30 + var29;
                                var29 = (var29 & 16711935) + (var30 & 16711935);
                                var30 = (16777472 & var29) + (65536 & -var29 + var31);
                                sb.field_h[var28] = cl.b(var30 + -(var30 >>> 2027212104), var31 - var30);
                                var24++;
                                var25++;
                                if (var33 != 0) {
                                  break L15;
                                } else {
                                  continue L14;
                                }
                              }
                            }
                            if (var33 == 0) {
                              continue L7;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                    }
                  }
                  var23 = param4 + param0;
                  stackOut_36_0 = var23 ^ -1;
                  stackIn_37_0 = stackOut_36_0;
                  break L9;
                }
                L18: {
                  if (stackIn_37_0 >= (sb.field_f ^ -1)) {
                    break L18;
                  } else {
                    var23 = sb.field_f;
                    break L18;
                  }
                }
                L19: {
                  if (param2 > 76) {
                    break L19;
                  } else {
                    field_j = 46L;
                    break L19;
                  }
                }
                L20: while (true) {
                  stackOut_41_0 = var23;
                  stackOut_41_1 = var16;
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  L21: while (true) {
                    L22: {
                      L23: {
                        if (stackIn_42_0 <= stackIn_42_1) {
                          break L23;
                        } else {
                          var21 = var21 + ((-param0 + var16 << 1430730785) + -1);
                          var24 = sb.field_c * var16 + var17;
                          var25 = var17;
                          stackOut_43_0 = var22;
                          stackIn_63_0 = stackOut_43_0;
                          stackIn_44_0 = stackOut_43_0;
                          if (var33 != 0) {
                            break L22;
                          } else {
                            var26 = stackIn_44_0;
                            if (var16 + (param1 - param0) <= var25) {
                              var27 = param6[param7 * (var10 - var21) / var10];
                              L24: while (true) {
                                L25: {
                                  L26: {
                                    if (var8_int + -var16 - -param0 <= var25) {
                                      break L26;
                                    } else {
                                      stackOut_49_0 = var25;
                                      stackOut_49_1 = sb.field_b;
                                      stackIn_55_0 = stackOut_49_0;
                                      stackIn_55_1 = stackOut_49_1;
                                      stackIn_50_0 = stackOut_49_0;
                                      stackIn_50_1 = stackOut_49_1;
                                      if (var33 != 0) {
                                        break L25;
                                      } else {
                                        L27: {
                                          if (stackIn_50_0 < stackIn_50_1) {
                                            var28 = var24;
                                            var29 = var27;
                                            var30 = sb.field_h[var28];
                                            var31 = var30 + var29;
                                            var29 = (16711935 & var29) + (var30 & 16711935);
                                            var30 = (-var29 + var31 & 65536) + (var29 & 16777472);
                                            sb.field_h[var28] = cl.b(-(var30 >>> -108879032) + var30, -var30 + var31);
                                            break L27;
                                          } else {
                                            break L27;
                                          }
                                        }
                                        var24++;
                                        var25++;
                                        if (var33 == 0) {
                                          continue L24;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_54_0 = var8_int - (var25 + -1);
                                  stackOut_54_1 = -var25 + var8_int - -1;
                                  stackIn_55_0 = stackOut_54_0;
                                  stackIn_55_1 = stackOut_54_1;
                                  break L25;
                                }
                                var26 = stackIn_55_0 * stackIn_55_1;
                                L28: while (true) {
                                  L29: {
                                    if (var25 >= var20) {
                                      var16++;
                                      break L29;
                                    } else {
                                      var26 = var26 + ((-var8_int + var25 << -476816703) + -1);
                                      var28 = var24;
                                      var29 = param6[param7 * (-var26 + var10) / var10];
                                      var30 = sb.field_h[var28];
                                      var31 = var30 + var29;
                                      var29 = (16711935 & var30) + (var29 & 16711935);
                                      var30 = (var29 & 16777472) - -(var31 + -var29 & 65536);
                                      sb.field_h[var28] = cl.b(var31 - var30, var30 - (var30 >>> 1935514952));
                                      var24++;
                                      var25++;
                                      if (var33 != 0) {
                                        break L29;
                                      } else {
                                        continue L28;
                                      }
                                    }
                                  }
                                  if (var33 == 0) {
                                    continue L20;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            } else {
                              var26 = var26 + ((var25 + -param1 << -1298665055) + -1);
                              stackOut_45_0 = var25 ^ -1;
                              stackOut_45_1 = sb.field_b ^ -1;
                              stackIn_42_0 = stackOut_45_0;
                              stackIn_42_1 = stackOut_45_1;
                              continue L21;
                            }
                          }
                        }
                      }
                      var23 = -param4 + var9;
                      stackOut_62_0 = var23 ^ -1;
                      stackIn_63_0 = stackOut_62_0;
                      break L22;
                    }
                    L30: {
                      if (stackIn_63_0 >= (sb.field_f ^ -1)) {
                        break L30;
                      } else {
                        var23 = sb.field_f;
                        break L30;
                      }
                    }
                    L31: {
                      var24 = -param4 + (param3 - param4 + -1);
                      if (var17 > param1 + param4) {
                        var24 = var24 + (param4 + param1 + -var17);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    L32: while (true) {
                      stackOut_68_0 = var16;
                      stackOut_68_1 = var23;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      L33: while (true) {
                        L34: {
                          if (stackIn_69_0 >= stackIn_69_1) {
                            var23 = var9;
                            var21 = (var9 + (-var16 - -1)) * (1 + -var16 + var9);
                            stackOut_83_0 = var23;
                            stackIn_84_0 = stackOut_83_0;
                            break L34;
                          } else {
                            var25 = var17 + var16 * sb.field_c;
                            var26 = var22;
                            stackOut_70_0 = var17;
                            stackIn_84_0 = stackOut_70_0;
                            stackIn_71_0 = stackOut_70_0;
                            if (var33 != 0) {
                              break L34;
                            } else {
                              var27 = stackIn_71_0;
                              L35: while (true) {
                                L36: {
                                  L37: {
                                    if (param1 + param4 <= var27) {
                                      break L37;
                                    } else {
                                      var26 = var26 + (-1 + (-param1 + var27 << -1244466495));
                                      stackOut_73_0 = sb.field_b ^ -1;
                                      stackOut_73_1 = var27 ^ -1;
                                      stackIn_79_0 = stackOut_73_0;
                                      stackIn_79_1 = stackOut_73_1;
                                      stackIn_74_0 = stackOut_73_0;
                                      stackIn_74_1 = stackOut_73_1;
                                      if (var33 != 0) {
                                        break L36;
                                      } else {
                                        L38: {
                                          if (stackIn_74_0 < stackIn_74_1) {
                                            var28 = var25;
                                            var29 = param6[(-var26 + var10) * param7 / var10];
                                            var30 = sb.field_h[var28];
                                            var31 = var30 + var29;
                                            var29 = (var29 & 16711935) + (var30 & 16711935);
                                            var30 = (var29 & 16777472) - -(65536 & -var29 + var31);
                                            sb.field_h[var28] = cl.b(var30 - (var30 >>> -1385613112), var31 + -var30);
                                            break L38;
                                          } else {
                                            break L38;
                                          }
                                        }
                                        var25++;
                                        var27++;
                                        if (var33 == 0) {
                                          continue L35;
                                        } else {
                                          break L37;
                                        }
                                      }
                                    }
                                  }
                                  var26 = 1 + (param4 + var10) - -param4;
                                  var25 = var25 + var24;
                                  stackOut_78_0 = var8_int;
                                  stackOut_78_1 = -param4;
                                  stackIn_79_0 = stackOut_78_0;
                                  stackIn_79_1 = stackOut_78_1;
                                  break L36;
                                }
                                var27 = stackIn_79_0 + stackIn_79_1;
                                if (var27 >= var20) {
                                  var16++;
                                  continue L32;
                                } else {
                                  var26 = var26 + (-1 + (-var8_int + var27 << 501491297));
                                  stackOut_80_0 = sb.field_d ^ -1;
                                  stackOut_80_1 = var27 ^ -1;
                                  stackIn_69_0 = stackOut_80_0;
                                  stackIn_69_1 = stackOut_80_1;
                                  continue L33;
                                }
                              }
                            }
                          }
                        }
                        L39: {
                          if (stackIn_84_0 > sb.field_f) {
                            var23 = sb.field_f;
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                        L40: while (true) {
                          stackOut_87_0 = var16;
                          stackOut_87_1 = var23;
                          stackIn_88_0 = stackOut_87_0;
                          stackIn_88_1 = stackOut_87_1;
                          L41: while (true) {
                            L42: {
                              L43: {
                                if (stackIn_88_0 >= stackIn_88_1) {
                                  break L43;
                                } else {
                                  var21 = var21 + ((-var9 + var16 << 783861889) + -1);
                                  var25 = sb.field_c * var16 + var17;
                                  var26 = var17;
                                  stackOut_89_0 = var22;
                                  stackIn_112_0 = stackOut_89_0;
                                  stackIn_90_0 = stackOut_89_0;
                                  if (var33 != 0) {
                                    break L42;
                                  } else {
                                    var27 = stackIn_90_0;
                                    L44: while (true) {
                                      L45: {
                                        if (var26 >= var9 + (-var16 + param1)) {
                                          break L45;
                                        } else {
                                          var27 = var27 + (-1 + (-param1 + var26 << -1144888671));
                                          stackOut_92_0 = var26 ^ -1;
                                          stackOut_92_1 = sb.field_b ^ -1;
                                          stackIn_88_0 = stackOut_92_0;
                                          stackIn_88_1 = stackOut_92_1;
                                          stackIn_93_0 = stackOut_92_0;
                                          stackIn_93_1 = stackOut_92_1;
                                          if (var33 != 0) {
                                            continue L41;
                                          } else {
                                            L46: {
                                              if (stackIn_93_0 > stackIn_93_1) {
                                                var28 = var25;
                                                var29 = param6[param7 * (var10 - var27) / var10];
                                                var30 = sb.field_h[var28];
                                                var31 = var29 + var30;
                                                var29 = (var29 & 16711935) - -(var30 & 16711935);
                                                var30 = (var31 - var29 & 65536) + (16777472 & var29);
                                                sb.field_h[var28] = cl.b(-var30 + var31, var30 + -(var30 >>> 649140840));
                                                break L46;
                                              } else {
                                                break L46;
                                              }
                                            }
                                            var25++;
                                            var26++;
                                            if (var33 == 0) {
                                              continue L44;
                                            } else {
                                              break L45;
                                            }
                                          }
                                        }
                                      }
                                      var28 = param6[(var10 - var21) * param7 / var10];
                                      L47: while (true) {
                                        L48: {
                                          L49: {
                                            if (var26 >= -var9 + var8_int - -var16) {
                                              break L49;
                                            } else {
                                              stackOut_99_0 = var26;
                                              stackOut_99_1 = sb.field_b;
                                              stackIn_104_0 = stackOut_99_0;
                                              stackIn_104_1 = stackOut_99_1;
                                              stackIn_100_0 = stackOut_99_0;
                                              stackIn_100_1 = stackOut_99_1;
                                              if (var33 != 0) {
                                                break L48;
                                              } else {
                                                L50: {
                                                  if (stackIn_100_0 >= stackIn_100_1) {
                                                    break L50;
                                                  } else {
                                                    var29 = var25;
                                                    var30 = var28;
                                                    var31 = sb.field_h[var29];
                                                    var32 = var31 + var30;
                                                    var30 = (var31 & 16711935) + (var30 & 16711935);
                                                    var31 = (16777472 & var30) + (65536 & var32 - var30);
                                                    sb.field_h[var29] = cl.b(var31 + -(var31 >>> 1025857608), -var31 + var32);
                                                    break L50;
                                                  }
                                                }
                                                var25++;
                                                var26++;
                                                if (var33 == 0) {
                                                  continue L47;
                                                } else {
                                                  break L49;
                                                }
                                              }
                                            }
                                          }
                                          stackOut_103_0 = 1 + var8_int - var26;
                                          stackOut_103_1 = -var26 + var8_int + 1;
                                          stackIn_104_0 = stackOut_103_0;
                                          stackIn_104_1 = stackOut_103_1;
                                          break L48;
                                        }
                                        var27 = stackIn_104_0 * stackIn_104_1;
                                        L51: while (true) {
                                          L52: {
                                            if (var26 >= var20) {
                                              var16++;
                                              break L52;
                                            } else {
                                              var27 = var27 + ((var26 - var8_int << 1680675873) + -1);
                                              var29 = var25;
                                              var30 = param6[param7 * (-var27 + var10) / var10];
                                              var31 = sb.field_h[var29];
                                              var32 = var30 - -var31;
                                              var30 = (16711935 & var31) + (16711935 & var30);
                                              var31 = (var30 & 16777472) + (-var30 + var32 & 65536);
                                              sb.field_h[var29] = cl.b(var31 - (var31 >>> -2007951192), -var31 + var32);
                                              var25++;
                                              var26++;
                                              if (var33 != 0) {
                                                break L52;
                                              } else {
                                                continue L51;
                                              }
                                            }
                                          }
                                          if (var33 == 0) {
                                            continue L40;
                                          } else {
                                            break L43;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var23 = var14;
                              stackOut_111_0 = sb.field_f;
                              stackIn_112_0 = stackOut_111_0;
                              break L42;
                            }
                            L53: {
                              if (stackIn_112_0 < var23) {
                                var23 = sb.field_f;
                                break L53;
                              } else {
                                break L53;
                              }
                            }
                            L54: while (true) {
                              stackOut_115_0 = var23;
                              stackOut_115_1 = var16;
                              stackIn_116_0 = stackOut_115_0;
                              stackIn_116_1 = stackOut_115_1;
                              L55: while (true) {
                                L56: {
                                  if (stackIn_116_0 <= stackIn_116_1) {
                                    break L56;
                                  } else {
                                    var25 = var17 + var16 * sb.field_c;
                                    var21 = var21 + ((-var9 + var16 << 980968193) + -1);
                                    var26 = var17;
                                    if (var33 != 0) {
                                      decompiledRegionSelector0 = 1;
                                      break L0;
                                    } else {
                                      var27 = var21 + var22;
                                      if (var26 >= var18) {
                                        var28 = param6[(-var21 + var10) * param7 / var10];
                                        var27 = var21 + 1;
                                        L57: while (true) {
                                          L58: {
                                            if (var19 <= var26) {
                                              L59: while (true) {
                                                L60: {
                                                  if (var20 <= var26) {
                                                    break L60;
                                                  } else {
                                                    var27 = var27 + (-1 + (-var8_int + var26 << -2000980191));
                                                    stackOut_127_0 = var27 ^ -1;
                                                    stackOut_127_1 = var10 ^ -1;
                                                    stackIn_116_0 = stackOut_127_0;
                                                    stackIn_116_1 = stackOut_127_1;
                                                    stackIn_128_0 = stackOut_127_0;
                                                    stackIn_128_1 = stackOut_127_1;
                                                    if (var33 != 0) {
                                                      continue L55;
                                                    } else {
                                                      if (stackIn_128_0 < stackIn_128_1) {
                                                        break L60;
                                                      } else {
                                                        var29 = var25;
                                                        var30 = param6[(var10 - var27) * param7 / var10];
                                                        var31 = sb.field_h[var29];
                                                        var32 = var30 + var31;
                                                        var30 = (16711935 & var31) + (var30 & 16711935);
                                                        var31 = (16777472 & var30) - -(-var30 + var32 & 65536);
                                                        sb.field_h[var29] = cl.b(var32 - var31, -(var31 >>> 433266888) + var31);
                                                        var25++;
                                                        var26++;
                                                        continue L59;
                                                      }
                                                    }
                                                  }
                                                }
                                                var16++;
                                                break L58;
                                              }
                                            } else {
                                              var29 = var25;
                                              var30 = var28;
                                              var31 = sb.field_h[var29];
                                              var32 = var31 + var30;
                                              var30 = (16711935 & var31) + (16711935 & var30);
                                              var31 = (var30 & 16777472) + (65536 & var32 - var30);
                                              sb.field_h[var29] = cl.b(-(var31 >>> 533496872) + var31, var32 - var31);
                                              var25++;
                                              var26++;
                                              if (var33 != 0) {
                                                break L58;
                                              } else {
                                                continue L57;
                                              }
                                            }
                                          }
                                          if (var33 == 0) {
                                            continue L54;
                                          } else {
                                            break L56;
                                          }
                                        }
                                      } else {
                                        var27 = var27 + ((var26 + -param1 << 279067809) + -1);
                                        stackOut_119_0 = var27;
                                        stackOut_119_1 = var10;
                                        stackIn_116_0 = stackOut_119_0;
                                        stackIn_116_1 = stackOut_119_1;
                                        continue L55;
                                      }
                                    }
                                  }
                                }
                                decompiledRegionSelector0 = 0;
                                break L0;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L61: {
            var8 = decompiledCaughtException;
            stackOut_133_0 = (RuntimeException) (var8);
            stackOut_133_1 = new StringBuilder().append("fg.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_135_0 = stackOut_133_0;
            stackIn_135_1 = stackOut_133_1;
            stackIn_134_0 = stackOut_133_0;
            stackIn_134_1 = stackOut_133_1;
            if (param6 == null) {
              stackOut_135_0 = (RuntimeException) ((Object) stackIn_135_0);
              stackOut_135_1 = (StringBuilder) ((Object) stackIn_135_1);
              stackOut_135_2 = "null";
              stackIn_136_0 = stackOut_135_0;
              stackIn_136_1 = stackOut_135_1;
              stackIn_136_2 = stackOut_135_2;
              break L61;
            } else {
              stackOut_134_0 = (RuntimeException) ((Object) stackIn_134_0);
              stackOut_134_1 = (StringBuilder) ((Object) stackIn_134_1);
              stackOut_134_2 = "{...}";
              stackIn_136_0 = stackOut_134_0;
              stackIn_136_1 = stackOut_134_1;
              stackIn_136_2 = stackOut_134_2;
              break L61;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_136_0), stackIn_136_2 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_k == param0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7);
            stackOut_2_1 = new StringBuilder().append("fg.imageUpdate(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, int param1, java.awt.Component param2, byte param3) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        try {
            this.field_d = param0;
            this.field_a = new int[1 + param0 * param1];
            this.field_g = param1;
            int var5_int = 101 / ((-90 - param3) / 34);
            this.field_h = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_f = param2.createImage((java.awt.image.ImageProducer) (this));
            this.c((byte) 28);
            discarded$0 = param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
            this.c((byte) 28);
            discarded$1 = param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
            this.c((byte) 28);
            discarded$2 = param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
            this.a(103);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        Object var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -56) {
                break L1;
              } else {
                field_j = -24L;
                break L1;
              }
            }
            var2 = (gd) ((Object) rh.field_r.a((byte) -95));
            L2: while (true) {
              L3: {
                L4: {
                  if (var2 == null) {
                    break L4;
                  } else {
                    ne.a((byte) 7, (gd) (var2), param1);
                    var2 = (gd) ((Object) rh.field_r.a(true));
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var2 = oc.field_G.a((byte) -95);
                break L3;
              }
              L5: while (true) {
                L6: {
                  if (var2 == null) {
                    break L6;
                  } else {
                    re.a(2, param1);
                    var2 = oc.field_G.a(true);
                    if (var3 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      if (var3 == 0) {
                        continue L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (var2), "fg.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fg.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_i = null;
        if (param0 <= 76) {
            field_j = 102L;
        }
    }

    fg() {
    }

    static {
        field_j = 20000000L;
        field_i = new int[]{25, 142, 50, 95, 101, 174, 185, 112, 125, 29, 66, 86, 3, 59, 2, 44, 177, 158, 116};
    }
}
