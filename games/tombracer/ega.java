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
        boolean discarded$1 = false;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        int stackIn_9_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_39_0 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
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
                      discarded$1 = ega.a(-127, (CharSequence) null, true, false);
                      break L2;
                    }
                  }
                  L3: while (true) {
                    L4: {
                      if (var8 >= var7) {
                        stackOut_43_0 = var5;
                        stackIn_44_0 = stackOut_43_0;
                        break L4;
                      } else {
                        var9 = param1.charAt(var8);
                        stackOut_8_0 = 0;
                        stackIn_44_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var11 != 0) {
                          break L4;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_9_0 != var8) {
                                break L6;
                              } else {
                                L7: {
                                  if (var9 == 45) {
                                    var4_int = 1;
                                    if (var11 == 0) {
                                      break L5;
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                                if (var9 != 43) {
                                  break L6;
                                } else {
                                  if (param3) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L8: {
                              L9: {
                                if (var9 < 48) {
                                  break L9;
                                } else {
                                  if (var9 > 57) {
                                    break L9;
                                  } else {
                                    var9 -= 48;
                                    if (var11 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              L10: {
                                if (65 > var9) {
                                  break L10;
                                } else {
                                  if (var9 > 90) {
                                    break L10;
                                  } else {
                                    var9 -= 55;
                                    break L8;
                                  }
                                }
                              }
                              if (var9 < 97) {
                                stackOut_27_0 = 0;
                                stackIn_28_0 = stackOut_27_0;
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                if (122 >= var9) {
                                  var9 -= 87;
                                  if (var11 == 0) {
                                    break L8;
                                  } else {
                                    var9 -= 55;
                                    break L8;
                                  }
                                } else {
                                  return false;
                                }
                              }
                            }
                            if (var9 >= param0) {
                              stackOut_33_0 = 0;
                              stackIn_34_0 = stackOut_33_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              L11: {
                                if (var4_int == 0) {
                                  break L11;
                                } else {
                                  var9 = -var9;
                                  break L11;
                                }
                              }
                              var10 = var9 + param0 * var6;
                              if (var10 / param0 != var6) {
                                stackOut_39_0 = 0;
                                stackIn_40_0 = stackOut_39_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var5 = 1;
                                var6 = var10;
                                break L5;
                              }
                            }
                          }
                          var8++;
                          continue L3;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var4);
            stackOut_45_1 = new StringBuilder().append("ega.A(").append(param0).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L12;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_44_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_28_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_34_0 != 0;
            } else {
              return stackIn_40_0 != 0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 2) {
            field_e = (nh) null;
            field_d = null;
            field_a = null;
            return;
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
