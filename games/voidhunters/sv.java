/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sv extends uda {
    static int[] field_f;
    static int field_e;

    final void a(int param0, boolean param1) {
        if (param0 != 5) {
          this.a(91, false);
          this.field_d.c(true, 44);
          return;
        } else {
          this.field_d.c(true, 44);
          return;
        }
    }

    final boolean a(byte param0) {
        int var2 = -118 % ((34 - param0) / 63);
        return true;
    }

    sv(pf param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 5) {
            sv.e(80);
        }
    }

    final void a(int param0) {
        this.field_d.c(false, 75);
        if (param0 != 2543) {
            field_e = 30;
        }
    }

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
            ura var4 = (ura) null;
            this.a((byte) 1, -18, (ura) null);
        }
    }

    final void a(byte param0, int param1, ura param2) {
        if (param0 < 42) {
            return;
        }
        try {
            this.field_d.a(param2, -119);
            this.field_d.h(-127, param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "sv.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        field_f = null;
        if (param0 != 0) {
            field_e = -79;
        }
    }

    static {
        field_e = 0;
    }
}
