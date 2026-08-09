/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static o field_f;
    static int field_a;
    static boolean[] field_d;
    static boolean field_g;
    static da field_c;
    static rj field_e;
    static int field_b;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException var2_ref = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                    param1.getAppletContext().showDocument(kk.a(91, var2, param1), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref2 = (Exception) (Object) decompiledCaughtException;
                    var2_ref2.printStackTrace();
                    break L2;
                  }
                }
                if (param0 > 15) {
                  break L0;
                } else {
                  field_g = true;
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("fh.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        String var2;
        field_c = null;
        field_e = null;
        field_f = null;
        if (param0 != 58) {
          var2 = (String) null;
          fh.a((String) null, (byte) 19);
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    final static pc a(String param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        pc stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        String var6 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var3 >= var2_int) {
                      break L4;
                    } else {
                      var4 = param0.charAt(var3);
                      var8 = -49;
                      var7 = var4 ^ -1;
                      if (var5 != 0) {
                        if (var7 >= var8) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        if (var7 <= var8) {
                          if (var4 <= 57) {
                            var3++;
                            if (var5 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          } else {
                            return null;
                          }
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                  if (param1 >= 65) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var6 = (String) null;
                fh.a((String) null, (byte) -122);
                break L2;
              }
              stackIn_16_0 = si.field_C;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("fh.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    static {
        field_d = new boolean[112];
        field_g = true;
    }
}
