/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static String field_d;
    boolean field_b;
    static jea field_g;
    qm field_e;
    static String[] field_c;
    boolean field_h;
    static int field_f;
    qm field_a;

    final void c(int param0) {
        if (null == ((hg) this).field_a) {
          ((hg) this).field_h = false;
          if (param0 != -5941) {
            ((hg) this).field_a = null;
            return;
          } else {
            return;
          }
        } else {
          ((hg) this).field_a.a(12574);
          ((hg) this).field_h = false;
          if (param0 == -5941) {
            return;
          } else {
            ((hg) this).field_a = null;
            return;
          }
        }
    }

    final static be a(String param0, int param1, boolean param2) {
        qb var3 = null;
        Object var4 = null;
        if (param2) {
          var4 = null;
          be discarded$2 = hg.a((String) null, -41, false);
          var3 = new qb();
          ((be) (Object) var3).field_b = param1;
          ((be) (Object) var3).field_a = param0;
          return (be) (Object) var3;
        } else {
          var3 = new qb();
          ((be) (Object) var3).field_b = param1;
          ((be) (Object) var3).field_a = param0;
          return (be) (Object) var3;
        }
    }

    final boolean b(int param0) {
        if (param0 == 16440) {
          if (((hg) this).field_h) {
            if (((hg) this).field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_c = null;
          if (((hg) this).field_h) {
            if (((hg) this).field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        if (param0 != 13648) {
            field_g = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    hg(boolean param0) {
        ((hg) this).field_b = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Fireball Launcher";
        field_c = new String[]{"<%0> got a bouncing blade in the face", "<%0> had a very close shave", "<%0> didn't predict the sawblade's trajectory", "<%0> wonders where these endless ceremonial sawblades come from", "<%0> found their body was not blade-proof", "<%0> played catch with a rather sharp flying disc"};
    }
}
