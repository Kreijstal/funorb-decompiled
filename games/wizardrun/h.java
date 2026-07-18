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
                  var10 = ((h) this).field_i[var9];
                  if (var10 == 0) {
                    break L2;
                  } else {
                    L4: {
                      if (var10 != var7) {
                        L5: {
                          var7 = var10;
                          var10--;
                          if ((1 & var10) == 0) {
                            var8 = (Object) (Object) param1.b(-32480, param3, var10 >> 2);
                            break L5;
                          } else {
                            var8 = (Object) (Object) param1.a(19830, param3, var10 >> 2);
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
                      ((h) this).field_k[var9] = (je) var8;
                      ((h) this).field_i[var9] = 0;
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
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("h.E(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final static boolean b() {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            if (ml.field_t < 10) {
              break L1;
            } else {
              if (qb.field_p) {
                break L1;
              } else {
                if (wj.a(0)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_5_0 != 0;
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
                int discarded$2 = 1;
                jg.a(var5);
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("h.B(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        if (!(!param0)) {
            var4 += 4;
        }
        if (param3 != 26505) {
            Object var5 = null;
            boolean discarded$0 = h.a(-70, -30, (kl) null, 2);
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
        ((h) this).field_i = null;
    }

    public static void c() {
        field_j = null;
        field_s = null;
    }

    h(byte[] param0) {
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
        byte[] var59 = null;
        byte[] var60 = null;
        byte[] var61 = null;
        byte[] var62 = null;
        byte[] var63 = null;
        byte[] var64 = null;
        byte[] var65 = null;
        byte[] var66 = null;
        byte[] var67 = null;
        byte[] var68 = null;
        byte[] var69 = null;
        byte[] var70 = null;
        byte[] stackIn_38_0 = null;
        byte[] stackIn_41_0 = null;
        Object stackOut_37_0 = null;
        byte[] stackOut_36_0 = null;
        byte[] stackOut_40_0 = null;
        Object stackOut_39_0 = null;
        ((h) this).field_r = new short[128];
        ((h) this).field_l = new byte[128];
        ((h) this).field_q = new byte[128];
        ((h) this).field_i = new int[128];
        ((h) this).field_o = new byte[128];
        ((h) this).field_k = new je[128];
        ((h) this).field_t = new q[128];
        var38 = new va(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_k[var3 + var38.field_m] == 0) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var38.field_m = var38.field_m + 1;
                var3++;
                var5 = var38.field_m;
                var38.field_m = var38.field_m + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_k[var6 + var38.field_m] == 0) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var6 <= var8) {
                        var38.field_m = var38.field_m + 1;
                        var6++;
                        var8 = var38.field_m;
                        var38.field_m = var38.field_m + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (0 == var38.field_k[var9 + var38.field_m]) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (~var11_int <= ~var9) {
                                L6: {
                                  var38.field_m = var38.field_m + 1;
                                  var9++;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if (1 < var9) {
                                    var65[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (~var14 <= ~var9) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.f(255);
                                          if (0 == var15_int) {
                                            int incrementValue$9 = var12;
                                            var12++;
                                            var13_int = incrementValue$9;
                                            break L8;
                                          } else {
                                            L9: {
                                              if (~var13_int > ~var15_int) {
                                                break L9;
                                              } else {
                                                var15_int--;
                                                break L9;
                                              }
                                            }
                                            var13_int = var15_int;
                                            break L8;
                                          }
                                        }
                                        var11[var14] = (byte)var13_int;
                                        var14++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    var12 = var9;
                                    break L6;
                                  }
                                }
                                var13 = new q[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.f(255);
                                      if (var14 <= 0) {
                                        stackOut_37_0 = null;
                                        stackIn_38_0 = (byte[]) (Object) stackOut_37_0;
                                        break L11;
                                      } else {
                                        stackOut_36_0 = new byte[2 * var14];
                                        stackIn_38_0 = stackOut_36_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var46 = stackIn_38_0;
                                      var15_array = var46;
                                      var14 = var38.f(255);
                                      if (var14 > 0) {
                                        stackOut_40_0 = new byte[var14 * 2];
                                        stackIn_41_0 = stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var70 = stackIn_41_0;
                                    var64 = var70;
                                    var58 = var64;
                                    var47 = var58;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (var38.field_k[var17 + var38.field_m] == 0) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (~var19 <= ~var17) {
                                            var17++;
                                            var38.field_m = var38.field_m + 1;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (var20 >= 128) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (128 <= var20) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (var23 >= 128) {
                                                        var21 = 0;
                                                        var20 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 >= 128) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (128 <= var25_int) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (var26 >= 128) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (var27 >= 128) {
                                                                        ((h) this).field_n = 1 + var38.f(255);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (~var27 <= ~var12) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (~var27 <= ~var46.length) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.k(0);
                                                                                    var27 += 2;
                                                                                    continue L24;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L25: {
                                                                              if (var16 == null) {
                                                                                break L25;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L26: while (true) {
                                                                                  if (~var70.length >= ~var27) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.k(0);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if (var27 >= var12) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var12 <= var27) {
                                                                                    L29: {
                                                                                      L30: {
                                                                                        if (var15_array != null) {
                                                                                          var19 = var38.f(255);
                                                                                          var15_array[0] = (byte)var19;
                                                                                          var27 = 2;
                                                                                          L31: while (true) {
                                                                                            if (~var46.length >= ~var27) {
                                                                                              var27 = var46[0];
                                                                                              var28 = var46[1];
                                                                                              var29 = 0;
                                                                                              L32: while (true) {
                                                                                                if (~var27 >= ~var29) {
                                                                                                  var29 = 2;
                                                                                                  L33: while (true) {
                                                                                                    if (var29 >= var46.length) {
                                                                                                      var15_array = null;
                                                                                                      var30 = var27;
                                                                                                      L34: while (true) {
                                                                                                        if (128 <= var30) {
                                                                                                          if (var16 == null) {
                                                                                                            break L29;
                                                                                                          } else {
                                                                                                            var19 = var38.f(255);
                                                                                                            var16[0] = (byte)var19;
                                                                                                            var27 = 2;
                                                                                                            L35: while (true) {
                                                                                                              if (~var27 <= ~var70.length) {
                                                                                                                break L30;
                                                                                                              } else {
                                                                                                                var19 = var38.f(255) + 1 + var19;
                                                                                                                var16[var27] = (byte)var19;
                                                                                                                var27 += 2;
                                                                                                                continue L35;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          ((h) this).field_q[var30] = (byte)(var28 * ((h) this).field_q[var30] - -32 >> 6);
                                                                                                          var30++;
                                                                                                          continue L34;
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      var30 = var46[var29];
                                                                                                      var31 = var15_array[var29 + 1];
                                                                                                      var32 = (var30 + -var27) / 2 + (-var27 + var30) * var28;
                                                                                                      var33 = var27;
                                                                                                      L36: while (true) {
                                                                                                        if (~var30 >= ~var33) {
                                                                                                          var28 = var31;
                                                                                                          var27 = var30;
                                                                                                          var29 += 2;
                                                                                                          continue L33;
                                                                                                        } else {
                                                                                                          var34 = pf.a(var32, 115, -var27 + var30);
                                                                                                          var32 = var32 + (var31 + -var28);
                                                                                                          ((h) this).field_q[var33] = (byte)(32 + ((h) this).field_q[var33] * var34 >> 6);
                                                                                                          var33++;
                                                                                                          continue L36;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  ((h) this).field_q[var29] = (byte)(32 + var28 * ((h) this).field_q[var29] >> 6);
                                                                                                  var29++;
                                                                                                  continue L32;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              var19 = var38.f(255) + var19 - -1;
                                                                                              var15_array[var27] = (byte)var19;
                                                                                              var27 += 2;
                                                                                              continue L31;
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          if (var16 == null) {
                                                                                            break L29;
                                                                                          } else {
                                                                                            var19 = var38.f(255);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (~var27 <= ~var70.length) {
                                                                                                break L30;
                                                                                              } else {
                                                                                                var19 = var38.f(255) + 1 + var19;
                                                                                                var16[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      var27 = var70[0];
                                                                                      var28 = var70[1] << 1;
                                                                                      var29 = 0;
                                                                                      L38: while (true) {
                                                                                        if (var27 <= var29) {
                                                                                          var29 = 2;
                                                                                          L39: while (true) {
                                                                                            if (~var29 <= ~var70.length) {
                                                                                              var16 = null;
                                                                                              var30 = var27;
                                                                                              L40: while (true) {
                                                                                                if (var30 >= 128) {
                                                                                                  break L29;
                                                                                                } else {
                                                                                                  L41: {
                                                                                                    var31 = var28 + (((h) this).field_o[var30] & 255);
                                                                                                    if (0 <= var31) {
                                                                                                      break L41;
                                                                                                    } else {
                                                                                                      var31 = 0;
                                                                                                      break L41;
                                                                                                    }
                                                                                                  }
                                                                                                  L42: {
                                                                                                    if (var31 <= 128) {
                                                                                                      break L42;
                                                                                                    } else {
                                                                                                      var31 = 128;
                                                                                                      break L42;
                                                                                                    }
                                                                                                  }
                                                                                                  ((h) this).field_o[var30] = (byte)var31;
                                                                                                  var30++;
                                                                                                  continue L40;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              var30 = var70[var29];
                                                                                              var31 = var16[1 + var29] << 1;
                                                                                              var32 = var28 * (-var27 + var30) + (var30 - var27) / 2;
                                                                                              var37 = var27;
                                                                                              var33 = var37;
                                                                                              L43: while (true) {
                                                                                                if (var37 >= var30) {
                                                                                                  var27 = var30;
                                                                                                  var28 = var31;
                                                                                                  var29 += 2;
                                                                                                  continue L39;
                                                                                                } else {
                                                                                                  L44: {
                                                                                                    var34 = pf.a(var32, 125, -var27 + var30);
                                                                                                    var35 = var34 + (((h) this).field_o[var37] & 255);
                                                                                                    if (0 <= var35) {
                                                                                                      break L44;
                                                                                                    } else {
                                                                                                      var35 = 0;
                                                                                                      break L44;
                                                                                                    }
                                                                                                  }
                                                                                                  L45: {
                                                                                                    if (var35 <= 128) {
                                                                                                      break L45;
                                                                                                    } else {
                                                                                                      var35 = 128;
                                                                                                      break L45;
                                                                                                    }
                                                                                                  }
                                                                                                  ((h) this).field_o[var37] = (byte)var35;
                                                                                                  var32 = var32 + (var31 - var28);
                                                                                                  var37++;
                                                                                                  continue L43;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          L46: {
                                                                                            var30 = (((h) this).field_o[var29] & 255) - -var28;
                                                                                            if (var30 >= 0) {
                                                                                              break L46;
                                                                                            } else {
                                                                                              var30 = 0;
                                                                                              break L46;
                                                                                            }
                                                                                          }
                                                                                          L47: {
                                                                                            if (var30 <= 128) {
                                                                                              break L47;
                                                                                            } else {
                                                                                              var30 = 128;
                                                                                              break L47;
                                                                                            }
                                                                                          }
                                                                                          ((h) this).field_o[var29] = (byte)var30;
                                                                                          var29++;
                                                                                          continue L38;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L48: while (true) {
                                                                                      if (~var12 >= ~var27) {
                                                                                        var27 = 0;
                                                                                        L49: while (true) {
                                                                                          if (~var27 <= ~var12) {
                                                                                            var27 = 0;
                                                                                            L50: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L51: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L52: while (true) {
                                                                                                      if (~var27 <= ~var12) {
                                                                                                        return;
                                                                                                      } else {
                                                                                                        L53: {
                                                                                                          var52 = var13[var27];
                                                                                                          if (var52.field_e <= 0) {
                                                                                                            break L53;
                                                                                                          } else {
                                                                                                            var52.field_a = var38.f(255);
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
                                                                                                      if (var51.field_k <= 0) {
                                                                                                        break L54;
                                                                                                      } else {
                                                                                                        var51.field_e = var38.f(255);
                                                                                                        break L54;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L51;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_k = var38.f(255);
                                                                                                var27++;
                                                                                                continue L50;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L55: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_f) {
                                                                                                break L55;
                                                                                              } else {
                                                                                                var50.field_i = var38.f(255);
                                                                                                break L55;
                                                                                              }
                                                                                            }
                                                                                            L56: {
                                                                                              if (null == var50.field_c) {
                                                                                                break L56;
                                                                                              } else {
                                                                                                var50.field_j = var38.f(255);
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            L57: {
                                                                                              if (var50.field_h <= 0) {
                                                                                                break L57;
                                                                                              } else {
                                                                                                var50.field_d = var38.f(255);
                                                                                                break L57;
                                                                                              }
                                                                                            }
                                                                                            var27++;
                                                                                            continue L49;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_h = var38.f(255);
                                                                                        var27++;
                                                                                        continue L48;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L58: {
                                                                                      var49 = var13[var27];
                                                                                      if (null == var49.field_f) {
                                                                                        break L58;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L59: while (true) {
                                                                                          if (var49.field_f.length <= var29) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = var19 + (1 + var38.f(255));
                                                                                            var49.field_f[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L59;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L60: {
                                                                                  var48 = var13[var27];
                                                                                  if (null == var48.field_c) {
                                                                                    break L60;
                                                                                  } else {
                                                                                    var19 = 0;
                                                                                    var29 = 2;
                                                                                    L61: while (true) {
                                                                                      if (var29 >= var48.field_c.length) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = var38.f(255) + (1 + var19);
                                                                                        var48.field_c[var29] = (byte)var19;
                                                                                        var29 += 2;
                                                                                        continue L61;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L27;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L62: {
                                                                              var45 = var13[var27];
                                                                              if (null == var45.field_f) {
                                                                                break L62;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L63: while (true) {
                                                                                  if (var29 >= var45.field_f.length) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var45.field_f[var29] = var38.k(0);
                                                                                    var29 += 2;
                                                                                    continue L63;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L64: {
                                                                              if (null == var45.field_c) {
                                                                                break L64;
                                                                              } else {
                                                                                var29 = 3;
                                                                                L65: while (true) {
                                                                                  if (~var29 <= ~(-2 + var45.field_c.length)) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var45.field_c[var29] = var38.k(0);
                                                                                    var29 += 2;
                                                                                    continue L65;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L66: {
                                                                          if (var20 != 0) {
                                                                            break L66;
                                                                          } else {
                                                                            L67: {
                                                                              if (~var21 > ~var66.length) {
                                                                                int incrementValue$10 = var21;
                                                                                var21++;
                                                                                var20 = var18[incrementValue$10];
                                                                                break L67;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L67;
                                                                              }
                                                                            }
                                                                            if (0 >= ((h) this).field_i[var27]) {
                                                                              break L66;
                                                                            } else {
                                                                              var26 = 1 + var38.f(255);
                                                                              break L66;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((h) this).field_q[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L68: {
                                                                      if (((h) this).field_i[var26] == 0) {
                                                                        break L68;
                                                                      } else {
                                                                        L69: {
                                                                          if (var20 != 0) {
                                                                            break L69;
                                                                          } else {
                                                                            var25 = (Object) (Object) var13[var65[var21]];
                                                                            if (~var21 > ~var69.length) {
                                                                              int incrementValue$11 = var21;
                                                                              var21++;
                                                                              var20 = var10[incrementValue$11];
                                                                              break L69;
                                                                            } else {
                                                                              var20 = -1;
                                                                              break L69;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((h) this).field_t[var26] = (q) var25;
                                                                        var20--;
                                                                        break L68;
                                                                      }
                                                                    }
                                                                    var26++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L70: {
                                                                  if (((h) this).field_i[var25_int] == 0) {
                                                                    break L70;
                                                                  } else {
                                                                    L71: {
                                                                      if (var20 != 0) {
                                                                        break L71;
                                                                      } else {
                                                                        int incrementValue$12 = var8;
                                                                        var8++;
                                                                        var24 = var38.field_k[incrementValue$12] - -16 << 2;
                                                                        if (~var68.length >= ~var21) {
                                                                          var20 = -1;
                                                                          break L71;
                                                                        } else {
                                                                          int incrementValue$13 = var21;
                                                                          var21++;
                                                                          var20 = var7[incrementValue$13];
                                                                          break L71;
                                                                        }
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    ((h) this).field_o[var25_int] = (byte)var24;
                                                                    break L70;
                                                                  }
                                                                }
                                                                var25_int++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L72: {
                                                              if (((h) this).field_i[var24] == 0) {
                                                                break L72;
                                                              } else {
                                                                L73: {
                                                                  if (0 != var20) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (~var21 <= ~var67.length) {
                                                                        var20 = -1;
                                                                        break L74;
                                                                      } else {
                                                                        int incrementValue$14 = var21;
                                                                        var21++;
                                                                        var20 = var4[incrementValue$14];
                                                                        break L74;
                                                                      }
                                                                    }
                                                                    int incrementValue$15 = var5;
                                                                    var5++;
                                                                    var23 = -1 + var38.field_k[incrementValue$15];
                                                                    break L73;
                                                                  }
                                                                }
                                                                ((h) this).field_l[var24] = (byte)var23;
                                                                var20--;
                                                                break L72;
                                                              }
                                                            }
                                                            var24++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        L75: {
                                                          if (var20 != 0) {
                                                            break L75;
                                                          } else {
                                                            L76: {
                                                              if (~var21 > ~var66.length) {
                                                                int incrementValue$16 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$16];
                                                                break L76;
                                                              } else {
                                                                var20 = -1;
                                                                break L76;
                                                              }
                                                            }
                                                            var22 = var38.f((byte) -90);
                                                            break L75;
                                                          }
                                                        }
                                                        ((h) this).field_r[var23] = (short)(((h) this).field_r[var23] + kl.b(32768, -1 + var22 << 14));
                                                        ((h) this).field_i[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.f(255);
                                                    ((h) this).field_r[var20] = (short)(((h) this).field_r[var20] + (var19 << 8));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.f(255);
                                                ((h) this).field_r[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.k(0);
                                            var19++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        var17++;
                                        continue L13;
                                      }
                                    }
                                  } else {
                                    L77: {
                                      q dupTemp$17 = new q();
                                      var13[var14] = dupTemp$17;
                                      var40 = dupTemp$17;
                                      var15 = var40;
                                      var16_int = var38.f(255);
                                      if (var16_int <= 0) {
                                        break L77;
                                      } else {
                                        var15.field_f = new byte[2 * var16_int];
                                        break L77;
                                      }
                                    }
                                    L78: {
                                      var16_int = var38.f(255);
                                      if (var16_int <= 0) {
                                        break L78;
                                      } else {
                                        var15.field_c = new byte[var16_int * 2 + 2];
                                        var40.field_c[1] = (byte) 64;
                                        break L78;
                                      }
                                    }
                                    var14++;
                                    continue L10;
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.k(0);
                                var11_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var9++;
                            continue L4;
                          }
                        }
                      } else {
                        var7[var8] = var38.k(0);
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var4[var5] = var38.k(0);
                var5++;
                continue L1;
              }
            }
          } else {
            var3++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
    }
}
