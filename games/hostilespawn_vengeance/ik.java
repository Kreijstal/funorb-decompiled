/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static mk field_d;
    static boolean field_b;
    static int field_a;
    static int field_c;

    final static int a(int param0, boolean param1, int param2, CharSequence param3) {
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
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
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-3 < (param0 ^ -1)) {
                break L1;
              } else {
                if ((param0 ^ -1) >= -37) {
                  L2: {
                    if (param2 == -6514) {
                      break L2;
                    } else {
                      var12 = (CharSequence) null;
                      ik.a(-63, false, -47, (CharSequence) null);
                      break L2;
                    }
                  }
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param3.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= var7) {
                      if (var5 != 0) {
                        stackIn_38_0 = var6;
                        break L0;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param3.charAt(var8);
                          if (0 != var8) {
                            break L5;
                          } else {
                            if (45 != var9) {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param1) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (48 > var9) {
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
                              if (var9 > 90) {
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
                          throw new NumberFormatException();
                        }
                        if (param0 <= var9) {
                          throw new NumberFormatException();
                        } else {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = var6 * param0 - -var9;
                          if (var10 / param0 != var6) {
                            throw new NumberFormatException();
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          }
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
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var4);

            stackIn_41_1 = new StringBuilder().append("ik.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L11;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L11;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
        }
        return stackIn_38_0;
    }

    public static void a(byte param0) {
        if (param0 != -63) {
            return;
        }
        field_d = null;
    }

    static {
    }
}
