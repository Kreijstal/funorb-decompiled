/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    private tl field_b;
    static int field_a;

    final static rh a(al param0, boolean param1) {
        if (param1) {
            field_a = -84;
            return w.a(-23159, su.a(param0, 100, 96));
        }
        return w.a(-23159, su.a(param0, 100, 96));
    }

    final void a(boolean param0) {
        if (param0) {
          if (((am) this).field_b != null) {
            ((am) this).field_b.a(4665);
            return;
          } else {
            return;
          }
        } else {
          ((am) this).field_b = (tl) null;
          if (((am) this).field_b == null) {
            return;
          } else {
            ((am) this).field_b.a(4665);
            return;
          }
        }
    }

    am(boolean param0) {
    }

    static {
    }
}
