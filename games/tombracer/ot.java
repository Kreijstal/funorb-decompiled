/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ot extends lba {
    static String field_t;
    static int field_v;
    private byte[] field_u;
    static String field_w;

    ot() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    public static void b(byte param0) {
        field_w = null;
        field_t = null;
        if (param0 > -66) {
            field_w = null;
        }
    }

    final byte[] a(int param0, boolean param1, int param2, int param3) {
        Object var6 = null;
        ((ot) this).field_u = new byte[param3 * (param0 * (param2 * 2))];
        ((ot) this).a(param0, param2, param3, (byte) -93);
        if (!param1) {
          var6 = null;
          iu discarded$2 = ot.a(13, 72, (cn) null, false);
          return ((ot) this).field_u;
        } else {
          return ((ot) this).field_u;
        }
    }

    final void a(boolean param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = param2 * 2;
        var4++;
        ((ot) this).field_u[var4] = (byte)-1;
        var5 = 255 & param1;
        ((ot) this).field_u[var4] = (byte)(var5 * 3 >> -1328451387);
        if (param0) {
          ot.b((byte) 20);
          return;
        } else {
          return;
        }
    }

    final static iu a(int param0, int param1, cn param2, boolean param3) {
        if (!jna.a(false, param1, param0, param2)) {
            return null;
        }
        if (!param3) {
            return null;
        }
        return je.a((byte) 69);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Accept rematch";
        field_v = 256;
        field_w = "Hide game chat";
    }
}
