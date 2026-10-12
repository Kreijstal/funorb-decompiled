/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static kg field_f;
    static int[][] field_e;
    static int field_d;
    static String field_a;
    static String field_g;
    static String field_c;
    static String[] field_b;

    final static void a(int param0) {
        kj var2 = null;
        jm var1 = (jm) (ri.field_c.e(13058));
        kj var2Lifetime1;
        if (var1 == null) {
          pm.m(103);
          return;
        }
        if (param0 == 2158) {
          var2 = rf.field_d;
          var2.i(0);
          var2.i(0);
          var2.i(0);
          var2.i(0);
          var1.b(param0 - 2154);
          return;
        }
        CharSequence var3 = (CharSequence) null;
        bi.a(false, -110, true, (CharSequence) null);
        var2Lifetime1 = rf.field_d;
        var2Lifetime1.i(0);
        var2Lifetime1.i(0);
        var2Lifetime1.i(0);
        var2Lifetime1.i(0);
        var1.b(param0 - 2154);
    }

    final static void b(int param0) {
        ne.field_N.field_f = 0;
        ne.field_N.field_t = 0;
        if (param0 >= -49) {
          bi.b(12, -123);
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static boolean b(int param0, int param1) {
        int var2 = 76 % ((param0 - 58) / 44);
        if (param1 == 43) {
          return true;
        }
        if (param1 == 44) {
          return true;
        }
        if (param1 == 48) {
          return true;
        }
        if (31 == param1) {
          return true;
        }
        if (46 == param1) {
          return true;
        }
        if (param1 == 52) {
          return true;
        }
        if (45 == param1) {
          return true;
        }
        if (47 != param1) {
          return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_f = null;
        int var1 = -15 % ((7 - param0) / 47);
        field_b = null;
        field_e = (int[][]) null;
        field_g = null;
        field_a = null;
        field_c = null;
    }

    final static boolean a(String param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == gj.field_b) {
            return false;
          }
          if (param1) {
            stackIn_9_0 = !(param0.toLowerCase().indexOf(gj.field_b.toLowerCase()) < 0);
            return stackIn_9_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("bi.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int param1, boolean param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SteelSentinels.field_G;
        try {
          if (param1 >= 2 &&
            param1 <= 36) {
            var4_int = 0;
            var5 = param2 ? 1 : 0;
            var6 = 0;
            var7 = param3.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((0 == var8) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (var9 != 43 ||
                !param0))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  90 >= var9) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (var9 >= param1) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * param1 + var9;
                if (var6 != var10 / param1) {
                  return false;
                }
                var6 = var10;
                var5 = 1;
              }
            }
            stackIn_40_0 = var5;
            return stackIn_40_0 != 0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("bi.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    static {
        field_f = null;
        field_a = "Show lobby chat from my friends";
        field_e = new int[][]{new int[]{}, new int[]{}, new int[]{17}, new int[]{0}, new int[]{5}, new int[]{16}, new int[]{10}, new int[]{21}, new int[]{}, new int[]{26}, new int[]{1}, new int[]{6}, new int[]{22}, new int[]{33}, new int[]{}, new int[]{11}, new int[]{18}, new int[]{}, new int[]{28}, new int[]{27, 32, 29}, new int[]{7}, new int[]{2}, new int[]{}, new int[]{}, new int[]{12}, new int[]{}, new int[]{}, new int[]{19}, new int[]{}, new int[]{30}};
        field_c = "Return to lobby";
        field_g = "<%0> wants to join";
        field_b = new String[]{"Range", "Rate of fire", "Reload speed", "Area of effect", "Energy efficiency", "Kinetic damage", "Explosive damage", "Energy damage", "EMP"};
    }
}
