/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    final static void a(int param0, byte param1) {
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (5 <= gj.a((byte) -84, 10)) {
          if (5 > gj.a((byte) -84, 10)) {
            fb.field_a = fb.field_a - param0;
          } else {
            ha.field_f = ha.field_f - param0;
          }
          if (gj.a((byte) -84, 10) < 5) {
            ts.field_a = ts.field_a - param0;
          } else {
            kn.field_b = kn.field_b - param0;
          }
        } else {
          if (gj.a((byte) -84, 10) >= 5) {
            kn.field_b = kn.field_b + param0;
          } else {
            ts.field_a = ts.field_a + param0;
          }
          if (gj.a((byte) -84, 10) >= 5) {
            ha.field_f = ha.field_f + param0;
          } else {
            fb.field_a = fb.field_a + param0;
          }
        }
        if (param1 < -92) {
          return;
        }
        so.a(-126, (byte) 36);
    }

    final static boolean a(byte param0) {
        int var1 = 59 / ((50 - param0) / 50);
        return sr.field_d;
    }

    static {
    }
}
