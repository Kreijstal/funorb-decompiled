/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends wf {
    al[] field_f;
    short[] field_n;
    private int[] field_g;
    byte[] field_q;
    static ej field_j;
    byte[] field_k;
    dh[] field_o;
    int field_i;
    static oo field_m;
    byte[] field_e;
    static boolean field_p;
    static float[] field_h;
    static String field_l;

    final boolean a(byte[] param0, int[] param1, ob param2, int param3) {
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
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 1;
              if (param3 == 5193) {
                break L1;
              } else {
                this.field_f = (al[]) null;
                break L1;
              }
            }
            var6 = 0;
            var7 = null;
            var8 = 0;
            L2: while (true) {
              if (128 <= var8) {
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
                  var9 = this.field_g[var8];
                  if (var9 != 0) {
                    L5: {
                      if (var9 == var6) {
                        break L5;
                      } else {
                        L6: {
                          var6 = var9;
                          var9--;
                          if (-1 == (1 & var9 ^ -1)) {
                            var7 = param2.a(param1, var9 >> -226116030, (byte) 110);
                            break L6;
                          } else {
                            var7 = param2.a(var9 >> 610112706, param1, (byte) -92);
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
                      this.field_f[var8] = (al) (var7);
                      this.field_g[var8] = 0;
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
            stackOut_22_1 = new StringBuilder().append("ml.A(");
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
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
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
            if (param2 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final static void a(byte param0, wf param1, wf param2) {
        try {
            if (param2.field_c != null) {
                param2.c(-126);
            }
            param2.field_a = param1;
            param2.field_c = param1.field_c;
            param2.field_c.field_a = param2;
            if (param0 != -20) {
                field_m = (oo) null;
            }
            param2.field_a.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ml.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_j = null;
        field_h = null;
        if (param0 != 0) {
            ml.a(-90);
        }
        field_l = null;
    }

    final void a(boolean param0) {
        if (!param0) {
            return;
        }
        this.field_g = null;
    }

    ml(byte[] param0) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        dh dupTemp$17 = null;
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
        dh[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        dh var15 = null;
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
        rb var38 = null;
        byte[] var39 = null;
        dh var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        dh var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        dh var48 = null;
        dh var49 = null;
        dh var50 = null;
        dh var51 = null;
        dh var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        byte[] var59 = null;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_207_0 = null;
        StringBuilder stackIn_207_1 = null;
        RuntimeException stackIn_208_0 = null;
        StringBuilder stackIn_208_1 = null;
        RuntimeException stackIn_209_0 = null;
        StringBuilder stackIn_209_1 = null;
        String stackIn_209_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_38_0 = null;
        Object stackOut_37_0 = null;
        byte[] stackOut_41_0 = null;
        Object stackOut_40_0 = null;
        RuntimeException stackOut_206_0 = null;
        StringBuilder stackOut_206_1 = null;
        RuntimeException stackOut_208_0 = null;
        StringBuilder stackOut_208_1 = null;
        String stackOut_208_2 = null;
        RuntimeException stackOut_207_0 = null;
        StringBuilder stackOut_207_1 = null;
        String stackOut_207_2 = null;
        try {
          L0: {
            this.field_g = new int[128];
            this.field_e = new byte[128];
            this.field_k = new byte[128];
            this.field_f = new al[128];
            this.field_q = new byte[128];
            this.field_o = new dh[128];
            this.field_n = new short[128];
            var38 = new rb(param0);
            var3 = 0;
            L1: while (true) {
              if (var38.field_f[var3 + var38.field_g] == 0) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    var38.field_g = var38.field_g + 1;
                    var3++;
                    var5 = var38.field_g;
                    var38.field_g = var38.field_g + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (var38.field_f[var6 + var38.field_g] == 0) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var8 >= var6) {
                            var38.field_g = var38.field_g + 1;
                            var6++;
                            var8 = var38.field_g;
                            var38.field_g = var38.field_g + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (var38.field_f[var38.field_g - -var9] == 0) {
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
                                      if (-2 <= (var9 ^ -1)) {
                                        var12 = var9;
                                        break L7;
                                      } else {
                                        var53[1] = (byte) 1;
                                        var12 = 2;
                                        var13_int = 1;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var14 >= var9) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.g(-117);
                                              if (var15_int == 0) {
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
                                      }
                                    }
                                    var13 = new dh[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var13.length <= var14) {
                                        L12: {
                                          var14 = var38.g(90);
                                          if (0 < var14) {
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
                                          var14 = var38.g(82);
                                          if ((var14 ^ -1) < -1) {
                                            stackOut_41_0 = new byte[var14 * 2];
                                            stackIn_42_0 = stackOut_41_0;
                                            break L13;
                                          } else {
                                            stackOut_40_0 = null;
                                            stackIn_42_0 = (byte[]) ((Object) stackOut_40_0);
                                            break L13;
                                          }
                                        }
                                        var59 = stackIn_42_0;
                                        var47 = var59;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (var38.field_f[var17 + var38.field_g] == 0) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var17 <= var19) {
                                                var38.field_g = var38.field_g + 1;
                                                var17++;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (-129 >= (var20 ^ -1)) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if (128 <= var20) {
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
                                                              if (128 <= var24) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if (var25_int >= 128) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if ((var26 ^ -1) <= -129) {
                                                                        var20 = 0;
                                                                        var21 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (128 <= var27) {
                                                                            this.field_i = 1 + var38.g(-94);
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var27 >= var12) {
                                                                                L24: {
                                                                                  if (var15_array == null) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var27 >= var58.length) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15_array[var27] = var38.d(0);
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
                                                                                      if (var27 >= var59.length) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.d(0);
                                                                                        var27 += 2;
                                                                                        continue L27;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var27 >= var12) {
                                                                                    var27 = 0;
                                                                                    L29: while (true) {
                                                                                      if (var12 <= var27) {
                                                                                        L30: {
                                                                                          L31: {
                                                                                            if (var15_array != null) {
                                                                                              var19 = var38.g(123);
                                                                                              var15_array[0] = (byte)var19;
                                                                                              var27 = 2;
                                                                                              L32: while (true) {
                                                                                                if (var58.length <= var27) {
                                                                                                  var27 = var58[0];
                                                                                                  var28 = var58[1];
                                                                                                  var29 = 0;
                                                                                                  L33: while (true) {
                                                                                                    if (var27 <= var29) {
                                                                                                      var29 = 2;
                                                                                                      L34: while (true) {
                                                                                                        if (var58.length <= var29) {
                                                                                                          var15_array = null;
                                                                                                          var30 = var27;
                                                                                                          L35: while (true) {
                                                                                                            if ((var30 ^ -1) <= -129) {
                                                                                                              if (var16 == null) {
                                                                                                                break L30;
                                                                                                              } else {
                                                                                                                var19 = var38.g(38);
                                                                                                                var16[0] = (byte)var19;
                                                                                                                var27 = 2;
                                                                                                                L36: while (true) {
                                                                                                                  if (var59.length <= var27) {
                                                                                                                    break L31;
                                                                                                                  } else {
                                                                                                                    var19 = var19 - (-1 + -var38.g(-55));
                                                                                                                    var16[var27] = (byte)var19;
                                                                                                                    var27 += 2;
                                                                                                                    continue L36;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              this.field_k[var30] = (byte)(this.field_k[var30] * var28 + 32 >> 1234408486);
                                                                                                              var30++;
                                                                                                              continue L35;
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          var30 = var58[var29];
                                                                                                          var31 = var15_array[var29 - -1];
                                                                                                          var32 = (-var27 + var30) / 2 + (-var27 + var30) * var28;
                                                                                                          var33 = var27;
                                                                                                          L37: while (true) {
                                                                                                            if (var30 <= var33) {
                                                                                                              var29 += 2;
                                                                                                              var28 = var31;
                                                                                                              var27 = var30;
                                                                                                              continue L34;
                                                                                                            } else {
                                                                                                              var34 = oh.a(var30 + -var27, var32, (byte) -124);
                                                                                                              var32 = var32 + (var31 + -var28);
                                                                                                              this.field_k[var33] = (byte)(this.field_k[var33] * var34 + 32 >> 1264327462);
                                                                                                              var33++;
                                                                                                              continue L37;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      this.field_k[var29] = (byte)(this.field_k[var29] * var28 - -32 >> 1144007814);
                                                                                                      var29++;
                                                                                                      continue L33;
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  var19 = var38.g(-95) + 1 + var19;
                                                                                                  var15_array[var27] = (byte)var19;
                                                                                                  var27 += 2;
                                                                                                  continue L32;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              if (var16 == null) {
                                                                                                break L30;
                                                                                              } else {
                                                                                                var19 = var38.g(38);
                                                                                                var16[0] = (byte)var19;
                                                                                                var27 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var59.length <= var27) {
                                                                                                    break L31;
                                                                                                  } else {
                                                                                                    var19 = var19 - (-1 + -var38.g(-55));
                                                                                                    var16[var27] = (byte)var19;
                                                                                                    var27 += 2;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          var27 = var59[0];
                                                                                          var28 = var59[1] << -1993012127;
                                                                                          var29 = 0;
                                                                                          L39: while (true) {
                                                                                            if (var27 <= var29) {
                                                                                              var29 = 2;
                                                                                              L40: while (true) {
                                                                                                if (var59.length <= var29) {
                                                                                                  var30 = var27;
                                                                                                  L41: while (true) {
                                                                                                    if ((var30 ^ -1) <= -129) {
                                                                                                      var16 = null;
                                                                                                      break L30;
                                                                                                    } else {
                                                                                                      L42: {
                                                                                                        var31 = var28 + (this.field_q[var30] & 255);
                                                                                                        if (-1 >= (var31 ^ -1)) {
                                                                                                          break L42;
                                                                                                        } else {
                                                                                                          var31 = 0;
                                                                                                          break L42;
                                                                                                        }
                                                                                                      }
                                                                                                      L43: {
                                                                                                        if (-129 <= (var31 ^ -1)) {
                                                                                                          break L43;
                                                                                                        } else {
                                                                                                          var31 = 128;
                                                                                                          break L43;
                                                                                                        }
                                                                                                      }
                                                                                                      this.field_q[var30] = (byte)var31;
                                                                                                      var30++;
                                                                                                      continue L41;
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  var30 = var59[var29];
                                                                                                  var31 = var16[var29 + 1] << 2141425825;
                                                                                                  var32 = (var30 - var27) * var28 - -((-var27 + var30) / 2);
                                                                                                  var37 = var27;
                                                                                                  var33 = var37;
                                                                                                  L44: while (true) {
                                                                                                    if (var37 >= var30) {
                                                                                                      var27 = var30;
                                                                                                      var28 = var31;
                                                                                                      var29 += 2;
                                                                                                      continue L40;
                                                                                                    } else {
                                                                                                      L45: {
                                                                                                        var34 = oh.a(-var27 + var30, var32, (byte) 40);
                                                                                                        var35 = (this.field_q[var37] & 255) + var34;
                                                                                                        if (0 <= var35) {
                                                                                                          break L45;
                                                                                                        } else {
                                                                                                          var35 = 0;
                                                                                                          break L45;
                                                                                                        }
                                                                                                      }
                                                                                                      L46: {
                                                                                                        if (var35 <= 128) {
                                                                                                          break L46;
                                                                                                        } else {
                                                                                                          var35 = 128;
                                                                                                          break L46;
                                                                                                        }
                                                                                                      }
                                                                                                      this.field_q[var37] = (byte)var35;
                                                                                                      var32 = var32 + (-var28 + var31);
                                                                                                      var37++;
                                                                                                      continue L44;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              L47: {
                                                                                                var30 = var28 + (this.field_q[var29] & 255);
                                                                                                if ((var30 ^ -1) <= -1) {
                                                                                                  break L47;
                                                                                                } else {
                                                                                                  var30 = 0;
                                                                                                  break L47;
                                                                                                }
                                                                                              }
                                                                                              L48: {
                                                                                                if (var30 <= 128) {
                                                                                                  break L48;
                                                                                                } else {
                                                                                                  var30 = 128;
                                                                                                  break L48;
                                                                                                }
                                                                                              }
                                                                                              this.field_q[var29] = (byte)var30;
                                                                                              var29++;
                                                                                              continue L39;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27 = 0;
                                                                                        L49: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L50: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L51: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L52: while (true) {
                                                                                                      if (var12 <= var27) {
                                                                                                        var27 = 0;
                                                                                                        L53: while (true) {
                                                                                                          if (var12 <= var27) {
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            L54: {
                                                                                                              var52 = var13[var27];
                                                                                                              if (var52.field_j <= 0) {
                                                                                                                break L54;
                                                                                                              } else {
                                                                                                                var52.field_a = var38.g(59);
                                                                                                                break L54;
                                                                                                              }
                                                                                                            }
                                                                                                            var27++;
                                                                                                            continue L53;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        L55: {
                                                                                                          var51 = var13[var27];
                                                                                                          if (var51.field_i <= 0) {
                                                                                                            break L55;
                                                                                                          } else {
                                                                                                            var51.field_j = var38.g(82);
                                                                                                            break L55;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L52;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var13[var27].field_i = var38.g(-84);
                                                                                                    var27++;
                                                                                                    continue L51;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L56: {
                                                                                                  var50 = var13[var27];
                                                                                                  if (null == var50.field_g) {
                                                                                                    break L56;
                                                                                                  } else {
                                                                                                    var50.field_h = var38.g(-88);
                                                                                                    break L56;
                                                                                                  }
                                                                                                }
                                                                                                L57: {
                                                                                                  if (var50.field_e == null) {
                                                                                                    break L57;
                                                                                                  } else {
                                                                                                    var50.field_l = var38.g(108);
                                                                                                    break L57;
                                                                                                  }
                                                                                                }
                                                                                                L58: {
                                                                                                  if ((var50.field_b ^ -1) >= -1) {
                                                                                                    break L58;
                                                                                                  } else {
                                                                                                    var50.field_f = var38.g(-107);
                                                                                                    break L58;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L50;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_b = var38.g(-106);
                                                                                            var27++;
                                                                                            continue L49;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L59: {
                                                                                          var49 = var13[var27];
                                                                                          if (var49.field_g == null) {
                                                                                            break L59;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L60: while (true) {
                                                                                              if (var29 >= var49.field_g.length) {
                                                                                                break L59;
                                                                                              } else {
                                                                                                var19 = var19 - (-1 + -var38.g(-90));
                                                                                                var49.field_g[var29] = (byte)var19;
                                                                                                var29 += 2;
                                                                                                continue L60;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27++;
                                                                                        continue L29;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L61: {
                                                                                      var48 = var13[var27];
                                                                                      if (var48.field_e == null) {
                                                                                        break L61;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L62: while (true) {
                                                                                          if (var48.field_e.length <= var29) {
                                                                                            break L61;
                                                                                          } else {
                                                                                            var19 = 1 + var19 - -var38.g(123);
                                                                                            var48.field_e[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L62;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L63: {
                                                                                  var45 = var13[var27];
                                                                                  if (var45.field_g == null) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L64: while (true) {
                                                                                      if (var29 >= var45.field_g.length) {
                                                                                        break L63;
                                                                                      } else {
                                                                                        var45.field_g[var29] = var38.d(0);
                                                                                        var29 += 2;
                                                                                        continue L64;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L65: {
                                                                                  if (null == var45.field_e) {
                                                                                    break L65;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L66: while (true) {
                                                                                      if (var45.field_e.length - 2 <= var29) {
                                                                                        break L65;
                                                                                      } else {
                                                                                        var45.field_e[var29] = var38.d(0);
                                                                                        var29 += 2;
                                                                                        continue L66;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L23;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L67: {
                                                                              if (0 != var20) {
                                                                                break L67;
                                                                              } else {
                                                                                L68: {
                                                                                  if (var21 < var54.length) {
                                                                                    incrementValue$10 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$10];
                                                                                    break L68;
                                                                                  } else {
                                                                                    var20 = -1;
                                                                                    break L68;
                                                                                  }
                                                                                }
                                                                                if (0 >= this.field_g[var27]) {
                                                                                  break L67;
                                                                                } else {
                                                                                  var26 = var38.g(-91) + 1;
                                                                                  break L67;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_k[var27] = (byte)var26;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L69: {
                                                                          if (this.field_g[var26] == 0) {
                                                                            break L69;
                                                                          } else {
                                                                            L70: {
                                                                              if (-1 != (var20 ^ -1)) {
                                                                                break L70;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var21 < var57.length) {
                                                                                  incrementValue$11 = var21;
                                                                                  var21++;
                                                                                  var20 = var10[incrementValue$11];
                                                                                  break L70;
                                                                                } else {
                                                                                  var20 = -1;
                                                                                  break L70;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_o[var26] = (dh) (var25);
                                                                            var20--;
                                                                            break L69;
                                                                          }
                                                                        }
                                                                        var26++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L71: {
                                                                      if (this.field_g[var25_int] == 0) {
                                                                        break L71;
                                                                      } else {
                                                                        L72: {
                                                                          if (0 != var20) {
                                                                            break L72;
                                                                          } else {
                                                                            incrementValue$12 = var8;
                                                                            var8++;
                                                                            var24 = var38.field_f[incrementValue$12] - -16 << 2032411330;
                                                                            if (var56.length <= var21) {
                                                                              var20 = -1;
                                                                              break L72;
                                                                            } else {
                                                                              incrementValue$13 = var21;
                                                                              var21++;
                                                                              var20 = var7[incrementValue$13];
                                                                              break L72;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        this.field_q[var25_int] = (byte)var24;
                                                                        break L71;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L73: {
                                                                  if (0 == this.field_g[var24]) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (0 != var20) {
                                                                        break L74;
                                                                      } else {
                                                                        incrementValue$14 = var5;
                                                                        var5++;
                                                                        var23 = var38.field_f[incrementValue$14] + -1;
                                                                        if (var55.length > var21) {
                                                                          incrementValue$15 = var21;
                                                                          var21++;
                                                                          var20 = var4[incrementValue$15];
                                                                          break L74;
                                                                        } else {
                                                                          var20 = -1;
                                                                          break L74;
                                                                        }
                                                                      }
                                                                    }
                                                                    this.field_e[var24] = (byte)var23;
                                                                    var20--;
                                                                    break L73;
                                                                  }
                                                                }
                                                                var24++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L75: {
                                                              if (0 != var20) {
                                                                break L75;
                                                              } else {
                                                                L76: {
                                                                  if (var21 >= var54.length) {
                                                                    var20 = -1;
                                                                    break L76;
                                                                  } else {
                                                                    incrementValue$16 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$16];
                                                                    break L76;
                                                                  }
                                                                }
                                                                var22 = var38.a(127);
                                                                break L75;
                                                              }
                                                            }
                                                            this.field_n[var23] = (short)(this.field_n[var23] + pg.a(32768, -1 + var22 << -1776101938));
                                                            var20--;
                                                            this.field_g[var23] = var22;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.g(-113);
                                                        this.field_n[var20] = (short)(this.field_n[var20] + (var19 << -2097135448));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.g(-107);
                                                    this.field_n[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.d(0);
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
                                        L77: {
                                          dupTemp$17 = new dh();
                                          var13[var14] = dupTemp$17;
                                          var40 = dupTemp$17;
                                          var15 = var40;
                                          var16_int = var38.g(-60);
                                          if (var16_int <= 0) {
                                            break L77;
                                          } else {
                                            var15.field_g = new byte[var16_int * 2];
                                            break L77;
                                          }
                                        }
                                        L78: {
                                          var16_int = var38.g(71);
                                          if (var16_int <= 0) {
                                            break L78;
                                          } else {
                                            var15.field_e = new byte[2 * var16_int - -2];
                                            var40.field_e[1] = (byte)64;
                                            break L78;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.d(0);
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
                            var7[var8] = var38.d(0);
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
                    var4[var5] = var38.d(0);
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
          L79: {
            var2 = decompiledCaughtException;
            stackOut_206_0 = (RuntimeException) (var2);
            stackOut_206_1 = new StringBuilder().append("ml.<init>(");
            stackIn_208_0 = stackOut_206_0;
            stackIn_208_1 = stackOut_206_1;
            stackIn_207_0 = stackOut_206_0;
            stackIn_207_1 = stackOut_206_1;
            if (param0 == null) {
              stackOut_208_0 = (RuntimeException) ((Object) stackIn_208_0);
              stackOut_208_1 = (StringBuilder) ((Object) stackIn_208_1);
              stackOut_208_2 = "null";
              stackIn_209_0 = stackOut_208_0;
              stackIn_209_1 = stackOut_208_1;
              stackIn_209_2 = stackOut_208_2;
              break L79;
            } else {
              stackOut_207_0 = (RuntimeException) ((Object) stackIn_207_0);
              stackOut_207_1 = (StringBuilder) ((Object) stackIn_207_1);
              stackOut_207_2 = "{...}";
              stackIn_209_0 = stackOut_207_0;
              stackIn_209_1 = stackOut_207_1;
              stackIn_209_2 = stackOut_207_2;
              break L79;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_209_0), stackIn_209_2 + ')');
        }
    }

    static {
        field_j = new ej(15, 0, 1, 0);
        field_l = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_h = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }
}
