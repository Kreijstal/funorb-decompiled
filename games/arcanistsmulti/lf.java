/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static am field_f;
    static ll[] field_e;
    static qb[] field_c;
    static String field_h;
    static String field_i;
    static String field_d;
    static lb field_a;
    static dn field_b;
    static int field_g;

    final static void a(byte param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (~mn.field_r == ~si.field_g) {
            return;
          }
          if (ij.b(si.field_g, 10)) {
            tl.field_f[si.field_g].d((byte) 103);
          }
          var1_int = si.field_g;
          si.field_g = mn.field_r;
          cb.field_b = io.field_A;
          km.field_c = 0;
          if (si.field_g == -1 &&
            5 == var1_int &&
            null != jb.field_z) {
            jb.field_z.field_z = jb.field_z.field_z - (250 - o.field_s);
          }
          if (si.field_g == 0 ||
            si.field_g == -4 ||
            -1 == si.field_g ||
            -2 == si.field_g ||
            si.field_g == -5 ||
            si.field_g == -3 ||
            si.field_g == 14) {
            for (var2 = 1; var2 < wm.field_H.length; var2++) {
              wm.field_H[var2] = null;
            }
          }
          if (si.field_g == 3) {
            o.field_s = 0;
          }
          if (si.field_g == 5) {
            o.field_s = 0;
          }
          if (-1 == si.field_g) {
            o.field_s = 0;
          }
          if (0 == si.field_g) {
            vl.d((byte) 112);
          }
          if (fi.field_h) {
            if (null != jb.field_z ||
              r.field_b != null) {
              mi.a(jh.field_c[0], 3);
            }
            r.field_b = null;
            jb.field_z = null;
            System.gc();
            fi.field_h = false;
          }
          if (tn.field_Cb) {
            wh.field_h = new vn();
            tn.field_Cb = false;
            ad.field_f = new int[8];
          }
          if (param0 != 80) {
            return;
          }
          if (wa.field_Kb) {
            ho.a(0);
            rn.i((byte) -123);
            qn.i(param0 ^ 110);
            wa.field_Kb = false;
          }
          pm.field_c = (int)(480.0 * Math.random());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "lf.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != -15) {
          return;
        }
        field_h = null;
        field_c = null;
        field_b = null;
        field_e = null;
        field_d = null;
        field_i = null;
    }

    final static void b(int param0) {
        if (param0 != -4) {
          field_d = (String) null;
        }
        dg.d((byte) -74);
        jo.a(true);
    }

    static {
        field_f = new am();
        field_h = "Buying or selling an account";
        field_d = "Spell types 1/2:";
        field_i = "This entry doesn't match";
    }
}
