/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ou {
    private qea field_c;
    static int[] field_e;
    int field_a;
    private int[] field_d;
    private int field_b;

    public static void a(int param0) {
        field_e = null;
        if (param0 < 98) {
            ou.a(56);
        }
    }

    final boolean b(byte param0) {
        if (param0 >= -23) {
            return false;
        }
        return ((ou) this).field_c.a(2, 0) == 0 ? true : false;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        ((ou) this).field_c = new qea(new int[1]);
        ((ou) this).field_d = new int[((ou) this).field_a];
        for (var2 = 0; var2 < ((ou) this).field_a; var2++) {
            ((ou) this).field_d[var2] = ((ou) this).field_c.b(95);
        }
        var2 = 0;
    }

    abstract wea a(byte param0);

    ou(int param0, int param1) {
        ((ou) this).field_a = param0;
        ((ou) this).field_b = param1;
        this.b(-125);
    }

    static {
    }
}
