/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends fa {
    static uc field_p;
    static dl field_q;
    static String field_o;
    static boolean field_n;

    public static void c(int param0) {
        field_p = null;
        if (param0 != 128) {
            return;
        }
        field_o = null;
        field_q = null;
    }

    uh(long param0, String param1) {
        super(param0, param1);
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        char[] var4_array = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        String stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_39_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var10 = CrazyCrystals.field_B;
        try {
          L0: {
            var15 = new char[param3];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var4_array = var11;
            var5 = 0;
            var6 = 0;
            var7 = param3;
            L1: while (true) {
              if (var7 <= var6) {
                stackOut_39_0 = new String(var15, 0, var5);
                stackIn_40_0 = stackOut_39_0;
                break L0;
              } else {
                L2: {
                  int incrementValue$8 = var6;
                  var6++;
                  var8 = param0[incrementValue$8] & 255;
                  if (var8 < 128) {
                    if (var8 != 0) {
                      var9 = var8;
                      break L2;
                    } else {
                      var9 = 65533;
                      break L2;
                    }
                  } else {
                    if (var8 < 192) {
                      var9 = 65533;
                      break L2;
                    } else {
                      if (var8 < 224) {
                        L3: {
                          if (var6 >= var7) {
                            break L3;
                          } else {
                            if ((192 & param0[var6]) != 128) {
                              break L3;
                            } else {
                              int incrementValue$9 = var6;
                              var6++;
                              var9 = param0[incrementValue$9] & 63 | (var8 & 31) << 6;
                              if (128 > var9) {
                                var9 = 65533;
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        var9 = 65533;
                        break L2;
                      } else {
                        if (240 > var8) {
                          L4: {
                            if (var7 <= 1 + var6) {
                              break L4;
                            } else {
                              if ((192 & param0[var6]) != 128) {
                                break L4;
                              } else {
                                if ((192 & param0[var6 + 1]) == 128) {
                                  int incrementValue$10 = var6;
                                  var6++;
                                  int incrementValue$11 = var6;
                                  var6++;
                                  var9 = param0[incrementValue$10] << 6 & 4032 | var8 << 12 & 61440 | 63 & param0[incrementValue$11];
                                  if (var9 >= 2048) {
                                    break L2;
                                  } else {
                                    var9 = 65533;
                                    break L2;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var9 = 65533;
                          break L2;
                        } else {
                          if (var8 < 248) {
                            L5: {
                              if (2 + var6 >= var7) {
                                break L5;
                              } else {
                                if ((param0[var6] & 192) != 128) {
                                  break L5;
                                } else {
                                  if ((192 & param0[var6 + 1]) != 128) {
                                    break L5;
                                  } else {
                                    if ((param0[var6 - -2] & 192) == 128) {
                                      L6: {
                                        int incrementValue$12 = var6;
                                        var6++;
                                        int incrementValue$13 = var6;
                                        var6++;
                                        int incrementValue$14 = var6;
                                        var6++;
                                        var9 = 1835008 & var8 << 18 | (param0[incrementValue$12] & 63) << 12 | (param0[incrementValue$13] & 63) << 6 | param0[incrementValue$14] & 63;
                                        if (65536 > var9) {
                                          break L6;
                                        } else {
                                          if (var9 > 1114111) {
                                            break L6;
                                          } else {
                                            var9 = 65533;
                                            break L2;
                                          }
                                        }
                                      }
                                      var9 = 65533;
                                      break L2;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                            var9 = 65533;
                            break L2;
                          } else {
                            var9 = 65533;
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                int incrementValue$15 = var5;
                var5++;
                var11[incrementValue$15] = (char)var9;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var4;
            stackOut_41_1 = new StringBuilder().append("uh.F(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L7;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L7;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + 192 + 44 + 0 + 44 + param3 + 41);
        }
        return stackIn_40_0;
    }

    final wh a(int param0) {
        if (param0 != 0) {
            wh discarded$0 = ((uh) this).a(106);
            return ea.field_q;
        }
        return ea.field_q;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Show All";
        field_p = null;
    }
}
