/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static String[] field_a;
    static p field_b;

    public static void a(byte param0) {
        if (param0 != 23) {
            field_a = (String[]) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static int a(int param0) {
        if (param0 != 0) {
            field_b = (p) null;
            return (int)(1000000000L / sn.field_d);
        }
        return (int)(1000000000L / sn.field_d);
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 17113) {
            field_a = (String[]) null;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              field_a = (String[]) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2_ref);

            stackIn_5_1 = new StringBuilder().append("se.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_a = new String[]{"We are entering the aliens' home system now.<br><br>The first destination is an <photo>asteroid belt on the edge of the system. Our long-range analysis has suggested that the asteroids were only excavated recently, so defences are likely to be minimal.", "When you find a container, land next to it. Your ship's tether will automatically attach to it. Guide it out of the cave and up to the mothership.<delay><br><br>Good luck, commander."};
    }
}
