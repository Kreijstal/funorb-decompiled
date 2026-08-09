/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static String field_b;
    static int[] field_a;
    static kr field_c;

    final static void a(int param0, int param1, int param2, boolean param3, si param4) {
        RuntimeException var5 = null;
        fk stackIn_2_0;
        si stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        fk stackIn_3_0 = null;
        si stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = jp.field_n;

              stackIn_2_1 = (si) (param4);

              stackIn_2_2 = param2;

              stackIn_2_3 = 1000000;

              if (param3) {
                stackIn_3_0 = (fk) ((Object) stackIn_2_0);
                stackIn_3_1 = (si) ((Object) stackIn_2_1);
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = stackIn_2_3;
                stackIn_3_4 = 0;
                break L1;
              } else {
                stackIn_3_0 = (fk) ((Object) stackIn_2_0);
                stackIn_3_1 = (si) ((Object) stackIn_2_1);
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = stackIn_2_3;
                stackIn_3_4 = 1;
                break L1;
              }
            }
            ((fk) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4 != 0, (byte) 75, param1);
            if (param0 == -1) {
              break L0;
            } else {
              field_b = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("pd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = param0.getDocumentBase().getFile();
                      var3 = var2.indexOf('?');
                      var4 = "reload.ws";
                      if (-1 >= (var3 ^ -1)) {
                        var4 = var4 + var2.substring(var3);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var5 = new java.net.URL(param0.getCodeBase(), var4);
                    param0.getAppletContext().showDocument(ar.a(param0, var5, 0), "_self");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref2 = (Exception) (Object) decompiledCaughtException;
                    var2_ref2.printStackTrace();
                    break L3;
                  }
                }
                if (param1 == 1000000) {
                  break L0;
                } else {
                  field_b = (String) null;
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var2_ref);

                stackIn_11_1 = new StringBuilder().append("pd.A(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              throw wn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 1000000) {
            return;
        }
        field_c = null;
    }

    static {
        field_b = "You appear to be telling someone your password - please don't!";
    }
}
