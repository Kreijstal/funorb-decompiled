/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String field_b;
    static hl field_a;
    static int field_e;
    static String field_d;
    static boolean field_c;

    final static boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return nl.a((byte) 127, qj.field_a, vj.field_o);
    }

    final static int a(boolean param0, int param1) {
        int var2;
        int var3;
        L0: {
          var2 = 0;
          if ((7 & param1) == 0) {
            break L0;
          } else {
            var2 = 8 + -(7 & param1);
            break L0;
          }
        }
        if (param0) {
          k.a(true, -38);
          var3 = var2 + param1;
          return var3;
        } else {
          var3 = var2 + param1;
          return var3;
        }
    }

    final static String a(String param0, boolean param1, String param2, String param3) {
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
        var12 = TetraLink.field_J;
        try {
          L0: {
            var4_int = param3.length();
            var5 = param2.length();
            var6 = param0.length();
            if (0 == var5) {
              throw new IllegalArgumentException("Key cannot have zero length");
            } else {
              L1: {
                var7 = var4_int;
                var8 = -var5 + var6;
                if (var8 == 0) {
                  break L1;
                } else {
                  var9_int = 0;
                  L2: while (true) {
                    var9_int = param3.indexOf(param2, var9_int);
                    if (var9_int < 0) {
                      break L1;
                    } else {
                      var7 = var7 + var8;
                      var9_int = var9_int + var5;
                      continue L2;
                    }
                  }
                }
              }
              L3: {
                var9 = new StringBuilder(var7);
                if (!param1) {
                  break L3;
                } else {
                  field_d = (String) null;
                  break L3;
                }
              }
              var10 = 0;
              L4: while (true) {
                var11 = param3.indexOf(param2, var10);
                if ((var11 ^ -1) > -1) {
                  discarded$0 = var9.append(param3.substring(var10));
                  stackIn_14_0 = var9.toString();
                  break L0;
                } else {
                  discarded$1 = var9.append(param3.substring(var10, var11));
                  discarded$2 = var9.append(param0);
                  var10 = var11 - -var5;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("k.A(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_18_0), stackIn_24_2 + ')');
        }
        return stackIn_14_0;
    }

    final synchronized static long a(int param0) {
        long var1;
        if (param0 != 0) {
          return -61L;
        } else {
          L0: {
            var1 = System.currentTimeMillis();
            if (var1 < af.field_f) {
              wd.field_f = wd.field_f + (af.field_f + -var1);
              break L0;
            } else {
              break L0;
            }
          }
          af.field_f = var1;
          return var1 - -wd.field_f;
        }
    }

    public static void b(int param0) {
        String var2;
        field_d = null;
        field_b = null;
        if (param0 != -14243) {
          var2 = (String) null;
          k.a((String) null, false, (String) null, (String) null);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    static {
        field_b = "<%0> must play 1 more rated game before playing with the current options.";
        field_d = "Unfortunately we are unable to create an account for you at this time.";
    }
}
