/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    private ue field_b;
    private gd field_f;
    static String field_a;
    static String field_c;
    static String field_d;
    static int field_e;
    private ue field_h;
    static String field_g;

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        field_d = null;
        field_c = null;
        if (param0 != -32769) {
          field_e = -110;
        }
    }

    private ta() throws Throwable {
        throw new Error();
    }

    final ff a(int param0, int param1) {
        ff var3;
        byte[] var4;
        ff var3Lifetime1;
        var3 = (ff) (this.field_f.a((long)param0, 106));
        if (var3 != null) {
          return var3;
        }
        if (param1 >= ~param0) {
          var4 = this.field_h.a(1, true, 32767 & param0);
        } else {
          var4 = this.field_b.a(1, true, param0);
        }
        var3Lifetime1 = new ff();
        if (var4 != null) {
          var3Lifetime1.a(new rb(var4), 125);
        }
        if (param0 >= 32768) {
          var3Lifetime1.d(-73);
        }
        this.field_f.a(var3Lifetime1, 1, (long)param0);
        return var3Lifetime1;
    }

    final static void a(hl param0, int param1) {
        try {
          ja.field_e = param0;
          int var2_int = -12 / ((-36 - param1) / 50);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ta.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Player";
        field_d = "Cancel";
        field_a = "EASY";
        field_g = "Music: ";
    }
}
