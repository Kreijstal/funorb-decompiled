/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn implements dja {
    static int field_a;

    public final tv a(byte param0) {
        int var2 = 95 % ((param0 - -64) / 50);
        return (tv) ((Object) new hna());
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        if (!li.field_i) {
          if (param2 <= 82) {
            bn.a(-67, -4, (byte) 25, 43);
            return;
          } else {
            return;
          }
        } else {
          mmb.field_d[param0].a(param1, param3);
          if (param2 > 82) {
            return;
          } else {
            bn.a(-67, -4, (byte) 25, 43);
            return;
          }
        }
    }

    public final tv[] a(int param0, int param1) {
        tv discarded$0 = null;
        if (param0 != 11995) {
            discarded$0 = this.a((byte) 20);
            return (tv[]) ((Object) new hna[param1]);
        }
        return (tv[]) ((Object) new hna[param1]);
    }

    static {
        field_a = 128;
        lp discarded$0 = new lp();
    }
}
