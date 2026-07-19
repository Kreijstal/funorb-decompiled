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
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
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
        String stackIn_3_0 = null;
        String stackIn_41_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_40_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var10 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param1 == 192) {
              var13 = new char[param3];
              var12 = var13;
              var11 = var12;
              var4_array = var11;
              var5 = 0;
              var6 = param2;
              var7 = param2 + param3;
              L1: while (true) {
                if (var7 <= var6) {
                  stackOut_40_0 = new String(var13, 0, var5);
                  stackIn_41_0 = stackOut_40_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    incrementValue$8 = var6;
                    var6++;
                    var8 = param0[incrementValue$8] & 255;
                    if (-129 < (var8 ^ -1)) {
                      if (-1 != (var8 ^ -1)) {
                        var9 = var8;
                        break L2;
                      } else {
                        var9 = 65533;
                        break L2;
                      }
                    } else {
                      if ((var8 ^ -1) > -193) {
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
                                incrementValue$9 = var6;
                                var6++;
                                var9 = param0[incrementValue$9] & 63 | (var8 & 31) << 1013441158;
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
                                if (-129 != (192 & param0[var6] ^ -1)) {
                                  break L4;
                                } else {
                                  if ((192 & param0[var6 + 1]) == 128) {
                                    incrementValue$10 = var6;
                                    var6++;
                                    incrementValue$11 = var6;
                                    var6++;
                                    var9 = param0[incrementValue$10] << 730108486 & 4032 | var8 << 1647473388 & 61440 | 63 & param0[incrementValue$11];
                                    if (-2049 >= (var9 ^ -1)) {
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
                                  if ((param0[var6] & 192 ^ -1) != -129) {
                                    break L5;
                                  } else {
                                    if ((192 & param0[var6 + 1] ^ -1) != -129) {
                                      break L5;
                                    } else {
                                      if ((param0[var6 - -2] & 192) == 128) {
                                        L6: {
                                          incrementValue$12 = var6;
                                          var6++;
                                          incrementValue$13 = var6;
                                          var6++;
                                          incrementValue$14 = var6;
                                          var6++;
                                          var9 = 1835008 & var8 << 2080498002 | (param0[incrementValue$12] & 63) << -335295220 | (param0[incrementValue$13] & 63) << -395589018 | param0[incrementValue$14] & 63;
                                          if (65536 > var9) {
                                            break L6;
                                          } else {
                                            if ((var9 ^ -1) < -1114112) {
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
                  incrementValue$15 = var5;
                  var5++;
                  var11[incrementValue$15] = (char)var9;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = (String) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var4);
            stackOut_42_1 = new StringBuilder().append("uh.F(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L7;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L7;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_41_0;
        }
    }

    final wh a(int param0) {
        wh discarded$0 = null;
        if (param0 != 0) {
            discarded$0 = this.a(106);
            return ea.field_q;
        }
        return ea.field_q;
    }

    static {
        field_o = "Show All";
        field_p = null;
    }
}
