/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bka {
    private IntrusiveDeque field_a;

    final void a(byte param0, int param1) {
        if (param0 < -112) {
          this.field_a.addLast((byte) -69, new al(param1));
          return;
        }
        this.field_a = (IntrusiveDeque) null;
        this.field_a.addLast((byte) -69, new al(param1));
    }

    final boolean b(byte param0) {
        if (param0 != -26) {
          return false;
        }
        return this.field_a.isEmpty((byte) 14);
    }

    final static void a(byte param0) {
        int var1 = -1 / ((param0 + 58) / 37);
        MatchStatistics.a((byte) 57, true);
    }

    final int a(int param0) {
        if (this.field_a.isEmpty((byte) 14)) {
          return 0;
        }
        int var2 = -7 / ((32 - param0) / 55);
        return ((al) (this.field_a.removeFirst(72))).field_i;
    }

    final void c(int param0) {
        this.field_a.clear(8);
        if (param0 > -63) {
          this.field_a = (IntrusiveDeque) null;
        }
    }

    final int b(int param0) {
        if (param0 != 0) {
          return -61;
        }
        return this.field_a.size((byte) -16);
    }

    public bka() {
        this.field_a = new IntrusiveDeque();
    }

    static {
    }
}
