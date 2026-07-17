/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static String field_e;
    static int field_a;
    static String field_g;
    static ut[] field_b;
    int field_c;
    static int[] field_h;
    private String field_f;
    private int field_d;

    public static void a() {
        field_g = null;
        int var1 = -18;
        field_b = null;
        field_h = null;
        field_e = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        uv var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        gg var3 = se.a(param0, 2, param2);
        if (!(var3 == null)) {
            wi.field_v.a(false, 0);
            var4 = wi.field_v;
            var5_ref_String = qt.field_k;
            var4.field_j.a(0, 5, var5_ref_String);
            var4 = wi.field_v;
            var5 = sm.field_q;
            var6 = vc.field_y;
            var4.field_j.a(0, 0, var5, var6, 0);
        }
        ug.a(param2, 2, param0);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        nr.field_j = param1;
        jl.field_d = param2;
        lk.field_g = param0;
        la.field_c = param3;
    }

    final static void a(boolean param0, byte param1, int param2, int param3) {
        um.field_b = true;
        gk.field_g = param3;
        mf.field_Db = null;
        wb.field_j = param0 ? true : false;
        hh.field_f = param2;
        ga.field_R = 0.0f;
        jm.a(18, false, -2);
        if (param1 > -85) {
            sb.b((byte) -66);
        }
    }

    public final String toString() {
        return ((sb) this).field_f.substring(0, ((sb) this).field_c) + "|" + ((sb) this).field_f.substring(((sb) this).field_c);
    }

    final static int a(int param0, int param1) {
        return t.field_o[2047 & param0];
    }

    final static void b(byte param0) {
        bh.field_i = new String[ob.field_B];
        bh.field_i[6] = lj.field_j;
        bh.field_i[15] = sp.field_Eb;
        bh.field_i[16] = gd.field_f;
        bh.field_i[18] = aj.field_b;
        bh.field_i[11] = aw.field_F;
        bh.field_i[19] = vl.field_f;
        if (param0 >= -121) {
          field_e = null;
          bh.field_i[9] = we.field_e;
          bh.field_i[20] = vr.field_a;
          bh.field_i[4] = fp.field_n;
          bh.field_i[13] = gt.field_o;
          bh.field_i[7] = ca.field_b;
          bh.field_i[21] = mp.field_e;
          bh.field_i[5] = fs.field_c;
          bh.field_i[17] = dh.field_k;
          return;
        } else {
          bh.field_i[9] = we.field_e;
          bh.field_i[20] = vr.field_a;
          bh.field_i[4] = fp.field_n;
          bh.field_i[13] = gt.field_o;
          bh.field_i[7] = ca.field_b;
          bh.field_i[21] = mp.field_e;
          bh.field_i[5] = fs.field_c;
          bh.field_i[17] = dh.field_k;
          return;
        }
    }

    final char b(int param0) {
        if (param0 >= -50) {
          ((sb) this).field_c = -38;
          int fieldTemp$4 = ((sb) this).field_c;
          ((sb) this).field_c = ((sb) this).field_c + 1;
          return ((sb) this).field_f.charAt(fieldTemp$4);
        } else {
          int fieldTemp$5 = ((sb) this).field_c;
          ((sb) this).field_c = ((sb) this).field_c + 1;
          return ((sb) this).field_f.charAt(fieldTemp$5);
        }
    }

    sb(String param0) {
        ((sb) this).field_c = 0;
        try {
            ((sb) this).field_f = param0;
            ((sb) this).field_d = ((sb) this).field_f.length();
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "sb.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 55) {
          L0: {
            field_a = 77;
            if (((sb) this).field_d > ((sb) this).field_c) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((sb) this).field_d > ((sb) this).field_c) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "The game options are not all set.";
        field_e = "Please enter a year between <%0> and <%1>";
        field_h = new int[5];
    }
}
