/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    int field_a;
    String field_e;
    String field_d;
    static int field_f;
    String field_b;
    gk field_c;

    final static String a(int param0, int param1, int param2, byte[] param3) {
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_3_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Bounce.field_N;
        try {
          var11 = new char[param2];
          var10 = var11;
          var4 = var10;
          var5 = 0;
          var6 = 0;
          if (param1 != -3789) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          while (param2 > var6) {
            var7 = param3[var6 + param0] & 255;
            if (var7 != 0) {
              if (var7 >= 128 &&
                160 > var7) {
                var8 = sa.field_j[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var7;
            }
            var6++;
          }
          stackIn_16_0 = new String(var11, 0, var5);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("lh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 255) {
          CharSequence[] var2 = (CharSequence[]) null;
          lh.a(-62, -97, (CharSequence[]) null, 63);
        }
        return qg.field_g == vc.field_F ? true : false;
    }

    final static String a(int param0, int param1, CharSequence[] param2, int param3) {
        int var7_int = 0;
        int var8 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        CharSequence var8_ref_CharSequence = null;
        CharSequence var9 = null;
        int var10 = 0;
        CharSequence var11 = null;
        var10 = Bounce.field_N;
        try {
          if (param1 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param1 == 1) {
            var11 = param2[param3];
            var4 = var11;
            if (var4 != null) {
              stackIn_10_0 = var11.toString();
              return stackIn_10_0;
            }
            stackIn_8_0 = "null";
            return stackIn_8_0;
          }
          var4_int = param3 + param1;
          var5 = 0;
          var6 = -43 % ((-71 - param0) / 42);
          for (var7_int = param3; var4_int > var7_int; var7_int++) {
            var8_ref_CharSequence = param2[var7_int];
            if (var8_ref_CharSequence != null) {
              var5 = var5 + var8_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var7 = new StringBuilder(var5);
          for (var8 = param3; var8 < var4_int; var8++) {
            var9 = param2[var8];
            if (var9 != null) {
              discarded$0 = var7.append(var9);
            } else {
              discarded$1 = var7.append("null");
            }
          }
          stackIn_24_0 = var7.toString();
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_27_0 = var4_ref;
          stackIn_27_1 = new StringBuilder().append("lh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(')').toString());
        }
    }

    private lh() throws Throwable {
        throw new Error();
    }

    static {
    }
}
