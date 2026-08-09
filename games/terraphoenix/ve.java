/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static boolean field_c;
    static ci field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_a = (ci) null;
        }
    }

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
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
        String stackIn_18_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Terraphoenix.field_V;
        try {
          L0: {
            if (param2 != 0) {
              if (param2 == 1) {
                var10 = param1[param3];
                var4 = var10;
                if (var4 == null) {
                  stackIn_9_0 = "null";
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return var10.toString();
                }
              } else {
                var4_int = param3 + param2;
                var5 = 0;
                var6_int = param3;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    var6 = new StringBuilder(var5);
                    if (param0 == -10537) {
                      var7 = param3;
                      L2: while (true) {
                        if (var7 >= var4_int) {
                          stackIn_26_0 = var6.toString();
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var8 = param1[var7];
                            if (var8 != null) {
                              discarded$3 = var6.append(var8);
                              break L3;
                            } else {
                              discarded$4 = var6.append("null");
                              break L3;
                            }
                          }
                          var7++;
                          continue L2;
                        }
                      }
                    } else {
                      stackIn_18_0 = (String) null;
                      decompiledRegionSelector0 = 2;
                      break L0;
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
              stackIn_3_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var4_ref);

            stackIn_29_1 = new StringBuilder().append("ve.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L5;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              return stackIn_26_0;
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        wf.field_l = (59 & param1) >> 2143030436;
        if (2 < wf.field_l) {
            wf.field_l = 2;
        }
        di.field_e = 3 & param1 >> -430683646;
        if (!(param0 >= di.field_e)) {
            di.field_e = 2;
        }
        lb.field_f = param1 & 3;
        if (!(-3 <= (lb.field_f ^ -1))) {
            lb.field_f = 2;
        }
    }

    final static void a(ci param0, int param1, int param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
                  if ((var9 ^ -1) < -1) {
                    var13 = var7;
                    var15 = -(var10 >> -1458551678);
                    var10 = -(3 & var10);
                    var16 = -var9;
                    L6: while (true) {
                      if (var16 >= 0) {
                        decompiledRegionSelector0 = 2;
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
                                  incrementValue$0 = var6;
                                  var6++;
                                  var14 = param0.field_z[incrementValue$0];
                                  if ((var14 ^ -1) == -1) {
                                    var5_int++;
                                    break L10;
                                  } else {
                                    incrementValue$1 = var5_int;
                                    var5_int++;
                                    l.field_i[incrementValue$1] = var14;
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
                                incrementValue$2 = var6;
                                var6++;
                                var14 = param0.field_z[incrementValue$2];
                                if (-1 == (var14 ^ -1)) {
                                  break L12;
                                } else {
                                  if (gd.field_a[var7][var8] <= param2) {
                                    incrementValue$3 = var7;
                                    var7++;
                                    gd.field_a[incrementValue$3][var8] = param2;
                                    incrementValue$4 = var5_int;
                                    var5_int++;
                                    l.field_i[incrementValue$4] = var14;
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
                                incrementValue$5 = var6;
                                var6++;
                                var14 = param0.field_z[incrementValue$5];
                                if (0 == var14) {
                                  break L14;
                                } else {
                                  if (param2 >= gd.field_a[var7][var8]) {
                                    incrementValue$6 = var7;
                                    var7++;
                                    gd.field_a[incrementValue$6][var8] = param2;
                                    incrementValue$7 = var5_int;
                                    var5_int++;
                                    l.field_i[incrementValue$7] = var14;
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
                                incrementValue$8 = var6;
                                var6++;
                                var14 = param0.field_z[incrementValue$8];
                                if (0 == var14) {
                                  break L16;
                                } else {
                                  if (param2 < gd.field_a[var7][var8]) {
                                    break L16;
                                  } else {
                                    incrementValue$9 = var7;
                                    var7++;
                                    gd.field_a[incrementValue$9][var8] = param2;
                                    incrementValue$10 = var5_int;
                                    var5_int++;
                                    l.field_i[incrementValue$10] = var14;
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
                                incrementValue$11 = var6;
                                var6++;
                                var14 = param0.field_z[incrementValue$11];
                                if (0 == var14) {
                                  break L18;
                                } else {
                                  if (param2 >= gd.field_a[var7][var8]) {
                                    incrementValue$12 = var7;
                                    var7++;
                                    gd.field_a[incrementValue$12][var8] = param2;
                                    incrementValue$13 = var5_int;
                                    var5_int++;
                                    l.field_i[incrementValue$13] = var14;
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var5);

            stackIn_52_1 = new StringBuilder().append("ve.C(");

            if (param0 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L19;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L19;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_c = true;
    }
}
