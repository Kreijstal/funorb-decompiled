/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fjb implements dja {
    static String field_b;
    static String field_a;
    static kob field_c;

    public final tv a(byte param0) {
        int var2 = 124 % ((-64 - param0) / 50);
        return (tv) ((Object) new rha());
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 < 76) {
            field_b = (String) null;
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_c = (kob) null;
            return (tv[]) ((Object) new rha[param1]);
        }
        return (tv[]) ((Object) new rha[param1]);
    }

    final static nc a(String param0, nc[] param1, rqa[] param2, byte param3) throws gva {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        nc stackIn_5_0 = null;
        nc stackIn_9_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (param2.length <= var4_int) {
                if (param3 < -122) {
                  var7 = new StringBuilder("The method " + param0 + "(");
                  var5 = 0;
                  L2: while (true) {
                    if (param1.length <= var5) {
                      discarded$0 = var7.append(") is undefined.");
                      throw new gva(var7.toString());
                    } else {
                      L3: {
                        if (param1[var5].field_a) {
                          discarded$1 = var7.append(sna.a(param1[var5].field_b, (byte) 119).toString());
                          break L3;
                        } else {
                          discarded$2 = var7.append(wp.a(param1[var5].field_b.getClass(), false));
                          break L3;
                        }
                      }
                      L4: {
                        if (-1 + param1.length <= var5) {
                          break L4;
                        } else {
                          discarded$3 = var7.append(',');
                          break L4;
                        }
                      }
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  stackIn_9_0 = (nc) null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (!param2[var4_int].a(true, param0, param1)) {
                  var4_int++;
                  continue L1;
                } else {
                  stackIn_5_0 = param2[var4_int].a(param1, -123);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("fjb.D(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_29_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_9_0;
        }
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
        }
        field_b = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
        }
        field_a = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "~/";
        try {
            var0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
        }
        File discarded$0 = new File(var0);
    }
}
