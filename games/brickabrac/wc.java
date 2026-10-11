/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static boolean field_d;
    static int field_e;
    static boolean field_b;
    static String field_a;
    static String field_c;

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          while (true) {
            param1--;
            if (param1 < 0) {
              if (param4 == -1) {
                return;
              }
              field_a = (String) null;
              return;
            }
            var9 = param0;
            var5 = var9;
            var6 = param3;
            var7 = param2;
            var9[var6] = var7 + (ik.a(var9[var6], 16711422) >> 1);
            param3++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("wc.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 == -1) {
          mf.field_f.a(0, 0, param1 + 1);
          return;
        }
        field_d = false;
        mf.field_f.a(0, 0, param1 + 1);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 62) {
          field_e = 120;
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_a = "Quit to website";
        field_c = "Password: ";
    }
}
