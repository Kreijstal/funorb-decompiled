/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static jp field_d;
    static mh field_c;
    static String field_b;
    static String field_a;

    public static void b(byte param0) {
        field_c = null;
        field_a = null;
        int var1 = -69 / ((param0 - 66) / 57);
        field_b = null;
        field_d = null;
    }

    final static String a(byte param0, int param1, int param2, byte[] param3) {
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
        String stackIn_42_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_41_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var13 = new char[param1];
            var12 = var13;
            var11 = var12;
            var4_array = var11;
            var5 = 0;
            if (param0 < -89) {
              var6 = param2;
              var7 = param1 + param2;
              L1: while (true) {
                if (var6 >= var7) {
                  stackOut_41_0 = new String(var13, 0, var5);
                  stackIn_42_0 = stackOut_41_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    incrementValue$8 = var6;
                    var6++;
                    var8 = 255 & param3[incrementValue$8];
                    if (-129 >= (var8 ^ -1)) {
                      if (var8 >= 192) {
                        if (224 > var8) {
                          L3: {
                            if (var6 >= var7) {
                              break L3;
                            } else {
                              if (-129 != (param3[var6] & 192 ^ -1)) {
                                break L3;
                              } else {
                                incrementValue$9 = var6;
                                var6++;
                                var9 = 63 & param3[incrementValue$9] | 1984 & var8 << 882579238;
                                if (var9 >= 128) {
                                  break L2;
                                } else {
                                  var9 = 65533;
                                  break L2;
                                }
                              }
                            }
                          }
                          var9 = 65533;
                          break L2;
                        } else {
                          if (240 <= var8) {
                            if ((var8 ^ -1) > -249) {
                              L4: {
                                if (var7 <= var6 + 2) {
                                  break L4;
                                } else {
                                  if ((param3[var6] & 192 ^ -1) != -129) {
                                    break L4;
                                  } else {
                                    if ((param3[var6 + 1] & 192) != 128) {
                                      break L4;
                                    } else {
                                      if (-129 == (192 & param3[2 + var6] ^ -1)) {
                                        L5: {
                                          incrementValue$10 = var6;
                                          var6++;
                                          incrementValue$11 = var6;
                                          var6++;
                                          incrementValue$12 = var6;
                                          var6++;
                                          var9 = param3[incrementValue$10] << -396318388 & 258048 | 1835008 & var8 << -110907822 | 4032 & param3[incrementValue$11] << -1285759514 | param3[incrementValue$12] & 63;
                                          if (-65537 < (var9 ^ -1)) {
                                            break L5;
                                          } else {
                                            if ((var9 ^ -1) >= -1114112) {
                                              var9 = 65533;
                                              break L2;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        var9 = 65533;
                                        break L2;
                                      } else {
                                        break L4;
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
                          } else {
                            L6: {
                              if (var6 - -1 >= var7) {
                                break L6;
                              } else {
                                if ((param3[var6] & 192 ^ -1) != -129) {
                                  break L6;
                                } else {
                                  if ((192 & param3[var6 - -1] ^ -1) == -129) {
                                    incrementValue$13 = var6;
                                    var6++;
                                    incrementValue$14 = var6;
                                    var6++;
                                    var9 = (param3[incrementValue$13] & 63) << -1842956154 | (15 & var8) << -1611718740 | param3[incrementValue$14] & 63;
                                    if (-2049 < (var9 ^ -1)) {
                                      var9 = 65533;
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var9 = 65533;
                            break L2;
                          }
                        }
                      } else {
                        var9 = 65533;
                        break L2;
                      }
                    } else {
                      if (var8 == 0) {
                        var9 = 65533;
                        break L2;
                      } else {
                        var9 = var8;
                        break L2;
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
            stackOut_43_0 = (RuntimeException) (var4);
            stackOut_43_1 = new StringBuilder().append("mj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param3 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L7;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_42_0;
        }
    }

    final static boolean a(byte param0) {
        int var1 = 5 / ((41 - param0) / 62);
        return null == ua.field_d ? qa.field_r : true;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        String discarded$0 = null;
        eb.field_n = param0;
        vq.field_A = param1;
        cc.field_H = param3;
        if (param2) {
            byte[] var5 = (byte[]) null;
            discarded$0 = mj.a((byte) 117, 3, -87, (byte[]) null);
        }
    }

    static {
        field_a = "Show all game chat";
        field_b = "Kick";
    }
}
