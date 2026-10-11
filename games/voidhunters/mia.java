/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mia implements Runnable {
    volatile boolean field_c;
    static boolean[] field_a;
    volatile vka[] field_b;
    eab field_d;
    volatile boolean field_e;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -11954) {
          mia.a('\021', false);
        }
    }

    final static void a(int param0, int param1, int param2) {
        mm var6 = null;
        mm var7 = null;
        faa var4 = null;
        faa var4Lifetime1;
        if (param1 != paa.field_q) {
          var6 = (mm) (ks.field_r.a(-1, (long)paa.field_q));
          var7 = var6;
          if (var7 != null) {
            var7.field_Ib = null;
          } else {
            paa.field_q = param1;
            var4 = dpa.field_p;
            var4.h(24335, param0);
            var4.c(0, 3);
            var4.c(0, 11);
            var4.a(param1, true);
            if (param2 < 42) {
              field_a = (boolean[]) null;
              return;
            }
            return;
          }
          paa.field_q = param1;
          var4Lifetime1 = dpa.field_p;
          var4Lifetime1.h(24335, param0);
          var4Lifetime1.c(0, 3);
          var4Lifetime1.c(0, 11);
          var4Lifetime1.a(param1, true);
          if (param2 < 42) {
            field_a = (boolean[]) null;
            return;
          }
          return;
        }
        if (param2 >= 42) {
          return;
        }
        field_a = (boolean[]) null;
    }

    public final void run() {
        int var1_int = 0;
        vka var2 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        Object var5 = null;
        String var6 = null;
        var4 = VoidHunters.field_G;
        this.field_c = true;
        try {
          try {
            while (!this.field_e) {
              for (var1_int = 0; 2 > var1_int; var1_int++) {
                var2 = this.field_b[var1_int];
                if (var2 != null) {
                  var2.h();
                }
              }
              gdb.b(-106, 10L);
              var5 = (Object) null;
              ts.a((byte) 97, this.field_d, (Object) null);
            }
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var6 = (String) null;
            gna.a((Throwable) ((Object) var1), (String) null, 0);
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
          } else {
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_c = false;
          throw mia.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_c = false;
    }

    final static boolean a(char param0, boolean param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          if (!param1) {
            return false;
          }
          if (param0 > 0 &&
            param0 < 128) {
            return true;
          }
          if (param0 >= 160 &&
            param0 <= 255) {
            return true;
          }
          if (param0 != 0) {
            var6 = tu.field_c;
            var2 = var6;
            for (var3 = 0; var6.length > var3; var3++) {
              var4 = var6[var3];
              if (var4 == param0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2_ref), "mia.A(" + param0 + ',' + param1 + ')');
        }
    }

    mia() {
        this.field_b = new vka[2];
        this.field_e = false;
        this.field_c = false;
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
