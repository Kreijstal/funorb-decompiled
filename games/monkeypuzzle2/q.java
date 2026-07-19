/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static sd field_c;
    static String field_b;
    static int field_a;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 < 66) {
            field_a = -92;
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        String stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (-21 <= (var2_int ^ -1)) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var2_int <= var4) {
                      break L5;
                    } else {
                      var5 = param0.charAt(var4);
                      var10 = 65;
                      var9 = var5;
                      if (var6 != 0) {
                        if (var9 == var10) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        L6: {
                          L7: {
                            if (var9 < var10) {
                              break L7;
                            } else {
                              if (90 < var5) {
                                break L7;
                              } else {
                                var3[var4] = (char)(var5 - -32);
                                if (var6 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          L8: {
                            L9: {
                              L10: {
                                if (var5 < 97) {
                                  break L10;
                                } else {
                                  if (var5 <= 122) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (var5 < 48) {
                                break L8;
                              } else {
                                if (var5 > 57) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var3[var4] = (char)var5;
                            if (var6 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                          var3[var4] = (char)95;
                          break L6;
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (param1 == 20) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                field_b = (String) null;
                break L3;
              }
              stackOut_25_0 = new String(var8);
              stackIn_26_0 = stackOut_25_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var2);
            stackOut_27_1 = new StringBuilder().append("q.B(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
        return stackIn_26_0;
    }

    final static boolean a(CharSequence param0, boolean param1) {
        int discarded$2 = 0;
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                discarded$2 = q.a(111, (byte) -112, -29);
                break L1;
              }
            }
            stackOut_2_0 = rj.a(false, param0, (byte) 20);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("q.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 == -36) {
                break L1;
              } else {
                field_c = (sd) null;
                break L1;
              }
            }
            var4 = fb.field_k;
            L2: while (true) {
              L3: {
                if (pl.field_k.length <= var3_int) {
                  stackOut_14_0 = -1;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  var5 = gh.field_a[var3_int];
                  stackOut_5_0 = var5;
                  stackIn_15_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var8 != 0) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        if (stackIn_6_0 >= 0) {
                          break L5;
                        } else {
                          var4 = var4 + gi.field_a;
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var6 = hh.a((byte) 74, pl.field_k[var3_int], true);
                      var7 = jc.field_b + -(var6 >> 1710126753);
                      var4 = var4 + ud.field_a;
                      if (lf.a(param1 + -19828, param2, param0, hb.field_n + (vf.field_b << 2020137185), (pl.field_h << 559599169) + var6, -pl.field_h + var7, var4)) {
                        stackOut_10_0 = var5;
                        stackIn_11_0 = stackOut_10_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var4 = var4 + (hb.field_n + ud.field_a + (vf.field_b << 1662215201));
                        break L4;
                      }
                    }
                    var3_int++;
                    continue L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var3), "q.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0;
        } else {
          return stackIn_11_0;
        }
    }

    static {
        field_c = new sd();
        field_b = "Unpacking levels";
        field_a = 0;
    }
}
