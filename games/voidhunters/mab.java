/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mab {
    int field_b;
    static int field_f;
    int[] field_c;
    java.awt.Image field_g;
    static VoidHunters field_a;
    static String field_e;
    static String field_h;
    int field_d;

    abstract void a(int param0, int param1, java.awt.Component param2, byte param3);

    abstract void a(java.awt.Graphics param0, int param1, byte param2, int param3);

    final void a(byte param0) {
        dma.a(this.field_c, this.field_d, this.field_b);
        if (param0 != -108) {
            java.awt.Component var3 = (java.awt.Component) null;
            this.a(-98, 3, (java.awt.Component) null, (byte) -19);
        }
    }

    public static void a(int param0) {
        if (param0 != -23483) {
          mab.a(83);
          field_e = null;
          field_a = null;
          field_h = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          field_h = null;
          return;
        }
    }

    static {
        field_h = "To server list";
        field_e = "Location";
    }
}
