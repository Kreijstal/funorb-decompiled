/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mta implements dja {
    static String[][] field_a;

    public final tv a(byte param0) {
        int var2 = -44 / ((-64 - param0) / 50);
        return (tv) ((Object) new hkb());
    }

    public static void a(boolean param0) {
        if (param0) {
          mta.b((byte) -50);
          field_a = (String[][]) null;
          return;
        }
        field_a = (String[][]) null;
    }

    final static void b(byte param0) {
        fda.field_p = null;
        if (param0 <= 109) {
          mta.b((byte) -94);
          nda.field_p = null;
          return;
        }
        nda.field_p = null;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          mta.a(false);
          return (tv[]) ((Object) new hkb[param1]);
        }
        return (tv[]) ((Object) new hkb[param1]);
    }

    final static void c(byte param0) {
        ft var1 = null;
        byte[] var3 = null;
        ola var1_ref = null;
        byte[] var4 = null;
        ft var1Lifetime1;
        byte[] var3Lifetime1;
        ola var1_refLifetime1;
        byte[] var4Lifetime1;
        if (param0 >= 89) {
          if (null == dv.field_b) {
            var1 = new ft();
            var3 = var1.a(128, 16, false, 128);
            dv.field_b = gfb.a(false, var3, -12445);
          }
          if (null == wpa.field_q) {
            var1_ref = new ola();
            var4 = var1_ref.a(128, 16, -15281, 128);
            wpa.field_q = gfb.a(false, var4, -12445);
          }
          return;
        }
        mta.a(false);
        if (null == dv.field_b) {
          var1Lifetime1 = new ft();
          var3Lifetime1 = var1Lifetime1.a(128, 16, false, 128);
          dv.field_b = gfb.a(false, var3Lifetime1, -12445);
        }
        if (null == wpa.field_q) {
          var1_refLifetime1 = new ola();
          var4Lifetime1 = var1_refLifetime1.a(128, 16, -15281, 128);
          wpa.field_q = gfb.a(false, var4Lifetime1, -12445);
        }
    }

    static {
    }
}
