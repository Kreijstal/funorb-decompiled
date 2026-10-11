/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hi extends al {
    int field_x;
    static int field_v;
    int field_B;
    int field_C;
    static int field_z;
    int field_u;
    int field_y;
    int field_A;
    static String field_w;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.b(-76, param3, param0 << 5, param1 << 8, param2);
        if (param4 != -1271909436) {
          this.a(-8, 64, 41, -87, -94);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_w = null;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_x << 3;
        int var7 = this.field_A << 3;
        param1 = (15 & var6) + (param1 << 4);
        param4 = (15 & var7) + (param4 << 4);
        if (param0 <= -68) {
          this.a(var6, var7, param1, param4, param3, param2);
          return;
        }
        this.field_B = -126;
        this.a(var6, var7, param1, param4, param3, param2);
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    hi() {
    }

    static {
        field_v = 50;
        field_w = "Player names can be up to 12 letters, numbers and underscores";
    }
}
