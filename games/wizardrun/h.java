/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends wl {
    private int[] field_i;
    static o[] field_j;
    byte[] field_q;
    static long field_m;
    static int[] field_s;
    static volatile int field_p;
    byte[] field_l;
    short[] field_r;
    int field_n;
    je[] field_k;
    byte[] field_o;
    q[] field_t;

    final boolean a(byte[] param0, ue param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
        var11 = wizardrun.field_H;
        try {
          L0: {
            var6 = -67 % ((59 - param2) / 57);
            var5_int = 1;
            var7 = 0;
            var8 = null;
            var9 = 0;
            L1: while (true) {
              if (var9 >= 128) {
                stackOut_18_0 = var5_int;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    if (param0 == null) {
                      break L3;
                    } else {
                      if (param0[var9] == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var10 = this.field_i[var9];
                  if (var10 == 0) {
                    break L2;
                  } else {
                    L4: {
                      if (var10 != var7) {
                        L5: {
                          var7 = var10;
                          var10--;
                          if ((1 & var10) == 0) {
                            var8 = param1.b(-32480, param3, var10 >> -93786526);
                            break L5;
                          } else {
                            var8 = param1.a(19830, param3, var10 >> -897229502);
                            break L5;
                          }
                        }
                        if (var8 == null) {
                          var5_int = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    if (var8 == null) {
                      break L2;
                    } else {
                      this.field_k[var9] = (je) (var8);
                      this.field_i[var9] = 0;
                      break L2;
                    }
                  }
                }
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("h.E(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
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
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final static boolean b(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (-11 < (ml.field_t ^ -1)) {
                break L1;
              } else {
                if (qb.field_p) {
                  break L1;
                } else {
                  if (wj.a(0)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final static boolean a(int param0, int param1, kl param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param3 <= -113) {
              var5 = param2.a(param1, param0, 1);
              var4 = var5;
              if (var5 != null) {
                jg.a(var5, true);
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4_ref);
            stackOut_8_1 = new StringBuilder().append("h.B(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0 != 0;
          }
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        boolean discarded$0 = false;
        int var4 = 0;
        if (!(!param0)) {
            var4 += 4;
        }
        if (param3 != 26505) {
            kl var5 = (kl) null;
            discarded$0 = h.a(-70, -30, (kl) null, 2);
        }
        if (!(!param2)) {
            var4 += 2;
        }
        if (!(!param1)) {
            var4++;
        }
        return ia.field_p[var4];
    }

    final void a(int param0) {
        int var2 = -16 / ((param0 - 53) / 58);
        this.field_i = null;
    }

    public static void c(boolean param0) {
        boolean discarded$0 = false;
        if (!param0) {
            kl var2 = (kl) null;
            discarded$0 = h.a(109, -121, (kl) null, -59);
        }
        field_j = null;
        field_s = null;
    }

    h(byte[] param0) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        q dupTemp$17 = null;
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
        q[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        q var15 = null;
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
        va var38 = null;
        byte[] var39 = null;
        q var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        q var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        q var48 = null;
        q var49 = null;
        q var50 = null;
        q var51 = null;
        q var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
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
        Object stackOut_38_0 = null;
        byte[] stackOut_37_0 = null;
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
            this.field_r = new short[128];
            this.field_l = new byte[128];
            this.field_q = new byte[128];
            this.field_i = new int[128];
            this.field_o = new byte[128];
            this.field_k = new je[128];
            this.field_t = new q[128];
            var38 = new va(param0);
            var3 = 0;
            L1: while (true) {
              if (var38.field_k[var3 + var38.field_m] == 0) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    var38.field_m = var38.field_m + 1;
                    var3++;
                    var5 = var38.field_m;
                    var38.field_m = var38.field_m + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (-1 == (var38.field_k[var6 + var38.field_m] ^ -1)) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var6 <= var8) {
                            var38.field_m = var38.field_m + 1;
                            var6++;
                            var8 = var38.field_m;
                            var38.field_m = var38.field_m + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (0 == var38.field_k[var9 + var38.field_m]) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var11_int >= var9) {
                                    L7: {
                                      var38.field_m = var38.field_m + 1;
                                      var9++;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if (1 < var9) {
                                        var53[1] = (byte) 1;
                                        var13_int = 1;
                                        var12 = 2;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var14 >= var9) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.f(255);
                                              if (0 == var15_int) {
                                                incrementValue$9 = var12;
                                                var12++;
                                                var13_int = incrementValue$9;
                                                break L9;
                                              } else {
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
                                    var13 = new q[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var13.length <= var14) {
                                        L12: {
                                          var14 = var38.f(255);
                                          if ((var14 ^ -1) >= -1) {
                                            stackOut_38_0 = null;
                                            stackIn_39_0 = (byte[]) ((Object) stackOut_38_0);
                                            break L12;
                                          } else {
                                            stackOut_37_0 = new byte[2 * var14];
                                            stackIn_39_0 = stackOut_37_0;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var46 = stackIn_39_0;
                                          var15_array = var46;
                                          var14 = var38.f(255);
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
                                        var58 = stackIn_42_0;
                                        var47 = var58;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (var38.field_k[var17 + var38.field_m] == 0) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var19 >= var17) {
                                                var17++;
                                                var38.field_m = var38.field_m + 1;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if ((var20 ^ -1) <= -129) {
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
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var23 = 0;
                                                            var24 = 0;
                                                            L19: while (true) {
                                                              if ((var24 ^ -1) <= -129) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if (128 <= var25_int) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if (var26 >= 128) {
                                                                        var20 = 0;
                                                                        var21 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if ((var27 ^ -1) <= -129) {
                                                                            this.field_n = 1 + var38.f(255);
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var27 >= var12) {
                                                                                L24: {
                                                                                  if (var15_array == null) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var27 >= var46.length) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15_array[var27] = var38.k(0);
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
                                                                                      if (var58.length <= var27) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.k(0);
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
                                                                                              var19 = var38.f(255);
                                                                                              var15_array[0] = (byte)var19;
                                                                                              var27 = 2;
                                                                                              L32: while (true) {
                                                                                                if (var46.length <= var27) {
                                                                                                  var27 = var46[0];
                                                                                                  var28 = var46[1];
                                                                                                  var29 = 0;
                                                                                                  L33: while (true) {
                                                                                                    if (var27 <= var29) {
                                                                                                      var29 = 2;
                                                                                                      L34: while (true) {
                                                                                                        if (var29 >= var46.length) {
                                                                                                          var15_array = null;
                                                                                                          var30 = var27;
                                                                                                          L35: while (true) {
                                                                                                            if (128 <= var30) {
                                                                                                              if (var16 == null) {
                                                                                                                break L30;
                                                                                                              } else {
                                                                                                                var19 = var38.f(255);
                                                                                                                var16[0] = (byte)var19;
                                                                                                                var27 = 2;
                                                                                                                L36: while (true) {
                                                                                                                  if (var27 >= var58.length) {
                                                                                                                    break L31;
                                                                                                                  } else {
                                                                                                                    var19 = var38.f(255) + 1 + var19;
                                                                                                                    var16[var27] = (byte)var19;
                                                                                                                    var27 += 2;
                                                                                                                    continue L36;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              this.field_q[var30] = (byte)(var28 * this.field_q[var30] - -32 >> 27916070);
                                                                                                              var30++;
                                                                                                              continue L35;
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          var30 = var46[var29];
                                                                                                          var31 = var15_array[var29 + 1];
                                                                                                          var32 = (var30 + -var27) / 2 + (-var27 + var30) * var28;
                                                                                                          var33 = var27;
                                                                                                          L37: while (true) {
                                                                                                            if (var30 <= var33) {
                                                                                                              var28 = var31;
                                                                                                              var27 = var30;
                                                                                                              var29 += 2;
                                                                                                              continue L34;
                                                                                                            } else {
                                                                                                              var34 = pf.a(var32, 115, -var27 + var30);
                                                                                                              var32 = var32 + (var31 + -var28);
                                                                                                              this.field_q[var33] = (byte)(32 + this.field_q[var33] * var34 >> 311521446);
                                                                                                              var33++;
                                                                                                              continue L37;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      this.field_q[var29] = (byte)(32 + var28 * this.field_q[var29] >> -929684538);
                                                                                                      var29++;
                                                                                                      continue L33;
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  var19 = var38.f(255) + var19 - -1;
                                                                                                  var15_array[var27] = (byte)var19;
                                                                                                  var27 += 2;
                                                                                                  continue L32;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              if (var16 == null) {
                                                                                                break L30;
                                                                                              } else {
                                                                                                var19 = var38.f(255);
                                                                                                var16[0] = (byte)var19;
                                                                                                var27 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var27 >= var58.length) {
                                                                                                    break L31;
                                                                                                  } else {
                                                                                                    var19 = var38.f(255) + 1 + var19;
                                                                                                    var16[var27] = (byte)var19;
                                                                                                    var27 += 2;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          var27 = var58[0];
                                                                                          var28 = var58[1] << -913840639;
                                                                                          var29 = 0;
                                                                                          L39: while (true) {
                                                                                            if (var27 <= var29) {
                                                                                              var29 = 2;
                                                                                              L40: while (true) {
                                                                                                if (var29 >= var58.length) {
                                                                                                  var16 = null;
                                                                                                  var30 = var27;
                                                                                                  L41: while (true) {
                                                                                                    if (var30 >= 128) {
                                                                                                      break L30;
                                                                                                    } else {
                                                                                                      L42: {
                                                                                                        var31 = var28 + (this.field_o[var30] & 255);
                                                                                                        if (0 <= var31) {
                                                                                                          break L42;
                                                                                                        } else {
                                                                                                          var31 = 0;
                                                                                                          break L42;
                                                                                                        }
                                                                                                      }
                                                                                                      L43: {
                                                                                                        if (var31 <= 128) {
                                                                                                          break L43;
                                                                                                        } else {
                                                                                                          var31 = 128;
                                                                                                          break L43;
                                                                                                        }
                                                                                                      }
                                                                                                      this.field_o[var30] = (byte)var31;
                                                                                                      var30++;
                                                                                                      continue L41;
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  var30 = var58[var29];
                                                                                                  var31 = var16[1 + var29] << -375453663;
                                                                                                  var32 = var28 * (-var27 + var30) + (var30 - var27) / 2;
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
                                                                                                        var34 = pf.a(var32, 125, -var27 + var30);
                                                                                                        var35 = var34 + (this.field_o[var37] & 255);
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
                                                                                                      this.field_o[var37] = (byte)var35;
                                                                                                      var32 = var32 + (var31 - var28);
                                                                                                      var37++;
                                                                                                      continue L44;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              L47: {
                                                                                                var30 = (this.field_o[var29] & 255) - -var28;
                                                                                                if (var30 >= 0) {
                                                                                                  break L47;
                                                                                                } else {
                                                                                                  var30 = 0;
                                                                                                  break L47;
                                                                                                }
                                                                                              }
                                                                                              L48: {
                                                                                                if (-129 <= (var30 ^ -1)) {
                                                                                                  break L48;
                                                                                                } else {
                                                                                                  var30 = 128;
                                                                                                  break L48;
                                                                                                }
                                                                                              }
                                                                                              this.field_o[var29] = (byte)var30;
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
                                                                                                          if (var27 >= var12) {
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            L54: {
                                                                                                              var52 = var13[var27];
                                                                                                              if ((var52.field_e ^ -1) >= -1) {
                                                                                                                break L54;
                                                                                                              } else {
                                                                                                                var52.field_a = var38.f(255);
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
                                                                                                          if (-1 <= (var51.field_k ^ -1)) {
                                                                                                            break L55;
                                                                                                          } else {
                                                                                                            var51.field_e = var38.f(255);
                                                                                                            break L55;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L52;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var13[var27].field_k = var38.f(255);
                                                                                                    var27++;
                                                                                                    continue L51;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L56: {
                                                                                                  var50 = var13[var27];
                                                                                                  if (null == var50.field_f) {
                                                                                                    break L56;
                                                                                                  } else {
                                                                                                    var50.field_i = var38.f(255);
                                                                                                    break L56;
                                                                                                  }
                                                                                                }
                                                                                                L57: {
                                                                                                  if (null == var50.field_c) {
                                                                                                    break L57;
                                                                                                  } else {
                                                                                                    var50.field_j = var38.f(255);
                                                                                                    break L57;
                                                                                                  }
                                                                                                }
                                                                                                L58: {
                                                                                                  if ((var50.field_h ^ -1) >= -1) {
                                                                                                    break L58;
                                                                                                  } else {
                                                                                                    var50.field_d = var38.f(255);
                                                                                                    break L58;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L50;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_h = var38.f(255);
                                                                                            var27++;
                                                                                            continue L49;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L59: {
                                                                                          var49 = var13[var27];
                                                                                          if (null == var49.field_f) {
                                                                                            break L59;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L60: while (true) {
                                                                                              if (var49.field_f.length <= var29) {
                                                                                                break L59;
                                                                                              } else {
                                                                                                var19 = var19 + (1 + var38.f(255));
                                                                                                var49.field_f[var29] = (byte)var19;
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
                                                                                      if (null == var48.field_c) {
                                                                                        break L61;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L62: while (true) {
                                                                                          if (var29 >= var48.field_c.length) {
                                                                                            break L61;
                                                                                          } else {
                                                                                            var19 = var38.f(255) + (1 + var19);
                                                                                            var48.field_c[var29] = (byte)var19;
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
                                                                                  if (null == var45.field_f) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L64: while (true) {
                                                                                      if (var29 >= var45.field_f.length) {
                                                                                        break L63;
                                                                                      } else {
                                                                                        var45.field_f[var29] = var38.k(0);
                                                                                        var29 += 2;
                                                                                        continue L64;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L65: {
                                                                                  if (null == var45.field_c) {
                                                                                    break L65;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L66: while (true) {
                                                                                      if (var29 >= -2 + var45.field_c.length) {
                                                                                        break L65;
                                                                                      } else {
                                                                                        var45.field_c[var29] = var38.k(0);
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
                                                                              if (var20 != 0) {
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
                                                                                if (0 >= this.field_i[var27]) {
                                                                                  break L67;
                                                                                } else {
                                                                                  var26 = 1 + var38.f(255);
                                                                                  break L67;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_q[var27] = (byte)var26;
                                                                            var20--;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L69: {
                                                                          if (this.field_i[var26] == 0) {
                                                                            break L69;
                                                                          } else {
                                                                            L70: {
                                                                              if (var20 != 0) {
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
                                                                            this.field_t[var26] = (q) (var25);
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
                                                                      if (-1 == (this.field_i[var25_int] ^ -1)) {
                                                                        break L71;
                                                                      } else {
                                                                        L72: {
                                                                          if (var20 != 0) {
                                                                            break L72;
                                                                          } else {
                                                                            incrementValue$12 = var8;
                                                                            var8++;
                                                                            var24 = var38.field_k[incrementValue$12] - -16 << -2021932958;
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
                                                                        this.field_o[var25_int] = (byte)var24;
                                                                        break L71;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L73: {
                                                                  if (-1 == (this.field_i[var24] ^ -1)) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (0 != var20) {
                                                                        break L74;
                                                                      } else {
                                                                        L75: {
                                                                          if (var21 >= var55.length) {
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
                                                                        var23 = -1 + var38.field_k[incrementValue$15];
                                                                        break L74;
                                                                      }
                                                                    }
                                                                    this.field_l[var24] = (byte)var23;
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
                                                                  if (var21 < var54.length) {
                                                                    incrementValue$16 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$16];
                                                                    break L77;
                                                                  } else {
                                                                    var20 = -1;
                                                                    break L77;
                                                                  }
                                                                }
                                                                var22 = var38.f((byte) -90);
                                                                break L76;
                                                              }
                                                            }
                                                            this.field_r[var23] = (short)(this.field_r[var23] + kl.b(32768, -1 + var22 << 4300814));
                                                            this.field_i[var23] = var22;
                                                            var20--;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.f(255);
                                                        this.field_r[var20] = (short)(this.field_r[var20] + (var19 << -564480888));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.f(255);
                                                    this.field_r[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.k(0);
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
                                          dupTemp$17 = new q();
                                          var13[var14] = dupTemp$17;
                                          var40 = dupTemp$17;
                                          var15 = var40;
                                          var16_int = var38.f(255);
                                          if (-1 <= (var16_int ^ -1)) {
                                            break L78;
                                          } else {
                                            var15.field_f = new byte[2 * var16_int];
                                            break L78;
                                          }
                                        }
                                        L79: {
                                          var16_int = var38.f(255);
                                          if ((var16_int ^ -1) >= -1) {
                                            break L79;
                                          } else {
                                            var15.field_c = new byte[var16_int * 2 + 2];
                                            var40.field_c[1] = (byte)64;
                                            break L79;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.k(0);
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
                            var7[var8] = var38.k(0);
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
                    var4[var5] = var38.k(0);
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
            stackOut_206_0 = (RuntimeException) (var2);
            stackOut_206_1 = new StringBuilder().append("h.<init>(");
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
              break L80;
            } else {
              stackOut_207_0 = (RuntimeException) ((Object) stackIn_207_0);
              stackOut_207_1 = (StringBuilder) ((Object) stackIn_207_1);
              stackOut_207_2 = "{...}";
              stackIn_209_0 = stackOut_207_0;
              stackIn_209_1 = stackOut_207_1;
              stackIn_209_2 = stackOut_207_2;
              break L80;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_209_0), stackIn_209_2 + ')');
        }
    }

    static {
        field_p = 0;
    }
}
