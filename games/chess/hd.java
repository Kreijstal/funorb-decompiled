/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hd {
    int field_a;
    int field_m;
    int field_k;
    int field_h;
    int field_j;
    int field_i;
    static jc field_l;
    static km field_f;
    static String field_e;
    static ci field_c;
    static int[][] field_n;
    static ci field_b;
    static ta field_g;
    static int field_d;

    public static void a(byte param0) {
        field_l = null;
        field_c = null;
        field_g = null;
        field_n = (int[][]) null;
        int var1 = 53 / ((-81 - param0) / 33);
        field_e = null;
        field_b = null;
        field_f = null;
    }

    abstract void a(int param0, int param1);

    final static int a(int param0, byte param1, boolean param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Chess.field_G;
        try {
          if (param0 >= 2 &&
            param0 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            if (param1 < 125) {
              stackIn_7_0 = -79;
              return stackIn_7_0;
            }
            for (var8 = 0; var8 < var7; var8++) {
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
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (param0 <= var9) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param0;
                if (var6 != var10 / param0) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_41_0 = var6;
            return stackIn_41_0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("hd.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_l = new jc();
        field_f = new km(640, 480);
    }
}
