/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static q field_d;
    static int field_a;
    static int field_f;
    static int[] field_c;
    static String field_b;
    static int[] field_e;

    final static void a(boolean param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          if (!param0) {
            rd.a(true);
          }
          ka.c();
          ug.field_c = new int[260];
          nd.field_m = 11;
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            ug.field_c[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < ug.field_c.length) {
            ug.field_c[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "rd.A(" + param0 + ')');
        }
    }

    final static void a(String param0, boolean param1) {
        try {
          hi.a(-23883, param0);
          jj.a(param1, gb.field_c, 1702);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "rd.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 <= 46) {
          return false;
        }
        boolean decompiledFrameRemainder0 = true;
        if (bi.field_L >= 20 &&
          pa.b(-120) && (!(db.field_d > 0) ||
          Transmogrify.d(false))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    public static void a(int param0) {
        if (param0 != 28) {
          return;
        }
        field_e = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    static {
        field_d = new q();
        field_c = new int[]{0, 21, 21, 21, 8, 9, 10, 11, 11, 16, 17, 18, 17, 18, 17, 18, 17, 24, 25, 26, 27, 26, 25, 28, 29, 28, 25, 30, 24, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25};
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_f = -1;
    }
}
