/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ng {
    static byte[] field_b;
    static String field_c;
    static ok field_g;
    static int field_e;
    static String field_a;
    static String field_f;
    static int field_d;

    final static so a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        so var9 = (so) (fk.field_n.g(75));
        if (var9 == null) {
          var9 = new so();
        }
        var9.a(param3, param4, param5, param7, param6, param8, param0, false, param2);
        int var10 = -109 % ((-78 - param1) / 44);
        return var9;
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, int param3) {
        int var8 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param3 >= 2 &&
            param3 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            if (param0 != -49) {
              return true;
            }
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param1))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (param3 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + param3 * var6;
                if (var10 / param3 != var6) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_42_0 = var5;
            return stackIn_42_0 != 0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("ng.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(')').toString());
        }
    }

    abstract byte[] a(int param0, int param1);

    abstract int b(int param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          oo.b(param1, param3, param2 + param0, 10000536);
          oo.b(param1, param4 + param3, 1 + param2, 12105912);
          var5_int = 1;
          if (var5_int + param3 < oo.field_e) {
            var5_int = oo.field_e - param3;
          }
          var6 = param4;
          if (oo.field_d < param3 + var6) {
            var6 = -param3 + oo.field_d;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = var7 * 48 / param4 + 152;
            var9 = var8 | (var8 << 16 | var8 << 8);
            oo.field_i[oo.field_b * (param3 + var7) + param1] = var9;
            oo.field_i[(param3 + var7) * oo.field_b - (-param1 - param2)] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var5), "ng.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_c = null;
        if (param0 != 816) {
          field_f = (String) null;
        }
    }

    abstract be a(byte param0);

    final static String a(String param0, String param1, int param2, int param3) {
        RuntimeException var4 = null;
        ga var5 = null;
        int var6 = 0;
        ml var7 = null;
        CharSequence var8 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = (CharSequence) ((Object) param0);
          if (!em.a(var8, (byte) -38)) {
            stackIn_3_0 = u.field_f;
            return stackIn_3_0;
          }
          if (ge.field_zb != 2) {
            stackIn_7_0 = id.field_A;
            return stackIn_7_0;
          }
          var7 = md.a((byte) 90, param1);
          if (var7 == null) {
            stackIn_11_0 = vl.a(mf.field_a, new String[]{param1}, 2);
            return stackIn_11_0;
          }
          var7.a(true);
          var7.a(-4564);
          fn.field_d = fn.field_d - 1;
          if (param2 > -21) {
            ng.a(-125);
          }
          var5 = ma.field_a;
          var5.b((byte) -35, param3);
          var5.field_j = var5.field_j + 1;
          var6 = var5.field_j;
          var5.a(113, 3);
          var5.a(param0, (byte) 105);
          var5.e(89, -var6 + var5.field_j);
          stackIn_15_0 = null;
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("ng.Q(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_g = null;
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = "To report a player, right-click on their name and select the option to report abuse.";
        field_e = 320;
        field_c = "Prepare to run...";
    }
}
