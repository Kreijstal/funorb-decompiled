/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static java.math.BigInteger field_a;
    static int[] field_c;
    static int field_d;
    static String field_b;

    public static void a(boolean param0) {
        if (!param0) {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
        fb var2 = (fb) null;
        ja.a((fb) null, 3, (fb) null);
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static boolean a(fb param0, int param1, fb param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          if (param1 != 200) {
            field_c = (int[]) null;
          }
          var3_int = param2.field_mb - param0.field_mb;
          if (param2.field_kb == u.field_d) {
            var3_int -= 200;
          } else {
            if (null == param2.field_kb) {
              var3_int += 200;
            }
          }
          if (param0.field_kb != u.field_d) {
            if (param0.field_kb == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ja.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        bc discarded$0 = new bc();
        field_a = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_d = 64;
        field_c = new int[1024];
    }
}
