/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends gi {
    static String field_o;
    short[] field_p;
    int field_l;
    private int[] field_r;
    static int field_h;
    ri[] field_q;
    static vj field_t;
    byte[] field_m;
    vk[] field_j;
    byte[] field_s;
    static int field_k;
    static String field_i;
    byte[] field_n;

    final boolean a(int[] param0, int param1, cf param2, byte[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 1;
              if (param1 >= 98) {
                break L1;
              } else {
                this.field_q = (ri[]) null;
                break L1;
              }
            }
            var6 = 0;
            var7 = null;
            var8 = 0;
            L2: while (true) {
              if (var8 >= 128) {
                stackOut_21_0 = var5_int;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    if (param3 == null) {
                      break L4;
                    } else {
                      if (-1 != (param3[var8] ^ -1)) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9 = this.field_r[var8];
                  if (-1 != (var9 ^ -1)) {
                    L5: {
                      if (var9 != var6) {
                        L6: {
                          var6 = var9;
                          var9--;
                          if ((1 & var9) != 0) {
                            var7 = param2.a(256, var9 >> -1822546110, param0);
                            break L6;
                          } else {
                            var7 = param2.a(param0, var9 >> 2049151682, 1);
                            break L6;
                          }
                        }
                        if (var7 != null) {
                          break L5;
                        } else {
                          var5_int = 0;
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    if (var7 != null) {
                      this.field_j[var8] = (vk) (var7);
                      this.field_r[var8] = 0;
                      break L3;
                    } else {
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
            stackOut_23_0 = (RuntimeException) (var5);
            stackOut_23_1 = new StringBuilder().append("ig.A(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          L9: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        return stackIn_22_0 != 0;
    }

    final static int a(int param0, byte param1) {
        if (param1 != -121) {
            return 89;
        }
        param0 = ((param0 & -1431655765) >>> -1168237663) + (1431655765 & param0);
        param0 = (param0 & 858993459) + ((param0 & -858993458) >>> 2071495490);
        param0 = 252645135 & param0 - -(param0 >>> 1170859684);
        param0 = param0 + (param0 >>> 1789222312);
        param0 = param0 + (param0 >>> 1686503024);
        return param0 & 255;
    }

    final static int a(byte param0) {
        if (param0 <= 77) {
            return -29;
        }
        return vi.field_e;
    }

    public static void e(int param0) {
        field_o = null;
        if (param0 != -15877) {
            return;
        }
        field_i = null;
        field_t = null;
    }

    final void d(int param0) {
        this.field_r = null;
        if (param0 <= 66) {
            this.field_n = (byte[]) null;
        }
    }

    ig(byte[] param0) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        ri dupTemp$17 = null;
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
        ri[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        ri var15 = null;
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
        od var38 = null;
        byte[] var39 = null;
        ri var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        ri var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        ri var48 = null;
        ri var49 = null;
        ri var50 = null;
        ri var51 = null;
        ri var52 = null;
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
            this.field_j = new vk[128];
            this.field_p = new short[128];
            this.field_m = new byte[128];
            this.field_s = new byte[128];
            this.field_n = new byte[128];
            this.field_q = new ri[128];
            this.field_r = new int[128];
            var38 = new od(param0);
            var3 = 0;
            L1: while (true) {
              if (-1 == (var38.field_h[var3 + var38.field_j] ^ -1)) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    var38.field_j = var38.field_j + 1;
                    var3++;
                    var5 = var38.field_j;
                    var38.field_j = var38.field_j + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (var38.field_h[var38.field_j - -var6] == 0) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var6 <= var8) {
                            var6++;
                            var38.field_j = var38.field_j + 1;
                            var8 = var38.field_j;
                            var38.field_j = var38.field_j + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (0 == var38.field_h[var38.field_j - -var9]) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var11_int >= var9) {
                                    L7: {
                                      var38.field_j = var38.field_j + 1;
                                      var9++;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if (-2 > (var9 ^ -1)) {
                                        var53[1] = (byte) 1;
                                        var12 = 2;
                                        var13_int = 1;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var9 <= var14) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.l(31760);
                                              if (-1 != (var15_int ^ -1)) {
                                                L10: {
                                                  if (var13_int < var15_int) {
                                                    break L10;
                                                  } else {
                                                    var15_int--;
                                                    break L10;
                                                  }
                                                }
                                                var13_int = var15_int;
                                                break L9;
                                              } else {
                                                incrementValue$9 = var12;
                                                var12++;
                                                var13_int = incrementValue$9;
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
                                    var13 = new ri[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var14 >= var13.length) {
                                        L12: {
                                          var14 = var38.l(31760);
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
                                          var14 = var38.l(31760);
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
                                          if (0 == var38.field_h[var17 + var38.field_j]) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var19 >= var17) {
                                                var17++;
                                                var38.field_j = var38.field_j + 1;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if ((var20 ^ -1) <= -129) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if ((var20 ^ -1) <= -129) {
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
                                                              if ((var24 ^ -1) <= -129) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if (-129 >= (var25_int ^ -1)) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if (128 <= var26) {
                                                                        var20 = 0;
                                                                        var21 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= 128) {
                                                                            this.field_l = 1 + var38.l(31760);
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
                                                                                        var15_array[var27] = var38.n(95);
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
                                                                                      if (var47.length <= var27) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.n(-96);
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
                                                                                          L31: {
                                                                                            if (var15_array != null) {
                                                                                              var19 = var38.l(31760);
                                                                                              var15_array[0] = (byte)var19;
                                                                                              var27 = 2;
                                                                                              L32: while (true) {
                                                                                                if (var27 >= var58.length) {
                                                                                                  var27 = var58[0];
                                                                                                  var28 = var58[1];
                                                                                                  var29 = 0;
                                                                                                  L33: while (true) {
                                                                                                    if (var29 >= var27) {
                                                                                                      var29 = 2;
                                                                                                      L34: while (true) {
                                                                                                        if (var29 >= var58.length) {
                                                                                                          var15_array = null;
                                                                                                          var30 = var27;
                                                                                                          L35: while (true) {
                                                                                                            if (-129 >= (var30 ^ -1)) {
                                                                                                              if (var16 == null) {
                                                                                                                break L30;
                                                                                                              } else {
                                                                                                                var19 = var38.l(31760);
                                                                                                                var16[0] = (byte)var19;
                                                                                                                var27 = 2;
                                                                                                                L36: while (true) {
                                                                                                                  if (var27 >= var47.length) {
                                                                                                                    break L31;
                                                                                                                  } else {
                                                                                                                    var19 = var38.l(31760) + 1 + var19;
                                                                                                                    var16[var27] = (byte)var19;
                                                                                                                    var27 += 2;
                                                                                                                    continue L36;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              this.field_m[var30] = (byte)(this.field_m[var30] * var28 + 32 >> -1184934810);
                                                                                                              var30++;
                                                                                                              continue L35;
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          var30 = var58[var29];
                                                                                                          var31 = var15_array[var29 - -1];
                                                                                                          var32 = var28 * (-var27 + var30) - -((var30 + -var27) / 2);
                                                                                                          var33 = var27;
                                                                                                          L37: while (true) {
                                                                                                            if (var33 >= var30) {
                                                                                                              var29 += 2;
                                                                                                              var27 = var30;
                                                                                                              var28 = var31;
                                                                                                              continue L34;
                                                                                                            } else {
                                                                                                              var34 = sj.a(-64, var30 - var27, var32);
                                                                                                              this.field_m[var33] = (byte)(var34 * this.field_m[var33] - -32 >> -266015610);
                                                                                                              var32 = var32 + (var31 - var28);
                                                                                                              var33++;
                                                                                                              continue L37;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      this.field_m[var29] = (byte)(var28 * this.field_m[var29] - -32 >> -1277617434);
                                                                                                      var29++;
                                                                                                      continue L33;
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  var19 = var19 + 1 + var38.l(31760);
                                                                                                  var15_array[var27] = (byte)var19;
                                                                                                  var27 += 2;
                                                                                                  continue L32;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              if (var16 == null) {
                                                                                                break L30;
                                                                                              } else {
                                                                                                var19 = var38.l(31760);
                                                                                                var16[0] = (byte)var19;
                                                                                                var27 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var27 >= var47.length) {
                                                                                                    break L31;
                                                                                                  } else {
                                                                                                    var19 = var38.l(31760) + 1 + var19;
                                                                                                    var16[var27] = (byte)var19;
                                                                                                    var27 += 2;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          var27 = var47[0];
                                                                                          var28 = var47[1] << 1395367553;
                                                                                          var29 = 0;
                                                                                          L39: while (true) {
                                                                                            if (var29 >= var27) {
                                                                                              var29 = 2;
                                                                                              L40: while (true) {
                                                                                                if (var29 >= var47.length) {
                                                                                                  var16 = null;
                                                                                                  var30 = var27;
                                                                                                  L41: while (true) {
                                                                                                    if ((var30 ^ -1) <= -129) {
                                                                                                      break L30;
                                                                                                    } else {
                                                                                                      L42: {
                                                                                                        var31 = (this.field_s[var30] & 255) + var28;
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
                                                                                                      this.field_s[var30] = (byte)var31;
                                                                                                      var30++;
                                                                                                      continue L41;
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  var30 = var47[var29];
                                                                                                  var31 = var16[1 + var29] << -136191167;
                                                                                                  var32 = (var30 - var27) * var28 + (-var27 + var30) / 2;
                                                                                                  var37 = var27;
                                                                                                  var33 = var37;
                                                                                                  L44: while (true) {
                                                                                                    if (var30 <= var37) {
                                                                                                      var29 += 2;
                                                                                                      var28 = var31;
                                                                                                      var27 = var30;
                                                                                                      continue L40;
                                                                                                    } else {
                                                                                                      L45: {
                                                                                                        var34 = sj.a(-79, -var27 + var30, var32);
                                                                                                        var35 = var34 + (this.field_s[var37] & 255);
                                                                                                        if (0 <= var35) {
                                                                                                          break L45;
                                                                                                        } else {
                                                                                                          var35 = 0;
                                                                                                          break L45;
                                                                                                        }
                                                                                                      }
                                                                                                      L46: {
                                                                                                        if (128 >= var35) {
                                                                                                          break L46;
                                                                                                        } else {
                                                                                                          var35 = 128;
                                                                                                          break L46;
                                                                                                        }
                                                                                                      }
                                                                                                      var32 = var32 + (-var28 + var31);
                                                                                                      this.field_s[var37] = (byte)var35;
                                                                                                      var37++;
                                                                                                      continue L44;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              L47: {
                                                                                                var30 = var28 + (255 & this.field_s[var29]);
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
                                                                                              this.field_s[var29] = (byte)var30;
                                                                                              var29++;
                                                                                              continue L39;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27 = 0;
                                                                                        L49: while (true) {
                                                                                          if (var12 <= var27) {
                                                                                            var27 = 0;
                                                                                            L50: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L51: while (true) {
                                                                                                  if (var12 <= var27) {
                                                                                                    var27 = 0;
                                                                                                    L52: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                        var27 = 0;
                                                                                                        L53: while (true) {
                                                                                                          if (var12 <= var27) {
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            L54: {
                                                                                                              var52 = var13[var27];
                                                                                                              if (0 >= var52.field_l) {
                                                                                                                break L54;
                                                                                                              } else {
                                                                                                                var52.field_p = var38.l(31760);
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
                                                                                                          if (0 >= var51.field_k) {
                                                                                                            break L55;
                                                                                                          } else {
                                                                                                            var51.field_l = var38.l(31760);
                                                                                                            break L55;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L52;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var13[var27].field_k = var38.l(31760);
                                                                                                    var27++;
                                                                                                    continue L51;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L56: {
                                                                                                  var50 = var13[var27];
                                                                                                  if (var50.field_a == null) {
                                                                                                    break L56;
                                                                                                  } else {
                                                                                                    var50.field_n = var38.l(31760);
                                                                                                    break L56;
                                                                                                  }
                                                                                                }
                                                                                                L57: {
                                                                                                  if (null == var50.field_m) {
                                                                                                    break L57;
                                                                                                  } else {
                                                                                                    var50.field_g = var38.l(31760);
                                                                                                    break L57;
                                                                                                  }
                                                                                                }
                                                                                                L58: {
                                                                                                  if (0 >= var50.field_i) {
                                                                                                    break L58;
                                                                                                  } else {
                                                                                                    var50.field_j = var38.l(31760);
                                                                                                    break L58;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L50;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_i = var38.l(31760);
                                                                                            var27++;
                                                                                            continue L49;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L59: {
                                                                                          var49 = var13[var27];
                                                                                          if (var49.field_a == null) {
                                                                                            break L59;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L60: while (true) {
                                                                                              if (var49.field_a.length <= var29) {
                                                                                                break L59;
                                                                                              } else {
                                                                                                var19 = var38.l(31760) + (1 + var19);
                                                                                                var49.field_a[var29] = (byte)var19;
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
                                                                                      if (var48.field_m == null) {
                                                                                        break L61;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L62: while (true) {
                                                                                          if (var29 >= var48.field_m.length) {
                                                                                            break L61;
                                                                                          } else {
                                                                                            var19 = 1 + (var19 - -var38.l(31760));
                                                                                            var48.field_m[var29] = (byte)var19;
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
                                                                                  if (var45.field_a == null) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L64: while (true) {
                                                                                      if (var45.field_a.length <= var29) {
                                                                                        break L63;
                                                                                      } else {
                                                                                        var45.field_a[var29] = var38.n(-109);
                                                                                        var29 += 2;
                                                                                        continue L64;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L65: {
                                                                                  if (null == var45.field_m) {
                                                                                    break L65;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L66: while (true) {
                                                                                      if (var29 >= var45.field_m.length - 2) {
                                                                                        break L65;
                                                                                      } else {
                                                                                        var45.field_m[var29] = var38.n(-115);
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
                                                                              if (-1 != (var20 ^ -1)) {
                                                                                break L67;
                                                                              } else {
                                                                                L68: {
                                                                                  if (var54.length > var21) {
                                                                                    incrementValue$10 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$10];
                                                                                    break L68;
                                                                                  } else {
                                                                                    var20 = -1;
                                                                                    break L68;
                                                                                  }
                                                                                }
                                                                                if (this.field_r[var27] <= 0) {
                                                                                  break L67;
                                                                                } else {
                                                                                  var26 = var38.l(31760) + 1;
                                                                                  break L67;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_m[var27] = (byte)var26;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L69: {
                                                                          if (0 == this.field_r[var26]) {
                                                                            break L69;
                                                                          } else {
                                                                            L70: {
                                                                              if (0 != var20) {
                                                                                break L70;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var21 >= var57.length) {
                                                                                  var20 = -1;
                                                                                  break L70;
                                                                                } else {
                                                                                  incrementValue$11 = var21;
                                                                                  var21++;
                                                                                  var20 = var10[incrementValue$11];
                                                                                  break L70;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_q[var26] = (ri) (var25);
                                                                            break L69;
                                                                          }
                                                                        }
                                                                        var26++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L71: {
                                                                      if (-1 == (this.field_r[var25_int] ^ -1)) {
                                                                        break L71;
                                                                      } else {
                                                                        L72: {
                                                                          if (var20 != 0) {
                                                                            break L72;
                                                                          } else {
                                                                            incrementValue$12 = var8;
                                                                            var8++;
                                                                            var24 = 16 + var38.field_h[incrementValue$12] << -1182454238;
                                                                            if (var21 >= var56.length) {
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
                                                                        this.field_s[var25_int] = (byte)var24;
                                                                        var20--;
                                                                        break L71;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L73: {
                                                                  if (this.field_r[var24] == 0) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (var20 != 0) {
                                                                        break L74;
                                                                      } else {
                                                                        incrementValue$14 = var5;
                                                                        var5++;
                                                                        var23 = -1 + var38.field_h[incrementValue$14];
                                                                        if (var21 < var55.length) {
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
                                                                    var20--;
                                                                    this.field_n[var24] = (byte)var23;
                                                                    break L73;
                                                                  }
                                                                }
                                                                var24++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L75: {
                                                              if (var20 != 0) {
                                                                break L75;
                                                              } else {
                                                                L76: {
                                                                  if (var21 < var54.length) {
                                                                    incrementValue$16 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$16];
                                                                    break L76;
                                                                  } else {
                                                                    var20 = -1;
                                                                    break L76;
                                                                  }
                                                                }
                                                                var22 = var38.c((byte) 58);
                                                                break L75;
                                                              }
                                                            }
                                                            this.field_p[var23] = (short)(this.field_p[var23] + rk.a(32768, var22 + -1 << 328554638));
                                                            this.field_r[var23] = var22;
                                                            var20--;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.l(31760);
                                                        this.field_p[var20] = (short)(this.field_p[var20] + (var19 << 1249033480));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.l(31760);
                                                    this.field_p[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.n(89);
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
                                          dupTemp$17 = new ri();
                                          var13[var14] = dupTemp$17;
                                          var40 = dupTemp$17;
                                          var15 = var40;
                                          var16_int = var38.l(31760);
                                          if ((var16_int ^ -1) >= -1) {
                                            break L77;
                                          } else {
                                            var15.field_a = new byte[var16_int * 2];
                                            break L77;
                                          }
                                        }
                                        L78: {
                                          var16_int = var38.l(31760);
                                          if ((var16_int ^ -1) >= -1) {
                                            break L78;
                                          } else {
                                            var15.field_m = new byte[2 + 2 * var16_int];
                                            var40.field_m[1] = (byte)64;
                                            break L78;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.n(125);
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
                            var7[var8] = var38.n(108);
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
                    var4[var5] = var38.n(124);
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
            stackOut_205_0 = (RuntimeException) (var2);
            stackOut_205_1 = new StringBuilder().append("ig.<init>(");
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
              break L79;
            } else {
              stackOut_206_0 = (RuntimeException) ((Object) stackIn_206_0);
              stackOut_206_1 = (StringBuilder) ((Object) stackIn_206_1);
              stackOut_206_2 = "{...}";
              stackIn_208_0 = stackOut_206_0;
              stackIn_208_1 = stackOut_206_1;
              stackIn_208_2 = stackOut_206_2;
              break L79;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_208_0), stackIn_208_2 + ')');
        }
    }

    static {
        field_o = "Loading sound effects";
        field_i = "Unfortunately you are not eligible to create an account.";
    }
}
