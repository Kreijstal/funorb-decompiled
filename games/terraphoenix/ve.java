/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static boolean field_c;
    static ci field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
    }

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_18_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_25_0 = null;
        Object stackOut_17_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var9 = Terraphoenix.field_V;
        try {
          L0: {
            if (param2 != 0) {
              if (param2 == 1) {
                var10 = param1[0];
                var4 = var10;
                if (var4 == null) {
                  stackOut_8_0 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  return ((Object) (Object) var10).toString();
                }
              } else {
                var4_int = param2;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    var6 = new StringBuilder(var5);
                    if (param0 == -10537) {
                      var7 = 0;
                      L2: while (true) {
                        if (var7 >= var4_int) {
                          stackOut_25_0 = var6.toString();
                          stackIn_26_0 = stackOut_25_0;
                          break L0;
                        } else {
                          L3: {
                            var8 = param1[var7];
                            if (var8 != null) {
                              StringBuilder discarded$5 = var6.append(var8);
                              break L3;
                            } else {
                              StringBuilder discarded$6 = var6.append("null");
                              break L3;
                            }
                          }
                          var7++;
                          continue L2;
                        }
                      }
                    } else {
                      stackOut_17_0 = null;
                      stackIn_18_0 = stackOut_17_0;
                      return (String) (Object) stackIn_18_0;
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param1[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L4;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4_ref;
            stackOut_27_1 = new StringBuilder().append("ve.D(").append(param0).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param2 + 44 + 0 + 41);
        }
        return stackIn_26_0;
    }

    final static void a(int param0, int param1) {
        wf.field_l = (59 & param1) >> 4;
        if (2 < wf.field_l) {
            wf.field_l = 2;
        }
        di.field_e = 3 & param1 >> 2;
        if (!(param0 >= di.field_e)) {
            di.field_e = 2;
        }
        lb.field_f = param1 & 3;
        if (!(lb.field_f <= 2)) {
            lb.field_f = 2;
        }
    }

    final static void a(ci param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var18 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              param2 = param2 + param3;
              param4 = param4 + param0.field_p;
              param3 = param3 - (param0.field_u + -15);
              param3 = param3 + param0.field_v;
              var5_int = l.field_k * param3 + param4;
              var6 = 0;
              var7 = param4;
              var8 = param3;
              var9 = param0.field_t;
              var10 = param0.field_r;
              var11 = l.field_k + -var10;
              if (l.field_d <= param3) {
                break L1;
              } else {
                var13 = l.field_d - param3;
                var5_int = var5_int + l.field_k * var13;
                var9 = var9 - var13;
                var8 = var8 + var13;
                param3 = l.field_d;
                var6 = var6 + var10 * var13;
                break L1;
              }
            }
            if (param1 == -5353) {
              L2: {
                var12 = 0;
                if (param4 >= l.field_b) {
                  break L2;
                } else {
                  var13 = l.field_b + -param4;
                  var7 = var7 + var13;
                  var6 = var6 + var13;
                  param4 = l.field_b;
                  var12 = var12 + var13;
                  var5_int = var5_int + var13;
                  var11 = var11 + var13;
                  var10 = var10 - var13;
                  break L2;
                }
              }
              L3: {
                if (param3 + var9 > l.field_c) {
                  var9 = var9 - (var9 + (param3 + -l.field_c));
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (l.field_f >= param4 - -var10) {
                  break L4;
                } else {
                  var13 = var10 + (param4 - l.field_f);
                  var10 = var10 - var13;
                  var11 = var11 + var13;
                  var12 = var12 + var13;
                  break L4;
                }
              }
              L5: {
                if (0 >= var10) {
                  break L5;
                } else {
                  if (var9 > 0) {
                    var13 = var7;
                    var15 = -(var10 >> 2);
                    var10 = -(3 & var10);
                    var16 = -var9;
                    L6: while (true) {
                      if (var16 >= 0) {
                        break L0;
                      } else {
                        var17 = var15;
                        L7: while (true) {
                          if (0 <= var17) {
                            var7 = var13;
                            var17 = var10;
                            L8: while (true) {
                              if (var17 >= 0) {
                                L9: {
                                  var8++;
                                  var5_int = var5_int + var11;
                                  if (var8 < -15 + (param3 + param0.field_t)) {
                                    break L9;
                                  } else {
                                    param2++;
                                    break L9;
                                  }
                                }
                                var6 = var6 + var12;
                                var16++;
                                continue L6;
                              } else {
                                L10: {
                                  int incrementValue$14 = var6;
                                  var6++;
                                  var14 = param0.field_z[incrementValue$14];
                                  if (var14 == 0) {
                                    var5_int++;
                                    break L10;
                                  } else {
                                    int incrementValue$15 = var5_int;
                                    var5_int++;
                                    l.field_i[incrementValue$15] = var14;
                                    break L10;
                                  }
                                }
                                var17++;
                                continue L8;
                              }
                            }
                          } else {
                            L11: {
                              L12: {
                                int incrementValue$16 = var6;
                                var6++;
                                var14 = param0.field_z[incrementValue$16];
                                if (var14 == 0) {
                                  break L12;
                                } else {
                                  if (gd.field_a[var7][var8] <= param2) {
                                    int incrementValue$17 = var7;
                                    var7++;
                                    gd.field_a[incrementValue$17][var8] = param2;
                                    int incrementValue$18 = var5_int;
                                    var5_int++;
                                    l.field_i[incrementValue$18] = var14;
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              var7++;
                              var5_int++;
                              break L11;
                            }
                            L13: {
                              L14: {
                                int incrementValue$19 = var6;
                                var6++;
                                var14 = param0.field_z[incrementValue$19];
                                if (0 == var14) {
                                  break L14;
                                } else {
                                  if (param2 >= gd.field_a[var7][var8]) {
                                    int incrementValue$20 = var7;
                                    var7++;
                                    gd.field_a[incrementValue$20][var8] = param2;
                                    int incrementValue$21 = var5_int;
                                    var5_int++;
                                    l.field_i[incrementValue$21] = var14;
                                    break L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              var7++;
                              var5_int++;
                              break L13;
                            }
                            L15: {
                              L16: {
                                int incrementValue$22 = var6;
                                var6++;
                                var14 = param0.field_z[incrementValue$22];
                                if (0 == var14) {
                                  break L16;
                                } else {
                                  if (param2 < gd.field_a[var7][var8]) {
                                    break L16;
                                  } else {
                                    int incrementValue$23 = var7;
                                    var7++;
                                    gd.field_a[incrementValue$23][var8] = param2;
                                    int incrementValue$24 = var5_int;
                                    var5_int++;
                                    l.field_i[incrementValue$24] = var14;
                                    break L15;
                                  }
                                }
                              }
                              var5_int++;
                              var7++;
                              break L15;
                            }
                            L17: {
                              L18: {
                                int incrementValue$25 = var6;
                                var6++;
                                var14 = param0.field_z[incrementValue$25];
                                if (0 == var14) {
                                  break L18;
                                } else {
                                  if (param2 >= gd.field_a[var7][var8]) {
                                    int incrementValue$26 = var7;
                                    var7++;
                                    gd.field_a[incrementValue$26][var8] = param2;
                                    int incrementValue$27 = var5_int;
                                    var5_int++;
                                    l.field_i[incrementValue$27] = var14;
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              var7++;
                              var5_int++;
                              break L17;
                            }
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var5;
            stackOut_50_1 = new StringBuilder().append("ve.C(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L19;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L19;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
    }
}
