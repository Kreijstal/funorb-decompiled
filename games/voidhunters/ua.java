/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              si.a(67, 62, param0[0].a(51));
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = (CharSequence) null;
                ua.a(false, (CharSequence) null, true, -5);
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ua.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    ua(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(boolean param0, CharSequence param1, boolean param2, int param3) {
        int stackIn_45_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
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
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (-3 < (param3 ^ -1)) {
                break L1;
              } else {
                if (-37 <= (param3 ^ -1)) {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    if (param2) {
                      break L2;
                    } else {
                      field_o = 6;
                      break L2;
                    }
                  }
                  var7 = param1.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackIn_45_0 = var6;
                        break L0;
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param1.charAt(var8);
                          if (-1 == (var8 ^ -1)) {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (43 != var9) {
                                break L5;
                              } else {
                                if (param0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (48 > var9) {
                              break L7;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
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
                              if (var9 <= 122) {
                                var9 -= 87;
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (param3 <= var9) {
                          throw new NumberFormatException();
                        } else {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = var9 + var6 * param3;
                          if (var6 != var10 / param3) {
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
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_48_0 = (RuntimeException) (var4);

            stackIn_48_1 = new StringBuilder().append("ua.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L11;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L11;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_45_0;
    }

    static {
        field_o = 1;
    }
}
