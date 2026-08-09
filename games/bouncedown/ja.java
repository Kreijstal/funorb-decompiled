/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static java.math.BigInteger field_a;
    static int[] field_c;
    static int field_d;
    static String field_b;

    public static void a(boolean param0) {
        fb var2;
        if (param0) {
          var2 = (fb) null;
          ja.a((fb) null, 3, (fb) null);
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static boolean a(fb param0, int param1, fb param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (param1 == 200) {
                break L1;
              } else {
                field_c = (int[]) null;
                break L1;
              }
            }
            L2: {
              var3_int = param2.field_mb + -param0.field_mb;
              if (param2.field_kb == u.field_d) {
                var3_int -= 200;
                break L2;
              } else {
                if (null != param2.field_kb) {
                  break L2;
                } else {
                  var3_int += 200;
                  break L2;
                }
              }
            }
            L3: {
              if (param0.field_kb != u.field_d) {
                if (param0.field_kb != null) {
                  break L3;
                } else {
                  var3_int -= 200;
                  break L3;
                }
              } else {
                var3_int += 200;
                break L3;
              }
            }
            L4: {
              if (var3_int <= 0) {
                stackIn_14_0 = 0;
                break L4;
              } else {
                stackIn_14_0 = 1;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("ja.B(");

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
          throw ii.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    static {
        bc discarded$0 = new bc();
        field_a = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_d = 64;
        field_c = new int[1024];
    }
}
