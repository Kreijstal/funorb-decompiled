/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er {
    static String field_c;
    static String field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -3) {
            field_a = 42;
        }
    }

    final static void b(int param0) {
        L0: {
          L1: {
            if ((p.field_b ^ -1) == param0) {
              break L1;
            } else {
              if (!du.c(10)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          tb.d(7);
          p.field_b = 11;
          break L0;
        }
        dd.field_a = true;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, int param3) {
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param3 ^ -1) > -3) {
                break L1;
              } else {
                if ((param3 ^ -1) >= -37) {
                  L2: {
                    var4_int = 0;
                    if (param1 <= -38) {
                      break L2;
                    } else {
                      er.b(-89);
                      break L2;
                    }
                  }
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= var7) {
                      stackIn_40_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param2.charAt(var8);
                          if (0 == var8) {
                            if (var9 != 45) {
                              if (43 != var9) {
                                break L5;
                              } else {
                                if (!param0) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (57 < var9) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (90 < var9) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (var9 > 122) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          stackIn_26_0 = 0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                        if (var9 < param3) {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = var9 + param3 * var6;
                          if (var10 / param3 != var6) {
                            stackIn_36_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          }
                        } else {
                          stackIn_29_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var4);

            stackIn_43_1 = new StringBuilder().append("er.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L11;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_26_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_29_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_36_0 != 0;
            } else {
              return stackIn_40_0 != 0;
            }
          }
        }
    }

    final static void a(byte param0) {
        int var1 = -52 % ((param0 - -85) / 37);
        if (!(null == rl.field_C)) {
            rl.field_C.k(0);
        }
        if (pq.field_a != null) {
            pq.field_a.i((byte) 2);
        }
        qh.a((byte) 124);
    }

    static {
        field_b = "This password is part of your Player Name, and would be easy to guess";
        field_c = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
