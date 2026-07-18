/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends mc {
    boolean field_s;
    int[] field_u;
    static boolean field_r;
    int field_t;
    static byte[] field_q;
    static int field_n;
    static vl field_p;
    static jb field_o;

    public static void b(byte param0) {
        field_p = null;
        field_o = null;
        field_q = null;
    }

    final static hb a(int param0) {
        if (param0 <= 22) {
            return null;
        }
        return new hb(i.e(-11), ld.j(-97));
    }

    final static boolean a(int param0, byte param1) {
        if (param0 == -1) {
            return true;
        }
        if (param1 <= 104) {
            hb discarded$0 = cf.a(-75);
        }
        return (1 << param0 & me.field_a) != 0 ? true : false;
    }

    cf() {
        ((cf) this).field_s = false;
    }

    final static mh a(String param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        mh stackIn_4_0 = null;
        mh stackIn_8_0 = null;
        mh stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        mh stackIn_26_0 = null;
        mh stackIn_40_0 = null;
        mh stackIn_44_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        mh stackOut_3_0 = null;
        mh stackOut_7_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        mh stackOut_25_0 = null;
        mh stackOut_12_0 = null;
        mh stackOut_39_0 = null;
        mh stackOut_43_0 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var6 = TetraLink.field_J;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackOut_3_0 = c.field_o;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int > 64) {
              stackOut_7_0 = nb.field_V;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              if (param0.charAt(0) == 34) {
                if (param0.charAt(var2_int - 1) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L0: while (true) {
                    if (-1 + var2_int > var4) {
                      L1: {
                        var5 = param0.charAt(var4);
                        if (var5 == 92) {
                          L2: {
                            if (var3 != 0) {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              break L2;
                            } else {
                              stackOut_20_0 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              break L2;
                            }
                          }
                          var3 = stackIn_22_0;
                          break L1;
                        } else {
                          L3: {
                            if (var5 != 34) {
                              break L3;
                            } else {
                              if (var3 != 0) {
                                break L3;
                              } else {
                                stackOut_25_0 = jg.field_h;
                                stackIn_26_0 = stackOut_25_0;
                                return stackIn_26_0;
                              }
                            }
                          }
                          var3 = 0;
                          break L1;
                        }
                      }
                      var4++;
                      continue L0;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_12_0 = jg.field_h;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              } else {
                var3 = 0;
                var4 = 0;
                L4: while (true) {
                  if (var4 < var2_int) {
                    L5: {
                      var5 = param0.charAt(var4);
                      if (var5 == 46) {
                        L6: {
                          if (0 == var4) {
                            break L6;
                          } else {
                            if (var4 == -1 + var2_int) {
                              break L6;
                            } else {
                              if (var3 != 0) {
                                break L6;
                              } else {
                                var3 = 1;
                                break L5;
                              }
                            }
                          }
                        }
                        stackOut_39_0 = jg.field_h;
                        stackIn_40_0 = stackOut_39_0;
                        return stackIn_40_0;
                      } else {
                        if (lc.field_c.indexOf(var5) != -1) {
                          var3 = 0;
                          break L5;
                        } else {
                          stackOut_43_0 = jg.field_h;
                          stackIn_44_0 = stackOut_43_0;
                          return stackIn_44_0;
                        }
                      }
                    }
                    var4++;
                    continue L4;
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var2;
            stackOut_48_1 = new StringBuilder().append("cf.B(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L7;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L7;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ',' + -124 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new byte[520];
        field_r = false;
    }
}
