/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hh {
    static int field_a;
    static vi field_d;
    static hl[] field_b;
    static int field_c;

    abstract s b(byte param0);

    abstract void a(byte param0, rb param1);

    final static oe a(int param0, int param1, String param2) {
        fl var3 = null;
        RuntimeException var3_ref = null;
        fl stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fl stackOut_0_0 = null;
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
            var3 = new fl();
            ((oe) (Object) var3).field_d = param1;
            ((oe) (Object) var3).field_c = param2;
            stackOut_0_0 = (fl) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("hh.H(").append(91).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return (oe) (Object) stackIn_1_0;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, hl param6, int param7) {
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        hl var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var19 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (~ki.field_l < ~param0) {
                param7 = param7 - (ki.field_l - param0);
                param0 = ki.field_l;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (~ki.field_e < ~param1) {
                param3 = param3 - (ki.field_e + -param1);
                param1 = ki.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param7 + param0 > ki.field_g) {
                param7 = ki.field_g - param0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (~ki.field_i <= ~(param3 + param1)) {
                break L4;
              } else {
                param3 = -param1 + ki.field_i;
                break L4;
              }
            }
            L5: {
              if (param7 <= 0) {
                break L5;
              } else {
                if (param3 > 0) {
                  var21 = param6.c();
                  var32 = ki.field_a;
                  var10 = ki.field_j;
                  var11 = ki.field_f;
                  var30 = new int[4];
                  ki.a(var30);
                  param6.e();
                  ki.c(var30[0], var30[1], var30[2], var30[3]);
                  var13 = param6.field_u * param1 + param0;
                  var14 = param6.field_u - param7;
                  var31 = var21.field_B;
                  var28 = var31;
                  var25 = var28;
                  var22 = var25;
                  var15 = var22;
                  var16 = param1;
                  L6: while (true) {
                    if (~var16 <= ~(param1 + param3)) {
                      var21.e(-param6.field_w, -param6.field_y);
                      ki.a(var32, var10, var11);
                      ki.b(var30);
                      break L0;
                    } else {
                      var17 = param0;
                      L7: while (true) {
                        if (var17 >= param7 + param0) {
                          var13 = var13 + var14;
                          var16++;
                          continue L6;
                        } else {
                          L8: {
                            var18 = var31[var13];
                            if (0 == var18) {
                              break L8;
                            } else {
                              L9: {
                                if (0 >= var17) {
                                  break L9;
                                } else {
                                  if (0 == var15[var13 - 1]) {
                                    ki.e(var17, var16, param2, 1);
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (var16 <= 0) {
                                  break L10;
                                } else {
                                  if (var15[var13 - param6.field_u] == 0) {
                                    ki.e(var17, var16, param2, 1);
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (~var17 <= ~(param6.field_u + -1)) {
                                  break L11;
                                } else {
                                  if (var15[1 + var13] == 0) {
                                    ki.e(var17, var16, param2, 1);
                                    break L8;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (~var16 <= ~(param6.field_v + -1)) {
                                break L8;
                              } else {
                                if (var15[var13 - -param6.field_u] != 0) {
                                  break L8;
                                } else {
                                  ki.e(var17, var16, param2, 1);
                                  break L8;
                                }
                              }
                            }
                          }
                          var13++;
                          var17++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var8 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var8;
            stackOut_42_1 = new StringBuilder().append("hh.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(false).append(',').append(1).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param6 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L12;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L12;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + param7 + ')');
        }
    }

    public static void a() {
        field_b = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
    }
}
