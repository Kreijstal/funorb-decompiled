/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc implements ch {
    static String field_d;
    static int field_f;
    static rh field_e;
    static String[] field_a;
    static vc field_c;
    static long field_b;

    final static int a(int param0, int param1) {
        if (param1 <= 113) {
            field_e = (rh) null;
        }
        param0 = param0 & 8191;
        if (-4097 < (param0 ^ -1)) {
            return -2049 >= (param0 ^ -1) ? dk.field_D[4096 - param0] : dk.field_D[param0];
        }
        return -6145 < (param0 ^ -1) ? -dk.field_D[-4096 + param0] : -dk.field_D[8192 - param0];
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != -37) {
            jc.a(84, 50);
        }
        field_e = null;
        field_c = null;
        field_a = null;
    }

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        dd var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            var6_int = param1 + param3.field_y;
            if (param0 < -36) {
              L1: {
                var7 = param3.field_z + param4;
                pj.a((byte) 127, param3.field_u, var7, var6_int, param3.field_j);
                var8 = t.field_h[1];
                if (!(param3 instanceof bb)) {
                  break L1;
                } else {
                  if (((bb) ((Object) param3)).field_G) {
                    var8.a(var6_int + (1 + (param3.field_u - var8.field_x >> -1375674303)), (-var8.field_r + param3.field_j >> -432594495) + (var7 + 1), 256);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (param3.e(1)) {
                  ek.a(param3.field_j - 4, 2 + var6_int, 2 + var7, 1, -4 + param3.field_u);
                  break L2;
                } else {
                  break L2;
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
          L3: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("jc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, boolean param2, CharSequence param3) {
        int stackIn_7_0 = 0;
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
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-3 < (param0 ^ -1)) {
                break L1;
              } else {
                if ((param0 ^ -1) >= -37) {
                  var4_int = 0;
                  if (param1 > 104) {
                    var5 = 0;
                    var6 = 0;
                    var7 = param3.length();
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var7) {
                        if (var5 == 0) {
                          throw new NumberFormatException();
                        } else {
                          stackIn_43_0 = var6;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        L3: {
                          L4: {
                            var9 = param3.charAt(var8);
                            if (-1 == (var8 ^ -1)) {
                              if (var9 != 45) {
                                if (var9 != 43) {
                                  break L4;
                                } else {
                                  if (!param2) {
                                    break L4;
                                  } else {
                                    break L3;
                                  }
                                }
                              } else {
                                var4_int = 1;
                                break L3;
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
                                if (var9 <= 90) {
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
                                if (var9 <= 122) {
                                  var9 -= 87;
                                  break L5;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            throw new NumberFormatException();
                          }
                          if (var9 < param0) {
                            L9: {
                              if (var4_int != 0) {
                                var9 = -var9;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var10 = var9 + var6 * param0;
                            if (var10 / param0 != var6) {
                              throw new NumberFormatException();
                            } else {
                              var5 = 1;
                              var6 = var10;
                              break L3;
                            }
                          } else {
                            throw new NumberFormatException();
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackIn_7_0 = 51;
                    decompiledRegionSelector0 = 0;
                    break L0;
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
          L10: {
            var4 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var4);

            stackIn_46_1 = new StringBuilder().append("jc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_43_0;
        }
    }

    static {
        field_d = "Error connecting to server. Please try using a different server.";
        field_c = null;
        field_f = 0;
        field_a = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
