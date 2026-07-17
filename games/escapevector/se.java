/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static String[] field_a;
    static p field_b;

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
    }

    final static int a(int param0) {
        return (int)(1000000000L / sn.field_d);
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 17113) {
            field_a = null;
            bo.field_F.a(0, 0, (byte) -55);
            return;
        }
        bo.field_F.a(0, 0, (byte) -55);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        long var4 = 0L;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            an.field_a = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            tj.a((byte) 71, param1, var2, var3, var4);
            if (param0 > 1) {
              break L0;
            } else {
              field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2_ref;
            stackOut_3_1 = new StringBuilder().append("se.D(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"We are entering the aliens' home system now.<br><br>The first destination is an <photo>asteroid belt on the edge of the system. Our long-range analysis has suggested that the asteroids were only excavated recently, so defences are likely to be minimal.", "When you find a container, land next to it. Your ship's tether will automatically attach to it. Guide it out of the cave and up to the mothership.<delay><br><br>Good luck, commander."};
    }
}
