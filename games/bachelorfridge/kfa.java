/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kfa extends k {
    private int field_k;

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        if (param0 != -71) {
          return;
        } else {
          L0: {
            var4 = param2;
            if (var4 == 0) {
              ((kfa) this).field_k = (param1.b(param0 + 16712006) << 2028433228) / 255;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    private kfa(int param0) {
        super(0, true);
        ((kfa) this).field_k = 4096;
        ((kfa) this).field_k = param0;
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        if (param1 != 0) {
          L0: {
            ((kfa) this).field_k = 54;
            var4 = ((kfa) this).field_j.a(param0, param1 + -1);
            var3 = var4;
            if (((kfa) this).field_j.field_m) {
              bl.a(var4, 0, hh.field_d, ((kfa) this).field_k);
              break L0;
            } else {
              break L0;
            }
          }
          return var4;
        } else {
          L1: {
            var4 = ((kfa) this).field_j.a(param0, param1 + -1);
            var3 = var4;
            if (((kfa) this).field_j.field_m) {
              bl.a(var4, 0, hh.field_d, ((kfa) this).field_k);
              break L1;
            } else {
              break L1;
            }
          }
          return var4;
        }
    }

    final static ce a(lu param0, int param1, int param2) {
        Object var4 = null;
        if (param1 != 4096) {
          var4 = null;
          ce discarded$2 = kfa.a((lu) null, -110, 53);
          return new ce(param2, param0);
        } else {
          return new ce(param2, param0);
        }
    }

    public kfa() {
        this(4096);
    }

    static {
    }
}
