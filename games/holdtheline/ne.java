/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static java.applet.Applet field_b;
    static char[] field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 117) {
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0, CharSequence param1, boolean param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
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
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 < 2) {
                break L1;
              } else {
                if (36 < param0) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  if (param3 == 106) {
                    var6 = 0;
                    var7 = param1.length();
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var7) {
                        stackIn_43_0 = var5;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        L3: {
                          L4: {
                            var9 = param1.charAt(var8);
                            if (-1 == (var8 ^ -1)) {
                              if (var9 == 45) {
                                var4_int = 1;
                                break L3;
                              } else {
                                if (var9 != 43) {
                                  break L4;
                                } else {
                                  if (!param2) {
                                    break L4;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            L6: {
                              if (var9 < 48) {
                                break L6;
                              } else {
                                if (var9 > 57) {
                                  break L6;
                                } else {
                                  var9 -= 48;
                                  break L5;
                                }
                              }
                            }
                            L7: {
                              if (var9 < 65) {
                                break L7;
                              } else {
                                if (90 >= var9) {
                                  var9 -= 55;
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (var9 < 97) {
                                break L8;
                              } else {
                                if (var9 > 122) {
                                  break L8;
                                } else {
                                  var9 -= 87;
                                  break L5;
                                }
                              }
                            }
                            stackIn_28_0 = 0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                          if (param0 > var9) {
                            L9: {
                              if (var4_int != 0) {
                                var9 = -var9;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var10 = param0 * var6 + var9;
                            if (var6 != var10 / param0) {
                              stackIn_39_0 = 0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var5 = 1;
                              var6 = var10;
                              break L3;
                            }
                          } else {
                            stackIn_32_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackIn_7_0 = 0;
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
          L10: {
            var4 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var4);

            stackIn_46_1 = new StringBuilder().append("ne.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L10;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L10;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_28_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_32_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_39_0 != 0;
              } else {
                return stackIn_43_0 != 0;
              }
            }
          }
        }
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            if (!ra.a(param0, false, param2)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = param1;
              L1: while (true) {
                if (var3_int >= param0.length()) {
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (vb.a(332243496, param0.charAt(var3_int))) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("ne.C(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final static byte[] a(int param0, Object param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        ej var5 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (param0 == 90) {
                  break L1;
                } else {
                  var4 = (Object) null;
                  ne.a(24, (Object) null, true);
                  break L1;
                }
              }
              if (param1 instanceof byte[]) {
                var3 = (byte[]) (param1);
                if (!param2) {
                  stackIn_11_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_9_0 = sj.a(var3, (byte) -69);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (param1 instanceof ej) {
                  var5 = (ej) (param1);
                  stackIn_15_0 = var5.a(62);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  throw new IllegalArgumentException();
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("ne.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    static {
        field_a = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
