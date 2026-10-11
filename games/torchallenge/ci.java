/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends ma {
    static int field_n;
    static int field_m;
    static String field_o;
    static String field_q;
    static int[][] field_p;

    final static int g(int param0) {
        if (param0 < 11) {
          CharSequence var2 = (CharSequence) null;
          ci.a(56, (CharSequence) null, 112, false);
          return 1;
        }
        return 1;
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
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
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 >= 2 &&
            36 >= param0) {
            var4_int = 0;
            var5 = 0;
            var6 = 24 % ((80 - param2) / 46);
            var7 = 0;
            var8 = param1.length();
            for (var9 = 0; var9 < var8; var9++) {
              boolean decompiledFrameRemainder0 = true;
              var10 = param1.charAt(var9);
              if ((0 == var9) &&
                (45 == var10)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var9 || (var10 != 43 ||
                !param3))) {
                if (var10 >= 48 &&
                  var10 <= 57) {
                  var10 -= 48;
                } else if (var10 >= 65 &&
                  var10 <= 90) {
                  var10 -= 55;
                } else {
                  if (97 > var10) {
                    return false;
                  }
                  if (122 < var10) {
                    return false;
                  }
                  var10 -= 87;
                }
                if (param0 <= var10) {
                  return false;
                }
                if (var4_int != 0) {
                  var10 = -var10;
                }
                var11 = var10 + var7 * param0;
                if (var7 != var11 / param0) {
                  return false;
                }
                var5 = 1;
                var7 = var11;
              }
            }
            stackIn_38_0 = var5;
            return stackIn_38_0 != 0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("ci.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ci(dj param0) {
        super(param0);
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) 24, param0) == lk.field_c) {
            stackIn_2_0 = ue.field_l;
            return stackIn_2_0;
          }
          if (param1 == -24) {
            return null;
          }
          field_o = (String) null;
          stackIn_6_0 = null;
          return (String) (stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ci.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 <= 25) {
          field_o = (String) null;
        }
        field_q = null;
        field_p = (int[][]) null;
        field_o = null;
    }

    final rj a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        rj stackIn_2_0 = null;
        rj stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!ei.a((byte) -117, var4)) {
            stackIn_2_0 = lk.field_c;
            return stackIn_2_0;
          }
          if (param0 != 24) {
            ci.g(119);
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = qh.a(var5, (byte) -125);
          if (var3_int > 0 &&
            var3_int <= 130) {
            return tf.field_w;
          }
          stackIn_9_0 = lk.field_c;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ci.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_m = 0;
        field_n = -1;
        field_o = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_p = new int[][]{new int[]{50}, new int[]{50, 50, 50, 50, 50, 50}, new int[]{50}, new int[]{50}, new int[]{50}, new int[]{50}};
    }
}
