/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends km {
    static cd field_v;
    private tp[] field_r;
    static mh field_t;
    private mf field_u;
    static int field_x;
    static jp field_s;
    static int field_w;

    public static void g(int param0) {
        field_v = null;
        field_t = null;
        if (param0 != 2) {
          de.g(47);
          field_s = null;
          return;
        }
        field_s = null;
    }

    final void drawScreen(byte obfuscationGuard) {
        lb.d();
        if (obfuscationGuard <= -14) {
          if (ff.field_c != null) {
            ff.field_c.e((byte) -93);
          }
          return;
        }
        de.g(61);
        if (ff.field_c != null) {
          ff.field_c.e((byte) -93);
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (!param1) {
          if (null != tn.field_m) {
            tn.field_m.a(true, param0);
          }
          return;
        }
        de.f(-8);
        if (null != tn.field_m) {
          tn.field_m.a(true, param0);
        }
    }

    final static long f(int param0) {
        if (param0 != -6792) {
          field_s = (jp) null;
          return ue.a(false) - oj.field_t;
        }
        return ue.a(false) - oj.field_t;
    }

    private final boolean c(int param0, int param1) {
        int var3 = 0;
        if (param0 != 460) {
          return false;
        }
        if (param1 == 0) {
          return false;
        }
        if (3 != param1) {
          var3 = param1 == 2 ? 1 : 0;
          ng.a(var3 != 0, param0 - 386, this.a(true));
          return var3 == 0 ? true : false;
        }
        return false;
    }

    de(mf param0) {
        super(12, 180, 460, 150, 35, (int[]) null);
        try {
          this.field_u = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "de.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        boolean discarded$0 = false;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard >= -52) {
          return;
        }
        if (null == this.field_r) {
          this.field_r = wq.a("benefits", this.field_u, "members_benefits_screenshots", -946715356);
          return;
        }
        if (ff.field_c != null) {
          discarded$0 = this.c(460, ff.field_c.a(false, inputEnabled));
          return;
        }
        ff.field_c = new w(sl.field_C, oc.field_u, this.field_r, false, hq.field_u);
    }

    final boolean handleKey(char character, int keyCode, int obfuscationGuard) {
        if (keyCode <= 98) {
          return false;
        }
        if (null != ff.field_c) {
          return this.c(460, ff.field_c.a((byte) -93));
        }
        return false;
    }

    static {
        field_v = new cd(2);
    }
}
