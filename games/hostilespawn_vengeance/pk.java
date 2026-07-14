/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends ql {
    static String field_n;
    static int field_m;
    static char[] field_g;
    private oc field_f;
    static int[] field_i;
    private v field_h;
    static int field_l;
    static boolean field_k;
    static bd[] field_d;
    static int[] field_e;
    static String field_j;

    final static void g(int param0) {
        ka.field_o = null;
        gg.field_D = null;
        if (param0 >= -56) {
          field_e = null;
          uh.field_j = null;
          p.field_k = null;
          sf.field_U = false;
          return;
        } else {
          uh.field_j = null;
          p.field_k = null;
          sf.field_U = false;
          return;
        }
    }

    final String a(boolean param0) {
        if (param0) {
            ((pk) this).d(90);
            return tc.field_e;
        }
        return tc.field_e;
    }

    final void e(int param0) {
        ((pk) this).field_f = new oc(ln.field_a.field_v[2], ln.field_a.field_v[3]);
        ((pk) this).field_h = new v(ke.field_w, 0, param0);
        ((pk) this).field_h.field_m = Math.min(((pk) this).field_h.field_m, ((pk) this).field_h.field_i.a(((pk) this).field_h.field_k));
        ((pk) this).field_h.field_l = -24 + 24 * ((pk) this).field_f.field_e;
        ((pk) this).field_h.field_a = 1;
        ((pk) this).field_h.field_d = 24 * ((pk) this).field_f.field_g + -120;
        kd.a(0, 1);
        if (6 <= ln.field_a.field_v.length) {
            nh.field_E.a(ln.field_a.field_v[4], 8360, ln.field_a.field_v[5]);
        }
    }

    final static void a(int param0, long param1) {
        try {
            if (false) throw (InterruptedException) null;
            Thread.sleep(param1);
        } catch (InterruptedException interruptedException) {
        }
        if (param0 != 207) {
            field_l = -120;
            return;
        }
    }

    final void d(int param0) {
        oc var2 = null;
        var2 = mm.field_m[0].field_j;
        if (param0 != -1) {
          L0: {
            field_i = null;
            pm.field_d = (ln.field_a.field_d + -var2.field_e) * 26 / ln.field_a.field_d;
            if (-3 < (ih.a(var2, (byte) -109, nh.field_E) ^ -1)) {
              mf.a(false, 2);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            pm.field_d = (ln.field_a.field_d + -var2.field_e) * 26 / ln.field_a.field_d;
            if (-3 < (ih.a(var2, (byte) -109, nh.field_E) ^ -1)) {
              mf.a(false, 2);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void c(int param0) {
        if (!(om.field_a)) {
            ti.a(226, (byte) 95, 29);
        }
        if (param0 != 0) {
            ((pk) this).d(-102);
            return;
        }
    }

    final static String a(int param0, int param1, vi param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        int var5 = 0;
        String var6 = null;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            var3_int = param2.f(255);
            if (param0 < var3_int) {
              var3_int = param0;
              break L0;
            } else {
              break L0;
            }
          }
          var4 = new byte[var3_int];
          var5 = 85 % ((71 - param1) / 43);
          param2.field_i = param2.field_i + fj.field_Tb.a(0, param2.field_n, param2.field_i, 17112, var3_int, var4);
          var6 = db.a(var4, 0, (byte) -120, var3_int);
          stackOut_3_0 = (String) var6;
          stackIn_4_0 = stackOut_3_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_4_0;
        }
        return null;
    }

    public static void h(int param0) {
        field_g = null;
        field_d = null;
        if (param0 != 2) {
          field_d = null;
          field_e = null;
          field_j = null;
          field_i = null;
          field_n = null;
          return;
        } else {
          field_e = null;
          field_j = null;
          field_i = null;
          field_n = null;
          return;
        }
    }

    final void b(byte param0) {
        oc var2 = null;
        int var3 = 0;
        var3 = -118 % ((param0 - -48) / 38);
        var2 = mm.field_m[0].field_j;
        if (1 == ((pk) this).field_h.field_a) {
          if (!((pk) this).field_h.a((byte) -127)) {
            if (var2.field_e < ((pk) this).field_f.field_e) {
              return;
            } else {
              ((pk) this).field_h.field_a = 2;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public pk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_n = "Pick up enough explosive charges to destroy the incursion points.";
        field_l = 4;
        field_j = "Locate the reactor to return power to the lift.";
        field_e = new int[]{272, 272, 558};
    }
}
