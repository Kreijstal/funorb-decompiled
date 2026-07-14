/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class at extends hd {
    pu field_Cb;
    static String field_Jb;
    static String field_Kb;
    static String field_Ib;
    static String field_Ab;
    static String field_Bb;
    static int field_Hb;
    int field_yb;
    static String field_Fb;
    static String field_Gb;
    String field_Eb;
    private String field_zb;
    int field_Db;

    final int c(boolean param0) {
        if (!param0) {
            Object var3 = null;
            at.a((hu) null, (sj) null, (byte) 38);
        }
        return ic.field_h.field_x >= ((at) this).field_Db ? 16777215 : 16711680;
    }

    final static void a(hu param0, sj param1, byte param2) {
        int var3 = 0;
        tc var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        int[] var16 = null;
        var9 = Kickabout.field_G;
        var3 = vv.field_r;
        qa.field_E = new hd(0L, (hd) null);
        if (param1 != null) {
          L0: {
            param1.field_c = 0;
            param1.field_b = false;
            vc.field_x = new bt(var3, param1, param1);
            lm.field_j = new an(var3, param1, param1, (fg) (Object) new ka());
            if (param2 == -32) {
              break L0;
            } else {
              at.h((byte) -19);
              break L0;
            }
          }
          var4 = al.h((byte) 124);
          if (var4 != null) {
            oe.a((byte) -45, var4);
            var12 = null;
            ve.field_S = su.a(5138823, 2245737, 1513239, true, 65793, (hu) null, 65793, 65793, 4020342, 8947848, 0, 1513239, 1127256);
            ic.field_a = su.a(0, 0, 0, true, 0, param0, 0, 0, 0, 0, 16764006, 0, 0);
            fr.field_E = su.a(0, 0, 0, true, 0, param0, 0, 0, 0, 0, 16777215, 0, 0);
            var5 = on.field_g;
            var6 = on.field_f;
            var16 = on.field_a;
            ci.field_g = new ut(10, 14);
            ci.field_g.e();
            var8 = 2;
            L1: while (true) {
              if (var8 >= 7) {
                on.a(var16, var5, var6);
                gk.field_h = h.a(param2 ^ -32, var4, ve.field_S, fr.field_E, ic.field_a);
                qa.field_E.field_jb = new tf();
                return;
              } else {
                on.a(var8, 1 + var8, -(var8 << 1015207777) + 14, 16777215);
                var8++;
                continue L1;
              }
            }
          } else {
            var11 = null;
            bd.a("QC2", (Throwable) null, 1);
            return;
          }
        } else {
          var10 = null;
          bd.a("QC1", (Throwable) null, 1);
          return;
        }
    }

    public static void h(byte param0) {
        field_Fb = null;
        field_Kb = null;
        field_Bb = null;
        if (param0 >= -106) {
            return;
        }
        field_Ib = null;
        field_Jb = null;
        field_Gb = null;
        field_Ab = null;
    }

    at(int param0) {
        ((at) this).field_yb = param0;
        fn var3 = pa.field_g[((at) this).field_yb];
        ((at) this).field_Cb = new pu(new fn(var3.field_k, var3.field_h, var3.field_e), false);
        ((at) this).field_q = 5 + (((at) this).field_Cb.field_q - -143);
        ((at) this).field_mb = 5 + ((at) this).field_Cb.field_mb + 5;
        ((at) this).field_Db = var3.field_e;
        ((at) this).field_B = 5;
        ((at) this).field_D = 5;
        ((at) this).field_Eb = ad.a(((at) this).field_Db, 26300);
        ((at) this).field_zb = var3.f((byte) -1).toLowerCase();
        ((at) this).a((byte) -115, (hd) (Object) ((at) this).field_Cb);
        ((at) this).field_Cb.field_s = 8;
        ((at) this).field_Cb.field_J = ((at) this).field_mb + -((at) this).field_Cb.field_mb >> -1039644223;
    }

    final void i(byte param0) {
        L0: {
          if (((at) this).field_mb + ((at) this).field_T < on.field_e) {
            break L0;
          } else {
            if (on.field_h >= ((at) this).field_T) {
              L1: {
                un.field_d.a(((at) this).field_zb, ((at) this).field_F + 50, (((at) this).field_mb >> -1864076159) + ((at) this).field_T, 16777215, -1);
                if (param0 == -76) {
                  break L1;
                } else {
                  ((at) this).field_Db = 84;
                  break L1;
                }
              }
              pb.field_C.c(((at) this).field_Eb, ((at) this).field_F + 160, -6 + ((at) this).field_T + ((at) this).field_mb, ((at) this).c(true), -1);
              return;
            } else {
              break L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ab = "Year";
        field_Jb = "Ignore";
        field_Fb = "Back";
        field_Gb = "Please remove <%0> from your ignore list first.";
        field_Bb = "in the Final";
        field_Ib = "Password: ";
    }
}
