/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    int field_b;
    private kda field_c;
    static wm field_d;
    static int field_a;

    protected final void finalize() throws Throwable {
        this.field_c.b(this.field_b, (byte) 18);
        super.finalize();
    }

    public static void a(boolean param0) {
        if (param0) {
          mf.a(-23);
        }
        field_d = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        int var1_int = 0;
        double var2_double = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          uoa.b();
          hma.field_a = 11;
          gta.field_g = new int[260];
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2_double = 15.0;
            gta.field_g[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2_double) * 255.0);
          }
          var1_intLifetime1 = -125 % ((param0 + 11) / 55);
          for (var2 = 256; var2 < gta.field_g.length; var2++) {
            gta.field_g[var2] = 255;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "mf.B(" + param0 + ')');
        }
    }

    mf(kda param0, int param1, int param2) {
        try {
          this.field_b = param2;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new wm();
        field_a = 50;
    }
}
