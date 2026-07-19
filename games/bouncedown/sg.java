/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sg {
    static String field_b;
    static tj field_a;
    static String field_c;

    public static void a(byte param0) {
        field_c = null;
        if (param0 > -106) {
            field_c = (String) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    abstract long a(int param0);

    abstract int a(int param0, long param1);

    final int b(int param0, long param1) {
        long var4 = 0L;
        var4 = this.a(-32578);
        if (var4 > (long)param0) {
          wh.a(var4, 19406);
          return this.a(param0 ^ -127, param1);
        } else {
          return this.a(param0 ^ -127, param1);
        }
    }

    abstract void a(boolean param0);

    static {
        field_b = "Next";
        field_c = "Names cannot contain consecutive spaces";
    }
}
