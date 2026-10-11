/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uca {
    int field_e;
    static double field_b;
    static qea field_c;
    static int field_a;
    static int field_d;
    static iu[] field_f;

    final static String a(String param0, byte param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        mu var7 = null;
        mu var8 = null;
        kh var9 = null;
        CharSequence var10 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param0);
          if (!fs.a(true, var10)) {
            stackIn_3_0 = pk.field_v;
            return stackIn_3_0;
          }
          if (ae.field_g != 2) {
            stackIn_6_0 = dga.field_b;
            return stackIn_6_0;
          }
          var8 = wp.a(94, param0);
          if (var8 == null) {
            stackIn_10_0 = gl.$cfr$intArgs$a$53ce4ab4c593(88, hoa.field_m, new String[]{param0});
            return stackIn_10_0;
          }
          if (param1 != 102) {
            field_d = 38;
          }
          fla.field_f.a(-13854, var8);
          while (true) {
            var7 = (mu) (fla.field_f.e(115));
            if (var7 != null) {
              var7.field_Db = var7.field_Db - 1;
              continue;
            }
            break;
          }
          var8.p(19);
          var8.c(-7975);
          ii.field_a = ii.field_a - 1;
          var9 = ql.field_k;
          var9.k(param2, param1 - 3090);
          var9.field_h = var9.field_h + 1;
          var5 = var9.field_h;
          var9.i(1, 0);
          var9.a(param0, false);
          var9.d(var9.field_h - var5, (byte) -113);
          stackIn_18_0 = null;
          return (String) (stackIn_18_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("uca.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        int var1 = 79 / ((-50 - param0) / 48);
        field_f = null;
        field_c = null;
    }

    final static void a(int param0, toa param1, byte param2) {
        kh var5 = null;
        int var4 = 0;
        try {
          var5 = ql.field_k;
          var5.k(param0, -2988);
          var5.field_h = var5.field_h + 1;
          if (param2 != 93) {
            field_a = 32;
          }
          var4 = var5.field_h;
          var5.i(1, 0);
          var5.i(param1.field_i, 0);
          var5.e(param2 ^ -5253, param1.field_k);
          var5.a(param1.field_h, (byte) -22);
          var5.a(param1.field_m, (byte) 102);
          var5.a(param1.field_l, (byte) -1);
          var5.a(param1.field_g, (byte) -90);
          var5.g(var4, 64);
          var5.d(-var4 + var5.field_h, (byte) -122);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uca.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = Math.atan2(1.0, 0.0);
        field_c = new qea(new int[]{21312});
        field_a = -1;
    }
}
