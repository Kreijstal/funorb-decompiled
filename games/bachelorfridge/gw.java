/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gw {
    static String field_c;
    private dha field_a;
    private boolean field_e;
    private dha field_f;
    private dha field_d;
    private dha field_b;

    final dha a(double param0, int param1) {
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        L0: {
          if (param1 > 57) {
            break L0;
          } else {
            gw.a(69);
            break L0;
          }
        }
        var4 = 1.0 - param0;
        var6 = Math.pow(var4, 3.0) * (double)((gw) this).field_f.field_c + param0 * (3.0 * Math.pow(var4, 2.0)) * (double)((gw) this).field_b.field_c + var4 * (Math.pow(param0, 2.0) * 3.0) * (double)((gw) this).field_a.field_c + Math.pow(param0, 3.0) * (double)((gw) this).field_d.field_c;
        var8 = Math.pow(var4, 3.0) * (double)((gw) this).field_f.field_a + param0 * (3.0 * Math.pow(var4, 2.0)) * (double)((gw) this).field_b.field_a + Math.pow(param0, 2.0) * 3.0 * var4 * (double)((gw) this).field_a.field_a + Math.pow(param0, 3.0) * (double)((gw) this).field_d.field_a;
        if (!((gw) this).field_e) {
          return new dha((int)Math.round(var6), (int)Math.round(var8));
        } else {
          return new dha((-(int)Math.round(var6) + 65536) % 65536, (int)Math.round(var8));
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 110) {
            return true;
        }
        if (jv.field_j < 10) {
            return false;
        }
        if (13 > lk.field_r) {
            return false;
        }
        return true;
    }

    final static kv[] a(String param0, String param1, vr param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var4 = param2.a(param0, false);
        if (param3 > -31) {
          var6 = null;
          kv[] discarded$2 = gw.a((String) null, (String) null, (vr) null, 110);
          var5 = param2.a((byte) 6, var4, param1);
          return bna.a(var4, param2, -116, var5);
        } else {
          var5 = param2.a((byte) 6, var4, param1);
          return bna.a(var4, param2, -116, var5);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 25354) {
            boolean discarded$0 = gw.a((byte) 11);
        }
    }

    gw(dha param0, dha param1, dha param2, dha param3, int param4) {
        ((gw) this).field_b = param1;
        ((gw) this).field_a = param2;
        ((gw) this).field_d = param3;
        ((gw) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> has lost connection.";
    }
}
