/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    int field_f;
    String field_e;
    String field_b;
    static volatile boolean field_a;
    um field_c;
    static int field_g;
    String field_d;

    final static boolean a(boolean param0, CharSequence param1, int param2, int param3) {
        int var9 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Chess.field_G;
        try {
          var4_int = 66 / ((param2 - 78) / 40);
          if (2 <= param3 &&
            param3 <= 36) {
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            for (var9 = 0; var8 > var9; var9++) {
              boolean decompiledFrameRemainder0 = true;
              var10 = param1.charAt(var9);
              if ((var9 == 0) &&
                (var10 == 45)) {
                var5 = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var9 != 0 || (var10 != 43 ||
                !param0))) {
                if (var10 >= 48 &&
                  var10 <= 57) {
                  var10 -= 48;
                } else if (var10 >= 65 &&
                  var10 <= 90) {
                  var10 -= 55;
                } else if (var10 >= 97 &&
                  var10 <= 122) {
                  var10 -= 87;
                } else {
                  return false;
                }
                if (param3 <= var10) {
                  return false;
                }
                if (var5 != 0) {
                  var10 = -var10;
                }
                var11 = var7 * param3 + var10;
                if (var11 / param3 != var7) {
                  return false;
                }
                var6 = 1;
                var7 = var11;
              }
            }
            stackIn_38_0 = var6;
            return stackIn_38_0 != 0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("hf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (param1 == 1022407519) {
          var3 = param0 >>> 31;
          return (var3 + param0) / param2 - var3;
        }
        field_a = true;
        var3Lifetime1 = param0 >>> 31;
        return (var3Lifetime1 + param0) / param2 - var3Lifetime1;
    }

    final static String a(int param0, int param1, String param2) {
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        Object stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        nk var5 = null;
        CharSequence var6 = null;
        try {
          var6 = (CharSequence) ((Object) param2);
          if (!ed.a(var6, 21257)) {
            stackIn_3_0 = qj.field_a;
            return stackIn_3_0;
          }
          if (ld.field_g != 2) {
            stackIn_7_0 = tf.field_k;
            return stackIn_7_0;
          }
          if (qd.a((byte) 13, param2)) {
            stackIn_11_0 = ed.field_a;
            return stackIn_11_0;
          }
          if (ah.a(param2, 54)) {
            stackIn_14_0 = oc.a(i.field_b, new String[]{param2}, (byte) -108);
            return stackIn_14_0;
          }
          if (100 <= wg.field_w &&
            cl.field_d <= 0) {
            stackIn_18_0 = df.field_c;
            return stackIn_18_0;
          }
          if (wg.field_w >= 200) {
            stackIn_22_0 = df.field_c;
            return stackIn_22_0;
          }
          if (va.a(param2, -19554)) {
            stackIn_26_0 = oc.a(uh.field_n, new String[]{param2}, (byte) -42);
            return stackIn_26_0;
          }
          var5 = qn.field_U;
          var5.f(param0, -88);
          var5.field_l = var5.field_l + 1;
          var4 = var5.field_l;
          if (param1 <= 72) {
            stackIn_29_0 = (String) null;
            return stackIn_29_0;
          }
          var5.c(0, (byte) -115);
          var5.a(-113, param2);
          var5.a(-var4 + var5.field_l, -1);
          stackIn_31_0 = null;
          return (String) (stackIn_31_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("hf.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    private hf() throws Throwable {
        throw new Error();
    }

    static {
        field_a = false;
        field_g = 0;
    }
}
