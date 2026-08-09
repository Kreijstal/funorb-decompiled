/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    static int[] field_b;
    static int field_d;
    static volatile int field_c;
    static String field_a;
    static String[] field_e;

    public static void a(int param0) {
        mf var2;
        if (param0 >= -62) {
          var2 = (mf) null;
          mi.a((mf) null, 51, -113);
          field_e = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            int var2_int = 0;
            Exception var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            int var4 = 0;
            String var5 = null;
            java.net.URL var6 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  L1: {
                    var2_int = -55 / ((param0 - -30) / 60);
                    var3 = param1.getDocumentBase().getFile();
                    var5 = var3;
                    var5 = var3;
                    var4 = var3.indexOf('?');
                    var5 = "reload.ws";
                    if (0 > var4) {
                      break L1;
                    } else {
                      var5 = var5 + var3.substring(var4);
                      break L1;
                    }
                  }
                  var6 = new java.net.URL(param1.getCodeBase(), var5);
                  param1.getAppletContext().showDocument(hg.a(param1, var6, -1), "_self");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = (Exception) (Object) decompiledCaughtException;
                var2.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("mi.B(").append(param0).append(',');

                if (param1 == null) {
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
              throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static pq a(mf param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        pq stackIn_2_0 = null;
        pq stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = param0.b(param1, (byte) 113);
            var3 = var4;
            if (param2 == 8) {
              if (var4 != null) {
                stackIn_7_0 = new pq(var4);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (pq) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("mi.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_b = new int[]{44, 45, 8};
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_a = "Cancel unrated rematch";
        field_c = 0;
    }
}
