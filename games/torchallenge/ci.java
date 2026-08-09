/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends ma {
    static int field_n;
    static int field_m;
    static String field_o;
    static String field_q;
    static int[][] field_p;

    final static int g(int param0) {
        if (param0 < 11) {
            CharSequence var2 = (CharSequence) null;
            ci.a(56, (CharSequence) null, 112, false);
            return 1;
        }
        return 1;
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1) > -3) {
                break L1;
              } else {
                if (36 >= param0) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 24 % ((80 - param2) / 46);
                  var7 = 0;
                  var8 = param1.length();
                  var9 = 0;
                  L2: while (true) {
                    if (var9 >= var8) {
                      stackIn_38_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        L4: {
                          var10 = param1.charAt(var9);
                          if (0 != var9) {
                            break L4;
                          } else {
                            if (45 == var10) {
                              var4_int = 1;
                              break L3;
                            } else {
                              if (var10 != 43) {
                                break L4;
                              } else {
                                if (!param3) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (var10 < 48) {
                              break L6;
                            } else {
                              if (var10 > 57) {
                                break L6;
                              } else {
                                var10 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (var10 < 65) {
                              break L7;
                            } else {
                              if (var10 > 90) {
                                break L7;
                              } else {
                                var10 -= 55;
                                break L5;
                              }
                            }
                          }
                          if (97 > var10) {
                            stackIn_24_0 = 0;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            if (122 >= var10) {
                              var10 -= 87;
                              break L5;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (param0 > var10) {
                          L8: {
                            if (var4_int != 0) {
                              var10 = -var10;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var11 = var10 + var7 * param0;
                          if (var7 == var11 / param0) {
                            var5 = 1;
                            var7 = var11;
                            break L3;
                          } else {
                            stackIn_34_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          stackIn_28_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var4);

            stackIn_41_1 = new StringBuilder().append("ci.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L9;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L9;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_24_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_28_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_34_0 != 0;
            } else {
              return stackIn_38_0 != 0;
            }
          }
        }
    }

    ci(dj param0) {
        super(param0);
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) 24, param0) != lk.field_c) {
              if (param1 != -24) {
                field_o = (String) null;
                stackIn_6_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = ue.field_l;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ci.C(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (String) ((Object) stackIn_6_0);
        }
    }

    public static void f(int param0) {
        if (param0 <= 25) {
            field_o = (String) null;
        }
        field_q = null;
        field_p = (int[][]) null;
        field_o = null;
    }

    final rj a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        rj stackIn_2_0 = null;
        rj stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (ei.a((byte) -117, var4)) {
              L1: {
                if (param0 == 24) {
                  break L1;
                } else {
                  ci.g(119);
                  break L1;
                }
              }
              L2: {
                var5 = (CharSequence) ((Object) param1);
                var3_int = qh.a(var5, (byte) -125);
                if (var3_int <= 0) {
                  break L2;
                } else {
                  if (-131 > (var3_int ^ -1)) {
                    break L2;
                  } else {
                    return tf.field_w;
                  }
                }
              }
              stackIn_9_0 = lk.field_c;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = lk.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ci.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_9_0;
        }
    }

    static {
        field_m = 0;
        field_n = -1;
        field_o = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_p = new int[][]{new int[]{50}, new int[]{50, 50, 50, 50, 50, 50}, new int[]{50}, new int[]{50}, new int[]{50}, new int[]{50}};
    }
}
