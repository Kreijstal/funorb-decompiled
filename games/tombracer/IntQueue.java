/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntQueue {
    private IntrusiveDeque nodes;

    final void add(byte param0, int param1) {
        if (param0 < -112) {
          this.nodes.addLast((byte) -69, new IntNode(param1));
          return;
        }
        this.nodes = (IntrusiveDeque) null;
        this.nodes.addLast((byte) -69, new IntNode(param1));
    }

    final boolean isEmpty(byte param0) {
        if (param0 != -26) {
          return false;
        }
        return this.nodes.isEmpty((byte) 14);
    }

    final static void a(byte param0) {
        int var1 = -1 / ((param0 + 58) / 37);
        MatchStatistics.drawDialogOverlay((byte) 57, true);
    }

    final int poll(int param0) {
        if (this.nodes.isEmpty((byte) 14)) {
          return 0;
        }
        int var2 = -7 / ((32 - param0) / 55);
        return ((IntNode) (this.nodes.removeFirst(72))).value;
    }

    final void clear(int param0) {
        this.nodes.clear(8);
        if (param0 > -63) {
          this.nodes = (IntrusiveDeque) null;
        }
    }

    final int size(int param0) {
        if (param0 != 0) {
          return -61;
        }
        return this.nodes.size((byte) -16);
    }

    public IntQueue() {
        this.nodes = new IntrusiveDeque();
    }

    static {
    }
}
