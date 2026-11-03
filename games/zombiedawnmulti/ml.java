/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends UiComponent {
    String field_Kb;
    String field_Nb;
    static String field_Ob;
    UiComponent field_Gb;
    int field_Mb;
    static int field_Jb;
    UiComponent field_Ib;
    static UiComponent field_Lb;
    UiComponent field_Fb;
    String field_Hb;
    String field_Pb;

    final static void a(int param0, int param1, int param2) {
        CipherPacketBuffer var3 = ma.field_a;
        if (param2 == -76) {
          var3.b((byte) -35, param1);
          var3.a(-120, 3);
          var3.a(110, 9);
          var3.a(param0, (byte) -44);
          return;
        }
        ml.c((byte) 99);
        var3.b((byte) -35, param1);
        var3.a(-120, 3);
        var3.a(110, 9);
        var3.a(param0, (byte) -44);
    }

    public static void c(byte param0) {
        field_Ob = null;
        if (param0 != -102) {
          return;
        }
        field_Lb = null;
    }

    ml() {
        super(0L, (UiComponent) null);
    }

    static {
        field_Ob = null;
    }
}
