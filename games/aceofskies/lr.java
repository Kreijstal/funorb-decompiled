/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends lg {
    private byte[] field_w;
    static long field_v;

    final static byte[] a(int param0, String param1) {
        String var3 = null;
        if (param0 != 4688) {
          var3 = (String) null;
          byte[] discarded$2 = lr.a(-91, (String) null);
          return te.field_f.a("", (byte) -71, param1);
        } else {
          return te.field_f.a("", (byte) -71, param1);
        }
    }

    lr() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final void b(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = 2 * param0;
        var4++;
        ((lr) this).field_w[var4] = (byte)-1;
        var5 = 255 & param2;
        ((lr) this).field_w[var4] = (byte)(var5 * 3 >> -750572635);
        if (param1 != -1) {
          field_v = 21L;
          return;
        } else {
          return;
        }
    }

    final byte[] a(int param0, int param1, byte param2, int param3) {
        ((lr) this).field_w = new byte[2 * param3 * param0 * param1];
        if (param2 != -120) {
          return (byte[]) null;
        } else {
          ((lr) this).a(true, param3, param0, param1);
          return ((lr) this).field_w;
        }
    }

    static {
    }
}
