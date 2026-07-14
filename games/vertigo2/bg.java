/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bg {
    byte field_d;
    static boolean field_c;
    static nj field_b;
    static String[] field_e;
    static String field_a;

    int a(boolean param0) {
        if (!param0) {
            field_e = null;
            return 0;
        }
        return 0;
    }

    abstract void a(boolean param0, int[] param1, boolean param2, boolean param3);

    fc a(lg param0, int param1, int param2, byte param3) {
        if (param3 <= -85) {
            return null;
        }
        int discarded$0 = ((bg) this).a(false);
        return null;
    }

    abstract int a(int param0);

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        if (param0 != 9) {
            field_e = null;
        }
    }

    final static boolean a(String param0, int param1, String param2, boolean param3, String param4, byte param5, mk param6) {
        oe var7 = null;
        int var8 = 0;
        oe var9 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (l.field_a == un.field_Hb) {
          var8 = -4 % ((3 - param5) / 42);
          var9 = new oe(ch.field_e, param6);
          var7 = var9;
          ch.field_e.b((iq) (Object) var9, 0);
          if (!ko.e((byte) -94)) {
            L0: {
              un.field_Hb = bf.field_b;
              af.field_H = param4;
              ea.field_e = param1;
              wn.field_d = param0;
              if (!param3) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            ab.field_b = stackIn_7_0 != 0;
            mp.field_f = null;
            mk.field_S = param2;
            return true;
          } else {
            var9.o(16614);
            return true;
          }
        } else {
          return false;
        }
    }

    abstract void a(int param0, int[] param1, boolean param2, byte[] param3, boolean param4);

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = Vertigo2.field_L ? 1 : 0;
        int var6 = 39 % ((param1 - -35) / 40);
        for (var7 = param3; param5 >= var7; var7++) {
            ki.a(-123, param4, vl.field_e[var7], param2, param0);
        }
    }

    bg() {
        ((bg) this).field_d = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_e = new String[]{"Paint Pot", "Coin", "Dynamite", "1-Up", "Jetpack", "Save Star", "Compass"};
        field_b = new nj();
        field_a = "Press any key to close";
    }
}
