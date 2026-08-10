/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends gg {
    static String field_k;
    static int field_l;
    static o[] field_i;
    static na field_j;
    static String field_h;

    private wi() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
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
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-3 < (param3 ^ -1)) {
                break L1;
              } else {
                if (36 < param3) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  if (param0 == -913) {
                    var6 = 0;
                    var7 = param2.length();
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var7) {
                        stackIn_44_0 = var5;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        L3: {
                          L4: {
                            var9 = param2.charAt(var8);
                            if (var8 == 0) {
                              if (var9 == 45) {
                                var4_int = 1;
                                break L3;
                              } else {
                                if (var9 != 43) {
                                  break L4;
                                } else {
                                  if (!param1) {
                                    break L4;
                                  } else {
                                    var8++;
                                    continue L2;
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
                                if (var9 <= 90) {
                                  var9 -= 55;
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            if (var9 < 97) {
                              stackIn_29_0 = 0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              if (var9 <= 122) {
                                var9 -= 87;
                                break L5;
                              } else {
                                return false;
                              }
                            }
                          }
                          if (param3 <= var9) {
                            stackIn_35_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L8: {
                              if (var4_int == 0) {
                                break L8;
                              } else {
                                var9 = -var9;
                                break L8;
                              }
                            }
                            var10 = var6 * param3 + var9;
                            if (var10 / param3 == var6) {
                              var5 = 1;
                              var6 = var10;
                              break L3;
                            } else {
                              stackIn_40_0 = 0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackIn_7_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackIn_47_0 = (RuntimeException) (var4);

            stackIn_47_1 = new StringBuilder().append("wi.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L9;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L9;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_29_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_35_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_40_0 != 0;
              } else {
                return stackIn_44_0 != 0;
              }
            }
          }
        }
    }

    final static void c(int param0, int param1) {
        jd var2 = id.field_c;
        var2.e(param1, -2147483648);
        var2.c(114, param0);
        var2.c(75, 0);
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != -26923) {
            wi.b(-104, -27);
        }
        field_i = null;
        field_j = null;
        field_k = null;
    }

    final static int b(int param0, int param1) {
        int var2;
        L0: {
          L1: {
            var2 = 0;
            if (param1 < 0) {
              break L1;
            } else {
              if (param1 >= 65536) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var2 += 16;
          param1 = param1 >>> 16;
          break L0;
        }
        L2: {
          if ((param1 ^ -1) > -257) {
            break L2;
          } else {
            var2 += 8;
            param1 = param1 >>> 8;
            break L2;
          }
        }
        L3: {
          if (-17 >= (param1 ^ -1)) {
            param1 = param1 >>> 4;
            var2 += 4;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param1 < 4) {
            break L4;
          } else {
            var2 += 2;
            param1 = param1 >>> 2;
            break L4;
          }
        }
        if (param0 >= 72) {
          L5: {
            if (param1 < 1) {
              break L5;
            } else {
              var2++;
              param1 = param1 >>> 1;
              break L5;
            }
          }
          return param1 + var2;
        } else {
          return -3;
        }
    }

    static {
        field_l = 250;
        field_k = "Type your password again to make sure it's correct";
        field_h = "Updates will sent to the email address you've given";
    }
}
