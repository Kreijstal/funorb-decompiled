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
            j.a(param1, param2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(double[] param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        double[] var12 = null;
        int stackIn_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var7 = Torquing.field_u;
        if (ia.field_i == 8) {
          return;
        } else {
          L0: {
            if (0.0 > param0[3]) {
              break L0;
            } else {
              if (ap.a(param0, 6, param0, 9) < 0.0) {
                break L0;
              } else {
                L1: {
                  if (param0[9] == param0[6]) {
                    if (param0[10] == param0[7]) {
                      if (param0[8] != param0[11]) {
                        stackOut_13_0 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        break L1;
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_15_0 = stackOut_12_0;
                        break L1;
                      }
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_15_0 = stackOut_10_0;
                      break L1;
                    }
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_15_0 = stackOut_8_0;
                    break L1;
                  }
                }
                var2 = stackIn_15_0;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= ia.field_i) {
                    L3: {
                      bn.field_f[ia.field_i] = param0;
                      nl.field_y[ia.field_i] = var2 != 0;
                      if (param1 >= 25) {
                        break L3;
                      } else {
                        var8 = null;
                        ol.a((double[]) null, (byte) 52);
                        break L3;
                      }
                    }
                    ia.field_i = ia.field_i + 1;
                    return;
                  } else {
                    var12 = bn.field_f[var3];
                    if (param0[9] == var12[9]) {
                      if (var12[10] == param0[10]) {
                        if (param0[11] == var12[11]) {
                          L4: {
                            var5 = 0;
                            var6 = 0;
                            if (nl.field_y[var3] ^ var2 == 0) {
                              if (var2 == 0) {
                                if (param0[5] != var12[5]) {
                                  break L4;
                                } else {
                                  if (var12[4] != param0[4]) {
                                    break L4;
                                  } else {
                                    if (var12[3] <= param0[3]) {
                                      var6 = 1;
                                      break L4;
                                    } else {
                                      var5 = 1;
                                      break L4;
                                    }
                                  }
                                }
                              } else {
                                break L4;
                              }
                            } else {
                              if (nl.field_y[var3]) {
                                var5 = 1;
                                break L4;
                              } else {
                                var6 = 1;
                                break L4;
                              }
                            }
                          }
                          if (var5 != 0) {
                            bn.field_f[var3] = param0;
                            nl.field_y[var3] = var2 != 0;
                            return;
                          } else {
                            if (var6 != 0) {
                              return;
                            } else {
                              var3++;
                              continue L2;
                            }
                          }
                        } else {
                          var3++;
                          continue L2;
                        }
                      } else {
                        var3++;
                        continue L2;
                      }
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
          return;
        }
    }

    final static String a(int param0) {
        if (param0 <= 100) {
            return null;
        }
        return kj.field_d.h((byte) 118);
    }

    final static int b(int param0) {
        int var1 = -85 / ((-34 - param0) / 58);
        return 1;
    }

    public static void a(byte param0) {
        field_d = null;
        field_f = null;
        field_e = null;
        if (param0 != -51) {
            return;
        }
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
