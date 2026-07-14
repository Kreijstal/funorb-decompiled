/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ks extends ff {
    static int field_v;
    static ri[] field_w;
    static String field_u;
    static cp field_x;
    static ri field_t;
    private byte[] field_s;

    ks() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    final byte[] b(int param0, int param1, int param2, int param3) {
        ((ks) this).field_s = new byte[param1 * (param2 * param3) * 2];
        ((ks) this).a(param3, param0 ^ 207, param2, param1);
        if (param0 != 1) {
          wb[] discarded$2 = ks.a((byte) -23, -46, 65, -1, 46);
          return ((ks) this).field_s;
        } else {
          return ((ks) this).field_s;
        }
    }

    public static void d(int param0) {
        Object var2 = null;
        field_w = null;
        if (param0 != -11701) {
          var2 = null;
          ks.a((java.math.BigInteger) null, (java.math.BigInteger) null, true, (fs) null, (fs) null);
          field_t = null;
          field_u = null;
          field_x = null;
          return;
        } else {
          field_t = null;
          field_u = null;
          field_x = null;
          return;
        }
    }

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, boolean param2, fs param3, fs param4) {
        if (param2) {
            return;
        }
        sr.a(param0, param4.field_p, param4.field_n, param1, (byte) -29, param3, 0);
    }

    final static wb[] a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 > -5) {
          field_x = null;
          return oq.a(param4, param2, 1, 1, 1, param3, (byte) -113, param1, 3);
        } else {
          return oq.a(param4, param2, 1, 1, 1, param3, (byte) -113, param1, 3);
        }
    }

    final static ha a(int param0, java.awt.Canvas param1, d param2, boolean param3, int param4, ki param5) {
        int var6 = 0;
        int var7 = 0;
        java.awt.Dimension var8 = null;
        L0: {
          var6 = 0;
          var7 = 0;
          if (param1 == null) {
            break L0;
          } else {
            var8 = param1.getSize();
            var6 = var8.width;
            var7 = var8.height;
            break L0;
          }
        }
        if (!param3) {
          field_x = null;
          return ha.a(param0, param1, -1, param4, param2, var7, var6, param5);
        } else {
          return ha.a(param0, param1, -1, param4, param2, var7, var6, param5);
        }
    }

    final void a(int param0, byte param1, int param2) {
        param1 = (byte)((param1 >> -1413870367 & 127) + param2);
        int var4 = 2 * param0;
        var4++;
        ((ks) this).field_s[var4] = (byte)param1;
        ((ks) this).field_s[var4] = (byte)param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Email (Login):";
        field_v = 0;
    }
}
