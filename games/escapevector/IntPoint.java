/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntPoint {
    static SystemTaskService field_d;
    static Sprite field_b;
    int y;
    int x;

    final void set(int x, int guard, int y) {
        if (guard <= 107) {
          return;
        }
        this.y = y;
        this.x = x;
    }

    public static void a(int param0) {
        if (param0 != -3217) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    IntPoint(int x, int y) {
        this.y = y;
        this.x = x;
    }

    static {
    }
}
