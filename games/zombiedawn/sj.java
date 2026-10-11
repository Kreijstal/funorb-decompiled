/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static wl field_c;
    static java.awt.Frame field_a;
    static String field_b;

    final static boolean a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -53 / ((-39 - param0) / 62);
          stackIn_1_0 = ki.a(10, param1, -123, true);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("sj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (null == rn.field_b) {
          throw new IllegalStateException("NGR");
        }
        int var1 = 95 / ((param0 - 45) / 47);
        rn.field_b.field_c = true;
        p.b(1, 27102);
    }

    final static void a(int param0, int param1, int param2, vn param3) {
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = ZombieDawn.field_J;
        try {
          var11 = param3.field_z;
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (param1 != -1380633400) {
            field_b = (String) null;
          }
          for (var5 = 0; var5 < var11.length; var5++) {
            var6 = var11[var5];
            if (var6 != 0) {
              if ((65535 & var6) == 0) {
                var7 = var6 >> 16;
                var9[var5] = hi.a(eg.a(var7 * eg.a(param0 >> 16, 255) << 8, 16711864), hi.a(eg.a(var7 * eg.a(param0 >> 8, 255), 65280), eg.a(255, param0) * var7 >> 8));
              } else {
                if ((var6 & 16711935) == 0) {
                  var7 = var6 >> 8;
                  var9[var5] = hi.a(hi.a(var7 * eg.a(255, param2) >> 8, eg.a(var7 * eg.a(param2 >> 8, 255), 65280)), eg.a(16711709, eg.a(255, param2 >> 16) * var7 << 8));
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("sj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 1222359528) {
          return;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_c = new wl();
        field_b = "Use this alternative as your account name";
    }
}
