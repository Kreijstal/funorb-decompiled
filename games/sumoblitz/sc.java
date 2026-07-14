/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends ua implements pv {
    static qr field_q;
    private byte field_p;
    static int[] field_o;

    final int g(int param0) {
        if (param0 != 34962) {
            ((sc) this).field_p = (byte) -127;
            return ((sc) this).field_p;
        }
        return ((sc) this).field_p;
    }

    public final void b(int param0) {
        super.b(param0);
    }

    public final jaclib.memory.Buffer a(int param0, boolean param1) {
        if (param0 != 7454) {
          int discarded$2 = ((sc) this).g(127);
          return super.a(param1, 2, ((sc) this).field_f.field_Bc);
        } else {
          return super.a(param1, 2, ((sc) this).field_f.field_Bc);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_o = null;
        field_q = null;
    }

    public final boolean a(int param0) {
        if (param0 != 22957) {
          field_q = null;
          return super.a(((sc) this).field_f.field_Bc, (byte) 92);
        } else {
          return super.a(((sc) this).field_f.field_Bc, (byte) 92);
        }
    }

    public final boolean a(int param0, byte param1, int param2) {
        ((sc) this).field_p = (byte)param0;
        if (param1 != -35) {
          ((sc) this).field_p = (byte) -114;
          super.a((byte) -103, param2);
          return true;
        } else {
          super.a((byte) -103, param2);
          return true;
        }
    }

    sc(on param0, boolean param1) {
        super(param0, 34962, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new qr();
        field_o = new int[2];
    }
}
