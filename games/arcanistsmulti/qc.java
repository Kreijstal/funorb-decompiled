/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static am field_c;
    static String field_b;
    static int field_e;
    static String field_g;
    static String field_f;
    static int field_a;
    static kc field_d;

    final static void a(boolean param0) {
        hi.a(-123, false);
        ob.field_Y.b(480, 8110, 640);
        ob.field_Y.a((byte) -119, 1024, 1280);
        dh.a(rl.field_h, 9, 6);
        dh.a(me.field_H, 9, 8);
        if (!ArcanistsMulti.i((byte) -77)) {
            dh.a(gh.field_l, 9, 1);
            dh.a(ql.field_b, 9, 2);
            dh.a(eg.field_g, 9, 4);
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        ab var3 = he.field_e;
        var3.b((byte) -38, param2);
        var3.f(3, (byte) -22);
        var3.f(9, (byte) -98);
        var3.c(param1, (byte) -60);
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              var3_int = param2.length();
              if (var3_int < 1) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                if (var3_int <= 12) {
                  L1: {
                    if (param0 == 640) {
                      break L1;
                    } else {
                      field_c = null;
                      break L1;
                    }
                  }
                  L2: {
                    var4 = gk.a(param2, param0 + -653);
                    if (var4 == null) {
                      break L2;
                    } else {
                      if (var4.length() >= 1) {
                        L3: {
                          if (rk.a((byte) 127, var4.charAt(0))) {
                            break L3;
                          } else {
                            if (rk.a((byte) 121, var4.charAt(-1 + var4.length()))) {
                              break L3;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L4: while (true) {
                                if (param2.length() <= var6) {
                                  if (var5 <= 0) {
                                    stackOut_34_0 = 1;
                                    stackIn_35_0 = stackOut_34_0;
                                    break L0;
                                  } else {
                                    stackOut_32_0 = 0;
                                    stackIn_33_0 = stackOut_32_0;
                                    return stackIn_33_0 != 0;
                                  }
                                } else {
                                  L5: {
                                    var7 = param2.charAt(var6);
                                    if (!rk.a((byte) -63, (char) var7)) {
                                      var5 = 0;
                                      break L5;
                                    } else {
                                      var5++;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (var5 < 2) {
                                      break L6;
                                    } else {
                                      if (param1) {
                                        break L6;
                                      } else {
                                        stackOut_28_0 = 0;
                                        stackIn_29_0 = stackOut_28_0;
                                        return stackIn_29_0 != 0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0 != 0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("qc.C(").append(param0).append(44).append(param1).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L7;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 41);
        }
        return stackIn_35_0 != 0;
    }

    public static void a() {
        field_c = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_d = null;
        int var1 = -113;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new am();
        field_e = 250;
        field_g = "<%0> has resigned and left.";
        field_b = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_f = "Reject";
    }
}
