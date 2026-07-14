/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends gk {
    static ea field_t;
    static int field_x;
    static String[] field_w;
    static String[] field_u;
    static String field_v;

    private mn(we param0, int param1) {
        super(param0, param1);
    }

    final String a(fe param0, byte param1) {
        int var3 = 2 / ((0 - param1) / 33);
        return kb.a(param0.field_s.length(), false, '*');
    }

    mn(int param0) {
        this(bn.field_d, param0);
    }

    final static void a(byte param0, float param1, boolean param2, String param3) {
        if (null != bd.field_e) {
          bd.field_e.a(param0 ^ 68, param3, param1, param2);
          eh.d();
          pf.a(0, true);
          if (param0 != -63) {
            mn.d(122);
            return;
          } else {
            return;
          }
        } else {
          bd.field_e = new jl(mb.field_b, ic.field_i);
          mb.field_b.b(1, (fe) (Object) bd.field_e);
          bd.field_e.a(param0 ^ 68, param3, param1, param2);
          eh.d();
          pf.a(0, true);
          if (param0 == -63) {
            return;
          } else {
            mn.d(122);
            return;
          }
        }
    }

    public static void d(int param0) {
        Object var2 = null;
        field_w = null;
        field_u = null;
        field_v = null;
        if (param0 != 42) {
          var2 = null;
          mn.a((byte) 86, 0.39803603291511536f, true, (String) null);
          field_t = null;
          return;
        } else {
          field_t = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new String[]{"For the paranoid miner: the Scannox 5001! If there's anything living in the volcano, this will let you see it before it sees you. It will also make spotting ore in boulders easier.", "For the paranoid miner: the Scannox 5001! If there's anything living in the Super Volcano, this will let you see it before it sees you. It will also make spotting ore in boulders easier."};
        field_u = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_v = "Main Menu";
    }
}
