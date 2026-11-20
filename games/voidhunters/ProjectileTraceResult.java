/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProjectileTraceResult {
    int fraction;
    ShipComponent component;

    final boolean hasHit(byte param0) {
        if (param0 >= 61) {
          return this.component != null ? true : false;
        }
        this.reset(33);
        return this.component != null ? true : false;
    }

    final void reset(int param0) {
        this.fraction = param0;
        this.component = null;
    }

    public ProjectileTraceResult() {
        this.reset(2147483647);
    }

    static {
    }
}
