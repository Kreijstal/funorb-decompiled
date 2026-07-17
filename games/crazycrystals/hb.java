/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends jb {
    static String field_i;
    static tj field_l;
    static id field_h;
    static boolean field_g;
    static ko field_k;
    int field_j;
    int field_f;

    final static void a(int param0, int param1, int param2, int param3, dl param4, int param5, int param6, int param7) {
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
        dl var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var19 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (kh.field_c <= param7) {
                break L1;
              } else {
                param3 = param3 - (-param7 + kh.field_c);
                param7 = kh.field_c;
                break L1;
              }
            }
            L2: {
              if (param3 + param7 > kh.field_g) {
                param3 = -param7 + kh.field_g;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (~kh.field_b < ~param2) {
                param1 = param1 - (-param2 + kh.field_b);
                param2 = kh.field_b;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (kh.field_j >= param2 + param1) {
                break L4;
              } else {
                param1 = -param2 + kh.field_j;
                break L4;
              }
            }
            L5: {
              if (param3 <= 0) {
                break L5;
              } else {
                if (param1 <= 0) {
                  break L5;
                } else {
                  var21 = param4.d();
                  if (param5 <= -11) {
                    var32 = kh.field_i;
                    var10 = kh.field_l;
                    var11 = kh.field_d;
                    var30 = new int[4];
                    kh.b(var30);
                    param4.a();
                    kh.a(var30[0], var30[1], var30[2], var30[3]);
                    var13 = param4.field_l * param2 + param7;
                    var14 = -param3 + param4.field_l;
                    var31 = var21.field_w;
                    var28 = var31;
                    var25 = var28;
                    var22 = var25;
                    var15 = var22;
                    var16 = param2;
                    L6: while (true) {
                      if (~var16 <= ~(param2 + param1)) {
                        var21.a(-param4.field_v, -param4.field_t);
                        kh.a(var32, var10, var11);
                        kh.a(var30);
                        break L0;
                      } else {
                        var17 = param7;
                        L7: while (true) {
                          if (~(param3 + param7) >= ~var17) {
                            var13 = var13 + var14;
                            var16++;
                            continue L6;
                          } else {
                            L8: {
                              var18 = var31[var13];
                              if (var18 != 0) {
                                L9: {
                                  if (var17 <= 0) {
                                    break L9;
                                  } else {
                                    if (var15[var13 + -1] == 0) {
                                      kh.b(var17, var16, param0, param6);
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
                                    if (0 == var15[-param4.field_l + var13]) {
                                      kh.b(var17, var16, param0, param6);
                                      break L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if (~var17 <= ~(param4.field_l - 1)) {
                                    break L11;
                                  } else {
                                    if (var15[1 + var13] == 0) {
                                      kh.b(var17, var16, param0, param6);
                                      break L8;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                if (~(-1 + param4.field_u) >= ~var16) {
                                  break L8;
                                } else {
                                  if (var15[var13 - -param4.field_l] != 0) {
                                    break L8;
                                  } else {
                                    kh.b(var17, var16, param0, param6);
                                    break L8;
                                  }
                                }
                              } else {
                                break L8;
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
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var8 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var8;
            stackOut_43_1 = new StringBuilder().append("hb.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param4 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L12;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L12;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    public static void b(boolean param0) {
        field_h = null;
        field_l = null;
        field_k = null;
        field_i = null;
    }

    private hb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "OK";
    }
}
