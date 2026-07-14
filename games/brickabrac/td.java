/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends ki {
    static mh field_t;
    static String field_r;
    static String field_w;
    static int[] field_s;
    static int field_u;
    static mh field_v;

    final jp a(boolean param0, int param1) {
        if (!param0) {
            return null;
        }
        return uj.field_e[-1 + param1];
    }

    td(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
        uj.field_e = new jp[2];
        np.field_c = new jp[2][];
        kg.field_a = new jp[2][];
    }

    final boolean b(byte param0) {
        if (param0 > -91) {
            return true;
        }
        if (pb.field_j == null) {
            return false;
        }
        if (null == cp.field_I) {
            return false;
        }
        if (null == se.field_k) {
            return false;
        }
        if (mc.field_f == null) {
            return false;
        }
        return true;
    }

    final boolean a(boolean param0) {
        if (!i.field_m.a("volcanic", -28138)) {
            return false;
        }
        pb.field_j = pl.a("volcanic", "volcanic_near", (byte) -127, i.field_m);
        cp.field_I = pl.a("volcanic", "volcanic_mid", (byte) -73, i.field_m);
        se.field_k = pl.a("volcanic", "volcanic_far", (byte) -125, i.field_m);
        mc.field_f = pl.a("volcanic", "volcanic_small", (byte) -77, i.field_m);
        cg.field_q = jh.a(0, pb.field_j);
        gq.field_Sb = jh.a(0, cp.field_I);
        bn.field_p = jh.a(0, se.field_k);
        kg.field_a[0] = cr.a("volcanic", i.field_m, "volcanic_caps", 2);
        np.field_c[0] = cr.a("volcanic", i.field_m, "volcanic_segs", 2);
        uj.field_e[0] = pl.a("volcanic", "volcanic_centre", (byte) -67, i.field_m);
        kg.field_a[1] = ig.a(kg.field_a[0], false);
        np.field_c[1] = ig.a(np.field_c[0], param0);
        uj.field_e[1] = pl.a(-16371, uj.field_e[0]);
        return true;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 9 / ((param0 - -28) / 43);
        if (param1 > -1) {
            lb.g(param2, param3, 153, 238, hh.field_c[param1], 10792131);
            if (!(!((td) this).b((byte) -125))) {
                mc.field_f.c(param2, param3);
            }
            return;
        }
        lb.g(param2, param3, 153, 238, 16777215, 11184810);
        if (!(!((td) this).b((byte) -125))) {
            mc.field_f.c(param2, param3);
        }
    }

    public static void f(int param0) {
        field_w = null;
        field_v = null;
        field_t = null;
        field_r = null;
        if (param0 != 0) {
            field_u = 41;
            field_s = null;
            return;
        }
        field_s = null;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (!((td) this).b((byte) -92)) {
            lb.g(param4, param2, 640, 480, hh.field_c[param3], 10792131);
        } else {
            var6 = ge.a(((td) this).field_m, param3, -20777);
            if (!(var6.a((byte) -84, param3, ((td) this).field_m))) {
                pi.a(se.field_k, var6, param3, 1, (byte) 18, 0);
                var6.a(((td) this).field_m, param3, (byte) 78);
            }
            ko.a(-91, -7, pb.field_j, param1, var6.field_p, param3, 640, 1, param4, param2, cp.field_I);
        }
        if (!param0) {
            field_v = null;
            return;
        }
    }

    final static int a(vl[] param0, byte[] param1, kq param2, vl param3, ga param4, int param5) {
        if (param5 != 10792131) {
            return 21;
        }
        return dq.a(param0, true, new wq(param1), param3, param2, param4);
    }

    final jp[] a(int param0, boolean param1) {
        if (!param1) {
            return null;
        }
        return np.field_c[-1 + param0];
    }

    final jp[] a(byte param0, int param1) {
        int var3 = -91 / ((65 - param0) / 49);
        return kg.field_a[param1 - 1];
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (!((td) this).b((byte) -120)) {
            lb.g(param2, param0, 306, 480, hh.field_c[param3], 10792131);
        } else {
            var6 = kd.a(((td) this).field_m, param3, (byte) -111);
            if (!(var6.a((byte) -84, param3, ((td) this).field_m))) {
                pi.a(bn.field_p, var6, param3, 2, (byte) 119, -14);
                var6.a(((td) this).field_m, param3, (byte) 78);
            }
            ko.a(-113, -14, cg.field_q, param4, var6.field_p, param3, 306, 2, param2, param0, gq.field_Sb);
        }
        if (param1 >= -84) {
            field_v = null;
            return;
        }
    }

    final static void g(int param0) {
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        fo var4 = new fo(new int[1]);
        fo var1 = var4;
        for (var2 = param0; var2 < mh.field_F.length; var2++) {
            mh.field_F[var2] = var4.b(101);
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var4 = param1.getCodeBase();
                if (!param0) {
                  break L0;
                } else {
                  td.g(-95);
                  break L0;
                }
              }
              var3 = hg.a(param1, var4, -1).getFile();
              Object discarded$6 = ne.a(new Object[2], 111, param1, "updatelinks");
              Object discarded$7 = ne.a(new Object[2], 76, param1, "updatelinks");
              Object discarded$8 = ne.a(new Object[2], 88, param1, "updatelinks");
              Object discarded$9 = ne.a(new Object[2], 98, param1, "updatelinks");
              Object discarded$10 = ne.a(new Object[2], 109, param1, "updatelinks");
              Object discarded$11 = ne.a(new Object[2], 113, param1, "updatelinks");
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new int[]{8, 23};
        field_r = "Owner";
        field_u = 83;
    }
}
