/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class efb implements dja {
    static vfa field_b;
    static ri field_c;
    static llb field_a;

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_c = (ri) null;
            return (tv[]) ((Object) new wm[param1]);
        }
        return (tv[]) ((Object) new wm[param1]);
    }

    public final tv a(byte param0) {
        int var2 = -65 / ((param0 - -64) / 50);
        return (tv) ((Object) new wm());
    }

    public static void b(byte param0) {
        if (param0 != -80) {
          field_c = (ri) null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    static {
        field_b = null;
        field_c = new ri(4, 1, 1, 1);
    }
}
