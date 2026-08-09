/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends kd {
    int field_p;
    ei[] field_k;
    int[] field_m;
    int[] field_n;
    byte[][][] field_o;
    ei[] field_i;
    int field_j;
    static int[] field_l;
    int[] field_h;

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            RuntimeException var3_ref = null;
            java.applet.Applet var4 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            StringBuilder stackIn_11_1 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var3_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var3 = new java.net.URL(param2.getCodeBase(), param0);
                    var3 = gf.a(3, var3, param2);
                    m.a(true, true, var3.toString(), param2);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var3_ref2 = (Exception) (Object) decompiledCaughtException;
                    var3_ref2.printStackTrace();
                    break L2;
                  }
                }
                if (param1 < -65) {
                  break L0;
                } else {
                  var4 = (java.applet.Applet) null;
                  pd.a((String) null, -123, (java.applet.Applet) null);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var3_ref);

                stackIn_8_1 = new StringBuilder().append("pd.D(");

                if (param0 == null) {
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
              L4: {


                stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                param0 = ne.a((char)param2, "", param0, (byte) -126);
                var3 = ci.a(param1, (byte) -79);
                if (param0.indexOf(param1) != -1) {
                  break L2;
                } else {
                  if (-1 == param0.indexOf(var3)) {
                    stackIn_5_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_5_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("pd.C(");

            if (param0 == null) {
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
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(int param0) {
        ul var1;
        var1 = (ul) ((Object) vb.field_m.a(31334));
        if (var1 != null) {
          lf.a(var1.field_h, var1.field_j, var1.field_n);
          lf.g(var1.field_l, var1.field_i, var1.field_p, var1.field_m);
          var1.field_h = null;
          pb.field_k.b(125, var1);
          if (param0 != -22949) {
            field_l = (int[]) null;
            return;
          } else {
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    pd() {
    }

    public static void b(int param0) {
        int var1 = 86 % ((param0 - -51) / 42);
        field_l = null;
    }

    static {
        field_l = new int[8192];
    }
}
