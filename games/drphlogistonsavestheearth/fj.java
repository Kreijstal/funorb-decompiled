/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends gi {
    int field_h;
    static volatile int field_j;
    static String[] field_i;

    public static void d(int param0) {
        field_i = null;
    }

    final static void e(int param0) {
    }

    fj(int param0) {
        ((fj) this).field_h = param0;
    }

    final static void a(int param0, rf param1, byte param2, rf param3) {
        try {
            ol.field_h = 480;
            uj.field_i = param3;
            cj.field_a = param1;
            a.a(wj.field_c / 2, wj.field_k / 2, (byte) 101);
            fa.a(false, param3.field_L - -param3.field_S, param1.field_L, param1.field_S + param1.field_L, param3.field_L);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "fj.D(" + 480 + ',' + (param1 != null ? "{...}" : "null") + ',' + 114 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, CharSequence param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < 2) {
                break L1;
              } else {
                if (36 < param0) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    if (param2 >= 77) {
                      break L2;
                    } else {
                      field_j = 100;
                      break L2;
                    }
                  }
                  var5 = 0;
                  var6 = 0;
                  var7 = param1.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      if (var5 != 0) {
                        stackOut_41_0 = var6;
                        stackIn_42_0 = stackOut_41_0;
                        break L0;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param1.charAt(var8);
                          if (var8 == 0) {
                            if (45 == var9) {
                              var4_int = 1;
                              var8++;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                var8++;
                                break L4;
                              }
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
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
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
                            if (97 > var9) {
                              break L9;
                            } else {
                              if (var9 <= 122) {
                                var9 -= 87;
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var9 < param0) {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = param0 * var6 - -var9;
                          if (var10 / param0 == var6) {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          } else {
                            throw new NumberFormatException();
                          }
                        } else {
                          throw new NumberFormatException();
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
          L11: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("fj.C(").append(param0).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L11;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L11;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param2 + ',' + true + ')');
        }
        return stackIn_42_0;
    }

    final static a f(int param0) {
        return new a(nf.e((byte) 127), mj.b((byte) 114));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"Earth", "Earth", "Earth", "Space", "Space", "Space", "Arkab", "Arkab", "Arkab"};
        field_j = 0;
    }
}
