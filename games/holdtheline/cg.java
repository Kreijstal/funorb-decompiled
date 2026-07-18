/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    int field_h;
    static volatile boolean field_a;
    static a field_b;
    int field_e;
    int field_k;
    int field_d;
    int field_c;
    static long field_g;
    static ll field_f;
    static int[] field_j;
    static int field_i;

    final static void a(byte param0, boolean param1, boolean param2) {
        Object var4 = null;
        if (param0 >= -87) {
          field_i = -67;
          var4 = null;
          pg.a(param1, (byte) 121, (String) null, param2);
          return;
        } else {
          var4 = null;
          pg.a(param1, (byte) 121, (String) null, param2);
          return;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_j = null;
        field_f = null;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        hj[] var5 = null;
        hj var6 = null;
        var5 = jc.field_h;
        var6 = ij.a(param3 + -8137, param2, var5, param4);
        if (param3 != 41) {
          cg.a(78, -110, -63, (byte) -36, 2);
          param0 = param0 - (var6.field_s + -param2 >> 1);
          param1 = param1 - (var6.field_y + -param4 >> 1);
          var6.a(param0, param1);
          return;
        } else {
          param0 = param0 - (var6.field_s + -param2 >> 1);
          param1 = param1 - (var6.field_y + -param4 >> 1);
          var6.a(param0, param1);
          return;
        }
    }

    final static boolean a(int param0, String param1) {
        return ra.a(param1, 85) != null;
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) ic.field_d;
        synchronized (var1) {
          L0: {
            rd.field_f = u.field_R;
            uf.field_a = uf.field_a + 1;
            nc.field_g = in.field_f;
            rf.field_X = g.field_m;
            na.field_k = sd.field_a;
            sd.field_a = false;
            gg.field_J = mi.field_a;
            lb.field_x = im.field_e;
            jb.field_U = nl.field_f;
            mi.field_a = 0;
            break L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_f = new ll();
        field_i = 20;
        field_j = new int[8192];
    }
}
