/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an implements Runnable {
    volatile boolean field_c;
    volatile tb[] field_e;
    static int[] field_d;
    static int field_b;
    static SceneWidget field_a;
    static int field_h;
    pn field_j;
    static dd field_i;
    static String[] field_g;
    volatile boolean field_f;

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int var5 = SteelSentinels.obfuscationControl;
        int var4 = 83 % ((param3 - 35) / 50);
        if (param0 == -1) {
          qf.a(param2, (byte) -122);
          return;
        }
        if (param0 == -2) {
          SoftwareRaster.b();
          return;
        }
        if (param1) {
          qf.a(false, (byte) -117);
        }
        i.field_e[param0].r(0);
    }

    public final void run() {
        int var1_int = 0;
        tb var2 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        String var5 = null;
        var4 = SteelSentinels.obfuscationControl;
        this.field_f = true;
        try {
          try {
            while (!this.field_c) {
              for (var1_int = 0; 2 > var1_int; var1_int++) {
                var2 = this.field_e[var1_int];
                if (var2 != null) {
                  var2.b();
                }
              }
              a.a((byte) 118, 10L);
              le.a((Object) null, 50, this.field_j);
            }
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var5 = (String) null;
            sj.a((String) null, -72, (Throwable) ((Object) var1));
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
          } else {
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_f = false;
          throw an.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_f = false;
    }

    public static void a(byte param0) {
        field_d = null;
        field_i = null;
        field_g = null;
        if (param0 != -63) {
          field_h = -29;
          field_a = null;
          return;
        }
        field_a = null;
    }

    an() {
        this.field_e = new tb[2];
        this.field_c = false;
        this.field_f = false;
    }

    static {
        field_b = 100;
        field_h = 20;
        field_d = new int[8192];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
