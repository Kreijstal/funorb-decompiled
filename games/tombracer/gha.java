/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gha implements pp {
    private static String[] field_b;
    static char[] field_a;

    final static boolean a(int param0, int param1, int param2) {
        if (param2 <= 27) {
          return true;
        }
        return (52 & param1) != 0 ? true : false;
    }

    final static mva[] a(mva[] param0, int param1, int param2, int param3, os param4, kh param5) {
        mva[] stackIn_3_0 = null;
        mva[] stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        mva var9 = null;
        kh var10 = null;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          if (param3 != -16499) {
            stackIn_3_0 = (mva[]) null;
            return stackIn_3_0;
          }
          boolean decompiledFrameCompleted0 = true;
          var6_int = param5.b((byte) 44, param2);
          if (var6_int != 0) {
            if (param0 == null ||
              param0.length != var6_int) {
              param0 = param4.a(var6_int, -26955);
            }
            var7 = 0;
            while (var7 < var6_int) {
              if (var11 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (!uha.a(5907, param5)) {
                param0[var7] = null;
              } else {
                if (param0[var7] == null) {
                  param0[var7] = param4.a((byte) -124);
                }
                var8 = param1;
                var9 = param0[var7];
                var10 = param5;
                switch (var8) {
                  case 1:
                    var9.a(var10, false);
                    break;
                  case 2:
                    ((qs) (var9)).b(var10, true);
                    break;
                  case 3:
                    ((fc) (var9)).a(99, var10);
                    break;
                  default:
                    break;
                }
              }
              var7++;
            }
            if ((decompiledFrameCompleted0) &&
              (var11 != 0)) {
              param0 = null;
            }
          } else {
            param0 = null;
          }
          stackIn_29_0 = (mva[]) (param0);
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("gha.A(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param5 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 24 / ((param0 + 30) / 62);
        field_a = null;
    }

    final static oc a(String param0, String param1, int param2, cn param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Exception var5 = null;
        oc stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var4_int = -46 / ((-55 - param2) / 54);
          try {
            stackIn_2_0 = lga.a(param3, param1, param0, true);
            return stackIn_2_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (Exception) (Object) decompiledCaughtException;
            stackIn_4_0 = null;
            return (oc) (stackIn_4_0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("gha.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_b = new String[7];
        field_b[4] = "Light";
        field_b[3] = "Water";
        field_b[2] = "Blue Fire";
        field_b[6] = "White Light";
        field_b[5] = "Ice";
        field_b[0] = "Damage";
        field_b[1] = "Yellow Fire";
        field_a = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
