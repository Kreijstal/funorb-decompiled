/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mg extends df implements el {
    private bl field_D;
    static String field_F;
    static dj field_C;
    static eg field_E;

    mg(int param0, int param1, int param2, int param3, pf param4) {
        super(param0, param1, param2, param3, param4);
    }

    abstract int h(int param0);

    public static void i(int param0) {
        if (param0 <= 34) {
          field_E = (eg) null;
          field_F = null;
          field_C = null;
          field_E = null;
          return;
        } else {
          field_F = null;
          field_C = null;
          field_E = null;
          return;
        }
    }

    void a(bl param0, byte param1) {
        try {
            this.field_D = param0;
            int var3_int = -119 / ((63 - param1) / 47);
            this.field_D.field_h = (mg) (this);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "mg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract int g(int param0);

    public final pd a(int param0) {
        if (param0 != 0) {
            field_C = (dj) null;
            return (pd) ((Object) this.field_D);
        }
        return (pd) ((Object) this.field_D);
    }

    abstract int e(boolean param0);

    abstract boolean j(int param0);

    static {
        field_F = "Curve of Sight";
    }
}
