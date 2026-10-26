/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static byte[][] field_d;
    static java.applet.Applet field_c;
    static int field_e;
    static int field_a;
    static String field_b;

    final static void a(int param0) {
        int var2 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = ho.field_b;
        synchronized (var1) {
          oj.field_g = oj.field_g + 1;
          vu.heldMouseButton = mp.field_g;
          ic.field_b = sj.field_a;
          cf.field_g = qd.field_m;
          uu.pointerMoved = si.field_b;
          si.field_b = false;
          vj.pressedMouseButton = me.field_b;
          ln.field_c = kg.field_a;
          lq.field_a = SteeringMode.field_e;
          me.field_b = 0;
          var2 = -26 / ((param0 - 11) / 61);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 5 % ((-54 - param0) / 58);
        field_d = (byte[][]) null;
        field_c = null;
    }

    final static int b(int param0) {
        if (param0 != 0) {
          fb.b(-21);
          return he.field_n;
        }
        return he.field_n;
    }

    static {
        field_d = new byte[50][];
        field_a = 0;
    }
}
