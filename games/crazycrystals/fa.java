/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fa extends mg {
    static String field_m;
    static String field_i;
    static String field_k;
    private String field_l;
    private long field_j;

    final static void a(vc param0, vc param1, boolean param2, boolean param3, int param4, int param5, int param6, int param7, int param8, int param9, dl[] param10, dl[] param11, int param12, int param13, int param14, int param15, int param16) {
        a.a(param8, param9, 0, param16, param7, param1, vh.field_f, param14, param0, aj.field_t, jn.field_i, ao.field_e, la.field_a, new hj(param11), param12, new hj(param10), param15, param5, param4, mc.field_s, param6);
        a.a(126, param13, param3);
        if (!param2) {
            Object var18 = null;
            fa.a((vc) null, (vc) null, true, false, 27, -22, 78, -62, -125, 77, (dl[]) null, (dl[]) null, -82, -3, -91, -105, 37);
        }
    }

    wh a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return uo.field_n;
    }

    final static String a(byte param0, byte[] param1) {
        if (param0 >= -62) {
          field_k = null;
          return gd.a((byte) 102, param1, 0, param1.length);
        } else {
          return gd.a((byte) 102, param1, 0, param1.length);
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        field_i = null;
        if (!param0) {
            return;
        }
        field_m = null;
    }

    final void a(ng param0, byte param1) {
        if (param1 < 94) {
          field_m = null;
          param0.b(((fa) this).field_j, (byte) 13);
          param0.a(-16614, ((fa) this).field_l);
          return;
        } else {
          param0.b(((fa) this).field_j, (byte) 13);
          param0.a(-16614, ((fa) this).field_l);
          return;
        }
    }

    final static void a(boolean param0, boolean param1, String param2, boolean param3) {
        Object var5 = null;
        if (!param3) {
          var5 = null;
          fa.a((vc) null, (vc) null, true, false, 27, -113, -121, 67, 2, -38, (dl[]) null, (dl[]) null, 66, -114, 40, 57, 65);
          pl.e(-125);
          qe.field_g.g((byte) -100);
          mk.field_b = new vk(jd.field_G, (String) null, ne.field_d, param1, param0);
          jm.field_d = new ck(qe.field_g, (qm) (Object) mk.field_b);
          qe.field_g.b(-3264, (qm) (Object) jm.field_d);
          return;
        } else {
          pl.e(-125);
          qe.field_g.g((byte) -100);
          mk.field_b = new vk(jd.field_G, (String) null, ne.field_d, param1, param0);
          jm.field_d = new ck(qe.field_g, (qm) (Object) mk.field_b);
          qe.field_g.b(-3264, (qm) (Object) jm.field_d);
          return;
        }
    }

    fa(long param0, String param1) {
        ((fa) this).field_j = param0;
        ((fa) this).field_l = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Click on a tile<br>to find out<br>what it is!";
        field_k = "This is a crystal.<br><br>Crystals are good.<br><br>Collect all the crystals<br>to complete the level!";
        field_m = "Sound: ";
    }
}
