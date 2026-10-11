/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    int field_c;
    static int field_a;
    int field_b;
    static ea[] field_e;
    static ed field_g;
    static String field_d;
    int field_h;
    int field_f;

    final static void a(boolean param0, java.applet.Applet param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param1.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (ah.a(-97, var3) != 0L) {
              if (!param0) {
                field_g = (ed) null;
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("vk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int[] a(int param0, int param1, byte param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = MinerDisturbance.field_ab;
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = (16760123 & param1) >> 16;
        int var5 = (param1 & 65356) >> 8;
        int var6 = param1 & 255;
        int var7 = (param0 & 16713763) >> 16;
        int var8 = 255 & param0 >> 8;
        int var9 = param0 & 255;
        if (param2 != 105) {
          vk.a(114);
        }
        for (var10 = 0; var10 < 256; var10++) {
          var11 = -var10 + 256;
          var13[var10] = ((var10 * var5 >> 8) + (var8 * var11 >> 8) << 8) + ((var10 * var4 >> 8) + (var11 * var7 >> 8) << 16) - (-(var11 * var9 >> 8) - (var6 * var10 >> 8));
        }
        return var3;
    }

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        field_d = null;
        if (param0 <= 5) {
          vk.a(-78);
        }
    }

    static {
        field_d = "Played with Science";
    }
}
