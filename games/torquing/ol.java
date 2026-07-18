/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static String field_d;
    static int[] field_c;
    static String field_e;
    static String field_b;
    static String field_a;
    static hc[] field_f;

    final static void a(String param0, boolean param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                jb.field_e = param0;
                try {
                    var3 = param2.getParameter("cookieprefix");
                    var4 = param2.getParameter("cookiehost");
                    var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                    if (!(0 != param0.length())) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    hp.a("document.cookie=\"" + var5 + "\"", 27476, param2);
                } catch (Throwable throwable) {
                }
                j.a(true, param2);
            } catch (RuntimeException runtimeException) {
                throw rb.a((Throwable) (Object) runtimeException, "ol.E(" + (param0 != null ? "{...}" : "null") + ',' + true + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(double[] param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        double[] var12 = null;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            if (ia.field_i == 8) {
              return;
            } else {
              L1: {
                if (0.0 > param0[3]) {
                  break L1;
                } else {
                  if (ap.a(param0, 6, param0, 9) < 0.0) {
                    break L1;
                  } else {
                    L2: {
                      if (param0[9] == param0[6]) {
                        if (param0[10] == param0[7]) {
                          if (param0[8] != param0[11]) {
                            stackOut_14_0 = 1;
                            stackIn_16_0 = stackOut_14_0;
                            break L2;
                          } else {
                            stackOut_13_0 = 0;
                            stackIn_16_0 = stackOut_13_0;
                            break L2;
                          }
                        } else {
                          stackOut_11_0 = 1;
                          stackIn_16_0 = stackOut_11_0;
                          break L2;
                        }
                      } else {
                        stackOut_9_0 = 1;
                        stackIn_16_0 = stackOut_9_0;
                        break L2;
                      }
                    }
                    var2_int = stackIn_16_0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= ia.field_i) {
                        L4: {
                          bn.field_f[ia.field_i] = param0;
                          nl.field_y[ia.field_i] = var2_int != 0;
                          if (param1 >= 25) {
                            break L4;
                          } else {
                            var8 = null;
                            ol.a((double[]) null, (byte) 52);
                            break L4;
                          }
                        }
                        ia.field_i = ia.field_i + 1;
                        break L0;
                      } else {
                        L5: {
                          var12 = bn.field_f[var3];
                          if (param0[9] == var12[9]) {
                            if (var12[10] != param0[10]) {
                              break L5;
                            } else {
                              if (param0[11] != var12[11]) {
                                break L5;
                              } else {
                                L6: {
                                  var5 = 0;
                                  var6 = 0;
                                  if (nl.field_y[var3] ^ var2_int == 0) {
                                    if (var2_int == 0) {
                                      if (param0[5] != var12[5]) {
                                        break L6;
                                      } else {
                                        if (var12[4] != param0[4]) {
                                          break L6;
                                        } else {
                                          if (var12[3] <= param0[3]) {
                                            var6 = 1;
                                            break L6;
                                          } else {
                                            var5 = 1;
                                            break L6;
                                          }
                                        }
                                      }
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    if (nl.field_y[var3]) {
                                      var5 = 1;
                                      break L6;
                                    } else {
                                      var6 = 1;
                                      break L6;
                                    }
                                  }
                                }
                                if (var5 != 0) {
                                  bn.field_f[var3] = param0;
                                  nl.field_y[var3] = var2_int != 0;
                                  return;
                                } else {
                                  if (var6 == 0) {
                                    break L5;
                                  } else {
                                    return;
                                  }
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var2;
            stackOut_44_1 = new StringBuilder().append("ol.C(");
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L7;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L7;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + param1 + ')');
        }
    }

    final static String a(int param0) {
        return kj.field_d.h((byte) 118);
    }

    final static int b() {
        int var1 = -85;
        return 1;
    }

    public static void a() {
        field_d = null;
        field_f = null;
        field_e = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "This is a members-only world.";
        field_c = new int[128];
        field_e = "Waiting for fonts";
        field_b = "Members";
    }
}
