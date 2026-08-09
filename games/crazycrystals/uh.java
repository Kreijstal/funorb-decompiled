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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        String stackIn_3_0 = null;
        String stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        var10 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param1 == 192) {
              var13 = new char[param3];
              var12 = var13;
              var11 = var12;
              var4 = var11;
              var5 = 0;
              var6 = param2;
              var7 = param2 + param3;
              L1: while (true) {
                if (var7 <= var6) {
                  stackIn_41_0 = new String(var13, 0, var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    incrementValue$0 = var6;
                    var6++;
                    var8 = param0[incrementValue$0] & 255;
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
                                incrementValue$1 = var6;
                                var6++;
                                var9 = param0[incrementValue$1] & 63 | (var8 & 31) << 1013441158;
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
                                    incrementValue$2 = var6;
                                    var6++;
                                    incrementValue$3 = var6;
                                    var6++;
                                    var9 = param0[incrementValue$2] << 730108486 & 4032 | var8 << 1647473388 & 61440 | 63 & param0[incrementValue$3];
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
                                          incrementValue$4 = var6;
                                          var6++;
                                          incrementValue$5 = var6;
                                          var6++;
                                          incrementValue$6 = var6;
                                          var6++;
                                          var9 = 1835008 & var8 << 2080498002 | (param0[incrementValue$4] & 63) << -335295220 | (param0[incrementValue$5] & 63) << -395589018 | param0[incrementValue$6] & 63;
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
                  incrementValue$7 = var5;
                  var5++;
                  var11[incrementValue$7] = (char)var9;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var4_ref);

            stackIn_44_1 = new StringBuilder().append("uh.F(");

            if (param0 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L7;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
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
        if (param0 != 0) {
            this.a(106);
            return ea.field_q;
        }
        return ea.field_q;
    }

    static {
        field_o = "Show All";
        field_p = null;
    }
}
