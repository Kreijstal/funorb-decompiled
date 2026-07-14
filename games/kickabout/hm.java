/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends tm {
    static java.awt.Color field_A;
    static byte[] field_G;
    static String field_E;
    static int field_I;
    static int[][] field_D;
    static String field_C;
    static String field_H;

    final static void a(boolean param0, int param1) {
        bl.a(param0, false, (byte) -57);
        if (param1 >= -89) {
            field_E = null;
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 <= 104) {
            field_A = null;
            return param1 * 3;
        }
        return param1 * 3;
    }

    hm(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, java.awt.Canvas param1) {
        lr.a((java.awt.Component) (Object) param1, -63);
        ao.a(false, (java.awt.Component) (Object) param1);
        if (param0 > -102) {
          return;
        } else {
          L0: {
            if (null != ag.field_f) {
              ag.field_f.a((byte) -68, (java.awt.Component) (Object) param1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final li a(byte param0, li[] param1) {
        if (param0 != 84) {
          field_A = null;
          return new li(he.a((byte) -13, (int[]) param1[0].field_d));
        } else {
          return new li(he.a((byte) -13, (int[]) param1[0].field_d));
        }
    }

    final static boolean a(byte param0, String param1) {
        int var2 = -120 / ((-16 - param0) / 48);
        CharSequence var3 = (CharSequence) (Object) param1;
        return kd.field_w.equals((Object) (Object) mo.a(0, var3));
    }

    final static void a(int param0, int param1) {
        int var4 = Kickabout.field_G;
        sm var5 = (sm) (Object) ia.field_d.g(24009);
        while (var5 != null) {
            mp.a(50, param1, var5);
            var5 = (sm) (Object) ia.field_d.c(33);
        }
        int var3 = -93 % ((param0 - 72) / 43);
        ni var6 = (ni) (Object) lw.field_g.g(24009);
        while (var6 != null) {
            gv.a(param1, 112, var6);
            var6 = (ni) (Object) lw.field_g.c(33);
        }
    }

    final static mc h(int param0) {
        if (param0 != 3) {
            Object var2 = null;
            boolean discarded$0 = hm.a((byte) 22, (String) null);
            return (mc) (Object) new vi();
        }
        return (mc) (Object) new vi();
    }

    public static void g(int param0) {
        field_G = null;
        field_H = null;
        field_E = null;
        field_C = null;
        field_D = null;
        if (param0 != 10040319) {
          field_D = null;
          field_A = null;
          return;
        } else {
          field_A = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "buyout at max";
        field_A = new java.awt.Color(10040319);
        field_C = "Congratulations to <%0>, beating <%1> <%2> to <%3> winning the tournament!";
        field_H = "Loading extra data";
    }
}
