/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ila extends ksa {
    String field_d;

    final static void c(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            var1_int = bs.field_b[0];
            if (param0 == -15) {
              var2 = 1;
              L1: while (true) {
                if (var2 >= bs.field_b.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = bs.field_b[var2];
                  cua.a(aq.field_p, var2 << -863152860, aq.field_p, var1_int, var3);
                  var1_int = var1_int + var3;
                  var2++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "ila.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var7 = VoidHunters.field_G;
            try {
              L0: {
                if (!ch.field_o) {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      var3 = (String) (ia.a(param1, "getcookies", 12348));
                      var4 = up.a((byte) -67, ';', var3);
                      var5 = param0;
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L3: {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                              break L3;
                            } else {
                              if (var4[var5].substring(0, var6).trim().equals(var2)) {
                                stackIn_10_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L5: {
                      if (param1.getParameter("tuhstatbut") == null) {
                        stackIn_17_0 = 0;
                        break L5;
                      } else {
                        stackIn_17_0 = 1;
                        break L5;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_20_0 = (RuntimeException) (var2_ref2);

                stackIn_20_1 = new StringBuilder().append("ila.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L6;
                } else {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L6;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_10_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ila(String param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ila.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(byte[] param0, int param1) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 != null) {
              var2 = "[";
              var3 = 0;
              L1: while (true) {
                if (var3 >= param0.length) {
                  var3 = 84 % ((param1 - -26) / 46);
                  stackIn_10_0 = var2 + "]";
                  break L0;
                } else {
                  var2 = var2 + param0[var3];
                  if (-1 + param0.length > var3) {
                    var2 = var2 + ",";
                    var3++;
                    continue L1;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2_ref);

            stackIn_13_1 = new StringBuilder().append("ila.C(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    static {
    }
}
