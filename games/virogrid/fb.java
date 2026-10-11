/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends l {
    int field_h;
    boolean field_q;
    int field_j;
    static km field_o;
    int field_k;
    static int[] field_p;
    static String field_m;
    static boolean field_i;
    static String[] field_l;
    int field_n;
    int field_g;

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        fa var4_ref_fa = null;
        Object var5 = null;
        int var6 = 0;
        cm var9 = null;
        hg var10 = null;
        byte[] var14 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != 26360) {
            fb.a(-72);
          }
          var10 = sh.field_qb;
          var2 = var10.g(11132);
          if (var2 == 0) {
            var9 = (cm) (di.field_v.a((byte) -51));
            if (var9 == null) {
              tn.a(false);
              return;
            }
            var4 = var10.g(11132);
            if (var4 != 0) {
              var14 = new byte[var4];
              var10.a(0, var4, true, var14);
            } else {
              var5 = null;
            }
            var10.field_l = var10.field_l + 4;
            if (var10.e(-29449)) {
              var9.a(false);
              return;
            }
            tn.a(false);
            return;
          }
          if (var2 != 1) {
            en.a("A1: " + rg.a(true), (Throwable) null, 1);
            tn.a(false);
            return;
          }
          var3 = var10.d((byte) 122);
          var4_ref_fa = (fa) (oi.field_a.a((byte) -65));
          while (var4_ref_fa != null) {
            if (var3 != var4_ref_fa.field_i) {
              var4_ref_fa = (fa) (oi.field_a.a(16213));
              continue;
            }
            break;
          }
          if (var4_ref_fa != null) {
            var4_ref_fa.a(false);
            return;
          }
          tn.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "fb.A(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 == 21) {
          field_l = null;
          field_o = null;
          field_m = null;
          field_p = null;
          return;
        }
        fb.a((byte) -26);
        field_l = null;
        field_o = null;
        field_m = null;
        field_p = null;
    }

    fb(int param0, int param1, boolean param2) {
        this.field_j = 0;
        this.field_g = param1;
        this.field_q = param2 ? true : false;
        this.field_h = 0;
        this.field_k = param0;
    }

    fb(bi param0, boolean param1) {
        try {
          this.field_q = param1 ? true : false;
          this.field_j = 0;
          this.field_g = param0.field_b;
          this.field_h = 0;
          this.field_n = 0;
          this.field_k = param0.field_a;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "fb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_l = new String[16];
        field_p = new int[8192];
    }
}
