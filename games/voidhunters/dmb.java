/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dmb implements ntb {
    static ri field_b;
    static int field_c;
    static int field_a;

    public void b(byte param0, tv param1) {
        if (param0 <= 54) {
            Object var4 = null;
            boolean discarded$0 = ((dmb) this).a((byte) -58, (tv) null);
        }
    }

    public boolean a(byte param0, tv param1) {
        int var3 = -110 % ((22 - param0) / 59);
        return false;
    }

    public void a(faa param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            phb[] discarded$0 = dmb.a(-64, (byte) 110, (asb) null, -56);
        }
    }

    public void a(tv param0, int param1) {
        if (param1 >= -19) {
            field_b = null;
        }
    }

    public static void a(byte param0) {
        if (param0 > -99) {
            Object var2 = null;
            phb[] discarded$0 = dmb.a(-84, (byte) -24, (asb) null, 25);
            field_b = null;
            return;
        }
        field_b = null;
    }

    public void b(faa param0, int param1) {
        if (param1 > -109) {
            Object var4 = null;
            phb[] discarded$0 = dmb.a(34, (byte) -8, (asb) null, 110);
        }
    }

    final static phb[] a(int param0, byte param1, asb param2, int param3) {
        if (param1 == 75) {
          if (!pa.a(param3, 2, param2, param0)) {
            return null;
          } else {
            return v.b(false);
          }
        } else {
          dmb.a((byte) -84);
          if (!pa.a(param3, 2, param2, param0)) {
            return null;
          } else {
            return v.b(false);
          }
        }
    }

    abstract void a(pe param0, boolean param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ri(7, 0, 1, 1);
    }
}
