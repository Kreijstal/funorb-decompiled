/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static ai field_a;
    static o field_c;
    static o[] field_b;
    static String field_d;

    final static void a(long param0, String param1, boolean param2, String param3, java.applet.Applet param4) {
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
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                try {
                  L1: {
                    if (!param2) {
                      L2: {
                        var8 = param4.getParameter("cookiehost");
                        var7 = var8;
                        var7 = var8;
                        var9 = param1 + "=" + param3 + "; version=1; path=/; domain=" + var8;
                        var7 = var9;
                        var7 = var9;
                        if (param0 < 0L) {
                          var7 = var9 + "; Discard;";
                          break L2;
                        } else {
                          var7 = var9 + "; Expires=" + fc.a((byte) -23, d.a((byte) 90) + 1000L * param0) + "; Max-Age=" + param0;
                          break L2;
                        }
                      }
                      cl.a(param4, "document.cookie=\"" + var7 + "\"", (byte) -121);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = decompiledCaughtException;
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("fa.C(").append(param0).append(',');

                if (param1 == null) {
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


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');

                if (param3 == null) {
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


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

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
              throw bd.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(byte param0, String param1, String param2, char param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 > 42) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            L2: {
              var4_int = param2.length();
              var5 = param1.length();
              var6 = var4_int;
              var7 = -1 + var5;
              if (var7 != 0) {
                var8_int = 0;
                L3: while (true) {
                  var8_int = param2.indexOf((int) param3, var8_int);
                  if ((var8_int ^ -1) <= -1) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param2.indexOf((int) param3, var9);
              if (var10 < 0) {
                discarded$0 = var8.append(param2.substring(var9));
                stackIn_13_0 = var8.toString();
                break L0;
              } else {
                discarded$1 = var8.append(param2.substring(var9, var10));
                discarded$2 = var8.append(param1);
                var9 = 1 + var10;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("fa.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ')');
        }
        return stackIn_13_0;
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 != 52) {
            String var2 = (String) null;
            fa.a((byte) -111, (String) null, (String) null, '7');
        }
    }

    final static void a(String param0, int param1) {
        try {
            dh.field_c = param0;
            jc.a((byte) 42, param1);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "fa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_d = "Falling off the bottom of the screen will";
    }
}
