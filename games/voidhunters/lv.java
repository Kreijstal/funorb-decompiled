/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lv extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, -128);
          }
          si.a(213, 62, param0[0].a(119));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lv.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    lv(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9;
        int var9Lifetime1;
        param2 = param2 - param7;
        param1 = param1 - param7;
        param6 = param6 - param3;
        param4 = param4 - param3;
        if (param6 <= param4) {
          if (-param0 > param4) {
            return -1;
          }
          if (param0 < param6) {
            return -1;
          }
        } else {
          if (-param0 > param6) {
            return -1;
          }
          if (param4 > param0) {
            return -1;
          }
        }
        if (param2 <= param1) {
          if (param1 < -param0) {
            return -1;
          }
          if (param2 > param0) {
            return -1;
          }
        } else {
          if (param2 < -param0) {
            return -1;
          }
          if (param0 < param1) {
            return -1;
          }
        }
        var9 = vkb.a(34, param1 ^ param1 >> 31 | param4 >> 31 ^ param4 | param6 ^ param6 >> 31 | param2 >> 31 ^ param2 | param0 >> 31 ^ param0) - 12;
        if (var9 > 0) {
          param0 = param0 >> var9;
          param6 = param6 >> var9;
          param1 = param1 >> var9;
          param4 = param4 >> var9;
          param2 = param2 >> var9;
        }
        if (param0 <= 0) {
          return -1;
        }
        var9Lifetime1 = param0 * param0;
        if (param8 <= 26) {
          return -122;
        }
        if (var9Lifetime1 > param4 * param4 + param1 * param1 &&
          param2 * param2 + param6 * param6 < var9Lifetime1) {
          return (1 << param5) + 1;
        }
        param2 = param2 - param1;
        param6 = param6 - param4;
        return vu.b(-var9Lifetime1 + param1 * param1 + param4 * param4, 0, param6 * param4 + param2 * param1 << 1, param5, param6 * param6 + param2 * param2 << 1);
    }

    public static void a(int param0) {
        field_o = null;
        int var1 = 15 % ((-67 - param0) / 54);
    }

    static {
        field_o = "If you are not, please change your password to something more obscure!";
    }
}
