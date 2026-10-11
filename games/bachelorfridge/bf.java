/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bf extends bw {
    static lw[] field_h;
    static hw[] field_g;
    static boolean field_f;

    abstract void a(op param0, int param1);

    bf() {
    }

    final static boolean a(int param0, int param1, boolean param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        var11 = BachelorFridge.field_y;
        try {
          if (param1 != -44) {
            var12 = (CharSequence) null;
            bf.a(118, -16, false, (CharSequence) null);
          }
          if (param0 >= 2 &&
            36 >= param0) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((var8 == 0) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param2))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (param0 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param0 * var6 + var9;
                if (var6 != var10 / param0) {
                  return false;
                }
                var6 = var10;
                var5 = 1;
              }
            }
            stackIn_43_0 = var5;
            return stackIn_43_0 != 0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("bf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, byte param2) {
        ik var5 = null;
        String var6_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        nea var3 = hj.b(0, param0, param1);
        int var4 = 6 / ((-4 - param2) / 36);
        ik var5Lifetime1;
        if (var3 != null) {
          ms.field_u.a(117, false);
          var5 = ms.field_u;
          var6_ref_String = cd.field_p;
          var5.field_a.a(var6_ref_String, true, 5);
          var5Lifetime1 = ms.field_u;
          var6 = nfa.field_a;
          var7 = jc.field_r;
          var5Lifetime1.field_a.a(0, false, var6, 0, var7);
        }
        wb.a(param1, param0, -115);
    }

    public static void c(byte param0) {
        int var1 = -105 / ((param0 + 1) / 57);
        field_g = null;
        field_h = null;
    }

    abstract void a(int param0, lu param1);

    static {
    }
}
