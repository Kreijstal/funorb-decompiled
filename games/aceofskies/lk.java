/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends fu implements fq {
    static String field_g;

    final void a(byte param0) {
        if (param0 <= 32) {
            this.a((byte) -14);
            this.field_b.a((byte) -120, (fq) (this));
            return;
        }
        this.field_b.a((byte) -120, (fq) (this));
    }

    lk(wl param0, int param1, byte[] param2, int param3, boolean param4) {
        super(param0, 34962, param2, param3, param4);
    }

    public final int a(int param0) {
        int discarded$0 = 0;
        if (param0 != 6530) {
            discarded$0 = this.a(60);
            return this.field_f;
        }
        return this.field_f;
    }

    public static void c(int param0) {
        field_g = null;
        if (param0 != 34962) {
            field_g = (String) null;
        }
    }

    static {
        field_g = "Password is valid";
    }
}
