/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MinimapPoint {
    int x;
    int y;

    final static TickClock createTickClock(int guard) {
        if (guard != 18863) {
          return (TickClock) null;
        }
        return (TickClock) ((Object) new NanoTickClock());
    }

    MinimapPoint(int param0, int param1) {
        this.y = param1;
        this.x = param0;
    }

    static {
    }
}
