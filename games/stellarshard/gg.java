/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gg {
    gg field_c;
    static oj field_b;
    long field_j;
    static long field_a;
    static int field_d;
    static int field_i;
    static byte[] field_e;
    static af field_f;
    gg field_g;
    static int[] field_h;

    final static void a(String param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              df.a(param1 ^ -11, param0);
              we.a(false, param1 + 12660, ul.field_H);
              if (param1 == 97) {
                break L1;
              } else {
                gg.b((byte) -95);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gg.NB(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        L0: {
          var5 = stellarshard.field_B;
          var4_int = param0.indexOf(param2);
          if (param3 > 35) {
            break L0;
          } else {
            gg.a(-103, -1, -45, -55, 12);
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            L3: {
              if (var4_int == -1) {
                break L3;
              } else {
                param0 = param0.substring(0, var4_int) + param1 + param0.substring(var4_int - -param2.length());
                stackOut_4_0 = (String) param0;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var5 != 0) {
                  break L2;
                } else {
                  var4_int = ((String) (Object) stackIn_5_0).indexOf(param2, var4_int - -param1.length());
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_6_0 = (String) param0;
            stackIn_7_0 = stackOut_6_0;
            break L2;
          }
          return stackIn_7_0;
        }
    }

    final boolean b(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            if (((gg) this).field_c == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param0 == 48) {
                  break L1;
                } else {
                  field_i = -18;
                  break L1;
                }
              }
              stackOut_8_0 = 1;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "gg.OB(" + param0 + ')');
        }
        return stackIn_9_0 != 0;
    }

    public static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_b = null;
              field_f = null;
              field_h = null;
              if (param0 == -127) {
                break L1;
              } else {
                field_a = 86L;
                break L1;
              }
            }
            field_e = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "gg.LB(" + param0 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((gg) this).field_c == null) {
              return;
            } else {
              L1: {
                ((gg) this).field_c.field_g = ((gg) this).field_g;
                ((gg) this).field_g.field_c = ((gg) this).field_c;
                ((gg) this).field_g = null;
                if (param0 == 20) {
                  break L1;
                } else {
                  field_b = null;
                  break L1;
                }
              }
              ((gg) this).field_c = null;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "gg.IB(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        try {
            int var5_int = -112 / ((param0 - -39) / 56);
            kg.d(false);
            ti.a(param4, param2, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "gg.JB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_35_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var6 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (var2_int > 20) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3 = new char[var2_int];
              if (!param1) {
                break L2;
              } else {
                gg.a(-62, 112, -30, 61, -127);
                break L2;
              }
            }
            var4 = 0;
            L3: while (true) {
              L4: {
                if (~var2_int >= ~var4) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      L7: {
                        var5 = param0.charAt(var4);
                        if (var5 < 65) {
                          break L7;
                        } else {
                          if (var5 <= 90) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        L9: {
                          L10: {
                            if (var5 < 97) {
                              break L10;
                            } else {
                              if (var5 <= 122) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if (48 > var5) {
                            break L8;
                          } else {
                            if (var5 > 57) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var3[var4] = (char) var5;
                        if (var6 == 0) {
                          break L5;
                        } else {
                          break L8;
                        }
                      }
                      var3[var4] = '_';
                      if (var6 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                    var3[var4] = (char)(var5 + -65 - -97);
                    break L5;
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_35_0 = new String(var3);
              stackIn_36_0 = stackOut_35_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("gg.MB(");
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L11;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L11;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + param1 + ')');
        }
        return stackIn_36_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 1;
        field_f = null;
        field_e = new byte[520];
        field_b = new oj();
        field_h = new int[1024];
    }
}
