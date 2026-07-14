/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static nl field_d;
    private int field_f;
    private static String[] field_g;
    private Object[] field_e;
    static String field_i;
    static int field_h;
    private int field_a;
    static String field_b;
    static int field_c;

    final void a(int param0, int param1, Object param2) {
        Object[] var6 = null;
        Object[] var7 = null;
        Object[] var4 = null;
        ((ub) this).field_f = ((ub) this).field_f + 1;
        if (param1 != 0) {
            Object var5 = null;
            ((ub) this).a(-79, -69, (Object) null);
        }
        if (((ub) this).field_f < ((ub) this).field_e.length) {
            lua.a(((ub) this).field_e, param0, ((ub) this).field_e, 1 + param0, -param0 + ((ub) this).field_f + -1);
        } else {
            var6 = new Object[((ub) this).field_a + ((ub) this).field_e.length];
            var7 = var6;
            var4 = var7;
            lua.a(((ub) this).field_e, 0, var7, 0, param0);
            lua.a(((ub) this).field_e, param0, var4, 1 + param0, -param0 + ((ub) this).field_e.length);
            ((ub) this).field_e = var6;
        }
        ((ub) this).field_e[param0] = param2;
    }

    final static void b(int param0) {
        int var2 = TombRacer.field_G ? 1 : 0;
        ol.field_b = null;
        ii.field_a = 0;
        tba.field_k = param0;
        fla.field_f.d(8);
        wv.field_l.d(8);
        od var1 = hia.field_s.b(16);
        while (var1 != null) {
            var1.c(-7975);
            var1 = hia.field_s.a((byte) -112);
        }
        var1 = bla.field_G.b(param0 + -120);
        while (var1 != null) {
            var1.c(-7975);
            var1 = bla.field_G.a((byte) -112);
        }
        ae.field_g = 0;
    }

    private final void a(int param0, Object[] param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        ((ub) this).field_e = new Object[param1.length];
        lua.a(param1, 0, ((ub) this).field_e, 0, param1.length);
        ((ub) this).field_f = param0;
        var3 = 0;
        L0: while (true) {
          if (((ub) this).field_e.length <= var3) {
            return;
          } else {
            if (((ub) this).field_e[var3] != null) {
              ((ub) this).field_f = ((ub) this).field_f + 1;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_i = null;
        field_g = null;
        if (!param0) {
            return;
        }
        field_b = null;
    }

    public ub() {
        this(10, 10);
    }

    final Object a(boolean param0, int param1) {
        if (!param0) {
            ((ub) this).field_e = new Object[5];
        }
        return ((ub) this).field_e[param1];
    }

    private ub(Object[] param0, int param1) {
        this(param0);
        ((ub) this).field_a = param1;
    }

    final void a(Object[] param0, boolean param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param1) {
            field_i = null;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            if (((ub) this).field_e.length <= var3) {
                return;
            }
            param0[var3] = ((ub) this).field_e[var3];
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
            ((int[]) ((Object[]) ((ub) this).field_e[0])[7])[3] = 68;
        }
        return ((ub) this).field_f;
    }

    private ub(int param0, int param1) {
        this(new Object[param0], param1);
    }

    final static boolean a(int param0, int param1, byte param2) {
        int var3 = -40 % ((-25 - param2) / 37);
        return 0 != (param1 & 1024) ? true : false;
    }

    final void a(byte param0, Object param1) {
        ((ub) this).a(((ub) this).field_f, 0, param1);
        if (param0 != -37) {
            ((ub) this).field_e = null;
        }
    }

    ub(int param0) {
        this(new Object[param0]);
    }

    private ub(Object[] param0) {
        ((ub) this).field_a = 1;
        this.a(0, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new nl("usename");
        field_g = new String[4];
        field_g[2] = "Spitting Torch";
        field_g[0] = "Brazier";
        field_g[1] = "Wall Torch";
        field_g[3] = "Pillar";
        field_h = 0;
        field_c = field_h;
    }
}
