/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static int field_c;
    static mj field_a;
    static String field_b;
    static int field_g;
    static String field_e;
    static int[] field_f;
    static fi field_d;

    final static void a(byte param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = StarCannon.field_A;
        try {
          gl.b();
          sd.field_e = new int[260];
          fb.field_r = 11;
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            sd.field_e[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (sd.field_e.length > var5) {
            sd.field_e[var5] = 255;
            var5++;
          }
          if (param0 != -68) {
            field_g = 120;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "p.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
        if (param0 != 11) {
          p.a((byte) -118);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = "SPACE or CTRL   Fire Guns";
        field_a = new mj("email");
        field_e = "Collect <img=0> to power up your lasers";
        field_f = new int[8192];
    }
}
