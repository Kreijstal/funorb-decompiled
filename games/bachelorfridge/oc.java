/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends pu {
    static String field_m;
    static po field_l;

    public static void b(int param0) {
        if (param0 != 32586) {
            return;
        }
        field_m = null;
        field_l = null;
    }

    final static void a(java.applet.Applet param0, String param1, long param2, int param3, String param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              try {
                L0: {
                  L1: {
                    var8 = param0.getParameter("cookiehost");
                    var7 = var8;
                    var7 = var8;
                    if (param3 >= 115) {
                      break L1;
                    } else {
                      field_m = (String) null;
                      break L1;
                    }
                  }
                  L2: {
                    var9 = param1 + "=" + param4 + "; version=1; path=/; domain=" + var8;
                    var7 = var9;
                    var7 = var9;
                    if (-1L < (param2 ^ -1L)) {
                      var7 = var9 + "; Discard;";
                      break L2;
                    } else {
                      var7 = var9 + "; Expires=" + km.a(f.b((byte) 73) - -(param2 * 1000L), -1) + "; Max-Age=" + param2;
                      break L2;
                    }
                  }
                  ac.a("document.cookie=\"" + var7 + "\"", param0, 118);
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("oc.B(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L5;
                }
              }
              throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_m = "Logging in...";
    }
}
