/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ega {
    static int field_c;
    static String field_d;
    static int field_b;
    static nh field_e;
    private static String[] field_a;

    final static boolean a(int param0, CharSequence param1, boolean param2, boolean param3) {
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
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
        CharSequence var12 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1) > -3) {
                break L1;
              } else {
                if ((param0 ^ -1) < -37) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = param1.length();
                    var8 = 0;
                    if (param2) {
                      break L2;
                    } else {
                      var12 = (CharSequence) null;
                      ega.a(-127, (CharSequence) null, true, false);
                      break L2;
                    }
                  }
                  L3: while (true) {
                    if (var8 >= var7) {
                      stackIn_42_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param1.charAt(var8);
                          if (0 != var8) {
                            break L5;
                          } else {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param3) {
                                  break L5;
                                } else {
                                  var8++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 > 57) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (65 > var9) {
                              break L8;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          if (var9 < 97) {
                            stackIn_26_0 = 0;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            if (122 >= var9) {
                              var9 -= 87;
                              break L6;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (var9 >= param0) {
                          stackIn_32_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L9: {
                            if (var4_int == 0) {
                              break L9;
                            } else {
                              var9 = -var9;
                              break L9;
                            }
                          }
                          var10 = var9 + param0 * var6;
                          if (var10 / param0 != var6) {
                            stackIn_38_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          }
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var4);

            stackIn_45_1 = new StringBuilder().append("ega.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L10;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_26_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_32_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_38_0 != 0;
            } else {
              return stackIn_42_0 != 0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 2) {
            field_e = (nh) null;
        }
        field_d = null;
        field_a = null;
    }

    static {
        field_d = "No spectators";
        field_a = new String[2];
        field_a[0] = "Skeleton";
    }
}
