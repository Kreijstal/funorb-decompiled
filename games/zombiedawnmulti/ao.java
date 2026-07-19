/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static String field_a;
    static int field_d;
    int field_f;
    static int field_e;
    static int field_c;
    static ja[] field_b;
    int field_g;
    static ja[] field_h;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 > -21) {
            field_e = -25;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static int[] a(int[] param0, int param1, int[] param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        int[] var4 = null;
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
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int[] stackIn_21_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int[] stackOut_20_0 = null;
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
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0.length >= 1 + param2.length) {
              var3_int = 0;
              var4_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4_int >= param2.length) {
                      break L3;
                    } else {
                      stackOut_5_0 = var3_int + param2[var4_int];
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var16 != 0) {
                        break L2;
                      } else {
                        var3_int = stackIn_6_0;
                        var4_int++;
                        if (var16 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_7_0 = var3_int;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                }
                var4 = new int[stackIn_8_0];
                var5 = (16715550 & param0[0]) >> -242715856;
                var6 = 255 & param0[0] >> -837539512;
                var7 = 255 & param0[0];
                var8 = param0[1] >> 1541241936 & 255;
                var9 = 255 & param0[1] >> -130271544;
                var10 = 255 & param0[1];
                var11 = 0;
                var12 = 0;
                var13 = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      L7: {
                        if (var3_int <= var11) {
                          break L7;
                        } else {
                          var14 = param2[var12];
                          var15 = -var13 + var14;
                          var4[var11] = (var6 * var15 / var14 - -(var9 * var13 / var14) << -1311961496) + ((var8 * var13 / var14 + var15 * var5 / var14 << 1001175184) + var7 * var15 / var14) - -(var13 * var10 / var14);
                          var13++;
                          var18 = var14;
                          var17 = var13;
                          if (var16 != 0) {
                            if (var17 == var18) {
                              break L5;
                            } else {
                              break L6;
                            }
                          } else {
                            L8: {
                              if (var17 >= var18) {
                                var13 = 0;
                                var5 = var8;
                                var7 = var10;
                                var12++;
                                var6 = var9;
                                if (param0.length <= 1 + var12) {
                                  break L8;
                                } else {
                                  var9 = 255 & param0[var12 - -1] >> 140511336;
                                  var10 = param0[var12 + 1] & 255;
                                  var8 = (16729410 & param0[1 + var12]) >> -1214704272;
                                  break L8;
                                }
                              } else {
                                break L8;
                              }
                            }
                            var11++;
                            if (var16 == 0) {
                              continue L4;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (param1 == -837539512) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                    field_c = -59;
                    break L5;
                  }
                  stackOut_20_0 = (int[]) (var4);
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                }
              }
            } else {
              throw new IllegalArgumentException("The colours array must have at least one more element than the gaps array!");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("ao.A(");
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
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
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
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_21_0;
    }

    ao(int param0, int param1, int param2, int param3) {
        this.field_f = param3;
        this.field_g = param0;
    }

    static {
        field_d = 1;
        field_a = "Show all private chat";
    }
}
