/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static String field_h;
    String field_g;
    static int field_b;
    boolean field_c;
    String[] field_e;
    boolean field_a;
    static int field_f;
    int field_d;

    final static String b(byte param0) {
        if (param0 != -49) {
          field_f = 94;
          return g.field_m;
        }
        return g.field_m;
    }

    final static boolean a(int param0, int param1, byte param2, int param3, int param4, RgbSprite param5) {
        RuntimeException var6 = null;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0 = param0 - (param5.offsetX + param4);
          if (param0 < 0) {
            return false;
          }
          if (param5.width <= param0) {
            return false;
          }
          param1 = param1 - (param3 + param5.offsetY);
          if (param1 >= 0 &&
            param1 < param5.height) {
            if (param2 != -24) {
              field_f = 13;
            }
            param4 = param5.pixels[param0 + param5.width * param1];
            stackIn_16_0 = (param4 != 0) && ((-16777216 & param4) != 0);
            return stackIn_16_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("oh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static String a(byte param0, String param1, String param2, String param3) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var4 = param2.indexOf(param3);
        while (var4 != -1) {
          param2 = param2.substring(0, var4) + param1 + param2.substring(var4 + param3.length());
          var4 = param2.indexOf(param3, param1.length() + var4);
        }
        if (param0 == 13) {
          return param2;
        }
        field_b = -3;
        return param2;
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 < 57) {
          oh.a((byte) 49);
        }
    }

    oh(boolean param0) {
        this.field_c = param0 ? true : false;
    }

    static {
        field_h = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_b = 1;
    }
}
