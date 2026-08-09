/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static String field_f;
    String field_g;
    String field_d;
    static int field_b;
    static oi field_c;
    boolean field_h;
    static String[] field_a;
    static o field_e;

    final static String a(String param0, int param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = wizardrun.field_H;
        try {
          L0: {
            var4_int = param3.length();
            var5 = param0.length();
            var6 = param2.length();
            if (param1 == var5) {
              throw new IllegalArgumentException("Key cannot have zero length");
            } else {
              L1: {
                var7 = var4_int;
                var8 = var6 - var5;
                if (0 == var8) {
                  break L1;
                } else {
                  var9_int = 0;
                  L2: while (true) {
                    var9_int = param3.indexOf(param0, var9_int);
                    if (-1 >= (var9_int ^ -1)) {
                      var9_int = var9_int + var5;
                      var7 = var7 + var8;
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L3: while (true) {
                var11 = param3.indexOf(param0, var10);
                if ((var11 ^ -1) <= -1) {
                  discarded$0 = var9.append(param3.substring(var10, var11));
                  discarded$1 = var9.append(param2);
                  var10 = var11 + var5;
                  continue L3;
                } else {
                  discarded$2 = var9.append(param3.substring(var10));
                  stackIn_14_0 = var9.toString();
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("wg.B(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_18_0), stackIn_24_2 + ')');
        }
        return stackIn_14_0;
    }

    final static o[] a(int param0, int param1) {
        o[] var2;
        o[] var3;
        if (param1 != 9) {
          return (o[]) null;
        } else {
          var3 = new o[9];
          var2 = var3;
          var3[4] = id.a((byte) 98, param0, 64);
          return var2;
        }
    }

    public static void a(boolean param0) {
        String var2;
        if (!param0) {
          var2 = (String) null;
          wg.a((String) null, 30, (String) null, (String) null);
          field_a = null;
          field_f = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 1234) {
                  try {
                    L1: {
                      var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                      param1.getAppletContext().showDocument(jl.a(param0 + -1338, var2, param1), "_top");
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    return;
                  }
                  return;
                } else {
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("wg.A(").append(param0).append(',');

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
              throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = "World:<col=ffff00>";
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
