/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class te {
    static String field_b;
    static int field_a;

    final static kc a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Main.field_T;
        kc var6 = new kc(param0, param0);
        kc var3 = var6;
        if (param1 >= -123) {
            return (kc) null;
        }
        for (var4 = 0; var4 < var3.field_r.length; var4++) {
            var6.field_r[var4] = param2;
        }
        return var3;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 87) {
            te.a(64, 51, -77);
        }
    }

    abstract void a(java.awt.Component param0, boolean param1);

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var3 = (String) null;
                te.a(false, (String) null);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length() < lg.field_k) {
                  break L2;
                } else {
                  if (param1.length() > jd.field_g) {
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("te.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    abstract void a(int param0, java.awt.Component param1);

    abstract int b(int param0);

    final static boolean a(int param0, int param1, CharSequence param2, boolean param3) {
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
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
        var11 = Main.field_T;
        try {
          L0: {
            L1: {
              if (-3 < (param0 ^ -1)) {
                break L1;
              } else {
                if ((param0 ^ -1) < -37) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var7 <= var8) {
                      if (param1 > 62) {
                        stackIn_43_0 = var5;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        stackIn_41_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      L3: {
                        L4: {
                          var9 = param2.charAt(var8);
                          if ((var8 ^ -1) != -1) {
                            break L4;
                          } else {
                            if (var9 != 45) {
                              if (var9 != 43) {
                                break L4;
                              } else {
                                if (!param3) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L3;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (48 > var9) {
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
                            if (97 > var9) {
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
                          stackIn_25_0 = 0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                        if (var9 < param0) {
                          L9: {
                            if (var4_int == 0) {
                              break L9;
                            } else {
                              var9 = -var9;
                              break L9;
                            }
                          }
                          var10 = var9 + var6 * param0;
                          if (var10 / param0 != var6) {
                            stackIn_36_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var5 = 1;
                            var6 = var10;
                            break L3;
                          }
                        } else {
                          stackIn_30_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                      var8++;
                      continue L2;
                    }
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

            stackIn_46_1 = new StringBuilder().append("te.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_25_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_30_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_36_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_41_0 != 0;
              } else {
                return stackIn_43_0 != 0;
              }
            }
          }
        }
    }

    static {
        field_b = "Type your email address again to make sure it's correct";
    }
}
