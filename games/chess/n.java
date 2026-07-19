/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static p field_g;
    static String field_h;
    static String field_a;
    static String[] field_d;
    static int field_e;
    static int field_f;
    static String field_c;
    static bn[] field_b;

    final static vg a(byte param0) {
        String var1 = null;
        if (param0 <= 18) {
          L0: {
            field_d = (String[]) null;
            var1 = ob.d((byte) -108);
            if (var1 == null) {
              break L0;
            } else {
              if (0 > var1.indexOf('@')) {
                break L0;
              } else {
                var1 = "";
                break L0;
              }
            }
          }
          return new vg(ob.d((byte) -124), hh.d((byte) -122));
        } else {
          L1: {
            var1 = ob.d((byte) -108);
            if (var1 == null) {
              break L1;
            } else {
              if (0 > var1.indexOf('@')) {
                break L1;
              } else {
                var1 = "";
                break L1;
              }
            }
          }
          return new vg(ob.d((byte) -124), hh.d((byte) -122));
        }
    }

    final static void a(lh param0, int param1, boolean param2, km[] param3, int param4, int param5, int param6, int param7, int param8, lh param9, int param10, int param11, int param12, int param13, km[] param14) {
        try {
            km[] var16 = (km[]) null;
            tb.a(le.field_f, param9, -26472, param3, param0, param12, (km[]) null, param8, kg.field_V, param4, param13, param14, 480, 0, param5, kj.field_h, 0, param7, param6, param10, param1);
            if (param11 < 123) {
                field_d = (String[]) null;
            }
            ga.a(param2, 121);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "n.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + (param14 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        if (param0 > -95) {
          field_d = (String[]) null;
          field_a = null;
          field_c = null;
          field_h = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_h = null;
          field_d = null;
          return;
        }
    }

    final static void a(um param0, um param1, boolean param2, int param3, um param4) {
        try {
            pi.field_c = la.a(true, "");
            pi.field_c.a(false, -1730123902);
            hn.a(param3 ^ 86, param4, param1, param0);
            ak.c((byte) -128);
            vl.field_A = ji.field_T;
            if (param3 != 0) {
                field_b = (bn[]) null;
            }
            g.field_a = ji.field_T;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "n.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "Rated game";
        field_f = 0;
        field_a = "<%0> has declined the invitation.";
        field_d = new String[16];
        field_b = new bn[7];
        field_e = field_f;
    }
}
