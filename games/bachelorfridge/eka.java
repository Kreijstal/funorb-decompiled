/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eka extends bw {
    be[] field_m;
    byte[] field_f;
    static String field_o;
    un[] field_l;
    byte[] field_i;
    static ee[][] field_g;
    int field_h;
    short[] field_n;
    byte[] field_j;
    private int[] field_k;

    final static void c(byte param0) {
        int discarded$0 = 0;
        if (param0 != -69) {
            discarded$0 = eka.a((byte) 30, 108);
        }
    }

    public static void a(int param0) {
        if (param0 <= 116) {
            eka.c((byte) 21);
        }
        field_g = (ee[][]) null;
        field_o = null;
    }

    final boolean a(byte[] param0, int param1, i param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var5_int = 1;
              var6 = 0;
              var7 = null;
              if (param1 == 1436234146) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            var8 = 0;
            L2: while (true) {
              if (-129 >= (var8 ^ -1)) {
                stackOut_20_0 = var5_int;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    if (param0 == null) {
                      break L4;
                    } else {
                      if (-1 != (param0[var8] ^ -1)) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9 = this.field_k[var8];
                  if (0 != var9) {
                    L5: {
                      if (var6 == var9) {
                        break L5;
                      } else {
                        L6: {
                          var6 = var9;
                          var9--;
                          if (0 != (var9 & 1)) {
                            var7 = param2.a(var9 >> -1010683390, (byte) 15, param3);
                            break L6;
                          } else {
                            var7 = param2.a(-52, param3, var9 >> 1436234146);
                            break L6;
                          }
                        }
                        if (var7 == null) {
                          var5_int = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var7 == null) {
                      break L3;
                    } else {
                      this.field_m[var8] = (be) (var7);
                      this.field_k[var8] = 0;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("eka.C(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          L9: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final static int a(byte param0, int param1) {
        if (param0 <= 81) {
            field_g = (ee[][]) null;
        }
        String var2 = lka.field_E[param1][6];
        var2 = var2.toLowerCase();
        var2 = var2.trim();
        ji var3 = (ji) ((Object) id.field_i.a(true, (long)var2.hashCode()));
        return var3.field_h;
    }

    eka(byte[] param0) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        un dupTemp$17 = null;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        un[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        un var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        lu var38 = null;
        byte[] var39 = null;
        un var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        un var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        un var48 = null;
        un var49 = null;
        un var50 = null;
        un var51 = null;
        un var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        RuntimeException stackIn_207_0 = null;
        StringBuilder stackIn_207_1 = null;
        RuntimeException stackIn_208_0 = null;
        StringBuilder stackIn_208_1 = null;
        String stackIn_208_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_38_0 = null;
        Object stackOut_37_0 = null;
        Object stackOut_41_0 = null;
        byte[] stackOut_40_0 = null;
        RuntimeException stackOut_205_0 = null;
        StringBuilder stackOut_205_1 = null;
        RuntimeException stackOut_207_0 = null;
        StringBuilder stackOut_207_1 = null;
        String stackOut_207_2 = null;
        RuntimeException stackOut_206_0 = null;
        StringBuilder stackOut_206_1 = null;
        String stackOut_206_2 = null;
        try {
          L0: {
            this.field_m = new be[128];
            this.field_l = new un[128];
            this.field_i = new byte[128];
            this.field_j = new byte[128];
            this.field_k = new int[128];
            this.field_f = new byte[128];
            this.field_n = new short[128];
            var38 = new lu(param0);
            var3 = 0;
            L1: while (true) {
              if (0 == var38.field_h[var3 + var38.field_g]) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    var3++;
                    var38.field_g = var38.field_g + 1;
                    var5 = var38.field_g;
                    var38.field_g = var38.field_g + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (-1 == (var38.field_h[var38.field_g + var6] ^ -1)) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var6 <= var8) {
                            var6++;
                            var38.field_g = var38.field_g + 1;
                            var8 = var38.field_g;
                            var38.field_g = var38.field_g + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (-1 == (var38.field_h[var38.field_g - -var9] ^ -1)) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var9 <= var11_int) {
                                    L7: {
                                      var9++;
                                      var38.field_g = var38.field_g + 1;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if (var9 > 1) {
                                        var53[1] = (byte) 1;
                                        var12 = 2;
                                        var13_int = 1;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var14 >= var9) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.b(16711935);
                                              if (-1 == (var15_int ^ -1)) {
                                                incrementValue$9 = var12;
                                                var12++;
                                                var13_int = incrementValue$9;
                                                break L9;
                                              } else {
                                                L10: {
                                                  if (var15_int > var13_int) {
                                                    break L10;
                                                  } else {
                                                    var15_int--;
                                                    break L10;
                                                  }
                                                }
                                                var13_int = var15_int;
                                                break L9;
                                              }
                                            }
                                            var11[var14] = (byte)var13_int;
                                            var14++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var12 = var9;
                                        break L7;
                                      }
                                    }
                                    var13 = new un[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var13.length <= var14) {
                                        L12: {
                                          var14 = var38.b(16711935);
                                          if ((var14 ^ -1) < -1) {
                                            stackOut_38_0 = new byte[2 * var14];
                                            stackIn_39_0 = stackOut_38_0;
                                            break L12;
                                          } else {
                                            stackOut_37_0 = null;
                                            stackIn_39_0 = (byte[]) ((Object) stackOut_37_0);
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var58 = stackIn_39_0;
                                          var46 = var58;
                                          var15_array = var46;
                                          var14 = var38.b(16711935);
                                          if (0 >= var14) {
                                            stackOut_41_0 = null;
                                            stackIn_42_0 = (byte[]) ((Object) stackOut_41_0);
                                            break L13;
                                          } else {
                                            stackOut_40_0 = new byte[var14 * 2];
                                            stackIn_42_0 = stackOut_40_0;
                                            break L13;
                                          }
                                        }
                                        var47 = stackIn_42_0;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (var38.field_h[var38.field_g + var17] == 0) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var19 >= var17) {
                                                var17++;
                                                var38.field_g = var38.field_g + 1;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (-129 >= (var20 ^ -1)) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if (var20 >= 128) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var22 = 0;
                                                        var23 = 0;
                                                        L18: while (true) {
                                                          if (var23 >= 128) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var23 = 0;
                                                            var24 = 0;
                                                            L19: while (true) {
                                                              if (var24 >= 128) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if ((var25_int ^ -1) <= -129) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if ((var26 ^ -1) <= -129) {
                                                                        var21 = 0;
                                                                        var20 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (128 <= var27) {
                                                                            this.field_h = var38.b(16711935) - -1;
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var12 <= var27) {
                                                                                L24: {
                                                                                  if (var15_array == null) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var27 >= var58.length) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15_array[var27] = var38.b(true);
                                                                                        var27 += 2;
                                                                                        continue L25;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L26: {
                                                                                  if (var16 == null) {
                                                                                    break L26;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L27: while (true) {
                                                                                      if (var27 >= var47.length) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.b(true);
                                                                                        var27 += 2;
                                                                                        continue L27;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var12 <= var27) {
                                                                                    var27 = 0;
                                                                                    L29: while (true) {
                                                                                      if (var27 >= var12) {
                                                                                        L30: {
                                                                                          if (var15_array == null) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var38.b(16711935);
                                                                                            var15_array[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L31: while (true) {
                                                                                              if (var58.length <= var27) {
                                                                                                var27 = var58[0];
                                                                                                var28 = var58[1];
                                                                                                var29 = 0;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L33: while (true) {
                                                                                                      if (var29 >= var58.length) {
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if (var30 >= 128) {
                                                                                                            var15_array = null;
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_i[var30] = (byte)(var28 * this.field_i[var30] + 32 >> 160103750);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var58[var29];
                                                                                                        var31 = var15_array[var29 - -1];
                                                                                                        var32 = (var30 - var27) / 2 + var28 * (var30 - var27);
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var33 >= var30) {
                                                                                                            var28 = var31;
                                                                                                            var29 += 2;
                                                                                                            var27 = var30;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = gd.a(var30 - var27, false, var32);
                                                                                                            this.field_i[var33] = (byte)(var34 * this.field_i[var33] - -32 >> 500821414);
                                                                                                            var32 = var32 + (var31 - var28);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_i[var29] = (byte)(32 + var28 * this.field_i[var29] >> 1101202982);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.b(16711935) + var19 - -1;
                                                                                                var15_array[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L36: {
                                                                                          if (var16 == null) {
                                                                                            break L36;
                                                                                          } else {
                                                                                            var19 = var38.b(16711935);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var47.length <= var27) {
                                                                                                var27 = var47[0];
                                                                                                var28 = var47[1] << 1122641057;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if (var47.length <= var29) {
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if ((var30 ^ -1) <= -129) {
                                                                                                            var16 = null;
                                                                                                            break L36;
                                                                                                          } else {
                                                                                                            L41: {
                                                                                                              var31 = var28 + (255 & this.field_f[var30]);
                                                                                                              if ((var31 ^ -1) <= -1) {
                                                                                                                break L41;
                                                                                                              } else {
                                                                                                                var31 = 0;
                                                                                                                break L41;
                                                                                                              }
                                                                                                            }
                                                                                                            L42: {
                                                                                                              if (-129 <= (var31 ^ -1)) {
                                                                                                                break L42;
                                                                                                              } else {
                                                                                                                var31 = 128;
                                                                                                                break L42;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_f[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var47[var29];
                                                                                                        var31 = var16[var29 - -1] << 492871137;
                                                                                                        var32 = (-var27 + var30) / 2 + (var30 + -var27) * var28;
                                                                                                        var37 = var27;
                                                                                                        var33 = var37;
                                                                                                        L43: while (true) {
                                                                                                          if (var30 <= var37) {
                                                                                                            var29 += 2;
                                                                                                            var28 = var31;
                                                                                                            var27 = var30;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L44: {
                                                                                                              var34 = gd.a(-var27 + var30, false, var32);
                                                                                                              var35 = (255 & this.field_f[var37]) + var34;
                                                                                                              if ((var35 ^ -1) <= -1) {
                                                                                                                break L44;
                                                                                                              } else {
                                                                                                                var35 = 0;
                                                                                                                break L44;
                                                                                                              }
                                                                                                            }
                                                                                                            L45: {
                                                                                                              if (128 >= var35) {
                                                                                                                break L45;
                                                                                                              } else {
                                                                                                                var35 = 128;
                                                                                                                break L45;
                                                                                                              }
                                                                                                            }
                                                                                                            var32 = var32 + (var31 - var28);
                                                                                                            this.field_f[var37] = (byte)var35;
                                                                                                            var37++;
                                                                                                            continue L43;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L46: {
                                                                                                      var30 = var28 + (255 & this.field_f[var29]);
                                                                                                      if ((var30 ^ -1) <= -1) {
                                                                                                        break L46;
                                                                                                      } else {
                                                                                                        var30 = 0;
                                                                                                        break L46;
                                                                                                      }
                                                                                                    }
                                                                                                    L47: {
                                                                                                      if ((var30 ^ -1) >= -129) {
                                                                                                        break L47;
                                                                                                      } else {
                                                                                                        var30 = 128;
                                                                                                        break L47;
                                                                                                      }
                                                                                                    }
                                                                                                    this.field_f[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.b(16711935) + 1 + var19;
                                                                                                var16[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var12 <= var27) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var12 <= var27) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                        var27 = 0;
                                                                                                        L52: while (true) {
                                                                                                          if (var12 <= var27) {
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            L53: {
                                                                                                              var52 = var13[var27];
                                                                                                              if ((var52.field_l ^ -1) >= -1) {
                                                                                                                break L53;
                                                                                                              } else {
                                                                                                                var52.field_g = var38.b(16711935);
                                                                                                                break L53;
                                                                                                              }
                                                                                                            }
                                                                                                            var27++;
                                                                                                            continue L52;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        L54: {
                                                                                                          var51 = var13[var27];
                                                                                                          if (0 >= var51.field_c) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var51.field_l = var38.b(16711935);
                                                                                                            break L54;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var13[var27].field_c = var38.b(16711935);
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L55: {
                                                                                                  var50 = var13[var27];
                                                                                                  if (var50.field_j == null) {
                                                                                                    break L55;
                                                                                                  } else {
                                                                                                    var50.field_d = var38.b(16711935);
                                                                                                    break L55;
                                                                                                  }
                                                                                                }
                                                                                                L56: {
                                                                                                  if (null == var50.field_b) {
                                                                                                    break L56;
                                                                                                  } else {
                                                                                                    var50.field_k = var38.b(16711935);
                                                                                                    break L56;
                                                                                                  }
                                                                                                }
                                                                                                L57: {
                                                                                                  if ((var50.field_e ^ -1) >= -1) {
                                                                                                    break L57;
                                                                                                  } else {
                                                                                                    var50.field_h = var38.b(16711935);
                                                                                                    break L57;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_e = var38.b(16711935);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L58: {
                                                                                          var49 = var13[var27];
                                                                                          if (var49.field_j == null) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L59: while (true) {
                                                                                              if (var29 >= var49.field_j.length) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var19 = var38.b(16711935) + var19 + 1;
                                                                                                var49.field_j[var29] = (byte)var19;
                                                                                                var29 += 2;
                                                                                                continue L59;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27++;
                                                                                        continue L29;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L60: {
                                                                                      var48 = var13[var27];
                                                                                      if (var48.field_b == null) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L61: while (true) {
                                                                                          if (var48.field_b.length <= var29) {
                                                                                            break L60;
                                                                                          } else {
                                                                                            var19 = var19 + (1 + var38.b(16711935));
                                                                                            var48.field_b[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L61;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L62: {
                                                                                  var45 = var13[var27];
                                                                                  if (null == var45.field_j) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L63: while (true) {
                                                                                      if (var45.field_j.length <= var29) {
                                                                                        break L62;
                                                                                      } else {
                                                                                        var45.field_j[var29] = var38.b(true);
                                                                                        var29 += 2;
                                                                                        continue L63;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L64: {
                                                                                  if (null == var45.field_b) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L65: while (true) {
                                                                                      if (var29 >= var45.field_b.length + -2) {
                                                                                        break L64;
                                                                                      } else {
                                                                                        var45.field_b[var29] = var38.b(true);
                                                                                        var29 += 2;
                                                                                        continue L65;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L23;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L66: {
                                                                              if (var20 != 0) {
                                                                                break L66;
                                                                              } else {
                                                                                L67: {
                                                                                  if (var21 >= var54.length) {
                                                                                    var20 = -1;
                                                                                    break L67;
                                                                                  } else {
                                                                                    incrementValue$10 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$10];
                                                                                    break L67;
                                                                                  }
                                                                                }
                                                                                if (0 >= this.field_k[var27]) {
                                                                                  break L66;
                                                                                } else {
                                                                                  var26 = var38.b(16711935) + 1;
                                                                                  break L66;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_i[var27] = (byte)var26;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L68: {
                                                                          if (this.field_k[var26] == 0) {
                                                                            break L68;
                                                                          } else {
                                                                            L69: {
                                                                              if (-1 != (var20 ^ -1)) {
                                                                                break L69;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var21 >= var57.length) {
                                                                                  var20 = -1;
                                                                                  break L69;
                                                                                } else {
                                                                                  incrementValue$11 = var21;
                                                                                  var21++;
                                                                                  var20 = var10[incrementValue$11];
                                                                                  break L69;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_l[var26] = (un) (var25);
                                                                            var20--;
                                                                            break L68;
                                                                          }
                                                                        }
                                                                        var26++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L70: {
                                                                      if (this.field_k[var25_int] == 0) {
                                                                        break L70;
                                                                      } else {
                                                                        L71: {
                                                                          if (-1 != (var20 ^ -1)) {
                                                                            break L71;
                                                                          } else {
                                                                            L72: {
                                                                              if (var56.length <= var21) {
                                                                                var20 = -1;
                                                                                break L72;
                                                                              } else {
                                                                                incrementValue$12 = var21;
                                                                                var21++;
                                                                                var20 = var7[incrementValue$12];
                                                                                break L72;
                                                                              }
                                                                            }
                                                                            incrementValue$13 = var8;
                                                                            var8++;
                                                                            var24 = var38.field_h[incrementValue$13] - -16 << -227506494;
                                                                            break L71;
                                                                          }
                                                                        }
                                                                        this.field_f[var25_int] = (byte)var24;
                                                                        var20--;
                                                                        break L70;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L73: {
                                                                  if (this.field_k[var24] == 0) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (-1 != (var20 ^ -1)) {
                                                                        break L74;
                                                                      } else {
                                                                        L75: {
                                                                          if (var55.length <= var21) {
                                                                            var20 = -1;
                                                                            break L75;
                                                                          } else {
                                                                            incrementValue$14 = var21;
                                                                            var21++;
                                                                            var20 = var4[incrementValue$14];
                                                                            break L75;
                                                                          }
                                                                        }
                                                                        incrementValue$15 = var5;
                                                                        var5++;
                                                                        var23 = var38.field_h[incrementValue$15] + -1;
                                                                        break L74;
                                                                      }
                                                                    }
                                                                    this.field_j[var24] = (byte)var23;
                                                                    var20--;
                                                                    break L73;
                                                                  }
                                                                }
                                                                var24++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L76: {
                                                              if (-1 != (var20 ^ -1)) {
                                                                break L76;
                                                              } else {
                                                                L77: {
                                                                  if (var54.length > var21) {
                                                                    incrementValue$16 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$16];
                                                                    break L77;
                                                                  } else {
                                                                    var20 = -1;
                                                                    break L77;
                                                                  }
                                                                }
                                                                var22 = var38.d(-1);
                                                                break L76;
                                                              }
                                                            }
                                                            this.field_n[var23] = (short)(this.field_n[var23] + (dda.a(2, var22 - 1) << 1944110478));
                                                            var20--;
                                                            this.field_k[var23] = var22;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.b(16711935);
                                                        this.field_n[var20] = (short)(this.field_n[var20] + (var19 << 1251289192));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.b(16711935);
                                                    this.field_n[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.b(true);
                                                var19++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var17++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        L78: {
                                          dupTemp$17 = new un();
                                          var13[var14] = dupTemp$17;
                                          var40 = dupTemp$17;
                                          var15 = var40;
                                          var16_int = var38.b(16711935);
                                          if (0 >= var16_int) {
                                            break L78;
                                          } else {
                                            var15.field_j = new byte[2 * var16_int];
                                            break L78;
                                          }
                                        }
                                        L79: {
                                          var16_int = var38.b(16711935);
                                          if (-1 <= (var16_int ^ -1)) {
                                            break L79;
                                          } else {
                                            var15.field_b = new byte[2 + 2 * var16_int];
                                            var40.field_b[1] = (byte)64;
                                            break L79;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.b(true);
                                    var11_int++;
                                    continue L6;
                                  }
                                }
                              } else {
                                var9++;
                                continue L5;
                              }
                            }
                          } else {
                            var7[var8] = var38.b(true);
                            var8++;
                            continue L4;
                          }
                        }
                      } else {
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    var4[var5] = var38.b(true);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L80: {
            var2 = decompiledCaughtException;
            stackOut_205_0 = (RuntimeException) (var2);
            stackOut_205_1 = new StringBuilder().append("eka.<init>(");
            stackIn_207_0 = stackOut_205_0;
            stackIn_207_1 = stackOut_205_1;
            stackIn_206_0 = stackOut_205_0;
            stackIn_206_1 = stackOut_205_1;
            if (param0 == null) {
              stackOut_207_0 = (RuntimeException) ((Object) stackIn_207_0);
              stackOut_207_1 = (StringBuilder) ((Object) stackIn_207_1);
              stackOut_207_2 = "null";
              stackIn_208_0 = stackOut_207_0;
              stackIn_208_1 = stackOut_207_1;
              stackIn_208_2 = stackOut_207_2;
              break L80;
            } else {
              stackOut_206_0 = (RuntimeException) ((Object) stackIn_206_0);
              stackOut_206_1 = (StringBuilder) ((Object) stackIn_206_1);
              stackOut_206_2 = "{...}";
              stackIn_208_0 = stackOut_206_0;
              stackIn_208_1 = stackOut_206_1;
              stackIn_208_2 = stackOut_206_2;
              break L80;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_208_0), stackIn_208_2 + ')');
        }
    }

    final void b(boolean param0) {
        this.field_k = null;
        if (param0) {
            eka.a(-113);
        }
    }

    final static void a(sna param0, int param1, sna param2) {
        if (param2.field_z == null) {
            param2.field_z = new eaa();
        }
        if (!(param0.field_z != null)) {
            param0.field_z = new eaa();
        }
        if (null == wja.field_m) {
            wja.field_m = new wma(64);
        }
        if (fq.field_s == null) {
            fq.field_s = new wma(64);
        }
        if (param1 > -45) {
            return;
        }
        try {
            es.field_j = param2.field_z;
            cca.field_v = param0.field_z;
            eo.c(-55);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "eka.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "You are invited to <%0>'s game.";
    }
}
