/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static String field_c;
    static int[] field_d;
    static boolean[] field_e;
    static char[] field_g;
    static int field_a;
    static String field_b;
    static int[] field_f;

    final static ti[] a(int param0, ci param1, int param2, int param3) {
        RuntimeException var4 = null;
        ti[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ti[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -31) {
            stackIn_2_0 = (ti[]) null;
            return stackIn_2_0;
          }
          if (rl.a(param0, 0, param3, param1)) {
            stackIn_7_0 = bc.a((byte) 106);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (ti[]) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("cc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        int var6 = 0;
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var10 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 != 15923) {
            field_f = (int[]) null;
          }
          var10 = new char[param2];
          var4 = var10;
          var5 = 0;
          for (var6 = 0; var6 < param2; var6++) {
            var7 = 255 & param3[var6 + param0];
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = af.field_a[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$0 = var5;
              var5++;
              var10[incrementValue$0] = (char)var7;
            }
          }
          stackIn_17_0 = new String(var10, 0, var5);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("cc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
          field_f = (int[]) null;
        }
        field_f = null;
        field_c = null;
        field_g = null;
        field_d = null;
        field_b = null;
    }

    static {
        field_g = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_b = "Connection restored.";
        field_c = "Quit";
        field_a = 0;
        field_f = new int[]{0, 0, 4, 6, 5, 2, 2, 3, 0, 6, 1, 6, 0, 7, 2, 5, 4, 7, 7};
        field_d = new int[4];
    }
}
