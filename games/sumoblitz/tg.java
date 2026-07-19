/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static int field_a;

    final static void a(long param0, byte param1) {
        if ((param0 ^ -1L) < -1L) {
          if (param1 >= 72) {
            if (-1L == (param0 % 10L ^ -1L)) {
              br.a(param0 - 1L, (byte) -21);
              br.a(1L, (byte) -21);
              if (Sumoblitz.field_L) {
                br.a(param0, (byte) -21);
                return;
              } else {
                return;
              }
            } else {
              br.a(param0, (byte) -21);
              return;
            }
          } else {
            field_a = 47;
            if (-1L == (param0 % 10L ^ -1L)) {
              br.a(param0 - 1L, (byte) -21);
              br.a(1L, (byte) -21);
              if (!Sumoblitz.field_L) {
                return;
              } else {
                br.a(param0, (byte) -21);
                return;
              }
            } else {
              br.a(param0, (byte) -21);
              return;
            }
          }
        } else {
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
